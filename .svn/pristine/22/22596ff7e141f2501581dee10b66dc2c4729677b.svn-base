<%@ page language="java" import="java.util.*" import="com.myehr.common.util.LangUtil" pageEncoding="UTF-8"%>
<%@ include file="/common/commontest.jsp" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<body>
<div class="container-fluid" style="height:100%;overflow-y:auto;padding-top:5px;">
	<div class="BTNGROUP BTNGROUP_4468" style="margin:5px auto; display:inline-block;height: 30px;z-index: 6;position: relative">
		<div style="margin-right:10px;display:inline-block">
			<input type="button" id="editemp_emp_list_zm"  class="btn btn-warning" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"查看详细信息")%> onclick="editemp_emp_list_zm_click_4468()"/>
		</div>
	</div>
	<table id="emp_emp_list_zm_List">
	</table>
	<div id="activity_pane" style="position:absolute;left:500px;top:70px"></div>
</div>
<script>
var dictDatas_emp_emp_list_zm_85135 = '';
var dictDatas_emp_emp_list_zm_85136 = '';
var dictDatas_emp_emp_list_zm_85137 = '';
var dictDatas_emp_emp_list_zm_85214 = '';
var dictDatas_emp_emp_list_zm_85138 = '';
var dictDatas_emp_emp_list_zm_85139 = '';
var dictDatas_emp_emp_list_zm_85140 = '';
var dictDatas_emp_emp_list_zm_85226 = '';
var dictDatas_emp_emp_list_zm_85228 = '';
var dictDatas_emp_emp_list_zm_85229 = '';
var dictDatas_emp_emp_list_zm_85232 = '';
var dictDatas_emp_emp_list_zm_85233 = '';
var dictDatas_emp_emp_list_zm_85148 = '';
var dictDatas_emp_emp_list_zm_85149 = '';
var dictDatas_emp_emp_list_zm_85192 = '';
var dictDatas_emp_emp_list_zm_85193 = '';
var dictDatas_emp_emp_list_zm_85194 = '';
var dictDatas_emp_emp_list_zm_85165 = '';
var dictDatas_emp_emp_list_zm_85166 = '';
var dictDatas_emp_emp_list_zm_85168 = '';
var dictDatas_emp_emp_list_zm_85170 = '';
var dictDatas_emp_emp_list_zm_85205 = '';
var dictDatas_emp_emp_list_zm_85206 = '';
var dictDatas_emp_emp_list_zm_85209 = '';
var dictDatas_emp_emp_list_zm_85211 = '';
var dictDatas_emp_emp_list_zm_85212 = '';
var dictDatas_emp_emp_list_zm_85174 = '';
var dictDatas_emp_emp_list_zm_85181 = '';
var dictDatas_emp_emp_list_zm_85182 = '';
var dictDatas_emp_emp_list_zm_85143 = '';
var dictDatas_emp_emp_list_zm_85183 = '';
var dictDatas_emp_emp_list_zm_85184 = '';

