<%@ page language="java" import="java.util.*" import="com.myehr.common.util.LangUtil" pageEncoding="UTF-8"%>
<%@ include file="/common/common.jsp" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<style>
ul{list-style:none;height:100%;width:95%;margin:0 auto;min-width:680px;}
.half{
	width:49%;
	display:inline-block;
}
li:after {
	clear: both;
}
li{
	margin-bottom:-5px
}
.leftContent{
	text-align:right;
	float:right;
	width:100%;
	padding-right:30px;
}
.centerLine{
	display:inline-block;
	border-left:5px solid #3594cb;
	position:relative;
}
.rightContent{
	text-align:left;
	float:left;
	width:100%;
	padding-left:30px;
}
h4{
	text-align:left;
	word-break:break-all;
	border:1px solid #3594cb;
	padding:8px;
	border-radius:5px;
	margin:0;
	overflow-y:auto;
}
.image{
	width:100%;
	height:100%;
}
.imageSize{
	position: absolute;
    width: 50px;
    left: -28px;
    height: 50px;
    overflow: hidden;
    border-radius: 25px;
    border: 1px solid #3594cb;
}
.textContent{
}
.statu{
	width:100%;
	height:100%;
	text-align:center;
	border-radius:25px;
	border:none;
	box-shadow:none;
	color:#fff;
}
.success{
	background-color:#63D7A3;
}
.approving{
	background-color:#F5C86B;
}
.stop{
	background-color:#F88F87;
}
.actFreeTitle{
	text-align: center;
    font-size: 20px;
    margin: 30px auto;
}

</style>
<body>
	<p class='actFreeTitle'></p>
	<ul id="actConments">
		
		
	</ul>
	
	
