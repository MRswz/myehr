<%@ page language="java" import="java.util.*" import="com.myehr.common.util.LangUtil" pageEncoding="UTF-8"%>
<%@ include file="/common/common.jsp" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<body>
<div class="container-fluid" style="height:100%;overflow-y:hidden">
	<div style="margin-top:10px">
		<div class="BTNGROUP" style="margin:0 auto; display:inline-block;height: 40px;">
			<div style="margin-right:10px;display:inline-block">
			    <input type="button" id="add" class="btn btn-primary" value="编辑工作桌面" onclick="addDrag()"/>
			</div>
			<div style="margin-right:10px;display:inline-block">
			    <input type="button" id="danger" class="btn btn-danger" value="删除" onclick="deleteDrag()"/>
			</div>
			<div style="margin-right:10px;display:inline-block">
			    <lable>删除标识: </lable>
				<select id="deleteMark" title="删除标识" name="account" onchange="updateJsp()"  class="form-control" DictName="SYS_COMMON_YES_NO" dataField="dictList">
				</select>
			</div>
		</div>
		<div style="margin-top:0px">
			<div id="formList_filter" style="float:right;display:inline-block;position:relative;">
				<input id="FILTER_2771" name="FILTER_2771" placeholder="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"布局编码")%>,<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"布局名称")%>" style="padding: 6px 30px 6px 10px;" title="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"布局编码")%>,<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"表单名称")%>" type="text" class="form-control" oninput="grid_emp_proce_fun11()" />
				<i class="icon-search" style="position: absolute;right: 12px;top: 7px;cursor: pointer;"></i>
			</div>
		</div>
	</div>
	<table id="formList">
	</table>
</div>
<script>
	$(function() {
		
	    cardSelectInitFunction('');
        cardDateWidInitFunction();
    	querys();
	    console.log($(".BTNGROUP>div").length);
		showMoreBtn($(".BTNGROUP"));
		$(".fixed-table-toolbar").css("margin-top","0px");
		$(".container-fluid").css("max-height","100%");
		$(".fixed-table-container").css("height",$('body').height() -145 +"px");
		$(".fixed-table-body").css("height","84%");
	});
  
