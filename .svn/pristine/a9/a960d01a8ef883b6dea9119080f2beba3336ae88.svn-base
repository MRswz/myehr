<%@ page language="java" import="java.util.*" import="com.myehr.common.util.LangUtil" pageEncoding="UTF-8"%>
<%@ include file="/common/common.jsp" %>
<html>
<head>
<style type="text/css">
#EntityTableList tbody>tr>td .form-control{border:none}
#EntityTableList tbody>tr>td {padding:2px 5px;font-size:12px}
</style>
</head>
<body>
<div id="form" class="wizard-big">
	<div class="row">
		<div id="group" name="form_step3" class="col-sm-12" >
			<div class="container-fluid" style="">
				<div style="">
					<div style="padding:5px 8px 0 8px;height:100%">
						<div class="input-group">
						    <div id="grid_emp_emp_list_filter">
						        <table class="cbs-table" style="margin-bottom:5px">
						             <tr>
										<td style="padding-left:10px;font-size:14px;font-weight:600"  width="80"  >
											<lable><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"删除标识")%>: </lable></td>
										<td style="padding-left:10px;"  align="left"  >
											<select id="deleteMark" title="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"删除标识")%>" name="account" onchange="updateJsp()"  class="form-control" DictName="SYS_COMMON_YES_NO" dataField="dictList">
											</select>
										</td>
						            </tr>
						        </table>
						    </div>
						</div>
						<div class="BTNGROUP_55" style="margin:0 auto; display:block;height: 30px;">
							<div style="display:inline-block">
								<input type="button" id="lead"  class="btn btn-danger" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"引入数据结构")%> onclick="lead()"/>
							</div>
							<div style="display:inline-block">
								<input type="button" id="save"  class="btn btn-warning" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"保存映射")%> onclick="saveData()"/>
							</div>
							<div style="display:inline-block">
								<input type="button" id="add"  class="btn btn-primary" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"新增实体")%> onclick="addRow()"/>
							</div>
							<div style="display:inline-block">
								<input type="button" id="saveAndCreate"  class="btn btn-success" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"保存并创建字段")%> onclick="saveDataAndCreate()"/>
							</div>
							<div style="display:inline-block">
								<input type="button" id="add"  class="btn btn-primary" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"导出实体")%> onclick="exportEntity()"/>
							</div>
							<div style="display:inline-block">
								<input type="button" id="add"  class="btn btn-primary" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"导出实体字段")%> onclick="exportField()"/>
							</div>
							<div id="grid_ORG_comp_info_filter" style="float:right;display:inline-block;position:relative;">
								<input id="search" name="FILTER_1003" placeholder="Search" style="padding: 6px 30px 6px 10px;height:22px" title="Search" type="text" class="form-control" oninput="search()" />
								<i class="icon-search" style="position: absolute;right: 12px;top:1px;cursor: pointer;"></i>
							</div>
						</div>
						<table id="EntityTableList">
						</table>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
    
