package com.myehr.pojo.act.checked;

import java.math.BigDecimal;
import java.util.Date;

public class SysActChecked {
    private BigDecimal id;

    private String checkedCode;

    private String checkedName;

    private Date createrTime;

    private String createrName;

    private Date operatorTime;

    private String operatorName;

    private String dutyType;

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getCheckedCode() {
        return checkedCode;
    }

    public void setCheckedCode(String checkedCode) {
        this.checkedCode = checkedCode == null ? null : checkedCode.trim();
    }

    public String getCheckedName() {
        return checkedName;
    }

    public void setCheckedName(String checkedName) {
        this.checkedName = checkedName == null ? null : checkedName.trim();
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
}