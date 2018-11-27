<%@ page language="java" import="com.myehr.common.util.LangUtil" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/common/common.jsp" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<body>
<form id="form_2073" name="form_2073"  style="height:100%;">
	<ul class="nav nav-tabs" id="myTab">
		<li class="active"><a href="#Tab_1">新员工入职列表</a></li>
		<li ><a href="#Tab_2">老员工复职列表</a></li>
		<li ><a href="#Tab_3">入职历史列表</a></li>
	</ul>
	<div class="tab-content">
		<div class="tab-pane active" id="Tab_1">
			<div class="container-fluid">
				<div style="margin-top:5px;">
<div class="input-group" style="width:100%;z-index: 5;">
    <div id="grid_emp_newEntry_list_filter">
        <table class="cbs-table" style="width:100%">
             <tr>
				<td style="padding-left:10px;"  width="100"  ><lable style="float:left"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"岗位")%>: </lable></td>
				<td style="padding-left:10px;"  width="100"  align="left"  >						<select id="FILTER_EMP_EMPLOYEE_REG.EMPEMPLOYEEREG_JOBID_2057" title="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"岗位")%>" styleType="select" name="EMPEMPLOYEEREG_JOBID"  class="form-control " emptyText="请选择..."  style="float:left;" showNullItem="true" textField="text" valueField="id" nullItemText="请选择..." dataField="data_form_22256"></select><span style='color:red;line-height:35px;font-size:27px'></span>
</td>
			<td style="float:right;padding-top:5px">
				<input id="FILTER_2057" name="FILTER_2057" placeholder="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"工号")%>,<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"姓名")%>,<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"证件号码")%>" style="padding: 6px 30px 6px 10px;" title="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"工号")%>,<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"姓名")%>,<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"证件号码")%>" type="text" class="form-control" oninput="grid_emp_newEntry_list_fun11_2057()" />
				<i class="icon-search" style="position: absolute;right: 12px;top: 2px;cursor: pointer;"></i>
			</td>
                <td style="margin-left:10px;float:left;padding-top:5px" align="left" >
<div style="float:left;display:inline-block;margin-right:15px;position:relative;">
<input class="btn btn-primary" style="width:70px;padding-left:2px;padding-right:25px;" value="查询" onclick="grid_emp_newEntry_list_fun11_2057()">
<i class="glyphicon glyphicon-search" style="position: absolute;right: 12px;top: 6px;cursor: pointer;color:#fff">
</i>
</div>
</td>
            </tr>
        </table>
    </div>
</div>
		<div class="BTNGROUP BTNGROUP_2057" style="margin:5px auto; display:inline-block;height: 30px;z-index: 6;position: relative">
			<div style="margin-right:10px;display:inline-block">
			    <input type="button" id="addemp_newEntry_list"  class="btn btn-primary" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"入职登记")%> onclick="addemp_newEntry_list_click_2057()"/>
			</div>
			<div style="margin-right:10px;display:inline-block">
			    <input type="button" id="edit1emp_newEntry_list"  class="btn btn-warning" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"入职背景")%> onclick="edit1emp_newEntry_list_click_2057()"/>
			</div>
			<div style="margin-right:10px;display:inline-block">
			    <input type="button" id="edit2emp_newEntry_list"  class="btn btn-warning" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"编辑")%> onclick="edit2emp_newEntry_list_click_2057()"/>
			</div>
			<div style="margin-right:10px;display:inline-block">
			    <input type="button" id="executeSQLemp_newEntry_list"  class="btn btn-success" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"删除")%> onclick="executeSQLemp_newEntry_list_click_2057()"/>
			</div>
			<div style="margin-right:10px;display:inline-block">
			    <input type="button" id="executeSQL1emp_newEntry_list"  class="btn btn-success" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"工号分配")%> onclick="executeSQL1emp_newEntry_list_click_2057()"/>
			</div>
			<div style="margin-right:10px;display:inline-block">
			    <input type="button" id="executeSQL2emp_newEntry_list"  class="btn btn-success" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"生效")%> onclick="executeSQL2emp_newEntry_list_click_2057()"/>
			</div>
			<div style="margin-right:10px;display:inline-block">
			    <input type="button" id="importemp_newEntry_list"  class="btn btn-info" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"导入")%> onclick="importemp_newEntry_list_click_2057()"/>
			</div>
		</div>
<table id="emp_newEntry_list_List">
</table>
<div id="activity_pane" style="position:absolute;left:500px;top:70px"></div>
</div>
		</div>
</div>
		<div class="tab-pane " id="Tab_2">
			<div class="container-fluid">
				<div style="margin-top:5px;">
<div class="input-group" style="width:100%;z-index: 5;">
    <div id="grid_emp_reinstate_list_filter">
        <table class="cbs-table" style="width:100%">
             <tr>
			<td style="float:right;padding-top:5px">
				<input id="FILTER_2069" name="FILTER_2069" placeholder="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"工号")%>,<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"证件号码")%>,<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"姓名")%>" style="padding: 6px 30px 6px 10px;" title="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"工号")%>,<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"证件号码")%>,<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"姓名")%>" type="text" class="form-control" oninput="grid_emp_reinstate_list_fun11_2069()" />
				<i class="icon-search" style="position: absolute;right: 12px;top: 2px;cursor: pointer;"></i>
			</td>
            </tr>
        </table>
    </div>
</div>
		<div class="BTNGROUP BTNGROUP_2069" style="margin:5px auto; display:inline-block;height: 30px;z-index: 6;position: relative">
			<div style="margin-right:10px;display:inline-block">
			    <input type="button" id="introduceemp_reinstate_list"  class="btn btn-primary" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"引入离职员工")%> onclick="introduceemp_reinstate_list_click_2069()"/>
			</div>
			<div style="margin-right:10px;display:inline-block">
			    <input type="button" id="editemp_reinstate_list"  class="btn btn-warning" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"入职背景")%> onclick="editemp_reinstate_list_click_2069()"/>
			</div>
			<div style="margin-right:10px;display:inline-block">
			    <input type="button" id="edit1emp_reinstate_list"  class="btn btn-warning" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"编辑")%> onclick="edit1emp_reinstate_list_click_2069()"/>
			</div>
			<div style="margin-right:10px;display:inline-block">
			    <input type="button" id="executeSQLemp_reinstate_list"  class="btn btn-success" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"删除")%> onclick="executeSQLemp_reinstate_list_click_2069()"/>
			</div>
			<div style="margin-right:10px;display:inline-block">
			    <input type="button" id="executeSQL2emp_reinstate_list"  class="btn btn-success" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"工号分配")%> onclick="executeSQL2emp_reinstate_list_click_2069()"/>
			</div>
			<div style="margin-right:10px;display:inline-block">
			    <input type="button" id="executeSQL1emp_reinstate_list"  class="btn btn-success" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"生效")%> onclick="executeSQL1emp_reinstate_list_click_2069()"/>
			</div>
		</div>
<table id="emp_reinstate_list_List">
</table>
<div id="activity_pane" style="position:absolute;left:500px;top:70px"></div>
</div>
		</div>
</div>
		<div class="tab-pane " id="Tab_3">
			<div class="container-fluid">
				<div style="margin-top:5px;">
<div class="input-group" style="width:100%;z-index: 5;">
    <div id="grid_emp_EntryHis_list_filter">
        <table class="cbs-table" style="width:100%">
             <tr>
			<td style="float:right;padding-top:5px">
				<input id="FILTER_2072" name="FILTER_2072" placeholder="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"工号")%>,<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"姓名")%>,<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"证件号码")%>" style="padding: 6px 30px 6px 10px;" title="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"工号")%>,<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"姓名")%>,<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"证件号码")%>" type="text" class="form-control" oninput="grid_emp_EntryHis_list_fun11_2072()" />
				<i class="icon-search" style="position: absolute;right: 12px;top: 2px;cursor: pointer;"></i>
			</td>
            </tr>
        </table>
    </div>
</div>
		<div class="BTNGROUP BTNGROUP_2072" style="margin:5px auto; display:inline-block;height: 30px;z-index: 6;position: relative">
			<div style="margin-right:10px;display:inline-block">
			    <input type="button" id="editemp_EntryHis_list"  class="btn btn-warning" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"查看")%> onclick="editemp_EntryHis_list_click_2072()"/>
			</div>
		</div>
<table id="emp_EntryHis_list_List">
</table>
<div id="activity_pane" style="position:absolute;left:500px;top:70px"></div>
</div>
		</div>
