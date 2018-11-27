<%@ page language="java" import="java.util.*" import="com.myehr.common.util.LangUtil" pageEncoding="UTF-8"%>
<%@ include file="/common/commontest.jsp" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<body>
<div class="container-fluid" style="height:100%;overflow-y:auto;padding-top:5px;">
<table id="EMP_V_EMPPAYMON_list_List">
</table>
<div id="activity_pane" style="position:absolute;left:500px;top:70px"></div>
<div id="EMP_V_EMPPAYMON_tu_chart" style="width:100%;height:400px;"></div><script>
var heightGadedata_4408 =[];
var containerParam_4408 ={};
containerParam_4408 ={};
function changeHeightGadedata_4408(data){
	heightGadedata_4408 = data;
}
$(function() {
    querys_4408();
$(".fixed-table-toolbar").css("margin-top","0px");
$(".fixed-table-body").css("height","76%");
    queryAllData_4409();
    $(".bootstrap-table").css("display","none");

    cardSelectInitFunctionx_grid('${param.formType}');
    cardDateWidInitFunction();
});
	var _formId_4408='4408';
var realFormId='${param.formId}';
var showButtonNum = 0;
function initRoleButtons(buttonFormId,buttonFormCode){
    var date = new Date();
    var url = '${pageContext.request.contextPath }/form/queryCardFormButtonsWithUserId.action?formId='+buttonFormId+'&'+date;
    $.ajax({
        url:url,
        type:'post',
        cache: false,
        async: false,
        contentType:'application/json',
        success:function(datas){
            if(datas.length==0){
                showMoreBtn($(".BTNGROUP_"+buttonFormId+""));
            }else{
                for(var i=0;i<datas.length;i++){
                    if(datas[i].powerType==4){
                        var obj = $("#"+datas[i].formButtonCode+buttonFormCode+"");
                        obj[0].parentNode.style.display="none";
                    }else if(datas[i].powerType==3){
                        var obj = $("#"+datas[i].formButtonCode+buttonFormCode+"");
                        obj[0].parentNode.style.display="none";
                    }else if(datas[i].powerType==2){
                        var obj = $("#"+datas[i].formButtonCode+buttonFormCode+"");
                        obj[0].disabled=true;
                        showButtonNum++;
                    }else if(datas[i].powerType==0){
                        var obj = $("#"+datas[i].formButtonCode+buttonFormCode+"");
                        obj[0].parentNode.style.display="none";
                    }else{
                        showButtonNum++;
                    }
                }
                showMoreBtn1($(".BTNGROUP_"+buttonFormId+""),showButtonNum);
            }
        }
    });
}
    function querys_4408() {
        initRoleColumn('4408');
        initRoleButtons('4408','EMP_V_EMPPAYMON_list');
        $("#EMP_V_EMPPAYMON_list_List").bootstrapTable({
            url :'${pageContext.request.contextPath }/form/cardformInitData.action',
            contentType: 'application/json;charset=utf-8',
            dataType:'json',
            method:'post',
            height : 500,
            undefinedText : '-',
            pagination : true,
            striped : true,
            fixedColumns: false,
            fixedNumber:0,
            showHeader : true,
            queryParams : grid_EMP_V_EMPPAYMON_list_fun,
            cache : false,
            pageSize : 10, 
            pageList : [10,20,50,100], 
            toolbar : "#toolbar",
            showColumns : true,
            showExport : true,
            clickToSelect: true,
            showRefresh : true,
            sidePagination : "server",
            columns : [
            {
                field : 'state',
                checkbox : true,
                align : 'center',
                visible : true,
                valign : 'middle'
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"序号")%>',
                field : 'defaultXH',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value=index+1;
                    }
                    return "<a style=\"font-size:12px;text-decoration:none;color:black;width:50px;\" name=\"defaultXH\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"序号\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"年月")%>',
                field : 'EMPVEMPPAYMON_MON',
                align : 'center',
                visible : columnvisible.EMPVEMPPAYMON_MON,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPPAYMON_MON\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"年月\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"基本工资(万元)")%>',
                field : 'EMPVEMPPAYMON_CC',
                align : 'center',
                visible : columnvisible.EMPVEMPPAYMON_CC,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPPAYMON_CC\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"基本工资(万元)\">"+value+"</a>";
                }
            },
            ],
            onClickRow: function (row, $element) {
                curRow = row;
            },
		onPostBody: function (res) {
		    hiddenBorder();
		},
		onLoadSuccess: function (aa, bb, cc) {
                $("#EMP_V_EMPPAYMON_list_List a").editable({
                    disabled: true,
                    emptytext: "-",
                    url: function (params) {
                        var sName = $(this).attr("name");
                        curRow[sName] = params.value;
                    },
                    type: 'text'
                });
            },
		onDblClickCell: function (field, value,row,td) {
        	editEMP_V_EMPPAYMON_list_click_4408('isView',row);  
         } ,
            responseHandler : function(res) {  
                                return {  
                    total : res.total,  
                    rows : res.rows  
                };
            }
        });
        window.operateEvents = {  
    };
}
/** 刷新页面 */ 
function refresh_EMP_V_EMPPAYMON_list() { 
    $('#EMP_V_EMPPAYMON_list_List').bootstrapTable('refresh'); 
}

