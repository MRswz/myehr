<%@ page language="java" import="java.util.*" import="com.myehr.common.util.LangUtil" pageEncoding="UTF-8"%>
<%@ include file="/common/cardcommon.jsp" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<body style="text-align:center">
<div class="container-fluid" style="overflow-y:auto;height:100%;">
<div style="text-align:center;width:100%;height:50px"><span id="formTitle" style="font-size:36px"></span></div><form id="form_2955" name="form_2955" style="margin-bottom:50px" >
	<div class="my_card" style="margin-top:5px;">
		<div class='row cell'>
<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">
<label style="float:left;font-size:12px;width:100px;line-height:25px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"籍贯")%>: </label>
	<select id="TEST_INFOR.TESTINFOR_jiguan_2955" size='5' title="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"籍贯")%>" multiSelect="more" styleType="select" name="TESTINFOR_jiguan"  class="form-control " emptyText=""  style="float:left;width:200px;" textField="dictName" valueField="dictId" DictName="cityCode" dataField="dicts_form_46780"initParam = "_">
	</select><span style='color:red;line-height:35px;font-size:27px'></span>
</div>
</div>
		</div>
		<div class="BTNGROUP BTNGROUP_2955" style="margin:5px auto; display:inline-block;height: 30px;z-index: 6;position: relative">
			<div style="margin-right:10px;display:inline-block">
			    <input type="button" id="save_formCard1"  class="btn btn-success" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"保存(卡片式)")%> onclick="save_formCard1_click_2955()"/>
			</div>
			<div style="margin-right:10px;display:inline-block">
			    <input type="button" id="closeCard1"  class="btn btn-primary" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"关闭")%> onclick="closex()"/>
			</div>
		</div>
<div id="activity_pane" style="position:absolute;left:500px;top:70px;"></div>
</div>
</form>
</div>
<script>
$(function () { 
		cardSelectInitFunctionxx('${param.formType}'); 
});
function getdata(buttonId,formId){
	return cardGetdata(buttonId,formId);
}
	var _formId_2955='2955';
var realFormId='${param.formId}';

function selectSqlDictEntryByValue(id,value,dataField,DictName){
    $.ajax({
        url:'${pageContext.request.contextPath }/dict/selectSqlDictEntryByValue.action?value='+value+'&dataField='+dataField+'&DictName='+DictName,
        type:'post',
        cache: false,
        contentType: 'application/json;charset=utf-8',
    	 async: false,
        success: function (data) { 
            document.getElementById(id).value=data.DICTENTRY;
            document.getElementById(id+"_value").value=value;
        }
    });
}
function initFormNameWithSelectColumn(){
    var total = '';
    var obj = document.getElementById('formTitle').innerText = total;
}
	//唯一验证
	function uniqueVerifyBlur(obj){ 
	    var id = obj.id;
	    var strs= new Array();
	    strs= id.split("\.");
	    var tableName= strs[0];
	    strs= strs[1].split("_");
	    var fieldName= strs[0];
	    var value = document.getElementById(id).value;
	    var pkId = document.getElementById("._2955").value;
	    $.ajax({ 
		       url:'/myehr/form/checkUniqueVerify.action?tableName='+tableName+'&fieldName='+fieldName+'&value='+value+'&pkId='+pkId+'&pkFieldName=',
	        type:'post',
			   cache: false,
			   contentType: 'application/json;charset=utf-8',
			   success: function (text) {
				   if(text[0]=='1'){
					   obj.value='';
					   obj.style['border-color']='red';
					   obj.setAttribute("placeholder",text[1]);
				   }
				   if(text[0]=='0'){
					   obj.style['border-color']='#CCC';
				   }
			   }
		   });
	}

	function cardSelectInitFunctionxx(){
	var classes = [];
	if(''=='APP'){
		$("input").each(function(){
			if($(this).attr('dataField') != undefined){
				classes.push($(this)[0]);
			}
		})
	}else{
		classes = $("select");
	}
	for(var i=0;i<classes.length;i++){
		parame.id=classes[i].id;
		var type=$(classes[i]).attr('multiSelect');
		var dataField=$(classes[i]).attr('dataField');
		parame.placeholder="";
		parame.jsonParam.nullItemText=$(classes[i]).attr('nullItemText');
		parame.jsonParam.dictTypeCode=$(classes[i]).attr('DictName');
		if(type=="true"){
			myehr_initSelectMore(parame,dataField,containerParam);
		}else if(type=="more"){
			myehr_initSelectMoregrade(parame,dataField,containerParam);
		}else{
			myehr_initSelect(parame,dataField,containerParam);
		}
	}
}
function myehr_initSelectMoregrade(params,dataField,containerParam){
	var data = myehr_getSelectjsonDataForMore1(params.url,params.jsonParam);
	
	var txt='';
	for(var i = 0;i <data.length;i++){
		txt += '<option class=\'G1\' value='+ data[i].id +'>' + data[i].text +'</option>';
	}
	$("[id='"+params.id+"']").append(txt);
}

$(".G1").click(function(){ 
	alert($(this).val());
});
$("select").on("change",function(){
		parame.id=$("select").attr('id');
		var type=$("select").attr('multiSelect');
		var dataField=$("select").attr('dataField');
		parame.placeholder="";
		parame.jsonParam.nullItemText=$("select").attr('nullItemText');
		parame.jsonParam.dictTypeCode=$("select").attr('DictName');
	var data = myehr_getSelectjsonDataForMore2(parame.url,parame.jsonParam,$("option:selected").val());
	var txt='';
	for(var i = 0;i <data.length;i++){
		txt += '<option class=\'G2\' value='+ data[i].id +'>--' + data[i].text +'</option>';
	}
	$("option:selected").after(txt);
	return false;
});

function myehr_getSelectjsonDataForMore1(url,jsonParam){
	var  _temp = null;
	url = '/myehr/dict/searchSysDictEntryTypeCodexx.action?userId=1';
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
	    data:JSON.stringify(jsonParam),
	    success:function(result){   //此函数在服务器执行成功时被调用，参数result是服务器返回的值  
	    	_temp = result;
	    }  
    });
    return _temp;
}
function myehr_getSelectjsonDataForMore2(url,jsonParam,pId){
	var  _temp = null;
	url = '/myehr/dict/searchSysDictEntryTypeCodexx.action?userId=1';
	url+='&pId='+pId+'&dictTypeCode='+jsonParam.dictTypeCode;
	if(jsonParam.nullItemText!=undefined){
		url+='&nullItemText='+encodeURI(jsonParam.nullItemText, "UTF-8");
	}
	$.ajax({  
        url: url,  
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
</script>
</body>
</html>
