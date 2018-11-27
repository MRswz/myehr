<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
    HttpSession s = request.getSession(); 
    String userCode=(String)session.getAttribute("userCode");
    String password=(String)session.getAttribute("userPassword");
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>json交互测试</title>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-1.4.4.min.js"></script>
<script type="text/javascript">
//请求json，输出是json
function requestJson(){
	var formDefEntitySQL = $("#formDefEntitySQL").val();
	//alert(formDefEntitySQL);
	var d = {buttonId:'3918',formId:'2646',param:{ORGID:'',ORGCODE:'2017-04-15 06:14:30',ORGDEGREE:'123213',PARENTORGID:'',ORGSEQ:'2017-04-15 06:14:30',AbroadType:'5',EducationalBackground:'5'}};
	var json = {buttonId:'3885',formId:'2646',param:{P1_ID:'',P2_NAME:'',P2_NAME2:'',P2_NAME5:''}};
	var paramsMap = {};
	var _heightGrade = {};
	var _filterdata = {};
	var initJson = {
						paramsMap:paramsMap,requestParam:{EWE_EMP_ID:null},
						filter:_filterdata,formId:'1213',
					};
	alert(JSON.stringify(initJson));
	$.ajax({
		type:'post',
		//url:'${pageContext.request.contextPath }/form/removeData.action',
		url:'${pageContext.request.contextPath }/form/getForm.action?formId=129',
		//url:'${pageContext.request.contextPath }/form/getForm.action?formId=1942',
		//url:'${pageContext.request.contextPath }/form/cardformInitData.action',
		contentType:'application/json;charset=utf-8',
		//数据格式是json串，商品信息
		//data:JSON.stringify(d),
		//data:JSON.stringify(initJson),
		success:function(data){//返回json结果
			alert(JSON.stringify(data));
		}
		
	});
	
	
}
</script>
</head>
<body>
<textarea id="formDefEntitySQL" name="MSG" cols=40 rows=4>
select   [机构表.*],t.ORG_ABBREVIATION ORG_NAME,a.user_name USER_NAME from     [机构表] left  join org_organization t on [机构表.上级机构]=t.org_id  left join sys_user a on [机构表.操作者]=a.user_id order by [机构表.机构编码]
</textarea>
<input type="button" onclick="requestJson()"  value="映射字段"/>
</body>
</html>