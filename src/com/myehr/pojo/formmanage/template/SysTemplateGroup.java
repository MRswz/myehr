package com.myehr.pojo.formmanage.template;

import java.math.BigDecimal;
import java.util.Date;

public class SysTemplateGroup {
    private BigDecimal formGroupId;

    private BigDecimal groupTemplateId;

    private String formGroupLableWidth;

    private String formGroupCode;

    private String formGroupName;

    private BigDecimal formGroupRowCount;

    private BigDecimal formGroupSort;

    private String formGroupIsopen;

    private String operatorName;

    private Date operatorTime;

    public BigDecimal getFormGroupId() {
        return formGroupId;
    }

    public void setFormGroupId(BigDecimal formGroupId) {
        this.formGroupId = formGroupId;
    }

    public BigDecimal getGroupTemplateId() {
        return groupTemplateId;
    }

    public void setGroupTemplateId(BigDecimal groupTemplateId) {
        this.groupTemplateId = groupTemplateId;
    }

    public String getFormGroupLableWidth() {
        return formGroupLableWidth;
    }

    public void setFormGroupLableWidth(String formGroupLableWidth) {
        this.formGroupLableWidth = formGroupLableWidth == null ? null : formGroupLableWidth.trim();
    }

    public String getFormGroupCode() {
        return formGroupCode;
    }

    public void setFormGroupCode(String formGroupCode) {
        this.formGroupCode = formGroupCode == null ? null : formGroupCode.trim();
    }

    public String getFormGroupName() {
        return formGroupName;
    }

    public void setFormGroupName(String formGroupName) {
        this.formGroupName = formGroupName == null ? null : formGroupName.trim();
    }

    public BigDecimal getFormGroupRowCount() {
        return formGroupRowCount;
    }

    public void setFormGroupRowCount(BigDecimal formGroupRowCount) {
        this.formGroupRowCount = formGroupRowCount;
    }

    public BigDecimal getFormGroupSort() {
        return formGroupSort;
    }

    public void setFormGroupSort(BigDecimal formGroupSort) {
        this.formGroupSort = formGroupSort;
    }

    public String getFormGroupIsopen() {
        return formGroupIsopen;
    }

    public void setFormGroupIsopen(String formGroupIsopen) {
        this.formGroupIsopen = formGroupIsopen == null ? null : formGroupIsopen.trim();
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
}