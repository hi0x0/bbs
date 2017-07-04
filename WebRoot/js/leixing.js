
$(function(){
	
	function GetQueryString(name)
	{
	     var reg = new RegExp("(^|&)"+ name +"=([^&]*)(&|$)");
	     var r = window.location.search.substr(1).match(reg);
	     if(r!=null)return  unescape(r[2]); return null;
	}
	 
	
	$.ajax({
		url:"getLeiBieTie.do?leibieId="+GetQueryString("leibieId"),
		type:"get",
		success:function(data){
			var tie=eval(data);
			var rowTie="";
			for(var i=0;i<tie.length;i++){
				
					rowTie+='<li class="media"><a href="#"><img src="images/a.jpg" class="herder"></a><div class="_body"><div><a href="wenzhang.do?tieId='+tie[i].tieId+'" id="tie_title">'+tie[i].title+'</a></div><div><a href="#">'+tie[i].leibieName+'</a>·<a href="#">'+tie[i].userName+'</a>·'+tie[i].time+'</div></div><span class="pull-right lev">'+tie[i].dengji+'</span></li>';
				
			}
			$("#tie").empty();
			$("#tie").append(rowTie);
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
	
	
});