package com.myehr.pojo.formmanage.form;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class SysTreeSolution implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private BigDecimal treeSolutionId;

    private String treeSolutionCode;

    private String treeSolutionName;

    private String treeSolutionEntitySql;

    private String treeSolutionExcSql;

    private Date operatorTime;

    private String operatorName;

    private BigDecimal treeSolutionFolderId;

    private String deleteMark;

    public BigDecimal getTreeSolutionId() {
        return treeSolutionId;
    }

    public void setTreeSolutionId(BigDecimal treeSolutionId) {
        this.treeSolutionId = treeSolutionId;
    }

    public String getTreeSolutionCode() {
        return treeSolutionCode;
    }

    public void setTreeSolutionCode(String treeSolutionCode) {
        this.treeSolutionCode = treeSolutionCode == null ? null : treeSolutionCode.trim();
    }

    public String getTreeSolutionName() {
        return treeSolutionName;
    }

    public void setTreeSolutionName(String treeSolutionName) {
        this.treeSolutionName = treeSolutionName == null ? null : treeSolutionName.trim();
    }

    public String getTreeSolutionEntitySql() {
        return treeSolutionEntitySql;
    }

    public void setTreeSolutionEntitySql(String treeSolutionEntitySql) {
        this.treeSolutionEntitySql = treeSolutionEntitySql == null ? null : treeSolutionEntitySql.trim();
    }

    public String getTreeSolutionExcSql() {
        return treeSolutionExcSql;
    }

    public void setTreeSolutionExcSql(String treeSolutionExcSql) {
        this.treeSolutionExcSql = treeSolutionExcSql == null ? null : treeSolutionExcSql.trim();
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

    public BigDecimal getTreeSolutionFolderId() {
        return treeSolutionFolderId;
    }

    public void setTreeSolutionFolderId(BigDecimal treeSolutionFolderId) {
        this.treeSolutionFolderId = treeSolutionFolderId;
    }

    public String getDeleteMark() {
        return deleteMark;
    }

    public void setDeleteMark(String deleteMark) {
        this.deleteMark = deleteMark == null ? null : deleteMark.trim();
    }
}