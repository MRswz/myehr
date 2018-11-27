<%@page pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
	String id = request.getParameter("id")==null?"0": request.getParameter("id");
 %>
<%@page import="java.util.List"%>
<%@ include file="/common/common.jsp" %>
<html>
<head>

<title>信息查看</title>
<meta http-equiv="content-type" content="text/html; charset=UTF-8" />
<script type="text/javascript" src="<%=request.getContextPath() %>/jsp/form/formcreate/UMedit/utf8-jsp/ueditor.config.js"></script>
<script type="text/javascript" src="<%=request.getContextPath() %>/jsp/form/formcreate/UMedit/utf8-jsp/ueditor.all.min.js"></script>

<style>
	.mini-outlookbar-border{
	overflow:hidden;
	position: static;
	}
	.mini-outlookbar-group{
	position:static;
	height:auto;
	overflow:hidden;
	}
	.mini-panel-border{
	position: relative;
	overflow: hidden;
	border: none;
	}
	.mini-grid-columns{
	position:relative;
	overflow:visible;
	}
	#info{
	font-family: Microsoft YaHei,PingFang SC,"微软雅黑","黑体",Helvetica,Arial,sans-serif;
	}
	
	#info-tag{
    color: #999999;
    line-height: 25px;
    width:96%;
    overflow:hidden;
	white-space:nowrap;
    }
    
    
    #ueditor_0{
    width:98% !important;
    margin-left:1%;
    }
    
    #edui1,#edui1_iframeholder{ 
    width:100% !important;
    text-align:left;
    background-color:#fff;
    height:100%;
    
    
    }
    
    #info{
    	 background-color:#fff;
    	 height:100%;
    	
    }
    
    h1{
    line-height:36px;
    }
    
    
    
    .author{
    	border-top:solid 1px #f2f2f2;
    	color:#333;
    	text-align:right;
    }
    
     
    .color-blue{
		color:#1490ff;	
	}
	#info-title{
	overflow:hidden;
	white-space:nowrap;
	}
	*{
		margin:0px;
		padding:0px;
	}
	.title{
	text-align:center;
	}
	.name{
	overflow:hidden;
	white-space:nowrap;
	text-align:center;
	}
	body{
    height:100%;
	}
	li{
	white-space:nowrap;
	text-align:center;
	text-align:left;
	}
	

	
</style>
</head>
<body>
<div class="container-fluid">
	<div style="margin: 0 auto;">
		<div id="info" style="width:75%; margin: 0 auto;">
			<!-- 标题栏 -->
			<div id="info-title" style="text-align: center;padding-bottom:10px;padding-top:5px;width:80%;margin-left: 10%;">
				<h1 style="font-size: x-large;white-space: normal;" >
					<span style="color:#d02c2c; "></span><span id="title"></span>
				</h1>
			</div>
			<!-- 摘要 -->	
			<div id="info-tag" style="line-height:36px;height:35px;text-align:center;border-bottom:1px solid #f2f2f2;border-top:1px solid #f2f2f2;width:80%;margin-left: 10%;">
				<span >发布时间：</span>
				<span id="creatorTime"></span>
				<span style="margin-left: 5px;margin-right:5px;">| 来源：</span>
				<span style="padding-right:20px;" id="creatorTelnetName">省联社</span>
				<span>| 责任编辑：</span><span id="createUser" class="color-blue" ></span></div>
				<!--内容 -->
			<div class="content" style="width:80%;margin-left: 10%;">
				 <script id="editor"  type="text/plain"></script>
			</div>
		</div>	
    </div>             
 </div>
</body>
<script type="text/javascript">
	var id=<%=id %>;
	var ue;
	function initData() {
		var strUrl=window.location.href;
		var arrUrl=strUrl.split("/");
		var strPage=arrUrl[arrUrl.length-1];
		strPage=strPage.split("?")[0];
		var orgid=parent.orgid;
		var json={"id":id};
		  var url = "${pageContext.request.contextPath }/announcement/getAnnouncementById.action?id=<%=request.getParameter("id") %>";  
		json.strPage=strPage;
		$.ajax({
			url: url,
			type: 'POST',
			data: null,
			cache: false,
			async: false,
			contentType: 'text/json',
			success: function(text){
				var data = text;
				//alert(data.infoTypeName);
				
				if(data){
					ue.setContent(data.infoDetail);
					docSetValue('title',data.title);
					docSetValue('createUser',data.createUserName);
					//docSetValue('creatorTelnetName',"");
					docSetValue('creatorTime',formatDateTime(data.createTime));
					//creatorTelnetName
					//parent.clearNavIndex();
					//parent.setBrowseTitle("【"+data.infoTypeName+"】"+$("#title").html());
					
				}else{
					alert("获取信息详情出错，请联系管理员！");
				}
				
			},
			error: function(jqXHR, textStatus, errorThrown){},
			
		});
	}
	
	
	initTools();	
	function initTools(){
		ue = UE.getEditor('editor',{
			    toolbars: [],
			    initialFrameHeight:"100%",
			    enableAutoSave:false,
			    readonly:true
			});
			
		ue.addListener( 'ready', function( editor ) {
			document.getElementById('edui1_bottombar').style.display="none";
			
			
			$('.edui-editor').css('border-width','0px');
			
			
			initData();
		 } ); 
	}
	
	function docSetValue(id,val){
		document.getElementById(id).innerHTML=val;
	}
	
	
	function formatDateTime(inputTime) {    
	    var date = new Date(inputTime);  
	    var y = date.getFullYear();    
	    var m = date.getMonth() + 1;    
	    m = m < 10 ? ('0' + m) : m;    
	    var d = date.getDate();    
	    d = d < 10 ? ('0' + d) : d;    
	    var h = date.getHours();  
	    h = h < 10 ? ('0' + h) : h;  
	    var minute = date.getMinutes();  
	    var second = date.getSeconds();  
	    minute = minute < 10 ? ('0' + minute) : minute;    
	    second = second < 10 ? ('0' + second) : second;   
	    return y + '-' + m + '-' + d+' '+h+':'+minute+':'+second;    
	}
	

</script>
</html>