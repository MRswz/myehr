package com.myehr.controller.form.parambean;

import java.util.List;

import com.myehr.pojo.formmanage.form.SysFormWhere;

public class ResultWheres {
	private long total;
	private List<SysFormWhere> rows;
	public long getTotal() {
		return total;
	}
	public void setTotal(long total) {
		this.total = total;
	}
	public List<SysFormWhere> getRows() {
		return rows;
	}
	public void setRows(List<SysFormWhere> rows) {
		this.rows = rows;
	}
	
	
}
