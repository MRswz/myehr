<%@ page language="java" import="java.util.*" import="com.myehr.common.util.LangUtil" pageEncoding="UTF-8"%>
<%@ include file="/common/cardcommon.jsp" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<link rel="stylesheet" href="/myehr/common/css/style.css" type="text/css"></link>
<link rel="stylesheet" href="/myehr/common/css/animate.css" type="text/css"></link>
<link rel="stylesheet" href="/myehr/common/css/base.css"></link>
<script type="text/javascript" src="/myehr/common/js/assets/jquery.min.js"></script>
<script type="text/javascript" src="/myehr/common/common1.js"></script>
<script type="text/javascript" src="/myehr/common/js/evaluate.js"></script>

<style>
	.container{
		width: 1000px;
	}
	.commentbox{
		width: 900px;
		margin: 20px auto;
	}
	.mytextarea {
	    width: 100%;
	    overflow: auto;
	    word-break: break-all;
	    height: 100px;
	    color: #000;
	    font-size: 1em;
	    resize: none;
	}
	.comment-list{
		width: 900px;
		margin: 20px auto;
		clear: both;
		padding-top: 20px;
	}
	.comment-list .comment-info{
		position: relative;
		margin-bottom: 20px;
		margin-bottom: 20px;
		border-bottom: 1px solid #ccc;
	}
	.comment-list .comment-info header{
		width: 10%;
		position: absolute;
	}
	.comment-list .comment-info header img{
		width: 100%;
		border-radius: 50%;
		padding: 5px;
	}
	.comment-list .comment-info .comment-right{
		padding:5px 0px 5px 11%; 
	}
	.comment-list .comment-info .comment-right h3{
		margin: 5px 0px;
	}
	.comment-list .comment-info .comment-right .comment-content-header{
		height: 25px;
	}
	.comment-list .comment-info .comment-right .comment-content-header span,.comment-list .comment-info .comment-right .comment-content-footer span{
		padding-right: 2em;
		color: #aaa;
	}
	.comment-list .comment-info .comment-right .comment-content-header span,.comment-list .comment-info .comment-right .comment-content-footer span.reply-btn,.send,.reply-list-btn{
		cursor: pointer;
	}
	.comment-list .comment-info .comment-right .reply-list {
		border-left: 3px solid #ccc;
		padding-left: 7px;
	}
	.comment-list .comment-info .comment-right .reply-list .reply{
		border-bottom: 1px dashed #ccc;
	}
	.comment-list .comment-info .comment-right .reply-list .reply div span{
		padding-left: 10px;
	}
	.comment-list .comment-info .comment-right .reply-list .reply p span{
		padding-right: 2em;
		color: #aaa;
	}
</style>


<!-- bootstrap -->
<script type="text/javascript" src="/myehr/common/js/assets/bootstrap/js/bootstrap.js"></script>
<script type="text/javascript" src="/myehr/common/js/assets/bootstrap-table/bootstrap-table.js"></script>
<script type="text/javascript" src="/myehr/common/js/assets/bootstrap-table/src/bootstrap-table-export.js"></script>
<script type="text/javascript" src="/myehr/common/js/assets/bootstrap-table/src/tableExport.js"></script>
<script src="/myehr/common/js/assets/bootstrap-table/src/bootstrap-editable.js"></script>
<link rel="stylesheet" href="/myehr/common/js/assets/bootstrap/css/bootstrap.css" type="text/css"></link>
<link rel="stylesheet" href="/myehr/common/js/assets/bootstrap-table/bootstrap-table.css" type="text/css"></link>

<!-- bootstrap选择器 -->
<script type="text/javascript" src="/myehr/common/js/bootstrap-select.js"></script>
<link rel="stylesheet" href="/myehr/common/js/SELECT/bootstrap-select/bootstrap-select.css" type="text/css"></link>

<!-- bootstrap时间选择器 -->
<script type="text/javascript" src="/myehr/common/js/date-format.js"></script>
<script type="text/javascript" src="/myehr/common/js/timepicker/bootstrap-datetimepicker.js"></script>
<script type="text/javascript" src="/myehr/common/js/timepicker/bootstrap-datetimepicker.zh-CN.js"></script>

<!-- 
<link rel="stylesheet" href="/myehr/common/js/timepicker/bootstrap/css/bootstrap.min.css" type="text/css"></link>
-->
<link rel="stylesheet" href="/myehr/common/js/timepicker/bootstrap-datetimepicker.css" type="text/css"></link>

<!-- 弹框-->
<script type="text/javascript" src="/myehr/common/js/layer/layer.js"></script>

