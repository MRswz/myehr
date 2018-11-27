<%@ page language="java" import="java.util.*" import="com.myehr.common.util.LangUtil" pageEncoding="UTF-8"%>
<%@ include file="/common/common.jsp" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<body>
<div class="container-fluid" style="height:100%;overflow-y:hidden;padding-top:10px;">
	<div>
		<div class="input-group" style="padding-bottom:10px;width:100%;z-index: 5;">
		    <div id="grid_org_list_filter">
		        <table class="cbs-table" style="width:100%">
		             <tr>
						<td style="padding-left:10px;"  width="100"  ><lable style="float:left"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"部门级别")%>: </lable></td>
						<td style="padding-left:10px;" width=200px align="left"  >						
							<select id="FILTER_DEPTCODE.DEPTCODE_DEPTCODE01_55" title="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"部门级别")%>" styleType="select" name="DEPTCODE_DEPTCODE01"  class="form-control " emptyText="请选择..."  style="" showNullItem="true" textField="dictName" valueField="dictID" DictName="B1" nullItemText="请选择..." dataField="dictList_form_734"></select>
						</td>
						<td style="float:right">
							<input id="FILTER_55" name="FILTER_55" placeholder="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"部门名称")%>,<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"部门代码")%>,<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"部门属性")%>" style="padding: 6px 30px 6px 10px;" title="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"部门名称")%>,<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"部门代码")%>,<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"部门属性")%>" type="text" class="form-control" oninput="grid_org_list_fun11_55()" />
							<i class="icon-search" style="position: absolute;right: 12px;top: 2px;cursor: pointer;"></i>
						</td>
		                <td style="margin-left:10px;float:left" align="left" >
							<div style="float:left;display:inline-block;margin-right:15px;position:relative;">
								<input class="btn btn-primary" style="width:70px;padding-left:2px;padding-right:25px;" value="查询" onclick="grid_org_list_fun11_55()">
								<i class="glyphicon glyphicon-search" style="position: absolute;right: 12px;top: 6px;cursor: pointer;color:#fff">
								</i>
							</div>
							<div style="float:left;display:inline-block;margin-right:15px;position:relative;">
								<input class="btn btn-primary" style="width:100px;padding-left:2px;padding-right:25px;" value="高级查询" onclick="grid_org_list_HeighQuery_55()">
								<i class="glyphicon glyphicon-search" style="position: absolute;right: 12px;top: 6px;cursor: pointer;color:#fff">
								</i>
							</div>
						</td>
		            </tr>
		        </table>
		    </div>
		</div>
		<div class="BTNGROUP BTNGROUP_55" style="margin:5px auto; display:inline-block;height: 30px;z-index: 6;position: relative">
			<div style="margin-right:10px;display:inline-block">
			    <input type="button" id="addorg_list"  class="btn btn-primary" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"增加")%> onclick="addorg_list_click_55()"/>
			</div>
			<div style="margin-right:10px;display:inline-block">
			    <input type="button" id="editorg_list"  class="btn btn-warning" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"修改")%> onclick="editorg_list_click_55()"/>
			</div>
			<div style="margin-right:10px;display:inline-block">
			    <input type="button" id="saveorg_list"  class="btn btn-success" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"保存")%> onclick="saveorg_list_click_55()"/>
			</div>
			<div style="margin-right:10px;display:inline-block">
			    <input type="button" id="removeorg_list"  class="btn btn-danger" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"删除")%> onclick="removeorg_list_click_55()"/>
			</div>
		</div>
	</div>
	<table id="org_list_List">
	</table>
	<div id="activity_pane" style="position:absolute;left:500px;top:70px"></div>