<script>
	var entityType = '${param.entityType}';
	$(function() {  
	    querys();
	    $(".fixed-table-body").css("height","78%");
	    initDict();
	})
    var datarows;
    /**下拉控件 */
	var classes ;
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
			parame.jsonParam.dictTypeCode=$(classes[i]).attr('DictName');
			if(type=="true"){
				myehr_initSelectMore(parame,dataField);
			}else{
				myehr_initSelect(parame,dataField);
			}
		}
	}
	/**取url参数值  */
	function getQueryString(name) {
	    var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)", "i");
	    var r = window.location.search.substr(1).match(reg);
	    if (r != null) return unescape(r[2]); return null;
	}
	function querys() {   
    $("#EntityTableList").bootstrapTable({  
        url : '${pageContext.request.contextPath }/EntityList/findEntityList.action',  
        height : '495',  
        undefinedText : '-',  
        pagination : true, // 分页  
        striped : true, // 是否显示行间隔色  
        queryParams : queryParams,  
        cache : false, // 是否使用缓存  
        pageList : [ 5, 10, 20 ,100],  
        toolbar : "#toolbar",// 指定工具栏  
        uniqueId : "entityId", // 每一行的唯一标识  
        sidePagination : "server", // 服务端处理分页  
        columns : [
		{
			field : 'state',
			checkbox : true,
			align : 'center',
			valign : 'middle'
		},		
        {  
	        title : '操作',  
	        field : 'entityId', // 字段  
	        align: 'center',
	        valign: 'middle',
	        formatter: function (value, row, index) {
	        	if(value==undefined){
	        		value = "";
	        	}
	        	return "<input type=\"hidden\" value='"+value+"'/><div class=\"remove\"><button type=\"button\" class=\"btn btn-default btn-sm\" onclick=\"remove(this)\" ><span class=\"glyphicon glyphicon-trash\"></span>删除</div>"+
     		   		   "<div class=\"recover\" style=\"display:none\"><button type=\"hidden\" class=\"btn btn-default btn-sm\" onclick=\"recover(this)\" ><span class=\"glyphicon glyphicon-share-alt\"></span>恢复</div>";
	    	}
		}, {  
            title : '实体编码',  
            field : 'entityCode', // 字段  
            align: 'center',
            valign: 'middle',
            formatter: function (value, row, index) {
	        	if(value==undefined){
	        		value = "";
	        	}
                return "<div style=\"position:relative\"><input class=\"form-control\" name=\"entityCode\" style=\"padding:0 24px 0 12px;text-align:center;\" data-type=\"text\" data-title=\"实体编码\" value=\""+value+"\"/>";
                    	
            }
        }, {  
            title : '实体名',  
            field : 'entityTablename',  
            align : 'center',  
            valign : 'middle',  
            sortable : true  ,
            formatter: function (value, row, index) {
	        	if(value==undefined){
	        		value = "";
	        	}
                return "<div style=\"position:relative\"><input class=\"form-control\" name=\"entityTablename\" style=\"padding:0 24px 0 12px;text-align:center;\" data-type=\"text\" data-title=\"实体名\" value=\""+value+"\"/>";
                    	
            }
        },  {  
            title : '实体中文名',  
            field : 'entityChinaname',  
            align : 'center',  
            valign : 'middle',  
            sortable : true  ,
            formatter: function (value, row, index) {
	        	if(value==undefined){
	        		value = "";
	        	}
                    	return "<div style=\"position:relative\"><input class=\"form-control\" name=\"entityChinaname\" style=\"padding:0 24px 0 12px;text-align:center;\" data-type=\"text\" data-title=\"实体中文名\" value=\""+value+"\"/>";
                	}
        }, {  
            title : '实体分类',  
            field : 'entityType',  
            align : 'center',  
            valign : 'middle',  
            sortable : true  ,
            formatter: function (value, row, index) {
            	if('${param.entityType}'!='null'){
            		return '${param.entityType}';
            	}else{
            		return value;
            	}
            	
            	
        	}
        },{  
            title : '排序',  
            field : 'entitySort',  
            align : 'center',  
            valign : 'middle',  
            sortable : true  ,
            formatter: function (value, row, index) {
	        	if(value==undefined){
	        		value = "";
	        	}
                    	return "<div style=\"position:relative\"><input class=\"form-control\" name=\"entitySort\" style=\"padding:0 24px 0 12px;text-align:center;\" data-type=\"text\" data-title=\"排序\" value=\""+value+"\"/>";
                	}
        }],
        onClickRow: function (row, $element) {
	                curRow = row;
	                datarows = row;
	            },
	            onLoadSuccess: function (aa, bb, cc) {
	            	addListSelect();
	            	if($("#deleteMark").val()=='N'){
	            		$("#add").attr("type","button");
	            		$("#saveAndCreate").attr("type","button");
	            		$("#save").attr("type","button");
	            		$("#lead").attr("type","button");
	            		$(".recover").css("display","none");
	            		$(".remove").css("display","inline-block");
	            		$(".input-group").attr("style","");
	            	}else{
	            		$("#add").attr("type","hidden");
	            		$("#saveAndCreate").attr("type","hidden");
	            		$("#save").attr("type","hidden");
	            		$("#lead").attr("type","hidden");
	            		$(".recover").css("display","inline-block");
	            		$(".remove").css("display","inline-block");
	            		$(".input-group").css("float","left");
	            	}
	            },
        responseHandler : function(res) {  
        	rowsNum = res.total;
            return {  
                total : res.total,  
                rows : res.rows  
            };  
        }, 
    });
    
    
    
    window.operateEvents = {  
    };
}  

	function addRow(insertIndex){
		rowsNum++;
	    $('#EntityTableList').bootstrapTable('insertRow',{index:rowsNum,row:{formButtonSort:rowsNum}});
		addListSelect();
	}

	function search(){
		refresh();
	}
 
	/** 刷新页面 */  
	function refresh() {  
	    $('#EntityTableList').bootstrapTable('refresh');  
	}  
	/**查询条件与分页数据 */  
	function queryParams(pageReqeust) {
		pageReqeust.entityType=getQueryString("entityType");
	    pageReqeust.enabled = $("#enabled").val();  
	    pageReqeust.querys = $("#querys").val();  
	    pageReqeust.pageNo = this.offset;  
	    pageReqeust.pageSize = this.pageNumber;
	    pageReqeust.deleteMark = $("#deleteMark").val();
	    pageReqeust.sort = 'entity_sort';
	    pageReqeust.condition = $("#search").val().replace(/(^\s+)|(\s+$)/g,"");
	    return pageReqeust;  
	}   
	
	//引入数据结构
    function lead(){
    	var url = "LeadSysTable.jsp?entityType="+entityType;
		layer.open({
				type: 2,
				title:'<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"引入数据结构")%>',
				shadeClose: true,
				shade: 0.8,
				maxmin:true,
				zIndex:9999,
				content: url,
				success:function(layero,index){
					$('.layui-layer-max').click();
				},
				end:function(){
					refresh();
				}
			});
	}
	
	//恢复实体,修改deleteMark
	function recover(){
	var data = getSelectrows();
		$.ajax({  
                       type: 'POST',  
                       data: JSON.stringify(data[0]),  
                       url: '${pageContext.request.contextPath }/EntityList/recoverEntity.action',  
                       success: function (data) {  
                           if(data==0)
	                  	  {
	                  	  	layer.alert('恢复成功', {
	        				  icon: 1,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
	        				  skin: 'layer-ext-moon' //
	        				})
	                  	  }else{
	                  		layer.alert('恢复异常', {
		        				  icon: 2,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
		        				  skin: 'layer-ext-moon' //
		        				})
	                  	  }
                           refresh();
                       }  
                   });
	}
	
	function getSelectrows(){
        var data=$("#EntityTableList").bootstrapTable('getSelections');
        return data;
	}
	/**取url参数值  */
	function getQueryString(name) { 
		var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)", "i"); 
		var r = window.location.search.substr(1).match(reg); 
		if (r != null) return unescape(r[2]); return null; 
	} 
	function remove(obj){
		var data = {};
		data.entityId = $(obj).parent().parent().find("input").eq(0).val();
		data.deleteMark = $("#deleteMark").val();
		$.ajax({
			url:'${pageContext.request.contextPath }/EntityList/deleteEntity.action',
			type:'post',
			cache: false,
			data:JSON.stringify(data),
			contentType: 'application/json;charset=utf-8',
			async: false,
			success: function (data) { 
        		if(data[0]=='0'){
        			layer.alert('删除成功', {
      				  icon: 1,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
      				  skin: 'layer-ext-moon' //
      				})
        		}else{
        			layer.alert('删除异常', {
      				  icon: 2,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
      				  skin: 'layer-ext-moon' //
      				})
        		} 
            	refresh();
			}
		});
	}
	
	function exportExcelField(obj){
		var data = {};
		data.entityId = $(obj).parent().parent().find("input").eq(0).val();
		data.deleteMark = $("#deleteMark").val();
		if(checkField(data)){
			$.ajax({
				url:'${pageContext.request.contextPath }/EntityList/exportFieldByEntityId.action',
				type:'post',
				cache: false,
				data:JSON.stringify(data),
				contentType: 'application/json;charset=utf-8',
				async: false,
				success: function (data) { 
					if(data[0]=='0'){
						layer.alert('导出成功', {
						  icon: 1,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
						  skin: 'layer-ext-moon' //
						})
					}else{
						layer.alert('导出异常', {
						  icon: 2,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
						  skin: 'layer-ext-moon' //
						})
					} 
					refresh();
				}
			});
		}else{
			var url = "chooseSysFieldList.jsp?entityId="+data.entityId;
			layer.open({
				type: 2,
				title:'<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"引入数据结构")%>',
				shadeClose: true,
				shade: 0.8,
				maxmin:true,
				zIndex:9999,
				area: ['600px', '700px'],
				content: url,
				success:function(layero,index){
					$('.layui-layer-max').click();
				},
				end:function(){
					refresh();
				}
			});
		}
	}
	
	function exportExcelData(obj){
		var data = {};
		data.entityId = $(obj).parent().parent().find("input").eq(0).val();
		data.deleteMark = $("#deleteMark").val();
		$.ajax({
			url:'${pageContext.request.contextPath }/EntityList/exportField.action',
			type:'post',
			cache: false,
			data:JSON.stringify(data),
			contentType: 'application/json;charset=utf-8',
			async: false,
			success: function (data) { 
				if(data[0]=='0'){
					layer.alert('导出成功', {
					  icon: 1,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
					  skin: 'layer-ext-moon' //
					})
				}else{
					layer.alert('导出异常', {
					  icon: 2,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
					  skin: 'layer-ext-moon' //
					})
				} 
				refresh();
			}
		});
	}
	
	function checkField(data){
		var flag = true;
		$.ajax({
			url:'${pageContext.request.contextPath }/EntityList/checkField.action',
			type:'post',
			cache: false,
			data:JSON.stringify(data),
			contentType: 'application/json;charset=utf-8',
			async: false,
			success: function (data) {
        		if(data[0]=='0'){
        			flag = false;
        		}
			}
		});
		return flag;
	}
	
	function exportField(){
		var selects = $("#EntityTableList").bootstrapTable('getSelections');
		var entityCodes = '';
		if(selects!=null && selects.length>0){
			for(var i=0;i<selects.length;i++){
				entityCodes+="'"+selects[i].entityCode+"',";
			}
		}else {
			alert('<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"请选择一行数据")%>');return ;
		}
		$.ajax({
			url:'${pageContext.request.contextPath }/EntityList/exportFieldAll.action?entityCodes='+entityCodes,
			type:'post',
			cache: false,
			//data:JSON.stringify(data),
			contentType: 'application/json;charset=utf-8',
			async: false,
			success: function (data) { 
        		if(data[0]=='0'){
        			layer.alert('导出成功', {
      				  icon: 1,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
      				  skin: 'layer-ext-moon' //
      				})
        		}else{
        			layer.alert('导出异常', {
      				  icon: 2,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
      				  skin: 'layer-ext-moon' //
      				})
        		} 
            	refresh();
			}
		});
	}
	
	function exportEntity(){
		var selects = $("#EntityTableList").bootstrapTable('getSelections');
		var entityCodes = '';
		if(selects!=null && selects.length>0){
			for(var i=0;i<selects.length;i++){
				entityCodes+="'"+selects[i].entityCode+"',";
			}
		}else {
			alert('<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"请选择一行数据")%>');return ;
		}
		$.ajax({
			url:'${pageContext.request.contextPath }/EntityList/exportEntity.action?entityCodes='+entityCodes,
			type:'post',
			cache: false,
			//data:JSON.stringify(data),
			contentType: 'application/json;charset=utf-8',
			async: false,
			success: function (data) { 
        		if(data[0]=='0'){
        			layer.alert('导出成功', {
      				  icon: 1,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
      				  skin: 'layer-ext-moon' //
      				})
        		}else{
        			layer.alert('导出异常', {
      				  icon: 2,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
      				  skin: 'layer-ext-moon' //
      				})
        		} 
            	refresh();
			}
		});
	}

	function recover(obj){
		var datas = {};
		datas.entityId = $(obj).parent().parent().find("input").eq(0).val();
		$.ajax({  
            url: '${pageContext.request.contextPath }/EntityList/recoverEntity.action',  
            type: 'POST',  
            contentType: 'application/json;charset=utf-8',
            data: JSON.stringify(datas),
            success: function (data) { 
            		if(data==1){
            			layer.alert('恢复成功', {
            				  icon: 1,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
            				  skin: 'layer-ext-moon' //
            				})
            		}else {
            			layer.alert('恢复异常', {
            				  icon: 2,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
            				  skin: 'layer-ext-moon' //
            				})
            		} 
                refresh();
            }  
        });
	}
	
	function saveData(){
		var saveDate = getEntityData();
		$.ajax({
			url:'/myehr/EntityList/saveEntity.action',
			type:'post',
			cache: false,
			contentType: 'application/json;charset=utf-8',
			data:JSON.stringify(saveDate),
			async: false,
			success: function (data) {
				$('#EntityTableList').bootstrapTable('refresh');
			}
		});	
	}

	function getEntityData(){
		var i = 0;
		var data = [];
		$("#EntityTableList>tbody").find("tr").each(function(){
			if($(this).find("select").eq(0).val()!=""){
				var table = {};
				table.entityCode=$(this).find("input").eq(2).val();
				table.entityId=$(this).find("input").eq(1).val();
				table.entityTablename=$(this).find("input").eq(3).val();
				table.entityChinaname=$(this).find("input").eq(4).val();
				table.entityType=$(this).find("td").eq(5).text();
				table.entitySort=$(this).find("input").eq(5).val();
				table.deleteMark='N';
				data[i] = table;
				i++;
			}
		})
		return data;
	}
	function addListSelect(){
		if(''=='APP'){
			$("input").each(function(){
				if($(this).attr('dataField') != undefined){
					classes.push($(this)[0]);
				}
			})
		}else{
			classes = $("#EntityTableList select");
		}
		for(var i=0;i<classes.length;i++){
			parame.id=classes[i].id;
			var type=$(classes[i]).attr('multiSelect');
			var dataField=$(classes[i]).attr('dataField');
			parame.placeholder="";
			parame.value=$(classes[i]).attr('value');
			parame.jsonParam.dictTypeCode=$(classes[i]).attr('DictName');
			if(type=="true"){
				myehr_initSelectMore(parame,dataField);
			}else{
				myehr_initSelect(parame,dataField);
			}
		}
	}
	function updateJsp(){
		refresh();
	}
</script>  
</body>
</html>