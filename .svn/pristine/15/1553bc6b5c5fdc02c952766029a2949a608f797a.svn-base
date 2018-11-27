<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
   <head>
    <title>Bootstrap Table Examples</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath }/js/assets/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath }/js/assets/bootstrap-table/bootstrap-table.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath }/js/assets/examples.css">
    <script src="${pageContext.request.contextPath }/js/assets/jquery.min.js"></script>
    <script src="${pageContext.request.contextPath }/js/assets/bootstrap-table/bootstrap-table.js"></script>
    <script src="${pageContext.request.contextPath }/js/assets/bootstrap-table/src/bootstrap-table-export.js"></script>
    <script src="${pageContext.request.contextPath }/js/assets/bootstrap-table/src/bootstrap-table-editable.js"></script>
    <script src="${pageContext.request.contextPath }/js/assets/bootstrap/js/bootstrap.min.js"></script>
    <script src="${pageContext.request.contextPath }/js/assets/bootstrap-table/src/tableExport.js"></script>
    <script src="${pageContext.request.contextPath }/js/assets/bootstrap-table/src/bootstrap-editable.js"></script>
    <script src="${pageContext.request.contextPath }/js/ga.js"></script>
    <script src="${pageContext.request.contextPath }/js/jquery.ztree.all-3.5.js"></script>
    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="//cdnjs.cloudflare.com/ajax/libs/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="//cdnjs.cloudflare.com/ajax/libs/respond.js/1.4.2/respond.min.js"></script>
    <script src="//cdnjs.cloudflare.com/ajax/libs/json2/20140204/json2.min.js"></script>
    <![endif]-->
<link rel="stylesheet" href="../../../css/zTreeStyle/metro.css" type="text/css"></link>
</head>
<body>
<div class="container-fluid">
	<div style="margin:20px;">
		<div style="border:1px solid #ccc; position:relative;border-radius:5px;margin-bottom:10px;height:40%">
			<h3 style=" background:#FFF;color:blue; display:block;font-size:12;position:absolute; left:10px; top:-27px;text-align:center">自定义sql</h3>
			<div style="margin:15px;">
				<div id="menuContent" class="menuContent" style="width:15%;height:90%;margin-right:10px;border:1px solid rgb(170,170,170);z-index:10;float:left">
				     <iframe id = "dictList" src="../../../jsp/datestruct/entity/onlyEntityTree.jsp" width="100%" height="100%"></iframe>
				</div>
				<div style="width:81%;float:left">
					<button id="cleanup" class="btn btn-sm" onclick="cleapup()"><i class="glyphicon glyphicon-plus"></i>清空</button>
					<button id="lead" class="btn btn-sm" onclick="leadDataField()"><i class="glyphicon glyphicon-plus"></i>转化sql</button>
					<button id="add" class="btn btn-sm" onclick="append()"><i class="glyphicon glyphicon-plus"></i>语法校验</button>
					<textarea class="form-control" id="sql" style="height:74%;width:100%;margin-top:10px;" onFocus="splitSql(document.getElementById('sql'))"></textarea>
				</div>
			</div>
		</div>
		<div style="border:1px solid #ccc; position:relative;border-radius:5px;margin-bottom:10px;height:60%">
			<h3 style=" background:#FFF;color:blue; display:block;font-size:12;position:absolute; left:10px; top:-27px;text-align:center">字段明细</h3>
			<div style="margin:0 15px;">
				<div id="toolbar" class="btn-group"> 
		        	<div id="rMenu1">
						<button id="add" class="btn btn-sm" onclick="append()"><i class="glyphicon glyphicon-plus"></i>映射字段</button>
						<button id="lead" class="btn btn-sm" onclick="leadDataField()"><i class="glyphicon glyphicon-plus"></i>新增</button>
						<button id="add" class="btn btn-sm" onclick="append()"><i class="glyphicon glyphicon-plus"></i>删除</button>
						<button id="lead" class="btn btn-sm" onclick="leadDataField()"><i class="glyphicon glyphicon-plus"></i>保存</button>
						<button id="add" class="btn btn-sm" onclick="append()"><i class="glyphicon glyphicon-plus"></i>刷新</button>
						<button id="lead" class="btn btn-sm" onclick="leadDataField()"><i class="glyphicon glyphicon-plus"></i>编辑属性</button>
						<button id="add" class="btn btn-sm" onclick="append()"><i class="glyphicon glyphicon-plus"></i>批量更新</button>
						<button id="lead" class="btn btn-sm" onclick="leadDataField()"><i class="glyphicon glyphicon-plus"></i>分组设置</button>
						<button id="add" class="btn btn-sm" onclick="append()"><i class="glyphicon glyphicon-plus"></i>预览</button>
						<button id="lead" class="btn btn-sm" onclick="leadDataField()"><i class="glyphicon glyphicon-plus"></i>反选</button>
						<button id="update" class="btn btn-sm"  onclick="update()"><i class="glyphicon glyphicon-pencil"></i>下一步</button>
					</div>
		        </div>
		        <div style="width:100%;height:85%">
			        <table id="formColumnList" style="width:100%;height:100%">  
			        </table>  <!-- 留意-->
		        </div> 
			</div>
		</div>
	</div>
</div>		
<script>
$(function() {  
    querys();  
})  ;
  
