<%@ page language="java" import="java.util.*" import="com.myehr.common.util.LangUtil" pageEncoding="UTF-8"%>
<%@ include file="/common/common.jsp" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<style>
#columnList>tbody>tr>td,#tableListStep4>tbody>tr>td{padding:3px 6px;}
#columnList>tbody>tr>td input,#tableListStep4>tbody>tr>td input{border:0;}
#columnList>tbody>tr>td select,#tableListStep4>tbody>tr>td select{border:0;}
#columnList .form-control{height:20px;}
.row.cell>div{margin:5px 0;min-height:0;}
</style>
<link rel="stylesheet" href="bootstrap2/bootstrap-switch.min.css" type="text/css"></link>
<script type="text/javascript" src="bootstrap2/bootstrap-switch.min.js"></script></head>
<body>
<form id="form_1881" name="form_1881" >
<div class="" style="width:100%;height:100%;background-color:#f6f6f6">
	<div style="width:98%;height:98%;margin:0 auto;padding-top:10px">
		<div class="form-control" style="width:100%;height:100%;border:0">		
			<div class="" style="height:100%;overflow-y:hidden;padding:10px 0;">
				<table>
					<tr>
						<td>
							<div class="BTNGROUP_55" style="margin:0 auto; display:block;height: 35px;">
								<div style="margin-right:10px;display:inline-block">
									<input type="button" id="addColumn"  class="btn btn-primary" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"增加")%> onclick="addRow()"/>
								</div>
								<div style="margin-right:10px;display:inline-block">
									<input type="button" id="save_list"  class="btn btn-warning" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"保存")%> onclick="saveDataStep4()"/>
								</div>
							</div>
						</td>
						<td style="padding-left:10px;"  width="10%"  ><lable><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"每行字段数")%>: </lable></td>
						<td style="padding-left:10px;"  align="left" width="10%" >
							<input id="SYS_SYSTEM_SCHEME.gridFilterRowCount" name="gridFilterRowCount" type="text" class="form-control"  vtype="illegalChar;maxLength:null;minLength:null;" style="width:200px;"/>
							<input id="SYS_SYSTEM_SCHEME.gridFilterId" name="gridFilterId" type="hidden" class="form-control"  style="width:200px;"/>
							<input id="SYS_SYSTEM_SCHEME.gridFilterFormDefId" name="gridFilterFormDefId" type="hidden" class="form-control"  style="width:200px;"/>
						</td>
						<td style="padding-left:10px;"  width="10%"  ><lable><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"Label宽度")%>: </lable></td>
						<td style="padding-left:10px;"  align="left" width="10%" >
							<input id="SYS_SYSTEM_SCHEME.gridFilterLableWidth" name="gridFilterLableWidth" type="text" class="form-control"  vtype="illegalChar;maxLength:null;minLength:null;" style="width:200px;"/>
						</td>
						<td style="padding-left:10px;"  width="10%"  ><lable><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"是否支持高级查询")%>: </lable></td>
						<td style="padding-left:10px;"  align="left" width="10%" >
							<input  id="SYS_SYSTEM_SCHEME.gridFilterHeightGrade"  name="gridFilterHeightGrade" type="checkbox" value="1"/>
						</td>
					</tr>
				</table>
				<table id="tableListStep4">
				</table>
			</div>
		</div>
		<div style="width:100%;height:2%;float:left">
		</div>
	</div>
</div>
</form>   
<script>
var formId = ${param.formDefId};
var numRow=0;	
var num=0;	
var xxx="";
var checked1 = "";
var checked2 = "";
var checked3 = "";
var checked4 = "";
var rowsNum=0;
$(function() {
	//初始化模板
	initTemplate();
	query_tableStep4();//初始化实体
	$(".fixed-table-body").css("height","84%");
	$(".no-records-found").css("display","none");
	
})

function initTemplate(){
	//getSql();
}

