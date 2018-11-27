<%@ page language="java" import="java.util.*" import="com.myehr.common.util.LangUtil" pageEncoding="UTF-8"%>
<%@ include file="/common/dragCommon.jsp" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<body style="padding:0">
<div class="container-fluid">
	<div class="row-fluid">
		<div class="span4">
			<div class="box box-element ui-draggable removeClean" id="3354">
				<div class="wrapper wrapper-content animated fadeInRight" style="overflow-y:auto">
					<table id="Card222_List">
					</table>
					<div id="activity_pane" style="position:absolute;left:500px;top:70px">
					</div>
					</div>
				<div class="row" style="margin-left:0" id="Card222">
				</div>
			</div>
		</div>
		<div class="span4">
			<div class="box box-element ui-draggable removeClean" id="3355">
				<div class="wrapper wrapper-content animated fadeInRight" style="overflow-y:auto">
<table id="Card333_List">
</table>
<div id="activity_pane" style="position:absolute;left:500px;top:70px"></div>
</div>
<div class="row" style="margin-left:0" id="Card333">
</div>

			</div>
		</div>
		<div class="span4">
			<div class="box box-element ui-draggable removeClean" id="3356">
				<div class="wrapper wrapper-content animated fadeInRight" style="overflow-y:auto">
<table id="Card444_List">
</table>
<div id="activity_pane" style="position:absolute;left:500px;top:70px"></div>
</div>
<div class="row" style="margin-left:0" id="Card444">
</div>

			</div>
		</div>
	</div>
</div>
<script>
	var _formId_3354='3354';
var ename;var heightGadedata_3354 =[];
var containerParam_3354 ={};
containerParam_3354 ={};
function changeHeightGadedata_3354(data){
	heightGadedata_3354 = data;
}
	var _formId_3355='3355';
var ename;var heightGadedata_3355 =[];
var containerParam_3355 ={};
containerParam_3355 ={};
function changeHeightGadedata_3355(data){
	heightGadedata_3355 = data;
}
	var _formId_3356='3356';
