package com.myehr.pojo.formmanage.template;

import java.math.BigDecimal;

public class SysTemplateSql {
    private BigDecimal templateSqlId;

    private String templateEntityName;

    private String templateEntityOtherName;

    private String templateProperty;

    private String templateLinkSymbol;

    private String templateCondition;

    private String templateSort;

    private BigDecimal templateId;

    private BigDecimal templateEntityId;

    public BigDecimal getTemplateSqlId() {
        return templateSqlId;
    }

    public void setTemplateSqlId(BigDecimal templateSqlId) {
        this.templateSqlId = templateSqlId;
    }

    public String getTemplateEntityName() {
        return templateEntityName;
    }

    public void setTemplateEntityName(String templateEntityName) {
        this.templateEntityName = templateEntityName == null ? null : templateEntityName.trim();
    }

    public String getTemplateEntityOtherName() {
        return templateEntityOtherName;
    }

    public void setTemplateEntityOtherName(String templateEntityOtherName) {
        this.templateEntityOtherName = templateEntityOtherName == null ? null : templateEntityOtherName.trim();
    }

    public String getTemplateProperty() {
        return templateProperty;
    }

    public void setTemplateProperty(String templateProperty) {
        this.templateProperty = templateProperty == null ? null : templateProperty.trim();
    }

    public String getTemplateLinkSymbol() {
        return templateLinkSymbol;
    }

    public void setTemplateLinkSymbol(String templateLinkSymbol) {
        this.templateLinkSymbol = templateLinkSymbol == null ? null : templateLinkSymbol.trim();
    }

    public String getTemplateCondition() {
        return templateCondition;
    }

    public void setTemplateCondition(String templateCondition) {
        this.templateCondition = templateCondition == null ? null : templateCondition.trim();
    }

    public String getTemplateSort() {
        return templateSort;
    }

    public void setTemplateSort(String templateSort) {
        this.templateSort = templateSort == null ? null : templateSort.trim();
    }

    public BigDecimal getTemplateId() {
        return templateId;
    }

    public void setTemplateId(BigDecimal templateId) {
        this.templateId = templateId;
    }

    public BigDecimal getTemplateEntityId() {
        return templateEntityId;
    }

    public void setTemplateEntityId(BigDecimal templateEntityId) {
        this.templateEntityId = templateEntityId;
    }
}