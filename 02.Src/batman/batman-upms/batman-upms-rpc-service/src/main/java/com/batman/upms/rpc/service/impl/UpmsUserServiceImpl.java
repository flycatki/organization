package com.batman.upms.rpc.service.impl;

import com.batman.common.annotation.BaseService;
import com.batman.common.base.BaseServiceImpl;
import com.batman.upms.dao.mapper.UpmsUserMapper;
import com.batman.upms.dao.model.UpmsUser;
import com.batman.upms.dao.model.UpmsUserExample;
import com.batman.upms.rpc.api.UpmsUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* UpmsUserService实现
* Created by jiang on 2017/6/31.
*/
@Service
@Transactional
@BaseService
public class UpmsUserServiceImpl extends BaseServiceImpl<UpmsUserMapper, UpmsUser, UpmsUserExample> implements UpmsUserService {

private static Logger _log = LoggerFactory.getLogger(UpmsUserServiceImpl.class);

    @Autowired
    UpmsUserMapper UpmsUserMapper;

}