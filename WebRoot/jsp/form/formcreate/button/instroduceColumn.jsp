<%@ page language="java" import="java.util.*" import="com.myehr.common.util.LangUtil" pageEncoding="UTF-8"%>
<%@ include file="/common/common.jsp" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<style>
#columnList>tbody>tr>td,#tableList>tbody>tr>td{padding:3px 6px;}
#columnList>tbody>tr>td input,#tableList>tbody>tr>td input{border:0;}
#columnList>tbody>tr>td select,#tableList>tbody>tr>td select{border:0;}
#columnList .form-control{height:20px;}
.row.cell>div{margin:5px 0;min-height:0;}
</style>
<body>
<div class="container-fluid">
	<div style="width:100%;height:100%;margin:0 auto;text-align:center">
		<div class="form-control" style="width:100%;height:95%;border:0">		
			<div class="" style="height:100%;overflow-y:hidden;padding:10px 0;margin:0 auto; ">
				<div style="width:30%;float:left">
					<div class="BTNGROUP_55" style="margin:0 auto; display:block;height: 35px;">
						<div style="margin-right:10px;display:inline-block">
							<input type="button" class="btn btn-primary" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"选择")%> onclick="select1()"/>
						</div>
					</div>
					<table id="tableList">
					</table>
				</div>
				<div style="width:20%;float:left">
					<div class="BTNGROUP_55" style="margin:0 auto; display:block;height: 35px;">
						<div style="margin-right:10px;display:inline-block">
							<input type="button" class="btn btn-primary" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"删除")%> onclick="delete1()"/>
						</div>
					</div>
					<table id="tableList2">
					</table>
				</div>
				<div style="width:20%;float:left">
					<div class="BTNGROUP_55" style="margin:0 auto; display:block;height: 35px;">
						<div style="margin-right:10px;display:inline-block">
							<input type="button" class="btn btn-primary" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"删除")%> onclick="delete2()"/>
						</div>
					</div>
					<table id="tableList3">
					</table>
				</div>
				<div style="width:30%;float:left">
					<div class="BTNGROUP_55" style="margin:0 auto; display:block;height: 35px;">
						<div style="margin-right:10px;display:inline-block">
							<input type="button" class="btn btn-primary" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"选择")%> onclick="select2()"/>
						</div>
						<div style="margin-right:10px;display:inline-block">
							<input type="button" class="btn btn-primary" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"请求参数")%> onclick="selectParam2('r')"/>
						</div>
						<div style="margin-right:10px;display:inline-block">
							<input type="button" class="btn btn-primary" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"会话参数")%> onclick="selectParam2('s')"/>
						</div>
						<div style="margin-right:10px;display:inline-block">
							<input type="button" class="btn btn-primary" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"开发参数")%> onclick="selectParam2('l')"/>
						</div>
						<div style="margin-right:10px;display:inline-block">
							<input type="button" class="btn btn-primary" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"常量")%> onclick="selectParam2('x')"/>
						</div>
					</div>
					<table id="tableList1">
					</table>
				</div>
			</div>
		</div>
		<div style="margin:0 auto; display:inline-block;height: 35px;">
			<div style="margin-right:10px;display:inline-block">
				<input type="button" id="save_formemp_emp_edit"  class="btn btn-primary" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"保存")%> onclick="save_formemp_emp_edit_click_1881()"/>
			</div>
			<div style="margin-right:10px;display:inline-block">
				<input type="button" id="closeemp_emp_edit"  class="btn btn-primary" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"关闭")%> onclick="closex_1881()"/>
			</div>
		</div>
	</div>	
</div>
    
<script>
var numRow=0;	
var num=0;	
var xxx="";
var dataColumn;
var dataColumn1;
var dataColumn2;
var dataColumn3;

var rowsNum=0;
$(function() {
	query_table();
	query_table1();
	query_table2();
	query_table3();
	$(".fixed-table-body").css("height","84%");
	$(".no-records-found").css("display","none");	
})


