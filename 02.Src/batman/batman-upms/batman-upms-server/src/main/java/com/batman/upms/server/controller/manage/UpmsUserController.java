package com.batman.upms.server.controller.manage;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.batman.common.base.BaseController;
import com.batman.upms.dao.model.UpmsOrganization;
import com.batman.upms.rpc.api.UpmsOrganizationService;

import io.swagger.annotations.ApiOperation;

@Controller
@RequestMapping("/manage/user")
public class UpmsUserController extends BaseController {
	@Autowired
    private UpmsOrganizationService upmsOrganizationService;

    @ApiOperation(value = "用户首页")
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
    
    @RequestMapping(value = "/init", method = RequestMethod.GET)
	@ResponseBody
	public Object init() {
//		UpmsOrganizationExample example = new UpmsOrganizationExample();
//
//		UpmsOrganizationExample.Criteria criteria = example.createCriteria();
//
//		criteria.andDeleteflagEqualTo(0);

		// List<UpmsOrganization> organizations =
		// upmsOrganizationService.selectByExample(example);

		List<UpmsOrganization> organizations = new ArrayList<UpmsOrganization>();

		for (int i = 1; i < 6; i++) {
			UpmsOrganization upmsOrganization = new UpmsOrganization();
			
			String s1 = String.valueOf(i);
			String s2 = String.valueOf(i - 1);
			upmsOrganization.setUuid(s1);
			upmsOrganization.setName("test" + i);
			upmsOrganization.setParentUuid(s2);
			organizations.add(upmsOrganization);
		}
		


		return organizations;
	}
}
