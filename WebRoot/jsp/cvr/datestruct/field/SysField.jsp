<%@ page language="java" import="java.util.*" import="com.myehr.common.util.LangUtil" pageEncoding="UTF-8"%>
<%@ include file="/common/cardcommon.jsp" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<style type="text/css">
#FieldList tbody>tr>td .form-control{border:none}
#FieldList tbody>tr>td {padding:2px 5px;font-size:12px}
#FieldList .form-control{width:auto}
</style>
</head>
<body>
<div id="form" class="wizard-big">
	<div class="row">
		<div id="group" name="form_step3" class="col-sm-12" >
			<div class="container-fluid" style="">
				<div style="">
					<div style="padding:5px 8px 0 8px;height:100%">
						<div class="input-group">
						    <div id="grid_emp_emp_list_filter">
						        <table class="cbs-table" style="margin-bottom:5px">
						             <tr>
										<td style="padding-left:10px;font-size:14px;font-weight:600"  width="80"  >
											<lable><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"删除标识")%>: </lable></td>
										<td style="padding-left:10px;"  align="left"  >
											<select id="deleteMark" title="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"删除标识")%>" onchange="updateJsp()" name="account"  class="form-control"  DictName="SYS_COMMON_YES_NO"  dataField="dictList">
											</select>
										</td>
						            </tr>
						        </table>
						    </div>
						</div>
						<div class="BTNGROUP_55" style="margin:0 auto; display:block;height: 30px;">
						
							<div style="display:inline-block">
								<input type="hidden" id="lead"  class="btn btn-danger" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"引入标准字段")%> onclick="leadDataField()"/>
							</div>
							<div style="display:inline-block">
								<input type="button" id="add"  class="btn btn-primary" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"新增字段")%> onclick="addRow()"/>
							</div>
							<div style="display:inline-block">
								<input type="button" id="save"  class="btn btn-warning" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"更新字段")%> onclick="saveData()"/>
							</div>
							<div style="display:inline-block">
								<input type="button" id="saveAndCreate"  class="btn btn-success" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"保存信息并创建")%> onclick="saveDataAndCreate()"/>
							</div>
							<div style="display:inline-block">
								<input type="button" id="editComb"  class="btn btn-warning" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"编辑下拉信息")%> onclick="widgetConfig()"/>
							</div>
							<div id="grid_ORG_comp_info_filter" style="float:right;display:inline-block;position:relative;">
								<input id="search" name="FILTER_1003" placeholder="字段名称,字段中文名" style="padding: 6px 30px 6px 10px;height:22px" title="Search" type="text" class="form-control" oninput="search()" />
								<i class="icon-search" style="position: absolute;right: 12px;top: 1px;cursor: pointer;"></i>
							</div>
						</div>
						
			            
						<table id="FieldList">
						</table>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
    
<script>
$(function() {
	initDict();
    querys(); 
    $(".fixed-table-body").css("height","78%");
})  


var datarows;
    /**下拉控件 */
	var classes ;
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
}
 
