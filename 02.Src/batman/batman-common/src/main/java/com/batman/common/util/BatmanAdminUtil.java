package com.batman.common.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.web.context.ServletContextAware;

import javax.servlet.ServletContext;

public class BatmanAdminUtil implements InitializingBean, ServletContextAware {

    private static Logger _log  = LoggerFactory.getLogger(BatmanAdminUtil.class);

    @Override
    public void afterPropertiesSet() throws Exception {

    }

    @Override
    public void setServletContext(ServletContext servletContext) {
        _log.info("=====开始解压admin=====");
        String version = PropertiesFileUtil.getInstance("batman-admin-client").get("batman.admin.version");
        _log.info("batman-admin-ui.jar 版本：{}", version);
        String jarPath = servletContext.getRealPath("/WEB-INF/lib/batman-admin-ui-" + version + ".jar");
        _log.info("batman-admin-ui.jar 包路径：{}", jarPath);
        String resources = servletContext.getRealPath("/") + "/resources/batman-admin-ui";
        _log.info("batman-admin-ui.jar 解压到：{}", resources);
        JarUtil.decompress(jarPath, resources);
        _log.info("=====解压完成=====");
    }
}
