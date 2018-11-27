package com.myehr.pojo.formmanage.button;

import java.math.BigDecimal;
import java.util.Date;


public class QSysformCalculateSolution  {
    private BigDecimal calculateSolutionId;

    private BigDecimal calculateId;

    private BigDecimal solutionId;

    private BigDecimal sort;

    private String operatorName;

    private Date operatorTime;

    private String solutionName;

    private String solutionCode;

    public BigDecimal getCalculateSolutionId() {
        return calculateSolutionId;
    }

    public void setCalculateSolutionId(BigDecimal calculateSolutionId) {
        this.calculateSolutionId = calculateSolutionId;
    }

    public BigDecimal getCalculateId() {
        return calculateId;
    }

    public void setCalculateId(BigDecimal calculateId) {
        this.calculateId = calculateId;
    }

    public BigDecimal getSolutionId() {
        return solutionId;
    }

    public void setSolutionId(BigDecimal solutionId) {
        this.solutionId = solutionId;
    }

    public BigDecimal getSort() {
        return sort;
    }

    public void setSort(BigDecimal sort) {
        this.sort = sort;
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

    public String getSolutionName() {
        return solutionName;
    }

    public void setSolutionName(String solutionName) {
        this.solutionName = solutionName == null ? null : solutionName.trim();
    }

    public String getSolutionCode() {
        return solutionCode;
    }

    public void setSolutionCode(String solutionCode) {
        this.solutionCode = solutionCode == null ? null : solutionCode.trim();
    }
}