package com.myehr.controller.handsontable;

import java.util.List;
import java.util.Map;

public class DeleteDataParam {
	
	List<Map> kbasecodes;  
	
	String primaryKey;

	public String getPrimaryKey() {
		return primaryKey;
	}

	public void setPrimaryKey(String primaryKey) {
		this.primaryKey = primaryKey;
	}

	public void setKbasecodes(List<Map> kbasecodes) {
		this.kbasecodes = kbasecodes;
	}

	public List<Map> getKbasecodes() {
		return kbasecodes;
	}


}
