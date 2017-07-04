<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>文章</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<link href="css/bootstrap.css" rel="stylesheet" type="text/css">
	<link href="css/tie.css" rel="stylesheet" type="text/css">
	<script type="text/javascript" src="js/jquery-3.2.1.js" ></script>
	<script type="text/javascript" src="js/bootstrap.js" ></script>
	<script type="text/javascript" src="js/tie.js" ></script>
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
	<div class="row">
	
	<div class="col-md-8">
	<div class="p_title"><a>${tie.leibieName }</a></div>  
	<div class="p_body">
		<div>
		<ul class="media-list thread-list" id="tie">
			<li class="media">
				<a href="#"><img src="images/a.jpg" class="herder"></a>
				<div class="_body">
					<div><p>${tie.title}<span class="lev">1</span></p></div>
					<div><a href="#">${tie.userName}</a><span>·${tie.time}</span></div>
				</div>
				
				<div class="pull-right liulannum">
				<span><span>${tie.liulan }</span><br>浏览</span>
				</div>
				<div class="pull-right liuyannum">
				<span><span>142</span><br>留言</span>
				</div>
			</li>
		</ul>
		</div>
		<div id="tie_content" class="tie_content">${tie.tieContent }</div>
		<div class="zan_shouc">
			<div style="float:left;margin:0 10px 0 45%" class="zan"><a id="zan" href="zan.do?tieId=${tie.tieId}" class="btn _button">赞${zan.size() }</a><span></span></div>
			<div><a id="shoucang" href="shoucang.do?tieId=${tie.tieId}" class="btn _button">收藏</a></div>
		</div>
	</div>
	<div id="liuyan_m">
	<div class="p_title">留言</div>
	<div class="l_body">
	<div>
		<ul class="media-list thread-list" id="liuyan">
			<li class="media">
				<a href="#"><img src="images/a.jpg" class="herder"></a>
				<div class="_body">
					<div><a href="#">用户</a>·2017/5/25</div>
					<div id="liuyan_content" class="liuyan_content"></div>
				</div>
				<span class="pull-right"><a>@</a></span>
			</li>
		</ul>
		</div>
		</div>
	<div id="example" style="margin:10px 0" class="pull-right"></div>
	<form action="insertLiuyan.do" method="post">
	<input type="text" name="tieId" value="${tie.tieId}" style="display:none">
	<div class="form-group">
				
				<div class="col-md-12 input-box" id="input-box1">
				<div class="button-group">
					<button class="btn _button" title="粗体"><span>B</span></button>
					<button class="btn _button" title="斜体">I</button>
					<button class="btn _button" title="标题">H</button>
				</div>
				<div class="button-group">
					<button class="btn _button" title="链接">L</button>
					<button class="btn _button" title="网络图片">N</button>
					<button class="btn _button" title="上传本地图片"></button>
				</div>
				<div class="button-group">
					<button class="btn _button" title="无序列表">B</button>
					<button class="btn _button" title="有序列表">B</button>
					<button class="btn _button" title="行内代码">B</button>
					<button class="btn _button" title="块级代码">B</button>
					<button class="btn _button" title="引用">B</button>
				</div>
				<div class="button-group">
					<button class="btn _button" title="预览">B</button>
				</div>
				<div class="button-group-l pull-right">
					<button class="btn _button">B</button>
				</div>
					<textarea id="content1" name="liuyan_content" class=" _content" ></textarea>
				</div>
			</div>
			<div class="col-md-12 _submit">
				<input type="submit" value="评论" class="btn btn-default pull-right" style="margin-top:8px" id="fabu">
				
			</div>
	</form>
	</div>
	
	</div>
	
	</div>
	</div>
	<div class="footer"></div>
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
	
	<%
			if(session.getAttribute("username")==null){
		%>
			<script type="text/javascript">
				$('#zan').click(function(){
					alert("请先登录");
					return false;
				});
				$('#shoucang').click(function(){
					alert("请先登录");
					return false;
				});
			</script>
		<% 
			}else{}
		%>
  </body>
</html>
