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
<div id="app"><drawer :show="drawerShow" 
:pos="pos" 
:tran="tran"
@change-show="changeDrawerShow"
@on-hide="onHide"
@on-show="onShow">
	<div id="offCanvasSide" class="mui-scroll-wrapper layout" slot="drawer">
		<div class="canvasContent">
<div class="sift-row choose" id = "FILTER_TEST_INFOR.TESTINFOR_xingbie_2598" styleType="select"  DictName="SYS_GENDER" dataField="dictList_form_0" :class="{'sift-row-expand': isDrop}">
	<div class="row-head J_siftRowExpand" :class="{'sift-row-expand': isDrop}">
		<span class="title"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"性别")%>：</span>
		<span class="selected-items"></span>
		<span class="icons-sift-down switch-btn" v-on:click="toggleExpand"></span>
	</div>
  <v-chooser :selections="chooseValArr.TESTINFOR_xingbie_2598List" @on-change="onParamChange('FILTER_TEST_INFOR.TESTINFOR_xingbie_2598', $event)"></v-chooser>
</div>
		</div>
		<div class="sift-bottom">
		<div class="sift-clear sift-btn" id="J_SiftClear" v-on:click="resetSearch()">重置</div>
		<div class="sift-btn-ok sift-btn" id="J_SiftCommit" v-on:click="toSearch()">确定</div>
		</div>
	</div>
	<div class="mui-inner-wrap">
			<div id="searchInput" style="z-index: 50;margin:0;padding: 5px 10px;background: #fff;position:relative;">
				<div class="mui-input-row mui-search" style="z-index: 100;background: #fff;">
					<input type="search" id="FILTER_2598" name="FILTER_2598" class="mui-input-clear" placeholder="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"中文名")%>" style="margin: 0;">
				</div>
			</div>
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
							<span id="offCanvasShow" v-on:click="drawerToggle">筛选</span>
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
<div class="leftContent" style="width:30%;float:left;">
	<div class="clearfix"  style="display:block;">
<a>
	<img class="itemPic" :src = "'http://192.168.1.109:9999/' + item.TESTINFOR_zhaopian " alt="" />
	<span class="mui-icon"></span>
</a>
</div>
</div>
<div class="rightContent" style="width:70%;float:left;">
	<div class="clearfix"  style="display:block;">
	<div class="left   hidden" v-if="item.TESTINFOR_id"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"{{item.TESTINFOR_id}}")%></div>
<div class="left   hidden" v-if="item.TESTINFOR_ruxueshijian"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"{{item.TESTINFOR_ruxueshijian}}")%></div>
<div class="left   hidden" v-if="item.TESTINFOR_biyeshijian"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"{{item.TESTINFOR_biyeshijian}}")%></div>
	<div class="left   hidden" v-if="item.TESTINFOR_biyeyuanxiao"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"{{item.TESTINFOR_biyeyuanxiao}}")%></div>
	<div class="left   hidden" v-if="item.TESTINFOR_tubiao"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"{{item.TESTINFOR_tubiao}}")%></div>
<a id="x1" href="toForm.action?isInit=true&formType=APP&formId=416">
	<div class="left h2  bold" v-if="item.TESTINFOR_china_name"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"{{item.TESTINFOR_china_name}}")%></div>
</a>
	<div class="left h2  bold" v-if="item.TESTINFOR_eng_name"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"{{item.TESTINFOR_eng_name}}")%></div>
</div>
<div class="clearfix" style="display:block;">
	<div class="left h5  " v-if="item.TESTINFOR_guoji"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"{{item.TESTINFOR_guoji}}")%></div>
	<div class="left   " v-if="item.TESTINFOR_jiguan"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"{{item.TESTINFOR_jiguan}}")%></div>
	<div class="left   " v-if="item.TESTINFOR_xuli"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"{{item.TESTINFOR_xuli}}")%></div>
<div class="left   " v-if="item.TESTINFOR_xingbie"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"{{item.TESTINFOR_xingbie}}")%></div>

