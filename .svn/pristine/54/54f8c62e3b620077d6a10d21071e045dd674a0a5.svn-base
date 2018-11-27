<%@ page language="java" import="java.util.*" import="com.myehr.common.util.LangUtil" pageEncoding="UTF-8"%>
<%@ include file="/common/common.jsp" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<body>
<div class="container-fluid" style="height:100%;overflow-y:hidden;padding-top:10px;">
	<div>
<div class="input-group" style="padding-bottom:10px;width:100%;z-index: 5;">
    <div id="grid_emp_emp_list_filter">
        <table class="cbs-table" style="width:100%">
             <tr>
				<td style="padding-left:10px;"  width="100"  ><lable style="float:left"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"员工状态")%>: </lable></td>
				<td style="padding-left:10px;" width=200px align="left"  >						<select id="FILTER_EMP_V_EMPLOYEE.EMPVEMPLOYEE_EMPSTATUS_2131" title="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"员工状态")%>" styleType="select" name="EMPVEMPLOYEE_EMPSTATUS"  class="form-control " emptyText=""  style="" showNullItem="true" textField="dictName" valueField="dictId" DictName="EMP_EMPSTATUS" nullItemText="" dataField="dictList_form_24270"></select></td>
			<td style="float:right">
				<input id="FILTER_2131" name="FILTER_2131" placeholder="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"工号")%>,<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"姓名")%>" style="padding: 6px 30px 6px 10px;" title="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"工号")%>,<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"姓名")%>" type="text" class="form-control" oninput="grid_emp_emp_list_fun11_2131()" />
				<i class="icon-search" style="position: absolute;right: 12px;top: 2px;cursor: pointer;"></i>
			</td>
                <td style="margin-left:10px;float:left" align="left" >
<div style="float:left;display:inline-block;margin-right:15px;position:relative;">
<input class="btn btn-primary" style="width:70px;padding-left:2px;padding-right:25px;" value="查询" onclick="grid_emp_emp_list_fun11_2131()">
<i class="glyphicon glyphicon-search" style="position: absolute;right: 12px;top: 6px;cursor: pointer;color:#fff">
</i>
</div></div>
</td>
            </tr>
        </table>
    </div>
</div>
		<div class="BTNGROUP BTNGROUP_2131" style="margin:5px auto; display:inline-block;height: 30px;z-index: 6;position: relative">
			<div style="margin-right:10px;display:inline-block">
			    <input type="button" id="executeSQLemp_emp_list"  class="btn btn-success" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"职员背景")%> onclick="executeSQLemp_emp_list_click_2131()"/>
			</div>
			<div style="margin-right:10px;display:inline-block">
			    <input type="button" id="executeSQL1emp_emp_list"  class="btn btn-success" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"生命周期")%> onclick="executeSQL1emp_emp_list_click_2131()"/>
			</div>
			<div style="margin-right:10px;display:inline-block">
			    <input type="button" id="editemp_emp_list"  class="btn btn-warning" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"预览")%> onclick="editemp_emp_list_click_2131()"/>
			</div>
		</div>
</div>
<table id="emp_emp_list_List">
</table>
<div id="activity_pane" style="position:absolute;left:500px;top:70px"></div>
</div>
<script>
var heightGadedata =[];
containerParam ={};
$(function() {
    querys_2131();
	//gridPatterns();
	cardSelectInitFunction();
    cardDateWidInitFunction();
	
    var DIVAMOUNT = 5;
    if($(".BTNGROUP_2131>div").length > DIVAMOUNT){
    	var len = $(".BTNGROUP_2131>div").length;
    	$(".BTNGROUP_2131>div:gt(4)").hide();
    	var selectObj = $('<div class="btn-group"><button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">更多 <span class="caret"></span></button><ul class="dropdown-menu" style="min-width:90px;left:-14px;"></ul></div>');
    	$(".BTNGROUP_2131").append(selectObj);
    	for(var i=DIVAMOUNT;i<len;i++){
    		var liObj = $('<li style="margin-left:14px;"></li>');
    		liObj.append($(".BTNGROUP_2131>div").eq(i).clone(true));
    		selectObj.find('.dropdown-menu').append(liObj);
    		selectObj.find('.dropdown-menu').append($('<li role="separator" class="divider"></li>'));
    	}
    	selectObj.find('.dropdown-menu div').show();
    }
});

