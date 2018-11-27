<%@ page language="java" import="java.util.*" import="com.myehr.common.util.LangUtil" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
	<link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/animate.css" rel="stylesheet">
    <link href="css/style.css" rel="stylesheet">
    <script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
</head>
<body style="text-align:center">
<form id="form_673" name="form_673" >
<div class="container-fluid" style="overflow-y:auto;">
	<div class="my_card" style="margin-top:5px;">
<input id="ORG_COMPANY.ORGCOMPANY_compid_673" name="ORGCOMPANY_compid" type="hidden" class="form-control"  style="width:200px; float:left"/><span style='color:red;line-height:35px;font-size:27px'></span>
<input id="ORG_COMPANY.ORGCOMPANY_orggroup1_673" name="ORGCOMPANY_orggroup1" type="hidden" class="form-control"  style="width:200px; float:left"/><span style='color:red;line-height:35px;font-size:27px'></span>
<input id="ORG_COMPANY.ORGCOMPANY_orggroup2_673" name="ORGCOMPANY_orggroup2" type="hidden" class="form-control"  style="width:200px; float:left"/><span style='color:red;line-height:35px;font-size:27px'></span>
<input id="ORG_COMPANY.ORGCOMPANY_orggroup3_673" name="ORGCOMPANY_orggroup3" type="hidden" class="form-control"  style="width:200px; float:left"/><span style='color:red;line-height:35px;font-size:27px'></span>
<input id="ORG_COMPANY.ORGCOMPANY_orggroup4_673" name="ORGCOMPANY_orggroup4" type="hidden" class="form-control"  style="width:200px; float:left"/><span style='color:red;line-height:35px;font-size:27px'></span>
<input id="ORG_COMPANY.ORGCOMPANY_orggroup5_673" name="ORGCOMPANY_orggroup5" type="hidden" class="form-control"  style="width:200px; float:left"/><span style='color:red;line-height:35px;font-size:27px'></span>
<input id="ORG_COMPANY.ORGCOMPANY_updatetime_673" name="ORGCOMPANY_updatetime" type="hidden" class="form-control"  style="width:200px; float:left"/><span style='color:red;line-height:35px;font-size:27px'></span>
<input id="ORG_COMPANY.ORGCOMPANY_zuid_673" name="ORGCOMPANY_zuid" type="hidden" class="form-control"  style="width:200px; float:left"/><span style='color:red;line-height:35px;font-size:27px'></span>
<input id="ORG_COMPANY.ORGCOMPANY_orgcode_673" name="ORGCOMPANY_orgcode" type="hidden" class="form-control"  style="width:200px; float:left"/><span style='color:red;line-height:35px;font-size:27px'></span>
		<div class='row cell'>
<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
<lable style="float:left"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"公司编码")%>: </lable><input id="ORG_COMPANY.ORGCOMPANY_compcode_673" name="ORGCOMPANY_compcode" type="text" class="form-control"  vtype="illegalChar;maxLength:50;minLength:null;"  style="width:200px; float:left"/><span style='color:red;line-height:35px;font-size:27px'></span>
</div>
</div>
<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
<lable style="float:left"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"中文名称")%>: </lable><input id="ORG_COMPANY.ORGCOMPANY_cname_673" name="ORGCOMPANY_cname" type="text" class="form-control"  vtype="illegalChar;maxLength:200;minLength:null;"  style="width:200px; float:left"/><span style='color:red;line-height:35px;font-size:27px'></span>
</div>
</div>
<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
<lable style="float:left"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"英文名称")%>: </lable><input id="ORG_COMPANY.ORGCOMPANY_ename_673" name="ORGCOMPANY_ename" type="text" class="form-control"  vtype="illegalChar;maxLength:200;minLength:null;"  style="width:200px; float:left"/><span style='color:red;line-height:35px;font-size:27px'></span>
</div>
</div>
<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
<lable style="float:left"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"上级公司")%>: </lable>						<select id="ORG_COMPANY.ORGCOMPANY_parentid_673" title="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"上级公司")%>" styleType="select" name="ORGCOMPANY_parentid"  class="form-control selectpicker bla bla bli" data-live-search="true" emptyText=""  style="width:200px;" textField="dictName" valueField="dictId" DictName="COMPTRADE" nullItemText="" dataField="dicts_form_20754"initParam = "_"></select></div>
</div>
<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
<lable style="float:left"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"公司类型")%>: </lable><label for="ORG_COMPANY.ORGCOMPANY_comptype_673"></label>
					<select id="ORG_COMPANY.ORGCOMPANY_comptype_673" title="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"公司类型")%>" name="ORGCOMPANY_comptype"  class="selectpicker bla bla bli" multiple data-live-search="true" emptyText="请选择..."  style="width:200px;" textField="dictName" valueField="dictID" DictName="COMPTYPE" nullItemText="请选择..." dataField="dicts_form_20755" multiSelect="true"initParam = "_"></select></div>
