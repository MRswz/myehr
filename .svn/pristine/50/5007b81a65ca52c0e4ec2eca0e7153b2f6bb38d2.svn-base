<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>My JSP 'DemoJsp.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
  	<style type="text/css">
  		#dropdown-menu .dropdown{float:left;   }
  		
   		#dLabel{height:45px; font-size:17px; line-height:36px; }
   		#top{height:50px;margin:10px 50px 5px 100px;  }
   		#top #top-left{float:left;}
   		#top #top-right{float:right;}
   		#container{height:45px;background-color:#337AB7;line-height:40px; }
   		
        #container .dropdown-submenu {  
            position: relative;
            
        }  
        #container .dropdown-submenu > .dropdown-menu {  
            top: 0;  
            left: 100%;  
            margin-top: -6px;  
            margin-left: -1px;  
            -webkit-border-radius: 0 6px 6px 6px;  
            -moz-border-radius: 0 6px 6px;  
            border-radius: 0 6px 6px 6px;  
        }  
        #container .dropdown-submenu:hover > .dropdown-menu {  
            display: block;  
        }  
       #container  .dropdown-submenu > a:after {  
            display: block;  
            content: " ";  
            float: right;  
            width: 0;  
            height: 0;  
            border-color: transparent;  
            border-style: solid;  
            border-width: 5px 0 5px 5px;  
            border-left-color: #ccc;  
            margin-top: 5px;  
            margin-right: -10px;  
        }  
       #container  .dropdown-submenu:hover > a:after {  
            border-left-color: #fff;  
            
        }  
       #container  .dropdown-submenu.pull-left {  
            float: none;  
        }  
        #container .dropdown-submenu.pull-left > .dropdown-menu {  
            left: -100%;  
            margin-left: 10px;  
            -webkit-border-radius: 6px 0 6px 6px;  
            -moz-border-radius: 6px 0 6px 6px;  
            border-radius: 6px 0 6px 6px;  
        }  
  	
  		#middle{height:600px;width:100%;background:url("image/timg1.jpg");background-size:100% auto; background-repeat: no-repeat; }
  		.tree {
		  min-height:20px;
		  padding:19px;
		  margin-bottom:20px;
		  background-color:#fbfbfb;
		  -webkit-border-radius:4px;
		  -moz-border-radius:4px;
		  border-radius:4px;
		  -webkit-box-shadow:inset 0 1px 1px rgba(0, 0, 0, 0.05);
		  -moz-box-shadow:inset 0 1px 1px rgba(0, 0, 0, 0.05);
		  box-shadow:inset 0 1px 1px rgba(0, 0, 0, 0.05)
		}
		.tree li {
		  list-style-type:none;
		  margin:0;
		  padding:10px 5px 0 5px;
		  position:relative
		}
		.tree li::before, .tree li::after {
		  content:'';
		  left:-20px;
		  position:absolute;
		  right:auto
		}
		.tree li::before {
		  border-left:1px solid #999;
		  bottom:50px;
		  height:100%;
		  top:0;
		  width:1px
		}
		.tree li::after {
		  border-top:1px solid #999;
		  height:20px;
		  top:25px;
		  width:25px
		}
		.tree li span {
		  -moz-border-radius:5px;
		  -webkit-border-radius:5px;
		  border:1px solid #999;
		  border-radius:5px;
		  display:inline-block;
		  padding:3px 8px;
		  text-decoration:none
		}
		.tree li.parent_li>span {
		  cursor:pointer
		}
		.tree>ul>li::before, .tree>ul>li::after {
		  border:0
		}
		.tree li:last-child::before {
		  height:30px
		}
		.tree li.parent_li>span:hover, .tree li.parent_li>span:hover+ul li span {
		  background:#eee;
		  border:1px solid #94a0b4;
		  color:#000
		}
  	</style>
  	<link rel="stylesheet" href="${pageContext.request.contextPath }/css/zTreeStyle/metro.css" type="text/css"></link>
	<link rel="stylesheet" href="${pageContext.request.contextPath }/js/assets/bootstrap/css/bootstrap.css" type="text/css"></link>
    <link rel="stylesheet" href="${pageContext.request.contextPath }/js/assets/bootstrap-table/bootstrap-table.css" type="text/css"></link>
    <link rel="stylesheet" href="${pageContext.request.contextPath }/js/assets/examples.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath }/js/assets/bootstrap/css/bootstrap.min.css" type="text/css">
   
    <script type="text/javascript" src="${pageContext.request.contextPath }/js/assets/jquery.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath }/js/assets/bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath }/js/assets/bootstrap/js/bootstrap.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath }/js/bootstrap-hover-dropdown.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath }/js/assets/bootstrap-table/bootstrap-table.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath }/js/assets/bootstrap-table/src/bootstrap-table-export.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath }/js/assets/bootstrap-table/src/bootstrap-table-editable.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath }/js/assets/bootstrap-table/src/tableExport.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath }/js/ga.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath }/js/assets/bootstrap-table/src/bootstrap-editable.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery.ztree.all-3.5.js" ></script>
    
   
  
  <body>
  	  
	  <div  id="top">
	    		<div id="top-left"><img src="images/logo.png"></img></div>
	  </div> 
	  
	  <div id="container">
	  	 <div class="container">       
		    <div class="row " > 
		         <div class="md-12" id="dropdown-menu" >
			        <div class="dropdown">  
			            <a id="dLabel"  class="btn btn-primary dropdown-toggle" data-toggle="dropdown" data-hover="dropdown" data-delay="10" 
			               href="javascript:;">组织机构 <span class="caret"></span> </a>  
			            <ul class="dropdown-menu multi-level" role="menu" aria-labelledby="dropdownMenu"> 
			             
			               <li class="dropdown-submenu">  
			                    <a tabindex="-1" href="javascript:;">机构管理</a>  
			                    <ul class="dropdown-menu">  
			                        <li><a tabindex="-1" href="javascript:;">机构管理</a></li>  
			                        <li><a tabindex="-1" href="javascript:;">部门管理</a></li>  
			                        <li><a tabindex="-1" href="javascript:;">部门审批关系</a></li>  
			                    </ul>  
			                </li>  
			               <li class="dropdown-submenu">  
			                    <a tabindex="-1" href="javascript:;">岗职位管理</a>  
			                    <ul class="dropdown-menu">  
			                        <li><a tabindex="-1" href="javascript:;">职位信息</a></li>  
			                        <li><a tabindex="-1" href="javascript:;">岗位信息</a></li>  
			                        <li><a tabindex="-1" href="javascript:;">职位任职资格</a></li>  
			                        <li><a tabindex="-1" href="javascript:;">职位KPI信息</a></li>  
			                        <li><a tabindex="-1" href="javascript:;">培训要求</a></li>  
			                    </ul>  
			                </li>  
			               <li class="dropdown-submenu">  
			                    <a tabindex="-1" href="javascript:;">编制管理</a>  
			                    <ul class="dropdown-menu">  
			                        <li><a tabindex="-1" href="javascript:;">部门编制</a></li>  
			                        <li><a tabindex="-1" href="javascript:;">岗位编制</a></li>  
			                        <li><a tabindex="-1" href="javascript:;">分类编制</a></li>  
			                    </ul>  
			                </li>  
			               <li class="dropdown-submenu">  
			                    <a tabindex="-1" href="javascript:;">虚拟机构</a>  
			                    <ul class="dropdown-menu">  
			                        <li><a tabindex="-1" href="javascript:;">虚拟部门</a></li>  
			                        <li><a tabindex="-1" href="javascript:;">虚拟岗位</a></li>  
			                    </ul>  
			                </li>  
			               <li class="dropdown-submenu">  
			                    <a tabindex="-1" href="javascript:;">统计分析</a>  
			                    <ul class="dropdown-menu">  
			                        <li><a tabindex="-1" href="javascript:;">组织机构图</a></li>  
			                        <li><a tabindex="-1" href="javascript:;">机构历史存档</a></li>  
			                        <li><a tabindex="-1" href="javascript:;">部门历史存档</a></li>  
			                    </ul>  
			                </li>  
			               
			               
			            </ul>  
			        </div> 
			        <div class="dropdown">  
			            <a id="dLabel"  class="btn btn-primary dropdown-toggle" data-toggle="dropdown" data-hover="dropdown" data-delay="10" 
			               href="javascript:;">人员管理 <span class="caret"></span> </a>  
			            <ul class="dropdown-menu multi-level" role="menu" aria-labelledby="dropdownMenu"> 
			             
			               <li class="dropdown-submenu">  
			                    <a tabindex="-1" href="javascript:;">员工信息管理</a>  
			                    <ul class="dropdown-menu">  
			                        <li><a tabindex="-1" href="javascript:;">在职员工</a></li>  
			                        <li><a tabindex="-1" href="javascript:;">试用期员工</a></li>  
			                        <li><a tabindex="-1" href="javascript:;">实习期员工</a></li>  
			                        <li><a tabindex="-1" href="javascript:;">离职员工</a></li>  
			                        <li><a tabindex="-1" href="javascript:;">退休员工</a></li>  
			                        <li><a tabindex="-1" href="javascript:;">历史数据查询</a></li>  
			                        <li><a tabindex="-1" href="javascript:;">员工任职管理</a></li>  
			                        <li><a tabindex="-1" href="javascript:;">证件管理</a></li>  
			                    </ul>  
			                </li>  
			               <li class="dropdown-submenu">  
			                    <a tabindex="-1" href="javascript:;">人员附表管理</a>  
			                    <ul class="dropdown-menu">  
			                        <li><a tabindex="-1" href="javascript:;">人员履历</a></li>  
			                        <li><a tabindex="-1" href="javascript:;">证照信息</a></li>  
			                        <li><a tabindex="-1" href="javascript:;">联系信息</a></li>  
			                        <li><a tabindex="-1" href="javascript:;">专业能力</a></li>  
			                        <li><a tabindex="-1" href="javascript:;">工伤管理</a></li>  
			                        <li><a tabindex="-1" href="javascript:;">绩效考核</a></li>  
			                    </ul>  
			                </li>  
			               <li class="dropdown-submenu">  
			                    <a tabindex="-1" href="javascript:;">人员调配管理</a>  
			                    <ul class="dropdown-menu">  
			                        <li><a tabindex="-1" href="javascript:;">新员工入职</a></li>  
			                        <li><a tabindex="-1" href="javascript:;">入职手续办理</a></li>  
			                        <li><a tabindex="-1" href="javascript:;">实习期变动</a></li>  
			                        <li><a tabindex="-1" href="javascript:;">实习转正</a></li>  
			                        <li><a tabindex="-1" href="javascript:;">试用期变动</a></li>  
			                        <li><a tabindex="-1" href="javascript:;">试用转正</a></li>  
			                        <li><a tabindex="-1" href="javascript:;">部门与岗位变动</a></li>  
			                        <li><a tabindex="-1" href="javascript:;">员工离职</a></li>  
			                        <li><a tabindex="-1" href="javascript:;">员工退休</a></li>  
			                        <li><a tabindex="-1" href="javascript:;">干部晋升</a></li>  
			                        <li><a tabindex="-1" href="javascript:;">离职手续办理</a></li>  
			                        <li><a tabindex="-1" href="javascript:;">员工借调/挂职</a></li>  
			                        <li><a tabindex="-1" href="javascript:;">内退信息</a></li>  
			                    </ul>  
			                </li>  
			               <li class="dropdown-submenu">  
			                    <a tabindex="-1" href="javascript:;">劳动合同</a>  
			                    <ul class="dropdown-menu">  
			                        <li><a tabindex="-1" href="javascript:;">合同新签</a></li>  
			                        <li><a tabindex="-1" href="javascript:;">续签流程</a></li>  
			                        <li><a tabindex="-1" href="javascript:;">合同变更登记</a></li>  
			                        <li><a tabindex="-1" href="javascript:;">合同终止登记</a></li>  
			                        <li><a tabindex="-1" href="javascript:;">合同解除登记</a></li>  
			                        <li><a tabindex="-1" href="javascript:;">合同管理历史</a></li>  
			                        <li><a tabindex="-1" href="javascript:;">合同最新信息</a></li>  
			                        <li><a tabindex="-1" href="javascript:;">培训协议</a></li>  
			                    </ul>  
			                </li>  
			               <li class="dropdown-submenu">  
			                    <a tabindex="-1" href="javascript:;">警戒提醒</a>  
			                    <ul class="dropdown-menu">  
			                        <li><a tabindex="-1" href="javascript:;">合同未签订</a></li>  
			                        <li><a tabindex="-1" href="javascript:;">合同将过期</a></li>  
			                        <li><a tabindex="-1" href="javascript:;">合同已过期</a></li>  
			                        <li><a tabindex="-1" href="javascript:;">需签无固定期限合同</a></li>  
			                        <li><a tabindex="-1" href="javascript:;">试用期将到期</a></li>  
			                        <li><a tabindex="-1" href="javascript:;">试用已过期</a></li>  
			                        <li><a tabindex="-1" href="javascript:;">实习将到期</a></li>  
			                        <li><a tabindex="-1" href="javascript:;">实习已过期</a></li>  
			                        <li><a tabindex="-1" href="javascript:;">晋升试用将到期</a></li>  
			                        <li><a tabindex="-1" href="javascript:;">晋升试用已过期</a></li>  
			                        <li><a tabindex="-1" href="javascript:;">证件到期</a></li>  
			                        <li><a tabindex="-1" href="javascript:;">本月生日</a></li>  
			                        <li><a tabindex="-1" href="javascript:;">本月将离职人员</a></li>  
			                        <li><a tabindex="-1" href="javascript:;">轮岗到期提醒</a></li>  
			                    </ul>  
			                </li>  
			               <li class="dropdown-submenu">  
			                    <a tabindex="-1" href="javascript:;">报表管理</a>  
			                    <ul class="dropdown-menu">  
			                        <li><a tabindex="-1" href="javascript:;">员工登记</a></li>  
			                        <li><a tabindex="-1" href="javascript:;">员工履历</a></li>  
			                        <li><a tabindex="-1" href="javascript:;">员工异动</a></li>  
			                        <li><a tabindex="-1" href="javascript:;">在职学习与年龄分析</a></li>  
			                        <li><a tabindex="-1" href="javascript:;">离职原因分析</a></li>  
			                        <li><a tabindex="-1" href="javascript:;">流动率分析</a></li>  
			                        <li><a tabindex="-1" href="javascript:;">员工状态分析</a></li>  
			                    </ul>  
			                </li>  
			               <li class="dropdown-submenu">  
			                    <a tabindex="-1" href="javascript:;">人员信息管理</a>  
			                </li>  
			            </ul>  
			        </div> 
			        
			        
			        <div class="dropdown">  
			        	 <a id="dLabel"  class="btn btn-primary dropdown-toggle" data-toggle="dropdown" data-hover="dropdown" data-delay="10" 
			               href="javascript:;"> 薪酬福利  <span class="caret"></span> </a>  
			             <ul class="dropdown-menu multi-level" role="menu" aria-labelledby="dropdownMenu">
			             	<li class="dropdown-submenu">  
			                    <a tabindex="-1" href="javascript:;">薪酬标准</a>  
			                    <ul class="dropdown-menu">  
			                        <li><a tabindex="-1" href="javascript:;">薪酬等级标准</a></li>  
			                        <li><a tabindex="-1" href="javascript:;">社保地区标准</a></li>  
			                        <li><a tabindex="-1" href="javascript:;">薪酬项目</a></li>  
			                        <li><a tabindex="-1" href="javascript:;">个调税标准</a></li>  
			                        <li><a tabindex="-1" href="javascript:;">发薪单位管理</a></li>  
			                        <li><a tabindex="-1" href="javascript:;">成本中心管理</a></li>  
			                    </ul>  
			                </li>  
			             	<li class="dropdown-submenu">  
			                    <a tabindex="-1" href="javascript:;">薪酬总额控制 </a>  
			                    <ul class="dropdown-menu">  
			                        <li><a tabindex="-1" href="javascript:;">发薪单位额度</a></li>  
			                        <li><a tabindex="-1" href="javascript:;">成本中心额度</a></li>  
			                    </ul>  
			                </li>  
			             	<li class="dropdown-submenu">  
			                    <a tabindex="-1" href="javascript:;">薪酬核算管理 </a>  
			                    <ul class="dropdown-menu">  
			                        <li><a tabindex="-1" href="javascript:;">发薪人员管理</a></li>  
			                        <li><a tabindex="-1" href="javascript:;">薪酬基本信息</a></li>  
			                        <li><a tabindex="-1" href="javascript:;">社保管理</a></li>  
			                        <li><a tabindex="-1" href="javascript:;">月考勤统计</a></li>  
			                        <li><a tabindex="-1" href="javascript:;">个税管理</a></li>  
			                        <li><a tabindex="-1" href="javascript:;">薪资计算管理</a></li>  
			                    </ul>  
			                </li>
			                <li class="dropdown-submenu">  
			                    <a tabindex="-1" href="javascript:;">薪酬统计分析 </a>  
			                    <ul class="dropdown-menu">  
			                        <li><a tabindex="-1" href="javascript:;">成本中心统计</a></li>  
			                        <li><a tabindex="-1" href="javascript:;">上下月薪酬对比</a></li>  
			                        <li><a tabindex="-1" href="javascript:;">人事费用统计</a></li>  
			                        <li><a tabindex="-1" href="javascript:;">月度薪酬变更明细</a></li>  
			                        <li><a tabindex="-1" href="javascript:;">各种保密工资单</a></li>  
			                        <li><a tabindex="-1" href="javascript:;">银行报盘</a></li>  
			                    </ul>  
			                </li>    
			                <li class="dropdown-submenu">  
			                    <a tabindex="-1" href="javascript:;">薪酬流程管理 </a>  
			                    <ul class="dropdown-menu">  
			                        <li><a tabindex="-1" href="javascript:;">调薪流程审批</a></li>  
			                        <li><a tabindex="-1" href="javascript:;">薪酬发放管理</a></li>  
			                    </ul>  
			                </li>    
			                <li class="dropdown-submenu">  
			                    <a tabindex="-1" href="javascript:;">扩展业务 </a>  
			                    <ul class="dropdown-menu">  
			                        <li><a tabindex="-1" href="javascript:;">计件工资</a></li>  
			                        <li><a tabindex="-1" href="javascript:;">销售佣金计算</a></li>  
			                        <li><a tabindex="-1" href="javascript:;">项目奖金</a></li>  
			                        <li><a tabindex="-1" href="javascript:;">企业年金</a></li>  
			                        <li><a tabindex="-1" href="javascript:;">股票期权</a></li>  
			                        <li><a tabindex="-1" href="javascript:;">住房补贴</a></li>  
			                        <li><a tabindex="-1" href="javascript:;">商业保险</a></li>  
			                        <li><a tabindex="-1" href="javascript:;">新员工薪酬分析</a></li>  
			                        <li><a tabindex="-1" href="javascript:;">模拟调薪测算</a></li>  
			                        <li><a tabindex="-1" href="javascript:;">市场职位薪酬对比分析</a></li>  
			                        <li><a tabindex="-1" href="javascript:;">个税统筹</a></li>  
			                        <li><a tabindex="-1" href="javascript:;">延期支付</a></li>  
			                    </ul>  
			                </li>    
			            	
			             </ul>   
			  		</div>      
   
           
			        
			        <div class="dropdown">  
			        	 <a id="dLabel"  class="btn btn-primary dropdown-toggle" data-toggle="dropdown" data-hover="dropdown" data-delay="10" 
			               href="javascript:;">考勤管理 <span class="caret"></span> </a>  
			             <ul class="dropdown-menu multi-level" role="menu" aria-labelledby="dropdownMenu">
			             	<li > <a tabindex="-1" href="javascript:;">假期管理</a></li>  
			             	<li > <a tabindex="-1" href="javascript:;">工作日历管理</a></li>  
			             	<li > <a tabindex="-1" href="javascript:;">请假管理</a></li>  
			             	<li > <a tabindex="-1" href="javascript:;">加班管理</a></li>  
			             	<li > <a tabindex="-1" href="javascript:;">月考勤统计</a></li>  
			        
			        	</ul>
			        </div>
			        <div class="dropdown">  
			        	 <a id="dLabel"  class="btn btn-primary dropdown-toggle" data-toggle="dropdown" data-hover="dropdown" data-delay="10" 
			               href="javascript:;">绩效考核  <span class="caret"></span> </a>  
			             <ul class="dropdown-menu multi-level" role="menu" aria-labelledby="dropdownMenu">
			             	<li class="dropdown-submenu">  
			                    <a tabindex="-1" href="javascript:;">定性考评 </a>  
			                    <ul class="dropdown-menu">  
			                        <li><a tabindex="-1" href="javascript:;">考评官管理</a></li>  
			                        <li><a tabindex="-1" href="javascript:;">部门考评关系管理</a></li>  
			                        <li><a tabindex="-1" href="javascript:;">部门考评授权</a></li>  
			                        <li><a tabindex="-1" href="javascript:;">部门考评提交进度</a></li>  
			                        <li><a tabindex="-1" href="javascript:;">领导互评提交进度</a></li>  
			                        <li><a tabindex="-1" href="javascript:;">部门考评成绩管理</a></li>  
			                        <li><a tabindex="-1" href="javascript:;">领导互评成绩管理</a></li>  
			                    </ul>  
			                </li>  
			        
			        	</ul>
			        </div>
			        
			        <div class="dropdown">  
			        	 <a id="dLabel"  class="btn btn-primary dropdown-toggle" data-toggle="dropdown" data-hover="dropdown" data-delay="10" 
			               href="javascript:;"> 报表管理 <span class="caret"></span> </a>  
			             <ul class="dropdown-menu multi-level" role="menu" aria-labelledby="dropdownMenu">
			             	<li class="dropdown-submenu">  
			                    <a tabindex="-1" href="javascript:;"> 员工报表</a>  
			                    <ul class="dropdown-menu">  
			                        <li><a tabindex="-1" href="javascript:;">历史数据查询</a></li>  
			                        <li><a tabindex="-1" href="javascript:;">人员入职分析</a></li>  
			                        <li><a tabindex="-1" href="javascript:;">常规人员数据分析</a></li>  
			                        <li><a tabindex="-1" href="javascript:;">人员离职分析</a></li>  
			                    </ul>  
			                </li>  
			             	<li class="dropdown-submenu">  
			                    <a tabindex="-1" href="javascript:;">薪酬报表 </a>  
			                    <ul class="dropdown-menu">  
			                        <li><a tabindex="-1" href="javascript:;">职等薪档人员明细表</a></li>  
			                        <li><a tabindex="-1" href="javascript:;">预分配绩效表（按人）</a></li>  
			                        <li><a tabindex="-1" href="javascript:;">预分配绩效表（部门）</a></li>  
			                        <li><a tabindex="-1" href="javascript:;">五险一金统计表</a></li>  
			                        <li><a tabindex="-1" href="javascript:;">年均收入统计表(按人)</a></li>  
			                        <li><a tabindex="-1" href="javascript:;">年均收入统计表(部门)</a></li>  
			                        <li><a tabindex="-1" href="javascript:;">年均收入统计表(层级)</a></li>  
			                    </ul>  
			                </li>  
			        
			        	</ul>
				    </div>
			        
			        <div class="dropdown">  
			        	 <a id="dLabel"  class="btn btn-primary dropdown-toggle" data-toggle="dropdown" data-hover="dropdown" data-delay="10" 
			               href="javascript:;">流程管理 <span class="caret"></span> </a>  
			             <ul class="dropdown-menu multi-level" role="menu" aria-labelledby="dropdownMenu">
			             	<li > <a tabindex="-1" href="javascript:;">流程菜单管理</a></li>  
			             	<li > <a tabindex="-1" href="javascript:;">业务流程管理</a></li>  
			             	<li > <a tabindex="-1" href="javascript:;">流程实例管理</a></li>  
			             	<li > <a tabindex="-1" href="javascript:;">代理管理</a></li>  
			             	<li > <a tabindex="-1" href="javascript:;">代办管理</a></li>  
			             	<li > <a tabindex="-1" href="javascript:;">导入导出</a></li>  
			        
			        	</ul>
			        </div>
			        <div class="dropdown">  
			        	 <a id="dLabel"  class="btn btn-primary dropdown-toggle" data-toggle="dropdown" data-hover="dropdown" data-delay="10" 
			               href="javascript:;">权限管理 <span class="caret"></span> </a>  
			             <ul class="dropdown-menu multi-level" role="menu" aria-labelledby="dropdownMenu">
			             	<li > <a tabindex="-1" href="javascript:;">角色管理</a></li>  
			             	<li > <a tabindex="-1" href="javascript:;">用户信息管理</a></li>  
			             	<li > <a tabindex="-1" href="javascript:;">角色用户管理</a></li>  
			             	<li > <a tabindex="-1" href="javascript:;">角色菜单管理</a></li>  
			             	<li > <a tabindex="-1" href="javascript:;">角色机构权限</a></li>  
			             	<li > <a tabindex="-1" href="javascript:;">角色字段按钮管理</a></li>  
			             	<li > <a tabindex="-1" href="javascript:;">用户字典管理</a></li>  
			             	<li > <a tabindex="-1" href="javascript:;">角色流程管理</a></li>  
			             	<li > <a tabindex="-1" href="javascript:;">角色门户权限</a></li>  
			        	</ul>
			        </div>
			        <div class="dropdown">  
			        	 <a id="dLabel"  class="btn btn-primary dropdown-toggle" data-toggle="dropdown" data-hover="dropdown" data-delay="10" 
			               href="javascript:;">系统管理  <span class="caret"></span> </a>  
			             <ul class="dropdown-menu multi-level" role="menu" aria-labelledby="dropdownMenu">
			             	<li class="dropdown-submenu">  
			                    <a tabindex="-1" href="javascript:;">门户管理 </a>  
			                    <ul class="dropdown-menu">  
			                        <li><a tabindex="-1" href="javascript:;">门户模块管理</a></li>  
			                        <li><a tabindex="-1" href="javascript:;">门户方案管理</a></li>  
			                    </ul>  
			                </li>  
			             	<li class="dropdown-submenu">  
			                    <a tabindex="-1" href="javascript:;">配置实施管理 </a>  
			                    <ul class="dropdown-menu">  
			                        <li><a tabindex="-1" href="javascript:;">数据结构管理</a></li>  
			                        <li><a tabindex="-1" href="javascript:;">动态表单管理</a></li>  
			                        <li><a tabindex="-1" href="javascript:;">参数管理</a></li>  
			                        <li><a tabindex="-1" href="javascript:;">业务规则管理</a></li>  
			                        <li><a tabindex="-1" href="javascript:;">树方案管理</a></li>  
			                    </ul>  
			                </li>  
			             	<li class="dropdown-submenu">  
			                    <a tabindex="-1" href="javascript:;">门户资料公告 </a>  
			                    <ul class="dropdown-menu">  
			                        <li><a tabindex="-1" href="javascript:;">公告管理</a></li>  
			                        <li><a tabindex="-1" href="javascript:;">资料管理</a></li>  
			                        <li><a tabindex="-1" href="javascript:;"></a></li>  
			                    </ul>  
			                </li>  
			             	<li class="dropdown-submenu">  
			                    <a tabindex="-1" href="javascript:;">日志管理 </a>  
			                    <ul class="dropdown-menu">  
			                        <li><a tabindex="-1" href="javascript:;">审计日志</a></li>  
			                        <li><a tabindex="-1" href="javascript:;">调度日志查询</a></li>  
			                        <li><a tabindex="-1" href="javascript:;">登录日志</a></li>  
			                    </ul>  
			                </li>  
			             	<li>  <a tabindex="-1" href="javascript:;">菜单管理 </a>   </li>  
			             	<li>  <a tabindex="-1" href="javascript:;">数据字典管理 </a>   </li>  
			        
			        	 </ul>
			       </div>
		        </div>
		    </div> 
		</div> 
	  </div>
 
	  <div id="table" >
		<div class="container">
			<div style="width:200px;height:500px;float:left; margin-top:15px;  ">  <!-- 菜单树 -->
				<div id="menuContent" class="menuContent" style="width:100%;height:100%;border:1px solid rgb(170,170,170);">
					<ul id="treeDemo" class="ztree" style="margin-top:0; width:100%; height:auto;"></ul>
				</div>
			</div>
			<div style="width:850px;height:600px;float:left;margin:15px 0 0 10px;  ">   <!-- 列表 -->
			    <div id="toolbar">
			        <button id="add" class="btn btn-info" onclick="append()">
			             增加
			        </button>
			        <button id="add" class="btn btn-info" onclick="search()">
			            搜索
			        </button>
			    </div>
			    <div class="input-group" style="float:right;width:300px;margin-top:10px;">
		      	  	<input  id="search" type="text" class="form-control" placeholder="Search">
		    	</div>
			    <table id="tradeList">
			    </table>
			</div>
		</div> 
	</div>  
  </body>

  <script>
 	
 	var zTree;
	var zNodes;
	
	$(function() {  
	    reloadTree();  
	});
	
   function reloadTree() {
		$.ajax({
		    type: 'POST',
		    url: "${pageContext.request.contextPath }/SysMenuList/selectSysMenuTree.action",
		    dataType: 'JSON',
		    success: function (data, textStatus, jqXHR) {
		    	zNodes = data;
		        zTree = $.fn.zTree.init($("#treeDemo"), setting, zNodes);
		        //1.初始化Table
		        var oTable = new TableInit();
        		oTable.Init();
		        
		    },
		    error: function () { alert("error");}
		});  
	}
    
    
	var setting = {
	 	view: {
	 		showLine: false,
	  		selectedMulti: true
	 	},
	 	check: {
	  		enable: true,
        	chkStyle: "radio",
        	radioType: "all"
	 	},
	 	data: {
	  		simpleData: {
	   			enable: true
	  		}
	 	},
	 	callback: {
	        onClick: onClickNode,
	    },
	 	edit: {
	  		enable: false
	 	}
	};
	
	//节点点击事件
	function onClickNode(e, treeId, treeNode) {
    	var zTree = $.fn.zTree.getZTreeObj("treeDemo");
    	var boolean=treeNode.isParent;
    	var condition=new Object();
    	condition.menuParentCode=treeNode.id;
    	
    	if(boolean==true){
			//说明是子节点
			$.ajax({
			    type: 'POST',
			    url: "${pageContext.request.contextPath }/SysMenuList/searchSysMenuByPId.action",
			    data:JSON.stringify(condition),
			    success: function (data) {
			   		 $("#tradeList").bootstrapTable('load',data); 
			    	//表格加载数据
			    },
			    error: function () { alert("操作有误，请联系管理员");}
			});  
			
    	}else{
    		//不是子节点   该菜单下的子菜单  获取选中的节点id，（menucode），父节点相同的菜单查出来
    		zTree.checkNode(treeNode, treeNode.checked, null, true);
	    	return false;
    	}
    	
	}
 	
 	
    var TableInit = function () {
        var oTableInit = new Object();
        //初始化Table
        oTableInit.Init = function () {
            $('#tradeList').bootstrapTable({
                url: '${pageContext.request.contextPath }/SysMenuList/findSysMenuList.action',         //请求后台的URL（*）
                method: 'post',                      //请求方式（*）
                toolbar: '#toolbar',                //工具按钮用哪个容器
                striped: true,                      //是否显示行间隔色
                cache: false,                       //是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性（*）
                pagination: true,                   //是否显示分页（*）
                sortable: false,                     //是否启用排序
                sortOrder: "asc",                   //排序方式
                queryParams: oTableInit.queryParams,//传递参数（*）
                sidePagination: "server",           //分页方式：client客户端分页，server服务端分页（*）
                pageNumber:1,                       //初始化加载第一页，默认第一页
                pageSize: 10,                       //每页的记录行数（*）
                pageList: [10, 25, 50, 100],        //可供选择的每页的行数（*）
                strictSearch: true,
                clickToSelect: true,                //是否启用点击选中行
                height: 600,                        //行高，如果没有设置height属性，表格自动根据记录条数觉得表格高度
                uniqueId: "id",                     //每一行的唯一标识，一般为主键列
                cardView: false,                    //是否显示详细视图
                detailView: false,                   //是否显示父子表
                columns: [/* {
                    field: 'state',
                    checkbox:true,
                    formatter:stateFormatter
                },  */
                 {
                    field: 'menuCode',
                    width: '191',
                    title: '菜单编号'
                }, {
                    field: 'menuName',
                    width: '191',
                    title: '菜单名称',
                    formatter: function (value, row, index) {
                    	return "<a href=\"#\" name=\"menuName\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"菜单名称\">" + value + "</a>";
                    	/* <a href="#" name="userName" data-type="text" data-pk="x" data-title="用户名">y</a> */
                	}
                }, {
                    field: 'menuType',
                    width: '191',
                    title: '菜单类型'
                }, {
                    field: 'menuParentCode',
                    width: '191',
                    title: '菜单父类编码'
                }, {
                    field: 'null',
                    eidtable:false,
                    title: '操作',
                    formatter: function (value, row, index) {  
                       var s = '<button type="button" class="btn btn-default btn-sm" id="remove"><span class="glyphicon glyphicon-trash"></span> Trash</button>';
                       return s;  
                   	},  
                   	events: 'operateEvents'  
                }],
                onClickRow: function (row, $element) {
	                curRow = row;
	            },
	            onLoadSuccess: function (aa, bb, cc) {
	                $("#tradeList a").editable({
	                    url: function (params) {
	                        var sName = $(this).attr("name");
	                        curRow[sName] = params.value;
	                        var data = JSON.stringify(curRow);
	                        $.ajax({
	                            type: 'POST',
	                            url: "${pageContext.request.contextPath }/SysMenuList/saveSysMenu.action",
	                            data: data,
	                            dataType: 'JSON',
	                            success: function (data, textStatus, jqXHR) {
	                                alert('保存成功！');
	                            },
	                            error: function () { alert("error");}
	                        });
	                    },
	                    type: 'text'
	                });
	            },
                data:[{id:1,liushuiid:2},{id:1,liushuiid:2}],
                
            });
            window.operateEvents = {  
                'click #remove': function (e, value, row, index) {  
                   $.ajax({  
                       type: 'POST',  
                       data: JSON.stringify(row),  
                       url: '${pageContext.request.contextPath }/SysMenuList/removeSysMenu.action',  
                       success: function (data) {  
                           alert('删除成功');
                           window.location.href = window.location.href; 
                           $('#tradeList').bootstrapTable('remove', {  
                               field: 'Id',  
                               values: [row.Id]  
                           });  
                       }  
                   });  
               }
           }; 
        };
        
        
        //得到查询的参数
      oTableInit.queryParams = function (params) {
            var temp = {//这里的键的名字和控制器的变量名必须一直，这边改动，控制器也需要改成一样的
                limit: params.limit,   //页面大小
                offset: params.offset,  //页码
                sdate: $("#stratTime").val(),
                edate: $("#endTime").val(),
                sellerid: $("#sellerid").val(),
                orderid: $("#orderid").val(),
                CardNumber: $("#CardNumber").val(),
                maxrows: params.limit,
                pageindex:params.pageNumber,
                portid: $("#portid").val(),
                tradetype:$('input:radio[name="tradetype"]:checked').val(),
                success:$('input:radio[name="success"]:checked').val(),
            };
            return temp;
        };
        return oTableInit;
    };
    
    
    /* 复选框 */
    function stateFormatter(value, row, index) {
        if (row.id === 2) {
            return {
                disabled: true,
                checked: true
            };
        }
        if (row.id === 0) {
            return {
                disabled: true,
                checked: true
            };
        }
        return value;
    }
    var num=0;
    /* 增加行 */
    function append() {  
            var strAppend = '<tr style="background: rgb(255, 255, 255) none repeat scroll 0% 0%;border:1px #DDDDDD;">'+
            					'<td><input style="width:100px;" type="text" editable="true" name="menuCode"></td>'+
            					'<td><input style="width:100px;" type="text" editable="true" name="menuName"></td>'+
            					'<td><input style="width:100px;" type="text" editable="true" name="menuType"></td>'+
            					'<td><input style="width:100px;" type="text" editable="true" name="menuParentCode"></td>'+
            					'<td><button id="new'+num+'" class="btn btn-default btn-sm" onclick="save(this)"><span class="glyphicon glyphicon-ok"></span> Ok </button></td><tr>';   
            num++;
            $("#tradeList tbody").append(strAppend);  
        }  
	
	function save(tdobject){
		var td="#"+tdobject.id;
		var menuCode=$(td).parents("tr").children('td').eq(0).children('input').val();
		var menuName=$(td).parents("tr").children('td').eq(1).children('input').val();
		var menuType=$(td).parents("tr").children('td').eq(2).children('input').val();
		var menuParentCode=$(td).parents("tr").children('td').eq(3).children('input').val();
		var curRow=new Object();
		curRow.menuCode = menuCode;
		curRow.menuName = menuName;
		curRow.menuType = menuType;
		curRow.menuParentCode = menuParentCode;
	    var data = JSON.stringify(curRow);
	    $.ajax({  
                  type: 'POST',  
                  data: data,  
                  url: '${pageContext.request.contextPath }/SysMenuList/insertSysMenu.action',  
                  success: function (data) {  
                      alert('添加成功');
                      window.location.href = window.location.href; 
                  }  
              });
        }
	
	function search(){
	var condition=new Object();
	condition.menuName = document.getElementById("search").value;
	//	alert(condition.menuName);
		$.ajax({  
                  type: 'POST',  
                  data: JSON.stringify(condition),  
                  url: '${pageContext.request.contextPath }/SysMenuList/searchSysMenuList.action',  
                  success: function (data) {  
                      $("#tradeList").bootstrapTable('load',data); 
                  }  
              });
	}

</script>
  
  
</html>