</div>
</div>
</form>
<script>
var heightGadedata_2057 =[];
var containerParam_2057 ={};
containerParam_2057 ={};
function changeHeightGadedata_2057(data){
	heightGadedata_2057 = data;
}
var heightGadedata_2069 =[];
var containerParam_2069 ={};
containerParam_2069 ={};
function changeHeightGadedata_2069(data){
	heightGadedata_2069 = data;
}
var heightGadedata_2072 =[];
var containerParam_2072 ={};
containerParam_2072 ={};
function changeHeightGadedata_2072(data){
	heightGadedata_2072 = data;
}
$(function() {
    querys_2057();
var x2=0;var x3=0;	
	$('#myTab a').click(function (e) {
		e.preventDefault();
		var x = $(this)[0].innerHTML;
		var data = $("#columnList").bootstrapTable("getSelections")[0];
		if(x=="新员工入职列表"){
			$(this).tab('show');
			var tab = this.hash;var tab2 = $(tab).find('table').bootstrapTable('refresh');
		}if(x=="老员工复职列表"){
			if(x2==0){
				querys_2069();
				$(this).tab('show');
				var tab = this.hash;var tab2 = $(tab).find('table').bootstrapTable('refresh');
			}else{
				$(this).tab('show');
				var tab = this.hash;var tab2 = $(tab).find('table').bootstrapTable('refresh');
			}
			x2++;
		}else{
			if(x3==0){
				querys_2072();
				$(this).tab('show');
				var tab = this.hash;var tab2 = $(tab).find('table').bootstrapTable('refresh');
			}else{
				$(this).tab('show');
				var tab = this.hash;var tab2 = $(tab).find('table').bootstrapTable('refresh');
			}
			x3++;
		}
	});
gridPatterns1();

    cardSelectInitFunction('${param.formType}');
    cardDateWidInitFunction();
    showMoreBtn($(".BTNGROUP_2057"));
    showMoreBtn($(".BTNGROUP_2069"));
    showMoreBtn($(".BTNGROUP_2072"));
$(".container-fluid").css("height","85%");
$(".fixed-table-container").css("height",$('.container-fluid').height() -79 +"px");
$(".fixed-table-body").css("height","84%");
$("#myTab").css("margin","0px");
$("form").css("margin-top","0px");
});
	var _formId_2057='2057';
	var _formId_2069='2069';
	var _formId_2072='2072';



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
    function querys_2057() {
        initRoleColumn('2057');
        initRoleButtons('2057','emp_newEntry_list');
        $("#emp_newEntry_list_List").bootstrapTable({
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
                field : 'EMPEMPLOYEEREG_ID',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_ID\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"主键\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"部门码")%>',
                field : 'ORGDEPARTMENT_orgcode',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"ORGDEPARTMENT_orgcode\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"部门码\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"上级部门")%>',
                field : 'ORGDEPARTMENT_parentid',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"ORGDEPARTMENT_parentid\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"上级部门\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"入职类型")%>',
                field : 'EMPEMPLOYEEREG_XTYPE',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_XTYPE\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"入职类型\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"原员工ID")%>',
                field : 'EMPEMPLOYEEREG_OLDEMPID',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_OLDEMPID\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"原员工ID\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"原工号")%>',
                field : 'EMPEMPLOYEEREG_OLDEMPCODE',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_OLDEMPCODE\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"原工号\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"工号")%>',
                field : 'EMPEMPLOYEEREG_EMPCODE',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_EMPCODE,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_EMPCODE\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"工号\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"姓名")%>',
                field : 'EMPEMPLOYEEREG_CNAME',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_CNAME,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_CNAME\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"姓名\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"英文名/拼音")%>',
                field : 'EMPEMPLOYEEREG_ENAME',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_ENAME,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_ENAME\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"英文名/拼音\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"机构")%>',
                field : 'EMPEMPLOYEEREG_COMPID',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_COMPID,
                valign : 'left',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_COMPID\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"机构\" data-source=\"${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode1.action?deleteMark= data_form_22254&dataField=EMPEMPLOYEEREG_COMPID&realValue="+value+"+\"></a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"部门")%>',
                field : 'EMPEMPLOYEEREG_DEPID',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_DEPID,
                valign : 'left',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_DEPID\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"部门\" data-source=\"${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode1.action?deleteMark= data_form_22255&dataField=EMPEMPLOYEEREG_DEPID&realValue="+value+"+\"></a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"岗位")%>',
                field : 'EMPEMPLOYEEREG_JOBID',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_JOBID,
                valign : 'left',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_JOBID\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"岗位\" data-source=\"${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode1.action?deleteMark= data_form_22256&dataField=EMPEMPLOYEEREG_JOBID&realValue="+value+"+\"></a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"直接主管")%>',
                field : 'EMPEMPLOYEEREG_SUPVISOR',
                align : 'center',
                visible : false,
                valign : '',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_SUPVISOR\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"直接主管\" data-source=\"${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode1.action?deleteMark= data_form_22257&dataField=EMPEMPLOYEEREG_SUPVISOR&realValue="+value+"+\"></a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"职能主管")%>',
                field : 'EMPEMPLOYEEREG_FUNSUPVISOR',
                align : 'center',
                visible : false,
                valign : '',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_FUNSUPVISOR\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"职能主管\" data-source=\"${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode1.action?deleteMark= data_form_22258&dataField=EMPEMPLOYEEREG_FUNSUPVISOR&realValue="+value+"+\"></a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"在岗状态")%>',
                field : 'EMPEMPLOYEEREG_JOBSTATUS',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_JOBSTATUS,
                valign : 'left',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_JOBSTATUS\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"在岗状态\" data-source=\"${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode1.action?deleteMark=Onduty&realValue="+value+"+\"></a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"员工类型")%>',
                field : 'EMPEMPLOYEEREG_EMPTYPE',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_EMPTYPE,
                valign : 'left',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_EMPTYPE\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"员工类型\" data-source=\"${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode1.action?deleteMark=EMP_EMPTYPE&realValue="+value+"+\"></a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"员工状态")%>',
                field : 'EMPEMPLOYEEREG_EMPSTATUS',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_EMPSTATUS,
                valign : 'left',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_EMPSTATUS\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"员工状态\" data-source=\"${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode1.action?deleteMark=EMP_EMPSTATUS&realValue="+value+"+\"></a>";
                }
            },

  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"预留1")%>',
                field : 'EMPEMPLOYEEREG_EMPGROUP1',
                align : 'center',
                visible : false,
                valign : '',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_EMPGROUP1\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"预留1\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"预留2")%>',
                field : 'EMPEMPLOYEEREG_EMPGROUP2',
                align : 'center',
                visible : false,
                valign : '',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_EMPGROUP2\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"预留2\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"星座")%>',
                field : 'EMPEMPLOYEEREG_EMPGROUP3',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_EMPGROUP3,
                valign : '',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_EMPGROUP3\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"星座\" data-source=\"${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode1.action?deleteMark=EMP_Constellation&realValue="+value+"+\"></a>";
                }
            },

  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"微博")%>',
                field : 'EMPEMPLOYEEREG_EMPGROUP4',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_EMPGROUP4,
                valign : '',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_EMPGROUP4\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"微博\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"邮编")%>',
                field : 'EMPEMPLOYEEREG_EMPGROUP5',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_EMPGROUP5,
                valign : '',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_EMPGROUP5\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"邮编\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"客户经理级别")%>',
                field : 'EMPEMPLOYEEREG_EMPGRADE',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_EMPGRADE,
                valign : '',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_EMPGRADE\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"客户经理级别\" data-source=\"${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode1.action?deleteMark=EMP_EMPGRADE&realValue="+value+"+\"></a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"柜员级别")%>',
                field : 'EMPEMPLOYEEREG_EMPLEVEL',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_EMPLEVEL,
                valign : '',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_EMPLEVEL\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"柜员级别\" data-source=\"${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode1.action?deleteMark=EMP_EMPLEVEL&realValue="+value+"+\"></a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"招聘来源")%>',
                field : 'EMPEMPLOYEEREG_RECTYPE',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_RECTYPE,
                valign : 'left',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_RECTYPE\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"招聘来源\" data-source=\"${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode1.action?deleteMark=EMP_RECTYPE&realValue="+value+"+\"></a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"工作城市")%>',
                field : 'EMPEMPLOYEEREG_WORKCITY',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_WORKCITY,
                valign : 'left',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_WORKCITY\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"工作城市\" data-source=\"${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode1.action?deleteMark=EMP_WORKCITY&realValue="+value+"+\"></a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"入行日期")%>',
                field : 'EMPEMPLOYEEREG_JOINDATE',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_JOINDATE,
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
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px\" name=\"EMPEMPLOYEEREG_JOINDATE\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"入行日期\">"+date+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"行龄调整")%>',
                field : 'EMPEMPLOYEEREG_WORKYEARADJUST',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_WORKYEARADJUST,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_WORKYEARADJUST\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"行龄调整\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"参加工作日期")%>',
                field : 'EMPEMPLOYEEREG_BEGINWORKDATE',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_BEGINWORKDATE,
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
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px\" name=\"EMPEMPLOYEEREG_BEGINWORKDATE\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"参加工作日期\">"+date+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"工龄调整(年)")%>',
                field : 'EMPEMPLOYEEREG_COMPYEARADJUST',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_COMPYEARADJUST,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_COMPYEARADJUST\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"工龄调整(年)\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"试用期开始日期")%>',
                field : 'EMPEMPLOYEEREG_PROBBEGINDATE',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_PROBBEGINDATE,
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
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px\" name=\"EMPEMPLOYEEREG_PROBBEGINDATE\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"试用期开始日期\">"+date+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"试用期")%>',
                field : 'EMPEMPLOYEEREG_PROBTERM',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_PROBTERM,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_PROBTERM\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"试用期\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"试用期结束日期")%>',
                field : 'EMPEMPLOYEEREG_PROBENDDATE',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_PROBENDDATE,
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
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px\" name=\"EMPEMPLOYEEREG_PROBENDDATE\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"试用期结束日期\">"+date+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"合同签约单位")%>',
                field : 'EMPEMPLOYEEREG_CONUNIT',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_CONUNIT,
                valign : 'left',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_CONUNIT\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"合同签约单位\" data-source=\"${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode1.action?deleteMark= data_form_22278&dataField=EMPEMPLOYEEREG_CONUNIT&realValue="+value+"+\"></a>";
                }
            },

  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"合同编号")%>',
                field : 'EMPEMPLOYEEREG_CONNUMBER',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_CONNUMBER,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_CONNUMBER\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"合同编号\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"合同类型")%>',
                field : 'EMPEMPLOYEEREG_CONTYPE',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_CONTYPE,
                valign : 'left',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_CONTYPE\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"合同类型\" data-source=\"${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode1.action?deleteMark=EMP_CONTRACTTYPE&realValue="+value+"+\"></a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"合同属性")%>',
                field : 'EMPEMPLOYEEREG_CONKIND',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_CONKIND,
                valign : 'left',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_CONKIND\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"合同属性\" data-source=\"${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode1.action?deleteMark=EMP_CONTRACTKIND&realValue="+value+"+\"></a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"合同开始日期")%>',
                field : 'EMPEMPLOYEEREG_CONBEGINDATE',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_CONBEGINDATE,
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
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px\" name=\"EMPEMPLOYEEREG_CONBEGINDATE\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"合同开始日期\">"+date+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"合同期")%>',
                field : 'EMPEMPLOYEEREG_CONMONTHS',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_CONMONTHS,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_CONMONTHS\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"合同期\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"合同结束日期")%>',
                field : 'EMPEMPLOYEEREG_CONENDDATE',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_CONENDDATE,
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
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px\" name=\"EMPEMPLOYEEREG_CONENDDATE\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"合同结束日期\">"+date+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"国籍")%>',
                field : 'EMPEMPLOYEEREG_COUNTRY',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_COUNTRY,
                valign : 'left',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_COUNTRY\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"国籍\" data-source=\"${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode1.action?deleteMark=nation_GB&realValue="+value+"+\"></a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"民族")%>',
                field : 'EMPEMPLOYEEREG_NATION',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_NATION,
                valign : '',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_NATION\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"民族\" data-source=\"${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode1.action?deleteMark=volk_GB&realValue="+value+"+\"></a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"籍贯")%>',
                field : 'EMPEMPLOYEEREG_ORIGIN',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_ORIGIN,
                valign : 'left',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_ORIGIN\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"籍贯\" data-source=\"${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode1.action?deleteMark= data_form_22287&dataField=EMPEMPLOYEEREG_ORIGIN&realValue="+value+"+\"></a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"证件类型")%>',
                field : 'EMPEMPLOYEEREG_CERTTYPE',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_CERTTYPE,
                valign : 'left',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_CERTTYPE\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"证件类型\" data-source=\"${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode1.action?deleteMark=emp_DOCTTYPE&realValue="+value+"+\"></a>";
                }
            },

  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"证件编码")%>',
                field : 'EMPEMPLOYEEREG_CERTNO',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_CERTNO,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_CERTNO\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"证件编码\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"性别")%>',
                field : 'EMPEMPLOYEEREG_GENDER',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_GENDER,
                valign : 'left',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_GENDER\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"性别\" data-source=\"${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode1.action?deleteMark=emp_SEX&realValue="+value+"+\"></a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"出生日期")%>',
                field : 'EMPEMPLOYEEREG_BIRTHDAY',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_BIRTHDAY,
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
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px\" name=\"EMPEMPLOYEEREG_BIRTHDAY\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"出生日期\">"+date+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"出生地")%>',
                field : 'EMPEMPLOYEEREG_BIRTHDAYPLACE',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_BIRTHDAYPLACE,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_BIRTHDAYPLACE\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"出生地\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"家庭住址")%>',
                field : 'EMPEMPLOYEEREG_HOMEADDRESS',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_HOMEADDRESS,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_HOMEADDRESS\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"家庭住址\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"户口性质")%>',
                field : 'EMPEMPLOYEEREG_RESIDENTTYPE',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_RESIDENTTYPE,
                valign : 'left',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_RESIDENTTYPE\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"户口性质\" data-source=\"${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode1.action?deleteMark=emp_HOUSETYPE&realValue="+value+"+\"></a>";
                }
            },

  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"户口所在地")%>',
                field : 'EMPEMPLOYEEREG_RESIDENTADDRESS',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_RESIDENTADDRESS,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_RESIDENTADDRESS\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"户口所在地\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"机构邮箱")%>',
                field : 'EMPEMPLOYEEREG_WORKEMAIL',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_WORKEMAIL,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_WORKEMAIL\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"机构邮箱\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"办公电话")%>',
                field : 'EMPEMPLOYEEREG_WORKPHONE',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_WORKPHONE,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_WORKPHONE\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"办公电话\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"私人邮箱")%>',
                field : 'EMPEMPLOYEEREG_PESEMAIL',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_PESEMAIL,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_PESEMAIL\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"私人邮箱\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"联系电话")%>',
                field : 'EMPEMPLOYEEREG_PESPHONE',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_PESPHONE,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_PESPHONE\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"联系电话\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"手机号码")%>',
                field : 'EMPEMPLOYEEREG_MOBILE',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_MOBILE,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_MOBILE\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"手机号码\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"婚姻状况")%>',
                field : 'EMPEMPLOYEEREG_MARRIAGESTATUS',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_MARRIAGESTATUS,
                valign : 'left',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_MARRIAGESTATUS\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"婚姻状况\" data-source=\"${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode1.action?deleteMark=emp_MARYSTATUS&realValue="+value+"+\"></a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"健康状况")%>',
                field : 'EMPEMPLOYEEREG_HEALTHSTATUS',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_HEALTHSTATUS,
                valign : 'left',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_HEALTHSTATUS\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"健康状况\" data-source=\"${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode1.action?deleteMark=EMP_HEALTHSTATUS&realValue="+value+"+\"></a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"血型")%>',
                field : 'EMPEMPLOYEEREG_BLOODTYPE',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_BLOODTYPE,
                valign : 'left',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_BLOODTYPE\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"血型\" data-source=\"${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode1.action?deleteMark=EMP_BLOODTYPE&realValue="+value+"+\"></a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"生育状况")%>',
                field : 'EMPEMPLOYEEREG_CHILDSTATUS',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_CHILDSTATUS,
                valign : 'left',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_CHILDSTATUS\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"生育状况\" data-source=\"${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode1.action?deleteMark=CHILDSTATUS&realValue="+value+"+\"></a>";
                }
            },

  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"子女情况(个数)")%>',
                field : 'EMPEMPLOYEEREG_CHILDS',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_CHILDS,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_CHILDS\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"子女情况(个数)\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"qq号码")%>',
                field : 'EMPEMPLOYEEREG_QQ',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_QQ,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_QQ\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"qq号码\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"微信")%>',
                field : 'EMPEMPLOYEEREG_WECHART',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_WECHART,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_WECHART\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"微信\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"登记人")%>',
                field : 'EMPEMPLOYEEREG_REGBY',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_REGBY,
                valign : 'left',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_REGBY\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"登记人\" data-source=\"${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode1.action?deleteMark= data_form_22308&dataField=EMPEMPLOYEEREG_REGBY&realValue="+value+"+\"></a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"登记时间")%>',
                field : 'EMPEMPLOYEEREG_REGTIME',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_REGTIME,
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
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px\" name=\"EMPEMPLOYEEREG_REGTIME\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"登记时间\">"+date+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"生效")%>',
                field : 'EMPEMPLOYEEREG_VALID',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_VALID\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"生效\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"生效人")%>',
                field : 'EMPEMPLOYEEREG_VALIDBY',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_VALIDBY\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"生效人\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"备注")%>',
                field : 'EMPEMPLOYEEREG_REMARK',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_REMARK,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_REMARK\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"备注\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"组织码")%>',
                field : 'ORGCOMPANY_orgcode',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"ORGCOMPANY_orgcode\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"组织码\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"现居住地址")%>',
                field : 'EMPEMPLOYEEREG_LOCATION',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_LOCATION,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_LOCATION\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"现居住地址\">"+value+"</a>";
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
		onDblClickCell: function (field, value,row,td) {
        	editemp_newEntry_list_click_2057('isView',row);  
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
    function querys_2069() {
        initRoleColumn('2069');
        initRoleButtons('2069','emp_reinstate_list');
        $("#emp_reinstate_list_List").bootstrapTable({
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
            queryParams : grid_emp_reinstate_list_fun,
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
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"主键")%>',
                field : 'EMPEMPLOYEEREG_ID',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_ID\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"主键\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"入职类型")%>',
                field : 'EMPEMPLOYEEREG_XTYPE',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_XTYPE\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"入职类型\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"原员工ID")%>',
                field : 'EMPEMPLOYEEREG_OLDEMPID',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_OLDEMPID\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"原员工ID\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"原工号")%>',
                field : 'EMPEMPLOYEEREG_OLDEMPCODE',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_OLDEMPCODE,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_OLDEMPCODE\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"原工号\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"工号")%>',
                field : 'EMPEMPLOYEEREG_EMPCODE',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_EMPCODE,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_EMPCODE\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"工号\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"姓名")%>',
                field : 'EMPEMPLOYEEREG_CNAME',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_CNAME,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_CNAME\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"姓名\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"英文名/拼音")%>',
                field : 'EMPEMPLOYEEREG_ENAME',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_ENAME,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_ENAME\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"英文名/拼音\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"机构")%>',
                field : 'EMPEMPLOYEEREG_COMPID',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_COMPID,
                valign : 'left',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_COMPID\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"机构\" data-source=\"${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode1.action?deleteMark= data_form_30554&dataField=EMPEMPLOYEEREG_COMPID&realValue="+value+"+\"></a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"部门")%>',
                field : 'EMPEMPLOYEEREG_DEPID',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_DEPID,
                valign : 'left',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_DEPID\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"部门\" data-source=\"${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode1.action?deleteMark= data_form_30555&dataField=EMPEMPLOYEEREG_DEPID&realValue="+value+"+\"></a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"岗位")%>',
                field : 'EMPEMPLOYEEREG_JOBID',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_JOBID,
                valign : 'left',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_JOBID\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"岗位\" data-source=\"${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode1.action?deleteMark= data_form_30556&dataField=EMPEMPLOYEEREG_JOBID&realValue="+value+"+\"></a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"直接主管")%>',
                field : 'EMPEMPLOYEEREG_SUPVISOR',
                align : 'center',
                visible : false,
                valign : '',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_SUPVISOR\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"直接主管\" data-source=\"${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode1.action?deleteMark= data_form_30557&dataField=EMPEMPLOYEEREG_SUPVISOR&realValue="+value+"+\"></a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"职能主管")%>',
                field : 'EMPEMPLOYEEREG_FUNSUPVISOR',
                align : 'center',
                visible : false,
                valign : '',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_FUNSUPVISOR\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"职能主管\" data-source=\"${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode1.action?deleteMark= data_form_30558&dataField=EMPEMPLOYEEREG_FUNSUPVISOR&realValue="+value+"+\"></a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"在岗状态")%>',
                field : 'EMPEMPLOYEEREG_JOBSTATUS',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_JOBSTATUS,
                valign : 'left',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_JOBSTATUS\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"在岗状态\" data-source=\"${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode1.action?deleteMark=Onduty&realValue="+value+"+\"></a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"员工类型")%>',
                field : 'EMPEMPLOYEEREG_EMPTYPE',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_EMPTYPE,
                valign : 'left',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_EMPTYPE\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"员工类型\" data-source=\"${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode1.action?deleteMark=EMP_EMPTYPE&realValue="+value+"+\"></a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"员工状态")%>',
                field : 'EMPEMPLOYEEREG_EMPSTATUS',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_EMPSTATUS,
                valign : 'left',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_EMPSTATUS\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"员工状态\" data-source=\"${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode1.action?deleteMark=EMP_EMPSTATUS&realValue="+value+"+\"></a>";
                }
            },

  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"预留分类1")%>',
                field : 'EMPEMPLOYEEREG_EMPGROUP1',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_EMPGROUP1\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"预留分类1\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"预留分类2")%>',
                field : 'EMPEMPLOYEEREG_EMPGROUP2',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_EMPGROUP2\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"预留分类2\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"星座")%>',
                field : 'EMPEMPLOYEEREG_EMPGROUP3',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_EMPGROUP3,
                valign : '',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_EMPGROUP3\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"星座\" data-source=\"${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode1.action?deleteMark=EMP_Constellation&realValue="+value+"+\"></a>";
                }
            },

  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"微博")%>',
                field : 'EMPEMPLOYEEREG_EMPGROUP4',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_EMPGROUP4,
                valign : '',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_EMPGROUP4\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"微博\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"邮编")%>',
                field : 'EMPEMPLOYEEREG_EMPGROUP5',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_EMPGROUP5,
                valign : '',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_EMPGROUP5\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"邮编\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"客户经理等级")%>',
                field : 'EMPEMPLOYEEREG_EMPGRADE',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_EMPGRADE,
                valign : 'left',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_EMPGRADE\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"客户经理等级\" data-source=\"${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode1.action?deleteMark=EMP_EMPGRADE&realValue="+value+"+\"></a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"柜员等级")%>',
                field : 'EMPEMPLOYEEREG_EMPLEVEL',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_EMPLEVEL,
                valign : 'left',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_EMPLEVEL\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"柜员等级\" data-source=\"${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode1.action?deleteMark=EMP_EMPLEVEL&realValue="+value+"+\"></a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"招聘来源")%>',
                field : 'EMPEMPLOYEEREG_RECTYPE',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_RECTYPE,
                valign : 'left',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_RECTYPE\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"招聘来源\" data-source=\"${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode1.action?deleteMark=EMP_RECTYPE&realValue="+value+"+\"></a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"工作城市")%>',
                field : 'EMPEMPLOYEEREG_WORKCITY',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_WORKCITY,
                valign : 'left',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_WORKCITY\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"工作城市\" data-source=\"${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode1.action?deleteMark=EMP_WORKCITY&realValue="+value+"+\"></a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"入行日期")%>',
                field : 'EMPEMPLOYEEREG_JOINDATE',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_JOINDATE,
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
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px\" name=\"EMPEMPLOYEEREG_JOINDATE\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"入行日期\">"+date+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"行龄调整")%>',
                field : 'EMPEMPLOYEEREG_WORKYEARADJUST',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_WORKYEARADJUST,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_WORKYEARADJUST\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"行龄调整\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"参加工作日期")%>',
                field : 'EMPEMPLOYEEREG_BEGINWORKDATE',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_BEGINWORKDATE,
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
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px\" name=\"EMPEMPLOYEEREG_BEGINWORKDATE\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"参加工作日期\">"+date+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"工龄调整(年)")%>',
                field : 'EMPEMPLOYEEREG_COMPYEARADJUST',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_COMPYEARADJUST,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_COMPYEARADJUST\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"工龄调整(年)\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"试用期开始日期")%>',
                field : 'EMPEMPLOYEEREG_PROBBEGINDATE',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_PROBBEGINDATE,
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
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px\" name=\"EMPEMPLOYEEREG_PROBBEGINDATE\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"试用期开始日期\">"+date+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"试用期")%>',
                field : 'EMPEMPLOYEEREG_PROBTERM',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_PROBTERM,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_PROBTERM\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"试用期\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"试用期结束日期")%>',
                field : 'EMPEMPLOYEEREG_PROBENDDATE',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_PROBENDDATE,
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
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px\" name=\"EMPEMPLOYEEREG_PROBENDDATE\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"试用期结束日期\">"+date+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"合同签约单位")%>',
                field : 'EMPEMPLOYEEREG_CONUNIT',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_CONUNIT,
                valign : 'left',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_CONUNIT\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"合同签约单位\" data-source=\"${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode1.action?deleteMark=contactUnit&realValue="+value+"+\"></a>";
                }
            },

  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"合同编号")%>',
                field : 'EMPEMPLOYEEREG_CONNUMBER',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_CONNUMBER,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_CONNUMBER\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"合同编号\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"合同类型")%>',
                field : 'EMPEMPLOYEEREG_CONTYPE',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_CONTYPE,
                valign : 'left',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_CONTYPE\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"合同类型\" data-source=\"${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode1.action?deleteMark=EMP_CONTRACTTYPE&realValue="+value+"+\"></a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"合同属性")%>',
                field : 'EMPEMPLOYEEREG_CONKIND',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_CONKIND,
                valign : 'left',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_CONKIND\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"合同属性\" data-source=\"${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode1.action?deleteMark=EMP_CONTRACTKIND&realValue="+value+"+\"></a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"合同开始日期")%>',
                field : 'EMPEMPLOYEEREG_CONBEGINDATE',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_CONBEGINDATE,
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
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px\" name=\"EMPEMPLOYEEREG_CONBEGINDATE\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"合同开始日期\">"+date+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"合同期")%>',
                field : 'EMPEMPLOYEEREG_CONMONTHS',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_CONMONTHS,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_CONMONTHS\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"合同期\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"合同结束日期")%>',
                field : 'EMPEMPLOYEEREG_CONENDDATE',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_CONENDDATE,
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
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px\" name=\"EMPEMPLOYEEREG_CONENDDATE\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"合同结束日期\">"+date+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"国籍")%>',
                field : 'EMPEMPLOYEEREG_COUNTRY',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_COUNTRY,
                valign : 'left',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_COUNTRY\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"国籍\" data-source=\"${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode1.action?deleteMark=nation_GB&realValue="+value+"+\"></a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"民族")%>',
                field : 'EMPEMPLOYEEREG_NATION',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_NATION,
                valign : 'left',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_NATION\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"民族\" data-source=\"${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode1.action?deleteMark=volk_GB&realValue="+value+"+\"></a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"籍贯")%>',
                field : 'EMPEMPLOYEEREG_ORIGIN',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_ORIGIN,
                valign : 'left',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_ORIGIN\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"籍贯\" data-source=\"${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode1.action?deleteMark=emp_placeOrigin&realValue="+value+"+\"></a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"证件类型")%>',
                field : 'EMPEMPLOYEEREG_CERTTYPE',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_CERTTYPE,
                valign : 'left',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_CERTTYPE\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"证件类型\" data-source=\"${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode1.action?deleteMark=emp_DOCTTYPE&realValue="+value+"+\"></a>";
                }
            },

  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"证件编号")%>',
                field : 'EMPEMPLOYEEREG_CERTNO',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_CERTNO,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_CERTNO\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"证件编号\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"性别")%>',
                field : 'EMPEMPLOYEEREG_GENDER',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_GENDER,
                valign : 'left',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_GENDER\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"性别\" data-source=\"${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode1.action?deleteMark=emp_SEX&realValue="+value+"+\"></a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"出生日期")%>',
                field : 'EMPEMPLOYEEREG_BIRTHDAY',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_BIRTHDAY,
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
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px\" name=\"EMPEMPLOYEEREG_BIRTHDAY\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"出生日期\">"+date+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"出生地")%>',
                field : 'EMPEMPLOYEEREG_BIRTHDAYPLACE',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_BIRTHDAYPLACE,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_BIRTHDAYPLACE\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"出生地\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"家庭住址")%>',
                field : 'EMPEMPLOYEEREG_HOMEADDRESS',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_HOMEADDRESS,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_HOMEADDRESS\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"家庭住址\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"户口性质")%>',
                field : 'EMPEMPLOYEEREG_RESIDENTTYPE',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_RESIDENTTYPE,
                valign : 'left',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_RESIDENTTYPE\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"户口性质\" data-source=\"${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode1.action?deleteMark=emp_HOUSETYPE&realValue="+value+"+\"></a>";
                }
            },

  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"现居住地址")%>',
                field : 'EMPEMPLOYEEREG_LOCATION',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_LOCATION,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_LOCATION\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"现居住地址\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"户口所在地")%>',
                field : 'EMPEMPLOYEEREG_RESIDENTADDRESS',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_RESIDENTADDRESS,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_RESIDENTADDRESS\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"户口所在地\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"机构邮箱")%>',
                field : 'EMPEMPLOYEEREG_WORKEMAIL',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_WORKEMAIL,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_WORKEMAIL\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"机构邮箱\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"办公电话")%>',
                field : 'EMPEMPLOYEEREG_WORKPHONE',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_WORKPHONE,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_WORKPHONE\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"办公电话\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"私人邮箱")%>',
                field : 'EMPEMPLOYEEREG_PESEMAIL',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_PESEMAIL,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_PESEMAIL\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"私人邮箱\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"联系电话")%>',
                field : 'EMPEMPLOYEEREG_PESPHONE',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_PESPHONE,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_PESPHONE\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"联系电话\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"手机号码")%>',
                field : 'EMPEMPLOYEEREG_MOBILE',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_MOBILE,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_MOBILE\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"手机号码\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"婚姻状况")%>',
                field : 'EMPEMPLOYEEREG_MARRIAGESTATUS',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_MARRIAGESTATUS,
                valign : 'left',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_MARRIAGESTATUS\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"婚姻状况\" data-source=\"${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode1.action?deleteMark=emp_MARYSTATUS&realValue="+value+"+\"></a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"健康状况")%>',
                field : 'EMPEMPLOYEEREG_HEALTHSTATUS',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_HEALTHSTATUS,
                valign : 'left',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_HEALTHSTATUS\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"健康状况\" data-source=\"${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode1.action?deleteMark=EMP_HEALTHSTATUS&realValue="+value+"+\"></a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"血型")%>',
                field : 'EMPEMPLOYEEREG_BLOODTYPE',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_BLOODTYPE,
                valign : 'left',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_BLOODTYPE\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"血型\" data-source=\"${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode1.action?deleteMark=EMP_BLOODTYPE&realValue="+value+"+\"></a>";
                }
            },

  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"生育状况")%>',
                field : 'EMPEMPLOYEEREG_CHILDSTATUS',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_CHILDSTATUS,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_CHILDSTATUS\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"生育状况\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"子女个数(个数)")%>',
                field : 'EMPEMPLOYEEREG_CHILDS',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_CHILDS,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_CHILDS\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"子女个数(个数)\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"qq号码")%>',
                field : 'EMPEMPLOYEEREG_QQ',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_QQ,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_QQ\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"qq号码\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"微信")%>',
                field : 'EMPEMPLOYEEREG_WECHART',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_WECHART,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_WECHART\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"微信\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"登记人")%>',
                field : 'EMPEMPLOYEEREG_REGBY',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_REGBY,
                valign : 'left',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_REGBY\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"登记人\" data-source=\"${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode1.action?deleteMark= data_form_30608&dataField=EMPEMPLOYEEREG_REGBY&realValue="+value+"+\"></a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"登记时间")%>',
                field : 'EMPEMPLOYEEREG_REGTIME',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_REGTIME,
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
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px\" name=\"EMPEMPLOYEEREG_REGTIME\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"登记时间\">"+date+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"生效")%>',
                field : 'EMPEMPLOYEEREG_VALID',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_VALID\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"生效\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"生效人")%>',
                field : 'EMPEMPLOYEEREG_VALIDBY',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_VALIDBY\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"生效人\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"生效时间")%>',
                field : 'EMPEMPLOYEEREG_VALIDTIME',
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
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px\" name=\"EMPEMPLOYEEREG_VALIDTIME\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"生效时间\">"+date+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"备注")%>',
                field : 'EMPEMPLOYEEREG_REMARK',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_REMARK,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_REMARK\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"备注\">"+value+"</a>";
                }
            },
            ],
            onClickRow: function (row, $element) {
                curRow = row;
            },
		onLoadSuccess: function (aa, bb, cc) {
                $("#emp_reinstate_list_List a").editable({
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
        	editemp_reinstate_list_click_2069('isView',row);  
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
    function querys_2072() {
        initRoleColumn('2072');
        initRoleButtons('2072','emp_EntryHis_list');
        $("#emp_EntryHis_list_List").bootstrapTable({
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
            queryParams : grid_emp_EntryHis_list_fun,
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
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"主键")%>',
                field : 'EMPEMPLOYEEHIS_ID',
                align : 'center',
                visible : false,
                valign : 'center',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:;\" name=\"EMPEMPLOYEEHIS_ID\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"主键\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"入职类型")%>',
                field : 'EMPEMPLOYEEHIS_XTYPE',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEHIS_XTYPE,
                valign : 'center',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli w100\" style=\"font-size:12px;text-decoration:none;color:black;width:;\" name=\"EMPEMPLOYEEHIS_XTYPE\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"入职类型\" data-source=\"${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode1.action?deleteMark=empxtype&realValue="+value+"+\"></a>";
                }
            },

  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"原员工ID")%>',
                field : 'EMPEMPLOYEEHIS_OLDEMPID',
                align : 'center',
                visible : false,
                valign : 'center',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:;\" name=\"EMPEMPLOYEEHIS_OLDEMPID\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"原员工ID\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"原工号")%>',
                field : 'EMPEMPLOYEEHIS_OLDEMPCODE',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEHIS_OLDEMPCODE,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEHIS_OLDEMPCODE\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"原工号\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"工号")%>',
                field : 'EMPEMPLOYEEHIS_EMPCODE',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEHIS_EMPCODE,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEHIS_EMPCODE\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"工号\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"姓名")%>',
                field : 'EMPEMPLOYEEHIS_CNAME',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEHIS_CNAME,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEHIS_CNAME\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"姓名\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"英文名/拼音")%>',
                field : 'EMPEMPLOYEEHIS_ENAME',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEHIS_ENAME,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEHIS_ENAME\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"英文名/拼音\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"机构")%>',
                field : 'EMPEMPLOYEEHIS_COMPID',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEHIS_COMPID,
                valign : 'left',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEHIS_COMPID\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"机构\" data-source=\"${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode1.action?deleteMark= data_form_22735&dataField=EMPEMPLOYEEHIS_COMPID&realValue="+value+"+\"></a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"部门")%>',
                field : 'EMPEMPLOYEEHIS_DEPID',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEHIS_DEPID,
                valign : 'left',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEHIS_DEPID\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"部门\" data-source=\"${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode1.action?deleteMark= data_form_22736&dataField=EMPEMPLOYEEHIS_DEPID&realValue="+value+"+\"></a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"岗位")%>',
                field : 'EMPEMPLOYEEHIS_JOBID',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEHIS_JOBID,
                valign : 'left',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEHIS_JOBID\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"岗位\" data-source=\"${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode1.action?deleteMark= data_form_22737&dataField=EMPEMPLOYEEHIS_JOBID&realValue="+value+"+\"></a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"直接主管")%>',
                field : 'EMPEMPLOYEEHIS_SUPVISOR',
                align : 'center',
                visible : false,
                valign : '',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEHIS_SUPVISOR\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"直接主管\" data-source=\"${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode1.action?deleteMark= data_form_22738&dataField=EMPEMPLOYEEHIS_SUPVISOR&realValue="+value+"+\"></a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"职能主管")%>',
                field : 'EMPEMPLOYEEHIS_FUNSUPVISOR',
                align : 'center',
                visible : false,
                valign : '',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEHIS_FUNSUPVISOR\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"职能主管\" data-source=\"${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode1.action?deleteMark= data_form_22739&dataField=EMPEMPLOYEEHIS_FUNSUPVISOR&realValue="+value+"+\"></a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"在岗状态")%>',
                field : 'EMPEMPLOYEEHIS_JOBSTATUS',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEHIS_JOBSTATUS,
                valign : 'left',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEHIS_JOBSTATUS\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"在岗状态\" data-source=\"${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode1.action?deleteMark=Onduty&realValue="+value+"+\"></a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"员工类型")%>',
                field : 'EMPEMPLOYEEHIS_EMPTYPE',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEHIS_EMPTYPE,
                valign : 'left',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEHIS_EMPTYPE\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"员工类型\" data-source=\"${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode1.action?deleteMark=EMP_EMPTYPE&realValue="+value+"+\"></a>";
                }
            },

  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"预留分类1")%>',
                field : 'EMPEMPLOYEEHIS_EMPGROUP1',
                align : 'center',
                visible : false,
                valign : 'center',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEHIS_EMPGROUP1\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"预留分类1\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"预留分类2")%>',
                field : 'EMPEMPLOYEEHIS_EMPGROUP2',
                align : 'center',
                visible : false,
                valign : 'center',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEHIS_EMPGROUP2\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"预留分类2\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"星座")%>',
                field : 'EMPEMPLOYEEHIS_EMPGROUP3',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEHIS_EMPGROUP3,
                valign : '',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEHIS_EMPGROUP3\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"星座\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"微博")%>',
                field : 'EMPEMPLOYEEHIS_EMPGROUP4',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEHIS_EMPGROUP4,
                valign : '',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEHIS_EMPGROUP4\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"微博\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"邮编")%>',
                field : 'EMPEMPLOYEEHIS_EMPGROUP5',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEHIS_EMPGROUP5,
                valign : '',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEHIS_EMPGROUP5\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"邮编\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"客户经理等级")%>',
                field : 'EMPEMPLOYEEHIS_EMPGRADE',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEHIS_EMPGRADE,
                valign : 'left',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEHIS_EMPGRADE\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"客户经理等级\" data-source=\"${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode1.action?deleteMark=EMP_EMPGRADE&realValue="+value+"+\"></a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"柜员等级")%>',
                field : 'EMPEMPLOYEEHIS_EMPLEVEL',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEHIS_EMPLEVEL,
                valign : 'left',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEHIS_EMPLEVEL\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"柜员等级\" data-source=\"${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode1.action?deleteMark=EMP_EMPLEVEL&realValue="+value+"+\"></a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"招聘来源")%>',
                field : 'EMPEMPLOYEEHIS_RECTYPE',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEHIS_RECTYPE,
                valign : 'left',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEHIS_RECTYPE\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"招聘来源\" data-source=\"${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode1.action?deleteMark=EMP_RECTYPE&realValue="+value+"+\"></a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"工作城市")%>',
                field : 'EMPEMPLOYEEHIS_WORKCITY',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEHIS_WORKCITY,
                valign : 'left',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEHIS_WORKCITY\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"工作城市\" data-source=\"${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode1.action?deleteMark=EMP_WORKCITY&realValue="+value+"+\"></a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"入职日期")%>',
                field : 'EMPEMPLOYEEHIS_JOINDATE',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEHIS_JOINDATE,
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
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px\" name=\"EMPEMPLOYEEHIS_JOINDATE\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"入职日期\">"+date+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"行龄调整")%>',
                field : 'EMPEMPLOYEEHIS_COMPYEARADJUST',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEHIS_COMPYEARADJUST,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEHIS_COMPYEARADJUST\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"行龄调整\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"参加工作日期")%>',
                field : 'EMPEMPLOYEEHIS_BEGINWORKDATE',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEHIS_BEGINWORKDATE,
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
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px\" name=\"EMPEMPLOYEEHIS_BEGINWORKDATE\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"参加工作日期\">"+date+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"工龄调整(年)")%>',
                field : 'EMPEMPLOYEEHIS_WORKYEARADJUST',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEHIS_WORKYEARADJUST,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEHIS_WORKYEARADJUST\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"工龄调整(年)\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"试用期开始日期")%>',
                field : 'EMPEMPLOYEEHIS_PROBBEGINDATE',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEHIS_PROBBEGINDATE,
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
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px\" name=\"EMPEMPLOYEEHIS_PROBBEGINDATE\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"试用期开始日期\">"+date+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"试用期")%>',
                field : 'EMPEMPLOYEEHIS_PROBTERM',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEHIS_PROBTERM,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEHIS_PROBTERM\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"试用期\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"试用期结束日期")%>',
                field : 'EMPEMPLOYEEHIS_PROBENDDATE',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEHIS_PROBENDDATE,
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
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px\" name=\"EMPEMPLOYEEHIS_PROBENDDATE\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"试用期结束日期\">"+date+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"合同签约单位")%>',
                field : 'EMPEMPLOYEEHIS_CONUNIT',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEHIS_CONUNIT,
                valign : 'left',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEHIS_CONUNIT\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"合同签约单位\" data-source=\"${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode1.action?deleteMark=contactUnit&realValue="+value+"+\"></a>";
                }
            },

  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"合同编号")%>',
                field : 'EMPEMPLOYEEHIS_CONNUMBER',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEHIS_CONNUMBER,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEHIS_CONNUMBER\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"合同编号\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"合同类型")%>',
                field : 'EMPEMPLOYEEHIS_CONTYPE',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEHIS_CONTYPE,
                valign : 'left',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEHIS_CONTYPE\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"合同类型\" data-source=\"${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode1.action?deleteMark=EMP_CONTRACTTYPE&realValue="+value+"+\"></a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"合同属性")%>',
                field : 'EMPEMPLOYEEHIS_CONKIND',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEHIS_CONKIND,
                valign : 'left',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEHIS_CONKIND\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"合同属性\" data-source=\"${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode1.action?deleteMark=EMP_CONTRACTKIND&realValue="+value+"+\"></a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"合同开始日期")%>',
                field : 'EMPEMPLOYEEHIS_CONBEGINDATE',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEHIS_CONBEGINDATE,
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
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px\" name=\"EMPEMPLOYEEHIS_CONBEGINDATE\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"合同开始日期\">"+date+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"合同期")%>',
                field : 'EMPEMPLOYEEHIS_CONMONTHS',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEHIS_CONMONTHS,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEHIS_CONMONTHS\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"合同期\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"合同结束日期")%>',
                field : 'EMPEMPLOYEEHIS_CONENDDATE',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEHIS_CONENDDATE,
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
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px\" name=\"EMPEMPLOYEEHIS_CONENDDATE\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"合同结束日期\">"+date+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"国籍")%>',
                field : 'EMPEMPLOYEEHIS_COUNTRY',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEHIS_COUNTRY,
                valign : 'left',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEHIS_COUNTRY\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"国籍\" data-source=\"${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode1.action?deleteMark=emp_COUNTRY&realValue="+value+"+\"></a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"民族")%>',
                field : 'EMPEMPLOYEEHIS_NATION',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEHIS_NATION,
                valign : 'left',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEHIS_NATION\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"民族\" data-source=\"${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode1.action?deleteMark=volk_GB&realValue="+value+"+\"></a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"籍贯")%>',
                field : 'EMPEMPLOYEEHIS_ORIGIN',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEHIS_ORIGIN,
                valign : 'left',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEHIS_ORIGIN\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"籍贯\" data-source=\"${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode1.action?deleteMark=emp_placeOrigin&realValue="+value+"+\"></a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"证件类型")%>',
                field : 'EMPEMPLOYEEHIS_CERTTYPE',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEHIS_CERTTYPE,
                valign : 'left',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEHIS_CERTTYPE\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"证件类型\" data-source=\"${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode1.action?deleteMark=emp_DOCTTYPE&realValue="+value+"+\"></a>";
                }
            },

  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"证件编号")%>',
                field : 'EMPEMPLOYEEHIS_CERTNO',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEHIS_CERTNO,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEHIS_CERTNO\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"证件编号\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"性别")%>',
                field : 'EMPEMPLOYEEHIS_GENDER',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEHIS_GENDER,
                valign : 'left',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEHIS_GENDER\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"性别\" data-source=\"${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode1.action?deleteMark=emp_SEX&realValue="+value+"+\"></a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"出生日期")%>',
                field : 'EMPEMPLOYEEHIS_BIRTHDAY',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEHIS_BIRTHDAY,
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
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px\" name=\"EMPEMPLOYEEHIS_BIRTHDAY\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"出生日期\">"+date+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"出生地")%>',
                field : 'EMPEMPLOYEEHIS_BIRTHDAYPLACE',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEHIS_BIRTHDAYPLACE,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEHIS_BIRTHDAYPLACE\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"出生地\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"家庭住址")%>',
                field : 'EMPEMPLOYEEHIS_HOMEADDRESS',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEHIS_HOMEADDRESS,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEHIS_HOMEADDRESS\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"家庭住址\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"户口性质")%>',
                field : 'EMPEMPLOYEEHIS_RESIDENTTYPE',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEHIS_RESIDENTTYPE,
                valign : 'left',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEHIS_RESIDENTTYPE\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"户口性质\" data-source=\"${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode1.action?deleteMark=emp_HOUSETYPE&realValue="+value+"+\"></a>";
                }
            },

  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"户口所在地")%>',
                field : 'EMPEMPLOYEEHIS_RESIDENTADDRESS',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEHIS_RESIDENTADDRESS,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEHIS_RESIDENTADDRESS\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"户口所在地\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"机构邮箱")%>',
                field : 'EMPEMPLOYEEHIS_WORKEMAIL',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEHIS_WORKEMAIL,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEHIS_WORKEMAIL\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"机构邮箱\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"办公电话")%>',
                field : 'EMPEMPLOYEEHIS_WORKPHONE',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEHIS_WORKPHONE,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEHIS_WORKPHONE\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"办公电话\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"私人邮箱")%>',
                field : 'EMPEMPLOYEEHIS_PESEMAIL',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEHIS_PESEMAIL,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEHIS_PESEMAIL\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"私人邮箱\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"联系电话")%>',
                field : 'EMPEMPLOYEEHIS_PESPHONE',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEHIS_PESPHONE,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEHIS_PESPHONE\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"联系电话\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"手机号码")%>',
                field : 'EMPEMPLOYEEHIS_MOBILE',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEHIS_MOBILE,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEHIS_MOBILE\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"手机号码\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"婚姻状况")%>',
                field : 'EMPEMPLOYEEHIS_MARRIAGESTATUS',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEHIS_MARRIAGESTATUS,
                valign : 'left',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEHIS_MARRIAGESTATUS\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"婚姻状况\" data-source=\"${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode1.action?deleteMark=emp_MARYSTATUS&realValue="+value+"+\"></a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"健康状况")%>',
                field : 'EMPEMPLOYEEHIS_HEALTHSTATUS',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEHIS_HEALTHSTATUS,
                valign : 'left',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEHIS_HEALTHSTATUS\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"健康状况\" data-source=\"${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode1.action?deleteMark=EMP_HEALTHSTATUS&realValue="+value+"+\"></a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"血型")%>',
                field : 'EMPEMPLOYEEHIS_BLOODTYPE',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEHIS_BLOODTYPE,
                valign : 'left',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEHIS_BLOODTYPE\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"血型\" data-source=\"${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode1.action?deleteMark=EMP_BLOODTYPE&realValue="+value+"+\"></a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"生育状况")%>',
                field : 'EMPEMPLOYEEHIS_CHILDSTATUS',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEHIS_CHILDSTATUS,
                valign : 'left',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEHIS_CHILDSTATUS\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"生育状况\" data-source=\"${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode1.action?deleteMark=CHILDSTATUS&realValue="+value+"+\"></a>";
                }
            },

  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"子女个数(个数)")%>',
                field : 'EMPEMPLOYEEHIS_CHILDS',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEHIS_CHILDS,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEHIS_CHILDS\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"子女个数(个数)\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"QQ")%>',
                field : 'EMPEMPLOYEEHIS_QQ',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEHIS_QQ,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEHIS_QQ\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"QQ\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"微信")%>',
                field : 'EMPEMPLOYEEHIS_WECHART',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEHIS_WECHART,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEHIS_WECHART\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"微信\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"登记人")%>',
                field : 'EMPEMPLOYEEHIS_REGBY',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEHIS_REGBY,
                valign : 'left',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEHIS_REGBY\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"登记人\" data-source=\"${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode1.action?deleteMark= data_form_22789&dataField=EMPEMPLOYEEHIS_REGBY&realValue="+value+"+\"></a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"登记时间")%>',
                field : 'EMPEMPLOYEEHIS_REGTIME',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEHIS_REGTIME,
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
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px\" name=\"EMPEMPLOYEEHIS_REGTIME\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"登记时间\">"+date+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"生效")%>',
                field : 'EMPEMPLOYEEHIS_VALID',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEHIS_VALID,
                valign : 'center',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli w100\" style=\"font-size:12px;text-decoration:none;color:black;width:;\" name=\"EMPEMPLOYEEHIS_VALID\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"生效\" data-source=\"${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode1.action?deleteMark=att_yes_no&realValue="+value+"+\"></a>";
                }
            },

  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"生效人")%>',
                field : 'EMPEMPLOYEEHIS_VALIDBY',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEHIS_VALIDBY,
                valign : 'center',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:;\" name=\"EMPEMPLOYEEHIS_VALIDBY\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"生效人\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"生效时间")%>',
                field : 'EMPEMPLOYEEHIS_VALIDTIME',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEHIS_VALIDTIME,
                valign : 'center',
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
                    return "<a class=\"eli w100\" style=\"font-size:12px;text-decoration:none;color:black;width:\" name=\"EMPEMPLOYEEHIS_VALIDTIME\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"生效时间\">"+date+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"备注")%>',
                field : 'EMPEMPLOYEEHIS_REMARK',
                align : 'center',
                visible : false,
                valign : 'center',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:;\" name=\"EMPEMPLOYEEHIS_REMARK\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"备注\">"+value+"</a>";
                }
            },
            ],
            onClickRow: function (row, $element) {
                curRow = row;
            },
		onLoadSuccess: function (aa, bb, cc) {
                $("#emp_EntryHis_list_List a").editable({
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
        	editemp_EntryHis_list_click_2072('isView',row);  
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
function refresh_emp_newEntry_list() { 
    $('#emp_newEntry_list_List').bootstrapTable('refresh'); 
}
/** 刷新页面 */ 
function refresh_emp_reinstate_list() { 
    $('#emp_reinstate_list_List').bootstrapTable('refresh'); 
}
/** 刷新页面 */ 
function refresh_emp_EntryHis_list() { 
    $('#emp_EntryHis_list_List').bootstrapTable('refresh'); 
}
function addemp_newEntry_list_click_2057(isView,data){
	title='<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"新员工入职新增")%>';
	if('${param.ORGVORGANIZATION_ORGID}'!='' ){
		var url='/myehr/form/toForm.action?formId=2060&ORGVORGANIZATION_ORGID=${param.ORGVORGANIZATION_ORGID}&&isView='+isView+'';
	}else{
		var url='/myehr/form/toForm.action?formId=2060&ORGVORGANIZATION_ORGID='+ORGVORGANIZATION_ORGID+'&isView='+isView+'';
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
		},
		end:function(){
			    refresh_emp_newEntry_list();
		}
	});
}
function edit1emp_newEntry_list_click_2057(isView,data){
	var selects = $("#emp_newEntry_list_List").bootstrapTable('getSelections');;
	if(selects!=null && selects.length>0){
		select = selects[0];;
		title='<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"入职背景")%>';
	}else if(data!=null&&isView!=null){
	select = data;
	title='<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"预览")%>';
	}else {
		alert('<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"请选择一行数据")%>');return ;
	}
	if(1==1){
		var url='/myehr/form/toForm.action?formId=3207&isInit=true&EMPEMPLOYEEREG_ID='+select.EMPEMPLOYEEREG_ID+'&&EMPEMPLOYEEREG_EMPCODE='+select.EMPEMPLOYEEREG_EMPCODE+'&&EMPEMPLOYEEREG_CNAME='+select.EMPEMPLOYEEREG_CNAME+'&&EMPEMPLOYEEREG_ENAME='+select.EMPEMPLOYEEREG_ENAME+'&&EMPEMPLOYEEREG_COMPID='+select.EMPEMPLOYEEREG_COMPID+'&&EMPEMPLOYEEREG_DEPID='+select.EMPEMPLOYEEREG_DEPID+'&&EMPEMPLOYEEREG_JOBID='+select.EMPEMPLOYEEREG_JOBID+'&&EMPEMPLOYEEREG_EMPSTATUS='+select.EMPEMPLOYEEREG_EMPSTATUS+'&&&isView='+isView+'';
	}else{
		var url='/myehr/form/toForm.action?formId=3207&isInit=true&EMPEMPLOYEEREG_ID='+EMPEMPLOYEEREG_ID+'&EMPEMPLOYEEREG_EMPCODE='+EMPEMPLOYEEREG_EMPCODE+'&EMPEMPLOYEEREG_CNAME='+EMPEMPLOYEEREG_CNAME+'&EMPEMPLOYEEREG_ENAME='+EMPEMPLOYEEREG_ENAME+'&EMPEMPLOYEEREG_COMPID='+EMPEMPLOYEEREG_COMPID+'&EMPEMPLOYEEREG_DEPID='+EMPEMPLOYEEREG_DEPID+'&EMPEMPLOYEEREG_JOBID='+EMPEMPLOYEEREG_JOBID+'&EMPEMPLOYEEREG_EMPSTATUS='+EMPEMPLOYEEREG_EMPSTATUS+'&isView='+isView+'';
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
		},
		end:function(){
			    refresh_emp_newEntry_list();
		}
	});
}
function edit2emp_newEntry_list_click_2057(isView,data){
	var selects = $("#emp_newEntry_list_List").bootstrapTable('getSelections');;
	if(selects!=null && selects.length>0){
		select = selects[0];;
		title='<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"新员工入职编辑")%>';
	}else if(data!=null&&isView!=null){
	select = data;
	title='<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"预览")%>';
	}else {
		alert('<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"请选择一行数据")%>');return ;
	}
	if(1==1){
		var url='/myehr/form/toForm.action?formId=2061&isInit=true&EMPEMPLOYEEREG_ID='+select.EMPEMPLOYEEREG_ID+'&&&isView='+isView+'';
	}else{
		var url='/myehr/form/toForm.action?formId=2061&isInit=true&EMPEMPLOYEEREG_ID='+EMPEMPLOYEEREG_ID+'&isView='+isView+'';
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
		},
		end:function(){
			    refresh_emp_newEntry_list();
		}
	});
}
	function importemp_newEntry_list_click_2057() {
		var url = "/myehr/jsp/form/button/importButton.jsp?formId=2057&templateFileid=&templateFilename=&buttonId=2954";
		layer.open({
			type: 2,
			title: "<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"选择导入的Excel")%>",
			area: ['600', '500'],
			shadeClose: true,
			shade: 0.8,
			offset: ['0px', '0px'],
			content: url,
			onload: function () {},
			ondestroy: function (action) {
				if(action=="ok") {
					grid_emp_newEntry_list.reload();
				}
			}
		});
	}