</div>
<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
<lable style="float:left"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"公司区域")%>: </lable>						<select id="ORG_COMPANY.ORGCOMPANY_comparea_673" title="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"公司区域")%>" styleType="select" name="ORGCOMPANY_comparea"  class="form-control " emptyText="请选择..."  style="width:200px;" textField="dictName" valueField="dictID" DictName="COMPAREA" nullItemText="请选择..." dataField="dicts_form_20756"initParam = "_"></select></div>
</div>
<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
<lable style="float:left"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"公司行业")%>: </lable>						<select id="ORG_COMPANY.ORGCOMPANY_comptrade_673" title="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"公司行业")%>" styleType="select" name="ORGCOMPANY_comptrade"  class="form-control " emptyText="请选择..."  style="width:200px;" textField="dictName" valueField="dictID" DictName="COMPTRADE" nullItemText="请选择..." dataField="dicts_form_20757"initParam = "_"></select></div>
</div>
<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
<lable style="float:left"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"成立日期")%>: </lable>
					<div class='controls input-append date form_date1' data-date=""  data-link-field="dtp_input2" data-link-format="yyyy-mm-dd" style="float:left;">
						<input type='text' readonly class="form-control " dateType="controls input-append date form_date1" id="ORG_COMPANY.ORGCOMPANY_createdate_673" styleType="dateTime"   style="width:134px;float:left;" name="ORGCOMPANY_createdate"  format="yyyy-MM-dd" valueformat="yyyy-MM-dd"  timeFormat="HH:mm:ss"  showClearButton="true" showTodayButton="true"/>
							<span class="add-on"><i class="icon-remove"></i></span>
							<span class="add-on" style="margin-right:70px"><i class="icon-th"></i></span>
					</div></div>
</div>
<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
<lable style="float:left"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"是否失效")%>: </lable>						<select id="ORG_COMPANY.ORGCOMPANY_isdisabled_673" title="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"是否失效")%>" styleType="select" name="ORGCOMPANY_isdisabled"  class="form-control " emptyText="请选择..."  style="width:200px;" textField="dictName" valueField="dictID" DictName="att_yes_no" nullItemText="请选择..." dataField="dicts_form_20764"initParam = "_"></select></div>
</div>
<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
<lable style="float:left"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"失效日期")%>: </lable>
					<div class='controls input-append date form_date1' data-date=""  data-link-field="dtp_input2" data-link-format="yyyy-mm-dd" style="float:left;">
						<input type='text' readonly class="form-control " dateType="controls input-append date form_date1" id="ORG_COMPANY.ORGCOMPANY_disableddate_673" styleType="dateTime"   style="width:134px;float:left;" name="ORGCOMPANY_disableddate"  format="yyyy-MM-dd" valueformat="yyyy-MM-dd"  timeFormat="HH:mm:ss"  showClearButton="true" showTodayButton="true"/>
							<span class="add-on"><i class="icon-remove"></i></span>
							<span class="add-on" style="margin-right:70px"><i class="icon-th"></i></span>
					</div></div>
