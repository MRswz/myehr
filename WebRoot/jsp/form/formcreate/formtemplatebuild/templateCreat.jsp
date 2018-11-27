<%@ page language="java" import="java.util.*" import="com.myehr.common.util.LangUtil" pageEncoding="UTF-8"%>
<%@ include file="/common/common.jsp" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<style>
#columnList>tbody>tr>td,#tableList>tbody>tr>td{padding:3px 6px;}
#columnList>tbody>tr>td input,#tableList>tbody>tr>td input{border:0;}
#columnList>tbody>tr>td select,#tableList>tbody>tr>td select{border:0;}
#columnList .form-control{height:20px;}
.row.cell>div{margin:5px 0;min-height:0;}
</style>
<link rel="stylesheet" href="bootstrap2/bootstrap-switch.min.css" type="text/css"></link>
<script type="text/javascript" src="bootstrap2/bootstrap-switch.min.js"></script>
<script type="text/javascript" src="../cssjs/templateCreat.js"></script>
</head>
<body>
<div class="" style="width:100%;height:100%;background-color:#f6f6f6">
	<div style="width:98%;height:98%;margin:0 auto;padding-top:10px">
		<div class="form-control" style="width:100%;height:23%;float:left;border:0">		
			<div class="" style="height:100%;overflow-y:hidden;padding:10px 0;">
				<table id="tableList">
				</table>
			</div>
		</div>
		<div style="width:100%;height:2%;float:left">
		</div>
		
		<div id="columnForm" class="form-control" style="width:24%;height:75%;float:right;border:0;">
			<ul class="nav nav-tabs" id="myTab">
				<li class="active"><a href="#Tab_1">字段信息</a></li>
				<li ><a href="#Tab_2" >控件信息</a></li>
				<!--
				<li ><a href="#Tab_3" >链接信息</a></li>
				-->
			</ul>
			<div class="tab-content">
				<div class="tab-pane active" id="Tab_1">
					<div id="columnForm" class="" style="">
						<div class="row cell" style="border:none;line-height:25px;height:85%;overflow:auto;">
							<div id="columnInfo1" class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;">
									<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"关联实体ID")%>: </lable>
									<input id="formColumnEntityId" name="formColumnEntityId" type="text" class="form-control" readonly style="width:100%;"/>
								</div>
							</div>
							<div id="columnInfo2" class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;">
									<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"关联实体编码")%>: </lable>
									<input id="formEntityTableName" name="formEntityTableName" type="text" class="form-control" readonly style="width:100%;"/>
								</div>
							</div>
							<div id="columnInfo3" class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;">
									<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"关联字段ID")%>: </lable>
									<input id="formColumnColumnId" name="formColumnColumnId" type="text" class="form-control" readonly style="width:100%;"/>
								</div>
							</div>
							<div id="columnInfo4" class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;">
									<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"关联字段编码")%>: </lable>
									<input id="formFieldTableName" name="formFieldTableName" type="text" class="form-control" readonly style="width:100%;"/>
								</div>
							</div>
							<div id="columnInfo5" class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;">
									<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"字段显示名称")%>: </lable>
									<input id="formColumnLable" name="formColumnLable" type="text" class="form-control"  style="width:100%;"/>
								</div>
							</div>
							<div id="columnInfo5" class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;">
									<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"Label长度")%>: </lable>
									<input id="FORM_COLUMN_LABEL_WIDTH" name="FORM_COLUMN_LABEL_WIDTH" type="text" class="form-control"  style="width:100%;"/>
								</div>
							</div>
							<div id="columnInfo6" class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;">
									<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"控件类型")%>: </lable>
									<select id="formColumnGuiType" title="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"控件类型")%>" styleType="select" name="formColumnGuiType"  class="form-control" style="width:100%;" textField="dictName" valueField="dictID" DictName="SYS_FORM_GUI_TYPE" nullItemText="请选择..." dataField="dict" initParam = "_">
									</select>
								</div>
							</div>
							<div id="columnInfo7" class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;">
									<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"字段宽度")%>: </lable>
									<input id="formColumnWidth" name="formColumnWidth" type="text" class="form-control"  vtype="illegalChar;maxLength:255;minLength:null;"  style="width:100%;"/>
								</div>
							</div>
							<div id="columnInfo8" class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;">
									<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"字段高度")%>: </lable>
									<input id="formColumnHeight" name="formColumnHeight" type="text" class="form-control"  vtype="illegalChar;maxLength:255;minLength:null;"  style="width:100%;"/>
								</div>
							</div>
							<div id="columnInfo10" class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;">
									<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"显示方式")%>: </lable>
									<select id="formColumnShowType" title="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"显示方式")%>" styleType="select" name="formColumnShowType"  class="form-control" emptyText="请选择..."  style="width:100%;" textField="dictName" valueField="dictID" DictName="SYS_FORM_COLUMN_SHOW_TYPE" nullItemText="请选择..." dataField="dict" initParam = "_">
									</select>
								</div>
							</div>
							<div id="columnInfo9" class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;">
									<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"显示顺序")%>: </lable>
									<input id="formColumnSort" name="formColumnSort" type="text" class="form-control" style="width:100%;"/>
								</div>
							</div>
							<div id="columnInfo11" class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;">
									<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"对齐方式")%>: </lable>
									<select id="formColumnAlign" title="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"对齐方式")%>" styleType="select" name="formColumnAlign"  class="form-control" emptyText="请选择..."  style="width:100%;" textField="dictName" valueField="dictID" DictName="SYS_FORM_COLUMN_ALIGN" nullItemText="请选择..." dataField="dict" initParam = "_">
									</select>
								</div>
							</div>
							<div id="columnInfo12" class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;">
									<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"是否必填")%>: </lable>
									<select id="formColumnRequired" title="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"是否必填")%>" styleType="select" name="formColumnRequired"  class="form-control" emptyText="请选择..."  style="width:100%;" textField="dictName" valueField="dictID" DictName="SYS_COMMON_YES_NO" nullItemText="请选择..." dataField="dict" initParam = "_">
									</select>
								</div>
							</div>
							<div id="columnInfo13" class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;">
									<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"跨字段数")%>: </lable>
									<input id="formColumnColSpan" name="formColumnColSpan" type="number" class="form-control" style="width:100%;"/>
								</div>
							</div>
							<div id="columnInfo14" class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;">
									<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"最大字符数")%>: </lable>
									<input id="formColumnMaxLength" name="formColumnMaxLength" type="text" class="form-control" style="width:100%;"/>
								</div>
							</div>
							<div id="columnInfo15" class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;">
									<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"最小字符数")%>: </lable>
									<input id="formColumnMinLength" name="formColumnMinLength" type="text" class="form-control" style="width:100%;"/>
								</div>
							</div>
							<div id="columnInfo16" class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;">
									<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"字段值范围")%>: </lable>
									<input id="formColumnColorCondition" name="formColumnColorCondition" type="text" class="form-control" style="width:100%;"/>
								</div>
							</div>
							<div id="columnInfo17" class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;">
									<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"字段颜色")%>: </lable>
									<input id="formColumnColor" name="formColumnColor" type="color" class="form-control" style="width:100%;"/>
								</div>
							</div>
							<div id="columnInfo20" class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;">
									<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"是否合计")%>: </lable>
									<select id="formColumnTotal" title="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"是否合计")%>" styleType="select" name="formColumnTotal"  class="form-control" emptyText="请选择..."  style="width:100%;" textField="dictName" valueField="dictID" DictName="SYS_COMMON_YES_NO" nullItemText="请选择..." dataField="dict" initParam = "_">
									</select>
								</div>
							</div>
							<div id="columnInfo22" class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;">
									<lable style="float:left;font-size:12px">所属分组: </lable>
									<select id="formGroupId" title="所属分组" styleType="select" name="formGroupId"  class="form-control" emptyText="请选择..."  style="width:60%;" textField="dictName" valueField="dictID" DictName="" nullItemText="请选择..." dataField="sql_form_0002" initParam = "_">
									</select>
								</div>
							</div>

						</div>		
						<div class="BTNGROUP BTNGROUP_1004" style="margin:0 0 0 15px; display:inline-block;height: 30px;">
							<div style="margin-right:10px;display:inline-block">
								<input type="button" id="saveColumnInfo"  class="btn btn-primary" value=保存 onclick="saveColumnInfo()"/>
							</div>
						</div>
					</div>
				</div>
				<div class="tab-pane" id="Tab_2">
					<div id="widgetForm" class="" style="">
						<div id="text" class="row cell" style="border:none;line-height:25px;display:none;height:85%;overflow:auto;" >
							<div id="widgetTextInfo1" class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;">
									<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"字段显示名称")%>: </lable>
									<input id="textboxId" name="textboxId" type="hidden"/>
									<input id="textboxColumnLable" name="textboxColumnLable" type="text" class="form-control"  title = "<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"字段显示名称")%>" readonly  style="width:100%;"/>
								</div>
							</div>
							<div id="widgetTextInfo2" class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;">
									<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"字段控件类型")%>: </lable>
									<select id="textboxColumnGuiType" title="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"字段控件类型")%>" styleType="select" disabled=true name="textboxColumnGuiType"  class="form-control" emptyText="请选择..."  style="width:100%;" textField="dictName" valueField="dictID" DictName="SYS_FORM_GUI_TYPE" nullItemText="请选择..." dataField="dict" initParam = "_">
									</select>
								</div>
							</div>
							<div id="widgetTextInfo3" class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;">
									<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"数据校验类型")%>: </lable>
									<select id="textboxCheckType" title="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"数据校验类型")%>" styleType="select" name="textboxCheckType" onchange="textCheckTypeStep2()"  class="form-control" emptyText="请选择..."  style="width:100%;" textField="dictName" valueField="dictID" DictName="SYS_FORM_DATA_CHECK_TYPE" nullItemText="请选择..." dataField="dict" initParam = "_">
									</select>
								</div>
							</div>
							<div id="widgetTextInfo4" class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;">
									<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"自定义校验信息")%>: </lable>
									<input id="textboxCheckSelf" name="textboxCheckSelf" type="text" class="form-control"  vtype="illegalChar;maxLength:255;minLength:null;"  style="width:100%;"/>
								</div>
							</div>
							<div id="widgetTextInfo5" class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;">
									<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"初始值来源类型")%>: </lable>
									<select id="textboxDataFromType" title="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"初始值来源类型")%>" styleType="select" onchange="textDataFromTypeStep2()" name="textboxDataFromType"  class="form-control" emptyText="请选择..."  style="width:100%;" textField="dictName" valueField="dictID" DictName="SYS_FORM_INIT_DATA_TYPE" nullItemText="请选择..." dataField="dict" initParam = "_">
									</select>
								</div>
							</div>
							<div id="widgetTextInfo6" class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;">
									<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"初始值来源")%>: </lable>
									<input id=textboxDataFromValue name="textboxDataFromValue" type="text" class="form-control"  vtype="illegalChar;maxLength:255;minLength:null;"  style="width:100%;"/>
								</div>
							</div>
							<div id="widgetTextInfo7" class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;">
									<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"空文本提示")%>: </lable>
									<input id="textboxEmptytext" name="textboxEmptytext" type="text" class="form-control"  vtype="illegalChar;maxLength:255;minLength:null;"  style="width:100%;"/>
								</div>
							</div>
							<div id="widgetTextInfo8" class="col-lg-12 col-md-12 col-sm-12 col-xs-12" style="display:none">
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;position:relative;">
									<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"初始值初始方案")%>: </lable>
									<textarea id="textboxInitFun" name="textboxInitFun" class="form-control"  vtype=""  style="width:81%;resize:none;height:60px"></textarea>
									<i class="glyphicon glyphicon-plus" style="position: absolute;opacity: 0.5;right: 20px;top: 6px;cursor: pointer;" onclick="inputText(this)"></i>
								</div>
							</div>
							<div id="widgetTextInfo9" class="col-lg-12 col-md-12 col-sm-12 col-xs-12" style="display:none">
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;position:relative;">
									<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"数据校验方案")%>: </lable>
									<textarea id="textboxCheckFun" name="textboxCheckFun" class="form-control"  vtype=""  style="width:81%;resize:none;height:60px"></textarea>
									<i class="glyphicon glyphicon-plus" style="position: absolute;opacity: 0.5;right: 20px;top: 6px;cursor: pointer;" onclick="inputText(this)"></i>
								</div>
							</div>
							<div id="widgetTextInfo10" class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;position:relative;">
									<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"值改变事件方案")%>: </lable>
									<textarea id="textboxValuechangeFun" name="textboxValuechangeFun" class="form-control" vtype=""  style="width:81%;resize:none;height:60px"></textarea>
									<i class="glyphicon glyphicon-plus" style="position: absolute;opacity: 0.5;right: 20px;top: 6px;cursor: pointer;" onclick="inputText(this)"></i>
								</div>
							</div>
							<div id="widgetTextInfo11" class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;position:relative;">
									<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"点击事件方案")%>: </lable>
									<textarea id="textboxClickFun" name="textboxClickFun" class="form-control" vtype=""  style="width:81%;resize:none;height:60px"></textarea>
									<i class="glyphicon glyphicon-plus" style="position: absolute;opacity: 0.5;right: 20px;top: 6px;cursor: pointer;" onclick="inputText(this)"></i>
								</div>
							</div>
							<div id="widgetTextInfo12" class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;">
									<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"是否设置链接")%>: </lable>
									<input id="textboxIsLink" name="textboxIsLink" type="checkbox" class="checkbox"  style="width:15%;"/>
								</div>
							</div>
						</div>	
						
						<div id="combobox" class="row cell" style="border:none;line-height:25px;height:85%;overflow:auto;" >
							<div id="widgetComboboxInfo1" class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;">
									<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"字段显示名称")%>: </lable>
									<input id="comboboxId" name="comboboxId" type="hidden"/>
									<input id="comboboxFormColumnLable" name="comboboxFormColumnLable" type="text" class="form-control" readonly style="width:100%;"/>
								</div>
							</div>
							<div id="widgetComboboxInfo2" class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;">
									<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"字段控件类型")%>: </lable>
									<select id="comboboxFormColumnGuiType" title="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"字段控件类型")%>" styleType="select" name="comboboxFormColumnGuiType"  class="form-control" emptyText="请选择..."  style="width:100%;" textField="dictName" disabled="true" valueField="dictID" DictName="SYS_FORM_GUI_TYPE" nullItemText="请选择..." dataField="dict" initParam = "_">
									</select>
								</div>
							</div>
							
							<div id="widgetComboboxInfo3" class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;">
									<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"数据初始化类型")%>: </lable>
									<select id="comboboxGuiInitType" title="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"数据初始化类型")%>" onchange="cboxGuiChanged()" styleType="select" name="comboboxGuiInitType"  class="form-control" emptyText="请选择..."  style="width:100%;" textField="dictName" valueField="dictID" DictName="SYS_FORM_GUI_FROM_TYPE" value="dict" dataField="dict" initParam = "_">
									</select>
								</div>
							</div>
							<div id="widgetComboboxInfo4" class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;">
									<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"数据初始化值")%>: </lable>
									<!-- 自定义快捷下拉 -->
									<textarea id="comboboxGuiInitValue1" name="comboboxGuiInitValue1" class="form-control comboboxGuiInitValue1" vtype=""  style="width:81%;resize:none;height:58px;display:none"></textarea>
									<i class="glyphicon glyphicon-plus comboboxGuiInitValue1" style="position: absolute;opacity: 0.5;right: 20px;top: 6px;cursor: pointer;display:none" onclick="inputText(this)" placeholder=""></i>
									<!-- 字典式下拉 -->
									<input type='text' class="form-control comboboxGuiInitValue2" title = "<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"数据初始化值")%>"  style="width:69%;float:left" id="comboboxGuiInitName2">
									<input type='hidden' class="form-control comboboxGuiInitValue2" id="comboboxGuiInitValue2">
									<input type="button" id="comboboxGuiInitValue2"  class="btn btn-warning comboboxGuiInitValue2" style="float:left" value='选择字典' onclick="chooseDictStep2('combobox')"/>
									<!-- SQL式下拉 -->
									<input type='text' class="form-control comboboxGuiInitValue3" title = "<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"数据初始化值")%>" value="--未编写SQL--"  style="width:69%;float:left;display:none" id="comboboxGuiInitValue3">
									<input type='hidden' class="form-control" id="comboboxGuiInitExcsqlId">
									<input type="button" id="comboboxGuiInitValue3"  class="btn btn-warning comboboxGuiInitValue3" style="float:left;display:none" value='编写SQL ' onclick="addSqlStep2('combobox_template')"/>
									
								</div>
							</div>
							
							<div id="widgetComboboxInfo5" class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;">
									<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"初始值来源类型")%>: </lable>
									<select id="comboboxDataFromType" title="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"初始值来源类型")%>" onchange="comboboxDataFromTypeStep2()" styleType="select" name="comboboxDataFromType"  class="form-control" emptyText="请选择..."  style="width:100%;" textField="dictName" valueField="dictID" DictName="SYS_FORM_INIT_DATA_TYPE" nullItemText="请选择..." dataField="dict" initParam = "_">
									</select>
								</div>
							</div>
							<div id="widgetComboboxInfo6" class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;">
									<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"初始化来源")%>: </lable>
									<input id="comboboxDataFromValue" name="comboboxDataFromValue" type="text" class="form-control"  vtype="illegalChar;maxLength:255;minLength:null;"  style="width:100%;"/>
								</div>
							</div>
							<div id="widgetComboboxInfo7" class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;">
									<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"文本显示字段")%>: </lable>
									<input id="comboboxTextfield" name="comboboxTextfield" type="text" class="form-control"  vtype="illegalChar;maxLength:255;minLength:null;" readonly style="width:100%;"/>
								</div>
							</div>
							<div id="widgetComboboxInfo8" class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;">
									<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"值字段")%>: </lable>
									<input id="comboboxValuefield" name="comboboxValuefield" type="text" class="form-control"  vtype="illegalChar;maxLength:255;minLength:null;" readonly style="width:100%;"/>
								</div>
							</div>
							<div id="widgetComboboxInfo9" class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;">
									<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"数据对象名称")%>: </lable>
									<input id="comboboxDatafield" name="comboboxDatafield" type="text" class="form-control"  vtype="illegalChar;maxLength:255;minLength:null;" readonly style="width:100%;"/>
								</div>
							</div>
							<div id="widgetComboboxInfo10" class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;">
									<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"空值文本")%>: </lable>
									<input id="comboboxEmptytext" name="comboboxEmptytext" type="text" class="form-control"  vtype="illegalChar;maxLength:255;minLength:null;"  style="width:100%;"/>
								</div>
							</div>
							<div id="widgetComboboxInfo11" class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;">
									<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"空项文本")%>: </lable>
									<input id="comboboxNullitemtext" name="comboboxNullitemtext" type="text" class="form-control"  vtype="illegalChar;maxLength:255;minLength:null;"  style="width:100%;"/>
								</div>
							</div>
							<div id="widgetComboboxInfo14" class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;">
									<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"允许输入")%>: </lable>
									<input id="comboboxAllowinput" name="comboboxAllowinput" type="checkbox" class="checkbox"  vtype="illegalChar;maxLength:255;minLength:null;"  style="width:15%;"/>
								</div>
							</div>
							<div id="widgetComboboxInfo15" class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;">		
									<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"带搜索框")%>: </lable>
									<input id="comboboxIsSearch" name="comboboxIsSearch" type="checkbox" class="checkbox"  vtype="illegalChar;maxLength:255;minLength:null;"  style="width:15%;"/>
								</div>
							</div>
							<div id="widgetComboboxInfo16" class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;">
									<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"允许多选")%>: </lable>
									<input id="comboboxMultiselect" name="comboboxMultiselect" type="checkbox" class="checkbox"  vtype="illegalChar;maxLength:255;minLength:null;"  style="width:15%;"/>
								</div>
							</div>
							<div id="widgetComboboxInfo16_1" class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;">
									<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"允许空项")%>: </lable>
									<input id="comboboxShownullitem" name="comboboxShownullitem" type="checkbox" class="checkbox"  vtype="illegalChar;maxLength:255;minLength:null;"  style="width:15%;"/>
								</div>
							</div>
							<div id="widgetComboboxInfo17" class="col-lg-12 col-md-12 col-sm-12 col-xs-12" style="display:none">
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;position:relative;">
									<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"初始值初始方案")%>: </lable>
									<textarea id="comboboxInitFun" name="comboboxInitFun" class="form-control" vtype=""  style="width:81%;resize:none;height:57px"></textarea>
									<i class="glyphicon glyphicon-plus" style="position: absolute;opacity: 0.5;right: 20px;top: 6px;cursor: pointer;" onclick="inputText(this)"></i>
								</div>
							</div>
							<div id="widgetComboboxInfo12" class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;position:relative;">
									<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"单元格编辑方案")%>: </lable>
									<textarea id="comboboxValuechangeFun" name="comboboxValuechangeFun" class="form-control" vtype=""  style="width:81%;resize:none;height:58px"></textarea>
									<i class="glyphicon glyphicon-plus" style="position: absolute;opacity: 0.5;right: 20px;top: 6px;cursor: pointer;" onclick="inputText(this)"></i>
								</div>
							</div>
							<div id="widgetComboboxInfo13" class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;position:relative;">
									<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"单元格绘制方案")%>: </lable>
									<textarea id="comboboxClickFun" name="comboboxClickFun" class="form-control" vtype=""  style="width:81%;resize:none;height:57px"></textarea>
									<i class="glyphicon glyphicon-plus" style="position: absolute;opacity: 0.5;right: 20px;top: 6px;cursor: pointer;" onclick="inputText(this)"></i>
								</div>
							</div>
							
						</div>
						
						<div id="date" class="row cell" style="border:none;line-height:25px;display:none;height:85%;overflow:auto;" >
							<div id="widgetDateInfo1" class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;">
									<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"字段显示名称")%>: </lable>
									<input id="datepickerId" name="datepickerId" type="hidden"/>
									<input id="dateFormColumnLable" name="dateFormColumnLable" type="text" class="form-control"  vtype="illegalChar;maxLength:255;minLength:null;" readonly=true  style="width:100%;"/>
								</div>
							</div>
							<div id="widgetDateInfo2" class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;">
									<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"字段控件类型")%>: </lable>
									<select id="dateFormColumnGuiType" title="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"字段控件类型")%>" styleType="select" disabled=true name="dateFormColumnGuiType"  class="form-control" emptyText="请选择..."  style="width:100%;" textField="dictName" valueField="dictID" DictName="SYS_FORM_GUI_TYPE" nullItemText="请选择..." dataField="dict" initParam = "_">
									</select>
								</div>
							</div>
							
							<div id="widgetDateInfo3" class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;">
									<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"初始值来源类型")%>: </lable>
									<select id="datepickerDataFromType" title="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"初始值来源类型")%>" styleType="select" onchange="dateDataFromTypeStep2()" name="datepickerDataFromType"  class="form-control" emptyText="请选择..."  style="width:100%;" textField="dictName" valueField="dictID" DictName="SYS_FORM_INIT_DATA_TYPE" nullItemText="请选择..." dataField="dict" initParam = "_">
									</select>
								</div>
							</div>
							<div id="widgetDateInfo4" class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;">
									<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"初始值来源")%>: </lable>
									<input id="datepickerDataFromValue" name="datepickerDataFromValue" type="text" class="form-control"  vtype="illegalChar;maxLength:255;minLength:null;"  style="width:100%;"/>
								</div>
							</div>
							<div id="widgetDateInfo5" class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;">
									<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"日期格式")%>: </lable>
									<select id="datepickerFormat" title="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"日期格式")%>" styleType="select" name="datepickerFormat"  class="form-control" emptyText="请选择..."  style="width:100%;" textField="dictName" valueField="dictID" DictName="SYS_FORM_DATEFORMAT" nullItemText="请选择..." dataField="dict" initParam = "_">
									</select>
								</div>
							</div>
							<div id="widgetDateInfo7" class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;">
									<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"允许输入")%>: </lable>
									<input id="datepickerAllowinput" name="datepickerAllowinput" type="checkbox" class="checkbox"  vtype="illegalChar;maxLength:255;minLength:null;"  style="width:15%;"/>
								</div>
							</div>
							<div id="widgetDateInfo8" class="col-lg-6 col-md-6 col-sm-12 col-xs-12" >
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;position:relative;">
									<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"显示\"时间输入框\"")%>: </lable>
									<input id="datepickerShowtime" name="datepickerShowtime" type="checkbox" class="checkbox"  vtype="illegalChar;maxLength:255;minLength:null;"  style="width:15%;"/>
								</div>
							</div>
							<div id="widgetDateInfo9" class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;position:relative;">
									<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"显示\"确定\"按钮")%>: </lable>
									<input id="datepickerShowokbutton" name="datepickerShowokbutton" type="checkbox" class="checkbox"  vtype="illegalChar;maxLength:255;minLength:null;"  style="width:15%;"/>
								</div>
							</div>
							<div id="widgetDateInfo10" class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;position:relative;">
									<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"显示\"清除\"按钮")%>: </lable>
									<input id="datepickerShowclearbutton" name="datepickerShowclearbutton" type="checkbox" class="checkbox"  vtype="illegalChar;maxLength:255;minLength:null;"  style="width:15%;"/>
								</div>
							</div>
							<div id="widgetDateInfo11" class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;position:relative;">
									<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"显示\"今天\"按钮")%>: </lable>
									<input id="datepickerShowtodaybutton" name="datepickerShowtodaybutton" type="checkbox" class="checkbox"  vtype="illegalChar;maxLength:255;minLength:null;"  style="width:15%;"/>
								</div>
							</div>
							
							<div id="widgetDateInfo12" class="col-lg-12 col-md-12 col-sm-12 col-xs-12" style="display:none">
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;position:relative;">
									<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"初始值初始方案")%>: </lable>
									<textarea id="datepickerInitFun" name="datepickerInitFun" class="form-control"  vtype=""  style="width:81%;resize:none;height:60px" placeholder="--通过JS代码给字段赋初值--"></textarea>
									<i class="glyphicon glyphicon-plus" style="position: absolute;opacity: 0.5;right: 20px;top: 6px;cursor: pointer;" onclick="inputText(this)"></i>
								</div>
							</div>
							<div id="widgetDateInfo13" class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;position:relative;">
									<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"单元格编辑事件")%>: </lable>
									<textarea id="datepickerValuechangeFun" name="datepickerValuechangeFun" class="form-control"  vtype=""  style="width:81%;resize:none;height:60px" placeholder="--单元格值改变后执行JS--"></textarea>
									<i class="glyphicon glyphicon-plus" style="position: absolute;opacity: 0.5;right: 20px;top: 6px;cursor: pointer;" onclick="inputText(this)"></i>
								</div>
							</div>
							<div id="widgetDateInfo14" class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;position:relative;">
									<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"单元格绘制方案")%>: </lable>
									<textarea id="datepickerClickFun" name="datepickerClickFun" class="form-control" vtype=""  style="width:81%;resize:none;height:60px" placeholder="--单元格点击后执行JS--"></textarea>
									<i class="glyphicon glyphicon-plus" style="position: absolute;opacity: 0.5;right: 20px;top: 6px;cursor: pointer;" onclick="inputText(this)"></i>
								</div>
							</div>
							<div id="widgetDateInfo15" class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;position:relative;">
									<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"自定义绘制方案")%>: </lable>
									<textarea id="datepickerDrawdatefun" name="datepickerDrawdatefun" class="form-control"  vtype=""  style="width:81%;resize:none;height:60px"></textarea>
									<i class="glyphicon glyphicon-plus" style="position: absolute;opacity: 0.5;right: 20px;top: 6px;cursor: pointer;" onclick="inputText(this)"></i>
								</div>
							</div>
						</div>	
						
						<div id="textarea" class="row cell" style="border:none;line-height:25px;display:none;height:85%;overflow:auto;" >
							<div id="widgetTextareaInfo1" class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;">
									<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"字段显示名称")%>: </lable>
									<input id="textareaId" name="textareaId" type="hidden"/>
									<input id="textareaFormColumnId" name="textareaFormColumnId" type="hidden"/>
									<input id="textareaFormColumnLable" name="textareaFormColumnLable" type="text" class="form-control"  title = "<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"字段显示名称")%>" readonly  style="width:100%;"/>
								</div>
							</div>
							<div id="widgetTextareaInfo2" class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;">
									<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"字段控件类型")%>: </lable>
									<select id="textareaGuiType" title="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"字段控件类型")%>" styleType="select" disabled=true name="textareaColumnGuiType"  class="form-control" emptyText="请选择..."  style="width:100%;" textField="dictName" valueField="dictID" DictName="SYS_FORM_GUI_TYPE" nullItemText="请选择..." dataField="dict" initParam = "_">
									</select>
								</div>
							</div>
							<div id="widgetTextareaInfo3" class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;">
									<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"数据校验类型")%>: </lable>
									<select id="textareaCheckType" title="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"数据校验类型")%>" styleType="select" name="textareaCheckType" onchange="textareaCheckTypeStep2()"  class="form-control" emptyText="请选择..."  style="width:100%;" textField="dictName" valueField="dictID" DictName="SYS_FORM_DATA_CHECK_TYPE" nullItemText="请选择..." dataField="dict" initParam = "_">
									</select>
								</div>
							</div>
							<div id="widgetTextareaInfo4" class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;">
									<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"自定义校验信息")%>: </lable>
									<input id="textareaCheckSelf" name="textareaCheckSelf" type="text" class="form-control"  vtype="illegalChar;maxLength:255;minLength:null;"  style="width:100%;"/>
								</div>
							</div>
							<div id="widgetTextareaInfo5" class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;">
									<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"初始值来源类型")%>: </lable>
									<select id="textareaDataFromType" title="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"初始值来源类型")%>" styleType="select" onchange="textareaDataFromTypeStep2()" name="textareaDataFromType"  class="form-control" emptyText="请选择..."  style="width:100%;" textField="dictName" valueField="dictID" DictName="SYS_FORM_INIT_DATA_TYPE" nullItemText="请选择..." dataField="dict" initParam = "_">
									</select>
								</div>
							</div>
							<div id="widgetTextareaInfo6" class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;">
									<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"初始值来源")%>: </lable>
									<input id="textareaDataFromValue" name="textareaDataFromValue" type="text" class="form-control"  vtype="illegalChar;maxLength:255;minLength:null;"  style="width:100%;"/>
								</div>
							</div>
							<div id="widgetTextareaInfo8" class="col-lg-12 col-md-12 col-sm-12 col-xs-12" style="display:none">
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;position:relative;">
									<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"初始值初始方案")%>: </lable>
									<textarea id="textareaInitFun" name="textareaInitFun" class="form-control"  vtype=""  style="width:81%;resize:none;height:60px"></textarea>
									<i class="glyphicon glyphicon-plus" style="position: absolute;opacity: 0.5;right: 20px;top: 6px;cursor: pointer;" onclick="inputText(this)"></i>
								</div>
							</div>
							<div id="widgetTextareaInfo9" class="col-lg-12 col-md-12 col-sm-12 col-xs-12" style="display:none">
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;position:relative;">
									<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"数据校验方案")%>: </lable>
									<textarea id="textareaCheckFun" name="textareaCheckFun" class="form-control"  vtype=""  style="width:81%;resize:none;height:60px"></textarea>
									<i class="glyphicon glyphicon-plus" style="position: absolute;opacity: 0.5;right: 20px;top: 6px;cursor: pointer;" onclick="inputText(this)"></i>
								</div>
							</div>
							<div id="widgetTextareaInfo10" class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;position:relative;">
									<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"值改变事件方案")%>: </lable>
									<textarea id="textareaValuechangeFun" name="textareaValuechangeFun" class="form-control" vtype=""  style="width:81%;resize:none;height:60px"></textarea>
									<i class="glyphicon glyphicon-plus" style="position: absolute;opacity: 0.5;right: 20px;top: 6px;cursor: pointer;" onclick="inputText(this)"></i>
								</div>
							</div>
							<div id="widgetTextareaInfo11" class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;position:relative;">
									<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"点击事件方案")%>: </lable>
									<textarea id="textareaClickFun" name="textareaClickFun" class="form-control" vtype=""  style="width:81%;resize:none;height:60px"></textarea>
									<i class="glyphicon glyphicon-plus" style="position: absolute;opacity: 0.5;right: 20px;top: 6px;cursor: pointer;" onclick="inputText(this)"></i>
								</div>
							</div>
						</div>
						
						<div id="radiolist" class="row cell" style="border:none;line-height:25px;height:85%;overflow:auto;" >
							<div id="widgetRadiolistInfo1" class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;">
									<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"字段显示名称")%>: </lable>
									<input id="radiolistId" name="radiolistId" type="hidden"/>
									<input id="radiolistFormColumnLable" name="radiolistFormColumnLable" type="text" class="form-control" readonly style="width:100%;"/>
								</div>
							</div>
							<div id="widgetRadiolistInfo2" class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;">
									<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"字段控件类型")%>: </lable>
									<select id="radiolistFormColumnGuiType" title="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"字段控件类型")%>" styleType="select" name="radiolistFormColumnGuiType"  class="form-control" emptyText="请选择..."  style="width:100%;" textField="dictName" disabled="true" valueField="dictID" DictName="SYS_FORM_GUI_TYPE" nullItemText="请选择..." dataField="dict" initParam = "_">
									</select>
								</div>
							</div>
						
							<div id="widgetRadiolistInfo3" class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;">
									<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"数据初始化类型")%>: </lable>
									<select id="radiolistGuiInitType" title="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"数据初始化类型")%>" onchange="rListGuiChanged()" styleType="select" name="radiolistGuiInitType"  class="form-control" emptyText="请选择..."  style="width:100%;" textField="dictName" valueField="dictID" DictName="SYS_FORM_GUI_FROM_TYPE" value="dict" dataField="dict" initParam = "_">
									</select>
								</div>
							</div>
							<div id="widgetRadiolistInfo4" class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;">
									<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"数据初始化值")%>: </lable>
									<!-- 自定义快捷下拉 -->
									<textarea id="radiolistGuiInitValue1" name="radiolistGuiInitValue1" class="form-control radiolistGuiInitValue1" vtype=""  style="width:81%;resize:none;height:58px;display:none"></textarea>
									<i class="glyphicon glyphicon-plus radiolistGuiInitValue1" style="position: absolute;opacity: 0.5;right: 20px;top: 6px;cursor: pointer;display:none" onclick="inputText(this)" placeholder=""></i>
									<!-- 字典式下拉 -->
									<input type='text' class="form-control radiolistGuiInitName2" title = "<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"数据初始化值")%>"  style="width:69%;float:left" id="radiolistGuiInitName2">
									<input type='hidden' class="form-control radiolistGuiInitName2" id="radiolistGuiInitValue2">
									<input type="button" id="radiolistGuiInitValue2"  class="btn btn-warning radiolistGuiInitName2" style="float:left" value='选择字典' onclick="chooseDictStep2('radiolist')"/>
									<!-- SQL式下拉 -->
									<input type='text' class="form-control radiolistGuiInitValue3" title = "<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"数据初始化值")%>" value="--未编写SQL--"  style="width:69%;float:left;display:none" id="radiolistGuiInitValue3">
									<input type="button" id="radiolistGuiInitValue3"  class="btn btn-warning radiolistGuiInitValue3" style="float:left;display:none" value='编写SQL ' onclick="addSqlStep2(this)"/>
									
								</div>
							</div>
						
							<div id="widgetRadiolistInfo5" class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;">
									<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"初始值来源类型")%>: </lable>
									<select id="radiolistDataFromType" title="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"初始值来源类型")%>" onchange="radiolistDataFromTypeStep2()" styleType="select" name="radiolistDataFromType"  class="form-control" emptyText="请选择..."  style="width:100%;" textField="dictName" valueField="dictID" DictName="SYS_FORM_INIT_DATA_TYPE" nullItemText="请选择..." dataField="dict" initParam = "_">
									</select>
								</div>
							</div>
							<div id="widgetRadiolistInfo6" class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;">
									<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"初始化来源")%>: </lable>
									<input id="radiolistDataFromValue" name="radiolistDataFromValue" type="text" class="form-control"  vtype="illegalChar;maxLength:255;minLength:null;"  style="width:100%;"/>
								</div>
							</div>
							<div id="widgetRadiolistInfo10" class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;">
									<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"平铺方向")%>: </lable>
									<select id="radiolistRepeatdirection" title="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"平铺方向")%>" styleType="select" name="radiolistRepeatdirection"  class="form-control" emptyText="请选择..."  style="width:100%;" textField="dictName" valueField="dictID" DictName="TILE_TYPE" value="dict" dataField="dict" initParam = "_">
									</select>
								</div>
							</div>
							<div id="widgetRadiolistInfo11" class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;">
									<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"平铺显示项")%>: </lable>
									<input id="radiolistRepeatitems" name="radiolistRepeatitems" type="text" class="form-control"  vtype="illegalChar;maxLength:255;minLength:null;"  style="width:100%;"/>
								</div>
							</div>
							<div id="widgetRadiolistInfo14" class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;">
									<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"布局方式")%>: </lable>
									<select id="radiolistRepeatlayout" title="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"布局方式")%>" styleType="select" name="radiolistRepeatlayout"  class="form-control" emptyText="请选择..."  style="width:100%;" textField="dictName" valueField="dictID" DictName="radiolistRepeatlayout" value="dict" dataField="dict" initParam = "_">
									</select>
								</div>
							</div>
							<div id="widgetRadiolistInfo7" class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;">
									<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"文本显示字段")%>: </lable>
									<input id="radiolistTextfield" name="radiolistTextfield" type="text" class="form-control"  vtype="illegalChar;maxLength:255;minLength:null;" readonly style="width:100%;"/>
								</div>
							</div>
							<div id="widgetRadiolistInfo8" class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;">
									<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"值字段")%>: </lable>
									<input id="radiolistValuefield" name="radiolistValuefield" type="text" class="form-control"  vtype="illegalChar;maxLength:255;minLength:null;" readonly style="width:100%;"/>
								</div>
							</div>
							<div id="widgetRadiolistInfo9" class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;">
									<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"数据对象名称")%>: </lable>
									<input id="radiolistDatafield" name="radiolistDatafield" type="text" class="form-control"  vtype="illegalChar;maxLength:255;minLength:null;" readonly style="width:100%;"/>
								</div>
							</div>
							<div id="widgetRadiolistInfo17" class="col-lg-12 col-md-12 col-sm-12 col-xs-12" style="display:none">
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;position:relative;">
									<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"初始值初始方案")%>: </lable>
									<textarea id="radiolistInitFun" name="radiolistInitFun" class="form-control" vtype=""  style="width:81%;resize:none;height:57px"></textarea>
									<i class="glyphicon glyphicon-plus" style="position: absolute;opacity: 0.5;right: 20px;top: 6px;cursor: pointer;" onclick="inputText(this)"></i>
								</div>
							</div>
							<div id="widgetRadiolistInfo12" class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;position:relative;">
									<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"单元格编辑方案")%>: </lable>
									<textarea id="radiolistValuechangeFun" name="radiolistValuechangeFun" class="form-control" vtype=""  style="width:81%;resize:none;height:58px"></textarea>
									<i class="glyphicon glyphicon-plus" style="position: absolute;opacity: 0.5;right: 20px;top: 6px;cursor: pointer;" onclick="inputText(this)"></i>
								</div>
							</div>
							<div id="widgetRadiolistInfo13" class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;position:relative;">
									<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"单元格绘制方案")%>: </lable>
									<textarea id="radiolistClickFun" name="radiolistClickFun" class="form-control" vtype=""  style="width:81%;resize:none;height:57px"></textarea>
									<i class="glyphicon glyphicon-plus" style="position: absolute;opacity: 0.5;right: 20px;top: 6px;cursor: pointer;" onclick="inputText(this)"></i>
								</div>
							</div>
						</div>

						<div id="checkboxlist" class="row cell" style="border:none;line-height:25px;height:85%;overflow:auto;" >
							<div id="widgetCheckboxlistInfo1" class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;">
									<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"字段显示名称")%>: </lable>
									<input id="checkboxlistId" name="checkboxlistId" type="hidden"/>
									<input id="checkboxlistFormColumnLable" name="checkboxlistFormColumnLable" type="text" class="form-control" readonly style="width:100%;"/>
								</div>
							</div>
							<div id="widgetCheckboxlistInfo2" class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;">
									<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"字段控件类型")%>: </lable>
									<select id="checkboxlistFormColumnGuiType" title="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"字段控件类型")%>" styleType="select" name="checkboxlistFormColumnGuiType"  class="form-control" emptyText="请选择..."  style="width:100%;" textField="dictName" disabled="true" valueField="dictID" DictName="SYS_FORM_GUI_TYPE" nullItemText="请选择..." dataField="dict" initParam = "_">
									</select>
								</div>
							</div>
						
							<div id="widgetCheckboxlistInfo3" class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;">
									<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"数据初始化类型")%>: </lable>
									<select id="checkboxlistGuiInitType" title="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"数据初始化类型")%>" onchange="cListGuiChanged()" styleType="select" name="checkboxlistGuiInitType"  class="form-control" emptyText="请选择..."  style="width:100%;" textField="dictName" valueField="dictID" DictName="SYS_FORM_GUI_FROM_TYPE" value="dict" dataField="dict" initParam = "_">
									</select>
								</div>
							</div>
							<div id="widgetCheckboxlistInfo4" class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;">
									<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"数据初始化值")%>: </lable>
									<!-- 自定义快捷下拉 -->
									<textarea id="checkboxlistGuiInitValue1" name="checkboxlistGuiInitValue1" class="form-control checkboxlistGuiInitValue1" vtype=""  style="width:81%;resize:none;height:58px;display:none"></textarea>
									<i class="glyphicon glyphicon-plus checkboxlistGuiInitValue1" style="position: absolute;opacity: 0.5;right: 20px;top: 6px;cursor: pointer;display:none" onclick="inputText(this)" placeholder=""></i>
									<!-- 字典式下拉 -->
									<input type='text' class="form-control checkboxlistGuiInitName2" title = "<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"数据初始化值")%>"  style="width:69%;float:left" id="checkboxlistGuiInitName2">
									<input type='hidden' class="form-control checkboxlistGuiInitName2" id="checkboxlistGuiInitValue2">
									<input type="button" id="checkboxlistGuiInitValue2"  class="btn btn-warning checkboxlistGuiInitName2" style="float:left" value='选择字典' onclick="chooseDictStep2('checkboxlist')"/>
									<!-- SQL式下拉 -->
									<input type='text' class="form-control checkboxlistGuiInitValue3" title = "<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"数据初始化值")%>" value="--未编写SQL--"  style="width:69%;float:left;display:none" id="checkboxlistGuiInitValue3">
									<input type="button" id="checkboxlistGuiInitValue3"  class="btn btn-warning checkboxlistGuiInitValue3" style="float:left;display:none" value='编写SQL ' onclick="addSqlStep2(this)"/>
									
								</div>
							</div>
						
							<div id="widgetCheckboxlistInfo5" class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;">
									<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"初始值来源类型")%>: </lable>
									<select id="checkboxlistDataFromType" title="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"初始值来源类型")%>" onchange="checkboxlistDataFromTypeStep2()" styleType="select" name="checkboxlistDataFromType"  class="form-control" emptyText="请选择..."  style="width:100%;" textField="dictName" valueField="dictID" DictName="SYS_FORM_INIT_DATA_TYPE" nullItemText="请选择..." dataField="dict" initParam = "_">
									</select>
								</div>
							</div>
							<div id="widgetCheckboxlistInfo6" class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;">
									<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"初始化来源")%>: </lable>
									<input id="checkboxlistDataFromValue" name="checkboxlistDataFromValue" type="text" class="form-control"  vtype="illegalChar;maxLength:255;minLength:null;"  style="width:100%;"/>
								</div>
							</div>
							<div id="widgetCheckboxlistInfo10" class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;">
									<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"平铺方向")%>: </lable>
									<select id="checkboxlistRepeatdirection" title="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"平铺方向")%>" styleType="select" name="checkboxlistRepeatdirection"  class="form-control" emptyText="请选择..."  style="width:100%;" textField="dictName" valueField="dictID" DictName="TILE_TYPE" value="dict" dataField="dict" initParam = "_">
									</select>
								</div>
							</div>
							<div id="widgetCheckboxlistInfo11" class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;">
									<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"平铺显示项")%>: </lable>
									<input id="checkboxlistRepeatitems" name="checkboxlistRepeatitems" type="text" class="form-control"  vtype="illegalChar;maxLength:255;minLength:null;"  style="width:100%;"/>
								</div>
							</div>
							<div id="widgetCheckboxlistInfo14" class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;">
									<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"布局方式")%>: </lable>
									<select id="checkboxlistRepeatlayout" title="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"布局方式")%>" styleType="select" name="checkboxlistRepeatlayout"  class="form-control" emptyText="请选择..."  style="width:100%;" textField="dictName" valueField="dictID" DictName="radiolistRepeatlayout" value="dict" dataField="dict" initParam = "_">
									</select>
								</div>
							</div>
							<div id="widgetCheckboxlistInfo7" class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;">
									<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"文本显示字段")%>: </lable>
									<input id="checkboxlistTextfield" name="checkboxlistTextfield" type="text" class="form-control"  vtype="illegalChar;maxLength:255;minLength:null;" readonly style="width:100%;"/>
								</div>
							</div>
							<div id="widgetCheckboxlistInfo8" class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;">
									<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"值字段")%>: </lable>
									<input id="checkboxlistValuefield" name="checkboxlistValuefield" type="text" class="form-control"  vtype="illegalChar;maxLength:255;minLength:null;" readonly style="width:100%;"/>
								</div>
							</div>
							<div id="widgetCheckboxlistInfo9" class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;">
									<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"数据对象名称")%>: </lable>
									<input id="checkboxlistDatafield" name="checkboxlistDatafield" type="text" class="form-control"  vtype="illegalChar;maxLength:255;minLength:null;" readonly style="width:100%;"/>
								</div>
							</div>
							<div id="widgetCheckboxlistInfo17" class="col-lg-12 col-md-12 col-sm-12 col-xs-12" style="display:none">
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;position:relative;">
									<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"初始值初始方案")%>: </lable>
									<textarea id="checkboxlistInitFun" name="checkboxlistInitFun" class="form-control" vtype=""  style="width:81%;resize:none;height:57px"></textarea>
									<i class="glyphicon glyphicon-plus" style="position: absolute;opacity: 0.5;right: 20px;top: 6px;cursor: pointer;" onclick="inputText(this)"></i>
								</div>
							</div>
							<div id="widgetCheckboxlistInfo12" class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;position:relative;">
									<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"单元格编辑方案")%>: </lable>
									<textarea id="checkboxlistValuechangeFun" name="checkboxlistValuechangeFun" class="form-control" vtype=""  style="width:81%;resize:none;height:58px"></textarea>
									<i class="glyphicon glyphicon-plus" style="position: absolute;opacity: 0.5;right: 20px;top: 6px;cursor: pointer;" onclick="inputText(this)"></i>
								</div>
							</div>
							<div id="widgetCheckboxlistInfo13" class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;position:relative;">
									<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"单元格绘制方案")%>: </lable>
									<textarea id="checkboxlistClickFun" name="checkboxlistClickFun" class="form-control" vtype=""  style="width:81%;resize:none;height:57px"></textarea>
									<i class="glyphicon glyphicon-plus" style="position: absolute;opacity: 0.5;right: 20px;top: 6px;cursor: pointer;" onclick="inputText(this)"></i>
								</div>
							</div>
						</div>
						
						<div id="checkbox" class="row cell" style="border:none;line-height:25px;display:none;height:85%;overflow:auto;" >
							<div id="widgetCheckboxInfo1" class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;">
									<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"字段显示名称")%>: </lable>
									<input id="checkboxId" name="checkboxId" type="hidden"/>
									<input id="checkboxColumnLable" name="checkboxColumnLable" type="text" class="form-control"  title = "<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"字段显示名称")%>" readonly  style="width:100%;"/>
								</div>
							</div>
							<div id="widgetCheckboxInfo2" class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;">
									<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"字段控件类型")%>: </lable>
									<select id="checkboxColumnGuiType" title="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"字段控件类型")%>" styleType="select" disabled=true name="checkboxColumnGuiType"  class="form-control" emptyText="请选择..."  style="width:100%;" textField="dictName" valueField="dictID" DictName="SYS_FORM_GUI_TYPE" nullItemText="请选择..." dataField="dict" initParam = "_">
									</select>
								</div>
							</div>
							<div id="widgetCheckboxInfo5" class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;">
									<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"初始值来源类型")%>: </lable>
									<select id="checkboxDataFromType" title="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"初始值来源类型")%>" styleType="select" onchange="checkboxDataFromTypeStep2()" name="checkboxDataFromType"  class="form-control" emptyText="请选择..."  style="width:100%;" textField="dictName" valueField="dictID" DictName="SYS_FORM_INIT_DATA_TYPE" nullItemText="请选择..." dataField="dict" initParam = "_">
									</select>
								</div>
							</div>
							<div id="widgetCheckboxInfo6" class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;">
									<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"初始值来源")%>: </lable>
									<input id=checkboxDataFromValue name="checkboxDataFromValue" type="text" class="form-control"  vtype="illegalChar;maxLength:255;minLength:null;"  style="width:100%;"/>
								</div>
							</div>
							<div id="widgetCheckboxInfo7" class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;">
									<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"复选框显示名称")%>: </lable>
									<input id="checkboxShowName" name="checkboxShowName" type="text" class="form-control"  vtype="illegalChar;maxLength:255;minLength:null;"  style="width:100%;"/>
								</div>
							</div>
							<div id="widgetCheckboxInfo8" class="col-lg-12 col-md-12 col-sm-12 col-xs-12" style="display:none">
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;position:relative;">
									<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"初始值初始方案")%>: </lable>
									<textarea id="checkboxInitFun" name="checkboxInitFun" class="form-control"  vtype=""  style="width:81%;resize:none;height:60px"></textarea>
									<i class="glyphicon glyphicon-plus" style="position: absolute;opacity: 0.5;right: 20px;top: 6px;cursor: pointer;" onclick="inputText(this)"></i>
								</div>
							</div>
							<div id="widgetCheckboxInfo10" class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;position:relative;">
									<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"值改变事件方案")%>: </lable>
									<textarea id="checkboxValuechangeFun" name="checkboxValuechangeFun" class="form-control" vtype=""  style="width:81%;resize:none;height:60px"></textarea>
									<i class="glyphicon glyphicon-plus" style="position: absolute;opacity: 0.5;right: 20px;top: 6px;cursor: pointer;" onclick="inputText(this)"></i>
								</div>
							</div>
							<div id="widgetCheckboxInfo11" class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;position:relative;">
									<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"点击事件方案")%>: </lable>
									<textarea id="checkboxClickFun" name="checkboxClickFun" class="form-control" vtype=""  style="width:81%;resize:none;height:60px"></textarea>
									<i class="glyphicon glyphicon-plus" style="position: absolute;opacity: 0.5;right: 20px;top: 6px;cursor: pointer;" onclick="inputText(this)"></i>
								</div>
							</div>
						</div>	
						
						<div id="lookup" class="row cell" style="border:none;line-height:25px;display:none;height:85%;overflow:auto;" >
							<div id="widgetLookupInfo1" class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;">
									<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"字段显示名称")%>: </lable>
									<input id="lookupId" name="lookupId" type="hidden"/>
									<input id="lookupFormColumnId" name="lookupFormColumnId" type="hidden"/>
									<input id="lookupFormColumnLable" name="lookupFormColumnLable" type="text" class="form-control"  title = "<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"字段显示名称")%>" readonly  style="width:100%;"/>
								</div>
							</div>
							<div id="widgetLookupInfo2" class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;">
									<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"字段控件类型")%>: </lable>
									<select id="lookupGuiType" title="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"字段控件类型")%>" styleType="select" disabled=true name="lookupColumnGuiType"  class="form-control" emptyText="请选择..."  style="width:100%;" textField="dictName" valueField="dictID" DictName="SYS_FORM_GUI_TYPE" nullItemText="请选择..." dataField="dict" initParam = "_">
									</select>
								</div>
							</div>
							<div id="widgetLookupInfo5" class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;">
									<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"初始值来源类型")%>: </lable>
									<select id="lookupDataFromType" title="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"初始值来源类型")%>" styleType="select" onchange="lookupDataFromTypeStep2()" name="lookupDataFromType"  class="form-control" emptyText="请选择..."  style="width:100%;" textField="dictName" valueField="dictID" DictName="SYS_FORM_INIT_DATA_TYPE" nullItemText="请选择..." dataField="dict" initParam = "_">
									</select>
								</div>
							</div>
							<div id="widgetLookupInfo6" class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;">
									<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"初始值来源")%>: </lable>
									<input id="lookupDataFromValue" name="lookupDataFromValue" type="text" class="form-control"  vtype="illegalChar;maxLength:255;minLength:null;"  style="width:100%;"/>
								</div>
							</div>
							
							<div id="widgetLookupInfo3" class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;">
									<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"窗口类型")%>: </lable>
									<select id="lookupFormWinType" title="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"窗口类型")%>" styleType="select" onchange="lookupFormWinTypeStep2()" name="lookupFormWinType"  class="form-control" emptyText="请选择..."  style="width:100%;" textField="dictName" valueField="dictID" DictName="SYS_FORM_WIN_TYPE" nullItemText="请选择..." dataField="dict" initParam = "_">
									</select>
								</div>
							</div>
							<div id="widgetLookupInfo4" class="col-lg-6 col-md-6 col-sm-12 col-xs-12 lookuptype2" >
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;">
									<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"窗口标题")%>: </lable>
									<input id="lookupWinTitle" name="lookupWinTitle" type="text" class="form-control"  vtype="illegalChar;maxLength:255;minLength:null;" value="选择" style="width:100%;"/>
								</div>
							</div>
							<div id="widgetLookupInfo7" class="col-lg-6 col-md-6 col-sm-12 col-xs-12 lookuptype2">
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;">
									<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"窗口宽度")%>: </lable>
									<input id="lookupWinWidth" name="lookupWinWidth" type="text" class="form-control"  vtype="illegalChar;maxLength:255;minLength:null;" value="500" style="width:100%;"/>
								</div>
							</div>
							<div id="widgetLookupInfo9" class="col-lg-6 col-md-6 col-sm-12 col-xs-12 lookuptype2">
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;">
									<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"窗口高度")%>: </lable>
									<input id="lookupWinHeight" name="lookupWinHeight" type="text" class="form-control"  vtype="illegalChar;maxLength:255;minLength:null;" value="600" style="width:100%;"/>
								</div>
							</div>
							<div id="widgetLookupInfo14" class="col-lg-6 col-md-6 col-sm-12 col-xs-12 lookuptype2">
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;">
									<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"文本显示字段")%>: </lable>
									<input id="lookupShowProperty" name="lookupShowProperty" type="text" class="form-control"  vtype="illegalChar;maxLength:255;minLength:null;" value="text" style="width:100%;"/>
								</div>
							</div>
							<div id="widgetLookupInfo15" class="col-lg-6 col-md-6 col-sm-12 col-xs-12 lookuptype2">
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;">
									<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"值字段")%>: </lable>
									<input id="lookupValueProperty" name="lookupValueProperty" type="text" class="form-control"  vtype="illegalChar;maxLength:255;minLength:null;" value="id" style="width:100%;"/>
								</div>
								
							</div>
							<div id="widgetLookupInfo16" class="col-lg-12 col-md-12 col-sm-12 col-xs-12 lookupForm">
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;">
									<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"动态表单")%>: </lable>
									<input id="lookupDetailFormId" name="lookupDetailFormId" type="hidden"/>
									<input type='text' class="form-control" title = "<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"动态表单")%>" readonly style="width:57%;float:left" id="lookupDetailFormName">
									<input type="button" id="chooseFormStep2"  class="btn btn-primary" style="float:left" value='选择表单 ' onclick="chooseFormStep2('lookup')"/>
									<input type="button" id="addParamStep2"  class="btn btn-warning" style="float:left" value='参数配置 ' onclick="addParamStep2('lookup')"/>
								</div>
							</div>
							<div id="widgetLookupInfo20" class="col-lg-12 col-md-12 col-sm-12 col-xs-12 lookupUrl" style="display:none">
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;">
									<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"表单URL")%>: </lable>
									<input type='text' class="form-control" title = "<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"表单URL")%>"  style="width:57%;float:left" id="lookupFormUrl">
									<input type="button" id="addParamStep2"  class="btn btn-warning" style="float:left" value='参数配置 ' onclick="addParamStep2('lookup')"/>
								</div>
							</div>
							<div id="widgetLookupInfo17" class="col-lg-6 col-md-6 col-sm-12 col-xs-12 lookupForm">
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;">
									<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"是否自定义回显")%>: </lable>
									<select id="lookupCustomDataback" title="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"是否自定义回显")%>" styleType="select" onchange="lookupCustomDatabackFunStep2()" name="lookupCustomDataback"  class="form-control"  style="width:100%;" textField="dictName" valueField="dictID" DictName="SYS_COMMON_YES_NO"  dataField="dict" initParam = "_">
									</select>
								</div>
							</div>
							<div id="widgetLookupInfo18" class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;">
									<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"数据回显类型")%>: </lable>
									<select id="lookupDatabackType" title="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"数据回显类型")%>" styleType="select" onchange="lookupDatabackType()" name="lookupDatabackType"  class="form-control" emptyText="请选择..."  style="width:100%;" textField="dictName" valueField="dictID" DictName="SYS_FORM_LOOKUP_DATABACK" nullItemText="请选择..." dataField="dict" initParam = "_">
									</select>
								</div>
							</div>
							
							<div id="widgetLookupInfo19" class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;">
									<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"回显值来源")%>: </lable>
									<!-- 本字段 -->
									<input type='text' class="form-control" title = "<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"回显值来源")%>"  style="width:57%;float:left;display:none" id="lookupDatabackValue1">
									<!-- 其他字段 -->
									<select id="lookupDatabackValue" title="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"回显值来源")%>" styleType="select" onchange="" name="lookupDatabackValue"  class="form-control" style="width:100%;display:none" DictName="" dataField="sql_form_0000" initParam = "_">
									</select>
									<!-- sql调用 -->
									<input type='text' class="form-control" value="--未编写SQL--"  style="width:69%;float:left;display:none" id="lookupSql">
									<input type="button" id="lookupEditSql"  class="btn btn-warning" style="float:left;display:none" value='编写SQL ' onclick="addSqlStep2('lookup')"/>
								</div>
							</div>
							
							<div id="widgetLookupInfo13" class="col-lg-12 col-md-12 col-sm-12 col-xs-12" style="display:none;">
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;position:relative;">
									<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"窗口自定义方案")%>: </lable>
									<textarea id="lookupButtonclickFun" name="lookupButtonclickFun" class="form-control" vtype=""  style="width:81%;resize:none;height:60px"></textarea>
									<i class="glyphicon glyphicon-plus" style="position: absolute;opacity: 0.5;right: 20px;top: 6px;cursor: pointer;" onclick="inputText(this)"></i>
								</div>
							</div>
							
							<div id="widgetLookupInfo8" class="col-lg-12 col-md-12 col-sm-12 col-xs-12" style="display:none;">
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;position:relative;">
									<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"初始值初始方案")%>: </lable>
									<textarea id="lookupInitFun" name="lookupInitFun" class="form-control"  vtype=""  style="width:81%;resize:none;height:60px"></textarea>
									<i class="glyphicon glyphicon-plus" style="position: absolute;opacity: 0.5;right: 20px;top: 6px;cursor: pointer;" onclick="inputText(this)"></i>
								</div>
							</div>
							
							<div id="widgetLookupInfo10" class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;position:relative;">
									<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"值改变事件方案")%>: </lable>
									<textarea id="lookupValuechangeFun" name="lookupValuechangeFun" class="form-control" vtype=""  style="width:81%;resize:none;height:60px"></textarea>
									<i class="glyphicon glyphicon-plus" style="position: absolute;opacity: 0.5;right: 20px;top: 6px;cursor: pointer;" onclick="inputText(this)"></i>
								</div>
							</div>
							<div id="widgetLookupInfo11" class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;position:relative;">
									<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"点击事件方案")%>: </lable>
									<textarea id="lookupClickFun" name="lookupClickFun" class="form-control" vtype=""  style="width:81%;resize:none;height:60px"></textarea>
									<i class="glyphicon glyphicon-plus" style="position: absolute;opacity: 0.5;right: 20px;top: 6px;cursor: pointer;" onclick="inputText(this)"></i>
								</div>
							</div>
							<div id="widgetLookupInfo12" class="col-lg-12 col-md-12 col-sm-12 col-xs-12" style="display:none;">
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;position:relative;">
									<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"自定义回显方案")%>: </lable>
									<textarea id="lookupCustomDatabackFun" name="lookupCustomDatabackFun" class="form-control" vtype=""  style="width:81%;resize:none;height:60px"></textarea>
									<i class="glyphicon glyphicon-plus" style="position: absolute;opacity: 0.5;right: 20px;top: 6px;cursor: pointer;" onclick="inputText(this)"></i>
								</div>
							</div>
						</div>
						
						<div id="fileupload" class="row cell" style="border:none;line-height:25px;display:none;height:85%;overflow:auto;" >
							<div id="widgetFileuploadInfo1" class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;">
									<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"字段显示名称")%>: </lable>
									<input id="fileuploadId" name="fileuploadId" type="hidden"/>
									<input id="fileuploadFormColumnId" name="fileuploadFormColumnId" type="hidden"/>
									<input id="fileuploadFormColumnLable" name="fileuploadFormColumnLable" type="text" class="form-control"  title = "<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"字段显示名称")%>" readonly  style="width:100%;"/>
								</div>
							</div>
							<div id="widgetFileuploadInfo2" class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;">
									<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"字段控件类型")%>: </lable>
									<select id="fileuploadGuiType" title="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"字段控件类型")%>" styleType="select" disabled=true name="fileuploadColumnGuiType"  class="form-control" emptyText="请选择..."  style="width:100%;" textField="dictName" valueField="dictID" DictName="SYS_FORM_GUI_TYPE" nullItemText="请选择..." dataField="dict" initParam = "_">
									</select>
								</div>
							</div>
							<div id="widgetFileuploadInfo4" class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;">
									<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"上传附件最大数")%>: </lable>
									<input id="fileuploadMaxFileCount" name="fileuploadMaxFileCount" type="number" class="form-control" placeholder="0代表无限制" style="width:100%;"/>
								</div>
							</div>
							<div id="widgetFileuploadInfo5" class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;height:50px">
									<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"是否弹窗上传")%>: </lable>
									<input id="fileuploadAutoUpload" name="fileuploadAutoUpload" type="checkbox" class="checkbox" checked style="width:58%"/>
								</div>
							</div>
							<div id="widgetFileuploadInfo4" class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;">
									<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"关联表单")%>: </lable>
									<input id="fileuploadDataFromType" name="fileuploadDataFromType" type="text" readonly class="form-control" placeholder="选择表单" style="width:100%;float:left"/>
									<input type="button" id="chooseFormStep2"  class="btn btn-primary" style="float:left" value='选择表单 ' onclick="chooseFormStep2('fileupload')"/>
								</div>
							</div>
							<div id="widgetFileuploadInfo5" class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;">
									<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"关联表单主键")%>: </lable>
									<input id="fileuploadDataFromValue" name="fileuploadDataFromValue" type="text" readonly class="form-control" style="width:60%"/>
								</div>
							</div>
							
							<div id="widgetFileuploadInfo6" class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;">
								<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"tag包关联下拉")%>: </lable>
									<input type='text' class="form-control fileiploadlistGuiInitName2" title = "<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"tag包关联下拉")%>"  style="width:100%;float:left" id="fileuploadTagGuiInitName2">
									<input type='hidden' class="form-control fileuploadTagGuiInitName2" id="fileuploadTagGuiInitValue2">
									<input type="button" class="btn btn-warning fileuploadTagGuiInitName2" style="float:left" value='选择字典' onclick="chooseDictStep2('fileuploadTag')"/>
								</div>
							</div>
							
							<div id="widgetFileuploadInfo3" class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;">
									<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"文件上传类型")%>: </lable>
									<select id="fileuploadUploadFiletypes" title="文件上传类型" name="fileuploadUploadFiletypes"  class="selectpicker bla bla bli" multiple data-live-search="true" style="" showNullItem="true" textField="dictName" valueField="dictID" DictName="SYS_FORM_FILEUPLOAD_UPLOAD_FILETYPES" dataField="dictList_form_0" multiSelect="true">
									</select>
								</div>
							</div>
						</div>
																						
						<div class="BTNGROUP BTNGROUP_1004" style="margin:0 0 0 15px; display:inline-block;height: 30px;">
							<div style="margin-right:10px;display:inline-block">
								<input type="button" id="saveWidget"  class="btn btn-primary" value=保存 onclick="saveWidget()"/>
							</div>
						</div>
						
					</div>
				</div>
			<!--
				<div class="tab-pane" id="Tab_3">
					<div id="widgetForm" class="" style="">
						<div id="textLink" class="row cell" style="border:none;line-height:25px;height:85%;overflow:auto;" >
							<div id="widgetTextLinkInfo1" class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;">
									<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"是否动态表单")%>: </lable>
									<input id="textboxLinkIsForm" name="textboxLinkIsForm" type="checkbox" onclick="linkIsFormStep2()" class="checkbox" checked  title = "<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"是否动态表单")%>" />
									<input id="textboxLinkForm" name="textboxLinkForm" type="hidden"/>
								</div>
							</div>
							<div id="widgetTextLinkInfo2" class="col-lg-12 col-md-12 col-sm-12 col-xs-12" style="display:none">
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;">
									<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"自定义URL")%>: </lable>
									<input type='text' class="form-control" title = "<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"自定义URL")%>"  style="width:57%;float:left" id="textboxLinkUrl1">
									<input type="button" id="addParamStep2"  class="btn btn-warning" style="float:left" value='参数配置 ' onclick="addParamStep2(this)"/>
								</div>
							</div>
							<div id="widgetTextLinkInfo3" class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;">
									<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"关联表单")%>: </lable>
									<input id="textlinkDetailFormId" name="textlinkDetailFormId" type="hidden"/>
									<input type='text' class="form-control" title = "<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"关联表单")%>" readonly style="width:57%;float:left" id="textlinkDetailFormName">
									<input type="button" id="chooseFormStep2"  class="btn btn-primary" style="float:left" value='选择表单 ' onclick="chooseFormStep2('textlink')"/>
									<input type="button" id="addParamStep2"  class="btn btn-warning" style="float:left" value='参数配置 ' onclick="addParamStep2(this)"/>
								</div>
							</div>
							<div id="widgetTextLinkInfo4" class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;">
									<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"窗口打开方式")%>: </lable>
									<input id="textboxLinkWinOpenType1" name="textboxLinkWinOpenType" type="radio" onclick="layerJsp()" class="radio" value="1" checked  title = "<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"弹出层")%>" style="float:left"/><p style="float:left;width:20%">弹出层</p>
									<input id="textboxLinkWinOpenType2" name="textboxLinkWinOpenType" type="radio" onclick="newJsp()" class="radio" value="2" title = "<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"新页面")%>" style="float:left"/><p style="float:left;width:20%">新页面</p>
								
								</div>
							</div>
							<div id="widgetTextLinkInfo8" class="col-lg-6 col-md-6 col-sm-12 col-xs-12 jumpJsp">
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;">
									<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"成功之后处理")%>: </lable>
									<select id="textboxLinkSuccessDeal" title="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"成功之后处理")%>" styleType="select" name="textboxLinkSuccessDeal"  class="form-control" emptyText="请选择..."  style="width:100%;" textField="dictName" valueField="dictID" DictName="SYS_FORM_BUTTON_ADD_SUCCESS" nullItemText="请选择..." dataField="dict" initParam = "_">
									</select>
								</div>
							</div>
							<div id="widgetTextLinkInfo5" class="col-lg-6 col-md-6 col-sm-12 col-xs-12 jumpJsp">
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;">
									<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"窗口标题")%>: </lable>
									<input id="textboxLinkWinTitle" name="textboxLinkWinTitle" type="text" class="form-control"  title = "<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"窗口标题")%>" style="width:100%;"/>
								</div>
							</div>
							<div id="widgetTextLinkInfo6" class="col-lg-6 col-md-6 col-sm-12 col-xs-12 jumpJsp">
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;">
									<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"窗口宽度")%>: </lable>
									<input id="textboxLinkWinWidth" name="textboxLinkWinWidth" type="number" class="form-control"  title = "<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"窗口宽度")%>" style="width:100%;"/>
								</div>
							</div>
							<div id="widgetTextLinkInfo7" class="col-lg-6 col-md-6 col-sm-12 col-xs-12 jumpJsp">
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;">
									<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"窗口高度")%>: </lable>
									<input id="textboxLinkWinHeight" name="textboxLinkWinHeight" type="number" class="form-control"  title = "<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"窗口高度")%>" style="width:100%;"/>
								</div>
							</div>
						</div>
						<div class="BTNGROUP BTNGROUP_1004" style="margin:0 0 0 15px; display:inline-block;height: 30px;">
							<div style="margin-right:10px;display:inline-block">
								<input type="button" id="saveWidget"  class="btn btn-primary" value=保存 onclick="saveWidget()"/>
							</div>
						</div>
					</div>
				</div>
				-->
			</div>
		</div>
		
		<div class="form-control" style="width:74%;height:75%;float:left;border:0">		
			<div class="" style="height:77%;overflow-y:hidden;padding:10px 0;border:0">
				<div style="position:relative;">
					<table id="columnList" style="padding-bottom:40px">
					</table>
					<div class="BTNGROUP_55" style="margin:0 auto; display:inline-block;height: 35px;position:absolute;">
						<div style="margin-right:10px;display:inline-block">
						    <input type="button" id="addColumn"  class="btn btn-primary" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"添加字段")%> onclick="addColumn()"/>
						</div>
						<!--
						<div style="margin-right:10px;display:inline-block">
						    <input type="button" id="addVirtualColumn"  class="btn btn-info" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"虚拟字段")%> onclick="addVirtualColumn()"/>
						</div>
						-->
						<div style="margin-right:10px;display:inline-block">
						    <input type="button" id="createForm"  class="btn btn-success" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"生成表单")%> onclick="createForm()"/>
						</div>
						<div style="margin-right:10px;display:inline-block">
						    <input type="button" id="delete_list"  class="btn btn-danger" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"删除字段")%> onclick="deleteColumn()"/>
						</div>
						<div style="margin-right:10px;display:inline-block">
						    <input type="button" id="save_list"  class="btn btn-warning" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"保存数据")%> onclick="saveData()"/>
						</div>
						
						<div style="margin-right:10px;display:inline-block">
						    <input type="button" id="groupManage"  class="btn btn-info" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"分组管理")%> onclick="groupManage()"/>
						</div>
						<div style="margin-right:10px;display:inline-block">
						    <input type="button" id="batchUpdate"  class="btn btn-info" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"批量修改")%> onclick="batchUpdate()"/>
						</div>
						
					</div>
				</div>
			</div>
			<div style="height:23%;padding-top:5px;">
				<textarea id = "sql" readonly spellcheck="false" rows="6" cols="" class="form-control"></textarea>
			</div>
		</div>
		<div class="container-fluid" style="width:50%;float:left;border:none;margin-top:32px;background-color:#efefef">
			
				
		</div>
	</div>
