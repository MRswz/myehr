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
function submitButton_save_6093(){
	var paramsMap = {};
	var _param = {};
	var hzsParam = [];
	_param.formId=formId_main;
	_param = cardGetdata_main('#submitButton_main',formId_main);
	_param.buttonId='6093';
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
submitButton_refer_6093();
	}
}
function submitButton_refer_6093(){
			var paramsMap = {};
			var _param = {};
			paramsMap.bussinessId = BUSSINESSID_ACT;
			_param.formId=formId_main;
			_param = cardGetdata_main_act('#submitButton_main',formId_main);
			_param.buttonId='6093';
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
						return ;
					}else {
						alert("操作失败");
						return ;
					}
				}
			});
		}
function approved_save_6094(){
	var paramsMap = {};
	var _param = {};
	var hzsParam = [];
	_param.formId=formId_main;
	_param = cardGetdata_main('#submitButton_main',formId_main);
	_param.buttonId='6094';
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
function approved_refer_6094(buttonType){
	if(checkedPointRequire()){
		if(buttonType=='通过'){
			if(!approved_save_6094()){
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
			if(!approved_save_6094()){
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
				approved_refer2_6094(buttonType,approveRemark,rejectType);
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
function approved_refer2_6094(buttonType,approveRemark,rejectType){
    var flowAction = param_flowAction;
    if(flowAction=='start'){
	    var paramsMap = {};
	    var _param = {};
	    _param.formId=formId_main;
	    _param =  cardGetdata_main_act('#submitButton_main',formId_main);
	    _param.buttonId='6094';
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
	     _param.buttonId='6094';
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
function approved_save_6095(){
	var paramsMap = {};
	var _param = {};
	var hzsParam = [];
	_param.formId=formId_main;
	_param = cardGetdata_main('#submitButton_main',formId_main);
	_param.buttonId='6095';
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
function approved_refer_6095(buttonType){
	if(checkedPointRequire()){
		if(buttonType=='通过'){
			if(!approved_save_6095()){
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
			if(!approved_save_6095()){
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
				approved_refer2_6095(buttonType,approveRemark,rejectType);
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
function approved_refer2_6095(buttonType,approveRemark,rejectType){
    var flowAction = param_flowAction;
    if(flowAction=='start'){
	    var paramsMap = {};
	    var _param = {};
	    _param.formId=formId_main;
	    _param =  cardGetdata_main_act('#submitButton_main',formId_main);
	    _param.buttonId='6095';
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
	     _param.buttonId='6095';
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
function temporaryStorage_save_6096(){
	var paramsMap = {};
	var _param = {};
	var hzsParam = [];
	_param.formId=formId_main;
	_param = cardGetdata_main('#submitButton_main',formId_main);
	_param.buttonId='6096';
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
	function LC_ENTRY_LCENTRY_WHETHER_valueChange_4420(e){

		var obj= $('[id="LC_ENTRY.LCENTRY_WHETHER_4420"]');
var val=obj.val();
if(val== 1){
  $('[id="LC_ENTRY.LCENTRY_DEPARTURE_4420"]').next().next().after("<span>*</span>");
  $('[id="LC_ENTRY.LCENTRY_DEPARTURE_4420"]').next().next().next().css({"color":"red","line-height":"35px","font-size":"27px"});
  $('[id="LC_ENTRY.LCENTRY_DEPARTURE_4420"]').attr("required","true");
  $('[id="LC_ENTRY.LCENTRY_RETURNDATE_4420"]').next().next().after("<span>*</span>");
  $('[id="LC_ENTRY.LCENTRY_RETURNDATE_4420"]').next().next().next().css({"color":"red","line-height":"35px","font-size":"27px"});
  $('[id="LC_ENTRY.LCENTRY_RETURNDATE_4420"]').attr("required","true");
  $('[id="LC_ENTRY.LCENTRY_DISCIPLINE_4420"]').prev().before("<div style='border:2px solid #F2F2F2;'><p>1、严格执行出国（境）任务批件批准的内容，不得擅自延长在外停留时间；未经批准不得变更出访路线，不得随意删减事先商定的公务活动； 不得参加与出国任务无关的活动和会议。</p>"+ 
"<p>2、严格执行请示汇报制度，不得随意单独行动。</p>"+ 
"<p>3、严禁出入赌博、色情等不正当场所。</p>"+ 
"<p>4、不得参加涉及低级趣味的娱乐游览项目；不得违反规定收送礼品。</p>"+ 
"<p>5、谦虚谨慎，尊重各国风俗习惯；言谈有分寸，不做任何不利于国家和单位的事，不说任何不利于国家和单位的话。</p>"+ 
"<p>6、未经批准，不得携带涉密载体，不得对外提供内部文件和资料，不得泄露内部部署和决策。</p>"+ 
"<p>7、不在非保密场所谈论涉密事项，不得泄露国家秘密和商业秘密。</p>"+ 
"<p>8、在外期间避免与可疑人员接触，拒收任何可疑信函和物品，增强防盗、防抢、防诈骗的自我保护意识。</p>"+ 
"<p>9、必须忠于祖国，自觉维护国家主权、国家形象和民族尊严。</p>"+ 
"<p>10、遵守目的国（境）法律法规和出入境携带外汇、物品的限制性规定。</p>"+ 
"<p>11、重视社交礼节，注重仪容服饰，尊重当地风俗习惯和禁忌，行动要符合身份，言论要有分寸，礼貌要合乎常规，态度要大方稳重。</p>"+ 
"<p>12、不要在限制地点拍照、吸烟、大声喧哗。</p></div>");
}else{
  $('[id="LC_ENTRY.LCENTRY_DEPARTURE_4420"]').next().next().next().remove();
  $('[id="LC_ENTRY.LCENTRY_RETURNDATE_4420"]').next().next().next().remove();
  $('[id="LC_ENTRY.LCENTRY_DISCIPLINE_4420"]').prev().prev().remove();
}
	}
	 function addFunction(e){
changeCssForApp4();
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
  '			<label style="float:left;font-size:14px;width:100px;line-height:25px">附件: </label>'+
  '			<input id="LC_ENCLOSURE.LCENCLOSURE_AAA_4578_'+i+'" name="LCENCLOSURE_AAA" dataType="text" class="CCReadText"  value="'+LCENCLOSURE_AAA+'" type="text" readonly oninput="myFunction(this,\'LCENCLOSURE_AAA\')"   style="width:200px;height:25px;padding:0;border:none;background-color:#fff"/>'+
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
  '			<label style="float:left;font-size:14px;width:100px;line-height:25px">附件: </label>'+
  '			<input id="LC_ENCLOSURE.LCENCLOSURE_AAA_4578_'+i+'" name="LCENCLOSURE_AAA" dataType="text" class="CCReadText"  value="'+LCENCLOSURE_AAA+'" type="text" readonly oninput="myFunction(this,\'LCENCLOSURE_AAA\')"   style="width:200px;height:25px;padding:0;border:none;background-color:#fff"/>'+
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
xx.find("[id='LC_ENCLOSURE.LCENCLOSURE_AAA_4578_"+num+"']").attr("readonly",false);
xx.find("[id='LC_ENCLOSURE.LCENCLOSURE_AAA_4578_"+num+"']").css("display","inline");
xx.find("[id='LC_ENCLOSURE.LCENCLOSURE_AAA_4578_"+num+"']").attr("class","form-control");
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
	}
