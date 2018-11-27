package com.myehr.pojo.formmanage.form;

import java.io.Serializable;

public class SysHeightgrade implements Serializable{
	private static final long serialVersionUID = 1L;
    private Integer id;

    private Integer formid;

    private String connection;

    private String leftparenthesis;

    private String field;

    private String filter;

    private String filtervalue;

    private String orderby;

    private String rightparenthesis;

    private Integer nameid;

    private Integer uid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFormid() {
        return formid;
    }

    public void setFormid(Integer formid) {
        this.formid = formid;
    }

    public String getConnection() {
        return connection;
    }

    public void setConnection(String connection) {
        this.connection = connection == null ? null : connection.trim();
    }

    public String getLeftparenthesis() {
        return leftparenthesis;
    }

    public void setLeftparenthesis(String leftparenthesis) {
        this.leftparenthesis = leftparenthesis == null ? null : leftparenthesis.trim();
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field == null ? null : field.trim();
    }

    public String getFilter() {
        return filter;
    }

    public void setFilter(String filter) {
        this.filter = filter == null ? null : filter.trim();
    }

    public String getFiltervalue() {
        return filtervalue;
    }

    public void setFiltervalue(String filtervalue) {
        this.filtervalue = filtervalue == null ? null : filtervalue.trim();
    }

    public String getOrderby() {
        return orderby;
    }

    public void setOrderby(String orderby) {
        this.orderby = orderby == null ? null : orderby.trim();
    }

    public String getRightparenthesis() {
        return rightparenthesis;
    }

    public void setRightparenthesis(String rightparenthesis) {
        this.rightparenthesis = rightparenthesis == null ? null : rightparenthesis.trim();
    }

    public Integer getNameid() {
        return nameid;
    }

    public void setNameid(Integer nameid) {
        this.nameid = nameid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }
}