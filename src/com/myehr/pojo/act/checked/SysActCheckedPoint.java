package com.myehr.pojo.act.checked;

import java.math.BigDecimal;
import java.util.Date;

public class SysActCheckedPoint {
    private BigDecimal id;

    private String checkedRequire;

    private String checkedContent;

    private String isFile;

    private Date createrTime;

    private String createrName;

    private Date operatorTime;

    private String operatorName;

    private String dutyType;

    private String controlType;

    private String isRequire;

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getCheckedRequire() {
        return checkedRequire;
    }

    public void setCheckedRequire(String checkedRequire) {
        this.checkedRequire = checkedRequire == null ? null : checkedRequire.trim();
    }

    public String getCheckedContent() {
        return checkedContent;
    }

    public void setCheckedContent(String checkedContent) {
        this.checkedContent = checkedContent == null ? null : checkedContent.trim();
    }

    public String getIsFile() {
        return isFile;
    }

    public void setIsFile(String isFile) {
        this.isFile = isFile == null ? null : isFile.trim();
    }

    public Date getCreaterTime() {
        return createrTime;
    }

    public void setCreaterTime(Date createrTime) {
        this.createrTime = createrTime;
    }

    public String getCreaterName() {
        return createrName;
    }

    public void setCreaterName(String createrName) {
        this.createrName = createrName == null ? null : createrName.trim();
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

    public String getDutyType() {
        return dutyType;
    }

    public void setDutyType(String dutyType) {
        this.dutyType = dutyType == null ? null : dutyType.trim();
    }

    public String getControlType() {
        return controlType;
    }

    public void setControlType(String controlType) {
        this.controlType = controlType == null ? null : controlType.trim();
    }

    public String getIsRequire() {
        return isRequire;
    }

    public void setIsRequire(String isRequire) {
        this.isRequire = isRequire == null ? null : isRequire.trim();
    }
}