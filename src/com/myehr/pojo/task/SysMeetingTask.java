package com.myehr.pojo.task;

import java.util.Date;

public class SysMeetingTask {
    private Long sysMeetingTaskId;

    private Long sysTaskId;

    private String sysTaskTitle;

    private Long sysTaskCreateUserid;

    private Date sysTaskCreateTime;

    private Date sysMeetingTaskStart;

    private Date sysMeetingTaskEnd;

    private String sysMeetingTaskHostid;

    private String sysMeetingTaskChildren;

    private String sysMeetingTaskParticipants;

    public Long getSysMeetingTaskId() {
        return sysMeetingTaskId;
    }

    public void setSysMeetingTaskId(Long sysMeetingTaskId) {
        this.sysMeetingTaskId = sysMeetingTaskId;
    }

    public Long getSysTaskId() {
        return sysTaskId;
    }

    public void setSysTaskId(Long sysTaskId) {
        this.sysTaskId = sysTaskId;
    }

    public String getSysTaskTitle() {
        return sysTaskTitle;
    }

    public void setSysTaskTitle(String sysTaskTitle) {
        this.sysTaskTitle = sysTaskTitle == null ? null : sysTaskTitle.trim();
    }

    public Long getSysTaskCreateUserid() {
        return sysTaskCreateUserid;
    }

    public void setSysTaskCreateUserid(Long sysTaskCreateUserid) {
        this.sysTaskCreateUserid = sysTaskCreateUserid;
    }

    public Date getSysTaskCreateTime() {
        return sysTaskCreateTime;
    }

    public void setSysTaskCreateTime(Date sysTaskCreateTime) {
        this.sysTaskCreateTime = sysTaskCreateTime;
    }

    public Date getSysMeetingTaskStart() {
        return sysMeetingTaskStart;
    }

    public void setSysMeetingTaskStart(Date sysMeetingTaskStart) {
        this.sysMeetingTaskStart = sysMeetingTaskStart;
    }

    public Date getSysMeetingTaskEnd() {
        return sysMeetingTaskEnd;
    }

    public void setSysMeetingTaskEnd(Date sysMeetingTaskEnd) {
        this.sysMeetingTaskEnd = sysMeetingTaskEnd;
    }

    public String getSysMeetingTaskHostid() {
        return sysMeetingTaskHostid;
    }

    public void setSysMeetingTaskHostid(String sysMeetingTaskHostid) {
        this.sysMeetingTaskHostid = sysMeetingTaskHostid == null ? null : sysMeetingTaskHostid.trim();
    }

    public String getSysMeetingTaskChildren() {
        return sysMeetingTaskChildren;
    }

    public void setSysMeetingTaskChildren(String sysMeetingTaskChildren) {
        this.sysMeetingTaskChildren = sysMeetingTaskChildren == null ? null : sysMeetingTaskChildren.trim();
    }

    public String getSysMeetingTaskParticipants() {
        return sysMeetingTaskParticipants;
    }

    public void setSysMeetingTaskParticipants(String sysMeetingTaskParticipants) {
        this.sysMeetingTaskParticipants = sysMeetingTaskParticipants == null ? null : sysMeetingTaskParticipants.trim();
    }
}