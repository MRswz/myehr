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
%><html>
<head>
    <style type="text/css" href="./css/bootstrap.min.css"></style>
    <link rel="stylesheet" href="cssjs/animate.css" type="text/css"></link>
	<link rel="stylesheet" href="cssjs/jquery.steps.css" type="text/css"></link>
	<script type="text/javascript" src="cssjs/jquery.steps.min.js"></script>
	<script type="text/javascript" src="cssjs/formCardBuildStep.js"></script>
	<script type="text/javascript" src="cssjs/formTreeBuildStep3.js"></script>
	<script type="text/javascript" src="cssjs/formTreeBuildStep2.js"></script>
	<style type="text/css">
	.wrapper{width:98%;margin:0 auto;padding-top:10px}
	.row{margin:0;}
	.wizard > .content > .body{padding: 0.5% 2.5%;}
	.row.cell>div lable{font-weight:600;width:140px}
	.fixed-table-container thead th .th-inner, .fixed-table-container tbody td .th-inner{font-weight:600}
	fieldset{height:100%}
	.ztree li a{width:89%}
	#step2_part2 .fixed-table-body {height:100%}
	.wizard > .content > .body ul > li{list-style:none}
	#step2_part2 .clearfix{display:none}
	.row.cell>div{min-height:30px;margin:10px 0 0 0;}
	.wizard > .steps > ul > li{width:25%}
	#form-p-5,#form-p-4,#form-p-3,#form-p-2,#form-p-1{width:100%;height:97%}
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
                                                <div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" style="display:none">
                                                    <div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
                                                        <lable style="float:left">是否移动端表单</lable>                      
                                                        <select id="isApp" title="是否移动端表单" styleType="select" name="isApp"  class="form-control" style="width:200px;" textField="dictName" valueField="dictID" DictName="SYS_COMMON_YES_NO" dataField="dicts"></select>
                                                    </div>
                                                </div>
                                                <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12" style = "height:60px">
                                                    <div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">
                                                        <lable style="float:left">权限SQL</lable>
                                                        <textarea id="powerSql" name="powerSql" rows="3" class="form-control" style="width:50%;resize:none">
                                                        </textarea>
                                                    </div>
                                                </div>
                                                <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12" style = "height:60px">
                                                    <div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">
                                                        <lable style="float:left">排序SQL</lable>
                                                        <textarea id="orderSql" name="orderSql" rows="3" class="form-control" style="width:50%;resize:none">
                                                        </textarea>
                                                    </div>
                                                </div>
                                                <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12" style = "height:60px">
                                                    <div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">
                                                        <lable style="float:left">表单描述</lable>
                                                        <textarea id="formDefDesc" name="formDefDesc" rows="3" class="form-control" style="width:50%;resize:none">
                                                        </textarea>
                                                    </div>
                                                </div>
                                                <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12" style = "height:60px">
                                                    <div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">
                                                        <lable style="float:left">前置初始函数</lable>
                                                        <textarea id="formDefInitQzJs" name="formDefInitQzJs" rows="3" class="form-control" style="width:50%;resize:none">
                                                        </textarea>
                                                    </div>
                                                </div>
                                                <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12" style = "height:60px">
                                                    <div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">
                                                        <lable style="float:left">前置初始SQL</lable>
                                                        <textarea id="formDefInitQzSql" name="formDefInitQzSql" rows="3" class="form-control" style="width:50%;resize:none">
                                                        </textarea>
                                                    </div>
                                                </div>
                                            </div>
                                        
                                        	<div id="form2">
	                                          	<h3 style="display:block;font-size:18;text-align:left;height: 36px;line-height: 33px;padding-left: 16px;color: #666;cursor: pointer;">布局扩展信息</h3>
	                                            <div class="row cell"  >
	                                                <div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
														<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
															<lable style="float:left">是否懒加载</lable>
															<input id="formIsLazy" name="formIsLazy" type="checkbox" class="checkbox"/>
														</div>
													</div>
													<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
														<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
															<lable style="float:left">是否显示节点图标</lable>
															<input id="formShowTreeIcon" name="formShowTreeIcon" type="checkbox" checked class="checkbox"/>
														</div>
													</div>
													<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
														<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
															<lable style="float:left">是否列表显示数据</lable>
															<input id="formResultAsTree" name="formResultAsTree" type="checkbox" checked class="checkbox"/>
														</div>
													</div>
													<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
														<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
															<lable style="float:left">是否显示树形线条</lable>
															<input id="formShowTreeLines" name="formShowTreeLines" type="checkbox" checked class="checkbox"/>
														</div>
													</div>
													<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
														<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
															<lable style="float:left">单击节点展开收缩</lable>
															<input id="formExpandOnClick" name="formExpandOnClick" type="checkbox" checked  class="checkbox"/>
														</div>
													</div>
													<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
														<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
															<lable style="float:left">双击节点展开收缩</lable>
															<input id="formExpandOnDbclick" name="formExpandOnDbclick" type="checkbox" checked  class="checkbox"/>
														</div>
													</div>
													<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
														<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
															<lable style="float:left">仅树结构</lable>
															<input id="formAutoCheckParent" name="formAutoCheckParent" type="checkbox" class="checkbox"/>
														</div>
													</div>
													<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
														<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
															<lable style="float:left">允许选中节点</lable>
															<input id="formAllowSelect" name="formAllowSelect" type="checkbox" checked  class="checkbox"/>
														</div>
													</div>
													<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
														<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
															<lable style="float:left">允许单选框选中节点</lable>
															<input id="formShowCheckbox" name="formShowCheckbox" type="checkbox" class="checkbox"/>
														</div>
													</div>
													<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
														<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
															<lable style="float:left">是否显示父节点单选框</lable>
															<input id="formShowFolderCheckbox" name="formShowFolderCheckbox" type="checkbox" class="checkbox"/>
														</div>
													</div>
													<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
														<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
															<lable style="float:left">是否联动选择父子节点</lable>
															<input id="formCheckRecursive" name="formCheckRecursive" type="checkbox" class="checkbox"/>
														</div>
													</div>
													<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
														<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
															<lable style="float:left">组织机构图</lable>
															<input id="formShowTreeOnly" name="formShowTreeOnly" type="checkbox" class="checkbox" />
														</div>
													</div>
													<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
														<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
															<lable style="float:left">是否显示标题</lable>
															<input id="formShowTitle" name="formShowTitle" type="checkbox" checked class="checkbox" />
														</div>
													</div>
													<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
														<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
															<lable style="float:left">是否显示搜索</lable>
															<input id="formShowFilter" name="formShowFilter" type="checkbox" class="checkbox" />
														</div>
													</div>
													<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
														<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
															<lable style="float:left">是否显示人员容器</lable>
															<input id="formShowEmpContainer" name="formShowEmpContainer" type="checkbox" class="checkbox" />
														</div>
													</div>
													<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
														<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
															<lable style="float:left">加载后展开</lable>
															<input id="formExpandOnLoad" name="formExpandOnLoad" type="number" placeholder="展开到几级" value="2" class="form-control" style="width:200px;" />
														</div>
													</div>
	                                            </div>
	                                        </div>
                                        
	                                        <div>
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
                    
                    <h1>逻辑配置</h1>
                    <fieldset>
                        <div class="row">
                            <form id="form_step2" name="form_step2" class="col-sm-12" >
                                <div class="container-fluid" style="">
                                    <div style="margin-top:5px;">
										<input id="SYS_ICON.formTreeFormId" name="formTreeFormId" type="hidden" class="form-control"  style="width:200px;"/>
										<div style="border:1px solid #ccc; position:relative;border-radius:5px;margin-bottom:10px">
											<h3 style=" background:#FFF;color:blue; display:block;font-size:12;position:absolute; left:10px; top:-27px;text-align:center"></h3>
											<table style="width:100%;table-layout:fixed;" class="cbs-table"  >
												<tr style="height:65px">
													<td style="padding-left:10px;"  width="200"  ><lable><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"数据来源")%>：</lable></td>
													<td style="padding-left:10px;"  align="left"  >						<select id="SYS_ICON.formTreeType" onchange="changeeSlect2(this)"  title="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"数据来源")%>" name="formTreeType"  class="form-control" emptyText="请选择..."  required="true"  style="width:200px;" textField="dictName" valueField="dictID" DictName="SYS_TREE_LOAD_TYPE" nullItemText="" dataField="dicts"></select></td>
													<td style="padding-left:10px;"  width="200"  ><lable><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"默认初始值")%>：</lable></td>
													<td style="padding-left:10px;"  align="left"  ><input id="SYS_ICON.formTreeValue" name="formTreeValue" type="text" class="form-control"  vtype="illegalChar;maxLength:null;minLength:null;" style="width:200px;"/></td>
												</tr>
												<tr style="height:65px" id="tr1">
													<td style="padding-left:10px;"  width="200"  ><lable><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"选中树方案")%>：</lable></td>
													<td style="padding-left:10px;"  align="left" >
														<input id="SYS_ICON.formTreeSolutionName" name="formTreeSolutionName" type="text" class="form-control"  vtype="illegalChar;maxLength:null;minLength:null;" style="width:200px;position:absolute"/><i style="position:relative;left:180px;top:5px" onclick="choseScheme()" class="glyphicon glyphicon-plus"></i>
														<input id="SYS_ICON.formTreeSolutionId" name="formTreeSolutionId" type="hidden" class="form-control"  vtype="illegalChar;maxLength:null;minLength:null;" style="width:200px;position:absolute"/>
													</td>
												</tr>
												<tr>
													<td style="padding-left:10px;"  width="200"  ><lable><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"初始化方案")%>：</lable></td>
											        <td colspan="3" align="left">
											        	<textarea  id="SYS_ICON.formTreeInitFun" name="formTreeInitFun"  class="form-control"  rows="5"  style="width:400;margin-bottom:5px"> </textarea>
											   		</td>
										      	</tr>
										      	<tr>
													<td style="padding-left:10px;"  width="200"  ><lable><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"加载事件方案")%>：</lable></td>
											        <td colspan="3" align="left">
											        	<textarea  id="SYS_ICON.formTreeLoadFun" name="formTreeLoadFun"  class="form-control"  rows="5"  style="width:400;margin-bottom:5px"> </textarea>
											   		</td>
										      	</tr>
										      	<tr>
													<td style="padding-left:10px;"  width="200"  ><lable><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"节点点击事件方案")%>：</lable></td>
											        <td colspan="3" align="left">
											        	<textarea  id="SYS_ICON.formTreeNodeClickFun" name="formTreeNodeClickFun"  class="form-control"  rows="5"  style="width:400;margin-bottom:5px"> </textarea>
											   		</td>
										      	</tr>
												<tr>
													<td style="padding-left:10px;"  width="200"  ><lable><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"自定义事件方案")%>：</lable></td>
											        <td colspan="3" align="left">
											        	<textarea  id="SYS_ICON.formTreeCustomFun" name="formTreeCustomFun"  class="form-control"  rows="5"  style="width:400;margin-bottom:5px"> </textarea>
											   		</td>
										      	</tr>
											</table>
										</div>
										
										<div style="margin:0 auto; display:inline-block;height: 35px;">
											<div style="margin-right:10px;display:inline-block">
											    <input type="button" id="save_formemp_emp_edit"  class="btn btn-primary" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"保存")%> onclick="save_formemp_emp_edit_click_1881()"/>
											</div>
											<div style="margin-right:10px;display:inline-block">
											    <input type="button" id="closeemp_emp_edit"  class="btn btn-primary" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"关闭")%> onclick="closex_1881()"/>
											</div>
										</div>
									</div>
	                            </div>
	                        </form>
	                    </div>   
                    </fieldset>
                    
                    <h1>节点配置</h1>
                    <fieldset>
                        <div class="row">
                            <form id="form_step3" name="form_step3" class="col-sm-12" >
                                <div class="container-fluid" style="">
                                    <div style="margin-top:5px;">
                                        <div class="input-group">
								    		<div id="grid_org_list_filter">
									        	<table class="cbs-table" style="margin-bottom:5px">
									            	<tr>
									            	</tr>
									        	</table>
								    		</div>
										</div>
										<div class="BTNGROUP_1041" style="margin:0 auto; display:inline-block;height: 35px;">
											<div style="margin-right:10px;display:inline-block">
											    <input type="button" id="editorg_list"  class="btn btn-primary" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"增加")%> onclick="addScheme()"/>
											</div>
											<div style="margin-right:10px;display:inline-block">
											    <input type="button" id="editorg_list"  class="btn btn-primary" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"修改")%> onclick="editScheme()"/>
											</div>
											<div style="margin-right:10px;display:inline-block">
											    <input type="button" id="editorg_list"  class="btn btn-primary" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"删除")%> onclick="deleteScheme()"/>
											</div>
										</div>
										<div id="grid_org_list_filter" style="float:right;display:inline-block;position:relative;">
											<input id="FILTER_1041" name="FILTER_1041" placeholder="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"字典类编码")%>,<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"字典类名称")%>" style="padding: 6px 30px 6px 10px;" title="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"字典类编码")%>,<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"字典类名称")%>" type="text" class="form-control" oninput="grid_org_list_fun11()" />
											<i class="icon-search" style="position: absolute;right: 12px;top: 2px;cursor: pointer;"></i>
										</div>
	                                </div>
	                                <table id="scheme_list_List">
									</table>
	                            </div>
	                        </form>
	                    </div>   
                    </fieldset>
                    
                    <h1>按钮配置</h1>
                    <fieldset>
                        <div class="row">
                            <div id="form_step4" name="form_step4" class="col-sm-12" >
                                <div class="container-fluid" style="">
                                    <div style="margin-top:5px;">
                                        <div style="margin:10px 0;height:100%">
											<div class="BTNGROUP_55" style="margin:0 auto; display:block;height: 35px;">
												<div style="margin-right:10px;display:inline-block">
												    <input type="button" id="addColumn"  class="btn btn-primary" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"增加")%> onclick="addRow()"/>
												</div>
												<div style="margin-right:10px;display:inline-block">
												    <input type="button" id="save_list"  class="btn btn-warning" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"保存")%> onclick="saveData()"/>
												</div>
											</div>
											<table id="tableList">
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
var formId='${param.formDefId}';
var formTreeId = "0";
$(document).ready(function () {
    $("#form").steps({
        bodyTag: "fieldset",
        onStepChanging: function (event, currentIndex, newIndex) {
            if (currentIndex == 0) {//离开基础配置
                return saveFormInfo();
            }
            if (currentIndex == 1) {//离开逻辑配置
            	querys_1041();
                return true;
            }
            if (currentIndex == 2) {//离开节点配置
            	query_table();
                return true;
            }
            
            // Start validation; Prevent going forward if false
            return true;
            
           
        },
        onStepChanged: function (event, currentIndex, priorIndex) {
        },
        onFinishing: function (event, currentIndex) {
            var form = $(this);


            // Start validation; Prevent form submission if false
            return saveFormInfo();
        },
        onFinished: function (event, currentIndex) {
            var form = $(this);
            setForm(formId);//修改完表单信息加入缓存
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
		if(type=="true"){
			myehr_initSelectMore(parame,dataField);
		}else{
			myehr_initSelect(parame,dataField);
		}
	}	
	
	
	
    formInit();//表单类型初始化
    
    initDictStep2();
	document.getElementById("SYS_ICON.formTreeFormId").value="${param.formDefId}";
	var formId = '${param.formDefId}';
	if(formId!='' && formId!=null){
		_initData(formId);
	}
	
    jsParamInit();
    
});
var parame={
		id:'',
		value:"N",
		width: "100px",  
		height:"45px",
		url:'${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode.action?userId=${sessionScope.userid}',
		jsonParam:{},
		chang:function (e){
			var aaa = e;
		}
	}
function initDictStep2(obj){
	var classes = $("#form_step2 select");
	
	for(var i=0;i<classes.length;i++){
		if(obj==undefined){
		}else{
			if(classes[i].id=='SYS_ICON.buttonAddExcType'){
				classes[i].options.length=0;
			}else{
				continue;
			}
		}
		if(classes[i].id=='SYS_ICON.buttonAddExcType'){
			parame.jsonParam.dictTypeCode=buttonAddExcTypeDict;
		}else{
			parame.jsonParam.dictTypeCode=$(classes[i]).attr('DictName');
		}
		
		parame.id=classes[i].id;
		var type=$(classes[i]).attr('multiSelect');
		var dataField=$(classes[i]).attr('dataField');
		parame.placeholder="";
		parame.jsonParam.nullItemText=$(classes[i]).attr('nullItemText');
		
		if(type=="true"){
			myehr_initSelectMore(parame,dataField);
		}else{
			myehr_initSelect(parame,dataField);
		}
	}
}

function _initData(pkId){
	var formId = pkId;
	var _form = getForm("#form_step2");
	var _Type = getType("#form_step2");
	$.ajax({
		url:'${pageContext.request.contextPath }/tree/getTreeFormStepTwo.action?formId='+formId,
		type:'post',
		//data: JSON.stringify(_param),
		cache: false,
		contentType: 'application/json;charset=utf-8',
		success: function (text) {
			if(text !=null){
				var object = text;
				for(var key in object){
					if(_form[key]!=null&&_form[key]!="undefined"){
						if(_Type[key]=="dateTime"){
							date = new Date(object[key]).Format("yyyy-MM-dd hh:mm:ss");
							document.getElementById(_form[key]).value=formatDatebox(date,_form[key]);
						}else{
							document.getElementById(_form[key]).value=object[key];
						}
					}
					if(_Type[key]=="checkbox"){
						if(object[key]=='Y' ){
							document.getElementById(_form[key]).checked=true;
						}
					}
				};
				
			} else {
				_initAfter();
			}
		},
		error: function (jqXHR, textStatus, errorThrown) {
		}
	});
}

function formInit(){
	var param = {};
	param.formId = '${param.formDefId}';
	$.ajax({
		url:'${pageContext.request.contextPath }/form/loadTreeFormInfo.action',
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
				if(data.param.formDefIsProcess==null||data.param.formDefIsProcess==""){
					$("#formDefIsProcess").val("N");
				}else{
					$("#formDefIsProcess").val(data.param.formDefIsProcess);
				}
				if(data.param.formAuthorityIsControl==null||data.param.formAuthorityIsControl==""){
					$("#formAuthorityIsControl").val("N");	
				}else{
					$("#formAuthorityIsControl").val(data.param.formAuthorityIsControl);
				}
				if(data.param.isApp==null||data.param.isApp==""){
					$("#isApp").val("N");
				}else{
					$("#isApp").val(data.param.isApp);
				}
				
				$("#powerSql").val(data.param.powerSql);
				$("#orderSql").val(data.param.orderSql);
				$("#formDefDesc").val(data.param.formDefDesc);
				$("#formDefInitQzJs").val(data.param.formDefInitQzJs);
				$("#formDefInitQzSql").val(data.param.formDefInitQzSql);
				if(data.formTree!=null){
					formTreeId = data.formTree.formTreeId+"";
					if(data.formTree.formIsLazy=="true"){
						$("#formIsLazy").prop('checked',true);
					}
					if(data.formTree.formShowTreeIcon=="false"){
						$("#formShowTreeIcon").prop('checked',false);
					}
					if(data.formTree.formResultAsTree=="false"){
						$("#formResultAsTree").prop('checked',false);
					}
					if(data.formTree.formShowTreeLines=="false"){
						$("#formShowTreeLines").prop('checked',false);
					}
					if(data.formTree.formExpandOnClick=="false"){
						$("#formExpandOnClick").prop('checked',false);
					}
					if(data.formTree.formExpandOnDbclick=="false"){
						$("#formExpandOnDbclick").prop('checked',false);
					}
					if(data.formTree.formAutoCheckParent=="true"){
						$("#formAutoCheckParent").prop('checked',true);
					}
					if(data.formTree.formAllowSelect=="false"){
						$("#formAllowSelect").prop('checked',false);
					}
					if(data.formTree.formShowCheckbox=="true"){
						$("#formShowCheckbox").prop('checked',true);
					}
					if(data.formTree.formShowFolderCheckbox=="true"){
						$("#formShowFolderCheckbox").prop('checked',true);
					}
					if(data.formTree.formCheckRecursive=="true"){
						$("#formCheckRecursive").prop('checked',true);
					}
					if(data.formTree.formShowTreeOnly=="true"){
						$("#formShowTreeOnly").prop('checked',true);
					}
					if(data.formTree.formShowTitle=="false"){
						$("#formShowTitle").prop('checked',false);
					}
					if(data.formTree.formShowFilter=="true"){
						$("#formShowFilter").prop('checked',true);
					}
					if(data.formTree.formShowEmpContainer=="true"){
						$("#formShowEmpContainer").prop('checked',true);
					}
					
					$("#formExpandOnLoad").val(data.formTree.formExpandOnLoad);
	
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
		param.formDefEntitySql = "null";
		param.formDefFolderId = $("#formDefFolderId").val();
		param.formDefId = $("#formDefId").val();
		param.formDefInitQzJs = $("#formDefInitQzJs").val();
		param.formDefInitQzSql = $("#formDefInitQzSql").val();	
		param.formDefIsProcess = $("#formDefIsProcess").val();
		param.formDefLayoutType = $("#formDefLayoutType").val();
		param.formDefName = $("#formDefName").val();
		param.formDefSql = "null";
		param.isApp = $("#isApp").val();
		param.orderSql = $("#orderSql").val();
		param.powerSql = $("#powerSql").val();
	
	
	
	var sysFormconfigTree = {};
	sysFormconfigTree.formAllowSelect = $("#formAllowSelect").prop('checked');
		sysFormconfigTree.formAutoCheckParent = $("#formAutoCheckParent").prop('checked');
		sysFormconfigTree.formCheckRecursive = $("#formCheckRecursive").prop('checked');
		sysFormconfigTree.formExpandOnClick = $("#formExpandOnClick").prop('checked');
		sysFormconfigTree.formExpandOnDbclick = $("#formExpandOnDbclick").prop('checked');	if($("#formExpandOnLoad").val()!=null&&$("#formExpandOnLoad").val()!=""){
		sysFormconfigTree.formExpandOnLoad = $("#formExpandOnLoad").val();
	}else{
		sysFormconfigTree.formExpandOnLoad = '2';
	}
		sysFormconfigTree.formIsLazy = $("#formIsLazy").prop('checked');
		sysFormconfigTree.formResultAsTree = $("#formResultAsTree").prop('checked');
		sysFormconfigTree.formShowCheckbox = $("#formShowCheckbox").prop('checked');
		sysFormconfigTree.formShowEmpContainer = $("#formShowEmpContainer").prop('checked');
		sysFormconfigTree.formShowFilter = $("#formShowFilter").prop('checked');
		sysFormconfigTree.formShowFolderCheckbox = $("#formShowFolderCheckbox").prop('checked');
		sysFormconfigTree.formShowTitle = $("#formShowTitle").prop('checked');
		sysFormconfigTree.formShowTreeIcon = $("#formShowTreeIcon").prop('checked');
		sysFormconfigTree.formShowTreeLines = $("#formShowTreeLines").prop('checked');
		sysFormconfigTree.formShowTreeOnly = $("#formShowTreeOnly").prop('checked');
		sysFormconfigTree.formTreeFormId = '${param.formDefId}';
		sysFormconfigTree.formTreeId = formTreeId;
	
	
	var signstr = JSON.stringify(sysFormconfigTree);
	var rule ='\"' ;
	var regS = new RegExp(rule,'g');
	
	var rule2 =':' ;
	var regS2 = new RegExp(rule2,'g');
	signstr = signstr.replace(regS, '');
	signstr = signstr.replace(regS2, '=');
	console.log(JSON.stringify(sysFormconfigTree));
	var sign = md5(signstr);	
	if(updataForm(param)){
		$.ajax({
			url:'${pageContext.request.contextPath }/form/updataTreeFormParamx.action?sign='+sign,
			type:'POST',
			data: JSON.stringify(sysFormconfigTree),
		    cache: false,
		    contentType: 'application/json;charset=utf-8',
			async: false,
			success: function (data) {
					if(data==1){
						//alert("基础配置完成");
						flag = true;
					}
				}
			});
	}
	return flag;
}

function updataForm(param){
	
	var signstr = JSON.stringify(param);
	var rule ='\"' ;
	var regS = new RegExp(rule,'g');
	
	var rule2 =':' ;
	var regS2 = new RegExp(rule2,'g');
	signstr = signstr.replace(regS, '');
	signstr = signstr.replace(regS2, '=');
	console.log(JSON.stringify(param));
	var sign1 = md5(signstr);
	var flag = false;
	$.ajax({
		url:'${pageContext.request.contextPath }/form/updataGridFormParam1.action?sign='+sign1,
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

function jsParamInit(){
	$("#jsList").bootstrapTable({  
        url : '${pageContext.request.contextPath }/form/findJsParamList.action?paramTypeValue='+${param.formDefId}, 
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
            		   "<i class=\"glyphicon glyphicon-remove\" style=\"position: absolute;opacity: 0.5;right: 38px;top: -6px;cursor: pointer;\" onclick=\"removeJs(this)\"></i><div>" ;
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

function removeJs(obj){
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

function saveInfo(url,datas){
	$.ajax({
			url:url,
			type:'post',
			cache: false,
			contentType: 'application/json;charset=utf-8',
			data:JSON.stringify(datas),
			async: false,
			success: function (data) {
					
				}
			});
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

function querys_step2() { 
    $("#formList_step2").bootstrapTable({  
        url : "/myehr/form/findformListByformId.action?mstId="+mstTabId,  
        height : '700',  
        undefinedText : '-',  
        pagination : false, // 分页  
        striped : true, // 是否显示行间隔色  
        //queryParams : queryParams,  
        cache : false, // 是否使用缓存  
        pageList : [ 5, 10, 20 ],  
        toolbar : "#toolbar",// 指定工具栏  
        clickToSelect: true,
        sidePagination : "server", // 服务端处理分页  
        columns : [
        {  
            title : '操作',  
            field : 'tabDetailId', // 字段  
            align: 'center',
            valign: 'middle',
            width:50,
            formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<div style=\"position:relative\"><input type=\"form-control\" name=\"formWhereId\" style=\"width:0px;padding:0px;border:none;\" readonly=true data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"操作\" value=\""+value+"\"/>"+
            		   "<i class=\"glyphicon glyphicon-remove\" style=\"position: absolute;opacity: 0.5;right: 5px;top: 5px;cursor: pointer;\" onclick=\"removeForm_step2(this)\"></i><div>" ;
        	}
		},
        {  
            title : '是否动态表单',  
            field : 'tabDetailIsForm', // 字段  
            align : 'center', // 对齐方式（左 中 右）  
            valign : 'middle', //  
            sortable : true ,
            formatter: function (value, row, index) {
                    	return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:60px;\" name=\"tabDetailIsForm\" data-type=\"select\" data-title=\"是否动态表单\" data-source=\"/myehr/dict/searchSysDictEntryTypeCode1.action?deleteMark=SYS_COMMON_YES_NO\">"+value+"</a>";
                	} 
        }, {  
            title : '动态表单',  
            field : 'tabDetailFormId',  
            align : 'center',  
            valign : 'middle',  
            sortable : true  ,
            formatter: function (value, row, index) {
            		if(value==undefined){
            			value='';
            		}else{
            			value = getFormNameById(value);
            		}
            			
                    	return "<a  class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"tabDetailFormId\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"动态表单\">"+value+"</a>";			                    	
                	}
        }, {  
            title : '表单url',  
            field : 'tabDetailFormUrl',  
            align : 'center',  
            valign : 'middle',  
            sortable : true  ,
            formatter: function (value, row, index) {
                    	return "<a  class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"tabDetailFormUrl\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"表单URL\">"+value+"</a>";
                    	
                	}
        }, {  
            title : '列表标题',  
            field : 'tabDetailFormTitle',  
            align : 'center',  
            valign : 'middle',  
            sortable : true  ,
            formatter: function (value, row, index) {
                    	return "<a  class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"tabDetailFormTitle\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"列表标题\">"+value+"</a>";
                    	
                	}
        }, {  
            title : '排序',  
            field : 'tabDetailSort',  
            align : 'center',  
            valign : 'middle',  
            sortable : true  ,
            formatter: function (value, row, index) {
                    	return "<a  class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"tabDetailSort\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"排序\">"+value+"</a>";
                    	
                	}
            }],
        	onClickRow: function (row, $element) {
	                curRow = row;
	            },
	        onLoadSuccess: function (aa, bb, cc) {
		        	$("#formList a").editable({
	                    disabled: true,
	                    emptytext: "-",
	                    url: function (params) {
	                        var sName = $(this).attr("name");
	                        curRow[sName] = params.value;
	                    },
	                    type: 'text'
	                });
	            },
        responseHandler : function(res) {  
            return {  
                total : res.total,  
                rows : res.rows  
            };  
        }, 
    });
}

//添加 
//form/form/mstTab/addDetail.jsp
function addForm_step2(){
	var url = '/myehr/jsp/form/formcreate/tabs/addList.jsp?formId='+formId+'&mstId='+mstTabId;
	layer.open({
		type: 2,
		title:'增加列表',
		shadeClose: true,
		shade: 0.8,
		//offset: ['0px', '0px'],
		maxmin:true,
		area: ['1000', '500'],
		content: url,
		success:function(layero,index){
		},
		end:function(){
			$('#formList_step2').bootstrapTable('refresh'); 
		}
	});
}

	//编辑
//form/form/mstTab/addDetail.jsp
function editForm_step2(){
}

function choseScheme(){
	var url = '/myehr/jsp/form/tree/treeSolutionManagerSelect.jsp';
	layer.open({
		type: 2,
		title:'<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"选择方案")%>',
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
		}
	});

}	
	
//删除
function removeForm_step2(obj){
	var data = $(obj).parent().parent().parent().find("input").eq(0).val();
	layer.msg('确定要删除此表单', {
		  time: 0 //不自动关闭
		  ,btn: ['确定', '再想想']
		  ,success: function(layero){
				layero.find('.layui-layer-btn').css('text-align', 'center');
			}
		  ,yes: function(index){
			layer.close(index);
				$.ajax({
					url:'/myehr/form/delectMstTab.action?tabDetailId='+data,
					type:'post',
					cache: false,
					contentType: 'application/json;charset=utf-8',
					success: function (text) {
						if(text!='1'){
							layer.alert('删除失败', {
								  icon: 5,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
								  skin: 'layer-ext-moon' 
								})
						} else {
							layer.alert('删除成功', {
								  icon: 6,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
								  skin: 'layer-ext-moon' 
								})
							$('#formList_step2').bootstrapTable('refresh'); 
						}
					},
					error: function (jqXHR, textStatus, errorThrown) {
						alert(jqXHR.responseText);
					}
				});
		  }
	})
}
function getdata_1881(buttonId,formId){
	var param = {};
	var data = {buttonId:buttonId,formId:formId,param:{},paramsMap:{}};
	$.map($('[name=form_step2]').serializeArray(), function(item, index){
		var property =item['name'];
		var value = item['value'];
		param[property] = value;
	});
	data.param = param;
	return data;
}
function getForm(formId){
	var object=[];
	$(formId).find("input").each(function(){
		var xxx = this.id.split(".")[1];
		if(xxx!=undefined){
			var xx = xxx.split("_");
			var arr = [];
			var id = "";
			for(var i=0;i<xx.length;i++){
				if(i<xx.length-1){
					id = id+xx[i]+"_";
				}else{
					id = id+xx[i];
				}
			}
			object[id]=this.id;
		}
	})
	$(formId).find("textarea").each(function(){
		var xxx = this.id.split(".")[1];
		if(xxx!=undefined){
			var xx = xxx.split("_");
			var arr = [];
			var id = "";
			for(var i=0;i<xx.length;i++){
				if(i<xx.length-1){
					id = id+xx[i]+"_";
				}else{
					id = id+xx[i];
				}
			}
			object[id]=this.id;
		}
	})
	$(formId).find("select").each(function(){
		var xxx = this.id.split(".")[1];
		if(xxx!=undefined){
			var xx = xxx.split("_");
			var arr = [];
			var id = "";
			for(var i=0;i<xx.length;i++){
				if(i<xx.length-1){
					id = id+xx[i]+"_";
				}else{
					id = id+xx[i];
				}
			}
			object[id]=this.id;
		}
	})
	return object;
}

function getType(formId){
	var object=[];
		$(formId).find("input").each(function(){
			var vtype = $(this).attr('format');
			var type = $(this).attr('type');
			if(vtype!=undefined){
				var xxx = this.id.split(".")[1];
					var xx = xxx.split("_");
					var arr = [];
					var id = "";
					for(var i=0;i<xx.length;i++){
						if(i<xx.length-1){
							id = id+xx[i]+"_";
						}else{
							id = id+xx[i];
						}
					}
				object[id]="dateTime";
			}
			if(type!=undefined){
				if(type=='checkbox'){
					var xxx = this.id.split(".")[1];
					var xx = xxx.split("_");
					var arr = [];
					var id = "";
					for(var i=0;i<xx.length;i++){
						if(i<xx.length-1){
							id = id+xx[i]+"_";
						}else{
							id = id+xx[i];
						}
					}
					object[id]="checkbox";
				}
			}
		})
	return object;
}


function save_formemp_emp_edit_click_1881(){
	var paramsMap = {'userId' : '${sessionScope.userid}'};

	var _param = {};
	_param.formId='${param.formDefId}';
	_param.buttonId=2803;
	_param = getdata_1881(_param.buttonId,formId);
	_param.paramsMap = paramsMap;
	$.ajax({
		url:'${pageContext.request.contextPath }/tree/saveTreeFormStepTwo.action',
		type:'post',
		data: JSON.stringify(_param),
		cache: false,
		contentType: 'application/json;charset=utf-8',
		success: function (text) {
			if(text[0]==0){
				alert("<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"保存失败！")%>");
			}else if(text[0]=='error'){
				alert("<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"操作异常")%>");
			}else {
				alert("<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"操作成功")%>");
				closex_1881()
			}
		}
	});
}
function grid_org_list_fun(pageReqeust){
	var _filterdata={};
	
	var searchValue = document.getElementById("FILTER_1041").value;
	_filterdata={searchValue:searchValue};
	var userId = '${sessionScope.userid}';
	var paramsMap = {userId:userId};
	var requestParam={};
	var formId = '${param.formDefId}';
	requestParam = {formId:formId};
	
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.formId=formId;
	pageReqeust.isView=null;
	return JSON.stringify(pageReqeust);
}
function querys_1041() {
    $("#scheme_list_List").bootstrapTable({
        url :'${pageContext.request.contextPath }/tree/queryTreeNodeTypeList.action',
        contentType: 'application/json;charset=utf-8',
        dataType:'json',
        method:'post',
        height : '578',
        undefinedText : '-',
        pagination : true,
        striped : true,
        queryParams : grid_org_list_fun,
        cache : false,
        pageSize : 10, 
        pageList : [10,20,50,10000], 
        toolbar : "#toolbar",
        clickToSelect: true,
        sidePagination : "server",
        columns : [{
            field : 'state',
            checkbox : true,
            align : 'center',
            valign : 'middle'
        },
        {
            title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"序号")%>',
            field : 'defaultXH',
            align : 'center',
            visible : true,
            valign : 'left',
            formatter: function (value, row, index) {
                if(value==undefined){
                    value=index+1;
                }
                return "<a style=\"font-size:14px;text-decoration:none;color:black;width:50px;\" name=\"defaultXH\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"序号\">"+value+"</a>";
            }
        },
        {
            title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"树节点Id")%>',
            field : 'treeNodeTypeId',
            align : 'center',
            visible : false,
            valign : 'left',
            formatter: function (value, row, index) {
                if(value==undefined){
                    value='-';
                }
                return "<a  class=\"eli w100\" style=\"font-size:14px;text-decoration:none;color:black;width:200px;\" name=\"treeNodeTypeId\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"树节点Id\">"+value+"</a>";
            }
        },
        {
            title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"节点类型编码")%>',
            field : 'treeNodeTypeCode',
            align : 'center',
            visible : true,
            valign : 'left',
            formatter: function (value, row, index) {
                if(value==undefined){
                    value='-';
                }
                return "<a  class=\"eli w100\" style=\"font-size:14px;color:black;width:150px;\" name=\"treeNodeTypeCode\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"节点类型编码\">"+value+"</a>";
            }
        },
		{
            title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"节点类型图标")%>',
            field : 'treeNodeTypeIcon',
            align : 'center',
            visible : true,
            valign : 'left',
            formatter: function (value, row, index) {
                if(value==undefined){
                    value='-';
                }
                return "<a  class=\"eli w100\" style=\"font-size:14px;color:black;width:150px;\" name=\"treeNodeTypeIcon\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"节点类型图标\">"+value+"</a>";
            }
        },
		{
            title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"标题")%>',
            field : 'treeNodeTypeTittle',
            align : 'center',
            visible : true,
            valign : 'left',
            formatter: function (value, row, index) {
                if(value==undefined){
                    value='-';
                }
                return "<a  class=\"eli w100\" style=\"font-size:14px;color:black;width:150px;\" name=\"treeNodeTypeTittle\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"标题\">"+value+"</a>";
            }
        },
        {
            title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"操作方案")%>',
            field : 'treeNodeTypeExcType',
            align : 'center',
            visible : true,
            valign : 'left',
            formatter: function (value, row, index) {
                if(value==undefined){
                    value='-';
                }
                return "<a class=\"eli w100\" style=\"font-size:14px;text-decoration:none;color:black;width:60px;\" name=\"treeNodeTypeExcType\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"操作方案\" data-source=\"${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode1.action?deleteMark=SYS_TREE_NODE_EXC_TYPE\"></a>";
            }
        },
		{
            title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"关联表单")%>',
            field : 'treeNodeTypeFormName',
            align : 'center',
            visible : true,
            valign : 'left',
            formatter: function (value, row, index) {
                if(value==undefined){
                    value='-';
                }
                return "<a  class=\"eli w100\" style=\"font-size:14px;text-decoration:none;color:black;width:200px;\" name=\"treeNodeTypeFormName\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"关联表单<\">"+value+"</a>";
            }
        },
        {
            title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"URL")%>',
            field : 'treeNodeTypeUrl',
            align : 'center',
            visible : true,
            valign : 'left',
            formatter: function (value, row, index) {
                if(value==undefined){
                    value='-';
                }
                return "<a  class=\"eli w50\" style=\"font-size:14px;text-decoration:none;color:black;width:200px;\" name=\"treeNodeTypeUrl\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"URL\">"+value+"</a>";
            }
        }
        ],
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
        }
    });
    window.operateEvents = {  
       
	};
}

function addScheme(){
	var formDefId = '${param.formDefId}';
	var url='/myehr/jsp/form/tree/addTreeNodeType.jsp?formDefId='+formDefId;
	
	parent.layer.open({
		type: 2,
		title:'<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"增加节点类型")%>',
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
			    refresh_org_list();
		}
	});
}

function editScheme(){
	var selects = $("#scheme_list_List").bootstrapTable('getSelections');;
	if(selects!=null && selects.length>0){
		select = selects[0];
	}else {
		alert('<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"请选择一行数据")%>');return ;
	}

	var url='/myehr/jsp/form/tree/addTreeNodeType.jsp?treeNodeTypeId='+select.treeNodeTypeId;
	
	parent.layer.open({
		type: 2,
		title:'<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"修改节点类型")%>',
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
			refresh_org_list();
		}
	});
}

