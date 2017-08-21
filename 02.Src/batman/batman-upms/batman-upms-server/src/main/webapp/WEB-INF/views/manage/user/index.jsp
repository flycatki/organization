<%@ page contentType="text/html; charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ include file="/WEB-INF/views/include/javascriptLib.jsp" %>
<c:set var="basePath" value="${pageContext.request.contextPath}"/>
<div class="row wrapper border-bottom white-bg page-heading">
	<div class="col-lg-10">
		<h2>用户管理</h2>
		<ol class="breadcrumb">
			<li><a href="#">系统维护</a></li>
			<li class="active"><strong>用户管理</strong></li>
		</ol>
	</div>
	<div class="col-lg-2"></div>
</div>
<div class="wrapper wrapper-content">
    <div class="row">
        <div class="col-lg-3">
            <div class="ibox float-e-margins">
                <div class="ibox-title">
                    <h5>组织机构</h5>
                </div>
                <div class="ibox-content">
                    <div class="row">
                        <div class="col-lg-12">
                            <input type="text" class="form-control" placeholder="搜索" />
                        </div>
                    </div>
                    <div id="jstree1">
                        <ul>
                            <li class="jstree-open" data-jstree='{"icon":"fa fa-graduation-cap"}'>大连理工大学
                                <ul>
                                    <li class="jstree-open" data-jstree='{"icon":"fa fa-home"}'>研究生院
                                        <ul>
                                            <li data-jstree='"type":"css"}'>无岗位信息人员</li>
                                        </ul>
                                    </li>
                                    <li class="jstree-open" data-jstree='{"icon":"fa fa-home"}'>软件学院
                                        <ul>
                                            <li class="text-navy" data-jstree='{"type":"html", "icon":"fa fa-user"}'>软件学院院领导</li>
                                            <li class="text-navy" data-jstree='{"type":"html", "icon":"fa fa-users"}'>软件学院综合办公室</li>
                                            <li data-jstree='{"type":"html", "icon":"fa fa-users"}'>软件学院研究生培养办公室
                                                <ul>
                                                    <li data-jstree='{"type":"css", "icon":"fa fa-user"}'>研究生培养办公室主任</li>
                                                    <li data-jstree='{"type":"css", "icon":"fa fa-user"}'>无岗位信息人员</li>
                                                </ul>
                                            </li>
                                        </ul>
                                    </li>
                                    <li class="" data-jstree='{"icon":"fa fa-home", "opened":true}'>数学科学学院
                                        <ul>
                                            <li data-jstree='{"type":"svg", "icon":"fa fa-user"}'>数学科学学院领导<span>10</span></li>
                                            <li class="text-navy" data-jstree='{"type":"svg", "icon":"fa fa-users"}'>数学科学学院办公室</li>
                                            <li data-jstree='{"type":"svg", "icon":"fa fa-users"}'>计算科学研究所</li>
                                            <li data-jstree='{"type":"svg", "icon":"fa fa-users"}'>无岗位信息人员</li>
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
                <div class="ibox-title">
                    <span>成员列表</span>
                    <span class="users-list-pinyin">
                        <a class="highlight">全部</a>
                        <a>A</a>
                        <a>B</a>
                        <a>C</a>
                        <a>D</a>
                        <a>E</a>
                        <a>F</a>
                        <a>G</a>
                        <a class="highlight">H</a>
                        <a>I</a>
                        <a>J</a>
                        <a>K</a>
                        <a>L</a>
                        <a>M</a>
                        <a>M</a>
                        <a class="highlight">N</a>
                        <a>O</a>
                        <a>P</a>
                        <a>Q</a>
                        <a>R</a>
                        <a>S</a>
                        <a>T</a>
                        <a>U</a>
                        <a>V</a>
                        <a>W</a>
                        <a>X</a>
                        <a>Y</a>
                        <a>Z</a>
                    </span>
                    <div class="checkbox checkbox-primary checkbox-inline">
                        <input type="checkbox" id="inlineCheckbox1" value="option1">
                        <label for="inlineCheckbox1"> 含离职 </label>
                    </div>
                    <div class="checkbox checkbox-primary checkbox-inline">
                        <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                        <label for="inlineCheckbox2"> 仅管理员 </label>
                    </div>
                </div>
                <div class="ibox-content">
                	<div class="nodata-holder">
						<div class="">
                            <i class="fa fa-user ico"></i>
                            <h4><strong>您还没有添加用户哦！</strong></h4>
                            <p>如何添加用户：鼠标右键岗位树，点击添加用户。</p>
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
$(document).ready(
		function() {
			$.ajax({
				type : "GET",
				url : "${basePath}/manage/user/init",
				dataType : "json",
				async : false,
				success : function(result) {
					var arrays = eval(result);
					var jsonstr = "[]";
					var jsonarray = eval('(' + jsonstr + ')');
					for (var i = 0; i < arrays.length; i++) {
						var arr = {
							"id" : arrays[i].uuid,
							"parent" : arrays[i].parentUuid == "0" ? "#"
									: arrays[i].parentUuid,
							"text" : arrays[i].name
						}
						jsonarray.push(arr);
					}
					$('#jstree1').jstree({
						"core" : {
							'check_callback' : true,
							"data" : jsonarray
						},
						'plugins' : [ 'contextmenu','types', 'dnd' ],
						 'contextmenu':{  
						        'items':{  
						            'create':null,  
						            'rename':null,  
						            'remove':null,  
						            'ccp':null,  
						            '新建用户':{  
						                'label':'新建用户',  
						                'action':function(data){  
						                    
						                }  
						            },  
						            '删除用户':{  
						                'label':'删除用户',  
						                'action':function(data){
						                	
						                }  
						            },  
						            '编辑用户':{  
						                'label':'编辑用户',  
						                'action':function(data){
						                	
						                } 
						            }
						        }
						   },
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
