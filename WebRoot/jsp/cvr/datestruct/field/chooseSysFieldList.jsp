<%@ page language="java" import="java.util.*" import="com.myehr.common.util.LangUtil" pageEncoding="UTF-8"%>
<%@ include file="/common/common.jsp" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<style type="text/css">
	td{padding: 3px 8px 3px!important;}
</style>
<body>
    <div class="container-fluid" style="height:100%;padding:20px 10px 0 10px;">
		<div >
			<div style="margin:0 auto; display:inline-block;height: 35px;">
				<div style="margin-right:10px;display:inline-block">
				    <input type="button" id="chooseField"  class="btn btn-primary" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"选择字段")%> onclick="chooseField()"/>
				</div>
				<div style="margin-right:10px;display:inline-block">
				    <input type="button" id="closeHtml"  class="btn btn-primary" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"关闭")%> onclick="closeHtml()"/>
				</div>
			</div>
			<div id="grid_ORG_comp_info_filter" style="float:right;display:inline-block;position:relative;">
				<input id="search" name="FILTER_1003" placeholder="Search" style="padding: 6px 30px 6px 10px;" title="Search" type="text" class="form-control" oninput="search()" />
				<i class="icon-search" style="position: absolute;right: 12px;top: 7px;cursor: pointer;"></i>
			</div>
		</div>
		<table id="FieldList" >  
        </table>  <!-- 留意--> 
	</div>
<script>
	$(function() {  
    	querys(); 
    	$(".fixed-table-body").css("height","72%");
	})  
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
  	
