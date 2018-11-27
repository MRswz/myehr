<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/common/common.jsp" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>高级查询配置</title>
<style>
</style>
</head>
<body>
<div class="container-fluid" style="height:100%">
	<div style="margin-top:5px;">
	    <div class="BTNGROUP_55" style="margin:0 auto; display:inline-block;height: 35px;">
			<div style="margin-right:10px;display:inline-block">
			    <input type="button" id="addorg_list"  class="btn btn-primary" value=增加 onclick="addRow()"/>
			</div>
			<div style="margin-right:10px;display:inline-block">
			    <input type="button" id="editorg_list"  class="btn btn-primary" value=关闭 onclick="closex()"/>
			</div>
			<div style="margin-right:10px;display:inline-block">
			    <input type="button" id="saveorg_list"  class="btn btn-primary" value=执行查询 onclick="excQuery()"/>
			</div>
		</div>
	</div>
    <table id="heightSearch" >  
    </table> 
	
	<p>操作说明:	</p>
	<p>&nbsp;&nbsp;&nbsp;&nbsp;1、连接条件“and”表示2个查询条件同时成立，“or”表示2个查询条件其中之一成立。</p>
	<p>&nbsp;&nbsp;&nbsp;&nbsp;2、左括号、右括号用于多个查询条件同时用“and”、“or”连接条件。</p>
	<p>&nbsp;&nbsp;&nbsp;&nbsp;3、过滤规则“=”表示等于过滤值，“!=”表示不等于过滤值，“like”表示包含过滤值，“not like”表示不包含过滤值，“>、<、>=、<=”表示大于、小于过滤值。</p>
	<p>&nbsp;&nbsp;&nbsp;&nbsp;4、连接顺序填写：1、2、3</p>
	<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;例如：and （ 公司名称 like 公司 1 or 公司名称 like 股份 2 ） and 上级公司 like 股份 3</p>
