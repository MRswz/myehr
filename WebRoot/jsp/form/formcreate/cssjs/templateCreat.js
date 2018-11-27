/*function addRow(){ 
    var strAppend = '<tr data-index="'+num+'">'+
	    '<td style="text-align: center;padding:6px 10px; vertical-align: left;width:125;color:blue ">'+
		'	<span class="glyphicon glyphicon-plus" onclick="addRow()"></span>'+
		'	<span id="new'+num+'" class="glyphicon glyphicon-trash" onclick="deletexx(this)"></span> '+
		'</td>'+
		'<td style="text-align: center;padding:6px 10px; vertical-align: left;width:250 ">'+
		'	<input type="text" class="form-control" id="formWhereValue">'+
		'</td>'+
		'<td style="text-align: center;padding:6px 10px; vertical-align: left;width:125 ">'+
		'	<input type="text" class="form-control" id="formWhereValue">'+
		'</td>'+
		'<td style="text-align: center; vertical-align: left;width:250 ">'+
		'	<input type="text" class="form-control" id="formWhereValue">'+
		'</td>'+
		'<td style="text-align: center;padding:6px 10px; vertical-align: left;width:125 ">'+
		'	<select id="formWhereCpRule" class="form-control">'+
		'		<option value ="="> = </option>'+
	    '		<option value ="!="> != </option>'+
		'	</select>'+
		'</td>'+
		'<td style="text-align: center;padding:6px 10px; vertical-align: left;width:375 ">'+
		'	<input type="text" class="form-control"  id="formWhereValue">'+
		'</td>'+
		'<td style="text-align: center;padding:6px 10px; vertical-align: left;width:125 ">'+
		'	<input type="text" class="form-control"  id="formWhereValue">'+
		'</td>'+
		
		'</tr>';
    num++;
    $("#tableList tbody").append(strAppend);       
}*/

function deletexx(Index,obj){
	if(Index!=0){
		$(obj).parent().parent().remove();
	}
}
function addRow(insertIndex){
    $('#tableList').bootstrapTable('insertRow',{index:-1,row:""});
}

var objx;
function chooseEntity(obj){
	objx = obj;
	entityList();
}

function remove(obj){
	var templateSql = {};
	templateSql.templateEntityId = $(obj).parent().parent().parent().find("input").eq(1).val();
	$.ajax({
		url:path+'/formtemplate/deleteEntity.action',
		type:'post',
		cache: false,
		data:JSON.stringify(templateSql),
		contentType: 'application/json;charset=utf-8',
		async: false,
		success: function (data) {
			
			}
		});
	$('#tableList').bootstrapTable('refresh');
	$('#columnList').bootstrapTable('refresh');
}

function rturnVal(data){
	var templateSql = {};
	templateSql.templateEntityName = data[0].entityCode;
	templateSql.templateEntityId = data[0].entityId;
	templateSql.templateId = TemplateId;
	$.ajax({
		url:path+'/formtemplate/saveEntity.action',
		type:'post',
		cache: false,
		data:JSON.stringify(templateSql),
		contentType: 'application/json;charset=utf-8',
		async: false,
		success: function (data) {
				
			}
		});
	$("#tableList").bootstrapTable("refresh");
}

var fieldDatas = [];
function rturnFieldVal1(data){

	var entityTableOther ;
	var entityTableName ;
	var entityDatas = getEntityData();
	for(var j=0;;j++){
		if(entityDatas[j].templateEntityId==data[0].fieldEntityId){
			entityTableOther = entityDatas[j].templateEntityOtherName;
			entityTableName = entityDatas[j].templateEntityName;
			break;
		}
	}
	
	for(var i=0;i<data.length;i++){
		var fielddata = {};
		fielddata.templateColumnUsName = data[i].fieldCode;
		fielddata.templateColumnLabel = data[i].fieldChinaName;
		fielddata.templateColumnEntityId = data[i].fieldEntityId;
		fielddata.templateColumnColumnId = data[i].fieldId;
		fielddata.templateEntityTablename = entityTableName;
		fielddata.templateFieldTablename = data[i].fieldTablename;
		fielddata.templateColumnGuiType = data[i].formColumnGuiType;
		fielddata.templateTemplateId = TemplateId;
		fielddata.templateColumnOtherName = data[i].fieldTablename;
		fielddata.isShowPcCard = "true";
		fielddata.isShowAppCard = "true";
		fielddata.isShowPcList = "true";
		fielddata.isShowAppList = "true";
		fieldDatas.push(fielddata);
	}
	fieldDatas = uniqeByKeys(fieldDatas,['templateColumnColumnId'])
}

function getEntityData(){
	var i = 0;
	var data = [];
	$("#tableList>tbody").find("tr").each(function(){
		if($(this).find("input").eq(0).val()!=""){
			var table = {};
			table.templateEntityName=$(this).find("input").eq(0).val();
			table.templateEntityId=$(this).find("input").eq(1).val();
			table.templateEntityOtherName=$(this).find("input").eq(2).val();
			table.templateProperty=$(this).find("input").eq(3).val();
			table.templateCondition=$(this).find("input").eq(5).val();
			table.templateSort=$(this).find("input").eq(6).val();
			data[i] = table;
			i++;
		}
	})
	return data;
}

function rturnFieldVal2(){
	saveField();
	fieldDatas = [];
	$('#columnList').bootstrapTable('refresh');
	//$("#columnList").bootstrapTable("load",fieldDatas);
}

function saveField(){
	$.ajax({
			url:path+'/formtemplate/saveField.action',
			type:'post',
			cache: false,
			data:JSON.stringify(fieldDatas),
			contentType: 'application/json;charset=utf-8',
			async: false,
			success: function (data) {
					
				}
			});
}



