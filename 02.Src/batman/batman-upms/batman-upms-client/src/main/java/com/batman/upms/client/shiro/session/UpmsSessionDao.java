package com.batman.upms.client.shiro.session;

import com.batman.common.util.RedisUtil;
import com.batman.upms.client.shiro.util.SerializableUtil;
import com.batman.upms.common.constant.UpmsConstant;
import org.apache.commons.lang.ObjectUtils;
import org.apache.shiro.session.Session;
import org.apache.shiro.session.mgt.ValidatingSession;
import org.apache.shiro.session.mgt.eis.CachingSessionDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import redis.clients.jedis.Jedis;
import sun.plugin2.os.windows.SECURITY_ATTRIBUTES;

import java.io.Serializable;
import java.util.Set;

public class UpmsSessionDao extends CachingSessionDAO {

    private static Logger _log = LoggerFactory.getLogger(UpmsSessionDao.class);

    //会话key
    private final static String BATMAN_UPMS_SHIRO_SESSION_ID = "batman-upms-shiro-session-id";
    //全局会话key
    private final static String BATMAN_UPMS_SERVER_SESSION_ID = "batman-upms-server-session-id";
    //全局会话列表key
    private final static String BATMAN_UPMS_SERVER_SESSION_IDS = "batman-upms-server-session-ids";
    //code校验key
    private final static String BATMAN_UPMS_SERVER_CODE = "batman-upms-server-code";
    //局部会话key
    private final static String BATMAN_UPMS_CLIENT_SESSION_ID = "batman-upms-client-session-id";
    //单点同一个code所有局部会话key
    private final static String BATMAN_UPMS_CLIENT_SESSION_IDS = "batman-upms-client-session-ids";



    @Override
    protected void doUpdate(Session session) {
        if (session instanceof ValidatingSession && !((ValidatingSession) session).isValid()) {
            return;
        }
        UpmsSession upmsSession = (UpmsSession) session;
        UpmsSession cacheUpmsSession = (UpmsSession) doReadSession(session.getId());
        if (null != cacheUpmsSession) {
            upmsSession.setStatus(cacheUpmsSession.getStatus());
            upmsSession.setAttribute("FORCE_LOGOUT", cacheUpmsSession.getAttribute("FORCE_LOGOUT"));
        }
        RedisUtil.set(BATMAN_UPMS_SHIRO_SESSION_ID + "_" + session.getId(), SerializableUtil.serialize(session), (int) session.getTimeout() / 1000);
        _log.debug("doUpdate >>>>> sessionId={}", session.getId());
    }

    @Override
    protected void doDelete(Session session) {
        String sessionId = session.getId().toString();
        String upmsType = ObjectUtils.toString(session.getAttribute(UpmsConstant.UPMS_TYPE));
        if ("client".equals(upmsType)) {
            //删除局部会话和同一code注册的局部会话
            String code = RedisUtil.get(BATMAN_UPMS_CLIENT_SESSION_ID + "_" + sessionId);
            Jedis jedis = RedisUtil.getJedis();
            jedis.del(BATMAN_UPMS_CLIENT_SESSION_ID + "_" + sessionId);
            jedis.srem(BATMAN_UPMS_CLIENT_SESSION_ID + "_" + code, sessionId);
            jedis.close();
        }
        if ("server".equals(upmsType)) {
            //当前全局会话code
            String code = RedisUtil.get(BATMAN_UPMS_SERVER_SESSION_ID + "_" + sessionId);
            //清除全局会话
            RedisUtil.remove(BATMAN_UPMS_SERVER_SESSION_ID + "_" + sessionId);
            //清除code校验值
            RedisUtil.remove(BATMAN_UPMS_SERVER_CODE + "_" + code);
            //清除所有局部会话
            Jedis jedis = RedisUtil.getJedis();
            Set<String> clientSessionIds = jedis.smembers(BATMAN_UPMS_CLIENT_SESSION_IDS + "_" + code);
            for (String clientSessionId : clientSessionIds) {
                jedis.del(BATMAN_UPMS_CLIENT_SESSION_ID + "_" + clientSessionId);
                jedis.srem(BATMAN_UPMS_CLIENT_SESSION_IDS + "_" + code, clientSessionId);
            }
            _log.debug("当前code={}, 对应的注册系统个数：{}个", code, jedis.scard(BATMAN_UPMS_CLIENT_SESSION_IDS + "_" + code));
            jedis.close();
            RedisUtil.lrem(BATMAN_UPMS_SERVER_SESSION_IDS, 1, sessionId);
        }
        //删除session
        RedisUtil.remove(BATMAN_UPMS_SHIRO_SESSION_ID + "_" + sessionId);;
        _log.debug("doDelete >>>>> sessionId={}", sessionId);
    }

    @Override
    protected Serializable doCreate(Session session) {
        Serializable sessionid = generateSessionId(session);
        assignSessionId(session, sessionid);
        RedisUtil.set(BATMAN_UPMS_SHIRO_SESSION_ID + "_" + sessionid, SerializableUtil.serialize(session), (int) session.getTimeout() / 1000);
        _log.debug("doCreate >>>>> sessionId={}", sessionid);
        return sessionid;
    }

    @Override
    protected Session doReadSession(Serializable sessionId) {
        String session = RedisUtil.get(BATMAN_UPMS_SHIRO_SESSION_ID + "_" + sessionId);
        _log.debug("doReadSession >>>>> sessionId={}", sessionId);
        return SerializableUtil.deserialize(session);
    }

    /**
     * 更改在线状态
     *
     * @param sessionId
     * @param onlineStatus
     */
    public void updateStatus(Serializable sessionId, UpmsSession.OnlineStatus onlineStatus) {
        UpmsSession session = (UpmsSession) doReadSession(sessionId);
        if (null == session) {
            return;
        }
        session.setStatus(onlineStatus);
        RedisUtil.set(BATMAN_UPMS_SHIRO_SESSION_ID + "_" + session.getId(), SerializableUtil.serialize(session), (int) session.getTimeout() / 1000);
    }
}
