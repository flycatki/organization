package com.batman.upms.rpc.service.impl;

import com.batman.common.annotation.BaseService;
import com.batman.common.base.BaseServiceImpl;
import com.batman.upms.dao.mapper.UpmsOrganizationRoleMapper;
import com.batman.upms.dao.model.UpmsOrganizationRole;
import com.batman.upms.dao.model.UpmsOrganizationRoleExample;
import com.batman.upms.rpc.api.UpmsOrganizationRoleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* UpmsOrganizationRoleService实现
* Created by jiang on 2017/12/9.
*/
@Service
@Transactional
@BaseService
public class UpmsOrganizationRoleServiceImpl extends BaseServiceImpl<UpmsOrganizationRoleMapper, UpmsOrganizationRole, UpmsOrganizationRoleExample> implements UpmsOrganizationRoleService {

private static Logger _log = LoggerFactory.getLogger(UpmsOrganizationRoleServiceImpl.class);

    @Autowired
    UpmsOrganizationRoleMapper UpmsOrganizationRoleMapper;

}