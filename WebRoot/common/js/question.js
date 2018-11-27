
function initSingleAnwser(){
	var classes = $(".single");
	for(var i=0;i<classes.length;i++){
			parame.id=classes[i].id;
			var dataField=$(classes[i]).attr('dataField');
			myehr_initSingle(parame,dataField,i);
		}
}

function initMultipleAnwser(){
	var classes = $(".Multiple");
	for(var i=0;i<classes.length;i++){
			parame.id=classes[i].id;
			var dataField=$(classes[i]).attr('dataField');
			myehr_initMultiple(parame,dataField,i);
		}
}

function initStarAnwser(){
	var classes = $(".Star");
	for(var i=0;i<classes.length;i++){
			parame.id=classes[i].id;
			var dataField=$(classes[i]).attr('dataField');
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
	var tempDate = myehr_getSelectjsonData(params.url,dataField);	
	var txt='';
	for(var i=0; i< tempDate.length; i++) {
        if(tempDate[i].id !== '') {
            var radiobox = $('<li><input type="radio" id='+ tempDate[i].id +' name="single'+eqNum+'"><label for='+ tempDate[i].id +'>'+ tempDate[i].text +'</label></li>');
            $("#"+params.id).append(radiobox);
        }
    }
}

function myehr_initMultiple(params,dataField,eqNum){
	var tempDate = myehr_getSelectjsonData(params.url,dataField);	
	var txt='';
	for(var i=0; i< tempDate.length; i++) {
        if(tempDate[i].id !== '') {
            var checkbox = $('<li><input type="checkbox" id='+ tempDate[i].id +' name="multiple'+eqNum+'"><label for='+ tempDate[i].id +'>'+ tempDate[i].text +'</label></li>');
            $("#"+params.id).append(checkbox);
        }
    }
}

function myehr_initDiscuss(params,dataField,eqNum){
    var textarea = $('<textarea id="discuss'+ eqNum +'" name="discuss" class="form-control" placeholder="请输入答案"></textarea>');
    $("#"+params.id).append(textarea);
}

function myehr_initStar(params,dataField,eqNum){
	var tempDate = myehr_getSelectjsonData(params.url,dataField);	
	var txt='<fieldset id="star-num-'+eqNum+'" class="starability-slot">';
	var num = tempDate.length*30;
	for(var i=tempDate.length-1; i>=0; i--) {
        if(tempDate[i].id !== '') {
        	//var star = $('<li><input type="radio" id='+ tempDate[i].id +' name="single'+eqNum+'"><label for='+ tempDate[i].id +'>'+ tempDate[i].text +'</label></li>');
        	txt+=' <input type="radio" id="rate'+i+1+'-'+eqNum+'" name="rating'+eqNum+'" value="'+tempDate[i].id+'" />';
        	txt+=' <label for="rate'+i+1+'-'+eqNum+'" title="'+ tempDate[i].text +'">'+tempDate[i].id+' stars</label>';
        }
    }
	
	txt+='</fieldset>';    
	$("#"+params.id).append(txt);
	$("#star-num-"+eqNum).css("width",num);
}



function myehr_getSelectjsonData(url,jsonParam){
	var  _temp = null;
	url+='&questionId='+jsonParam;
	$.ajax({  
        url: encodeURI(url, "UTF-8"),  
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

var switchType = "all";
function loadDataStart(){
	if(switchType=='single'){//单题式
		//全题隐藏,显示首题,显示按钮
		$(".singleShow").css("display","none");
		$(".singleShow").eq(0).css("display","block");
		$("#nextQuestion").css("display","block");
	}else{
		$(".singleShow").css("display","block");
		$("#lastQuestion").css("display","none");
		$("#nextQuestion").css("display","none");
	}
}

function saveData(){
	var objs = getData();
	var url = "/myehr/question/saveAnswers.action";
	$.ajax({  
        url: encodeURI(url, "UTF-8"),  
        async:false, //是否为异步操作  
	    cache:false,    //是否缓存结果  
	    type:"POST",    //请求方式  
	    contentType: 'application/json;charset=utf-8',
	    data:JSON.stringify(objs),
	    success:function(data){   //此函数在服务器执行成功时被调用，参数result是服务器返回的值  
	    	if(data[0]=="success"){
	    		layer.alert('提交完成', {
					  icon: 1,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
					  skin: 'layer-ext-moon' //
					})
	    	}else if(data[0]=="error"){
	    		if(data[1]=="1"){
	    			layer.alert('答案提交异常', {
						  icon: 5,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
						  skin: 'layer-ext-moon' //
						})
	    		}else if(data[1]=="2"){
	    			layer.alert('提交空卷', {
						  icon: 5,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
						  skin: 'layer-ext-moon' //
						})
	    		}else if(data[1]=="3"){
	    			layer.alert('该用户已提交过此问卷,不可重复提交', {
						  icon: 5,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
						  skin: 'layer-ext-moon' //
						})
	    		}
	    	}
	    	
	    }  
    });
}

function getData(){
	var objs_single = $(".single");//单选
	var objs_Multiple = $(".Multiple");//多选
	var objs_Discuss = $(".Discuss");//问答
	var objs_Star = $(".Star");//星条
	var Single_answer = [];
	var Multiple_answer = [];
	var Discuss_answer = [];
	var Star_answer = [];
	var answer_objs = [];
	for(var i=0;i<objs_single.length;i++){
		$("[name='single"+i+"']").each(function(){
			var answer_obj = {};
			answer_obj.formId = formId;
			answer_obj.questionId = parseInt($(objs_single[i]).attr("datafield"));
			answer_obj.questionType = 'single';
            if($(this).prop('checked')){
				answer_obj.answer = $(this).attr('id');
				Single_answer[i] = answer_obj;
			}
        })
	}
	Array.prototype.push.apply(answer_objs, Single_answer);  
	var j = 0;
	for(var i=0;i<objs_Multiple.length;i++){
		var num = 0;
		$("[name='multiple"+i+"']").each(function(){
            if($(this).prop('checked')&&num==0){
            	var answer_obj = {};
				answer_obj.formId = formId;
				answer_obj.questionId = parseInt($(objs_Multiple[i]).attr("datafield"));
				answer_obj.questionType = 'multiple';
				answer_obj.answer = $(this).attr('id');
				Multiple_answer[j] = answer_obj;
			}else if($(this).prop('checked')&&num>0){
				j++;
				var answer_obj = {};
				answer_obj.formId = formId;
				answer_obj.questionId = parseInt($(objs_Multiple[i]).attr("datafield"));
				answer_obj.questionType = 'multiple';
				answer_obj.answer = $(this).attr('id');
				Multiple_answer[j] = answer_obj;
			}
            num++;
        })
	}
	Array.prototype.push.apply(answer_objs, Multiple_answer);
	for(var i=0;i<objs_Discuss.length;i++){
		var answer_obj = {};
		answer_obj.formId = formId;
		answer_obj.questionId = parseInt($(objs_Discuss[i]).attr("datafield"));
		answer_obj.questionType = 'discuss';
        answer_obj.answer = $("[id='discuss"+i+"']").val();
        Discuss_answer[i] = answer_obj;
	}
	Array.prototype.push.apply(answer_objs, Discuss_answer);
	
	for(var i=0;i<objs_Star.length;i++){
		$("[name='rating"+i+"']").each(function(){
			var answer_obj = {};
			answer_obj.formId = formId;
			answer_obj.questionId = parseInt($(objs_Star[i]).attr("datafield"));
			answer_obj.questionType = 'star';
            if($(this).prop('checked')){
				answer_obj.answer = $(this).val();
				Star_answer[i] = answer_obj;
			}
        })
	}
	Array.prototype.push.apply(answer_objs, Star_answer);
	return answer_objs;
}

function allReadonly(){
	$(":radio,:checkbox,textarea").attr("disabled",true); 
	$('#QuestionShow').removeAttr("disabled"); 
}

function initData(e){
	//changeModel();//改变显示模式:答题,查题
	allReadonly();//全题只读,不可操作
	var url = "/myehr/question/getAnswersByUserId.action?userId="+e+"&formId="+formId;
	$.ajax({  
        url: encodeURI(url, "UTF-8"),  
        async:false, //是否为异步操作  
	    cache:false,    //是否缓存结果  
	    type:"POST",    //请求方式  
	    success:function(data){
			setData(data);//回显数据
		}
	});
}

function setData(e){
	for(var i=0 ;i<e.length;i++){
		if(e[i].questionType == 'single'){
			$("#"+e[i].answer).attr("checked","true");
			$("#"+e[i].answer).parent().css({"background-color":"#3BB0DB","color":"#000"});
		}else if(e[i].questionType == 'multiple'){
			$("#"+e[i].answer).attr("checked","true");
			$("#"+e[i].answer).parent().css({"background-color":"#3BB0DB","color":"#000"});
		}else if(e[i].questionType == 'discuss'){
			$("[datafield='"+e[i].questionId+"']").find("textarea").val(e[i].answer);
			$("[datafield='"+e[i].questionId+"']").find("textarea").css('border-color','#3BB0DB');
		}else if(e[i].questionType == 'star'){
			$("[value='"+e[i].answer+"']").attr("checked","true");
		}
	}
}