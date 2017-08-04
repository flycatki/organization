package com.batman.upms.server.controller;

import com.batman.common.base.BaseController;
import com.batman.common.util.RedisUtil;
import org.apache.commons.lang.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.net.URLEncoder;

@Controller
@RequestMapping("/sso")
public class SSOController extends BaseController {

    private final static Logger _log = LoggerFactory.getLogger(SSOController.class);

    private final static String BATMAN_UPMS_SERVER_SESSION_ID = "batman-upms-server-session-id";

    private final static String BATMAN_UPMS_SERVER_SESSION_IDS = "batman-upms-server-session-ids";

    private final static String BATMAN_UPMS_SEVER_CODE = "batman-upms-server-code";

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String inde(HttpServletRequest request) throws Exception {
        String appid = request.getParameter("appid");
        String backurl = request.getParameter("backurl");
        if (StringUtils.isBlank(appid)) {
            throw new RuntimeException("无效访问！");
        }
        return "redirect:/sso/login?backurl=" + URLEncoder.encode(backurl, "utf-8");
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(HttpServletRequest request) {
        Subject subject = SecurityUtils.getSubject();
        Session session = subject.getSession();
        String serverSessionId = session.getId().toString();
        //判断是否已经登录，如果已经登录，跳回
        String code = RedisUtil.get(BATMAN_UPMS_SERVER_SESSION_ID + "_" + serverSessionId);
        //code校验
        if (StringUtils.isNotBlank(code)) {
            String backurl = request.getParameter("backurl");
            String username = (String) subject.getPrincipal();
            if (StringUtils.isBlank(backurl)) {
                backurl = "/";
            } else {
                if (backurl.contains("?")) {
                    backurl += "&upms_code=" + code + "&upms_username=" + username;
                } else {
                    backurl += "?upms_code=" + code + "&upms_username=" + username;
                }
            }
            _log.debug("认证中心帐号通过，带code回跳：{}", backurl);
            return "redirect:" + backurl;
        }
        return "/sso/login.jsp";
    }
}
