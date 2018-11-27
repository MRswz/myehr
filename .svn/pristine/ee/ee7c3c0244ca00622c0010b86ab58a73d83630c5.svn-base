<%@ page language="java" import="java.util.*" import="com.myehr.common.util.LangUtil" pageEncoding="UTF-8"%>
<%@ include file="/common/common.jsp" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<body>
<div class="container-fluid" style="height:100%;overflow-y:hidden">
	<div style="margin-top:10px">
		<div class="BTNGROUP" style="margin:0 auto; display:inline-block;height: 35px;">
			<div style="margin-right:10px;display:inline-block">
			    <input type="button" id="add" class="btn btn-primary" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"增加")%> onclick="add()"/>
			</div>
			<div style="margin-right:10px;display:inline-block">
			    <input type="button" id="remove" class="btn btn-danger" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"删除")%> onclick="deleteHr()"/>
			</div>
			<div style="margin-right:10px;display:inline-block">
			    <input type="button" id="update" class="btn btn-info" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"修改")%> onclick="update()"/>
			</div>
			<div style="margin-right:10px;display:inline-block">
			    <input type="button" id="start" class="btn btn-info" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"启用")%> onclick="start()"/>
			</div>
			<div style="margin-right:10px;display:inline-block">
			    <input type="button" id="stop" class="btn btn-info" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"停用")%> onclick="stop()"/>
			</div>
			<div style="margin-right:10px;display:inline-block">
			    <input type="button" id="view" class="btn btn-info" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"预览")%> onclick="view()"/>
			</div>
		</div>
		<div id="formList_filter" style="float:right;display:inline-block;position:relative;">
			<input id="FILTER_2771" name="FILTER_2771" placeholder="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"表单编码")%>,<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"表单名称")%>" style="padding: 6px 30px 6px 10px;" title="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"表单编码")%>,<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"表单名称")%>" type="text" class="form-control" oninput="grid_emp_proce_fun11()" />
			<i class="icon-search" style="position: absolute;right: 12px;top: 7px;cursor: pointer;"></i>
		</div>
	</div>
	<table id="formList">
	</table>
</div>
    
<script>
	$(function() {
    	querys();
		$(".fixed-table-toolbar").css("margin-top","0px");
		$(".container-fluid").css("max-height","100%");
		$(".fixed-table-container").css("height",$('body').height() -45 +"px");
		$(".fixed-table-body").css("height","85%");
	    initDict();
	    initDate();
	    console.log($(".BTNGROUP>div").length);
	    var DIVAMOUNT = 9;
	    if($(".BTNGROUP>div").length > DIVAMOUNT){
	    	var len = $(".BTNGROUP>div").length;
	    	$(".BTNGROUP>div:gt(4)").hide();
	    	var selectObj = $('<div class="btn-group"><button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">更多 <span class="caret"></span></button><ul class="dropdown-menu" style="min-width:90px;left:-14px;"></ul></div>');
	    	$(".BTNGROUP").append(selectObj);
	    	for(var i=DIVAMOUNT;i<len;i++){
	    		var liObj = $('<li style="margin-left:14px;"></li>');
	    		liObj.append($(".BTNGROUP>div").eq(i).clone(true));
	    		selectObj.find('.dropdown-menu').append(liObj);
	    		selectObj.find('.dropdown-menu').append($('<li role="separator" class="divider"></li>'));
	    	}
	    	selectObj.find('.dropdown-menu div').show();
	    }
	});
  
