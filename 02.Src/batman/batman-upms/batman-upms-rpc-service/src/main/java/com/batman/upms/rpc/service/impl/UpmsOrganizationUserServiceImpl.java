package com.batman.upms.rpc.service.impl;

import com.batman.common.annotation.BaseService;
import com.batman.common.base.BaseServiceImpl;
import com.batman.upms.dao.mapper.UpmsOrganizationUserMapper;
import com.batman.upms.dao.model.UpmsOrganizationUser;
import com.batman.upms.dao.model.UpmsOrganizationUserExample;
import com.batman.upms.rpc.api.UpmsOrganizationUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* UpmsOrganizationUserService实现
* Created by jiang on 2017/8/3.
*/
@Service
@Transactional
@BaseService
public class UpmsOrganizationUserServiceImpl extends BaseServiceImpl<UpmsOrganizationUserMapper, UpmsOrganizationUser, UpmsOrganizationUserExample> implements UpmsOrganizationUserService {

private static Logger _log = LoggerFactory.getLogger(UpmsOrganizationUserServiceImpl.class);

    @Autowired
    UpmsOrganizationUserMapper UpmsOrganizationUserMapper;

}