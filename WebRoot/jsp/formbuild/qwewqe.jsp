<%@ page language="java" import="com.myehr.common.util.LangUtil" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/common/common.jsp" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<body>
<form id="form_3917" name="form_3917"  style="width:100%;">
<div class="container-fluid" style="width:50%;overflow:auto;float:left;padding-top:5px">
	<div id="form_1994" style="margin-top:0px;">
<div class="input-group" style="z-index: 5;float:right">
    <div id="grid_ceishi_filter">
        <table class="cbs-table" style="width:100%">
             <tr>
			<td style="float:right;padding-top:5px">
				<input id="FILTER_1994" name="FILTER_1994" placeholder="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"工号")%>,<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"部门")%>" style="padding: 6px 30px 6px 10px;" title="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"工号")%>,<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"部门")%>" type="text" class="form-control" oninput="grid_ceishi_fun11_1994()" />
				<i class="icon-search" style="position: absolute;right: 12px;top: 2px;cursor: pointer;"></i>
			</td>
            </tr>
        </table>
    </div>
</div>
</div>
<table id="ceishi_List">
</table>
<div id="activity_pane" style="position:absolute;left:500px;top:70px"></div>
</div>
<div class="container-fluid" style="width:50%;overflow:auto;float:left;padding-top:5px">
	<ul class="nav nav-tabs" id="myTab">
		<li class="active"><a href="#Tab_1">选择题目</a></li>
	</ul>
	<div class="tab-content">
		<div class="tab-pane active" id="Tab_1">
			<div class="container-fluid">
				<div style="">
		<div class="BTNGROUP BTNGROUP_3320" style="margin:5px auto; display:inline-block;height: 30px;z-index: 6;position: relative">
			<div style="margin-right:10px;display:inline-block">
			    <input type="button" id="selectPICK_QUESTIONS"  class="btn btn-primary" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"选择")%> onclick="selectPICK_QUESTIONS_click_3320()"/>
			</div>
			<div style="margin-right:10px;display:inline-block">
			    <input type="button" id="importPICK_QUESTIONS"  class="btn btn-info" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"导入")%> onclick="importPICK_QUESTIONS_click_3320()"/>
			</div>
			<div style="margin-right:10px;display:inline-block">
			    <input type="button" id="removePICK_QUESTIONS"  class="btn btn-danger" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"删除")%> onclick="removePICK_QUESTIONS_click_3320()"/>
			</div>
		</div>
<table id="PICK_QUESTIONS_List">
</table>
<div id="activity_pane" style="position:absolute;left:500px;top:70px"></div>
		</div>
</div>
</div>
</div>
</div>
</form>
<script>
var heightGadedata_1994 =[];
var containerParam_1994 ={};
containerParam_1994 ={EMP_ID:''};
function changeHeightGadedata_1994(data){
	heightGadedata_1994 = data;
}
var heightGadedata_3320 =[];
var containerParam_3320 ={};
containerParam_3320 ={};
function changeHeightGadedata_3320(data){
	heightGadedata_3320 = data;
}
$(function() {
    querys_3320();
gridPatterns2();

    querys_1994();
    cardSelectInitFunction('${param.formType}');
    cardDateWidInitFunction();
$(".fixed-table-body").css("height","64%");
	var x0=0;
	$('#myTab a').click(function (e) {
			e.preventDefault();
			var x = $(this)[0].innerHTML;
	if(x=="选择题目"){
			if(x0==0){
			querys_3320();
			$(this).tab('show');
			var tab = this.hash;
var tab2 = $(tab).find('table').bootstrapTable('refresh');
			}else{
			$(this).tab('show');
			var tab = this.hash;
var tab2 = $(tab).find('table').bootstrapTable('refresh');
			}
			x0++;
			}
	});
$("#form_1994.input-group").css("padding-bottom","0px");
$(".fixed-table-toolbar").css("margin-top","0px");
$(".fixed-table-toolbar").css("height","10px");
});
	var _formId_3320='3320';
