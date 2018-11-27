function addRowstep5(insertIndex){
	rowsNum++;
    $('#tableListstep5').bootstrapTable('insertRow',{index:rowsNum,row:{formButtonSort:rowsNum}});
	addListSelectstep5();
}

function editButtonstep5(obj){
	var formButtonId = $(obj).parent().parent().parent().find("input").eq(0).val();
	var formButtonType = $(obj).parent().parent().parent().find("select").eq(0).val();
	var url;
	var title;
	if(formButtonType=="add"){
		url='/myehr/jsp/form/formcreate/button/addbutton_form.jsp?formButtonId='+formButtonId+'&formId='+formId;
		title='设置【新增】按钮扩展属性';
	}else if(formButtonType=="edit" || formButtonType=="batchEdit" || formButtonType=="copyAndUpdate"){
		url='/myehr/jsp/form/formcreate/button/updatebutton_form.jsp?formButtonId='+formButtonId+'&formId='+formId;
		title='设置【修改】按钮扩展属性';
	}else if(formButtonType=="remove"){
		url='/myehr/jsp/form/formcreate/button/removebutton_form.jsp?formButtonId='+formButtonId+'&formId='+formId;
		title='设置【删除】按钮扩展属性';
	}else if(formButtonType=="save"){
		url='/myehr/jsp/form/formcreate/button/savebutton_form.jsp?formButtonId='+formButtonId+'&formId='+formId;
		title='设置【保存】按钮扩展属性';
	}else if(formButtonType=="save_form"||formButtonType=="free_submit"){
		url='/myehr/jsp/form/formcreate/button/savebutton_cardform.jsp?formButtonId='+formButtonId+'&formId='+formId;
		title='设置【保存(卡片式)】按钮扩展属性';
	}else if(formButtonType=="close"){
		return;
	}else if(formButtonType=="calculate"){
		url='/myehr/jsp/form/formcreate/button/calculate_form.jsp?formButtonId='+formButtonId+'&formId='+formId;
		title='设置【计算】按钮扩展属性';
	}else if(formButtonType=="import"){
		url='/myehr/jsp/form/formcreate/button/importButton.jsp?formButtonId='+formButtonId+'&formId='+formId;
		title='设置【导入】按钮扩展属性';
	}else if(formButtonType=="export"){
		url='/myehr/jsp/form/formcreate/button/exportButton.jsp?formButtonId='+formButtonId+'&formId='+formId;
		title='设置【导出】按钮扩展属性';
	}else if(formButtonType=="select" || formButtonType=="select"){
		url='/myehr/jsp/form/formcreate/button/otherExtButton.jsp?formButtonId='+formButtonId+'&formId='+formId;
		if(formButtonType=="select"){
			title='设置【选择】按钮扩展属性';
		}else{
			title='设置【扩展】按钮扩展属性';
		}
	}else if(formButtonType=="introduce"){
		var execSqlType = 'buttonExecSQL';
		url='/myehr/jsp/form/formcreate/button/introduce_form.jsp?formButtonId='+formButtonId+'&formId='+formId+'&execSqlType='+execSqlType;
		title='设置【引入】按钮扩展属性';
	}else if(formButtonType=="executeSQL"){
		var execSqlType = 'buttonExecSQL';
		url='/myehr/jsp/form/formcreate/button/execute_sql_form.jsp?formButtonId='+formButtonId+'&formId='+formId+'&execSqlType='+execSqlType;
		title='设置【编写脚本】按钮扩展属性';
	}else if(formButtonType=="editorModel"){
		url='/myehr/jsp/form/formcreate/button/editorModel.jsp?formButtonId='+formButtonId+'&formId='+formId;
		title='设置【编写富文本模板】按钮扩展属性';
	}else if(formButtonType=="email"){
		url='/myehr/jsp/form/formcreate/button/emailModel.jsp?formButtonId='+formButtonId+'&formId='+formId;
		title='设置【编写邮件模板】按钮扩展属性';
	}else if(formButtonType=="message"){
		url='/myehr/jsp/form/formcreate/button/messageModel.jsp?formButtonId='+formButtonId+'&formId='+formId;
		title='设置【编写短信模板】按钮扩展属性';
	}else if(formButtonType=="interface"){
		url='/myehr/jsp/form/formcreate/button/interface_form.jsp?formButtonId='+formButtonId+'&formId='+formId;
		title='设置【调用接口】按钮扩展属性';
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
		}
	});
}

