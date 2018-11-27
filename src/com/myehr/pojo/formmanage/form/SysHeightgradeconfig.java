package com.myehr.pojo.formmanage.form;

import java.io.Serializable;

public class SysHeightgradeconfig implements Serializable{
	private static final long serialVersionUID = 1L;
    private Integer id;

    private String programname;

    private String remarks;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProgramname() {
        return programname;
    }

    public void setProgramname(String programname) {
        this.programname = programname == null ? null : programname.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }
}