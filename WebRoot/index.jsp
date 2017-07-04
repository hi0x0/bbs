<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>论坛</title>
    <meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
    
	
	<link href="css/bootstrap.css" rel="stylesheet" type="text/css">
	<link href="css/index.css" rel="stylesheet" type="text/css">
	<script type="text/javascript" src="js/jquery-3.2.1.js" ></script>
	<script type="text/javascript" src="js/bootstrap.js" ></script>
	<script type="text/javascript" src="js/bootstrap-paginator.js" ></script>
	<script type="text/javascript" src="js/index.js" ></script>
	
	

  </head>
  
  <body>
 
<div class="bar">
   
   	
   	<ul>
   		<% 
			if(session.getAttribute("username")==null){
		%>
		<li class="herder_bar"><a href="index.jsp" class="bar_a"  style="float:left">首页</a></li>
   		<li class="herder_bar"><a href="zhuce.jsp" class="bar_a"  style="float:left">注册</a></li>
   		<li><button class="bar_a" data-toggle="modal" data-target="#denglu" style="float:left">登录</button></li>
   		<% 
			}else{
		%>
				<li style="float:left;"><a href="index.jsp" class="bar_a" >首页</a></li>
				<li >
				<div class="dropdown"  style="margin-left:66%">
					<a  class="drop_a" href="#" data-toggle="dropdown">
					<img src="images/a.jpg" class="bar_img" >
					<span class="bar_a" ><%=request.getSession().getAttribute("username")%></span>
					</a>
					<ul class="dropdown-menu" role="menu" aria-labelledby="dLabel">
    				<li><a href="grzx.jsp?username=<%=request.getSession().getAttribute("username")%>">个人中心</a></li>
    				<li><a>激活</a></li>
    				<li><a href="quit.do">退出</a></li>
 	 				</ul>
 	 			</div>
 	 			</li>
				
		<%
			}
		%>
   	</ul>
	</div>

<div class="container">
	<div class="row">
	
	<div class="col-md-8">
	<div class="p_title">热门文章</div>  
	<div class="p_body">
		<ul class="media-list thread-list" id="tie">
			<li class="media">
				<a href="#"><img src="images/a.jpg" class="herder"></a>
				<div class="_body">
					<div><a href="#">标题</a></div>
					<div><a href="#">板块</a>·<a href="#">用户</a>·2017/5/25</div>
				</div>
				<span class="pull-right lev">1</span>
			</li>
			

		</ul>
		
	</div>
	<div id="example" style="margin:10px 0" class="pull-right"></div>
	</div>
	
	<div class="col-md-4">
	<div class="p_title">板块分类</div>
	<div class="t_body" id="leibie" style="margin:10px 0px 0px 0px" >
		
	</div>
	</div>
	</div>
</div>
<div class="footer"></div>
<div class="float_div">
	<a href="#" class="float_div1"><div><img src="images/a.jpg"></div></a>
	<a href="fatie.jsp" target="_blank" class="float_div2"><div><img src="images/a.jpg"></div></a>
		<%
			if(session.getAttribute("username")==null){
		%>
			<script type="text/javascript">
				$('.float_div2').click(function(){
					alert("请先登录");
					return false;
				});
			</script>
		<% 
			}else{}
		%>
				
			
</div>

    <div class="modal fade" id="denglu" >
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal" aria-lable="Close"><span aria-hidden="true">&times;</span></button>
					<h4 class="modal-title" id="noFadeLabel">登录</h4>
				</div>
				<div class="modal-body">
					<form action="denglu.do" method="post">
						<div class="form-group">
							<label><span>邮箱:</span></label>
							<input type="text" name="username" class="form-control">
						</div>
				    	<div class="form-group">
				    		<label><span>密码:</span></label>
				    		<input type="password" name="password" class="form-control">
				    	</div>
				    	
				    	<input type="submit" value="登录" class="btn btn-default">
  					  </form>
				</div>
			</div>
		</div>
	</div>
  </body>
</html>
