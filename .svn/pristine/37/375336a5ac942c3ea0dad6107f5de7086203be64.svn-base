<%@ page language="java" import="com.myehr.common.util.LangUtil" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/common/commontest.jsp" %>
<%
Date d = new Date();
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<body>
<form id="form_2080" name="form_2080"  style="height:100%;margin:0px">
	<ul class="nav nav-tabs" id="myTab">
		<li ><a href="#Tab_1">机构信息列表</a></li>
		<li ><a href="#Tab_2">机构登记列表</a></li>
		<li ><a href="#Tab_3">机构变更列表</a></li>
		<li ><a href="#Tab_4">机构失效列表</a></li>
	</ul>
	<div class="tab-content">
		<div class="tab-pane active" id="Tab_1">
			<div class="container-fluid">
				<div style="margin-top:5px;">
<div class="input-group" style="z-index: 5;float:right">
    <div id="grid_ORG_COMP_CARD_filter">
        <table class="cbs-table" style="width:100%">
             <tr>
				<td style="padding-left:10px;"  width="100"  >				<label style="float:left;font-size:12px;width:100;line-height:25px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"机构类型")%>: </label></td>
				<td style="padding-left:10px;"  width="100"  align="left"  >						<select id="FILTER_ORG_COMPANY.ORGCOMPANY_COMPTYPE_672" title="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"机构类型")%>" columnId="20727" styleType="select" name="ORGCOMPANY_COMPTYPE"  class="form-control " emptyText="请选择..."  style="float:left;" textField="dictName" valueField="dictID" DictName="COMPTYPE" dataField1 = "dict"  dataField="dictList_form_20727"></select><span style='color:red;line-height:35px;font-size:27px'></span>
</td>
			<td style="float:right;padding-top:5px">
				<input id="FILTER_672" name="FILTER_672" placeholder="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"机构名称")%>,<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"机构编码")%>" style="padding: 6px 30px 6px 10px;min-height:24px;font-size:12px" title="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"机构名称")%>,<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"机构编码")%>" type="text" class="form-control" oninput="grid_ORG_COMP_CARD_fun11_672()" />
				<i class="icon-search" style="position: absolute;right: 12px;top: 2px;cursor: pointer;"></i>
			</td>
                <td style="margin-left:10px;float:left;padding-top:5px" align="left" >
<div style="float:left;display:inline-block;margin-right:15px;position:relative;">
<input class="btn btn-primary" style="width:70px;padding-left:2px;padding-right:25px;" value="查询" onclick="grid_ORG_COMP_CARD_fun11_672()">
<i class="glyphicon glyphicon-search" style="position: absolute;right: 12px;top: 6px;cursor: pointer;color:#fff">
</i>
</div>
</td>
            </tr>
        </table>
    </div>
</div>
		<div class="BTNGROUP BTNGROUP_672" style="margin:5px auto; display:inline-block;height: 30px;z-index: 6;">
			<div style="margin-right:10px;display:inline-block">
			    <input type="button" id="editORG_COMP_CARD"  class="btn btn-warning" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"详情")%> onclick="editORG_COMP_CARD_click_672()"/>
			</div>
			<div style="margin-right:10px;display:inline-block">
			    <input type="button" id="edit2ORG_COMP_CARD"  class="btn btn-warning" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"机构证件")%> onclick="edit2ORG_COMP_CARD_click_672()"/>
			</div>
			<div style="margin-right:10px;display:inline-block">
			    <input type="button" id="edit3ORG_COMP_CARD"  class="btn btn-warning" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"机构管理历史")%> onclick="edit3ORG_COMP_CARD_click_672()"/>
			</div>
			<div style="margin-right:10px;display:inline-block">
			    <input type="button" id="exportORG_COMP_CARD"  class="btn btn-primary" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"导出")%> onclick="exportORG_COMP_CARD_click_672()"/>
			    <a id="export_6128" href="${pageContext.request.contextPath }/form/getExportFile.action?buttonId=6128" type="hidden" value=""></a>
			    <a id="exportBig_6128" href="${pageContext.request.contextPath }/form/getExportBigFile.action?buttonId=6128" type="hidden" value=""></a>
			</div>
			<div style="margin-right:10px;display:inline-block">
			    <input type="button" id="executeSQLORG_COMP_CARD"  class="btn btn-success" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"删除")%> onclick="executeSQLORG_COMP_CARD_click_672()"/>
			</div>
		</div>
<table id="ORG_COMP_CARD_List">
</table>
<div id="activity_pane" style="position:absolute;left:500px;top:70px"></div>
		</div>
</div>
</div>
		<div class="tab-pane " id="Tab_2">
			<div class="container-fluid">
				<div style="margin-top:5px;">
<div class="input-group" style="z-index: 5;float:right">
    <div id="grid_ORG_COMPADD_LIST_filter">
        <table class="cbs-table" style="width:100%">
             <tr>
			<td style="float:right;padding-top:5px">
				<input id="FILTER_676" name="FILTER_676" placeholder="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"机构编码")%>,<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"机构名称")%>" style="padding: 6px 30px 6px 10px;min-height:24px;font-size:12px" title="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"机构编码")%>,<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"机构名称")%>" type="text" class="form-control" oninput="grid_ORG_COMPADD_LIST_fun11_676()" />
				<i class="icon-search" style="position: absolute;right: 12px;top: 2px;cursor: pointer;"></i>
			</td>
            </tr>
        </table>
    </div>
</div>
		<div class="BTNGROUP BTNGROUP_676" style="margin:5px auto; display:inline-block;height: 30px;z-index: 6;">
			<div style="margin-right:10px;display:inline-block">
			    <input type="button" id="addORG_COMPADD_LIST"  class="btn btn-primary" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"增加")%> onclick="addORG_COMPADD_LIST_click_676()"/>
			</div>
			<div style="margin-right:10px;display:inline-block">
			    <input type="button" id="editORG_COMPADD_LIST"  class="btn btn-warning" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"修改")%> onclick="editORG_COMPADD_LIST_click_676()"/>
			</div>
			<div style="margin-right:10px;display:inline-block">
			    <input type="button" id="removeORG_COMPADD_LIST"  class="btn btn-danger" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"删除")%> onclick="removeORG_COMPADD_LIST_click_676()"/>
			</div>
			<div style="margin-right:10px;display:inline-block">
			    <input type="button" id="executeSQLORG_COMPADD_LIST"  class="btn btn-success" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"生效")%> onclick="executeSQLORG_COMPADD_LIST_click_676()"/>
			</div>
			<div style="margin-right:10px;display:inline-block">
			    <input type="button" id="importORG_COMPADD_LIST"  class="btn btn-info" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"导入")%> onclick="importORG_COMPADD_LIST_click_676()"/>
			</div>
		</div>
<table id="ORG_COMPADD_LIST_List">
</table>
<div id="activity_pane" style="position:absolute;left:500px;top:70px"></div>
		</div>
</div>
</div>
		<div class="tab-pane " id="Tab_3">
			<div class="container-fluid">
				<div style="margin-top:5px;">
<div class="input-group" style="z-index: 5;float:right">
    <div id="grid_ORG_COMPEDIT_LIST_filter">
        <table class="cbs-table" style="width:100%">
             <tr>
			<td style="float:right;padding-top:5px">
				<input id="FILTER_679" name="FILTER_679" placeholder="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"机构编码")%>,<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"机构名称")%>" style="padding: 6px 30px 6px 10px;min-height:24px;font-size:12px" title="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"机构编码")%>,<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"机构名称")%>" type="text" class="form-control" oninput="grid_ORG_COMPEDIT_LIST_fun11_679()" />
				<i class="icon-search" style="position: absolute;right: 12px;top: 2px;cursor: pointer;"></i>
			</td>
            </tr>
        </table>
    </div>
</div>
		<div class="BTNGROUP BTNGROUP_679" style="margin:5px auto; display:inline-block;height: 30px;z-index: 6;">
			<div style="margin-right:10px;display:inline-block">
			    <input type="button" id="introduceORG_COMPEDIT_LIST"  class="btn btn-primary" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"引入")%> onclick="introduceORG_COMPEDIT_LIST_click_679()"/>
			</div>
			<div style="margin-right:10px;display:inline-block">
			    <input type="button" id="editORG_COMPEDIT_LIST"  class="btn btn-warning" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"修改")%> onclick="editORG_COMPEDIT_LIST_click_679()"/>
			</div>
			<div style="margin-right:10px;display:inline-block">
			    <input type="button" id="removeORG_COMPEDIT_LIST"  class="btn btn-danger" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"删除")%> onclick="removeORG_COMPEDIT_LIST_click_679()"/>
			</div>
			<div style="margin-right:10px;display:inline-block">
			    <input type="button" id="executeSQLORG_COMPEDIT_LIST"  class="btn btn-success" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"生效")%> onclick="executeSQLORG_COMPEDIT_LIST_click_679()"/>
			</div>
		</div>
<table id="ORG_COMPEDIT_LIST_List">
</table>
<div id="activity_pane" style="position:absolute;left:500px;top:70px"></div>
		</div>
</div>
</div>
		<div class="tab-pane " id="Tab_4">
			<div class="container-fluid">
				<div style="margin-top:5px;">
<div class="input-group" style="z-index: 5;float:right">
    <div id="grid_ORG_COMPDIS_LIST_filter">
        <table class="cbs-table" style="width:100%">
             <tr>
			<td style="float:right;padding-top:5px">
				<input id="FILTER_682" name="FILTER_682" placeholder="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"机构编码")%>,<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"机构名称")%>" style="padding: 6px 30px 6px 10px;min-height:24px;font-size:12px" title="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"机构编码")%>,<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"机构名称")%>" type="text" class="form-control" oninput="grid_ORG_COMPDIS_LIST_fun11_682()" />
				<i class="icon-search" style="position: absolute;right: 12px;top: 2px;cursor: pointer;"></i>
			</td>
            </tr>
        </table>
    </div>
</div>
		<div class="BTNGROUP BTNGROUP_682" style="margin:5px auto; display:inline-block;height: 30px;z-index: 6;">
			<div style="margin-right:10px;display:inline-block">
			    <input type="button" id="introduceORG_COMPDIS_LIST"  class="btn btn-primary" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"引入")%> onclick="introduceORG_COMPDIS_LIST_click_682()"/>
			</div>
			<div style="margin-right:10px;display:inline-block">
			    <input type="button" id="editORG_COMPDIS_LIST"  class="btn btn-warning" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"修改")%> onclick="editORG_COMPDIS_LIST_click_682()"/>
			</div>
			<div style="margin-right:10px;display:inline-block">
			    <input type="button" id="removeORG_COMPDIS_LIST"  class="btn btn-danger" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"删除")%> onclick="removeORG_COMPDIS_LIST_click_682()"/>
			</div>
			<div style="margin-right:10px;display:inline-block">
			    <input type="button" id="executeSQLORG_COMPDIS_LIST"  class="btn btn-success" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"生效")%> onclick="executeSQLORG_COMPDIS_LIST_click_682()"/>
			</div>
		</div>
<table id="ORG_COMPDIS_LIST_List">
</table>
<div id="activity_pane" style="position:absolute;left:500px;top:70px"></div>
		</div>
</div>
</div>
</div>
</form>
<script type="text/javascript" src="<%=request.getContextPath() %>/jsp/formbuild/org_manage/org_compan/org_companyInfo/org_compMutil_list.js"></script>
<script>
var heightGadedata_672 =[];
var containerParam_672 ={};
containerParam_672 ={};
function changeHeightGadedata_672(data){
	heightGadedata_672 = data;
}
var heightGadedata_676 =[];
var containerParam_676 ={};
containerParam_676 ={};
function changeHeightGadedata_676(data){
	heightGadedata_676 = data;
}
var heightGadedata_679 =[];
var containerParam_679 ={};
containerParam_679 ={};
function changeHeightGadedata_679(data){
	heightGadedata_679 = data;
}
var heightGadedata_682 =[];
var containerParam_682 ={};
containerParam_682 ={};
function changeHeightGadedata_682(data){
	heightGadedata_682 = data;
}
$(function() {
    querys_672();
	var x0=0;
	var x1=0;
	var x2=0;
	var x3=0;
	$('#myTab a').click(function (e) {
			e.preventDefault();
			var x = $(this)[0].innerHTML;
	if(x=="机构信息列表"){
			if(x0==0){
		if('${param.activeTab}'!=''){
			changeShowTab('0');
		};
			$(this).tab('show');
			var tab = this.hash;
var tab2 = $(tab).find('table').bootstrapTable('refresh');
			changeQueryGrid('ORG_COMP_CARD_List');
			}else{
			$(this).tab('show');
			var tab = this.hash;
var tab2 = $(tab).find('table').bootstrapTable('refresh');
			}
			x0++;
			}
	if(x=="机构登记列表"){
			if(x1==0){
			querys_676();
		if('${param.activeTab}'!=''){
			changeShowTab('1');
		};
			$(this).tab('show');
			var tab = this.hash;
var tab2 = $(tab).find('table').bootstrapTable('refresh');
			changeQueryGrid('ORG_COMPADD_LIST_List');
			}else{
			$(this).tab('show');
			var tab = this.hash;
var tab2 = $(tab).find('table').bootstrapTable('refresh');
			}
			x1++;
			}
	if(x=="机构变更列表"){
			if(x2==0){
			querys_679();
		if('${param.activeTab}'!=''){
			changeShowTab('2');
		};
			$(this).tab('show');
			var tab = this.hash;
var tab2 = $(tab).find('table').bootstrapTable('refresh');
			changeQueryGrid('ORG_COMPEDIT_LIST_List');
			}else{
			$(this).tab('show');
			var tab = this.hash;
var tab2 = $(tab).find('table').bootstrapTable('refresh');
			}
			x2++;
			}
	if(x=="机构失效列表"){
			if(x3==0){
			querys_682();
		if('${param.activeTab}'!=''){
			changeShowTab('3');
		};
			$(this).tab('show');
			var tab = this.hash;
var tab2 = $(tab).find('table').bootstrapTable('refresh');
			changeQueryGrid('ORG_COMPDIS_LIST_List');
			}else{
			$(this).tab('show');
			var tab = this.hash;
var tab2 = $(tab).find('table').bootstrapTable('refresh');
			}
			x3++;
			}
	});
gridPatterns1();

    cardSelectInitFunctionx_grid('${param.formType}');
    cardDateWidInitFunction();
    //showMoreBtn($(".BTNGROUP_672"));
    //showMoreBtn($(".BTNGROUP_676"));
    //showMoreBtn($(".BTNGROUP_679"));
    //showMoreBtn($(".BTNGROUP_682"));
changeQueryGrid0();
showTabActive('${param.activeTab}');
});
	var _formId_672='672';
