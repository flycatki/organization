package com.batman.upms.server.controller.manage;

import com.batman.common.base.BaseController;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/manage/organization")
public class UpmsOrganizationController extends BaseController {

    @ApiOperation(value = "组织首页")
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index() {
        return "manage/organization/index.page";
    }
}
