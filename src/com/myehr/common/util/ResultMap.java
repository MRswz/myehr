package com.myehr.common.util;

import java.util.List;

public class ResultMap {
	private long total;
	private List<Object> rows;
	public long getTotal() {
		return total;
	}
	public void setTotal(long total) {
		this.total = total;
	}
	public List<Object> getRows() {
		return rows;
	}
	public void setRows(List<Object> rows) {
		this.rows = rows;
	}
	
	
}
