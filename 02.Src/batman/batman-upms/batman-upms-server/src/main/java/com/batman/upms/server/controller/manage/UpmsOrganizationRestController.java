package com.batman.upms.server.controller.manage;

import com.baidu.unbiz.fluentvalidator.ComplexResult;
import com.baidu.unbiz.fluentvalidator.FluentValidator;
import com.baidu.unbiz.fluentvalidator.ResultCollectors;
import com.batman.common.base.BaseController;
import com.batman.common.validator.LengthValidator;
import com.batman.upms.common.constant.UpmsResult;
import com.batman.upms.common.constant.UpmsResultConstant;
import com.batman.upms.dao.model.UpmsOrganization;
import com.batman.upms.dao.model.UpmsOrganizationExample;
import com.batman.upms.rpc.api.UpmsOrganizationService;
import io.swagger.annotations.ApiOperation;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/manage/organization")
public class UpmsOrganizationRestController extends BaseController {

    @Autowired
    private UpmsOrganizationService upmsOrganizationService;

    @ApiOperation(value = "新增组织")
    @ResponseBody
    //@RequiresPermissions("upms:organization:create")
    @RequestMapping(value = "/rest/create", method = RequestMethod.POST)
    public Object create(@RequestParam(value="organizationName", required=true) String organizationName,HttpServletRequest request) {

        UpmsOrganization upmsOrganization = new UpmsOrganization();
        upmsOrganization.setName(organizationName);
        upmsOrganization.setParentUuid(String.valueOf(request.getParameter("parentUuid")));
        upmsOrganization.setUuid(UUID.randomUUID().toString().replaceAll("-", ""));
        
        ComplexResult result = FluentValidator.checkAll()
                .on(upmsOrganization.getName(), new LengthValidator(1, 20, "名称"))
                .doValidate()
                .result(ResultCollectors.toComplex());
        if (!result.isSuccess()) {
            return new UpmsResult(UpmsResultConstant.INVALID_LENGTH, result.getErrors());
        }
        long time = System.currentTimeMillis();
        //upmsOrganization.setCtime(time);
        int count = upmsOrganizationService.insertSelective(upmsOrganization);
        return new UpmsResult(UpmsResultConstant.SUCCESS, count);
    }

    //@RequiresPermissions("upms:organization:read")
	@RequestMapping(value = "/rest/init", method = RequestMethod.GET)
	@ResponseBody
	public Object init() {
		UpmsOrganizationExample example = new UpmsOrganizationExample();

		UpmsOrganizationExample.Criteria criteria = example.createCriteria();

		criteria.andDeleteflagEqualTo(0);

		List<UpmsOrganization> organizations = upmsOrganizationService.selectByExample(example);

		return organizations;
	}
}
