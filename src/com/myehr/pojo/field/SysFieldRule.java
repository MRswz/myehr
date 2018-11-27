package com.myehr.pojo.field;

import java.util.Date;

public class SysFieldRule {
    private Long fieldRuleId;

    private String fieldRulePrefix;

    private String fieldRuleDigit;

    private String fieldRuleRaise;

    private String fieldRuleMax;

    private String operatorName;

    private Date operatorTime;

    private String fieldRuleCode;

    private String fieldRuleName;

    public Long getFieldRuleId() {
        return fieldRuleId;
    }

    public void setFieldRuleId(Long fieldRuleId) {
        this.fieldRuleId = fieldRuleId;
    }

    public String getFieldRulePrefix() {
        return fieldRulePrefix;
    }

    public void setFieldRulePrefix(String fieldRulePrefix) {
        this.fieldRulePrefix = fieldRulePrefix == null ? null : fieldRulePrefix.trim();
    }

    public String getFieldRuleDigit() {
        return fieldRuleDigit;
    }

    public void setFieldRuleDigit(String fieldRuleDigit) {
        this.fieldRuleDigit = fieldRuleDigit == null ? null : fieldRuleDigit.trim();
    }

    public String getFieldRuleRaise() {
        return fieldRuleRaise;
    }

    public void setFieldRuleRaise(String fieldRuleRaise) {
        this.fieldRuleRaise = fieldRuleRaise == null ? null : fieldRuleRaise.trim();
    }

    public String getFieldRuleMax() {
        return fieldRuleMax;
    }

    public void setFieldRuleMax(String fieldRuleMax) {
        this.fieldRuleMax = fieldRuleMax == null ? null : fieldRuleMax.trim();
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName == null ? null : operatorName.trim();
    }

    public Date getOperatorTime() {
        return operatorTime;
    }

    public void setOperatorTime(Date operatorTime) {
        this.operatorTime = operatorTime;
    }

    public String getFieldRuleCode() {
        return fieldRuleCode;
    }

    public void setFieldRuleCode(String fieldRuleCode) {
        this.fieldRuleCode = fieldRuleCode == null ? null : fieldRuleCode.trim();
    }

    public String getFieldRuleName() {
        return fieldRuleName;
    }

    public void setFieldRuleName(String fieldRuleName) {
        this.fieldRuleName = fieldRuleName == null ? null : fieldRuleName.trim();
    }
}