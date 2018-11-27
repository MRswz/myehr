<%@ page language="java" import="java.util.*" import="com.myehr.common.util.LangUtil" pageEncoding="UTF-8"%>
<%@ include file="/common/common.jsp" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<body>
<div class="container-fluid" style="height:100%;overflow-y:hidden;margin-top:12px">
	<div >
		<div class="BTNGROUP" style="margin:0 auto; display:inline-block;height: 35px;">
			<div style="margin-right:10px;display:inline-block">
			    <input type="button" id="choose" class="btn btn-primary" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"选择")%> onclick="choose()"/>
			</div>			
		</div>
		<div id="formList_filter" style="float:right;display:inline-block;position:relative;">
			<input id="FILTER_2771" name="FILTER_2771" placeholder="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"表单编码")%>,<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"表单名称")%>" style="padding: 6px 30px 6px 10px;" title="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"表单编码")%>,<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"表单名称")%>" type="text" class="form-control" oninput="grid_emp_proce_fun11()" />
			<i class="icon-search" style="position: absolute;right: 12px;top: 7px;cursor: pointer;"></i>
		</div>
	</div>
	<table id="columnList">
	</table>
</div>
    
<script>
	$(function() {
    	querys();
	});
  
function querys(){
	$("#columnList").bootstrapTable({  
        url : '/myehr/form/findColumnList.action?formDefId=${param.formId}', 
		height : '578',
        queryParams :'',
        undefinedText : '-',  
        striped : true, // 是否显示行间隔色  
        cache : false, // 是否使用缓存  
		async: false,
        clickToSelect: true,
        pagination : false,        
        uniqueId : "formColumnId", // 每一行的唯一标识  
        sidePagination : "server", // 服务端处理分页  
        columns : [ 
		{  
		    field : 'state',  
		    checkbox : true,  
		    align : 'center',  
		    valign : 'middle'  
		},
		{   
		    field : 'formColumnId', 
		    visible:false
		},
        {   
            field : 'formColumnFormDefId', 
            visible:false
        },
        {   
            field : 'formColumnEntityId', 
            visible:false
        },
        {   
            field : 'formColumnColumnId', 
            visible:false
        },        
        {  
            title : '实体名称',  
            field : 'formEntityTablename', 
            align: 'center',
            valign: 'middle',
	        formatter: function (value, row, index) {
	            if(value==undefined){
	                value='-';
	            }
	            	  return "<a  class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;\" name=\"formEntityTablename\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"实体名称\">"+value+"</a>";
	        }
        }, {  
            title : '字段名称',  
            field : 'formFieldTablename',  
            align : 'center',  
            valign : 'middle', 
            formatter: function (value, row, index) {
	            if(value==undefined){
	                value='-';
	            }
	            	  return "<a  class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;\" name=\"formFieldTablename\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"字段名称\">"+value+"</a>";
	        }
        }, {  
            title : '字段显示名称',  
            field : 'formColumnLable',  
            align : 'center',  
            valign : 'middle',  
            formatter: function (value, row, index) {
	            if(value==undefined){
	                value='-';
	            }
	            	  return "<a  class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;\" name=\"formColumnLable\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"字段显示名称\">"+value+"</a>";
	        }
        }, {  
            title : '控件类型',  
            field : 'formColumnGuiType',  
            align : 'center',  
            valign : 'middle',
		    visible:false,
	        formatter: function (value, row, index) {
	            if((value==undefined || value=="")&&value!=0){
	                value='-';
	            }
	            value = (value+'').replace(/ /g,'');
	            return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"formColumnGuiType\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"控件类型\" data-source=\"/myehr/dict/searchSysDictEntryTypeCode1.action?deleteMark=SYS_FORM_GUI_TYPE&realValue="+value+"+\"></a>";
	        }
        },{  
            title : '显示宽度',  
            field : 'formColumnWidth', 
            align: 'center',
            valign: 'middle',  
		    visible:false,
            formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<div style=\"position:relative\"><input class=\"form-control\" title=\"参数名称\" type=\"text\" name=\"buttonParamName\" style=\"padding:0 24px 0 12px;\" value=\""+value+"\"/>" ;
        	}
        },{  
            title : '显示高度',  
            field : 'formColumnHeight', 
            align: 'center',
            valign: 'middle',  
		    visible:false,
            formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<div style=\"position:relative\"><input class=\"form-control\" title=\"参数名称\" type=\"text\" name=\"buttonParamName\" style=\"padding:0 24px 0 12px;\" value=\""+value+"\"/>" ;
        	}
        },{  
            title : '显示方式',  
            field : 'formColumnShowType', 
            align: 'center',
            valign: 'middle',  
		    visible:false,
            formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<div style=\"position:relative\"><input class=\"form-control\" title=\"参数名称\" type=\"text\" name=\"buttonParamName\" style=\"padding:0 24px 0 12px;\" value=\""+value+"\"/>" ;
        	}
        },{  
            title : '显示顺序',  
            field : 'formColumnSort', 
            align: 'center',
            valign: 'middle',  
		    visible:false,
            formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<div style=\"position:relative\"><input class=\"form-control\" title=\"参数名称\" type=\"text\" name=\"buttonParamName\" style=\"padding:0 24px 0 12px;\" value=\""+value+"\"/>" ;
        	}
        },{  
            title : '对齐方式',  
            field : 'formColumnAlign', 
            align: 'center',
            valign: 'middle',  
		    visible:false,
            formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<div style=\"position:relative\"><input class=\"form-control\" title=\"参数名称\" type=\"text\" name=\"buttonParamName\" style=\"padding:0 24px 0 12px;\" value=\""+value+"\"/>" ;
        	}
        },{  
            title : '是否必填',  
            field : 'formColumnRequired', 
            align: 'center',
            valign: 'middle',  
		    visible:false,
            formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<div style=\"position:relative\"><input class=\"form-control\" title=\"参数名称\" type=\"text\" name=\"buttonParamName\" style=\"padding:0 24px 0 12px;\" value=\""+value+"\"/>" ;
        	}
        },{  
            title : '跨字段数',  
            field : 'formColumnColSpan', 
            align: 'center',
            valign: 'middle',  
		    visible:false,
            formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<div style=\"position:relative\"><input class=\"form-control\" title=\"参数名称\" type=\"text\" name=\"buttonParamName\" style=\"padding:0 24px 0 12px;\" value=\""+value+"\"/>" ;
        	}
        },{  
            title : '最大字符数',  
            field : 'formColumnMaxLength', 
            align: 'center',
            valign: 'middle',  
		    visible:false,
            formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<div style=\"position:relative\"><input class=\"form-control\" title=\"参数名称\" type=\"text\" name=\"buttonParamName\" style=\"padding:0 24px 0 12px;\" value=\""+value+"\"/>" ;
        	}
        },{  
            title : '最小字符数',  
            field : 'formColumnMinLength', 
            align: 'center',
            valign: 'middle',  
		    visible:false,
            formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<div style=\"position:relative\"><input class=\"form-control\" title=\"参数名称\" type=\"text\" name=\"buttonParamName\" style=\"padding:0 24px 0 12px;\" value=\""+value+"\"/>" ;
        	}
        },{  
            title : '字段值范围',  
            field : 'formColumnColorCondition', 
            align: 'center',
            valign: 'middle',  
		    visible:false,
            formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<div style=\"position:relative\"><input class=\"form-control\" title=\"参数名称\" type=\"text\" name=\"buttonParamName\" style=\"padding:0 24px 0 12px;\" value=\""+value+"\"/>" ;
        	}
        },{  
            title : '字段颜色',  
            field : 'formColumnColor', 
            align: 'center',
            valign: 'middle',  
		    visible:false
        },{  
            title : '所属分组',  
            field : 'formGroupId', 
            align: 'center',
            valign: 'middle',  
		    visible:false
        },{  
            title : '列类型',  
            field : 'formColumnType', 
            align: 'center',
            valign: 'middle',  
		    visible:false
        },{  
            title : '跨行数',  
            field : 'formColumnRowSpan', 
            align: 'center',
            valign: 'middle',  
		    visible:false
        },{  
            title : '是否合计',  
            field : 'formColumnTotal', 
            align: 'center',
            valign: 'middle',  
		    visible:false
        },{  
            title : '是否开发字段',  
            field : 'formColumnIsDev', 
            align: 'center',
            valign: 'middle',  
		    visible:false
        }
        
        ],
        onClickRow: function (row, $element) {
		        	curRow = row;
	            },      
        responseHandler : function(res) {  
            return {  
                total : res.total,  
                rows : res.rows  
            };  
        },
        onLoadSuccess : function(){
        	
        }
    });
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
    pageReqeust.formDefFolderId = '${param.FOLDER_TREE_ID}';
    pageReqeust.sort = 'form_def_id';
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

  

function choose(){
	var selects = $("#columnList").bootstrapTable('getSelections');
	var name = selects[0].formEntityTablename.replace(/_/g, "")+"_"+selects[0].formFieldTablename+"_"+selects[0].formColumnFormDefId;
	parent.transmit(name);
}



</script>  
</body>
</html>
