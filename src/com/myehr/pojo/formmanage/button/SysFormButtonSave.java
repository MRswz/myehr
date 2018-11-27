package com.myehr.pojo.formmanage.button;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class SysFormButtonSave implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private BigDecimal buttonSaveId;

    private BigDecimal buttonSaveButtonId;

    private String buttonSaveType;

    private String buttonSaveExcType;

    private String buttonSaveFun;

    private String buttonSaveUrl;

    private String buttonSaveSql;

    private String buttonSaveInitFun;

    private String buttonSaveSuccessDeal;

    private String buttonSaveSuccessFun;

    private Date operatorTime;

    private String operatorName;

    public BigDecimal getButtonSaveId() {
        return buttonSaveId;
    }

    public void setButtonSaveId(BigDecimal buttonSaveId) {
        this.buttonSaveId = buttonSaveId;
    }

    public BigDecimal getButtonSaveButtonId() {
        return buttonSaveButtonId;
    }

    public void setButtonSaveButtonId(BigDecimal buttonSaveButtonId) {
        this.buttonSaveButtonId = buttonSaveButtonId;
    }

    public String getButtonSaveType() {
        return buttonSaveType;
    }

    public void setButtonSaveType(String buttonSaveType) {
        this.buttonSaveType = buttonSaveType == null ? null : buttonSaveType.trim();
    }

    public String getButtonSaveExcType() {
        return buttonSaveExcType;
    }

    public void setButtonSaveExcType(String buttonSaveExcType) {
        this.buttonSaveExcType = buttonSaveExcType == null ? null : buttonSaveExcType.trim();
    }

    public String getButtonSaveFun() {
        return buttonSaveFun;
    }

    public void setButtonSaveFun(String buttonSaveFun) {
        this.buttonSaveFun = buttonSaveFun == null ? null : buttonSaveFun.trim();
    }

    public String getButtonSaveUrl() {
        return buttonSaveUrl;
    }

    public void setButtonSaveUrl(String buttonSaveUrl) {
        this.buttonSaveUrl = buttonSaveUrl == null ? null : buttonSaveUrl.trim();
    }

    public String getButtonSaveSql() {
        return buttonSaveSql;
    }

    public void setButtonSaveSql(String buttonSaveSql) {
        this.buttonSaveSql = buttonSaveSql == null ? null : buttonSaveSql.trim();
    }

    public String getButtonSaveInitFun() {
        return buttonSaveInitFun;
    }

    public void setButtonSaveInitFun(String buttonSaveInitFun) {
        this.buttonSaveInitFun = buttonSaveInitFun == null ? null : buttonSaveInitFun.trim();
    }

    public String getButtonSaveSuccessDeal() {
        return buttonSaveSuccessDeal;
    }

    public void setButtonSaveSuccessDeal(String buttonSaveSuccessDeal) {
        this.buttonSaveSuccessDeal = buttonSaveSuccessDeal == null ? null : buttonSaveSuccessDeal.trim();
    }

    public String getButtonSaveSuccessFun() {
        return buttonSaveSuccessFun;
    }

    public void setButtonSaveSuccessFun(String buttonSaveSuccessFun) {
        this.buttonSaveSuccessFun = buttonSaveSuccessFun == null ? null : buttonSaveSuccessFun.trim();
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