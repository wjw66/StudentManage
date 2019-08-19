<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML>
<html>
<head>
<title>登陆界面</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link type="text/css" rel="stylesheet" href="css/style.css" />
<script type="text/javascript" src="js/check.js"></script>
</head>
<body>
<div class="login">
	<h2>学生信息管理系统</h2>
	<div class="login-top">
		<h1>登陆界面</h1>
		<form action="LoginServlet" method="post">
			<input type="text"  placeholder="用户名" name="username" id="username" />
			<div>
				<span id="span01"></span>
			</div>
			<div id="message" style="color: red">
				<span id="span02">
					<c:if test="${requestScope.login_message!=null }">
						${requestScope.login_message }<br><br>
					</c:if>
				</span>
			</div>
			<input type="password"  placeholder="密码" name="password" id="password" />
			&nbsp;&nbsp;学生<input type="radio" name="type" value="student" checked="checked">&nbsp;&nbsp;
			教师<input type="radio" name="type" value="teacher">&nbsp;&nbsp;
			管理员<input type="radio" name="type" value="root"><br>
			<div class="forgot">
				<a href="#">忘记密码</a>
				<input type="submit" value="登陆" onclick="return checkForm()">
			</div>
		</form>
	</div>
	<div class="login-bottom">
		<!-- <h3>新用户 &nbsp;<a href="#">注册</a></h3> --> 
	</div>
</div>	
</body>
</html>