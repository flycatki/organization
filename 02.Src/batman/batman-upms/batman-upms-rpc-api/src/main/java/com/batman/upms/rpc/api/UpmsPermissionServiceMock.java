package com.batman.upms.rpc.api;

import com.batman.common.base.BaseServiceMock;
import com.batman.upms.dao.mapper.UpmsPermissionMapper;
import com.batman.upms.dao.model.UpmsPermission;
import com.batman.upms.dao.model.UpmsPermissionExample;

/**
* 降级实现UpmsPermissionService接口
* Created by jiang on 2017/37/31.
*/
public class UpmsPermissionServiceMock extends BaseServiceMock<UpmsPermissionMapper, UpmsPermission, UpmsPermissionExample> implements UpmsPermissionService {

}