//引入按钮处理函数
	function introduceemp_reinstate_list_click_2069(){
		layer.open({
			type:2,
			content:"/myehr/form/toForm.action?formId=2500&intrToId=2069&intrButtonId=2348",
			shadeClose: true,
			maxmin:true,
			shade: 0.8,
			zIndex:9999,
			title:"<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"引入离职员工")%>" ,
			area: ['1000', '600'],
			success:function(layero,index){ 
			$('.layui-layer-max').click();
			},
			end:function(){
				refresh_emp_reinstate_list();
			}
		 }); 
	}
function editemp_reinstate_list_click_2069(isView,data){
	var selects = $("#emp_reinstate_list_List").bootstrapTable('getSelections');;
	if(selects!=null && selects.length>0){
		select = selects[0];;
		title='<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"入职背景管理")%>';
	}else if(data!=null&&isView!=null){
	select = data;
	title='<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"预览")%>';
	}else {
		alert('<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"请选择一行数据")%>');return ;
	}
	if(1==1){
		var url='/myehr/form/toForm.action?formId=3280&isInit=true&EMPEMPLOYEEREG_ID='+select.EMPEMPLOYEEREG_ID+'&&EMPEMPLOYEEREG_EMPCODE='+select.EMPEMPLOYEEREG_EMPCODE+'&&EMPEMPLOYEEREG_CNAME='+select.EMPEMPLOYEEREG_CNAME+'&&EMPEMPLOYEEREG_ENAME='+select.EMPEMPLOYEEREG_ENAME+'&&EMPEMPLOYEEREG_COMPID='+select.EMPEMPLOYEEREG_COMPID+'&&EMPEMPLOYEEREG_DEPID='+select.EMPEMPLOYEEREG_DEPID+'&&EMPEMPLOYEEREG_JOBID='+select.EMPEMPLOYEEREG_JOBID+'&&EMPEMPLOYEEREG_EMPSTATUS='+select.EMPEMPLOYEEREG_EMPSTATUS+'&&&isView='+isView+'';
	}else{
		var url='/myehr/form/toForm.action?formId=3280&isInit=true&EMPEMPLOYEEREG_ID='+EMPEMPLOYEEREG_ID+'&EMPEMPLOYEEREG_EMPCODE='+EMPEMPLOYEEREG_EMPCODE+'&EMPEMPLOYEEREG_CNAME='+EMPEMPLOYEEREG_CNAME+'&EMPEMPLOYEEREG_ENAME='+EMPEMPLOYEEREG_ENAME+'&EMPEMPLOYEEREG_COMPID='+EMPEMPLOYEEREG_COMPID+'&EMPEMPLOYEEREG_DEPID='+EMPEMPLOYEEREG_DEPID+'&EMPEMPLOYEEREG_JOBID='+EMPEMPLOYEEREG_JOBID+'&EMPEMPLOYEEREG_EMPSTATUS='+EMPEMPLOYEEREG_EMPSTATUS+'&isView='+isView+'';
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
		},
		end:function(){
			    refresh_emp_reinstate_list();
		}
	});
}
function edit1emp_reinstate_list_click_2069(isView,data){
	var selects = $("#emp_reinstate_list_List").bootstrapTable('getSelections');;
	if(selects!=null && selects.length>0){
		select = selects[0];;
		title='<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"老员工复职编辑")%>';
	}else if(data!=null&&isView!=null){
	select = data;
	title='<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"预览")%>';
	}else {
		alert('<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"请选择一行数据")%>');return ;
	}
	if(1==1){
		var url='/myehr/form/toForm.action?formId=2071&isInit=true&EMPEMPLOYEEREG_ID='+select.EMPEMPLOYEEREG_ID+'&&&isView='+isView+'';
	}else{
		var url='/myehr/form/toForm.action?formId=2071&isInit=true&EMPEMPLOYEEREG_ID='+EMPEMPLOYEEREG_ID+'&isView='+isView+'';
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
		},
		end:function(){
			    refresh_emp_reinstate_list();
		}
	});
}
function editemp_EntryHis_list_click_2072(isView,data){
	var selects = $("#emp_EntryHis_list_List").bootstrapTable('getSelections');;
	if(selects!=null && selects.length>0){
		select = selects[0];;
		title='<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"入职历史查看")%>';
	}else if(data!=null&&isView!=null){
	select = data;
	title='<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"预览")%>';
	}else {
		alert('<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"请选择一行数据")%>');return ;
	}
	if(1==1){
		var url='/myehr/form/toForm.action?formId=2627&isInit=true&EMPEMPLOYEEHIS_ID='+select.EMPEMPLOYEEHIS_ID+'&&&isView='+isView+'';
	}else{
		var url='/myehr/form/toForm.action?formId=2627&isInit=true&EMPEMPLOYEEHIS_ID='+EMPEMPLOYEEHIS_ID+'&isView='+isView+'';
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
		},
		end:function(){
			    refresh_emp_EntryHis_list();
		}
	});
}