</div>
    
<script>
var TemplateId = '${param.templateId}';
var numRow=0;	
var num=0;	
var xxx="";
var checked1 = "";
var checked2 = "";
var checked3 = "";
var checked4 = "";
var checked5 = "";
var checked6 = "";
var path = '${pageContext.request.contextPath }';
var chooseMark = "";
$(function() {
	//初始化模板
	initTemplate();
	query_table();//初始化实体
	query_column();//初始化字段
	$(".fixed-table-body").css("height","84%");
	$(".no-records-found").css("display","none");
	setTabs();
	
	
})

function initTemplate(){
	getSql();
}

function setTabs(){
	$('#myTab a').click(function (e) {
		e.preventDefault();
		var x = $(this)[0].innerHTML;
		var data = $("#columnList").bootstrapTable("getSelections")[0];
		if(x=="控件信息"){
			if(data==undefined){
				layer.alert('请选中一条字段', {
					  icon: 2,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
					  skin: 'layer-ext-moon' 
					})
					return false;
			}else{
				$(this).tab('show');
				$("#textboxColumnLable").val(data.templateColumnLabel);
				$("#comboboxFormColumnLable").val(data.templateColumnLabel);
				$("#dateFormColumnLable").val(data.templateColumnLabel);
			}
			
		}if(x=="链接信息"){
			if(data==undefined||data.templateColumnGuiType!='1'){
				layer.alert('非文本字段不能设置链接', {
					  icon: 2,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
					  skin: 'layer-ext-moon' 
					})
					return false;
			}else if(!$("#textboxIsLink").prop('checked')){
						layer.alert('请查看是否勾选设置链接', {
							  icon: 2,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
							  skin: 'layer-ext-moon' 
							})
					}else{
						$(this).tab('show');
					}
		}else{
			$(this).tab('show');
		}
	});
}