var realFormId='${param.formId}';
	var _formId_1994='1994';
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
    function querys_3320() {
        initRoleColumn('3320');
        initRoleButtons('3320','PICK_QUESTIONS');
        $("#PICK_QUESTIONS_List").bootstrapTable({
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
            queryParams : grid_PICK_QUESTIONS_fun,
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
                field : 'SYSQUESTION_ID',
                align : 'center',
                visible : false,
                valign : 'left',
                sortable : true,
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"SYSQUESTION_ID\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"主键\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"题目编码")%>',
                field : 'SYSQUESTION_CODE',
                align : 'center',
                visible : columnvisible.SYSQUESTION_CODE,
                valign : 'left',
                sortable : true,
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"SYSQUESTION_CODE\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"题目编码\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"题目中文名")%>',
                field : 'SYSQUESTION_CNAME',
                align : 'center',
                visible : columnvisible.SYSQUESTION_CNAME,
                valign : 'left',
                sortable : true,
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"SYSQUESTION_CNAME\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"题目中文名\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"题目英文名")%>',
                field : 'SYSQUESTION_ENAME',
                align : 'center',
                visible : columnvisible.SYSQUESTION_ENAME,
                valign : 'left',
                sortable : true,
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"SYSQUESTION_ENAME\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"题目英文名\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"题目分类")%>',
                field : 'SYSQUESTION_GROUPID',
                align : 'center',
                visible : columnvisible.SYSQUESTION_GROUPID,
                valign : 'left',
                sortable : true,
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"SYSQUESTION_GROUPID\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"题目分类\" data-source=\"${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode1.action?deleteMark=SYS_QUESTION&realValue="+value+"+\"></a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"题型")%>',
                field : 'SYSQUESTION_XTYPE',
                align : 'center',
                visible : columnvisible.SYSQUESTION_XTYPE,
                valign : 'left',
                sortable : true,
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"SYSQUESTION_XTYPE\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"题型\" data-source=\"${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode1.action?deleteMark=QUESTIONTYPE&realValue="+value+"+\"></a>";
                }
            },

  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"题目描述")%>',
                field : 'SYSQUESTION_DESCRIBE',
                align : 'center',
                visible : columnvisible.SYSQUESTION_DESCRIBE,
                valign : 'left',
                sortable : true,
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"SYSQUESTION_DESCRIBE\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"题目描述\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"分值")%>',
                field : 'SYSQUESTION_AMOUNT',
                align : 'center',
                visible : columnvisible.SYSQUESTION_AMOUNT,
                valign : 'left',
                sortable : true,
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"SYSQUESTION_AMOUNT\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"分值\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"标识")%>',
                field : 'SYSQUESTION_REMARK',
                align : 'center',
                visible : columnvisible.SYSQUESTION_REMARK,
                valign : 'left',
                sortable : true,
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"SYSQUESTION_REMARK\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"标识\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"操作人")%>',
                field : 'SYSQUESTION_OPERATOR_NAME',
                align : 'center',
                visible : columnvisible.SYSQUESTION_OPERATOR_NAME,
                valign : 'left',
                sortable : true,
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"SYSQUESTION_OPERATOR_NAME\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"操作人\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"操作时间")%>',
                field : 'SYSQUESTION_OPERATOR_TIME',
                align : 'center',
                visible : columnvisible.SYSQUESTION_OPERATOR_TIME,
                valign : 'left',
                sortable : true,
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
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px\" name=\"SYSQUESTION_OPERATOR_TIME\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"操作时间\">"+date+"</a>";
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
                $("#PICK_QUESTIONS_List a").editable({
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
        	editPICK_QUESTIONS_click_3320('isView',row);  
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
    function querys_1994() {
        initRoleColumn('1994');
        initRoleButtons('1994','ceishi');
        $("#ceishi_List").bootstrapTable({
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
            queryParams : grid_ceishi_fun,
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
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"员工ID")%>',
                field : 'EMPEMPLOYEE_EMPID',
                align : 'center',
                visible : false,
                valign : 'left',
                sortable : true,
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEE_EMPID\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"员工ID\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"工号")%>',
                field : 'EMPEMPLOYEE_EMPCODE',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEE_EMPCODE,
                valign : 'left',
                sortable : true,
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEE_EMPCODE\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"工号\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"姓名")%>',
                field : 'EMPEMPLOYEE_CNAME',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEE_CNAME,
                valign : 'left',
                sortable : true,
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEE_CNAME\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"姓名\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"公司")%>',
                field : 'EMPEMPLOYEE_COMPID',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEE_COMPID,
                valign : 'left',
                sortable : true,
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEE_COMPID\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"公司\" data-source=\"${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode1.action?deleteMark= data_form_49306&dataField=EMPEMPLOYEE_COMPID&realValue="+value+"+\"></a>";
                }
            },

  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"部门")%>',
                field : 'EMPEMPLOYEE_DEPID',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEE_DEPID,
                valign : 'left',
                sortable : true,
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEE_DEPID\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"部门\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"岗位")%>',
                field : 'EMPEMPLOYEE_JOBID',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEE_JOBID,
                valign : 'left',
                sortable : true,
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEE_JOBID\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"岗位\">"+value+"</a>";
                }
            },
            ],
            onClickRow: function (row, $element) {
                curRow = row;
				$('#PICK_QUESTIONS_List').bootstrapTable('refresh');
$('#ceishi_List').bootstrapTable('uncheckAll'); 
$element[0].click(); 
            },
		onPostBody: function (res) {
		    hiddenBorder(0);
		},
		onLoadSuccess: function (aa, bb, cc) {
                $("#ceishi_List a").editable({
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
        	editceishi_click_1994('isView',row);  
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
function refresh_PICK_QUESTIONS() { 
    $('#PICK_QUESTIONS_List').bootstrapTable('refresh'); 
}

/** 隐藏边框 */ 
function hiddenBorder(type) { 
    if(type == 0){
        $("#PICK_QUESTIONS_List td").css("border","none");
    }else if(type == 1){
        $("#PICK_QUESTIONS_List td").css("border-left","none");
    }else if(type == 2){
        $("#PICK_QUESTIONS_List td").css("border-top","none");
    }
}
/** 刷新页面 */ 
function refresh_ceishi() { 
    $('#ceishi_List').bootstrapTable('refresh'); 
}

/** 隐藏边框 */ 
function hiddenBorder(type) { 
    if(type == 0){
        $("#ceishi_List td").css("border","none");
    }else if(type == 1){
        $("#ceishi_List td").css("border-left","none");
    }else if(type == 2){
        $("#ceishi_List td").css("border-top","none");
    }
}
	function importPICK_QUESTIONS_click_3320() {
		var url = "/myehr/jsp/form/button/importButton.jsp?formId=3320&templateFileid=&templateFilename=&buttonId=4364";
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
					grid_PICK_QUESTIONS.reload();
				}
			}
		});
	}
