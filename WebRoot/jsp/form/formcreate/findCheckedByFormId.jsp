<%@ page language="java" import="java.util.*" import="com.myehr.common.util.LangUtil" pageEncoding="UTF-8"%>
<%@ include file="/common/common.jsp" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<body>
<div class="row cell" style = "padding-left:15px">
	<div class="BTNGROUP_55" style="margin:0 auto; display:inline-block;min-height: 20px;">
		<div style="margin-right:10px;display:inline-block">
			<input type="button" id="saveChecked"  class="btn btn-primary" value="保存检查点" onclick="saveChecked()"/>
		</div>
	</div>
	<table id="checkedList">
	</table>
	<div class="BTNGROUP_55" style="margin:0 auto; display:inline-block;min-height: 20px;">
		<div style="margin-right:10px;display:inline-block">
			<input type="button" id="saveCheckedPoint"  class="btn btn-primary" value="保存检查点要求" onclick="saveCheckedPoint()"/>
		</div>
	</div>
	<table id="checkedPointList">
	</table>
</div>
<script>
$(function() {
    querys();
	querys_points();
	cardSelectInitFunction('');
})
var checkedId = '';



function querys_points(){
	$("#checkedPointList").bootstrapTable({  
        url : '/myehr/form/findCheckedPointsBycheckedId.action', 
		height:'200',
        queryParams :pointParam,
		contentType: 'application/json;charset=utf-8',
		method:'post',
        undefinedText : '-',  
        striped : true, // 是否显示行间隔色  
        cache : false, // 是否使用缓存  
        clickToSelect: true,
        pagination : false,        
        uniqueId : "id", // 每一行的唯一标识  
        sidePagination : "server", // 服务端处理分页  
        columns : [ 
		{  
		    title : '主键',  
		    field : 'id', 
		    visible:false
		},{  
            field : 'state',  
            checkbox : true,  
            align : 'center',  
            valign : 'middle'  
        },{  
            title : '操作',  
            field : 'checkedId', 
            align: 'center',
            valign: 'middle',
            formatter: function (value, row, index) {            	
            	return "<div style=\"position:relative\">"+
            		   "<i class=\"glyphicon glyphicon-remove\" style=\"position: absolute;opacity: 0.5;right: 38px;top: -6px;cursor: pointer;\" onclick=\"remove2(this)\"></i><div>" ;
        	}
        },{  
            title : '检查点要求',  
            field : 'checkedRequire', 
            align: 'center',
            valign: 'middle',
            formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<div style=\"position:relative\"><input class=\"form-control\" title=\"检查点要求\" type=\"text\" name=\"checkedRequire\" style=\"padding:0 24px 0 12px;\" value=\""+value+"\"/>" ;
        	}
        },{  
            title : '是否完成',  
            field : 'isAchieve', 
            align: 'center',
            valign: 'middle',
			formatter: function (value, row, index) {
				if((value==undefined || value=="")&&value!=0){
					value='-';
				}
				value = (value+'').replace(/ /g,'');
				return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"isAchieve\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"是否完成\" data-source=\"/myehr/dict/searchSysDictEntryTypeCode1.action?deleteMark=SYS_COMMON_YES_NO&realValue="+value+"\"></a>";
			}
        },{  
            title : '检查内容',  
            field : 'checkedContent', 
            align: 'center',
            valign: 'middle',
            formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<div style=\"position:relative\"><input class=\"form-control\" title=\"检查内容\" type=\"text\" name=\"checkedContent\" style=\"padding:0 24px 0 12px;\" value=\""+value+"\"/>" ;
        	}
        },{  
            title : '操作人',  
            field : 'operatorName', 
            align: 'center',
            valign: 'middle',
            formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"operatorName\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"操作人\">"+value+"</a>";
			}
        }, {  
            title : '操作时间',  
            field : 'operatorTime',  
            align : 'center',  
            valign : 'middle', 
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
				return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px\" name=\"operatorTime\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"操作时间\">"+date+"</a>";
			}
        } 	  
        ],
        onClickRow: function (row, $element) {
	                curRow = row;
	            },
	            onLoadSuccess: function (aa, bb, cc) {
	                 $("#checkedPointList a").editable({
							disabled: true,
							emptytext: "-",
							url: function (params) {
								var sName = $(this).attr("name");
								curRow[sName] = params.value;
							},
							type: 'text'
						});
	            },
	            data:[],       
        responseHandler : function(res) {  
            return {  
                total : res.total,  
                rows : res.rows  
            };  
        }, 
    });
}

