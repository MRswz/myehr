package com.myehr.pojo.formmanage.form;

import java.io.Serializable;
import java.math.BigDecimal;

public class SysExecSql implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private BigDecimal execSqlId;

    private String entitySql;

    private String execSql;

    private String execSqlType;

    private Long execSqlRelaid;

    private String afterExecType;

    private String afterExecFun;

    public BigDecimal getExecSqlId() {
        return execSqlId;
    }

    public void setExecSqlId(BigDecimal execSqlId) {
        this.execSqlId = execSqlId;
    }

    public String getEntitySql() {
        return entitySql;
    }

    public void setEntitySql(String entitySql) {
        this.entitySql = entitySql == null ? null : entitySql.trim();
    }

    public String getExecSql() {
        return execSql;
    }

    public void setExecSql(String execSql) {
        this.execSql = execSql == null ? null : execSql.trim();
    }

    public String getExecSqlType() {
        return execSqlType;
    }

    public void setExecSqlType(String execSqlType) {
        this.execSqlType = execSqlType == null ? null : execSqlType.trim();
    }

    public Long getExecSqlRelaid() {
        return execSqlRelaid;
    }

    public void setExecSqlRelaid(Long execSqlRelaid) {
        this.execSqlRelaid = execSqlRelaid;
    }

    public String getAfterExecType() {
        return afterExecType;
    }

    public void setAfterExecType(String afterExecType) {
        this.afterExecType = afterExecType == null ? null : afterExecType.trim();
    }

    public String getAfterExecFun() {
        return afterExecFun;
    }

    public void setAfterExecFun(String afterExecFun) {
        this.afterExecFun = afterExecFun == null ? null : afterExecFun.trim();
    }
}