function query_table() {   
    $("#tableList").bootstrapTable({  
        url : '${pageContext.request.contextPath }/formtemplate/findEntityList.action?templateId='+TemplateId, 
		height:'200',
        queryParams :'',
        undefinedText : '-',  
        striped : true, // 是否显示行间隔色  
        cache : false, // 是否使用缓存  
        clickToSelect: true,
        pagination : false,        
        uniqueId : "templateColumnId", // 每一行的唯一标识  
        sidePagination : "server", // 服务端处理分页  
        columns : [ 
		{  
		    title : '主键',  
		    field : 'templateSqlId', // 字段  
		    visible:false
		},
        {  
            title : '对象名称',  
            field : 'templateEntityName', // 字段  
            align: 'center',
            valign: 'middle',
            width:250,
            formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<div style=\"position:relative\"><input class=\"form-control\" name=\"templateEntityName\" style=\"padding:0 24px 0 12px;\" readonly=true data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"对象名称\" value=\""+value+"\"/>"+
            		   "<i class=\"glyphicon glyphicon-plus\" style=\"position: absolute;opacity: 0.5;right: 25px;top: 5px;cursor: pointer;\" onclick=\"chooseEntity(this)\"></i>"+
            		   "<i class=\"glyphicon glyphicon-remove\" style=\"position: absolute;opacity: 0.5;right: 5px;top: 5px;cursor: pointer;\" onclick=\"remove(this)\"></i><div>" ;
        	}
        },{  
            title : '对象实体ID',  
            field : 'templateEntityId', // 字段  
            align: 'center',
            valign: 'middle',
            width:125,
            formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<div style=\"position:relative\"><input class=\"form-control\" name=\"templateEntityId\" style=\"padding:0 24px 0 12px;\" readonly=true data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"对象实体ID\" value=\""+value+"\"/>" ;
        	}
        }, {  
            title : '别名',  
            field : 'templateEntityOtherName',  
            align : 'center',  
            valign : 'middle', 
			width:125,
			formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<input class=\"form-control\"  name=\"templateEntityOtherName\" data-type=\"text\" data-pk=\""+row.Id+"\"  data-title=\"别名\" value=\""+value+"\"/>" ;
        	}
        }, {  
            title : '属性',  
            field : 'templateProperty',  
            align : 'center',  
            valign : 'middle',  
            width:250,
            formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<input class=\"form-control\"  name=\"templateProperty\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"属性\" value=\""+value+"\"/>" ;
        	}
        }, {  
            title : '连接符号',  
            field : 'templateLinkSymbol',  
            align : 'center',  
            valign : 'middle', 
            width:125,
            formatter: function (value, row, index) {
            	/*if(value==undefined){
	        		value = "";
	        	}
            	return "<input class=\"form-control\"  name=\"templateLinkSymbol\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"连接符号\" value=\""+value+"\"/>";
            	*/
            	var select1,select2,select3,select4;
            	if(value==undefined){
	        		value = "";
	        	}else if(value=="join"){
	        		select1="selected";
	        	}else if(value=="left join"){
	        		select2="selected";
	        	}else if(value=="right join"){
	        		select3="selected";
	        	}else if(value=="from"){
	        		select4="selected";
	        	}
            	return  "		<select id=\"formDefLayoutType\" title=\"连接符号\" styleType=\"select\" name=\"buttonParamFrom\" value=\""+value+"\"  class=\"form-control\" >\n"+
						"			<option value >请选择</option>\n"+
						"			<option value=\"from\" "+select4+">from</option>\n"+
						"			<option value=\"join\" "+select1+">join</option>\n"+
						"			<option value=\"left join\" "+select2+">left join</option>\n"+
						"			<option value=\"right join\" "+select3+">right join</option>\n"+				
						"		</select>\n";

            }
        }, {  
            title : '条件',  
            field : 'templateCondition',  
            align : 'center',  
            valign : 'middle', 
            width:375,
            formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<input class=\"form-control\"  name=\"templateCondition\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"条件\" value=\""+value+"\"/>" ;
        	}
        }, {  
            title : '排序',  
            field : 'templateSort',  
            align : 'center',  
            valign : 'middle',
            width:125,
            formatter: function (value, row, index) {
            	if(value==undefined){
		        		value = "";
		        	}
            	return "<input class=\"form-control\"  name=\"templateSort\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"排序\" value=\""+value+"\"/>" ;
        	}
        }, {  
            title : '关联模板ID',  
            field : 'templateId', 
            visible:false
        }   
           	  
        ],
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
}

