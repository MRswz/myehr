package com.myehr.common.util;

import java.util.ArrayList;

import javax.servlet.annotation.WebListener;  
import javax.servlet.http.HttpSessionEvent; 
import javax.servlet.http.HttpSessionListener; 

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.myehr.common.mybatis.MybatisUtil;
/** 
 * HttpSessionListener 监听器 
 * 
 */
//@WebListener
public class MyHttpSessionListener implements HttpSessionListener{
	private static Logger logger = LoggerFactory.getLogger(MyHttpSessionListener.class);
	//当前用户数 
	private int userCounts=0; 
	
	private   MySessionContext myc=MySessionContext.getInstance();  
	
	@Override
	public void sessionCreated(HttpSessionEvent se) { 
		//sessionCreated 用户数+1 
		userCounts++; 
		//重新在servletContext中保存userCounts 
		se.getSession().getServletContext().setAttribute("userCounts", userCounts);
		myc.AddSession(se.getSession()); 
	} 
	
	@Override
	public void sessionDestroyed(HttpSessionEvent se) { 
		//sessionDestroyed 用户数-1 
		userCounts--; 
		//重新在servletContext中保存userCounts 
		se.getSession().getServletContext().setAttribute("userCounts", userCounts); 
		@SuppressWarnings("unchecked") 
		ArrayList<User> userList=(ArrayList<User>) se.getSession().getServletContext().getAttribute("userList"); 
		String sessionId=se.getSession().getId(); 
		//如果当前用户在userList中 在session销毁时 将当前用户移出userList 
		if(SessionUtil.getUserBySessionId(userList, sessionId)!=null){
			User user = SessionUtil.getUserBySessionId(userList, sessionId);
			userList.remove(user);
			String userId = user.getUserId();
			String sql = "delete from sys_online_user where user_id = "+userId;
			try {
				MybatisUtil.delete("runtime.deleteSql", sql);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();logger.error(e.getMessage(),e);
			}
			myc.DelSession(se.getSession()); 
		} 
		//将userList集合 重新保存到servletContext 
		se.getSession().getServletContext().setAttribute("userList", userList); 
	} 
} 
