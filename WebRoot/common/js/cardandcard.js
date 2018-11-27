

//收起展开触发事件
function changeFunction(e){
	Currentpage2 = 0;
	loadDataStart3(e);
	$("#"+e).find("[id='TEST_FEE_INFO_FORM2']").css("display","block");
	$("#"+e).find("[id='zhankai']").attr("onclick","changeFunction2('"+e+"')");
	$("#"+e).find("[id='zhankai']").val("收起");
	changeCssForApp2();
}
function changeFunction2(e){
	Currentpage2 = 0;
	$("#"+e).find("[id='TEST_FEE_INFO_FORM2']").css("display","none");
	$("#"+e).find("[id='zhankai']").attr("onclick","changeFunction('"+e+"')");
	$("#"+e).find("[id='zhankai']").val("展开");
	changeCssForApp2();
}

//移除新增单元
function removeElement(e){
	$("#newElement"+e).remove();
}

//新增部分下拉初始化
function elementSelectInitFunction(e){
	var classes = [];
	if(''=='APP'){
		$("input").each(function(){
			if($(this).attr('dataField') != undefined){
				classes.push($(this)[0]);
			}
		})
	}else{
		classes = $("#newElement"+e).find('select');
	}
	/*for(var i=0;i<classes.length;i++){
		parame.id=classes[i].id;
		var type=$(classes[i]).attr('multiSelect');
		var dataField=$(classes[i]).attr('dataField');
		parame.placeholder="";
		parame.jsonParam.nullItemText=$(classes[i]).attr('nullItemText');
		parame.jsonParam.dictTypeCode=$(classes[i]).attr('DictName');
		if(type=="true"){
			myehr_initSelectMore(parame,dataField,containerParam);
		}else{
			myehr_initSelect(parame,dataField,containerParam);
		}
	}*/
	var columns = [];
	for(var i=0;i<classes.length;i++){
		var column = {};
		column.formColumnId = parseInt($(classes[i]).attr("columnid"));
		column.formColumnShowType = $(classes[i]).attr("shownullitem");
		column.formColumnUsName = $(classes[i]).attr("dictname");
		column.formColumnGuiType = $(classes[i]).attr("datafield1");//字典类型
		columns[i] = column;
	}
	var datas = getselectdatasAll(columns);
	for(var j=0;j<datas.length;j++){
		var data = datas[j];
//		document.getElementById(classes[j].id).options.add(new Option("请选择",""));
		for(var i=0;i<data.length;i++){
			document.getElementById(classes[j].id).options.add(new Option(data[i].name,data[i].code));
		}
	}
	$('.selectpicker').selectpicker('refresh');
	$(".bla").css("width","200px");
}
//列表数据部分下拉初始化
function elementsListSelectInitFunction(e){
	var classes = [];
	if(''=='APP'){
		$("input").each(function(){
			if($(this).attr('dataField') != undefined){
				classes.push($(this)[0]);
			}
		})
	}else{
		classes = $(e).parent().parent().find('select');
	}
	/*for(var i=0;i<classes.length;i++){
		parame.id=classes[i].id;
		var type=$(classes[i]).attr('multiSelect');
		var dataField=$(classes[i]).attr('dataField');
		parame.placeholder="";
		parame.jsonParam.nullItemText=$(classes[i]).attr('nullItemText');
		parame.jsonParam.dictTypeCode=$(classes[i]).attr('DictName');
		if(type=="true"){
			myehr_initSelectMore(parame,dataField,containerParam);
		}else{
			myehr_initSelect(parame,dataField,containerParam);
		}
	}*/
	var columns = [];
	for(var i=0;i<classes.length;i++){
		var column = {};
		column.formColumnId = parseInt($(classes[i]).attr("columnid"));//字段ID
		column.formColumnShowType = $(classes[i]).attr("shownullitem");//是否空值
		column.formColumnUsName = $(classes[i]).attr("dictname");//字典编码
		column.formColumnGuiType = $(classes[i]).attr("datafield1");//字典类型
		columns[i] = column;
	}
	var datas = getselectdatasAll(columns);
	for(var j=0;j<datas.length;j++){
		var data = datas[j];
//		document.getElementById(classes[j].id).options.add(new Option("请选择",""));
		for(var i=0;i<data.length;i++){
			document.getElementById(classes[j].id).options.add(new Option(data[i].name,data[i].code));
		}
	}
	$('.selectpicker').selectpicker('refresh');
	$(".bla").css("width","200px");
}

