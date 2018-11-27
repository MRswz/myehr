package com.myehr.pojo.activiti;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class ActHiProcinst implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    private Object id;

    private Object procInstId;

    private Object businessKey;

    private Object procDefId;

    private Date startTime;

    private Date endTime;

    private BigDecimal duration;

    private Object startUserId;

    private Object startActId;

    private Object endActId;

    private Object superProcessInstanceId;

    private Object deleteReason;

    private Object tenantId;

    private Object name;

    public Object getId() {
        return id;
    }

    public void setId(Object id) {
        this.id = id;
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

    public Object getProcDefId() {
        return procDefId;
    }

    public void setProcDefId(Object procDefId) {
        this.procDefId = procDefId;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public BigDecimal getDuration() {
        return duration;
    }

    public void setDuration(BigDecimal duration) {
        this.duration = duration;
    }

    public Object getStartUserId() {
        return startUserId;
    }

    public void setStartUserId(Object startUserId) {
        this.startUserId = startUserId;
    }

    public Object getStartActId() {
        return startActId;
    }

    public void setStartActId(Object startActId) {
        this.startActId = startActId;
    }

    public Object getEndActId() {
        return endActId;
    }

    public void setEndActId(Object endActId) {
        this.endActId = endActId;
    }

    public Object getSuperProcessInstanceId() {
        return superProcessInstanceId;
    }

    public void setSuperProcessInstanceId(Object superProcessInstanceId) {
        this.superProcessInstanceId = superProcessInstanceId;
    }

    public Object getDeleteReason() {
        return deleteReason;
    }

    public void setDeleteReason(Object deleteReason) {
        this.deleteReason = deleteReason;
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
}