var filterParam = {};
var queryParams;
function grid_emp_newEntry_list_fun(pageReqeust){
	var _filterdata={};
	if(document.getElementById('grid_emp_newEntry_list_filter')){
	if($("[id='FILTER_EMP_EMPLOYEE_REG.EMPEMPLOYEEREG_EMPCODE_2057']").attr('multiSelect')){
		var val = "";
		var arr = $("[id='FILTER_EMP_EMPLOYEE_REG.EMPEMPLOYEEREG_EMPCODE_2057']").val();
		if(arr==null){
		}else{
			for(var i=0;i<arr.length;i++){
				val+=arr[i]+',';
			}
			val = val.substring(0,val.length-1);
		}
		var EMPEMPLOYEEREG_EMPCODE=val;
	}else if(($("[id='FILTER_EMP_EMPLOYEE_REG.EMPEMPLOYEEREG_EMPCODE_2057']").attr('styleType')=="select")||($("[id='FILTER_EMP_EMPLOYEE_REG.EMPEMPLOYEEREG_EMPCODE_2057']").attr('styleType')=="dateTime")){
			var EMPEMPLOYEEREG_EMPCODE=$("[id='FILTER_EMP_EMPLOYEE_REG.EMPEMPLOYEEREG_EMPCODE_2057']").val();
		}else{
				var EMPEMPLOYEEREG_EMPCODE=$("[id='FILTER_2057']").val();
		}
	if($("[id='FILTER_EMP_EMPLOYEE_REG.EMPEMPLOYEEREG_CNAME_2057']").attr('multiSelect')){
		var val = "";
		var arr = $("[id='FILTER_EMP_EMPLOYEE_REG.EMPEMPLOYEEREG_CNAME_2057']").val();
		if(arr==null){
		}else{
			for(var i=0;i<arr.length;i++){
				val+=arr[i]+',';
			}
			val = val.substring(0,val.length-1);
		}
		var EMPEMPLOYEEREG_CNAME=val;
	}else if(($("[id='FILTER_EMP_EMPLOYEE_REG.EMPEMPLOYEEREG_CNAME_2057']").attr('styleType')=="select")||($("[id='FILTER_EMP_EMPLOYEE_REG.EMPEMPLOYEEREG_CNAME_2057']").attr('styleType')=="dateTime")){
			var EMPEMPLOYEEREG_CNAME=$("[id='FILTER_EMP_EMPLOYEE_REG.EMPEMPLOYEEREG_CNAME_2057']").val();
		}else{
				var EMPEMPLOYEEREG_CNAME=$("[id='FILTER_2057']").val();
		}
	if($("[id='FILTER_EMP_EMPLOYEE_REG.EMPEMPLOYEEREG_JOBID_2057']").attr('multiSelect')){
		var val = "";
		var arr = $("[id='FILTER_EMP_EMPLOYEE_REG.EMPEMPLOYEEREG_JOBID_2057']").val();
		if(arr==null){
		}else{
			for(var i=0;i<arr.length;i++){
				val+=arr[i]+',';
			}
			val = val.substring(0,val.length-1);
		}
		var EMPEMPLOYEEREG_JOBID=val;
	}else if(($("[id='FILTER_EMP_EMPLOYEE_REG.EMPEMPLOYEEREG_JOBID_2057']").attr('styleType')=="select")||($("[id='FILTER_EMP_EMPLOYEE_REG.EMPEMPLOYEEREG_JOBID_2057']").attr('styleType')=="dateTime")){
			var EMPEMPLOYEEREG_JOBID=$("[id='FILTER_EMP_EMPLOYEE_REG.EMPEMPLOYEEREG_JOBID_2057']").val();
		}else{
				var EMPEMPLOYEEREG_JOBID=$("[id='FILTER_2057']").val();
		}
	if($("[id='FILTER_EMP_EMPLOYEE_REG.EMPEMPLOYEEREG_CERTNO_2057']").attr('multiSelect')){
		var val = "";
		var arr = $("[id='FILTER_EMP_EMPLOYEE_REG.EMPEMPLOYEEREG_CERTNO_2057']").val();
		if(arr==null){
		}else{
			for(var i=0;i<arr.length;i++){
				val+=arr[i]+',';
			}
			val = val.substring(0,val.length-1);
		}
		var EMPEMPLOYEEREG_CERTNO=val;
	}else if(($("[id='FILTER_EMP_EMPLOYEE_REG.EMPEMPLOYEEREG_CERTNO_2057']").attr('styleType')=="select")||($("[id='FILTER_EMP_EMPLOYEE_REG.EMPEMPLOYEEREG_CERTNO_2057']").attr('styleType')=="dateTime")){
			var EMPEMPLOYEEREG_CERTNO=$("[id='FILTER_EMP_EMPLOYEE_REG.EMPEMPLOYEEREG_CERTNO_2057']").val();
		}else{
				var EMPEMPLOYEEREG_CERTNO=$("[id='FILTER_2057']").val();
		}
		_filterdata={EMPEMPLOYEEREG_EMPCODE:EMPEMPLOYEEREG_EMPCODE,EMPEMPLOYEEREG_CNAME:EMPEMPLOYEEREG_CNAME,EMPEMPLOYEEREG_JOBID:EMPEMPLOYEEREG_JOBID,EMPEMPLOYEEREG_CERTNO:EMPEMPLOYEEREG_CERTNO};
	}
	var paramsMap = {};
	var requestParam={};
		requestParam = {};
	pageReqeust.containerParam=containerParam_2057;
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.userIds='${param.empIds}';
	pageReqeust.formId=_formId_2057;
	pageReqeust.isView=null;
	if(heightGadedata_2057!=null&&heightGadedata_2057!=undefined){
		pageReqeust.heightGrade = heightGadedata_2057;
	}
	queryParams = JSON.stringify(pageReqeust);
	return queryParams;
}
function grid_emp_newEntry_list_fun11_2057(){
	$('#emp_newEntry_list_List').bootstrapTable('refresh');
}
	
