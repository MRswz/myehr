<%@ page language="java" import="java.util.*" import="com.myehr.common.util.LangUtil" pageEncoding="UTF-8"%>
<%@ include file="/common/common.jsp" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<body>
<div class="container-fluid">
	<div style="margin-top:20px;">
		<div style="margin:0 auto">
			<div style="margin-right:10px;display:inline-block">
			    <input type="button" id="addorg_list"  class="btn btn-primary" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"增加")%> onclick="addorg_list_click_55()"/>
			</div>
			<div style="margin-right:10px;display:inline-block">
			    <input type="button" id="editorg_list"  class="btn btn-primary" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"修改")%> onclick="editorg_list_click_55()"/>
			</div>
			<div style="margin-right:10px;display:inline-block">
			    <input type="button" id="saveorg_list"  class="btn btn-primary" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"保存")%> onclick="saveorg_list_click_55()"/>
			</div>
			<div style="margin-right:10px;display:inline-block">
			    <input type="button" id="removeorg_list"  class="btn btn-primary" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"删除")%> onclick="removeorg_list_click_55()"/>
			</div>
			<div style="margin-right:10px;display:inline-block;position:relative">
			    <input type="button" id="searchorg_list"  class="btn btn-primary" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"查询")%> onclick="searchorg_list_click_55()"/>				
			</div>
			<div id="grid_org_list_filter" style="margin-right:10px;display:inline-block">
			    <input id="FILTER_DEPTCODE.DEPTCODE04_55" name="DEPTCODE04" placeholder="部门名称,部门代码,部门级别,部门属性" type="text" class="form-control" oninput="grid_org_list_fun11()" />
			</div>
		</div>
