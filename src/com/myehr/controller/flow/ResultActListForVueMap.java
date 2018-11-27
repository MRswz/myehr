package com.myehr.controller.flow;

import java.util.List;

import com.myehr.pojo.act.Act;
import com.myehr.pojo.act.ActForMobile;


public class ResultActListForVueMap {
	private long total;
	private List<ActForMobile> rows;
	public long getTotal() {
		return total;
	}
	public void setTotal(long total) {
		this.total = total;
	}
	public List<ActForMobile> getRows() {
		return rows;
	}
	public void setRows(List<ActForMobile> rows) {
		this.rows = rows;
	}
	
	
}
