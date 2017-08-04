package com.batman.upms.rpc.service.impl;

import com.batman.common.annotation.BaseService;
import com.batman.common.base.BaseServiceImpl;
import com.batman.upms.dao.mapper.UpmsSystemMapper;
import com.batman.upms.dao.model.UpmsSystem;
import com.batman.upms.dao.model.UpmsSystemExample;
import com.batman.upms.rpc.api.UpmsSystemService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* UpmsSystemService实现
* Created by jiang on 2017/24/4.
*/
@Service
@Transactional
@BaseService
public class UpmsSystemServiceImpl extends BaseServiceImpl<UpmsSystemMapper, UpmsSystem, UpmsSystemExample> implements UpmsSystemService {

private static Logger _log = LoggerFactory.getLogger(UpmsSystemServiceImpl.class);

    @Autowired
    UpmsSystemMapper UpmsSystemMapper;

}