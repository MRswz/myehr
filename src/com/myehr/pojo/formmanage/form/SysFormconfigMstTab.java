package com.myehr.pojo.formmanage.form;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class SysFormconfigMstTab implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private BigDecimal mstTabId;

    private BigDecimal mstTabFormId;

    private BigDecimal mstTabMainFormId;

    private String mstTabMainFormHeight;

    private String mstTabDetailHeight;

    private String operatorName;

    private Date operatorTime;

    private String formShowAll;

    private String verticaltype;

    public BigDecimal getMstTabId() {
        return mstTabId;
    }

    public void setMstTabId(BigDecimal mstTabId) {
        this.mstTabId = mstTabId;
    }

    public BigDecimal getMstTabFormId() {
        return mstTabFormId;
    }

    public void setMstTabFormId(BigDecimal mstTabFormId) {
        this.mstTabFormId = mstTabFormId;
    }

    public BigDecimal getMstTabMainFormId() {
        return mstTabMainFormId;
    }

    public void setMstTabMainFormId(BigDecimal mstTabMainFormId) {
        this.mstTabMainFormId = mstTabMainFormId;
    }

    public String getMstTabMainFormHeight() {
        return mstTabMainFormHeight;
    }

    public void setMstTabMainFormHeight(String mstTabMainFormHeight) {
        this.mstTabMainFormHeight = mstTabMainFormHeight == null ? null : mstTabMainFormHeight.trim();
    }

    public String getMstTabDetailHeight() {
        return mstTabDetailHeight;
    }

    public void setMstTabDetailHeight(String mstTabDetailHeight) {
        this.mstTabDetailHeight = mstTabDetailHeight == null ? null : mstTabDetailHeight.trim();
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

    public String getFormShowAll() {
        return formShowAll;
    }

    public void setFormShowAll(String formShowAll) {
        this.formShowAll = formShowAll == null ? null : formShowAll.trim();
    }

    public String getVerticaltype() {
        return verticaltype;
    }

    public void setVerticaltype(String verticaltype) {
        this.verticaltype = verticaltype == null ? null : verticaltype.trim();
    }
}