function query_tableStep4() {   
    $("#tableListStep4").bootstrapTable({  
        url : '${pageContext.request.contextPath }/form/queryFilterColumn.action?formId='+formId, 
		height:'800',
        queryParams :'',
        undefinedText : '-',  
        striped : true, // 是否显示行间隔色  
        cache : false, // 是否使用缓存  
        clickToSelect: true,
        pagination : false,        
        uniqueId : "templateColumnId", // 每一行的唯一标识  
        sidePagination : "server", // 服务端处理分页  
        columns : [ 
		{  
            title : '操作',  
            field : 'queryColumnId', // 字段  
            align: 'center',
            valign: 'middle',
            width:50,
            formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<div style=\"position:relative\"><input type=\"form-control\" name=\"queryColumnId\" style=\"width:0px;padding:0px\" readonly=true data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"操作\" value=\""+value+"\"/>"+
					   "<input type=\"hidden\" data-title=\"关联字段ID\" value=\""+row.gridColumnId+"\"/>"+
            		   "<i class=\"glyphicon glyphicon-remove\" style=\"position: absolute;opacity: 0.5;right: 5px;top: 5px;cursor: pointer;\" onclick=\"removeStep4(this)\"></i><div>" ;
        	}
		},{
			
            title : '实体表名',  
            field : 'formEntityTablename', // 字段  
            align: 'center',
            valign: 'middle',
            width:150,
            formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<div style=\"position:relative\"><input class=\"form-control\" name=\"formEntityTablename\" style=\"padding:0 24px 0 12px;\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"实体表名\" value=\""+value+"\"/>" ;
        	}
        },{  
            title : '字段名称',  
            field : 'formFieldTablename', // 字段  
            align: 'center',
            valign: 'middle',
            width:175,
            formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<div style=\"position:relative\"><input class=\"form-control\" name=\"formFieldTablename\" style=\"padding:0 24px 0 12px;\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"字段名称\" value=\""+value+"\"/>" ;
        	}
		 },{  
            title : '字段显示名称',  
            field : 'gridColumnLable', // 字段  
            align: 'center',
            valign: 'middle',
            width:175,
            formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<div style=\"position:relative\"><input class=\"form-control\" name=\"gridColumnLable\" style=\"padding:0 24px 0 12px;\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"字段显示名称\" value=\""+value+"\"/>" ;
        	}
        }, {  
            title : '控件类型',  
            field : 'formColumnGuiType',  
            align : 'center',  
            valign : 'middle', 
			width:200,
			formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<select id=\"formColumnGuiType"+index+"\" name=\"formColumnGuiType\" DictName=\"SYS_FORM_GUI_TYPE\" dataField=\"\" data-type=\"text\" data-pk=\""+row.Id+"\"  data-title=\"控件类型\" value=\""+value+"\"/>" ;
        	}
        }, {  
            title : '查询规则',  
            field : 'gridColumnFilterRule',  
            align : 'center',  
            valign : 'middle',  
            width:200,
            formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<select id=\"gridColumnFilterRule"+index+"\" class=\"form-control\"  name=\"gridColumnFilterRule\" DictName=\"SYS_FORM_WHERE_RULE\" dataField=\"\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"查询规则\" value=\""+value+"\"></selcct>" ;
        	}
        }, {  
            title : '显示宽度',  
            field : 'gridColumnWidth',  
            align : 'center',  
            valign : 'middle', 
            width:200,
            formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<input class=\"form-control\"  name=\"gridColumnWidth\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"显示宽度\" value=\""+value+"\"/>";
        	}
		 }, {  
            title : '跨字段数',  
            field : 'gridColumnColSpan',  
            align : 'center',  
            valign : 'middle', 
            width:200,
            formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<input class=\"form-control\"  name=\"gridColumnColSpan\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"跨字段数\" value=\""+value+"\"/>";
        	}
        }, {  
            title : '是否区间查询',  
            field : 'gridColumnIsIntervais',  
            align : 'center',  
            valign : 'middle', 
            width:200,
            formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<select id=\"gridColumnIsIntervais"+index+"\" class=\"form-control\"  name=\"gridColumnIsIntervais\" DictName=\"SYS_COMMON_YES_NO\" dataField=\"\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"是否区间查询\" value=\""+value+"\"/>" ;
        	}
        }, {  
            title : '显示顺序',  
            field : 'formColumnSort',  
            align : 'center',  
            valign : 'middle',
            width:150,
            formatter: function (value, row, index) {
            	if(value==undefined){
		        		value = "";
		        	}
            	return "<input class=\"form-control\"  name=\"formColumnSort\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"显示顺序\" value=\""+value+"\"/>" ;
        	}
        }],
        onClickRow: function (row, $element) {
	                curRow = row;
	                
	            },
	            onLoadSuccess: function (aa, bb, cc) {
	                addListSelect();
	            },
	            data:[],       
        responseHandler : function(res) { 
        	rowsNum = res.total;
            return {  
                total : res.total,  
                rows : res.rows  
            };  
        }, 
    });
}

