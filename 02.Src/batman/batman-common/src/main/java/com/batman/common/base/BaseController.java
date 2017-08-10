package com.batman.common.base;

import com.batman.common.util.PropertiesFileUtil;
import org.apache.shiro.authz.UnauthorizedException;
import org.apache.shiro.session.InvalidSessionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public abstract class BaseController {
    private final static Logger _log = LoggerFactory.getLogger(BaseController.class);

    @ExceptionHandler
    public String exceptionHandler(HttpServletRequest request, HttpServletResponse response, Exception exception) {
        _log.error("异常统一处理", exception);
        request.setAttribute("ex", exception);
        if (null != request.getHeader("X-Requested-With") && request.getHeader("X-Requested-With").equalsIgnoreCase("XMLHttpRequest")) {
            request.setAttribute("requestHeader", "ajax");
        }
        if (exception instanceof UnauthorizedException) {
            return "403.page";
        }
        if (exception instanceof InvalidSessionException) {
            return "error.page";
        }
        return "error.page";
    }

    public static String jsp(String path) {
        return path.concat(".jsp");
    }

    public static String thymeleaf(String path) {
        String folder = PropertiesFileUtil.getInstance().get("app.name");
        return "/".concat(folder).concat(path).concat(".html");
    }
}
