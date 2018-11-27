<%@ page language="java" import="java.util.*" import="com.myehr.common.util.LangUtil" pageEncoding="UTF-8"%>
<%@ include file="/common/common.jsp" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<body>
<div class="container-fluid" style="height:100%;overflow-y:hidden;padding-top:5px;">
		<div class="BTNGROUP BTNGROUP_91" style="margin:5px auto; display:inline-block;height: 30px;z-index: 6;position: relative">
			<div style="margin-right:10px;display:inline-block">
			    <input type="button" id="EMP_CHOSE_LIST"  class="btn btn-success" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"选择")%> onclick="EMP_CHOSE_LIST_click_91()"/>
			</div>
		</div>
<table id="EMP_CHOSE_LIST_List">
</table>
<div id="activity_pane" style="position:absolute;left:500px;top:70px"></div>
</div>
<div id="test_echarts_pie_chart" style="width:100%;height:400px;"></div>
<script>
var heightGadedata_91 =[];
var containerParam_91 ={};
containerParam_91 ={};
function changeHeightGadedata_91(data){
	heightGadedata_91 = data;
}

$(function() {
    querys_91();
    queryAllData_2845();
    $("#EMP_CHOSE_LIST_List").css("display","none");

});
	var _formId_91='91';
    function querys_91() {
        $("#EMP_CHOSE_LIST_List").bootstrapTable({
            url :'${pageContext.request.contextPath }/form/cardformInitData.action',
            contentType: 'application/json;charset=utf-8',
            dataType:'json',
            method:'post',
            height : 500,
            undefinedText : '-',
            pagination : true,
            striped : true,
            fixedColumns: false,
            fixedNumber:4,
            queryParams : grid_EMP_CHOSE_LIST_fun,
            cache : false,
            pageSize : 10, 
            pageList : [10,20,50,10000], 
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
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"部门编码")%>',
                field : 'ORGDEPARTMENT_depcode',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"ORGDEPARTMENT_depcode\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"部门编码\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"姓名")%>',
                field : 'EMPEMPLOYEE_CNAME',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEE_CNAME\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"姓名\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"员工状态")%>',
                field : 'EMPEMPLOYEE_EMPSTATUS',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEE_EMPSTATUS\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"员工状态\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"工号")%>',
                field : 'EMPEMPLOYEE_EMPCODE',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEE_EMPCODE\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"工号\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"员工ID")%>',
                field : 'EMPEMPLOYEE_EMPID',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEE_EMPID\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"员工ID\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"性别")%>',
                field : 'EMPEMPLOYEE_GENDER',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEE_GENDER\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"性别\" data-source=\"${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode1.action?deleteMark=emp_SEX&realValue="+value+"+\"></a>";
                }
            },

            ],
            onClickRow: function (row, $element) {
                curRow = row;
            },
		onLoadSuccess: function (aa, bb, cc) {
                $("#EMP_CHOSE_LIST_List a").editable({
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
        	editEMP_CHOSE_LIST_click_91('isView',row);  
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
function refresh_EMP_CHOSE_LIST() { 
    $('#EMP_CHOSE_LIST_List').bootstrapTable('refresh'); 
}
function initCharts_2845(xAxisData,seriesData){
   document.getElementById('test_echarts_pie_chart').style.width='1000px';
   document.getElementById('test_echarts_pie_chart').style.height='400px';
	var myChart = echarts.init(document.getElementById('test_echarts_pie_chart'));
	var options={
		tooltip : {
			trigger: 'item',
			formatter : "{a} <br/>{b}: {c} ({d}%)"
		},
		toolbox: {
			show: true,
			feature: {
				dataView: {readOnly: false},
				restore: {},
				saveAsImage: {}
			}
		},
		//定义一个标题
       title:{
           text:'人员选择列表'
       },
       legend:{
           data:xAxisData
       },
       series:[
           {
               name:'性别',
               type:'pie',
               radius:['30%', '80%'],
               avoidLabelOverlap: false,
               label: {
                   normal: {
                       show: false,
                       position: 'center'
                   },
                   emphasis: {
                       show: true,
                       textStyle: {
                           fontSize: '30',
                           fontWeight: 'bold'
                       }
                   }
               },
               labelLine: {
                   normal: {
                       show: false
                   }
               },
               data:seriesData
           }
       ]
    };
    myChart.setOption(options);
}
function queryAllData_2845(){
document.getElementById("EMP_CHOSE_LIST_List").parentNode.parentNode.parentNode.parentNode.style.display="none";
	var url='${pageContext.request.contextPath }/form/cardformInitData.action?queryType=all';
	$.ajax({
		url:url,
		type:'post',
		data: queryParams,
		cache: false,
		contentType: 'application/json;charset=utf-8',
		success: function (text) {
			initArrData_2845(text.rows);
		},
	});
}
function initArrData_2845(datas){
	var xAxisData=[];
	var seriesData=[];
	var xAxisColumn = 'EMPEMPLOYEE_GENDER';
	var formDefSql = 'select ORG_DEPARTMENT.depcode AS ORGDEPARTMENT_depcode,EMP_EMPLOYEE.EMPSTATUS AS EMPEMPLOYEE_EMPSTATUS, EMP_EMPLOYEE.CNAME AS EMPEMPLOYEE_CNAME,EMP_EMPLOYEE.EMPCODE AS EMPEMPLOYEE_EMPCODE,EMP_EMPLOYEE.EMPID AS EMPEMPLOYEE_EMPID, EMP_EMPLOYEE.GENDER AS EMPEMPLOYEE_GENDER  from  EMP_EMPLOYEE  join ORG_DEPARTMENT    on EMP_EMPLOYEE.DEPID =ORG_DEPARTMENT.depid';
	var url='${pageContext.request.contextPath }/charts/searchChartsType.action?xColumnId=41017&xAxisColumn='+xAxisColumn+'&formDefSql='+formDefSql;
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
					if(text[i].EMPEMPLOYEE_GENDER==datas[j].EMPEMPLOYEE_GENDER){
						flag++;
					}
				}
				var obj={};
				obj.value = flag ;
				obj.name=text[i].dictName;
				seriesData.push(obj);
			}
			initCharts_2845(xAxisData,seriesData)
		},
	});
}
    showMoreBtn($(".BTNGROUP_91"));
var filterParam = {};
var queryParams;
function grid_EMP_CHOSE_LIST_fun(pageReqeust){
	var _filterdata={};
	if(document.getElementById('grid_EMP_CHOSE_LIST_filter')){
	}
	var paramsMap = {};
	var requestParam={};
		requestParam = {};
	pageReqeust.containerParam=containerParam_91;
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.userIds='${param.empIds}';
	pageReqeust.formId=_formId_91;
	pageReqeust.isView=null;
	if(heightGadedata_91!=null&&heightGadedata_91!=undefined){
		pageReqeust.heightGrade = heightGadedata_91;
	}
	queryParams = JSON.stringify(pageReqeust);
	return queryParams;
}
function grid_EMP_CHOSE_LIST_fun11_91(){
	$('#EMP_CHOSE_LIST_List').bootstrapTable('refresh');
	queryAllData();
}
	function grid_EMP_CHOSE_LIST_HeighQuery_91() {
		layer.open({
			type: 2,
			showMaxButton: true,
			title:"<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"高级查询设置")%>" ,
			area: ['855', '500'],
			maxmin: true,
			content:'/myehr/jsp/form/button/heightGrade.jsp?formFunction=grid_EMP_CHOSE_LIST_fun11_91&formDefId=91&formDefLayout=2',
			success:function(layero,index){
				},
				end:function(){
			}
			});
	}
</script>
</body>
</html>
