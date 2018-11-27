<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ include file="/common/common.jsp"%>
<%	
    String formId = request.getParameter("formId");
    String templateFileid = request.getParameter("templateFileid");
    String templateFilename = request.getParameter("templateFilename");
    String buttonId = request.getParameter("buttonId");
%>
<!DOCTYPE html>
<html>

<head>
<style type="text/css">
.uploadify-button{background:none !important;line-height:16px !important;}
</style>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">


<title>文件管理</title>
<meta name="keywords" content="H+后台主题,后台bootstrap框架,会员中心主题,后台HTML,响应式后台">
<meta name="description"
	content="H+是一个完全响应式，基于Bootstrap3最新版本开发的扁平化主题，她采用了主流的左右两栏式布局，使用了Html5+CSS3等现代技术">

<link rel="shortcut icon" href="favicon.ico">

<script type="text/javascript" src="${pageContext.request.contextPath }/common/js/upload/jquery.uploadify.h5.min.js"></script>
<link rel="stylesheet" href="${pageContext.request.contextPath }/common/js/upload/uploadify-min.css" type="text/css"></link>
 
</head>

<body class="gray-bg">
<input id="" class="form-control" type="text" style="width:200px;float:left"/><button class="btn btn-danger" id="uploadify" style="height:25px"></button>

<script type="text/javascript">
  	var filepath;
	var fileid;
	$('#uploadify').Huploadify({
	    fileTypeExts: "*.xls;*.xlsx;*.doc;*.docx,*.txt;", // 扩展名
	    uploader: '${pageContext.request.contextPath }/FileList/newFileUp.action',           // 服务器端处理地址
	    auto: true, // 选择之后，自动开始上传
	    showUploadedPercent: false,
	    buttonText: "上传文件",                 // 按钮上的文字
	    buttonCursor: 'hand',                // 按钮的鼠标图标
	    fileObjName: 'Filedata',            // 上传参数名称
	    fileTypeDesc: "请选择 xls xlsx 文件",     // 文件说明
	    multi: false,               // 是否支持同时上传多个文件
	    overrideEvents: ['onDialogClose'],
	    fileSizeLimit: '204800',
	    //文件选择后的容器ID
	    queueID: 'uploadfileQueue',
	    //选择上传文件后调用
	    onSelect: function (file) {
	        layer.load();
	    },
	    onComplete:function (event, ID, fileObj, response, data) {	
	    	alert(fileObj);
	    },
	    //返回一个错误，选择文件的时候触发
	    onSelectError: function (file, errorCode, errorMsg) {
	        closeload();
	        var str = '';
	        switch (errorCode) {
	            case -110:
	                alert("上传失败，文件大小不能超过2M");
	                break;
	            case -120:
	                alert("上传失败，文件大小不能超过2M");
	                break;
	            case -130:
	                alert("您上传的文件格式不对，请重新选择");
	                break;
	        }
	    },
	    //检测FLASH失败调用
	    onFallback: function () {
	        $('.xubox_shade').remove();
	        $('.xubox_layer').remove();
	        alert("您未安装FLASH控件，无法上传文件！请安装FLASH控件后再试。");
	    },
	    //上传到服务器，服务器返回相应信息到data里
	    onUploadSuccess: function (file, data, response) {
	        $('.xubox_shade').remove();
	        $('.xubox_layer').remove();
	        if (data === "1") {
	            layer.alert("文件格式不正确！");
	        }
	        else if (data === "0") {
	            layer.alert("上传出错！");
	        } else {
	            $("#filename").val(file.name);
	            var file=JSON.parse(data);
	            filepath=file.filepath;
	            fileid=file.fileid;
	            $("#filepath").val(file.filepath);
	            $("#fileid").val(file.fileid);
	            layer.closeAll();
	        }
	    },
	    onCancel: function (file) {
	    }
	});
	function nextStep() {
	    window.location.href='./importButton2.jsp?fileid='+fileid+'&formId='+<%=formId %>+'&clientFileName='+'<%=templateFilename %>'+'&buttonId='+<%=buttonId %>;
	}
	
	function onCancel(e) {
        CloseWindow("cancel");
    }
    
    function CloseWindow(action) {            
        if (window.CloseOwnerWindow) {
        	return window.CloseOwnerWindow(action);
        } else {
        	window.close();
        }
    }
    
    function onCancel(){ 
	    var index = parent.layer.getFrameIndex(window.name); //获取当前窗体索引
	    parent.layer.close(index);//执行关闭
	}
	
    
	function getPath(obj) {    
  		if(obj){
  			if (window.navigator.userAgent.indexOf("MSIE")>=1){    
        		obj.select();
        		return document.selection.createRange().text;
			}else if(window.navigator.userAgent.indexOf("Firefox")>=1){
				if(obj.files){
					return obj.files.item(0).getAsDataURL();
				}    
				return obj.value;    
      		}    
    		return obj.value;    
    	}    
	}
  </script>
		
</body>

</html>