<!--下拉选择 -->
<script type="text/javascript" src="/myehr/common/js/select2/js/select2.js"></script>
<script type="text/javascript" src="/myehr/common/js/select2/js/select2.full.js"></script>
<link href="/myehr/common/js/select2/css/select2.min.css" type="text/css" rel="stylesheet" />

<!-- 富文本 -->
<link rel="stylesheet" href="/myehr/common/js/richText/themes/default/css/umeditor.css" type="text/css"></link>
<script type="text/javascript" src="/myehr/common/js/richText/third-party/template.min.js"></script>
<script type="text/javascript" src="/myehr/common/js/richText/umeditor.config.js"></script>
<script type="text/javascript" src="/myehr/common/js/richText/umeditor.min.js"></script>
<script type="text/javascript" src="/myehr/common/js/richText/lang/zh-cn/zh-cn.js"></script>

<link href="/myehr/common/js/showLoading/css/showLoading.css" rel="stylesheet" media="screen" /> 
<script type="text/javascript" src="/myehr/common/js/showLoading/js/jquery.showLoading.js"></script>
<link href="http://cdn.bootcss.com/font-awesome/4.6.3/css/font-awesome.min.css " rel="stylesheet">

<!-- 卡片通用JS -->
<script type="text/javascript" src="/myehr/common/js/cardStand.js"></script>
<!-- 文件上传控件 -->
<script type="text/javascript" src="/myehr/common/js/upload/jquery.uploadify.h5.min.js"></script>
<link rel="stylesheet" href="/myehr/common/js/upload/uploadify-min.css" type="text/css"></link>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<body style="text-align:center">
<form id="form_3486" name="form_3486" style="margin-bottom:50px" >
<div class="container-fluid" style="overflow-y:auto;">
	<div class="my_card" style="margin-top:5px;">
<input id="TRA_RACEINFORMATION.TRARACEINFORMATION_ID_3486" name="TRARACEINFORMATION_ID" type="hidden" class="form-control"  style="width:200px; float:left"/><span style='color:red;line-height:35px;font-size:27px'></span>
<input id="TRA_RACEINFORMATION.TRARACEINFORMATION_TRA_EMPID_3486" name="TRARACEINFORMATION_TRA_EMPID" type="hidden" class="form-control"  emptyText=""  style="width:200px; float:left"/><span style='color:red;line-height:35px;font-size:27px'></span>
<input id="TRA_TRAINER.TRATRAINER_TRA_EMPID_3486" name="TRATRAINER_TRA_EMPID" type="hidden" class="form-control"  style="width:200px; float:left"/><span style='color:red;line-height:35px;font-size:27px'></span>
<div style="margin:10px 0;">
		<h3 style=" background:#FFF; display:block;font-size:18;text-align:left;height: 36px;line-height: 33px;padding-left: 16px;color: #666;cursor: pointer;">基本信息</h3>
			<div class="row cell"  >
<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
<lable style="float:left">姓名: </lable><input id="TRA_TRAINER.TRATRAINER_CNAME_3486" name="TRATRAINER_CNAME" type="text" class="form-control"  emptyText=""  vtype="illegalChar;maxLength:30;minLength:null;" illegalChar;maxLength:30;minLength:null;ErrorText=""  readonly="true" style="width:200px;height:; border:none;float:left"/><span style='color:red;line-height:35px;font-size:27px'></span>
</div>
</div>
<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
<lable style="float:left">机构: </lable>						<select id="TRA_TRAINER.TRATRAINER_COMPID_3486" title="机构" styleType="select" name="TRATRAINER_COMPID"  class="form-control " emptyText=""  disabled="false" style="border:none;width:200px; " textField="text" valueField="id" DictName="" dataField="data_form_62103"initParam = "_"></select><span style='color:red;line-height:35px;font-size:27px'></span>
</div>
</div>
<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
<lable style="float:left">部门: </lable>						<select id="TRA_TRAINER.TRATRAINER_DEPID_3486" title="部门" styleType="select" name="TRATRAINER_DEPID"  class="form-control " emptyText=""  disabled="false" style="border:none;width:200px; " textField="text" valueField="id" DictName="" dataField="data_form_62104"initParam = "_"></select><span style='color:red;line-height:35px;font-size:27px'></span>
</div>
</div>
		</div>
</div>
<div style="margin:10px 0;">
		<h3 style=" background:#FFF; display:block;font-size:18;text-align:left;height: 36px;line-height: 33px;padding-left: 16px;color: #666;cursor: pointer;">业务信息</h3>
			<div class="row cell"  >
