package com.myehr.pojo.formmanage.form;

import java.util.List;

public class ActFreeComent {
	List<SysActfreeWay> ways;
	List<SysActfreeHis> his;
	String title;
	String statu;
	public List<SysActfreeWay> getWays() {
		return ways;
	}
	public void setWays(List<SysActfreeWay> ways) {
		this.ways = ways;
	}
	public List<SysActfreeHis> getHis() {
		return his;
	}
	public void setHis(List<SysActfreeHis> his) {
		this.his = his;
	}
	public String getStatu() {
		return statu;
	}
	public void setStatu(String statu) {
		this.statu = statu;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
}
