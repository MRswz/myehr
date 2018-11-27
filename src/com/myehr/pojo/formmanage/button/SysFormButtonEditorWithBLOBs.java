package com.myehr.pojo.formmanage.button;

import java.io.Serializable;

public class SysFormButtonEditorWithBLOBs extends SysFormButtonEditor implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String buttonEditorModelValue;

    private String buttonEditorModelHtml;

    public String getButtonEditorModelValue() {
        return buttonEditorModelValue;
    }

    public void setButtonEditorModelValue(String buttonEditorModelValue) {
        this.buttonEditorModelValue = buttonEditorModelValue == null ? null : buttonEditorModelValue.trim();
    }

    public String getButtonEditorModelHtml() {
        return buttonEditorModelHtml;
    }

    public void setButtonEditorModelHtml(String buttonEditorModelHtml) {
        this.buttonEditorModelHtml = buttonEditorModelHtml == null ? null : buttonEditorModelHtml.trim();
    }
}