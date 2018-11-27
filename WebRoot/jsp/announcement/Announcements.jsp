<%@ page language="java" import="java.util.*" import="com.myehr.common.util.LangUtil" pageEncoding="UTF-8"%>
<%@ include file="/common/commontest.jsp" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<body >



  <div style="margin:0 auto; height: 35px;left: 127px;">
					<div style="margin-right:10px;display:inline-block">
					<input type="button" id="save_formemp_emp_edit"  class="btn btn-primary"  value=新增 onclick="adda()"/>
					</div>
					<div style="margin-right:10px;display:inline-block">
					<input type="button" id="closeemp_emp_edit"  class="btn btn-primary"  value=修改 onclick="updateb()"/>
					</div>
					<div style="margin-right:10px;display:inline-block">
					<input type="button" id="closeemp_emp_remove"  class="btn btn-primary"  value=删除 onclick="deletec()"/>
					</div>
					<div style="margin-right:10px;display:inline-block">
					<input type="button" id="closeemp_emp_see"  class="btn btn-primary"  value=查看 onclick="seed()"/>
					</div>
  </div>
  
<table id="org_list_List">		


</table>
	

<script type="text/javascript">


$(function() {
	querys();
	loaddata();
});
  function deletec(){
 var selects = $("#org_list_List").bootstrapTable('getSelections');;
	if(selects!=null && selects.length>0){
		select = selects[0];
	}else {
		alert('请选择数据');
		return ;
	}
	var id;
	for(var i=0;i<selects.length;i++) {;
			if (selects[i].id!="") {;
			 id=selects[i].id;
			}
		}
		
		
		
          $.ajax({
				url : '/myehr/announcement/deleteAnnouncementById.action?id='+id, 
				data:null,
				type:'post',
				contentType: 'application/json;charset=utf-8',
				cache: true,
				success: function (result) {
					setData(result);
				}
			});
        
    
          $("#org_list_List").bootstrapTable('refesh');
    }
    function adda(){
    
    	 layer.open({
			type: 2,
			showMaxButton: true,
			title:"新闻增加" ,
			area: ['1450', '500'],
			maxmin: true,
			content:'/myehr/jsp/announcement/AnnouncementAdd.jsp',
			success:function(layero,id){
				},
				end:function(){
			}
			});
    
    }
    function updateb(){
     //   var selects=$("#org_list_List").bootstrapTable('getSelections');
        var selects = $("#org_list_List").bootstrapTable('getSelections');;
	if(selects!=null && selects.length>0){
		select = selects[0];
	}else {
		alert('请选择数据');
		return ;
	}
	 var id;
	for(var i=0;i<selects.length;i++) {;
			if (selects[i].id!="") {;
			 id=selects[i].id;
			}
			 layer.open({
			type: 2,
			showMaxButton: true,
			title:"新闻修改" ,
			area: ['1450', '500'],
			maxmin: true,
			content:'/myehr/jsp/announcement/AnnouncementEdit.jsp?id='+id,
			success:function(layero,id){
				},
				end:function(){
			}
			});
		}
	
	
    }
    function seed(){
     //   var selects=$("#org_list_List").bootstrapTable('getSelections');
        var selects = $("#org_list_List").bootstrapTable('getSelections');;
	if(selects!=null && selects.length>0){
		select = selects[0];
	}else {
		alert('请选择数据');
		return ;
	}
	 var id;
	for(var i=0;i<selects.length;i++) {;
			if (selects[i].id!="") {;
			 id=selects[i].id;
			}
			 layer.open({
			type: 2,
			showMaxButton: true,
			title:"新闻查看" ,
			area: ['855', '500'],
			maxmin: true,
			content:'/myehr/jsp/announcement/announcementDetail.jsp?id='+id,
			success:function(layero,id){
				},
				end:function(){
			}
			});
		}
    }
    
function loaddata(){
	  var url = "${pageContext.request.contextPath }/announcement/queryAnnouncement.action";  
	 
		  $.ajax({
				url:url,
				data:null,
				type:'post',
				contentType: 'application/json;charset=utf-8',
				cache: true,
				success: function (result) {
					setData(result);
				}
			});
	  	
}

function setData(list){
	var temp = '';
	for(var i=0; i<list.length; i++){
		temp += '<tr >'+
				'	<td style="padding-left:10px;"  width="150"  ><lable><a href="#" onclick="show('+list[i].id+')">'+list[i].title+'</a></lable><lable style="margin:20px;">'+formatDateTime(list[i].createTime)+'</lable></td>'+
			'</tr>';
	}
	
	$("#table").html(temp);
}

function show(id){
	window.open("announcementDetail.jsp?id="+id);
}	

