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
function submitButton_save_6074(){
	var paramsMap = {};
	var _param = {};
	var hzsParam = [];
	_param.formId=formId_main;
	_param = cardGetdata_main('#submitButton_main',formId_main);
	_param.buttonId='6074';
	_param.paramsMap = paramsMap;
	if(checkNull($("#MainElement").find("form"))){
		layer.close(indexApprove);
		return true;
	}else{
	var signstr = JSON.stringify(_param);
	var rule ='"' ;
	var regS = new RegExp(rule,'g');
	var rule2 =':' ;
	var regS2 = new RegExp(rule2,'g');
	signstr = signstr.replace(regS, '');
	signstr = signstr.replace(regS2, '=');
	var sign = md5(signstr);
		$.ajax({
			url:'/myehr/form/saveButtonSave.action?sign='+sign,
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
				url:'/myehr/form/hzAction.action?sign='+sign,
				type:'post',
				data: JSON.stringify(_param),
				cache: false,
				async: false,
				contentType: 'application/json;charset=utf-8',
				success: function (text) {
				}
			});
		}
submitButton_refer_6074();
}
}
function submitButton_refer_6074(){
			var paramsMap = {};
			var _param = {};
			paramsMap.bussinessId = BUSSINESSID_ACT;
			_param.formId=formId_main;
			_param = cardGetdata_main_act('#submitButton_main',formId_main);
			_param.buttonId='6074';
			_param.paramsMap = paramsMap;
			_param.actFlowParams= {key:param_key};
			$.ajax({
				url:'/myehr/act/task/start.action',
				data: JSON.stringify(_param),
				contentType: 'application/json;charset=utf-8',
				type:'post',
				cache: false,
				async: false,
				success: function (text) {
					save_act_title();
					if(text[0]==0){
						layer.open({
	    					content: '保存成功',
	    					btn: '确定'
						});
						param_procInsId = text[1];
					 	updateFiles();
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
function approved_save_6075(){
	var paramsMap = {};
	var _param = {};
	var hzsParam = [];
	_param.formId=formId_main;
	_param = cardGetdata_main('#submitButton_main',formId_main);
	_param.buttonId='6075';
	_param.paramsMap = paramsMap;
	if(checkNull($("#MainElement").find("form"))){
		return true;
	}else{
	var signstr = JSON.stringify(_param);
	var rule ='"' ;
	var regS = new RegExp(rule,'g');
	var rule2 =':' ;
	var regS2 = new RegExp(rule2,'g');
	signstr = signstr.replace(regS, '');
	signstr = signstr.replace(regS2, '=');
	var sign = md5(signstr);
		$.ajax({
			url:'/myehr/form/saveButtonSave.action?sign='+sign,
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
				url:'/myehr/form/hzAction.action?sign='+sign,
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
function approved_refer_6075(buttonType){
	if(checkedPointRequire()){
		if(buttonType=='通过'){
			if(!approved_save_6075()){
				var approveRemark=document.getElementById("approveRemark").value;
				var rejectType;
				approved_refer2_6075(buttonType,approveRemark,rejectType);
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
			if(!approved_save_6075()){
				getHisTask();
				var datas = hisTask;
				content = "<select id='shenpi2' title='通过意见' name='shenpi' style='width:90%;height:40px;margin-bottom:20px' class='form-control SHENPIYIJIANS' emptytext='' datafield1='dict' required='true' shownullitem='true' dictname='FinalRejection' datafield1='dict' onchange='writeYiJian(this)'></select><div style='margin-bottom:10px;width:90%'>驳回方式<select class='form-control' id='rejectType' style='height:40px'>";
				content+= "<option class='form-control' value ='previousNode'>驳回到上节点</option>";
				content+= "<option class='form-control' value ='startUser'>驳回到申请人</option>";
				content+= "</select></div>";
				content += "<div style='margin-bottom:10px;width:90%;'>驳回节点<select id='rejectNode' class='form-control' style='height:40px'>";
				for(var i=0;i<datas.length;i++){
					content+="<option  class='form-control' value ='"+datas[i].taskId+"'>"+datas[i].ACTNAME+"</option>";
				}
				content+="</select></div>";
				layer.open({
					title:'请选择驳回对象',
					content: content,
					btn: ['确定', '取消'],
					success: function(layero, index){
						initSelectForShenPi(buttonType);
						if(buttonType=='驳回'){
							$(".layui-m-layercont").css('padding','0 30px 20px 30px');
						}
					},
					yes:function(index, layero){
						var approveRemark=document.getElementById("approveRemark").value;
						var rejectType;
						if(buttonType=='驳回'){
							rejectType=document.getElementById("rejectType").value;
						}
						layer.close(index);
						approved_refer2_6075(buttonType,approveRemark,rejectType);
					},
				})
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
			approved_refer2_6075(buttonType,'','');
			return;
		}
		
	}else{
		layer.alert('有必选的指标未勾选', {
  		  	  offset:'50%',
		      shift: 6,
			  icon: 5,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
			  skin: 'layer-ext-moon' 
			})
	}
}
function approved_refer2_6075(buttonType,approveRemark,rejectType){
    	 var flowAction = param_flowAction;
	     var paramsMap = {};
	     var _param = {};
	     _param.formId=formId_main;
	     _param =  cardGetdata_main('#submitButton_main',formId_main);
	     _param.buttonId='6075';
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
			     }else if(text[0]=='000000'){
				     alert("操作成功");
					 updateFiles();
			     }
		     }
	     });
}
function approved_save_6076(){
	var paramsMap = {};
	var _param = {};
	var hzsParam = [];
	_param.formId=formId_main;
	_param = cardGetdata_main('#submitButton_main',formId_main);
	_param.buttonId='6076';
	_param.paramsMap = paramsMap;
	if(checkNull($("#MainElement").find("form"))){
		return true;
	}else{
	var signstr = JSON.stringify(_param);
	var rule ='"' ;
	var regS = new RegExp(rule,'g');
	var rule2 =':' ;
	var regS2 = new RegExp(rule2,'g');
	signstr = signstr.replace(regS, '');
	signstr = signstr.replace(regS2, '=');
	var sign = md5(signstr);
		$.ajax({
			url:'/myehr/form/saveButtonSave.action?sign='+sign,
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
				url:'/myehr/form/hzAction.action?sign='+sign,
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
function approved_refer_6076(buttonType){
	if(checkedPointRequire()){
		if(buttonType=='通过'){
			if(!approved_save_6076()){
				content = "<select id='shenpi1' title='通过意见' name='shenpi' style='width:90%;height:40px;margin-bottom:20px' class='form-control SHENPIYIJIANS' emptytext='' datafield1='dict' required='true' shownullitem='true' dictname='approvalopinion' datafield1='dict' onchange='writeYiJian(this)'></select><textarea id='approveRemark' class='SHENPIYIJIANC form-control' rows='7' style='width:90%;' ></textarea>";
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
			if(!approved_save_6076()){
				getHisTask();
				var datas = hisTask;
				content = "<select id='shenpi2' title='通过意见' name='shenpi' style='width:90%;height:40px;margin-bottom:20px' class='form-control SHENPIYIJIANS' emptytext='' datafield1='dict' required='true' shownullitem='true' dictname='FinalRejection' datafield1='dict' onchange='writeYiJian(this)'></select><div style='margin-bottom:10px;width:90%'>驳回方式<select class='form-control' id='rejectType' style='height:40px'>";
				content+= "<option class='form-control' value ='previousNode'>驳回到上节点</option>";
				content+= "<option class='form-control' value ='startUser'>驳回到申请人</option>";
				content+= "</select></div>";
				content += "<div style='margin-bottom:10px;width:90%;'>驳回节点<select id='rejectNode' class='form-control' style='height:40px'>";
				for(var i=0;i<datas.length;i++){
					content+="<option  class='form-control' value ='"+datas[i].taskId+"'>"+datas[i].ACTNAME+"</option>";
				}
				content+="</select></div>";
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
			approved_refer2_6076(buttonType,'','');
			return;
		}
		layer.open({
			title:'请填写审批意见',
			content: content,
			btn: ['确定', '取消'],
			success: function(layero, index){
				initSelectForShenPi(buttonType);
				if(buttonType=='驳回'){
					$(".layui-m-layercont").css('padding','0 30px 20px 30px');
				}
			},
			yes:function(index, layero){
				var approveRemark=document.getElementById("approveRemark").value;
				var rejectType;
				if(buttonType=='驳回'){
					rejectType=document.getElementById("rejectType").value;
				}
				layer.close(index);
				approved_refer2_6076(buttonType,approveRemark,rejectType);
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
function approved_refer2_6076(buttonType,approveRemark,rejectType){
    	 var flowAction = param_flowAction;
	     var paramsMap = {};
	     var _param = {};
	     _param.formId=formId_main;
	     _param =  cardGetdata_main('#submitButton_main',formId_main);
	     _param.buttonId='6076';
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
			     }else if(text[0]=='000000'){
				     alert("操作成功");
					 updateFiles();
			     }
		     }
	     });
}
function temporaryStorage_save_6077(){
	var paramsMap = {};
	var _param = {};
	var hzsParam = [];
	_param.formId=formId_main;
	_param = cardGetdata_main('#submitButton_main',formId_main);
	_param.buttonId='6077';
	_param.paramsMap = paramsMap;
	if(checkNull($("#MainElement").find("form"))){
		return true;
	}else{
	var signstr = JSON.stringify(_param);
	var rule ='"' ;
	var regS = new RegExp(rule,'g');
	var rule2 =':' ;
	var regS2 = new RegExp(rule2,'g');
	signstr = signstr.replace(regS, '');
	signstr = signstr.replace(regS2, '=');
	var sign = md5(signstr);
		$.ajax({
			url:'/myehr/form/saveButtonSave.action?sign='+sign,
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
	function LC_LEAVE_LCLEAVE_XVALUE_valueChange_4384(e){

		var type = $('[id="LC_LEAVE.LCLEAVE_LEAVETYPE_4384"]').val();
var vluse = $('[id="LC_LEAVE.LCLEAVE_XVALUE_4384"]').val();
type=parseInt(type);
vluse=parseInt(vluse);
if(type==18 || type==19){
	var sql1="SELECT amount AS A1 FROM ATTEND_EMPLEAVEBLANCE WHERE leavetype="+type; 
  	var i1=myehr_SQLFORBID_sql(sql1);
  	if(i1[0].A1<vluse){
  		$('[id="LC_LEAVE.LCLEAVE_XVALUE_4384"]').html("");
  		alert("所余下的存假不够本次请假 ！");
  	}
}
	}
	 function addFunction(e){
	 if(e=='fubiao1'){
		 var cellObj = '';
		 cellObj +=	'<div name="fubiaoElement" class="col-md-12 col-sm-12 col-lg-12" id="newElement'+newElementNum+'">'+
					'    <div class="contact-box CCAdd CCD_ADD">'+
					'<form class="row cell add_element" style="padding-right:50px">';
		 cellObj += '	<span class="fa fa-trash-o deleteButton CCD_DELET_BUTTON" onclick="removeElement('+newElementNum+')"></span>'+
					'	<span class="fa fa-save saveButton CCD_SAVE_BUTTON" onclick="saveElement(this,\'4578\')"></span>'+
  '	<input id="LC_ENCLOSURE.LCENCLOSURE_ID_4578" name="LCENCLOSURE_ID"   type="hidden" >'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12 CCM_COL" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">附件: </label>'+
  '			<input id="LC_ENCLOSURE.LCENCLOSURE_AAA_4578_add_'+newElementNum+'" name="LCENCLOSURE_AAA" dataType="text" type="text" class="form-control CCM_INPUT" oninput="myFunction(this,\'LCENCLOSURE_AAA\')"  vtype="illegalChar;maxLength:200;minLength:null;"  style="width:200px;height:;" />'+
  '			<span style="color:red;" class="CC_REQUMARK" ></span>'+
  '		</div>'+
  '	</div>'+
  '	<input id="LC_ENCLOSURE.LCENCLOSURE_BBB_4578" name="LCENCLOSURE_BBB"   type="hidden" >'+
  '	<input id="LC_ENCLOSURE.LCENCLOSURE_CCC_4578" name="LCENCLOSURE_CCC"   type="hidden" >'+
  '	<input id="LC_ENCLOSURE.LCENCLOSURE_DDD_4578" name="LCENCLOSURE_DDD"   type="hidden" >'+
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
	changeCssForApp1();
}
	 function showDate_3863(arr,total,e){
	 if(e=='fubiao1'){
		 var cellObj = '';
		 for (var i = arr.length - 1; i >= 0; i--) {
var LCENCLOSURE_ID = '';
if(arr.length>0&&arr[i].LCENCLOSURE_ID!=null){
LCENCLOSURE_ID = arr[i].LCENCLOSURE_ID;
}
var LCENCLOSURE_AAA = '';
if(arr.length>0&&arr[i].LCENCLOSURE_AAA!=null){
LCENCLOSURE_AAA = arr[i].LCENCLOSURE_AAA;
}
var LCENCLOSURE_BBB = '';
if(arr.length>0&&arr[i].LCENCLOSURE_BBB!=null){
LCENCLOSURE_BBB = arr[i].LCENCLOSURE_BBB;
}
var LCENCLOSURE_CCC = '';
if(arr.length>0&&arr[i].LCENCLOSURE_CCC!=null){
LCENCLOSURE_CCC = arr[i].LCENCLOSURE_CCC;
}
var LCENCLOSURE_DDD = '';
if(arr.length>0&&arr[i].LCENCLOSURE_DDD!=null){
LCENCLOSURE_DDD = arr[i].LCENCLOSURE_DDD;
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
  '	<input id="LC_ENCLOSURE.LCENCLOSURE_ID_4578" name="LCENCLOSURE_ID" value="'+LCENCLOSURE_ID+'"  type="hidden" >'+
  '	<input id="LC_ENCLOSURE.LCENCLOSURE_BBB_4578" name="LCENCLOSURE_BBB" value="'+LCENCLOSURE_BBB+'"  type="hidden" >'+
  '	<input id="LC_ENCLOSURE.LCENCLOSURE_CCC_4578" name="LCENCLOSURE_CCC" value="'+LCENCLOSURE_CCC+'"  type="hidden" >'+
  '	<input id="LC_ENCLOSURE.LCENCLOSURE_DDD_4578" name="LCENCLOSURE_DDD" value="'+LCENCLOSURE_DDD+'"  type="hidden" >'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label class="CCM_LABEL">附件: </label>'+
  '			<input id="LC_ENCLOSURE.LCENCLOSURE_AAA_4578_'+i+'" name="LCENCLOSURE_AAA" dataType="text" class="CCReadText"  value="'+LCENCLOSURE_AAA+'" type="text" readonly oninput="myFunction(this,\'LCENCLOSURE_AAA\')"   style="width:200px;height:25px;padding:0;border:none;background-color:#fff"/>'+
  '			<span style="color:red;" class="CC_REQUMARK" ></span>'+
  '		</div>'+
  '	</div>'+
							'		</div>'+
							'	</div>'+
							'</div>';
			}
	$("#"+e).find("[id='TEST_FEE_INFO_FORM']").html(cellObj);
}
	changeCssForApp1();
}
	 var newElementNum = 0;
	 function showDate_3864(arr,total,e){
	 if(e=='fubiao1'){
		 var cellObj = '';
		 if(arr.length>0){
		 for (var i = arr.length - 1; i >= 0; i--) {
var LCENCLOSURE_ID = '';
if(arr.length>0&&arr[i].LCENCLOSURE_ID!=null){
LCENCLOSURE_ID = arr[i].LCENCLOSURE_ID;
}
var LCENCLOSURE_AAA = '';
if(arr.length>0&&arr[i].LCENCLOSURE_AAA!=null){
LCENCLOSURE_AAA = arr[i].LCENCLOSURE_AAA;
}
var LCENCLOSURE_BBB = '';
if(arr.length>0&&arr[i].LCENCLOSURE_BBB!=null){
LCENCLOSURE_BBB = arr[i].LCENCLOSURE_BBB;
}
var LCENCLOSURE_CCC = '';
if(arr.length>0&&arr[i].LCENCLOSURE_CCC!=null){
LCENCLOSURE_CCC = arr[i].LCENCLOSURE_CCC;
}
var LCENCLOSURE_DDD = '';
if(arr.length>0&&arr[i].LCENCLOSURE_DDD!=null){
LCENCLOSURE_DDD = arr[i].LCENCLOSURE_DDD;
}
			cellObj += 		'<div class="col-md-12 col-sm-12 col-lg-12" name="fubiaoElement" >'+
							'    <div class="contact-box" style="min-height:110px">'+
							'		<form class="row cell" style="padding-right:50px">'+
							'		<span class="fa fa-trash-o deleteButton" id="deleteButton_'+i+'" title="删除" style="position: absolute;right: 30px;font-size: 25px;top: 5px;" onclick="deleteElement(this,\'4578\')"></span>'+
							'		<span class="fa fa-save saveButton" id="saveButton_'+i+'" title="保存" style="position: absolute;right: 29px;font-size: 25px;top: 40px;" onclick="saveElement(this,\'4578\')"></span>'+
							'		<span class="fa fa-edit updateButton" id="updateButton_'+i+'" title="修改" style="position: absolute;right: 25px;font-size: 25px;top: 77px;" onclick="updateElement(this,\''+i+'\',\''+e+'\')"></span>'+
  '	<input id="LC_ENCLOSURE.LCENCLOSURE_ID_4578" name="LCENCLOSURE_ID" value="'+LCENCLOSURE_ID+'"  type="hidden" >'+
  '	<input id="LC_ENCLOSURE.LCENCLOSURE_BBB_4578" name="LCENCLOSURE_BBB" value="'+LCENCLOSURE_BBB+'"  type="hidden" >'+
  '	<input id="LC_ENCLOSURE.LCENCLOSURE_CCC_4578" name="LCENCLOSURE_CCC" value="'+LCENCLOSURE_CCC+'"  type="hidden" >'+
  '	<input id="LC_ENCLOSURE.LCENCLOSURE_DDD_4578" name="LCENCLOSURE_DDD" value="'+LCENCLOSURE_DDD+'"  type="hidden" >'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label class="CCM_LABEL">附件: </label>'+
  '			<input id="LC_ENCLOSURE.LCENCLOSURE_AAA_4578_'+i+'" name="LCENCLOSURE_AAA" dataType="text" class="CCReadText"  value="'+LCENCLOSURE_AAA+'" type="text" readonly oninput="myFunction(this,\'LCENCLOSURE_AAA\')"   style="width:200px;height:25px;padding:0;border:none;background-color:#fff"/>'+
  '			<span style="color:red;" class="CC_REQUMARK" ></span>'+
  '		</div>'+
  '	</div>'+
							'		</form>'+
							'	</div>'+
							'</div>';
	}
		 }
	$("#"+e).find("[id='TEST_FEE_INFO_FORM2']").html(cellObj);
}
	changeCssForApp1();
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
	changeCssForApp1();
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
xx.find("[id='LC_ENCLOSURE.LCENCLOSURE_AAA_4578_"+num+"']").attr("readonly",false);
xx.find("[id='LC_ENCLOSURE.LCENCLOSURE_AAA_4578_"+num+"']").css("display","inline");
xx.find("[id='LC_ENCLOSURE.LCENCLOSURE_AAA_4578_"+num+"']").attr("class","form-control");
		var pid = xx.attr("id");
		elementsListSelectInitFunction(e);
		cardAndCardDateWidInitFunction(e);
}
changeCssForApp3();
console.timeEnd('updateElementJs');
	changeCssForApp1();
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
			data:grid_LC_ENCLOSURE_LIST_fun(xx),//HTTP请求类型
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
	changeCssForApp1();
}
	 function loadDataStart3(e){
	 if(e=='fubiao1'){
		 $.ajax({
			url: "/myehr/form/cardformInitData.action",
			type: 'post',
			data:grid_LC_ENCLOSURE_LIST_funx(xx),//HTTP请求类型
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
	changeCssForApp1();
}
	 function loadDataStart4(e){
	 if(e=='fubiao1'){
		 $.ajax({
			url: "/myehr/form/cardformInitData.action",
			type: 'post',
			data:grid_LC_ENCLOSURE_LIST_funx(xx),//HTTP请求类型
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
	changeCssForApp1();
}
function grid_LC_ENCLOSURE_LIST_fun(pageReqeust){
	var _filterdata={};
	var paramsMap = {};
	var requestParam={};
		requestParam = {};
	pageReqeust.containerParam=containerParam_4578;
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.userIds=param_empIds;
	pageReqeust.formId=_formId_4578;
	pageReqeust.isView=null;
	pageReqeust.offset=Currentpage11*pagesize11;;
	pageReqeust.limit=pagesize11;;
	if(heightGadedata_4578!=null&&heightGadedata_4578!=undefined){
		pageReqeust.heightGrade = heightGadedata_4578;
	}
	queryParams = JSON.stringify(pageReqeust);
	return queryParams;
}
function grid_LC_ENCLOSURE_LIST_funx(pageReqeust){
	var _filterdata={};
	var paramsMap = {};
	var requestParam={};
		requestParam = {};
	pageReqeust.containerParam=containerParam_4578;
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.userIds=param_empIds;
	pageReqeust.formId=_formId_4578;
	pageReqeust.isView=null;
	pageReqeust.offset=Currentpage21*pagesize21;;
	pageReqeust.limit=pagesize21;;
	if(heightGadedata_4578!=null&&heightGadedata_4578!=undefined){
		pageReqeust.heightGrade = heightGadedata_4578;
	}
	queryParams = JSON.stringify(pageReqeust);
	return queryParams;
}
	 function initAddValue(e,num){
	 if(e=='fubiao1'){
	 	num--;
		var obj = $("#newElement"+num);
	 }
	changeCssForApp1();
}