function executeSQLemp_newEntry_list_click_2057(){

	var buttonId = 2319;
	var checkselecdata = $("#emp_newEntry_list_List").bootstrapTable('getSelections');
	if(checkselecdata==null||checkselecdata==''||checkselecdata.lenght<=0){
		alert('<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"请选择数据！")%>');
		return;
	}
	var columnDataRows = $("#emp_newEntry_list_List").bootstrapTable('getSelections');
	var empemployeereg_id_2057Datas;
	var tempempemployeereg_id_2057Datas = [];
	for(var i=0; i<columnDataRows.length; i++){
		tempempemployeereg_id_2057Datas.push("'"+columnDataRows[i].EMPEMPLOYEEREG_ID+"'");
	}
	empemployeereg_id_2057Datas = tempempemployeereg_id_2057Datas.join(',');
	var paramsMap = {		'c_22247' : empemployeereg_id_2057Datas};
	var data = {
		'formId' : _formId_2057,
		'buttonId' : buttonId,
		'params' : paramsMap,
		'containerParam' : containerParam
	};
jQuery('#activity_pane').showLoading({'addClass': 'loading-indicator'});
	$.ajax({
			url:'${pageContext.request.contextPath }/form/execButtonExecSql.action',
			type : 'POST',
			data: JSON.stringify(data),
			cache : false,
			contentType: 'application/json;charset=utf-8',
			success : function (text) {
					if (text[0] == '000000') {
							alert(text[1]);
						$("#emp_newEntry_list_List").bootstrapTable('refresh');
					} else {
						$("#emp_newEntry_list_List").bootstrapTable('refresh');
							alert('<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"执行结果")%>：' + text[1]);
					}
				       jQuery('#activity_pane').hideLoading();
			var index = parent.layer.getFrameIndex(window.name);
				parent.layer.close(index);//执行关闭

			},
			error : function (jqXHR, textStatus, errorThrown) {
			}
		});

	}


	
