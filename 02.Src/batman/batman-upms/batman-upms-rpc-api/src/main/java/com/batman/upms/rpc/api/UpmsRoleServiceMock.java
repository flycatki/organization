package com.batman.upms.rpc.api;

import com.batman.common.base.BaseServiceMock;
import com.batman.upms.dao.mapper.UpmsRoleMapper;
import com.batman.upms.dao.model.UpmsRole;
import com.batman.upms.dao.model.UpmsRoleExample;

/**
* 降级实现UpmsRoleService接口
* Created by jiang on 2017/37/31.
*/
public class UpmsRoleServiceMock extends BaseServiceMock<UpmsRoleMapper, UpmsRole, UpmsRoleExample> implements UpmsRoleService {

}
