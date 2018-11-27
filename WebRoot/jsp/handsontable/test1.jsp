<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
  <meta charset='utf-8'>
  <title>Handsontable</title>
  <%@include file="/common/common.jsp"%>
  <script data-jsfiddle="common" src="dist/handsontable.full.js"></script>
  <link data-jsfiddle="common" rel="stylesheet" media="screen" href="dist/handsontable.full.css">

  <link data-jsfiddle="common" rel="stylesheet" media="screen" href="css/samples.css">
  <script src="js/highlight/highlight.pack.js"></script>
  <link rel="stylesheet" media="screen" href="js/highlight/styles/github.css">
  <link rel="stylesheet" href="css/font-awesome/css/font-awesome.min.css">
  <link rel="canonical" href="http://handsontable.com/">
  <link rel="stylesheet" href="${pageContext.request.contextPath }/jsp/handsontable/dist/pagination.css">
  <script src="js/ga.js"></script>
  <script src="${pageContext.request.contextPath }/jsp/handsontable/js/data.js"></script>
  <script src="${pageContext.request.contextPath }/jsp/handsontable/dist/pagination.js"></script>
  <style>
	{
		margin: 0;
		padding: 0;
	}
	.data-list {
		list-style: none;
		}
	.list-item {
		padding: 10px;
	}
	</style>
</head>

<body class="home" style="width:100%;height:100%">
<div id="right_part_step1" style="width: 98%;height: 20%;margin-top:20Px;">
	<div style="height:100%;border:1px solid #ccc; position:relative;border-radius:5px;margin-bottom:10px;margin-left:10px;padding:10px">
		<h3 style=" background:#FFF;color:blue; display:block;font-size:12;position:absolute; left:10px; top:-27px;text-align:center">编写脚本</h3>	
		<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12" style = "height:100%;">
			<div class="BTNGROUP_55" style="margin:0 auto; display:inline-block;min-height: 20px;">
				<div style="margin-right:10px;display:inline-block">
					<input type="button" class="btn btn-info" value="查询" onclick="search()"/>
				</div>
				<div style="margin-right:10px;display:inline-block">
					<input type="button" class="btn btn-info" value="保存" onclick="getAll()"/>
				</div>
				<div style="margin-right:10px;display:inline-block">
					<input type="button" class="btn btn-danger" value="删除" onclick="deleteSelect()"/>
				</div>
			</div>
			<div class="jsFiddle inline-buttons">
				<label>主键规则：
					<input type="radio" name="optionsRadios" id="optionsRadios1" value="ADDID" checked> 自增
				</label>
				<label>
					<input type="radio" name="optionsRadios" id="optionsRadios2" value="MAXID">最大Id
				</label>
				<label>
					<input type="radio" name="optionsRadios" id="optionsRadios3" value="UUID">UUID
				</label>
			</div>
			<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;height: 50%;">
				<textarea name="excutesql" id="excutesql" class="form-control" style="width:100%; height: 100%;resize:none; padding:15px 10px 15px 30px;margin-top:9px;">select * from sys_user</textarea>
			</div>
		</div>
	</div>
