<%@ page language="java" import="java.util.*" import="com.myehr.common.util.LangUtil" pageEncoding="UTF-8"%>
<%@ include file="/common/common.jsp" %>
<%
String s = request.getParameter("author1");
System.out.println(s+"sssss=");

Map parammap=request.getParameterMap();  
		String b ="";
	    Set keSet=parammap.entrySet();  
	    for(Iterator itr=keSet.iterator();itr.hasNext();){  
	        Map.Entry me=(Map.Entry)itr.next();  
	        Object ok=me.getKey();  
	        Object ov=me.getValue();  
	        String[] value=new String[1];  
	        if(ov instanceof String[]){  
	            value=(String[])ov;  
	        }else{  
	            value[0]=ov.toString();  
	        }  
	        for(int k=0;k<value.length;k++){  
	            System.out.println(ok+"="+value[k]);  
	            StringBuilder bulid = new StringBuilder();
	            	b += bulid.append(ok+"="+value[k]).toString().trim()+"&";
	            	System.out.println(b);  
	        } 
	      }  
	      
	      System.out.println("b="+b);	     
%>
<html>
<head>
    <style type="text/css" href="./css/bootstrap.min.css"></style>
    <link rel="stylesheet" href="cssjs/animate.css" type="text/css"></link>
	<link rel="stylesheet" href="cssjs/jquery.steps.css" type="text/css"></link>
	<script type="text/javascript" src="cssjs/jquery.steps.min.js"></script>
	<script type="text/javascript" src="cssjs/formChartsBuildStep.js"></script>
	<script type="text/javascript" src="cssjs/formGridBuildStep3.js"></script>
	<script type="text/javascript" src="cssjs/formGridBuildStep4.js"></script>
	<script type="text/javascript" src="cssjs/formGridBuildStep5.js"></script>
	<script type="text/javascript" src="cssjs/demo1.js"></script>
	<style type="text/css">
	.wrapper{width:98%;margin:0 auto;padding-top:10px}
	.row{margin:0;}
	.wizard > .content > .body{padding: 0.5% 2.5%;}
	.row.cell>div lable{font-weight:600}
	.fixed-table-container thead th .th-inner, .fixed-table-container tbody td .th-inner{font-weight:600}
	fieldset{height:100%;width:100%}
	.ztree li a{width:89%}
	#step2_part2 .fixed-table-body {height:100%}
	.wizard > .content > .body ul > li{list-style:none}
	#step2_part2 .clearfix{display:none}
	.row.cell>div{min-height:30px;margin:10px 0 0 0;}
	.wizard > .steps > ul > li{width:20%}
	.row.cell>div lable{width:100px}
	.btn {padding:4px 12px 0 12px}
	#form-p-4,#form-p-3,#form-p-2,#form-p-1{width:100%;height:97%}
	
	.sidebar{height: 100%;
            position: relative;
            border-radius: 5px;
            margin-bottom: 10px;
            padding: 10px;}
        .searchInput{position: relative;}
        .searchInfo{position: absolute;top: 0;right: 0;margin-right: 30px;}
        .searchInfoWrapper>div{display: inline-block;}
        .searchInfoWrapper>div a{cursor: pointer;}
        .searchInfoWrapper label {margin: 4px 5px 0;vertical-align: top;}
        .panel-heading {padding: 5px 15px;}
	</style>
</head>

