
function questionInit(){
	var param = {};
	param.id = templateId;
	var classes = [];
	if(''=='APP'){
		$("input").each(function(){
			if($(this).attr('dataField') != undefined){
				classes.push($(this)[0]);
			}
		})
	}else{
		classes = $("#question_step1 select");
	}
	for(var i=0;i<classes.length;i++){
		parame.id=classes[i].id;
		var type=$(classes[i]).attr('multiSelect');
		var dataField=$(classes[i]).attr('dataField');
		if(dataField.split("_")[2]=="0000"){
 			dataField = dataField+"|4041";
 		}
		parame.placeholder="";
		parame.jsonParam.nullItemText='请选择...';
		parame.jsonParam.dictTypeCode=$(classes[i]).attr('DictName');
		if(type=="true"){
			myehr_initSelectMore(parame,dataField);
		}else{
			myehr_initSelect(parame,dataField);
		}
	}	
	$.ajax({
		url:'/myehr/question/loadQuestioninfoByID.action',
		type:'post',
		data:JSON.stringify(param),
		contentType: 'application/json;charset=utf-8',
		cache: false,
		async: false,
		success: function (data) {
				$("#code").val(data.code);
				$("#cname").val(data.cname);
				$("#ename").val(data.ename);
				$("#begindesc").val(data.begindesc);
				$("#enddesc").val(data.enddesc);
				$("#countNumber").val(data.countNumber);
				$("#templatedesc").val(data.templatedesc);
				$("#remark").val(data.remark);
			}
		});
}
function CloseWebPage(){
	 if (navigator.userAgent.indexOf("MSIE") > 0) {
	  if (navigator.userAgent.indexOf("MSIE 6.0") > 0) {
	   window.opener = null;
	   window.close();
	  } else {
	   window.open('', '_top');
	   window.top.close();
	  }
	 }
	 else if (navigator.userAgent.indexOf("Firefox") > 0) {
	  window.location.href = 'about:blank ';
	 } else {
	  window.opener = null;
	  window.open('', '_self', '');
	  window.close();
	 }
	}
function savequestionInfo(){
	var param = {};
	var flag = false;
	param.id = templateId;
	param.code = $("#code").val();
	param.remark = $("#remark").val();
	param.cname = $("#cname").val();
	param.ename = $("#ename").val();
	param.begindesc = $("#begindesc").val();
	param.enddesc = $("#enddesc").val();
	param.countNumber = $("#countNumber").val();
	param.templatedesc = $("#templatedesc").val();
	if(updataquestion(param)){
		flag = true;
		LoadStep2();
	}
	return flag;
}

function updataquestion(param){
	var flag = false;
	$.ajax({
		url:'/myehr/question/updataQuestInfo.action',
		type:'POST',
		data: JSON.stringify(param),
	    cache: false,
	    contentType: 'application/json;charset=utf-8',
		async: false,
		success: function (data) {				
				if(data=='0'){
					layer.alert('保存失败!试卷编码重复', {
						  icon: 5,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
						  skin: 'layer-ext-moon' 
						})
				} else if(data=='2'){
					layer.alert('保存失败!试卷中存在多个此试卷编码', {
						  icon: 5,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
						  skin: 'layer-ext-moon' 
						})
				} else if(data=='1'){
					flag = true;
					layer.alert('保存成功', {
						  icon: 6,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
						  skin: 'layer-ext-moon' 
						})
				}								
			}
		});
	return flag;
}

function LoadStep2(){
	queryList();
	initDictStep2();
	countQuestionNum();
}

function initDictStep2(){
	var classes = [];
	if(''=='APP'){
		$("input").each(function(){
			if($(this).attr('dataField') != undefined){
				classes.push($(this)[0]);
			}
		})
	}else{
		classes = $("#question_step2 select");
	}
	for(var i=0;i<classes.length;i++){
		parame.id=classes[i].id;
		var type=$(classes[i]).attr('multiSelect');
		var dataField=$(classes[i]).attr('dataField');
		if(dataField.split("_")[2]=="0000"){
 			dataField = dataField+"|91";
 		}
		parame.placeholder="";
		parame.jsonParam.dictTypeCode=$(classes[i]).attr('DictName');
		parame.jsonParam.nullItemText='请选择..';
		if(type=="true"){
			myehr_initSelectMore(parame,dataField);
		}else{
			myehr_initSelect(parame,dataField);
		}
	}	
}

