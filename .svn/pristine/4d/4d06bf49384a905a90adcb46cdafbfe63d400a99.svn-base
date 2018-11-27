<%@ page language="java" import="java.util.*" import="com.myehr.common.util.LangUtil" pageEncoding="UTF-8"%><%@ include file="/commonApp/commonApp.jsp" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
	<meta charset="utf-8">
  <title>Hello</title>
  <meta name="viewport" content="width=device-width, initial-scale=1,maximum-scale=1,user-scalable=no">
  <meta name="apple-mobile-web-app-capable" content="yes">
  <meta name="apple-mobile-web-app-status-bar-style" content="black">
</head>
<body>
<div id="offCanvasWrapper">	
	<div id="offCanvasSide" class="mui-off-canvas-right">
		<div class="canvasContent">
		</div>
		<div class="sift-bottom">
		<div class="sift-clear sift-btn" id="J_SiftClear">重置</div>
		<div class="sift-btn-ok sift-btn" id="J_SiftCommit">确定</div>
	</div>
	<div class="mui-inner-wrap">
		<div class="filterbar-container">
			<div class="filter-bar J_sortTab">
				<ul class="sort-tab mui-clearfix">
					<li class="droplist-trigger selected">
						<span class="text">综合排序</span>
						<span class="arrow"></span>
						<span class="bar"></span>
					</li>
					<li class="sort" data-value="_sale">自定义排序<span class="bar"></span></li>
					<li>
						<div class="top-bar-e">
							<span id="offCanvasShow">筛选</span>
						</div>
					</li>
				</ul>
				<div class="droplist">
					<ul class="sorts" style="margin-left: 32px;">
						<li class="sort selected" data-value="">综合排序<span class="icons-checked-icon"></span></li>
						<li class="sort" data-value="_bid">价格从高到低<span class="icons-checked-icon"></span></li>
						<li class="sort" data-value="bid">价格从低到高<span class="icons-checked-icon"></span></li>
						<li class="sort" data-value="_ratesum">信用排序<span class="icons-checked-icon"></span></li>
					</ul>
				</div>
			</div>
		</div>
<div id="offCanvasContentScroll" class="mui-content mui-scroll-wrapper">
    <div class="mui-content mui-scroll-wrapper" id="pullrefresh">
    	<div class="mui-scroll">
    		 <ul class="mui-table-view mui-grid-view">
				<li v-for="item in renyuan" class="mui-table-view-cell mui-media mui-col-xs-12 mui-col-sm-12" style="height:100%"> 
	<div class="h4 bold left" v-if="item.CRMCASE_cas_custorname"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"{{item.CRMCASE_cas_custorname}}")%></div>
	<div class="h4 bold left" v-if="item.CRMCASE_cas_custorid"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"{{item.CRMCASE_cas_custorid}}")%></div>
	<div class="h4 bold left" v-if="item.CRMCASE_cas_name"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"{{item.CRMCASE_cas_name}}")%></div>
	<div class="h4 bold left" v-if="item.CRMCASE_cas_phone"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"{{item.CRMCASE_cas_phone}}")%></div>
	<div class="null" v-if="item.CRMCASE_cas_email"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"{{item.CRMCASE_cas_email}}")%></div>
	<div class="null" v-if="item.CRMCONTACTS_CON_PRIMARY"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"{{item.CRMCONTACTS_CON_PRIMARY}}")%></div>
	<div class="null" v-if="item.CRMCONTACTS_CON_CUSTORID"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"{{item.CRMCONTACTS_CON_CUSTORID}}")%></div>
	<div class="null" v-if="item.CRMCONTACTS_CON_PROROLE"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"{{item.CRMCONTACTS_CON_PROROLE}}")%></div>
	<div class="null" v-if="item.CRMCONTACTS_CON_NAME"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"{{item.CRMCONTACTS_CON_NAME}}")%></div>
           

	<div class="null" v-if="item.CRMCONTACTS_CON_POST"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"{{item.CRMCONTACTS_CON_POST}}")%></div>
	<div class="null" v-if="item.CRMCONTACTS_CON_DEPT"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"{{item.CRMCONTACTS_CON_DEPT}}")%></div>
	<div class="null" v-if="item.CRMCONTACTS_CON_TELEPHONE"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"{{item.CRMCONTACTS_CON_TELEPHONE}}")%></div>
	<div class="null" v-if="item.CRMCONTACTS_CON_PHONE"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"{{item.CRMCONTACTS_CON_PHONE}}")%></div>
	<div class="null" v-if="item.CRMCONTACTS_CON_EMAIL"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"{{item.CRMCONTACTS_CON_EMAIL}}")%></div>
	<div class="null" v-if="item.CRMCONTACTS_CON_IMNUM"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"{{item.CRMCONTACTS_CON_IMNUM}}")%></div>
	<div class="null" v-if="item.CRMCONTACTS_CON_INTJUDG"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"{{item.CRMCONTACTS_CON_INTJUDG}}")%></div>
	<div class="null" v-if="item.CRMCONTACTS_CON_FOCUS"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"{{item.CRMCONTACTS_CON_FOCUS}}")%></div>
            

							</div>
						</div>
					</div>
				</li>
			</ul>
		</div>
	</div>
    </div>
	<div class="mui-off-canvas-backdrop"></div>
	</div>