var realFormId='${param.formId}';
	var _formId_676='676';
var realFormId='${param.formId}';
	var _formId_679='679';
var realFormId='${param.formId}';
	var _formId_682='682';
var realFormId='${param.formId}';
var ORGVCOMPANY_ORGCODE;



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
    function querys_672() {
        initRoleColumn('672');
        initRoleButtons('672','ORG_COMP_CARD');
        $("#ORG_COMP_CARD_List").bootstrapTable({
            url :'${pageContext.request.contextPath }/form/cardformInitData.action',
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
            queryParams : grid_ORG_COMP_CARD_fun,
            cache : false,
            pageSize : 20, 
            pageList : [20,100,500,1000], 
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
                title : '机构行业',
                field : 'ORGCOMPANY_COMPTRADE',
                visible :false,
            },{
                title : '机构行业',
                field : 'ORGCOMPANY_COMPTRADE_DICTNAME',
                align : 'center',
                visible : false,
                valign : 'left',
				  sortable: true,
                formatter: function (value, row, index) {
						if(value==undefined||value=='null'||value==''){
        					value='-';
    					}
                    	return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANY_COMPTRADE\" title=\""+value+"\">"+value+"</a>";
                }
            },

  {
                title : '预留1',
                field : 'ORGCOMPANY_ORGGROUP1',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANY_ORGGROUP1\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"预留1\">"+value+"</a>";
                }
            },
  {
                title : '预留2',
                field : 'ORGCOMPANY_ORGGROUP2',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANY_ORGGROUP2\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"预留2\">"+value+"</a>";
                }
            },
  {
                title : '预留3',
                field : 'ORGCOMPANY_ORGGROUP3',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANY_ORGGROUP3\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"预留3\">"+value+"</a>";
                }
            },
  {
                title : '预留4',
                field : 'ORGCOMPANY_ORGGROUP4',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANY_ORGGROUP4\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"预留4\">"+value+"</a>";
                }
            },
  {
                title : '预留5',
                field : 'ORGCOMPANY_ORGGROUP5',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANY_ORGGROUP5\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"预留5\">"+value+"</a>";
                }
            },
            {
                title : '是否失效',
                field : 'ORGCOMPANY_ISDISABLED',
                visible :false,
            },{
                title : '是否失效',
                field : 'ORGCOMPANY_ISDISABLED_DICTNAME',
                align : 'center',
                visible : false,
                valign : 'left',
				  sortable: true,
                formatter: function (value, row, index) {
						if(value==undefined||value=='null'||value==''){
        					value='-';
    					}
                    	return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANY_ISDISABLED\" title=\""+value+"\">"+value+"</a>";
                }
            },

  {
                title : '机构ID',
                field : 'ORGCOMPANY_COMPID',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANY_COMPID\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"机构ID\">"+value+"</a>";
                }
            },
  {
                title : '租户ID',
                field : 'ORGCOMPANY_ZUID',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANY_ZUID\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"租户ID\">"+value+"</a>";
                }
            },
  {
                title : '组织码',
                field : 'ORGVCOMPANY_ORGCODE',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGVCOMPANY_ORGCODE\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"组织码\">"+value+"</a>";
                }
            },
            {
                title : '是否享受海岛津贴',
                field : 'ORGCOMPANY_ISALLOW',
                visible :false,
            },{
                title : '是否享受海岛津贴',
                field : 'ORGCOMPANY_ISALLOW_DICTNAME',
                align : 'center',
                visible : false,
                valign : 'left',
				  sortable: true,
                formatter: function (value, row, index) {
						if(value==undefined||value=='null'||value==''){
        					value='-';
    					}
                    	return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANY_ISALLOW\" title=\""+value+"\">"+value+"</a>";
                }
            },

            {
                title : '是否保护期',
                field : 'ORGCOMPANY_ISPROTECT',
                visible :false,
            },{
                title : '是否保护期',
                field : 'ORGCOMPANY_ISPROTECT_DICTNAME',
                align : 'center',
                visible : false,
                valign : 'left',
				  sortable: true,
                formatter: function (value, row, index) {
						if(value==undefined||value=='null'||value==''){
        					value='-';
    					}
                    	return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANY_ISPROTECT\" title=\""+value+"\">"+value+"</a>";
                }
            },

            {
                title : '挂片领导',
                field : 'ORGCOMPANY_HANGLEADER',
                visible :false,
            },{
                title : '挂片领导',
                field : 'ORGCOMPANY_HANGLEADER_DICTNAME',
                align : 'center',
                visible : false,
                valign : 'left',
				  sortable: true,
                formatter: function (value, row, index) {
						if(value==undefined||value=='null'||value==''){
        					value='-';
    					}
                    	return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANY_HANGLEADER\" title=\""+value+"\">"+value+"</a>";
                }
            },

            {
                title : '是否人行金融机构',
                field : 'ORGCOMPANY_ORG_ISFININSTITU',
                visible :false,
            },{
                title : '是否人行金融机构',
                field : 'ORGCOMPANY_ORG_ISFININSTITU_DICTNAME',
                align : 'center',
                visible : false,
                valign : 'left',
				  sortable: true,
                formatter: function (value, row, index) {
						if(value==undefined||value=='null'||value==''){
        					value='-';
    					}
                    	return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANY_ORG_ISFININSTITU\" title=\""+value+"\">"+value+"</a>";
                }
            },

  {
                title : '人行金融机构代码',
                field : 'ORGCOMPANY_ORG_FININSTITU',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANY_ORG_FININSTITU\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"人行金融机构代码\">"+value+"</a>";
                }
            },
  {
                title : '网点号',
                field : 'ORGCOMPANY_ORG_WEBNUM',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANY_ORG_WEBNUM\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"网点号\">"+value+"</a>";
                }
            },
  {
                title : '省联社机构代码',
                field : 'ORGCOMPANY_ORG_PROAGENCCODE',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANY_ORG_PROAGENCCODE\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"省联社机构代码\">"+value+"</a>";
                }
            },
  {
                title : '机构编码',
                field : 'ORGCOMPANY_COMPCODE',
                align : 'center',
                visible : columnvisible.ORGCOMPANY_compcode,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANY_COMPCODE\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"机构编码\">"+value+"</a>";
                }
            },
  {
                title : '主键',
                field : 'ORGVCOMPANY_ID',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"ORGVCOMPANY_ID\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"主键\">"+value+"</a>";
                }
            },
  {
                title : '机构名称',
                field : 'ORGCOMPANY_CNAME',
                align : 'center',
                visible : columnvisible.ORGCOMPANY_cname,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a onmouseover=\"openNew('"+row.ORGCOMPANY_COMPID+"')\" class=\"eli w\" style=\"font-size:12px;text-decoration:underline;color:black;width:100px;\" name=\"ORGCOMPANY_CNAME\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"机构名称\">"+value+"</a>";
                }
            },
            {
                title : '机构类型',
                field : 'ORGCOMPANY_COMPTYPE',
                visible :false,
            },{
                title : '机构类型',
                field : 'ORGCOMPANY_COMPTYPE_DICTNAME',
                align : 'center',
                visible : columnvisible.ORGCOMPANY_comptype,
                valign : 'left',
				  sortable: true,
                formatter: function (value, row, index) {
						if(value==undefined||value=='null'||value==''){
        					value='-';
    					}
                    	return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANY_COMPTYPE\" title=\""+value+"\">"+value+"</a>";
                }
            },

            {
                title : '上级机构',
                field : 'ORGCOMPANY_PARENTID',
                visible :false,
            },{
                title : '上级机构',
                field : 'ORGCOMPANY_PARENTID_DICTNAME',
                align : 'center',
                visible : columnvisible.ORGCOMPANY_parentid,
                valign : 'left',
				  sortable: true,
                formatter: function (value, row, index) {
						if(value==undefined||value=='null'||value==''){
        					value='-';
    					}
                    	return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANY_PARENTID\" title=\""+value+"\">"+value+"</a>";
                }
            },

  {
                title : '法人代表',
                field : 'ORGCOMPANY_LEGALPERSON',
                align : 'center',
                visible : columnvisible.ORGCOMPANY_legalperson,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANY_LEGALPERSON\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"法人代表\">"+value+"</a>";
                }
            },
  {
                title : '机构地址',
                field : 'ORGCOMPANY_ORGADDRESS',
                align : 'center',
                visible : columnvisible.ORGCOMPANY_orgaddress,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANY_ORGADDRESS\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"机构地址\">"+value+"</a>";
                }
            },
  {
                title : '联系电话',
                field : 'ORGCOMPANY_TELPHONE',
                align : 'center',
                visible : columnvisible.ORGCOMPANY_telphone,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANY_TELPHONE\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"联系电话\">"+value+"</a>";
                }
            },
            {
                title : '机构状态',
                field : 'ORGCOMPANY_COMPSTATUS',
                visible :false,
            },{
                title : '机构状态',
                field : 'ORGCOMPANY_COMPSTATUS_DICTNAME',
                align : 'center',
                visible : columnvisible.ORGCOMPANY_compStatus,
                valign : 'left',
				  sortable: true,
                formatter: function (value, row, index) {
						if(value==undefined||value=='null'||value==''){
        					value='-';
    					}
                    	return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANY_COMPSTATUS\" title=\""+value+"\">"+value+"</a>";
                }
            },

  {
                title : '机构简称',
                field : 'ORGCOMPANY_ENAME',
                align : 'center',
                visible : columnvisible.ORGCOMPANY_ename,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANY_ENAME\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"机构简称\">"+value+"</a>";
                }
            },
            {
                title : '机构级别',
                field : 'ORGCOMPANY_COMPLEVEL',
                visible :false,
            },{
                title : '机构级别',
                field : 'ORGCOMPANY_COMPLEVEL_DICTNAME',
                align : 'center',
                visible : columnvisible.ORGCOMPANY_complevel,
                valign : 'left',
				  sortable: true,
                formatter: function (value, row, index) {
						if(value==undefined||value=='null'||value==''){
        					value='-';
    					}
                    	return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANY_COMPLEVEL\" title=\""+value+"\">"+value+"</a>";
                }
            },

            {
                title : '机构区域',
                field : 'ORGCOMPANY_COMPAREA',
                visible :false,
            },{
                title : '机构区域',
                field : 'ORGCOMPANY_COMPAREA_DICTNAME',
                align : 'center',
                visible : columnvisible.ORGCOMPANY_comparea,
                valign : 'left',
				  sortable: true,
                formatter: function (value, row, index) {
						if(value==undefined||value=='null'||value==''){
        					value='-';
    					}
                    	return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANY_COMPAREA\" title=\""+value+"\">"+value+"</a>";
                }
            },

            {
                title : '成立日期',
                field : 'ORGCOMPANY_CREATEDATE',
                align : 'center',
                visible : columnvisible.ORGCOMPANY_createdate,
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
        return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:100px\" name=\"ORGCOMPANY_CREATEDATE\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"成立日期\">"+date+"</a>";
                }
            },
  {
                title : '注册地址',
                field : 'ORGCOMPANY_REGADDRESS',
                align : 'center',
                visible : columnvisible.ORGCOMPANY_regaddress,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANY_REGADDRESS\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"注册地址\">"+value+"</a>";
                }
            },
  {
                title : '邮政编码',
                field : 'ORGCOMPANY_POSTCODE',
                align : 'center',
                visible : columnvisible.ORGCOMPANY_postcode,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANY_POSTCODE\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"邮政编码\">"+value+"</a>";
                }
            },
  {
                title : '传真号码',
                field : 'ORGCOMPANY_FAX',
                align : 'center',
                visible : columnvisible.ORGCOMPANY_fax,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANY_FAX\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"传真号码\">"+value+"</a>";
                }
            },
  {
                title : '机构网站',
                field : 'ORGCOMPANY_WEBSITE',
                align : 'center',
                visible : columnvisible.ORGCOMPANY_website,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANY_WEBSITE\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"机构网站\">"+value+"</a>";
                }
            },
  {
                title : '排序',
                field : 'ORGCOMPANY_XORDER',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANY_XORDER\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"排序\">"+value+"</a>";
                }
            },
  {
                title : '备注',
                field : 'ORGCOMPANY_REMARK',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANY_REMARK\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"备注\">"+value+"</a>";
                }
            },
  {
                title : '失效日期',
                field : 'ORGCOMPANY_DISABLEDDATE',
                align : 'center',
                visible : columnvisible.ORGCOMPANY_disableddate,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"ORGCOMPANY_DISABLEDDATE\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"失效日期\">"+value+"</a>";
                }
            },
  {
                title : '组织码',
                field : 'ORGCOMPANY_ORGCODE',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANY_ORGCODE\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"组织码\">"+value+"</a>";
                }
            },
            {
                title : '最近修改日期',
                field : 'ORGCOMPANY_UPDATETIME',
                align : 'center',
                visible : columnvisible.ORGCOMPANY_updatetime,
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
        return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px\" name=\"ORGCOMPANY_UPDATETIME\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"最近修改日期\">"+date+"</a>";
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
				  changeColor('ORG_COMP_CARD_List');
		},
		onLoadSuccess: function (aa, bb, cc) {
				  changeColor('ORG_COMP_CARD_List');
                $("#ORG_COMP_CARD_List a").editable({
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
        	editORG_COMP_CARD_click_672('isView',row);  
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
	function grid_ORG_COMP_CARD_HeighQuery_672() {
		layer.open({
			type: 2,
			showMaxButton: true,
			title:"<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"高级查询设置")%>" ,
			area: ['855', '500'],
			maxmin: true,
			content:'/myehr/jsp/form/button/heightGrade.jsp?formFunction=grid_ORG_COMP_CARD_fun11_672&formDefId=672&formDefLayout=2',
			success:function(layero,index){
				},
				end:function(){
			}
			});
	}
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
    function querys_676() {
        initRoleColumn('676');
        initRoleButtons('676','ORG_COMPADD_LIST');
        $("#ORG_COMPADD_LIST_List").bootstrapTable({
            url :'${pageContext.request.contextPath }/form/cardformInitData.action',
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
            queryParams : grid_ORG_COMPADD_LIST_fun,
            cache : false,
            pageSize : 20, 
            pageList : [20,100,500,1000], 
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
                title : '主键',
                field : 'ORGCOMPANYREG_ID',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_ID\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"主键\">"+value+"</a>";
                }
            },
  {
                title : '操作类型',
                field : 'ORGCOMPANYREG_XTYPE',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_XTYPE\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"操作类型\">"+value+"</a>";
                }
            },
  {
                title : '机构ID',
                field : 'ORGCOMPANYREG_COMPID',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_COMPID\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"机构ID\">"+value+"</a>";
                }
            },
            {
                title : '机构行业',
                field : 'ORGCOMPANYREG_COMPTRADE',
                visible :false,
            },{
                title : '机构行业',
                field : 'ORGCOMPANYREG_COMPTRADE_DICTNAME',
                align : 'center',
                visible : false,
                valign : 'left',
				  sortable: true,
                formatter: function (value, row, index) {
						if(value==undefined||value=='null'||value==''){
        					value='-';
    					}
                    	return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_COMPTRADE\" title=\""+value+"\">"+value+"</a>";
                }
            },

  {
                title : '预留1',
                field : 'ORGCOMPANYREG_ORGGROUP1',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_ORGGROUP1\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"预留1\">"+value+"</a>";
                }
            },
  {
                title : '预留2',
                field : 'ORGCOMPANYREG_ORGGROUP2',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_ORGGROUP2\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"预留2\">"+value+"</a>";
                }
            },
  {
                title : '预留3',
                field : 'ORGCOMPANYREG_ORGGROUP3',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_ORGGROUP3\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"预留3\">"+value+"</a>";
                }
            },
  {
                title : '预留4',
                field : 'ORGCOMPANYREG_ORGGROUP4',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_ORGGROUP4\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"预留4\">"+value+"</a>";
                }
            },
  {
                title : '预留5',
                field : 'ORGCOMPANYREG_ORGGROUP5',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_ORGGROUP5\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"预留5\">"+value+"</a>";
                }
            },
  {
                title : '租户ID',
                field : 'ORGCOMPANYREG_ZUID',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_ZUID\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"租户ID\">"+value+"</a>";
                }
            },
  {
                title : '生效',
                field : 'ORGCOMPANYREG_VALID',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_VALID\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"生效\">"+value+"</a>";
                }
            },
  {
                title : '生效人',
                field : 'ORGCOMPANYREG_VALIDBY',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_VALIDBY\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"生效人\">"+value+"</a>";
                }
            },
            {
                title : '是否享受海岛津贴',
                field : 'ORGCOMPANYREG_ISALLOW',
                visible :false,
            },{
                title : '是否享受海岛津贴',
                field : 'ORGCOMPANYREG_ISALLOW_DICTNAME',
                align : 'center',
                visible : false,
                valign : '',
				  sortable: true,
                formatter: function (value, row, index) {
						if(value==undefined||value=='null'||value==''){
        					value='-';
    					}
                    	return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_ISALLOW\" title=\""+value+"\">"+value+"</a>";
                }
            },

            {
                title : '是否保护期',
                field : 'ORGCOMPANYREG_ISPROTECT',
                visible :false,
            },{
                title : '是否保护期',
                field : 'ORGCOMPANYREG_ISPROTECT_DICTNAME',
                align : 'center',
                visible : false,
                valign : '',
				  sortable: true,
                formatter: function (value, row, index) {
						if(value==undefined||value=='null'||value==''){
        					value='-';
    					}
                    	return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_ISPROTECT\" title=\""+value+"\">"+value+"</a>";
                }
            },

  {
                title : '机构码',
                field : 'ORGCOMPANYREG_ORGCODE',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_ORGCODE\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"机构码\">"+value+"</a>";
                }
            },
            {
                title : '挂片领导',
                field : 'ORGCOMPANYREG_HANGLEADER',
                visible :false,
            },{
                title : '挂片领导',
                field : 'ORGCOMPANYREG_HANGLEADER_DICTNAME',
                align : 'center',
                visible : false,
                valign : '',
				  sortable: true,
                formatter: function (value, row, index) {
						if(value==undefined||value=='null'||value==''){
        					value='-';
    					}
                    	return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_HANGLEADER\" title=\""+value+"\">"+value+"</a>";
                }
            },

            {
                title : '是否人行金融机构',
                field : 'ORGCOMPANYREG_ORG_ISFININSTITU',
                visible :false,
            },{
                title : '是否人行金融机构',
                field : 'ORGCOMPANYREG_ORG_ISFININSTITU_DICTNAME',
                align : 'center',
                visible : false,
                valign : 'left',
				  sortable: true,
                formatter: function (value, row, index) {
						if(value==undefined||value=='null'||value==''){
        					value='-';
    					}
                    	return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_ORG_ISFININSTITU\" title=\""+value+"\">"+value+"</a>";
                }
            },

  {
                title : '人行金融机构代码',
                field : 'ORGCOMPANYREG_ORG_FININSTITU',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_ORG_FININSTITU\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"人行金融机构代码\">"+value+"</a>";
                }
            },
  {
                title : '网点号',
                field : 'ORGCOMPANYREG_ORG_WEBNUM',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_ORG_WEBNUM\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"网点号\">"+value+"</a>";
                }
            },
  {
                title : '省联社机构代码',
                field : 'ORGCOMPANYREG_ORG_PROAGENCCODE',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_ORG_PROAGENCCODE\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"省联社机构代码\">"+value+"</a>";
                }
            },
  {
                title : '机构编码',
                field : 'ORGCOMPANYREG_COMPCODE',
                align : 'center',
                visible : columnvisible.ORGCOMPANYREG_compcode,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_COMPCODE\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"机构编码\">"+value+"</a>";
                }
            },
  {
                title : '机构名称',
                field : 'ORGCOMPANYREG_CNAME',
                align : 'center',
                visible : columnvisible.ORGCOMPANYREG_cname,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_CNAME\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"机构名称\">"+value+"</a>";
                }
            },
            {
                title : '机构类型',
                field : 'ORGCOMPANYREG_COMPTYPE',
                visible :false,
            },{
                title : '机构类型',
                field : 'ORGCOMPANYREG_COMPTYPE_DICTNAME',
                align : 'center',
                visible : columnvisible.ORGCOMPANYREG_comptype,
                valign : 'left',
				  sortable: true,
                formatter: function (value, row, index) {
						if(value==undefined||value=='null'||value==''){
        					value='-';
    					}
                    	return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_COMPTYPE\" title=\""+value+"\">"+value+"</a>";
                }
            },

            {
                title : '上级机构',
                field : 'ORGCOMPANYREG_PARENTID',
                visible :false,
            },{
                title : '上级机构',
                field : 'ORGCOMPANYREG_PARENTID_DICTNAME',
                align : 'center',
                visible : columnvisible.ORGCOMPANYREG_parentid,
                valign : 'left',
				  sortable: true,
                formatter: function (value, row, index) {
						if(value==undefined||value=='null'||value==''){
        					value='-';
    					}
                    	return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_PARENTID\" title=\""+value+"\">"+value+"</a>";
                }
            },

  {
                title : '法人代表',
                field : 'ORGCOMPANYREG_LEGALPERSON',
                align : 'center',
                visible : columnvisible.ORGCOMPANYREG_legalperson,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_LEGALPERSON\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"法人代表\">"+value+"</a>";
                }
            },
  {
                title : '机构地址',
                field : 'ORGCOMPANYREG_ORGADDRESS',
                align : 'center',
                visible : columnvisible.ORGCOMPANYREG_orgaddress,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_ORGADDRESS\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"机构地址\">"+value+"</a>";
                }
            },
  {
                title : '联系电话',
                field : 'ORGCOMPANYREG_TELPHONE',
                align : 'center',
                visible : columnvisible.ORGCOMPANYREG_telphone,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_TELPHONE\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"联系电话\">"+value+"</a>";
                }
            },
            {
                title : '机构状态',
                field : 'ORGCOMPANYREG_COMPSTATUS',
                visible :false,
            },{
                title : '机构状态',
                field : 'ORGCOMPANYREG_COMPSTATUS_DICTNAME',
                align : 'center',
                visible : columnvisible.ORGCOMPANYREG_compStatus,
                valign : 'left',
				  sortable: true,
                formatter: function (value, row, index) {
						if(value==undefined||value=='null'||value==''){
        					value='-';
    					}
                    	return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_COMPSTATUS\" title=\""+value+"\">"+value+"</a>";
                }
            },

  {
                title : '机构简称',
                field : 'ORGCOMPANYREG_ENAME',
                align : 'center',
                visible : columnvisible.ORGCOMPANYREG_ename,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_ENAME\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"机构简称\">"+value+"</a>";
                }
            },
            {
                title : '机构级别',
                field : 'ORGCOMPANYREG_COMPLEVEL',
                visible :false,
            },{
                title : '机构级别',
                field : 'ORGCOMPANYREG_COMPLEVEL_DICTNAME',
                align : 'center',
                visible : columnvisible.ORGCOMPANYREG_complevel,
                valign : 'left',
				  sortable: true,
                formatter: function (value, row, index) {
						if(value==undefined||value=='null'||value==''){
        					value='-';
    					}
                    	return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_COMPLEVEL\" title=\""+value+"\">"+value+"</a>";
                }
            },

            {
                title : '机构区域',
                field : 'ORGCOMPANYREG_COMPAREA',
                visible :false,
            },{
                title : '机构区域',
                field : 'ORGCOMPANYREG_COMPAREA_DICTNAME',
                align : 'center',
                visible : columnvisible.ORGCOMPANYREG_comparea,
                valign : 'left',
				  sortable: true,
                formatter: function (value, row, index) {
						if(value==undefined||value=='null'||value==''){
        					value='-';
    					}
                    	return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_COMPAREA\" title=\""+value+"\">"+value+"</a>";
                }
            },

            {
                title : '成立日期',
                field : 'ORGCOMPANYREG_VALIDDATE',
                align : 'center',
                visible : columnvisible.ORGCOMPANYREG_VALIDDATE,
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
        return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:100px\" name=\"ORGCOMPANYREG_VALIDDATE\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"成立日期\">"+date+"</a>";
                }
            },
  {
                title : '注册地址',
                field : 'ORGCOMPANYREG_REGADDRESS',
                align : 'center',
                visible : columnvisible.ORGCOMPANYREG_regaddress,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_REGADDRESS\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"注册地址\">"+value+"</a>";
                }
            },
  {
                title : '邮政编码',
                field : 'ORGCOMPANYREG_POSTCODE',
                align : 'center',
                visible : columnvisible.ORGCOMPANYREG_postcode,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_POSTCODE\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"邮政编码\">"+value+"</a>";
                }
            },
  {
                title : '传真号码',
                field : 'ORGCOMPANYREG_FAX',
                align : 'center',
                visible : columnvisible.ORGCOMPANYREG_fax,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_FAX\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"传真号码\">"+value+"</a>";
                }
            },
  {
                title : '机构网站',
                field : 'ORGCOMPANYREG_WEBSITE',
                align : 'center',
                visible : columnvisible.ORGCOMPANYREG_website,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_WEBSITE\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"机构网站\">"+value+"</a>";
                }
            },
            {
                title : '登记人',
                field : 'ORGCOMPANYREG_REGBY',
                visible :false,
            },{
                title : '登记人',
                field : 'ORGCOMPANYREG_REGBY_DICTNAME',
                align : 'center',
                visible : columnvisible.ORGCOMPANYREG_regby,
                valign : 'left',
				  sortable: true,
                formatter: function (value, row, index) {
						if(value==undefined||value=='null'||value==''){
        					value='-';
    					}
                    	return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_REGBY\" title=\""+value+"\">"+value+"</a>";
                }
            },

            {
                title : '登记时间',
                field : 'ORGCOMPANYREG_REGTIME',
                align : 'center',
                visible : columnvisible.ORGCOMPANYREG_regtime,
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
        return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:100px\" name=\"ORGCOMPANYREG_REGTIME\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"登记时间\">"+date+"</a>";
                }
            },
  {
                title : '排序',
                field : 'ORGCOMPANYREG_XORDER',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_XORDER\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"排序\">"+value+"</a>";
                }
            },
  {
                title : '备注',
                field : 'ORGCOMPANYREG_REMARK',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_REMARK\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"备注\">"+value+"</a>";
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
				  changeColor('ORG_COMPADD_LIST_List');
		},
		onLoadSuccess: function (aa, bb, cc) {
				  changeColor('ORG_COMPADD_LIST_List');
                $("#ORG_COMPADD_LIST_List a").editable({
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
        	editORG_COMPADD_LIST_click_676('isView',row);  
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
	function grid_ORG_COMPADD_LIST_HeighQuery_676() {
		layer.open({
			type: 2,
			showMaxButton: true,
			title:"<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"高级查询设置")%>" ,
			area: ['855', '500'],
			maxmin: true,
			content:'/myehr/jsp/form/button/heightGrade.jsp?formFunction=grid_ORG_COMPADD_LIST_fun11_676&formDefId=676&formDefLayout=2',
			success:function(layero,index){
				},
				end:function(){
			}
			});
	}
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
    function querys_679() {
        initRoleColumn('679');
        initRoleButtons('679','ORG_COMPEDIT_LIST');
        $("#ORG_COMPEDIT_LIST_List").bootstrapTable({
            url :'${pageContext.request.contextPath }/form/cardformInitData.action',
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
            queryParams : grid_ORG_COMPEDIT_LIST_fun,
            cache : false,
            pageSize : 20, 
            pageList : [20,100,500,1000], 
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
                title : '主键',
                field : 'ORGCOMPANYREG_ID',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_ID\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"主键\">"+value+"</a>";
                }
            },
            {
                title : '操作类型',
                field : 'ORGCOMPANYREG_XTYPE',
                visible :false,
            },{
                title : '操作类型',
                field : 'ORGCOMPANYREG_XTYPE_DICTNAME',
                align : 'center',
                visible : false,
                valign : 'left',
				  sortable: true,
                formatter: function (value, row, index) {
						if(value==undefined||value=='null'||value==''){
        					value='-';
    					}
                    	return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_XTYPE\" title=\""+value+"\">"+value+"</a>";
                }
            },

  {
                title : '机构ID',
                field : 'ORGCOMPANYREG_COMPID',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_COMPID\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"机构ID\">"+value+"</a>";
                }
            },
  {
                title : '机构行业',
                field : 'ORGCOMPANYREG_COMPTRADE',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_COMPTRADE\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"机构行业\">"+value+"</a>";
                }
            },
  {
                title : '预留1',
                field : 'ORGCOMPANYREG_ORGGROUP1',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_ORGGROUP1\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"预留1\">"+value+"</a>";
                }
            },
  {
                title : '预留2',
                field : 'ORGCOMPANYREG_ORGGROUP2',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_ORGGROUP2\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"预留2\">"+value+"</a>";
                }
            },
  {
                title : '预留3',
                field : 'ORGCOMPANYREG_ORGGROUP3',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_ORGGROUP3\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"预留3\">"+value+"</a>";
                }
            },
  {
                title : '预留4',
                field : 'ORGCOMPANYREG_ORGGROUP4',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_ORGGROUP4\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"预留4\">"+value+"</a>";
                }
            },
  {
                title : '预留5',
                field : 'ORGCOMPANYREG_ORGGROUP5',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_ORGGROUP5\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"预留5\">"+value+"</a>";
                }
            },
  {
                title : '租户ID',
                field : 'ORGCOMPANYREG_ZUID',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_ZUID\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"租户ID\">"+value+"</a>";
                }
            },
            {
                title : '是否享受海岛津贴',
                field : 'ORGCOMPANYREG_ISALLOW',
                visible :false,
            },{
                title : '是否享受海岛津贴',
                field : 'ORGCOMPANYREG_ISALLOW_DICTNAME',
                align : 'center',
                visible : false,
                valign : 'left',
				  sortable: true,
                formatter: function (value, row, index) {
						if(value==undefined||value=='null'||value==''){
        					value='-';
    					}
                    	return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_ISALLOW\" title=\""+value+"\">"+value+"</a>";
                }
            },

            {
                title : '是否保护期',
                field : 'ORGCOMPANYREG_ISPROTECT',
                visible :false,
            },{
                title : '是否保护期',
                field : 'ORGCOMPANYREG_ISPROTECT_DICTNAME',
                align : 'center',
                visible : false,
                valign : 'left',
				  sortable: true,
                formatter: function (value, row, index) {
						if(value==undefined||value=='null'||value==''){
        					value='-';
    					}
                    	return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_ISPROTECT\" title=\""+value+"\">"+value+"</a>";
                }
            },

  {
                title : '机构码',
                field : 'ORGCOMPANYREG_ORGCODE',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_ORGCODE\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"机构码\">"+value+"</a>";
                }
            },
            {
                title : '挂片领导',
                field : 'ORGCOMPANYREG_HANGLEADER',
                visible :false,
            },{
                title : '挂片领导',
                field : 'ORGCOMPANYREG_HANGLEADER_DICTNAME',
                align : 'center',
                visible : false,
                valign : 'left',
				  sortable: true,
                formatter: function (value, row, index) {
						if(value==undefined||value=='null'||value==''){
        					value='-';
    					}
                    	return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_HANGLEADER\" title=\""+value+"\">"+value+"</a>";
                }
            },

  {
                title : '机构编码',
                field : 'ORGCOMPANYREG_COMPCODE',
                align : 'center',
                visible : columnvisible.ORGCOMPANYREG_compcode,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_COMPCODE\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"机构编码\">"+value+"</a>";
                }
            },
  {
                title : '机构名称',
                field : 'ORGCOMPANYREG_CNAME',
                align : 'center',
                visible : columnvisible.ORGCOMPANYREG_cname,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_CNAME\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"机构名称\">"+value+"</a>";
                }
            },
            {
                title : '机构类型',
                field : 'ORGCOMPANYREG_COMPTYPE',
                visible :false,
            },{
                title : '机构类型',
                field : 'ORGCOMPANYREG_COMPTYPE_DICTNAME',
                align : 'center',
                visible : columnvisible.ORGCOMPANYREG_comptype,
                valign : 'left',
				  sortable: true,
                formatter: function (value, row, index) {
						if(value==undefined||value=='null'||value==''){
        					value='-';
    					}
                    	return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"ORGCOMPANYREG_COMPTYPE\" title=\""+value+"\">"+value+"</a>";
                }
            },

            {
                title : '上级机构',
                field : 'ORGCOMPANYREG_PARENTID',
                visible :false,
            },{
                title : '上级机构',
                field : 'ORGCOMPANYREG_PARENTID_DICTNAME',
                align : 'center',
                visible : columnvisible.ORGCOMPANYREG_parentid,
                valign : 'left',
				  sortable: true,
                formatter: function (value, row, index) {
						if(value==undefined||value=='null'||value==''){
        					value='-';
    					}
                    	return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_PARENTID\" title=\""+value+"\">"+value+"</a>";
                }
            },

  {
                title : '法人代表',
                field : 'ORGCOMPANYREG_LEGALPERSON',
                align : 'center',
                visible : columnvisible.ORGCOMPANYREG_legalperson,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_LEGALPERSON\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"法人代表\">"+value+"</a>";
                }
            },
  {
                title : '机构地址',
                field : 'ORGCOMPANYREG_ORGADDRESS',
                align : 'center',
                visible : columnvisible.ORGCOMPANYREG_orgaddress,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_ORGADDRESS\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"机构地址\">"+value+"</a>";
                }
            },
  {
                title : '联系电话',
                field : 'ORGCOMPANYREG_TELPHONE',
                align : 'center',
                visible : columnvisible.ORGCOMPANYREG_telphone,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_TELPHONE\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"联系电话\">"+value+"</a>";
                }
            },
            {
                title : '机构状态',
                field : 'ORGCOMPANYREG_COMPSTATUS',
                visible :false,
            },{
                title : '机构状态',
                field : 'ORGCOMPANYREG_COMPSTATUS_DICTNAME',
                align : 'center',
                visible : columnvisible.ORGCOMPANYREG_compStatus,
                valign : 'left',
				  sortable: true,
                formatter: function (value, row, index) {
						if(value==undefined||value=='null'||value==''){
        					value='-';
    					}
                    	return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_COMPSTATUS\" title=\""+value+"\">"+value+"</a>";
                }
            },

  {
                title : '机构简称',
                field : 'ORGCOMPANYREG_ENAME',
                align : 'center',
                visible : columnvisible.ORGCOMPANYREG_ename,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_ENAME\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"机构简称\">"+value+"</a>";
                }
            },
            {
                title : '机构级别',
                field : 'ORGCOMPANYREG_COMPLEVEL',
                visible :false,
            },{
                title : '机构级别',
                field : 'ORGCOMPANYREG_COMPLEVEL_DICTNAME',
                align : 'center',
                visible : columnvisible.ORGCOMPANYREG_complevel,
                valign : 'left',
				  sortable: true,
                formatter: function (value, row, index) {
						if(value==undefined||value=='null'||value==''){
        					value='-';
    					}
                    	return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_COMPLEVEL\" title=\""+value+"\">"+value+"</a>";
                }
            },

            {
                title : '机构区域',
                field : 'ORGCOMPANYREG_COMPAREA',
                visible :false,
            },{
                title : '机构区域',
                field : 'ORGCOMPANYREG_COMPAREA_DICTNAME',
                align : 'center',
                visible : columnvisible.ORGCOMPANYREG_comparea,
                valign : 'left',
				  sortable: true,
                formatter: function (value, row, index) {
						if(value==undefined||value=='null'||value==''){
        					value='-';
    					}
                    	return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_COMPAREA\" title=\""+value+"\">"+value+"</a>";
                }
            },

            {
                title : '成立日期',
                field : 'ORGCOMPANYREG_VALIDDATE',
                align : 'center',
                visible : columnvisible.ORGCOMPANYREG_VALIDDATE,
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
        return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:100px\" name=\"ORGCOMPANYREG_VALIDDATE\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"成立日期\">"+date+"</a>";
                }
            },
  {
                title : '注册地址',
                field : 'ORGCOMPANYREG_REGADDRESS',
                align : 'center',
                visible : columnvisible.ORGCOMPANYREG_regaddress,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_REGADDRESS\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"注册地址\">"+value+"</a>";
                }
            },
  {
                title : '邮政编码',
                field : 'ORGCOMPANYREG_POSTCODE',
                align : 'center',
                visible : columnvisible.ORGCOMPANYREG_postcode,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_POSTCODE\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"邮政编码\">"+value+"</a>";
                }
            },
  {
                title : '传真号码',
                field : 'ORGCOMPANYREG_FAX',
                align : 'center',
                visible : columnvisible.ORGCOMPANYREG_fax,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_FAX\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"传真号码\">"+value+"</a>";
                }
            },
  {
                title : '机构网站',
                field : 'ORGCOMPANYREG_WEBSITE',
                align : 'center',
                visible : columnvisible.ORGCOMPANYREG_website,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_WEBSITE\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"机构网站\">"+value+"</a>";
                }
            },
            {
                title : '登记人',
                field : 'ORGCOMPANYREG_REGBY',
                visible :false,
            },{
                title : '登记人',
                field : 'ORGCOMPANYREG_REGBY_DICTNAME',
                align : 'center',
                visible : columnvisible.ORGCOMPANYREG_regby,
                valign : 'left',
				  sortable: true,
                formatter: function (value, row, index) {
						if(value==undefined||value=='null'||value==''){
        					value='-';
    					}
                    	return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_REGBY\" title=\""+value+"\">"+value+"</a>";
                }
            },

            {
                title : '登记时间',
                field : 'ORGCOMPANYREG_REGTIME',
                align : 'center',
                visible : columnvisible.ORGCOMPANYREG_regtime,
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
        return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:100px\" name=\"ORGCOMPANYREG_REGTIME\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"登记时间\">"+date+"</a>";
                }
            },
  {
                title : '排序',
                field : 'ORGCOMPANYREG_XORDER',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_XORDER\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"排序\">"+value+"</a>";
                }
            },
  {
                title : '备注',
                field : 'ORGCOMPANYREG_REMARK',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_REMARK\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"备注\">"+value+"</a>";
                }
            },
  {
                title : '生效',
                field : 'ORGCOMPANYREG_VALID',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_VALID\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"生效\">"+value+"</a>";
                }
            },
  {
                title : '生效人',
                field : 'ORGCOMPANYREG_VALIDBY',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_VALIDBY\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"生效人\">"+value+"</a>";
                }
            },
  {
                title : '人行金融机构代码',
                field : 'ORGCOMPANYREG_ORG_FININSTITU',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_ORG_FININSTITU\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"人行金融机构代码\">"+value+"</a>";
                }
            },
  {
                title : '省联社机构代码',
                field : 'ORGCOMPANYREG_ORG_PROAGENCCODE',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_ORG_PROAGENCCODE\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"省联社机构代码\">"+value+"</a>";
                }
            },
  {
                title : '网点号',
                field : 'ORGCOMPANYREG_ORG_WEBNUM',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_ORG_WEBNUM\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"网点号\">"+value+"</a>";
                }
            },
            {
                title : '是否人行金融机构',
                field : 'ORGCOMPANYREG_ORG_ISFININSTITU',
                visible :false,
            },{
                title : '是否人行金融机构',
                field : 'ORGCOMPANYREG_ORG_ISFININSTITU_DICTNAME',
                align : 'center',
                visible : false,
                valign : 'left',
				  sortable: true,
                formatter: function (value, row, index) {
						if(value==undefined||value=='null'||value==''){
        					value='-';
    					}
                    	return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_ORG_ISFININSTITU\" title=\""+value+"\">"+value+"</a>";
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
				  changeColor('ORG_COMPEDIT_LIST_List');
		},
		onLoadSuccess: function (aa, bb, cc) {
				  changeColor('ORG_COMPEDIT_LIST_List');
                $("#ORG_COMPEDIT_LIST_List a").editable({
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
        	editORG_COMPEDIT_LIST_click_679('isView',row);  
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
	function grid_ORG_COMPEDIT_LIST_HeighQuery_679() {
		layer.open({
			type: 2,
			showMaxButton: true,
			title:"<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"高级查询设置")%>" ,
			area: ['855', '500'],
			maxmin: true,
			content:'/myehr/jsp/form/button/heightGrade.jsp?formFunction=grid_ORG_COMPEDIT_LIST_fun11_679&formDefId=679&formDefLayout=2',
			success:function(layero,index){
				},
				end:function(){
			}
			});
	}
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
    function querys_682() {
        initRoleColumn('682');
        initRoleButtons('682','ORG_COMPDIS_LIST');
        $("#ORG_COMPDIS_LIST_List").bootstrapTable({
            url :'${pageContext.request.contextPath }/form/cardformInitData.action',
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
            queryParams : grid_ORG_COMPDIS_LIST_fun,
            cache : false,
            pageSize : 20, 
            pageList : [20,100,500,1000], 
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
                title : '主键',
                field : 'ORGCOMPANYREG_ID',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_ID\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"主键\">"+value+"</a>";
                }
            },
            {
                title : '操作类型',
                field : 'ORGCOMPANYREG_XTYPE',
                visible :false,
            },{
                title : '操作类型',
                field : 'ORGCOMPANYREG_XTYPE_DICTNAME',
                align : 'center',
                visible : false,
                valign : 'left',
				  sortable: true,
                formatter: function (value, row, index) {
						if(value==undefined||value=='null'||value==''){
        					value='-';
    					}
                    	return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_XTYPE\" title=\""+value+"\">"+value+"</a>";
                }
            },

  {
                title : '机构ID',
                field : 'ORGCOMPANYREG_COMPID',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_COMPID\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"机构ID\">"+value+"</a>";
                }
            },
            {
                title : '机构行业',
                field : 'ORGCOMPANYREG_COMPTRADE',
                visible :false,
            },{
                title : '机构行业',
                field : 'ORGCOMPANYREG_COMPTRADE_DICTNAME',
                align : 'center',
                visible : false,
                valign : 'left',
				  sortable: true,
                formatter: function (value, row, index) {
						if(value==undefined||value=='null'||value==''){
        					value='-';
    					}
                    	return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_COMPTRADE\" title=\""+value+"\">"+value+"</a>";
                }
            },

  {
                title : '预留1',
                field : 'ORGCOMPANYREG_ORGGROUP1',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_ORGGROUP1\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"预留1\">"+value+"</a>";
                }
            },
  {
                title : '预留2',
                field : 'ORGCOMPANYREG_ORGGROUP2',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_ORGGROUP2\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"预留2\">"+value+"</a>";
                }
            },
  {
                title : '预留3',
                field : 'ORGCOMPANYREG_ORGGROUP3',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_ORGGROUP3\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"预留3\">"+value+"</a>";
                }
            },
  {
                title : '预留4',
                field : 'ORGCOMPANYREG_ORGGROUP4',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_ORGGROUP4\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"预留4\">"+value+"</a>";
                }
            },
  {
                title : '预留5',
                field : 'ORGCOMPANYREG_ORGGROUP5',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_ORGGROUP5\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"预留5\">"+value+"</a>";
                }
            },
  {
                title : '租户ID',
                field : 'ORGCOMPANYREG_ZUID',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_ZUID\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"租户ID\">"+value+"</a>";
                }
            },
            {
                title : '是否享受海岛津贴',
                field : 'ORGCOMPANYREG_ISALLOW',
                visible :false,
            },{
                title : '是否享受海岛津贴',
                field : 'ORGCOMPANYREG_ISALLOW_DICTNAME',
                align : 'center',
                visible : false,
                valign : 'left',
				  sortable: true,
                formatter: function (value, row, index) {
						if(value==undefined||value=='null'||value==''){
        					value='-';
    					}
                    	return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_ISALLOW\" title=\""+value+"\">"+value+"</a>";
                }
            },

            {
                title : '是否保护期',
                field : 'ORGCOMPANYREG_ISPROTECT',
                visible :false,
            },{
                title : '是否保护期',
                field : 'ORGCOMPANYREG_ISPROTECT_DICTNAME',
                align : 'center',
                visible : false,
                valign : 'left',
				  sortable: true,
                formatter: function (value, row, index) {
						if(value==undefined||value=='null'||value==''){
        					value='-';
    					}
                    	return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_ISPROTECT\" title=\""+value+"\">"+value+"</a>";
                }
            },

  {
                title : '机构码',
                field : 'ORGCOMPANYREG_ORGCODE',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_ORGCODE\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"机构码\">"+value+"</a>";
                }
            },
            {
                title : '挂片领导',
                field : 'ORGCOMPANYREG_HANGLEADER',
                visible :false,
            },{
                title : '挂片领导',
                field : 'ORGCOMPANYREG_HANGLEADER_DICTNAME',
                align : 'center',
                visible : false,
                valign : 'left',
				  sortable: true,
                formatter: function (value, row, index) {
						if(value==undefined||value=='null'||value==''){
        					value='-';
    					}
                    	return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_HANGLEADER\" title=\""+value+"\">"+value+"</a>";
                }
            },

  {
                title : '机构编码',
                field : 'ORGCOMPANYREG_COMPCODE',
                align : 'center',
                visible : columnvisible.ORGCOMPANYREG_compcode,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_COMPCODE\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"机构编码\">"+value+"</a>";
                }
            },
  {
                title : '机构名称',
                field : 'ORGCOMPANYREG_CNAME',
                align : 'center',
                visible : columnvisible.ORGCOMPANYREG_cname,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_CNAME\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"机构名称\">"+value+"</a>";
                }
            },
            {
                title : '机构类型',
                field : 'ORGCOMPANYREG_COMPTYPE',
                visible :false,
            },{
                title : '机构类型',
                field : 'ORGCOMPANYREG_COMPTYPE_DICTNAME',
                align : 'center',
                visible : columnvisible.ORGCOMPANYREG_comptype,
                valign : 'left',
				  sortable: true,
                formatter: function (value, row, index) {
						if(value==undefined||value=='null'||value==''){
        					value='-';
    					}
                    	return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_COMPTYPE\" title=\""+value+"\">"+value+"</a>";
                }
            },

            {
                title : '上级机构',
                field : 'ORGCOMPANYREG_PARENTID',
                visible :false,
            },{
                title : '上级机构',
                field : 'ORGCOMPANYREG_PARENTID_DICTNAME',
                align : 'center',
                visible : columnvisible.ORGCOMPANYREG_parentid,
                valign : 'left',
				  sortable: true,
                formatter: function (value, row, index) {
						if(value==undefined||value=='null'||value==''){
        					value='-';
    					}
                    	return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_PARENTID\" title=\""+value+"\">"+value+"</a>";
                }
            },

  {
                title : '法人代表',
                field : 'ORGCOMPANYREG_LEGALPERSON',
                align : 'center',
                visible : columnvisible.ORGCOMPANYREG_legalperson,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_LEGALPERSON\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"法人代表\">"+value+"</a>";
                }
            },
  {
                title : '机构地址',
                field : 'ORGCOMPANYREG_ORGADDRESS',
                align : 'center',
                visible : columnvisible.ORGCOMPANYREG_orgaddress,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_ORGADDRESS\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"机构地址\">"+value+"</a>";
                }
            },
  {
                title : '联系电话',
                field : 'ORGCOMPANYREG_TELPHONE',
                align : 'center',
                visible : columnvisible.ORGCOMPANYREG_telphone,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_TELPHONE\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"联系电话\">"+value+"</a>";
                }
            },
            {
                title : '机构状态',
                field : 'ORGCOMPANYREG_COMPSTATUS',
                visible :false,
            },{
                title : '机构状态',
                field : 'ORGCOMPANYREG_COMPSTATUS_DICTNAME',
                align : 'center',
                visible : columnvisible.ORGCOMPANYREG_compStatus,
                valign : 'left',
				  sortable: true,
                formatter: function (value, row, index) {
						if(value==undefined||value=='null'||value==''){
        					value='-';
    					}
                    	return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_COMPSTATUS\" title=\""+value+"\">"+value+"</a>";
                }
            },

  {
                title : '机构简称',
                field : 'ORGCOMPANYREG_ENAME',
                align : 'center',
                visible : columnvisible.ORGCOMPANYREG_ename,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_ENAME\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"机构简称\">"+value+"</a>";
                }
            },
            {
                title : '机构级别',
                field : 'ORGCOMPANYREG_COMPLEVEL',
                visible :false,
            },{
                title : '机构级别',
                field : 'ORGCOMPANYREG_COMPLEVEL_DICTNAME',
                align : 'center',
                visible : columnvisible.ORGCOMPANYREG_complevel,
                valign : 'left',
				  sortable: true,
                formatter: function (value, row, index) {
						if(value==undefined||value=='null'||value==''){
        					value='-';
    					}
                    	return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_COMPLEVEL\" title=\""+value+"\">"+value+"</a>";
                }
            },

            {
                title : '机构区域',
                field : 'ORGCOMPANYREG_COMPAREA',
                visible :false,
            },{
                title : '机构区域',
                field : 'ORGCOMPANYREG_COMPAREA_DICTNAME',
                align : 'center',
                visible : columnvisible.ORGCOMPANYREG_comparea,
                valign : 'left',
				  sortable: true,
                formatter: function (value, row, index) {
						if(value==undefined||value=='null'||value==''){
        					value='-';
    					}
                    	return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_COMPAREA\" title=\""+value+"\">"+value+"</a>";
                }
            },

            {
                title : '成立日期',
                field : 'ORGCOMPANYREG_VALIDDATE',
                align : 'center',
                visible : columnvisible.ORGCOMPANYREG_VALIDDATE,
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
        return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:100px\" name=\"ORGCOMPANYREG_VALIDDATE\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"成立日期\">"+date+"</a>";
                }
            },
  {
                title : '注册地址',
                field : 'ORGCOMPANYREG_REGADDRESS',
                align : 'center',
                visible : columnvisible.ORGCOMPANYREG_regaddress,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_REGADDRESS\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"注册地址\">"+value+"</a>";
                }
            },
            {
                title : '是否人行金融机构',
                field : 'ORGCOMPANYREG_ORG_ISFININSTITU',
                visible :false,
            },{
                title : '是否人行金融机构',
                field : 'ORGCOMPANYREG_ORG_ISFININSTITU_DICTNAME',
                align : 'center',
                visible : false,
                valign : 'left',
				  sortable: true,
                formatter: function (value, row, index) {
						if(value==undefined||value=='null'||value==''){
        					value='-';
    					}
                    	return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_ORG_ISFININSTITU\" title=\""+value+"\">"+value+"</a>";
                }
            },

  {
                title : '人行金融机构代码',
                field : 'ORGCOMPANYREG_ORG_FININSTITU',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_ORG_FININSTITU\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"人行金融机构代码\">"+value+"</a>";
                }
            },
  {
                title : '网点号',
                field : 'ORGCOMPANYREG_ORG_WEBNUM',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_ORG_WEBNUM\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"网点号\">"+value+"</a>";
                }
            },
  {
                title : '省联社机构代码',
                field : 'ORGCOMPANYREG_ORG_PROAGENCCODE',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_ORG_PROAGENCCODE\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"省联社机构代码\">"+value+"</a>";
                }
            },
  {
                title : '邮政编码',
                field : 'ORGCOMPANYREG_POSTCODE',
                align : 'center',
                visible : columnvisible.ORGCOMPANYREG_postcode,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_POSTCODE\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"邮政编码\">"+value+"</a>";
                }
            },
  {
                title : '传真号码',
                field : 'ORGCOMPANYREG_FAX',
                align : 'center',
                visible : columnvisible.ORGCOMPANYREG_fax,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_FAX\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"传真号码\">"+value+"</a>";
                }
            },
  {
                title : '机构网站',
                field : 'ORGCOMPANYREG_WEBSITE',
                align : 'center',
                visible : columnvisible.ORGCOMPANYREG_website,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_WEBSITE\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"机构网站\">"+value+"</a>";
                }
            },
            {
                title : '登记人',
                field : 'ORGCOMPANYREG_REGBY',
                visible :false,
            },{
                title : '登记人',
                field : 'ORGCOMPANYREG_REGBY_DICTNAME',
                align : 'center',
                visible : columnvisible.ORGCOMPANYREG_regby,
                valign : 'left',
				  sortable: true,
                formatter: function (value, row, index) {
						if(value==undefined||value=='null'||value==''){
        					value='-';
    					}
                    	return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_REGBY\" title=\""+value+"\">"+value+"</a>";
                }
            },

            {
                title : '登记时间',
                field : 'ORGCOMPANYREG_REGTIME',
                align : 'center',
                visible : columnvisible.ORGCOMPANYREG_regtime,
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
        return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:100px\" name=\"ORGCOMPANYREG_REGTIME\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"登记时间\">"+date+"</a>";
                }
            },
  {
                title : '排序',
                field : 'ORGCOMPANYREG_XORDER',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_XORDER\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"排序\">"+value+"</a>";
                }
            },
  {
                title : '备注',
                field : 'ORGCOMPANYREG_REMARK',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_REMARK\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"备注\">"+value+"</a>";
                }
            },
  {
                title : '生效',
                field : 'ORGCOMPANYREG_VALID',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_VALID\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"生效\">"+value+"</a>";
                }
            },
  {
                title : '生效人',
                field : 'ORGCOMPANYREG_VALIDBY',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_VALIDBY\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"生效人\">"+value+"</a>";
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
				  changeColor('ORG_COMPDIS_LIST_List');
		},
		onLoadSuccess: function (aa, bb, cc) {
				  changeColor('ORG_COMPDIS_LIST_List');
                $("#ORG_COMPDIS_LIST_List a").editable({
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
        	editORG_COMPDIS_LIST_click_682('isView',row);  
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
	function grid_ORG_COMPDIS_LIST_HeighQuery_682() {
		layer.open({
			type: 2,
			showMaxButton: true,
			title:"<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"高级查询设置")%>" ,
			area: ['855', '500'],
			maxmin: true,
			content:'/myehr/jsp/form/button/heightGrade.jsp?formFunction=grid_ORG_COMPDIS_LIST_fun11_682&formDefId=682&formDefLayout=2',
			success:function(layero,index){
				},
				end:function(){
			}
			});
	}
/**mouseover触发*/
var num = 0;
function openNew(ORGCOMPANY_COMPID){
	closeNew();
	this.$loading = $('<div id="open"  onmouseleave="changNum()" style="position:absolute;top:5%;right:0;width:70%;height:80%;z-index:1000"><iframe style="width:100%;height:100%;border:1px solid #ffcc00;" src="/myehr/form/toForm.action?formId=4755&isInit=true&ORGCOMPANYHIS_COMPID='+ORGCOMPANY_COMPID+'&"></iframe></div>');
this.$loading = $('<div id="open"  onmouseleave="changNum()" style="position:absolute;top:5%;right:0;width:70%;height:80%;z-index:1000">'+
				  '<div class="layui-layer-title" style="cursor: move;"></div>'+
				  '<span class="layui-layer-setwin" onclick="closeOpenNew()">'+
				  '<a class="layui-layer-ico layui-layer-close layui-layer-close1" href="javascript:;"></a>'+
				  '</span>'+
				  '<iframe style="width:100%;height:100%;border:1px solid #ffcc00;" src="/myehr/form/toForm.action?formId=4755&isInit=true&ORGCOMPANYHIS_COMPID='+ORGCOMPANY_COMPID+'&"></iframe></div>');
    if(num==0){
    	$('body').append(this.$loading);
    	num++;
    }	
}
function closeNew(){
	if(num==1){
		$("#open").remove();
		num--;
	}
}
function closeOpenNew(){
	$("#open").remove();
}
function changNum(){
	$("#open").remove();
	num--;	
}
/** 刷新页面 */ 
function refresh_ORG_COMP_CARD() { 
    $('#ORG_COMP_CARD_List').bootstrapTable('refresh'); 
}

/** 隐藏边框 */ 
function hiddenBorder(type) { 
    if(type == 0){
        $("#ORG_COMP_CARD_List td").css("border","none");
    }else if(type == 1){
        $("#ORG_COMP_CARD_List td").css("border-left","none");
    }else if(type == 2){
        $("#ORG_COMP_CARD_List td").css("border-top","none");
    }
}
/** 刷新页面 */ 
function refresh_ORG_COMPADD_LIST() { 
    $('#ORG_COMPADD_LIST_List').bootstrapTable('refresh'); 
}

/** 隐藏边框 */ 
function hiddenBorder(type) { 
    if(type == 0){
        $("#ORG_COMPADD_LIST_List td").css("border","none");
    }else if(type == 1){
        $("#ORG_COMPADD_LIST_List td").css("border-left","none");
    }else if(type == 2){
        $("#ORG_COMPADD_LIST_List td").css("border-top","none");
    }
}
/** 刷新页面 */ 
function refresh_ORG_COMPEDIT_LIST() { 
    $('#ORG_COMPEDIT_LIST_List').bootstrapTable('refresh'); 
}

/** 隐藏边框 */ 
function hiddenBorder(type) { 
    if(type == 0){
        $("#ORG_COMPEDIT_LIST_List td").css("border","none");
    }else if(type == 1){
        $("#ORG_COMPEDIT_LIST_List td").css("border-left","none");
    }else if(type == 2){
        $("#ORG_COMPEDIT_LIST_List td").css("border-top","none");
    }
}
/** 刷新页面 */ 
function refresh_ORG_COMPDIS_LIST() { 
    $('#ORG_COMPDIS_LIST_List').bootstrapTable('refresh'); 
}

/** 隐藏边框 */ 
function hiddenBorder(type) { 
    if(type == 0){
        $("#ORG_COMPDIS_LIST_List td").css("border","none");
    }else if(type == 1){
        $("#ORG_COMPDIS_LIST_List td").css("border-left","none");
    }else if(type == 2){
        $("#ORG_COMPDIS_LIST_List td").css("border-top","none");
    }
}
function editORG_COMP_CARD_click_672(isView,data){
	var selects = $("#ORG_COMP_CARD_List").bootstrapTable('getSelections');;
	if(selects!=null && selects.length>0){
		select = selects[0];;
		title='<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"机构详情")%>';
	}else if(data!=null&&isView!=null){
	select = data;
	title='<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"预览")%>';
	}else {
		alert('<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"请选择一行数据")%>');return ;
	}
	if(1==1){
		var url='/myehr/form/toForm.action?formId=673&isInit=true&ORGCOMPANY_COMPID='+select.ORGCOMPANY_COMPID+'&&&isView='+isView+'';
	}else{
		var url='/myehr/form/toForm.action?formId=673&isInit=true&ORGCOMPANY_COMPID='+ORGCOMPANY_COMPID+'&isView='+isView+'';
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
			    refresh_ORG_COMP_CARD();
		}
	});
}
function edit2ORG_COMP_CARD_click_672(isView,data){
	var selects = $("#ORG_COMP_CARD_List").bootstrapTable('getSelections');;
	if(selects!=null && selects.length>0){
		select = selects[0];;
		title='<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"机构证件")%>';
	}else if(data!=null&&isView!=null){
	select = data;
	title='<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"预览")%>';
	}else {
		alert('<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"请选择一行数据")%>');return ;
	}
	if(1==1){
		var url='/myehr/form/toForm.action?formId=4037&isInit=true&ORGCOMPANY_COMPID='+select.ORGCOMPANY_COMPID+'&&ORGCOMPANY_COMPCODE='+select.ORGCOMPANY_COMPCODE+'&&ORGCOMPANY_CNAME='+select.ORGCOMPANY_CNAME+'&&&isView='+isView+'';
	}else{
		var url='/myehr/form/toForm.action?formId=4037&isInit=true&ORGCOMPANY_COMPID='+ORGCOMPANY_COMPID+'&ORGCOMPANY_COMPCODE='+ORGCOMPANY_COMPCODE+'&ORGCOMPANY_CNAME='+ORGCOMPANY_CNAME+'&isView='+isView+'';
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
			    refresh_ORG_COMP_CARD();
		}
	});
}
function edit3ORG_COMP_CARD_click_672(isView,data){
	var selects = $("#ORG_COMP_CARD_List").bootstrapTable('getSelections');;
	if(selects!=null && selects.length>0){
		select = selects[0];;
		title='<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"机构管理历史列表")%>';
	}else if(data!=null&&isView!=null){
	select = data;
	title='<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"预览")%>';
	}else {
		alert('<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"请选择一行数据")%>');return ;
	}
	if(1==1){
		var url='/myehr/form/toForm.action?formId=675&isInit=true&ORGCOMPANY_COMPID='+select.ORGCOMPANY_COMPID+'&&&isView='+isView+'';
	}else{
		var url='/myehr/form/toForm.action?formId=675&isInit=true&ORGCOMPANY_COMPID='+ORGCOMPANY_COMPID+'&isView='+isView+'';
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
			    refresh_ORG_COMP_CARD();
		}
	});
}
	function exportORG_COMP_CARD_click_672(){
		var url = '/myehr/jsp/form/button/exportButton.jsp?formId=672&buttonId=6128&filename=公司信息';
		layer.open({
			   type: 2,
		    title:'<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"导出字段")%>',
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
			   }
		    });
	}
	function exportData_672(fieldArray){
		var _filterdata={};
		_filterdata.buttonId=6128;
		_filterdata.fieldArray=fieldArray;
		_filterdata.filename='公司信息';
		_filterdata=grid_ORG_COMP_CARD_fun(_filterdata);
		var index = layer.load(1);
		var url='${pageContext.request.contextPath }/form/exportCardformInitData.action';
		$.ajax({
		    url:url,
		    type:'post',
		    data: _filterdata,
		    cache: false,
		    contentType: 'application/json;charset=utf-8',
		    success: function (text) {
		        layer.close(index);
		        if(text[0]==0){
		            alert("<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"导出失败！")%>");
		        }else if(text[0]=='error'){
		            alert("<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"操作异常")%>");
		        }else if(text[0]=='BIG'){
		            document.getElementById("exportBig_6128").click();
		        }else if(text[0]=='SMALL'){
		            document.getElementById("export_6128").click();
		        }
		    },
		    error: function (XMLHttpRequest, textStatus, errorThrown) {
		        layer.close(index);
		        alert("<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"导出异常")%>");
		        alert(textStatus);
alert(XMLHttpRequest.status);

		    },
		});
	}