function querys() {   
    $("#formColumnList").bootstrapTable({  
        url : '',  
        undefinedText : '-',
        nullText:'-',  
        pagination : true, // 分页  
        striped : true, // 是否显示行间隔色  
        queryParams : queryParams,  
        cache : false, // 是否使用缓存  
        pageList : [ 5, 10, 20 ],  
        toolbar : "#toolbar",// 指定工具栏  
        showExport:true, // 显示导出
        showPaginationSwitch:true,//显示展开
        showColumns : true, // 显示隐藏列  
        showRefresh : true, // 显示刷新按钮
        showToggle:true,  
        uniqueId : "userName", // 每一行的唯一标识  
        sidePagination : "server", // 服务端处理分页  
        tableLayout:"fixed",//列宽一致对其
        /* toolbarAlign: 'right', */
        columns : [ {  
            field : 'state',  
            checkbox : true,  
            align : 'center',  
            valign : 'middle'  
        }, {  
            title : '实体名称',  
            field : 'formEntityTablename', // 字段  
            align : 'center', // 对齐方式（左 中 右）  
            valign : 'middle', //  
            sortable : true 
        },{  
            title : '实体中文名称',  
            field : 'entityChinaname', // 字段  
            align : 'center', // 对齐方式（左 中 右）  
            valign : 'middle', //  
            sortable : true 
        }, {  
            title : '字段名称',  
            field : 'formFieldTablename',  
            align : 'center',  
            valign : 'middle',  
            sortable : true 
        }, {  
            title : '字段显示名称',  
            field : 'formColumnLable',  
            align : 'center',  
            valign : 'middle',  
            sortable : true 
        }, {  
            title : '控件类型',  
            field : 'formColumnGuiType',  
            align : 'center',  
            valign : 'middle',  
            sortable : true 
        }, {  
            title : '显示宽度',  
            field : 'formColumnWidth',  
            align : 'center',  
            valign : 'middle',  
            sortable : true 
            }, {  
            title : '显示高度',  
            field : 'formColumnHeight',  
            align : 'center',  
            valign : 'middle',  
            sortable : true 
        }, {  
            title : '显示方式',  
            field : 'formColumnShowType',  
            align : 'center',  
            valign : 'middle',  
            sortable : true 
        }, {  
            title : '显示顺序',  
            field : 'formColumnSort',  
            align : 'center',  
            valign : 'middle',  
            sortable : true 
        }, {  
            title : '对其方式',  
            field : 'formColumnAlign',  
            align : 'center',  
            valign : 'middle',  
            sortable : true 
        }, {  
            title : '是否必填',  
            field : 'formColumnRequired',  
            align : 'center',  
            valign : 'middle',  
            sortable : true 
        },  {  
            title : '跨字段数',  
            field : 'formColumnColSpan',  
            align : 'center',  
            valign : 'middle',  
            sortable : true 
        },{  
            title : '最大字符数',  
            field : 'formColumnMaxLength',  
            align : 'center',  
            valign : 'middle',  
            sortable : true 
        }, {  
            title : '最小字符数',  
            field : 'formColumnMinLength',  
            align : 'center',  
            valign : 'middle',  
            sortable : true 
        },  {  
            title : '字段值范围',  
            field : 'formColumnColorCondition',  
            align : 'center',  
            valign : 'middle',  
            sortable : true 
        },{  
            title : '字段颜色',  
            field : 'formColumnColor',  
            align : 'center',  
            valign : 'middle',  
            sortable : true 
        }, {  
            title : '所属分组',  
            field : 'formColumnGroupId',  
            align : 'center',  
            valign : 'middle',  
            sortable : true 
        }, {  
            title : '列类型',  
            field : 'formColumnType',  
            align : 'center',  
            valign : 'middle',  
            sortable : true 
        }, {  
            title : '跨行数',  
            field : 'formColumnRowSpan ',  
            align : 'center',  
            valign : 'middle',  
            sortable : true 
            }, {  
            title : '是否合计',  
            field : 'formColumnTotal',  
            align : 'center',  
            valign : 'middle',  
            sortable : true 
        }, {  
            title : '是否开发字段',  
            field : 'formColumnIsDev',  
            align : 'center',  
            valign : 'middle',  
            sortable : true 
        },{
            field: 'null',
            eidtable:false,
            title: '操作',
            formatter: function (value, row, index) {  
               var s = '<button type="button" class="btn btn-default btn-sm" id="remove"><span class="glyphicon glyphicon-trash"></span> Trash</button>';
               return s;  
           	},  
           	events: 'operateEvents'  
        }],
        responseHandler : function(res) {  
            return {  
                total : res.total,  
                rows : res.rows  
            };  
        }, 
    });
}

function queryParams(pageReqeust) {  
	    pageReqeust.enabled = $("#enabled").val();  
	    pageReqeust.querys = $("#querys").val();  
	    pageReqeust.pageNo = this.offset;  
	    pageReqeust.pageSize = this.pageNumber;
	    pageReqeust.formDefFolderId = "481";
	    pageReqeust.condition = $("#search").val();
	    return pageReqeust;  
	}
	
//接收实体树信息
function createSql(entityCode,parentEntityCode,entityChinaname){
	$("#sql").val($("#sql").val()+"["+entityChinaname+"]");
}
function convertSql(){
	var sql = $("#sql").val();
	var sqlpart = sql.split("[")
}

var beforeSql;
var afterSql;
function splitSql(myField){
}

function cleapup(){
	$("#sql").val("");
}
</script>
</html>
