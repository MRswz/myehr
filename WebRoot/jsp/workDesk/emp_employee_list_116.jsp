<%@ page language="java" import="java.util.*" import="com.myehr.common.util.LangUtil" pageEncoding="UTF-8"%>
<%@ include file="/common/commontest.jsp" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<body>
<div class="container-fluid" style="height:100%;overflow-y:auto;padding-top:5px;">
<table id="emp_employee_list_COPY_List">
</table>
<div id="activity_pane" style="position:absolute;left:500px;top:70px"></div>
</div>
<script>
var dictDatas_emp_employee_list_COPY_87659 = '';
var dictDatas_emp_employee_list_COPY_87660 = '';
var dictDatas_emp_employee_list_COPY_87661 = '';
var dictDatas_emp_employee_list_COPY_87662 = '';
var dictDatas_emp_employee_list_COPY_87663 = '';
var dictDatas_emp_employee_list_COPY_87664 = '';
var dictDatas_emp_employee_list_COPY_87670 = '';
var dictDatas_emp_employee_list_COPY_87671 = '';
var dictDatas_emp_employee_list_COPY_87672 = '';
var dictDatas_emp_employee_list_COPY_87673 = '';
var dictDatas_emp_employee_list_COPY_87717 = '';
var dictDatas_emp_employee_list_COPY_87718 = '';
var dictDatas_emp_employee_list_COPY_87719 = '';
var dictDatas_emp_employee_list_COPY_87689 = '';
var dictDatas_emp_employee_list_COPY_87690 = '';
var dictDatas_emp_employee_list_COPY_87691 = '';
var dictDatas_emp_employee_list_COPY_87692 = '';
var dictDatas_emp_employee_list_COPY_87694 = '';
var dictDatas_emp_employee_list_COPY_87730 = '';
var dictDatas_emp_employee_list_COPY_87731 = '';
var dictDatas_emp_employee_list_COPY_87732 = '';
var dictDatas_emp_employee_list_COPY_87736 = '';
var dictDatas_emp_employee_list_COPY_87737 = '';
var dictDatas_emp_employee_list_COPY_87698 = '';
var dictDatas_emp_employee_list_COPY_87705 = '';
var dictDatas_emp_employee_list_COPY_87706 = '';
var dictDatas_emp_employee_list_COPY_87707 = '';
var dictDatas_emp_employee_list_COPY_87667 = '';
var dictDatas_emp_employee_list_COPY_87708 = '';