</div>
<table id="org_list_List">
</table>
</div>
<script>
$(function() {
    querys_55();
    initDict();
    initDate();
});
	var _formId_55='55';
    function querys_55() {
        $("#org_list_List").bootstrapTable({
            url :'${pageContext.request.contextPath }/form/cardformInitData.action',
            contentType: 'application/json;charset=utf-8',
            dataType:'json',
            method:'post',
            height : '700',
            undefinedText : '-',
            pagination : true,
            striped : true,
            queryParams : grid_org_list_fun,
            cache : false,
            pageSize : 10, 
            pageList : [10,20,50,100], 
            toolbar : "#toolbar",
            showColumns : true,
            showExport : true,
            clickToSelect: true,
            showRefresh : true,
            sidePagination : "server",
            columns : [{
                field : 'state',
                checkbox : true,
                align : 'center',
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
                    return "<a href=\"#\" style=\"font-size:14px;text-decoration:none;color:black;width:50px;\" name=\"defaultXH\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"序号\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"序号")%>',
                field : 'xh',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                    return "<a href=\"#\" class=\"eli w100\" style=\"font-size:14px;text-decoration:none;color:black;width:50px;\" name=\"xh\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"序号\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"部门名称")%>',
                field : 'CONTENT',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                    return "<a href=\"#\" class=\"eli w100\" style=\"font-size:14px;text-decoration:none;color:black;width:200px;\" name=\"CONTENT\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"部门名称\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"设立日期")%>',
                field : 'CREATEDATE',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    var date = "-";
                    if(value!=null){
                        date = new Date(value+360000).Format("yyyy-MM-dd");
                    }
                    return "<a href=\"#\" class=\"eli w100\" style=\"font-size:14px;text-decoration:none;color:black;width:100px\" name=\"CREATEDATE\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"设立日期\">"+date+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"部门代码")%>',
                field : 'DEPT_CODE',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                    return "<a href=\"#\" class=\"eli w100\" style=\"font-size:14px;text-decoration:none;color:black;width:200px;\" name=\"DEPT_CODE\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"部门代码\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"部门ID")%>',
                field : 'DEPT_ID',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                    return "<a href=\"#\" class=\"eli w100\" style=\"font-size:14px;text-decoration:none;color:black;width:100px;\" name=\"DEPT_ID\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"部门ID\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"部门级别")%>',
                field : 'DEPTCODE01',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                    return "<a href=\"#\" class=\"eli w100\" style=\"font-size:14px;text-decoration:none;color:black;width:100px;\" name=\"DEPTCODE01\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"部门级别\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"部门属性")%>',
                field : 'DEPTCODE04',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                    return "<a href=\"#\" class=\"eli w100\" style=\"font-size:14px;text-decoration:none;color:black;width:100px;\" name=\"DEPTCODE04\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"部门属性\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"虚拟组织")%>',
                field : 'DEPTDUMMY',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                    return "<a href=\"#\" class=\"eli w100\" style=\"font-size:14px;text-decoration:none;color:black;width:100px;\" name=\"DEPTDUMMY\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"虚拟组织\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"部门编制")%>',
                field : 'DEPTNUM',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                    return "<a href=\"#\" class=\"eli w100\" style=\"font-size:14px;text-decoration:none;color:black;width:100px;\" name=\"DEPTNUM\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"部门编制\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"END_MARK")%>',
                field : 'END_MARK',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                    return "<a href=\"#\" class=\"eli w100\" style=\"font-size:14px;text-decoration:none;color:black;width:100px;\" name=\"END_MARK\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"END_MARK\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"全称")%>',
                field : 'FULL_NAME',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                    return "<a href=\"#\" class=\"eli w100\" style=\"font-size:14px;text-decoration:none;color:black;width:200px;\" name=\"FULL_NAME\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"全称\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"级别")%>',
                field : 'GRADE',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                    return "<a href=\"#\" class=\"eli w100\" style=\"font-size:14px;text-decoration:none;color:black;width:100px;\" name=\"GRADE\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"级别\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"独立公司")%>',
                field : 'INDEPEND',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                    return "<a href=\"#\" class=\"eli w100\" style=\"font-size:14px;text-decoration:none;color:black;width:100px;\" name=\"INDEPEND\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"独立公司\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"机构代码")%>',
                field : 'ORGANCODE',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                    return "<a href=\"#\" class=\"eli w100\" style=\"font-size:14px;text-decoration:none;color:black;width:100px;\" name=\"ORGANCODE\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"机构代码\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"上级部门")%>',
                field : 'PARENT',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                    return "<a href=\"#\" class=\"eli w100\" style=\"font-size:14px;text-decoration:none;color:black;width:200px;\" name=\"PARENT\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"上级部门\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"删除标识")%>',
                field : 'ORG_DEL',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                    return "<a href=\"#\" class=\"eli w100\" style=\"font-size:14px;text-decoration:none;color:black;width:100px;\" name=\"ORG_DEL\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"删除标识\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"上级机构ID")%>',
                field : 'PARENT_ID',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                    return "<a href=\"#\" class=\"eli w100\" style=\"font-size:14px;text-decoration:none;color:black;width:100px;\" name=\"PARENT_ID\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"上级机构ID\">"+value+"</a>";
                }
            },
            ],
            onClickRow: function (row, $element) {
                curRow = row;
                $('#org_list_List').bootstrapTable('uncheckAll');
                $element[0].click();
            },
		onLoadSuccess: function (aa, bb, cc) {
                $("#org_list_List a").editable({
                    disabled: true,
                    emptytext: "-",
                    url: function (params) {
                        var sName = $(this).attr("name");
                        curRow[sName] = params.value;
                    },
                    type: 'text'
                });
            },
            data:[{id:1,liushuiid:2},{id:1,liushuiid:2}],
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
                    $('#org_list_List').bootstrapTable(
                        'remove', {  
                            field: 'Id',  
                            values: [row.Id],  
                        }
                    );  
                    $('#org_list_List').bootstrapTable(
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
function refresh_org_list() { 
    $('#org_list_List').bootstrapTable('refresh'); 
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
function addorg_list_click_55(){
;
	if('${param.DEPT_CODE}'!='' ||'${param.DEPT_ID}'!='' ){
		var url='/myehr/form/toForm.action?formId=468&DEPT_CODE=${param.DEPT_CODE}&DEPT_ID=${param.DEPT_ID}&';
	}else{
		var url='/myehr/form/toForm.action?formId=468&DEPT_CODE='+DEPT_CODE+'&DEPT_ID='+DEPT_ID+'';
	}
	layer.open({
		type: 2,
		title:'<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"机构新增")%>',
		shadeClose: true,
		shade: 0.8,
		offset: ['0px', '0px'],
		area: ['1000', '500'],
		content: url,
		success:function(layero,index){
		},
		end:function(){
			    refresh_org_list();
		}
	});
}
function editorg_list_click_55(){
;
	var selects = $("#org_list_List").bootstrapTable('getSelections');;
	if(selects!=null && selects.length>0){
		select = selects[0];
	}else {
		alert('<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"请选择一行数据")%>');return ;
	}
	if(1==1){
		var url='/myehr/form/toForm.action?formId=469&isInit=true&DEPT_ID='+select.DEPT_ID+'&';
	}else{
		var url='/myehr/form/toForm.action?formId=469&isInit=true&DEPT_ID='+DEPT_ID+'';
	}
	layer.open({
		type: 2,
		title:'<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"机构编辑")%>',
		shadeClose: true,
		shade: 0.8,
		offset: ['0px', '0px'],
		area: ['1000', '500'],
		content: url,
		success:function(layero,index){
		},
		end:function(){
			    refresh_org_list();
		}
	});
}
function saveorg_list_click(){
	var columnDataRows = grid_org_list.getSelecteds();//if(columnDataRows.length==0){return;}
;
	var paramsMap = {};
;
	grid_org_list.validate();
	if(grid_org_list.isValid() == false) {
		var error = grid_org_list.getCellErrors()[0];
		grid_org_list.beginEditCell(error.record, error.column);
		return;
	}
	 var changeData = grid_org_list.getChanges();
	if(changeData==null||changeData.length==0) return;
	var  _param ={formId:_formId_org_list,datas:changeData,paramsMap:paramsMap};
	_param.buttonId=496;
	dcf.mask();
	$.ajax({
		url:'com.dcf.form.runtime.gridformButton.saveDatas.biz.ext',
		type:'post',
		data: nui.encode(_param),
		cache: false,
		contentType: 'text/json',
		success: function (text) {
			dcf.unmask();
			if(!text.recode||text.recode[0]=='error'){
				nui.alert(text.recode[1]);
			} else {
				grid_org_list.reload();
				if(window.parent._loadmstmaindata){;
					window.parent._loadmstmaindata();
				};
;
				if("undefined" != typeof mstTab_activechanged ){
					mstTab_activechanged();
				}
				;
			}
		},
		error: function (jqXHR, textStatus, errorThrown) {
		}
	});
}
function removeorg_list_click_55(){
	var selects = $("#org_list_List").bootstrapTable('getSelections');;
	if(selects!=null && selects.length>0){
		select = selects[0];
	}else {
		alert('<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"请选择数据")%>');return ;
	}
	var r=confirm("确定删除选中记录？");
	if (r==true){
		var _rowvalids = [];
		for(var i=0;i<selects.length;i++) {;
			if (selects[i].DEPT_ID!="") {;
				_rowvalids.push(selects[i]);
			}
		}
		var  _param ={formId:_formId_55,params:_rowvalids};
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
					refresh_org_list();;
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
function grid_org_list_fun(pageReqeust){
	var _filterdata={};
	if(document.getElementById('grid_org_list_filter')){
	/* if($("[id='FILTER_DEPTCODE.CONTENT_55']").attr('multiSelect')){
		var val = "";
		var arr = $("[id='FILTER_DEPTCODE.CONTENT_55']").val();
		if(arr==null){
		}else{
			for(var i=0;i<arr.length;i++){
				val+=arr[i]+',';
			}
			val = val.substring(0,val.length-1);
		}
		var A0191=val;
	}else{
		var CONTENT=$("[id='FILTER_DEPTCODE.CONTENT_55']").val();
	}
	if($("[id='FILTER_DEPTCODE.DEPT_CODE_55']").attr('multiSelect')){
		var val = "";
		var arr = $("[id='FILTER_DEPTCODE.DEPT_CODE_55']").val();
		if(arr==null){
		}else{
			for(var i=0;i<arr.length;i++){
				val+=arr[i]+',';
			}
			val = val.substring(0,val.length-1);
		}
		var A0191=val;
	}else{
		var DEPT_CODE=$("[id='FILTER_DEPTCODE.DEPT_CODE_55']").val();
	}
	if($("[id='FILTER_DEPTCODE.DEPTCODE01_55']").attr('multiSelect')){
		var val = "";
		var arr = $("[id='FILTER_DEPTCODE.DEPTCODE01_55']").val();
		if(arr==null){
		}else{
			for(var i=0;i<arr.length;i++){
				val+=arr[i]+',';
			}
			val = val.substring(0,val.length-1);
		}
		var A0191=val;
	}else{
		var DEPTCODE01=$("[id='FILTER_DEPTCODE.DEPTCODE01_55']").val();
	} */
	if($("[id='FILTER_DEPTCODE.DEPTCODE04_55']").attr('multiSelect')){
		var val = "";
		var arr = $("[id='FILTER_DEPTCODE.DEPTCODE04_55']").val();
		if(arr==null){
		}else{
			for(var i=0;i<arr.length;i++){
				val+=arr[i]+',';
			}
			val = val.substring(0,val.length-1);
		}
		var A0191=val;
	}else{
		var DEPTCODE04=$("[id='FILTER_DEPTCODE.DEPTCODE04_55']").val();
	}
		_filterdata={DEPTCODE04:DEPTCODE04};
	}
	var paramsMap = {		's_userId' : '1'};
	var requestParam={};
	if('${param.DEPT_CODE}'==''){
		requestParam = {DEPT_CODE:DEPT_CODE+""};
	}else{
		requestParam = {DEPT_CODE:'${param.DEPT_CODE}'};
	}
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.formId=_formId_55;
	pageReqeust.isView=null;
	return JSON.stringify(pageReqeust);
}
function grid_org_list_fun11(){
	$('#org_list_List').bootstrapTable('refresh');
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
        parame.placeholder="";
        parame.jsonParam.dictTypeCode=$(classes[i]).attr('DictName');
		  if(type=="true"){
		  	myehr_initSelectMore(parame);
		  }else{
	        myehr_initSelect(parame);
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
			$('.form_date4').datetimepicker({ 
			 language:  'zh-CN',  
			 format:"yyyy-mm-dd",  
			 weekStart: 1,  
			 todayBtn:  1,  
			 autoclose: 1,  
			 todayHighlight: 1,  
			 startView: 4,  
			 minView: 4,  
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

/* function searchorg_list_click_55(){
	//$("#search").attr("style","display:true;position:absolute;top:0;z-index:10000");
	$("#search").css("display","true");
	$("#search").css("z-index","10000");
	$("#search").css("background-color","ffffff");
	$("#search").css("border","1px solid #000");
}

 	$("#searchorg_list").mouseover(function(){
  	//$("#search").css("display","true");
  	$("#search").show();
	$("#search").css("background-color","ffffff");
	$("#search").css("border","1px solid #000");
}); 



$("#search").mouseleave(function(){
	//setTimeout(function () {$("#search").css("display","none");$("#search").css("z-index","-10000");}, 6000);
	//setTimeout(function () {$("#search").hide();}, 6000);
	$("#search").css("display","none");
	//$('#search').delay(6000).hide(0);
});

var _move=false;//移动标记
var _x,_y;//鼠标离控件左上角的相对位置
$(document).ready(function(){
$("#search").click(function(){
//alert("click");//点击（松开后触发）
}).mousedown(function(e){
_move=true;
_x=e.pageX-parseInt($("#search").css("left"));
_y=e.pageY-parseInt($("#search").css("top"));
$("#search").fadeTo(20, 0.35);//点击后开始拖动并透明显示
});
$(document).mousemove(function(e){
if(_move){
var x=e.pageX-_x;//移动时根据鼠标位置计算控件左上角的绝对位置
var y=e.pageY-_y;
$("#search").css({top:y,left:x});//控件新位置
}
}).mouseup(function(){
_move=false;
$("#search").fadeTo("fast", 1);//松开鼠标后停止移动并恢复成不透明
});
}); */

</script>
</body>
</html>
