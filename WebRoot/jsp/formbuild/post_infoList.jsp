<%@ page language="java" import="java.util.*" import="com.myehr.common.util.LangUtil" pageEncoding="UTF-8"%>
<%@ include file="/common/common.jsp" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<body>
<div class="container-fluid" style="height:100%;overflow-y:auto;padding-top:5px;">
<div class="input-group" style="z-index: 5;float:right">
    <div id="grid_post_infoList_filter">
        <table class="cbs-table" style="width:100%">
             <tr>
			<td style="float:right;padding-top:5px">
				<input id="FILTER_696" name="FILTER_696" placeholder="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"岗位编码")%>,<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"岗位名称")%>" style="padding: 6px 30px 6px 10px;" title="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"岗位编码")%>,<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"岗位名称")%>" type="text" class="form-control" oninput="grid_post_infoList_fun11_696()" />
				<i class="icon-search" style="position: absolute;right: 12px;top: 2px;cursor: pointer;"></i>
			</td>
            </tr>
        </table>
    </div>
</div>
		<div class="BTNGROUP BTNGROUP_696" style="margin:5px auto; display:inline-block;height: 30px;z-index: 6;position: relative">
			<div style="margin-right:10px;display:inline-block">
			    <input type="button" id="editpost_infoList"  class="btn btn-warning" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"查看")%> onclick="editpost_infoList_click_696()"/>
			</div>
			<div style="margin-right:10px;display:inline-block">
			    <input type="button" id="edit2post_infoList"  class="btn btn-warning" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"岗位说明")%> onclick="edit2post_infoList_click_696()"/>
			</div>
		</div>