function query_column() {   
    $("#columnList").bootstrapTable({  
        url : '${pageContext.request.contextPath }/formtemplate/findFieldList.action?templateId='+TemplateId, 
        height:'650',
		queryParams :'',
        undefinedText : '-',  
        striped : true, // 是否显示行间隔色  
        cache : false, // 是否使用缓存  
        clickToSelect: true,
		async: false,
        pagination : false,        
        uniqueId : "templateColumnId", // 每一行的唯一标识  
        sidePagination : "server", // 服务端处理分页  
        columns : [ 
		{  
		    field : 'state',  
		    checkbox : true,  
		    align : 'center',  
		    valign : 'middle'  
		},
		{  
		    title : '主键',  
		    field : 'templateColumnId', // 字段  
		    visible:false
		},
        {  
            title : '字段名',  
            field : 'templateColumnUsName', 
            align: 'center',
            valign: 'middle',
            formatter: function (value, row, index) {
            	if(value==undefined){
            		value = "";
            	}
            	return "<input class=\"form-control eli w100px\" readonly=true name=\"templateColumnUsName\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"字段名\" value = \""+value+"\"/>";
        	}
        }, {  
            title : '表达式',  
            field : 'templateColumnExpression',  
            align : 'center',  
            valign : 'middle', 
            visible:false, 
            formatter: function (value, row, index) {
	            	if(value==undefined||value==""){
	            		value = "";
	            	}
                    	return "<input class=\"form-control eli w400px\" name=\"templateColumnExpression\" data-type=\"textarea\" data-pk=\""+row.Id+"\" data-title=\"表达式\" value = \""+value+"\"/>" ;
                	}
        }, {  
            title : '表别名',  
            field : 'templateColumnTableOther',  
            align : 'center',  
            valign : 'middle',  
			visible:false, 
            formatter: function (value, row, index) {
					if(value==undefined){
	            		value = "";
	            	}
                    	return "<input class=\"form-control eli w100px\" readonly=true name=\"templateColumnTableOther\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"表别名\" value = \""+value+"\"/>";
                	}
        }, {  
            title : '字段别名',  
            field : 'templateColumnOtherName',  
            align : 'center',  
            valign : 'middle', 
			//visible:false, 
            formatter: function (value, row, index) {
					if(value==undefined){
	            		value = "";
	            	}
                    	return "<input class=\"form-control eli w100px\" name=\"templateColumnOtherName\" readonly=true data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"字段别名\" value = \""+value+"\"/>";
                	}
        }, {  
            title : '中文描述',  
            field : 'templateColumnLabel',  
            align : 'center',  
            valign : 'middle', 
            formatter: function (value, row, index) {
					if(value==undefined){
	            		value = "";
	            	}
                    	return "<input class=\"form-control eli w150px\" name=\"templateColumnLabel\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"中文描述\" value = \""+value+"\"/>";
                	}
        }, {  
            title : 'PC列表',  
            field : 'isShowPcList',  
            align : 'center',  
            valign : 'middle',
            formatter: function (value, row, index) {
	            	var result = "";
					if(value==undefined){
	            		value = "";
	            	}else if(value=="true"){
	            		result = "checked";
	            	}
                    	return "<input class=\"checkbox eli w50px\" name=\"isShowPcList\" type=\"checkbox\" data-pk=\""+row.Id+"\" data-title=\"PC列表\" "+result+"/>";
                	}
        }, {  
            title : 'PC卡片',  
            field : 'isShowPcCard',  
            align : 'center',  
            valign : 'middle',
            formatter: function (value, row, index) {
	            	var result = "";
					if(value==undefined){
	            		value = "";
	            	}else if(value=="true"){
	            		result = "checked";
	            	}else if(value=="false"){
	            		result = "";
	            	}
	                    	return "<input class=\"checkbox eli w50px\" name=\"isShowPcCard\" type=\"checkbox\" data-pk=\""+row.Id+"\" data-title=\"PC卡片\" "+result+"/>";
                	}
        }, {  
            title : 'APP列表',  
            field : 'isShowAppList',  
            align : 'center',  
            valign : 'middle',
            formatter: function (value, row, index) {
	            	var result = "";
					if(value==undefined){
	            		value = "";
	            	}else if(value=="true"){
	            		result = "checked";
	            	}
                    	return "<input class=\"checkbox eli w50px\" name=\"isShowAppList\" type=\"checkbox\" data-pk=\""+row.Id+"\" data-title=\"APP列表\" "+result+"/>";
                	}
        }, {  
            title : 'APP卡片',  
            field : 'isShowAppCard',  
            align : 'center',  
            valign : 'middle',
            formatter: function (value, row, index) {
	            	var result = "";
					if(value==undefined){
	            		value = "";
	            	}else if(value=="true"){
	            		result = "checked";
	            	}else if(value=="false"){
	            		result = "";
	            	}
                    	return "<input class=\"checkbox eli w50px\" name=\"isShowPcCard\" type=\"checkbox\" data-pk=\""+row.Id+"\"  data-title=\"APP卡片\" "+result+"/>";
                	}
        },  {  
		    title : '实体ID',  
		    field : 'templateColumnEntityId',
		    visible:false, 
            formatter: function (value, row, index) {
				if(value==undefined){
            		value = "";
            	}
                	return "<input class=\"form-control eli w150px\" name=\"templateColumnEntityId\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"中文描述\" value = \""+value+"\"/>";
            	}
		},	{  
		    title : '字段表字段ID',  
		    field : 'templateColumnColumnId', 
		    visible:false, 
            formatter: function (value, row, index) {
				if(value==undefined){
            		value = "";
            	}
                	return "<input class=\"form-control eli w150px\" name=\"templateColumnColumnId\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"中文描述\" value = \""+value+"\"/>";
            	}
		},	{  
		    title : '实体名',  
		    field : 'templateEntityTableName', 
		    visible:false, 
            formatter: function (value, row, index) {
				if(value==undefined){
            		value = "";
            	}
                	return "<input class=\"form-control eli w150px\" name=\"templateEntityTableName\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"中文描述\" value = \""+value+"\"/>";
            	}
		},	{  
		    title : '实体字段名',  
		    field : 'templateFieldTableName',
		    visible:false, 
            formatter: function (value, row, index) {
				if(value==undefined){
            		value = "";
            	}
                	return "<input class=\"form-control eli w150px\" name=\"templateFieldTableName\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"中文描述\" value = \""+value+"\"/>";
            	}
		},	{  
		    title : '控件类型',  
		    field : 'templateColumnGuiType', 
		    visible:false, 
            formatter: function (value, row, index) {
				if(value==undefined){
            		value = "";
            	}
                	return "<input class=\"form-control eli w150px\" name=\"templateColumnGuiType\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"中文描述\" value = \""+value+"\"/>";
            	}
		} 
           	  
        ],
        onClickRow: function (row, $element) {
	                curRow = row;
		            $('#columnList').bootstrapTable('uncheckAll');//checkBox单选
		            $("#myTab").find("li").eq(0).attr("class","active");
		        	$("#myTab").find("li").eq(1).attr("class","");
		        	$("#myTab").find("li").eq(2).attr("class","");
		        	$("#Tab_1").attr("class","tab-pane active");
		        	$("#Tab_2").attr("class","tab-pane");
		        	$("#Tab_3").attr("class","tab-pane");
		            showExpandInfo(row);//获取并显示字段详细信息(信息在row中)
		            showWidgetInfo(row);//获取字段控件详细信息(根据row中字showWidgetInfo段Id去后台查)
	            },
	            onLoadSuccess: function (aa, bb, cc) {
	            	$("#columnList tbody>tr").each(function(){
						if($(this).attr("data-uniqueid")==chooseMark){
							//$(this).find('input:checkbox').attr("checked","true");
							$(this).find('td').eq(1).click();
						}
					})
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



var parame={
		id:'',
		value:"N",
		width: "100px",  
		height:"45px",
		url:'/myehr/dict/searchSysDictEntryTypeCode.action?userId=1',
		jsonParam:{},
		formType:'',
		chang:function (e){
			var aaa = e;
		}
};
window.onload=function(){
	var classes = [];
		if(''=='APP'){
			$("input").each(function(){
				if($(this).attr('dataField') != undefined){
					classes.push($(this)[0]);
				}
			})
		}else{
			classes = $("#columnForm").find("select");
		}
	for(var i=0;i<classes.length;i++){
		parame.id=classes[i].id;
		var type=$(classes[i]).attr('multiSelect');
		var dataField=$(classes[i]).attr('dataField');
		if(dataField=='sql_form_0002'){
			dataField = dataField+'|'+TemplateId;
		}
		parame.placeholder="";
		parame.jsonParam.dictTypeCode=$(classes[i]).attr('DictName');
		if(type=="true"){
			myehr_initSelectMore(parame,dataField);
		}else{
			myehr_initSelect(parame,dataField);
		}
	}

}

function createForm(){	
		if(checkPKcolumn()){
			var content =   "<div class=\"control-group\" style=\"float:left;width:50%\">\n"+
							"   <label class=\"control-label\" for=\"pcGridShow\">是否PC列表</label>\n"+
							"	<div class=\"switch\" data-on=\"primary\" data-off=\"info\">\n"+
							"   	<input id = \"pcGridShow\" type=\"checkbox\" "+checked2+" />\n"+
							"	</div>\n"+
							"</div>\n"+
							"<div class=\"control-group\" style=\"float:left;width:50%\">\n"+
							"   <label class=\"control-label\" for=\"pcCardShow\">是否PC增加卡片</label>\n"+
							"	<div class=\"switch\" data-on=\"info\" data-off=\"success\">\n"+
							"   	<input id = \"pcAddCardShow\" type=\"checkbox\" "+checked1+" onclick=\"yy()\"/>\n"+
							"	</div>\n"+
							"</div>\n"+
							"<div class=\"control-group\" style=\"float:left;width:50%\">\n"+
							"   <label class=\"control-label\" for=\"pcCardShow\">是否PC修改卡片</label>\n"+
							"	<div class=\"switch\" data-on=\"info\" data-off=\"success\">\n"+
							"   	<input id = \"pcEditCardShow\" type=\"checkbox\" "+checked5+" onclick=\"yy()\"/>\n"+
							"	</div>\n"+
							"</div>\n"+
							"<div class=\"control-group\" style=\"float:left;width:50%\">\n"+
							"   <label class=\"control-label\" for=\"appGridShow\">是否APP列表</label>\n"+
							"	<div class=\"switch\" data-on=\"success\" data-off=\"warning\">\n"+
							"   	<input id = \"appGridShow\" type=\"checkbox\" "+checked4+" />\n"+
							"	</div>\n"+
							"</div>\n"+
							"<div class=\"control-group\" style=\"float:left;width:50%\">\n"+
							"   <label class=\"control-label\" for=\"pcCardShow\">是否APP增加卡片</label>\n"+
							"	<div class=\"switch\" data-on=\"info\" data-off=\"success\">\n"+
							"   	<input id = \"appEditCardShow\" type=\"checkbox\" "+checked6+" onclick=\"yy()\"/>\n"+
							"	</div>\n"+
							"</div>\n"+
							"<div class=\"control-group\" style=\"float:left;width:50%\">\n"+
							"   <label class=\"control-label\" for=\"appCardShow\">是APP修改卡片</label>\n"+
							"	<div class=\"switch\" data-on=\"warning\" data-off=\"danger\">\n"+
							"   	<input id = \"appAddCardShow\" type=\"checkbox\" "+checked3+" />\n"+
							"	</div>\n"+
							"</div>\n";
			layer.open({
				title:'输入内容',
				shadeClose: true,
				zIndex:9999,
				content: content,
				area: ['500px', '300px'],
				btn: ['确定', '取消'],
				success:function(layero,index){
					$("[id='appAddCardShow']").bootstrapSwitch();
					$("[id='appGridShow']").bootstrapSwitch();
					$("[id='pcAddCardShow']").bootstrapSwitch();
					$("[id='pcGridShow']").bootstrapSwitch();
					$("[id='pcEditCardShow']").bootstrapSwitch();
					$("[id='appEditCardShow']").bootstrapSwitch();
			},
			yes: function(index, layero){
				var pcAddCard = $("#pcAddCardShow").prop("checked");
				var pcEditCard = $("#pcEditCardShow").prop("checked");
				var pcGrid = $("#pcGridShow").prop("checked");
				var appAddCard = $("#appAddCardShow").prop("checked");
				var appEditCard = $("#appEditCardShow").prop("checked");
				var appGrid = $("#appGridShow").prop("checked");
				$.ajax({
					url:path+'/formtemplate/createFormByTemplate.action?templateId='+TemplateId+'&pcAddCard='+pcAddCard+'&pcEditCard='+pcEditCard+'&pcGrid='+pcGrid+'&appAddCard='+appAddCard+'&appEditCard='+appEditCard+'&appGrid='+appGrid,
					type:'POST',
					cache: false,
					async: false,
					success: function (data) {
						location.reload();
						layer.close(index);
						}
					});
			},
			btn2: function(index, layero){
			
				}
			});
		}
}	


function inputText(obj){
	var id = $(obj).parent().find("textarea").eq(0).attr("id");
	var content = $(obj).parent().find("textarea").eq(0).val();
	content = "<textarea id='xxx' rows='7' cols='63' >"+content+"</textarea>";
	layer.open({
		title:'输入内容',
		shadeClose: true,
		zIndex:9999,
		content: content,
		area: ['500px', '300px'],
		btn: ['确定', '取消'],
		yes: function(index, layero){
			$(obj).parent().find("textarea").eq(0).val($("#xxx").val());
			$(obj).parent().find("textarea").eq(0).attr("title",$("#xxx").val());
			layer.close(index);
		  },
		btn2: function(index, layero){
		  }
	});
}

</script>
</body>
</html>