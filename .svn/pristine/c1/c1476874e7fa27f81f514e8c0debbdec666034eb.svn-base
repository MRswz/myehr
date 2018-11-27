//当前页和一次显示多少条数据(单条记录默认一条)
var Currentpage11 = 0;
var pagesize11 = 1;
var Currentpage21 = 0;//(展开数据最大100条)
var pagesize21 = 100;
//当前页和一次显示多少条数据
var Currentpage01 = 0;
var pagesize01 = 1;
//状态变量
var youxiao1 = 'Y';
var zuixin1 = null;
var newElementNum1 = 0;
//当前页和一次显示多少条数据(单条记录默认一条)
var Currentpage12 = 0;
var pagesize12 = 1;
var Currentpage22 = 0;//(展开数据最大100条)
var pagesize22 = 100;
//当前页和一次显示多少条数据
var Currentpage02 = 0;
var pagesize02 = 1;
//状态变量
var youxiao2 = 'Y';
var zuixin2 = null;
var newElementNum2 = 0;
function submitButton_save_6735(){
	var paramsMap = {};
	var _param = {};
	var hzsParam = [];
	_param.formId=formId_main;
	_param = cardGetdata_main('#submitButton_main',formId_main);
	_param.buttonId='6735';
	_param.paramsMap = paramsMap;
	if(checkNull($("#MainElement").find("form"))){
		return true;
	}else{
		$.ajax({
			url:'/myehr/form/saveButtonSave.action',
			type:'post',
			data: JSON.stringify(_param),
			cache: false,
			async: false,
			contentType: 'application/json;charset=utf-8',
			success: function (text) {
				if(text[0]=='error'){
					alert("操作异常");
					return ;
				}else {
					hzsParam = text;
				}
			}
		});
		if(hzsParam.length>0){
			_param.excresult = hzsParam;
			$.ajax({
				url:'/myehr/form/hzAction.action',
				type:'post',
				data: JSON.stringify(_param),
				cache: false,
				async: false,
				contentType: 'application/json;charset=utf-8',
				success: function (text) {
				}
			});
		}
submitButton_refer_6735();
	}
}
function submitButton_refer_6735(){
			var paramsMap = {};
			var _param = {};
			paramsMap.bussinessId = BUSSINESSID_ACT;
			_param.formId=formId_main;
			_param = cardGetdata_main_act('#submitButton_main',formId_main);
			_param.buttonId='6735';
			_param.paramsMap = paramsMap;
			_param.actFlowParams= {key:param_key};
			$.ajax({
				url:'/myehr/act/task/start.action',
				type:'post',
				data: JSON.stringify(_param),
				cache: false,
				async: false,
				contentType: 'application/json;charset=utf-8',
				success: function (text) {
					if(text[0]==0){
						alert("保存成功");
						closex();
					}else if(text[0]=='error'){
						alert("操作异常:"+text[1]);
						return ;
					}else {
						alert("操作失败");
						return ;
					}
				}
			});
		}
