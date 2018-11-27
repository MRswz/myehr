package com.myehr.pojo.formmanage.form;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class SysComment implements Serializable{
	private static final long serialVersionUID = 1L;
    private BigDecimal id;

    private BigDecimal formid;

    private BigDecimal keyid;

    private String name;

    private Integer advanced;

    private Integer fashion;

    private Integer convenient;

    private Integer stable;

    private String content;

    private String description;

    private Date datetime;

    private String ip;

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public BigDecimal getFormid() {
        return formid;
    }

    public void setFormid(BigDecimal formid) {
        this.formid = formid;
    }

    public BigDecimal getKeyid() {
        return keyid;
    }

    public void setKeyid(BigDecimal keyid) {
        this.keyid = keyid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getAdvanced() {
        return advanced;
    }

    public void setAdvanced(Integer advanced) {
        this.advanced = advanced;
    }

    public Integer getFashion() {
        return fashion;
    }

    public void setFashion(Integer fashion) {
        this.fashion = fashion;
    }

    public Integer getConvenient() {
        return convenient;
    }

    public void setConvenient(Integer convenient) {
        this.convenient = convenient;
    }

    public Integer getStable() {
        return stable;
    }

    public void setStable(Integer stable) {
        this.stable = stable;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }
}