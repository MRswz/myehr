<%@ page language="java" import="java.util.*" import="com.myehr.common.util.LangUtil" pageEncoding="UTF-8"%>
<%@ include file="/common/cardcommontest.jsp" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<body style="text-align:center">
<div class="container-fluid" style="overflow-y:auto;height:100%;padding-left:150px">
	<div class="commentbox">
		<form id="form_2503" name="form_2503" >
		<div class="my_card" style="margin-top:5px;">
			<div class='row cell' style="border:none">
				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
					<label style="display: block; font-size: 18px; text-align: left; height: 36px; line-height: 33px; color: rgb(102, 102, 102); cursor: pointer; margin: 0px;font-weight:100">工单类型:</label>
					<select class="form-control" style="width:200px">
						<option value="">请选择</option>
						<option value="证明服务">证明服务</option>
						<option value="咨询服务">咨询服务</option>
					</select>
				</div>
				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
					<label style="display: block; font-size: 18px; text-align: left; height: 36px; line-height: 33px; color: rgb(102, 102, 102); cursor: pointer; margin: 0px;font-weight:100">工单标题:</label>
					<input class="form-control" style="width:200px"/>
				</div>
				<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">
						<h3 style="display: block; font-size: 18px; text-align: left; height: 36px; line-height: 33px; color: rgb(102, 102, 102); cursor: pointer; margin: 0px;">申请单</h3>
						<textarea id="K20.K20_A0188_2503" name="K20_A0188" type="text" class="form-control"  style="width:800px;height:200px;resize: none;"></textarea>
					</div>
				</div>
			</div>
		</div>
		</form>
	<div>
	
	<div class="commentbox">
		<textarea placeholder="来说几句吧......" class="mytextarea form-control" id="contentx"  style="width:800px;height:100px;resize: none;margin-left:20px"></textarea>
		<div style="width:100%;display:inline-block">
			<input type="button" id="referData" style="margin:0 auto;display:block;text-align:center"  class="btn btn-success" value="评论" onclick="referDataxxxx()"/>
		</div>
	</div>
	<div class="comment-list" style="text-align:left">
		<div class="comment-info">
			<div class="comment-right" id="countPhoto" style="height:60px;">
			</div>
			<div class="comment-right" id="xxxxx">
			</div>
		</div>
	</div>
</div>
	
