package com.myehr.controller.form.parambean;

import java.util.List;

import com.myehr.pojo.formmanage.form.SysSolution;

public class SysSchemeResultMap {
	private long total;
	private List<SysSolution> rows;
	public long getTotal() {
		return total;
	}
	public void setTotal(long total) {
		this.total = total;
	}
	public List<SysSolution> getRows() {
		return rows;
	}
	public void setRows(List<SysSolution> rows) {
		this.rows = rows;
	}
	
	
}