function querys() {   
    $("#FieldList").bootstrapTable({  
        url : '${pageContext.request.contextPath }/FieldList/findFieldList.action',  
        height : '800',  
        undefinedText : '-',
        nullText:'-',  
        pagination : true, // 分页  
        striped : true, // 是否显示行间隔色  
        queryParams : queryParams,  
        cache : false, // 是否使用缓存  
        pageList : [ 10, 20, 200 ],  
		clickToSelect: true,
        toolbar : "#toolbar",// 指定工具栏  
        uniqueId : "fieldId", // 每一行的唯一标识  
        sidePagination : "server", // 服务端处理分页  
        columns : [ {  
	        title : '操作',  
	        field : 'fieldId', // 字段  
	        align: 'center',
	        valign: 'middle',
	        formatter: function (value, row, index) {
	        	if(value==undefined){
	        		value = "";
	        	}
	        	return "<input type=\"hidden\" value='"+value+"'/><div style='width:130px'> <button type=\"button\" class=\"btn btn-default btn-sm remove\" onclick=\"remove(this)\" ><span class=\"glyphicon glyphicon-trash\"></span>删除"+
	        		   "<button type=\"hidden\" class=\"btn btn-default btn-sm recover\" onclick=\"recover(this)\" ><span class=\"glyphicon glyphicon-share-alt\"></span>恢复</div>";
	    	}
		},{  
            title : '字段名称',  
            field : 'fieldCode', // 字段  
            align : 'center', // 对齐方式（左 中 右）  
            valign : 'middle',
            formatter: function (value, row, index) {
	        	if(value==undefined){
	        		value = "";
	        	}
                return "<div style=\"position:relative\"><input class=\"form-control eli w100px\" name=\"fieldCode\" style=\"padding:0 24px 0 12px;text-align:center;\" data-type=\"text\" title=\"字段名称\" value=\""+value+"\"/>";
                    	
            }
        }, {  
            title : '字段中文名',  
            field : 'fieldChinaName',  
            align : 'center',  
            valign : 'middle',
            formatter: function (value, row, index) {
	        	if(value==undefined){
	        		value = "";
	        	}
                return "<div style=\"position:relative\"><input class=\"form-control eli w100px\" name=\"fieldChinaName\" style=\"padding:0 24px 0 12px;text-align:center;\" data-type=\"text\" title=\"字段中文名\" value=\""+value+"\"/>";
                    	
            }
        }, {  
            title : '字段类型',  
            field : 'fieldType',  
            align : 'center',  
            valign : 'middle',
            formatter: function (value, row, index) {
            	
	        	if(value==undefined){
	        		value = "";
	        	}else{
	        		value = value.toUpperCase();
	        	}
                return "<select id=\"fieldType"+index+"\" class=\"form-control eli w100px\"  name=\"fieldType\" DictName=\"DATA_TYPE_SQLSERVER\" dataField=\"\" title=\"字段类型\" value=\""+value+"\"></selcct>";
                    	
            }
        }, {  
            title : '字段长度',  
            field : 'fieldLen',  
            align : 'center',  
            valign : 'middle',
            formatter: function (value, row, index) {
	        	if(value==undefined){
	        		value = "";
	        	}
                return "<div style=\"position:relative\"><input class=\"form-control eli w80px\" name=\"fieldLen\" style=\"padding:0 24px 0 12px;text-align:center;width:80px\" data-type=\"text\" title=\"字段长度\" value=\""+value+"\"/>";
                    	
            }
        }, {  
            title : '精度',  
            field : 'fieldDict',  
            align : 'center',  
            valign : 'middle',
            formatter: function (value, row, index) {
	        	if(value==undefined){
	        		value = "";
	        	}
                return "<div style=\"position:relative\"><input class=\"form-control eli w50px\" name=\"fieldDict\" style=\"padding:0 24px 0 12px;text-align:center;width:50px\" data-type=\"text\" title=\"精度\" value=\""+value+"\"/>";
                    	
            }
            }, {  
            title : '是否主键',  
            field : 'fieldIsKey',  
            align : 'center',  
            valign : 'middle',
            formatter: function (value, row, index) {
	        	if(value==undefined){
	        		value = "";
	        	}
	        	if(value==""){
	        		value = "N";
	        	}
                return "<select id=\"fieldIsKey"+index+"\" class=\"form-control eli w100px\"  name=\"fieldIsKey\" DictName=\"SYS_COMMON_YES_NO\" dataField=\"\" title=\"是否主键\" value=\""+value+"\"></selcct>";
                    	
            }
        }, {  
            title : '是否业务主键',  
            field : 'fieldIsBusKey',  
            align : 'center',  
            valign : 'middle',
            formatter: function (value, row, index) {
	        	if(value==undefined){
	        		value = "";
	        	}
	        	if(value==""){
	        		value = "N";
	        	}
                return "<select id=\"fieldIsBusKey"+index+"\" class=\"form-control eli w100px\"  name=\"fieldIsBusKey\" DictName=\"SYS_COMMON_YES_NO\" dataField=\"\" title=\"是否业务主键\" value=\""+value+"\"></selcct>";
                    	
            }
        },  {  
            title : '记录日志',  
            field : 'fieldIsLog',  
            align : 'center',  
            valign : 'middle',
            formatter: function (value, row, index) {
	        	if(value==undefined){
	        		value = "";
	        	}
	        	if(value==""){
	        		value = "N";
	        	}
                return "<select id=\"fieldIsLog"+index+"\" class=\"form-control eli w100px\"  name=\"fieldIsLog\" DictName=\"SYS_COMMON_YES_NO\" dataField=\"\" title=\"记录日志\" value=\""+value+"\"></selcct>";
                    	
            }
        },  {  
            title : '允许为空',  
            field : 'fieldIsNull',  
            align : 'center',  
            valign : 'middle',
            formatter: function (value, row, index) {
	        	if(value==undefined){
	        		value = "";
	        	}
	        	if(value==""){
	        		value = "N";
	        	}
                return "<select id=\"fieldIsNull"+index+"\" class=\"form-control eli w100px\"  name=\"fieldIsNull\" DictName=\"SYS_COMMON_YES_NO\" dataField=\"\" title=\"允许为空\" value=\""+value+"\"></selcct>";
                    	
            }
        },  {  
            title : '数据类型',  
            field : 'fieldDataType',  
            align : 'center',  
            valign : 'middle',
            formatter: function (value, row, index) {
	        	if(value==undefined){
	        		value = "";
	        	}
                return "<select id=\"fieldDataType"+index+"\" class=\"form-control eli w100px\"  name=\"fieldDataType\" DictName=\"SYS_FIELD_DATA_TYPE\" dataField=\"\" title=\"数据类型\" value=\""+value+"\"></selcct>";
                    	
            }
        },  {  
            title : '排序',  
            field : 'fieldSort',  
            align : 'center',  
            valign : 'middle',
            formatter: function (value, row, index) {
	        	if(value==undefined){
	        		value = "";
	        	}
                return "<div style=\"position:relative\"><input class=\"form-control eli w50px\" name=\"fieldSort\" style=\"padding:0 24px 0 12px;text-align:center;width:50px\" data-type=\"text\" title=\"排序\" value=\""+value+"\"/>";
                    	
            }
        },  {  
            title : '控件类型',  
            field : 'controlType',  
            align : 'center',  
            valign : 'middle',
            formatter: function (value, row, index) {
	        	if(value==undefined){
	        		value = "";
	        	}
                return "<select id=\"controlType"+index+"\" class=\"form-control eli w100px controlType\"  name=\"controlType\" onchange=\"widgetConfig('"+row.fieldId+"')\" DictName=\"SYS_FORM_GUI_TYPE\" title=\"控件类型\" value=\""+value+"\"></selcct>";
                    	
            }
        },  {  
            title : '编码规则名称',  
            field : 'fieldRuleName',  
            align : 'center',  
            valign : 'middle',
            formatter: function (value, row, index) {
	        	if(value==undefined){
	        		value = "";
	        	}
				var fieldRuleId = row.fieldRuleId;
				if(fieldRuleId==null){
					fieldRuleId = '';
				}
                return "<input class=\"form-control eli w150px\" name=\"fieldRuleName\" style=\"padding:0 24px 0 12px;text-align:center;width:150px\" data-type=\"text\" title=\"编码规则名称\" value=\""+value+"\"/><i style=\"position:relative;top:-20px;right:-60px\" onclick=\"choseFieldRule("+row.fieldId+")\" class=\"glyphicon glyphicon-plus\"></i>"
						+"<input class=\"form-control eli w150px\" name=\"fieldRuleId\" style=\"padding:0 24px 0 12px;text-align:center;width:150px\" type=\"hidden\" title=\"编码规则ID\" value=\""+fieldRuleId+"\"/>";
                    	
            }
		 },  {  
            title : '字段最大值',  
            field : 'fieldRuleMax',  
            align : 'center',  
            valign : 'middle',
            formatter: function (value, row, index) {
	        	if(value==undefined){
	        		value = "";
	        	}
                return "<div style=\"position:relative\"><input class=\"form-control eli w50px\" name=\"fieldRuleMax\" style=\"padding:0 24px 0 12px;text-align:center;width:50px\" data-type=\"text\" title=\"字段最大值\" value=\""+value+"\"/>";
                    	
            }
        }],
        onClickRow: function (row, $element) {
	                curRow = row;
	            },
	            onLoadSuccess: function (aa, bb, cc) {
	            	addListSelect();
	        		if($("#deleteMark").val()=='N'){
	        			$("#add").attr("type","button");
	        			$("#saveAndCreate").attr("type","button");
	        			$("#save").attr("type","button");
	        			$("#lead").attr("type","button");
	        			$(".recover").css("display","none");
	        			$(".remove").css("display","inline-block");
	        			$(".input-group").attr("style","");
	        		}else{
	        			$("#add").attr("type","hidden");
	        			$("#saveAndCreate").attr("type","hidden");
	        			$("#save").attr("type","hidden");
	        			$("#lead").attr("type","hidden");
	        			$(".recover").css("display","inline-block");
	        			$(".remove").css("display","inline-block");
	        			$(".input-group").css("float","left");
	        		}
	            },
        responseHandler : function(res) {  
        	rowsNum = res.total;
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
	var pageReqeust=new Object();
	pageReqeust.condition = $("#search").val();
	pageReqeust.deleteMark = $("#deleteMark").val();
	pageReqeust.fieldEntityId = $("#EntityId").val();
    refresh();      
	}
	function getSelectrows(){
	        var data=$("#FieldList").bootstrapTable('getSelections');
	        return data;
		}
	//引入标准字段
    function leadDataField(){
		layer.open({
			type: 2,
			title: '引入标准字段',
			shadeClose: true,
			shade: 0.8,
			area: ['85%', '95%'],
			content: 'LeadStandardsField.jsp?EntityId=${param.entityId}', //iframe的url
			success:function(layero,index){
	        },
			end:function(){
				refresh();
				}
		});
	} 
	/** 刷新页面 */  
	function refresh() {  
	    $('#FieldList').bootstrapTable('refresh');  
	}  
	/**查询条件与分页数据 */  
	function queryParams(pageReqeust) {  
	    pageReqeust.enabled = $("#enabled").val();  
	    pageReqeust.querys = $("#querys").val();  
	    pageReqeust.pageNo = this.offset;  
	    pageReqeust.pageSize = this.pageNumber;
	    pageReqeust.deleteMark = $("#deleteMark").val();
	    pageReqeust.fieldEntityId = '${param.entityId}';
	    pageReqeust.condition = $("#search").val();
		pageReqeust.sort = 'field_Sort';
	    return pageReqeust;  
	}   
	function findbyentityid(){
		refresh();
	}
  /**取url参数值  */
	function getQueryString(name) { 
		var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)", "i"); 
		var r = window.location.search.substr(1).match(reg); 
		if (r != null) return unescape(r[2]); return null; 
	}
	//恢复字段,修改deleteMark
	function recover(){
	var data = JSON.stringify(getSelectrows());
		$.ajax({  
              type: 'POST',  
              data: data,  
              url: '${pageContext.request.contextPath }/FieldList/recoverField.action',  
              success: function (data) {  
                  if(data==0)
          	  		{
                	  layer.alert('恢复成功', {
          				  icon: 1,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
          				  skin: 'layer-ext-moon' //
          				})
          	  		}else{
		          		layer.alert('恢复成功', {
		    				  icon: 2,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
		    				  skin: 'layer-ext-moon' //
		    				})
          	  }
                  refresh();
              }  
          });
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
			classes = $("#FieldList select");
		}
		for(var i=0;i<classes.length;i++){
			parame.id=classes[i].id;
			var type=$(classes[i]).attr('multiSelect');
			var dataField=$(classes[i]).attr('dataField');
			dataField = dataField+"|${param.formDefId}";
			parame.placeholder="";
			parame.value=$(classes[i]).attr('value');
			parame.jsonParam.dictTypeCode=$(classes[i]).attr('DictName');
			if(type=="true"){
				myehr_initSelectMore(parame,dataField);
			}else{
				myehr_initSelect(parame,dataField);
			}
		}
	}
	function addRow(insertIndex){
		rowsNum++;
	    $('#FieldList').bootstrapTable('insertRow',{index:rowsNum,row:{formButtonSort:rowsNum}});
		addListSelect();
	}
	var parame={
			id:'',
			value:"N",
			width: "100px",  
			height:"45px",
			url:'/myehr/dict/searchSysDictEntryTypeCode.action?userId=1',
			jsonParam:{},
			chang:function (e){
				var aaa = e;
			}
	}
	function remove(obj){
		var datas = {};
		datas.fieldId = $(obj).parent().parent().find("input").eq(0).val();
		datas.deleteMark = $("#deleteMark").val();
		datas.fieldEntityId = '${param.entityId}';
		$.ajax({  
            url: '${pageContext.request.contextPath }/FieldList/removeField.action',  
            type: 'POST',  
            contentType: 'application/json;charset=utf-8',
            data: JSON.stringify(datas),
            success: function (data) { 
            		if(data==1){
            			$(obj).parent().parent().parent().remove();
            			layer.alert('删除成功', {
            				  icon: 1,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
            				  skin: 'layer-ext-moon' //
            				})
            		}else if(data==2){
            			layer.alert('主键不允许删除', {
            				  icon: 7,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
            				  skin: 'layer-ext-moon' //
            				})
            		}else{
            			layer.alert('删除异常', {
            				  icon: 2,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
            				  skin: 'layer-ext-moon' //
            				})
            		} 
                //refresh();
            }  
        });
	}

	function recover(obj){
		var datas = {};
		datas.fieldId = $(obj).parent().parent().find("input").eq(0).val();
		$.ajax({  
            url: '${pageContext.request.contextPath }/FieldList/recoverField.action',  
            type: 'POST',  
            contentType: 'application/json;charset=utf-8',
            data: JSON.stringify(datas),
            success: function (data) { 
            		if(data==1){
            			$(obj).parent().parent().parent().remove();
            			layer.alert('恢复成功', {
            				  icon: 1,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
            				  skin: 'layer-ext-moon' //
            				})
            		}else {
            			layer.alert('恢复异常', {
            				  icon: 1,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
            				  skin: 'layer-ext-moon' //
            				})
            		} 
                //refresh();
            }  
        });
	}
	//更新表信息
	function saveData(){
		var saveDate = getEntityData();
		$.ajax({
			url:'/myehr/FieldList/saveFields.action',
			type:'post',
			cache: false,
			contentType: 'application/json;charset=utf-8',
			data:JSON.stringify(saveDate),
			async: false,
			success: function (data) {
				if(data=="1"){
					$('#FieldList').bootstrapTable('refresh');
				}
			}
		});	
	}
	//saveDataAndCreate更新数据库信息
	function saveDataAndCreate(){
			var data = $("#FieldList").bootstrapTable("getData");
			var saveData = getEntityData();
			var datas = [];
			for(var i=0,k=0;i<saveData.length;i++){
				if(data[i].fieldId==undefined){
					datas[k]=saveData[i];
					k++;
				}
			}
			$.ajax({
				url:'/myehr/FieldList/saveDataAndCreate.action',
				type:'post',
				cache: false,
				contentType: 'application/json;charset=utf-8',
				data:JSON.stringify(datas),
				async: false,
				success: function (text) {
					if(text=="1"){
						$('#FieldList').bootstrapTable('refresh');
					}
				}
			});	
		}
	
	
	function getEntityData(){
		var i = 0;
		var data = [];
		$("#FieldList>tbody").find("tr").each(function(){
			if($(this).find("select").eq(0).val()!=""){
				var field = {};
				field.fieldId=$(this).find("input").eq(0).val();
				field.fieldEntityId='${param.entityId}';
				field.fieldCode = $(this).find("input").eq(1).val();
				field.fieldChinaName=$(this).find("input").eq(2).val();
				field.fieldType=$(this).find("select").eq(0).val();
				field.fieldLen=$(this).find("input").eq(3).val();
				field.fieldDict=$(this).find("input").eq(4).val();
				field.fieldIsKey=$(this).find("select").eq(1).val();
				field.fieldIsBusKey=$(this).find("select").eq(2).val();
				field.fieldIsLog=$(this).find("select").eq(3).val();
				field.fieldIsNull=$(this).find("select").eq(4).val();
				field.fieldDataType=$(this).find("select").eq(5).val();
				field.fieldSort=$(this).find("input").eq(5).val();
				field.controlType=$(this).find("select").eq(6).val();
				field.dictCode=$(this).find("input").eq(6).val();
				field.fieldRuleName=$(this).find("input").eq(6).val();
				field.fieldRuleId=$(this).find("input").eq(7).val();
				field.fieldRuleMax=$(this).find("input").eq(8).val();
				field.deleteMark='N';
				data[i] = field;
				i++;
			}
		})
		return data;
	}
	function updateJsp(){
		refresh();
	}
	
	
	
	function widgetConfig(e){
		if(e==undefined){
			e=$('#FieldList').bootstrapTable('getSelections')[0].fieldId;
		}
		var obj = $("[data-uniqueid='"+e+"']");
		if(obj.find(".controlType").eq(0).val()=='2'){//切换控件类型为下拉选择框
			var field = {};
			fieldId = e;
			field.fieldId = e;
			field.cName = obj.find("[name='fieldChinaName']").eq(0).val();//fieldChinaName
			field.widgetType = 2;
			editCombobox(field);//e:实体字段id
		}
	}
	var fieldId = "";
	function editCombobox(e){
		var content;
		content =   '<div id="combobox" class="row cell" style="border:none;line-height:25px;height:95%;overflow:auto;" >'+
					'	<div id="widgetComboboxInfo1" class="col-lg-6 col-md-6 col-sm-12 col-xs-12">'+
					'		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;">'+
					'			<lable style="float:left;font-size:12px">字段显示名称: </lable>'+
					'			<input id="comboboxId" name="comboboxId" type="hidden"/>'+
					'			<input id="comboboxFormColumnLable" name="comboboxFormColumnLable" type="text" class="form-control" readonly style="width:60%;"/>'+
					'		</div>'+
					'	</div>'+
					'	<div id="widgetComboboxInfo2" class="col-lg-6 col-md-6 col-sm-12 col-xs-12">'+
					'		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;">'+
					'			<lable style="float:left;font-size:12px">字段控件类型: </lable>'+
					'			<select id="comboboxFormColumnGuiType" title="字段控件类型" styleType="select" name="comboboxFormColumnGuiType"  class="form-control" emptyText="请选择..."  style="width:60%;" textField="dictName" disabled="true" valueField="dictID" DictName="SYS_FORM_GUI_TYPE" nullItemText="请选择..." dataField="dict" initParam = "_">'+
					'			</select>'+
					'		</div>'+
					'	</div>'+
					'	<div id="widgetComboboxInfo3" class="col-lg-6 col-md-6 col-sm-12 col-xs-12">'+
					'		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;">'+
					'			<lable style="float:left;font-size:12px">数据初始化类型: </lable>'+
					'			<select id="comboboxGuiInitType" title="数据初始化类型" onchange="cboxGuiChanged()" styleType="select" name="comboboxGuiInitType"  class="form-control" emptyText="请选择..."  style="width:60%;" textField="dictName" valueField="dictID" DictName="SYS_FORM_GUI_FROM_TYPE" value="dict" dataField="dict" initParam = "_">'+
					'			</select>'+
					'		</div>'+
					'	</div>'+
					'	<div id="widgetComboboxInfo4" class="col-lg-12 col-md-12 col-sm-12 col-xs-12">'+
					'		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;">'+
					'			<lable style="float:left;font-size:12px">数据初始化值: </lable>'+
					'			<!-- 自定义快捷下拉 -->'+
					'			<textarea id="comboboxGuiInitValue1" name="comboboxGuiInitValue1" class="form-control comboboxGuiInitValue1" vtype=""  style="width:81%;resize:none;height:58px;display:none"></textarea>'+
					'			<i class="glyphicon glyphicon-plus comboboxGuiInitValue1" style="position: absolute;opacity: 0.5;right: 20px;top: 6px;cursor: pointer;display:none" onclick="inputText(this)" placeholder=""></i>'+
					'			<!-- 字典式下拉 -->'+
					'			<input type="text" class="form-control comboboxGuiInitValue2" title = "数据初始化值"  style="width:69%;float:left" id="comboboxGuiInitName2">'+
					'			<input type="hidden" class="form-control comboboxGuiInitValue2" id="comboboxGuiInitValue2">'+
					'			<input type="button" id="comboboxGuiInitValue2"  class="btn btn-warning comboboxGuiInitValue2" style="float:left" value="选择字典" onclick="chooseDictStep2(\'combobox\')"/>'+
					'			<!-- SQL式下拉 -->'+
					'			<input type="text" class="form-control comboboxGuiInitValue3" title = "数据初始化值" value="--未编写SQL--"  style="width:69%;float:left;display:none" id="comboboxGuiInitValue3">'+
					'			<input type="hidden" class="form-control" id="comboboxGuiInitExcsqlId">'+
					'			<input type="button" id="comboboxGuiInitValue3"  class="btn btn-warning comboboxGuiInitValue3" style="float:left;display:none" value="编写SQL" onclick="addSqlStep2(\'combobox\')"/>'+
					'		</div>'+
					'	</div>'+
					'	<div id="widgetComboboxInfo5" class="col-lg-6 col-md-6 col-sm-12 col-xs-12">'+
					'		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;">'+
					'			<lable style="float:left;font-size:12px">初始值来源类型: </lable>'+
					'			<select id="comboboxDataFromType" title="初始值来源类型" onchange="comboboxDataFromTypeStep2()" styleType="select" name="comboboxDataFromType"  class="form-control" emptyText="请选择..."  style="width:60%;" textField="dictName" valueField="dictID" DictName="SYS_FORM_INIT_DATA_TYPE" nullItemText="请选择..." dataField="dict" initParam = "_">'+
					'			</select>'+
					'		</div>'+
					'	</div>'+
					'	<div id="widgetComboboxInfo6" class="col-lg-6 col-md-6 col-sm-12 col-xs-12">'+
					'		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;">'+
					'			<lable style="float:left;font-size:12px">初始化来源: </lable>'+
					'			<input id="comboboxDataFromValue" name="comboboxDataFromValue" type="text" class="form-control"  vtype="illegalChar;maxLength:255;minLength:null;"  style="width:60%;"/>'+
					'		</div>'+
					'	</div>'+
					'	<div id="widgetComboboxInfo7" class="col-lg-6 col-md-6 col-sm-12 col-xs-12">'+
					'		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;">'+
					'			<lable style="float:left;font-size:12px">文本显示字段: </lable>'+
					'			<input id="comboboxTextfield" name="comboboxTextfield" type="text" class="form-control"  vtype="illegalChar;maxLength:255;minLength:null;" readonly style="width:60%;"/>'+
					'		</div>'+
					'	</div>'+
					'	<div id="widgetComboboxInfo8" class="col-lg-6 col-md-6 col-sm-12 col-xs-12">'+
					'		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;">'+
					'			<lable style="float:left;font-size:12px">值字段: </lable>'+
					'			<input id="comboboxValuefield" name="comboboxValuefield" type="text" class="form-control"  vtype="illegalChar;maxLength:255;minLength:null;" readonly style="width:60%;"/>'+
					'		</div>'+
					'	</div>'+
					'	<div id="widgetComboboxInfo9" class="col-lg-6 col-md-6 col-sm-12 col-xs-12">'+
					'		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;">'+
					'			<lable style="float:left;font-size:12px">数据对象名称: </lable>'+
					'			<input id="comboboxDatafield" name="comboboxDatafield" type="text" class="form-control"  vtype="illegalChar;maxLength:255;minLength:null;" readonly style="width:60%;"/>'+
					'		</div>'+
					'	</div>'+
					'	<div id="widgetComboboxInfo10" class="col-lg-6 col-md-6 col-sm-12 col-xs-12">'+
					'		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;">'+
					'			<lable style="float:left;font-size:12px">空值文本: </lable>'+
					'			<input id="comboboxEmptytext" name="comboboxEmptytext" type="text" class="form-control"  vtype="illegalChar;maxLength:255;minLength:null;"  style="width:60%;"/>'+
					'		</div>'+
					'	</div>'+
					'	<div id="widgetComboboxInfo11" class="col-lg-6 col-md-6 col-sm-12 col-xs-12">'+
					'		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;">'+
					'			<lable style="float:left;font-size:12px">空项文本: </lable>'+
					'			<input id="comboboxNullitemtext" name="comboboxNullitemtext" type="text" class="form-control"  vtype="illegalChar;maxLength:255;minLength:null;"  style="width:60%;"/>'+
					'		</div>'+
					'	</div>'+
					'	<div id="widgetComboboxInfo14" class="col-lg-6 col-md-6 col-sm-12 col-xs-12">'+
					'		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;">'+
					'			<lable style="float:left;font-size:12px">允许输入: </lable>'+
					'			<input id="comboboxAllowinput" name="comboboxAllowinput" type="checkbox" class="checkbox"  vtype="illegalChar;maxLength:255;minLength:null;"  style="width:15%;"/>'+
					'		</div>'+
					'	</div>'+
					'	<div id="widgetComboboxInfo15" class="col-lg-6 col-md-6 col-sm-12 col-xs-12">'+
					'		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;">		'+
					'			<lable style="float:left;font-size:12px">带搜索框: </lable>'+
					'			<input id="comboboxIsSearch" name="comboboxIsSearch" type="checkbox" class="checkbox"  vtype="illegalChar;maxLength:255;minLength:null;"  style="width:15%;"/>'+
					'		</div>'+
					'	</div>'+
					'	<div id="widgetComboboxInfo16" class="col-lg-6 col-md-6 col-sm-12 col-xs-12">'+
					'		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;">'+
					'			<lable style="float:left;font-size:12px">允许多选: </lable>'+
					'			<input id="comboboxMultiselect" name="comboboxMultiselect" type="checkbox" class="checkbox"  vtype="illegalChar;maxLength:255;minLength:null;"  style="width:15%;"/>'+
					'		</div>'+
					'	</div>'+
					'	<div id="widgetComboboxInfo16_1" class="col-lg-6 col-md-6 col-sm-12 col-xs-12">'+
					'		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;">'+
					'			<lable style="float:left;font-size:12px">允许空项: </lable>'+
					'			<input id="comboboxShownullitem" name="comboboxShownullitem" type="checkbox" class="checkbox"  vtype="illegalChar;maxLength:255;minLength:null;"  style="width:15%;"/>'+
					'		</div>'+
					'	</div>'+
					'	<div id="widgetComboboxInfo17" class="col-lg-12 col-md-12 col-sm-12 col-xs-12" style="display:none">'+
					'		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;position:relative;">'+
					'			<lable style="float:left;font-size:12px">初始值初始方案: </lable>'+
					'			<textarea id="comboboxInitFun" name="comboboxInitFun" class="form-control" vtype=""  style="width:81%;resize:none;height:57px"></textarea>'+
					'		</div>'+
					'	</div>'+
					'	<div id="widgetComboboxInfo12" class="col-lg-12 col-md-12 col-sm-12 col-xs-12">'+
					'		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;position:relative;">'+
					'			<lable style="float:left;font-size:12px">单元格编辑方案: </lable>'+
					'			<textarea id="comboboxValuechangeFun" name="comboboxValuechangeFun" class="form-control" vtype=""  style="width:81%;resize:none;height:58px"></textarea>'+
					'		</div>'+
					'	</div>'+
					'	<div id="widgetComboboxInfo13" class="col-lg-12 col-md-12 col-sm-12 col-xs-12">'+
					'		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;position:relative;">'+
					'			<lable style="float:left;font-size:12px">单元格绘制方案: </lable>'+
					'			<textarea id="comboboxClickFun" name="comboboxClickFun" class="form-control" vtype=""  style="width:81%;resize:none;height:57px"></textarea>'+
					'		</div>'+
					'	</div>'+
					'</div>';
		layer.open({
			title:'输入内容',
			shadeClose: true,
			zIndex:9999,
			content: content,
			area: ['800px', '650px'],
			btn: ['保存', '取消'],
			success: function(layero, index){
				initSelect("combobox",e.fieldId);
				$("#comboboxFormColumnLable").val(e.cName);
				$("#comboboxFormColumnGuiType").val(e.widgetType);
				initComboboxData();
			  },
			yes: function(index, layero){
				saveWidget(e);
			  },
			btn2: function(index, layero){
			  }
		});
	}
	function initComboboxData(){
		$.ajax({
			url:'/myehr/form/getComboboxInfoByFieldId.action?fieldId='+fieldId,
			type:'post',
			cache: false,
			async: false,
			success: function (data) {
					showComboboxInfoStep2(data);
				}
			});
	}
	function initSelect(e,fieldId){
		var classes = [];
		if(''=='APP'){
			$("input").each(function(){
				if($(this).attr('dataField') != undefined){
					classes.push($(this)[0]);
				}
			})
		}else{
			classes = $("#"+e+" select");
		}
		for(var i=0;i<classes.length;i++){
			parame.id=classes[i].id;
			var type=$(classes[i]).attr('multiSelect');
			var dataField=$(classes[i]).attr('dataField');
			dataField = dataField+"|"+fieldId;
			parame.placeholder="";
			parame.value=$(classes[i]).attr('value');
			parame.jsonParam.dictTypeCode=$(classes[i]).attr('DictName');
			if(type=="true"){
				myehr_initSelectMore(parame,dataField);
			}else{
				myehr_initSelect(parame,dataField);
			}
		}
	}
	
	function showComboboxInfoStep2(data){
		$("#comboboxId").val(data.comboboxId);
		$("#comboboxDataFromType").val(data.comboboxDataFromType);
		if(data.comboboxDataFromType=="initFun"){
			comboboxDataFromTypeStep2();
		}
		$("#comboboxcheckFun").val(data.comboboxcheckFun);
		$("#comboboxCheckSelf").val(data.comboboxCheckSelf);
		$("#comboboxInitFun").val(data.comboboxInitFun);
		$("#comboboxValuechangeFun").val(data.comboboxValuechangeFun);
		$("#comboboxClickFun").val(data.comboboxClickFun);
		$("#comboboxDataFromValue").val(data.comboboxDataFromValue);
		$("#comboboxGuiInitType").val(data.comboboxGuiInitType);
			cboxGuiChanged();
		if(data.comboboxGuiInitType=='dict'){
			$("#comboboxGuiInitName2").val(getDictnameByCode(data.comboboxGuiInitValue));
			$("#comboboxGuiInitValue2").val(data.comboboxGuiInitValue);
		}else if(data.comboboxGuiInitType=='sql'){
			$("#comboboxGuiInitExcsqlId").val(data.comboboxGuiInitExcsqlId);
		}
		cboxSql();
		$("#comboboxTextfield").val(data.comboboxTextfield);
		$("#comboboxValuefield").val(data.comboboxValuefield);
		$("#comboboxDatafield").val(data.comboboxDatafield);
		$("#comboboxEmptytext").val(data.comboboxEmptytext);
		if(data.comboboxAllowinput=="Y"||data.comboboxAllowinput=="true"){
			$("#comboboxAllowinput").prop('checked',true);
		}else if(data.comboboxAllowinput=="N"||data.comboboxAllowinput=="false"){
			$("#comboboxAllowinput").prop('checked',false);
		}
		if(data.comboboxMultiselect=="Y"||data.comboboxMultiselect=="true"){
			$("#comboboxMultiselect").prop('checked',true);
		}else if(data.comboboxMultiselect=="N"||data.comboboxMultiselect=="false"){
			$("#comboboxMultiselect").prop('checked',false);
		}
		$("#comboboxNullitemtext").val(data.comboboxNullitemtext);
		$("#comboboxGuiInitExcsqlId").val(data.comboboxGuiInitExcsqlId);
		$("#comboboxIstext").val(data.comboboxIstext);
		$("#comboboxDictSql").val(data.comboboxDictSql);
		if(data.comboboxIsSearch=="Y"||data.comboboxIsSearch=="true"){
			$("#comboboxIsSearch").prop('checked',true);
		}else if(data.comboboxIsSearch=="N"||data.comboboxIsSearch=="false"){
			$("#comboboxIsSearch").prop('checked',false);
		}
		if(data.comboboxShownullitem=="Y"||data.comboboxShownullitem=="true"){
			$("#comboboxShownullitem").prop('checked',true);
		}else if(data.comboboxShownullitem=="N"||data.comboboxShownullitem=="false"){
			$("#comboboxShownullitem").prop('checked',false);
		}
	}
	function cboxGuiChanged(){
		$("#comboboxTextfield").val("text");
		$("#comboboxValuefield").val("id");
		$("#comboboxDatafield").val("data");

		if($("#comboboxGuiInitType").val()=='sql'){
			
			$(".comboboxGuiInitValue1").css("display","none");
			$(".comboboxGuiInitValue2").css("display","none");
			$(".comboboxGuiInitValue3").css("display","inline-block");
			
		}else if($("#comboboxGuiInitType").val()=='dict'){
			$("#comboboxTextfield").val("dictName");
			$("#comboboxValuefield").val("dictId");
			$("#comboboxDatafield").val("dicts");
			$(".comboboxGuiInitValue1").css("display","none");
			$(".comboboxGuiInitValue2").css("display","inline-block");
			$(".comboboxGuiInitValue3").css("display","none");
			
		}else if($("#comboboxGuiInitType").val()=='json'){
			var model = "json模板:[ {\"text\":\"字典项名1\",\"id\":\"字典项ID1\"},\n"+
						"		   {\"text\":\"字典项名2\",\"id\":\"字典项ID2\"}]";
			$(".comboboxGuiInitValue1").css("display","inline-block");
			$(".comboboxGuiInitValue1").attr("placeholder",model);
			$(".comboboxGuiInitValue2").css("display","none");
			$(".comboboxGuiInitValue3").css("display","none");		
		}
	}
	function comboboxDataFromTypeStep2(){
		if($("#comboboxDataFromType").val()=='initFun'){
			$("#widgetComboboxInfo17").css("display","block");
			$("#comboboxDataFromValue").val("");
			$("#comboboxDataFromValue").attr("readonly",true);
			$("#comboboxDataFromValue").val("");
		}else{
			$("#widgetComboboxInfo17").css("display","none");
			$("#comboboxDataFromValue").attr("readonly",false);
		}
	}
	function chooseDictStep2(e){
		var url = '/myehr/jsp/form/formcreate/chooseDict.jsp?widget='+e;
		layer.open({
			type:2,
			closeBtn:1,
			shadeClose:true,
			area:['950','700'],
			maxmin:true,
			title:'选择表单',
			content:url,
			success:function(layero,index){
				//$('.layui-layer-max').click();
			},
			end:function(){			}
		 }); 
	} 
	function addSqlStep2(e){
		var execId = "";
		var url = "";
		if(e=='combobox'){
			url = '/myehr/jsp/form/formcreate/button/execute_sql_form_widget.jsp?execSqlType=COMBOBOX_INIT&execSqlRelaid='+$("#comboboxId").val();
		}
		layer.open({
			type:2,
			closeBtn:1,
			shadeClose:true,
			area:['950','700'],
			maxmin:true,
			title:'编写SQL',
			content:url,
			success:function(layero,index){			
			},
			end:function(){	
				initComboboxData();
			}
		 });
	}
	function cboxSql(){
		if($("#comboboxGuiInitExcsqlId").val()!=null&&$("#comboboxGuiInitExcsqlId").val()!=""){
			$("#comboboxGuiInitValue3").val("--已编写SQL--");
		}else{
			$("#comboboxGuiInitValue3").val("--未编写SQL--");
		}
	}
	function saveWidget(e){
		var sysFormCombobox = {};
		url = "/myehr/form/saveCombobox.action";
		sysFormCombobox.comboboxFormColumnId=e.fieldId;
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
		sysFormCombobox.comboboxIsfield="true";
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
						alert('保存成功');
					}else{  
						alert('保存失败');
					}  
					}
				});
	}
	function getDictnameByCode(e){
		var DictName;
		$.ajax({
			url:'/myehr/form/getDictnameByCode.action?dictTypeCode='+e,
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
	
	function choseFieldRule(fieldId){
		var url = '/myehr/jsp/field/choseFieldRule.jsp?fieldId='+fieldId;
		layer.open({
			type: 2,
			title:'<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"选择编码规则")%>',
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

</script>  
</body>
</html>
