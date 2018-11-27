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
//---------------------------------------------------------------------------------------
function initFileManage1(shangchuanButton,yulanButton,deleteButton,uploadButton,tagCode,id){
	var objs = getCheckedByFormId();//所有检查点
	var tableObj='<div class="wrapper wrapper-content animated fadeInRight" id="testCheckedWall">\n'+
				 '</div>\n';
	$("#"+id).after(tableObj);
	for(var i=0;i<objs.length;i++){
		var e = 'Checked'+objs[i].point.id;
		var obj1s = getCheckedPointById(objs[i].point.id);//检查点下所有要求及附件信息
		var checkedObj =	 '<div class="row" style="margin-left:0;margin-top:10px;text-align:left;"  id="'+e+'">\n'+
							 '	 <div class="col-md-12 col-sm-12 col-lg-12 singleShow" style="border:1px solid #e7eaec;padding-top:5px">\n'+
							 '			 <div class="col-sm-11">\n'+
							 '				 <h3 style="margin-top:0;color:#000000;font-size:14px" title="'+objs[i].point.checkedName+'"><strong>'+objs[i].point.checkedName+'</strong></h3>\n'+
							 '				 <ul class="checkPoint" id="checkPoint'+objs[i].point.id+'" style="padding-left:0"></ul>\n'+
							 '				<div class="row cell" style="border:0">\n'+
							 '					<div class="col-sm-12 animated fadeInRight">\n'+
							 '						<div class="row">\n'+
							 '							<div id="file_wall_view" class="col-sm-12" style="padding-left:0">\n'+
							 '								<input id="file-es-'+i+'" name="file-es[]" type="file" multiple/>\n'+
							 '								<input id="file-zh-'+i+'" name="file-zh[]" type="file" multiple/>\n'+
							 '								<input class="checkedId" type="hidden" value="'+objs[i].point.id+'"/>\n'+
							 '							</div>\n'+
							 '						</div>\n'+
							 '					</div>\n'+
							 '				</div>\n'+
							 '			 </div>\n'+
							 '	 </div>\n'+
							 '</div>\n';
		$("#testCheckedWall").append(checkedObj);					 
		for(var j=0;j<obj1s.length;j++){
			var tableObj='';
			var date = new Date(obj1s[j].operatorTime).Format("yyyy-MM-dd");
			var checkbox ;
            if(obj1s[j].isAchieve=='Y'){
            	checkbox = $('<li><input type="checkbox" onclick="changeChecked(this)" checked="checked"><input class="checkedPointId" type="hidden" value="'+obj1s[j].id+'"/><label>'+obj1s[j].checkedRequire+','+obj1s[j].checkedContent+','+obj1s[j].operatorName+','+date+'</label></li>');
            }else{
            	checkbox = $('<li><input type="checkbox" onclick="changeChecked(this)"><input class="checkedPointId" type="hidden" value="'+obj1s[j].id+'"/><label>'+obj1s[j].checkedRequire+','+obj1s[j].checkedContent+','+obj1s[j].operatorName+','+date+'</label></li>');
            }
			$("#checkPoint"+objs[i].point.id).append(checkbox);
		}
		var obj2s = objs[i].files;
		showDate(obj2s,e,yulanButton,deleteButton,uploadButton,shangchuanButton,tagCode);
	}
	
}
var showType = "all";
var folder = "all";
var tags = "";
var switchType = "view";
//文件下载
function showDate(arr,e,yulanButton,deleteButton,uploadButton,shangchuanButton,tagCode) {
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
		deleteButtonAC = '<button type="button" class="kv-file-remove btn btn-kv btn-default btn-outline-secondary" {dataKey} title="删除附件" onclick="deleteAction(this,\''+checkedId+'\')"><i class="glyphicon glyphicon-trash"></i></button>';
	}
	if(uploadButton){
		uploadButtonAC = '<button type="button" class="kv-file-down btn btn-kv btn-default" {dataKey} title="下载附件" onclick="getFileData(this)"><i class="fa fa-cloud-download"></i></button>';
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
	if(!shangchuanButton){
		$("button").remove(".kv-file-zoom");
	}
	if(shangchuanButton){
		$("#"+e).find("[name='file-zh[]']").fileinput({
			theme: 'fa',
			language: 'zh',
			showPreview :false,
			showCaption:false,
			allowedFileExtensions : null,
			//uploadExtraData:expandParams(),
			maxFileCount:1, //表示允许同时上传的最大文件个数newFileUp
			uploadUrl: "/myehr/FileList/checkedPoint_newFileUp.action?objType=checkedAndForm&tag="+tags+"&checkedId="+checkedId+"&objId="+realFormId//上传的地址,执行上传文件和更新检查点文件的操作
		}).on("fileuploaded", function(event, data) {
			window.location.reload();
		})
		$("#"+e).find("[name='file-zh[]']").on('filebatchselected', function(event, data, previewId, index) {
			  var content = "<div id='batchUp' class='row cell' style='border:none;line-height:25px;height:95%;overflow:auto;' >\n"+
							"<div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12\">\n"+
							"<h5 class=\"tag-title\">标签</h5>\n"+
							"<input id=\"tag\" name=\"tag\" type=\"hidden\"/>\n"+
							"<div id=\"fileManage_tagType\">\n"+
							"</div>\n"+
							"</div>\n"+
							"</div>\n";
			layer.open({
				offset:'50%',
				shift: 6,
				title:'输入内容',
				shadeClose: true,
				zIndex:9999,
				content: content,
				area: ['500px', '300px'],
				btn: ['确定', '取消'],
				success: function(layero, index){
					addHtml(tagCode,'fileManage_tagType');
				},
				yes: function(index, layero){
					layer.close(index);
				  
				},
				btn2: function(index, layero){
				 
				}
			});
		});
	}else{
		$("#"+e).find("[name='file-zh[]']").css("display","none");
	}
}

