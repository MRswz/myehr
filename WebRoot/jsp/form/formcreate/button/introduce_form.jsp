<%@ page language="java" import="java.util.*" import="com.myehr.common.util.LangUtil" pageEncoding="UTF-8"%>
<%@ include file="/common/common.jsp" %>
<%
	String formButtonId = request.getParameter("formButtonId");
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<body style="text-align:center">
<form id="form_1881" name="form_1881" >
<div class="container-fluid">
	<div style="margin-top:10px;">
		<input id="SYS_SYSTEM_SCHEME.introduceId" name="introduceId" type="hidden" class="form-control"  style="width:200px;"/>
		<input id="SYS_SYSTEM_SCHEME.introduceButtonId" name="introduceButtonId" type="hidden" class="form-control"  style="width:200px;" value="<%=formButtonId %>"/>
		<div style="border:1px solid #ccc;position:relative;border-radius:5px;margin-bottom:10px;padding:10px;height:40%">
			<h3 style=" background:#FFF;color:blue; display:block;font-size:12;position:absolute; left:10px; top:-27px;text-align:center;z-index:999">引入按钮设置</h3>
			<div id="step2_part1" style="height:100%;padding:10px;display:block;overflow:auto">
				<table style="width:100%;table-layout:fixed;" class="cbs-table"  >
				<tr style="height:45px" width="100%">
					<td style="padding-left:10px;"  width="150"  ><lable><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"引入方案类型")%>：</lable></td>
					<td style="padding-left:10px;"  align="left"  >						<select id="SYS_SYSTEM_SCHEME.introduceType" onchange="changeeSlect1(this)"  title="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"引入方案类型")%>" name="introduceType"  class="form-control" emptyText="请选择..."  required="true"  style="width:284px;" textField="dictName" valueField="dictID" DictName="SYS_FORM_BUTTON_ADD_DEAL_TYPE" nullItemText="" dataField="dicts"></select></td>
					<td style="padding-left:10px;"  width="10%"  ><lable><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"标题")%>: </lable></td>
					<td style="padding-left:10px;"  align="left" width="20%"  ><input id="SYS_SYSTEM_SCHEME.introduceTitle" name="introduceTitle" type="text" class="form-control"  vtype="illegalChar;maxLength:null;minLength:null;" style="width:200px;"/></td>
				</tr>
				<tr style="height:45px" width="100%">
					<td style="padding-left:10px;"  width="10%"  ><lable><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"窗口宽度")%>: </lable></td>
					<td style="padding-left:10px;"  align="left" width="20%"  ><input id="SYS_SYSTEM_SCHEME.introduceWidth" name="introduceWidth" type="text" class="form-control"  vtype="illegalChar;maxLength:null;minLength:null;" style="width:284px;"/></td>
					<td style="padding-left:10px;"  width="10%"  ><lable><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"窗口高度")%>: </lable></td>
					<td style="padding-left:10px;"  align="left" width="20%"  ><input id="SYS_SYSTEM_SCHEME.introduceHeight" name="introduceHeight" type="text" class="form-control"  vtype="illegalChar;maxLength:null;minLength:null;" style="width:200px;"/></td>
				</tr>
				<tr style="height:45px" id="tr_form">
					<td style="padding-left:10px;"  width="150"  ><lable><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"关联表单")%>：</lable></td>
					<td style="padding-left:10px;"  align="left" width="20%"  >
						<input id="SYS_SYSTEM_SCHEME.introduceFormId" name="introduceFormId" type="text" class="form-control"  vtype="illegalChar;maxLength:null;minLength:null;" style="width:200px;display:none"/>
						<div style="position:relative"><input id="SYS_SYSTEM_SCHEME.introduceFormName" name="introduceFormName" type="text" class="form-control"  vtype="illegalChar;maxLength:null;minLength:null;" style="width:200px;margin-right:10px"/><i id="formAddIcon" style="position:absolute;left:180px;top:5px" onclick="choseForm()" class="glyphicon glyphicon-plus"></i><input type="button" id="editorg_list"  class="btn btn-primary" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"参数设置")%> onclick="addScheme()"/></div>
					</td>
				</tr>
				<tr style="height:45px" id="tr_url">
					<td style="padding-left:10px;"  width="150"  ><lable><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"自定义url")%>：</lable></td>
					<td style="padding-left:10px;"  align="left" width="20%"  >
						<input id="SYS_SYSTEM_SCHEME.introduceUrl" name="introduceUrl" type="text" class="form-control"  vtype="illegalChar;maxLength:null;minLength:null;" style="width:284px;"/>
						</td>
				</tr>
				<tr id="tr_fun">
					<td style="padding-left:10px;"  width="150"  ><lable><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"自定义方案")%>：</lable></td>
					<td colspan="3" align="left">
						<textarea  id="SYS_SYSTEM_SCHEME.introduceSelfFun" name="introduceSelfFun"  class="form-control"  rows="5"  style="width:400;height:50;margin-left:10px;margin-bottom:5px"> </textarea>
					</td>
				</tr>
				<tr id="tr6">
					<td style="padding-left:10px;"  width="150"  ><lable><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"按钮初始化方案")%>：</lable></td>
					<td colspan="3" align="left">
						<textarea  id="SYS_SYSTEM_SCHEME.introduceInitFun" name="introduceInitFun"  class="form-control"  rows="5"  style="width:400;height:50;margin-left:10px;margin-bottom:5px"> </textarea>
					</td>
				</tr>
			</table>
			</div>
		</div>
		
		<div style="border:1px solid #ccc;position:relative;border-radius:5px;margin-bottom:10px;height:30%">
			<h3 style=" background:#FFF;color:blue; display:block;font-size:12;position:absolute; left:10px; top:-27px;text-align:center;z-index:999">字段映射</h3>
			<div style="overflow:auto;height:100%">
				<div style="margin-top:5px;position:relative;z-index:999">
					<div class="BTNGROUP_1041" style="margin:10px 0 0 10px;float:left; display:inline-block;height: 35px;">
						<div style="margin-right:10px;display:inline-block">
							<input type="button" id="editorg_list"  class="btn btn-primary" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"增加")%> onclick="addIntroduceColumn()"/>
						</div>
						<div style="margin-right:10px;display:inline-block">
							<input type="button" id="editorg_list"  class="btn btn-primary" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"删除")%> onclick="deleteIntroduceColumn()"/>
						</div>
					</div>
				</div>
				<table id="scheme_list_List">
				</table>
			</div>
		</div>
		
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
<script>
var classes = $("select");
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

