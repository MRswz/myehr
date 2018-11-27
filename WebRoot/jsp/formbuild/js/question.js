function initSingleAnwser(){
	var classes = $(".single");
	for(var i=0;i<classes.length;i++){
			parame.id=classes[i].id;
			parame.jsonParam.dictTypeCode=$(classes[i]).attr('dataField');
			myehr_initSingle(parame,dataField,i);
		}
}

function initMultipleAnwser(){
	var classes = $(".Multiple");
	for(var i=0;i<classes.length;i++){
			parame.id=classes[i].id;
			parame.jsonParam.dictTypeCode=$(classes[i]).attr('dataField');
			myehr_initMultiple(parame,dataField,i);
		}
}

function initStarAnwser(){
	var classes = $(".Star");
	for(var i=0;i<classes.length;i++){
			parame.id=classes[i].id;
			parame.jsonParam.dictTypeCode=$(classes[i]).attr('dataField');
			myehr_initStar(parame,dataField,i);
		}
}

function initDiscussAnwser(){
	var classes = $(".Discuss");
	for(var i=0;i<classes.length;i++){
			parame.id=classes[i].id;
			var dataField=$(classes[i]).attr('dataField');
			myehr_initDiscuss(parame,dataField,i);
		}
}

function myehr_initSingle(params,dataField,eqNum){
	var tempDate = myehr_getSelectjsonData(params.url,params.jsonParam);	
	var txt='';
	for(var i=0; i< tempDate.length; i++) {
        if(tempDate[i].id !== '') {
            var radiobox = $('<li><input type="radio" id='+ tempDate[i].id +' name="single'+eqNum+'"><label for='+ tempDate[i].id +'>'+ tempDate[i].id +'.'+ tempDate[i].text +'</label></li>');
            $("#"+params.id).append(radiobox);
        }
    }
}

function myehr_initMultiple(params,dataField,eqNum){
	var tempDate = myehr_getSelectjsonData(params.url,params.jsonParam);	
	var txt='';
	for(var i=0; i< tempDate.length; i++) {
        if(tempDate[i].id !== '') {
            var checkbox = $('<li><input type="checkbox" id='+ tempDate[i].id +' name="multiple'+eqNum+'"><label for='+ tempDate[i].id +'>'+ tempDate[i].id +'.'+ tempDate[i].text +'</label></li>');
            $("#"+params.id).append(checkbox);
        }
    }
}

function myehr_initDiscuss(params,dataField,eqNum){
	
    var textarea = $('<li><textarea id="discuss'+ eqNum +'" name="discuss" class="form-control" placeholder="请输入答案"></textarea></li>');
    $("#"+params.id).append(textarea);
            
}

function myehr_initStar(params,dataField,eqNum){
	
	var tempDate = myehr_getSelectjsonData(params.url,params.jsonParam);	
	var txt='<fieldset class="starability-slot">';
  
	for(var i=tempDate.length-1; i>=0; i--) {
        if(tempDate[i].id !== '') {
        	//var star = $('<li><input type="radio" id='+ tempDate[i].id +' name="single'+eqNum+'"><label for='+ tempDate[i].id +'>'+ tempDate[i].text +'</label></li>');
        	txt+=' <input type="radio" id="rate'+i+1+'-2" name="rating'+eqNum+'" value="'+i+1+'" />';
        	txt+=' <label for="rate'+i+1+'-2" title="'+ tempDate[i].text +'">'+i+1+' stars</label>';
        }
    }
	
	txt+='</fieldset>';    
	
	$("#"+params.id).append(txt);
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
	    //contentType: "application/x-www-form-urlencoded; charset=utf-8",
	    data:JSON.stringify(jsonParam),
	    success:function(result){   //此函数在服务器执行成功时被调用，参数result是服务器返回的值  
	    	_temp = result;
	    }  
    });
    return _temp;
 }