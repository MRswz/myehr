<%@ page language="java" import="java.util.*" import="com.myehr.common.util.LangUtil" pageEncoding="UTF-8"%>
<%@ include file="/common/common.jsp" %>
<%
	String nodeId = request.getParameter("nodeId");
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<body style="text-align:center">
<form id="form_1881" name="form_1881" >
<div class="container-fluid">
	<div style="margin-top:10px;">
		<input id="SYS_SYSTEM_SCHEME.execSqlRelaid" name="execSqlRelaid" type="hidden" class="form-control"  style="width:200px;"/>
		<input id="SYS_SYSTEM_SCHEME.buttonEditorModelId" name="buttonEditorModelId" type="hidden" class="form-control"  style="width:200px;"/>
		<input id="SYS_SYSTEM_SCHEME.execSqlType" name="execSqlType" type="hidden" class="form-control"  style="width:200px;"/>
		<div style="border:1px solid #ccc; position:relative;border-radius:5px;margin-bottom:10px;padding:10px">
			<h3 style=" background:#FFF;color:blue; display:block;font-size:12;position:absolute; left:10px; top:-27px;text-align:center">富文本模板</h3>
			<div id="step2_part1" style="height:74%;padding:10px;display:block;overflow:auto">
				<div class="row cell" style="border-left:0px">
					<div id="right_part_step2" style="float:left;width: 100%;height: 100%;margin:0;">	
						<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12" style = "height:100%;">
							<div class="BTNGROUP_55" style="margin:0 auto; display:inline-block;min-height: 20px;width:100%;height:5%">
								<div style="margin-right:10px;display:inline-block">
									<input type="button" id="cleanSql"  class="btn btn-primary" value="上一个" onclick="previous()"/>
								</div>
								<div style="margin-right:10px;display:inline-block">
									<input type="button" id="cleanSql"  class="btn btn-primary" value="下一个" onclick="next()"/>
								</div>
							</div>
							<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;margin-top:10px;width:100%;height:80%">
								<input id="SYS_SYSTEM_SCHEME.EDITOR_MODEL_VALUE" name="EDITOR_MODEL_VALUE" type="hidden" class="form-control"  style=" float:left"/><span style='color:red;line-height:35px;font-size:27px'></span>
								<script type="text/plain" id="EDITOR_MODEL_VALUE" style="width:100%;height:100%;float:left"></script>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
		<div style="margin:0 auto; display:inline-block;height: 35px;">
			<div style="margin-right:10px;display:inline-block">
				<input type="button" id="save_formemp_emp_edit"  class="btn btn-primary" value="打印" onclick="save_formemp_emp_edit_click_1881()"/>
			</div>
			<div style="margin-right:10px;display:inline-block">
				<input type="button" id="closeemp_emp_edit"  class="btn btn-primary" value="关闭" onclick="closex_1881()"/>
			</div>
		</div>
	</div>
</div>

<script>
var classes = $("select");
var parame={
	id:'',
	value:"N",
	width: "100px",  
	height:"45px",
	url:'${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode.action?userId=${sessionScope.userid}',
	jsonParam:{},
	chang:function (e){
		var aaa = e;
	}
};

var EDITOR_MODEL_VALUE = UM.getEditor('EDITOR_MODEL_VALUE');
var modelHtmls = [];
var flag = 0;

$(document).ready(function(){
	var height = $(window).height()-50;
	$("#jsp").css("height","100%");
	//zTree 初始化方法
});



