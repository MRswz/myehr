package com.myehr.common.util;

import java.text.SimpleDateFormat; 
import java.util.ArrayList; 
import java.util.Date; 
import java.util.List;
import java.util.Map;

import javax.servlet.ServletRequestEvent; 
import javax.servlet.ServletRequestListener; 
import javax.servlet.annotation.WebListener; 
import javax.servlet.http.HttpServletRequest; 

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.myehr.common.mybatis.MybatisUtil;
 
/** 
 * ServletRequestListener 监听器 
 * 
 */
//@WebListener
public class MyServletRequestListener implements ServletRequestListener {
	private static Logger logger = LoggerFactory.getLogger(MyServletRequestListener.class);
	//用户集合 
	private ArrayList<User> userList; 
	
	private MySessionContext myc=MySessionContext.getInstance(); 
	
	@Override
	public void requestDestroyed(ServletRequestEvent arg0) { 
	} 
	@SuppressWarnings("unchecked") 
	@Override
	public void requestInitialized(ServletRequestEvent arg0) { 
		//从servletContext中获的userList 
		userList=(ArrayList<User>) arg0.getServletContext().getAttribute("userList"); 
		//如果servletContext中没有userList对象 初始化userList 
		if(userList==null){ 
			userList=new ArrayList<User>(); 
		}
		if (userList.size()>1) {
			
		}
		HttpServletRequest request=(HttpServletRequest) arg0.getServletRequest(); 
		//sessionId 
		String sessionId=request.getSession().getId();
		String userId = "";
		String userCode = request.getParameter("userCode");
		if (userCode!=null && !userCode.equals("")) {	
			String sql = "select user_id from sys_user where user_code = '"+userCode+"'";
			List<Map> rs = new ArrayList<Map>();
			try {
				rs = MybatisUtil.queryList("runtime.selectSql", sql);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();logger.error(e.getMessage(),e);
			} 
			if (rs.size()>0) {
				userId = rs.get(0).get("user_id")+"";
			}
			
			//如果当前sessionId不存在集合中 创建当前user对象 
			if(SessionUtil.getUserBySessionId(userList,sessionId)==null){ 
				User user=new User(); 
				user.setSessionId(sessionId);
				user.setUserId(userId);
				user.setIp(request.getRemoteAddr()); 
				SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
				user.setFirstTime(sdf.format(new Date())); 
				userList.add(user); 
				
				if (!userId.equals("")) {
					String sql1 = "insert into sys_online_user (user_id,user_login_time,session_id) values ("+userId+",'"+sdf.format(new Date())+"','"+sessionId+"')";
					MybatisUtil.insert1("runtime.insertSql", sql1);
				}
				myc.AddSession(request.getSession()); 
			} 
			
		}
		
		//将userList集合 保存到ServletContext 
		arg0.getServletContext().setAttribute("userList", userList); 
	} 
} 
