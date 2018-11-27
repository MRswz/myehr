<%@ page language="java" import="com.myehr.common.util.LangUtil" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/common/common.jsp" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<body>
<form id="form_1811" name="form_1811"  style="width:100%;">
<div class="container-fluid" style="width:30.0%;overflow:auto;float:left;padding-top:5px">
	<div id="form_1809" style="margin-top:0px;">
<div class="input-group" style="width:100%;z-index: 5;">
    <div id="grid_att_month_emplist_filter">
        <table class="cbs-table" style="width:100%">
             <tr>
			<td style="float:right;padding-top:5px">
				<input id="FILTER_1809" name="FILTER_1809" placeholder="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"姓名")%>,<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"人员编号")%>" style="padding: 6px 30px 6px 10px;" title="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"姓名")%>,<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"人员编号")%>" type="text" class="form-control" oninput="grid_att_month_emplist_fun11_1809()" />
				<i class="icon-search" style="position: absolute;right: 12px;top: 2px;cursor: pointer;"></i>
			</td>
            </tr>
        </table>
    </div>
</div>
</div>
<table id="att_month_emplist_List">
</table>
<div id="activity_pane" style="position:absolute;left:500px;top:70px"></div>
</div>
<div class="container-fluid" style="width:70.0%;overflow:auto;float:left;padding-top:5px">
	<ul class="nav nav-tabs" id="myTab">
		<li class="active"><a href="#Tab_1">月考勤统计列表</a></li>
	</ul>
	<div class="tab-content">
		<div class="tab-pane active" id="Tab_1">
			<div class="container-fluid">
				<div style="">
<div class="input-group" style="width:100%;z-index: 5;">
    <div id="grid_Check_work_list_filter">
        <table class="cbs-table" style="width:100%">
             <tr>
				<td style="padding-left:10px;"  width="100"  ><lable style="float:left"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"月份")%>: </lable></td>
				<td style="padding-left:10px;"  width="100px"  align="left"  >
					<div class='controls input-append date form_date5 input-group' data-date=""  data-link-field="dtp_input2" data-link-format="yyyy-mm-dd" style="float:left;margin-top:5px;width: 99px;">
						<input type='text' readonly class="form-control " dateType="controls input-append date form_date5" id="FILTER_K61.K61_D9999_60" styleType="dateTime"   style="width:99px;float:left;" name="K61_D9999"  format="yyyyMM" valueformat="yyyyMM" />
							<span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span>
							<span class="input-group-addon"><span class="glyphicon glyphicon-th"></span></span>
					</div></td>
			<td style="float:right;padding-top:5px">
				<input id="FILTER_60" name="FILTER_60" placeholder="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"人员编号")%>,<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"姓名")%>" style="padding: 6px 30px 6px 10px;" title="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"人员编号")%>,<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"姓名")%>" type="text" class="form-control" oninput="grid_Check_work_list_fun11_60()" />
				<i class="icon-search" style="position: absolute;right: 12px;top: 2px;cursor: pointer;"></i>
			</td>
                <td style="margin-left:10px;float:left;padding-top:5px" align="left" >
<div style="float:left;display:inline-block;margin-right:15px;position:relative;">
<input class="btn btn-primary" style="width:70px;padding-left:2px;padding-right:25px;" value="查询" onclick="grid_Check_work_list_fun11_60()">
<i class="glyphicon glyphicon-search" style="position: absolute;right: 12px;top: 6px;cursor: pointer;color:#fff">
</i>
<div style="float:left;display:inline-block;margin-right:15px;position:relative;">
<input class="btn btn-primary" style="width:100px;padding-left:2px;padding-right:25px;" value="高级查询" onclick="grid_Check_work_list_HeighQuery_60()">
<i class="glyphicon glyphicon-search" style="position: absolute;right: 12px;top: 6px;cursor: pointer;color:#fff">
</i>
</div>
</td>
            </tr>
        </table>
    </div>
