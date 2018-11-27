<%@ page language="java" import="java.util.*" import="com.myehr.common.util.LangUtil" pageEncoding="UTF-8"%>
<%@ include file="/common/common.jsp" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<script type="text/javascript" src="../cssjs/questionForm.js"></script><body>
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
		</div>
		<div id="questionList_filter" style="float:right;display:inline-block;position:relative;">
			<input id="FILTER_2771" name="FILTER_2771" placeholder="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"试卷编码")%>,<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"表单名称")%>" style="padding: 6px 30px 6px 10px;" title="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"表单编码")%>,<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"表单名称")%>" type="text" class="form-control" oninput="grid_emp_proce_fun11()" />
			<i class="icon-search" style="position: absolute;right: 12px;top: 7px;cursor: pointer;"></i>
		</div>
	</div>
	<table id="questionList">
	</table>
</div>
    
<script>
var userId_Questionform = '${sessionScope.userid}';

var parame={
    id:'',
    value:"N",
    width: "100px",
    height:"45px",
    url:'/myehr/dict/searchSysDictEntryTypeCode.action?userId='+userId_Questionform,
	  jsonParam:{},
    chang:function (e){
    }
};
	$(function() {
    	querys();
		$(".fixed-table-toolbar").css("margin-top","0px");
		$(".container-fluid").css("max-height","100%");
		$(".fixed-table-container").css("height",$('body').height() -45 +"px");
		$(".fixed-table-body").css("height","93%");
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
    $("#questionList").bootstrapTable({  
        url : '${pageContext.request.contextPath }/form/questionFormList.action',  
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
            title : '试卷编码',  
            field : 'code', // 字段  
            align : 'center', // 对齐方式（左 中 右）  
            valign : 'middle', //  
            sortable : true ,
            formatter: function (value, row, index) {
                    	return "<a  class=\"eli w100px\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"formDefCode\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"表单编码\">"+value+"</a>";
                	} 
        }, {  
            title : '试卷中文名',  
            field : 'cname',  
            align : 'center',  
            valign : 'middle',  
            sortable : true  ,
            formatter: function (value, row, index) {
                    	return "<a  class=\"eli w100px\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"formDefName\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"表单名称\">"+value+"</a>";
                	}
        }, {  
            title : '试卷英文名',  
            field : 'ename',  
            align : 'center',  
            valign : 'middle',  
            sortable : true  ,
            formatter: function (value, row, index) {
                    	return "<a  class=\"eli w100px\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"formDefName\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"表单名称\">"+value+"</a>";
                	}
        }, {  
            title : '卷首语',  
            field : 'begindesc',  
            align : 'center',  
            valign : 'middle',  
            sortable : true  ,
            formatter: function (value, row, index) {
                    	return "<a  class=\"eli w100px\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"formDefName\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"表单名称\">"+value+"</a>";
                	}
        }, {  
            title : '卷尾语',  
            field : 'enddesc',  
            align : 'center',  
            valign : 'middle',  
            sortable : true  ,
            formatter: function (value, row, index) {
                    	return "<a  class=\"eli w100px\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"formDefName\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"表单名称\">"+value+"</a>";
                	}
            }, {  
            title : '模板描述',  
            field : 'templatedesc',  
            align : 'center',  
            valign : 'middle',  
            sortable : true  ,
            formatter: function (value, row, index) {
                    	return "<a  class=\"eli w100px\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"formSubmitUrl\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"提交路径\">"+value+"</a>";
                	}
        }, {  
            title : '标识',  
            field : 'remark',  
            align : 'center',  
            valign : 'middle',  
            sortable : true  ,
            formatter: function (value, row, index) {
		            	var date = "-";
		                if(value!=null){
		                    date = value;
		                }
                    	return "<a class=\"eli w100px\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"remark\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"标识\" data-source=\"/myehr/dict/searchSysDictEntryTypeCode1.action?deleteMark=Question_Type\">";
                	}
        }],
        onClickRow: function (row, $element) {
	                curRow = row;
	                $('#questionList').bootstrapTable('uncheckAll');//checkBox单选
	            },
	            onLoadSuccess: function (aa, bb, cc) {
	                $("#questionList a").editable({
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






</script>  
</body>
</html>
