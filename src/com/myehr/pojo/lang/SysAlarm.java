package com.myehr.pojo.lang;

public class SysAlarm {
    private Integer id;

    private String cname;

    private String ename;

    private Integer xlevel;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname == null ? null : cname.trim();
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename == null ? null : ename.trim();
    }

    public Integer getXlevel() {
        return xlevel;
    }

    public void setXlevel(Integer xlevel) {
        this.xlevel = xlevel;
    }
}