</div>
		<div class="BTNGROUP BTNGROUP_60" style="margin:5px auto; display:inline-block;height: 30px;z-index: 6;position: relative">
			<div style="margin-right:10px;display:inline-block">
			    <input type="button" id="introduceCheck_work_list"  class="btn btn-primary" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"引入")%> onclick="introduceCheck_work_list_click_60()"/>
			</div>
			<div style="margin-right:10px;display:inline-block">
			    <input type="button" id="editCheck_work_list"  class="btn btn-warning" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"修改")%> onclick="editCheck_work_list_click_60()"/>
			</div>
			<div style="margin-right:10px;display:inline-block">
			    <input type="button" id="removeCheck_work_list"  class="btn btn-danger" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"删除")%> onclick="removeCheck_work_list_click_60()"/>
			</div>
			<div style="margin-right:10px;display:inline-block">
			    <input type="button" id="add2Check_work_list"  class="btn btn-primary" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"计算")%> onclick="add2Check_work_list_click_60()"/>
			</div>
			<div style="margin-right:10px;display:inline-block">
			    <input type="button" id="executeSQL1Check_work_list"  class="btn btn-success" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"审批")%> onclick="executeSQL1Check_work_list_click_60()"/>
			</div>
			<div style="margin-right:10px;display:inline-block">
			    <input type="button" id="executeSQL2Check_work_list"  class="btn btn-success" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"取消审批")%> onclick="executeSQL2Check_work_list_click_60()"/>
			</div>
			<div style="margin-right:10px;display:inline-block">
			    <input type="button" id="importCheck_work_list"  class="btn btn-info" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"导入")%> onclick="importCheck_work_list_click_60()"/>
			</div>
		</div>
<table id="Check_work_list_List">
</table>
<div id="activity_pane" style="position:absolute;left:500px;top:70px"></div>
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
var d = new Date();
var year = d.getFullYear();
var month = d.getMonth() + 1; // ｼﾇｵﾃｵｱﾇｰﾔﾂﾊﾇﾒｪ+1ｵﾄ
var dt = d.getDate();
if(dt<=20){
if(month<10){
	//2017-9-19-->201709
	//2017-11-19-->201711
	//2017-12-19-->201712
	date = year+"0"+month;
}else{
	month = month + "";
	date = year+month;
}
document.getElementById("FILTER_K61.K61_D9999_60").value = date;	
	
}else{
	//2017-9-22-->201710
	//2017-11-22-->201712
	//2017-12-22-->201801
	if(month<9){
		month++;
		month = month + "";
		date = year+"0"+month;
	}else if(month<12){
		month++;
		month = month + "";
		date = year+month;
	}else{
		year++;
		date = year+"01";
	}
document.getElementById("FILTER_K61.K61_D9999_60").value = date;	
}    querys_60();
    querys_1809();
$(".fixed-table-body").css("height","75%");
	$('#myTab a').click(function (e) {
				e.preventDefault();
				$(this).tab('show');
	});$("#form_1809.input-group").css("padding-bottom","0px");
$(".fixed-table-toolbar").css("margin-top","0px");
$("#Tab_1 .fixed-table-toolbar").css("margin-top","49px");

initDict();
initDate();
showMoreBtn($(".BTNGROUP_1809"));
showMoreBtn($(".BTNGROUP_60"));
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
	var _formId_60='60';
