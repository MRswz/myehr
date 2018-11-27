<%@ page language="java" import="java.util.*" import="com.myehr.common.util.LangUtil" pageEncoding="UTF-8"%>
<%@ include file="/common/common.jsp" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<body style="text-align:center">
<div class="container-fluid">
	<div style="margin-top:20px;">
		<table style="width:100%;table-layout:fixed;" class="cbs-table" id = "frontParam">
		</table>
	</div>
	<div style="margin:0 auto">
		<div style="margin-right:10px;display:inline-block">
		    <input type="button" id="save"  class="btn btn-primary" value="确定" onclick="sure()"/>
		</div>
		<div style="margin-right:10px;display:inline-block">
		    <input type="button" id="closex"  class="btn btn-primary" value="关闭" onclick="closex()"/>
		</div>
	</div>
</div>
<script type="text/javascript">
var parame={
		id:'',
		value:"N",
		width: "100px",  
		height:"45px",
		url:'/myehr/dict/searchSysDictEntryTypeCode.action?userId=1',
		jsonParam:{},
		formType:'',
		chang:function (e){
			var aaa = e;
		}
};
$(function() {
	buildForm();
	$('.form_date1').datetimepicker({ 
		 language:  'zh-CN',  
		 format:"yyyy-mm-dd",  
		 weekStart: 1,  
		 todayBtn:  1,  
		 autoclose: 1,  
		 todayHighlight: 1,  
		 startView: 2,  
		 minView: 2,  
		 forceParse: 0,  
		 pickerPosition: "bottom-left"  
		});  
		$('.form_date2').datetimepicker({ 
		 language:  'zh-CN',  
		 format:"yyyy-mm-dd hh:ii",  
		 weekStart: 1,  
		 todayBtn:  1,  
		 autoclose: 1,  
		 todayHighlight: 1,  
		 startView: 2,  
		 minView: 0,  
		 forceParse: 0,  
		 pickerPosition: "bottom-left"  
		});  
		$('.form_date3').datetimepicker({ 
		 language:  'zh-CN',  
		 format:"hh:ii",  
		 weekStart: 1,  
		 todayBtn:  1,  
		 autoclose: 1,  
		 todayHighlight: 1,  
		 startView: 0,  
		 minView: 2,  
		 forceParse: 0,  
		 pickerPosition: "bottom-left"  
		});  
		$('.form_date4').datetimepicker({ 
		 language:  'zh-CN',  
		 format:"yyyy-mm-dd",  
		 weekStart: 1,  
		 todayBtn:  1,  
		 autoclose: 1,  
		 todayHighlight: 1,  
		 startView: 4,  
		 minView: 4,  
		 forceParse: 0,  
		 pickerPosition: "bottom-left"  
		});
	
})
window.onload=function(){
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
		parame.jsonParam.dictTypeCode=$(classes[i]).attr('DictName');
		if(type=="true"){
			myehr_initSelectMore(parame,dataField);
		}else{
			myehr_initSelect(parame,dataField);
		}
	}
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
	var paramNum = 0;
	var data = [];
	var dataType = [];
	var flagnum = 0;//统计待传参数
	var flagnum1 = 0;//统计请求参数
	//根据传入参数,生成页面
	function buildForm(){
		for(var i = 0 ; ;i++){
			var getParamInfo = GetQueryString("param_"+i);

			if(getParamInfo!=null){

				var htmlTr = "<tr style=\"height:40px;padding:5px;line-height:0px\">\n";
			//获取参数信息
			$.ajax({
				url:'/myehr/param/getParamInfo.action?paramCode='+getParamInfo,
				type:'post',
				cache: false,
				async: false,
				contentType: 'application/json;charset=utf-8',
				success: function (datas) {
						if(datas.sqlParamsType=="request"){
							data[i]=datas.sqlParamsValue;
							dataType[i]=datas.sqlParamsType;
							flagnum1++;
						}else{
							//取到过滤参数信息
							htmlTr = htmlTr + "<td style=\"padding-left:10px;\"  width=\"150\"  ><lable>"+datas.paramName+": </lable></td>\n";
							if(datas.paramGuiType=="1"){
								htmlTr = htmlTr + "<td style=\"padding-left:10px;\"  align=\"left\"><input id=\"\" name=\"\" type=\"text\" class=\"form-control\" style=\"width:200px;\"/></td>\n";
							}else if(datas.paramGuiType=="2"){
								htmlTr = htmlTr + "<td style=\"padding-left:10px;\"  align=\"left\"><select id=\""+getParamInfo+"\" styleType=\"select\" name=\"\"  class=\"form-control\" style=\"width:200px;\" DictName=\""+datas.paramInitValue+"\" dataField=\""+datas.paramInitType+"_form_"+datas.paramFormColumnId+"\"></select></td>\n";
							}else if(datas.paramGuiType=="6"){
								htmlTr = htmlTr + "<td style=\"padding-left:10px;\"  align=\"left\"><div class='controls input-append date "+datas.paramClassType+"' data-date=\"\"  data-link-field=\"dtp_input2\" style=\"float:left;\">\n<input type='text' readonly class=\"form-control \" dateType=\"controls input-append date "+datas.paramClassType+"\"  styleType=\"dateTime\"   style=\"width:134px;\" />\n<span class=\"add-on\"><i class=\"icon-remove\"></i></span>\n<span class=\"add-on\" style=\"margin-right:70px\"><i class=\"icon-th\"></i></span>\n</div></div></td>\n";
							}else if(datas.paramGuiType=="x"){
								htmlTr = htmlTr + "<td style=\"padding-left:10px;\"  align=\"left\"  ><input id=\""+paramCode+"\" name=\""+paramCode+"\" type=\"text\" class=\"form-control\" style=\"width:200px;\"/></td>\n";
							}
							flagnum++;
						}	
					}
				});
			htmlTr = htmlTr + "</tr>\n";
			$("#frontParam").append(htmlTr);
			}else{
				break;
			}
		}
		if(flagnum==0){
			window.parent.initFilterParam(dataType,data);
			closex();
		}
	}

	//获取url参数(filterName/paramType)
	function GetQueryString(key){
	        var reg = new RegExp("(^|&)"+key+"=([^&]*)(&|$)");
	        var result = window.location.search.substr(1).match(reg);
	        return result?decodeURIComponent(result[2]):null;
	      }
	      
	function sure(){
		var trArr = $("#frontParam").find("tr");
		for(var i = flagnum1 ;i<trArr.size();i++){
			if(trArr.eq(i).find("select").val()!=undefined){
				data[i]=trArr.eq(i).find("select").val();
			}else if(trArr.eq(i).find("input").val()!=undefined){
				data[i]=trArr.eq(i).find("input").val();
			}
		}
		window.parent.initFilterParam(dataType,data);
		closex();
	}
	
	function closex(){
		var index = parent.layer.getFrameIndex(window.name);  
	   	parent.layer.close(index); 
	}

</script>
</body>
</html>