<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
<lable style="float:left">比赛名称: </lable><input id="TRA_RACEINFORMATION.TRARACEINFORMATION_TCE_CNAME_3486" name="TRARACEINFORMATION_TCE_CNAME" type="text" class="form-control"  vtype="illegalChar;maxLength:30;minLength:null;"  required="true"  style="width:200px;height:; float:left"/><span style='color:red;line-height:35px;font-size:27px'> * </span>
</div>
</div>
<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
<lable style="float:left">比赛时间: </lable>
					<div class='controls input-append date form_date1 input-group' data-date=""  data-link-field="dtp_input2" data-link-format="yyyy-mm-dd" style="float:left;margin-top:5px;width: 134px;">
						<input type='text' readonly class="form-control " dateType="controls input-append date form_date1" id="TRA_RACEINFORMATION.TRARACEINFORMATION_TCE_RACETIME_3486" styleType="dateTime"   style="width:134px;float:left;border-radius: 4px 0 0 4px;" name="TRARACEINFORMATION_TCE_RACETIME"  required="true"  format="yyyy-MM-dd" valueformat="yyyy-MM-dd" />
							<span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span>
							<span class="input-group-addon"><span class="glyphicon glyphicon-th"></span></span>
					</div><span style='color:red;line-height:35px;font-size:27px'> * </span>
</div>
</div>
<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
<lable style="float:left">名次: </lable><input id="TRA_RACEINFORMATION.TRARACEINFORMATION_TCE_RANKING_3486" name="TRARACEINFORMATION_TCE_RANKING" type="text" class="form-control"  vtype="illegalChar;maxLength:10;minLength:null;"  required="true"  style="width:200px;height:; float:left"/><span style='color:red;line-height:35px;font-size:27px'> * </span>
</div>
</div>
<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
<lable style="float:left">积分: </lable><input id="TRA_RACEINFORMATION.TRARACEINFORMATION_TCE_INTEGRATION_3486" name="TRARACEINFORMATION_TCE_INTEGRATION" type="text" class="form-control"  vtype="illegalChar;maxLength:10;minLength:null;"  style="width:200px;height:; float:left"/><span style='color:red;line-height:35px;font-size:27px'></span>
</div>
</div>
<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
<lable style="float:left">说明: </lable><textarea id="TRA_RACEINFORMATION.TRARACEINFORMATION_TCE_EXPLAIN_3486" name="TRARACEINFORMATION_TCE_EXPLAIN" class="form-control"  vtype="illegalChar;maxLength:200;minLength:null;"  style="width:600px;height:58; float:left"></textarea/><span style='color:red;line-height:35px;font-size:27px'></span>
</div>
</div>
		</div>
</div>
<div style="margin:10px 0;">
		<h3 style=" background:#FFF; display:block;font-size:18;text-align:left;height: 36px;line-height: 33px;padding-left: 16px;color: #666;cursor: pointer;">备注信息</h3>
			<div class="row cell"  >
<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
<lable style="float:left">排序: </lable><input id="TRA_RACEINFORMATION.TRARACEINFORMATION_xorder_3486" name="TRARACEINFORMATION_xorder" type="text" class="form-control"  vtype="illegalChar;maxLength:10;minLength:null;"  style="width:200px;height:; float:left"/><span style='color:red;line-height:35px;font-size:27px'></span>
</div>
</div>
<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
<lable style="float:left">备注: </lable><input id="TRA_RACEINFORMATION.TRARACEINFORMATION_REMARK_3486" name="TRARACEINFORMATION_REMARK" type="text" class="form-control"  vtype="illegalChar;maxLength:200;minLength:null;"  style="width:600px;height:58; float:left"/><span style='color:red;line-height:35px;font-size:27px'></span>
</div>
</div>
<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
<lable style="float:left">登记时间: </lable><input id="TRA_RACEINFORMATION.TRARACEINFORMATION_REGTIME_3486" name="TRARACEINFORMATION_REGTIME" type="text" dateType="controls input-append date form_date1" class="form-control" styleType="dateTime" readonly  style="width:200px;float:left;border-radius: 4px 0 0 4px;" format="yyyy-MM-dd" valueformat="yyyy-MM-dd" />
</div>
</div>
		</div>
