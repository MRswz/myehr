package com.myehr.pojo.formmanage.form;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class SysSqlParams implements Serializable {
	private static final long serialVersionUID = 1L;

	private BigDecimal sqlParamsId;

    private String sqlParamsCode;

    private String sqlParamsName;

    private String sqlParamsType;

    private BigDecimal sqlParamsFolderId;

    private String sqlParamsDataType;

    private String sqlParamsDesc;

    private BigDecimal sqlParamSchemaId;

    private String operatorName;

    private Date operatorTime;

    private String sqlParamsGuiType;

    private String sqlParamsValue;

    private String sqlParamsIsRequired;

    public BigDecimal getSqlParamsId() {
        return sqlParamsId;
    }

    public void setSqlParamsId(BigDecimal sqlParamsId) {
        this.sqlParamsId = sqlParamsId;
    }

    public String getSqlParamsCode() {
        return sqlParamsCode;
    }

    public void setSqlParamsCode(String sqlParamsCode) {
        this.sqlParamsCode = sqlParamsCode == null ? null : sqlParamsCode.trim();
    }

    public String getSqlParamsName() {
        return sqlParamsName;
    }

    public void setSqlParamsName(String sqlParamsName) {
        this.sqlParamsName = sqlParamsName == null ? null : sqlParamsName.trim();
    }

    public String getSqlParamsType() {
        return sqlParamsType;
    }

    public void setSqlParamsType(String sqlParamsType) {
        this.sqlParamsType = sqlParamsType == null ? null : sqlParamsType.trim();
    }

    public BigDecimal getSqlParamsFolderId() {
        return sqlParamsFolderId;
    }

    public void setSqlParamsFolderId(BigDecimal sqlParamsFolderId) {
        this.sqlParamsFolderId = sqlParamsFolderId;
    }

    public String getSqlParamsDataType() {
        return sqlParamsDataType;
    }

    public void setSqlParamsDataType(String sqlParamsDataType) {
        this.sqlParamsDataType = sqlParamsDataType == null ? null : sqlParamsDataType.trim();
    }

    public String getSqlParamsDesc() {
        return sqlParamsDesc;
    }

    public void setSqlParamsDesc(String sqlParamsDesc) {
        this.sqlParamsDesc = sqlParamsDesc == null ? null : sqlParamsDesc.trim();
    }

    public BigDecimal getSqlParamSchemaId() {
        return sqlParamSchemaId;
    }

    public void setSqlParamSchemaId(BigDecimal sqlParamSchemaId) {
        this.sqlParamSchemaId = sqlParamSchemaId;
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

    public String getSqlParamsGuiType() {
        return sqlParamsGuiType;
    }

    public void setSqlParamsGuiType(String sqlParamsGuiType) {
        this.sqlParamsGuiType = sqlParamsGuiType == null ? null : sqlParamsGuiType.trim();
    }

    public String getSqlParamsValue() {
        return sqlParamsValue;
    }

    public void setSqlParamsValue(String sqlParamsValue) {
        this.sqlParamsValue = sqlParamsValue == null ? null : sqlParamsValue.trim();
    }

    public String getSqlParamsIsRequired() {
        return sqlParamsIsRequired;
    }

    public void setSqlParamsIsRequired(String sqlParamsIsRequired) {
        this.sqlParamsIsRequired = sqlParamsIsRequired == null ? null : sqlParamsIsRequired.trim();
    }
}