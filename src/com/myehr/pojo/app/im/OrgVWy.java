package com.myehr.pojo.app.im;

public class OrgVWy {
    private String id;

    private String cname;

    private String ename;

    private String parentid;

    private String xtype;

    private Integer xorder;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
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

    public String getParentid() {
        return parentid;
    }

    public void setParentid(String parentid) {
        this.parentid = parentid == null ? null : parentid.trim();
    }

    public String getXtype() {
        return xtype;
    }

    public void setXtype(String xtype) {
        this.xtype = xtype == null ? null : xtype.trim();
    }

    public Integer getXorder() {
        return xorder;
    }

    public void setXorder(Integer xorder) {
        this.xorder = xorder;
    }
}