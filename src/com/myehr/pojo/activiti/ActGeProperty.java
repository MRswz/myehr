package com.myehr.pojo.activiti;

import java.math.BigDecimal;

public class ActGeProperty {
    private Object name;

    private Object value;

    private BigDecimal rev;

    public Object getName() {
        return name;
    }

    public void setName(Object name) {
        this.name = name;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public BigDecimal getRev() {
        return rev;
    }

    public void setRev(BigDecimal rev) {
        this.rev = rev;
    }
}