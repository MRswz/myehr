<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@include file="/common/common.jsp"%>
<html>
<!-- 
  - Author(s): MyeHR
  - Date: 2017-04-20 13:28:30
  - Description:
-->
<head>
<title>读卡器</title>
  	
  </head>
  
  <body>
  <center>
  	
  	<div id="backcolor">
				<div id="form1" style="width:100%;">
				<table style="width:100%;table-layout:fixed;padding-top:5px;padding-left:30%;" class="cbs-table" >
					
					<tr class="input_table_tr">
						<td style="padding-left:10px;"  width="90"  ><lable>像片：</lable></td>
						<td style="padding-left:10px;"  align="left" > 
							<OBJECT classid="clsid:10946843-7507-44FE-ACE8-2B3483D179B7" codebase="CVR100.cab#version=3,0,3,3" id="CVR_IDCard" name="CVR_IDCard" width=119 height=136 align=center hspace=0 vspace=0></OBJECT>
						</td>
					</tr>
					<tr class="input_table_tr">
						<td style="padding-left:10px;"  width="90"  ><lable>姓名：</lable></td>
						<td style="padding-left:10px;"  align="left"  ><input id="name" name="peopleName" class="nui-textbox" style="width:300px" readonly="true"/></td>
					</tr>
					
					<tr class="input_table_tr">
						<td style="padding-left:10px;"  width="90"  ><lable>性别：</lable></td>
						<td style="padding-left:10px;"  align="left"  ><input id="sex" name="peopleSex" class="nui-textbox" style="width:300px" readonly="true"/></td>
					</tr>
					<tr class="input_table_tr">
						<td style="padding-left:10px;"  width="90"  ><lable>民族：</lable></td>
						<td style="padding-left:10px;"  align="left"  ><input id="nation" name="peopleNation" class="nui-textbox" style="width:300px" readonly="true"/></td>
					</tr>
					<tr class="input_table_tr">
						<td style="padding-left:10px;"  width="90"  ><lable>出生日期：</lable></td>
						<td style="padding-left:10px;"  align="left"  ><input id="birthday" name="peopleBirthday" class="nui-textbox" style="width:300px" readonly="true"/></td>
					</tr>
					<tr class="input_table_tr">
						<td style="padding-left:10px;"  width="90"  ><lable>身份证号码：</lable></td>
						<td style="padding-left:10px;"  align="left"  ><input id="idcode" name="peopleIdCode" class="nui-textbox" style="width:300px" readonly="true"/></td>
					</tr>
					<tr class="input_table_tr">
						<td style="padding-left:10px;"  width="90"  ><lable>户籍地址：</lable></td>
						<td style="padding-left:10px;"  align="left"  ><input id="address" name="peopleAddress" class="nui-textbox" style="width:300px" readonly="true"/></td>
					</tr>
					<tr class="input_table_tr">
						<td style="padding-left:10px;"  width="90"  ><lable>发证机关：</lable></td>
						<td style="padding-left:10px;"  align="left"  ><input id="partment" name="department" class="nui-textbox" style="width:300px" readonly="true"/></td>
					</tr>
					<tr class="input_table_tr">
						<td style="padding-left:10px;"  width="90"  ><lable>签发日期：</lable></td>
						<td style="padding-left:10px;"  align="left"  ><input id="startdate" name="startDate" class="nui-textbox" style="width:300px" readonly="true"/></td>
					</tr>
					<tr class="input_table_tr">
						<td style="padding-left:10px;"  width="90"  ><lable>到期日期：</lable></td>
						<td style="padding-left:10px;"  align="left"  ><input id="enddate" name="endDate" class="nui-textbox" style="width:300px" readonly="true"/></td>
					</tr>
					<tr class="input_table_tr">
						<td style="padding-left:10px;"  width="90"  ><lable>提示信息：</lable></td>
						<td style="padding-left:10px;"  align="left"  ><input id="ReadResult" class="nui-textbox"  readonly="true"  style="width:300px;"/></td>
					</tr>
					<tr class="input_table_tr">
						<td style="padding-left:10px;"  width="90"  ><lable></lable></td>
						<td style="padding-left:10px;"  align="left"  >
							<button class="read">读取</button>
							<button class="save">保存</button>
						</td>
					</tr>
					<tr class="input_table_tr" style="display:none">
						<td colspan="2">上传图片</td>
						<td colspan="4" style="padding-top:5px; ">
	                       <input type="file" name="file" id="file"/>
						   <input type="hidden" name="photo" id="photo"/>
	                    </td>
	                </tr>
				</table>
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
					if($("#ReadResult").val()=="读取成功"){
					/* var _form = getForm();	
					var _data = getData(); */
					var nam=$("#name").val();
					var sex=$("#sex").val();
					var na=$("#nation").val();
					var id=$("#idcode").val();
					var par=$("#partment").val();
					var st=$("#startdate").val();
					var end=$("#enddate").val();
					var add=$("#address").val();
					var bir=$("#birthday").val();
					var peoplePicture=$("#photo").val();
					var data = "peopleName="+nam+"&peopleSex="+sex+"&peopleNation="+na+"&peopleIdCode="+id+"&department="+par+"&startDate="+st+"&endDate="+end+"&peopleAddress="+add+"&Birthday="+bir+"&peoplePicture="+encodeURIComponent(peoplePicture);
					var int =0;
						//查询是否已经保存
						 $.ajax({  
						 	url: "${pageContext.request.contextPath }/sysCvr/checkSave.action",
				            type: 'POST',
				            dataType : 'json', 
					        data : data,
				            cache: false,
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
								url: "${pageContext.request.contextPath }/sysCvr/save.action",
								type: 'POST',
								dataType : 'json', 
								data : data, 
								cache: false,
								async : false,
								success : function(jsonData) {
									
									alert("新增成功");
								},  
								error : function() { 
									alert("新增失败，请联系管理员");
									return;    
								}
							});
							
							window.location.reload(true);
							    
						}else{
							alert("信息已存在！");
							window.location.reload(true);
						} 		
					}else{
						 $("#ReadResult").text("请刷卡！");
					}
				});
				
				
				$(".read").click(function(){
				//var CVR_IDCard = document.getElementById("CVR_IDCard");
				   CVR_IDCard.PhotoPath="C:/";
				   CVR_IDCard.TimeOut=3;     //执行时间/myehr/Myeclipse/myeclipse/apache-tomcat-6.0.45/webapps/myehr
				   ClearIDCard(); 
				   ClearForm(); 
				   //清空上传文件框
					var obj = document.getElementById('file') ;
					obj.select();
					//document.selection.clear(); 
				   $("#ReadResult").val("正在读取,请将身份证放在读卡器上");
				   var strReadResult=CVR_IDCard.ReadCard;
				   //读取成功     
				   if(strReadResult==0){
				  		 FillForm(); 
				  		  $("#ReadResult").val("读取成功");
				   }else{
				   		$("#ReadResult").val("请将身份证放置指定区域");
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
				  var photoPath=CVR_IDCard.PhotoPath;  
				  var photo=CVR_IDCard.GetPhotoBuffer;
                  $("#name").val(pName);
                  $("#sex").val(pSex);
                  $("#nation").val(pNation);
                  $("#birthday").val(pBorn);
                  $("#address").val(pAddress);
                  $("#idcode").val(pCardNo);
                  $("#partment").val(pPolice);
                  $("#startdate").val(pActivityLFrom);
                  $("#enddate").val(pActivityLTo);
				  $("#photo").val(photo);
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
				  
				}
			});
	function getData(){
			var data = {};
			data.name = $("#name").val();
            data.sex = $("#sex").val();
            data.nation = $("#nation").val();
            data.birthday = $("#birthday").val();
            data.address = $("#address").val();
            data.idcode = $("#idcode").val();
            data.partment = $("#partment").val();
            data.startdate = $("#startdate").val();
            data.enddate = $("#enddate").val();
		return data;
}
	function getForm(){
					var object=[];
						$("#form1").find("input").each(function(){
								var name = this.name.split(".")[1];
								object[name]=this.name;
						})
						$("#form1").find("select").each(function(){
								var name = this.name.split(".")[1];
								object[name]=this.name;
						})
						return object;
			}		
			
  </script>
  
</html>
