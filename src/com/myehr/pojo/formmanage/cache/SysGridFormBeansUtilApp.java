package com.myehr.pojo.formmanage.cache;

import java.io.Serializable;


public class SysGridFormBeansUtilApp implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static String appPickJs(){
		String jspBuildString =	SysCardFormBeansUtil.getNbsp(1)+"mui.init({\n"+
								SysCardFormBeansUtil.getNbsp(2)+"swipeBack: false,\n"+
								SysCardFormBeansUtil.getNbsp(1)+"});\n"+
								/*SysCardFormBeansUtil.getNbsp(1)+"//侧滑容器父节点\n"+
								SysCardFormBeansUtil.getNbsp(1)+"var offCanvasWrapper = mui('#offCanvasWrapper');\n"+
								SysCardFormBeansUtil.getNbsp(1)+"//主界面容器\n"+
								SysCardFormBeansUtil.getNbsp(1)+"var offCanvasInner = offCanvasWrapper[0].querySelector('.mui-inner-wrap');\n"+
								SysCardFormBeansUtil.getNbsp(1)+"//菜单容器\n"+
								SysCardFormBeansUtil.getNbsp(1)+"var offCanvasSide = document.getElementById(\"offCanvasSide\");\n"+									
								SysCardFormBeansUtil.getNbsp(1)+"//移动效果是否为整体移动\n"+
								SysCardFormBeansUtil.getNbsp(1)+"var moveTogether = false;\n"+
								SysCardFormBeansUtil.getNbsp(1)+"//侧滑容器的class列表，增加.mui-slide-in即可实现菜单移动、主界面不动的效果；\n"+
								SysCardFormBeansUtil.getNbsp(1)+"var classList = offCanvasWrapper[0].classList;\n"+
								SysCardFormBeansUtil.getNbsp(1)+"//变换侧滑动画移动效果；\n"+						
								SysCardFormBeansUtil.getNbsp(1)+"//仅主内容滑动时，侧滑菜单在off-canvas-wrap内，和主界面并列\n"+
								SysCardFormBeansUtil.getNbsp(1)+"offCanvasWrapper[0].insertBefore(offCanvasSide, offCanvasWrapper[0].firstElementChild);\n"+
								SysCardFormBeansUtil.getNbsp(1)+"moveTogether = false;\n"+
								SysCardFormBeansUtil.getNbsp(1)+"offCanvasWrapper.offCanvas().refresh();\n"+			
								SysCardFormBeansUtil.getNbsp(1)+"document.getElementById('offCanvasShow').addEventListener('tap', function() {\n"+
								SysCardFormBeansUtil.getNbsp(2)+"offCanvasWrapper.offCanvas('show');\n"+
								SysCardFormBeansUtil.getNbsp(1)+"});\n"+
								SysCardFormBeansUtil.getNbsp(1)+"document.getElementById('offCanvasHide').addEventListener('tap', function() {\n"+
								SysCardFormBeansUtil.getNbsp(2)+"offCanvasWrapper.offCanvas('close');\n"+
								SysCardFormBeansUtil.getNbsp(1)+"});\n"+*/
								SysCardFormBeansUtil.getNbsp(1)+"//主界面和侧滑菜单界面均支持区域滚动；\n"+
								SysCardFormBeansUtil.getNbsp(1)+"mui('#offCanvasSideScroll').scroll();\n"+
								SysCardFormBeansUtil.getNbsp(1)+"mui('#offCanvasContentScroll').scroll();\n";
								/*SysCardFormBeansUtil.getNbsp(1)+"//实现ios平台的侧滑关闭页面；\n"+
								SysCardFormBeansUtil.getNbsp(1)+"if (mui.os.plus && mui.os.ios) {\n"+
								SysCardFormBeansUtil.getNbsp(2)+"offCanvasWrapper[0].addEventListener('shown', function(e) { //菜单显示完成事件\n"+
								SysCardFormBeansUtil.getNbsp(3)+"plus.webview.currentWebview().setStyle({\n"+
								SysCardFormBeansUtil.getNbsp(4)+"'popGesture': 'none'\n"+
								SysCardFormBeansUtil.getNbsp(3)+"});\n"+
								SysCardFormBeansUtil.getNbsp(2)+"});\n"+
								SysCardFormBeansUtil.getNbsp(2)+"offCanvasWrapper[0].addEventListener('hidden', function(e) { //菜单关闭完成事件\n"+
								SysCardFormBeansUtil.getNbsp(3)+"plus.webview.currentWebview().setStyle({\n"+
								SysCardFormBeansUtil.getNbsp(4)+"'popGesture': 'close'\n"+
								SysCardFormBeansUtil.getNbsp(3)+"});\n"+
								SysCardFormBeansUtil.getNbsp(2)+"});\n"+
								SysCardFormBeansUtil.getNbsp(1)+"}\n";*/

