<%@ page language="java" import="java.util.*" import="com.myehr.common.util.LangUtil" pageEncoding="UTF-8"%>
<%@ include file="/common/common.jsp" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<body>
<div class="container-fluid" style="height:100%;overflow-y:hidden;padding-top:10px;">
	<div class="input-group" style="padding-bottom:10px;width:100%;z-index: 5;">
	    <div id="grid_ORG_COMP_CARD_COPY2_filter">
	        <table class="cbs-table" style="width:100%">
	            <tr>
					<td style="float:right;padding-top:10px">
						<input id="FILTER_2606" name="FILTER_2606" placeholder="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"中文名称")%>" style="padding: 6px 30px 6px 10px;" title="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"中文名称")%>" type="text" class="form-control" oninput="grid_ORG_COMP_CARD_COPY2_fun11_2606()" />
						<i class="icon-search" style="position: absolute;right: 12px;top: 2px;cursor: pointer;"></i>
					</td>
	            </tr>
	        </table>
	    </div>
	</div>
	<div class="BTNGROUP BTNGROUP_2606" style="margin:5px auto; display:inline-block;height: 30px;z-index: 6;position: relative">
		<div style="margin-right:10px;display:inline-block">
		    <input type="button" id="remove1ORG_COMP_CARD_COPY2"  class="btn btn-danger" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"删除1")%> onclick="remove1ORG_COMP_CARD_COPY2_click_2606()"/>
		</div>
		<div style="margin-right:10px;display:inline-block">
		    <input type="button" id="remove2ORG_COMP_CARD_COPY2"  class="btn btn-danger" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"删除2")%> onclick="remove2ORG_COMP_CARD_COPY2_click_2606()"/>
		</div>
	</div>
	<table id="ORG_COMP_CARD_COPY2_List">
	</table>
	<div id="activity_pane" style="position:absolute;left:500px;top:70px">
	</div>
