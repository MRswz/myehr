<%@ page language="java" import="java.util.*" import="com.myehr.common.util.LangUtil" pageEncoding="UTF-8"%>
<%@ include file="/common/cardcommon.jsp" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<body style="text-align:center">
	<div class="container-fluid" style="overflow-y:auto;height:100%;">
		<input type="button" name="creatFile" onclick="creatFile()" value="生成文件" />
		<input type="button" name="readFile" onclick="readFile()" value="读取文件"/>
	</div>
</form>
</div>
<script>

function creatFile(){
    $.ajax({
        url:'${pageContext.request.contextPath }/FormCopy/cardFormCopyToOther.action?formId=334',
        type:'post',
        cache: false,
    	async: false,
        success: function (data) { 
        }
    });
}

function readFile(){
    $.ajax({
        url:'${pageContext.request.contextPath }/FormCopy/readDatas.action',
        type:'post',
        cache: false,
    	async: false,
        success: function (data) { 
        }
    });
}
</script>
</body>
</html>
