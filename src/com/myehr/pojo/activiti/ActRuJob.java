package com.myehr.pojo.activiti;

import java.math.BigDecimal;
import java.util.Date;

public class ActRuJob {
    private Object id;

    private BigDecimal rev;

    private Object type;

    private Date lockExpTime;

    private Object lockOwner;

    private Short exclusive;

    private Object executionId;

    private Object processInstanceId;

    private Object procDefId;

    private BigDecimal retries;

    private Object exceptionStackId;

    private Object exceptionMsg;

    private Date duedate;

    private Object repeat;

    private Object handlerType;

    private Object handlerCfg;

    private Object tenantId;

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

    public Object getType() {
        return type;
    }

    public void setType(Object type) {
        this.type = type;
    }

    public Date getLockExpTime() {
        return lockExpTime;
    }

    public void setLockExpTime(Date lockExpTime) {
        this.lockExpTime = lockExpTime;
    }

    public Object getLockOwner() {
        return lockOwner;
    }

    public void setLockOwner(Object lockOwner) {
        this.lockOwner = lockOwner;
    }

    public Short getExclusive() {
        return exclusive;
    }

    public void setExclusive(Short exclusive) {
        this.exclusive = exclusive;
    }

    public Object getExecutionId() {
        return executionId;
    }

    public void setExecutionId(Object executionId) {
        this.executionId = executionId;
    }

    public Object getProcessInstanceId() {
        return processInstanceId;
    }

    public void setProcessInstanceId(Object processInstanceId) {
        this.processInstanceId = processInstanceId;
    }

    public Object getProcDefId() {
        return procDefId;
    }

    public void setProcDefId(Object procDefId) {
        this.procDefId = procDefId;
    }

    public BigDecimal getRetries() {
        return retries;
    }

    public void setRetries(BigDecimal retries) {
        this.retries = retries;
    }

    public Object getExceptionStackId() {
        return exceptionStackId;
    }

    public void setExceptionStackId(Object exceptionStackId) {
        this.exceptionStackId = exceptionStackId;
    }

    public Object getExceptionMsg() {
        return exceptionMsg;
    }

    public void setExceptionMsg(Object exceptionMsg) {
        this.exceptionMsg = exceptionMsg;
    }

    public Date getDuedate() {
        return duedate;
    }

    public void setDuedate(Date duedate) {
        this.duedate = duedate;
    }

    public Object getRepeat() {
        return repeat;
    }

    public void setRepeat(Object repeat) {
        this.repeat = repeat;
    }

    public Object getHandlerType() {
        return handlerType;
    }

    public void setHandlerType(Object handlerType) {
        this.handlerType = handlerType;
    }

    public Object getHandlerCfg() {
        return handlerCfg;
    }

    public void setHandlerCfg(Object handlerCfg) {
        this.handlerCfg = handlerCfg;
    }

    public Object getTenantId() {
        return tenantId;
    }

    public void setTenantId(Object tenantId) {
        this.tenantId = tenantId;
    }
}