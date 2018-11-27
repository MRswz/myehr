package com.myehr.controller.sysRole;

import java.util.List;
import java.util.Map;

public class MenuDatas {
	private long roleId;
	private List<Map> checkMenus;
	public long getRoleId() {
		return roleId;
	}
	public void setRoleId(long roleId) {
		this.roleId = roleId;
	}
	public List<Map> getCheckMenus() {
		return checkMenus;
	}
	public void setCheckMenus(List<Map> checkMenus) {
		this.checkMenus = checkMenus;
	}
	
	
}
