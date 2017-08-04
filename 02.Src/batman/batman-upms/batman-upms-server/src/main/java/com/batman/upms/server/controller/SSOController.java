package com.batman.upms.server.controller;

import com.batman.common.base.BaseController;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;
import java.net.URLEncoder;

public class SSOController extends BaseController {

    private final static Logger _log = LoggerFactory.getLogger(SSOController.class);

    private final static String BATMAN_UPMS_SERVER_SESSION_ID = "batman-upms-server-session-id";

    private final static String BATMAN_UPMS_SERVER_SESSION_IDS = "batman-upms-server-session-ids";

    private final static String BATMAN_UPMS_SEVER_CODE = "batman-upms-server-code";

    public String inde(HttpServletRequest request) throws Exception {
        String appid = request.getParameter("appid");
        String backurl = request.getParameter("backurl");
        if (StringUtils.isBlank(appid)) {
            throw new RuntimeException("无效访问！");
        }
        return "redirect:/sso/login?backurl=" + URLEncoder.encode(backurl, "utf-8");
    }
}
