function myehr_initSelect2(params){
	var selectObj = $("#"+params.id);
	selectObj.select2({
		language: "zh-CN",  
	    allowClear: true,  
	    width: params.width,  
	    height:params.height,  
	    placeholder: params.placeholder,
	  	data: myehr_getSelectjsonData(params.url,params.jsonParam)
	});
	$("#"+params.id).select2("data",{"id":myehr_getSelectjsonData(params.url,params.jsonParam)[0].id,"text":myehr_getSelectjsonData(params.url,params.jsonParam)[0].text});
	if(params.value!=null&&params.value!=''){ //设置默认值
		selectObj.val("2").trigger("change");
	}
	
	if(params.chang){
		selectObj.on("change", params.chang);
	}
	
}

function myehr_getSelectjsonData(url,jsonParam){
	var  _temp = null;
	url+='&dictTypeCode='+jsonParam.dictTypeCode;
	if(jsonParam.nullItemText!=undefined){
		url+='&nullItemText='+encodeURI(jsonParam.nullItemText, "UTF-8");
	}
	
	$.ajax({  
        url: url,  
        async:false, //是否为异步操作  
	    cache:false,    //是否缓存结果  
	    type:"POST",    //请求方式  
	    dataType:"json",    //服务器返回数据是什么类型  
	    //contentType: "application/x-www-form-urlencoded; charset=utf-8",
	    data:JSON.stringify(jsonParam),
	    success:function(result){   //此函数在服务器执行成功时被调用，参数result是服务器返回的值  
	    	_temp = result;
	    }  
    });
    return _temp;
 }

function myehr_getInitData_field(dt){
	var  _temp = null;
	$.ajax({  
        url: '/myehr/FieldList/findSelectInitData.action?fieldId='+dt,  
        async:false, //是否为异步操作  
	    cache:false,    //是否缓存结果  
	    type:"POST",    //请求方式  
	    dataType:"json",    //服务器返回数据是什么类型  
	    success:function(result){   //此函数在服务器执行成功时被调用，参数result是服务器返回的值  
	    	_temp = result;
	    }  
    });
    return _temp;
}

function myehr_getInitData_form(dt,containerParam){
	var  _temp = null;
	var _param = {};
	_param.formColumnId = dt;
	_param.containerParam = containerParam;
	$.ajax({  
        url: '/myehr/form/findSelectInitData.action?formColumnId='+dt,  
        async:false, //是否为异步操作  
        data: JSON.stringify(_param),
	    cache:false,    //是否缓存结果  
	    type:"POST",    //请求方式  
	    contentType: 'application/json;charset=utf-8',
	    dataType:"json",    //服务器返回数据是什么类型  
	    success:function(result){   //此函数在服务器执行成功时被调用，参数result是服务器返回的值  
	    	_temp = result;
	    }  
    });
    return _temp;
 }