function cardAndCardDateWidInitFunction(e){
	$(e).parent().find(".form_date1").datetimepicker({ 
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
	$(e).parent().find(".form_date2").datetimepicker({ 
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
	$(e).parent().find(".form_date3").datetimepicker({ 
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
	$(e).parent().find(".form_date4").datetimepicker({ 
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
	$(e).parent().find(".form_date5").datetimepicker({ 
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
}

function changeShowType(e){//showContent显示内容//showType显示类型
	changeFunction2(e);
	if($("#"+e).find("[id='showType']").val()=='youxiao'&&$("#"+e).find("[id='showContent']").val()=='info'){
		youxiaoFunction(e);
	}else if($("#"+e).find("[id='showType']").val()=='zuixin'&&$("#"+e).find("[id='showContent']").val()=='info'){
		zuixinFunction(e);
	}else if($("#"+e).find("[id='showType']").val()=='all'&&$("#"+e).find("[id='showContent']").val()=='info'){
		allFunction();
	}else if($("#"+e).find("[id='showType']").val()=='youxiao'&&$("#"+e).find("[id='showContent']").val()=='account'){
		youxiaoFunction(e);
		loadDataStart4(e);
	}else if($("#"+e).find("[id='showType']").val()=='zuixin'&&$("#"+e).find("[id='showContent']").val()=='account'){
		zuixinFunction(e);
		loadDataStart4(e);
	}else if($("#"+e).find("[id='showType']").val()=='all'&&$("#"+e).find("[id='showContent']").val()=='account'){
		allFunction(e);
		loadDataStart4(e);
	}
	changeCssForApp1();
}
function checkSelected(x,y,z,v,e){
	var id = x+"."+y+z+"_select";
	var obj = $("#"+e).find("[id='"+id+"']").find("option").filter(function(index, el){
				var childNodes = el.childNodes;
				return childNodes.length === 1 && childNodes[0].nodeType === 3 && childNodes[0].nodeValue === v;
			  })
    return obj;
}

function myFunction(e,name){
	var account = 0;
	var obj = $("[id='"+e.id+"']").parent().parent().parent().parent().parent().parent().parent().find("[name='"+name+"_all']");
	var objs = $("[id='"+e.id+"']").parent().parent().parent().parent().parent().parent().find("[name='"+name+"']");
	for(var i=0;i<objs.length;i++){
		if(objs[i].value!=""){
			account = account +	parseInt(objs[i].value);
		}
	}
	obj.val(account);
}

function saveElement(e,id){
	var paramsMap = {};
	var _param = {};
	_param.formId=id;
	_param = cardGetdata(e,id);
	_param.paramsMap = paramsMap
	if(checkNull_ADD(e)){
	}else{
		$.ajax({
			url:'/myehr/form/saveButtonSave.action',
			type:'post',
			data: JSON.stringify(_param),
			cache: false,
			contentType: 'application/json;charset=utf-8',
			success: function (text) {
			if(text[0]=='000000' || text[1]=='保存成功'){
				var id = $(e).parent().parent().parent().parent().parent().attr("id");
				loadDataStart3(id);
			}else if(text[0]=='error'){
			    if(text.length>1 &&text[0]=='error'){
					alert(text[1]);
			    }else{
					alert("操作异常");
			    }
			}else {
				alert("保存失败");
			}
			}
		});
	}
}
function saveElement_main(e,id){
	var paramsMap = {};
	var _param = {};
	_param.formId=id;
	_param = cardGetdata_main(e,id);
	_param.paramsMap = paramsMap
	if(checkNull(e)){
	}else{
		$.ajax({
			url:'/myehr/form/saveButtonSave.action',
			type:'post',
			data: JSON.stringify(_param),
			cache: false,
			contentType: 'application/json;charset=utf-8',
			success: function (text) {
			if(text[0]=='000000' || text[1]=='保存成功'){
				location.reload();
			}else if(text[0]=='error'){
			    if(text.length>1 &&text[0]=='error'){
					alert(text[1]);
			    }else{
					alert("操作异常");
			    }
			}else {
				alert("保存失败");
			}
			}
		});
	}
}

function deleteElement(e,id){
	var paramsMap = {};
	var _param = {};
	_param.formId=id;
	_param.params=[];
	_param.params.push(cardGetdata2(e,id));
	_param.tabparam = paramsMap
	layer.msg('确定要删除此数据', {
		  time: 0 //不自动关闭
		  ,btn: ['确定', '再想想']
		  ,success: function(layero){
				layero.find('.layui-layer-btn').css('text-align', 'center');
			}
		  ,yes: function(index){
		    layer.close(index);
			$.ajax({
				url:'/myehr/form/removeData.action',
				type:'post',
				data: JSON.stringify(_param),
				cache: false,
				contentType: 'application/json;charset=utf-8',
				success: function (text) {
					if(text!='1'){
						alert('删除失败');
					} else {
						var id = $(e).parent().parent().parent().parent().parent().attr("id");
						loadDataStart3(id);
					}
				}
			});
		  }
	});
}

//判空(通用)
function checkNull_ADD(e){
	var xxx = "";
	var flag = false;
	$(e).parent().find("input,select,textarea").each(function(){
		if($(this).attr("required")=='required'){
			if($(this).val()==""||$(this).val()==null){
				$(this).css('border-color','red');
				$(this).attr("placeholder","必填项不能为空");
				layer.alert('数据不能为空', {
					icon: 5,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
					skin: 'layer-ext-moon' 
				});
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
			var errorText = "包含非法字符";
			if (bb !="" && bb!=null) {
				if(vtypes[0].indexOf("letter")==0){
					re = new RegExp("^[a-zA-Z\_]+$");//自定义英文
					errorText = "请输入正确的英文";
				}
				if(vtypes[0].indexOf("zh")==0){
					re = new RegExp("^[\u4e00-\u9fa5]+$");//自定义中文
					errorText = "请输入正确的中文";
				}
				if(vtypes[0].indexOf("int")==0){
					//re = new RegExp("^(([1-9]+)|([0-9]+\.[0-9]{1,2}))$");//自定义字符
					re = new RegExp("^[0-9]*[1-9][0-9]*$");//自定义字符
					errorText = "请输入正确的数字";
				}
				if(vtypes[0].indexOf("naturalNumber")==0){
					re = new RegExp("^\\d*[1-9]\\d*$");//自定义字符
					errorText = "请输入正确的自然数";
				}
				if(vtypes[0].indexOf("phone")==0){
					re = /^((0\d{2,3})-)(\d{7,8})(-(\d{3,}))?$/; //自定义电话号码
					errorText = "请输入正确的电话号码";
				}
				if(vtypes[0].indexOf("chinaMobile")==0){
					re = /1\d{10}/;//自定义手机号码
					errorText = "请输入正确的手机号码";
				}
				if(vtypes[0].indexOf("chinaZipcode")==0){
					re = /[1-9]{1}(\d+){5}/;//自定义邮政编码
					errorText = "请输入正确的邮政编码";
				}
				if(vtypes[0].indexOf("chinaIDNo")==0){
					re = /^(\d{15}$|^\d{18}$|^\d{17}(\d|X|x))$/;//自定义身份证号码
					errorText = "请输入正确的身份证号码";
				}
				if(vtypes[0].indexOf("email")==0){
					re = /^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/;//自定义邮箱
					errorText = "请输入正确的邮箱";
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

function cardGetdata(e,formId){
	var classes = $(e).parent().find("select");
	var j=0;
	var Dselect = [];
	for(var i=0;i<classes.length;i++){
		if($(classes[i]).attr('disabled')=='disabled'){
			Dselect[j] = $(classes[i]);
			$(classes[i]).removeAttr('disabled');
			j++;
		}
	}
	var param = {};
	var data = {buttonId:'0',formId:formId,param:{},paramsMap:{}};
	$.map($(e).parent().serializeArray(), function(item, index){
		var property =item['name'].toUpperCase();
		var value = item['value'];
		param[property] = value;
	});
	for(var i=0;i<Dselect.length;i++){
		$(Dselect[i]).attr('disabled','disabled');
	}
	data.param = param;
	return data;
}
function cardGetdata_main(e,formId){
	var classes = $(e).parent().parent().find("select");
	var j=0;
	var Dselect = [];
	for(var i=0;i<classes.length;i++){
		if($(classes[i]).attr('disabled')=='disabled'){
			Dselect[j] = $(classes[i]);
			$(classes[i]).removeAttr('disabled');
			j++;
		}
	}
	var param = {};
	var data = {buttonId:'0',formId:formId,param:{},paramsMap:{}};
	$.map($(e).parent().parent().serializeArray(), function(item, index){
		var property =item['name'].toUpperCase();
		var value = item['value'];
		param[property] = value;
	});
	for(var i=0;i<Dselect.length;i++){
		$(Dselect[i]).attr('disabled','disabled');
	}
	data.param = param;
	return data;
}
function cardGetdata_main_act(e,formId){
	var classes = $(e).parent().parent().find("select");
	var j=0;
	var Dselect = [];
	for(var i=0;i<classes.length;i++){
		if($(classes[i]).attr('disabled')=='disabled'){
			Dselect[j] = $(classes[i]);
			$(classes[i]).removeAttr('disabled');
			j++;
		}
	}
	var param = {};
	var data = {buttonId:'0',formId:formId,param:{},paramsMap:{}};
	$.map($(e).parent().parent().serializeArray(), function(item, index){
		var property =item['name'];
		var value = item['value'];
		param[property] = value;
	});
	for(var i=0;i<Dselect.length;i++){
		$(Dselect[i]).attr('disabled','disabled');
	}
	data.param = param;
	return data;
}
function cardGetdata2(e,formId){
	var classes = $(e).parent().find("select");
	var j=0;
	var Dselect = [];
	for(var i=0;i<classes.length;i++){
		if($(classes[i]).attr('disabled')=='disabled'){
			Dselect[j] = $(classes[i]);
			$(classes[i]).removeAttr('disabled');
			j++;
		}
	}
	var param = {};
	$.map($(e).parent().serializeArray(), function(item, index){
		var property =item['name'].toUpperCase();
		var value = item['value'];
		param[property] = value;
	});
	for(var i=0;i<Dselect.length;i++){
		$(Dselect[i]).attr('disabled','disabled');
	}
	return param;
}

/*
 * mainFormElement:主表部分
 * BTNGROUP:按钮行
 * CCButton:按钮集
 * CCButtonelement:按钮集内按钮
 * CCSelect:下拉集
 * CCShow:下拉集内下拉
 * CCFubiaoTitle:附表标题
 * CCFubiao:附表
 * CCReadText:只读文本框
 */

//初始化
function changeCssForApp1(){
	if(isApp=='APP'){
		//$(".container-fluid").attr("style","");
		//$("#main_buttons").css("left","20%");
		$(".container-fluid").css("padding","0");
		$(".mainFormElement #row").css("width","300px");
		$(".BTNGROUP").css("padding","0 15px 0 0");
		$(".row").css("padding","0 15px 0 0");
		$(".CCButton").attr("style","margin-left:15px;float:left;");
		$(".CCButtonelement").css("padding","2px 10px");
		$(".CCSelect").attr("style","float:left;width: 160px;");
		$(".CCShow").css("width","75px");
		$("label").css("width","100%");
		$(".col-lg-4 col-md-4 col-sm-6 col-xs-12").attr("class","col-lg-12 col-md-12 col-sm-12 col-xs-12");
		$("[type='text']").css("width","135px");
		$(".CCFubiaoTitle").css("margin","0 0 0px 15px");
		$("#MainElement .form-control").attr("style","");
		$("#MainElement .controls").css("width","100%");
		$("#MainElement form").css("padding-right","50px");
	}
}
//展开
function changeCssForApp2(){
	if(isApp=='APP'){
		$(".col-lg-4 col-md-4 col-sm-6 col-xs-12").attr("class","col-lg-12 col-md-12 col-sm-12 col-xs-12");
		$(".CCReadText").css("width","128px");
		$(".CCFubiao label").css("width","95px");
		$(".TEST_FEE_INFO_FORM2").css("padding","0");
		$(".TEST_FEE_INFO_FORM2").css("margin","0px 0px 0px 15px");
	}
}
//修改
function changeCssForApp3(){
	if(isApp=='APP'){
		var obj = $(".CCUpdating form");
		//$("#TEST_FEE_INFO_FORM2").find("select").css("width","120px");
		obj.find("select").attr("style","width:185px;float:left;height:35px;padding:0px;border:none;background-color:rgb(255, 255, 255);");
		obj.find("[styletype='dateTime']").parent().css("width","185px");
		obj.find("[styletype='dateTime']").attr("style","float:left;height:35px;padding:0;border:none;background-color:#fff;");
		obj.find("[name='closeButton']").css("padding","1px 1px 2px 2px");
		obj.find("[dataType='text']").css("width","185px");
		obj.find("[dataType='text']").css("height","35px");
		//$("#TEST_FEE_INFO_FORM2").find("[type='number']").css("width","120px");
		obj.find("[type='number']").attr("style","width: 185px; height: 35px; padding: 0px; border: none; background-color: rgb(255, 255, 255); display: inline;");
		obj.find(".form-control").attr("style","");
		obj.find(".controls").css("width","100%");
		obj.find(".form-control").css("border","1px solid #ccc");
	}
}
function changeCssForApp4(){
	if(isApp=='APP'){
		var obj = $(".CCAdd form");
		//$("#TEST_FEE_INFO_FORM2").find("select").css("width","120px");
		obj.find("select").attr("style","width:185px;float:left;height:35px;padding:0px;border:none;background-color:rgb(255, 255, 255);");
		obj.find("[styletype='dateTime']").parent().css("width","185px");
		obj.find("[styletype='dateTime']").attr("style","float:left;height:35px;padding:0;border:none;background-color:#fff;");
		obj.find("[name='closeButton']").css("padding","1px 1px 2px 2px");
		obj.find("[dataType='text']").css("width","185px");
		obj.find("[dataType='text']").css("height","35px");
		//$("#TEST_FEE_INFO_FORM2").find("[type='number']").css("width","120px");
		obj.find("[type='number']").attr("style","width: 185px; height: 35px; padding: 0px; border: none; background-color: rgb(255, 255, 255); display: inline;");
		obj.find(".form-control").attr("style","");
		obj.find(".controls").css("width","100%");
		obj.find(".form-control").css("border","1px solid #ccc");
	}
}
function getSystemDate(){
	var date = new Date();
    var seperator1 = "-";
    var year = date.getFullYear();
    var month = date.getMonth() + 1;
    var strDate = date.getDate();
    if (month >= 1 && month <= 9) {
        month = "0" + month;
    }
    if (strDate >= 0 && strDate <= 9) {
        strDate = "0" + strDate;
    }
    var currentdate = year + seperator1 + month + seperator1 + strDate;
    return currentdate;
}
function selectSqlDictEntryByValue(id,value,dataField,DictName){
    $.ajax({
        url:'/myehr/dict/selectSqlDictEntryByValue.action?value='+value+'&dataField='+dataField+'&DictName='+DictName,
        type:'post',
        cache: false,
        contentType: 'application/json;charset=utf-8',
    	 async: false,
        success: function (data) { 
            document.getElementById(id).value=data[value];
            document.getElementById(id+"_value").value=value;
        }
    });
}
function getCheckedByNodeId(taskId,nodelId,procId){
	var checked = [];
	$.ajax({
	    url: "/myehr/FileList/getCheckedByNodeId.action?taskId="+taskId+"&nodeId="+nodelId+"&procId="+procId,
	    type: 'post',
	    cache: false,
	    async: false,
	    success: function (data) {
	    	checked=data;
	    }
	});
	return checked;
}
//getCheckedHisByNodeId
function getCheckedHisByNodeId(taskId,procId){
	var checked = [];
	$.ajax({
	    url: "/myehr/FileList/getCheckedHisByNodeId.action?taskId="+taskId+"&procId="+procId,
	    type: 'post',
	    cache: false,
	    async: false,
	    success: function (data) {
	    	checked=data;
	    }
	});
	return checked;
}
//文件下载
function showCheckedFileDate_ACT(arr,e,yulanButton,deleteButton,uploadButton,shangchuanButton,tagCode,nodeIdAndPointId) {
	var previewSrcArr = [];
	var configArr = [];
	var checkedId = $("#"+e+" .checkedId").val();
	if(arr!=null){
		for (var i = arr.length - 1; i >= 0; i--) {
			previewSrcArr[i]=arr[i].filepath;
			var obj = {};
			obj.caption = arr[i].filename+'_'+arr[i].fileid;
			obj.type = arr[i].clientfilename;
			if(obj.type=='video'){
				obj.filetype="video/"+obj.caption.split(".")[obj.caption.split(".").length-1].split("_")[0];
			}
			if(obj.type=='audio'){
				obj.filetype="audio/"+obj.caption.split(".")[obj.caption.split(".").length-1].split("_")[0];
			}
			obj.size = arr[i].file_size;
			obj.key = i;
			configArr[i] = obj;
		}
	}
	var deleteButtonAC = '';
	var uploadButtonAC = '';
	var yulanButtonAC = '';
	if(deleteButton){
		deleteButtonAC = '<button type="button" class="kv-file-remove btn btn-kv btn-default btn-outline-secondary" {dataKey} title="删除附件" onclick="deleteAction_ACT(this,\''+nodeIdAndPointId+'\',\'checked\')"><i class="glyphicon glyphicon-trash"></i></button>';
	}
	if(uploadButton){
		uploadButtonAC = '<button type="button" class="kv-file-down btn btn-kv btn-default" {dataKey} title="下载附件" onclick="getFileData_ACT(this)"><i class="fa fa-cloud-download"></i></button>';
	}
	if(yulanButton){
		yulanButtonAC = '<i class="glyphicon glyphicon-king"></i>';
	}
	
	//文件预览
	$("#"+e).find("[name='file-es[]']").fileinput({
		theme: 'fa',
		language: 'zh',
		showUpload: false,
		showCaption: false,
		browseClass: "btn btn-primary btn-lg hidden",
		fileType: "any",
		previewFileIcon: true,
		overwriteInitial: false,
		showRemove:false,
		initialPreviewAsData: true,
		initialPreview: previewSrcArr,
		initialPreviewConfig:configArr,
		allowedPreviewTypes:'',
		otherActionButtons:uploadButtonAC,
		layoutTemplates:{
			actionDelete:deleteButtonAC,
		}
	});
	if(!yulanButtonAC){
		$("button").remove(".kv-file-zoom");
	}
	if(shangchuanButton){
		$("#"+e).find("[name='file-zh[]']").fileinput({
			theme: 'fa',
			language: 'zh',
			showPreview :false,
			showCaption:false,
			allowedFileExtensions : null,
			maxFileCount:1, //表示允许同时上传的最大文件个数newFileUp
			uploadUrl: "/myehr/FileList/checkedPoint_newFileUp.action?objType=nodeId,pointId&tag="+tags+"&objId="+nodeIdAndPointId//上传的地址,执行上传文件和更新检查点文件的操作
		}).on("fileuploaded", function(event, data) {
			//window.location.reload();
			$("#testCheckedWall").prev().remove();
			$("#testCheckedWall").remove();
			setinitFileManage3();
			changeFileCss();
		});
		/*$("#"+e).find("[name='file-zh[]']").on('filebatchselected', function(event, data, previewId, index) {
			  var content = "<div id='batchUp' class='row cell' style='border:none;line-height:25px;height:95%;overflow:auto;' >\n"+
							"<div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12\">\n"+
							"<h5 class=\"tag-title\">标签</h5>\n"+
							"<input id=\"tag\" name=\"tag\" type=\"hidden\"/>\n"+
							"<div id=\"fileManage_tagType\">\n"+
							"</div>\n"+
							"</div>\n"+
							"</div>\n";
			layer.open({
				title:'选择标签',
				shadeClose: true,
				zIndex:9999,
				content: content,
				area: ['500px', '300px'],
				btn: ['确定', '取消'],
				success: function(layero, index){
					addHtml('SYS_INVESTOR_RELATIONS','fileManage_tagType');
				},
				yes: function(index, layero){
					layer.close(index);
				},
				btn2: function(index, layero){
				 
				}
			});
		});*/
	}else{
		$("#"+e).find("[name='file-zh[]']").css("display","none");
	}
	$(".checkedPointFileWall").css("display","none");
}
function openFileWall(e){
	$(e).attr("onclick","closeFileWall(this)");
	$(e).attr("class","glyphicon glyphicon-folder-open");
	$(e).parent().find(".checkedPointFileWall").css("display","block");
}
function closeFileWall(e){
	$(e).attr("onclick","openFileWall(this)");
	$(e).attr("class","glyphicon glyphicon-folder-close");
	$(e).parent().find(".checkedPointFileWall").css("display","none");
}
function changeChecked_ACT(e,type,taskId,pointId){
	if(type=='radio'){
		var isAchieve = $(e).val();
		var msgContent = '';
		var id = '';
		var isAchieveValue = ''
		if(isAchieve=='yes'){
			isAchieveValue = 'Y';
			id = $(e).next().next().val();
		}else{
			isAchieveValue = 'N';
			id = $(e).next().val();
		}
		/*layer.msg(msgContent, {
			  offset:'50%',
			  shift: 6,
			  time: 0 //不自动关闭
			  ,btn: ['确定', '再想想']
			  ,success: function(layero){
					layero.find('.layui-layer-btn').css('text-align', 'center');
			  }
			  ,yes: function(index){
		  			layer.close(index);*/ 
		var obj = {};
		obj.id = id;
		obj.taskId = taskId;
		obj.checkedpointId = pointId;
		obj.checkStatus = 'Y';
		obj.checkResult = isAchieveValue;
		obj.pointType = 'checkBox';
        $.ajax({  
            url:'/myehr/FileList/updateCheckPointResult.action',  
            type:'post',
			cache: false,
			async: false,
            contentType:'application/json',  
            data:JSON.stringify(obj),
            success:function(msg){  
                /*if(msg[0]=="0"){  
                	layer.alert('修改成功', {
                		  offset:'50%',
              		      shift: 6,
						  icon: 6,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
						  skin: 'layer-ext-moon' 
						})

                }else{  
                	layer.alert('修改失败', {
                		  offset:'50%',
              		  	  shift: 6,
						  icon: 5,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
						  skin: 'layer-ext-moon' 
						})
                }*/   
            }  
        });
		      	/*}
			  ,btn2: function(index){
				  if(isAchieve){
					  $(e).prop("checked",false);
				  }else{
					  $(e).prop("checked",true);
				  }
			  }
	      })*/
	}else if(type=='textBox'){
		var obj1 = $(e).next().next().next();
		var content = '<textarea id="checkResultModel" style="width:100%;height:100%;overflow-y:auto;">'+obj1.val()+'</textarea>';
		layer.open({
			title:'请填写审批意见',
			shadeClose: true,
			offset: 't',
			zIndex:9999,
			content: content,
			area: ['500px', '300px'],
			btn: ['确定', '取消'],
			yes:function(index, layero){
				obj1.val($("#checkResultModel").val());
				layer.close(index); 
	  			var obj = {};
	  			obj.id = $(e).next().next().val();;
	  			obj.taskId = taskId;
	  			obj.checkedpointId = pointId;
	  			obj.checkStatus = 'Y';
	  			obj.checkResult = $("#checkResultModel").val();
	  			obj.pointType = 'textBox';
	            $.ajax({  
	                url:'/myehr/FileList/updateCheckPointResult.action',  
	                type:'post',
	    			cache: false,
	    			async: false,
	                contentType:'application/json',  
	                data:JSON.stringify(obj),
	                success:function(msg){  
	                    if(msg[0]=="0"){  
	                    	layer.alert('修改成功', {
	                    		  offset:'50%',
	                  		      shift: 6,
								  icon: 6,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
								  skin: 'layer-ext-moon' 
								})
	
	                    }else{  
	                    	layer.alert('修改失败', {
	                    		  offset:'50%',
	                  		  	  shift: 6,
								  icon: 5,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
								  skin: 'layer-ext-moon' 
								})
	                    }   
	                }  
	            });
			}
		})
	}
}

function checkedPointRequire(){
	var objs = $("#testCheckedWall .checkBoxPoint");
	var flag = true;
	if(objs.length>0){
		for(var i=0;i<objs.length;i++ ){
			if(objs.eq(i).attr("isrequire")=='true'){
				if(objs.eq(i).find("[class='choosePoint']:checked").val()!='yes'&&objs.eq(i).find("[class='choosePoint']:checked").val()!='no'){
					return false;
				}
			}
		}
	}
	return flag;
}
function deleteAction_ACT(e,checkedId,type){
	var obj = $(e).parent().parent().parent().find(".file-footer-caption").eq(0);
	var title = obj.attr("title").split("_");
	var id = title[title.length-1];
	if(type=='checked'){
		$.ajax({
		    url: "/myehr/FileList/checkedPoint_deleteFile.action?fileId="+id+"&checkedId="+checkedId+"&formId="+realFormId,
		    type: 'post',
		    cache: false,
		    async: false,
		    success:function(msg){  
                if(msg[0]=="0"){  
                	layer.alert('删除成功', {
                		  offset:'50%',
              		      shift: 6,
						  icon: 6,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
						  skin: 'layer-ext-moon' 
						})
					$(e).parent().parent().parent().parent().remove();
                }else{  
                	layer.alert('删除失败', {
                		  offset:'50%',
              		  	  shift: 6,
						  icon: 5,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
						  skin: 'layer-ext-moon' 
						})
                }   
            }
		});
	}else if(type=='form'){
		$.ajax({
		    url: "/myehr/FileList/form_deleteFile.action?fileId="+id+"&formId="+realFormId,
		    type: 'post',
		    cache: false,
		    async: false
		});
	}
	//window.location.reload();
}

function getFileData_ACT(e){
	var obj = $(e).parent().parent().parent().find(".file-footer-caption").eq(0);
	var title = obj.attr("title").split("_");
	var id = title[title.length-1];
	loadFile_ACT(id);
}
function loadFile_ACT(id){
	window.open('/myehr/FileList/downLoadfile_ACT.action?FILEID='+id+'&formId='+realFormId)
}
function getUsernameById(userId){
	var fileName ="";
	$.ajax({
		url:'/myehr/form/getUsernameById.action?userId='+userId,
		type:'post',
		cache: false,
		async: false,
		success: function (obj) {
			fileName = obj.userName;
		}
	});
	return fileName;
}
function queryHisUserComment(){
	var objs ="";
	$.ajax({
		url:'/myehr/act/task/queryHisUserComment.action?procInsId='+param_procInsId+'&taskId='+param_taskId,
		type:'post',
		cache: false,
		async: false,
		success: function (obj) {
			objs = obj;
		}
	});
	return objs;
}
function changeComment(){
	var obj = queryHisUserComment();
	var cellObj = '';
	var arr = obj.rows;
	if(arr.length>0){
		for (var i = 0; i < arr.length; i++) {
			var NAME_ = '';
			if(arr.length>0&&arr[i].NAME_!=null){
				NAME_ = arr[i].NAME_;
			}
			var MESSAGE_ = '';
			if(arr.length>0&&arr[i].MESSAGE_!=null){
				MESSAGE_ = arr[i].MESSAGE_;
			}
			var ASSIGNEE_ = '';
			if(arr.length>0&&arr[i].ASSIGNEE_!=null){
				ASSIGNEE_ = getUsernameById(arr[i].ASSIGNEE_);
			}
			var END_TIME_ = '';
			if(arr.length>0&&arr[i].END_TIME_!=null){
			END_TIME_ = new Date(parseInt(arr[i].END_TIME_)).Format("yyyy/MM/dd");
			}
			cellObj +=    '<div class="col-md-12 col-sm-12 col-lg-12" name="fubiaoElement" >'+
						  '    <div class="contact-box" style="min-height:110px">'+
						  '		<form class="row cell" style="padding-right:50px">'+
						  '			<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
						  '				<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
						  '					<label style="float:left;font-size:14px;width:100px;line-height:25px">节点名称: </label>'+
						  '					<input id="NAME_'+i+'" name="NAME_" dataType="text" class="CCReadText"  value="'+NAME_+'" type="text" readonly style="width:200px;height:25px;padding:0;border:none;background-color:#fff"/>'+
						  '					<span style="color:red;"></span>'+
						  '				</div>'+
						  '			</div>'+
						  '			<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
						  '				<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
						  '					<label style="float:left;font-size:14px;width:100px;line-height:25px">审批信息: </label>'+
						  '					<input id="MESSAGE_'+i+'" name="MESSAGE_" dataType="text" class="CCReadText"  value="'+MESSAGE_+'" type="text" readonly style="width:200px;height:25px;padding:0;border:none;background-color:#fff"/>'+
						  '					<span style="color:red;"></span>'+
						  '				</div>'+
						  '			</div>'+
						  '			<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
						  '				<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
						  '					<label style="float:left;font-size:14px;width:100px;line-height:25px">审批人: </label>'+
						  '					<input id="ASSIGNEE_'+i+'" name="ASSIGNEE_" dataType="text" class="CCReadText"  value="'+ASSIGNEE_+'" type="text" readonly style="width:200px;height:25px;padding:0;border:none;background-color:#fff"/>'+
						  '					<span style="color:red;"></span>'+
						  '				</div>'+
						  '			</div>'+
						  '			<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
						  '				<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
						  '					<label style="float:left;font-size:14px;width:100px;line-height:25px">审批时间: </label>'+
						  '					<input id="END_TIME_'+i+'" name="END_TIME_" dataType="text" class="CCReadText"  value="'+END_TIME_+'" type="text" readonly style="width:200px;height:25px;padding:0;border:none;background-color:#fff"/>'+
						  '					<span style="color:red;"></span>'+
						  '				</div>'+
						  '			</div>'+
						  '		</form>'+
						  '		</div>'+
						  '</div>';
		}
		$("#CommentContent").html(cellObj);
	}
	$("#Comment").find("[id='CommentContent']").css("display","block");
	$("#Comment").find("[id='zhankai']").attr("onclick","changeComment2()");
	$("#Comment").find("[id='zhankai']").val("收起");
}
function changeComment2(e){
	Currentpage2 = 0;
	$("#Comment").find("[id='CommentContent']").css("display","none");
	$("#Comment").find("[id='zhankai']").attr("onclick","changeComment()");
	$("#Comment").find("[id='zhankai']").val("展开");
	changeCssForApp2();
}
function initPrint(){
	$("#CardAndCardForm").css("width","100%");
	$(".CCFubiaoTitle").css("margin","0 0 0 15px");
	$(".TEST_FEE_INFO_FORM2 .col-md-12 .col-lg-4").removeClass("col-xs-12");
	$(".TEST_FEE_INFO_FORM2 .col-md-12 .col-lg-4").addClass("col-xs-6");
	$(".mainFormElement .col-sm-4").addClass("col-xs-4");
	$(".mainFormElement .col-sm-8").addClass("col-xs-8");
	$("#CardAndCardForm").print({
		globalStyles:true,//是否包含父文档的样式，默认为true
		mediaPrint:false,//是否包含media='print'的链接标签。会被globalStyles选项覆盖，默认为false
		stylesheet:null,//外部样式表的URL地址，默认为null
		noPrintSelector:".fa,.BTNGROUP",//不想打印的元素的jQuery选择器，默认为".no-print"
		iframe:true,//是否使用一个iframe来替代打印表单的弹出窗口，true为在本页面进行打印，false就是说新开一个页面打印，默认为true
		append:null,//将内容添加到打印内容的后面
		prepend:null,//将内容添加到打印内容的前面，可以用来作为要打印内容
		deferred:$.Deferred()//回调函数
	}); 
	$(".CCFubiaoTitle").css("margin","0 0 -45px 15px");
	$("#CardAndCardForm").css("width","70%");
	$(".TEST_FEE_INFO_FORM2 .col-md-12 .col-lg-4").addClass("col-xs-12");
	$(".TEST_FEE_INFO_FORM2 .col-md-12 .col-lg-4").removeClass("col-xs-6");
	$(".mainFormElement .col-sm-4").removeClass("col-xs-4");
	$(".mainFormElement .col-sm-8").removeClass("col-xs-8");
}