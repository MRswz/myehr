<%@ page language="java" import="java.util.*" import="com.myehr.common.util.LangUtil" pageEncoding="UTF-8"%>
<%@ include file="/common/cardcommon.jsp" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>新闻公告</title>

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
	font-size: 14px;
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
    line-height:8px;
    }
    
    
    
    .author{
    	border-top:solid 1px #f2f2f2;
    	color:#333;
    	font-size:16px;
    	text-align:right;
    }
    
     
    .color-blue{
		color:#1490ff;	
	}
	#info-title{
	overflow:hidden;
	white-space:nowrap;
	}
	li{
	overflow:hidden;
	white-space:nowrap;
	}
	*{
		margin:4px;
		padding:0px;
	}
	body{
	height:100%}

	
</style>
<body style="">
	
<div id="allContent" style="position: absolute; top: 0px; left: 0px; right: 0px; min-height: 100%;">
	<div id="topContent" style="position: absolute; bottom: 40px; width: 100%; top: 0px;">
	<div id="info" style="padding-left: 20px; padding-right: 20px; padding-bottom: 25px; border: 1px solid rgb(234, 234, 234); left: 0px; right: 300px; position: absolute;">
		<!--
		<div id="info-title" style="text-align: center;padding-bottom:10px;padding-top:5px;height:50.6px">
				<h1 style="font-size: x-large;">
					<span style="color:#d02c2c;">【<span id="articleType">新闻公告</span>】</span><span id="title">人社部：人才评价要克服唯学历唯论文等倾向</span>
				</h1>
		</div>
	
		<div id="info-tag" style="font-size: 14px; line-height:36px;height:35px; ;border-bottom:1px solid #f2f2f2;border-top:1px solid #f2f2f2;">
			<span>发布时间：</span>
			<span id="creatorTime">2017-12-25</span>
			<span style="margin-left: 5px;margin-right:5px;">| 来源:</span>
			<span style="padding-right:20px;" id="creatorTelnetName">Myehr</span>
			<span>|责任编辑:</span><span id="createUser" class="color-blue">拟稿</span>
		</div>
		
		<div class="content" style="width: 100%;">
	
		</div>
		-->
	</div>	
			
	
	<!-- 右部分 -->
	<div class="rightCont" id="rightinfos" style="width:300px;position:absolute;
	 padding-bottom: 25px;background-color:white;bottom:0px;right:0px;top:0px;">
    	<div class="articleList" style="border-bottom:solid 1px #eaeaea;">
        <!--  
		  <div class="title">
              <span class="name">最新信息</span>
              <div class="more" id="new_info_more" onclick="showmMoreTask(&#39;/infoms/xxfb/portal/infomore.jsp&#39;)">更多 &gt;</div>
            </div>
		-->
		
        </div>                     
           
           
         
    	<div class="articleList" style="border-bottom:solid 1px #eaeaea;">
		
        </div> 
        </div>               
    </div>
   
    <!-- 底部 -->
	<div id="footer" style="position:absolute;left:440px;font-size:18px;bottom:0px;">
		<p>Myehr人力资源管理系统</p>
	</div>
</div>
	

<script type="text/javascript">
</script>

<div id="edui_fixedlayer" class="edui-default" style="position: fixed; left: 0px; top: 0px; width: 0px; height: 0px;">
<!--
	<div id="edui2" class="edui-popup  edui-bubble edui-default" onmousedown="return false;" style="display: none;">
		
		<div id="edui2_body" class="edui-popup-body edui-default"> <iframe style="position:absolute;z-index:-1;left:0;top:0;background-color: transparent;" frameborder="0" width="100%" height="100%" src="./信息查看_files/saved_resource(1).html" class="edui-default"></iframe>
			<div class="edui-shadow edui-default"></div> 
			<div id="edui2_content" class="edui-popup-content edui-default">  
			</div> 
		</div>
		
	</div>
	-->
</div>

<script type="text/javascript" src="/myehr/commonNews/js/jquery-1.7.2.min.js"></script>

<script>
var id=${param.id};
$(function(){
		getNewsData();
	})

function getNewsData(){
	var data = {};
	$.ajax({
		url : '${pageContext.request.contextPath}/evaluation/findSysNewsByNewId.action?id='+id,  
		type:'post',
		cache: false,
		async: false,
		success: function (obj) {
			setDataView(obj);
		}
	});
	return data;
}
	
	function setDataView(data){
		var releasedate=data[0].releasedate;
		var title=data[0].title;
		var releaser=data[0].releaser;
		var content=data[0].content;
		
		 releasedate = new Date(releasedate).Format("yyyy-MM-dd");
		
		var cellObj = $(
			
			'<div id="info-title" style="text-align: center;padding-bottom:10px;padding-top:5px;height:50.6px">'+
			'	<h1 style="font-size: x-large;">'+
			'		<span style="color:#d02c2c;">【<span id="articleType">新闻公告</span>】</span><span id="title">'+title+'</span>'+
			'	</h1>'+
			'</div>'+
		
			'<div id="info-tag" style="font-size: 14px; line-height:36px;height:35px; ;border-bottom:1px solid #f2f2f2;border-top:1px solid #f2f2f2;">'+
			'	<span>发布时间：</span>'+
			'	<span id="creatorTime">'+releasedate+'</span>'+
			'	<span style="margin-left: 5px;margin-right:5px;">| 来源:</span>'+
			'	<span style="padding-right:20px;" id="creatorTelnetName">Myehr</span>'+
			'	<span>|责任编辑:</span><span id="createUser" class="color-blue">'+releaser+'</span>'+
			'   <span><a href="/myehr/news.jsp">|返回</a></span>'+
			'</div>'+
			
			'<div class="content" style="width: 100%;">'+
			'	<p style="font-size:16px;line-height:1.8;">'+
			'		<span>'+content+'</span>'+
			'	</p>'+
			'</div>');
		$('#info').append(cellObj);		
}
</script>
</body>
</html>