//查询
function search(){
var condition=new Object();
condition.fieldCode = $("#search").val();
condition.deleteMark = $("#deleteMark").val();
condition.fieldEntityId = $("#EntityId").val();
	$.ajax({  
              type: 'POST',  
              data: JSON.stringify(condition),  
              url: '/myehr/questionList/searchquestionList.action',  
              success: function (data) {  
                  $("#questionList").bootstrapTable('load',data); 
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
    $('#questionList').bootstrapTable('refresh');  
}  
/**查询条件与分页数据 */  
function queryParams(pageReqeust) {  
	pageReqeust.enabled = $("#enabled").val();  
	pageReqeust.querys = $("#querys").val();  
    pageReqeust.condition = $("#FILTER_2771").val();  
    pageReqeust.pageNo = this.offset;  
    pageReqeust.pageSize = this.pageNumber;
    pageReqeust.sort = 'form_def_id'
    return pageReqeust;  
}   
/**下拉控件 */
var classes = $("select");
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
    hrs = $("#questionList").bootstrapTable('getSelections');  
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
		                url:'/myehr/question/deleteTemplate.action',  
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

function add(){
	var url = '/myehr/jsp/form/formcreate/';
	var content =   "<div class=\"col-lg-4 col-md-4 col-sm-6 col-xs-12\">\n"+
					"	<div class=\"ui search selection dropdown entitybox field-control\" style=\"display: inline-block;\">\n"+
					"		<lable style=\"float:left;font-size:12px\">试卷编码: </lable>\n"+
					"		<input id=\"code\" name=\"code\" type=\"text\"  required=\"true\" class=\"form-control\"  />\n"+
					"	</div>\n"+
					"</div>\n"+
					"<div class=\"col-lg-4 col-md-4 col-sm-6 col-xs-12\">\n"+
					"	<div class=\"ui search selection dropdown entitybox field-control\" style=\"display: inline-block;\">\n"+
					"		<lable style=\"float:left;font-size:12px\">试卷中文名: </lable>\n"+
					"		<input id=\"cname\" name=\"cname\" type=\"text\"  required=\"true\" class=\"form-control\"  />\n"+
					"	</div>\n"+
					"</div>\n"+
					"<div class=\"col-lg-4 col-md-4 col-sm-6 col-xs-12\">\n"+
					"	<div class=\"ui search selection dropdown entitybox field-control\" style=\"display: inline-block;\">\n"+
					"		<lable style=\"float:left;font-size:12px\">试卷英文名: </lable>\n"+
					"		<input id=\"ename\" name=\"ename\" type=\"text\"  required=\"true\" class=\"form-control\"  />\n"+
					"	</div>\n"+
					"</div>\n" +
					"<div id=\"questionType\" class=\"col-lg-4 col-md-4 col-sm-6 col-xs-12\" style=\"\">\n"+
					"	<div class=\"ui search selection dropdown entitybox field-control\" style=\"display: inline-block;\">\n"+
					"		<lable style=\"float:left;font-size:12px\">标识(试卷类别): </lable>\n"+
					"		<select id=\"remark\" title=\"标识(试卷类别)\" styleType=\"select\" name=\"remark\"  class=\"form-control\" style=\"width:200px;\">\n"+
					"			<option value=\"1\">问卷</option>\n"+
					"			<option value=\"2\">考卷</option>\n"+
					"			<option value=\"3\">检查点</option>\n"+
					"			<option value=\"4\">评价</option>\n"+	
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
				param.code = $("#code").val();
				param.cname = $("#cname").val();
				param.ename = $("#ename").val();
				param.remark = $("#remark").val();
				if(param.code!=""&&param.cname!=""&&param.cname!=""){
					$.ajax({
						url:'/myehr/form/saveQuestionParam.action',
						type:'POST',
						data: JSON.stringify(param),
					    cache: false,
					    contentType: 'application/json;charset=utf-8',
						async: false,
						success: function (data) {
								if(data=='0'){
									layer.alert('保存失败!试卷编码重复', {
										  icon: 5,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
										  skin: 'layer-ext-moon' 
										})
								} else if(data=='2'){
									layer.alert('保存失败!试卷表中存在多个此试卷编码', {
										  icon: 5,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
										  skin: 'layer-ext-moon' 
										})
								} else{
									url+= "questionBuildStep.jsp?templateId="+data;
									refresh();
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
	var hrs = $("#questionList").bootstrapTable('getSelections');
	if(hrs.length!=1){
		layer.alert('请选中一条数据', {
			  icon: 2,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
			  skin: 'layer-ext-moon' //
			})
			return;
	}
	var url;
	url = '/myehr/jsp/form/formcreate/questionBuildStep.jsp?update=true&templateId='+hrs[0].id;
	window.open(url);
}

function move(){
	var hrs = $("#questionList").bootstrapTable('getSelections');
	if(hrs.length<1){
		layer.alert('请选中至少一条数据', {
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
	var hrs = $("#questionList").bootstrapTable('getSelections');
	layer.msg('确定要移动此表单', {
		  time: 0 //不自动关闭
		  ,btn: ['确定', '再想想']
		  ,success: function(layero){
				layero.find('.layui-layer-btn').css('text-align', 'center');
			}
		  ,yes: function(index){
	  			layer.close(index);              
	            $.ajax({  
	                url:'/myehr/form/updateFormFolderid.action?formFolderId='+formFolderId,  
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
	var hrs = $("#questionList").bootstrapTable('getSelections');
	if(hrs.length!=1){
		layer.alert('请选中一条数据', {
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
	var hrs = $("#questionList").bootstrapTable('getSelections');
	if(hrs.length!=1){
		layer.alert('请选中一条数据', {
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
	var hrs = $("#questionList").bootstrapTable('getSelections');
	if(hrs.length<1){
		layer.alert('请选中一条数据', {
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
	  			var url = '/myehr/FormCopy/referUrl.action';
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
	var hrs = $("#questionList").bootstrapTable('getSelections');
	if(hrs.length<1){
		layer.alert('请选中一条数据', {
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
	  			var url = '/myehr/FormCopy/removeRefer.action';
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

function choose(){
	var obj = $("#questionList").bootstrapTable('getSelections');
	if(formType=='MstTab'){
		parent.$("#expand1").val(obj[0].id);
	}else{
		parent.$("#expand1").val(obj[0].id);
		parent.$("#expandField").val(obj[0].cname);
	}
	
	var index = parent.layer.getFrameIndex(window.name);
	parent.layer.close(index);//执行关闭
}
