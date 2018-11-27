package com.myehr.pojo.app;

import java.util.List;

import com.myehr.pojo.app.grid.SysAppClass;
import com.myehr.pojo.formmanage.form.SysFormColumn;

public class AppStyleAndColumn {

	List<SysFormColumn> columns;
	
	SysAppClass appClass;

	public List<SysFormColumn> getColumns() {
		return columns;
	}

	public void setColumns(List<SysFormColumn> columns) {
		this.columns = columns;
	}

	public SysAppClass getAppClass() {
		return appClass;
	}

	public void setAppClass(SysAppClass appClass) {
		this.appClass = appClass;
	}
	
	
	
}
