package com.batman.upms.rpc.service.impl;

import com.batman.common.annotation.BaseService;
import com.batman.common.base.BaseServiceImpl;
import com.batman.upms.dao.mapper.UpmsOrganizationMapper;
import com.batman.upms.dao.model.UpmsOrganization;
import com.batman.upms.dao.model.UpmsOrganizationExample;
import com.batman.upms.dao.model.UpmsOrganizationExtForTree;
import com.batman.upms.rpc.api.UpmsOrganizationService;
import com.batman.upms.rpc.mapper.UpmsOrganizationExtMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
* UpmsOrganizationService实现
* Created by jiang on 2017/8/3.
*/
@Service
@Transactional
@BaseService
public class UpmsOrganizationServiceImpl extends BaseServiceImpl<UpmsOrganizationMapper, UpmsOrganization, UpmsOrganizationExample> implements UpmsOrganizationService {

private static Logger _log = LoggerFactory.getLogger(UpmsOrganizationServiceImpl.class);

    @Autowired
    UpmsOrganizationMapper UpmsOrganizationMapper;

    @Autowired
    UpmsOrganizationExtMapper upmsOrganizationExtMapper;

    public List<UpmsOrganization> selectUpmsWorkByUserid(String userId,String system_uuid) {
        return upmsOrganizationExtMapper.selectUpmsWorkByUserid(userId,system_uuid);
    }
    
    public List<UpmsOrganizationExtForTree> selectOrganizationInfoForTree(UpmsOrganization upmsOrganization){
    	return upmsOrganizationExtMapper.selectOrganizationInfoForTree();
    }

}