var A01_A0101;
var A01_A0190;
var DEPTCODE_DEPT_CODE;
var A01_A0188;
	var _formId_1809='1809';
    function querys_60() {
        $("#Check_work_list_List").bootstrapTable({
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
            queryParams : grid_Check_work_list_fun,
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
                field : 'K61_K61_ID',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"K61_K61_ID\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"主键\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"人员id")%>',
                field : 'K61_A0188',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"K61_A0188\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"人员id\">"+value+"</a>";
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
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"DEPTCODE_DEPT_CODE\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"部门代码\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"部门名称")%>',
                field : 'DEPTCODE_CONTENT',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"DEPTCODE_CONTENT\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"部门名称\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"部门ID")%>',
                field : 'DEPTCODE_DEPT_ID',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"DEPTCODE_DEPT_ID\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"部门ID\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"所属部门")%>',
                field : 'A01_A0114',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"A01_A0114\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"所属部门\">"+value+"</a>";
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
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"A01_A0190\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"人员编号\">"+value+"</a>";
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
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"A01_A0101\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"姓名\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"考勤卡号")%>',
                field : 'A01_A01BB',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"A01_A01BB\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"考勤卡号\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"审核情况")%>',
                field : 'K61_CHKFLAG',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"K61_CHKFLAG\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"审核情况\" data-source=\"${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode1.action?deleteMark=ChkFlag&realValue="+value+"+\"></a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"月份")%>',
                field : 'K61_D9999',
                align : 'center',
                visible : true,
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
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:100px\" name=\"K61_D9999\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"月份\">"+date+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"平均每月工作时间")%>',
                field : 'K61_K611Q',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"K61_K611Q\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"平均每月工作时间\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"排班总次数")%>',
                field : 'K61_I9999',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"K61_I9999\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"排班总次数\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"月度工作总天数")%>',
                field : 'K61_K612A',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"K61_K612A\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"月度工作总天数\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"休息日加班天数")%>',
                field : 'K61_K612B',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"K61_K612B\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"休息日加班天数\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"计划工时")%>',
                field : 'K61_K6125',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"K61_K6125\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"计划工时\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"实际工时")%>',
                field : 'K61_K6102',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"K61_K6102\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"实际工时\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"产前假")%>',
                field : 'K61_MDULTD',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"K61_MDULTD\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"产前假\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"生育假1_产假")%>',
                field : 'K61_MC1HTD',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"K61_MC1HTD\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"生育假1_产假\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"生育假1_难产假")%>',
                field : 'K61_LT1HTD',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"K61_LT1HTD\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"生育假1_难产假\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"生育假1_难产（多胞胎）")%>',
                field : 'K61_LT2HTD',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"K61_LT2HTD\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"生育假1_难产（多胞胎）\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"生育假1_（2个月内流产）")%>',
                field : 'K61_K6118',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"K61_K6118\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"生育假1_（2个月内流产）\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"生育假1_（2-3个月流产）")%>',
                field : 'K61_K6119',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"K61_K6119\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"生育假1_（2-3个月流产）\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"生育假1_（3-7个月流产）")%>',
                field : 'K61_K611A',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"K61_K611A\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"生育假1_（3-7个月流产）\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"生育假1合计")%>',
                field : 'K61_K6110',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"K61_K6110\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"生育假1合计\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"工伤假")%>',
                field : 'K61_TD043',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"K61_TD043\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"工伤假\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"福利假_丧假")%>',
                field : 'K61_TD038',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"K61_TD038\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"福利假_丧假\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"福利假_婚假")%>',
                field : 'K61_TD041',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"K61_TD041\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"福利假_婚假\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"生育假2_产检")%>',
                field : 'K61_OT3TTD',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"K61_OT3TTD\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"生育假2_产检\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"生育假2_工间休息")%>',
                field : 'K61_WKEDTD',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"K61_WKEDTD\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"生育假2_工间休息\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"生育假2_晚育假")%>',
                field : 'K61_MC2HTD',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"K61_MC2HTD\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"生育假2_晚育假\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"哺乳假_工间")%>',
                field : 'K61_MTLHTD',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"K61_MTLHTD\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"哺乳假_工间\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"生育假_护理假")%>',
                field : 'K61_MA2HTD',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"K61_MA2HTD\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"生育假_护理假\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"节育假_放环")%>',
                field : 'K61_ONEHTD',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"K61_ONEHTD\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"节育假_放环\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"节育假_取环")%>',
                field : 'K61_TWOHTD',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"K61_TWOHTD\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"节育假_取环\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"节育假_男结扎")%>',
                field : 'K61_K6112',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"K61_K6112\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"节育假_男结扎\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"节育假_女结扎")%>',
                field : 'K61_K6113',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"K61_K6113\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"节育假_女结扎\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"节育假_护理")%>',
                field : 'K61_K6114',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"K61_K6114\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"节育假_护理\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"计划生育假_（2个月内）")%>',
                field : 'K61_K6115',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"K61_K6115\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"计划生育假_（2个月内）\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"计划生育假_（2-3个月）")%>',
                field : 'K61_K6116',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"K61_K6116\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"计划生育假_（2-3个月）\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"计划生育假_（4-7个月）")%>',
                field : 'K61_K6117',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"K61_K6117\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"计划生育假_（4-7个月）\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"特别有薪假合计")%>',
                field : 'K61_K6111',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"K61_K6111\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"特别有薪假合计\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"有薪休假")%>',
                field : 'K61_ATDCTD',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"K61_ATDCTD\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"有薪休假\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"病假_2个月内")%>',
                field : 'K61_TD045',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"K61_TD045\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"病假_2个月内\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"病假_2-3个月")%>',
                field : 'K61_TD049',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"K61_TD049\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"病假_2-3个月\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"缺勤")%>',
                field : 'K61_TD033',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"K61_TD033\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"缺勤\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"病假停职_3个月以内")%>',
                field : 'K61_TD065',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"K61_TD065\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"病假停职_3个月以内\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"病假停职_3个月以上")%>',
                field : 'K61_TD068',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"K61_TD068\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"病假停职_3个月以上\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"哺乳假_停职")%>',
                field : 'K61_CC2HTD',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"K61_CC2HTD\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"哺乳假_停职\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"迟到分钟")%>',
                field : 'K61_K6104',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"K61_K6104\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"迟到分钟\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"早退分钟")%>',
                field : 'K61_K6106',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"K61_K6106\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"早退分钟\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"因私外出")%>',
                field : 'K61_K611C',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"K61_K611C\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"因私外出\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"离岗")%>',
                field : 'K61_K611D',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"K61_K611D\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"离岗\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"缺务时间合计分钟")%>',
                field : 'K61_K611O',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"K61_K611O\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"缺务时间合计分钟\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"缺务时间")%>',
                field : 'K61_K6124',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"K61_K6124\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"缺务时间\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"OT1.5分钟")%>',
                field : 'K61_K6121',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"K61_K6121\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"OT1.5分钟\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"OT2.0分钟")%>',
                field : 'K61_K6122',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"K61_K6122\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"OT2.0分钟\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"OT3.0分钟")%>',
                field : 'K61_K6123',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"K61_K6123\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"OT3.0分钟\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"OT1.5小时")%>',
                field : 'K61_K611J',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"K61_K611J\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"OT1.5小时\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"OT2.0小时")%>',
                field : 'K61_K611K',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"K61_K611K\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"OT2.0小时\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"OT3.0小时")%>',
                field : 'K61_K611R',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"K61_K611R\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"OT3.0小时\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"加班时间合计")%>',
                field : 'K61_K6108',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"K61_K6108\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"加班时间合计\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"其中加班调整_2.0分钟")%>',
                field : 'K61_K6127',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"K61_K6127\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"其中加班调整_2.0分钟\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"其中加班调整_2.0小时")%>',
                field : 'K61_K6128',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"K61_K6128\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"其中加班调整_2.0小时\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"增休")%>',
                field : 'K61_TD035',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"K61_TD035\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"增休\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"误餐日数")%>',
                field : 'K61_K611T',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"K61_K611T\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"误餐日数\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"轮班津贴")%>',
                field : 'K61_K6120',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"K61_K6120\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"轮班津贴\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"休日出勤补贴")%>',
                field : 'K61_K611Z',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"K61_K611Z\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"休日出勤补贴\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"出勤率")%>',
                field : 'K61_K611G',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"K61_K611G\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"出勤率\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"6个月出勤率")%>',
                field : 'K61_K611H',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"K61_K611H\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"6个月出勤率\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"事故时间分钟")%>',
                field : 'K61_K6126',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"K61_K6126\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"事故时间分钟\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"加班用餐次数")%>',
                field : 'K61_K6129',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"K61_K6129\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"加班用餐次数\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"工号")%>',
                field : 'K61_TD003',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"K61_TD003\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"工号\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"请假次数")%>',
                field : 'K61_K6109',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"K61_K6109\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"请假次数\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"加班次数")%>',
                field : 'K61_K6107',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"K61_K6107\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"加班次数\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"早退次数")%>',
                field : 'K61_K6105',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"K61_K6105\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"早退次数\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"迟到次数")%>',
                field : 'K61_K6103',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"K61_K6103\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"迟到次数\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"计算加班时间_OT1.5")%>',
                field : 'K61_K6135',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"K61_K6135\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"计算加班时间_OT1.5\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"计算加班时间_OT2.0")%>',
                field : 'K61_K6136',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"K61_K6136\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"计算加班时间_OT2.0\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"计算加班时间_OT3.0")%>',
                field : 'K61_K6137',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"K61_K6137\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"计算加班时间_OT3.0\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"计算加班时间合计")%>',
                field : 'K61_K6138',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"K61_K6138\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"计算加班时间合计\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"加班转调休时间分钟")%>',
                field : 'K61_K6139',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"K61_K6139\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"加班转调休时间分钟\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"班别类型")%>',
                field : 'K61_K61BBLX',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"K61_K61BBLX\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"班别类型\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"加班工资")%>',
                field : 'K61_K61ZW2',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"K61_K61ZW2\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"加班工资\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"K61ZW1")%>',
                field : 'K61_K61ZW1',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"K61_K61ZW1\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"K61ZW1\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"K61ZJ")%>',
                field : 'K61_K61ZJ',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;color:black;width:100px;\" name=\"K61_K61ZJ\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"K61ZJ\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"K61GZ")%>',
                field : 'K61_K61GZ',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;color:black;width:100px;\" name=\"K61_K61GZ\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"K61GZ\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"K61BBZL")%>',
                field : 'K61_K61BBZL',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"K61_K61BBZL\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"K61BBZL\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"司机保全工作天数")%>',
                field : 'K61_K611I',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"K61_K611I\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"司机保全工作天数\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"K61ZW")%>',
                field : 'K61_K61ZW',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"K61_K61ZW\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"K61ZW\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"K61TS")%>',
                field : 'K61_K61TS',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"K61_K61TS\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"K61TS\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"轮班津贴扣除")%>',
                field : 'K61_K611U',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"K61_K611U\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"轮班津贴扣除\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"排班工时")%>',
                field : 'K61_K6101',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"K61_K6101\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"排班工时\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"K61S1")%>',
                field : 'K61_K61S1',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"K61_K61S1\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"K61S1\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"K61S2")%>',
                field : 'K61_K61S2',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"K61_K61S2\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"K61S2\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"K61S3")%>',
                field : 'K61_K61S3',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"K61_K61S3\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"K61S3\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"k6131")%>',
                field : 'K61_K6131',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"K61_K6131\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"k6131\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"k6132")%>',
                field : 'K61_K6132',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"K61_K6132\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"k6132\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"k6133")%>',
                field : 'K61_K6133',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"K61_K6133\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"k6133\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"k6134")%>',
                field : 'K61_K6134',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"K61_K6134\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"k6134\">"+value+"</a>";
                }
            },
            ],
            onClickRow: function (row, $element) {
                curRow = row;
            },
		onLoadSuccess: function (aa, bb, cc) {
                $("#Check_work_list_List a").editable({
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
        	editCheck_work_list_click_60('isView',row);  
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
                    $('#Check_work_list_List').bootstrapTable(
                        'remove', {  
                            field: 'Id',  
                            values: [row.Id],  
                        }
                    );  
                    $('#Check_work_list_List').bootstrapTable(
                        'refresh',{
                            url:'${pageContext.request.contextPath }/dictType/findDictTypeList2.action'  
                        }
                    );
                }
            });
        }
    };
}
    function querys_1809() {
        $("#att_month_emplist_List").bootstrapTable({
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
            queryParams : grid_att_month_emplist_fun,
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
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"部门ID")%>',
                field : 'DEPTCODE_DEPT_ID',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"DEPTCODE_DEPT_ID\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"部门ID\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"部门名称")%>',
                field : 'DEPTCODE_CONTENT',
                align : 'center',
                visible : false,
                valign : '',
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
                valign : '',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"DEPTCODE_DEPT_CODE\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"部门代码\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"姓名")%>',
                field : 'A01_A0101',
                align : 'center',
                visible : true,
                valign : '',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:75px;\" name=\"A01_A0101\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"姓名\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"人员id")%>',
                field : 'A01_A0188',
                align : 'center',
                visible : false,
                valign : '',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"A01_A0188\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"人员id\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"人员编号")%>',
                field : 'A01_A0190',
                align : 'center',
                visible : true,
                valign : '',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:75px;\" name=\"A01_A0190\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"人员编号\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"人员类别")%>',
                field : 'A01_A0191',
                align : 'center',
                visible : false,
                valign : '',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"A01_A0191\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"人员类别\">"+value+"</a>";
                }
            },
            ],
            onClickRow: function (row, $element) {
                curRow = row;
				A01_A0101= row.A01_A0101;
				A01_A0190= row.A01_A0190;
				DEPTCODE_DEPT_CODE= row.DEPTCODE_DEPT_CODE;
				A01_A0188= row.A01_A0188;
				$('#Check_work_list_List').bootstrapTable('refresh');
$('#att_month_emplist_List').bootstrapTable('uncheckAll'); 
$element[0].click(); 
            },
		onLoadSuccess: function (aa, bb, cc) {
                $("#att_month_emplist_List a").editable({
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
        	editatt_month_emplist_click_1809('isView',row);  
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
                    $('#att_month_emplist_List').bootstrapTable(
                        'remove', {  
                            field: 'Id',  
                            values: [row.Id],  
                        }
                    );  
                    $('#att_month_emplist_List').bootstrapTable(
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
function refresh_Check_work_list() { 
    $('#Check_work_list_List').bootstrapTable('refresh'); 
}
/** 刷新页面 */ 
function refresh_att_month_emplist() { 
    $('#att_month_emplist_List').bootstrapTable('refresh'); 
}
//引入按钮处理函数
	function introduceCheck_work_list_click_60(){
		layer.open({
			type:2,
			content:"/myehr/form/toForm.action?formId=106&intrToId=60&intrButtonId=595",
			shadeClose: true,
			maxmin:true,
			shade: 0.8,
			zIndex:9999,
			title:"<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"引入人员选择树")%>" ,
			area: ['1000', '500'],
			success:function(layero,index){ 
			$('.layui-layer-max').click();
			},
			end:function(){
				refresh_Check_work_list();
			}
		 }); 
	}
function editCheck_work_list_click_60(isView,data){
	var selects = $("#Check_work_list_List").bootstrapTable('getSelections');;
	if(selects!=null && selects.length>0){
		select = selects[0];;
		title='<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"月结果信息")%>';
	}else if(data!=null&&isView!=null){
	select = data;
	title='<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"预览")%>';
	}else {
		alert('<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"请选择一行数据")%>');return ;
	}
	if(1==1){
		var url='/myehr/form/toForm.action?formId=156&isInit=true&K61_K61_ID='+select.K61_K61_ID+'&&&isView='+isView+'';
	}else{
		var url='/myehr/form/toForm.action?formId=156&isInit=true&K61_K61_ID='+K61_K61_ID+'&isView='+isView+'';
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
			    refresh_Check_work_list();
		}
	});
}
function removeCheck_work_list_click_60(){
	var selects = $("#Check_work_list_List").bootstrapTable('getSelections');;
	if(selects!=null && selects.length>0){
		select = selects[0];
	}else {
		alert('<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"请选择数据")%>');return ;
	}
	var r=confirm("确定删除选中记录？");
	if (r==true){
		var _rowvalids = [];
		for(var i=0;i<selects.length;i++) {;
			if (selects[i].K61_ID!="") {;
				_rowvalids.push(selects[i]);
			}
		}
		var  _param ={formId:_formId_60,params:_rowvalids};
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
					refresh_Check_work_list();;
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
function add2Check_work_list_click_60(isView,data){
	title='<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"月结果计算")%>';
		var url='/myehr/form/toForm.action?formId=83';
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
			    refresh_Check_work_list();
		}
	});
}
	function importCheck_work_list_click_60() {
		var url = "/myehr/jsp/form/button/importButton.jsp?formId=60&templateFileid=&templateFilename=null&buttonId=129";
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
					grid_Check_work_list.reload();
				}
			}
		});
	}