function formatDateTime(inputTime) {    
    var date = new Date(inputTime);  
    var y = date.getFullYear();    
    var m = date.getMonth() + 1;    
    m = m < 10 ? ('0' + m) : m;    
    var d = date.getDate();    
    d = d < 10 ? ('0' + d) : d;    
    var h = date.getHours();  
    h = h < 10 ? ('0' + h) : h;  
    var minute = date.getMinutes();  
    var second = date.getSeconds();  
    minute = minute < 10 ? ('0' + minute) : minute;    
    second = second < 10 ? ('0' + second) : second;   
    return y + '-' + m + '-' + d;   
};  
function querys() {   
    $("#org_list_List").bootstrapTable({  
        url : '/myehr/announcement/getAnnouncementById.action',  
       pagination : true, // 分页  
 //       queryParams : queryParams,  
        cache : false, // 是否使用缓存  
        pageList : [ 5, 10, 3000 ],  
        toolbar : "#toolbar",// 指定工具栏  
        showColumns : false, // 显示隐藏列  
        clickToSelect: true,
        showRefresh : true, // 显示刷新按钮  
        pageSize: 30,
        singleSelect:true ,//是否可以多选，默认为false可以多选
        uniqueId : "userName", // 每一行的唯一标识  
        sidePagination : "server", // 服务端处理分页  
        columns : [ {  
            field : 'state',  
            checkbox : true,  
            align : 'center',  
            valign : 'middle'  
        }, {  
            field : 'id', // 字段  
            visible: false
        },{  
            title : '标题',  
            field : 'title', // 字段  
            align : 'center', // 对齐方式（左 中 右）  
            valign : 'middle', //  
            sortable : true ,
            formatter: function (value, row, index) {
                    	return "<a  class=\"eli w100px\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"title\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"表单编码\">"+value+"</a>";
                	} 
        }, {  
            title : '内容',  
            field : 'infoDetail',  
            align : 'center',  
            valign : 'middle',  
           visible: false,
            sortable : true  ,
            formatter: function (value, row, index) {
                    	return "<a  class=\"eli w100px\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"infoDetail\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"表单名称\">"+value+"</a>";
                	}
        }, {  
            title : '创建时间',  
            field : 'createTime',  
            align : 'center',  
            valign : 'middle',  
            sortable : true  ,
            formatter: function (value, row, index) {
                    	return "<a class=\"eli w100px\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"createTime\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"表单布局类型\" data-source=\"/myehr/dict/searchSysDictEntryTypeCode1.action?deleteMark=SYS_FORM_LAYOUT\">";
                	}
        }, {  
            title : '创建人',  
            field : 'createUser',  
            align : 'center',  
            valign : 'middle',  
            sortable : true  ,
            formatter: function (value, row, index) {
                    	return "<a class=\"eli w50px\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"createUser\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"流程表单\" data-source=\"/myehr/dict/searchSysDictEntryTypeCode1.action?deleteMark=SYS_COMMON_YES_NO\">";
                	}
        }, {  
            title : '改变时间',  
            field : 'updateTime',  
            align : 'center',  
            valign : 'middle',  
            sortable : true  ,
            formatter: function (value, row, index) {
                    	return "<a class=\"eli w50px\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"updateTime\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"提交状态\" data-source=\"/myehr/dict/searchSysDictEntryTypeCode1.action?deleteMark=SYS_FORM_SUBMIT_STATUS\">";
                	}
            }, {  
            title : '改变人',  
            field : 'updateUser',  
            align : 'center',  
            valign : 'middle',  
            sortable : true  ,
            formatter: function (value, row, index) {
                    	return "<a  class=\"eli w100px\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"updateUser\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"提交路径\">"+value+"</a>";
                	}
        }, {  
            title : '状态',  
            field : 'state',  
            align : 'center',  
            valign : 'middle',  
            sortable : true  ,
            formatter: function (value, row, index) {
		            	var date = "-";
		                if(value!=null){
		                    date = value;
		                }
                    	return "<a class=\"eli w100px\" style=\"font-size:12px;text-decoration:none;color:black;width:100px\" name=\"state\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"提交日期\">"+date+"</a>";
                	}
        },  {  
            title : '发布人',  
            field : 'createUserName',  
            align : 'center',  
            valign : 'middle',  
            sortable : true  ,
            formatter: function (value, row, index) {
                    	return "<a  class=\"eli w100px\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"createUserName\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"表单描述\">"+value+"</a>";
                	}
        }],
        onClickRow: function (row, $element) {
	                curRow = row;
	                $('#org_list_List').bootstrapTable('uncheckAll');//checkBox单选
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