function addHtml(dictName,id){
	var html = "";
	data = getDictData(dictName);
	html = "<ul class=\"tag-list\" style=\"padding: 0\">";
	for(var i=0;i<data.length;i++){
		html += "<li onclick=\"changeTag('"+data[i].dictEntryCode+"')\"><a id=\"tag_"+data[i].dictEntryCode+"\" class=\"\">"+data[i].dictEntryName+"</a></li>"
	}
	html += "</ul>";
	$("#"+id).html(html);
}	
function changeTag(type){
tags = "";
if($("#tag_"+type).attr("class")!="tag"){
	$("#tag_"+type).attr("class","tag");
	$("#tag_"+type).css("background-color","orange");
}else{
	$("#tag_"+type).attr("class","");
	$("#tag_"+type).css("background-color","#f3f3f4");
}
var tag = $(".tag");
for(var i=0;i<tag.length;i++){
	tags += tag[i].innerText+","
}
if(tags.length>0){
	tags = tags.substring(0, tags.length-1);
}
//$("#tag").val(tags);
alert(tags);
}	

function getDictData(dictName){
	var dictEntrys = [];
	$.ajax({
		url:'/myehr/FileList/getDictData.action?DictName='+dictName,
		type:'post',
		cache: false,
		async: false,
		success: function (obj) {
			dictEntrys = obj;
		}
	});
	return dictEntrys;
}
function getFileData(e){
var obj = $(e).parent().parent().parent().find(".file-footer-caption").eq(0);
var title = obj.attr("title").split("_");
var id = title[title.length-1];
loadFile(id);
}
function loadFile(id){
window.open('/myehr/FileList/downLoadfile.action?FILEID='+id+'&formId='+realFormId)
}

function getCheckedByFormId(){
	var checked = [];
	$.ajax({
	    url: "/myehr/FileList/getCheckedByFormId.action?formId="+realFormId,
	    type: 'post',
	    cache: false,
	    async: false,
	    success: function (data) {
	    	checked=data;
	    }
	});
	return checked;
}
function getCheckedPointById(id){
	var checked = [];
	$.ajax({
	    url: "/myehr/FileList/getCheckedPointById.action?checkedId="+id,
	    type: 'post',
	    cache: false,
	    async: false,
	    success: function (data) {
	    	checked=data;
	    }
	});
	return checked;
}

/*function deleteAction(e,checkedId){
	var obj = $(e).parent().parent().parent().find(".file-footer-caption").eq(0);
	var title = obj.attr("title").split("_");
	var id = title[title.length-1];
	$.ajax({
	    url: "/myehr/FileList/checkedPoint_deleteFile.action?fileId="+id+"&checkedId="+checkedId+"&formId="+realFormId,
	    type: 'post',
	    cache: false,
	    async: false
	});
	window.location.reload();
}*/