</div>
<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
<lable style="float:left"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"法人")%>: </lable><input id="ORG_COMPANY.ORGCOMPANY_legalperson_673" name="ORGCOMPANY_legalperson" type="text" class="form-control"  vtype="illegalChar;maxLength:200;minLength:null;"  style="width:200px; float:left"/><span style='color:red;line-height:35px;font-size:27px'></span>
</div>
</div>
<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
<lable style="float:left"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"公司地址")%>: </lable><input id="ORG_COMPANY.ORGCOMPANY_orgaddress_673" name="ORGCOMPANY_orgaddress" type="text" class="form-control"  vtype="illegalChar;maxLength:200;minLength:null;"  style="width:200px; float:left"/><span style='color:red;line-height:35px;font-size:27px'></span>
</div>
</div>
<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
<lable style="float:left"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"注册地址")%>: </lable><input id="ORG_COMPANY.ORGCOMPANY_regaddress_673" name="ORGCOMPANY_regaddress" type="text" class="form-control"  vtype="illegalChar;maxLength:200;minLength:null;"  style="width:200px; float:left"/><span style='color:red;line-height:35px;font-size:27px'></span>
</div>
</div>
<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
<lable style="float:left"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"联系电话")%>: </lable><input id="ORG_COMPANY.ORGCOMPANY_telphone_673" name="ORGCOMPANY_telphone" type="text" class="form-control"  vtype="illegalChar;maxLength:200;minLength:null;"  style="width:200px; float:left"/><span style='color:red;line-height:35px;font-size:27px'></span>
</div>
</div>
<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
<lable style="float:left"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"传真")%>: </lable><input id="ORG_COMPANY.ORGCOMPANY_fax_673" name="ORGCOMPANY_fax" type="text" class="form-control"  vtype="illegalChar;maxLength:200;minLength:null;"  style="width:200px; float:left"/><span style='color:red;line-height:35px;font-size:27px'></span>
</div>
</div>
<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
<lable style="float:left"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"邮编")%>: </lable><input id="ORG_COMPANY.ORGCOMPANY_postcode_673" name="ORGCOMPANY_postcode" type="text" class="form-control"  vtype="illegalChar;maxLength:200;minLength:null;"  style="width:200px; float:left"/><span style='color:red;line-height:35px;font-size:27px'></span>
</div>
</div>
<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
<lable style="float:left"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"网站")%>: </lable><input id="ORG_COMPANY.ORGCOMPANY_website_673" name="ORGCOMPANY_website" type="text" class="form-control"  vtype="illegalChar;maxLength:200;minLength:null;"  style="width:200px; float:left"/><span style='color:red;line-height:35px;font-size:27px'></span>
</div>
</div>
<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
<lable style="float:left"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"排序")%>: </lable><input id="ORG_COMPANY.ORGCOMPANY_xorder_673" name="ORGCOMPANY_xorder" type="text" class="form-control"  vtype="illegalChar;maxLength:10;minLength:null;"  style="width:200px; float:left"/><span style='color:red;line-height:35px;font-size:27px'></span>
</div>
</div>
<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
<lable style="float:left"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"备注")%>: </lable><input id="ORG_COMPANY.ORGCOMPANY_remark_673" name="ORGCOMPANY_remark" type="text" class="form-control"  vtype="illegalChar;maxLength:200;minLength:null;"  style="width:200px; float:left"/><span style='color:red;line-height:35px;font-size:27px'></span>
</div>
</div>
		</div>
		<div class="BTNGROUP BTNGROUP_673" style="margin:0 auto; display:inline-block;height: 35px;">
			<div style="margin-right:10px;display:inline-block">
			    <input type="button" id="save_formORG_COMPINFO"  class="btn btn-primary" style="background-color:#99FF99;border:none" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"保存(卡片式)")%> onclick="save_formORG_COMPINFO_click_673()"/>
			</div>
			<div style="margin-right:10px;display:inline-block">
			    <input type="button" id="closeORG_COMPINFO"  class="btn btn-primary" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"关闭")%> onclick="closex_673()"/>
			</div>
		</div>
<div id="activity_pane" style="position:absolute;left:500px;top:70px;"></div>
</div>
</div>
</form>
<script>
var parame={
				id:'',
				value:"N",
				width: "100px",  
				height:"45px",
				url:'${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode.action?userId=${sessionScope.userid}',
				jsonParam:{},
				formType:'${param.formType}',
				chang:function (e){
					var aaa = e;
				}
};

