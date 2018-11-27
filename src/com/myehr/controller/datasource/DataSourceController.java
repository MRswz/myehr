package com.myehr.controller.datasource;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.myehr.common.mybatis.MybatisUtil;
import com.myehr.common.util.Batch;
import com.myehr.common.util.GetDBPropertiesValue;
import com.myehr.mapper.calendar.TestcalendarMapper;
import com.myehr.pojo.calendar.Kcalendar;
import com.myehr.test.dao.TMapperExt;

@Controller
@RequestMapping("/dataSource")
public class DataSourceController {
	
//	@Autowired
	@Resource(name = "TMapperExt")
	private TMapperExt tMapperExt;
	
	@RequestMapping("/savedataSource")
	public @ResponseBody String savedataSource(HttpServletRequest request) throws Exception{
		String jdbcDriver =request.getParameter("jdbcDriver");
		String jdbcUrl =request.getParameter("jdbcUrl");
		String username =request.getParameter("username");
		String password =request.getParameter("password");
		
		String abc = Batch.getConnectionByConfigure(jdbcDriver,jdbcUrl,username,password);
		if ("success".equals(abc) || "success"==abc) {
			GetDBPropertiesValue.writeProperties("E:/139svn/oracle/myehr_oracle/myehr_oracle/config/db.properties","jdbc.driver",jdbcDriver);
			GetDBPropertiesValue.writeProperties("E:/139svn/oracle/myehr_oracle/myehr_oracle/config/db.properties","jdbc.url",jdbcUrl); 
			GetDBPropertiesValue.writeProperties("E:/139svn/oracle/myehr_oracle/myehr_oracle/config/db.properties","jdbc.username",username); 
			GetDBPropertiesValue.writeProperties("E:/139svn/oracle/myehr_oracle/myehr_oracle/config/db.properties","jdbc.password",password); 
			
			GetDBPropertiesValue.writeProperties(request.getRealPath("/WEB-INF/classes/db.properties"),"jdbc.driver",jdbcDriver);
			GetDBPropertiesValue.writeProperties(request.getRealPath("/WEB-INF/classes/db.properties"),"jdbc.url",jdbcUrl); 
			GetDBPropertiesValue.writeProperties(request.getRealPath("/WEB-INF/classes/db.properties"),"jdbc.username",username); 
			GetDBPropertiesValue.writeProperties(request.getRealPath("/WEB-INF/classes/db.properties"),"jdbc.password",password);
			return "success";
		}
		return  "error";
	}
	
	@RequestMapping("/testdataSource")
	public @ResponseBody String testdataSource(HttpServletRequest request) throws Exception{
		/*String excutesql =request.getParameter("excutesql");
		List<Map> objs2 = MybatisUtil.queryList("runtime.selectSql",excutesql);
		if (objs2.size()>0) {
			return "success";
		}*/
		String jdbcDriver =request.getParameter("jdbcDriver");
		String jdbcUrl =request.getParameter("jdbcUrl");
		String username =request.getParameter("username");
		String password =request.getParameter("password");
		String abc = Batch.getConnectionByConfigure(jdbcDriver,jdbcUrl,username,password);
		return  abc;
	}

}
