package com.myehr.pojo.formmanage.template.widget;

import java.math.BigDecimal;
import java.util.Date;

public class SysTemplateTextarea {
    private BigDecimal textareaId;

    private BigDecimal textareaTemplateColumnId;

    private String textareaCheckType;

    private String textareaCheckSelf;

    private String textareaCheckFun;

    private String textareaInitFun;

    private String textareaValuechangeFun;

    private String textareaClickFun;

    private String textareaDataFromType;

    private String textareaDataFromValue;

    private Date operatorTime;

    private String operatorName;

    public BigDecimal getTextareaId() {
        return textareaId;
    }

    public void setTextareaId(BigDecimal textareaId) {
        this.textareaId = textareaId;
    }

    public BigDecimal getTextareaTemplateColumnId() {
        return textareaTemplateColumnId;
    }

    public void setTextareaTemplateColumnId(BigDecimal textareaTemplateColumnId) {
        this.textareaTemplateColumnId = textareaTemplateColumnId;
    }

    public String getTextareaCheckType() {
        return textareaCheckType;
    }

    public void setTextareaCheckType(String textareaCheckType) {
        this.textareaCheckType = textareaCheckType == null ? null : textareaCheckType.trim();
    }

    public String getTextareaCheckSelf() {
        return textareaCheckSelf;
    }

    public void setTextareaCheckSelf(String textareaCheckSelf) {
        this.textareaCheckSelf = textareaCheckSelf == null ? null : textareaCheckSelf.trim();
    }

    public String getTextareaCheckFun() {
        return textareaCheckFun;
    }

    public void setTextareaCheckFun(String textareaCheckFun) {
        this.textareaCheckFun = textareaCheckFun == null ? null : textareaCheckFun.trim();
    }

    public String getTextareaInitFun() {
        return textareaInitFun;
    }

    public void setTextareaInitFun(String textareaInitFun) {
        this.textareaInitFun = textareaInitFun == null ? null : textareaInitFun.trim();
    }

    public String getTextareaValuechangeFun() {
        return textareaValuechangeFun;
    }

    public void setTextareaValuechangeFun(String textareaValuechangeFun) {
        this.textareaValuechangeFun = textareaValuechangeFun == null ? null : textareaValuechangeFun.trim();
    }

    public String getTextareaClickFun() {
        return textareaClickFun;
    }

    public void setTextareaClickFun(String textareaClickFun) {
        this.textareaClickFun = textareaClickFun == null ? null : textareaClickFun.trim();
    }

    public String getTextareaDataFromType() {
        return textareaDataFromType;
    }

    public void setTextareaDataFromType(String textareaDataFromType) {
        this.textareaDataFromType = textareaDataFromType == null ? null : textareaDataFromType.trim();
    }

    public String getTextareaDataFromValue() {
        return textareaDataFromValue;
    }

    public void setTextareaDataFromValue(String textareaDataFromValue) {
        this.textareaDataFromValue = textareaDataFromValue == null ? null : textareaDataFromValue.trim();
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