</div>
<div class="clearfix" style="display:block;">
	<div class="left h5  " v-if="item.TESTINFOR_gongsi"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"{{item.TESTINFOR_gongsi}}")%></div>
	<div class="left h5  " v-if="item.TESTINFOR_bumen"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"{{item.TESTINFOR_bumen}}")%></div>
	<div class="left h5  " v-if="item.TESTINFOR_gangwei"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"{{item.TESTINFOR_gangwei}}")%></div>
	<div class="left   " v-if="item.TESTINFOR_nianling"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"{{item.TESTINFOR_nianling}}")%></div>
</div>
<div class="clearfix" style="display:block;">
	<div class="left h5  bold" v-if="item.TESTINFOR_zhuzhi"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"{{item.TESTINFOR_zhuzhi}}")%></div>
							</div>
						</div>
					</div>
				</li>
			</ul>
		</div>
	</div>
  </div>
<div class="mui-off-canvas-backdrop"></div>
</drawer>
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
		v-if="item.id"
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
		v-if="item.id"
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
	var _formId_2598='2598';
mui(function(){
	FastClick.attach(document.body);  
	document.getElementById("FILTER_2598").addEventListener('keyup',function(event){
		var e = event || window.event || arguments.callee.caller.arguments[0];
		var keyword = document.getElementById("FILTER_2598").value;
		if(e && e.keyCode == 13) {
			if(keyword !== undefined){
				mui.toast('正在搜索中');
				setTimeout(function(){
					Currentpage = 0;
					eidtData()
				},200);
			}else{
				mui.toast('搜索不能为空');
			}					
		}
	})
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
	  el: '#app',
	  data: {
	    pos: 'right',
	    tran: 'overlay',
	    drawerShow: false,
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
		directionFlip() {
		       this.pos=this.pos =='left'?'right':'left'
		       setTimeout(()=>{
		        this.drawerToggle()
		      },500)
		     },
		     tranFlip() {
		       this.tran=this.tran =='overlay'?'push':'overlay'
		       setTimeout(()=>{
		        this.drawerToggle()
		      },0)
		     },
		     drawerToggle() {
		       this.drawerShow=!this.drawerShow
		     },
		     onHide() {
		       console.log('hide');
		     },
		     changeDrawerShow(state) {
		      this.drawerShow=state;
		      console.log('drawer was changed from components');
		    },
		    onShow() {
		     console.log('show');
		   },
	  	toggleExpand (e) {
	  		console.log(e)
	  		console.log(this.isDrop);
	  		this.isDrop = !this.isDrop;
	  	},
	    onParamChange (attr, val) {
	      this.chooseArr[attr.split('.')[1]] = val;
		  $("[id="+attr+"]").val(val.id);
	      console.log(val);	
	    },
		 onParamChanges (attr, val) {
			  this.mulChooseArr[attr.split('.')[1]] = val;
		      var str = '';
			  for(var i=0;i<val.length;i++){
				  str+=val[i].id+',';
			  }
			  str = str.substring(1,str.length-1);
		  $("[id="+attr+"]").val(str);
		    },
	    showDropList () {
	    	this.droplist = !this.droplist;
	    },
		resetSearch () {
	    	this.mulChooseArr = {};
	    	this.chooseArr = {};
	    	$('.chooser-list li').removeClass('active');
	    	$('#offCanvasSide input').val('');
	    },
		toSearch(){
		Currentpage=0;
	    	eidtData();
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
function eidtData(){ 
		mui.ajax('/myehr/form/cardformInitData.action',{ 
			dataType:'json',//服务器返回json格式数据 
			type:'post',//HTTP请求类型 
	  		data:grid_testGridApp_fun(),//HTTP请求类型
			timeout:10000,//超时时间设置为10秒； 
			headers:{'Content-Type':'application/json'},	               
			success:function(data){ 
				console.log(data); 
				Currentpage++; 
				totalpage = Math.ceil(data.total/pagesize);				 
				app.renyuan = data.rows; 
				app.drawerShow=false;				 
			}, 
			error:function(xhr,type,errorThrown){ 
				//异常处理； 
				console.log(type); 
			} 
		}); 
	}
function loadData(){ 
		mui.ajax('/myehr/form/cardformInitData.action',{ 
			dataType:'json',//服务器返回json格式数据 
			type:'post',//HTTP请求类型 
	  		data:grid_testGridApp_fun(),//HTTP请求类型
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
	}

var filterParam = {};
var containerParam ;
function grid_testGridApp_fun(pageReqeust){
	var _filterdata={};
	var pageReqeust={};
	if($('.canvasContent')){
	if(($("[id='FILTER_TEST_INFOR.TESTINFOR_xingbie_2598']").attr('styleType')=="select")||($("[id='FILTER_TEST_INFOR.TESTINFOR_xingbie_2598']").attr('styleType')=="dateTime")){
		if($("[id='FILTER_TEST_INFOR.TESTINFOR_xingbie_2598']").attr('multiSelect')){
			if(app&&app.mulChooseArr&&app.chooseArr.TESTINFOR_xingbie_2598){
				var TESTINFOR_xingbie=app.mulChooseArr.TESTINFOR_xingbie_2598.id;
			}else{
				var TESTINFOR_xingbie="";
			}
		}else{
			if(app&&app.chooseArr&&app.chooseArr.TESTINFOR_xingbie_2598){
			var TESTINFOR_xingbie=app.chooseArr.TESTINFOR_xingbie_2598.id;
			}else{
			var TESTINFOR_xingbie="";
			}
		}
	}else{
		var TESTINFOR_xingbie=$("[id='FILTER_2598']").val();
	}
	if(($("[id='FILTER_TEST_INFOR.TESTINFOR_china_name_2598']").attr('styleType')=="select")||($("[id='FILTER_TEST_INFOR.TESTINFOR_china_name_2598']").attr('styleType')=="dateTime")){
		if($("[id='FILTER_TEST_INFOR.TESTINFOR_china_name_2598']").attr('multiSelect')){
			if(app&&app.mulChooseArr&&app.chooseArr.TESTINFOR_china_name_2598){
				var TESTINFOR_china_name=app.mulChooseArr.TESTINFOR_china_name_2598.id;
			}else{
				var TESTINFOR_china_name="";
			}
		}else{
			if(app&&app.chooseArr&&app.chooseArr.TESTINFOR_china_name_2598){
			var TESTINFOR_china_name=app.chooseArr.TESTINFOR_china_name_2598.id;
			}else{
			var TESTINFOR_china_name="";
			}
		}
	}else{
		var TESTINFOR_china_name=$("[id='FILTER_2598']").val();
	}
		_filterdata={TESTINFOR_xingbie:TESTINFOR_xingbie,TESTINFOR_china_name:TESTINFOR_china_name};
	}
	var paramsMap = {};
	var requestParam={};
		requestParam = {};
	pageReqeust.containerParam=containerParam;
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.userIds='${param.empIds}';
	pageReqeust.formId=_formId_2598;
	pageReqeust.isView=null;
	pageReqeust.offset=Currentpage*pagesize;;
	pageReqeust.limit=pagesize;;
	if(heightGadedata!=null&&heightGadedata!=undefined){
		pageReqeust.heightGrade = heightGadedata;
	}
	return JSON.stringify(pageReqeust);
}
function grid_testGridApp_fun11_2598(){
	$('#testGridApp_List').bootstrapTable('refresh');
}
	mui.init({
		swipeBack: false,
	});
	//主界面和侧滑菜单界面均支持区域滚动；
	mui('#offCanvasSideScroll').scroll();
	mui('#offCanvasContentScroll').scroll();
	
	$("#x1").mouseover(function(){
	  $("#x1").css("background-color","yellow");
	});
	$("#x1").mouseout(function(){
	  $("#x1").css("background-color","yellow");
	});
	
</script>
</body>
</html>