</div>
		<div class='row cell'>
		</div>
		<div class="BTNGROUP BTNGROUP_3486" style="margin:5px auto; display:inline-block;height: 30px;z-index: 6;position: relative">
			<div style="margin-right:10px;display:inline-block">
			    <input type="button" id="save_formTRA_RACEINFORMATION_add"  class="btn btn-success" value=保存(卡片式) onclick="save_formTRA_RACEINFORMATION_add_click_3486()"/>
			</div>
			<div style="margin-right:10px;display:inline-block">
			    <input type="button" id="closeTRA_RACEINFORMATION_add"  class="btn btn-primary" value=关闭 onclick="closex()"/>
			</div>
		</div>
<div id="activity_pane" style="position:absolute;left:500px;top:70px;"></div>
</div>
</div>

<div class="container" style="width:1100px; height:150px">
	<div class="commentbox" >
		<textarea cols="80" rows="4" placeholder="来说几句吧......" class="mytextarea" id="content"></textarea>
		<div style="margin-left:50%;display:inline-block">
			<input type="button" id="referData"  class="btn btn-success" value="评价" onclick="referDataxxxx()"/>
		</div>
	</div>	
	<div class="comment-list">
		<div class="comment-info">
			<div class="comment-right" id="xxxxx">
				
			</div>
		</div>	
	</div>
</div>

</form>
<script>

var path ='${pageContext.request.contextPath }';
var formId = '1';
var heightGadedata_3486 =[];
var containerParam_3486 ={};
containerParam_3486 ={};
function changeHeightGadedata_3486(data){
	heightGadedata_3486 = data;
}
$(function () {  
if('isView'==''){
	cardIsViewFunction();
}
cardDateWidInitFunction(); 
getData();
});
function _initParamCard(){
}
	var _formId_3486='3486';
	window.onload=function(){
		cardSelectInitFunction('');
initRoleColumn('3486');
initRoleButtons();
	}
function referDataxxxx(){
		var assess={};
    	assess.KeyId=KeyId;
		assess.formId=formId;
		assess.content=content;
		$.ajax({
            url: '/myehr/evaluation/saveEvaluationList.action',
		    type:'post',
			data: JSON.stringify(assess),
			cache: false,
			contentType: 'application/json;charset=utf-8',
            success: function(datas) { // 获取当前的数据
				if(datas=="success"){	
					alert("评价成功");
					closex();
				}
			}
		});
		return assess;
	}
	
