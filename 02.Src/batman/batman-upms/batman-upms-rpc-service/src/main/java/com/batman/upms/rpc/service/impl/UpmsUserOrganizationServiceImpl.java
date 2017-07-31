package com.batman.upms.rpc.service.impl;

import com.batman.common.annotation.BaseService;
import com.batman.common.base.BaseServiceImpl;
import com.batman.upms.dao.mapper.UpmsUserOrganizationMapper;
import com.batman.upms.dao.model.UpmsUserOrganization;
import com.batman.upms.dao.model.UpmsUserOrganizationExample;
import com.batman.upms.rpc.api.UpmsUserOrganizationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* UpmsUserOrganizationService实现
* Created by jiang on 2017/37/31.
*/
@Service
@Transactional
@BaseService
public class UpmsUserOrganizationServiceImpl extends BaseServiceImpl<UpmsUserOrganizationMapper, UpmsUserOrganization, UpmsUserOrganizationExample> implements UpmsUserOrganizationService {

private static Logger _log = LoggerFactory.getLogger(UpmsUserOrganizationServiceImpl.class);

@Autowired
UpmsUserOrganizationMapper UpmsUserOrganizationMapper;

}