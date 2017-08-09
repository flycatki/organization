package com.batman.upms.rpc.service.impl;

import com.batman.common.annotation.BaseService;
import com.batman.common.base.BaseServiceImpl;
import com.batman.upms.dao.mapper.UpmsOrganizationSystemMapper;
import com.batman.upms.dao.model.UpmsOrganizationSystem;
import com.batman.upms.dao.model.UpmsOrganizationSystemExample;
import com.batman.upms.rpc.api.UpmsOrganizationSystemService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* UpmsOrganizationSystemService实现
* Created by jiang on 2017/12/9.
*/
@Service
@Transactional
@BaseService
public class UpmsOrganizationSystemServiceImpl extends BaseServiceImpl<UpmsOrganizationSystemMapper, UpmsOrganizationSystem, UpmsOrganizationSystemExample> implements UpmsOrganizationSystemService {

private static Logger _log = LoggerFactory.getLogger(UpmsOrganizationSystemServiceImpl.class);

    @Autowired
    UpmsOrganizationSystemMapper UpmsOrganizationSystemMapper;

}