$(function() {
	$(".fixed-table-toolbar").css("margin-top","0px");
	$(".container-fluid").css("max-height","100%");
	$(".fixed-table-container").css("height",$('body').height() -58 +"px");
	$(".fixed-table-body").css("height","0%");

	console.log($(".BTNGROUP_1041>div").length);
	var DIVAMOUNT = 5;
	if($(".BTNGROUP_1041>div").length > DIVAMOUNT){
		var len = $(".BTNGROUP_1041>div").length;
		$(".BTNGROUP_1041>div:gt(4)").hide();
		var selectObj = $('<div class="btn-group"><button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">更多 <span class="caret"></span></button><ul class="dropdown-menu" style="min-width:90px;left:-14px;"></ul></div>');
		$(".BTNGROUP_1041").append(selectObj);
		for(var i=DIVAMOUNT;i<len;i++){
			var liObj = $('<li style="margin-left:14px;"></li>');
			liObj.append($(".BTNGROUP_1041>div").eq(i).clone(true));
			selectObj.find('.dropdown-menu').append(liObj);
			selectObj.find('.dropdown-menu').append($('<li role="separator" class="divider"></li>'));
		}
		selectObj.find('.dropdown-menu div').show();
	}
});
	var _formId_1041='1041';
    function querys_1041() {
		var introduceId = document.getElementById("SYS_SYSTEM_SCHEME.introduceId").value;
        $("#scheme_list_List").bootstrapTable({
            url :'${pageContext.request.contextPath }/button/queryIntroduceColumnByIntroduceId.action?introduceId='+introduceId,
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
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"Id")%>',
                field : 'intrDetailId',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                    return "<a  class=\"eli w100\" style=\"font-size:14px;text-decoration:none;color:black;width:200px;\" name=\"intrDetailId\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"Id\">"+value+"</a>";
                }
            },
			{
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"当前表单字段")%>',
                field : 'formColumnLable',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                    return "<a  class=\"eli w100\" style=\"font-size:14px;text-decoration:none;color:black;width:200px;\" name=\"formColumnLable\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"当前表单字段\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"引入字段名称")%>',
                field : 'targetColumnLable',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                    return "<a  class=\"eli w100\" style=\"font-size:14px;text-decoration:none;color:black;width:200px;\" name=\"targetColumnLable\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"引入字段名称\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"引入字段类型")%>',
                field : 'targetColumnType',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                    return "<a class=\"eli w200\" style=\"font-size:14px;text-decoration:none;color:black;width:60px;\" name=\"targetColumnType\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"引入字段类型\" data-source=\"${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode1.action?deleteMark=INTRODUCE_TARGET_COLUMN_TYPE\"></a>";
				}
            },
            ],
            onClickRow: function (row, $element) {
                curRow = row;
            },
		onLoadSuccess: function (aa, bb, cc) {
                $("#scheme_list_List a").editable({
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
            }
        });
        window.operateEvents = {  
            'click #remove': function (e, value, row, index) {  
            $.ajax({  
                type: 'POST', 
                data: JSON.stringify(row),  
                url: '${pageContext.request.contextPath }/dictType/removeSysDictType.action',  
                success: function (data) {  
                    alert('<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"删除成功")%>');
                    window.location.href = window.location.href; 
                    $('#scheme_list_List').bootstrapTable(
                        'remove', {  
                            field: 'Id',  
                            values: [row.Id],  
                        }
                    );  
                    $('#scheme_list_List').bootstrapTable(
                        'refresh',{
                            url:'${pageContext.request.contextPath }/dictType/findDictTypeList2.action'  
                        }
                    );
                }
            });
        }
    };
}
/** 刷新页面 */ 
function refresh_org_list() { 
    $('#scheme_list_List').bootstrapTable('refresh'); 
}