<body>
    <div class="wrapper wrapper-content animated fadeInRight">
        <div class="row">
            <div class="col-sm-12">
                <div id="form" class="wizard-big">
                    <h1>基本配置</h1>
                    <fieldset>
                        <div class="row">
                            <div id="form_step1" name="form_step1" class="col-sm-12" >
                                <div class="container-fluid" style="overflow-y:auto;">
                                    <div style="margin-top:5px;">
                                        <div style="margin:10px 0;">
	                                        <h3 style="display:block;font-size:18;text-align:left;height: 36px;line-height: 33px;padding-left: 16px;color: #666;cursor: pointer;">基础信息</h3>
	                                            <div class="row cell" id="form1" >
	                                                <div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
	                                                    <div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
	                                                        <lable style="float:left">表单编码</lable>
	                                                        <input id="formDefCode" name="formDefCode" type="text" class="form-control" style="width:200px;" value="${param.fieldChinaName}"/>
	                                                        <input id="formDefType" name="formDefType" type="hidden" class="form-control"  required="true"  style="width:200px;"/>
	                                                        <input id="formDefId" name="formDefId" type="hidden" class="form-control"  required="true"  style="width:200px;"/>
	                                                        <input id="formDefFolderId" name="formDefFolderId" type="hidden" class="form-control"  required="true"  style="width:200px;"/>
	                                                    </div>
	                                                </div>
	                                                <div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
	                                                    <div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
	                                                        <lable style="float:left">表单名称</lable>
	                                                        <input id="formDefName" name="formDefName" type="text" class="form-control" style="width:200px;" value="${param.controlType}"/>
	                                                    </div>
	                                                </div>
	                                                <div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
	                                                    <div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
	                                                        <lable style="float:left">表单布局类型</lable>                        
	                                                        <select id="formDefLayoutType" title="表单布局类型" styleType="select" name="formDefLayoutType" disabled   class="form-control" style="width:200px;" textField="dictName" valueField="dictID" DictName="SYS_FORM_LAYOUT" dataField="dicts">
	                                                        </select>
	                                                    </div>
	                                                </div>
	                                                <div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
	                                                    <div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
	                                                        <lable style="float:left">是否流程表单</lable>                        
	                                                        <select id="formDefIsProcess" title="是否流程表单" styleType="select" name="formDefIsProcess"  class="form-control" style="width:200px;" textField="dictName" valueField="dictID" DictName="SYS_COMMON_YES_NO" dataField="dicts"></select>
	                                                    </div>
	                                                </div>
	                                                <div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
	                                                    <div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
	                                                        <lable style="float:left">是否不受权限控制</lable>                      
	                                                        <select id="formAuthorityIsControl" title="是否不受权限控制" styleType="select" name="formAuthorityIsControl"  class="form-control" style="width:200px;" textField="dictName" valueField="dictID" DictName="SYS_COMMON_YES_NO" dataField="dicts"></select>
	                                                    </div>
	                                                </div>
	                                                <div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
	                                                    <div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
	                                                        <lable style="float:left">是否移动端表单</lable>                      
	                                                        <select id="isApp" title="是否移动端表单" styleType="select" name="isApp"  class="form-control" style="width:200px;" textField="dictName" valueField="dictID" DictName="SYS_COMMON_YES_NO" dataField="dicts"></select>
	                                                    </div>
	                                                </div>
	                                                <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12" style = "height:40px">
	                                                    <div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">
	                                                        <lable style="float:left">权限SQL</lable>
	                                                        <textarea id="powerSql" name="powerSql" rows="2" class="form-control" style="width:50%;resize:none">
	                                                        </textarea>
	                                                    </div>
	                                                </div>
	                                                <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12" style = "height:40px">
	                                                    <div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">
	                                                        <lable style="float:left">排序SQL</lable>
	                                                        <textarea id="orderSql" name="orderSql" rows="2" class="form-control" style="width:50%;resize:none">
	                                                        </textarea>
	                                                    </div>
	                                                </div>
	                                                <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12" style = "height:40px">
	                                                    <div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">
	                                                        <lable style="float:left">表单描述</lable>
	                                                        <textarea id="formDefDesc" name="formDefDesc" rows="2" class="form-control" style="width:50%;resize:none">
	                                                        </textarea>
	                                                    </div>
	                                                </div>
	                                                <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12" style = "height:40px">
	                                                    <div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">
	                                                        <lable style="float:left">前置初始函数</lable>
	                                                        <textarea id="formDefInitQzJs" name="formDefInitQzJs" rows="2" class="form-control" style="width:50%;resize:none">
	                                                        </textarea>
	                                                    </div>
	                                                </div>
	                                                <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12" style = "height:40px">
	                                                    <div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">
	                                                        <lable style="float:left">前置初始SQL</lable>
	                                                        <textarea id="formDefInitQzSql" name="formDefInitQzSql" rows="2" class="form-control" style="width:50%;resize:none">
	                                                        </textarea>
	                                                    </div>
	                                                </div>
	                                            </div>
	                                        <div id="form2">
	                                          	<h3 style="display:block;font-size:18;text-align:left;height: 36px;line-height: 33px;padding-left: 16px;color: #666;cursor: pointer;">图表扩展信息</h3>
	                                            <div class="row cell"  >
	                                                <div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
														<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
															<lable style="float:left">图表类型</lable>
															 <select id="formChartsType" title="图表类型" styleType="select" name="formChartsType"  class="form-control" style="width:200px;" textField="dictName" valueField="dictID" DictName="chartsType" dataField="dicts"></select>
														</div>
													</div>
													<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
														<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;position:relative;">
															<lable style="float:left">选择表单</lable>
															<input id="formChartsSelectFormId" name="formChartsSelectFormId" type="hidden" class="form-control" value="" style="width:200px;" />
															<input id="formChartsSelectFormName" name="formChartsSelectFormName"  class="form-control" value="" style="width:200px;" />
															<i class="glyphicon glyphicon-plus" style="position: absolute;opacity: 0.5;right: 10px;top: 6px;cursor: pointer;" onclick="chooseFormStep2('charts')"></i>
														</div>
													</div>
													<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
														<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
															<lable style="float:left">图表颜色</lable>
															<input id="formChartsColor" name="formPageSize" class="form-control" value="#ff0000" style="width:200px;" />
														</div>
													</div>
													<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
														<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
															<lable style="float:left">图表标题</lable>
															<input id="formChartsTitle" name="formChartsTitle" class="form-control" value="" style="width:200px;" />
														</div>
													</div>
													<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
														<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
															<lable style="float:left">是否显示坐标指示器</lable>
															<input id="formChartsTooltip" name="formMultiSelect" type="checkbox" checked class="checkbox"/>
														</div>
													</div>
													<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
														<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
															<lable style="float:left">是否显示图表切换</lable>
															<input id="formChartsToolbox" name="formChartsToolbox" type="checkbox" checked class="checkbox"/>
														</div>
													</div>
													<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
														<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
															<lable style="float:left">是否隐藏列表</lable>
															<input id="formChartsHideTable" name="formChartsHideTable" checked type="checkbox" class="checkbox"/>
														</div>
													</div>
													<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
														<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
															<lable style="float:left">是否显示图例</lable>
															<input id="formChartsShowLegend" name="formChartsShowLegend" checked type="checkbox" class="checkbox"/>
														</div>
													</div>
													<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
														<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
															<lable style="float:left">图例名称</lable>
															<input id="formChartsLegendName" name="formChartsLegendName" class="form-control" value="" style="width:200px;" />
														</div>
													</div>
													<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
														<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
															<lable style="float:left">图表宽度</lable>
															<input id="formChartsXAxis" name="formChartsXAxis" class="form-control" value="" style="width:200px;" />
														</div>
													</div>
													<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
														<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
															<lable style="float:left">图表高度</lable>
															<input id="formChartsYAxis" name="formChartsYAxis" class="form-control" value="" style="width:200px;" />
														</div>
													</div>
													<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
														<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
															<lable style="float:left">图表大小</lable>
															<input id="formChartsSize" name="formChartsSize" class="form-control" value="50%" style="width:200px;" />
														</div>
													</div>
													<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
														<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
															<lable style="float:left">图表图例类型(vertical:垂直;horizontal:水平)</lable>
															<input id="formChartsTitleOrient" name="formChartsTitleOrient" class="form-control" value="vertical" style="width:200px;" />
														</div>
													</div>
													<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
														<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
															<lable style="float:left">图表显示位置(X轴)</lable>
															<input id="formChartsPositionX" name="formChartsPositionX" class="form-control" value="50%" style="width:200px;" />
														</div>
													</div>
													<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
														<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
															<lable style="float:left">图表显示位置(Y轴)</lable>
															<input id="formChartsPositionY" name="formChartsPositionY" class="form-control" value="50%" style="width:200px;" />
														</div>
													</div>
													<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
														<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
															<lable style="float:left">图表标题位置</lable>
															<input id="formChartsTitlePosition" name="formChartsTitlePosition" class="form-control" value="center" style="width:200px;" />
														</div>
													</div>
	                                            </div>
	                                        </div>
	                                        
	                                        <div id="form3">
	                                        	<h3 style="display:block;font-size:18;text-align:left;height: 36px;line-height: 33px;padding-left: 16px;color: #666;cursor: pointer;">显示配置JS参数</h3>
	                                        	<div class="row cell" style = "padding-left:15px">
	                                        		<div class="BTNGROUP_55" style="margin:0 auto; display:inline-block;min-height: 20px;">
														<div style="margin-right:10px;display:inline-block">
														    <input type="button" id="saveJS"  class="btn btn-primary" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"保存参数")%> onclick="saveJs()"/>
														</div>
													</div>
													<table id="jsList">
													</table>
												</div>
	                                        </div>
                                        </div>  
                                    </div>
                                </div>
                            </div>
                        </div>
                    </fieldset>
                    
                    <h1>字段配置</h1>
                    <fieldset>
                        <div class="row">
                            <div id="form_step2" name="form_step2" class="col-sm-12" >
                                <div class="container-fluid" style="">
                                    <div style="margin-top:5px;">
                                        <div style="margin:10px 0;height:100%">
	                                        
	                                        <div id="step2_part2" style="height:45%;padding:10px;display:block;height:88%;">
	                                        	<h3 style="display:block;font-size:18;text-align:left;height: 36px;line-height: 33px;padding-left: 16px;color: #666;cursor: pointer;margin:0">字段明细</h3>
	                                        	<div class="row cell" style = "padding-left:15px;width:50%;float:left;">
													<div class="BTNGROUP_55" style="margin:0 auto; display:inline-block;min-height: 20px;" >
														<div style="margin-right:10px;display:inline-block">
														    <input type="button" id="mapping"  class="btn btn-primary" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"映射")%> onclick="mapping()"/>
														</div>
														<div style="margin-right:10px;display:inline-block">
														    <input type="button" id="addColumn"  class="btn btn-info" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"新增")%> onclick="addColumn()"/>
														</div>
														<div style="margin-right:10px;display:inline-block">
														    <input type="button" id="deleteColumn"  class="btn btn-danger" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"删除")%> onclick="deleteColumns()"/>
														</div>
														<div style="margin-right:10px;display:inline-block">
														    <input type="button" id="refreshColumns"  class="btn btn-info" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"刷新")%> onclick="refreshColumns()"/>
														</div>
														<div style="margin-right:10px;display:inline-block">
														    <input type="button" id="widgetCondition"  class="btn btn-warning" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"属性")%> onclick="widgetCondition()"/>
														</div>
														<div style="margin-right:10px;display:inline-block">
														    <input type="button" id="batchAction"  class="btn btn-primary" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"批量")%> onclick="batchUpdate()"/>
														</div>
														<div style="margin-right:10px;display:inline-block">
														    <input type="button" id="createGroup"  class="btn btn-info" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"分组")%> onclick="createGroup()"/>
														</div>
														<!-- 
														<div style="margin-right:10px;display:inline-block">
														    <input type="button" id="formView"  class="btn btn-warning" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"预览")%> onclick="formView()"/>
														</div>
														 -->
														<div style="margin-right:10px;display:inline-block">
														    <input type="button" id="invert"  class="btn btn-danger" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"反选")%> onclick="reveseCheck()"/>
														</div>
													</div>
													<table id="columnList">
													</table>
												</div>
												
												<div class="container-fluid" style="width:50%;float:left;border:none;margin-top:32px;background-color:#efefef">
													<ul class="nav nav-tabs" id="myTab">
														<li class="active"><a href="#Tab_1">图表字段配置</a></li>
													</ul>
													<div class="tab-content">
														<div class="tab-pane active" id="Tab_1">
															<div id="columnForm" class="" style="">
																<div class="row cell" style="line-height:25px;height:95%;overflow:auto;" >
																	<div id="columnInfo1" class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
																		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;">
																			<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"关联实体ID")%>: </lable>
																			<input id="formColumnEntityId" name="formColumnEntityId" type="text" class="form-control" readonly style="width:60%;"/>
																		</div>
																	</div>
																	<div id="columnInfo2" class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
																		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;">
																			<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"关联实体编码")%>: </lable>
																			<input id="formEntityTableName" name="formEntityTableName" type="text" class="form-control" readonly style="width:60%;"/>
																		</div>
																	</div>
																	<div id="columnInfo3" class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
																		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;">
																			<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"关联字段ID")%>: </lable>
																			<input id="formColumnColumnId" name="formColumnColumnId" type="text" class="form-control" readonly style="width:60%;"/>
																		</div>
																	</div>
																	<div id="columnInfo4" class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
																		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;">
																			<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"关联字段编码")%>: </lable>
																			<input id="formFieldTableName" name="formFieldTableName" type="text" class="form-control" readonly style="width:60%;"/>
																		</div>
																	</div>
																	<div id="columnInfo5" class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
																		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;">
																			<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"字段显示名称")%>: </lable>
																			<input id="formColumnLable" name="formColumnLable" type="text" class="form-control"  style="width:60%;"/>
																		</div>
																	</div>
																	<div id="columnInfo6" class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
																		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;">
																			<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"字段类型")%>: </lable>
																			<select id="barChartsColumnType" title="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"字段类型")%>" styleType="select" name="barChartsColumnType"  class="form-control" emptyText="请选择..."  style="width:60%;" textField="dictName" valueField="dictID" DictName="chartsColumnType" nullItemText="请选择..." dataField="dict" initParam = "_">
																			</select>
																		</div>
																	</div>
																	<div id="columnInfo7" class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
																		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;">
																			<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"字段颜色")%>: </lable>
																			<input id="barChartsColumnColor" name="barChartsColumnColor" type="color" class="form-control" style="width:60%;"/>
																		</div>
																	</div>
																	<div id="columnInfo8" class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
																		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;">
																			<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"饼图类型")%>: </lable>
																			<select id="barChartsPieType" title="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"饼图类型")%>" styleType="select" name="barChartsPieType"  class="form-control" emptyText="请选择..."  style="width:60%;" textField="dictName" valueField="dictID" DictName="chartsPieType" nullItemText="请选择..." dataField="dict" initParam = "_">
																			</select>
																		</div>
																	</div>
																	<div id="columnInfo9" class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
																		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;">
																			<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"外圈直径")%>: </lable>
																			<input id="pieOuterRingDiameter" name="pieOuterRingDiameter" type="text" class="form-control"  style="width:60%;"/>
																		</div>
																	</div>
																	<div id="columnInfo10" class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
																		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;">
																			<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"内圈直径")%>: </lable>
																			<input id="pieInnerRingDiameter" name="pieInnerRingDiameter" type="text" class="form-control"  style="width:60%;"/>
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
													</div>
												</div>
	                                        </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </fieldset>
					
                    <h1>过滤配置</h1>
                    <fieldset>
                        <div class="row">
                            <div id="form_step3" name="form_step3" class="col-sm-12" >
                                <div class="container-fluid" style="">
                                    <div style="margin-top:5px;">
                                    	<div style="margin:10px 0;height:100%">
                                    		<div class="BTNGROUP_55" style="margin:0 auto; display:block;height: 35px;">
												<div style="margin-right:10px;display:inline-block">
												    <input type="button" id="addColumnstep3"  class="btn btn-primary" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"增加")%> onclick="addRowstep3()"/>
												</div>
												<div style="margin-right:10px;display:inline-block">
												    <input type="button" id="save_liststep3"  class="btn btn-warning" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"保存")%> onclick="saveDatastep3()"/>
												</div>
											</div>
											<table id="tableListstep3">
											</table>
                                    	</div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </fieldset>
                    
                    <h1>查询配置</h1>
                    <fieldset>
                        <div class="row">
                            <div id="form_step4" name="form_step4" class="col-sm-12" >
                                <div class="container-fluid" style="">
                                    <div style="margin-top:5px;">
                                    	<div style="height:100%;font-size:12px">
                                    		<table>
												<tr>
													<td style="padding-top: 10px">
														<div class="BTNGROUP_55" style="margin:0 auto; display:block;height: 35px;">
															<div style="margin-right:10px;display:inline-block">
																<input type="button" id="addColumnStep4"  class="btn btn-primary" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"增加")%> onclick="addRowStep4()"/>
															</div>
															<div style="margin-right:10px;display:inline-block">
																<input type="button" id="save_listStep4"  class="btn btn-warning" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"保存")%> onclick="saveDataStep4()"/>
															</div>
														</div>
													</td>
													<td style="padding-left:10px;font-size:14px">
														<lable><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"每行字段数")%>: </lable>
													</td>
													<td style="padding-left:10px;font-size:14px">
														<input id="SYS_SYSTEM_SCHEME.gridFilterRowCount" name="gridFilterRowCount" type="text" class="form-control"  vtype="illegalChar;maxLength:null;minLength:null;" style="width:200px;"/>
														<input id="SYS_SYSTEM_SCHEME.gridFilterId" name="gridFilterId" type="hidden" class="form-control"  style="width:200px;"/>
														<input id="SYS_SYSTEM_SCHEME.gridFilterFormDefId" name="gridFilterFormDefId" type="hidden" class="form-control"  style="width:200px;"/>
													</td>
													<td style="padding-left:10px;font-size:14px">
														<lable><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"Label宽度")%>: </lable>
													</td>
													<td style="padding-left:10px;font-size:14px">
														<input id="SYS_SYSTEM_SCHEME.gridFilterLableWidth" name="gridFilterLableWidth" type="text" class="form-control"  vtype="illegalChar;maxLength:null;minLength:null;" style="width:200px;"/>
													</td>
													<td style="padding-left:10px;font-size:14px">
														<lable><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"是否支持高级查询")%>: </lable>
													</td>
													<td style="padding-left:10px;font-size:14px">
														<input  id="SYS_SYSTEM_SCHEME.gridFilterHeightGrade"  name="gridFilterHeightGrade" type="checkbox" value="1"/>
													</td>
												</tr>
											</table>
											<table id="tableListStep4">
											</table>
                                    	</div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </fieldset>
                    
                    <h1>按钮配置</h1>
                    <fieldset>
                        <div class="row">
                            <div id="form_step5" name="form_step5" class="col-sm-12" >
                                <div class="container-fluid" style="">
                                    <div style="margin-top:5px;">
                                    	<div style="margin:10px 0;height:100%">
                                    		<div class="BTNGROUP_55" style="margin:0 auto; display:block;height: 35px;">
												<div style="margin-right:10px;display:inline-block">
												    <input type="button" id="addColumnstep5"  class="btn btn-primary" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"增加")%> onclick="addRowstep5()"/>
												</div>
												<div style="margin-right:10px;display:inline-block">
												    <input type="button" id="save_liststep5"  class="btn btn-warning" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"保存")%> onclick="saveDatastep5()"/>
												</div>
											</div>
											<table id="tableListstep5">
											</table>
                                    	</div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </fieldset>
					
                </div>
            </div>
        </div>
    </div>
