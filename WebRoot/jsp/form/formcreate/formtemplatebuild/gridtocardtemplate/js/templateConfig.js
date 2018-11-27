function queryTemplateColumnList(id,templateParentParamCode){
        $("#"+id).bootstrapTable({
            url :'/myehr/formtemplate/getTemplateColumnList.action?templateCode='+templateCode+'&templateParentParamCode='+templateParentParamCode,
            dataType:'json',
            method:'post',
            height : 900,
            undefinedText : '-',
            pagination : false,
            striped : true,
            fixedColumns: false,
            fixedNumber:0,
            showHeader : true,
            cache : false,
            clickToSelect: true,
            sidePagination : "server",
            columns : [
            {
                field : 'state',
                checkbox : true,
                align : 'center',
                visible : true,
                valign : 'middle'
            },
            {
                title : '参数编码',
                field : 'templateParamCode',
                align : 'center',
                visible : true,
                valign : 'middle',
				formatter: function (value, row, index) {
                    return "<a style=\"font-size:12px;text-decoration:none;color:black;width:50px;\" name=\"templateParamCode\" data-title=\"参数编码\">"+value+"</a>";
                }
            },{
                title : '参数名称',
                field : 'templateParamCname',
                align : 'center',
                visible : true,
                valign : 'middle',
				formatter: function (value, row, index) {
                    return "<a style=\"font-size:12px;text-decoration:none;color:black;width:50px;\" name=\"templateParamCname\" data-title=\"参数名称\">"+value+"</a>";
                }
            },{
                title : '模板编码',
                field : 'templateCode',
                visible : false
            },{
                title : '上级参数编码',
                field : 'templateParentParamCode',
                visible : false
            },{
                title : '参数值',
                field : 'templateParamValue',
                visible : false
            },{
                title : '参数初始值',
                field : 'templateInitParamValue',
                visible : false
            },{
                title : '参数值类型',
                field : 'templateParamValueType',
                visible : false
            },{
                title : '参数值控件',
                field : 'templateParamWidgetType',
                visible : false
            },{
                title : '编码序列',
                field : 'templateParamXu',
                visible : false
            },{
                title : '参数类型',
                field : 'templateParamType',
                visible : false
            }],
            onClickRow: function (row, $element) {
                curRow = row;
				$('#'+id).bootstrapTable('uncheckAll');//checkBox单选
				nowColumnObj = row;
				SetColumnInfo(row);
				lock = true;
            },
			onLoadSuccess: function (aa, bb, cc) {
				//$("#TemplateColumnList ")
                $("#"+id+" a").editable({
                    disabled: true,
                    emptytext: "-",
                    url: function (params) {
                        var sName = $(this).attr("name");
                        curRow[sName] = params.value;
                    },
                    type: 'text'
                });
            },
			onDblClickCell: function (field, value,row,td) {
			} ,
			responseHandler : function(res) {  
					return {  
						total : res.total,  
						rows : res.rows  
					};
				}
		});
			window.operateEvents = {  
			};
}
function SetColumnInfo(obj){
	$("#TEMPLATE_CODE").val(obj.templateCode);
	$("#TEMPLATE_PARAM_CODE").val(obj.templateParamCode);
	$("#TEMPLATE_PARAM_CNAME").val(obj.templateParamCname);
	$("#TEMPLATE_PARENT_PARAM_CODE").val(obj.templateParentParamCode);
	$("#TEMPLATE_PARAM_VALUE").val(obj.templateParamValue);
	$("#TEMPLATE_INIT_PARAM_VALUE").val(obj.templateInitParamValue);
	$("#TEMPLATE_PARAM_VALUE_TYPE").val(obj.templateParamValueType);
	$("#TEMPLATE_PARAM_WIDGET_TYPE").val(obj.templateParamWidgetType);
	$("#TEMPLATE_PARAM_XU").val(obj.templateParamXu);
	$("#TEMPLATE_PARAM_TYPE").val(obj.templateParamType);
	$("#ID").val(obj.id);
}

function getSonColumn(){
	if(lock){
		nowGrade++;
		for(var i=0;i<nowGrade;i++){
			$(".TemplateColumnList"+i).parent().parent().parent().css("display","none");
		}
		var parentCode = nowColumnObj.templateParamCode;
		var tableCell = "<table class=\"TemplateColumnList TemplateColumnList"+nowGrade+"\" id=\"TemplateColumnList"+nowGrade+"\"></table>";
		$(".TCINFOR").append(tableCell);
		$("#buttonList").append("<input type=\"button\" id=\"pInfo"+nowGrade+"\" class=\"btn btn-success\" value=\"上级'"+nowColumnObj.templateParamCname+"'信息\" onclick=\"getPColumn("+nowGrade+")\" >")
		queryTemplateColumnList("TemplateColumnList"+nowGrade,parentCode);
		lock = false;
	}else{
		alert("请选一条数据");
	}
}

function getPColumn(e){
	e--;
	for(var i=nowGrade;i>e;i--){
		$(".TemplateColumnList"+i).parent().parent().parent().remove();
		$("#pInfo"+i).remove();
		$(".clearfix").remove();
	}
	$(".TemplateColumnList"+e).parent().parent().parent().css("display","inline-block");
	nowGrade = e;
	lock = true;
	nowColumnObj = $(".TemplateColumnList"+e).bootstrapTable("getSelections")[0];
}

function setHtml(){
	$(".SHOW_JSP").html(modelBaseHtml);
}

function initModelBaseHtml(){
	$.ajax({
		url: "/myehr/formtemplate/getTemplateInfo.action?templateCode="+templateCode+"&CodeName=TEMPLATE_REMARK",
		type: 'POST',
		cache: false,
		async: false,
		success: function (datas) {
			modelBaseHtml = datas;
		}
	});
}
var modelBaseHtmlAndV;
function yulanJSP(){
	var obj ;
	modelBaseHtmlAndV = modelBaseHtml;
	$.ajax({
		url: "/myehr/formtemplate/getTemplateColumnListToMap.action?templateCode="+templateCode,
		type: 'POST',
		cache: false,
		async: false,
		success: function (datas) {
			obj = datas;
		}
	});
	for(var i in obj) {
		//alert(i+":"+obj[i]);
		var reg = new RegExp("\\["+i+"\\]","g");//g,表示全部替换。
		modelBaseHtmlAndV = modelBaseHtmlAndV.replace(reg,obj[i]);
		//modelBaseHtmlAndV = modelBaseHtmlAndV.replace("["+i+"]",obj[i]);
	}
	$(".SHOW_JSP").html(modelBaseHtmlAndV);
}
function yulanHTML(){
	var jsp = $(".SHOW_JSP").val();
	jsp = "<ul><li>"+jsp+"</ul></li>";
	layer.open({
		closeBtn:1,
		shadeClose:true,
		area:['950','700'],
		maxmin:true,
		title:'时间轴',
		content:jsp,
		success:function(layero,index){
			changeCSS();
		},
		end:function(){	
		}
	 }); 
}

function changeCSS(){
	var textContents = $(".textContent");
	for(var i=0;i<textContents.length;i++){
		var liObj = textContents.eq(i).parent();
		var height = textContents.eq(i).height()+25;
		liObj.find(".centerLine").css("height",height);
		liObj.find(".title").css("height",height);
		textContents.eq(i).css("height",height);
		liObj.find("h4").css("max-height",height-25);
	}
}






















