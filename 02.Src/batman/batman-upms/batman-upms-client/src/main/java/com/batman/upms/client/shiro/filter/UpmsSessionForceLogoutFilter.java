package com.batman.upms.client.shiro.filter;

import org.apache.shiro.session.Session;
import org.apache.shiro.web.filter.AccessControlFilter;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class UpmsSessionForceLogoutFilter extends AccessControlFilter {
    @Override
    protected boolean isAccessAllowed(ServletRequest servletRequest, ServletResponse servletResponse, Object o) throws Exception {
        Session session = getSubject(servletRequest, servletResponse).getSession(false);
        if(session == null) {
            return true;
        }
        boolean forceout = session.getAttribute("FORCE_LOGOUT") == null;
        return  forceout;
    }

    @Override
    protected boolean onAccessDenied(ServletRequest servletRequest, ServletResponse servletResponse) throws Exception {
        return false;
    }
}
