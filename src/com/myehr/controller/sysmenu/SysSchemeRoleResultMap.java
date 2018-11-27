package com.myehr.controller.sysmenu;

import java.util.List;

import com.myehr.pojo.sysRole.SysRole;

public class SysSchemeRoleResultMap {
	private long total;
	private List<SysRole> rows;
	public long getTotal() {
		return total;
	}
	public void setTotal(long total) {
		this.total = total;
	}
	public List<SysRole> getRows() {
		return rows;
	}
	public void setRows(List<SysRole> rows) {
		this.rows = rows;
	}
	
	
}
