package com.batman.upms.rpc.api;

import com.batman.common.base.BaseService;
import com.batman.upms.dao.model.UpmsUser;
import com.batman.upms.dao.model.UpmsUserExample;

import java.util.List;

/**
* UpmsUserService接口
* Created by jiang on 2017/6/31.
*/
public interface UpmsUserService extends BaseService<UpmsUser, UpmsUserExample> {

    List<UpmsUser> getAllUsers();
}