var content=$("#mytextarea").val();
	
	function save_formTRA_RACEINFORMATION_add_click_3486(){
		var paramsMap = {};

		var _param = {};
		_param.formId=_formId_3486;
		_param.buttonId=4495;
		_param = getdata(_param.buttonId,_formId_3486);
		_param.paramsMap = paramsMap
		if(checkNull("#form_3486")){
		}else{
		$.ajax({
			url:'/myehr/form/saveButtonSave.action',
			type:'post',
			data: JSON.stringify(_param),
			cache: false,
			contentType: 'application/json;charset=utf-8',
			success: function (text) {
			if(text[0]=='000000' || text[1]=='保存成功'){
				alert("操作成功！");
				closex()
			}else if(text[0]=='error'){
			    if(text.length>1 &&text[0]=='error'){
					alert(text[1]);
			    }else{
					alert("操作异常");
			    }
			}else {
				alert("保存失败");
			}
			}
		});
		}
	}
	function _initData_3486(pkId){
		var _param = {};
		if(pkId){
			if(''!=null && ''!=''){
				_param = {requestParam:{},pkId:pkId,formId:_formId_3486};
			}else{;
				_param = {pkId:pkId,formId:_formId_3486};
			}
		}else {
			if(''!=null && ''!=''){
				_param = {requestParam:{ID:''},pkId:pkId,formId:_formId_3486};
			}else{;
				_param = {requestParam:{},pkId:pkId,formId:_formId_3486};
			}
		}
		_param.containerParam = containerParam;
		var _form = getForm("#form_3486");
		var _Type = getType("#form_3486");
		$.ajax({
			url:'/myehr/form/cardformInitData.action',
			type:'post',
			data: JSON.stringify(_param),
			cache: false,
			async: false,
			contentType: 'application/json;charset=utf-8',
			success: function (text) {
				if(text.rows&&text.rows.length>0){
						 var object = text.rows[0];
						 var buttonType = '';
						 for(var key in object){
						    if(key=='TRARACEINFORMATION_ID'){
						        if(buttonType=='copyAndUpdate'){
						            continue;
						        }
						    }
								if(_form[key]!=null&&_form[key]!="undefined"){
										if(_Type[key]=="dateTime" && object[key]!=null){
											date = object[key]+"";
											if(date.indexOf(":") > 0){
									    		date = object[key];
											}else{
									    		if(object[key]==null || object[key]==""){
													date = object[key]
												}else{
													date = new Date(object[key]).Format("yyyy-MM-dd hh:mm:ss");
												}
											}
											document.getElementById(_form[key]).value=formatDatebox(date,_form[key]);
											}else if(_Type[key]=="search" && object[key]!=null){
											$("[id='"+_form[key]+"']").selectpicker('val', object[key]);
											}else if(_Type[key]=="mupick" && object[key]!=null){
											var xxx=(object[key]+"").split(",");
											$("[id='"+_form[key]+"']").selectpicker('val', xxx);
											}else if(_Type[key]=="fileupload" && object[key]!=null){
											document.getElementById(_form[key]).value=object[key];
											var fileName = _form[key]+'_fileName';
											var fileNameValue = getFilenameById(object[key]);
											document.getElementById(fileName).value=fileNameValue;
										}else{
											document.getElementById(_form[key]).value=object[key];
										}
								}
						};
										
					if("undefined" != typeof mstTab_activechanged ){
						mstTab_activechanged();}
				} else {
				}
			},
			error: function (jqXHR, textStatus, errorThrown) {
			}
		});
	}
	//初始化表单权限字段
	function initRoleColumn(formId){
	    var url = '/myehr/form/queryCardFormColumnsWithUserId.action?formId='+formId;
	    $.ajax({
	        url:url,
	        type:'post',
	        cache: false,
	        async: false,
	        contentType:'application/json',
	        success:function(datas){
	            for(var i=0;i<datas.length;i++){
	                if(datas[i].formColumnUsName==0){
		                if(datas[i].formColumnGuiType==1){
		                    var entityTablename = datas[i].formEntityTablename;
		                    var fieldTablename = datas[i].formFieldTablename;
		                    var columnName=entityTablename+'.'+entityTablename.replace(/_/g,'')+'_'+fieldTablename+'_'+3486;
		                    var obj = $("[id='"+columnName+"']")[0].parentNode.parentNode;
		                    obj.style.display="none";
		                }else if(datas[i].formColumnGuiType==2){
		                    var entityTablename = datas[i].formEntityTablename;
		                    var fieldTablename = datas[i].formFieldTablename;
		                    var columnName=entityTablename+'.'+entityTablename.replace(/_/g,'')+'_'+fieldTablename+'_'+3486;
		                    var obj = $("[id='"+columnName+"']")[0].parentNode.parentNode;
		                    obj.style.display="none";
		                }else if(datas[i].formColumnGuiType==6){
		                    var entityTablename = datas[i].formEntityTablename;
		                    var fieldTablename = datas[i].formFieldTablename;
		                    var columnName=entityTablename+'.'+entityTablename.replace(/_/g,'')+'_'+fieldTablename+'_'+3486;
		                    var obj = $("[id='"+columnName+"']")[0].parentNode.parentNode.parentNode;
		                    obj.style.display="none";
		                }
	                }
	            }
	        }
	    });
	}
//初始化表单按钮字段
function initRoleButtons(){
    var url = '/myehr/form/queryCardFormButtonsWithUserId.action?formId=3486';
    $.ajax({
        url:url,
        type:'post',
        cache: false,
        async: false,
        contentType:'application/json',
        success:function(datas){
            for(var i=0;i<datas.length;i++){
                var obj = $("#"+datas[i].formButtonCode+"TRA_RACEINFORMATION_add");
                obj[0].parentNode.remove();
            }
        }
    });
}
	//唯一验证
	function uniqueVerifyBlur(obj){ 
	    var id = obj.id;
	    var strs= new Array();
	    strs= id.split("\.");
	    var tableName= strs[0];
	    strs= strs[1].split("_");
	    var fieldName= strs[0];
	    var value = document.getElementById(id).value;
	    var pkId = document.getElementById("TRA_RACEINFORMATION.ID_3486").value;
	    $.ajax({ 
		       url:'/myehr/form/checkUniqueVerify.action?tableName='+tableName+'&fieldName='+fieldName+'&value='+value+'&pkId='+pkId+'&pkFieldName=ID',
	        type:'post',
			   cache: false,
			   contentType: 'application/json;charset=utf-8',
			   success: function (text) {
				   if(text[0]=='1'){
					   obj.value='';
					   obj.style['border-color']='red';
					   obj.setAttribute("placeholder",text[1]);
				   }
				   if(text[0]=='0'){
					   obj.style['border-color']='#CCC';
				   }
			   }
		   });
	}
</script>
</body>
</html>
