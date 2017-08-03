package com.batman.upms.client.shiro.session;

import com.batman.common.util.RedisUtil;
import com.batman.upms.client.shiro.util.SerializableUtil;
import org.apache.shiro.session.Session;
import org.apache.shiro.session.mgt.eis.CachingSessionDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Serializable;

public class UpmsSessionDao extends CachingSessionDAO {

    private static Logger _log = LoggerFactory.getLogger(UpmsSessionDao.class);

    //会话key
    private final static String BATMAN_UPMS_SHIRO_SESSION_ID = "batman-upms-shiro-session-id";
    //全局会话key
    private final static String BATMAN_UPMS_SERVER_SESSION_ID = "batman-upms-server-session-id";
    //全局会话列表key
    private final static String BATMAN_UPMS_SERVER_SESSION_IDS = "batman-upms-server-session-ids";
    //局部会话key
    private final static String BATMAN_UPMS_SERVER_CODE = "batman-upms-server-code";
    //单点同一个code所有局部会话key
    private final static String BATMAN_UPMS_CLIENT_SESSION_ID = "batman-upms-client-session-id";



    @Override
    protected void doUpdate(Session session) {

    }

    @Override
    protected void doDelete(Session session) {

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
        return null;
    }
}