function changeChecked(e){
	var isAchieve = $(e).prop("checked");
	var msgContent = '';
	var checkedPointId = $(e).next().val();
	var isAchieveValue = ''
	if(isAchieve){
		msgContent = '确定通过审批状态?';
		isAchieveValue = 'Y';
	}else{
		msgContent = '确定取消审批状态?';
		isAchieveValue = 'N';
	}
	layer.msg(msgContent, {
		  offset:'50%',
		  shift: 6,
		  time: 0 //不自动关闭
		  ,btn: ['确定', '再想想']
		  ,success: function(layero){
				layero.find('.layui-layer-btn').css('text-align', 'center');
		  }
		  ,yes: function(index){
	  			layer.close(index); 
	  			var obj = {};
	  			obj.id = checkedPointId;
	  			obj.isAchieve = isAchieveValue;
	            $.ajax({  
	                url:'/myehr/FileList/updateIsAchieve.action',  
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
	                    refresh();    
	                }  
	            });
	      	}
		  ,btn2: function(index){
			  if(isAchieve){
				  $(e).prop("checked",false);
			  }else{
				  $(e).prop("checked",true);
			  }
		  }
      })
}
function initFileManage2(shangchuanButton,yulanButton,deleteButton,uploadButton,tagCode,id,numLimit,sizeLimit,typeLimit){
	var objs = getFileByFormId();//所有检查点
	var tableObj='<h3 class="CCFubiaoTitle" style="display: block; font-size: 18px; text-align: left; height: 36px; line-height: 33px; padding-left: 16px; color: rgb(102, 102, 102); cursor: pointer; margin: 0px;">表单附件管理</h3>\n'+
				 '<div class="wrapper wrapper-content animated fadeInRight" style="padding-top:0" id="testCheckedWall">\n'+
				 '</div>\n';
	$("#"+id).after(tableObj);
	var checkedObj = '<div class="row" style="margin-left:0;margin-top:10px;text-align:left;margin-right:0px"  id="checkedFileManage">\n'+
					 '	 <div class="col-md-12 col-sm-12 col-lg-12 singleShow" style="border:1px solid #e7eaec;padding-top:5px;background-color: #FFF;">\n'+
					 '			 <div class="col-sm-11">\n'+
					 '				<div class="row cell" style="border:0">\n'+
					 '					<div class="col-sm-12 animated fadeInRight">\n'+
					 '						<div class="row">\n'+
					 '							<div id="file_wall_view" class="col-sm-12" style="padding-left:0">\n'+
					 '								<input id="file-es" name="file-es[]" type="file" multiple/>\n'+
					 '								<input id="file-zh" name="file-zh[]" type="file" multiple/>\n'+
					 '							</div>\n'+
					 '						</div>\n'+
					 '					</div>\n'+
					 '				</div>\n'+
					 '			 </div>\n'+
					 '	 </div>\n'+
					 '</div>\n';
	$("#testCheckedWall").append(checkedObj);
	showFormDate(objs,'checkedFileManage',true,true,true,true,tagCode,numLimit,sizeLimit,typeLimit);
}
//文件下载
function showFormDate(arr,e,yulanButton,deleteButton,uploadButton,shangchuanButton,tagCode,numLimit,sizeLimit,typeLimit) {
	var previewSrcArr = [];
	var configArr = [];
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
		deleteButtonAC = '<button type="button" class="kv-file-remove btn btn-kv btn-default btn-outline-secondary" {dataKey} title="删除附件" onclick="deleteAction(this,\'\',\'form\')"><i class="glyphicon glyphicon-trash"></i></button>';
	}
	if(uploadButton){
		uploadButtonAC = '<button type="button" class="kv-file-down btn btn-kv btn-default" {dataKey} title="下载附件" onclick="getFileData(this)"><i class="fa fa-cloud-download"></i></button>';
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
	if(!shangchuanButton){
		$("button").remove(".kv-file-zoom");
	}
	if(shangchuanButton){
		$("#"+e).find("[name='file-zh[]']").fileinput({
			theme: 'fa',
			language: 'zh',
			showPreview :false,
			showCaption:false,
			//uploadExtraData:expandParams(),
			maxFileCount:numLimit, //表示允许同时上传的最大文件个数newFileUp
			maxFileSize:sizeLimit,
			allowedFileExtensions:typeLimit,
			uploadUrl: "/myehr/FileList/newFileUp.action?objType=formAndForm&tag="+tags+"&objId="+realFormId//上传的地址,执行上传文件和更新检查点文件的操作
		}).on("fileuploaded", function(event, data) {
			window.location.reload();
		})
		$("#"+e).find("[name='file-zh[]']").on('filebatchselected', function(event, data, previewId, index) {
			  var content = "<div id='batchUp' class='row cell' style='border:none;line-height:25px;height:95%;overflow:auto;' >\n"+
							"<div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12\">\n"+
							"<h5 class=\"tag-title\">标签</h5>\n"+
							"<input id=\"tag\" name=\"tag\" type=\"hidden\"/>\n"+
							"<div id=\"fileManage_tagType\">\n"+
							"</div>\n"+
							"</div>\n"+
							"</div>\n";
			layer.open({
				title:'输入内容',
				shadeClose: true,
				zIndex:9999,
				content: content,
				area: ['500px', '300px'],
				btn: ['确定', '取消'],
				success: function(layero, index){
					addHtml(tagCode,'fileManage_tagType');
				},
				yes: function(index, layero){
					layer.close(index);
				  
				},
				btn2: function(index, layero){
				 
				}
			});
		});
	}else{
		$("#"+e).find("[name='file-zh[]']").css("display","none");
	}
}
//getFileByFormId()
function getFileByFormId(){
	var checked = [];
	$.ajax({
	    url: "/myehr/FileList/getFileByFormId.action?formId="+realFormId,
	    type: 'post',
	    cache: false,
	    async: false,
	    success: function (data) {
	    	checked=data;
	    }
	});
	return checked;
}
function changeFileCss(){
	$(".kv-file-content").css("display","none");
	$(".hidden").css("display","none");
	$(".file-drag-handle").css("display","none");
	$(".file-caption-info").css("overflow","inherit");
	$(".file-caption-info").css("height","10px");
	$(".file-footer-caption").css("float","left");
	$(".file-footer-caption").css("margin-bottom","0");
	$(".file-footer-caption").css("line-height","0");
	$(".file-thumbnail-footer").css("height","30px");
	$(".file-actions").css("float","right");
	$(".file-caption-info").removeClass("file-caption-info");
	$(".file-size-info").removeClass("file-size-info");
	$("li").css("list-style-type","none");
	$(".file-preview-thumbnails").css("align-items","initial");
	$(".file-footer-buttons").find("button").removeClass("btn-kv");
	$(".file-footer-buttons").find("button").addClass("btn-lg");
	$(".fileinput-remove").css("display","none");
	$(".file-preview").css("border","none");
	$("#testCheckedWall .row").css("padding","0");
	$("#testFormWall .row").css("padding","0");
}