</body>
<script>
window.onload=function(){
var  author1 ="${param.author1}"; 
var b = "<%=b%>";

if(author1!=""){
			b=b.substring(0,b.indexOf("author1")-1);
			
	        var author = md5(b);
            var  author1 = "${param.author1}"; 
	if(!author==author1){
		alert("请求不一致");
		custom_close()
	}
}
}
function custom_close(){  

window.opener=null;  
window.open('','_self');  
window.close();  
 
}
var formChartsId = "0";
var formChartsSelectFormId = "0";
var formId = ${param.formDefId};
$(document).ready(function () {
    $("#form").steps({
        bodyTag: "fieldset",
        onStepChanging: function (event, currentIndex, newIndex) {
            if (currentIndex == 0) {//离开基础配置
            		
                return saveFormInfo();
            }
            if (currentIndex == 1) {//离开字段配置
            	query_tablestep3();
                return true;
            }
            if (currentIndex == 2) {//离开过滤配置
            	document.getElementById("SYS_SYSTEM_SCHEME.gridFilterFormDefId").value=formId;
            	if(formId==undefined || formId=='' ){
            		formId = '${param.formDefId}';
            	}
            	
            	if(formId!='' && formId!=null){
            		_initDataStep4(formId);
            	}
            	query_tableStep4();
            }
            if (currentIndex == 3) {//离开按钮配置
            	query_tablestep5();
            }
            
            // Start validation; Prevent going forward if false
            return true;
            
           
        },
        onStepChanged: function (event, currentIndex, priorIndex) {
        },
        onFinishing: function (event, currentIndex) {
            var form = $(this);


            // Start validation; Prevent form submission if false
            return true;
        },
        onFinished: function (event, currentIndex) {
            var form = $(this);
            CloseWebPage();
            //真正完成后调用方法
            // Submit form input
            //form.submit();
        }
    });
    var classes = [];
	if(''=='APP'){
		$("input").each(function(){
			if($(this).attr('dataField') != undefined){
				classes.push($(this)[0]);
			}
		})
	}else{
		classes = $("#form_step1 select");
	}
	for(var i=0;i<classes.length;i++){
		parame.id=classes[i].id;
		var type=$(classes[i]).attr('multiSelect');
		var dataField=$(classes[i]).attr('dataField');
		if(dataField.split("_")[2]=="0000"){
 			dataField = dataField+"|${param.formDefId}";
 		}
		parame.placeholder="";
		parame.jsonParam.dictTypeCode=$(classes[i]).attr('DictName');
		parame.jsonParam.nullItemText='请选择..';
		if(type=="true"){
			myehr_initSelectMore(parame,dataField);
		}else{
			myehr_initSelect(parame,dataField);
		}
	}	
		
    formInit();//表单类型初始化
    
    jsParamInit('${param.formDefId}');
    
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
				$("#textboxColumnLable").val(data.formColumnLable);
				$("#comboboxFormColumnLable").val(data.formColumnLable);
				$("#dateFormColumnLable").val(data.formColumnLable);
			}
			
		}if(x=="链接信息"){
			if(data==undefined||data.formColumnGuiType!='1'){
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
    
});