</div>
</div>
<!-- 单选模版 -->
<script type="text/x-template" id="chooser">
	<div class="chooser-component row-body">
	<ul class="chooser-list clearfix">
		<li
		class="sift-item J_siftItem"
		v-for="(item, index) in selections"
		v-on:click="chosenSelection(index)"
		:title="item.text"
		:class="{active:index === nowIndex}"
		>{{ item.text }}</li>
		</ul>
	</div>
</script>
<!-- 多选模版 -->
<script type="text/x-template" id="mulChooser">
	<div class="mulchooser-component row-body">
	<ul class="chooser-list clearfix">
		<li
		class="sift-item J_siftItem"
		v-for="(item, index) in selections"
		v-on:click="toggleSelection(index)"
		:title="item.text"
		:class="{active: checkActive(index)}"
		>{{ item.text }}</li>
		</ul>
	</div>
</script>
<script type="text/x-template" id="drawer">
<div class="vue-drawer">
	<div :style="{'transform': 'translate3d('+translateX+'px,0,0)'}" class="main">
	<slot></slot>
	<div class="mask" :class="show ? 'active' : ''" @click="hideMask"></div>
</div>
<div ref="drawer" class="drawer" :class="[pos!='left' ? 'drawer-right' : 'drawer-left', show ? 'active' : '']" >
	<slot name="drawer"></slot>
	</div>
</div> 
</script>
<script src="https://cdn.bootcss.com/vue/2.4.2/vue.js"></script>
<script src="https://cdn.bootcss.com/lodash.js/4.17.4/lodash.js"></script><script src="https://cdn.bootcss.com/fastclick/1.0.6/fastclick.js"></script><script type="text/javascript">
	var _formId_1807='1807';
