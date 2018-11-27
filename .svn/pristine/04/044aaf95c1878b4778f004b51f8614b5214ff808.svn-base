<%@ page language="java" import="java.util.*" import="com.myehr.common.util.LangUtil" pageEncoding="UTF-8"%>
<%@ include file="/common/commontest.jsp" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<body>
<div class="container-fluid" style="height:100%;overflow-y:auto;padding-top:5px;">
<div class="input-group" style="z-index: 5;float:right">
    <div id="grid_PAY_MONPERFORASSE_LIST_filter">
        <table class="cbs-table" style="width:100%">
             <tr>
			<td style="float:right;padding-top:5px">
				<input id="FILTER_4650" name="FILTER_4650" placeholder="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"工号")%>,<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"姓名")%>" style="padding: 6px 30px 6px 10px;min-height:24px;font-size:12px" title="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"工号")%>,<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"姓名")%>" type="text" class="form-control" oninput="grid_PAY_MONPERFORASSE_LIST_fun11_4650()" />
				<i class="icon-search" style="position: absolute;right: 12px;top: 2px;cursor: pointer;"></i>
			</td>
            </tr>
        </table>
    </div>
</div>
		<div class="BTNGROUP BTNGROUP_4650" style="margin:5px auto; display:inline-block;height: 30px;z-index: 6;">
			<div style="margin-right:10px;display:inline-block">
			    <input type="button" id="executeSQL1PAY_MONPERFORASSE_LIST"  class="btn btn-success" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"批量修改")%> onclick="batchEdit('PAY_MONPERFORASSE_LIST_List')"/>
			</div>
		</div>
