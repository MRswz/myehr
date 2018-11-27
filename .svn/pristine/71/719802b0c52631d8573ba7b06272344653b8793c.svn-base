<%@ page language="java" import="java.util.*" import="com.myehr.common.util.LangUtil" pageEncoding="UTF-8"%>
<%@ include file="/common/common.jsp" %>
<%	
    String formId = request.getParameter("formId");
    String templateFileid = request.getParameter("templateFileid");
    String templateFilename = request.getParameter("templateFilename");
    String buttonId = request.getParameter("buttonId");
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>选择导入文件</title>
<script type="text/javascript" src="${pageContext.request.contextPath }/common/js/upload/jquery.uploadify.h5.min.js"></script>
<link rel="stylesheet" href="${pageContext.request.contextPath }/common/js/upload/uploadify-min.css" type="text/css"></link>
</head>
<body>
	
    <input class="hidden" name="formId" value="<%=formId %>"/>
    <input class="hidden" name="templateFileid" value="<%=templateFileid %>"/>
    <input class="hidden" name="templateFilename" value="<%=templateFilename %>"/>
    <input class="hidden" name="buttonId" value="<%=buttonId %>"/>
    
    <div style="padding-left:11px;padding-top:5px;">
        <table style="table-layout:fixed;width:100%"> 
			<tr style="height:40px" width="100%">
				<td style="padding-left:10px;"  width="150"><lable><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"导入模板")%>：</lable></td>
				<td style="padding-left:10px;"  align="left">
					<a id ="uoloadtemplate" href="/myehr/form/getfile.action?fileId=<%=templateFileid %>"><%=templateFilename %></a>
				</td>
			</tr>
            <tr style="height:40px" width="100%">
				<td style="padding-left:10px;"  width="150"><lable><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"请选择您要导入的Excel文件：")%>：</lable></td>
                <td >    
                    <input type="text" readonly="readonly" id="filename" name="filename" placeholder="未选择任何文件" class="required" />
	    			<input type="hidden" id="fileid" name="fileid"/>
	    			<input type="hidden" id="filepath" name="filepath"/>
	    			<span id="uploadify"></span>
                </td>
            </tr>
            <tr>
				<td colSpan="2" align="center">
			    </td>
			</tr>
			<tr>
				<td colSpan="2" align="left">
					<font color="red">
					<br/>
					注：<br/>
					1. 上传excel表格的第一行为标题行，数据从第二行开始。<br/>
					2. 为保证数据准确，请将上传表格的工号、姓名、部门的数据格式设置为文本格式，<br/>导入日期设置为文本格式，导入金额设置为数值格式。<br/>
					3. 导入数据中，不能出现空行，且工号不能为空值。<br/>
					</font>
				</td>
			</tr>
    	</table>
    </div>
    <div id="toolBar" class="nui-toolbar" style="text-align:center;padding-top:5px;padding-bottom:5px;" borderStyle="border:0;">
	    <button  class="btn btn-primary" onclick="nextStep()">下一步</button>
	    <button  class="btn btn-primary" onclick="onCancel()">取消</button>
	</div>
</body>
<script type="text/javascript">
	var filepath;
	var fileid;
	$('#uploadify').Huploadify({
	    fileTypeExts: "*.xls;*.xlsx;", // 扩展名
	    uploader: '${pageContext.request.contextPath }/form/uploadData.action',           // 服务器端处理地址
	    auto: true, // 选择之后，自动开始上传
	    showUploadedPercent: false,
	    //swf: '../../../Utility/Ueditor/plugins/uploadify/uploadify.swf',    // 上传使用的 Flash
	    buttonText: "上传文件",                 // 按钮上的文字
	    buttonCursor: 'hand',                // 按钮的鼠标图标
	    fileObjName: 'Filedata',            // 上传参数名称
	    fileTypeDesc: "请选择 xls xlsx 文件",     // 文件说明
	    multi: true,               // 是否支持同时上传多个文件
	    overrideEvents: ['onDialogClose'],
	    fileSizeLimit: '2048',
	    //文件选择后的容器ID
	    queueID: 'uploadfileQueue',
	    onUploadProgress: function (file, bytesUploaded, bytesTotal, totalBytesUploaded, totalBytesTotal) {
	        //有时候上传进度什么想自己个性化控制，可以利用这个方法
	        //使用方法见官方说明
	        alert(1);
	    },
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
//参数obj为input file对象  
</script>
</html>