mui(function(){
	FastClick.attach(document.body);  
})
Vue.component('Drawer', {
template: '#drawer',
props: {
   show: {
     type: Boolean,
     default: false
   },
   pos: {
     type: String,
     default: 'left'
   },
   tran: {
     type: String,
     default: 'overlay'
   }
 },
 data() {
   return {
    drawerWidth:0,
    translateX:0
  }
},
watch:{
  show:function(){
    //listener
    if (!this.show)
      this.$emit('on-hide');
    else
      this.$emit('on-show');
    //transition
    if (this.tran=='overlay') return;
    if (!this.show)
      this.translateX=0
    else
      this.translateX=this.pos=='left'?this.drawerWidth:-this.drawerWidth
  }
},
mounted(){
  this.$nextTick(function () {
    this.drawerWidth=this.$refs.drawer.clientWidth
})
},
methods: {
 hideMask() {
   // this.show = false;
   this.$emit('change-show',false)
 }
}
})
Vue.component('VChooser', {
  template: '#chooser',
  props: {
    selections: {
      type: Array,
      default: [{
        text: 'test',
        id: ''
      }]
    }
  },
  data () {
    return {
      nowIndex: 0
    }
  },
  methods: {
    chosenSelection (index) {
      this.nowIndex = index
      this.$emit('on-change', this.selections[index])
    }
  }
})
Vue.component('VMulChooser', {
  template: '#mulChooser',
  props: {
    selections: {
      type: Array,
      default: [{
        text: 'test',
        id: ''
      }]
    }
  },
  data () {
    return {
      nowIndexes: [0]
    }
  },
  methods: {
    toggleSelection (index) {
      if (this.nowIndexes.indexOf(index) === -1) {
        this.nowIndexes.push(index)  
      }
      else {
        this.nowIndexes = _.remove(this.nowIndexes, (idx) => {
          return idx !== index
        })
      }
      let nowObjArray = _.map(this.nowIndexes, (idx) => {
        return this.selections[idx]
      })
      this.$emit('on-change', nowObjArray)
    },
    checkActive (index) {
      return this.nowIndexes.indexOf(index) !== -1
    }
  }
})
var Currentpage = 0;
var pagesize = 10;
var totalpage = 1;
var heightGadedata =[];
function changeHeightGadedata(data){
	heightGadedata = data;
}
mui.init({
	pullRefresh : {
		container: '#pullrefresh',//待刷新区域标识，querySelector能定位的css选择器均可，比如：id、.class等
		up : {
			height:100,//可选.默认50.触发上拉加载拖动距离
			auto:false,//可选,默认false.自动上拉加载一次
	  		contentrefresh : "正在加载...",//可选，正在加载状态时，上拉加载控件上显示的标题内容
	  		contentnomore:'没有更多数据了',//可选，请求完毕若没有更多数据时显示的提醒内容；
	  		callback :pullfresh //必选，刷新函数，根据具体业务来编写，比如通过ajax从服务器获取新数据；
	  	}
	  }
});
mui('.mui-scroll-wrapper').scroll();
function showList(){
		document.getElementById("showList").classList.add('m-active')
}
function hideList(){
		document.getElementById("showList").classList.remove('m-active')
}
var app = new Vue({
	  el: '#offCanvasWrapper',
	  data: {
	  	renyuan:[],
	  	isDrop: false,
	  	droplist: false,
	  	chooseArr:{
	  	},
	  	mulChooseArr:{
	  	},
	  	chooseValArr:{
	  	},
	  	mulChooseValArr:{
	  	}
	  },
	  created: function(){
	  	FastClick.attach(document.body); 
	  	loadData(); 
	  },
	  methods: {
	  	toggleExpand (e) {
	  		console.log(e)
	  		console.log(this.isDrop);
	  		this.isDrop = !this.isDrop;
	  	},
	    onParamChange (attr, val) {
	      this[attr] = val
	      console.log(val);	
	    },
	    showDropList () {
	    	this.droplist = !this.droplist;
	    }
	  }
	});
	mui(function(){
		var parame={
		    id:'',
		    value:"N",
		    width: "100px",
		    height:"45px",
		    url:'/myehr/dict/searchSysDictEntryTypeCode.action?userId=1',
			  jsonParam:{},
			  formType:'',
		    chang:function (e){
		    }
		};
		//单选
		mui.each(mui(".choose"),function(index,item){
			console.log(item.getAttribute('DictName'));
			console.log(item.getAttribute('dataField'));
			console.log(item.getAttribute('multiSelect'));
			console.log(item.id);
			parame.id=item.id;
		    var dataField=item.getAttribute('dataField');
	        parame.jsonParam.dictTypeCode=item.getAttribute('DictName');
			value = myehr_initSelect_APP(parame,dataField);//返回值
			Vue.set(app.chooseArr,item.id.split(".")[item.id.split(".").length-1],'');
			Vue.set(app.chooseValArr,item.id.split(".")[item.id.split(".").length-1]+'List',value);
		});
		//多选
		mui.each(mui(".mulchoose"),function(index,item){
			console.log(item.getAttribute('DictName'));
			console.log(item.getAttribute('dataField'));
			console.log(item.getAttribute('multiSelect'));
			parame.id=item.id;
		    var dataField=item.getAttribute('dataField');
	        parame.jsonParam.dictTypeCode=item.getAttribute('DictName');
			value = myehr_initSelect_APP(parame,dataField);//返回值
			Vue.set(app.mulChooseArr,item.id.split(".")[item.id.split(".").length-1],'');
			Vue.set(app.mulChooseValArr,item.id.split(".")[item.id.split(".").length-1]+'List',value);
		});
	})