<table id="PAY_MONPERFORASSE_LIST_List">
</table>
<div id="activity_pane" style="position:absolute;left:500px;top:70px"></div>
</div>
<script>
var heightGadedata_4650 =[];
var containerParam_4650 ={};
containerParam_4650 ={};
function changeHeightGadedata_4650(data){
	heightGadedata_4650 = data;
}
$(function() {
gridPatterns2();

    cardSelectInitFunctionx_grid('${param.formType}');
    cardDateWidInitFunction();
    //showMoreBtn($(".BTNGROUP_4650"));
    querys_4650();
changeColor('PAY_MONPERFORASSE_LIST_List')
});
var ORGVORGANIZATION_ORGCODE='';
function initFilterParam_4650(data){
}
	var _formId_4650='4650';
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
    function querys_4650() {
        initRoleColumn('4650');
        initRoleButtons('4650','PAY_MONPERFORASSE_LIST');
        $("#PAY_MONPERFORASSE_LIST_List").bootstrapTable({
            url :'${pageContext.request.contextPath }/form/cardformInitData.action',
            contentType: 'application/json;charset=utf-8',
            dataType:'json',
            method:'post',
            height : 500,
            undefinedText : '-',
            pagination : true,
            striped : false,
            fixedColumns: true,
            fixedNumber:4,
            showHeader : true,
            queryParams : grid_PAY_MONPERFORASSE_LIST_fun,
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
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"组织码")%>',
                field : 'ORGVORGANIZATION_ORGCODE',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:120px;\" name=\"ORGVORGANIZATION_ORGCODE\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"组织码\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"工号")%>',
                field : 'EMPVEMPLOYEE_EMPCODE',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_EMPCODE,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:50px;\" name=\"EMPVEMPLOYEE_EMPCODE\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"工号\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"姓名")%>',
                field : 'EMPVEMPLOYEE_CNAME',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_CNAME,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:50px;\" name=\"EMPVEMPLOYEE_CNAME\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"姓名\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"公司")%>',
                field : 'EMPVEMPLOYEE_COMPID',
                visible :false,
            },{
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"公司")%>',
                field : 'EMPVEMPLOYEE_COMPID_DICTNAME',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_COMPID,
                valign : 'left',
				  sortable: true,
                formatter: function (value, row, index) {
						if(value==undefined||value=='null'||value==''){
        					value='-';
    					}
                    	return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:120px;\" name=\"EMPVEMPLOYEE_COMPID\" title=\""+value+"\">"+value+"</a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"部门")%>',
                field : 'EMPVEMPLOYEE_DEPID',
                visible :false,
            },{
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"部门")%>',
                field : 'EMPVEMPLOYEE_DEPID_DICTNAME',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_DEPID,
                valign : 'left',
				  sortable: true,
                formatter: function (value, row, index) {
						if(value==undefined||value=='null'||value==''){
        					value='-';
    					}
                    	return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:120px;\" name=\"EMPVEMPLOYEE_DEPID\" title=\""+value+"\">"+value+"</a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"岗位")%>',
                field : 'EMPVEMPLOYEE_JOBID',
                visible :false,
            },{
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"岗位")%>',
                field : 'EMPVEMPLOYEE_JOBID_DICTNAME',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_JOBID,
                valign : 'left',
				  sortable: true,
                formatter: function (value, row, index) {
						if(value==undefined||value=='null'||value==''){
        					value='-';
    					}
                    	return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:120px;\" name=\"EMPVEMPLOYEE_JOBID\" title=\""+value+"\">"+value+"</a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"员工状态")%>',
                field : 'EMPVEMPLOYEE_EMPSTATUS',
                visible :false,
            },{
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"员工状态")%>',
                field : 'EMPVEMPLOYEE_EMPSTATUS_DICTNAME',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_EMPSTATUS,
                valign : 'left',
				  sortable: true,
                formatter: function (value, row, index) {
						if(value==undefined||value=='null'||value==''){
        					value='-';
    					}
                    	return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:120px;\" name=\"EMPVEMPLOYEE_EMPSTATUS\" title=\""+value+"\">"+value+"</a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"在岗状态")%>',
                field : 'EMPVEMPLOYEE_JOBSTATUS',
                visible :false,
            },{
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"在岗状态")%>',
                field : 'EMPVEMPLOYEE_JOBSTATUS_DICTNAME',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_JOBSTATUS,
                valign : 'left',
				  sortable: true,
                formatter: function (value, row, index) {
						if(value==undefined||value=='null'||value==''){
        					value='-';
    					}
                    	return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:120px;\" name=\"EMPVEMPLOYEE_JOBSTATUS\" title=\""+value+"\">"+value+"</a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"入职日期")%>',
                field : 'EMPVEMPLOYEE_JOINDATE',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_JOINDATE,
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
        return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:120px\" name=\"EMPVEMPLOYEE_JOINDATE\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"入职日期\">"+date+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"主键")%>',
                field : 'PAYMONPERFORASSE_ID',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:120px;\" name=\"PAYMONPERFORASSE_ID\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"主键\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"员工ID")%>',
                field : 'PAYMONPERFORASSE_EMPID',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:120px;\" name=\"PAYMONPERFORASSE_EMPID\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"员工ID\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"月份")%>',
                field : 'PAYMONPERFORASSE_MONTHLY',
                align : 'center',
                visible : columnvisible.PAYMONPERFORASSE_MONTHLY,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:120px;\" name=\"PAYMONPERFORASSE_MONTHLY\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"月份\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"基本绩效")%>',
                field : 'PAYMONPERFORASSE_BASEPERFOR',
                align : 'center',
                visible : columnvisible.PAYMONPERFORASSE_BASEPERFOR,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:120px;\" name=\"PAYMONPERFORASSE_BASEPERFOR\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"基本绩效\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"考评绩效")%>',
                field : 'PAYMONPERFORASSE_PERFOREVALUA',
                align : 'center',
                visible : columnvisible.PAYMONPERFORASSE_PERFOREVALUA,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:120px;\" name=\"PAYMONPERFORASSE_PERFOREVALUA\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"考评绩效\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"出勤小时")%>',
                field : 'PAYMONPERFORASSE_ATTENDHOURS',
                align : 'center',
                visible : columnvisible.PAYMONPERFORASSE_ATTENDHOURS,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:120px;\" name=\"PAYMONPERFORASSE_ATTENDHOURS\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"出勤小时\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"休假小时")%>',
                field : 'PAYMONPERFORASSE_VACAHOURS',
                align : 'center',
                visible : columnvisible.PAYMONPERFORASSE_VACAHOURS,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:120px;\" name=\"PAYMONPERFORASSE_VACAHOURS\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"休假小时\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"病假小时")%>',
                field : 'PAYMONPERFORASSE_SICKHOUR',
                align : 'center',
                visible : columnvisible.PAYMONPERFORASSE_SICKHOUR,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:120px;\" name=\"PAYMONPERFORASSE_SICKHOUR\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"病假小时\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"事假小时")%>',
                field : 'PAYMONPERFORASSE_LEAVEHOURS',
                align : 'center',
                visible : columnvisible.PAYMONPERFORASSE_LEAVEHOURS,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:120px;\" name=\"PAYMONPERFORASSE_LEAVEHOURS\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"事假小时\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"调休小时")%>',
                field : 'PAYMONPERFORASSE_RELIEFHOURS',
                align : 'center',
                visible : columnvisible.PAYMONPERFORASSE_RELIEFHOURS,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:120px;\" name=\"PAYMONPERFORASSE_RELIEFHOURS\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"调休小时\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"加班小时")%>',
                field : 'PAYMONPERFORASSE_OVERTIMEHOURS',
                align : 'center',
                visible : columnvisible.PAYMONPERFORASSE_OVERTIMEHOURS,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:120px;\" name=\"PAYMONPERFORASSE_OVERTIMEHOURS\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"加班小时\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"小计")%>',
                field : 'PAYMONPERFORASSE_SUBTOTAL',
                align : 'center',
                visible : columnvisible.PAYMONPERFORASSE_SUBTOTAL,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:120px;\" name=\"PAYMONPERFORASSE_SUBTOTAL\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"小计\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"参考值")%>',
                field : 'PAYMONPERFORASSE_REFERENCE',
                align : 'center',
                visible : columnvisible.PAYMONPERFORASSE_REFERENCE,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:120px;\" name=\"PAYMONPERFORASSE_REFERENCE\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"参考值\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"加班绩效")%>',
                field : 'PAYMONPERFORASSE_OVERPERFOR',
                align : 'center',
                visible : columnvisible.PAYMONPERFORASSE_OVERPERFOR,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:120px;\" name=\"PAYMONPERFORASSE_OVERPERFOR\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"加班绩效\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"绩效汇总")%>',
                field : 'PAYMONPERFORASSE_PERFORSUM',
                align : 'center',
                visible : columnvisible.PAYMONPERFORASSE_PERFORSUM,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:120px;\" name=\"PAYMONPERFORASSE_PERFORSUM\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"绩效汇总\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"备注")%>',
                field : 'PAYMONPERFORASSE_REMARK',
                align : 'center',
                visible : columnvisible.PAYMONPERFORASSE_REMARK,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:120px;\" name=\"PAYMONPERFORASSE_REMARK\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"备注\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"流程ID")%>',
                field : 'PAYMONPERFORASSE_PROCESSID',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:120px;\" name=\"PAYMONPERFORASSE_PROCESSID\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"流程ID\">"+value+"</a>";
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
				  changeColor('PAY_MONPERFORASSE_LIST_List');
		},
		onLoadSuccess: function (aa, bb, cc) {
				  changeColor('PAY_MONPERFORASSE_LIST_List');
                $("#PAY_MONPERFORASSE_LIST_List a").editable({
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
        	editPAY_MONPERFORASSE_LIST_click_4650('isView',row);  
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
	
function executeSQL1PAY_MONPERFORASSE_LIST_click_4650(){

	var buttonId = 6573;
		var columnDataRows = $("#PAY_MONPERFORASSE_LIST_List").bootstrapTable('getSelections');
	var paramsMap = {};
	var data = {
		'formId' : _formId_4650,
		'buttonId' : buttonId,
		'params' : paramsMap,
		'containerParam' : containerParam
	};
var indey=layer.load();
	$.ajax({
			url:'${pageContext.request.contextPath }/form/execButtonExecSql.action',
			type : 'POST',
			data: JSON.stringify(data),
			cache : false,
			contentType: 'application/json;charset=utf-8',
			success : function (text) {
				layer.close(indey);
					if (text[0] == '000000') {
							alert(text[1]);
						$("#PAY_MONPERFORASSE_LIST_List").bootstrapTable('refresh');
					} else {
						$("#PAY_MONPERFORASSE_LIST_List").bootstrapTable('refresh');
							alert('<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"执行结果")%>：' + text[1]);
					}
				       jQuery('#activity_pane').hideLoading();
			var index = parent.layer.getFrameIndex(window.name);
				parent.layer.close(index);//执行关闭

			},
			error : function (jqXHR, textStatus, errorThrown) {
				layer.close(indey);
			}
		});

	}


	
function executeSQLPAY_MONPERFORASSE_LIST_click_4650(){

	var buttonId = 6480;
		var columnDataRows = $("#PAY_MONPERFORASSE_LIST_List").bootstrapTable('getSelections');
	var paramsMap = {		's_userid' : '${sessionScope.userid}'};
	var data = {
		'formId' : _formId_4650,
		'buttonId' : buttonId,
		'params' : paramsMap,
		'containerParam' : containerParam
	};
var indey=layer.load();
	$.ajax({
			url:'${pageContext.request.contextPath }/form/execButtonExecSql.action',
			type : 'POST',
			data: JSON.stringify(data),
			cache : false,
			contentType: 'application/json;charset=utf-8',
			success : function (text) {
				layer.close(indey);
					if (text[0] == '000000') {
							alert(text[1]);
						$("#PAY_MONPERFORASSE_LIST_List").bootstrapTable('refresh');
					} else {
						$("#PAY_MONPERFORASSE_LIST_List").bootstrapTable('refresh');
							alert('<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"执行结果")%>：' + text[1]);
					}
				       jQuery('#activity_pane').hideLoading();
			var index = parent.layer.getFrameIndex(window.name);
				parent.layer.close(index);//执行关闭

			},
			error : function (jqXHR, textStatus, errorThrown) {
				layer.close(indey);
			}
		});

	}


	
function executeSQL2PAY_MONPERFORASSE_LIST_click_4650(){

	var buttonId = 6481;
		var columnDataRows = $("#PAY_MONPERFORASSE_LIST_List").bootstrapTable('getSelections');
	var paramsMap = {		's_userid' : '${sessionScope.userid}'};
	var data = {
		'formId' : _formId_4650,
		'buttonId' : buttonId,
		'params' : paramsMap,
		'containerParam' : containerParam
	};
var indey=layer.load();
	$.ajax({
			url:'${pageContext.request.contextPath }/form/execButtonExecSql.action',
			type : 'POST',
			data: JSON.stringify(data),
			cache : false,
			contentType: 'application/json;charset=utf-8',
			success : function (text) {
				layer.close(indey);
					if (text[0] == '000000') {
							alert(text[1]);
						$("#PAY_MONPERFORASSE_LIST_List").bootstrapTable('refresh');
					} else {
						$("#PAY_MONPERFORASSE_LIST_List").bootstrapTable('refresh');
							alert('<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"执行结果")%>：' + text[1]);
					}
				       jQuery('#activity_pane').hideLoading();
			var index = parent.layer.getFrameIndex(window.name);
				parent.layer.close(index);//执行关闭

			},
			error : function (jqXHR, textStatus, errorThrown) {
				layer.close(indey);
			}
		});

	}


	
function executeSQL3PAY_MONPERFORASSE_LIST_click_4650(){

	var buttonId = 6575;
		var columnDataRows = $("#PAY_MONPERFORASSE_LIST_List").bootstrapTable('getSelections');
	var paramsMap = {		's_userid' : '${sessionScope.userid}'};
	var data = {
		'formId' : _formId_4650,
		'buttonId' : buttonId,
		'params' : paramsMap,
		'containerParam' : containerParam
	};
var indey=layer.load();
	$.ajax({
			url:'${pageContext.request.contextPath }/form/execButtonExecSql.action',
			type : 'POST',
			data: JSON.stringify(data),
			cache : false,
			contentType: 'application/json;charset=utf-8',
			success : function (text) {
				layer.close(indey);
					if (text[0] == '000000') {
							alert(text[1]);
						$("#PAY_MONPERFORASSE_LIST_List").bootstrapTable('refresh');
					} else {
						$("#PAY_MONPERFORASSE_LIST_List").bootstrapTable('refresh');
							alert('<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"执行结果")%>：' + text[1]);
					}
				       jQuery('#activity_pane').hideLoading();
			var index = parent.layer.getFrameIndex(window.name);
				parent.layer.close(index);//执行关闭

			},
			error : function (jqXHR, textStatus, errorThrown) {
				layer.close(indey);
			}
		});

	}


/** 刷新页面 */ 
function refresh_PAY_MONPERFORASSE_LIST() { 
    $('#PAY_MONPERFORASSE_LIST_List').bootstrapTable('refresh'); 
}

/** 隐藏边框 */ 
function hiddenBorder(type) { 
    if(type == 0){
        $("#PAY_MONPERFORASSE_LIST_List td").css("border","none");
    }else if(type == 1){
        $("#PAY_MONPERFORASSE_LIST_List td").css("border-left","none");
    }else if(type == 2){
        $("#PAY_MONPERFORASSE_LIST_List td").css("border-top","none");
    }
}
function editPAY_MONPERFORASSE_LIST_click_4650(isView,data){
	var selects = $("#PAY_MONPERFORASSE_LIST_List").bootstrapTable('getSelections');;
	if(selects!=null && selects.length>0){
		select = selects[0];;
		title='<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"月度绩效考核编辑")%>';
	}else if(data!=null&&isView!=null){
	select = data;
	title='<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"预览")%>';
	}else {
		alert('<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"请选择一行数据")%>');return ;
	}
	if(1==1){
		var url='/myehr/form/toForm.action?formId=4577&isInit=true&PAYMONPERFORASSE_ID='+select.PAYMONPERFORASSE_ID+'&&&isView='+isView+'';
	}else{
		var url='/myehr/form/toForm.action?formId=4577&isInit=true&PAYMONPERFORASSE_ID='+PAYMONPERFORASSE_ID+'&isView='+isView+'';
	}
	layer.open({
		type: 2,
		title:title,
		shadeClose: true,
		shade: 0.8,
		maxmin:true,
		zIndex:9999,
		area: ['950px', '500px'],
		content: url,
		success:function(layero,index){
			$('.layui-layer-max').click();
		},
		end:function(){
			    refresh_PAY_MONPERFORASSE_LIST();
		}
	});
}
function calculatePAY_MONPERFORASSE_LIST_click_4650(){
	var sql = "select 'true' as xvalue from PAY_MONPROCESS where checkd=1";
	var data = myehr_SQLFORBID_sql(sql);
	if(data.length>0&&data[0].xvalue=='true'){
		layer.alert('数据已锁定', {
			icon: 5,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
			 skin: 'layer-ext-moon' //
		})
	}else{
	layer.open({
		type: 2,
		showMaxButton: true,
		title:"<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"选择公式")%>" ,
		area: ['600', '500'],
		offset: ['0px', '0px'],
		content:'/myehr/jsp/form/button/excSolution.jsp?formId=4650&formButtonId=6478',
		onload:function(){ 
		},
		end: function (){
				 refresh_PAY_MONPERFORASSE_LIST();
		}
	 }); 
	}
}
var filterParam = {};
var queryParams;
function grid_PAY_MONPERFORASSE_LIST_fun(pageReqeust){
	var _filterdata={};
	if(document.getElementById('grid_PAY_MONPERFORASSE_LIST_filter')){
	if($("[id='FILTER_EMP_V_EMPLOYEE.EMPVEMPLOYEE_EMPCODE_4650']").attr('multiSelect')){
		var val = "";
		var arr = $("[id='FILTER_EMP_V_EMPLOYEE.EMPVEMPLOYEE_EMPCODE_4650']").val();
		if(arr==null){
		}else{
			for(var i=0;i<arr.length;i++){
				val+=arr[i]+',';
			}
			val = val.substring(0,val.length-1);
		}
		var EMPVEMPLOYEE_EMPCODE=val;
	}else if(($("[id='FILTER_EMP_V_EMPLOYEE.EMPVEMPLOYEE_EMPCODE_4650']").attr('styleType')=="select")||($("[id='FILTER_EMP_V_EMPLOYEE.EMPVEMPLOYEE_EMPCODE_4650']").attr('styleType')=="dateTime")){
			var EMPVEMPLOYEE_EMPCODE=$("[id='FILTER_EMP_V_EMPLOYEE.EMPVEMPLOYEE_EMPCODE_4650']").val();
		}else{
				var EMPVEMPLOYEE_EMPCODE=$("[id='FILTER_4650']").val();
		}
	if($("[id='FILTER_EMP_V_EMPLOYEE.EMPVEMPLOYEE_CNAME_4650']").attr('multiSelect')){
		var val = "";
		var arr = $("[id='FILTER_EMP_V_EMPLOYEE.EMPVEMPLOYEE_CNAME_4650']").val();
		if(arr==null){
		}else{
			for(var i=0;i<arr.length;i++){
				val+=arr[i]+',';
			}
			val = val.substring(0,val.length-1);
		}
		var EMPVEMPLOYEE_CNAME=val;
	}else if(($("[id='FILTER_EMP_V_EMPLOYEE.EMPVEMPLOYEE_CNAME_4650']").attr('styleType')=="select")||($("[id='FILTER_EMP_V_EMPLOYEE.EMPVEMPLOYEE_CNAME_4650']").attr('styleType')=="dateTime")){
			var EMPVEMPLOYEE_CNAME=$("[id='FILTER_EMP_V_EMPLOYEE.EMPVEMPLOYEE_CNAME_4650']").val();
		}else{
				var EMPVEMPLOYEE_CNAME=$("[id='FILTER_4650']").val();
		}
		_filterdata={EMPVEMPLOYEE_EMPCODE:EMPVEMPLOYEE_EMPCODE,EMPVEMPLOYEE_CNAME:EMPVEMPLOYEE_CNAME};
	}
	var paramsMap = {};
	var requestParam={};
	if('${param.ORGVORGANIZATION_ORGCODE}'==''&&'parameter'=='parameter'){
		if(ORGVORGANIZATION_ORGCODE==undefined){
			requestParam = {ORGVORGANIZATION_ORGCODE:'${param.ORGVORGANIZATION_ORGCODE}'};
		}else{
			requestParam = {ORGVORGANIZATION_ORGCODE:ORGVORGANIZATION_ORGCODE+""};
		}
	}else{
		requestParam = {ORGVORGANIZATION_ORGCODE:'${param.ORGVORGANIZATION_ORGCODE}'};
	}
	pageReqeust.containerParam=containerParam_4650;
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.userIds=getQueryString('empIds');
	pageReqeust.formId=_formId_4650;
	pageReqeust.isView=null;
	if(heightGadedata_4650!=null&&heightGadedata_4650!=undefined){
		pageReqeust.heightGrade = heightGadedata_4650;
	}
	queryParams = JSON.stringify(pageReqeust);
	return queryParams;
}
function grid_PAY_MONPERFORASSE_LIST_fun11_4650(){
	$('#PAY_MONPERFORASSE_LIST_List').bootstrapTable('refresh');
}
function exportData(fieldArray,formId){
    exportData_4650(fieldArray);
}
function grid_PAY_MONPERFORASSE_LIST_HeighQuery_4650() {
	layer.open({
		type: 2,
		showMaxButton: true,
		title:"<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"高级查询设置")%>" ,
		area: ['855', '500'],
		maxmin: true,
		content:'/myehr/jsp/form/button/heightGrade.jsp?formFunction=grid_PAY_MONPERFORASSE_LIST_fun11_4650&formDefId=4650&formDefLayout=2',
		success:function(layero,index){
			},
			end:function(){
		}
		});
}
var flag = 0;
function batchEdit(e){
	//$("#batchEdit"+e).bootstrapTable('getData')
	var selects = $("#"+e).bootstrapTable('getSelections');
	var content = '<table id ="batchEdit'+e+'"></table>';
	layer.open({
		title:'输入内容',
		shadeClose: true,
		zIndex:9999,
		area : ['100%', '100%'],
		maxmin: true,            //最大化按钮
		content: content,
		btn: ['保存'],
		yes: function(index, layero){
		//按钮【按钮一】的回调
			var datas = selects;
			var trs = $("#batchEdit"+e).find("tbody tr");
			for(var i=0;i<trs.length;i++){
				var input = trs.eq(i).find("input");
				var data = datas[i];
				for(j=0;j<input.length;j++){
					var columnName = input.eq(j).attr("name");
					data[columnName] = input.eq(j).val();
				}
			}
			saveFunction(selects);
		},
		success:function(layero,index){
			queryBatchEdit(e);
			$("#batchEdit"+e).bootstrapTable('load',selects); 
		},
		end:function(){
		}
	});
        
}

function saveFunction(e){
	var params = [];
	for(var i=0;i<e.length;i++){
		var _param = {};
		_param.param = e[i];
		_param.formId='${param.formId}';
		_param.buttonId='0';//'${param.buttonId}';
		_param.paramsMap = {};
		params[i] = _param;
	}
	$.ajax({
		url:'${pageContext.request.contextPath }/form/batchSaveButtonSave.action?formId=${param.formId}',
		type : 'POST',
		data: JSON.stringify(params),
		cache : false,
		contentType: 'application/json;charset=utf-8',
		success : function (text) {
			
		}
	})
}

function queryBatchEdit(e){
	$("#batchEdit"+e).bootstrapTable({
            method:'post',
            height : 500,
            undefinedText : '-',
            pagination : false,
            striped : false,
            fixedColumns: true,
            fixedNumber:4,
            showHeader : true,
            cache : false,
            toolbar : "#toolbar",
            columns : [
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
            },{
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"组织码")%>',
                field : 'ORGVORGANIZATION_ORGCODE',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:120px;\" name=\"ORGVORGANIZATION_ORGCODE\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"组织码\">"+value+"</a>";
                }
            },{
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"工号")%>',
                field : 'EMPVEMPLOYEE_EMPCODE',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_EMPCODE,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:50px;\" name=\"EMPVEMPLOYEE_EMPCODE\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"工号\">"+value+"</a>";
                }
            },{
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"姓名")%>',
                field : 'EMPVEMPLOYEE_CNAME',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_CNAME,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:50px;\" name=\"EMPVEMPLOYEE_CNAME\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"姓名\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"公司")%>',
                field : 'EMPVEMPLOYEE_COMPID',
                visible :false,
            },{
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"公司")%>',
                field : 'EMPVEMPLOYEE_COMPID_DICTNAME',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_COMPID,
                valign : 'left',
				  sortable: true,
                formatter: function (value, row, index) {
						if(value==undefined||value=='null'||value==''){
        					value='-';
    					}
                    	return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:120px;\" name=\"EMPVEMPLOYEE_COMPID\" title=\""+value+"\">"+value+"</a>";
                }
            },{
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"部门")%>',
                field : 'EMPVEMPLOYEE_DEPID',
                visible :false,
            },{
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"部门")%>',
                field : 'EMPVEMPLOYEE_DEPID_DICTNAME',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_DEPID,
                valign : 'left',
				  sortable: true,
                formatter: function (value, row, index) {
						if(value==undefined||value=='null'||value==''){
        					value='-';
    					}
                    	return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:120px;\" name=\"EMPVEMPLOYEE_DEPID\" title=\""+value+"\">"+value+"</a>";
                }
            },{
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"岗位")%>',
                field : 'EMPVEMPLOYEE_JOBID',
                visible :false,
            },{
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"岗位")%>',
                field : 'EMPVEMPLOYEE_JOBID_DICTNAME',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_JOBID,
                valign : 'left',
				  sortable: true,
                formatter: function (value, row, index) {
						if(value==undefined||value=='null'||value==''){
        					value='-';
    					}
                    	return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:120px;\" name=\"EMPVEMPLOYEE_JOBID\" title=\""+value+"\">"+value+"</a>";
                }
            },{
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"员工状态")%>',
                field : 'EMPVEMPLOYEE_EMPSTATUS',
                visible :false,
            },{
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"员工状态")%>',
                field : 'EMPVEMPLOYEE_EMPSTATUS_DICTNAME',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_EMPSTATUS,
                valign : 'left',
				  sortable: true,
                formatter: function (value, row, index) {
						if(value==undefined||value=='null'||value==''){
        					value='-';
    					}
                    	return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:120px;\" name=\"EMPVEMPLOYEE_EMPSTATUS\" title=\""+value+"\">"+value+"</a>";
                }
            },{
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"在岗状态")%>',
                field : 'EMPVEMPLOYEE_JOBSTATUS',
                visible :false,
            },{
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"在岗状态")%>',
                field : 'EMPVEMPLOYEE_JOBSTATUS_DICTNAME',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_JOBSTATUS,
                valign : 'left',
				  sortable: true,
                formatter: function (value, row, index) {
						if(value==undefined||value=='null'||value==''){
        					value='-';
    					}
                    	return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:120px;\" name=\"EMPVEMPLOYEE_JOBSTATUS\" title=\""+value+"\">"+value+"</a>";
                }
            },{
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"入职日期")%>',
                field : 'EMPVEMPLOYEE_JOINDATE',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_JOINDATE,
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
					return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:120px\" name=\"EMPVEMPLOYEE_JOINDATE\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"入职日期\">"+date+"</a>";
                }
            },{
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"主键")%>',
                field : 'PAYMONPERFORASSE_ID',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:120px;\" name=\"PAYMONPERFORASSE_ID\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"主键\">"+value+"</a>";
                }
            },{
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"员工ID")%>',
                field : 'PAYMONPERFORASSE_EMPID',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:120px;\" name=\"PAYMONPERFORASSE_EMPID\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"员工ID\">"+value+"</a>";
                }
            },{
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"月份")%>',
                field : 'PAYMONPERFORASSE_MONTHLY',
                align : 'center',
                visible : columnvisible.PAYMONPERFORASSE_MONTHLY,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:120px;\" name=\"PAYMONPERFORASSE_MONTHLY\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"月份\">"+value+"</a>";
                }
            },{
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"基本绩效")%>',
                field : 'PAYMONPERFORASSE_BASEPERFOR',
                align : 'center',
                visible : columnvisible.PAYMONPERFORASSE_BASEPERFOR,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<input type=\"text\"  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:120px;\" name=\"PAYMONPERFORASSE_BASEPERFOR\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"基本绩效\" value=\""+value+"\">";
                }
            },{
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"考评绩效")%>',
                field : 'PAYMONPERFORASSE_PERFOREVALUA',
                align : 'center',
                visible : columnvisible.PAYMONPERFORASSE_PERFOREVALUA,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<input type=\"text\"  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:120px;\" name=\"PAYMONPERFORASSE_PERFOREVALUA\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"考评绩效\" value=\""+value+"\">";
                }
            },{
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"出勤小时")%>',
                field : 'PAYMONPERFORASSE_ATTENDHOURS',
                align : 'center',
                visible : columnvisible.PAYMONPERFORASSE_ATTENDHOURS,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:120px;\" name=\"PAYMONPERFORASSE_ATTENDHOURS\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"出勤小时\">"+value+"</a>";
                }
            },{
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"休假小时")%>',
                field : 'PAYMONPERFORASSE_VACAHOURS',
                align : 'center',
                visible : columnvisible.PAYMONPERFORASSE_VACAHOURS,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:120px;\" name=\"PAYMONPERFORASSE_VACAHOURS\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"休假小时\">"+value+"</a>";
                }
            },{
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"病假小时")%>',
                field : 'PAYMONPERFORASSE_SICKHOUR',
                align : 'center',
                visible : columnvisible.PAYMONPERFORASSE_SICKHOUR,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:120px;\" name=\"PAYMONPERFORASSE_SICKHOUR\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"病假小时\">"+value+"</a>";
                }
            },{
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"事假小时")%>',
                field : 'PAYMONPERFORASSE_LEAVEHOURS',
                align : 'center',
                visible : columnvisible.PAYMONPERFORASSE_LEAVEHOURS,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:120px;\" name=\"PAYMONPERFORASSE_LEAVEHOURS\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"事假小时\">"+value+"</a>";
                }
            },{
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"调休小时")%>',
                field : 'PAYMONPERFORASSE_RELIEFHOURS',
                align : 'center',
                visible : columnvisible.PAYMONPERFORASSE_RELIEFHOURS,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:120px;\" name=\"PAYMONPERFORASSE_RELIEFHOURS\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"调休小时\">"+value+"</a>";
                }
            },{
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"加班小时")%>',
                field : 'PAYMONPERFORASSE_OVERTIMEHOURS',
                align : 'center',
                visible : columnvisible.PAYMONPERFORASSE_OVERTIMEHOURS,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:120px;\" name=\"PAYMONPERFORASSE_OVERTIMEHOURS\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"加班小时\">"+value+"</a>";
                }
            },{
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"小计")%>',
                field : 'PAYMONPERFORASSE_SUBTOTAL',
                align : 'center',
                visible : columnvisible.PAYMONPERFORASSE_SUBTOTAL,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:120px;\" name=\"PAYMONPERFORASSE_SUBTOTAL\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"小计\">"+value+"</a>";
                }
            },{
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"参考值")%>',
                field : 'PAYMONPERFORASSE_REFERENCE',
                align : 'center',
                visible : columnvisible.PAYMONPERFORASSE_REFERENCE,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:120px;\" name=\"PAYMONPERFORASSE_REFERENCE\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"参考值\">"+value+"</a>";
                }
            },{
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"加班绩效")%>',
                field : 'PAYMONPERFORASSE_OVERPERFOR',
                align : 'center',
                visible : columnvisible.PAYMONPERFORASSE_OVERPERFOR,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:120px;\" name=\"PAYMONPERFORASSE_OVERPERFOR\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"加班绩效\">"+value+"</a>";
                }
            },{
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"绩效汇总")%>',
                field : 'PAYMONPERFORASSE_PERFORSUM',
                align : 'center',
                visible : columnvisible.PAYMONPERFORASSE_PERFORSUM,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:120px;\" name=\"PAYMONPERFORASSE_PERFORSUM\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"绩效汇总\">"+value+"</a>";
                }
            },{
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"备注")%>',
                field : 'PAYMONPERFORASSE_REMARK',
                align : 'center',
                visible : columnvisible.PAYMONPERFORASSE_REMARK,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:120px;\" name=\"PAYMONPERFORASSE_REMARK\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"备注\">"+value+"</a>";
                }
            },{
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"流程ID")%>',
                field : 'PAYMONPERFORASSE_PROCESSID',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:120px;\" name=\"PAYMONPERFORASSE_PROCESSID\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"流程ID\">"+value+"</a>";
                }
            },
            ]
		})
}
</script>
</body>
</html>
