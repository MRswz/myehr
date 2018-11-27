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


function myehr_initSelect(params){
	var data = myehr_getSelectjsonData(params.url,params.jsonParam);
	if(params.id=="SYS_COMMON_YES_NO"){
		for(var i=data.length;i>0;i--){
			document.getElementById(params.id).options.add(new Option(myehr_getSelectjsonData(params.url,params.jsonParam)[i-1].text,myehr_getSelectjsonData(params.url,params.jsonParam)[i-1].id));
		}
	}else{
		for(var i=0;i<data.length;i++){
			document.getElementById(params.id).options.add(new Option(myehr_getSelectjsonData(params.url,params.jsonParam)[i].text,myehr_getSelectjsonData(params.url,params.jsonParam)[i].id));
		}	
	}
}