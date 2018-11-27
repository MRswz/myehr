<%@ page language="java" import="java.util.*" import="com.myehr.common.util.LangUtil" pageEncoding="UTF-8"%>
<%@ include file="/common/common.jsp" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<body>
<div class="container-fluid">
	<div style="margin-top:5px;">
<div class="input-group">
    <div id="grid_emp_newEntry_list_filter">
        <table class="cbs-table" style="margin-bottom:5px">
             <tr>
				<td style="padding-left:10px;"  width="100"  ><lable><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"用工形式")%>: </lable></td>
				<td style="padding-left:10px;"  align="left"  >						<select id="FILTER_EMP_EMPLOYEE.EMP_USE_TYPE_2779" title="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"用工形式")%>" name="EMP_USE_TYPE"  class="form-control" emptyText="请选择..."  style="" textField="dictName" valueField="dictID" DictName="EmploymentForm" nullItemText="请选择..." dataField="dictList"></select></td>
				<td style="padding-left:10px;"  width="100"  ><lable><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"机构层级")%>: </lable></td>
				<td style="padding-left:10px;"  align="left"  >						<select id="FILTER_VIR.LEVE_2779" title="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"机构层级")%>" name="LEVE"  class="form-control" emptyText="请选择..."  style="" textField="dictName" valueField="dictID" DictName="SYS_COMPANY_TIER" nullItemText="请选择..." dataField="dictList"></select></td>
				<td style="padding-left:10px;"  width="100"  ><lable><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"机构级别")%>: </lable></td>
				<td style="padding-left:10px;"  align="left"  >						<select id="FILTER_VIR.HIE_2779" title="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"机构级别")%>" name="HIE"  class="form-control" emptyText="请选择..."  style="" textField="dictName" valueField="dictID" DictName="SYS_COMPANY_LEVEL" nullItemText="请选择..." dataField="dictList"></select></td>
                <td style="padding-left:10px;" align="left" ><button class="btn btn-primary"  onclick="grid_emp_newEntry_list_fun11()"><i class="glyphicon glyphicon-search"></i> 查询    </button></td>
            </tr>
        </table>
    </div>
</div>
		<div style="margin:0 auto; display:inline-block;height: 35px;">
			<div style="margin-right:10px;display:inline-block">
			    <input type="button" id="addemp_newEntry_list"  class="btn btn-primary" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"入职新增")%> onclick="addemp_newEntry_list_click_2779()"/>
			</div>
			<div style="margin-right:10px;display:inline-block">
			    <input type="button" id="editemp_newEntry_list"  class="btn btn-primary" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"信息维护")%> onclick="editemp_newEntry_list_click_2779()"/>
			</div>
			<div style="margin-right:10px;display:inline-block">
			    <input type="button" id="edit3emp_newEntry_list"  class="btn btn-primary" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"试用期转正")%> onclick="edit3emp_newEntry_list_click_2779()"/>
			</div>
			<div style="margin-right:10px;display:inline-block">
			    <input type="button" id="edit2emp_newEntry_list"  class="btn btn-primary" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"人员调动")%> onclick="edit2emp_newEntry_list_click_2779()"/>
			</div>
			<div style="margin-right:10px;display:inline-block">
			    <input type="button" id="edit4emp_newEntry_list"  class="btn btn-primary" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"发起离职")%> onclick="edit4emp_newEntry_list_click_2779()"/>
			</div>
			<div style="margin-right:10px;display:inline-block">
			    <input type="button" id="edit5emp_newEntry_list"  class="btn btn-primary" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"离职处理")%> onclick="edit5emp_newEntry_list_click_2779()"/>
			</div>
			<div style="margin-right:10px;display:inline-block">
			    <input type="button" id="edit6emp_newEntry_list"  class="btn btn-primary" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"人员减员")%> onclick="edit6emp_newEntry_list_click_2779()"/>
			</div>
			<div style="margin-right:10px;display:inline-block">
			    <input type="button" id="importemp_newEntry_list"  class="btn btn-primary" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"导入")%> onclick="importemp_newEntry_list_click_2779()"/>
			</div>
			<div style="margin-right:10px;display:inline-block">
			    <input type="button" id="exportemp_newEntry_list"  class="btn btn-primary" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"导出")%> onclick="exportemp_newEntry_list_click_2779()"/>
			</div>
			<div style="margin-right:10px;display:inline-block">
			    <input type="button" id="edit7emp_newEntry_list"  class="btn btn-primary" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"人员简历预览")%> onclick="edit7emp_newEntry_list_click_2779()"/>
			</div>
		</div>
