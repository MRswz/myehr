<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/common/common.jsp" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>上传文件</title>
<meta charset="UTF-8"/>
        <link href="http://cdn.bootcss.com/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet">
        <link rel="stylesheet" type="text/css" href="css/default.css">
        <link href="css/fileinput.css" media="all" rel="stylesheet" type="text/css" />
        <script src="http://cdn.bootcss.com/jquery/1.11.0/jquery.min.js" type="text/javascript"></script>
        <script>window.jQuery || document.write('<script src="js/jquery-1.11.0.min.js"><\/script>')</script>
        
 		<script src="http://cdn.bootcss.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
        <script src="js/fileinput.js" type="text/javascript"></script>
        <!--简体中文-->
        <script src="js/locales/zh.js" type="text/javascript"></script>
        <style type="text/css">
        	.file-live-thumbs{height:90%;overflow:auto}
        	.file-drop-zone{height:90%}
        	.file-preview-thumbnails{height:100%}
        	.file-preview{overflow:auto;max-height:94%}
        	.file-input{position: relative;}
        	.input-group{position: absolute;bottom: -32px;}
			.tag{background-color:#449d44 !important}
			.file-preview {height:300px}
        </style>

<script type="text/javascript" src="js/addFileInfo.js"></script>
</head>
<body>
<div class="container-fluid" style="">
	<div class="my_card" style="margin-top:5px;">
		<div class='row cell'>
			<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
				<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
					<lable style="float:left">对象类型: </lable>
					<input id="OBJ_TYPE" name="OBJ_TYPE" type="text" class="form-control" readonly="true" style="width:200px;border:none;float:left"/>
				</div>
			</div>
			<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
				<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
					<lable style="float:left">对象ID: </lable>
					<input id="OBJ_ID" name="OBJ_ID" type="text" class="form-control"  readonly="true" style="width:200px; border:none;float:left"/>
				</div>
			</div>
			<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
				<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
					<lable style="float:left">允许上传类型: </lable>
					<input id="allowUploadType" name="allowUploadType" value="'jpg', 'gif', 'png'" type="text" class="form-control"  readonly="true" style="width:200px; border:none;float:left"/>
				</div>
			</div>
			<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
				<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
					<lable style="float:left">允许上传个数: </lable>
					<input id="allowUploadNum" name="allowUploadNum" value="20" type="text" class="form-control"  readonly="true" style="width:200px; border:none;float:left"/>
				</div>
			</div>
			<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
				<h5 class="tag-title">标签</h5>
				<input id="tag" name="tag" type="hidden"/>
                <div id="fileManage_tagType">
                	
                </div>
			</div>
		</div>
		<input id="file-zh" name="file-zh[]" type="file" multiple>

	</div>
</div>
<script>
$(function() { 
	addHtml();
	$("#OBJ_TYPE").val('${param.OBJ_TYPE}');
	$("#OBJ_ID").val('${param.OBJ_ID}');
})
var num = 1 ;
var objType = '${param.OBJ_TYPE}';
var objId = '${param.OBJ_ID}';
    $('#file-zh').fileinput({
        language: 'zh',
        uploadUrl: '#',
        showPreview :true,
        allowedFileExtensions : null/*['jpg', 'gif', 'png']*/,
        //uploadExtraData:expandParams(),
        maxFileCount:$("#allowUploadNum").val(), //表示允许同时上传的最大文件个数
        uploadUrl: "/myehr/FileList/newFileUp.action?objType="+objType+"&objId="+objId, //上传的地址
        uploadExtraData: function(previewId, index) {   //额外参数的关键点
            return {tag:tag};
        }
    }).on("fileuploaded", function(event, data) {
    	$.ajax({
    		url:'/myehr/FileList/updataTags.action?tag='+tag+'&fileId='+data.response[2],
    		type:'post',
    		cache: false,
    		success: function (obj) {
    		}
    	});
	    //var html = "<div>\n";
	    var html='<div class="fileInputWarnning">';
	    if(data.response[0]=='false1'){
	    	html += '<h style="color:red;font-size:10px">'+data.response[num]+':图片命名格式出错</h>\n</div>\n';
	    	$("#warnHtmlL").append(html);
	    }else if(data.response[0]=='false2'){
	    	html += '<h style="color:red;font-size:10px">'+data.response[num]+':图片保存出错</h>\n</div>\n';
	    	$("#warnHtmlL").append(html);
	    }else if(data.response[0]=='true'){
	    	html += '<h style="color:green;font-size:10px">'+data.response[num]+':上传成功</h>\n</div>\n';
	    	$("#warnHtmlR").append(html);
	    }
	    //html += "</div>\n";
	});
    </script>
    </body>
</html>