function approved_save_6764(){
	var paramsMap = {};
	var _param = {};
	var hzsParam = [];
	_param.formId=formId_main;
	_param = cardGetdata_main('#submitButton_main',formId_main);
	_param.buttonId='6764';
	_param.paramsMap = paramsMap;
	if(checkNull($("#MainElement").find("form"))){
		return true;
	}else{
		$.ajax({
			url:'/myehr/form/saveButtonSave.action',
			type:'post',
			data: JSON.stringify(_param),
			cache: false,
			async: false,
			contentType: 'application/json;charset=utf-8',
			success: function (text) {
				if(text[0]=='error'){
					alert("操作异常");
					return ;
				}else {
					hzsParam = text;
				}
			}
		});
		if(hzsParam.length>0){
			_param.excresult = hzsParam;
			$.ajax({
				url:'/myehr/form/hzAction.action',
				type:'post',
				data: JSON.stringify(_param),
				cache: false,
				async: false,
				contentType: 'application/json;charset=utf-8',
				success: function (text) {
				}
			});
		}
	}
}
function approved_refer_6764(buttonType){
	if(checkedPointRequire()){
		if(buttonType=='通过'){
			if(!approved_save_6764()){
				content = "<select id='shenpi1' title='通过意见' name='shenpi' style='width:200px;margin-bottom:20px' class='form-control SHENPIYIJIANS' emptytext='' datafield1='dict' required='true' shownullitem='true' dictname='approvalopinion' datafield1='dict' onchange='writeYiJian(this)'></select><textarea id='approveRemark' class='SHENPIYIJIANC' rows='7' cols='63' ></textarea>";
			}else{
				layer.alert('有必选的指标未勾选', {
		  		  	  offset:'50%',
				      shift: 6,
					  icon: 5,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
					  skin: 'layer-ext-moon' 
					})
				return ;
			}
		}else if(buttonType=='驳回'){
			if(!approved_save_6764()){
				getHisTask();
				var datas = hisTask;
				content = "<select id='shenpi2' title='通过意见' name='shenpi' style='width:200px;margin-bottom:20px' class='form-control SHENPIYIJIANS' emptytext='' datafield1='dict' required='true' shownullitem='true' dictname='FinalRejection' datafield1='dict' onchange='writeYiJian(this)'></select><div style='margin-bottom:10px'>驳回方式<select id='rejectType' >";
				content+= "<option value ='previousNode'>驳回到上节点</option>";
				content+= "<option value ='startUser'>驳回到申请人</option>";
				content+= "</select></div>";
				content += "<div style='margin-bottom:10px'>驳回节点<select id='rejectNode' >";
				for(var i=0;i<datas.length;i++){
					content+="<option value ='"+datas[i].taskId+"'>"+datas[i].ACTNAME+"</option>";
				}
				content+="</select></div>";
				content += "<textarea class='SHENPIYIJIANC' id='approveRemark' rows='7' cols='63' ></textarea>";
			}else{
				layer.alert('有必选的指标未勾选', {
		  		  	  offset:'50%',
				      shift: 6,
					  icon: 5,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
					  skin: 'layer-ext-moon' 
					})
				return ;
			}
		}
		layer.open({
			title:'请填写审批意见',
			shadeClose: true,
			offset: 't',
			zIndex:9999,
			content: content,
			area: ['500px', '350px'],
			btn: ['确定', '取消'],
			success: function(layero, index){
				initSelectForShenPi(buttonType);
			},
			yes:function(index, layero){
				var approveRemark=document.getElementById("approveRemark").value;
				var rejectType;
				if(buttonType=='驳回'){
					rejectType=document.getElementById("rejectType").value;
				}
				layer.close(index);
				approved_refer2_6764(buttonType,approveRemark,rejectType);
			},
		})
	}else{
		layer.alert('有必选的指标未勾选', {
  		  	  offset:'50%',
		      shift: 6,
			  icon: 5,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
			  skin: 'layer-ext-moon' 
			})
	}
}
function approved_refer2_6764(buttonType,approveRemark,rejectType){
    var flowAction = param_flowAction;
    if(flowAction=='start'){
	    var paramsMap = {};
	    var _param = {};
	    _param.formId=formId_main;
	    _param =  cardGetdata_main_act('#submitButton_main',formId_main);
	    _param.buttonId='6764';
	    _param.paramsMap = paramsMap;
	    _param.actFlowParams= {key:param_key};
	    $.ajax({
		     url:'/myehr/act/task/start.action',
		     type:'post',
		     data: JSON.stringify(_param),
		     cache: false,
			 async: false,
		     contentType: 'application/json;charset=utf-8',
		     success: function (text) {
			     if(text[0]==0){
				     alert("保存成功！");
				     closex();
			     }else if(text[0]=='error'){
				     alert("操作异常:"+text[1]);
					 return ;
			     }else {
				     alert("操作失败");
					 return ;
			     }
		     }
	     });
    }else{
	     var paramsMap = {};
	     var _param = {};
	     _param.formId=formId_main;
	     _param =  cardGetdata_main('#submitButton_main',formId_main);
	     _param.buttonId='6764';
	     _param.paramsMap = paramsMap;
	     _param.actFlowParams= {taskId:param_taskId,procInsId:param_procInsId,buttonType:buttonType,approveRemark:approveRemark,rejectType:rejectType};
	     $.ajax({
		     url:'/myehr/act/task/complete.action',
		     type:'post',
		     data: JSON.stringify(_param),
		     cache: false,
			 async: false,
		     contentType: 'application/json;charset=utf-8',
		     success: function (text) {
			     if(text[0]==0){
				     alert("保存失败！");
					return ;
			     }else if(text[0]=='error'){
				     alert("操作异常");
					return ;
			     }else {
				     alert("操作成功");
				     closex();
			     }
		     }
	     });
    }
}
function approved_save_6765(){
	var paramsMap = {};
	var _param = {};
	var hzsParam = [];
	_param.formId=formId_main;
	_param = cardGetdata_main('#submitButton_main',formId_main);
	_param.buttonId='6765';
	_param.paramsMap = paramsMap;
	if(checkNull($("#MainElement").find("form"))){
		return true;
	}else{
		$.ajax({
			url:'/myehr/form/saveButtonSave.action',
			type:'post',
			data: JSON.stringify(_param),
			cache: false,
			async: false,
			contentType: 'application/json;charset=utf-8',
			success: function (text) {
				if(text[0]=='error'){
					alert("操作异常");
					return ;
				}else {
					hzsParam = text;
				}
			}
		});
		if(hzsParam.length>0){
			_param.excresult = hzsParam;
			$.ajax({
				url:'/myehr/form/hzAction.action',
				type:'post',
				data: JSON.stringify(_param),
				cache: false,
				async: false,
				contentType: 'application/json;charset=utf-8',
				success: function (text) {
				}
			});
		}
	}
}
function approved_refer_6765(buttonType){
	if(checkedPointRequire()){
		if(buttonType=='通过'){
			if(!approved_save_6765()){
				content = "<select id='shenpi1' title='通过意见' name='shenpi' style='width:200px;margin-bottom:20px' class='form-control SHENPIYIJIANS' emptytext='' datafield1='dict' required='true' shownullitem='true' dictname='approvalopinion' datafield1='dict' onchange='writeYiJian(this)'></select><textarea id='approveRemark' class='SHENPIYIJIANC' rows='7' cols='63' ></textarea>";
			}else{
				layer.alert('有必选的指标未勾选', {
		  		  	  offset:'50%',
				      shift: 6,
					  icon: 5,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
					  skin: 'layer-ext-moon' 
					})
				return ;
			}
		}else if(buttonType=='驳回'){
			if(!approved_save_6765()){
				getHisTask();
				var datas = hisTask;
				content = "<select id='shenpi2' title='通过意见' name='shenpi' style='width:200px;margin-bottom:20px' class='form-control SHENPIYIJIANS' emptytext='' datafield1='dict' required='true' shownullitem='true' dictname='FinalRejection' datafield1='dict' onchange='writeYiJian(this)'></select><div style='margin-bottom:10px'>驳回方式<select id='rejectType' >";
				content+= "<option value ='previousNode'>驳回到上节点</option>";
				content+= "<option value ='startUser'>驳回到申请人</option>";
				content+= "</select></div>";
				content += "<div style='margin-bottom:10px'>驳回节点<select id='rejectNode' >";
				for(var i=0;i<datas.length;i++){
					content+="<option value ='"+datas[i].taskId+"'>"+datas[i].ACTNAME+"</option>";
				}
				content+="</select></div>";
				content += "<textarea class='SHENPIYIJIANC' id='approveRemark' rows='7' cols='63' ></textarea>";
			}else{
				layer.alert('有必选的指标未勾选', {
		  		  	  offset:'50%',
				      shift: 6,
					  icon: 5,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
					  skin: 'layer-ext-moon' 
					})
				return ;
			}
		}
		layer.open({
			title:'请填写审批意见',
			shadeClose: true,
			offset: 't',
			zIndex:9999,
			content: content,
			area: ['500px', '350px'],
			btn: ['确定', '取消'],
			success: function(layero, index){
				initSelectForShenPi(buttonType);
			},
			yes:function(index, layero){
				var approveRemark=document.getElementById("approveRemark").value;
				var rejectType;
				if(buttonType=='驳回'){
					rejectType=document.getElementById("rejectType").value;
				}
				layer.close(index);
				approved_refer2_6765(buttonType,approveRemark,rejectType);
			},
		})
	}else{
		layer.alert('有必选的指标未勾选', {
  		  	  offset:'50%',
		      shift: 6,
			  icon: 5,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
			  skin: 'layer-ext-moon' 
			})
	}
}
function approved_refer2_6765(buttonType,approveRemark,rejectType){
    var flowAction = param_flowAction;
    if(flowAction=='start'){
	    var paramsMap = {};
	    var _param = {};
	    _param.formId=formId_main;
	    _param =  cardGetdata_main_act('#submitButton_main',formId_main);
	    _param.buttonId='6765';
	    _param.paramsMap = paramsMap;
	    _param.actFlowParams= {key:param_key};
	    $.ajax({
		     url:'/myehr/act/task/start.action',
		     type:'post',
		     data: JSON.stringify(_param),
		     cache: false,
			 async: false,
		     contentType: 'application/json;charset=utf-8',
		     success: function (text) {
			     if(text[0]==0){
				     alert("保存成功！");
				     updateFiles();
				     closex();
			     }else if(text[0]=='error'){
				     alert("操作异常:"+text[1]);
					 return ;
			     }else {
				     alert("操作失败");
					 return ;
			     }
		     }
	     });
    }else{
	     var paramsMap = {};
	     var _param = {};
	     _param.formId=formId_main;
	     _param =  cardGetdata_main('#submitButton_main',formId_main);
	     _param.buttonId='6765';
	     _param.paramsMap = paramsMap;
	     _param.actFlowParams= {taskId:param_taskId,procInsId:param_procInsId,buttonType:buttonType,approveRemark:approveRemark,rejectType:rejectType};
	     $.ajax({
		     url:'/myehr/act/task/complete.action',
		     type:'post',
		     data: JSON.stringify(_param),
		     cache: false,
			 async: false,
		     contentType: 'application/json;charset=utf-8',
		     success: function (text) {
			     if(text[0]==0){
				     alert("保存失败！");
					return ;
			     }else if(text[0]=='error'){
				     alert("操作异常");
					return ;
			     }else {
				     alert("操作成功");
				     closex();
			     }
		     }
	     });
    }
}
function temporaryStorage_save_6914(){
	var paramsMap = {};
	var _param = {};
	var hzsParam = [];
	_param.formId=formId_main;
	_param = cardGetdata_main('#submitButton_main',formId_main);
	_param.buttonId='6914';
	_param.paramsMap = paramsMap;
	if(checkNull($("#MainElement").find("form"))){
		return true;
	}else{
		$.ajax({
			url:'/myehr/form/saveButtonSave.action',
			type:'post',
			data: JSON.stringify(_param),
			cache: false,
			async: false,
			contentType: 'application/json;charset=utf-8',
			success: function (text) {
				if(text[0]=='error'){
					alert("操作异常");
					return ;
				}else if(text[0]='000000'){
					alert("操作成功");
					closex();
				}else {
					hzsParam = text;
				}
			}
		});
		if(hzsParam.length>0){
			_param.excresult = hzsParam;
			$.ajax({
				url:'/myehr/form/hzAction.action',
				type:'post',
				data: JSON.stringify(_param),
				cache: false,
				async: false,
				contentType: 'application/json;charset=utf-8',
				success: function (text) {
				}
			});
		}
	}
}
	 function addFunction(e){
	 if(e=='fubiao1'){
		 var cellObj = '';
		 cellObj +=	'<div name="fubiaoElement" class="col-md-12 col-sm-12 col-lg-12" id="newElement'+newElementNum+'">'+
					'    <div class="contact-box CCAdd">'+
					'<form class="row cell add_element" style="padding-right:50px">';
		 cellObj += '	<span class="fa fa-trash-o deleteButton" style="position: absolute;right: 30px;font-size: 25px" onclick="removeElement('+newElementNum+')"></span>'+
					'	<span class="fa fa-save saveButton" style="position: absolute;right: 30px;font-size: 25px;top:50px" onclick="saveElement(this,\'4089\')"></span>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">姓名: </label>'+
  '			<select id="PERSONNELASSIGNMENT.PERSONNELASSIGNMENT_EMPID_4089_add_'+newElementNum+'" title="姓名" styleType="select" name="PERSONNELASSIGNMENT_empid"  columnId="74371" class="form-control selectpicker bla bla bli" data-live-search="true" styleType2="search" style="width:200px;float:left;height:25px;padding:0;border:none;background-color:#fff"  emptyText=""  onchange="PERSONNELASSIGNMENT_PERSONNELASSIGNMENT_EMPID_valueChange_4089(this)" required="true"  style="float:left;width:200px;" dataField1 = "sql"  textField="text" valueField="id" DictName="sql159" dataField="data_form_74371"initParam = "_"></select>'+
  '			<span style="color:red;"> * </span>'+
  '		</div>'+
  '	</div>'+
  '	<input id="PERSONNELASSIGNMENT.PERSONNELASSIGNMENT_DUTYTIME_4089" name="PERSONNELASSIGNMENT_Dutytime"   type="hidden" >'+
  '	<input id="PERSONNELASSIGNMENT.PERSONNELASSIGNMENT_ALLOCATIONTYPE_4089" name="PERSONNELASSIGNMENT_Allocationtype"   type="hidden" >'+
  '	<input id="PERSONNELASSIGNMENT.PERSONNELASSIGNMENT_PROC_ID_4089" name="PERSONNELASSIGNMENT_proc_id"   type="hidden" >'+
  '	<input id="PERSONNELASSIGNMENT.PERSONNELASSIGNMENT_ID_4089" name="PERSONNELASSIGNMENT_id"   type="hidden" >'+
  '	<input id="PERSONNELASSIGNMENT.PERSONNELASSIGNMENT_NUMBER_4089" name="PERSONNELASSIGNMENT_number"   type="hidden" >'+
  '	<input id="PERSONNELASSIGNMENT.PERSONNELASSIGNMENT_TRANSFER_4089" name="PERSONNELASSIGNMENT_Transfer"   type="hidden" >'+
  '	<input id="PERSONNELASSIGNMENT.PERSONNELASSIGNMENT_TITLE_4089" name="PERSONNELASSIGNMENT_title"   type="hidden" >'+
  '	<input id="PERSONNELASSIGNMENT.PERSONNELASSIGNMENT_CNAME_4089" name="PERSONNELASSIGNMENT_cname"   type="hidden" >'+
  '	<input id="PERSONNELASSIGNMENT.PERSONNELASSIGNMENT_BUSINESSID_4089" name="PERSONNELASSIGNMENT_businessId"   type="hidden" >'+
  '	<input id="PERSONNELASSIGNMENT.PERSONNELASSIGNMENT_DEPID_4089" name="PERSONNELASSIGNMENT_depid"   type="hidden" >'+
  '	<input id="PERSONNELASSIGNMENT.PERSONNELASSIGNMENT_EMPCODE_4089" name="PERSONNELASSIGNMENT_empcode"   type="hidden" >'+
  '	<input id="PERSONNELASSIGNMENT.PERSONNELASSIGNMENT_VALIEDATE_4089" name="PERSONNELASSIGNMENT_valiedate"   type="hidden" >'+
  '	<input id="PERSONNELASSIGNMENT.PERSONNELASSIGNMENT_NCANME_4089" name="PERSONNELASSIGNMENT_ncanme"   type="hidden" >'+
  '	<input id="PERSONNELASSIGNMENT.PERSONNELASSIGNMENT_SEX_4089" name="PERSONNELASSIGNMENT_sex"   type="hidden" >'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">类型: </label>'+
  '			<select id="PERSONNELASSIGNMENT.PERSONNELASSIGNMENT_XTYPE_4089_add_'+newElementNum+'" title="类型" styleType="select" name="PERSONNELASSIGNMENT_xtype"  columnId="74383" class="form-control " style="width:200px;float:left;height:25px;padding:0;border:none;background-color:#fff"  emptyText=""  required="true"  style="float:left;width:200px;" showNullItem="true" dataField1 = "dict"  textField="dictName" valueField="dictId" DictName="XM_XTYPE" nullItemText="" dataField="dicts_form_74383"initParam = "_"></select>'+
  '			<span style="color:red;"> * </span>'+
  '		</div>'+
  '	</div>'+
  '	<input id="PERSONNELASSIGNMENT.PERSONNELASSIGNMENT_COMPID_4089" name="PERSONNELASSIGNMENT_compid"   type="hidden" >'+
  '	<input id="PERSONNELASSIGNMENT.PERSONNELASSIGNMENT_COMID2_4089" name="PERSONNELASSIGNMENT_comid2"   type="hidden" >'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">现属支行/部门: </label>'+
  '			<select id="PERSONNELASSIGNMENT.PERSONNELASSIGNMENT_XDEPID_4089_add_'+newElementNum+'" title="现属支行/部门" styleType="select" name="PERSONNELASSIGNMENT_xdepid"  columnId="74386" class="form-control " style="width:200px;float:left;height:25px;padding:0;border:none;background-color:#fff"  emptyText=""  style="float:left;width:200px;" showNullItem="true" dataField1 = "sql"  textField="text" valueField="id" DictName="sql9" nullItemText="" dataField="data_form_74386"initParam = "_"></select>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">现岗位: </label>'+
  '			<select id="PERSONNELASSIGNMENT.PERSONNELASSIGNMENT_JOBID_4089_add_'+newElementNum+'" title="现岗位" styleType="select" name="PERSONNELASSIGNMENT_jobid"  columnId="74387" class="form-control " style="width:200px;float:left;height:25px;padding:0;border:none;background-color:#fff"  emptyText=""  style="float:left;width:200px;" showNullItem="true" dataField1 = "sql"  textField="text" valueField="id" DictName="jobidSql1" nullItemText="" dataField="data_form_74387"initParam = "_"></select>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<input id="PERSONNELASSIGNMENT.PERSONNELASSIGNMENT_NCOMPID_4089" name="PERSONNELASSIGNMENT_ncompid"   type="hidden" >'+
  '	<input id="PERSONNELASSIGNMENT.PERSONNELASSIGNMENT_NCOMID2_4089" name="PERSONNELASSIGNMENT_ncomid2"   type="hidden" >'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">调配部门: </label>'+
  '			<select id="PERSONNELASSIGNMENT.PERSONNELASSIGNMENT_NDEPID_4089_add_'+newElementNum+'" title="调配部门" styleType="select" name="PERSONNELASSIGNMENT_ndepid"  columnId="74372" class="form-control selectpicker bla bla bli" data-live-search="true" styleType2="search" style="width:200px;float:left;height:25px;padding:0;border:none;background-color:#fff"  emptyText=""  onchange="PERSONNELASSIGNMENT_PERSONNELASSIGNMENT_NDEPID_valueChange_4089(this)" required="true"  style="float:left;width:200px;" dataField1 = "sql"  textField="text" valueField="id" DictName="sql9" dataField="data_form_74372"initParam = "_"></select>'+
  '			<span style="color:red;"> * </span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">调配岗位: </label>'+
  '			<select id="PERSONNELASSIGNMENT.PERSONNELASSIGNMENT_NJOBID_4089_add_'+newElementNum+'" title="调配岗位" styleType="select" name="PERSONNELASSIGNMENT_njobid"  columnId="74390" class="form-control selectpicker bla bla bli" data-live-search="true" styleType2="search" style="width:200px;float:left;height:25px;padding:0;border:none;background-color:#fff"  emptyText=""  style="float:left;width:200px;" dataField1 = "sql"  textField="text" valueField="id" DictName="sql35" dataField="data_form_74390"initParam = "_"></select>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<input id="PERSONNELASSIGNMENT.PERSONNELASSIGNMENT_REMARK_4089" name="PERSONNELASSIGNMENT_remark"   type="hidden" >'+
  '	<input id="PERSONNELASSIGNMENT.PERSONNELASSIGNMENT_DEPARTMENT_4089" name="PERSONNELASSIGNMENT_Department"   type="hidden" >'+
  '	<input id="PERSONNELASSIGNMENT.PERSONNELASSIGNMENT_REASON_4089" name="PERSONNELASSIGNMENT_reason"   type="hidden" >'+
  '	<input id="PERSONNELASSIGNMENT.PERSONNELASSIGNMENT_DEPARTMENTCONFIRMS_4089" name="PERSONNELASSIGNMENT_departmentconfirms"   type="hidden" >'+
  '	<input id="PERSONNELASSIGNMENT.PERSONNELASSIGNMENT_OTHERSINGLE_4089" name="PERSONNELASSIGNMENT_Othersingle"   type="hidden" >'+
  '	<input id="PERSONNELASSIGNMENT.PERSONNELASSIGNMENT_LNCOMPID_4089" name="PERSONNELASSIGNMENT_lncompid"   type="hidden" >'+
  '	<input id="PERSONNELASSIGNMENT.PERSONNELASSIGNMENT_FLAG_4089" name="PERSONNELASSIGNMENT_flag"   type="hidden" >'+
  '	<input id="PERSONNELASSIGNMENT.PERSONNELASSIGNMENT_LNCOMPID2_4089" name="PERSONNELASSIGNMENT_lncompid2"   type="hidden" >'+
  '	<input id="PERSONNELASSIGNMENT.PERSONNELASSIGNMENT_LNJOBID_4089" name="PERSONNELASSIGNMENT_lnjobid"   type="hidden" >'+
					'</form>'+
					'	</div>'+
					'</div>';
		$("#"+e).find("[id='TEST_FEE_INFO_FORM2']").prepend(cellObj);
		elementSelectInitFunction(newElementNum);//初始化新增下拉控件
		cardDateWidInitFunction();//初始化新增日期控件
		newElementNum++;
		initAddValue(e,newElementNum);
	}
	 if(e=='fubiao2'){
		 var cellObj = '';
		 cellObj +=	'<div name="fubiaoElement" class="col-md-12 col-sm-12 col-lg-12" id="newElement'+newElementNum+'">'+
					'    <div class="contact-box CCAdd">'+
					'<form class="row cell add_element" style="padding-right:50px">';
		 cellObj += '	<span class="fa fa-trash-o deleteButton" style="position: absolute;right: 30px;font-size: 25px" onclick="removeElement('+newElementNum+')"></span>'+
					'	<span class="fa fa-save saveButton" style="position: absolute;right: 30px;font-size: 25px;top:50px" onclick="saveElement(this,\'4373\')"></span>'+
  '	<input id="LC_REMARK.LCREMARK_ID_4373" name="LCREMARK_ID"   type="hidden" >'+
  '	<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;line-height:25px">备注: </label>'+
  '			<textarea id="LC_REMARK.LCREMARK_REMARK_4373_add_'+newElementNum+'" name="LCREMARK_REMARK" class="CCReadTextarea form-control"  vtype="illegalChar;maxLength:100;minLength:null;"   style="width:200px;height:25px;padding:0;border:none;background-color:#fff"></textarea>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
					'</form>'+
					'	</div>'+
					'</div>';
		$("#"+e).find("[id='TEST_FEE_INFO_FORM2']").prepend(cellObj);
		elementSelectInitFunction(newElementNum);//初始化新增下拉控件
		cardDateWidInitFunction();//初始化新增日期控件
		newElementNum++;
		initAddValue(e,newElementNum);
	}
changeCssForApp4();
	}
	 function showDate_3863(arr,total,e){
	 if(e=='fubiao1'){
		 var cellObj = '';
		 for (var i = arr.length - 1; i >= 0; i--) {
var PERSONNELASSIGNMENT_EMPID = '';
if(arr.length>0&&arr[i].PERSONNELASSIGNMENT_EMPID!=null){
PERSONNELASSIGNMENT_EMPID = arr[i].PERSONNELASSIGNMENT_EMPID;
}
var PERSONNELASSIGNMENT_EMPID_DICTNAME = '';
if(arr.length>0&&arr[i].PERSONNELASSIGNMENT_EMPID_DICTNAME!=null){
PERSONNELASSIGNMENT_EMPID_DICTNAME = arr[i].PERSONNELASSIGNMENT_EMPID_DICTNAME;
}
var PERSONNELASSIGNMENT_DUTYTIME = '';
if(arr.length>0&&arr[i].PERSONNELASSIGNMENT_DUTYTIME!=null){
PERSONNELASSIGNMENT_DUTYTIME = arr[i].PERSONNELASSIGNMENT_DUTYTIME;
}
var PERSONNELASSIGNMENT_ALLOCATIONTYPE = '';
if(arr.length>0&&arr[i].PERSONNELASSIGNMENT_ALLOCATIONTYPE!=null){
PERSONNELASSIGNMENT_ALLOCATIONTYPE = arr[i].PERSONNELASSIGNMENT_ALLOCATIONTYPE;
}
var PERSONNELASSIGNMENT_PROC_ID = '';
if(arr.length>0&&arr[i].PERSONNELASSIGNMENT_PROC_ID!=null){
PERSONNELASSIGNMENT_PROC_ID = arr[i].PERSONNELASSIGNMENT_PROC_ID;
}
var PERSONNELASSIGNMENT_ID = '';
if(arr.length>0&&arr[i].PERSONNELASSIGNMENT_ID!=null){
PERSONNELASSIGNMENT_ID = arr[i].PERSONNELASSIGNMENT_ID;
}
var PERSONNELASSIGNMENT_NUMBER = '';
if(arr.length>0&&arr[i].PERSONNELASSIGNMENT_NUMBER!=null){
PERSONNELASSIGNMENT_NUMBER = arr[i].PERSONNELASSIGNMENT_NUMBER;
}
var PERSONNELASSIGNMENT_TRANSFER = '';
if(arr.length>0&&arr[i].PERSONNELASSIGNMENT_TRANSFER!=null){
PERSONNELASSIGNMENT_TRANSFER = arr[i].PERSONNELASSIGNMENT_TRANSFER;
}
var PERSONNELASSIGNMENT_TITLE = '';
if(arr.length>0&&arr[i].PERSONNELASSIGNMENT_TITLE!=null){
PERSONNELASSIGNMENT_TITLE = arr[i].PERSONNELASSIGNMENT_TITLE;
}
var PERSONNELASSIGNMENT_CNAME = '';
if(arr.length>0&&arr[i].PERSONNELASSIGNMENT_CNAME!=null){
PERSONNELASSIGNMENT_CNAME = arr[i].PERSONNELASSIGNMENT_CNAME;
}
var PERSONNELASSIGNMENT_BUSINESSID = '';
if(arr.length>0&&arr[i].PERSONNELASSIGNMENT_BUSINESSID!=null){
PERSONNELASSIGNMENT_BUSINESSID = arr[i].PERSONNELASSIGNMENT_BUSINESSID;
}
var PERSONNELASSIGNMENT_DEPID = '';
if(arr.length>0&&arr[i].PERSONNELASSIGNMENT_DEPID!=null){
PERSONNELASSIGNMENT_DEPID = arr[i].PERSONNELASSIGNMENT_DEPID;
}
var PERSONNELASSIGNMENT_EMPCODE = '';
if(arr.length>0&&arr[i].PERSONNELASSIGNMENT_EMPCODE!=null){
PERSONNELASSIGNMENT_EMPCODE = arr[i].PERSONNELASSIGNMENT_EMPCODE;
}
var PERSONNELASSIGNMENT_VALIEDATE = '';
if(arr.length>0&&arr[i].PERSONNELASSIGNMENT_VALIEDATE!=null){
PERSONNELASSIGNMENT_VALIEDATE = arr[i].PERSONNELASSIGNMENT_VALIEDATE;
}
var PERSONNELASSIGNMENT_NCANME = '';
if(arr.length>0&&arr[i].PERSONNELASSIGNMENT_NCANME!=null){
PERSONNELASSIGNMENT_NCANME = arr[i].PERSONNELASSIGNMENT_NCANME;
}
var PERSONNELASSIGNMENT_SEX = '';
if(arr.length>0&&arr[i].PERSONNELASSIGNMENT_SEX!=null){
PERSONNELASSIGNMENT_SEX = arr[i].PERSONNELASSIGNMENT_SEX;
}
var PERSONNELASSIGNMENT_XTYPE = '';
if(arr.length>0&&arr[i].PERSONNELASSIGNMENT_XTYPE!=null){
PERSONNELASSIGNMENT_XTYPE = arr[i].PERSONNELASSIGNMENT_XTYPE;
}
var PERSONNELASSIGNMENT_XTYPE_DICTNAME = '';
if(arr.length>0&&arr[i].PERSONNELASSIGNMENT_XTYPE_DICTNAME!=null){
PERSONNELASSIGNMENT_XTYPE_DICTNAME = arr[i].PERSONNELASSIGNMENT_XTYPE_DICTNAME;
}
var PERSONNELASSIGNMENT_COMPID = '';
if(arr.length>0&&arr[i].PERSONNELASSIGNMENT_COMPID!=null){
PERSONNELASSIGNMENT_COMPID = arr[i].PERSONNELASSIGNMENT_COMPID;
}
var PERSONNELASSIGNMENT_COMID2 = '';
if(arr.length>0&&arr[i].PERSONNELASSIGNMENT_COMID2!=null){
PERSONNELASSIGNMENT_COMID2 = arr[i].PERSONNELASSIGNMENT_COMID2;
}
var PERSONNELASSIGNMENT_XDEPID = '';
if(arr.length>0&&arr[i].PERSONNELASSIGNMENT_XDEPID!=null){
PERSONNELASSIGNMENT_XDEPID = arr[i].PERSONNELASSIGNMENT_XDEPID;
}
var PERSONNELASSIGNMENT_XDEPID_DICTNAME = '';
if(arr.length>0&&arr[i].PERSONNELASSIGNMENT_XDEPID_DICTNAME!=null){
PERSONNELASSIGNMENT_XDEPID_DICTNAME = arr[i].PERSONNELASSIGNMENT_XDEPID_DICTNAME;
}
var PERSONNELASSIGNMENT_JOBID = '';
if(arr.length>0&&arr[i].PERSONNELASSIGNMENT_JOBID!=null){
PERSONNELASSIGNMENT_JOBID = arr[i].PERSONNELASSIGNMENT_JOBID;
}
var PERSONNELASSIGNMENT_JOBID_DICTNAME = '';
if(arr.length>0&&arr[i].PERSONNELASSIGNMENT_JOBID_DICTNAME!=null){
PERSONNELASSIGNMENT_JOBID_DICTNAME = arr[i].PERSONNELASSIGNMENT_JOBID_DICTNAME;
}
var PERSONNELASSIGNMENT_NCOMPID = '';
if(arr.length>0&&arr[i].PERSONNELASSIGNMENT_NCOMPID!=null){
PERSONNELASSIGNMENT_NCOMPID = arr[i].PERSONNELASSIGNMENT_NCOMPID;
}
var PERSONNELASSIGNMENT_NCOMID2 = '';
if(arr.length>0&&arr[i].PERSONNELASSIGNMENT_NCOMID2!=null){
PERSONNELASSIGNMENT_NCOMID2 = arr[i].PERSONNELASSIGNMENT_NCOMID2;
}
var PERSONNELASSIGNMENT_NDEPID = '';
if(arr.length>0&&arr[i].PERSONNELASSIGNMENT_NDEPID!=null){
PERSONNELASSIGNMENT_NDEPID = arr[i].PERSONNELASSIGNMENT_NDEPID;
}
var PERSONNELASSIGNMENT_NDEPID_DICTNAME = '';
if(arr.length>0&&arr[i].PERSONNELASSIGNMENT_NDEPID_DICTNAME!=null){
PERSONNELASSIGNMENT_NDEPID_DICTNAME = arr[i].PERSONNELASSIGNMENT_NDEPID_DICTNAME;
}
var PERSONNELASSIGNMENT_NJOBID = '';
if(arr.length>0&&arr[i].PERSONNELASSIGNMENT_NJOBID!=null){
PERSONNELASSIGNMENT_NJOBID = arr[i].PERSONNELASSIGNMENT_NJOBID;
}
var PERSONNELASSIGNMENT_NJOBID_DICTNAME = '';
if(arr.length>0&&arr[i].PERSONNELASSIGNMENT_NJOBID_DICTNAME!=null){
PERSONNELASSIGNMENT_NJOBID_DICTNAME = arr[i].PERSONNELASSIGNMENT_NJOBID_DICTNAME;
}
var PERSONNELASSIGNMENT_REMARK = '';
if(arr.length>0&&arr[i].PERSONNELASSIGNMENT_REMARK!=null){
PERSONNELASSIGNMENT_REMARK = arr[i].PERSONNELASSIGNMENT_REMARK;
}
var PERSONNELASSIGNMENT_DEPARTMENT = '';
if(arr.length>0&&arr[i].PERSONNELASSIGNMENT_DEPARTMENT!=null){
PERSONNELASSIGNMENT_DEPARTMENT = arr[i].PERSONNELASSIGNMENT_DEPARTMENT;
}
var PERSONNELASSIGNMENT_REASON = '';
if(arr.length>0&&arr[i].PERSONNELASSIGNMENT_REASON!=null){
PERSONNELASSIGNMENT_REASON = arr[i].PERSONNELASSIGNMENT_REASON;
}
var PERSONNELASSIGNMENT_DEPARTMENTCONFIRMS = '';
if(arr.length>0&&arr[i].PERSONNELASSIGNMENT_DEPARTMENTCONFIRMS!=null){
PERSONNELASSIGNMENT_DEPARTMENTCONFIRMS = arr[i].PERSONNELASSIGNMENT_DEPARTMENTCONFIRMS;
}
var PERSONNELASSIGNMENT_OTHERSINGLE = '';
if(arr.length>0&&arr[i].PERSONNELASSIGNMENT_OTHERSINGLE!=null){
PERSONNELASSIGNMENT_OTHERSINGLE = arr[i].PERSONNELASSIGNMENT_OTHERSINGLE;
}
var PERSONNELASSIGNMENT_LNCOMPID = '';
if(arr.length>0&&arr[i].PERSONNELASSIGNMENT_LNCOMPID!=null){
PERSONNELASSIGNMENT_LNCOMPID = arr[i].PERSONNELASSIGNMENT_LNCOMPID;
}
var PERSONNELASSIGNMENT_FLAG = '';
if(arr.length>0&&arr[i].PERSONNELASSIGNMENT_FLAG!=null){
PERSONNELASSIGNMENT_FLAG = arr[i].PERSONNELASSIGNMENT_FLAG;
}
var PERSONNELASSIGNMENT_LNCOMPID2 = '';
if(arr.length>0&&arr[i].PERSONNELASSIGNMENT_LNCOMPID2!=null){
PERSONNELASSIGNMENT_LNCOMPID2 = arr[i].PERSONNELASSIGNMENT_LNCOMPID2;
}
var PERSONNELASSIGNMENT_LNJOBID = '';
if(arr.length>0&&arr[i].PERSONNELASSIGNMENT_LNJOBID!=null){
PERSONNELASSIGNMENT_LNJOBID = arr[i].PERSONNELASSIGNMENT_LNJOBID;
}
			if(0 == Currentpage11){
				cellObj += '<span class="fa fa-arrow-circle-right" style="font-size:30px;padding-right:15px;float:right" onclick="next(\''+e+'\')"></span>';
			}else if(total-1==Currentpage11){
				cellObj += '<span class="fa fa-arrow-circle-left" style="font-size:30px;padding-right:15px;float:right" onclick="last(\''+e+'\')"></span>';
			}else{
				cellObj += '<span class="fa fa-arrow-circle-right" style="font-size:30px;padding-right:15px;float:right" onclick="next(\''+e+'\')"></span>'+
						   '<span class="fa fa-arrow-circle-left" style="font-size:30px;padding-right:15px;float:right" onclick="last(\''+e+'\')"></span>';
			}
			cellObj += 		'<div name="fubiaoElement"  class="col-md-12 col-sm-12 col-lg-12">'+
							'    <div class="contact-box">'+
							'		<div class="row cell">'+
  '	<input id="PERSONNELASSIGNMENT.PERSONNELASSIGNMENT_DUTYTIME_4089" name="PERSONNELASSIGNMENT_DUTYTIME" value="'+PERSONNELASSIGNMENT_DUTYTIME+'"  type="hidden" >'+
  '	<input id="PERSONNELASSIGNMENT.PERSONNELASSIGNMENT_ALLOCATIONTYPE_4089" name="PERSONNELASSIGNMENT_ALLOCATIONTYPE" value="'+PERSONNELASSIGNMENT_ALLOCATIONTYPE+'"  type="hidden" >'+
  '	<input id="PERSONNELASSIGNMENT.PERSONNELASSIGNMENT_PROC_ID_4089" name="PERSONNELASSIGNMENT_PROC_ID" value="'+PERSONNELASSIGNMENT_PROC_ID+'"  type="hidden" >'+
  '	<input id="PERSONNELASSIGNMENT.PERSONNELASSIGNMENT_ID_4089" name="PERSONNELASSIGNMENT_ID" value="'+PERSONNELASSIGNMENT_ID+'"  type="hidden" >'+
  '	<input id="PERSONNELASSIGNMENT.PERSONNELASSIGNMENT_NUMBER_4089" name="PERSONNELASSIGNMENT_NUMBER" value="'+PERSONNELASSIGNMENT_NUMBER+'"  type="hidden" >'+
  '	<input id="PERSONNELASSIGNMENT.PERSONNELASSIGNMENT_TRANSFER_4089" name="PERSONNELASSIGNMENT_TRANSFER" value="'+PERSONNELASSIGNMENT_TRANSFER+'"  type="hidden" >'+
  '	<input id="PERSONNELASSIGNMENT.PERSONNELASSIGNMENT_TITLE_4089" name="PERSONNELASSIGNMENT_TITLE" value="'+PERSONNELASSIGNMENT_TITLE+'"  type="hidden" >'+
  '	<input id="PERSONNELASSIGNMENT.PERSONNELASSIGNMENT_CNAME_4089" name="PERSONNELASSIGNMENT_CNAME" value="'+PERSONNELASSIGNMENT_CNAME+'"  type="hidden" >'+
  '	<input id="PERSONNELASSIGNMENT.PERSONNELASSIGNMENT_BUSINESSID_4089" name="PERSONNELASSIGNMENT_BUSINESSID" value="'+PERSONNELASSIGNMENT_BUSINESSID+'"  type="hidden" >'+
  '	<input id="PERSONNELASSIGNMENT.PERSONNELASSIGNMENT_DEPID_4089" name="PERSONNELASSIGNMENT_DEPID" value="'+PERSONNELASSIGNMENT_DEPID+'"  type="hidden" >'+
  '	<input id="PERSONNELASSIGNMENT.PERSONNELASSIGNMENT_EMPCODE_4089" name="PERSONNELASSIGNMENT_EMPCODE" value="'+PERSONNELASSIGNMENT_EMPCODE+'"  type="hidden" >'+
  '	<input id="PERSONNELASSIGNMENT.PERSONNELASSIGNMENT_VALIEDATE_4089" name="PERSONNELASSIGNMENT_VALIEDATE" value="'+PERSONNELASSIGNMENT_VALIEDATE+'"  type="hidden" >'+
  '	<input id="PERSONNELASSIGNMENT.PERSONNELASSIGNMENT_NCANME_4089" name="PERSONNELASSIGNMENT_NCANME" value="'+PERSONNELASSIGNMENT_NCANME+'"  type="hidden" >'+
  '	<input id="PERSONNELASSIGNMENT.PERSONNELASSIGNMENT_SEX_4089" name="PERSONNELASSIGNMENT_SEX" value="'+PERSONNELASSIGNMENT_SEX+'"  type="hidden" >'+
  '	<input id="PERSONNELASSIGNMENT.PERSONNELASSIGNMENT_COMPID_4089" name="PERSONNELASSIGNMENT_COMPID" value="'+PERSONNELASSIGNMENT_COMPID+'"  type="hidden" >'+
  '	<input id="PERSONNELASSIGNMENT.PERSONNELASSIGNMENT_COMID2_4089" name="PERSONNELASSIGNMENT_COMID2" value="'+PERSONNELASSIGNMENT_COMID2+'"  type="hidden" >'+
  '	<input id="PERSONNELASSIGNMENT.PERSONNELASSIGNMENT_NCOMPID_4089" name="PERSONNELASSIGNMENT_NCOMPID" value="'+PERSONNELASSIGNMENT_NCOMPID+'"  type="hidden" >'+
  '	<input id="PERSONNELASSIGNMENT.PERSONNELASSIGNMENT_NCOMID2_4089" name="PERSONNELASSIGNMENT_NCOMID2" value="'+PERSONNELASSIGNMENT_NCOMID2+'"  type="hidden" >'+
  '	<input id="PERSONNELASSIGNMENT.PERSONNELASSIGNMENT_REMARK_4089" name="PERSONNELASSIGNMENT_REMARK" value="'+PERSONNELASSIGNMENT_REMARK+'"  type="hidden" >'+
  '	<input id="PERSONNELASSIGNMENT.PERSONNELASSIGNMENT_DEPARTMENT_4089" name="PERSONNELASSIGNMENT_DEPARTMENT" value="'+PERSONNELASSIGNMENT_DEPARTMENT+'"  type="hidden" >'+
  '	<input id="PERSONNELASSIGNMENT.PERSONNELASSIGNMENT_REASON_4089" name="PERSONNELASSIGNMENT_REASON" value="'+PERSONNELASSIGNMENT_REASON+'"  type="hidden" >'+
  '	<input id="PERSONNELASSIGNMENT.PERSONNELASSIGNMENT_DEPARTMENTCONFIRMS_4089" name="PERSONNELASSIGNMENT_DEPARTMENTCONFIRMS" value="'+PERSONNELASSIGNMENT_DEPARTMENTCONFIRMS+'"  type="hidden" >'+
  '	<input id="PERSONNELASSIGNMENT.PERSONNELASSIGNMENT_OTHERSINGLE_4089" name="PERSONNELASSIGNMENT_OTHERSINGLE" value="'+PERSONNELASSIGNMENT_OTHERSINGLE+'"  type="hidden" >'+
  '	<input id="PERSONNELASSIGNMENT.PERSONNELASSIGNMENT_LNCOMPID_4089" name="PERSONNELASSIGNMENT_LNCOMPID" value="'+PERSONNELASSIGNMENT_LNCOMPID+'"  type="hidden" >'+
  '	<input id="PERSONNELASSIGNMENT.PERSONNELASSIGNMENT_FLAG_4089" name="PERSONNELASSIGNMENT_FLAG" value="'+PERSONNELASSIGNMENT_FLAG+'"  type="hidden" >'+
  '	<input id="PERSONNELASSIGNMENT.PERSONNELASSIGNMENT_LNCOMPID2_4089" name="PERSONNELASSIGNMENT_LNCOMPID2" value="'+PERSONNELASSIGNMENT_LNCOMPID2+'"  type="hidden" >'+
  '	<input id="PERSONNELASSIGNMENT.PERSONNELASSIGNMENT_LNJOBID_4089" name="PERSONNELASSIGNMENT_LNJOBID" value="'+PERSONNELASSIGNMENT_LNJOBID+'"  type="hidden" >'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">姓名: </label>'+
  '			<input id="PERSONNELASSIGNMENT.PERSONNELASSIGNMENT_EMPID_4089" title="姓名" styleType="select" name="PERSONNELASSIGNMENT_EMPID" value="'+PERSONNELASSIGNMENT_EMPID_DICTNAME+'" class="form-control " columnId="74371" style="width:200px;float:left;height:25px;padding:0;border:none;background-color:#fff"  emptyText=""  onchange="PERSONNELASSIGNMENT_PERSONNELASSIGNMENT_EMPID_valueChange_4089(this)" required="true"  dataField1 = "sql"  readonly  style="border:none;width:200px; " textField="text" valueField="id" DictName="sql159" dataField="data_form_74371"initParam = "_"/>'+
	'			<input id="PERSONNELASSIGNMENT.PERSONNELASSIGNMENT_EMPID_4089_value" name="PERSONNELASSIGNMENT_EMPID" type="hidden" value="'+PERSONNELASSIGNMENT_EMPID+'"/>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">类型: </label>'+
  '			<input id="PERSONNELASSIGNMENT.PERSONNELASSIGNMENT_XTYPE_4089" title="类型" styleType="select" name="PERSONNELASSIGNMENT_XTYPE" value="'+PERSONNELASSIGNMENT_XTYPE_DICTNAME+'" class="form-control " columnId="74383" style="width:200px;float:left;height:25px;padding:0;border:none;background-color:#fff"  emptyText=""  required="true"  dataField1 = "dict"  readonly  style="border:none;width:200px; " showNullItem="true" textField="dictName" valueField="dictId" DictName="XM_XTYPE" nullItemText="" dataField="dicts_form_74383"initParam = "_"/>'+
	'			<input id="PERSONNELASSIGNMENT.PERSONNELASSIGNMENT_XTYPE_4089_value" name="PERSONNELASSIGNMENT_XTYPE" type="hidden" value="'+PERSONNELASSIGNMENT_XTYPE+'"/>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">现属支行/部门: </label>'+
  '			<input id="PERSONNELASSIGNMENT.PERSONNELASSIGNMENT_XDEPID_4089" title="现属支行/部门" styleType="select" name="PERSONNELASSIGNMENT_XDEPID" value="'+PERSONNELASSIGNMENT_XDEPID_DICTNAME+'" class="form-control " columnId="74386" style="width:200px;float:left;height:25px;padding:0;border:none;background-color:#fff"  emptyText=""  dataField1 = "sql"  readonly  style="border:none;width:200px; " showNullItem="true" textField="text" valueField="id" DictName="sql9" nullItemText="" dataField="data_form_74386"initParam = "_"/>'+
	'			<input id="PERSONNELASSIGNMENT.PERSONNELASSIGNMENT_XDEPID_4089_value" name="PERSONNELASSIGNMENT_XDEPID" type="hidden" value="'+PERSONNELASSIGNMENT_XDEPID+'"/>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">现岗位: </label>'+
  '			<input id="PERSONNELASSIGNMENT.PERSONNELASSIGNMENT_JOBID_4089" title="现岗位" styleType="select" name="PERSONNELASSIGNMENT_JOBID" value="'+PERSONNELASSIGNMENT_JOBID_DICTNAME+'" class="form-control " columnId="74387" style="width:200px;float:left;height:25px;padding:0;border:none;background-color:#fff"  emptyText=""  dataField1 = "sql"  readonly  style="border:none;width:200px; " showNullItem="true" textField="text" valueField="id" DictName="jobidSql1" nullItemText="" dataField="data_form_74387"initParam = "_"/>'+
	'			<input id="PERSONNELASSIGNMENT.PERSONNELASSIGNMENT_JOBID_4089_value" name="PERSONNELASSIGNMENT_JOBID" type="hidden" value="'+PERSONNELASSIGNMENT_JOBID+'"/>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">调配部门: </label>'+
  '			<input id="PERSONNELASSIGNMENT.PERSONNELASSIGNMENT_NDEPID_4089" title="调配部门" styleType="select" name="PERSONNELASSIGNMENT_NDEPID" value="'+PERSONNELASSIGNMENT_NDEPID_DICTNAME+'" class="form-control " columnId="74372" style="width:200px;float:left;height:25px;padding:0;border:none;background-color:#fff"  emptyText=""  onchange="PERSONNELASSIGNMENT_PERSONNELASSIGNMENT_NDEPID_valueChange_4089(this)" required="true"  dataField1 = "sql"  readonly  style="border:none;width:200px; " textField="text" valueField="id" DictName="sql9" dataField="data_form_74372"initParam = "_"/>'+
	'			<input id="PERSONNELASSIGNMENT.PERSONNELASSIGNMENT_NDEPID_4089_value" name="PERSONNELASSIGNMENT_NDEPID" type="hidden" value="'+PERSONNELASSIGNMENT_NDEPID+'"/>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">调配岗位: </label>'+
  '			<input id="PERSONNELASSIGNMENT.PERSONNELASSIGNMENT_NJOBID_4089" title="调配岗位" styleType="select" name="PERSONNELASSIGNMENT_NJOBID" value="'+PERSONNELASSIGNMENT_NJOBID_DICTNAME+'" class="form-control " columnId="74390" style="width:200px;float:left;height:25px;padding:0;border:none;background-color:#fff"  emptyText=""  dataField1 = "sql"  readonly  style="border:none;width:200px; " textField="text" valueField="id" DictName="sql35" dataField="data_form_74390"initParam = "_"/>'+
	'			<input id="PERSONNELASSIGNMENT.PERSONNELASSIGNMENT_NJOBID_4089_value" name="PERSONNELASSIGNMENT_NJOBID" type="hidden" value="'+PERSONNELASSIGNMENT_NJOBID+'"/>'+
  '		</div>'+
  '	</div>'+
							'		</div>'+
							'	</div>'+
							'</div>';
			}
	$("#"+e).find("[id='TEST_FEE_INFO_FORM']").html(cellObj);
}
	 if(e=='fubiao2'){
		 var cellObj = '';
		 for (var i = arr.length - 1; i >= 0; i--) {
var LCREMARK_ID = '';
if(arr.length>0&&arr[i].LCREMARK_ID!=null){
LCREMARK_ID = arr[i].LCREMARK_ID;
}
var LCREMARK_REMARK = '';
if(arr.length>0&&arr[i].LCREMARK_REMARK!=null){
LCREMARK_REMARK = arr[i].LCREMARK_REMARK;
}
			if(0 == Currentpage12){
				cellObj += '<span class="fa fa-arrow-circle-right" style="font-size:30px;padding-right:15px;float:right" onclick="next(\''+e+'\')"></span>';
			}else if(total-1==Currentpage12){
				cellObj += '<span class="fa fa-arrow-circle-left" style="font-size:30px;padding-right:15px;float:right" onclick="last(\''+e+'\')"></span>';
			}else{
				cellObj += '<span class="fa fa-arrow-circle-right" style="font-size:30px;padding-right:15px;float:right" onclick="next(\''+e+'\')"></span>'+
						   '<span class="fa fa-arrow-circle-left" style="font-size:30px;padding-right:15px;float:right" onclick="last(\''+e+'\')"></span>';
			}
			cellObj += 		'<div name="fubiaoElement"  class="col-md-12 col-sm-12 col-lg-12">'+
							'    <div class="contact-box">'+
							'		<div class="row cell">'+
  '	<input id="LC_REMARK.LCREMARK_ID_4373" name="LCREMARK_ID" value="'+LCREMARK_ID+'"  type="hidden" >'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;line-height:25px">备注: </label>'+
  '			<input id="LC_REMARK.LCREMARK_REMARK_4373_'+i+'" name="LCREMARK_REMARK" dataType="text" class="CCReadText"  value="'+LCREMARK_REMARK+'" type="text" readonly oninput="myFunction(this,\'LCREMARK_REMARK\')"   style="width:200px;height:25px;padding:0;border:none;background-color:#fff"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
							'		</div>'+
							'	</div>'+
							'</div>';
			}
	$("#"+e).find("[id='TEST_FEE_INFO_FORM']").html(cellObj);
}
	}
	 var newElementNum = 0;
	 function showDate_3864(arr,total,e){
	 if(e=='fubiao1'){
		 var cellObj = '';
		 if(arr.length>0){
		 for (var i = arr.length - 1; i >= 0; i--) {
var PERSONNELASSIGNMENT_EMPID = '';
if(arr.length>0&&arr[i].PERSONNELASSIGNMENT_EMPID!=null){
PERSONNELASSIGNMENT_EMPID = arr[i].PERSONNELASSIGNMENT_EMPID;
}
var PERSONNELASSIGNMENT_EMPID_DICTNAME = '';
if(arr.length>0&&arr[i].PERSONNELASSIGNMENT_EMPID_DICTNAME!=null){
PERSONNELASSIGNMENT_EMPID_DICTNAME = arr[i].PERSONNELASSIGNMENT_EMPID_DICTNAME;
}
var PERSONNELASSIGNMENT_DUTYTIME = '';
if(arr.length>0&&arr[i].PERSONNELASSIGNMENT_DUTYTIME!=null){
PERSONNELASSIGNMENT_DUTYTIME = arr[i].PERSONNELASSIGNMENT_DUTYTIME;
}
var PERSONNELASSIGNMENT_ALLOCATIONTYPE = '';
if(arr.length>0&&arr[i].PERSONNELASSIGNMENT_ALLOCATIONTYPE!=null){
PERSONNELASSIGNMENT_ALLOCATIONTYPE = arr[i].PERSONNELASSIGNMENT_ALLOCATIONTYPE;
}
var PERSONNELASSIGNMENT_PROC_ID = '';
if(arr.length>0&&arr[i].PERSONNELASSIGNMENT_PROC_ID!=null){
PERSONNELASSIGNMENT_PROC_ID = arr[i].PERSONNELASSIGNMENT_PROC_ID;
}
var PERSONNELASSIGNMENT_ID = '';
if(arr.length>0&&arr[i].PERSONNELASSIGNMENT_ID!=null){
PERSONNELASSIGNMENT_ID = arr[i].PERSONNELASSIGNMENT_ID;
}
var PERSONNELASSIGNMENT_NUMBER = '';
if(arr.length>0&&arr[i].PERSONNELASSIGNMENT_NUMBER!=null){
PERSONNELASSIGNMENT_NUMBER = arr[i].PERSONNELASSIGNMENT_NUMBER;
}
var PERSONNELASSIGNMENT_TRANSFER = '';
if(arr.length>0&&arr[i].PERSONNELASSIGNMENT_TRANSFER!=null){
PERSONNELASSIGNMENT_TRANSFER = arr[i].PERSONNELASSIGNMENT_TRANSFER;
}
var PERSONNELASSIGNMENT_TITLE = '';
if(arr.length>0&&arr[i].PERSONNELASSIGNMENT_TITLE!=null){
PERSONNELASSIGNMENT_TITLE = arr[i].PERSONNELASSIGNMENT_TITLE;
}
var PERSONNELASSIGNMENT_CNAME = '';
if(arr.length>0&&arr[i].PERSONNELASSIGNMENT_CNAME!=null){
PERSONNELASSIGNMENT_CNAME = arr[i].PERSONNELASSIGNMENT_CNAME;
}
var PERSONNELASSIGNMENT_BUSINESSID = '';
if(arr.length>0&&arr[i].PERSONNELASSIGNMENT_BUSINESSID!=null){
PERSONNELASSIGNMENT_BUSINESSID = arr[i].PERSONNELASSIGNMENT_BUSINESSID;
}
var PERSONNELASSIGNMENT_DEPID = '';
if(arr.length>0&&arr[i].PERSONNELASSIGNMENT_DEPID!=null){
PERSONNELASSIGNMENT_DEPID = arr[i].PERSONNELASSIGNMENT_DEPID;
}
var PERSONNELASSIGNMENT_EMPCODE = '';
if(arr.length>0&&arr[i].PERSONNELASSIGNMENT_EMPCODE!=null){
PERSONNELASSIGNMENT_EMPCODE = arr[i].PERSONNELASSIGNMENT_EMPCODE;
}
var PERSONNELASSIGNMENT_VALIEDATE = '';
if(arr.length>0&&arr[i].PERSONNELASSIGNMENT_VALIEDATE!=null){
PERSONNELASSIGNMENT_VALIEDATE = arr[i].PERSONNELASSIGNMENT_VALIEDATE;
}
var PERSONNELASSIGNMENT_NCANME = '';
if(arr.length>0&&arr[i].PERSONNELASSIGNMENT_NCANME!=null){
PERSONNELASSIGNMENT_NCANME = arr[i].PERSONNELASSIGNMENT_NCANME;
}
var PERSONNELASSIGNMENT_SEX = '';
if(arr.length>0&&arr[i].PERSONNELASSIGNMENT_SEX!=null){
PERSONNELASSIGNMENT_SEX = arr[i].PERSONNELASSIGNMENT_SEX;
}
var PERSONNELASSIGNMENT_XTYPE = '';
if(arr.length>0&&arr[i].PERSONNELASSIGNMENT_XTYPE!=null){
PERSONNELASSIGNMENT_XTYPE = arr[i].PERSONNELASSIGNMENT_XTYPE;
}
var PERSONNELASSIGNMENT_XTYPE_DICTNAME = '';
if(arr.length>0&&arr[i].PERSONNELASSIGNMENT_XTYPE_DICTNAME!=null){
PERSONNELASSIGNMENT_XTYPE_DICTNAME = arr[i].PERSONNELASSIGNMENT_XTYPE_DICTNAME;
}
var PERSONNELASSIGNMENT_COMPID = '';
if(arr.length>0&&arr[i].PERSONNELASSIGNMENT_COMPID!=null){
PERSONNELASSIGNMENT_COMPID = arr[i].PERSONNELASSIGNMENT_COMPID;
}
var PERSONNELASSIGNMENT_COMID2 = '';
if(arr.length>0&&arr[i].PERSONNELASSIGNMENT_COMID2!=null){
PERSONNELASSIGNMENT_COMID2 = arr[i].PERSONNELASSIGNMENT_COMID2;
}
var PERSONNELASSIGNMENT_XDEPID = '';
if(arr.length>0&&arr[i].PERSONNELASSIGNMENT_XDEPID!=null){
PERSONNELASSIGNMENT_XDEPID = arr[i].PERSONNELASSIGNMENT_XDEPID;
}
var PERSONNELASSIGNMENT_XDEPID_DICTNAME = '';
if(arr.length>0&&arr[i].PERSONNELASSIGNMENT_XDEPID_DICTNAME!=null){
PERSONNELASSIGNMENT_XDEPID_DICTNAME = arr[i].PERSONNELASSIGNMENT_XDEPID_DICTNAME;
}
var PERSONNELASSIGNMENT_JOBID = '';
if(arr.length>0&&arr[i].PERSONNELASSIGNMENT_JOBID!=null){
PERSONNELASSIGNMENT_JOBID = arr[i].PERSONNELASSIGNMENT_JOBID;
}
var PERSONNELASSIGNMENT_JOBID_DICTNAME = '';
if(arr.length>0&&arr[i].PERSONNELASSIGNMENT_JOBID_DICTNAME!=null){
PERSONNELASSIGNMENT_JOBID_DICTNAME = arr[i].PERSONNELASSIGNMENT_JOBID_DICTNAME;
}
var PERSONNELASSIGNMENT_NCOMPID = '';
if(arr.length>0&&arr[i].PERSONNELASSIGNMENT_NCOMPID!=null){
PERSONNELASSIGNMENT_NCOMPID = arr[i].PERSONNELASSIGNMENT_NCOMPID;
}
var PERSONNELASSIGNMENT_NCOMID2 = '';
if(arr.length>0&&arr[i].PERSONNELASSIGNMENT_NCOMID2!=null){
PERSONNELASSIGNMENT_NCOMID2 = arr[i].PERSONNELASSIGNMENT_NCOMID2;
}
var PERSONNELASSIGNMENT_NDEPID = '';
if(arr.length>0&&arr[i].PERSONNELASSIGNMENT_NDEPID!=null){
PERSONNELASSIGNMENT_NDEPID = arr[i].PERSONNELASSIGNMENT_NDEPID;
}
var PERSONNELASSIGNMENT_NDEPID_DICTNAME = '';
if(arr.length>0&&arr[i].PERSONNELASSIGNMENT_NDEPID_DICTNAME!=null){
PERSONNELASSIGNMENT_NDEPID_DICTNAME = arr[i].PERSONNELASSIGNMENT_NDEPID_DICTNAME;
}
var PERSONNELASSIGNMENT_NJOBID = '';
if(arr.length>0&&arr[i].PERSONNELASSIGNMENT_NJOBID!=null){
PERSONNELASSIGNMENT_NJOBID = arr[i].PERSONNELASSIGNMENT_NJOBID;
}
var PERSONNELASSIGNMENT_NJOBID_DICTNAME = '';
if(arr.length>0&&arr[i].PERSONNELASSIGNMENT_NJOBID_DICTNAME!=null){
PERSONNELASSIGNMENT_NJOBID_DICTNAME = arr[i].PERSONNELASSIGNMENT_NJOBID_DICTNAME;
}
var PERSONNELASSIGNMENT_REMARK = '';
if(arr.length>0&&arr[i].PERSONNELASSIGNMENT_REMARK!=null){
PERSONNELASSIGNMENT_REMARK = arr[i].PERSONNELASSIGNMENT_REMARK;
}
var PERSONNELASSIGNMENT_DEPARTMENT = '';
if(arr.length>0&&arr[i].PERSONNELASSIGNMENT_DEPARTMENT!=null){
PERSONNELASSIGNMENT_DEPARTMENT = arr[i].PERSONNELASSIGNMENT_DEPARTMENT;
}
var PERSONNELASSIGNMENT_REASON = '';
if(arr.length>0&&arr[i].PERSONNELASSIGNMENT_REASON!=null){
PERSONNELASSIGNMENT_REASON = arr[i].PERSONNELASSIGNMENT_REASON;
}
var PERSONNELASSIGNMENT_DEPARTMENTCONFIRMS = '';
if(arr.length>0&&arr[i].PERSONNELASSIGNMENT_DEPARTMENTCONFIRMS!=null){
PERSONNELASSIGNMENT_DEPARTMENTCONFIRMS = arr[i].PERSONNELASSIGNMENT_DEPARTMENTCONFIRMS;
}
var PERSONNELASSIGNMENT_OTHERSINGLE = '';
if(arr.length>0&&arr[i].PERSONNELASSIGNMENT_OTHERSINGLE!=null){
PERSONNELASSIGNMENT_OTHERSINGLE = arr[i].PERSONNELASSIGNMENT_OTHERSINGLE;
}
var PERSONNELASSIGNMENT_LNCOMPID = '';
if(arr.length>0&&arr[i].PERSONNELASSIGNMENT_LNCOMPID!=null){
PERSONNELASSIGNMENT_LNCOMPID = arr[i].PERSONNELASSIGNMENT_LNCOMPID;
}
var PERSONNELASSIGNMENT_FLAG = '';
if(arr.length>0&&arr[i].PERSONNELASSIGNMENT_FLAG!=null){
PERSONNELASSIGNMENT_FLAG = arr[i].PERSONNELASSIGNMENT_FLAG;
}
var PERSONNELASSIGNMENT_LNCOMPID2 = '';
if(arr.length>0&&arr[i].PERSONNELASSIGNMENT_LNCOMPID2!=null){
PERSONNELASSIGNMENT_LNCOMPID2 = arr[i].PERSONNELASSIGNMENT_LNCOMPID2;
}
var PERSONNELASSIGNMENT_LNJOBID = '';
if(arr.length>0&&arr[i].PERSONNELASSIGNMENT_LNJOBID!=null){
PERSONNELASSIGNMENT_LNJOBID = arr[i].PERSONNELASSIGNMENT_LNJOBID;
}
			cellObj += 		'<div class="col-md-12 col-sm-12 col-lg-12" name="fubiaoElement" >'+
							'    <div class="contact-box" style="min-height:110px">'+
							'		<form class="row cell" style="padding-right:50px">'+
							'		<span class="fa fa-trash-o deleteButton" id="deleteButton_'+i+'" title="删除" style="position: absolute;right: 30px;font-size: 25px;top: 5px;" onclick="deleteElement(this,\'4089\')"></span>'+
							'		<span class="fa fa-save saveButton" id="saveButton_'+i+'" title="保存" style="position: absolute;right: 29px;font-size: 25px;top: 40px;" onclick="saveElement(this,\'4089\')"></span>'+
							'		<span class="fa fa-edit updateButton" id="updateButton_'+i+'" title="修改" style="position: absolute;right: 25px;font-size: 25px;top: 77px;" onclick="updateElement(this,\''+i+'\',\''+e+'\')"></span>'+
  '	<input id="PERSONNELASSIGNMENT.PERSONNELASSIGNMENT_DUTYTIME_4089" name="PERSONNELASSIGNMENT_DUTYTIME" value="'+PERSONNELASSIGNMENT_DUTYTIME+'"  type="hidden" >'+
  '	<input id="PERSONNELASSIGNMENT.PERSONNELASSIGNMENT_ALLOCATIONTYPE_4089" name="PERSONNELASSIGNMENT_ALLOCATIONTYPE" value="'+PERSONNELASSIGNMENT_ALLOCATIONTYPE+'"  type="hidden" >'+
  '	<input id="PERSONNELASSIGNMENT.PERSONNELASSIGNMENT_PROC_ID_4089" name="PERSONNELASSIGNMENT_PROC_ID" value="'+PERSONNELASSIGNMENT_PROC_ID+'"  type="hidden" >'+
  '	<input id="PERSONNELASSIGNMENT.PERSONNELASSIGNMENT_ID_4089" name="PERSONNELASSIGNMENT_ID" value="'+PERSONNELASSIGNMENT_ID+'"  type="hidden" >'+
  '	<input id="PERSONNELASSIGNMENT.PERSONNELASSIGNMENT_NUMBER_4089" name="PERSONNELASSIGNMENT_NUMBER" value="'+PERSONNELASSIGNMENT_NUMBER+'"  type="hidden" >'+
  '	<input id="PERSONNELASSIGNMENT.PERSONNELASSIGNMENT_TRANSFER_4089" name="PERSONNELASSIGNMENT_TRANSFER" value="'+PERSONNELASSIGNMENT_TRANSFER+'"  type="hidden" >'+
  '	<input id="PERSONNELASSIGNMENT.PERSONNELASSIGNMENT_TITLE_4089" name="PERSONNELASSIGNMENT_TITLE" value="'+PERSONNELASSIGNMENT_TITLE+'"  type="hidden" >'+
  '	<input id="PERSONNELASSIGNMENT.PERSONNELASSIGNMENT_CNAME_4089" name="PERSONNELASSIGNMENT_CNAME" value="'+PERSONNELASSIGNMENT_CNAME+'"  type="hidden" >'+
  '	<input id="PERSONNELASSIGNMENT.PERSONNELASSIGNMENT_BUSINESSID_4089" name="PERSONNELASSIGNMENT_BUSINESSID" value="'+PERSONNELASSIGNMENT_BUSINESSID+'"  type="hidden" >'+
  '	<input id="PERSONNELASSIGNMENT.PERSONNELASSIGNMENT_DEPID_4089" name="PERSONNELASSIGNMENT_DEPID" value="'+PERSONNELASSIGNMENT_DEPID+'"  type="hidden" >'+
  '	<input id="PERSONNELASSIGNMENT.PERSONNELASSIGNMENT_EMPCODE_4089" name="PERSONNELASSIGNMENT_EMPCODE" value="'+PERSONNELASSIGNMENT_EMPCODE+'"  type="hidden" >'+
  '	<input id="PERSONNELASSIGNMENT.PERSONNELASSIGNMENT_VALIEDATE_4089" name="PERSONNELASSIGNMENT_VALIEDATE" value="'+PERSONNELASSIGNMENT_VALIEDATE+'"  type="hidden" >'+
  '	<input id="PERSONNELASSIGNMENT.PERSONNELASSIGNMENT_NCANME_4089" name="PERSONNELASSIGNMENT_NCANME" value="'+PERSONNELASSIGNMENT_NCANME+'"  type="hidden" >'+
  '	<input id="PERSONNELASSIGNMENT.PERSONNELASSIGNMENT_SEX_4089" name="PERSONNELASSIGNMENT_SEX" value="'+PERSONNELASSIGNMENT_SEX+'"  type="hidden" >'+
  '	<input id="PERSONNELASSIGNMENT.PERSONNELASSIGNMENT_COMPID_4089" name="PERSONNELASSIGNMENT_COMPID" value="'+PERSONNELASSIGNMENT_COMPID+'"  type="hidden" >'+
  '	<input id="PERSONNELASSIGNMENT.PERSONNELASSIGNMENT_COMID2_4089" name="PERSONNELASSIGNMENT_COMID2" value="'+PERSONNELASSIGNMENT_COMID2+'"  type="hidden" >'+
  '	<input id="PERSONNELASSIGNMENT.PERSONNELASSIGNMENT_NCOMPID_4089" name="PERSONNELASSIGNMENT_NCOMPID" value="'+PERSONNELASSIGNMENT_NCOMPID+'"  type="hidden" >'+
  '	<input id="PERSONNELASSIGNMENT.PERSONNELASSIGNMENT_NCOMID2_4089" name="PERSONNELASSIGNMENT_NCOMID2" value="'+PERSONNELASSIGNMENT_NCOMID2+'"  type="hidden" >'+
  '	<input id="PERSONNELASSIGNMENT.PERSONNELASSIGNMENT_REMARK_4089" name="PERSONNELASSIGNMENT_REMARK" value="'+PERSONNELASSIGNMENT_REMARK+'"  type="hidden" >'+
  '	<input id="PERSONNELASSIGNMENT.PERSONNELASSIGNMENT_DEPARTMENT_4089" name="PERSONNELASSIGNMENT_DEPARTMENT" value="'+PERSONNELASSIGNMENT_DEPARTMENT+'"  type="hidden" >'+
  '	<input id="PERSONNELASSIGNMENT.PERSONNELASSIGNMENT_REASON_4089" name="PERSONNELASSIGNMENT_REASON" value="'+PERSONNELASSIGNMENT_REASON+'"  type="hidden" >'+
  '	<input id="PERSONNELASSIGNMENT.PERSONNELASSIGNMENT_DEPARTMENTCONFIRMS_4089" name="PERSONNELASSIGNMENT_DEPARTMENTCONFIRMS" value="'+PERSONNELASSIGNMENT_DEPARTMENTCONFIRMS+'"  type="hidden" >'+
  '	<input id="PERSONNELASSIGNMENT.PERSONNELASSIGNMENT_OTHERSINGLE_4089" name="PERSONNELASSIGNMENT_OTHERSINGLE" value="'+PERSONNELASSIGNMENT_OTHERSINGLE+'"  type="hidden" >'+
  '	<input id="PERSONNELASSIGNMENT.PERSONNELASSIGNMENT_LNCOMPID_4089" name="PERSONNELASSIGNMENT_LNCOMPID" value="'+PERSONNELASSIGNMENT_LNCOMPID+'"  type="hidden" >'+
  '	<input id="PERSONNELASSIGNMENT.PERSONNELASSIGNMENT_FLAG_4089" name="PERSONNELASSIGNMENT_FLAG" value="'+PERSONNELASSIGNMENT_FLAG+'"  type="hidden" >'+
  '	<input id="PERSONNELASSIGNMENT.PERSONNELASSIGNMENT_LNCOMPID2_4089" name="PERSONNELASSIGNMENT_LNCOMPID2" value="'+PERSONNELASSIGNMENT_LNCOMPID2+'"  type="hidden" >'+
  '	<input id="PERSONNELASSIGNMENT.PERSONNELASSIGNMENT_LNJOBID_4089" name="PERSONNELASSIGNMENT_LNJOBID" value="'+PERSONNELASSIGNMENT_LNJOBID+'"  type="hidden" >'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">姓名: </label>'+
  '			<input id="PERSONNELASSIGNMENT.PERSONNELASSIGNMENT_EMPID_4089" title="姓名" styleType="select" name="PERSONNELASSIGNMENT_EMPID" value="'+PERSONNELASSIGNMENT_EMPID_DICTNAME+'" class="form-control " columnId="74371" style="width:200px;float:left;height:25px;padding:0;border:none;background-color:#fff"  emptyText=""  onchange="PERSONNELASSIGNMENT_PERSONNELASSIGNMENT_EMPID_valueChange_4089(this)" required="true"  dataField1 = "sql"  readonly  style="border:none;width:200px; " textField="text" valueField="id" DictName="sql159" dataField="data_form_74371"initParam = "_"/>'+
	'			<input id="PERSONNELASSIGNMENT.PERSONNELASSIGNMENT_EMPID_4089_value" name="PERSONNELASSIGNMENT_EMPID" type="hidden" value="'+PERSONNELASSIGNMENT_EMPID+'"/>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">类型: </label>'+
  '			<input id="PERSONNELASSIGNMENT.PERSONNELASSIGNMENT_XTYPE_4089" title="类型" styleType="select" name="PERSONNELASSIGNMENT_XTYPE" value="'+PERSONNELASSIGNMENT_XTYPE_DICTNAME+'" class="form-control " columnId="74383" style="width:200px;float:left;height:25px;padding:0;border:none;background-color:#fff"  emptyText=""  required="true"  dataField1 = "dict"  readonly  style="border:none;width:200px; " showNullItem="true" textField="dictName" valueField="dictId" DictName="XM_XTYPE" nullItemText="" dataField="dicts_form_74383"initParam = "_"/>'+
	'			<input id="PERSONNELASSIGNMENT.PERSONNELASSIGNMENT_XTYPE_4089_value" name="PERSONNELASSIGNMENT_XTYPE" type="hidden" value="'+PERSONNELASSIGNMENT_XTYPE+'"/>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">现属支行/部门: </label>'+
  '			<input id="PERSONNELASSIGNMENT.PERSONNELASSIGNMENT_XDEPID_4089" title="现属支行/部门" styleType="select" name="PERSONNELASSIGNMENT_XDEPID" value="'+PERSONNELASSIGNMENT_XDEPID_DICTNAME+'" class="form-control " columnId="74386" style="width:200px;float:left;height:25px;padding:0;border:none;background-color:#fff"  emptyText=""  dataField1 = "sql"  readonly  style="border:none;width:200px; " showNullItem="true" textField="text" valueField="id" DictName="sql9" nullItemText="" dataField="data_form_74386"initParam = "_"/>'+
	'			<input id="PERSONNELASSIGNMENT.PERSONNELASSIGNMENT_XDEPID_4089_value" name="PERSONNELASSIGNMENT_XDEPID" type="hidden" value="'+PERSONNELASSIGNMENT_XDEPID+'"/>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">现岗位: </label>'+
  '			<input id="PERSONNELASSIGNMENT.PERSONNELASSIGNMENT_JOBID_4089" title="现岗位" styleType="select" name="PERSONNELASSIGNMENT_JOBID" value="'+PERSONNELASSIGNMENT_JOBID_DICTNAME+'" class="form-control " columnId="74387" style="width:200px;float:left;height:25px;padding:0;border:none;background-color:#fff"  emptyText=""  dataField1 = "sql"  readonly  style="border:none;width:200px; " showNullItem="true" textField="text" valueField="id" DictName="jobidSql1" nullItemText="" dataField="data_form_74387"initParam = "_"/>'+
	'			<input id="PERSONNELASSIGNMENT.PERSONNELASSIGNMENT_JOBID_4089_value" name="PERSONNELASSIGNMENT_JOBID" type="hidden" value="'+PERSONNELASSIGNMENT_JOBID+'"/>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">调配部门: </label>'+
  '			<input id="PERSONNELASSIGNMENT.PERSONNELASSIGNMENT_NDEPID_4089" title="调配部门" styleType="select" name="PERSONNELASSIGNMENT_NDEPID" value="'+PERSONNELASSIGNMENT_NDEPID_DICTNAME+'" class="form-control " columnId="74372" style="width:200px;float:left;height:25px;padding:0;border:none;background-color:#fff"  emptyText=""  onchange="PERSONNELASSIGNMENT_PERSONNELASSIGNMENT_NDEPID_valueChange_4089(this)" required="true"  dataField1 = "sql"  readonly  style="border:none;width:200px; " textField="text" valueField="id" DictName="sql9" dataField="data_form_74372"initParam = "_"/>'+
	'			<input id="PERSONNELASSIGNMENT.PERSONNELASSIGNMENT_NDEPID_4089_value" name="PERSONNELASSIGNMENT_NDEPID" type="hidden" value="'+PERSONNELASSIGNMENT_NDEPID+'"/>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">调配岗位: </label>'+
  '			<input id="PERSONNELASSIGNMENT.PERSONNELASSIGNMENT_NJOBID_4089" title="调配岗位" styleType="select" name="PERSONNELASSIGNMENT_NJOBID" value="'+PERSONNELASSIGNMENT_NJOBID_DICTNAME+'" class="form-control " columnId="74390" style="width:200px;float:left;height:25px;padding:0;border:none;background-color:#fff"  emptyText=""  dataField1 = "sql"  readonly  style="border:none;width:200px; " textField="text" valueField="id" DictName="sql35" dataField="data_form_74390"initParam = "_"/>'+
	'			<input id="PERSONNELASSIGNMENT.PERSONNELASSIGNMENT_NJOBID_4089_value" name="PERSONNELASSIGNMENT_NJOBID" type="hidden" value="'+PERSONNELASSIGNMENT_NJOBID+'"/>'+
  '		</div>'+
  '	</div>'+
							'		</form>'+
							'	</div>'+
							'</div>';
	}
		 }
	$("#"+e).find("[id='TEST_FEE_INFO_FORM2']").html(cellObj);
}
	 if(e=='fubiao2'){
		 var cellObj = '';
		 if(arr.length>0){
		 for (var i = arr.length - 1; i >= 0; i--) {
var LCREMARK_ID = '';
if(arr.length>0&&arr[i].LCREMARK_ID!=null){
LCREMARK_ID = arr[i].LCREMARK_ID;
}
var LCREMARK_REMARK = '';
if(arr.length>0&&arr[i].LCREMARK_REMARK!=null){
LCREMARK_REMARK = arr[i].LCREMARK_REMARK;
}
			cellObj += 		'<div class="col-md-12 col-sm-12 col-lg-12" name="fubiaoElement" >'+
							'    <div class="contact-box" style="min-height:110px">'+
							'		<form class="row cell" style="padding-right:50px">'+
							'		<span class="fa fa-trash-o deleteButton" id="deleteButton_'+i+'" title="删除" style="position: absolute;right: 30px;font-size: 25px;top: 5px;" onclick="deleteElement(this,\'4373\')"></span>'+
							'		<span class="fa fa-save saveButton" id="saveButton_'+i+'" title="保存" style="position: absolute;right: 29px;font-size: 25px;top: 40px;" onclick="saveElement(this,\'4373\')"></span>'+
							'		<span class="fa fa-edit updateButton" id="updateButton_'+i+'" title="修改" style="position: absolute;right: 25px;font-size: 25px;top: 77px;" onclick="updateElement(this,\''+i+'\',\''+e+'\')"></span>'+
  '	<input id="LC_REMARK.LCREMARK_ID_4373" name="LCREMARK_ID" value="'+LCREMARK_ID+'"  type="hidden" >'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;line-height:25px">备注: </label>'+
  '			<input id="LC_REMARK.LCREMARK_REMARK_4373_'+i+'" name="LCREMARK_REMARK" dataType="text" class="CCReadText"  value="'+LCREMARK_REMARK+'" type="text" readonly oninput="myFunction(this,\'LCREMARK_REMARK\')"   style="width:200px;height:25px;padding:0;border:none;background-color:#fff"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
							'		</form>'+
							'	</div>'+
							'</div>';
	}
		 }
	$("#"+e).find("[id='TEST_FEE_INFO_FORM2']").html(cellObj);
}
	}
	 function showAccount(arr,e){
	 if(e=='fubiao1'){
		 var cellObj = '';
			cellObj += 		'<div class="col-md-12 col-sm-12 col-lg-12">'+
							'    <div class="contact-box">'+
							'		<div class="row cell">'+
							'		</div>'+
							'	</div>'+
							'</div>';
	$("#"+e).find("[id='TEST_FEE_INFO_FORM']").html(cellObj);
}
	 if(e=='fubiao2'){
		 var cellObj = '';
			cellObj += 		'<div class="col-md-12 col-sm-12 col-lg-12">'+
							'    <div class="contact-box">'+
							'		<div class="row cell">'+
							'		</div>'+
							'	</div>'+
							'</div>';
	$("#"+e).find("[id='TEST_FEE_INFO_FORM']").html(cellObj);
}
	}
	 function updateElement(e,num,x){
console.time('updateElementJs');
		if(x=='fubiao1'){
		//修改操作行样式
		$("#"+x).find("[id='"+e.id+"']").css("color","red");
		$("#"+x).find("[id='"+e.id+"']").attr("onclick","");
		$("#"+x).find("[id='"+e.id+"']").parent().parent().css("border-color","red");
		$("#"+x).find("[id='"+e.id+"']").parent().parent().addClass("CCUpdating");
		$("#"+x).find("[id='"+e.id+"']").parent().attr("class","row cell editing");
		var xx=$("#"+x).find("[id='"+e.id+"']").parent();//当前操作行,所有下拉日期改变控件样式
		var obj1 ;
var empid_value = xx.find("[name='PERSONNELASSIGNMENT_EMPID']").eq(1).val();
var xtype_value = xx.find("[name='PERSONNELASSIGNMENT_XTYPE']").eq(1).val();
var xdepid_value = xx.find("[name='PERSONNELASSIGNMENT_XDEPID']").eq(1).val();
var jobid_value = xx.find("[name='PERSONNELASSIGNMENT_JOBID']").eq(1).val();
var ndepid_value = xx.find("[name='PERSONNELASSIGNMENT_NDEPID']").eq(1).val();
var njobid_value = xx.find("[name='PERSONNELASSIGNMENT_NJOBID']").eq(1).val();
  var PERSONNELASSIGNMENT_EMPID_cellObj = '			<select id="PERSONNELASSIGNMENT.PERSONNELASSIGNMENT_EMPID_4089_'+num+'_select" title="姓名"  styleType="select" name="PERSONNELASSIGNMENT_EMPID" style="width:200px;float:left;height:25px;padding:0;border:none;background-color:#fff" columnId="74371" class="form-control selectpicker bla bla bli" data-live-search="true" styleType2="search" dataField1 = "sql"  emptyText=""  onchange="PERSONNELASSIGNMENT_PERSONNELASSIGNMENT_EMPID_valueChange_4089(this)" required="true"  style="float:left;width:200px;" textField="text" valueField="id" DictName="sql159" dataField="data_form_74371"initParam = "_"></select>';
	xx.find("[name='PERSONNELASSIGNMENT_EMPID']").eq(1).after(PERSONNELASSIGNMENT_EMPID_cellObj);
	xx.find("[name='PERSONNELASSIGNMENT_EMPID']").eq(0).remove();
	xx.find("[name='PERSONNELASSIGNMENT_EMPID']").eq(0).remove();
  var PERSONNELASSIGNMENT_XTYPE_cellObj = '			<select id="PERSONNELASSIGNMENT.PERSONNELASSIGNMENT_XTYPE_4089_'+num+'_select" title="类型"  styleType="select" name="PERSONNELASSIGNMENT_XTYPE" style="width:200px;float:left;height:25px;padding:0;border:none;background-color:#fff" columnId="74383" class="form-control " dataField1 = "dict"  emptyText=""  required="true"  style="float:left;width:200px;" showNullItem="true" textField="dictName" valueField="dictId" DictName="XM_XTYPE" nullItemText="" dataField="dicts_form_74383"initParam = "_"></select>';
	xx.find("[name='PERSONNELASSIGNMENT_XTYPE']").eq(1).after(PERSONNELASSIGNMENT_XTYPE_cellObj);
	xx.find("[name='PERSONNELASSIGNMENT_XTYPE']").eq(0).remove();
	xx.find("[name='PERSONNELASSIGNMENT_XTYPE']").eq(0).remove();
  var PERSONNELASSIGNMENT_XDEPID_cellObj = '			<select id="PERSONNELASSIGNMENT.PERSONNELASSIGNMENT_XDEPID_4089_'+num+'_select" title="现属支行/部门"  styleType="select" name="PERSONNELASSIGNMENT_XDEPID" style="width:200px;float:left;height:25px;padding:0;border:none;background-color:#fff" columnId="74386" class="form-control " dataField1 = "sql"  emptyText=""  style="float:left;width:200px;" showNullItem="true" textField="text" valueField="id" DictName="sql9" nullItemText="" dataField="data_form_74386"initParam = "_"></select>';
	xx.find("[name='PERSONNELASSIGNMENT_XDEPID']").eq(1).after(PERSONNELASSIGNMENT_XDEPID_cellObj);
	xx.find("[name='PERSONNELASSIGNMENT_XDEPID']").eq(0).remove();
	xx.find("[name='PERSONNELASSIGNMENT_XDEPID']").eq(0).remove();
  var PERSONNELASSIGNMENT_JOBID_cellObj = '			<select id="PERSONNELASSIGNMENT.PERSONNELASSIGNMENT_JOBID_4089_'+num+'_select" title="现岗位"  styleType="select" name="PERSONNELASSIGNMENT_JOBID" style="width:200px;float:left;height:25px;padding:0;border:none;background-color:#fff" columnId="74387" class="form-control " dataField1 = "sql"  emptyText=""  style="float:left;width:200px;" showNullItem="true" textField="text" valueField="id" DictName="jobidSql1" nullItemText="" dataField="data_form_74387"initParam = "_"></select>';
	xx.find("[name='PERSONNELASSIGNMENT_JOBID']").eq(1).after(PERSONNELASSIGNMENT_JOBID_cellObj);
	xx.find("[name='PERSONNELASSIGNMENT_JOBID']").eq(0).remove();
	xx.find("[name='PERSONNELASSIGNMENT_JOBID']").eq(0).remove();
  var PERSONNELASSIGNMENT_NDEPID_cellObj = '			<select id="PERSONNELASSIGNMENT.PERSONNELASSIGNMENT_NDEPID_4089_'+num+'_select" title="调配部门"  styleType="select" name="PERSONNELASSIGNMENT_NDEPID" style="width:200px;float:left;height:25px;padding:0;border:none;background-color:#fff" columnId="74372" class="form-control selectpicker bla bla bli" data-live-search="true" styleType2="search" dataField1 = "sql"  emptyText=""  onchange="PERSONNELASSIGNMENT_PERSONNELASSIGNMENT_NDEPID_valueChange_4089(this)" required="true"  style="float:left;width:200px;" textField="text" valueField="id" DictName="sql9" dataField="data_form_74372"initParam = "_"></select>';
	xx.find("[name='PERSONNELASSIGNMENT_NDEPID']").eq(1).after(PERSONNELASSIGNMENT_NDEPID_cellObj);
	xx.find("[name='PERSONNELASSIGNMENT_NDEPID']").eq(0).remove();
	xx.find("[name='PERSONNELASSIGNMENT_NDEPID']").eq(0).remove();
  var PERSONNELASSIGNMENT_NJOBID_cellObj = '			<select id="PERSONNELASSIGNMENT.PERSONNELASSIGNMENT_NJOBID_4089_'+num+'_select" title="调配岗位"  styleType="select" name="PERSONNELASSIGNMENT_NJOBID" style="width:200px;float:left;height:25px;padding:0;border:none;background-color:#fff" columnId="74390" class="form-control selectpicker bla bla bli" data-live-search="true" styleType2="search" dataField1 = "sql"  emptyText=""  style="float:left;width:200px;" textField="text" valueField="id" DictName="sql35" dataField="data_form_74390"initParam = "_"></select>';
	xx.find("[name='PERSONNELASSIGNMENT_NJOBID']").eq(1).after(PERSONNELASSIGNMENT_NJOBID_cellObj);
	xx.find("[name='PERSONNELASSIGNMENT_NJOBID']").eq(0).remove();
	xx.find("[name='PERSONNELASSIGNMENT_NJOBID']").eq(0).remove();
		var pid = xx.attr("id");
		elementsListSelectInitFunction(e);
		cardAndCardDateWidInitFunction(e);
$("#"+x).find("[id='PERSONNELASSIGNMENT.PERSONNELASSIGNMENT_EMPID_4089_"+num+"_select']").selectpicker('val', empid_value);
$("#"+x).find("[id='PERSONNELASSIGNMENT.PERSONNELASSIGNMENT_XTYPE_4089_"+num+"_select']").val(xtype_value);
$("#"+x).find("[id='PERSONNELASSIGNMENT.PERSONNELASSIGNMENT_XDEPID_4089_"+num+"_select']").val(xdepid_value);
$("#"+x).find("[id='PERSONNELASSIGNMENT.PERSONNELASSIGNMENT_JOBID_4089_"+num+"_select']").val(jobid_value);
$("#"+x).find("[id='PERSONNELASSIGNMENT.PERSONNELASSIGNMENT_NDEPID_4089_"+num+"_select']").selectpicker('val', ndepid_value);
$("#"+x).find("[id='PERSONNELASSIGNMENT.PERSONNELASSIGNMENT_NJOBID_4089_"+num+"_select']").selectpicker('val', njobid_value);
}
		if(x=='fubiao2'){
		//修改操作行样式
		$("#"+x).find("[id='"+e.id+"']").css("color","red");
		$("#"+x).find("[id='"+e.id+"']").attr("onclick","");
		$("#"+x).find("[id='"+e.id+"']").parent().parent().css("border-color","red");
		$("#"+x).find("[id='"+e.id+"']").parent().parent().addClass("CCUpdating");
		$("#"+x).find("[id='"+e.id+"']").parent().attr("class","row cell editing");
		var xx=$("#"+x).find("[id='"+e.id+"']").parent();//当前操作行,所有下拉日期改变控件样式
		var obj1 ;
xx.find("[id='LC_REMARK.LCREMARK_REMARK_4373_"+num+"']").attr("readonly",false);
xx.find("[id='LC_REMARK.LCREMARK_REMARK_4373_"+num+"']").css("display","inline");
xx.find("[id='LC_REMARK.LCREMARK_REMARK_4373_"+num+"']").attr("class","form-control");
		var pid = xx.attr("id");
		elementsListSelectInitFunction(e);
		cardAndCardDateWidInitFunction(e);
}
changeCssForApp3();
console.timeEnd('updateElementJs');
	}