function executeSQL1emp_newEntry_list_click_2057(){

	var buttonId = 2322;
	var checkselecdata = $("#emp_newEntry_list_List").bootstrapTable('getSelections');
	if(checkselecdata==null||checkselecdata==''||checkselecdata.lenght<=0){
		alert('<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"请选择数据！")%>');
		return;
	}
	var columnDataRows = $("#emp_newEntry_list_List").bootstrapTable('getSelections');
	var empemployeereg_id_2057Datas;
	var tempempemployeereg_id_2057Datas = [];
	for(var i=0; i<columnDataRows.length; i++){
		tempempemployeereg_id_2057Datas.push("'"+columnDataRows[i].EMPEMPLOYEEREG_ID+"'");
	}
	empemployeereg_id_2057Datas = tempempemployeereg_id_2057Datas.join(',');
	var paramsMap = {		'c_22247' : empemployeereg_id_2057Datas,
		's_userId' : '1'};
	var data = {
		'formId' : _formId_2057,
		'buttonId' : buttonId,
		'params' : paramsMap,
		'containerParam' : containerParam
	};
jQuery('#activity_pane').showLoading({'addClass': 'loading-indicator'});
	$.ajax({
			url:'${pageContext.request.contextPath }/form/execButtonExecSql.action',
			type : 'POST',
			data: JSON.stringify(data),
			cache : false,
			contentType: 'application/json;charset=utf-8',
			success : function (text) {
					if (text[0] == '000000') {
							alert(text[1]);
						$("#emp_newEntry_list_List").bootstrapTable('refresh');
					} else {
						$("#emp_newEntry_list_List").bootstrapTable('refresh');
							alert('<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"执行结果")%>：' + text[1]);
					}
				       jQuery('#activity_pane').hideLoading();
			var index = parent.layer.getFrameIndex(window.name);
				parent.layer.close(index);//执行关闭

			},
			error : function (jqXHR, textStatus, errorThrown) {
			}
		});

	}


	