</div>
<div id="right_part_step2" style="width: 98%;height:70%;margin-top:20Px;">
	<div class="rowLayout" style="height:470px;margin-left:10px">
		<div class="descLayout" style="width:100%;height:470px">
			<div class="pad" style="width:100%;height:470px" data-jsfiddle="example">
				<div id="example" style="width:100%;height:470px;overflow:auto;"></div>
				<div id="pagination" class="pagination"></div>
				</div>
				<script src="dist/pagination.js"></script>
		    </div>
			<div class="codeLayout">
			<script data-jsfiddle="example">
		    window.onload=function(){
		    	init(1, 20);
		    }
		    var data1 = [];
			var hot;
			var data;
			var colWidths=[];
			var columnsreadOnly=[];
			var head=[];
			var container = document.getElementById('example');
			var primaryKey;
			var str = [];
		    function init(pageNo, pageSize){
		    	var excutesql=document.getElementById("excutesql").value;
				var _param={excutesql:excutesql,pageNo:pageNo,pageSize:pageSize};
				$.ajax({
					url: '${pageContext.request.contextPath }/handsontable/searchDataBySql.action',
					type: 'POST',
					data: JSON.stringify(_param),
			        cache: false,
			        contentType: 'application/json;charset=utf-8',
		            success: function(datas) { // 获取当前月的数据
		            	var data=datas.listMap;
						total=datas.total;
						initUI(pageNo, pageSize,total,'init');
		            	primaryKey=datas.primaryKey;
		            	str = primaryKey.split("\.");
		            	var checkbox={
						    data: "check",
						    type: "checkbox",
						    checkedTemplate: 'yes',
						    uncheckedTemplate: 'no'
					    };
					    head.push("选择");
					    columnsreadOnly.push(checkbox);
		            	for ( var p in data[0]){
							if(p=='rn'){
								continue;
							}
		            		head.push(p);
		            		colWidths.push(100);
		            		if(p==str[1]){
		            			columnsreadOnly.push({readOnly:true});
		            		}else{
		            			columnsreadOnly.push({readOnly:false});
		            		}
		            	}
		            	for (var i=0;i<data.length;i++){
		            		var column=[];
		            		column.push("no");
		            		for ( var p in data[i]){
								if(p=='rn'){
									continue;
								}
		            			column.push(data[i][p]);
		            		}
		            		data1.push(column);
		            	}
						if(hot!=undefined){
							hot.destroy();
						}
				        hot = new Handsontable(container, {
				            data: data1,
				            minSpareRows: 1,
				            fixedColumnsLeft:1,
				            colHeaders: head,
				            //readOnly:false,
				            //colWidths: [100,100,100,100,100,100,100,100,100],
				            contextMenu: true,
				            columns:columnsreadOnly
				        });
		            }
		        }); 
    		}
			
			function initUI(pageNo, pageSize,total,type) {
				var html = '';
				if(type=='init' || type=='search'){
				}else{
					search(pageNo, pageSize);
				}
				var len;
				if(total>=10){
					len=10;
				}else{
					len=total;
				}
				pagination({
					cur: pageNo,
					total: total,
					len: len,
					targetId: 'pagination',
					callback: function() {
						var me = this;
						var oPages = document.getElementsByClassName('page-index');
						for(var i = 0; i < oPages.length; i++) {
							oPages[i].onclick=function() {
								initUI(this.getAttribute('data-index'), 20);
							}
						}
						var goPage = document.getElementById('go-search');
						goPage.onclick = function() {
							var index = document.getElementById('yeshu').value;
							if(!index || (+index > me.total) || (+index < 1)) {
								return;
							}
							initUI(index, 20);
						}
					}
				});
			}
    		
    		function search(pageNo,pageSize){
    			data1 = [];
    			colWidths=[];
			 	columnsreadOnly=[];
    			var excutesql=document.getElementById("excutesql").value;
				var _param={excutesql:excutesql,pageNo:pageNo,pageSize:pageSize};
    			$.ajax({
		            url: '${pageContext.request.contextPath }/handsontable/searchDataBySql.action',
		            type: 'POST',
					data: JSON.stringify(_param),
			        cache: false,
			        contentType: 'application/json;charset=utf-8',
		            success: function(datas) { // 获取当前月的数据
		            	var data=datas.listMap;
						total=datas.total;
						initUI(pageNo, pageSize,total,'search');
		            	primaryKey=datas.primaryKey;
		            	str = primaryKey.split("\.");
		            	head=[];
		            	var checkbox={
						    data: "check",
						    type: "checkbox",
						    checkedTemplate: 'yes',
						    uncheckedTemplate: 'no'
					    };
					    head.push("选择");
		            	columnsreadOnly.push(checkbox);
		            	for ( var p in data[0]){
							if(p=='rn'){
								continue;
							}
		            		head.push(p);
		            		colWidths.push(100);
		            		if(p==str[1]){
		            			columnsreadOnly.push({readOnly:true});
		            		}else{
		            			columnsreadOnly.push({readOnly:false});
		            		}
		            	}
		            	for (var i=0;i<data.length;i++){
		            		var column=[];
		            		column.push("no");
		            		for ( var p in data[i]){
								if(p=='rn'){
									continue;
								}
		            			column.push(data[i][p]);
		            		}
		            		data1.push(column);
		            	}
		            	//hot.loadData(data1);
		            	hot.destroy();
				       	hot = new Handsontable(container, {
				            data: data1,
				            minSpareRows: 1,
				            fixedColumnsLeft:1,
				            colHeaders: head,
				            //readOnly:false,
				            //colWidths: [100,100,100,100,100,100,100,100,100],
				            contextMenu: true,
				            columns:columnsreadOnly
				        }); 
		            }
		        })
    		}
    		
    		function getAll(){
    			var data=hot.getData();
    			var keyrule='';
    			var radios = document.getElementsByName("optionsRadios");  
			    for (var i=0; i<radios.length; i++) {  
			        if (radios[i].checked) {  
			            keyrule=radios[i].value; 
			        }  
			    }  
    			var header=head;
    			var dataobjs=new Array();
    			for(var j=0;j<data.length-1;j++){
    				var dataobj=data[j];
    				var obj;
    				var obj="{";
    				for(var i=0;i<header.length;i++){
    					/* var p = header[i];
	    				obj.p=dataobj[i]; */
	    				if(dataobj[i]==null){
	    					obj+=header[i]+":'',\n";
	    				}else{
	    					obj+=header[i]+":'"+dataobj[i]+"',\n";
	    				}
	    			}
	    			obj=obj.substring(0, obj.length-1);
	    			obj+="}";
	    			var obj2=eval("("+obj+")"); 
	    			/* var jsonobj=JSON.stringify(obj);
	    			alert(jsonobj); */
	    			dataobjs.push(obj2);
    			}
    			var _param={};
    			_param.kbasecodes=dataobjs;
    			_param.primaryKey = primaryKey;
    			_param.keyrule = keyrule;
    			$.ajax({
		            url: '${pageContext.request.contextPath }/handsontable/updateData.action',
		            type:'post',
					data: JSON.stringify(_param),
					cache: false,
					contentType: 'application/json;charset=utf-8',
		            success: function (text) {
		               
		               	alert("保存成功！");
		               	var index = parent.layer.getFrameIndex(window.name); //获取当前窗体索引
					    parent.layer.close(index);//执行关闭
		            },
		        });
    		}
    		
    		function deleteSelect(){
    			var data=hot.getData();
    			var header=head;
    			var dataobjs=new Array();
    			for(var j=0;j<data.length-1;j++){
    				var dataobj=data[j];
    				var obj;
    				var obj="{";
    				for(var i=0;i<header.length;i++){
    					/* var p = header[i];
	    				obj.p=dataobj[i]; */
	    				if(dataobj[i]==null){
	    					obj+=header[i]+":'',";
	    				}else{
	    					obj+=header[i]+":'"+dataobj[i]+"',";
	    				}
	    			}
	    			obj=obj.substring(0, obj.length-1);
	    			obj+="}";
	    			var obj2=eval("("+obj+")"); 
	    			/* var jsonobj=JSON.stringify(obj);
	    			alert(jsonobj); */
	    			dataobjs.push(obj2);
    			}
    			var _param={};
    			_param.kbasecodes=dataobjs;
    			_param.primaryKey = primaryKey;
    			$.ajax({
		            url: '${pageContext.request.contextPath }/handsontable/deleteData.action',
		            type:'post',
					data: JSON.stringify(_param),
					cache: false,
					contentType: 'application/json;charset=utf-8',
		            success: function (text) {
		               
		               	alert("保存成功！");
		               	var index = parent.layer.getFrameIndex(window.name); //获取当前窗体索引
					    parent.layer.close(index);//执行关闭
		            },
		        });
    		}
    		
		    </script>
			</div>
		</div>
	</div>
</div>
</body>
</html>
