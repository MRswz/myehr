<%@ page language="java" import="com.myehr.common.util.LangUtil" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/common/commontest.jsp" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<body>
<form id="form_4524" name="form_4524"  style="height:100%;">
<div class="container-fluid" style="height:50%;overflow:auto;padding-top:5px">
	<div id="form_4522" style="margin-top:0px;">
  {
                title : '主键',
                field : 'LCANNUITY_ID',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;color:black;width:200px;\" name=\"LCANNUITY_ID\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"主键\">"+value+"</a>";
                }
            },
  {
                title : '申请人',
                field : 'LCANNUITY_EMPNAME',
                align : 'center',
                visible : columnvisible.LCANNUITY_empname,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;color:black;width:200px;\" name=\"LCANNUITY_EMPNAME\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"申请人\">"+value+"</a>";
                }
            },
            {
                title : '申请日期',
                field : 'LCANNUITY_APLICADATE',
                align : 'center',
                visible : columnvisible.LCANNUITY_aplicadate,
                valign : 'left',
                formatter: function (value, row, index) {
                    var date = "-";
                    if(value!=null){
                    var val = value+"";
                    	if((("yyyy-MM-dd"=="hh:mm")&&val.indexOf(":")>1)||("yyyy-MM-dd"=="yyyyMM")){
                    		date = value ;
                    	}else{
                        date = new Date(value).Format("yyyy-MM-dd");
                    	}
                    }
        return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px\" name=\"LCANNUITY_APLICADATE\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"申请日期\">"+date+"</a>";
                }
            },
  {
                title : '计划名称',
                field : 'LCANNUITY_TITLE',
                align : 'center',
                visible : columnvisible.LCANNUITY_TITLE,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:600px;\" name=\"LCANNUITY_TITLE\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"计划名称\">"+value+"</a>";
                }
            },
  {
                title : '申请人ID',
                field : 'LCANNUITY_EMPID',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;color:black;width:200px;\" name=\"LCANNUITY_EMPID\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"申请人ID\">"+value+"</a>";
                }
            },
            {
                title : '单位',
                field : 'LCANNUITY_COMPID',
                visible :false,
            },{
                title : '单位',
                field : 'LCANNUITY_COMPID_DICTNAME',
                align : 'center',
                visible : false,
                valign : 'left',
				  sortable: true,
                formatter: function (value, row, index) {
						if(value==undefined||value=='null'||value==''){
        					value='-';
    					}
                    	return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"LCANNUITY_COMPID\" title=\""+value+"\">"+value+"</a>";
                }
            },

            {
                title : '部门',
                field : 'LCANNUITY_DEPID',
                visible :false,
            },{
                title : '部门',
                field : 'LCANNUITY_DEPID_DICTNAME',
                align : 'center',
                visible : false,
                valign : 'left',
				  sortable: true,
                formatter: function (value, row, index) {
						if(value==undefined||value=='null'||value==''){
        					value='-';
    					}
                    	return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"LCANNUITY_DEPID\" title=\""+value+"\">"+value+"</a>";
                }
            },

            {
                title : '岗位',
                field : 'LCANNUITY_JOBID',
                visible :false,
            },{
                title : '岗位',
                field : 'LCANNUITY_JOBID_DICTNAME',
                align : 'center',
                visible : false,
                valign : 'left',
				  sortable: true,
                formatter: function (value, row, index) {
						if(value==undefined||value=='null'||value==''){
        					value='-';
    					}
                    	return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"LCANNUITY_JOBID\" title=\""+value+"\">"+value+"</a>";
                }
            },

            {
                title : '开始年月',
                field : 'LCANNUITY_BEGINMON',
                align : 'center',
                visible : columnvisible.LCANNUITY_BEGINMON,
                valign : 'left',
                formatter: function (value, row, index) {
                    var date = "-";
                    if(value!=null){
                    var val = value+"";
                    	if((("yyyyMM"=="hh:mm")&&val.indexOf(":")>1)||("yyyyMM"=="yyyyMM")){
                    		date = value ;
                    	}else{
                        date = new Date(value).Format("yyyyMM");
                    	}
                    }
        return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px\" name=\"LCANNUITY_BEGINMON\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"开始年月\">"+date+"</a>";
                }
            },
            {
                title : '结束年月',
                field : 'LCANNUITY_ENDMON',
                align : 'center',
                visible : columnvisible.LCANNUITY_ENDMON,
                valign : 'left',
                formatter: function (value, row, index) {
                    var date = "-";
                    if(value!=null){
                    var val = value+"";
                    	if((("yyyyMM"=="hh:mm")&&val.indexOf(":")>1)||("yyyyMM"=="yyyyMM")){
                    		date = value ;
                    	}else{
                        date = new Date(value).Format("yyyyMM");
                    	}
                    }
        return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px\" name=\"LCANNUITY_ENDMON\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"结束年月\">"+date+"</a>";
                }
            },
  {
                title : '其他说明',
                field : 'LCANNUITY_POSCAUSE',
                align : 'center',
                visible : columnvisible.LCANNUITY_POSCAUSE,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:600px;\" name=\"LCANNUITY_POSCAUSE\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"其他说明\">"+value+"</a>";
                }
            },
  {
                title : '审批状态',
                field : 'LCANNUITY_FLAG',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"LCANNUITY_FLAG\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"审批状态\">"+value+"</a>";
                }
            },
  {
                title : '流程单据号',
                field : 'LCANNUITY_BUSINESSID_IS',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"LCANNUITY_BUSINESSID_IS\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"流程单据号\">"+value+"</a>";
                }
            },
		var value = 'null';