function refresh(){
	$("#questionList").bootstrapTable("refresh");
}

function queryList(){
	$("#questionList").bootstrapTable({  
	    url : '/myehr/question/findQuestionList.action?templateId='+templateId, 
		height : '500px',
	    queryParams :'',
	    undefinedText : '-',  
	    striped : true, // 是否显示行间隔色  
	    cache : false, // 是否使用缓存  
		async: false,
	    clickToSelect: true,
	    pagination : false,        
	    uniqueId : "id", // 每一行的唯一标识  
	    sidePagination : "server", // 服务端处理分页  
	    columns : [ 
		{  
		    field : 'state',  
		    checkbox : true,  
		    align : 'center',  
		    valign : 'middle'  
		},
		{   
		    field : 'id', 
		    visible:false
		},
	    {   
	        field : 'templateid', 
	        visible:false
	    },
	    {   
	        field : 'relationquestionid', 
	        visible:false
	    },  
		{   
	        field : 'relationanswer', 
	        visible:false
	    },  
		{   
	        field : 'isanswer', 
	        visible:false
	    },  
	    {   
	        field : 'amount', 
	        visible:false
	    },
	    {   
	        field : 'xorder', 
	        visible:false
	    },
		{   
	        field : 'remark', 
	        visible:false
	    }, 	 		
	    {  
	        title : '题目',  
	        field : 'questionid', 
	        align: 'left',
	        valign: 'middle',
	        formatter: function (value, row, index) {
	            if(value==undefined){
	                value='-';
	            }else{
					value=getNameById(value);
				}
	            return "<a  style=\"font-size:12px;text-decoration:none;color:black;\" name=\"questionid\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"题目\">"+value+"</a>";
	        }
	    }
	    
	    ],
	    onClickRow: function (row, $element) {
		        	curRow = row;
		        	$('#questionList').bootstrapTable('uncheckAll');//checkBox单选
		            showExpandInfo(row);//获取并显示字段详细信息(信息在row中)
	            },      
	    responseHandler : function(res) {  
	        return {  
	            total : res.total,  
	            rows : res.rows  
	        };  
	    },
	    onLoadSuccess : function(){
	    	$("#columnList tbody>tr").each(function(){
	    		if($(this).attr("data-uniqueid")==chooseMark){
	    			//$(this).find('input:checkbox').attr("checked","true");
	    			$(this).find('td').eq(1).click();
	    		}
	    	})
	    }
	});
}

function getNameById(value){
	var name = "";
	$.ajax({
		url:'/myehr/question/getQuestionName.action?questionid='+value,
		type:'post',
		cache: false,
		async: false,
		success: function (data) {
				name = data[0];
			}
		});
	return name;
}

function chooseQuestion(){
	var GROUPID = $("#GROUPID").val();
	var XTYPE = $("#XTYPE").val();
	var url = '';
	if(GROUPID!=""&&XTYPE!=""){//都过滤
		url = '/myehr/jsp/form/formcreate/QUESTION/chooseQuestions2.jsp?GROUPID='+GROUPID+'&XTYPE='+XTYPE+'&templateId='+templateId;
	}else if(GROUPID==""&&XTYPE!=""){//题型过滤
		url = '/myehr/jsp/form/formcreate/QUESTION/chooseQuestions3.jsp?XTYPE='+XTYPE+'&templateId='+templateId;
	}else if(GROUPID!=""&&XTYPE==""){//题目分类过滤
		url = '/myehr/jsp/form/formcreate/QUESTION/chooseQuestions1.jsp?GROUPID='+GROUPID+'&templateId='+templateId;
	}else{//不过滤
		url = '/myehr/jsp/form/formcreate/QUESTION/chooseQuestions.jsp?templateId='+templateId;
	}
	layer.open({
		type:2,
		closeBtn:1,
		shadeClose:true,
		area:['950','700'],
		maxmin:true,
		title:'选择表单',
		content:url,
		success:function(layero,index){
			$('.layui-layer-max').click();
		},
		end:function(){			}
	 }); 
}

function showExpandInfo(data){
	$("#id").val(data.id);
	$("#amount").val(data.amount);
	$("#xorder").val(data.xorder);
}

function countQuestionNum(){
	var objs = $('#questionList').bootstrapTable('getData');//获取所有数据
	var num = 0;
	for(var i=0;i<objs.length;i++){
		num += objs[i].amount;
	}
}
