<%@ page language="java" import="java.util.*" import="com.myehr.common.util.LangUtil" pageEncoding="UTF-8"%>
<%@ include file="/common/common.jsp" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<body>
<div class="container-fluid" style="height:100%;overflow-y:hidden;padding-top:10px;">
	<div>
<div class="input-group" style="padding-bottom:10px;width:100%;z-index: 5;">
    <div id="grid_org_comp_InfoList_filter">
        <table class="cbs-table" style="width:100%">
             <tr>
				<td style="padding-left:10px;padding-top:10px"  width="100"  ><lable style="float:left"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"公司类型")%>: </lable></td>
				<td style="padding-left:10px;padding-top:10px" null align="left"  >						<select id="FILTER_ORG_COMPANY.ORGCOMPANY_comptype_1843" title="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"公司类型")%>" styleType="select" name="ORGCOMPANY_comptype"  class="form-control " emptyText=""  style="" showNullItem="true" textField="dictName" valueField="dictId" DictName="COMPTYPE" nullItemText="" dataField="dictList_form_31576"></select></td>
				<td style="padding-left:10px;padding-top:10px"  width="100"  ><lable style="float:left"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"公司区域")%>: </lable></td>
				<td style="padding-left:10px;padding-top:10px" null align="left"  >						<select id="FILTER_ORG_COMPANY.ORGCOMPANY_comparea_1843" title="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"公司区域")%>" styleType="select" name="ORGCOMPANY_comparea"  class="form-control " emptyText=""  style="" showNullItem="true" textField="dictName" valueField="dictId" DictName="COMPAREA" nullItemText="" dataField="dictList_form_31577"></select></td>
				<td style="padding-left:10px;padding-top:10px"  width="100"  ><lable style="float:left"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"公司行业")%>: </lable></td>
				<td style="padding-left:10px;padding-top:10px" null align="left"  >						<select id="FILTER_ORG_COMPANY.ORGCOMPANY_comptrade_1843" title="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"公司行业")%>" styleType="select" name="ORGCOMPANY_comptrade"  class="form-control " emptyText=""  style="" showNullItem="true" textField="dictName" valueField="dictId" DictName="COMPTRADE" nullItemText="" dataField="dictList_form_31578"></select></td>
			<td style="float:right;padding-top:10px">
				<input id="FILTER_1843" name="FILTER_1843" placeholder="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"中文名称")%>" style="padding: 6px 30px 6px 10px;" title="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"中文名称")%>" type="text" class="form-control" oninput="grid_org_comp_InfoList_fun11_1843()" />
				<i class="icon-search" style="position: absolute;right: 12px;top: 2px;cursor: pointer;"></i>
			</td>
                <td style="margin-left:10px;float:left;padding-top:10px" align="left" >
<div style="float:left;display:inline-block;margin-right:15px;position:relative;">
<input class="btn btn-primary" style="width:70px;padding-left:2px;padding-right:25px;" value="查询" onclick="grid_org_comp_InfoList_fun11_1843()">
<i class="glyphicon glyphicon-search" style="position: absolute;right: 12px;top: 6px;cursor: pointer;color:#fff">
</i>
</div><div style="float:left;display:inline-block;margin-right:15px;position:relative;">
<input class="btn btn-primary" style="width:100px;padding-left:2px;padding-right:25px;" value="高级查询" onclick="grid_org_comp_InfoList_HeighQuery_1843()">
<i class="glyphicon glyphicon-search" style="position: absolute;right: 12px;top: 6px;cursor: pointer;color:#fff">
</i>
</div>
</td>
            </tr>
        </table>
    </div>
</div>
		<div class="BTNGROUP BTNGROUP_1843" style="margin:5px auto; display:inline-block;height: 30px;z-index: 6;position: relative">
			<div style="margin-right:10px;display:inline-block">
			    <input type="button" id="introduceorg_comp_InfoList"  class="btn btn-primary" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"查看证件")%> onclick="introduceorg_comp_InfoList_click_1843()"/>
			</div>
		</div>
