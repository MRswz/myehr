<%@ page language="java" import="java.util.*" import="com.myehr.common.util.LangUtil" pageEncoding="UTF-8"%>
<%@ include file="/common/commontest.jsp" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<body>
<div class="container-fluid" style="height:100%;overflow-y:auto;padding-top:5px;">
<table id="comp_COM_LIST_List">
</table>
<div id="activity_pane" style="position:absolute;left:500px;top:70px"></div>
<div id="comp_tye_zhutu_chart" style="width:100%;height:400px;"></div><script>
var heightGadedata_4402 =[];
var containerParam_4402 ={};
containerParam_4402 ={};
function changeHeightGadedata_4402(data){
	heightGadedata_4402 = data;
}
$(function() {
$(".fixed-table-toolbar").css("margin-top","0px");
$(".fixed-table-body").css("height","76%");
queryAllData_4431();
$(".bootstrap-table").css("display","none");

cardSelectInitFunctionx_grid('${param.formType}');
cardDateWidInitFunction();
});
	var _formId_4402='4402';
var realFormId='${param.formId}';
var showButtonNum = 0;

/** 刷新页面 */ 
function refresh_comp_COM_LIST() { 
    $('#comp_COM_LIST_List').bootstrapTable('refresh'); 
}

/** 隐藏边框 */ 
function hiddenBorder(type) { 
    if(type == 0){
        $("#comp_COM_LIST_List td").css("border","none");
    }else if(type == 1){
        $("#comp_COM_LIST_List td").css("border-left","none");
    }else if(type == 2){
        $("#comp_COM_LIST_List td").css("border-top","none");
    }
}
function initCharts_4431(xAxisData,seriesData){
   document.getElementById('comp_tye_zhutu_chart').style.width='940px';
   document.getElementById('comp_tye_zhutu_chart').style.height='385px';
	var myChart = echarts.init(document.getElementById('comp_tye_zhutu_chart'));
	var options={
		//定义柱状图颜色
		color: [
                    '#ff7e50', '#97d3f9', '#dd70d9', '#34cf34',
                    '#6497ef', '#85802b', '#D7504B', '#C6E579',
                    '#F4E001', '#F0805A', '#26C0C0'
                ],
		tooltip : {
			trigger: 'axis',
			axisPointer : {            // 坐标轴指示器，坐标轴触发有效
				type : 'shadow'        // 默认为直线，可选为：'line' | 'shadow'
			}
		},
		toolbox: {
			show: true,
			feature: {
				dataView: {readOnly: false},
				magicType: {type: ['line', 'bar']},
				restore: {},
				saveAsImage: {}
			}
		},
		//定义一个标题
       title:{
           text:'机构分布'
       },
        legend:{
            data:['机构人数',]
        },
        //X轴设置
        xAxis:{
            data:xAxisData
        },
        yAxis: [
			{
				type : 'value'
			}
		],
        series:seriesData
    };
    myChart.setOption(options);
}
function queryAllData_4431(){
	var url='${pageContext.request.contextPath }/form/cardformInitData.action?queryType=all';
	var pageReqeust = {};
	var paramData = grid_comp_COM_LIST_fun(pageReqeust);
	$.ajax({
		url:url,
		type:'post',
		data: paramData,
		cache: false,
		contentType: 'application/json;charset=utf-8',
		success: function (text) {
			initArrData_4431(text.rows);
		},
	});
}
function initArrData_4431(datas){
	var xAxisData=[];
	var seriesData=[];
	var seriesData1=[];
	var seriesData2=[];
	var xAxisColumn = 'EMPVCOMPIDTYPE_COMPID';
	var formDefSql = 'SELECT  EMP_V_COMPIDTYPE.EMPID AS EMPVCOMPIDTYPE_EMPID,EMP_V_COMPIDTYPE.COMPID AS EMPVCOMPIDTYPE_COMPID,EMP_V_COMPIDTYPE.GENDER AS EMPVCOMPIDTYPE_GENDER   FROM   EMP_V_COMPIDTYPE';
	var url='${pageContext.request.contextPath }/charts/searchChartsType.action?xColumnId=84873&xAxisColumn='+xAxisColumn+'&formDefSql='+formDefSql;
	$.ajax({
		url:url,
		type:'post',
		cache: false,
		contentType: 'application/json;charset=utf-8',
		success: function (text) {
			for(var i=0;i<text.length;i++){
				xAxisData.push(text[i].dictName);
				var flag1=0;
				var flag2=0;
				for(var j=0;j<datas.length;j++){
					if(text[i].EMPVCOMPIDTYPE_COMPID==datas[j].EMPVCOMPIDTYPE_COMPID&&datas[j].EMPVCOMPIDTYPE_GENDER==1){
						flag1++;
					}else if(text[i].EMPVCOMPIDTYPE_COMPID==datas[j].EMPVCOMPIDTYPE_COMPID&&datas[j].EMPVCOMPIDTYPE_GENDER==2){
						flag2++;
					}
				}
				seriesData1.push(flag1);
				seriesData2.push(flag2);
			}
			var obj1 = {name: '男',type: 'bar', stack: '性别',data: seriesData1};
			var obj2 = {name: '女',type: 'bar', stack: '性别',data: seriesData2};
			//[{
			//	name: '机构人数',
			//	type: 'bar',
			//	data: seriesData
			//}]
			seriesData.push(obj1);
			seriesData.push(obj2);
			initCharts_4431(xAxisData,seriesData)
		},
	});
}
    //showMoreBtn($(".BTNGROUP_4402"));
var filterParam = {};
var queryParams;
function grid_comp_COM_LIST_fun(pageReqeust){
	var _filterdata={};
	if(document.getElementById('grid_comp_COM_LIST_filter')){
	}
	var paramsMap = {};
	var requestParam={};
		requestParam = {};
	pageReqeust.containerParam=containerParam_4402;
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.userIds=getQueryString('empIds');
	pageReqeust.formId=_formId_4402;
	pageReqeust.isView=null;
	if(heightGadedata_4402!=null&&heightGadedata_4402!=undefined){
		pageReqeust.heightGrade = heightGadedata_4402;
	}
	queryParams = JSON.stringify(pageReqeust);
	return queryParams;
}
function grid_comp_COM_LIST_fun11_4402(){
	$('#comp_COM_LIST_List').bootstrapTable('refresh');
}
	function grid_comp_COM_LIST_HeighQuery_4402() {
		layer.open({
			type: 2,
			showMaxButton: true,
			title:"<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"高级查询设置")%>" ,
			area: ['855', '500'],
			maxmin: true,
			content:'/myehr/jsp/form/button/heightGrade.jsp?formFunction=grid_comp_COM_LIST_fun11_4402&formDefId=4402&formDefLayout=2',
			success:function(layero,index){
				},
				end:function(){
			}
			});
	}
</script>
</body>
</html>
