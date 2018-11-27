<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%
	String orgid = request.getParameter("DEPTCODE_DEPT_ID");
 %>


<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
	
    <title>组织机构图</title>
	
    <link rel="icon" type="image/x-icon" href="${pageContext.request.contextPath }/jsp/orgpicture/dabengOrgChart/myorg/img/logo.ico">
    <link rel="stylesheet" href="${pageContext.request.contextPath }/jsp/orgpicture/dabengOrgChart/examples/css/font-awesome.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath }/jsp/orgpicture/dabengOrgChart/examples/css/jquery.orgchart.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath }/jsp/orgpicture/dabengOrgChart/examples/css/style.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath }/jsp/orgpicture/dabengOrgChart/myorg/style.css">
   
   

</head>
<body style="height:1200px;">
  <div style="height:98%;width:98%;float:left;display:none" id="chart-container"></div>
  <div style="height:98%;width:98%;float:left;overflow:auto" id="chart-eChart"></div>
  <input type="hidden" name="orgid" id="orgid" value="<%=orgid%>"/>
  <input type="hidden" name="basePath" id="basePath" value="<%= request.getContextPath() %>"/> 
  <script type="text/javascript" src="${pageContext.request.contextPath }/jsp/orgpicture/dabengOrgChart/examples/js/jquery.min.js"></script>
  <script type="text/javascript" src="${pageContext.request.contextPath }/jsp/orgpicture/dabengOrgChart/examples/js/html2canvas.min.js"></script>
  <script type="text/javascript" src="${pageContext.request.contextPath }/jsp/orgpicture/dabengOrgChart/examples/js/jquery.orgchart.js"></script>
  <script type="text/javascript" src="${pageContext.request.contextPath }/jsp/orgpicture/dabengOrgChart/myorg/scripts.js?v=4"></script>
  <script type="text/javascript" src="${pageContext.request.contextPath }/common/js/echarts/echarts.js"></script>
  </body>
</html>