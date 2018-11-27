<%@ page language="java" import="java.util.*" import="com.myehr.common.util.LangUtil" pageEncoding="UTF-8"%>
<%@ include file="/common/common.jsp" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<style>
	
</style>

<link rel="stylesheet" href="/myehr/common/js/star/css/starability-all.css" type="text/css"></link>
<script type="text/javascript" src="/myehr/common/js/evaluate.js"></script>
</head>
<body>
<div class="container-fluid" style="height:100%;overflow-y:auto;padding-top:5px;">
	<div class="input-group" style="z-index: 5;float:right">
		<div id="grid_TEST_FEE_INFO_FORM_filter">
			<table class="cbs-table" style="width:100%">
				 <tr>
					<td style="padding-left:10px;"  width="100"  ><lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"是否有效")%>: </lable></td>
					<td style="padding-left:10px;"  width="100"  align="left"  >
						<select id="FILTER_TEST_INFOR_SON_OF_FEE.TESTINFORSONOFFEE_is_youxiao_3863" title="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"是否有效")%>" styleType="select" name="TESTINFORSONOFFEE_is_youxiao"  class="form-control " emptyText=""  style="float:left;" textField="dictName" valueField="dictId" DictName="SYS_COMMON_YES_NO" dataField="dictList_form_70617"></select>
						<span style='color:red;line-height:35px;font-size:27px'></span>
					</td>
					<td style="padding-left:10px;"  width="100"  ><lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"是否最新")%>: </lable></td>
					<td style="padding-left:10px;"  width="100"  align="left"  >
						<select id="FILTER_TEST_INFOR_SON_OF_FEE.TESTINFORSONOFFEE_is_zuixin_3863" title="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"是否最新")%>" styleType="select" name="TESTINFORSONOFFEE_is_zuixin"  class="form-control " emptyText=""  style="float:left;" textField="dictName" valueField="dictId" DictName="SYS_COMMON_YES_NO" dataField="dictList_form_70618"></select>
						<span style='color:red;line-height:35px;font-size:27px'></span>
					</td>
					<td style="margin-left:10px;float:left;padding-top:5px" align="left" >
						<div style="float:left;display:inline-block;margin-right:15px;position:relative;">
							<input class="btn btn-primary" style="width:70px;padding-left:2px;padding-right:25px;" value="查询" onclick="grid_TEST_FEE_INFO_FORM_fun11_3863()">
							<i class="glyphicon glyphicon-search" style="position: absolute;right: 12px;top: 6px;cursor: pointer;color:#fff">
							</i>
						</div>
					</td>
				</tr>
			</table>
		</div>
	</div>
	<table id="TEST_FEE_INFO_FORM_List">
	</table>
	<div id="activity_pane" style="position:absolute;left:500px;top:70px"></div>
	
</div>
<script>
var heightGadedata_3863 =[];
var containerParam_3863 ={};
containerParam_3863 ={};
function changeHeightGadedata_3863(data){
	heightGadedata_3863 = data;
}
$(function() {
    querys_3863();
	gridPatterns1();
    cardSelectInitFunction('${param.formType}');
    cardDateWidInitFunction();
    showMoreBtn($(".BTNGROUP_3863"));
});
var personId='';
function initFilterParam_3863(data){
}
	var _formId_3863='3863';