<table id="post_infoList_List">
</table>
<div id="activity_pane" style="position:absolute;left:500px;top:70px"></div>
</div>
<script>
var heightGadedata_696 =[];
var containerParam_696 ={};
containerParam_696 ={};
function changeHeightGadedata_696(data){
	heightGadedata_696 = data;
}
var dictDatas_post_infoList_21438 = '';
var dictDatas_post_infoList_51343 = '';
var dictDatas_post_infoList_51344 = '';
var dictDatas_post_infoList_21439 = '';
var dictDatas_post_infoList_21433 = '';
var dictDatas_post_infoList_21434 = '';
var dictDatas_post_infoList_21435 = '';
var dictDatas_post_infoList_50118 = '';
var dictDatas_post_infoList_51345 = '';
var dictDatas_post_infoList_51135 = '';
var dictDatas_post_infoList_21442 = '';
function getDictDatasByFormId(){
$.ajax({
	url:'/myehr/form/getDictDatasByFormId.action?formId=${param.formId}',
	type:'post',
	cache: false,
	async:false,
	success: function (obj) {
dictDatas_post_infoList_21438 = obj.dictDatas_post_infoList_21438;
dictDatas_post_infoList_51343 = obj.dictDatas_post_infoList_51343;
dictDatas_post_infoList_51344 = obj.dictDatas_post_infoList_51344;
dictDatas_post_infoList_21439 = obj.dictDatas_post_infoList_21439;
dictDatas_post_infoList_21433 = obj.dictDatas_post_infoList_21433;
dictDatas_post_infoList_21434 = obj.dictDatas_post_infoList_21434;
dictDatas_post_infoList_21435 = obj.dictDatas_post_infoList_21435;
dictDatas_post_infoList_50118 = obj.dictDatas_post_infoList_50118;
dictDatas_post_infoList_51345 = obj.dictDatas_post_infoList_51345;
dictDatas_post_infoList_51135 = obj.dictDatas_post_infoList_51135;
dictDatas_post_infoList_21442 = obj.dictDatas_post_infoList_21442;
	}
});
}
$(function() {
getDictDatasByFormId();
gridPatterns2();

    cardSelectInitFunctionx_grid('${param.formType}');
    cardDateWidInitFunction();
    //showMoreBtn($(".BTNGROUP_696"));
    querys_696();
});
function initFilterParam_696(data){
}
	var _formId_696='696';
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
    function querys_696() {
        initRoleColumn('696');
        initRoleButtons('696','post_infoList');
        $("#post_infoList_List").bootstrapTable({
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
            queryParams : grid_post_infoList_fun,
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
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"岗位ID")%>',
                field : 'ORGJOB_jobid',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"ORGJOB_jobid\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"岗位ID\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"组织码")%>',
                field : 'ORGVORGANIZATIONALLA_ORGCODE',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"ORGVORGANIZATIONALLA_ORGCODE\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"组织码\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"岗位编码")%>',
                field : 'ORGJOB_jobcode',
                align : 'center',
                visible : columnvisible.ORGJOB_jobcode,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"ORGJOB_jobcode\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"岗位编码\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"岗位名称")%>',
                field : 'ORGJOB_cnname',
                align : 'center',
                visible : columnvisible.ORGJOB_cnname,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"ORGJOB_cnname\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"岗位名称\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"岗位简称")%>',
                field : 'ORGJOB_enname',
                align : 'center',
                visible : columnvisible.ORGJOB_enname,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"ORGJOB_enname\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"岗位简称\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"岗位级别")%>',
                field : 'ORGJOB_jobgrade',
                align : 'center',
                visible : columnvisible.ORGJOB_jobgrade,
                valign : 'left',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"ORGJOB_jobgrade\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\""+value+"\" data-source="+dictDatas_post_infoList_21438+"></a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"岗位类型")%>',
                field : 'ORGJOB_jobstyle',
                align : 'center',
                visible : columnvisible.ORGJOB_jobstyle,
                valign : 'left',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"ORGJOB_jobstyle\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\""+value+"\" data-source="+dictDatas_post_infoList_51343+"></a>";
                }
            },

  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"岗位系数")%>',
                field : 'ORGJOB_zuid',
                align : 'center',
                visible : columnvisible.ORGJOB_zuid,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"ORGJOB_zuid\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"岗位系数\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"岗位序列")%>',
                field : 'ORGJOB_joborder',
                align : 'center',
                visible : columnvisible.ORGJOB_joborder,
                valign : 'left',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"ORGJOB_joborder\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\""+value+"\" data-source="+dictDatas_post_infoList_51344+"></a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"岗位属性")%>',
                field : 'ORGJOB_jobkind',
                align : 'center',
                visible : columnvisible.ORGJOB_jobkind,
                valign : 'left',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"ORGJOB_jobkind\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\""+value+"\" data-source="+dictDatas_post_infoList_21439+"></a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"所属机构")%>',
                field : 'ORGJOB_compid',
                align : 'center',
                visible : columnvisible.ORGJOB_compid,
                valign : 'left',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"ORGJOB_compid\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\""+value+"\" data-source="+dictDatas_post_infoList_21433+"></a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"所属部门")%>',
                field : 'ORGJOB_depid',
                align : 'center',
                visible : columnvisible.ORGJOB_depid,
                valign : 'left',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"ORGJOB_depid\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\""+value+"\" >"+dictDatas_post_infoList_21434[value]+"</a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"上级岗位")%>',
                field : 'ORGJOB_parentid',
                align : 'center',
                visible : columnvisible.ORGJOB_parentid,
                valign : 'left',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"ORGJOB_parentid\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\""+value+"\" data-source="+dictDatas_post_infoList_21435+"></a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"创建日期")%>',
                field : 'ORGJOB_createdate',
                align : 'center',
                visible : columnvisible.ORGJOB_createdate,
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
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px\" name=\"ORGJOB_createdate\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"创建日期\">"+date+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"是否轮岗")%>',
                field : 'ORGJOB_ISTRAN',
                align : 'center',
                visible : columnvisible.ORGJOB_ISTRAN,
                valign : 'left',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"ORGJOB_ISTRAN\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\""+value+"\" data-source="+dictDatas_post_infoList_50118+"></a>";
                }
            },

  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"轮岗周期")%>',
                field : 'ORGJOB_TRANTERM',
                align : 'center',
                visible : columnvisible.ORGJOB_TRANTERM,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"ORGJOB_TRANTERM\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"轮岗周期\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"是否强制休假")%>',
                field : 'ORGJOB_isholiday',
                align : 'center',
                visible : columnvisible.ORGJOB_isholiday,
                valign : 'left',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"ORGJOB_isholiday\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\""+value+"\" data-source="+dictDatas_post_infoList_51345+"></a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"是否高管资格")%>',
                field : 'ORGJOB_corejob',
                align : 'center',
                visible : columnvisible.ORGJOB_corejob,
                valign : '',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"ORGJOB_corejob\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\""+value+"\" data-source="+dictDatas_post_infoList_51135+"></a>";
                }
            },

  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"排序")%>',
                field : 'ORGJOB_xorder',
                align : 'center',
                visible : columnvisible.ORGJOB_xorder,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"ORGJOB_xorder\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"排序\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"备注")%>',
                field : 'ORGJOB_remark',
                align : 'center',
                visible : columnvisible.ORGJOB_remark,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"ORGJOB_remark\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"备注\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"岗位条线")%>',
                field : 'ORGJOB_jobtype',
                align : 'center',
                visible : false,
                valign : '',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"ORGJOB_jobtype\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"岗位条线\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"所属职位")%>',
                field : 'ORGJOB_positionid',
                align : 'center',
                visible : false,
                valign : '',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"ORGJOB_positionid\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"所属职位\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"是否失效")%>',
                field : 'ORGJOB_isdisabled',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"ORGJOB_isdisabled\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\""+value+"\" data-source="+dictDatas_post_infoList_21442+"></a>";
                }
            },

            ],
            onClickRow: function (row, $element) {
                curRow = row;
				var obj = $("#post_infoList_List").bootstrapTable('getSelections');
            },
		onPostBody: function (res) {
		    hiddenBorder();
		},
		onLoadSuccess: function (aa, bb, cc) {
                $("#post_infoList_List a").editable({
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
        	editpost_infoList_click_696('isView',row);  
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
function ON_RENDERERpost_infoListORG_JOB_ORGJOB_compid_696(e){
			var params="{formId:"+_formId_post_infoList+",columnId:21433}";
		var returndata = null;
			var url = "com.dcf.form.runtime.comboboxComp.queryCombobxInitData.biz.ext";
			nui.ajax({
				url: url,
				type: 'POST',
				data: nui.encode({params:params,_value:e.value}),
			async: false,
			cache: false,
			contentType: 'text/json',
			success: function (text) {
				if(text.data[0]){
					returndata = text.data[0].text;;
				}else {
					alert('<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"读取字段Text失败!")%>');
				}
			},
			error: function (jqXHR, textStatus, errorThrown) {
			}
		});
		return returndata;

}
function ON_RENDERERpost_infoListORG_JOB_ORGJOB_depid_696(e){
			var params="{formId:"+_formId_post_infoList+",columnId:21434}";
		var returndata = null;
			var url = "com.dcf.form.runtime.comboboxComp.queryCombobxInitData.biz.ext";
			nui.ajax({
				url: url,
				type: 'POST',
				data: nui.encode({params:params,_value:e.value}),
			async: false,
			cache: false,
			contentType: 'text/json',
			success: function (text) {
				if(text.data[0]){
					returndata = text.data[0].text;;
				}else {
					alert('<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"读取字段Text失败!")%>');
				}
			},
			error: function (jqXHR, textStatus, errorThrown) {
			}
		});
		return returndata;

}
function ON_RENDERERpost_infoListORG_JOB_ORGJOB_parentid_696(e){
			var params="{formId:"+_formId_post_infoList+",columnId:21435}";
		var returndata = null;
			var url = "com.dcf.form.runtime.comboboxComp.queryCombobxInitData.biz.ext";
			nui.ajax({
				url: url,
				type: 'POST',
				data: nui.encode({params:params,_value:e.value}),
			async: false,
			cache: false,
			contentType: 'text/json',
			success: function (text) {
				if(text.data[0]){
					returndata = text.data[0].text;;
				}else {
					alert('<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"读取字段Text失败!")%>');
				}
			},
			error: function (jqXHR, textStatus, errorThrown) {
			}
		});
		return returndata;

}
/** 刷新页面 */ 
function refresh_post_infoList() { 
    $('#post_infoList_List').bootstrapTable('refresh'); 
}

/** 隐藏边框 */ 
function hiddenBorder(type) { 
    if(type == 0){
        $("#post_infoList_List td").css("border","none");
    }else if(type == 1){
        $("#post_infoList_List td").css("border-left","none");
    }else if(type == 2){
        $("#post_infoList_List td").css("border-top","none");
    }
}
function editpost_infoList_click_696(isView,data){
	var selects = $("#post_infoList_List").bootstrapTable('getSelections');;
	if(selects!=null && selects.length>0){
		select = selects[0];;
		title='<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"岗位信息查看")%>';
	}else if(data!=null&&isView!=null){
	select = data;
	title='<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"预览")%>';
	}else {
		alert('<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"请选择一行数据")%>');return ;
	}
	if(1==1){
		var url='/myehr/form/toForm.action?formId=697&isInit=true&ORGJOB_jobid='+select.ORGJOB_jobid+'&&&isView='+isView+'';
	}else{
		var url='/myehr/form/toForm.action?formId=697&isInit=true&ORGJOB_jobid='+ORGJOB_jobid+'&isView='+isView+'';
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
			    refresh_post_infoList();
		}
	});
}
function edit2post_infoList_click_696(isView,data){
	var selects = $("#post_infoList_List").bootstrapTable('getSelections');;
	if(selects!=null && selects.length>0){
		select = selects[0];;
		title='<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"岗位说明多页面")%>';
	}else if(data!=null&&isView!=null){
	select = data;
	title='<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"预览")%>';
	}else {
		alert('<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"请选择一行数据")%>');return ;
	}
	if(1==1){
		var url='/myehr/form/toForm.action?formId=4058&isInit=true&ORGJOB_jobid='+select.ORGJOB_jobid+'&&ORGJOB_jobcode='+select.ORGJOB_jobcode+'&&ORGJOB_cnname='+select.ORGJOB_cnname+'&&ORGJOB_jobstyle='+select.ORGJOB_jobstyle+'&&ORGJOB_jobgrade='+select.ORGJOB_jobgrade+'&&&isView='+isView+'';
	}else{
		var url='/myehr/form/toForm.action?formId=4058&isInit=true&ORGJOB_jobid='+ORGJOB_jobid+'&ORGJOB_jobcode='+ORGJOB_jobcode+'&ORGJOB_cnname='+ORGJOB_cnname+'&ORGJOB_jobstyle='+ORGJOB_jobstyle+'&ORGJOB_jobgrade='+ORGJOB_jobgrade+'&isView='+isView+'';
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
			    refresh_post_infoList();
		}
	});
}
var filterParam = {};
var queryParams;
function grid_post_infoList_fun(pageReqeust){
	var _filterdata={};
	if(document.getElementById('grid_post_infoList_filter')){
	if($("[id='FILTER_ORG_JOB.ORGJOB_jobcode_696']").attr('multiSelect')){
		var val = "";
		var arr = $("[id='FILTER_ORG_JOB.ORGJOB_jobcode_696']").val();
		if(arr==null){
		}else{
			for(var i=0;i<arr.length;i++){
				val+=arr[i]+',';
			}
			val = val.substring(0,val.length-1);
		}
		var ORGJOB_jobcode=val;
	}else if(($("[id='FILTER_ORG_JOB.ORGJOB_jobcode_696']").attr('styleType')=="select")||($("[id='FILTER_ORG_JOB.ORGJOB_jobcode_696']").attr('styleType')=="dateTime")){
			var ORGJOB_jobcode=$("[id='FILTER_ORG_JOB.ORGJOB_jobcode_696']").val();
		}else{
				var ORGJOB_jobcode=$("[id='FILTER_696']").val();
		}
	if($("[id='FILTER_ORG_JOB.ORGJOB_cnname_696']").attr('multiSelect')){
		var val = "";
		var arr = $("[id='FILTER_ORG_JOB.ORGJOB_cnname_696']").val();
		if(arr==null){
		}else{
			for(var i=0;i<arr.length;i++){
				val+=arr[i]+',';
			}
			val = val.substring(0,val.length-1);
		}
		var ORGJOB_cnname=val;
	}else if(($("[id='FILTER_ORG_JOB.ORGJOB_cnname_696']").attr('styleType')=="select")||($("[id='FILTER_ORG_JOB.ORGJOB_cnname_696']").attr('styleType')=="dateTime")){
			var ORGJOB_cnname=$("[id='FILTER_ORG_JOB.ORGJOB_cnname_696']").val();
		}else{
				var ORGJOB_cnname=$("[id='FILTER_696']").val();
		}
		_filterdata={ORGJOB_jobcode:ORGJOB_jobcode,ORGJOB_cnname:ORGJOB_cnname};
	}
	var paramsMap = {};
	var requestParam={};
		requestParam = {};
	pageReqeust.containerParam=containerParam_696;
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.userIds=getQueryString('empIds');
	pageReqeust.formId=_formId_696;
	pageReqeust.isView=null;
	if(heightGadedata_696!=null&&heightGadedata_696!=undefined){
		pageReqeust.heightGrade = heightGadedata_696;
	}
	queryParams = JSON.stringify(pageReqeust);
	return queryParams;
}
function grid_post_infoList_fun11_696(){
	$('#post_infoList_List').bootstrapTable('refresh');
}
function exportData(fieldArray,formId){
    exportData_696(fieldArray);
}
	function grid_post_infoList_HeighQuery_696() {
		layer.open({
			type: 2,
			showMaxButton: true,
			title:"<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"高级查询设置")%>" ,
			area: ['855', '500'],
			maxmin: true,
			content:'/myehr/jsp/form/button/heightGrade.jsp?formFunction=grid_post_infoList_fun11_696&formDefId=696&formDefLayout=2',
			success:function(layero,index){
				},
				end:function(){
			}
			});
	}
</script>
</body>
</html>