function executeSQL2emp_newEntry_list_click_2057(){

	var buttonId = 2308;
	var checkselecdata = $("#emp_newEntry_list_List").bootstrapTable('getSelections');
	if(checkselecdata==null||checkselecdata==''||checkselecdata.lenght<=0){
		alert('<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"请选择数据！")%>');
		return;
	}
	var columnDataRows = $("#emp_newEntry_list_List").bootstrapTable('getSelections');
	var empemployeereg_id_2057Datas;
	var tempempemployeereg_id_2057Datas = [];
	for(var i=0; i<columnDataRows.length; i++){
		tempempemployeereg_id_2057Datas.push("'"+columnDataRows[i].EMPEMPLOYEEREG_ID+"'");
	}
	empemployeereg_id_2057Datas = tempempemployeereg_id_2057Datas.join(',');
	var paramsMap = {		'c_22247' : empemployeereg_id_2057Datas,
		's_userId' : '1'};
	var data = {
		'formId' : _formId_2057,
		'buttonId' : buttonId,
		'params' : paramsMap,
		'containerParam' : containerParam
	};
jQuery('#activity_pane').showLoading({'addClass': 'loading-indicator'});
	$.ajax({
			url:'${pageContext.request.contextPath }/form/execButtonExecSql.action',
			type : 'POST',
			data: JSON.stringify(data),
			cache : false,
			contentType: 'application/json;charset=utf-8',
			success : function (text) {
					if (text[0] == '000000') {
							alert(text[1]);
						$("#emp_newEntry_list_List").bootstrapTable('refresh');
					} else {
						$("#emp_newEntry_list_List").bootstrapTable('refresh');
							alert('<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"执行结果")%>：' + text[1]);
					}
				       jQuery('#activity_pane').hideLoading();
			var index = parent.layer.getFrameIndex(window.name);
				parent.layer.close(index);//执行关闭

			},
			error : function (jqXHR, textStatus, errorThrown) {
			}
		});

	}


var filterParam = {};
var queryParams;
function grid_emp_reinstate_list_fun(pageReqeust){
	var _filterdata={};
	if(document.getElementById('grid_emp_reinstate_list_filter')){
	if($("[id='FILTER_EMP_EMPLOYEE_REG.EMPEMPLOYEEREG_EMPCODE_2069']").attr('multiSelect')){
		var val = "";
		var arr = $("[id='FILTER_EMP_EMPLOYEE_REG.EMPEMPLOYEEREG_EMPCODE_2069']").val();
		if(arr==null){
		}else{
			for(var i=0;i<arr.length;i++){
				val+=arr[i]+',';
			}
			val = val.substring(0,val.length-1);
		}
		var EMPEMPLOYEEREG_EMPCODE=val;
	}else if(($("[id='FILTER_EMP_EMPLOYEE_REG.EMPEMPLOYEEREG_EMPCODE_2069']").attr('styleType')=="select")||($("[id='FILTER_EMP_EMPLOYEE_REG.EMPEMPLOYEEREG_EMPCODE_2069']").attr('styleType')=="dateTime")){
			var EMPEMPLOYEEREG_EMPCODE=$("[id='FILTER_EMP_EMPLOYEE_REG.EMPEMPLOYEEREG_EMPCODE_2069']").val();
		}else{
				var EMPEMPLOYEEREG_EMPCODE=$("[id='FILTER_2069']").val();
		}
	if($("[id='FILTER_EMP_EMPLOYEE_REG.EMPEMPLOYEEREG_CERTNO_2069']").attr('multiSelect')){
		var val = "";
		var arr = $("[id='FILTER_EMP_EMPLOYEE_REG.EMPEMPLOYEEREG_CERTNO_2069']").val();
		if(arr==null){
		}else{
			for(var i=0;i<arr.length;i++){
				val+=arr[i]+',';
			}
			val = val.substring(0,val.length-1);
		}
		var EMPEMPLOYEEREG_CERTNO=val;
	}else if(($("[id='FILTER_EMP_EMPLOYEE_REG.EMPEMPLOYEEREG_CERTNO_2069']").attr('styleType')=="select")||($("[id='FILTER_EMP_EMPLOYEE_REG.EMPEMPLOYEEREG_CERTNO_2069']").attr('styleType')=="dateTime")){
			var EMPEMPLOYEEREG_CERTNO=$("[id='FILTER_EMP_EMPLOYEE_REG.EMPEMPLOYEEREG_CERTNO_2069']").val();
		}else{
				var EMPEMPLOYEEREG_CERTNO=$("[id='FILTER_2069']").val();
		}
	if($("[id='FILTER_EMP_EMPLOYEE_REG.EMPEMPLOYEEREG_CNAME_2069']").attr('multiSelect')){
		var val = "";
		var arr = $("[id='FILTER_EMP_EMPLOYEE_REG.EMPEMPLOYEEREG_CNAME_2069']").val();
		if(arr==null){
		}else{
			for(var i=0;i<arr.length;i++){
				val+=arr[i]+',';
			}
			val = val.substring(0,val.length-1);
		}
		var EMPEMPLOYEEREG_CNAME=val;
	}else if(($("[id='FILTER_EMP_EMPLOYEE_REG.EMPEMPLOYEEREG_CNAME_2069']").attr('styleType')=="select")||($("[id='FILTER_EMP_EMPLOYEE_REG.EMPEMPLOYEEREG_CNAME_2069']").attr('styleType')=="dateTime")){
			var EMPEMPLOYEEREG_CNAME=$("[id='FILTER_EMP_EMPLOYEE_REG.EMPEMPLOYEEREG_CNAME_2069']").val();
		}else{
				var EMPEMPLOYEEREG_CNAME=$("[id='FILTER_2069']").val();
		}
		_filterdata={EMPEMPLOYEEREG_EMPCODE:EMPEMPLOYEEREG_EMPCODE,EMPEMPLOYEEREG_CERTNO:EMPEMPLOYEEREG_CERTNO,EMPEMPLOYEEREG_CNAME:EMPEMPLOYEEREG_CNAME};
	}
	var paramsMap = {};
	var requestParam={};
		requestParam = {};
	pageReqeust.containerParam=containerParam_2069;
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.userIds='${param.empIds}';
	pageReqeust.formId=_formId_2069;
	pageReqeust.isView=null;
	if(heightGadedata_2069!=null&&heightGadedata_2069!=undefined){
		pageReqeust.heightGrade = heightGadedata_2069;
	}
	queryParams = JSON.stringify(pageReqeust);
	return queryParams;
}
function grid_emp_reinstate_list_fun11_2069(){
	$('#emp_reinstate_list_List').bootstrapTable('refresh');
}
	