function grid_org_list_fun(pageReqeust){
	var _filterdata={};
	
	var introduceButtonId = document.getElementById("SYS_SYSTEM_SCHEME.introduceButtonId").value;
	_filterdata={introduceButtonId:introduceButtonId};
	var userId = '${sessionScope.userid}';
	var paramsMap = {userId:userId};
	var requestParam={};
	var nodeId = '${param.nodeId}';
	nodeId = nodeId.replace(/[^0-9]/g,'');
	requestParam = {nodeId:nodeId};
	
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.formId=_formId_1041;
	pageReqeust.isView=null;
	return JSON.stringify(pageReqeust);
}
function grid_org_list_fun11(){
	$('#scheme_list_List').bootstrapTable('refresh');
}

$(function () {  
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
});
	function getdata_1881(buttonId,formId){
		var param = {};
		var data = {buttonId:buttonId,formId:formId,param:{},paramsMap:{}};
		$.map($('[name=form_1881]').serializeArray(), function(item, index){
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
	var _formId_1881='1881';
	var containerParam={};
	window.onload=function(){
		$("#tr_form").show();
		$("#tr_url").hide();
		$("#tr_fun").hide();
		
		
		for(var i=0;i<classes.length;i++){
			parame.id=classes[i].id;
			var type=$(classes[i]).attr('multiSelect');
			parame.placeholder="";
			var dataField=$(classes[i]).attr('dataField');
			var data=$(classes[i]).attr('data');
			parame.jsonParam.dictTypeCode=$(classes[i]).attr('DictName');
			if(type=="true"){
				myehr_initSelectMore(parame,dataField,data);
			}else{
				myehr_initSelect(parame,dataField,containerParam,data);
			}
		}

		var formButtonId = '${param.formButtonId}';
		if(formButtonId==undefined || formButtonId=='' ){
			formButtonId = '${param.formButtonId}';
		}
		
		if(formButtonId!='' && formButtonId!=null){
			_initData(formButtonId);
		}
	}
	
	function addIntroduceColumn(){
		var targetFormId = document.getElementById("SYS_SYSTEM_SCHEME.introduceFormId").value;
		var introduceId = document.getElementById("SYS_SYSTEM_SCHEME.introduceId").value;
		$.ajax({
			url:'${pageContext.request.contextPath }/button/isTreeOrGrid.action?formDefId='+targetFormId,
			type:'post',
			cache: false,
			contentType: 'application/json;charset=utf-8',
			success: function (text) {
				if(text>2){
					var url = '/myehr/jsp/form/formcreate/button/instroduceColumn.jsp?formId='+'${param.formId}'+'&targetFormId='+text+'&introduceId='+introduceId;
					layer.open({
						type: 2,
						title:'<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"设置参数")%>',
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
							$('#scheme_list_List').bootstrapTable('refresh'); 
						}
					});
				}else if(text==1){
					layer.alert("<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"关联树没有一个节点")%>", {
						icon: 5,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
						skin: 'layer-ext-moon' 
					})
				}else if(text==2){
					layer.alert("<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"关联树不止一个节点")%>", {
						icon: 5,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
						skin: 'layer-ext-moon' 
					})
				}
			}
		});
		
	}
	
	
	function deleteIntroduceColumn(){
		var selects = $("#scheme_list_List").bootstrapTable('getSelections');;
		if(selects==null || selects.length==0){
			alert('<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"请选择一行数据")%>');return ;
		}
		var intrDetailIds = '';
		for (var i=0;i<selects.length;i++){
			intrDetailIds+=selects[i].intrDetailId+',';
		}
		$.ajax({
			url:'${pageContext.request.contextPath }/button/deleteIntroduceColumn.action?intrDetailIds='+intrDetailIds,
			type:'post',
			cache: false,
			contentType: 'application/json;charset=utf-8',
			success: function (text) {
				if(text[0]==0){
					layer.alert("<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"操作失败")%>", {
						icon: 5,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
						skin: 'layer-ext-moon' 
					})
				}else if(text[0]=='error'){
					layer.alert("<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"操作异常")%>", {
						icon: 5,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
						skin: 'layer-ext-moon' 
					})
				}else {
					layer.alert("<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"操作成功")%>", {
						icon: 6,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
						skin: 'layer-ext-moon' 
					})
					$('#scheme_list_List').bootstrapTable('refresh'); 
				}
			}
		});
	}

	function save_formemp_emp_edit_click_1881(){
		var paramsMap = {'userId' : '${sessionScope.userid}'};
		var _param = {};
		_param.formId=_formId_1881;
		_param.buttonId=2803;
		_param = getdata_1881(_param.buttonId,_formId_1881);
		_param.paramsMap = paramsMap;
		$.ajax({
			url:'${pageContext.request.contextPath }/button/saveSysFormButtonIntroduce.action',
			type:'post',
			data: JSON.stringify(_param),
			cache: false,
			contentType: 'application/json;charset=utf-8',
			success: function (text) {
				if(text[0]==0){
					layer.alert("<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"操作失败")%>", {
						icon: 5,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
						skin: 'layer-ext-moon' 
					})
				}else if(text[0]=='error'){
					layer.alert("<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"操作异常")%>", {
						icon: 5,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
						skin: 'layer-ext-moon' 
					})
				}else {
					layer.alert("<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"操作成功")%>", {
						icon: 6,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
						skin: 'layer-ext-moon' 
					})
					closex_1881()
				}
			}
		});
	}

	function _initData(pkId){
		var formButtonId = '${param.formButtonId}';
		if(formButtonId==undefined || formButtonId=='' ){
			ruleId = '${param.formButtonId}';
		}
		
		var _form = getForm("#form_1881");
		var _Type = getType("#form_1881");
		$.ajax({
			url:'${pageContext.request.contextPath }/button/querySysFormButtonIntroduceById.action?formButtonId='+formButtonId,
			type:'post',
			//data: JSON.stringify(_param),
			cache: false,
			contentType: 'application/json;charset=utf-8',
			success: function (text) {
				if(text !=null){
					var object = text;
					for(var key in object){
						if(_form[key]!=null&&_form[key]!="undefined"){
							if(key=='ruleIsexc'){
								if(object[key]==1){
									document.getElementById(_form[key]).checked=true;
								}
							}else if(_Type[key]=="dateTime"){
								date = new Date(object[key]).Format("yyyy-MM-dd hh:mm:ss");
								document.getElementById(_form[key]).value=formatDatebox(date,_form[key]);
							}else{
								document.getElementById(_form[key]).value=object[key];
							}
						}
					};
				}
				querys_1041();
				setFormName();
			},
			error: function (jqXHR, textStatus, errorThrown) {
			}
		});
	}
	
	function setFormName(){
		var introduceFormId = document.getElementById("SYS_SYSTEM_SCHEME.introduceFormId").value;
		$.ajax({
			url:'${pageContext.request.contextPath }/button/querySysFormNameByFormId.action?introduceFormId='+introduceFormId,
			type:'post',
			//data: JSON.stringify(_param),
			cache: false,
			contentType: 'application/json;charset=utf-8',
			success: function (text) {
				document.getElementById("SYS_SYSTEM_SCHEME.introduceFormName").value = text.formDefName;
			},
			error: function (jqXHR, textStatus, errorThrown) {
			}
		});
	}
	
	function choseForm(){
		var paramFormId = "SYS_SYSTEM_SCHEME.introduceFormId";
		var paramFormName = "SYS_SYSTEM_SCHEME.introduceFormName";
		var url = '/myehr/jsp/form/formcreate/button/formChoose.jsp?paramFormId='+paramFormId+'&paramFormName='+paramFormName;
		layer.open({
			type: 2,
			title:'<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"选择表单")%>',
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
	
	$(":checkbox").click(function() {
		if ($(this).is(":checked")) {
			this.value=1;
		} else {
			this.value=0;
		}
	});
	
	//关闭
	function closex_1881(){ 
	    var index = parent.layer.getFrameIndex(window.name); //获取当前窗体索引
	    parent.layer.close(index);//执行关闭
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
		return object;
	}
	function getType(formId){
		var object=[];
			$(formId).find("input").each(function(){
				var vtype = $(this).attr('format');
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
			})
		return object;
	}
	
	function changeeSlect1(obj){
		if(obj.value=='fun'){
			$("#tr_fun").show();
			$("#tr_form").hide();
			$("#tr_url").hide();
		}else if(obj.value=='url'){
			$("#tr_fun").hide();
			$("#tr_form").hide();
			$("#tr_url").show();
		}else{
			$("#tr_fun").hide();
			$("#tr_form").show();
			$("#tr_url").hide();
		}
    };
</script>
</body>
</html>