		return jspBuildString;
	}
	
	public static String appPickHtml1(){
		String jspBuildString =	 "";

		return jspBuildString;
	}
	
	public static String appPickHtml2(){
		String jspBuildString =	 "";
		return jspBuildString;
	}
	
	public static String getAppHead(){
		String jspBuildString =  "<%@ page language=\"java\" import=\"java.util.*\" import=\"com.myehr.common.util.LangUtil\" pageEncoding=\"UTF-8\"%>"
								+"<%@ include file=\"/commonApp/commonApp.jsp\" %>\n"
								+"<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\n"
								+"<html>\n" 
								+"<head>\n" 
								+"	<meta charset=\"utf-8\">\n"
								+"  <title>Hello</title>\n"
								+"  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1,maximum-scale=1,user-scalable=no\">\n" 
								+"  <meta name=\"apple-mobile-web-app-capable\" content=\"yes\">\n" 
								+"  <meta name=\"apple-mobile-web-app-status-bar-style\" content=\"black\">\n" 
								/*+"<script type=\"text/javascript\" src=\"http://wechatfe.github.io/vconsole/lib/vconsole.min.js?v=3.0.0.0\"></script> \n" 
								+"  <script>\n" 
								+"  // init vConsole\n" 
								+"  var vConsole = new VConsole();\n" 
								+"  console.log('Hello world');\n" 
								+"</script>\n" */
								+"</head>\n"
								+"<body>\n" 
								+"<div id=\"app\">";
		return jspBuildString;
	}
	
	public static String appFst(){
		String jspBuildString =	 SysCardFormBeansUtil.getNbsp(0)+"<drawer :show=\"drawerShow\" \n" +
								 SysCardFormBeansUtil.getNbsp(0)+":pos=\"pos\" \n" +
								 SysCardFormBeansUtil.getNbsp(0)+":tran=\"tran\"\n" +
								 SysCardFormBeansUtil.getNbsp(0)+"@change-show=\"changeDrawerShow\"\n" +
								 SysCardFormBeansUtil.getNbsp(0)+"@on-hide=\"onHide\"\n" +
								 SysCardFormBeansUtil.getNbsp(0)+"@on-show=\"onShow\">\n";
		return jspBuildString;
	}
	
	public static String appMenuFst(){
		String jspBuildString =	SysCardFormBeansUtil.getNbsp(1)+"<div id=\"offCanvasSide\" class=\"mui-scroll-wrapper layout\" slot=\"drawer\">\n"+
								/*SysCardFormBeansUtil.getNbsp(2)+"<div id=\"offCanvasSideScroll\" class=\"mui-scroll-wrapper\">\n"+*/
								SysCardFormBeansUtil.getNbsp(2)+"<div class=\"canvasContent\">\n";
		return jspBuildString;
	}
	
	public static String appMenuLst(){
		String jspBuildString =	SysCardFormBeansUtil.getNbsp(2)+"</div>\n"+
								SysCardFormBeansUtil.getNbsp(2)+"<div class=\"sift-bottom\">\n"+
								SysCardFormBeansUtil.getNbsp(2)+"<div class=\"sift-clear sift-btn\" id=\"J_SiftClear\" v-on:click=\"resetSearch()\">重置</div>\n"+
								SysCardFormBeansUtil.getNbsp(2)+"<div class=\"sift-btn-ok sift-btn\" id=\"J_SiftCommit\" v-on:click=\"toSearch()\">确定</div>\n"+
								/*SysCardFormBeansUtil.getNbsp(3)+"</div>\n"+*/
								SysCardFormBeansUtil.getNbsp(2)+"</div>\n"+
								SysCardFormBeansUtil.getNbsp(1)+"</div>\n";
		return jspBuildString;
	}
	
	public static String appContentFst(){
		String jspBuildString =	 SysCardFormBeansUtil.getNbsp(1)+"<div class=\"mui-inner-wrap\">\n";
		return jspBuildString;
	}
	
	public static String appPickTitle(){
		String jspBuildString =	SysCardFormBeansUtil.getNbsp(2)+"<div class=\"filterbar-container\">\n"+
								SysCardFormBeansUtil.getNbsp(3)+"<div class=\"filter-bar J_sortTab\">\n"+
								SysCardFormBeansUtil.getNbsp(4)+"<ul class=\"sort-tab mui-clearfix\">\n"+
								SysCardFormBeansUtil.getNbsp(5)+"<li class=\"droplist-trigger selected\">\n"+
								SysCardFormBeansUtil.getNbsp(6)+"<span class=\"text\">综合排序</span>\n"+
								SysCardFormBeansUtil.getNbsp(6)+"<span class=\"arrow\"></span>\n"+
								SysCardFormBeansUtil.getNbsp(6)+"<span class=\"bar\"></span>\n"+
								SysCardFormBeansUtil.getNbsp(5)+"</li>\n"+
								SysCardFormBeansUtil.getNbsp(5)+"<li class=\"sort\" data-value=\"_sale\">自定义排序<span class=\"bar\"></span></li>\n"+
								SysCardFormBeansUtil.getNbsp(5)+"<li>\n"+
								SysCardFormBeansUtil.getNbsp(6)+"<div class=\"top-bar-e\">\n"+
								SysCardFormBeansUtil.getNbsp(7)+"<span id=\"offCanvasShow\" v-on:click=\"drawerToggle\">筛选</span>\n"+
								SysCardFormBeansUtil.getNbsp(6)+"</div>\n"+
								SysCardFormBeansUtil.getNbsp(5)+"</li>\n"+
								SysCardFormBeansUtil.getNbsp(4)+"</ul>\n"+
								SysCardFormBeansUtil.getNbsp(4)+"<div class=\"droplist\">\n"+
								SysCardFormBeansUtil.getNbsp(5)+"<ul class=\"sorts\" style=\"margin-left: 32px;\">\n"+
								SysCardFormBeansUtil.getNbsp(6)+"<li class=\"sort selected\" data-value=\"\">综合排序<span class=\"icons-checked-icon\"></span></li>\n"+
								SysCardFormBeansUtil.getNbsp(6)+"<li class=\"sort\" data-value=\"_bid\">价格从高到低<span class=\"icons-checked-icon\"></span></li>\n"+
								SysCardFormBeansUtil.getNbsp(6)+"<li class=\"sort\" data-value=\"bid\">价格从低到高<span class=\"icons-checked-icon\"></span></li>\n"+
								SysCardFormBeansUtil.getNbsp(6)+"<li class=\"sort\" data-value=\"_ratesum\">信用排序<span class=\"icons-checked-icon\"></span></li>\n"+
								SysCardFormBeansUtil.getNbsp(5)+"</ul>\n"+
								SysCardFormBeansUtil.getNbsp(4)+"</div>\n"+
								SysCardFormBeansUtil.getNbsp(3)+"</div>\n"+
								SysCardFormBeansUtil.getNbsp(2)+"</div>\n";
		return jspBuildString;
	}
	
	public static String getAppGridHead(){
		String jspBuildString =  "<div id=\"offCanvasContentScroll\" class=\"mui-content mui-scroll-wrapper\">\n" 
								+"    <div class=\"mui-content mui-scroll-wrapper\" id=\"pullrefresh\">\n"
								+"    	<div class=\"mui-scroll\">\n" 
								+"    		 <ul class=\"mui-table-view mui-grid-view\">\n" 
								+"				<li v-for=\"item in renyuan\" class=\"mui-table-view-cell mui-media mui-col-xs-12 mui-col-sm-12\" style=\"height:100%\"> \n";
		return jspBuildString;
	}
	public static String getAppFollow(){	
		String jspBuildString =  "							</div>\n"
								+"						</div>\n"
								+"					</div>\n" 
								+"				</li>\n" 
								+"			</ul>\n"
								+"		</div>\n"
								+"	</div>\n"
								+"  </div>\n";
		return jspBuildString;
	}	
	
	public static String getAppContentLst(){	
		String jspBuildString =  "<div class=\"mui-off-canvas-backdrop\"></div>\n</drawer>\n</div>\n";
		return jspBuildString;
	}
	
	public static String getJsTemplate(){	
		String jspBuildString =  "<!-- 单选模版 -->\n"
								+"<script type=\"text/x-template\" id=\"chooser\">\n"
								+"	<div class=\"chooser-component row-body\">\n" 
								+"	<ul class=\"chooser-list clearfix\">\n" 
								+"		<li\n"
								+"		class=\"sift-item J_siftItem\"\n"
								+"		v-for=\"(item, index) in selections\"\n"
								+"		v-on:click=\"chosenSelection(index)\"\n"
								+"		v-if=\"item.id\"\n"
								+"		:class=\"{active:index === nowIndex}\"\n"
								+"		>{{ item.text }}</li>\n"
								+"		</ul>\n"
								+"	</div>\n"
								+"</script>\n";
		return jspBuildString;
	}	
	
	public static String getJsTemplates(){	
		String jspBuildString =  "<!-- 多选模版 -->\n"
								+"<script type=\"text/x-template\" id=\"mulChooser\">\n"
								+"	<div class=\"mulchooser-component row-body\">\n" 
								+"	<ul class=\"chooser-list clearfix\">\n" 
								+"		<li\n"
								+"		class=\"sift-item J_siftItem\"\n"
								+"		v-for=\"(item, index) in selections\"\n"
								+"		v-on:click=\"toggleSelection(index)\"\n"
								+"		v-if=\"item.id\"\n"
								+"		:class=\"{active: checkActive(index)}\"\n"
								+"		>{{ item.text }}</li>\n"
								+"		</ul>\n"
								+"	</div>\n"
								+"</script>\n";
		return jspBuildString;
	}
	
	public static String getJsExTemplates(){	
		String jspBuildString =  "<script type=\"text/x-template\" id=\"drawer\">\n"
								+"<div class=\"vue-drawer\">\n"
								+"	<div :style=\"{'transform': 'translate3d('+translateX+'px,0,0)'}\" class=\"main\">\n" 
								+"	<slot></slot>\n" 
								+"	<div class=\"mask\" :class=\"show ? 'active' : ''\" @click=\"hideMask\"></div>\n"
								+"</div>\n"
								+"<div ref=\"drawer\" class=\"drawer\" :class=\"[pos!='left' ? 'drawer-right' : 'drawer-left', show ? 'active' : '']\" >\n"
								+"	<slot name=\"drawer\"></slot>\n"
								+"	</div>\n"
								+"</div> \n"
								+"</script>\n";
		return jspBuildString;
	}	
	
	public static String getAppJsFst(){	
		String jspBuildString = "<script src=\"https://cdn.bootcss.com/vue/2.4.2/vue.js\"></script>\n" +
								"<script src=\"https://cdn.bootcss.com/lodash.js/4.17.4/lodash.js\"></script>" +
								"<script src=\"https://cdn.bootcss.com/fastclick/1.0.6/fastclick.js\"></script>";
		return jspBuildString;
	}
	
	public static String getAppJsHead(){	
		String jspBuildString =  "<script type=\"text/javascript\">\n";
		return jspBuildString;
	}
	
	public static String getAppJsContent(String formDefCode,int pageSize,String formId){	
		String jspBuildString =  "mui(function(){\n"
								+"	FastClick.attach(document.body);  \n"
								+"	document.getElementById(\"FILTER_"+formId+"\").addEventListener('keyup',function(event){\n"
								+"		var e = event || window.event || arguments.callee.caller.arguments[0];\n"
								+"		var keyword = document.getElementById(\"FILTER_"+formId+"\").value;\n"
								+"		if(e && e.keyCode == 13) {\n"
								+"			if(keyword !== undefined){\n"
								+"				mui.toast('正在搜索中');\n"
								+"				setTimeout(function(){\n"
								+"					Currentpage = 0;\n"
								+"					eidtData()\n"
								+"				},200);\n"
								+"			}else{\n"
								+"				mui.toast('搜索不能为空');\n"
								+"			}					\n"	
								+"		}\n"
								+"	})\n"
								+"})\n"
								+"Vue.component('Drawer', {\n"
								+"template: '#drawer',\n"
								+"props: {\n"
								+"   show: {\n"
								+"     type: Boolean,\n"
								+"     default: false\n"
								+"   },\n"
								+"   pos: {\n"
								+"     type: String,\n"
								+"     default: 'left'\n"
								+"   },\n"
								+"   tran: {\n"
								+"     type: String,\n"
								+"     default: 'overlay'\n"
								+"   }\n"
								+" },\n"
								+" data: function() {\n"
								+"   return {\n"
								+"    drawerWidth:0,\n"
								+"    translateX:0\n"
								+"  }\n"
								+"},\n"
								+"watch:{\n"
								+"  show:function(){\n"
								+"    //listener\n"
								+"    if (!this.show)\n"
								+"      this.$emit('on-hide');\n"
								+"    else\n"
								+"      this.$emit('on-show');\n"
								+"    //transition\n"
								+"    if (this.tran=='overlay') return;\n"
								+"    if (!this.show)\n"
								+"      this.translateX=0\n"
								+"    else\n"
								+"      this.translateX=this.pos=='left'?this.drawerWidth:-this.drawerWidth\n"
								+"  }\n"
								+"},\n"
								+"mounted: function(){\n"
								+"  this.$nextTick(function () {\n"
								+"    this.drawerWidth=this.$refs.drawer.clientWidth\n"
								+"})\n"
								+"},\n"
								+"methods: {\n"
								+" hideMask: function() {\n"
								+"   // this.show = false;\n"
								+"   this.$emit('change-show',false)\n"
								+" }\n"
								+"}\n"
								+"})\n"	
								+"Vue.component('VChooser', {\n"
								+"  template: '#chooser',\n"
								+"  props: {\n"
								+"    selections: {\n"
								+"      type: Array,\n"
								+"      default: [{\n"
								+"        text: 'test',\n"
								+"        id: ''\n"
								+"      }]\n"
								+"    }\n"
								+"  },\n"
								+"  data: function() {\n"
								+"    return {\n"
								+"      nowIndex: 0\n"
								+"    }\n"
								+"  },\n"
								+"  methods: {\n"
								+"    chosenSelection:function (index) {\n"
								+"      this.nowIndex = index\n"
								+"      this.$emit('on-change', this.selections[index])\n"
								+"    }\n"
								+"  }\n"
								+"})\n"
						
								+"Vue.component('VMulChooser', {\n"
								+"  template: '#mulChooser',\n"
								+"  props: {\n"
								+"    selections: {\n"
								+"      type: Array,\n"
								+"      default: [{\n"
								+"        text: 'test',\n"
								+"        id: ''\n"
								+"      }]\n"
								+"    }\n"
								+"  },\n"
								+"  data: function() {\n"
								+"    return {\n"
								+"      nowIndexes: [0]\n"
								+"    }\n"
								+"  },\n"
								+"  methods: {\n"
								+"    toggleSelection:function (index) {\n"
								+"      if (this.nowIndexes.indexOf(index) === -1) {\n"
								+"        this.nowIndexes.push(index)  \n"
								+"      }\n"
								+"      else {\n"
								+"        this.nowIndexes = _.remove(this.nowIndexes, function(idx){\n"
								+"          return idx !== index\n"
								+"        })\n"
								+"      }\n"
								+"      var nowObjArray = _.map(this.nowIndexes, function(idx){\n"
								+"        return this.selections[idx]\n"
								+"      })\n"
								+"      this.$emit('on-change', nowObjArray)\n"
								+"    },\n"
								+"    checkActive:function (index) {\n"
								+"      return this.nowIndexes.indexOf(index) !== -1\n"
								+"    }\n"
								+"  }\n"
								+"})\n"
								+"var Currentpage = 0;\n" 
								+"var pagesize = "+pageSize+";\n" 
								+"var totalpage = 1;\n"
								+"var heightGadedata =[];\n"
								+"function changeHeightGadedata(data){\n" 
								+"	heightGadedata = data;\n" 
								+"}\n" 
								+"mui.init({\n"
								+"	pullRefresh : {\n" 
								+"		container: '#pullrefresh',//待刷新区域标识，querySelector能定位的css选择器均可，比如：id、.class等\n"
								+"		up : {\n"
								+"			height:100,//可选.默认50.触发上拉加载拖动距离\n" 
								+"			auto:false,//可选,默认false.自动上拉加载一次\n" 
								+"	  		contentrefresh : \"正在加载...\",//可选，正在加载状态时，上拉加载控件上显示的标题内容\n"
								+"	  		contentnomore:'没有更多数据了',//可选，请求完毕若没有更多数据时显示的提醒内容；\n"
								+"	  		callback :pullfresh //必选，刷新函数，根据具体业务来编写，比如通过ajax从服务器获取新数据；\n"
								+"	  	}\n"
								+"	  }\n"
								+"});\n"
				
								+"mui('.mui-scroll-wrapper').scroll();\n" 
								+"function showList(){\n"
								+"		document.getElementById(\"showList\").classList.add('m-active')\n"
								+"}\n" 
								+"function hideList(){\n"
								+"		document.getElementById(\"showList\").classList.remove('m-active')\n"
								+"}\n" 
								
								+"var app = new Vue({\n"
								+"	  el: '#app',\n"
								+"	  data: {\n"
								+"	    pos: 'right',\n"
								+"	    tran: 'overlay',\n"
				       			+"	    drawerShow: false,\n"
								+"	  	renyuan:[],\n"
								+"	  	isDrop: false,\n"
								+"	  	droplist: false,\n"
								+"	  	chooseArr:{\n"
									  		
								+"	  	},\n"
								+"	  	mulChooseArr:{\n"
									  		
								+"	  	},\n"
								+"	  	chooseValArr:{\n"
									  		
								+"	  	},\n"
								+"	  	mulChooseValArr:{\n"
									  		
								+"	  	}\n"
								+"	  },\n"
								+"	  created: function(){\n"
								+"	  	FastClick.attach(document.body); \n"
								+"	  	loadData(); \n"
								+"	  },\n"
								+"	  methods: {\n"
								+"		directionFlip:function() {\n"
								+"		       this.pos=this.pos =='left'?'right':'left'\n"
								+"		       setTimeout(function(){\n"
								+"		        this.drawerToggle()\n"
								+"		      },500)\n"
								+"		     },\n"
								+"		     tranFlip:function() {\n"
								+"		       this.tran=this.tran =='overlay'?'push':'overlay'\n"
										
								+"		       setTimeout( function(){\n"
								+"		        this.drawerToggle()\n"
								+"		      },0)\n"
								+"		     },\n"
								+"		     drawerToggle:function() {\n"
								+"		       this.drawerShow=!this.drawerShow\n"
								+"		     },\n"
								+"		     onHide:function() {\n"
								+"		       console.log('hide');\n"
								+"		     },\n"
								+"		     changeDrawerShow:function(state) {\n"
								+"		      this.drawerShow=state;\n"
								+"		      console.log('drawer was changed from components');\n"
								+"		    },\n"
								+"		    onShow:function() {\n"
								+"		     console.log('show');\n"
								+"		   },\n"
								+"	  	toggleExpand:function (e) {\n"
								+"	  		console.log(e)\n"
								+"	  		console.log(this.isDrop);\n"
								+"	  		this.isDrop = !this.isDrop;\n"
								+"	  	},\n"
								+"	    onParamChange :function(attr, val) {\n"
								+"	      this.chooseArr[attr.split('.')[1]] = val;\n"
								//+"		  $('#'+attr).val(val.id);\n"
								+"		  $(\"[id=\"+attr+\"]\").val(val.id);\n"
								//$("[id='FILTER_TEST_INFOR.TESTINFOR_xingbie_2598']").val()
								+"	      console.log(val);	\n"
								+"	    },\n"
								+"		 onParamChanges :function(attr, val) {\n"
								+"			  this.mulChooseArr[attr.split('.')[1]] = val;\n"
								+"		      var str = '';\n"
								+"			  for(var i=0;i<val.length;i++){\n"
								+"				  str+=val[i].id+',';\n"
								+"			  }\n"
								+"			  str = str.substring(1,str.length-1);\n"
								//+"		      $(\"#\"+attr).val(str);\n"
								+"		  $(\"[id=\"+attr+\"]\").val(str);\n"
								+"		    },\n"
								+"	    showDropList:function () {\n"
								+"	    	this.droplist = !this.droplist;\n"
								+"	    },\n"
								+"		resetSearch :function() {\n"
								+"	    	this.mulChooseArr = {};\n"
								+"	    	this.chooseArr = {};\n"
								+"	    	$('.chooser-list li').removeClass('active');\n"
								+"	    	$('#offCanvasSide input').val('');\n"
								+"	    },\n"
								+"		toSearch:function(){\n"
								+"		Currentpage=0;\n"
								+"	    	eidtData();\n"
								+"	    }\n"
								+"	  }\n"
								+"	});\n"
							
								+"	mui(function(){\n"
										
								+"		var parame={\n"
								+"		    id:'',\n"
								+"		    value:\"N\",\n"
								+"		    width: \"100px\",\n"
								+"		    height:\"45px\",\n"
								+"		    url:'/myehr/dict/searchSysDictEntryTypeCode.action?userId=1',\n"
								+"			  jsonParam:{},\n"
								+"			  formType:'',\n"
								+"		    chang:function (e){\n"
								+"		    }\n"
								+"		};\n"
								+"		//单选\n"
								+"		mui.each(mui(\".choose\"),function(index,item){\n"
								+"			console.log(item.getAttribute('DictName'));\n"
								+"			console.log(item.getAttribute('dataField'));\n"
								+"			console.log(item.getAttribute('multiSelect'));\n"
								+"			console.log(item.id);\n"
								+"			parame.id=item.id;\n"
								+"		    var dataField=item.getAttribute('dataField');\n"
								+"	        parame.jsonParam.dictTypeCode=item.getAttribute('DictName');\n"
								+"			value = myehr_initSelect_APP(parame,dataField);//返回值\n"
											
								+"			Vue.set(app.chooseArr,item.id.split(\".\")[item.id.split(\".\").length-1],'');\n"
								+"			Vue.set(app.chooseValArr,item.id.split(\".\")[item.id.split(\".\").length-1]+'List',value);\n"
								+"		});\n"
								+"		//多选\n"
								+"		mui.each(mui(\".mulchoose\"),function(index,item){\n"
								+"			console.log(item.getAttribute('DictName'));\n"
								+"			console.log(item.getAttribute('dataField'));\n"
								+"			console.log(item.getAttribute('multiSelect'));\n"
								+"			parame.id=item.id;\n"
								+"		    var dataField=item.getAttribute('dataField');\n"
								+"	        parame.jsonParam.dictTypeCode=item.getAttribute('DictName');\n"
								+"			value = myehr_initSelect_APP(parame,dataField);//返回值\n"	
											
								+"			Vue.set(app.mulChooseArr,item.id.split(\".\")[item.id.split(\".\").length-1],'');\n"
								+"			Vue.set(app.mulChooseValArr,item.id.split(\".\")[item.id.split(\".\").length-1]+'List',value);\n"

								+"		});\n"
								
								+"	})\n"+
								
								"function pullfresh(){ \n"+
								"		setTimeout(function(){ \n"+
								"			mui('#pullrefresh').pullRefresh().endPullupToRefresh(Currentpage > totalpage); //参数为true代表没有更多数据了。\n"+
								"			loadData();\n"+
								"			},1500)\n"+
								"		}\n"+
								"function eidtData(){ \n"+
								"		mui.ajax(\'/myehr/form/cardformInitData.action',{ \n"+
								"			dataType:\'json\',//服务器返回json格式数据 \n"+
								"			type:\'post\',//HTTP请求类型 \n"+
								"	  		data:grid_"+formDefCode+"_fun(),//HTTP请求类型\n"+
								"			timeout:10000,//超时时间设置为10秒； \n"+
								"			headers:{\'Content-Type\':\'application/json\'},	               \n"+
								"			success:function(data){ \n"+
								"				console.log(data); \n"+
								"				Currentpage++; \n"+
								"				totalpage = Math.ceil(data.total/pagesize);				 \n"+
								"				app.renyuan = data.rows; \n"+
								"				app.drawerShow=false;"+
								"				 \n"+
								"			}, \n"+
								"			error:function(xhr,type,errorThrown){ \n"+
								"				//异常处理； \n"+
								"				console.log(type); \n"+
								"			} \n"+
								"		}); \n"+
								"	}\n"+
								"function loadData(){ \n"+
								"		mui.ajax(\'/myehr/form/cardformInitData.action',{ \n"+
								"			dataType:\'json\',//服务器返回json格式数据 \n"+
								"			type:\'post\',//HTTP请求类型 \n"+
								"	  		data:grid_"+formDefCode+"_fun(),//HTTP请求类型\n"+
								"			timeout:10000,//超时时间设置为10秒； \n"+
								"			headers:{\'Content-Type\':\'application/json\'},	               \n"+
								"			success:function(data){ \n"+
								"				console.log(data); \n"+
								"				Currentpage++; \n"+
								"				totalpage = Math.ceil(data.total/pagesize);				 \n"+
								"				app.renyuan = app.renyuan.concat(data.rows); \n"+
								"				 \n"+
								"			}, \n"+
								"			error:function(xhr,type,errorThrown){ \n"+
								"				//异常处理； \n"+
								"				console.log(type); \n"+
								"			} \n"+
								"		}); \n"+
								"	}\n";
		return jspBuildString;
	}
	
	public static String getAppJsFollow(){	
		String jspBuildString =  "</script>\n"
								+"</body>\n" 
								+"</html>\n";
		return jspBuildString;
	}
	
	public static String getAppContent(){	
		String jspBuildString =  "<div class=\"leftPic\">\n" 
								+"	  <a>\n" 
								+"		<img class=\"itemPic\" src=\"//gw2.alicdn.com/bao/uploaded/i1/TB1EgNNRVXXXXbKaXXXXXXXXXXX_!!0-item_pic.jpg_210x210.jpg\" alt=\"\" />\n"
								+"		<span class=\"mui-icon mui-icon-weixin\"></span>\n"
								+"	  </a>\n" 
								+"</div>\n"
								+"<div class=\"rightContent\">\n"
								+"    <h3 class=\"r-tit\">{{item.EMP_CHINA_NAME}}</h3> \n" 
								+"	  <div class=\"r-first\"></div>\n" 
								+"	  <div class=\"r-second\">{{item.EMP_CHINA_NAME}}</div>\n"
								+"	  <p v-if=\"item.EMP_POST\">{{item.EMP_POST}}</p>\n"
								+"</div>\n";
		return jspBuildString;
	}
}