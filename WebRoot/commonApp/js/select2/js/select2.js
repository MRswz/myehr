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
	if(jsonParam.nullItemText!=undefined){
		url+='&nullItemText='+encodeURI(jsonParam.nullItemText, "UTF-8");
	}
	$.ajax({  
        url: url,  
        async:false, //是否为异步操作  
	    cache:false,    //是否缓存结果  
	    type:"POST",    //请求方式  
	    dataType:"json",    //服务器返回数据是什么类型  
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
	if(obj.options!=undefined&&obj.options!=null){
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
	if(params.id=="SYS_COMMON_YES_NO"){
		for(var i=data.length;i>0;i--){
			document.getElementById(params.id).options.add(new Option(data[i-1].text,data[i-1].id));
		}
	}else{
		var arrData =JSON.parse(JSON.stringify(data).replace(/id/g,"value"));
		mui.init();
		console.log(arrData);
		var userPicker = new mui.PopPicker();
		userPicker.setData(arrData);
		var showUserPickerButton = document.getElementById(params.id);
		var userResult = document.getElementById(params.id);
		showUserPickerButton.addEventListener('tap', function(event) {
			userPicker.show(function(items) {
				userResult.value = items[0].text;
				//返回 false 可以阻止选择框的关闭
				//return false;
			});
		}, false);
	}
}

function myehr_initSelect_APP(params,dataField){
	var str = [];
	if(dataField!=undefined){
		str = dataField.split("_");
	}
	if(str.length!=0){
		if(str.length==1||str[0]==("dict")||str[0]==("dictList")){
			return data = myehr_getSelectjsonData(params.url,params.jsonParam);
		}else{
			if(str.length>2&&str[1]==("form")){
				return data = myehr_getInitData_form(str[2]);
			}else{
				return data = myehr_getInitData_field(str[2]);
			}
		}
	}
}

function myehr_initSelectMore(params){
	var data = myehr_getSelectjsonData(params.url,params.jsonParam);
	if(params.id=="SYS_COMMON_YES_NO"){
		for(var i=data.length;i>0;i--){
			document.getElementById(params.id).options.add(new Option(myehr_getSelectjsonData(params.url,params.jsonParam)[i-1].text,myehr_getSelectjsonData(params.url,params.jsonParam)[i-1].id));
		}
	}else{
		var txt='';
		for(var i = 0;i <data.length;i++){
			txt += '<option value='+ data[i].id +'>' + data[i].text +'</option>';
		}
		document.getElementById(params.id).innerHTML=txt;
		$('.selectpicker').selectpicker('refresh');	
	}
}