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
  <script src="dist/jquery.min.js"></script>
  <script src="js/highlight/highlight.pack.js"></script>
  <link rel="stylesheet" media="screen" href="js/highlight/styles/github.css">
  <link rel="stylesheet" href="css/font-awesome/css/font-awesome.min.css">
  <link rel="canonical" href="http://handsontable.com/">
  <script src="js/ga.js"></script>
</head>

<body class="home" style="width:1300px;height:600px">
<div class="columnLayout">
<div>
	<div class="jsFiddle inline-buttons">
		<textarea rows="5" style="width:1000px" id="excutesql" cols="100">select * from KBaseCode
		</textarea>
	</div>
	<div class="button">
   		<button class="jsFiddleLink" onclick="search()">查询</button>
 	</div>
 	<div class="button" style="float:left">
   		<button class="jsFiddleLink" onclick="getAll()">保存</button>
 	</div>
 	<div class="button" style="float:left">
   		<button class="jsFiddleLink" onclick="deleteSelect()">删除</button>
 	</div>
 	<div class="jsFiddle inline-buttons">
		<label>主键规则：&nbsp&nbsp&nbsp&nbsp 
			<input type="radio" name="optionsRadios" id="optionsRadios1" value="ADDID" checked> 自增
		</label>
		<label>
			<input type="radio" name="optionsRadios" id="optionsRadios2" value="MAXID">最大Id
		</label>
		<label>
			<input type="radio" name="optionsRadios" id="optionsRadios3" value="UUID">UUID
		</label>
	</div>
</div>
	<div class="rowLayout">
      	<div class="descLayout">
        	<div class="pad" data-jsfiddle="example">
        		<div id="example"></div>
        	</div>
      	</div>
      	<div class="codeLayout">
		    <script data-jsfiddle="example">
		    window.onload=function(){
		    	init();
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
		    function init(){
		    	var excutesql=document.getElementById("excutesql").value;
				$.ajax({
		           url: '${pageContext.request.contextPath }/handsontable/searchData.action?excutesql='+excutesql,
		            type: 'POST',
			        cache: false,
			        contentType: 'application/json;charset=utf-8',
		            success: function(datas) { // 获取当前月的数据
		            	var data=datas.listMap;
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
		            			column.push(data[i][p]);
		            		}
		            		data1.push(column);
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
    		
    		function search(){
    			data1 = [];
    			colWidths=[];
			 	columnsreadOnly=[];
    			var excutesql=document.getElementById("excutesql").value;
    			$.ajax({
		            url: '${pageContext.request.contextPath }/handsontable/searchData.action?excutesql='+excutesql,
		            type: 'POST',
			        cache: false,
			        contentType: 'application/json;charset=utf-8',
		            success: function(datas) { // 获取当前月的数据
		            	var data=datas.listMap;
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
    		
		    /* var data = [
		              ['', 'Maserati', 'Mazda', 'Mercedes', 'Mini', 'Mitsubishi'],
		              ['2009', 0, 2941, 4303, 354, 5814],
		              ['2010', 3, 2905, 2867, 412, 5284],
		              ['2011', 4, 2517, 4822, 552, 6127],
		              ['2012', 2, 2422, 5399, 776, 4151]
		            ], */
		         
		
		    </script>
      	</div>
    </div>
</div>
</body>
</html>
