<%@ page language="java" import="java.util.*" import="com.myehr.common.util.LangUtil" pageEncoding="UTF-8"%><%@ include file="/commonApp/commonApp.jsp" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
  <meta name="apple-mobile-web-app-capable" content="yes">
  <meta name="apple-mobile-web-app-status-bar-style" content="black">
  <meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no" />
  <script type="text/javascript" src="${pageContext.request.contextPath }/common/js/iconfont.js"></script>
  <style type="text/css">
.hexie-icon{
  font-size: 35px;
  line-height: 100px;
  color:#333;
  -webkit-transition: font-size 0.25s ease-out 0s;
  -moz-transition: font-size 0.25s ease-out 0s;
  transition: font-size 0.25s ease-out 0s;
  /* 通过设置 font-size 来改变图标大小 */
  width: 1em; height: 1em;
  /* 图标和文字相邻时，垂直对齐 */
  vertical-align: -0.15em;
  /* 通过设置 color 来改变 SVG 的颜色/fill */
  fill: currentColor;
  /* path 和 stroke 溢出 viewBox 部分在 IE 下会显示
     normalize.css 中也包含这行 */
  overflow: hidden;
}
  
  </style>
</head>
<body id="app">
    <div class="mui-content">    	
        <div class="mui-scroll-wrapper">
            <div class="mui-scroll">
            	<div class="menu-2-group" v-for="item in menuItem">
            		<h3>{{item.menuName}}</h3>
            		<ul class="mui-table-view mui-grid-view mui-grid-9">
		                <li v-for="cell in item.childrens" class="mui-table-view-cell mui-media mui-col-xs-1 mui-col-sm-1">
		                    <a :href="cell.menuUrl">
		                        <!-- <span class="glyphicon" :class ="cell.imgFileId"></span> -->
		                        <svg v-if="cell.imgFileId !== 'null'" class="hexie-icon" aria-hidden="true">
			                        <use xlink:href={{cell.imgFileId}}></use>
			                    </svg>
								<!-- 
		                        <svg v-else class="hexie-icon" aria-hidden="true">
			                        <use xlink:href="#icon-drxx80"></use>
			                    </svg>
								-->
								<span v-else class="btn border1 border111" style="background-color:pink;font-size:18px;color:#fff;font-family:KaiTi"><strong>{{cell.menuName.substr(0,1)}}</strong></span>
		                        <div class="mui-media-body">{{cell.menuName}}</div>
		                    </a>
		                </li>
	                </ul>   
            	</div>    
            </div>
        </div> 
        <nav class="mui-bar mui-bar-tab">
            <span v-for="item in menu" track-by="$index" v-on:tap="menuTab($index)" @click="menuTab($index)" class="mui-tab-item" :class="{mui-active: $index===currentIndex}">
                <span class="mui-icon glyphicon" :class ="item.imgFileId"></span>
                <span class="mui-tab-label">{{item.menuName}}</span>
            </span>
        </nav>
    </div>
    <script src="http://cdn.jsdelivr.net/vue/1.0.26/vue.min.js"></script>
    
    <script type="text/javascript">
    mui.init();
    //初始化单页的区域滚动
	mui('.mui-scroll-wrapper').scroll();
	function showList(){
		document.getElementById("showList").classList.add('m-active')
	}
	function hideList(){
		document.getElementById("showList").classList.remove('m-active')
	}

	var app = new Vue({         
		el: '#app',               
	    data: { 
	      currentIndex: 0,
	      menu:[],
	      menuItem:[]
	    },
	    methods: {
	    	menuTab: function(index) {
	    		console.log(index);
	    		this.currentIndex = index;
	    		this.menuItem = this.menu[index].childrens;
	    		Vue.nextTick(function(){
	    			console.log(index);
	    		})
	    	}
	    },
	    created: function(){
	    	mui.ajax('/myehr/form/menuJsonWithScheme.action?schemeId=5&formType=APP',{ 
				dataType:'json',//服务器返回json格式数据 
				type:'post',//HTTP请求类型 
				timeout:10000,//超时时间设置为10秒； 
				//headers:{'Content-Type':'application/json'},	               
				success:function(data){ 
					app.menu = data.data;
					app.menuItem = app.menu[0].childrens;
					app.menuTab(0);
				}, 
				error:function(xhr,type,errorThrown){ 
					//异常处理； 
					console.log(type); 
				} 
			}); 
			
	    }
	  });
	  
	  app(function($, window){
			$(function() {
			   //在此就可以执行执行你的代码了
			   $("svg").attr("fill","pink");
			})();
		}, true);
    </script>
</body>
</html>