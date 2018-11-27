package com.myehr.controller.form.parambean;

import java.util.List;

import com.myehr.pojo.cache.SysCacheConfig;
import com.myehr.pojo.formmanage.template.SysTemplateGroup;

public class ResultCacheConfig {
	private long total;
	private List<SysCacheConfig> rows;
	public long getTotal() {
		return total;
	}
	public void setTotal(long total) {
		this.total = total;
	}
	public List<SysCacheConfig> getRows() {
		return rows;
	}
	public void setRows(List<SysCacheConfig> rows) {
		this.rows = rows;
	}
	
	
}