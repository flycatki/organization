<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<c:set var="basePath" value="${pageContext.request.contextPath}"/>
<ul class="nav metismenu" id="side-menu">
    <li class="nav-header">
        <div class="dropdown profile-element">
            <span>
                <img alt="image" class="img-circle" src="img/profile_small.jpg"/>
            </span>
            <a data-toggle="dropdown" class="dropdown-toggle" href="#">
                <span class="clear">
                    <span class="block m-t-xs">
                        <strong class="font-bold">David Williams</strong>
                    </span>
                    <span class="text-muted text-xs block">Art Director <b class="caret"></b></span>
                </span>
            </a>
            <ul class="dropdown-menu animated fadeInRight m-t-xs">
                <li><a href="profile.html">Profile</a></li>
                <li><a href="contacts.html">Contacts</a></li>
                <li><a href="mailbox.html">Mailbox</a></li>
                <li class="divider"></li>
                <li><a href="login.html">Logout</a></li>
            </ul>
        </div>
        <div class="logo-element">
            BA+
        </div>
    </li>
    <li class="active">
        <a href="index.html">
            <i class="fa fa-th-large"></i>
            <span class="nav-label">系统维护</span>
            <span class="fa arrow"></span>
        </a>
        <ul class="nav nav-second-level">
            <li><a href="dashboard_2.html">应用管理</a></li>
            <li class="active"><a href="${basePath}/manage/organization/index">组织机构设置</a></li>
            <li class="active"><a href="${basePath}/manage/role/index">角色管理</a></li>
            <li><a href="${basePath}/manage/permission/index">权限管理</a></li>
            <li><a href="${basePath}/manage/user/index">用户管理</a></li>
            <li><a href="dashboard_5.html">日志管理 <span class="label label-primary pull-right">NEW</span></a>
            </li>
        </ul>
    </li>
</ul>
