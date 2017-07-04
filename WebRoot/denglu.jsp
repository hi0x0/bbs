<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>登录</title>
    
		<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<link href="css/bootstrap.css" rel="stylesheet" type="text/css">
	<link href="css/fatie.css" rel="stylesheet" type="text/css">
	<link href="css/select2.css" rel="stylesheet" type="text/css">
	<script type="text/javascript" src="js/jquery-3.2.1.js" ></script>
	<script type="text/javascript" src="js/bootstrap.js" ></script>
	<script type="text/javascript" src="js/select2.js" ></script>
	<script type="text/javascript" src="js/a.js"></script>

  </head>
  
  <body>
    
    <script type="text/javascript">
$(document).ready(function() {
  $(".js-example-basic-single").select2();
});
</script>

<select class="js-example-basic-single">
  <option value="AL">Alabama</option>
  <option value="WY">Wyoming</option>
</select>
    
  </body>
</html>