/** 隐藏边框 */ 
function hiddenBorder(type) { 
    if(type == 0){
        $("#EMP_V_EMPPAYMON_list_List td").css("border","none");
    }else if(type == 1){
        $("#EMP_V_EMPPAYMON_list_List td").css("border-left","none");
    }else if(type == 2){
        $("#EMP_V_EMPPAYMON_list_List td").css("border-top","none");
    }
}
function initCharts_4409(xAxisData,seriesData){
   document.getElementById('EMP_V_EMPPAYMON_tu_chart').style.width='400px';
   document.getElementById('EMP_V_EMPPAYMON_tu_chart').style.height='300px';
	var myChart = echarts.init(document.getElementById('EMP_V_EMPPAYMON_tu_chart'));
	var options={
		//定义柱状图颜色
		color: ['#ff0080'],
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
           text:'基本工资柱图'
       },
        legend:{
            data:['基本工资(万元)']
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
        series:[{
    name: '基本工资(万元)',
    type: 'bar',
	barMaxWidth:50,
    data:[468.470000,470.560000]
}]
    };
    myChart.setOption(options);
}
function queryAllData_4409(){
	var url='${pageContext.request.contextPath }/form/cardformInitData.action?queryType=all';
	var pageReqeust = {};
	var paramData = grid_EMP_V_EMPPAYMON_list_fun(pageReqeust);
	$.ajax({
		url:url,
		type:'post',
		data: paramData,
		cache: false,
		contentType: 'application/json;charset=utf-8',
		success: function (text) {
			initArrData_4409(text.rows);
		},
	});
}
function initArrData_4409(datas){
	var xAxisData=[];
	var seriesData=[];
	var xAxisColumn = 'EMPVEMPPAYMON_MON';
	var formDefSql = 'SELECT  EMP_V_EMPPAYMON.MON AS EMPVEMPPAYMON_MON,EMP_V_EMPPAYMON.CC AS EMPVEMPPAYMON_CC   FROM   EMP_V_EMPPAYMON';
	var url='${pageContext.request.contextPath }/charts/searchChartsType.action?xColumnId=84634&xAxisColumn='+xAxisColumn+'&formDefSql='+formDefSql;
	$.ajax({
		url:url,
		type:'post',
		cache: false,
		contentType: 'application/json;charset=utf-8',
		success: function (text) {
			for(var i=0;i<text.length;i++){
				xAxisData.push(text[i].dictName);
				var flag=0;
				for(var j=0;j<datas.length;j++){
					if(text[i].EMPVEMPPAYMON_MON==datas[j].EMPVEMPPAYMON_MON){
						flag++;
					}
				}
				seriesData.push(flag);
			}
			initCharts_4409(xAxisData,seriesData)
		},
	});
}
    //showMoreBtn($(".BTNGROUP_4408"));
var filterParam = {};
var queryParams;
function grid_EMP_V_EMPPAYMON_list_fun(pageReqeust){
	var _filterdata={};
	if(document.getElementById('grid_EMP_V_EMPPAYMON_list_filter')){
	}
	var paramsMap = {};
	var requestParam={};
		requestParam = {};
	pageReqeust.containerParam=containerParam_4408;
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.userIds=getQueryString('empIds');
	pageReqeust.formId=_formId_4408;
	pageReqeust.isView=null;
	if(heightGadedata_4408!=null&&heightGadedata_4408!=undefined){
		pageReqeust.heightGrade = heightGadedata_4408;
	}
	queryParams = JSON.stringify(pageReqeust);
	return queryParams;
}
function grid_EMP_V_EMPPAYMON_list_fun11_4408(){
	$('#EMP_V_EMPPAYMON_list_List').bootstrapTable('refresh');
}
	function grid_EMP_V_EMPPAYMON_list_HeighQuery_4408() {
		layer.open({
			type: 2,
			showMaxButton: true,
			title:"<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"高级查询设置")%>" ,
			area: ['855', '500'],
			maxmin: true,
			content:'/myehr/jsp/form/button/heightGrade.jsp?formFunction=grid_EMP_V_EMPPAYMON_list_fun11_4408&formDefId=4408&formDefLayout=2',
			success:function(layero,index){
				},
				end:function(){
			}
			});
	}
</script>
</body>
</html>