function deleteScheme(){
	var selects = $("#scheme_list_List").bootstrapTable('getSelections');
	var selectId ="";
	if(selects!=null && selects.length>0){
		for(var i=0;i<selects.length;i++){
			selectId+=selects[i].treeNodeTypeId+",";
		}
		
	}else {
		alert('<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"请选择一行数据")%>');return ;
	}

	var url='${pageContext.request.contextPath }/tree/deleteTreeNodeTypeById.action?treeNodeTypeId='+selectId;
	$.ajax({
			url:url,
			type:'post',
			//data: JSON.stringify(_param),
			cache: false,
			contentType: 'application/json;charset=utf-8',
			success: function (text) {
				if(text[0]==0){
					alert("<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"保存失败！")%>");
				}else if(text[0]=='error'){
					alert("<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"操作异常")%>");
				}else {
					alert("<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"操作成功")%>");
				}
				refresh_org_list();
			},
			error: function (jqXHR, textStatus, errorThrown) {
			}
		});
}

function query_table() {   
    $("#tableList").bootstrapTable({  
        url : '${pageContext.request.contextPath }/form/queryFormButton.action?formId='+formId, 
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
            field : 'formButtonId', // 字段  
            align: 'center',
            valign: 'middle',
            width:75,
            formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<div style=\"position:relative\"><input type=\"form-control\" name=\"formButtonId\" style=\"width:0px;padding:0px\" readonly=true data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"操作\" value=\""+value+"\"/>"+
						"<i class=\"glyphicon glyphicon-edit\" style=\"position: absolute;opacity: 0.5;right: 25px;top: 5px;cursor: pointer;\" onclick=\"editButton(this)\"></i>"+
						"<i class=\"glyphicon glyphicon-remove\" style=\"position: absolute;opacity: 0.5;right: 5px;top: 5px;cursor: pointer;\" onclick=\"remove(this)\"></i><div>" ;
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
            	return "<select class=\"form-control\" id=\"formButtonType"+index+"\" name=\"formButtonType\" DictName=\"SYS_FORM_BUTTON_TYPE\" dataField=\"\" data-type=\"text\" data-pk=\""+row.Id+"\"  data-title=\"按钮类型名称\" value=\""+value+"\"/>" ;
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
            width:200,
            formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<input class=\"form-control\"  name=\"HZESQL\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"后置触发\" value=\""+value+"\"/>";
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
            width:200,
            formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<input class=\"form-control\"  name=\"QZESQL\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"前置触发\" value=\""+value+"\"/>";
        	}
        }],
        onClickRow: function (row, $element) {
	                curRow = row;
	                
	            },
	            onLoadSuccess: function (aa, bb, cc) {
	                addListSelect();
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
/** 刷新页面 */ 
function refresh_org_list() { 
    $('#scheme_list_List').bootstrapTable('refresh'); 
}
function editButton(obj){
	var selects = $("#tableList").bootstrapTable("getSelections");
	var formButtonId = $(obj).parent().parent().parent().find("input").eq(0).val();
	var formButtonType = $(obj).parent().parent().parent().find("select").eq(0).val();
	var url;
	var title;
	if(formButtonType=="add"){
		url='/myehr/jsp/form/formcreate/button/addbutton_form.jsp?formButtonId='+formButtonId+'&formId='+'${param.formDefId}';
		title='设置【新增】按钮扩张属性';
	}else if(formButtonType=="edit"){
		url='/myehr/jsp/form/formcreate/button/updatebutton_form.jsp?formButtonId='+formButtonId+'&formId='+'${param.formDefId}';
		title='设置【修改】按钮扩张属性';
	}else if(formButtonType=="remove"){
		url='/myehr/jsp/form/formcreate/button/removebutton_form.jsp?formButtonId='+formButtonId+'&formId='+'${param.formDefId}';
		title='设置【删除】按钮扩张属性';
	}else if(formButtonType=="save"){
		url='/myehr/jsp/form/formcreate/button/savebutton_form.jsp?formButtonId='+formButtonId+'&formId='+'${param.formDefId}';
		title='设置【保存】按钮扩张属性';
	}else if(formButtonType=="close"){
		return;
	}else if(formButtonType=="calculate"){
		url='/myehr/jsp/form/formcreate/button/calculate_form.jsp?formButtonId='+formButtonId+'&formId='+'${param.formDefId}';
		title='设置【计算】按钮扩张属性';
	}else if(formButtonType=="import"){
		url='/myehr/jsp/form/formcreate/button/importButton.jsp?formButtonId='+formButtonId+'&formId='+'${param.formDefId}';
		title='设置【导入】按钮扩张属性';
	}else if(formButtonType=="select" || formButtonType=="other"){
		url='/myehr/jsp/form/formcreate/button/otherExtButton.jsp?formButtonId='+formButtonId+'&formId='+'${param.formDefId}';
		title='设置【其他】按钮扩张属性';
	}
	layer.open({
		type: 2,
		title:title,
		shadeClose: true,
		shade: 0.8,
		maxmin:true,
		zIndex:9999,
		area: ['950px', '500px'],
		content: url,
		success:function(layero,index){
		},
		end:function(){
		}
	});
}
function remove(obj){
	var data = {};
	data.formButtonId = $(obj).parent().parent().parent().find("input").eq(0).val();
	$.ajax({
		url:'${pageContext.request.contextPath }/form/deleteFormButton.action',
		type:'post',
		cache: false,
		data:JSON.stringify(data),
		contentType: 'application/json;charset=utf-8',
		async: false,
		success: function (data) {
			$('#tableList').bootstrapTable('refresh');
		}
	});
}
//将对象元素转换成字符串以作比较  
function obj2key(obj, keys){  
    var n = keys.length,  
        key = [];  
    while(n--){  
        key.push(obj[keys[n]]);  
    }  
    return key.join('|');  
}

function saveData(){
	var saveDate = getEntityData();
	for(var i=0;i<saveDate.length;i++){
		for(var j=0;j<saveDate.length;j++){
			if(i==j){
				continue;
			}else{
				if(saveDate[i].formButtonCode==saveDate[j].formButtonCode){
					alert('按钮编码重复');
					return;
				}
			}
		}
	}
	$.ajax({
		url:'${pageContext.request.contextPath }/form/saveFormButton.action?formId='+formId,
		type:'post',
		cache: false,
		contentType: 'application/json;charset=utf-8',
		data:JSON.stringify(saveDate),
		async: false,
		success: function (data) {
			if(data[0]=="0"){
				$('#tableList').bootstrapTable('refresh');
			}
		}
	});
	
}

function addRow(insertIndex){
	rowsNum++;
    $('#tableList').bootstrapTable('insertRow',{index:rowsNum,row:{formButtonSort:rowsNum}});
	addListSelect();
}
function getEntityData(){
	var i = 0;
	var data = [];
	$("#tableList>tbody").find("tr").each(function(){
		if($(this).find("select").eq(0).val()!=""){
			var table = {};
			table.formButtonId=$(this).find("input").eq(0).val();
			table.formButtonType=$(this).find("select").eq(0).val();
			table.formButtonName=$(this).find("input").eq(1).val();
			table.formButtonCode=$(this).find("input").eq(2).val();
			table.formButtonSort=$(this).find("input").eq(3).val();
			table.formButtonIcon=$(this).find("input").eq(5).val();
			table.formButtonWidth=$(this).find("input").eq(6).val();
			table.formButtonHeight=$(this).find("input").eq(7).val();
			table.formButtonCss=$(this).find("input").eq(8).val();
			table.formButtonWarningInfo=$(this).find("input").eq(9).val();
			table.formButtonCheckFun=$(this).find("input").eq(10).val();
			
			data[i] = table;
			i++;
		}
	})
	return data;
}

function addListSelect(){
	var classes = [];
	if(''=='APP'){
		$("input").each(function(){
			if($(this).attr('dataField') != undefined){
				classes.push($(this)[0]);
			}
		})
	}else{
		classes = $("#form_step4 select");
	}
	for(var i=0;i<classes.length;i++){
		parame.id=classes[i].id;
		var type=$(classes[i]).attr('multiSelect');
		var dataField=$(classes[i]).attr('dataField');
		dataField = dataField+"|"+${param.formDefId};
		parame.placeholder="";
		parame.value=$(classes[i]).attr('value');
		parame.jsonParam.dictTypeCode=$(classes[i]).attr('DictName');
		parame.jsonParam.nullItemText=$(classes[i]).attr('nullItemText');
		parame.dictData = "SYS_FORM_BUTTON_TYPE,select,close,other";
		if(type=="true"){
			myehr_initSelectMore(parame,dataField);
		}else{
			myehr_initSelect(parame,dataField);
		}
	}
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
</script>
</html>