function query_table() {   
    $("#tableList").bootstrapTable({  
        url : '${pageContext.request.contextPath }/button/queryIntroduceColumnByFormId.action?formId='+'${param.formId}'+'&introduceId='+'${param.introduceId}', 
		height:'800',
        queryParams :'',
        undefinedText : '-',  
        striped : true, // 是否显示行间隔色  
        cache : false, // 是否使用缓存  
        clickToSelect: true,
        pagination : false,        
        uniqueId : "templateColumnId", // 每一行的唯一标识  
        sidePagination : "server", // 服务端处理分页  
        columns : [{
			field : 'state',
			checkbox : true,
			align : 'center',
			valign : 'middle'
		},{  
            title : '操作',  
            field : 'formColumnId', // 字段  
            align: 'center',
            valign: 'middle',
			visible : false,
            width:75,
            formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<a  class=\"eli w100\" style=\"font-size:14px;text-decoration:none;color:black;width:200px;\" name=\"formColumnId\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"操作\">"+value+"</a>";
			}
		}, {  
            title : '实体表名',  
            field : 'formEntityTablename',  
            align : 'center',  
            valign : 'middle', 
            width:200,
            formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<a  class=\"eli w100\" style=\"font-size:14px;color:black;width:150px;\" name=\"formEntityTablename\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"实体表名\">"+value+"</a>";
        	}
		}, {  
            title : '字段英文名',  
            field : 'formFieldTablename',  
            align : 'center',  
            valign : 'middle', 
            width:200,
            formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<a  class=\"eli w100\" style=\"font-size:14px;color:black;width:150px;\" name=\"formFieldTablename\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"字段英文名\">"+value+"</a>";
        	}
		}, {  
            title : '字段显示名',  
            field : 'formColumnLable',  
            align : 'center',  
            valign : 'middle', 
            width:200,
            formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<a  class=\"eli w100\" style=\"font-size:14px;color:black;width:150px;\" name=\"formColumnLable\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"字段显示名\">"+value+"</a>";
        	}
        }],
        onClickRow: function (row, $element) {
			curRow = row;
		},
		onLoadSuccess: function (res) {
			dataColumn = res.rows;
		},    
        responseHandler : function(res) { 
        	rowsNum = res.total;
            return {  
                total : res.total,  
                rows : res.rows  
            };  
        }, 
    });
}

function query_table1() {   
    $("#tableList1").bootstrapTable({  
        url : '${pageContext.request.contextPath }/button/queryIntroduceColumnByTargetFormId.action?targetFormId='+'${param.targetFormId}', 
		height:'800',
        queryParams :'',
        undefinedText : '-',  
        striped : true, // 是否显示行间隔色  
        cache : false, // 是否使用缓存  
        clickToSelect: true,
        pagination : false,        
        uniqueId : "templateColumnId", // 每一行的唯一标识  
        sidePagination : "server", // 服务端处理分页  
        columns : [{
			field : 'state',
			checkbox : true,
			align : 'center',
			valign : 'middle'
		},{  
            title : '操作',  
            field : 'formColumnId', // 字段  
            align: 'center',
            valign: 'middle',
			visible : false,
            width:75,
            formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<a  class=\"eli w100\" style=\"font-size:14px;text-decoration:none;color:black;width:200px;\" name=\"formColumnId\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"操作\">"+value+"</a>";
			}
		}, {  
            title : '实体表名',  
            field : 'formEntityTablename',  
            align : 'center',  
            valign : 'middle', 
            width:200,
            formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<a  class=\"eli w100\" style=\"font-size:14px;color:black;width:150px;\" name=\"formEntityTablename\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"实体表名\">"+value+"</a>";
        	}
		}, {  
            title : '字段英文名',  
            field : 'formFieldTablename',  
            align : 'center',  
            valign : 'middle', 
            width:200,
            formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<a  class=\"eli w100\" style=\"font-size:14px;color:black;width:150px;\" name=\"formFieldTablename\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"字段英文名\">"+value+"</a>";
        	}
		}, {  
            title : '字段显示名',  
            field : 'formColumnLable',  
            align : 'center',  
            valign : 'middle', 
            width:200,
            formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<a  class=\"eli w100\" style=\"font-size:14px;color:black;width:150px;\" name=\"formColumnLable\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"字段显示名\">"+value+"</a>";
        	}
        }],
        onClickRow: function (row, $element) {
			curRow = row; 
		},
		onLoadSuccess: function (res) {
			dataColumn1 = res.rows;
		}, 
        responseHandler : function(res) { 
        	rowsNum = res.total;
            return {  
                total : res.total,  
                rows : res.rows  
            };  
        }, 
    });
}

function query_table2(data) {   
    $("#tableList2").bootstrapTable({  
        url : '${pageContext.request.contextPath }/button/queryIntroduceColumnByIntroduceId.action?introduceId='+'${param.introduceId}', 
		height:'800',
        queryParams :'',
        undefinedText : '-',  
        striped : true, // 是否显示行间隔色  
        cache : false, // 是否使用缓存  
        clickToSelect: true,
        pagination : false,        
        uniqueId : "templateColumnId", // 每一行的唯一标识  
        sidePagination : "server", // 服务端处理分页  
        columns : [{
			field : 'state',
			checkbox : true,
			align : 'center',
			valign : 'middle'
		},{  
            title : '操作',  
            field : 'intrDetailId', // 字段  
            align: 'center',
            valign: 'middle',
			visible : false,
            width:75,
            formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<a  class=\"eli w100\" style=\"font-size:14px;text-decoration:none;color:black;width:200px;\" name=\"intrDetailId\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"操作\">"+value+"</a>";
			}
		},{  
            title : '引入字段Id',  
            field : 'formColumnId', // 字段  
            align: 'center',
            valign: 'middle',
			visible : false,
            width:75,
            formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<a  class=\"eli w100\" style=\"font-size:14px;text-decoration:none;color:black;width:200px;\" name=\"formColumnId\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"引入字段Id\">"+value+"</a>";
			}
		}, {  
            title : '字段显示名',  
            field : 'formColumnLable',  
            align : 'center',  
            valign : 'middle', 
            width:200,
            formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<a  class=\"eli w100\" style=\"font-size:14px;color:black;width:150px;\" name=\"formColumnLable\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"字段显示名\">"+value+"</a>";
        	}
        }],
        onClickRow: function (row, $element) {
	                curRow = row;
		},
		onLoadSuccess: function (res) {
			dataColumn2 = res.rows;
		},    
        responseHandler : function(res) { 
        	rowsNum = res.total;
            return {  
                total : res.total,  
                rows : res.rows  
            };  
        }, 
    });
}

