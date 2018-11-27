package com.myehr.pojo.formmanage.form;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class SysFormReport implements Serializable{
	private static final long serialVersionUID = 1L;
    private BigDecimal reportId;

    private BigDecimal reportFormId;

    private BigDecimal reportRowCount;

    private String reportLableWidth;

    private String reportRelId;

    private String reportButtonName;

    private String reportButtonSelfFun;

    private String operatorName;

    private Date operatorTime;
    
    public SysFormReport(){};
    public BigDecimal getReportId() {
        return reportId;
    }

    public void setReportId(BigDecimal reportId) {
        this.reportId = reportId;
    }

    public BigDecimal getReportFormId() {
        return reportFormId;
    }

    public void setReportFormId(BigDecimal reportFormId) {
        this.reportFormId = reportFormId;
    }

    public BigDecimal getReportRowCount() {
        return reportRowCount;
    }

    public void setReportRowCount(BigDecimal reportRowCount) {
        this.reportRowCount = reportRowCount;
    }

    public String getReportLableWidth() {
        return reportLableWidth;
    }

    public void setReportLableWidth(String reportLableWidth) {
        this.reportLableWidth = reportLableWidth == null ? null : reportLableWidth.trim();
    }

    public String getReportRelId() {
        return reportRelId;
    }

    public void setReportRelId(String reportRelId) {
        this.reportRelId = reportRelId == null ? null : reportRelId.trim();
    }

    public String getReportButtonName() {
        return reportButtonName;
    }

    public void setReportButtonName(String reportButtonName) {
        this.reportButtonName = reportButtonName == null ? null : reportButtonName.trim();
    }

    public String getReportButtonSelfFun() {
        return reportButtonSelfFun;
    }

    public void setReportButtonSelfFun(String reportButtonSelfFun) {
        this.reportButtonSelfFun = reportButtonSelfFun == null ? null : reportButtonSelfFun.trim();
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