function addORG_COMPADD_LIST_click_676(isView,data){
	title='<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"机构登记")%>';
		var url='/myehr/form/toForm.action?formId=677';
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
			    refresh_ORG_COMPADD_LIST();
		}
	});
}
function editORG_COMPADD_LIST_click_676(isView,data){
	var selects = $("#ORG_COMPADD_LIST_List").bootstrapTable('getSelections');;
	if(selects!=null && selects.length>0){
		select = selects[0];;
		title='<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"机构登记修改")%>';
	}else if(data!=null&&isView!=null){
	select = data;
	title='<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"预览")%>';
	}else {
		alert('<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"请选择一行数据")%>');return ;
	}
	if(1==1){
		var url='/myehr/form/toForm.action?formId=678&isInit=true&ORGCOMPANYREG_ID='+select.ORGCOMPANYREG_ID+'&&&isView='+isView+'';
	}else{
		var url='/myehr/form/toForm.action?formId=678&isInit=true&ORGCOMPANYREG_ID='+ORGCOMPANYREG_ID+'&isView='+isView+'';
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
			    refresh_ORG_COMPADD_LIST();
		}
	});
}
function removeORG_COMPADD_LIST_click_676(){
	var selects = $("#ORG_COMPADD_LIST_List").bootstrapTable('getSelections');;
	if(selects!=null && selects.length>0){
		select = selects[0];
	}else {
		alert('<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"请选择数据")%>');return ;
	}
	var r=confirm("确定删除选中记录？");
	if (r==true){
		var _rowvalids = [];
		for(var i=0;i<selects.length;i++) {;
			if (selects[i].id!="") {;
				_rowvalids.push(selects[i]);
			}
		}
		var  _param ={formId:_formId_676,params:_rowvalids};
		var  buttonId = '1722';;
		if("undefined" != typeof setCacadeParam ){
			setCacadeParam(_param);
		};
		$.ajax({
			url:'${pageContext.request.contextPath }/form/removeData.action',
			type:'post',
			data: JSON.stringify(_param),
			cache: false,
			contentType: 'application/json;charset=utf-8',
			success: function (text) {
				if(text!='1'){
					alert('<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"删除失败")%>');
				} else {
					refresh_ORG_COMPADD_LIST();
					refreshDictCache(_formId_676,buttonId);
					if("undefined" != typeof mstTab_activechanged ){
						mstTab_activechanged();
					}
				}
			},
			error: function (jqXHR, textStatus, errorThrown) {
				alert(jqXHR.responseText);
			}
		});
	}else{
		return;
	}
}
	function importORG_COMPADD_LIST_click_676() {
		var url = "/myehr/jsp/form/button/importButton.jsp?formId=676&templateFileid=1168&templateFilename=机构导入.xls&buttonId=3475";
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
					grid_ORG_COMPADD_LIST.reload();
				}
			}
		});
	}
