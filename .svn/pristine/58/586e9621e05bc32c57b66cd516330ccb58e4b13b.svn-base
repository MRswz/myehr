<%@ page language="java" import="java.util.*" import="com.myehr.common.util.LangUtil" pageEncoding="UTF-8"%>
<%@ include file="/common/common.jsp" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<body>
<div class="container-fluid" style="height:100%;overflow-y:hidden;padding-top:12px">
	<div >
		<div class="BTNGROUP" style="margin:0 auto; display:inline-block;height: 35px;">
			<div style="margin-right:10px;display:inline-block">
			    <input type="button" id="add" class="btn btn-primary" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"增加")%> onclick="add()"/>
			</div>
			<div style="margin-right:10px;display:inline-block">
			    <input type="button" id="update" class="btn btn-primary" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"修改")%> onclick="update()"/>
			</div>
		</div>
		<div id="formList_filter" style="float:right;display:inline-block;position:relative;">
			<input id="FILTER_2771" name="FILTER_2771" placeholder="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"模板编码")%>,<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"模板名称")%>" style="padding: 6px 30px 6px 10px;" title="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"模板编码")%>,<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"模板名称")%>" type="text" class="form-control" oninput="refreshList()" />
			<i class="icon-search" style="position: absolute;right: 12px;top: 7px;cursor: pointer;"></i>
		</div>
	</div>
	<table id="formtemplate">
	</table>
</div>
    
<script>
	$(function() {
    	querys();
		$(".fixed-table-toolbar").css("margin-top","0px");
		$(".container-fluid").css("max-height","100%");
		$(".fixed-table-container").css("height",$('body').height() -58 +"px");
		$(".fixed-table-body").css("height","85%");
	    initDict();
	    initDate();
	    console.log($(".BTNGROUP>div").length);
	    var DIVAMOUNT = 5;
	    if($(".BTNGROUP>div").length > DIVAMOUNT){
	    	var len = $(".BTNGROUP>div").length;
	    	$(".BTNGROUP>div:gt(4)").hide();
	    	var selectObj = $('<div class="btn-group"><button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">更多 <span class="caret"></span></button><ul class="dropdown-menu" style="min-width:90px;left:-14px;"></ul></div>');
	    	$(".BTNGROUP").append(selectObj);
	    	for(var i=DIVAMOUNT;i<len;i++){
	    		var liObj = $('<li style="margin-left:14px;"></li>');
	    		liObj.append($(".BTNGROUP>div").eq(i).clone(true));
	    		selectObj.find('.dropdown-menu').append(liObj);
	    		selectObj.find('.dropdown-menu').append($('<li role="separator" class="divider"></li>'));
	    	}
	    	selectObj.find('.dropdown-menu div').show();
	    }
	});
  
