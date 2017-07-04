<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>注册</title>
    
	<link href="css/bootstrap.css" rel="stylesheet" type="text/css">
	<link href="css/zhuce.css" rel="stylesheet" type="text/css">
	<script type="text/javascript" src="js/jquery-3.2.1.js" ></script>
	<script type="text/javascript" src="js/bootstrap.js" ></script>

  </head>
  
  <body>
  
  <div class="container">
   
					<form action="adduser.do" method="post">
						<div class="form-group">
							<label><span>用户名:</span></label>
							<input type="text" name="username" class="form-control">
						</div>
						<div class="form-group">
							<label><span>邮箱地址:</span></label>
							<input type="text" name="email" class="form-control">
						</div>
				    	<div class="form-group">
							<label><span>密码:</span></label>
							<input type="password" name="password" class="form-control">
						</div>
						<div class="form-group">
							<label><span>再次输入密码:</span></label>
							<input type="password" name="repassword" class="form-control">
						</div>
				    	<div class="form-group">
							<label><span>头像:</span></label>
							<input type="text" name="headerimg" class="form-control">
						</div>
				    	
				    	<p><input type="submit" value="注册" class="btn btn-default"></p>
   					 </form>
   					 </div>
				
  </body>
  <div class="footer"></div>
</html>
