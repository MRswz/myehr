package com.myehr.pojo.activiti;

import java.math.BigDecimal;

public class ActRuVariable {
    private Object id;

    private BigDecimal rev;

    private Object type;

    private Object name;

    private Object executionId;

    private Object procInstId;

    private Object taskId;

    private Object bytearrayId;

    private BigDecimal doubleType;

    private BigDecimal longType;

    private Object text;

    private Object text2;

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

    public Object getName() {
        return name;
    }

    public void setName(Object name) {
        this.name = name;
    }

    public Object getExecutionId() {
        return executionId;
    }

    public void setExecutionId(Object executionId) {
        this.executionId = executionId;
    }

    public Object getProcInstId() {
        return procInstId;
    }

    public void setProcInstId(Object procInstId) {
        this.procInstId = procInstId;
    }

    public Object getTaskId() {
        return taskId;
    }

    public void setTaskId(Object taskId) {
        this.taskId = taskId;
    }

    public Object getBytearrayId() {
        return bytearrayId;
    }

    public void setBytearrayId(Object bytearrayId) {
        this.bytearrayId = bytearrayId;
    }

    public BigDecimal getDoubleType() {
        return doubleType;
    }

    public void setDouble(BigDecimal doubleType) {
        this.doubleType = doubleType;
    }

    public BigDecimal getLongType() {
        return longType;
    }

    public void setLong(BigDecimal longType) {
        this.longType = longType;
    }

    public Object getText() {
        return text;
    }

    public void setText(Object text) {
        this.text = text;
    }

    public Object getText2() {
        return text2;
    }

    public void setText2(Object text2) {
        this.text2 = text2;
    }
}