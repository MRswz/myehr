<%@ page language="java" import="java.util.*" import="com.myehr.common.util.LangUtil" pageEncoding="UTF-8"%>
<%@ include file="/common/commontest.jsp" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<body>
<div class="container-fluid" style="height:100%;overflow-y:auto;padding-top:5px;">
	<table id="EMP_V_EMPLOYEESS_List">
	</table>
	<div id="activity_pane" style="position:absolute;left:500px;top:70px"></div>
	</div>
<script>
var heightGadedata_4772 =[];
var containerParam_4772 ={};
containerParam_4772 ={};
function changeHeightGadedata_4772(data){
	heightGadedata_4772 = data;
}
$(function() {
gridPatterns1();

    cardSelectInitFunctionx_grid('${param.formType}');
    cardDateWidInitFunction();
    //showMoreBtn($(".BTNGROUP_4772"));
    querys_4772();
changeColor('EMP_V_EMPLOYEESS_List')
});
function initFilterParam_4772(data){
}
	var _formId_4772='4772';
var realFormId='${param.formId}';
var showButtonNum = 0;
function initRoleButtons(buttonFormId,buttonFormCode){
    var date = new Date();
    var url = '/myehr/form/queryCardFormButtonsWithUserId.action?formId='+buttonFormId+'&'+date;
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
    function querys_4772() {
        initRoleColumn('4772');
        initRoleButtons('4772','EMP_V_EMPLOYEESS');
        $("#EMP_V_EMPLOYEESS_List").bootstrapTable({
            url :'/myehr/form/cardformInitData.action',
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
            queryParams : grid_EMP_V_EMPLOYEESS_fun,
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
                title : '序号',
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
                title : '组织码',
                field : 'ORGVDEPTTION_ORGCODE',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"ORGVDEPTTION_ORGCODE\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"组织码\">"+value+"</a>";
                }
            },
  {
                title : '员工ID',
                field : 'EMPVEMPLOYEE_EMPID',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_EMPID\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"员工ID\">"+value+"</a>";
                }
            },
            {
                title : '性别',
                field : 'EMPVEMPLOYEE_GENDER',
                visible :false,
            },{
                title : '性别',
                field : 'EMPVEMPLOYEE_GENDER_DICTNAME',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_GENDER,
                valign : 'left',
				  sortable: true,
                formatter: function (value, row, index) {
						if(value==undefined||value=='null'||value==''){
        					value='-';
    					}
                    	return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_GENDER\" title=\""+value+"\">"+value+"</a>";
                }
            },

  {
                title : '姓名',
                field : 'EMPVEMPLOYEE_CNAME',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_CNAME,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_CNAME\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"姓名\">"+value+"</a>";
                }
            },
  {
                title : '英文名/拼音',
                field : 'EMPVEMPLOYEE_ENAME',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_ENAME\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"英文名/拼音\">"+value+"</a>";
                }
            },
  {
                title : '工号',
                field : 'EMPVEMPLOYEE_EMPCODE',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_EMPCODE,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_EMPCODE\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"工号\">"+value+"</a>";
                }
            },
            {
                title : '证件类型',
                field : 'EMPVEMPLOYEE_CERTTYPE',
                visible :false,
            },{
                title : '证件类型',
                field : 'EMPVEMPLOYEE_CERTTYPE_DICTNAME',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_CERTTYPE,
                valign : 'left',
				  sortable: true,
                formatter: function (value, row, index) {
						if(value==undefined||value=='null'||value==''){
        					value='-';
    					}
                    	return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_CERTTYPE\" title=\""+value+"\">"+value+"</a>";
                }
            },

  {
                title : '证件号码',
                field : 'EMPVEMPLOYEE_CERTNO',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_CERTNO,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_CERTNO\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"证件号码\">"+value+"</a>";
                }
            },
            {
                title : '国籍',
                field : 'EMPVEMPLOYEE_COUNTRY',
                visible :false,
            },{
                title : '国籍',
                field : 'EMPVEMPLOYEE_COUNTRY_DICTNAME',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_COUNTRY,
                valign : 'left',
				  sortable: true,
                formatter: function (value, row, index) {
						if(value==undefined||value=='null'||value==''){
        					value='-';
    					}
                    	return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_COUNTRY\" title=\""+value+"\">"+value+"</a>";
                }
            },

            {
                title : '民族',
                field : 'EMPVEMPLOYEE_NATION',
                visible :false,
            },{
                title : '民族',
                field : 'EMPVEMPLOYEE_NATION_DICTNAME',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_NATION,
                valign : 'left',
				  sortable: true,
                formatter: function (value, row, index) {
						if(value==undefined||value=='null'||value==''){
        					value='-';
    					}
                    	return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_NATION\" title=\""+value+"\">"+value+"</a>";
                }
            },

            {
                title : '籍贯',
                field : 'EMPVEMPLOYEE_ORIGIN',
                visible :false,
            },{
                title : '籍贯',
                field : 'EMPVEMPLOYEE_ORIGIN_DICTNAME',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_ORIGIN,
                valign : 'left',
				  sortable: true,
                formatter: function (value, row, index) {
						if(value==undefined||value=='null'||value==''){
        					value='-';
    					}
                    	return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_ORIGIN\" title=\""+value+"\">"+value+"</a>";
                }
            },

            {
                title : '婚育状况',
                field : 'EMPVEMPLOYEE_MARRIAGESTATUS',
                visible :false,
            },{
                title : '婚育状况',
                field : 'EMPVEMPLOYEE_MARRIAGESTATUS_DICTNAME',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_MARRIAGESTATUS,
                valign : 'left',
				  sortable: true,
                formatter: function (value, row, index) {
						if(value==undefined||value=='null'||value==''){
        					value='-';
    					}
                    	return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_MARRIAGESTATUS\" title=\""+value+"\">"+value+"</a>";
                }
            },

  {
                title : '健康状况',
                field : 'EMPVEMPLOYEE_HEALTHSTATUS',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_HEALTHSTATUS,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_HEALTHSTATUS\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"健康状况\">"+value+"</a>";
                }
            },
            {
                title : '血型',
                field : 'EMPVEMPLOYEE_BLOODTYPE',
                visible :false,
            },{
                title : '血型',
                field : 'EMPVEMPLOYEE_BLOODTYPE_DICTNAME',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_BLOODTYPE,
                valign : 'left',
				  sortable: true,
                formatter: function (value, row, index) {
						if(value==undefined||value=='null'||value==''){
        					value='-';
    					}
                    	return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_BLOODTYPE\" title=\""+value+"\">"+value+"</a>";
                }
            },

  {
                title : '生育状况',
                field : 'EMPVEMPLOYEE_CHILDSTATUS',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_CHILDSTATUS\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"生育状况\">"+value+"</a>";
                }
            },
  {
                title : '子女个数',
                field : 'EMPVEMPLOYEE_CHILDS',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_CHILDS,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_CHILDS\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"子女个数\">"+value+"</a>";
                }
            },
            {
                title : '工作地点',
                field : 'EMPVEMPLOYEE_WORKCITY',
                visible :false,
            },{
                title : '工作地点',
                field : 'EMPVEMPLOYEE_WORKCITY_DICTNAME',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_WORKCITY,
                valign : 'left',
				  sortable: true,
                formatter: function (value, row, index) {
						if(value==undefined||value=='null'||value==''){
        					value='-';
    					}
                    	return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_WORKCITY\" title=\""+value+"\">"+value+"</a>";
                }
            },

  {
                title : '公司',
                field : 'EMPVEMPLOYEE_COMPID',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_COMPID\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"公司\">"+value+"</a>";
                }
            },
            {
                title : '部门',
                field : 'EMPVEMPLOYEE_DEPID',
                visible :false,
            },{
                title : '部门',
                field : 'EMPVEMPLOYEE_DEPID_DICTNAME',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_DEPID,
                valign : 'left',
				  sortable: true,
                formatter: function (value, row, index) {
						if(value==undefined||value=='null'||value==''){
        					value='-';
    					}
                    	return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_DEPID\" title=\""+value+"\">"+value+"</a>";
                }
            },

            {
                title : '岗位',
                field : 'EMPVEMPLOYEE_JOBID',
                visible :false,
            },{
                title : '岗位',
                field : 'EMPVEMPLOYEE_JOBID_DICTNAME',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_JOBID,
                valign : 'left',
				  sortable: true,
                formatter: function (value, row, index) {
						if(value==undefined||value=='null'||value==''){
        					value='-';
    					}
                    	return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_JOBID\" title=\""+value+"\">"+value+"</a>";
                }
            },

  {
                title : '直接主管',
                field : 'EMPVEMPLOYEE_SUPVISOR',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_SUPVISOR\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"直接主管\">"+value+"</a>";
                }
            },
  {
                title : '职能主管',
                field : 'EMPVEMPLOYEE_FUNSUPVISOR',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_FUNSUPVISOR\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"职能主管\">"+value+"</a>";
                }
            },
            {
                title : '员工状态',
                field : 'EMPVEMPLOYEE_EMPSTATUS',
                visible :false,
            },{
                title : '员工状态',
                field : 'EMPVEMPLOYEE_EMPSTATUS_DICTNAME',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_EMPSTATUS,
                valign : 'left',
				  sortable: true,
                formatter: function (value, row, index) {
						if(value==undefined||value=='null'||value==''){
        					value='-';
    					}
                    	return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_EMPSTATUS\" title=\""+value+"\">"+value+"</a>";
                }
            },

            {
                title : '在岗状态',
                field : 'EMPVEMPLOYEE_JOBSTATUS',
                visible :false,
            },{
                title : '在岗状态',
                field : 'EMPVEMPLOYEE_JOBSTATUS_DICTNAME',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_JOBSTATUS,
                valign : 'left',
				  sortable: true,
                formatter: function (value, row, index) {
						if(value==undefined||value=='null'||value==''){
        					value='-';
    					}
                    	return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_JOBSTATUS\" title=\""+value+"\">"+value+"</a>";
                }
            },

            {
                title : '员工类型',
                field : 'EMPVEMPLOYEE_EMPTYPE',
                visible :false,
            },{
                title : '员工类型',
                field : 'EMPVEMPLOYEE_EMPTYPE_DICTNAME',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_EMPTYPE,
                valign : 'left',
				  sortable: true,
                formatter: function (value, row, index) {
						if(value==undefined||value=='null'||value==''){
        					value='-';
    					}
                    	return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_EMPTYPE\" title=\""+value+"\">"+value+"</a>";
                }
            },

  {
                title : '员工性质',
                field : 'EMPVEMPLOYEE_EMPKIND',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_EMPKIND\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"员工性质\">"+value+"</a>";
                }
            },
            {
                title : '招聘来源',
                field : 'EMPVEMPLOYEE_RECTYPE',
                visible :false,
            },{
                title : '招聘来源',
                field : 'EMPVEMPLOYEE_RECTYPE_DICTNAME',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_RECTYPE,
                valign : 'left',
				  sortable: true,
                formatter: function (value, row, index) {
						if(value==undefined||value=='null'||value==''){
        					value='-';
    					}
                    	return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_RECTYPE\" title=\""+value+"\">"+value+"</a>";
                }
            },

            {
                title : '出生日期',
                field : 'EMPVEMPLOYEE_BIRTHDAY',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_BIRTHDAY,
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
                title : '年龄',
                field : 'EMPVEMPLOYEE_YEAROLDS',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_YEAROLDS,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_YEAROLDS\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"年龄\">"+value+"</a>";
                }
            },
            {
                title : '入职日期',
                field : 'EMPVEMPLOYEE_JOINDATE',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_JOINDATE,
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
                title : '司龄',
                field : 'EMPVEMPLOYEE_COMPYEARS',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_COMPYEARS,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_COMPYEARS\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"司龄\">"+value+"</a>";
                }
            },
  {
                title : '司龄调整（年）',
                field : 'EMPVEMPLOYEE_COMPYEARADJUST',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_COMPYEARADJUST,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_COMPYEARADJUST\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"司龄调整（年）\">"+value+"</a>";
                }
            },
  {
                title : '社会工作日',
                field : 'EMPVEMPLOYEE_BEGINWORKDATE',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_BEGINWORKDATE\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"社会工作日\">"+value+"</a>";
                }
            },
  {
                title : '工龄',
                field : 'EMPVEMPLOYEE_WORKYEARS',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_WORKYEARS,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_WORKYEARS\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"工龄\">"+value+"</a>";
                }
            },
  {
                title : '工龄调整（年）',
                field : 'EMPVEMPLOYEE_WORKYEARADJUST',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_WORKYEARADJUST\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"工龄调整（年）\">"+value+"</a>";
                }
            },
  {
                title : '岗位开始日期',
                field : 'EMPVEMPLOYEE_JOBBEGINDATE',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_JOBBEGINDATE\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"岗位开始日期\">"+value+"</a>";
                }
            },
            {
                title : '试用期开始日期',
                field : 'EMPVEMPLOYEE_PROBBEGINDATE',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_PROBBEGINDATE,
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
                title : '试用期',
                field : 'EMPVEMPLOYEE_PROBTERM',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_PROBTERM,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_PROBTERM\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"试用期\">"+value+"</a>";
                }
            },
            {
                title : '试用结束日期',
                field : 'EMPVEMPLOYEE_PROBENDDATE',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_PROBENDDATE,
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
        return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px\" name=\"EMPVEMPLOYEE_PROBENDDATE\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"试用结束日期\">"+date+"</a>";
                }
            },
  {
                title : '试用期转正日期',
                field : 'EMPVEMPLOYEE_PROBCHECKENDDATE',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_PROBCHECKENDDATE\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"试用期转正日期\">"+value+"</a>";
                }
            },
            {
                title : '实习期开始日期',
                field : 'EMPVEMPLOYEE_PRACBEGINDATE',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_PRACBEGINDATE,
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
                title : '实习期',
                field : 'EMPVEMPLOYEE_PRACTERM',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_PRACTERM,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_PRACTERM\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"实习期\">"+value+"</a>";
                }
            },
            {
                title : '实习结束日期',
                field : 'EMPVEMPLOYEE_PRACENDDATE',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_PRACENDDATE,
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
                title : '申请离职日期',
                field : 'EMPVEMPLOYEE_LEAVEAPPLYDATE',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_LEAVEAPPLYDATE\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"申请离职日期\">"+value+"</a>";
                }
            },
            {
                title : '离职日期',
                field : 'EMPVEMPLOYEE_LEAVEDATE',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_LEAVEDATE,
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
                title : '离职类型',
                field : 'EMPVEMPLOYEE_LEAVETYPE',
                visible :false,
            },{
                title : '离职类型',
                field : 'EMPVEMPLOYEE_LEAVETYPE_DICTNAME',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_LEAVETYPE,
                valign : 'left',
				  sortable: true,
                formatter: function (value, row, index) {
						if(value==undefined||value=='null'||value==''){
        					value='-';
    					}
                    	return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_LEAVETYPE\" title=\""+value+"\">"+value+"</a>";
                }
            },

  {
                title : '离职原因',
                field : 'EMPVEMPLOYEE_LEAVEREASON',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_LEAVEREASON,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_LEAVEREASON\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"离职原因\">"+value+"</a>";
                }
            },
  {
                title : '是否离职黑名单',
                field : 'EMPVEMPLOYEE_ISBLACKLIST',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_ISBLACKLIST\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"是否离职黑名单\">"+value+"</a>";
                }
            },
  {
                title : '合同编号',
                field : 'EMPVEMPLOYEE_CONNO',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_CONNO,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_CONNO\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"合同编号\">"+value+"</a>";
                }
            },
  {
                title : '合同签约次数',
                field : 'EMPVEMPLOYEE_CONTIMES',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_CONTIMES,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_CONTIMES\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"合同签约次数\">"+value+"</a>";
                }
            },
            {
                title : '合同归属公司',
                field : 'EMPVEMPLOYEE_CONTRACTUNIT',
                visible :false,
            },{
                title : '合同归属公司',
                field : 'EMPVEMPLOYEE_CONTRACTUNIT_DICTNAME',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_CONTRACTUNIT,
                valign : 'left',
				  sortable: true,
                formatter: function (value, row, index) {
						if(value==undefined||value=='null'||value==''){
        					value='-';
    					}
                    	return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_CONTRACTUNIT\" title=\""+value+"\">"+value+"</a>";
                }
            },

            {
                title : '合同类型',
                field : 'EMPVEMPLOYEE_CONTRACTTYPE',
                visible :false,
            },{
                title : '合同类型',
                field : 'EMPVEMPLOYEE_CONTRACTTYPE_DICTNAME',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_CONTRACTTYPE,
                valign : 'left',
				  sortable: true,
                formatter: function (value, row, index) {
						if(value==undefined||value=='null'||value==''){
        					value='-';
    					}
                    	return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_CONTRACTTYPE\" title=\""+value+"\">"+value+"</a>";
                }
            },

  {
                title : '合同性质',
                field : 'EMPVEMPLOYEE_CONTRACTKIND',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_CONTRACTKIND\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"合同性质\">"+value+"</a>";
                }
            },
            {
                title : '合同开始日期',
                field : 'EMPVEMPLOYEE_CONBEGINDATE',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_CONBEGINDATE,
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
        return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px\" name=\"EMPVEMPLOYEE_CONBEGINDATE\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"合同开始日期\">"+date+"</a>";
                }
            },
  {
                title : '合同期限（月）',
                field : 'EMPVEMPLOYEE_CONMONTHS',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_CONMONTHS,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_CONMONTHS\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"合同期限（月）\">"+value+"</a>";
                }
            },
            {
                title : '合同结束日期',
                field : 'EMPVEMPLOYEE_CONENDDATE',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_CONENDDATE,
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
        return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px\" name=\"EMPVEMPLOYEE_CONENDDATE\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"合同结束日期\">"+date+"</a>";
                }
            },
            {
                title : '合同状态',
                field : 'EMPVEMPLOYEE_CONSTATUS',
                visible :false,
            },{
                title : '合同状态',
                field : 'EMPVEMPLOYEE_CONSTATUS_DICTNAME',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_CONSTATUS,
                valign : 'left',
				  sortable: true,
                formatter: function (value, row, index) {
						if(value==undefined||value=='null'||value==''){
        					value='-';
    					}
                    	return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_CONSTATUS\" title=\""+value+"\">"+value+"</a>";
                }
            },

  {
                title : '出生地',
                field : 'EMPVEMPLOYEE_BIRTHDAYPLACE',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_BIRTHDAYPLACE\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"出生地\">"+value+"</a>";
                }
            },
  {
                title : '家庭住址',
                field : 'EMPVEMPLOYEE_HOMEADDRESS',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_HOMEADDRESS,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_HOMEADDRESS\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"家庭住址\">"+value+"</a>";
                }
            },
            {
                title : '户口性质',
                field : 'EMPVEMPLOYEE_RESIDENTTYPE',
                visible :false,
            },{
                title : '户口性质',
                field : 'EMPVEMPLOYEE_RESIDENTTYPE_DICTNAME',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_RESIDENTTYPE,
                valign : 'left',
				  sortable: true,
                formatter: function (value, row, index) {
						if(value==undefined||value=='null'||value==''){
        					value='-';
    					}
                    	return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_RESIDENTTYPE\" title=\""+value+"\">"+value+"</a>";
                }
            },

  {
                title : '户口地址',
                field : 'EMPVEMPLOYEE_RESIDENTADDRESS',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_RESIDENTADDRESS\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"户口地址\">"+value+"</a>";
                }
            },
  {
                title : '邮箱',
                field : 'EMPVEMPLOYEE_WORKEMAIL',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_WORKEMAIL,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_WORKEMAIL\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"邮箱\">"+value+"</a>";
                }
            },
  {
                title : '办公电话',
                field : 'EMPVEMPLOYEE_WORKPHONE',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_WORKPHONE\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"办公电话\">"+value+"</a>";
                }
            },
  {
                title : '个人邮箱',
                field : 'EMPVEMPLOYEE_PESEMAIL',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_PESEMAIL\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"个人邮箱\">"+value+"</a>";
                }
            },
  {
                title : '联系电话',
                field : 'EMPVEMPLOYEE_PESPHONE',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_PESPHONE\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"联系电话\">"+value+"</a>";
                }
            },
  {
                title : '手机号码',
                field : 'EMPVEMPLOYEE_MOBILE',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_MOBILE,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_MOBILE\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"手机号码\">"+value+"</a>";
                }
            },
  {
                title : 'QQ',
                field : 'EMPVEMPLOYEE_QQ',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_QQ\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"QQ\">"+value+"</a>";
                }
            },
  {
                title : '微信',
                field : 'EMPVEMPLOYEE_WECHART',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_WECHART\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"微信\">"+value+"</a>";
                }
            },
            {
                title : '职级',
                field : 'EMPVEMPLOYEE_EMPGRADE',
                visible :false,
            },{
                title : '职级',
                field : 'EMPVEMPLOYEE_EMPGRADE_DICTNAME',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_EMPGRADE,
                valign : 'left',
				  sortable: true,
                formatter: function (value, row, index) {
						if(value==undefined||value=='null'||value==''){
        					value='-';
    					}
                    	return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_EMPGRADE\" title=\""+value+"\">"+value+"</a>";
                }
            },

            {
                title : '职等',
                field : 'EMPVEMPLOYEE_EMPLEVEL',
                visible :false,
            },{
                title : '职等',
                field : 'EMPVEMPLOYEE_EMPLEVEL_DICTNAME',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_EMPLEVEL,
                valign : 'left',
				  sortable: true,
                formatter: function (value, row, index) {
						if(value==undefined||value=='null'||value==''){
        					value='-';
    					}
                    	return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_EMPLEVEL\" title=\""+value+"\">"+value+"</a>";
                }
            },

  {
                title : '第一学历',
                field : 'EMPVEMPLOYEE_EMPGROUP1',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_EMPGROUP1\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"第一学历\">"+value+"</a>";
                }
            },
  {
                title : '第一学历学校',
                field : 'EMPVEMPLOYEE_EMPGROUP2',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_EMPGROUP2\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"第一学历学校\">"+value+"</a>";
                }
            },
  {
                title : '星座',
                field : 'EMPVEMPLOYEE_EMPGROUP3',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_EMPGROUP3,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_EMPGROUP3\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"星座\">"+value+"</a>";
                }
            },
  {
                title : '微博',
                field : 'EMPVEMPLOYEE_EMPGROUP4',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_EMPGROUP4\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"微博\">"+value+"</a>";
                }
            },
  {
                title : '邮编',
                field : 'EMPVEMPLOYEE_EMPGROUP5',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_EMPGROUP5\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"邮编\">"+value+"</a>";
                }
            },
  {
                title : '现居住地址',
                field : 'EMPVEMPLOYEE_LOCATION',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_LOCATION,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_LOCATION\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"现居住地址\">"+value+"</a>";
                }
            },
            {
                title : '最高学历',
                field : 'EMPVEMPLOYEE_MAXEDUCATION',
                visible :false,
            },{
                title : '最高学历',
                field : 'EMPVEMPLOYEE_MAXEDUCATION_DICTNAME',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_MAXEDUCATION,
                valign : 'left',
				  sortable: true,
                formatter: function (value, row, index) {
						if(value==undefined||value=='null'||value==''){
        					value='-';
    					}
                    	return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_MAXEDUCATION\" title=\""+value+"\">"+value+"</a>";
                }
            },

  {
                title : '最高学位',
                field : 'EMPVEMPLOYEE_MAXDEGREE',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_MAXDEGREE\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"最高学位\">"+value+"</a>";
                }
            },
  {
                title : '学位类别',
                field : 'EMPVEMPLOYEE_DEGREETYPE',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_DEGREETYPE\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"学位类别\">"+value+"</a>";
                }
            },
            {
                title : '毕业院校',
                field : 'EMPVEMPLOYEE_GRADUASCHOOL',
                visible :false,
            },{
                title : '毕业院校',
                field : 'EMPVEMPLOYEE_GRADUASCHOOL_DICTNAME',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_GRADUASCHOOL,
                valign : 'left',
				  sortable: true,
                formatter: function (value, row, index) {
						if(value==undefined||value=='null'||value==''){
        					value='-';
    					}
                    	return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_GRADUASCHOOL\" title=\""+value+"\">"+value+"</a>";
                }
            },

            {
                title : '专业',
                field : 'EMPVEMPLOYEE_PROFESSION',
                visible :false,
            },{
                title : '专业',
                field : 'EMPVEMPLOYEE_PROFESSION_DICTNAME',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_PROFESSION,
                valign : 'left',
				  sortable: true,
                formatter: function (value, row, index) {
						if(value==undefined||value=='null'||value==''){
        					value='-';
    					}
                    	return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_PROFESSION\" title=\""+value+"\">"+value+"</a>";
                }
            },

            {
                title : '职务名称',
                field : 'EMPVEMPLOYEE_POSTNAME',
                visible :false,
            },{
                title : '职务名称',
                field : 'EMPVEMPLOYEE_POSTNAME_DICTNAME',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_POSTNAME,
                valign : 'left',
				  sortable: true,
                formatter: function (value, row, index) {
						if(value==undefined||value=='null'||value==''){
        					value='-';
    					}
                    	return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_POSTNAME\" title=\""+value+"\">"+value+"</a>";
                }
            },

  {
                title : '岗龄',
                field : 'EMPVEMPLOYEE_JOBAGE',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_JOBAGE\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"岗龄\">"+value+"</a>";
                }
            },
  {
                title : '初始学历',
                field : 'EMPVEMPLOYEE_BEGINEDUCATION',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_BEGINEDUCATION\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"初始学历\">"+value+"</a>";
                }
            },
  {
                title : '职称名称',
                field : 'EMPVEMPLOYEE_JOBTITLENAME',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_JOBTITLENAME\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"职称名称\">"+value+"</a>";
                }
            },
  {
                title : '职称级别',
                field : 'EMPVEMPLOYEE_TITLELEVEL',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_TITLELEVEL\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"职称级别\">"+value+"</a>";
                }
            },
            {
                title : '政治面貌',
                field : 'EMPVEMPLOYEE_POLITICALSTATUS',
                visible :false,
            },{
                title : '政治面貌',
                field : 'EMPVEMPLOYEE_POLITICALSTATUS_DICTNAME',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_POLITICALSTATUS,
                valign : 'left',
				  sortable: true,
                formatter: function (value, row, index) {
						if(value==undefined||value=='null'||value==''){
        					value='-';
    					}
                    	return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_POLITICALSTATUS\" title=\""+value+"\">"+value+"</a>";
                }
            },

  {
                title : '加入党派时间',
                field : 'EMPVEMPLOYEE_BEGINPRODATE',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_BEGINPRODATE\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"加入党派时间\">"+value+"</a>";
                }
            },
  {
                title : '账号',
                field : 'EMPVEMPLOYEE_ACCOUNTNUM',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_ACCOUNTNUM,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_ACCOUNTNUM\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"账号\">"+value+"</a>";
                }
            },
            {
                title : '学校类型',
                field : 'EMPVEMPLOYEE_SCHOOLTYPE',
                visible :false,
            },{
                title : '学校类型',
                field : 'EMPVEMPLOYEE_SCHOOLTYPE_DICTNAME',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_schooltype,
                valign : 'left',
				  sortable: true,
                formatter: function (value, row, index) {
						if(value==undefined||value=='null'||value==''){
        					value='-';
    					}
                    	return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_SCHOOLTYPE\" title=\""+value+"\">"+value+"</a>";
                }
            },

            {
                title : '毕业时间',
                field : 'EMPVEMPLOYEE_GRADUATIME',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_GRADUATIME,
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
        return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px\" name=\"EMPVEMPLOYEE_GRADUATIME\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"毕业时间\">"+date+"</a>";
                }
            },
  {
                title : '劳动关系归属',
                field : 'EMPVEMPLOYEE_LABOURRELATION',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_LABOURRELATION\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"劳动关系归属\">"+value+"</a>";
                }
            },
            {
                title : '公司归属',
                field : 'EMPVEMPLOYEE_COMPOWNERSHIP',
                visible :false,
            },{
                title : '公司归属',
                field : 'EMPVEMPLOYEE_COMPOWNERSHIP_DICTNAME',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_COMPOWNERSHIP,
                valign : 'left',
				  sortable: true,
                formatter: function (value, row, index) {
						if(value==undefined||value=='null'||value==''){
        					value='-';
    					}
                    	return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_COMPOWNERSHIP\" title=\""+value+"\">"+value+"</a>";
                }
            },

  {
                title : '社会保险号',
                field : 'EMPVEMPLOYEE_BENSTATUS',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_BENSTATUS,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_BENSTATUS\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"社会保险号\">"+value+"</a>";
                }
            },
            {
                title : '社保归属地',
                field : 'EMPVEMPLOYEE_BENCITY',
                visible :false,
            },{
                title : '社保归属地',
                field : 'EMPVEMPLOYEE_BENCITY_DICTNAME',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_BENCITY,
                valign : 'left',
				  sortable: true,
                formatter: function (value, row, index) {
						if(value==undefined||value=='null'||value==''){
        					value='-';
    					}
                    	return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_BENCITY\" title=\""+value+"\">"+value+"</a>";
                }
            },

            {
                title : '社保归属公司',
                field : 'EMPVEMPLOYEE_BENBELONGUNIT',
                visible :false,
            },{
                title : '社保归属公司',
                field : 'EMPVEMPLOYEE_BENBELONGUNIT_DICTNAME',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_BENBELONGUNIT,
                valign : 'left',
				  sortable: true,
                formatter: function (value, row, index) {
						if(value==undefined||value=='null'||value==''){
        					value='-';
    					}
                    	return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_BENBELONGUNIT\" title=\""+value+"\">"+value+"</a>";
                }
            },

            {
                title : '档案是否在公司',
                field : 'EMPVEMPLOYEE_PERSONFILE',
                visible :false,
            },{
                title : '档案是否在公司',
                field : 'EMPVEMPLOYEE_PERSONFILE_DICTNAME',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_PERSONFILE,
                valign : 'left',
				  sortable: true,
                formatter: function (value, row, index) {
						if(value==undefined||value=='null'||value==''){
        					value='-';
    					}
                    	return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_PERSONFILE\" title=\""+value+"\">"+value+"</a>";
                }
            },

  {
                title : '公积金账号',
                field : 'EMPVEMPLOYEE_ACCUSTATUS',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_ACCUSTATUS,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_ACCUSTATUS\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"公积金账号\">"+value+"</a>";
                }
            },
  {
                title : '保密协议',
                field : 'EMPVEMPLOYEE_SECRECYAGREE',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_SECRECYAGREE\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"保密协议\">"+value+"</a>";
                }
            },
            {
                title : '英语等级',
                field : 'EMPVEMPLOYEE_ENGLISHLEVEL',
                visible :false,
            },{
                title : '英语等级',
                field : 'EMPVEMPLOYEE_ENGLISHLEVEL_DICTNAME',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_ENGLISHLEVEL,
                valign : 'left',
				  sortable: true,
                formatter: function (value, row, index) {
						if(value==undefined||value=='null'||value==''){
        					value='-';
    					}
                    	return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_ENGLISHLEVEL\" title=\""+value+"\">"+value+"</a>";
                }
            },

            {
                title : '同行工作开始日期',
                field : 'EMPVEMPLOYEE_PEERWORKBEGIN',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_PEERWORKBEGIN,
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
        return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px\" name=\"EMPVEMPLOYEE_PEERWORKBEGIN\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"同行工作开始日期\">"+date+"</a>";
                }
            },
  {
                title : '同行工作时间',
                field : 'EMPVEMPLOYEE_PEERWORKTIME',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_PEERWORKTIME,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_PEERWORKTIME\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"同行工作时间\">"+value+"</a>";
                }
            },
            {
                title : '是否加入工会',
                field : 'EMPVEMPLOYEE_ISUNIONIZE',
                visible :false,
            },{
                title : '是否加入工会',
                field : 'EMPVEMPLOYEE_ISUNIONIZE_DICTNAME',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_ISUNIONIZE,
                valign : 'left',
				  sortable: true,
                formatter: function (value, row, index) {
						if(value==undefined||value=='null'||value==''){
        					value='-';
    					}
                    	return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_ISUNIONIZE\" title=\""+value+"\">"+value+"</a>";
                }
            },

  {
                title : '加入工会时间',
                field : 'EMPVEMPLOYEE_UNIONIZETIME',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_UNIONIZETIME\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"加入工会时间\">"+value+"</a>";
                }
            },
            {
                title : '户口是否在公司',
                field : 'EMPVEMPLOYEE_ISCENSUSCOMP',
                visible :false,
            },{
                title : '户口是否在公司',
                field : 'EMPVEMPLOYEE_ISCENSUSCOMP_DICTNAME',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_ISCENSUSCOMP,
                valign : 'left',
				  sortable: true,
                formatter: function (value, row, index) {
						if(value==undefined||value=='null'||value==''){
        					value='-';
    					}
                    	return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_ISCENSUSCOMP\" title=\""+value+"\">"+value+"</a>";
                }
            },

  {
                title : '培训经历',
                field : 'EMPVEMPLOYEE_TRAINING',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_TRAINING,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_TRAINING\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"培训经历\">"+value+"</a>";
                }
            },
  {
                title : '兴趣爱好',
                field : 'EMPVEMPLOYEE_HOBBY',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_HOBBY,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_HOBBY\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"兴趣爱好\">"+value+"</a>";
                }
            },
            {
                title : '身份证有效期',
                field : 'EMPVEMPLOYEE_IDVALIDTIME',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_IDVALIDTIME,
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
        return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px\" name=\"EMPVEMPLOYEE_IDVALIDTIME\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"身份证有效期\">"+date+"</a>";
                }
            },
  {
                title : '第一学历专业',
                field : 'EMPVEMPLOYEE_COMMGRADE',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_COMMGRADE\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"第一学历专业\">"+value+"</a>";
                }
            },
  {
                title : '第一学历毕业时间',
                field : 'EMPVEMPLOYEE_COMMSALARY',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_COMMSALARY\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"第一学历毕业时间\">"+value+"</a>";
                }
            },
            {
                title : '学习形式',
                field : 'EMPVEMPLOYEE_LRARNFORM',
                visible :false,
            },{
                title : '学习形式',
                field : 'EMPVEMPLOYEE_LRARNFORM_DICTNAME',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_LRARNFORM,
                valign : 'left',
				  sortable: true,
                formatter: function (value, row, index) {
						if(value==undefined||value=='null'||value==''){
        					value='-';
    					}
                    	return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_LRARNFORM\" title=\""+value+"\">"+value+"</a>";
                }
            },

  {
                title : '紧急联系人一',
                field : 'EMPVEMPLOYEE_EMCONTACTONE',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_EMCONTACTONE,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_EMCONTACTONE\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"紧急联系人一\">"+value+"</a>";
                }
            },
  {
                title : '紧急联系电话一',
                field : 'EMPVEMPLOYEE_EMCONTACTNUMONE',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_EMCONTACTNUMONE,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_EMCONTACTNUMONE\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"紧急联系电话一\">"+value+"</a>";
                }
            },
            {
                title : '关系',
                field : 'EMPVEMPLOYEE_RELATIONSHIPONE',
                visible :false,
            },{
                title : '关系',
                field : 'EMPVEMPLOYEE_RELATIONSHIPONE_DICTNAME',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_RELATIONSHIPONE,
                valign : 'left',
				  sortable: true,
                formatter: function (value, row, index) {
						if(value==undefined||value=='null'||value==''){
        					value='-';
    					}
                    	return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_RELATIONSHIPONE\" title=\""+value+"\">"+value+"</a>";
                }
            },

  {
                title : '紧急联系人二',
                field : 'EMPVEMPLOYEE_EMCONTACTTWO',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_EMCONTACTTWO,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_EMCONTACTTWO\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"紧急联系人二\">"+value+"</a>";
                }
            },
  {
                title : '紧急联系电话二',
                field : 'EMPVEMPLOYEE_EMCONTACTNUMTWO',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_EMCONTACTNUMTWO,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_EMCONTACTNUMTWO\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"紧急联系电话二\">"+value+"</a>";
                }
            },
            {
                title : '关系',
                field : 'EMPVEMPLOYEE_RELATIONSHIPTWO',
                visible :false,
            },{
                title : '关系',
                field : 'EMPVEMPLOYEE_RELATIONSHIPTWO_DICTNAME',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_RELATIONSHIPTWO,
                valign : 'left',
				  sortable: true,
                formatter: function (value, row, index) {
						if(value==undefined||value=='null'||value==''){
        					value='-';
    					}
                    	return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_RELATIONSHIPTWO\" title=\""+value+"\">"+value+"</a>";
                }
            },

  {
                title : '紧急联系人三',
                field : 'EMPVEMPLOYEE_EMCONTACTTHR',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_EMCONTACTTHR,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_EMCONTACTTHR\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"紧急联系人三\">"+value+"</a>";
                }
            },
  {
                title : '紧急联系电话三',
                field : 'EMPVEMPLOYEE_EMCONTACTNUMTHR',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_EMCONTACTNUMTHR,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_EMCONTACTNUMTHR\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"紧急联系电话三\">"+value+"</a>";
                }
            },
            {
                title : '关系',
                field : 'EMPVEMPLOYEE_RELATIONSHIPTHR',
                visible :false,
            },{
                title : '关系',
                field : 'EMPVEMPLOYEE_RELATIONSHIPTHR_DICTNAME',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_RELATIONSHIPTHR,
                valign : 'left',
				  sortable: true,
                formatter: function (value, row, index) {
						if(value==undefined||value=='null'||value==''){
        					value='-';
    					}
                    	return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_RELATIONSHIPTHR\" title=\""+value+"\">"+value+"</a>";
                }
            },

  {
                title : '紧急联系人四',
                field : 'EMPVEMPLOYEE_EMCONTACTFOR',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_EMCONTACTFOR,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_EMCONTACTFOR\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"紧急联系人四\">"+value+"</a>";
                }
            },
  {
                title : '紧急联系电话四',
                field : 'EMPVEMPLOYEE_EMCONTACTNUMFOR',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_EMCONTACTNUMFOR,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_EMCONTACTNUMFOR\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"紧急联系电话四\">"+value+"</a>";
                }
            },
            {
                title : '关系',
                field : 'EMPVEMPLOYEE_RELATIONSHIPFOR',
                visible :false,
            },{
                title : '关系',
                field : 'EMPVEMPLOYEE_RELATIONSHIPFOR_DICTNAME',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_RELATIONSHIPFOR,
                valign : 'left',
				  sortable: true,
                formatter: function (value, row, index) {
						if(value==undefined||value=='null'||value==''){
        					value='-';
    					}
                    	return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVEMPLOYEE_RELATIONSHIPFOR\" title=\""+value+"\">"+value+"</a>";
                }
            },

  {
                title : '员工ID',
                field : 'EMPEMPLOYEE_EMPID',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEE_EMPID\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"员工ID\">"+value+"</a>";
                }
            }
            ],
            onClickRow: function (row, $element) {
                curRow = row;
            },
		onPostBody: function (res) {
		    hiddenBorder();
		},
		onAll: function (res) {
				  changeColor('EMP_V_EMPLOYEESS_List');
		},
		onLoadSuccess: function (aa, bb, cc) {
				  changeColor('EMP_V_EMPLOYEESS_List');
                $("#EMP_V_EMPLOYEESS_List a").editable({
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
        	editEMP_V_EMPLOYEESS_click_4772('isView',row);  
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
function refresh_EMP_V_EMPLOYEESS() { 
    $('#EMP_V_EMPLOYEESS_List').bootstrapTable('refresh'); 
}

/** 隐藏边框 */ 
function hiddenBorder(type) { 
    if(type == 0){
        $("#EMP_V_EMPLOYEESS_List td").css("border","none");
    }else if(type == 1){
        $("#EMP_V_EMPLOYEESS_List td").css("border-left","none");
    }else if(type == 2){
        $("#EMP_V_EMPLOYEESS_List td").css("border-top","none");
    }
}
var filterParam = {};
var queryParams;
function grid_EMP_V_EMPLOYEESS_fun(pageReqeust){
	var _filterdata={};
	_filterdata={EMPVEMPLOYEE_DEPID:'${param.DEPID}',EMPVEMPLOYEE_JOBID:'${param.JOBID}',EMPVEMPLOYEE_MAXEDUCATION:'${param.MAXEDUCATION}',EMPVEMPLOYEE_POLITICALSTATUS:'${param.POLITICALSTATUS}',
				 EMPVEMPLOYEE_COMPOWNERSHIP:'${param.COMPOWNERSHIP}',EMPVEMPLOYEE_EMPCODE:'${param.EXPAND}',EMPVEMPLOYEE_CNAME:'${param.EXPAND}'};
	var paramsMap = {};
	var requestParam={};
		requestParam = {};
	pageReqeust.containerParam=containerParam_4772;
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.userIds=getQueryString('empIds');
	pageReqeust.formId=_formId_4772;
	pageReqeust.isView=null;
	if(heightGadedata_4772!=null&&heightGadedata_4772!=undefined){
		pageReqeust.heightGrade = heightGadedata_4772;
	}
	queryParams = JSON.stringify(pageReqeust);
	return queryParams;
}
function grid_EMP_V_EMPLOYEESS_fun11_4772(){
	$('#EMP_V_EMPLOYEESS_List').bootstrapTable('refresh');
}
function exportData(fieldArray,formId){
    exportData_4772(fieldArray);
}
	function grid_EMP_V_EMPLOYEESS_HeighQuery_4772() {
		layer.open({
			type: 2,
			showMaxButton: true,
			title:"高级查询设置" ,
			area: ['855', '500'],
			maxmin: true,
			content:'/myehr/jsp/form/button/heightGrade.jsp?formFunction=grid_EMP_V_EMPLOYEESS_fun11_4772&formDefId=4772&formDefLayout=2',
			success:function(layero,index){
				},
				end:function(){
			}
			});
	}
</script>
</body>
</html>
