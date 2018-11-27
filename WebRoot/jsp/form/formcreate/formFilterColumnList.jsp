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
			<input id="FILTER_2771" name="FILTER_2771" placeholder="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"字段英文名")%>,<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"字段显示名")%>" style="padding: 6px 30px 6px 10px;" title="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"字段英文名")%>,<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"字段显示名")%>" type="text" class="form-control" oninput="grid_emp_proce_fun11()" />
			<i class="icon-search" style="position: absolute;right: 12px;top: 7px;cursor: pointer;"></i>
		</div>
	</div>
	<table id="formList">
	</table>
</div>
    
<script>

	var formId = '${param.formDefId}';

	$(function() {
    	query();
		$(".fixed-table-toolbar").css("margin-top","0px");
		$(".container-fluid").css("max-height","100%");
		$(".fixed-table-container").css("height",$('body').height() -58 +"px");
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
  
	function query() { 
		$("#formList").bootstrapTable({  
			url : '${pageContext.request.contextPath }/form/selectFilterColumn.action', 
			contentType: 'application/json;charset=utf-8',
            dataType:'json',
            method:'post',
            height : '578',
            undefinedText : '-',
            pagination : true,
            striped : true,
            queryParams : grid_emp_proce_fun,
			striped : true, // 是否显示行间隔色  
			cache : false, // 是否使用缓存  
			clickToSelect: true,
			pagination : false,        
			uniqueId : "templateColumnId", // 每一行的唯一标识  
			sidePagination : "server", // 服务端处理分页  
			columns : [ {  
				field : 'state',  
				checkbox : true,  
				align : 'center',  
				valign : 'middle'
			}, {  
				title : '表单字段ID',  
				field : 'formColumnId', // 字段  
				align : 'center', // 对齐方式（左 中 右）  
				valign : 'middle', //  
				sortable : true ,
				visible:false,
				formatter: function (value, row, index) {
							return "<a  class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"formColumnId\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"表单字段ID\">"+value+"</a>";
						} 				
			}, {  
				title : '实体表名',  
				field : 'formEntityTablename', // 字段  
				align : 'center', // 对齐方式（左 中 右）  
				valign : 'middle', //  
				sortable : true ,
				formatter: function (value, row, index) {
							return "<a  class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"formEntityTablename\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"实体表名\">"+value+"</a>";
						} 
			}, {  
				title : '字段英文名',  
				field : 'formFieldTablename',  
				align : 'center',  
				valign : 'middle',  
				sortable : true  ,
				formatter: function (value, row, index) {
							return "<a  class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"formFieldTablename\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"字段英文名\">"+value+"</a>";
						}
			}, {  
				title : '字段显示名',  
				field : 'formColumnLable',  
				align : 'center',  
				valign : 'middle',  
				sortable : true  ,
				formatter: function (value, row, index) {
							return "<a  class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"formColumnLable\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"字段显示名\">"+value+"</a>";
						}
			}],
			onClickRow: function (row, $element) {
						curRow = row;
						
					},
					onLoadSuccess: function (aa, bb, cc) {
						
					},
					data:[],       
			responseHandler : function(res) { 
				rowsNum = res.total;
				return {  
					total : res.total,  
					rows : res.rows  
				};  
			}, 
		});
	}
    
    window.operateEvents = {  'click #remove': function (e, value, row, index) {
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
    return pageReqeust;  
}
function grid_emp_proce_fun(pageReqeust){
	var _filterdata={};
	
	var searchValue = document.getElementById("FILTER_2771").value;
	_filterdata={searchValue:searchValue,formId:formId};
	var userId = '1';
	var paramsMap = {userId:userId};
	var requestParam={};
	requestParam = {};
	
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.formId=formId;
	pageReqeust.isView=null;
	return JSON.stringify(pageReqeust);
}


function grid_emp_proce_fun11(){
	$('#formList').bootstrapTable('refresh');
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
	var selects = $("#formList").bootstrapTable('getSelections');
	var param ={};
	param.columns=selects;
	param.formId = formId;
	param.gridFilterId='${param.gridFilterId}';
	$.ajax({
		url:'${pageContext.request.contextPath }/form/saveSelectFilterColumn.action',
		type:'post',
		cache: false,
		contentType: 'application/json;charset=utf-8',
		data:JSON.stringify(param),
		async: false,
		success: function (data) {
			if(data[0]=="0"){
				alert(data[1]);
				close();
			}
		}
	});
}

//关闭
function close(){ 
	var index = parent.layer.getFrameIndex(window.name); //获取当前窗体索引
	parent.layer.close(index);//执行关闭
}


</script>  
</body>
</html>
