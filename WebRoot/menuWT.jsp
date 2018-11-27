<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/common/commontest.jsp" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>

<head>
	<%
		HttpSession s = request.getSession();
    	String userName=(String)session.getAttribute("userName");
		String userCode=(String)session.getAttribute("userCode");
		String softwareTitle=(String)session.getAttribute("softwareTitle");
		String softwareName=(String)session.getAttribute("softwareName");
    	String userId=session.getAttribute("userid")+"";
		String softwareImg = (String)session.getAttribute("softwareImg");
	%>
    <meta charset="UTF-8">
    <title><%=softwareTitle %></title>
    <link rel="shortcut icon" href="favicon.ico">
    <link rel="stylesheet" type="text/css" href="menu.css">
</head>

<body id="main" style="overflow: hidden;">
    <div class="nav_outer header small">
    	 <div class="lf logo">
			
            <h1 class="lf"><%=softwareTitle %><a href="javascript:void(0);"><img src="<%=softwareImg%>" title="<%=softwareName %>"></a></h1>
        	<div class="comIntr lf">
        		<h3 class="companyName"><%=softwareTitle %></h3>
        		<p><%=softwareName %></p>
        	</div>
			<!--
			<p>PAAS开发平台</p>
			-->
        </div>
    	<div class="header_nav" id="js_nav">
		</div>
             <ul class="nav navbar-toolbar navbar-toolbar-right navbar-right rf">
            <li class="dropdown">
                <a href="javascript:void(0)" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false"><img alt="" class="img-circle hide1" src="./images/headImg/0.png"></a>
                <ul class="dropdown-menu animated flipInY">
                  <li><a href="javascript:void(0)" id="username"><i class="fa fa-search"></i><%=userName %></a></li>
                    <li><a href="javascript:void" onclick="updatePasswordMust()""><i class="fa fa-search"></i> 修改密码 </a></li>
                    <!-- <li class="divider"></li> 
                    <li><a href="menuWT.jsp#" onclick="changeUser()"><i class="fa fa-search"></i> 切换用户  </a></li>
                    -->
                    <li><a onclick="openWorkspace()" target="_blank"><i class="fa fa-search"></i> 工作桌面  </a></li>
                    <li><a id="GOOUT" href="logout.jsp"><i class="fa fa-search"> </i>退出  </a></li>
                </ul>
              </li>
          <li class="nav-item dropdown hidden-float">
            <a href="javascript:void(0)" data-toggle="collapse" data-target="#navbar-search" aria-expanded="false" class="collapsed">
              <i class="fa fa-search"></i>
            </a>
          </li>

          <li class="dropdown">
            <a href="javascript:void(0)" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false"><i class="fa fa-cog"></i></a>
            <ul id="changeSchemeMenu" class="dropdown-menu  animated flipInY">
                <li>
                    <a href="/myehr/menuWT.jsp#" onclick="changeMenu(1)">
                        <i class="fa fa-search"></i> HR应用 
                    </a>
                </li>
                <li>
                    <a href="/myehr/menuWT.jsp#" onclick="changeMenu(2)">
                        <i class="fa fa-search"></i> 员工服务 
                    </a>
                </li>
                <li>
                    <a href="/myehr/menuWT.jsp#" onclick="changeMenu(3)">
                        <i class="fa fa-search"></i> 执行力 
                    </a>
                </li>
                <li>
                    <a href="/myehr/menuWT.jsp#" onclick="changeMenu(4)">
                        <i class="fa fa-search"></i> 移动端应用 
                    </a>
                </li>
            </ul>
          </li>


        </ul>
    </div>
    <div class="tabbable" id="tabs" style="border:none;margin-top: 0;">
      <!-- 页面标签列表 -->
      <ul class="nav nav-tabs" id="myTab" style="margin: 0;">
      </ul>
      <!-- 页面内容列表，和页面标签列表对应 -->
      <div class="tab-content">
      </div>
    </div>
    <!-- navbar search -->
