package com.myehr.common.util;

public class User {
	//当前用户的session id 
	private String sessionId; 
	
	//当前用户的session id 
	private String userId; 
	
	//当前用户的ip地址 
	private String ip; 
	
	//当前用户第一次访问的时间 
	private String firstTime; 
	
	public User() { 
		super(); 
	} 
	
	public String getIp() { 
	    return ip; 
	}
	
	public void setIp(String ip) { 
	    this.ip = ip; 
	}
	
	public String getFirstTime() { 
	    return firstTime; 
	}

	public void setFirstTime(String firstTime) {
	    this.firstTime = firstTime;
	}

	public String getSessionId() {
	    return sessionId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getUserId() {
	    return userId;
	}
	
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}
}