</div>
<script>
var heightGadedata =[];
var containerParam ={};
containerParam ={};
function changeHeightGadedata(data){
	heightGadedata = data;
}
$(function() {
    querys_2606();
$(".fixed-table-toolbar").css("margin-top","0px");
$(".container-fluid").css("max-height","100%");
$(".container-fluid").css("padding-left","0");
$(".fixed-table-container").css("height",$('body').height() -55 +"px");
$(".fixed-table-body").css("height","93%");
$(".input-group").css("padding-bottom","0px");

    initDict();
    initDate();
    console.log($(".BTNGROUP_2606>div").length);
    var DIVAMOUNT = 5;
    if($(".BTNGROUP_2606>div").length > DIVAMOUNT){
    	var len = $(".BTNGROUP_2606>div").length;
    	$(".BTNGROUP_2606>div:gt(4)").hide();
    	var selectObj = $('<div class="btn-group"><button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">更多 <span class="caret"></span></button><ul class="dropdown-menu" style="min-width:90px;left:-14px;"></ul></div>');
    	$(".BTNGROUP_2606").append(selectObj);
    	for(var i=DIVAMOUNT;i<len;i++){
    		var liObj = $('<li style="margin-left:14px;"></li>');
    		liObj.append($(".BTNGROUP_2606>div").eq(i).clone(true));
    		selectObj.find('.dropdown-menu').append(liObj);
    		selectObj.find('.dropdown-menu').append($('<li role="separator" class="divider"></li>'));
    	}
    	selectObj.find('.dropdown-menu div').show();
    }
});
var orgcode='';
function initFilterParam(data){
}
	var _formId_2606='2606';
    function querys_2606() {
        $("#ORG_COMP_CARD_COPY2_List").bootstrapTable({
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
            queryParams : grid_ORG_COMP_CARD_COPY2_fun,
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
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"ORGCOMPANY_compid\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"公司ID\">"+value+"</a>";
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
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"ORGCOMPANY_compcode\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"公司编码\">"+value+"</a>";
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
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"ORGCOMPANY_parentid\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"上级公司\" data-source=\"${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode1.action?deleteMark= data_form_38644&realValue="+value+"+\"></a>";
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
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"ORGCOMPANY_orggroup1\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"预留1\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"预留2")%>',
                field : 'ORGCOMPANY_orggroup2',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"ORGCOMPANY_orggroup2\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"预留2\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"预留3")%>',
                field : 'ORGCOMPANY_orggroup3',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"ORGCOMPANY_orggroup3\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"预留3\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"预留4")%>',
                field : 'ORGCOMPANY_orggroup4',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"ORGCOMPANY_orggroup4\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"预留4\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"预留5")%>',
                field : 'ORGCOMPANY_orggroup5',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"ORGCOMPANY_orggroup5\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"预留5\">"+value+"</a>";
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
                visible : false,
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
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"ORGCOMPANY_zuid\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"租户ID\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"组织码")%>',
                field : 'ORGCOMPANY_orgcode',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"ORGCOMPANY_orgcode\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"组织码\">"+value+"</a>";
                }
            },
            ],
            onClickRow: function (row, $element) {
                curRow = row;
            },
		onLoadSuccess: function (aa, bb, cc) {
                $("#ORG_COMP_CARD_COPY2_List a").editable({
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
        	editORG_COMP_CARD_COPY2_click_2606('isView',row);  
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
                    $('#ORG_COMP_CARD_COPY2_List').bootstrapTable(
                        'remove', {  
                            field: 'Id',  
                            values: [row.Id],  
                        }
                    );  
                    $('#ORG_COMP_CARD_COPY2_List').bootstrapTable(
                        'refresh',{
                            url:'${pageContext.request.contextPath }/dictType/findDictTypeList2.action'  
                        }
                    );
                }
            });
        }
    };
}
$(".BTNGROUP_2606").css("margin-top","-25px");
/** 刷新页面 */ 
function refresh_ORG_COMP_CARD_COPY2() { 
    $('#ORG_COMP_CARD_COPY2_List').bootstrapTable('refresh'); 
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
function remove1ORG_COMP_CARD_COPY2_click_2606(){
	var selects = $("#ORG_COMP_CARD_COPY2_List").bootstrapTable('getSelections');;
	if(selects!=null && selects.length>0){
		select = selects[0];
	}else {
		alert('<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"请选择数据")%>');return ;
	}
	var r=confirm("确定删除选中记录？");
	if (r==true){
		var _rowvalids = [];
		for(var i=0;i<selects.length;i++) {;
			if (selects[i].compid!="") {;
				_rowvalids.push(selects[i]);
			}
		}
		var  _param ={formId:_formId_2606,params:_rowvalids};
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
					refresh_ORG_COMP_CARD_COPY2();;
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
function remove2ORG_COMP_CARD_COPY2_click_2606(){
	var selects = $("#ORG_COMP_CARD_COPY2_List").bootstrapTable('getSelections');;
	if(selects!=null && selects.length>0){
		select = selects[0];
	}else {
		alert('<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"请选择数据")%>');return ;
	}
	var r=confirm("确定删除选中记录？");
	if (r==true){
		var _rowvalids = [];
		for(var i=0;i<selects.length;i++) {;
			if (selects[i].compid!="") {;
				_rowvalids.push(selects[i]);
			}
		}
		var  _param ={formId:_formId_2606,params:_rowvalids};
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
					refresh_ORG_COMP_CARD_COPY2();;
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
function grid_ORG_COMP_CARD_COPY2_fun(pageReqeust){
	var _filterdata={};
	if(document.getElementById('grid_ORG_COMP_CARD_COPY2_filter')){
	if($("[id='FILTER_ORG_COMPANY.ORGCOMPANY_cname_2606']").attr('multiSelect')){
		var val = "";
		var arr = $("[id='FILTER_ORG_COMPANY.ORGCOMPANY_cname_2606']").val();
		if(arr==null){
		}else{
			for(var i=0;i<arr.length;i++){
				val+=arr[i]+',';
			}
			val = val.substring(0,val.length-1);
		}
		var ORGCOMPANY_cname=val;
	}else if(($("[id='FILTER_ORG_COMPANY.ORGCOMPANY_cname_2606']").attr('styleType')=="select")||($("[id='FILTER_ORG_COMPANY.ORGCOMPANY_cname_2606']").attr('styleType')=="dateTime")){
			var ORGCOMPANY_cname=$("[id='FILTER_ORG_COMPANY.ORGCOMPANY_cname_2606']").val();
		}else{
				var ORGCOMPANY_cname=$("[id='FILTER_2606']").val();
		}
		_filterdata={ORGCOMPANY_cname:ORGCOMPANY_cname};
	}
	var paramsMap = {};
	var requestParam={};
	if('${param.orgcode}'==''){
		if(orgcode==undefined){
			requestParam = {orgcode:'${param.orgcode}'};
		}else{
			requestParam = {orgcode:orgcode+""};
		}
	}else{
		requestParam = {orgcode:'${param.orgcode}'};
	}
	pageReqeust.containerParam=containerParam;
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.userIds='${param.empIds}';
	pageReqeust.formId=_formId_2606;
	pageReqeust.isView=null;
	if(heightGadedata!=null&&heightGadedata!=undefined){
		pageReqeust.heightGrade = heightGadedata;
	}
	queryParams = JSON.stringify(pageReqeust);
	return queryParams;
}
function grid_ORG_COMP_CARD_COPY2_fun11_2606(){
	$('#ORG_COMP_CARD_COPY2_List').bootstrapTable('refresh');
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
	function grid_ORG_COMP_CARD_COPY2_HeighQuery_2606() {
		layer.open({
			type: 2,
			showMaxButton: true,
			title:"<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"高级查询设置")%>" ,
			area: ['855', '500'],
			maxmin: true,
			content:'/myehr/jsp/form/button/heightGrade.jsp?formFunction=grid_ORG_COMP_CARD_COPY2_fun11_2606&formDefId=2606&formDefLayout=2',
			success:function(layero,index){
				},
				end:function(){
			}
			});
	}
	//关闭
	function closex_2606(){ 
			    var index = parent.layer.getFrameIndex(window.name); //获取当前窗体索引
			    parent.layer.close(index);//执行关闭
	}
</script>
</body>
</html>
