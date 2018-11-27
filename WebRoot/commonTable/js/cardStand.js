//下拉参数(通用)
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

//??(通用)
var containerParam ={};


function cardIsViewFunction(){
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
}

function cardDateWidInitFunction(){
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
}

function cardGetdata(buttonId,formId){
	var classes = $("select");
	for(var i=0;i<classes.length;i++){
		$(classes[i]).removeAttr('disabled');
	}
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

//卡片日期数据赋值格式化(通用)
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

function cardSelectInitFunction(){
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
		}else{
			myehr_initSelect(parame,dataField,containerParam);
		}
	}
}

//判空(通用)
	function checkNull(id){
		var xxx = "";
		var flag = false;
		$(id).find("input,select,textarea").each(function(){
			if($(this).attr("required")=='required'){
				if($(this).val()==""||$(this).val()==null){
					$(this).css('border-color','red');
					$(this).attr("placeholder","此项不能为空");
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
						re = new RegExp("^(([1-9]+)|([0-9]+\.[0-9]{1,2}))$");//自定义字符
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
	
	//关闭(通用)
	function closex(){ 
		var index = parent.layer.getFrameIndex(window.name); //获取当前窗体索引
		parent.layer.close(index);//执行关闭
	}
	//获取卡片内各字段ID(通用)
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
					$(formId).find("textarea").each(function(){
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
//获取卡片内各字段特殊类型(通用)
function getType(formId){
				var object=[];
				$(formId).find("input").each(function(){
					var vtype = $(this).attr('format');
					var dType = $(this).attr('styleType');
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
					}else if(dType=='fileupload'){
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
						object[id]="fileupload";
					}
				})
			$(formId).find("select").each(function(){
				var vtype = $(this).attr('class')
				var xxx = this.id.split(".")[1];
				if(xxx!=undefined&&vtype.indexOf("selectpicker")!=-1){
					if($(this).attr('multiSelect')=="true"){
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
						object[id]="mupick";
					}else{
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
						object[id]="search";
					}
				}
			})
					return object;
		}
/*-------------------------------------------------------列表----------------------------------------------------*/			
function gridPatterns2(){
	$(".fixed-table-toolbar").css("margin-top","38px");
	$(".container-fluid").css("max-height","100%");
	$(".container-fluid").css("padding-left","0");
	$(".fixed-table-container").css("height",$('.container-fluid').height() -59 +"px");
	$(".fixed-table-body").css("height","84%");
}
function gridPatterns1(){
	$(".fixed-table-toolbar").css("margin-top","38px");
	$(".container-fluid").css("max-height","100%");
	$(".container-fluid").css("padding-left","0");
	$(".fixed-table-container").css("height",$('.container-fluid').height() -59 +"px");
	$(".fixed-table-body").css("height","84%");
	$(".input-group").css("z-index","7");
}
/**取url参数值  */
function getQueryString(name) {
    var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)", "i");
    var r = window.location.search.substr(1).match(reg);
    if (r != null) return unescape(r[2]); return null;
}

/**查询条件与分页数据 */
function queryParams(pageReqeust) {
    pageReqeust.search = $("#search").val();
    pageReqeust.enabled = $("#enabled").val();
    pageReqeust.querys = $("#querys").val();
    pageReqeust.pageNo = this.offset;
    pageReqeust.pageSize = this.pageNumber;
    return pageReqeust;
}

function showMoreBtn(ele){
	var DIVAMOUNT = 5;
	if(ele.children('div').length > DIVAMOUNT){
		var len = ele.children('div').length;
		$("#ele>div:gt(4)").hide();
		var selectObj = $('<div class="btn-group"><button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">更多 <span class="caret"></span></button><ul class="dropdown-menu" style="min-width:90px;left:-14px;"></ul></div>');
		ele.append(selectObj);
		for(var i=DIVAMOUNT;i<len;i++){
			ele.children('div').eq(i).hide();
			var liObj = $('<li style="margin-left:14px;"></li>');
			liObj.append(ele.children('div').eq(i).clone(true));
			selectObj.find('.dropdown-menu').append(liObj);
			selectObj.find('.dropdown-menu').append($('<li role="separator" class="divider"></li>'));
		}
		selectObj.find('.dropdown-menu div').show();
	}
}

function getFilenameById(fileId){
	var fileName ="";
	$.ajax({
		url:'/myehr/FileList/getFilenameById.action?fileId='+fileId,
		type:'post',
		cache: false,
		async: false,
		success: function (obj) {
			fileName = obj.filename;
		}
	});
	return fileName;
}