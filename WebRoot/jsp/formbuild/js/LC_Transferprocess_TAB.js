var filterParam = {};
var queryParams;
function grid_LC_Transferprocess_fun(pageReqeust){
	var _filterdata={};
	if(document.getElementById('grid_LC_Transferprocess_filter')){
	}
	var paramsMap = {};
	var requestParam={};
		requestParam = {};
	pageReqeust.containerParam=containerParam_4356;
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.userIds=getQueryString('empIds');
	pageReqeust.formId=_formId_4356;
	pageReqeust.isView=null;
	pageReqeust.offset=Currentpage*pagesize;;
	pageReqeust.limit=pagesize;;
	if(heightGadedata_4356!=null&&heightGadedata_4356!=undefined){
		pageReqeust.heightGrade = heightGadedata_4356;
	}
	queryParams = JSON.stringify(pageReqeust);
	return queryParams;
}
function grid_LC_Transferprocess_fun11_4356(){
	loadDataStart();

}
	function LC_TRANSFER_LCTRANSFER_empid_valueChange_4356(e){

		var empid = $('[id="LC_TRANSFER.LCTRANSFER_empid_4356"]').val();
if(empid != null && empid != ""){
	//姓名
	var sql1= "SELECT CNAME FROM EMP_EMPLOYEE WHERE EMPID="+empid;
	var i1=myehr_SQLFORBID_sql(sql1);
	//机构
	var sql2= "SELECT COMPID FROM EMP_EMPLOYEE WHERE EMPID="+empid;
	var i2=myehr_SQLFORBID_sql(sql2);
	//部门
	var sql3= "SELECT DEPID FROM EMP_EMPLOYEE WHERE EMPID="+empid;
	var i3=myehr_SQLFORBID_sql(sql3);
	//岗位
	var sql4= "SELECT JOBID FROM EMP_EMPLOYEE WHERE EMPID="+empid;
	var i4=myehr_SQLFORBID_sql(sql4);
	//入职时间
	var sql5= "SELECT JOINDATE FROM EMP_EMPLOYEE WHERE EMPID="+empid;
	var i5=myehr_SQLFORBID_sql(sql5);
	//员工类型
	var sql6= "SELECT EMPTYPE FROM EMP_EMPLOYEE WHERE EMPID="+empid;
	var i6=myehr_SQLFORBID_sql(sql6);
	//在岗状态
	var sql7= "SELECT JOBSTATUS FROM EMP_EMPLOYEE WHERE EMPID="+empid;
	var i7=myehr_SQLFORBID_sql(sql7);

	if(i1!="" && i1!=null){
			$('[id="LC_TRANSFER.LCTRANSFER_cname_4356"]').val(i1[0].CNAME);
		}else{
			$('[id="LC_TRANSFER.LCTRANSFER_cname_4356"]').val("");
		}
	if(i2!="" && i2!=null){
			$('[id="LC_TRANSFER.LCTRANSFER_compid_4356"]').val(i2[0].COMPID);
		}else{
			$('[id="LC_TRANSFER.LCTRANSFER_compid_4356"]').val("");
		}	
	if(i3!="" && i3 !=null){
			$('[id="LC_TRANSFER.LCTRANSFER_depid_4356"]').val(i3[0].DEPID);
		}else{
			$('[id="LC_TRANSFER.LCTRANSFER_depid_4356"]').val("");
		}
	if(i4!="" && i4 !=null){
			$('[id="LC_TRANSFER.LCTRANSFER_jobid_4356"]').val(i4[0].JOBID);
		}else{
			$('[id="LC_TRANSFER.LCTRANSFER_jobid_4356"]').val("");
		}
	if(i5!="" && i5 !=null){
			var date = i5[0].JOINDATE;
			date = new Date(date).Format("yyyy-MM-dd hh:mm:ss");
			date = formatDatebox(date,"LC_TRANSFER.LCTRANSFER_JOINDATE_4356");
			$('[id="LC_TRANSFER.LCTRANSFER_JOINDATE_4356"]').val(date);
		}else{
			$('[id="LC_TRANSFER.LCTRANSFER_JOINDATE_4356"]').val("");
		}
	if(i6!="" && i6 !=null){
			$('[id="LC_TRANSFER.LCTRANSFER_EMPTYPE_4356"]').val(i6[0].EMPTYPE);
		}else{
			$('[id="LC_TRANSFER.LCTRANSFER_EMPTYPE_4356"]').val("");
		}
	if(i7!="" && i7 !=null){
			$('[id="LC_TRANSFER.LCTRANSFER_JOBSTATUS_4356"]').val(i7[0].JOBSTATUS);
		}else{
			$('[id="LC_TRANSFER.LCTRANSFER_JOBSTATUS_4356"]').val("");
		}				
}
	}
	 function addFunction(e){
changeCssForApp4();
	}
	 function showDate_3863(arr,total,e){
	}
	 var newElementNum = 0;
	 function showDate_3864(arr,total,e){
	}
	 function showDate_Main(arr,total,e){
		$(e).css("display","none");$(e).attr("onclick","");
		 var cellObj = '';
		 for (var i = 0; i == 0; i--) {
var LCTRANSFER_empid = '';
if(arr.length>0&&arr[i].LCTRANSFER_empid!=null&&flowAction!='start'){
LCTRANSFER_empid = arr[i].LCTRANSFER_empid;
}
var LCTRANSFER_cname = '';
if(arr.length>0&&arr[i].LCTRANSFER_cname!=null&&flowAction!='start'){
LCTRANSFER_cname = arr[i].LCTRANSFER_cname;
}
var LCTRANSFER_compid = '';
if(arr.length>0&&arr[i].LCTRANSFER_compid!=null&&flowAction!='start'){
LCTRANSFER_compid = arr[i].LCTRANSFER_compid;
}
var LCTRANSFER_depid = '';
if(arr.length>0&&arr[i].LCTRANSFER_depid!=null&&flowAction!='start'){
LCTRANSFER_depid = arr[i].LCTRANSFER_depid;
}
var LCTRANSFER_jobid = '';
if(arr.length>0&&arr[i].LCTRANSFER_jobid!=null&&flowAction!='start'){
LCTRANSFER_jobid = arr[i].LCTRANSFER_jobid;
}
var LCTRANSFER_JOINDATE = '';
if(arr.length>0&&arr[i].LCTRANSFER_JOINDATE!=null&&flowAction!='start'){
LCTRANSFER_JOINDATE = arr[i].LCTRANSFER_JOINDATE;
}
if(LCTRANSFER_JOINDATE!=null&&LCTRANSFER_JOINDATE!=""){
LCTRANSFER_JOINDATE = new Date(parseInt(LCTRANSFER_JOINDATE)).Format("yyyy-MM-dd");
}else{LCTRANSFER_JOINDATE=""}
var LCTRANSFER_EMPTYPE = '';
if(arr.length>0&&arr[i].LCTRANSFER_EMPTYPE!=null&&flowAction!='start'){
LCTRANSFER_EMPTYPE = arr[i].LCTRANSFER_EMPTYPE;
}
var LCTRANSFER_JOBSTATUS = '';
if(arr.length>0&&arr[i].LCTRANSFER_JOBSTATUS!=null&&flowAction!='start'){
LCTRANSFER_JOBSTATUS = arr[i].LCTRANSFER_JOBSTATUS;
}
var LCTRANSFER_ncompid = '';
if(arr.length>0&&arr[i].LCTRANSFER_ncompid!=null&&flowAction!='start'){
LCTRANSFER_ncompid = arr[i].LCTRANSFER_ncompid;
}
var LCTRANSFER_ndepid = '';
if(arr.length>0&&arr[i].LCTRANSFER_ndepid!=null&&flowAction!='start'){
LCTRANSFER_ndepid = arr[i].LCTRANSFER_ndepid;
}
var LCTRANSFER_njobid = '';
if(arr.length>0&&arr[i].LCTRANSFER_njobid!=null&&flowAction!='start'){
LCTRANSFER_njobid = arr[i].LCTRANSFER_njobid;
}
var LCTRANSFER_NEMPGRADE = '';
if(arr.length>0&&arr[i].LCTRANSFER_NEMPGRADE!=null&&flowAction!='start'){
LCTRANSFER_NEMPGRADE = arr[i].LCTRANSFER_NEMPGRADE;
}
var LCTRANSFER_NEMPLEVEL = '';
if(arr.length>0&&arr[i].LCTRANSFER_NEMPLEVEL!=null&&flowAction!='start'){
LCTRANSFER_NEMPLEVEL = arr[i].LCTRANSFER_NEMPLEVEL;
}
var LCTRANSFER_Transfertype = '';
if(arr.length>0&&arr[i].LCTRANSFER_Transfertype!=null&&flowAction!='start'){
LCTRANSFER_Transfertype = arr[i].LCTRANSFER_Transfertype;
}
var LCTRANSFER_reason = '';
if(arr.length>0&&arr[i].LCTRANSFER_reason!=null&&flowAction!='start'){
LCTRANSFER_reason = arr[i].LCTRANSFER_reason;
}
var LCTRANSFER_remark = '';
if(arr.length>0&&arr[i].LCTRANSFER_remark!=null&&flowAction!='start'){
LCTRANSFER_remark = arr[i].LCTRANSFER_remark;
}
var LCTRANSFER_id = '';
if(arr.length>0&&arr[i].LCTRANSFER_id!=null&&flowAction!='start'){
LCTRANSFER_id = arr[i].LCTRANSFER_id;
}
var LCTRANSFER_empcode = '';
if(arr.length>0&&arr[i].LCTRANSFER_empcode!=null&&flowAction!='start'){
LCTRANSFER_empcode = arr[i].LCTRANSFER_empcode;
}
			cellObj += 		'<div class="col-md-12 col-sm-12 col-lg-12" id="MainElement" style="position: static;">'+
							'    <div class="contact-box">'+
							'		<form class="row cell" style="padding-right:50px;padding-bottom:40px">'+
'<h3 style=" background:#FFF; display:block;font-size:18;text-align:left;height: 36px;line-height: 33px;padding-left: 16px;color: #666;cursor: pointer;">申请人信息</h3>'+
'<div class="row cell">'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">工号: </label>'+
  '			<select id="LC_TRANSFER.LCTRANSFER_empid_4356" title="工号" styleType="select" name="LCTRANSFER_empid"  style="width:200px;float:left;height:25px;padding:0;border:none;background-color:#fff" class="form-control selectpicker bla bla bli" data-live-search="true" styleType2="search" emptyText=""  onchange="LC_TRANSFER_LCTRANSFER_empid_valueChange_4356(this)" style="float:left;width:200px;" showNullItem="true" textField="text" valueField="id" DictName="sql51" nullItemText="" dataField="data_form_83591"initParam = "_"></select>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6  col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">姓名: </label>'+
  '			<input id="LC_TRANSFER.LCTRANSFER_cname_4356" name="LCTRANSFER_cname" dataType="text" type="text" class="form-control" value="'+LCTRANSFER_cname+'" oninput="myFunction(this,\'LCTRANSFER_cname\')"  vtype="illegalChar;maxLength:50;minLength:null;"  style="width:200px;height:; float:left;padding:0;border:none;background-color:#fff"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">机构: </label>'+
  '			<select id="LC_TRANSFER.LCTRANSFER_compid_4356" title="机构" styleType="select" name="LCTRANSFER_compid"  style="width:200px;float:left;height:25px;padding:0;border:none;background-color:#fff" class="form-control " emptyText=""  style="float:left;width:200px;" showNullItem="true" textField="text" valueField="id" DictName="sql64" nullItemText="" dataField="data_form_83594"initParam = "_"></select>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">部门: </label>'+
  '			<select id="LC_TRANSFER.LCTRANSFER_depid_4356" title="部门" styleType="select" name="LCTRANSFER_depid"  style="width:200px;float:left;height:25px;padding:0;border:none;background-color:#fff" class="form-control " emptyText=""  style="float:left;width:200px;" showNullItem="true" textField="text" valueField="id" DictName="sql9" nullItemText="" dataField="data_form_83595"initParam = "_"></select>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">岗位: </label>'+
  '			<select id="LC_TRANSFER.LCTRANSFER_jobid_4356" title="岗位" styleType="select" name="LCTRANSFER_jobid"  style="width:200px;float:left;height:25px;padding:0;border:none;background-color:#fff" class="form-control " emptyText=""  style="float:left;width:200px;" showNullItem="true" textField="text" valueField="id" DictName="sql46" nullItemText="" dataField="data_form_83596"initParam = "_"></select>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">入行日期: </label>'+
  '			<div class="controls input-append date form_date1 input-group" data-date=""  data-link-field="dtp_input2" data-link-format="yyyy-mm-dd" style="float:left;width: 134px;">'+
  '				<input style="width:134px;float:left;height:25px;padding:0;border:none;background-color:#fff"type="text" readonly class="form-control " dateType="controls input-append date form_date1" id="LC_TRANSFER.LCTRANSFER_JOINDATE_4356" styleType="dateTime" value="'+LCTRANSFER_JOINDATE+'"  style="width:134px;float:left;border-radius: 4px 0 0 4px;" name="LCTRANSFER_JOINDATE"  format="yyyy-MM-dd" valueformat="yyyy-MM-dd" />'+
	'				<span class="input-group-addon" name="closeButton" style="padding:1px 10px 2px 10px;font-size:12px"><span class="glyphicon glyphicon-remove"></span></span>'+
  '				<span class="input-group-addon" name="clickButton" style="padding:1px 10px 2px 10px;font-size:12px"><span class="glyphicon glyphicon-th"></span></span>'+
  '			</div>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">员工类型: </label>'+
  '			<select id="LC_TRANSFER.LCTRANSFER_EMPTYPE_4356" title="员工类型" styleType="select" name="LCTRANSFER_EMPTYPE"  style="width:200px;float:left;height:25px;padding:0;border:none;background-color:#fff" class="form-control " emptyText=""  style="float:left;width:200px;" showNullItem="true" textField="dictName" valueField="dictId" DictName="emp_stafftype" nullItemText="" dataField="dicts_form_83598"initParam = "_"></select>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">在岗状态: </label>'+
  '			<select id="LC_TRANSFER.LCTRANSFER_JOBSTATUS_4356" title="在岗状态" styleType="select" name="LCTRANSFER_JOBSTATUS"  style="width:200px;float:left;height:25px;padding:0;border:none;background-color:#fff" class="form-control " emptyText=""  style="float:left;width:200px;" showNullItem="true" textField="dictName" valueField="dictId" DictName="Onduty" nullItemText="" dataField="dicts_form_83599"initParam = "_"></select>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
'</div>'+
'<h3 style=" background:#FFF; display:block;font-size:18;text-align:left;height: 36px;line-height: 33px;padding-left: 16px;color: #666;cursor: pointer;">调动信息</h3>'+
'<div class="row cell">'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">调动后机构: </label>'+
  '			<select id="LC_TRANSFER.LCTRANSFER_ncompid_4356" title="调动后机构" styleType="select" name="LCTRANSFER_ncompid"  style="width:200px;float:left;height:25px;padding:0;border:none;background-color:#fff" class="form-control selectpicker bla bla bli" data-live-search="true" styleType2="search" emptyText=""  style="float:left;width:200px;" showNullItem="true" textField="text" valueField="id" DictName="sql32" nullItemText="" dataField="data_form_83600"initParam = "_"></select>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">调动后部门: </label>'+
  '			<select id="LC_TRANSFER.LCTRANSFER_ndepid_4356" title="调动后部门" styleType="select" name="LCTRANSFER_ndepid"  style="width:200px;float:left;height:25px;padding:0;border:none;background-color:#fff" class="form-control selectpicker bla bla bli" data-live-search="true" styleType2="search" emptyText=""  style="float:left;width:200px;" showNullItem="true" textField="text" valueField="id" DictName="sql30" nullItemText="" dataField="data_form_83601"initParam = "_"></select>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">调动后岗位: </label>'+
  '			<select id="LC_TRANSFER.LCTRANSFER_njobid_4356" title="调动后岗位" styleType="select" name="LCTRANSFER_njobid"  style="width:200px;float:left;height:25px;padding:0;border:none;background-color:#fff" class="form-control selectpicker bla bla bli" data-live-search="true" styleType2="search" emptyText=""  style="float:left;width:200px;" showNullItem="true" textField="text" valueField="id" DictName="sql31" nullItemText="" dataField="data_form_83602"initParam = "_"></select>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">调动后行员级别: </label>'+
  '			<select id="LC_TRANSFER.LCTRANSFER_NEMPGRADE_4356" title="调动后行员级别" styleType="select" name="LCTRANSFER_NEMPGRADE"  style="width:200px;float:left;height:25px;padding:0;border:none;background-color:#fff" class="form-control selectpicker bla bla bli" data-live-search="true" styleType2="search" emptyText=""  style="float:left;width:200px;" showNullItem="true" textField="dictName" valueField="dictId" DictName="emp_staffgrade" nullItemText="" dataField="dicts_form_83603"initParam = "_"></select>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">调动后行员等级: </label>'+
  '			<select id="LC_TRANSFER.LCTRANSFER_NEMPLEVEL_4356" title="调动后行员等级" styleType="select" name="LCTRANSFER_NEMPLEVEL"  style="width:200px;float:left;height:25px;padding:0;border:none;background-color:#fff" class="form-control selectpicker bla bla bli" data-live-search="true" styleType2="search" emptyText=""  style="float:left;width:200px;" showNullItem="true" textField="dictName" valueField="dictId" DictName="emp_staffrank" nullItemText="" dataField="dicts_form_83604"initParam = "_"></select>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6  col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">调动类型: </label>'+
  '			<input id="LC_TRANSFER.LCTRANSFER_Transfertype_4356" name="LCTRANSFER_Transfertype" dataType="text" type="text" class="form-control" value="'+LCTRANSFER_Transfertype+'" oninput="myFunction(this,\'LCTRANSFER_Transfertype\')"  vtype="illegalChar;maxLength:10;minLength:null;"  style="width:200px;height:; float:left;padding:0;border:none;background-color:#fff"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;line-height:25px">调动原因: </label>'+
  '			<textarea id="LC_TRANSFER.LCTRANSFER_reason_4356" name="LCTRANSFER_reason" class="CCReadTextarea form-control"  vtype="illegalChar;maxLength:100;minLength:null;"  style="width:600px;height:58px; float:left;padding:0;background-color:#fff"></textarea>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;line-height:25px">备注说明: </label>'+
  '			<textarea id="LC_TRANSFER.LCTRANSFER_remark_4356" name="LCTRANSFER_remark" class="CCReadTextarea form-control"  vtype="illegalChar;maxLength:100;minLength:null;"  style="width:600px;height:58px; float:left;padding:0;background-color:#fff"></textarea>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
'</div>'+
  '	<input id="LC_TRANSFER.LCTRANSFER_id_4356" name="LCTRANSFER_id" value="'+LCTRANSFER_id+'"   type="hidden" >'+
  '	<input id="LC_TRANSFER.LCTRANSFER_empcode_4356" name="LCTRANSFER_empcode" value="'+LCTRANSFER_empcode+'"   type="hidden" >'+
							'	<div id="main_buttons" style="position:absolute;bottom:0px;left:50%;-webkit-transform: translate(-50%, -50%);">'+
							'		<input class="btn btn-info saveButton" id="saveButton_main" type="button" value="保存" style="width:50px" onclick="saveElement_main(this,\'4356\')"/>'+
							'	</div>'+
							'		</form>'+
							'	</div>'+
							'</div>';
	}
	$(".mainFormElement").append(cellObj);
	elementsListSelectInitFunction('#saveButton_main');//初始化新增下拉控件
	cardDateWidInitFunction();//初始化新增日期控件
$("[id='LC_TRANSFER.LCTRANSFER_empid_4356']").val(LCTRANSFER_empid);
$("[id='LC_TRANSFER.LCTRANSFER_compid_4356']").val(LCTRANSFER_compid);
$("[id='LC_TRANSFER.LCTRANSFER_depid_4356']").val(LCTRANSFER_depid);
$("[id='LC_TRANSFER.LCTRANSFER_jobid_4356']").val(LCTRANSFER_jobid);
$("[id='LC_TRANSFER.LCTRANSFER_EMPTYPE_4356']").val(LCTRANSFER_EMPTYPE);
$("[id='LC_TRANSFER.LCTRANSFER_JOBSTATUS_4356']").val(LCTRANSFER_JOBSTATUS);
$("[id='LC_TRANSFER.LCTRANSFER_ncompid_4356']").val(LCTRANSFER_ncompid);
$("[id='LC_TRANSFER.LCTRANSFER_ndepid_4356']").val(LCTRANSFER_ndepid);
$("[id='LC_TRANSFER.LCTRANSFER_njobid_4356']").val(LCTRANSFER_njobid);
$("[id='LC_TRANSFER.LCTRANSFER_NEMPGRADE_4356']").val(LCTRANSFER_NEMPGRADE);
$("[id='LC_TRANSFER.LCTRANSFER_NEMPLEVEL_4356']").val(LCTRANSFER_NEMPLEVEL);
	}
	 function showAccount(arr,e){
	}
	 function updateElement(e,num,x){
console.time('updateElementJs');
changeCssForApp3();
console.timeEnd('updateElementJs');
	}
function youxiaoFunction(e){
	loadDataStart2(e);
}
function zuixinFunction(e){
	loadDataStart2(e);
}
function allFunction(e){
	loadDataStart2(e);
}
function next(e){
	loadDataStart2(e);
}
function last(e){
	loadDataStart2(e);
}
	 function loadDataStart2(e){
	}
	 function loadDataStart3(e){
	}
	 function loadDataStart4(e){
	}
	 function initAddValue(e,num){
	}
