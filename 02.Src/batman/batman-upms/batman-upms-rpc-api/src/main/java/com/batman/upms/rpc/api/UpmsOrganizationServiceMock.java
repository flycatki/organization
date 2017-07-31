package com.batman.upms.rpc.api;

import com.batman.common.base.BaseServiceMock;
import com.batman.upms.dao.mapper.UpmsOrganizationMapper;
import com.batman.upms.dao.model.UpmsOrganization;
import com.batman.upms.dao.model.UpmsOrganizationExample;

/**
* 降级实现UpmsOrganizationService接口
* Created by jiang on 2017/37/31.
*/
public class UpmsOrganizationServiceMock extends BaseServiceMock<UpmsOrganizationMapper, UpmsOrganization, UpmsOrganizationExample> implements UpmsOrganizationService {

}
