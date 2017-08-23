package com.batman.upms.server.controller.manage;

import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.baidu.unbiz.fluentvalidator.ComplexResult;
import com.baidu.unbiz.fluentvalidator.FluentValidator;
import com.baidu.unbiz.fluentvalidator.ResultCollectors;
import com.batman.common.base.BaseController;
import com.batman.common.validator.LengthValidator;
import com.batman.upms.common.constant.UpmsResult;
import com.batman.upms.common.constant.UpmsResultConstant;
import com.batman.upms.dao.model.UpmsUser;
import com.batman.upms.dao.model.UpmsUserExample;
import com.batman.upms.rpc.api.UpmsUserService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/manage/user")
public class UpmsUserRestController extends BaseController {
	
	@Autowired
    private UpmsUserService upmsUserService;

    @ApiOperation(value = "新增用户")
    @ResponseBody
    //@RequiresPermissions("upms:organization:create")
    @RequestMapping(value = "/rest/create", method = RequestMethod.POST)
    public Object create(@RequestParam(value="userLoginName", required=true) String userLoginName,HttpServletRequest request) {

        UpmsUser upmsUser = new UpmsUser();
        upmsUser.setLoginName(userLoginName);
        upmsUser.setName(String.valueOf(request.getParameter("userName")));
        upmsUser.setUuid(UUID.randomUUID().toString().replaceAll("-", ""));
        
        ComplexResult result = FluentValidator.checkAll()
                .on(upmsUser.getLoginName(), new LengthValidator(1, 20, "名称"))
                .doValidate()
                .result(ResultCollectors.toComplex());
        if (!result.isSuccess()) {
            return new UpmsResult(UpmsResultConstant.INVALID_LENGTH, result.getErrors());
        }
        long time = System.currentTimeMillis();
        //upmsOrganization.setCtime(time);
        int count = upmsUserService.insertSelective(upmsUser);
        return new UpmsResult(UpmsResultConstant.SUCCESS, count);
    }

    //@RequiresPermissions("upms:organization:read")
	@RequestMapping(value = "/rest/init", method = RequestMethod.GET)
	@ResponseBody
	public Object init() {
		UpmsUserExample example = new UpmsUserExample();

		UpmsUserExample.Criteria criteria = example.createCriteria();

		criteria.andDeleteflagEqualTo(0);

		List<UpmsUser> users = upmsUserService.selectByExample(example);

		return new UpmsResult(UpmsResultConstant.SUCCESS, users);
	}
}