var heightGadedata_4468 =[];
var containerParam_4468 ={};
containerParam_4468 ={};
function changeHeightGadedata_4468(data){
	heightGadedata_4468 = data;
}
function getDictDatasByFormId(){
$.ajax({
	url:'/myehr/form/getDictDatasByFormId.action?formId=${param.formId}&formIds=4468',
	type:'post',
	cache: false,
	async:false,
	success: function (obj) {
		dictDatas_emp_emp_list_zm_85135 = obj.dictDatas_emp_emp_list_zm_85135;
		dictDatas_emp_emp_list_zm_85136 = obj.dictDatas_emp_emp_list_zm_85136;
		dictDatas_emp_emp_list_zm_85137 = obj.dictDatas_emp_emp_list_zm_85137;
		dictDatas_emp_emp_list_zm_85214 = obj.dictDatas_emp_emp_list_zm_85214;
		dictDatas_emp_emp_list_zm_85138 = obj.dictDatas_emp_emp_list_zm_85138;
		dictDatas_emp_emp_list_zm_85139 = obj.dictDatas_emp_emp_list_zm_85139;
		dictDatas_emp_emp_list_zm_85140 = obj.dictDatas_emp_emp_list_zm_85140;
		dictDatas_emp_emp_list_zm_85226 = obj.dictDatas_emp_emp_list_zm_85226;
		dictDatas_emp_emp_list_zm_85228 = obj.dictDatas_emp_emp_list_zm_85228;
		dictDatas_emp_emp_list_zm_85229 = obj.dictDatas_emp_emp_list_zm_85229;
		dictDatas_emp_emp_list_zm_85232 = obj.dictDatas_emp_emp_list_zm_85232;
		dictDatas_emp_emp_list_zm_85233 = obj.dictDatas_emp_emp_list_zm_85233;
		dictDatas_emp_emp_list_zm_85148 = obj.dictDatas_emp_emp_list_zm_85148;
		dictDatas_emp_emp_list_zm_85149 = obj.dictDatas_emp_emp_list_zm_85149;
		dictDatas_emp_emp_list_zm_85192 = obj.dictDatas_emp_emp_list_zm_85192;
		dictDatas_emp_emp_list_zm_85193 = obj.dictDatas_emp_emp_list_zm_85193;
		dictDatas_emp_emp_list_zm_85194 = obj.dictDatas_emp_emp_list_zm_85194;
		dictDatas_emp_emp_list_zm_85165 = obj.dictDatas_emp_emp_list_zm_85165;
		dictDatas_emp_emp_list_zm_85166 = obj.dictDatas_emp_emp_list_zm_85166;
		dictDatas_emp_emp_list_zm_85168 = obj.dictDatas_emp_emp_list_zm_85168;
		dictDatas_emp_emp_list_zm_85170 = obj.dictDatas_emp_emp_list_zm_85170;
		dictDatas_emp_emp_list_zm_85205 = obj.dictDatas_emp_emp_list_zm_85205;
		dictDatas_emp_emp_list_zm_85206 = obj.dictDatas_emp_emp_list_zm_85206;
		dictDatas_emp_emp_list_zm_85209 = obj.dictDatas_emp_emp_list_zm_85209;
		dictDatas_emp_emp_list_zm_85211 = obj.dictDatas_emp_emp_list_zm_85211;
		dictDatas_emp_emp_list_zm_85212 = obj.dictDatas_emp_emp_list_zm_85212;
		dictDatas_emp_emp_list_zm_85174 = obj.dictDatas_emp_emp_list_zm_85174;
		dictDatas_emp_emp_list_zm_85181 = obj.dictDatas_emp_emp_list_zm_85181;
		dictDatas_emp_emp_list_zm_85182 = obj.dictDatas_emp_emp_list_zm_85182;
		dictDatas_emp_emp_list_zm_85143 = obj.dictDatas_emp_emp_list_zm_85143;
		dictDatas_emp_emp_list_zm_85183 = obj.dictDatas_emp_emp_list_zm_85183;
		dictDatas_emp_emp_list_zm_85184 = obj.dictDatas_emp_emp_list_zm_85184;
	}
});
}
$(function() {
	getDictDatasByFormId();
	gridPatterns1();
	cardSelectInitFunctionx_grid('${param.formType}');
	cardDateWidInitFunction();
	querys_4468();
});
var _formId_4468='4468';
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
    function querys_4468() {
        initRoleColumn('4468');
        initRoleButtons('4468','emp_emp_list_zm');
        $("#emp_emp_list_zm_List").bootstrapTable({
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
            queryParams : grid_emp_emp_list_zm_fun,
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
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"工号")%>',
                field : 'EMPVEMPLOYEE_EMPCODE',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_EMPCODE,
                valign : '',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:110px;\" name=\"EMPVEMPLOYEE_EMPCODE\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"工号\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"姓名")%>',
                field : 'EMPVEMPLOYEE_CNAME',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_CNAME,
                valign : '',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:110px;\" name=\"EMPVEMPLOYEE_CNAME\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"姓名\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"组织码")%>',
                field : 'ORGVORGANIZATION_ORGCODE',
                align : 'center',
                visible : false,
                valign : '',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:110px;\" name=\"ORGVORGANIZATION_ORGCODE\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"组织码\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"机构")%>',
                field : 'EMPVEMPLOYEE_COMPID',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_COMPID,
                valign : '',
                formatter: function (value, row, index) {
                    var value1 = '';
					  if((value!=undefined&&value!=""&&value!=null&&dictDatas_emp_emp_list_zm_85135!=undefined&&dictDatas_emp_emp_list_zm_85135!=null)||value==0){
							value1 = dictDatas_emp_emp_list_zm_85135[value];
					  }
                    if((value1==undefined || value1=="")&&value1!=0){
                        value1='-';
                    }
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:110px;\" name=\"EMPVEMPLOYEE_COMPID\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\""+value+"\" >"+value1+"</a>";
                }
            },

  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"员工ID")%>',
                field : 'EMPVEMPLOYEE_EMPID',
                align : 'center',
                visible : false,
                valign : '',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:110px;\" name=\"EMPVEMPLOYEE_EMPID\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"员工ID\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"部门")%>',
                field : 'EMPVEMPLOYEE_DEPID',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_DEPID,
                valign : '',
                formatter: function (value, row, index) {
                    var value1 = '';
					  if((value!=undefined&&value!=""&&value!=null&&dictDatas_emp_emp_list_zm_85136!=undefined&&dictDatas_emp_emp_list_zm_85136!=null)||value==0){
							value1 = dictDatas_emp_emp_list_zm_85136[value];
					  }
                    if((value1==undefined || value1=="")&&value1!=0){
                        value1='-';
                    }
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:110px;\" name=\"EMPVEMPLOYEE_DEPID\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\""+value+"\" >"+value1+"</a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"岗位")%>',
                field : 'EMPVEMPLOYEE_JOBID',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_JOBID,
                valign : '',
                formatter: function (value, row, index) {
                    var value1 = '';
					  if((value!=undefined&&value!=""&&value!=null&&dictDatas_emp_emp_list_zm_85137!=undefined&&dictDatas_emp_emp_list_zm_85137!=null)||value==0){
							value1 = dictDatas_emp_emp_list_zm_85137[value];
					  }
                    if((value1==undefined || value1=="")&&value1!=0){
                        value1='-';
                    }
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:110px;\" name=\"EMPVEMPLOYEE_JOBID\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\""+value+"\" >"+value1+"</a>";
                }
            },

  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"英文名")%>',
                field : 'EMPVEMPLOYEE_ENAME',
                align : 'center',
                visible : false,
                valign : '',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:110px;\" name=\"EMPVEMPLOYEE_ENAME\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"英文名\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"职务级别")%>',
                field : 'EMPVEMPLOYEE_POSTNAME',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_POSTNAME,
                valign : '',
                formatter: function (value, row, index) {
                    var value1 = '';
					  if((value!=undefined&&value!=""&&value!=null&&dictDatas_emp_emp_list_zm_85214!=undefined&&dictDatas_emp_emp_list_zm_85214!=null)||value==0){
							value1 = dictDatas_emp_emp_list_zm_85214[value];
					  }
                    if((value1==undefined || value1=="")&&value1!=0){
                        value1='-';
                    }
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:110px;\" name=\"EMPVEMPLOYEE_POSTNAME\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\""+value+"\" >"+value1+"</a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"员工状态")%>',
                field : 'EMPVEMPLOYEE_EMPSTATUS',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_EMPSTATUS,
                valign : '',
                formatter: function (value, row, index) {
                    var value1 = '';
					  if((value!=undefined&&value!=""&&value!=null&&dictDatas_emp_emp_list_zm_85138!=undefined&&dictDatas_emp_emp_list_zm_85138!=null)||value==0){
							value1 = dictDatas_emp_emp_list_zm_85138[value];
					  }
                    if((value1==undefined || value1=="")&&value1!=0){
                        value1='-';
                    }
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:110px;\" name=\"EMPVEMPLOYEE_EMPSTATUS\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\""+value+"\" >"+value1+"</a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"在岗状态")%>',
                field : 'EMPVEMPLOYEE_JOBSTATUS',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_JOBSTATUS,
                valign : '',
                formatter: function (value, row, index) {
                    var value1 = '';
					  if((value!=undefined&&value!=""&&value!=null&&dictDatas_emp_emp_list_zm_85139!=undefined&&dictDatas_emp_emp_list_zm_85139!=null)||value==0){
							value1 = dictDatas_emp_emp_list_zm_85139[value];
					  }
                    if((value1==undefined || value1=="")&&value1!=0){
                        value1='-';
                    }
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:110px;\" name=\"EMPVEMPLOYEE_JOBSTATUS\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\""+value+"\" >"+value1+"</a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"员工类型")%>',
                field : 'EMPVEMPLOYEE_EMPTYPE',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_EMPTYPE,
                valign : '',
                formatter: function (value, row, index) {
                    var value1 = '';
					  if((value!=undefined&&value!=""&&value!=null&&dictDatas_emp_emp_list_zm_85140!=undefined&&dictDatas_emp_emp_list_zm_85140!=null)||value==0){
							value1 = dictDatas_emp_emp_list_zm_85140[value];
					  }
                    if((value1==undefined || value1=="")&&value1!=0){
                        value1='-';
                    }
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:110px;\" name=\"EMPVEMPLOYEE_EMPTYPE\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\""+value+"\" >"+value1+"</a>";
                }
            },

  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"员工级别")%>',
                field : 'EMPVEMPLOYEE_EMPGRADE',
                align : 'center',
                visible : false,
                valign : '',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:110px;\" name=\"EMPVEMPLOYEE_EMPGRADE\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"员工级别\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"员工等级")%>',
                field : 'EMPVEMPLOYEE_EMPLEVEL',
                align : 'center',
                visible : false,
                valign : '',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:110px;\" name=\"EMPVEMPLOYEE_EMPLEVEL\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"员工等级\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"岗位等级")%>',
                field : 'EMPVEMPLOYEE_POSTRANK',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_POSTRANK,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:110px;\" name=\"EMPVEMPLOYEE_POSTRANK\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"岗位等级\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"职务等级")%>',
                field : 'EMPVEMPLOYEE_JOBRANK',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_JOBRANK,
                valign : 'left',
                formatter: function (value, row, index) {
                    var value1 = '';
					  if((value!=undefined&&value!=""&&value!=null&&dictDatas_emp_emp_list_zm_85226!=undefined&&dictDatas_emp_emp_list_zm_85226!=null)||value==0){
							value1 = dictDatas_emp_emp_list_zm_85226[value];
					  }
                    if((value1==undefined || value1=="")&&value1!=0){
                        value1='-';
                    }
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:110px;\" name=\"EMPVEMPLOYEE_JOBRANK\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\""+value+"\" >"+value1+"</a>";
                }
            },

  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"序列等级")%>',
                field : 'EMPVEMPLOYEE_SEQLEVEL',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_SEQLEVEL,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:110px;\" name=\"EMPVEMPLOYEE_SEQLEVEL\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"序列等级\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"是否后备人才")%>',
                field : 'EMPVEMPLOYEE_WHETALENT',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_WHETALENT,
                valign : 'left',
                formatter: function (value, row, index) {
                    var value1 = '';
					  if((value!=undefined&&value!=""&&value!=null&&dictDatas_emp_emp_list_zm_85228!=undefined&&dictDatas_emp_emp_list_zm_85228!=null)||value==0){
							value1 = dictDatas_emp_emp_list_zm_85228[value];
					  }
                    if((value1==undefined || value1=="")&&value1!=0){
                        value1='-';
                    }
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:110px;\" name=\"EMPVEMPLOYEE_WHETALENT\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\""+value+"\" >"+value1+"</a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"是否一把手")%>',
                field : 'EMPVEMPLOYEE_WHELEADER',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_WHELEADER,
                valign : 'left',
                formatter: function (value, row, index) {
                    var value1 = '';
					  if((value!=undefined&&value!=""&&value!=null&&dictDatas_emp_emp_list_zm_85229!=undefined&&dictDatas_emp_emp_list_zm_85229!=null)||value==0){
							value1 = dictDatas_emp_emp_list_zm_85229[value];
					  }
                    if((value1==undefined || value1=="")&&value1!=0){
                        value1='-';
                    }
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:110px;\" name=\"EMPVEMPLOYEE_WHELEADER\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\""+value+"\" >"+value1+"</a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"序列")%>',
                field : 'EMPVEMPLOYEE_SEQUENCE',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_SEQUENCE,
                valign : 'left',
                formatter: function (value, row, index) {
                    var value1 = '';
					  if((value!=undefined&&value!=""&&value!=null&&dictDatas_emp_emp_list_zm_85232!=undefined&&dictDatas_emp_emp_list_zm_85232!=null)||value==0){
							value1 = dictDatas_emp_emp_list_zm_85232[value];
					  }
                    if((value1==undefined || value1=="")&&value1!=0){
                        value1='-';
                    }
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_SEQUENCE\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\""+value+"\" >"+value1+"</a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"所属条线")%>',
                field : 'EMPVEMPLOYEE_BELONGLINE',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_BELONGLINE,
                valign : 'left',
                formatter: function (value, row, index) {
                    var value1 = '';
					  if((value!=undefined&&value!=""&&value!=null&&dictDatas_emp_emp_list_zm_85233!=undefined&&dictDatas_emp_emp_list_zm_85233!=null)||value==0){
							value1 = dictDatas_emp_emp_list_zm_85233[value];
					  }
                    if((value1==undefined || value1=="")&&value1!=0){
                        value1='-';
                    }
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_BELONGLINE\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\""+value+"\" >"+value1+"</a>";
                }
            },

  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"行龄")%>',
                field : 'EMPVEMPLOYEE_COMPYEARS',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_COMPYEARS,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:110px;\" name=\"EMPVEMPLOYEE_COMPYEARS\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"行龄\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"招聘来源")%>',
                field : 'EMPVEMPLOYEE_RECTYPE',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_RECTYPE,
                valign : '',
                formatter: function (value, row, index) {
                    var value1 = '';
					  if((value!=undefined&&value!=""&&value!=null&&dictDatas_emp_emp_list_zm_85148!=undefined&&dictDatas_emp_emp_list_zm_85148!=null)||value==0){
							value1 = dictDatas_emp_emp_list_zm_85148[value];
					  }
                    if((value1==undefined || value1=="")&&value1!=0){
                        value1='-';
                    }
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:110px;\" name=\"EMPVEMPLOYEE_RECTYPE\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\""+value+"\" >"+value1+"</a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"工作城市")%>',
                field : 'EMPVEMPLOYEE_WORKCITY',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_WORKCITY,
                valign : '',
                formatter: function (value, row, index) {
                    var value1 = '';
					  if((value!=undefined&&value!=""&&value!=null&&dictDatas_emp_emp_list_zm_85149!=undefined&&dictDatas_emp_emp_list_zm_85149!=null)||value==0){
							value1 = dictDatas_emp_emp_list_zm_85149[value];
					  }
                    if((value1==undefined || value1=="")&&value1!=0){
                        value1='-';
                    }
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:110px;\" name=\"EMPVEMPLOYEE_WORKCITY\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\""+value+"\" >"+value1+"</a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"入行日期")%>',
                field : 'EMPVEMPLOYEE_JOINDATE',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_JOINDATE,
                valign : '',
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
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:110px\" name=\"EMPVEMPLOYEE_JOINDATE\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"入行日期\">"+date+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"行龄调整(月)")%>',
                field : 'EMPVEMPLOYEE_COMPYEARADJUST',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_COMPYEARADJUST,
                valign : '',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:110px;\" name=\"EMPVEMPLOYEE_COMPYEARADJUST\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"行龄调整(月)\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"预留分类1")%>',
                field : 'EMPVEMPLOYEE_EMPGROUP1',
                align : 'center',
                visible : false,
                valign : '',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:110px;\" name=\"EMPVEMPLOYEE_EMPGROUP1\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"预留分类1\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"预留分类2")%>',
                field : 'EMPVEMPLOYEE_EMPGROUP2',
                align : 'center',
                visible : false,
                valign : '',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:110px;\" name=\"EMPVEMPLOYEE_EMPGROUP2\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"预留分类2\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"任现岗位时间")%>',
                field : 'EMPVEMPLOYEE_JOBBEGINDATE',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_JOBBEGINDATE,
                valign : '',
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
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:110px\" name=\"EMPVEMPLOYEE_JOBBEGINDATE\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"任现岗位时间\">"+date+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"岗龄")%>',
                field : 'EMPVEMPLOYEE_JOBAGE',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_JOBAGE,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:110px;\" name=\"EMPVEMPLOYEE_JOBAGE\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"岗龄\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"参加工作日期")%>',
                field : 'EMPVEMPLOYEE_BEGINWORKDATE',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_BEGINWORKDATE,
                valign : '',
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
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:110px\" name=\"EMPVEMPLOYEE_BEGINWORKDATE\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"参加工作日期\">"+date+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"工龄调整(月)")%>',
                field : 'EMPVEMPLOYEE_WORKYEARADJUST',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_WORKYEARADJUST,
                valign : '',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:110px;\" name=\"EMPVEMPLOYEE_WORKYEARADJUST\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"工龄调整(月)\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"工龄")%>',
                field : 'EMPVEMPLOYEE_WORKYEARS',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_WORKYEARS,
                valign : '',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:110px;\" name=\"EMPVEMPLOYEE_WORKYEARS\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"工龄\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"试用期开始日期")%>',
                field : 'EMPVEMPLOYEE_PROBBEGINDATE',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_PROBBEGINDATE,
                valign : '',
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
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:110px\" name=\"EMPVEMPLOYEE_PROBBEGINDATE\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"试用期开始日期\">"+date+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"试用期（月）")%>',
                field : 'EMPVEMPLOYEE_PROBTERM',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_PROBTERM,
                valign : '',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:110px;\" name=\"EMPVEMPLOYEE_PROBTERM\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"试用期（月）\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"试用期结束日期")%>',
                field : 'EMPVEMPLOYEE_PROBENDDATE',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_PROBENDDATE,
                valign : '',
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
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:110px\" name=\"EMPVEMPLOYEE_PROBENDDATE\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"试用期结束日期\">"+date+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"试用期转正日期")%>',
                field : 'EMPVEMPLOYEE_PROBCHECKENDDATE',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_PROBCHECKENDDATE,
                valign : '',
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
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:110px\" name=\"EMPVEMPLOYEE_PROBCHECKENDDATE\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"试用期转正日期\">"+date+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"实习结束日期")%>',
                field : 'EMPVEMPLOYEE_PRACENDDATE',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_PRACENDDATE,
                valign : '',
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
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:110px\" name=\"EMPVEMPLOYEE_PRACENDDATE\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"实习结束日期\">"+date+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"实习期开始日期")%>',
                field : 'EMPVEMPLOYEE_PRACBEGINDATE',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_PRACBEGINDATE,
                valign : '',
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
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:110px\" name=\"EMPVEMPLOYEE_PRACBEGINDATE\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"实习期开始日期\">"+date+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"合同编号")%>',
                field : 'EMPVEMPLOYEE_CONNO',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_CONNO,
                valign : '',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:110px;\" name=\"EMPVEMPLOYEE_CONNO\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"合同编号\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"合同签约次数")%>',
                field : 'EMPVEMPLOYEE_CONTIMES',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_CONTIMES,
                valign : '',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:110px;\" name=\"EMPVEMPLOYEE_CONTIMES\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"合同签约次数\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"合同签约单位")%>',
                field : 'EMPVEMPLOYEE_CONTRACTUNIT',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_CONTRACTUNIT,
                valign : '',
                formatter: function (value, row, index) {
                    var value1 = '';
					  if((value!=undefined&&value!=""&&value!=null&&dictDatas_emp_emp_list_zm_85192!=undefined&&dictDatas_emp_emp_list_zm_85192!=null)||value==0){
							value1 = dictDatas_emp_emp_list_zm_85192[value];
					  }
                    if((value1==undefined || value1=="")&&value1!=0){
                        value1='-';
                    }
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:110px;\" name=\"EMPVEMPLOYEE_CONTRACTUNIT\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\""+value+"\" >"+value1+"</a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"合同类型")%>',
                field : 'EMPVEMPLOYEE_CONTRACTTYPE',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_CONTRACTTYPE,
                valign : '',
                formatter: function (value, row, index) {
                    var value1 = '';
					  if((value!=undefined&&value!=""&&value!=null&&dictDatas_emp_emp_list_zm_85193!=undefined&&dictDatas_emp_emp_list_zm_85193!=null)||value==0){
							value1 = dictDatas_emp_emp_list_zm_85193[value];
					  }
                    if((value1==undefined || value1=="")&&value1!=0){
                        value1='-';
                    }
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:110px;\" name=\"EMPVEMPLOYEE_CONTRACTTYPE\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\""+value+"\" >"+value1+"</a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"合同属性")%>',
                field : 'EMPVEMPLOYEE_CONTRACTKIND',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_CONTRACTKIND,
                valign : '',
                formatter: function (value, row, index) {
                    var value1 = '';
					  if((value!=undefined&&value!=""&&value!=null&&dictDatas_emp_emp_list_zm_85194!=undefined&&dictDatas_emp_emp_list_zm_85194!=null)||value==0){
							value1 = dictDatas_emp_emp_list_zm_85194[value];
					  }
                    if((value1==undefined || value1=="")&&value1!=0){
                        value1='-';
                    }
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:110px;\" name=\"EMPVEMPLOYEE_CONTRACTKIND\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\""+value+"\" >"+value1+"</a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"合同开始日期")%>',
                field : 'EMPVEMPLOYEE_CONBEGINDATE',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_CONBEGINDATE,
                valign : '',
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
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:110px\" name=\"EMPVEMPLOYEE_CONBEGINDATE\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"合同开始日期\">"+date+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"合同期限(年)")%>',
                field : 'EMPVEMPLOYEE_CONMONTHS',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_CONMONTHS,
                valign : '',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:110px;\" name=\"EMPVEMPLOYEE_CONMONTHS\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"合同期限(年)\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"合同结束日期")%>',
                field : 'EMPVEMPLOYEE_CONENDDATE',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_CONENDDATE,
                valign : '',
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
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:110px\" name=\"EMPVEMPLOYEE_CONENDDATE\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"合同结束日期\">"+date+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"机构邮箱")%>',
                field : 'EMPVEMPLOYEE_WORKEMAIL',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_WORKEMAIL,
                valign : '',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:110px;\" name=\"EMPVEMPLOYEE_WORKEMAIL\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"机构邮箱\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"办公电话")%>',
                field : 'EMPVEMPLOYEE_WORKPHONE',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_WORKPHONE,
                valign : '',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:110px;\" name=\"EMPVEMPLOYEE_WORKPHONE\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"办公电话\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"国籍")%>',
                field : 'EMPVEMPLOYEE_COUNTRY',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_COUNTRY,
                valign : '',
                formatter: function (value, row, index) {
                    var value1 = '';
					  if((value!=undefined&&value!=""&&value!=null&&dictDatas_emp_emp_list_zm_85165!=undefined&&dictDatas_emp_emp_list_zm_85165!=null)||value==0){
							value1 = dictDatas_emp_emp_list_zm_85165[value];
					  }
                    if((value1==undefined || value1=="")&&value1!=0){
                        value1='-';
                    }
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:110px;\" name=\"EMPVEMPLOYEE_COUNTRY\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\""+value+"\" >"+value1+"</a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"民族")%>',
                field : 'EMPVEMPLOYEE_NATION',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_NATION,
                valign : '',
                formatter: function (value, row, index) {
                    var value1 = '';
					  if((value!=undefined&&value!=""&&value!=null&&dictDatas_emp_emp_list_zm_85166!=undefined&&dictDatas_emp_emp_list_zm_85166!=null)||value==0){
							value1 = dictDatas_emp_emp_list_zm_85166[value];
					  }
                    if((value1==undefined || value1=="")&&value1!=0){
                        value1='-';
                    }
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:110px;\" name=\"EMPVEMPLOYEE_NATION\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\""+value+"\" >"+value1+"</a>";
                }
            },

  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"籍贯")%>',
                field : 'EMPVEMPLOYEE_ORIGIN',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_ORIGIN,
                valign : '',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:110px;\" name=\"EMPVEMPLOYEE_ORIGIN\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"籍贯\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"证件类型")%>',
                field : 'EMPVEMPLOYEE_CERTTYPE',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_CERTTYPE,
                valign : '',
                formatter: function (value, row, index) {
                    var value1 = '';
					  if((value!=undefined&&value!=""&&value!=null&&dictDatas_emp_emp_list_zm_85168!=undefined&&dictDatas_emp_emp_list_zm_85168!=null)||value==0){
							value1 = dictDatas_emp_emp_list_zm_85168[value];
					  }
                    if((value1==undefined || value1=="")&&value1!=0){
                        value1='-';
                    }
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:110px;\" name=\"EMPVEMPLOYEE_CERTTYPE\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\""+value+"\" >"+value1+"</a>";
                }
            },

  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"证件编号")%>',
                field : 'EMPVEMPLOYEE_CERTNO',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_CERTNO,
                valign : '',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:110px;\" name=\"EMPVEMPLOYEE_CERTNO\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"证件编号\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"性别")%>',
                field : 'EMPVEMPLOYEE_GENDER',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_GENDER,
                valign : '',
                formatter: function (value, row, index) {
                    var value1 = '';
					  if((value!=undefined&&value!=""&&value!=null&&dictDatas_emp_emp_list_zm_85170!=undefined&&dictDatas_emp_emp_list_zm_85170!=null)||value==0){
							value1 = dictDatas_emp_emp_list_zm_85170[value];
					  }
                    if((value1==undefined || value1=="")&&value1!=0){
                        value1='-';
                    }
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:110px;\" name=\"EMPVEMPLOYEE_GENDER\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\""+value+"\" >"+value1+"</a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"出生日期")%>',
                field : 'EMPVEMPLOYEE_BIRTHDAY',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_BIRTHDAY,
                valign : '',
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
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:110px\" name=\"EMPVEMPLOYEE_BIRTHDAY\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"出生日期\">"+date+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"员工类别")%>',
                field : 'EMPVEMPLOYEE_EMPKIND',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_EMPKIND,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:110px;\" name=\"EMPVEMPLOYEE_EMPKIND\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"员工类别\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"最高学历")%>',
                field : 'EMPVEMPLOYEE_MAXEDUCATION',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_MAXEDUCATION,
                valign : '',
                formatter: function (value, row, index) {
                    var value1 = '';
					  if((value!=undefined&&value!=""&&value!=null&&dictDatas_emp_emp_list_zm_85205!=undefined&&dictDatas_emp_emp_list_zm_85205!=null)||value==0){
							value1 = dictDatas_emp_emp_list_zm_85205[value];
					  }
                    if((value1==undefined || value1=="")&&value1!=0){
                        value1='-';
                    }
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:110px;\" name=\"EMPVEMPLOYEE_MAXEDUCATION\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\""+value+"\" >"+value1+"</a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"最高学位")%>',
                field : 'EMPVEMPLOYEE_MAXDEGREE',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_MAXDEGREE,
                valign : '',
                formatter: function (value, row, index) {
                    var value1 = '';
					  if((value!=undefined&&value!=""&&value!=null&&dictDatas_emp_emp_list_zm_85206!=undefined&&dictDatas_emp_emp_list_zm_85206!=null)||value==0){
							value1 = dictDatas_emp_emp_list_zm_85206[value];
					  }
                    if((value1==undefined || value1=="")&&value1!=0){
                        value1='-';
                    }
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:110px;\" name=\"EMPVEMPLOYEE_MAXDEGREE\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\""+value+"\" >"+value1+"</a>";
                }
            },

  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"毕业院校")%>',
                field : 'EMPVEMPLOYEE_GRADUASCHOOL',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_GRADUASCHOOL,
                valign : '',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:110px;\" name=\"EMPVEMPLOYEE_GRADUASCHOOL\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"毕业院校\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"专业")%>',
                field : 'EMPVEMPLOYEE_PROFESSION',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_PROFESSION,
                valign : '',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:110px;\" name=\"EMPVEMPLOYEE_PROFESSION\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"专业\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"初始学历")%>',
                field : 'EMPVEMPLOYEE_BEGINEDUCATION',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_BEGINEDUCATION,
                valign : '',
                formatter: function (value, row, index) {
                    var value1 = '';
					  if((value!=undefined&&value!=""&&value!=null&&dictDatas_emp_emp_list_zm_85209!=undefined&&dictDatas_emp_emp_list_zm_85209!=null)||value==0){
							value1 = dictDatas_emp_emp_list_zm_85209[value];
					  }
                    if((value1==undefined || value1=="")&&value1!=0){
                        value1='-';
                    }
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:110px;\" name=\"EMPVEMPLOYEE_BEGINEDUCATION\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\""+value+"\" >"+value1+"</a>";
                }
            },

  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"职称名")%>',
                field : 'EMPVEMPLOYEE_JOBTITLENAME',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_JOBTITLENAME,
                valign : '',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:110px;\" name=\"EMPVEMPLOYEE_JOBTITLENAME\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"职称名\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"职称级别")%>',
                field : 'EMPVEMPLOYEE_TITLELEVEL',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_TITLELEVEL,
                valign : '',
                formatter: function (value, row, index) {
                    var value1 = '';
					  if((value!=undefined&&value!=""&&value!=null&&dictDatas_emp_emp_list_zm_85211!=undefined&&dictDatas_emp_emp_list_zm_85211!=null)||value==0){
							value1 = dictDatas_emp_emp_list_zm_85211[value];
					  }
                    if((value1==undefined || value1=="")&&value1!=0){
                        value1='-';
                    }
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:110px;\" name=\"EMPVEMPLOYEE_TITLELEVEL\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\""+value+"\" >"+value1+"</a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"政治面貌")%>',
                field : 'EMPVEMPLOYEE_POLITICALSTATUS',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_POLITICALSTATUS,
                valign : '',
                formatter: function (value, row, index) {
                    var value1 = '';
					  if((value!=undefined&&value!=""&&value!=null&&dictDatas_emp_emp_list_zm_85212!=undefined&&dictDatas_emp_emp_list_zm_85212!=null)||value==0){
							value1 = dictDatas_emp_emp_list_zm_85212[value];
					  }
                    if((value1==undefined || value1=="")&&value1!=0){
                        value1='-';
                    }
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:110px;\" name=\"EMPVEMPLOYEE_POLITICALSTATUS\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\""+value+"\" >"+value1+"</a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"加入党派时间")%>',
                field : 'EMPVEMPLOYEE_BEGINPRODATE',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_BEGINPRODATE,
                valign : '',
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
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:110px\" name=\"EMPVEMPLOYEE_BEGINPRODATE\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"加入党派时间\">"+date+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"出生地")%>',
                field : 'EMPVEMPLOYEE_BIRTHDAYPLACE',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_BIRTHDAYPLACE,
                valign : '',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:110px;\" name=\"EMPVEMPLOYEE_BIRTHDAYPLACE\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"出生地\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"户口性质")%>',
                field : 'EMPVEMPLOYEE_RESIDENTTYPE',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_RESIDENTTYPE,
                valign : '',
                formatter: function (value, row, index) {
                    var value1 = '';
					  if((value!=undefined&&value!=""&&value!=null&&dictDatas_emp_emp_list_zm_85174!=undefined&&dictDatas_emp_emp_list_zm_85174!=null)||value==0){
							value1 = dictDatas_emp_emp_list_zm_85174[value];
					  }
                    if((value1==undefined || value1=="")&&value1!=0){
                        value1='-';
                    }
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:110px;\" name=\"EMPVEMPLOYEE_RESIDENTTYPE\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\""+value+"\" >"+value1+"</a>";
                }
            },

  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"户口所在地")%>',
                field : 'EMPVEMPLOYEE_RESIDENTADDRESS',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_RESIDENTADDRESS,
                valign : '',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:110px;\" name=\"EMPVEMPLOYEE_RESIDENTADDRESS\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"户口所在地\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"婚姻状况")%>',
                field : 'EMPVEMPLOYEE_MARRIAGESTATUS',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_MARRIAGESTATUS,
                valign : '',
                formatter: function (value, row, index) {
                    var value1 = '';
					  if((value!=undefined&&value!=""&&value!=null&&dictDatas_emp_emp_list_zm_85181!=undefined&&dictDatas_emp_emp_list_zm_85181!=null)||value==0){
							value1 = dictDatas_emp_emp_list_zm_85181[value];
					  }
                    if((value1==undefined || value1=="")&&value1!=0){
                        value1='-';
                    }
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:110px;\" name=\"EMPVEMPLOYEE_MARRIAGESTATUS\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\""+value+"\" >"+value1+"</a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"健康状况")%>',
                field : 'EMPVEMPLOYEE_HEALTHSTATUS',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_HEALTHSTATUS,
                valign : '',
                formatter: function (value, row, index) {
                    var value1 = '';
					  if((value!=undefined&&value!=""&&value!=null&&dictDatas_emp_emp_list_zm_85182!=undefined&&dictDatas_emp_emp_list_zm_85182!=null)||value==0){
							value1 = dictDatas_emp_emp_list_zm_85182[value];
					  }
                    if((value1==undefined || value1=="")&&value1!=0){
                        value1='-';
                    }
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:110px;\" name=\"EMPVEMPLOYEE_HEALTHSTATUS\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\""+value+"\" >"+value1+"</a>";
                }
            },

  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"家庭住址")%>',
                field : 'EMPVEMPLOYEE_HOMEADDRESS',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_HOMEADDRESS,
                valign : '',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:110px;\" name=\"EMPVEMPLOYEE_HOMEADDRESS\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"家庭住址\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"现居住地址")%>',
                field : 'EMPVEMPLOYEE_LOCATION',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_LOCATION,
                valign : '',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:110px;\" name=\"EMPVEMPLOYEE_LOCATION\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"现居住地址\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"实习期")%>',
                field : 'EMPVEMPLOYEE_PRACTERM',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_PRACTERM,
                valign : '',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:110px;\" name=\"EMPVEMPLOYEE_PRACTERM\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"实习期\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"星座")%>',
                field : 'EMPVEMPLOYEE_EMPGROUP3',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_EMPGROUP3,
                valign : '',
                formatter: function (value, row, index) {
                    var value1 = '';
					  if((value!=undefined&&value!=""&&value!=null&&dictDatas_emp_emp_list_zm_85143!=undefined&&dictDatas_emp_emp_list_zm_85143!=null)||value==0){
							value1 = dictDatas_emp_emp_list_zm_85143[value];
					  }
                    if((value1==undefined || value1=="")&&value1!=0){
                        value1='-';
                    }
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:110px;\" name=\"EMPVEMPLOYEE_EMPGROUP3\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\""+value+"\" >"+value1+"</a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"血型")%>',
                field : 'EMPVEMPLOYEE_BLOODTYPE',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_BLOODTYPE,
                valign : '',
                formatter: function (value, row, index) {
                    var value1 = '';
					  if((value!=undefined&&value!=""&&value!=null&&dictDatas_emp_emp_list_zm_85183!=undefined&&dictDatas_emp_emp_list_zm_85183!=null)||value==0){
							value1 = dictDatas_emp_emp_list_zm_85183[value];
					  }
                    if((value1==undefined || value1=="")&&value1!=0){
                        value1='-';
                    }
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:110px;\" name=\"EMPVEMPLOYEE_BLOODTYPE\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\""+value+"\" >"+value1+"</a>";
                }
            },

  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"手机号码")%>',
                field : 'EMPVEMPLOYEE_MOBILE',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_MOBILE,
                valign : '',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:110px;\" name=\"EMPVEMPLOYEE_MOBILE\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"手机号码\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"QQ")%>',
                field : 'EMPVEMPLOYEE_QQ',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_QQ,
                valign : '',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:110px;\" name=\"EMPVEMPLOYEE_QQ\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"QQ\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"微信")%>',
                field : 'EMPVEMPLOYEE_WECHART',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_WECHART,
                valign : '',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:110px;\" name=\"EMPVEMPLOYEE_WECHART\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"微信\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"微博")%>',
                field : 'EMPVEMPLOYEE_EMPGROUP4',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_EMPGROUP4,
                valign : '',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:110px;\" name=\"EMPVEMPLOYEE_EMPGROUP4\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"微博\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"邮编")%>',
                field : 'EMPVEMPLOYEE_EMPGROUP5',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_EMPGROUP5,
                valign : '',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:110px;\" name=\"EMPVEMPLOYEE_EMPGROUP5\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"邮编\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"私人邮箱")%>',
                field : 'EMPVEMPLOYEE_PESEMAIL',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_PESEMAIL,
                valign : '',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:110px;\" name=\"EMPVEMPLOYEE_PESEMAIL\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"私人邮箱\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"联系电话")%>',
                field : 'EMPVEMPLOYEE_PESPHONE',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_PESPHONE,
                valign : '',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:110px;\" name=\"EMPVEMPLOYEE_PESPHONE\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"联系电话\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"生育状况")%>',
                field : 'EMPVEMPLOYEE_CHILDSTATUS',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_CHILDSTATUS,
                valign : '',
                formatter: function (value, row, index) {
                    var value1 = '';
					  if((value!=undefined&&value!=""&&value!=null&&dictDatas_emp_emp_list_zm_85184!=undefined&&dictDatas_emp_emp_list_zm_85184!=null)||value==0){
							value1 = dictDatas_emp_emp_list_zm_85184[value];
					  }
                    if((value1==undefined || value1=="")&&value1!=0){
                        value1='-';
                    }
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:110px;\" name=\"EMPVEMPLOYEE_CHILDSTATUS\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\""+value+"\" >"+value1+"</a>";
                }
            },

  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"子女情况(个数)")%>',
                field : 'EMPVEMPLOYEE_CHILDS',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_CHILDS,
                valign : '',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:110px;\" name=\"EMPVEMPLOYEE_CHILDS\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"子女情况(个数)\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"档案所在地")%>',
                field : 'EMPVEMPLOYEE_FILESITE',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_FILESITE,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:110px;\" name=\"EMPVEMPLOYEE_FILESITE\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"档案所在地\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"档案情况")%>',
                field : 'EMPVEMPLOYEE_FILESITUATION',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_FILESITUATION,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:110px;\" name=\"EMPVEMPLOYEE_FILESITUATION\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"档案情况\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"年龄")%>',
                field : 'EMPVEMPLOYEE_YEAROLDS',
                align : 'center',
                visible : false,
                valign : '',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:110px;\" name=\"EMPVEMPLOYEE_YEAROLDS\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"年龄\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"金融工作年限")%>',
                field : 'EMPVEMPLOYEE_BANKWORKLIFT',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_BANKWORKLIFT,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:110px;\" name=\"EMPVEMPLOYEE_BANKWORKLIFT\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"金融工作年限\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"经济工作年限")%>',
                field : 'EMPVEMPLOYEE_JINGWORKLIFT',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_JINGWORKLIFT,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:110px;\" name=\"EMPVEMPLOYEE_JINGWORKLIFT\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"经济工作年限\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"同性质岗位工作年限")%>',
                field : 'EMPVEMPLOYEE_TONGWORKLIFT',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:110px;\" name=\"EMPVEMPLOYEE_TONGWORKLIFT\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"同性质岗位工作年限\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"身高")%>',
                field : 'EMPVEMPLOYEE_HEIGHT',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_HEIGHT,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:110px;\" name=\"EMPVEMPLOYEE_HEIGHT\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"身高\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"体重")%>',
                field : 'EMPVEMPLOYEE_WEIGHT',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_WEIGHT,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:110px;\" name=\"EMPVEMPLOYEE_WEIGHT\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"体重\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"以人定岗")%>',
                field : 'EMPVEMPLOYEE_TOPOSITION',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_TOPOSITION,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:110px;\" name=\"EMPVEMPLOYEE_TOPOSITION\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"以人定岗\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"法律文书送达地")%>',
                field : 'EMPVEMPLOYEE_LEGDOCUSER',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_LEGDOCUSER,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:110px;\" name=\"EMPVEMPLOYEE_LEGDOCUSER\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"法律文书送达地\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"备注")%>',
                field : 'EMPVEMPLOYEE_REMARK',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_REMARK,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_REMARK\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"备注\">"+value+"</a>";
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
                $("#emp_emp_list_zm_List a").editable({
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
        	editemp_emp_list_zm_click_4468('isView',row);  
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
function refresh_emp_emp_list_zm() { 
    $('#emp_emp_list_zm_List').bootstrapTable('refresh'); 
}

/** 隐藏边框 */ 
function hiddenBorder(type) { 
    if(type == 0){
        $("#emp_emp_list_zm_List td").css("border","none");
    }else if(type == 1){
        $("#emp_emp_list_zm_List td").css("border-left","none");
    }else if(type == 2){
        $("#emp_emp_list_zm_List td").css("border-top","none");
    }
}
function editemp_emp_list_zm_click_4468(isView,data){
	var selects = $("#emp_emp_list_zm_List").bootstrapTable('getSelections');;
	if(selects!=null && selects.length>0){
		select = selects[0];;
		title='<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"职员信息预览")%>';
	}else if(data!=null&&isView!=null){
	select = data;
	title='<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"预览")%>';
	}else {
		alert('<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"请选择一行数据")%>');return ;
	}
	if(1==1){
		var url='/myehr/form/toForm.action?formId=4364&isInit=true&EMPVEMPLOYEE_EMPID='+select.EMPVEMPLOYEE_EMPID+'&&&isView='+isView+'';
	}else{
		var url='/myehr/form/toForm.action?formId=4364&isInit=true&EMPVEMPLOYEE_EMPID='+EMPVEMPLOYEE_EMPID+'&isView='+isView+'';
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
			    refresh_emp_emp_list_zm();
		}
	});
}
var filterParam = {};
var queryParams;
function grid_emp_emp_list_zm_fun(pageReqeust){
	var _filterdata={};
	
	var EMPVEMPLOYEE_EMPCODE='${param.EMPCODE}';

	var EMPVEMPLOYEE_CNAME='${param.CNAME}';
	
	var EMPVEMPLOYEE_COMPID='${param.COMPID}';
	
	var EMPVEMPLOYEE_DEPID='${param.DEPID}';
	
	var EMPVEMPLOYEE_MAXEDUCATION='${param.MAXEDUCATION}';
	
	var EMPVEMPLOYEE_TITLELEVEL='${param.TITLELEVEL}';
	
	var EMPVEMPLOYEE_POLITICALSTATUS='${param.POLITICALSTATUS}';
	
	var EMPVEMPLOYEE_GENDER='${param.GENDER}';
	
	var EMPVEMPLOYEE_ORIGIN = '${param.ORIGIN}';
	
	var EMPVEMPLOYEE_JOBRANK ='${param.JOBRANK}';

	_filterdata={EMPVEMPLOYEE_COMPID:EMPVEMPLOYEE_COMPID,EMPVEMPLOYEE_DEPID:EMPVEMPLOYEE_DEPID,EMPVEMPLOYEE_MAXEDUCATION:EMPVEMPLOYEE_MAXEDUCATION,EMPVEMPLOYEE_TITLELEVEL:EMPVEMPLOYEE_TITLELEVEL,EMPVEMPLOYEE_POLITICALSTATUS:EMPVEMPLOYEE_POLITICALSTATUS,EMPVEMPLOYEE_GENDER:EMPVEMPLOYEE_GENDER,EMPVEMPLOYEE_EMPCODE:EMPVEMPLOYEE_EMPCODE,EMPVEMPLOYEE_CNAME:EMPVEMPLOYEE_CNAME,EMPVEMPLOYEE_ORIGIN:EMPVEMPLOYEE_ORIGIN,EMPVEMPLOYEE_JOBRANK:EMPVEMPLOYEE_JOBRANK};
	var paramsMap = {};
	var requestParam={};
		requestParam = {};
	pageReqeust.containerParam=containerParam_4468;
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.userIds=getQueryString('empIds');
	pageReqeust.formId=_formId_4468;
	pageReqeust.isView=null;
	if(heightGadedata_4468!=null&&heightGadedata_4468!=undefined){
		pageReqeust.heightGrade = heightGadedata_4468;
	}
	queryParams = JSON.stringify(pageReqeust);
	return queryParams;
}
function grid_emp_emp_list_zm_fun11_4468(){
	$('#emp_emp_list_zm_List').bootstrapTable('refresh');
}
function exportData(fieldArray,formId){
    exportData_4468(fieldArray);
}
	function grid_emp_emp_list_zm_HeighQuery_4468() {
		layer.open({
			type: 2,
			showMaxButton: true,
			title:"<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"高级查询设置")%>" ,
			area: ['855', '500'],
			maxmin: true,
			content:'/myehr/jsp/form/button/heightGrade.jsp?formFunction=grid_emp_emp_list_zm_fun11_4468&formDefId=4468&formDefLayout=2',
			success:function(layero,index){
				},
				end:function(){
			}
			});
	}
</script>
</body>
</html>
