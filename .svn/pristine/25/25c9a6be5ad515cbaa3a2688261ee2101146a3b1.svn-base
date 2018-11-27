function addRowStep4(insertIndex){
	var gridFilterId = document.getElementById("SYS_SYSTEM_SCHEME.gridFilterId").value;
	var url = '/myehr/jsp/form/formcreate/formFilterColumnList.jsp?formDefId='+formId+'&gridFilterId='+gridFilterId;
	parent.layer.open({
		type: 2,
		title:'选择表单',
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

function removeStep4(obj){
	var data = {};
	data.queryColumnId = $(obj).parent().parent().parent().find("input").eq(0).val();
	$.ajax({
		url:'/myehr/form/deleteFilterColumn.action',
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

function saveDataStep4(){
	var saveDate = getEntityDataStep4();
	if(saveDate[0].gridColumnLable==undefined){
		alert("请添加查询字段");
		return;
	}
	var param = {};
	param.columns= saveDate;
	$.ajax({
		url:'/myehr/form/saveFilterColumnData.action?formId='+formId,
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

function addListSelectStep4(){
	var classes = [];
	if(''=='APP'){
		$("input").each(function(){
			if($(this).attr('dataField') != undefined){
				classes.push($(this)[0]);
			}
		})
	}else{
		classes = $("#form_step4 select");
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

function _initDataStep4(pkId){
	var _form = getForm("#form_step4");
	var _Type = getType("#form_step4");
	$.ajax({
		url:'/myehr/form/queryGridFilterByFormId.action?formId='+formId,
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

function updateGridFilter(){
	var gridFilter = {};
	gridFilter.gridFilterRowCount = document.getElementById("SYS_SYSTEM_SCHEME.gridFilterRowCount").value;
	gridFilter.gridFilterLableWidth =  document.getElementById("SYS_SYSTEM_SCHEME.gridFilterLableWidth").value;
	if(document.getElementById("SYS_SYSTEM_SCHEME.gridFilterHeightGrade").checked==true){
		gridFilter.gridFilterHeightGrade ='true';
	}else{
		gridFilter.gridFilterHeightGrade ='false';
	}
	$.ajax({
		url:'/myehr/form/updateGridFilter.action?formId='+formId,
		type:'post',
		data:JSON.stringify(gridFilter),
		cache: false,
		contentType: 'application/json;charset=utf-8',
		success: function (text) {
			
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

