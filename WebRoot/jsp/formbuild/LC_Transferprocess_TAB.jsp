<%@ page language="java" import="java.util.*" import="com.myehr.common.util.LangUtil" pageEncoding="UTF-8"%>
<%@ include file="/common/cardandcard.jsp" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
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
</style>
</head>
<body class="gray-bg" >
<div class="container-fluid" style="height: 94%;overflow-y: auto;overflow-x:  hidden;padding: 0px;"><div class="row mainFormElement" style="margin-left:0;padding: 0 15px 0 0;" id="LC_Transferprocess">
<input type="button" id="zhankai_main"  class="btn btn-info CCButtonelement" value="展开" style="position:absolute;right:30px;bottom:10px;z-index:999" onclick="showDate_Main(main_Datas,0,0)"/>
</div>
</div>
<script>
	var _formId_4356='4356';
var realFormId='${param.formId}';
var param_empIds = '${param.empIds}';
var isApp = '${param.formType}';
var formId_main = '4356';
var flowAction = '${param.flowAction}';
$(document).ready(function () {
loadDataStart();
//$("#zhankai_main").click();
var sizeLimit = '50000';
var typeLimit = null;
var numLimit = "1";
initFileManage2('','','','','','fubiao0',numLimit,sizeLimit,typeLimit);
changeFileCss();
})
var heightGadedata_4356 =[];
var containerParam_4356 ={};
containerParam_4356 ={};
function changeHeightGadedata_4356(data){
	heightGadedata_4356 = data;
}
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
			   url:'/myehr/FileList/getEmpPhotoSYS.action',
			   type:'post',
			   cache: false,
			   async: false, 
			   success: function (data){ 
				   $("#Employee_Photo_WT").attr("src","data:image/gif;base64,"+data);
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
var containerParam_4356={};
var xx = {};
var main_Datas = [];
function loadDataStart(){
$.ajax({
    url: "/myehr/form/cardformInitData.action",
    type: 'post',
    data:grid_LC_Transferprocess_fun(xx),//HTTP请求类型
    contentType: 'application/json;charset=utf-8',
    cache: false,
    async: false,
    success: function (data) {
	 	 Currentpage++;
        console.log(data);
        var arr=data.rows;
        main_Datas=data.rows;
		if(arr.length>0){
		}
      }
});
}
function showDate_4356(arr) {
if('${param.flowAction}'=='start'){
    var cellObj = $(
        '<div class="col-md-12 col-sm-12 col-lg-6">'+
        '    <div class="contact-box">'+
        '            <div class="col-sm-8">'+
        '                <h3 style="margin-top:0;overflow:hidden;height:35px;color:#000000;" ></h3>'+
        '                <div class="row" id="row" style="width:500px">'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">工号: </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">姓名: </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">机构: </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">部门: </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">岗位: </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">入行日期: </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">员工类型: </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">在岗状态: </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">调动后机构: </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">调动后部门: </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">调动后岗位: </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">调动后行员级别: </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">调动后行员等级: </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">调动类型: </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">调动原因: </label>'+
		 '					</div>'+
		 '				</div>'+
        '                </div>'+
        '            </div>'+
        '            <div class="clearfix"></div>'+
        '        </a>'+
        '    </div>'+
        '</div>');
    animationHover(cellObj, 'pulse');
    $('#LC_Transferprocess').append(cellObj);
}else{
for (var i = arr.length - 1; i >= 0; i--) {
var LCTRANSFER_compid = arr[i].LCTRANSFER_compid;
var LCTRANSFER_empid = arr[i].LCTRANSFER_empid;
var LCTRANSFER_cname = arr[i].LCTRANSFER_cname;
var LCTRANSFER_compid = arr[i].LCTRANSFER_compid;
var LCTRANSFER_depid = arr[i].LCTRANSFER_depid;
var LCTRANSFER_jobid = arr[i].LCTRANSFER_jobid;
var LCTRANSFER_JOINDATE = arr[i].LCTRANSFER_JOINDATE;
if(arr[i].LCTRANSFER_JOINDATE!=null){
	 LCTRANSFER_JOINDATE = new Date(LCTRANSFER_JOINDATE).Format("yyyy-MM-dd");
}
var LCTRANSFER_EMPTYPE = arr[i].LCTRANSFER_EMPTYPE;
var LCTRANSFER_JOBSTATUS = arr[i].LCTRANSFER_JOBSTATUS;
var LCTRANSFER_ncompid = arr[i].LCTRANSFER_ncompid;
var LCTRANSFER_ndepid = arr[i].LCTRANSFER_ndepid;
var LCTRANSFER_njobid = arr[i].LCTRANSFER_njobid;
var LCTRANSFER_NEMPGRADE = arr[i].LCTRANSFER_NEMPGRADE;
var LCTRANSFER_NEMPLEVEL = arr[i].LCTRANSFER_NEMPLEVEL;
var LCTRANSFER_Transfertype = arr[i].LCTRANSFER_Transfertype;
var LCTRANSFER_reason = arr[i].LCTRANSFER_reason;
var LCTRANSFER_remark = arr[i].LCTRANSFER_remark;
    var cellObj = $(
        '<div class="col-md-12 col-sm-12 col-lg-6">'+
        '    <div class="contact-box">'+
        '            <div class="col-sm-8">'+
        '                <h3 style="margin-top:0;overflow:hidden;height:35px;color:#000000;" title="'+LCTRANSFER_compid+'"><strong>'+LCTRANSFER_compid+'</strong></h3>'+
        '                <div class="row" id="row" style="width:500px">'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">工号:'+ LCTRANSFER_empid +' </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">姓名:'+ LCTRANSFER_cname +' </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">机构:'+ LCTRANSFER_compid +' </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">部门:'+ LCTRANSFER_depid +' </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">岗位:'+ LCTRANSFER_jobid +' </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">入行日期:'+ LCTRANSFER_JOINDATE +' </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">员工类型:'+ LCTRANSFER_EMPTYPE +' </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">在岗状态:'+ LCTRANSFER_JOBSTATUS +' </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">调动后机构:'+ LCTRANSFER_ncompid +' </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">调动后部门:'+ LCTRANSFER_ndepid +' </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">调动后岗位:'+ LCTRANSFER_njobid +' </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">调动后行员级别:'+ LCTRANSFER_NEMPGRADE +' </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">调动后行员等级:'+ LCTRANSFER_NEMPLEVEL +' </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">调动类型:'+ LCTRANSFER_Transfertype +' </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">调动原因:'+ LCTRANSFER_reason +' </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">备注:'+ LCTRANSFER_remark +' </label>'+
		 '					</div>'+
		 '				</div>'+
        '                </div>'+
        '            </div>'+
        '            <div class="clearfix"></div>'+
        '        </a>'+
        '    </div>'+
        '</div>');
    animationHover(cellObj, 'pulse');
    $('#LC_Transferprocess').append(cellObj);
}
}
	}
	
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

</script>
</body>
</html>