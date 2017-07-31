package com.batman.upms.rpc.service.impl;

import com.batman.common.annotation.BaseService;
import com.batman.common.base.BaseServiceImpl;
import com.batman.upms.dao.mapper.UpmsPermissionMapper;
import com.batman.upms.dao.model.UpmsPermission;
import com.batman.upms.dao.model.UpmsPermissionExample;
import com.batman.upms.rpc.api.UpmsPermissionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* UpmsPermissionService实现
* Created by jiang on 2017/37/31.
*/
@Service
@Transactional
@BaseService
public class UpmsPermissionServiceImpl extends BaseServiceImpl<UpmsPermissionMapper, UpmsPermission, UpmsPermissionExample> implements UpmsPermissionService {

private static Logger _log = LoggerFactory.getLogger(UpmsPermissionServiceImpl.class);

@Autowired
UpmsPermissionMapper UpmsPermissionMapper;

}