package com.myehr.pojo.formmanage.form;

public class SysEditorModelWithBLOBs extends SysEditorModel {
    private String editorModelValue;

    private String editorModelHtml;

    public String getEditorModelValue() {
        return editorModelValue;
    }

    public void setEditorModelValue(String editorModelValue) {
        this.editorModelValue = editorModelValue == null ? null : editorModelValue.trim();
    }

    public String getEditorModelHtml() {
        return editorModelHtml;
    }

    public void setEditorModelHtml(String editorModelHtml) {
        this.editorModelHtml = editorModelHtml == null ? null : editorModelHtml.trim();
    }
}