function executeSQLemp_reinstate_list_click_2069(){

	var buttonId = 2337;
	var checkselecdata = $("#emp_reinstate_list_List").bootstrapTable('getSelections');
	if(checkselecdata==null||checkselecdata==''||checkselecdata.lenght<=0){
		alert('<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"请选择数据！")%>');
		return;
	}
	var columnDataRows = $("#emp_reinstate_list_List").bootstrapTable('getSelections');
	var empemployeereg_id_2069Datas;
	var tempempemployeereg_id_2069Datas = [];
	for(var i=0; i<columnDataRows.length; i++){
		tempempemployeereg_id_2069Datas.push("'"+columnDataRows[i].EMPEMPLOYEEREG_ID+"'");
	}
	empemployeereg_id_2069Datas = tempempemployeereg_id_2069Datas.join(',');
	var paramsMap = {		'c_30547' : empemployeereg_id_2069Datas};
	var data = {
		'formId' : _formId_2069,
		'buttonId' : buttonId,
		'params' : paramsMap,
		'containerParam' : containerParam
	};
jQuery('#activity_pane').showLoading({'addClass': 'loading-indicator'});
	$.ajax({
			url:'${pageContext.request.contextPath }/form/execButtonExecSql.action',
			type : 'POST',
			data: JSON.stringify(data),
			cache : false,
			contentType: 'application/json;charset=utf-8',
			success : function (text) {
					if (text[0] == '000000') {
							alert(text[1]);
						$("#emp_reinstate_list_List").bootstrapTable('refresh');
					} else {
						$("#emp_reinstate_list_List").bootstrapTable('refresh');
							alert('<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"执行结果")%>：' + text[1]);
					}
				       jQuery('#activity_pane').hideLoading();
			var index = parent.layer.getFrameIndex(window.name);
				parent.layer.close(index);//执行关闭

			},
			error : function (jqXHR, textStatus, errorThrown) {
			}
		});

	}


	
function executeSQL2emp_reinstate_list_click_2069(){

	var buttonId = 2338;
	var checkselecdata = $("#emp_reinstate_list_List").bootstrapTable('getSelections');
	if(checkselecdata==null||checkselecdata==''||checkselecdata.lenght<=0){
		alert('<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"请选择数据！")%>');
		return;
	}
	var columnDataRows = $("#emp_reinstate_list_List").bootstrapTable('getSelections');
	var empemployeereg_id_2069Datas;
	var tempempemployeereg_id_2069Datas = [];
	for(var i=0; i<columnDataRows.length; i++){
		tempempemployeereg_id_2069Datas.push("'"+columnDataRows[i].EMPEMPLOYEEREG_ID+"'");
	}
	empemployeereg_id_2069Datas = tempempemployeereg_id_2069Datas.join(',');
	var paramsMap = {		'c_30547' : empemployeereg_id_2069Datas,
		's_userId' : '1'};
	var data = {
		'formId' : _formId_2069,
		'buttonId' : buttonId,
		'params' : paramsMap,
		'containerParam' : containerParam
	};
jQuery('#activity_pane').showLoading({'addClass': 'loading-indicator'});
	$.ajax({
			url:'${pageContext.request.contextPath }/form/execButtonExecSql.action',
			type : 'POST',
			data: JSON.stringify(data),
			cache : false,
			contentType: 'application/json;charset=utf-8',
			success : function (text) {
					if (text[0] == '000000') {
							alert(text[1]);
						$("#emp_reinstate_list_List").bootstrapTable('refresh');
					} else {
						$("#emp_reinstate_list_List").bootstrapTable('refresh');
							alert('<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"执行结果")%>：' + text[1]);
					}
				       jQuery('#activity_pane').hideLoading();
			var index = parent.layer.getFrameIndex(window.name);
				parent.layer.close(index);//执行关闭

			},
			error : function (jqXHR, textStatus, errorThrown) {
			}
		});

	}


	
function executeSQL1emp_reinstate_list_click_2069(){

	var buttonId = 2339;
	var checkselecdata = $("#emp_reinstate_list_List").bootstrapTable('getSelections');
	if(checkselecdata==null||checkselecdata==''||checkselecdata.lenght<=0){
		alert('<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"请选择数据！")%>');
		return;
	}
	var columnDataRows = $("#emp_reinstate_list_List").bootstrapTable('getSelections');
	var empemployeereg_id_2069Datas;
	var tempempemployeereg_id_2069Datas = [];
	for(var i=0; i<columnDataRows.length; i++){
		tempempemployeereg_id_2069Datas.push("'"+columnDataRows[i].EMPEMPLOYEEREG_ID+"'");
	}
	empemployeereg_id_2069Datas = tempempemployeereg_id_2069Datas.join(',');
	var paramsMap = {		'c_30547' : empemployeereg_id_2069Datas,
		's_userId' : '1'};
	var data = {
		'formId' : _formId_2069,
		'buttonId' : buttonId,
		'params' : paramsMap,
		'containerParam' : containerParam
	};
jQuery('#activity_pane').showLoading({'addClass': 'loading-indicator'});
	$.ajax({
			url:'${pageContext.request.contextPath }/form/execButtonExecSql.action',
			type : 'POST',
			data: JSON.stringify(data),
			cache : false,
			contentType: 'application/json;charset=utf-8',
			success : function (text) {
					if (text[0] == '000000') {
							alert(text[1]);
						$("#emp_reinstate_list_List").bootstrapTable('refresh');
					} else {
						$("#emp_reinstate_list_List").bootstrapTable('refresh');
							alert('<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"执行结果")%>：' + text[1]);
					}
				       jQuery('#activity_pane').hideLoading();
			var index = parent.layer.getFrameIndex(window.name);
				parent.layer.close(index);//执行关闭

			},
			error : function (jqXHR, textStatus, errorThrown) {
			}
		});

	}


var filterParam = {};
var queryParams;
function grid_emp_EntryHis_list_fun(pageReqeust){
	var _filterdata={};
	if(document.getElementById('grid_emp_EntryHis_list_filter')){
	if($("[id='FILTER_EMP_EMPLOYEE_HIS.EMPEMPLOYEEHIS_EMPCODE_2072']").attr('multiSelect')){
		var val = "";
		var arr = $("[id='FILTER_EMP_EMPLOYEE_HIS.EMPEMPLOYEEHIS_EMPCODE_2072']").val();
		if(arr==null){
		}else{
			for(var i=0;i<arr.length;i++){
				val+=arr[i]+',';
			}
			val = val.substring(0,val.length-1);
		}
		var EMPEMPLOYEEHIS_EMPCODE=val;
	}else if(($("[id='FILTER_EMP_EMPLOYEE_HIS.EMPEMPLOYEEHIS_EMPCODE_2072']").attr('styleType')=="select")||($("[id='FILTER_EMP_EMPLOYEE_HIS.EMPEMPLOYEEHIS_EMPCODE_2072']").attr('styleType')=="dateTime")){
			var EMPEMPLOYEEHIS_EMPCODE=$("[id='FILTER_EMP_EMPLOYEE_HIS.EMPEMPLOYEEHIS_EMPCODE_2072']").val();
		}else{
				var EMPEMPLOYEEHIS_EMPCODE=$("[id='FILTER_2072']").val();
		}
	if($("[id='FILTER_EMP_EMPLOYEE_HIS.EMPEMPLOYEEHIS_CNAME_2072']").attr('multiSelect')){
		var val = "";
		var arr = $("[id='FILTER_EMP_EMPLOYEE_HIS.EMPEMPLOYEEHIS_CNAME_2072']").val();
		if(arr==null){
		}else{
			for(var i=0;i<arr.length;i++){
				val+=arr[i]+',';
			}
			val = val.substring(0,val.length-1);
		}
		var EMPEMPLOYEEHIS_CNAME=val;
	}else if(($("[id='FILTER_EMP_EMPLOYEE_HIS.EMPEMPLOYEEHIS_CNAME_2072']").attr('styleType')=="select")||($("[id='FILTER_EMP_EMPLOYEE_HIS.EMPEMPLOYEEHIS_CNAME_2072']").attr('styleType')=="dateTime")){
			var EMPEMPLOYEEHIS_CNAME=$("[id='FILTER_EMP_EMPLOYEE_HIS.EMPEMPLOYEEHIS_CNAME_2072']").val();
		}else{
				var EMPEMPLOYEEHIS_CNAME=$("[id='FILTER_2072']").val();
		}
	if($("[id='FILTER_EMP_EMPLOYEE_HIS.EMPEMPLOYEEHIS_CERTNO_2072']").attr('multiSelect')){
		var val = "";
		var arr = $("[id='FILTER_EMP_EMPLOYEE_HIS.EMPEMPLOYEEHIS_CERTNO_2072']").val();
		if(arr==null){
		}else{
			for(var i=0;i<arr.length;i++){
				val+=arr[i]+',';
			}
			val = val.substring(0,val.length-1);
		}
		var EMPEMPLOYEEHIS_CERTNO=val;
	}else if(($("[id='FILTER_EMP_EMPLOYEE_HIS.EMPEMPLOYEEHIS_CERTNO_2072']").attr('styleType')=="select")||($("[id='FILTER_EMP_EMPLOYEE_HIS.EMPEMPLOYEEHIS_CERTNO_2072']").attr('styleType')=="dateTime")){
			var EMPEMPLOYEEHIS_CERTNO=$("[id='FILTER_EMP_EMPLOYEE_HIS.EMPEMPLOYEEHIS_CERTNO_2072']").val();
		}else{
				var EMPEMPLOYEEHIS_CERTNO=$("[id='FILTER_2072']").val();
		}
		_filterdata={EMPEMPLOYEEHIS_EMPCODE:EMPEMPLOYEEHIS_EMPCODE,EMPEMPLOYEEHIS_CNAME:EMPEMPLOYEEHIS_CNAME,EMPEMPLOYEEHIS_CERTNO:EMPEMPLOYEEHIS_CERTNO};
	}
	var paramsMap = {};
	var requestParam={};
		requestParam = {};
	pageReqeust.containerParam=containerParam_2072;
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.userIds='${param.empIds}';
	pageReqeust.formId=_formId_2072;
	pageReqeust.isView=null;
	if(heightGadedata_2072!=null&&heightGadedata_2072!=undefined){
		pageReqeust.heightGrade = heightGadedata_2072;
	}
	queryParams = JSON.stringify(pageReqeust);
	return queryParams;
}
function grid_emp_EntryHis_list_fun11_2072(){
	$('#emp_EntryHis_list_List').bootstrapTable('refresh');
}
</script>
</body>
</html>