var heightGadedata_4802 =[];
var containerParam_4802 ={};
containerParam_4802 ={};
function changeHeightGadedata_4802(data){
	heightGadedata_4802 = data;
}
function getDictDatasByFormId(){
$.ajax({
	url:'/myehr/form/getDictDatasByFormId.action?formId=${param.formId}&formIds=4802',
	type:'post',
	cache: false,
	async:false,
	success: function (obj) {
dictDatas_emp_employee_list_COPY_87659 = obj.dictDatas_emp_employee_list_COPY_87659;
dictDatas_emp_employee_list_COPY_87660 = obj.dictDatas_emp_employee_list_COPY_87660;
dictDatas_emp_employee_list_COPY_87661 = obj.dictDatas_emp_employee_list_COPY_87661;
dictDatas_emp_employee_list_COPY_87662 = obj.dictDatas_emp_employee_list_COPY_87662;
dictDatas_emp_employee_list_COPY_87663 = obj.dictDatas_emp_employee_list_COPY_87663;
dictDatas_emp_employee_list_COPY_87664 = obj.dictDatas_emp_employee_list_COPY_87664;
dictDatas_emp_employee_list_COPY_87670 = obj.dictDatas_emp_employee_list_COPY_87670;
dictDatas_emp_employee_list_COPY_87671 = obj.dictDatas_emp_employee_list_COPY_87671;
dictDatas_emp_employee_list_COPY_87672 = obj.dictDatas_emp_employee_list_COPY_87672;
dictDatas_emp_employee_list_COPY_87673 = obj.dictDatas_emp_employee_list_COPY_87673;
dictDatas_emp_employee_list_COPY_87717 = obj.dictDatas_emp_employee_list_COPY_87717;
dictDatas_emp_employee_list_COPY_87718 = obj.dictDatas_emp_employee_list_COPY_87718;
dictDatas_emp_employee_list_COPY_87719 = obj.dictDatas_emp_employee_list_COPY_87719;
dictDatas_emp_employee_list_COPY_87689 = obj.dictDatas_emp_employee_list_COPY_87689;
dictDatas_emp_employee_list_COPY_87690 = obj.dictDatas_emp_employee_list_COPY_87690;
dictDatas_emp_employee_list_COPY_87691 = obj.dictDatas_emp_employee_list_COPY_87691;
dictDatas_emp_employee_list_COPY_87692 = obj.dictDatas_emp_employee_list_COPY_87692;
dictDatas_emp_employee_list_COPY_87694 = obj.dictDatas_emp_employee_list_COPY_87694;
dictDatas_emp_employee_list_COPY_87730 = obj.dictDatas_emp_employee_list_COPY_87730;
dictDatas_emp_employee_list_COPY_87731 = obj.dictDatas_emp_employee_list_COPY_87731;
dictDatas_emp_employee_list_COPY_87732 = obj.dictDatas_emp_employee_list_COPY_87732;
dictDatas_emp_employee_list_COPY_87736 = obj.dictDatas_emp_employee_list_COPY_87736;
dictDatas_emp_employee_list_COPY_87737 = obj.dictDatas_emp_employee_list_COPY_87737;
dictDatas_emp_employee_list_COPY_87698 = obj.dictDatas_emp_employee_list_COPY_87698;
dictDatas_emp_employee_list_COPY_87705 = obj.dictDatas_emp_employee_list_COPY_87705;
dictDatas_emp_employee_list_COPY_87706 = obj.dictDatas_emp_employee_list_COPY_87706;
dictDatas_emp_employee_list_COPY_87707 = obj.dictDatas_emp_employee_list_COPY_87707;
dictDatas_emp_employee_list_COPY_87667 = obj.dictDatas_emp_employee_list_COPY_87667;
dictDatas_emp_employee_list_COPY_87708 = obj.dictDatas_emp_employee_list_COPY_87708;
	}
});
}
$(function() {
getDictDatasByFormId();
gridPatterns1();

    cardSelectInitFunctionx_grid('${param.formType}');
    cardDateWidInitFunction();
    //showMoreBtn($(".BTNGROUP_4802"));
    querys_4802();
});
function initFilterParam_4802(data){
}
	var _formId_4802='4802';
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
    function querys_4802() {
        initRoleColumn('4802');
        initRoleButtons('4802','emp_employee_list_COPY');
        $("#emp_employee_list_COPY_List").bootstrapTable({
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
            queryParams : grid_emp_employee_list_COPY_fun,
            cache : false,
            pageSize : 10, 
            pageList : [10,20,50,100,10000], 
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
                valign : '',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"ORGVORGANIZATION_ORGCODE\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"组织码\">"+value+"</a>";
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
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_EMPID\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"员工ID\">"+value+"</a>";
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
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_EMPCODE\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"工号\">"+value+"</a>";
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
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_CNAME\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"姓名\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"英文名")%>',
                field : 'EMPVEMPLOYEE_ENAME',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_ENAME,
                valign : '',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_ENAME\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"英文名\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"公司")%>',
                field : 'EMPVEMPLOYEE_COMPID',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_COMPID,
                valign : '',
                formatter: function (value, row, index) {
                    var value1 = '';
					  if((value!=undefined&&value!=""&&value!=null&&dictDatas_emp_employee_list_COPY_87659!=undefined&&dictDatas_emp_employee_list_COPY_87659!=null)||value==0){
							value1 = dictDatas_emp_employee_list_COPY_87659[value];
					  }
                    if((value1==undefined || value1=="")&&value1!=0){
                        value1='-';
                    }
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_COMPID\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\""+value+"\" >"+value1+"</a>";
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
					  if((value!=undefined&&value!=""&&value!=null&&dictDatas_emp_employee_list_COPY_87660!=undefined&&dictDatas_emp_employee_list_COPY_87660!=null)||value==0){
							value1 = dictDatas_emp_employee_list_COPY_87660[value];
					  }
                    if((value1==undefined || value1=="")&&value1!=0){
                        value1='-';
                    }
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_DEPID\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\""+value+"\" >"+value1+"</a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"岗位名称")%>',
                field : 'EMPVEMPLOYEE_JOBID',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_JOBID,
                valign : '',
                formatter: function (value, row, index) {
                    var value1 = '';
					  if((value!=undefined&&value!=""&&value!=null&&dictDatas_emp_employee_list_COPY_87661!=undefined&&dictDatas_emp_employee_list_COPY_87661!=null)||value==0){
							value1 = dictDatas_emp_employee_list_COPY_87661[value];
					  }
                    if((value1==undefined || value1=="")&&value1!=0){
                        value1='-';
                    }
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_JOBID\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\""+value+"\" >"+value1+"</a>";
                }
            },

  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"职务名称")%>',
                field : 'EMPVEMPLOYEE_POSTNAME',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_POSTNAME,
                valign : '',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_POSTNAME\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"职务名称\">"+value+"</a>";
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
					  if((value!=undefined&&value!=""&&value!=null&&dictDatas_emp_employee_list_COPY_87662!=undefined&&dictDatas_emp_employee_list_COPY_87662!=null)||value==0){
							value1 = dictDatas_emp_employee_list_COPY_87662[value];
					  }
                    if((value1==undefined || value1=="")&&value1!=0){
                        value1='-';
                    }
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_EMPSTATUS\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\""+value+"\" >"+value1+"</a>";
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
					  if((value!=undefined&&value!=""&&value!=null&&dictDatas_emp_employee_list_COPY_87663!=undefined&&dictDatas_emp_employee_list_COPY_87663!=null)||value==0){
							value1 = dictDatas_emp_employee_list_COPY_87663[value];
					  }
                    if((value1==undefined || value1=="")&&value1!=0){
                        value1='-';
                    }
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_JOBSTATUS\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\""+value+"\" >"+value1+"</a>";
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
					  if((value!=undefined&&value!=""&&value!=null&&dictDatas_emp_employee_list_COPY_87664!=undefined&&dictDatas_emp_employee_list_COPY_87664!=null)||value==0){
							value1 = dictDatas_emp_employee_list_COPY_87664[value];
					  }
                    if((value1==undefined || value1=="")&&value1!=0){
                        value1='-';
                    }
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_EMPTYPE\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\""+value+"\" >"+value1+"</a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"客户经理级别")%>',
                field : 'EMPVEMPLOYEE_EMPGRADE',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_EMPGRADE,
                valign : '',
                formatter: function (value, row, index) {
                    var value1 = '';
					  if((value!=undefined&&value!=""&&value!=null&&dictDatas_emp_employee_list_COPY_87670!=undefined&&dictDatas_emp_employee_list_COPY_87670!=null)||value==0){
							value1 = dictDatas_emp_employee_list_COPY_87670[value];
					  }
                    if((value1==undefined || value1=="")&&value1!=0){
                        value1='-';
                    }
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_EMPGRADE\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\""+value+"\" >"+value1+"</a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"柜员级别")%>',
                field : 'EMPVEMPLOYEE_EMPLEVEL',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_EMPLEVEL,
                valign : '',
                formatter: function (value, row, index) {
                    var value1 = '';
					  if((value!=undefined&&value!=""&&value!=null&&dictDatas_emp_employee_list_COPY_87671!=undefined&&dictDatas_emp_employee_list_COPY_87671!=null)||value==0){
							value1 = dictDatas_emp_employee_list_COPY_87671[value];
					  }
                    if((value1==undefined || value1=="")&&value1!=0){
                        value1='-';
                    }
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_EMPLEVEL\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\""+value+"\" >"+value1+"</a>";
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
					  if((value!=undefined&&value!=""&&value!=null&&dictDatas_emp_employee_list_COPY_87672!=undefined&&dictDatas_emp_employee_list_COPY_87672!=null)||value==0){
							value1 = dictDatas_emp_employee_list_COPY_87672[value];
					  }
                    if((value1==undefined || value1=="")&&value1!=0){
                        value1='-';
                    }
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_RECTYPE\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\""+value+"\" >"+value1+"</a>";
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
					  if((value!=undefined&&value!=""&&value!=null&&dictDatas_emp_employee_list_COPY_87673!=undefined&&dictDatas_emp_employee_list_COPY_87673!=null)||value==0){
							value1 = dictDatas_emp_employee_list_COPY_87673[value];
					  }
                    if((value1==undefined || value1=="")&&value1!=0){
                        value1='-';
                    }
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_WORKCITY\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\""+value+"\" >"+value1+"</a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"入职日期")%>',
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
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px\" name=\"EMPVEMPLOYEE_JOINDATE\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"入职日期\">"+date+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"行龄调整")%>',
                field : 'EMPVEMPLOYEE_COMPYEARADJUST',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_COMPYEARADJUST,
                valign : '',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_COMPYEARADJUST\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"行龄调整\">"+value+"</a>";
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
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_EMPGROUP1\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"预留分类1\">"+value+"</a>";
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
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_EMPGROUP2\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"预留分类2\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"岗龄")%>',
                field : 'EMPVEMPLOYEE_JOBAGE',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_JOBAGE,
                valign : '',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_JOBAGE\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"岗龄\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"从岗日期")%>',
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
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px\" name=\"EMPVEMPLOYEE_JOBBEGINDATE\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"从岗日期\">"+date+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"行龄")%>',
                field : 'EMPVEMPLOYEE_COMPYEARS',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_COMPYEARS,
                valign : '',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_COMPYEARS\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"行龄\">"+value+"</a>";
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
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px\" name=\"EMPVEMPLOYEE_BEGINWORKDATE\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"参加工作日期\">"+date+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"工龄调整(年)")%>',
                field : 'EMPVEMPLOYEE_WORKYEARADJUST',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_WORKYEARADJUST,
                valign : '',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_WORKYEARADJUST\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"工龄调整(年)\">"+value+"</a>";
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
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_WORKYEARS\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"工龄\">"+value+"</a>";
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
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px\" name=\"EMPVEMPLOYEE_PROBBEGINDATE\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"试用期开始日期\">"+date+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"试用期")%>',
                field : 'EMPVEMPLOYEE_PROBTERM',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_PROBTERM,
                valign : '',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_PROBTERM\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"试用期\">"+value+"</a>";
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
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px\" name=\"EMPVEMPLOYEE_PROBENDDATE\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"试用期结束日期\">"+date+"</a>";
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
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px\" name=\"EMPVEMPLOYEE_PROBCHECKENDDATE\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"试用期转正日期\">"+date+"</a>";
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
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_CONNO\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"合同编号\">"+value+"</a>";
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
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_CONTIMES\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"合同签约次数\">"+value+"</a>";
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
					  if((value!=undefined&&value!=""&&value!=null&&dictDatas_emp_employee_list_COPY_87717!=undefined&&dictDatas_emp_employee_list_COPY_87717!=null)||value==0){
							value1 = dictDatas_emp_employee_list_COPY_87717[value];
					  }
                    if((value1==undefined || value1=="")&&value1!=0){
                        value1='-';
                    }
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_CONTRACTUNIT\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\""+value+"\" >"+value1+"</a>";
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
					  if((value!=undefined&&value!=""&&value!=null&&dictDatas_emp_employee_list_COPY_87718!=undefined&&dictDatas_emp_employee_list_COPY_87718!=null)||value==0){
							value1 = dictDatas_emp_employee_list_COPY_87718[value];
					  }
                    if((value1==undefined || value1=="")&&value1!=0){
                        value1='-';
                    }
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_CONTRACTTYPE\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\""+value+"\" >"+value1+"</a>";
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
					  if((value!=undefined&&value!=""&&value!=null&&dictDatas_emp_employee_list_COPY_87719!=undefined&&dictDatas_emp_employee_list_COPY_87719!=null)||value==0){
							value1 = dictDatas_emp_employee_list_COPY_87719[value];
					  }
                    if((value1==undefined || value1=="")&&value1!=0){
                        value1='-';
                    }
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_CONTRACTKIND\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\""+value+"\" >"+value1+"</a>";
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
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px\" name=\"EMPVEMPLOYEE_CONBEGINDATE\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"合同开始日期\">"+date+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"合同期限")%>',
                field : 'EMPVEMPLOYEE_CONMONTHS',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_CONMONTHS,
                valign : '',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_CONMONTHS\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"合同期限\">"+value+"</a>";
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
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px\" name=\"EMPVEMPLOYEE_CONENDDATE\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"合同结束日期\">"+date+"</a>";
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
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_WORKEMAIL\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"机构邮箱\">"+value+"</a>";
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
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_WORKPHONE\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"办公电话\">"+value+"</a>";
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
					  if((value!=undefined&&value!=""&&value!=null&&dictDatas_emp_employee_list_COPY_87689!=undefined&&dictDatas_emp_employee_list_COPY_87689!=null)||value==0){
							value1 = dictDatas_emp_employee_list_COPY_87689[value];
					  }
                    if((value1==undefined || value1=="")&&value1!=0){
                        value1='-';
                    }
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_COUNTRY\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\""+value+"\" >"+value1+"</a>";
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
					  if((value!=undefined&&value!=""&&value!=null&&dictDatas_emp_employee_list_COPY_87690!=undefined&&dictDatas_emp_employee_list_COPY_87690!=null)||value==0){
							value1 = dictDatas_emp_employee_list_COPY_87690[value];
					  }
                    if((value1==undefined || value1=="")&&value1!=0){
                        value1='-';
                    }
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_NATION\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\""+value+"\" >"+value1+"</a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"籍贯")%>',
                field : 'EMPVEMPLOYEE_ORIGIN',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_ORIGIN,
                valign : '',
                formatter: function (value, row, index) {
                    var value1 = '';
					  if((value!=undefined&&value!=""&&value!=null&&dictDatas_emp_employee_list_COPY_87691!=undefined&&dictDatas_emp_employee_list_COPY_87691!=null)||value==0){
							value1 = dictDatas_emp_employee_list_COPY_87691[value];
					  }
                    if((value1==undefined || value1=="")&&value1!=0){
                        value1='-';
                    }
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_ORIGIN\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\""+value+"\" >"+value1+"</a>";
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
					  if((value!=undefined&&value!=""&&value!=null&&dictDatas_emp_employee_list_COPY_87692!=undefined&&dictDatas_emp_employee_list_COPY_87692!=null)||value==0){
							value1 = dictDatas_emp_employee_list_COPY_87692[value];
					  }
                    if((value1==undefined || value1=="")&&value1!=0){
                        value1='-';
                    }
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_CERTTYPE\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\""+value+"\" >"+value1+"</a>";
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
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_CERTNO\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"证件编号\">"+value+"</a>";
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
					  if((value!=undefined&&value!=""&&value!=null&&dictDatas_emp_employee_list_COPY_87694!=undefined&&dictDatas_emp_employee_list_COPY_87694!=null)||value==0){
							value1 = dictDatas_emp_employee_list_COPY_87694[value];
					  }
                    if((value1==undefined || value1=="")&&value1!=0){
                        value1='-';
                    }
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_GENDER\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\""+value+"\" >"+value1+"</a>";
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
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px\" name=\"EMPVEMPLOYEE_BIRTHDAY\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"出生日期\">"+date+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"员工性质")%>',
                field : 'EMPVEMPLOYEE_EMPKIND',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_EMPKIND,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_EMPKIND\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"员工性质\">"+value+"</a>";
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
					  if((value!=undefined&&value!=""&&value!=null&&dictDatas_emp_employee_list_COPY_87730!=undefined&&dictDatas_emp_employee_list_COPY_87730!=null)||value==0){
							value1 = dictDatas_emp_employee_list_COPY_87730[value];
					  }
                    if((value1==undefined || value1=="")&&value1!=0){
                        value1='-';
                    }
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_MAXEDUCATION\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\""+value+"\" >"+value1+"</a>";
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
					  if((value!=undefined&&value!=""&&value!=null&&dictDatas_emp_employee_list_COPY_87731!=undefined&&dictDatas_emp_employee_list_COPY_87731!=null)||value==0){
							value1 = dictDatas_emp_employee_list_COPY_87731[value];
					  }
                    if((value1==undefined || value1=="")&&value1!=0){
                        value1='-';
                    }
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_MAXDEGREE\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\""+value+"\" >"+value1+"</a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"毕业院校")%>',
                field : 'EMPVEMPLOYEE_GRADUASCHOOL',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_GRADUASCHOOL,
                valign : '',
                formatter: function (value, row, index) {
                    var value1 = '';
					  if((value!=undefined&&value!=""&&value!=null&&dictDatas_emp_employee_list_COPY_87732!=undefined&&dictDatas_emp_employee_list_COPY_87732!=null)||value==0){
							value1 = dictDatas_emp_employee_list_COPY_87732[value];
					  }
                    if((value1==undefined || value1=="")&&value1!=0){
                        value1='-';
                    }
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_GRADUASCHOOL\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\""+value+"\" >"+value1+"</a>";
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
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_PROFESSION\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"专业\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"初始学历")%>',
                field : 'EMPVEMPLOYEE_BEGINEDUCATION',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_BEGINEDUCATION,
                valign : '',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_BEGINEDUCATION\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"初始学历\">"+value+"</a>";
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
					  if((value!=undefined&&value!=""&&value!=null&&dictDatas_emp_employee_list_COPY_87736!=undefined&&dictDatas_emp_employee_list_COPY_87736!=null)||value==0){
							value1 = dictDatas_emp_employee_list_COPY_87736[value];
					  }
                    if((value1==undefined || value1=="")&&value1!=0){
                        value1='-';
                    }
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_TITLELEVEL\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\""+value+"\" >"+value1+"</a>";
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
					  if((value!=undefined&&value!=""&&value!=null&&dictDatas_emp_employee_list_COPY_87737!=undefined&&dictDatas_emp_employee_list_COPY_87737!=null)||value==0){
							value1 = dictDatas_emp_employee_list_COPY_87737[value];
					  }
                    if((value1==undefined || value1=="")&&value1!=0){
                        value1='-';
                    }
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_POLITICALSTATUS\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\""+value+"\" >"+value1+"</a>";
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
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px\" name=\"EMPVEMPLOYEE_BEGINPRODATE\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"加入党派时间\">"+date+"</a>";
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
					  if((value!=undefined&&value!=""&&value!=null&&dictDatas_emp_employee_list_COPY_87698!=undefined&&dictDatas_emp_employee_list_COPY_87698!=null)||value==0){
							value1 = dictDatas_emp_employee_list_COPY_87698[value];
					  }
                    if((value1==undefined || value1=="")&&value1!=0){
                        value1='-';
                    }
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_RESIDENTTYPE\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\""+value+"\" >"+value1+"</a>";
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
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_RESIDENTADDRESS\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"户口所在地\">"+value+"</a>";
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
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_BIRTHDAYPLACE\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"出生地\">"+value+"</a>";
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
					  if((value!=undefined&&value!=""&&value!=null&&dictDatas_emp_employee_list_COPY_87705!=undefined&&dictDatas_emp_employee_list_COPY_87705!=null)||value==0){
							value1 = dictDatas_emp_employee_list_COPY_87705[value];
					  }
                    if((value1==undefined || value1=="")&&value1!=0){
                        value1='-';
                    }
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_MARRIAGESTATUS\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\""+value+"\" >"+value1+"</a>";
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
					  if((value!=undefined&&value!=""&&value!=null&&dictDatas_emp_employee_list_COPY_87706!=undefined&&dictDatas_emp_employee_list_COPY_87706!=null)||value==0){
							value1 = dictDatas_emp_employee_list_COPY_87706[value];
					  }
                    if((value1==undefined || value1=="")&&value1!=0){
                        value1='-';
                    }
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_HEALTHSTATUS\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\""+value+"\" >"+value1+"</a>";
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
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_HOMEADDRESS\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"家庭住址\">"+value+"</a>";
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
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_LOCATION\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"现居住地址\">"+value+"</a>";
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
					  if((value!=undefined&&value!=""&&value!=null&&dictDatas_emp_employee_list_COPY_87707!=undefined&&dictDatas_emp_employee_list_COPY_87707!=null)||value==0){
							value1 = dictDatas_emp_employee_list_COPY_87707[value];
					  }
                    if((value1==undefined || value1=="")&&value1!=0){
                        value1='-';
                    }
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_BLOODTYPE\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\""+value+"\" >"+value1+"</a>";
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
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_PRACTERM\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"实习期\">"+value+"</a>";
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
					  if((value!=undefined&&value!=""&&value!=null&&dictDatas_emp_employee_list_COPY_87667!=undefined&&dictDatas_emp_employee_list_COPY_87667!=null)||value==0){
							value1 = dictDatas_emp_employee_list_COPY_87667[value];
					  }
                    if((value1==undefined || value1=="")&&value1!=0){
                        value1='-';
                    }
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_EMPGROUP3\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\""+value+"\" >"+value1+"</a>";
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
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_MOBILE\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"手机号码\">"+value+"</a>";
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
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_QQ\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"QQ\">"+value+"</a>";
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
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_WECHART\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"微信\">"+value+"</a>";
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
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_EMPGROUP4\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"微博\">"+value+"</a>";
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
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_EMPGROUP5\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"邮编\">"+value+"</a>";
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
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_PESEMAIL\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"私人邮箱\">"+value+"</a>";
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
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_PESPHONE\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"联系电话\">"+value+"</a>";
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
					  if((value!=undefined&&value!=""&&value!=null&&dictDatas_emp_employee_list_COPY_87708!=undefined&&dictDatas_emp_employee_list_COPY_87708!=null)||value==0){
							value1 = dictDatas_emp_employee_list_COPY_87708[value];
					  }
                    if((value1==undefined || value1=="")&&value1!=0){
                        value1='-';
                    }
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_CHILDSTATUS\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\""+value+"\" >"+value1+"</a>";
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
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_CHILDS\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"子女情况(个数)\">"+value+"</a>";
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
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_YEAROLDS\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"年龄\">"+value+"</a>";
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
                $("#emp_employee_list_COPY_List a").editable({
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
        	editemp_employee_list_COPY_click_4802('isView',row);  
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
function refresh_emp_employee_list_COPY() { 
    $('#emp_employee_list_COPY_List').bootstrapTable('refresh'); 
}

/** 隐藏边框 */ 
function hiddenBorder(type) { 
    if(type == 0){
        $("#emp_employee_list_COPY_List td").css("border","none");
    }else if(type == 1){
        $("#emp_employee_list_COPY_List td").css("border-left","none");
    }else if(type == 2){
        $("#emp_employee_list_COPY_List td").css("border-top","none");
    }
}
var filterParam = {};
var queryParams;
function grid_emp_employee_list_COPY_fun(pageReqeust){
	var _filterdata={};
	var EMPVEMPLOYEE_DEPID='${param.DEPID}';
	var EMPVEMPLOYEE_JOBID='${param.JOBID}';
	var EMPVEMPLOYEE_EMPTYPE='${param.EMPTYPE}';
	var EMPVEMPLOYEE_ORIGIN='${param.ORIGIN}';
	var EMPVEMPLOYEE_GENDER='${param.GENDER}';
	var EMPVEMPLOYEE_MAXEDUCATION='${param.MAXEDUCATIO}';
	var EMPVEMPLOYEE_POLITICALSTATUS='${param.POLITICALSTATUS}';
	var EMPVEMPLOYEE_EMPCODE='${param.EMPCODE}';
	var EMPVEMPLOYEE_CNAME='${param.CNAME}';
	var EMPVEMPLOYEE_POSTNAME='${param.POSTNAME}';
	_filterdata={EMPVEMPLOYEE_DEPID:EMPVEMPLOYEE_DEPID,EMPVEMPLOYEE_JOBID:EMPVEMPLOYEE_JOBID,EMPVEMPLOYEE_EMPTYPE:EMPVEMPLOYEE_EMPTYPE,EMPVEMPLOYEE_ORIGIN:EMPVEMPLOYEE_ORIGIN,EMPVEMPLOYEE_GENDER:EMPVEMPLOYEE_GENDER,EMPVEMPLOYEE_MAXEDUCATION:EMPVEMPLOYEE_MAXEDUCATION,EMPVEMPLOYEE_POLITICALSTATUS:EMPVEMPLOYEE_POLITICALSTATUS,EMPVEMPLOYEE_EMPCODE:EMPVEMPLOYEE_EMPCODE,EMPVEMPLOYEE_CNAME:EMPVEMPLOYEE_CNAME,EMPVEMPLOYEE_POSTNAME:EMPVEMPLOYEE_POSTNAME};
	var paramsMap = {};
	var requestParam={};
		requestParam = {};
	pageReqeust.containerParam=containerParam_4802;
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.userIds=getQueryString('empIds');
	pageReqeust.formId=_formId_4802;
	pageReqeust.isView=null;
	if(heightGadedata_4802!=null&&heightGadedata_4802!=undefined){
		pageReqeust.heightGrade = heightGadedata_4802;
	}
	queryParams = JSON.stringify(pageReqeust);
	return queryParams;
}
function grid_emp_employee_list_COPY_fun11_4802(){
	$('#emp_employee_list_COPY_List').bootstrapTable('refresh');
}
function exportData(fieldArray,formId){
    exportData_4802(fieldArray);
}
	function grid_emp_employee_list_COPY_HeighQuery_4802() {
		layer.open({
			type: 2,
			showMaxButton: true,
			title:"<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"高级查询设置")%>" ,
			area: ['855', '500'],
			maxmin: true,
			content:'/myehr/jsp/form/button/heightGrade.jsp?formFunction=grid_emp_employee_list_COPY_fun11_4802&formDefId=4802&formDefLayout=2',
			success:function(layero,index){
				},
				end:function(){
			}
			});
	}
function editemp_employee_list_COPY_click_4802(isView,data){
	var selects = $("#emp_employee_list_COPY_List").bootstrapTable('getSelections');;
	if(selects!=null && selects.length>0){
		select = selects[0];;
		title='员工预览';
	}else if(data!=null&&isView!=null){
	select = data;
	title='预览';
	}else {
		alert('请选择一行数据');return ;
	}
	if(1==1){
		var url='/myehr/form/toForm.action?formId=3886&isInit=true&EMPEMPLOYEE_EMPID='+select.EMPVEMPLOYEE_EMPID+'&&&isView='+isView+'';
	}else{
		var url='/myehr/form/toForm.action?formId=3886&isInit=true&EMPEMPLOYEE_EMPID='+EMPVEMPLOYEE_EMPID+'&isView='+isView+'';
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
			    refresh_emp_employee_list_COPY();
		}
	});
}
</script>
</body>
</html>