function myehr_initSelect(params,dataField,containerParam,dataString){
	var str = [];
	var obj = document.getElementById(params.id);
	if(obj!=undefined&&obj!=null){
		obj.options.length=0;
	}
	
	
	if(dataField!=undefined){
		str = dataField.split("_");
	}
	if(dataString!=undefined && dataString!=""){
		var data =  eval(dataString);
		for(var i=0;i<data.length;i++){
			document.getElementById(params.id).options.add(new Option(data[i].text,data[i].id));
		}
		return;
	}else if(str.length!=0){
		if(str.length==1||str[0]==("dict")||str[0]==("dictList")){
			var data = myehr_getSelectjsonData(params.url,params.jsonParam);
		}else{
			if(str.length>2&&str[1]==("form")){
				var data = myehr_getInitData_form(str[2],containerParam);
			}else{
				var data = myehr_getInitData_field(str[2]);
			}
		}
	}
	
	var dictDatas= [];
	if(params.id=="SYS_COMMON_YES_NO"){
		for(var i=data.length;i>0;i--){
			document.getElementById(params.id).options.add(new Option(data[i-1].text,data[i-1].id));
		}
	}else if(params.dictData!=undefined){
		dictDatas=params.dictData.split(",");
		if(params.jsonParam.dictTypeCode==dictDatas[0]){
			for(var j=1;j<dictDatas.length;j++){
				for(var i=0;i<data.length;i++){
					if(dictDatas[j]== data[i].id){
						if(data[i].id==params.value){
							document.getElementById(params.id).options.add(new Option(data[i].text,data[i].id,true,true));
						}else{
							document.getElementById(params.id).options.add(new Option(data[i].text,data[i].id));
						}
					}
				}	
			}
		}else{
			for(var i=0;i<data.length;i++){
				if(data[i].id==params.value){
					document.getElementById(params.id).options.add(new Option(data[i].text,data[i].id,true,true));
				}else{
					document.getElementById(params.id).options.add(new Option(data[i].text,data[i].id));
				}
				
			}	
		}
		$('.selectpicker').selectpicker('refresh');
	}else{
		for(var i=0;i<data.length;i++){
			if(data[i].id==params.value){
				document.getElementById(params.id).options.add(new Option(data[i].text,data[i].id,true,true));
			}else{
				document.getElementById(params.id).options.add(new Option(data[i].text,data[i].id));
			}
		}	
		$('.selectpicker').selectpicker('refresh');
	}
}
function myehr_initSelectMore(params,dataField){
	var data = myehr_getSelectjsonData(params.url,params.jsonParam);
	if(params.id=="SYS_COMMON_YES_NO"){
		for(var i=data.length;i>0;i--){
			document.getElementById(params.id).options.add(new Option(myehr_getSelectjsonData(params.url,params.jsonParam)[i-1].text,myehr_getSelectjsonData(params.url,params.jsonParam)[i-1].id));
		}
	}else{
		var txt='';
		for(var i = 1;i <data.length;i++){
			txt += '<option value='+ data[i].id +'>' + data[i].text +'</option>';
		}
		document.getElementById(params.id).innerHTML=txt;
		$('.selectpicker').selectpicker('refresh');	
	}
}

function myehr_initSelect_sql(id,sql){
	var data = myehr_getInitData_sql(sql);
	for(var i=0;i<data.length;i++){
		document.getElementById(id).options.add(new Option(data[i].text,data[i].id));
	}
	$('.selectpicker').selectpicker('refresh');
}
function myehr_getInitData_sql(sql){
	var  _temp = sql;
	var datas = [];
	$.ajax({  
        url: '/myehr/dict/findSelectInitDataBysql.action?dataBySql='+_temp,  
        async:false, //是否为异步操作  
	    cache:false,    //是否缓存结果  
	    type:"POST",    //请求方式  
	    dataType:"json",    //服务器返回数据是什么类型  
	    success:function(result){   //此函数在服务器执行成功时被调用，参数result是服务器返回的值  
	    	datas = result;
	    }  
    });
    return datas;
 }
function myehr_SQLFORBID_sql(sql){
	var  _temp = sql;
	var datas = [];
	$.ajax({  
        url: '/myehr/dict/getDataBySql.action?dataBySql='+encodeURIComponent(_temp),  
        async:false, //是否为异步操作  
	    cache:false,    //是否缓存结果  
	    type:"POST",    //请求方式  
	    dataType:"json",    //服务器返回数据是什么类型  
	    success:function(result){   //此函数在服务器执行成功时被调用，参数result是服务器返回的值  
	    	datas = result;
	    }  
    });
    return datas;
 }

function myehr_initSelect_color(params,dataField,containerParam,dataString){
	var str = [];
	var obj = document.getElementById(params.id);
	var data = myehr_getSelectjsonData(params.url,params.jsonParam);
	var dictDatas= [];
	for(var i=0;i<data.length;i++){
		if(data[i].text.split("_")[0]=='渐变'){
			$("#"+params.id).append("<option value=\""+data[i].id+"\">"+data[i].text+"</option>\n");
		}else{
			$("#"+params.id).append("<option style=\"background-color:"+data[i].id+";height:20px;margin:5px\" value=\""+data[i].id+"\">"+data[i].text+"</option>\n");
		}
		
	}	
}