//引入按钮处理函数
	function introduceORG_COMPEDIT_LIST_click_679(){
		layer.open({
			type:2,
			content:"/myehr/form/toForm.action?formId=680&intrToId=679&intrButtonId=1728",
			shadeClose: true,
			maxmin:true,
			shade: 0.8,
			zIndex:9999,
			title:"<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"引入机构变更增加列表")%>" ,
			area: ['1000', '600'],
			success:function(layero,index){ 
			$('.layui-layer-max').click();
			},
			end:function(){
				refresh_ORG_COMPEDIT_LIST();
			}
		 }); 
	}
function editORG_COMPEDIT_LIST_click_679(isView,data){
	var selects = $("#ORG_COMPEDIT_LIST_List").bootstrapTable('getSelections');;
	if(selects!=null && selects.length>0){
		select = selects[0];;
		title='<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"机构变更卡片")%>';
	}else if(data!=null&&isView!=null){
	select = data;
	title='<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"预览")%>';
	}else {
		alert('<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"请选择一行数据")%>');return ;
	}
	if(1==1){
		var url='/myehr/form/toForm.action?formId=681&isInit=true&ORGCOMPANYREG_ID='+select.ORGCOMPANYREG_ID+'&&&isView='+isView+'';
	}else{
		var url='/myehr/form/toForm.action?formId=681&isInit=true&ORGCOMPANYREG_ID='+ORGCOMPANYREG_ID+'&isView='+isView+'';
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
			    refresh_ORG_COMPEDIT_LIST();
		}
	});
}
function removeORG_COMPEDIT_LIST_click_679(){
	var selects = $("#ORG_COMPEDIT_LIST_List").bootstrapTable('getSelections');;
	if(selects!=null && selects.length>0){
		select = selects[0];
	}else {
		alert('<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"请选择数据")%>');return ;
	}
	var r=confirm("确定删除选中记录？");
	if (r==true){
		var _rowvalids = [];
		for(var i=0;i<selects.length;i++) {;
			if (selects[i].id!="") {;
				_rowvalids.push(selects[i]);
			}
		}
		var  _param ={formId:_formId_679,params:_rowvalids};
		var  buttonId = '1730';;
		if("undefined" != typeof setCacadeParam ){
			setCacadeParam(_param);
		};
		$.ajax({
			url:'${pageContext.request.contextPath }/form/removeData.action',
			type:'post',
			data: JSON.stringify(_param),
			cache: false,
			contentType: 'application/json;charset=utf-8',
			success: function (text) {
				if(text!='1'){
					alert('<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"删除失败")%>');
				} else {
					refresh_ORG_COMPEDIT_LIST();
					refreshDictCache(_formId_679,buttonId);
					if("undefined" != typeof mstTab_activechanged ){
						mstTab_activechanged();
					}
				}
			},
			error: function (jqXHR, textStatus, errorThrown) {
				alert(jqXHR.responseText);
			}
		});
	}else{
		return;
	}
}
//引入按钮处理函数
	function introduceORG_COMPDIS_LIST_click_682(){
		layer.open({
			type:2,
			content:"/myehr/form/toForm.action?formId=683&intrToId=682&intrButtonId=1735",
			shadeClose: true,
			maxmin:true,
			shade: 0.8,
			zIndex:9999,
			title:"<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"引入机构失效新增")%>" ,
			area: ['1000', '600'],
			success:function(layero,index){ 
			$('.layui-layer-max').click();
			},
			end:function(){
				refresh_ORG_COMPDIS_LIST();
			}
		 }); 
	}
