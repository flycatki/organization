package com.batman.admin.site.controller;

import com.batman.upms.rpc.api.UpmsUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/site/dashboard")
public class AdminDashboardController {

    @Autowired
    private UpmsUserService upmsUserService;

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index() {
        return "";
    }
}
