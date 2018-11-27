<%@ page language="java" import="java.util.*" import="com.myehr.common.util.LangUtil" pageEncoding="UTF-8"%>
<%@ include file="/common/common.jsp" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<style>
	.clearfix {display:none}
	.row.cell>div{margin:9px 0}
</style>
</head>
<body>

<div class="container-fluid">
	<div>
    	<h3 style="display:block;font-size:18;text-align:left;height: 36px;line-height: 33px;padding-left: 16px;color: #666;cursor: pointer;">实体信息</h3>
		<div class="row cell" id="form" style="padding-left:15px">
			<div class="BTNGROUP_55" style="margin:0 auto; min-height: 20px;">
				<div style="display:inline-block">
				    <input type="button" id="save"  class="btn btn-primary" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"保存")%> onclick="save()"/>
				</div>
				<div style="display:inline-block">
				    <input type="button" id="close"  class="btn btn-primary" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"关闭")%> onclick="closex()"/>
				</div>
			</div>
			<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
				<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
					<lable style="float:left">实体编码</lable>
					<input id="entityCode" name="entityCode" type="text" readonly class="form-control" style="width:200px;" />
				</div>
			</div>
			<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
				<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
					<lable style="float:left">实体简称</lable>
					<input id="entityTablename" name="entityTablename" type="text" class="form-control" style="width:200px;" />
				</div>
			</div>
			<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
				<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
					<lable style="float:left">实体中文名</lable>
					<input id="entityChinaname" name="entityChinaname" type="text" class="form-control" style="width:200px;" />
				</div>
			</div>
			<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
				<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
					<lable style="float:left">实体排序</lable>
					<input id="entitySort" name="entitySort" type="text" class="form-control" style="width:200px;" />
				</div>
			</div>
			<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
				<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
					<lable style="float:left">实体分类编码</lable>
					<input id="entityType" name="entityType" type="text" readonly class="form-control" style="width:200px;" />
				</div>
			</div>
			<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12" style = "height:40px">
				<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">
					<lable style="float:left">实体描述</lable>
					<textarea id="entityDesp" name="entityDesp" rows="3" class="form-control" style="width:47%;resize:none">
					</textarea>
				</div>
			</div>
		</div>
	</div>
	<div>
    	<h3 style="display:block;font-size:18;text-align:left;height: 36px;line-height: 33px;padding-left: 16px;color: #666;cursor: pointer;">实体字段信息</h3>  
	    <div class="row cell" style = "padding-left:15px">
		    <div class="BTNGROUP_55" style="margin:0 auto; display:inline-block;min-height: 20px;">
				<div style="margin-right:10px;display:inline-block">
				    <input type="button" id="lead"  class="btn btn-primary" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"选择实体")%> onclick="chooseTable()"/>
				</div>
			</div>
			<table id="DataTableList">
			</table>
		</div>
	</div>
</div>
    
    
<script>
$(function() {  
	$("#entityType").val('${param.entityType}');
    querys();  
    $(".fixed-table-body").css("height","34%");
})  
  
