
$(function(){
	
	$.ajax({
		url:"getLeibienum.do",
		type:"get",
		success:function(data){
			var numa=eval(data);
			$.ajax({
				url:"getLeibie.do",
				type:"get",
				success:function(data){
					var leibie=eval(data);
					var rowleibie="";
					for(var i=0;i<leibie.length;i++){
						
						
						if(i%2==0){
						rowleibie+="<div class='t_lei'  style='margin:8px 0px 0px 0px' ><a href='leixing.jsp?leibieId="+leibie[i].leibieId+"' class='t_lei_0'><div class='t_lei_1'>"+leibie[i].body+"</div><div class='t_lei_2'>文章："+numa[i]+"</div></a>	</div>";
						}else{
							rowleibie+="<div class='t_lei pull-right'  style='margin:8px 0px 0px 0px' ><a href='leixing.jsp?leibieId="+leibie[i].leibieId+"' class='t_lei_0'><div class='t_lei_1'>"+leibie[i].body+"</div><div class='t_lei_2'>文章："+numa[i]+"</div></a>	</div>";
						}
						
					}
					$("#leibie").empty();
					$("#leibie").append(rowleibie);
				},
				error:function(){
					alert("数据访问失败");
				}
			});
		},
		error:function(){
			alert("数据访问失败");
		}
	});
	
	$.ajax({
		url:"getTie.do",
		type:"get",
		success:function(data){
			var tie=eval(data);
			var rowTie="";
			for(var i=0;i<tie.length;i++){
				
					rowTie+='<li class="media"><a href="grzx.jsp"><img src="images/a.jpg" class="herder"></a><div class="_body"><div><a href="wenzhang.do?tieId='+tie[i].tieId+'" id="tie_title">'+tie[i].title+'</a></div><div><a href="#">'+tie[i].leibieName+'</a>·<a href="grzx.jsp?username='+tie[i].userName+'">'+tie[i].userName+'</a>·'+tie[i].time+'</div></div><span class="pull-right lev">'+tie[i].dengji+'</span></li>';
				
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