package com.batman.upms.rpc.api;

import com.batman.common.base.BaseServiceMock;
import com.batman.upms.dao.mapper.UpmsOrganizationPermissionMapper;
import com.batman.upms.dao.model.UpmsOrganizationPermission;
import com.batman.upms.dao.model.UpmsOrganizationPermissionExample;

/**
* 降级实现UpmsOrganizationPermissionService接口
* Created by jiang on 2017/8/3.
*/
public class UpmsOrganizationPermissionServiceMock extends BaseServiceMock<UpmsOrganizationPermissionMapper, UpmsOrganizationPermission, UpmsOrganizationPermissionExample> implements UpmsOrganizationPermissionService {

}
