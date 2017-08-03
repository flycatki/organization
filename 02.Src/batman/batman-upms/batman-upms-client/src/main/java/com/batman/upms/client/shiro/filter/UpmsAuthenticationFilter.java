package com.batman.upms.client.shiro.filter;

import com.batman.common.util.PropertiesFileUtil;
import org.apache.commons.lang.StringUtils;
import org.apache.shiro.web.filter.authc.AuthenticationFilter;
import org.apache.shiro.web.util.WebUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
                .append(PropertiesFileUtil.getInstance("batman-upms-client").get("batman.upms.appId"));
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
}
