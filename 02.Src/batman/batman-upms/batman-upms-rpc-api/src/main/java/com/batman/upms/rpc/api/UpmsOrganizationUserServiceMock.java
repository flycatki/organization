package com.batman.upms.rpc.api;

import com.batman.common.base.BaseServiceMock;
import com.batman.upms.dao.mapper.UpmsOrganizationUserMapper;
import com.batman.upms.dao.model.UpmsOrganizationUser;
import com.batman.upms.dao.model.UpmsOrganizationUserExample;

/**
* 降级实现UpmsOrganizationUserService接口
* Created by jiang on 2017/8/3.
*/
public class UpmsOrganizationUserServiceMock extends BaseServiceMock<UpmsOrganizationUserMapper, UpmsOrganizationUser, UpmsOrganizationUserExample> implements UpmsOrganizationUserService {

}