var id = 'LC_ANNUITY.LCANNUITY_ID_4522';
if($("[id='LC_ANNUITY.LCANNUITY_ID_4522']").attr("styleType")=="dateTime"){
		if(value.indexOf(":") > -1){
			if(value.indexOf("-") > -1){
			 	document.getElementById("LC_ANNUITY.LCANNUITY_ID_4522").value=formatDatebox(value,id);
			}else{
				document.getElementById("LC_ANNUITY.LCANNUITY_ID_4522").value=value;
			}
		}else{
			if(value==null || value==""|| value=="null"){
				document.getElementById("LC_ANNUITY.LCANNUITY_ID_4522").value=value;
			}else{
			    var date = new Date(parseInt(value)).Format("yyyy-MM-dd hh:mm:ss");
				document.getElementById("LC_ANNUITY.LCANNUITY_ID_4522").value = formatDatebox(date,id);
			}
		}
}else if($("[id='LC_ANNUITY.LCANNUITY_ID_4522']").attr("styleType2")=="search"){
		$("[id='LC_ANNUITY.LCANNUITY_ID_4522']").selectpicker('val', value);
}else{
    if($("[id='LC_ANNUITY.LCANNUITY_ID_4522']").attr("styleType")=="inputSelect"){
        var dataField = $("[id='LC_ANNUITY.LCANNUITY_ID_4522']").attr("dataField1");
        var DictName = $("[id='LC_ANNUITY.LCANNUITY_ID_4522']").attr("DictName");
        selectSqlDictEntryByValue("LC_ANNUITY.LCANNUITY_ID_4522",value,dataField,DictName);
    }else{
		   document.getElementById("LC_ANNUITY.LCANNUITY_ID_4522").value=value;
    }
}
;
		var value = '系统管理员';
var id = 'LC_ANNUITY.LCANNUITY_EMPNAME_4522';
if($("[id='LC_ANNUITY.LCANNUITY_EMPNAME_4522']").attr("styleType")=="dateTime"){
		if(value.indexOf(":") > -1){
			if(value.indexOf("-") > -1){
			 	document.getElementById("LC_ANNUITY.LCANNUITY_EMPNAME_4522").value=formatDatebox(value,id);
			}else{
				document.getElementById("LC_ANNUITY.LCANNUITY_EMPNAME_4522").value=value;
			}
		}else{
			if(value==null || value==""|| value=="null"){
				document.getElementById("LC_ANNUITY.LCANNUITY_EMPNAME_4522").value=value;
			}else{
			    var date = new Date(parseInt(value)).Format("yyyy-MM-dd hh:mm:ss");
				document.getElementById("LC_ANNUITY.LCANNUITY_EMPNAME_4522").value = formatDatebox(date,id);
			}
		}
}else if($("[id='LC_ANNUITY.LCANNUITY_EMPNAME_4522']").attr("styleType2")=="search"){
		$("[id='LC_ANNUITY.LCANNUITY_EMPNAME_4522']").selectpicker('val', value);
}else{
    if($("[id='LC_ANNUITY.LCANNUITY_EMPNAME_4522']").attr("styleType")=="inputSelect"){
        var dataField = $("[id='LC_ANNUITY.LCANNUITY_EMPNAME_4522']").attr("dataField1");
        var DictName = $("[id='LC_ANNUITY.LCANNUITY_EMPNAME_4522']").attr("DictName");
        selectSqlDictEntryByValue("LC_ANNUITY.LCANNUITY_EMPNAME_4522",value,dataField,DictName);
    }else{
		   document.getElementById("LC_ANNUITY.LCANNUITY_EMPNAME_4522").value=value;
    }
}
;
		var value = '700';
