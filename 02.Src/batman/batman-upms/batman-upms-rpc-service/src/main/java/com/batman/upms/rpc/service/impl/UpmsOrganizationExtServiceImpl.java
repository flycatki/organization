package com.batman.upms.rpc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.batman.common.annotation.BaseService;
import com.batman.upms.dao.model.UpmsOrganization;
import com.batman.upms.dao.model.UpmsOrganizationExtForTree;
import com.batman.upms.rpc.api.UpmsOrganizationExtService;
import com.batman.upms.rpc.mapper.UpmsOrganizationExtMapper;

@Service
@Transactional
@BaseService
public class UpmsOrganizationExtServiceImpl implements UpmsOrganizationExtService {
	
    @Autowired
    UpmsOrganizationExtMapper upmsOrganizationExtMapper;
	
    public List<UpmsOrganizationExtForTree> selectOrganizationInfoForTree(UpmsOrganization upmsOrganization){
    	return upmsOrganizationExtMapper.selectOrganizationInfoForTree(upmsOrganization);
    }

}