<div id="navbar-search" class="navbar-search collapse">
  <div class="navbar-search-inner">
    <form action="#">
      <span class="search-icon"><i class="fa fa-search"></i></span>
      <input class="search-field" type="search" placeholder="search..."/>
    </form>
    <button type="button" class="search-close" data-toggle="collapse" data-target="#navbar-search" aria-expanded="false">
      <i class="fa fa-close"></i>
    </button>
  </div>
  <div class="navbar-search-backdrop" data-toggle="collapse" data-target="#navbar-search" aria-expanded="false"></div>
</div><!-- .navbar-search -->
</body>
<script type="text/javascript" src="jquery.min.js"></script>
<script type="text/javascript" src="tab1.js"></script>
<script type="text/javascript">
    $(window).bind("load resize",function() {
        $(".tab-content").css({'height':$(window).height()-110});
    });
    var height=window.screen.height;
    if(height<750){
    	document.getElementById("main").style.height="750px";
    }else{
    	document.getElementById("main").style.height=height + "px";
    }
	
	window.onload = function () {
		if(passwordIsRight()){	
			queryScheme();
			var userId = '<%=userId%>';
			var date = new Date();
			$.ajax({
				url: "${pageContext.request.contextPath}/form/menuJson.action?userId=<%=userId%>&"+date,
				type: 'get',
				dataType: 'json',
				success: function (data) {
				  console.log(data);
				  var arr=data.data;
				  setTableDate(arr);
				},
				error:function(err){
				console.log(err);
				}
			});
			
			$(window).click(function (event) {
				var _con = $('#js_nav');   // 设置目标区域
				if (!_con.is(event.target) && _con.has(event.target).length === 0) { // Mark 1
					   $("#js_nav").find('.lv1_submenu').stop(true,true).slideUp(200);
				}
			});
			$(window.parent.document).click(function (event) {
				var _con = $('#js_nav');   // 设置目标区域
				if (!_con.is(event.target) && _con.has(event.target).length === 0) { // Mark 1
					$("#js_nav").find('.lv1_submenu').stop(true,true).slideUp(200);
				}
			});

			function setTableDate(arr){
				//arr是拿到目录数据
				 var ulObj = $("<ul style='padding-left:5%'>");
				 for(var i=0;i<arr.length;i++){
					var percentage = 96/arr.length;
					//liObj是第一层目录
					if(arr[i].menuUrl=="null"&&arr[i].menuFormId=="null"){
						arr[i].menuUrl="javascript:void(0);";
					}
					var liObj=$("<li class='lv1 lv1_"+ i +"' style='width:"+ percentage +"%'><a class='lv1_a' menuId='"+arr[i].menuId+"'  name='"+arr[i].menuUrl+"' id='"+ arr[i].menuFormId +"' title='"+ arr[i].menuName +"' onclick='toUrl(this)'>"+arr[i].menuName+"</a></li>");
					//拿第二层目录
					var secondArr=arr[i].childrens;
					//divObj 是包含整个二级和三级
					var divObj=$("<div class='lv1_submenu'><div class='lv1_submenu_container'></div></div>");
					if(secondArr.length!=0){
					   /* setNextDate(secondArr);*/
					   for(var j=0;j<secondArr.length;j++){
							if(secondArr[j].menuUrl=="null"&&secondArr[j].menuFormId=="null"){
								secondArr[j].menuUrl="javascript:void(0);";
							}else if(secondArr[j].menuIsDynamicForm=="Y"&&secondArr[j].menuFormId!="null"){
								secondArr[j].menuUrl="/myehr/form/toForm.action?formId="+secondArr[j].menuFormId+"";
							}
							// 二级菜单title 和 三级菜单
							var secondulObj=$("<div class='ul0"+ (j+1) +"'><h3 class='class_title'><a  menuId='"+secondArr[j].menuId+"' name='"+secondArr[j].menuUrl+"' class='cacheflag' id='"+ secondArr[j].menuFormId +"' title='"+ secondArr[j].menuName +"' onclick='toUrl(this)'>"+secondArr[j].menuName+"</a></h3><ul class='third'></ul></div>");
							var thirdArr=secondArr[j].childrens;
							if(thirdArr){
								for(var k=0;k<thirdArr.length;k++){
									if(thirdArr[k].menuUrl=="null" || thirdArr[k].menuUrl=="" || thirdArr[k].menuUrl==null){
										thirdArr[k].menuUrl="/myehr/form/toForm.action?formId="+thirdArr[k].menuFormId+"";
									}else{ 
										if(thirdArr[k].menuUrl=="javascript:void(0);"){
											thirdArr[k].menuFormId = "url"+i+j+k;
										}else {
											thirdArr[k].menuFormId = "url"+i+j+k;
										}
									}
									var thirdliObj=$("<li><a menuId='"+ thirdArr[k].menuId +"' name='"+ thirdArr[k].menuUrl +"' title='"+ thirdArr[k].menuTitle +"' id='"+ thirdArr[k].menuFormId +"' onclick='toUrl(this)'><span>"+ thirdArr[k].menuName +"</span></a></li>");
									secondulObj.find('.third').append(thirdliObj);
								}
							}
							divObj.find('.lv1_submenu_container').append(secondulObj);
					   }
					   liObj.append(divObj);
					
					}
					liObj.click(function(){
						var $this = $(this);
						$this.addClass('on').siblings().removeClass('on');
						$this.siblings().find('.lv1_submenu').stop(true,true).slideUp(200);
						$this.find('.lv1_submenu').stop(true,true).slideDown(200);
						$this.find('.lv1_submenu .moreli').show();
					});
					liObj.find('ul li').click(function(){
						$(".clickBody").click();
					});
					liObj.hover(function(){

					},function(){
						var $this = $(this);
						$this.find('.lv1_submenu').stop(true,true).slideUp(200);
					})
					ulObj.append(liObj);
				 }
				ulObj.append("</ul>");
				$("#js_nav").append(ulObj);
				//$("#js_nav").append("<span class='fa fa-angle-right' style='font-size:25px;color:#fff;width:1%'></span>");
			}
			//addTab("","报表","http://192.168.1.102:9876/HappyServer/hrServlet?fileName=hte_2017_04_18105027280&targetVolume=DDYW&authId=anonymous_admin");
			/*if(<%=userId%>==1){
				addTab("","工作桌面","/myehr/form/toForm.action?formId=3625&cname=陈十&ename=AaronQ");
			}else{
				addTab("","工作桌面","/myehr/form/toForm.action?formId=4088&userid=<%=userId%>");
			}
			*/
			openWorkspace();
			

			 //initUserColumnAndButton();
		}else{
			updatePasswordMust();
		}
    };
    
    function toUrl(val){
        //console.log(val);
		var menuId = val.attributes.menuId.value;
		//alert(menuId);
		getMenuParam(menuId,val);
       
    }
	
	function getMenuParam(menuId,val){
		$.ajax({
			url:'/myehr/SysMenuList/queryParamByMenuId.action?menuId='+menuId,
			type:'post',
			contentType: 'application/json;charset=utf-8',
			cache: true,
			success: function (text) {
				if(text.length>0){
					var flag = 0;
					var url = val.name;
					for(var i=0;i<text.length;i++){
						if(text[i].MENU_PARAM_TYPE!='hiddenParam'){
							flag++;
						}else{
							if(text[i].MENU_PARAM_CLASS=='sessionParam'){
								
							}else{
								url += '&'+text[i].MENU_PARAM_NAME+'='+text[i].MENU_PARAM_VALUE;
							}
						}							
					}
					if(flag>0){
						var url = '/myehr/jsp/form/param/frontParam.jsp?menuId='+menuId;
						layer.open({
							type: 2,
							title:'请输入参数',
							shadeClose: true,
							shade: 0.8,
							//offset: ['0px', '0px'],
							area: ['500', '500'],
							content: url,
							success:function(layero,index){
							},
							end:function(){
								if(val.id == "null"){
									return;
								}
								addTab(val.id,val.innerText,val.name);
							}
						});
					}else{
						val.name = url;
						addTab(val.id,val.innerText,val.name);
					}
					
				}else{
					if(val.id == "null"&&(val.name == ""||val.name=="javascript:void(0);")){
						return;
					}else{
						addTab(val.id,val.innerText,val.name);
					}
					
				}
			}
		});
    }
	
	function initUserColumnAndButton(){
		$.ajax({
			url:'/myehr/SysRoleList/initUserColumnAndButton.action',
			type:'post',
			contentType: 'application/json;charset=utf-8',
			cache: true,
			success: function (text) {
			}
		});
    }
    
    function updatePassword(){
    	var userCode = '<%=userCode %>';
    	var userId = '<%=userId %>';
		var date = new Date();
    	var url = '/myehr/updatePassword.jsp?userCode='+userCode+'&userId='+userId+'&date='+date;
    	layer.open({
			type: 2,
			title:'修改密码',
			shadeClose: true,
			shade: 0.8,
			//offset: ['0px', '0px'],
			area: ['500', '500'],
			content: url,
			success:function(layero,index){
			},
			end:function(){
				
			}
		});
    }
	
	function updatePasswordMust(){
		var date = new Date();
    	var userCode = '<%=userCode %>';
    	var userId = '<%=userId %>';
    	var url = '/myehr/updatePassword.jsp?userCode='+userCode+'&userId='+userId+'&date='+date+"&type=firstLoad";
    	layer.open({
			type: 2,
			title:'密码过期,请修改密码',
			shade: 0.8,
			//offset: ['0px', '0px'],
			area: ['500', '500'],
			content: url,
			success:function(layero,index){
				//document.getElementById("GOOUT").click();
			},
			end:function(){
				//$("#GOOUT").click();
				document.getElementById("GOOUT").click();
			}
		});
    }
	
	function passwordIsRight(){
		var date = new Date();
		var userCode = '<%=userCode%>';
		var flag ;
		var url = '${pageContext.request.contextPath}/form/checkPasswordTime.action?userCode='+userCode+'&date='+date;
		$.ajax({
			url:url,
			type: 'get',
			async:false,
			dataType: 'json',
			success: function (data) {
				if(data[0]=='1'){
					flag = true;
				}else{
					flag = false;
				}
			}
		});
		return flag;
	}
	
	function queryScheme(){
		var userId = '<%=userId %>';
		$.ajax({
			url: "${pageContext.request.contextPath}/SysMenuList/findSysSystemSchemeByUserId.action?userId="+userId,
			type: 'get',
			dataType: 'json',
			success: function (data) {
				var html='';
				for(var i=0;i<data.length;i++){
					html+="<li><a href=\"#\" onclick = \"changeMenu("+data[i].schemeId+")\"><i class=\"icon-user\"></i> "+data[i].schemeName+" </a></li>";
				}
				$("#changeSchemeMenu").html(html);
			}
		});
	}
	
	
	
	function changeUser(){
		var url = '/myehr/userList.jsp';
    	layer.open({
			type: 2,
			title:'选择用户',
			shadeClose: true,
			shade: 0.8,
			//offset: ['0px', '0px'],
			area: ['500', '600'],
			content: url,
			success:function(layero,index){
			},
			end:function(){
				location.reload();
			}
		});
	}
    
    function changeMenu(schemeId){
    	var userId = ${sessionScope.userid};
    	$.ajax({
			url: "${pageContext.request.contextPath}/form/menuJsonWithScheme.action?schemeId="+schemeId+"&userId="+userId,
			type: 'get',
			dataType: 'json',
			success: function (data) {
				console.log(data);
				var arr=data.data;
				setTableDate(arr);
			  }
		});
		setTimeout(function(){
			$('.banner').slideUp();
		},3000);
		$(window).click(function (event) {
	        var _con = $('#js_nav');   // 设置目标区域
		    if (!_con.is(event.target) && _con.has(event.target).length === 0) { // Mark 1
		           $("#js_nav").find('.lv1_submenu').stop(true,true).slideUp(200);
		    }
	    });
	    $(window.parent.document).click(function (event) {
	        var _con = $('#js_nav');   // 设置目标区域
		    if (!_con.is(event.target) && _con.has(event.target).length === 0) { // Mark 1
		        $("#js_nav").find('.lv1_submenu').stop(true,true).slideUp(200);
		    }
	    });
		
		function setTableDate(arr){
            //arr是拿到目录数据
             var ulObj = $("<ul></ul>");
             for(var i=0;i<arr.length;i++){
                var percentage = 100/arr.length;
                //liObj是第一层目录
                if(arr[i].menuUrl=="null"&&arr[i].menuFormId=="null"){
                    arr[i].menuUrl="javascript:void(0);";
                }
				var iconCss='';
				if(arr[i].iconType=="1"){
					iconCss="<span class=\"glyphicon "+arr[i].imgFileId+"\" ></span>";
				}
				if(arr[i].iconType=="2"){
					//iconCss="<img src=\"//192.168.1.109:9999/CustomEmotions/"+arr[i].imgFileId+"\" style=\"width:70px;height:70px\" title=\""+arr[i].imgFileId+"\">";
				}
                var liObj=$("<li class='lv1 lv1_"+ i +"' style='width:"+ percentage +"%'><a class='lv1_a' menuId='"+arr[i].menuId+"'  name='"+arr[i].menuUrl+"' id='"+ arr[i].menuFormId +"' title='"+ arr[i].menuName +"' onclick='toUrl(this)'>"+iconCss+""+arr[i].menuName+"</a></li>");
                //拿第二层目录
                var secondArr=arr[i].childrens;
                //divObj 是包含整个二级和三级
                var divObj=$("<div class='lv1_submenu'><div class='lv1_submenu_container'></div></div>");
                if(secondArr.length!=0){
					/* setNextDate(secondArr);*/
					for(var j=0;j<secondArr.length;j++){
						var iconCss1='';
						if(secondArr[j].iconType=="1"){
							iconCss1="<span class=\"glyphicon "+secondArr[j].imgFileId+"\" ></span>";
						}
						if(secondArr[j].iconType=="2"){
							//iconCss1="<img src=\"//192.168.1.109:9999/CustomEmotions/"+secondArr[j].imgFileId+"\" style=\"width:70px;height:70px\" title=\""+secondArr[j].imgFileId+"\">";
						}
                        if((secondArr[j].menuUrl=="null"||secondArr[j].menuUrl=="")&&secondArr[j].menuFormId=="null"){
                            secondArr[j].menuUrl="javascript:void(0);";
                        }else if((secondArr[j].menuUrl=="null"||secondArr[j].menuUrl=="")&&secondArr[j].menuFormId!="null"){
                            secondArr[j].menuUrl="/myehr/form/toForm.action?formId="+secondArr[j].menuFormId+"";
                        }
                        // 二级菜单title 和 三级菜单
                        var secondulObj=$("<div class='ul0"+ (j+1) +"'><h3 class='class_title'><a menuId='"+secondArr[j].menuId+"' name='"+secondArr[j].menuUrl+"' class='cacheflag' id='"+ secondArr[j].menuFormId +"' title='"+ secondArr[j].menuName +"' onclick='toUrl(this)'>"+iconCss1+""+secondArr[j].menuName+"</a></h3><ul class='third'></ul></div>");
                        var thirdArr=secondArr[j].childrens;
                        if(thirdArr){
                            for(var k=0;k<thirdArr.length;k++){
								var iconCss2='';
								if(thirdArr[k].iconType=="1"){
									iconCss2="<span class=\"glyphicon "+thirdArr[k].imgFileId+"\" >";
								}
								if(thirdArr[k].iconType=="2"){
									//iconCss2="<img src=\"//192.168.1.109:9999/CustomEmotions/"+thirdArr[k].imgFileId+"\" style=\"width:70px;height:70px\" title=\""+thirdArr[k].imgFileId+"\">";
								}
                                if(thirdArr[k].menuUrl=="null"||thirdArr[k].menuUrl==""){
                                    thirdArr[k].menuUrl="/myehr/form/toForm.action?formId="+thirdArr[k].menuFormId+"";
                                }else{ 
                                    if(thirdArr[k].menuUrl=="javascript:void(0);"){
                                        thirdArr[k].menuFormId = "url";
                                    }else {
                                        thirdArr[k].menuFormId = "url";
                                    }
                                }
                                var thirdliObj=$("<li><a menuId='"+ thirdArr[k].menuId +"' name='"+ thirdArr[k].menuUrl +"' title='"+ thirdArr[k].menuName +"' id='"+ thirdArr[k].menuFormId +"' onclick='toUrl(this)'>"+iconCss2+thirdArr[k].menuName+"</span></a></li>");
                                secondulObj.find('.third').append(thirdliObj);
                            }
                        }
                        divObj.find('.lv1_submenu_container').append(secondulObj);
                    
                   }
                   liObj.append(divObj);
                
                }
                liObj.click(function(){
                    var $this = $(this);
                    $this.addClass('on').siblings().removeClass('on');
                    $this.siblings().find('.lv1_submenu').stop(true,true).slideUp(200);
                    $this.find('.lv1_submenu').stop(true,true).slideDown(200);
                    $this.find('.lv1_submenu .moreli').show();
                });
                liObj.find('ul li').click(function(){
                    $(".clickBody").click();
                });
                liObj.hover(function(){

                },function(){
                    var $this = $(this);
                    $this.find('.lv1_submenu').stop(true,true).slideUp(200);
                })
                ulObj.append(liObj);
             }
            $("#js_nav").html(ulObj);
        }
		
		/*function setTableDate(arr){
            //arr是拿到目录数据
             var ulObj = $("<ul></ul>");
             for(var i=0;i<arr.length;i++){
                var percentage = 100/arr.length;
                //liObj是第一层目录
                if(arr[i].menuUrl=="null"&&arr[i].menuFormId=="null"){
                    arr[i].menuUrl="javascript:void(0);";
                }
				var iconCss='';
				if(arr[i].iconType=="1"){
					iconCss="<span class=\"glyphicon "+arr[i].imgFileId+"\" ></span>";
				}
				if(arr[i].iconType=="2"){
					//iconCss="<img src=\"//192.168.1.109:9999/CustomEmotions/"+arr[i].imgFileId+"\" style=\"width:70px;height:70px\" title=\""+arr[i].imgFileId+"\">";
				}
                var liObj=$("<li class='lv1 lv1_"+ i +"' style='width:"+ percentage +"%'><a class='lv1_a'  name='"+arr[i].menuUrl+"' id='"+ arr[i].menuFormId +"' title='"+ arr[i].menuName +"' onclick='toUrl(this)'>"+iconCss+""+arr[i].menuName+"</a></li>");
                //拿第二层目录
                var secondArr=arr[i].childrens;
                //divObj 是包含整个二级和三级
                var divObj=$("<div class='lv1_submenu'><div class='lv1_submenu_container'></div></div>");
                if(secondArr.length!=0){
					/* setNextDate(secondArr);*/
					/*for(var j=0;j<secondArr.length;j++){
						var iconCss1='';
						if(secondArr[j].iconType=="1"){
							iconCss1="<span class=\"glyphicon "+secondArr[j].imgFileId+"\" ></span>";
						}
						if(secondArr[j].iconType=="2"){
							//iconCss1="<img src=\"//192.168.1.109:9999/CustomEmotions/"+secondArr[j].imgFileId+"\" style=\"width:70px;height:70px\" title=\""+secondArr[j].imgFileId+"\">";
						}
                   		if(secondArr[j].menuUrl!="null"){
                   			secondArr[j].menuFormId = "url";
                   		}else if(secondArr[j].menuUrl=="null"&&secondArr[j].menuFormId=="null"){
                            secondArr[j].menuUrl="javascript:void(0);";
                        }else if(secondArr[j].menuUrl=="null"&&secondArr[j].menuFormId!="null"){
                            secondArr[j].menuUrl="/myehr/form/toForm.action?formId="+secondArr[j].menuFormId+"";
                        }
                        // 二级菜单title 和 三级菜单
                        var secondulObj=$("<ul class='ul0"+ (j+1) +"'><li class='class_title'><a  name='"+secondArr[j].menuUrl+"' class='cacheflag' id='"+ secondArr[j].menuFormId +"' title='"+ secondArr[j].menuName +"' onclick='toUrl(this)'>"+iconCss1+""+secondArr[j].menuName+"</a></li></ul>");
                        var thirdArr=secondArr[j].childrens;
                        if(thirdArr){
                            for(var k=0;k<thirdArr.length;k++){
								var iconCss2='';
								if(thirdArr[k].iconType=="1"){
									iconCss2="<span class=\"glyphicon "+thirdArr[k].imgFileId+"\" >";
								}
								if(thirdArr[k].iconType=="2"){
									//iconCss2="<img src=\"//192.168.1.109:9999/CustomEmotions/"+thirdArr[k].imgFileId+"\" style=\"width:70px;height:70px\" title=\""+thirdArr[k].imgFileId+"\">";
								}
                                if(thirdArr[k].menuUrl=="null"){
                                    thirdArr[k].menuUrl="/myehr/form/toForm.action?formId="+thirdArr[k].menuFormId+"";
                                }else{ 
									if(thirdArr[k].menuUrl=="javascript:void(0);"){
										thirdArr[k].menuFormId = "url";
									}else {
										thirdArr[k].menuFormId = "url";
									}
								}
                                var thirdliObj=$("<li><a  name='"+ thirdArr[k].menuUrl +"' title='"+ thirdArr[k].menuName +"' id='"+ thirdArr[k].menuFormId +"' onclick='toUrl(this)'>"+iconCss2+thirdArr[k].menuName+"</span></a></li>");
                                secondulObj.append(thirdliObj);
                            }
                        }
                        divObj.find('.lv1_submenu_container').append(secondulObj);
                    
					}
					liObj.append(divObj);
                }
                liObj.click(function(){
                    var $this = $(this);
                    $this.addClass('on').siblings().removeClass('on');
                    $this.siblings().find('.lv1_submenu').stop(true,true).slideUp(200);
                    $this.find('.lv1_submenu').stop(true,true).slideDown(200);
                    $this.find('.lv1_submenu .moreli').show();
                });
                liObj.find('ul li').click(function(){
                    $(".clickBody").click();
                });
                liObj.hover(function(){

                },function(){
                    var $this = $(this);
                    $this.find('.lv1_submenu').stop(true,true).slideUp(200);
                })
                ulObj.append(liObj);
             }
            $("#js_nav").html(ulObj);
        }*/
        //addTab("","报表","http://192.168.1.102:9876/HappyServer/hrServlet?fileName=hte_2017_04_18105027280&targetVolume=DDYW&authId=anonymous_admin");
    }
    
    function openWorkspace(){
     		if('${sessionScope.userid}'=='17499'||'${sessionScope.userid}'=='1'){
				addTab("","工作桌面","/myehr/jsp/formbuild/TEST_INFO_FORM_182.jsp");
			}else{
				addTab("","工作桌面","/myehr/jsp/formbuild/TEST_INFO_FORM_182_ForEmp.jsp");
			}
    }
</script>
</html>
