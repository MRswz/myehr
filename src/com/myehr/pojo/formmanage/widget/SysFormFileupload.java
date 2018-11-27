package com.myehr.pojo.formmanage.widget;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class SysFormFileupload implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private BigDecimal fileuploadId;

    private BigDecimal fileuploadFormColumnId;

    private String fileuploadCheckFun;

    private String fileuploadInitFun;

    private String fileuploadDataFromType;

    private String fileuploadDataFromValue;

    private String fileuploadType;

    private String fileuploadOnlyDownload;

    private String fileuploadAutoUpload;

    private String fileuploadUploadFiletypes;

    private Date operatorTime;

    private String operatorName;

    private BigDecimal fileuploadMaxFileCount;

    private String fileuploadTagGuiType;

    public BigDecimal getFileuploadId() {
        return fileuploadId;
    }

    public void setFileuploadId(BigDecimal fileuploadId) {
        this.fileuploadId = fileuploadId;
    }

    public BigDecimal getFileuploadFormColumnId() {
        return fileuploadFormColumnId;
    }

    public void setFileuploadFormColumnId(BigDecimal fileuploadFormColumnId) {
        this.fileuploadFormColumnId = fileuploadFormColumnId;
    }

    public String getFileuploadCheckFun() {
        return fileuploadCheckFun;
    }

    public void setFileuploadCheckFun(String fileuploadCheckFun) {
        this.fileuploadCheckFun = fileuploadCheckFun == null ? null : fileuploadCheckFun.trim();
    }

    public String getFileuploadInitFun() {
        return fileuploadInitFun;
    }

    public void setFileuploadInitFun(String fileuploadInitFun) {
        this.fileuploadInitFun = fileuploadInitFun == null ? null : fileuploadInitFun.trim();
    }

    public String getFileuploadDataFromType() {
        return fileuploadDataFromType;
    }

    public void setFileuploadDataFromType(String fileuploadDataFromType) {
        this.fileuploadDataFromType = fileuploadDataFromType == null ? null : fileuploadDataFromType.trim();
    }

    public String getFileuploadDataFromValue() {
        return fileuploadDataFromValue;
    }

    public void setFileuploadDataFromValue(String fileuploadDataFromValue) {
        this.fileuploadDataFromValue = fileuploadDataFromValue == null ? null : fileuploadDataFromValue.trim();
    }

    public String getFileuploadType() {
        return fileuploadType;
    }

    public void setFileuploadType(String fileuploadType) {
        this.fileuploadType = fileuploadType == null ? null : fileuploadType.trim();
    }

    public String getFileuploadOnlyDownload() {
        return fileuploadOnlyDownload;
    }

    public void setFileuploadOnlyDownload(String fileuploadOnlyDownload) {
        this.fileuploadOnlyDownload = fileuploadOnlyDownload == null ? null : fileuploadOnlyDownload.trim();
    }

    public String getFileuploadAutoUpload() {
        return fileuploadAutoUpload;
    }

    public void setFileuploadAutoUpload(String fileuploadAutoUpload) {
        this.fileuploadAutoUpload = fileuploadAutoUpload == null ? null : fileuploadAutoUpload.trim();
    }

    public String getFileuploadUploadFiletypes() {
        return fileuploadUploadFiletypes;
    }

    public void setFileuploadUploadFiletypes(String fileuploadUploadFiletypes) {
        this.fileuploadUploadFiletypes = fileuploadUploadFiletypes == null ? null : fileuploadUploadFiletypes.trim();
    }

    public Date getOperatorTime() {
        return operatorTime;
    }

    public void setOperatorTime(Date operatorTime) {
        this.operatorTime = operatorTime;
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName == null ? null : operatorName.trim();
    }

    public BigDecimal getFileuploadMaxFileCount() {
        return fileuploadMaxFileCount;
    }

    public void setFileuploadMaxFileCount(BigDecimal fileuploadMaxFileCount) {
        this.fileuploadMaxFileCount = fileuploadMaxFileCount;
    }

    public String getFileuploadTagGuiType() {
        return fileuploadTagGuiType;
    }

    public void setFileuploadTagGuiType(String fileuploadTagGuiType) {
        this.fileuploadTagGuiType = fileuploadTagGuiType == null ? null : fileuploadTagGuiType.trim();
    }
}