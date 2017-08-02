package com.batman.common.listener;

import com.batman.common.annotation.BaseService;
import com.batman.common.base.BaseInterface;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

import java.lang.reflect.Method;
import java.util.Map;

public class ApplicationContextListener implements ApplicationListener<ContextRefreshedEvent> {

    private static Logger _log = LoggerFactory.getLogger(ApplicationContextListener.class);
    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        if (null == contextRefreshedEvent.getApplicationContext().getParent()) {
            _log.debug(">>>>> spring初始化完成 <<<<<");
            Map<String, Object> baesServices = contextRefreshedEvent.getApplicationContext().getBeansWithAnnotation(BaseService.class);
            for (Object service : baesServices.values()) {
                try {
                    Method initMapper = service.getClass().getMethod("initMapper");
                    initMapper.invoke(service);
                } catch (Exception e) {
                    _log.debug("初始化BaseService的initMapper方法异常", e);
                    e.printStackTrace();
                }
            }

            Map<String, BaseInterface> baseInterfaceBeans = contextRefreshedEvent.getApplicationContext().getBeansOfType(BaseInterface.class);
            for (Object service : baseInterfaceBeans.values()) {
                try {
                    Method init = service.getClass().getMethod("init");
                    init.invoke(service);
                } catch (Exception e) {
                    _log.debug("初始化BaseInterface的init方法异常", e);
                    e.printStackTrace();
                }
            }
        }
    }
}
