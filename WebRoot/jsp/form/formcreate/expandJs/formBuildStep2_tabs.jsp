<%@ page language="java" import="java.util.*" import="com.myehr.common.util.LangUtil" pageEncoding="UTF-8"%>
<%@ include file="/common/common.jsp" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<body>
	<form id="form_step2" name="form_step2" >
		<div class="container-fluid" style="height:100%;overflow-y:hidden;margin-top:12px">
			<div style="position:absolute">
				<div class="BTNGROUP" style="margin:0 auto; display:inline-block;height: 35px;">
					<div style="margin-right:10px;display:inline-block">
					    <input type="button" id="addForm"  class="btn btn-primary" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"添加表单")%> onclick="addForm()"/>
					</div>
					<div style="margin-right:10px;display:inline-block">
					    <input type="button" id="editForm"  class="btn btn-primary" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"编辑表单")%> onclick="editForm()"/>
					</div>
					<div style="margin-right:10px;display:inline-block">
					    <input type="button" id="removeForm"  class="btn btn-primary" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"删除表单")%> onclick="removeForm()"/>
					</div>
				</div>
			</div>
			<table id="formList">
			</table>
		</div>	
	</form>
</body>
<script>
	nui.parse();
	var grid = nui.get('datagrid1');
	var formDefId = <%=request.getParameter("formDefId") %>;
	
	window.onload=function(){
		grid.load({'formDefId':formDefId});
	}
	//添加 
	//form/form/mstTab/addDetail.jsp
	function addDetail(){
		  nui.open({
            url: "<%=request.getContextPath() %>"+"/form/form/mstTab/addDetail.jsp?formDefId="+formDefId,
            title: "新增表单", width: 400, height: 300,
            cache:false,
            async:false,
            allowResize:false,
            onload: function () {
            	
            },
            ondestroy: function (action) {
            	if(action=='ok'){
                	grid.reload();
               }
            }
        });
	}
	
		//编辑
	//form/form/mstTab/addDetail.jsp
	function editDetail(){
		var row = grid.getSelected();
		if(!row){
			alert('请选择要编辑的从表');
			return ;
		}
		var tabDetailId = row.tabDetailId;
		  nui.open({
            url: "<%=request.getContextPath() %>"+"/form/form/mstTab/addDetail.jsp?tabDetailId="+tabDetailId,
            title: "新增表单", width: 400, height: 300,
            cache:false,
            async:false,
            allowResize:false,
            onload: function () {
            	
            },
            ondestroy: function (action) {
            	if(action=='ok'){
                	grid.reload();
               }
            }
        });
	}
	
	//删除
	function removeDetail(){
	  	
	  	var tabDetails = grid.getSelecteds();
	  	if(!tabDetails){
	  		alert('请选择需要删除的子表数据');
	  		return;
	  	}
	  	     
        nui.confirm("确定删除选中数据吗？","警告",function(action){
            if(action!="ok") return;
            	dcf.mask();
		        nui.ajax({
		            url: "com.dcf.form.formframe.service.mstTabComp.removeMstTabDetail.biz.ext",
		            data: nui.encode({tabDetails:tabDetails}),
		            type: 'POST',
		            cache: false,
		            contentType: 'text/json',
		            success: function (text) {
		                dcf.unmask();
		                if (text.recode == "1") {
		                    nui.alert("删除成功", "提示", function() {
		                       grid.reload();
		                    });
		                } else{
							nui.alert("保存失败", "提示", function() {
								
		                    });
		                }
		            },
		            error: function (jqXHR, textStatus, errorThrown) {
		                dcf.unmask();
		                nui.alert(jqXHR.responseText);
		            }
		        });
         });
	}
	
	function onrendererIsForm(e){
		var _value = e.value;
		if('Y'==_value){
			return '是';
		}else {
			return '否';
		}
	}
	
	function onClose() {
        CloseWindow("close");
    }
    
    function CloseWindow(action) {
        if (window.CloseOwnerWindow) {
        	return window.CloseOwnerWindow(action);
        } else {
        	window.close();
        }
    }	
	
	  
    
</script>
</html>