function youxiaoFunction(e){
	if(e=='fubiao1'){
		Currentpage11=0;
		zuixin1=null;
		youxiao1='Y';
	}
	if(e=='fubiao2'){
		Currentpage12=0;
		zuixin2=null;
		youxiao2='Y';
	}
	loadDataStart2(e);
}
function zuixinFunction(e){
	if(e=='fubiao1'){
		Currentpage11=0;
		youxiao1=null;
		zuixin1='Y';
	}
	if(e=='fubiao2'){
		Currentpage12=0;
		youxiao2=null;
		zuixin2='Y';
	}
	loadDataStart2(e);
}
function allFunction(e){
	if(e=='fubiao1'){
		Currentpage11=0;
		youxiao1=null;
		zuixin1=null;
	}
	if(e=='fubiao2'){
		Currentpage12=0;
		youxiao2=null;
		zuixin2=null;
	}
	loadDataStart2(e);
}
function next(e){
	if(e=='fubiao1'){
		Currentpage11--;
		loadDataStart2(e);
	}
	if(e=='fubiao2'){
		Currentpage12--;
		loadDataStart2(e);
	}
	loadDataStart2(e);
}
function last(e){
	if(e=='fubiao1'){
		Currentpage11--;
		loadDataStart2(e);
	}
	if(e=='fubiao2'){
		Currentpage12--;
		loadDataStart2(e);
	}
	loadDataStart2(e);
}
	 function loadDataStart2(e){
	 if(e=='fubiao1'){
		 $.ajax({
			url: "/myehr/form/cardformInitData.action",
			type: 'post',
			data:grid_LC_Branchffing_fun(xx),//HTTP请求类型
			contentType: 'application/json;charset=utf-8',
			cache: false,
			async: false,
			success: function (data) {
				Currentpage01++;
				var arr=data.rows;
				showDate_3863(arr,data.total,e);
			  }
		});
	 }
	 if(e=='fubiao2'){
		 $.ajax({
			url: "/myehr/form/cardformInitData.action",
			type: 'post',
			data:grid_LC_REMARK_fun(xx),//HTTP请求类型
			contentType: 'application/json;charset=utf-8',
			cache: false,
			async: false,
			success: function (data) {
				Currentpage02++;
				var arr=data.rows;
				showDate_3863(arr,data.total,e);
			  }
		});
	 }
	}
	 function loadDataStart3(e){
	 if(e=='fubiao1'){
		 $.ajax({
			url: "/myehr/form/cardformInitData.action",
			type: 'post',
			data:grid_LC_Branchffing_funx(xx),//HTTP请求类型
			contentType: 'application/json;charset=utf-8',
			cache: false,
			async: false,
			success: function (data) {
				Currentpage01++;
				var arr=data.rows;
				showDate_3864(arr,data.total,e);
			  }
		});
	 }
	 if(e=='fubiao2'){
		 $.ajax({
			url: "/myehr/form/cardformInitData.action",
			type: 'post',
			data:grid_LC_REMARK_funx(xx),//HTTP请求类型
			contentType: 'application/json;charset=utf-8',
			cache: false,
			async: false,
			success: function (data) {
				Currentpage02++;
				var arr=data.rows;
				showDate_3864(arr,data.total,e);
			  }
		});
	 }
	}
	 function loadDataStart4(e){
	 if(e=='fubiao1'){
		 $.ajax({
			url: "/myehr/form/cardformInitData.action",
			type: 'post',
			data:grid_LC_Branchffing_funx(xx),//HTTP请求类型
			contentType: 'application/json;charset=utf-8',
			cache: false,
			async: false,
			success: function (data) {
				Currentpage01++;
				var arr=data.rows;
				showAccount(arr,e);
			  }
		});
	 }
	 if(e=='fubiao2'){
		 $.ajax({
			url: "/myehr/form/cardformInitData.action",
			type: 'post',
			data:grid_LC_REMARK_funx(xx),//HTTP请求类型
			contentType: 'application/json;charset=utf-8',
			cache: false,
			async: false,
			success: function (data) {
				Currentpage02++;
				var arr=data.rows;
				showAccount(arr,e);
			  }
		});
	 }
	}