<script>
var realFormId = '2503';
$(function () {  
	if('isView'=='${param.isView}'){
		cardIsViewFunction();
	}
	cardDateWidInitFunction(); 
	initFileManagexx('true','true','true','true','true','form_2503','2','1000000',null,'form','2503');
	changeFileCss();
	$(".file-drop-zone-title").css("padding","20px 10px");
	getDataxx();
});
function initFileManagexx(shangchuanButton,yulanButton,deleteButton,uploadButton,tagCode,id,numLimit,sizeLimit,typeLimit,objType,objId){
	var objs = getFileByObjIdxx(objType,objId);//所有检查点
	var tableObj='<h3 class="CCFubiaoTitle" style="display: block; font-size: 18px; text-align: left; height: 36px; line-height: 33px; padding-left: 16px; color: rgb(102, 102, 102); cursor: pointer; margin: 0px;">表单附件管理</h3>\n'+
				 '<div class="wrapper wrapper-content animated fadeInRight" style="padding-top:0" id="testCheckedWall">\n'+
				 '</div>\n';
	$("#"+id).after(tableObj);
	var checkedObj = '<div class="row" style="margin-left:0;margin-top:10px;text-align:left;margin-right:0px"  id="checkedFileManage">\n'+
					 '	 <div class="col-md-12 col-sm-12 col-lg-12 singleShow" style="border:1px solid #e7eaec;padding-top:5px;background-color: #FFF;width:800px;border-radius:10px">\n'+
					 '			 <div class="col-sm-11">\n'+
					 '				<div class="row cell" style="border:0">\n'+
					 '					<div class="col-sm-12 animated fadeInRight">\n'+
					 '						<div class="row">\n'+
					 '							<div id="file_wall_view" class="col-sm-12" style="padding-left:0">\n'+
					 '								<input id="file-es" name="file-es[]" type="file" multiple/>\n'+
					 '								<input id="file-zh" name="file-zh[]" type="file" multiple/>\n'+
					 '							</div>\n'+
					 '						</div>\n'+
					 '					</div>\n'+
					 '				</div>\n'+
					 '			 </div>\n'+
					 '	 </div>\n'+
					 '</div>\n';
	$("#testCheckedWall").append(checkedObj);
	showFormDatexx(objs,'checkedFileManage',true,true,true,true,tagCode,numLimit,sizeLimit,typeLimit,objType,objId);
}
function showFormDatexx(arr,e,yulanButton,deleteButton,uploadButton,shangchuanButton,tagCode,numLimit,sizeLimit,typeLimit,objType,objId) {
	var previewSrcArr = [];
	var configArr = [];
	if(arr!=null){
		for (var i = arr.length - 1; i >= 0; i--) {
			previewSrcArr[i]=arr[i].filepath;
			var obj = {};
			obj.caption = arr[i].filename+'_'+arr[i].fileid;
			obj.type = arr[i].clientfilename;
			if(obj.type=='video'){
				obj.filetype="video/"+obj.caption.split(".")[obj.caption.split(".").length-1].split("_")[0];
			}
			if(obj.type=='audio'){
				obj.filetype="audio/"+obj.caption.split(".")[obj.caption.split(".").length-1].split("_")[0];
			}
			obj.size = arr[i].file_size;
			obj.key = i;
			configArr[i] = obj;
		}
	}
	var deleteButtonAC = '';
	var uploadButtonAC = '';
	var yulanButtonAC = '';
	if(deleteButton){
		deleteButtonAC = '<button type="button" class="kv-file-remove btn btn-kv btn-default btn-outline-secondary" {dataKey} title="删除附件" onclick="deleteAction(this,\'\',\'form\')"><i class="glyphicon glyphicon-trash"></i></button>';
	}
	if(uploadButton){
		uploadButtonAC = '<button type="button" class="kv-file-down btn btn-kv btn-default" {dataKey} title="下载附件" onclick="getFileData(this)"><i class="fa fa-cloud-download"></i></button>';
	}
	if(yulanButton){
		yulanButtonAC = '<i class="glyphicon glyphicon-king"></i>';
	}
	
	//文件预览
	$("#"+e).find("[name='file-es[]']").fileinput({
		theme: 'fa',
		language: 'zh',
		showUpload: false,
		showCaption: false,
		browseClass: "btn btn-primary btn-lg hidden",
		fileType: "any",
		previewFileIcon: true,
		overwriteInitial: false,
		showRemove:false,
		initialPreviewAsData: true,
		initialPreview: previewSrcArr,
		initialPreviewConfig:configArr,
		allowedPreviewTypes:'',
		otherActionButtons:uploadButtonAC,
		layoutTemplates:{
			actionDelete:deleteButtonAC,
		}
	});
	
	if(shangchuanButton){
		$("#"+e).find("[name='file-zh[]']").fileinput({
			theme: 'fa',
			language: 'zh',
			showPreview :true,
			showCaption:false,
			allowedFileExtensions : null,
			//uploadExtraData:expandParams(),
			maxFileCount:numLimit, //表示允许同时上传的最大文件个数newFileUp
			maxFileSize:sizeLimit,
			allowedFileExtensions:typeLimit,
			msgFilesTooMany: "选择上传的文件数量({n}) 超过允许的最大数值{m}！",
			msgSizeTooLarge: "文件 ({name}) (<b>{size} KB</b>) 超过了允许大小 <b>{maxSize} KB</b>",
			uploadUrl: "/myehr/FileList/newFileUp.action?tag="+tags+"&objId="+objId+"&objType="+objType//上传的地址,执行上传文件和更新检查点文件的操作
		}).on("fileuploaded", function(event, data) {
			window.location.reload();
		})
		$("#"+e).find("[name='file-zh[]']").on('filebatchselected', function(event, data, previewId, index) {
			  var content = "<div id='batchUp' class='row cell' style='border:none;line-height:25px;height:95%;overflow:auto;' >\n"+
							"<div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12\">\n"+
							"<h5 class=\"tag-title\">标签</h5>\n"+
							"<input id=\"tag\" name=\"tag\" type=\"hidden\"/>\n"+
							"<div id=\"fileManage_tagType\">\n"+
							"</div>\n"+
							"</div>\n"+
							"</div>\n";
			layer.open({
				title:'输入内容',
				shadeClose: true,
				zIndex:9999,
				content: content,
				area: ['500px', '300px'],
				btn: ['确定', '取消'],
				success: function(layero, index){
					addHtml(tagCode,'fileManage_tagType');
				},
				yes: function(index, layero){
					layer.close(index);
				  
				},
				btn2: function(index, layero){
				 
				}
			});
		});
	}else{
		$("button").remove(".kv-file-zoom");
		$("#"+e).find("[name='file-zh[]']").css("display","none");
	}
}

function getFileByObjIdxx(objType,objId){
	var checked = [];
	$.ajax({
	    url: "/myehr/FileList/getFileByObjId.action?objType="+objType+"&objId="+objId,
	    type: 'post',
	    cache: false,
	    async: false,
	    success: function (data) {
	    	checked=data;
	    }
	});
	return checked;
}
</script>
</body>
</html>
