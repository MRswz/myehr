package com.myehr.pojo.calendar;

import java.math.BigDecimal;

public class AttendShifttype {
    private Integer asId;

    private String asCode;

    private String asCname;

    private String asEname;

    private BigDecimal asWorktimes;

    private String asBegintime1;

    private String asEndtime1;

    private String asBegintime2;

    private String asEndtime2;

    private Integer asCardtimes;

    private String asScanbegintime;

    private String asScanendtime;

    private Integer asLatemiu;

    private Integer asLateabs;

    private Integer asEarlymiu;

    private Integer asEarlabs;

    private Integer asFlextime;

    private Integer asHolidyot3;

    private Integer asValid;

    private String asRemark;

    private String restdate;

    public Integer getAsId() {
        return asId;
    }

    public void setAsId(Integer asId) {
        this.asId = asId;
    }

    public String getAsCode() {
        return asCode;
    }

    public void setAsCode(String asCode) {
        this.asCode = asCode == null ? null : asCode.trim();
    }

    public String getAsCname() {
        return asCname;
    }

    public void setAsCname(String asCname) {
        this.asCname = asCname == null ? null : asCname.trim();
    }

    public String getAsEname() {
        return asEname;
    }

    public void setAsEname(String asEname) {
        this.asEname = asEname == null ? null : asEname.trim();
    }

    public BigDecimal getAsWorktimes() {
        return asWorktimes;
    }

    public void setAsWorktimes(BigDecimal asWorktimes) {
        this.asWorktimes = asWorktimes;
    }

    public String getAsBegintime1() {
        return asBegintime1;
    }

    public void setAsBegintime1(String asBegintime1) {
        this.asBegintime1 = asBegintime1 == null ? null : asBegintime1.trim();
    }

    public String getAsEndtime1() {
        return asEndtime1;
    }

    public void setAsEndtime1(String asEndtime1) {
        this.asEndtime1 = asEndtime1 == null ? null : asEndtime1.trim();
    }

    public String getAsBegintime2() {
        return asBegintime2;
    }

    public void setAsBegintime2(String asBegintime2) {
        this.asBegintime2 = asBegintime2 == null ? null : asBegintime2.trim();
    }

    public String getAsEndtime2() {
        return asEndtime2;
    }

    public void setAsEndtime2(String asEndtime2) {
        this.asEndtime2 = asEndtime2 == null ? null : asEndtime2.trim();
    }

    public Integer getAsCardtimes() {
        return asCardtimes;
    }

    public void setAsCardtimes(Integer asCardtimes) {
        this.asCardtimes = asCardtimes;
    }

    public String getAsScanbegintime() {
        return asScanbegintime;
    }

    public void setAsScanbegintime(String asScanbegintime) {
        this.asScanbegintime = asScanbegintime == null ? null : asScanbegintime.trim();
    }

    public String getAsScanendtime() {
        return asScanendtime;
    }

    public void setAsScanendtime(String asScanendtime) {
        this.asScanendtime = asScanendtime == null ? null : asScanendtime.trim();
    }

    public Integer getAsLatemiu() {
        return asLatemiu;
    }

    public void setAsLatemiu(Integer asLatemiu) {
        this.asLatemiu = asLatemiu;
    }

    public Integer getAsLateabs() {
        return asLateabs;
    }

    public void setAsLateabs(Integer asLateabs) {
        this.asLateabs = asLateabs;
    }

    public Integer getAsEarlymiu() {
        return asEarlymiu;
    }

    public void setAsEarlymiu(Integer asEarlymiu) {
        this.asEarlymiu = asEarlymiu;
    }

    public Integer getAsEarlabs() {
        return asEarlabs;
    }

    public void setAsEarlabs(Integer asEarlabs) {
        this.asEarlabs = asEarlabs;
    }

    public Integer getAsFlextime() {
        return asFlextime;
    }

    public void setAsFlextime(Integer asFlextime) {
        this.asFlextime = asFlextime;
    }

    public Integer getAsHolidyot3() {
        return asHolidyot3;
    }

    public void setAsHolidyot3(Integer asHolidyot3) {
        this.asHolidyot3 = asHolidyot3;
    }

    public Integer getAsValid() {
        return asValid;
    }

    public void setAsValid(Integer asValid) {
        this.asValid = asValid;
    }

    public String getAsRemark() {
        return asRemark;
    }

    public void setAsRemark(String asRemark) {
        this.asRemark = asRemark == null ? null : asRemark.trim();
    }

    public String getRestdate() {
        return restdate;
    }

    public void setRestdate(String restdate) {
        this.restdate = restdate == null ? null : restdate.trim();
    }
}