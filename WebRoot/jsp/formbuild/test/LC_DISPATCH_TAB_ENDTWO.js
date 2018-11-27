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
var indexApprove;
function approved_save_6406(){
	var paramsMap = {};
	var _param = {};
	var hzsParam = [];
	_param.formId=formId_main;
	_param = cardGetdata_main('#submitButton_main',formId_main);
	_param.buttonId='6406';
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
function approved_refer_6406(buttonType){
	if(checkedPointRequire()){
		if(buttonType=='通过'){
			if(!approved_save_6406()){
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
			if(!approved_save_6406()){
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
		}else{
			approved_refer2_6406(buttonType,'','');
			return;
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
				approved_refer2_6406(buttonType,approveRemark,rejectType);
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
function approved_refer2_6406(buttonType,approveRemark,rejectType){
    var flowAction = param_flowAction;
	     var paramsMap = {};
	     var _param = {};
	     _param.formId=formId_main;
	     _param =  cardGetdata_main('#submitButton_main',formId_main);
	     _param.buttonId='6406';
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
			     if(text[0]=='error'){
				     alert("审批失败!"+text[1]);
					return ;
			     }else if(text[0]=='000000'){
				     alert("操作成功");
					 updateFiles();
				     closex();
			     }
		     }
	     });
}
function approved_save_6407(){
	var paramsMap = {};
	var _param = {};
	var hzsParam = [];
	_param.formId=formId_main;
	_param = cardGetdata_main('#submitButton_main',formId_main);
	_param.buttonId='6407';
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
function approved_refer_6407(buttonType){
	if(checkedPointRequire()){
		if(buttonType=='通过'){
			if(!approved_save_6407()){
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
			if(!approved_save_6407()){
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
		}else{
			approved_refer2_6407(buttonType,'','');
			return;
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
				approved_refer2_6407(buttonType,approveRemark,rejectType);
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
function approved_refer2_6407(buttonType,approveRemark,rejectType){
    var flowAction = param_flowAction;
	     var paramsMap = {};
	     var _param = {};
	     _param.formId=formId_main;
	     _param =  cardGetdata_main('#submitButton_main',formId_main);
	     _param.buttonId='6407';
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
			     if(text[0]=='error'){
				     alert("审批失败!"+text[1]);
					return ;
			     }else if(text[0]=='000000'){
				     alert("操作成功");
					 updateFiles();
				     closex();
			     }
		     }
	     });
}
function temporaryStorage_save_6408(){
	var paramsMap = {};
	var _param = {};
	var hzsParam = [];
	_param.formId=formId_main;
	_param = cardGetdata_main('#submitButton_main',formId_main);
	_param.buttonId='6408';
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
					'	<span class="fa fa-save saveButton" style="position: absolute;right: 30px;font-size: 25px;top:50px" onclick="saveElement(this,\'4526\')"></span>'+
  '	<input id="LC_DISPATCH_SUB.LCDISPATCHSUB_ID_4526" name="LCDISPATCHSUB_ID"   type="hidden" >'+
  '	<input id="LC_DISPATCH_SUB.LCDISPATCHSUB_SEQID_4526" name="LCDISPATCHSUB_SEQID"   type="hidden" >'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">工号: </label>'+
  '			<input id="LC_DISPATCH_SUB.LCDISPATCHSUB_EMPCODE_4526_add_'+newElementNum+'" name="LCDISPATCHSUB_EMPCODE" dataType="text" type="text" class="form-control" oninput="myFunction(this,\'LCDISPATCHSUB_EMPCODE\')"  vtype="illegalChar;maxLength:50;minLength:null;"   style="width:200px;height:25px;padding:0;border:none;background-color:#fff;display:inline"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">姓名: </label>'+
  '			<select id="LC_DISPATCH_SUB.LCDISPATCHSUB_EMPID_4526_add_'+newElementNum+'" title="姓名" styleType="select" name="LCDISPATCHSUB_EMPID"  columnId="86056" class="form-control selectpicker bla bla bli" data-live-search="true" styleType2="search" style="width:200px;float:left;height:25px;padding:0;border:none;background-color:#fff"  emptyText=""  style="float:left;width:200px;" dataField1 = "sql"  textField="text" valueField="id" DictName="LC_DISPATCH_EMPID" dataField="data_form_86056"initParam = "_"></select>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">机构: </label>'+
  '			<select id="LC_DISPATCH_SUB.LCDISPATCHSUB_COMPID_4526_add_'+newElementNum+'" title="机构" styleType="select" name="LCDISPATCHSUB_COMPID"  columnId="86058" class="form-control " style="width:200px;float:left;height:25px;padding:0;border:none;background-color:#fff"  emptyText=""  style="float:left;width:200px;" dataField1 = "sql"  textField="text" valueField="id" DictName="sql56" dataField="data_form_86058"initParam = "_"></select>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">部门: </label>'+
  '			<select id="LC_DISPATCH_SUB.LCDISPATCHSUB_DEPID_4526_add_'+newElementNum+'" title="部门" styleType="select" name="LCDISPATCHSUB_DEPID"  columnId="86059" class="form-control " style="width:200px;float:left;height:25px;padding:0;border:none;background-color:#fff"  emptyText=""  style="float:left;width:200px;" dataField1 = "sql"  textField="text" valueField="id" DictName="sql6" dataField="data_form_86059"initParam = "_"></select>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">岗位: </label>'+
  '			<select id="LC_DISPATCH_SUB.LCDISPATCHSUB_JOBID_4526_add_'+newElementNum+'" title="岗位" styleType="select" name="LCDISPATCHSUB_JOBID"  columnId="86060" class="form-control " style="width:200px;float:left;height:25px;padding:0;border:none;background-color:#fff"  emptyText=""  style="float:left;width:200px;" dataField1 = "sql"  textField="text" valueField="id" DictName="sql46" dataField="data_form_86060"initParam = "_"></select>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">身份证号码: </label>'+
  '			<input id="LC_DISPATCH_SUB.LCDISPATCHSUB_CERTNO_4526_add_'+newElementNum+'" name="LCDISPATCHSUB_CERTNO" dataType="text" type="text" class="form-control" oninput="myFunction(this,\'LCDISPATCHSUB_CERTNO\')"  vtype="illegalChar;maxLength:100;minLength:null;"   style="width:200px;height:25px;padding:0;border:none;background-color:#fff;display:inline"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">发薪单位: </label>'+
  '			<input id="LC_DISPATCH_SUB.LCDISPATCHSUB_PAYCOMPID_4526_add_'+newElementNum+'" name="LCDISPATCHSUB_PAYCOMPID" dataType="text" type="text" class="form-control" oninput="myFunction(this,\'LCDISPATCHSUB_PAYCOMPID\')"  vtype="illegalChar;maxLength:100;minLength:null;"   style="width:200px;height:25px;padding:0;border:none;background-color:#fff;display:inline"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">基本工资: </label>'+
  '			<input id="LC_DISPATCH_SUB.LCDISPATCHSUB_BASICWAGE_4526_add_'+newElementNum+'" name="LCDISPATCHSUB_BASICWAGE" dataType="text" type="text" class="form-control" oninput="myFunction(this,\'LCDISPATCHSUB_BASICWAGE\')"  vtype="illegalChar;maxLength:16;minLength:null;"   style="width:200px;height:25px;padding:0;border:none;background-color:#fff;display:inline"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">通讯费: </label>'+
  '			<input id="LC_DISPATCH_SUB.LCDISPATCHSUB_COMMUNFEE_4526_add_'+newElementNum+'" name="LCDISPATCHSUB_COMMUNFEE" dataType="text" type="text" class="form-control" oninput="myFunction(this,\'LCDISPATCHSUB_COMMUNFEE\')"  vtype="illegalChar;maxLength:16;minLength:null;"   style="width:200px;height:25px;padding:0;border:none;background-color:#fff;display:inline"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">扣缺勤: </label>'+
  '			<input id="LC_DISPATCH_SUB.LCDISPATCHSUB_DEDABSENEC_4526_add_'+newElementNum+'" name="LCDISPATCHSUB_DEDABSENEC" dataType="text" type="text" class="form-control" oninput="myFunction(this,\'LCDISPATCHSUB_DEDABSENEC\')"  vtype="illegalChar;maxLength:16;minLength:null;"   style="width:200px;height:25px;padding:0;border:none;background-color:#fff;display:inline"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">车贴: </label>'+
  '			<input id="LC_DISPATCH_SUB.LCDISPATCHSUB_CARSTICKER_4526_add_'+newElementNum+'" name="LCDISPATCHSUB_CARSTICKER" dataType="text" type="text" class="form-control" oninput="myFunction(this,\'LCDISPATCHSUB_CARSTICKER\')"  vtype="illegalChar;maxLength:16;minLength:null;"   style="width:200px;height:25px;padding:0;border:none;background-color:#fff;display:inline"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">加班费: </label>'+
  '			<input id="LC_DISPATCH_SUB.LCDISPATCHSUB_OVERTIME_4526_add_'+newElementNum+'" name="LCDISPATCHSUB_OVERTIME" dataType="text" type="text" class="form-control" oninput="myFunction(this,\'LCDISPATCHSUB_OVERTIME\')"  vtype="illegalChar;maxLength:16;minLength:null;"   style="width:200px;height:25px;padding:0;border:none;background-color:#fff;display:inline"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">绩效(年终奖): </label>'+
  '			<input id="LC_DISPATCH_SUB.LCDISPATCHSUB_PERFORYEAR_4526_add_'+newElementNum+'" name="LCDISPATCHSUB_PERFORYEAR" dataType="text" type="text" class="form-control" oninput="myFunction(this,\'LCDISPATCHSUB_PERFORYEAR\')"  vtype="illegalChar;maxLength:16;minLength:null;"   style="width:200px;height:25px;padding:0;border:none;background-color:#fff;display:inline"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">绩效奖: </label>'+
  '			<input id="LC_DISPATCH_SUB.LCDISPATCHSUB_PERFORAWARD_4526_add_'+newElementNum+'" name="LCDISPATCHSUB_PERFORAWARD" dataType="text" type="text" class="form-control" oninput="myFunction(this,\'LCDISPATCHSUB_PERFORAWARD\')"  vtype="illegalChar;maxLength:16;minLength:null;"   style="width:200px;height:25px;padding:0;border:none;background-color:#fff;display:inline"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">绩效(节日): </label>'+
  '			<input id="LC_DISPATCH_SUB.LCDISPATCHSUB_PERFORFEST_4526_add_'+newElementNum+'" name="LCDISPATCHSUB_PERFORFEST" dataType="text" type="text" class="form-control" oninput="myFunction(this,\'LCDISPATCHSUB_PERFORFEST\')"  vtype="illegalChar;maxLength:16;minLength:null;"   style="width:200px;height:25px;padding:0;border:none;background-color:#fff;display:inline"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">发放小计: </label>'+
  '			<input id="LC_DISPATCH_SUB.LCDISPATCHSUB_SUBTOTAL_4526_add_'+newElementNum+'" name="LCDISPATCHSUB_SUBTOTAL" dataType="text" type="text" class="form-control" oninput="myFunction(this,\'LCDISPATCHSUB_SUBTOTAL\')"  vtype="illegalChar;maxLength:16;minLength:null;"   style="width:200px;height:25px;padding:0;border:none;background-color:#fff;display:inline"/>'+
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
var LCDISPATCHSUB_ID = '';
if(arr.length>0&&arr[i].LCDISPATCHSUB_ID!=null){
LCDISPATCHSUB_ID = arr[i].LCDISPATCHSUB_ID;
}
var LCDISPATCHSUB_SEQID = '';
if(arr.length>0&&arr[i].LCDISPATCHSUB_SEQID!=null){
LCDISPATCHSUB_SEQID = arr[i].LCDISPATCHSUB_SEQID;
}
var LCDISPATCHSUB_EMPCODE = '';
if(arr.length>0&&arr[i].LCDISPATCHSUB_EMPCODE!=null){
LCDISPATCHSUB_EMPCODE = arr[i].LCDISPATCHSUB_EMPCODE;
}
var LCDISPATCHSUB_EMPID = '';
if(arr.length>0&&arr[i].LCDISPATCHSUB_EMPID!=null){
LCDISPATCHSUB_EMPID = arr[i].LCDISPATCHSUB_EMPID;
}
var LCDISPATCHSUB_EMPID_DICTNAME = '';
if(arr.length>0&&arr[i].LCDISPATCHSUB_EMPID_DICTNAME!=null){
LCDISPATCHSUB_EMPID_DICTNAME = arr[i].LCDISPATCHSUB_EMPID_DICTNAME;
}
var LCDISPATCHSUB_COMPID = '';
if(arr.length>0&&arr[i].LCDISPATCHSUB_COMPID!=null){
LCDISPATCHSUB_COMPID = arr[i].LCDISPATCHSUB_COMPID;
}
var LCDISPATCHSUB_COMPID_DICTNAME = '';
if(arr.length>0&&arr[i].LCDISPATCHSUB_COMPID_DICTNAME!=null){
LCDISPATCHSUB_COMPID_DICTNAME = arr[i].LCDISPATCHSUB_COMPID_DICTNAME;
}
var LCDISPATCHSUB_DEPID = '';
if(arr.length>0&&arr[i].LCDISPATCHSUB_DEPID!=null){
LCDISPATCHSUB_DEPID = arr[i].LCDISPATCHSUB_DEPID;
}
var LCDISPATCHSUB_DEPID_DICTNAME = '';
if(arr.length>0&&arr[i].LCDISPATCHSUB_DEPID_DICTNAME!=null){
LCDISPATCHSUB_DEPID_DICTNAME = arr[i].LCDISPATCHSUB_DEPID_DICTNAME;
}
var LCDISPATCHSUB_JOBID = '';
if(arr.length>0&&arr[i].LCDISPATCHSUB_JOBID!=null){
LCDISPATCHSUB_JOBID = arr[i].LCDISPATCHSUB_JOBID;
}
var LCDISPATCHSUB_JOBID_DICTNAME = '';
if(arr.length>0&&arr[i].LCDISPATCHSUB_JOBID_DICTNAME!=null){
LCDISPATCHSUB_JOBID_DICTNAME = arr[i].LCDISPATCHSUB_JOBID_DICTNAME;
}
var LCDISPATCHSUB_CERTNO = '';
if(arr.length>0&&arr[i].LCDISPATCHSUB_CERTNO!=null){
LCDISPATCHSUB_CERTNO = arr[i].LCDISPATCHSUB_CERTNO;
}
var LCDISPATCHSUB_PAYCOMPID = '';
if(arr.length>0&&arr[i].LCDISPATCHSUB_PAYCOMPID!=null){
LCDISPATCHSUB_PAYCOMPID = arr[i].LCDISPATCHSUB_PAYCOMPID;
}
var LCDISPATCHSUB_BASICWAGE = '';
if(arr.length>0&&arr[i].LCDISPATCHSUB_BASICWAGE!=null){
LCDISPATCHSUB_BASICWAGE = arr[i].LCDISPATCHSUB_BASICWAGE;
}
var LCDISPATCHSUB_COMMUNFEE = '';
if(arr.length>0&&arr[i].LCDISPATCHSUB_COMMUNFEE!=null){
LCDISPATCHSUB_COMMUNFEE = arr[i].LCDISPATCHSUB_COMMUNFEE;
}
var LCDISPATCHSUB_DEDABSENEC = '';
if(arr.length>0&&arr[i].LCDISPATCHSUB_DEDABSENEC!=null){
LCDISPATCHSUB_DEDABSENEC = arr[i].LCDISPATCHSUB_DEDABSENEC;
}
var LCDISPATCHSUB_CARSTICKER = '';
if(arr.length>0&&arr[i].LCDISPATCHSUB_CARSTICKER!=null){
LCDISPATCHSUB_CARSTICKER = arr[i].LCDISPATCHSUB_CARSTICKER;
}
var LCDISPATCHSUB_OVERTIME = '';
if(arr.length>0&&arr[i].LCDISPATCHSUB_OVERTIME!=null){
LCDISPATCHSUB_OVERTIME = arr[i].LCDISPATCHSUB_OVERTIME;
}
var LCDISPATCHSUB_PERFORYEAR = '';
if(arr.length>0&&arr[i].LCDISPATCHSUB_PERFORYEAR!=null){
LCDISPATCHSUB_PERFORYEAR = arr[i].LCDISPATCHSUB_PERFORYEAR;
}
var LCDISPATCHSUB_PERFORAWARD = '';
if(arr.length>0&&arr[i].LCDISPATCHSUB_PERFORAWARD!=null){
LCDISPATCHSUB_PERFORAWARD = arr[i].LCDISPATCHSUB_PERFORAWARD;
}
var LCDISPATCHSUB_PERFORFEST = '';
if(arr.length>0&&arr[i].LCDISPATCHSUB_PERFORFEST!=null){
LCDISPATCHSUB_PERFORFEST = arr[i].LCDISPATCHSUB_PERFORFEST;
}
var LCDISPATCHSUB_SUBTOTAL = '';
if(arr.length>0&&arr[i].LCDISPATCHSUB_SUBTOTAL!=null){
LCDISPATCHSUB_SUBTOTAL = arr[i].LCDISPATCHSUB_SUBTOTAL;
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
  '	<input id="LC_DISPATCH_SUB.LCDISPATCHSUB_ID_4526" name="LCDISPATCHSUB_ID" value="'+LCDISPATCHSUB_ID+'"  type="hidden" >'+
  '	<input id="LC_DISPATCH_SUB.LCDISPATCHSUB_SEQID_4526" name="LCDISPATCHSUB_SEQID" value="'+LCDISPATCHSUB_SEQID+'"  type="hidden" >'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;line-height:25px">工号: </label>'+
  '			<input id="LC_DISPATCH_SUB.LCDISPATCHSUB_EMPCODE_4526_'+i+'" name="LCDISPATCHSUB_EMPCODE" dataType="text" class="CCReadText"  value="'+LCDISPATCHSUB_EMPCODE+'" type="text" readonly oninput="myFunction(this,\'LCDISPATCHSUB_EMPCODE\')"   style="width:200px;height:25px;padding:0;border:none;background-color:#fff"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">姓名: </label>'+
  '			<input id="LC_DISPATCH_SUB.LCDISPATCHSUB_EMPID_4526" title="姓名" styleType="select" name="LCDISPATCHSUB_EMPID" value="'+LCDISPATCHSUB_EMPID_DICTNAME+'" class="form-control " columnId="86056" style="width:200px;float:left;height:25px;padding:0;border:none;background-color:#fff"  emptyText=""  dataField1 = "sql"  readonly  style="border:none;width:200px; " textField="text" valueField="id" DictName="LC_DISPATCH_EMPID" dataField="data_form_86056"initParam = "_"/>'+
	'			<input id="LC_DISPATCH_SUB.LCDISPATCHSUB_EMPID_4526_value" name="LCDISPATCHSUB_EMPID" type="hidden" value="'+LCDISPATCHSUB_EMPID+'"/>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">机构: </label>'+
  '			<input id="LC_DISPATCH_SUB.LCDISPATCHSUB_COMPID_4526" title="机构" styleType="select" name="LCDISPATCHSUB_COMPID" value="'+LCDISPATCHSUB_COMPID_DICTNAME+'" class="form-control " columnId="86058" style="width:200px;float:left;height:25px;padding:0;border:none;background-color:#fff"  emptyText=""  dataField1 = "sql"  readonly  style="border:none;width:200px; " textField="text" valueField="id" DictName="sql56" dataField="data_form_86058"initParam = "_"/>'+
	'			<input id="LC_DISPATCH_SUB.LCDISPATCHSUB_COMPID_4526_value" name="LCDISPATCHSUB_COMPID" type="hidden" value="'+LCDISPATCHSUB_COMPID+'"/>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">部门: </label>'+
  '			<input id="LC_DISPATCH_SUB.LCDISPATCHSUB_DEPID_4526" title="部门" styleType="select" name="LCDISPATCHSUB_DEPID" value="'+LCDISPATCHSUB_DEPID_DICTNAME+'" class="form-control " columnId="86059" style="width:200px;float:left;height:25px;padding:0;border:none;background-color:#fff"  emptyText=""  dataField1 = "sql"  readonly  style="border:none;width:200px; " textField="text" valueField="id" DictName="sql6" dataField="data_form_86059"initParam = "_"/>'+
	'			<input id="LC_DISPATCH_SUB.LCDISPATCHSUB_DEPID_4526_value" name="LCDISPATCHSUB_DEPID" type="hidden" value="'+LCDISPATCHSUB_DEPID+'"/>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">岗位: </label>'+
  '			<input id="LC_DISPATCH_SUB.LCDISPATCHSUB_JOBID_4526" title="岗位" styleType="select" name="LCDISPATCHSUB_JOBID" value="'+LCDISPATCHSUB_JOBID_DICTNAME+'" class="form-control " columnId="86060" style="width:200px;float:left;height:25px;padding:0;border:none;background-color:#fff"  emptyText=""  dataField1 = "sql"  readonly  style="border:none;width:200px; " textField="text" valueField="id" DictName="sql46" dataField="data_form_86060"initParam = "_"/>'+
	'			<input id="LC_DISPATCH_SUB.LCDISPATCHSUB_JOBID_4526_value" name="LCDISPATCHSUB_JOBID" type="hidden" value="'+LCDISPATCHSUB_JOBID+'"/>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;line-height:25px">身份证号码: </label>'+
  '			<input id="LC_DISPATCH_SUB.LCDISPATCHSUB_CERTNO_4526_'+i+'" name="LCDISPATCHSUB_CERTNO" dataType="text" class="CCReadText"  value="'+LCDISPATCHSUB_CERTNO+'" type="text" readonly oninput="myFunction(this,\'LCDISPATCHSUB_CERTNO\')"   style="width:200px;height:25px;padding:0;border:none;background-color:#fff"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;line-height:25px">发薪单位: </label>'+
  '			<input id="LC_DISPATCH_SUB.LCDISPATCHSUB_PAYCOMPID_4526_'+i+'" name="LCDISPATCHSUB_PAYCOMPID" dataType="text" class="CCReadText"  value="'+LCDISPATCHSUB_PAYCOMPID+'" type="text" readonly oninput="myFunction(this,\'LCDISPATCHSUB_PAYCOMPID\')"   style="width:200px;height:25px;padding:0;border:none;background-color:#fff"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;line-height:25px">基本工资: </label>'+
  '			<input id="LC_DISPATCH_SUB.LCDISPATCHSUB_BASICWAGE_4526_'+i+'" name="LCDISPATCHSUB_BASICWAGE" dataType="text" class="CCReadText"  value="'+LCDISPATCHSUB_BASICWAGE+'" type="text" readonly oninput="myFunction(this,\'LCDISPATCHSUB_BASICWAGE\')"   style="width:200px;height:25px;padding:0;border:none;background-color:#fff"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;line-height:25px">通讯费: </label>'+
  '			<input id="LC_DISPATCH_SUB.LCDISPATCHSUB_COMMUNFEE_4526_'+i+'" name="LCDISPATCHSUB_COMMUNFEE" dataType="text" class="CCReadText"  value="'+LCDISPATCHSUB_COMMUNFEE+'" type="text" readonly oninput="myFunction(this,\'LCDISPATCHSUB_COMMUNFEE\')"   style="width:200px;height:25px;padding:0;border:none;background-color:#fff"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;line-height:25px">扣缺勤: </label>'+
  '			<input id="LC_DISPATCH_SUB.LCDISPATCHSUB_DEDABSENEC_4526_'+i+'" name="LCDISPATCHSUB_DEDABSENEC" dataType="text" class="CCReadText"  value="'+LCDISPATCHSUB_DEDABSENEC+'" type="text" readonly oninput="myFunction(this,\'LCDISPATCHSUB_DEDABSENEC\')"   style="width:200px;height:25px;padding:0;border:none;background-color:#fff"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;line-height:25px">车贴: </label>'+
  '			<input id="LC_DISPATCH_SUB.LCDISPATCHSUB_CARSTICKER_4526_'+i+'" name="LCDISPATCHSUB_CARSTICKER" dataType="text" class="CCReadText"  value="'+LCDISPATCHSUB_CARSTICKER+'" type="text" readonly oninput="myFunction(this,\'LCDISPATCHSUB_CARSTICKER\')"   style="width:200px;height:25px;padding:0;border:none;background-color:#fff"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;line-height:25px">加班费: </label>'+
  '			<input id="LC_DISPATCH_SUB.LCDISPATCHSUB_OVERTIME_4526_'+i+'" name="LCDISPATCHSUB_OVERTIME" dataType="text" class="CCReadText"  value="'+LCDISPATCHSUB_OVERTIME+'" type="text" readonly oninput="myFunction(this,\'LCDISPATCHSUB_OVERTIME\')"   style="width:200px;height:25px;padding:0;border:none;background-color:#fff"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;line-height:25px">绩效(年终奖): </label>'+
  '			<input id="LC_DISPATCH_SUB.LCDISPATCHSUB_PERFORYEAR_4526_'+i+'" name="LCDISPATCHSUB_PERFORYEAR" dataType="text" class="CCReadText"  value="'+LCDISPATCHSUB_PERFORYEAR+'" type="text" readonly oninput="myFunction(this,\'LCDISPATCHSUB_PERFORYEAR\')"   style="width:200px;height:25px;padding:0;border:none;background-color:#fff"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;line-height:25px">绩效奖: </label>'+
  '			<input id="LC_DISPATCH_SUB.LCDISPATCHSUB_PERFORAWARD_4526_'+i+'" name="LCDISPATCHSUB_PERFORAWARD" dataType="text" class="CCReadText"  value="'+LCDISPATCHSUB_PERFORAWARD+'" type="text" readonly oninput="myFunction(this,\'LCDISPATCHSUB_PERFORAWARD\')"   style="width:200px;height:25px;padding:0;border:none;background-color:#fff"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;line-height:25px">绩效(节日): </label>'+
  '			<input id="LC_DISPATCH_SUB.LCDISPATCHSUB_PERFORFEST_4526_'+i+'" name="LCDISPATCHSUB_PERFORFEST" dataType="text" class="CCReadText"  value="'+LCDISPATCHSUB_PERFORFEST+'" type="text" readonly oninput="myFunction(this,\'LCDISPATCHSUB_PERFORFEST\')"   style="width:200px;height:25px;padding:0;border:none;background-color:#fff"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;line-height:25px">发放小计: </label>'+
  '			<input id="LC_DISPATCH_SUB.LCDISPATCHSUB_SUBTOTAL_4526_'+i+'" name="LCDISPATCHSUB_SUBTOTAL" dataType="text" class="CCReadText"  value="'+LCDISPATCHSUB_SUBTOTAL+'" type="text" readonly oninput="myFunction(this,\'LCDISPATCHSUB_SUBTOTAL\')"   style="width:200px;height:25px;padding:0;border:none;background-color:#fff"/>'+
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
	 function showDate_3864(data,e){
		 

			$('#emp_emp_list_List').bootstrapTable('load',data);
	 }
	 function showAccount(arr,e){
		 if(e=='fubiao1'){
			 var cellObj = '';
			 cellObj += '<div class="col-md-12 col-sm-12 col-lg-12">'+
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
var EMPID_value = xx.find("[name='LCDISPATCHSUB_EMPID']").eq(1).val();
var COMPID_value = xx.find("[name='LCDISPATCHSUB_COMPID']").eq(1).val();
var DEPID_value = xx.find("[name='LCDISPATCHSUB_DEPID']").eq(1).val();
var JOBID_value = xx.find("[name='LCDISPATCHSUB_JOBID']").eq(1).val();
xx.find("[id='LC_DISPATCH_SUB.LCDISPATCHSUB_EMPCODE_4526_"+num+"']").attr("readonly",false);
xx.find("[id='LC_DISPATCH_SUB.LCDISPATCHSUB_EMPCODE_4526_"+num+"']").css("display","inline");
xx.find("[id='LC_DISPATCH_SUB.LCDISPATCHSUB_EMPCODE_4526_"+num+"']").attr("class","form-control");
  var LCDISPATCHSUB_EMPID_cellObj = '			<select id="LC_DISPATCH_SUB.LCDISPATCHSUB_EMPID_4526_'+num+'_select" title="姓名"  styleType="select" name="LCDISPATCHSUB_EMPID" style="width:200px;float:left;height:25px;padding:0;border:none;background-color:#fff" columnId="86056" class="form-control selectpicker bla bla bli" data-live-search="true" styleType2="search" dataField1 = "sql"  emptyText=""  style="float:left;width:200px;" textField="text" valueField="id" DictName="LC_DISPATCH_EMPID" dataField="data_form_86056"initParam = "_"></select>';
	xx.find("[name='LCDISPATCHSUB_EMPID']").eq(1).after(LCDISPATCHSUB_EMPID_cellObj);
	xx.find("[name='LCDISPATCHSUB_EMPID']").eq(0).remove();
	xx.find("[name='LCDISPATCHSUB_EMPID']").eq(0).remove();
  var LCDISPATCHSUB_COMPID_cellObj = '			<select id="LC_DISPATCH_SUB.LCDISPATCHSUB_COMPID_4526_'+num+'_select" title="机构"  styleType="select" name="LCDISPATCHSUB_COMPID" style="width:200px;float:left;height:25px;padding:0;border:none;background-color:#fff" columnId="86058" class="form-control " dataField1 = "sql"  emptyText=""  style="float:left;width:200px;" textField="text" valueField="id" DictName="sql56" dataField="data_form_86058"initParam = "_"></select>';
	xx.find("[name='LCDISPATCHSUB_COMPID']").eq(1).after(LCDISPATCHSUB_COMPID_cellObj);
	xx.find("[name='LCDISPATCHSUB_COMPID']").eq(0).remove();
	xx.find("[name='LCDISPATCHSUB_COMPID']").eq(0).remove();
  var LCDISPATCHSUB_DEPID_cellObj = '			<select id="LC_DISPATCH_SUB.LCDISPATCHSUB_DEPID_4526_'+num+'_select" title="部门"  styleType="select" name="LCDISPATCHSUB_DEPID" style="width:200px;float:left;height:25px;padding:0;border:none;background-color:#fff" columnId="86059" class="form-control " dataField1 = "sql"  emptyText=""  style="float:left;width:200px;" textField="text" valueField="id" DictName="sql6" dataField="data_form_86059"initParam = "_"></select>';
	xx.find("[name='LCDISPATCHSUB_DEPID']").eq(1).after(LCDISPATCHSUB_DEPID_cellObj);
	xx.find("[name='LCDISPATCHSUB_DEPID']").eq(0).remove();
	xx.find("[name='LCDISPATCHSUB_DEPID']").eq(0).remove();
  var LCDISPATCHSUB_JOBID_cellObj = '			<select id="LC_DISPATCH_SUB.LCDISPATCHSUB_JOBID_4526_'+num+'_select" title="岗位"  styleType="select" name="LCDISPATCHSUB_JOBID" style="width:200px;float:left;height:25px;padding:0;border:none;background-color:#fff" columnId="86060" class="form-control " dataField1 = "sql"  emptyText=""  style="float:left;width:200px;" textField="text" valueField="id" DictName="sql46" dataField="data_form_86060"initParam = "_"></select>';
	xx.find("[name='LCDISPATCHSUB_JOBID']").eq(1).after(LCDISPATCHSUB_JOBID_cellObj);
	xx.find("[name='LCDISPATCHSUB_JOBID']").eq(0).remove();
	xx.find("[name='LCDISPATCHSUB_JOBID']").eq(0).remove();
xx.find("[id='LC_DISPATCH_SUB.LCDISPATCHSUB_CERTNO_4526_"+num+"']").attr("readonly",false);
xx.find("[id='LC_DISPATCH_SUB.LCDISPATCHSUB_CERTNO_4526_"+num+"']").css("display","inline");
xx.find("[id='LC_DISPATCH_SUB.LCDISPATCHSUB_CERTNO_4526_"+num+"']").attr("class","form-control");
xx.find("[id='LC_DISPATCH_SUB.LCDISPATCHSUB_PAYCOMPID_4526_"+num+"']").attr("readonly",false);
xx.find("[id='LC_DISPATCH_SUB.LCDISPATCHSUB_PAYCOMPID_4526_"+num+"']").css("display","inline");
xx.find("[id='LC_DISPATCH_SUB.LCDISPATCHSUB_PAYCOMPID_4526_"+num+"']").attr("class","form-control");
xx.find("[id='LC_DISPATCH_SUB.LCDISPATCHSUB_BASICWAGE_4526_"+num+"']").attr("readonly",false);
xx.find("[id='LC_DISPATCH_SUB.LCDISPATCHSUB_BASICWAGE_4526_"+num+"']").css("display","inline");
xx.find("[id='LC_DISPATCH_SUB.LCDISPATCHSUB_BASICWAGE_4526_"+num+"']").attr("class","form-control");
xx.find("[id='LC_DISPATCH_SUB.LCDISPATCHSUB_COMMUNFEE_4526_"+num+"']").attr("readonly",false);
xx.find("[id='LC_DISPATCH_SUB.LCDISPATCHSUB_COMMUNFEE_4526_"+num+"']").css("display","inline");
xx.find("[id='LC_DISPATCH_SUB.LCDISPATCHSUB_COMMUNFEE_4526_"+num+"']").attr("class","form-control");
xx.find("[id='LC_DISPATCH_SUB.LCDISPATCHSUB_DEDABSENEC_4526_"+num+"']").attr("readonly",false);
xx.find("[id='LC_DISPATCH_SUB.LCDISPATCHSUB_DEDABSENEC_4526_"+num+"']").css("display","inline");
xx.find("[id='LC_DISPATCH_SUB.LCDISPATCHSUB_DEDABSENEC_4526_"+num+"']").attr("class","form-control");
xx.find("[id='LC_DISPATCH_SUB.LCDISPATCHSUB_CARSTICKER_4526_"+num+"']").attr("readonly",false);
xx.find("[id='LC_DISPATCH_SUB.LCDISPATCHSUB_CARSTICKER_4526_"+num+"']").css("display","inline");
xx.find("[id='LC_DISPATCH_SUB.LCDISPATCHSUB_CARSTICKER_4526_"+num+"']").attr("class","form-control");
xx.find("[id='LC_DISPATCH_SUB.LCDISPATCHSUB_OVERTIME_4526_"+num+"']").attr("readonly",false);
xx.find("[id='LC_DISPATCH_SUB.LCDISPATCHSUB_OVERTIME_4526_"+num+"']").css("display","inline");
xx.find("[id='LC_DISPATCH_SUB.LCDISPATCHSUB_OVERTIME_4526_"+num+"']").attr("class","form-control");
xx.find("[id='LC_DISPATCH_SUB.LCDISPATCHSUB_PERFORYEAR_4526_"+num+"']").attr("readonly",false);
xx.find("[id='LC_DISPATCH_SUB.LCDISPATCHSUB_PERFORYEAR_4526_"+num+"']").css("display","inline");
xx.find("[id='LC_DISPATCH_SUB.LCDISPATCHSUB_PERFORYEAR_4526_"+num+"']").attr("class","form-control");
xx.find("[id='LC_DISPATCH_SUB.LCDISPATCHSUB_PERFORAWARD_4526_"+num+"']").attr("readonly",false);
xx.find("[id='LC_DISPATCH_SUB.LCDISPATCHSUB_PERFORAWARD_4526_"+num+"']").css("display","inline");
xx.find("[id='LC_DISPATCH_SUB.LCDISPATCHSUB_PERFORAWARD_4526_"+num+"']").attr("class","form-control");
xx.find("[id='LC_DISPATCH_SUB.LCDISPATCHSUB_PERFORFEST_4526_"+num+"']").attr("readonly",false);
xx.find("[id='LC_DISPATCH_SUB.LCDISPATCHSUB_PERFORFEST_4526_"+num+"']").css("display","inline");
xx.find("[id='LC_DISPATCH_SUB.LCDISPATCHSUB_PERFORFEST_4526_"+num+"']").attr("class","form-control");
xx.find("[id='LC_DISPATCH_SUB.LCDISPATCHSUB_SUBTOTAL_4526_"+num+"']").attr("readonly",false);
xx.find("[id='LC_DISPATCH_SUB.LCDISPATCHSUB_SUBTOTAL_4526_"+num+"']").css("display","inline");
xx.find("[id='LC_DISPATCH_SUB.LCDISPATCHSUB_SUBTOTAL_4526_"+num+"']").attr("class","form-control");
		var pid = xx.attr("id");
		elementsListSelectInitFunction(e);
		cardAndCardDateWidInitFunction(e);
$("#"+x).find("[id='LC_DISPATCH_SUB.LCDISPATCHSUB_EMPID_4526_"+num+"_select']").selectpicker('val', EMPID_value);
$("#"+x).find("[id='LC_DISPATCH_SUB.LCDISPATCHSUB_COMPID_4526_"+num+"_select']").val(COMPID_value);
$("#"+x).find("[id='LC_DISPATCH_SUB.LCDISPATCHSUB_DEPID_4526_"+num+"_select']").val(DEPID_value);
$("#"+x).find("[id='LC_DISPATCH_SUB.LCDISPATCHSUB_JOBID_4526_"+num+"_select']").val(JOBID_value);
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
			data:grid_LC_DISPATCH_SUB_LIST_fun(xx),//HTTP请求类型
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
			data:grid_LC_DISPATCH_SUB_LIST_funx(xx),//HTTP请求类型
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
	 
	 function loadDataStart3ForGrid(e){
		 if(e=='fubiao1'){
			 $.ajax({
				url: "/myehr/form/cardformInitData.action",
				type: 'post',
				data:grid_LC_DISPATCH_SUB_LIST_funx(xx),//HTTP请求类型
				contentType: 'application/json;charset=utf-8',
				cache: false,
				async: false,
				success: function (data) {
					Currentpage01++;
					var arr=data;
					showDate_3864ForGrid(arr,e);
				  }
			});
		 }
		}
	 
function loadDataStart4(e){
	 if(e=='fubiao1'){
		 $.ajax({
			url: "/myehr/form/cardformInitData.action",
			type: 'post',
			data:grid_LC_DISPATCH_SUB_LIST_funx(xx),//HTTP请求类型
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

function loadDataStart4ForGrid(e){
	 if(e=='fubiao1'){
		 $.ajax({
			url: "/myehr/form/cardformInitData.action",
			type: 'post',
			data:grid_LC_DISPATCH_SUB_LIST_funx(xx),//HTTP请求类型
			contentType: 'application/json;charset=utf-8',
			cache: false,
			async: false,
			success: function (data) {
				Currentpage01++;
				var arr=data;
				showAccount(arr,e);
			  }
		});
	}
}

function grid_LC_DISPATCH_SUB_LIST_fun(pageReqeust){
	var _filterdata={};
	var paramsMap = {};
	var requestParam={};
requestParam = {LCDISPATCH_ID:LCDISPATCH_ID_parameter};
	pageReqeust.containerParam=containerParam_4526;
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.userIds=param_empIds;
	pageReqeust.formId=_formId_4526;
	pageReqeust.isView=null;
	pageReqeust.offset=Currentpage11*pagesize11;;
	pageReqeust.limit=pagesize11;;
	if(heightGadedata_4526!=null&&heightGadedata_4526!=undefined){
		pageReqeust.heightGrade = heightGadedata_4526;
	}
	queryParams = JSON.stringify(pageReqeust);
	return queryParams;
}
function grid_LC_DISPATCH_SUB_LIST_funx(pageReqeust){
	var _filterdata={};
	var paramsMap = {};
	var requestParam={};
    requestParam = {LCDISPATCH_ID:LCDISPATCH_ID_parameter};
	pageReqeust.containerParam=containerParam_4526;
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.userIds=param_empIds;
	pageReqeust.formId=_formId_4526;
	pageReqeust.isView=null;
	pageReqeust.offset=Currentpage21*pagesize21;;
	pageReqeust.limit=pagesize21;;
	if(heightGadedata_4526!=null&&heightGadedata_4526!=undefined){
		pageReqeust.heightGrade = heightGadedata_4526;
	}
	queryParams = JSON.stringify(pageReqeust);
	return queryParams;
}
	 function initAddValue(e,num){
	 if(e=='fubiao1'){
	 	num--;
		var obj = $("#newElement"+num);
		var value = LCDISPATCH_ID_parameter;
var obj0 = obj.find("[name='LCDISPATCHSUB_SEQID']");
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
	}