var ename;var heightGadedata_3356 =[];
var containerParam_3356 ={};
containerParam_3356 ={};
function changeHeightGadedata_3356(data){
	heightGadedata_3356 = data;
}
$(function() {
loadDataStart_3354();
loadDataStart_3355();
loadDataStart_3356();
cardSelectInitFunction("${param.formType}");
cardDateWidInitFunction();
});
var filterParam = {};
var queryParams;
function grid_Card222_fun(pageReqeust){
	var _filterdata={};
	if(document.getElementById('grid_Card222_filter')){
	}
	var paramsMap = {};
	var requestParam={};
	if('${param.ename}'==''){
		if(ename==undefined){
			requestParam = {ename:'${param.ename}'};
		}else{
			requestParam = {ename:ename+""};
		}
	}else{
		requestParam = {ename:'${param.ename}'};
	}
	pageReqeust.containerParam=containerParam_3354;
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.userIds='${param.empIds}';
	pageReqeust.formId=_formId_3354;
	pageReqeust.isView=null;
	pageReqeust.offset=Currentpage*pagesize;;
	pageReqeust.limit=pagesize;;
	if(heightGadedata_3354!=null&&heightGadedata_3354!=undefined){
		pageReqeust.heightGrade = heightGadedata_3354;
	}
	queryParams = JSON.stringify(pageReqeust);
	return queryParams;
}
function grid_Card222_fun11_3354(){
	loadDataStart();

}
function loadDataStart_3354(){
$.ajax({
    url: "/myehr/form/cardformInitData.action",
    type: 'post',
    data:grid_Card222_fun(xx),//HTTP请求类型
    contentType: 'application/json;charset=utf-8',
    cache: false,
    async: false,
    success: function (data) {
        var arr=data.rows;
        showDate_3354(arr);
      }
});
}function showDate_3354(arr) {
var colors = new Array("#578ebe","#e35b5a","#44b6ae","#8775a7");
for (var i = arr.length - 1; i >= 0; i--) {
var colorNum = Math.ceil(Math.random()*4);    var cellObj = $(
			'<div class="col-md-12 col-sm-12 col-lg-12">'+
		'    <div class="widget style1 navy-bg" style="background-color:'+colors[colorNum]+'">'+
		'        <div class="row" id="row" >'+
		'            <div class="col-xs-4">'+
		'                <span style="font-size:80;color:#ffffff;" class="fa fa-thumbs-o-up">'+
		'            </div>'+
		'            <div class="col-xs-8 text-right">'+
		'				<div style="margin-top:10px"><span style="font-size:30;color:#ffffff;font-weight:400;">'+arr[i].TESTINFOR_guoji+'</span></div>'+
		'				<div style="margin-top:10px"><span style="font-size:20;color:#ffffff;font-weight:400;">'+arr[i].TESTINFOR_jiguan+'</span></div>'+
		'            </div>'+
		'        </div>'+
		'    </div>'+
		'</div>');
animationHover(cellObj, 'pulse');
$('#Card222').append(cellObj);
}
}
var filterParam = {};
var queryParams;
function grid_Card333_fun(pageReqeust){
	var _filterdata={};
	if(document.getElementById('grid_Card333_filter')){
	}
	var paramsMap = {};
	var requestParam={};
	if('${param.ename}'==''){
		if(ename==undefined){
			requestParam = {ename:'${param.ename}'};
		}else{
			requestParam = {ename:ename+""};
		}
	}else{
		requestParam = {ename:'${param.ename}'};
	}
	pageReqeust.containerParam=containerParam_3355;
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.userIds='${param.empIds}';
	pageReqeust.formId=_formId_3355;
	pageReqeust.isView=null;
	pageReqeust.offset=Currentpage*pagesize;;
	pageReqeust.limit=pagesize;;
	if(heightGadedata_3355!=null&&heightGadedata_3355!=undefined){
		pageReqeust.heightGrade = heightGadedata_3355;
	}
	queryParams = JSON.stringify(pageReqeust);
	return queryParams;
}
function grid_Card333_fun11_3355(){
	loadDataStart();

}
function loadDataStart_3355(){
$.ajax({
    url: "/myehr/form/cardformInitData.action",
    type: 'post',
    data:grid_Card333_fun(xx),//HTTP请求类型
    contentType: 'application/json;charset=utf-8',
    cache: false,
    async: false,
    success: function (data) {
        var arr=data.rows;
        showDate_3355(arr);
      }
});
}function showDate_3355(arr) {
var colors = new Array("#578ebe","#e35b5a","#44b6ae","#8775a7");
for (var i = arr.length - 1; i >= 0; i--) {
var colorNum = Math.ceil(Math.random()*4);    var cellObj = $(
			'<div class="col-md-12 col-sm-12 col-lg-12">'+
		'    <div class="widget style1 navy-bg" style="background-color:'+colors[colorNum]+'">'+
		'        <div class="row" id="row" >'+
		'            <div class="col-xs-4">'+
		'                <span style="font-size:80;color:#ffffff;" class="fa fa-thumbs-o-up">'+
		'            </div>'+
		'            <div class="col-xs-8 text-right">'+
		'				<div style="margin-top:10px"><span style="font-size:30;color:#ffffff;font-weight:400;">'+arr[i].TESTINFOR_bumen+'</span></div>'+
		'				<div style="margin-top:10px"><span style="font-size:20;color:#ffffff;font-weight:400;">'+arr[i].TESTINFOR_gangwei+'</span></div>'+
		'            </div>'+
		'        </div>'+
		'    </div>'+
		'</div>');
animationHover(cellObj, 'pulse');
$('#Card333').append(cellObj);
}
}
var filterParam = {};
var queryParams;
function grid_Card444_fun(pageReqeust){
	var _filterdata={};
	if(document.getElementById('grid_Card444_filter')){
	}
	var paramsMap = {};
	var requestParam={};
	if('${param.ename}'==''){
		if(ename==undefined){
			requestParam = {ename:'${param.ename}'};
		}else{
			requestParam = {ename:ename+""};
		}
	}else{
		requestParam = {ename:'${param.ename}'};
	}
	pageReqeust.containerParam=containerParam_3356;
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.userIds='${param.empIds}';
	pageReqeust.formId=_formId_3356;
	pageReqeust.isView=null;
	pageReqeust.offset=Currentpage*pagesize;;
	pageReqeust.limit=pagesize;;
	if(heightGadedata_3356!=null&&heightGadedata_3356!=undefined){
		pageReqeust.heightGrade = heightGadedata_3356;
	}
	queryParams = JSON.stringify(pageReqeust);
	return queryParams;
}
function grid_Card444_fun11_3356(){
	loadDataStart();

}
function loadDataStart_3356(){
$.ajax({
    url: "/myehr/form/cardformInitData.action",
    type: 'post',
    data:grid_Card444_fun(xx),//HTTP请求类型
    contentType: 'application/json;charset=utf-8',
    cache: false,
    async: false,
    success: function (data) {
        var arr=data.rows;
        showDate_3356(arr);
      }
});
}function showDate_3356(arr) {
var colors = new Array("#578ebe","#e35b5a","#44b6ae","#8775a7");
for (var i = arr.length - 1; i >= 0; i--) {
var colorNum = Math.ceil(Math.random()*4);    var cellObj = $(
			'<div class="col-md-12 col-sm-12 col-lg-12">'+
		'    <div class="widget style1 navy-bg" style="background-color:'+colors[colorNum]+'">'+
		'        <div class="row" id="row" >'+
		'            <div class="col-xs-4">'+
		'                <span style="font-size:80;color:#ffffff;" class="fa fa-thumbs-o-up">'+
		'            </div>'+
		'            <div class="col-xs-8 text-right">'+
		'				<div style="margin-top:10px"><span style="font-size:30;color:#ffffff;font-weight:400;">'+arr[i].TESTINFOR_biyeyuanxiao+'</span></div>'+
		'				<div style="margin-top:10px"><span style="font-size:20;color:#ffffff;font-weight:400;">'+arr[i].TESTINFOR_ruxueshijian+'</span></div>'+
		'				<div style="margin-top:10px"><span style="font-size:20;color:#ffffff;font-weight:400;">'+arr[i].TESTINFOR_biyeshijian+'</span></div>'+
		'            </div>'+
		'        </div>'+
		'    </div>'+
		'</div>');
animationHover(cellObj, 'pulse');
$('#Card444').append(cellObj);
}
}
</script>
</body>
</html>
