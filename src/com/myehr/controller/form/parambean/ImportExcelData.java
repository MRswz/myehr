package com.myehr.controller.form.parambean;

import java.util.Map;

public class ImportExcelData {
	String formId;
	
	String filePath;
	
	String clientFileName;
	
	String repeOper;
	
	String execptOper;
	
	String buttonId;
	
	Map[] fieldSet;

	public String getFormId() {
		return formId;
	}

	public void setFormId(String formId) {
		this.formId = formId;
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public String getClientFileName() {
		return clientFileName;
	}

	public void setClientFileName(String clientFileName) {
		this.clientFileName = clientFileName;
	}

	public String getRepeOper() {
		return repeOper;
	}

	public void setRepeOper(String repeOper) {
		this.repeOper = repeOper;
	}

	public String getExecptOper() {
		return execptOper;
	}

	public void setExecptOper(String execptOper) {
		this.execptOper = execptOper;
	}

	public String getButtonId() {
		return buttonId;
	}

	public void setButtonId(String buttonId) {
		this.buttonId = buttonId;
	}

	public Map[] getFieldSet() {
		return fieldSet;
	}

	public void setFieldSet(Map[] fieldSet) {
		this.fieldSet = fieldSet;
	}

}
