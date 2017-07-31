package com.batman.upms.rpc.service.impl;

import com.batman.common.annotation.BaseService;
import com.batman.common.base.BaseServiceImpl;
import com.batman.upms.dao.mapper.UpmsLogMapper;
import com.batman.upms.dao.model.UpmsLog;
import com.batman.upms.dao.model.UpmsLogExample;
import com.batman.upms.rpc.api.UpmsLogService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* UpmsLogService实现
* Created by jiang on 2017/37/31.
*/
@Service
@Transactional
@BaseService
public class UpmsLogServiceImpl extends BaseServiceImpl<UpmsLogMapper, UpmsLog, UpmsLogExample> implements UpmsLogService {

private static Logger _log = LoggerFactory.getLogger(UpmsLogServiceImpl.class);

@Autowired
UpmsLogMapper UpmsLogMapper;

}