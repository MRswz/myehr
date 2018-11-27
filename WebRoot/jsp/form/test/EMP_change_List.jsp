<%@ page language="java" import="com.myehr.common.util.LangUtil" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/common/common.jsp" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<body>
<form id="form_80" name="form_80"  style="height:100%;">
<div class="container-fluid" style="height:50.0%;overflow:auto;padding-top:5px">
	<div id="form_73" style="margin-top:0px;">
		<div class="input-group" style="width:100%;z-index: 5;">
		    <div id="grid_emp_mainList_filter">
		        <table class="cbs-table" style="width:100%">
		             <tr>
					<td style="float:right;padding-top:5px">
						<input id="FILTER_73" name="FILTER_73" placeholder="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"人员编号")%>,<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"姓名")%>" style="padding: 6px 30px 6px 10px;" title="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"人员编号")%>,<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"姓名")%>" type="text" class="form-control" oninput="grid_emp_mainList_fun11_73()" />
						<i class="icon-search" style="position: absolute;right: 12px;top: 2px;cursor: pointer;"></i>
					</td>
		            </tr>
		        </table>
		    </div>
		</div>
		<table id="emp_mainList_List">
		</table>
		<div id="activity_pane" style="position:absolute;left:500px;top:70px">
		</div>
	</div>
</div>
	<div class="container-fluid" style="height:50.0%;overflow:auto;padding-top:5px">
		<ul class="nav nav-tabs" id="myTab">
			<li class="active"><a href="#Tab_1">人事变动附表信息列表</a></li>
			<li ><a href="#Tab_2">人事变动主表信息列表</a></li>
			<li ><a href="#Tab_3">员工在虚拟部门列表</a></li>
			<li ><a href="#Tab_4">人员新增删除日志列表</a></li>
			<li ><a href="#Tab_5">人员信息变更日志列表</a></li>
		</ul>
		<div class="tab-content">
			<div class="tab-pane active" id="Tab_1">
				<div class="container-fluid">
					<div style="">
						<div class="BTNGROUP BTNGROUP_70" style="margin:5px auto; display:inline-block;height: 30px;z-index: 6;position: relative">
							<div style="margin-right:10px;display:inline-block">
							    <input type="button" id="addemp_A01Chg_list"  class="btn btn-primary" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"增加")%> onclick="addemp_A01Chg_list_click_70()"/>
							</div>
							<div style="margin-right:10px;display:inline-block">
							    <input type="button" id="editemp_A01Chg_list"  class="btn btn-warning" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"修改")%> onclick="editemp_A01Chg_list_click_70()"/>
							</div>
							<div style="margin-right:10px;display:inline-block">
							    <input type="button" id="removeemp_A01Chg_list"  class="btn btn-danger" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"删除")%> onclick="removeemp_A01Chg_list_click_70()"/>
							</div>
						</div>
						<table id="emp_A01Chg_list_List">
						</table>
						<div id="activity_pane" style="position:absolute;left:500px;top:70px">
						</div>
					</div>
				</div>
			</div>
			<div class="tab-pane " id="Tab_2">
				<div class="container-fluid">
					<div style="">
						<div class="BTNGROUP BTNGROUP_75" style="margin:5px auto; display:inline-block;height: 30px;z-index: 6;position: relative">
							<div style="margin-right:10px;display:inline-block">
							    <input type="button" id="addemp_CA01_list"  class="btn btn-primary" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"增加")%> onclick="addemp_CA01_list_click_75()"/>
							</div>
							<div style="margin-right:10px;display:inline-block">
							    <input type="button" id="editemp_CA01_list"  class="btn btn-warning" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"修改")%> onclick="editemp_CA01_list_click_75()"/>
							</div>
							<div style="margin-right:10px;display:inline-block">
							    <input type="button" id="removeemp_CA01_list"  class="btn btn-danger" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"删除")%> onclick="removeemp_CA01_list_click_75()"/>
							</div>
						</div>
						<table id="emp_CA01_list_List">
						</table>
						<div id="activity_pane" style="position:absolute;left:500px;top:70px">
						</div>
					</div>
				</div>
			</div>
			<div class="tab-pane " id="Tab_3">
				<div class="container-fluid">
					<div style="">
						<div class="BTNGROUP BTNGROUP_78" style="margin:5px auto; display:inline-block;height: 30px;z-index: 6;position: relative">
							<div style="margin-right:10px;display:inline-block">
							    <input type="button" id="addemp_NA011og_list"  class="btn btn-primary" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"增加")%> onclick="addemp_NA011og_list_click_78()"/>
							</div>
							<div style="margin-right:10px;display:inline-block">
							    <input type="button" id="editemp_NA011og_list"  class="btn btn-warning" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"修改")%> onclick="editemp_NA011og_list_click_78()"/>
							</div>
							<div style="margin-right:10px;display:inline-block">
							    <input type="button" id="removeemp_NA011og_list"  class="btn btn-danger" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"删除")%> onclick="removeemp_NA011og_list_click_78()"/>
							</div>
							<div style="margin-right:10px;display:inline-block">
							    <input type="button" id="importemp_NA011og_list"  class="btn btn-info" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"导入")%> onclick="importemp_NA011og_list_click_78()"/>
							</div>
						</div>
						<table id="emp_NA011og_list_List">
						</table>
						<div id="activity_pane" style="position:absolute;left:500px;top:70px">
						</div>
					</div>
				</div>
			</div>
			<div class="tab-pane " id="Tab_4">
				<div class="container-fluid">
					<div style="">
						<div class="BTNGROUP BTNGROUP_81" style="margin:5px auto; display:inline-block;height: 30px;z-index: 6;position: relative">
							<div style="margin-right:10px;display:inline-block">
							    <input type="button" id="addemp_rychglog_list"  class="btn btn-primary" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"增加")%> onclick="addemp_rychglog_list_click_81()"/>
							</div>
							<div style="margin-right:10px;display:inline-block">
							    <input type="button" id="editemp_rychglog_list"  class="btn btn-warning" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"修改")%> onclick="editemp_rychglog_list_click_81()"/>
							</div>
							<div style="margin-right:10px;display:inline-block">
							    <input type="button" id="removeemp_rychglog_list"  class="btn btn-danger" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"删除")%> onclick="removeemp_rychglog_list_click_81()"/>
							</div>
						</div>
						<table id="emp_rychglog_list_List">
						</table>
						<div id="activity_pane" style="position:absolute;left:500px;top:70px">
						</div>
					</div>
				</div>
			</div>
			<div class="tab-pane " id="Tab_5">
				<div class="container-fluid">
					<div style="">
						<div class="BTNGROUP BTNGROUP_84" style="margin:5px auto; display:inline-block;height: 30px;z-index: 6;position: relative">
							<div style="margin-right:10px;display:inline-block">
							    <input type="button" id="addemp_SysA01Chglog_list"  class="btn btn-primary" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"增加")%> onclick="addemp_SysA01Chglog_list_click_84()"/>
							</div>
							<div style="margin-right:10px;display:inline-block">
							    <input type="button" id="editemp_SysA01Chglog_list"  class="btn btn-warning" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"修改")%> onclick="editemp_SysA01Chglog_list_click_84()"/>
							</div>
							<div style="margin-right:10px;display:inline-block">
							    <input type="button" id="removeemp_SysA01Chglog_list"  class="btn btn-danger" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"删除")%> onclick="removeemp_SysA01Chglog_list_click_84()"/>
							</div>
						</div>
						<table id="emp_SysA01Chglog_list_List">
						</table>
						<div id="activity_pane" style="position:absolute;left:500px;top:70px">
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</form>
<script>
var heightGadedata =[];
var containerParam ={};
containerParam ={};
function changeHeightGadedata(data){
	heightGadedata = data;
}
$(function() {
    querys_70();
    querys_75();
    querys_78();
    querys_81();
    querys_84();
    querys_73();
$(".fixed-table-body").css("height","75%");
	$('#myTab a').click(function (e) {
				e.preventDefault();
				$(this).tab('show');
	});$("#form_73.input-group").css("padding-bottom","0px");
$(".fixed-table-toolbar").css("margin-top","0px");

initDict();
initDate();
showMoreBtn($(".BTNGROUP_73"));
showMoreBtn($(".BTNGROUP_70"));
showMoreBtn($(".BTNGROUP_75"));
showMoreBtn($(".BTNGROUP_78"));
showMoreBtn($(".BTNGROUP_81"));
showMoreBtn($(".BTNGROUP_84"));
});

    function showMoreBtn(ele){
    	var DIVAMOUNT = 5;
    	if(ele.children('div').length > DIVAMOUNT){
    		var len = ele.children('div').length;
    		$("#ele>div:gt(4)").hide();
    		var selectObj = $('<div class="btn-group"><button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">更多 <span class="caret"></span></button><ul class="dropdown-menu" style="min-width:90px;left:-14px;"></ul></div>');
    		ele.append(selectObj);
    		for(var i=DIVAMOUNT;i<len;i++){
    			ele.children('div').eq(i).hide();
    			var liObj = $('<li style="margin-left:14px;"></li>');
    			liObj.append(ele.children('div').eq(i).clone(true));
    			selectObj.find('.dropdown-menu').append(liObj);
    			selectObj.find('.dropdown-menu').append($('<li role="separator" class="divider"></li>'));
    		}
    		selectObj.find('.dropdown-menu div').show();
    	}
    }
	var _formId_70='70';
	var _formId_75='75';
	var _formId_78='78';
	var _formId_81='81';
	var _formId_84='84';
