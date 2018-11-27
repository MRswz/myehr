<%@ page language="java" import="java.util.*" import="com.myehr.common.util.LangUtil" pageEncoding="UTF-8"%>
<%@ include file="/common/common.jsp" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<body>
		<div class="container-fluid">
			<ul class="nav nav-tabs disable" id="myTab">
				<li class="active"><a href="#Tab_1">表单基本信息</a></li>
				<li class=""><a href="#Tab_2" >多Tab关联表单</a></li>
				<li ><a href="#Tab_3" >待定</a></li>
				<li ><a href="#Tab_4" >待定</a></li>
				<li ><a href="#Tab_5" >待定</a></li>
			</ul>
			<div class="tab-content">
				<div class="tab-pane active" id="Tab_1">
					<form id="form_1210" name="form_1210" >
						<div class="container-fluid" style="overflow-y:auto;">
							<div style="margin-top:5px;">
								<div style="margin:10px 0;">
								<h3 style=" background:#FFF; display:block;font-size:18;text-align:left;height: 36px;line-height: 33px;padding-left: 16px;color: #666;cursor: pointer;"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"基础信息")%></h3>
									<div class="row cell" id="form1" >
										<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
											<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
												<lable style="float:left"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"表单编码")%>: </lable>
												<input id="formDefCode" name="formDefCode" type="text" class="form-control" style="width:200px;" value="${param.fieldChinaName}"/>
												<input id="formDefType" name="formDefType" type="hidden" class="form-control"  required="true"  style="width:200px;"/>
												<input id="formDefId" name="formDefId" type="hidden" class="form-control"  required="true"  style="width:200px;"/>
												<input id="formDefFolderId" name="formDefFolderId" type="hidden" class="form-control"  required="true"  style="width:200px;"/>
											</div>
										</div>
										<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
											<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
												<lable style="float:left"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"表单名称")%>: </lable>
												<input id="formDefName" name="formDefName" type="text" class="form-control" style="width:200px;" value="${param.controlType}"/>
											</div>
										</div>
										
										<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
											<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
												<lable style="float:left"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"表单布局类型")%>: </lable>						
												<select id="formDefLayoutType" title="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"表单布局类型")%>" styleType="select" name="formDefLayoutType"  class="form-control" style="width:200px;" textField="dictName" valueField="dictID" DictName="SYS_FORM_LAYOUT" dataField="dicts">
												</select>
											</div>
										</div>
										<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
											<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
												<lable style="float:left"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"是否流程表单")%>: </lable>						
												<select id="formDefIsProcess" title="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"是否流程表单")%>" styleType="select" name="formDefIsProcess"  class="form-control" style="width:200px;" textField="dictName" valueField="dictID" DictName="SYS_COMMON_YES_NO" dataField="dicts"></select>
											</div>
										</div>
										<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
											<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
												<lable style="float:left"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"是否不受权限控制")%>: </lable>						
												<select id="formAuthorityIsControl" title="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"是否不受权限控制")%>" styleType="select" name="formAuthorityIsControl"  class="form-control" style="width:200px;" textField="dictName" valueField="dictID" DictName="SYS_COMMON_YES_NO" dataField="dicts"></select>
											</div>
										</div>
								      	
										<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12" style = "height:80px">
											<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
												<lable style="float:left"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"表单描述")%>: </lable>
												<textarea id="formDefDesc" name="formDefDesc" class="form-control" style="width:640px;">
												</textarea>
											</div>
										</div>
										<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12" style = "height:80px">
											<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
												<lable style="float:left"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"前置初始函数")%>: </lable>
												<textarea id="formDefInitQzJs" name="formDefInitQzJs" class="form-control" style="width:640px;">
												</textarea>
											</div>
										</div>
									</div>
									
									<!-- <h3 style=" background:#FFF; display:block;font-size:18;text-align:left;height: 36px;line-height: 33px;padding-left: 16px;color: #666;cursor: pointer;">扩展信息</h3> -->
									<div class="row cell" id="form2" >
										<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
											<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
												<lable style="float:left"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"每行显示列数")%>: </lable>
												<input id="formDefRowCount" name="formDefRowCount" type="text" class="form-control" style="width:200px;" value="${param.controlType}"/>
											</div>
										</div>
										<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
											<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
												<lable style="float:left"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"lable宽度")%>: </lable>
												<input id="formLableWidth" name="formLableWidth" type="text" class="form-control" style="width:200px;" value="${param.controlType}"/>
											</div>
										</div>
									</div>
									
									<!-- <h3 style=" background:#FFF; display:block;font-size:18;text-align:left;height: 36px;line-height: 33px;padding-left: 16px;color: #666;cursor: pointer;">扩展信息</h3> -->
									<div class="row cell" id="form3" style="display:none"></div>
									
									<div class="row cell" id="form10" style="display:none"></div>
									
									<div class="row cell" id="form4" style="display:none"></div>
									
									<div class="row cell" id="form4_1" style="display:none"></div>
									
									<div class="row cell" id="form4_2" style="display:none"></div>
									
									<div class="row cell" id="form5" style="display:none"></div>
									
									<div class="row cell" id="form6" style="display:none"></div>
									
								</div>	
								<div id="button_step1" class="BTNGROUP" style="margin:0 auto; display:inline-block;height: 35px;">
									<div style="margin-right:10px;display:inline-block">
									    <input type="button" id="saveemp_emp_add"  class="btn btn-primary" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"下一步")%> onclick="next()"/>
									</div>
								</div>
							</div>
						</div>
					</form>
				</div>
				<div class="tab-pane" id="Tab_2">
					<form id="form_step2" name="form_step2" >
						<div class="container-fluid" style="height:100%;overflow-y:hidden;margin-top:12px">
							<div>
								<div class="BTNGROUP" style="margin:0 auto; display:inline-block;height: 35px;">
									<div style="margin-right:10px;display:inline-block">
									    <input type="button" id="add_step2"  class="btn btn-primary" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"添加表单")%> onclick="addForm_step2()"/>
									</div>
									<div style="margin-right:10px;display:inline-block">
									    <input type="button" id="remove_step2"  class="btn btn-primary" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"删除表单")%> onclick="removeForm_step2()"/>
									</div>
								</div>
							</div>
							<input id="formDefId_step2" name="formDefId_step2" type="hidden" class="form-control"/>
							<table id="formList">
							</table>
						</div>	
					</form>
				</div>
				<div class="tab-pane" id="Tab_3">
				</div>
				<div class="tab-pane" id="Tab_4">
				</div>
				<div class="tab-pane" id="Tab_5">
				</div>
			</div>
		</div>