function grid_LC_Branchffing_fun(pageReqeust){
	var _filterdata={};
	var paramsMap = {};
	var requestParam={};
requestParam = {BUSINESSID:BUSINESSID_urlParam};
	pageReqeust.containerParam=containerParam_4089;
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.userIds=param_empIds;
	pageReqeust.formId=_formId_4089;
	pageReqeust.isView=null;
	pageReqeust.offset=Currentpage11*pagesize11;;
	pageReqeust.limit=pagesize11;;
	if(heightGadedata_4089!=null&&heightGadedata_4089!=undefined){
		pageReqeust.heightGrade = heightGadedata_4089;
	}
	queryParams = JSON.stringify(pageReqeust);
	return queryParams;
}
function grid_LC_Branchffing_funx(pageReqeust){
	var _filterdata={};
	var paramsMap = {};
	var requestParam={};
requestParam = {BUSINESSID:BUSINESSID_urlParam};
	pageReqeust.containerParam=containerParam_4089;
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.userIds=param_empIds;
	pageReqeust.formId=_formId_4089;
	pageReqeust.isView=null;
	pageReqeust.offset=Currentpage21*pagesize21;;
	pageReqeust.limit=pagesize21;;
	if(heightGadedata_4089!=null&&heightGadedata_4089!=undefined){
		pageReqeust.heightGrade = heightGadedata_4089;
	}
	queryParams = JSON.stringify(pageReqeust);
	return queryParams;
}
function grid_LC_REMARK_fun(pageReqeust){
	var _filterdata={};
	var paramsMap = {};
	var requestParam={};
		requestParam = {};
	pageReqeust.containerParam=containerParam_4373;
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.userIds=param_empIds;
	pageReqeust.formId=_formId_4373;
	pageReqeust.isView=null;
	pageReqeust.offset=Currentpage12*pagesize12;;
	pageReqeust.limit=pagesize12;;
	if(heightGadedata_4373!=null&&heightGadedata_4373!=undefined){
		pageReqeust.heightGrade = heightGadedata_4373;
	}
	queryParams = JSON.stringify(pageReqeust);
	return queryParams;
}
function grid_LC_REMARK_funx(pageReqeust){
	var _filterdata={};
	var paramsMap = {};
	var requestParam={};
		requestParam = {};
	pageReqeust.containerParam=containerParam_4373;
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.userIds=param_empIds;
	pageReqeust.formId=_formId_4373;
	pageReqeust.isView=null;
	pageReqeust.offset=Currentpage22*pagesize22;;
	pageReqeust.limit=pagesize22;;
	if(heightGadedata_4373!=null&&heightGadedata_4373!=undefined){
		pageReqeust.heightGrade = heightGadedata_4373;
	}
	queryParams = JSON.stringify(pageReqeust);
	return queryParams;
}
	 function initAddValue(e,num){
	 if(e=='fubiao1'){
	 	num--;
		var obj = $("#newElement"+num);
		var value = BUSINESSID_urlparam;
var obj0 = obj.find("[name='PERSONNELASSIGNMENT_businessId']");
var id = obj0.attr("id");
if(obj0.attr("styleType")=="dateTime"){
		if(value.indexOf(":") > -1){
			if(value.indexOf("-") > -1){
			 	obj0.val(formatDatebox(value,id));
			}else{
				obj0.val(value);
			}
		}else{
			if(value==null || value==""|| value=="null"){
				obj0.val(value);
			}else{
			    var date = new Date(parseInt(value)).Format("yyyy-MM-dd hh:mm:ss");
				obj0.val(formatDatebox(date,id));
			}
		}
}else if(obj0.attr("styleType2")=="search"){
		obj0.selectpicker('val', value);
}else{
    if(obj0.attr("styleType")=="inputSelect"){
        var dataField = obj0.attr("dataField1");
        var DictName = obj0.attr("DictName");
        selectSqlDictEntryByValue(id,value,dataField,DictName);
    }else{
		   obj0.val(value);
    }
}
;
	 }
	 if(e=='fubiao2'){
	 	num--;
		var obj = $("#newElement"+num);
	 }
	}
	function PERSONNELASSIGNMENT_PERSONNELASSIGNMENT_EMPID_valueChange_4089(e){

		var empid = $(e).val();
var sql1="select depid  from  emp_employee   where  empid="+empid;
var sql2="select jobid from  emp_employee   where  empid="+empid;
if(empid!=null&&empid!=""){
	var i=myehr_SQLFORBID_sql(sql1);
	var j=myehr_SQLFORBID_sql(sql2);
	if(i!=null){
			$(e).parent().parent().parent().parent().find('[name="PERSONNELASSIGNMENT_xdepid"]').val(i[0].depid);
			}else{
			$(e).parent().parent().parent().parent().find('[name="PERSONNELASSIGNMENT_xdepid"]').val(i[0].depid);
			}
	if(j!=null){
			$(e).parent().parent().parent().parent().find('[name="PERSONNELASSIGNMENT_jobid"]').val(j[0].jobid);
			}else{
			$(e).parent().parent().parent().parent().find('[name="PERSONNELASSIGNMENT_jobid"]').val("");
			}
}
	}
	function PERSONNELASSIGNMENT_PERSONNELASSIGNMENT_NDEPID_valueChange_4089(e){

		var fatherObj = $(e).parent().parent().parent().parent();
var ndepid = fatherObj.find('[name="PERSONNELASSIGNMENT_ndepid"]').val();
if(ndepid!=null&&ndepid!=""){
	var sql = "select jobid  as DICTVALUE,cnname as DICTENTRY from ORG_JOB WHERE depid=" +ndepid;

	var id = fatherObj.find('[name="PERSONNELASSIGNMENT_njobid"]').attr("id");

	//加载子下拉之前,清空子下拉
	$('[id="'+id+'"]').html("");
	myehr_initSelect_sql(id,sql);
}
	}
