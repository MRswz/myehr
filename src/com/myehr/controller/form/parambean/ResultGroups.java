package com.myehr.controller.form.parambean;

import java.util.List;

import com.myehr.pojo.formmanage.form.SysFormGroup;
import com.myehr.pojo.formmanage.template.SysTemplateGroup;

public class ResultGroups {
	private long total;
	private List<SysFormGroup> rows;
	public long getTotal() {
		return total;
	}
	public void setTotal(long total) {
		this.total = total;
	}
	public List<SysFormGroup> getRows() {
		return rows;
	}
	public void setRows(List<SysFormGroup> rows) {
		this.rows = rows;
	}
	
}