<script>
	var formId_step2 ="";	
	var mstId_step2 ="";
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
			};
			
			$("#formDefLayoutType").change(function(){
				if($("#formDefLayoutType").val()=="7"){
					$("#form2").css("display","none");
					$("#form6").css("display","inline-block");
				}else{
				}
			});
				
			$(function () { 
				var save = '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"保存")%>';
				if(${param.update})	{
					//加载表单信息
					_formId_1210 = '${param.formDefId}';
					_initData(null);
					$("#button_step1").html("");
					/*$("#button_step1").html("<div style=\"margin-right:10px;display:inline-block\">\n"+
										    "<input type=\"button\" id=\"saveemp_emp_add\"  class=\"btn btn-primary\" value=\""+save+"\" onclick=\"next()\"/>\n"+
											"</div>\n");*/
					formId_step2 = '${param.formDefId}';
					var mst = getTabsInfo(formId_step2);
					if(mst!=null){
						mstId_step2 = mst.mstTabId;
					}
					loadStep_2();
				}	
				
				$('.form_date1').datetimepicker({ 
				 language:'zh-CN',  
				 format:"yyyy-mm-dd",  
				 weekStart: 1,  
				 todayBtn:  1,  
				 autoclose: 1,  
				 todayHighlight: 1,  
				 startView: 2,  
				 minView: 2,  
				 forceParse: 0,  
				 pickerPosition: "bottom-left"  
				});  
				$('.form_date2').datetimepicker({ 
				 language:  'zh-CN',  
				 format:"yyyy-mm-dd hh:ii",  
				 weekStart: 1,  
				 todayBtn:  1,  
				 autoclose: 1,  
				 todayHighlight: 1,  
				 startView: 2,  
				 minView: 0,  
				 forceParse: 0,  
				 pickerPosition: "bottom-left"  
				});  
				$('.form_date3').datetimepicker({ 
				 language:  'zh-CN',  
				 format:"hh:ii",  
				 weekStart: 1,  
				 todayBtn:  1,  
				 autoclose: 1,  
				 todayHighlight: 1,  
				 startView: 0,  
				 minView: 2,  
				 forceParse: 0,  
				 pickerPosition: "bottom-left"  
				});  
				$('.form_date4').datetimepicker({ 
				 language:  'zh-CN',  
				 format:"yyyy-mm-dd",  
				 weekStart: 1,  
				 todayBtn:  1,  
				 autoclose: 1,  
				 todayHighlight: 1,  
				 startView: 4,  
				 minView: 4,  
				 forceParse: 0,  
				 pickerPosition: "bottom-left"  
				});
				$('#myTab a').click(function (e) {
							e.preventDefault();
							$(this).tab('show');
				}); 
			});
			
			function querys_step2() { 
			    $("#formList").bootstrapTable({  
			        url : "${pageContext.request.contextPath }/form/findformListByformId.action?mstId="+mstId_step2,  
			        height : '700',  
			        undefinedText : '-',  
			        pagination : false, // 分页  
			        striped : true, // 是否显示行间隔色  
			        //queryParams : queryParams,  
			        cache : false, // 是否使用缓存  
			        pageList : [ 5, 10, 20 ],  
			        toolbar : "#toolbar",// 指定工具栏  
			        showColumns : true, // 显示隐藏列  
			        clickToSelect: true,
			        showRefresh : true, // 显示刷新按钮  
			        sidePagination : "server", // 服务端处理分页  
			        columns : [{
		                field : 'state',
		                checkbox : true,
		                align : 'center',
		                valign : 'middle'
		            },
					{  
					    title : '主键',  
					    field : 'tabDetailId', // 字段  
					    align : 'center', // 对齐方式（左 中 右）  
					    valign : 'middle',
					    visible: false
					},
			        {  
			            title : '是否动态表单',  
			            field : 'tabDetailIsForm', // 字段  
			            align : 'center', // 对齐方式（左 中 右）  
			            valign : 'middle', //  
			            sortable : true ,
			            formatter: function (value, row, index) {
			                    	return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:60px;\" name=\"tabDetailIsForm\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"是否动态表单\" data-source=\"/myehr/dict/searchSysDictEntryTypeCode1.action?deleteMark=SYS_COMMON_YES_NO\"></a></a>";
			                	} 
			        }, {  
			            title : '动态表单',  
			            field : 'tabDetailFormId',  
			            align : 'center',  
			            valign : 'middle',  
			            sortable : true  ,
			            formatter: function (value, row, index) {
			            			value = getFormInfo(value).formDefName;
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
			
			function getdata_1210(buttonId,formId){
						var param = {};
						var data = {buttonId:buttonId,formId:formId,param:{},paramsMap:{}};
						$.map($('[name=form_'+formId+']').serializeArray(), function(item, index){
							var property =item['name'];
							var value = item['value'];
							param[property] = value;
						});
						data.param = param;
					return data;
			}
			function formatDatebox(value,key) {
					var type = document.getElementById(key).getAttribute("dateType");
					type = type.substr(type.length-1,1);
				    var year=value.substr(0,4);
				    var index1=value.indexOf("-");
				    var index2=value.lastIndexOf("-");
				    var d1=parseInt(index2)-(parseInt(index1)+1);
				    var month=value.substr((parseInt(index1)+1),d1);
				    var kg=value.indexOf(" ");
				    d2=parseInt(kg)-parseInt(index2);
				    var day=value.substr(parseInt(index2)+1,d2);
				    var mh=value.indexOf(":");
				    d3=parseInt(mh)-(parseInt(kg)+1);
				    var hh=value.substr(parseInt(kg)+1,d3);
				    var mh2=value.lastIndexOf(":");
				    d4=parseInt(mh2)-(parseInt(mh)+1);
				    var mm=value.substr(parseInt(mh)+1,d4);
				    if(mm!=0){
				    	mm = parseInt(mm)+6;
				    	if(parseInt(mm)<10){
				    		mm = "0"+mm;
				    	}else if(parseInt(mm)==60){
				    		mm="00";
				    		hh=parseInt(hh)+1;
				    		}else if(parseInt(mm)>60){
				    			mm=parseInt(mm)-60;
				    			mm="0"+mm;
				    			hh=parseInt(hh)+1;
				    			}
				    }
				    var mh2=value.lastIndexOf(":");
				    var ss=value.substr(parseInt(mh2)+1);
				    if(type == 1){
					        return year+"-"+month+"-"+day;
				    }else if(type == 2){
					        return year+"-"+month+"-"+day+" "+hh+":"+mm;
				    }else if(type == 3){
					        return hh+":"+mm;
				    }else if(type == 4){
					        return year;
				    }else if(type == 5){
					        return year+month;
				    }
				}
				
				var _formId_1210='1210';
				window.onload=function(){
						var classes = [];
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
					if('${param.formDefId}'!=''){
						_initData(null);
					}else{
						$("#formDefFolderId").val("${param.formDefFolderId}");
					}
				}
			
				function saveemp_emp_add_click_1210(){
					var property = $("#PROPERTY").val();
					var fieldId = '${param.fieldId}';
					var dictCode = $("#DICT_CODE").val();
					var constantDictEntry = $("#DICT_ENTRY").val();
					var constantDictEntryValue = $("#DICT_ENTRY_VALUE").val()
					var dictEntry = $("#SEARCH_SQL_DICT").val();
					var dictEntryValue = $("#SEARCH_SQL_VALUE").val();
					$.ajax({
						url:'${pageContext.request.contextPath }/FieldList/updateSelectInit.action?property='+property+'&fieldId='+fieldId+'&dictCode='+dictCode+'&dictEntry='+dictEntry+'&dictEntryValue='+dictEntryValue+'&constantDictEntry='+constantDictEntry+'&constantDictEntryValue='+constantDictEntryValue,
						type: 'POST',  
					    cache: false,
					    contentType: 'application/json;charset=utf-8',
					    success: function (datas) {  
					    	if(datas==0){
					    		alert("更新成功");
					    	}else if(datas==1){
					    		alert("");
					    	}
					    }  
					})
				}		
				function next(){
					var param = {};
					param.formDefCode=$("#formDefCode").val();
					param.formDefName=$("#formDefName").val();
					param.formDefLayoutType=$("#formDefLayoutType").val();
					param.formDefIsProcess=$("#formDefIsProcess").val();
					param.formAuthorityIsControl=$("#formAuthorityIsControl").val();
					param.formDefDesc=$("#formDefDesc").val();
					param.formDefInitQzJs=$("#formDefInitQzJs").val();
					param.formDefFolderId=$("#formDefFolderId").val();
					$.ajax({
						url:'${pageContext.request.contextPath }/form/saveFormParam.action',
						type:'post',
					    data: JSON.stringify(param),
					    cache: false,
					    contentType: 'application/json;charset=utf-8',
					    success: function (datas) {  
					    	if(datas==0){
					    		alert("更新异常");
					    	}else {
					    		var formId = datas[0];
					    		var mstId = datas[1];
					    		formId_step2 = formId;
					    		mstId_step2 = mstId;
					    		loadStep_2(formId,mstId);
					    	}
					    }  
					})
				}
			
				function _initData(){
					var text = getFormInfo(_formId_1210);
					$("#formDefCode").val(text.formDefCode);
					$("#formDefType").val(text.formDefType);
					$("#formDefId").val(text.formDefId);
					$("#formDefFolderId").val(text.formDefFolderId);
					$("#formDefName").val(text.formDefName);
					$("#formDefLayoutType").val(text.formDefLayoutType);
					$("#formDefIsProcess").val(text.formDefIsProcess);
					$("#formAuthorityIsControl").val(text.formAuthorityIsControl);
					$("#formDefDesc").val(text.formDefDesc);
					if(text.formDefLayoutType==7){
						$("#form2").css("display","none");
						$("#form6").css("display","inline-block");
					}
					$("#form_1210").find('input,select,textarea').each(function(){
						$(this).attr('disabled',"true");
						$(this).css('border','none');
						if($(this).attr('styletype')=='dateTime'){
							$(this).next().css('display',"none");
							$(this).next().next().css('display',"none");
							var width = $(this).width()+90;
							$(this).css('width',width+'px');
						}
					});
					
				}
				
				function getFormInfo(_formId){
					var _param = {};
					_param = {requestParam:{},formId:_formId};
					var data = {};
					$.ajax({
						url:'${pageContext.request.contextPath }/form/loadFormInfo.action',
						type:'post',
						data: JSON.stringify(_param),
						cache: false,
						async: false,
						contentType: 'application/json;charset=utf-8',
						success: function (text) {
							data = text;
						},
						error: function (jqXHR, textStatus, errorThrown) {
						}
					});
					return data;
				}
				
				function getTabsInfo(_formId){
					var _param = {};
					_param = {requestParam:{},formId:_formId};
					var data = {};
					$.ajax({
						url:'${pageContext.request.contextPath }/form/loadTabsInfo.action',
						type:'post',
						data: JSON.stringify(_param),
						cache: false,
						async: false,
						contentType: 'application/json;charset=utf-8',
						success: function (text) {
							data = text;
						},
						error: function (jqXHR, textStatus, errorThrown) {
						}
					});
					return data;
				}
				
				//加载第二步
				function loadStep_2(){
					querys_step2();
					$(".fixed-table-toolbar").css("margin-top","0px");
					$(".container-fluid").css("height","100%");
					$(".fixed-table-container").css("height",$('body').height() -58 +"px");
					$(".fixed-table-body").css("height","83%");
				}
			
				//关闭
				function closex_1210(){ 
						    var index = parent.layer.getFrameIndex(window.name); //获取当前窗体索引
						    parent.layer.close(index);//执行关闭
				}
				
			//添加 
			//form/form/mstTab/addDetail.jsp
			function addForm_step2(){
				var url = '/myehr/jsp/form/formcreate/tabs/addList.jsp?formId='+formId_step2+'&mstId='+mstId_step2;
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
						$('#formList').bootstrapTable('refresh'); 
					}
				});
			}
			
				//编辑
			//form/form/mstTab/addDetail.jsp
			function editForm_step2(){
			}
			
			//删除
			function removeForm_step2(){
				var selects = $("#formList").bootstrapTable('getSelections');
				var select = {};
				if(selects!=null && selects.length>0){
					select = selects[0];
				}else {
					alert('请选择数据');return ;
				}
				var r=confirm("确定删除选中记录？");
				if (r==true){
					$.ajax({
						url:'/myehr/form/delectMstTab.action?tabDetailId='+select.tabDetailId,
						type:'post',
						cache: false,
						contentType: 'application/json;charset=utf-8',
						success: function (text) {
							if(text!='1'){
								alert('删除失败');
							} else {
								alert('删除成功');
								$('#formList').bootstrapTable('refresh'); 
							}
						},
						error: function (jqXHR, textStatus, errorThrown) {
							alert(jqXHR.responseText);
						}
					});
				}else{
					return;
				}
			}
						
		</script>
	</body>
</html>