var containerParam ={};
containerParam ={};
$(function () {  
if('isView'=='${param.isView}'){
	$('input,select,textarea').each(function(){
		$(this).attr('disabled',"true");
		$(this).css('border','none');
		if($(this).attr('styletype')=='dateTime'){
			$(this).next().css('display',"none");
			$(this).next().next().css('display',"none");
			var width = $(this).width()+90;
			$(this).css('width',width+'px');
		}
	});
	$(".BTNGROUP_673").css("display","none");
}
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
			 format:"yyyy/mm/dd",  
			 weekStart: 1,  
			 todayBtn:  1,  
			 autoclose: 1,  
			 todayHighlight: 1,  
			 startView: 2,  
			 minView: 2,  
			 forceParse: 0,  
			 pickerPosition: "bottom-left"  
			});  
			$('.form_date5').datetimepicker({ 
			 language:  'zh-CN',  
			 format:"yyyymm",  
			 weekStart: 1,  
			 todayBtn:  1,  
			 autoclose: 1,  
			 todayHighlight: 1,  
			 startView: 3,  
			 minView: 3,  
			 forceParse: 0,  
			 pickerPosition: "bottom-left"  
			});  
});
function getdata_673(buttonId,formId){
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
		  if(value!=null){
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
		    var mh2=value.lastIndexOf(":");
		    var ss=value.substr(parseInt(mh2)+1);
		    if(type == 1){
			        return year+"-"+month+"-"+day;
		    }else if(type == 2){
			        return year+"-"+month+"-"+day+" "+hh+":"+mm;
		    }else if(type == 3){
			        return hh+":"+mm;
		    }else if(type == 4){
			        return year+"/"+month+"/"+day;
		    }else if(type == 5){
			        return year+month;
		    }
		  }
	}
	var _formId_673='673';
	window.onload=function(){
	var classes = [];
		if('${param.formType}'=='APP'){
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
			myehr_initSelectMore(parame,dataField,containerParam);
		}else{
			myehr_initSelect(parame,dataField,containerParam);
		}
	}


		_initData(null);
	}

	function save_formORG_COMPINFO_click_673(){
		var paramsMap = {};

		var _param = {};
		_param.formId=_formId_673;
		_param.buttonId=1714;
		_param = getdata_673(_param.buttonId,_formId_673);
		_param.paramsMap = paramsMap
		if(checkNull("#form_673")){
		}else{
		$.ajax({
			url:'${pageContext.request.contextPath }/form/saveButtonSave.action',
			type:'post',
			data: JSON.stringify(_param),
			cache: false,
			contentType: 'application/json;charset=utf-8',
			success: function (text) {
			if(text[0]=='000000' || text[1]=='保存成功'){
				alert("<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"操作成功！")%>");
				closex_673()
			}else if(text[0]=='error'){
			    if(text.length>1 &&text[0]=='error'){
					alert(text[1]);
			    }else{
					alert("<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"操作异常")%>");
			    }
			}else {
				alert("<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"保存失败")%>");
			}
			}
		});
		}
	}
	function checkNull(id){
		var xxx = "";
		var flag = false;
		$(id).find("input,select").each(function(){
			if($(this).attr('required')!=undefined&&$(this).attr('required')=='required'){
				if($(this).val()==""){
					$(this).css('border-color','red');
					$(this).attr("placeholder","<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"此项不能为空")%>");
					flag = true;
				}else{
					$(this).css('border-color','#000');
				}
			}
			var bb=$(this).val();
			var vtype=$(this).attr('vtype');
			var vtypes= new Array();
			if(vtype!=null&&vtype!=undefined){
				vtypes=vtype.split(";");
				var re=new RegExp("[^?!@#$%\^&*()]+$");
				var errorText = "<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"包含非法字符")%>";
				if (bb !="" && bb!=null) {
					if(vtypes[0].indexOf("letter")==0){
						re = new RegExp("^[a-zA-Z\_]+$");//自定义英文
						errorText = "<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"请输入正确的英文")%>";
					}
					if(vtypes[0].indexOf("zh")==0){
						re = new RegExp("^[\u4e00-\u9fa5]+$");//自定义中文
						errorText = "<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"请输入正确的中文")%>";
					}
					if(vtypes[0].indexOf("chinaMobile")==0){
						re = /1\d{10}/;//自定义手机号码
						errorText = "<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"请输入正确的手机号码")%>";
					}
					if(vtypes[0].indexOf("chinaZipcode")==0){
						re = /[1-9]{1}(\d+){5}/;//自定义邮政编码
						errorText = "<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"请输入正确的英文")%>";
					}
					if(vtypes[0].indexOf("chinaIDNo")==0){
						re = /^(\d{15}$|^\d{18}$|^\d{17}(\d|X|x))$/;//自定义身份证号码
						errorText = "<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"请输入正确的身份证号码")%>";
					}
					if(vtypes[0].indexOf("email")==0){
						re = /^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/;//自定义邮箱
						errorText = "<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"请输入正确的邮箱")%>";
					}
					if (re.test(bb)) {
					}else{
						$(this).val('');
						$(this).css('border-color','red');
						$(this).attr("placeholder",errorText);
						flag = true
					}
				}
			}
		})
		return flag;
	}
	function _initData(pkId){
		var _param = {};
		if(pkId){
			if('${param.businessId}'!=null && '${param.businessId}'!=''){
				_param = {requestParam:{ORGCOMPANY_compid:'${param.ORGCOMPANY_compid}'},pkId:pkId,formId:_formId_673};
			}else{;
				_param = {pkId:pkId,formId:_formId_673};
			}
		}else {
			if('${param.businessId}'!=null && '${param.businessId}'!=''){
				_param = {requestParam:{compid:'${param.businessId}'},pkId:pkId,formId:_formId_673};
			}else{;
				_param = {requestParam:{ORGCOMPANY_compid:'${param.ORGCOMPANY_compid}'},pkId:pkId,formId:_formId_673};
			}
		}
		_param.containerParam = containerParam;
		var _form = getForm("#form_673");
		var _Type = getType("#form_673");
		$.ajax({
			url:'${pageContext.request.contextPath }/form/cardformInitData.action',
			type:'post',
			data: JSON.stringify(_param),
			cache: false,
			contentType: 'application/json;charset=utf-8',
			success: function (text) {
				if(text.rows&&text.rows.length>0){
						 var object = text.rows[0];
						 for(var key in object){
								if(_form[key]!=null&&_form[key]!="undefined"){
										if(_Type[key]=="dateTime" && object[key]!=null){
												date = object[key]+"";
												if(date.indexOf(":") > 0){
										    		date = object[key];
												}else{
										    		if(object[key]==null || object[key]==""){
														date = object[key]
													}else{
														date = new Date(object[key]).Format("yyyy-MM-dd hh:mm:ss");
													}
												}
												document.getElementById(_form[key]).value=formatDatebox(date,_form[key]);
										}else if(_Type[key]=="isSearch" && object[key]!=null){
											//document.getElementById(_form[key]).value=object[key].split(",");
											var x = (object[key]+"").split(",");
											$("#"+_form[key]).val((object[key]+"").split(","));
										}else{
												document.getElementById(_form[key]).value=object[key];
										}
								}
						}
						;
					
					if("undefined" != typeof mstTab_activechanged ){
						mstTab_activechanged();}
				} else {
					_initAfter();
				}
			},
			error: function (jqXHR, textStatus, errorThrown) {
			}
		});
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
	    var pkId = document.getElementById("ORG_COMPANY.compid_673").value;
	    $.ajax({ 
		       url:'/myehr/form/checkUniqueVerify.action?tableName='+tableName+'&fieldName='+fieldName+'&value='+value+'&pkId='+pkId+'&pkFieldName=compid',
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
	//关闭
	function closex_673(){ 
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
									for(var i=0;i<xx.length-1;i++){
										if(i<xx.length-2){
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
									for(var i=0;i<xx.length-1;i++){
										if(i<xx.length-2){
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
										for(var i=0;i<xx.length-1;i++){
											if(i<xx.length-2){
												id = id+xx[i]+"_";
											}else{
												id = id+xx[i];
											}
										}
									object[id]="dateTime";
								} 
							})
							$(formId).find("select").each(function(){
								if($(this).attr('class')=='form-control selectpicker bla bla bli'||$(this).attr('class')=='selectpicker bla bla bli'){
									var xxx = this.id.split(".")[1];
									var xx = xxx.split("_");
									var arr = [];
									var id = "";
									for(var i=0;i<xx.length-1;i++){
										if(i<xx.length-2){
											id = id+xx[i]+"_";
										}else{
											id = id+xx[i];
										}
									}
									object[id]="isSearch";
								}
							})
						return object;
			}
</script>
</body>
</html>
