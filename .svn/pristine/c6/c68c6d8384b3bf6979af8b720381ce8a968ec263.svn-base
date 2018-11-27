function addRowstep3(insertIndex){
	rowsNum++;
    $('#tableListstep3').bootstrapTable('insertRow',{index:rowsNum,row:{formWhereJoinRule:"and",formWhereCpRule:"=",formWhereSort:rowsNum,formWhereNullIs:"N"}});
	addListSelectstep3();
}

var objxstep3;
function chooseEntity(obj){
	objxstep3 = obj;
	saveDatastep3();
	addRowstep3();
}

function removestep3(obj){
	var data = {};
	data.formWhereId = $(obj).parent().parent().parent().find("input").eq(0).val();
	$.ajax({
		url:'/myehr/form/deleteWhereColumn.action',
		type:'post',
		cache: false,
		data:JSON.stringify(data),
		contentType: 'application/json;charset=utf-8',
		async: false,
		success: function (data) {
			$('#tableListstep3').bootstrapTable('refresh');
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

function saveDatastep3(){
	var saveDate = getEntityDatastep3();
	$.ajax({
		url:'/myehr/form/saveWhereColumn.action?formId='+formId,
		type:'post',
		cache: false,
		contentType: 'application/json;charset=utf-8',
		data:JSON.stringify(saveDate),
		async: false,
		success: function (data) {
			if(data[0]=="0"){
				$('#tableListstep3').bootstrapTable('refresh');
			}
		}
	});
	
}

function getEntityDatastep3(){
	var i = 0;
	var data = [];
	$("#tableListstep3>tbody").find("tr").each(function(){
		if($(this).find("select").eq(0).val()!=""){
			var table = {};
			table.formWhereId=$(this).find("input").eq(0).val();
			table.formWhereJoinRule=$(this).find("select").eq(0).val();
			table.formWhereLeftBracket=$(this).find("input").eq(1).val();
			table.formWhereColumnId=$(this).find("select").eq(1).val();
			table.formWhereValueType=$(this).find("select").eq(2).val();
			table.formWhereValue=$(this).find("input").eq(2).val();
			table.formWhereCpRule=$(this).find("select").eq(3).val();
			table.formWhereSort=$(this).find("input").eq(3).val();
			table.formWhereNullIs=$(this).find("select").eq(4).val();
			table.formWhereRightBracket=$(this).find("input").eq(4).val();
			
			data[i] = table;
			i++;
		}
	})
	return data;
}

function addListSelectstep3(){
	var classes = [];
	if(''=='APP'){
		$("input").each(function(){
			if($(this).attr('dataField') != undefined){
				classes.push($(this)[0]);
			}
		})
	}else{
		classes = $("#form_step3 select");
	}
	for(var i=0;i<classes.length;i++){
		parame.id=classes[i].id;
		var type=$(classes[i]).attr('multiSelect');
		var dataField=$(classes[i]).attr('dataField');
		dataField = dataField+"|"+formId;
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