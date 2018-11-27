package com.myehr.pojo.fileinput;

import java.math.BigDecimal;
import java.util.Date;

public class SysFileChecked {
    private BigDecimal id;

    private String checkedName;

    private Date operatorTime;

    private String operatorName;

    private BigDecimal formDefId;

    private String relatedFileId;

    private String relatedFileName;

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getCheckedName() {
        return checkedName;
    }

    public void setCheckedName(String checkedName) {
        this.checkedName = checkedName == null ? null : checkedName.trim();
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

    public BigDecimal getFormDefId() {
        return formDefId;
    }

    public void setFormDefId(BigDecimal formDefId) {
        this.formDefId = formDefId;
    }

    public String getRelatedFileId() {
        return relatedFileId;
    }

    public void setRelatedFileId(String relatedFileId) {
        this.relatedFileId = relatedFileId == null ? null : relatedFileId.trim();
    }

    public String getRelatedFileName() {
        return relatedFileName;
    }

    public void setRelatedFileName(String relatedFileName) {
        this.relatedFileName = relatedFileName == null ? null : relatedFileName.trim();
    }
}