function removestep5(obj){
	var data = {};
	data.formButtonId = $(obj).parent().parent().parent().find("input").eq(0).val();
	$.ajax({
		url:'/myehr/form/deleteFormButton.action',
		type:'post',
		cache: false,
		data:JSON.stringify(data),
		contentType: 'application/json;charset=utf-8',
		async: false,
		success: function (data) {
			$('#tableListstep5').bootstrapTable('refresh');
		}
	});
}

function saveDatastep5(){
	var saveDate = getEntityDatastep5();
	for(var i=0;i<saveDate.length;i++){
		for(var j=i+1;j<saveDate.length;j++){
			if(saveDate[i].formButtonCode==saveDate[j].formButtonCode){
				layer.alert('按钮编码重复', {
					icon: 5,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
					skin: 'layer-ext-moon' 
				})
				return;
			}
		}
	}
	$.ajax({
		url:'/myehr/form/saveFormButton.action?formId='+formId,
		type:'post',
		cache: false,
		contentType: 'application/json;charset=utf-8',
		data:JSON.stringify(saveDate),
		async: false,
		success: function (data) {
			if(data[0]=="0"){
				$('#tableListstep5').bootstrapTable('refresh');
			}
		}
	});
	
}

function getEntityDatastep5(){
	var i = 0;
	var data = [];
	$("#tableListstep5>tbody").find("tr").each(function(){
		if($(this).find("select").eq(0).val()!=""){
			var table = {};
			table.formButtonId=$(this).find("input").eq(0).val();
			table.formButtonType=$(this).find("select").eq(0).val();
			table.formButtonName=$(this).find("input").eq(1).val();
			table.formButtonCode=$(this).find("input").eq(2).val();
			table.formButtonSort=$(this).find("input").eq(3).val();
			table.formButtonIcon=$(this).find("input").eq(5).val();
			table.formButtonWidth=$(this).find("input").eq(6).val();
			table.formButtonHeight=$(this).find("input").eq(7).val();
			table.formButtonCss=$(this).find("input").eq(8).val();
			table.formButtonWarningInfo=$(this).find("input").eq(9).val();
			table.formButtonCheckFun=$(this).find("input").eq(10).val();
			
			data[i] = table;
			i++;
		}
	})
	return data;
}

function addListSelectstep5(){
	var classes = [];
	if(''=='APP'){
		$("input").each(function(){
			if($(this).attr('dataField') != undefined){
				classes.push($(this)[0]);
			}
		})
	}else{
		classes = $("#form_step5 select");
	}
	for(var i=0;i<classes.length;i++){
		parame.id=classes[i].id;
		var type=$(classes[i]).attr('multiSelect');
		var dataField=$(classes[i]).attr('dataField');
		dataField = dataField+"|"+formId;
		parame.placeholder="";
		parame.value=$(classes[i]).attr('value');
		parame.jsonParam.dictTypeCode=$(classes[i]).attr('DictName');
		if($("#formDefLayoutType").val()==1){
			parame.dictData = "SYS_FORM_BUTTON_TYPE,save_form,close,executeSQL,introduce,free_submit";
		}
		if($("#formDefLayoutType").val()==2){
			parame.dictData = "SYS_FORM_BUTTON_TYPE,add,introduce,remove,edit,edit1,batchEdit,copy,copyAndUpdate,select,close,save,refresh,import,export,calculate,approved,email,message,interface,executeSQL,editorModel,gridBatchEdit";
		}
		if(type=="true"){
			myehr_initSelectMore(parame,dataField);
		}else{
			myehr_initSelect(parame,dataField);
		}
	}
}

function editESQL(obj,str){
	var formButtonId = $(obj).parent().parent().parent().find("input").eq(0).val();
	var execSqlType;
	if(str=='HZ'){
		execSqlType='EXECSQL_BUTTON_HZ_TYPE';
		title='设置【后置按钮脚本】';
	}else{
		execSqlType='EXECSQL_BUTTON_QZ_TYPE';
		title='设置【前置按钮脚本】';
	}
	url='/myehr/jsp/form/formcreate/button/execute_sql_form.jsp?formButtonId='+formButtonId+'&formId='+formId+'&execSqlType='+execSqlType;
		
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
			$('#tableListstep5').bootstrapTable('refresh');
		}
	});
}

function changeButtonType(obj){
	$(obj).parent().parent().find("input").eq(1)[0].value=obj.selectedOptions[0].label;;
	$(obj).parent().parent().find("input").eq(2)[0].value=obj.value;
	$(obj).parent().parent().find("input").eq(5)[0].value=obj.value;
}