var A01_A0101;
var A01_A0190;
var A01_A0188;
	var _formId_73='73';
    function querys_70() {
        $("#emp_A01Chg_list_List").bootstrapTable({
            url :'${pageContext.request.contextPath }/form/cardformInitData.action',
            contentType: 'application/json;charset=utf-8',
            dataType:'json',
            method:'post',
            height : '578',
            undefinedText : '-',
            pagination : true,
            striped : true,
            fixedColumns: false,
            fixedNumber:4,
            queryParams : grid_emp_A01Chg_list_fun,
            cache : false,
            pageSize : 6, 
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
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"人员编号")%>',
                field : 'A01_A0190',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;color:black;width:200px;\" name=\"A01_A0190\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"人员编号\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"主键")%>',
                field : 'A01Chg_A01_ID',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;color:black;width:200px;\" name=\"A01Chg_A01_ID\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"主键\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"姓名")%>',
                field : 'A01_A0101',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;color:black;width:200px;\" name=\"A01_A0101\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"姓名\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"字段名称")%>',
                field : 'A01Chg_Field_name',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;color:black;width:200px;\" name=\"A01Chg_Field_name\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"字段名称\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"原来状态")%>',
                field : 'A01Chg_Source_state',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"A01Chg_Source_state\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"原来状态\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"标识")%>',
                field : 'A01Chg_Recindex',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"A01Chg_Recindex\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"标识\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"新状态")%>',
                field : 'A01Chg_New_state',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"A01Chg_New_state\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"新状态\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"变动次数")%>',
                field : 'A01Chg_A_id',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"A01Chg_A_id\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"变动次数\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"启用日期")%>',
                field : 'A01Chg_Start_date',
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
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px\" name=\"A01Chg_Start_date\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"启用日期\">"+date+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"状态ID")%>',
                field : 'A01Chg_Sourceid',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"A01Chg_Sourceid\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"状态ID\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"新状态ID")%>',
                field : 'A01Chg_Nowid',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"A01Chg_Nowid\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"新状态ID\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"人事附表ID")%>',
                field : 'A01Chg_pre_Fld',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"A01Chg_pre_Fld\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"人事附表ID\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"人员表ID")%>',
                field : 'A01Chg_A0188',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;color:black;width:200px;\" name=\"A01Chg_A0188\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"人员表ID\">"+value+"</a>";
                }
            },
            ],
            onClickRow: function (row, $element) {
                curRow = row;
            },
		onLoadSuccess: function (aa, bb, cc) {
                $("#emp_A01Chg_list_List a").editable({
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
        	editemp_A01Chg_list_click_70('isView',row);  
         } ,
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
                    $('#emp_A01Chg_list_List').bootstrapTable(
                        'remove', {  
                            field: 'Id',  
                            values: [row.Id],  
                        }
                    );  
                    $('#emp_A01Chg_list_List').bootstrapTable(
                        'refresh',{
                            url:'${pageContext.request.contextPath }/dictType/findDictTypeList2.action'  
                        }
                    );
                }
            });
        }
    };
}
    function querys_75() {
        $("#emp_CA01_list_List").bootstrapTable({
            url :'${pageContext.request.contextPath }/form/cardformInitData.action',
            contentType: 'application/json;charset=utf-8',
            dataType:'json',
            method:'post',
            height : '578',
            undefinedText : '-',
            pagination : true,
            striped : true,
            fixedColumns: false,
            fixedNumber:4,
            queryParams : grid_emp_CA01_list_fun,
            cache : false,
            pageSize : 6, 
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
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"序号")%>',
                field : 'CA01_A_id',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"CA01_A_id\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"序号\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"人员编号")%>',
                field : 'A01_A0190',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;color:black;width:200px;\" name=\"A01_A0190\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"人员编号\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"姓名")%>',
                field : 'A01_A0101',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;color:black;width:200px;\" name=\"A01_A0101\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"姓名\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"模版id")%>',
                field : 'CA01_Model_id',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"CA01_Model_id\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"模版id\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"人员表ID")%>',
                field : 'CA01_A0188',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;color:black;width:200px;\" name=\"CA01_A0188\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"人员表ID\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"确认状态")%>',
                field : 'CA01_CA0100',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;color:black;width:200px;\" name=\"CA01_CA0100\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"确认状态\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"变动类型")%>',
                field : 'CA01_CA0101',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"CA01_CA0101\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"变动类型\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"申请变动日期")%>',
                field : 'CA01_CA0102',
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
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px\" name=\"CA01_CA0102\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"申请变动日期\">"+date+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"变动原因")%>',
                field : 'CA01_CA0103',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"CA01_CA0103\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"变动原因\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"起用日期")%>',
                field : 'CA01_CA0104',
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
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px\" name=\"CA01_CA0104\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"起用日期\">"+date+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"发出审批次数")%>',
                field : 'CA01_CA0105',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"CA01_CA0105\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"发出审批次数\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"操作者")%>',
                field : 'CA01_opname',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"CA01_opname\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"操作者\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"审批者")%>',
                field : 'CA01_apname',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"CA01_apname\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"审批者\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"主键")%>',
                field : 'CA01_CA01_ID',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;color:black;width:200px;\" name=\"CA01_CA01_ID\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"主键\">"+value+"</a>";
                }
            },
            ],
            onClickRow: function (row, $element) {
                curRow = row;
            },
		onLoadSuccess: function (aa, bb, cc) {
                $("#emp_CA01_list_List a").editable({
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
        	editemp_CA01_list_click_75('isView',row);  
         } ,
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
                    $('#emp_CA01_list_List').bootstrapTable(
                        'remove', {  
                            field: 'Id',  
                            values: [row.Id],  
                        }
                    );  
                    $('#emp_CA01_list_List').bootstrapTable(
                        'refresh',{
                            url:'${pageContext.request.contextPath }/dictType/findDictTypeList2.action'  
                        }
                    );
                }
            });
        }
    };
}
    function querys_78() {
        $("#emp_NA011og_list_List").bootstrapTable({
            url :'${pageContext.request.contextPath }/form/cardformInitData.action',
            contentType: 'application/json;charset=utf-8',
            dataType:'json',
            method:'post',
            height : '578',
            undefinedText : '-',
            pagination : true,
            striped : true,
            fixedColumns: false,
            fixedNumber:4,
            queryParams : grid_emp_NA011og_list_fun,
            cache : false,
            pageSize : 6, 
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
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"人员编号")%>',
                field : 'A01_A0190',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;color:black;width:200px;\" name=\"A01_A0190\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"人员编号\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"姓名")%>',
                field : 'A01_A0101',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;color:black;width:200px;\" name=\"A01_A0101\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"姓名\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"部门ID")%>',
                field : 'NA01log_Dept_id',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"NA01log_Dept_id\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"部门ID\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"人员表ID")%>',
                field : 'NA01log_A0188',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;color:black;width:200px;\" name=\"NA01log_A0188\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"人员表ID\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"身份证号")%>',
                field : 'A01_A019A',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;color:black;width:200px;\" name=\"A01_A019A\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"身份证号\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"NA0100")%>',
                field : 'NA01log_NA0100',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"NA01log_NA0100\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"NA0100\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"NDEPT")%>',
                field : 'NA01log_NDEPT',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"NA01log_NDEPT\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"NDEPT\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"NA0104")%>',
                field : 'NA01log_NA0104',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"NA01log_NA0104\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"NA0104\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"岗位")%>',
                field : 'NA01log_NA0105',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"NA01log_NA0105\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"岗位\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"进入日期")%>',
                field : 'NA01log_NA0111',
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
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px\" name=\"NA01log_NA0111\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"进入日期\">"+date+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"离开日期")%>',
                field : 'NA01log_NA0112',
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
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px\" name=\"NA01log_NA0112\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"离开日期\">"+date+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"进入原因")%>',
                field : 'NA01log_NA0113',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;color:black;width:200px;\" name=\"NA01log_NA0113\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"进入原因\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"离开原因")%>',
                field : 'NA01log_NA0114',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;color:black;width:200px;\" name=\"NA01log_NA0114\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"离开原因\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"加入的操作者")%>',
                field : 'NA01log_OPname0',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"NA01log_OPname0\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"加入的操作者\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"调离的操作者")%>',
                field : 'NA01log_Opname1',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"NA01log_Opname1\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"调离的操作者\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"主键")%>',
                field : 'NA01log_NA0_ID',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;color:black;width:200px;\" name=\"NA01log_NA0_ID\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"主键\">"+value+"</a>";
                }
            },
            ],
            onClickRow: function (row, $element) {
                curRow = row;
            },
		onLoadSuccess: function (aa, bb, cc) {
                $("#emp_NA011og_list_List a").editable({
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
        	editemp_NA011og_list_click_78('isView',row);  
         } ,
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
                    $('#emp_NA011og_list_List').bootstrapTable(
                        'remove', {  
                            field: 'Id',  
                            values: [row.Id],  
                        }
                    );  
                    $('#emp_NA011og_list_List').bootstrapTable(
                        'refresh',{
                            url:'${pageContext.request.contextPath }/dictType/findDictTypeList2.action'  
                        }
                    );
                }
            });
        }
    };
}
    function querys_81() {
        $("#emp_rychglog_list_List").bootstrapTable({
            url :'${pageContext.request.contextPath }/form/cardformInitData.action',
            contentType: 'application/json;charset=utf-8',
            dataType:'json',
            method:'post',
            height : '578',
            undefinedText : '-',
            pagination : true,
            striped : true,
            fixedColumns: false,
            fixedNumber:4,
            queryParams : grid_emp_rychglog_list_fun,
            cache : false,
            pageSize : 6, 
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
                field : 'RYCHGLOG_logid',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;color:black;width:200px;\" name=\"RYCHGLOG_logid\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"主键\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"人员编号")%>',
                field : 'A01_A0190',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;color:black;width:200px;\" name=\"A01_A0190\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"人员编号\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"姓名")%>',
                field : 'A01_A0101',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;color:black;width:200px;\" name=\"A01_A0101\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"姓名\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"类型")%>',
                field : 'RYCHGLOG_CHGTYPE',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"RYCHGLOG_CHGTYPE\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"类型\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"日期")%>',
                field : 'RYCHGLOG_CHGDATE',
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
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px\" name=\"RYCHGLOG_CHGDATE\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"日期\">"+date+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"前状态")%>',
                field : 'RYCHGLOG_BEFORESTATE',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;color:black;width:200px;\" name=\"RYCHGLOG_BEFORESTATE\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"前状态\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"后状态")%>',
                field : 'RYCHGLOG_AFTERSTATE',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;color:black;width:200px;\" name=\"RYCHGLOG_AFTERSTATE\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"后状态\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"人员表ID")%>',
                field : 'RYCHGLOG_A0188',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;color:black;width:200px;\" name=\"RYCHGLOG_A0188\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"人员表ID\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"操作者")%>',
                field : 'RYCHGLOG_USER_NAME',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"RYCHGLOG_USER_NAME\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"操作者\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"标识")%>',
                field : 'RYCHGLOG_LOGFLAG',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"RYCHGLOG_LOGFLAG\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"标识\">"+value+"</a>";
                }
            },
            ],
            onClickRow: function (row, $element) {
                curRow = row;
            },
		onLoadSuccess: function (aa, bb, cc) {
                $("#emp_rychglog_list_List a").editable({
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
        	editemp_rychglog_list_click_81('isView',row);  
         } ,
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
                    $('#emp_rychglog_list_List').bootstrapTable(
                        'remove', {  
                            field: 'Id',  
                            values: [row.Id],  
                        }
                    );  
                    $('#emp_rychglog_list_List').bootstrapTable(
                        'refresh',{
                            url:'${pageContext.request.contextPath }/dictType/findDictTypeList2.action'  
                        }
                    );
                }
            });
        }
    };
}
    function querys_84() {
        $("#emp_SysA01Chglog_list_List").bootstrapTable({
            url :'${pageContext.request.contextPath }/form/cardformInitData.action',
            contentType: 'application/json;charset=utf-8',
            dataType:'json',
            method:'post',
            height : '578',
            undefinedText : '-',
            pagination : true,
            striped : true,
            fixedColumns: false,
            fixedNumber:4,
            queryParams : grid_emp_SysA01Chglog_list_fun,
            cache : false,
            pageSize : 6, 
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
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"人员编号")%>',
                field : 'A01_A0190',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;color:black;width:200px;\" name=\"A01_A0190\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"人员编号\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"序号")%>',
                field : 'SysA01Chglog_A_id',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"SysA01Chglog_A_id\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"序号\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"人员表ID")%>',
                field : 'SysA01Chglog_A0188',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;color:black;width:200px;\" name=\"SysA01Chglog_A0188\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"人员表ID\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"姓名")%>',
                field : 'A01_A0101',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;color:black;width:200px;\" name=\"A01_A0101\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"姓名\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"字段名称")%>',
                field : 'SysA01Chglog_Field_Label',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;color:black;width:200px;\" name=\"SysA01Chglog_Field_Label\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"字段名称\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"项目名称")%>',
                field : 'SysA01Chglog_Field_name',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;color:black;width:200px;\" name=\"SysA01Chglog_Field_name\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"项目名称\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"更改前状态")%>',
                field : 'SysA01Chglog_Source_state',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"SysA01Chglog_Source_state\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"更改前状态\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"更改后状态")%>',
                field : 'SysA01Chglog_New_state',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"SysA01Chglog_New_state\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"更改后状态\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"系统更改日期")%>',
                field : 'SysA01Chglog_Start_date',
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
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px\" name=\"SysA01Chglog_Start_date\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"系统更改日期\">"+date+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"更改前ID")%>',
                field : 'SysA01Chglog_Sourceid',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"SysA01Chglog_Sourceid\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"更改前ID\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"新状态ID")%>',
                field : 'SysA01Chglog_Nowid',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"SysA01Chglog_Nowid\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"新状态ID\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"操作者")%>',
                field : 'SysA01Chglog_Opname',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"SysA01Chglog_Opname\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"操作者\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"FactName")%>',
                field : 'SysA01Chglog_FactName',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"SysA01Chglog_FactName\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"FactName\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"Usertype")%>',
                field : 'SysA01Chglog_Usertype',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"SysA01Chglog_Usertype\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"Usertype\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"备注")%>',
                field : 'SysA01Chglog_pre_Fld',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"SysA01Chglog_pre_Fld\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"备注\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"主键")%>',
                field : 'SysA01Chglog_SYS_ID',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;color:black;width:200px;\" name=\"SysA01Chglog_SYS_ID\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"主键\">"+value+"</a>";
                }
            },
            ],
            onClickRow: function (row, $element) {
                curRow = row;
            },
		onLoadSuccess: function (aa, bb, cc) {
                $("#emp_SysA01Chglog_list_List a").editable({
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
        	editemp_SysA01Chglog_list_click_84('isView',row);  
         } ,
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
                    $('#emp_SysA01Chglog_list_List').bootstrapTable(
                        'remove', {  
                            field: 'Id',  
                            values: [row.Id],  
                        }
                    );  
                    $('#emp_SysA01Chglog_list_List').bootstrapTable(
                        'refresh',{
                            url:'${pageContext.request.contextPath }/dictType/findDictTypeList2.action'  
                        }
                    );
                }
            });
        }
    };
}
    function querys_73() {
        $("#emp_mainList_List").bootstrapTable({
            url :'${pageContext.request.contextPath }/form/cardformInitData.action',
            contentType: 'application/json;charset=utf-8',
            dataType:'json',
            method:'post',
            height : '578',
            undefinedText : '-',
            pagination : true,
            striped : true,
            fixedColumns: false,
            fixedNumber:4,
            queryParams : grid_emp_mainList_fun,
            cache : false,
            pageSize : 5, 
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
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"人员id")%>',
                field : 'A01_A0188',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"A01_A0188\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"人员id\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"部门名称")%>',
                field : 'DEPTCODE_CONTENT',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"DEPTCODE_CONTENT\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"部门名称\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"部门代码")%>',
                field : 'DEPTCODE_DEPT_CODE',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"DEPTCODE_DEPT_CODE\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"部门代码\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"人员编号")%>',
                field : 'A01_A0190',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"A01_A0190\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"人员编号\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"姓名")%>',
                field : 'A01_A0101',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"A01_A0101\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"姓名\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"人员类别")%>',
                field : 'A01_A0191',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"A01_A0191\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"人员类别\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"身份证号")%>',
                field : 'A01_A019A',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"A01_A019A\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"身份证号\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"参加工作时间")%>',
                field : 'A01_A0141',
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
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px\" name=\"A01_A0141\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"参加工作时间\">"+date+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"部门id")%>',
                field : 'A01_DEPT_ID',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"A01_DEPT_ID\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"部门id\">"+value+"</a>";
                }
            },
            ],
            onClickRow: function (row, $element) {
                curRow = row;
				A01_A0101= row.A01_A0101;
				A01_A0190= row.A01_A0190;
				A01_A0188= row.A01_A0188;
				$('#emp_A01Chg_list_List').bootstrapTable('refresh');
				$('#emp_CA01_list_List').bootstrapTable('refresh');
				$('#emp_NA011og_list_List').bootstrapTable('refresh');
				$('#emp_rychglog_list_List').bootstrapTable('refresh');
				$('#emp_SysA01Chglog_list_List').bootstrapTable('refresh');
$('#emp_mainList_List').bootstrapTable('uncheckAll'); 
$element[0].click(); 
            },
		onLoadSuccess: function (aa, bb, cc) {
                $("#emp_mainList_List a").editable({
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
        	editemp_mainList_click_73('isView',row);  
         } ,
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
                    $('#emp_mainList_List').bootstrapTable(
                        'remove', {  
                            field: 'Id',  
                            values: [row.Id],  
                        }
                    );  
                    $('#emp_mainList_List').bootstrapTable(
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
function refresh_emp_A01Chg_list() { 
    $('#emp_A01Chg_list_List').bootstrapTable('refresh'); 
}
/** 刷新页面 */ 
function refresh_emp_CA01_list() { 
    $('#emp_CA01_list_List').bootstrapTable('refresh'); 
}
/** 刷新页面 */ 
function refresh_emp_NA011og_list() { 
    $('#emp_NA011og_list_List').bootstrapTable('refresh'); 
}
/** 刷新页面 */ 
function refresh_emp_rychglog_list() { 
    $('#emp_rychglog_list_List').bootstrapTable('refresh'); 
}
/** 刷新页面 */ 
function refresh_emp_SysA01Chglog_list() { 
    $('#emp_SysA01Chglog_list_List').bootstrapTable('refresh'); 
}
/** 刷新页面 */ 
function refresh_emp_mainList() { 
    $('#emp_mainList_List').bootstrapTable('refresh'); 
}
function addemp_A01Chg_list_click_70(isView,data){
	title='<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"新增人事变动附表")%>';
	if('${param.A01_A0188}'!='' ||'${param.A01_A0190}'!='' ||'${param.A01_A0101}'!='' ||'${param.A01_A019A}'!='' ){
		var url='/myehr/form/toForm.action?formId=72&A01_A0188=${param.A01_A0188}&A01_A0190=${param.A01_A0190}&A01_A0101=${param.A01_A0101}&A01_A019A=${param.A01_A019A}&&isView='+isView+'';
	}else{
		var url='/myehr/form/toForm.action?formId=72&A01_A0188='+A01_A0188+'&A01_A0190='+A01_A0190+'&A01_A0101='+A01_A0101+'&A01_A019A='+A01_A019A+'&isView='+isView+'';
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
			    refresh_emp_A01Chg_list();
		}
	});
}
function editemp_A01Chg_list_click_70(isView,data){
	var selects = $("#emp_A01Chg_list_List").bootstrapTable('getSelections');;
	if(selects!=null && selects.length>0){
		select = selects[0];;
		title='<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"修改人事附表")%>';
	}else if(data!=null&&isView!=null){
	select = data;
	title='<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"预览")%>';
	}else {
		alert('<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"请选择一行数据")%>');return ;
	}
	if(1==1){
		var url='/myehr/form/toForm.action?formId=108&isInit=true&A01Chg_A01_ID='+select.A01Chg_A01_ID+'&&&isView='+isView+'';
	}else{
		var url='/myehr/form/toForm.action?formId=108&isInit=true&A01Chg_A01_ID='+A01Chg_A01_ID+'&isView='+isView+'';
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
			    refresh_emp_A01Chg_list();
		}
	});
}
function removeemp_A01Chg_list_click_70(){
	var selects = $("#emp_A01Chg_list_List").bootstrapTable('getSelections');;
	if(selects!=null && selects.length>0){
		select = selects[0];
	}else {
		alert('<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"请选择数据")%>');return ;
	}
	var r=confirm("确定删除选中记录？");
	if (r==true){
		var _rowvalids = [];
		for(var i=0;i<selects.length;i++) {;
			if (selects[i].A01_ID!="") {;
				_rowvalids.push(selects[i]);
			}
		}
		var  _param ={formId:_formId_70,params:_rowvalids};
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
					refresh_emp_A01Chg_list();;
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
function addemp_CA01_list_click_75(isView,data){
	title='<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"新增人员变动主表")%>';
	if('${param.A01_A0188}'!='' ||'${param.A01_A0190}'!='' ||'${param.A01_A0101}'!='' ){
		var url='/myehr/form/toForm.action?formId=76&A01_A0188=${param.A01_A0188}&A01_A0190=${param.A01_A0190}&A01_A0101=${param.A01_A0101}&&isView='+isView+'';
	}else{
		var url='/myehr/form/toForm.action?formId=76&A01_A0188='+A01_A0188+'&A01_A0190='+A01_A0190+'&A01_A0101='+A01_A0101+'&isView='+isView+'';
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
			    refresh_emp_CA01_list();
		}
	});
}
function editemp_CA01_list_click_75(isView,data){
	var selects = $("#emp_CA01_list_List").bootstrapTable('getSelections');;
	if(selects!=null && selects.length>0){
		select = selects[0];;
		title='<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"修改变动主表")%>';
	}else if(data!=null&&isView!=null){
	select = data;
	title='<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"预览")%>';
	}else {
		alert('<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"请选择一行数据")%>');return ;
	}
	if(1==1){
		var url='/myehr/form/toForm.action?formId=109&isInit=true&CA01_CA01_ID='+select.CA01_CA01_ID+'&&&isView='+isView+'';
	}else{
		var url='/myehr/form/toForm.action?formId=109&isInit=true&CA01_CA01_ID='+CA01_CA01_ID+'&isView='+isView+'';
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
			    refresh_emp_CA01_list();
		}
	});
}
function removeemp_CA01_list_click_75(){
	var selects = $("#emp_CA01_list_List").bootstrapTable('getSelections');;
	if(selects!=null && selects.length>0){
		select = selects[0];
	}else {
		alert('<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"请选择数据")%>');return ;
	}
	var r=confirm("确定删除选中记录？");
	if (r==true){
		var _rowvalids = [];
		for(var i=0;i<selects.length;i++) {;
			if (selects[i].CA01_ID!="") {;
				_rowvalids.push(selects[i]);
			}
		}
		var  _param ={formId:_formId_75,params:_rowvalids};
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
					refresh_emp_CA01_list();;
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
function addemp_NA011og_list_click_78(isView,data){
	title='<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"虚拟部门新增")%>';
	if('${param.A01_A0101}'!='' ||'${param.A01_A0190}'!='' ||'${param.A01_A019A}'!='' ||'${param.A01_A0188}'!='' ){
		var url='/myehr/form/toForm.action?formId=79&A01_A0101=${param.A01_A0101}&A01_A0190=${param.A01_A0190}&A01_A019A=${param.A01_A019A}&A01_A0188=${param.A01_A0188}&&isView='+isView+'';
	}else{
		var url='/myehr/form/toForm.action?formId=79&A01_A0101='+A01_A0101+'&A01_A0190='+A01_A0190+'&A01_A019A='+A01_A019A+'&A01_A0188='+A01_A0188+'&isView='+isView+'';
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
			    refresh_emp_NA011og_list();
		}
	});
}
function editemp_NA011og_list_click_78(isView,data){
	var selects = $("#emp_NA011og_list_List").bootstrapTable('getSelections');;
	if(selects!=null && selects.length>0){
		select = selects[0];;
		title='<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"员工虚拟部门修改")%>';
	}else if(data!=null&&isView!=null){
	select = data;
	title='<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"预览")%>';
	}else {
		alert('<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"请选择一行数据")%>');return ;
	}
	if(1==1){
		var url='/myehr/form/toForm.action?formId=113&isInit=true&NA01log_NA0_ID='+select.NA01log_NA0_ID+'&&&isView='+isView+'';
	}else{
		var url='/myehr/form/toForm.action?formId=113&isInit=true&NA01log_NA0_ID='+NA01log_NA0_ID+'&isView='+isView+'';
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
			    refresh_emp_NA011og_list();
		}
	});
}
function removeemp_NA011og_list_click_78(){
	var selects = $("#emp_NA011og_list_List").bootstrapTable('getSelections');;
	if(selects!=null && selects.length>0){
		select = selects[0];
	}else {
		alert('<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"请选择数据")%>');return ;
	}
	var r=confirm("确定删除选中记录？");
	if (r==true){
		var _rowvalids = [];
		for(var i=0;i<selects.length;i++) {;
			if (selects[i].NA0_ID!="") {;
				_rowvalids.push(selects[i]);
			}
		}
		var  _param ={formId:_formId_78,params:_rowvalids};
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
					refresh_emp_NA011og_list();;
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
	function importemp_NA011og_list_click_78() {
		var url = "/myehr/jsp/form/button/importButton.jsp?formId=78&templateFileid=&templateFilename=null&buttonId=1732";
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
					grid_emp_NA011og_list.reload();
				}
			}
		});
	}