function querys() {   
    $("#formList").bootstrapTable({  
        url : '${pageContext.request.contextPath }/form/dragconfigFormList.action',  
        height : '600',  
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
        },{  
            field : 'dragconfigId', // 主键  
			visible : false
        },{  
			title : '删除标识',  
            field : 'deleteMark', // 删除标识  
            align : 'center', // 对齐方式（左 中 右）  
            valign : 'middle', //  
            sortable : true ,
			visible : false,
			formatter: function (value, row, index) {
					return "<a  class=\"eli w100px\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"deleteMark\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"删除标识\">"+value+"</a>";
				}
        }, {  
            title : '布局编码',  
            field : 'dragconfigCode', // 字段  
            align : 'center', // 对齐方式（左 中 右）  
            valign : 'middle', //  
            sortable : true ,
            formatter: function (value, row, index) {
                    	return "<a  class=\"eli w100px\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"formDefCode\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"表单编码\">"+value+"</a>";
                	} 
        }, {  
            title : '布局中文名',  
            field : 'dragconfigCname',  
            align : 'center',  
            valign : 'middle',  
            sortable : true  ,
            formatter: function (value, row, index) {
                    	return "<a  class=\"eli w100px\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"formDefName\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"表单名称\">"+value+"</a>";
                	}
        }, {  
            title : '布局表单父id',  
            field : 'dragconfigPid',  
            align : 'center',  
            valign : 'middle',  
            sortable : true  ,
			visible : false,
            formatter: function (value, row, index) {
                    	return "<a  class=\"eli w100px\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"formDefName\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"表单名称\">"+value+"</a>";
                	}
        }, {  
            title : '布局HTML',  
            field : 'dragconfigHtml',  
            align : 'center',  
            valign : 'middle',  
            sortable : true  ,
			visible : false,
            formatter: function (value, row, index) {
                    	return "<a  class=\"eli w100px\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"formDefName\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"表单名称\">"+value+"</a>";
                	}
        }, {  
            title : '原生HTML',  
            field : 'dragconfigHtmlAll',  
            align : 'center',  
            valign : 'middle',  
            sortable : true  ,
			visible : false,
            formatter: function (value, row, index) {
                    	return "<a  class=\"eli w100px\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"formDefName\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"表单名称\">"+value+"</a>";
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
 
/**查询条件与分页数据 */  
function queryParams(pageReqeust) {  
	pageReqeust.enabled = $("#enabled").val();  
	pageReqeust.querys = $("#querys").val();  
    pageReqeust.condition = $("#FILTER_2771").val();  
    pageReqeust.pageNo = this.offset;  
    pageReqeust.pageSize = this.pageNumber;
    pageReqeust.dragconfPid = '${param.formDragconfigPid}';
    pageReqeust.sort = 'DRAGCONFIG_ID';
	pageReqeust.deleteMark = $("#deleteMark").val();
    return pageReqeust;  
}   

function updateJsp(){
	refresh();
	if($("#deleteMark").val()=='N'){
		$("#add").attr("class","btn btn-primary");
		$("#add").val("编辑工作桌面");
		$("#add").attr("onclick","addDrag()");
	}else{
		$("#add").attr("class","btn btn-success");
		$("#add").val("恢复");
		$("#add").attr("onclick","rcoverDrag()");
	}
	
}

/** 刷新页面 */  
function refresh() {  
    $('#formList').bootstrapTable('refresh');  
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
function addDrag(){
	if('${param.formDragconfigPid}'=='0'){
		var content =   "<div class=\"col-lg-4 col-md-4 col-sm-6 col-xs-12\">\n"+
						"	<div class=\"ui search selection dropdown entitybox field-control\" style=\"display: inline-block;\">\n"+
						"		<lable style=\"float:left;font-size:12px\">布局编码: </lable>\n"+
						"		<input id=\"DragCode\" name=\"DragCode\" type=\"text\"  required=\"true\" class=\"form-control\"  />\n"+
						"	</div>\n"+
						"</div>\n"+
						"<div class=\"col-lg-4 col-md-4 col-sm-6 col-xs-12\">\n"+
						"	<div class=\"ui search selection dropdown entitybox field-control\" style=\"display: inline-block;\">\n"+
						"		<lable style=\"float:left;font-size:12px\">布局名称: </lable>\n"+
						"		<input id=\"DragName\" name=\"DragName\" type=\"text\"  required=\"true\" class=\"form-control\"  />\n"+
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
						param.dragconfigCode = $("#DragCode").val();
						param.dragconfigCname = $("#DragName").val();
						param.deleteMark = 'N';
						param.dragconfigPid = '0';
					if(param.dragconfigCode!=""&&param.dragconfigCname!=""){
						$.ajax({
							url:'${pageContext.request.contextPath}/dragconfig/saveDragSimple.action',
							type:'POST',
							data: JSON.stringify(param),
							cache: false,
							contentType: 'application/json;charset=utf-8',
							async: false,
							success: function (data) {
								var url = "";
									if(data=='0'){
										layer.alert('保存失败!布局编码重复', {
											  icon: 5,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
											  skin: 'layer-ext-moon' 
											})
									} else if(data=='2'){
										layer.alert('保存失败!表单中存在多个此表单编码', {
											  icon: 5,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
											  skin: 'layer-ext-moon' 
											})
										$('#formList_step2').bootstrapTable('refresh'); 
									} else{
										url+= "/myehr/jsp/ksbootout/index.html?dragconfigId="+data.dragconfigId;
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
		}else{
			var param = {};
				param.dragconfigPid = '${param.formDragconfigPid}';
			$.ajax({
				url:'${pageContext.request.contextPath}/dragconfig/saveDragSimple.action',
				type:'POST',
				data: JSON.stringify(param),
				cache: false,
				contentType: 'application/json;charset=utf-8',
				async: false,
				success: function (data) {
					var url = "";
						if(data=='0'){
							layer.alert('保存失败!布局编码重复', {
								  icon: 5,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
								  skin: 'layer-ext-moon' 
								})
						} else if(data=='2'){
							layer.alert('保存失败!表单中存在多个此表单编码', {
								  icon: 5,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
								  skin: 'layer-ext-moon' 
								})
							$('#formList_step2').bootstrapTable('refresh'); 
						} else{
							url+= "/myehr/jsp/ksbootout/index.html?dragconfigId="+data.dragconfigId;
							window.open(url);
						}
					}
				});
		}
	}

	function deleteDrag(){
		var hrs = [];
		hrs = $("#formList").bootstrapTable('getSelections');  
		if (hrs.length < 1) {  
			layer.alert('请选择一条或多条数据进行删除！', {icon: 2});  
		} else {  
			layer.msg('确定要删除此工作桌面', {
				  time: 0 //不自动关闭
				  ,btn: ['确定', '再想想']
				  ,success: function(layero){
						layero.find('.layui-layer-btn').css('text-align', 'center');
					}
				  ,yes: function(index){
						layer.close(index);              
						$.ajax({  
							url:'${pageContext.request.contextPath }/dragconfig/deleteDrags.action',  
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
	function rcoverDrag(){
		var hrs = [];
		hrs = $("#formList").bootstrapTable('getSelections');  
		if (hrs.length < 1) {  
			layer.alert('请选择一条或多条数据进行恢复！', {icon: 2});  
		} else {           
			$.ajax({  
				url:'${pageContext.request.contextPath }/dragconfig/recoverDrags.action',  
				type:'post',
				cache: false,
				async: false,
				contentType:'application/json',  
				data:JSON.stringify(hrs),
				success:function(msg){  
					if(msg=="true"){  
						layer.alert('恢复成功', {
							  icon: 6,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
							  skin: 'layer-ext-moon' ,
							  time:500
							})
					}else{  
						layer.alert('恢复失败', {
							  icon: 5,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
							  skin: 'layer-ext-moon' ,
							  time:500
							})
					}  
					refresh();    
				}  
			});
			}
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
	var url;
	if(hrs[0].formDefLayoutType == "1"){
		url = '/myehr/jsp/form/formcreate/formCardBuildStep.jsp?update=true&formDefId='+hrs[0].formDefId;
	}else if(hrs[0].formDefLayoutType == "2"){
		url = '/myehr/jsp/form/formcreate/formGridBuildStep.jsp?update=true&formDefId='+hrs[0].formDefId;
	}else if(hrs[0].formDefLayoutType == "3"){
		url = '/myehr/jsp/form/formcreate/formTreeBuildStep.jsp?update=true&formDefId='+hrs[0].formDefId;
	}else if(hrs[0].formDefLayoutType == "5"){
		url = '/myehr/jsp/form/formcreate/formMstBuildStep.jsp?update=true&formDefId='+hrs[0].formDefId;
	}else if(hrs[0].formDefLayoutType == "7"){
		url = '/myehr/jsp/form/formcreate/formTabsBuildStep.jsp?update=true&formDefId='+hrs[0].formDefId;
	}else if(hrs[0].formDefLayoutType == "10"){
		url = '/myehr/jsp/form/formcreate/formGridByCardBuildStep.jsp?update=true&formDefId='+hrs[0].formDefId;
	}else if(hrs[0].formDefLayoutType == "8"){
		url = '/myehr/jsp/form/formcreate/formYKreportBuildStep.jsp?update=true&formDefId='+hrs[0].formDefId;
	}else if(hrs[0].formDefLayoutType == "9"){
		url = '/myehr/jsp/form/formcreate/formChartsBuildStep.jsp?update=true&formDefId='+hrs[0].formDefId;
	}else if(hrs[0].formDefLayoutType == "11"){
		url = '/myehr/jsp/form/formcreate/formTimeAxisBuildStep.jsp?update=true&formDefId='+hrs[0].formDefId;
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

