<%@ page language="java" import="java.util.*" import="com.myehr.common.util.LangUtil" pageEncoding="UTF-8"%>
<%@ include file="/common/dragCommon.jsp" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<body style="padding:0">
<div class="container-fluid">
	<div class="row-fluid">
		<div class="span4">
			<div class="box-content" id="4397">
				<table id="emp_newemp_List">
</table>
<div id="activity_pane" style="position:absolute;left:500px;top:70px"></div>
<div class="row" style="margin-left:0" id="emp_newemp">
</div>

			</div>
		</div>
		<div class="span4">
			<div class="box-content" id="4399">
				<table id="emp_newlizhi_List">
</table>
<div id="activity_pane" style="position:absolute;left:500px;top:70px"></div>
<div class="row" style="margin-left:0" id="emp_newlizhi">
</div>

			</div>
		</div>
		<div class="span4">
			<div class="box-content" id="4400">
				<table id="emp_tuix_List">
</table>
<div id="activity_pane" style="position:absolute;left:500px;top:70px"></div>
<div class="row" style="margin-left:0" id="emp_tuix">
</div>

			</div>
		</div>
	</div>
	<div class="row-fluid">
		<div class="span4">
			<div class="box-content" id="4385">
				<div class="container-fluid" style="overflow-y:hidden;padding-top:5px;">
					<table id="sexy_women_LIST_List">
					</table>
					<div id="activity_pane" style="position:absolute;left:500px;top:70px"></div>
					<div id="sexy_women_chart" style="width:100%;height:400px;"></div>
				</div>
			</div>
		</div>
		<div class="span4">
			<div class="box-content" id="4390">
				<div class="container-fluid" style="overflow-y:hidden;padding-top:5px;">
					<table id="EMP_V_YEAROLDS_list_List">
					</table>
					<div id="activity_pane" style="position:absolute;left:500px;top:70px"></div>
					<div id="YEAROLDS_BI_chart" style="width:100%;height:400px;"></div>
				</div>
			</div>
		</div>
		<div class="span4">
			<div class="box-content" id="4388">
				<div class="container-fluid" style="overflow-y:hidden;padding-top:5px;">
					<table id="sexy_women_LIST_List">
					</table>
					<div id="activity_pane" style="position:absolute;left:500px;top:70px"></div>
					<div id="emp_maxty_chart" style="width:100%;height:400px;"></div>
				</div>
			</div>
		</div>
	</div>
	<div class="row-fluid">
		<div class="span12">
			<div class="box-content" id="4394">
				<div class="container-fluid" style="overflow-y:hidden;padding-top:5px;">
					<table id="sexy_women_LIST_List">
					</table>
					<div id="activity_pane" style="position:absolute;left:500px;top:70px"></div>
					<div id="comp_sds_chart" style="width:100%;height:400px;"></div>
				</div>
			</div>
		</div>
	</div>
	
	
</div><script>
	var _formId_4397='4397';
var realFormId='${param.formId}';
var heightGadedata_4397 =[];
var containerParam_4397 ={};
containerParam_4397 ={};
function changeHeightGadedata_4397(data){
	heightGadedata_4397 = data;
}
	var _formId_4399='4399';
var realFormId='${param.formId}';
var heightGadedata_4399 =[];
var containerParam_4399 ={};
containerParam_4399 ={};
function changeHeightGadedata_4399(data){
	heightGadedata_4399 = data;
}
	var _formId_4400='4400';
var realFormId='${param.formId}';
var heightGadedata_4400 =[];
var containerParam_4400 ={};
containerParam_4400 ={};
function changeHeightGadedata_4400(data){
	heightGadedata_4400 = data;
}
var heightGadedata_4386 =[];
var containerParam_4386 ={};
containerParam_4386 ={};
function changeHeightGadedata_4386(data){
	heightGadedata_4386 = data;
}
var heightGadedata_4386 =[];
var containerParam_4386 ={};
containerParam_4386 ={};
function changeHeightGadedata_4386(data){
	heightGadedata_4386 = data;
}
var heightGadedata_4389 =[];
var containerParam_4389 ={};
containerParam_4389 ={};
function changeHeightGadedata_4389(data){
	heightGadedata_4389 = data;
}
var heightGadedata_4386 =[];
var containerParam_4386 ={};
containerParam_4386 ={};
function changeHeightGadedata_4386(data){
	heightGadedata_4386 = data;
}
$(function() {
loadDataStart_4397();
loadDataStart_4399();
loadDataStart_4400();
    querys_4386();
    //showMoreBtn($(".BTNGROUP_4386"));
    queryAllData_4385();
    querys_4386();
    //showMoreBtn($(".BTNGROUP_4386"));
    queryAllData_4394();
    querys_4389();
    //showMoreBtn($(".BTNGROUP_4389"));
    queryAllData_4390();
    querys_4386();
    //showMoreBtn($(".BTNGROUP_4386"));
    queryAllData_4388();
getEmpPhotoSYS();
cardSelectInitFunction("${param.formType}");
cardDateWidInitFunction();
});
	var _formId_4386='4386';
var realFormId='${param.formId}';
	var _formId_4386='4386';
var realFormId='${param.formId}';
	var _formId_4389='4389';
var realFormId='${param.formId}';
	var _formId_4386='4386';