function deletexx(Index,obj){
	if(Index!=0){
		$(obj).parent().parent().removeStep4();
	}
}
function addRow(insertIndex){
	var gridFilterId = document.getElementById("SYS_SYSTEM_SCHEME.gridFilterId").value;
	var url = '/myehr/jsp/form/formcreate/formFilterColumnList.jsp?formId='+${param.formDefId}+'&gridFilterId='+gridFilterId;
	parent.layer.open({
		type: 2,
		title:'<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"选择表单")%>',
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
			$('#tableListStep4').bootstrapTable('refresh');
		}
	});
}

var objx;
function chooseEntity(obj){
	objx = obj;
	saveDataStep4();
	addRow();
}

function removeStep4(obj){
	var data = {};
	data.queryColumnId = $(obj).parent().parent().parent().find("input").eq(0).val();
	$.ajax({
		url:'${pageContext.request.contextPath }/form/deleteFilterColumn.action',
		type:'post',
		cache: false,
		data:JSON.stringify(data),
		contentType: 'application/json;charset=utf-8',
		async: false,
		success: function (data) {
			$('#tableListStep4').bootstrapTable('refresh');
		}
	});
}

//将对象元素转换成字符串以作比较  
function obj2key(obj,keys){  
    var n = keys.length,  
        key = [];  
    while(n--){  
        key.push(obj[keys[n]]);  
    }  
    return key.join('|');  
}

function saveDataStep4(){
	var saveDate = getEntityDataStep4();
	if(saveDate[0].gridColumnLable==undefined){
		alert("请添加查询字段");
		return;
	}
	var param = {};
	param.columns= saveDate;
	$.ajax({
		url:'${pageContext.request.contextPath }/form/saveFilterColumnData.action?formId='+formId,
		type:'post',
		cache: false,
		contentType: 'application/json;charset=utf-8',
		data:JSON.stringify(param),
		async: false,
		success: function (data) {
			if(data[0]=="0"){
				$('#tableListStep4').bootstrapTable('refresh');
			}
		}
	});
	
}

function getEntityDataStep4(){
	var i = 0;
	var data = [];
	var gridFilterId = document.getElementById("SYS_SYSTEM_SCHEME.gridFilterId").value;
	$("#tableListStep4>tbody").find("tr").each(function(){
		if($(this).find("select").eq(0).val()!=""){
			var table = {};
			table.queryColumnId=$(this).find("input").eq(0).val();
			table.gridColumnId=$(this).find("input").eq(1).val();
			table.gridColumnLable=$(this).find("input").eq(4).val();
			table.gridColumnFilterRule=$(this).find("select").eq(1).val();
			table.gridColumnWidth=$(this).find("input").eq(5).val();
			table.gridColumnColSpan=$(this).find("input").eq(6).val();
			table.gridColumnIsIntervais=$(this).find("select").eq(2).val();
			table.formColumnSort=$(this).find("input").eq(7).val();
			table.gridColumnFilterId =gridFilterId;
			data[i] = table;
			i++;
		}
	})
	return data;
}