$(function () {  
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
});
	function getdata_1881(buttonId,formId){
		var param = {};
		var data = {buttonId:buttonId,formId:formId,param:{},paramsMap:{}};
		$.map($('[name=form_1881]').serializeArray(), function(item, index){
			var property =item['name'];
			var value = item['value'];
			param[property] = value;
		});
		var txt = EDITOR_MODEL_VALUE.getContentTxt();
		var html = EDITOR_MODEL_VALUE.getContent();
		param.buttonEditorModelValue = txt;
		param.buttonEditorModelHtml = html;
		
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
	var formId='${param.formId}';
	var containerParam={};
	window.onload=function(){
		$("#init_fun").hide();
		
		for(var i=0;i<classes.length;i++){
			parame.id=classes[i].id;
			var type=$(classes[i]).attr('multiSelect');
			parame.placeholder="";
			var dataField=$(classes[i]).attr('dataField');
			var data=$(classes[i]).attr('data')
			parame.jsonParam.dictTypeCode=$(classes[i]).attr('DictName');
			if(type=="true"){
				myehr_initSelectMore(parame,dataField,data);
			}else{
				myehr_initSelect(parame,dataField,containerParam,data);
			}
		}

		document.getElementById("SYS_SYSTEM_SCHEME.execSqlRelaid").value="${param.formButtonId}";
		document.getElementById("SYS_SYSTEM_SCHEME.execSqlType").value="${param.execSqlType}";
		var execSqlRelaid = '${param.formButtonId}';
		if(execSqlRelaid!='' && execSqlRelaid!=null){
			_initData(execSqlRelaid);
		}
	}

	function save_formemp_emp_edit_click_1881(){
		EDITOR_MODEL_VALUE.execCommand( 'print' );
	}

	function _initData(pkId){
		var execSqlRelaid = pkId;
		var _form = getForm("#form_1881");
		var _Type = getType("#form_1881");
		$.ajax({
			url:'${pageContext.request.contextPath }/button/queryEditorModel.action?execSqlRelaid='+execSqlRelaid+'&execSqlType='+'${param.execSqlType}',
			type:'post',
			//data: JSON.stringify(_param),
			cache: false,
			contentType: 'application/json;charset=utf-8',
			success: function (text) {
				if(text !=null && text!=""){
					var object = text;
					var btnCode = '${param.btnCode}';
					modelHtmls = parent.getParam();
					EDITOR_MODEL_VALUE.setDisabled();
					EDITOR_MODEL_VALUE.setContent(modelHtmls[0]);
					for(var key in object){
						if(_form[key]!=null&&_form[key]!="undefined"){
							if(key=='ruleIsexc'){
								if(object[key]==1){
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
				var obj={};
				obj.value = text.afterExecType;
				changeeSlect2(obj);
			},
			error: function (jqXHR, textStatus, errorThrown) {
			}
		});
	}
	
	function change(){
		var treeSolutionEntitySql = document.getElementById("SYS_SYSTEM_SCHEME.ruleExeSql").value;
		var content;
		$.ajax({
			url:'${pageContext.request.contextPath }/tree/getRealSql.action?treeSolutionEntitySql='+treeSolutionEntitySql,
			type:'post',
			//data: JSON.stringify(_param),
			cache: false,
			async: false,
			contentType: 'application/json;charset=utf-8',
			success: function (text) {
				content=text;
			},
			error: function (jqXHR, textStatus, errorThrown) {
			}
		});
		content = "<textarea id='xxx' rows='7' cols='63' >"+content+"</textarea>";
		layer.open({
			title:'查看SQL',
			shadeClose: true,
			zIndex:9999,
			content: content,
			area: ['500px', '300px']
		});
	}
	
	function cleanSql1(){
		EDITOR_MODEL_VALUE.setContent("");
	}
	
	//关闭
	function closex_1881(){ 
	    var index = parent.layer.getFrameIndex(window.name); //获取当前窗体索引
	    parent.layer.close(index);//执行关闭
	}
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
	
	function changeeSlect2(obj){
		if(obj.value=='self_define'){
			$("#init_fun").show();
		}else{
			$("#init_fun").hide();
		}
    };
	
	function previous(){
		if(flag==0){
			alert("已经是第一条");
		}else{
			flag--;
			EDITOR_MODEL_VALUE.setDisabled();
			EDITOR_MODEL_VALUE.setContent(modelHtmls[flag]);
		}
	}
	
	function next(){
		var length=modelHtmls.length;
		if(flag==length){
			alert("已经是最后一条");
		}else{
			flag++;
			EDITOR_MODEL_VALUE.setDisabled();
			EDITOR_MODEL_VALUE.setContent(modelHtmls[flag]);
		}
	}
	
	function change(){
		var treeSolutionEntitySql = document.getElementById("SYS_SYSTEM_SCHEME.entitySql").value;
		var content;
		$.ajax({
			url:'${pageContext.request.contextPath }/tree/getRealSql.action?treeSolutionEntitySql='+treeSolutionEntitySql,
			type:'post',
			//data: JSON.stringify(_param),
			cache: false,
			async: false,
			contentType: 'application/json;charset=utf-8',
			success: function (text) {
				content=text;
			},
			error: function (jqXHR, textStatus, errorThrown) {
			}
		});
		content = "<textarea id='xxx' rows='7' cols='63' >"+content+"</textarea>";
		layer.open({
			title:'查看SQL',
			shadeClose: true,
			zIndex:9999,
			content: content,
			area: ['500px', '300px']
		});
	}
</script>
</body>
</html>
