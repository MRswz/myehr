package com.myehr.pojo.formmanage.button;

public class SysFormButtonEditor {
    private Long buttonEditorModelId;

    private Long buttonEditorModelFormid;

    private Long buttonEditorModelButtonid;

    private String editorModelType;

    private String editorMessageType;

    private Long editorModelId;

    private String editorModelName;

    public Long getButtonEditorModelId() {
        return buttonEditorModelId;
    }

    public void setButtonEditorModelId(Long buttonEditorModelId) {
        this.buttonEditorModelId = buttonEditorModelId;
    }

    public Long getButtonEditorModelFormid() {
        return buttonEditorModelFormid;
    }

    public void setButtonEditorModelFormid(Long buttonEditorModelFormid) {
        this.buttonEditorModelFormid = buttonEditorModelFormid;
    }

    public Long getButtonEditorModelButtonid() {
        return buttonEditorModelButtonid;
    }

    public void setButtonEditorModelButtonid(Long buttonEditorModelButtonid) {
        this.buttonEditorModelButtonid = buttonEditorModelButtonid;
    }

    public String getEditorModelType() {
        return editorModelType;
    }

    public void setEditorModelType(String editorModelType) {
        this.editorModelType = editorModelType == null ? null : editorModelType.trim();
    }

    public String getEditorMessageType() {
        return editorMessageType;
    }

    public void setEditorMessageType(String editorMessageType) {
        this.editorMessageType = editorMessageType == null ? null : editorMessageType.trim();
    }

    public Long getEditorModelId() {
        return editorModelId;
    }

    public void setEditorModelId(Long editorModelId) {
        this.editorModelId = editorModelId;
    }

    public String getEditorModelName() {
        return editorModelName;
    }

    public void setEditorModelName(String editorModelName) {
        this.editorModelName = editorModelName == null ? null : editorModelName.trim();
    }
}