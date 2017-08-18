<%@ page contentType="text/html; charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ include file="/WEB-INF/views/include/javascriptLib.jsp"%>
<c:set var="basePath" value="${pageContext.request.contextPath}" />
<style type="text/css">
/*
 *  Usage:
 *
      <div class="sk-fading-circle">
        <div class="sk-circle1 sk-circle"></div>
        <div class="sk-circle2 sk-circle"></div>
        <div class="sk-circle3 sk-circle"></div>
        <div class="sk-circle4 sk-circle"></div>
        <div class="sk-circle5 sk-circle"></div>
        <div class="sk-circle6 sk-circle"></div>
        <div class="sk-circle7 sk-circle"></div>
        <div class="sk-circle8 sk-circle"></div>
        <div class="sk-circle9 sk-circle"></div>
        <div class="sk-circle10 sk-circle"></div>
        <div class="sk-circle11 sk-circle"></div>
        <div class="sk-circle12 sk-circle"></div>
      </div>
 *
 */
.sk-fading-circle {
	margin: 0 auto;
	width: 30px;
	height: 30px;
	position: relative;
}

.sk-fading-circle .sk-circle {
	width: 100%;
	height: 100%;
	position: absolute;
	left: 0;
	top: 0;
}

.sk-fading-circle .sk-circle:before {
	content: '';
	display: block;
	margin: 0 auto;
	width: 15%;
	height: 15%;
	background-color: #333;
	border-radius: 100%;
	-webkit-animation: sk-circleFadeDelay 1.2s infinite ease-in-out both;
	animation: sk-circleFadeDelay 1.2s infinite ease-in-out both;
}

.sk-fading-circle .sk-circle2 {
	-webkit-transform: rotate(30deg);
	-ms-transform: rotate(30deg);
	transform: rotate(30deg);
}

.sk-fading-circle .sk-circle3 {
	-webkit-transform: rotate(60deg);
	-ms-transform: rotate(60deg);
	transform: rotate(60deg);
}

.sk-fading-circle .sk-circle4 {
	-webkit-transform: rotate(90deg);
	-ms-transform: rotate(90deg);
	transform: rotate(90deg);
}

.sk-fading-circle .sk-circle5 {
	-webkit-transform: rotate(120deg);
	-ms-transform: rotate(120deg);
	transform: rotate(120deg);
}

.sk-fading-circle .sk-circle6 {
	-webkit-transform: rotate(150deg);
	-ms-transform: rotate(150deg);
	transform: rotate(150deg);
}

.sk-fading-circle .sk-circle7 {
	-webkit-transform: rotate(180deg);
	-ms-transform: rotate(180deg);
	transform: rotate(180deg);
}

.sk-fading-circle .sk-circle8 {
	-webkit-transform: rotate(210deg);
	-ms-transform: rotate(210deg);
	transform: rotate(210deg);
}

.sk-fading-circle .sk-circle9 {
	-webkit-transform: rotate(240deg);
	-ms-transform: rotate(240deg);
	transform: rotate(240deg);
}

.sk-fading-circle .sk-circle10 {
	-webkit-transform: rotate(270deg);
	-ms-transform: rotate(270deg);
	transform: rotate(270deg);
}

.sk-fading-circle .sk-circle11 {
	-webkit-transform: rotate(300deg);
	-ms-transform: rotate(300deg);
	transform: rotate(300deg);
}

.sk-fading-circle .sk-circle12 {
	-webkit-transform: rotate(330deg);
	-ms-transform: rotate(330deg);
	transform: rotate(330deg);
}

.sk-fading-circle .sk-circle2:before {
	-webkit-animation-delay: -1.1s;
	animation-delay: -1.1s;
}

.sk-fading-circle .sk-circle3:before {
	-webkit-animation-delay: -1s;
	animation-delay: -1s;
}

.sk-fading-circle .sk-circle4:before {
	-webkit-animation-delay: -0.9s;
	animation-delay: -0.9s;
}

.sk-fading-circle .sk-circle5:before {
	-webkit-animation-delay: -0.8s;
	animation-delay: -0.8s;
}

.sk-fading-circle .sk-circle6:before {
	-webkit-animation-delay: -0.7s;
	animation-delay: -0.7s;
}

.sk-fading-circle .sk-circle7:before {
	-webkit-animation-delay: -0.6s;
	animation-delay: -0.6s;
}

.sk-fading-circle .sk-circle8:before {
	-webkit-animation-delay: -0.5s;
	animation-delay: -0.5s;
}

.sk-fading-circle .sk-circle9:before {
	-webkit-animation-delay: -0.4s;
	animation-delay: -0.4s;
}