var id = 'LC_ANNUITY.LCANNUITY_EMPID_4522';
if($("[id='LC_ANNUITY.LCANNUITY_EMPID_4522']").attr("styleType")=="dateTime"){
		if(value.indexOf(":") > -1){
			if(value.indexOf("-") > -1){
			 	document.getElementById("LC_ANNUITY.LCANNUITY_EMPID_4522").value=formatDatebox(value,id);
			}else{
				document.getElementById("LC_ANNUITY.LCANNUITY_EMPID_4522").value=value;
			}
		}else{
			if(value==null || value==""|| value=="null"){
				document.getElementById("LC_ANNUITY.LCANNUITY_EMPID_4522").value=value;
			}else{
			    var date = new Date(parseInt(value)).Format("yyyy-MM-dd hh:mm:ss");
				document.getElementById("LC_ANNUITY.LCANNUITY_EMPID_4522").value = formatDatebox(date,id);
			}
		}
}else if($("[id='LC_ANNUITY.LCANNUITY_EMPID_4522']").attr("styleType2")=="search"){
		$("[id='LC_ANNUITY.LCANNUITY_EMPID_4522']").selectpicker('val', value);
}else{
    if($("[id='LC_ANNUITY.LCANNUITY_EMPID_4522']").attr("styleType")=="inputSelect"){
        var dataField = $("[id='LC_ANNUITY.LCANNUITY_EMPID_4522']").attr("dataField1");
        var DictName = $("[id='LC_ANNUITY.LCANNUITY_EMPID_4522']").attr("DictName");
        selectSqlDictEntryByValue("LC_ANNUITY.LCANNUITY_EMPID_4522",value,dataField,DictName);
    }else{
		   document.getElementById("LC_ANNUITY.LCANNUITY_EMPID_4522").value=value;
    }
}
;
</div>
</div>
<div class="container-fluid" style="height:50%;overflow:auto;padding-top:5px">
	<ul class="nav nav-tabs" id="myTab">
		<li class="active"><a href="#Tab_1">年金汇总审批表</a></li>
	</ul>
	<div class="tab-content">
		<div class="tab-pane active" id="Tab_1">
			<div class="container-fluid">
				<div style="">
<table id="LC_PAYNIANJIN_LIST_List">
</table>
<div id="activity_pane" style="position:absolute;left:500px;top:70px"></div>
		</div>
</div>
</div>
<%@ page language="java" import="java.util.*" import="com.myehr.common.util.LangUtil" pageEncoding="UTF-8"%>
<%@ include file="/common/commontest.jsp" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<body>
<div class="container-fluid" style="height:100%;overflow-y:auto;padding-top:5px;">
var heightGadedata_4773 =[];
var containerParam_4773 ={};
containerParam_4773 ={};
function changeHeightGadedata_4773(data){
	heightGadedata_4773 = data;
}
<table id="LC_ANNUITY__BEGIN_LIST_List">
</table>
<div id="activity_pane" style="position:absolute;left:500px;top:70px"></div>
    querys_4773();
	$('#myTab a').click(function (e) {
				e.preventDefault();
				$(this).tab('show');
				$(this).find("table").bootstrapTable('refresh');
	});	var _formId_4773='4773';
