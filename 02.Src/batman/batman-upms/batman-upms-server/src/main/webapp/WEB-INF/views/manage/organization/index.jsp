<%@ page contentType="text/html; charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ include file="/WEB-INF/views/include/javascriptLib.jsp" %>
<c:set var="basePath" value="${pageContext.request.contextPath}"/>

<div class="wrapper wrapper-content">
    <div class="row">
        <div class="col-lg-6">
            <div class="ibox float-e-margins">
                <div class="ibox-title">
                    <h5>组织机构</h5>
                    <div class="ibox-tools">
                        <a class="collapse-link">
                            <i class="fa fa-chevron-up"></i>
                        </a>
                        <a class="close-link">
                            <i class="fa fa-times"></i>
                        </a>
                    </div>
                </div>
                <div class="ibox-content">

                    <div id="jstree1">
                        <ul>
                            <li class="jstree-open">Admin theme
                                <ul>
                                    <li>css
                                        <ul>
                                            <li data-jstree='"type":"css"}'>animate.css</li>
                                            <li data-jstree='"type":"css"}'>bootstrap.css</li>
                                            <li data-jstree='"type":"css"}'>style.css</li>
                                        </ul>
                                    </li>
                                    <li>email-templates
                                        <ul>
                                            <li data-jstree='"type":"html"}'>action.html</li>
                                            <li data-jstree='"type":"html"}'>alert.html</li>
                                            <li data-jstree='"type":"html"}'>billing.html</li>
                                        </ul>
                                    </li>
                                    <li>fonts
                                        <ul>
                                            <li data-jstree='"type":"svg"}'>glyphicons-halflings-regular.eot</li>
                                            <li data-jstree='"type":"svg"}'>glyphicons-halflings-regular.svg</li>
                                            <li data-jstree='"type":"svg"}'>glyphicons-halflings-regular.ttf</li>
                                            <li data-jstree='"type":"svg"}'>glyphicons-halflings-regular.woff</li>
                                        </ul>
                                    </li>
                                </ul>
                            </li>
                        </ul>
                    </div>

                </div>
            </div>
        </div>
        <div class="col-lg-6">
            <div class="ibox float-e-margins">
                <div class="ibox-title">
                    <h5>输入侧</h5>
                    <div class="ibox-tools">
                        <a class="collapse-link">
                            <i class="fa fa-chevron-up"></i>
                        </a>
                        <a class="close-link">
                            <i class="fa fa-times"></i>
                        </a>
                    </div>
                </div>
                <div class="ibox-content">

                    <div id="using_json"></div>

                </div>
            </div>
        </div>
    </div>
</div>

<script src="${basePath}/resources/batman-admin-ui/js/plugins/jsTree/jstree.min.js"></script>

<style>
    .jstree-open > .jstree-anchor > .fa-folder:before {
        content: "\f07c";
    }

    .jstree-default .jstree-icon.none {
        width: 0;
    }
</style>

<script>
    $(document).ready(function(){

        $('#jstree1').jstree({
            'core' : {
                'check_callback' : true
            },
            'plugins' : [ 'types', 'dnd' ],
            'types' : {
                'default' : {
                    'icon' : 'fa fa-folder'
                },
                'html' : {
                    'icon' : 'fa fa-file-code-o'
                },
                'svg' : {
                    'icon' : 'fa fa-file-picture-o'
                },
                'css' : {
                    'icon' : 'fa fa-file-code-o'
                },
                'img' : {
                    'icon' : 'fa fa-file-image-o'
                },
                'js' : {
                    'icon' : 'fa fa-file-text-o'
                }

            }
        });
    });
</script>