function querys() {   
    $("#formtemplate").bootstrapTable({  
        url : '${pageContext.request.contextPath }/formtemplate/findTemplateList.action',  
        height : '700',  
        undefinedText : '-',  
        pagination : true, // 分页  
        striped : true, // 是否显示行间隔色  
        queryParams : queryParams,  
        cache : false, // 是否使用缓存  
        pageList : [ 5, 10, 20 ],  
        toolbar : "#toolbar",// 指定工具栏  
        showColumns : true, // 显示隐藏列  
        clickToSelect: true,
        showRefresh : true, // 显示刷新按钮  
        uniqueId : "userName", // 每一行的唯一标识  
        sidePagination : "server", // 服务端处理分页  
        columns : [ {  
            field : 'state',  
            checkbox : true,  
            align : 'center',  
            valign : 'middle'  
        }, {  
            title : '模板编码',  
            field : 'templateCode', // 字段  
            align : 'center', // 对齐方式（左 中 右）  
            valign : 'middle', //  
            sortable : true,
            formatter: function (value, row, index) {
                    	return "<a style=\"font-size:12px;text-decoration:none;color:black;width:150px;\"  class=\"eli w100px\" name=\"templateCode\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"模板编码\">"+value+"</a>";
                	} 
        }, {  
            title : '模板名称',  
            field : 'templateName',  
            align : 'center',  
            valign : 'middle',  
            sortable : true,
            formatter: function (value, row, index) {
                    	return "<a style=\"font-size:12px;text-decoration:none;color:black;width:150px;\"  class=\"eli w100px\" name=\"templateName\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"表单名称\">"+value+"</a>";
                	}
        }, {  
            title : '模板主键',  
            field : 'templateId',  
            visible : false 
        }, {  
            title : 'PC列表',  
            field : 'pcGridShow',  
            align : 'center',  
            valign : 'middle',  
            sortable : true  ,
            formatter: function (value, row, index) {
            	return "<a style=\"font-size:12px;text-decoration:none;color:black;width:50px;\"  class=\"eli w60px\" name=\"pcGridShow\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"PC列表\">"+value+"</a>";
                	}
        }, {  
            title : 'PC卡片',  
            field : 'pcCardShow',  
            align : 'center',  
            valign : 'middle',  
            sortable : true  ,
            formatter: function (value, row, index) {
            	return "<a style=\"font-size:12px;text-decoration:none;color:black;width:50px;\"  class=\"eli w60px\" name=\"pcCardShow\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"PC卡片\">"+value+"</a>";
                	}
            }, {  
            title : 'APP列表',  
            field : 'appGridShow',  
            align : 'center',  
            valign : 'middle',  
            sortable : true  ,
            formatter: function (value, row, index) {
                    	return "<a style=\"font-size:12px;text-decoration:none;color:black;width:50px;\"  class=\"eli w60px\" name=\"appGridShow\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"APP列表\">"+value+"</a>";
                	}
        }, {  
            title : 'APP卡片',  
            field : 'appCardShow',  
            align : 'center',  
            valign : 'middle',  
            sortable : true  ,
            formatter: function (value, row, index) {
		            	var date = "-";
		                if(value!=null){
		                    date = value;
		                }
                    	return "<a style=\"font-size:12px;text-decoration:none;color:black;width:50px;\" class=\"eli w60px\" name=\"appCardShow\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"APP卡片\">"+date+"</a>";
                	}
        },  {  
            title : '操作者',  
            field : 'operatorName',  
            align : 'center',  
            valign : 'middle',  
            sortable : true  ,
            formatter: function (value, row, index) {
		            	var date = "-";
		                if(value!=null){
		                    date = value;
		                }
                    	return "<a style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" class=\"eli w40px\" name=\"operatorName\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"操作者\">"+date+"</a>";
                	}
        },  {  
            title : '操作时间',  
            field : 'operatorTime',  
            align : 'center',  
            valign : 'middle',  
            sortable : true  ,
            formatter: function (value, row, index) {
	            	var date = "-";
	                if(value!=null){
	                var val = value+"";
	                	if((("yyyy-MM-dd"=="hh:mm")&&val.indexOf(":")>1)||("yyyy-MM-dd"=="yyyyMM")){
	                		date = value ;
	                	}else{
	                    date = new Date(value).Format("yyyy-MM-dd");
	                	}
	                }
                    	return "<a style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" class=\"eli w100px\" name=\"operatorTime\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"操作时间\">"+date+"</a>";
                	}
        },  {  
            title : '树节点ID',  
            field : 'templateFolderId',  
            visible : false 
        }],
        onClickRow: function (row, $element) {
	                curRow = row;
	            },
	            onLoadSuccess: function (aa, bb, cc) {
	                $("#formtemplate a").editable({
	                    disabled: true,
	                    emptytext: "-",
	                    url: function (params) {
	                        var sName = $(this).attr("name");
	                        curRow[sName] = params.value;
	                    },
	                    type: 'text'
	                });
	            },
        responseHandler : function(res) {  
            return {  
                total : res.total,  
                rows : res.rows  
            };  
        }, 
    });
    
    window.operateEvents = {  
                
           };
	}    
	
	//查询
	function search(){
	var condition=new Object();
	condition.fieldCode = $("#search").val();
	condition.deleteMark = $("#deleteMark").val();
	condition.fieldEntityId = $("#EntityId").val();
		$.ajax({  
                  type: 'POST',  
                  data: JSON.stringify(condition),  
                  url: '${pageContext.request.contextPath }/formtemplate/searchformList.action',  
                  success: function (data) {  
                      $("#formtemplate").bootstrapTable('load',data); 
                  }  
              });
	}