<script>
$(function() {
	initConment();
    changeCSS();
    $(window).resize(function () {
		var MaxWidth = window.innerWidth;
		var MaxHeight = window.innerHeight;
		if(MaxWidth<700){
			
		}
	})
});
function changeCSS(){
	var textContents = $(".textContent");
	for(var i=0;i<textContents.length;i++){
		if(i == textContents.length-1){
			var liObj = textContents.eq(i).parent();
			var height = 48;
			liObj.find(".centerLine").css("height",height);
			liObj.find(".title").css("height",height);
			textContents.eq(i).css("height",height);
		}else{
			var liObj = textContents.eq(i).parent();
			var height = textContents.eq(i).height()+25;
			if(height<100){
				height = 100;
			}
			liObj.find(".centerLine").css("height",height);
			liObj.find(".title").css("height",height);
			textContents.eq(i).css("height",height);
			liObj.find("h4").css("max-height",height-25);
		}
	}
}
function initConment(){
	var datas = getActComents();
	var statu = datas.statu;
	var his = datas.his;
	$(".actFreeTitle").html(datas.title);//标题
	//if(his.length<4){
		for(var i=0;i<his.length;i++){
			var img = getEmpPhotoSYSx(his[i].assigree);
			var date =  new Date(his[i].starttime).Format("yyyy-MM-dd hh:mm:ss");
			var name = getUsernameById(his[i].assigree);
			var cell = '';
			if(i==0){
				cell =  '<li>\n'+
							'	<div class="half title">\n'+
							'		<div class="leftContent">\n'+
							'			<p>'+date+'</p>\n'+
							'			<p>'+name+'  '+his[i].result+'</p>\n'+
							'		</div>\n'+
							'	</div>\n'+
							'	<div class="centerLine">\n'+
							'		<div class="imageSize">\n'+
							'			<img class="image" src="'+img+'" onerror="this.src=\'http://localhost:9999/ww.jpeg\'"/>\n'+
							'		</div>\n'+
							'	</div>\n'+
							'	<div class="half textContent">\n'+
							'	</div>\n'+
							'</li>\n';
			}else{
				cell =  '<li>\n'+
							'	<div class="half title">\n'+
							'		<div class="leftContent">\n'+
							'			<p>'+date+'</p>\n'+
							'			<p>'+name+'  '+his[i].result+'</p>\n'+
							'		</div>\n'+
							'	</div>\n'+
							'	<div class="centerLine">\n'+
							'		<div class="imageSize">\n'+
							'			<img class="image" src="'+img+'" onerror="this.src=\'http://localhost:9999/ww.jpeg\'"/>\n'+
							'		</div>\n'+
							'	</div>\n'+
							'	<div class="half textContent">\n'+
							'		<div class="rightContent">\n'+
							'			<h4>\n'+
							'			'+his[i].coment+'\n'+
							'			</h4>\n'+
							'		</div>\n'+
							'	</div>\n'+
							'</li>\n';
			}
			$("#actConments").append(cell);
		}
	/*}else{
		for(var i=0;i<his.length;i++){
			var img = getEmpPhotoSYSx(his[i].assigree);
			var cell = '';
			var date =  new Date(his[i].starttime).Format("yyyy-MM-dd hh:mm:ss");
			var name = getUsernameById(his[i].assigree);
			if(i==0){
				cell =  '<li>\n'+
						'	<div class="half title">\n'+
						'		<div class="leftContent">\n'+
						'			<p>'+date+'</p>\n'+
						'			<p>'+name+'  '+his[i].result+'</p>\n'+
						'		</div>\n'+
						'	</div>\n'+
						'	<div class="centerLine">\n'+
						'		<div class="imageSize">\n'+
						'			<img class="image" src="'+img+'" onerror="this.src=\'http://localhost:9999/ww.jpeg\'"/>\n'+
						'		</div>\n'+
						'	</div>\n'+
						'	<div class="half textContent">\n'+
						'	</div>\n'+
						'</li>\n';
			}else{
				cell =  '<li>\n'+
						'	<div class="half title">\n'+
						'		<div class="leftContent">\n'+
						'			<p>'+date+'</p>\n'+
						'			<p>'+name+'  '+his[i].result+'</p>\n'+
						'		</div>\n'+
						'	</div>\n'+
						'	<div class="centerLine">\n'+
						'		<div class="imageSize">\n'+
						'			<img class="image" src="'+img+'" onerror="this.src=\'http://localhost:9999/ww.jpeg\'"/>\n'+
						'		</div>\n'+
						'	</div>\n'+
						'	<div class="half textContent">\n'+
						'		<div class="rightContent">\n'+
						'			<h4>\n'+
						'			'+his[i].coment+'\n'+
						'			</h4>\n'+
						'		</div>\n'+
						'	</div>\n'+
						'</li>\n';
				i++;	
				if(i<his.length){
					date =  new Date(his[i].starttime).Format("yyyy-MM-dd hh:mm:ss");
					name = getUsernameById(his[i].assigree);
					cell +=  '<li>\n'+
							'	<div class="half textContent">\n'+
							'		<div class="leftContent">\n'+
							'			<h4 style="text-align:right">\n'+
							'			'+his[i].coment+'\n'+
							'			</h4>\n'+
							'		</div>\n'+
							'	</div>\n'+
							'	<div class="centerLine">\n'+
							'		<div class="imageSize">\n'+
							'			<img class="image" src="'+img+'" onerror="this.src=\'http://localhost:9999/ww.jpeg\'"/>\n'+
							'		</div>\n'+
							'	</div>\n'+
							'	<div class="half title">\n'+
							'		<div class="rightContent">\n'+
							'			<p>'+date+'</p>\n'+
							'			<p>'+name+'  '+his[i].result+'</p>\n'+
							'		</div>\n'+
							'	</div>\n'+
							'</li>\n';
				}
			}
			$("#actConments").append(cell);
		}
	}*/
	var resultCell = '';
	if(statu == '0'){
		resultCell = 	'<li>\n'+
						'	<div class="half title">\n'+
						'	</div>\n'+
						'	<div class="centerLine">\n'+
						'		<div class="imageSize">\n'+
						'			<input class="statu success" readonly value="完成"/>\n'+
						'		</div>\n'+
						'	</div>\n'+
						'	<div class="half textContent">\n'+
						'	</div>\n'+
						'</li>\n';
	}else if(statu == '1' || statu == '2' ){
		resultCell = 	'<li>\n'+
						'	<div class="half title">\n'+
						'	</div>\n'+
						'	<div class="centerLine">\n'+
						'		<div class="imageSize">\n'+
						'			<input class="statu approving" readonly value="审批中"/>\n'+
						'		</div>\n'+
						'	</div>\n'+
						'	<div class="half textContent">\n'+
						'	</div>\n'+
						'</li>\n';
	}else if(statu == '3' ){
		resultCell = 	'<li>\n'+
						'	<div class="half title">\n'+
						'	</div>\n'+
						'	<div class="centerLine">\n'+
						'		<div class="imageSize">\n'+
						'			<input class="statu stop" readonly value="终止"/>\n'+
						'		</div>\n'+
						'	</div>\n'+
						'	<div class="half textContent">\n'+
						'	</div>\n'+
						'</li>\n';
	}
	$("#actConments").append(resultCell);
}

function getActComents(){
	var taskId = '${param.taskId}';
	var conments ;
	if(taskId==''){
		return ;
	}
	$.ajax({
		url: '${pageContext.request.contextPath }/actfree/getActByTaskId.action?taskId='+taskId,
		type:'post',
		cache: false,
		async: false,
		success: function (datas) {
			conments = datas;
		},
	});
	return conments;
}

function getEmpPhotoSYSx(e){
	var img = '';
	$.ajax({ 
		   url:'/myehr/FileList/getEmpPhotoByUserId.action?userId='+e,
		   type:'post',
		   cache: false,
		   async: false, 
		   success: function (data){ 
			   img = data[0];
		   }
	   });
	return img;
}

</script>
</body>
</html>