function addListSelect(){
	var classes = [];
	if(''=='APP'){
		$("input").each(function(){
			if($(this).attr('dataField') != undefined){
				classes.push($(this)[0]);
			}
		})
	}else{
		classes = $("select");
	}
	for(var i=0;i<classes.length;i++){
		parame.id=classes[i].id;
		var type=$(classes[i]).attr('multiSelect');
		var dataField=$(classes[i]).attr('dataField');
		dataField = dataField+"|"+${param.formDefId};
		parame.placeholder="";
		parame.value=$(classes[i]).attr('value');
		parame.jsonParam.dictTypeCode=$(classes[i]).attr('DictName');
		if(type=="true"){
			myehr_initSelectMore(parame,dataField);
		}else{
			myehr_initSelect(parame,dataField);
		}
	}
}

var parame={
		id:'',
		value:"N",
		width: "100px",  
		height:"45px",
		url:'/myehr/dict/searchSysDictEntryTypeCode.action?userId=1',
		jsonParam:{},
		formType:'',
		chang:function (e){
			var aaa = e;
		}
};
window.onload=function(){
	var containerParam={};
	var classes = [];
	if(''=='APP'){
		$("input").each(function(){
			if($(this).attr('dataField') != undefined){
				classes.push($(this)[0]);
			}
		})
	}else{
		classes = $("select");
	}
	for(var i=0;i<classes.length;i++){
		parame.id=classes[i].id;
		var type=$(classes[i]).attr('multiSelect');
		var dataField=$(classes[i]).attr('dataField');
		dataField = dataField+"|"+${param.formDefId};
		parame.placeholder="";
		parame.value=$(classes[i]).attr('value');
		parame.jsonParam.dictTypeCode=$(classes[i]).attr('DictName');
		if(type=="true"){
			myehr_initSelectMore(parame,dataField);
		}else{
			myehr_initSelect(parame,dataField,containerParam);
		}
	}
	document.getElementById("SYS_SYSTEM_SCHEME.gridFilterFormDefId").value="${param.formDefId}";
	var formId = '${param.formDefId}';
	if(formId==undefined || formId=='' ){
		formId = '${param.formDefId}';
	}
	
	if(formId!='' && formId!=null){
		_initDataStep4(formId);
	}

}

