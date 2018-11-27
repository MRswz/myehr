<%@ page language="java" import="java.util.*" import="com.myehr.common.util.LangUtil" pageEncoding="UTF-8"%>
<%@ include file="/common/commontest.jsp" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<body>
<div class="container-fluid" style="height:100%;overflow-y:auto;padding-top:5px;">
<table id="comp_COM_LIST_List">
</table>
<div id="activity_pane" style="position:absolute;left:500px;top:70px"></div>
<div id="comp_tye_tu_chart" style="width:100%;height:400px;"></div><script>
var heightGadedata_4402 =[];
var containerParam_4402 ={};
containerParam_4402 ={};
function changeHeightGadedata_4402(data){
	heightGadedata_4402 = data;
}
$(function() {
    querys_4402();
$(".fixed-table-toolbar").css("margin-top","0px");
$(".fixed-table-body").css("height","76%");
    queryAllData_4419();
    $(".bootstrap-table").css("display","none");

    cardSelectInitFunctionx_grid('${param.formType}');
    cardDateWidInitFunction();
});
	var _formId_4402='4402';
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
                        obj.parent().remove();
                    }else if(datas[i].powerType==3){
                        var obj = $("#"+datas[i].formButtonCode+buttonFormCode+"");
                        obj.parent().remove();
                    }else if(datas[i].powerType==2){
                        var obj = $("#"+datas[i].formButtonCode+buttonFormCode+"");
                        obj[0].disabled=true;
                        showButtonNum++;
                    }else if(datas[i].powerType==0){
                        var obj = $("#"+datas[i].formButtonCode+buttonFormCode+"");
                      obj.parent().remove();
                    }else{
                        showButtonNum++;
                    }
                }
                showMoreBtn1($(".BTNGROUP_"+buttonFormId+""),showButtonNum);
            }
        }
    });
}
    function querys_4402() {
        initRoleColumn('4402');
        initRoleButtons('4402','comp_COM_LIST');
        $("#comp_COM_LIST_List").bootstrapTable({
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
            queryParams : grid_comp_COM_LIST_fun,
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
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"员工ID")%>',
                field : 'EMPVCOMPIDTYPE_EMPID',
                align : 'center',
                visible : columnvisible.EMPVCOMPIDTYPE_EMPID,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVCOMPIDTYPE_EMPID\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"员工ID\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"机构人数")%>',
                field : 'EMPVCOMPIDTYPE_COMPID',
                align : 'center',
                visible : columnvisible.EMPVCOMPIDTYPE_COMPID,
                valign : 'left',
                formatter: function (value, row, index) {
                    var value1 = '';
					  if((value!=undefined&&value!=""&&value!=null&&dictDatas_comp_COM_LIST_84873!=undefined&&dictDatas_comp_COM_LIST_84873!=null)||value==0){
							value1 = dictDatas_comp_COM_LIST_84873[value];
					  }
                    if((value1==undefined || value1=="")&&value1!=0){
                        value1='-';
                    }
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVCOMPIDTYPE_COMPID\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\""+value+"\" >"+value1+"</a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"性别")%>',
                field : 'EMPVCOMPIDTYPE_GENDER',
                align : 'center',
                visible : columnvisible.EMPVCOMPIDTYPE_GENDER,
                valign : 'left',
                formatter: function (value, row, index) {
                    var value1 = '';
					  if((value!=undefined&&value!=""&&value!=null&&dictDatas_comp_COM_LIST_84874!=undefined&&dictDatas_comp_COM_LIST_84874!=null)||value==0){
							value1 = dictDatas_comp_COM_LIST_84874[value];
					  }
                    if((value1==undefined || value1=="")&&value1!=0){
                        value1='-';
                    }
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVCOMPIDTYPE_GENDER\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\""+value+"\" >"+value1+"</a>";
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
                $("#comp_COM_LIST_List a").editable({
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
        	editcomp_COM_LIST_click_4402('isView',row);  
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
function initCharts_4419(xAxisData,seriesData){
	var x = '50%';//页面左右
	var y = '50%';//页面上下
	var size = '50%';//图形大小
	var titleType = 'vertical';
	var titlePosition = 'left';
	var myChart = echarts.init(document.getElementById('comp_tye_tu_chart'));
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
           text:'机构分布比列',
			x: 'center'
       },
       legend:{
           orient: titleType,
           left: titlePosition,
           data:xAxisData
       },
       series:[
           {
               name:'机构',
               type:'pie',
               radius : size,
               center: [x,y],
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
function queryAllData_4419(){
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
			initArrData_4419(text.rows);
		},
	});
}
function initArrData_4419(datas){
	var xAxisData=[];
	var seriesData=[];
	var xAxisColumn = 'EMPVCOMPIDTYPE_COMPID';
	var formDefSql = 'SELECT  EMP_V_COMPIDTYPE.EMPID AS EMPVCOMPIDTYPE_EMPID,EMP_V_COMPIDTYPE.COMPID AS EMPVCOMPIDTYPE_COMPID,EMP_V_COMPIDTYPE.GENDER AS EMPVCOMPIDTYPE_GENDER   FROM   EMP_V_COMPIDTYPE';
	var url='${pageContext.request.contextPath }/charts/searchChartsType.action?xColumnId=84649&xAxisColumn='+xAxisColumn+'&formDefSql='+formDefSql;
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
					if(text[i].EMPVCOMPIDTYPE_COMPID==datas[j].EMPVCOMPIDTYPE_COMPID){
						flag++;
					}
				}
				var obj={};
				obj.value = flag ;
				obj.name=text[i].dictName;
				seriesData.push(obj);
			}
			initCharts_4419(xAxisData,seriesData)
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
