package com.myehr.pojo.activiti;

import java.math.BigDecimal;

public class ActGeBytearray {
    private Object id;

    private BigDecimal rev;

    private Object name;

    private Object deploymentId;

    private Short generated;

    private byte[] bytes;

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

    public Object getName() {
        return name;
    }

    public void setName(Object name) {
        this.name = name;
    }

    public Object getDeploymentId() {
        return deploymentId;
    }

    public void setDeploymentId(Object deploymentId) {
        this.deploymentId = deploymentId;
    }

    public Short getGenerated() {
        return generated;
    }

    public void setGenerated(Short generated) {
        this.generated = generated;
    }

    public byte[] getBytes() {
        return bytes;
    }

    public void setBytes(byte[] bytes) {
        this.bytes = bytes;
    }
}