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
//当前页和一次显示多少条数据(单条记录默认一条)
var Currentpage13 = 0;
var pagesize13 = 1;
var Currentpage23 = 0;//(展开数据最大100条)
var pagesize23 = 100;
//当前页和一次显示多少条数据
var Currentpage03 = 0;
var pagesize03 = 1;
//状态变量
var youxiao3 = 'Y';
var zuixin3 = null;
var newElementNum3 = 0;
//当前页和一次显示多少条数据(单条记录默认一条)
var Currentpage14 = 0;
var pagesize14 = 1;
var Currentpage24 = 0;//(展开数据最大100条)
var pagesize24 = 100;
//当前页和一次显示多少条数据
var Currentpage04 = 0;
var pagesize04 = 1;
//状态变量
var youxiao4 = 'Y';
var zuixin4 = null;
var newElementNum4 = 0;
var filterParam = {};
var queryParams;
function grid_test_Main_Form_fun(pageReqeust){
	var _filterdata={};
	if(document.getElementById('grid_test_Main_Form_filter')){
	}
	var paramsMap = {};
	var requestParam={};
	if('${param.EMPVEMPLOYEE_EMPID}'==''&&'parameter'=='parameter'){
		if(EMPVEMPLOYEE_EMPID==undefined){
			requestParam = {EMPVEMPLOYEE_EMPID:'${param.EMPVEMPLOYEE_EMPID}'};
		}else{
			requestParam = {EMPVEMPLOYEE_EMPID:EMPVEMPLOYEE_EMPID+""};
		}
	}else{
		requestParam = {EMPVEMPLOYEE_EMPID:'${param.EMPVEMPLOYEE_EMPID}'};
	}
	pageReqeust.containerParam=containerParam_4362;
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.userIds=getQueryString('empIds');
	pageReqeust.formId=_formId_4362;
	pageReqeust.isView=null;
	pageReqeust.offset=Currentpage*pagesize;;
	pageReqeust.limit=pagesize;;
	if(heightGadedata_4362!=null&&heightGadedata_4362!=undefined){
		pageReqeust.heightGrade = heightGadedata_4362;
	}
	queryParams = JSON.stringify(pageReqeust);
	return queryParams;
}
function grid_test_Main_Form_fun11_4362(){
	loadDataStart();

}
	 function addFunction(e){
	 if(e=='fubiao1'){
		 var cellObj = '';
		 cellObj +=	'<div name="fubiaoElement" class="col-md-12 col-sm-12 col-lg-12" id="newElement'+newElementNum+'">'+
					'    <div class="contact-box CCAdd">'+
					'<form class="row cell add_element" style="padding-right:50px">';
		 cellObj += '	<span class="fa fa-trash-o deleteButton" style="position: absolute;right: 30px;font-size: 25px" onclick="removeElement('+newElementNum+')"></span>'+
					'	<span class="fa fa-save saveButton" style="position: absolute;right: 30px;font-size: 25px;top:50px" onclick="saveElement(this,\'4366\')"></span>'+
  '	<input id="EMP_V_EMPLOYEE.EMPVEMPLOYEE_EMPID_4366" name="EMPVEMPLOYEE_EMPID"   type="hidden" >'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">员工状态: </label>'+
  '			<select id="EMP_V_EMPLOYEE.EMPVEMPLOYEE_EMPSTATUS_4366_add_'+newElementNum+'" title="员工状态" styleType="select" name="EMPVEMPLOYEE_EMPSTATUS"  columnId="83846" class="form-control " style="width:200px;float:left;height:25px;padding:0;border:none;background-color:#fff"  emptyText=""  style="float:left;width:200px;" dataField1 = "dict"  textField="dictName" valueField="dictId" DictName="EMP_EMPSTATUS" dataField="dicts_form_83846"initParam = "_"></select>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">在岗状态: </label>'+
  '			<select id="EMP_V_EMPLOYEE.EMPVEMPLOYEE_JOBSTATUS_4366_add_'+newElementNum+'" title="在岗状态" styleType="select" name="EMPVEMPLOYEE_JOBSTATUS"  columnId="83847" class="form-control " style="width:200px;float:left;height:25px;padding:0;border:none;background-color:#fff"  emptyText=""  style="float:left;width:200px;" dataField1 = "dict"  textField="dictName" valueField="dictId" DictName="Onduty" dataField="dicts_form_83847"initParam = "_"></select>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">员工类型: </label>'+
  '			<select id="EMP_V_EMPLOYEE.EMPVEMPLOYEE_EMPTYPE_4366_add_'+newElementNum+'" title="员工类型" styleType="select" name="EMPVEMPLOYEE_EMPTYPE"  columnId="83848" class="form-control " style="width:200px;float:left;height:25px;padding:0;border:none;background-color:#fff"  emptyText=""  style="float:left;width:200px;" dataField1 = "dict"  textField="dictName" valueField="dictId" DictName="EMP_EMPTYPE" dataField="dicts_form_83848"initParam = "_"></select>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">所属条线: </label>'+
  '			<select id="EMP_V_EMPLOYEE.EMPVEMPLOYEE_BELONGLINE_4366_add_'+newElementNum+'" title="所属条线" styleType="select" name="EMPVEMPLOYEE_BELONGLINE"  columnId="83849" class="form-control " style="width:200px;float:left;height:25px;padding:0;border:none;background-color:#fff"  emptyText=""  style="float:left;width:200px;" dataField1 = "dict"  textField="dictName" valueField="dictId" DictName="emp_BELONGLINE" dataField="dicts_form_83849"initParam = "_"></select>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">入职日期: </label>'+
  '			<div class="controls input-append date form_date1 input-group" data-date=""  data-link-field="dtp_input2" data-link-format="yyyy-mm-dd" style="float:left;width: 134px;">'+
  '				<input style="width:134px;float:left;height:25px;padding:0;border:none;background-color:#fff"type="text" readonly class="form-control " dateType="controls input-append date form_date1" id="EMP_V_EMPLOYEE.EMPVEMPLOYEE_JOINDATE_4366_add_'+newElementNum+'" styleType="dateTime"   style="width:134px;float:left;border-radius: 4px 0 0 4px;" name="EMPVEMPLOYEE_JOINDATE"  format="yyyy-MM-dd" valueformat="yyyy-MM-dd" />'+
	'				<span class="input-group-addon" name="closeButton" style="padding:1px 10px 2px 10px;font-size:12px"><span class="glyphicon glyphicon-remove"></span></span>'+
  '				<span class="input-group-addon" name="clickButton" style="padding:1px 10px 2px 10px;font-size:12px"><span class="glyphicon glyphicon-th"></span></span>'+
  '			</div>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">行龄: </label>'+
  '			<input id="EMP_V_EMPLOYEE.EMPVEMPLOYEE_COMPYEARS_4366_add_'+newElementNum+'" name="EMPVEMPLOYEE_COMPYEARS" dataType="text" type="text" class="form-control" oninput="myFunction(this,\'EMPVEMPLOYEE_COMPYEARS\')"  vtype="illegalChar;maxLength:10;minLength:null;"   style="width:200px;height:25px;padding:0;border:none;background-color:#fff;display:inline"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">参加工作日期: </label>'+
  '			<div class="controls input-append date form_date1 input-group" data-date=""  data-link-field="dtp_input2" data-link-format="yyyy-mm-dd" style="float:left;width: 134px;">'+
  '				<input style="width:134px;float:left;height:25px;padding:0;border:none;background-color:#fff"type="text" readonly class="form-control " dateType="controls input-append date form_date1" id="EMP_V_EMPLOYEE.EMPVEMPLOYEE_BEGINWORKDATE_4366_add_'+newElementNum+'" styleType="dateTime"   style="width:134px;float:left;border-radius: 4px 0 0 4px;" name="EMPVEMPLOYEE_BEGINWORKDATE"  format="yyyy-MM-dd" valueformat="yyyy-MM-dd" />'+
	'				<span class="input-group-addon" name="closeButton" style="padding:1px 10px 2px 10px;font-size:12px"><span class="glyphicon glyphicon-remove"></span></span>'+
  '				<span class="input-group-addon" name="clickButton" style="padding:1px 10px 2px 10px;font-size:12px"><span class="glyphicon glyphicon-th"></span></span>'+
  '			</div>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">工龄: </label>'+
  '			<input id="EMP_V_EMPLOYEE.EMPVEMPLOYEE_WORKYEARS_4366_add_'+newElementNum+'" name="EMPVEMPLOYEE_WORKYEARS" dataType="text" type="text" class="form-control" oninput="myFunction(this,\'EMPVEMPLOYEE_WORKYEARS\')"  vtype="illegalChar;maxLength:10;minLength:null;"   style="width:200px;height:25px;padding:0;border:none;background-color:#fff;display:inline"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">任现岗位时间: </label>'+
  '			<div class="controls input-append date form_date1 input-group" data-date=""  data-link-field="dtp_input2" data-link-format="yyyy-mm-dd" style="float:left;width: 134px;">'+
  '				<input style="width:134px;float:left;height:25px;padding:0;border:none;background-color:#fff"type="text" readonly class="form-control " dateType="controls input-append date form_date1" id="EMP_V_EMPLOYEE.EMPVEMPLOYEE_JOBBEGINDATE_4366_add_'+newElementNum+'" styleType="dateTime"   style="width:134px;float:left;border-radius: 4px 0 0 4px;" name="EMPVEMPLOYEE_JOBBEGINDATE"  format="yyyy-MM-dd" valueformat="yyyy-MM-dd" />'+
	'				<span class="input-group-addon" name="closeButton" style="padding:1px 10px 2px 10px;font-size:12px"><span class="glyphicon glyphicon-remove"></span></span>'+
  '				<span class="input-group-addon" name="clickButton" style="padding:1px 10px 2px 10px;font-size:12px"><span class="glyphicon glyphicon-th"></span></span>'+
  '			</div>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">岗龄: </label>'+
  '			<input id="EMP_V_EMPLOYEE.EMPVEMPLOYEE_JOBAGE_4366_add_'+newElementNum+'" name="EMPVEMPLOYEE_JOBAGE" dataType="text" type="text" class="form-control" oninput="myFunction(this,\'EMPVEMPLOYEE_JOBAGE\')"  vtype="illegalChar;maxLength:10;minLength:null;"   style="width:200px;height:25px;padding:0;border:none;background-color:#fff;display:inline"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">年龄: </label>'+
  '			<input id="EMP_V_EMPLOYEE.EMPVEMPLOYEE_YEAROLDS_4366_add_'+newElementNum+'" name="EMPVEMPLOYEE_YEAROLDS" dataType="text" type="text" class="form-control" oninput="myFunction(this,\'EMPVEMPLOYEE_YEAROLDS\')"  vtype="illegalChar;maxLength:18;minLength:null;"   style="width:200px;height:25px;padding:0;border:none;background-color:#fff;display:inline"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<input id="EMP_V_EMPLOYEE.EMPVEMPLOYEE_MAXEDUCATION_4366" name="EMPVEMPLOYEE_MAXEDUCATION"   type="hidden" >'+
  '	<input id="EMP_V_EMPLOYEE.EMPVEMPLOYEE_MAXDEGREE_4366" name="EMPVEMPLOYEE_MAXDEGREE"   type="hidden" >'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">毕业院校: </label>'+
  '			<input id="EMP_V_EMPLOYEE.EMPVEMPLOYEE_GRADUASCHOOL_4366_add_'+newElementNum+'" name="EMPVEMPLOYEE_GRADUASCHOOL" dataType="text" type="text" class="form-control" oninput="myFunction(this,\'EMPVEMPLOYEE_GRADUASCHOOL\')"  vtype="illegalChar;maxLength:20;minLength:null;"   style="width:200px;height:25px;padding:0;border:none;background-color:#fff;display:inline"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">专业: </label>'+
  '			<input id="EMP_V_EMPLOYEE.EMPVEMPLOYEE_PROFESSION_4366_add_'+newElementNum+'" name="EMPVEMPLOYEE_PROFESSION" dataType="text" type="text" class="form-control" oninput="myFunction(this,\'EMPVEMPLOYEE_PROFESSION\')"  vtype="illegalChar;maxLength:20;minLength:null;"   style="width:200px;height:25px;padding:0;border:none;background-color:#fff;display:inline"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">政治面貌: </label>'+
  '			<select id="EMP_V_EMPLOYEE.EMPVEMPLOYEE_POLITICALSTATUS_4366_add_'+newElementNum+'" title="政治面貌" styleType="select" name="EMPVEMPLOYEE_POLITICALSTATUS"  columnId="83861" class="form-control " style="width:200px;float:left;height:25px;padding:0;border:none;background-color:#fff"  emptyText=""  style="float:left;width:200px;" dataField1 = "dict"  textField="dictName" valueField="dictId" DictName="emp_PoliticalOut" dataField="dicts_form_83861"initParam = "_"></select>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">加入党派时间: </label>'+
  '			<div class="controls input-append date form_date1 input-group" data-date=""  data-link-field="dtp_input2" data-link-format="yyyy-mm-dd" style="float:left;width: 134px;">'+
  '				<input style="width:134px;float:left;height:25px;padding:0;border:none;background-color:#fff"type="text" readonly class="form-control " dateType="controls input-append date form_date1" id="EMP_V_EMPLOYEE.EMPVEMPLOYEE_BEGINPRODATE_4366_add_'+newElementNum+'" styleType="dateTime"   style="width:134px;float:left;border-radius: 4px 0 0 4px;" name="EMPVEMPLOYEE_BEGINPRODATE"  format="yyyy-MM-dd" valueformat="yyyy-MM-dd" />'+
	'				<span class="input-group-addon" name="closeButton" style="padding:1px 10px 2px 10px;font-size:12px"><span class="glyphicon glyphicon-remove"></span></span>'+
  '				<span class="input-group-addon" name="clickButton" style="padding:1px 10px 2px 10px;font-size:12px"><span class="glyphicon glyphicon-th"></span></span>'+
  '			</div>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">是否一把手: </label>'+
  '			<select id="EMP_V_EMPLOYEE.EMPVEMPLOYEE_WHELEADER_4366_add_'+newElementNum+'" title="是否一把手" styleType="select" name="EMPVEMPLOYEE_WHELEADER"  columnId="83863" class="form-control " style="width:200px;float:left;height:25px;padding:0;border:none;background-color:#fff"  emptyText=""  style="float:left;width:200px;" dataField1 = "dict"  textField="dictName" valueField="dictId" DictName="att_yes_no" dataField="dicts_form_83863"initParam = "_"></select>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;line-height:25px">现居住地址: </label>'+
  '			<textarea id="EMP_V_EMPLOYEE.EMPVEMPLOYEE_LOCATION_4366_add_'+newElementNum+'" name="EMPVEMPLOYEE_LOCATION" class="CCReadTextarea form-control"  vtype="illegalChar;maxLength:30;minLength:null;"   style="width:200px;height:25px;padding:0;border:none;background-color:#fff"></textarea>'+
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
	 if(e=='fubiao2'){
		 var cellObj = '';
		 cellObj +=	'<div name="fubiaoElement" class="col-md-12 col-sm-12 col-lg-12" id="newElement'+newElementNum+'">'+
					'    <div class="contact-box CCAdd">'+
					'<form class="row cell add_element" style="padding-right:50px">';
		 cellObj += '	<span class="fa fa-trash-o deleteButton" style="position: absolute;right: 30px;font-size: 25px" onclick="removeElement('+newElementNum+')"></span>'+
					'	<span class="fa fa-save saveButton" style="position: absolute;right: 30px;font-size: 25px;top:50px" onclick="saveElement(this,\'4363\')"></span>'+
  '	<input id="EMP_CONTRACT.EMPCONTRACT_CONNO_4363" name="EMPCONTRACT_CONNO"   type="hidden" >'+
  '	<input id="EMP_CONTRACT.EMPCONTRACT_EMPID_4363" name="EMPCONTRACT_EMPID"   type="hidden" >'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">合同签约单位: </label>'+
  '			<select id="EMP_CONTRACT.EMPCONTRACT_CONTRACTUNIT_4363_add_'+newElementNum+'" title="合同签约单位" styleType="select" name="EMPCONTRACT_CONTRACTUNIT"  columnId="83805" class="form-control " style="width:200px;float:left;height:25px;padding:0;border:none;background-color:#fff"  emptyText=""  style="float:left;width:200px;" dataField1 = "dict"  textField="dictName" valueField="dictId" DictName="contactUnit" dataField="dicts_form_83805"initParam = "_"></select>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">合同类型: </label>'+
  '			<select id="EMP_CONTRACT.EMPCONTRACT_CONTRACTTYPE_4363_add_'+newElementNum+'" title="合同类型" styleType="select" name="EMPCONTRACT_CONTRACTTYPE"  columnId="83806" class="form-control " style="width:200px;float:left;height:25px;padding:0;border:none;background-color:#fff"  emptyText=""  style="float:left;width:200px;" dataField1 = "dict"  textField="dictName" valueField="dictId" DictName="EMP_CONTRACTTYPE" dataField="dicts_form_83806"initParam = "_"></select>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">合同性质: </label>'+
  '			<select id="EMP_CONTRACT.EMPCONTRACT_CONTRACTKIND_4363_add_'+newElementNum+'" title="合同性质" styleType="select" name="EMPCONTRACT_CONTRACTKIND"  columnId="83807" class="form-control " style="width:200px;float:left;height:25px;padding:0;border:none;background-color:#fff"  emptyText=""  style="float:left;width:200px;" dataField1 = "dict"  textField="dictName" valueField="dictId" DictName="EMP_CONTRACTKIND" dataField="dicts_form_83807"initParam = "_"></select>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">合同开始日期: </label>'+
  '			<div class="controls input-append date form_date1 input-group" data-date=""  data-link-field="dtp_input2" data-link-format="yyyy-mm-dd" style="float:left;width: 134px;">'+
  '				<input style="width:134px;float:left;height:25px;padding:0;border:none;background-color:#fff"type="text" readonly class="form-control " dateType="controls input-append date form_date1" id="EMP_CONTRACT.EMPCONTRACT_CONBEGINDATE_4363_add_'+newElementNum+'" styleType="dateTime"   style="width:134px;float:left;border-radius: 4px 0 0 4px;" name="EMPCONTRACT_CONBEGINDATE"  format="yyyy-MM-dd" valueformat="yyyy-MM-dd" />'+
	'				<span class="input-group-addon" name="closeButton" style="padding:1px 10px 2px 10px;font-size:12px"><span class="glyphicon glyphicon-remove"></span></span>'+
  '				<span class="input-group-addon" name="clickButton" style="padding:1px 10px 2px 10px;font-size:12px"><span class="glyphicon glyphicon-th"></span></span>'+
  '			</div>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">合同期限(年): </label>'+
  '			<input id="EMP_CONTRACT.EMPCONTRACT_CONMONTHS_4363_add_'+newElementNum+'" name="EMPCONTRACT_CONMONTHS" dataType="text" type="text" class="form-control" oninput="myFunction(this,\'EMPCONTRACT_CONMONTHS\')"  vtype="illegalChar;maxLength:10;minLength:null;"   style="width:200px;height:25px;padding:0;border:none;background-color:#fff;display:inline"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">合同结束日期: </label>'+
  '			<div class="controls input-append date form_date1 input-group" data-date=""  data-link-field="dtp_input2" data-link-format="yyyy-mm-dd" style="float:left;width: 134px;">'+
  '				<input style="width:134px;float:left;height:25px;padding:0;border:none;background-color:#fff"type="text" readonly class="form-control " dateType="controls input-append date form_date1" id="EMP_CONTRACT.EMPCONTRACT_CONENDDATE_4363_add_'+newElementNum+'" styleType="dateTime"   style="width:134px;float:left;border-radius: 4px 0 0 4px;" name="EMPCONTRACT_CONENDDATE"  format="yyyy-MM-dd" valueformat="yyyy-MM-dd" />'+
	'				<span class="input-group-addon" name="closeButton" style="padding:1px 10px 2px 10px;font-size:12px"><span class="glyphicon glyphicon-remove"></span></span>'+
  '				<span class="input-group-addon" name="clickButton" style="padding:1px 10px 2px 10px;font-size:12px"><span class="glyphicon glyphicon-th"></span></span>'+
  '			</div>'+
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
	 if(e=='fubiao3'){
		 var cellObj = '';
		 cellObj +=	'<div name="fubiaoElement" class="col-md-12 col-sm-12 col-lg-12" id="newElement'+newElementNum+'">'+
					'    <div class="contact-box CCAdd">'+
					'<form class="row cell add_element" style="padding-right:50px">';
		 cellObj += '	<span class="fa fa-trash-o deleteButton" style="position: absolute;right: 30px;font-size: 25px" onclick="removeElement('+newElementNum+')"></span>'+
					'	<span class="fa fa-save saveButton" style="position: absolute;right: 30px;font-size: 25px;top:50px" onclick="saveElement(this,\'4367\')"></span>'+
  '	<input id="EMP_BG_TITLE.EMPBGTITLE_ID_4367" name="EMPBGTITLE_ID"   type="hidden" >'+
  '	<input id="EMP_BG_TITLE.EMPBGTITLE_EMPID_4367" name="EMPBGTITLE_EMPID"   type="hidden" >'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">职称名: </label>'+
  '			<input id="EMP_BG_TITLE.EMPBGTITLE_TITLE_4367_add_'+newElementNum+'" name="EMPBGTITLE_TITLE" dataType="text" type="text" class="form-control" oninput="myFunction(this,\'EMPBGTITLE_TITLE\')"  vtype="illegalChar;maxLength:200;minLength:null;"   style="width:200px;height:25px;padding:0;border:none;background-color:#fff;display:inline"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">职称级别: </label>'+
  '			<select id="EMP_BG_TITLE.EMPBGTITLE_TITLEGRADE_4367_add_'+newElementNum+'" title="职称级别" styleType="select" name="EMPBGTITLE_TITLEGRADE"  columnId="83869" class="form-control " style="width:200px;float:left;height:25px;padding:0;border:none;background-color:#fff"  emptyText=""  style="float:left;width:200px;" dataField1 = "dict"  textField="dictName" valueField="dictId" DictName="emp_TITLEGRADE" dataField="dicts_form_83869"initParam = "_"></select>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">获得日期: </label>'+
  '			<div class="controls input-append date form_date1 input-group" data-date=""  data-link-field="dtp_input2" data-link-format="yyyy-mm-dd" style="float:left;width: 134px;">'+
  '				<input style="width:134px;float:left;height:25px;padding:0;border:none;background-color:#fff"type="text" readonly class="form-control " dateType="controls input-append date form_date1" id="EMP_BG_TITLE.EMPBGTITLE_VALIDDATE_4367_add_'+newElementNum+'" styleType="dateTime"   style="width:134px;float:left;border-radius: 4px 0 0 4px;" name="EMPBGTITLE_VALIDDATE"  format="yyyy-MM-dd" valueformat="yyyy-MM-dd" />'+
	'				<span class="input-group-addon" name="closeButton" style="padding:1px 10px 2px 10px;font-size:12px"><span class="glyphicon glyphicon-remove"></span></span>'+
  '				<span class="input-group-addon" name="clickButton" style="padding:1px 10px 2px 10px;font-size:12px"><span class="glyphicon glyphicon-th"></span></span>'+
  '			</div>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">证书编号: </label>'+
  '			<input id="EMP_BG_TITLE.EMPBGTITLE_TITLENO_4367_add_'+newElementNum+'" name="EMPBGTITLE_TITLENO" dataType="text" type="text" class="form-control" oninput="myFunction(this,\'EMPBGTITLE_TITLENO\')"  vtype="illegalChar;maxLength:500;minLength:null;"   style="width:200px;height:25px;padding:0;border:none;background-color:#fff;display:inline"/>'+
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
	 if(e=='fubiao4'){
		 var cellObj = '';
		 cellObj +=	'<div name="fubiaoElement" class="col-md-12 col-sm-12 col-lg-12" id="newElement'+newElementNum+'">'+
					'    <div class="contact-box CCAdd">'+
					'<form class="row cell add_element" style="padding-right:50px">';
		 cellObj += '	<span class="fa fa-trash-o deleteButton" style="position: absolute;right: 30px;font-size: 25px" onclick="removeElement('+newElementNum+')"></span>'+
					'	<span class="fa fa-save saveButton" style="position: absolute;right: 30px;font-size: 25px;top:50px" onclick="saveElement(this,\'4365\')"></span>'+
  '	<input id="EMP_BG_WORKEXPERIENCE.EMPBGWORKEXPERIENCE_EMPID_4365" name="EMPBGWORKEXPERIENCE_EMPID"   type="hidden" >'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">开始时间: </label>'+
  '			<div class="controls input-append date form_date1 input-group" data-date=""  data-link-field="dtp_input2" data-link-format="yyyy-mm-dd" style="float:left;width: 134px;">'+
  '				<input style="width:134px;float:left;height:25px;padding:0;border:none;background-color:#fff"type="text" readonly class="form-control " dateType="controls input-append date form_date1" id="EMP_BG_WORKEXPERIENCE.EMPBGWORKEXPERIENCE_BEGINDATE_4365_add_'+newElementNum+'" styleType="dateTime"   style="width:134px;float:left;border-radius: 4px 0 0 4px;" name="EMPBGWORKEXPERIENCE_BEGINDATE"  format="yyyy-MM-dd" valueformat="yyyy-MM-dd" />'+
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
  '				<input style="width:134px;float:left;height:25px;padding:0;border:none;background-color:#fff"type="text" readonly class="form-control " dateType="controls input-append date form_date1" id="EMP_BG_WORKEXPERIENCE.EMPBGWORKEXPERIENCE_ENDDATE_4365_add_'+newElementNum+'" styleType="dateTime"   style="width:134px;float:left;border-radius: 4px 0 0 4px;" name="EMPBGWORKEXPERIENCE_ENDDATE"  format="yyyy-MM-dd" valueformat="yyyy-MM-dd" />'+
	'				<span class="input-group-addon" name="closeButton" style="padding:1px 10px 2px 10px;font-size:12px"><span class="glyphicon glyphicon-remove"></span></span>'+
  '				<span class="input-group-addon" name="clickButton" style="padding:1px 10px 2px 10px;font-size:12px"><span class="glyphicon glyphicon-th"></span></span>'+
  '			</div>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;line-height:25px">工作单位: </label>'+
  '			<textarea id="EMP_BG_WORKEXPERIENCE.EMPBGWORKEXPERIENCE_WORKUNIT_4365_add_'+newElementNum+'" name="EMPBGWORKEXPERIENCE_WORKUNIT" class="CCReadTextarea form-control"  vtype="illegalChar;maxLength:200;minLength:null;"   style="width:200px;height:25px;padding:0;border:none;background-color:#fff"></textarea>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">所在部门: </label>'+
  '			<input id="EMP_BG_WORKEXPERIENCE.EMPBGWORKEXPERIENCE_DEPARTMENT_4365_add_'+newElementNum+'" name="EMPBGWORKEXPERIENCE_DEPARTMENT" dataType="text" type="text" class="form-control" oninput="myFunction(this,\'EMPBGWORKEXPERIENCE_DEPARTMENT\')"  vtype="illegalChar;maxLength:200;minLength:null;"   style="width:200px;height:25px;padding:0;border:none;background-color:#fff;display:inline"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">职位: </label>'+
  '			<input id="EMP_BG_WORKEXPERIENCE.EMPBGWORKEXPERIENCE_POSITION_4365_add_'+newElementNum+'" name="EMPBGWORKEXPERIENCE_POSITION" dataType="text" type="text" class="form-control" oninput="myFunction(this,\'EMPBGWORKEXPERIENCE_POSITION\')"  vtype="illegalChar;maxLength:200;minLength:null;"   style="width:200px;height:25px;padding:0;border:none;background-color:#fff;display:inline"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">用工性质: </label>'+
  '			<input id="EMP_BG_WORKEXPERIENCE.EMPBGWORKEXPERIENCE_WORKNATURE_4365_add_'+newElementNum+'" name="EMPBGWORKEXPERIENCE_WORKNATURE" dataType="text" type="text" class="form-control" oninput="myFunction(this,\'EMPBGWORKEXPERIENCE_WORKNATURE\')"  vtype="illegalChar;maxLength:30;minLength:null;"   style="width:200px;height:25px;padding:0;border:none;background-color:#fff;display:inline"/>'+
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
var EMPVEMPLOYEE_EMPID = '';
if(arr.length>0&&arr[i].EMPVEMPLOYEE_EMPID!=null){
EMPVEMPLOYEE_EMPID = arr[i].EMPVEMPLOYEE_EMPID;
}
var EMPVEMPLOYEE_EMPSTATUS = '';
if(arr.length>0&&arr[i].EMPVEMPLOYEE_EMPSTATUS!=null){
EMPVEMPLOYEE_EMPSTATUS = arr[i].EMPVEMPLOYEE_EMPSTATUS;
}
if(arr.length>0&&arr[i].EMPVEMPLOYEE_EMPSTATUS!=null){
var kvArray_83846 = {'1':'在职','2':'离职','3':'退休'};
EMPVEMPLOYEE_EMPSTATUS = kvArray_83846[EMPVEMPLOYEE_EMPSTATUS];
}
var EMPVEMPLOYEE_JOBSTATUS = '';
if(arr.length>0&&arr[i].EMPVEMPLOYEE_JOBSTATUS!=null){
EMPVEMPLOYEE_JOBSTATUS = arr[i].EMPVEMPLOYEE_JOBSTATUS;
}
if(arr.length>0&&arr[i].EMPVEMPLOYEE_JOBSTATUS!=null){
var kvArray_83847 = {'1':'正式在职','2':'实习在职','3':'试用在职','4':'内退','5':'待岗','6':'长期病假','7':'停薪留职','8':'离岗退养','9':'因公外派','10':'退休','11':'系统内离退休返聘','12':'脱密期'};
EMPVEMPLOYEE_JOBSTATUS = kvArray_83847[EMPVEMPLOYEE_JOBSTATUS];
}
var EMPVEMPLOYEE_EMPTYPE = '';
if(arr.length>0&&arr[i].EMPVEMPLOYEE_EMPTYPE!=null){
EMPVEMPLOYEE_EMPTYPE = arr[i].EMPVEMPLOYEE_EMPTYPE;
}
if(arr.length>0&&arr[i].EMPVEMPLOYEE_EMPTYPE!=null){
var kvArray_83848 = {'1':'合同工','2':'派遣工','3':'外包人员','4':'外部理董监事','5':'退休返聘工','6':'临时工','6':'其他'};
EMPVEMPLOYEE_EMPTYPE = kvArray_83848[EMPVEMPLOYEE_EMPTYPE];
}
var EMPVEMPLOYEE_BELONGLINE = '';
if(arr.length>0&&arr[i].EMPVEMPLOYEE_BELONGLINE!=null){
EMPVEMPLOYEE_BELONGLINE = arr[i].EMPVEMPLOYEE_BELONGLINE;
}
if(arr.length>0&&arr[i].EMPVEMPLOYEE_BELONGLINE!=null){
var kvArray_83849 = {'1':'运营条线','2':'零售条线','3':'客户经理条线','4':'分支行中后台','5':'分支行班子','6':'风险总监','7':'总行','8':'社区支行条线','9':'改任','10':'其他'};
EMPVEMPLOYEE_BELONGLINE = kvArray_83849[EMPVEMPLOYEE_BELONGLINE];
}
var EMPVEMPLOYEE_JOINDATE = '';
if(arr.length>0&&arr[i].EMPVEMPLOYEE_JOINDATE!=null){
EMPVEMPLOYEE_JOINDATE = arr[i].EMPVEMPLOYEE_JOINDATE;
}
if(EMPVEMPLOYEE_JOINDATE!=null&&EMPVEMPLOYEE_JOINDATE!=''){
EMPVEMPLOYEE_JOINDATE = new Date(parseInt(EMPVEMPLOYEE_JOINDATE)).Format("yyyy-MM-dd");
}else{EMPVEMPLOYEE_JOINDATE=""}
var EMPVEMPLOYEE_COMPYEARS = '';
if(arr.length>0&&arr[i].EMPVEMPLOYEE_COMPYEARS!=null){
EMPVEMPLOYEE_COMPYEARS = arr[i].EMPVEMPLOYEE_COMPYEARS;
}
var EMPVEMPLOYEE_BEGINWORKDATE = '';
if(arr.length>0&&arr[i].EMPVEMPLOYEE_BEGINWORKDATE!=null){
EMPVEMPLOYEE_BEGINWORKDATE = arr[i].EMPVEMPLOYEE_BEGINWORKDATE;
}
if(EMPVEMPLOYEE_BEGINWORKDATE!=null&&EMPVEMPLOYEE_BEGINWORKDATE!=''){
EMPVEMPLOYEE_BEGINWORKDATE = new Date(parseInt(EMPVEMPLOYEE_BEGINWORKDATE)).Format("yyyy-MM-dd");
}else{EMPVEMPLOYEE_BEGINWORKDATE=""}
var EMPVEMPLOYEE_WORKYEARS = '';
if(arr.length>0&&arr[i].EMPVEMPLOYEE_WORKYEARS!=null){
EMPVEMPLOYEE_WORKYEARS = arr[i].EMPVEMPLOYEE_WORKYEARS;
}
var EMPVEMPLOYEE_JOBBEGINDATE = '';
if(arr.length>0&&arr[i].EMPVEMPLOYEE_JOBBEGINDATE!=null){
EMPVEMPLOYEE_JOBBEGINDATE = arr[i].EMPVEMPLOYEE_JOBBEGINDATE;
}
if(EMPVEMPLOYEE_JOBBEGINDATE!=null&&EMPVEMPLOYEE_JOBBEGINDATE!=''){
EMPVEMPLOYEE_JOBBEGINDATE = new Date(parseInt(EMPVEMPLOYEE_JOBBEGINDATE)).Format("yyyy-MM-dd");
}else{EMPVEMPLOYEE_JOBBEGINDATE=""}
var EMPVEMPLOYEE_JOBAGE = '';
if(arr.length>0&&arr[i].EMPVEMPLOYEE_JOBAGE!=null){
EMPVEMPLOYEE_JOBAGE = arr[i].EMPVEMPLOYEE_JOBAGE;
}
var EMPVEMPLOYEE_YEAROLDS = '';
if(arr.length>0&&arr[i].EMPVEMPLOYEE_YEAROLDS!=null){
EMPVEMPLOYEE_YEAROLDS = arr[i].EMPVEMPLOYEE_YEAROLDS;
}
var EMPVEMPLOYEE_MAXEDUCATION = '';
if(arr.length>0&&arr[i].EMPVEMPLOYEE_MAXEDUCATION!=null){
EMPVEMPLOYEE_MAXEDUCATION = arr[i].EMPVEMPLOYEE_MAXEDUCATION;
}
var EMPVEMPLOYEE_MAXDEGREE = '';
if(arr.length>0&&arr[i].EMPVEMPLOYEE_MAXDEGREE!=null){
EMPVEMPLOYEE_MAXDEGREE = arr[i].EMPVEMPLOYEE_MAXDEGREE;
}
var EMPVEMPLOYEE_GRADUASCHOOL = '';
if(arr.length>0&&arr[i].EMPVEMPLOYEE_GRADUASCHOOL!=null){
EMPVEMPLOYEE_GRADUASCHOOL = arr[i].EMPVEMPLOYEE_GRADUASCHOOL;
}
var EMPVEMPLOYEE_PROFESSION = '';
if(arr.length>0&&arr[i].EMPVEMPLOYEE_PROFESSION!=null){
EMPVEMPLOYEE_PROFESSION = arr[i].EMPVEMPLOYEE_PROFESSION;
}
var EMPVEMPLOYEE_POLITICALSTATUS = '';
if(arr.length>0&&arr[i].EMPVEMPLOYEE_POLITICALSTATUS!=null){
EMPVEMPLOYEE_POLITICALSTATUS = arr[i].EMPVEMPLOYEE_POLITICALSTATUS;
}
if(arr.length>0&&arr[i].EMPVEMPLOYEE_POLITICALSTATUS!=null){
var kvArray_83861 = {'2':'中共预备党员','1':'中共党员','3':'共青团员','4':'民主党派','5':'群众','6':'未知'};
EMPVEMPLOYEE_POLITICALSTATUS = kvArray_83861[EMPVEMPLOYEE_POLITICALSTATUS];
}
var EMPVEMPLOYEE_BEGINPRODATE = '';
if(arr.length>0&&arr[i].EMPVEMPLOYEE_BEGINPRODATE!=null){
EMPVEMPLOYEE_BEGINPRODATE = arr[i].EMPVEMPLOYEE_BEGINPRODATE;
}
if(EMPVEMPLOYEE_BEGINPRODATE!=null&&EMPVEMPLOYEE_BEGINPRODATE!=''){
EMPVEMPLOYEE_BEGINPRODATE = new Date(parseInt(EMPVEMPLOYEE_BEGINPRODATE)).Format("yyyy-MM-dd");
}else{EMPVEMPLOYEE_BEGINPRODATE=""}
var EMPVEMPLOYEE_WHELEADER = '';
if(arr.length>0&&arr[i].EMPVEMPLOYEE_WHELEADER!=null){
EMPVEMPLOYEE_WHELEADER = arr[i].EMPVEMPLOYEE_WHELEADER;
}
if(arr.length>0&&arr[i].EMPVEMPLOYEE_WHELEADER!=null){
var kvArray_83863 = {'0':'否','1':'是'};
EMPVEMPLOYEE_WHELEADER = kvArray_83863[EMPVEMPLOYEE_WHELEADER];
}
var EMPVEMPLOYEE_LOCATION = '';
if(arr.length>0&&arr[i].EMPVEMPLOYEE_LOCATION!=null){
EMPVEMPLOYEE_LOCATION = arr[i].EMPVEMPLOYEE_LOCATION;
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
  '	<input id="EMP_V_EMPLOYEE.EMPVEMPLOYEE_EMPID_4366" name="EMPVEMPLOYEE_EMPID" value="'+EMPVEMPLOYEE_EMPID+'"  type="hidden" >'+
  '	<input id="EMP_V_EMPLOYEE.EMPVEMPLOYEE_MAXEDUCATION_4366" name="EMPVEMPLOYEE_MAXEDUCATION" value="'+EMPVEMPLOYEE_MAXEDUCATION+'"  type="hidden" >'+
  '	<input id="EMP_V_EMPLOYEE.EMPVEMPLOYEE_MAXDEGREE_4366" name="EMPVEMPLOYEE_MAXDEGREE" value="'+EMPVEMPLOYEE_MAXDEGREE+'"  type="hidden" >'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;line-height:25px">员工状态:'+EMPVEMPLOYEE_EMPSTATUS+' </label>'+
  '			<input id="EMP_V_EMPLOYEE.EMPVEMPLOYEE_EMPSTATUS_4366_'+i+'" name="EMPVEMPLOYEE_EMPSTATUS" datatype="hidden" class="CCReadText"  value="'+EMPVEMPLOYEE_EMPSTATUS+'" type="hidden" readonly oninput="myFunction(this,\'EMPVEMPLOYEE_EMPSTATUS\')"   style="width:200px;height:25px;padding:0;border:none;background-color:#fff"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;line-height:25px">在岗状态:'+EMPVEMPLOYEE_JOBSTATUS+' </label>'+
  '			<input id="EMP_V_EMPLOYEE.EMPVEMPLOYEE_JOBSTATUS_4366_'+i+'" name="EMPVEMPLOYEE_JOBSTATUS" datatype="hidden" class="CCReadText"  value="'+EMPVEMPLOYEE_JOBSTATUS+'" type="hidden" readonly oninput="myFunction(this,\'EMPVEMPLOYEE_JOBSTATUS\')"   style="width:200px;height:25px;padding:0;border:none;background-color:#fff"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;line-height:25px">员工类型:'+EMPVEMPLOYEE_JOBSTATUS+' </label>'+
  '			<input id="EMP_V_EMPLOYEE.EMPVEMPLOYEE_EMPTYPE_4366_'+i+'" name="EMPVEMPLOYEE_EMPTYPE" datatype="hidden" class="CCReadText"  value="'+EMPVEMPLOYEE_EMPTYPE+'" type="hidden" readonly oninput="myFunction(this,\'EMPVEMPLOYEE_EMPTYPE\')"   style="width:200px;height:25px;padding:0;border:none;background-color:#fff"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;line-height:25px">所属条线:'+EMPVEMPLOYEE_JOBSTATUS+' </label>'+
  '			<input id="EMP_V_EMPLOYEE.EMPVEMPLOYEE_BELONGLINE_4366_'+i+'" name="EMPVEMPLOYEE_BELONGLINE" datatype="hidden" class="CCReadText"  value="'+EMPVEMPLOYEE_BELONGLINE+'" type="hidden" readonly oninput="myFunction(this,\'EMPVEMPLOYEE_BELONGLINE\')"   style="width:200px;height:25px;padding:0;border:none;background-color:#fff"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;line-height:25px">入职日期:'+EMPVEMPLOYEE_JOBSTATUS+' </label>'+
  '			<input id="EMP_V_EMPLOYEE.EMPVEMPLOYEE_JOINDATE_4366_'+i+'" name="EMPVEMPLOYEE_JOINDATE" datatype="hidden" class="CCReadText"  value="'+EMPVEMPLOYEE_JOINDATE+'" type="hidden" readonly oninput="myFunction(this,\'EMPVEMPLOYEE_JOINDATE\')"   style="width:200px;height:25px;padding:0;border:none;background-color:#fff"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;line-height:25px">行龄:'+EMPVEMPLOYEE_JOBSTATUS+' </label>'+
  '			<input id="EMP_V_EMPLOYEE.EMPVEMPLOYEE_COMPYEARS_4366_'+i+'" name="EMPVEMPLOYEE_COMPYEARS" datatype="hidden" class="CCReadText"  value="'+EMPVEMPLOYEE_COMPYEARS+'" type="hidden" readonly oninput="myFunction(this,\'EMPVEMPLOYEE_COMPYEARS\')"   style="width:200px;height:25px;padding:0;border:none;background-color:#fff"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;line-height:25px">参加工作日期:'+EMPVEMPLOYEE_JOBSTATUS+' </label>'+
  '			<input id="EMP_V_EMPLOYEE.EMPVEMPLOYEE_BEGINWORKDATE_4366_'+i+'" name="EMPVEMPLOYEE_BEGINWORKDATE" datatype="hidden" class="CCReadText"  value="'+EMPVEMPLOYEE_BEGINWORKDATE+'" type="hidden" readonly oninput="myFunction(this,\'EMPVEMPLOYEE_BEGINWORKDATE\')"   style="width:200px;height:25px;padding:0;border:none;background-color:#fff"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;line-height:25px">工龄:'+EMPVEMPLOYEE_JOBSTATUS+' </label>'+
  '			<input id="EMP_V_EMPLOYEE.EMPVEMPLOYEE_WORKYEARS_4366_'+i+'" name="EMPVEMPLOYEE_WORKYEARS" datatype="hidden" class="CCReadText"  value="'+EMPVEMPLOYEE_WORKYEARS+'" type="hidden" readonly oninput="myFunction(this,\'EMPVEMPLOYEE_WORKYEARS\')"   style="width:200px;height:25px;padding:0;border:none;background-color:#fff"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;line-height:25px">任现岗位时间:'+EMPVEMPLOYEE_JOBSTATUS+' </label>'+
  '			<input id="EMP_V_EMPLOYEE.EMPVEMPLOYEE_JOBBEGINDATE_4366_'+i+'" name="EMPVEMPLOYEE_JOBBEGINDATE" datatype="hidden" class="CCReadText"  value="'+EMPVEMPLOYEE_JOBBEGINDATE+'" type="hidden" readonly oninput="myFunction(this,\'EMPVEMPLOYEE_JOBBEGINDATE\')"   style="width:200px;height:25px;padding:0;border:none;background-color:#fff"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;line-height:25px">岗龄:'+EMPVEMPLOYEE_JOBSTATUS+' </label>'+
  '			<input id="EMP_V_EMPLOYEE.EMPVEMPLOYEE_JOBAGE_4366_'+i+'" name="EMPVEMPLOYEE_JOBAGE" datatype="hidden" class="CCReadText"  value="'+EMPVEMPLOYEE_JOBAGE+'" type="hidden" readonly oninput="myFunction(this,\'EMPVEMPLOYEE_JOBAGE\')"   style="width:200px;height:25px;padding:0;border:none;background-color:#fff"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;line-height:25px">年龄:'+EMPVEMPLOYEE_JOBSTATUS+' </label>'+
  '			<input id="EMP_V_EMPLOYEE.EMPVEMPLOYEE_YEAROLDS_4366_'+i+'" name="EMPVEMPLOYEE_YEAROLDS" datatype="hidden" class="CCReadText"  value="'+EMPVEMPLOYEE_YEAROLDS+'" type="hidden" readonly oninput="myFunction(this,\'EMPVEMPLOYEE_YEAROLDS\')"   style="width:200px;height:25px;padding:0;border:none;background-color:#fff"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;line-height:25px">毕业院校:'+EMPVEMPLOYEE_JOBSTATUS+' </label>'+
  '			<input id="EMP_V_EMPLOYEE.EMPVEMPLOYEE_GRADUASCHOOL_4366_'+i+'" name="EMPVEMPLOYEE_GRADUASCHOOL" datatype="hidden" class="CCReadText"  value="'+EMPVEMPLOYEE_GRADUASCHOOL+'" type="hidden" readonly oninput="myFunction(this,\'EMPVEMPLOYEE_GRADUASCHOOL\')"   style="width:200px;height:25px;padding:0;border:none;background-color:#fff"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;line-height:25px">专业:'+EMPVEMPLOYEE_JOBSTATUS+' </label>'+
  '			<input id="EMP_V_EMPLOYEE.EMPVEMPLOYEE_PROFESSION_4366_'+i+'" name="EMPVEMPLOYEE_PROFESSION" datatype="hidden" class="CCReadText"  value="'+EMPVEMPLOYEE_PROFESSION+'" type="hidden" readonly oninput="myFunction(this,\'EMPVEMPLOYEE_PROFESSION\')"   style="width:200px;height:25px;padding:0;border:none;background-color:#fff"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;line-height:25px">政治面貌:'+EMPVEMPLOYEE_JOBSTATUS+' </label>'+
  '			<input id="EMP_V_EMPLOYEE.EMPVEMPLOYEE_POLITICALSTATUS_4366_'+i+'" name="EMPVEMPLOYEE_POLITICALSTATUS" datatype="hidden" class="CCReadText"  value="'+EMPVEMPLOYEE_POLITICALSTATUS+'" type="hidden" readonly oninput="myFunction(this,\'EMPVEMPLOYEE_POLITICALSTATUS\')"   style="width:200px;height:25px;padding:0;border:none;background-color:#fff"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;line-height:25px">加入党派时间:'+EMPVEMPLOYEE_JOBSTATUS+' </label>'+
  '			<input id="EMP_V_EMPLOYEE.EMPVEMPLOYEE_BEGINPRODATE_4366_'+i+'" name="EMPVEMPLOYEE_BEGINPRODATE" datatype="hidden" class="CCReadText"  value="'+EMPVEMPLOYEE_BEGINPRODATE+'" type="hidden" readonly oninput="myFunction(this,\'EMPVEMPLOYEE_BEGINPRODATE\')"   style="width:200px;height:25px;padding:0;border:none;background-color:#fff"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;line-height:25px">是否一把手:'+EMPVEMPLOYEE_JOBSTATUS+' </label>'+
  '			<input id="EMP_V_EMPLOYEE.EMPVEMPLOYEE_WHELEADER_4366_'+i+'" name="EMPVEMPLOYEE_WHELEADER" datatype="hidden" class="CCReadText"  value="'+EMPVEMPLOYEE_WHELEADER+'" type="hidden" readonly oninput="myFunction(this,\'EMPVEMPLOYEE_WHELEADER\')"   style="width:200px;height:25px;padding:0;border:none;background-color:#fff"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;line-height:25px">现居住地址:'+EMPVEMPLOYEE_JOBSTATUS+' </label>'+
  '			<input id="EMP_V_EMPLOYEE.EMPVEMPLOYEE_LOCATION_4366_'+i+'" name="EMPVEMPLOYEE_LOCATION" datatype="hidden" class="CCReadText"  value="'+EMPVEMPLOYEE_LOCATION+'" type="hidden" readonly oninput="myFunction(this,\'EMPVEMPLOYEE_LOCATION\')"   style="width:200px;height:25px;padding:0;border:none;background-color:#fff"/>'+
  '			<span style="color:red;"></span>'+
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
var EMPCONTRACT_CONNO = '';
if(arr.length>0&&arr[i].EMPCONTRACT_CONNO!=null){
EMPCONTRACT_CONNO = arr[i].EMPCONTRACT_CONNO;
}
var EMPCONTRACT_EMPID = '';
if(arr.length>0&&arr[i].EMPCONTRACT_EMPID!=null){
EMPCONTRACT_EMPID = arr[i].EMPCONTRACT_EMPID;
}
var EMPCONTRACT_CONTRACTUNIT = '';
if(arr.length>0&&arr[i].EMPCONTRACT_CONTRACTUNIT!=null){
EMPCONTRACT_CONTRACTUNIT = arr[i].EMPCONTRACT_CONTRACTUNIT;
}
if(arr.length>0&&arr[i].EMPCONTRACT_CONTRACTUNIT!=null){
var kvArray_83805 = {'1':'嘉兴银行股份有限公司','2':'嘉兴市新世纪人才派遣公司'};
EMPCONTRACT_CONTRACTUNIT = kvArray_83805[EMPCONTRACT_CONTRACTUNIT];
}
var EMPCONTRACT_CONTRACTTYPE = '';
if(arr.length>0&&arr[i].EMPCONTRACT_CONTRACTTYPE!=null){
EMPCONTRACT_CONTRACTTYPE = arr[i].EMPCONTRACT_CONTRACTTYPE;
}
if(arr.length>0&&arr[i].EMPCONTRACT_CONTRACTTYPE!=null){
var kvArray_83806 = {'1':'劳动合同','2':'派遣合同'};
EMPCONTRACT_CONTRACTTYPE = kvArray_83806[EMPCONTRACT_CONTRACTTYPE];
}
var EMPCONTRACT_CONTRACTKIND = '';
if(arr.length>0&&arr[i].EMPCONTRACT_CONTRACTKIND!=null){
EMPCONTRACT_CONTRACTKIND = arr[i].EMPCONTRACT_CONTRACTKIND;
}
if(arr.length>0&&arr[i].EMPCONTRACT_CONTRACTKIND!=null){
var kvArray_83807 = {'1':'固定期限','2':'无固定期限'};
EMPCONTRACT_CONTRACTKIND = kvArray_83807[EMPCONTRACT_CONTRACTKIND];
}
var EMPCONTRACT_CONBEGINDATE = '';
if(arr.length>0&&arr[i].EMPCONTRACT_CONBEGINDATE!=null){
EMPCONTRACT_CONBEGINDATE = arr[i].EMPCONTRACT_CONBEGINDATE;
}
if(EMPCONTRACT_CONBEGINDATE!=null&&EMPCONTRACT_CONBEGINDATE!=''){
EMPCONTRACT_CONBEGINDATE = new Date(parseInt(EMPCONTRACT_CONBEGINDATE)).Format("yyyy-MM-dd");
}else{EMPCONTRACT_CONBEGINDATE=""}
var EMPCONTRACT_CONMONTHS = '';
if(arr.length>0&&arr[i].EMPCONTRACT_CONMONTHS!=null){
EMPCONTRACT_CONMONTHS = arr[i].EMPCONTRACT_CONMONTHS;
}
var EMPCONTRACT_CONENDDATE = '';
if(arr.length>0&&arr[i].EMPCONTRACT_CONENDDATE!=null){
EMPCONTRACT_CONENDDATE = arr[i].EMPCONTRACT_CONENDDATE;
}
if(EMPCONTRACT_CONENDDATE!=null&&EMPCONTRACT_CONENDDATE!=''){
EMPCONTRACT_CONENDDATE = new Date(parseInt(EMPCONTRACT_CONENDDATE)).Format("yyyy-MM-dd");
}else{EMPCONTRACT_CONENDDATE=""}
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
  '	<input id="EMP_CONTRACT.EMPCONTRACT_CONNO_4363" name="EMPCONTRACT_CONNO" value="'+EMPCONTRACT_CONNO+'"  type="hidden" >'+
  '	<input id="EMP_CONTRACT.EMPCONTRACT_EMPID_4363" name="EMPCONTRACT_EMPID" value="'+EMPCONTRACT_EMPID+'"  type="hidden" >'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;line-height:25px">合同签约单位:'+EMPCONTRACT_CONTRACTUNIT+' </label>'+
  '			<input id="EMP_CONTRACT.EMPCONTRACT_CONTRACTUNIT_4363_'+i+'" name="EMPCONTRACT_CONTRACTUNIT" datatype="hidden" class="CCReadText"  value="'+EMPCONTRACT_CONTRACTUNIT+'" type="hidden" readonly oninput="myFunction(this,\'EMPCONTRACT_CONTRACTUNIT\')"   style="width:200px;height:25px;padding:0;border:none;background-color:#fff"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;line-height:25px">合同类型:'+EMPCONTRACT_CONTRACTUNIT+' </label>'+
  '			<input id="EMP_CONTRACT.EMPCONTRACT_CONTRACTTYPE_4363_'+i+'" name="EMPCONTRACT_CONTRACTTYPE" datatype="hidden" class="CCReadText"  value="'+EMPCONTRACT_CONTRACTTYPE+'" type="hidden" readonly oninput="myFunction(this,\'EMPCONTRACT_CONTRACTTYPE\')"   style="width:200px;height:25px;padding:0;border:none;background-color:#fff"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;line-height:25px">合同性质:'+EMPCONTRACT_CONTRACTUNIT+' </label>'+
  '			<input id="EMP_CONTRACT.EMPCONTRACT_CONTRACTKIND_4363_'+i+'" name="EMPCONTRACT_CONTRACTKIND" datatype="hidden" class="CCReadText"  value="'+EMPCONTRACT_CONTRACTKIND+'" type="hidden" readonly oninput="myFunction(this,\'EMPCONTRACT_CONTRACTKIND\')"   style="width:200px;height:25px;padding:0;border:none;background-color:#fff"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;line-height:25px">合同开始日期:'+EMPCONTRACT_CONTRACTUNIT+' </label>'+
  '			<input id="EMP_CONTRACT.EMPCONTRACT_CONBEGINDATE_4363_'+i+'" name="EMPCONTRACT_CONBEGINDATE" datatype="hidden" class="CCReadText"  value="'+EMPCONTRACT_CONBEGINDATE+'" type="hidden" readonly oninput="myFunction(this,\'EMPCONTRACT_CONBEGINDATE\')"   style="width:200px;height:25px;padding:0;border:none;background-color:#fff"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;line-height:25px">合同期限(年):'+EMPCONTRACT_CONTRACTUNIT+' </label>'+
  '			<input id="EMP_CONTRACT.EMPCONTRACT_CONMONTHS_4363_'+i+'" name="EMPCONTRACT_CONMONTHS" datatype="hidden" class="CCReadText"  value="'+EMPCONTRACT_CONMONTHS+'" type="hidden" readonly oninput="myFunction(this,\'EMPCONTRACT_CONMONTHS\')"   style="width:200px;height:25px;padding:0;border:none;background-color:#fff"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;line-height:25px">合同结束日期:'+EMPCONTRACT_CONTRACTUNIT+' </label>'+
  '			<input id="EMP_CONTRACT.EMPCONTRACT_CONENDDATE_4363_'+i+'" name="EMPCONTRACT_CONENDDATE" datatype="hidden" class="CCReadText"  value="'+EMPCONTRACT_CONENDDATE+'" type="hidden" readonly oninput="myFunction(this,\'EMPCONTRACT_CONENDDATE\')"   style="width:200px;height:25px;padding:0;border:none;background-color:#fff"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
							'		</div>'+
							'	</div>'+
							'</div>';
			}
	$("#"+e).find("[id='TEST_FEE_INFO_FORM']").html(cellObj);
}
	 if(e=='fubiao3'){
		 var cellObj = '';
		 for (var i = arr.length - 1; i >= 0; i--) {
var EMPBGTITLE_ID = '';
if(arr.length>0&&arr[i].EMPBGTITLE_ID!=null){
EMPBGTITLE_ID = arr[i].EMPBGTITLE_ID;
}
var EMPBGTITLE_EMPID = '';
if(arr.length>0&&arr[i].EMPBGTITLE_EMPID!=null){
EMPBGTITLE_EMPID = arr[i].EMPBGTITLE_EMPID;
}
var EMPBGTITLE_TITLE = '';
if(arr.length>0&&arr[i].EMPBGTITLE_TITLE!=null){
EMPBGTITLE_TITLE = arr[i].EMPBGTITLE_TITLE;
}
var EMPBGTITLE_TITLEGRADE = '';
if(arr.length>0&&arr[i].EMPBGTITLE_TITLEGRADE!=null){
EMPBGTITLE_TITLEGRADE = arr[i].EMPBGTITLE_TITLEGRADE;
}
if(arr.length>0&&arr[i].EMPBGTITLE_TITLEGRADE!=null){
var kvArray_83869 = {'1':'高级','2':'中级','3':'初级','4':'无职称'};
EMPBGTITLE_TITLEGRADE = kvArray_83869[EMPBGTITLE_TITLEGRADE];
}
var EMPBGTITLE_VALIDDATE = '';
if(arr.length>0&&arr[i].EMPBGTITLE_VALIDDATE!=null){
EMPBGTITLE_VALIDDATE = arr[i].EMPBGTITLE_VALIDDATE;
}
if(EMPBGTITLE_VALIDDATE!=null&&EMPBGTITLE_VALIDDATE!=''){
EMPBGTITLE_VALIDDATE = new Date(parseInt(EMPBGTITLE_VALIDDATE)).Format("yyyy-MM-dd");
}else{EMPBGTITLE_VALIDDATE=""}
var EMPBGTITLE_TITLENO = '';
if(arr.length>0&&arr[i].EMPBGTITLE_TITLENO!=null){
EMPBGTITLE_TITLENO = arr[i].EMPBGTITLE_TITLENO;
}
			if(0 == Currentpage13){
				cellObj += '<span class="fa fa-arrow-circle-right" style="font-size:30px;padding-right:15px;float:right" onclick="next(\''+e+'\')"></span>';
			}else if(total-1==Currentpage13){
				cellObj += '<span class="fa fa-arrow-circle-left" style="font-size:30px;padding-right:15px;float:right" onclick="last(\''+e+'\')"></span>';
			}else{
				cellObj += '<span class="fa fa-arrow-circle-right" style="font-size:30px;padding-right:15px;float:right" onclick="next(\''+e+'\')"></span>'+
						   '<span class="fa fa-arrow-circle-left" style="font-size:30px;padding-right:15px;float:right" onclick="last(\''+e+'\')"></span>';
			}
			cellObj += 		'<div name="fubiaoElement"  class="col-md-12 col-sm-12 col-lg-12">'+
							'    <div class="contact-box">'+
							'		<div class="row cell">'+
  '	<input id="EMP_BG_TITLE.EMPBGTITLE_ID_4367" name="EMPBGTITLE_ID" value="'+EMPBGTITLE_ID+'"  type="hidden" >'+
  '	<input id="EMP_BG_TITLE.EMPBGTITLE_EMPID_4367" name="EMPBGTITLE_EMPID" value="'+EMPBGTITLE_EMPID+'"  type="hidden" >'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;line-height:25px">职称名:'+EMPBGTITLE_TITLE+' </label>'+
  '			<input id="EMP_BG_TITLE.EMPBGTITLE_TITLE_4367_'+i+'" name="EMPBGTITLE_TITLE" datatype="hidden" class="CCReadText"  value="'+EMPBGTITLE_TITLE+'" type="hidden" readonly oninput="myFunction(this,\'EMPBGTITLE_TITLE\')"   style="width:200px;height:25px;padding:0;border:none;background-color:#fff"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;line-height:25px">职称级别:'+EMPBGTITLE_TITLE+' </label>'+
  '			<input id="EMP_BG_TITLE.EMPBGTITLE_TITLEGRADE_4367_'+i+'" name="EMPBGTITLE_TITLEGRADE" datatype="hidden" class="CCReadText"  value="'+EMPBGTITLE_TITLEGRADE+'" type="hidden" readonly oninput="myFunction(this,\'EMPBGTITLE_TITLEGRADE\')"   style="width:200px;height:25px;padding:0;border:none;background-color:#fff"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;line-height:25px">获得日期:'+EMPBGTITLE_TITLE+' </label>'+
  '			<input id="EMP_BG_TITLE.EMPBGTITLE_VALIDDATE_4367_'+i+'" name="EMPBGTITLE_VALIDDATE" datatype="hidden" class="CCReadText"  value="'+EMPBGTITLE_VALIDDATE+'" type="hidden" readonly oninput="myFunction(this,\'EMPBGTITLE_VALIDDATE\')"   style="width:200px;height:25px;padding:0;border:none;background-color:#fff"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;line-height:25px">证书编号:'+EMPBGTITLE_TITLE+' </label>'+
  '			<input id="EMP_BG_TITLE.EMPBGTITLE_TITLENO_4367_'+i+'" name="EMPBGTITLE_TITLENO" datatype="hidden" class="CCReadText"  value="'+EMPBGTITLE_TITLENO+'" type="hidden" readonly oninput="myFunction(this,\'EMPBGTITLE_TITLENO\')"   style="width:200px;height:25px;padding:0;border:none;background-color:#fff"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
							'		</div>'+
							'	</div>'+
							'</div>';
			}
	$("#"+e).find("[id='TEST_FEE_INFO_FORM']").html(cellObj);
}
	 if(e=='fubiao4'){
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
var EMPBGWORKEXPERIENCE_DEPARTMENT = '';
if(arr.length>0&&arr[i].EMPBGWORKEXPERIENCE_DEPARTMENT!=null){
EMPBGWORKEXPERIENCE_DEPARTMENT = arr[i].EMPBGWORKEXPERIENCE_DEPARTMENT;
}
var EMPBGWORKEXPERIENCE_POSITION = '';
if(arr.length>0&&arr[i].EMPBGWORKEXPERIENCE_POSITION!=null){
EMPBGWORKEXPERIENCE_POSITION = arr[i].EMPBGWORKEXPERIENCE_POSITION;
}
var EMPBGWORKEXPERIENCE_WORKNATURE = '';
if(arr.length>0&&arr[i].EMPBGWORKEXPERIENCE_WORKNATURE!=null){
EMPBGWORKEXPERIENCE_WORKNATURE = arr[i].EMPBGWORKEXPERIENCE_WORKNATURE;
}
			if(0 == Currentpage14){
				cellObj += '<span class="fa fa-arrow-circle-right" style="font-size:30px;padding-right:15px;float:right" onclick="next(\''+e+'\')"></span>';
			}else if(total-1==Currentpage14){
				cellObj += '<span class="fa fa-arrow-circle-left" style="font-size:30px;padding-right:15px;float:right" onclick="last(\''+e+'\')"></span>';
			}else{
				cellObj += '<span class="fa fa-arrow-circle-right" style="font-size:30px;padding-right:15px;float:right" onclick="next(\''+e+'\')"></span>'+
						   '<span class="fa fa-arrow-circle-left" style="font-size:30px;padding-right:15px;float:right" onclick="last(\''+e+'\')"></span>';
			}
			cellObj += 		'<div name="fubiaoElement"  class="col-md-12 col-sm-12 col-lg-12">'+
							'    <div class="contact-box">'+
							'		<div class="row cell">'+
  '	<input id="EMP_BG_WORKEXPERIENCE.EMPBGWORKEXPERIENCE_EMPID_4365" name="EMPBGWORKEXPERIENCE_EMPID" value="'+EMPBGWORKEXPERIENCE_EMPID+'"  type="hidden" >'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;line-height:25px">开始时间:'+EMPBGWORKEXPERIENCE_BEGINDATE+' </label>'+
  '			<input id="EMP_BG_WORKEXPERIENCE.EMPBGWORKEXPERIENCE_BEGINDATE_4365_'+i+'" name="EMPBGWORKEXPERIENCE_BEGINDATE" datatype="hidden" class="CCReadText"  value="'+EMPBGWORKEXPERIENCE_BEGINDATE+'" type="hidden" readonly oninput="myFunction(this,\'EMPBGWORKEXPERIENCE_BEGINDATE\')"   style="width:200px;height:25px;padding:0;border:none;background-color:#fff"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;line-height:25px">结束时间:'+EMPBGWORKEXPERIENCE_BEGINDATE+' </label>'+
  '			<input id="EMP_BG_WORKEXPERIENCE.EMPBGWORKEXPERIENCE_ENDDATE_4365_'+i+'" name="EMPBGWORKEXPERIENCE_ENDDATE" datatype="hidden" class="CCReadText"  value="'+EMPBGWORKEXPERIENCE_ENDDATE+'" type="hidden" readonly oninput="myFunction(this,\'EMPBGWORKEXPERIENCE_ENDDATE\')"   style="width:200px;height:25px;padding:0;border:none;background-color:#fff"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;line-height:25px">工作单位:'+EMPBGWORKEXPERIENCE_BEGINDATE+' </label>'+
  '			<input id="EMP_BG_WORKEXPERIENCE.EMPBGWORKEXPERIENCE_WORKUNIT_4365_'+i+'" name="EMPBGWORKEXPERIENCE_WORKUNIT" datatype="hidden" class="CCReadText"  value="'+EMPBGWORKEXPERIENCE_WORKUNIT+'" type="hidden" readonly oninput="myFunction(this,\'EMPBGWORKEXPERIENCE_WORKUNIT\')"   style="width:200px;height:25px;padding:0;border:none;background-color:#fff"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;line-height:25px">所在部门:'+EMPBGWORKEXPERIENCE_BEGINDATE+' </label>'+
  '			<input id="EMP_BG_WORKEXPERIENCE.EMPBGWORKEXPERIENCE_DEPARTMENT_4365_'+i+'" name="EMPBGWORKEXPERIENCE_DEPARTMENT" datatype="hidden" class="CCReadText"  value="'+EMPBGWORKEXPERIENCE_DEPARTMENT+'" type="hidden" readonly oninput="myFunction(this,\'EMPBGWORKEXPERIENCE_DEPARTMENT\')"   style="width:200px;height:25px;padding:0;border:none;background-color:#fff"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;line-height:25px">职位:'+EMPBGWORKEXPERIENCE_BEGINDATE+' </label>'+
  '			<input id="EMP_BG_WORKEXPERIENCE.EMPBGWORKEXPERIENCE_POSITION_4365_'+i+'" name="EMPBGWORKEXPERIENCE_POSITION" datatype="hidden" class="CCReadText"  value="'+EMPBGWORKEXPERIENCE_POSITION+'" type="hidden" readonly oninput="myFunction(this,\'EMPBGWORKEXPERIENCE_POSITION\')"   style="width:200px;height:25px;padding:0;border:none;background-color:#fff"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;line-height:25px">用工性质:'+EMPBGWORKEXPERIENCE_BEGINDATE+'</label>'+
  '			<input id="EMP_BG_WORKEXPERIENCE.EMPBGWORKEXPERIENCE_WORKNATURE_4365_'+i+'" name="EMPBGWORKEXPERIENCE_WORKNATURE" datatype="hidden" class="CCReadText"  value="'+EMPBGWORKEXPERIENCE_WORKNATURE+'" type="hidden" readonly oninput="myFunction(this,\'EMPBGWORKEXPERIENCE_WORKNATURE\')"   style="width:200px;height:25px;padding:0;border:none;background-color:#fff"/>'+
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
var EMPVEMPLOYEE_EMPID = '';
if(arr.length>0&&arr[i].EMPVEMPLOYEE_EMPID!=null){
EMPVEMPLOYEE_EMPID = arr[i].EMPVEMPLOYEE_EMPID;
}
var EMPVEMPLOYEE_EMPSTATUS = '';
if(arr.length>0&&arr[i].EMPVEMPLOYEE_EMPSTATUS!=null){
EMPVEMPLOYEE_EMPSTATUS = arr[i].EMPVEMPLOYEE_EMPSTATUS;
}
if(arr.length>0&&arr[i].EMPVEMPLOYEE_EMPSTATUS!=null){
var kvArray_83846 = {'1':'在职','2':'离职','3':'退休'};
EMPVEMPLOYEE_EMPSTATUS = kvArray_83846[EMPVEMPLOYEE_EMPSTATUS];
}
var EMPVEMPLOYEE_JOBSTATUS = '';
if(arr.length>0&&arr[i].EMPVEMPLOYEE_JOBSTATUS!=null){
EMPVEMPLOYEE_JOBSTATUS = arr[i].EMPVEMPLOYEE_JOBSTATUS;
}
if(arr.length>0&&arr[i].EMPVEMPLOYEE_JOBSTATUS!=null){
var kvArray_83847 = {'1':'正式在职','2':'实习在职','3':'试用在职','4':'内退','5':'待岗','6':'长期病假','7':'停薪留职','8':'离岗退养','9':'因公外派','10':'退休','11':'系统内离退休返聘','12':'脱密期'};
EMPVEMPLOYEE_JOBSTATUS = kvArray_83847[EMPVEMPLOYEE_JOBSTATUS];
}
var EMPVEMPLOYEE_EMPTYPE = '';
if(arr.length>0&&arr[i].EMPVEMPLOYEE_EMPTYPE!=null){
EMPVEMPLOYEE_EMPTYPE = arr[i].EMPVEMPLOYEE_EMPTYPE;
}
if(arr.length>0&&arr[i].EMPVEMPLOYEE_EMPTYPE!=null){
var kvArray_83848 = {'1':'合同工','2':'派遣工','3':'外包人员','4':'外部理董监事','5':'退休返聘工','6':'临时工','6':'其他'};
EMPVEMPLOYEE_EMPTYPE = kvArray_83848[EMPVEMPLOYEE_EMPTYPE];
}
var EMPVEMPLOYEE_BELONGLINE = '';
if(arr.length>0&&arr[i].EMPVEMPLOYEE_BELONGLINE!=null){
EMPVEMPLOYEE_BELONGLINE = arr[i].EMPVEMPLOYEE_BELONGLINE;
}
if(arr.length>0&&arr[i].EMPVEMPLOYEE_BELONGLINE!=null){
var kvArray_83849 = {'1':'运营条线','2':'零售条线','3':'客户经理条线','4':'分支行中后台','5':'分支行班子','6':'风险总监','7':'总行','8':'社区支行条线','9':'改任','10':'其他'};
EMPVEMPLOYEE_BELONGLINE = kvArray_83849[EMPVEMPLOYEE_BELONGLINE];
}
var EMPVEMPLOYEE_JOINDATE = '';
if(arr.length>0&&arr[i].EMPVEMPLOYEE_JOINDATE!=null){
EMPVEMPLOYEE_JOINDATE = arr[i].EMPVEMPLOYEE_JOINDATE;
}
if(EMPVEMPLOYEE_JOINDATE!=null&&EMPVEMPLOYEE_JOINDATE!=''){
EMPVEMPLOYEE_JOINDATE = new Date(parseInt(EMPVEMPLOYEE_JOINDATE)).Format("yyyy-MM-dd");
}else{EMPVEMPLOYEE_JOINDATE=""}
var EMPVEMPLOYEE_COMPYEARS = '';
if(arr.length>0&&arr[i].EMPVEMPLOYEE_COMPYEARS!=null){
EMPVEMPLOYEE_COMPYEARS = arr[i].EMPVEMPLOYEE_COMPYEARS;
}
var EMPVEMPLOYEE_BEGINWORKDATE = '';
if(arr.length>0&&arr[i].EMPVEMPLOYEE_BEGINWORKDATE!=null){
EMPVEMPLOYEE_BEGINWORKDATE = arr[i].EMPVEMPLOYEE_BEGINWORKDATE;
}
if(EMPVEMPLOYEE_BEGINWORKDATE!=null&&EMPVEMPLOYEE_BEGINWORKDATE!=''){
EMPVEMPLOYEE_BEGINWORKDATE = new Date(parseInt(EMPVEMPLOYEE_BEGINWORKDATE)).Format("yyyy-MM-dd");
}else{EMPVEMPLOYEE_BEGINWORKDATE=""}
var EMPVEMPLOYEE_WORKYEARS = '';
if(arr.length>0&&arr[i].EMPVEMPLOYEE_WORKYEARS!=null){
EMPVEMPLOYEE_WORKYEARS = arr[i].EMPVEMPLOYEE_WORKYEARS;
}
var EMPVEMPLOYEE_JOBBEGINDATE = '';
if(arr.length>0&&arr[i].EMPVEMPLOYEE_JOBBEGINDATE!=null){
EMPVEMPLOYEE_JOBBEGINDATE = arr[i].EMPVEMPLOYEE_JOBBEGINDATE;
}
if(EMPVEMPLOYEE_JOBBEGINDATE!=null&&EMPVEMPLOYEE_JOBBEGINDATE!=''){
EMPVEMPLOYEE_JOBBEGINDATE = new Date(parseInt(EMPVEMPLOYEE_JOBBEGINDATE)).Format("yyyy-MM-dd");
}else{EMPVEMPLOYEE_JOBBEGINDATE=""}
var EMPVEMPLOYEE_JOBAGE = '';
if(arr.length>0&&arr[i].EMPVEMPLOYEE_JOBAGE!=null){
EMPVEMPLOYEE_JOBAGE = arr[i].EMPVEMPLOYEE_JOBAGE;
}
var EMPVEMPLOYEE_YEAROLDS = '';
if(arr.length>0&&arr[i].EMPVEMPLOYEE_YEAROLDS!=null){
EMPVEMPLOYEE_YEAROLDS = arr[i].EMPVEMPLOYEE_YEAROLDS;
}
var EMPVEMPLOYEE_MAXEDUCATION = '';
if(arr.length>0&&arr[i].EMPVEMPLOYEE_MAXEDUCATION!=null){
EMPVEMPLOYEE_MAXEDUCATION = arr[i].EMPVEMPLOYEE_MAXEDUCATION;
}
var EMPVEMPLOYEE_MAXDEGREE = '';
if(arr.length>0&&arr[i].EMPVEMPLOYEE_MAXDEGREE!=null){
EMPVEMPLOYEE_MAXDEGREE = arr[i].EMPVEMPLOYEE_MAXDEGREE;
}
var EMPVEMPLOYEE_GRADUASCHOOL = '';
if(arr.length>0&&arr[i].EMPVEMPLOYEE_GRADUASCHOOL!=null){
EMPVEMPLOYEE_GRADUASCHOOL = arr[i].EMPVEMPLOYEE_GRADUASCHOOL;
}
var EMPVEMPLOYEE_PROFESSION = '';
if(arr.length>0&&arr[i].EMPVEMPLOYEE_PROFESSION!=null){
EMPVEMPLOYEE_PROFESSION = arr[i].EMPVEMPLOYEE_PROFESSION;
}
var EMPVEMPLOYEE_POLITICALSTATUS = '';
if(arr.length>0&&arr[i].EMPVEMPLOYEE_POLITICALSTATUS!=null){
EMPVEMPLOYEE_POLITICALSTATUS = arr[i].EMPVEMPLOYEE_POLITICALSTATUS;
}
if(arr.length>0&&arr[i].EMPVEMPLOYEE_POLITICALSTATUS!=null){
var kvArray_83861 = {'2':'中共预备党员','1':'中共党员','3':'共青团员','4':'民主党派','5':'群众','6':'未知'};
EMPVEMPLOYEE_POLITICALSTATUS = kvArray_83861[EMPVEMPLOYEE_POLITICALSTATUS];
}
var EMPVEMPLOYEE_BEGINPRODATE = '';
if(arr.length>0&&arr[i].EMPVEMPLOYEE_BEGINPRODATE!=null){
EMPVEMPLOYEE_BEGINPRODATE = arr[i].EMPVEMPLOYEE_BEGINPRODATE;
}
if(EMPVEMPLOYEE_BEGINPRODATE!=null&&EMPVEMPLOYEE_BEGINPRODATE!=''){
EMPVEMPLOYEE_BEGINPRODATE = new Date(parseInt(EMPVEMPLOYEE_BEGINPRODATE)).Format("yyyy-MM-dd");
}else{EMPVEMPLOYEE_BEGINPRODATE=""}
var EMPVEMPLOYEE_WHELEADER = '';
if(arr.length>0&&arr[i].EMPVEMPLOYEE_WHELEADER!=null){
EMPVEMPLOYEE_WHELEADER = arr[i].EMPVEMPLOYEE_WHELEADER;
}
if(arr.length>0&&arr[i].EMPVEMPLOYEE_WHELEADER!=null){
var kvArray_83863 = {'0':'否','1':'是'};
EMPVEMPLOYEE_WHELEADER = kvArray_83863[EMPVEMPLOYEE_WHELEADER];
}
var EMPVEMPLOYEE_LOCATION = '';
if(arr.length>0&&arr[i].EMPVEMPLOYEE_LOCATION!=null){
EMPVEMPLOYEE_LOCATION = arr[i].EMPVEMPLOYEE_LOCATION;
}
			cellObj += 		'<div class="col-md-12 col-sm-12 col-lg-12" name="fubiaoElement" >'+
							'    <div class="contact-box" style="min-height:110px">'+
							'		<form class="row cell" style="padding-right:50px">'+
							'		<span class="fa fa-trash-o deleteButton" id="deleteButton_'+i+'" title="删除" style="position: absolute;right: 30px;font-size: 25px;top: 5px;" onclick="deleteElement(this,\'4366\')"></span>'+
							'		<span class="fa fa-save saveButton" id="saveButton_'+i+'" title="保存" style="position: absolute;right: 29px;font-size: 25px;top: 40px;" onclick="saveElement(this,\'4366\')"></span>'+
							'		<span class="fa fa-edit updateButton" id="updateButton_'+i+'" title="修改" style="position: absolute;right: 25px;font-size: 25px;top: 77px;" onclick="updateElement(this,\''+i+'\',\''+e+'\')"></span>'+
  '	<input id="EMP_V_EMPLOYEE.EMPVEMPLOYEE_EMPID_4366" name="EMPVEMPLOYEE_EMPID" value="'+EMPVEMPLOYEE_EMPID+'"  type="hidden" >'+
  '	<input id="EMP_V_EMPLOYEE.EMPVEMPLOYEE_MAXEDUCATION_4366" name="EMPVEMPLOYEE_MAXEDUCATION" value="'+EMPVEMPLOYEE_MAXEDUCATION+'"  type="hidden" >'+
  '	<input id="EMP_V_EMPLOYEE.EMPVEMPLOYEE_MAXDEGREE_4366" name="EMPVEMPLOYEE_MAXDEGREE" value="'+EMPVEMPLOYEE_MAXDEGREE+'"  type="hidden" >'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;line-height:25px">员工状态: </label>'+
  '			<input id="EMP_V_EMPLOYEE.EMPVEMPLOYEE_EMPSTATUS_4366_'+i+'" name="EMPVEMPLOYEE_EMPSTATUS" dataType="text" class="CCReadText"  value="'+EMPVEMPLOYEE_EMPSTATUS+'" type="text" readonly oninput="myFunction(this,\'EMPVEMPLOYEE_EMPSTATUS\')"   style="width:200px;height:25px;padding:0;border:none;background-color:#fff"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;line-height:25px">在岗状态: </label>'+
  '			<input id="EMP_V_EMPLOYEE.EMPVEMPLOYEE_JOBSTATUS_4366_'+i+'" name="EMPVEMPLOYEE_JOBSTATUS" dataType="text" class="CCReadText"  value="'+EMPVEMPLOYEE_JOBSTATUS+'" type="text" readonly oninput="myFunction(this,\'EMPVEMPLOYEE_JOBSTATUS\')"   style="width:200px;height:25px;padding:0;border:none;background-color:#fff"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;line-height:25px">员工类型: </label>'+
  '			<input id="EMP_V_EMPLOYEE.EMPVEMPLOYEE_EMPTYPE_4366_'+i+'" name="EMPVEMPLOYEE_EMPTYPE" dataType="text" class="CCReadText"  value="'+EMPVEMPLOYEE_EMPTYPE+'" type="text" readonly oninput="myFunction(this,\'EMPVEMPLOYEE_EMPTYPE\')"   style="width:200px;height:25px;padding:0;border:none;background-color:#fff"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;line-height:25px">所属条线: </label>'+
  '			<input id="EMP_V_EMPLOYEE.EMPVEMPLOYEE_BELONGLINE_4366_'+i+'" name="EMPVEMPLOYEE_BELONGLINE" dataType="text" class="CCReadText"  value="'+EMPVEMPLOYEE_BELONGLINE+'" type="text" readonly oninput="myFunction(this,\'EMPVEMPLOYEE_BELONGLINE\')"   style="width:200px;height:25px;padding:0;border:none;background-color:#fff"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;line-height:25px">入职日期: </label>'+
  '			<input id="EMP_V_EMPLOYEE.EMPVEMPLOYEE_JOINDATE_4366_'+i+'" name="EMPVEMPLOYEE_JOINDATE" dataType="text" class="CCReadText"  value="'+EMPVEMPLOYEE_JOINDATE+'" type="text" readonly oninput="myFunction(this,\'EMPVEMPLOYEE_JOINDATE\')"   style="width:200px;height:25px;padding:0;border:none;background-color:#fff"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;line-height:25px">行龄: </label>'+
  '			<input id="EMP_V_EMPLOYEE.EMPVEMPLOYEE_COMPYEARS_4366_'+i+'" name="EMPVEMPLOYEE_COMPYEARS" dataType="text" class="CCReadText"  value="'+EMPVEMPLOYEE_COMPYEARS+'" type="text" readonly oninput="myFunction(this,\'EMPVEMPLOYEE_COMPYEARS\')"   style="width:200px;height:25px;padding:0;border:none;background-color:#fff"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;line-height:25px">参加工作日期: </label>'+
  '			<input id="EMP_V_EMPLOYEE.EMPVEMPLOYEE_BEGINWORKDATE_4366_'+i+'" name="EMPVEMPLOYEE_BEGINWORKDATE" dataType="text" class="CCReadText"  value="'+EMPVEMPLOYEE_BEGINWORKDATE+'" type="text" readonly oninput="myFunction(this,\'EMPVEMPLOYEE_BEGINWORKDATE\')"   style="width:200px;height:25px;padding:0;border:none;background-color:#fff"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;line-height:25px">工龄: </label>'+
  '			<input id="EMP_V_EMPLOYEE.EMPVEMPLOYEE_WORKYEARS_4366_'+i+'" name="EMPVEMPLOYEE_WORKYEARS" dataType="text" class="CCReadText"  value="'+EMPVEMPLOYEE_WORKYEARS+'" type="text" readonly oninput="myFunction(this,\'EMPVEMPLOYEE_WORKYEARS\')"   style="width:200px;height:25px;padding:0;border:none;background-color:#fff"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;line-height:25px">任现岗位时间: </label>'+
  '			<input id="EMP_V_EMPLOYEE.EMPVEMPLOYEE_JOBBEGINDATE_4366_'+i+'" name="EMPVEMPLOYEE_JOBBEGINDATE" dataType="text" class="CCReadText"  value="'+EMPVEMPLOYEE_JOBBEGINDATE+'" type="text" readonly oninput="myFunction(this,\'EMPVEMPLOYEE_JOBBEGINDATE\')"   style="width:200px;height:25px;padding:0;border:none;background-color:#fff"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;line-height:25px">岗龄: </label>'+
  '			<input id="EMP_V_EMPLOYEE.EMPVEMPLOYEE_JOBAGE_4366_'+i+'" name="EMPVEMPLOYEE_JOBAGE" dataType="text" class="CCReadText"  value="'+EMPVEMPLOYEE_JOBAGE+'" type="text" readonly oninput="myFunction(this,\'EMPVEMPLOYEE_JOBAGE\')"   style="width:200px;height:25px;padding:0;border:none;background-color:#fff"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;line-height:25px">年龄: </label>'+
  '			<input id="EMP_V_EMPLOYEE.EMPVEMPLOYEE_YEAROLDS_4366_'+i+'" name="EMPVEMPLOYEE_YEAROLDS" dataType="text" class="CCReadText"  value="'+EMPVEMPLOYEE_YEAROLDS+'" type="text" readonly oninput="myFunction(this,\'EMPVEMPLOYEE_YEAROLDS\')"   style="width:200px;height:25px;padding:0;border:none;background-color:#fff"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;line-height:25px">毕业院校: </label>'+
  '			<input id="EMP_V_EMPLOYEE.EMPVEMPLOYEE_GRADUASCHOOL_4366_'+i+'" name="EMPVEMPLOYEE_GRADUASCHOOL" dataType="text" class="CCReadText"  value="'+EMPVEMPLOYEE_GRADUASCHOOL+'" type="text" readonly oninput="myFunction(this,\'EMPVEMPLOYEE_GRADUASCHOOL\')"   style="width:200px;height:25px;padding:0;border:none;background-color:#fff"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;line-height:25px">专业: </label>'+
  '			<input id="EMP_V_EMPLOYEE.EMPVEMPLOYEE_PROFESSION_4366_'+i+'" name="EMPVEMPLOYEE_PROFESSION" dataType="text" class="CCReadText"  value="'+EMPVEMPLOYEE_PROFESSION+'" type="text" readonly oninput="myFunction(this,\'EMPVEMPLOYEE_PROFESSION\')"   style="width:200px;height:25px;padding:0;border:none;background-color:#fff"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;line-height:25px">政治面貌: </label>'+
  '			<input id="EMP_V_EMPLOYEE.EMPVEMPLOYEE_POLITICALSTATUS_4366_'+i+'" name="EMPVEMPLOYEE_POLITICALSTATUS" dataType="text" class="CCReadText"  value="'+EMPVEMPLOYEE_POLITICALSTATUS+'" type="text" readonly oninput="myFunction(this,\'EMPVEMPLOYEE_POLITICALSTATUS\')"   style="width:200px;height:25px;padding:0;border:none;background-color:#fff"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;line-height:25px">加入党派时间: </label>'+
  '			<input id="EMP_V_EMPLOYEE.EMPVEMPLOYEE_BEGINPRODATE_4366_'+i+'" name="EMPVEMPLOYEE_BEGINPRODATE" dataType="text" class="CCReadText"  value="'+EMPVEMPLOYEE_BEGINPRODATE+'" type="text" readonly oninput="myFunction(this,\'EMPVEMPLOYEE_BEGINPRODATE\')"   style="width:200px;height:25px;padding:0;border:none;background-color:#fff"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;line-height:25px">是否一把手: </label>'+
  '			<input id="EMP_V_EMPLOYEE.EMPVEMPLOYEE_WHELEADER_4366_'+i+'" name="EMPVEMPLOYEE_WHELEADER" dataType="text" class="CCReadText"  value="'+EMPVEMPLOYEE_WHELEADER+'" type="text" readonly oninput="myFunction(this,\'EMPVEMPLOYEE_WHELEADER\')"   style="width:200px;height:25px;padding:0;border:none;background-color:#fff"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;line-height:25px">现居住地址: </label>'+
  '			<input id="EMP_V_EMPLOYEE.EMPVEMPLOYEE_LOCATION_4366_'+i+'" name="EMPVEMPLOYEE_LOCATION" dataType="text" class="CCReadText"  value="'+EMPVEMPLOYEE_LOCATION+'" type="text" readonly oninput="myFunction(this,\'EMPVEMPLOYEE_LOCATION\')"   style="width:258px;height:25px;padding:0;border:none;background-color:#fff"/>'+
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
	 if(e=='fubiao2'){
		 var cellObj = '';
		 if(arr.length>0){
		 for (var i = arr.length - 1; i >= 0; i--) {
var EMPCONTRACT_CONNO = '';
if(arr.length>0&&arr[i].EMPCONTRACT_CONNO!=null){
EMPCONTRACT_CONNO = arr[i].EMPCONTRACT_CONNO;
}
var EMPCONTRACT_EMPID = '';
if(arr.length>0&&arr[i].EMPCONTRACT_EMPID!=null){
EMPCONTRACT_EMPID = arr[i].EMPCONTRACT_EMPID;
}
var EMPCONTRACT_CONTRACTUNIT = '';
if(arr.length>0&&arr[i].EMPCONTRACT_CONTRACTUNIT!=null){
EMPCONTRACT_CONTRACTUNIT = arr[i].EMPCONTRACT_CONTRACTUNIT;
}
if(arr.length>0&&arr[i].EMPCONTRACT_CONTRACTUNIT!=null){
var kvArray_83805 = {'1':'嘉兴银行股份有限公司','2':'嘉兴市新世纪人才派遣公司'};
EMPCONTRACT_CONTRACTUNIT = kvArray_83805[EMPCONTRACT_CONTRACTUNIT];
}
var EMPCONTRACT_CONTRACTTYPE = '';
if(arr.length>0&&arr[i].EMPCONTRACT_CONTRACTTYPE!=null){
EMPCONTRACT_CONTRACTTYPE = arr[i].EMPCONTRACT_CONTRACTTYPE;
}
if(arr.length>0&&arr[i].EMPCONTRACT_CONTRACTTYPE!=null){
var kvArray_83806 = {'1':'劳动合同','2':'派遣合同'};
EMPCONTRACT_CONTRACTTYPE = kvArray_83806[EMPCONTRACT_CONTRACTTYPE];
}
var EMPCONTRACT_CONTRACTKIND = '';
if(arr.length>0&&arr[i].EMPCONTRACT_CONTRACTKIND!=null){
EMPCONTRACT_CONTRACTKIND = arr[i].EMPCONTRACT_CONTRACTKIND;
}
if(arr.length>0&&arr[i].EMPCONTRACT_CONTRACTKIND!=null){
var kvArray_83807 = {'1':'固定期限','2':'无固定期限'};
EMPCONTRACT_CONTRACTKIND = kvArray_83807[EMPCONTRACT_CONTRACTKIND];
}
var EMPCONTRACT_CONBEGINDATE = '';
if(arr.length>0&&arr[i].EMPCONTRACT_CONBEGINDATE!=null){
EMPCONTRACT_CONBEGINDATE = arr[i].EMPCONTRACT_CONBEGINDATE;
}
if(EMPCONTRACT_CONBEGINDATE!=null&&EMPCONTRACT_CONBEGINDATE!=''){
EMPCONTRACT_CONBEGINDATE = new Date(parseInt(EMPCONTRACT_CONBEGINDATE)).Format("yyyy-MM-dd");
}else{EMPCONTRACT_CONBEGINDATE=""}
var EMPCONTRACT_CONMONTHS = '';
if(arr.length>0&&arr[i].EMPCONTRACT_CONMONTHS!=null){
EMPCONTRACT_CONMONTHS = arr[i].EMPCONTRACT_CONMONTHS;
}
var EMPCONTRACT_CONENDDATE = '';
if(arr.length>0&&arr[i].EMPCONTRACT_CONENDDATE!=null){
EMPCONTRACT_CONENDDATE = arr[i].EMPCONTRACT_CONENDDATE;
}
if(EMPCONTRACT_CONENDDATE!=null&&EMPCONTRACT_CONENDDATE!=''){
EMPCONTRACT_CONENDDATE = new Date(parseInt(EMPCONTRACT_CONENDDATE)).Format("yyyy-MM-dd");
}else{EMPCONTRACT_CONENDDATE=""}
			cellObj += 		'<div class="col-md-12 col-sm-12 col-lg-12" name="fubiaoElement" >'+
							'    <div class="contact-box" style="min-height:110px">'+
							'		<form class="row cell" style="padding-right:50px">'+
							'		<span class="fa fa-trash-o deleteButton" id="deleteButton_'+i+'" title="删除" style="position: absolute;right: 30px;font-size: 25px;top: 5px;" onclick="deleteElement(this,\'4363\')"></span>'+
							'		<span class="fa fa-save saveButton" id="saveButton_'+i+'" title="保存" style="position: absolute;right: 29px;font-size: 25px;top: 40px;" onclick="saveElement(this,\'4363\')"></span>'+
							'		<span class="fa fa-edit updateButton" id="updateButton_'+i+'" title="修改" style="position: absolute;right: 25px;font-size: 25px;top: 77px;" onclick="updateElement(this,\''+i+'\',\''+e+'\')"></span>'+
  '	<input id="EMP_CONTRACT.EMPCONTRACT_CONNO_4363" name="EMPCONTRACT_CONNO" value="'+EMPCONTRACT_CONNO+'"  type="hidden" >'+
  '	<input id="EMP_CONTRACT.EMPCONTRACT_EMPID_4363" name="EMPCONTRACT_EMPID" value="'+EMPCONTRACT_EMPID+'"  type="hidden" >'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;line-height:25px">合同签约单位: </label>'+
  '			<input id="EMP_CONTRACT.EMPCONTRACT_CONTRACTUNIT_4363_'+i+'" name="EMPCONTRACT_CONTRACTUNIT" dataType="text" class="CCReadText"  value="'+EMPCONTRACT_CONTRACTUNIT+'" type="text" readonly oninput="myFunction(this,\'EMPCONTRACT_CONTRACTUNIT\')"   style="width:200px;height:25px;padding:0;border:none;background-color:#fff"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;line-height:25px">合同类型: </label>'+
  '			<input id="EMP_CONTRACT.EMPCONTRACT_CONTRACTTYPE_4363_'+i+'" name="EMPCONTRACT_CONTRACTTYPE" dataType="text" class="CCReadText"  value="'+EMPCONTRACT_CONTRACTTYPE+'" type="text" readonly oninput="myFunction(this,\'EMPCONTRACT_CONTRACTTYPE\')"   style="width:200px;height:25px;padding:0;border:none;background-color:#fff"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;line-height:25px">合同性质: </label>'+
  '			<input id="EMP_CONTRACT.EMPCONTRACT_CONTRACTKIND_4363_'+i+'" name="EMPCONTRACT_CONTRACTKIND" dataType="text" class="CCReadText"  value="'+EMPCONTRACT_CONTRACTKIND+'" type="text" readonly oninput="myFunction(this,\'EMPCONTRACT_CONTRACTKIND\')"   style="width:200px;height:25px;padding:0;border:none;background-color:#fff"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;line-height:25px">合同开始日期: </label>'+
  '			<input id="EMP_CONTRACT.EMPCONTRACT_CONBEGINDATE_4363_'+i+'" name="EMPCONTRACT_CONBEGINDATE" dataType="text" class="CCReadText"  value="'+EMPCONTRACT_CONBEGINDATE+'" type="text" readonly oninput="myFunction(this,\'EMPCONTRACT_CONBEGINDATE\')"   style="width:200px;height:25px;padding:0;border:none;background-color:#fff"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;line-height:25px">合同期限(年): </label>'+
  '			<input id="EMP_CONTRACT.EMPCONTRACT_CONMONTHS_4363_'+i+'" name="EMPCONTRACT_CONMONTHS" dataType="text" class="CCReadText"  value="'+EMPCONTRACT_CONMONTHS+'" type="text" readonly oninput="myFunction(this,\'EMPCONTRACT_CONMONTHS\')"   style="width:200px;height:25px;padding:0;border:none;background-color:#fff"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;line-height:25px">合同结束日期: </label>'+
  '			<input id="EMP_CONTRACT.EMPCONTRACT_CONENDDATE_4363_'+i+'" name="EMPCONTRACT_CONENDDATE" dataType="text" class="CCReadText"  value="'+EMPCONTRACT_CONENDDATE+'" type="text" readonly oninput="myFunction(this,\'EMPCONTRACT_CONENDDATE\')"   style="width:200px;height:25px;padding:0;border:none;background-color:#fff"/>'+
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
	 if(e=='fubiao3'){
		 var cellObj = '';
		 if(arr.length>0){
		 for (var i = arr.length - 1; i >= 0; i--) {
var EMPBGTITLE_ID = '';
if(arr.length>0&&arr[i].EMPBGTITLE_ID!=null){
EMPBGTITLE_ID = arr[i].EMPBGTITLE_ID;
}
var EMPBGTITLE_EMPID = '';
if(arr.length>0&&arr[i].EMPBGTITLE_EMPID!=null){
EMPBGTITLE_EMPID = arr[i].EMPBGTITLE_EMPID;
}
var EMPBGTITLE_TITLE = '';
if(arr.length>0&&arr[i].EMPBGTITLE_TITLE!=null){
EMPBGTITLE_TITLE = arr[i].EMPBGTITLE_TITLE;
}
var EMPBGTITLE_TITLEGRADE = '';
if(arr.length>0&&arr[i].EMPBGTITLE_TITLEGRADE!=null){
EMPBGTITLE_TITLEGRADE = arr[i].EMPBGTITLE_TITLEGRADE;
}
if(arr.length>0&&arr[i].EMPBGTITLE_TITLEGRADE!=null){
var kvArray_83869 = {'1':'高级','2':'中级','3':'初级','4':'无职称'};
EMPBGTITLE_TITLEGRADE = kvArray_83869[EMPBGTITLE_TITLEGRADE];
}
var EMPBGTITLE_VALIDDATE = '';
if(arr.length>0&&arr[i].EMPBGTITLE_VALIDDATE!=null){
EMPBGTITLE_VALIDDATE = arr[i].EMPBGTITLE_VALIDDATE;
}
if(EMPBGTITLE_VALIDDATE!=null&&EMPBGTITLE_VALIDDATE!=''){
EMPBGTITLE_VALIDDATE = new Date(parseInt(EMPBGTITLE_VALIDDATE)).Format("yyyy-MM-dd");
}else{EMPBGTITLE_VALIDDATE=""}
var EMPBGTITLE_TITLENO = '';
if(arr.length>0&&arr[i].EMPBGTITLE_TITLENO!=null){
EMPBGTITLE_TITLENO = arr[i].EMPBGTITLE_TITLENO;
}
			cellObj += 		'<div class="col-md-12 col-sm-12 col-lg-12" name="fubiaoElement" >'+
							'    <div class="contact-box" style="min-height:110px">'+
							'		<form class="row cell" style="padding-right:50px">'+
							'		<span class="fa fa-trash-o deleteButton" id="deleteButton_'+i+'" title="删除" style="position: absolute;right: 30px;font-size: 25px;top: 5px;" onclick="deleteElement(this,\'4367\')"></span>'+
							'		<span class="fa fa-save saveButton" id="saveButton_'+i+'" title="保存" style="position: absolute;right: 29px;font-size: 25px;top: 40px;" onclick="saveElement(this,\'4367\')"></span>'+
							'		<span class="fa fa-edit updateButton" id="updateButton_'+i+'" title="修改" style="position: absolute;right: 25px;font-size: 25px;top: 77px;" onclick="updateElement(this,\''+i+'\',\''+e+'\')"></span>'+
  '	<input id="EMP_BG_TITLE.EMPBGTITLE_ID_4367" name="EMPBGTITLE_ID" value="'+EMPBGTITLE_ID+'"  type="hidden" >'+
  '	<input id="EMP_BG_TITLE.EMPBGTITLE_EMPID_4367" name="EMPBGTITLE_EMPID" value="'+EMPBGTITLE_EMPID+'"  type="hidden" >'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;line-height:25px">职称名: </label>'+
  '			<input id="EMP_BG_TITLE.EMPBGTITLE_TITLE_4367_'+i+'" name="EMPBGTITLE_TITLE" dataType="text" class="CCReadText"  value="'+EMPBGTITLE_TITLE+'" type="text" readonly oninput="myFunction(this,\'EMPBGTITLE_TITLE\')"   style="width:200px;height:25px;padding:0;border:none;background-color:#fff"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;line-height:25px">职称级别: </label>'+
  '			<input id="EMP_BG_TITLE.EMPBGTITLE_TITLEGRADE_4367_'+i+'" name="EMPBGTITLE_TITLEGRADE" dataType="text" class="CCReadText"  value="'+EMPBGTITLE_TITLEGRADE+'" type="text" readonly oninput="myFunction(this,\'EMPBGTITLE_TITLEGRADE\')"   style="width:200px;height:25px;padding:0;border:none;background-color:#fff"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;line-height:25px">获得日期: </label>'+
  '			<input id="EMP_BG_TITLE.EMPBGTITLE_VALIDDATE_4367_'+i+'" name="EMPBGTITLE_VALIDDATE" dataType="text" class="CCReadText"  value="'+EMPBGTITLE_VALIDDATE+'" type="text" readonly oninput="myFunction(this,\'EMPBGTITLE_VALIDDATE\')"   style="width:200px;height:25px;padding:0;border:none;background-color:#fff"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;line-height:25px">证书编号: </label>'+
  '			<input id="EMP_BG_TITLE.EMPBGTITLE_TITLENO_4367_'+i+'" name="EMPBGTITLE_TITLENO" dataType="text" class="CCReadText"  value="'+EMPBGTITLE_TITLENO+'" type="text" readonly oninput="myFunction(this,\'EMPBGTITLE_TITLENO\')"   style="width:200px;height:25px;padding:0;border:none;background-color:#fff"/>'+
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
	 if(e=='fubiao4'){
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
var EMPBGWORKEXPERIENCE_DEPARTMENT = '';
if(arr.length>0&&arr[i].EMPBGWORKEXPERIENCE_DEPARTMENT!=null){
EMPBGWORKEXPERIENCE_DEPARTMENT = arr[i].EMPBGWORKEXPERIENCE_DEPARTMENT;
}
var EMPBGWORKEXPERIENCE_POSITION = '';
if(arr.length>0&&arr[i].EMPBGWORKEXPERIENCE_POSITION!=null){
EMPBGWORKEXPERIENCE_POSITION = arr[i].EMPBGWORKEXPERIENCE_POSITION;
}
var EMPBGWORKEXPERIENCE_WORKNATURE = '';
if(arr.length>0&&arr[i].EMPBGWORKEXPERIENCE_WORKNATURE!=null){
EMPBGWORKEXPERIENCE_WORKNATURE = arr[i].EMPBGWORKEXPERIENCE_WORKNATURE;
}
			cellObj += 		'<div class="col-md-12 col-sm-12 col-lg-12" name="fubiaoElement" >'+
							'    <div class="contact-box" style="min-height:110px">'+
							'		<form class="row cell" style="padding-right:50px">'+
							'		<span class="fa fa-trash-o deleteButton" id="deleteButton_'+i+'" title="删除" style="position: absolute;right: 30px;font-size: 25px;top: 5px;" onclick="deleteElement(this,\'4365\')"></span>'+
							'		<span class="fa fa-save saveButton" id="saveButton_'+i+'" title="保存" style="position: absolute;right: 29px;font-size: 25px;top: 40px;" onclick="saveElement(this,\'4365\')"></span>'+
							'		<span class="fa fa-edit updateButton" id="updateButton_'+i+'" title="修改" style="position: absolute;right: 25px;font-size: 25px;top: 77px;" onclick="updateElement(this,\''+i+'\',\''+e+'\')"></span>'+
  '	<input id="EMP_BG_WORKEXPERIENCE.EMPBGWORKEXPERIENCE_EMPID_4365" name="EMPBGWORKEXPERIENCE_EMPID" value="'+EMPBGWORKEXPERIENCE_EMPID+'"  type="hidden" >'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;line-height:25px">开始时间: </label>'+
  '			<input id="EMP_BG_WORKEXPERIENCE.EMPBGWORKEXPERIENCE_BEGINDATE_4365_'+i+'" name="EMPBGWORKEXPERIENCE_BEGINDATE" dataType="text" class="CCReadText"  value="'+EMPBGWORKEXPERIENCE_BEGINDATE+'" type="text" readonly oninput="myFunction(this,\'EMPBGWORKEXPERIENCE_BEGINDATE\')"   style="width:200px;height:25px;padding:0;border:none;background-color:#fff"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;line-height:25px">结束时间: </label>'+
  '			<input id="EMP_BG_WORKEXPERIENCE.EMPBGWORKEXPERIENCE_ENDDATE_4365_'+i+'" name="EMPBGWORKEXPERIENCE_ENDDATE" dataType="text" class="CCReadText"  value="'+EMPBGWORKEXPERIENCE_ENDDATE+'" type="text" readonly oninput="myFunction(this,\'EMPBGWORKEXPERIENCE_ENDDATE\')"   style="width:200px;height:25px;padding:0;border:none;background-color:#fff"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;line-height:25px">工作单位: </label>'+
  '			<input id="EMP_BG_WORKEXPERIENCE.EMPBGWORKEXPERIENCE_WORKUNIT_4365_'+i+'" name="EMPBGWORKEXPERIENCE_WORKUNIT" dataType="text" class="CCReadText"  value="'+EMPBGWORKEXPERIENCE_WORKUNIT+'" type="text" readonly oninput="myFunction(this,\'EMPBGWORKEXPERIENCE_WORKUNIT\')"   style="width:200px;height:25px;padding:0;border:none;background-color:#fff"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;line-height:25px">所在部门: </label>'+
  '			<input id="EMP_BG_WORKEXPERIENCE.EMPBGWORKEXPERIENCE_DEPARTMENT_4365_'+i+'" name="EMPBGWORKEXPERIENCE_DEPARTMENT" dataType="text" class="CCReadText"  value="'+EMPBGWORKEXPERIENCE_DEPARTMENT+'" type="text" readonly oninput="myFunction(this,\'EMPBGWORKEXPERIENCE_DEPARTMENT\')"   style="width:200px;height:25px;padding:0;border:none;background-color:#fff"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;line-height:25px">职位: </label>'+
  '			<input id="EMP_BG_WORKEXPERIENCE.EMPBGWORKEXPERIENCE_POSITION_4365_'+i+'" name="EMPBGWORKEXPERIENCE_POSITION" dataType="text" class="CCReadText"  value="'+EMPBGWORKEXPERIENCE_POSITION+'" type="text" readonly oninput="myFunction(this,\'EMPBGWORKEXPERIENCE_POSITION\')"   style="width:200px;height:25px;padding:0;border:none;background-color:#fff"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;line-height:25px">用工性质: </label>'+
  '			<input id="EMP_BG_WORKEXPERIENCE.EMPBGWORKEXPERIENCE_WORKNATURE_4365_'+i+'" name="EMPBGWORKEXPERIENCE_WORKNATURE" dataType="text" class="CCReadText"  value="'+EMPBGWORKEXPERIENCE_WORKNATURE+'" type="text" readonly oninput="myFunction(this,\'EMPBGWORKEXPERIENCE_WORKNATURE\')"   style="width:200px;height:25px;padding:0;border:none;background-color:#fff"/>'+
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
	 function showDate_Main(arr,total,e){
		$(e).css("display","none");$(e).attr("onclick","");
		 var cellObj = '';
		 for (var i = 0; i == 0; i--) {
var EMPVEMPBASIC_EMPID = '';
if(arr.length>0&&arr[i].EMPVEMPBASIC_EMPID!=null&&flowAction!='start'){
EMPVEMPBASIC_EMPID = arr[i].EMPVEMPBASIC_EMPID;
}
var EMPVEMPBASIC_EMPCODE = '';
if(arr.length>0&&arr[i].EMPVEMPBASIC_EMPCODE!=null&&flowAction!='start'){
EMPVEMPBASIC_EMPCODE = arr[i].EMPVEMPBASIC_EMPCODE;
}
var EMPVEMPBASIC_CNAME = '';
if(arr.length>0&&arr[i].EMPVEMPBASIC_CNAME!=null&&flowAction!='start'){
EMPVEMPBASIC_CNAME = arr[i].EMPVEMPBASIC_CNAME;
}
var EMPVEMPBASIC_COMPID = '';
if(arr.length>0&&arr[i].EMPVEMPBASIC_COMPID!=null&&flowAction!='start'){
EMPVEMPBASIC_COMPID = arr[i].EMPVEMPBASIC_COMPID;
}
var EMPVEMPBASIC_DEPID = '';
if(arr.length>0&&arr[i].EMPVEMPBASIC_DEPID!=null&&flowAction!='start'){
EMPVEMPBASIC_DEPID = arr[i].EMPVEMPBASIC_DEPID;
}
var EMPVEMPBASIC_JOBID = '';
if(arr.length>0&&arr[i].EMPVEMPBASIC_JOBID!=null&&flowAction!='start'){
EMPVEMPBASIC_JOBID = arr[i].EMPVEMPBASIC_JOBID;
}
var EMPVEMPBASIC_GENDER = '';
if(arr.length>0&&arr[i].EMPVEMPBASIC_GENDER!=null&&flowAction!='start'){
EMPVEMPBASIC_GENDER = arr[i].EMPVEMPBASIC_GENDER;
}
var EMPVEMPBASIC_BIRTHDAY = '';
if(arr.length>0&&arr[i].EMPVEMPBASIC_BIRTHDAY!=null&&flowAction!='start'){
EMPVEMPBASIC_BIRTHDAY = arr[i].EMPVEMPBASIC_BIRTHDAY;
}
if(EMPVEMPBASIC_BIRTHDAY!=null&&EMPVEMPBASIC_BIRTHDAY!=""){
EMPVEMPBASIC_BIRTHDAY = new Date(parseInt(EMPVEMPBASIC_BIRTHDAY)).Format("yyyy-MM-dd");
}else{EMPVEMPBASIC_BIRTHDAY=""}
var EMPVEMPBASIC_WORKEMAIL = '';
if(arr.length>0&&arr[i].EMPVEMPBASIC_WORKEMAIL!=null&&flowAction!='start'){
EMPVEMPBASIC_WORKEMAIL = arr[i].EMPVEMPBASIC_WORKEMAIL;
}
var EMPVEMPBASIC_MOBILE = '';
if(arr.length>0&&arr[i].EMPVEMPBASIC_MOBILE!=null&&flowAction!='start'){
EMPVEMPBASIC_MOBILE = arr[i].EMPVEMPBASIC_MOBILE;
}
var EMPVEMPBASIC_WORKPHONE = '';
if(arr.length>0&&arr[i].EMPVEMPBASIC_WORKPHONE!=null&&flowAction!='start'){
EMPVEMPBASIC_WORKPHONE = arr[i].EMPVEMPBASIC_WORKPHONE;
}
var EMPVEMPBASIC_JOBRANK = '';
if(arr.length>0&&arr[i].EMPVEMPBASIC_JOBRANK!=null&&flowAction!='start'){
EMPVEMPBASIC_JOBRANK = arr[i].EMPVEMPBASIC_JOBRANK;
}
var EMPVEMPBASIC_CENID = '';
if(arr.length>0&&arr[i].EMPVEMPBASIC_CENID!=null&&flowAction!='start'){
EMPVEMPBASIC_CENID = arr[i].EMPVEMPBASIC_CENID;
}
			cellObj += 		'<div class="col-md-12 col-sm-12 col-lg-12" id="MainElement" style="position: static;">'+
							'    <div class="contact-box">'+
							'		<form class="row cell" style="padding-right:50px;padding-bottom:40px">'+
  '	<div class="col-lg-4 col-md-4 col-sm-6  col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">人员ID: </label>'+
  '			<input id="EMP_V_EMPBASIC.EMPVEMPBASIC_EMPID_4362" name="EMPVEMPBASIC_EMPID" dataType="text" type="text" class="form-control" value="'+EMPVEMPBASIC_EMPID+'" oninput="myFunction(this,\'EMPVEMPBASIC_EMPID\')"  vtype="illegalChar;maxLength:10;minLength:null;"  style="width:200px;height:; float:left;padding:0;border:none;background-color:#fff"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6  col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">工号: </label>'+
  '			<input id="EMP_V_EMPBASIC.EMPVEMPBASIC_EMPCODE_4362" name="EMPVEMPBASIC_EMPCODE" dataType="text" type="text" class="form-control" value="'+EMPVEMPBASIC_EMPCODE+'" oninput="myFunction(this,\'EMPVEMPBASIC_EMPCODE\')"  vtype="illegalChar;maxLength:50;minLength:null;"  style="width:200px;height:; float:left;padding:0;border:none;background-color:#fff"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6  col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">姓名: </label>'+
  '			<input id="EMP_V_EMPBASIC.EMPVEMPBASIC_CNAME_4362" name="EMPVEMPBASIC_CNAME" dataType="text" type="text" class="form-control" value="'+EMPVEMPBASIC_CNAME+'" oninput="myFunction(this,\'EMPVEMPBASIC_CNAME\')"  vtype="illegalChar;maxLength:200;minLength:null;"  style="width:200px;height:; float:left;padding:0;border:none;background-color:#fff"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6  col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">公司: </label>'+
  '			<input id="EMP_V_EMPBASIC.EMPVEMPBASIC_COMPID_4362" name="EMPVEMPBASIC_COMPID" dataType="text" type="text" class="form-control" value="'+EMPVEMPBASIC_COMPID+'" oninput="myFunction(this,\'EMPVEMPBASIC_COMPID\')"  vtype="illegalChar;maxLength:200;minLength:null;"  style="width:200px;height:; float:left;padding:0;border:none;background-color:#fff"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6  col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">部门: </label>'+
  '			<input id="EMP_V_EMPBASIC.EMPVEMPBASIC_DEPID_4362" name="EMPVEMPBASIC_DEPID" dataType="text" type="text" class="form-control" value="'+EMPVEMPBASIC_DEPID+'" oninput="myFunction(this,\'EMPVEMPBASIC_DEPID\')"  vtype="illegalChar;maxLength:200;minLength:null;"  style="width:200px;height:; float:left;padding:0;border:none;background-color:#fff"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6  col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">岗位: </label>'+
  '			<input id="EMP_V_EMPBASIC.EMPVEMPBASIC_JOBID_4362" name="EMPVEMPBASIC_JOBID" dataType="text" type="text" class="form-control" value="'+EMPVEMPBASIC_JOBID+'" oninput="myFunction(this,\'EMPVEMPBASIC_JOBID\')"  vtype="illegalChar;maxLength:200;minLength:null;"  style="width:200px;height:; float:left;padding:0;border:none;background-color:#fff"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6  col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">性别: </label>'+
  '			<input id="EMP_V_EMPBASIC.EMPVEMPBASIC_GENDER_4362" name="EMPVEMPBASIC_GENDER" dataType="text" type="text" class="form-control" value="'+EMPVEMPBASIC_GENDER+'" oninput="myFunction(this,\'EMPVEMPBASIC_GENDER\')"  vtype="illegalChar;maxLength:10;minLength:null;"  style="width:200px;height:; float:left;padding:0;border:none;background-color:#fff"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">出生日期: </label>'+
  '			<div class="controls input-append date form_date1 input-group" data-date=""  data-link-field="dtp_input2" data-link-format="yyyy-mm-dd" style="float:left;width: 134px;">'+
  '				<input style="width:134px;float:left;height:25px;padding:0;border:none;background-color:#fff"type="text" readonly class="form-control " dateType="controls input-append date form_date1" id="EMP_V_EMPBASIC.EMPVEMPBASIC_BIRTHDAY_4362" styleType="dateTime" value="'+EMPVEMPBASIC_BIRTHDAY+'"  style="width:134px;float:left;border-radius: 4px 0 0 4px;" name="EMPVEMPBASIC_BIRTHDAY"  format="yyyy-MM-dd" valueformat="yyyy-MM-dd" />'+
	'				<span class="input-group-addon" name="closeButton" style="padding:1px 10px 2px 10px;font-size:12px"><span class="glyphicon glyphicon-remove"></span></span>'+
  '				<span class="input-group-addon" name="clickButton" style="padding:1px 10px 2px 10px;font-size:12px"><span class="glyphicon glyphicon-th"></span></span>'+
  '			</div>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6  col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">工作邮箱: </label>'+
  '			<input id="EMP_V_EMPBASIC.EMPVEMPBASIC_WORKEMAIL_4362" name="EMPVEMPBASIC_WORKEMAIL" dataType="text" type="text" class="form-control" value="'+EMPVEMPBASIC_WORKEMAIL+'" oninput="myFunction(this,\'EMPVEMPBASIC_WORKEMAIL\')"  vtype="illegalChar;maxLength:200;minLength:null;"  style="width:200px;height:; float:left;padding:0;border:none;background-color:#fff"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6  col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">手机号码: </label>'+
  '			<input id="EMP_V_EMPBASIC.EMPVEMPBASIC_MOBILE_4362" name="EMPVEMPBASIC_MOBILE" dataType="text" type="text" class="form-control" value="'+EMPVEMPBASIC_MOBILE+'" oninput="myFunction(this,\'EMPVEMPBASIC_MOBILE\')"  vtype="illegalChar;maxLength:50;minLength:null;"  style="width:200px;height:; float:left;padding:0;border:none;background-color:#fff"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6  col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">办公电话: </label>'+
  '			<input id="EMP_V_EMPBASIC.EMPVEMPBASIC_WORKPHONE_4362" name="EMPVEMPBASIC_WORKPHONE" dataType="text" type="text" class="form-control" value="'+EMPVEMPBASIC_WORKPHONE+'" oninput="myFunction(this,\'EMPVEMPBASIC_WORKPHONE\')"  vtype="illegalChar;maxLength:50;minLength:null;"  style="width:200px;height:; float:left;padding:0;border:none;background-color:#fff"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6  col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">职务级别: </label>'+
  '			<input id="EMP_V_EMPBASIC.EMPVEMPBASIC_JOBRANK_4362" name="EMPVEMPBASIC_JOBRANK" dataType="text" type="text" class="form-control" value="'+EMPVEMPBASIC_JOBRANK+'" oninput="myFunction(this,\'EMPVEMPBASIC_JOBRANK\')"  vtype="illegalChar;maxLength:100;minLength:null;"  style="width:200px;height:; float:left;padding:0;border:none;background-color:#fff"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6  col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">中心: </label>'+
  '			<input id="EMP_V_EMPBASIC.EMPVEMPBASIC_CENID_4362" name="EMPVEMPBASIC_CENID" dataType="text" type="text" class="form-control" value="'+EMPVEMPBASIC_CENID+'" oninput="myFunction(this,\'EMPVEMPBASIC_CENID\')"  vtype="illegalChar;maxLength:200;minLength:null;"  style="width:200px;height:; float:left;padding:0;border:none;background-color:#fff"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
							'	<div id="main_buttons" style="position:absolute;bottom:0px;left:50%;-webkit-transform: translate(-50%, -50%);">'+
							'		<input class="btn btn-info saveButton" id="saveButton_main" type="button" value="保存" style="width:50px" onclick="saveElement_main(this,\'4362\')"/>'+
							'	</div>'+
							'		</form>'+
							'	</div>'+
							'</div>';
	}
	$(".mainFormElement").append(cellObj);
	elementsListSelectInitFunction('#saveButton_main');//初始化新增下拉控件
	cardDateWidInitFunction();//初始化新增日期控件
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
	 if(e=='fubiao3'){
		 var cellObj = '';
			cellObj += 		'<div class="col-md-12 col-sm-12 col-lg-12">'+
							'    <div class="contact-box">'+
							'		<div class="row cell">'+
							'		</div>'+
							'	</div>'+
							'</div>';
	$("#"+e).find("[id='TEST_FEE_INFO_FORM']").html(cellObj);
}
	 if(e=='fubiao4'){
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
var EMPSTATUS_value = xx.find("[name='EMPVEMPLOYEE_EMPSTATUS']").val();
var kvArray_83846 = {'在职':'1','离职':'2','退休':'3'};
EMPSTATUS_value = kvArray_83846[EMPSTATUS_value];
var JOBSTATUS_value = xx.find("[name='EMPVEMPLOYEE_JOBSTATUS']").val();
var kvArray_83847 = {'正式在职':'1','实习在职':'2','试用在职':'3','内退':'4','待岗':'5','长期病假':'6','停薪留职':'7','离岗退养':'8','因公外派':'9','退休':'10','系统内离退休返聘':'11','脱密期':'12'};
JOBSTATUS_value = kvArray_83847[JOBSTATUS_value];
var EMPTYPE_value = xx.find("[name='EMPVEMPLOYEE_EMPTYPE']").val();
var kvArray_83848 = {'合同工':'1','派遣工':'2','外包人员':'3','外部理董监事':'4','退休返聘工':'5','临时工':'6','其他':'6'};
EMPTYPE_value = kvArray_83848[EMPTYPE_value];
var BELONGLINE_value = xx.find("[name='EMPVEMPLOYEE_BELONGLINE']").val();
var kvArray_83849 = {'运营条线':'1','零售条线':'2','客户经理条线':'3','分支行中后台':'4','分支行班子':'5','风险总监':'6','总行':'7','社区支行条线':'8','改任':'9','其他':'10'};
BELONGLINE_value = kvArray_83849[BELONGLINE_value];
var JOINDATE_value = xx.find("[name='EMPVEMPLOYEE_JOINDATE']").val();
var BEGINWORKDATE_value = xx.find("[name='EMPVEMPLOYEE_BEGINWORKDATE']").val();
var JOBBEGINDATE_value = xx.find("[name='EMPVEMPLOYEE_JOBBEGINDATE']").val();
var POLITICALSTATUS_value = xx.find("[name='EMPVEMPLOYEE_POLITICALSTATUS']").val();
var kvArray_83861 = {'中共预备党员':'2','中共党员':'1','共青团员':'3','民主党派':'4','群众':'5','未知':'6'};
POLITICALSTATUS_value = kvArray_83861[POLITICALSTATUS_value];
var BEGINPRODATE_value = xx.find("[name='EMPVEMPLOYEE_BEGINPRODATE']").val();
var WHELEADER_value = xx.find("[name='EMPVEMPLOYEE_WHELEADER']").val();
var kvArray_83863 = {'否':'0','是':'1'};
WHELEADER_value = kvArray_83863[WHELEADER_value];
  var EMPVEMPLOYEE_EMPSTATUS_cellObj = '			<select id="EMP_V_EMPLOYEE.EMPVEMPLOYEE_EMPSTATUS_4366_'+num+'_select" title="员工状态"  styleType="select" name="EMPVEMPLOYEE_EMPSTATUS" style="width:200px;float:left;height:25px;padding:0;border:none;background-color:#fff" columnId="83846" class="form-control " dataField1 = "dict"  emptyText=""  style="float:left;width:200px;" textField="dictName" valueField="dictId" DictName="EMP_EMPSTATUS" dataField="dicts_form_83846"initParam = "_"></select>';
	xx.find("[id='EMP_V_EMPLOYEE.EMPVEMPLOYEE_EMPSTATUS_4366_"+num+"']").after(EMPVEMPLOYEE_EMPSTATUS_cellObj);
	xx.find("[id='EMP_V_EMPLOYEE.EMPVEMPLOYEE_EMPSTATUS_4366_"+num+"']").css("display","none");
  var EMPVEMPLOYEE_JOBSTATUS_cellObj = '			<select id="EMP_V_EMPLOYEE.EMPVEMPLOYEE_JOBSTATUS_4366_'+num+'_select" title="在岗状态"  styleType="select" name="EMPVEMPLOYEE_JOBSTATUS" style="width:200px;float:left;height:25px;padding:0;border:none;background-color:#fff" columnId="83847" class="form-control " dataField1 = "dict"  emptyText=""  style="float:left;width:200px;" textField="dictName" valueField="dictId" DictName="Onduty" dataField="dicts_form_83847"initParam = "_"></select>';
	xx.find("[id='EMP_V_EMPLOYEE.EMPVEMPLOYEE_JOBSTATUS_4366_"+num+"']").after(EMPVEMPLOYEE_JOBSTATUS_cellObj);
	xx.find("[id='EMP_V_EMPLOYEE.EMPVEMPLOYEE_JOBSTATUS_4366_"+num+"']").css("display","none");
  var EMPVEMPLOYEE_EMPTYPE_cellObj = '			<select id="EMP_V_EMPLOYEE.EMPVEMPLOYEE_EMPTYPE_4366_'+num+'_select" title="员工类型"  styleType="select" name="EMPVEMPLOYEE_EMPTYPE" style="width:200px;float:left;height:25px;padding:0;border:none;background-color:#fff" columnId="83848" class="form-control " dataField1 = "dict"  emptyText=""  style="float:left;width:200px;" textField="dictName" valueField="dictId" DictName="EMP_EMPTYPE" dataField="dicts_form_83848"initParam = "_"></select>';
	xx.find("[id='EMP_V_EMPLOYEE.EMPVEMPLOYEE_EMPTYPE_4366_"+num+"']").after(EMPVEMPLOYEE_EMPTYPE_cellObj);
	xx.find("[id='EMP_V_EMPLOYEE.EMPVEMPLOYEE_EMPTYPE_4366_"+num+"']").css("display","none");
  var EMPVEMPLOYEE_BELONGLINE_cellObj = '			<select id="EMP_V_EMPLOYEE.EMPVEMPLOYEE_BELONGLINE_4366_'+num+'_select" title="所属条线"  styleType="select" name="EMPVEMPLOYEE_BELONGLINE" style="width:200px;float:left;height:25px;padding:0;border:none;background-color:#fff" columnId="83849" class="form-control " dataField1 = "dict"  emptyText=""  style="float:left;width:200px;" textField="dictName" valueField="dictId" DictName="emp_BELONGLINE" dataField="dicts_form_83849"initParam = "_"></select>';
	xx.find("[id='EMP_V_EMPLOYEE.EMPVEMPLOYEE_BELONGLINE_4366_"+num+"']").after(EMPVEMPLOYEE_BELONGLINE_cellObj);
	xx.find("[id='EMP_V_EMPLOYEE.EMPVEMPLOYEE_BELONGLINE_4366_"+num+"']").css("display","none");
  var fee_time_cellObj = '			<div class="controls input-append date form_date1 input-group" data-date=""  data-link-field="dtp_input2" data-link-format="yyyy-mm-dd" style="float:left;width: 134px;">'+
  					  '				<input style="width:134px;float:left;height:25px;padding:0;border:none;background-color:#fff"type="text" readonly class="form-control " dateType="controls input-append date form_date1" id="EMP_V_EMPLOYEE.EMPVEMPLOYEE_JOINDATE_4366_'+num+'_datepick" styleType="dateTime"   style="width:134px;float:left;border-radius: 4px 0 0 4px;" name="EMPVEMPLOYEE_JOINDATE"  format="yyyy-MM-dd" valueformat="yyyy-MM-dd" />'+
						  '				<span class="input-group-addon" name="closeButton" style="padding:1px 10px 2px 10px;font-size:12px"><span class="glyphicon glyphicon-remove"></span></span>'+
  					  '				<span class="input-group-addon" name="clickButton" style="padding:1px 10px 2px 10px;font-size:12px"><span class="glyphicon glyphicon-th"></span></span>'+
  					  '			</div>'+
  					  '			<span style="color:red;"></span>';
xx.find("[id='EMP_V_EMPLOYEE.EMPVEMPLOYEE_JOINDATE_4366_"+num+"']").after(fee_time_cellObj);
xx.find("[id='EMP_V_EMPLOYEE.EMPVEMPLOYEE_JOINDATE_4366_"+num+"']").css("display","none");
xx.find("[id='EMP_V_EMPLOYEE.EMPVEMPLOYEE_COMPYEARS_4366_"+num+"']").attr("readonly",false);
xx.find("[id='EMP_V_EMPLOYEE.EMPVEMPLOYEE_COMPYEARS_4366_"+num+"']").css("display","inline");
xx.find("[id='EMP_V_EMPLOYEE.EMPVEMPLOYEE_COMPYEARS_4366_"+num+"']").attr("class","form-control");
  var fee_time_cellObj = '			<div class="controls input-append date form_date1 input-group" data-date=""  data-link-field="dtp_input2" data-link-format="yyyy-mm-dd" style="float:left;width: 134px;">'+
  					  '				<input style="width:134px;float:left;height:25px;padding:0;border:none;background-color:#fff"type="text" readonly class="form-control " dateType="controls input-append date form_date1" id="EMP_V_EMPLOYEE.EMPVEMPLOYEE_BEGINWORKDATE_4366_'+num+'_datepick" styleType="dateTime"   style="width:134px;float:left;border-radius: 4px 0 0 4px;" name="EMPVEMPLOYEE_BEGINWORKDATE"  format="yyyy-MM-dd" valueformat="yyyy-MM-dd" />'+
						  '				<span class="input-group-addon" name="closeButton" style="padding:1px 10px 2px 10px;font-size:12px"><span class="glyphicon glyphicon-remove"></span></span>'+
  					  '				<span class="input-group-addon" name="clickButton" style="padding:1px 10px 2px 10px;font-size:12px"><span class="glyphicon glyphicon-th"></span></span>'+
  					  '			</div>'+
  					  '			<span style="color:red;"></span>';
xx.find("[id='EMP_V_EMPLOYEE.EMPVEMPLOYEE_BEGINWORKDATE_4366_"+num+"']").after(fee_time_cellObj);
xx.find("[id='EMP_V_EMPLOYEE.EMPVEMPLOYEE_BEGINWORKDATE_4366_"+num+"']").css("display","none");
xx.find("[id='EMP_V_EMPLOYEE.EMPVEMPLOYEE_WORKYEARS_4366_"+num+"']").attr("readonly",false);
xx.find("[id='EMP_V_EMPLOYEE.EMPVEMPLOYEE_WORKYEARS_4366_"+num+"']").css("display","inline");
xx.find("[id='EMP_V_EMPLOYEE.EMPVEMPLOYEE_WORKYEARS_4366_"+num+"']").attr("class","form-control");
  var fee_time_cellObj = '			<div class="controls input-append date form_date1 input-group" data-date=""  data-link-field="dtp_input2" data-link-format="yyyy-mm-dd" style="float:left;width: 134px;">'+
  					  '				<input style="width:134px;float:left;height:25px;padding:0;border:none;background-color:#fff"type="text" readonly class="form-control " dateType="controls input-append date form_date1" id="EMP_V_EMPLOYEE.EMPVEMPLOYEE_JOBBEGINDATE_4366_'+num+'_datepick" styleType="dateTime"   style="width:134px;float:left;border-radius: 4px 0 0 4px;" name="EMPVEMPLOYEE_JOBBEGINDATE"  format="yyyy-MM-dd" valueformat="yyyy-MM-dd" />'+
						  '				<span class="input-group-addon" name="closeButton" style="padding:1px 10px 2px 10px;font-size:12px"><span class="glyphicon glyphicon-remove"></span></span>'+
  					  '				<span class="input-group-addon" name="clickButton" style="padding:1px 10px 2px 10px;font-size:12px"><span class="glyphicon glyphicon-th"></span></span>'+
  					  '			</div>'+
  					  '			<span style="color:red;"></span>';
xx.find("[id='EMP_V_EMPLOYEE.EMPVEMPLOYEE_JOBBEGINDATE_4366_"+num+"']").after(fee_time_cellObj);
xx.find("[id='EMP_V_EMPLOYEE.EMPVEMPLOYEE_JOBBEGINDATE_4366_"+num+"']").css("display","none");
xx.find("[id='EMP_V_EMPLOYEE.EMPVEMPLOYEE_JOBAGE_4366_"+num+"']").attr("readonly",false);
xx.find("[id='EMP_V_EMPLOYEE.EMPVEMPLOYEE_JOBAGE_4366_"+num+"']").css("display","inline");
xx.find("[id='EMP_V_EMPLOYEE.EMPVEMPLOYEE_JOBAGE_4366_"+num+"']").attr("class","form-control");
xx.find("[id='EMP_V_EMPLOYEE.EMPVEMPLOYEE_YEAROLDS_4366_"+num+"']").attr("readonly",false);
xx.find("[id='EMP_V_EMPLOYEE.EMPVEMPLOYEE_YEAROLDS_4366_"+num+"']").css("display","inline");
xx.find("[id='EMP_V_EMPLOYEE.EMPVEMPLOYEE_YEAROLDS_4366_"+num+"']").attr("class","form-control");
xx.find("[id='EMP_V_EMPLOYEE.EMPVEMPLOYEE_GRADUASCHOOL_4366_"+num+"']").attr("readonly",false);
xx.find("[id='EMP_V_EMPLOYEE.EMPVEMPLOYEE_GRADUASCHOOL_4366_"+num+"']").css("display","inline");
xx.find("[id='EMP_V_EMPLOYEE.EMPVEMPLOYEE_GRADUASCHOOL_4366_"+num+"']").attr("class","form-control");
xx.find("[id='EMP_V_EMPLOYEE.EMPVEMPLOYEE_PROFESSION_4366_"+num+"']").attr("readonly",false);
xx.find("[id='EMP_V_EMPLOYEE.EMPVEMPLOYEE_PROFESSION_4366_"+num+"']").css("display","inline");
xx.find("[id='EMP_V_EMPLOYEE.EMPVEMPLOYEE_PROFESSION_4366_"+num+"']").attr("class","form-control");
  var EMPVEMPLOYEE_POLITICALSTATUS_cellObj = '			<select id="EMP_V_EMPLOYEE.EMPVEMPLOYEE_POLITICALSTATUS_4366_'+num+'_select" title="政治面貌"  styleType="select" name="EMPVEMPLOYEE_POLITICALSTATUS" style="width:200px;float:left;height:25px;padding:0;border:none;background-color:#fff" columnId="83861" class="form-control " dataField1 = "dict"  emptyText=""  style="float:left;width:200px;" textField="dictName" valueField="dictId" DictName="emp_PoliticalOut" dataField="dicts_form_83861"initParam = "_"></select>';
	xx.find("[id='EMP_V_EMPLOYEE.EMPVEMPLOYEE_POLITICALSTATUS_4366_"+num+"']").after(EMPVEMPLOYEE_POLITICALSTATUS_cellObj);
	xx.find("[id='EMP_V_EMPLOYEE.EMPVEMPLOYEE_POLITICALSTATUS_4366_"+num+"']").css("display","none");
  var fee_time_cellObj = '			<div class="controls input-append date form_date1 input-group" data-date=""  data-link-field="dtp_input2" data-link-format="yyyy-mm-dd" style="float:left;width: 134px;">'+
  					  '				<input style="width:134px;float:left;height:25px;padding:0;border:none;background-color:#fff"type="text" readonly class="form-control " dateType="controls input-append date form_date1" id="EMP_V_EMPLOYEE.EMPVEMPLOYEE_BEGINPRODATE_4366_'+num+'_datepick" styleType="dateTime"   style="width:134px;float:left;border-radius: 4px 0 0 4px;" name="EMPVEMPLOYEE_BEGINPRODATE"  format="yyyy-MM-dd" valueformat="yyyy-MM-dd" />'+
						  '				<span class="input-group-addon" name="closeButton" style="padding:1px 10px 2px 10px;font-size:12px"><span class="glyphicon glyphicon-remove"></span></span>'+
  					  '				<span class="input-group-addon" name="clickButton" style="padding:1px 10px 2px 10px;font-size:12px"><span class="glyphicon glyphicon-th"></span></span>'+
  					  '			</div>'+
  					  '			<span style="color:red;"></span>';
xx.find("[id='EMP_V_EMPLOYEE.EMPVEMPLOYEE_BEGINPRODATE_4366_"+num+"']").after(fee_time_cellObj);
xx.find("[id='EMP_V_EMPLOYEE.EMPVEMPLOYEE_BEGINPRODATE_4366_"+num+"']").css("display","none");
  var EMPVEMPLOYEE_WHELEADER_cellObj = '			<select id="EMP_V_EMPLOYEE.EMPVEMPLOYEE_WHELEADER_4366_'+num+'_select" title="是否一把手"  styleType="select" name="EMPVEMPLOYEE_WHELEADER" style="width:200px;float:left;height:25px;padding:0;border:none;background-color:#fff" columnId="83863" class="form-control " dataField1 = "dict"  emptyText=""  style="float:left;width:200px;" textField="dictName" valueField="dictId" DictName="att_yes_no" dataField="dicts_form_83863"initParam = "_"></select>';
	xx.find("[id='EMP_V_EMPLOYEE.EMPVEMPLOYEE_WHELEADER_4366_"+num+"']").after(EMPVEMPLOYEE_WHELEADER_cellObj);
	xx.find("[id='EMP_V_EMPLOYEE.EMPVEMPLOYEE_WHELEADER_4366_"+num+"']").css("display","none");
xx.find("[id='EMP_V_EMPLOYEE.EMPVEMPLOYEE_LOCATION_4366_"+num+"']").attr("readonly",false);
xx.find("[id='EMP_V_EMPLOYEE.EMPVEMPLOYEE_LOCATION_4366_"+num+"']").css("display","inline");
xx.find("[id='EMP_V_EMPLOYEE.EMPVEMPLOYEE_LOCATION_4366_"+num+"']").attr("class","form-control");
		var pid = xx.attr("id");
		elementsListSelectInitFunction(e);
		cardAndCardDateWidInitFunction(e);
$("#"+x).find("[id='EMP_V_EMPLOYEE.EMPVEMPLOYEE_EMPSTATUS_4366_"+num+"_select']").val(EMPSTATUS_value);
$("#"+x).find("[id='EMP_V_EMPLOYEE.EMPVEMPLOYEE_JOBSTATUS_4366_"+num+"_select']").val(JOBSTATUS_value);
$("#"+x).find("[id='EMP_V_EMPLOYEE.EMPVEMPLOYEE_EMPTYPE_4366_"+num+"_select']").val(EMPTYPE_value);
$("#"+x).find("[id='EMP_V_EMPLOYEE.EMPVEMPLOYEE_BELONGLINE_4366_"+num+"_select']").val(BELONGLINE_value);
$("#"+x).find("[id='EMP_V_EMPLOYEE.EMPVEMPLOYEE_JOINDATE_4366_"+num+"_datepick']").val(JOINDATE_value);
$("#"+x).find("[id='EMP_V_EMPLOYEE.EMPVEMPLOYEE_BEGINWORKDATE_4366_"+num+"_datepick']").val(BEGINWORKDATE_value);
$("#"+x).find("[id='EMP_V_EMPLOYEE.EMPVEMPLOYEE_JOBBEGINDATE_4366_"+num+"_datepick']").val(JOBBEGINDATE_value);
$("#"+x).find("[id='EMP_V_EMPLOYEE.EMPVEMPLOYEE_POLITICALSTATUS_4366_"+num+"_select']").val(POLITICALSTATUS_value);
$("#"+x).find("[id='EMP_V_EMPLOYEE.EMPVEMPLOYEE_BEGINPRODATE_4366_"+num+"_datepick']").val(BEGINPRODATE_value);
$("#"+x).find("[id='EMP_V_EMPLOYEE.EMPVEMPLOYEE_WHELEADER_4366_"+num+"_select']").val(WHELEADER_value);
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
var CONTRACTUNIT_value = xx.find("[name='EMPCONTRACT_CONTRACTUNIT']").val();
var kvArray_83805 = {'嘉兴银行股份有限公司':'1','嘉兴市新世纪人才派遣公司':'2'};
CONTRACTUNIT_value = kvArray_83805[CONTRACTUNIT_value];
var CONTRACTTYPE_value = xx.find("[name='EMPCONTRACT_CONTRACTTYPE']").val();
var kvArray_83806 = {'劳动合同':'1','派遣合同':'2'};
CONTRACTTYPE_value = kvArray_83806[CONTRACTTYPE_value];
var CONTRACTKIND_value = xx.find("[name='EMPCONTRACT_CONTRACTKIND']").val();
var kvArray_83807 = {'固定期限':'1','无固定期限':'2'};
CONTRACTKIND_value = kvArray_83807[CONTRACTKIND_value];
var CONBEGINDATE_value = xx.find("[name='EMPCONTRACT_CONBEGINDATE']").val();
var CONENDDATE_value = xx.find("[name='EMPCONTRACT_CONENDDATE']").val();
  var EMPCONTRACT_CONTRACTUNIT_cellObj = '			<select id="EMP_CONTRACT.EMPCONTRACT_CONTRACTUNIT_4363_'+num+'_select" title="合同签约单位"  styleType="select" name="EMPCONTRACT_CONTRACTUNIT" style="width:200px;float:left;height:25px;padding:0;border:none;background-color:#fff" columnId="83805" class="form-control " dataField1 = "dict"  emptyText=""  style="float:left;width:200px;" textField="dictName" valueField="dictId" DictName="contactUnit" dataField="dicts_form_83805"initParam = "_"></select>';
	xx.find("[id='EMP_CONTRACT.EMPCONTRACT_CONTRACTUNIT_4363_"+num+"']").after(EMPCONTRACT_CONTRACTUNIT_cellObj);
	xx.find("[id='EMP_CONTRACT.EMPCONTRACT_CONTRACTUNIT_4363_"+num+"']").css("display","none");
  var EMPCONTRACT_CONTRACTTYPE_cellObj = '			<select id="EMP_CONTRACT.EMPCONTRACT_CONTRACTTYPE_4363_'+num+'_select" title="合同类型"  styleType="select" name="EMPCONTRACT_CONTRACTTYPE" style="width:200px;float:left;height:25px;padding:0;border:none;background-color:#fff" columnId="83806" class="form-control " dataField1 = "dict"  emptyText=""  style="float:left;width:200px;" textField="dictName" valueField="dictId" DictName="EMP_CONTRACTTYPE" dataField="dicts_form_83806"initParam = "_"></select>';
	xx.find("[id='EMP_CONTRACT.EMPCONTRACT_CONTRACTTYPE_4363_"+num+"']").after(EMPCONTRACT_CONTRACTTYPE_cellObj);
	xx.find("[id='EMP_CONTRACT.EMPCONTRACT_CONTRACTTYPE_4363_"+num+"']").css("display","none");
  var EMPCONTRACT_CONTRACTKIND_cellObj = '			<select id="EMP_CONTRACT.EMPCONTRACT_CONTRACTKIND_4363_'+num+'_select" title="合同性质"  styleType="select" name="EMPCONTRACT_CONTRACTKIND" style="width:200px;float:left;height:25px;padding:0;border:none;background-color:#fff" columnId="83807" class="form-control " dataField1 = "dict"  emptyText=""  style="float:left;width:200px;" textField="dictName" valueField="dictId" DictName="EMP_CONTRACTKIND" dataField="dicts_form_83807"initParam = "_"></select>';
	xx.find("[id='EMP_CONTRACT.EMPCONTRACT_CONTRACTKIND_4363_"+num+"']").after(EMPCONTRACT_CONTRACTKIND_cellObj);
	xx.find("[id='EMP_CONTRACT.EMPCONTRACT_CONTRACTKIND_4363_"+num+"']").css("display","none");
  var fee_time_cellObj = '			<div class="controls input-append date form_date1 input-group" data-date=""  data-link-field="dtp_input2" data-link-format="yyyy-mm-dd" style="float:left;width: 134px;">'+
  					  '				<input style="width:134px;float:left;height:25px;padding:0;border:none;background-color:#fff"type="text" readonly class="form-control " dateType="controls input-append date form_date1" id="EMP_CONTRACT.EMPCONTRACT_CONBEGINDATE_4363_'+num+'_datepick" styleType="dateTime"   style="width:134px;float:left;border-radius: 4px 0 0 4px;" name="EMPCONTRACT_CONBEGINDATE"  format="yyyy-MM-dd" valueformat="yyyy-MM-dd" />'+
						  '				<span class="input-group-addon" name="closeButton" style="padding:1px 10px 2px 10px;font-size:12px"><span class="glyphicon glyphicon-remove"></span></span>'+
  					  '				<span class="input-group-addon" name="clickButton" style="padding:1px 10px 2px 10px;font-size:12px"><span class="glyphicon glyphicon-th"></span></span>'+
  					  '			</div>'+
  					  '			<span style="color:red;"></span>';
xx.find("[id='EMP_CONTRACT.EMPCONTRACT_CONBEGINDATE_4363_"+num+"']").after(fee_time_cellObj);
xx.find("[id='EMP_CONTRACT.EMPCONTRACT_CONBEGINDATE_4363_"+num+"']").css("display","none");
xx.find("[id='EMP_CONTRACT.EMPCONTRACT_CONMONTHS_4363_"+num+"']").attr("readonly",false);
xx.find("[id='EMP_CONTRACT.EMPCONTRACT_CONMONTHS_4363_"+num+"']").css("display","inline");
xx.find("[id='EMP_CONTRACT.EMPCONTRACT_CONMONTHS_4363_"+num+"']").attr("class","form-control");
  var fee_time_cellObj = '			<div class="controls input-append date form_date1 input-group" data-date=""  data-link-field="dtp_input2" data-link-format="yyyy-mm-dd" style="float:left;width: 134px;">'+
  					  '				<input style="width:134px;float:left;height:25px;padding:0;border:none;background-color:#fff"type="text" readonly class="form-control " dateType="controls input-append date form_date1" id="EMP_CONTRACT.EMPCONTRACT_CONENDDATE_4363_'+num+'_datepick" styleType="dateTime"   style="width:134px;float:left;border-radius: 4px 0 0 4px;" name="EMPCONTRACT_CONENDDATE"  format="yyyy-MM-dd" valueformat="yyyy-MM-dd" />'+
						  '				<span class="input-group-addon" name="closeButton" style="padding:1px 10px 2px 10px;font-size:12px"><span class="glyphicon glyphicon-remove"></span></span>'+
  					  '				<span class="input-group-addon" name="clickButton" style="padding:1px 10px 2px 10px;font-size:12px"><span class="glyphicon glyphicon-th"></span></span>'+
  					  '			</div>'+
  					  '			<span style="color:red;"></span>';
xx.find("[id='EMP_CONTRACT.EMPCONTRACT_CONENDDATE_4363_"+num+"']").after(fee_time_cellObj);
xx.find("[id='EMP_CONTRACT.EMPCONTRACT_CONENDDATE_4363_"+num+"']").css("display","none");
		var pid = xx.attr("id");
		elementsListSelectInitFunction(e);
		cardAndCardDateWidInitFunction(e);
$("#"+x).find("[id='EMP_CONTRACT.EMPCONTRACT_CONTRACTUNIT_4363_"+num+"_select']").val(CONTRACTUNIT_value);
$("#"+x).find("[id='EMP_CONTRACT.EMPCONTRACT_CONTRACTTYPE_4363_"+num+"_select']").val(CONTRACTTYPE_value);
$("#"+x).find("[id='EMP_CONTRACT.EMPCONTRACT_CONTRACTKIND_4363_"+num+"_select']").val(CONTRACTKIND_value);
$("#"+x).find("[id='EMP_CONTRACT.EMPCONTRACT_CONBEGINDATE_4363_"+num+"_datepick']").val(CONBEGINDATE_value);
$("#"+x).find("[id='EMP_CONTRACT.EMPCONTRACT_CONENDDATE_4363_"+num+"_datepick']").val(CONENDDATE_value);
}
		if(x=='fubiao3'){
		//修改操作行样式
		$("#"+x).find("[id='"+e.id+"']").css("color","red");
		$("#"+x).find("[id='"+e.id+"']").attr("onclick","");
		$("#"+x).find("[id='"+e.id+"']").parent().parent().css("border-color","red");
		$("#"+x).find("[id='"+e.id+"']").parent().parent().addClass("CCUpdating");
		$("#"+x).find("[id='"+e.id+"']").parent().attr("class","row cell editing");
		var xx=$("#"+x).find("[id='"+e.id+"']").parent();//当前操作行,所有下拉日期改变控件样式
		var obj1 ;
var TITLEGRADE_value = xx.find("[name='EMPBGTITLE_TITLEGRADE']").val();
var kvArray_83869 = {'高级':'1','中级':'2','初级':'3','无职称':'4'};
TITLEGRADE_value = kvArray_83869[TITLEGRADE_value];
var VALIDDATE_value = xx.find("[name='EMPBGTITLE_VALIDDATE']").val();
xx.find("[id='EMP_BG_TITLE.EMPBGTITLE_TITLE_4367_"+num+"']").attr("readonly",false);
xx.find("[id='EMP_BG_TITLE.EMPBGTITLE_TITLE_4367_"+num+"']").css("display","inline");
xx.find("[id='EMP_BG_TITLE.EMPBGTITLE_TITLE_4367_"+num+"']").attr("class","form-control");
  var EMPBGTITLE_TITLEGRADE_cellObj = '			<select id="EMP_BG_TITLE.EMPBGTITLE_TITLEGRADE_4367_'+num+'_select" title="职称级别"  styleType="select" name="EMPBGTITLE_TITLEGRADE" style="width:200px;float:left;height:25px;padding:0;border:none;background-color:#fff" columnId="83869" class="form-control " dataField1 = "dict"  emptyText=""  style="float:left;width:200px;" textField="dictName" valueField="dictId" DictName="emp_TITLEGRADE" dataField="dicts_form_83869"initParam = "_"></select>';
	xx.find("[id='EMP_BG_TITLE.EMPBGTITLE_TITLEGRADE_4367_"+num+"']").after(EMPBGTITLE_TITLEGRADE_cellObj);
	xx.find("[id='EMP_BG_TITLE.EMPBGTITLE_TITLEGRADE_4367_"+num+"']").css("display","none");
  var fee_time_cellObj = '			<div class="controls input-append date form_date1 input-group" data-date=""  data-link-field="dtp_input2" data-link-format="yyyy-mm-dd" style="float:left;width: 134px;">'+
  					  '				<input style="width:134px;float:left;height:25px;padding:0;border:none;background-color:#fff"type="text" readonly class="form-control " dateType="controls input-append date form_date1" id="EMP_BG_TITLE.EMPBGTITLE_VALIDDATE_4367_'+num+'_datepick" styleType="dateTime"   style="width:134px;float:left;border-radius: 4px 0 0 4px;" name="EMPBGTITLE_VALIDDATE"  format="yyyy-MM-dd" valueformat="yyyy-MM-dd" />'+
						  '				<span class="input-group-addon" name="closeButton" style="padding:1px 10px 2px 10px;font-size:12px"><span class="glyphicon glyphicon-remove"></span></span>'+
  					  '				<span class="input-group-addon" name="clickButton" style="padding:1px 10px 2px 10px;font-size:12px"><span class="glyphicon glyphicon-th"></span></span>'+
  					  '			</div>'+
  					  '			<span style="color:red;"></span>';
xx.find("[id='EMP_BG_TITLE.EMPBGTITLE_VALIDDATE_4367_"+num+"']").after(fee_time_cellObj);
xx.find("[id='EMP_BG_TITLE.EMPBGTITLE_VALIDDATE_4367_"+num+"']").css("display","none");
xx.find("[id='EMP_BG_TITLE.EMPBGTITLE_TITLENO_4367_"+num+"']").attr("readonly",false);
xx.find("[id='EMP_BG_TITLE.EMPBGTITLE_TITLENO_4367_"+num+"']").css("display","inline");
xx.find("[id='EMP_BG_TITLE.EMPBGTITLE_TITLENO_4367_"+num+"']").attr("class","form-control");
		var pid = xx.attr("id");
		elementsListSelectInitFunction(e);
		cardAndCardDateWidInitFunction(e);
$("#"+x).find("[id='EMP_BG_TITLE.EMPBGTITLE_TITLEGRADE_4367_"+num+"_select']").val(TITLEGRADE_value);
$("#"+x).find("[id='EMP_BG_TITLE.EMPBGTITLE_VALIDDATE_4367_"+num+"_datepick']").val(VALIDDATE_value);
}
		if(x=='fubiao4'){
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
  var fee_time_cellObj = '			<div class="controls input-append date form_date1 input-group" data-date=""  data-link-field="dtp_input2" data-link-format="yyyy-mm-dd" style="float:left;width: 134px;">'+
  					  '				<input style="width:134px;float:left;height:25px;padding:0;border:none;background-color:#fff"type="text" readonly class="form-control " dateType="controls input-append date form_date1" id="EMP_BG_WORKEXPERIENCE.EMPBGWORKEXPERIENCE_BEGINDATE_4365_'+num+'_datepick" styleType="dateTime"   style="width:134px;float:left;border-radius: 4px 0 0 4px;" name="EMPBGWORKEXPERIENCE_BEGINDATE"  format="yyyy-MM-dd" valueformat="yyyy-MM-dd" />'+
						  '				<span class="input-group-addon" name="closeButton" style="padding:1px 10px 2px 10px;font-size:12px"><span class="glyphicon glyphicon-remove"></span></span>'+
  					  '				<span class="input-group-addon" name="clickButton" style="padding:1px 10px 2px 10px;font-size:12px"><span class="glyphicon glyphicon-th"></span></span>'+
  					  '			</div>'+
  					  '			<span style="color:red;"></span>';
xx.find("[id='EMP_BG_WORKEXPERIENCE.EMPBGWORKEXPERIENCE_BEGINDATE_4365_"+num+"']").after(fee_time_cellObj);
xx.find("[id='EMP_BG_WORKEXPERIENCE.EMPBGWORKEXPERIENCE_BEGINDATE_4365_"+num+"']").css("display","none");
  var fee_time_cellObj = '			<div class="controls input-append date form_date1 input-group" data-date=""  data-link-field="dtp_input2" data-link-format="yyyy-mm-dd" style="float:left;width: 134px;">'+
  					  '				<input style="width:134px;float:left;height:25px;padding:0;border:none;background-color:#fff"type="text" readonly class="form-control " dateType="controls input-append date form_date1" id="EMP_BG_WORKEXPERIENCE.EMPBGWORKEXPERIENCE_ENDDATE_4365_'+num+'_datepick" styleType="dateTime"   style="width:134px;float:left;border-radius: 4px 0 0 4px;" name="EMPBGWORKEXPERIENCE_ENDDATE"  format="yyyy-MM-dd" valueformat="yyyy-MM-dd" />'+
						  '				<span class="input-group-addon" name="closeButton" style="padding:1px 10px 2px 10px;font-size:12px"><span class="glyphicon glyphicon-remove"></span></span>'+
  					  '				<span class="input-group-addon" name="clickButton" style="padding:1px 10px 2px 10px;font-size:12px"><span class="glyphicon glyphicon-th"></span></span>'+
  					  '			</div>'+
  					  '			<span style="color:red;"></span>';
xx.find("[id='EMP_BG_WORKEXPERIENCE.EMPBGWORKEXPERIENCE_ENDDATE_4365_"+num+"']").after(fee_time_cellObj);
xx.find("[id='EMP_BG_WORKEXPERIENCE.EMPBGWORKEXPERIENCE_ENDDATE_4365_"+num+"']").css("display","none");
xx.find("[id='EMP_BG_WORKEXPERIENCE.EMPBGWORKEXPERIENCE_WORKUNIT_4365_"+num+"']").attr("readonly",false);
xx.find("[id='EMP_BG_WORKEXPERIENCE.EMPBGWORKEXPERIENCE_WORKUNIT_4365_"+num+"']").css("display","inline");
xx.find("[id='EMP_BG_WORKEXPERIENCE.EMPBGWORKEXPERIENCE_WORKUNIT_4365_"+num+"']").attr("class","form-control");
xx.find("[id='EMP_BG_WORKEXPERIENCE.EMPBGWORKEXPERIENCE_DEPARTMENT_4365_"+num+"']").attr("readonly",false);
xx.find("[id='EMP_BG_WORKEXPERIENCE.EMPBGWORKEXPERIENCE_DEPARTMENT_4365_"+num+"']").css("display","inline");
xx.find("[id='EMP_BG_WORKEXPERIENCE.EMPBGWORKEXPERIENCE_DEPARTMENT_4365_"+num+"']").attr("class","form-control");
xx.find("[id='EMP_BG_WORKEXPERIENCE.EMPBGWORKEXPERIENCE_POSITION_4365_"+num+"']").attr("readonly",false);
xx.find("[id='EMP_BG_WORKEXPERIENCE.EMPBGWORKEXPERIENCE_POSITION_4365_"+num+"']").css("display","inline");
xx.find("[id='EMP_BG_WORKEXPERIENCE.EMPBGWORKEXPERIENCE_POSITION_4365_"+num+"']").attr("class","form-control");
xx.find("[id='EMP_BG_WORKEXPERIENCE.EMPBGWORKEXPERIENCE_WORKNATURE_4365_"+num+"']").attr("readonly",false);
xx.find("[id='EMP_BG_WORKEXPERIENCE.EMPBGWORKEXPERIENCE_WORKNATURE_4365_"+num+"']").css("display","inline");
xx.find("[id='EMP_BG_WORKEXPERIENCE.EMPBGWORKEXPERIENCE_WORKNATURE_4365_"+num+"']").attr("class","form-control");
		var pid = xx.attr("id");
		elementsListSelectInitFunction(e);
		cardAndCardDateWidInitFunction(e);
$("#"+x).find("[id='EMP_BG_WORKEXPERIENCE.EMPBGWORKEXPERIENCE_BEGINDATE_4365_"+num+"_datepick']").val(BEGINDATE_value);
$("#"+x).find("[id='EMP_BG_WORKEXPERIENCE.EMPBGWORKEXPERIENCE_ENDDATE_4365_"+num+"_datepick']").val(ENDDATE_value);
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
	if(e=='fubiao3'){
		Currentpage13=0;
		zuixin3=null;
		youxiao3='Y';
	}
	if(e=='fubiao4'){
		Currentpage14=0;
		zuixin4=null;
		youxiao4='Y';
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
	if(e=='fubiao3'){
		Currentpage13=0;
		youxiao3=null;
		zuixin3='Y';
	}
	if(e=='fubiao4'){
		Currentpage14=0;
		youxiao4=null;
		zuixin4='Y';
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
	if(e=='fubiao3'){
		Currentpage13=0;
		youxiao3=null;
		zuixin3=null;
	}
	if(e=='fubiao4'){
		Currentpage14=0;
		youxiao4=null;
		zuixin4=null;
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
	if(e=='fubiao3'){
		Currentpage13--;
		loadDataStart2(e);
	}
	if(e=='fubiao4'){
		Currentpage14--;
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
	if(e=='fubiao3'){
		Currentpage13--;
		loadDataStart2(e);
	}
	if(e=='fubiao4'){
		Currentpage14--;
		loadDataStart2(e);
	}
	loadDataStart2(e);
}
	 function loadDataStart2(e){
	 if(e=='fubiao1'){
		 $.ajax({
			url: "/myehr/form/cardformInitData.action",
			type: 'post',
			data:grid_emp_loyee_size_fun(xx),//HTTP请求类型
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
			data:grid_emp_hetongxin_fun(xx),//HTTP请求类型
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
	 if(e=='fubiao3'){
		 $.ajax({
			url: "/myehr/form/cardformInitData.action",
			type: 'post',
			data:grid_EMPBG_TITLE_LIST_fun(xx),//HTTP请求类型
			contentType: 'application/json;charset=utf-8',
			cache: false,
			async: false,
			success: function (data) {
				Currentpage03++;
				var arr=data.rows;
				showDate_3863(arr,data.total,e);
			  }
		});
	 }
	 if(e=='fubiao4'){
		 $.ajax({
			url: "/myehr/form/cardformInitData.action",
			type: 'post',
			data:grid_EMP_BGWORKEXPERIENCE_A1_fun(xx),//HTTP请求类型
			contentType: 'application/json;charset=utf-8',
			cache: false,
			async: false,
			success: function (data) {
				Currentpage04++;
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
			data:grid_emp_loyee_size_funx(xx),//HTTP请求类型
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
			data:grid_emp_hetongxin_funx(xx),//HTTP请求类型
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
	 if(e=='fubiao3'){
		 $.ajax({
			url: "/myehr/form/cardformInitData.action",
			type: 'post',
			data:grid_EMPBG_TITLE_LIST_funx(xx),//HTTP请求类型
			contentType: 'application/json;charset=utf-8',
			cache: false,
			async: false,
			success: function (data) {
				Currentpage03++;
				var arr=data.rows;
				showDate_3864(arr,data.total,e);
			  }
		});
	 }
	 if(e=='fubiao4'){
		 $.ajax({
			url: "/myehr/form/cardformInitData.action",
			type: 'post',
			data:grid_EMP_BGWORKEXPERIENCE_A1_funx(xx),//HTTP请求类型
			contentType: 'application/json;charset=utf-8',
			cache: false,
			async: false,
			success: function (data) {
				Currentpage04++;
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
			data:grid_emp_loyee_size_funx(xx),//HTTP请求类型
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
			data:grid_emp_hetongxin_funx(xx),//HTTP请求类型
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
	 if(e=='fubiao3'){
		 $.ajax({
			url: "/myehr/form/cardformInitData.action",
			type: 'post',
			data:grid_EMPBG_TITLE_LIST_funx(xx),//HTTP请求类型
			contentType: 'application/json;charset=utf-8',
			cache: false,
			async: false,
			success: function (data) {
				Currentpage03++;
				var arr=data.rows;
				showAccount(arr,e);
			  }
		});
	 }
	 if(e=='fubiao4'){
		 $.ajax({
			url: "/myehr/form/cardformInitData.action",
			type: 'post',
			data:grid_EMP_BGWORKEXPERIENCE_A1_funx(xx),//HTTP请求类型
			contentType: 'application/json;charset=utf-8',
			cache: false,
			async: false,
			success: function (data) {
				Currentpage04++;
				var arr=data.rows;
				showAccount(arr,e);
			  }
		});
	 }
	}
function grid_emp_loyee_size_fun(pageReqeust){
	var _filterdata={};
	var paramsMap = {};
	var requestParam={};
requestParam = {EMPVEMPBASIC_EMPID:EMPVEMPBASIC_EMPID_parameter};
	pageReqeust.containerParam=containerParam_4366;
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.userIds=param_empIds;
	pageReqeust.formId=_formId_4366;
	pageReqeust.isView=null;
	pageReqeust.offset=Currentpage11*pagesize11;;
	pageReqeust.limit=pagesize11;;
	if(heightGadedata_4366!=null&&heightGadedata_4366!=undefined){
		pageReqeust.heightGrade = heightGadedata_4366;
	}
	queryParams = JSON.stringify(pageReqeust);
	return queryParams;
}
function grid_emp_loyee_size_funx(pageReqeust){
	var _filterdata={};
	var paramsMap = {};
	var requestParam={};
requestParam = {EMPVEMPBASIC_EMPID:EMPVEMPBASIC_EMPID_parameter};
	pageReqeust.containerParam=containerParam_4366;
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.userIds=param_empIds;
	pageReqeust.formId=_formId_4366;
	pageReqeust.isView=null;
	pageReqeust.offset=Currentpage21*pagesize21;;
	pageReqeust.limit=pagesize21;;
	if(heightGadedata_4366!=null&&heightGadedata_4366!=undefined){
		pageReqeust.heightGrade = heightGadedata_4366;
	}
	queryParams = JSON.stringify(pageReqeust);
	return queryParams;
}
function grid_emp_hetongxin_fun(pageReqeust){
	var _filterdata={};
	var paramsMap = {};
	var requestParam={};
requestParam = {EMPVEMPBASIC_EMPID:EMPVEMPBASIC_EMPID_parameter};
	pageReqeust.containerParam=containerParam_4363;
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.userIds=param_empIds;
	pageReqeust.formId=_formId_4363;
	pageReqeust.isView=null;
	pageReqeust.offset=Currentpage12*pagesize12;;
	pageReqeust.limit=pagesize12;;
	if(heightGadedata_4363!=null&&heightGadedata_4363!=undefined){
		pageReqeust.heightGrade = heightGadedata_4363;
	}
	queryParams = JSON.stringify(pageReqeust);
	return queryParams;
}
function grid_emp_hetongxin_funx(pageReqeust){
	var _filterdata={};
	var paramsMap = {};
	var requestParam={};
requestParam = {EMPVEMPBASIC_EMPID:EMPVEMPBASIC_EMPID_parameter};
	pageReqeust.containerParam=containerParam_4363;
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.userIds=param_empIds;
	pageReqeust.formId=_formId_4363;
	pageReqeust.isView=null;
	pageReqeust.offset=Currentpage22*pagesize22;;
	pageReqeust.limit=pagesize22;;
	if(heightGadedata_4363!=null&&heightGadedata_4363!=undefined){
		pageReqeust.heightGrade = heightGadedata_4363;
	}
	queryParams = JSON.stringify(pageReqeust);
	return queryParams;
}
function grid_EMPBG_TITLE_LIST_fun(pageReqeust){
	var _filterdata={};
	var paramsMap = {};
	var requestParam={};
requestParam = {EMPVEMPBASIC_EMPID:EMPVEMPBASIC_EMPID_parameter};
	pageReqeust.containerParam=containerParam_4367;
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.userIds=param_empIds;
	pageReqeust.formId=_formId_4367;
	pageReqeust.isView=null;
	pageReqeust.offset=Currentpage13*pagesize13;;
	pageReqeust.limit=pagesize13;;
	if(heightGadedata_4367!=null&&heightGadedata_4367!=undefined){
		pageReqeust.heightGrade = heightGadedata_4367;
	}
	queryParams = JSON.stringify(pageReqeust);
	return queryParams;
}
function grid_EMPBG_TITLE_LIST_funx(pageReqeust){
	var _filterdata={};
	var paramsMap = {};
	var requestParam={};
requestParam = {EMPVEMPBASIC_EMPID:EMPVEMPBASIC_EMPID_parameter};
	pageReqeust.containerParam=containerParam_4367;
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.userIds=param_empIds;
	pageReqeust.formId=_formId_4367;
	pageReqeust.isView=null;
	pageReqeust.offset=Currentpage23*pagesize23;;
	pageReqeust.limit=pagesize23;;
	if(heightGadedata_4367!=null&&heightGadedata_4367!=undefined){
		pageReqeust.heightGrade = heightGadedata_4367;
	}
	queryParams = JSON.stringify(pageReqeust);
	return queryParams;
}
function grid_EMP_BGWORKEXPERIENCE_A1_fun(pageReqeust){
	var _filterdata={};
	var paramsMap = {};
	var requestParam={};
requestParam = {EMPVEMPBASIC_EMPID:EMPVEMPBASIC_EMPID_parameter};
	pageReqeust.containerParam=containerParam_4365;
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.userIds=param_empIds;
	pageReqeust.formId=_formId_4365;
	pageReqeust.isView=null;
	pageReqeust.offset=Currentpage14*pagesize14;;
	pageReqeust.limit=pagesize14;;
	if(heightGadedata_4365!=null&&heightGadedata_4365!=undefined){
		pageReqeust.heightGrade = heightGadedata_4365;
	}
	queryParams = JSON.stringify(pageReqeust);
	return queryParams;
}
function grid_EMP_BGWORKEXPERIENCE_A1_funx(pageReqeust){
	var _filterdata={};
	var paramsMap = {};
	var requestParam={};
requestParam = {EMPVEMPBASIC_EMPID:EMPVEMPBASIC_EMPID_parameter};
	pageReqeust.containerParam=containerParam_4365;
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.userIds=param_empIds;
	pageReqeust.formId=_formId_4365;
	pageReqeust.isView=null;
	pageReqeust.offset=Currentpage24*pagesize24;;
	pageReqeust.limit=pagesize24;;
	if(heightGadedata_4365!=null&&heightGadedata_4365!=undefined){
		pageReqeust.heightGrade = heightGadedata_4365;
	}
	queryParams = JSON.stringify(pageReqeust);	
	return queryParams;
}
	 function initAddValue(e,num){
	 if(e=='fubiao1'){
	 	num--;
		var obj = $("#newElement"+num);
	 }
	 if(e=='fubiao2'){
	 	num--;
		var obj = $("#newElement"+num);
	 }
	 if(e=='fubiao3'){
	 	num--;
		var obj = $("#newElement"+num);
	 }
	 if(e=='fubiao4'){
	 	num--;
		var obj = $("#newElement"+num);
	 }
	}
