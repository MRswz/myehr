<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/common/common.jsp" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<body>

<div class="container-fluid">
	<div style="margin:20px;">
		<div style="border:1px solid #ccc; position:relative;border-radius:5px;margin-bottom:10px">
			<h3 style=" background:#FFF;color:blue; display:block;font-size:12;position:absolute; left:10px; top:-27px;text-align:center">基本信息</h3>
			
			<div id="form0">
				<form id="basic-info"  class="form-horizontal" style="padding:2% 8%" role="form">
					<table style="width:100%">
							<tr>
								<td>
									<label>表单编码</label>
								</td>
								<td>
									<input type="text" id="formDefCode" class="form-control" placeholder="文本输入">
								</td>
							</tr>
							<tr>
								<td>
									<label>表单名称</label>
								</td>
								<td>
									<input type="text" id="formDefName" class="form-control" placeholder="文本输入">
								</td>
							</tr>    
							<tr>
								<td>
									<label>表单布局类型</label>
								</td>
								<td>
									<select id="formDefLayoutType" name="SYS_FORM_LAYOUT" class="form-control" onchange="chengeLayout()">
									</select>
								</td>
							</tr>
							<tr>
								<td>
									<label>是否流程表单</label>
								</td>
								<td>
									<select id="formDefIsProcess" name="SYS_COMMON_YES_NO" class="form-control">
									</select>
								</td>
							</tr>
								<td>
									<label>是否不受权限控制</label>
								</td>
								<td>
									<select id="formAuthorityIsControl" name="SYS_COMMON_YES_NO" class="form-control">
									</select>
								</td>
							<tr>
								<td>
									<label style="line-height:100%">表单描述</label>
								</td>
								<td>
									<textarea class="form-control" id="formDefDesc" rows="3"></textarea>
								</td>
							</tr>
							<tr>
								<td>
									<label>前置初始函数</label>
								</td>
								<td>
									<textarea class="form-control" id="formDefInitQzJs" rows="3"></textarea>
								</td>
							</tr>
					</table>
				</form>
			</div>
			
			
		</div>
		
		<div style="border:1px solid #ccc; position:relative;border-radius:5px;margin-bottom:10px">
			<h3 style=" background:#FFF;color:blue; display:block;font-size:12;position:absolute; left:10px; top:-27px;text-align:center">布局扩展信息</h3>
				<div id="form2">
					<form id="basic-info"  class="form-horizontal" style="padding:2% 5%" role="form">
						<table style="width:100%">
								<tr>
									<td style = "margin:5px 0">
										<label>每行显示列数</label>
									</td>
									<td>
										<input type="text" class="form-control" style="width:;float:;" id="formDefRowCount" placeholder="文本输入">
									</td>
								</tr>
								<tr>
									<td>
										<label>lable宽度</label>
									</td>
									<td>
										<input type="text" class="form-control" id="formLableWidth" placeholder="文本输入">
									</td>
								</tr>    
						</table>
					</form>
				</div>
				
				<div id="form3">
					<form id="basic-info"  class="form-horizontal" style="padding:2% 8%" role="form">
							<table style="width:100%">
									<tr>
										<td><label>
	                                        <input type="checkbox" id="formShowPager" value=""> <i></i> 是否分页</label></td>
										<td><label>
	                                        <input type="checkbox" id="formShowColumns" value=""> <i></i> 显示表头</label></td>
										<td><label>
	                                        <input type="checkbox" id="formAllowCellEdit" value=""> <i></i> 单元格编辑</label></td>
									</tr>
								<tr>
									<td><label>
                                        <input type="checkbox" id="formAllowCellSelect" value=""> <i></i> 单元格选择</label></td>
									<td><label>
                                        <input type="checkbox" id="formAllowResize" value=""> <i></i> 允许拖拽</label></td>
									<td><label>
                                        <input type="checkbox" id="formShowTitle" value=""> <i></i> 显示标题</label></td>
								</tr>    
								<tr>
									<td><label>
                                        <input type="checkbox" id="formEditNextOnEnter" value=""> <i></i> 按回车键进入下一个单元格编辑</label></td>
									<td><label>
                                        <input type="checkbox" id="formEditNextRowCell" value=""> <i></i> 按回车键进入下一行同列的单元格编辑</label></td>
									<td></td>
								</tr>
								<tr>
									<td>
                                        <input type="checkbox" id="formIsIndex" value="">
                                        <label>显示序号</label>
									  		<input type="text" class="form-control" id="" placeholder="文本输入"></td>
									<td>
										<input type="checkbox" id="" value="" >
										<label>允许多选</label>
									  		<input type="text" class="form-control" id="" placeholder="文本输入"></td>
								</tr>
									<td>
										<input type="checkbox" id="" value="" >
										<label>每页显示条数</label>
								  		<input type="text" class="form-control" id="formPageSize" placeholder="文本输入">
									</td>
									<td>
										<input type="checkbox" id="" value="" >
										<label>页尺寸集合</label>
								  		<input type="text" class="form-control" id="formPageSizeList" placeholder="文本输入">
									</td>
									<td></td>
								<tr>
									<td>
										<input type="checkbox" id="" value="" >
								  		<label>冻结列数</label>
								  		<input type="text" class="form-control" id="formFrozen" placeholder="文本输入">
									</td>
									<td>
										<input type="checkbox" id="" value="" >
								  		<label>表格高度</label>
								  		<input type="text" class="form-control" id="formGridHeight" placeholder="文本输入">
									</td>
									<td></td>
								</tr>
						</table>
					</form>
				</div>
				
				<div id="form5">
					<form id="basic-info"  class="form-horizontal" role="form">
						<div class="form-group">
						  	<label for="formDefRowCount" class="col-sm-2 control-label">选择动态表单</label>
						    <div class="col-sm-10">
						  		<input type="text" class="form-control" id="" placeholder="文本输入">
						    </div>
						</div>
					</form>
				</div>
				<div class="row">  
				    <div class='col-sm-6'>  
				        <div class="form-group">  
				            <label>选择日期：</label>  
				            <!--指定 date标记-->  
				            <div class='input-group date' id='datetimepicker1'>  
				                <input type='text' class="form-control" />  
				                <span class="input-group-addon">  
				                    <span class="glyphicon glyphicon-calendar"></span>  
				                </span>  
				            </div>  
				        </div>  
				    </div>  
				    <div class='col-sm-6'>  
				        <div class="form-group">  
				            <label>选择日期+时间：</label>  
				            <!--指定 date标记-->  
				            <div class='input-group date' id='datetimepicker2'>  
				                <input type='text' class="form-control" />  
				                <span class="input-group-addon">  
				                    <span class="glyphicon glyphicon-calendar"></span>  
				                </span>  
				            </div>  
				        </div>  
				    </div>  
				</div> 
		</div>
		<div style="margin:0 auto;text-align:center;">
			<button type="button" class="btn btn-primary btn-lg " onclick="save()">下一步</button>
		</div>
	</div>
