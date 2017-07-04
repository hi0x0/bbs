<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>发帖</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<link href="css/bootstrap.css" rel="stylesheet" type="text/css">
	<link href="css/fatie.css" rel="stylesheet" type="text/css">
	<link href="css/select2.css" rel="stylesheet" type="text/css">
	<script type="text/javascript" src="js/jquery-3.2.1.js" ></script>
	<script type="text/javascript" src="js/bootstrap.js" ></script>
	<script type="text/javascript" src="js/select2.js" ></script>
	<script type="text/javascript" src="js/select2.full.js" ></script>
	<script type="text/javascript" src="js/fatie.js" ></script>

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
	<div class="p_title">发布新文章</div>  
	<div class="p_body">
		<form action="fatie.do" method="post">
			<div class="form-group">
				<lable><span>文章名称</span></lable>
				<input type="text" name="tiename" id="tiename" class="form-control">
			</div>
			<div class="form-group" id="guanjianzi_div">
				<lable><span>关键字</span></lable>
				<p>
				<select name="guanjianzi" class="form-control" id="guanjianzi" multiple="multiple">
				</select>
				</p>
			</div>
			<div class="form-group">
				<lable><span>查看等级</span></lable>
				<input type="number" max="10" name="dengji" id="dengji" required class="form-control ng-valid-number ng-valid-max ng-dirty ng-valid ng-valid-required">
			</div>
			<div class="form-group">
				<lable><span>所属节点</span></lable>
				<select name="jiedian" class="form-control " id="jiedian" >
					
				</select>
			</div>
			<!-- 
			<div class="form-group">
				<lable><span>漏洞成因</span></lable>
				<div class="col-md-12 input-box" id="input-box">
				<div class="button-group">
					<button class="btn _button">B</button>
					<button class="btn _button">B</button>
					<button class="btn _button">B</button>
				</div>
				<div class="button-group">
					<button class="btn _button">B</button>
					<button class="btn _button">B</button>
					<button class="btn _button">B</button>
				</div>
				<div class="button-group">
					<button class="btn _button">B</button>
					<button class="btn _button">B</button>
					<button class="btn _button">B</button>
					<button class="btn _button">B</button>
					<button class="btn _button">B</button>
				</div>
				<div class="button-group">
					<button class="btn _button">B</button>
				</div>
				<div class="button-group-l pull-right">
					<button class="btn _button">B</button>
				</div>
					<textarea id="content" name="chengyin_content" class=" _content" ></textarea>
				</div>
			</div> 
			 -->
			<div class="form-group">
				<lable><span>文章内容</span></lable>
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
					<textarea id="content1" name="wenzhang_content" class=" _content" ></textarea>
				</div>
			</div> 
			<!-- 
			<div class="form-group">
				<lable><span>版本号</span></lable>
		
				<input class="form-control" type="text" name="verssion">
				
			</div>
			<div class="form-group">
				<lable><span>披露时间</span></lable>
		
				<input class="form-control" type="text" name="pilu">
				
			</div>
			<div class="form-group">
				<lable><span>引用地址</span></lable>
		
				<input class="form-control" type="text" placeholder="http://www.example.com" name="yinyong" id="yinyong">
				
			</div>
			
			 -->
			<div class="col-md-12 _submit">
				<input type="submit" value="发布" class="btn btn-default" style="margin-top:8px" id="fabu">
				
			</div>
		</form>
		
	</div>
	</div>
	
	<div class="col-md-4">
	<div class="p_title">格式要求</div>
	<div class="t_body" style="margin:10px 0px 0px 0px" >
		<p>1.写文章时请遵守相关法律法规,详情请见法律声明</p>
		
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
							<label><span>账号:</span></label>
							<input type="text" name="username" class="form-control">
						</div>
				    	<div class="form-group">
				    		<label><span>password:</span></label>
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
