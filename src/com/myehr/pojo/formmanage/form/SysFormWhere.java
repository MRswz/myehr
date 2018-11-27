package com.myehr.pojo.formmanage.form;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class SysFormWhere implements Serializable{
	private static final long serialVersionUID = 1L;
    private BigDecimal formWhereId;

    private BigDecimal formWhereFormDefId;

    private String formWhereColumnId;

    private String formWhereCpRule;

    private String formWhereValueType;

    private String formWhereValue;

    private String formWhereJoinRule;

    private BigDecimal formWhereSort;

    private String formWhereNullIs;

    private String formWhereLeftBracket;

    private String formWhereRightBracket;

    private Date operatorTime;

    private String operatorName;

    private String isshowweb;

    private String isshowmobile;

    public BigDecimal getFormWhereId() {
        return formWhereId;
    }

    public void setFormWhereId(BigDecimal formWhereId) {
        this.formWhereId = formWhereId;
    }

    public BigDecimal getFormWhereFormDefId() {
        return formWhereFormDefId;
    }

    public void setFormWhereFormDefId(BigDecimal formWhereFormDefId) {
        this.formWhereFormDefId = formWhereFormDefId;
    }

    public String getFormWhereColumnId() {
        return formWhereColumnId;
    }

    public void setFormWhereColumnId(String formWhereColumnId) {
        this.formWhereColumnId = formWhereColumnId == null ? null : formWhereColumnId.trim();
    }

    public String getFormWhereCpRule() {
        return formWhereCpRule;
    }

    public void setFormWhereCpRule(String formWhereCpRule) {
        this.formWhereCpRule = formWhereCpRule == null ? null : formWhereCpRule.trim();
    }

    public String getFormWhereValueType() {
        return formWhereValueType;
    }

    public void setFormWhereValueType(String formWhereValueType) {
        this.formWhereValueType = formWhereValueType == null ? null : formWhereValueType.trim();
    }

    public String getFormWhereValue() {
        return formWhereValue;
    }

    public void setFormWhereValue(String formWhereValue) {
        this.formWhereValue = formWhereValue == null ? null : formWhereValue.trim();
    }

    public String getFormWhereJoinRule() {
        return formWhereJoinRule;
    }

    public void setFormWhereJoinRule(String formWhereJoinRule) {
        this.formWhereJoinRule = formWhereJoinRule == null ? null : formWhereJoinRule.trim();
    }

    public BigDecimal getFormWhereSort() {
        return formWhereSort;
    }

    public void setFormWhereSort(BigDecimal formWhereSort) {
        this.formWhereSort = formWhereSort;
    }

    public String getFormWhereNullIs() {
        return formWhereNullIs;
    }

    public void setFormWhereNullIs(String formWhereNullIs) {
        this.formWhereNullIs = formWhereNullIs == null ? null : formWhereNullIs.trim();
    }

    public String getFormWhereLeftBracket() {
        return formWhereLeftBracket;
    }

    public void setFormWhereLeftBracket(String formWhereLeftBracket) {
        this.formWhereLeftBracket = formWhereLeftBracket == null ? null : formWhereLeftBracket.trim();
    }

    public String getFormWhereRightBracket() {
        return formWhereRightBracket;
    }

    public void setFormWhereRightBracket(String formWhereRightBracket) {
        this.formWhereRightBracket = formWhereRightBracket == null ? null : formWhereRightBracket.trim();
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