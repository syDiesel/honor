<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'login.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<link rel="icon" href="<%=basePath%>img/logo.jpg" type="image/x-icon">
<link href="css/login/login.css" type="text/css" rel="stylesheet">
</head>

<body>
	<div class="login">
		<div class="message">品牌名称-管理登录</div>
		<div id="darkbannerwrap"></div>

		<form method="post">
			<input name="action" value="login" type="hidden"> <input
				name="name" placeholder="用户名" required="" type="text" class="name"><i
				class="icon-user"></i>
			<hr class="hr15">
			<input name="password" placeholder="密码" required="" type="password">
			<hr class="hr15">
			<input value="登录" style="width:100%;" type="submit">
			<hr class="hr20">
			<!-- 帮助 <a onClick="alert('请联系管理员')">忘记密码</a> -->
		</form>


	</div>

	<div class="copyright">
		© 2016品牌名称 by <a href="http://www.mycodes.net/" target="_blank">源码之家</a>
	</div>
</body>
</html>