function querys(){
	$("#checkedList").bootstrapTable({  
        url : '/myehr/form/findCheckedByFormId.action?formId=${param.formId}', 
		height:'200',
        queryParams :'',
        undefinedText : '-',  
        striped : true, // 是否显示行间隔色  
        cache : false, // 是否使用缓存  
        clickToSelect: true,
        pagination : false,        
        uniqueId : "id", // 每一行的唯一标识  
        sidePagination : "server", // 服务端处理分页  
        columns : [ 
		{  
		    title : '主键',  
		    field : 'id', 
		    visible:false
		},{  
            field : 'state',  
            checkbox : true,  
            align : 'center',  
            valign : 'middle'  
        },{  
            title : '操作',  
            field : 'formDefId', 
            align: 'center',
            valign: 'middle',
            formatter: function (value, row, index) {            	
            	return "<div style=\"position:relative\">"+
            		   "<i class=\"glyphicon glyphicon-remove\" style=\"position: absolute;opacity: 0.5;right: 38px;top: -6px;cursor: pointer;\" onclick=\"remove1(this)\"></i><div>" ;
        	}
        },{  
            title : '检查点',  
            field : 'checkedName', 
            align: 'center',
            valign: 'middle',
            formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<div style=\"position:relative\"><input class=\"form-control\" title=\"检查点\" type=\"text\" name=\"checkedName\" style=\"padding:0 24px 0 12px;\" value=\""+value+"\"/>" ;
        	}
        },{  
            title : '操作人',  
            field : 'operatorName', 
            align: 'center',
            valign: 'middle',
            formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"operatorName\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"操作人\">"+value+"</a>";
			}
        }, {  
            title : '操作时间',  
            field : 'operatorTime',  
            align : 'center',  
            valign : 'middle', 
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
				return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px\" name=\"operatorTime\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"操作时间\">"+date+"</a>";
			}
        } 	  
        ],
        onClickRow: function (row, $element) {
	                curRow = row;
					$('#checkedList').bootstrapTable('uncheckAll');//checkBox单选
					checkedId = row.id;
					$('#checkedPointList').bootstrapTable('refresh');
	            },
	            onLoadSuccess: function (aa, bb, cc) {
	                
	            },
	            data:[],       
        responseHandler : function(res) {  
            return {  
                total : res.total,  
                rows : res.rows  
            };  
        }, 
    });
}


 function remove1(obj){
	var checked = {};
	checked.id = $(obj).parent().parent().parent().attr("data-uniqueid");
	$.ajax({
		url:'/myehr/form/deleteChecked.action',
		type:'post',
		cache: false,
		data:JSON.stringify(checked),
		contentType: 'application/json;charset=utf-8',
		async: false,
		success: function (data) {
			
			}
		});
	$('#checkedList').bootstrapTable('refresh');
}
function remove2(obj){
	var checked = {};
	checked.id = $(obj).parent().parent().parent().attr("data-uniqueid");
	$.ajax({
		url:'/myehr/form/deleteCheckedPoint.action',
		type:'post',
		cache: false,
		data:JSON.stringify(checked),
		contentType: 'application/json;charset=utf-8',
		async: false,
		success: function (data) {
			
			}
		});
	$('#checkedPointList').bootstrapTable('refresh');
}

function saveChecked(){
	var datas = $("#checkedList").bootstrapTable("getData");
	var saveDatas = [];
	for(var i=0;i<datas.length;i++){
		var checkedName = $("#checkedList>tbody").find("tr").eq(i).find("input").eq(1).val();
		if(checkedName!=datas[i].checkedName){		
		//实体可修改部分是否修改(有一处不同,就需修改)
			datas[i].checkedName=checkedName;
			datas[i].formDefId='${param.formId}';
			saveDatas.push(datas[i]);
		}
	}
	var url = "/myehr/form/updateCheckeds.action";//更新实体信息
	$.ajax({
		url:url,
		type:'post',
		cache: false,
		contentType: 'application/json;charset=utf-8',
		data:JSON.stringify(saveDatas),
		async: false,
		success: function (data) {				
			}
		});
	$('#checkedList').bootstrapTable('refresh');
}

function saveCheckedPoint(){
	var datas = $("#checkedPointList").bootstrapTable("getData");
	var saveDatas = [];
	for(var i=0;i<datas.length;i++){
		var checkedRequire = $("#checkedPointList>tbody").find("tr").eq(i).find("input").eq(1).val();
		var checkedContent = $("#checkedPointList>tbody").find("tr").eq(i).find("input").eq(2).val();
		if(checkedRequire!=datas[i].checkedRequire||checkedContent!=datas[i].checkedContent){		
		//实体可修改部分是否修改(有一处不同,就需修改)
			datas[i].checkedRequire=checkedRequire;
			datas[i].checkedContent=checkedContent;
			datas[i].checkedId=checkedId;
			saveDatas.push(datas[i]);
		}
	}
	var url = "/myehr/form/updateCheckedPoints.action";//更新实体信息
	$.ajax({
		url:url,
		type:'post',
		cache: false,
		contentType: 'application/json;charset=utf-8',
		data:JSON.stringify(saveDatas),
		async: false,
		success: function (data) {				
			}
		});
	$('#checkedPointList').bootstrapTable('refresh');
}

function pointParam(){
	var point = {};
	point.checkedId = checkedId;
	return JSON.stringify(point);
}

</script>
</body>
</html>