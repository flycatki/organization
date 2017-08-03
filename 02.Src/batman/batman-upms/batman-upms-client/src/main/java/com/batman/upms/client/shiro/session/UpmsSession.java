package com.batman.upms.client.shiro.session;

import org.apache.shiro.session.mgt.SimpleSession;

public class UpmsSession extends SimpleSession {
    public static enum OnlineStatus {
        on_line("在线"), off_line("离线"), force_layout("强制退出");
        private final String info;

        private OnlineStatus(String info) {
            this.info = info;
        }

        private String getInfo() {
            return info;
        }
    }

    private String userAgent;

    private OnlineStatus status = OnlineStatus.off_line;

    public String getUserAgent() {
        return userAgent;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    public OnlineStatus getStatus() {
        return status;
    }

    public void setStatus(OnlineStatus status) {
        this.status = status;
    }
}
