<%@ page language="java" import="java.util.*" import="com.myehr.common.util.LangUtil" pageEncoding="UTF-8"%>
<%@ include file="/common/common.jsp" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<body style="height:98%">
<div class="container-fluid" style="height:100%;overflow-y:hidden;margin-top:12px">
	<div >
		<div class="BTNGROUP" style="margin:0 auto; display:inline-block;height: 35px;">
			<div style="margin-right:10px;display:inline-block">
			    <input type="button" id="choose" class="btn btn-primary" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"选择")%> onclick="choose()"/>
			</div>			
		</div>
		<div id="dictList_filter" style="float:right;display:inline-block;position:relative;">
			<input id="FILTER_2771" name="FILTER_2771" placeholder="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"字典编码")%>,<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"字典名称")%>" style="padding: 6px 30px 6px 10px;" title="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"字典编码")%>,<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"字典名称")%>" type="text" class="form-control" oninput="refresh()" />
			<i class="icon-search" style="position: absolute;right: 12px;top: 7px;cursor: pointer;"></i>
		</div>
	</div>
	<table id="dictList">
	</table>
</div>
    
<script>
	$(function() {
    	querys();
		$(".fixed-table-toolbar").css("margin-top","0px");
		$(".container-fluid").css("max-height","100%");
		$(".fixed-table-container").css("height",$('body').height() -108 +"px");
		$(".fixed-table-body").css("height","87%");
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
    $("#dictList").bootstrapTable({  
        url : '${pageContext.request.contextPath }/form/findDictList.action',  
        height : '700',  
        undefinedText : '-',  
        pagination : true, // 分页  
        striped : true, // 是否显示行间隔色  
        queryParams : queryParams,  
        cache : false, // 是否使用缓存  
        pageList : [ 5, 10, 20 ],  
        toolbar : "#toolbar",// 指定工具栏  
        clickToSelect: true,
        uniqueId : "dictTypeId", // 每一行的唯一标识  
        sidePagination : "server", // 服务端处理分页  
        columns : [ {  
            field : 'state',  
            checkbox : true,  
            align : 'center',  
            valign : 'middle'  
        }, {  
            title : '字典类主键',  
            field : 'dictTypeId', // 字段  
            visible:false
        },{  
            title : '字典类编码',  
            field : 'dictTypeCode', // 字段  
            align : 'center', // 对齐方式（左 中 右）  
            valign : 'middle', //  
            formatter: function (value, row, index) {
                    	return "<a  class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"dictTypeCode\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"字典类编码\">"+value+"</a>";
                	} 
        }, {  
            title : '字典类名称',  
            field : 'dictTypeName',  
            align : 'center',  
            valign : 'middle',  
            formatter: function (value, row, index) {
                    	return "<a  class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"dictTypeName\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"字典类名称\">"+value+"</a>";
                	}
        }, {  
            title : '字典类分类',  
            field : 'dictTypeClass',  
            align : 'center',  
            valign : 'middle',  
            formatter: function (value, row, index) {
		            	return "<a  class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"dictTypeClass\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"字典类分类\">"+value+"</a>";
		        	}
        }, {  
            title : '字典类描述',  
            field : 'dictTypeRemark',  
            align : 'center',  
            valign : 'middle',  
            formatter: function (value, row, index) {
	            		return "<a  class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"dictTypeRemark\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"字典类描述\">"+value+"</a>";
	            	}
        }],
        onClickRow: function (row, $element) {
	                curRow = row;
	                $('#dictList').bootstrapTable('uncheckAll');//checkBox单选
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
                'click #remove': function (e, value, row, index) {
                if($("#deleteMark").val()=="N")
                {
                	row.deleteMark="Y";
                	$.ajax({  
                       type: 'POST',  
                       data: JSON.stringify(row),  
                       url: '${pageContext.request.contextPath }/formList/saveField.action',  
                       success: function (data) { 
                       	if(data==0) {
                           alert('删除成功');
                       	}
                           refresh();
                       }  
                   });
                }
                else{
                	$.ajax({  
                       type: 'POST',  
                       data: JSON.stringify(row),  
                       url: '${pageContext.request.contextPath }/formList/removeField.action',  
                       success: function (data) { 
                       		if(data==0){
                           		alert('删除成功');
                       		}else if(data==1){
                           		alert('删除异常');
                       		}else if(data==2){
                           		alert('主键不允许删除');
                       		} 
                           refresh();
                       }  
                   }); 
                }
               }
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
                      $("#dictList").bootstrapTable('load',data); 
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
    $('#dictList').bootstrapTable('refresh');  
}  
/**查询条件与分页数据 */  
function queryParams(pageReqeust) {  
	pageReqeust.enabled = $("#enabled").val();  
	pageReqeust.querys = $("#querys").val();  
    pageReqeust.condition = $("#FILTER_2771").val();  
    pageReqeust.pageNo = this.offset;  
    pageReqeust.pageSize = this.pageNumber;
	pageReqeust.DICT_TYPE_ClASS = '${param.type}';
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
	var dictType ='${param.widget}';
	if(dictType=='importColumnDict'){
		var selects = $("#dictList").bootstrapTable('getSelections');
		var code = selects[0].dictTypeCode;
		var name = selects[0].dictTypeName;
		$.ajax({
			url:'${pageContext.request.contextPath }/dictType/saveImportColumnDict.action?importColumnId='+'${param.importColumnId}'+'&dictTypeCode='+code,
			type:'post',
			cache: false,
			contentType: 'application/json;charset=utf-8',
			success: function (text) {
				var index = parent.layer.getFrameIndex(window.name);
				parent.layer.close(index);
			},
			error: function (jqXHR, textStatus, errorThrown) {
			}
		});
	}
	if(dictType=='exportColumnDict'){
		var selects = $("#dictList").bootstrapTable('getSelections');
		var code = selects[0].dictTypeCode;
		var name = selects[0].dictTypeName;
		$.ajax({
			url:'${pageContext.request.contextPath }/dictType/saveExportColumnDict.action?exportColumnId='+'${param.exportColumnId}'+'&dictTypeCode='+code,
			type:'post',
			cache: false,
			contentType: 'application/json;charset=utf-8',
			success: function (text) {
				var index = parent.layer.getFrameIndex(window.name);
				parent.layer.close(index);
			},
			error: function (jqXHR, textStatus, errorThrown) {
			}
		});
	}
	if(dictType=='fileuploadTag'){
		var selects = $("#dictList").bootstrapTable('getSelections');
		var code = selects[0].dictTypeCode;
		var name = selects[0].dictTypeName;
		parent.$("#${param.widget}GuiInitValue2").val(code);
		parent.$("#${param.widget}GuiInitName2").val(name);
		//--关闭 当前页面 开始--
		var index = parent.layer.getFrameIndex(window.name);
		parent.layer.close(index);
	}else{
		var selects = $("#dictList").bootstrapTable('getSelections');
		var code = selects[0].dictTypeCode;
		var name = selects[0].dictTypeName;
		
		parent.$("#${param.widget}GuiInitValue2").val(code);
		parent.$("#${param.widget}GuiInitName2").val(name);
		//--关闭 当前页面 开始--
		var index = parent.layer.getFrameIndex(window.name);
		parent.layer.close(index);
	}
	
}


</script>  
</body>
</html>
