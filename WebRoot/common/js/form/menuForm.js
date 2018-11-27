var parame={
		id:'',
		value:"N",
		width: "100px",  
		height:"45px",
		url:'/myehr/dict/searchSysDictEntryTypeCode.action?userId=1',
		jsonParam:{},
		chang:function (e){
			var aaa = e;
		}
}

var icon_Param = {
	id:'',
	iconType:'',
	backgroudColor:'',
	color:'',
	fonSize:'',
	linkType:'',
	urlLink:''
};

var num_Param = {
	id:'',
	numFromUrl:''
}


function imgError(e){
	var name = $(e).parent().find("button").text();
	name = name.substr(0, 1);
	$(e).after("<a href=\"#\">"+
			   "	<input style=\"background-color:pink;\"class=\"iconCss\" type=\"button\" iconType=\"TitleFirst\" iconId=\"1234\" onclick=\"iconCssChanged(this)\"value=\""+name+"\" />"+
			   "</a>");
	$(e).remove();
}

function iconCssChanged(e){
	var obj = $(e).clone();
	$(e).addClass("editing_icon");
	icon_Param.id = $(e).attr("iconId");//图标主键
	icon_Param.iconType = $(e).attr("iconType");//图标,文字首字,自定义(常量),查询
	icon_Param.backgroudColor = $(e).css("background-color");//背景色(文字)
	icon_Param.color = $(e).css("color");//文字颜色(文字)
	icon_Param.fonSize = $(e).css("font-size");//文字图标大小
	icon_Param.linkType = $(e).attr("linkType");//图表链接方式
	icon_Param.urlLink = $(e).parent().attr("href");//图表链接
	var url = '/myehr/jsp/form/fileUploadConfig/';
	var flag = false;
	var content =   "<div class=\"row cell\" id=\"iconCssChanged\">\n" +
					"	<div class=\"ui search selection dropdown entitybox field-control\" style=\"display:block;\">\n"+
					"		<lable style=\"float:left;font-size:12px;width:100%\">图标类型: </lable>\n"+
					"		<select id=\"iconType\" styleType=\"select\" name=\"iconType\" class=\"form-control\" textField=\"dictName\" valueField=\"dictId\" DictName=\"SYS_NINE_MENU_ICON_TYPE\" dataField=\"dict_form_3877\" initParam = \"_\">\n"+
					"		</select>\n"+
					"	</div>\n"+
					"	<div class=\"ui search selection dropdown entitybox field-control\" style=\"display:block;\">\n"+
					"		<lable style=\"float:left;font-size:12px;width:100%\">背景色: </lable>\n"+
					"		<select id=\"backgroudColor\" styleType=\"select\" name=\"backgroudColor\" class=\"form-control\" onchange=\"changBackgroundColor_icon(this)\" xtype=\"color\"  textField=\"dictName\" valueField=\"dictId\" DictName=\"COLOR_STAND\" dataField=\"dict_form_3877\" >\n"+
					"		</select>\n"+
					"	</div>\n"+
					"	<div class=\"ui search selection dropdown entitybox field-control\" style=\"display:block;\">\n"+
					"		<lable style=\"float:left;font-size:12px;width:100%\">文字颜色: </lable>\n"+
					"		<select id=\"color\" styleType=\"select\" name=\"color\" class=\"form-control\"  xtype=\"color\" onchange=\"changColor_icon(this)\" textField=\"dictName\" valueField=\"dictId\" DictName=\"COLOR_STAND\" dataField=\"dict_form_3877\" >\n"+
					"		</select>\n"+
					"	</div>\n"+
					"	<div class=\"ui search selection dropdown entitybox field-control\" style=\"display:block;\">\n"+
					"		<lable style=\"float:left;font-size:12px;width:100%\">图标大小(字体大小): </lable>\n"+
					"		<input id=\"fonSize\" name=\"fonSize\" type=\"num\" class=\"form-control\" style=\"\"/>\n"+
					"	</div>\n" +
					"	<div class=\"ui search selection dropdown entitybox field-control\" style=\"display:block;\">\n"+
					"		<lable style=\"float:left;font-size:12px;width:100%\">图标链接方式: </lable>\n"+
					"		<select id=\"linkType\" styleType=\"select\" name=\"linkType\" class=\"form-control\" textField=\"dictName\" valueField=\"dictId\" DictName=\"SYS_NINE_MENU_LINK_TYPE\" dataField=\"dict_form_3877\" initParam = \"_\">\n"+
					"		</select>\n"+
					"	</div>\n"+
					"	<div class=\"ui search selection dropdown entitybox field-control\" style=\"display:block;\">\n"+
					"		<lable style=\"float:left;font-size:12px;width:100%\">图标链接: </lable>\n"+
					"		<input id=\"urlLink\" name=\"urlLink\" type=\"num\" class=\"form-control\" style=\"\"/>\n"+
					"	</div>\n" +
					"</div>\n";
	var editIcon = layer.open({
			title:'输入内容',
			shadeClose: true,
			zIndex:9999,
			content: content,
			area: ['300px', '500px'],
			btn: ['确定', '取消'],
			success:function(layero,index){
				cardSelectInitFunctionById('#iconCssChanged');
			},
			yes: function(index, layero){
				icon_Param.id = $(e).attr("iconId");
				icon_Param.iconType = $("#iconType").val();
				icon_Param.backgroudColor = $("#backgroudColor").val();
				icon_Param.color = $("#color").val();
				icon_Param.fonSize = $("#fonSize").val();
				icon_Param.linkType = $("#linkType").val();
				icon_Param.urlLink = $("#urlLink").val();
				flag = true;
				layer.close(editIcon);
			},
			end: function () {
                if(!flag){
					$(e).parent().append(obj);
					$(e).remove();
				}
            }
		});
}
function cardSelectInitFunctionById(e){
	var classes = [];
	classes = $(e).find("select");
	for(var i=0;i<classes.length;i++){
		parame.id=classes[i].id;
		var type=$(classes[i]).attr('xtype');
		var dataField=$(classes[i]).attr('dataField');
		parame.placeholder="";
		parame.jsonParam.nullItemText='';
		parame.jsonParam.dictTypeCode=$(classes[i]).attr('DictName');
		if(type=="color"){
			myehr_initSelect_color(parame,dataField,'');
		}else{
			myehr_initSelect(parame,dataField,'');
		}
	}
}
function changBackgroundColor_icon(e){
	var color = $(e).val();
	var code = $(e).find("option:selected").text().split("_");
	if(code[0]=='渐变'){
		$(".editing_icon").css("background","linear-gradient("+color+")");
	}else{
		$(".editing_icon").css("background-color",color);
	}
}
function changColor_icon(e){
	var color = $(e).val();
	$(".editing_icon").css("color",color);
}
function restoreCss(e){
	if(e=='icon'){
		
	}
}
//关闭(通用)
function closex(){ 
	var index = parent.layer.getFrameIndex(window.name); //获取当前窗体索引
	parent.layer.close(index);//执行关闭
}