</div>
<table id="org_comp_InfoList_List">
</table>
<div id="activity_pane" style="position:absolute;left:500px;top:70px"></div>
</div>
<script>
var heightGadedata =[];
var containerParam ={};
containerParam ={};
function changeHeightGadedata(data){
	heightGadedata = data;
}
$(function() {
    querys_1843();
$(".fixed-table-toolbar").css("margin-top","38px");
$(".container-fluid").css("max-height","100%");
$(".container-fluid").css("padding-left","0");
$(".fixed-table-container").css("height",$('.container-fluid').height() -79 +"px");
$(".fixed-table-body").css("height","93%");
$(".input-group").css("z-index","7");

    initDict();
    initDate();
    console.log($(".BTNGROUP_1843>div").length);
    var DIVAMOUNT = 5;
    if($(".BTNGROUP_1843>div").length > DIVAMOUNT){
    	var len = $(".BTNGROUP_1843>div").length;
    	$(".BTNGROUP_1843>div:gt(4)").hide();
    	var selectObj = $('<div class="btn-group"><button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">更多 <span class="caret"></span></button><ul class="dropdown-menu" style="min-width:90px;left:-14px;"></ul></div>');
    	$(".BTNGROUP_1843").append(selectObj);
    	for(var i=DIVAMOUNT;i<len;i++){
    		var liObj = $('<li style="margin-left:14px;"></li>');
    		liObj.append($(".BTNGROUP_1843>div").eq(i).clone(true));
    		selectObj.find('.dropdown-menu').append(liObj);
    		selectObj.find('.dropdown-menu').append($('<li role="separator" class="divider"></li>'));
    	}
    	selectObj.find('.dropdown-menu div').show();
    }
});
function initFilterParam(data){
}
	var _formId_1843='1843';
    function querys_1843() {
        $("#org_comp_InfoList_List").bootstrapTable({
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
            queryParams : grid_org_comp_InfoList_fun,
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
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"公司ID")%>',
                field : 'ORGCOMPANY_compid',
                align : 'center',
                visible : false,
                valign : 'center',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:;\" name=\"ORGCOMPANY_compid\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"公司ID\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"公司编码")%>',
                field : 'ORGCOMPANY_compcode',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a onmouseover=\"openNew()\" class=\"eli w\" style=\"font-size:12px;text-decoration:underline;color:black;width:200px;\" name=\"ORGCOMPANY_compcode\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"公司编码\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"中文名称")%>',
                field : 'ORGCOMPANY_cname',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"ORGCOMPANY_cname\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"中文名称\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"英文名称")%>',
                field : 'ORGCOMPANY_ename',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"ORGCOMPANY_ename\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"英文名称\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"上级公司")%>',
                field : 'ORGCOMPANY_parentid',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"ORGCOMPANY_parentid\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"上级公司\" data-source=\"${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode1.action?deleteMark= data_form_31575&realValue="+value+"+\"></a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"公司类型")%>',
                field : 'ORGCOMPANY_comptype',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"ORGCOMPANY_comptype\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"公司类型\" data-source=\"${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode1.action?deleteMark=COMPTYPE&realValue="+value+"+\"></a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"公司区域")%>',
                field : 'ORGCOMPANY_comparea',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"ORGCOMPANY_comparea\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"公司区域\" data-source=\"${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode1.action?deleteMark=COMPAREA&realValue="+value+"+\"></a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"公司行业")%>',
                field : 'ORGCOMPANY_comptrade',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"ORGCOMPANY_comptrade\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"公司行业\" data-source=\"${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode1.action?deleteMark=COMPTRADE&realValue="+value+"+\"></a>";
                }
            },

  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"预留1")%>',
                field : 'ORGCOMPANY_orggroup1',
                align : 'center',
                visible : false,
                valign : 'center',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:;\" name=\"ORGCOMPANY_orggroup1\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"预留1\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"预留2")%>',
                field : 'ORGCOMPANY_orggroup2',
                align : 'center',
                visible : false,
                valign : 'center',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:;\" name=\"ORGCOMPANY_orggroup2\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"预留2\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"预留3")%>',
                field : 'ORGCOMPANY_orggroup3',
                align : 'center',
                visible : false,
                valign : 'center',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:;\" name=\"ORGCOMPANY_orggroup3\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"预留3\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"预留4")%>',
                field : 'ORGCOMPANY_orggroup4',
                align : 'center',
                visible : false,
                valign : 'center',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:;\" name=\"ORGCOMPANY_orggroup4\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"预留4\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"预留5")%>',
                field : 'ORGCOMPANY_orggroup5',
                align : 'center',
                visible : false,
                valign : 'center',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:;\" name=\"ORGCOMPANY_orggroup5\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"预留5\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"成立日期")%>',
                field : 'ORGCOMPANY_createdate',
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
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px\" name=\"ORGCOMPANY_createdate\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"成立日期\">"+date+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"是否失效")%>',
                field : 'ORGCOMPANY_isdisabled',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"ORGCOMPANY_isdisabled\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"是否失效\" data-source=\"${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode1.action?deleteMark=att_yes_no&realValue="+value+"+\"></a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"失效日期")%>',
                field : 'ORGCOMPANY_disableddate',
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
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px\" name=\"ORGCOMPANY_disableddate\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"失效日期\">"+date+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"法人")%>',
                field : 'ORGCOMPANY_legalperson',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"ORGCOMPANY_legalperson\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"法人\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"公司地址")%>',
                field : 'ORGCOMPANY_orgaddress',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"ORGCOMPANY_orgaddress\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"公司地址\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"注册地址")%>',
                field : 'ORGCOMPANY_regaddress',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"ORGCOMPANY_regaddress\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"注册地址\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"联系电话")%>',
                field : 'ORGCOMPANY_telphone',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"ORGCOMPANY_telphone\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"联系电话\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"传真")%>',
                field : 'ORGCOMPANY_fax',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"ORGCOMPANY_fax\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"传真\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"邮编")%>',
                field : 'ORGCOMPANY_postcode',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"ORGCOMPANY_postcode\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"邮编\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"网站")%>',
                field : 'ORGCOMPANY_website',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"ORGCOMPANY_website\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"网站\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"排序")%>',
                field : 'ORGCOMPANY_xorder',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"ORGCOMPANY_xorder\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"排序\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"备注")%>',
                field : 'ORGCOMPANY_remark',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"ORGCOMPANY_remark\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"备注\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"最近修改日期")%>',
                field : 'ORGCOMPANY_updatetime',
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
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px\" name=\"ORGCOMPANY_updatetime\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"最近修改日期\">"+date+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"租户ID")%>',
                field : 'ORGCOMPANY_zuid',
                align : 'center',
                visible : false,
                valign : 'center',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:;\" name=\"ORGCOMPANY_zuid\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"租户ID\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"组织码")%>',
                field : 'ORGCOMPANY_orgcode',
                align : 'center',
                visible : false,
                valign : 'center',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:;\" name=\"ORGCOMPANY_orgcode\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"组织码\">"+value+"</a>";
                }
            },
            ],
            onClickRow: function (row, $element) {
                curRow = row;
            },
		onLoadSuccess: function (aa, bb, cc) {
                $("#org_comp_InfoList_List a").editable({
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
        	editorg_comp_InfoList_click_1843('isView',row);  
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
                    $('#org_comp_InfoList_List').bootstrapTable(
                        'remove', {  
                            field: 'Id',  
                            values: [row.Id],  
                        }
                    );  
                    $('#org_comp_InfoList_List').bootstrapTable(
                        'refresh',{
                            url:'${pageContext.request.contextPath }/dictType/findDictTypeList2.action'  
                        }
                    );
                }
            });
        }
    };
}
function ON_RENDERERorg_comp_InfoListORG_COMPANY_ORGCOMPANY_compcode_1843(e){
return '<a  href="javascript:void(0);" onclick="goTo_org_comp_InfoList_ORGCOMPANY_compcode()"  >'+e.value+'</a>';
}
/**mouseover触发*/
var num = 0;
function openNew(){
	closeNew();
	this.$loading = $('<div id="open"  onmouseleave="changNum()" style="position:absolute;top:5%;right:0;width:80%;height:90%;z-index:1000">'+
					  '<div class="layui-layer-title" style="cursor: move;">xxxxx</div>'+
					  '<span class="layui-layer-setwin" onclick="closeOpenNew()">'+
					  '<a class="layui-layer-ico layui-layer-close layui-layer-close1" href="javascript:;"></a>'+
					  '</span>'+
					  '<iframe style="width:100%;height:100%;border:1px solid #ffcc00;" src="/myehr/form/toForm.action?formId=676&"></iframe></div>');
	
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
function refresh_org_comp_InfoList() { 
    $('#org_comp_InfoList_List').bootstrapTable('refresh'); 
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
//引入按钮处理函数
	function introduceorg_comp_InfoList_click_1843(){
		layer.open({
			type:2,
			content:"/myehr/form/toForm.action?formId=1844&intrToId=1843&intrButtonId=1879",
			shadeClose: true,
			maxmin:true,
			shade: 0.8,
			zIndex:9999,
			title:"<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"引入证件查看列表")%>" ,
			area: ['1000', '500'],
			success:function(layero,index){ 
			$('.layui-layer-max').click();
			},
			end:function(){
				refresh_org_comp_InfoList();
			}
		 }); 
	}
function goTo_org_comp_InfoList_ORGCOMPANY_compcode(){
		var _srow = grid_org_comp_InfoList.getSelected();;
		nui.open({
			url:encodeURI('/myehr/form/toForm.action?formId=676&isInit=true'),
			showMaxButton: true,
			title:"<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"")%>" ,
			width:"80" ,
			height:"90" ,
			onload:function(){ 
				
			},
			ondestroy: function (action){
				
			}
		 }); 
	}
var filterParam = {};
var queryParams;
function grid_org_comp_InfoList_fun(pageReqeust){
	var _filterdata={};
	if(document.getElementById('grid_org_comp_InfoList_filter')){
	if($("[id='FILTER_ORG_COMPANY.ORGCOMPANY_comptype_1843']").attr('multiSelect')){
		var val = "";
		var arr = $("[id='FILTER_ORG_COMPANY.ORGCOMPANY_comptype_1843']").val();
		if(arr==null){
		}else{
			for(var i=0;i<arr.length;i++){
				val+=arr[i]+',';
			}
			val = val.substring(0,val.length-1);
		}
		var ORGCOMPANY_comptype=val;
	}else if(($("[id='FILTER_ORG_COMPANY.ORGCOMPANY_comptype_1843']").attr('styleType')=="select")||($("[id='FILTER_ORG_COMPANY.ORGCOMPANY_comptype_1843']").attr('styleType')=="dateTime")){
			var ORGCOMPANY_comptype=$("[id='FILTER_ORG_COMPANY.ORGCOMPANY_comptype_1843']").val();
		}else{
				var ORGCOMPANY_comptype=$("[id='FILTER_1843']").val();
		}
	if($("[id='FILTER_ORG_COMPANY.ORGCOMPANY_comparea_1843']").attr('multiSelect')){
		var val = "";
		var arr = $("[id='FILTER_ORG_COMPANY.ORGCOMPANY_comparea_1843']").val();
		if(arr==null){
		}else{
			for(var i=0;i<arr.length;i++){
				val+=arr[i]+',';
			}
			val = val.substring(0,val.length-1);
		}
		var ORGCOMPANY_comparea=val;
	}else if(($("[id='FILTER_ORG_COMPANY.ORGCOMPANY_comparea_1843']").attr('styleType')=="select")||($("[id='FILTER_ORG_COMPANY.ORGCOMPANY_comparea_1843']").attr('styleType')=="dateTime")){
			var ORGCOMPANY_comparea=$("[id='FILTER_ORG_COMPANY.ORGCOMPANY_comparea_1843']").val();
		}else{
				var ORGCOMPANY_comparea=$("[id='FILTER_1843']").val();
		}
	if($("[id='FILTER_ORG_COMPANY.ORGCOMPANY_comptrade_1843']").attr('multiSelect')){
		var val = "";
		var arr = $("[id='FILTER_ORG_COMPANY.ORGCOMPANY_comptrade_1843']").val();
		if(arr==null){
		}else{
			for(var i=0;i<arr.length;i++){
				val+=arr[i]+',';
			}
			val = val.substring(0,val.length-1);
		}
		var ORGCOMPANY_comptrade=val;
	}else if(($("[id='FILTER_ORG_COMPANY.ORGCOMPANY_comptrade_1843']").attr('styleType')=="select")||($("[id='FILTER_ORG_COMPANY.ORGCOMPANY_comptrade_1843']").attr('styleType')=="dateTime")){
			var ORGCOMPANY_comptrade=$("[id='FILTER_ORG_COMPANY.ORGCOMPANY_comptrade_1843']").val();
		}else{
				var ORGCOMPANY_comptrade=$("[id='FILTER_1843']").val();
		}
	if($("[id='FILTER_ORG_COMPANY.ORGCOMPANY_cname_1843']").attr('multiSelect')){
		var val = "";
		var arr = $("[id='FILTER_ORG_COMPANY.ORGCOMPANY_cname_1843']").val();
		if(arr==null){
		}else{
			for(var i=0;i<arr.length;i++){
				val+=arr[i]+',';
			}
			val = val.substring(0,val.length-1);
		}
		var ORGCOMPANY_cname=val;
	}else if(($("[id='FILTER_ORG_COMPANY.ORGCOMPANY_cname_1843']").attr('styleType')=="select")||($("[id='FILTER_ORG_COMPANY.ORGCOMPANY_cname_1843']").attr('styleType')=="dateTime")){
			var ORGCOMPANY_cname=$("[id='FILTER_ORG_COMPANY.ORGCOMPANY_cname_1843']").val();
		}else{
				var ORGCOMPANY_cname=$("[id='FILTER_1843']").val();
		}
		_filterdata={ORGCOMPANY_comptype:ORGCOMPANY_comptype,ORGCOMPANY_comparea:ORGCOMPANY_comparea,ORGCOMPANY_comptrade:ORGCOMPANY_comptrade,ORGCOMPANY_cname:ORGCOMPANY_cname};
	}
	var paramsMap = {};
	var requestParam={};
		requestParam = {};
	pageReqeust.containerParam=containerParam;
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.userIds='${param.empIds}';
	pageReqeust.formId=_formId_1843;
	pageReqeust.isView=null;
	if(heightGadedata!=null&&heightGadedata!=undefined){
		pageReqeust.heightGrade = heightGadedata;
	}
	queryParams = JSON.stringify(pageReqeust);
	return queryParams;
}
function grid_org_comp_InfoList_fun11_1843(){
	$('#org_comp_InfoList_List').bootstrapTable('refresh');
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
	function grid_org_comp_InfoList_HeighQuery_1843() {
		layer.open({
			type: 2,
			showMaxButton: true,
			title:"<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"高级查询设置")%>" ,
			area: ['855', '500'],
			maxmin: true,
			content:'/myehr/jsp/form/button/heightGrade.jsp?formFunction=grid_org_comp_InfoList_fun11_1843&formDefId=1843&formDefLayout=2',
			success:function(layero,index){
				},
				end:function(){
			}
			});
	}
	//关闭
	function closex_1843(){ 
			    var index = parent.layer.getFrameIndex(window.name); //获取当前窗体索引
			    parent.layer.close(index);//执行关闭
	}
</script>
</body>
</html>