var realFormId='${param.formId}';
var columnvisible={};
function initRoleColumn(columnFormId){
    var url = '${pageContext.request.contextPath }/form/queryCardFormColumnsWithUserId.action?formId='+columnFormId;
    $.ajax({
        url:url,
        type:'post',
        cache: false,
        async: false,
        contentType:'application/json',
        success:function(datas){
            for(var i=0;i<datas.length;i++){
                if(datas[i].formColumnUsName==1||datas[i].formColumnUsName==2){
                    if(datas[i].formColumnType==1){
                        var entityTablename = datas[i].formEntityTablename;
                        var fieldTablename = datas[i].formFieldTablename;
                        var columnName=entityTablename.replace(/_/g,'')+'_'+fieldTablename;
                        columnvisible[columnName]=true;
                    }else{
                        columnvisible[fieldTablename]=true;
                    }
                }else{
                    if(datas[i].formColumnType==1){
                        var entityTablename = datas[i].formEntityTablename;
                        var fieldTablename = datas[i].formFieldTablename;
                        var columnName=entityTablename.replace(/_/g,'')+'_'+fieldTablename;
                        columnvisible[columnName]=false;
                    }else{
                        columnvisible[fieldTablename]=true;
                    }
                }
            }
        }
    });
}
function initRoleButtons(buttonFormId,buttonFormCode){
    var url = '${pageContext.request.contextPath }/form/queryCardFormButtonsWithUserId.action?formId='+buttonFormId;
    $.ajax({
        url:url,
        type:'post',
        cache: false,
        async: false,
        contentType:'application/json',
        success:function(datas){
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
                }else if(datas[i].powerType==0){
                    var obj = $("#"+datas[i].formButtonCode+buttonFormCode+"");
                    obj[0].parentNode.style.display="none";
                }
            }
        }
    });
}
    function querys_3863() {
        initRoleColumn('3863');
        initRoleButtons('3863','TEST_FEE_INFO_FORM');
        $("#TEST_FEE_INFO_FORM_List").bootstrapTable({
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
            queryParams : grid_TEST_FEE_INFO_FORM_fun,
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
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"主键")%>',
                field : 'TESTINFORSONOFFEE_id',
                align : 'center',
                visible : false,
                valign : 'left',
                sortable : true,
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;color:black;width:200px;\" name=\"TESTINFORSONOFFEE_id\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"主键\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"关联人员")%>',
                field : 'TESTINFORSONOFFEE_person_id',
                align : 'center',
                visible : columnvisible.TESTINFORSONOFFEE_person_id,
                valign : 'left',
                sortable : true,
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"TESTINFORSONOFFEE_person_id\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"关联人员\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"费用名")%>',
                field : 'TESTINFORSONOFFEE_fee_name',
                align : 'center',
                visible : columnvisible.TESTINFORSONOFFEE_fee_name,
                valign : 'left',
                sortable : true,
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"TESTINFORSONOFFEE_fee_name\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"费用名\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"费用编码")%>',
                field : 'TESTINFORSONOFFEE_fee_code',
                align : 'center',
                visible : columnvisible.TESTINFORSONOFFEE_fee_code,
                valign : 'left',
                sortable : true,
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"TESTINFORSONOFFEE_fee_code\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"费用编码\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"费用金额")%>',
                field : 'TESTINFORSONOFFEE_fee_value',
                align : 'center',
                visible : columnvisible.TESTINFORSONOFFEE_fee_value,
                valign : 'left',
                sortable : true,
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"TESTINFORSONOFFEE_fee_value\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"费用金额\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"消费时间")%>',
                field : 'TESTINFORSONOFFEE_fee_time',
                align : 'center',
                visible : columnvisible.TESTINFORSONOFFEE_fee_time,
                valign : 'left',
                sortable : true,
                formatter: function (value, row, index) {
                    var date = "-";
                    if(value!=null){
                    var val = value+"";
                    	if((("yyyy-MM-dd hh:mm:ss"=="hh:mm")&&val.indexOf(":")>1)||("yyyy-MM-dd HH:mm:ss"=="yyyyMM")){
                    		date = value ;
                    	}else{
                        date = new Date(value).Format("yyyy-MM-dd hh:mm:ss");
                    	}
                    }
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px\" name=\"TESTINFORSONOFFEE_fee_time\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"消费时间\">"+date+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"是否有效")%>',
                field : 'TESTINFORSONOFFEE_is_youxiao',
                align : 'center',
                visible : columnvisible.TESTINFORSONOFFEE_is_youxiao,
                valign : 'left',
                sortable : true,
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"TESTINFORSONOFFEE_is_youxiao\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"是否有效\" data-source=\"${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode1.action?deleteMark=SYS_COMMON_YES_NO&realValue="+value+"+\"></a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"是否最新")%>',
                field : 'TESTINFORSONOFFEE_is_zuixin',
                align : 'center',
                visible : columnvisible.TESTINFORSONOFFEE_is_zuixin,
                valign : 'left',
                sortable : true,
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"TESTINFORSONOFFEE_is_zuixin\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"是否最新\" data-source=\"${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode1.action?deleteMark=SYS_COMMON_YES_NO&realValue="+value+"+\"></a>";
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
                $("#TEST_FEE_INFO_FORM_List a").editable({
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
        	editTEST_FEE_INFO_FORM_click_3863('isView',row);  
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
function refresh_TEST_FEE_INFO_FORM() { 
    $('#TEST_FEE_INFO_FORM_List').bootstrapTable('refresh'); 
}

/** 隐藏边框 */ 
function hiddenBorder(type) { 
    if(type == 0){
        $("#TEST_FEE_INFO_FORM_List td").css("border","none");
    }else if(type == 1){
        $("#TEST_FEE_INFO_FORM_List td").css("border-left","none");
    }else if(type == 2){
        $("#TEST_FEE_INFO_FORM_List td").css("border-top","none");
    }
}
var filterParam = {};
var queryParams;
function grid_TEST_FEE_INFO_FORM_fun(pageReqeust){
	var _filterdata={};
	if(document.getElementById('grid_TEST_FEE_INFO_FORM_filter')){
	if($("[id='FILTER_TEST_INFOR_SON_OF_FEE.TESTINFORSONOFFEE_is_youxiao_3863']").attr('multiSelect')){
		var val = "";
		var arr = $("[id='FILTER_TEST_INFOR_SON_OF_FEE.TESTINFORSONOFFEE_is_youxiao_3863']").val();
		if(arr==null){
		}else{
			for(var i=0;i<arr.length;i++){
				val+=arr[i]+',';
			}
			val = val.substring(0,val.length-1);
		}
		var TESTINFORSONOFFEE_is_youxiao=val;
	}else if(($("[id='FILTER_TEST_INFOR_SON_OF_FEE.TESTINFORSONOFFEE_is_youxiao_3863']").attr('styleType')=="select")||($("[id='FILTER_TEST_INFOR_SON_OF_FEE.TESTINFORSONOFFEE_is_youxiao_3863']").attr('styleType')=="dateTime")){
			var TESTINFORSONOFFEE_is_youxiao=$("[id='FILTER_TEST_INFOR_SON_OF_FEE.TESTINFORSONOFFEE_is_youxiao_3863']").val();
		}else{
				var TESTINFORSONOFFEE_is_youxiao=$("[id='FILTER_3863']").val();
		}
	if($("[id='FILTER_TEST_INFOR_SON_OF_FEE.TESTINFORSONOFFEE_is_zuixin_3863']").attr('multiSelect')){
		var val = "";
		var arr = $("[id='FILTER_TEST_INFOR_SON_OF_FEE.TESTINFORSONOFFEE_is_zuixin_3863']").val();
		if(arr==null){
		}else{
			for(var i=0;i<arr.length;i++){
				val+=arr[i]+',';
			}
			val = val.substring(0,val.length-1);
		}
		var TESTINFORSONOFFEE_is_zuixin=val;
	}else if(($("[id='FILTER_TEST_INFOR_SON_OF_FEE.TESTINFORSONOFFEE_is_zuixin_3863']").attr('styleType')=="select")||($("[id='FILTER_TEST_INFOR_SON_OF_FEE.TESTINFORSONOFFEE_is_zuixin_3863']").attr('styleType')=="dateTime")){
			var TESTINFORSONOFFEE_is_zuixin=$("[id='FILTER_TEST_INFOR_SON_OF_FEE.TESTINFORSONOFFEE_is_zuixin_3863']").val();
		}else{
				var TESTINFORSONOFFEE_is_zuixin=$("[id='FILTER_3863']").val();
		}
		_filterdata={TESTINFORSONOFFEE_is_youxiao:TESTINFORSONOFFEE_is_youxiao,TESTINFORSONOFFEE_is_zuixin:TESTINFORSONOFFEE_is_zuixin};
	}
	var paramsMap = {};
	var requestParam={};
	if('${param.personId}'==''&&'parameter'=='parameter'){
		if(personId==undefined){
			requestParam = {personId:'${param.personId}'};
		}else{
			requestParam = {personId:personId+""};
		}
	}else{
		requestParam = {personId:'${param.personId}'};
	}
	pageReqeust.containerParam=containerParam_3863;
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.userIds='${param.empIds}';
	pageReqeust.formId=_formId_3863;
	pageReqeust.isView=null;
	if(heightGadedata_3863!=null&&heightGadedata_3863!=undefined){
		pageReqeust.heightGrade = heightGadedata_3863;
	}
	queryParams = JSON.stringify(pageReqeust);
	return queryParams;
}
function grid_TEST_FEE_INFO_FORM_fun11_3863(){
	$('#TEST_FEE_INFO_FORM_List').bootstrapTable('refresh');
}
	function grid_TEST_FEE_INFO_FORM_HeighQuery_3863() {
		layer.open({
			type: 2,
			showMaxButton: true,
			title:"<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"高级查询设置")%>" ,
			area: ['855', '500'],
			maxmin: true,
			content:'/myehr/jsp/form/button/heightGrade.jsp?formFunction=grid_TEST_FEE_INFO_FORM_fun11_3863&formDefId=3863&formDefLayout=2',
			success:function(layero,index){
				},
				end:function(){
			}
			});
	}
</script>
</body>
</html>
