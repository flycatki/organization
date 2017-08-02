package com.batman.upms.rpc;

import com.batman.common.util.SpringContextUtil;
import com.batman.upms.dao.mapper.UpmsUserMapper;
import com.batman.upms.rpc.service.impl.UpmsUserServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BatmanUpmsRpcServiceApplication {

    private static Logger _log = LoggerFactory.getLogger(BatmanUpmsRpcServiceApplication.class);

    public static void main(String[] args) {
        _log.info(">>>>> batman-upms-rpc-service 正在启动 <<<<<");
        new ClassPathXmlApplicationContext("classpath:META-INF/spring/*.xml");
        _log.info(">>>>> batman-upms-rpc-service 启动完成 <<<<<");

        UpmsUserMapper upmsUserMapper = SpringContextUtil.getBean(UpmsUserMapper.class);
        UpmsUserServiceImpl upmsUserService = SpringContextUtil.getBean(UpmsUserServiceImpl.class);
    }
}
