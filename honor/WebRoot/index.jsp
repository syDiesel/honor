<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<link rel="icon" href="<%=basePath%>img/logo.jpg" type="image/x-icon">
  </head>
  
  <body>
    <h1>登录</h1>
      <table>
        <form method="get" action="/honor/user/login">
          <input type="text" name="username" value=""><br>
          <input type="password" name="password" value=""><br>
          <input type="submit" value="登录">
        </form>
      </table>
      <form method="post" action="/honor/user/image" enctype="multipart/form-data">
        <input type="file" name="img" value=""><br>
        <input type="submit" value="上传">
      </form>
  <hr/>
      <h1>注册</h1>
      <table>
          <form method="post" action="/honor/user/register">
              <input type="text" name="username" value=""><br>
              <input type="password" name="password" value=""><br>
              <input type="submit" value="注册">
          </form>
      </table>
   <c:forEach items="${list}" var="item">
       ${item.name}--${item.id}
   </c:forEach>
  </body>
</html>