function initFileManage3(shangchuanButton,yulanButton,deleteButton,uploadButton,tagCode,id,taskId,nodeId,procId){
	var objs = getCheckedByNodeId(taskId,nodeId,procId);//所有检查点
	var ckNum = objs.length;
	if(ckNum>0){
		var tableObj='<h3 class="CCFubiaoTitle" style="display: block; font-size: 18px; text-align: left; height: 36px; line-height: 33px; padding-left: 16px; color: rgb(102, 102, 102); cursor: pointer; margin: 0px;">当前检查点信息</h3>\n'+
					 '<div class="wrapper wrapper-content animated fadeInRight testCheckedWall" style="padding-top:0" id="testCheckedWall">\n'+
					 '</div>\n';
		$("#"+id).after(tableObj);
	}
	for(var i=0;i<objs.length;i++){
		var checked = objs[i].checked;
		var objs1 = objs[i].pFiles;//检查点下所有要求及附件信息
		var checkedObj =	 '<div class="row" style="margin-left:0;margin-top:10px;text-align:left;margin-right:0px">\n'+
							 '	 <div class="col-md-12 col-sm-12 col-lg-12 singleShow" style="border:1px solid #e7eaec;padding:15px 0;background-color: #FFF;">\n'+
							 '			 <div class="col-sm-11">\n'+
							 '				 <h3 style="margin-top:0;color:#000000;font-size:14px" title="'+checked.checkedName+'"><strong>'+checked.checkedName+'</strong></h3>\n'+
							 '				 <ul class="checkPoint" id="checkPoint'+checked.id+'" style="padding-left:0"></ul>\n'+
							 '			 </div>\n'+
							 '	 </div>\n'+
							 '</div>\n';
		$("#testCheckedWall").append(checkedObj);					 
		for(var j=0;j<objs1.length;j++){
			var point = objs1[j].point;
			var tableObj='';
			var date = new Date(point.operatorTime).Format("yyyy-MM-dd");
			var checkbox ;
			var e = "checkPoint-"+point.id+"-"+i;
			//var requireHtml = "<div style='width:16px;height:12px;float:left'></div>";
			var isRequire = "false";
			if(objs1[j].point.isRequire=='Y'){
				//requireHtml = "<span class='glyphicon glyphicon-asterisk' style='color:red;font-size:12px'></span>";
				isRequire = "true";
			}
			var choosePointName = "choosePoint-"+i+"-"+j;
			var pointId = point.id;
			var pointResultId = '';
			var result1 = '';
			var result2 = '';
			if(objs1[j].pointResult!=null&&objs1[j].pointResult!=undefined){
				pointResultId = objs1[j].pointResult.id
				if(objs1[j].pointResult.pointType=='checkBox'){
					if(objs1[j].pointResult.checkResult=='Y'){
						result1 = 'checked="checked"';
					}else{
						result2 = 'checked="checked"';
					}
				}
			}
			
			if(point.isFile=='Y'){
				if(point.controlType=='checkBox'){
	        		checkbox = $('<li ><div class="checkPoint checkBoxPoint" isRequire="'+isRequire+'" id="checkPoint-'+pointId+'-'+i+'">'+
	        					 '		<input type="radio" class="choosePoint" name="'+choosePointName+'" '+result1+' onclick="changeChecked_ACT(this,\'radio\',\''+taskId+'\',\''+pointId+'\')" value="yes">是'+
		       					 '		<input type="radio" class="choosePoint" name="'+choosePointName+'" '+result2+' onclick="changeChecked_ACT(this,\'radio\',\''+taskId+'\',\''+pointId+'\')" value="no">否    '+point.checkedRequire+';'+point.checkedContent+
		       					 '		<input class="pointResultId" type="hidden" value="'+pointResultId+'"/>\n'+
								 '		<span title="附件管理" class="glyphicon glyphicon-folder-close" onclick="openFileWall(this)"></span>'+
		       					 '			<div class="col-sm-12 animated fadeInRight checkedPointFileWall">\n'+
								 '				<div class="row">\n'+
								 '					<div id="file_wall_view" class="col-sm-12" style="padding-left:0">\n'+
								 '						<input id="file-es-'+pointId+'-'+i+'" name="file-es[]" type="file" multiple/>\n'+
								 '						<input id="file-zh-'+pointId+'-'+i+'" name="file-zh[]" type="file" multiple/>\n'+
								 '					</div>\n'+
								 '				</div>\n'+
								 '			</div>\n'+
		       					 '		</div>'+
		       					 '</li>');
				}else if(point.controlType=='textBox'){
	        		//checkbox = $('<li><div class="checkPoint"><span title="填写审批" class="glyphicon glyphicon-plus"></span><input class="checkedPointId" type="hidden" value="'+point.id+'"/><label style="margin:0 5px">'+point.checkedRequire+','+point.checkedContent+','+point.operatorName+','+date+'</label><span title="附件管理" class="glyphicon glyphicon-folder-close"></span></div></li>');
	        		checkbox = $('<li><div class="checkPoint textBoxPoint" isRequire="'+isRequire+'" id="checkPoint-'+pointId+'-'+i+'">'+
		        				 '		<span title="填写审批" class="glyphicon glyphicon-plus" onclick="changeChecked_ACT(this,\'textBox\',\''+taskId+'\',\''+pointId+'\')"></span>'+
		        				 '		<input class="pointResultId" type="hidden" value="'+pointResultId+'"/>\n'+
		        				 '		<textarea class="CheckResult" type="hidden" value="'+pointResultCheckResult+'"></textarea>\n'+
								 '		<input class="checkedPointId" type="hidden" value="'+pointId+'"/>'+point.checkedRequire+';'+point.checkedContent+
								 '		<span title="附件管理" class="glyphicon glyphicon-folder-close" onclick="openFileWall(this)"></span>'+
		       					 '			<div class="col-sm-12 animated fadeInRight checkedPointFileWall">\n'+
								 '				<div class="row">\n'+
								 '					<div id="file_wall_view" class="col-sm-12" style="padding-left:0">\n'+
								 '						<input id="file-es-'+pointId+'-'+i+'" name="file-es[]" type="file" multiple/>\n'+
								 '						<input id="file-zh-'+pointId+'-'+i+'" name="file-zh[]" type="file" multiple/>\n'+
								 '					</div>\n'+
								 '				</div>\n'+
								 '			</div>\n'+
		       					 '		</div>'+
		       					 '</li>');
				}
	            	
				$("#checkPoint"+checked.id).append(checkbox);
				var obj2s = objs1[j].files;
				
				showCheckedFileDate_ACT(obj2s,e,yulanButton,deleteButton,uploadButton,shangchuanButton,tagCode,nodeId+"_"+procId+","+pointId);
			}else{
				if(point.controlType=='checkBox'){
					checkbox = $('<li><div class="checkPoint checkBoxPoint" isRequire="'+isRequire+'" id="checkPoint-'+pointId+'-'+i+'">'+
								 '		<input type="radio" class="choosePoint" name="'+choosePointName+'" '+result1+' onclick="changeChecked_ACT(this,\'radio\',\''+taskId+'\',\''+pointId+'\')" value="yes">是'+
		       					 '		<input type="radio" class="choosePoint" name="'+choosePointName+'" '+result2+' onclick="changeChecked_ACT(this,\'radio\',\''+taskId+'\',\''+pointId+'\')" value="no">否   '+point.checkedRequire+';'+point.checkedContent+
		       					 '		<input class="pointResultId" type="hidden" value="'+pointResultId+'"/>\n'+
		       					 '		</div>'+
  					 			 '</li>');
				}else if(point.controlType=='textBox'){
	        		checkbox = $('<li><div class="checkPoint textBoxPoint" isRequire="'+isRequire+'" id="checkPoint-'+pointId+'-'+i+'">'+
	        					 '		<span title="填写审批" class="glyphicon glyphicon-plus" onclick="changeChecked_ACT(this,\'textBox\',\''+taskId+'\',\''+pointId+'\')"></span>'+
		       					 '		<input class="checkedPointId" type="hidden" value="'+pointId+'"/>'+point.checkedRequire+';'+point.checkedContent+
		       					 '		<input class="pointResultId" type="hidden" value="'+pointResultId+'"/>\n'+
		       					 '		<textarea class="CheckResult" type="hidden" value="'+pointResultCheckResult+'"></textarea>\n'+
								 '		</div>'+
		       					 '</li>');
							 
				}
				$("#checkPoint"+checked.id).append(checkbox);
			}
		}
	}
	var datas = getCheckedHisByNodeId(taskId,procId);//所有检查点
	for(var x=datas.length-1;x>-1;x--){
		var objs = datas[x].objs;
		var userName = '';
		if(objs[0].pFiles[0].pointResult!=null){
			userName = '('+getUsernameById(objs[0].pFiles[0].pointResult.operatorName)+'    '+new Date(objs[0].pFiles[0].pointResult.operatorTime).Format("yyyy/MM/dd")+')'
		}
		var tableObj='<h3 class="CCFubiaoTitle" style="display: block; font-size: 18px; text-align: left; height: 36px; line-height: 33px; padding-left: 16px; color: rgb(102, 102, 102); cursor: pointer; margin: 0px;">'+datas[x].nodeName+userName+'</h3>\n'+
					 '<div class="wrapper wrapper-content animated fadeInRight testCheckedWall" style="padding-top:0" id="testCheckedWall'+x+'">\n'+
					 '</div>\n';
		if(x==datas.length-1){
			/*if(ckNum>0){
				$("#testCheckedWall").after(tableObj);
			}else{*/
				$("#"+id).after(tableObj);
//			}
		}else{
			$("#testCheckedWall"+(x+1)).after(tableObj);
		}
		
		for(var i=0;i<objs.length;i++){
			var checked = objs[i].checked;
			var objs1 = objs[i].pFiles;//检查点下所有要求及附件信息
			var checkedObj =	 '<div class="row" style="margin-left:0;margin-top:10px;text-align:left;margin-right:0px">\n'+
								 '	 <div class="col-md-12 col-sm-12 col-lg-12 singleShow" style="border:1px solid #e7eaec;padding:15px 0;background-color: #FFF;">\n'+
								 '			 <div class="col-sm-11">\n'+
								 '				 <h3 style="margin-top:0;color:#000000;font-size:14px" title="'+checked.checkedName+'"><strong>'+checked.checkedName+'</strong></h3>\n'+
								 '				 <ul class="checkPointHis" id="checkPointHis'+checked.id+'" style="padding-left:0"></ul>\n'+
								 '			 </div>\n'+
								 '	 </div>\n'+
								 '</div>\n';
			$("#testCheckedWall"+x).append(checkedObj);					 
			for(var j=0;j<objs1.length;j++){
				var point = objs1[j].point;
				var tableObj='';
				var date = new Date(point.operatorTime).Format("yyyy-MM-dd");
				var checkbox ;
				var e = "checkPoint-"+point.id+"-"+i;
				//var requireHtml = "<div style='width:16px;height:12px;float:left'></div>";
				var isRequire = "false";
				if(objs1[j].point.isRequire=='Y'){
					//requireHtml = "<span class='glyphicon glyphicon-asterisk' style='color:red;font-size:12px'></span>";
					isRequire = "true";
				}
				var choosePointName = "choosePoint-"+i+"-"+j;
				var pointId = point.id;
				var pointResultId = '';
				var result1 = '';
				var result2 = '';
				if(objs1[j].pointResult!=null&&objs1[j].pointResult!=undefined){
					pointResultId = objs1[j].pointResult.id
					if(objs1[j].pointResult.pointType=='checkBox'){
						if(objs1[j].pointResult.checkResult=='Y'){
							result1 = 'checked="checked"';
						}else{
							result2 = 'checked="checked"';
						}
					}
				}
				
				if(point.isFile=='Y'){
					if(point.controlType=='checkBox'){
		        		checkbox = $('<li ><div class="checkPoint checkBoxPoint" isRequire="'+isRequire+'" id="checkPoint-'+pointId+'-'+i+'">'+
		        					 '		<input type="radio" class="choosePoint" name="'+choosePointName+'" '+result1+' disabled value="yes">是'+
			       					 '		<input type="radio" class="choosePoint" name="'+choosePointName+'" '+result2+' disabled value="no">否    '+point.checkedRequire+';'+point.checkedContent+
			       					 '		<input class="pointResultId" type="hidden" value="'+pointResultId+'"/>\n'+
									 '		<span title="附件管理" class="glyphicon glyphicon-folder-close" onclick="openFileWall(this)"></span>'+
			       					 '			<div class="col-sm-12 animated fadeInRight checkedPointFileWall">\n'+
									 '				<div class="row">\n'+
									 '					<div id="file_wall_view" class="col-sm-12" style="padding-left:0">\n'+
									 '						<input id="file-es-'+pointId+'-'+i+'" name="file-es[]" type="file" multiple/>\n'+
									 '						<input id="file-zh-'+pointId+'-'+i+'" name="file-zh[]" type="file" multiple/>\n'+
									 '					</div>\n'+
									 '				</div>\n'+
									 '			</div>\n'+
			       					 '		</div>'+
			       					 '</li>');
					}else if(point.controlType=='textBox'){
		        		//checkbox = $('<li><div class="checkPoint"><span title="填写审批" class="glyphicon glyphicon-plus"></span><input class="checkedPointId" type="hidden" value="'+point.id+'"/><label style="margin:0 5px">'+point.checkedRequire+','+point.checkedContent+','+point.operatorName+','+date+'</label><span title="附件管理" class="glyphicon glyphicon-folder-close"></span></div></li>');
		        		checkbox = $('<li><div class="checkPoint textBoxPoint" isRequire="'+isRequire+'" id="checkPoint-'+pointId+'-'+i+'">'+
			        				 '		<span title="填写审批" class="glyphicon glyphicon-plus" onclick="changeChecked_ACT(this,\'textBox\',\''+taskId+'\',\''+pointId+'\')"></span>'+
			        				 '		<input class="pointResultId" type="hidden" value="'+pointResultId+'"/>\n'+
			        				 '		<textarea class="CheckResult" type="hidden" value="'+pointResultCheckResult+'"></textarea>\n'+
									 '		<input class="checkedPointId" type="hidden" value="'+pointId+'"/>'+point.checkedRequire+';'+point.checkedContent+
									 '		<span title="附件管理" class="glyphicon glyphicon-folder-close" onclick="openFileWall(this)"></span>'+
			       					 '			<div class="col-sm-12 animated fadeInRight checkedPointFileWall">\n'+
									 '				<div class="row">\n'+
									 '					<div id="file_wall_view" class="col-sm-12" style="padding-left:0">\n'+
									 '						<input id="file-es-'+pointId+'-'+i+'" name="file-es[]" type="file" multiple/>\n'+
									 '						<input id="file-zh-'+pointId+'-'+i+'" name="file-zh[]" type="file" multiple/>\n'+
									 '					</div>\n'+
									 '				</div>\n'+
									 '			</div>\n'+
			       					 '		</div>'+
			       					 '</li>');
					}
		            	
					$("#checkPointHis"+checked.id).append(checkbox);
					var obj2s = objs1[j].files;
					showCheckedFileDate_ACT(obj2s,e,true,false,true,false,tagCode,nodeId+"_"+procId+","+pointId);
				}else{
					if(point.controlType=='checkBox'){
						checkbox = $('<li><div class="checkPoint checkBoxPoint" isRequire="'+isRequire+'" id="checkPoint-'+pointId+'-'+i+'">'+
									 '		<input type="radio" class="choosePoint" name="'+choosePointName+'" '+result1+' disabled value="yes">是'+
			       					 '		<input type="radio" class="choosePoint" name="'+choosePointName+'" '+result2+' disabled value="no">否   '+point.checkedRequire+';'+point.checkedContent+
			       					 '		<input class="pointResultId" type="hidden" value="'+pointResultId+'"/>\n'+
			       					 '		</div>'+
	  					 			 '</li>');
					}else if(point.controlType=='textBox'){
		        		checkbox = $('<li><div class="checkPoint textBoxPoint" isRequire="'+isRequire+'" id="checkPoint-'+pointId+'-'+i+'">'+
		        					 '		<span title="填写审批" class="glyphicon glyphicon-plus" onclick="changeChecked_ACT(this,\'textBox\',\''+taskId+'\',\''+pointId+'\')"></span>'+
			       					 '		<input class="checkedPointId" type="hidden" value="'+pointId+'"/>'+point.checkedRequire+';'+point.checkedContent+
			       					 '		<input class="pointResultId" type="hidden" value="'+pointResultId+'"/>\n'+
			       					 '		<textarea class="CheckResult" type="hidden" value="'+pointResultCheckResult+'"></textarea>\n'+
									 '		</div>'+
			       					 '</li>');
					}
					$("#checkPointHis"+checked.id).append(checkbox);
				}
			}
		}
	}
}
function submit2(buttonType){
	if(buttonType=='通过'){
		content = "<textarea id='approveRemark' rows='7' cols='63' ></textarea>";
	}else if(buttonType=='驳回'){
		getHisTask();
		var datas = hisTask;
		content = "<div style='margin-bottom:10px'>驳回方式<select id='rejectType' >";
		content+= "<option value ='previousNode'>驳回到上节点</option>";
		content+= "<option value ='startUser'>驳回到申请人</option>";
		content+= "<option value ='free'>自由驳回到已审批节点</option>";
		content+= "</select></div>";
		content += "<div style='margin-bottom:10px'>驳回节点<select id='rejectNode' >";
		for(var i=0;i<datas.length;i++){
			content+="<option value ='"+datas[i].taskId+"'>"+datas[i].ACTNAME+"</option>";
		}
		content+="</select></div>";
		content += "<textarea id='approveRemark' rows='7' cols='63' ></textarea>";
	}else{
		saveData(buttonType,'','');
		return;
	}
	layer.open({
		title:'请填写审批意见',
		shadeClose: true,
		offset: 't',
		zIndex:9999,
		content: content,
		area: ['500px', '300px'],
		btn: ['确定', '取消'],
		yes:function(index, layero){
			var approveRemark=document.getElementById("approveRemark").value;
			var rejectType;
			if(buttonType=='驳回'){
				rejectType=document.getElementById("rejectType").value;
			}
			layer.close(index);
			submit5('2815',buttonType,approveRemark,rejectType);
			//saveData(buttonType,approveRemark,rejectType);
		},
	})
}
function saveData(buttonType,approveRemark,rejectType){
	var paramsMap = {};
	var _param = {};
	_param.formId=formId_main;
	_param.buttonId=2815;
	_param = cardGetdata_main('#checkButton_main',formId_main);
	_param.paramsMap = paramsMap;
	if(checkNull($("#MainElement").find("form"))){
		return false;
	}else{
		$.ajax({
			url:'/myehr/form/saveButtonSave.action',
			type:'post',
			data: JSON.stringify(_param),
			cache: false,
			contentType: 'application/json;charset=utf-8',
			success: function (text) {
				if(text[0]!=0){
					alert("保存失败！");
				}else if(text[0]=='error'){
					alert("操作异常");
				}else {
					submit5(_param.buttonId,buttonType,approveRemark,rejectType);
				}
			}
		});
	}
}
function submit3(){
	var paramsMap = {};
	var _param = {};
	_param.formId=formId_main;
	_param.buttonId=2815;
	_param =  cardGetdata_main('#checkButton_main',formId_main);
	_param.paramsMap = paramsMap;
	_param.actFlowParams= {key:param_key};
	$.ajax({
		url:'/myehr/act/task/start.action',
		type:'post',
		data: JSON.stringify(_param),
		cache: false,
		contentType: 'application/json;charset=utf-8',
		success: function (text) {
			if(text[0]==0){
				alert("保存失败");
			}else if(text[0]=='error'){
				alert("操作异常");
			}else {
				alert("操作成功");
				closex();
			}
		}
	});
}
function submit5(buttonId,buttonType,approveRemark,rejectType){
	var flowAction = param_flowAction;
	if(flowAction=='start'){
		submit3(buttonId);
	}else{
		submit4(buttonId,buttonType,approveRemark,rejectType);
	}
}