.sk-fading-circle .sk-circle10:before {
	-webkit-animation-delay: -0.3s;
	animation-delay: -0.3s;
}

.sk-fading-circle .sk-circle11:before {
	-webkit-animation-delay: -0.2s;
	animation-delay: -0.2s;
}

.sk-fading-circle .sk-circle12:before {
	-webkit-animation-delay: -0.1s;
	animation-delay: -0.1s;
}

@
-webkit-keyframes sk-circleFadeDelay { 0%, 39%, 100% {
	opacity: 0;
}

40%
{
opacity














:







 







1;
}
}
@
keyframes sk-circleFadeDelay { 0%, 39%, 100% {
	opacity: 0;
}

40%
{
opacity














:







 







1;
}
}
.sk-fading-circle-wrapper {
	opacity: 1;
	position: absolute;
	width: 100%;
	height: 100%;
	top: 0;
	left: 0;
	z-index: 1001;
}
</style>
<div class="row wrapper border-bottom white-bg page-heading">
	<div class="col-lg-10">
		<h2>组织机构设置</h2>
		<ol class="breadcrumb">
			<li><a href="#">系统维护</a></li>
			<li class="active"><strong>组织机构设置</strong></li>
		</ol>
	</div>
	<div class="col-lg-2"></div>
</div>
<div class="wrapper wrapper-content">
	<div class="row">
		<div class="col-lg-4">
			<div class="ibox float-e-margins">
				<div class="ibox-title">
					<h5>组织机构</h5>
					<div class="ibox-tools">
						<a class="collapse-link"> <i class="fa fa-chevron-up"></i>
						</a> <a class="close-link"> <i class="fa fa-times"></i>
						</a>
					</div>
				</div>
				<div class="ibox-content">
					<div class="row">
						<div class="col-lg-6">
							<div class="btn-group">
								<button class="btn btn-white" id="bumen" type="button">
									<i class="fa fa-plus"></i> 部门
								</button>
								<button class="btn btn-primary" type="button">
									<i class="fa fa-plus"></i> 岗位
								</button>
							</div>
							<button type="button" class="btn btn-danger" id="cleartoasts">
								<i class="fa fa-trash"></i> 删除
							</button>
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
		<div class="col-lg-8">
			<div class="ibox">
				<div class="ibox-content">
					<div class="panel blank-panel">
						<div class="panel-heading">
							<div class="panel-options">
								<ul class="nav nav-tabs">
									<li class="active"><a href="#tab-1" data-toggle="tab"><i
											class="fa fa-book"></i>详细</a></li>
									<li class=""><a href="#tab-2" data-toggle="tab"><i
											class="fa fa-user"></i>分配用户</a></li>
									<li class=""><a href="#tab-3" data-toggle="tab"><i
											class="fa fa-user"></i>分配角色</a></li>
								</ul>
							</div>
						</div>
						<div class="panel-body">

							<div class="tab-content">
								<div class="tab-pane active" id="tab-1">
									<div class="form-horizontal">
										<div class="form-group">
											<label class="col-sm-2 control-label">组织机构名称</label>
											<div class="col-sm-10">
												<input type="text" class="form-control">
											</div>
										</div>
										<div class="form-group">
											<label class="col-sm-2 control-label">组织机构类型</label>
											<div class="col-sm-10">
												<div class="radio radio-info radio-inline">
													<input type="radio" id="inlineRadio1" value="option1"
														name="radioInline" checked=""> <label
														for="inlineRadio1"> 部门 </label>
												</div>
												<div class="radio radio-info radio-inline">
													<input type="radio" id="inlineRadio2" value="option2"
														name="radioInline"> <label for="inlineRadio2">
														岗位 </label>
												</div>
											</div>
										</div>
										<div class="form-group">
											<label class="col-sm-2 control-label">状态</label>
											<div class="col-sm-10">
												<div class="checkbox checkbox-primary checkbox-inline">
													<input type="checkbox" id="inlineCheckbox1" value="option1">
													<label for="inlineCheckbox1"> 可用 </label>
												</div>
												<div class="checkbox checkbox-primary checkbox-inline">
													<input type="checkbox" id="inlineCheckbox2" value="option1"
														checked=""> <label for="inlineCheckbox2">
														可见 </label>
												</div>
											</div>
										</div>
										<div class="form-group">
											<label class="col-sm-2 control-label">描述</label>
											<div class="col-sm-10">
												<textarea class="form-control" placeholder="内容" rows="3"></textarea>
											</div>
										</div>
									</div>
								</div>
								<div class="tab-pane" id="tab-2">
									<div class="sk-fading-circle-wrapper" style="display: none;">
										<div class="sk-fading-circle">
											<div class="sk-circle1 sk-circle"></div>
											<div class="sk-circle2 sk-circle"></div>
											<div class="sk-circle3 sk-circle"></div>
											<div class="sk-circle4 sk-circle"></div>
											<div class="sk-circle5 sk-circle"></div>
											<div class="sk-circle6 sk-circle"></div>
											<div class="sk-circle7 sk-circle"></div>
											<div class="sk-circle8 sk-circle"></div>
											<div class="sk-circle9 sk-circle"></div>
											<div class="sk-circle10 sk-circle"></div>
											<div class="sk-circle11 sk-circle"></div>
											<div class="sk-circle12 sk-circle"></div>
										</div>
									</div>
								</div>
								<div class="tab-pane" id="tab-3">
									<div class="transfer">
										<div class="transfer-list"
											style="width: 250px; height: 300px;"></div>
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

