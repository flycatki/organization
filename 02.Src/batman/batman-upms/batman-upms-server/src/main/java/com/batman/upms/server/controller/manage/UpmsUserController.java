package com.batman.upms.server.controller.manage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.batman.common.base.BaseController;
import com.batman.upms.rpc.api.UpmsOrganizationService;

import io.swagger.annotations.ApiOperation;

@Controller
@RequestMapping("/manage/user")
public class UpmsUserController extends BaseController {
	@Autowired
    private UpmsOrganizationService upmsOrganizationService;

    @ApiOperation(value = "角色首页")
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


        return "manage/user/index.page";
    }
}