function animationHover(element, animation) {
    element = $(element);
    element.hover(
        function () {
            element.addClass('animated ' + animation);
        },
        function () {
            //动画完成之前移除class
            window.setTimeout(function () {
                element.removeClass('animated ' + animation);
            }, 2000);
        });
}

function approveList(){
	var procInsId = param_procInsId;
	$.ajax({
		url:'/myehr/act/task/queryApproveList.action?procInsId='+procInsId,
		type:'post',
		contentType: 'application/json;charset=utf-8',
        cache: false,
		success: function (text) {
			showDate(text)
		}
	});
}

function approveList1(){
	var pkId = '${param.pkId}';
	$.ajax({
		url:'/myehr/form/quertFreeCommitByPkId.action?pkId='+pkId,
		type:'post',
		contentType: 'application/json;charset=utf-8',
       cache: false,
		success: function (text) {
			showFreeData(text)
		}
	});
}

function showFreeData(arr) {
    for (var i = arr.length - 1; i >= 0; i--) {
	     var iconClass;
	     if(arr[i].freeProcessApprove=="pass"){
	         iconClass='vertical-timeline-icon';
	     }else{
	         iconClass='vertical-timeline-icon1';
	     }
		 var cellObj = $('<div class="vertical-timeline-block">'+
						'    <div class="'+iconClass+'"></div>'+
						'    <div class="vertical-timeline-content clearfix">'+
						'        <div class="pic fl" style="float:left">'+
						'            <img src="http://p.3761.com/pic/43701399945993.png" alt="">'+
						'            <div id="shenpiren" class="shenpirens">'+arr[i].freeProcessApproveUser+'</div>'+
						'        </div>'+
						'        <div class="content fl">'+
						'            <div class="clearfix"></div>'+
						'		     <div class="shenpizhuangtai">'+arr[i].freeProcessApprove+'</div>'+
						'	     </div>'+
						'	     <div class="clearfix"></div>'+
						'    </div>'+
						'    <div id="shenpijieguo" class="shenpijieguo">'+
						'        <div id="shenpishijian" style="font-weight:bold;float:left" class="shenpishijian">'+arr[i].freeProcessApproveTime+'</div>'+
						'        <div id="shenpijiedian" style="font-weight:bold;float:left" class="shenpijiedian">'+arr[i].freeProcessApproveUser+'</div>'+
						'        <div id="shenpiyijian" style="font-weight:bold;float:left" class="shenpiyijian">'+arr[i].freeProcessCommit+'</div>'+
						'    </div>'+
						'</div>'
		);
		$('#approveList').append(cellObj);
	}
}