var filterParam = {};
var queryParams;
function grid_Check_work_list_fun(pageReqeust){
	var _filterdata={};
	if(document.getElementById('grid_Check_work_list_filter')){
	if($("[id='FILTER_K61.K61_D9999_60']").attr('multiSelect')){
		var val = "";
		var arr = $("[id='FILTER_K61.K61_D9999_60']").val();
		if(arr==null){
		}else{
			for(var i=0;i<arr.length;i++){
				val+=arr[i]+',';
			}
			val = val.substring(0,val.length-1);
		}
		var K61_D9999=val;
	}else if(($("[id='FILTER_K61.K61_D9999_60']").attr('styleType')=="select")||($("[id='FILTER_K61.K61_D9999_60']").attr('styleType')=="dateTime")){
			var K61_D9999=$("[id='FILTER_K61.K61_D9999_60']").val();
		}else{
				var K61_D9999=$("[id='FILTER_60']").val();
		}
	if($("[id='FILTER_A01.A01_A0190_60']").attr('multiSelect')){
		var val = "";
		var arr = $("[id='FILTER_A01.A01_A0190_60']").val();
		if(arr==null){
		}else{
			for(var i=0;i<arr.length;i++){
				val+=arr[i]+',';
			}
			val = val.substring(0,val.length-1);
		}
		var A01_A0190=val;
	}else if(($("[id='FILTER_A01.A01_A0190_60']").attr('styleType')=="select")||($("[id='FILTER_A01.A01_A0190_60']").attr('styleType')=="dateTime")){
			var A01_A0190=$("[id='FILTER_A01.A01_A0190_60']").val();
		}else{
				var A01_A0190=$("[id='FILTER_60']").val();
		}
	if($("[id='FILTER_A01.A01_A0101_60']").attr('multiSelect')){
		var val = "";
		var arr = $("[id='FILTER_A01.A01_A0101_60']").val();
		if(arr==null){
		}else{
			for(var i=0;i<arr.length;i++){
				val+=arr[i]+',';
			}
			val = val.substring(0,val.length-1);
		}
		var A01_A0101=val;
	}else if(($("[id='FILTER_A01.A01_A0101_60']").attr('styleType')=="select")||($("[id='FILTER_A01.A01_A0101_60']").attr('styleType')=="dateTime")){
			var A01_A0101=$("[id='FILTER_A01.A01_A0101_60']").val();
		}else{
				var A01_A0101=$("[id='FILTER_60']").val();
		}
		_filterdata={K61_D9999:K61_D9999,A01_A0190:A01_A0190,A01_A0101:A01_A0101};
	}
	var paramsMap = {};
	var requestParam={};
	if('${param.A01_A0188}'==''){
		if(A01_A0188==undefined){
			requestParam = {DEPTCODE_DEPT_CODE:'${param.DEPTCODE_DEPT_CODE}'};
		}else{
			requestParam = {A01_A0188:A01_A0188+"",DEPTCODE_DEPT_CODE:DEPTCODE_DEPT_CODE+""};
		}
	}else{
		requestParam = {A01_A0188:'${param.A01_A0188}',DEPTCODE_DEPT_CODE:'${param.DEPTCODE_DEPT_CODE}'};
	}
	pageReqeust.containerParam=containerParam;
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.userIds='${param.empIds}';
	pageReqeust.formId=_formId_60;
	pageReqeust.isView=null;
	if(heightGadedata!=null&&heightGadedata!=undefined){
		pageReqeust.heightGrade = heightGadedata;
	}
	queryParams = JSON.stringify(pageReqeust);
	return queryParams;
}
function grid_Check_work_list_fun11_60(){
	$('#Check_work_list_List').bootstrapTable('refresh');
}
	