function query_tablestep3() {   
    $("#tableListstep3").bootstrapTable({  
        url : '/myehr/form/queryWhereColumn.action?formId='+formId, 
		height:'800',
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
            title : '操作',  
            field : 'formWhereId', // 字段  
            align: 'center',
            valign: 'middle',
            width:50,
            formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<div style=\"position:relative\"><input type=\"form-control\" name=\"formWhereId\" style=\"width:0px;padding:0px;border:none;\" readonly=true data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"操作\" value=\""+value+"\"/>"+
            		   "<i class=\"glyphicon glyphicon-remove\" style=\"position: absolute;opacity: 0.5;right: 5px;top: 5px;cursor: pointer;\" onclick=\"removestep3(this)\"></i><div>" ;
        	}
		},{
			
            title : '连接条件',  
            field : 'formWhereJoinRule', // 字段  
            align: 'center',
            valign: 'middle',
            width:150,
            formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<div style=\"position:relative\"><select id=\"formWhereJoinRule"+index+"\" class=\"form-control\" name=\"formWhereJoinRule\" DictName=\"SYS_FORM_JOIN_RULE\" dataField=\"\" style=\"padding:0 24px 0 12px;\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"连接条件\" value=\""+value+"\"/>";
        	}
        },{  
            title : '左括号',  
            field : 'formWhereLeftBracket', // 字段  
            align: 'center',
            valign: 'middle',
            width:175,
            formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<div style=\"position:relative\"><input class=\"form-control\" name=\"formWhereLeftBracket\" style=\"padding:0 24px 0 12px;\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"左括号\" value=\""+value+"\"/>" ;
        	}
        }, {  
            title : '查询字段',  
            field : 'formWhereColumnId',  
            align : 'center',  
            valign : 'middle', 
			width:200,
			formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<select id=\"formWhereColumnId"+index+"\" class=\"form-control\" name=\"formWhereColumnId\" DictName=\"\" dataField=\"sql_form_0000\" data-type=\"text\" data-pk=\""+row.Id+"\"  data-title=\"查询字段\" value=\""+value+"\"/>" ;
        	}
        }, {  
            title : '过滤值类型',  
            field : 'formWhereValueType',  
            align : 'center',  
            valign : 'middle',  
            width:200,
            formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<select id=\"formWhereValueType"+index+"\" class=\"form-control\"  name=\"formWhereValueType\" DictName=\"SYS_FORM_PARAM_TYPE\" dataField=\"\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"过滤值类型\" value=\""+value+"\"></selcct>" ;
        	}
        }, {  
            title : '过滤值',  
            field : 'formWhereValue',  
            align : 'center',  
            valign : 'middle', 
            width:200,
            formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<input class=\"form-control\"  name=\"formWhereValue\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"过滤值\" value=\""+value+"\"/>";
        	}
        }, {  
            title : '过滤规则',  
            field : 'formWhereCpRule',  
            align : 'center',  
            valign : 'middle', 
            width:200,
            formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<select id=\"formWhereCpRule"+index+"\" class=\"form-control\"  name=\"formWhereCpRule\" DictName=\"SYS_FORM_WHERE_RULE\" dataField=\"\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"过滤规则\" value=\""+value+"\"/>" ;
        	}
        }, {  
            title : '排序',  
            field : 'formWhereSort',  
            align : 'center',  
            valign : 'middle',
            width:150,
            formatter: function (value, row, index) {
            	if(value==undefined){
		        		value = "";
		        	}
            	return "<input class=\"form-control\"  name=\"formWhereSort\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"排序\" value=\""+value+"\"/>" ;
        	}
		}, {  
            title : '空值是否过滤',  
            field : 'formWhereNullIs',  
            align : 'center',  
            valign : 'middle',
            width:175,
            formatter: function (value, row, index) {
            	if(value==undefined){
		        		value = "";
		        	}
            	return "<select id=\"formWhereNullIs"+index+"\" class=\"form-control\"  name=\"formWhereNullIs\" DictName=\"SYS_COMMON_YES_NO\" data-type=\"text\" data-pk=\""+row.Id+"\" dataField=\"\" data-title=\"空值是否过滤\" value=\""+value+"\"></select>" ;
        	}
		}, {  
            title : '右括号',  
            field : 'formWhereRightBracket',  
            align : 'center',  
            valign : 'middle',
            width:175,
            formatter: function (value, row, index) {
            	if(value==undefined){
		        		value = "";
		        	}
            	return "<input class=\"form-control\"  name=\"formWhereRightBracket\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"右括号\" value=\""+value+"\"/>" ;
        	}
        }],
        onClickRow: function (row, $element) {
	                curRow = row;
	                
	            },
	            onLoadSuccess: function (aa, bb, cc) {
	                addListSelectstep3();
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

function query_tablestep5() {   
    $("#tableListstep5").bootstrapTable({  
        url : '${pageContext.request.contextPath }/form/queryFormButton.action?formId='+formId, 
		height:'800',
        queryParams :'',
        undefinedText : '-',  
        striped : true, // 是否显示行间隔色  
        cache : false, // 是否使用缓存  
        clickToSelect: true,
        pagination : false,        
        uniqueId : "formButtonId", // 每一行的唯一标识  
        sidePagination : "server", // 服务端处理分页  
        columns : [ 
		{  
            title : '操作',  
            field : 'formButtonId', // 字段  
            align: 'center',
            valign: 'middle',
            width:75,
            formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<div style=\"position:relative\"><input type=\"form-control\" name=\"formButtonId\" style=\"width:0px;padding:0px;border:none\" readonly=true data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"操作\" value=\""+value+"\"/>"+
						"<i class=\"glyphicon glyphicon-edit\" style=\"position: absolute;opacity: 0.5;right: 25px;top: 5px;cursor: pointer;\" onclick=\"editButtonstep5(this)\"></i>"+
						"<i class=\"glyphicon glyphicon-remove\" style=\"position: absolute;opacity: 0.5;right: 5px;top: 5px;cursor: pointer;\" onclick=\"removestep5(this)\"></i><div>" ;
        	}
		},{
            title : '按钮类型名称',  
            field : 'formButtonType',  
            align : 'center',  
            valign : 'middle', 
			width:200,
			formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<select id=\"formButtonType"+index+"\" name=\"formButtonType\" class=\"form-control\" DictName=\"SYS_FORM_BUTTON_TYPE\" onchange=\"changeButtonType(this)\"  data-title=\"按钮类型名称\" value=\""+value+"\"/>" ;
        	}
		}, {  
            title : '按钮显示名称',  
            field : 'formButtonName',  
            align : 'center',  
            valign : 'middle', 
            width:200,
            formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<input class=\"form-control\"  name=\"formButtonName\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"按钮显示名称\" value=\""+value+"\"/>";
        	}
		}, {  
            title : '按钮编码',  
            field : 'formButtonCode',  
            align : 'center',  
            valign : 'middle', 
            width:200,
            formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<input class=\"form-control\"  name=\"formButtonCode\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"按钮编码\" value=\""+value+"\"/>";
        	}
        }, {  
            title : '按钮显示顺序',  
            field : 'formButtonSort',  
            align : 'center',  
            valign : 'middle', 
            width:200,
            formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<input class=\"form-control\"  name=\"formButtonSort\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"按钮显示顺序\" value=\""+value+"\"/>";
        	}
		 }, {  
            title : '后置触发',  
            field : 'HZESQL',  
            align : 'center',  
            valign : 'middle', 
            width:300,
            formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<div style=\"position:relative\"><input class=\"form-control\"  name=\"HZESQL\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"后置触发\" value=\""+value+"\"/>"+
						"<i class=\"glyphicon glyphicon-plus\" style=\"position: absolute;opacity: 0.5;right: 5px;top: 5px;cursor: pointer;\" onclick=\"editESQL(this,'HZ')\"></i></div>";
        	}
        }, {  
            title : '自定义图标',  
            field : 'formButtonIcon',  
            align : 'center',  
            valign : 'middle',
            width:150,
            formatter: function (value, row, index) {
            	if(value==undefined){
		        		value = "";
		        	}
            	return "<input class=\"form-control\"  name=\"formButtonIcon\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"自定义图标\" value=\""+value+"\"/>" ;
        	}
		}, {  
            title : '按钮宽度',  
            field : 'formButtonWidth',  
            align : 'center',  
            valign : 'middle', 
            width:200,
            formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<input class=\"form-control\"  name=\"formButtonWidth\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"按钮宽度\" value=\""+value+"\"/>";
        	}
		}, {  
            title : '按钮高度',  
            field : 'formButtonHeight',  
            align : 'center',  
            valign : 'middle', 
            width:200,
            formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<input class=\"form-control\"  name=\"formButtonHeight\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"按钮高度\" value=\""+value+"\"/>";
        	}
		}, {  
            title : '按钮样式',  
            field : 'formButtonCss',  
            align : 'center',  
            valign : 'middle', 
            width:200,
            formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<input class=\"form-control\"  name=\"formButtonCss\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"按钮样式\" value=\""+value+"\"/>";
        	}
		}, {  
            title : '警告框提示内容',  
            field : 'formButtonWarningInfo',  
            align : 'center',  
            valign : 'middle', 
            width:200,
            formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<input class=\"form-control\"  name=\"formButtonWarningInfo\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"警告框提示内容\" value=\""+value+"\"/>";
        	}
		}, {  
            title : '前置脚本方案',  
            field : 'formButtonCheckFun',  
            align : 'center',  
            valign : 'middle', 
            width:200,
            formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<input class=\"form-control\"  name=\"formButtonCheckFun\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"前置脚本方案\" value=\""+value+"\"/>";
        	}
		}, {  
            title : '前置触发',  
            field : 'QZESQL',  
            align : 'center',  
            valign : 'middle', 
            width:300,
            formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<div style=\"position:relative\"><input class=\"form-control\"  name=\"QZESQL\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"前置触发\" value=\""+value+"\"/>"+
						"<i class=\"glyphicon glyphicon-plus\" style=\"position: absolute;opacity: 0.5;right: 5px;top: 5px;cursor: pointer;\" onclick=\"editESQL(this,'QZ')\"></i></div>";
        	}
        }],
        onClickRow: function (row, $element) {
	                curRow = row;
	                
	            },
	            onLoadSuccess: function (aa, bb, cc) {
	                addListSelectstep5();
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

function formInit(){
	var param = {};
	param.formId = '${param.formDefId}';
	$.ajax({
		url:'${pageContext.request.contextPath }/form/loadGridFormInfo.action',
		type:'post',
		data:JSON.stringify(param),
		contentType: 'application/json;charset=utf-8',
		cache: false,
		async: false,
		success: function (data) {
			$("#formDefId").val(data.param.formDefId);
			$("#formDefLayoutType").val(data.param.formDefLayoutType);
			$("#formDefFolderId").val(data.param.formDefFolderId);
			$("#formDefName").val(data.param.formDefName);
			$("#formDefCode").val(data.param.formDefCode);
			
		if(data.formDefIsProcess!=null&&data.formDefIsProcess!=""){
				$("#formDefIsProcess").val(data.formDefIsProcess);
			}else{
				$("#formDefIsProcess").val("N");
			}
			if(data.formAuthorityIsControl!=null&&data.formAuthorityIsControl!=""){
				$("#formAuthorityIsControl").val(data.formAuthorityIsControl);
			}else{
				$("#formAuthorityIsControl").val("N");
			}
			if(data.isApp!=null&&data.isApp!=""){
				$("#isApp").val(data.isApp);
			}else{
				$("#isApp").val("N");
			}
			
			$("#powerSql").val(data.param.powerSql);
			$("#orderSql").val(data.param.orderSql);
			$("#formDefDesc").val(data.param.formDefDesc);
			formSql=data.param.formDefEntitySql;
			realSql=data.param.formDefSql;
			$("#formDefInitQzJs").val(data.param.formDefInitQzJs);
			$("#formDefInitQzSql").val(data.param.formDefInitQzSql);
			if(data.formGrid!=null){
				formGridId = data.formGrid.formGridId+"";
				if(data.formGrid.formShowPager=="false"){
					$("#formShowPager").prop('checked',false);
				}
				if(data.formGrid.formIsIndex=="false"){
					$("#formIsIndex").prop('checked',false);
				}
				if(data.formGrid.formShowColumns=="false"){
					$("#formShowColumns").prop('checked',false);
				}
				if(data.formGrid.formEditNextRowCell=="true"){
					$("#formEditNextRowCell").prop('checked',true);
				}
				
				$("#formEditNextOnEnter").val(data.formGrid.formEditNextOnEnter);
				
				if(data.formGrid.formAllowResize=="true"){
					$("#formAllowResize").prop('checked',true);
				}
				if(data.formGrid.formAllowCellEdit=="true"){
					$("#formAllowCellEdit").prop('checked',true);
				}
				if(data.formGrid.formAllowCellSelect=="true"){
					$("#formAllowCellSelect").prop('checked',true);
				}
				if(data.formGrid.formMultiSelect=="false"){
					$("#formMultiSelect").prop('checked',false);
				}
				if(data.formGrid.formShowTitle=="false"){
					$("#formShowTitle").prop('checked',false);
				}
				if(data.formGrid.formTableIsHandsontable=="true"){
					$("#formTableIsHandsontable").prop('checked',true);
				}
				$("#formPageSize").val(data.formGrid.formPageSize);

				$("#formPageSizeList").val(data.formGrid.formPageSizeList);

				$("#formFrozen").val(data.formGrid.formFrozen);

				$("#formGridHeight").val(data.formGrid.formGridHeight);
			}
			
			if(data.sysFormCharts!=null){
				formChartsId = data.sysFormCharts.formChartsId+"";
				if(data.sysFormCharts.formChartsTooltip=="false"){
					$("#formChartsTooltip").prop('checked',false);
				}
				if(data.sysFormCharts.formChartsToolbox=="false"){
					$("#formChartsToolbox").prop('checked',false);
				}
				if(data.sysFormCharts.formChartsHideTable=="false"){
					$("#formChartsHideTable").prop('checked',false);
				}
				if(data.sysFormCharts.formChartsShowLegend=="true"){
					$("#formChartsShowLegend").prop('checked',true);
				}
				
				$("#formChartsType").val(data.sysFormCharts.formChartsType);
				$("#formChartsColor").val(data.sysFormCharts.formChartsColor);
				$("#formChartsTitle").val(data.sysFormCharts.formChartsTitle);
				$("#formChartsLegendName").val(data.sysFormCharts.formChartsLegendName);
				$("#formChartsXAxis").val(data.sysFormCharts.formChartsXAxis);
				$("#formChartsYAxis").val(data.sysFormCharts.formChartsYAxis);
				$("#formChartsSelectFormId").val(data.sysFormCharts.formChartsSelectFormId);
				$("#formChartsSelectFormName").val(data.sysFormCharts.formChartsSelectFormName);
				
				$("#formChartsSize").val(data.sysFormCharts.formChartsSize);
				$("#formChartsTitleOrient").val(data.sysFormCharts.formChartsTitleOrient);
				$("#formChartsPositionX").val(data.sysFormCharts.formChartsPositionX);
				$("#formChartsPositionY").val(data.sysFormCharts.formChartsPositionY);
				$("#formChartsTitlePosition").val(data.sysFormCharts.formChartsTitlePosition);
				
				
				formChartsSelectFormId = $("#formChartsSelectFormId").val();
			}
			
			}
		});
}

function saveFormInfo(){
	var param = {};
	var flag = false;
	param.formAuthorityIsControl = $("#formAuthorityIsControl").val();
	param.formDefCode = $("#formDefCode").val();
	param.formDefDesc = $("#formDefDesc").val();
	if(formSql!=''){
		param.formDefEntitySql = formSql;
	}else{
		param.formDefEntitySql = 'null';
	}
	param.formDefFolderId = $("#formDefFolderId").val();
	param.formDefId = $("#formDefId").val();
	param.formDefInitQzJs = $("#formDefInitQzJs").val();
	param.formDefInitQzSql = $("#formDefInitQzSql").val();	
	param.formDefIsProcess = $("#formDefIsProcess").val();
	param.formDefLayoutType = $("#formDefLayoutType").val();
	param.formDefName = $("#formDefName").val();
	if(realSql!=''){
		param.formDefSql = realSql;
	}else{
		param.formDefSql = 'null';
	}
	param.isApp = $("#isApp").val();
	param.orderSql = $("#orderSql").val();
	param.powerSql = $("#powerSql").val();
	var sysFormCharts = {};
	sysFormCharts.formChartsId = formChartsId;
	sysFormCharts.formChartsFormId = '${param.formDefId}';
	sysFormCharts.formChartsType = $("#formChartsType").val();
	sysFormCharts.formChartsColor = $("#formChartsColor").val();
	sysFormCharts.formChartsTitle = $("#formChartsTitle").val();
	sysFormCharts.formChartsTooltip = $("#formChartsTooltip").prop('checked');
	sysFormCharts.formChartsToolbox = $("#formChartsToolbox").prop('checked');
	sysFormCharts.formChartsHideTable = $("#formChartsHideTable").prop('checked');
	sysFormCharts.formChartsShowLegend = $("#formChartsShowLegend").prop('checked');
	sysFormCharts.formChartsLegendName = $("#formChartsLegendName").val();
	sysFormCharts.formChartsXAxis = $("#formChartsXAxis").val();
	sysFormCharts.formChartsYAxis = $("#formChartsYAxis").val();
	sysFormCharts.formChartsSelectFormId = $("#formChartsSelectFormId").val();
	sysFormCharts.formChartsSelectFormName = $("#formChartsSelectFormName").val();
	sysFormCharts.formChartsSize = $("#formChartsSize").val();
	sysFormCharts.formChartsTitleOrient = $("#formChartsTitleOrient").val();
	sysFormCharts.formChartsPositionX = $("#formChartsPositionX").val();
	sysFormCharts.formChartsPositionY = $("#formChartsPositionY").val();
	sysFormCharts.formChartsTitlePosition = $("#formChartsTitlePosition").val();
	
	var map = {};
	map.param = param;
	map.formGrid = sysFormCharts;
	
	if(updataForm(param)){
		$.ajax({
			url:'${pageContext.request.contextPath }/form/updataChartsFormParamx.action',
			type:'POST',
			data: JSON.stringify(sysFormCharts),
		    cache: false,
		    contentType: 'application/json;charset=utf-8',
			async: false,
			success: function (data) {
					if(data==1){
						//alert("基础配置完成");
						flag = true;
						formChartsSelectFormId = $("#formChartsSelectFormId").val();
				        loadStep_2();
					}
				}
			});
	}
	return flag;
}

function updataForm(param){
	var flag = false;
	var signstr = JSON.stringify(param);
	var rule ='\"' ;
	var regS = new RegExp(rule,'g');
	
	var rule2 =':' ;
	var regS2 = new RegExp(rule2,'g');
	signstr = signstr.replace(regS, '');
	signstr = signstr.replace(regS2, '=');
	console.log(JSON.stringify(param));
	var sign = md5(signstr);
	$.ajax({
		url:'${pageContext.request.contextPath }/form/updataGridFormParam1.action?sign='+sign,
		type:'POST',
		data: JSON.stringify(param),
	    cache: false,
	    contentType: 'application/json;charset=utf-8',
		async: false,
		success: function (data) {
				if(data=='0'){
					layer.alert('保存失败!表单编码重复', {
						  icon: 5,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
						  skin: 'layer-ext-moon' 
						})
				} else if(data=='2'){
					layer.alert('保存失败!表单中存在多个此表单编码', {
						  icon: 5,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
						  skin: 'layer-ext-moon' 
						})
					$('#formList_step2').bootstrapTable('refresh'); 
				} else if(data=='1'){
					flag = true;
					layer.alert('保存成功', {
						  icon: 6,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
						  skin: 'layer-ext-moon' 
						})
				}	
			}
		});
	return flag;
}


function jsParamInit(e){
	$("#jsList").bootstrapTable({  
        url : '${pageContext.request.contextPath }/form/findJsParamList.action?paramTypeValue='+e, 
		height:'200',
        queryParams :'',
        undefinedText : '-',  
        striped : true, // 是否显示行间隔色  
        cache : false, // 是否使用缓存  
        clickToSelect: true,
        pagination : false,        
        uniqueId : "paramId", // 每一行的唯一标识  
        sidePagination : "server", // 服务端处理分页  
        columns : [ 
		{  
		    title : '主键',  
		    field : 'paramId', 
		    visible:false
		},
        {  
            title : '操作',  
            field : 'paramType', 
            align: 'center',
            valign: 'middle',
            formatter: function (value, row, index) {            	
            	return "<div style=\"position:relative\">"+
            		   "<i class=\"glyphicon glyphicon-remove\" style=\"position: absolute;opacity: 0.5;right: 38px;top: -6px;cursor: pointer;\" onclick=\"remove(this)\"></i><div>" ;
        	}
        },{  
            title : '参数名称',  
            field : 'paramName', 
            align: 'center',
            valign: 'middle',
            formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<div style=\"position:relative\"><input class=\"form-control\" title=\"参数名称\" type=\"text\" name=\"buttonParamName\" style=\"padding:0 24px 0 12px;\" value=\""+value+"\"/>" ;
        	}
        }, {  
            title : '绑定表单ID',  
            field : 'paramTypeValue',  
            align : 'center',  
            valign : 'middle', 
            visible:false
        }, {  
            title : '参数值来源类型',  
            field : 'paramFromType',  
            align : 'center',  
            valign : 'middle',  
            formatter: function (value, row, index) {
            	var select1,select2,select3,select4;
            	if(value==undefined){
	        		value = "";
	        	}else if(value=="session"){
	        		select1="selected";
	        	}else if(value=="containerParam"){
	        		select2="selected";
	        	}else if(value=="parameter"){
	        		select3="selected";
	        	}else if(value=="constant"){
	        		select4="selected";
	        	}
            	return  "		<select id=\"formDefLayoutType\" title=\"表单布局类型\" styleType=\"select\" name=\"buttonParamFrom\" value=\""+value+"\"  class=\"form-control\" >\n"+
						"			<option value >请选择</option>\n"+
						"			<option value=\"session\" "+select1+">会话参数</option>\n"+
						"			<option value=\"containerParam\" "+select2+">容器参数</option>\n"+
						"			<option value=\"parameter\" "+select3+">请求参数</option>\n"+
						"			<option value=\"constant\" "+select4+">常量</option>\n"+					
						"		</select>\n";
        	}
        }, {  
            title : '参数值来源',  
            field : 'paramFromValue',  
            align : 'center',  
            valign : 'middle', 
            formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<input class=\"form-control\"  name=\"buttonParamValue\" data-type=\"text\" title=\"参数值来源\" value=\""+value+"\"/>";
        	}
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

function saveJs(){
	var datas = $("#jsList").bootstrapTable("getData");
	var saveDatas = [];
	for(var i=0;i<datas.length;i++){
		var paramName = $("#jsList>tbody").find("tr").eq(i).find("input").eq(0).val();
		var paramFromValue = $("#jsList>tbody").find("tr").eq(i).find("input").eq(1).val();
		var paramFromType = $("#jsList>tbody").find("tr").eq(i).find("select").eq(0).val();
		if(paramName!=datas[i].paramName||paramFromValue!=datas[i].paramFromValue||paramFromType!=datas[i].paramFromType){		
		//实体可修改部分是否修改(有一处不同,就需修改)
			datas[i].paramName=paramName;
			datas[i].paramFromValue=paramFromValue;
			datas[i].paramFromType=paramFromType;
			datas[i].paramTypeValue='${param.formDefId}';
			datas[i].paramType = 'FORMCONFIG|JS_VAR';
			saveDatas.push(datas[i]);
		}
	}
	var url = "${pageContext.request.contextPath }/form/updateJsParam.action";//更新实体信息
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
	$('#jsList').bootstrapTable('refresh');
}

function remove(obj){
	var jsParam = {};
	jsParam.paramName = $(obj).parent().parent().parent().find("input").eq(0).val();
	$.ajax({
		url:'${pageContext.request.contextPath }/form/deleteJsParam.action',
		type:'post',
		cache: false,
		data:JSON.stringify(jsParam),
		contentType: 'application/json;charset=utf-8',
		async: false,
		success: function (data) {
			
			}
		});
	$('#jsList').bootstrapTable('refresh');
}

var map = new Map(); 

function changeSql(){
	var entitySql = document.getElementById('formSql').value;
	var content = "";
	$.ajax({
		url:'${pageContext.request.contextPath }/form/getRealSql.action?entitySql='+entitySql,
		type:'post',
		cache: false,
		async: false,
		success: function (data) {
			content = data;
		}
    });
	content = "<textarea id='xxx' rows='7' cols='63' >"+content+"</textarea>";
	layer.open({
		title:'输入内容',
		shadeClose: true,
		zIndex:9999,
		content: content,
		area: ['500px', '300px']
	});
}


function addLinkParamStep2(e){
	var textboxId = document.getElementById('textboxId').value;
	var content = "";
	//jsParamInit(textboxId);
	content =   "<div class=\"row cell\" style = \"padding-left:15px\">\n"+
				"	<div class=\"BTNGROUP_55\" style=\"margin:0 auto; display:inline-block;min-height: 20px;\">\n"+
				"		<div style=\"margin-right:10px;display:inline-block\">\n"+
				"			<input type=\"button\" id=\"saveJS1\"  class=\"btn btn-primary\" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"保存参数")%> onclick=\"saveJs1()\"/>\n"+
				"		</div>\n"+
				"	</div>\n"+
				"	<table id=\"jsList1\">\n"+
				"	</table>\n"+
				"</div>\n";
	layer.open({
		title:'输入内容',
		shadeClose: true,
		zIndex:9999,
		content: content,
		area: ['1000px', '600px'],
		success:function(layero,index){
			jsParamInit1(textboxId);
	    },
		end:function(){
			refresh();
		}
	});
}

function initColumns(){
	$("#columnList").bootstrapTable({
        url : '${pageContext.request.contextPath }/form/findColumnList.action?formDefId='+formChartsSelectFormId, 
		height : '578',
        queryParams :'',
        undefinedText : '-',  
        striped : true, // 是否显示行间隔色  
        cache : false, // 是否使用缓存  
		async: false,
        clickToSelect: true,
        pagination : false,        
        uniqueId : "formColumnId", // 每一行的唯一标识  
        sidePagination : "server", // 服务端处理分页  
        columns : [ 
		{  
		    field : 'state',  
		    checkbox : true,  
		    align : 'center',  
		    valign : 'middle'  
		},
		{   
		    field : 'formColumnId', 
		    visible:false
		},
        {   
            field : 'formColumnFormDefId', 
            visible:false
        },
        {   
            field : 'formColumnEntityId', 
            visible:false
        },
        {   
            field : 'formColumnColumnId', 
            visible:false
        },        
        {  
            title : '实体名称',  
            field : 'formEntityTablename', 
            align: 'center',
            valign: 'middle',
	        formatter: function (value, row, index) {
	            if(value==undefined){
	                value='-';
	            }
	            	  return "<a  class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;\" name=\"formEntityTablename\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"实体名称\">"+value+"</a>";
	        }
        }, {  
            title : '字段名称',  
            field : 'formFieldTablename',  
            align : 'center',  
            valign : 'middle', 
            formatter: function (value, row, index) {
	            if(value==undefined){
	                value='-';
	            }
	            	  return "<a  class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;\" name=\"formFieldTablename\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"字段名称\">"+value+"</a>";
	        }
        }, {  
            title : '字段显示名称',  
            field : 'formColumnLable',  
            align : 'center',  
            valign : 'middle',  
            formatter: function (value, row, index) {
	            if(value==undefined){
	                value='-';
	            }
	            	  return "<a  class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;\" name=\"formColumnLable\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"字段显示名称\">"+value+"</a>";
	        }
        }, {  
            title : '控件类型',  
            field : 'formColumnGuiType',  
            align : 'center',  
            valign : 'middle',
		    visible:false,
	        formatter: function (value, row, index) {
	            if((value==undefined || value=="")&&value!=0){
	                value='-';
	            }
	            value = (value+'').replace(/ /g,'');
	            return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"formColumnGuiType\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"控件类型\" data-source=\"/myehr/dict/searchSysDictEntryTypeCode1.action?deleteMark=SYS_FORM_GUI_TYPE&realValue="+value+"+\"></a>";
	        }
        },{  
            title : '显示宽度',  
            field : 'formColumnWidth', 
            align: 'center',
            valign: 'middle',  
		    visible:false,
            formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<div style=\"position:relative\"><input class=\"form-control\" title=\"参数名称\" type=\"text\" name=\"buttonParamName\" style=\"padding:0 24px 0 12px;\" value=\""+value+"\"/>" ;
        	}
        },{  
            title : '显示高度',  
            field : 'formColumnHeight', 
            align: 'center',
            valign: 'middle',  
		    visible:false,
            formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<div style=\"position:relative\"><input class=\"form-control\" title=\"参数名称\" type=\"text\" name=\"buttonParamName\" style=\"padding:0 24px 0 12px;\" value=\""+value+"\"/>" ;
        	}
        },{  
            title : '显示方式',  
            field : 'formColumnShowType', 
            align: 'center',
            valign: 'middle',  
		    visible:false,
            formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<div style=\"position:relative\"><input class=\"form-control\" title=\"参数名称\" type=\"text\" name=\"buttonParamName\" style=\"padding:0 24px 0 12px;\" value=\""+value+"\"/>" ;
        	}
        },{  
            title : '显示顺序',  
            field : 'formColumnSort', 
            align: 'center',
            valign: 'middle',  
		    visible:false,
            formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<div style=\"position:relative\"><input class=\"form-control\" title=\"参数名称\" type=\"text\" name=\"buttonParamName\" style=\"padding:0 24px 0 12px;\" value=\""+value+"\"/>" ;
        	}
        },{  
            title : '对齐方式',  
            field : 'formColumnAlign', 
            align: 'center',
            valign: 'middle',  
		    visible:false,
            formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<div style=\"position:relative\"><input class=\"form-control\" title=\"参数名称\" type=\"text\" name=\"buttonParamName\" style=\"padding:0 24px 0 12px;\" value=\""+value+"\"/>" ;
        	}
        },{  
            title : '是否必填',  
            field : 'formColumnRequired', 
            align: 'center',
            valign: 'middle',  
		    visible:false,
            formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<div style=\"position:relative\"><input class=\"form-control\" title=\"参数名称\" type=\"text\" name=\"buttonParamName\" style=\"padding:0 24px 0 12px;\" value=\""+value+"\"/>" ;
        	}
        },{  
            title : '跨字段数',  
            field : 'formColumnColSpan', 
            align: 'center',
            valign: 'middle',  
		    visible:false,
            formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<div style=\"position:relative\"><input class=\"form-control\" title=\"参数名称\" type=\"text\" name=\"buttonParamName\" style=\"padding:0 24px 0 12px;\" value=\""+value+"\"/>" ;
        	}
        },{  
            title : '最大字符数',  
            field : 'formColumnMaxLength', 
            align: 'center',
            valign: 'middle',  
		    visible:false,
            formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<div style=\"position:relative\"><input class=\"form-control\" title=\"参数名称\" type=\"text\" name=\"buttonParamName\" style=\"padding:0 24px 0 12px;\" value=\""+value+"\"/>" ;
        	}
        },{  
            title : '最小字符数',  
            field : 'formColumnMinLength', 
            align: 'center',
            valign: 'middle',  
		    visible:false,
            formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<div style=\"position:relative\"><input class=\"form-control\" title=\"参数名称\" type=\"text\" name=\"buttonParamName\" style=\"padding:0 24px 0 12px;\" value=\""+value+"\"/>" ;
        	}
        },{  
            title : '字段值范围',  
            field : 'formColumnColorCondition', 
            align: 'center',
            valign: 'middle',  
		    visible:false,
            formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<div style=\"position:relative\"><input class=\"form-control\" title=\"参数名称\" type=\"text\" name=\"buttonParamName\" style=\"padding:0 24px 0 12px;\" value=\""+value+"\"/>" ;
        	}
        },{  
            title : '字段颜色',  
            field : 'formColumnColor', 
            align: 'center',
            valign: 'middle',  
		    visible:false,
            formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<div style=\"position:relative\"><input class=\"form-control\" title=\"参数名称\" type=\"text\" name=\"buttonParamName\" style=\"padding:0 24px 0 12px;\" value=\""+value+"\"/>" ;
        	}
        },{  
            title : '所属分组',  
            field : 'formColumnGroupId', 
            align: 'center',
            valign: 'middle',  
		    visible:false,
            formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<div style=\"position:relative\"><input class=\"form-control\" title=\"参数名称\" type=\"text\" name=\"buttonParamName\" style=\"padding:0 24px 0 12px;\" value=\""+value+"\"/>" ;
        	}
        },{  
            title : '列类型',  
            field : 'formColumnType', 
            align: 'center',
            valign: 'middle',  
		    visible:false,
            formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<div style=\"position:relative\"><input class=\"form-control\" title=\"参数名称\" type=\"text\" name=\"buttonParamName\" style=\"padding:0 24px 0 12px;\" value=\""+value+"\"/>" ;
        	}
        },{  
            title : '跨行数',  
            field : 'formColumnRowSpan', 
            align: 'center',
            valign: 'middle',  
		    visible:false,
            formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<div style=\"position:relative\"><input class=\"form-control\" title=\"参数名称\" type=\"text\" name=\"buttonParamName\" style=\"padding:0 24px 0 12px;\" value=\""+value+"\"/>" ;
        	}
        },{  
            title : '是否合计',  
            field : 'formColumnTotal', 
            align: 'center',
            valign: 'middle',  
		    visible:false,
            formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<div style=\"position:relative\"><input class=\"form-control\" title=\"参数名称\" type=\"text\" name=\"buttonParamName\" style=\"padding:0 24px 0 12px;\" value=\""+value+"\"/>" ;
        	}
        },{  
            title : '是否开发字段',  
            field : 'formColumnIsDev', 
            align: 'center',
            valign: 'middle',  
		    visible:false,
            formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<div style=\"position:relative\"><input class=\"form-control\" title=\"参数名称\" type=\"text\" name=\"buttonParamName\" style=\"padding:0 24px 0 12px;\" value=\""+value+"\"/>" ;
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
        responseHandler : function(res) {  
            return {  
                total : res.total,  
                rows : res.rows  
            };  
        },
        onLoadSuccess : function(){
        	$("#columnList tbody>tr").each(function(){
        		if($(this).attr("data-uniqueid")==chooseMark){
        			//$(this).find('input:checkbox').attr("checked","true");
        			$(this).find('td').eq(1).click();
        		}
        	})
        }
    });
}
function mapping(){
	layer.msg('确定要映射？将覆盖原字段', {
		  time: 0 //不自动关闭
		  ,btn: ['确定', '再想想']
		  ,success: function(layero){
				layero.find('.layui-layer-btn').css('text-align', 'center');
			}
		  ,yes: function(index){
		    layer.close(index);
		    var entitySql = document.getElementById('formSql').value;
			if(formDefId==null||formDefId=='null'){
				layer.alert('表单定义ID参数错误', {
					  icon: 2,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
					  skin: 'layer-ext-moon' //
					})
				return;
			}
			if(entitySql==null||entitySql==''){
				layer.alert('请编写实体sql', {
					  icon: 2,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
					  skin: 'layer-ext-moon' //
					})
				return ;
			}
			$.ajax({
		        url: "${pageContext.request.contextPath }/form/findColumnListSteps_2.action?formDefId=${param.formDefId}&entitySql="+entitySql,
		        type: 'POST',
		        cache: false,
		        async: false,
		        success: function (text) {
		        	var data = {};
		        	data.rows = text[1];
		        	data.total = 47;
		            if(1==1) {
		            	realSql = text[1];
		            	formSql = text[0];
		            	$("#columnList").bootstrapTable('refresh');
		            } else {
		            	 layer.alert('字段映射失败，请检查自定义SQl是否正确', {
							  icon: 5,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
							  skin: 'layer-ext-moon' 
							})
		            }
		        }
		    });

		  }
		});
}