function addemp_rychglog_list_click_81(isView,data){
	title='<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"删除日志新增")%>';
	if('${param.A01_A0188}'!='' ||'${param.A01_A0190}'!='' ||'${param.A01_A019A}'!='' ||'${param.A01_A0101}'!='' ){
		var url='/myehr/form/toForm.action?formId=82&A01_A0188=${param.A01_A0188}&A01_A0190=${param.A01_A0190}&A01_A019A=${param.A01_A019A}&A01_A0101=${param.A01_A0101}&&isView='+isView+'';
	}else{
		var url='/myehr/form/toForm.action?formId=82&A01_A0188='+A01_A0188+'&A01_A0190='+A01_A0190+'&A01_A019A='+A01_A019A+'&A01_A0101='+A01_A0101+'&isView='+isView+'';
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
			    refresh_emp_rychglog_list();
		}
	});
}
function editemp_rychglog_list_click_81(isView,data){
	var selects = $("#emp_rychglog_list_List").bootstrapTable('getSelections');;
	if(selects!=null && selects.length>0){
		select = selects[0];;
		title='<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"修改日志")%>';
	}else if(data!=null&&isView!=null){
	select = data;
	title='<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"预览")%>';
	}else {
		alert('<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"请选择一行数据")%>');return ;
	}
	if(1==1){
		var url='/myehr/form/toForm.action?formId=110&isInit=true&RYCHGLOG_logid='+select.RYCHGLOG_logid+'&&&isView='+isView+'';
	}else{
		var url='/myehr/form/toForm.action?formId=110&isInit=true&RYCHGLOG_logid='+RYCHGLOG_logid+'&isView='+isView+'';
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
			    refresh_emp_rychglog_list();
		}
	});
}
function removeemp_rychglog_list_click_81(){
	var selects = $("#emp_rychglog_list_List").bootstrapTable('getSelections');;
	if(selects!=null && selects.length>0){
		select = selects[0];
	}else {
		alert('<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"请选择数据")%>');return ;
	}
	var r=confirm("确定删除选中记录？");
	if (r==true){
		var _rowvalids = [];
		for(var i=0;i<selects.length;i++) {;
			if (selects[i].logid!="") {;
				_rowvalids.push(selects[i]);
			}
		}
		var  _param ={formId:_formId_81,params:_rowvalids};
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
					refresh_emp_rychglog_list();;
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
function addemp_SysA01Chglog_list_click_84(isView,data){
	title='<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"人员信息变更日志新增")%>';
	if('${param.A01_A0188}'!='' ||'${param.A01_A0190}'!='' ||'${param.A01_A019A}'!='' ||'${param.A01_A0101}'!='' ){
		var url='/myehr/form/toForm.action?formId=85&A01_A0188=${param.A01_A0188}&A01_A0190=${param.A01_A0190}&A01_A019A=${param.A01_A019A}&A01_A0101=${param.A01_A0101}&&isView='+isView+'';
	}else{
		var url='/myehr/form/toForm.action?formId=85&A01_A0188='+A01_A0188+'&A01_A0190='+A01_A0190+'&A01_A019A='+A01_A019A+'&A01_A0101='+A01_A0101+'&isView='+isView+'';
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
			    refresh_emp_SysA01Chglog_list();
		}
	});
}
function editemp_SysA01Chglog_list_click_84(isView,data){
	var selects = $("#emp_SysA01Chglog_list_List").bootstrapTable('getSelections');;
	if(selects!=null && selects.length>0){
		select = selects[0];;
		title='<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"人员日志修改")%>';
	}else if(data!=null&&isView!=null){
	select = data;
	title='<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"预览")%>';
	}else {
		alert('<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"请选择一行数据")%>');return ;
	}
	if(1==1){
		var url='/myehr/form/toForm.action?formId=111&isInit=true&SysA01Chglog_SYS_ID='+select.SysA01Chglog_SYS_ID+'&&&isView='+isView+'';
	}else{
		var url='/myehr/form/toForm.action?formId=111&isInit=true&SysA01Chglog_SYS_ID='+SysA01Chglog_SYS_ID+'&isView='+isView+'';
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
			    refresh_emp_SysA01Chglog_list();
		}
	});
}
function removeemp_SysA01Chglog_list_click_84(){
	var selects = $("#emp_SysA01Chglog_list_List").bootstrapTable('getSelections');;
	if(selects!=null && selects.length>0){
		select = selects[0];
	}else {
		alert('<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"请选择数据")%>');return ;
	}
	var r=confirm("确定删除选中记录？");
	if (r==true){
		var _rowvalids = [];
		for(var i=0;i<selects.length;i++) {;
			if (selects[i].SYS_ID!="") {;
				_rowvalids.push(selects[i]);
			}
		}
		var  _param ={formId:_formId_84,params:_rowvalids};
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
					refresh_emp_SysA01Chglog_list();;
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
function grid_emp_A01Chg_list_fun(pageReqeust){
	var _filterdata={};
	if(document.getElementById('grid_emp_A01Chg_list_filter')){
	}
	var paramsMap = {};
	var requestParam={};
	if('${param.A01_A0188}'==''){
		if(A01_A0188==undefined){
			requestParam = {A01_A0188:'${param.A01_A0188}'};
		}else{
			requestParam = {A01_A0188:A01_A0188+""};
		}
	}else{
		requestParam = {A01_A0188:'${param.A01_A0188}'};
	}
	pageReqeust.containerParam=containerParam;
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.userIds='${param.empIds}';
	pageReqeust.formId=_formId_70;
	pageReqeust.isView=null;
	if(heightGadedata!=null&&heightGadedata!=undefined){
		pageReqeust.heightGrade = heightGadedata;
	}
	queryParams = JSON.stringify(pageReqeust);
	return queryParams;
}
function grid_emp_A01Chg_list_fun11_70(){
	$('#emp_A01Chg_list_List').bootstrapTable('refresh');
}
	function grid_emp_A01Chg_list_HeighQuery_70() {
		layer.open({
			type: 2,
			showMaxButton: true,
			title:"<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"高级查询设置")%>" ,
			area: ['855', '500'],
			maxmin: true,
			content:'/myehr/jsp/form/button/heightGrade.jsp?formFunction=grid_emp_A01Chg_list_fun11_70&formDefId=70&formDefLayout=2',
			success:function(layero,index){
				},
				end:function(){
			}
			});
	}
	//关闭
	function closex_70(){ 
			    var index = parent.layer.getFrameIndex(window.name); //获取当前窗体索引
			    parent.layer.close(index);//执行关闭
	}
var filterParam = {};
var queryParams;
function grid_emp_CA01_list_fun(pageReqeust){
	var _filterdata={};
	if(document.getElementById('grid_emp_CA01_list_filter')){
	}
	var paramsMap = {};
	var requestParam={};
	if('${param.A01_A0188}'==''){
		if(A01_A0188==undefined){
			requestParam = {A01_A0188:'${param.A01_A0188}'};
		}else{
			requestParam = {A01_A0188:A01_A0188+""};
		}
	}else{
		requestParam = {A01_A0188:'${param.A01_A0188}'};
	}
	pageReqeust.containerParam=containerParam;
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.userIds='${param.empIds}';
	pageReqeust.formId=_formId_75;
	pageReqeust.isView=null;
	if(heightGadedata!=null&&heightGadedata!=undefined){
		pageReqeust.heightGrade = heightGadedata;
	}
	queryParams = JSON.stringify(pageReqeust);
	return queryParams;
}
function grid_emp_CA01_list_fun11_75(){
	$('#emp_CA01_list_List').bootstrapTable('refresh');
}
	function grid_emp_CA01_list_HeighQuery_75() {
		layer.open({
			type: 2,
			showMaxButton: true,
			title:"<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"高级查询设置")%>" ,
			area: ['855', '500'],
			maxmin: true,
			content:'/myehr/jsp/form/button/heightGrade.jsp?formFunction=grid_emp_CA01_list_fun11_75&formDefId=75&formDefLayout=2',
			success:function(layero,index){
				},
				end:function(){
			}
			});
	}
	//关闭
	function closex_75(){ 
			    var index = parent.layer.getFrameIndex(window.name); //获取当前窗体索引
			    parent.layer.close(index);//执行关闭
	}

var filterParam = {};
var queryParams;
function grid_emp_NA011og_list_fun(pageReqeust){
	var _filterdata={};
	if(document.getElementById('grid_emp_NA011og_list_filter')){
	}
	var paramsMap = {};
	var requestParam={};
	if('${param.A01_A0188}'==''){
		if(A01_A0188==undefined){
			requestParam = {A01_A0188:'${param.A01_A0188}'};
		}else{
			requestParam = {A01_A0188:A01_A0188+""};
		}
	}else{
		requestParam = {A01_A0188:'${param.A01_A0188}'};
	}
	pageReqeust.containerParam=containerParam;
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.userIds='${param.empIds}';
	pageReqeust.formId=_formId_78;
	pageReqeust.isView=null;
	if(heightGadedata!=null&&heightGadedata!=undefined){
		pageReqeust.heightGrade = heightGadedata;
	}
	queryParams = JSON.stringify(pageReqeust);
	return queryParams;
}
function grid_emp_NA011og_list_fun11_78(){
	$('#emp_NA011og_list_List').bootstrapTable('refresh');
}
	function grid_emp_NA011og_list_HeighQuery_78() {
		layer.open({
			type: 2,
			showMaxButton: true,
			title:"<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"高级查询设置")%>" ,
			area: ['855', '500'],
			maxmin: true,
			content:'/myehr/jsp/form/button/heightGrade.jsp?formFunction=grid_emp_NA011og_list_fun11_78&formDefId=78&formDefLayout=2',
			success:function(layero,index){
				},
				end:function(){
			}
			});
	}
	//关闭
	function closex_78(){ 
			    var index = parent.layer.getFrameIndex(window.name); //获取当前窗体索引
			    parent.layer.close(index);//执行关闭
	}
var filterParam = {};
var queryParams;
function grid_emp_rychglog_list_fun(pageReqeust){
	var _filterdata={};
	if(document.getElementById('grid_emp_rychglog_list_filter')){
	}
	var paramsMap = {};
	var requestParam={};
	if('${param.A01_A0188}'==''){
		if(A01_A0188==undefined){
			requestParam = {A01_A0188:'${param.A01_A0188}'};
		}else{
			requestParam = {A01_A0188:A01_A0188+""};
		}
	}else{
		requestParam = {A01_A0188:'${param.A01_A0188}'};
	}
	pageReqeust.containerParam=containerParam;
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.userIds='${param.empIds}';
	pageReqeust.formId=_formId_81;
	pageReqeust.isView=null;
	if(heightGadedata!=null&&heightGadedata!=undefined){
		pageReqeust.heightGrade = heightGadedata;
	}
	queryParams = JSON.stringify(pageReqeust);
	return queryParams;
}
function grid_emp_rychglog_list_fun11_81(){
	$('#emp_rychglog_list_List').bootstrapTable('refresh');
}
	function grid_emp_rychglog_list_HeighQuery_81() {
		layer.open({
			type: 2,
			showMaxButton: true,
			title:"<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"高级查询设置")%>" ,
			area: ['855', '500'],
			maxmin: true,
			content:'/myehr/jsp/form/button/heightGrade.jsp?formFunction=grid_emp_rychglog_list_fun11_81&formDefId=81&formDefLayout=2',
			success:function(layero,index){
				},
				end:function(){
			}
			});
	}
	//关闭
	function closex_81(){ 
			    var index = parent.layer.getFrameIndex(window.name); //获取当前窗体索引
			    parent.layer.close(index);//执行关闭
	}
var filterParam = {};
var queryParams;
function grid_emp_SysA01Chglog_list_fun(pageReqeust){
	var _filterdata={};
	if(document.getElementById('grid_emp_SysA01Chglog_list_filter')){
	}
	var paramsMap = {};
	var requestParam={};
	if('${param.A01_A0188}'==''){
		if(A01_A0188==undefined){
			requestParam = {A01_A0188:'${param.A01_A0188}'};
		}else{
			requestParam = {A01_A0188:A01_A0188+""};
		}
	}else{
		requestParam = {A01_A0188:'${param.A01_A0188}'};
	}
	pageReqeust.containerParam=containerParam;
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.userIds='${param.empIds}';
	pageReqeust.formId=_formId_84;
	pageReqeust.isView=null;
	if(heightGadedata!=null&&heightGadedata!=undefined){
		pageReqeust.heightGrade = heightGadedata;
	}
	queryParams = JSON.stringify(pageReqeust);
	return queryParams;
}
function grid_emp_SysA01Chglog_list_fun11_84(){
	$('#emp_SysA01Chglog_list_List').bootstrapTable('refresh');
}
	function grid_emp_SysA01Chglog_list_HeighQuery_84() {
		layer.open({
			type: 2,
			showMaxButton: true,
			title:"<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"高级查询设置")%>" ,
			area: ['855', '500'],
			maxmin: true,
			content:'/myehr/jsp/form/button/heightGrade.jsp?formFunction=grid_emp_SysA01Chglog_list_fun11_84&formDefId=84&formDefLayout=2',
			success:function(layero,index){
				},
				end:function(){
			}
			});
	}
	//关闭
	function closex_84(){ 
			    var index = parent.layer.getFrameIndex(window.name); //获取当前窗体索引
			    parent.layer.close(index);//执行关闭
	}
var filterParam = {};
var queryParams;
function grid_emp_mainList_fun(pageReqeust){
	var _filterdata={};
	if(document.getElementById('grid_emp_mainList_filter')){
	if($("[id='FILTER_A01.A01_A0190_73']").attr('multiSelect')){
		var val = "";
		var arr = $("[id='FILTER_A01.A01_A0190_73']").val();
		if(arr==null){
		}else{
			for(var i=0;i<arr.length;i++){
				val+=arr[i]+',';
			}
			val = val.substring(0,val.length-1);
		}
		var A01_A0190=val;
	}else if(($("[id='FILTER_A01.A01_A0190_73']").attr('styleType')=="select")||($("[id='FILTER_A01.A01_A0190_73']").attr('styleType')=="dateTime")){
			var A01_A0190=$("[id='FILTER_A01.A01_A0190_73']").val();
		}else{
				var A01_A0190=$("[id='FILTER_73']").val();
		}
	if($("[id='FILTER_A01.A01_A0101_73']").attr('multiSelect')){
		var val = "";
		var arr = $("[id='FILTER_A01.A01_A0101_73']").val();
		if(arr==null){
		}else{
			for(var i=0;i<arr.length;i++){
				val+=arr[i]+',';
			}
			val = val.substring(0,val.length-1);
		}
		var A01_A0101=val;
	}else if(($("[id='FILTER_A01.A01_A0101_73']").attr('styleType')=="select")||($("[id='FILTER_A01.A01_A0101_73']").attr('styleType')=="dateTime")){
			var A01_A0101=$("[id='FILTER_A01.A01_A0101_73']").val();
		}else{
				var A01_A0101=$("[id='FILTER_73']").val();
		}
		_filterdata={A01_A0190:A01_A0190,A01_A0101:A01_A0101};
	}
	var paramsMap = {};
	var requestParam={};
	if('${param.DEPTCODE_DEPT_CODE}'==''){
		if(DEPTCODE_DEPT_CODE==undefined){
			requestParam = {DEPTCODE_DEPT_CODE:'${param.DEPTCODE_DEPT_CODE}'};
		}else{
			requestParam = {DEPTCODE_DEPT_CODE:DEPTCODE_DEPT_CODE+""};
		}
	}else{
		requestParam = {DEPTCODE_DEPT_CODE:'${param.DEPTCODE_DEPT_CODE}'};
	}
	pageReqeust.containerParam=containerParam;
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.userIds='${param.empIds}';
	pageReqeust.formId=_formId_73;
	pageReqeust.isView=null;
	if(heightGadedata!=null&&heightGadedata!=undefined){
		pageReqeust.heightGrade = heightGadedata;
	}
	queryParams = JSON.stringify(pageReqeust);
	return queryParams;
}
function grid_emp_mainList_fun11_73(){
	$('#emp_mainList_List').bootstrapTable('refresh');
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
		var dataField=$(classes[i]).attr('dataField');
		parame.placeholder="";
		parame.jsonParam.nullItemText=$(classes[i]).attr('nullItemText');
		parame.jsonParam.dictTypeCode=$(classes[i]).attr('DictName');
		if(type=="true"){
			myehr_initSelectMore(parame,dataField);
		}else{
			myehr_initSelect(parame,dataField);
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
			$('.form_date5').datetimepicker({ 
			 language:  'zh-CN',  
			 format:"yyyymm",  
			 weekStart: 1,  
			 todayBtn:  1,  
			 autoclose: 1,  
			 todayHighlight: 1,  
			 startView: 3,  
			 minView: 3,  
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
