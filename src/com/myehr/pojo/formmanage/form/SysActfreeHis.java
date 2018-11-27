package com.myehr.pojo.formmanage.form;

import java.io.Serializable;
import java.util.Date;

public class SysActfreeHis implements Serializable{
	private static final long serialVersionUID = 1L;
    private Integer id;

    private String taskid;

    private String assigree;

    private Date starttime;

    private Date endtime;

    private String title;

    private String nextassigree;

    private String result;

    private String coment;

    private String statusa;

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

    public String getAssigree() {
        return assigree;
    }

    public void setAssigree(String assigree) {
        this.assigree = assigree == null ? null : assigree.trim();
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getNextassigree() {
        return nextassigree;
    }

    public void setNextassigree(String nextassigree) {
        this.nextassigree = nextassigree == null ? null : nextassigree.trim();
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result == null ? null : result.trim();
    }

    public String getComent() {
        return coment;
    }

    public void setComent(String coment) {
        this.coment = coment == null ? null : coment.trim();
    }

    public String getStatusa() {
        return statusa;
    }

    public void setStatusa(String statusa) {
        this.statusa = statusa == null ? null : statusa.trim();
    }
}