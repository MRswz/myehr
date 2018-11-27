package com.myehr.controller.sysmenu;

import java.util.List;
import java.util.Map;

public class UserDatas {
	private long schemeId;
	private List<Map> selectUsers;
	public long getSchemeId() {
		return schemeId;
	}
	public void setSchemeId(long schemeId) {
		this.schemeId = schemeId;
	}
	public List<Map> getSelectUsers() {
		return selectUsers;
	}
	public void setSelectUsers(List<Map> selectUsers) {
		this.selectUsers = selectUsers;
	}
	
	
}