</div>
<script>
var data = {"total":0,"rows":[]};
	$(function() { 
		
	    $("#heightSearch").bootstrapTable('load',data); 
	    querys(); 
	    $(".fixed-table-toolbar").css("margin-top","47px");
	    $(".no-records-found").css("display","none");
	    $("table").css("width","700px");
	    addRow();
	    $("#heightSearch").bootstrapTable('resetView'); 
	})
	function querys() {   
    $("#heightSearch").bootstrapTable({  
        url : '',  
        height : '495',  
        undefinedText : '-',  
//        pagination : true, // 分页  
        striped : true, // 是否显示行间隔色  
//        queryParams : queryParams,  
        cache : false, // 是否使用缓存  
//        pageList : [ 5, 10, 20 ],  
//        toolbar : "#toolbar",// 指定工具栏  
//        showToggle:true,
//        showExport:true, // 显示导出
//        showPaginationSwitch:true,//显示展开
//        showColumns : true, // 显示隐藏列  
//        showRefresh : true, // 显示刷新按钮 
//        uniqueId : "entityTablename", // 每一行的唯一标识  
//        sidePagination : "server", // 服务端处理分页  
//        tableLayout:'fixed',//列宽一致对其
        columns : [ {  
            title : '连接条件',  
            field : 'formWhereJoinRule', // 字段  
            align: 'center',
            valign: 'middle',
            width:70,
            formatter: function (value, row, index) {
            	return "<a name=\"formWhereJoinRule\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"连接条件\">" + value + "</a>";
        	}
        }, {  
            title : '左括号',  
            field : 'leftBracket',  
            align : 'center',  
            valign : 'middle',  
            width:100,
            formatter: function (value, row, index) {
                    	return "<a href=\"#\" name=\"leftBracket\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"左括号\">" + value + "</a>";
                	}
        }, {  
            title : '查询字段',  
            field : 'formWhereColumnId',  
            align : 'center',  
            valign : 'middle',  
            width:100,
            formatter: function (value, row, index) {
                    	return "<a href=\"#\" name=\"formWhereColumnId\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"查询字段\">" + value + "</a>";
                	}
        }, {  
            title : '过滤规则',  
            field : 'formWhereCpRule',  
            align : 'center',  
            valign : 'middle',  
            width:60,
            formatter: function (value, row, index) {
                    	return "<a href=\"#\" name=\"formWhereCpRule\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"过滤规则\">" + value + "</a>";
                	}
        }, {  
            title : '过滤值',  
            field : 'formWhereValue',  
            align : 'center',  
            valign : 'middle',  
            width:100,
            formatter: function (value, row, index) {
                    	return "<a href=\"#\" name=\"formWhereValue\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"过滤值\">" + value + "</a>";
                	}
        }, {  
            title : '连接顺序',  
            field : 'formWhereSort',  
            align : 'center',  
            valign : 'middle',  
            width:100,
            formatter: function (value, row, index) {
                    	return "<a href=\"#\" name=\"formWhereSort\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"连接顺序\">" + value + "</a>";
                	}
        }, {  
            title : '右括号',  
            field : 'rightBracket',  
            align : 'center',  
            valign : 'middle',  
            width:100,
            formatter: function (value, row, index) {
                    	return "<a href=\"#\" name=\"rightBracket\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"职位\">" + value + "</a>";
                	}
        }, {
            field: 'null',
            eidtable:false,
            title: '操作',
            width:71,
            formatter: function (value, row, index) {  
               var s = '<button type="button" class="btn btn-default btn-sm" id="remove"><span class="glyphicon glyphicon-trash"></span> Trash</button>';
               return s;  
           	},  
           	events: 'operateEvents'  
        }],
        onClickRow: function (row, $element) {
	                curRow = row;
	                datarows = row;
	            },
	            onLoadSuccess: function (aa, bb, cc) {
	                $("#heightSearch a").editable({
	                    url: function (params) {
	                        var sName = $(this).attr("name");
	                        curRow[sName] = params.value;
	                        var data = JSON.stringify(curRow);
	                        $.ajax({
	                            type: 'POST',
	                            url: "${pageContext.request.contextPath }/EntityList/saveEntity.action",
	                            data: data,
	                            dataType: 'JSON',
	                            success: function (data, textStatus, jqXHR) {
	                                alert('保存成功！');
	                            },
	                            error: function () { alert("error");}
	                        });
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
                'click #remove': function (e, value, row, index) {
                if($("#deleteMark").val()=="N")
                {
                	row.deleteMark="Y";
                	$.ajax({  
                       type: 'POST',  
                       data: JSON.stringify(row),  
                       url: '${pageContext.request.contextPath }/EntityList/saveEntity.action',  
                       success: function (data) {  
                           alert('删除成功');
                           window.location.href = window.location.href; 
                           $('#heightSearch').bootstrapTable(
                           		'remove', {  
	                               field: 'Id',  
	                               values: [row.Id],  
                               	 }
                           );  
                           $('#heightSearch').bootstrapTable(
                               	 'refresh',{
                 					 url:"${pageContext.request.contextPath }/EntityList/findEntityList.action"  
                               	 }
                           );
                       }  
                   });
                }
                else{
                	$.ajax({  
                       type: 'POST',  
                       data: JSON.stringify(row),  
                       url: '${pageContext.request.contextPath }/EntityList/removeEntity.action',  
                       success: function (data) {  
                           alert('删除成功');
                           window.location.href = window.location.href; 
                           $('#heightSearch').bootstrapTable(
                           		'remove', {  
	                               field: 'Id',  
	                               values: [row.Id],  
                               	 }
                           );  
                           $('#heightSearch').bootstrapTable(
                               	 'refresh',{
                 					 url:"${pageContext.request.contextPath }/EntityList/findEntityList.action"  
                               	 }
                           );
                           
                       }  
                   }); 
                }
               }
           };
	}  
	
	var formDefType = '';
	var formDefId = '';
	var formDefLayout =  '';
	//var grid = nui.get('datagrid1');
	
	window.onload=function (){
		//initColumnIds();
	}
	var num=0;	
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
	var numRow=0;	
	function addRow(){ 
        var strAppend = '<tr class="formWhere" data-index="9">'+
			'<td style="text-align: center; vertical-align: middle; ">'+
			'	<select class="form-control" style="width:80px" id="formWhereJoinRule" >'+
			'		<option value ="and">and</option>'+
		    '		<option value ="or">or</option>'+
			'	</select>'+
			'</td>'+
			'<td style="text-align: center; vertical-align: middle; ">'+
			'	<select class="form-control" style="width:93px" id="leftBracket" >'+
			'		<option value ="">--请选择--</option>'+
		    '		<option value ="("> ( </option>'+
			'	</select>'+
			'</td>'+
			'<td style="text-align: center; vertical-align: middle; "><select class="form-control" style="width:93px" id="formWhereColumnId'+numRow+'" multiSelect="" dataField="sql_form_0000"></select></td>'+
			'<td style="text-align: center; vertical-align: middle; ">'+
			'	<select style="width:80px" id="formWhereCpRule" class="form-control">'+
			'		<option value ="="> = </option>'+
		    '		<option value ="!="> != </option>'+
		    '		<option value ="like"> like </option>'+
		    '		<option value ="not like"> not like </option>'+
		    '		<option value =">"> > </option>'+
		    '		<option value ="<"> < </option>'+
		    '		<option value =">="> >= </option>'+
		    '		<option value ="<="> <= </option>'+
		    '		<option value ="is null"> is null </option>'+
		    '		<option value ="is not null"> is not null </option>'+
		    '		<option value ="in"> in </option>'+
		    '		<option value ="not in"> not in </option>'+
			'	</select>'+
			'</td>'+
			'<td style="text-align: center; vertical-align: middle; "><input type="text" class="form-control"  style="width:93px" id="formWhereValue"></td>'+
			'<td style="text-align: center; vertical-align: middle; "><input type="text" select class="form-control"  style="width:93px" id="formWhereSort"></td>'+
			'<td style="text-align: center; vertical-align: middle; ">'+
			'	<select style="width:93px" id="rightBracket" class="form-control">'+
			'		<option value ="">--请选择--</option>'+
		    '		<option value =")"> ) </option>'+
			'	</select>'+
			'</td>'+
			'<td><button id="new'+num+'" class="btn btn-default btn-sm" onclick="deletexx(this)"><span class="glyphicon glyphicon-trash"></span> 删除 </button></td>'+
			'</tr>';
        num++;
        $("#heightSearch tbody").append(strAppend);
        
       	var classes = $("#formWhereColumnId"+numRow+""); 
 		parame.id="formWhereColumnId"+numRow+"";
 		var type=$(classes).attr('multiSelect');
 		var dataField=$(classes).attr('dataField');
 		dataField = dataField+"|${param.formDefId} "
 		parame.placeholder="";
 		parame.jsonParam.dictTypeCode=$(classes).attr('DictName');
 		if(type=="true"){
 			myehr_initSelectMore(parame,dataField);
 		}else{
 			myehr_initSelect(parame,dataField);
 		}
 		numRow++;
             
	}
	
	function CloseWindow(action) {            
            if (window.CloseOwnerWindow) return window.CloseOwnerWindow(action);
            else window.close();            
     }
     
    function renderebuttoncode(e){
    	return e.value;
    }
    
    function removeRows(){
    	var rows = grid.getSelecteds();
    	if(rows){
    		grid.removeRows(rows);
    	}
    }
     
    function rendererIsNull(e){
     	var btnname = nui.getDictText('SYS_COMMON_YES_NO',e.value);
     	return btnname;
     }
     
    function rendererParamType(e){
    	return nui.getDictText('SYS_FORM_PARAM_TYPE',e.value);
    } 
    
    function rendererCpRule(e){
    	return nui.getDictText('SYS_FORM_WHERE_RULE',e.value);
    }
    
    function rendererJoinRule(e){
    	return nui.getDictText('SYS_FORM_JOIN_RULE',e.value);
    }
     
    function rendererColumnId(e){
     	var columnId = e.value;
     	if(datas==null||datas.length==0){
     	}
     	for(var i=0; i<datas.length; i++){
     		if(datas[i].formColumnId==e.value){
     			return datas[i].formColumnLable;
     		}
     	}
     }

     var datas = [];
     function oncellbeginedit(e){
     	var filed = e.field;
		if(filed=="formWhereColumnId") {
			if(datas==null||datas.length==0){
			}
			e.editor.setData(datas);
		}
     }
     
     function initColumnIds() {
		$.ajax({
	        url: "com.dcf.form.cardform.cardFormCloumnComp.queryCardFormColumn.biz.ext",
	        type: 'POST',
	        data: nui.encode({formId:formDefId,filterAuthority:false}),
	        cache: false,
	        async: false,
	        contentType: 'text/json',
	        success: function (text) {
	        	if(text.datas!=null){
	        		datas = text.datas;		
	        	}
	        },
	        error: function (jqXHR, textStatus, errorThrown) {
	        }
	    });
     }
     
    //执行查询
   function excQuery(){
		
  		var data = [];
	   	$(".formWhere").each(function(){
	   			var tdArr = $(this).find("td");
	   			var formWhere = {};
		   		formWhere.formWhereJoinRule=tdArr.eq(0).find("select").val();
		   		formWhere.leftBracket=tdArr.eq(1).find("select").val();
		   		formWhere.formWhereColumnId=tdArr.eq(2).find("select").val();
		   		formWhere.formWhereCpRule=tdArr.eq(3).find("select").val();
		   		formWhere.formWhereValue=tdArr.eq(4).find("input").val();
		   		formWhere.formWhereSort=tdArr.eq(5).find("input").val();
		   		formWhere.rightBracket=tdArr.eq(6).find("select").val();
		   		data.push(formWhere);
	   	});
		if(data.length==1 && data[0].formWhereColumnId==''){
			window.parent.changeHeightGadedata_${param.formDefId}(null);
		}else{
			window.parent.changeHeightGadedata_${param.formDefId}(data);
		}
	   	window.parent.${param.formFunction}();
	   	
	   	closex(); 
	}
	
	function GetData(){
		return  grid.getData();
	}
	
	function SetData(data){
    	grid.setData(data);
    }
	
	function isBracketBalance(arr){
		if(arr&&arr.length==0){
			return true;
		}
		if(arr[0]==')'){
        	return false;
        }
        for(var i=0; i<arr.length; i++){
        	if(arr[i]==')'){
        		if((i-1)<0){
        			return false;
    			}
    			arr[i]=null;
    			k = i-1;
    			while(k>=0){
    				if(arr[k]=='('){
    					arr[k]=null;
    					break;
    				}
    				if(k==0){
    					return false;
    				}
    				k--;
    			}
    			arr[i-1]=null;
        	}
        }
        for(var i=0; i<arr.length; i++){
        	if(arr[i]==')'||arr[i]=='('){
        		return false;
        	}
        }
        return true;
    }
    
    function cancel(){
    	 CloseWindow('cancle');
    }
    
    function deletexx(tdobject){
		var td="#"+tdobject.id;
		$(td).parents("tr").html("");
             
        }
    function closex(){
    	var index = parent.layer.getFrameIndex(window.name);  
	   	parent.layer.close(index);  
    }
</script>
</body>
</html>