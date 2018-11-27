package com.myehr.pojo.formmanage.form;

import java.io.Serializable;
import java.util.Date;

public class SysActfreeConduct implements Serializable{
	private static final long serialVersionUID = 1L;
    private Integer id;

    private String taskid;

    private String assignee;

    private Date overtime;

    private String title;

    private String nextassignee;

    private String orderby;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTaskid() {
        return taskid;
    }

    public void setTaskid(String taskid) {
        this.taskid = taskid == null ? null : taskid.trim();
    }

    public String getAssignee() {
        return assignee;
    }

    public void setAssignee(String assignee) {
        this.assignee = assignee == null ? null : assignee.trim();
    }

    public Date getOvertime() {
        return overtime;
    }

    public void setOvertime(Date overtime) {
        this.overtime = overtime;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getNextassignee() {
        return nextassignee;
    }

    public void setNextassignee(String nextassignee) {
        this.nextassignee = nextassignee == null ? null : nextassignee.trim();
    }

    public String getOrderby() {
        return orderby;
    }

    public void setOrderby(String orderby) {
        this.orderby = orderby == null ? null : orderby.trim();
    }
}