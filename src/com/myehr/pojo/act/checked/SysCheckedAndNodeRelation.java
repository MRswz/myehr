package com.myehr.pojo.act.checked;

import java.math.BigDecimal;
import java.util.Date;

public class SysCheckedAndNodeRelation {
    private BigDecimal id;

    private String actNodeId;

    private String actNodeKey;

    private String checkedCode;

    private String checkedName;

    private Date operatorTime;

    private String operatorName;

    private String power;

    private Date createrTime;

    private String createrName;

    private String dutyType;

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getActNodeId() {
        return actNodeId;
    }

    public void setActNodeId(String actNodeId) {
        this.actNodeId = actNodeId == null ? null : actNodeId.trim();
    }

    public String getActNodeKey() {
        return actNodeKey;
    }

    public void setActNodeKey(String actNodeKey) {
        this.actNodeKey = actNodeKey == null ? null : actNodeKey.trim();
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

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power == null ? null : power.trim();
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

    public String getDutyType() {
        return dutyType;
    }

    public void setDutyType(String dutyType) {
        this.dutyType = dutyType == null ? null : dutyType.trim();
    }
}