<script
	src="${basePath}/resources/batman-admin-ui/js/plugins/jsTree/jstree.min.js"></script>
<style>
@
-webkit-keyframes antCheckboxEffect { 0% {
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
@
keyframes antCheckboxEffect { 0% {
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
.jstree-open>.jstree-anchor>.fa-folder:before {
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
					url : "${basePath}/manage/organization/rest/init",
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
								//激活删除节点功能
								'check_callback' : true,
								//用于生成tree的数据
								"data" : jsonarray
							},
							'plugins' : [ 'types', 'dnd' ,'contextmenu'],
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

							},
							'contextmenu' : {
								select_node : false,
				                show_at_node : true,
								'items' : {
									'create' : {
										//Create这一项在分割线之前
										'separator_before' : false,
										//Create这一项在分割线之后
										'separator_after' : true,
				                      	//false表示 create 这一项可以使用; true表示不能使用
				                        '_disabled' : false, 
										'label' : '新增',
										//点击Create这一项触发该方法,这理还是蛮有用的
										'action' : function (data) {
											//获得当前节点,可以拿到当前节点所有属性
				                            var inst = $.jstree.reference(data.reference),
				                                 obj = inst.get_node(data.reference);
				                            //新加节点,以下三行代码注释掉就不会添加节点
				                            inst.create_node(obj, {}, "last", function (new_node) {
				                            	//新加节点后触发 重命名方法,即 创建节点完成后可以立即重命名节点
				                                setTimeout(function () { inst.edit(new_node); },0);
				                            });
				                        }
									},
									'rename' : {
										//rename这一项在分割线之前
										'separator_before' : false,
										//rename这一项在分割线之后
										'separator_after' : true,
				                      	//false表示 create 这一项可以使用; true表示不能使用
				                        '_disabled' : false, 
										'label' : '重命名',
										//点击Create这一项触发该方法,这理还是蛮有用的
										'action' : function (data) {
											//获得当前节点,可以拿到当前节点所有属性
				                            var inst = $.jstree.reference(data.reference),
				                                 obj = inst.get_node(data.reference);
				                            	inst.edit(obj);
				                        }
									},
									'delete' : {
										//delete这一项在分割线之前
										'separator_before' : false,
										//delete这一项在分割线之后
										'separator_after' : true,
				                      	//false表示 create 这一项可以使用; true表示不能使用
				                        '_disabled' : false, 
										'label' : '刪除',
										//点击delete这一项触发该方法,这理还是蛮有用的
										'action' : function (data) {
											//获得当前节点,可以拿到当前节点所有属性
				                            var inst = $.jstree.reference(data.reference),
				                                 obj = inst.get_node(data.reference);
				                            if(inst.is_selected(obj)) {
		                                        inst.delete_node(inst.get_selected());
		                                    }
		                                    else {
		                                        inst.delete_node(obj);
		                                    }
				                            $.ajax()
				                        }
									}
								}
								
							}
						});
					}

				});
				
				//按钮增加节点用
/* 				$("#bumen").click(function(){
					.bind("loaded.jstree", function () {
			            jQuery("#jstree1").jstree("open_all");
			        }).bind("create_node.jstree",function(event,data){
			            createCategory(event,data);
			        })
					$('#jstree1').jstree("create");
				}); */

			});

	function createSubmit() {
		$.ajax({
			type : 'post',
			url : '${basePath}/manage/organization/rest/create',
			data : {
				organizationName : "",
			},
			beforeSend : function() {
				// todo check
			},
			success : function(result) {

			},
			error : function(XMLHttpRequest, textStatus, errorThrown) {

			}
		});
	}
</script>
