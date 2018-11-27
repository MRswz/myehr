package com.myehr.pojo.activiti;

import java.math.BigDecimal;

public class ActRuIdentitylink {
    private Object id;

    private BigDecimal rev;

    private Object groupId;

    private Object type;

    private Object userId;

    private Object taskId;

    private Object procInstId;

    private Object procDefId;

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

    public Object getGroupId() {
        return groupId;
    }

    public void setGroupId(Object groupId) {
        this.groupId = groupId;
    }

    public Object getType() {
        return type;
    }

    public void setType(Object type) {
        this.type = type;
    }

    public Object getUserId() {
        return userId;
    }

    public void setUserId(Object userId) {
        this.userId = userId;
    }

    public Object getTaskId() {
        return taskId;
    }

    public void setTaskId(Object taskId) {
        this.taskId = taskId;
    }

    public Object getProcInstId() {
        return procInstId;
    }

    public void setProcInstId(Object procInstId) {
        this.procInstId = procInstId;
    }

    public Object getProcDefId() {
        return procDefId;
    }

    public void setProcDefId(Object procDefId) {
        this.procDefId = procDefId;
    }
}