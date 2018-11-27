package com.myehr.pojo.formmanage.button;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class SysFormButtonIntroduce implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private BigDecimal introduceId;

    private String introduceType;

    private String introduceTitle;

    private String introduceWidth;

    private String introduceHeight;

    private BigDecimal introduceFormId;

    private String introduceInitFun;

    private String introduceSelfFun;

    private String introduceUrl;

    private BigDecimal introduceButtonId;

    private BigDecimal introduceExcsqlId;

    private String operatorName;

    private Date operatorTime;

    public BigDecimal getIntroduceId() {
        return introduceId;
    }

    public void setIntroduceId(BigDecimal introduceId) {
        this.introduceId = introduceId;
    }

    public String getIntroduceType() {
        return introduceType;
    }

    public void setIntroduceType(String introduceType) {
        this.introduceType = introduceType == null ? null : introduceType.trim();
    }

    public String getIntroduceTitle() {
        return introduceTitle;
    }

    public void setIntroduceTitle(String introduceTitle) {
        this.introduceTitle = introduceTitle == null ? null : introduceTitle.trim();
    }

    public String getIntroduceWidth() {
        return introduceWidth;
    }

    public void setIntroduceWidth(String introduceWidth) {
        this.introduceWidth = introduceWidth == null ? null : introduceWidth.trim();
    }

    public String getIntroduceHeight() {
        return introduceHeight;
    }

    public void setIntroduceHeight(String introduceHeight) {
        this.introduceHeight = introduceHeight == null ? null : introduceHeight.trim();
    }

    public BigDecimal getIntroduceFormId() {
        return introduceFormId;
    }

    public void setIntroduceFormId(BigDecimal introduceFormId) {
        this.introduceFormId = introduceFormId;
    }

    public String getIntroduceInitFun() {
        return introduceInitFun;
    }

    public void setIntroduceInitFun(String introduceInitFun) {
        this.introduceInitFun = introduceInitFun == null ? null : introduceInitFun.trim();
    }

    public String getIntroduceSelfFun() {
        return introduceSelfFun;
    }

    public void setIntroduceSelfFun(String introduceSelfFun) {
        this.introduceSelfFun = introduceSelfFun == null ? null : introduceSelfFun.trim();
    }

    public String getIntroduceUrl() {
        return introduceUrl;
    }

    public void setIntroduceUrl(String introduceUrl) {
        this.introduceUrl = introduceUrl == null ? null : introduceUrl.trim();
    }

    public BigDecimal getIntroduceButtonId() {
        return introduceButtonId;
    }

    public void setIntroduceButtonId(BigDecimal introduceButtonId) {
        this.introduceButtonId = introduceButtonId;
    }

    public BigDecimal getIntroduceExcsqlId() {
        return introduceExcsqlId;
    }

    public void setIntroduceExcsqlId(BigDecimal introduceExcsqlId) {
        this.introduceExcsqlId = introduceExcsqlId;
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