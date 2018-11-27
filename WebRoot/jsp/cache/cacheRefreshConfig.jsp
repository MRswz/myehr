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
			    <input type="button" id="add" class="btn btn-primary" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"添加所需刷新缓存的字典")%> onclick="add()"/>
				<input type="button" id="delete" class="btn btn-danger" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"删除")%> onclick="deleteCache()"/>
			</div>			
		</div>
	</div>
	<table id="cacheList">
	</table>
</div>
    
<script>

	$(function() {
    	query();
	});
  
	function query() { 
		$("#cacheList").bootstrapTable({  
			url : '${pageContext.request.contextPath }/cache/selectButtonFreshCache.action?buttonId=${param.buttonId}', 
			contentType: 'application/json;charset=utf-8',
            dataType:'json',
            method:'post',
            height : '578',
            undefinedText : '-',
            pagination : true,
            striped : true,
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
				title : '主键',  
				field : 'id', 
				visible:false 				
			}, {  
				title : '字典编码',  
				field : 'cacheId', // 字段  
				align : 'center', // 对齐方式（左 中 右）  
				valign : 'middle',
				formatter: function (value, row, index) {
					return "<a  class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"cacheId\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"字典编码\">"+value+"</a>";
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

function add(){
	var url = '/myehr/jsp/cache/buttonFreshCache.jsp?buttonId=${param.buttonId}';
	layer.open({
		type:2,
		closeBtn:1,
		shadeClose:true,
		area:['950','700'],
		maxmin:true,
		title:'刷新缓存配置',
		content:url,
		success:function(layero,index){			
		},
		end:function(layero,index){
			$("#cacheList").bootstrapTable('refresh');
		}
	 }); 
}

function deleteCache(){
	var hrs = $("#cacheList").bootstrapTable('getSelections');
	if(hrs.length<1){
		layer.alert('请选中一条数据', {
			  icon: 2,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
			  skin: 'layer-ext-moon' 
			})
	}
	$.ajax({
		url:'${pageContext.request.contextPath }/cache/deleteCacheConfigs.action',
		type:'post',
		cache: false,
		contentType: 'application/json;charset=utf-8',
		data:JSON.stringify(hrs),
		async: false,
		success: function (data) {	
				$("#cacheList").bootstrapTable('refresh');
			}
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
