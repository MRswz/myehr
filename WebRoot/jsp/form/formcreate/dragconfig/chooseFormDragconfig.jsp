<%@ page language="java" import="java.util.*" import="com.myehr.common.util.LangUtil" pageEncoding="UTF-8"%>
<%@ include file="/common/common.jsp" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<body>
<div class="container-fluid" style="height:100%;overflow-y:hidden">
	<div style="margin-top:10px">
		<div class="BTNGROUP" style="margin:0 auto; display:inline-block;height: 35px;">
			<div style="margin-right:10px;display:inline-block">
			    <input type="button" id="choose" class="btn btn-primary" value=选择 onclick="chooseDrag()"/>
			</div>
		</div>
		<div style="margin-top:10px">
			<div id="formList_filter" style="float:right;display:inline-block;position:relative;">
				<input id="FILTER_2771" name="FILTER_2771" placeholder="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"布局编码")%>,<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"布局名称")%>" style="padding: 6px 30px 6px 10px;" title="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"布局编码")%>,<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"表单名称")%>" type="text" class="form-control" oninput="grid_emp_proce_fun11()" />
				<i class="icon-search" style="position: absolute;right: 12px;top: 7px;cursor: pointer;"></i>
			</div>
		</div>
	</div>
	<table id="formList">
	</table>
</div>
<script>
	$(function() {
    	querys();
		$(".fixed-table-toolbar").css("margin-top","0px");
		$(".container-fluid").css("max-height","100%");
		$(".fixed-table-container").css("height",$('body').height() -45 +"px");
		$(".fixed-table-body").css("height","93%");
	    initDict();
	    initDate();
	    console.log($(".BTNGROUP>div").length);
	    var DIVAMOUNT = 9;
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
    $("#formList").bootstrapTable({  
        url : '${pageContext.request.contextPath }/form/dragconfigFormList.action',  
        height : '700',  
        undefinedText : '-',  
        pagination : true, // 分页  
        striped : true, // 是否显示行间隔色  
        queryParams : queryParams,  
        cache : false, // 是否使用缓存  
        pageList : [ 5, 20, 100 ],  
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
            title : '布局编码',  
            field : 'dragconfigCode', // 字段  
            align : 'center', // 对齐方式（左 中 右）  
            valign : 'middle', //  
            sortable : true ,
            formatter: function (value, row, index) {
                    	return "<a  class=\"eli w100px\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"formDefCode\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"表单编码\">"+value+"</a>";
                	} 
        }, {  
            title : '布局中文名',  
            field : 'dragconfigCname',  
            align : 'center',  
            valign : 'middle',  
            sortable : true  ,
            formatter: function (value, row, index) {
                    	return "<a  class=\"eli w100px\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"formDefName\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"表单名称\">"+value+"</a>";
                	}
        }, {  
            title : '布局表单父id',  
            field : 'dragconfigPid',  
            align : 'center',  
            valign : 'middle',  
            sortable : true  ,
			visible : false,
            formatter: function (value, row, index) {
                    	return "<a  class=\"eli w100px\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"formDefName\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"表单名称\">"+value+"</a>";
                	}
        }, {  
            title : '布局HTML',  
            field : 'dragconfigHtml',  
            align : 'center',  
            valign : 'middle',  
            sortable : true  ,
			visible : false,
            formatter: function (value, row, index) {
                    	return "<a  class=\"eli w100px\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"formDefName\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"表单名称\">"+value+"</a>";
                	}
        }, {  
            title : '原生HTML',  
            field : 'dragconfigHtmlAll',  
            align : 'center',  
            valign : 'middle',  
            sortable : true  ,
			visible : false,
            formatter: function (value, row, index) {
                    	return "<a  class=\"eli w100px\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"formDefName\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"表单名称\">"+value+"</a>";
                	}
        }],
        onClickRow: function (row, $element) {
	                curRow = row;
	                $('#formList').bootstrapTable('uncheckAll');//checkBox单选
	            },
	            onLoadSuccess: function (aa, bb, cc) {
	                $("#formList a").editable({
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
                  url: '${pageContext.request.contextPath }/formList/searchformList.action',  
                  success: function (data) {  
                      $("#formList").bootstrapTable('load',data); 
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
function refresh() {  
    $('#formList').bootstrapTable('refresh');  
}  
/**查询条件与分页数据 */  
function queryParams(pageReqeust) {  
	pageReqeust.enabled = $("#enabled").val();  
	pageReqeust.querys = $("#querys").val();  
    pageReqeust.condition = $("#FILTER_2771").val();  
    pageReqeust.pageNo = this.offset;  
    pageReqeust.pageSize = this.pageNumber;
    pageReqeust.dragconfPid = '${param.formDragconfigPid}';
    pageReqeust.sort = 'form_def_id';
    pageReqeust.deleteMark = 'N';
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


function chooseDrag(){
	var obj = $("#formList").bootstrapTable('getSelections')[0];
	parent.transmit(obj.dragconfigId,obj.dragconfigCname);
}


</script>  
</body>
</html>