function querys() {   
    $("#formList").bootstrapTable({  
        url : '${pageContext.request.contextPath }/form/queryInterfaceList.action',  
		contentType: 'application/json;charset=utf-8',
		dataType:'json',
		method:'post',
        height : '700',  
        undefinedText : '-',  
        pagination : true, // 分页  
        striped : true, // 是否显示行间隔色  
        queryParams : queryParams,  
        cache : false, // 是否使用缓存  
        pageList : [ 5, 10, 20 ],  
        toolbar : "#toolbar",// 指定工具栏  
        showColumns : true, // 显示隐藏列  
        clickToSelect: true,
        showRefresh : true, // 显示刷新按钮  
        uniqueId : "userName", // 每一行的唯一标识  
        sidePagination : "server", // 服务端处理分页  
        columns : [ {  
            field : 'state',  
            checkbox : true,  
            align : 'center',  
            valign : 'middle'  
        }, {  
            title : '接口方案编码',  
            field : 'interface_scheme_code', // 字段  
            align : 'center', // 对齐方式（左 中 右）  
            valign : 'middle', //  
            sortable : true ,
            formatter: function (value, row, index) {
                    	return "<a  class=\"eli w100px\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"interface_scheme_code\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"表单编码\">"+value+"</a>";
                	} 
        }, {  
            title : '接口方案名称',  
            field : 'interface_scheme_name',  
            align : 'center',  
            valign : 'middle',  
            sortable : true  ,
            formatter: function (value, row, index) {
                    	return "<a  class=\"eli w100px\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"interface_scheme_name\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"表单名称\">"+value+"</a>";
                	}
		 }, {  
            title : '接口方案类别',  
            field : 'interface_scheme_category',  
            align : 'center',  
            valign : 'middle',  
            sortable : true  ,
            formatter: function (value, row, index) {
                    	return "<a class=\"eli w100px\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"interface_scheme_category\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"接口方案类别\" data-source=\"/myehr/dict/searchSysDictEntryTypeCode1.action?deleteMark=SYS_INTERFACE_CATEGORY\">";
                	}
        }, {  
            title : '接口方案类型',  
            field : 'interface_scheme_type',  
            align : 'center',  
            valign : 'middle',  
            sortable : true  ,
            formatter: function (value, row, index) {
                    	return "<a class=\"eli w100px\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"interface_scheme_type\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"接口方案类型\" data-source=\"/myehr/dict/searchSysDictEntryTypeCode1.action?deleteMark=SYS_INTERFACE_TYPE\">";
                	}
		}, {  
            title : '接口方案状态',  
            field : 'interface_scheme_status',  
            align : 'center',  
            valign : 'middle',  
            sortable : true  ,
            formatter: function (value, row, index) {
                    	return "<a class=\"eli w100px\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"interface_scheme_status\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"接口方案状态\" data-source=\"/myehr/dict/searchSysDictEntryTypeCode1.action?deleteMark=SYS_INTERFACE_STATUS\">";
                	}
        },  {  
            title : '创建者',  
            field : 'USER_NAME',  
            align : 'center',  
            valign : 'middle',  
            sortable : true  ,
            formatter: function (value, row, index) {
                    	return "<a  class=\"eli w100px\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"USER_NAME\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"创建者\">"+value+"</a>";
                	}
        },  {  
            title : '创建时间',  
            field : 'interface_scheme_create_time',  
            align : 'center',  
            valign : 'middle',  
            sortable : true  ,
            formatter: function (value, row, index) {
                   var date = "-";
					if(value!=null){
						date = new Date(value).Format("yyyy-MM-dd hh:mm:ss");
					}
					return "<a class=\"eli w200\" style=\"font-size:14px;text-decoration:none;color:black;width:200px;\" name=\"interface_scheme_create_time\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"创建时间\">" + date + "</a>";
				}
        }],
        onClickRow: function (row, $element) {
	                curRow = row;
	                $('#formList').bootstrapTable('uncheckAll');//checkBox单选
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
    
    window.operateEvents = {  
                
           };
	}    
	
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
/**查询条件与分页数据 */  
function queryParams(pageReqeust) {
	var _filterdata={};
	var searchValue = document.getElementById("FILTER_2771").value;
	_filterdata={searchValue:searchValue};
	var userId = '${sessionScope.userid}';
	var paramsMap = {userId:userId};
	var requestParam={};
	requestParam = {};
	
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.formId=0;
	pageReqeust.isView=null;
	return JSON.stringify(pageReqeust);
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
/**初始化日期控件  */
function initDate(){
			$('.form_date1').datetimepicker({ 
			 language:  'zh-CN',  
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
} 

/** 
 * 删除数据 
 */  
function deleteHr() {  
	var hrs = [];
    hrs = $("#formList").bootstrapTable('getSelections');  
    if (hrs.length < 1) {  
        layer.alert('请选择一条或多条数据进行删除！', {icon: 2});  
    } else {  
    	layer.msg('确定要删除此表单', {
	  		  time: 0 //不自动关闭
	  		  ,btn: ['确定', '再想想']
	  		  ,success: function(layero){
	  				layero.find('.layui-layer-btn').css('text-align', 'center');
	  			}
	  		  ,yes: function(index){
		  			layer.close(index);              
		            $.ajax({  
		                url:'${pageContext.request.contextPath }/form/deleteForms.action',  
		                type:'post',
		    			cache: false,
		    			async: false,
		                contentType:'application/json',  
		                data:JSON.stringify(hrs),
		                success:function(msg){  
		                    if(msg=="true"){  
		                    	layer.alert('删除成功', {
									  icon: 6,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
									  skin: 'layer-ext-moon' 
									})
		
		                    }else{  
		                    	layer.alert('删除失败', {
									  icon: 5,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
									  skin: 'layer-ext-moon' 
									})
		
		                    }  
		                    refresh();    
		                }  
		            });
		      	}
	        })
    }  
}  

/** 
 * 删除数据 
 */  
function view() {  
	var hrs = [];
    hrs = $("#formList").bootstrapTable('getSelections');  
    if (hrs.length < 1) {  
        layer.alert('请选择一条或多条数据进行删除！', {icon: 2});  
    } else { 
		var interfaceSchemeId = hrs[0].interface_scheme_id;
    	 $.ajax({  
			 url:'${pageContext.request.contextPath }/form/viewInterfaceScheme.action?interfaceSchemeId='+interfaceSchemeId,  
			type:'post',
			cache: false,
			async: false,
			//contentType:'application/json',  
			//data:JSON.stringify(hrs),
			success:function(msg){  
				if(msg!="false"){  
					layer.alert(msg);
				}else{  
					layer.alert('删除失败', {
						  icon: 5,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
						  skin: 'layer-ext-moon' 
						})

				}  
				refresh();    
			}  
		});
    }  
}  

/** 
 * 停止方案
 */  
function stop() {  
	var hrs = [];
    hrs = $("#formList").bootstrapTable('getSelections');  
    if (hrs.length < 1) {  
        layer.alert('请选择一条或多条数据进行删除！', {icon: 2});  
    } else {
		var interfaceSchemeIds = '';
		for(var i=0;i<hrs.length;i++){
			interfaceSchemeIds+=hrs[i].interface_scheme_id+",";
		}		
    	layer.msg('确定要停止此接口方案', {
	  		  time: 0 //不自动关闭
	  		  ,btn: ['确定', '再想想']
	  		  ,success: function(layero){
	  				layero.find('.layui-layer-btn').css('text-align', 'center');
	  			}
	  		  ,yes: function(index){
		  			layer.close(index);              
		            $.ajax({  
		                url:'${pageContext.request.contextPath }/form/startInterfaceSchemes.action?type=stop&interfaceSchemeIds='+interfaceSchemeIds,  
		                type:'post',
		    			cache: false,
		    			async: false,
		                contentType:'application/json',  
		                //data:JSON.stringify(hrs),
		                success:function(msg){  
		                    if(msg=="true"){  
		                    	layer.alert('停止成功', {
									  icon: 6,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
									  skin: 'layer-ext-moon' 
									})
		
		                    }else{  
		                    	layer.alert('停止失败', {
									  icon: 5,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
									  skin: 'layer-ext-moon' 
									})
		
		                    }  
		                    refresh();    
		                }  
		            });
		      	}
	        })
    }  
}  

/** 
 * 启动方案
 */  
function start() {  
	var hrs = [];
    hrs = $("#formList").bootstrapTable('getSelections');  
    if (hrs.length < 1) {  
        layer.alert('请选择一条或多条数据启动！', {icon: 2});  
    } else {
		var interfaceSchemeIds = '';
		for(var i=0;i<hrs.length;i++){
			interfaceSchemeIds+=hrs[i].interface_scheme_id+",";
		}
    	layer.msg('确定要启动此接口方案', {
	  		  time: 0 //不自动关闭
	  		  ,btn: ['确定', '再想想']
	  		  ,success: function(layero){
	  				layero.find('.layui-layer-btn').css('text-align', 'center');
	  			}
	  		  ,yes: function(index){
		  			layer.close(index);              
		            $.ajax({  
		                url:'${pageContext.request.contextPath }/form/startInterfaceSchemes.action?type=start&interfaceSchemeIds='+interfaceSchemeIds,  
		                type:'post',
		    			cache: false,
		    			async: false,
		                contentType:'application/json',  
		                //data:JSON.stringify(hrs),
		                success:function(msg){  
		                    if(msg=="true"){  
		                    	layer.alert('启动成功', {
									  icon: 6,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
									  skin: 'layer-ext-moon' 
									})
		
		                    }else{  
		                    	layer.alert('启动失败', {
									  icon: 5,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
									  skin: 'layer-ext-moon' 
									})
		
		                    }  
		                    refresh();    
		                }  
		            });
		      	}
	        })
    }  
}  

function add(){
	var url = '/myehr/jsp/form/formcreate/';
	var content =   "<div class=\"col-lg-4 col-md-4 col-sm-6 col-xs-12\">\n"+
					"	<div class=\"ui search selection dropdown entitybox field-control\" style=\"display: inline-block;\">\n"+
					"		<lable style=\"float:left;font-size:12px\">接口方案编码: </lable>\n"+
					"		<input id=\"interfaceSchemeCode\" name=\"interfaceSchemeCode\" type=\"text\"  required=\"true\" class=\"form-control\"  />\n"+
					"	</div>\n"+
					"</div>\n"+
					"<div class=\"col-lg-4 col-md-4 col-sm-6 col-xs-12\">\n"+
					"	<div class=\"ui search selection dropdown entitybox field-control\" style=\"display: inline-block;\">\n"+
					"		<lable style=\"float:left;font-size:12px\">接口方案名称: </lable>\n"+
					"		<input id=\"interfaceSchemeName\" name=\"interfaceSchemeName\" type=\"text\"  required=\"true\" class=\"form-control\"  />\n"+
					"	</div>\n"+
					"</div>\n"+
					"<div class=\"col-lg-4 col-md-4 col-sm-6 col-xs-12\">\n"+
					"	<div class=\"ui search selection dropdown entitybox field-control\" style=\"display: inline-block;\">\n"+
					"		<lable style=\"float:left;font-size:12px\">接口方案类别: </lable>\n"+
					"		<select id=\"interfaceSchemeCategory\" title=\"接口方案类别\" styleType=\"select\" name=\"interfaceSchemeCategory\" onchange=\"LayoutTypeChanged()\"  class=\"form-control\" style=\"width:200px;\">\n"+
					"			<option value>请选择</option>\n"+
					"			<option value=\"publish\">发布接口</option>\n"+
					"			<option value=\"receive\">接收接口</option>\n"+
					"		</select>\n"+
					"	</div>\n"+
					"</div>\n";
							
		layer.open({
			title:'输入内容',
			shadeClose: true,
			zIndex:9999,
			content: content,
			area: ['700px', '300px'],
			btn: ['确定', '取消'],
			success:function(layero,index){
			},
			yes: function(index, layero){
				var param = {};
				param.interfaceSchemeName = $("#interfaceSchemeName").val();
				param.interfaceSchemeCode = $("#interfaceSchemeCode").val();
				param.interfaceSchemeCategory = $("#interfaceSchemeCategory").val();
				if(param.interfaceSchemeName!=""&&param.interfaceSchemeCode!=""&&param.interfaceSchemeCategory!=""){
					$.ajax({
						url:'${pageContext.request.contextPath }/form/saveInterfaceScheme.action',
						type:'POST',
						data: JSON.stringify(param),
					    cache: false,
					    contentType: 'application/json;charset=utf-8',
						async: false,
						success: function (data) {
								if(data=='0'){
									layer.alert('保存失败!接口方案编码重复', {
										  icon: 5,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
										  skin: 'layer-ext-moon' 
										})
								} else if(data=='2'){
									layer.alert('保存失败!接口方案中存在多个此方案编码', {
										  icon: 5,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
										  skin: 'layer-ext-moon' 
										})
									$('#formList_step2').bootstrapTable('refresh'); 
								} else{
									if(param.interfaceSchemeType=='publish'){
										url+= "interfacePublishSchemeBuildStep.jsp?interfaceSehemeId="+data;
									}else{
										url+= "interfaceReceiveSchemeBuildStep.jsp?interfaceSehemeId="+data;
									}
									layer.close(index);
									window.open(url);
								}
							
							}
						});
				}else{
					layer.alert('信息输入不完整', {
						  icon: 5,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
						  skin: 'layer-ext-moon' 
						})
				}
			  },
			btn2: function(index, layero){
				
			  }
		});
	}

function LayoutTypeChanged(){
	if($("#formDefLayoutType").val()==10){
		$("#expandField").val("GRIDBYCARD");
	}else{
		$("#expandField").val("");
	}
}

function update(){
	var hrs = $("#formList").bootstrapTable('getSelections');
	if(hrs.length!=1){
		layer.alert('<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"请选中一条数据")%>', {
			  icon: 2,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
			  skin: 'layer-ext-moon' //
			})
			return;
	}
	if(hrs[0].formSubmitStatus=='Y'){
		layer.alert('<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"表单已提交,不可修改")%>', {
			  icon: 2,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
			  skin: 'layer-ext-moon' //
			})
			return;
	}
	var url = '/myehr/jsp/form/formcreate/interfacePublishSchemeBuildStep.jsp?update=true&interfaceSehemeId='+hrs[0].interface_scheme_id;
	if(hrs[0].interface_scheme_category=='receive'){
		url = '/myehr/jsp/form/formcreate/interfaceReceiveSchemeBuildStep.jsp?update=true&interfaceSehemeId='+hrs[0].interface_scheme_id;
	}
	window.open(url);
	
}

function move(){
	var hrs = $("#formList").bootstrapTable('getSelections');
	if(hrs.length<1){
		layer.alert('<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"请选中至少一条数据")%>', {
			  icon: 2,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
			  skin: 'layer-ext-moon' //
			})
			return;
	}
	layer.open({
		type: 2,
		title: '移动表单',
		shadeClose: true,
		shade: 0.8,
		area: ['25%', '85%'],
		content: 'formPosition.jsp', //iframe的url
		success:function(layero,index){
	    },
		end:function(){
			refresh();
		}
	})
}

function updateFormFolderid(formFolderId){
	var hrs = $("#formList").bootstrapTable('getSelections');
	layer.msg('确定要移动此表单', {
		  time: 0 //不自动关闭
		  ,btn: ['确定', '再想想']
		  ,success: function(layero){
				layero.find('.layui-layer-btn').css('text-align', 'center');
			}
		  ,yes: function(index){
	  			layer.close(index);              
	            $.ajax({  
	                url:'${pageContext.request.contextPath }/form/updateFormFolderid.action?formFolderId='+formFolderId,  
	                type:'post',
	    			cache: false,
	    			async: false,
	                contentType:'application/json',  
	                data:JSON.stringify(hrs),
	                success:function(msg){  
	                    if(msg=="true"){  
	                    	layer.alert('移动成功', {
								  icon: 6,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
								  skin: 'layer-ext-moon' 
								})
								layer.closeAll();
		                    refresh(); 
	                    }else{  
	                    	layer.alert('移动失败', {
								  icon: 5,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
								  skin: 'layer-ext-moon' 
								})
	
	                    }     
	                }  
	            });
	            
	      	}
      })
}

function look(){
	var hrs = $("#formList").bootstrapTable('getSelections');
	if(hrs.length!=1){
		layer.alert('<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"请选中一条数据")%>', {
			  icon: 2,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
			  skin: 'layer-ext-moon' //
			})
			return;
	}
	var url;
	url = '/myehr/form/toForm.action?formId='+hrs[0].formDefId;	
	window.open(url);
}

function copy(){
	var hrs = $("#formList").bootstrapTable('getSelections');
	if(hrs.length!=1){
		layer.alert('<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"请选中一条数据")%>', {
			  icon: 2,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
			  skin: 'layer-ext-moon' //
			})
			return;
	}
	layer.msg('确定要复制此表单', {
		  time: 0 //不自动关闭
		  ,btn: ['确定', '再想想']
		  ,success: function(layero){
				layero.find('.layui-layer-btn').css('text-align', 'center');
			}
		  ,yes: function(index){
	  			layer.close(index);  
	  			var form={};
	  			form.formDefId = hrs[0].formDefId;
	  			var url = "";
	  			if(hrs[0].formDefLayoutType=='1'){//卡片
	  				url = '${pageContext.request.contextPath }/FormCopy/cardFormCopy.action';
	  			}else if(hrs[0].formDefLayoutType=='2'){//栅格式列表
	  				url = '${pageContext.request.contextPath }/FormCopy/gridFormCopy.action';
	  			}else if(hrs[0].formDefLayoutType=='3'){//树
	  				url = '${pageContext.request.contextPath }/FormCopy/treeFormCopy.action';
	  			}else if(hrs[0].formDefLayoutType=='7'){//多Tab
	  				url = '${pageContext.request.contextPath }/FormCopy/tabsFormCopy.action';
	  			}else if(hrs[0].formDefLayoutType=='5'){//主从
	  				url = '${pageContext.request.contextPath }/FormCopy/mstFormCopy.action';
	  			}
	  			$.ajax({  
	  		        url:url,  
	  		        type:'post',
	  				cache: false,
	  				async: false,
	  		        contentType:'application/json',  
	  		        data:JSON.stringify(form),
	  		        success:function(msg){  
	  		            if(msg=="true"){  
	  		            	layer.alert('复制成功', {
	  							  icon: 6,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
	  							  skin: 'layer-ext-moon' 
	  							})
	  							layer.closeAll();
	  		                refresh(); 
	  		            }else if(msg=="1"){  
	  		            	layer.alert('复制失败,表单已复制,请修改复制表单编码', {
	  							  icon: 5,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
	  							  skin: 'layer-ext-moon' 
	  							})
	  		          	}else{  
	  		            	layer.alert('复制失败', {
	  							  icon: 5,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
	  							  skin: 'layer-ext-moon' 
	  							})

	  		            }     
	  		        }  
	  		    });
	  			
	      	}
    })
}

function buildAllForm(){
	var url = '${pageContext.request.contextPath }/form/toFormAll.action';
		$.ajax({  
			url:url,  
			type:'post',
			cache: false,
			async: false,
			contentType:'application/json',  
			//data:JSON.stringify(hrs),
			success:function(msg){  
				if(msg=="true"){  
					layer.alert('生成成功', {
						  icon: 6,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
						  skin: 'layer-ext-moon' 
						})
						layer.closeAll();
					refresh(); 
				}else{  
					layer.alert('生成失败', {
						  icon: 5,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
						  skin: 'layer-ext-moon' 
						})

				}     
			}  
		});
}

function refer(){
	var hrs = $("#formList").bootstrapTable('getSelections');
	if(hrs.length<1){
		layer.alert('<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"请选中一条数据")%>', {
			  icon: 2,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
			  skin: 'layer-ext-moon' //
			})
			return;
	}
	layer.msg('确定要提交此表单', {
		  time: 0 //不自动关闭
		  ,btn: ['确定', '再想想']
		  ,success: function(layero){
				layero.find('.layui-layer-btn').css('text-align', 'center');
			}
		  ,yes: function(index){
	  			layer.close(index);  
	  			//var form={};
	  			//form.formDefId = hrs[0].formDefId;
	  			var url = '${pageContext.request.contextPath }/FormCopy/referUrl.action';
	  			$.ajax({  
	  		        url:url,  
	  		        type:'post',
	  				cache: false,
	  				async: false,
	  		        contentType:'application/json',  
	  		        data:JSON.stringify(hrs),
	  		        success:function(msg){  
	  		            if(msg=="true"){  
	  		            	layer.alert('提交成功', {
	  							  icon: 6,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
	  							  skin: 'layer-ext-moon' 
	  							})
	  							layer.closeAll();
	  		                refresh(); 
	  		            }else{  
	  		            	layer.alert('提交失败', {
	  							  icon: 5,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
	  							  skin: 'layer-ext-moon' 
	  							})

	  		            }     
	  		        }  
	  		    });
	  			
	      	}
    })
}

function removeRefer(){
	var hrs = $("#formList").bootstrapTable('getSelections');
	if(hrs.length<1){
		layer.alert('<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"请选中一条数据")%>', {
			  icon: 2,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
			  skin: 'layer-ext-moon' //
			})
			return;
	}
	layer.msg('确定要取消此表单的提交状态', {
		  time: 0 //不自动关闭
		  ,btn: ['确定', '再想想']
		  ,success: function(layero){
				layero.find('.layui-layer-btn').css('text-align', 'center');
			}
		  ,yes: function(index){
	  			layer.close(index);  
	  			//var form={};
	  			//form.formDefId = hrs[0].formDefId;
	  			var url = '${pageContext.request.contextPath }/FormCopy/removeRefer.action';
	  			$.ajax({  
	  		        url:url,  
	  		        type:'post',
	  				cache: false,
	  				async: false,
	  		        contentType:'application/json',  
	  		        data:JSON.stringify(hrs),
	  		        success:function(msg){  
	  		            if(msg=="true"){  
	  		            	layer.alert('取消成功', {
	  							  icon: 6,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
	  							  skin: 'layer-ext-moon' 
	  							})
	  							layer.closeAll();
	  		                refresh(); 
	  		            }else{  
	  		            	layer.alert('取消失败', {
	  							  icon: 5,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
	  							  skin: 'layer-ext-moon' 
	  							})

	  		            }     
	  		        }  
	  		    });
	  			
	      	}
    })
}

</script>  
</body>
</html>
