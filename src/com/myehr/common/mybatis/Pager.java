package com.myehr.common.mybatis;

public class Pager {
	
	public int start ; //根据currentPage和pageSize计算得出
	
	public int limt ; //根据currentPage和pageSize计算得出
	
	public int currentPage;
	
	public int pageSize ;
	
	public long total;

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getLimt() {
		return limt;
	}

	public void setLimt(int limt) {
		this.limt = limt;
	}
	
}
