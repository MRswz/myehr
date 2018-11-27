package com.myehr.pojo.formmanage.form;

import java.io.Serializable;
import java.util.Date;

public class SysActfreeModel implements Serializable{
	private static final long serialVersionUID = 1L;
    private String modelid;

    private String modelkey;

    private String modelname;

    private String formid;

    private String modeltype;

    private String createname;

    private Date createtime;

    public String getModelid() {
        return modelid;
    }

    public void setModelid(String modelid) {
        this.modelid = modelid == null ? null : modelid.trim();
    }

    public String getModelkey() {
        return modelkey;
    }

    public void setModelkey(String modelkey) {
        this.modelkey = modelkey == null ? null : modelkey.trim();
    }

    public String getModelname() {
        return modelname;
    }

    public void setModelname(String modelname) {
        this.modelname = modelname == null ? null : modelname.trim();
    }

    public String getFormid() {
        return formid;
    }

    public void setFormid(String formid) {
        this.formid = formid == null ? null : formid.trim();
    }

    public String getModeltype() {
        return modeltype;
    }

    public void setModeltype(String modeltype) {
        this.modeltype = modeltype == null ? null : modeltype.trim();
    }

    public String getCreatename() {
        return createname;
    }

    public void setCreatename(String createname) {
        this.createname = createname == null ? null : createname.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}