</div>
<script>
var heightGadedata =[];
var containerParam ={};
containerParam ={};
function changeHeightGadedata(data){
	heightGadedata = data;
}
$(function() {
    querys_55();
$(".fixed-table-toolbar").css("margin-top","38px");
$(".container-fluid").css("max-height","100%");
$(".container-fluid").css("padding-left","0");
$(".fixed-table-container").css("height",$('.container-fluid').height() -79 +"px");
$(".fixed-table-body").css("height","93%");

    initDict();
    initDate();
    console.log($(".BTNGROUP_55>div").length);
    var DIVAMOUNT = 5;
    if($(".BTNGROUP_55>div").length > DIVAMOUNT){
    	var len = $(".BTNGROUP_55>div").length;
    	$(".BTNGROUP_55>div:gt(4)").hide();
    	var selectObj = $('<div class="btn-group"><button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">更多 <span class="caret"></span></button><ul class="dropdown-menu" style="min-width:90px;left:-14px;"></ul></div>');
    	$(".BTNGROUP_55").append(selectObj);
    	for(var i=DIVAMOUNT;i<len;i++){
    		var liObj = $('<li style="margin-left:14px;"></li>');
    		liObj.append($(".BTNGROUP_55>div").eq(i).clone(true));
    		selectObj.find('.dropdown-menu').append(liObj);
    		selectObj.find('.dropdown-menu').append($('<li role="separator" class="divider"></li>'));
    	}
    	selectObj.find('.dropdown-menu div').show();
    }
});
var DEPTCODE_DEPT_CODE='';
function initFilterParam(data){
}
	var _formId_55='55';
    function querys_55() {
        $("#org_list_List").bootstrapTable({
            url :'${pageContext.request.contextPath }/form/cardformInitData.action',
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
            showColumns : true,
            showExport : true,
            uniqueId:'DEPTCODE_DEPT_ID',
            clickToSelect: true,
            showRefresh : true,
            sidePagination : "server",
            columns : [
            {
                field : 'state',
                checkbox : true,
                align : 'center',
                visible : true,
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
                    return "<a style=\"font-size:12px;text-decoration:none;color:black;width:50px;\" name=\"defaultXH\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"序号\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"部门名称")%>',
                field : 'DEPTCODE_CONTENT',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                    	  return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" onmouseover=\"openNew("+row.DEPTCODE_DEPT_ID+")\" name=\"DEPTCODE_CONTENT\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"部门名称\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"设立日期")%>',
                field : 'DEPTCODE_CREATEDATE',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    var date = "-";
                    if(value!=null){
                    var val = value+"";
                    	if((("yyyy-MM-dd"=="hh:mm")&&val.indexOf(":")>1)||("yyyy-MM-dd"=="yyyyMM")){
                    		date = value ;
                    	}else{
                        date = new Date(value).Format("yyyy-MM-dd");
                    	}
                    }
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:100px\" name=\"DEPTCODE_CREATEDATE\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"设立日期\">"+date+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"部门代码")%>',
                field : 'DEPTCODE_DEPT_CODE',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                    	  return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"DEPTCODE_DEPT_CODE\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"部门代码\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"部门ID")%>',
                field : 'DEPTCODE_DEPT_ID',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                    	  return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"DEPTCODE_DEPT_ID\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"部门ID\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"部门级别")%>',
                field : 'DEPTCODE_DEPTCODE01',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"DEPTCODE_DEPTCODE01\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"部门级别\" data-source=\"${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode1.action?deleteMark=B1&realValue="+value+"+\"></a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"部门属性")%>',
                field : 'DEPTCODE_DEPTCODE04',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                    	  return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"DEPTCODE_DEPTCODE04\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"部门属性\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"虚拟组织")%>',
                field : 'DEPTCODE_DEPTDUMMY',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                    	  return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"DEPTCODE_DEPTDUMMY\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"虚拟组织\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"部门编制")%>',
                field : 'DEPTCODE_DEPTNUM',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                    	  return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"DEPTCODE_DEPTNUM\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"部门编制\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"END_MARK")%>',
                field : 'DEPTCODE_END_MARK',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                    	  return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"DEPTCODE_END_MARK\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"END_MARK\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"全称")%>',
                field : 'DEPTCODE_FULL_NAME',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                    	  return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"DEPTCODE_FULL_NAME\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"全称\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"级别")%>',
                field : 'DEPTCODE_GRADE',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                    	  return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"DEPTCODE_GRADE\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"级别\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"独立公司")%>',
                field : 'DEPTCODE_INDEPEND',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                    	  return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"DEPTCODE_INDEPEND\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"独立公司\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"机构代码")%>',
                field : 'DEPTCODE_ORGANCODE',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                    	  return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"DEPTCODE_ORGANCODE\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"机构代码\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"上级部门")%>',
                field : 'DEPTCODE_PARENT',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                    	  return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"DEPTCODE_PARENT\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"上级部门\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"删除标识")%>',
                field : 'DEPTCODE_ORG_DEL',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                    	  return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"DEPTCODE_ORG_DEL\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"删除标识\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"上级机构ID")%>',
                field : 'DEPTCODE_PARENT_ID',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                    	  return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"DEPTCODE_PARENT_ID\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"上级机构ID\">"+value+"</a>";
                }
            },
            ],
        onClickRow: function (row, $element) {
            curRow = row;
        },
		onLoadSuccess: function (aa, bb, cc) {
                $("#org_list_List a").editable({
                    disabled: true,
                    emptytext: "-",
                    url: function (params) {
                        var sName = $(this).attr("name");
                        curRow[sName] = params.value;
                    },
                    type: 'text'
                });
            },
		onDblClickCell: function (field, value,row,td) {
	        	editorg_list_click_55('isView',row);  
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
                    $('#org_list_List').bootstrapTable(
                        'remove', {  
                            field: 'Id',  
                            values: [row.Id],  
                        }
                    );  
                    $('#org_list_List').bootstrapTable(
                        'refresh',{
                            url:'${pageContext.request.contextPath }/dictType/findDictTypeList2.action'  
                        }
                    );
                }
            });
        }
    };
}
function ON_RENDERERorg_listDEPTCODE_DEPTCODE_DEPTCODE01_55(e){
return nui.getDictText('B1',e.value);
}
/** 刷新页面 */ 
function refresh_org_list() { 
    $('#org_list_List').bootstrapTable('refresh'); 
}
/**查询条件与分页数据 */
function queryParams(pageReqeust) {
    pageReqeust.search = $("#search").val();
    pageReqeust.enabled = $("#enabled").val();
    pageReqeust.querys = $("#querys").val();
    pageReqeust.pageNo = this.offset;
    pageReqeust.pageSize = this.pageNumber;
    return pageReqeust;
}
function addorg_list_click_55(isView,data){
	title='<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"机构新增")%>';
	if('${param.DEPTCODE_DEPT_CODE}'!='' ||'${param.DEPTCODE_DEPT_ID}'!='' ){
		var url='/myehr/form/toForm.action?formId=468&DEPTCODE_DEPT_CODE=${param.DEPTCODE_DEPT_CODE}&DEPTCODE_DEPT_ID=${param.DEPTCODE_DEPT_ID}&&isView='+isView+'';
	}else{
		var url='/myehr/form/toForm.action?formId=468&DEPTCODE_DEPT_CODE='+DEPTCODE_DEPT_CODE+'&DEPTCODE_DEPT_ID='+DEPTCODE_DEPT_ID+'&isView='+isView+'';
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
		$('.layui-layer-max').click();
		},
		end:function(){
			    refresh_org_list();
		}
	});
}
function editorg_list_click_55(isView,data){
	var selects = $("#org_list_List").bootstrapTable('getSelections');
	if(selects[0].DEPTCODE_CONTENT=='WM3000品質保証部'){
		alert("'不可修改'");
		return;
	}
	if(selects!=null && selects.length>0){
		select = selects[0];
		title='<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"机构编辑")%>';
	}else if(data!=null&&isView!=null){
	select = data;
	title='<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"预览")%>';
	}else {
		alert('<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"请选择一行数据")%>');return ;
	}
	if(1==1){
		var url='/myehr/form/toForm.action?formId=469&isInit=true&DEPTCODE_DEPT_ID='+select.DEPTCODE_DEPT_ID+'&&&isView='+isView+'';
	}else{
		var url='/myehr/form/toForm.action?formId=469&isInit=true&DEPTCODE_DEPT_ID='+DEPTCODE_DEPT_ID+'&isView='+isView+'';
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
		$('.layui-layer-max').click();
		},
		end:function(){
			    refresh_org_list();
		}
	});
}

