$(function(){
	function GetQueryString(name)
	{
	     var reg = new RegExp("(^|&)"+ name +"=([^&]*)(&|$)");
	     var r = window.location.search.substr(1).match(reg);
	     if(r!=null)return  unescape(r[2]); return null;
	}
	$.ajax({
		url:"getAllLiuYan.do?tieId="+GetQueryString("tieId"),
		type:"get",
		success:function(data){
			var liuyan=eval(data);
			var rowLiuyan="";
			for(var i=0;i<liuyan.length;i++){
				
					rowLiuyan+='<li class="media"><a href="#"><img src="images/a.jpg" class="herder"></a><div class="_body"><div><a href="#">'+liuyan[i].userName+'</a><span>·'+liuyan[i].time+'</span></div><div id="liuyan_content" class="liuyan_content">'+liuyan[i].body+'</div></div><span class="pull-right"><a>@</a></span></li>';
				
			}
			$("#liuyan").empty();
			$("#liuyan").append(rowLiuyan);
		},
		error:function(){
			alert("数据访问失败");
		}
	});

	var options={
			currentPage: 1,
			totalPages: 10,
			numberOfPages:10
	};
	
	$('#example').bootstrapPaginator(options);
	$("#content1").focus(function(){
		$("#input-box1").css("box-shadow","#85B7D9 0px 0px 10px");
		$(this).css("background","#fff");
	});
	$("#content1").blur(function(){
		$("#input-box1").css("box-shadow","0px 0px 0px 0px");
		$(this).css("background","#EEEEEE");
	});
	 
	
});
