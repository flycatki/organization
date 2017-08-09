package com.batman.upms.rpc.service.impl;

import com.batman.common.annotation.BaseService;
import com.batman.common.base.BaseServiceImpl;
import com.batman.upms.dao.mapper.UpmsSystemPermissionMapper;
import com.batman.upms.dao.model.UpmsSystemPermission;
import com.batman.upms.dao.model.UpmsSystemPermissionExample;
import com.batman.upms.rpc.api.UpmsSystemPermissionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* UpmsSystemPermissionService实现
* Created by jiang on 2017/12/9.
*/
@Service
@Transactional
@BaseService
public class UpmsSystemPermissionServiceImpl extends BaseServiceImpl<UpmsSystemPermissionMapper, UpmsSystemPermission, UpmsSystemPermissionExample> implements UpmsSystemPermissionService {

private static Logger _log = LoggerFactory.getLogger(UpmsSystemPermissionServiceImpl.class);

    @Autowired
    UpmsSystemPermissionMapper UpmsSystemPermissionMapper;

}