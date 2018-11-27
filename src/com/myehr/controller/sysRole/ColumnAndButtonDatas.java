package com.myehr.controller.sysRole;

import java.util.List;
import java.util.Map;

public class ColumnAndButtonDatas {
	private long roleId;
	private long objType;
	private List<Map> checkMenus;
	public long getRoleId() {
		return roleId;
	}
	public void setRoleId(long roleId) {
		this.roleId = roleId;
	}
	public long getObjType() {
		return objType;
	}
	public void setObjType(long objType) {
		this.objType = objType;
	}
	public List<Map> getCheckMenus() {
		return checkMenus;
	}
	public void setCheckMenus(List<Map> checkMenus) {
		this.checkMenus = checkMenus;
	}
	
	
}
