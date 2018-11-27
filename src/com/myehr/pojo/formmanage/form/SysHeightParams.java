package com.myehr.pojo.formmanage.form;

import java.util.List;

public class SysHeightParams {
	List<SysHeightgrade> heights;
	SysHeightgradeconfig heightConfig;
	public List<SysHeightgrade> getHeights() {
		return heights;
	}
	public void setHeights(List<SysHeightgrade> heights) {
		this.heights = heights;
	}
	public SysHeightgradeconfig getHeightConfig() {
		return heightConfig;
	}
	public void setHeightConfig(SysHeightgradeconfig heightConfig) {
		this.heightConfig = heightConfig;
	}
	
}
