package com.myehr.pojo.formmanage.form;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class SysFormButton implements Serializable{
	private static final long serialVersionUID = 1L;
    private BigDecimal formButtonId;

    private BigDecimal formButtonFormDefId;

    private String formButtonType;

    private String formButtonCode;

    private String formButtonName;

    private BigDecimal formButtonSort;

    private String formButtonFormId;

    private String formButtonWidth;

    private String formButtonHeight;

    private String formButtonIcon;

    private String formButtonCss;

    private Date operatorTime;

    private String operatorName;

    private String formButtonWarningInfo;

    private String formButtonCheckFun;

    private String isshowweb;

    private String isshowmobile;

    private String showArea;

    private String showType;

    public BigDecimal getFormButtonId() {
        return formButtonId;
    }

    public void setFormButtonId(BigDecimal formButtonId) {
        this.formButtonId = formButtonId;
    }

    public BigDecimal getFormButtonFormDefId() {
        return formButtonFormDefId;
    }

    public void setFormButtonFormDefId(BigDecimal formButtonFormDefId) {
        this.formButtonFormDefId = formButtonFormDefId;
    }

    public String getFormButtonType() {
        return formButtonType;
    }

    public void setFormButtonType(String formButtonType) {
        this.formButtonType = formButtonType == null ? null : formButtonType.trim();
    }

    public String getFormButtonCode() {
        return formButtonCode;
    }

    public void setFormButtonCode(String formButtonCode) {
        this.formButtonCode = formButtonCode == null ? null : formButtonCode.trim();
    }

    public String getFormButtonName() {
        return formButtonName;
    }

    public void setFormButtonName(String formButtonName) {
        this.formButtonName = formButtonName == null ? null : formButtonName.trim();
    }

    public BigDecimal getFormButtonSort() {
        return formButtonSort;
    }

    public void setFormButtonSort(BigDecimal formButtonSort) {
        this.formButtonSort = formButtonSort;
    }

    public String getFormButtonFormId() {
        return formButtonFormId;
    }

    public void setFormButtonFormId(String formButtonFormId) {
        this.formButtonFormId = formButtonFormId == null ? null : formButtonFormId.trim();
    }

    public String getFormButtonWidth() {
        return formButtonWidth;
    }

    public void setFormButtonWidth(String formButtonWidth) {
        this.formButtonWidth = formButtonWidth == null ? null : formButtonWidth.trim();
    }

    public String getFormButtonHeight() {
        return formButtonHeight;
    }

    public void setFormButtonHeight(String formButtonHeight) {
        this.formButtonHeight = formButtonHeight == null ? null : formButtonHeight.trim();
    }

    public String getFormButtonIcon() {
        return formButtonIcon;
    }

    public void setFormButtonIcon(String formButtonIcon) {
        this.formButtonIcon = formButtonIcon == null ? null : formButtonIcon.trim();
    }

    public String getFormButtonCss() {
        return formButtonCss;
    }

    public void setFormButtonCss(String formButtonCss) {
        this.formButtonCss = formButtonCss == null ? null : formButtonCss.trim();
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

    public String getFormButtonWarningInfo() {
        return formButtonWarningInfo;
    }

    public void setFormButtonWarningInfo(String formButtonWarningInfo) {
        this.formButtonWarningInfo = formButtonWarningInfo == null ? null : formButtonWarningInfo.trim();
    }

    public String getFormButtonCheckFun() {
        return formButtonCheckFun;
    }

    public void setFormButtonCheckFun(String formButtonCheckFun) {
        this.formButtonCheckFun = formButtonCheckFun == null ? null : formButtonCheckFun.trim();
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

    public String getShowArea() {
        return showArea;
    }

    public void setShowArea(String showArea) {
        this.showArea = showArea == null ? null : showArea.trim();
    }

    public String getShowType() {
        return showType;
    }

    public void setShowType(String showType) {
        this.showType = showType == null ? null : showType.trim();
    }
}