package com.myehr.pojo.formmanage.form;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class SysFormColumn implements Serializable{
	private static final long serialVersionUID = 1L;
	
    private BigDecimal formColumnId;

    private BigDecimal formColumnFormDefId;

    private BigDecimal formColumnEntityId;

    private BigDecimal formColumnColumnId;

    private String formEntityTablename;

    private String formFieldTablename;

    private String formColumnUsName;

    private String formColumnLable;

    private String formColumnLableWidth;

    private String formColumnSql;

    private String formColumnGuiType;

    private String formColumnWidth;

    private String formColumnAlign;

    private String formColumnHeight;

    private BigDecimal formColumnSort;

    private String formColumnShowType;

    private BigDecimal formColumnRowSpan;

    private BigDecimal formColumnColSpan;

    private String formColumnRequired;

    private String formColumnGroupId;

    private String formColumnChangeFun;

    private String formColumnInitFun;

    private String formColumnIslocket;

    private String formColumnRigist;

    private String formColumnType;

    private Date operatorTime;

    private String operatorName;

    private String formColumnTotal;

    private String formColumnIsDev;

    private BigDecimal formColumnMaxLength;

    private BigDecimal formColumnMinLength;

    private String formColumnColor;

    private String formColumnColorCondition;

    private String formColumnPositionId;

    private Long formColumnTemplateColumnId;

    private Float formColumnPositionSort;

    private String isshowweb;

    private String isshowmobile;

    private String defaultsort;

    private String issort;

    public BigDecimal getFormColumnId() {
        return formColumnId;
    }

    public void setFormColumnId(BigDecimal formColumnId) {
        this.formColumnId = formColumnId;
    }

    public BigDecimal getFormColumnFormDefId() {
        return formColumnFormDefId;
    }

    public void setFormColumnFormDefId(BigDecimal formColumnFormDefId) {
        this.formColumnFormDefId = formColumnFormDefId;
    }

    public BigDecimal getFormColumnEntityId() {
        return formColumnEntityId;
    }

    public void setFormColumnEntityId(BigDecimal formColumnEntityId) {
        this.formColumnEntityId = formColumnEntityId;
    }

    public BigDecimal getFormColumnColumnId() {
        return formColumnColumnId;
    }

    public void setFormColumnColumnId(BigDecimal formColumnColumnId) {
        this.formColumnColumnId = formColumnColumnId;
    }

    public String getFormEntityTablename() {
        return formEntityTablename;
    }

    public void setFormEntityTablename(String formEntityTablename) {
        this.formEntityTablename = formEntityTablename == null ? null : formEntityTablename.trim();
    }

    public String getFormFieldTablename() {
        return formFieldTablename;
    }

    public void setFormFieldTablename(String formFieldTablename) {
        this.formFieldTablename = formFieldTablename == null ? null : formFieldTablename.trim();
    }

    public String getFormColumnUsName() {
        return formColumnUsName;
    }

    public void setFormColumnUsName(String formColumnUsName) {
        this.formColumnUsName = formColumnUsName == null ? null : formColumnUsName.trim();
    }

    public String getFormColumnLable() {
        return formColumnLable;
    }

    public void setFormColumnLable(String formColumnLable) {
        this.formColumnLable = formColumnLable == null ? null : formColumnLable.trim();
    }

    public String getFormColumnLableWidth() {
        return formColumnLableWidth;
    }

    public void setFormColumnLableWidth(String formColumnLableWidth) {
        this.formColumnLableWidth = formColumnLableWidth == null ? null : formColumnLableWidth.trim();
    }

    public String getFormColumnSql() {
        return formColumnSql;
    }

    public void setFormColumnSql(String formColumnSql) {
        this.formColumnSql = formColumnSql == null ? null : formColumnSql.trim();
    }

    public String getFormColumnGuiType() {
        return formColumnGuiType;
    }

    public void setFormColumnGuiType(String formColumnGuiType) {
        this.formColumnGuiType = formColumnGuiType == null ? null : formColumnGuiType.trim();
    }

    public String getFormColumnWidth() {
        return formColumnWidth;
    }

    public void setFormColumnWidth(String formColumnWidth) {
        this.formColumnWidth = formColumnWidth == null ? null : formColumnWidth.trim();
    }

    public String getFormColumnAlign() {
        return formColumnAlign;
    }

    public void setFormColumnAlign(String formColumnAlign) {
        this.formColumnAlign = formColumnAlign == null ? null : formColumnAlign.trim();
    }

    public String getFormColumnHeight() {
        return formColumnHeight;
    }

    public void setFormColumnHeight(String formColumnHeight) {
        this.formColumnHeight = formColumnHeight == null ? null : formColumnHeight.trim();
    }

    public BigDecimal getFormColumnSort() {
        return formColumnSort;
    }

    public void setFormColumnSort(BigDecimal formColumnSort) {
        this.formColumnSort = formColumnSort;
    }

    public String getFormColumnShowType() {
        return formColumnShowType;
    }

    public void setFormColumnShowType(String formColumnShowType) {
        this.formColumnShowType = formColumnShowType == null ? null : formColumnShowType.trim();
    }

    public BigDecimal getFormColumnRowSpan() {
        return formColumnRowSpan;
    }

    public void setFormColumnRowSpan(BigDecimal formColumnRowSpan) {
        this.formColumnRowSpan = formColumnRowSpan;
    }

    public BigDecimal getFormColumnColSpan() {
        return formColumnColSpan;
    }

    public void setFormColumnColSpan(BigDecimal formColumnColSpan) {
        this.formColumnColSpan = formColumnColSpan;
    }

    public String getFormColumnRequired() {
        return formColumnRequired;
    }

    public void setFormColumnRequired(String formColumnRequired) {
        this.formColumnRequired = formColumnRequired == null ? null : formColumnRequired.trim();
    }

    public String getFormColumnGroupId() {
        return formColumnGroupId;
    }

    public void setFormColumnGroupId(String formColumnGroupId) {
        this.formColumnGroupId = formColumnGroupId == null ? null : formColumnGroupId.trim();
    }

    public String getFormColumnChangeFun() {
        return formColumnChangeFun;
    }

    public void setFormColumnChangeFun(String formColumnChangeFun) {
        this.formColumnChangeFun = formColumnChangeFun == null ? null : formColumnChangeFun.trim();
    }

    public String getFormColumnInitFun() {
        return formColumnInitFun;
    }

    public void setFormColumnInitFun(String formColumnInitFun) {
        this.formColumnInitFun = formColumnInitFun == null ? null : formColumnInitFun.trim();
    }

    public String getFormColumnIslocket() {
        return formColumnIslocket;
    }

    public void setFormColumnIslocket(String formColumnIslocket) {
        this.formColumnIslocket = formColumnIslocket == null ? null : formColumnIslocket.trim();
    }

    public String getFormColumnRigist() {
        return formColumnRigist;
    }

    public void setFormColumnRigist(String formColumnRigist) {
        this.formColumnRigist = formColumnRigist == null ? null : formColumnRigist.trim();
    }

    public String getFormColumnType() {
        return formColumnType;
    }

    public void setFormColumnType(String formColumnType) {
        this.formColumnType = formColumnType == null ? null : formColumnType.trim();
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

    public String getFormColumnTotal() {
        return formColumnTotal;
    }

    public void setFormColumnTotal(String formColumnTotal) {
        this.formColumnTotal = formColumnTotal == null ? null : formColumnTotal.trim();
    }

    public String getFormColumnIsDev() {
        return formColumnIsDev;
    }

    public void setFormColumnIsDev(String formColumnIsDev) {
        this.formColumnIsDev = formColumnIsDev == null ? null : formColumnIsDev.trim();
    }

    public BigDecimal getFormColumnMaxLength() {
        return formColumnMaxLength;
    }

    public void setFormColumnMaxLength(BigDecimal formColumnMaxLength) {
        this.formColumnMaxLength = formColumnMaxLength;
    }

    public BigDecimal getFormColumnMinLength() {
        return formColumnMinLength;
    }

    public void setFormColumnMinLength(BigDecimal formColumnMinLength) {
        this.formColumnMinLength = formColumnMinLength;
    }

    public String getFormColumnColor() {
        return formColumnColor;
    }

    public void setFormColumnColor(String formColumnColor) {
        this.formColumnColor = formColumnColor == null ? null : formColumnColor.trim();
    }

    public String getFormColumnColorCondition() {
        return formColumnColorCondition;
    }

    public void setFormColumnColorCondition(String formColumnColorCondition) {
        this.formColumnColorCondition = formColumnColorCondition == null ? null : formColumnColorCondition.trim();
    }

    public String getFormColumnPositionId() {
        return formColumnPositionId;
    }

    public void setFormColumnPositionId(String formColumnPositionId) {
        this.formColumnPositionId = formColumnPositionId == null ? null : formColumnPositionId.trim();
    }

    public Long getFormColumnTemplateColumnId() {
        return formColumnTemplateColumnId;
    }

    public void setFormColumnTemplateColumnId(Long formColumnTemplateColumnId) {
        this.formColumnTemplateColumnId = formColumnTemplateColumnId;
    }

    public Float getFormColumnPositionSort() {
        return formColumnPositionSort;
    }

    public void setFormColumnPositionSort(Float formColumnPositionSort) {
        this.formColumnPositionSort = formColumnPositionSort;
    }

    public String getIsshowweb() {
        return isshowweb;
    }

    public void setIsshowweb(String isshowweb) {
        this.isshowweb = isshowweb == null ? null : isshowweb.trim();
    }

    public String getIsshowmobile() {
        return isshowmobile;
    }

    public void setIsshowmobile(String isshowmobile) {
        this.isshowmobile = isshowmobile == null ? null : isshowmobile.trim();
    }

    public String getDefaultsort() {
        return defaultsort;
    }

    public void setDefaultsort(String defaultsort) {
        this.defaultsort = defaultsort == null ? null : defaultsort.trim();
    }

    public String getIssort() {
        return issort;
    }

    public void setIssort(String issort) {
        this.issort = issort == null ? null : issort.trim();
    }
}