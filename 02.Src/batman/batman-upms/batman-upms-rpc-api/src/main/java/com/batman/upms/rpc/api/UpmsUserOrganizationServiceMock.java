package com.batman.upms.rpc.api;

import com.batman.common.base.BaseServiceMock;
import com.batman.upms.dao.mapper.UpmsUserOrganizationMapper;
import com.batman.upms.dao.model.UpmsUserOrganization;
import com.batman.upms.dao.model.UpmsUserOrganizationExample;

/**
* 降级实现UpmsUserOrganizationService接口
* Created by jiang on 2017/37/31.
*/
public class UpmsUserOrganizationServiceMock extends BaseServiceMock<UpmsUserOrganizationMapper, UpmsUserOrganization, UpmsUserOrganizationExample> implements UpmsUserOrganizationService {

}
