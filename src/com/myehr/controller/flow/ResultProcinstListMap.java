package com.myehr.controller.flow;

import java.util.List;

import com.myehr.pojo.activiti.ActHiProcinst;

public class ResultProcinstListMap {
	private long total;
	private List<ActHiProcinst> rows;
	public long getTotal() {
		return total;
	}
	public void setTotal(long total) {
		this.total = total;
	}
	public List<ActHiProcinst> getRows() {
		return rows;
	}
	public void setRows(List<ActHiProcinst> rows) {
		this.rows = rows;
	}
	
	
}