function editORG_COMPDIS_LIST_click_682(isView,data){
	var selects = $("#ORG_COMPDIS_LIST_List").bootstrapTable('getSelections');;
	if(selects!=null && selects.length>0){
		select = selects[0];;
		title='<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"机构失效修改卡片")%>';
	}else if(data!=null&&isView!=null){
	select = data;
	title='<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"预览")%>';
	}else {
		alert('<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"请选择一行数据")%>');return ;
	}
	if(1==1){
		var url='/myehr/form/toForm.action?formId=684&isInit=true&ORGCOMPANYREG_ID='+select.ORGCOMPANYREG_ID+'&&&isView='+isView+'';
	}else{
		var url='/myehr/form/toForm.action?formId=684&isInit=true&ORGCOMPANYREG_ID='+ORGCOMPANYREG_ID+'&isView='+isView+'';
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
			    refresh_ORG_COMPDIS_LIST();
		}
	});
}
function removeORG_COMPDIS_LIST_click_682(){
	var selects = $("#ORG_COMPDIS_LIST_List").bootstrapTable('getSelections');;
	if(selects!=null && selects.length>0){
		select = selects[0];
	}else {
		alert('<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"请选择数据")%>');return ;
	}
	var r=confirm("确定删除选中记录？");
	if (r==true){
		var _rowvalids = [];
		for(var i=0;i<selects.length;i++) {;
			if (selects[i].id!="") {;
				_rowvalids.push(selects[i]);
			}
		}
		var  _param ={formId:_formId_682,params:_rowvalids};
		var  buttonId = '1737';;
		if("undefined" != typeof setCacadeParam ){
			setCacadeParam(_param);
		};
		$.ajax({
			url:'${pageContext.request.contextPath }/form/removeData.action',
			type:'post',
			data: JSON.stringify(_param),
			cache: false,
			contentType: 'application/json;charset=utf-8',
			success: function (text) {
				if(text!='1'){
					alert('<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"删除失败")%>');
				} else {
					refresh_ORG_COMPDIS_LIST();
					refreshDictCache(_formId_682,buttonId);
					if("undefined" != typeof mstTab_activechanged ){
						mstTab_activechanged();
					}
				}
			},
			error: function (jqXHR, textStatus, errorThrown) {
				alert(jqXHR.responseText);
			}
		});
	}else{
		return;
	}
}
var filterParam = {};
var queryParams;
function grid_ORG_COMP_CARD_fun(pageReqeust){
	var _filterdata={};
	if(document.getElementById('grid_ORG_COMP_CARD_filter')){
	if($("[id='FILTER_ORG_COMPANY.ORGCOMPANY_COMPTYPE_672']").attr('multiSelect')){
		var val = "";
		var arr = $("[id='FILTER_ORG_COMPANY.ORGCOMPANY_COMPTYPE_672']").val();
		if(arr==null){
		}else{
			for(var i=0;i<arr.length;i++){
				val+=arr[i]+',';
			}
			val = val.substring(0,val.length-1);
		}
		var ORGCOMPANY_COMPTYPE=val;
	}else if(($("[id='FILTER_ORG_COMPANY.ORGCOMPANY_COMPTYPE_672']").attr('styleType')=="select")||($("[id='FILTER_ORG_COMPANY.ORGCOMPANY_COMPTYPE_672']").attr('styleType')=="dateTime")){
			var ORGCOMPANY_COMPTYPE=$("[id='FILTER_ORG_COMPANY.ORGCOMPANY_COMPTYPE_672']").val();
		}else{
				var ORGCOMPANY_COMPTYPE=$("[id='FILTER_672']").val();
		}
	if($("[id='FILTER_ORG_COMPANY.ORGCOMPANY_CNAME_672']").attr('multiSelect')){
		var val = "";
		var arr = $("[id='FILTER_ORG_COMPANY.ORGCOMPANY_CNAME_672']").val();
		if(arr==null){
		}else{
			for(var i=0;i<arr.length;i++){
				val+=arr[i]+',';
			}
			val = val.substring(0,val.length-1);
		}
		var ORGCOMPANY_CNAME=val;
	}else if(($("[id='FILTER_ORG_COMPANY.ORGCOMPANY_CNAME_672']").attr('styleType')=="select")||($("[id='FILTER_ORG_COMPANY.ORGCOMPANY_CNAME_672']").attr('styleType')=="dateTime")){
			var ORGCOMPANY_CNAME=$("[id='FILTER_ORG_COMPANY.ORGCOMPANY_CNAME_672']").val();
		}else{
				var ORGCOMPANY_CNAME=$("[id='FILTER_672']").val();
		}
	if($("[id='FILTER_ORG_COMPANY.ORGCOMPANY_COMPCODE_672']").attr('multiSelect')){
		var val = "";
		var arr = $("[id='FILTER_ORG_COMPANY.ORGCOMPANY_COMPCODE_672']").val();
		if(arr==null){
		}else{
			for(var i=0;i<arr.length;i++){
				val+=arr[i]+',';
			}
			val = val.substring(0,val.length-1);
		}
		var ORGCOMPANY_COMPCODE=val;
	}else if(($("[id='FILTER_ORG_COMPANY.ORGCOMPANY_COMPCODE_672']").attr('styleType')=="select")||($("[id='FILTER_ORG_COMPANY.ORGCOMPANY_COMPCODE_672']").attr('styleType')=="dateTime")){
			var ORGCOMPANY_COMPCODE=$("[id='FILTER_ORG_COMPANY.ORGCOMPANY_COMPCODE_672']").val();
		}else{
				var ORGCOMPANY_COMPCODE=$("[id='FILTER_672']").val();
		}
		_filterdata={ORGCOMPANY_COMPTYPE:ORGCOMPANY_COMPTYPE,ORGCOMPANY_CNAME:ORGCOMPANY_CNAME,ORGCOMPANY_COMPCODE:ORGCOMPANY_COMPCODE};
	}
	var paramsMap = {};
	var requestParam={};
	if('${param.ORGVCOMPANY_ORGCODE}'==''&&'parameter'=='parameter'){
		if(ORGVCOMPANY_ORGCODE==undefined){
			requestParam = {ORGVCOMPANY_ORGCODE:'${param.ORGVCOMPANY_orgcode}'};
		}else{
			requestParam = {ORGVCOMPANY_ORGCODE:ORGVCOMPANY_ORGCODE+""};
		}
	}else{
		requestParam = {ORGVCOMPANY_ORGCODE:'${param.ORGVCOMPANY_ORGCODE}'};
	}
	pageReqeust.containerParam=containerParam_672;
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.userIds=getQueryString('empIds');
	pageReqeust.formId=_formId_672;
	pageReqeust.isView=null;
	if(heightGadedata_672!=null&&heightGadedata_672!=undefined){
		pageReqeust.heightGrade = heightGadedata_672;
	}
	queryParams = JSON.stringify(pageReqeust);
	return queryParams;
}
function grid_ORG_COMP_CARD_fun11_672(){
	$('#ORG_COMP_CARD_List').bootstrapTable('refresh');
}
	
