package com.myehr.common.util;

import java.util.ArrayList;

public class SessionUtil { 
	//根据sessionId判断当前用户是否存在在集合中 如果存在 返回当前用户 否则返回null 
	public static User getUserBySessionId(ArrayList<User> userList,String sessionId) { 
		for (User user : userList) { 
			if(sessionId.equals(user.getSessionId())){ 
				return user; 
			} 
		} 
		return null; 
	} 
} 
