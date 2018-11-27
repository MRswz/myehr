package com.myehr.pojo.activiti;

import java.math.BigDecimal;
import java.util.Date;

public class ActRuExecution {
    private Object id;

    private BigDecimal rev;

    private Object procInstId;

    private Object businessKey;

    private Object parentId;

    private Object procDefId;

    private Object superExec;

    private Object actId;

    private Short isActive;

    private Short isConcurrent;

    private Short isScope;

    private Short isEventScope;

    private BigDecimal suspensionState;

    private BigDecimal cachedEntState;

    private Object tenantId;

    private Object name;

    private Date lockTime;

    public Object getId() {
        return id;
    }

    public void setId(Object id) {
        this.id = id;
    }

    public BigDecimal getRev() {
        return rev;
    }

    public void setRev(BigDecimal rev) {
        this.rev = rev;
    }

    public Object getProcInstId() {
        return procInstId;
    }

    public void setProcInstId(Object procInstId) {
        this.procInstId = procInstId;
    }

    public Object getBusinessKey() {
        return businessKey;
    }

    public void setBusinessKey(Object businessKey) {
        this.businessKey = businessKey;
    }

    public Object getParentId() {
        return parentId;
    }

    public void setParentId(Object parentId) {
        this.parentId = parentId;
    }

    public Object getProcDefId() {
        return procDefId;
    }

    public void setProcDefId(Object procDefId) {
        this.procDefId = procDefId;
    }

    public Object getSuperExec() {
        return superExec;
    }

    public void setSuperExec(Object superExec) {
        this.superExec = superExec;
    }

    public Object getActId() {
        return actId;
    }

    public void setActId(Object actId) {
        this.actId = actId;
    }

    public Short getIsActive() {
        return isActive;
    }

    public void setIsActive(Short isActive) {
        this.isActive = isActive;
    }

    public Short getIsConcurrent() {
        return isConcurrent;
    }

    public void setIsConcurrent(Short isConcurrent) {
        this.isConcurrent = isConcurrent;
    }

    public Short getIsScope() {
        return isScope;
    }

    public void setIsScope(Short isScope) {
        this.isScope = isScope;
    }

    public Short getIsEventScope() {
        return isEventScope;
    }

    public void setIsEventScope(Short isEventScope) {
        this.isEventScope = isEventScope;
    }

    public BigDecimal getSuspensionState() {
        return suspensionState;
    }

    public void setSuspensionState(BigDecimal suspensionState) {
        this.suspensionState = suspensionState;
    }

    public BigDecimal getCachedEntState() {
        return cachedEntState;
    }

    public void setCachedEntState(BigDecimal cachedEntState) {
        this.cachedEntState = cachedEntState;
    }

    public Object getTenantId() {
        return tenantId;
    }

    public void setTenantId(Object tenantId) {
        this.tenantId = tenantId;
    }

    public Object getName() {
        return name;
    }

    public void setName(Object name) {
        this.name = name;
    }

    public Date getLockTime() {
        return lockTime;
    }

    public void setLockTime(Date lockTime) {
        this.lockTime = lockTime;
    }
}