function showWidgetInfo(dataForm){
	var type = '1';
	var columnId = dataForm.formColumnId;
	if(type==undefined||type==null||type==""){
		changeWidgetShow(1);
	}else{
		changeWidgetShow(type);
	}
	$("#textboxColumnLable").val(dataForm.formColumnLable);
	if(type=='1'){
		$.ajax({
			url:'${pageContext.request.contextPath }/form/getChartsColumnInfo.action?columnId='+columnId+'&formId='+'${param.formDefId}',
			type:'post',
			cache: false,
			async: false,
			success: function (data) {
					showChartsInfoStep2(data);
				}
			});
	}else if(type=='2'){
		$("#comboboxFormColumnLable").val(dataForm.formColumnLable);
		$.ajax({
			url:'${pageContext.request.contextPath }/form/getComboboxInfoByColumnId.action?columnId='+columnId,
			type:'post',
			cache: false,
			async: false,
			success: function (data) {
					showComboboxInfoStep2(data);
				}
			});
	}else if(type=='6'){
		$("#dateFormColumnLable").val(dataForm.formColumnLable);
		$.ajax({
			url:'${pageContext.request.contextPath }/form/getDateInfoByColumnId.action?columnId='+columnId,
			type:'post',
			cache: false,
			async: false,
			success: function (data) {
					showDateInfoStep2(data);
				}
			});
	}else if(type=='8'){
		$("#textareaFormColumnLable").val(dataForm.formColumnLable);
		$.ajax({
			url:'${pageContext.request.contextPath }/form/getTextareaInfoByColumnId.action?columnId='+columnId,
			type:'post',
			cache: false,
			async: false,
			success: function (data) {
					showTextareaInfoStep2(data);
				}
			});
	}else if(type=='3'){
		$("#radiolistFormColumnLable").val(dataForm.formColumnLable);
		$.ajax({
			url:'${pageContext.request.contextPath }/form/getRadiolistInfoByColumnId.action?columnId='+columnId,
			type:'post',
			cache: false,
			async: false,
			success: function (data) {
					showRadiolistInfoStep2(data);
				}
			});
	}else if(type=='4'){
		$("#checkboxlistFormColumnLable").val(dataForm.formColumnLable);
		$.ajax({
			url:'${pageContext.request.contextPath }/form/getCheckboxlistInfoByColumnId.action?columnId='+columnId,
			type:'post',
			cache: false,
			async: false,
			success: function (data) {
					showCheckboxlistInfoStep2(data);
				}
			});
	}else if(type=='5'){
		$("#checkboxColumnLable").val(dataForm.formColumnLable);
		$.ajax({
			url:'${pageContext.request.contextPath }/form/getCheckboxInfoByColumnId.action?columnId='+columnId,
			type:'post',
			cache: false,
			async: false,
			success: function (data) {
					showCheckboxInfoStep2(data);
				}
			});
	}else if(type=='7'){
		$("#lookupFormColumnLable").val(dataForm.formColumnLable);
		$.ajax({
			url:'${pageContext.request.contextPath }/form/getLookupInfoByColumnId.action?columnId='+columnId,
			type:'post',
			cache: false,
			async: false,
			success: function (data) {
					showLookupInfoStep2(data);
				}
			});
	}
	else if(type=='9'){
		$("#fileuploadFormColumnLable").val(dataForm.formColumnLable);
		$.ajax({
			url:'${pageContext.request.contextPath }/form/getFileuploadInfoByColumnId.action?columnId='+columnId,
			type:'post',
			cache: false,
			async: false,
			success: function (data) {
					showFileuploadInfoStep2(data);
				}
			});
	}
}

