package com.myehr.pojo.formmanage.button;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class SysFormButtonImport implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private BigDecimal buttonImportId;

    private BigDecimal formButtonId;

    private String buttonImportExcType;

    private String buttonImportFun;

    private String buttonImportUrl;

    private String buttonImportSql;

    private String buttonImportInitFun;

    private String buttonImportTemplate;

    private String operatorName;

    private Date operatorTime;

    public BigDecimal getButtonImportId() {
        return buttonImportId;
    }

    public void setButtonImportId(BigDecimal buttonImportId) {
        this.buttonImportId = buttonImportId;
    }

    public BigDecimal getFormButtonId() {
        return formButtonId;
    }

    public void setFormButtonId(BigDecimal formButtonId) {
        this.formButtonId = formButtonId;
    }

    public String getButtonImportExcType() {
        return buttonImportExcType;
    }

    public void setButtonImportExcType(String buttonImportExcType) {
        this.buttonImportExcType = buttonImportExcType == null ? null : buttonImportExcType.trim();
    }

    public String getButtonImportFun() {
        return buttonImportFun;
    }

    public void setButtonImportFun(String buttonImportFun) {
        this.buttonImportFun = buttonImportFun == null ? null : buttonImportFun.trim();
    }

    public String getButtonImportUrl() {
        return buttonImportUrl;
    }

    public void setButtonImportUrl(String buttonImportUrl) {
        this.buttonImportUrl = buttonImportUrl == null ? null : buttonImportUrl.trim();
    }

    public String getButtonImportSql() {
        return buttonImportSql;
    }

    public void setButtonImportSql(String buttonImportSql) {
        this.buttonImportSql = buttonImportSql == null ? null : buttonImportSql.trim();
    }

    public String getButtonImportInitFun() {
        return buttonImportInitFun;
    }

    public void setButtonImportInitFun(String buttonImportInitFun) {
        this.buttonImportInitFun = buttonImportInitFun == null ? null : buttonImportInitFun.trim();
    }

    public String getButtonImportTemplate() {
        return buttonImportTemplate;
    }

    public void setButtonImportTemplate(String buttonImportTemplate) {
        this.buttonImportTemplate = buttonImportTemplate == null ? null : buttonImportTemplate.trim();
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