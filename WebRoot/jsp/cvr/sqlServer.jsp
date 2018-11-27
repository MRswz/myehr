<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>sqlServer</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
 	<script type="text/javascript" src="${pageContext.request.contextPath }/js/assets/jquery.min.js"></script>
  	<script type="text/javascript" src="${pageContext.request.contextPath }/js/ajaxfileupload.js"></script>
  	<style type="text/css">
		 * {
		    margin: 0;
		    padding: 0;
		}
		#backcolor{
			background-color: #EEECDB;
			width: 600px;
		}
  		table {
		    margin: auto;
		    width: 600px;
		    height:300px;
		}
  		table tr td{
		    width: 300px;
		}
		table
  		.cscleft{text-align:center;}
  		.cscright{text-align:center;}
  	</style>
  </head>
  
  <body>
  <center>
  	
  	<div id="backcolor">
	  	<div id="object">
	  		 <OBJECT classid="clsid:10946843-7507-44FE-ACE8-2B3483D179B7" codebase="CVR100.cab#version=3,0,3,3" id="CVR_IDCard" name="CVR_IDCard" width=119 height=136 align=center hspace=0 vspace=0></OBJECT>
	  	</div>
				<table  id="table" border='1'cellspacing="0" cellpadding="0" >
					<tr>
						<td class="cscleft">姓名：</td>
						<td class="cscright" >
	                        <span id="name"></span>
	                    </td>
					</tr>
					<tr>
						<td class="cscleft">性别：</td>
						<td class="cscright">
	                        <span id="sex"></span>
	                    </td>
					</tr>
					<tr>
						<td class="cscleft">民族：</td>
						<td class="cscright">
	                        <span id="nation"></span>
	                    </td>
					</tr>
					<tr>
						<td class="cscleft">出生日期：</td>
						<td class="cscright">
	                        <span id="birthday"></span>
	                    </td>
					</tr>
					<tr>
						<td class="cscleft">户籍地址：</td>
						<td class="cscright">
	                        <span id="address"></span>
	                    </td>
					</tr>
					<tr>
						<td class="cscleft">身份证号码：</td>
						<td class="cscright">
	                        <span id="idcode"></span>
	                    </td>
					</tr>
					<tr>
						<td class="cscleft">证件签发日期：</td>
						<td class="cscright">
	                        <span id="startdate"></span>
	                    </td>
					</tr>
					<tr>
						<td class="cscleft">证件到期日期：</td>
						<td class="cscright">
	                        <span id="enddate"></span>
	                    </td>
					</tr>
					<tr>
						<td class="cscleft">签发机关：</td>
						<td class="cscright">
	                        <span id="partment"></span>
	                    </td>
					</tr>
					<tr>
						<td class="cscleft">提示信息：</td>
						<td class="cscright">
	                        <span id="ReadResult"></span>
	                    </td>
					</tr>
					<tr>
						<td class="cscleft">上传图片：</td>
						<td class="cscright">
	                        <span id="ph"><input type="file" name="file" id="aaa" value="" style="width:280px;height:25px;line-height: 20px;text-align:center;  "/></span>
	                    </td>
					</tr>
				</table>
				<div class="csright" >
				<button class="read"><img src="${pageContext.request.contextPath }/jsp/cvr/images/csread.png" style="height:40px;width: 60px; "></img>读取</button>&nbsp&nbsp&nbsp
				<button class="save"><img src="${pageContext.request.contextPath }/jsp/cvr/images/cssave.png"style="height:40px; width: 60px;"></img>保存</button>
	</div>
  		
  		</div>	
  				
	
	
	</center>
  </body>
  
  <script type="text/javascript">
 	$(document).ready(function(){
			 $('.salaryfml-main').height($(window).height()-40);
			 $('.newscontent').height($('.salaryfml-main').height()-45);
			 ClearIDCard();
			 ClearForm();
				$(".save").click(function(){
					if($("#name").text()){
						//console.log($("#sex").text());
						 var nam=$("#name").text();
						 var sex=$("#sex").text();
						 var na=$("#nation").text();
						 var id=$("#idcode").text();
						 var par=$("#partment").text();
						 var st=$("#startdate").text();
						 var end=$("#enddate").text();
						 var add=$("#address").text();
						 var bir=$("#birthday").text();
						var data = "peopleName="+nam+"&peopleSex="+sex+"&peopleNation="+na+"&peopleIdCode="+id+"&department="+par+"&startDate="+st+"&endDate="+end+"&peopleAddress="+add+"&Birthday="+bir;
						var int ='';
						//查询是否已经保存
						 $.ajax({  
						 	url : '${pageContext.request.contextPath }/sqlserverSysCvr/search.action',  
					        type : 'post',  
					        dataType : 'json', 
					        data : data,  
					        async : false,  
					        success : function(jsonData) {
					        	int=jsonData;
					        },  
					        error : function() { 
					            alert("查询失败");    
					        }  
					    }); 
					    
					      //保存
						if(int==0){
								$.ajax({  
							        type : 'post',  
							        url : '${pageContext.request.contextPath }/sqlserverSysCvr/sqlServerSave.action',  
							        data : data,  
							        dataType : 'json',  
							        async : false,  
							        success : function(jsonData) {
							        },  
							        error : function() { 
							            alert("新增失败");
							            return;    
							        }
							    });
							    //更新图片路径
						    	$.ajaxFileUpload({  
							        type : 'post', 
							        fileElementId:'aaa' ,
							        url : '${pageContext.request.contextPath }/sqlserverSysCvr/add.action',  
							        success : function() {
							        },  
							        error : function() { 
							        }  
							    });
						}else{
							alert("信息已存在！");
						} 		
					}else{
						 $("#ReadResult").text("请刷卡！");
					}
				});
				
				
				$(".read").click(function(){
					alert(11);
					CVR_IDCard.PhotoPath="c:";
				   CVR_IDCard.TimeOut=3;     //执行时间
				   ClearIDCard(); 
				   ClearForm(); 
				 //  $("#aaa").text("");
				 
				 
					var obj = document.getElementById('aaa') ;
					obj.select();
					document.selection.clear(); 
				   $("#ReadResult").text("正在读取");
				   var strReadResult=CVR_IDCard.ReadCard;
				   //读取成功     
				   if(strReadResult==0){
				  		 FillForm(); 
				  		  $("#ReadResult").text("读取成功");
				   }else{
				   		$("#ReadResult").text("请将身份证放置指定区域");
				   }
				});
				
				//数据回填
				function FillForm() {
				  var pName=CVR_IDCard.NameL; 
				  var pSex=CVR_IDCard.SexL;  
				  var pNation=CVR_IDCard.NationL;
				  var pBorn=CVR_IDCard.BornL; 
				  var pAddress=CVR_IDCard.Address;
				  var pCardNo=CVR_IDCard.CardNo;
				  var pPolice=CVR_IDCard.Police;
				  var pActivityLFrom=CVR_IDCard.ActivityLFrom; 
				  var pActivityLTo=CVR_IDCard.ActivityLTo; 
				  var pPhotoBuffer=CVR_IDCard.GetPhotoBuffer; 
				  $("#name").text(pName);
				  $("#sex").text(pSex);
				  $("#nation").text(pNation);
				  $("#birthday").text(pBorn);
				  $("#address").text(pAddress);
				  $("#idcode").text(pCardNo);
				  $("#partment").text(pPolice);
				  $("#startdate").text(pActivityLFrom);
				  $("#enddate").text(pActivityLTo); 
				  $("#photo").text(pPhotoBuffer); 
				  
				}
				//清空缓存数据
				function ClearIDCard() {
				  CVR_IDCard.Name="";
				   CVR_IDCard.NameL="";
				   CVR_IDCard.Sex="";      
				   CVR_IDCard.Nation="";
				   CVR_IDCard.Born="";
				   CVR_IDCard.Address="";
				   CVR_IDCard.CardNo="";
				   CVR_IDCard.Police="";
				   CVR_IDCard.Activity="";
				   CVR_IDCard.NewAddr=""; 
				   CVR_IDCard.PhotoBuffer=""; 
				}
				//清空页面
				function ClearForm() {
				    $("#name").text("");
					$("#sex").text("");
					$("#nation").text("");
					$("#birthday").text("");
					$("#address").text("");
				    $("#idcode").text("");
					$("#partment").text("");
					$("#startdate").text("");
					$("#enddate").text("");
					$("#ReadResult").text("");
					$("#photo").text("");
				}
			});
			
			
  </script>
  
</html>