$(function () {  
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
});

	function _initDataStep4(pkId){
		var formId = '${param.formDefId}';
		if(formId==undefined || formId=='' ){
			formId = '${param.formDefId}';
		}
		
		var _form = getForm("#form_1881");
		var _Type = getType("#form_1881");
		$.ajax({
			url:'${pageContext.request.contextPath }/form/queryGridFilterByFormId.action?formId='+formId,
			type:'post',
			//data: JSON.stringify(_param),
			cache: false,
			contentType: 'application/json;charset=utf-8',
			success: function (text) {
				if(text !=null){
					var object = text;
					for(var key in object){
						if(_form[key]!=null&&_form[key]!="undefined"){
							if(key=='gridFilterHeightGrade'){
								if(object[key]=="true"){
									document.getElementById(_form[key]).checked=true;
								}
							}else if(_Type[key]=="dateTime"){
								date = new Date(object[key]).Format("yyyy-MM-dd hh:mm:ss");
								document.getElementById(_form[key]).value=formatDatebox(date,_form[key]);
							}else{
								document.getElementById(_form[key]).value=object[key];
							}
						}
					};
				}
			},
			error: function (jqXHR, textStatus, errorThrown) {
			}
		});
	}

	$(":checkbox").click(function() {
		if ($(this).is(":checked")) {
			this.value="true";
		} else {
			this.value="false";
		}
	});

	function getForm(formId){
		var object=[];
		$(formId).find("input").each(function(){
			var xxx = this.id.split(".")[1];
			if(xxx!=undefined){
				var xx = xxx.split("_");
				var arr = [];
				var id = "";
				for(var i=0;i<xx.length;i++){
					if(i<xx.length-1){
						id = id+xx[i]+"_";
					}else{
						id = id+xx[i];
					}
				}
				object[id]=this.id;
			}
		})
		$(formId).find("select").each(function(){
			var xxx = this.id.split(".")[1];
			if(xxx!=undefined){
				var xx = xxx.split("_");
				var arr = [];
				var id = "";
				for(var i=0;i<xx.length;i++){
					if(i<xx.length-1){
						id = id+xx[i]+"_";
					}else{
						id = id+xx[i];
					}
				}
				object[id]=this.id;
			}
		})
		$(formId).find("textarea").each(function(){
			var xxx = this.id.split(".")[1];
			if(xxx!=undefined){
				var xx = xxx.split("_");
				var arr = [];
				var id = "";
				for(var i=0;i<xx.length;i++){
					if(i<xx.length-1){
						id = id+xx[i]+"_";
					}else{
						id = id+xx[i];
					}
				}
				object[id]=this.id;
			}
		})
		return object;
	}
	function getType(formId){
		var object=[];
			$(formId).find("input").each(function(){
				var vtype = $(this).attr('format');
				if(vtype!=undefined){
					var xxx = this.id.split(".")[1];
						var xx = xxx.split("_");
						var arr = [];
						var id = "";
						for(var i=0;i<xx.length;i++){
							if(i<xx.length-1){
								id = id+xx[i]+"_";
							}else{
								id = id+xx[i];
							}
						}
					object[id]="dateTime";
				}
			})
		return object;
	}
	
	function getdata_1881(buttonId,formId){
		var param = {};
		var data = {buttonId:buttonId,formId:formId,param:{},paramsMap:{}};
		$.map($('[name=form_'+formId+']').serializeArray(), function(item, index){
			var property =item['name'];
			var value = item['value'];
			param[property] = value;
		});
		data.param = param;
		return data;
	}
	function formatDatebox(value,key) {
			var type = document.getElementById(key).getAttribute("dateType");
			type = type.substr(type.length-1,1);
		    var year=value.substr(0,4);
		    var index1=value.indexOf("-");
		    var index2=value.lastIndexOf("-");
		    var d1=parseInt(index2)-(parseInt(index1)+1);
		    var month=value.substr((parseInt(index1)+1),d1);
		    var kg=value.indexOf(" ");
		    d2=parseInt(kg)-parseInt(index2);
		    var day=value.substr(parseInt(index2)+1,d2);
		    var mh=value.indexOf(":");
		    d3=parseInt(mh)-(parseInt(kg)+1);
		    var hh=value.substr(parseInt(kg)+1,d3);
		    var mh2=value.lastIndexOf(":");
		    d4=parseInt(mh2)-(parseInt(mh)+1);
		    var mm=value.substr(parseInt(mh)+1,d4);
		    if(mm!=0){
		    	mm = parseInt(mm)+6;
		    	if(parseInt(mm)<10){
		    		mm = "0"+mm;
		    	}else if(parseInt(mm)==60){
		    		mm="00";
		    		hh=parseInt(hh)+1;
		    		}else if(parseInt(mm)>60){
		    			mm=parseInt(mm)-60;
		    			mm="0"+mm;
		    			hh=parseInt(hh)+1;
		    			}
		    }
		    var mh2=value.lastIndexOf(":");
		    var ss=value.substr(parseInt(mh2)+1);
		    if(type == 1){
			        return year+"-"+month+"-"+day;
		    }else if(type == 2){
			        return year+"-"+month+"-"+day+" "+hh+":"+mm;
		    }else if(type == 3){
			        return hh+":"+mm;
		    }else if(type == 4){
			        return year;
		    }else if(type == 5){
			        return year+month;
		    }
	}


</script>
</body>
</html>