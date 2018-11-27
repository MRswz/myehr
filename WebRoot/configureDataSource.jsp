<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/common/common.jsp" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>配置数据源</title>
  </head>
  
  <body>
    <table>
    	<tr>
    		<td style="width:40%">
    			<lable>驱动类</lable>
    		</td>
    		<td>
    			<select id="jdbcDriver">
    				 <option value ="oracle">oracle.jdbc.driver.OracleDriver</option>
					 <option value ="sqlserver">com.microsoft.sqlserver.jdbc.SQLServerDriver</option>
					 <option value="mysql">com.mysql.jdbc.Driver</option>
					 <option value="db2">com.ibm.db2.jcc.DB2Driver</option>
    			</select>
    		</td>
    	</tr>
    	<tr>
    		<td style="width:40%">
    			<lable>连接URL</lable>
    		</td>
    		<td>
    			<input type="text" id="jdbcUrl" value=""/>
    		</td>
    	</tr>
    	<tr>
    		<td style="width:40%">
    			<lable>用户名</lable>
    		</td>
    		<td>
    			<input type="text" id="username" value=""/>
    		</td>
    	</tr>
    	<tr>
    		<td style="width:40%">
    			<lable>密码</lable>
    		</td>
    		<td>
    			<input type="text" id="password" value=""/>
    		</td>
    	</tr>
    	<tr>
    		<td style="width:40%">
    			<lable>测试SQL语句</lable>
    		</td>
    		<td>
    			<textarea rows="2" id="excutesql" cols="100">SELECT count(*) from SYS_USER
				</textarea>
    		</td>
    	</tr>
    </table>
    <input type="button" class="btn-xs btn-primary" style="margin-left:20px" value="确定" onclick="saveDataSource()">
    <input type="button" class="btn-xs btn-primary" style="margin-left:20px" value="取消"  onclick="closex()">
  	<input type="button" class="btn-xs btn-primary" style="margin-left:20px" value="测试数据库连接"  onclick="testDataSource()">
  </body>
  <script type="text/javascript">
  function saveDataSource(){
  	var jdbcDriver = document.getElementById("jdbcDriver").value;
  	var jdbcUrl = document.getElementById("jdbcUrl").value;
  	var username = document.getElementById("username").value;
  	var password = document.getElementById("password").value;
  	$.ajax({
        url: '${pageContext.request.contextPath }/dataSource/savedataSource.action?jdbcDriver='+jdbcDriver+'&jdbcUrl='+jdbcUrl+'&username='+username+'&password='+password,
        type: 'POST',
        cache: false,
        contentType: 'application/json;charset=utf-8',
        success: function(json) { // 获取当前月的数据
           	if(json=="success"){
           		alert("数据源保存成功");
           	}else{
           		alert("数据源错误");
           	}
        }
    });
  }
  
  function testDataSource(){
  	var excutesql = document.getElementById("excutesql").value;
  	var jdbcDriver = document.getElementById("jdbcDriver").value;
  	var jdbcUrl = document.getElementById("jdbcUrl").value;
  	var username = document.getElementById("username").value;
  	var password = document.getElementById("password").value;
  	$.ajax({
        url: '${pageContext.request.contextPath }/dataSource/testdataSource.action?excutesql='+excutesql+'&jdbcDriver='+jdbcDriver+'&jdbcUrl='+jdbcUrl+'&username='+username+'&password='+password,
        type: 'POST',
        cache: false,
        contentType: 'application/json;charset=utf-8',
        success: function(json) {
           	if(json == "success"){
           		alert("数据库连接成功！");
           	}else{
           		alert("数据库连接失败！");
           	}
        }
    });
  }
  </script>
</html>