function querys() {   
    $("#FieldList").bootstrapTable({  
        url : '${pageContext.request.contextPath }/FieldList/findFieldListByTemplate.action',  
        pagination : true, // 分页  
        height:'578',
        striped : true, // 是否显示行间隔色  
        queryParams : queryParams,  
        cache : false, // 是否使用缓存  
        pageSize : 10,
        undefinedText : '-', 
        pageList : [ 10, 20 ,200 ],  
        clickToSelect: true,
        uniqueId : "userName", // 每一行的唯一标识  
        sidePagination : "server", // 服务端处理分页  
        columns : [ {  
            field : 'state',  
            checkbox : true,  
            align : 'center',  
            valign : 'middle'  
        }, {  
            title : '字段的编码名称',  
            field : 'fieldCode', // 字段  
            align : 'center', // 对齐方式（左 中 右）  
            valign : 'middle', 
            formatter: function (value, row, index) {
            			if(value==undefined||value==null){
            				value = "";
            			}
                    	return "<input class=\"form-control\" readonly=true name=\"fieldCode\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"字段名称\" value=\""+value+"\"/>";
                    	}
        }, {  
            title : '字段的中文名称',  
            field : 'fieldChinaName',  
            align : 'center',  
            valign : 'middle', 
            formatter: function (value, row, index) {
		    			if(value==undefined||value==null){
		    				value = "";
		    			}
                    	return "<input class=\"form-control\" readonly=true name=\"fieldChinaName\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"字段中文名\" value=\""+value+"\"/>";
                    	}
        }, {  
            title : '字段的数据类型',  
            field : 'fieldType',  
            align : 'center',  
            valign : 'middle',  
            formatter: function (value, row, index) {
		    			if(value==undefined||value==null){
		    				value = "";
		    			}
		    			return "<input class=\"form-control\" readonly=true name=\"fieldType\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"字段类型\" value=\""+value+"\"/>";
                    }
        }, {  
            title : '字段长度',  
            field : 'fieldLen',  
            align : 'center',  
            valign : 'middle',
            visible: false,
            formatter: function (value, row, index) {
                    	return "<input class=\"form-control\" readonly=true name=\"fieldLen\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"字段长度\" value=\""+value+"\"/>";
                    }
        }, {  
            title : '精度',  
            field : 'fieldDict',  
            align : 'center',  
            valign : 'middle',
            visible: false,
            formatter: function (value, row, index) {
            			if(value==undefined){
	                        value='-';
	                    }
                    	return "<input class=\"form-control\" readonly=true name=\"fieldDict\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"精度\" value=\""+value+"\"/>";
                    }
            }, {  
            title : '主键',  
            field : 'fieldIsKey',  
            align : 'center',  
            valign : 'middle',  
            visible:false,
            formatter: function (value, row, index) {
                    	return "<input class=\"form-control\" readonly=true name=\"fieldIsKey\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"是否主键\" value=\""+value+"\"/>";
                    }
        }, {  
            title : '业务主键',  
            field : 'fieldIsBusKey',  
            align : 'center',  
            valign : 'middle',  
            visible:false,
            formatter: function (value, row, index) {
            			if((value==undefined || value=="")&&value!=0){
	                        value='-';
	                    }
                    	return "<input class=\"form-control\" readonly=true name=\"fieldIsBusKey\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"是否业务主键\" value=\""+value+"\"/>";
                    }
        },  {  
            title : '允空',  
            field : 'fieldIsNull',  
            align : 'center',  
            valign : 'middle',  
            visible:false,
            formatter: function (value, row, index) {
                    	return "<input class=\"form-control\" readonly=true name=\"fieldIsNull\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"允许为空\" value=\""+value+"\"/>";
                    }
        },  {  
            title : '排序',  
            field : 'fieldSort',  
            align : 'center',  
            valign : 'middle',  
            formatter: function (value, row, index) {
                    	return "<input class=\"form-control\" readonly=true name=\"fieldSort\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"排序\" value=\""+value+"\"/>";
                    }
        },  {  
            title : '控件类型',  
            field : 'controlType',  
            align : 'center',  
            valign : 'middle',  
            visible:false,
            formatter: function (value, row, index) {
                    	return "<input class=\"form-control\" readonly=true name=\"controlType\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"控件类型\" value=\""+value+"\"/>";
                    }
        },  {  
            title : '默认别名',  
            field : 'fieldTablename',  
            align : 'center',  
            valign : 'middle',  
            visible:false,
            formatter: function (value, row, index) {
                    	return "<input class=\"form-control\" readonly=true name=\"fieldTablename\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"默认别名\" value=\""+value+"\"/>";
                    }
        },{  
            title : '字典编码',  
            field : 'dictCode',  
            align : 'center',  
            valign : 'middle', 
            visible:false,
            formatter: function (value, row, index) {
                    	return "<input class=\"form-control\" readonly=true name=\"dictCode\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"字典编码\" value=\""+value+"\"/>";
                    }
        },  {  
            title : '字典项',  
            field : 'dictEntry',  
            align : 'center',  
            valign : 'middle', 
            visible:false,
            formatter: function (value, row, index) {
                    	return "<input class=\"form-control\" readonly=true name=\"dictEntry\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"字典项\" value=\""+value+"\"/>";
                	}
        },  {  
            title : '字典项值',  
            field : 'dictEntryValue',  
            align : 'center',  
            valign : 'middle',  
            visible:false,
            formatter: function (value, row, index) {
                    	return "<input class=\"form-control\" readonly=true name=\"dictEntryValue\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"字典项值\" value=\""+value+"\"/>";
                	}
        }],
        onClickRow: function (row, $element) {
	                curRow = row;
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
    
    window.operateEvents = {  
                
           };
}  

	 
	
	
//查询
	function search(){
    refresh();      
	}
	
	function getSelectrows(){
		
	        var data=$("#FieldList").bootstrapTable('getSelections');
	        
	        return data;
	}	
	
	/** 刷新页面 */  
	function refresh() {  
	    $('#FieldList').bootstrapTable('refresh');  
	}  
	
	/**查询条件与分页数据 */  
	function queryParams(pageReqeust) {  
	    pageReqeust.enabled = $("#enabled").val();  
	    pageReqeust.querys = $("#querys").val();  
	    pageReqeust.pageNo = this.offset;  
	    pageReqeust.pageSize = this.pageNumber;
	    pageReqeust.deleteMark = '${param.templateId}';
	    pageReqeust.fieldEntityId = getQueryString("entityId");
	    pageReqeust.condition = $("#search").val();
	    pageReqeust.sort = 'field_sort';
	    return pageReqeust;  
	}   
	
	function findbyentityid(){
		refresh();
	}
	
  /**取url参数值  */
	function getQueryString(name) { 
		var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)", "i"); 
		var r = window.location.search.substr(1).match(reg); 
		if (r != null) return unescape(r[2]); return null; 
	}
	
	function isSelect(data){
		var url = "selectParam.jsp?controlType="+data.controlType+"&fieldChinaName="+data.fieldChinaName+"&fieldId="+data.fieldId;
		
		if(data.controlType=="2"){
			layer.open({
				type: 2,
				title:'下拉配置',
				shadeClose: true,
				shade: 0.8,
				maxmin:true,
				zIndex:9999,
				area: ['950px', '500px'],
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
	
	function chooseField(){
		var data = getSelectrows();
		parent.tranData(data);
	}
	
	function closeHtml(){
		parent.closexx();
	}
	
</script>  
</body>
</html>
