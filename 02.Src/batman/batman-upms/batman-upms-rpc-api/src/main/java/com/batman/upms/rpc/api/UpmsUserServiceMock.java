package com.batman.upms.rpc.api;

import com.batman.common.base.BaseServiceMock;
import com.batman.upms.dao.mapper.UpmsUserMapper;
import com.batman.upms.dao.model.UpmsUser;
import com.batman.upms.dao.model.UpmsUserExample;

/**
* 降级实现UpmsUserService接口
* Created by jiang on 2017/6/31.
*/
public class UpmsUserServiceMock extends BaseServiceMock<UpmsUserMapper, UpmsUser, UpmsUserExample> implements UpmsUserService {

}
