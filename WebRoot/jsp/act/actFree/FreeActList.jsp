<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/common/commontest.jsp" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<script type="text/javascript" src="/myehr/common/js/newcardandcard.js?v1.0.0.12"></script>
<script type="text/javascript" src="/myehr/common/js/date-format.js"></script>
<script type="text/javascript" src="/myehr/jsp/formbuild/LC_Branchstaffing_tab.js?v1.0.0.32"></script>
<link rel="stylesheet" href="/myehr/common/css/newcardandcard.css" type="text/css"></link>
<link rel="stylesheet" href="/myehr/common/css/font-awesome-4.7.0/css/font-awesome.min.css" type="text/css"></link>
<link rel="stylesheet" href="/myehr/common/js/assets/bootstrap/css/bootstrap.css" type="text/css"></link>
<link rel="stylesheet" href="/myehr/common/css/CC.css?v1.0.0.0.5" type="text/css"></link>
<html>
<head>
<meta charset="utf-8">
<meta name="apple-mobile-web-app-capable" content="yes">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name ="viewport" content ="initial-scale=1, maximum-scale=3, minimum-scale=1, user-scalable=no">
<style type="text/css">
html,body{min-height: 100%;}
.row{padding:0 30px 0 15px}
.deleteButton:hover {color: red}
.saveButton:hover {color: red}
.updateButton:hover {color: red}
.contact-box{padding:5px !important ;margin-bottom:10px !important;}
.maodian{height:30px;width:100px;display:block;text-align: center;font-size:15px;margin:0 0 20px 0;cursor:pointer !important;}
.maodianA{text-decoration:none !important;}
#maodianS:before
{ 
	content: '';
    position: absolute;
    top: 0;
    left: 23px;
    height: 100%;
    width: 2px;
	border:2px dashed pink;
	z-index:1px
}
</style>
<script type="text/javascript" src="/myehr/jsp/formbuild/TP_management/Xiamenprocess/lc_personnel/LC_Branchstaffing_tab.js"></script>
</head>
<body class="gray-bg" >
<div class="container-fluid" id="CardAndCardForm" style="height: 94%;overflow-y: auto;overflow-x:  hidden;padding: 0px;">

<div class="row mainFormElements" style="margin-left:0;padding: 0 15px 0 0;position:relative;" id="LC_Branchstaffing">


<input type="button" id="zhankai_main"  class="btn btn-info CCButtonelement" value="展开" style="position:absolute;right:30px;bottom:10px;z-index:999" onclick="showDate_Main(main_Datas,0,this)"/>
</div>

</div>

</div>
</div>
<script>
var BUSINESSID_urlparam= '';
var BUSINESSID_urlParam='';
	var _formId_4091='4091';
