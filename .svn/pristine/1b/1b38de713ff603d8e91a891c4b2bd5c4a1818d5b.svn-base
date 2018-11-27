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
function approved_save_6064(){
	var paramsMap = {};
	var _param = {};
	var hzsParam = [];
	_param.formId=formId_main;
	_param = cardGetdata_main('#submitButton_main',formId_main);
	_param.buttonId='6064';
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
function approved_refer_6064(buttonType){
	if(checkedPointRequire()){
		if(buttonType=='通过'){
			if(!approved_save_6064()){
				content = "<textarea id='approveRemark' rows='7' cols='63' ></textarea>";
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
			if(!approved_save_6064()){
				getHisTask();
				var datas = hisTask;
				content = "<div style='margin-bottom:10px'>驳回方式<select id='rejectType' >";
				content+= "<option value ='previousNode'>驳回到上节点</option>";
				content+= "<option value ='startUser'>驳回到申请人</option>";
				content+= "</select></div>";
				content += "<div style='margin-bottom:10px'>驳回节点<select id='rejectNode' >";
				for(var i=0;i<datas.length;i++){
					content+="<option value ='"+datas[i].taskId+"'>"+datas[i].ACTNAME+"</option>";
				}
				content+="</select></div>";
				content += "<textarea id='approveRemark' rows='7' cols='63' ></textarea>";
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
			area: ['500px', '300px'],
			btn: ['确定', '取消'],
			yes:function(index, layero){
				var approveRemark=document.getElementById("approveRemark").value;
				var rejectType;
				if(buttonType=='驳回'){
					rejectType=document.getElementById("rejectType").value;
				}
				layer.close(index);
				approved_refer2_6064(buttonType,approveRemark,rejectType);
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
function approved_refer2_6064(buttonType,approveRemark,rejectType){
    var flowAction = param_flowAction;
    if(flowAction=='start'){
	    var paramsMap = {};
	    var _param = {};
	    _param.formId=formId_main;
	    _param =  cardGetdata_main_act('#submitButton_main',formId_main);
	    _param.buttonId='6064';
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
				     alert("操作异常");
			     }else {
				     alert("操作失败");
			     }
		     }
	     });
    }else{
	     var paramsMap = {};
	     var _param = {};
	     _param.formId=formId_main;
	     _param =  cardGetdata_main('#submitButton_main',formId_main);
	     _param.buttonId='6064';
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
			     }else if(text[0]=='error'){
				     alert("操作异常");
			     }else {
				     alert("操作成功");
				     closex_2504();
			     }
		     }
	     });
    }
}
function approved_save_6065(){
	var paramsMap = {};
	var _param = {};
	var hzsParam = [];
	_param.formId=formId_main;
	_param = cardGetdata_main('#submitButton_main',formId_main);
	_param.buttonId='6065';
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
function approved_refer_6065(buttonType){
	if(checkedPointRequire()){
		if(buttonType=='通过'){
			if(!approved_save_6065()){
				content = "<textarea id='approveRemark' rows='7' cols='63' ></textarea>";
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
			if(!approved_save_6065()){
				getHisTask();
				var datas = hisTask;
				content = "<div style='margin-bottom:10px'>驳回方式<select id='rejectType' >";
				content+= "<option value ='previousNode'>驳回到上节点</option>";
				content+= "<option value ='startUser'>驳回到申请人</option>";
				content+= "</select></div>";
				content += "<div style='margin-bottom:10px'>驳回节点<select id='rejectNode' >";
				for(var i=0;i<datas.length;i++){
					content+="<option value ='"+datas[i].taskId+"'>"+datas[i].ACTNAME+"</option>";
				}
				content+="</select></div>";
				content += "<textarea id='approveRemark' rows='7' cols='63' ></textarea>";
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
			area: ['500px', '300px'],
			btn: ['确定', '取消'],
			yes:function(index, layero){
				var approveRemark=document.getElementById("approveRemark").value;
				var rejectType;
				if(buttonType=='驳回'){
					rejectType=document.getElementById("rejectType").value;
				}
				layer.close(index);
				approved_refer2_6065(buttonType,approveRemark,rejectType);
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
function approved_refer2_6065(buttonType,approveRemark,rejectType){
    var flowAction = param_flowAction;
    if(flowAction=='start'){
	    var paramsMap = {};
	    var _param = {};
	    _param.formId=formId_main;
	    _param =  cardGetdata_main_act('#submitButton_main',formId_main);
	    _param.buttonId='6065';
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
				     alert("操作异常");
			     }else {
				     alert("操作失败");
			     }
		     }
	     });
    }else{
	     var paramsMap = {};
	     var _param = {};
	     _param.formId=formId_main;
	     _param =  cardGetdata_main('#submitButton_main',formId_main);
	     _param.buttonId='6065';
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
			     }else if(text[0]=='error'){
				     alert("操作异常");
			     }else {
				     alert("操作成功");
				     closex_2504();
			     }
		     }
	     });
    }
}
function submitButton_save_6066(){
	var paramsMap = {};
	var _param = {};
	var hzsParam = [];
	_param.formId=formId_main;
	_param = cardGetdata_main('#submitButton_main',formId_main);
	_param.buttonId='6066';
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
submitButton_refer_6066();
	}
}
function submitButton_refer_6066(){
			var paramsMap = {};
			var _param = {};
			paramsMap.bussinessId = BUSSINESSID_ACT;
			_param.formId=formId_main;
			_param = cardGetdata_main_act('#submitButton_main',formId_main);
			_param.buttonId='6066';
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
						alert("操作异常");
					}else {
						alert("操作失败");
					}
				}
			});
		}
