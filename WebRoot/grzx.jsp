<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'grzx.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<link href="css/bootstrap.css" rel="stylesheet" type="text/css">
	<link href="css/grzx.css" rel="stylesheet" type="text/css">
	<script type="text/javascript" src="js/jquery-3.2.1.js" ></script>
	<script type="text/javascript" src="js/bootstrap.js" ></script>
	<script type="text/javascript" src="js/grzx.js" ></script>
	<script type="text/javascript" src="js/bootstrap-paginator.js" ></script>

  </head>
  
  <body>
    <div class="bar">
   
   	
   	<ul>
   		<% 
			if(session.getAttribute("username")==null){
		%>
		<li class="herder_bar"><a href="index.jsp" class="bar_a" style="float:left">首页</a></li>
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
					<ul class="dropdown-menu " role="menu" aria-labelledby="dLabel">
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
		<div class="row title">
			<img src="images/a.jpg">
			<p>aaa</p>
			<div class="b">
				<div class="fatienum" id="fatienum">
					<span style="font-size: 7px"><span style="font-size: 18px">0</span><br>发帖</span>
				</div>
				<div class="huifunum" id="huifunum">
					<span style="font-size: 7px"><span style="font-size: 18px">0</span><br>回复</span>
				</div>
			</div>
		</div>
		<div class="row">
		<ul class="nav nav-tabs nav-justified mytab">
				<li class="active"><a href="#fatie">发帖</a></li>
				<li><a href="#huifu">回复</a></li>
				<li><a href="#shoucang">收藏</a></li>
		</ul>
		</div>
		<div class="row" style="margin-top: 40px;">
		<div class="col-md-9">
		<div class="tab-content" >
			<div role="tabpanel" class="tab-pane active mytab-p" id="fatie" >
				<div class="mytab-title"><p>发帖</p></div>
				<div class="p_body">
					<ul class="media-list thread-list" id="fatie_body">
						<li class="media _tie">
							<div class="_body">
								<div><a href="#">标题</a></div>
								<div><span>2017/5/25·浏览0·点赞0</span></div>
								
							</div>
							<span class="pull-right lev"><span>1</span></span>
						</li>
					</ul>
				</div>
				<div id="example1" style="margin:10px 0" class="pull-right"></div>
			</div>
			<div role="tabpanel" class="tab-pane mytab-p" id="huifu">
				<div class="mytab-title"><p>回复</p></div>
				<div class="p_body">
					<ul class="media-list thread-list" id="huifu_body">
						<li class="media _huifu">
							<div class="_body">
								<div><p>回复了<span> 用户 </span>创建的主题 <span>标题</span> </p></div>
							</div>
							<span class="pull-right">2016/11/08 11:14:40</span>
						</li>
						<li class="media _huifu">
							<div class="_body">
								<div><p>回复了<span> 用户 </span>创建的主题 <span>标题</span> </p></div>
							</div>
							<span class="pull-right">2016/11/08 11:14:40</span>
						</li>
					</ul>
				</div>
				<div id="example2" style="margin:10px 0" class="pull-right"></div>
			</div>
			<div role="tabpanel" class="tab-pane mytab-p" id="shoucang">
				<div class="mytab-title"><p>收藏</p></div>
				<div class="p_body">
					<ul class="media-list thread-list" id="shoucang_body">
						<li class="media _tie">
							<div class="_body">
								<div><a href="#">标题</a></div>
								<div><a href="#">板块</a>·<a href="#">用户</a>·2017/5/25</div>
							</div>
							<span class="pull-right lev"><span>1</span></span>
						</li>
					</ul>
				</div>
				<div id="example3" style="margin:10px 0" class="pull-right"></div>
			</div>
		</div>
		</div>
		
		</div>
	</div>
	<div class="footer"></div>
  </body>
</html>
