package com.myehr.pojo.formmanage.form;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class SysFieldRole implements Serializable{
	private static final long serialVersionUID = 1L;
    private BigDecimal fieldRoleId;

    private BigDecimal formColumnId;

    private BigDecimal roleId;

    private BigDecimal formId;

    private String fieldRoleRemark;

    private String operatorName;

    private Date operatorTime;

    private BigDecimal formColumnType;

    public BigDecimal getFieldRoleId() {
        return fieldRoleId;
    }

    public void setFieldRoleId(BigDecimal fieldRoleId) {
        this.fieldRoleId = fieldRoleId;
    }

    public BigDecimal getFormColumnId() {
        return formColumnId;
    }

    public void setFormColumnId(BigDecimal formColumnId) {
        this.formColumnId = formColumnId;
    }

    public BigDecimal getRoleId() {
        return roleId;
    }

    public void setRoleId(BigDecimal roleId) {
        this.roleId = roleId;
    }

    public BigDecimal getFormId() {
        return formId;
    }

    public void setFormId(BigDecimal formId) {
        this.formId = formId;
    }

    public String getFieldRoleRemark() {
        return fieldRoleRemark;
    }

    public void setFieldRoleRemark(String fieldRoleRemark) {
        this.fieldRoleRemark = fieldRoleRemark == null ? null : fieldRoleRemark.trim();
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

    public BigDecimal getFormColumnType() {
        return formColumnType;
    }

    public void setFormColumnType(BigDecimal formColumnType) {
        this.formColumnType = formColumnType;
    }
    public SysFieldRole(){}
}