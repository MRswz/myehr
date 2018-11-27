package com.myehr.pojo.calendar;

import java.math.BigDecimal;
import java.util.Date;

public class Testcalendar {
    private Long id;

    private Date datetime;

    private String title;

    private String arrangetype;

    private BigDecimal userId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getArrangetype() {
        return arrangetype;
    }

    public void setArrangetype(String arrangetype) {
        this.arrangetype = arrangetype == null ? null : arrangetype.trim();
    }

    public BigDecimal getUserId() {
        return userId;
    }

    public void setUserId(BigDecimal userId) {
        this.userId = userId;
    }
}