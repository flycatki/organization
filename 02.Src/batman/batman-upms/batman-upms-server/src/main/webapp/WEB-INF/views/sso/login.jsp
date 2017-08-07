<%@ page contentType="text/html; charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags"%>
<c:set var="basePath" value="${pageContext.request.contextPath}" />
<!DOCTYPE HTML>
<html lang="zh-cn">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>权限管理系统</title>
<link type="text/css"
	href="${basePath}/main/webapp/resources/batman-admin-ui/js/puugins/bootstrap-3.3.0/css/bootstrap.min.css"
	rel="stylesheet">
<script type="text/javascript"
	src="<c:url value='/main/webapp/resources/batman-admin-ui/js/plugins/jquery.1.12.4.min.js' />"></script>
<script type="text/javascript"
	src="<c:url value='/main/webapp/resources/batman-admin-ui/js/plugins/bootstrap-3.3.0/js/bootstrap.min.js' />"></script>
<style type="text/css">
#logindev {
	position: absolute;
	top: 40%;
	-webkit-transform: translateY(-50%);
	-moz-transform: translateY(-50%);
	-ms-transform: translateY(-50%);
	-o-transform: translateY(-50%);
	transform: translateY(-50%);
	background-color: #ccc;
}
</style>
<script type="text/javascript">
	$('#submit').click(function() {
		var backurl = $('#backurl').val();
		$.ajax({
			//提交数据的类型 POST GET
			type : "POST",
			//提交的网址
			url : "/sso/login",
			//提交的数据
			data : {
				backurl : backurl,
				username : $('#username').val(),
				password : $('#password').val()
			},
			//返回数据的格式
			datatype : "json",//"html","xml", "html", "script",  "jsonp", "text".
			//在请求之前调用的函数
			/*  beforeSend:function(){$("#msg").html("logining");},
			 //成功返回之后调用的函数             
			 success:function(data){
			$("#msg").html(decodeURI(data));            
			 }   ,
			 //调用执行后调用的函数
			 complete: function(XMLHttpRequest, textStatus){
			    alert(XMLHttpRequest.responseText);
			    alert(textStatus);
			     //HideLoading();
			 }, */
			//调用出错执行的函数
			error : function() {
				//请求出错处理
			}
		});

	});
</script>
</head>
<body>
	<div class="container">
		<div class="col-xs-4 col-xs-offset-4" id="logindev">
			<form action="/sso/login" method="post">
				<div id="login-window">
					<div class="input-group m-b-20">
						<span class="input-group-addon"><i
							class="zmdi zmdi-account"></i></span>
						<div class="fg-line">
							<input id="username" type="text" class="form-control"
								name="username" placeholder="帐号" required autofocus
								value="admin">
						</div>
					</div>
					<div class="input-group m-b-20">
						<span class="input-group-addon"><i class="zmdi zmdi-male"></i></span>
						<div class="fg-line">
							<input id="password" type="password" class="form-control"
								name="password" placeholder="密码" required value="123456">
						</div>
					</div>
					<div class="clearfix"></div>
					<div class="checkbox">
						<input id="rememberMe" type="checkbox" class="checkbix"
							data-text="自动登录" name="rememberMe">
					</div>
					<Button id="submit" type="submit">登录</Button>
				</div>
			</form>
		</div>
		<input id="backurl" type="hidden" value="${param.backurl}" />
	</div>
	<%-- <div class="container">
			<div class="col-xs-4 col-xs-offset-4" id="logindev">
				<form class="form">
					<h2>Please sign in</h2>
					<label for="inputEmail" class="sr-only">Email address</label>
					<input type="email" id="inputEmail" class="form-control" placeholder="Email address" required="" autofocus="">
					<label for="inputPassword" class="sr-only">Password</label>
					<input type="password" id="inputPassword" class="form-control" placeholder="Password" required="">
					<div class="checkbox">
						<label>
            <input type="checkbox" value="remember-me"> Remember me
          </label>
					</div>
					<button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
				</form>
			</div>
		</div>

</body> --%>
</html>
