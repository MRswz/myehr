package com.myehr.pojo.formmanage.form;

import java.io.Serializable;
import java.util.Date;

public class SysActfreeHisExpand implements Serializable{
	private static final long serialVersionUID = 1L;
    
	private SysActfreeHis freeHis;
	
    private String cname;

    private String endTime;
    
    public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public SysActfreeHis getFreeHis() {
		return freeHis;
	}

	public void setFreeHis(SysActfreeHis freeHis) {
		this.freeHis = freeHis;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	
	
}