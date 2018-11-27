package com.myehr.controller.sysmenu;

import java.util.List;
import java.util.Map;

public class MenuDatas {
	private long schemeId;
	private List<Map> checkMenus;
	public long getSchemeId() {
		return schemeId;
	}
	public void setSchemeId(long schemeId) {
		this.schemeId = schemeId;
	}
	public List<Map> getCheckMenus() {
		return checkMenus;
	}
	public void setCheckMenus(List<Map> checkMenus) {
		this.checkMenus = checkMenus;
	}
	
	
}
