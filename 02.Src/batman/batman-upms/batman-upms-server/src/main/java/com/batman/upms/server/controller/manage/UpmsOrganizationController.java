package com.batman.upms.server.controller.manage;

import com.baidu.unbiz.fluentvalidator.ComplexResult;
import com.baidu.unbiz.fluentvalidator.FluentValidator;
import com.baidu.unbiz.fluentvalidator.ResultCollectors;
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
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
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
    
    @RequestMapping(value = "/init", method = RequestMethod.POST)
    @ResponseBody
    public Object init(){
    	UpmsOrganizationExample example = new UpmsOrganizationExample();

        UpmsOrganizationExample.Criteria criteria = example.createCriteria();
        
        criteria.andDeleteflagEqualTo(0);
        
        List<UpmsOrganization> organizations = upmsOrganizationService.selectByExample(example);
    	
    	return organizations;
    }

}