function submit4(buttonId,buttonType,approveRemark,rejectType){
    var flowAction = param_flowAction;
    if(flowAction=='start'){
	    var paramsMap = {};
	    var _param = {};
	    _param.formId=2504;
	    _param.buttonId=buttonId;
	    _param =  cardGetdata_main('#checkButton_main',formId_main);
	    _param.paramsMap = paramsMap;
	    _param.actFlowParams= {key:param_key};
	    $.ajax({
		     url:'/myehr/act/task/start.action',
		     type:'post',
		     data: JSON.stringify(_param),
		     cache: false,
		     contentType: 'application/json;charset=utf-8',
		     success: function (text) {
			     if(text[0]==0){
				     alert("保存失败！");
			     }else if(text[0]=='error'){
				     alert("操作异常");
			     }else {
				     alert("操作成功");
				     closex();
			     }
		     }
	     });
    }else{
	     var paramsMap = {};
	     var _param = {};
	     _param.formId=2504;
	     _param.buttonId=buttonId;
	     _param =  cardGetdata_main('#checkButton_main',formId_main);
	     _param.paramsMap = paramsMap;
	     _param.actFlowParams= {taskId:param_taskId,procInsId:param_procInsId,buttonType:buttonType,approveRemark:approveRemark,rejectType:rejectType};
	     $.ajax({
		     url:'/myehr/act/task/complete.action',
		     type:'post',
		     data: JSON.stringify(_param),
		     cache: false,
		     contentType: 'application/json;charset=utf-8',
		     success: function (text) {
			     if(text[0]==0){
				     alert("保存失败！");
			     }else if(text[0]=='error'){
				     alert("操作异常");
			     }else {
				     alert("操作成功");
				     closex_2504();
			     }
		     }
	     });
    }
}
function approveChange(){
	var objS = document.getElementById("EMP_EMPLOYEE.APPROVE_TYPE");
    var value = objS.options[objS.selectedIndex].value;
	if(value=='approveReject'){
		document.getElementById("EMP_EMPLOYEE.REJECT_TYPE").disabled=false;
	}else{
		document.getElementById("EMP_EMPLOYEE.REJECT_TYPE").disabled=true;
		document.getElementById("EMP_EMPLOYEE.REJECT_TYPE").value="";
	}	
}
function rejectChange(){
	var objS = document.getElementById("EMP_EMPLOYEE.REJECT_TYPE");
    var value = objS.options[objS.selectedIndex].value;
	 if(value=='free'){
		var paramsMap = {};
		var _param = {};
		var approveType = document.getElementById("EMP_EMPLOYEE.APPROVE_TYPE").value;
		var rejectType = document.getElementById("EMP_EMPLOYEE.REJECT_TYPE").value;
		var bz = document.getElementById("bz").value;
		_param.formId=formId_main;
		_param.buttonId='';
		_param.paramsMap = paramsMap;
		_param.actFlowParams= {taskId:param_taskId,procInsId:param_procInsId,approveType:approveType,rejectType:rejectType,bz:bz};
		$.ajax({
			url:'/myehr/act/task/freeTask.action',
			type:'post',
			data: JSON.stringify(_param),
			cache: false,
			contentType: 'application/json;charset=utf-8',
			success: function (text) {
				var html = '';
				var opationhtml = '';
				for (var i=0;i<text.length;i++){
					opationhtml+="<option value =\""+text[i].actId+"\">"+text[i].actName+"</option>";
				}
				html+="<select id=\"EMP_EMPLOYEE.REJECT_TASK\" disabled=\"false\" title=\"驳回节点\" styleType=\"select\" name=\"REJECT_TASK\"  class=\"form-control\" style=\"width:200px;height:25px;\">"+opationhtml+"</select>";
				$("#solutionList").html(html);
				document.getElementById("EMP_EMPLOYEE.REJECT_TASK").disabled=false;
			}
		});
	}else{
		document.getElementById("EMP_EMPLOYEE.REJECT_TASK").disabled=true;
		document.getElementById("EMP_EMPLOYEE.REJECT_TASK").value="";
	}
}