var realFormId='${param.formId}';
var showButtonNum = 0;
function initRoleButtons(buttonFormId,buttonFormCode){
    var date = new Date();
    var url = '/myehr/form/queryCardFormButtonsWithUserId.action?formId='+buttonFormId+'&'+date;
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
    function querys_4773() {
        initRoleColumn('4773');
        initRoleButtons('4773','LC_PAYNIANJIN_LIST');
        $("#LC_PAYNIANJIN_LIST_List").bootstrapTable({
            url :'/myehr/form/cardformInitData.action',
            contentType: 'application/json;charset=utf-8',
            dataType:'json',
            method:'post',
            height : 500,
            undefinedText : '-',
            pagination : true,
            striped : false,
            fixedColumns: false,
            fixedNumber:0,
            showHeader : true,
            queryParams : grid_LC_PAYNIANJIN_LIST_fun,
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
                title : '序号',
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
                title : '主键',
                field : 'LCPAYNIANJIN_ID',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"LCPAYNIANJIN_ID\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"主键\">"+value+"</a>";
                }
            },
  {
                title : '缴费明细',
                field : 'LCPAYNIANJIN_TYPENAME',
                align : 'center',
                visible : columnvisible.LCPAYNIANJIN_TYPENAME,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"LCPAYNIANJIN_TYPENAME\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"缴费明细\">"+value+"</a>";
                }
            },
  {
                title : '税前金额',
                field : 'LCPAYNIANJIN_TAXQ',
                align : 'center',
                visible : columnvisible.LCPAYNIANJIN_TAXQ,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"LCPAYNIANJIN_TAXQ\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"税前金额\">"+value+"</a>";
                }
            },
  {
                title : '税后金额',
                field : 'LCPAYNIANJIN_TAXH',
                align : 'center',
                visible : columnvisible.LCPAYNIANJIN_TAXH,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"LCPAYNIANJIN_TAXH\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"税后金额\">"+value+"</a>";
                }
            },
  {
                title : '合计',
                field : 'LCPAYNIANJIN_SUMPAY',
                align : 'center',
                visible : columnvisible.LCPAYNIANJIN_SUMPAY,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"LCPAYNIANJIN_SUMPAY\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"合计\">"+value+"</a>";
                }
            },
  {
                title : '预留',
                field : 'LCPAYNIANJIN_SASE1',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"LCPAYNIANJIN_SASE1\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"预留\">"+value+"</a>";
                }
            },
            ],
            onClickRow: function (row, $element) {
                curRow = row;
            },
		onPostBody: function (res) {
		    hiddenBorder();
		},
		onAll: function (res) {
				  changeColor('LC_PAYNIANJIN_LIST_List');
		},
		onLoadSuccess: function (aa, bb, cc) {
				  changeColor('LC_PAYNIANJIN_LIST_List');
                $("#LC_PAYNIANJIN_LIST_List a").editable({
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
        	editLC_PAYNIANJIN_LIST_click_4773('isView',row);  
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
function refresh_LC_PAYNIANJIN_LIST() { 
    $('#LC_PAYNIANJIN_LIST_List').bootstrapTable('refresh'); 
}

/** 隐藏边框 */ 
function hiddenBorder(type) { 
    if(type == 0){
        $("#LC_PAYNIANJIN_LIST_List td").css("border","none");
    }else if(type == 1){
        $("#LC_PAYNIANJIN_LIST_List td").css("border-left","none");
    }else if(type == 2){
        $("#LC_PAYNIANJIN_LIST_List td").css("border-top","none");
    }
}
var filterParam = {};
var queryParams;
function grid_LC_PAYNIANJIN_LIST_fun(pageReqeust){
	var _filterdata={};
	if(document.getElementById('grid_LC_PAYNIANJIN_LIST_filter')){
	}
	var paramsMap = {};
	var requestParam={};
		requestParam = {};
	pageReqeust.containerParam=containerParam_4773;
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.userIds=getQueryString('empIds');
	pageReqeust.formId=_formId_4773;
	pageReqeust.isView=null;
	if(heightGadedata_4773!=null&&heightGadedata_4773!=undefined){
		pageReqeust.heightGrade = heightGadedata_4773;
	}
	queryParams = JSON.stringify(pageReqeust);
	return queryParams;
}
function grid_LC_PAYNIANJIN_LIST_fun11_4773(){
	$('#LC_PAYNIANJIN_LIST_List').bootstrapTable('refresh');
}
	function grid_LC_PAYNIANJIN_LIST_HeighQuery_4773() {
		layer.open({
			type: 2,
			showMaxButton: true,
			title:"高级查询设置" ,
			area: ['855', '500'],
			maxmin: true,
			content:'/myehr/jsp/form/button/heightGrade.jsp?formFunction=grid_LC_PAYNIANJIN_LIST_fun11_4773&formDefId=4773&formDefLayout=2',
			success:function(layero,index){
				},
				end:function(){
			}
			});
	}
		<div class="BTNGROUP BTNGROUP_4522" style="margin:5px auto; display:inline-block;height: 30px;z-index: 6;">
			<div style="margin-right:10px;display:inline-block">
			    <input type="button" id="submitButtonLC_ANNUITY__BEGIN_LIST"  class="btn btn-primary" value=提交 onclick="submitButtonLC_ANNUITY__BEGIN_LIST_click_4522()"/>
			</div>
		</div>
function submitButton_save_6289(){
	var paramsMap = {};
	var _param = {};
	var hzsParam = [];
	_param.formId=formId_main;
	_param = cardGetdata_main('#submitButton_main',formId_main);
	_param.buttonId='6289';
	_param.paramsMap = paramsMap;
	if(checkNull($("#MainElement").find("form"))){
		layer.close(indexApprove);
		return true;
	}else{
	var signstr = JSON.stringify(_param);
	var rule ='"' ;
	var regS = new RegExp(rule,'g');
	var rule2 =':' ;
	var regS2 = new RegExp(rule2,'g');
	signstr = signstr.replace(regS, '');
	signstr = signstr.replace(regS2, '=');
	var sign = md5(signstr);
		$.ajax({
			url:'/myehr/form/saveButtonSave.action?sign='+sign,
			type:'post',
			data: JSON.stringify(_param),
			cache: false,
			async: false,
			contentType: 'application/json;charset=utf-8',
			success: function (text) {
				if(text[0]=='error'){
					alert("操作异常");
					return ;
				}else {
					hzsParam = text;
				}
			}
		});
		if(hzsParam.length>0){
			_param.excresult = hzsParam;
			$.ajax({
				url:'/myehr/form/hzAction.action？sign='+sign,
				type:'post',
				data: JSON.stringify(_param),
				cache: false,
				async: false,
				contentType: 'application/json;charset=utf-8',
				success: function (text) {
				}
			});
		}
submitButton_refer_6289();
}
}
function submitButton_refer_6289(){
			var paramsMap = {};
			var _param = {};
			paramsMap.bussinessId = BUSSINESSID_ACT;
			_param.formId=formId_main;
			_param = cardGetdata_main_act('#submitButton_main',formId_main);
			_param.buttonId='6289';
			_param.paramsMap = paramsMap;
			_param.actFlowParams= {key:param_key};
			$.ajax({
				url:'/myehr/act/task/start.action',
				type:'post',
				data: JSON.stringify(_param),
				cache: false,
				async: false,
				contentType: 'application/json;charset=utf-8',
				success: function (text) {
					save_act_title();
					if(text[0]==0){
						alert("保存成功");
						param_procInsId = text[1];
					 	updateFiles();
					}else if(text[0]=='error'){
						alert("操作异常:"+text[1]);
						return ;
					}else {
						alert("操作失败");
						return ;
					}
				}
			});
		}
var filterParam = {};
var queryParams;
function grid_LC_ANNUITY__BEGIN_LIST_fun(pageReqeust){
	var _filterdata={};
	if(document.getElementById('grid_LC_ANNUITY__BEGIN_LIST_filter')){
	}
	var paramsMap = {};
	var requestParam={};
	if('${param.BUSINESSID}'==''&&'parameter'=='parameter'){
		if(BUSINESSID==undefined){
			requestParam = {BUSINESSID:'${param.businessId}'};
		}else{
			requestParam = {BUSINESSID:BUSINESSID+""};
		}
	}else{
		requestParam = {BUSINESSID:'${param.BUSINESSID}'};
	}
	pageReqeust.containerParam=containerParam_4522;
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.userIds=getQueryString('empIds');
	pageReqeust.formId=_formId_4522;
	pageReqeust.isView=null;
	pageReqeust.offset=Currentpage*pagesize;;
	pageReqeust.limit=pagesize;;
	if(heightGadedata_4522!=null&&heightGadedata_4522!=undefined){
		pageReqeust.heightGrade = heightGadedata_4522;
	}
	queryParams = JSON.stringify(pageReqeust);
	return queryParams;
}
function grid_LC_ANNUITY__BEGIN_LIST_fun11_4522(){
	loadDataStart();

}
