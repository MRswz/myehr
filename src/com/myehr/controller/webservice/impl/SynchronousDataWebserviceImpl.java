package com.myehr.controller.webservice.impl;

import java.util.List;
import java.util.Map;

import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.fastjson.JSON;
import com.myehr.common.mybatis.MybatisUtil;
import com.myehr.controller.webservice.service.SynchronousDataWebservice;


@XmlSeeAlso({java.util.HashMap.class})
@WebService(endpointInterface="com.myehr.controller.webservice.service.SynchronousDataWebservice")//指定webservice所实现的接口以及服务名称
public class SynchronousDataWebserviceImpl implements SynchronousDataWebservice{
	private static Logger logger = LoggerFactory.getLogger(SynchronousDataWebserviceImpl.class);
	@Override  
    public String getCompData(String userCode,String password) {
		String selectUserSql = "select USER_CODE,USER_PASSWORD from sys_user where user_code = '"+userCode+"'";
		List<Map> users = null;
		try {
			users = MybatisUtil.queryList("runtime.selectSql", selectUserSql);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();logger.error(e.getMessage(),e);
		}
		if (users.size()>0) {
			String userCode1 = users.get(0).get("USER_CODE")+"";
			String password1 = users.get(0).get("USER_PASSWORD")+"";
			if (userCode1.equals(userCode) && password1.equals(password)) {
				String sql = "select * from COMP_V_DATA ";
				List<Map> datas = null;
				try {
					datas = MybatisUtil.queryList("runtime.selectSql", sql);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();logger.error(e.getMessage(),e);
				}
				String jsonDatas = JSON.toJSONString(datas);
				logger.info(jsonDatas);
		        return "{'msg':"+jsonDatas+",'success':'200'}";
			}else {
				return "{'msg':'用户密码错误','success':'500'}";
			}
		}else {
			return "{'msg':'用户不存在','success':'500'}";
		} 
    }  
	
	@Override  
    public String getDeptData(String userCode,String password) { 
		String selectUserSql = "select USER_CODE,USER_PASSWORD from sys_user where user_code = '"+userCode+"'";
		List<Map> users = null;
		try {
			users = MybatisUtil.queryList("runtime.selectSql", selectUserSql);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();logger.error(e.getMessage(),e);
			return "{'msg':'程序异常','success':'500'}";
		}
		if (users.size()>0) {
			String userCode1 = users.get(0).get("USER_CODE")+"";
			String password1 = users.get(0).get("USER_PASSWORD")+"";
			if (userCode1.equals(userCode) && password1.equals(password)) {
				String sql = "select * from DEPT_V_DATA ";
				List<Map> datas = null;
				try {
					datas = MybatisUtil.queryList("runtime.selectSql", sql);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();logger.error(e.getMessage(),e);
					return "{'msg':'程序异常','success':'500'}";
				}
				String jsonDatas = JSON.toJSONString(datas);
				logger.info(jsonDatas);
		        return "{'msg':"+jsonDatas+",'success':'200'}";
			}else {
				return "{'msg':'用户密码错误','success':'500'}";
			}
		}else {
			return "{'msg':'用户不存在','success':'500'}";
		} 
    }
	
	@Override  
    public String getJobData(String userCode,String password) {  
		String selectUserSql = "select USER_CODE,USER_PASSWORD from sys_user where user_code = '"+userCode+"'";
		List<Map> users = null;
		try {
			users = MybatisUtil.queryList("runtime.selectSql", selectUserSql);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();logger.error(e.getMessage(),e);
		}
		if (users.size()>0) {
			String userCode1 = users.get(0).get("USER_CODE")+"";
			String password1 = users.get(0).get("USER_PASSWORD")+"";
			if (userCode1.equals(userCode) && password1.equals(password)) {
				String sql = "select * from JOB_V_DATA ";
				List<Map> datas = null;
				try {
					datas = MybatisUtil.queryList("runtime.selectSql", sql);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();logger.error(e.getMessage(),e);
				}
				String jsonDatas = JSON.toJSONString(datas);
				logger.info(jsonDatas);
		        return "{'msg':"+jsonDatas+",'success':'200'}";
			}else {
				return "{'msg':'用户密码错误','success':'500'}";
			}
		}else {
			return "{'msg':'用户不存在','success':'500'}";
		} 
    }  
	
	@Override  
    public String getEmpData(String userCode,String password) {  
        String selectUserSql = "select USER_CODE,USER_PASSWORD from sys_user where user_code = '"+userCode+"'";
		List<Map> users = null;
		try {
			users = MybatisUtil.queryList("runtime.selectSql", selectUserSql);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();logger.error(e.getMessage(),e);
		}
		if (users.size()>0) {
			String userCode1 = users.get(0).get("USER_CODE")+"";
			String password1 = users.get(0).get("USER_PASSWORD")+"";
			if (userCode1.equals(userCode) && password1.equals(password)) {
				String sql = "select * from EMP_V_DATA ";
				List<Map> datas = null;
				try {
					datas = MybatisUtil.queryList("runtime.selectSql", sql);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();logger.error(e.getMessage(),e);
				}
				String jsonDatas = JSON.toJSONString(datas);
				logger.info(jsonDatas);
		        return "{'msg':"+jsonDatas+",'success':'200'}";
			}else {
				return "{'msg':'用户密码错误','success':'500'}";
			}
		}else {
			return "{'msg':'用户不存在','success':'500'}";
		} 
    }  
    
}