function query_table3(data) {   
    $("#tableList3").bootstrapTable({  
        url : '${pageContext.request.contextPath }/button/queryIntroduceColumnByIntroduceId.action?introduceId='+'${param.introduceId}', 
		height:'800',
        queryParams :'',
        undefinedText : '-',  
        striped : true, // 是否显示行间隔色  
        cache : false, // 是否使用缓存  
        clickToSelect: true,
        pagination : false,        
        uniqueId : "templateColumnId", // 每一行的唯一标识  
        sidePagination : "server", // 服务端处理分页  
        columns : [{
			field : 'state',
			checkbox : true,
			align : 'center',
			valign : 'middle'
		},{  
            title : '操作',  
            field : 'targetColumnId', // 字段  
            align: 'center',
            valign: 'middle',
			visible : false,
            width:75,
            formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<a  class=\"eli w100\" style=\"font-size:14px;text-decoration:none;color:black;width:200px;\" name=\"targetColumnId\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"操作\">"+value+"</a>";
			}
		}, {  
            title : '字段显示名',  
            field : 'targetColumnLable',  
            align : 'center',  
            valign : 'middle', 
            width:200,
            formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<a  class=\"eli w100\" style=\"font-size:14px;color:black;width:150px;\" name=\"targetColumnLable\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"字段显示名\">"+value+"</a>";
        	}
        }],
        onClickRow: function (row, $element) {
			curRow = row;
		},
		onLoadSuccess: function (res) {
			dataColumn3 = res.rows;
		},       
        responseHandler : function(res) { 
        	rowsNum = res.total;
            return {  
                total : res.total,  
                rows : res.rows  
            };  
        }, 
    });
}

function addRow(insertIndex){
	rowsNum++;
    $('#tableList').bootstrapTable('insertRow',{index:rowsNum,row:{formButtonSort:rowsNum}});
	addListSelect();
}

var objx;
function chooseEntity(obj){
	objx = obj;
	saveData();
	addRow();
}

function remove(obj){
	var data = {};
	data.paramId = $(obj).parent().parent().parent().find("input").eq(0).val();
	$.ajax({
		url:'${pageContext.request.contextPath }/button/deleteIntroduceButtonParamById.action',
		type:'post',
		cache: false,
		data:JSON.stringify(data),
		contentType: 'application/json;charset=utf-8',
		async: false,
		success: function (data) {
			$('#tableList').bootstrapTable('refresh');
		}
	});
}

//将对象元素转换成字符串以作比较  
function obj2key(obj, keys){  
    var n = keys.length,  
        key = [];  
    while(n--){  
        key.push(obj[keys[n]]);  
    }  
    return key.join('|');  
}

function saveData(){
	var saveDate = getEntityData();
	for(var i=0;i<saveDate.length;i++){
		for(var j=0;j<saveDate.length;j++){
			if(i==j){
				continue;
			}else{
				if(saveDate[i].paramName==saveDate[j].paramName){
					alert('参数名称重复');
					return;
				}
			}
		}
	}
	$.ajax({
		url:'${pageContext.request.contextPath }/button/saveIntroduceButtonParam.action',
		type:'post',
		cache: false,
		contentType: 'application/json;charset=utf-8',
		data:JSON.stringify(saveDate),
		async: false,
		success: function (data) {
			if(data[0]=="0"){
				$('#tableList').bootstrapTable('refresh');
			}
		}
	});
	
}