//保存控件信息
function saveWidget(){
	var formColumnId = $("#columnList").bootstrapTable("getSelections")[0].formColumnId;
	var widgetType = $("#formColumnGuiType").val();
	var dataForm = $("#columnList").bootstrapTable("getSelections")[0];
	var url="";
	if(widgetType=='1'){
		var sysFormTextbox = {};
		url = "${pageContext.request.contextPath }/form/saveTextBox.action";
		sysFormTextbox.textboxFormColumnId=formColumnId;
		sysFormTextbox.textboxId=$("#textboxId").val();
		sysFormTextbox.textboxCheckType=$("#textboxCheckType").val();
		sysFormTextbox.textboxCheckSelf=$("#textboxCheckSelf").val();
		sysFormTextbox.textboxDataFromType=$("#textboxDataFromType").val();
		sysFormTextbox.textboxDataFromValue=$("#textboxDataFromValue").val();
		sysFormTextbox.textboxCheckFun=$("#textboxCheckFun").val();
		sysFormTextbox.textboxInitFun=$("#textboxInitFun").val();
		sysFormTextbox.textboxValuechangeFun=$("#textboxValuechangeFun").val();
		sysFormTextbox.textboxClickFun=$("#textboxClickFun").val();
		sysFormTextbox.textboxEmptytext=$("#textboxEmptytext").val();
		if($("#textboxIsLink").prop('checked')){
			sysFormTextbox.textboxIsLink='Y';
		}else{
			sysFormTextbox.textboxIsLink='N';
		}
		if($("#textboxLinkIsForm").prop('checked')){
			sysFormTextbox.textboxLinkIsForm='Y';
		}else{
			sysFormTextbox.textboxLinkIsForm='N';
		}
		if(sysFormTextbox.textboxLinkIsForm){
			sysFormTextbox.textboxLinkForm=$("#tabDetailFormId").val();
		}else{
			sysFormTextbox.textboxLinkUrl=$("#textboxLinkUrl1").val();
		}
		sysFormTextbox.textboxLinkWinOpenType=$("input[name='textboxLinkWinOpenType']:checked").val();
		if($("input[name='textboxLinkWinOpenType']:checked").val()=='1'){
			sysFormTextbox.textboxLinkSuccessDeal=$("#textboxLinkSuccessDeal").val();
			sysFormTextbox.textboxLinkWinTitle=$("#textboxLinkWinTitle").val();
			sysFormTextbox.textboxLinkWinWidth=$("#textboxLinkWinWidth").val();
			sysFormTextbox.textboxLinkWinHeight=$("#textboxLinkWinHeight").val();
		}
		saveInfo(url,sysFormTextbox);
		showWidgetInfo(dataForm);
	}else if(widgetType=='2'){
		var sysFormCombobox = {};
		url = "${pageContext.request.contextPath }/form/saveCombobox.action";
		sysFormCombobox.comboboxFormColumnId=formColumnId;
		sysFormCombobox.comboboxId=$("#comboboxId").val();
		sysFormCombobox.comboboxCheckFun=$("#comboboxcheckFun").val();
		sysFormCombobox.comboboxCheckType=$("#comboboxCheckType").val();
		sysFormCombobox.comboboxCheckSelf=$("#comboboxCheckSelf").val();
		sysFormCombobox.comboboxInitFun=$("#comboboxInitFun").val();
		sysFormCombobox.comboboxValuechangeFun=$("#comboboxValuechangeFun").val();
		sysFormCombobox.comboboxClickFun=$("#comboboxClickFun").val();
		sysFormCombobox.comboboxDataFromType=$("#comboboxDataFromType").val();
		sysFormCombobox.comboboxDataFromValue=$("#comboboxDataFromValue").val();
		sysFormCombobox.comboboxGuiInitType=$("#comboboxGuiInitType").val();
		sysFormCombobox.comboboxGuiInitValue=$("#comboboxGuiInitValue2").val();
		sysFormCombobox.comboboxTextfield=$("#comboboxTextfield").val();
		sysFormCombobox.comboboxValuefield=$("#comboboxValuefield").val();
		sysFormCombobox.comboboxDatafield=$("#comboboxDatafield").val();
		sysFormCombobox.comboboxEmptytext=$("#comboboxEmptytext").val();
		if($("#comboboxAllowinput").prop('checked')){
			sysFormCombobox.comboboxAllowinput='Y';
		}else{
			sysFormCombobox.comboboxAllowinput='N';
		}
		if($("#comboboxMultiselect").prop('checked')){
			sysFormCombobox.comboboxMultiselect='Y';
		}else{
			sysFormCombobox.comboboxMultiselect='N';
		}
		sysFormCombobox.comboboxNullitemtext=$("#comboboxNullitemtext").val();
		sysFormCombobox.comboboxGuiInitExcsqlId=$("#comboboxGuiInitExcsqlId").val();
		sysFormCombobox.comboboxIstext=$("#comboboxIstext").val();	
		sysFormCombobox.comboboxDictSql=$("#comboboxDictSql").val();	
		if($("#comboboxIsSearch").prop('checked')){
			sysFormCombobox.comboboxIsSearch='Y';
		}else{
			sysFormCombobox.comboboxIsSearch='N';
		}
		if($("#comboboxShownullitem").prop('checked')){
			sysFormCombobox.comboboxShownullitem='Y';
		}else{
			sysFormCombobox.comboboxShownullitem='N';
		}
		saveInfo(url,sysFormCombobox);
		showWidgetInfo(dataForm);
	}else if(widgetType=='6'){
		var sysFormDatePicker = {};
		url = "${pageContext.request.contextPath }/form/saveDatePicker.action";
		sysFormDatePicker.datepickerFormColumnId=formColumnId;
		sysFormDatePicker.datepickerId=$("#datepickerId").val();
		sysFormDatePicker.datepickerCheckType=$("#datepickerCheckType").val();
		sysFormDatePicker.datepickerCheckSelf=$("#datepickerCheckSelf").val();
		sysFormDatePicker.datepickerInitFun=$("#datepickerInitFun").val();
		sysFormDatePicker.datepickerValuechangeFun=$("#datepickerValuechangeFun").val();
		sysFormDatePicker.datepickerClickFun=$("#datepickerClickFun").val();		
		sysFormDatePicker.datepickerDataFromType=$("#datepickerDataFromType").val();
		sysFormDatePicker.datepickerDataFromValue=$("#datepickerDataFromValue").val();		
		sysFormDatePicker.datepickerFormat=$("#datepickerFormat").val();		
		
		if($("#datepickerShowtime").prop('checked')){
			sysFormDatePicker.datepickerShowtime='Y';
		}else{
			sysFormDatePicker.datepickerShowtime='N';
		}
		
		if($("#datepickerShowokbutton").prop('checked')){
			sysFormDatePicker.datepickerShowokbutton='Y';
		}else{
			sysFormDatePicker.datepickerShowokbutton='N';
		}
		
		if($("#datepickerShowclearbutton").prop('checked')){
			sysFormDatePicker.datepickerShowclearbutton='Y';
		}else{
			sysFormDatePicker.datepickerShowclearbutton='N';
		}
		
		if($("#datepickerAllowinput").prop('checked')){
			sysFormDatePicker.datepickerAllowinput='Y';
		}else{
			sysFormDatePicker.datepickerAllowinput='N';
		}
		
		if($("#datepickerShowtodaybutton").prop('checked')){
			sysFormDatePicker.datepickerShowtodaybutton='Y';
		}else{
			sysFormDatePicker.datepickerShowtodaybutton='N';
		}
		sysFormDatePicker.datepickerDrawdateFun=$("#datepickerDrawdatefun").val();		
		saveInfo(url,sysFormDatePicker);
		showWidgetInfo(dataForm);
	}else if(widgetType=='8'){
			var sysFormTextarea = {};
			url = "${pageContext.request.contextPath }/form/saveTextarea.action";
			sysFormTextarea.textareaFormColumnId=formColumnId;
			sysFormTextarea.textareaId=$("#textareaId").val();
			sysFormTextarea.textareaCheckType=$("#textareaCheckType").val();
			if($("#textareaCheckType").val()=='fun'){
				sysFormTextarea.textareaCheckFun=$("#textareaCheckFun").val();
			}
			sysFormTextarea.textareaCheckSelf=$("#textareaCheckSelf").val();
			sysFormTextarea.textareaDataFromType=$("#textareaDataFromType").val();
			if($("#textareaDataFromType").val()=='initFun'){
				sysFormTextarea.textareaInitFun=$("#textareaInitFun").val();
			}
			sysFormTextarea.textareaDataFromValue=$("#textareaDataFromValue").val();
			sysFormTextarea.textareaValuechangeFun=$("#textareaValuechangeFun").val();
			sysFormTextarea.textareaClickFun=$("#textareaClickFun").val();
			sysFormTextarea.textareaEmptytext=$("#textareaEmptytext").val();
			saveInfo(url,sysFormTextarea);
			showWidgetInfo(dataForm);
		}else if(widgetType=='4'){
			var sysFormCheckboxlist = {};
			url = "${pageContext.request.contextPath }/form/saveCheckboxlist.action";
			sysFormCheckboxlist.checkboxlistFormColumnId=formColumnId;		
			sysFormCheckboxlist.checkboxlistId=$("#checkboxlistId").val();
			sysFormCheckboxlist.checkboxlistCheckFun=$("#checkboxlistcheckFun").val();
			sysFormCheckboxlist.checkboxlistCheckType=$("#checkboxlistCheckType").val();
			sysFormCheckboxlist.checkboxlistCheckSelf=$("#checkboxlistCheckSelf").val();
			sysFormCheckboxlist.checkboxlistInitFun=$("#checkboxlistInitFun").val();
			sysFormCheckboxlist.checkboxlistValuechangeFun=$("#checkboxlistValuechangeFun").val();
			sysFormCheckboxlist.checkboxlistClickFun=$("#checkboxlistClickFun").val();
			sysFormCheckboxlist.checkboxlistDataFromType=$("#checkboxlistDataFromType").val();
			sysFormCheckboxlist.checkboxlistDataFromValue=$("#checkboxlistDataFromValue").val();
			sysFormCheckboxlist.checkboxlistGuiInitType=$("#checkboxlistGuiInitType").val();
			sysFormCheckboxlist.checkboxlistGuiInitValue=$("#checkboxlistGuiInitValue2").val();
			sysFormCheckboxlist.checkboxlistTextfield=$("#checkboxlistTextfield").val();
			sysFormCheckboxlist.checkboxlistValuefield=$("#checkboxlistValuefield").val();
			sysFormCheckboxlist.checkboxlistDatafield=$("#checkboxlistDatafield").val();
			sysFormCheckboxlist.checkboxlistRepeatitems=$("#checkboxlistRepeatitems").val();
			sysFormCheckboxlist.checkboxlistRepeatlayout=$("#checkboxlistRepeatlayout").val();
			saveInfo(url,sysFormCheckboxlist);
			showWidgetInfo(dataForm);
		}else if(widgetType=='3'){
			var sysFormRadiolist = {};
			url = "${pageContext.request.contextPath }/form/saveRadiolist.action";
			sysFormRadiolist.radiolistFormColumnId=formColumnId;		
			sysFormRadiolist.radiolistId=$("#radiolistId").val();
			sysFormRadiolist.radiolistCheckFun=$("#radiolistcheckFun").val();
			sysFormRadiolist.radiolistCheckType=$("#radiolistCheckType").val();
			sysFormRadiolist.radiolistCheckSelf=$("#radiolistCheckSelf").val();
			sysFormRadiolist.radiolistInitFun=$("#radiolistInitFun").val();
			sysFormRadiolist.radiolistValuechangeFun=$("#radiolistValuechangeFun").val();
			sysFormRadiolist.radiolistClickFun=$("#radiolistClickFun").val();
			sysFormRadiolist.radiolistDataFromType=$("#radiolistDataFromType").val();
			sysFormRadiolist.radiolistDataFromValue=$("#radiolistDataFromValue").val();
			sysFormRadiolist.radiolistGuiInitType=$("#radiolistGuiInitType").val();
			sysFormRadiolist.radiolistGuiInitValue=$("#radiolistGuiInitValue2").val();
			sysFormRadiolist.radiolistTextfield=$("#radiolistTextfield").val();
			sysFormRadiolist.radiolistValuefield=$("#radiolistValuefield").val();
			sysFormRadiolist.radiolistDatafield=$("#radiolistDatafield").val();
			sysFormRadiolist.radiolistRepeatdirection=$("#radiolistRepeatdirection").val();
			sysFormRadiolist.radiolistRepeatitems=$("#radiolistRepeatitems").val();
			sysFormRadiolist.radiolistRepeatlayout=$("#radiolistRepeatlayout").val();
			saveInfo(url,sysFormRadiolist);
			showWidgetInfo(dataForm);
		}else if(widgetType=='5'){
			var sysFormCheckbox = {};
			url = "${pageContext.request.contextPath }/form/saveCheckbox.action";
			sysFormCheckbox.checkboxFormColumnId=formColumnId;
			sysFormCheckbox.checkboxId=$("#checkboxId").val();
			sysFormCheckbox.checkboxDataFromType=$("#checkboxDataFromType").val();
			if($("#checkboxDataFromType").val()=='initFun'){
				sysFormCheckbox.checkboxInitFun=$("#checkboxInitFun").val();
			}
			sysFormCheckbox.checkboxDataFromValue=$("#checkboxDataFromValue").val();
			sysFormCheckbox.checkboxValuechangeFun=$("#checkboxValuechangeFun").val();
			sysFormCheckbox.checkboxClickFun=$("#checkboxClickFun").val();
			sysFormCheckbox.checkboxShowName=$("#checkboxShowName").val();
			saveInfo(url,sysFormCheckbox);
			showWidgetInfo(dataForm);
		}else if(widgetType=='7'){
			var sysFormLookup = {};
			url = "${pageContext.request.contextPath }/form/saveLookup.action";
			sysFormLookup.lookupId=$("#lookupId").val();
			sysFormLookup.lookupFormColumnId=formColumnId;
			sysFormLookup.lookupCheckType=$("#lookupCheckType").val();
			sysFormLookup.lookupCheckSelf=$("#lookupCheckSelf").val();
			sysFormLookup.lookupCheckFun=$("#lookupCheckFun").val();
			
			sysFormLookup.lookupValuechangeFun=$("#lookupValuechangeFun").val();
			sysFormLookup.lookupClickFun=$("#lookupClickFun").val();
			sysFormLookup.lookupDataFromType=$("#lookupDataFromType").val();
			sysFormLookup.lookupDataFromValue=$("#lookupDataFromValue").val();
			if($("#lookupDataFromType").val()=='initFun'){
				sysFormLookup.lookupInitFun=$("#lookupInitFun").val();
			}
			sysFormLookup.lookupFormWinType=$("#lookupFormWinType").val();
			if($("#lookupFormWinType").val()=='1'){
				sysFormLookup.lookupWinTitle=$("#lookupWinTitle").val();
				sysFormLookup.lookupWinWidth=$("#lookupWinWidth").val();
				sysFormLookup.lookupWinHeight=$("#lookupWinHeight").val();
				sysFormLookup.lookupShowProperty=$("#lookupShowProperty").val();
				sysFormLookup.lookupValueProperty=$("#lookupValueProperty").val();
				sysFormLookup.lookupFormId=$("#lookupDetailFormId").val();
				sysFormLookup.lookupCustomDataback=$("#lookupCustomDataback").val();
				if($("#lookupCustomDataback").val()=='Y'){
					sysFormLookup.lookupCustomDatabackFun=$("#lookupCustomDatabackFun").val();
				}
				
			}else if($("#lookupFormWinType").val()=='2'){
				sysFormLookup.lookupWinTitle=$("#lookupWinTitle").val();
				sysFormLookup.lookupWinWidth=$("#lookupWinWidth").val();
				sysFormLookup.lookupWinHeight=$("#lookupWinHeight").val();
				sysFormLookup.lookupShowProperty=$("#lookupShowProperty").val();
				sysFormLookup.lookupValueProperty=$("#lookupValueProperty").val();
				sysFormLookup.lookupFormUrl=$("#lookupFormUrl").val();
			}else if($("#lookupFormWinType").val()=='3'){
				sysFormLookup.lookupButtonclickFun=$("#lookupButtonclickFun").val();
			}
			sysFormLookup.lookupDatabackValue=$("#lookupDatabackValue").val();
			sysFormLookup.lookupDatabackType=$("#lookupDatabackType").val();

			//sysFormLookup.lookupEmptytext=$("#lookupEmptytext").val();
			//sysFormLookup.lookupMuliselect=$("#lookupMuliselect").val();

			saveInfo(url,sysFormLookup);
			showWidgetInfo(dataForm);
		}else if(widgetType=='9'){
			var sysFormFileupload = {};
			url = "${pageContext.request.contextPath }/form/saveFileupload.action";
			sysFormFileupload.fileuploadFormColumnId = formColumnId;
			sysFormFileupload.fileuploadId = $("#fileuploadId").val();
			var arr = $("#fileuploadUploadFiletypes").val();
			var val = "";
			if(arr==null){
			}else{
				for(var i=0;i<arr.length;i++){
					val+=arr[i]+',';
				}
				val = val.substring(0,val.length-1);
			}
			sysFormFileupload.fileuploadUploadFiletypes=val;
			sysFormFileupload.fileuploadMaxFileCount=$("#fileuploadMaxFileCount").val();
			
			if($("#fileuploadAutoUpload").prop('checked')){
				sysFormFileupload.fileuploadAutoUpload='Y';
			}else{
				sysFormFileupload.fileuploadAutoUpload='N';
			}
			saveInfo(url,sysFormFileupload);
			showWidgetInfo(dataForm);
		}
	}
	