var ORGVORGANIZATION_ORGCODE='';
function initFilterParam(data){
}

	var _formId_2131='2131';
	
    function querys_2131() {
        $("#emp_emp_list_List").bootstrapTable({
            url :'${pageContext.request.contextPath }/form/cardformInitData.action',
            contentType: 'application/json;charset=utf-8',
            dataType:'json',
            method:'post',
            height : '578',
            undefinedText : '-',
            pagination : true,
            striped : true,
            queryParams : grid_emp_emp_list_fun,
            cache : false,
            pageSize : 10, 
            pageList : [10,20,50,10000], 
			fixedNumber:4,
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
                    	  return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGVORGANIZATION_ORGCODE\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"组织码\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"员工ID")%>',
                field : 'EMPVEMPLOYEE_EMPID',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                    	  return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"EMPVEMPLOYEE_EMPID\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"员工ID\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"工号")%>',
                field : 'EMPVEMPLOYEE_EMPCODE',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                    	  return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"EMPVEMPLOYEE_EMPCODE\" onmouseover=\"editemp_emp_list_click_2131('isView');\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"工号\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"姓名")%>',
                field : 'EMPVEMPLOYEE_CNAME',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                    	  return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"EMPVEMPLOYEE_CNAME\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"姓名\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"英文名/拼音")%>',
                field : 'EMPVEMPLOYEE_ENAME',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                    	  return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"EMPVEMPLOYEE_ENAME\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"英文名/拼音\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"公司")%>',
                field : 'EMPVEMPLOYEE_COMPID',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"EMPVEMPLOYEE_COMPID\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"公司\" data-source=\"${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode1.action?deleteMark= data_form_24265&realValue="+value+"+\"></a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"部门")%>',
                field : 'EMPVEMPLOYEE_DEPID',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"EMPVEMPLOYEE_DEPID\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"部门\" data-source=\"${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode1.action?deleteMark= data_form_24266&realValue="+value+"+\"></a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"岗位")%>',
                field : 'EMPVEMPLOYEE_JOBID',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"EMPVEMPLOYEE_JOBID\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"岗位\" data-source=\"${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode1.action?deleteMark= data_form_24267&realValue="+value+"+\"></a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"直接主管")%>',
                field : 'EMPVEMPLOYEE_SUPVISOR',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"EMPVEMPLOYEE_SUPVISOR\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"直接主管\" data-source=\"${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode1.action?deleteMark= data_form_24268&realValue="+value+"+\"></a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"职能主管")%>',
                field : 'EMPVEMPLOYEE_FUNSUPVISOR',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"EMPVEMPLOYEE_FUNSUPVISOR\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"职能主管\" data-source=\"${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode1.action?deleteMark= data_form_24269&realValue="+value+"+\"></a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"员工状态")%>',
                field : 'EMPVEMPLOYEE_EMPSTATUS',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"EMPVEMPLOYEE_EMPSTATUS\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"员工状态\" data-source=\"${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode1.action?deleteMark=EMP_EMPSTATUS&realValue="+value+"+\"></a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"在岗状态")%>',
                field : 'EMPVEMPLOYEE_JOBSTATUS',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"EMPVEMPLOYEE_JOBSTATUS\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"在岗状态\" data-source=\"${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode1.action?deleteMark=Onduty&realValue="+value+"+\"></a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"用工类型")%>',
                field : 'EMPVEMPLOYEE_EMPTYPE',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"EMPVEMPLOYEE_EMPTYPE\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"用工类型\" data-source=\"${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode1.action?deleteMark=EMP_EMPTYPE&realValue="+value+"+\"></a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"员工性质")%>',
                field : 'EMPVEMPLOYEE_EMPKIND',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"EMPVEMPLOYEE_EMPKIND\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"员工性质\" data-source=\"${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode1.action?deleteMark=EMP_EMPKIND&realValue="+value+"+\"></a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"预留分类1")%>',
                field : 'EMPVEMPLOYEE_EMPGROUP1',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                    	  return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"EMPVEMPLOYEE_EMPGROUP1\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"预留分类1\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"预留分类2")%>',
                field : 'EMPVEMPLOYEE_EMPGROUP2',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                    	  return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"EMPVEMPLOYEE_EMPGROUP2\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"预留分类2\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"预留分类3")%>',
                field : 'EMPVEMPLOYEE_EMPGROUP3',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                    	  return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"EMPVEMPLOYEE_EMPGROUP3\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"预留分类3\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"预留分类4")%>',
                field : 'EMPVEMPLOYEE_EMPGROUP4',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                    	  return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"EMPVEMPLOYEE_EMPGROUP4\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"预留分类4\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"预留分类5")%>',
                field : 'EMPVEMPLOYEE_EMPGROUP5',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                    	  return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"EMPVEMPLOYEE_EMPGROUP5\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"预留分类5\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"职级")%>',
                field : 'EMPVEMPLOYEE_EMPGRADE',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"EMPVEMPLOYEE_EMPGRADE\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"职级\" data-source=\"${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode1.action?deleteMark=EMP_EMPGRADE&realValue="+value+"+\"></a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"职等")%>',
                field : 'EMPVEMPLOYEE_EMPLEVEL',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"EMPVEMPLOYEE_EMPLEVEL\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"职等\" data-source=\"${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode1.action?deleteMark=EMP_EMPGRADE&realValue="+value+"+\"></a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"招聘来源")%>',
                field : 'EMPVEMPLOYEE_RECTYPE',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"EMPVEMPLOYEE_RECTYPE\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"招聘来源\" data-source=\"${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode1.action?deleteMark=EMP_RECTYPE&realValue="+value+"+\"></a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"工作城市")%>',
                field : 'EMPVEMPLOYEE_WORKCITY',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"EMPVEMPLOYEE_WORKCITY\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"工作城市\" data-source=\"${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode1.action?deleteMark=EMP_WORKCITY&realValue="+value+"+\"></a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"入职日期")%>',
                field : 'EMPVEMPLOYEE_JOINDATE',
                align : 'center',
                visible : true,
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
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px\" name=\"EMPVEMPLOYEE_JOINDATE\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"入职日期\">"+date+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"司龄调整")%>',
                field : 'EMPVEMPLOYEE_COMPYEARADJUST',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                    	  return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"EMPVEMPLOYEE_COMPYEARADJUST\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"司龄调整\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"社会工作日")%>',
                field : 'EMPVEMPLOYEE_BEGINWORKDATE',
                align : 'center',
                visible : true,
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
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px\" name=\"EMPVEMPLOYEE_BEGINWORKDATE\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"社会工作日\">"+date+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"工龄调整")%>',
                field : 'EMPVEMPLOYEE_WORKYEARADJUST',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                    	  return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"EMPVEMPLOYEE_WORKYEARADJUST\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"工龄调整\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"岗位开始日期")%>',
                field : 'EMPVEMPLOYEE_JOBBEGINDATE',
                align : 'center',
                visible : true,
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
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px\" name=\"EMPVEMPLOYEE_JOBBEGINDATE\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"岗位开始日期\">"+date+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"试用期开始日期")%>',
                field : 'EMPVEMPLOYEE_PROBBEGINDATE',
                align : 'center',
                visible : true,
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
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px\" name=\"EMPVEMPLOYEE_PROBBEGINDATE\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"试用期开始日期\">"+date+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"试用期")%>',
                field : 'EMPVEMPLOYEE_PROBTERM',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                    	  return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"EMPVEMPLOYEE_PROBTERM\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"试用期\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"试用期结束日期")%>',
                field : 'EMPVEMPLOYEE_PROBENDDATE',
                align : 'center',
                visible : true,
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
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px\" name=\"EMPVEMPLOYEE_PROBENDDATE\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"试用期结束日期\">"+date+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"试用期转正日期")%>',
                field : 'EMPVEMPLOYEE_PROBCHECKENDDATE',
                align : 'center',
                visible : true,
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
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px\" name=\"EMPVEMPLOYEE_PROBCHECKENDDATE\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"试用期转正日期\">"+date+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"实习期开始日期")%>',
                field : 'EMPVEMPLOYEE_PRACBEGINDATE',
                align : 'center',
                visible : true,
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
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px\" name=\"EMPVEMPLOYEE_PRACBEGINDATE\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"实习期开始日期\">"+date+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"实习期")%>',
                field : 'EMPVEMPLOYEE_PRACTERM',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                    	  return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"EMPVEMPLOYEE_PRACTERM\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"实习期\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"实习结束日期")%>',
                field : 'EMPVEMPLOYEE_PRACENDDATE',
                align : 'center',
                visible : true,
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
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px\" name=\"EMPVEMPLOYEE_PRACENDDATE\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"实习结束日期\">"+date+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"申请离职日期")%>',
                field : 'EMPVEMPLOYEE_LEAVEAPPLYDATE',
                align : 'center',
                visible : true,
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
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px\" name=\"EMPVEMPLOYEE_LEAVEAPPLYDATE\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"申请离职日期\">"+date+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"离职日期")%>',
                field : 'EMPVEMPLOYEE_LEAVEDATE',
                align : 'center',
                visible : false,
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
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px\" name=\"EMPVEMPLOYEE_LEAVEDATE\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"离职日期\">"+date+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"离职类型")%>',
                field : 'EMPVEMPLOYEE_LEAVETYPE',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"EMPVEMPLOYEE_LEAVETYPE\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"离职类型\" data-source=\"${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode1.action?deleteMark=EMP_LEAVETYPE&realValue="+value+"+\"></a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"离职原因")%>',
                field : 'EMPVEMPLOYEE_LEAVEREASON',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"EMPVEMPLOYEE_LEAVEREASON\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"离职原因\" data-source=\"${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode1.action?deleteMark=EMP_LEAVEREASON&realValue="+value+"+\"></a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"是否离职黑名单")%>',
                field : 'EMPVEMPLOYEE_ISBLACKLIST',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                    	  return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"EMPVEMPLOYEE_ISBLACKLIST\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"是否离职黑名单\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"国籍")%>',
                field : 'EMPVEMPLOYEE_COUNTRY',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"EMPVEMPLOYEE_COUNTRY\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"国籍\" data-source=\"${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode1.action?deleteMark=emp_COUNTRY&realValue="+value+"+\"></a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"民族")%>',
                field : 'EMPVEMPLOYEE_NATION',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"EMPVEMPLOYEE_NATION\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"民族\" data-source=\"${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode1.action?deleteMark=EMP_ION&realValue="+value+"+\"></a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"籍贯")%>',
                field : 'EMPVEMPLOYEE_ORIGIN',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"EMPVEMPLOYEE_ORIGIN\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"籍贯\" data-source=\"${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode1.action?deleteMark=emp_placeOrigin&realValue="+value+"+\"></a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"证件类型")%>',
                field : 'EMPVEMPLOYEE_CERTTYPE',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"EMPVEMPLOYEE_CERTTYPE\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"证件类型\" data-source=\"${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode1.action?deleteMark=emp_DOCTTYPE&realValue="+value+"+\"></a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"证件号码")%>',
                field : 'EMPVEMPLOYEE_CERTNO',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                    	  return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"EMPVEMPLOYEE_CERTNO\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"证件号码\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"性别")%>',
                field : 'EMPVEMPLOYEE_GENDER',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"EMPVEMPLOYEE_GENDER\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"性别\" data-source=\"${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode1.action?deleteMark=emp_SEX&realValue="+value+"+\"></a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"出生日期")%>',
                field : 'EMPVEMPLOYEE_BIRTHDAY',
                align : 'center',
                visible : true,
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
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px\" name=\"EMPVEMPLOYEE_BIRTHDAY\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"出生日期\">"+date+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"出生地")%>',
                field : 'EMPVEMPLOYEE_BIRTHDAYPLACE',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                    	  return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"EMPVEMPLOYEE_BIRTHDAYPLACE\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"出生地\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"家庭住址")%>',
                field : 'EMPVEMPLOYEE_HOMEADDRESS',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                    	  return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"EMPVEMPLOYEE_HOMEADDRESS\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"家庭住址\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"户口性质")%>',
                field : 'EMPVEMPLOYEE_RESIDENTTYPE',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"EMPVEMPLOYEE_RESIDENTTYPE\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"户口性质\" data-source=\"${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode1.action?deleteMark=emp_HOUSETYPE&realValue="+value+"+\"></a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"户口所在地")%>',
                field : 'EMPVEMPLOYEE_RESIDENTADDRESS',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                    	  return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"EMPVEMPLOYEE_RESIDENTADDRESS\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"户口所在地\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"工作邮箱")%>',
                field : 'EMPVEMPLOYEE_WORKEMAIL',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                    	  return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"EMPVEMPLOYEE_WORKEMAIL\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"工作邮箱\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"办公电话")%>',
                field : 'EMPVEMPLOYEE_WORKPHONE',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                    	  return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"EMPVEMPLOYEE_WORKPHONE\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"办公电话\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"个人邮箱")%>',
                field : 'EMPVEMPLOYEE_PESEMAIL',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                    	  return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"EMPVEMPLOYEE_PESEMAIL\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"个人邮箱\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"联系电话")%>',
                field : 'EMPVEMPLOYEE_PESPHONE',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                    	  return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"EMPVEMPLOYEE_PESPHONE\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"联系电话\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"手机号码")%>',
                field : 'EMPVEMPLOYEE_MOBILE',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                    	  return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"EMPVEMPLOYEE_MOBILE\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"手机号码\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"婚姻状况")%>',
                field : 'EMPVEMPLOYEE_MARRIAGESTATUS',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"EMPVEMPLOYEE_MARRIAGESTATUS\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"婚姻状况\" data-source=\"${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode1.action?deleteMark=emp_MARYSTATUS&realValue="+value+"+\"></a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"健康状况")%>',
                field : 'EMPVEMPLOYEE_HEALTHSTATUS',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"EMPVEMPLOYEE_HEALTHSTATUS\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"健康状况\" data-source=\"${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode1.action?deleteMark=EMP_HEALTHSTATUS&realValue="+value+"+\"></a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"血型")%>',
                field : 'EMPVEMPLOYEE_BLOODTYPE',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"EMPVEMPLOYEE_BLOODTYPE\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"血型\" data-source=\"${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode1.action?deleteMark=EMP_BLOODTYPE&realValue="+value+"+\"></a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"生育状况")%>',
                field : 'EMPVEMPLOYEE_CHILDSTATUS',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                    	  return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"EMPVEMPLOYEE_CHILDSTATUS\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"生育状况\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"子女个数")%>',
                field : 'EMPVEMPLOYEE_CHILDS',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                    	  return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"EMPVEMPLOYEE_CHILDS\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"子女个数\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"QQ")%>',
                field : 'EMPVEMPLOYEE_QQ',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                    	  return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"EMPVEMPLOYEE_QQ\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"QQ\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"微信")%>',
                field : 'EMPVEMPLOYEE_WECHART',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                    	  return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"EMPVEMPLOYEE_WECHART\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"微信\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"司龄")%>',
                field : 'EMPVEMPLOYEE_COMPYEARS',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                    	  return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"EMPVEMPLOYEE_COMPYEARS\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"司龄\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"工龄")%>',
                field : 'EMPVEMPLOYEE_WORKYEARS',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                    	  return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"EMPVEMPLOYEE_WORKYEARS\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"工龄\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"年龄")%>',
                field : 'EMPVEMPLOYEE_YEAROLDS',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                    	  return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"EMPVEMPLOYEE_YEAROLDS\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"年龄\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"合同编号")%>',
                field : 'EMPVEMPLOYEE_CONNO',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                    	  return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"EMPVEMPLOYEE_CONNO\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"合同编号\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"合同签约次数")%>',
                field : 'EMPVEMPLOYEE_CONTIMES',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                    	  return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"EMPVEMPLOYEE_CONTIMES\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"合同签约次数\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"合同签约单位")%>',
                field : 'EMPVEMPLOYEE_CONTRACTUNIT',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"EMPVEMPLOYEE_CONTRACTUNIT\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"合同签约单位\" data-source=\"${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode1.action?deleteMark=contactUnit&realValue="+value+"+\"></a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"合同类型")%>',
                field : 'EMPVEMPLOYEE_CONTRACTTYPE',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"EMPVEMPLOYEE_CONTRACTTYPE\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"合同类型\" data-source=\"${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode1.action?deleteMark=EMP_CONTRACTTYPE&realValue="+value+"+\"></a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"合同性质")%>',
                field : 'EMPVEMPLOYEE_CONTRACTKIND',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"EMPVEMPLOYEE_CONTRACTKIND\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"合同性质\" data-source=\"${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode1.action?deleteMark=EMP_CONTRACTKIND&realValue="+value+"+\"></a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"合同开始时间")%>',
                field : 'EMPVEMPLOYEE_CONBEGINDATE',
                align : 'center',
                visible : true,
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
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px\" name=\"EMPVEMPLOYEE_CONBEGINDATE\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"合同开始时间\">"+date+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"合同期限（月）")%>',
                field : 'EMPVEMPLOYEE_CONMONTHS',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                    	  return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"EMPVEMPLOYEE_CONMONTHS\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"合同期限（月）\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"合同结束时间")%>',
                field : 'EMPVEMPLOYEE_CONENDDATE',
                align : 'center',
                visible : true,
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
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px\" name=\"EMPVEMPLOYEE_CONENDDATE\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"合同结束时间\">"+date+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"合同状态")%>',
                field : 'EMPVEMPLOYEE_CONSTATUS',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                    	  return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"EMPVEMPLOYEE_CONSTATUS\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"合同状态\">"+value+"</a>";
                }
            },
            ],
            onClickRow: function (row, $element) {
                curRow = row;
            },
		onLoadSuccess: function (aa, bb, cc) {
                $("#emp_emp_list_List a").editable({
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
        	editemp_emp_list_click_2131('isView',row);  
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
function refresh_emp_emp_list() { 
    $('#emp_emp_list_List').bootstrapTable('refresh'); 
}

function editemp_emp_list_click_2131(isView,data){
	var selects = $("#emp_emp_list_List").bootstrapTable('getSelections');;
	if(selects!=null && selects.length>0){
		select = selects[0];;
	title='<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"在职员工预览")%>';
	}else if(data!=null&&isView!=null){
	select = data;
	title='<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"预览")%>';
	}else {
		alert('<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"请选择一行数据")%>');return ;
	}
	if(1==1){
		var url='/myehr/form/toForm.action?formId=2592&isInit=true&EMPVEMPLOYEE_EMPID='+select.EMPVEMPLOYEE_EMPID+'&&&isView='+isView+'';
	}else{
		var url='/myehr/form/toForm.action?formId=2592&isInit=true&EMPVEMPLOYEE_EMPID='+EMPVEMPLOYEE_EMPID+'&isView='+isView+'';
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
			    refresh_emp_emp_list();
		}
	});
}

function grid_emp_emp_list_fun(pageReqeust){
	var _filterdata={};
	if(document.getElementById('grid_emp_emp_list_filter')){
	if($("[id='FILTER_EMP_V_EMPLOYEE.EMPVEMPLOYEE_EMPCODE_2131']").attr('multiSelect')){
		var val = "";
		var arr = $("[id='FILTER_EMP_V_EMPLOYEE.EMPVEMPLOYEE_EMPCODE_2131']").val();
		if(arr==null){
		}else{
			for(var i=0;i<arr.length;i++){
				val+=arr[i]+',';
			}
			val = val.substring(0,val.length-1);
		}
		var EMPVEMPLOYEE_EMPCODE=val;
	}else if(($("[id='FILTER_EMP_V_EMPLOYEE.EMPVEMPLOYEE_EMPCODE_2131']").attr('styleType')=="select")||($("[id='FILTER_EMP_V_EMPLOYEE.EMPVEMPLOYEE_EMPCODE_2131']").attr('styleType')=="dateTime")){
			var EMPVEMPLOYEE_EMPCODE=$("[id='FILTER_EMP_V_EMPLOYEE.EMPVEMPLOYEE_EMPCODE_2131']").val();
		}else{
				var EMPVEMPLOYEE_EMPCODE=$("[id='FILTER_2131']").val();
		}
	if($("[id='FILTER_EMP_V_EMPLOYEE.EMPVEMPLOYEE_EMPSTATUS_2131']").attr('multiSelect')){
		var val = "";
		var arr = $("[id='FILTER_EMP_V_EMPLOYEE.EMPVEMPLOYEE_EMPSTATUS_2131']").val();
		if(arr==null){
		}else{
			for(var i=0;i<arr.length;i++){
				val+=arr[i]+',';
			}
			val = val.substring(0,val.length-1);
		}
		var EMPVEMPLOYEE_EMPSTATUS=val;
	}else if(($("[id='FILTER_EMP_V_EMPLOYEE.EMPVEMPLOYEE_EMPSTATUS_2131']").attr('styleType')=="select")||($("[id='FILTER_EMP_V_EMPLOYEE.EMPVEMPLOYEE_EMPSTATUS_2131']").attr('styleType')=="dateTime")){
			var EMPVEMPLOYEE_EMPSTATUS=$("[id='FILTER_EMP_V_EMPLOYEE.EMPVEMPLOYEE_EMPSTATUS_2131']").val();
		}else{
				var EMPVEMPLOYEE_EMPSTATUS=$("[id='FILTER_2131']").val();
		}
	if($("[id='FILTER_EMP_V_EMPLOYEE.EMPVEMPLOYEE_CNAME_2131']").attr('multiSelect')){
		var val = "";
		var arr = $("[id='FILTER_EMP_V_EMPLOYEE.EMPVEMPLOYEE_CNAME_2131']").val();
		if(arr==null){
		}else{
			for(var i=0;i<arr.length;i++){
				val+=arr[i]+',';
			}
			val = val.substring(0,val.length-1);
		}
		var EMPVEMPLOYEE_CNAME=val;
	}else if(($("[id='FILTER_EMP_V_EMPLOYEE.EMPVEMPLOYEE_CNAME_2131']").attr('styleType')=="select")||($("[id='FILTER_EMP_V_EMPLOYEE.EMPVEMPLOYEE_CNAME_2131']").attr('styleType')=="dateTime")){
			var EMPVEMPLOYEE_CNAME=$("[id='FILTER_EMP_V_EMPLOYEE.EMPVEMPLOYEE_CNAME_2131']").val();
		}else{
				var EMPVEMPLOYEE_CNAME=$("[id='FILTER_2131']").val();
		}
		_filterdata={EMPCODE:EMPVEMPLOYEE_EMPCODE,EMPSTATUS:EMPVEMPLOYEE_EMPSTATUS,CNAME:EMPVEMPLOYEE_CNAME};
	}
	var paramsMap = {};
	var requestParam={};
	if('${param.ORGVORGANIZATION_ORGCODE}'==''){
		if(ORGVORGANIZATION_ORGCODE==undefined){
			requestParam = {ORGVORGANIZATION_ORGCODE:'${param.ORGVORGANIZATION_ORGCODE}'};
		}else{
			requestParam = {ORGVORGANIZATION_ORGCODE:ORGVORGANIZATION_ORGCODE+""};
		}
	}else{
		requestParam = {ORGVORGANIZATION_ORGCODE:'${param.ORGVORGANIZATION_ORGCODE}'};
	}
	pageReqeust.containerParam=containerParam;
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.userIds='${param.empIds}';
	pageReqeust.formId=_formId_2131;
	pageReqeust.isView=null;
	if(heightGadedata!=null&&heightGadedata!=undefined){
		pageReqeust.heightGrade = heightGadedata;
	}
	return JSON.stringify(pageReqeust);
}
function grid_emp_emp_list_fun11_2131(){
	$('#emp_emp_list_List').bootstrapTable('refresh');
}

function grid_emp_emp_list_HeighQuery_2131() {
	layer.open({
		type: 2,
		showMaxButton: true,
		title:"<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"高级查询设置")%>" ,
		area: ['855', '500'],
		maxmin: true,
		content:'/myehr/jsp/form/button/heightGrade.jsp?formFunction=grid_emp_emp_list_fun11_2131&formDefId=2131&formDefLayout=2',
		success:function(layero,index){
			},
			end:function(){
		}
		});
}
	
</script>
</body>
</html>
