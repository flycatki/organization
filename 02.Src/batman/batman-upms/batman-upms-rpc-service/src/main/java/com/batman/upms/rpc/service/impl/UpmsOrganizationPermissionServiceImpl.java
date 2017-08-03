package com.batman.upms.rpc.service.impl;

import com.batman.common.annotation.BaseService;
import com.batman.common.base.BaseServiceImpl;
import com.batman.upms.dao.mapper.UpmsOrganizationPermissionMapper;
import com.batman.upms.dao.model.UpmsOrganizationPermission;
import com.batman.upms.dao.model.UpmsOrganizationPermissionExample;
import com.batman.upms.rpc.api.UpmsOrganizationPermissionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* UpmsOrganizationPermissionService实现
* Created by jiang on 2017/8/3.
*/
@Service
@Transactional
@BaseService
public class UpmsOrganizationPermissionServiceImpl extends BaseServiceImpl<UpmsOrganizationPermissionMapper, UpmsOrganizationPermission, UpmsOrganizationPermissionExample> implements UpmsOrganizationPermissionService {

private static Logger _log = LoggerFactory.getLogger(UpmsOrganizationPermissionServiceImpl.class);

    @Autowired
    UpmsOrganizationPermissionMapper UpmsOrganizationPermissionMapper;

}