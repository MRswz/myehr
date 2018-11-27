package com.myehr.pojo.formmanage.form;

import java.io.Serializable;
import java.util.Date;

public class SysEditorModel implements Serializable{
	private static final long serialVersionUID = 1L;
    private Long editorModelId;

    private Long editorModelFormid;

    private Long editorModelButtonid;

    private String editorModelType;

    private String editorModelCode;

    private String editorModelName;

    private Long editorModelFolderId;

    private Long operatorName;

    private Date operatorTime;

    private String deleteMark;

    private String editorModelFormName;

    public Long getEditorModelId() {
        return editorModelId;
    }

    public void setEditorModelId(Long editorModelId) {
        this.editorModelId = editorModelId;
    }

    public Long getEditorModelFormid() {
        return editorModelFormid;
    }

    public void setEditorModelFormid(Long editorModelFormid) {
        this.editorModelFormid = editorModelFormid;
    }

    public Long getEditorModelButtonid() {
        return editorModelButtonid;
    }

    public void setEditorModelButtonid(Long editorModelButtonid) {
        this.editorModelButtonid = editorModelButtonid;
    }

    public String getEditorModelType() {
        return editorModelType;
    }

    public void setEditorModelType(String editorModelType) {
        this.editorModelType = editorModelType == null ? null : editorModelType.trim();
    }

    public String getEditorModelCode() {
        return editorModelCode;
    }

    public void setEditorModelCode(String editorModelCode) {
        this.editorModelCode = editorModelCode == null ? null : editorModelCode.trim();
    }

    public String getEditorModelName() {
        return editorModelName;
    }

    public void setEditorModelName(String editorModelName) {
        this.editorModelName = editorModelName == null ? null : editorModelName.trim();
    }

    public Long getEditorModelFolderId() {
        return editorModelFolderId;
    }

    public void setEditorModelFolderId(Long editorModelFolderId) {
        this.editorModelFolderId = editorModelFolderId;
    }

    public Long getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(Long operatorName) {
        this.operatorName = operatorName;
    }

    public Date getOperatorTime() {
        return operatorTime;
    }

    public void setOperatorTime(Date operatorTime) {
        this.operatorTime = operatorTime;
    }

    public String getDeleteMark() {
        return deleteMark;
    }

    public void setDeleteMark(String deleteMark) {
        this.deleteMark = deleteMark == null ? null : deleteMark.trim();
    }

    public String getEditorModelFormName() {
        return editorModelFormName;
    }

    public void setEditorModelFormName(String editorModelFormName) {
        this.editorModelFormName = editorModelFormName == null ? null : editorModelFormName.trim();
    }
}