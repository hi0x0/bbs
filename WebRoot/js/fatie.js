$(function(){
	$.ajax({
		url:"getLeibie.do",
		type:"get",
		success:function(data){
			var leibie=eval(data);
			var rowleibie="";
			for(var i=0;i<leibie.length;i++){
				rowleibie+="<option>"+leibie[i].body+"</option>";
			}
			$("#jiedian").empty();
			$("#jiedian").append(rowleibie);
		},
		error:function(){
			alert("数据访问失败");
		}
	});
//	$.ajax({
//		url:"leixing.do",
//		type:"post",
//		success:function(data){
//			bindSelect2(jQuery.parseJSON(data),"#leixing");
//			
//		},
//		error:function(){
//			alert("数据访问失败");
//		}
//	});
//	$.ajax({
//		url:"leixing.do",
//		type:"post",
//		success:function(data){
//			bindSelect2(jQuery.parseJSON(data),"#guanjianzi");
//			
//		},
//		error:function(){
//			alert("数据访问失败");
//		}
//	});
//	$.ajax({
//		url:"tezheng.do",
//		type:"post",
//		success:function(data){
//			bindSelect2(jQuery.parseJSON(data),"#tezheng");
//			
//		},
//		error:function(){
//			alert("数据访问失败");
//		}
//	});

//	function bindSelect2(data,id){
//		$(id).select2({
//			  data: data,
//			  placeholder:'请选择'
//			});
//	}	
	
	$("#guanjianzi").select2({
		tags: true
	});	
	$("#content").focus(function(){
		$("#input-box").css("box-shadow","#85B7D9 0px 0px 10px");
		$(this).css("background","#fff");
	});
	$("#content").blur(function(){
		$("#input-box").css("box-shadow","0px 0px 0px 0px");
		$(this).css("background","#EEEEEE");
	});
	$("#content1").focus(function(){
		$("#input-box1").css("box-shadow","#85B7D9 0px 0px 10px");
		$(this).css("background","#fff");
	});
	$("#content1").blur(function(){
		$("#input-box1").css("box-shadow","0px 0px 0px 0px");
		$(this).css("background","#EEEEEE");
	});
	
});