function checkInverse(){
	//$("#step2_part2 .bs-checkboxfind").find("input").prop()
}
function saveInfo(url,datas){
	$.ajax({
			url:url,
			type:'post',
			cache: false,
			contentType: 'application/json;charset=utf-8',
			data:JSON.stringify(datas),
			async: false,
			success: function (data) {
				if(data=="true"){  
                	layer.alert('保存成功', {
						  icon: 6,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
						  skin: 'layer-ext-moon' 
						})

                }else{  
                	layer.alert('保存失败', {
						  icon: 5,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
						  skin: 'layer-ext-moon' 
						})

                }  
				}
			});
}

//保存字段信息
function saveColumnInfo(){
	var column = {};
	var data = $("#columnList").bootstrapTable("getSelections")[0];
	url = "${pageContext.request.contextPath }/form/saveChartsColumn.action";
	if(data.formColumnGuiType == $("#formColumnGuiType").val()&&data.formColumnWidth == $("#formColumnWidth").val()&&data.formColumnHeight == $("#formColumnHeight").val()&&data.formColumnShowType == $("#formColumnShowType").val()&&data.formColumnSort == $("#formColumnSort").val()&&data.formColumnAlign == $("#formColumnAlign").val()&&data.formColumnRequired == $("#formColumnRequired").val()&&data.formColumnColSpan == $("#formColumnColSpan").val()&&data.formColumnMaxLength == $("#formColumnMaxLength").val()&&data.formColumnMinLength == $("#formColumnMinLength").val()&&data.formColumnColorCondition == $("#formColumnColorCondition").val()&&data.formColumnColor == $("#formColumnColor").val()&&data.formColumnType == $("#formColumnType").val()&&data.formColumnRowSpan == $("#formColumnRowSpan").val()&&data.formColumnTotal == $("#formColumnTotal").val()&&data.formColumnIsDev == $("#formColumnIsDev").val()){
		alert("未修改");
	}else{
		column.formColumnId =  data.formColumnId;
		column.formColumnFormDefId = data.formColumnFormDefId;
		column.formColumnEntityId = data.formColumnEntityId;
		column.formColumnColumnId = data.formColumnColumnId;
		column.formFieldTablename = data.formFieldTablename;
		column.formColumnUsName = data.formFieldTablename;
		column.formEntityTablename = data.formEntityTablename;
		column.chartsFormId = formId;
		column.formColumnLable = $("#formColumnLable").val();
		column.barChartsColumnType = $("#barChartsColumnType").val();
		column.barChartsColumnColor = $("#barChartsColumnColor").val();
		column.barChartsPieType = $("#barChartsPieType").val();
		column.pieOuterRingDiameter = $("#pieOuterRingDiameter").val();
		column.pieInnerRingDiameter = $("#pieInnerRingDiameter").val();
		saveInfo(url,column);		
		$("#columnList").bootstrapTable("refresh");
	}
	chooseMark = data.formColumnId;
}
//根据表单ID获取表单名
function getFormNameById(formDefId){
	var formDefName;
	$.ajax({
		url:'${pageContext.request.contextPath}/form/getFormNameById.action?formDefId='+formDefId,
		type:'post',
		cache: false,
		async: false,
		contentType: 'application/json;charset=utf-8',
		success: function (data) {
			formDefName = data.formDefName;
			}
		});
	return formDefName;
}