var num = 0;
function openNew(value){	
	closeNew();
	var url='/myehr/form/toForm.action?formId=469&isInit=true&DEPTCODE_DEPT_ID='+value+'&isView=isView';
	this.$loading = $('<div id="open" onmouseover="changNum("Y")" onmouseleave="changNum()" style="position:absolute;top:5%;right:0;width:85%;height:90%;z-index:1000"><iframe style="width:100%;height:100%;border:1px solid #ffcc00;" src="'+url+'"></iframe></div>');
    if(num==0){
    	$('body').append(this.$loading);
    	num++;
    }	
}
function closeNew(){
	if(num==1){
		$("#open").remove();
		num--;
	}
}
function changNum(){
	$("#open").remove();
	num--;	
}

function saveorg_list_click(){
	var columnDataRows = grid_org_list.getSelecteds();//if(columnDataRows.length==0){return;}
	var paramsMap = {};
	grid_org_list.validate();
	if(grid_org_list.isValid() == false) {
		var error = grid_org_list.getCellErrors()[0];
		grid_org_list.beginEditCell(error.record, error.column);
		return;
	}
	var changeData = grid_org_list.getChanges();
	if(changeData==null||changeData.length==0) return;
	var  _param ={formId:_formId_org_list,datas:changeData,paramsMap:paramsMap};
	_param.buttonId=496;
	dcf.mask();
	$.ajax({
		url:'com.dcf.form.runtime.gridformButton.saveDatas.biz.ext',
		type:'post',
		data: nui.encode(_param),
		cache: false,
		contentType: 'text/json',
		success: function (text) {
			dcf.unmask();
			if(!text.recode||text.recode[0]=='error'){
				nui.alert(text.recode[1]);
			} else {
				grid_org_list.reload();
				if(window.parent._loadmstmaindata){;
					window.parent._loadmstmaindata();
				};
;
				if("undefined" != typeof mstTab_activechanged ){
					mstTab_activechanged();
				}
				;
			}
		},
		error: function (jqXHR, textStatus, errorThrown) {
		}
	});
}
function removeorg_list_click_55(){
	var selects = $("#org_list_List").bootstrapTable('getSelections');;
	if(selects!=null && selects.length>0){
		select = selects[0];
	}else {
		alert('<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"请选择数据")%>');return ;
	}
	var r=confirm("确定删除选中记录？");
	if (r==true){
		var _rowvalids = [];
		for(var i=0;i<selects.length;i++) {;
			if (selects[i].DEPT_ID!="") {;
				_rowvalids.push(selects[i]);
			}
		}
		var  _param ={formId:_formId_55,params:_rowvalids};
		if("undefined" != typeof setCacadeParam ){
			setCacadeParam(_param);
		};
		$.ajax({
			url:'${pageContext.request.contextPath }/form/removeData.action',
			type:'post',
			data: JSON.stringify(_param),
			cache: false,
			contentType: 'application/json;charset=utf-8',
			success: function (text) {
				if(text!='1'){
					alert('<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"删除失败")%>');
				} else {
					refresh_org_list();;
					if("undefined" != typeof mstTab_activechanged ){
						mstTab_activechanged();
					}
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
var filterParam = {};
var queryParams;
function grid_org_list_fun(pageReqeust){
	var _filterdata={};
	if(document.getElementById('grid_org_list_filter')){
	if($("[id='FILTER_DEPTCODE.DEPTCODE_DEPTCODE01_55']").attr('multiSelect')){
		var val = "";
		var arr = $("[id='FILTER_DEPTCODE.DEPTCODE_DEPTCODE01_55']").val();
		if(arr==null){
		}else{
			for(var i=0;i<arr.length;i++){
				val+=arr[i]+',';
			}
			val = val.substring(0,val.length-1);
		}
		var DEPTCODE_DEPTCODE01=val;
	}else if(($("[id='FILTER_DEPTCODE.DEPTCODE_DEPTCODE01_55']").attr('styleType')=="select")||($("[id='FILTER_DEPTCODE.DEPTCODE_DEPTCODE01_55']").attr('styleType')=="dateTime")){
			var DEPTCODE_DEPTCODE01=$("[id='FILTER_DEPTCODE.DEPTCODE_DEPTCODE01_55']").val();
		}else{
				var DEPTCODE_DEPTCODE01=$("[id='FILTER_55']").val();
		}
	if($("[id='FILTER_DEPTCODE.DEPTCODE_CONTENT_55']").attr('multiSelect')){
		var val = "";
		var arr = $("[id='FILTER_DEPTCODE.DEPTCODE_CONTENT_55']").val();
		if(arr==null){
		}else{
			for(var i=0;i<arr.length;i++){
				val+=arr[i]+',';
			}
			val = val.substring(0,val.length-1);
		}
		var DEPTCODE_CONTENT=val;
	}else if(($("[id='FILTER_DEPTCODE.DEPTCODE_CONTENT_55']").attr('styleType')=="select")||($("[id='FILTER_DEPTCODE.DEPTCODE_CONTENT_55']").attr('styleType')=="dateTime")){
			var DEPTCODE_CONTENT=$("[id='FILTER_DEPTCODE.DEPTCODE_CONTENT_55']").val();
		}else{
				var DEPTCODE_CONTENT=$("[id='FILTER_55']").val();
		}
	if($("[id='FILTER_DEPTCODE.DEPTCODE_DEPT_CODE_55']").attr('multiSelect')){
		var val = "";
		var arr = $("[id='FILTER_DEPTCODE.DEPTCODE_DEPT_CODE_55']").val();
		if(arr==null){
		}else{
			for(var i=0;i<arr.length;i++){
				val+=arr[i]+',';
			}
			val = val.substring(0,val.length-1);
		}
		var DEPTCODE_DEPT_CODE=val;
	}else if(($("[id='FILTER_DEPTCODE.DEPTCODE_DEPT_CODE_55']").attr('styleType')=="select")||($("[id='FILTER_DEPTCODE.DEPTCODE_DEPT_CODE_55']").attr('styleType')=="dateTime")){
			var DEPTCODE_DEPT_CODE=$("[id='FILTER_DEPTCODE.DEPTCODE_DEPT_CODE_55']").val();
		}else{
				var DEPTCODE_DEPT_CODE=$("[id='FILTER_55']").val();
		}
	if($("[id='FILTER_DEPTCODE.DEPTCODE_DEPTCODE04_55']").attr('multiSelect')){
		var val = "";
		var arr = $("[id='FILTER_DEPTCODE.DEPTCODE_DEPTCODE04_55']").val();
		if(arr==null){
		}else{
			for(var i=0;i<arr.length;i++){
				val+=arr[i]+',';
			}
			val = val.substring(0,val.length-1);
		}
		var DEPTCODE_DEPTCODE04=val;
	}else if(($("[id='FILTER_DEPTCODE.DEPTCODE_DEPTCODE04_55']").attr('styleType')=="select")||($("[id='FILTER_DEPTCODE.DEPTCODE_DEPTCODE04_55']").attr('styleType')=="dateTime")){
			var DEPTCODE_DEPTCODE04=$("[id='FILTER_DEPTCODE.DEPTCODE_DEPTCODE04_55']").val();
		}else{
				var DEPTCODE_DEPTCODE04=$("[id='FILTER_55']").val();
		}
		_filterdata={DEPTCODE01:DEPTCODE_DEPTCODE01,CONTENT:DEPTCODE_CONTENT,DEPT_CODE:DEPTCODE_DEPT_CODE,DEPTCODE04:DEPTCODE_DEPTCODE04};
	}
	var paramsMap = {};
	var requestParam={};
	if('${param.DEPTCODE_DEPT_CODE}'==''){
		if(DEPTCODE_DEPT_CODE==undefined){
			requestParam = {DEPTCODE_DEPT_CODE:'${param.DEPTCODE_DEPT_CODE}'};
		}else{
			requestParam = {DEPTCODE_DEPT_CODE:DEPTCODE_DEPT_CODE+""};
		}
	}else{
		requestParam = {DEPTCODE_DEPT_CODE:'${param.DEPTCODE_DEPT_CODE}'};
	}
	pageReqeust.containerParam=containerParam;
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.userIds='${param.empIds}';
	pageReqeust.formId=_formId_55;
	pageReqeust.isView=null;
	if(heightGadedata!=null&&heightGadedata!=undefined){
		pageReqeust.heightGrade = heightGadedata;
	}
	queryParams = JSON.stringify(pageReqeust);
	return queryParams;
}
function grid_org_list_fun11_55(){
	$('#org_list_List').bootstrapTable('refresh');
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
		var dataField=$(classes[i]).attr('dataField');
		parame.placeholder="";
		parame.jsonParam.nullItemText=$(classes[i]).attr('nullItemText');
		parame.jsonParam.dictTypeCode=$(classes[i]).attr('DictName');
		if(type=="true"){
			myehr_initSelectMore(parame,dataField);
		}else{
			myehr_initSelect(parame,dataField);
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
			$('.form_date5').datetimepicker({ 
			 language:  'zh-CN',  
			 format:"yyyymm",  
			 weekStart: 1,  
			 todayBtn:  1,  
			 autoclose: 1,  
			 todayHighlight: 1,  
			 startView: 3,  
			 minView: 3,  
			 forceParse: 0,  
			 pickerPosition: "bottom-left"  
			});  
} 
/**取url参数值  */
function getQueryString(name) {
    var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)", "i");
    var r = window.location.search.substr(1).match(reg);
    if (r != null) return unescape(r[2]); return null;
}
	function grid_org_list_HeighQuery_55() {
		layer.open({
			type: 2,
			showMaxButton: true,
			title:"<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"高级查询设置")%>" ,
			area: ['855', '500'],
			maxmin: true,
			content:'/myehr/jsp/form/button/heightGrade.jsp?formFunction=grid_org_list_fun11_55&formDefId=55&formDefLayout=2',
			success:function(layero,index){
				},
				end:function(){
			}
			});
	}
	//关闭
	function closex_55(){ 
			    var index = parent.layer.getFrameIndex(window.name); //获取当前窗体索引
			    parent.layer.close(index);//执行关闭
	}
</script>
</body>
</html>
