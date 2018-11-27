package com.myehr.controller.dict.param;

import java.util.List;

import com.myehr.pojo.dict.SysDictType;

public class SysDictTypeResultMap {
	private long total;
	private List<SysDictType> rows;
	public long getTotal() {
		return total;
	}
	public void setTotal(long total) {
		this.total = total;
	}
	public List<SysDictType> getRows() {
		return rows;
	}
	public void setRows(List<SysDictType> rows) {
		this.rows = rows;
	}
	
	
}
