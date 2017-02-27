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
<link rel="icon" href="<%=basePath%>image/logo.jpg" type="image/x-icon">
<link href="<%=basePath%>css/login/login.css" type="text/css" rel="stylesheet">
<link href="<%=basePath%>font-awesome-4.7.0/css/font-awesome.min.css" type="text/css" rel="stylesheet">

<script type="text/javascript" src="<%=basePath%>js/jquery-2.2.4.min.js"></script>
<script type="text/javascript" src="<%=basePath%>js/login.js"></script>
</head>

<body>
	<input type="hidden" id="basePath" value="<%=basePath %>" /><i class="fa fa-address-book"></i>
	<div class="login">
		<div class="message">honor校园文化商城-登录</div>
		<div id="darkbannerwrap"></div>

		<form method="post">
			<input name="admin/login.html" value="login" type="hidden"> <input
				name="name" placeholder="用户名" required="" type="text" class="name fa fa-lg" id="name">
				<!-- <i class="icon-user "></i> -->
				
			<hr class="hr15">
			<input name="password" placeholder="密码" required="" type="password" id="password">
			<hr class="hr15">
			<input value="登录" style="width:100%;" type="submit">
			<hr class="hr20">
			帮助 <a href="javascript(0)">忘记密码</a>
		</form>


	</div>

	<div class="copyright">
		© 2016品牌名称 by <a href="http://www.mycodes.net/" target="_blank">honor</a>
	</div>
</body>
</html>
