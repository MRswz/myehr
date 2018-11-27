<%@ page language="java" import="com.myehr.common.util.LangUtil" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/common/common.jsp" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<body>
<form id="form_3625" name="form_3625"  style="height:100%;">
<div class="container-fluid" style="height:50%;overflow:auto;padding-top:5px">
	<div id="form_674" style="margin-top:0px;">
		<div class="BTNGROUP BTNGROUP_674" style="margin:5px auto; display:inline-block;height: 30px;z-index: 6;position: relative">
			<div style="margin-right:10px;display:inline-block">
			    <input type="button" id="executeSQLORG_COMP_CERT_ADD"  class="btn btn-success" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"保存")%> onclick="executeSQLORG_COMP_CERT_ADD_click_674()"/>
			</div>
		</div>
</div>
</div>
<div class="container-fluid" style="height:50%;overflow:auto;padding-top:5px">
	<ul class="nav nav-tabs" id="myTab">
		<li class="active"><a href="#Tab_1">机构信息列表</a></li>
		<li ><a href="#Tab_2">机构管理历史列表</a></li>
	</ul>
	<div class="tab-content">
		<div class="tab-pane active" id="Tab_1">
			<div class="container-fluid">
				<div style="">
					<div class="BTNGROUP BTNGROUP_672" style="margin:5px auto; display:inline-block;height: 30px;z-index: 6;position: relative">
						<div style="margin-right:10px;display:inline-block">
							<input type="button" id="editORG_COMP_CARD"  class="btn btn-warning" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"详情")%> onclick="editORG_COMP_CARD_click_672()"/>
						</div>
						<div style="margin-right:10px;display:inline-block">
							<input type="button" id="edit2ORG_COMP_CARD"  class="btn btn-warning" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"机构证件")%> onclick="edit2ORG_COMP_CARD_click_672()"/>
						</div>
						<div style="margin-right:10px;display:inline-block">
							<input type="button" id="introduceORG_COMP_CARD"  class="btn btn-primary" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"机构管理历史")%> onclick="introduceORG_COMP_CARD_click_672()"/>
						</div>
						<div style="margin-right:10px;display:inline-block">
							<input type="button" id="removeORG_COMP_CARD"  class="btn btn-danger" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"删除")%> onclick="removeORG_COMP_CARD_click_672()"/>
						</div>
					</div>
					<table id="ORG_COMP_CARD_List">
					</table>
					<div id="activity_pane" style="position:absolute;left:500px;top:70px"></div>
				</div>
			</div>
		</div>
		<div class="tab-pane " id="Tab_2">
			<div class="container-fluid">
				<div style="">
					<div class="BTNGROUP BTNGROUP_675" style="margin:5px auto; display:inline-block;height: 30px;z-index: 6;position: relative">
						<div style="margin-right:10px;display:inline-block">
							<input type="button" id="closeorg_compHis_list"  class="btn btn-primary" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"关闭")%> onclick="closex()"/>
						</div>
					</div>
					<table id="org_compHis_list_List">
					</table>
					<div id="activity_pane" style="position:absolute;left:500px;top:70px"></div>
				</div>
			</div>
		</div>
		<div id="activity_pane" style="position:absolute;left:500px;top:70px;"></div>
	</div>
</div>
</form>
<script>
    querys_672();
    querys_675();
	$('#myTab a').click(function (e) {
				e.preventDefault();
				$(this).tab('show');
				$(this).find("table").bootstrapTable('refresh');
	});if('isView'=='${param.isView}'){
	cardIsViewFunction();
}
cardDateWidInitFunction(); 
});
function getdata(buttonId,formId){
	return cardGetdata(buttonId,formId);
}
	var _formId_672='672';
	var _formId_675='675';
