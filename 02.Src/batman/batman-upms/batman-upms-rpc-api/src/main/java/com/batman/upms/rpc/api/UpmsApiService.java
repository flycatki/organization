package com.batman.upms.rpc.api;

import com.batman.upms.dao.model.UpmsUser;

public interface UpmsApiService {

    /**
     * 根据username获取UpmsUser
     * @param username
     * @return
     */
    UpmsUser selectUpmsUserByUsername(String username);
}
