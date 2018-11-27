<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<link rel="stylesheet" href="${pageContext.request.contextPath }/js/assets/bootstrap/css/bootstrap.min.css">
	<link rel="stylesheet" href="${pageContext.request.contextPath }/js/src/css/layui.css" type="text/css"></link>
    <script type="text/javascript" src="${pageContext.request.contextPath }/js/assets/jquery.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath }/js/assets/bootstrap/js/bootstrap.min.js"></script>
 	<script type="text/javascript" src="${pageContext.request.contextPath }/js/layer/layer.js"></script>
 	<script type="text/javascript" src="${pageContext.request.contextPath }/js/src/layui.js"></script>
  
  </head>
  
  <body>
  
  		<div id="toolbar" style="margin-top:40px ">
  		
	        <button id="confirm" class="btn btn-info" onclick="confirm()">
	            <i class="glyphicon glyphicon-plus"></i> confirm
	        </button>
	        
	        <button id="update" class="btn btn-primary" onclick="iframe1()">
	            <i class="glyphicon glyphicon-pencil"></i> iframe1
		    </button>
		    
		    <button id="remove" class="btn btn-danger" onclick="iframe2()">
		            <i class="glyphicon glyphicon-remove"></i>iframe2
		    </button>
		    
 	    </div>
		<div style="margin-top:40px ">
			 <a href="javascript:;" id="about">关于</a>
			 <button  class="btn btn-info" onclick="msg()">
	            <i class="glyphicon glyphicon-plus"></i> msg
	        </button>
	        
	        <button  class="btn btn-primary" onclick="capture()">
	            <i class="glyphicon glyphicon-pencil"></i> capture
		    </button>
		    
		    <button  class="btn btn-danger" onclick="loading()">
		            <i class="glyphicon glyphicon-remove"></i> loading
		    </button>
		
		</div>
		
		<div style="display:none">
				<h6 class="layer_notice" >
					  skin: 'layer-ext-moon' 该皮肤由layer.seaning.com友情扩展。关于皮肤的扩展规则，去这里查阅
				
				</h6>
		</div>
		<div style="margin-top:40px ">
			<button  class="btn btn-primary" onclick="web()">
	           <i class="glyphicon glyphicon-pencil"></i> open
		    </button>
	   		<button  class="btn btn-primary" onclick="tab()">
		           <i class="glyphicon glyphicon-pencil"></i> tab
		    </button>
		</div>
   		
  </body>
  
  <script type="text/javascript">
  
  	/* //页面一打开就执行，放入ready是为了layer所需配件（css、扩展模块）加载完毕
		layer.ready(function(){ 
		  //官网欢迎页
		  layer.open({
		    type: 2,
		    title: 'layer弹层组件官网',
		    fix: false,
		    maxmin: true,
		    shadeClose: true,
		    area: ['1100px', '600px'],
		    content: 'http://sentsin.com/jquery/layer/?form=local',
		    end: function(){
		      layer.tips('Hi', '#about', {tips: 1});
		    }
		  });
		}); */
  		
		//弹出框
		$('#about').on('click', function(){
		  layer.alert(layer.v + ' - 贤心出品 sentsin.com',{
			  icon: 1,
			  skin: 'layer-ext-moon' //该皮肤由layer.seaning.com友情扩展。关于皮肤的扩展规则，去这里查阅
			});
		});
		
		//confirm
		function confirm(){
		  	layer.confirm('您是如何看待前端开发？', {
				  btn: ['重要','奇葩'] //按钮
				}, function(){
				  layer.msg('的确很重要', {
				  	icon: 1,  //图标
				 	 time:1000 //2s后自动关闭
				   });
				}, function(){
				  layer.msg('也可以这样', {
				    time: 2000, //2s后自动关闭
				    btn: ['明白了', '知道了']
				  });
				}
			);
		};
		
		
		//open   页面
		function web(){
			  layer.open({
			      type: 2,
			      title: '很多时候，我们想最大化看，比如像这个页面。',
			      shadeClose: true,
			      shade: false,
			      maxmin: true, //开启最大化最小化按钮
			      area: ['893px', '600px'],
			      content: 'http://fly.layui.com/'
			    });
		};
		
		//iframe层
		function iframe1(){
			layer.open({
			  type: 2,
			  title: 'layer mobile页',
			  shadeClose: true,
			  shade: 0.8,
			  area: ['380px', '90%'],
			  content: 'http://layer.layui.com/mobile/' //iframe的url
			}); 
		};
		//iframe窗
		function iframe2(){
			layer.open({
			  type: 2,
			  title: false,
			  closeBtn: 0, //不显示关闭按钮
			  shade: [0],
			  area: ['340px', '215px'],
			  offset: 'rb', //右下角弹出
			  time: 2000, //2秒后自动关闭
			  anim: 2,
			  content: ['http://fly.layui.com/', 'no'], //iframe的url，no代表不显示滚动条
			  end: function(){ //此处用于演示
			    layer.open({
			      type: 2,
			      title: '很多时候，我们想最大化看，比如像这个页面。',
			      shadeClose: true,
			      shade: false,
			      maxmin: true, //开启最大化最小化按钮
			      area: ['893px', '600px'],
			      content: 'http://fly.layui.com/'
			    });
			  }
			});
		
		};
		
		
		
		
		//loading层
		
		function loading(){
			var index = layer.load(1, {
			  shade: [0.1,'#fff'] //0.1透明度的白色背景
			});
		};
		//prompt层
		function prompt(){
			layer.prompt({title: '输入任何口令，并确认', formType: 1}, function(pass, index){
			  layer.close(index);
			  layer.prompt({title: '随便写点啥，并确认', formType: 2}, function(text, index){
			    layer.close(index);
			    layer.msg('演示完毕！您的口令：'+ pass +'您最后写下了：'+text);
			  });
			});
		};
		
		
		//tab层
		function tab(){
			layer.tab({
			  area: ['600px', '300px'],
			  tab: [{
			    title: 'TAB1', 
			    content: '内容1'
			  }, {
			    title: 'TAB2', 
			    content: '内容2'
			  }, {
			    title: 'TAB3', 
			    content: '内容3'
			  }]
			});
		};
		
		//tab层
		function capture(){
			//捕获页
			layer.open({
			  type: 1,
			  shade: false,
			  title: false, //不显示标题
			  content: $('.layer_notice'), //捕获的元素，注意：最好该指定的元素要存放在body最外层，否则可能被其它的相对元素所影响
			  cancel: function(){
			    layer.msg('捕获就是从页面已经存在的元素上，包裹layer的结构', {time: 1000, icon:6});
			  }
			});	
		};
			
	/* 	
		//相册层
		$.getJSON('test/photos.json?v='+new Date, function(json){
		  layer.photos({
		    photos: json //格式见API文档手册页
		    ,anim: 5 //0-6的选择，指定弹出图片动画类型，默认随机
		  });
		});
		 */
  
  </script>
</html>
