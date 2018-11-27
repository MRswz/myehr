<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>Oracle</title>
    
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
			width: 650px;
			margin-top:20px; 
		}
  		table {
		    margin: auto;
		    width: 650px;
		    height:350px;
		    text-align:center;
		    font-weight: bold;
		}
		table tr{
			height:40px; 
			text-align:center;
			line-height: 40px;
		}
		#file{
			 height:30px;
			 line-height: 35px;
			 text-align:center;  
		}
  	</style>
  </head>
  
  <body>
  <center>
  	
  	<div id="backcolor">
				<table  id="table" border='1'cellspacing="0" cellpadding="0" style="table-layout:fixed" >
					<tr>
						<td colspan="2" >姓名</td>
						<td colspan="5" ><span id="name"></span></td>
						<td colspan="4" rowspan="4" > 像片
							<OBJECT classid="clsid:10946843-7507-44FE-ACE8-2B3483D179B7" codebase="CVR100.cab#version=3,0,3,3" id="CVR_IDCard" name="CVR_IDCard" width=119 height=136 align=center hspace=0 vspace=0></OBJECT>
						</td>
					</tr>
					<tr>
						<td colspan="2"  >性别</td>
						<td colspan="2" > <span id="sex"></span></td>
						<td colspan="1" >民族</td>
						<td colspan="2"> <span id="nation"></span></td>
					</tr>
					
					<tr>
						<td colspan="2" >出生日期</td>
						<td colspan="5" >
	                        <span id="birthday"></span>
	                    </td>
					</tr>
					<tr>
						<td colspan="2" >身份证号码</td>
						<td colspan="5" >
	                        <span id="idcode"></span>
	                    </td>
					</tr>
					
					<tr>
						<td colspan="2">户籍地址</td>
						<td colspan="9" >
	                        <span id="address"></span>
	                    </td>
					</tr>
					<tr>
						<td colspan="2">发证机关</td>
						<td colspan="9" >
	                        <span id="partment"></span>
	                    </td>
					</tr>
					<tr>
						<td colspan="2">签发日期</td>
						<td colspan="3" >
	                        <span id="startdate"></span>
	                    </td>
						<td colspan="2">到期日期</td>
						<td colspan="4" >
	                        <span id="enddate"></span>
	                    </td>
					</tr>
					<tr>
						<td colspan="2">提示信息</td>
						<td colspan="3" >
	                        <span id="ReadResult"></span>
	                    </td>
						<td colspan="2">上传图片</td>
						<td colspan="4" style="padding-top:5px; ">
	                       <input type="file" name="file" id="file" value=""/>
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
						 	url : '${pageContext.request.contextPath }/sysCvr/search.action',  
					        type : 'post',  
					        dataType : 'json', 
					        data : data,  
					        async : false,  
					        success : function(jsonData) {
					        	int=jsonData;
					        },  
					        error : function() { 
					            alert("查询失败"); 
					            return;   
					        }  
					    }); 
					    
					      //保存
						if(int==0){
								$.ajax({  
							        type : 'post',  
							         url : '${pageContext.request.contextPath }/sysCvr/save.action',  
							        data : data,  
							        dataType : 'json',  
							        async : false,  
							        success : function(jsonData) {
							        	alert("新增成功");
							        },  
							        error : function() { 
							            alert("新增失败，请联系管理员");
							            return;    
							        }
							    });
							    //更新图片路径
						    	$.ajaxFileUpload({  
							        type : 'post', 
							        fileElementId:'file' ,
							        url : '${pageContext.request.contextPath }/sysCvr/add.action',  
							        success : function(data){
							        },  
							        error : function(){ 
							        	alert("图片更新失败，请联系管理员");
							            return;
							        }  
							    });
							    window.location.reload(true);
							    
						}else{
							alert("信息已存在！");
						} 		
					}else{
						 $("#ReadResult").text("请刷卡！");
					}
				});
				
				
				$(".read").click(function(){
					alert(1);
					CVR_IDCard.PhotoPath="c:";
				   CVR_IDCard.TimeOut=3;     //执行时间
				   ClearIDCard(); 
				   ClearForm(); 
				   //清空上传文件框
					var obj = document.getElementById('file') ;
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
				  $("#name").text(pName);
				  $("#sex").text(pSex);
				  $("#nation").text(pNation);
				  $("#birthday").text(pBorn);
				  $("#address").text(pAddress);
				  $("#idcode").text(pCardNo);
				  $("#partment").text(pPolice);
				  $("#startdate").text(pActivityLFrom);
				  $("#enddate").text(pActivityLTo); 
				  
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
				}
			});
			
			
  </script>
  
</html>
