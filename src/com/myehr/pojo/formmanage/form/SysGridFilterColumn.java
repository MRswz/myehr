package com.myehr.pojo.formmanage.form;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class SysGridFilterColumn implements Serializable{
	private static final long serialVersionUID = 1L;
    private BigDecimal queryColumnId;

    private BigDecimal gridColumnFilterId;

    private String gridColumnLable;

    private BigDecimal gridColumnId;

    private String gridColumnFilterRule;

    private BigDecimal formColumnSort;

    private String gridColumnIsShow;

    private String gridColumnRowSpan;

    private String gridColumnColSpan;

    private String gridColumnHeight;

    private String gridColumnWidth;

    private BigDecimal gridColumnGroup;

    private String gridColumnIsIntervais;

    private Date operatorTime;

    private String operatorName;

    private String isshowweb;

    private String isshowmobile;

    public BigDecimal getQueryColumnId() {
        return queryColumnId;
    }

    public void setQueryColumnId(BigDecimal queryColumnId) {
        this.queryColumnId = queryColumnId;
    }

    public BigDecimal getGridColumnFilterId() {
        return gridColumnFilterId;
    }

    public void setGridColumnFilterId(BigDecimal gridColumnFilterId) {
        this.gridColumnFilterId = gridColumnFilterId;
    }

    public String getGridColumnLable() {
        return gridColumnLable;
    }

    public void setGridColumnLable(String gridColumnLable) {
        this.gridColumnLable = gridColumnLable == null ? null : gridColumnLable.trim();
    }

    public BigDecimal getGridColumnId() {
        return gridColumnId;
    }

    public void setGridColumnId(BigDecimal gridColumnId) {
        this.gridColumnId = gridColumnId;
    }

    public String getGridColumnFilterRule() {
        return gridColumnFilterRule;
    }

    public void setGridColumnFilterRule(String gridColumnFilterRule) {
        this.gridColumnFilterRule = gridColumnFilterRule == null ? null : gridColumnFilterRule.trim();
    }

    public BigDecimal getFormColumnSort() {
        return formColumnSort;
    }

    public void setFormColumnSort(BigDecimal formColumnSort) {
        this.formColumnSort = formColumnSort;
    }

    public String getGridColumnIsShow() {
        return gridColumnIsShow;
    }

    public void setGridColumnIsShow(String gridColumnIsShow) {
        this.gridColumnIsShow = gridColumnIsShow == null ? null : gridColumnIsShow.trim();
    }

    public String getGridColumnRowSpan() {
        return gridColumnRowSpan;
    }

    public void setGridColumnRowSpan(String gridColumnRowSpan) {
        this.gridColumnRowSpan = gridColumnRowSpan == null ? null : gridColumnRowSpan.trim();
    }

    public String getGridColumnColSpan() {
        return gridColumnColSpan;
    }

    public void setGridColumnColSpan(String gridColumnColSpan) {
        this.gridColumnColSpan = gridColumnColSpan == null ? null : gridColumnColSpan.trim();
    }

    public String getGridColumnHeight() {
        return gridColumnHeight;
    }

    public void setGridColumnHeight(String gridColumnHeight) {
        this.gridColumnHeight = gridColumnHeight == null ? null : gridColumnHeight.trim();
    }

    public String getGridColumnWidth() {
        return gridColumnWidth;
    }

    public void setGridColumnWidth(String gridColumnWidth) {
        this.gridColumnWidth = gridColumnWidth == null ? null : gridColumnWidth.trim();
    }

    public BigDecimal getGridColumnGroup() {
        return gridColumnGroup;
    }

    public void setGridColumnGroup(BigDecimal gridColumnGroup) {
        this.gridColumnGroup = gridColumnGroup;
    }

    public String getGridColumnIsIntervais() {
        return gridColumnIsIntervais;
    }

    public void setGridColumnIsIntervais(String gridColumnIsIntervais) {
        this.gridColumnIsIntervais = gridColumnIsIntervais == null ? null : gridColumnIsIntervais.trim();
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
}