</div>
<table id="emp_newEntry_list_List">
</table>
</div>
<script>
$(function() {
    querys_2779();
    initDict();
    initDate();
});
	var _formId_2779='2779';
    function querys_2779() {
        $("#emp_newEntry_list_List").bootstrapTable({
            url :'${pageContext.request.contextPath }/form/cardformInitData.action',
            contentType: 'application/json;charset=utf-8',
            dataType:'json',
            method:'post',
            undefinedText : '-',
            pagination : true,
            striped : true,
            queryParams : grid_emp_newEntry_list_fun,
            cache : false,
            pageSize : 10, 
            pageList : [10,20,50,10000], 
            toolbar : "#toolbar",
            showColumns : true,
            showExport : true,
            clickToSelect: true,
            showRefresh : true,
            sidePagination : "server",
            columns : [{
                field : 'state',
                checkbox : true,
                align : 'center',
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
                    return "<a style=\"font-size:14px;text-decoration:none;color:black;width:50px;\" name=\"defaultXH\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"序号\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"机构ID")%>',
                field : 'ORG_ID',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                    	  return "<a  class=\"eli wpx\" style=\"font-size:14px;text-decoration:none;color:black;width:200px;\" name=\"ORG_ID\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"机构ID\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"机构编码")%>',
                field : 'ORG_CODE',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                    	  return "<a  class=\"eli wpx\" style=\"font-size:14px;text-decoration:none;color:black;width:200px;\" name=\"ORG_CODE\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"机构编码\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"机构序列")%>',
                field : 'ORG_SEQ',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                    	  return "<a  class=\"eli wpx\" style=\"font-size:14px;text-decoration:none;color:black;width:200px;\" name=\"ORG_SEQ\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"机构序列\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"机构排序")%>',
                field : 'ORG_ORDER',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                    	  return "<a  class=\"eli wpx\" style=\"font-size:14px;text-decoration:none;color:black;width:200px;\" name=\"ORG_ORDER\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"机构排序\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"人员ID")%>',
                field : 'EMP_ID',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                    	  return "<a  class=\"eli wpx\" style=\"font-size:14px;text-decoration:none;color:black;width:200px;\" name=\"EMP_ID\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"人员ID\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"工号")%>',
                field : 'EMP_CODE',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                    	  return "<a  class=\"eli wpx\" style=\"font-size:14px;text-decoration:none;color:black;width:80px;\" name=\"EMP_CODE\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"工号\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"姓名")%>',
                field : 'EMP_CHINA_NAME',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                    	  return "<a  class=\"eli wpx\" style=\"font-size:14px;text-decoration:none;color:black;width:80px;\" name=\"EMP_CHINA_NAME\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"姓名\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"任职兼职")%>',
                field : 'RJZ',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                    	  return "<a  class=\"eli wpx\" style=\"font-size:14px;text-decoration:none;color:black;width:90px;\" name=\"RJZ\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"任职兼职\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"性别")%>',
                field : 'EMP_SEX',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined || value==""){
                        value='-';
                    }
                    return "<a class=\"eli wpx\" style=\"font-size:14px;text-decoration:none;color:black;width:60px;\" name=\"EMP_SEX\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"性别\" data-source=\"${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode1.action?deleteMark=SYS_GENDER\"></a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"所属单位")%>',
                field : 'EMP_COMP_ID',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                    	  return "<a  class=\"eli wpx\" style=\"font-size:14px;text-decoration:none;color:black;width:200px;\" name=\"EMP_COMP_ID\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"所属单位\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"出生日期")%>',
                field : 'EMP_BIRTHDAY',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    var date = "-";
                    if(value!=null){
                        date = value;
                    }
                    return "<a class=\"eli wpx\" style=\"font-size:14px;text-decoration:none;color:black;width:100px\" name=\"EMP_BIRTHDAY\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"出生日期\">"+date+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"上级领导")%>',
                field : 'EMP_SUPER_LEADER',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                    	  return "<a  class=\"eli wpx\" style=\"font-size:14px;text-decoration:none;color:black;width:200px;\" name=\"EMP_SUPER_LEADER\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"上级领导\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"担任岗位时间")%>',
                field : 'EMP_POST_CHANGE_TIME',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    var date = "-";
                    if(value!=null){
                        date = value;
                    }
                    return "<a class=\"eli wpx\" style=\"font-size:14px;text-decoration:none;color:black;width:200px\" name=\"EMP_POST_CHANGE_TIME\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"担任岗位时间\">"+date+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"行内工作年限")%>',
                field : 'EMP_WORK_LINE',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                    	  return "<a  class=\"eli wpx\" style=\"font-size:14px;text-decoration:none;color:black;width:200px;\" name=\"EMP_WORK_LINE\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"行内工作年限\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"部门")%>',
                field : 'ORG_ABBREVIATION',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                    	  return "<a  class=\"eli wpx\" style=\"font-size:14px;text-decoration:none;color:black;width:180px;\" name=\"ORG_ABBREVIATION\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"部门\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"部门ID")%>',
                field : 'EMP_DEPT_ID',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                    	  return "<a  class=\"eli wpx\" style=\"font-size:14px;text-decoration:none;color:black;width:200px;\" name=\"EMP_DEPT_ID\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"部门ID\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"曾用名")%>',
                field : 'EMP_ONCE_NAME',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                    	  return "<a  class=\"eli wpx\" style=\"font-size:14px;text-decoration:none;color:black;width:200px;\" name=\"EMP_ONCE_NAME\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"曾用名\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"英文名")%>',
                field : 'EMP_ENGLISH_NAME',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                    	  return "<a  class=\"eli wpx\" style=\"font-size:14px;text-decoration:none;color:black;width:200px;\" name=\"EMP_ENGLISH_NAME\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"英文名\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"岗位ID")%>',
                field : 'EMP_POST_ID',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                    	  return "<a  class=\"eli wpx\" style=\"font-size:14px;text-decoration:none;color:black;width:200px;\" name=\"EMP_POST_ID\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"岗位ID\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"民族")%>',
                field : 'EMP_NATIONALITY',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined || value==""){
                        value='-';
                    }
                    return "<a class=\"eli wpx\" style=\"font-size:14px;text-decoration:none;color:black;width:200px;\" name=\"EMP_NATIONALITY\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"民族\" data-source=\"${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode1.action?deleteMark=nationality\"></a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"岗位")%>',
                field : 'POST_NAME',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                    	  return "<a  class=\"eli wpx\" style=\"font-size:14px;text-decoration:none;color:black;width:100px;\" name=\"POST_NAME\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"岗位\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"员工状态")%>',
                field : 'EMP_STATUS',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined || value==""){
                        value='-';
                    }
                    return "<a class=\"eli wpx\" style=\"font-size:14px;text-decoration:none;color:black;width:100px;\" name=\"EMP_STATUS\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"员工状态\" data-source=\"${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode1.action?deleteMark=EmployeeStatus\"></a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"政治面貌")%>',
                field : 'EMP_POLITICAL',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined || value==""){
                        value='-';
                    }
                    return "<a class=\"eli wpx\" style=\"font-size:14px;text-decoration:none;color:black;width:200px;\" name=\"EMP_POLITICAL\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"政治面貌\" data-source=\"${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode1.action?deleteMark=political_status\"></a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"员工层级")%>',
                field : 'EMP_HIERARCHY',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined || value==""){
                        value='-';
                    }
                    return "<a class=\"eli wpx\" style=\"font-size:14px;text-decoration:none;color:black;width:100px;\" name=\"EMP_HIERARCHY\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"员工层级\" data-source=\"${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode1.action?deleteMark=EmployeeHierarchy\"></a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"出生省市")%>',
                field : 'EMP_PROVINCE',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                    	  return "<a  class=\"eli wpx\" style=\"font-size:14px;text-decoration:none;color:black;width:200px;\" name=\"EMP_PROVINCE\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"出生省市\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"用工形式")%>',
                field : 'EMP_USE_TYPE',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined || value==""){
                        value='-';
                    }
                    return "<a class=\"eli wpx\" style=\"font-size:14px;text-decoration:none;color:black;width:100px;\" name=\"EMP_USE_TYPE\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"用工形式\" data-source=\"${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode1.action?deleteMark=EmploymentForm\"></a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"年龄")%>',
                field : 'EMP_AGE',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                    	  return "<a  class=\"eli wpx\" style=\"font-size:14px;text-decoration:none;color:black;width:200px;\" name=\"EMP_AGE\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"年龄\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"籍贯")%>',
                field : 'EMP_REG_ORIGIN',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                    	  return "<a  class=\"eli wpx\" style=\"font-size:14px;text-decoration:none;color:black;width:200px;\" name=\"EMP_REG_ORIGIN\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"籍贯\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"户籍地")%>',
                field : 'EMP_ORIGIN',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                    	  return "<a  class=\"eli wpx\" style=\"font-size:14px;text-decoration:none;color:black;width:200px;\" name=\"EMP_ORIGIN\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"户籍地\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"户口性质")%>',
                field : 'EMP_HUKOU',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined || value==""){
                        value='-';
                    }
                    return "<a class=\"eli wpx\" style=\"font-size:14px;text-decoration:none;color:black;width:200px;\" name=\"EMP_HUKOU\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"户口性质\" data-source=\"${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode1.action?deleteMark=AccountProperties\"></a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"证件类型")%>',
                field : 'EMP_NO_TYPE',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined || value==""){
                        value='-';
                    }
                    return "<a class=\"eli wpx\" style=\"font-size:14px;text-decoration:none;color:black;width:200px;\" name=\"EMP_NO_TYPE\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"证件类型\" data-source=\"${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode1.action?deleteMark=SYS_CARDTYPE\"></a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"证件号码")%>',
                field : 'EMP_NO_CODE',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                    	  return "<a  class=\"eli wpx\" style=\"font-size:14px;text-decoration:none;color:black;width:200px;\" name=\"EMP_NO_CODE\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"证件号码\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"专业技术职务")%>',
                field : 'EMP_POST',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                    	  return "<a  class=\"eli wpx\" style=\"font-size:14px;text-decoration:none;color:black;width:200px;\" name=\"EMP_POST\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"专业技术职务\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"现任专业技术职务日期")%>',
                field : 'EMP_WORK_TIME',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                    	  return "<a  class=\"eli wpx\" style=\"font-size:14px;text-decoration:none;color:black;width:200px;\" name=\"EMP_WORK_TIME\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"现任专业技术职务日期\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"现任层级日期")%>',
                field : 'EMP_POST_TIME',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    var date = "-";
                    if(value!=null){
                        date = value;
                    }
                    return "<a class=\"eli wpx\" style=\"font-size:14px;text-decoration:none;color:black;width:200px\" name=\"EMP_POST_TIME\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"现任层级日期\">"+date+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"岗位类别")%>',
                field : 'EMP_POST_ODER',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined || value==""){
                        value='-';
                    }
                    return "<a class=\"eli wpx\" style=\"font-size:14px;text-decoration:none;color:black;width:200px;\" name=\"EMP_POST_ODER\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"岗位类别\" data-source=\"${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode1.action?deleteMark=SYS_POST_ORDE\"></a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"手机号")%>',
                field : 'EMP_PHONE',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                    	  return "<a  class=\"eli wpx\" style=\"font-size:14px;text-decoration:none;color:black;width:200px;\" name=\"EMP_PHONE\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"手机号\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"行内邮箱")%>',
                field : 'EMP_TRADEE_MAIL',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                    	  return "<a  class=\"eli wpx\" style=\"font-size:14px;text-decoration:none;color:black;width:200px;\" name=\"EMP_TRADEE_MAIL\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"行内邮箱\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"办公电话")%>',
                field : 'EMP_OFFICE_PHONE',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                    	  return "<a  class=\"eli wpx\" style=\"font-size:14px;text-decoration:none;color:black;width:200px;\" name=\"EMP_OFFICE_PHONE\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"办公电话\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"参加工作时间")%>',
                field : 'EMP_WORK_EMP',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    var date = "-";
                    if(value!=null){
                        date = value;
                    }
                    return "<a class=\"eli wpx\" style=\"font-size:14px;text-decoration:none;color:black;width:200px\" name=\"EMP_WORK_EMP\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"参加工作时间\">"+date+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"中断工龄年")%>',
                field : 'EMP_BREAK_YEAR',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                    	  return "<a  class=\"eli wpx\" style=\"font-size:14px;text-decoration:none;color:black;width:200px;\" name=\"EMP_BREAK_YEAR\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"中断工龄年\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"中断工龄月")%>',
                field : 'EMP_BREAK_MON',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                    	  return "<a  class=\"eli wpx\" style=\"font-size:14px;text-decoration:none;color:black;width:200px;\" name=\"EMP_BREAK_MON\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"中断工龄月\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"累计工龄年")%>',
                field : 'EMP_ADD_YEAR',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                    	  return "<a  class=\"eli wpx\" style=\"font-size:14px;text-decoration:none;color:black;width:200px;\" name=\"EMP_ADD_YEAR\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"累计工龄年\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"累计工龄月")%>',
                field : 'EMP_ADD_MON',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                    	  return "<a  class=\"eli wpx\" style=\"font-size:14px;text-decoration:none;color:black;width:200px;\" name=\"EMP_ADD_MON\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"累计工龄月\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"离职时间")%>',
                field : 'EMP_LEAVE_TIME',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    var date = "-";
                    if(value!=null){
                        date = value;
                    }
                    return "<a class=\"eli wpx\" style=\"font-size:14px;text-decoration:none;color:black;width:200px\" name=\"EMP_LEAVE_TIME\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"离职时间\">"+date+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"入行日期")%>',
                field : 'EMP_JOIN_DATE',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    var date = "-";
                    if(value!=null){
                        date = value;
                    }
                    return "<a class=\"eli wpx\" style=\"font-size:14px;text-decoration:none;color:black;width:200px\" name=\"EMP_JOIN_DATE\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"入行日期\">"+date+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"来本单位工龄")%>',
                field : 'EMP_ORG_EMP',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                    	  return "<a  class=\"eli wpx\" style=\"font-size:14px;text-decoration:none;color:black;width:200px;\" name=\"EMP_ORG_EMP\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"来本单位工龄\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"入党时间")%>',
                field : 'EMP_JOIN_TIME',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    var date = "-";
                    if(value!=null){
                        date = value;
                    }
                    return "<a class=\"eli wpx\" style=\"font-size:14px;text-decoration:none;color:black;width:200px\" name=\"EMP_JOIN_TIME\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"入党时间\">"+date+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"招聘渠道")%>',
                field : 'EMP_RECRUIT_WAY',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                    	  return "<a  class=\"eli wpx\" style=\"font-size:14px;text-decoration:none;color:black;width:200px;\" name=\"EMP_RECRUIT_WAY\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"招聘渠道\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"身高")%>',
                field : 'EMP_HEIGHT',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                    	  return "<a  class=\"eli wpx\" style=\"font-size:14px;text-decoration:none;color:black;width:200px;\" name=\"EMP_HEIGHT\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"身高\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"入职时间")%>',
                field : 'EMP_TIME',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    var date = "-";
                    if(value!=null){
                        date = value;
                    }
                    return "<a class=\"eli wpx\" style=\"font-size:14px;text-decoration:none;color:black;width:200px\" name=\"EMP_TIME\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"入职时间\">"+date+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"体重")%>',
                field : 'EMP_WEIGHT',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                    	  return "<a  class=\"eli wpx\" style=\"font-size:14px;text-decoration:none;color:black;width:200px;\" name=\"EMP_WEIGHT\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"体重\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"血型")%>',
                field : 'EMP_BLOOD',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined || value==""){
                        value='-';
                    }
                    return "<a class=\"eli wpx\" style=\"font-size:14px;text-decoration:none;color:black;width:200px;\" name=\"EMP_BLOOD\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"血型\" data-source=\"${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode1.action?deleteMark=BloodType\"></a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"转正日期")%>',
                field : 'EMP_CON_EMP',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    var date = "-";
                    if(value!=null){
                        date = value;
                    }
                    return "<a class=\"eli wpx\" style=\"font-size:14px;text-decoration:none;color:black;width:200px\" name=\"EMP_CON_EMP\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"转正日期\">"+date+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"机构层级")%>',
                field : 'LEVE',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined || value==""){
                        value='-';
                    }
                    return "<a class=\"eli wpx\" style=\"font-size:14px;text-decoration:none;color:black;width:200px;\" name=\"LEVE\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"机构层级\" data-source=\"${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode1.action?deleteMark=SYS_COMPANY_TIER\"></a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"紧急联系人电话")%>',
                field : 'EMP_EMERG_TEL',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                    	  return "<a  class=\"eli wpx\" style=\"font-size:14px;text-decoration:none;color:black;width:200px;\" name=\"EMP_EMERG_TEL\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"紧急联系人电话\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"机构级别")%>',
                field : 'HIE',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined || value==""){
                        value='-';
                    }
                    return "<a class=\"eli wpx\" style=\"font-size:14px;text-decoration:none;color:black;width:200px;\" name=\"HIE\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"机构级别\" data-source=\"${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode1.action?deleteMark=SYS_COMPANY_LEVEL\"></a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"原工作单位")%>',
                field : 'EMP_LAST_ORG',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                    	  return "<a  class=\"eli wpx\" style=\"font-size:14px;text-decoration:none;color:black;width:200px;\" name=\"EMP_LAST_ORG\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"原工作单位\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"所属公司")%>',
                field : 'ASS',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                    	  return "<a  class=\"eli wpx\" style=\"font-size:14px;text-decoration:none;color:black;width:200px;\" name=\"ASS\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"所属公司\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"紧急联系人")%>',
                field : 'EMP_EMERG_NAME',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                    	  return "<a  class=\"eli wpx\" style=\"font-size:14px;text-decoration:none;color:black;width:200px;\" name=\"EMP_EMERG_NAME\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"紧急联系人\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"家庭电话")%>',
                field : 'EMP_FAMILY_TEL',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                    	  return "<a  class=\"eli wpx\" style=\"font-size:14px;text-decoration:none;color:black;width:200px;\" name=\"EMP_FAMILY_TEL\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"家庭电话\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"上级领导工号")%>',
                field : 'COD',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                    	  return "<a  class=\"eli wpx\" style=\"font-size:14px;text-decoration:none;color:black;width:200px;\" name=\"COD\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"上级领导工号\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"上级领导姓名")%>',
                field : 'AWW',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                    	  return "<a  class=\"eli wpx\" style=\"font-size:14px;text-decoration:none;color:black;width:200px;\" name=\"AWW\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"上级领导姓名\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"个人邮箱")%>',
                field : 'EMP_MAIL_ADDRESS',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                    	  return "<a  class=\"eli wpx\" style=\"font-size:14px;text-decoration:none;color:black;width:200px;\" name=\"EMP_MAIL_ADDRESS\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"个人邮箱\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"档案所在地")%>',
                field : 'EMP_FILE_PLACE',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                    	  return "<a  class=\"eli wpx\" style=\"font-size:14px;text-decoration:none;color:black;width:200px;\" name=\"EMP_FILE_PLACE\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"档案所在地\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"当前住址")%>',
                field : 'EMP_ADDRESS',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                    	  return "<a  class=\"eli wpx\" style=\"font-size:14px;text-decoration:none;color:black;width:200px;\" name=\"EMP_ADDRESS\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"当前住址\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"合同期限类型")%>',
                field : 'EMP_CONT_TERM_TYPE',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined || value==""){
                        value='-';
                    }
                    return "<a class=\"eli wpx\" style=\"font-size:14px;text-decoration:none;color:black;width:200px;\" name=\"EMP_CONT_TERM_TYPE\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"合同期限类型\" data-source=\"${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode1.action?deleteMark=TypeofContractPeriod\"></a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"合同结束日期")%>',
                field : 'EMP_CONT_END_TIME',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    var date = "-";
                    if(value!=null){
                        date = value;
                    }
                    return "<a class=\"eli wpx\" style=\"font-size:14px;text-decoration:none;color:black;width:200px\" name=\"EMP_CONT_END_TIME\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"合同结束日期\">"+date+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"职称")%>',
                field : 'EMP_PRO_TITLE_NAME',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                    	  return "<a  class=\"eli wpx\" style=\"font-size:14px;text-decoration:none;color:black;width:200px;\" name=\"EMP_PRO_TITLE_NAME\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"职称\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"合同签定次数")%>',
                field : 'EMP_CONT_FREQUENCY',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                    	  return "<a  class=\"eli wpx\" style=\"font-size:14px;text-decoration:none;color:black;width:200px;\" name=\"EMP_CONT_FREQUENCY\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"合同签定次数\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"最高学历")%>',
                field : 'EMP_HIGH_EDU',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined || value==""){
                        value='-';
                    }
                    return "<a class=\"eli wpx\" style=\"font-size:14px;text-decoration:none;color:black;width:200px;\" name=\"EMP_HIGH_EDU\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"最高学历\" data-source=\"${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode1.action?deleteMark=HighestEducation\"></a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"毕业院校")%>',
                field : 'EMP_SCHOOL',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                    	  return "<a  class=\"eli wpx\" style=\"font-size:14px;text-decoration:none;color:black;width:200px;\" name=\"EMP_SCHOOL\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"毕业院校\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"毕业时间")%>',
                field : 'EMP_GRAD_TIME',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    var date = "-";
                    if(value!=null){
                        date = value;
                    }
                    return "<a class=\"eli wpx\" style=\"font-size:14px;text-decoration:none;color:black;width:200px\" name=\"EMP_GRAD_TIME\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"毕业时间\">"+date+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"专业")%>',
                field : 'EMP_MAJOR',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                    	  return "<a  class=\"eli wpx\" style=\"font-size:14px;text-decoration:none;color:black;width:200px;\" name=\"EMP_MAJOR\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"专业\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"学历性质")%>',
                field : 'EMP_EDU',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined || value==""){
                        value='-';
                    }
                    return "<a class=\"eli wpx\" style=\"font-size:14px;text-decoration:none;color:black;width:200px;\" name=\"EMP_EDU\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"学历性质\" data-source=\"${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode1.action?deleteMark=EducationalBackground\"></a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"最高学位")%>',
                field : 'EMP_DEGREE',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined || value==""){
                        value='-';
                    }
                    return "<a class=\"eli wpx\" style=\"font-size:14px;text-decoration:none;color:black;width:200px;\" name=\"EMP_DEGREE\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"最高学位\" data-source=\"${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode1.action?deleteMark=HighestDegree\"></a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"合同开始日期")%>',
                field : 'EMP_CONT_START_TIME',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    var date = "-";
                    if(value!=null){
                        date = value;
                    }
                    return "<a class=\"eli wpx\" style=\"font-size:14px;text-decoration:none;color:black;width:200px\" name=\"EMP_CONT_START_TIME\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"合同开始日期\">"+date+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"离职原因")%>',
                field : 'EMP_RESIGN_REASON',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                    	  return "<a  class=\"eli wpx\" style=\"font-size:14px;text-decoration:none;color:black;width:200px;\" name=\"EMP_RESIGN_REASON\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"离职原因\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"婚姻状况")%>',
                field : 'EMP_MARITAL_STATUS',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined || value==""){
                        value='-';
                    }
                    return "<a class=\"eli wpx\" style=\"font-size:14px;text-decoration:none;color:black;width:200px;\" name=\"EMP_MARITAL_STATUS\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"婚姻状况\" data-source=\"${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode1.action?deleteMark=MaritalStatus\"></a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"操作时间")%>',
                field : 'EMP_OPTIME',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    var date = "-";
                    if(value!=null){
                        date = value;
                    }
                    return "<a class=\"eli wpx\" style=\"font-size:14px;text-decoration:none;color:black;width:200px\" name=\"EMP_OPTIME\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"操作时间\">"+date+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"操作者")%>',
                field : 'EMP_OPNAME',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                    	  return "<a  class=\"eli wpx\" style=\"font-size:14px;text-decoration:none;color:black;width:200px;\" name=\"EMP_OPNAME\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"操作者\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"是否调迁")%>',
                field : 'EMP_IS_MOVE',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined || value==""){
                        value='-';
                    }
                    return "<a class=\"eli wpx\" style=\"font-size:14px;text-decoration:none;color:black;width:200px;\" name=\"EMP_IS_MOVE\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"是否调迁\" data-source=\"${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode1.action?deleteMark=SYS_COMMON_YES_NO\"></a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"国籍")%>',
                field : 'EMP_COUNTRY',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined || value==""){
                        value='-';
                    }
                    return "<a class=\"eli wpx\" style=\"font-size:14px;text-decoration:none;color:black;width:200px;\" name=\"EMP_COUNTRY\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"国籍\" data-source=\"${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode1.action?deleteMark=nation\"></a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"删除标示")%>',
                field : 'EMP_DEL',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined || value==""){
                        value='-';
                    }
                    return "<a class=\"eli wpx\" style=\"font-size:14px;text-decoration:none;color:black;width:200px;\" name=\"EMP_DEL\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"删除标示\" data-source=\"${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode1.action?deleteMark=SYS_COMMON_YES_NO\"></a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"工作地")%>',
                field : 'EMP_WORKING_GROUND',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                    	  return "<a  class=\"eli wpx\" style=\"font-size:14px;text-decoration:none;color:black;width:200px;\" name=\"EMP_WORKING_GROUND\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"工作地\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"OAID")%>',
                field : 'EMP_OA_ID',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                    	  return "<a  class=\"eli wpx\" style=\"font-size:14px;text-decoration:none;color:black;width:200px;\" name=\"EMP_OA_ID\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"OAID\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"上级机构")%>',
                field : 'ORG_PARENT_ID',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                    	  return "<a  class=\"eli wpx\" style=\"font-size:14px;text-decoration:none;color:black;width:200px;\" name=\"ORG_PARENT_ID\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"上级机构\">"+value+"</a>";
                }
            },
            ],
            onClickRow: function (row, $element) {
                curRow = row;
            },
		onLoadSuccess: function (aa, bb, cc) {
                $("#emp_newEntry_list_List a").editable({
                    disabled: true,
                    emptytext: "-",
                    url: function (params) {
                        var sName = $(this).attr("name");
                        curRow[sName] = params.value;
                    },
                    type: 'text'
                });
            },
            responseHandler : function(res) {  
                return {  
                    total : res.total,  
                    rows : res.rows  
                };
            }
        });
        window.operateEvents = {  
            'click #remove': function (e, value, row, index) {  
            $.ajax({  
                type: 'POST', 
                data: JSON.stringify(row),  
                url: '${pageContext.request.contextPath }/dictType/removeSysDictType.action',  
                success: function (data) {  
                    alert('<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"删除成功")%>');
                    window.location.href = window.location.href; 
                    $('#emp_newEntry_list_List').bootstrapTable(
                        'remove', {  
                            field: 'Id',  
                            values: [row.Id],  
                        }
                    );  
                    $('#emp_newEntry_list_List').bootstrapTable(
                        'refresh',{
                            url:'${pageContext.request.contextPath }/dictType/findDictTypeList2.action'  
                        }
                    );
                }
            });
        }
    };
}
/** 刷新页面 */ 
function refresh_emp_newEntry_list() { 
    $('#emp_newEntry_list_List').bootstrapTable('refresh'); 
}
/**查询条件与分页数据 */
function queryParams(pageReqeust) {
    pageReqeust.search = $("#search").val();
    pageReqeust.enabled = $("#enabled").val();
    pageReqeust.querys = $("#querys").val();
    pageReqeust.pageNo = this.offset;
    pageReqeust.pageSize = this.pageNumber;
    return pageReqeust;
}
function addemp_newEntry_list_click_2779(){
if('${param.ORG_ABBREVIATION}'=="兴业信托"){
   nui.alert('当前默认为兴业信托下，不能新增人员');return ;  
  };
	if('${param.ORG_ABBREVIATION}'!='' ||'${param.ORG_ID}'!='' ||'${param.ORG_COMP_ID}'!='' ||'${param.ORG_COMP_NAME}'!='' ){
		var url='/myehr/form/toForm.action?formId=1210&ORG_ABBREVIATION=${param.ORG_ABBREVIATION}&ORG_ID=${param.ORG_ID}&ORG_COMP_ID=${param.ORG_COMP_ID}&ORG_COMP_NAME=${param.ORG_COMP_NAME}&';
	}else{
		var url='/myehr/form/toForm.action?formId=1210&ORG_ABBREVIATION='+ORG_ABBREVIATION+'&ORG_ID='+ORG_ID+'&ORG_COMP_ID='+ORG_COMP_ID+'&ORG_COMP_NAME='+ORG_COMP_NAME+'';
	}
	layer.open({
		type: 2,
		title:'<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"入职新增")%>',
		shadeClose: true,
		shade: 0.8,
		offset: ['0px', '0px'],
		area: ['90%', '90%'],
		content: url,
		success:function(layero,index){
		},
		end:function(){
			    refresh_emp_newEntry_list();
		}
	});
}
function editemp_newEntry_list_click_2779(){
var _row =null;
	var _rows = grid_emp_newEntry_list.getSelecteds();
	if(_rows!=null&&_rows.length>0){
		_row = _rows[0];
	}else {
		nui.alert('请选择一行数据');return ;
	}
	nui.open({
		url:nui.context + "/com.dcf.form.toForm.flow?formId=1361&isInit=true&ORG_ABBREVIATION="+_row.ORG_ABBREVIATION+"&&EMP_ID="+_row.EMP_ID+"&&ORG_ID="+_row.ORG_ID+"&&ORG_COMP_ID="+_row.ORG_COMP_ID+"&&ORG_COMP_NAME ="+_row.ORG_COMP_NAME +"&&RJZ="+_row.RJZ+"&",
		showMaxButton: true,
		title:"信息维护" ,
		width:"1300" ,
		height:"90%" ,
		onload:function(){ 
		},
		ondestroy: function (action){
			grid_emp_newEntry_list.reload();
			if(window.parent._loadmstmaindata){;
				window.parent._loadmstmaindata();
				
			};

			if("undefined" != typeof mstTab_activechanged ){
				mstTab_activechanged();
			}
		}
	 });
}
function edit3emp_newEntry_list_click(){
	var _row2 = grid_emp_newEntry_list.getSelecteds();
  if(_row2!=null&&_row2.length>0){
    _row = _row2[0];
    var _row1 = grid_emp_newEntry_list.getSelected();  
         if(_row1.RJZ=="任职"){
          if(_row1.EMP_STATUS==2){                                
            nui.alert('该员工已是正式员工');return ;    
          } else if(_row1.EMP_STATUS==4){                                
            nui.alert('该员工已离职');return ;    
          } else if(_row1.EMP_STATUS==5){                                
            nui.alert('该员工已减员');return ;    
          } else if(_row1.EMP_STATUS==3){                                
            nui.alert('该员工正在离职中');return ;    
          } else if(_row1.EMP_STATUS==6){                                
            nui.alert('该员工为减员恢复人员');return ;    
          }
         } else {
            nui.alert('兼职人员不能修改');return ;
         }                              
  }else {    
            nui.alert('请选择一行数据');return ;
  };
	var newRow={ORG_ID:'',ORG_CODE:'',ORG_SEQ:'${param.ORG_SEQ}',ORG_ORDER:'',EMP_ID:'',EMP_CODE:'',EMP_CHINA_NAME:'',RJZ:'',EMP_SEX:'',EMP_COMP_ID:'',EMP_BIRTHDAY:'',EMP_SUPER_LEADER:'',EMP_POST_CHANGE_TIME:'',EMP_WORK_LINE:'',ORG_ABBREVIATION:'${param.ORG_ABBREVIATION}',EMP_DEPT_ID:'',EMP_ONCE_NAME:'',EMP_ENGLISH_NAME:'',EMP_POST_ID:'',EMP_NATIONALITY:'',POST_NAME:'',EMP_STATUS:'',EMP_POLITICAL:'',EMP_HIERARCHY:'',EMP_PROVINCE:'',EMP_USE_TYPE:'',EMP_AGE:'',EMP_REG_ORIGIN:'',EMP_ORIGIN:'',EMP_HUKOU:'',EMP_NO_TYPE:'',EMP_NO_CODE:'',EMP_POST:'',EMP_WORK_TIME:'',EMP_POST_TIME:'',EMP_POST_ODER:'',EMP_PHONE:'',EMP_TRADEE_MAIL:'',EMP_OFFICE_PHONE:'',EMP_WORK_EMP:'',EMP_BREAK_YEAR:'',EMP_BREAK_MON:'',EMP_ADD_YEAR:'',EMP_ADD_MON:'',EMP_LEAVE_TIME:'',EMP_JOIN_DATE:'',EMP_ORG_EMP:'',EMP_JOIN_TIME:'',EMP_RECRUIT_WAY:'',EMP_HEIGHT:'',EMP_TIME:'',EMP_WEIGHT:'',EMP_BLOOD:'',EMP_CON_EMP:'',LEVE:'',EMP_EMERG_TEL:'',HIE:'',EMP_LAST_ORG:'',ASS:'',EMP_EMERG_NAME:'',EMP_FAMILY_TEL:'',COD:'',AWW:'',EMP_MAIL_ADDRESS:'',EMP_FILE_PLACE:'',EMP_ADDRESS:'',EMP_CONT_TERM_TYPE:'',EMP_CONT_END_TIME:'',EMP_PRO_TITLE_NAME:'',EMP_CONT_FREQUENCY:'',EMP_HIGH_EDU:'',EMP_SCHOOL:'',EMP_GRAD_TIME:'',EMP_MAJOR:'',EMP_EDU:'',EMP_DEGREE:'',EMP_CONT_START_TIME:'',EMP_RESIGN_REASON:'',EMP_MARITAL_STATUS:'',EMP_OPTIME:'',EMP_OPNAME:'',EMP_IS_MOVE:'',EMP_COUNTRY:'',EMP_DEL:'',EMP_WORKING_GROUND:'',EMP_OA_ID:'',ORG_PARENT_ID:''};
	grid_emp_newEntry_list.addRow(newRow);
}
function edit2emp_newEntry_list_click(){
	var _row2 = grid_emp_newEntry_list.getSelecteds();
  if(_row2!=null&&_row2.length>0){
    _row = _row2[0];
    var _row1 = grid_emp_newEntry_list.getSelected();  
         if(_row1.RJZ=="任职"){
          if(_row1.EMP_STATUS==2){                                
            nui.alert('该员工已是正式员工');return ;    
          } else if(_row1.EMP_STATUS==4){                                
            nui.alert('该员工已离职');return ;    
          } else if(_row1.EMP_STATUS==5){                                
            nui.alert('该员工已减员');return ;    
          } else if(_row1.EMP_STATUS==3){                                
            nui.alert('该员工正在离职中');return ;    
          } else if(_row1.EMP_STATUS==6){                                
            nui.alert('该员工为减员恢复人员');return ;    
          }
         } else {
            nui.alert('兼职人员不能修改');return ;
         }                              
  }else {    
            nui.alert('请选择一行数据');return ;
  };
	var newRow={ORG_ID:'',ORG_CODE:'',ORG_SEQ:'${param.ORG_SEQ}',ORG_ORDER:'',EMP_ID:'',EMP_CODE:'',EMP_CHINA_NAME:'',RJZ:'',EMP_SEX:'',EMP_COMP_ID:'',EMP_BIRTHDAY:'',EMP_SUPER_LEADER:'',EMP_POST_CHANGE_TIME:'',EMP_WORK_LINE:'',ORG_ABBREVIATION:'${param.ORG_ABBREVIATION}',EMP_DEPT_ID:'',EMP_ONCE_NAME:'',EMP_ENGLISH_NAME:'',EMP_POST_ID:'',EMP_NATIONALITY:'',POST_NAME:'',EMP_STATUS:'',EMP_POLITICAL:'',EMP_HIERARCHY:'',EMP_PROVINCE:'',EMP_USE_TYPE:'',EMP_AGE:'',EMP_REG_ORIGIN:'',EMP_ORIGIN:'',EMP_HUKOU:'',EMP_NO_TYPE:'',EMP_NO_CODE:'',EMP_POST:'',EMP_WORK_TIME:'',EMP_POST_TIME:'',EMP_POST_ODER:'',EMP_PHONE:'',EMP_TRADEE_MAIL:'',EMP_OFFICE_PHONE:'',EMP_WORK_EMP:'',EMP_BREAK_YEAR:'',EMP_BREAK_MON:'',EMP_ADD_YEAR:'',EMP_ADD_MON:'',EMP_LEAVE_TIME:'',EMP_JOIN_DATE:'',EMP_ORG_EMP:'',EMP_JOIN_TIME:'',EMP_RECRUIT_WAY:'',EMP_HEIGHT:'',EMP_TIME:'',EMP_WEIGHT:'',EMP_BLOOD:'',EMP_CON_EMP:'',LEVE:'',EMP_EMERG_TEL:'',HIE:'',EMP_LAST_ORG:'',ASS:'',EMP_EMERG_NAME:'',EMP_FAMILY_TEL:'',COD:'',AWW:'',EMP_MAIL_ADDRESS:'',EMP_FILE_PLACE:'',EMP_ADDRESS:'',EMP_CONT_TERM_TYPE:'',EMP_CONT_END_TIME:'',EMP_PRO_TITLE_NAME:'',EMP_CONT_FREQUENCY:'',EMP_HIGH_EDU:'',EMP_SCHOOL:'',EMP_GRAD_TIME:'',EMP_MAJOR:'',EMP_EDU:'',EMP_DEGREE:'',EMP_CONT_START_TIME:'',EMP_RESIGN_REASON:'',EMP_MARITAL_STATUS:'',EMP_OPTIME:'',EMP_OPNAME:'',EMP_IS_MOVE:'',EMP_COUNTRY:'',EMP_DEL:'',EMP_WORKING_GROUND:'',EMP_OA_ID:'',ORG_PARENT_ID:''};
	grid_emp_newEntry_list.addRow(newRow);
}
function edit4emp_newEntry_list_click(){
	var _row2 = grid_emp_newEntry_list.getSelecteds();
  if(_row2!=null&&_row2.length>0){
    _row = _row2[0];
    var _row1 = grid_emp_newEntry_list.getSelected();  
         if(_row1.RJZ=="任职"){
          if(_row1.EMP_STATUS==2){                                
            nui.alert('该员工已是正式员工');return ;    
          } else if(_row1.EMP_STATUS==4){                                
            nui.alert('该员工已离职');return ;    
          } else if(_row1.EMP_STATUS==5){                                
            nui.alert('该员工已减员');return ;    
          } else if(_row1.EMP_STATUS==3){                                
            nui.alert('该员工正在离职中');return ;    
          } else if(_row1.EMP_STATUS==6){                                
            nui.alert('该员工为减员恢复人员');return ;    
          }
         } else {
            nui.alert('兼职人员不能修改');return ;
         }                              
  }else {    
            nui.alert('请选择一行数据');return ;
  };
	var newRow={ORG_ID:'',ORG_CODE:'',ORG_SEQ:'${param.ORG_SEQ}',ORG_ORDER:'',EMP_ID:'',EMP_CODE:'',EMP_CHINA_NAME:'',RJZ:'',EMP_SEX:'',EMP_COMP_ID:'',EMP_BIRTHDAY:'',EMP_SUPER_LEADER:'',EMP_POST_CHANGE_TIME:'',EMP_WORK_LINE:'',ORG_ABBREVIATION:'${param.ORG_ABBREVIATION}',EMP_DEPT_ID:'',EMP_ONCE_NAME:'',EMP_ENGLISH_NAME:'',EMP_POST_ID:'',EMP_NATIONALITY:'',POST_NAME:'',EMP_STATUS:'',EMP_POLITICAL:'',EMP_HIERARCHY:'',EMP_PROVINCE:'',EMP_USE_TYPE:'',EMP_AGE:'',EMP_REG_ORIGIN:'',EMP_ORIGIN:'',EMP_HUKOU:'',EMP_NO_TYPE:'',EMP_NO_CODE:'',EMP_POST:'',EMP_WORK_TIME:'',EMP_POST_TIME:'',EMP_POST_ODER:'',EMP_PHONE:'',EMP_TRADEE_MAIL:'',EMP_OFFICE_PHONE:'',EMP_WORK_EMP:'',EMP_BREAK_YEAR:'',EMP_BREAK_MON:'',EMP_ADD_YEAR:'',EMP_ADD_MON:'',EMP_LEAVE_TIME:'',EMP_JOIN_DATE:'',EMP_ORG_EMP:'',EMP_JOIN_TIME:'',EMP_RECRUIT_WAY:'',EMP_HEIGHT:'',EMP_TIME:'',EMP_WEIGHT:'',EMP_BLOOD:'',EMP_CON_EMP:'',LEVE:'',EMP_EMERG_TEL:'',HIE:'',EMP_LAST_ORG:'',ASS:'',EMP_EMERG_NAME:'',EMP_FAMILY_TEL:'',COD:'',AWW:'',EMP_MAIL_ADDRESS:'',EMP_FILE_PLACE:'',EMP_ADDRESS:'',EMP_CONT_TERM_TYPE:'',EMP_CONT_END_TIME:'',EMP_PRO_TITLE_NAME:'',EMP_CONT_FREQUENCY:'',EMP_HIGH_EDU:'',EMP_SCHOOL:'',EMP_GRAD_TIME:'',EMP_MAJOR:'',EMP_EDU:'',EMP_DEGREE:'',EMP_CONT_START_TIME:'',EMP_RESIGN_REASON:'',EMP_MARITAL_STATUS:'',EMP_OPTIME:'',EMP_OPNAME:'',EMP_IS_MOVE:'',EMP_COUNTRY:'',EMP_DEL:'',EMP_WORKING_GROUND:'',EMP_OA_ID:'',ORG_PARENT_ID:''};
	grid_emp_newEntry_list.addRow(newRow);
}
function edit5emp_newEntry_list_click(){
	var _row2 = grid_emp_newEntry_list.getSelecteds();
  if(_row2!=null&&_row2.length>0){
    _row = _row2[0];
    var _row1 = grid_emp_newEntry_list.getSelected();  
         if(_row1.RJZ=="任职"){
          if(_row1.EMP_STATUS==2){                                
            nui.alert('该员工已是正式员工');return ;    
          } else if(_row1.EMP_STATUS==4){                                
            nui.alert('该员工已离职');return ;    
          } else if(_row1.EMP_STATUS==5){                                
            nui.alert('该员工已减员');return ;    
          } else if(_row1.EMP_STATUS==3){                                
            nui.alert('该员工正在离职中');return ;    
          } else if(_row1.EMP_STATUS==6){                                
            nui.alert('该员工为减员恢复人员');return ;    
          }
         } else {
            nui.alert('兼职人员不能修改');return ;
         }                              
  }else {    
            nui.alert('请选择一行数据');return ;
  };
	var newRow={ORG_ID:'',ORG_CODE:'',ORG_SEQ:'${param.ORG_SEQ}',ORG_ORDER:'',EMP_ID:'',EMP_CODE:'',EMP_CHINA_NAME:'',RJZ:'',EMP_SEX:'',EMP_COMP_ID:'',EMP_BIRTHDAY:'',EMP_SUPER_LEADER:'',EMP_POST_CHANGE_TIME:'',EMP_WORK_LINE:'',ORG_ABBREVIATION:'${param.ORG_ABBREVIATION}',EMP_DEPT_ID:'',EMP_ONCE_NAME:'',EMP_ENGLISH_NAME:'',EMP_POST_ID:'',EMP_NATIONALITY:'',POST_NAME:'',EMP_STATUS:'',EMP_POLITICAL:'',EMP_HIERARCHY:'',EMP_PROVINCE:'',EMP_USE_TYPE:'',EMP_AGE:'',EMP_REG_ORIGIN:'',EMP_ORIGIN:'',EMP_HUKOU:'',EMP_NO_TYPE:'',EMP_NO_CODE:'',EMP_POST:'',EMP_WORK_TIME:'',EMP_POST_TIME:'',EMP_POST_ODER:'',EMP_PHONE:'',EMP_TRADEE_MAIL:'',EMP_OFFICE_PHONE:'',EMP_WORK_EMP:'',EMP_BREAK_YEAR:'',EMP_BREAK_MON:'',EMP_ADD_YEAR:'',EMP_ADD_MON:'',EMP_LEAVE_TIME:'',EMP_JOIN_DATE:'',EMP_ORG_EMP:'',EMP_JOIN_TIME:'',EMP_RECRUIT_WAY:'',EMP_HEIGHT:'',EMP_TIME:'',EMP_WEIGHT:'',EMP_BLOOD:'',EMP_CON_EMP:'',LEVE:'',EMP_EMERG_TEL:'',HIE:'',EMP_LAST_ORG:'',ASS:'',EMP_EMERG_NAME:'',EMP_FAMILY_TEL:'',COD:'',AWW:'',EMP_MAIL_ADDRESS:'',EMP_FILE_PLACE:'',EMP_ADDRESS:'',EMP_CONT_TERM_TYPE:'',EMP_CONT_END_TIME:'',EMP_PRO_TITLE_NAME:'',EMP_CONT_FREQUENCY:'',EMP_HIGH_EDU:'',EMP_SCHOOL:'',EMP_GRAD_TIME:'',EMP_MAJOR:'',EMP_EDU:'',EMP_DEGREE:'',EMP_CONT_START_TIME:'',EMP_RESIGN_REASON:'',EMP_MARITAL_STATUS:'',EMP_OPTIME:'',EMP_OPNAME:'',EMP_IS_MOVE:'',EMP_COUNTRY:'',EMP_DEL:'',EMP_WORKING_GROUND:'',EMP_OA_ID:'',ORG_PARENT_ID:''};
	grid_emp_newEntry_list.addRow(newRow);
}
function edit6emp_newEntry_list_click_2779(){
var _row2 = grid_emp_newEntry_list.getSelecteds();
  if(_row2!=null&&_row2.length>0){
    _row = _row2[0];
    var _row1 = grid_emp_newEntry_list.getSelected();  
         if(_row1.RJZ=="任职"){
          if(_row1.EMP_STATUS==2){                                
            nui.alert('该员工已是正式员工');return ;    
          } else if(_row1.EMP_STATUS==4){                                
            nui.alert('该员工已离职');return ;    
          } else if(_row1.EMP_STATUS==5){                                
            nui.alert('该员工已减员');return ;    
          } else if(_row1.EMP_STATUS==3){                                
            nui.alert('该员工正在离职中');return ;    
          } else if(_row1.EMP_STATUS==6){                                
            nui.alert('该员工为减员恢复人员');return ;    
          }
         } else {
            nui.alert('兼职人员不能修改');return ;
         }                              
  }else {    
            nui.alert('请选择一行数据');return ;
  };
	var selects = $("#emp_newEntry_list_List").bootstrapTable('getSelections');;
	if(selects!=null && selects.length>0){
		select = selects[0];
	}else {
		alert('<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"请选择一行数据")%>');return ;
	}
	if(1==1){
		var url='/myehr/form/toForm.action?formId=2026&isInit=true&EMP_CODE='+select.EMP_CODE+'&EMP_USE_TYPE='+select.EMP_USE_TYPE+'&EMP_ID='+select.EMP_ID+'&EMP_CHINA_NAME='+select.EMP_CHINA_NAME+'&EMP_COMP_ID='+select.EMP_COMP_ID+'&EMP_DEPT_ID='+select.EMP_DEPT_ID+'&EMP_POST_ID='+select.EMP_POST_ID+'&EMP_SUPER_LEADER='+select.EMP_SUPER_LEADER+'&';
	}else{
		var url='/myehr/form/toForm.action?formId=2026&isInit=true&EMP_CODE='+EMP_CODE+'&EMP_USE_TYPE='+EMP_USE_TYPE+'&EMP_ID='+EMP_ID+'&EMP_CHINA_NAME='+EMP_CHINA_NAME+'&EMP_COMP_ID='+EMP_COMP_ID+'&EMP_DEPT_ID='+EMP_DEPT_ID+'&EMP_POST_ID='+EMP_POST_ID+'&EMP_SUPER_LEADER='+EMP_SUPER_LEADER+'';
	}
	layer.open({
		type: 2,
		title:'<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"人员减员")%>',
		shadeClose: true,
		shade: 0.8,
		offset: ['0px', '0px'],
		area: ['700', '400'],
		content: url,
		success:function(layero,index){
		},
		end:function(){
			    refresh_emp_newEntry_list();
		}
	});
}
function edit7emp_newEntry_list_click_2779(){
	layer.open({ 
		type: 2,
		title:'<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"正式工卡片")%>',
		shadeClose: true,
		shade: 0.8,
		offset: ['0px', '0px'],
		area: ['1000', '600'],
		content: 'ciitehr/empManager/empResume.jsp',
		success:function(layero,index){
		},
		end:function(){
			refresh_emp_a01_list();
		}
	});
}
function grid_emp_newEntry_list_fun(pageReqeust){
	var _filterdata={};
	if(document.getElementById('grid_emp_newEntry_list_filter')){
	if($("[id='FILTER_EMP_EMPLOYEE.EMP_CODE_2779']").attr('multiSelect')){
		var val = "";
		var arr = $("[id='FILTER_EMP_EMPLOYEE.EMP_CODE_2779']").val();
		if(arr==null){
		}else{
			for(var i=0;i<arr.length;i++){
				val+=arr[i]+',';
			}
			val = val.substring(0,val.length-1);
		}
		var EMP_CODE=val;
	}else{
		var EMP_CODE=$("[id='FILTER_2779']").val();
	}
	if($("[id='FILTER_EMP_EMPLOYEE.EMP_CHINA_NAME_2779']").attr('multiSelect')){
		var val = "";
		var arr = $("[id='FILTER_EMP_EMPLOYEE.EMP_CHINA_NAME_2779']").val();
		if(arr==null){
		}else{
			for(var i=0;i<arr.length;i++){
				val+=arr[i]+',';
			}
			val = val.substring(0,val.length-1);
		}
		var EMP_CHINA_NAME=val;
	}else{
		var EMP_CHINA_NAME=$("[id='FILTER_2779']").val();
	}
	if($("[id='FILTER_EMP_EMPLOYEE.EMP_USE_TYPE_2779']").attr('multiSelect')){
		var val = "";
		var arr = $("[id='FILTER_EMP_EMPLOYEE.EMP_USE_TYPE_2779']").val();
		if(arr==null){
		}else{
			for(var i=0;i<arr.length;i++){
				val+=arr[i]+',';
			}
			val = val.substring(0,val.length-1);
		}
		var EMP_USE_TYPE=val;
	}else{
		var EMP_USE_TYPE=$("[id='FILTER_2779']").val();
	}
	if($("[id='FILTER_VIR.LEVE_2779']").attr('multiSelect')){
		var val = "";
		var arr = $("[id='FILTER_VIR.LEVE_2779']").val();
		if(arr==null){
		}else{
			for(var i=0;i<arr.length;i++){
				val+=arr[i]+',';
			}
			val = val.substring(0,val.length-1);
		}
		var LEVE=val;
	}else{
		var LEVE=$("[id='FILTER_2779']").val();
	}
	if($("[id='FILTER_VIR.HIE_2779']").attr('multiSelect')){
		var val = "";
		var arr = $("[id='FILTER_VIR.HIE_2779']").val();
		if(arr==null){
		}else{
			for(var i=0;i<arr.length;i++){
				val+=arr[i]+',';
			}
			val = val.substring(0,val.length-1);
		}
		var HIE=val;
	}else{
		var HIE=$("[id='FILTER_2779']").val();
	}
		_filterdata={EMP_CODE:EMP_CODE,EMP_CHINA_NAME:EMP_CHINA_NAME,EMP_USE_TYPE:EMP_USE_TYPE,LEVE:LEVE,HIE:HIE};
	}
	var paramsMap = {};
	var requestParam={};
	if('${param.ORG_SEQ}'==''){
		requestParam = {ORG_SEQ:ORG_SEQ+""};
	}else{
		requestParam = {ORG_SEQ:'${param.ORG_SEQ}'};
	}
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.formId=_formId_2779;
	pageReqeust.isView=null;
	return JSON.stringify(pageReqeust);
}
function grid_emp_newEntry_list_fun11(){
	$('#emp_newEntry_list_List').bootstrapTable('refresh');
}
/**下拉控件 */
var classes = $("select");
var parame={
    id:'',
    value:"N",
    width: "100px",
    height:"45px",
    url:'${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode.action?userId=${sessionScope.userid}',
	  jsonParam:{},
    chang:function (e){
    }
};
function initDict(){
    for(var i=0;i<classes.length;i++){
        parame.id=classes[i].id;
		  var type=$(classes[i]).attr('multiSelect');
        parame.placeholder="";
        parame.jsonParam.dictTypeCode=$(classes[i]).attr('DictName');
		  if(type=="true"){
		  	myehr_initSelectMore(parame);
		  }else{
	        myehr_initSelect(parame);
		  }
    }
}
/**初始化日期控件  */
function initDate(){
			$('.form_date1').datetimepicker({ 
			 language:  'zh-CN',  
			 format:"yyyy-mm-dd",  
			 weekStart: 1,  
			 todayBtn:  1,  
			 autoclose: 1,  
			 todayHighlight: 1,  
			 startView: 2,  
			 minView: 2,  
			 forceParse: 0,  
			 pickerPosition: "bottom-left"  
			});  
			$('.form_date2').datetimepicker({ 
			 language:  'zh-CN',  
			 format:"yyyy-mm-dd hh:ii",  
			 weekStart: 1,  
			 todayBtn:  1,  
			 autoclose: 1,  
			 todayHighlight: 1,  
			 startView: 2,  
			 minView: 0,  
			 forceParse: 0,  
			 pickerPosition: "bottom-left"  
			});  
			$('.form_date3').datetimepicker({ 
			 language:  'zh-CN',  
			 format:"hh:ii",  
			 weekStart: 1,  
			 todayBtn:  1,  
			 autoclose: 1,  
			 todayHighlight: 1,  
			 startView: 0,  
			 minView: 2,  
			 forceParse: 0,  
			 pickerPosition: "bottom-left"  
			});  
			$('.form_date4').datetimepicker({ 
			 language:  'zh-CN',  
			 format:"yyyy-mm-dd",  
			 weekStart: 1,  
			 todayBtn:  1,  
			 autoclose: 1,  
			 todayHighlight: 1,  
			 startView: 4,  
			 minView: 4,  
			 forceParse: 0,  
			 pickerPosition: "bottom-left"  
			});  
} 
/**取url参数值  */
function getQueryString(name) {
    var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)", "i");
    var r = window.location.search.substr(1).match(reg);
    if (r != null) return unescape(r[2]); return null;
}
</script>
</body>
</html>