function executeSQL1Check_work_list_click_60(){

	var buttonId = 131;
	var checkselecdata = $("#Check_work_list_List").bootstrapTable('getSelections');
	if(checkselecdata==null||checkselecdata==''||checkselecdata.lenght<=0){
		alert('<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"请选择数据！")%>');
		return;
	}
	var columnDataRows = $("#Check_work_list_List").bootstrapTable('getSelections');
	var k61_k61_id_60Datas;
	var tempk61_k61_id_60Datas = [];
	for(var i=0; i<columnDataRows.length; i++){
		tempk61_k61_id_60Datas.push("'"+columnDataRows[i].K61_K61_ID+"'");
	}
	k61_k61_id_60Datas = tempk61_k61_id_60Datas.join(',');
	var paramsMap = {		'c_1454' : k61_k61_id_60Datas,
		's_userId' : '1'};
	var data = {
		'formId' : _formId_60,
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
						$("#Check_work_list_List").bootstrapTable('refresh');
					} else {
							alert('<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"执行结果")%>：' + text[1]);
					}
				       jQuery('#activity_pane').hideLoading();
			refresh_Check_work_list();

			},
			error : function (jqXHR, textStatus, errorThrown) {
			}
		});

	}


	
function executeSQL2Check_work_list_click_60(){

	var buttonId = 132;
	var checkselecdata = $("#Check_work_list_List").bootstrapTable('getSelections');
	if(checkselecdata==null||checkselecdata==''||checkselecdata.lenght<=0){
		alert('<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"请选择数据！")%>');
		return;
	}
	var columnDataRows = $("#Check_work_list_List").bootstrapTable('getSelections');
	var k61_k61_id_60Datas;
	var tempk61_k61_id_60Datas = [];
	for(var i=0; i<columnDataRows.length; i++){
		tempk61_k61_id_60Datas.push("'"+columnDataRows[i].K61_K61_ID+"'");
	}
	k61_k61_id_60Datas = tempk61_k61_id_60Datas.join(',');
	var paramsMap = {		'c_1454' : k61_k61_id_60Datas,
		's_userId' : '1'};
	var data = {
		'formId' : _formId_60,
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
						$("#Check_work_list_List").bootstrapTable('refresh');
					} else {
							alert('<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"执行结果")%>：' + text[1]);
					}
				       jQuery('#activity_pane').hideLoading();
			refresh_Check_work_list();

			},
			error : function (jqXHR, textStatus, errorThrown) {
			}
		});

	}


	function grid_Check_work_list_HeighQuery_60() {
		layer.open({
			type: 2,
			showMaxButton: true,
			title:"<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"高级查询设置")%>" ,
			area: ['855', '500'],
			maxmin: true,
			content:'/myehr/jsp/form/button/heightGrade.jsp?formFunction=grid_Check_work_list_fun11_60&formDefId=60&formDefLayout=2',
			success:function(layero,index){
				},
				end:function(){
			}
			});
	}
	//关闭
	function closex_60(){ 
			    var index = parent.layer.getFrameIndex(window.name); //获取当前窗体索引
			    parent.layer.close(index);//执行关闭
	}
