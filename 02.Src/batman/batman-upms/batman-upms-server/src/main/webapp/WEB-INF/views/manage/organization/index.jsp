<%@ page contentType="text/html; charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<c:set var="basePath" value="${pageContext.request.contextPath}"/>
<input type="hidden" id=basepath value="${basePath}">
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
		<div class="col-lg-3">
			<div class="ibox float-e-margins">
				<div class="ibox-title">
					<h5>组织机构</h5>
					<div class="ibox-tools">
						<a class="collapse-link">
							<i class="fa fa-chevron-up"></i>
						</a>
						<a class="dropdown-toggle" data-toggle="dropdown" href="#">
							<i class="fa fa-wrench"></i>
						</a>
						<ul class="dropdown-menu dropdown-user">
							<li><a href="#"><i class="fa fa-check"></i> 仅显示不可用</a>
							</li>
							<li><a href="#"><i class="fa fa-eye"></i> 仅显示不可见</a>
							</li>
						</ul>
						<a class="close-link">
							<i class="fa fa-times"></i>
						</a>
					</div>
				</div>
				<div class="ibox-content">
					<div class="row">						
						<div class="col-lg-12 right">
							<div class="input-group m-b"><input type="text" class="form-control" placeholder="请输入名字/编码查询"> <span class="input-group-addon"><i class="fa fa-search"></i></span></div>
						</div>
					</div>
					<div id="jstree1">
					</div>
				</div>
			</div>
		</div>
		<div class="col-lg-9">
			<div id="ibox1" class="ibox" style="display:none">
				<div class="ibox-title">添加岗位</div>
				<div class="ibox-content">
					<div class="form-horizontal">
						<div class="form-group">
							<label class="col-sm-2 control-label">组织机构名称</label>
							<div class="col-sm-10">
								<input id="organizationName" type="text" class="form-control">
								<input id="parentUuid" type="hidden">
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
										checked=""> <label for="inlineCheckbox2"> 可见 </label>
								</div>
							</div>
						</div>
						<div class="form-group">
							<label class="col-sm-2 control-label">描述</label>
							<div class="col-sm-10">
								<textarea class="form-control" placeholder="内容" rows="3"></textarea>
							</div>
						</div>
						<div class="hr-line-dashed"></div>
						<div class="form-group">
							<div class="col-sm-2 col-sm-offset-2">
								<button class="btn btn-white" type="button">
									<i class="fa fa-undo"></i> 取消
								</button>
								<button id="add" class="btn btn-primary" type="button">
									<i class="fa fa-plus"></i> 添加
								</button>
							</div>
						</div>
					</div>
				</div>
			</div>
			<div class="ibox" id="ibox2">
				<div class="ibox-content">
					<div style="width:80%;height : 180px"></div>
				</div>
			</div>
		</div>
	</div>
</div>


<script src="${basePath}/resources/js/organization.js"></script>



