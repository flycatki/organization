package com.batman.upms.server.controller.manage;

import com.batman.common.base.BaseController;
import com.batman.upms.dao.model.UpmsOrganization;
import com.batman.upms.dao.model.UpmsOrganizationExample;
import com.batman.upms.rpc.api.UpmsOrganizationService;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.UUID;

@Controller
@RequestMapping("/manage/organization")
public class UpmsOrganizationController extends BaseController {

    @Autowired
    private UpmsOrganizationService upmsOrganizationService;

    @ApiOperation(value = "组织首页")
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index() {

/*        UpmsOrganization upmsOrganization = new UpmsOrganization();
        upmsOrganization.setUuid(UUID.randomUUID().toString());


        int count = upmsOrganizationService.insertSelective(upmsOrganization);

        UpmsOrganizationExample example = new UpmsOrganizationExample();

        UpmsOrganizationExample.Criteria criteria = example.createCriteria();

        criteria.andDeleteflagEqualTo(0)
                .andIdEqualTo("0001");
                
        upmsOrganizationService.selectByExample(example);*/


        return "manage/organization/index.page";
    }
}