function executeSQLORG_COMP_CARD_click_672(){

	var buttonId = 3888;
	var checkselecdata = $("#ORG_COMP_CARD_List").bootstrapTable('getSelections');
	if(checkselecdata==null||checkselecdata==''||checkselecdata.lenght<=0){
		alert('<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"请选择数据！")%>');
		return;
	}
	var columnDataRows = $("#ORG_COMP_CARD_List").bootstrapTable('getSelections');
	var orgcompany_compid_672Datas;
	var temporgcompany_compid_672Datas = [];
	for(var i=0; i<columnDataRows.length; i++){
		temporgcompany_compid_672Datas.push("'"+columnDataRows[i].ORGCOMPANY_COMPID+"'");
	}
	orgcompany_compid_672Datas = temporgcompany_compid_672Datas.join(',');
	var paramsMap = {		'c_20722' : orgcompany_compid_672Datas,
		's_userid' : '${sessionScope.userid}'};
	var data = {
		'formId' : _formId_672,
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
							refreshDictCache(_formId_672,buttonId);

						$("#ORG_COMP_CARD_List").bootstrapTable('refresh');
					} else {
						$("#ORG_COMP_CARD_List").bootstrapTable('refresh');
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



var filterParam = {};
var queryParams;
function grid_ORG_COMPADD_LIST_fun(pageReqeust){
	var _filterdata={};
	if(document.getElementById('grid_ORG_COMPADD_LIST_filter')){
	if($("[id='FILTER_ORG_COMPANY_REG.ORGCOMPANYREG_COMPCODE_676']").attr('multiSelect')){
		var val = "";
		var arr = $("[id='FILTER_ORG_COMPANY_REG.ORGCOMPANYREG_COMPCODE_676']").val();
		if(arr==null){
		}else{
			for(var i=0;i<arr.length;i++){
				val+=arr[i]+',';
			}
			val = val.substring(0,val.length-1);
		}
		var ORGCOMPANYREG_COMPCODE=val;
	}else if(($("[id='FILTER_ORG_COMPANY_REG.ORGCOMPANYREG_COMPCODE_676']").attr('styleType')=="select")||($("[id='FILTER_ORG_COMPANY_REG.ORGCOMPANYREG_COMPCODE_676']").attr('styleType')=="dateTime")){
			var ORGCOMPANYREG_COMPCODE=$("[id='FILTER_ORG_COMPANY_REG.ORGCOMPANYREG_COMPCODE_676']").val();
		}else{
				var ORGCOMPANYREG_COMPCODE=$("[id='FILTER_676']").val();
		}
	if($("[id='FILTER_ORG_COMPANY_REG.ORGCOMPANYREG_CNAME_676']").attr('multiSelect')){
		var val = "";
		var arr = $("[id='FILTER_ORG_COMPANY_REG.ORGCOMPANYREG_CNAME_676']").val();
		if(arr==null){
		}else{
			for(var i=0;i<arr.length;i++){
				val+=arr[i]+',';
			}
			val = val.substring(0,val.length-1);
		}
		var ORGCOMPANYREG_CNAME=val;
	}else if(($("[id='FILTER_ORG_COMPANY_REG.ORGCOMPANYREG_CNAME_676']").attr('styleType')=="select")||($("[id='FILTER_ORG_COMPANY_REG.ORGCOMPANYREG_CNAME_676']").attr('styleType')=="dateTime")){
			var ORGCOMPANYREG_CNAME=$("[id='FILTER_ORG_COMPANY_REG.ORGCOMPANYREG_CNAME_676']").val();
		}else{
				var ORGCOMPANYREG_CNAME=$("[id='FILTER_676']").val();
		}
		_filterdata={ORGCOMPANYREG_COMPCODE:ORGCOMPANYREG_COMPCODE,ORGCOMPANYREG_CNAME:ORGCOMPANYREG_CNAME};
	}
	var paramsMap = {};
	var requestParam={};
		requestParam = {};
	pageReqeust.containerParam=containerParam_676;
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.userIds=getQueryString('empIds');
	pageReqeust.formId=_formId_676;
	pageReqeust.isView=null;
	if(heightGadedata_676!=null&&heightGadedata_676!=undefined){
		pageReqeust.heightGrade = heightGadedata_676;
	}
	queryParams = JSON.stringify(pageReqeust);
	return queryParams;
}
function grid_ORG_COMPADD_LIST_fun11_676(){
	$('#ORG_COMPADD_LIST_List').bootstrapTable('refresh');
}
	
function executeSQLORG_COMPADD_LIST_click_676(){

	var buttonId = 1723;
	var checkselecdata = $("#ORG_COMPADD_LIST_List").bootstrapTable('getSelections');
	if(checkselecdata==null||checkselecdata==''||checkselecdata.lenght<=0){
		alert('<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"请选择数据！")%>');
		return;
	}
	var columnDataRows = $("#ORG_COMPADD_LIST_List").bootstrapTable('getSelections');
	var orgcompanyreg_id_676Datas;
	var temporgcompanyreg_id_676Datas = [];
	for(var i=0; i<columnDataRows.length; i++){
		temporgcompanyreg_id_676Datas.push("'"+columnDataRows[i].ORGCOMPANYREG_ID+"'");
	}
	orgcompanyreg_id_676Datas = temporgcompanyreg_id_676Datas.join(',');
	var paramsMap = {		'c_20810' : orgcompanyreg_id_676Datas,
		's_userId' : '${sessionScope.userid}'};
	var data = {
		'formId' : _formId_676,
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
							refreshDictCache(_formId_676,buttonId);

						$("#ORG_COMPADD_LIST_List").bootstrapTable('refresh');
					} else {
						$("#ORG_COMPADD_LIST_List").bootstrapTable('refresh');
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


var filterParam = {};
var queryParams;
function grid_ORG_COMPEDIT_LIST_fun(pageReqeust){
	var _filterdata={};
	if(document.getElementById('grid_ORG_COMPEDIT_LIST_filter')){
	if($("[id='FILTER_ORG_COMPANY_REG.ORGCOMPANYREG_COMPCODE_679']").attr('multiSelect')){
		var val = "";
		var arr = $("[id='FILTER_ORG_COMPANY_REG.ORGCOMPANYREG_COMPCODE_679']").val();
		if(arr==null){
		}else{
			for(var i=0;i<arr.length;i++){
				val+=arr[i]+',';
			}
			val = val.substring(0,val.length-1);
		}
		var ORGCOMPANYREG_COMPCODE=val;
	}else if(($("[id='FILTER_ORG_COMPANY_REG.ORGCOMPANYREG_COMPCODE_679']").attr('styleType')=="select")||($("[id='FILTER_ORG_COMPANY_REG.ORGCOMPANYREG_COMPCODE_679']").attr('styleType')=="dateTime")){
			var ORGCOMPANYREG_COMPCODE=$("[id='FILTER_ORG_COMPANY_REG.ORGCOMPANYREG_COMPCODE_679']").val();
		}else{
				var ORGCOMPANYREG_COMPCODE=$("[id='FILTER_679']").val();
		}
	if($("[id='FILTER_ORG_COMPANY_REG.ORGCOMPANYREG_CNAME_679']").attr('multiSelect')){
		var val = "";
		var arr = $("[id='FILTER_ORG_COMPANY_REG.ORGCOMPANYREG_CNAME_679']").val();
		if(arr==null){
		}else{
			for(var i=0;i<arr.length;i++){
				val+=arr[i]+',';
			}
			val = val.substring(0,val.length-1);
		}
		var ORGCOMPANYREG_CNAME=val;
	}else if(($("[id='FILTER_ORG_COMPANY_REG.ORGCOMPANYREG_CNAME_679']").attr('styleType')=="select")||($("[id='FILTER_ORG_COMPANY_REG.ORGCOMPANYREG_CNAME_679']").attr('styleType')=="dateTime")){
			var ORGCOMPANYREG_CNAME=$("[id='FILTER_ORG_COMPANY_REG.ORGCOMPANYREG_CNAME_679']").val();
		}else{
				var ORGCOMPANYREG_CNAME=$("[id='FILTER_679']").val();
		}
		_filterdata={ORGCOMPANYREG_COMPCODE:ORGCOMPANYREG_COMPCODE,ORGCOMPANYREG_CNAME:ORGCOMPANYREG_CNAME};
	}
	var paramsMap = {};
	var requestParam={};
		requestParam = {};
	pageReqeust.containerParam=containerParam_679;
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.userIds=getQueryString('empIds');
	pageReqeust.formId=_formId_679;
	pageReqeust.isView=null;
	if(heightGadedata_679!=null&&heightGadedata_679!=undefined){
		pageReqeust.heightGrade = heightGadedata_679;
	}
	queryParams = JSON.stringify(pageReqeust);
	return queryParams;
}
function grid_ORG_COMPEDIT_LIST_fun11_679(){
	$('#ORG_COMPEDIT_LIST_List').bootstrapTable('refresh');
}
	
function executeSQLORG_COMPEDIT_LIST_click_679(){

	var buttonId = 1731;
	var checkselecdata = $("#ORG_COMPEDIT_LIST_List").bootstrapTable('getSelections');
	if(checkselecdata==null||checkselecdata==''||checkselecdata.lenght<=0){
		alert('<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"请选择数据！")%>');
		return;
	}
	var columnDataRows = $("#ORG_COMPEDIT_LIST_List").bootstrapTable('getSelections');
	var orgcompanyreg_id_679Datas;
	var temporgcompanyreg_id_679Datas = [];
	for(var i=0; i<columnDataRows.length; i++){
		temporgcompanyreg_id_679Datas.push("'"+columnDataRows[i].ORGCOMPANYREG_ID+"'");
	}
	orgcompanyreg_id_679Datas = temporgcompanyreg_id_679Datas.join(',');
	var paramsMap = {		'c_20903' : orgcompanyreg_id_679Datas,
		's_userId' : '${sessionScope.userid}'};
	var data = {
		'formId' : _formId_679,
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
							refreshDictCache(_formId_679,buttonId);

						$("#ORG_COMPEDIT_LIST_List").bootstrapTable('refresh');
					} else {
						$("#ORG_COMPEDIT_LIST_List").bootstrapTable('refresh');
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


var filterParam = {};
var queryParams;
function grid_ORG_COMPDIS_LIST_fun(pageReqeust){
	var _filterdata={};
	if(document.getElementById('grid_ORG_COMPDIS_LIST_filter')){
	if($("[id='FILTER_ORG_COMPANY_REG.ORGCOMPANYREG_COMPCODE_682']").attr('multiSelect')){
		var val = "";
		var arr = $("[id='FILTER_ORG_COMPANY_REG.ORGCOMPANYREG_COMPCODE_682']").val();
		if(arr==null){
		}else{
			for(var i=0;i<arr.length;i++){
				val+=arr[i]+',';
			}
			val = val.substring(0,val.length-1);
		}
		var ORGCOMPANYREG_COMPCODE=val;
	}else if(($("[id='FILTER_ORG_COMPANY_REG.ORGCOMPANYREG_COMPCODE_682']").attr('styleType')=="select")||($("[id='FILTER_ORG_COMPANY_REG.ORGCOMPANYREG_COMPCODE_682']").attr('styleType')=="dateTime")){
			var ORGCOMPANYREG_COMPCODE=$("[id='FILTER_ORG_COMPANY_REG.ORGCOMPANYREG_COMPCODE_682']").val();
		}else{
				var ORGCOMPANYREG_COMPCODE=$("[id='FILTER_682']").val();
		}
	if($("[id='FILTER_ORG_COMPANY_REG.ORGCOMPANYREG_CNAME_682']").attr('multiSelect')){
		var val = "";
		var arr = $("[id='FILTER_ORG_COMPANY_REG.ORGCOMPANYREG_CNAME_682']").val();
		if(arr==null){
		}else{
			for(var i=0;i<arr.length;i++){
				val+=arr[i]+',';
			}
			val = val.substring(0,val.length-1);
		}
		var ORGCOMPANYREG_CNAME=val;
	}else if(($("[id='FILTER_ORG_COMPANY_REG.ORGCOMPANYREG_CNAME_682']").attr('styleType')=="select")||($("[id='FILTER_ORG_COMPANY_REG.ORGCOMPANYREG_CNAME_682']").attr('styleType')=="dateTime")){
			var ORGCOMPANYREG_CNAME=$("[id='FILTER_ORG_COMPANY_REG.ORGCOMPANYREG_CNAME_682']").val();
		}else{
				var ORGCOMPANYREG_CNAME=$("[id='FILTER_682']").val();
		}
		_filterdata={ORGCOMPANYREG_COMPCODE:ORGCOMPANYREG_COMPCODE,ORGCOMPANYREG_CNAME:ORGCOMPANYREG_CNAME};
	}
	var paramsMap = {};
	var requestParam={};
		requestParam = {};
	pageReqeust.containerParam=containerParam_682;
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.userIds=getQueryString('empIds');
	pageReqeust.formId=_formId_682;
	pageReqeust.isView=null;
	if(heightGadedata_682!=null&&heightGadedata_682!=undefined){
		pageReqeust.heightGrade = heightGadedata_682;
	}
	queryParams = JSON.stringify(pageReqeust);
	return queryParams;
}
function grid_ORG_COMPDIS_LIST_fun11_682(){
	$('#ORG_COMPDIS_LIST_List').bootstrapTable('refresh');
}
	
function executeSQLORG_COMPDIS_LIST_click_682(){

	var buttonId = 1738;
	var checkselecdata = $("#ORG_COMPDIS_LIST_List").bootstrapTable('getSelections');
	if(checkselecdata==null||checkselecdata==''||checkselecdata.lenght<=0){
		alert('<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"请选择数据！")%>');
		return;
	}
	var columnDataRows = $("#ORG_COMPDIS_LIST_List").bootstrapTable('getSelections');
	var orgcompanyreg_id_682Datas;
	var temporgcompanyreg_id_682Datas = [];
	for(var i=0; i<columnDataRows.length; i++){
		temporgcompanyreg_id_682Datas.push("'"+columnDataRows[i].ORGCOMPANYREG_ID+"'");
	}
	orgcompanyreg_id_682Datas = temporgcompanyreg_id_682Datas.join(',');
	var paramsMap = {		'c_20993' : orgcompanyreg_id_682Datas,
		's_userId' : '${sessionScope.userid}'};
	var data = {
		'formId' : _formId_682,
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
							refreshDictCache(_formId_682,buttonId);

						$("#ORG_COMPDIS_LIST_List").bootstrapTable('refresh');
					} else {
						$("#ORG_COMPDIS_LIST_List").bootstrapTable('refresh');
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


function exportData(fieldArray,formId){
    if(formId==672){
        exportData_672(fieldArray);
    }
    if(formId==676){
        exportData_676(fieldArray);
    }
    if(formId==679){
        exportData_679(fieldArray);
    }
    if(formId==682){
        exportData_682(fieldArray);
    }
}
</script>
</body>
</html>
<%
System.out.println("jsp消耗时间*****:"+(new Date().getTime()-d.getTime())/1000));
%>