</div>
    

<script>
	var parame={
		id:'',
		value:"N",
		width: "100px",  
	    height:"45px",
	    url:'${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode.action',
	    jsonParam:{},
		chang:function (e){
			var aaa = e;
		}
	};
	$(function () {  
	    $('#datetimepicker1').datetimepicker({  
	        format: 'YYYY-MM-DD',  
	        locale: moment.locale('zh-cn')  
	    });  
	    $('#datetimepicker2').datetimepicker({  
	        format: 'YYYY-MM-DD hh:mm',  
	        locale: moment.locale('zh-cn')  
	    });  
	});  
	//获取页面所有的select 的id   通过id动态为下拉列表赋值
	var classes = $("select");
	var formDefType = 'null';
	var formDefId = 'null';
	var formDefFolderId = '481';
	
	window.onload=function(){
		for(var i=0;i<classes.length;i++){
			parame.id=classes[i].id;
			parame.placeholder="";
			parame.jsonParam.dictTypeCode=classes[i].name;
			myehr_initSelect(parame);	
		}
		if(formDefType!=null&&formDefType!='null'){
			nui.get('entity.formDefType').setValue(formDefType);
		}
		if(formDefId!=null&&formDefId!='null'){
			loadData();
			//初始化表单  
			$.ajax({
		        url: "com.dcf.form.SysFormconfigComp.getSysFormconfig.biz.ext",
		        type: 'POST',
		        data: nui.encode({formDefId:formDefId}),
		        cache: false,
		        contentType: 'text/json',
		        success: function (text) {
		            if(text.retCode=="-1") {
		            	nui.alert("数据初始化失败，请联系系统管理员。");
		            	return ;
		            }
		          	var entity = text.sysform[0];
		          	form.setData({entity:entity});
		          	if(entity.formDefLayoutType=='1'){
		          		form2.setData({entity:entity});
		          	}else if(entity.formDefLayoutType=='2'){
		          		loadGridData(entity.formDefId);
		          	}else if(entity.formDefLayoutType=='3'||entity.formDefLayoutType=='6'){
		          		loadTreeData(entity.formDefId);
		          	}else if(entity.formDefLayoutType=='4'){
		          		loadReportData(entity.formDefId);
		          	}else if(entity.formDefLayoutType=='5'){
		          		loadMstTabData(entity.formDefId);
		          	}	
		          	//新增图表
		          	else if(entity.formDefLayoutType=='8'){
		          		loadChartsData(entity.formDefId);
		          	}
		          	chengeLayout();
		          	onchangeProcess();
		          	nui.get('entity.formDefProcessDefName').setText(entity.formDefProcessDefNameText);
		          	nui.get('entity.formDefCode').setEnabled(false);
		          	nui.get('entity.formDefIsProcess').setEnabled(false);
		          	nui.get('entity.formDefIsProcess').setEnabled(false);
		          	nui.get('entity.formDefProcessDefName').setEnabled(false);
		          	nui.get('entity.formDefLayoutType').setEnabled(false);
		        },
		        error: function (jqXHR, textStatus, errorThrown) {
		           	nui.alert(jqXHR.responseText);
		        }
		    });
		} else {
			//nui.get('entity.formDefFolderId').setValue(formDefFolderId);				
			styleshowhide(1);
		}
	}
	
	//布局类型值变化函数
	function chengeLayout(){
		var layoutType = $("#formDefLayoutType").val();
		styleshowhide(layoutType);
	}
	//
	function styleshowhide(_value){
		if(_value==1){
			$("#form2").show();
			$("#form3").hide();
			$("#form4").hide();
			$("#form4_1").hide();
			$("#form5").hide();
		}else if(_value==2){
			$("#form2").hide();
			$("#form3").show();
			$("#form4").hide();
			$("#form4_1").hide();
			$("#form5").hide();
		}else if(_value==3||_value==6){
			$("#form2").hide();
			$("#form3").hide();
			$("#form4").show();
			$("#form4_1").hide();
			$("#form5").hide();
		}else if(_value==4){
			$("#form2").hide();
			$("#form3").hide();
			$("#form4").hide();
			$("#form4_1").show();
			$("#form5").hide();
		}else if(_value==5){
			$("#form2").hide();
			$("#form3").hide();
			$("#form4_1").hide();
			$("#form4").hide();
			$("#form5").show();
		}
		//新增图表		
		else if(_value==8){
				$("#form2").hide();
				$("#form3").hide();
				$("#form4_1").hide();
				$("#form4").hide();
				$("#form5").hide();
				$("#form8").show();
		}
	}
	
	function save(){
	var layoutType = $("#formDefLayoutType").val();
		parent.$("#formDefLayoutType").val(layoutType);
		closex();//
	}
	function closex(){
		 var index = parent.layer.getFrameIndex(window.name); //获取当前窗体索引
		 parent.layer.close(index); //执行关闭
	}
</script>  
</body>
</html>
