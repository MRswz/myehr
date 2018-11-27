<%@ page language="java" import="java.util.*" import="com.myehr.common.util.LangUtil" pageEncoding="UTF-8"%>
<%@ include file="/common/cardcommontest.jsp" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html lang="en">
    <head>
        
        <style type="text/css">
        	.file-live-thumbs{height:90%;overflow:auto}
        	.file-drop-zone{height:64%}
        	.file-preview-thumbnails{height:100%}
        	.file-preview{overflow:auto;max-height:94%}
        	.file-input{position: relative;}
        	.input-group{position: absolute;bottom: -32px;}
        </style>
    </head>
	<body>
       <div class="htmleaf-container">
           <div class="container kv-main">
               <form enctype="multipart/form-data"  style="height:85%" >
                   <label>简体中文</label>
                   <input id="file-zh" name="file-zh[]" type="file" multiple>
               </form>
           </div>
       </div>
    </body>
	<script>
	$(function() {
		var warnHtmlL = '<div id="warnHtmlL" style="width:50%;float:left;padding-left:10px"></div>';
		var warnHtmlR = '<div id="warnHtmlR" style="width:50%;float:left;padding-left:10px;position: relative;"><input type="button" class="form-control" value="Clear" onclick="cleanWarn()" style="position: absolute;top: 0;right: 0;width: 60px;"/></div>';
		$(".file-preview").append(warnHtmlL);
		$(".file-preview").append(warnHtmlR);
		$(".kv-upload-progress").remove();
	})
	var num = 1 ;
    $('#file-zh').fileinput({
        language: 'zh',
        uploadUrl: '#',
        allowedFileExtensions : ['jpg', 'png','gif','jpeg'],
        uploadUrl: "${pageContext.request.contextPath }/FileList/multiImportPhotox.action", //上传的地址
       
    }).on("fileuploaded", function(event, data) {
	    //var html = "<div>\n";
    	var html='<div class="fileInputWarnning">';
	    if(data.response[0]=='false1'){
	    	html += '<h style="color:red;font-size:10px">'+data.response[num]+':图片命名格式出错</h>\n</div>\n';
	    	$("#warnHtmlL").append(html);
	    }else if(data.response[0]=='false2'){
	    	html += '<h style="color:red;font-size:10px">'+data.response[num]+':图片保存出错</h>\n</div>\n';
	    	$("#warnHtmlL").append(html);
	    }else if(data.response[0]=='false3'){
	    	html += '<h style="color:red;font-size:10px">'+data.response[num]+':员工名称与工号不匹配</h>\n</div>\n';
	    	$("#warnHtmlR").append(html);
	    
	    }else if(data.response[0]=='true'){
	    	html += '<h style="color:green;font-size:10px">'+data.response[num]+':上传成功</h>\n</div>\n';
	    	$("#warnHtmlR").append(html);
	    }
	    //html += "</div>\n";
	    
	});
    function cleanWarn(){
    	//$(".fileInputWarnning").remove();
    	window.location.reload()
    }
    function exportant(){
		document.getElementById("myForm").submit()
	}
	</script>
</html>