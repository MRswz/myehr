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
<script type="text/javascript" src="${pageContext.request.contextPath }/common/js/md5.js"></script>

<!-- bootstrap -->
<script type="text/javascript" src="${pageContext.request.contextPath }/common/js/assets/bootstrap/js/bootstrap.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/common/js/assets/bootstrap-table/bootstrap-table.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/common/js/assets/bootstrap-table/src/bootstrap-table-export.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/common/js/assets/bootstrap-table/src/tableExport.js"></script>
<script src="${pageContext.request.contextPath }/common/js/assets/bootstrap-table/src/bootstrap-editable.js"></script>
<link rel="stylesheet" href="${pageContext.request.contextPath }/common/js/assets/bootstrap/css/bootstrap.css" type="text/css"></link>
<link rel="stylesheet" href="${pageContext.request.contextPath }/common/js/assets/bootstrap-table/bootstrap-table.css" type="text/css"></link>

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

<!-- 弹框-->
<script type="text/javascript" src="${pageContext.request.contextPath }/common/js/layer/layer.js"></script>

<!--下拉选择 -->
<script type="text/javascript" src="${pageContext.request.contextPath }/common/js/select2/js/select2.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/common/js/select2/js/select2.full.js"></script>
<link href="${pageContext.request.contextPath }/common/js/select2/css/select2.min.css" type="text/css" rel="stylesheet" />

<!-- 富文本 
<link rel="stylesheet" href="${pageContext.request.contextPath }/common/js/richText/themes/default/css/umeditor.css" type="text/css"></link>
<script type="text/javascript" src="${pageContext.request.contextPath }/common/js/richText/third-party/template.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/common/js/richText/umeditor.config.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/common/js/richText/umeditor.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/common/js/richText/lang/zh-cn/zh-cn.js"></script>
-->
<script type="text/javascript" src="${pageContext.request.contextPath }/common/js/utf8-jsp/ueditor.config.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/common/js/utf8-jsp/ueditor.all.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/common/js/utf8-jsp/lang/zh-cn/zh-cn.js"></script>

<link href="${pageContext.request.contextPath }/common/js/showLoading/css/showLoading.css" rel="stylesheet" media="screen" /> 
<script type="text/javascript" src="${pageContext.request.contextPath }/common/js/showLoading/js/jquery.showLoading.js"></script>
<!--<link href="http://cdn.bootcss.com/font-awesome/4.6.3/css/font-awesome.min.css " rel="stylesheet">-->
<link rel="stylesheet" href="${pageContext.request.contextPath }/common/css/font-awesome-4.7.0/css/font-awesome.min.css" type="text/css"></link>

<!-- 卡片通用JS -->
<script type="text/javascript" src="${pageContext.request.contextPath }/common/js/cardStand.js"></script>
<!-- 文件上传控件 -->
<script type="text/javascript" src="${pageContext.request.contextPath }/common/js/upload/jquery.uploadify.h5.min.js"></script>
<link rel="stylesheet" href="${pageContext.request.contextPath }/common/js/upload/uploadify-min.css" type="text/css"></link>
<script type="text/javascript" src="${pageContext.request.contextPath }/common/js/testFile/js/fileinput.js"></script>
<link rel="stylesheet" href="${pageContext.request.contextPath }/common/js/testFile/css/fileinput.css" type="text/css"></link>
<script type="text/javascript" src="${pageContext.request.contextPath }/common/js/testFile/js/locales/zh.js"></script>

<link rel="stylesheet" href="${pageContext.request.contextPath }/common/js/star/css/starability-all.min.css" type="text/css"></link>
<link rel="stylesheet" href="${pageContext.request.contextPath }/common/css/222.css" type="text/css"></link>

<link rel="stylesheet" href="${pageContext.request.contextPath }/common/css/talkandreply.css" type="text/css"></link>
<script type="text/javascript" src="${pageContext.request.contextPath }/common/js/evaluate.js"></script>