var realFormId='${param.formId}';
var showButtonNum = 0;
function initRoleButtons(buttonFormId,buttonFormCode){
    var url = '${pageContext.request.contextPath }/form/queryCardFormButtonsWithUserId.action?formId='+buttonFormId;
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
                        obj[0].parentNode.style.display="none";
                    }else if(datas[i].powerType==3){
                        var obj = $("#"+datas[i].formButtonCode+buttonFormCode+"");
                        obj[0].parentNode.style.display="none";
                    }else if(datas[i].powerType==2){
                        var obj = $("#"+datas[i].formButtonCode+buttonFormCode+"");
                        obj[0].disabled=true;
                        showButtonNum++;
                    }else if(datas[i].powerType==0){
                        var obj = $("#"+datas[i].formButtonCode+buttonFormCode+"");
                        obj[0].parentNode.style.display="none";
                    }else{
                        showButtonNum++;
                    }
                }
                showMoreBtn1($(".BTNGROUP_"+buttonFormId+""),showButtonNum);
            }
        }
    });
}
    function querys_4386() {
        initRoleColumn('4386');
        initRoleButtons('4386','sexy_women_LIST');
        $("#sexy_women_LIST_List").bootstrapTable({
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
            queryParams : grid_sexy_women_LIST_fun,
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
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"性别")%>',
                field : 'EMPVEMPLOYEE_GENDER',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_GENDER,
                valign : 'left',
                formatter: function (value, row, index) {
                    var value1 = '';
					  if(value!=undefined&&value!=""&&value!=null&&dictDatas_sexy_women_LIST_84488!=undefined&&dictDatas_sexy_women_LIST_84488!=null){
							value1 = dictDatas_sexy_women_LIST_84488[value];
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
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"公司")%>',
                field : 'EMPVEMPLOYEE_COMPID',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_COMPID,
                valign : 'left',
                formatter: function (value, row, index) {
                    var value1 = '';
					  if(value!=undefined&&value!=""&&value!=null&&dictDatas_sexy_women_LIST_84498!=undefined&&dictDatas_sexy_women_LIST_84498!=null){
							value1 = dictDatas_sexy_women_LIST_84498[value];
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
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"员工ID")%>',
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
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"最高学历")%>',
                field : 'EMPVEMPLOYEE_MAXEDUCATION',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_MAXEDUCATION,
                valign : 'left',
                formatter: function (value, row, index) {
                    var value1 = '';
					  if(value!=undefined&&value!=""&&value!=null&&dictDatas_sexy_women_LIST_84490!=undefined&&dictDatas_sexy_women_LIST_84490!=null){
							value1 = dictDatas_sexy_women_LIST_84490[value];
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

            ],
            onClickRow: function (row, $element) {
                curRow = row;
            },
		onPostBody: function (res) {
		    hiddenBorder();
		},
		onLoadSuccess: function (aa, bb, cc) {
                $("#sexy_women_LIST_List a").editable({
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
        	editsexy_women_LIST_click_4386('isView',row);  
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
var showButtonNum = 0;
function initRoleButtons(buttonFormId,buttonFormCode){
    var url = '${pageContext.request.contextPath }/form/queryCardFormButtonsWithUserId.action?formId='+buttonFormId;
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
                        obj[0].parentNode.style.display="none";
                    }else if(datas[i].powerType==3){
                        var obj = $("#"+datas[i].formButtonCode+buttonFormCode+"");
                        obj[0].parentNode.style.display="none";
                    }else if(datas[i].powerType==2){
                        var obj = $("#"+datas[i].formButtonCode+buttonFormCode+"");
                        obj[0].disabled=true;
                        showButtonNum++;
                    }else if(datas[i].powerType==0){
                        var obj = $("#"+datas[i].formButtonCode+buttonFormCode+"");
                        obj[0].parentNode.style.display="none";
                    }else{
                        showButtonNum++;
                    }
                }
                showMoreBtn1($(".BTNGROUP_"+buttonFormId+""),showButtonNum);
            }
        }
    });
}
    function querys_4386() {
        initRoleColumn('4386');
        initRoleButtons('4386','sexy_women_LIST');
        $("#sexy_women_LIST_List").bootstrapTable({
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
            queryParams : grid_sexy_women_LIST_fun,
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
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"性别")%>',
                field : 'EMPVEMPLOYEE_GENDER',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_GENDER,
                valign : 'left',
                formatter: function (value, row, index) {
                    var value1 = '';
					  if(value!=undefined&&value!=""&&value!=null&&dictDatas_sexy_women_LIST_84488!=undefined&&dictDatas_sexy_women_LIST_84488!=null){
							value1 = dictDatas_sexy_women_LIST_84488[value];
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
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"公司")%>',
                field : 'EMPVEMPLOYEE_COMPID',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_COMPID,
                valign : 'left',
                formatter: function (value, row, index) {
                    var value1 = '';
					  if(value!=undefined&&value!=""&&value!=null&&dictDatas_sexy_women_LIST_84498!=undefined&&dictDatas_sexy_women_LIST_84498!=null){
							value1 = dictDatas_sexy_women_LIST_84498[value];
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
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"员工ID")%>',
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
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"最高学历")%>',
                field : 'EMPVEMPLOYEE_MAXEDUCATION',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_MAXEDUCATION,
                valign : 'left',
                formatter: function (value, row, index) {
                    var value1 = '';
					  if(value!=undefined&&value!=""&&value!=null&&dictDatas_sexy_women_LIST_84490!=undefined&&dictDatas_sexy_women_LIST_84490!=null){
							value1 = dictDatas_sexy_women_LIST_84490[value];
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

            ],
            onClickRow: function (row, $element) {
                curRow = row;
            },
		onPostBody: function (res) {
		    hiddenBorder();
		},
		onLoadSuccess: function (aa, bb, cc) {
                $("#sexy_women_LIST_List a").editable({
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
        	editsexy_women_LIST_click_4386('isView',row);  
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
var showButtonNum = 0;
function initRoleButtons(buttonFormId,buttonFormCode){
    var url = '${pageContext.request.contextPath }/form/queryCardFormButtonsWithUserId.action?formId='+buttonFormId;
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
                        obj[0].parentNode.style.display="none";
                    }else if(datas[i].powerType==3){
                        var obj = $("#"+datas[i].formButtonCode+buttonFormCode+"");
                        obj[0].parentNode.style.display="none";
                    }else if(datas[i].powerType==2){
                        var obj = $("#"+datas[i].formButtonCode+buttonFormCode+"");
                        obj[0].disabled=true;
                        showButtonNum++;
                    }else if(datas[i].powerType==0){
                        var obj = $("#"+datas[i].formButtonCode+buttonFormCode+"");
                        obj[0].parentNode.style.display="none";
                    }else{
                        showButtonNum++;
                    }
                }
                showMoreBtn1($(".BTNGROUP_"+buttonFormId+""),showButtonNum);
            }
        }
    });
}
    function querys_4389() {
        initRoleColumn('4389');
        initRoleButtons('4389','EMP_V_YEAROLDS_list');
        $("#EMP_V_YEAROLDS_list_List").bootstrapTable({
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
            queryParams : grid_EMP_V_YEAROLDS_list_fun,
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
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"人员ID")%>',
                field : 'EMPVYEAROLDS_EMPID',
                align : 'center',
                visible : columnvisible.EMPVYEAROLDS_EMPID,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVYEAROLDS_EMPID\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"人员ID\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"年龄分段")%>',
                field : 'EMPVYEAROLDS_TT',
                align : 'center',
                visible : columnvisible.EMPVYEAROLDS_TT,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPVYEAROLDS_TT\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"年龄分段\">"+value+"</a>";
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
                $("#EMP_V_YEAROLDS_list_List a").editable({
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
        	editEMP_V_YEAROLDS_list_click_4389('isView',row);  
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
var showButtonNum = 0;
function initRoleButtons(buttonFormId,buttonFormCode){
    var url = '${pageContext.request.contextPath }/form/queryCardFormButtonsWithUserId.action?formId='+buttonFormId;
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
                        obj[0].parentNode.style.display="none";
                    }else if(datas[i].powerType==3){
                        var obj = $("#"+datas[i].formButtonCode+buttonFormCode+"");
                        obj[0].parentNode.style.display="none";
                    }else if(datas[i].powerType==2){
                        var obj = $("#"+datas[i].formButtonCode+buttonFormCode+"");
                        obj[0].disabled=true;
                        showButtonNum++;
                    }else if(datas[i].powerType==0){
                        var obj = $("#"+datas[i].formButtonCode+buttonFormCode+"");
                        obj[0].parentNode.style.display="none";
                    }else{
                        showButtonNum++;
                    }
                }
                showMoreBtn1($(".BTNGROUP_"+buttonFormId+""),showButtonNum);
            }
        }
    });
}
    function querys_4386() {
        initRoleColumn('4386');
        initRoleButtons('4386','sexy_women_LIST');
        $("#sexy_women_LIST_List").bootstrapTable({
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
            queryParams : grid_sexy_women_LIST_fun,
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
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"性别")%>',
                field : 'EMPVEMPLOYEE_GENDER',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_GENDER,
                valign : 'left',
                formatter: function (value, row, index) {
                    var value1 = '';
					  if(value!=undefined&&value!=""&&value!=null&&dictDatas_sexy_women_LIST_84488!=undefined&&dictDatas_sexy_women_LIST_84488!=null){
							value1 = dictDatas_sexy_women_LIST_84488[value];
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
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"公司")%>',
                field : 'EMPVEMPLOYEE_COMPID',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_COMPID,
                valign : 'left',
                formatter: function (value, row, index) {
                    var value1 = '';
					  if(value!=undefined&&value!=""&&value!=null&&dictDatas_sexy_women_LIST_84498!=undefined&&dictDatas_sexy_women_LIST_84498!=null){
							value1 = dictDatas_sexy_women_LIST_84498[value];
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
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"员工ID")%>',
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
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"最高学历")%>',
                field : 'EMPVEMPLOYEE_MAXEDUCATION',
                align : 'center',
                visible : columnvisible.EMPVEMPLOYEE_MAXEDUCATION,
                valign : 'left',
                formatter: function (value, row, index) {
                    var value1 = '';
					  if(value!=undefined&&value!=""&&value!=null&&dictDatas_sexy_women_LIST_84490!=undefined&&dictDatas_sexy_women_LIST_84490!=null){
							value1 = dictDatas_sexy_women_LIST_84490[value];
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

            ],
            onClickRow: function (row, $element) {
                curRow = row;
            },
		onPostBody: function (res) {
		    hiddenBorder();
		},
		onLoadSuccess: function (aa, bb, cc) {
                $("#sexy_women_LIST_List a").editable({
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
        	editsexy_women_LIST_click_4386('isView',row);  
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
function refresh_sexy_women_LIST() { 
    $('#sexy_women_LIST_List').bootstrapTable('refresh'); 
}

/** 隐藏边框 */ 
function hiddenBorder(type) { 
    if(type == 0){
        $("#sexy_women_LIST_List td").css("border","none");
    }else if(type == 1){
        $("#sexy_women_LIST_List td").css("border-left","none");
    }else if(type == 2){
        $("#sexy_women_LIST_List td").css("border-top","none");
    }
}
	function grid_sexy_women_LIST_HeighQuery_4386() {
		layer.open({
			type: 2,
			showMaxButton: true,
			title:"<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"高级查询设置")%>" ,
			area: ['855', '500'],
			maxmin: true,
			content:'/myehr/jsp/form/button/heightGrade.jsp?formFunction=grid_sexy_women_LIST_fun11_4386&formDefId=4386&formDefLayout=2',
			success:function(layero,index){
				},
				end:function(){
			}
			});
	}
function initCharts_4385(xAxisData,seriesData){
	var myChart = echarts.init(document.getElementById('sexy_women_chart'));
	var options={
		tooltip : {
			trigger: 'item',
			formatter : "{a} <br/>{b}: {c} ({d}%)"
		},
		toolbox: {
			show: true,
			feature: {
				dataView: {readOnly: false},
				restore: {},
				saveAsImage: {}
			}
		},
		
       legend:{
		   orient: 'vertical',
		   left: 'left',
           data:xAxisData
       },
       series:[
           {
               name:'性别',
               type:'pie',
               radius : '50%',
               center: ['50%', '40%'],
               avoidLabelOverlap: false,
               label: {
                   normal: {
                       show: false,
                       position: 'center'
                   },
                   emphasis: {
                       show: true,
                       textStyle: {
                           fontSize: '30',
                           fontWeight: 'bold'
                       }
                   }
               },
               labelLine: {
                   normal: {
                       show: false
                   }
               },
               data:seriesData
           }
       ]
    };
    myChart.setOption(options);
}
function queryAllData_4385(){
document.getElementById("sexy_women_LIST_List").parentNode.parentNode.parentNode.style.display="none";
	var url='${pageContext.request.contextPath }/form/cardformInitData.action?queryType=all';
	$.ajax({
		url:url,
		type:'post',
		data: queryParams,
		cache: false,
		contentType: 'application/json;charset=utf-8',
		success: function (text) {
			initArrData_4385(text.rows);
		},
	});
}
function initArrData_4385(datas){
	var xAxisData=[];
	var seriesData=[];
	var xAxisColumn = 'EMPVEMPLOYEE_GENDER';
	var formDefSql = 'select   EMP_V_EMPLOYEE.COMPID AS EMPVEMPLOYEE_COMPID,  EMP_V_EMPLOYEE.GENDER AS EMPVEMPLOYEE_GENDER , EMP_V_EMPLOYEE.EMPID AS EMPVEMPLOYEE_EMPID, EMP_V_EMPLOYEE.MAXEDUCATION AS EMPVEMPLOYEE_MAXEDUCATION    from   EMP_V_EMPLOYEE';
	var url='${pageContext.request.contextPath }/charts/searchChartsType.action?xColumnId=84488&xAxisColumn='+xAxisColumn+'&formDefSql='+formDefSql;
	$.ajax({
		url:url,
		type:'post',
		cache: false,
		contentType: 'application/json;charset=utf-8',
		success: function (text) {
			for(var i=0;i<text.length;i++){
				xAxisData.push(text[i].dictName);
				var flag=0;
				for(var j=0;j<datas.length;j++){
					if(text[i].EMPVEMPLOYEE_GENDER==datas[j].EMPVEMPLOYEE_GENDER){
						flag++;
					}
				}
				var obj={};
				obj.value = flag ;
				obj.name=text[i].dictName;
				seriesData.push(obj);
			}
			initCharts_4385(xAxisData,seriesData)
		},
	});
}
/** 刷新页面 */ 
function refresh_sexy_women_LIST() { 
    $('#sexy_women_LIST_List').bootstrapTable('refresh'); 
}

/** 隐藏边框 */ 
function hiddenBorder(type) { 
    if(type == 0){
        $("#sexy_women_LIST_List td").css("border","none");
    }else if(type == 1){
        $("#sexy_women_LIST_List td").css("border-left","none");
    }else if(type == 2){
        $("#sexy_women_LIST_List td").css("border-top","none");
    }
}
	function grid_sexy_women_LIST_HeighQuery_4386() {
		layer.open({
			type: 2,
			showMaxButton: true,
			title:"<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"高级查询设置")%>" ,
			area: ['855', '500'],
			maxmin: true,
			content:'/myehr/jsp/form/button/heightGrade.jsp?formFunction=grid_sexy_women_LIST_fun11_4386&formDefId=4386&formDefLayout=2',
			success:function(layero,index){
				},
				end:function(){
			}
			});
	}
function initCharts_4394(xAxisData,seriesData){
	var myChart = echarts.init(document.getElementById('comp_sds_chart'));
	var options={
		tooltip : {
			trigger: 'item',
			formatter : "{a} <br/>{b}: {c} ({d}%)"
		},
		toolbox: {
			show: true,
			feature: {
				dataView: {readOnly: false},
				restore: {},
				saveAsImage: {}
			}
		},
       legend:{
		   orient: 'vertical',
		   left: 'left',
           data:xAxisData
       },
       series:[
           {
               name:'公司',
               type:'pie',
               radius : '60%',
			   center: ['50%', '50%'],
               avoidLabelOverlap: false,
               label: {
                   normal: {
                       show: false,
                       position: 'center'
                   },
                   emphasis: {
                       show: true,
                       textStyle: {
                           fontSize: '30',
                           fontWeight: 'bold'
                       }
                   }
               },
               labelLine: {
                   normal: {
                       show: false
                   }
               },
               data:seriesData
           }
       ]
    };
    myChart.setOption(options);
}
function queryAllData_4394(){
document.getElementById("sexy_women_LIST_List").parentNode.parentNode.parentNode.style.display="none";
	var url='${pageContext.request.contextPath }/form/cardformInitData.action?queryType=all';
	$.ajax({
		url:url,
		type:'post',
		data: queryParams,
		cache: false,
		contentType: 'application/json;charset=utf-8',
		success: function (text) {
			initArrData_4394(text.rows);
		},
	});
}
function initArrData_4394(datas){
	var xAxisData=[];
	var seriesData=[];
	var xAxisColumn = 'EMPVEMPLOYEE_COMPID';
	var formDefSql = 'select   EMP_V_EMPLOYEE.COMPID AS EMPVEMPLOYEE_COMPID,  EMP_V_EMPLOYEE.GENDER AS EMPVEMPLOYEE_GENDER , EMP_V_EMPLOYEE.EMPID AS EMPVEMPLOYEE_EMPID, EMP_V_EMPLOYEE.MAXEDUCATION AS EMPVEMPLOYEE_MAXEDUCATION    from   EMP_V_EMPLOYEE';
	var url='${pageContext.request.contextPath }/charts/searchChartsType.action?xColumnId=84498&xAxisColumn='+xAxisColumn+'&formDefSql='+formDefSql;
	$.ajax({
		url:url,
		type:'post',
		cache: false,
		contentType: 'application/json;charset=utf-8',
		success: function (text) {
			for(var i=0;i<text.length;i++){
				xAxisData.push(text[i].dictName);
				var flag=0;
				for(var j=0;j<datas.length;j++){
					if(text[i].EMPVEMPLOYEE_COMPID==datas[j].EMPVEMPLOYEE_COMPID){
						flag++;
					}
				}
				var obj={};
				obj.value = flag ;
				obj.name=text[i].dictName;
				seriesData.push(obj);
			}
			initCharts_4394(xAxisData,seriesData)
		},
	});
}
/** 刷新页面 */ 
function refresh_EMP_V_YEAROLDS_list() { 
    $('#EMP_V_YEAROLDS_list_List').bootstrapTable('refresh'); 
}

/** 隐藏边框 */ 
function hiddenBorder(type) { 
    if(type == 0){
        $("#EMP_V_YEAROLDS_list_List td").css("border","none");
    }else if(type == 1){
        $("#EMP_V_YEAROLDS_list_List td").css("border-left","none");
    }else if(type == 2){
        $("#EMP_V_YEAROLDS_list_List td").css("border-top","none");
    }
}
	function grid_EMP_V_YEAROLDS_list_HeighQuery_4389() {
		layer.open({
			type: 2,
			showMaxButton: true,
			title:"<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"高级查询设置")%>" ,
			area: ['855', '500'],
			maxmin: true,
			content:'/myehr/jsp/form/button/heightGrade.jsp?formFunction=grid_EMP_V_YEAROLDS_list_fun11_4389&formDefId=4389&formDefLayout=2',
			success:function(layero,index){
				},
				end:function(){
			}
			});
	}
function initCharts_4390(xAxisData,seriesData){
	var myChart = echarts.init(document.getElementById('YEAROLDS_BI_chart'));
	var options={
		tooltip : {
			trigger: 'item',
			formatter : "{a} <br/>{b}: {c} ({d}%)"
		},
		toolbox: {
			show: true,
			feature: {
				dataView: {readOnly: false},
				restore: {},
				saveAsImage: {}
			}
		},
       legend:{
		   orient: 'vertical',
		   left: 'left',
           data:xAxisData
       },
       series:[
           {
               name:'年龄分段',
               type:'pie',
               radius : '50%',
               center: ['50%', '40%'],
               avoidLabelOverlap: false,
               label: {
                   normal: {
                       show: false,
                       position: 'center'
                   },
                   emphasis: {
                       show: true,
                       textStyle: {
                           fontSize: '30',
                           fontWeight: 'bold'
                       }
                   }
               },
               labelLine: {
                   normal: {
                       show: false
                   }
               },
               data:seriesData
           }
       ]
    };
    myChart.setOption(options);
}
function queryAllData_4390(){
document.getElementById("EMP_V_YEAROLDS_list_List").parentNode.parentNode.parentNode.style.display="none";
	var url='${pageContext.request.contextPath }/form/cardformInitData.action?queryType=all';
	$.ajax({
		url:url,
		type:'post',
		data: queryParams,
		cache: false,
		contentType: 'application/json;charset=utf-8',
		success: function (text) {
			initArrData_4390(text.rows);
		},
	});
}
function initArrData_4390(datas){
	var xAxisData=[];
	var seriesData=[];
	var xAxisColumn = 'EMPVYEAROLDS_TT';
	var formDefSql = 'SELECT   EMP_V_YEAROLDS.EMPID AS EMPVYEAROLDS_EMPID,EMP_V_YEAROLDS.TT AS EMPVYEAROLDS_TT   FROM   EMP_V_YEAROLDS';
	var url='${pageContext.request.contextPath }/charts/searchChartsType.action?xColumnId=84494&xAxisColumn='+xAxisColumn+'&formDefSql='+formDefSql;
	$.ajax({
		url:url,
		type:'post',
		cache: false,
		contentType: 'application/json;charset=utf-8',
		success: function (text) {
			for(var i=0;i<text.length;i++){
				xAxisData.push(text[i].dictName);
				var flag=0;
				for(var j=0;j<datas.length;j++){
					if(text[i].EMPVYEAROLDS_TT==datas[j].EMPVYEAROLDS_TT){
						flag++;
					}
				}
				var obj={};
				obj.value = flag ;
				obj.name=text[i].dictName;
				seriesData.push(obj);
			}
			initCharts_4390(xAxisData,seriesData)
		},
	});
}
/** 刷新页面 */ 
function refresh_sexy_women_LIST() { 
    $('#sexy_women_LIST_List').bootstrapTable('refresh'); 
}

/** 隐藏边框 */ 
function hiddenBorder(type) { 
    if(type == 0){
        $("#sexy_women_LIST_List td").css("border","none");
    }else if(type == 1){
        $("#sexy_women_LIST_List td").css("border-left","none");
    }else if(type == 2){
        $("#sexy_women_LIST_List td").css("border-top","none");
    }
}
	function grid_sexy_women_LIST_HeighQuery_4386() {
		layer.open({
			type: 2,
			showMaxButton: true,
			title:"<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"高级查询设置")%>" ,
			area: ['855', '500'],
			maxmin: true,
			content:'/myehr/jsp/form/button/heightGrade.jsp?formFunction=grid_sexy_women_LIST_fun11_4386&formDefId=4386&formDefLayout=2',
			success:function(layero,index){
				},
				end:function(){
			}
			});
	}
function initCharts_4388(xAxisData,seriesData){
	var x = '50%';//页面左右
	var y = '40%';//页面上下
	var size = '80%';//图形大小
	var titleType = 'vertical';
	var titlePosition = 'left';
	var myChart = echarts.init(document.getElementById('emp_maxty_chart'));
	var options={
		tooltip : {
			trigger: 'item',
			formatter : "{a} <br/>{b}: {c} ({d}%)"
		},
		toolbox: {
			show: true,
			feature: {
				dataView: {readOnly: false},
				restore: {},
				saveAsImage: {}
			}
		},
       legend:{
		   orient: titleType,
		   left: titlePosition,
           data:xAxisData
       },
       series:[
           {
               name:'最高学历',
               type:'pie',
			   radius : size,
			   center: [x,y],
               avoidLabelOverlap: false,
               label: {
                   normal: {
                       show: false,
                       position: 'center'
                   },
                   emphasis: {
                       show: true,
                       textStyle: {
                           fontSize: '30',
                           fontWeight: 'bold'
                       }
                   }
               },
               labelLine: {
                   normal: {
                       show: false
                   }
               },
               data:seriesData
           }
       ]
    };
    myChart.setOption(options);
}
function queryAllData_4388(){
document.getElementById("sexy_women_LIST_List").parentNode.parentNode.parentNode.style.display="none";
	var url='${pageContext.request.contextPath }/form/cardformInitData.action?queryType=all';
	$.ajax({
		url:url,
		type:'post',
		data: queryParams,
		cache: false,
		contentType: 'application/json;charset=utf-8',
		success: function (text) {
			initArrData_4388(text.rows);
		},
	});
}
function initArrData_4388(datas){
	var xAxisData=[];
	var seriesData=[];
	var xAxisColumn = 'EMPVEMPLOYEE_MAXEDUCATION';
	var formDefSql = 'select   EMP_V_EMPLOYEE.COMPID AS EMPVEMPLOYEE_COMPID,  EMP_V_EMPLOYEE.GENDER AS EMPVEMPLOYEE_GENDER , EMP_V_EMPLOYEE.EMPID AS EMPVEMPLOYEE_EMPID, EMP_V_EMPLOYEE.MAXEDUCATION AS EMPVEMPLOYEE_MAXEDUCATION    from   EMP_V_EMPLOYEE';
	var url='${pageContext.request.contextPath }/charts/searchChartsType.action?xColumnId=84490&xAxisColumn='+xAxisColumn+'&formDefSql='+formDefSql;
	$.ajax({
		url:url,
		type:'post',
		cache: false,
		contentType: 'application/json;charset=utf-8',
		success: function (text) {
			for(var i=0;i<text.length;i++){
				xAxisData.push(text[i].dictName);
				var flag=0;
				for(var j=0;j<datas.length;j++){
					if(text[i].EMPVEMPLOYEE_MAXEDUCATION==datas[j].EMPVEMPLOYEE_MAXEDUCATION){
						flag++;
					}
				}
				var obj={};
				obj.value = flag ;
				obj.name=text[i].dictName;
				seriesData.push(obj);
			}
			initCharts_4388(xAxisData,seriesData)
		},
	});
}
var filterParam = {};
var queryParams;
function grid_emp_newemp_fun(pageReqeust){
	var _filterdata={};
	if(document.getElementById('grid_emp_newemp_filter')){
	}
	var paramsMap = {};
	var requestParam={};
		requestParam = {};
	pageReqeust.containerParam=containerParam_4397;
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.userIds=getQueryString('empIds');
	pageReqeust.formId=_formId_4397;
	pageReqeust.isView=null;
	pageReqeust.offset=Currentpage*pagesize;;
	pageReqeust.limit=pagesize;;
	if(heightGadedata_4397!=null&&heightGadedata_4397!=undefined){
		pageReqeust.heightGrade = heightGadedata_4397;
	}
	queryParams = JSON.stringify(pageReqeust);
	return queryParams;
}
function grid_emp_newemp_fun11_4397(){
	loadDataStart();

}
function loadDataStart_4397(){
$.ajax({
    url: "/myehr/form/cardformInitData.action",
    type: 'post',
    data:grid_emp_newemp_fun(xx),//HTTP请求类型
    contentType: 'application/json;charset=utf-8',
    cache: false,
    async: false,
    success: function (data) {
        var arr=data.rows;
        showDate_4397(arr);
      }
});
}function showDate_4397(arr) {
for (var i = arr.length - 1; i >= 0; i--) {
    var cellObj = $(
			'<div class="col-md-12 col-sm-12 col-lg-12">'+
		'    <div class="widget style1 navy-bg" style="background-color:#578ebe">'+
		'        <div class="row" id="row" >'+
		'            <div class="col-xs-12 text-right">'+
		'				<div style="margin-top:10px"><a href="/myehr/form/toForm.action?formId=4398&VIR_PERNUM='+arr[i].VIR_PERNUM+'"><span style="height:10%;text-align:center;display:block;font-size:70;color:#ffffff;font-weight:800;">'+arr[i].VIR_PERNUM+'</span></a></div>'+
		'				<div style="margin-top:10px"><span style="text-align:center;display:block;font-size:12;color:#ffffff;font-weight:400;">新入职人数</span></div>'+
		'            </div>'+
		'        </div>'+
		'    </div>'+
		'</div>');
$('#emp_newemp').append(cellObj);
}
	}
var filterParam = {};
var queryParams;
function grid_emp_newlizhi_fun(pageReqeust){
	var _filterdata={};
	if(document.getElementById('grid_emp_newlizhi_filter')){
	}
	var paramsMap = {};
	var requestParam={};
		requestParam = {};
	pageReqeust.containerParam=containerParam_4399;
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.userIds=getQueryString('empIds');
	pageReqeust.formId=_formId_4399;
	pageReqeust.isView=null;
	pageReqeust.offset=Currentpage*pagesize;;
	pageReqeust.limit=pagesize;;
	if(heightGadedata_4399!=null&&heightGadedata_4399!=undefined){
		pageReqeust.heightGrade = heightGadedata_4399;
	}
	queryParams = JSON.stringify(pageReqeust);
	return queryParams;
}
function grid_emp_newlizhi_fun11_4399(){
	loadDataStart();

}
function loadDataStart_4399(){
$.ajax({
    url: "/myehr/form/cardformInitData.action",
    type: 'post',
    data:grid_emp_newlizhi_fun(xx),//HTTP请求类型
    contentType: 'application/json;charset=utf-8',
    cache: false,
    async: false,
    success: function (data) {
        var arr=data.rows;
        showDate_4399(arr);
      }
});
}function showDate_4399(arr) {
for (var i = arr.length - 1; i >= 0; i--) {
    var cellObj = $(
			'<div class="col-md-12 col-sm-12 col-lg-12">'+
		'    <div class="widget style1 navy-bg" style="background-color:#578ebe">'+
		'        <div class="row" id="row" >'+
		'            <div class="col-xs-12 text-right">'+
		'				<div style="margin-top:10px"><a href="/myehr/form/toForm.action?formId=2643&VIR_PERNUM='+arr[i].VIR_PERNUM+'"><span style="height:10%;text-align:center;display:block;font-size:70;color:#ffffff;font-weight:800;">'+arr[i].VIR_PERNUM+'</span></a></div>'+
		'				<div style="margin-top:10px"><span style="text-align:center;display:block;font-size:12;color:#ffffff;font-weight:400;">本月离职人数</span></div>'+
		'            </div>'+
		'        </div>'+
		'    </div>'+
		'</div>');
$('#emp_newlizhi').append(cellObj);
}
	}
var filterParam = {};
var queryParams;
function grid_emp_tuix_fun(pageReqeust){
	var _filterdata={};
	if(document.getElementById('grid_emp_tuix_filter')){
	}
	var paramsMap = {};
	var requestParam={};
		requestParam = {};
	pageReqeust.containerParam=containerParam_4400;
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.userIds=getQueryString('empIds');
	pageReqeust.formId=_formId_4400;
	pageReqeust.isView=null;
	pageReqeust.offset=Currentpage*pagesize;;
	pageReqeust.limit=pagesize;;
	if(heightGadedata_4400!=null&&heightGadedata_4400!=undefined){
		pageReqeust.heightGrade = heightGadedata_4400;
	}
	queryParams = JSON.stringify(pageReqeust);
	return queryParams;
}
function grid_emp_tuix_fun11_4400(){
	loadDataStart();

}
function loadDataStart_4400(){
$.ajax({
    url: "/myehr/form/cardformInitData.action",
    type: 'post',
    data:grid_emp_tuix_fun(xx),//HTTP请求类型
    contentType: 'application/json;charset=utf-8',
    cache: false,
    async: false,
    success: function (data) {
        var arr=data.rows;
        showDate_4400(arr);
      }
});
}function showDate_4400(arr) {
for (var i = arr.length - 1; i >= 0; i--) {
    var cellObj = $(
			'<div class="col-md-12 col-sm-12 col-lg-12">'+
		'    <div class="widget style1 navy-bg" style="background-color:#578ebe">'+
		'        <div class="row" id="row" >'+
		'            <div class="col-xs-12 text-right">'+
		'				<div style="margin-top:10px"><a href="/myehr/form/toForm.action?formId=2644&VIR_PERNUM='+arr[i].VIR_PERNUM+'"><span style="height:10%;text-align:center;display:block;font-size:70;color:#ffffff;font-weight:800;">'+arr[i].VIR_PERNUM+'</span></a></div>'+
		'				<div style="margin-top:10px"><span style="text-align:center;display:block;font-size:12;color:#ffffff;font-weight:400;">退休人数</span></div>'+
		'            </div>'+
		'        </div>'+
		'    </div>'+
		'</div>');
$('#emp_tuix').append(cellObj);
}
	}
var filterParam = {};
var queryParams;
function grid_sexy_women_LIST_fun(pageReqeust){
	var _filterdata={};
	if(document.getElementById('grid_sexy_women_LIST_filter')){
	}
	var paramsMap = {};
	var requestParam={};
		requestParam = {};
	pageReqeust.containerParam=containerParam_4386;
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.userIds=getQueryString('empIds');
	pageReqeust.formId=_formId_4386;
	pageReqeust.isView=null;
	if(heightGadedata_4386!=null&&heightGadedata_4386!=undefined){
		pageReqeust.heightGrade = heightGadedata_4386;
	}
	queryParams = JSON.stringify(pageReqeust);
	return queryParams;
}
function grid_sexy_women_LIST_fun11_4386(){
	$('#sexy_women_LIST_List').bootstrapTable('refresh');
}
var filterParam = {};
var queryParams;
function grid_sexy_women_LIST_fun(pageReqeust){
	var _filterdata={};
	if(document.getElementById('grid_sexy_women_LIST_filter')){
	}
	var paramsMap = {};
	var requestParam={};
		requestParam = {};
	pageReqeust.containerParam=containerParam_4386;
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.userIds=getQueryString('empIds');
	pageReqeust.formId=_formId_4386;
	pageReqeust.isView=null;
	if(heightGadedata_4386!=null&&heightGadedata_4386!=undefined){
		pageReqeust.heightGrade = heightGadedata_4386;
	}
	queryParams = JSON.stringify(pageReqeust);
	return queryParams;
}
function grid_sexy_women_LIST_fun11_4386(){
	$('#sexy_women_LIST_List').bootstrapTable('refresh');
}
var filterParam = {};
var queryParams;
function grid_EMP_V_YEAROLDS_list_fun(pageReqeust){
	var _filterdata={};
	if(document.getElementById('grid_EMP_V_YEAROLDS_list_filter')){
	}
	var paramsMap = {};
	var requestParam={};
		requestParam = {};
	pageReqeust.containerParam=containerParam_4389;
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.userIds=getQueryString('empIds');
	pageReqeust.formId=_formId_4389;
	pageReqeust.isView=null;
	if(heightGadedata_4389!=null&&heightGadedata_4389!=undefined){
		pageReqeust.heightGrade = heightGadedata_4389;
	}
	queryParams = JSON.stringify(pageReqeust);
	return queryParams;
}
function grid_EMP_V_YEAROLDS_list_fun11_4389(){
	$('#EMP_V_YEAROLDS_list_List').bootstrapTable('refresh');
}
var filterParam = {};
var queryParams;
function grid_sexy_women_LIST_fun(pageReqeust){
	var _filterdata={};
	if(document.getElementById('grid_sexy_women_LIST_filter')){
	}
	var paramsMap = {};
	var requestParam={};
		requestParam = {};
	pageReqeust.containerParam=containerParam_4386;
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.userIds=getQueryString('empIds');
	pageReqeust.formId=_formId_4386;
	pageReqeust.isView=null;
	if(heightGadedata_4386!=null&&heightGadedata_4386!=undefined){
		pageReqeust.heightGrade = heightGadedata_4386;
	}
	queryParams = JSON.stringify(pageReqeust);
	return queryParams;
}
function grid_sexy_women_LIST_fun11_4386(){
	$('#sexy_women_LIST_List').bootstrapTable('refresh');
}
function getEmpPhotoSYS(){
	var objs = $("#Employee_Photo_WT");
	if(objs.length>0){
		$.ajax({ 
			   url:'/myehr/FileList/getEmpPhotoSYS.action?EMPID=${param.EMPVEMPLOYEE_EMPID}',
			   type:'post',
			   cache: false,
			   async: false, 
			   success: function (data){ 
				   $("#Employee_Photo_WT").attr("src","data:image/jpg;base64,"+data.c1101);
			   }
		   });
	}
}
</script>
</body>
</html>
