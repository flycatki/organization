package com.batman.upms.rpc.service.impl;

import com.batman.upms.dao.mapper.UpmsUserMapper;
import com.batman.upms.dao.model.UpmsUser;
import com.batman.upms.dao.model.UpmsUserExample;
import com.batman.upms.rpc.api.UpmsApiService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UpmsApiServiceImpl implements UpmsApiService {

    @Autowired
    UpmsUserMapper upmsUserMapper;

    @Override
    public UpmsUser selectUpmsUserByUsername(String username) {
        UpmsUserExample upmsUserExample = new UpmsUserExample();
        upmsUserExample.createCriteria()
                .andLoginNameEqualTo(username);
        List<UpmsUser> upmsUsers = upmsUserMapper.selectByExample(upmsUserExample);
        if (null != upmsUsers && upmsUsers.size() > 0) {
            return upmsUsers.get(0);
        }
        return null;
    }
}