var realFormId='4090';
var initFun4091= '';
var currentdate_4091_78138= getSystemDate();
var EMP_DEPID_session_4091='';
if(''!='null'){EMP_DEPID_session_4091=''}
var JOB_NAME_session_4091='';
if(''!='null'){JOB_NAME_session_4091=''}
var A_NAME_session_4091='';
if(''!='null'){A_NAME_session_4091=''}
var EMP_JOBID_session_4091='';
if(''!='null'){EMP_JOBID_session_4091=''}
var EMP_NAME_session_4091='';
if(''!='null'){EMP_NAME_session_4091=''}
var EMP_EMPID_session_4091='';
if(''!='null'){EMP_EMPID_session_4091=''}
var businessId_parameter_4091='';
var param_empIds = '';
var isApp = '';
var param_flowAction = 'start';
var param_key = 'personnnment';
var param_taskId = '';
var param_procInsId = '';
var formId_main = '4091';
var flowAction = 'start';
var BUSSINESSID_ACT = '';
$(document).ready(function () {

$("#zhankai_main").click();
var sizeLimit = '50000';
var typeLimit = null;
var numLimit = "1";
changeFileCss();

$("#zhankaiComment").click();
})
var BUSINESSID;var heightGadedata_4091 =[];
var containerParam_4091 ={};
containerParam_4091 ={};
function changeHeightGadedata_4091(data){
	heightGadedata_4091 = data;
}
var heightGadedata_4089 =[];
var containerParam_4089 ={};
containerParam_4089 ={};
function changeHeightGadedata_4089(data){
	heightGadedata_4089 = data;
}
var _formId_4089='4089';
var heightGadedata_4373 =[];
var containerParam_4373 ={};
containerParam_4373 ={};
function changeHeightGadedata_4373(data){
	heightGadedata_4373 = data;
}
var _formId_4373='4373';
var filterParam = {};
var queryParams;
function grid_LC_Branchstaffing_fun11_4091(){
	loadDataStart();

}
//当前页和一次显示多少条数据
var Currentpage = 0;
var pagesize = 10;
function animationHover(element, animation) {
    element = $(element);
    element.hover(
        function () {
           element.addClass('animated ' + animation);
        },
        function () {
            //动画完成之前移除class
            window.setTimeout(function () {
                element.removeClass('animated ' + animation);
            }, 2000);
        });
};
function getEmpPhotoSYS(){
	var objs = $("#Employee_Photo_WT");
	if(objs.length>0){
		$.ajax({ 
			   url:'/myehr/FileList/getEmpPhotoSYS.action?EMPID=',
			   type:'post',
			   cache: false,
			   async: false, 
			   success: function (data){ 
				   $("#Employee_Photo_WT").attr("src",data[0]);
			   }
		   });
	}
}
//作为一个对象的w和h属性返回视口的尺寸
function getViewportSize(w){
    w = w || window;
    if(w.innerWidth != null){
        return {w: w.innerWidth, h: w.innerHeight};}
    var d = w.document;
    if(document.compatMode == "CSS1Compat"){
        return {w: d.documentElement.clientWidth, h: d.documentElement.clientHeight};}
    return {w: d.body.clientWidth, h: d.body.clientHeight};
}
//检测滚动条是否滚动到页面底部
function isScrollToPageBottom(){
    //文档高度
    var documentHeight = document.documentElement.offsetHeight;
    var viewPortHeight = getViewportSize().h;
    var scrollHeight = window.pageYOffset ||
            document.documentElement.scrollTop ||
            document.body.scrollTop || 0;
    return documentHeight - viewPortHeight - scrollHeight < 50;
}
//如果滚动条滚动到页面底部，需要加载新的数据,并且显示加载提示
function watchScroll(){
    if(!isScrollToPageBottom()){
        setTimeout( arguments.callee, 900);
        return;            
    }//loadDataDynamic();
}
//获取区间中的一个随机数
function rand(n, m){
    var random = Math.floor(Math.random()*(m-n+1)+n);
    return random;
};
var containerParam_4091={};
var xx = {};
var main_Datas = [];


	 function showDate_Main(arr,total,e){
		$(e).css("display","none");$(e).attr("onclick","");
		 var cellObj = '';
		 for (var i = 0; i == 0; i--) {


var PERSONNEL_CNAME = '';
if(arr.length>0&&arr[i].PERSONNEL_CNAME!=null&&flowAction!='start'){
PERSONNEL_CNAME = arr[i].PERSONNEL_CNAME;
}
if(flowAction=='start'){
}
var PERSONNEL_COMPID = '';
if(arr.length>0&&arr[i].PERSONNEL_COMPID!=null&&flowAction!='start'){
PERSONNEL_COMPID = arr[i].PERSONNEL_COMPID;
}
var PERSONNEL_DEPARTMENT = '';
if(arr.length>0&&arr[i].PERSONNEL_DEPARTMENT!=null&&flowAction!='start'){
PERSONNEL_DEPARTMENT = arr[i].PERSONNEL_DEPARTMENT;
}
	cellObj += 		'<div class="col-md-12 col-sm-12 col-lg-12 CCM_ELEMENT" id="MainElement" >'+
							'    <div class="contact-box">'+
							'		<form class="row cell CCM_ELEMENT_ROW" >'+
    				'    <h3 class="CCFubiaoTitle CCD_TITLE">选择审批人</h3>'+
								' <span id="xinzeng" class="fa fa-plus-square-o CCD_TITLE_BUTTON" onclick="addFunctions()" title="新增"></span> '+
' <span id="shanchu" class="fa fa-minus-square-o CCD_TITLE_BUTTON" onclick="deleteFunctions()" title="删除"></span> '+
' <span id="baocun" class="fa fa-floppy-o CCD_TITLE_BUTTON" onclick="saveFunctions()" title="保存"></span> '+
'<div class="row cell">'+
   '	<div class="col-lg-4 col-md-4 col-sm-6  col-xs-12 CCM_COL" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label class="CCM_LABEL">节点顺序: </label>'+
  '			<input id="order" name="SYSUSER_USER_CODE" type="text" title="用户编码" class="form-control" vtype="illegalChar;maxLength:50;minLength:null;" style="width:200px;height:; float:left;"/>'+
  '			<span style="color:red;line-height:35px;font-size:27px"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12 CCM_COL" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label class="CCM_LABEL">选择审批人: </label>'+
  '			<select id="chooseman" title="选择审批人" styleType="select" name="SYSUSER_OPERATOR_NAME" columnId="47999"  class="form-control CCM_SELECT " emptyText=""  dataField1 = "sql"  required="true"  style="float:left;width:200px;" textField="text" valueField="id" DictName="sql4" dataField="data_form_47999"initParam = "_"></select>'+
  '			<span style="color:red;"> * </span>'+
 '		</div>'+
  '	</div>'+

'</div>'+
 						'	<div>'+
							'		<input id="submitButton_main" type="hidden" />'+
							'	</div>'+
							'		</form>'+
						//	'<div style="height:30px; line-height:30px;text-align:center;">'+
						//	'<input class="btn btn-info submitButton"  id="submitButton_main1" type="button" value="保存" style="width:50px;" onclick="submitButton_save_6735()"/>'+
						//	    '	</div>'+
							'	</div>'+
			            	'</div>';
	}
	$(".mainFormElements").append(cellObj);

		var cellObj1 = '	<div id="main_buttons" style="position:absolute;bottom:0px;left:50%;-webkit-transform: translate(-50%, -50%);">';
		if(flowAction=='start'){
			cellObj1 +=		'<input class="btn btn-info submitButton" id="submitButton_main1" type="button" value="保存路线" style="width:90px" onclick="saveWay()"/>';
		}else{
			cellObj1 +=		'		<input class="btn btn-info checkButton" id="approved_main" type="button" value="通过" onclick="approved_refer_6764(\'通过\')"/>'+
'		<input class="btn btn-info checkButton" id="approved2_main" type="button" value="驳回" onclick="approved_refer_6765(\'驳回\')"/>'+
'		<input class="btn btn-info checkButton" id="temporaryStorage_main" type="button" value="暂存" onclick="temporaryStorage_save_6914()"/>'+
							'	</div>';
		}
	$("#CardAndCardForm").append(cellObj1);

	elementsListSelectInitFunction('#submitButton_main');//初始化新增下拉控件
	elementsListCheckboxInitFunction('#submitButton_main');//初始化单选控件
	elementsListRadioInitFunction('#submitButton_main');//初始化单选控件
	cardDateWidInitFunction();//初始化新增日期控件
	changeCssForApp1();
}
    var count=1;
	function addFunctions(e){
	count++;
	  	var PERSONNEL_CNAME = '';
        var  PERSONNEL_COMPID='';
        var PERSONNEL_DEPARTMENT='';
	var cellObj = '';
	 cellObj += 		'<div class="col-md-12 col-sm-12 col-lg-12 CCM_ELEMENT" id="MainElement" >'+
							'    <div class="contact-box">'+
							'		<form class="row cell CCM_ELEMENT_ROW" >'+
                             '<h3 class="CCFubiaoTitle CCD_TITLE">选择审批人</h3>'+
                            ' <span id="xinzeng" class="fa fa-plus-square-o CCD_TITLE_BUTTON" onclick="addFunctions()" title="新增"></span> '+
                            ' <span id="shanchu" class="fa fa-minus-square-o CCD_TITLE_BUTTON" onclick="deleteFunctions()" title="删除"></span> '+
                            ' <span id="baocun" class="fa fa-floppy-o CCD_TITLE_BUTTON" onclick="saveFunctions()" title="保存"></span> '+
                            ' <div class="row cell">'+
                            ' <div class="col-lg-4 col-md-4 col-sm-6  col-xs-12 CCM_COL">'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label class="CCM_LABEL">节点顺序: </label>'+
  '			<input id=\"order_'+count+'\" name="SYSUSER_USER_CODE" type="text" title="用户编码" class="form-control" vtype="illegalChar;maxLength:50;minLength:null;" style="width:200px;height:; float:left;"/>'+
  '			<span style="color:red;line-height:35px;font-size:27px"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12 CCM_COL" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label class="CCM_LABEL">选择审批人: </label>'+
  '			<select id=\"chooseman_'+count+'\" title="选择审批人" styleType="select" name="SYSUSER_OPERATOR_NAME" columnId="47999"  class="form-control CCM_SELECT " emptyText=""  dataField1 = "sql"  required="true"  style="float:left;width:200px;" textField="text" valueField="id" DictName="sql4" dataField="data_form_47999"initParam = "_"></select>'+
  '			<span style="color:red;"> * </span>'+
 '		</div>'+
   '	</div>'+

  '</div>'+
 						'	<div>'+
							'		<input id=\"id_'+count+'\" type="hidden" />'+
							'	</div>'+
							'		</form>'+
							'	</div>'+
							'</div>';
	
	
	$(".mainFormElements").append(cellObj);
		elementsListSelectInitFunction('#id_'+count+'');//初始化新增下拉控件
	elementsListCheckboxInitFunction('#id_'+count+'');//初始化单选控件
	elementsListRadioInitFunction('#id_'+count+'');//初始化单选控件
	cardDateWidInitFunction();//初始化新增日期控件
	changeCssForApp1();
	}
	
	function saveFunctions(){
	var save={};
	 //var taskid={param.TaskId};
	  save.orderby=$("#order").val();
	  save.assigreeid=$("#chooseman").val();
	  //var choose=
	  var url='${pageContext.request.contextPath }/actfree/addactfreeway.action';
         $.ajax({
			url:url,
			type: 'post',
			data: JSON.stringify(save),
			cache: true,
			contentType: 'application/json;charset=utf-8',
			success: function (data) {
					 //$("#formlist").bootstrapTable('load',data);
					// alert(data.infoDetail);
					alert(data);
				}
		});
    
	
	
	}
	function saveWay(){
	    
	}
</script>
</body>
</html>