package com.myehr.controller.sysmenu;

import java.util.List;

import com.myehr.pojo.sysuser.SysUser;

public class SysSchemeUserResultMap {
	private long total;
	private List<SysUser> rows;
	public long getTotal() {
		return total;
	}
	public void setTotal(long total) {
		this.total = total;
	}
	public List<SysUser> getRows() {
		return rows;
	}
	public void setRows(List<SysUser> rows) {
		this.rows = rows;
	}
	
	
}