function getEntityData(){
	var i = 0;
	var data = [];
	var paramType = '${param.paramType}';
	var paramTypeValue = '${param.introduceId}';
	$("#tableList>tbody").find("tr").each(function(){

		var table = {};
		table.paramId=$(this).find("input").eq(0).val();
		table.paramName=$(this).find("input").eq(1).val();
		table.paramFromType=$(this).find("select").eq(0).val();
		table.paramFromValue=$(this).find("input").eq(2).val();
		table.paramType=paramType;
		table.paramTypeValue=paramTypeValue;
		
		data[i] = table;
		i++;
		
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
		dataField = dataField+"|"+'${param.formDefId}';
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
		dataField = dataField+"|"+'${param.formDefId}';
		parame.placeholder="";
		parame.value=$(classes[i]).attr('value');
		parame.jsonParam.dictTypeCode=$(classes[i]).attr('DictName');
		if(type=="true"){
			myehr_initSelectMore(parame,dataField);
		}else{
			myehr_initSelect(parame,dataField,containerParam);
		}
	}

}

var formColumnData;
var targetColumnData;

var checkdatas=[];
function select1(){
	var selects = $("#tableList").bootstrapTable('getSelections');
	var data={};
	var datas = [];
	for(var i=0;i<dataColumn2.length;i++){
		datas.push(dataColumn2[i]);
	}
	for(var i=0;i<checkdatas.length;i++){
		datas.push(checkdatas[i]);
	}
	for(var i=0;i<selects.length;i++){
		var obj = {};
		obj.formColumnLable = selects[i].formColumnLable;
		obj.formColumnId = selects[i].formColumnId;
		datas.push(obj);
		checkdatas.push(obj);
	}
	
	formColumnData = datas;
	data.total = datas.length;
	data.rows = datas;
	$("#tableList2").bootstrapTable("load",data);
}

var checkdatas1=[];
function select2(type,value){
	var selects = $("#tableList1").bootstrapTable('getSelections');
	var data={};
	var datas = [];
	for(var i=0;i<dataColumn2.length;i++){
		datas.push(dataColumn3[i]);
	}
	for(var i=0;i<checkdatas1.length;i++){
		datas.push(checkdatas1[i]);
	}
	if(type!=undefined && type!=null){
		var obj = {};
		obj.targetColumnLable = type+'_'+value;
		obj.targetColumnType = type;
		obj.targetColumnId = value;
		datas.push(obj);
		checkdatas1.push(obj);
	}
	for(var i=0;i<selects.length;i++){
		var obj = {};
		obj.targetColumnLable = selects[i].formColumnLable;
		obj.targetColumnId = selects[i].formColumnId
		obj.targetColumnType = 'c';
		datas.push(obj);
		checkdatas1.push(obj);
	}
	
	targetColumnData=datas;
	data.total = datas.length;
	data.rows = datas;
	$("#tableList3").bootstrapTable("load",data);
}

function selectParam2(type) { 
	var title;
	if(type=='r'){
		title="请输入请求参数";
	}else if(type=='s'){
		title="请输入会话参数";
	}else if(type=='x'){
		title="请输入常量值(当前时间输入\"NOW&DATE\")";
	}else{
		title="请输入开发参数";
	}
    var value = prompt(title, "");
	if (value)//如果返回的有内容  
	{  
		if(type=='r'){
			select2('r',value)
		}else if(type=='s'){
			select2('s',value)
		}else if(type=='x'){
			select2('x',value)
		}else{
			select2('l',value)
		}
	}  
}

//关闭
function closex_1881(){ 
	var index = parent.layer.getFrameIndex(window.name); //获取当前窗体索引
	parent.layer.close(index);//执行关闭
}

function save_formemp_emp_edit_click_1881(){
	var saveIntroduceColumnDatas=[];
	if(formColumnData==undefined){
		formColumnData=dataColumn2;
	}
	if(targetColumnData==undefined){
		targetColumnData=dataColumn3;
	}
	if(targetColumnData.length!= formColumnData.length){
		layer.alert('所选字段不匹配', {
			icon: 5,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
			skin: 'layer-ext-moon' 
		})
	}else{
		for(var i=0;i<formColumnData.length;i++){
			var obj={};
			obj.intrDetailId = formColumnData[i].intrDetailId;
			obj.formColumnId = formColumnData[i].formColumnId;
			obj.targetColumnId = targetColumnData[i].targetColumnId;
			obj.introduceId = '${param.introduceId}';
			obj.targetColumnType = targetColumnData[i].targetColumnType;
			saveIntroduceColumnDatas.push(obj);
		}
	}
	$.ajax({
		url:'${pageContext.request.contextPath }/button/saveIntroduceColumn.action',
		type:'post',
		cache: false,
		contentType: 'application/json;charset=utf-8',
		data:JSON.stringify(saveIntroduceColumnDatas),
		async: false,
		success: function (data) {
			if(data[0]=="0"){
				layer.alert(data[1], {
					icon: 6,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
					skin: 'layer-ext-moon' 
				});
			}else{
				layer.alert('操作失败', {
					icon: 5,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
					skin: 'layer-ext-moon' 
				});
			}
			closex_1881();
		}
	});
}

</script>
</body>
</html>