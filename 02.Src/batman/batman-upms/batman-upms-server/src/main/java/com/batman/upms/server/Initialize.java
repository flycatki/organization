package com.batman.upms.server;

import com.batman.common.base.BaseInterface;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Initialize implements BaseInterface {

    private static Logger _log = LoggerFactory.getLogger(Initialize.class);

    @Override
    public void inti() {
        _log.info(">>>>> 系统初始化");
    }
}
