package com.myehr.pojo.fileinput;

import java.math.BigDecimal;
import java.util.Date;

public class SysFileCheckedPoint {
    private BigDecimal id;

    private BigDecimal checkedId;

    private String checkedRequire;

    private String isAchieve;

    private String checkedContent;

    private Date operatorTime;

    private String operatorName;

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public BigDecimal getCheckedId() {
        return checkedId;
    }

    public void setCheckedId(BigDecimal checkedId) {
        this.checkedId = checkedId;
    }

    public String getCheckedRequire() {
        return checkedRequire;
    }

    public void setCheckedRequire(String checkedRequire) {
        this.checkedRequire = checkedRequire == null ? null : checkedRequire.trim();
    }

    public String getIsAchieve() {
        return isAchieve;
    }

    public void setIsAchieve(String isAchieve) {
        this.isAchieve = isAchieve == null ? null : isAchieve.trim();
    }

    public String getCheckedContent() {
        return checkedContent;
    }

    public void setCheckedContent(String checkedContent) {
        this.checkedContent = checkedContent == null ? null : checkedContent.trim();
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
}