var options1;
var options2;
var options3;
$(function(){
	function GetQueryString(name)
	{
	     var reg = new RegExp("(^|&)"+ name +"=([^&]*)(&|$)");
	     var r = window.location.search.substr(1).match(reg);
	     if(r!=null)return  unescape(r[2]); return null;
	}
	
	$.ajax({
		url:"getfatie.do?username="+GetQueryString("username"),
		type:"get",
		async: false,
		success:function(data){
			var fatie=eval(data);
			var rowfaTie="";
			//12
			//parseInt(fatie.length/12)+1
			options1={
					currentPage: parseInt(GetQueryString("page1")), //默认选择
					totalPages: parseInt(fatie.length/12)+2, //多少页
					numberOfPages:10, //一条显示多少
					pageUrl: function(type, page, current){
						return "grzx.jsp?username="+GetQueryString("username")+"&page="+page;
					}
			};
			for(var i=0;i<fatie.length;i++){
				
					rowfaTie+='<li class="media _tie"><div class="_body"><div><a href="wenzhang.do?tieId='+fatie[i].tieId+'">'+fatie[i].title+'</a></div><div><span>'+fatie[i].time+'·浏览'+fatie[i].liulan+'·点赞'+fatie[i].zan+'</span></div></div><span class="pull-right lev"><span>'+fatie[i].dengji+'</span></span></li>';
				
			}
			$("#fatie_body").empty();
			$("#fatie_body").append(rowfaTie);
			$("#fatienum").empty();
			$("#fatienum").append('<span style="font-size: 7px"><span style="font-size: 18px">'+fatie.length+'</span><br>发帖</span>');
			
		},
		error:function(){
			alert("数据访问失败");
		}
	});
	$.ajax({
		url:"gethuifu.do?username="+GetQueryString("username"),
		type:"get",
		success:function(data){
			var huifu=eval(data);
			var rowhuifu="";
			for(var i=0;i<huifu.length;i++){
				
					rowhuifu+='<li class="media _huifu"><div class="_body"><div><p>回复了<a href="grzx.jsp?username='+huifu[i].userName+'"> '+huifu[i].userName+' </a>创建的主题 <a href="wenzhang.do?tieId='+huifu[i].tieId+'">'+huifu[i].title+'</a> </p></div></div><span class="pull-right">'+huifu[i].time+'</span></li>';
				
			}
			$("#huifu_body").empty();
			$("#huifu_body").append(rowhuifu);
			$("#huifunum").empty();
			$("#huifunum").append('<span style="font-size: 7px"><span style="font-size: 18px">'+huifu.length+'</span><br>回复</span>');
			
		},
		error:function(){
			alert("数据访问失败");
		}
	});
	$.ajax({
		url:"getshoucang.do?username="+GetQueryString("username"),
		type:"get",
		success:function(data){
			var shoucang=eval(data);
			var rowshoucang="";
			for(var i=0;i<shoucang.length;i++){
				
					rowshoucang+='<li class="media _tie"><div class="_body"><div><a href="wenzhang.do?tieId='+shoucang[i].tieId+'">'+shoucang[i].title+'</a></div><div><span>'+shoucang[i].time+'·浏览'+shoucang[i].liulan+'·点赞'+shoucang[i].zan+'</span></div></div><span class="pull-right lev"><span>'+shoucang[i].dengji+'</span></span></li>';
				
			}
			$("#shoucang_body").empty();
			$("#shoucang_body").append(rowshoucang);
		},
		error:function(){
			alert("数据访问失败");
		}
	});
	
	
		
		
		
	

	
		
		
		
	
	

	
	$(".mytab a").click(function(e){
		$(this).tab('show');
		return false;
	});
	
	options2={
			currentPage: 1, //默认选择
			totalPages: 20, //多少页
			numberOfPages:10, //一条显示多少
			pageUrl: function(type, page, current){
				return "grzx.jsp?username="+GetQueryString("username")+"&page="+page;
			}
	};
	options3={
			currentPage: 1, //默认选择
			totalPages: 20, //多少页
			numberOfPages:10, //一条显示多少
			pageUrl: function(type, page, current){
				return "grzx.jsp?username="+GetQueryString("username")+"&page="+page;
			}
	};
	
	$('#example1').bootstrapPaginator(options1);
	$('#example2').bootstrapPaginator(options2);
	$('#example3').bootstrapPaginator(options3);
});