function querys() {   
    $("#DataTableList").bootstrapTable({  
        url : '${pageContext.request.contextPath }/EntityList/findEntityList.action',  
        height : '700',  
        undefinedText : '-',  
        striped : true, // 是否显示行间隔色  
        queryParams : queryParams,  
        cache : false, // 是否使用缓存  
        toolbar : "#toolbar",// 指定工具栏  
        uniqueId : "userName", // 每一行的唯一标识  
        sidePagination : "server", // 服务端处理分页  
        columns : [ {  
            title : '字段名称',  
            field : 'fieldCode', // 字段  
            align : 'center', // 对齐方式（左 中 右）  
            valign : 'middle', 
        }, {  
            title : '字段中文名',  
            field : 'fieldChinaName',  
            align : 'center',  
            valign : 'middle'
        }, {  
            title : '字段类型',  
            field : 'fieldType',  
            align : 'center',  
            valign : 'middle'
        }, {  
            title : '字段长度',  
            field : 'fieldLen',  
            align : 'center',  
            valign : 'middle'
        }, {  
            title : '精度',  
            field : 'fieldDict',  
            align : 'center',  
            valign : 'middle'
            }, {  
            title : '是否主键',  
            field : 'fieldIsKey',  
            align : 'center',  
            valign : 'middle'
        }, {  
            title : '是否业务主键',  
            field : 'fieldIsBusKey',  
            align : 'center',  
            valign : 'middle'
        },  {  
            title : '记录日志',  
            field : 'fieldIsLog',  
            align : 'center',  
            valign : 'middle'
        },  {  
            title : '允许为空',  
            field : 'fieldIsNull',  
            align : 'center',  
            valign : 'middle'
        },  {  
            title : '数据类型',  
            field : 'fieldDataType',  
            align : 'center',  
            valign : 'middle'
        },  {  
            title : '排序',  
            field : 'fieldSort',  
            align : 'center',  
            valign : 'middle'
        },  {  
            title : '控件类型',  
            field : 'controlType',  
            align : 'center',  
            valign : 'middle' 
        },  {  
            title : '字典编码',  
            field : 'dictCode',  
            align : 'center',  
            valign : 'middle' 
        }],
        onClickRow: function (row, $element) {
	                curRow = row;
	            },
	            onLoadSuccess: function (aa, bb, cc) {
	            },
        responseHandler : function(res) {  
            return {  
                total : res.total,  
                rows : res.rows  
            };  
        }, 
    });
}   
	/** 刷新页面 */  
	function refresh() {  
	    $('#DataTableList').bootstrapTable('refresh');  
	}  
	/**查询条件与分页数据 */  
	function queryParams(pageReqeust) {  
	    pageReqeust.enabled = $("#enabled").val();  
	    pageReqeust.querys = $("#querys").val();  
	    pageReqeust.pageNo = this.offset;  
	    pageReqeust.pageSize = this.pageNumber;
	    pageReqeust.deleteMark = $("#deleteMark").val();
	    return pageReqeust;  
	}   
  	
  	function save(){
  		//1.往实体表插数据2.往字段表插数据
  		var entityData =new Object();
  		entityData.entityCode=$("#entityCode").val();
  		if($("#entityCode").val()==""){
  			layer.alert('请选择引入的数据结构', {
				  icon: 2,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
				  skin: 'layer-ext-moon' //
				})
  			return;
  		}
  		entityData.entityTablename=$("#entityTablename").val();
  		entityData.entityChinaname=$("#entityChinaname").val();
  		entityData.entitySort=$("#entitySort").val();
  		entityData.entityType=$("#entityType").val();
  		entityData.entityDes=$("#entityDes").val();
  		entityData.deleteMark="N";
		
  		$.ajax({  
                 type: 'POST',  
				 contentType: 'application/json;charset=utf-8',
                 data: JSON.stringify(entityData),  
                 url: '${pageContext.request.contextPath }/EntityList/insertEntity2.action',  
                 success: function (data) {
                  	  if(data==2){
                  		layer.alert('生成实体异常', {
          				  icon: 2,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
          				  skin: 'layer-ext-moon' //
          				})
                  	  }else if(data==1){
                  		layer.alert('实体中文名重复', {
          				  icon: 2,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
          				  skin: 'layer-ext-moon' //
          				})
                  	  }else{
                  	  	var allTableData = $("#DataTableList").bootstrapTable('getData');
                  	  	allTableData[0].fieldEntityId=data;
                  	  	$.ajax({  
			                  type: 'POST',  
							  contentType: 'application/json;charset=utf-8',
			                  data: JSON.stringify(allTableData),  
			                  url: '${pageContext.request.contextPath }/FieldList/leadStandartsField2.action',  
			                  success: function (data) { 
			                  	    alert("保存成功!!");
			                        closex(); //执行关闭
			                  }  
			              });
                  	  } 
                 }  
             });
  	}
  	
  	//引入数据结构
    function chooseTable(){
		layer.open({
			type: 2,
			title: '引入数据表',
			shadeClose: true,
			shade: 0.8,
			area: ['30%', '95%'],
			tips:2,
			content: ['ChooseTable.jsp'], //iframe的url
	        success:function(layero,index){
	        },
			end:function(){
				var pageReqeust=new Object();
				pageReqeust.fieldEntityCode = $("#entityCode").val();
					$.ajax({  
			                  type: 'POST',  
			                  data: pageReqeust,  
			                  url: '${pageContext.request.contextPath }/FieldList/findFieldByEntityCode.action',  
			                  success: function (data) {  
			                      $("#DataTableList").bootstrapTable('load',data); 
			                      $("#entityTablename").val($("#entityCode").val());
			                  }  
			              });
				}
		});
	}
	
	function closex(){
		 var index = parent.layer.getFrameIndex(window.name); //获取当前窗体索引
		 parent.layer.close(index); //执行关闭
	}
  	
</script>  
</body>
</html>
