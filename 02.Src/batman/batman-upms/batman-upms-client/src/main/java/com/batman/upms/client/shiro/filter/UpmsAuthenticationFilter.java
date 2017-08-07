package com.batman.upms.client.shiro.filter;

import com.batman.common.util.PropertiesFileUtil;
import com.batman.common.util.RedisUtil;
import org.apache.commons.lang.StringUtils;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.authc.AuthenticationFilter;
import org.apache.shiro.web.util.WebUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import redis.clients.jedis.Jedis;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import java.net.URLEncoder;

public class UpmsAuthenticationFilter extends AuthenticationFilter {

    private final static Logger _log = LoggerFactory.getLogger(UpmsAuthenticationFilter.class);
    //局部会话key
    private final static String BATMAN_UPMS_CLIENT_SESSION_ID = "batman-upms-client-session-id";
    //单点同一个code所有局部会话key
    private final static String BATMAN_UPMS_CLIENT_SESSION_IDS = "batman-upms-client-session-id";

    @Override
    protected boolean isAccessAllowed(ServletRequest request, ServletResponse response, Object mappedValue) {
        Subject subject = getSubject(request, response);
        Session session = subject.getSession();
        //判断请求类型
        String upmsType = PropertiesFileUtil.getInstance("batman-upms-client").get("batman.upms.type");
        if ("client".equals(upmsType)) {
            return validateClient(request, response);
        }
        if ("server".equals(upmsType)) {
            return subject.isAuthenticated();
        }

        return false;
    }

    @Override
    protected boolean onAccessDenied(ServletRequest servletRequest, ServletResponse servletResponse) throws Exception {
        StringBuffer sso_server_url = new StringBuffer(PropertiesFileUtil.getInstance("batman-upms-client").get("batman.upms.sso.server.url"));

        //需要登录
        String upmsType = PropertiesFileUtil.getInstance("batman-upms-client").get("batman.upms.type");
        if ("server".equals(upmsType)) {
            WebUtils.toHttp(servletResponse).sendRedirect(sso_server_url.append("/sso/login").toString());
            return false;
        }
        sso_server_url.append("/sso/index").append("?").append("appid")
                .append("=")
                .append(PropertiesFileUtil.getInstance("batman-upms-client").get("batman.upms.appID"));
        //回跳地址
        HttpServletRequest httpServletRequest = WebUtils.toHttp(servletRequest);
        StringBuffer backurl = httpServletRequest.getRequestURL();
        String queryString = httpServletRequest.getQueryString();
        if (StringUtils.isNotBlank(queryString)) {
            backurl.append("?").append(queryString);
        }
        sso_server_url.append("&").append("backurl").append("=").append(URLEncoder.encode(backurl.toString(), "utf-8"));
        WebUtils.toHttp(servletResponse).sendRedirect(sso_server_url.toString());
        return false;
    }

    /**
     * 认证中心登录成功带回code
     * @param request
     * @param response
     * @return
     */
    private boolean validateClient(ServletRequest request, ServletResponse response) {
        Subject subject = getSubject(request, response);
        Session session = subject.getSession();
        String sessionId = session.getId().toString();
        int timeOut = (int) session.getTimeout() / 1000;
        //判断局部会话是否登录
        String cacheClientSession = RedisUtil.get(BATMAN_UPMS_CLIENT_SESSION_ID + "_" + sessionId);
        if (StringUtils.isNotBlank(cacheClientSession)) {
            //更新code有效期
            RedisUtil.set(BATMAN_UPMS_CLIENT_SESSION_ID + "_" + sessionId, cacheClientSession, timeOut);
            Jedis jedis = RedisUtil.getJedis();
            jedis.expire(BATMAN_UPMS_CLIENT_SESSION_IDS + "_" + cacheClientSession, timeOut);
            jedis.close();
            //移除url中的code参数
            if (null != request.getParameter("code")) {
                //String backUrl =
            }
        }
        return false;
    }
}
