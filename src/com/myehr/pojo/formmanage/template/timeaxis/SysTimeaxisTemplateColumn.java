package com.myehr.pojo.formmanage.template.timeaxis;

import java.util.Date;

public class SysTimeaxisTemplateColumn {
    private Integer templateColumnId;

    private Integer templateColumnTemplateId;

    private Integer templateColumnFormDefId;

    private String templateColumnCode;

    private String templateColumnLinkMark;

    private String templateColumnValue;

    private String templateColumnFontSize;

    private String templateColumnFontColor;

    private String templateIsTag;

    private String operatorName;

    private Date operatorTime;

    private String templateColumnFontWeight;

    private String templateColumnBgColor;

    public Integer getTemplateColumnId() {
        return templateColumnId;
    }

    public void setTemplateColumnId(Integer templateColumnId) {
        this.templateColumnId = templateColumnId;
    }

    public Integer getTemplateColumnTemplateId() {
        return templateColumnTemplateId;
    }

    public void setTemplateColumnTemplateId(Integer templateColumnTemplateId) {
        this.templateColumnTemplateId = templateColumnTemplateId;
    }

    public Integer getTemplateColumnFormDefId() {
        return templateColumnFormDefId;
    }

    public void setTemplateColumnFormDefId(Integer templateColumnFormDefId) {
        this.templateColumnFormDefId = templateColumnFormDefId;
    }

    public String getTemplateColumnCode() {
        return templateColumnCode;
    }

    public void setTemplateColumnCode(String templateColumnCode) {
        this.templateColumnCode = templateColumnCode == null ? null : templateColumnCode.trim();
    }

    public String getTemplateColumnLinkMark() {
        return templateColumnLinkMark;
    }

    public void setTemplateColumnLinkMark(String templateColumnLinkMark) {
        this.templateColumnLinkMark = templateColumnLinkMark == null ? null : templateColumnLinkMark.trim();
    }

    public String getTemplateColumnValue() {
        return templateColumnValue;
    }

    public void setTemplateColumnValue(String templateColumnValue) {
        this.templateColumnValue = templateColumnValue == null ? null : templateColumnValue.trim();
    }

    public String getTemplateColumnFontSize() {
        return templateColumnFontSize;
    }

    public void setTemplateColumnFontSize(String templateColumnFontSize) {
        this.templateColumnFontSize = templateColumnFontSize == null ? null : templateColumnFontSize.trim();
    }

    public String getTemplateColumnFontColor() {
        return templateColumnFontColor;
    }

    public void setTemplateColumnFontColor(String templateColumnFontColor) {
        this.templateColumnFontColor = templateColumnFontColor == null ? null : templateColumnFontColor.trim();
    }

    public String getTemplateIsTag() {
        return templateIsTag;
    }

    public void setTemplateIsTag(String templateIsTag) {
        this.templateIsTag = templateIsTag == null ? null : templateIsTag.trim();
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

    public String getTemplateColumnFontWeight() {
        return templateColumnFontWeight;
    }

    public void setTemplateColumnFontWeight(String templateColumnFontWeight) {
        this.templateColumnFontWeight = templateColumnFontWeight == null ? null : templateColumnFontWeight.trim();
    }

    public String getTemplateColumnBgColor() {
        return templateColumnBgColor;
    }

    public void setTemplateColumnBgColor(String templateColumnBgColor) {
        this.templateColumnBgColor = templateColumnBgColor == null ? null : templateColumnBgColor.trim();
    }
}