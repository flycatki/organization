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
        <div class="col-lg-3">
            <div class="ibox float-e-margins">
                <div class="ibox-title">
                    <h5>角色</h5>
                </div>
                <div class="ibox-content">
                    <div class="row">
                        <div class="col-lg-6">
                            <div class="btn-group">
                                <button class="btn btn-white" type="button"><i class="fa fa-plus"></i> 角色</button>
                            </div>
                            <button type="button" class="btn btn-danger" id="cleartoasts"><i class="fa fa-trash"></i> 删除</button>
                        </div>
                        <div class="col-lg-6">
                            <input type="text" class="form-control" placeholder="搜索" />
                        </div>
                    </div>
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
        <div class="col-lg-9">
            <div class="ibox">
                <div class="ibox-content">
                    <div class="panel blank-panel">
                        <div class="panel-heading">
                            <div class="panel-options">
                                
                            </div>
                        </div>
                        <div class="panel-body">

                            <div class="tab-content">
                                <div class="tab-pane active" id="tab-1">
                                    <div class="form-horizontal">
                                        <div class="form-group"><label class="col-sm-2 control-label">组织机构名称</label>
                                            <div class="col-sm-10"><input type="text" class="form-control"></div>
                                        </div>
                                        <div class="form-group"><label class="col-sm-2 control-label">组织机构类型</label>
                                            <div class="col-sm-10">
                                                <div class="radio radio-info radio-inline">
                                                    <input type="radio" id="inlineRadio1" value="option1" name="radioInline" checked="">
                                                    <label for="inlineRadio1"> 部门 </label>
                                                </div>
                                                <div class="radio radio-info radio-inline">
                                                    <input type="radio" id="inlineRadio2" value="option2" name="radioInline">
                                                    <label for="inlineRadio2"> 岗位 </label>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="form-group"><label class="col-sm-2 control-label">状态</label>
                                            <div class="col-sm-10">
                                                <div class="checkbox checkbox-primary checkbox-inline">
                                                    <input type="checkbox" id="inlineCheckbox1" value="option1">
                                                    <label for="inlineCheckbox1"> 可用 </label>
                                                </div>
                                                <div class="checkbox checkbox-primary checkbox-inline">
                                                    <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                                    <label for="inlineCheckbox2"> 可见 </label>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="form-group"><label class="col-sm-2 control-label">描述</label>
                                            <div class="col-sm-10"><textarea class="form-control" placeholder="内容" rows="3"></textarea></div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>

<script src="${basePath}/resources/batman-admin-ui/js/plugins/jsTree/jstree.min.js"></script>
<style>
    @-webkit-keyframes antCheckboxEffect {
        0% {
            -webkit-transform: scale(1);
            transform: scale(1);
            opacity: .5
        }

        to {
            -webkit-transform: scale(1.6);
            transform: scale(1.6);
            opacity: 0
        }
    }

    @keyframes antCheckboxEffect {
        0% {
            -webkit-transform: scale(1);
            transform: scale(1);
            opacity: .5
        }

        to {
            -webkit-transform: scale(1.6);
            transform: scale(1.6);
            opacity: 0
        }
    }

    .jstree-open > .jstree-anchor > .fa-folder:before {
        content: "\f07c";
    }

    .jstree-default .jstree-icon.none {
        width: 0;
    }

    #jstree1 {
        margin-top: 20px;
    }


</style>

<script>
    $(document).ready(function() {

        $('#jstree1').jstree({
            "core" : {
                'check_callback' : true,
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

    function createSubmit() {
        $.ajax({
            type: 'post',
            url: '${basePath}/manage/user/rest/create',
            data: {
                organizationName: "",
            },
            beforeSend: function() {
                // todo check
            },
            success: function(result) {

            },
            error: function(XMLHttpRequest, textStatus, errorThrown) {

            }
        });
    }
</script>