function getDictnameByCode(e){
	var DictName;
	$.ajax({
		url:'${pageContext.request.contextPath}/form/getDictnameByCode.action?dictTypeCode='+e,
		type:'post',
		cache: false,
		async: false,
		contentType: 'application/json;charset=utf-8',
		success: function (data) {
				DictName = data.dictTypeName;
			}
		});
	return DictName;
}

function query_tableStep4() {   
    $("#tableListStep4").bootstrapTable({  
        url : '${pageContext.request.contextPath }/form/queryFilterColumn.action?formId='+formId, 
		height:'800',
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
            title : '操作',  
            field : 'queryColumnId', // 字段  
            align: 'center',
            valign: 'middle',
            width:50,
            formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<div style=\"position:relative\"><input type=\"form-control\" name=\"queryColumnId\" style=\"width:0px;padding:0px;border:none\" readonly=true data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"操作\" value=\""+value+"\"/>"+
					   "<input type=\"hidden\" data-title=\"关联字段ID\" value=\""+row.gridColumnId+"\"/>"+
            		   "<i class=\"glyphicon glyphicon-remove\" style=\"position: absolute;opacity: 0.5;right: 5px;top: 5px;cursor: pointer;\" onclick=\"removeStep4(this)\"></i><div>" ;
        	}
		},{
			
            title : '实体表名',  
            field : 'formEntityTablename', // 字段  
            align: 'center',
            valign: 'middle',
            width:150,
            formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<div style=\"position:relative\"><input class=\"form-control\" name=\"formEntityTablename\" style=\"padding:0 24px 0 12px;\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"实体表名\" value=\""+value+"\"/>" ;
        	}
        },{  
            title : '字段名称',  
            field : 'formFieldTablename', // 字段  
            align: 'center',
            valign: 'middle',
            width:175,
            formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<div style=\"position:relative\"><input class=\"form-control\" name=\"formFieldTablename\" style=\"padding:0 24px 0 12px;\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"字段名称\" value=\""+value+"\"/>" ;
        	}
		 },{  
            title : '字段显示名称',  
            field : 'gridColumnLable', // 字段  
            align: 'center',
            valign: 'middle',
            width:175,
            formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<div style=\"position:relative\"><input class=\"form-control\" name=\"gridColumnLable\" style=\"padding:0 24px 0 12px;\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"字段显示名称\" value=\""+value+"\"/>" ;
        	}
        }, {  
            title : '控件类型',  
            field : 'formColumnGuiType',  
            align : 'center',  
            valign : 'middle', 
			width:200,
			formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<select id=\"formColumnGuiType"+index+"\" class=\"form-control\" name=\"formColumnGuiType\" DictName=\"SYS_FORM_GUI_TYPE\" data-title=\"控件类型\" value=\""+value+"\"/>" ;
        	}
        }, {  
            title : '查询规则',  
            field : 'gridColumnFilterRule',  
            align : 'center',  
            valign : 'middle',  
            width:200,
            formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<select id=\"gridColumnFilterRule"+index+"\" class=\"form-control\"  name=\"gridColumnFilterRule\" DictName=\"SYS_FORM_WHERE_RULE\" dataField=\"\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"查询规则\" value=\""+value+"\"></selcct>" ;
        	}
        }, {  
            title : '显示宽度',  
            field : 'gridColumnWidth',  
            align : 'center',  
            valign : 'middle', 
            width:200,
            formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<input class=\"form-control\"  name=\"gridColumnWidth\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"显示宽度\" value=\""+value+"\"/>";
        	}
		 }, {  
            title : '跨字段数',  
            field : 'gridColumnColSpan',  
            align : 'center',  
            valign : 'middle', 
            width:200,
            formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<input class=\"form-control\"  name=\"gridColumnColSpan\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"跨字段数\" value=\""+value+"\"/>";
        	}
        }, {  
            title : '是否区间查询',  
            field : 'gridColumnIsIntervais',  
            align : 'center',  
            valign : 'middle', 
            width:200,
            formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<select id=\"gridColumnIsIntervais"+index+"\" class=\"form-control\"  name=\"gridColumnIsIntervais\" DictName=\"SYS_COMMON_YES_NO\" dataField=\"\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"是否区间查询\" value=\""+value+"\"/>" ;
        	}
        }, {  
            title : '显示顺序',  
            field : 'formColumnSort',  
            align : 'center',  
            valign : 'middle',
            width:150,
            formatter: function (value, row, index) {
            	if(value==undefined){
		        		value = "";
		        	}
            	return "<input class=\"form-control\"  name=\"formColumnSort\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"显示顺序\" value=\""+value+"\"/>" ;
        	}
        }],
        onClickRow: function (row, $element) {
	                curRow = row;
	                
	            },
	            onLoadSuccess: function (aa, bb, cc) {
	                addListSelectStep4();
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

</script>
</html>