var filterParam = {};
var queryParams;
function grid_att_month_emplist_fun(pageReqeust){
	var _filterdata={};
	if(document.getElementById('grid_att_month_emplist_filter')){
	if($("[id='FILTER_A01.A01_A0101_1809']").attr('multiSelect')){
		var val = "";
		var arr = $("[id='FILTER_A01.A01_A0101_1809']").val();
		if(arr==null){
		}else{
			for(var i=0;i<arr.length;i++){
				val+=arr[i]+',';
			}
			val = val.substring(0,val.length-1);
		}
		var A01_A0101=val;
	}else if(($("[id='FILTER_A01.A01_A0101_1809']").attr('styleType')=="select")||($("[id='FILTER_A01.A01_A0101_1809']").attr('styleType')=="dateTime")){
			var A01_A0101=$("[id='FILTER_A01.A01_A0101_1809']").val();
		}else{
				var A01_A0101=$("[id='FILTER_1809']").val();
		}
	if($("[id='FILTER_A01.A01_A0190_1809']").attr('multiSelect')){
		var val = "";
		var arr = $("[id='FILTER_A01.A01_A0190_1809']").val();
		if(arr==null){
		}else{
			for(var i=0;i<arr.length;i++){
				val+=arr[i]+',';
			}
			val = val.substring(0,val.length-1);
		}
		var A01_A0190=val;
	}else if(($("[id='FILTER_A01.A01_A0190_1809']").attr('styleType')=="select")||($("[id='FILTER_A01.A01_A0190_1809']").attr('styleType')=="dateTime")){
			var A01_A0190=$("[id='FILTER_A01.A01_A0190_1809']").val();
		}else{
				var A01_A0190=$("[id='FILTER_1809']").val();
		}
		_filterdata={A01_A0101:A01_A0101,A01_A0190:A01_A0190};
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
	pageReqeust.formId=_formId_1809;
	pageReqeust.isView=null;
	if(heightGadedata!=null&&heightGadedata!=undefined){
		pageReqeust.heightGrade = heightGadedata;
	}
	queryParams = JSON.stringify(pageReqeust);
	return queryParams;
}
function grid_att_month_emplist_fun11_1809(){
	$('#att_month_emplist_List').bootstrapTable('refresh');
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
			 todayBtn:'linked',  
			 autoclose: 1,  
			 todayHighlight:true,  
			 startView: 4,  
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