function temporaryStorage_save_6067(){
	var paramsMap = {};
	var _param = {};
	var hzsParam = [];
	_param.formId=formId_main;
	_param = cardGetdata_main('#submitButton_main',formId_main);
	_param.buttonId='6067';
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
	function LC_LEAVE_LCLEAVE_TLTIE_valueChange_4384(e){

		alert(xxxx)
	}
	 function addFunction(e){
	 if(e=='fubiao1'){
		 var cellObj = '';
		 cellObj +=	'<div name="fubiaoElement" class="col-md-12 col-sm-12 col-lg-12" id="newElement'+newElementNum+'">'+
					'    <div class="contact-box CCAdd">'+
					'<form class="row cell add_element" style="padding-right:50px">';
		 cellObj += '	<span class="fa fa-trash-o deleteButton" style="position: absolute;right: 30px;font-size: 25px" onclick="removeElement('+newElementNum+')"></span>'+
					'	<span class="fa fa-save saveButton" style="position: absolute;right: 30px;font-size: 25px;top:50px" onclick="saveElement(this,\'4452\')"></span>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">员工ID: </label>'+
  '			<input id="EMP_BG_WORKEXPERIENCE.EMPBGWORKEXPERIENCE_EMPID_4452_add_'+newElementNum+'" name="EMPBGWORKEXPERIENCE_EMPID" dataType="text" type="text" class="form-control" oninput="myFunction(this,\'EMPBGWORKEXPERIENCE_EMPID\')"  vtype="illegalChar;maxLength:10;minLength:null;"   style="width:200px;height:25px;padding:0;border:none;background-color:#fff;display:inline"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">开始时间: </label>'+
  '			<div class="controls input-append date form_date1 input-group" data-date=""  data-link-field="dtp_input2" data-link-format="yyyy-mm-dd" style="float:left;width: 134px;">'+
  '				<input style="width:134px;float:left;height:25px;padding:0;border:none;background-color:#fff"type="text" readonly class="form-control " dateType="controls input-append date form_date1" id="EMP_BG_WORKEXPERIENCE.EMPBGWORKEXPERIENCE_BEGINDATE_4452_add_'+newElementNum+'" styleType="dateTime"   style="width:134px;float:left;border-radius: 4px 0 0 4px;" name="EMPBGWORKEXPERIENCE_BEGINDATE"  format="yyyy-MM-dd" valueformat="yyyy-MM-dd" />'+
	'				<span class="input-group-addon" name="closeButton" style="padding:1px 10px 2px 10px;font-size:12px"><span class="glyphicon glyphicon-remove"></span></span>'+
  '				<span class="input-group-addon" name="clickButton" style="padding:1px 10px 2px 10px;font-size:12px"><span class="glyphicon glyphicon-th"></span></span>'+
  '			</div>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">结束时间: </label>'+
  '			<div class="controls input-append date form_date1 input-group" data-date=""  data-link-field="dtp_input2" data-link-format="yyyy-mm-dd" style="float:left;width: 134px;">'+
  '				<input style="width:134px;float:left;height:25px;padding:0;border:none;background-color:#fff"type="text" readonly class="form-control " dateType="controls input-append date form_date1" id="EMP_BG_WORKEXPERIENCE.EMPBGWORKEXPERIENCE_ENDDATE_4452_add_'+newElementNum+'" styleType="dateTime"   style="width:134px;float:left;border-radius: 4px 0 0 4px;" name="EMPBGWORKEXPERIENCE_ENDDATE"  format="yyyy-MM-dd" valueformat="yyyy-MM-dd" />'+
	'				<span class="input-group-addon" name="closeButton" style="padding:1px 10px 2px 10px;font-size:12px"><span class="glyphicon glyphicon-remove"></span></span>'+
  '				<span class="input-group-addon" name="clickButton" style="padding:1px 10px 2px 10px;font-size:12px"><span class="glyphicon glyphicon-th"></span></span>'+
  '			</div>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">工作单位: </label>'+
  '			<input id="EMP_BG_WORKEXPERIENCE.EMPBGWORKEXPERIENCE_WORKUNIT_4452_add_'+newElementNum+'" name="EMPBGWORKEXPERIENCE_WORKUNIT" dataType="text" type="text" class="form-control" oninput="myFunction(this,\'EMPBGWORKEXPERIENCE_WORKUNIT\')"  vtype="illegalChar;maxLength:200;minLength:null;"   style="width:200px;height:25px;padding:0;border:none;background-color:#fff;display:inline"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">职位: </label>'+
  '			<input id="EMP_BG_WORKEXPERIENCE.EMPBGWORKEXPERIENCE_POSITION_4452_add_'+newElementNum+'" name="EMPBGWORKEXPERIENCE_POSITION" dataType="text" type="text" class="form-control" oninput="myFunction(this,\'EMPBGWORKEXPERIENCE_POSITION\')"  vtype="illegalChar;maxLength:200;minLength:null;"   style="width:200px;height:25px;padding:0;border:none;background-color:#fff;display:inline"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">担任职务: </label>'+
  '			<input id="EMP_BG_WORKEXPERIENCE.EMPBGWORKEXPERIENCE_PROVERPOSITION_4452_add_'+newElementNum+'" name="EMPBGWORKEXPERIENCE_PROVERPOSITION" dataType="text" type="text" class="form-control" oninput="myFunction(this,\'EMPBGWORKEXPERIENCE_PROVERPOSITION\')"  vtype="illegalChar;maxLength:200;minLength:null;"   style="width:200px;height:25px;padding:0;border:none;background-color:#fff;display:inline"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">备注: </label>'+
  '			<input id="EMP_BG_WORKEXPERIENCE.EMPBGWORKEXPERIENCE_REMARK_4452_add_'+newElementNum+'" name="EMPBGWORKEXPERIENCE_REMARK" dataType="text" type="text" class="form-control" oninput="myFunction(this,\'EMPBGWORKEXPERIENCE_REMARK\')"  vtype="illegalChar;maxLength:200;minLength:null;"   style="width:200px;height:25px;padding:0;border:none;background-color:#fff;display:inline"/>'+
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
var EMPBGWORKEXPERIENCE_EMPID = '';
if(arr.length>0&&arr[i].EMPBGWORKEXPERIENCE_EMPID!=null){
EMPBGWORKEXPERIENCE_EMPID = arr[i].EMPBGWORKEXPERIENCE_EMPID;
}
var EMPBGWORKEXPERIENCE_BEGINDATE = '';
if(arr.length>0&&arr[i].EMPBGWORKEXPERIENCE_BEGINDATE!=null){
EMPBGWORKEXPERIENCE_BEGINDATE = arr[i].EMPBGWORKEXPERIENCE_BEGINDATE;
}
if(EMPBGWORKEXPERIENCE_BEGINDATE!=null&&EMPBGWORKEXPERIENCE_BEGINDATE!=''){
EMPBGWORKEXPERIENCE_BEGINDATE = new Date(parseInt(EMPBGWORKEXPERIENCE_BEGINDATE)).Format("yyyy-MM-dd");
}else{EMPBGWORKEXPERIENCE_BEGINDATE=""}
var EMPBGWORKEXPERIENCE_ENDDATE = '';
if(arr.length>0&&arr[i].EMPBGWORKEXPERIENCE_ENDDATE!=null){
EMPBGWORKEXPERIENCE_ENDDATE = arr[i].EMPBGWORKEXPERIENCE_ENDDATE;
}
if(EMPBGWORKEXPERIENCE_ENDDATE!=null&&EMPBGWORKEXPERIENCE_ENDDATE!=''){
EMPBGWORKEXPERIENCE_ENDDATE = new Date(parseInt(EMPBGWORKEXPERIENCE_ENDDATE)).Format("yyyy-MM-dd");
}else{EMPBGWORKEXPERIENCE_ENDDATE=""}
var EMPBGWORKEXPERIENCE_WORKUNIT = '';
if(arr.length>0&&arr[i].EMPBGWORKEXPERIENCE_WORKUNIT!=null){
EMPBGWORKEXPERIENCE_WORKUNIT = arr[i].EMPBGWORKEXPERIENCE_WORKUNIT;
}
var EMPBGWORKEXPERIENCE_POSITION = '';
if(arr.length>0&&arr[i].EMPBGWORKEXPERIENCE_POSITION!=null){
EMPBGWORKEXPERIENCE_POSITION = arr[i].EMPBGWORKEXPERIENCE_POSITION;
}
var EMPBGWORKEXPERIENCE_PROVERPOSITION = '';
if(arr.length>0&&arr[i].EMPBGWORKEXPERIENCE_PROVERPOSITION!=null){
EMPBGWORKEXPERIENCE_PROVERPOSITION = arr[i].EMPBGWORKEXPERIENCE_PROVERPOSITION;
}
var EMPBGWORKEXPERIENCE_REMARK = '';
if(arr.length>0&&arr[i].EMPBGWORKEXPERIENCE_REMARK!=null){
EMPBGWORKEXPERIENCE_REMARK = arr[i].EMPBGWORKEXPERIENCE_REMARK;
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
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;line-height:25px">员工ID: </label>'+
  '			<input id="EMP_BG_WORKEXPERIENCE.EMPBGWORKEXPERIENCE_EMPID_4452_'+i+'" name="EMPBGWORKEXPERIENCE_EMPID" dataType="text" class="CCReadText"  value="'+EMPBGWORKEXPERIENCE_EMPID+'" type="text" readonly oninput="myFunction(this,\'EMPBGWORKEXPERIENCE_EMPID\')"   style="width:200px;height:25px;padding:0;border:none;background-color:#fff"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;line-height:25px">开始时间: </label>'+
  '			<input id="EMP_BG_WORKEXPERIENCE.EMPBGWORKEXPERIENCE_BEGINDATE_4452_'+i+'" name="EMPBGWORKEXPERIENCE_BEGINDATE" dataType="text" class="CCReadText"  value="'+EMPBGWORKEXPERIENCE_BEGINDATE+'" type="text" readonly oninput="myFunction(this,\'EMPBGWORKEXPERIENCE_BEGINDATE\')"   style="width:200px;height:25px;padding:0;border:none;background-color:#fff"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;line-height:25px">结束时间: </label>'+
  '			<input id="EMP_BG_WORKEXPERIENCE.EMPBGWORKEXPERIENCE_ENDDATE_4452_'+i+'" name="EMPBGWORKEXPERIENCE_ENDDATE" dataType="text" class="CCReadText"  value="'+EMPBGWORKEXPERIENCE_ENDDATE+'" type="text" readonly oninput="myFunction(this,\'EMPBGWORKEXPERIENCE_ENDDATE\')"   style="width:200px;height:25px;padding:0;border:none;background-color:#fff"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;line-height:25px">工作单位: </label>'+
  '			<input id="EMP_BG_WORKEXPERIENCE.EMPBGWORKEXPERIENCE_WORKUNIT_4452_'+i+'" name="EMPBGWORKEXPERIENCE_WORKUNIT" dataType="text" class="CCReadText"  value="'+EMPBGWORKEXPERIENCE_WORKUNIT+'" type="text" readonly oninput="myFunction(this,\'EMPBGWORKEXPERIENCE_WORKUNIT\')"   style="width:200px;height:25px;padding:0;border:none;background-color:#fff"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;line-height:25px">职位: </label>'+
  '			<input id="EMP_BG_WORKEXPERIENCE.EMPBGWORKEXPERIENCE_POSITION_4452_'+i+'" name="EMPBGWORKEXPERIENCE_POSITION" dataType="text" class="CCReadText"  value="'+EMPBGWORKEXPERIENCE_POSITION+'" type="text" readonly oninput="myFunction(this,\'EMPBGWORKEXPERIENCE_POSITION\')"   style="width:200px;height:25px;padding:0;border:none;background-color:#fff"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;line-height:25px">担任职务: </label>'+
  '			<input id="EMP_BG_WORKEXPERIENCE.EMPBGWORKEXPERIENCE_PROVERPOSITION_4452_'+i+'" name="EMPBGWORKEXPERIENCE_PROVERPOSITION" dataType="text" class="CCReadText"  value="'+EMPBGWORKEXPERIENCE_PROVERPOSITION+'" type="text" readonly oninput="myFunction(this,\'EMPBGWORKEXPERIENCE_PROVERPOSITION\')"   style="width:200px;height:25px;padding:0;border:none;background-color:#fff"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;line-height:25px">备注: </label>'+
  '			<input id="EMP_BG_WORKEXPERIENCE.EMPBGWORKEXPERIENCE_REMARK_4452_'+i+'" name="EMPBGWORKEXPERIENCE_REMARK" dataType="text" class="CCReadText"  value="'+EMPBGWORKEXPERIENCE_REMARK+'" type="text" readonly oninput="myFunction(this,\'EMPBGWORKEXPERIENCE_REMARK\')"   style="width:200px;height:25px;padding:0;border:none;background-color:#fff"/>'+
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
var EMPBGWORKEXPERIENCE_EMPID = '';
if(arr.length>0&&arr[i].EMPBGWORKEXPERIENCE_EMPID!=null){
EMPBGWORKEXPERIENCE_EMPID = arr[i].EMPBGWORKEXPERIENCE_EMPID;
}
var EMPBGWORKEXPERIENCE_BEGINDATE = '';
if(arr.length>0&&arr[i].EMPBGWORKEXPERIENCE_BEGINDATE!=null){
EMPBGWORKEXPERIENCE_BEGINDATE = arr[i].EMPBGWORKEXPERIENCE_BEGINDATE;
}
if(EMPBGWORKEXPERIENCE_BEGINDATE!=null&&EMPBGWORKEXPERIENCE_BEGINDATE!=''){
EMPBGWORKEXPERIENCE_BEGINDATE = new Date(parseInt(EMPBGWORKEXPERIENCE_BEGINDATE)).Format("yyyy-MM-dd");
}else{EMPBGWORKEXPERIENCE_BEGINDATE=""}
var EMPBGWORKEXPERIENCE_ENDDATE = '';
if(arr.length>0&&arr[i].EMPBGWORKEXPERIENCE_ENDDATE!=null){
EMPBGWORKEXPERIENCE_ENDDATE = arr[i].EMPBGWORKEXPERIENCE_ENDDATE;
}
if(EMPBGWORKEXPERIENCE_ENDDATE!=null&&EMPBGWORKEXPERIENCE_ENDDATE!=''){
EMPBGWORKEXPERIENCE_ENDDATE = new Date(parseInt(EMPBGWORKEXPERIENCE_ENDDATE)).Format("yyyy-MM-dd");
}else{EMPBGWORKEXPERIENCE_ENDDATE=""}
var EMPBGWORKEXPERIENCE_WORKUNIT = '';
if(arr.length>0&&arr[i].EMPBGWORKEXPERIENCE_WORKUNIT!=null){
EMPBGWORKEXPERIENCE_WORKUNIT = arr[i].EMPBGWORKEXPERIENCE_WORKUNIT;
}
var EMPBGWORKEXPERIENCE_POSITION = '';
if(arr.length>0&&arr[i].EMPBGWORKEXPERIENCE_POSITION!=null){
EMPBGWORKEXPERIENCE_POSITION = arr[i].EMPBGWORKEXPERIENCE_POSITION;
}
var EMPBGWORKEXPERIENCE_PROVERPOSITION = '';
if(arr.length>0&&arr[i].EMPBGWORKEXPERIENCE_PROVERPOSITION!=null){
EMPBGWORKEXPERIENCE_PROVERPOSITION = arr[i].EMPBGWORKEXPERIENCE_PROVERPOSITION;
}
var EMPBGWORKEXPERIENCE_REMARK = '';
if(arr.length>0&&arr[i].EMPBGWORKEXPERIENCE_REMARK!=null){
EMPBGWORKEXPERIENCE_REMARK = arr[i].EMPBGWORKEXPERIENCE_REMARK;
}
			cellObj += 		'<div class="col-md-12 col-sm-12 col-lg-12" name="fubiaoElement" >'+
							'    <div class="contact-box" style="min-height:110px">'+
							'		<form class="row cell" style="padding-right:50px">'+
							'		<span class="fa fa-trash-o deleteButton" id="deleteButton_'+i+'" title="删除" style="position: absolute;right: 30px;font-size: 25px;top: 5px;" onclick="deleteElement(this,\'4452\')"></span>'+
							'		<span class="fa fa-save saveButton" id="saveButton_'+i+'" title="保存" style="position: absolute;right: 29px;font-size: 25px;top: 40px;" onclick="saveElement(this,\'4452\')"></span>'+
							'		<span class="fa fa-edit updateButton" id="updateButton_'+i+'" title="修改" style="position: absolute;right: 25px;font-size: 25px;top: 77px;" onclick="updateElement(this,\''+i+'\',\''+e+'\')"></span>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;line-height:25px">员工ID: </label>'+
  '			<input id="EMP_BG_WORKEXPERIENCE.EMPBGWORKEXPERIENCE_EMPID_4452_'+i+'" name="EMPBGWORKEXPERIENCE_EMPID" dataType="text" class="CCReadText"  value="'+EMPBGWORKEXPERIENCE_EMPID+'" type="text" readonly oninput="myFunction(this,\'EMPBGWORKEXPERIENCE_EMPID\')"   style="width:200px;height:25px;padding:0;border:none;background-color:#fff"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;line-height:25px">开始时间: </label>'+
  '			<input id="EMP_BG_WORKEXPERIENCE.EMPBGWORKEXPERIENCE_BEGINDATE_4452_'+i+'" name="EMPBGWORKEXPERIENCE_BEGINDATE" dataType="text" class="CCReadText"  value="'+EMPBGWORKEXPERIENCE_BEGINDATE+'" type="text" readonly oninput="myFunction(this,\'EMPBGWORKEXPERIENCE_BEGINDATE\')"   style="width:200px;height:25px;padding:0;border:none;background-color:#fff"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;line-height:25px">结束时间: </label>'+
  '			<input id="EMP_BG_WORKEXPERIENCE.EMPBGWORKEXPERIENCE_ENDDATE_4452_'+i+'" name="EMPBGWORKEXPERIENCE_ENDDATE" dataType="text" class="CCReadText"  value="'+EMPBGWORKEXPERIENCE_ENDDATE+'" type="text" readonly oninput="myFunction(this,\'EMPBGWORKEXPERIENCE_ENDDATE\')"   style="width:200px;height:25px;padding:0;border:none;background-color:#fff"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;line-height:25px">工作单位: </label>'+
  '			<input id="EMP_BG_WORKEXPERIENCE.EMPBGWORKEXPERIENCE_WORKUNIT_4452_'+i+'" name="EMPBGWORKEXPERIENCE_WORKUNIT" dataType="text" class="CCReadText"  value="'+EMPBGWORKEXPERIENCE_WORKUNIT+'" type="text" readonly oninput="myFunction(this,\'EMPBGWORKEXPERIENCE_WORKUNIT\')"   style="width:200px;height:25px;padding:0;border:none;background-color:#fff"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;line-height:25px">职位: </label>'+
  '			<input id="EMP_BG_WORKEXPERIENCE.EMPBGWORKEXPERIENCE_POSITION_4452_'+i+'" name="EMPBGWORKEXPERIENCE_POSITION" dataType="text" class="CCReadText"  value="'+EMPBGWORKEXPERIENCE_POSITION+'" type="text" readonly oninput="myFunction(this,\'EMPBGWORKEXPERIENCE_POSITION\')"   style="width:200px;height:25px;padding:0;border:none;background-color:#fff"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;line-height:25px">担任职务: </label>'+
  '			<input id="EMP_BG_WORKEXPERIENCE.EMPBGWORKEXPERIENCE_PROVERPOSITION_4452_'+i+'" name="EMPBGWORKEXPERIENCE_PROVERPOSITION" dataType="text" class="CCReadText"  value="'+EMPBGWORKEXPERIENCE_PROVERPOSITION+'" type="text" readonly oninput="myFunction(this,\'EMPBGWORKEXPERIENCE_PROVERPOSITION\')"   style="width:200px;height:25px;padding:0;border:none;background-color:#fff"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;line-height:25px">备注: </label>'+
  '			<input id="EMP_BG_WORKEXPERIENCE.EMPBGWORKEXPERIENCE_REMARK_4452_'+i+'" name="EMPBGWORKEXPERIENCE_REMARK" dataType="text" class="CCReadText"  value="'+EMPBGWORKEXPERIENCE_REMARK+'" type="text" readonly oninput="myFunction(this,\'EMPBGWORKEXPERIENCE_REMARK\')"   style="width:200px;height:25px;padding:0;border:none;background-color:#fff"/>'+
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
var BEGINDATE_value = xx.find("[name='EMPBGWORKEXPERIENCE_BEGINDATE']").val();
var ENDDATE_value = xx.find("[name='EMPBGWORKEXPERIENCE_ENDDATE']").val();
xx.find("[id='EMP_BG_WORKEXPERIENCE.EMPBGWORKEXPERIENCE_EMPID_4452_"+num+"']").attr("readonly",false);
xx.find("[id='EMP_BG_WORKEXPERIENCE.EMPBGWORKEXPERIENCE_EMPID_4452_"+num+"']").css("display","inline");
xx.find("[id='EMP_BG_WORKEXPERIENCE.EMPBGWORKEXPERIENCE_EMPID_4452_"+num+"']").attr("class","form-control");
  var fee_time_cellObj = '			<div class="controls input-append date form_date1 input-group" data-date=""  data-link-field="dtp_input2" data-link-format="yyyy-mm-dd" style="float:left;width: 134px;">'+
  					  '				<input style="width:134px;float:left;height:25px;padding:0;border:none;background-color:#fff"type="text" readonly class="form-control " dateType="controls input-append date form_date1" id="EMP_BG_WORKEXPERIENCE.EMPBGWORKEXPERIENCE_BEGINDATE_4452_'+num+'_datepick" styleType="dateTime"   style="width:134px;float:left;border-radius: 4px 0 0 4px;" name="EMPBGWORKEXPERIENCE_BEGINDATE"  format="yyyy-MM-dd" valueformat="yyyy-MM-dd" />'+
						  '				<span class="input-group-addon" name="closeButton" style="padding:1px 10px 2px 10px;font-size:12px"><span class="glyphicon glyphicon-remove"></span></span>'+
  					  '				<span class="input-group-addon" name="clickButton" style="padding:1px 10px 2px 10px;font-size:12px"><span class="glyphicon glyphicon-th"></span></span>'+
  					  '			</div>'+
  					  '			<span style="color:red;"></span>';
xx.find("[id='EMP_BG_WORKEXPERIENCE.EMPBGWORKEXPERIENCE_BEGINDATE_4452_"+num+"']").after(fee_time_cellObj);
xx.find("[id='EMP_BG_WORKEXPERIENCE.EMPBGWORKEXPERIENCE_BEGINDATE_4452_"+num+"']").css("display","none");
  var fee_time_cellObj = '			<div class="controls input-append date form_date1 input-group" data-date=""  data-link-field="dtp_input2" data-link-format="yyyy-mm-dd" style="float:left;width: 134px;">'+
  					  '				<input style="width:134px;float:left;height:25px;padding:0;border:none;background-color:#fff"type="text" readonly class="form-control " dateType="controls input-append date form_date1" id="EMP_BG_WORKEXPERIENCE.EMPBGWORKEXPERIENCE_ENDDATE_4452_'+num+'_datepick" styleType="dateTime"   style="width:134px;float:left;border-radius: 4px 0 0 4px;" name="EMPBGWORKEXPERIENCE_ENDDATE"  format="yyyy-MM-dd" valueformat="yyyy-MM-dd" />'+
						  '				<span class="input-group-addon" name="closeButton" style="padding:1px 10px 2px 10px;font-size:12px"><span class="glyphicon glyphicon-remove"></span></span>'+
  					  '				<span class="input-group-addon" name="clickButton" style="padding:1px 10px 2px 10px;font-size:12px"><span class="glyphicon glyphicon-th"></span></span>'+
  					  '			</div>'+
  					  '			<span style="color:red;"></span>';
xx.find("[id='EMP_BG_WORKEXPERIENCE.EMPBGWORKEXPERIENCE_ENDDATE_4452_"+num+"']").after(fee_time_cellObj);
xx.find("[id='EMP_BG_WORKEXPERIENCE.EMPBGWORKEXPERIENCE_ENDDATE_4452_"+num+"']").css("display","none");
xx.find("[id='EMP_BG_WORKEXPERIENCE.EMPBGWORKEXPERIENCE_WORKUNIT_4452_"+num+"']").attr("readonly",false);
xx.find("[id='EMP_BG_WORKEXPERIENCE.EMPBGWORKEXPERIENCE_WORKUNIT_4452_"+num+"']").css("display","inline");
xx.find("[id='EMP_BG_WORKEXPERIENCE.EMPBGWORKEXPERIENCE_WORKUNIT_4452_"+num+"']").attr("class","form-control");
xx.find("[id='EMP_BG_WORKEXPERIENCE.EMPBGWORKEXPERIENCE_POSITION_4452_"+num+"']").attr("readonly",false);
xx.find("[id='EMP_BG_WORKEXPERIENCE.EMPBGWORKEXPERIENCE_POSITION_4452_"+num+"']").css("display","inline");
xx.find("[id='EMP_BG_WORKEXPERIENCE.EMPBGWORKEXPERIENCE_POSITION_4452_"+num+"']").attr("class","form-control");
xx.find("[id='EMP_BG_WORKEXPERIENCE.EMPBGWORKEXPERIENCE_PROVERPOSITION_4452_"+num+"']").attr("readonly",false);
xx.find("[id='EMP_BG_WORKEXPERIENCE.EMPBGWORKEXPERIENCE_PROVERPOSITION_4452_"+num+"']").css("display","inline");
xx.find("[id='EMP_BG_WORKEXPERIENCE.EMPBGWORKEXPERIENCE_PROVERPOSITION_4452_"+num+"']").attr("class","form-control");
xx.find("[id='EMP_BG_WORKEXPERIENCE.EMPBGWORKEXPERIENCE_REMARK_4452_"+num+"']").attr("readonly",false);
xx.find("[id='EMP_BG_WORKEXPERIENCE.EMPBGWORKEXPERIENCE_REMARK_4452_"+num+"']").css("display","inline");
xx.find("[id='EMP_BG_WORKEXPERIENCE.EMPBGWORKEXPERIENCE_REMARK_4452_"+num+"']").attr("class","form-control");
		var pid = xx.attr("id");
		elementsListSelectInitFunction(e);
		cardAndCardDateWidInitFunction(e);
$("#"+x).find("[id='EMP_BG_WORKEXPERIENCE.EMPBGWORKEXPERIENCE_BEGINDATE_4452_"+num+"_datepick']").val(BEGINDATE_value);
$("#"+x).find("[id='EMP_BG_WORKEXPERIENCE.EMPBGWORKEXPERIENCE_ENDDATE_4452_"+num+"_datepick']").val(ENDDATE_value);
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
	loadDataStart2(e);
}
function zuixinFunction(e){
	if(e=='fubiao1'){
		Currentpage11=0;
		youxiao1=null;
		zuixin1='Y';
	}
	loadDataStart2(e);
}
function allFunction(e){
	if(e=='fubiao1'){
		Currentpage11=0;
		youxiao1=null;
		zuixin1=null;
	}
	loadDataStart2(e);
}
function next(e){
	if(e=='fubiao1'){
		Currentpage11--;
		loadDataStart2(e);
	}
	loadDataStart2(e);
}
function last(e){
	if(e=='fubiao1'){
		Currentpage11--;
		loadDataStart2(e);
	}
	loadDataStart2(e);
}
	 function loadDataStart2(e){
	 if(e=='fubiao1'){
		 $.ajax({
			url: "/myehr/form/cardformInitData.action",
			type: 'post',
			data:grid_EMP_BG_WORKEXPERIENCE_LIST_fun(xx),//HTTP请求类型
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
	}
	 function loadDataStart3(e){
	 if(e=='fubiao1'){
		 $.ajax({
			url: "/myehr/form/cardformInitData.action",
			type: 'post',
			data:grid_EMP_BG_WORKEXPERIENCE_LIST_funx(xx),//HTTP请求类型
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
	}
	 function loadDataStart4(e){
	 if(e=='fubiao1'){
		 $.ajax({
			url: "/myehr/form/cardformInitData.action",
			type: 'post',
			data:grid_EMP_BG_WORKEXPERIENCE_LIST_funx(xx),//HTTP请求类型
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
	}
function grid_EMP_BG_WORKEXPERIENCE_LIST_fun(pageReqeust){
	var _filterdata={};
	var paramsMap = {};
	var requestParam={};
requestParam = {EMPBG_EMPID:EMPBG_EMPID_parameter};
	pageReqeust.containerParam=containerParam_4452;
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.userIds=param_empIds;
	pageReqeust.formId=_formId_4452;
	pageReqeust.isView=null;
	pageReqeust.offset=Currentpage11*pagesize11;;
	pageReqeust.limit=pagesize11;;
	if(heightGadedata_4452!=null&&heightGadedata_4452!=undefined){
		pageReqeust.heightGrade = heightGadedata_4452;
	}
	queryParams = JSON.stringify(pageReqeust);
	return queryParams;
}
function grid_EMP_BG_WORKEXPERIENCE_LIST_funx(pageReqeust){
	var _filterdata={};
	var paramsMap = {};
	var requestParam={};
requestParam = {EMPBG_EMPID:EMPBG_EMPID_parameter};
	pageReqeust.containerParam=containerParam_4452;
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.userIds=param_empIds;
	pageReqeust.formId=_formId_4452;
	pageReqeust.isView=null;
	pageReqeust.offset=Currentpage21*pagesize21;;
	pageReqeust.limit=pagesize21;;
	if(heightGadedata_4452!=null&&heightGadedata_4452!=undefined){
		pageReqeust.heightGrade = heightGadedata_4452;
	}
	queryParams = JSON.stringify(pageReqeust);
	return queryParams;
}
	 function initAddValue(e,num){
	 if(e=='fubiao1'){
	 	num--;
		var obj = $("#newElement"+num);
	 }
	}
