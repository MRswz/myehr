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
var filterParam = {};
var queryParams;
function grid_TEST_INFO_FORM_fun(pageReqeust){
	var _filterdata={};
	if(document.getElementById('grid_TEST_INFO_FORM_filter')){
	}
	var paramsMap = {};
	var requestParam={};
	if('${param.CNAME}'==''&&'parameter'=='parameter'){
		if(CNAME==undefined){
			requestParam = {CNAME:'${param.CNAME}'};
		}else{
			requestParam = {CNAME:CNAME+""};
		}
	}else{
		requestParam = {CNAME:'${param.CNAME}'};
	}
	pageReqeust.containerParam=containerParam_3862;
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.userIds='${param.empIds}';
	pageReqeust.formId=_formId_3862;
	pageReqeust.isView=null;
	pageReqeust.offset=Currentpage*pagesize;;
	pageReqeust.limit=pagesize;;
	if(heightGadedata_3862!=null&&heightGadedata_3862!=undefined){
		pageReqeust.heightGrade = heightGadedata_3862;
	}
	queryParams = JSON.stringify(pageReqeust);
	return queryParams;
}
function grid_TEST_INFO_FORM_fun11_3862(){
	loadDataStart();
}
	 function addFunction(e){
	 if(e=='fubiao1'){
		 var cellObj = '';
		 cellObj +=	'<div class="col-md-12 col-sm-12 col-lg-12" id="newElement'+newElementNum+'">'+
					'    <div class="contact-box">'+
					'<form class="row cell add_element" style="padding-right:50px">';
		 cellObj += '	<span class="fa fa-trash-o deleteButton" style="position: absolute;right: 30px;font-size: 25px" onclick="removeElement('+newElementNum+')"></span>'+
					'	<span class="fa fa-save saveButton" style="position: absolute;right: 30px;font-size: 25px;top:50px" onclick="saveElement(this,\'3863\')"></span>'+
  '	<input id="TEST_INFOR_SON_OF_FEE.TESTINFORSONOFFEE_id_3863" name="TESTINFORSONOFFEE_id"   type="hidden" >'+
  '	<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12" style="margin: 5px 0;height:25px">'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<lable style="float:left;font-size:14px;">关联人员: </lable>'+
  '			<input id="TEST_INFOR_SON_OF_FEE.TESTINFORSONOFFEE_person_id_3863_add_'+newElementNum+'" name="TESTINFORSONOFFEE_person_id" type="text" class="form-control" oninput="myFunction(this,\'TESTINFORSONOFFEE_person_id\')"  emptyText=""  vtype="illegalChar;maxLength:50;minLength:null;" illegalChar;maxLength:50;minLength:null;ErrorText=""  readonly="true"  style="float:left;height:25px;padding:0;border:none;background-color:#fff;width:120px"/>'+
  '			<span style="color:red;line-height:35px;font-size:27px"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12" style="margin: 5px 0;height:25px">'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<lable style="float:left;font-size:14px;">费用名: </lable>'+
  '			<select id="TEST_INFOR_SON_OF_FEE.TESTINFORSONOFFEE_fee_name_3863_add_'+newElementNum+'" title="费用名" styleType="select" name="TESTINFORSONOFFEE_fee_name"  class="form-control " style="float:left;height:25px;padding:0;border:none;background-color:#fff;width:120px"  emptyText=""  onchange="TEST_INFOR_SON_OF_FEE_TESTINFORSONOFFEE_fee_name_valueChange_3863(this)" style="float:left;" textField="dictName" valueField="dictId" DictName="feeType" dataField="dicts_form_70613"initParam = "_"></select>'+
  '			<span style="color:red;line-height:35px;font-size:27px"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12" style="margin: 5px 0;height:25px">'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<lable style="float:left;font-size:14px;">费用编码: </lable>'+
  '			<input id="TEST_INFOR_SON_OF_FEE.TESTINFORSONOFFEE_fee_code_3863_add_'+newElementNum+'" name="TESTINFORSONOFFEE_fee_code" type="text" class="form-control" oninput="myFunction(this,\'TESTINFORSONOFFEE_fee_code\')"  vtype="illegalChar;maxLength:50;minLength:null;"   style="float:left;height:25px;padding:0;border:none;background-color:#fff;width:120px"/>'+
  '			<span style="color:red;line-height:35px;font-size:27px"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12" style="margin: 5px 0;height:25px">'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<lable style="float:left;font-size:14px;">费用金额: </lable>'+
  '			<input id="TEST_INFOR_SON_OF_FEE.TESTINFORSONOFFEE_fee_value_3863_add_'+newElementNum+'" name="TESTINFORSONOFFEE_fee_value" type="number" class="form-control" oninput="myFunction(this,\'TESTINFORSONOFFEE_fee_value\')"  emptyText=""  vtype="int;illegalChar;maxLength:50;minLength:null;" int;illegalChar;maxLength:50;minLength:null;ErrorText=""  required="true"   style="float:left;height:25px;padding:0;border:none;background-color:#fff;width:120px"/>'+
  '			<span style="color:red;line-height:35px;font-size:27px"> * </span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12" style="margin: 5px 0;height:25px">'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<lable style="float:left;font-size:14px;">消费时间: </lable>'+
  '			<div class="controls input-append date form_date4 input-group" data-date=""  data-link-field="dtp_input2" data-link-format="yyyy-mm-dd" style="float:left;width: 134px;">'+
  '				<input style="width:134px;float:left;height:25px;padding:0;border:none;background-color:#fff;width:120px"type="text" readonly class="form-control " dateType="controls input-append date form_date4" id="TEST_INFOR_SON_OF_FEE.TESTINFORSONOFFEE_fee_time_3863_add_'+newElementNum+'" styleType="dateTime"   style="width:134px;float:left;border-radius: 4px 0 0 4px;" name="TESTINFORSONOFFEE_fee_time"  format="yyyy/MM/dd" valueformat="yyyy/MM/dd" />'+
	'				<span class="input-group-addon" style="padding:1px 10px 2px 10px;font-size:12px"><span class="glyphicon glyphicon-remove"></span></span>'+
  '				<span class="input-group-addon" style="padding:1px 10px 2px 10px;font-size:12px"><span class="glyphicon glyphicon-th"></span></span>'+
  '			</div>'+
  '			<span style="color:red;line-height:35px;font-size:27px"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12" style="margin: 5px 0;height:25px">'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<lable style="float:left;font-size:14px;">是否有效: </lable>'+
  '			<select id="TEST_INFOR_SON_OF_FEE.TESTINFORSONOFFEE_is_youxiao_3863_add_'+newElementNum+'" title="是否有效" styleType="select" name="TESTINFORSONOFFEE_is_youxiao"  class="form-control " style="float:left;height:25px;padding:0;border:none;background-color:#fff;width:120px"  emptyText=""  style="float:left;" textField="dictName" valueField="dictId" DictName="SYS_COMMON_YES_NO" dataField="dicts_form_70617"initParam = "_"></select>'+
  '			<span style="color:red;line-height:35px;font-size:27px"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12" style="margin: 5px 0;height:25px">'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<lable style="float:left;font-size:14px;">是否最新: </lable>'+
  '			<select id="TEST_INFOR_SON_OF_FEE.TESTINFORSONOFFEE_is_zuixin_3863_add_'+newElementNum+'" title="是否最新" styleType="select" name="TESTINFORSONOFFEE_is_zuixin"  class="form-control " style="float:left;height:25px;padding:0;border:none;background-color:#fff;width:120px"  emptyText=""  style="float:left;" textField="dictName" valueField="dictId" DictName="SYS_COMMON_YES_NO" dataField="dicts_form_70618"initParam = "_"></select>'+
  '			<span style="color:red;line-height:35px;font-size:27px"></span>'+
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
	 if(e=='fubiao2'){
		 var cellObj = '';
		 cellObj +=	'<div class="col-md-12 col-sm-12 col-lg-12" id="newElement'+newElementNum+'">'+
					'    <div class="contact-box">'+
					'<form class="row cell add_element" style="padding-right:50px">';
		 cellObj += '	<span class="fa fa-trash-o deleteButton" style="position: absolute;right: 30px;font-size: 25px" onclick="removeElement('+newElementNum+')"></span>'+
					'	<span class="fa fa-save saveButton" style="position: absolute;right: 30px;font-size: 25px;top:50px" onclick="saveElement(this,\'4059\')"></span>'+
  '	<input id="TEST_INFOR_SON_OF_SCORE.TESTINFORSONOFSCORE_id_4059" name="TESTINFORSONOFSCORE_id"   type="hidden" >'+
  '	<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12" style="margin: 5px 0;height:25px">'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<lable style="float:left;font-size:14px;">关联人员: </lable>'+
  '			<input id="TEST_INFOR_SON_OF_SCORE.TESTINFORSONOFSCORE_person_id_4059_add_'+newElementNum+'" name="TESTINFORSONOFSCORE_person_id" type="text" class="form-control" oninput="myFunction(this,\'TESTINFORSONOFSCORE_person_id\')"  vtype="illegalChar;maxLength:50;minLength:null;"   style="float:left;height:25px;padding:0;border:none;background-color:#fff;width:120px"/>'+
  '			<span style="color:red;line-height:35px;font-size:27px"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12" style="margin: 5px 0;height:25px">'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<lable style="float:left;font-size:14px;">考试名: </lable>'+
  '			<select id="TEST_INFOR_SON_OF_SCORE.TESTINFORSONOFSCORE_test_name_4059_add_'+newElementNum+'" title="考试名" styleType="select" name="TESTINFORSONOFSCORE_test_name"  class="form-control " style="float:left;height:25px;padding:0;border:none;background-color:#fff;width:120px"  emptyText=""  style="float:left;" textField="dictName" valueField="dictId" DictName="testScoreType" dataField="dicts_form_73608"initParam = "_"></select>'+
  '			<span style="color:red;line-height:35px;font-size:27px"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12" style="margin: 5px 0;height:25px">'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<lable style="float:left;font-size:14px;">平均分: </lable>'+
  '			<input id="TEST_INFOR_SON_OF_SCORE.TESTINFORSONOFSCORE_average_score_4059_add_'+newElementNum+'" name="TESTINFORSONOFSCORE_average_score" type="text" class="form-control" oninput="myFunction(this,\'TESTINFORSONOFSCORE_average_score\')"  vtype="illegalChar;maxLength:50;minLength:null;"   style="float:left;height:25px;padding:0;border:none;background-color:#fff;width:120px"/>'+
  '			<span style="color:red;line-height:35px;font-size:27px"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12" style="margin: 5px 0;height:25px">'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<lable style="float:left;font-size:14px;">得分: </lable>'+
  '			<input id="TEST_INFOR_SON_OF_SCORE.TESTINFORSONOFSCORE_test_score_4059_add_'+newElementNum+'" name="TESTINFORSONOFSCORE_test_score" type="text" class="form-control" oninput="myFunction(this,\'TESTINFORSONOFSCORE_test_score\')"  vtype="illegalChar;maxLength:50;minLength:null;"   style="float:left;height:25px;padding:0;border:none;background-color:#fff;width:120px"/>'+
  '			<span style="color:red;line-height:35px;font-size:27px"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12" style="margin: 5px 0;height:25px">'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<lable style="float:left;font-size:14px;">考试时间: </lable>'+
  '			<div class="controls input-append date form_date1 input-group" data-date=""  data-link-field="dtp_input2" data-link-format="yyyy-mm-dd" style="float:left;width: 134px;">'+
  '				<input style="width:134px;float:left;height:25px;padding:0;border:none;background-color:#fff;width:120px"type="text" readonly class="form-control " dateType="controls input-append date form_date1" id="TEST_INFOR_SON_OF_SCORE.TESTINFORSONOFSCORE_test_time_4059_add_'+newElementNum+'" styleType="dateTime"   style="width:134px;float:left;border-radius: 4px 0 0 4px;" name="TESTINFORSONOFSCORE_test_time"  format="yyyy-MM-dd" valueformat="yyyy-MM-dd" />'+
	'				<span class="input-group-addon" style="padding:1px 10px 2px 10px;font-size:12px"><span class="glyphicon glyphicon-remove"></span></span>'+
  '				<span class="input-group-addon" style="padding:1px 10px 2px 10px;font-size:12px"><span class="glyphicon glyphicon-th"></span></span>'+
  '			</div>'+
  '			<span style="color:red;line-height:35px;font-size:27px"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12" style="margin: 5px 0;height:25px">'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<lable style="float:left;font-size:14px;">是否有效: </lable>'+
  '			<select id="TEST_INFOR_SON_OF_SCORE.TESTINFORSONOFSCORE_is_youxiao_4059_add_'+newElementNum+'" title="是否有效" styleType="select" name="TESTINFORSONOFSCORE_is_youxiao"  class="form-control " style="float:left;height:25px;padding:0;border:none;background-color:#fff;width:120px"  emptyText=""  style="float:left;" textField="dictName" valueField="dictId" DictName="SYS_COMMON_YES_NO" dataField="dicts_form_73612"initParam = "_"></select>'+
  '			<span style="color:red;line-height:35px;font-size:27px"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12" style="margin: 5px 0;height:25px">'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<lable style="float:left;font-size:14px;">是否最新: </lable>'+
  '			<select id="TEST_INFOR_SON_OF_SCORE.TESTINFORSONOFSCORE_is_zuixin_4059_add_'+newElementNum+'" title="是否最新" styleType="select" name="TESTINFORSONOFSCORE_is_zuixin"  class="form-control " style="float:left;height:25px;padding:0;border:none;background-color:#fff;width:120px"  emptyText=""  style="float:left;" textField="dictName" valueField="dictId" DictName="SYS_COMMON_YES_NO" dataField="dicts_form_73613"initParam = "_"></select>'+
  '			<span style="color:red;line-height:35px;font-size:27px"></span>'+
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
	}
	 var newElementNum = 0;
	 function showDate_3863(arr,total,e){
	 if(e=='fubiao1'){
		 var cellObj = '';
		 for (var i = arr.length - 1; i >= 0; i--) {
var TESTINFORSONOFFEE_id = arr[i].TESTINFORSONOFFEE_id;
var TESTINFORSONOFFEE_person_id = arr[i].TESTINFORSONOFFEE_person_id;
var TESTINFORSONOFFEE_fee_name = arr[i].TESTINFORSONOFFEE_fee_name;
var TESTINFORSONOFFEE_fee_code = arr[i].TESTINFORSONOFFEE_fee_code;
var TESTINFORSONOFFEE_fee_value = arr[i].TESTINFORSONOFFEE_fee_value;
var TESTINFORSONOFFEE_fee_time = arr[i].TESTINFORSONOFFEE_fee_time;
TESTINFORSONOFFEE_fee_time = new Date(parseInt(TESTINFORSONOFFEE_fee_time)).Format("yyyy/MM/dd");var TESTINFORSONOFFEE_is_youxiao = arr[i].TESTINFORSONOFFEE_is_youxiao;
var TESTINFORSONOFFEE_is_zuixin = arr[i].TESTINFORSONOFFEE_is_zuixin;
			if(0 == Currentpage11){
				cellObj += '<span class="fa fa-arrow-circle-right" style="font-size:30px;padding-right:15px;float:right" onclick="next(\''+e+'\')"></span>';
			}else if(total-1==Currentpage11){
				cellObj += '<span class="fa fa-arrow-circle-left" style="font-size:30px;padding-right:15px;float:right" onclick="last(\''+e+'\')"></span>';
			}else{
				cellObj += '<span class="fa fa-arrow-circle-right" style="font-size:30px;padding-right:15px;float:right" onclick="next(\''+e+'\')"></span>'+
						   '<span class="fa fa-arrow-circle-left" style="font-size:30px;padding-right:15px;float:right" onclick="last(\''+e+'\')"></span>';
			}
			cellObj += 		'<div class="col-md-12 col-sm-12 col-lg-12">'+
							'    <div class="contact-box">'+
							'		<div class="row cell">'+
  '	<input id="TEST_INFOR_SON_OF_FEE.TESTINFORSONOFFEE_id_3863" name="TESTINFORSONOFFEE_id" value="'+TESTINFORSONOFFEE_id+'"  type="hidden" >'+
  '	<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12" style="margin: 5px 0;height:25px">'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<lable style="float:left;font-size:14px;line-height:25px;width:100px">关联人员: </lable>'+
  '			<input id="TEST_INFOR_SON_OF_FEE.TESTINFORSONOFFEE_person_id_3863_'+i+'" name="TESTINFORSONOFFEE_person_id" value="'+TESTINFORSONOFFEE_person_id+'" type="text" readonly oninput="myFunction(this,\'TESTINFORSONOFFEE_person_id\')"  readonly="true"  style="float:left;height:25px;padding:0;border:none;background-color:#fff;width:120px"/>'+
  '			<span style="color:red;line-height:35px;font-size:27px"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12" style="margin: 5px 0;height:25px">'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<lable style="float:left;font-size:14px;line-height:25px;width:100px">费用名: </lable>'+
  '			<input id="TEST_INFOR_SON_OF_FEE.TESTINFORSONOFFEE_fee_name_3863_'+i+'" name="TESTINFORSONOFFEE_fee_name" value="'+TESTINFORSONOFFEE_fee_name+'" type="text" readonly oninput="myFunction(this,\'TESTINFORSONOFFEE_fee_name\')"   style="float:left;height:25px;padding:0;border:none;background-color:#fff;width:120px"/>'+
  '			<span style="color:red;line-height:35px;font-size:27px"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12" style="margin: 5px 0;height:25px">'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<lable style="float:left;font-size:14px;line-height:25px;width:100px">费用编码: </lable>'+
  '			<input id="TEST_INFOR_SON_OF_FEE.TESTINFORSONOFFEE_fee_code_3863_'+i+'" name="TESTINFORSONOFFEE_fee_code" value="'+TESTINFORSONOFFEE_fee_code+'" type="text" readonly oninput="myFunction(this,\'TESTINFORSONOFFEE_fee_code\')"   style="float:left;height:25px;padding:0;border:none;background-color:#fff;width:120px"/>'+
  '			<span style="color:red;line-height:35px;font-size:27px"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12" style="margin: 5px 0;height:25px">'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<lable style="float:left;font-size:14px;line-height:25px;width:100px">费用金额: </lable>'+
  '			<input id="TEST_INFOR_SON_OF_FEE.TESTINFORSONOFFEE_fee_value_3863_'+i+'" name="TESTINFORSONOFFEE_fee_value" value="'+TESTINFORSONOFFEE_fee_value+'" type="text" readonly oninput="myFunction(this,\'TESTINFORSONOFFEE_fee_value\')"  required="true"   style="float:left;height:25px;padding:0;border:none;background-color:#fff;width:120px"/>'+
  '			<span style="color:red;line-height:35px;font-size:27px"> * </span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12" style="margin: 5px 0;height:25px">'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<lable style="float:left;font-size:14px;line-height:25px;width:100px">消费时间: </lable>'+
  '			<input id="TEST_INFOR_SON_OF_FEE.TESTINFORSONOFFEE_fee_time_3863_'+i+'" name="TESTINFORSONOFFEE_fee_time" value="'+TESTINFORSONOFFEE_fee_time+'" type="text" readonly oninput="myFunction(this,\'TESTINFORSONOFFEE_fee_time\')"   style="float:left;height:25px;padding:0;border:none;background-color:#fff;width:120px"/>'+
  '			<span style="color:red;line-height:35px;font-size:27px"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12" style="margin: 5px 0;height:25px">'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<lable style="float:left;font-size:14px;line-height:25px;width:100px">是否有效: </lable>'+
  '			<input id="TEST_INFOR_SON_OF_FEE.TESTINFORSONOFFEE_is_youxiao_3863_'+i+'" name="TESTINFORSONOFFEE_is_youxiao" value="'+TESTINFORSONOFFEE_is_youxiao+'" type="text" readonly oninput="myFunction(this,\'TESTINFORSONOFFEE_is_youxiao\')"   style="float:left;height:25px;padding:0;border:none;background-color:#fff;width:120px"/>'+
  '			<span style="color:red;line-height:35px;font-size:27px"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12" style="margin: 5px 0;height:25px">'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<lable style="float:left;font-size:14px;line-height:25px;width:100px">是否最新: </lable>'+
  '			<input id="TEST_INFOR_SON_OF_FEE.TESTINFORSONOFFEE_is_zuixin_3863_'+i+'" name="TESTINFORSONOFFEE_is_zuixin" value="'+TESTINFORSONOFFEE_is_zuixin+'" type="text" readonly oninput="myFunction(this,\'TESTINFORSONOFFEE_is_zuixin\')"   style="float:left;height:25px;padding:0;border:none;background-color:#fff;width:120px"/>'+
  '			<span style="color:red;line-height:35px;font-size:27px"></span>'+
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
var TESTINFORSONOFSCORE_id = arr[i].TESTINFORSONOFSCORE_id;
var TESTINFORSONOFSCORE_person_id = arr[i].TESTINFORSONOFSCORE_person_id;
var TESTINFORSONOFSCORE_test_name = arr[i].TESTINFORSONOFSCORE_test_name;
var TESTINFORSONOFSCORE_average_score = arr[i].TESTINFORSONOFSCORE_average_score;
var TESTINFORSONOFSCORE_test_score = arr[i].TESTINFORSONOFSCORE_test_score;
var TESTINFORSONOFSCORE_test_time = arr[i].TESTINFORSONOFSCORE_test_time;
TESTINFORSONOFSCORE_test_time = new Date(parseInt(TESTINFORSONOFSCORE_test_time)).Format("yyyy-MM-dd");var TESTINFORSONOFSCORE_is_youxiao = arr[i].TESTINFORSONOFSCORE_is_youxiao;
var TESTINFORSONOFSCORE_is_zuixin = arr[i].TESTINFORSONOFSCORE_is_zuixin;
			if(0 == Currentpage12){
				cellObj += '<span class="fa fa-arrow-circle-right" style="font-size:30px;padding-right:15px;float:right" onclick="next(\''+e+'\')"></span>';
			}else if(total-1==Currentpage12){
				cellObj += '<span class="fa fa-arrow-circle-left" style="font-size:30px;padding-right:15px;float:right" onclick="last(\''+e+'\')"></span>';
			}else{
				cellObj += '<span class="fa fa-arrow-circle-right" style="font-size:30px;padding-right:15px;float:right" onclick="next(\''+e+'\')"></span>'+
						   '<span class="fa fa-arrow-circle-left" style="font-size:30px;padding-right:15px;float:right" onclick="last(\''+e+'\')"></span>';
			}
			cellObj += 		'<div class="col-md-12 col-sm-12 col-lg-12">'+
							'    <div class="contact-box">'+
							'		<div class="row cell">'+
  '	<input id="TEST_INFOR_SON_OF_SCORE.TESTINFORSONOFSCORE_id_4059" name="TESTINFORSONOFSCORE_id" value="'+TESTINFORSONOFSCORE_id+'"  type="hidden" >'+
  '	<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12" style="margin: 5px 0;height:25px">'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<lable style="float:left;font-size:14px;line-height:25px;width:100px">关联人员: </lable>'+
  '			<input id="TEST_INFOR_SON_OF_SCORE.TESTINFORSONOFSCORE_person_id_4059_'+i+'" name="TESTINFORSONOFSCORE_person_id" value="'+TESTINFORSONOFSCORE_person_id+'" type="text" readonly oninput="myFunction(this,\'TESTINFORSONOFSCORE_person_id\')"   style="float:left;height:25px;padding:0;border:none;background-color:#fff;width:120px"/>'+
  '			<span style="color:red;line-height:35px;font-size:27px"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12" style="margin: 5px 0;height:25px">'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<lable style="float:left;font-size:14px;line-height:25px;width:100px">考试名: </lable>'+
  '			<input id="TEST_INFOR_SON_OF_SCORE.TESTINFORSONOFSCORE_test_name_4059_'+i+'" name="TESTINFORSONOFSCORE_test_name" value="'+TESTINFORSONOFSCORE_test_name+'" type="text" readonly oninput="myFunction(this,\'TESTINFORSONOFSCORE_test_name\')"   style="float:left;height:25px;padding:0;border:none;background-color:#fff;width:120px"/>'+
  '			<span style="color:red;line-height:35px;font-size:27px"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12" style="margin: 5px 0;height:25px">'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<lable style="float:left;font-size:14px;line-height:25px;width:100px">平均分: </lable>'+
  '			<input id="TEST_INFOR_SON_OF_SCORE.TESTINFORSONOFSCORE_average_score_4059_'+i+'" name="TESTINFORSONOFSCORE_average_score" value="'+TESTINFORSONOFSCORE_average_score+'" type="text" readonly oninput="myFunction(this,\'TESTINFORSONOFSCORE_average_score\')"   style="float:left;height:25px;padding:0;border:none;background-color:#fff;width:120px"/>'+
  '			<span style="color:red;line-height:35px;font-size:27px"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12" style="margin: 5px 0;height:25px">'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<lable style="float:left;font-size:14px;line-height:25px;width:100px">得分: </lable>'+
  '			<input id="TEST_INFOR_SON_OF_SCORE.TESTINFORSONOFSCORE_test_score_4059_'+i+'" name="TESTINFORSONOFSCORE_test_score" value="'+TESTINFORSONOFSCORE_test_score+'" type="text" readonly oninput="myFunction(this,\'TESTINFORSONOFSCORE_test_score\')"   style="float:left;height:25px;padding:0;border:none;background-color:#fff;width:120px"/>'+
  '			<span style="color:red;line-height:35px;font-size:27px"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12" style="margin: 5px 0;height:25px">'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<lable style="float:left;font-size:14px;line-height:25px;width:100px">考试时间: </lable>'+
  '			<input id="TEST_INFOR_SON_OF_SCORE.TESTINFORSONOFSCORE_test_time_4059_'+i+'" name="TESTINFORSONOFSCORE_test_time" value="'+TESTINFORSONOFSCORE_test_time+'" type="text" readonly oninput="myFunction(this,\'TESTINFORSONOFSCORE_test_time\')"   style="float:left;height:25px;padding:0;border:none;background-color:#fff;width:120px"/>'+
  '			<span style="color:red;line-height:35px;font-size:27px"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12" style="margin: 5px 0;height:25px">'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<lable style="float:left;font-size:14px;line-height:25px;width:100px">是否有效: </lable>'+
  '			<input id="TEST_INFOR_SON_OF_SCORE.TESTINFORSONOFSCORE_is_youxiao_4059_'+i+'" name="TESTINFORSONOFSCORE_is_youxiao" value="'+TESTINFORSONOFSCORE_is_youxiao+'" type="text" readonly oninput="myFunction(this,\'TESTINFORSONOFSCORE_is_youxiao\')"   style="float:left;height:25px;padding:0;border:none;background-color:#fff;width:120px"/>'+
  '			<span style="color:red;line-height:35px;font-size:27px"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12" style="margin: 5px 0;height:25px">'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<lable style="float:left;font-size:14px;line-height:25px;width:100px">是否最新: </lable>'+
  '			<input id="TEST_INFOR_SON_OF_SCORE.TESTINFORSONOFSCORE_is_zuixin_4059_'+i+'" name="TESTINFORSONOFSCORE_is_zuixin" value="'+TESTINFORSONOFSCORE_is_zuixin+'" type="text" readonly oninput="myFunction(this,\'TESTINFORSONOFSCORE_is_zuixin\')"   style="float:left;height:25px;padding:0;border:none;background-color:#fff;width:120px"/>'+
  '			<span style="color:red;line-height:35px;font-size:27px"></span>'+
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
		 for (var i = arr.length - 1; i >= 0; i--) {
var TESTINFORSONOFFEE_id = arr[i].TESTINFORSONOFFEE_id;
var TESTINFORSONOFFEE_person_id = arr[i].TESTINFORSONOFFEE_person_id;
var TESTINFORSONOFFEE_fee_name = arr[i].TESTINFORSONOFFEE_fee_name;
var TESTINFORSONOFFEE_fee_code = arr[i].TESTINFORSONOFFEE_fee_code;
var TESTINFORSONOFFEE_fee_value = arr[i].TESTINFORSONOFFEE_fee_value;
var TESTINFORSONOFFEE_fee_time = arr[i].TESTINFORSONOFFEE_fee_time;
TESTINFORSONOFFEE_fee_time = new Date(parseInt(TESTINFORSONOFFEE_fee_time)).Format("yyyy/MM/dd");var TESTINFORSONOFFEE_is_youxiao = arr[i].TESTINFORSONOFFEE_is_youxiao;
var TESTINFORSONOFFEE_is_zuixin = arr[i].TESTINFORSONOFFEE_is_zuixin;
			cellObj += 		'<div class="col-md-12 col-sm-12 col-lg-12">'+
							'    <div class="contact-box">'+
							'		<form class="row cell" style="padding-right:50px">'+
							'		<span class="fa fa-trash-o deleteButton" id="deleteButton_'+i+'" style="position: absolute;right: 30px;font-size: 25px;top: 5px;" onclick="deleteElement(this,\'3863\')"></span>'+
							'		<span class="fa fa-save saveButton" id="saveButton_'+i+'" style="position: absolute;right: 29px;font-size: 25px;top: 40px;" onclick="saveElement(this,\'3863\')"></span>'+
							'		<span class="fa fa-edit updateButton" id="updateButton_'+i+'" style="position: absolute;right: 25px;font-size: 25px;top: 77px;" onclick="updateElement(this,\''+i+'\',\''+e+'\')"></span>'+
  '	<input id="TEST_INFOR_SON_OF_FEE.TESTINFORSONOFFEE_id_3863" name="TESTINFORSONOFFEE_id" value="'+TESTINFORSONOFFEE_id+'"  type="hidden" >'+
  '	<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12" style="margin: 5px 0;height:25px">'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<lable style="float:left;font-size:14px;line-height:25px;width:100px">关联人员: </lable>'+
  '			<input id="TEST_INFOR_SON_OF_FEE.TESTINFORSONOFFEE_person_id_3863_'+i+'" name="TESTINFORSONOFFEE_person_id" value="'+TESTINFORSONOFFEE_person_id+'" type="text" readonly oninput="myFunction(this,\'TESTINFORSONOFFEE_person_id\')"  readonly="true"  style="float:left;height:25px;padding:0;border:none;background-color:#fff;width:120px"/>'+
  '			<span style="color:red;line-height:35px;font-size:27px"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12" style="margin: 5px 0;height:25px">'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<lable style="float:left;font-size:14px;line-height:25px;width:100px">费用名: </lable>'+
  '			<input id="TEST_INFOR_SON_OF_FEE.TESTINFORSONOFFEE_fee_name_3863_'+i+'" name="TESTINFORSONOFFEE_fee_name" value="'+TESTINFORSONOFFEE_fee_name+'" type="text" readonly oninput="myFunction(this,\'TESTINFORSONOFFEE_fee_name\')"   style="float:left;height:25px;padding:0;border:none;background-color:#fff;width:120px"/>'+
  '			<span style="color:red;line-height:35px;font-size:27px"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12" style="margin: 5px 0;height:25px">'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<lable style="float:left;font-size:14px;line-height:25px;width:100px">费用编码: </lable>'+
  '			<input id="TEST_INFOR_SON_OF_FEE.TESTINFORSONOFFEE_fee_code_3863_'+i+'" name="TESTINFORSONOFFEE_fee_code" value="'+TESTINFORSONOFFEE_fee_code+'" type="text" readonly oninput="myFunction(this,\'TESTINFORSONOFFEE_fee_code\')"   style="float:left;height:25px;padding:0;border:none;background-color:#fff;width:120px"/>'+
  '			<span style="color:red;line-height:35px;font-size:27px"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12" style="margin: 5px 0;height:25px">'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<lable style="float:left;font-size:14px;line-height:25px;width:100px">费用金额: </lable>'+
  '			<input id="TEST_INFOR_SON_OF_FEE.TESTINFORSONOFFEE_fee_value_3863_'+i+'" name="TESTINFORSONOFFEE_fee_value" value="'+TESTINFORSONOFFEE_fee_value+'" type="text" readonly oninput="myFunction(this,\'TESTINFORSONOFFEE_fee_value\')"  required="true"   style="float:left;height:25px;padding:0;border:none;background-color:#fff;width:120px"/>'+
  '			<span style="color:red;line-height:35px;font-size:27px"> * </span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12" style="margin: 5px 0;height:25px">'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<lable style="float:left;font-size:14px;line-height:25px;width:100px">消费时间: </lable>'+
  '			<input id="TEST_INFOR_SON_OF_FEE.TESTINFORSONOFFEE_fee_time_3863_'+i+'" name="TESTINFORSONOFFEE_fee_time" value="'+TESTINFORSONOFFEE_fee_time+'" type="text" readonly oninput="myFunction(this,\'TESTINFORSONOFFEE_fee_time\')"   style="float:left;height:25px;padding:0;border:none;background-color:#fff;width:120px"/>'+
  '			<span style="color:red;line-height:35px;font-size:27px"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12" style="margin: 5px 0;height:25px">'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<lable style="float:left;font-size:14px;line-height:25px;width:100px">是否有效: </lable>'+
  '			<input id="TEST_INFOR_SON_OF_FEE.TESTINFORSONOFFEE_is_youxiao_3863_'+i+'" name="TESTINFORSONOFFEE_is_youxiao" value="'+TESTINFORSONOFFEE_is_youxiao+'" type="text" readonly oninput="myFunction(this,\'TESTINFORSONOFFEE_is_youxiao\')"   style="float:left;height:25px;padding:0;border:none;background-color:#fff;width:120px"/>'+
  '			<span style="color:red;line-height:35px;font-size:27px"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12" style="margin: 5px 0;height:25px">'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<lable style="float:left;font-size:14px;line-height:25px;width:100px">是否最新: </lable>'+
  '			<input id="TEST_INFOR_SON_OF_FEE.TESTINFORSONOFFEE_is_zuixin_3863_'+i+'" name="TESTINFORSONOFFEE_is_zuixin" value="'+TESTINFORSONOFFEE_is_zuixin+'" type="text" readonly oninput="myFunction(this,\'TESTINFORSONOFFEE_is_zuixin\')"   style="float:left;height:25px;padding:0;border:none;background-color:#fff;width:120px"/>'+
  '			<span style="color:red;line-height:35px;font-size:27px"></span>'+
  '		</div>'+
  '	</div>'+
							'		</form>'+
							'	</div>'+
							'</div>';
	}
	$("#"+e).find("[id='TEST_FEE_INFO_FORM2']").html(cellObj);
}
	 if(e=='fubiao2'){
		 var cellObj = '';
		 for (var i = arr.length - 1; i >= 0; i--) {
var TESTINFORSONOFSCORE_id = arr[i].TESTINFORSONOFSCORE_id;
var TESTINFORSONOFSCORE_person_id = arr[i].TESTINFORSONOFSCORE_person_id;
var TESTINFORSONOFSCORE_test_name = arr[i].TESTINFORSONOFSCORE_test_name;
var TESTINFORSONOFSCORE_average_score = arr[i].TESTINFORSONOFSCORE_average_score;
var TESTINFORSONOFSCORE_test_score = arr[i].TESTINFORSONOFSCORE_test_score;
var TESTINFORSONOFSCORE_test_time = arr[i].TESTINFORSONOFSCORE_test_time;
TESTINFORSONOFSCORE_test_time = new Date(parseInt(TESTINFORSONOFSCORE_test_time)).Format("yyyy-MM-dd");var TESTINFORSONOFSCORE_is_youxiao = arr[i].TESTINFORSONOFSCORE_is_youxiao;
var TESTINFORSONOFSCORE_is_zuixin = arr[i].TESTINFORSONOFSCORE_is_zuixin;
			cellObj += 		'<div class="col-md-12 col-sm-12 col-lg-12">'+
							'    <div class="contact-box">'+
							'		<form class="row cell" style="padding-right:50px">'+
							'		<span class="fa fa-trash-o deleteButton" id="deleteButton_'+i+'" style="position: absolute;right: 30px;font-size: 25px;top: 5px;" onclick="deleteElement(this,\'4059\')"></span>'+
							'		<span class="fa fa-save saveButton" id="saveButton_'+i+'" style="position: absolute;right: 29px;font-size: 25px;top: 40px;" onclick="saveElement(this,\'4059\')"></span>'+
							'		<span class="fa fa-edit updateButton" id="updateButton_'+i+'" style="position: absolute;right: 25px;font-size: 25px;top: 77px;" onclick="updateElement(this,\''+i+'\',\''+e+'\')"></span>'+
  '	<input id="TEST_INFOR_SON_OF_SCORE.TESTINFORSONOFSCORE_id_4059" name="TESTINFORSONOFSCORE_id" value="'+TESTINFORSONOFSCORE_id+'"  type="hidden" >'+
  '	<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12" style="margin: 5px 0;height:25px">'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<lable style="float:left;font-size:14px;line-height:25px;width:100px">关联人员: </lable>'+
  '			<input id="TEST_INFOR_SON_OF_SCORE.TESTINFORSONOFSCORE_person_id_4059_'+i+'" name="TESTINFORSONOFSCORE_person_id" value="'+TESTINFORSONOFSCORE_person_id+'" type="text" readonly oninput="myFunction(this,\'TESTINFORSONOFSCORE_person_id\')"   style="float:left;height:25px;padding:0;border:none;background-color:#fff;width:120px"/>'+
  '			<span style="color:red;line-height:35px;font-size:27px"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12" style="margin: 5px 0;height:25px">'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<lable style="float:left;font-size:14px;line-height:25px;width:100px">考试名: </lable>'+
  '			<input id="TEST_INFOR_SON_OF_SCORE.TESTINFORSONOFSCORE_test_name_4059_'+i+'" name="TESTINFORSONOFSCORE_test_name" value="'+TESTINFORSONOFSCORE_test_name+'" type="text" readonly oninput="myFunction(this,\'TESTINFORSONOFSCORE_test_name\')"   style="float:left;height:25px;padding:0;border:none;background-color:#fff;width:120px"/>'+
  '			<span style="color:red;line-height:35px;font-size:27px"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12" style="margin: 5px 0;height:25px">'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<lable style="float:left;font-size:14px;line-height:25px;width:100px">平均分: </lable>'+
  '			<input id="TEST_INFOR_SON_OF_SCORE.TESTINFORSONOFSCORE_average_score_4059_'+i+'" name="TESTINFORSONOFSCORE_average_score" value="'+TESTINFORSONOFSCORE_average_score+'" type="text" readonly oninput="myFunction(this,\'TESTINFORSONOFSCORE_average_score\')"   style="float:left;height:25px;padding:0;border:none;background-color:#fff;width:120px"/>'+
  '			<span style="color:red;line-height:35px;font-size:27px"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12" style="margin: 5px 0;height:25px">'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<lable style="float:left;font-size:14px;line-height:25px;width:100px">得分: </lable>'+
  '			<input id="TEST_INFOR_SON_OF_SCORE.TESTINFORSONOFSCORE_test_score_4059_'+i+'" name="TESTINFORSONOFSCORE_test_score" value="'+TESTINFORSONOFSCORE_test_score+'" type="text" readonly oninput="myFunction(this,\'TESTINFORSONOFSCORE_test_score\')"   style="float:left;height:25px;padding:0;border:none;background-color:#fff;width:120px"/>'+
  '			<span style="color:red;line-height:35px;font-size:27px"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12" style="margin: 5px 0;height:25px">'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<lable style="float:left;font-size:14px;line-height:25px;width:100px">考试时间: </lable>'+
  '			<input id="TEST_INFOR_SON_OF_SCORE.TESTINFORSONOFSCORE_test_time_4059_'+i+'" name="TESTINFORSONOFSCORE_test_time" value="'+TESTINFORSONOFSCORE_test_time+'" type="text" readonly oninput="myFunction(this,\'TESTINFORSONOFSCORE_test_time\')"   style="float:left;height:25px;padding:0;border:none;background-color:#fff;width:120px"/>'+
  '			<span style="color:red;line-height:35px;font-size:27px"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12" style="margin: 5px 0;height:25px">'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<lable style="float:left;font-size:14px;line-height:25px;width:100px">是否有效: </lable>'+
  '			<input id="TEST_INFOR_SON_OF_SCORE.TESTINFORSONOFSCORE_is_youxiao_4059_'+i+'" name="TESTINFORSONOFSCORE_is_youxiao" value="'+TESTINFORSONOFSCORE_is_youxiao+'" type="text" readonly oninput="myFunction(this,\'TESTINFORSONOFSCORE_is_youxiao\')"   style="float:left;height:25px;padding:0;border:none;background-color:#fff;width:120px"/>'+
  '			<span style="color:red;line-height:35px;font-size:27px"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12" style="margin: 5px 0;height:25px">'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<lable style="float:left;font-size:14px;line-height:25px;width:100px">是否最新: </lable>'+
  '			<input id="TEST_INFOR_SON_OF_SCORE.TESTINFORSONOFSCORE_is_zuixin_4059_'+i+'" name="TESTINFORSONOFSCORE_is_zuixin" value="'+TESTINFORSONOFSCORE_is_zuixin+'" type="text" readonly oninput="myFunction(this,\'TESTINFORSONOFSCORE_is_zuixin\')"   style="float:left;height:25px;padding:0;border:none;background-color:#fff;width:120px"/>'+
  '			<span style="color:red;line-height:35px;font-size:27px"></span>'+
  '		</div>'+
  '	</div>'+
							'		</form>'+
							'	</div>'+
							'</div>';
	}
	$("#"+e).find("[id='TEST_FEE_INFO_FORM2']").html(cellObj);
}
	}
	 var newElementNum = 0;
	 function showAccount(arr,e){
	 if(e=='fubiao1'){
		 var cellObj = '';
var TESTINFORSONOFFEE_fee_value_all = 0;
for (var i = arr.length - 1; i >= 0; i--) {
    TESTINFORSONOFFEE_fee_value_all += parseInt(arr[i].TESTINFORSONOFFEE_fee_value);
}
			cellObj += 		'<div class="col-md-12 col-sm-12 col-lg-12">'+
							'    <div class="contact-box">'+
							'		<div class="row cell">'+
  '	<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12" style="margin: 5px 0;height:25px">'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<lable style="float:left;font-size:14px;line-height:25px;width:100px">费用金额总计: </lable>'+
  '			<input id="TEST_INFOR_SON_OF_FEE.TESTINFORSONOFFEE_fee_value_3863_all_'+i+'" name="TESTINFORSONOFFEE_fee_value_all" value="'+TESTINFORSONOFFEE_fee_value_all+'" type="text" readonly oninput="myFunction(this,\'TESTINFORSONOFFEE_fee_value_all\')"  required="true"   style="float:left;height:25px;padding:0;border:none;background-color:#fff;width:120px"/>'+
  '			<span style="color:red;line-height:35px;font-size:27px"> * </span>'+
  '		</div>'+
  '	</div>'+
							'		</div>'+
							'	</div>'+
							'</div>';
	$("#"+e).find("[id='TEST_FEE_INFO_FORM']").html(cellObj);
}
	 if(e=='fubiao2'){
		 var cellObj = '';
var TESTINFORSONOFSCORE_average_score_all = 0;
for (var i = arr.length - 1; i >= 0; i--) {
    TESTINFORSONOFSCORE_average_score_all += parseInt(arr[i].TESTINFORSONOFSCORE_average_score);
}
var TESTINFORSONOFSCORE_test_score_all = 0;
for (var i = arr.length - 1; i >= 0; i--) {
    TESTINFORSONOFSCORE_test_score_all += parseInt(arr[i].TESTINFORSONOFSCORE_test_score);
}
			cellObj += 		'<div class="col-md-12 col-sm-12 col-lg-12">'+
							'    <div class="contact-box">'+
							'		<div class="row cell">'+
  '	<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12" style="margin: 5px 0;height:25px">'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<lable style="float:left;font-size:14px;line-height:25px;width:100px">平均分总计: </lable>'+
  '			<input id="TEST_INFOR_SON_OF_SCORE.TESTINFORSONOFSCORE_average_score_4059_all_'+i+'" name="TESTINFORSONOFSCORE_average_score_all" value="'+TESTINFORSONOFSCORE_average_score_all+'" type="text" readonly oninput="myFunction(this,\'TESTINFORSONOFSCORE_average_score_all\')"   style="float:left;height:25px;padding:0;border:none;background-color:#fff;width:120px"/>'+
  '			<span style="color:red;line-height:35px;font-size:27px"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12" style="margin: 5px 0;height:25px">'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<lable style="float:left;font-size:14px;line-height:25px;width:100px">得分总计: </lable>'+
  '			<input id="TEST_INFOR_SON_OF_SCORE.TESTINFORSONOFSCORE_test_score_4059_all_'+i+'" name="TESTINFORSONOFSCORE_test_score_all" value="'+TESTINFORSONOFSCORE_test_score_all+'" type="text" readonly oninput="myFunction(this,\'TESTINFORSONOFSCORE_test_score_all\')"   style="float:left;height:25px;padding:0;border:none;background-color:#fff;width:120px"/>'+
  '			<span style="color:red;line-height:35px;font-size:27px"></span>'+
  '		</div>'+
  '	</div>'+
							'		</div>'+
							'	</div>'+
							'</div>';
	$("#"+e).find("[id='TEST_FEE_INFO_FORM']").html(cellObj);
}
	}
 function updateElement(e,num,x){
	if(x=='fubiao1'){
		//修改操作行样式
		$("#"+x).find("[id='"+e.id+"']").css("color","red");
		$("#"+x).find("[id='"+e.id+"']").attr("onclick","");
		$("#"+x).find("[id='"+e.id+"']").parent().parent().css("border-color","red");
		$("#"+x).find("[id='"+e.id+"']").parent().attr("class","row cell editing");
		var xx=$("#"+x).find("[id='"+e.id+"']").parent();//当前操作行,所有下拉日期改变控件样式
		var obj1 ;
		var fee_name_value = xx.find("[name='TESTINFORSONOFFEE_fee_name']").val();
		var fee_time_value = xx.find("[name='TESTINFORSONOFFEE_fee_time']").val();
		var is_youxiao_value = xx.find("[name='TESTINFORSONOFFEE_is_youxiao']").val();
		var is_zuixin_value = xx.find("[name='TESTINFORSONOFFEE_is_zuixin']").val();
		var TESTINFORSONOFFEE_fee_name_cellObj = '			<select id="TEST_INFOR_SON_OF_FEE.TESTINFORSONOFFEE_fee_name_3863_'+num+'_select" title="费用名"  styleType="select" name="TESTINFORSONOFFEE_fee_name"  class="form-control " style="float:left;height:25px;padding:0;border:none;background-color:#fff;width:120px"  emptyText=""  onchange="TEST_INFOR_SON_OF_FEE_TESTINFORSONOFFEE_fee_name_valueChange_3863(this)" style="float:left;" textField="dictName" valueField="dictId" DictName="feeType" dataField="dicts_form_70613"initParam = "_"></select>';
		xx.find("[id='TEST_INFOR_SON_OF_FEE.TESTINFORSONOFFEE_fee_name_3863_"+num+"']").after(TESTINFORSONOFFEE_fee_name_cellObj);
		xx.find("[id='TEST_INFOR_SON_OF_FEE.TESTINFORSONOFFEE_fee_name_3863_"+num+"']").css("display","none");
		xx.find("[id='TEST_INFOR_SON_OF_FEE.TESTINFORSONOFFEE_fee_code_3863_"+num+"']").attr("readonly",false);
		xx.find("[id='TEST_INFOR_SON_OF_FEE.TESTINFORSONOFFEE_fee_code_3863_"+num+"']").attr("class","form-control");
		xx.find("[id='TEST_INFOR_SON_OF_FEE.TESTINFORSONOFFEE_fee_value_3863_"+num+"']").attr("readonly",false);
		xx.find("[id='TEST_INFOR_SON_OF_FEE.TESTINFORSONOFFEE_fee_value_3863_"+num+"']").attr("class","form-control");
		xx.find("[id='TEST_INFOR_SON_OF_FEE.TESTINFORSONOFFEE_fee_value_3863_"+num+"']").attr("type","number");
	    var fee_time_cellObj = '			<div class="controls input-append date form_date4 input-group" data-date=""  data-link-field="dtp_input2" data-link-format="yyyy-mm-dd" style="float:left;width:135px;">'+
	  					  	   '				<input style="float:left;height:25px;padding:0;border:none;background-color:#fff;"type="text" readonly class="form-control " dateType="controls input-append date form_date4" id="TEST_INFOR_SON_OF_FEE.TESTINFORSONOFFEE_fee_time_3863_'+num+'_datepick" styleType="dateTime"   style="float:left;border-radius: 4px 0 0 4px;" name="TESTINFORSONOFFEE_fee_time"  format="yyyy/MM/dd" valueformat="yyyy/MM/dd" />'+
							   '				<span class="input-group-addon" style="padding:1px 10px 2px 10px;font-size:12px"><span class="glyphicon glyphicon-remove"></span></span>'+
		  					   '				<span class="input-group-addon" style="padding:1px 10px 2px 10px;font-size:12px"><span class="glyphicon glyphicon-th"></span></span>'+
		  					   '			</div>'+
		  					   '			<span style="color:red;line-height:35px;font-size:27px"></span>';
		xx.find("[id='TEST_INFOR_SON_OF_FEE.TESTINFORSONOFFEE_fee_time_3863_"+num+"']").after(fee_time_cellObj);
		xx.find("[id='TEST_INFOR_SON_OF_FEE.TESTINFORSONOFFEE_fee_time_3863_"+num+"']").css("display","none");
		var TESTINFORSONOFFEE_is_youxiao_cellObj = '			<select id="TEST_INFOR_SON_OF_FEE.TESTINFORSONOFFEE_is_youxiao_3863_'+num+'_select" title="是否有效"  styleType="select" name="TESTINFORSONOFFEE_is_youxiao"  class="form-control " style="float:left;height:25px;padding:0;border:none;background-color:#fff;width:120px"  emptyText=""  style="float:left;" textField="dictName" valueField="dictId" DictName="SYS_COMMON_YES_NO" dataField="dicts_form_70617"initParam = "_"></select>';
		xx.find("[id='TEST_INFOR_SON_OF_FEE.TESTINFORSONOFFEE_is_youxiao_3863_"+num+"']").after(TESTINFORSONOFFEE_is_youxiao_cellObj);
		xx.find("[id='TEST_INFOR_SON_OF_FEE.TESTINFORSONOFFEE_is_youxiao_3863_"+num+"']").css("display","none");
		var TESTINFORSONOFFEE_is_zuixin_cellObj = '			<select id="TEST_INFOR_SON_OF_FEE.TESTINFORSONOFFEE_is_zuixin_3863_'+num+'_select" title="是否最新"  styleType="select" name="TESTINFORSONOFFEE_is_zuixin"  class="form-control " style="float:left;height:25px;padding:0;border:none;background-color:#fff;width:120px"  emptyText=""  style="float:left;" textField="dictName" valueField="dictId" DictName="SYS_COMMON_YES_NO" dataField="dicts_form_70618"initParam = "_"></select>';
		xx.find("[id='TEST_INFOR_SON_OF_FEE.TESTINFORSONOFFEE_is_zuixin_3863_"+num+"']").after(TESTINFORSONOFFEE_is_zuixin_cellObj);
		xx.find("[id='TEST_INFOR_SON_OF_FEE.TESTINFORSONOFFEE_is_zuixin_3863_"+num+"']").css("display","none");
		var pid = xx.attr("id");
		elementsListSelectInitFunction(e);
		cardAndCardDateWidInitFunction(e);
		$("#"+x).find("[id='TEST_INFOR_SON_OF_FEE.TESTINFORSONOFFEE_fee_name_3863_"+num+"_select']").val(fee_name_value);
		$("#"+x).find("[id='TEST_INFOR_SON_OF_FEE.TESTINFORSONOFFEE_fee_time_3863_"+num+"_datepick']").val(fee_time_value);
		$("#"+x).find("[id='TEST_INFOR_SON_OF_FEE.TESTINFORSONOFFEE_is_youxiao_3863_"+num+"_select']").val(is_youxiao_value);
		$("#"+x).find("[id='TEST_INFOR_SON_OF_FEE.TESTINFORSONOFFEE_is_zuixin_3863_"+num+"_select']").val(is_zuixin_value);
	}
		/*if(x=='fubiao2'){
		//修改操作行样式
		$("#"+x).find("[id='"+e.id+"']").css("color","red");
		$("#"+x).find("[id='"+e.id+"']").attr("onclick","");
		$("#"+x).find("[id='"+e.id+"']").parent().parent().css("border-color","red");
		$("#"+x).find("[id='"+e.id+"']").parent().attr("class","row cell editing");
		var xx=$("#"+x).find("[id='"+e.id+"']").parent();//当前操作行,所有下拉日期改变控件样式
		var obj1 ;
var test_name_value = xx.find("[name='TESTINFORSONOFSCORE_test_name']").val();
var test_time_value = xx.find("[name='TESTINFORSONOFSCORE_test_time']").val();
var is_youxiao_value = xx.find("[name='TESTINFORSONOFSCORE_is_youxiao']").val();
var is_zuixin_value = xx.find("[name='TESTINFORSONOFSCORE_is_zuixin']").val();
xx.find("[id='TEST_INFOR_SON_OF_SCORE.TESTINFORSONOFSCORE_person_id_4059_"+num+"']").attr("readonly",false);
xx.find("[id='TEST_INFOR_SON_OF_SCORE.TESTINFORSONOFSCORE_person_id_4059_"+num+"']").attr("class","form-control");
  var TESTINFORSONOFSCORE_test_name_cellObj = '			<select id="TEST_INFOR_SON_OF_SCORE.TESTINFORSONOFSCORE_test_name_4059_'+num+'_select" title="考试名"  styleType="select" name="TESTINFORSONOFSCORE_test_name"  class="form-control " style="float:left;height:25px;padding:0;border:none;background-color:#fff;width:120px"  emptyText=""  style="float:left;" textField="dictName" valueField="dictId" DictName="testScoreType" dataField="dicts_form_73608"initParam = "_"></select>';
	xx.find("[id='TEST_INFOR_SON_OF_SCORE.TESTINFORSONOFSCORE_test_name_4059_"+num+"']").after(TESTINFORSONOFSCORE_test_name_cellObj);
	xx.find("[id='TEST_INFOR_SON_OF_SCORE.TESTINFORSONOFSCORE_test_name_4059_"+num+"']").css("display","none");
xx.find("[id='TEST_INFOR_SON_OF_SCORE.TESTINFORSONOFSCORE_average_score_4059_"+num+"']").attr("readonly",false);
xx.find("[id='TEST_INFOR_SON_OF_SCORE.TESTINFORSONOFSCORE_average_score_4059_"+num+"']").attr("class","form-control");
xx.find("[id='TEST_INFOR_SON_OF_SCORE.TESTINFORSONOFSCORE_test_score_4059_"+num+"']").attr("readonly",false);
xx.find("[id='TEST_INFOR_SON_OF_SCORE.TESTINFORSONOFSCORE_test_score_4059_"+num+"']").attr("class","form-control");
  var fee_time_cellObj = '			<div class="controls input-append date form_date1 input-group" data-date=""  data-link-field="dtp_input2" data-link-format="yyyy-mm-dd" style="float:left;width:135px;">'+
  					  '				<input style="float:left;height:25px;padding:0;border:none;background-color:#fff;"type="text" readonly class="form-control " dateType="controls input-append date form_date1" id="TEST_INFOR_SON_OF_SCORE.TESTINFORSONOFSCORE_test_time_4059_'+num+'_datepick" styleType="dateTime"   style="float:left;border-radius: 4px 0 0 4px;" name="TESTINFORSONOFSCORE_test_time"  format="yyyy-MM-dd" valueformat="yyyy-MM-dd" />'+
						  '				<span class="input-group-addon" style="padding:1px 10px 2px 10px;font-size:12px"><span class="glyphicon glyphicon-remove"></span></span>'+
  					  '				<span class="input-group-addon" style="padding:1px 10px 2px 10px;font-size:12px"><span class="glyphicon glyphicon-th"></span></span>'+
  					  '			</div>'+
  					  '			<span style="color:red;line-height:35px;font-size:27px"></span>';
xx.find("[id='TEST_INFOR_SON_OF_SCORE.TESTINFORSONOFSCORE_test_time_4059_"+num+"']").after(fee_time_cellObj);
xx.find("[id='TEST_INFOR_SON_OF_SCORE.TESTINFORSONOFSCORE_test_time_4059_"+num+"']").css("display","none");
  var TESTINFORSONOFSCORE_is_youxiao_cellObj = '			<select id="TEST_INFOR_SON_OF_SCORE.TESTINFORSONOFSCORE_is_youxiao_4059_'+num+'_select" title="是否有效"  styleType="select" name="TESTINFORSONOFSCORE_is_youxiao"  class="form-control " style="float:left;height:25px;padding:0;border:none;background-color:#fff;width:120px"  emptyText=""  style="float:left;" textField="dictName" valueField="dictId" DictName="SYS_COMMON_YES_NO" dataField="dicts_form_73612"initParam = "_"></select>';
	xx.find("[id='TEST_INFOR_SON_OF_SCORE.TESTINFORSONOFSCORE_is_youxiao_4059_"+num+"']").after(TESTINFORSONOFSCORE_is_youxiao_cellObj);
	xx.find("[id='TEST_INFOR_SON_OF_SCORE.TESTINFORSONOFSCORE_is_youxiao_4059_"+num+"']").css("display","none");
  var TESTINFORSONOFSCORE_is_zuixin_cellObj = '			<select id="TEST_INFOR_SON_OF_SCORE.TESTINFORSONOFSCORE_is_zuixin_4059_'+num+'_select" title="是否最新"  styleType="select" name="TESTINFORSONOFSCORE_is_zuixin"  class="form-control " style="float:left;height:25px;padding:0;border:none;background-color:#fff;width:120px"  emptyText=""  style="float:left;" textField="dictName" valueField="dictId" DictName="SYS_COMMON_YES_NO" dataField="dicts_form_73613"initParam = "_"></select>';
	xx.find("[id='TEST_INFOR_SON_OF_SCORE.TESTINFORSONOFSCORE_is_zuixin_4059_"+num+"']").after(TESTINFORSONOFSCORE_is_zuixin_cellObj);
	xx.find("[id='TEST_INFOR_SON_OF_SCORE.TESTINFORSONOFSCORE_is_zuixin_4059_"+num+"']").css("display","none");
		var pid = xx.attr("id");
		elementsListSelectInitFunction(e);
		cardAndCardDateWidInitFunction(e);
$("#"+x).find("[id='TEST_INFOR_SON_OF_SCORE.TESTINFORSONOFSCORE_test_name_4059_"+num+"_select']").val(test_name_value);
$("#"+x).find("[id='TEST_INFOR_SON_OF_SCORE.TESTINFORSONOFSCORE_test_time_4059_"+num+"_datepick']").val(test_time_value);
$("#"+x).find("[id='TEST_INFOR_SON_OF_SCORE.TESTINFORSONOFSCORE_is_youxiao_4059_"+num+"_select']").val(is_youxiao_value);
$("#"+x).find("[id='TEST_INFOR_SON_OF_SCORE.TESTINFORSONOFSCORE_is_zuixin_4059_"+num+"_select']").val(is_zuixin_value);
}*/
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
			data:grid_TEST_FEE_INFO_FORM_fun(xx),//HTTP请求类型
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
			data:grid_TEST_SCORE_INFO_FORM_fun(xx),//HTTP请求类型
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
			data:grid_TEST_FEE_INFO_FORM_funx(xx),//HTTP请求类型
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
			data:grid_TEST_SCORE_INFO_FORM_funx(xx),//HTTP请求类型
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
			data:grid_TEST_FEE_INFO_FORM_funx(xx),//HTTP请求类型
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
			data:grid_TEST_SCORE_INFO_FORM_funx(xx),//HTTP请求类型
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
function grid_TEST_FEE_INFO_FORM_fun(pageReqeust){
	var _filterdata={};
			var TESTINFORSONOFFEE_is_youxiao=youxiao1;
			var TESTINFORSONOFFEE_is_zuixin=zuixin1;
		_filterdata={TESTINFORSONOFFEE_is_youxiao:TESTINFORSONOFFEE_is_youxiao,TESTINFORSONOFFEE_is_zuixin:TESTINFORSONOFFEE_is_zuixin};
	var paramsMap = {};
	var requestParam={};
	if(personId_parameter==''&&'parameter'=='parameter'){
		if(personId==undefined){
			requestParam = {personId:personId_parameter};
		}else{
			requestParam = {personId:personId+""};
		}
	}else{
		requestParam = {personId:personId_parameter};
	}
	pageReqeust.containerParam=containerParam_3863;
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.userIds=param_empIds;
	pageReqeust.formId=_formId_3863;
	pageReqeust.isView=null;
	pageReqeust.offset=Currentpage11*pagesize11;;
	pageReqeust.limit=pagesize11;;
	if(heightGadedata_3863!=null&&heightGadedata_3863!=undefined){
		pageReqeust.heightGrade = heightGadedata_3863;
	}
	queryParams = JSON.stringify(pageReqeust);
	return queryParams;
}
function grid_TEST_FEE_INFO_FORM_funx(pageReqeust){
	var _filterdata={};
			var TESTINFORSONOFFEE_is_youxiao=youxiao1;
			var TESTINFORSONOFFEE_is_zuixin=zuixin1;
		_filterdata={TESTINFORSONOFFEE_is_youxiao:TESTINFORSONOFFEE_is_youxiao,TESTINFORSONOFFEE_is_zuixin:TESTINFORSONOFFEE_is_zuixin};
	var paramsMap = {};
	var requestParam={};
	if(personId_parameter==''&&'parameter'=='parameter'){
		if(personId==undefined){
			requestParam = {personId:personId_parameter};
		}else{
			requestParam = {personId:personId+""};
		}
	}else{
		requestParam = {personId:personId_parameter};
	}
	pageReqeust.containerParam=containerParam_3863;
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.userIds=param_empIds;
	pageReqeust.formId=_formId_3863;
	pageReqeust.isView=null;
	pageReqeust.offset=Currentpage21*pagesize21;;
	pageReqeust.limit=pagesize21;;
	if(heightGadedata_3863!=null&&heightGadedata_3863!=undefined){
		pageReqeust.heightGrade = heightGadedata_3863;
	}
	queryParams = JSON.stringify(pageReqeust);
	return queryParams;
}
function grid_TEST_SCORE_INFO_FORM_fun(pageReqeust){
	var _filterdata={};
			var TESTINFORSONOFSCORE_is_youxiao=youxiao2;
			var TESTINFORSONOFSCORE_is_zuixin=zuixin2;
		_filterdata={TESTINFORSONOFSCORE_is_youxiao:TESTINFORSONOFSCORE_is_youxiao,TESTINFORSONOFSCORE_is_zuixin:TESTINFORSONOFSCORE_is_zuixin};
	var paramsMap = {};
	var requestParam={};
	if(personId_parameter==''&&'parameter'=='parameter'){
		if(personId==undefined){
			requestParam = {personId:personId_parameter};
		}else{
			requestParam = {personId:personId+""};
		}
	}else{
		requestParam = {personId:personId_parameter};
	}
	pageReqeust.containerParam=containerParam_4059;
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.userIds=param_empIds;
	pageReqeust.formId=_formId_4059;
	pageReqeust.isView=null;
	pageReqeust.offset=Currentpage12*pagesize12;;
	pageReqeust.limit=pagesize12;;
	if(heightGadedata_4059!=null&&heightGadedata_4059!=undefined){
		pageReqeust.heightGrade = heightGadedata_4059;
	}
	queryParams = JSON.stringify(pageReqeust);
	return queryParams;
}
function grid_TEST_SCORE_INFO_FORM_funx(pageReqeust){
	var _filterdata={};
			var TESTINFORSONOFSCORE_is_youxiao=youxiao2;
			var TESTINFORSONOFSCORE_is_zuixin=zuixin2;
		_filterdata={TESTINFORSONOFSCORE_is_youxiao:TESTINFORSONOFSCORE_is_youxiao,TESTINFORSONOFSCORE_is_zuixin:TESTINFORSONOFSCORE_is_zuixin};
	var paramsMap = {};
	var requestParam={};
	if(personId_parameter==''&&'parameter'=='parameter'){
		if(personId==undefined){
			requestParam = {personId:personId_parameter};
		}else{
			requestParam = {personId:personId+""};
		}
	}else{
		requestParam = {personId:personId_parameter};
	}
	pageReqeust.containerParam=containerParam_4059;
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.userIds=param_empIds;
	pageReqeust.formId=_formId_4059;
	pageReqeust.isView=null;
	pageReqeust.offset=Currentpage22*pagesize22;;
	pageReqeust.limit=pagesize22;;
	if(heightGadedata_4059!=null&&heightGadedata_4059!=undefined){
		pageReqeust.heightGrade = heightGadedata_4059;
	}
	queryParams = JSON.stringify(pageReqeust);
	return queryParams;
}
	 function initAddValue(e,num){
	 if(e=='fubiao1'){
	 	num--;
		var obj = $("#newElement"+num);
		var value = personId_parameter;
var obj0 = obj.find("[name='TESTINFORSONOFFEE_person_id']");
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
        var dataField = obj0.attr("dataField");
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
	function TEST_INFOR_SON_OF_FEE_TESTINFORSONOFFEE_fee_name_valueChange_3863(e){

		alert("666");
	}
