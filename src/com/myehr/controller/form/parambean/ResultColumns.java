package com.myehr.controller.form.parambean;

import java.util.List;

import com.myehr.pojo.formmanage.form.SysFormColumn;

public class ResultColumns {
	private long total;
	private List<SysFormColumn> rows;
	public long getTotal() {
		return total;
	}
	public void setTotal(long total) {
		this.total = total;
	}
	public List<SysFormColumn> getRows() {
		return rows;
	}
	public void setRows(List<SysFormColumn> rows) {
		this.rows = rows;
	}
	
	
}
