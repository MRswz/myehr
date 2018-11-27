package com.myehr.pojo.fileinput;

import java.util.List;

import com.myehr.pojo.formmanage.widget.SysFileupload;

public class SysCheckedPointAndFiles {
	SysFileChecked point;
	List<SysFileupload> files;
	public SysFileChecked getPoint() {
		return point;
	}
	public void setPoint(SysFileChecked point) {
		this.point = point;
	}
	public List<SysFileupload> getFiles() {
		return files;
	}
	public void setFiles(List<SysFileupload> files) {
		this.files = files;
	}
	
	
}