var columnvisible={};
function initRoleColumn(columnFormId){
    var url = '${pageContext.request.contextPath }/form/queryCardFormColumnsWithUserId.action?formId='+columnFormId;
    $.ajax({
        url:url,
        type:'post',
        cache: false,
        async: false,
        contentType:'application/json',
        success:function(datas){
            for(var i=0;i<datas.length;i++){
                if(datas[i].formColumnUsName==1||datas[i].formColumnUsName==2){
                    if(datas[i].formColumnType==1){
                        var entityTablename = datas[i].formEntityTablename;
                        var fieldTablename = datas[i].formFieldTablename;
                        var columnName=entityTablename.replace(/_/g,'')+'_'+fieldTablename;
                        columnvisible[columnName]=true;
                    }else{
                        columnvisible[fieldTablename]=true;
                    }
                }else{
                    if(datas[i].formColumnType==1){
                        var entityTablename = datas[i].formEntityTablename;
                        var fieldTablename = datas[i].formFieldTablename;
                        var columnName=entityTablename.replace(/_/g,'')+'_'+fieldTablename;
                        columnvisible[columnName]=false;
                    }else{
                        columnvisible[fieldTablename]=true;
                    }
                }
            }
        }
    });
}
function initRoleButtons(buttonFormId,buttonFormCode){
    var url = '${pageContext.request.contextPath }/form/queryCardFormButtonsWithUserId.action?formId='+buttonFormId;
    $.ajax({
        url:url,
        type:'post',
        cache: false,
        async: false,
        contentType:'application/json',
        success:function(datas){
            for(var i=0;i<datas.length;i++){
                if(datas[i].powerType==4){
                    var obj = $("#"+datas[i].formButtonCode+buttonFormCode+"");
                    obj[0].parentNode.style.display="none";
                }else if(datas[i].powerType==3){
                    var obj = $("#"+datas[i].formButtonCode+buttonFormCode+"");
                    obj[0].parentNode.style.display="none";
                }else if(datas[i].powerType==2){
                    var obj = $("#"+datas[i].formButtonCode+buttonFormCode+"");
                    obj[0].disabled=true;
                }else if(datas[i].powerType==0){
                    var obj = $("#"+datas[i].formButtonCode+buttonFormCode+"");
                    obj[0].parentNode.style.display="none";
                }
            }
        }
    });
}
    function querys_672() {
        initRoleColumn('672');
        initRoleButtons('672','ORG_COMP_CARD');
        $("#ORG_COMP_CARD_List").bootstrapTable({
            url :'${pageContext.request.contextPath }/form/cardformInitData.action',
            contentType: 'application/json;charset=utf-8',
            dataType:'json',
            method:'post',
            height : 500,
            undefinedText : '-',
            pagination : true,
            striped : true,
            fixedColumns: false,
            fixedNumber:0,
            queryParams : grid_ORG_COMP_CARD_fun,
            cache : false,
            pageSize : 10, 
            pageList : [10,20,50,10000], 
            toolbar : "#toolbar",
            showColumns : true,
            showExport : true,
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
            ],
            onClickRow: function (row, $element) {
                curRow = row;
            },
		onLoadSuccess: function (aa, bb, cc) {
                $("#ORG_COMP_CARD_List a").editable({
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
        	editORG_COMP_CARD_click_672('isView',row);  
         } ,
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
var columnvisible={};
function initRoleColumn(columnFormId){
    var url = '${pageContext.request.contextPath }/form/queryCardFormColumnsWithUserId.action?formId='+columnFormId;
    $.ajax({
        url:url,
        type:'post',
        cache: false,
        async: false,
        contentType:'application/json',
        success:function(datas){
            for(var i=0;i<datas.length;i++){
                if(datas[i].formColumnUsName==1||datas[i].formColumnUsName==2){
                    if(datas[i].formColumnType==1){
                        var entityTablename = datas[i].formEntityTablename;
                        var fieldTablename = datas[i].formFieldTablename;
                        var columnName=entityTablename.replace(/_/g,'')+'_'+fieldTablename;
                        columnvisible[columnName]=true;
                    }else{
                        columnvisible[fieldTablename]=true;
                    }
                }else{
                    if(datas[i].formColumnType==1){
                        var entityTablename = datas[i].formEntityTablename;
                        var fieldTablename = datas[i].formFieldTablename;
                        var columnName=entityTablename.replace(/_/g,'')+'_'+fieldTablename;
                        columnvisible[columnName]=false;
                    }else{
                        columnvisible[fieldTablename]=true;
                    }
                }
            }
        }
    });
}
function initRoleButtons(buttonFormId,buttonFormCode){
    var url = '${pageContext.request.contextPath }/form/queryCardFormButtonsWithUserId.action?formId='+buttonFormId;
    $.ajax({
        url:url,
        type:'post',
        cache: false,
        async: false,
        contentType:'application/json',
        success:function(datas){
            for(var i=0;i<datas.length;i++){
                if(datas[i].powerType==4){
                    var obj = $("#"+datas[i].formButtonCode+buttonFormCode+"");
                    obj[0].parentNode.style.display="none";
                }else if(datas[i].powerType==3){
                    var obj = $("#"+datas[i].formButtonCode+buttonFormCode+"");
                    obj[0].parentNode.style.display="none";
                }else if(datas[i].powerType==2){
                    var obj = $("#"+datas[i].formButtonCode+buttonFormCode+"");
                    obj[0].disabled=true;
                }else if(datas[i].powerType==0){
                    var obj = $("#"+datas[i].formButtonCode+buttonFormCode+"");
                    obj[0].parentNode.style.display="none";
                }
            }
        }
    });
}
    function querys_675() {
        initRoleColumn('675');
        initRoleButtons('675','org_compHis_list');
        $("#org_compHis_list_List").bootstrapTable({
            url :'${pageContext.request.contextPath }/form/cardformInitData.action',
            contentType: 'application/json;charset=utf-8',
            dataType:'json',
            method:'post',
            height : 500,
            undefinedText : '-',
            pagination : true,
            striped : true,
            fixedColumns: false,
            fixedNumber:0,
            queryParams : grid_org_compHis_list_fun,
            cache : false,
            pageSize : 10, 
            pageList : [10,20,50,10000], 
            toolbar : "#toolbar",
            showColumns : true,
            showExport : true,
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
            ],
            onClickRow: function (row, $element) {
                curRow = row;
            },
		onLoadSuccess: function (aa, bb, cc) {
                $("#org_compHis_list_List a").editable({
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
        	editorg_compHis_list_click_675('isView',row);  
         } ,
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
/** 刷新页面 */ 
function refresh_ORG_COMP_CARD() { 
    $('#ORG_COMP_CARD_List').bootstrapTable('refresh'); 
}
/** 刷新页面 */ 
function refresh_org_compHis_list() { 
    $('#org_compHis_list_List').bootstrapTable('refresh'); 
}
function editORG_COMP_CARD_click_672(isView,data){
	var selects = $("#ORG_COMP_CARD_List").bootstrapTable('getSelections');;
	if(selects!=null && selects.length>0){
		select = selects[0];;
		title='<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"机构详情")%>';
	}else if(data!=null&&isView!=null){
	select = data;
	title='<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"预览")%>';
	}else {
		alert('<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"请选择一行数据")%>');return ;
	}
	if(1==1){
		var url='/myehr/form/toForm.action?formId=673&isInit=true&ORGCOMPANY_compid='+select.ORGCOMPANY_compid+'&&&isView='+isView+'';
	}else{
		var url='/myehr/form/toForm.action?formId=673&isInit=true&ORGCOMPANY_compid='+ORGCOMPANY_compid+'&isView='+isView+'';
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
			    refresh_ORG_COMP_CARD();
		}
	});
}
function edit2ORG_COMP_CARD_click_672(isView,data){
	var selects = $("#ORG_COMP_CARD_List").bootstrapTable('getSelections');;
	if(selects!=null && selects.length>0){
		select = selects[0];;
		title='<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"机构证件")%>';
	}else if(data!=null&&isView!=null){
	select = data;
	title='<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"预览")%>';
	}else {
		alert('<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"请选择一行数据")%>');return ;
	}
	if(1==1){
		var url='/myehr/form/toForm.action?formId=674&isInit=true&ORGCOMPANY_compid='+select.ORGCOMPANY_compid+'&&&isView='+isView+'';
	}else{
		var url='/myehr/form/toForm.action?formId=674&isInit=true&ORGCOMPANY_compid='+ORGCOMPANY_compid+'&isView='+isView+'';
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
			    refresh_ORG_COMP_CARD();
		}
	});
}
//引入按钮处理函数
	function introduceORG_COMP_CARD_click_672(){
		layer.open({
			type:2,
			content:"/myehr/form/toForm.action?formId=675&intrToId=672&intrButtonId=1713",
			shadeClose: true,
			maxmin:true,
			shade: 0.8,
			zIndex:9999,
			title:"<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"引入机构管理历史列表")%>" ,
			area: ['1000', '600'],
			success:function(layero,index){ 
			$('.layui-layer-max').click();
			},
			end:function(){
				refresh_ORG_COMP_CARD();
			}
		 }); 
	}
var filterParam = {};
var queryParams;
function grid_ORG_COMP_CARD_fun(pageReqeust){
	var _filterdata={};
	if(document.getElementById('grid_ORG_COMP_CARD_filter')){
	}
	var paramsMap = {};
	var requestParam={};
	if('${param.ORGVCOMPANY_orgcode}'==''){
		if(ORGVCOMPANY_orgcode==undefined){
			requestParam = {ORGVCOMPANY_orgcode:'${param.ORGVCOMPANY_orgcode}'};
		}else{
			requestParam = {ORGVCOMPANY_orgcode:ORGVCOMPANY_orgcode+""};
		}
	}else{
		requestParam = {ORGVCOMPANY_orgcode:'${param.ORGVCOMPANY_orgcode}'};
	}
	pageReqeust.containerParam=containerParam_672;
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.userIds='${param.empIds}';
	pageReqeust.formId=_formId_672;
	pageReqeust.isView=null;
	if(heightGadedata_672!=null&&heightGadedata_672!=undefined){
		pageReqeust.heightGrade = heightGadedata_672;
	}
	queryParams = JSON.stringify(pageReqeust);
	return queryParams;
}
function grid_ORG_COMP_CARD_fun11_672(){
	$('#ORG_COMP_CARD_List').bootstrapTable('refresh');
}
	function grid_ORG_COMP_CARD_HeighQuery_672() {
		layer.open({
			type: 2,
			showMaxButton: true,
			title:"<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"高级查询设置")%>" ,
			area: ['855', '500'],
			maxmin: true,
			content:'/myehr/jsp/form/button/heightGrade.jsp?formFunction=grid_ORG_COMP_CARD_fun11_672&formDefId=672&formDefLayout=2',
			success:function(layero,index){
				},
				end:function(){
			}
			});
	}
var filterParam = {};
var queryParams;
function grid_org_compHis_list_fun(pageReqeust){
	var _filterdata={};
	if(document.getElementById('grid_org_compHis_list_filter')){
	}
	var paramsMap = {};
	var requestParam={};
		requestParam = {};
	pageReqeust.containerParam=containerParam_675;
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.userIds='${param.empIds}';
	pageReqeust.formId=_formId_675;
	pageReqeust.isView=null;
	if(heightGadedata_675!=null&&heightGadedata_675!=undefined){
		pageReqeust.heightGrade = heightGadedata_675;
	}
	queryParams = JSON.stringify(pageReqeust);
	return queryParams;
}
function grid_org_compHis_list_fun11_675(){
	$('#org_compHis_list_List').bootstrapTable('refresh');
}
	function grid_org_compHis_list_HeighQuery_675() {
		layer.open({
			type: 2,
			showMaxButton: true,
			title:"<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"高级查询设置")%>" ,
			area: ['855', '500'],
			maxmin: true,
			content:'/myehr/jsp/form/button/heightGrade.jsp?formFunction=grid_org_compHis_list_fun11_675&formDefId=675&formDefLayout=2',
			success:function(layero,index){
				},
				end:function(){
			}
			});
	}

	}

	//初始化表单权限字段
	function initRoleColumn(formId){
	    var url = '${pageContext.request.contextPath }/form/queryCardFormColumnsWithUserId.action?formId='+formId;
	    $.ajax({
	        url:url,
	        type:'post',
	        cache: false,
	        async: false,
	        contentType:'application/json',
	        success:function(datas){
	            for(var i=0;i<datas.length;i++){
	                if(datas[i].formColumnShowType=='hide'){
	                    continue;
	                }
	                if(datas[i].formColumnUsName==0 || datas[i].formColumnUsName==3 || datas[i].formColumnUsName==4){
		                if(datas[i].formColumnGuiType==1){
		                    var entityTablename = datas[i].formEntityTablename;
		                    var fieldTablename = datas[i].formFieldTablename;
		                    var columnName=entityTablename+'.'+entityTablename.replace(/_/g,'')+'_'+fieldTablename+'_'+674;
		                    var obj = $("[id='"+columnName+"']")[0].parentNode.parentNode;
		                    obj.style.display="none";
		                }else if(datas[i].formColumnGuiType==2){
		                    var entityTablename = datas[i].formEntityTablename;
		                    var fieldTablename = datas[i].formFieldTablename;
		                    var columnName=entityTablename+'.'+entityTablename.replace(/_/g,'')+'_'+fieldTablename+'_'+674;
		                    var obj = $("[id='"+columnName+"']")[0].parentNode.parentNode;
		                    obj.style.display="none";
		                }else if(datas[i].formColumnGuiType==6){
		                    var entityTablename = datas[i].formEntityTablename;
		                    var fieldTablename = datas[i].formFieldTablename;
		                    var columnName=entityTablename+'.'+entityTablename.replace(/_/g,'')+'_'+fieldTablename+'_'+674;
		                    var obj = $("[id='"+columnName+"']")[0].parentNode.parentNode.parentNode;
		                    obj.style.display="none";
		                }
	                }
	                if(datas[i].formColumnUsName==2){
		                if(datas[i].formColumnGuiType==1){
		                    var entityTablename = datas[i].formEntityTablename;
		                    var fieldTablename = datas[i].formFieldTablename;
		                    var columnName=entityTablename+'.'+entityTablename.replace(/_/g,'')+'_'+fieldTablename+'_'+674;
		                    var obj = $("[id='"+columnName+"']")[0];
		                    obj.disabled=true;
		                }else if(datas[i].formColumnGuiType==2){
		                    var entityTablename = datas[i].formEntityTablename;
		                    var fieldTablename = datas[i].formFieldTablename;
		                    var columnName=entityTablename+'.'+entityTablename.replace(/_/g,'')+'_'+fieldTablename+'_'+674;
		                    var obj = $("[id='"+columnName+"']")[0];
		                    obj.disabled=true;
		                }else if(datas[i].formColumnGuiType==6){
		                    var entityTablename = datas[i].formEntityTablename;
		                    var fieldTablename = datas[i].formFieldTablename;
		                    var columnName=entityTablename+'.'+entityTablename.replace(/_/g,'')+'_'+fieldTablename+'_'+674;
		                    var obj = $("[id='"+columnName+"']")[0];
		                    obj.disabled=true;
		                }
	                }
	            }
	        }
	    });
	}
//初始化表单按钮字段
function initRoleButtons(){
    var url = '${pageContext.request.contextPath }/form/queryCardFormButtonsWithUserId.action?formId=674';
    $.ajax({
        url:url,
        type:'post',
        cache: false,
        async: false,
        contentType:'application/json',
        success:function(datas){
            for(var i=0;i<datas.length;i++){
                if(datas[i].powerType==4){
                    var obj = $("#"+datas[i].formButtonCode+"ORG_COMP_CERT_ADD");
                    obj[0].parentNode.style.display="none";
                }else if(datas[i].powerType==3){
                    var obj = $("#"+datas[i].formButtonCode+"ORG_COMP_CERT_ADD");
                    obj[0].parentNode.style.display="none";
                }else if(datas[i].powerType==2){
                    var obj = $("#"+datas[i].formButtonCode+"ORG_COMP_CERT_ADD");
                    obj[0].disabled=true;
                }else if(datas[i].powerType==0){
                    var obj = $("#"+datas[i].formButtonCode+"ORG_COMP_CERT_ADD");
                    obj[0].parentNode.style.display="none";
                }
            }
        }
    });
}
	//唯一验证
	function uniqueVerifyBlur(obj){ 
	    var id = obj.id;
	    var strs= new Array();
	    strs= id.split("\.");
	    var tableName= strs[0];
	    strs= strs[1].split("_");
	    var fieldName= strs[0];
	    var value = document.getElementById(id).value;
	    var pkId = document.getElementById("._674").value;
	    $.ajax({ 
		       url:'/myehr/form/checkUniqueVerify.action?tableName='+tableName+'&fieldName='+fieldName+'&value='+value+'&pkId='+pkId+'&pkFieldName=',
	        type:'post',
			   cache: false,
			   contentType: 'application/json;charset=utf-8',
			   success: function (text) {
				   if(text[0]=='1'){
					   obj.value='';
					   obj.style['border-color']='red';
					   obj.setAttribute("placeholder",text[1]);
				   }
				   if(text[0]=='0'){
					   obj.style['border-color']='#CCC';
				   }
			   }
		   });
	}
</script>
</body>
</html>
