<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%
String contextPath = request.getContextPath();
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<link rel="stylesheet" href="${pageContext.request.contextPath }/common/css/style.css" type="text/css"></link>
<link rel="stylesheet" href="${pageContext.request.contextPath }/common/css/animate.css" type="text/css"></link>
<link rel="stylesheet" href="${pageContext.request.contextPath }/common/css/base.css"></link>
<script type="text/javascript" src="${pageContext.request.contextPath }/common/js/assets/jquery.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/common/common1.js"></script>

<!-- bootstrap -->
<script type="text/javascript" src="${pageContext.request.contextPath }/common/js/assets/bootstrap/js/bootstrap.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/common/js/assets/bootstrap-table/bootstrap-table.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/common/js/assets/bootstrap-table/src/bootstrap-table-export.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/common/js/assets/bootstrap-table/src/tableExport.js"></script>
<script src="${pageContext.request.contextPath }/common/js/assets/bootstrap-table/src/bootstrap-editable.js"></script>
<link rel="stylesheet" href="${pageContext.request.contextPath }/common/js/assets/bootstrap/css/bootstrap.css" type="text/css"></link>
<link rel="stylesheet" href="${pageContext.request.contextPath }/common/js/assets/bootstrap-table/bootstrap-table.css" type="text/css"></link>
<script type="text/javascript" src="${pageContext.request.contextPath }/common/js/assets/fixed-column/bootstrap-table-fixed-columns.js"></script>
<link rel="stylesheet" href="${pageContext.request.contextPath }/common/js/assets/fixed-column/bootstrap-table-fixed-columns.css" type="text/css"></link>

<!-- bootstrap选择器 -->
<script type="text/javascript" src="${pageContext.request.contextPath }/common/js/bootstrap-select.js"></script>
<link rel="stylesheet" href="${pageContext.request.contextPath }/common/js/SELECT/bootstrap-select/bootstrap-select.css" type="text/css"></link>

<!-- bootstrap时间选择器 -->
<script type="text/javascript" src="${pageContext.request.contextPath }/common/js/date-format.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/common/js/timepicker/bootstrap-datetimepicker.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/common/js/timepicker/bootstrap-datetimepicker.zh-CN.js"></script>
<!-- 
<link rel="stylesheet" href="${pageContext.request.contextPath }/common/js/timepicker/bootstrap/css/bootstrap.min.css" type="text/css"></link>
-->
<link rel="stylesheet" href="${pageContext.request.contextPath }/common/js/timepicker/bootstrap-datetimepicker.css" type="text/css"></link>

<!-- 树-->
<script type="text/javascript" src="${pageContext.request.contextPath }/common/js/tree/jquery.ztree.core-3.5.js"></script>
<link rel="stylesheet" href="${pageContext.request.contextPath }/common/css/tree/zTreeStyle/zTreeStyle.css" type="text/css"></link>
<script type="text/javascript" src="${pageContext.request.contextPath }/common/js/tree/jquery.ztree.excheck-3.5.js"></script>
<link href="http://cdn.bootcss.com/font-awesome/4.6.3/css/font-awesome.min.css " rel="stylesheet">
<!-- 弹框-->
<script type="text/javascript" src="${pageContext.request.contextPath }/common/js/layer/layer.js"></script>

<!--下拉选择 -->
<script type="text/javascript" src="${pageContext.request.contextPath }/common/js/select2/js/select2.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/common/js/select2/js/select2.full.js"></script>
<link href="${pageContext.request.contextPath }/common/js/select2/css/select2.min.css" type="text/css" rel="stylesheet" />

<!-- 富文本 -->
<link rel="stylesheet" href="${pageContext.request.contextPath }/common/js/richText/themes/default/css/umeditor.css" type="text/css"></link>
<script type="text/javascript" src="${pageContext.request.contextPath }/common/js/richText/third-party/template.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/common/js/richText/umeditor.config.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/common/js/richText/umeditor.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/common/js/richText/lang/zh-cn/zh-cn.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/common/js/md5.js"></script>
<!-- 组织机构图 -->
<link rel="icon" type="image/x-icon" href="${pageContext.request.contextPath }/jsp/orgpicture/dabengOrgChart/myorg/img/logo.ico">
<link rel="stylesheet" href="${pageContext.request.contextPath }/jsp/orgpicture/dabengOrgChart/examples/css/font-awesome.min.css">
<link rel="stylesheet" href="${pageContext.request.contextPath }/jsp/orgpicture/dabengOrgChart/examples/css/jquery.orgchart.css">
<link rel="stylesheet" href="${pageContext.request.contextPath }/jsp/orgpicture/dabengOrgChart/examples/css/style.css">
<link rel="stylesheet" href="${pageContext.request.contextPath }/jsp/orgpicture/dabengOrgChart/myorg/style.css">
<script type="text/javascript" src="${pageContext.request.contextPath }/jsp/orgpicture/dabengOrgChart/examples/js/html2canvas.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/jsp/orgpicture/dabengOrgChart/examples/js/jquery.orgchart.js"></script>

<link href="${pageContext.request.contextPath }/common/js/showLoading/css/showLoading.css" rel="stylesheet" media="screen" /> 
<script type="text/javascript" src="${pageContext.request.contextPath }/common/js/showLoading/js/jquery.showLoading.js"></script>
<link href="http://cdn.bootcss.com/font-awesome/4.6.3/css/font-awesome.min.css " rel="stylesheet">

<!-- charts图表 -->
<script type="text/javascript" src="${pageContext.request.contextPath }/common/js/echarts/echarts.js"></script>

<!-- loading -->
<script type="text/javascript" src="${pageContext.request.contextPath }/common/js/cloading.js"></script>

<script type="text/javascript" src="${pageContext.request.contextPath }/common/js/dragstand.js"></script>

<link rel="stylesheet" href="${pageContext.request.contextPath }/common/js/layoutit.css" type="text/css"></link>
<link rel="stylesheet" href="${pageContext.request.contextPath }/common/js/bootstrap-combined.min.css" type="text/css"></link>
<link rel="stylesheet" href="${pageContext.request.contextPath }/common/js/layoutit2.css" type="text/css"></link>
<link rel="stylesheet" href="${pageContext.request.contextPath }/commonNews/css/style.css" type="text/css"></link>