/** 替换数据为文字 */  
function genderFormatter(value) {  
    if (value == null || value == undefined) {  
        return "-";  
    } else if (value==1) {  
        return "已删除";  
    } else if(value==0){  
        return "正常";  
    }  
}  
/** 刷新页面 */  
function refreshList() {  
    $('#formtemplate').bootstrapTable('refresh');  
}  
/**查询条件与分页数据 */  
function queryParams(pageReqeust) {  
	pageReqeust.enabled = $("#enabled").val();  
	pageReqeust.querys = $("#querys").val();  
    pageReqeust.condition = $("#FILTER_2771").val();  
    pageReqeust.pageNo = this.offset;  
    pageReqeust.pageSize = this.pageNumber;
    pageReqeust.formDefFolderId = '${param.FOLDER_TREE_ID}';
    pageReqeust.sort = 'template_id';
    return pageReqeust;  
}   
/**下拉控件 */
var classes = $("select");
var parame={
    id:'',
    value:"N",
    width: "100px",
    height:"45px",
    url:'${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode.action?userId=${sessionScope.userid}',
	  jsonParam:{},
    chang:function (e){
    }
};
function initDict(){
    for(var i=0;i<classes.length;i++){
        parame.id=classes[i].id;
		  var type=$(classes[i]).attr('multiSelect');
        parame.placeholder="";
        parame.jsonParam.dictTypeCode=$(classes[i]).attr('DictName');
		  if(type=="true"){
		  	myehr_initSelectMore(parame);
		  }else{
	        myehr_initSelect(parame);
		  }
    }
}
/**初始化日期控件  */
function initDate(){
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
} 

function add(){
	if('${param.FOLDER_TREE_ID}'==''){
   			alert("系统参数错误，未找到业务类型。");
   			return;
   		}

	var url = '/myehr/jsp/form/formcreate/formtemplatebuild/templateCreat.jsp?templateId=';
	var content =   "<div class=\"col-lg-4 col-md-4 col-sm-6 col-xs-12\">\n"+
							"	<div class=\"ui search selection dropdown entitybox field-control\" style=\"display: inline-block;\">\n"+
							"		<lable style=\"float:left;font-size:12px\">模板编码: </lable>\n"+
							"		<input id=\"templateCode\" name=\"templateCode\" type=\"text\"  required=\"true\" class=\"form-control\"  />\n"+
							"	</div>\n"+
							"</div>\n"+
							"<div class=\"col-lg-4 col-md-4 col-sm-6 col-xs-12\">\n"+
							"	<div class=\"ui search selection dropdown entitybox field-control\" style=\"display: inline-block;\">\n"+
							"		<lable style=\"float:left;font-size:12px\">模板名称: </lable>\n"+
							"		<input id=\"templateName\" name=\"templateName\" type=\"text\"  required=\"true\" class=\"form-control\"  />\n"+
							"	</div>\n"+
							"</div>\n";
							
		layer.open({
			title:'输入内容',
			shadeClose: true,
			zIndex:9999,
			content: content,
			area: ['500px', '300px'],
			btn: ['确定', '取消'],
			success:function(layero,index){
			},
			yes: function(index, layero){
				var templateCode = $("#templateCode").val();
				var templateName = $("#templateName").val();
				$.ajax({
					url:'${pageContext.request.contextPath }/formtemplate/createTemplate.action?templateFolderId=${param.FOLDER_TREE_ID}&templateCode='+templateCode+'&templateName='+templateName,
					type:'POST',
					cache: false,
					async: false,
					success: function (data) {
							if(data == "2"){
								layer.alert('保存失败,模板编码重复!', {
									  icon: 5,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
									  skin: 'layer-ext-moon' 
									})
							}else{
								url+=data;
								layer.close(index);
								window.open(url);
							}
							
						}
					});
			  },
			btn2: function(index, layero){
				
			  }
		});
	}

function update(){
	var hrs = $("#formtemplate").bootstrapTable('getSelections');
	if(hrs.length!=1){
		alert("<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"请选中一条数据")%>");
	}
	var url = '/myehr/jsp/form/formcreate/formtemplatebuild/templateCreat.jsp?type=edit&templateId='+hrs[0].templateId;
	window.open(url);   
}

</script>  
</body>
</html>