function removePICK_QUESTIONS_click_3320(){
	var selects = $("#PICK_QUESTIONS_List").bootstrapTable('getSelections');;
	if(selects!=null && selects.length>0){
		select = selects[0];
	}else {
		alert('<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"请选择数据")%>');return ;
	}
	var r=confirm("确定删除选中记录？");
	if (r==true){
		var _rowvalids = [];
		for(var i=0;i<selects.length;i++) {;
			if (selects[i].ID!="") {;
				_rowvalids.push(selects[i]);
			}
		}
		var  _param ={formId:_formId_3320,params:_rowvalids};
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
					refresh_PICK_QUESTIONS();;
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
function grid_PICK_QUESTIONS_fun(pageReqeust){
	var _filterdata={};
	if(document.getElementById('grid_PICK_QUESTIONS_filter')){
	}
	var paramsMap = {};
	var requestParam={};
		requestParam = {};
	pageReqeust.containerParam=containerParam_3320;
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.userIds='${param.empIds}';
	pageReqeust.formId=_formId_3320;
	pageReqeust.isView=null;
	if(heightGadedata_3320!=null&&heightGadedata_3320!=undefined){
		pageReqeust.heightGrade = heightGadedata_3320;
	}
	queryParams = JSON.stringify(pageReqeust);
	return queryParams;
}
function grid_PICK_QUESTIONS_fun11_3320(){
	$('#PICK_QUESTIONS_List').bootstrapTable('refresh');
}
//选中按钮使用的click方法 （自定生成）
function selectPICK_QUESTIONS_click_3320(){
	var selectGrid = $("#PICK_QUESTIONS_List").bootstrapTable('getSelections');;
	var parentId = '${param.fatherId}';
	var intrToId = '${param.intrToId}';
	var intrButtonId = '${param.intrButtonId}';
	var idField = '${param.idField}';
	var textField = '${param.textField}';
	if(intrToId==''&&intrButtonId==''){
	if(selectGrid!=null&&selectGrid.length>0){
		parent.document.getElementById(parentId).value=selectGrid[0][idField];
		parent.document.getElementById(parentId+'_name').value=selectGrid[0][textField];
		var index = parent.layer.getFrameIndex(window.name); //获取当前窗体索引
		parent.layer.close(index); //执行关闭
	}else {
	alert('<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"请选择数据")%>');
	}
	}else{
		gridIntroduce(selectGrid);
	}
}
function getUrlParam(key){
	// 获取参数
	var url = window.location.search;
    // 正则筛选地址栏
    var reg = new RegExp("(^|&)"+ key +"=([^&]*)(&|$)");
    // 匹配目标参数
    var result = url.substr(1).match(reg);
    //返回参数值
    return result ? decodeURIComponent(result[2]) : null;
}
function gridIntroduce(selectGrid){
	var introduceParam = {};  
	var creatParam = {};  
	introduceParam.columns = selectGrid;  
		var creatParams ;
		var creatParam={} ;
		var requestParams ;
		var requestParam={} ;
		$.ajax({
				url:'/myehr/button/getCreateParamById.action?intrToId=${param.intrToId}&intrButtonId=${param.intrButtonId}',
				type:'post',
				cache: false,
				async: false,
				contentType: 'application/json;charset=utf-8',
		success: function (data) {
			if(data!=null){
				creatParams = data;
			}else{
				creatParams = null;
			}
		}
	});
		$.ajax({
				url:'/myehr/button/getRequestParamById.action?intrToId=${param.intrToId}&intrButtonId=${param.intrButtonId}',
				type:'post',
				cache: false,
				async: false,
				contentType: 'application/json;charset=utf-8',
		success: function (data) {
			if(data!=null){
				requestParams = data;
			}else{
				requestParams = null;
			}
		}
	});
	if(requestParams!=null){
	for(var i = 0 ;i<requestParams.length;i++){
	requestParam[requestParams[i]] = getUrlParam(requestParams[i]);
	}
	introduceParam.requestParam = requestParam;
	}
	if(creatParams==null){
		return null;
	}else{
		var content = "";
		content +=  "<div id='createParam' class='row cell' style='border:none;line-height:25px;height:95%;overflow:auto;' >\n";
		//循环
		for(var i = 0 ;i<creatParams.length;i++){
			content +=	"	<div id='param1' class='col-lg-12 col-md-12 col-sm-12 col-xs-12'>\n"+
				"		<div class='ui search selection dropdown entitybox field-control' style='display: inline-block;width:100%;'>\n"+
				"			<lable style='float:left;font-size:12px'>"+creatParams[i]+"</lable>\n"+
				"			<input id='"+creatParams[i]+"' type=\"text\" class='form-control ' style='float:left;width:60%;'/>\n"+
				"		</div>\n"+
				"	</div>\n";
				}
			content +=	"</div>\n";
				if(creatParams.length>0){
			layer.open({
				title:'自定义编辑',
				shadeClose: true,
				zIndex:9999,
				content: content,
				area: ['600px', '670px'],
				btn: ['保存', '取消'],
				success: function(layero, index){
				},
				yes: function(index, layero){
					//循环
					for(var i = 0 ;i<creatParams.length;i++){
						creatParam[creatParams[i]] = $("#"+creatParams[i]).val();
					}
	introduceParam.creatParam = creatParam;	  
	$.ajax({  
		type: 'POST', 
		cache: false,
		async: false,
		contentType: 'application/json;charset=utf-8',
		data: JSON.stringify(introduceParam),  
		url: '${pageContext.request.contextPath }/button/saveIntroduceGrid.action?formId=${param.formId}&intrToId=${param.intrToId}&intrButtonId=${param.intrButtonId}',
		success: function (data) {  
		if(data[0]==0){
		layer.alert('引入成功', {
			  icon: 6,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
			  skin: 'layer-ext-moon' 
			})
			}else{
		layer.alert('引入失败', {
			  icon: 5,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
			  skin: 'layer-ext-moon' 
			})
			}
		}
	});
					layer.close(index);
				},
				btn2: function(index, layero){
				}
			});
				}else{
	$.ajax({  
		type: 'POST', 
		cache: false,
		async: false,
		contentType: 'application/json;charset=utf-8',
		data: JSON.stringify(introduceParam),  
		url: '${pageContext.request.contextPath }/button/saveIntroduceGrid.action?formId=${param.formId}&intrToId=${param.intrToId}&intrButtonId=${param.intrButtonId}',
		success: function (data) {  
		if(data[0]==0){
		layer.alert('引入成功', {
			  icon: 6,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
			  skin: 'layer-ext-moon' 
			})
			}else{
		layer.alert('引入失败', {
			  icon: 5,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
			  skin: 'layer-ext-moon' 
			})
			}
		}
	});
				}
		}
	}
	function grid_PICK_QUESTIONS_HeighQuery_3320() {
		layer.open({
			type: 2,
			showMaxButton: true,
			title:"<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"高级查询设置")%>" ,
			area: ['855', '500'],
			maxmin: true,
			content:'/myehr/jsp/form/button/heightGrade.jsp?formFunction=grid_PICK_QUESTIONS_fun11_3320&formDefId=3320&formDefLayout=2',
			success:function(layero,index){
				},
				end:function(){
			}
			});
	}
var filterParam = {};
var queryParams;
function grid_ceishi_fun(pageReqeust){
	var _filterdata={};
	if(document.getElementById('grid_ceishi_filter')){
	if($("[id='FILTER_EMP_EMPLOYEE.EMPEMPLOYEE_EMPCODE_1994']").attr('multiSelect')){
		var val = "";
		var arr = $("[id='FILTER_EMP_EMPLOYEE.EMPEMPLOYEE_EMPCODE_1994']").val();
		if(arr==null){
		}else{
			for(var i=0;i<arr.length;i++){
				val+=arr[i]+',';
			}
			val = val.substring(0,val.length-1);
		}
		var EMPEMPLOYEE_EMPCODE=val;
	}else if(($("[id='FILTER_EMP_EMPLOYEE.EMPEMPLOYEE_EMPCODE_1994']").attr('styleType')=="select")||($("[id='FILTER_EMP_EMPLOYEE.EMPEMPLOYEE_EMPCODE_1994']").attr('styleType')=="dateTime")){
			var EMPEMPLOYEE_EMPCODE=$("[id='FILTER_EMP_EMPLOYEE.EMPEMPLOYEE_EMPCODE_1994']").val();
		}else{
				var EMPEMPLOYEE_EMPCODE=$("[id='FILTER_1994']").val();
		}
	if($("[id='FILTER_EMP_EMPLOYEE.EMPEMPLOYEE_DEPID_1994']").attr('multiSelect')){
		var val = "";
		var arr = $("[id='FILTER_EMP_EMPLOYEE.EMPEMPLOYEE_DEPID_1994']").val();
		if(arr==null){
		}else{
			for(var i=0;i<arr.length;i++){
				val+=arr[i]+',';
			}
			val = val.substring(0,val.length-1);
		}
		var EMPEMPLOYEE_DEPID=val;
	}else if(($("[id='FILTER_EMP_EMPLOYEE.EMPEMPLOYEE_DEPID_1994']").attr('styleType')=="select")||($("[id='FILTER_EMP_EMPLOYEE.EMPEMPLOYEE_DEPID_1994']").attr('styleType')=="dateTime")){
			var EMPEMPLOYEE_DEPID=$("[id='FILTER_EMP_EMPLOYEE.EMPEMPLOYEE_DEPID_1994']").val();
		}else{
				var EMPEMPLOYEE_DEPID=$("[id='FILTER_1994']").val();
		}
		_filterdata={EMPEMPLOYEE_EMPCODE:EMPEMPLOYEE_EMPCODE,EMPEMPLOYEE_DEPID:EMPEMPLOYEE_DEPID};
	}
	var paramsMap = {};
	var requestParam={};
		requestParam = {};
	pageReqeust.containerParam=containerParam_1994;
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.userIds='${param.empIds}';
	pageReqeust.formId=_formId_1994;
	pageReqeust.isView=null;
	if(heightGadedata_1994!=null&&heightGadedata_1994!=undefined){
		pageReqeust.heightGrade = heightGadedata_1994;
	}
	queryParams = JSON.stringify(pageReqeust);
	return queryParams;
}
function grid_ceishi_fun11_1994(){
	$('#ceishi_List').bootstrapTable('refresh');
}
</script>
</body>
</html>
