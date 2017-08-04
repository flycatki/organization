package com.batman.upms.rpc.api;

import com.batman.upms.dao.model.UpmsUser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UpmsApiServiceMock implements UpmsApiService {

    private static Logger _log = LoggerFactory.getLogger(UpmsApiServiceMock.class);

    @Override
    public UpmsUser selectUpmsUserByUsername(String username) {
        _log.info("UpmsApiServiceMock => selectUpmsUserByUsername");
        return null;
    }
}
