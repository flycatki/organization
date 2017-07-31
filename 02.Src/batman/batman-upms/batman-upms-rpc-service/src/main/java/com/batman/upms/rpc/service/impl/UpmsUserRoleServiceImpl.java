package com.batman.upms.rpc.service.impl;

import com.batman.common.annotation.BaseService;
import com.batman.common.base.BaseServiceImpl;
import com.batman.upms.dao.mapper.UpmsUserRoleMapper;
import com.batman.upms.dao.model.UpmsUserRole;
import com.batman.upms.dao.model.UpmsUserRoleExample;
import com.batman.upms.rpc.api.UpmsUserRoleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* UpmsUserRoleService实现
* Created by jiang on 2017/37/31.
*/
@Service
@Transactional
@BaseService
public class UpmsUserRoleServiceImpl extends BaseServiceImpl<UpmsUserRoleMapper, UpmsUserRole, UpmsUserRoleExample> implements UpmsUserRoleService {

private static Logger _log = LoggerFactory.getLogger(UpmsUserRoleServiceImpl.class);

@Autowired
UpmsUserRoleMapper UpmsUserRoleMapper;

}