function deleteColumn(){
	var columndata = $("#columnList").bootstrapTable('getSelections');
	$.ajax({
			url:path+'/formtemplate/deleteColumn.action',
			type:'post',
			cache: false,
			data:JSON.stringify(columndata),
			contentType: 'application/json;charset=utf-8',
			async: false,
			success: function (data) {
					
				}
			});
	$('#columnList').bootstrapTable('refresh');
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
//去重操作  
function uniqeByKeys(array,keys){  
    var arr = [];  
    var hash = {};  
    for (var i = 0, j = array.length; i < j; i++) {  
        var k = obj2key(array[i], keys);  
        if (!(k in hash)) {  
            hash[k] = true;  
            arr .push(array[i]);  
        }  
    }  
    return arr ;  
} 

function entityList(){
	var url='/myehr/jsp/cvr/datestruct/entity/chooseEntityTree.jsp?templateId='+TemplateId;
	parent.layer.open({
		type: 2,
		title:'选择实体',
		shadeClose: true,
		shade: 0.8,
		maxmin:true,
		zIndex:9999,
		area: ['950px', '500px'],
		content: url,
		success:function(layero,index){
		},
		end:function(){
		}
	});
}

function addColumn(){
	var url = "/myehr/jsp/cvr/datestruct/field/chooseField.jsp?templateId="+TemplateId+"&";
	var num = 1 ;
	$("#tableList tbody>tr").each(function(){
		if($(this).find("input").eq(0).val()!=null&&$(this).find("input").eq(0).val()!=""){
			url = url + "entityName" + num + "=" + $(this).find("input").eq(0).val() + "&";
			num++;
		}
	})
	parent.layer.open({
		type: 2,
		title:'选择实体',
		shadeClose: true,
		shade: 0.8,
		maxmin:true,
		zIndex:9999,
		area: ['950px', '500px'],
		content: url,
		success:function(layero,index){
		},
		end:function(){
			rturnFieldVal2();
		}
	});
}

//切换显示 :字段信息
function changeShowColumn(){
		$("#columnForm").css("display","block");
		$("#widgetForm").css("display","none");
}

//切换显示 :控件信息
function changeShowWidget(){
		$("#columnForm").css("display","none");
		$("#widgetForm").css("display","block");
}	 

function changeWidgetShow(type){
		if(type==1){//文本
			$("#textboxColumnGuiType").val("1");
			$("#text").css("display","block");
			$("#combobox").css("display","none");
			$("#date").css("display","none");	
			$("#textarea").css("display","none");
			$("#radiolist").css("display","none");
			$("#checkboxlist").css("display","none");
			$("#checkbox").css("display","none");
			$("#lookup").css("display","none");
			$("#fileupload").css("display","none");
		}else if(type==2){//下拉
			$("#comboboxFormColumnGuiType").val("2");
			$("#text").css("display","none");
			$("#combobox").css("display","block");
			$("#date").css("display","none");
			$("#textarea").css("display","none");
			$("#radiolist").css("display","none");
			$("#checkboxlist").css("display","none");
			$("#checkbox").css("display","none");
			$("#lookup").css("display","none");
			$("#fileupload").css("display","none");
		}else if(type==6){
			$("#dateFormColumnGuiType").val("6");
			$("#text").css("display","none");
			$("#combobox").css("display","none");
			$("#date").css("display","block");
			$("#textarea").css("display","none");
			$("#radiolist").css("display","none");
			$("#checkboxlist").css("display","none");
			$("#checkbox").css("display","none");
			$("#lookup").css("display","none");
			$("#fileupload").css("display","none");
		}else if(type==8){
			$("#textareaGuiType").val("8");
			$("#text").css("display","none");
			$("#combobox").css("display","none");
			$("#date").css("display","none");
			$("#textarea").css("display","block");
			$("#radiolist").css("display","none");
			$("#checkboxlist").css("display","none");
			$("#checkbox").css("display","none");
			$("#lookup").css("display","none");
			$("#fileupload").css("display","none");
		}else if(type==3){
			$("#radiolistFormColumnGuiType").val("3");
			$("#text").css("display","none");
			$("#combobox").css("display","none");
			$("#date").css("display","none");
			$("#textarea").css("display","none");
			$("#radiolist").css("display","block");
			$("#checkboxlist").css("display","none");
			$("#checkbox").css("display","none");
			$("#lookup").css("display","none");
			$("#fileupload").css("display","none");
		}else if(type==4){
			$("#checkboxlistFormColumnGuiType").val("4");
			$("#text").css("display","none");
			$("#combobox").css("display","none");
			$("#date").css("display","none");
			$("#textarea").css("display","none");
			$("#radiolist").css("display","none");
			$("#checkboxlist").css("display","block");
			$("#checkbox").css("display","none");
			$("#lookup").css("display","none");
			$("#fileupload").css("display","none");
		}else if(type==5){
			$("#checkboxColumnGuiType").val("5");
			$("#text").css("display","none");
			$("#combobox").css("display","none");
			$("#date").css("display","none");
			$("#textarea").css("display","none");
			$("#radiolist").css("display","none");
			$("#checkboxlist").css("display","none");
			$("#checkbox").css("display","block");
			$("#lookup").css("display","none");
			$("#fileupload").css("display","none");
		}else if(type==7){
			$("#lookupGuiType").val("7");
			$("#text").css("display","none");
			$("#combobox").css("display","none");
			$("#date").css("display","none");
			$("#textarea").css("display","none");
			$("#radiolist").css("display","none");
			$("#checkboxlist").css("display","none");
			$("#checkbox").css("display","none");
			$("#lookup").css("display","block");
			$("#fileupload").css("display","none");
		}else if(type==9){
			$("#fileuploadGuiType").val("9");
			$("#text").css("display","none");
			$("#combobox").css("display","none");
			$("#date").css("display","none");
			$("#textarea").css("display","none");
			$("#radiolist").css("display","none");
			$("#checkboxlist").css("display","none");
			$("#checkbox").css("display","none");
			$("#lookup").css("display","none");
			$("#fileupload").css("display","block");
		}
}

/*//控件类型切换
var select = document.getElementById('TEMPLATE_COLUMN_GUI_TYPE');
select.onchange = function(){
	if($("#columnList").bootstrapTable("getSelections").length>0){
	    //1.
		changeShowWidget();//显示控件页面
		changeWidgetShow($(select).val());//根据类型切换
	}else{
		alert("请选中一个字段!!");
	}
}*/

/*//自定义数据校验方案textboxCheckType
var textboxCheckTypeSelf = document.getElementById('textboxCheckType');
textboxCheckTypeSelf.onchange = function(){
	if($("#columnList").bootstrapTable("getSelections").length>0){
		if($(textboxCheckTypeSelf).val()=='fun'){
			$("#widgetTextInfo9").css("display","block");
		}else{
			$("#widgetTextInfo9").css("display","none");
		}
	}else{
		alert("请选中一个字段!!");
	}
}*/
/*//自定义初始值方案textboxDataFromType
var textboxDataFromTypeSelf = document.getElementById('textboxDataFromType');
textboxDataFromTypeSelf.onchange = function(){
	if($("#columnList").bootstrapTable("getSelections").length>0){
		if($(textboxDataFromTypeSelf).val()=='initFun'){
			$("#widgetTextInfo8").css("display","block");
			$("#textboxDataFromValue").attr("readonly",true);
		}else{
			$("#widgetTextInfo8").css("display","none");
			$("#textboxDataFromValue").attr("readonly",false);
		}
	}else{
		alert("请选中一个字段!!");
	}
} */ 






function saveInfo(url,datas){
	$.ajax({
			url:url,
			type:'post',
			cache: false,
			contentType: 'application/json;charset=utf-8',
			data:JSON.stringify(datas),
			async: false,
			success: function (data) {
					
				}
			});
}


function saveData(){
	//实体数据校验,获取数据
	checkData("entity");
	//字段数据校验,获取数据
	checkData("field");
	//获取SQL
	getSql();
	$('#table').bootstrapTable('refresh');
	$('#columnList').bootstrapTable('refresh');
}

function savecomp_add_click_1004(){
	
}

function checkData(type){
	if(type=="entity"){
		var datas = $("#tableList").bootstrapTable("getData");
		var saveDatas = [];
		var otherName = [];
		for(var i=0;i<datas.length-1;i++){
			var templateEntityOtherName = $("#tableList>tbody").find("tr").eq(i).find("input").eq(2).val();
			var templateProperty = $("#tableList>tbody").find("tr").eq(i).find("input").eq(3).val();
			var templateLinkSymbol = $("#tableList>tbody").find("tr").eq(i).find("select").eq(0).val();
			var templateCondition = $("#tableList>tbody").find("tr").eq(i).find("input").eq(4).val();
			var templateSort = $("#tableList>tbody").find("tr").eq(i).find("input").eq(5).val();
			if($("#tableList>tbody").find("tr").eq(i).find("input").eq(2).val()==""){
				templateEntityOtherName = null;
			}
			if($("#tableList>tbody").find("tr").eq(i).find("input").eq(3).val()==""){
				templateProperty = null;
			}
			if($("#tableList>tbody").find("tr").eq(i).find("select").eq(0).val()==""){
				templateLinkSymbol = null;	
			}
			if($("#tableList>tbody").find("tr").eq(i).find("input").eq(4).val()==""){
				templateCondition = null;
			}
			if($("#tableList>tbody").find("tr").eq(i).find("input").eq(5).val()==""){
				templateSort = null;
			}
			if(templateEntityOtherName!=datas[i].templateEntityOtherName||templateProperty!=datas[i].templateProperty||templateLinkSymbol!=datas[i].templateLinkSymbol||templateCondition!=datas[i].templateCondition||templateSort!=datas[i].templateSort){
			//需要修改数据是否合理
			/*
			if(templateEntityOtherName==""){
				alert("实体别名不能为空!");
				return false;
			}else if(templateEntityOtherName.length>2){
				alert("实体别名不能超过两个字符!");
				return false;
			}
			*/
			//实体可修改部分是否修改(有一处不同,就需修改)
				datas[i].templateEntityOtherName=templateEntityOtherName;
				datas[i].templateProperty=templateProperty;
				datas[i].templateLinkSymbol=templateLinkSymbol;
				datas[i].templateCondition=templateCondition;
				datas[i].templateSort=templateSort;
				saveDatas.push(datas[i]);
			}
			otherName[i] = templateEntityOtherName;		
		}
		if(isRepeat(otherName)){
			alert("实体别名不能重复!");
			return false;
		}
		var url = path+"/formtemplate/updateEntity.action";//更新实体信息
		saveInfo(url,saveDatas);
		
	}else{
		var datas = $("#columnList").bootstrapTable("getData");
		var saveDatas = [];
		var otherName = [];
		for(var i=0;i<datas.length;i++){
//			var templateColumnExpression = $("#columnList>tbody").find("tr").eq(i).find("input").eq(2).val();
			var templateColumnOtherName = $("#columnList>tbody").find("tr").eq(i).find("input").eq(2).val();
			var templateColumnLabel = $("#columnList>tbody").find("tr").eq(i).find("input").eq(3).val();
			var isShowPcList = $("#columnList>tbody").find("tr").eq(i).find("input").eq(4).prop("checked");
			var isShowPcCard = $("#columnList>tbody").find("tr").eq(i).find("input").eq(5).prop("checked");
			var isShowAppList = $("#columnList>tbody").find("tr").eq(i).find("input").eq(6).prop("checked");
			var isShowAppCard = $("#columnList>tbody").find("tr").eq(i).find("input").eq(7).prop("checked");
//			if($("#columnList>tbody").find("tr").eq(i).find("input").eq(2).val()==""){
//				templateColumnExpression = null;
//			}
			if($("#columnList>tbody").find("tr").eq(i).find("input").eq(2).val()==null){
				templateColumnOtherName = null;
			}
			if($("#columnList>tbody").find("tr").eq(i).find("input").eq(3).val()==null){
				templateColumnLabel = null;
			}
			if(templateColumnLabel!=datas[i].templateColumnLabel||isShowPcList!=datas[i].isShowPcList||isShowPcCard!=datas[i].isShowPcCard||isShowAppList!=datas[i].isShowAppList||isShowAppCard!=datas[i].isShowAppCard){			
//				datas[i].templateColumnExpression=templateColumnExpression;
				datas[i].templateColumnOtherName=templateColumnOtherName;
				datas[i].templateColumnLabel=templateColumnLabel;
				datas[i].isShowPcList=isShowPcList;
				datas[i].isShowPcCard=isShowPcCard;
				datas[i].isShowAppList=isShowAppList;
				datas[i].isShowAppCard=isShowAppCard;
				saveDatas.push(datas[i]);
			}
			otherName[i] = templateColumnOtherName;		
		}
		if(isRepeat(otherName)){
			alert("字段别名不能重复!");
			return;
		}
		var url = path+"/formtemplate/updateField.action";//更新实体信息
		saveInfo(url,saveDatas);
		
	}
}

function getSql(){
	$.ajax({
		url:path+'/formtemplate/getSql.action?templateId='+TemplateId,
		type:'post',
		cache: false,
		contentType: 'application/json;charset=utf-8',
		async: false,
		success: function (template) {
				$("#sql").val(template.templateSql);
				if (template.pcAddCardShow=="true"){
					checked1 = "checked";
				}
				if (template.pcGridShow=="true"){
					checked2 = "checked";
				}
				if (template.appAddCardShow=="true"){
					checked3 = "checked";
				}
				if (template.appGridShow=="true"){
					checked4 = "checked";
				}
				if (template.pcEditCardShow=="true"){
					checked5 = "checked";
				}
				if (template.appEditCardShow=="true"){
					checked6 = "checked";
				}
			}
		});
}

function isRepeat(arr){ 

	var hash = {}; 

	for(var i in arr) { 

		if(hash[arr[i]]) 

		return true; 

		hash[arr[i]] = true; 

	} 

	return false; 

} 

function addVirtualColumn(){
	var datas = [];
	var template = {};
	template.templateColumnId="";
	template.templateColumnUsName="";
	template.templateColumnExpression="";
	template.templateColumnTableOther="";
	template.templateColumnOtherName="";
	template.templateColumnLabel="";
	datas.push(template);
	$.ajax({
		url:path+'/formtemplate/newField.action',
		type:'POST',
		cache: false,
		contentType: 'application/json;charset=utf-8',
		data:JSON.stringify(datas),
		async: false,
		success: function (data) {
				
			}
		});
	//$('#columnList').bootstrapTable('load',data);
	$('#columnList').bootstrapTable('refresh');
}
function checkPKcolumn(){
	$.ajax({
		url:path+'/formtemplate/checkPKcolumn.action?templateId='+TemplateId,
		type:'POST',
		cache: false,
		async: false,
		success: function (data) {
				if(data=="1"){
					alert("");
					return false;
				}else if(data=="2"){
					alert("");
					return false;
				}else if(data=="3"){
					alert("");
					return false;
				}
			}
		});
	return true;
}


	
	/*var div1 = document.getElementById("div1");
	　　div1.onmousedown = function(ev){
	　　　　var oevent = ev || event;

	　　　　var distanceX = oevent.clientX - div1.offsetLeft;
	　　　　var distanceY = oevent.clientY - div1.offsetTop;

	　　　　document.onmousemove = function(ev){
	　　　　　　var oevent = ev || event;
	　　　　　　div1.style.left = oevent.clientX - distanceX + 'px';
	　　　　　　div1.style.top = oevent.clientY - distanceY + 'px'; 
	　　　　};
	　　　　document.onmouseup = function(){
	　　　　　　document.onmousemove = null;
	　　　　　　document.onmouseup = null;
	　　　　};
	}*/
function showWidgetInfo(dataForm){
	var type = dataForm.templateColumnGuiType;
	var columnId = dataForm.templateColumnId;
	if(type==undefined||type==null||type==""){
		changeWidgetShow(1);
	}else{
		changeWidgetShow(type);
	}
	$("#textboxColumnLable").val(dataForm.templateColumnLabel);
	if(type=='1'){
		$.ajax({
			url:path+'/formtemplate/getTextInfoByColumnId.action?columnId='+columnId,
			type:'post',
			cache: false,
			async: false,
			success: function (data) {
					showTextInfoStep2(data);
				}
			});
	}else if(type=='2'){
		$("#comboboxFormColumnLable").val(dataForm.templateColumnLabel);
		$.ajax({
			url:path+'/formtemplate/getComboboxInfoByColumnId.action?columnId='+columnId,
			type:'post',
			cache: false,
			async: false,
			success: function (data) {
					showComboboxInfoStep2(data);
				}
			});
	}else if(type=='6'){
		$("#dateFormColumnLable").val(dataForm.templateColumnLabel);
		$.ajax({
			url:path+'/formtemplate/getDateInfoByColumnId.action?columnId='+columnId,
			type:'post',
			cache: false,
			async: false,
			success: function (data) {
					showDateInfoStep2(data);
				}
			});
	}else if(type=='8'){
		$("#textareaFormColumnLable").val(dataForm.templateColumnLabel);
		$.ajax({
			url:path+'/formtemplate/getTextareaInfoByColumnId.action?columnId='+columnId,
			type:'post',
			cache: false,
			async: false,
			success: function (data) {
					showTextareaInfoStep2(data);
				}
			});
	}else if(type=='3'){
		$("#radiolistFormColumnLable").val(dataForm.templateColumnLabel);
		$.ajax({
			url:path+'/formtemplate/getRadiolistInfoByColumnId.action?columnId='+columnId,
			type:'post',
			cache: false,
			async: false,
			success: function (data) {
					showRadiolistInfoStep2(data);
				}
			});
	}else if(type=='4'){
		$("#checkboxlistFormColumnLable").val(dataForm.templateColumnLabel);
		$.ajax({
			url:path+'/formtemplate/getCheckboxlistInfoByColumnId.action?columnId='+columnId,
			type:'post',
			cache: false,
			async: false,
			success: function (data) {
					showCheckboxlistInfoStep2(data);
				}
			});
	}else if(type=='5'){
		$("#checkboxColumnLable").val(dataForm.templateColumnLabel);
		$.ajax({
			url:path+'/formtemplate/getCheckboxInfoByColumnId.action?columnId='+columnId,
			type:'post',
			cache: false,
			async: false,
			success: function (data) {
					showCheckboxInfoStep2(data);
				}
			});
	}else if(type=='7'){
		$("#lookupFormColumnLable").val(dataForm.templateColumnLabel);
		$.ajax({
			url:path+'/formtemplate/getLookupInfoByColumnId.action?columnId='+columnId,
			type:'post',
			cache: false,
			async: false,
			success: function (data) {
					showLookupInfoStep2(data);
				}
			});
	}
	else if(type=='9'){
		$("#fileuploadFormColumnLable").val(dataForm.templateColumnLabel);
		$.ajax({
			url:path+'/formtemplate/getFileuploadInfoByColumnId.action?columnId='+columnId,
			type:'post',
			cache: false,
			async: false,
			success: function (data) {
					showFileuploadInfoStep2(data);
				}
			});
	}
}
function showExpandInfo(data){
	$("#formColumnEntityId").val(data.templateColumnEntityId);
	$("#formEntityTableName").val(data.templateEntityTablename);
	$("#formColumnColumnId").val(data.templateColumnColumnId);
	$("#formFieldTableName").val(data.templateFieldTablename);
	$("#formColumnLable").val(data.templateColumnLabel);
	$("#formColumnShowType").val(data.templateColumnShowType);
	$("#FORM_COLUMN_LABEL_WIDTH").val(data.templateColumnLabelWidth);
	$("#formColumnGuiType").val(data.templateColumnGuiType);
	$("#formColumnWidth").val(data.templateColumnWidth);
	$("#formColumnHeight").val(data.templateColumnHeight);
	$("#formColumnSort").val(data.templateColumnSort);
	$("#formColumnAlign").val(data.templateColumnAlign);
	$("#formColumnRequired").val(data.templateColumnRequired);
	$("#formColumnColSpan").val(data.templateColumnColSpan);
	$("#formColumnMaxLength").val(data.templateColumnMaxLength);
	$("#formColumnMinLength").val(data.templateColumnMinLength);
	$("#formColumnColor").val(data.templateColumnColor);
	$("#formColumnColorCondition").val(data.templateColumnColorCondition);
	$("#formColumnTotal").val(data.templateColumnTotal);
	$("#formGroupId").val(data.templateColumnGroupId);
}
function showComboboxInfoStep2(data){
	$("#comboboxId").val(data.comboboxId);
	$("#comboboxDataFromType").val(data.comboboxDataFromType);
	if(data.comboboxDataFromType=="initFun"){
		comboboxDataFromTypeStep2();
	}
	$("#comboboxcheckFun").val(data.comboboxcheckFun);
	$("#comboboxCheckSelf").val(data.comboboxCheckSelf);
	$("#comboboxInitFun").val(data.comboboxInitFun);
	$("#comboboxValuechangeFun").val(data.comboboxValuechangeFun);
	$("#comboboxClickFun").val(data.comboboxClickFun);
	$("#comboboxDataFromValue").val(data.comboboxDataFromValue);
	$("#comboboxGuiInitType").val(data.comboboxGuiInitType);
		cboxGuiChanged();
    if(data.comboboxGuiInitType=='dict'){
    	$("#comboboxGuiInitName2").val(getDictnameByCode(data.comboboxGuiInitValue));
    	$("#comboboxGuiInitValue2").val(data.comboboxGuiInitValue);
    }else if(data.comboboxGuiInitType=='sql'){
    	$("#comboboxGuiInitExcsqlId").val(data.comboboxGuiInitExcsqlId);
    }
	cboxSql();
	$("#comboboxTextfield").val(data.comboboxTextfield);
	$("#comboboxValuefield").val(data.comboboxValuefield);
	$("#comboboxDatafield").val(data.comboboxDatafield);
	$("#comboboxEmptytext").val(data.comboboxEmptytext);
	if(data.comboboxAllowinput=="Y"||data.comboboxAllowinput=="true"){
		$("#comboboxAllowinput").prop('checked',true);
	}else if(data.comboboxAllowinput=="N"||data.comboboxAllowinput=="false"){
		$("#comboboxAllowinput").prop('checked',false);
	}
	if(data.comboboxMultiselect=="Y"||data.comboboxMultiselect=="true"){
		$("#comboboxMultiselect").prop('checked',true);
	}else if(data.comboboxMultiselect=="N"||data.comboboxMultiselect=="false"){
		$("#comboboxMultiselect").prop('checked',false);
	}
	$("#comboboxNullitemtext").val(data.comboboxNullitemtext);
	$("#comboboxGuiInitExcsqlId").val(data.comboboxGuiInitExcsqlId);
	$("#comboboxIstext").val(data.comboboxIstext);
	$("#comboboxDictSql").val(data.comboboxDictSql);
	if(data.comboboxIsSearch=="Y"||data.comboboxIsSearch=="true"){
		$("#comboboxIsSearch").prop('checked',true);
	}else if(data.comboboxIsSearch=="N"||data.comboboxIsSearch=="false"){
		$("#comboboxIsSearch").prop('checked',false);
	}
	if(data.comboboxShownullitem=="Y"||data.comboboxShownullitem=="true"){
		$("#comboboxShownullitem").prop('checked',true);
	}else if(data.comboboxShownullitem=="N"||data.comboboxShownullitem=="false"){
		$("#comboboxShownullitem").prop('checked',false);
	}
}

function showTextInfoStep2(data){
	$("#textboxId").val(data.textboxId);
	$("#textboxCheckType").val(data.textboxCheckType);
	if(data.textboxCheckType=="fun"){
		textCheckTypeStep2();
	}
	$("#textboxCheckSelf").val(data.textboxCheckSelf);
	$("#textboxDataFromType").val(data.textboxDataFromType);
	$("#textboxDataFromValue").val(data.textboxDataFromValue);
	if(data.textboxDataFromType=="initFun"){
		textDataFromTypeStep2();
	}
	$("#textboxEmptytext").val(data.textboxEmptytext);
	$("#textboxInitFun").val(data.textboxInitFun);
	$("#textboxCheckFun").val(data.textboxCheckFun);
	$("#textboxValuechangeFun").val(data.textboxValuechangeFun);
	$("#textboxClickFun").val(data.textboxClickFun);
	if(data.textboxIsLink=="true"||data.textboxIsLink=="Y"){
		$("#textboxIsLink").prop('checked',true);
	}else if(data.textboxIsLink=="false"||data.textboxIsLink=="N"){
		$("#textboxIsLink").prop('checked',false);
	}
	if(data.textboxLinkIsForm=="true"||data.textboxLinkIsForm=="Y"){
		$("#textboxLinkIsForm").prop('checked',true);
		$("#textlinkDetailFormId").val(data.textboxLinkForm);
		$("#textlinkDetailFormName").val(getFormNameById(data.textboxLinkForm));
		linkIsFormStep2();
	}else{
		$("#textboxLinkIsForm").prop('checked',false);
		$("#textboxLinkUrl1").val(data.textboxLinkUrl);
		linkIsFormStep2();
	}
	if(data.textboxLinkWinOpenType=='2'){
		$("#textboxLinkWinOpenType2").click();
		newJsp();
	}else if(data.textboxLinkWinOpenType=='3'){
		$("#textboxLinkWinOpenType3").click();
	}else if(data.textboxLinkWinOpenType=='4'){
		$("#textboxLinkWinOpenType4").click();
	}else{
		$("#textboxLinkWinOpenType1").click();
		layerJsp();
	}
	$("#textboxLinkSuccessDeal").val(data.textboxLinkSuccessDeal);
	$("#textboxLinkWinTitle").val(data.textboxLinkWinTitle);
	$("#textboxLinkWinWidth").val(data.textboxLinkWinWidth);
	$("#textboxLinkWinHeight").val(data.textboxLinkWinHeight);
}

function showDateInfoStep2(data){
	$("#datepickerId").val(data.datepickerId);
	$("#datepickerDataFromType").val(data.datepickerDataFromType);
	if(data.datepickerDataFromType=="initFun"){
		dateDataFromTypeStep2();
	}
	$("#datepickerFormat").val(data.datepickerFormat);
	$("#datepickerDataFromValue").val(data.datepickerDataFromValue);
	if(data.datepickerAllowinput=="true"||data.datepickerAllowinput=="Y"){
		$("#datepickerAllowinput").prop('checked',true);
	}else if(data.datepickerAllowinput=="false"||data.datepickerAllowinput=="N"){
		$("#datepickerAllowinput").prop('checked',false);
	}
	if(data.datepickerShowtime=="true"||data.datepickerShowtime=="Y"){
		$("#datepickerShowtime").prop('checked',true);
	}else if(data.datepickerShowtime=="false"||data.datepickerShowtime=="N"){
		$("#datepickerShowtime").prop('checked',false);
	}
	if(data.datepickerShowokbutton=="true"||data.datepickerShowokbutton=="Y"){
		$("#datepickerShowokbutton").prop('checked',true);
	}else if(data.datepickerShowokbutton=="false"||data.datepickerShowokbutton=="N"){
		$("#datepickerShowokbutton").prop('checked',false);
	}
	if(data.datepickerShowclearbutton=="true"||data.datepickerShowclearbutton=="Y"){
		$("#datepickerShowclearbutton").prop('checked',true);
	}else if(data.datepickerShowclearbutton=="false"||data.datepickerShowclearbutton=="N"){
		$("#datepickerShowclearbutton").prop('checked',false);
	}
	if(data.datepickerShowtodaybutton=="true"||data.datepickerShowtodaybutton=="Y"){
		$("#datepickerShowtodaybutton").prop('checked',true);
	}else if(data.datepickerShowtodaybutton=="false"||data.datepickerShowtodaybutton=="N"){
		$("#datepickerShowtodaybutton").prop('checked',false);
	}
	$("#datepickerInitFun").val(data.datepickerInitFun);

	$("#datepickerValuechangeFun").val(data.datepickerValuechangeFun);
	$("#datepickerClickFun").val(data.datepickerClickFun);
	$("#datepickerDrawdatefun").val(data.datepickerDrawdateFun);
}

function showTextareaInfoStep2(data){
	$("#textareaId").val(data.textareaId);
	$("#textareaCheckType").val(data.textareaCheckType);
	if(data.textareaCheckType=="fun"){
		textareaCheckTypeStep2();
	}
	$("#textareaCheckSelf").val(data.textareaCheckSelf);
	$("#textareaDataFromType").val(data.textareaDataFromType);
	$("#textareaDataFromValue").val(data.textareaDataFromValue);
	if(data.textareaDataFromType=="initFun"){
		textareaDataFromTypeStep2();
	}
	$("#textareaInitFun").val(data.textareaInitFun);
	$("#textareaCheckFun").val(data.textareaCheckFun);
	$("#textareaValuechangeFun").val(data.textareaValuechangeFun);
	$("#textareaClickFun").val(data.textareaClickFun);
}

function showCheckboxInfoStep2(data){
	$("#checkboxId").val(data.checkboxId);
	$("#checkboxDataFromType").val(data.checkboxDataFromType);
	$("#checkboxDataFromValue ").val(data.checkboxDataFromValue );
	if(data.checkboxDataFromType=="initFun"){
		checkboxDataFromTypeStep2();
	}
	$("#checkboxShowName").val(data.checkboxShowName);
	$("#checkboxInitFun").val(data.checkboxInitFun);
	$("#checkboxValuechangeFun").val(data.checkboxValuechangeFun);
	$("#checkboxClickFun").val(data.checkboxClickFun);
}

function showCheckboxlistInfoStep2(data){
	$("#checkboxlistId").val(data.checkboxlistId);
	$("#checkboxlistDataFromType").val(data.checkboxlistDataFromType);
	if(data.checkboxlistDataFromType=="initFun"){
		checkboxlistDataFromTypeStep2();
	}
	$("#checkboxlistcheckFun").val(data.checkboxlistcheckFun);
	$("#checkboxlistCheckSelf").val(data.checkboxlistCheckSelf);
	$("#checkboxlistInitFun").val(data.checkboxlistInitFun);
	$("#checkboxlistValuechangeFun").val(data.checkboxlistValuechangeFun);
	$("#checkboxlistClickFun").val(data.checkboxlistClickFun);
	$("#checkboxlistDataFromValue").val(data.checkboxlistDataFromValue);
	$("#checkboxlistGuiInitType").val(data.checkboxlistGuiInitType);
	cboxGuiChanged();
	$("#checkboxlistGuiInitValue2").val(data.checkboxlistGuiInitValue);
	$("#checkboxlistGuiInitName2").val(getDictnameByCode(data.checkboxlistGuiInitValue));
	$("#checkboxlistTextfield").val(data.checkboxlistTextfield);
	$("#checkboxlistValuefield").val(data.checkboxlistValuefield);
	$("#checkboxlistDatafield").val(data.checkboxlistDatafield);
	$("#checkboxlistEmptytext").val(data.checkboxlistEmptytext);
	if(data.checkboxlistAllowinput=="true"||data.checkboxlistAllowinput=="Y"){
		$("#checkboxlistAllowinput").prop('checked',true);
	}else if(data.checkboxlistAllowinput=="false"||data.checkboxlistAllowinput=="N"){
		$("#checkboxlistAllowinput").prop('checked',false);
	}
	if(data.checkboxlistMultiselect=="true"||data.checkboxlistMultiselect=="Y"){
		$("#checkboxlistMultiselect").prop('checked',true);
	}else if(data.checkboxlistMultiselect=="false"||data.checkboxlistMultiselect=="N"){
		$("#checkboxlistMultiselect").prop('checked',false);
	}
	$("#checkboxlistNullitemtext").val(data.checkboxlistNullitemtext);
	$("#checkboxlistGuiInitExcsqlId").val(data.checkboxlistGuiInitExcsqlId);
	$("#checkboxlistIstext").val(data.checkboxlistIstext);
	$("#checkboxlistDictSql").val(data.checkboxlistDictSql);
	if(data.checkboxlistIsSearch=="true"||data.checkboxlistIsSearch=="Y"){
		$("#checkboxlistIsSearch").prop('checked',true);
	}else if(data.checkboxlistIsSearch=="false"||data.checkboxlistIsSearch=="N"){
		$("#checkboxlistIsSearch").prop('checked',false);
	}
	$("#checkboxlistRepeatdirection").val(data.checkboxlistRepeatdirection);
	$("#checkboxlistRepeatitems").val(data.checkboxlistRepeatitems);
	$("#checkboxlistRepeatlayout").val(data.checkboxlistRepeatlayout);
}
//radiolistGuiInitName2
function showRadiolistInfoStep2(data){
	$("#radiolistId").val(data.radiolistId);
	$("#radiolistDataFromType").val(data.radiolistDataFromType);
	if(data.radiolistDataFromType=="initFun"){
		radiolistDataFromTypeStep2();
	}
	$("#radiolistcheckFun").val(data.radiolistcheckFun);
	$("#radiolistCheckSelf").val(data.radiolistCheckSelf);
	$("#radiolistInitFun").val(data.radiolistInitFun);
	$("#radiolistValuechangeFun").val(data.radiolistValuechangeFun);
	$("#radiolistClickFun").val(data.radiolistClickFun);
	$("#radiolistDataFromValue").val(data.radiolistDataFromValue);
	$("#radiolistGuiInitType").val(data.radiolistGuiInitType);
		rListGuiChanged();
	$("#radiolistGuiInitValue2").val(data.radiolistGuiInitValue);
	$("#radiolistGuiInitName2").val(getDictnameByCode(data.radiolistGuiInitValue));
	$("#radiolistTextfield").val(data.radiolistTextfield);
	$("#radiolistValuefield").val(data.radiolistValuefield);
	$("#radiolistDatafield").val(data.radiolistDatafield);
	$("#radiolistEmptytext").val(data.radiolistEmptytext);
	if(data.radiolistAllowinput=="true"||data.radiolistAllowinput=="Y"){
		$("#radiolistAllowinput").prop('checked',true);
	}else if(data.radiolistAllowinput=="false"||data.radiolistAllowinput=="N"){
		$("#radiolistAllowinput").prop('checked',false);
	}
	if(data.radiolistMultiselect=="true"||data.radiolistMultiselect=="Y"){
		$("#radiolistMultiselect").prop('checked',true);
	}else if(data.radiolistMultiselect=="false"||data.radiolistMultiselect=="N"){
		$("#radiolistMultiselect").prop('checked',false);
	}
	$("#radiolistNullitemtext").val(data.radiolistNullitemtext);
	$("#radiolistGuiInitExcsqlId").val(data.radiolistGuiInitExcsqlId);
	$("#radiolistIstext").val(data.radiolistIstext);
	$("#radiolistDictSql").val(data.radiolistDictSql);
	if(data.radiolistIsSearch=="true"||data.radiolistIsSearch=="Y"){
		$("#radiolistIsSearch").prop('checked',true);
	}else if(data.radiolistIsSearch=="false"||data.radiolistIsSearch=="N"){
		$("#radiolistIsSearch").prop('checked',false);
	}
	$("#radiolistRepeatdirection").val(data.radiolistRepeatdirection);
	$("#radiolistRepeatitems").val(data.radiolistRepeatitems);
	$("#radiolistRepeatlayout").val(data.radiolistRepeatlayout);
}

function showLookupInfoStep2(data){
	$("#lookupId").val(data.lookupId);
	$("#lookupDataFromType").val(data.lookupDataFromType);
	$("#lookupDataFromValue").val(data.lookupDataFromValue);
	if(data.lookupDataFromType=="initFun"){
		lookupDataFromTypeStep2();
	}
	$("#lookupFormWinType").val(data.lookupFormWinType);
	if(data.lookupFormWinType=="1"){
		lookupFormWinTypeStep2();
		$("#lookupWinTitle").val(data.lookupWinTitle);
		$("#lookupWinWidth").val(data.lookupWinWidth);
		$("#lookupWinHeight").val(data.lookupWinHeight);
		$("#lookupShowProperty").val(data.lookupShowProperty);
		$("#lookupValueProperty").val(data.lookupValueProperty);		
		$("#lookupDetailFormId").val(data.lookupFormId);
		$("#lookupDetailFormName").val(getFormNameById(data.lookupFormId));
		$("#lookupCustomDataback").val(data.lookupCustomDataback);//是否自定义回显
		if($("#lookupCustomDataback").val()=='Y'||$("#lookupCustomDataback").val()=="true"){
			lookupCustomDatabackFunStep2('Y');
			$("#lookupCustomDatabackFun").val(data.lookupCustomDatabackFun);
		}
	}else if(data.lookupFormWinType=="2"){
		lookupFormWinTypeStep2();
		$("#lookupWinTitle").val(data.lookupWinTitle);
		$("#lookupWinWidth").val(data.lookupWinWidth);
		$("#lookupWinHeight").val(data.lookupWinHeight);
		$("#lookupShowProperty").val(data.lookupShowProperty);
		$("#lookupValueProperty").val(data.lookupValueProperty);
		$("#lookupFormUrl").val(data.lookupFormUrl);
	}else if(data.lookupFormWinType=="3"){
		lookupFormWinTypeStep2();
		$("#lookupButtonclickFun").val(data.lookupButtonclickFun);
	}else{
		$("#lookupFormWinType").val("1");
		lookupFormWinTypeStep2();
	}
	$("#lookupDatabackType").val(data.lookupDatabackType);
	lookupDatabackType();
	$("#lookupDatabackValue").val(data.lookupDatabackValue);
	
	$("#lookupCheckFun").val(data.lookupCheckFun);
	$("#lookupInitFun").val(data.lookupInitFun);
	$("#lookupValuechangeFun").val(data.lookupValuechangeFun);
	$("#lookupClickFun").val(data.lookupClickFun);
}

function showFileuploadInfoStep2(data){
	$("#fileuploadId").val(data.fileuploadId);
	if(data.fileuploadUploadFiletypes!=null){		
		$('#fileuploadUploadFiletypes').selectpicker('val', data.fileuploadUploadFiletypes.split(","));
	}
	$("#fileuploadMaxFileCount ").val(data.fileuploadMaxFileCount);	
	
	if(data.fileuploadAutoUpload=="true"||data.fileuploadAutoUpload=="Y"){
		$("#fileuploadAutoUpload").prop('checked',true);
	}else{
		$("#fileuploadAutoUpload").prop('checked',false);
	}
	
	$("#fileuploadDataFromType").val(data.fileuploadDataFromType);	
	$("#fileuploadDataFromValue").val(data.fileuploadDataFromValue);	
	$("#fileuploadTagGuiInitValue2").val(data.fileuploadTagGuiType);
	$("#fileuploadTagGuiInitName2").val(getDictnameByCode(data.fileuploadTagGuiType));
}

function lookupFormWinTypeStep2(){
	var formWinType = $("#lookupFormWinType").val();
	//lookupForm lookupUrl lookuptype2
	if(formWinType=='1'){
		$(".lookuptype2").css("display","inline-block");
		$(".lookupForm").css("display","inline-block");
		$(".lookupUrl").css("display","none");
		$("#widgetLookupInfo13").css("display","none");
	}else if(formWinType=='2'){
		$(".lookuptype2").css("display","inline-block");
		$(".lookupForm").css("display","none");
		$(".lookupUrl").css("display","inline-block");
		$("#widgetLookupInfo13").css("display","none");
	}else{
		$(".lookuptype2").css("display","none");
		$(".lookupForm").css("display","none");
		$(".lookupUrl").css("display","none");
		$("#widgetLookupInfo13").css("display","block");
	}
}

function linkIsFormStep2(){
	if($("#textboxLinkIsForm").prop('checked')){
		$("#widgetTextLinkInfo2").css("display","none");
		$("#widgetTextLinkInfo3").css("display","inline-block");
	}else{
		$("#widgetTextLinkInfo3").css("display","none");
		$("#widgetTextLinkInfo2").css("display","inline-block");
	}
}

function layerJsp(){
	if($("#textboxLinkWinOpenType1").prop('checked')){
		$(".jumpJsp").css("display","inline-block");
	}else if($("#textboxLinkWinOpenType3").prop('checked')){
		$(".jumpJsp").css("display","inline-block");
	}else if($("#textboxLinkWinOpenType4").prop('checked')){
		$(".jumpJsp").css("display","inline-block");
	}else{
		$(".jumpJsp").css("display","none");
	}
}
function newJsp(){
	if($("#textboxLinkWinOpenType1").prop('checked')){
		$(".jumpJsp").css("display","inline-block");
	}else if($("#textboxLinkWinOpenType3").prop('checked')){
		$(".jumpJsp").css("display","inline-block");
	}else if($("#textboxLinkWinOpenType4").prop('checked')){
		$(".jumpJsp").css("display","inline-block");
	}else{
		$(".jumpJsp").css("display","none");
	}
}
//保存字段信息
function saveColumnInfo(){
	var column = {};
	var data = $("#columnList").bootstrapTable("getSelections")[0];
	url = path+"/formtemplate/updateOneField.action";
	column.templateColumnId = data.templateColumnId;
	column.templateColumnLabel = $("#formColumnLable").val();
	column.templateColumnLabelWidth = $("#FORM_COLUMN_LABEL_WIDTH").val();
	column.templateColumnGuiType = $("#formColumnGuiType").val();
	column.templateColumnWidth = $("#formColumnWidth").val();
	column.templateColumnAlign = $("#formColumnAlign").val();
	column.templateColumnHeight = $("#formColumnHeight").val();
	column.templateColumnSort = $("#formColumnSort").val();
	column.templateColumnShowType = $("#formColumnShowType").val();
	column.templateColumnRequired = $("#formColumnRequired").val();
	column.templateColumnColSpan = $("#formColumnColSpan").val();
	column.templateColumnTotal = $("#formColumnTotal").val();
	column.templateColumnMaxLength = $("#formColumnMaxLength").val();
	column.templateColumnMinLength = $("#formColumnMinLength").val();
	column.templateColumnColor = $("#formColumnColor").val();
	column.templateColumnGroupId = $("#formGroupId").val();
	column.templateColumnColorCondition = $("#formColumnColorCondition").val();
	saveInfo(url,column);		
	$("#columnList").bootstrapTable("refresh");
	chooseMark = data.templateColumnId;
}

function saveInfo(url,datas){
	$.ajax({
			url:url,
			type:'post',
			cache: false,
			contentType: 'application/json;charset=utf-8',
			data:JSON.stringify(datas),
			async: false,
			success: function (data) {
				if(data=="true"||data==1){  
                	layer.alert('保存成功', {
						  icon: 6,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
						  skin: 'layer-ext-moon' 
						})

                }else{  
                	layer.alert('保存失败', {
						  icon: 5,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
						  skin: 'layer-ext-moon' 
						})
                }  
				}
			});
}

//保存控件信息
function saveWidget(){
	var templateColumnId = $("#columnList").bootstrapTable("getSelections")[0].templateColumnId;
	var widgetType = $("#formColumnGuiType").val();
	var dataForm = $("#columnList").bootstrapTable("getSelections")[0];
	var url="";
	if(widgetType=='1'){
		var sysFormTextbox = {};
		url = path+"/formtemplate/saveTextBox.action";
		sysFormTextbox.textboxTemplateColumnId=templateColumnId;
		sysFormTextbox.textboxId=$("#textboxId").val();
		sysFormTextbox.textboxCheckType=$("#textboxCheckType").val();
		sysFormTextbox.textboxCheckSelf=$("#textboxCheckSelf").val();
		sysFormTextbox.textboxDataFromType=$("#textboxDataFromType").val();
		sysFormTextbox.textboxDataFromValue=$("#textboxDataFromValue").val();
		sysFormTextbox.textboxCheckFun=$("#textboxCheckFun").val();
		sysFormTextbox.textboxInitFun=$("#textboxInitFun").val();
		sysFormTextbox.textboxValuechangeFun=$("#textboxValuechangeFun").val();
		sysFormTextbox.textboxClickFun=$("#textboxClickFun").val();
		sysFormTextbox.textboxEmptytext=$("#textboxEmptytext").val();
		if($("#textboxIsLink").prop('checked')){
			sysFormTextbox.textboxIsLink='Y';
		}else{
			sysFormTextbox.textboxIsLink='N';
		}
		if($("#textboxLinkIsForm").prop('checked')){
			sysFormTextbox.textboxLinkIsForm='Y';
		}else{
			sysFormTextbox.textboxLinkIsForm='N';
		}
		if(sysFormTextbox.textboxLinkIsForm){
			sysFormTextbox.textboxLinkForm=$("#tabDetailFormId").val();
		}else{
			sysFormTextbox.textboxLinkUrl=$("#textboxLinkUrl1").val();
		}
		sysFormTextbox.textboxLinkWinOpenType=$("input[name='textboxLinkWinOpenType']:checked").val();
		if($("input[name='textboxLinkWinOpenType']:checked").val()=='1'){
			sysFormTextbox.textboxLinkSuccessDeal=$("#textboxLinkSuccessDeal").val();
			sysFormTextbox.textboxLinkWinTitle=$("#textboxLinkWinTitle").val();
			sysFormTextbox.textboxLinkWinWidth=$("#textboxLinkWinWidth").val();
			sysFormTextbox.textboxLinkWinHeight=$("#textboxLinkWinHeight").val();
		}
		saveInfo(url,sysFormTextbox);
		showWidgetInfo(dataForm);
	}else if(widgetType=='2'){
		var sysFormCombobox = {};
		url = path+"/formtemplate/saveCombobox.action";
		sysFormCombobox.comboboxTemplateColumnId=templateColumnId;
		sysFormCombobox.comboboxId=$("#comboboxId").val();
		sysFormCombobox.comboboxCheckFun=$("#comboboxcheckFun").val();
		sysFormCombobox.comboboxCheckType=$("#comboboxCheckType").val();
		sysFormCombobox.comboboxCheckSelf=$("#comboboxCheckSelf").val();
		sysFormCombobox.comboboxInitFun=$("#comboboxInitFun").val();
		sysFormCombobox.comboboxValuechangeFun=$("#comboboxValuechangeFun").val();
		sysFormCombobox.comboboxClickFun=$("#comboboxClickFun").val();
		sysFormCombobox.comboboxDataFromType=$("#comboboxDataFromType").val();
		sysFormCombobox.comboboxDataFromValue=$("#comboboxDataFromValue").val();
		sysFormCombobox.comboboxGuiInitType=$("#comboboxGuiInitType").val();
		sysFormCombobox.comboboxGuiInitValue=$("#comboboxGuiInitValue2").val();
		sysFormCombobox.comboboxTextfield=$("#comboboxTextfield").val();
		sysFormCombobox.comboboxValuefield=$("#comboboxValuefield").val();
		sysFormCombobox.comboboxDatafield=$("#comboboxDatafield").val();
		sysFormCombobox.comboboxEmptytext=$("#comboboxEmptytext").val();
		if($("#comboboxAllowinput").prop('checked')){
			sysFormCombobox.comboboxAllowinput='Y';
		}else{
			sysFormCombobox.comboboxAllowinput='N';
		}
		if($("#comboboxMultiselect").prop('checked')){
			sysFormCombobox.comboboxMultiselect='Y';
		}else{
			sysFormCombobox.comboboxMultiselect='N';
		}
		sysFormCombobox.comboboxNullitemtext=$("#comboboxNullitemtext").val();
		sysFormCombobox.comboboxGuiInitExcsqlId=$("#comboboxGuiInitExcsqlId").val();
		sysFormCombobox.comboboxIstext=$("#comboboxIstext").val();	
		sysFormCombobox.comboboxDictSql=$("#comboboxDictSql").val();	
		if($("#comboboxIsSearch").prop('checked')){
			sysFormCombobox.comboboxIsSearch='Y';
		}else{
			sysFormCombobox.comboboxIsSearch='N';
		}
		if($("#comboboxShownullitem").prop('checked')){
			sysFormCombobox.comboboxShownullitem='Y';
		}else{
			sysFormCombobox.comboboxShownullitem='N';
		}
		saveInfo(url,sysFormCombobox);
		showWidgetInfo(dataForm);
	}else if(widgetType=='6'){
		var sysFormDatePicker = {};
		url = path+"/formtemplate/saveDatePicker.action";
		sysFormDatePicker.datepickerTemplateColumnId=templateColumnId;
		sysFormDatePicker.datepickerId=$("#datepickerId").val();
		sysFormDatePicker.datepickerCheckType=$("#datepickerCheckType").val();
		sysFormDatePicker.datepickerCheckSelf=$("#datepickerCheckSelf").val();
		sysFormDatePicker.datepickerInitFun=$("#datepickerInitFun").val();
		sysFormDatePicker.datepickerValuechangeFun=$("#datepickerValuechangeFun").val();
		sysFormDatePicker.datepickerClickFun=$("#datepickerClickFun").val();		
		sysFormDatePicker.datepickerDataFromType=$("#datepickerDataFromType").val();
		sysFormDatePicker.datepickerDataFromValue=$("#datepickerDataFromValue").val();		
		sysFormDatePicker.datepickerFormat=$("#datepickerFormat").val();		
		
		if($("#datepickerShowtime").prop('checked')){
			sysFormDatePicker.datepickerShowtime='Y';
		}else{
			sysFormDatePicker.datepickerShowtime='N';
		}
		
		if($("#datepickerShowokbutton").prop('checked')){
			sysFormDatePicker.datepickerShowokbutton='Y';
		}else{
			sysFormDatePicker.datepickerShowokbutton='N';
		}
		
		if($("#datepickerShowclearbutton").prop('checked')){
			sysFormDatePicker.datepickerShowclearbutton='Y';
		}else{
			sysFormDatePicker.datepickerShowclearbutton='N';
		}
		
		if($("#datepickerAllowinput").prop('checked')){
			sysFormDatePicker.datepickerAllowinput='Y';
		}else{
			sysFormDatePicker.datepickerAllowinput='N';
		}
		
		if($("#datepickerShowtodaybutton").prop('checked')){
			sysFormDatePicker.datepickerShowtodaybutton='Y';
		}else{
			sysFormDatePicker.datepickerShowtodaybutton='N';
		}
		sysFormDatePicker.datepickerDrawdateFun=$("#datepickerDrawdatefun").val();		
		saveInfo(url,sysFormDatePicker);
		showWidgetInfo(dataForm);
	}else if(widgetType=='8'){
			var sysFormTextarea = {};
			url = path+"/formtemplate/saveTextarea.action";
			sysFormTextarea.textareaTemplateColumnId=templateColumnId;
			sysFormTextarea.textareaId=$("#textareaId").val();
			sysFormTextarea.textareaCheckType=$("#textareaCheckType").val();
			if($("#textareaCheckType").val()=='fun'){
				sysFormTextarea.textareaCheckFun=$("#textareaCheckFun").val();
			}
			sysFormTextarea.textareaCheckSelf=$("#textareaCheckSelf").val();
			sysFormTextarea.textareaDataFromType=$("#textareaDataFromType").val();
			if($("#textareaDataFromType").val()=='initFun'){
				sysFormTextarea.textareaInitFun=$("#textareaInitFun").val();
			}
			sysFormTextarea.textareaDataFromValue=$("#textareaDataFromValue").val();
			sysFormTextarea.textareaValuechangeFun=$("#textareaValuechangeFun").val();
			sysFormTextarea.textareaClickFun=$("#textareaClickFun").val();
			sysFormTextarea.textareaEmptytext=$("#textareaEmptytext").val();
			saveInfo(url,sysFormTextarea);
			showWidgetInfo(dataForm);
		}else if(widgetType=='4'){
			var sysFormCheckboxlist = {};
			url = path+"/formtemplate/saveCheckboxlist.action";
			sysFormCheckboxlist.checkboxlistTemplateColumnId=templateColumnId;		
			sysFormCheckboxlist.checkboxlistId=$("#checkboxlistId").val();
			sysFormCheckboxlist.checkboxlistCheckFun=$("#checkboxlistcheckFun").val();
			sysFormCheckboxlist.checkboxlistCheckType=$("#checkboxlistCheckType").val();
			sysFormCheckboxlist.checkboxlistCheckSelf=$("#checkboxlistCheckSelf").val();
			sysFormCheckboxlist.checkboxlistInitFun=$("#checkboxlistInitFun").val();
			sysFormCheckboxlist.checkboxlistValuechangeFun=$("#checkboxlistValuechangeFun").val();
			sysFormCheckboxlist.checkboxlistClickFun=$("#checkboxlistClickFun").val();
			sysFormCheckboxlist.checkboxlistDataFromType=$("#checkboxlistDataFromType").val();
			sysFormCheckboxlist.checkboxlistDataFromValue=$("#checkboxlistDataFromValue").val();
			sysFormCheckboxlist.checkboxlistGuiInitType=$("#checkboxlistGuiInitType").val();
			sysFormCheckboxlist.checkboxlistGuiInitValue=$("#checkboxlistGuiInitValue2").val();
			sysFormCheckboxlist.checkboxlistTextfield=$("#checkboxlistTextfield").val();
			sysFormCheckboxlist.checkboxlistValuefield=$("#checkboxlistValuefield").val();
			sysFormCheckboxlist.checkboxlistDatafield=$("#checkboxlistDatafield").val();
			sysFormCheckboxlist.checkboxlistRepeatitems=$("#checkboxlistRepeatitems").val();
			sysFormCheckboxlist.checkboxlistRepeatlayout=$("#checkboxlistRepeatlayout").val();
			saveInfo(url,sysFormCheckboxlist);
			showWidgetInfo(dataForm);
		}else if(widgetType=='3'){
			var sysFormRadiolist = {};
			url = path+"/formtemplate/saveRadiolist.action";
			sysFormRadiolist.radiolistTemplateColumnId=templateColumnId;		
			sysFormRadiolist.radiolistId=$("#radiolistId").val();
			sysFormRadiolist.radiolistCheckFun=$("#radiolistcheckFun").val();
			sysFormRadiolist.radiolistCheckType=$("#radiolistCheckType").val();
			sysFormRadiolist.radiolistCheckSelf=$("#radiolistCheckSelf").val();
			sysFormRadiolist.radiolistInitFun=$("#radiolistInitFun").val();
			sysFormRadiolist.radiolistValuechangeFun=$("#radiolistValuechangeFun").val();
			sysFormRadiolist.radiolistClickFun=$("#radiolistClickFun").val();
			sysFormRadiolist.radiolistDataFromType=$("#radiolistDataFromType").val();
			sysFormRadiolist.radiolistDataFromValue=$("#radiolistDataFromValue").val();
			sysFormRadiolist.radiolistGuiInitType=$("#radiolistGuiInitType").val();
			sysFormRadiolist.radiolistGuiInitValue=$("#radiolistGuiInitValue2").val();
			sysFormRadiolist.radiolistTextfield=$("#radiolistTextfield").val();
			sysFormRadiolist.radiolistValuefield=$("#radiolistValuefield").val();
			sysFormRadiolist.radiolistDatafield=$("#radiolistDatafield").val();
			sysFormRadiolist.radiolistRepeatdirection=$("#radiolistRepeatdirection").val();
			sysFormRadiolist.radiolistRepeatitems=$("#radiolistRepeatitems").val();
			sysFormRadiolist.radiolistRepeatlayout=$("#radiolistRepeatlayout").val();
			saveInfo(url,sysFormRadiolist);
			showWidgetInfo(dataForm);
		}else if(widgetType=='5'){
			var sysFormCheckbox = {};
			url = path+"/formtemplate/saveCheckbox.action";
			sysFormCheckbox.checkboxTemplateColumnId=templateColumnId;
			sysFormCheckbox.checkboxId=$("#checkboxId").val();
			sysFormCheckbox.checkboxDataFromType=$("#checkboxDataFromType").val();
			if($("#checkboxDataFromType").val()=='initFun'){
				sysFormCheckbox.checkboxInitFun=$("#checkboxInitFun").val();
			}
			sysFormCheckbox.checkboxDataFromValue=$("#checkboxDataFromValue").val();
			sysFormCheckbox.checkboxValuechangeFun=$("#checkboxValuechangeFun").val();
			sysFormCheckbox.checkboxClickFun=$("#checkboxClickFun").val();
			sysFormCheckbox.checkboxShowName=$("#checkboxShowName").val();
			saveInfo(url,sysFormCheckbox);
			showWidgetInfo(dataForm);
		}else if(widgetType=='7'){
			var sysFormLookup = {};
			url = path+"/formtemplate/saveLookup.action";
			sysFormLookup.lookupId=$("#lookupId").val();
			sysFormLookup.lookupTemplateColumnId=templateColumnId;
			sysFormLookup.lookupCheckType=$("#lookupCheckType").val();
			sysFormLookup.lookupCheckSelf=$("#lookupCheckSelf").val();
			sysFormLookup.lookupCheckFun=$("#lookupCheckFun").val();
			
			sysFormLookup.lookupValuechangeFun=$("#lookupValuechangeFun").val();
			sysFormLookup.lookupClickFun=$("#lookupClickFun").val();
			sysFormLookup.lookupDataFromType=$("#lookupDataFromType").val();
			sysFormLookup.lookupDataFromValue=$("#lookupDataFromValue").val();
			if($("#lookupDataFromType").val()=='initFun'){
				sysFormLookup.lookupInitFun=$("#lookupInitFun").val();
			}
			sysFormLookup.lookupFormWinType=$("#lookupFormWinType").val();
			if($("#lookupFormWinType").val()=='1'){
				sysFormLookup.lookupWinTitle=$("#lookupWinTitle").val();
				sysFormLookup.lookupWinWidth=$("#lookupWinWidth").val();
				sysFormLookup.lookupWinHeight=$("#lookupWinHeight").val();
				sysFormLookup.lookupShowProperty=$("#lookupShowProperty").val();
				sysFormLookup.lookupValueProperty=$("#lookupValueProperty").val();
				sysFormLookup.lookupFormId=$("#lookupDetailFormId").val();
				sysFormLookup.lookupCustomDataback=$("#lookupCustomDataback").val();
				if($("#lookupCustomDataback").val()=='Y'){
					sysFormLookup.lookupCustomDatabackFun=$("#lookupCustomDatabackFun").val();
				}
				
			}else if($("#lookupFormWinType").val()=='2'){
				sysFormLookup.lookupWinTitle=$("#lookupWinTitle").val();
				sysFormLookup.lookupWinWidth=$("#lookupWinWidth").val();
				sysFormLookup.lookupWinHeight=$("#lookupWinHeight").val();
				sysFormLookup.lookupShowProperty=$("#lookupShowProperty").val();
				sysFormLookup.lookupValueProperty=$("#lookupValueProperty").val();
				sysFormLookup.lookupFormUrl=$("#lookupFormUrl").val();
			}else if($("#lookupFormWinType").val()=='3'){
				sysFormLookup.lookupButtonclickFun=$("#lookupButtonclickFun").val();
			}
			sysFormLookup.lookupDatabackValue=$("#lookupDatabackValue").val();
			sysFormLookup.lookupDatabackType=$("#lookupDatabackType").val();

			//sysFormLookup.lookupEmptytext=$("#lookupEmptytext").val();
			//sysFormLookup.lookupMuliselect=$("#lookupMuliselect").val();

			saveInfo(url,sysFormLookup);
			showWidgetInfo(dataForm);
		}else if(widgetType=='9'){
			var sysFormFileupload = {};
			url = path+"/formtemplate/saveFileupload.action";
			sysFormFileupload.fileuploadTemplateColumnId = templateColumnId;
			sysFormFileupload.fileuploadId = $("#fileuploadId").val();
			var arr = $("#fileuploadUploadFiletypes").val();
			var val = "";
			if(arr==null){
			}else{
				for(var i=0;i<arr.length;i++){
					val+=arr[i]+',';
				}
				val = val.substring(0,val.length-1);
			}
			sysFormFileupload.fileuploadUploadFiletypes=val;
			sysFormFileupload.fileuploadMaxFileCount=$("#fileuploadMaxFileCount").val();
			
			if($("#fileuploadAutoUpload").prop('checked')){
				sysFormFileupload.fileuploadAutoUpload='Y';
			}else{
				sysFormFileupload.fileuploadAutoUpload='N';
			}
			sysFormFileupload.fileuploadDataFromType = $("#fileuploadDataFromType").val();
			sysFormFileupload.fileuploadDataFromValue = $("#fileuploadDataFromValue").val();
			sysFormFileupload.fileuploadTagGuiType = $("#fileuploadTagGuiInitValue2").val();
			saveInfo(url,sysFormFileupload);
			showWidgetInfo(dataForm);
		}
	}
function lookupCustomDatabackFunStep2(){
	if($("#lookupCustomDataback").val()=='Y'){
		$("#widgetLookupInfo12").css("display","block");
	}else{
		$("#widgetLookupInfo12").css("display","none");
	}
}

function lookupDatabackType(){
	if($("#lookupDatabackType").val()=='other'){
		$("#lookupDatabackValue1").css("display","none");
		$("#lookupDatabackValue").css("display","block");
		$("#lookupSql").css("display","none");
		$("#lookupEditSql").css("display","none");
	}else if($("#lookupDatabackType").val()=='self'){
		$("#lookupDatabackValue1").css("display","block");
		$("#lookupDatabackValue1").attr("readonly",true);
		$("#lookupDatabackValue").css("display","none");
		$("#lookupSql").css("display","none");
		$("#lookupEditSql").css("display","none");
	}else if($("#lookupDatabackType").val()=='sql'){
		$("#lookupDatabackValue1").css("display","none");
		$("#lookupDatabackValue").css("display","none");
		$("#lookupSql").css("display","inline-block");
		$("#lookupEditSql").css("display","inline-block");
	}else{
		$("#lookupDatabackValue1").css("display","block");
		$("#lookupDatabackValue").css("display","none");
		$("#lookupDatabackValue1").attr("readonly",false);
		$("#lookupSql").css("display","none");
		$("#lookupEditSql").css("display","none");
	}
}

function cboxGuiChanged(){
	$("#comboboxTextfield").val("text");
	$("#comboboxValuefield").val("id");
	$("#comboboxDatafield").val("data");

	if($("#comboboxGuiInitType").val()=='sql'){
		
		$(".comboboxGuiInitValue1").css("display","none");
		$(".comboboxGuiInitValue2").css("display","none");
		$(".comboboxGuiInitValue3").css("display","inline-block");
		
	}else if($("#comboboxGuiInitType").val()=='dict'){
		$("#comboboxTextfield").val("dictName");
		$("#comboboxValuefield").val("dictId");
		$("#comboboxDatafield").val("dicts");
		$(".comboboxGuiInitValue1").css("display","none");
		$(".comboboxGuiInitValue2").css("display","inline-block");
		$(".comboboxGuiInitValue3").css("display","none");
		
	}else if($("#comboboxGuiInitType").val()=='json'){
		var model = "json模板:[ {\"text\":\"字典项名1\",\"id\":\"字典项ID1\"},\n"+
                    "		   {\"text\":\"字典项名2\",\"id\":\"字典项ID2\"}]";
		$(".comboboxGuiInitValue1").css("display","inline-block");
		$(".comboboxGuiInitValue1").attr("placeholder",model);
		$(".comboboxGuiInitValue2").css("display","none");
		$(".comboboxGuiInitValue3").css("display","none");		
	}
}

function cboxSql(){
	if($("#comboboxGuiInitExcsqlId").val()!=null&&$("#comboboxGuiInitExcsqlId").val()!=""){
		$("#comboboxGuiInitValue3").val("--已编写SQL--");
	}else{
		$("#comboboxGuiInitValue3").val("--未编写SQL--");
	}
}

function rListGuiChanged(){
	$("#radiolistTextfield").val("text");
	$("#radiolistValuefield").val("id");
	$("#radiolistDatafield").val("data");
	if($("#radiolistGuiInitType").val()=='sql'){		
		$(".radiolistGuiInitValue1").css("display","none");
		$(".radiolistGuiInitName2").css("display","none");
		$(".radiolistGuiInitValue3").css("display","inline-block");				
	}else if($("#radiolistGuiInitType").val()=='dict'){		
		$(".radiolistGuiInitValue1").css("display","none");
		$(".radiolistGuiInitName2").css("display","inline-block");
		$(".radiolistGuiInitValue3").css("display","none");
		$("#radiolistTextfield").val("dictName");
		$("#radiolistValuefield").val("dictId");
		$("#radiolistDatafield").val("dicts");		
	}else if($("#radiolistGuiInitType").val()=='json'){
		var model = "json模板:[ {\"text\":\"字典项名1\",\"id\":\"字典项ID1\"},\n"+
                    "		   {\"text\":\"字典项名2\",\"id\":\"字典项ID2\"}]";
		$(".radiolistGuiInitValue1").css("display","inline-block");
		$(".radiolistGuiInitValue1").attr("placeholder",model);
		$(".radiolistGuiInitName2").css("display","none");
		$(".radiolistGuiInitValue3").css("display","none");		
	}
}
function cListGuiChanged(){
	$("#checkboxlistTextfield").val("text");
	$("#checkboxlistValuefield").val("id");
	$("#checkboxlistDatafield").val("data");
	if($("#checkboxlistGuiInitType").val()=='sql'){		
		$(".checkboxlistGuiInitValue1").css("display","none");
		$(".checkboxlistGuiInitName2").css("display","none");
		$(".checkboxlistGuiInitValue3").css("display","inline-block");
		
	}else if($("#checkboxlistGuiInitType").val()=='dict'){
		$("#checkboxlistTextfield").val("dictName");
		$("#checkboxlistValuefield").val("dictId");
		$("#checkboxlistDatafield").val("dicts");
		$(".checkboxlistGuiInitValue1").css("display","none");
		$(".checkboxlistGuiInitName2").css("display","inline-block");
		$(".checkboxlistGuiInitValue3").css("display","none");
		
	}else if($("#checkboxlistGuiInitType").val()=='json'){
		var model = "json模板:[ {\"text\":\"字典项名1\",\"id\":\"字典项ID1\"},\n"+
                    "		   {\"text\":\"字典项名2\",\"id\":\"字典项ID2\"}]";
		$(".checkboxlistGuiInitValue1").css("display","inline-block");
		$(".checkboxlistGuiInitValue1").attr("placeholder",model);
		$(".checkboxlistGuiInitName2").css("display","none");
		$(".checkboxlistGuiInitValue3").css("display","none");		
	}
}

function chooseDictStep2(e){
	var url = path+'/jsp/form/formcreate/chooseDict.jsp?widget='+e;
	layer.open({
		type:2,
		closeBtn:1,
		shadeClose:true,
		area:['950','700'],
		maxmin:true,
		title:'选择表单',
		content:url,
		success:function(layero,index){
			//$('.layui-layer-max').click();
		},
		end:function(){			}
	 }); 
} 
function addSqlStep2(e){
	var execId = "";
	var url = "";
	if(e=='combobox_template'){
		url = path+'/jsp/form/formcreate/button/execute_sql_form_widget.jsp?execSqlType=TEMPLATE_COMBOBOX_INIT&execSqlRelaid='+$("#comboboxId").val();
	}else if(e=='lookup'){
		url = path+'/jsp/form/formcreate/button/execute_sql_form_widget.jsp?execSqlType=EXECSQL_LOOKUPBACK&execSqlRelaid='+$("#lookupId").val();
	}
	
	layer.open({
		type:2,
		closeBtn:1,
		shadeClose:true,
		area:['950','700'],
		maxmin:true,
		title:'编写SQL',
		content:url,
		success:function(layero,index){			
		},
		end:function(){	
			
		}
	 });
}

function textDataFromTypeStep2(){
	if($("#textboxDataFromType").val()=='initFun'){
		$("#widgetTextInfo8").css("display","block");
		$("#textboxDataFromValue").attr("readonly",true);
		$("#textboxDataFromValue").val("");
	}else{
		$("#widgetTextInfo8").css("display","none");
		$("#textboxDataFromValue").attr("readonly",false);
	}
}

function checkboxDataFromTypeStep2(){
	if($("#checkboxDataFromType").val()=='initFun'){
		$("#widgetCheckboxInfo8").css("display","block");
		$("#checkboxDataFromValue").attr("readonly",true);
		$("#checkboxDataFromValue").val("");
	}else{
		$("#widgetTextInfo8").css("display","none");
		$("#textboxDataFromValue").attr("readonly",false);
	}
}

function lookupDataFromTypeStep2(){
	if($("#lookupDataFromType").val()=='initFun'){
		$("#widgetLookupInfo8").css("display","block");
		$("#lookupDataFromValue").attr("readonly",true);
		$("#lookupDataFromValue").val("");
	}else{
		$("#widgetLookupInfo8").css("display","none");
		$("#lookupDataFromValue").attr("readonly",false);
	}
}

function textareaCheckTypeStep2(){
	if($("#textareaCheckType").val()=='fun'){
		$("#widgetTextareaInfo9").css("display","block");
	}else{
		$("#widgetTextareaInfo9").css("display","none");
	}
}

function textareaDataFromTypeStep2(){
	if($("#textareaDataFromType").val()=='initFun'){
		$("#widgetTextareaInfo8").css("display","block");
		$("#textareaDataFromValue").attr("readonly",true);
		$("#textareaDataFromValue").val("");
	}else{
		$("#widgetTextareaInfo8").css("display","none");
		$("#textareaDataFromValue").attr("readonly",false);
	}
}

function dateDataFromTypeStep2(){
	if($("#datepickerDataFromType").val()=='initFun'){
		$("#widgetDateInfo12").css("display","block");
		$("#datepickerDataFromValue").val("");
		$("#datepickerDataFromValue").attr("readonly",true);
		$("#datepickerDataFromValue").val("");
	}else{
		$("#widgetDateInfo12").css("display","none");
		$("#datepickerDataFromValue").attr("readonly",false);
	}
}

function comboboxDataFromTypeStep2(){
	if($("#comboboxDataFromType").val()=='initFun'){
		$("#widgetComboboxInfo17").css("display","block");
		$("#comboboxDataFromValue").val("");
		$("#comboboxDataFromValue").attr("readonly",true);
		$("#comboboxDataFromValue").val("");
	}else{
		$("#widgetComboboxInfo17").css("display","none");
		$("#comboboxDataFromValue").attr("readonly",false);
	}
}

function radiolistDataFromTypeStep2(){
	if($("#radiolistDataFromType").val()=='initFun'){
		$("#widgetRadiolistInfo17").css("display","block");
		$("#radiolistDataFromValue").val("");
		$("#radiolistDataFromValue").attr("readonly",true);
		$("#radiolistDataFromValue").val("");
	}else{
		$("#widgetRadiolistInfo17").css("display","none");
		$("#radiolistDataFromValue").attr("readonly",false);
	}
}

function checkboxlistDataFromTypeStep2(){
	if($("#checkboxlistDataFromType").val()=='initFun'){
		$("#widgetCheckboxlistInfo17").css("display","block");
		$("#checkboxlistDataFromValue").val("");
		$("#checkboxlistDataFromValue").attr("readonly",true);
		$("#checkboxlistDataFromValue").val("");
	}else{
		$("#widgetCheckboxlistInfo17").css("display","none");
		$("#checkboxlistDataFromValue").attr("readonly",false);
	}
}

function checkboxDataFromTypeStep2(){
	if($("#checkboxDataFromType").val()=='initFun'){
		$("#widgetCheckboxInfo17").css("display","block");
		$("#checkboxDataFromValue").val("");
		$("#checkboxDataFromValue").attr("readonly",true);
		$("#checkboxDataFromValue").val("");
	}else{
		$("#widgetCheckboxInfo17").css("display","none");
		$("#checkboxDataFromValue").attr("readonly",false);
	}
}

function chooseFormStep2(e){
	var url = path+'/jsp/form/formcreate/formChoose.jsp?fatherId='+TemplateId+'&fromType=config_form&widget='+e;
	layer.open({
		type:2,
		closeBtn:1,
		shadeClose:true,
		area:['950','700'],
		maxmin:true,
		title:'选择表单',
		content:url,
		success:function(layero,index){
		},
		end:function(){			
			
		}
	 }); 
} 


function getDictnameByCode(e){
	var DictName;
	$.ajax({
		url:path+'/form/getDictnameByCode.action?dictTypeCode='+e,
		type:'post',
		cache: false,
		async: false,
		contentType: 'application/json;charset=utf-8',
		success: function (data) {
				DictName = data.dictTypeName;
			}
		});
	return DictName;
}

//根据表单ID获取表单名
function getFormNameById(formDefId){
	var formDefName;
	$.ajax({
		url:path+'/form/getFormNameById.action?formDefId='+formDefId,
		type:'post',
		cache: false,
		async: false,
		contentType: 'application/json;charset=utf-8',
		success: function (data) {
				formDefName = data.formDefName;
			}
		});
	return formDefName;
}

function groupManage(){
	var url = '/myehr/jsp/form/formcreate/group/TemplateGroupManage.jsp?templateId='+TemplateId;
	layer.open({
		type:2,
		closeBtn:1,
		shadeClose:true,
		area:['950','700'],
		maxmin:true,
		title:'分组配置',
		content:url,
		success:function(layero,index){			
		},
		end:function(){		
			$('#columnList').bootstrapTable('refresh');
			initSelect();
		}
	 }); 
}

function batchUpdate(obj){
	//var datas = {};
	var sforms = $("#columnList").bootstrapTable('getSelections');
	if(sforms.length>0){
		var content;
		content =   "<div id='batchUp' class='row cell' style='border:none;line-height:25px;height:95%;overflow:auto;' >\n"+
					"<div id='batchUpdate1' class='col-lg-12 col-md-12 col-sm-12 col-xs-12'>\n"+
					"	<div class='ui search selection dropdown entitybox field-control' style='display: inline-block;width:100%;'>\n"+
					"		<lable style='float:left;font-size:12px'>显示宽度</lable>\n"+
					"		<input id='width_step2' name='width_step2' type='text' class='form-control' style='width:60%;'/>\n"+
					"	</div>\n"+
					"</div>\n"+
					"<div id='batchUpdate2' class='col-lg-12 col-md-12 col-sm-12 col-xs-12'>\n"+
					"	<div class='ui search selection dropdown entitybox field-control' style='display: inline-block;width:100%;'>\n"+
					"		<lable style='float:left;font-size:12px'>显示方式</lable>\n"+
					"		<select id='showType_step2' title='显示方式' styleType='select' name='showType_step2'  class='form-control' style='width:60%;' DictName='SYS_FORM_COLUMN_SHOW_TYPE' dataField='dict' initParam = '_'>\n"+
					"		</select>\n"+
					"	</div>\n"+
					"</div>\n"+
					"<div id='batchUpdate3' class='col-lg-12 col-md-12 col-sm-12 col-xs-12'>\n"+
					"	<div class='ui search selection dropdown entitybox field-control' style='display: inline-block;width:100%;'>\n"+
					"		<lable style='float:left;font-size:12px'>对齐方式</lable>\n"+
					"		<select id='align_step2' title='对齐方式' styleType='select' name='align_step2'  class='form-control' style='width:60%;' DictName='SYS_FORM_COLUMN_ALIGN' dataField='dict' initParam = '_'>\n"+
					"		</select>\n"+
					"	</div>\n"+
					"</div>\n"+
					"<div id='batchUpdate4' class='col-lg-12 col-md-12 col-sm-12 col-xs-12'>\n"+
					"	<div class='ui search selection dropdown entitybox field-control' style='display: inline-block;width:100%;'>\n"+
					"		<lable style='float:left;font-size:12px'>是否必填</lable>\n"+
					"		<select id='required_step2' title='是否必填' styleType='select' name='required_step2'  class='form-control' style='width:60%;' DictName='SYS_COMMON_YES_NO' dataField='dict' initParam = '_'>\n"+
					"		</select>\n"+
					"	</div>\n"+
					"</div>\n"+
					"<div id='batchUpdate5' class='col-lg-12 col-md-12 col-sm-12 col-xs-12'>\n"+
					"	<div class='ui search selection dropdown entitybox field-control' style='display: inline-block;width:100%;'>\n"+
					"		<lable style='float:left;font-size:12px'>所属分组</lable>\n"+
					"		<select id='group_step2' title='所属分组' styleType='select' name='group_step2'  class='form-control' style='width:60%;' DictName='' dataField='sql_form_0002' initParam = '_'>\n"+
					"		</select>\n"+
					"	</div>\n"+
					"</div>\n"+
					"</div>\n";
		layer.open({
			title:'输入内容',
			shadeClose: true,
			zIndex:9999,
			content: content,
			area: ['600px', '370px'],
			btn: ['保存', '取消'],
			success: function(layero, index){
				var classes = [];
				if(''=='APP'){
					$("input").each(function(){
						if($(this).attr('dataField') != undefined){
							classes.push($(this)[0]);
						}
					})
				}else{
					classes = $("#batchUp select");
				}
				for(var i=0;i<classes.length;i++){
					parame.id=classes[i].id;
					var type=$(classes[i]).attr('multiSelect');
					var dataField=$(classes[i]).attr('dataField');
					dataField = dataField+"|"+TemplateId;
					parame.placeholder="";
					parame.value=$(classes[i]).attr('value');
					parame.jsonParam.dictTypeCode=$(classes[i]).attr('DictName');
					if(type=="true"){
						myehr_initSelectMore(parame,dataField);
					}else{
						myehr_initSelect(parame,dataField);
					}
				}
			},
			yes: function(index, layero){
				var datas = [];
				for(var i = 0 ;i<sforms.length;i++){
					var data1 = {};
					data1.templateColumnAlign = $("#align_step2").val();
					data1.templateColumnWidth = $("#width_step2").val();
					data1.templateColumnRequired = $("#required_step2").val();
					data1.templateColumnGroupId = $("#group_step2").val();
					data1.templateColumnShowType = $("#showType_step2").val();
					data1.templateColumnId = sforms[i].templateColumnId;
					datas[i] = data1;
				}
				//datas.formsBloBs = sforms;
				var url = "/myehr/formtemplate/updateForms.action";//更新实体信息
				$.ajax({
					url:url,
					type:'post',
					cache: false,
					contentType: 'application/json;charset=utf-8',
					data:JSON.stringify(datas),
					async: false,
					success: function (data) {	
							$('#columnList').bootstrapTable('refresh');
							layer.close(index);
						}
					});
				
			  },
			btn2: function(index, layero){
			  }
		});
	}else{
		alert("请至少选中一条数据!!");
	}
}