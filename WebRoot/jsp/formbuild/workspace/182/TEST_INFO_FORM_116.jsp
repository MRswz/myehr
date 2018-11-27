<%@ page language="java" import="java.util.*" import="com.myehr.common.util.LangUtil" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<%
	HttpSession s = request.getSession();
	String userName=(String)session.getAttribute("userName");
	String userCode=(String)session.getAttribute("userCode");
	String softwareTitle=(String)session.getAttribute("softwareTitle");
	String empid=session.getAttribute("empid")+"";
	String userId=session.getAttribute("userid")+"";
%>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" type="text/css" href="../../js/example/css/style.css" />
<script type="text/javascript" src="../../js/example/js/index.js"></script>
<script type="text/javascript" src="../../js/example/js/jquery-1.10.2.min.js"></script>
<script type="text/javascript" src="../../js/freewall.js"></script>
<style type="text/css">
	body{
		color:#000;
		text-shadow:none;
		font-family: Microsoft YaHei;
	}
	li{
		list-style-type:none;
	}
	#container {
      width: 80%;
      margin: auto;
    }
    .item {
      background: rgb(135, 199, 135);
      width: 320px;
      height: 320px;
    }
	.waitProcessx{
	  width: 525px;
	}
	.waitProcess{
		margin:20px 0 40px 0;
		height:400px;
		overflow-y:auto;
	}
	.DL_HANG_CELL{
		display:flex;
		padding:10px;
	}
	.DL_PHOTO_HEAD{
	}
	.DL_PHOTO_HEAD img{
		width:50px;
		height:50px;
		border-radius:25px;
	}
	.DL_PHOTO_CONTENT{
		background-color:#fcfcfc;
		position:relative;
		margin-left:10px;
	}
	.DL_PHOTO_CONTENT .DL_PHOTO_CONTENT_HANG1{
		margin:0 10px;
		float:left;
	}
	.DL_PHOTO_CONTENT .DL_PHOTO_CONTENT_HANG2{
		margin:0 10px;
		float:left;
		color:#CD0;
	}
	.DL_PHOTO_CONTENT .DL_PHOTO_CONTENT_HANG1 .processname{
		margin:0 10px;
		width:70px;
		overflow-x:hidden;
	}
	.DL_PHOTO_CONTENT .DL_PHOTO_CONTENT_HANG1 .processtitle{
		margin:0 10px;
		width:150px;
		overflow-x:hidden;
		color:#4567BC;
	}
	.DL_PHOTO_CONTENT .DL_PHOTO_CONTENT_HANG2 .processparent{
		margin:0 10px;
		width:70px;
		overflow-x:hidden;
	}
	.DL_PHOTO_CONTENT .DL_PHOTO_CONTENT_HANG2 .processstatus{
		margin:0 10px;
		width:150px;
		overflow-x:hidden;
	}
	.DL_PHOTO_CONTENT .DL_PHOTO_CONTENT_HANG2 .processtime{
		margin:0 10px;
		width:100px;
		text-align:right;
		overflow-x:hidden;
	}
	.DL_PHOTO_CONTENT .processimportant{
		position:absolute;
		top:0;
		right:0;
		width:50px;
		border:none;
		text-align:center;
	}
	.five-star{
		background-color:#fc4b6c;
	}
	.one-star{
		background-color:#9BBB59;
	}
	h5{
		text-shadow:none;
		float:left;
		font-family: Microsoft YaHei;
	}
</style>
<body>
<div id="container">
	<div class="brick waitProcessx" >
		<ul class="waitProcess">
			
		</ul>
	</div>
	<div class="brick size11">
		
	</div>
	<div class="brick size11">
		
	</div>
	<div class="brick size11">
		
	</div>
	<div class="brick size11">
		
	</div>
	<div class="brick size11 example-draggable" data-draggable=1>
		
	</div>
	<div class="brick size11">
		
	</div>
	<div class="brick size11">
		
	</div>
</div>

<script>

	$(function() {
		freeWallConfig();
		var data = getAllData();
      	initWaitLines(data);
    });
	
	function freeWallConfig(){
		var wall = new freewall("#container");
		wall.fitWidth();
		wall.reset({
			selector: '.brick',
			cellW: 450,
			cellH: 'auto',
			onResize: function() {
				wall.fitWidth();
			}
		});
	}
	
	function getAllData(){
		var datas = {};
		$.ajax({
			url: "/myehr/dragconfig/getDragAllDatas.action",
			type: 'post',
			cache: false,
			async: false,
			success: function (data) {
				datas = data;
			 }
		});
		return datas;
	}
	
	function initWaitLines(e){
		var datas = e.waitDatas.rows; 
		for(var i = 0 ; i < datas.length ; i++){
			var data = datas[i];
			var cell = '';
			if(i==0){
					cell =  '<li>'+
							'	<div class="DL_HANG_CELL">'+
							'		<div class="DL_PHOTO_HEAD"><img src="'+data.createrPhoto+'" onerror="src=\'http://localhost:9999/人员照片/系统管理员_sysadmin.jpg\'"/></div>'+
							'		<div class="DL_PHOTO_CONTENT">'+
							'			<div class="DL_PHOTO_CONTENT_HANG1"><h5 class="processname">'+data.assigneeName+'</h5><h5 class="processtitle">'+data.title+'</h5></div>'+
							'			<div class="DL_PHOTO_CONTENT_HANG2"><h5 class="processparent">'+data.prevAssigneeName+'</h5><h5 class="processstatus">'+data.status+'</h5><h5 class="processtime">'+data.createAgo+'</h5></div>'+
							'			<input class="processimportant five-star" readonly value="紧急"/>'+
							'		</div>'+
							'	</div>'+
							'</li>';
			}else{
					cell =  '<li>'+
							'	<div class="DL_HANG_CELL">'+
							'		<div class="DL_PHOTO_HEAD"><img src="'+data.createrPhoto+'" onerror="src=\'http://localhost:9999/人员照片/系统管理员_sysadmin.jpg\'"/></div>'+
							'		<div class="DL_PHOTO_CONTENT">'+
							'			<div class="DL_PHOTO_CONTENT_HANG1"><h5 class="processname">'+data.assigneeName+'</h5><h5 class="processtitle">'+data.title+'</h5></div>'+
							'			<div class="DL_PHOTO_CONTENT_HANG2"><h5 class="processparent">'+data.prevAssigneeName+'</h5><h5 class="processstatus">'+data.status+'</h5><h5 class="processtime">'+data.createAgo+'</h5></div>'+
							'			<input class="processimportant one-star" readonly value="代办"/>'+
							'		</div>'+
							'	</div>'+
							'</li>';
			}
			
			$(".waitProcess").append(cell);
		}
		
	}
		
</script>
</body>
</html>