function pullfresh(){ 
		setTimeout(function(){ 
			mui('#pullrefresh').pullRefresh().endPullupToRefresh(Currentpage > totalpage); //参数为true代表没有更多数据了。
			loadData();
			},1500)
		}
function loadData(){ 
		mui.ajax('/myehr/form/cardformInitData.action',{ 
			dataType:'json',//服务器返回json格式数据 
			type:'post',//HTTP请求类型 
	  		data:grid_customer_rel_list_fun(),//HTTP请求类型
			timeout:10000,//超时时间设置为10秒； 
			headers:{'Content-Type':'application/json'},	               
			success:function(data){ 
				console.log(data); 
				Currentpage++; 
				totalpage = Math.ceil(data.total/pagesize);				 
				app.renyuan = app.renyuan.concat(data.rows); 
				 
			}, 
			error:function(xhr,type,errorThrown){ 
				//异常处理； 
				console.log(type); 
			} 
		}); 
	}var filterParam = {};
function grid_customer_rel_list_fun(pageReqeust){
	var _filterdata={};
	var pageReqeust={};
	if($('.canvasContent')){
	}
	var paramsMap = {};
	var requestParam={};
		requestParam = {};
	//pageReqeust.containerParam=containerParam;
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.userIds='${param.empIds}';
	pageReqeust.formId=_formId_1807;
	pageReqeust.isView=null;
	pageReqeust.offset=Currentpage*pagesize;;
	pageReqeust.limit=pagesize;;
	if(heightGadedata!=null&&heightGadedata!=undefined){
		pageReqeust.heightGrade = heightGadedata;
	}
	return JSON.stringify(pageReqeust);
}
function grid_customer_rel_list_fun11_1807(){
	$('#customer_rel_list_List').bootstrapTable('refresh');
}
	mui.init({
		swipeBack: false,
	});
	//侧滑容器父节点
	var offCanvasWrapper = mui('#offCanvasWrapper');
	//主界面容器
	var offCanvasInner = offCanvasWrapper[0].querySelector('.mui-inner-wrap');
	//菜单容器
	var offCanvasSide = document.getElementById("offCanvasSide");
	//移动效果是否为整体移动
	var moveTogether = false;
	//侧滑容器的class列表，增加.mui-slide-in即可实现菜单移动、主界面不动的效果；
	var classList = offCanvasWrapper[0].classList;
	//变换侧滑动画移动效果；
	//仅主内容滑动时，侧滑菜单在off-canvas-wrap内，和主界面并列
	offCanvasWrapper[0].insertBefore(offCanvasSide, offCanvasWrapper[0].firstElementChild);
	moveTogether = false;
	offCanvasWrapper.offCanvas().refresh();
	document.getElementById('offCanvasShow').addEventListener('tap', function() {
		offCanvasWrapper.offCanvas('show');
	});
	//主界面和侧滑菜单界面均支持区域滚动；
	mui('#offCanvasSideScroll').scroll();
	mui('#offCanvasContentScroll').scroll();
	//实现ios平台的侧滑关闭页面；
	if (mui.os.plus && mui.os.ios) {
		offCanvasWrapper[0].addEventListener('shown', function(e) { //菜单显示完成事件
			plus.webview.currentWebview().setStyle({
				'popGesture': 'none'
			});
		});
		offCanvasWrapper[0].addEventListener('hidden', function(e) { //菜单关闭完成事件
			plus.webview.currentWebview().setStyle({
				'popGesture': 'close'
			});
		});
	}
</script>
</body>
</html>
