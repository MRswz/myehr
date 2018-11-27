package com.myehr.pojo.task;

import java.util.Date;

public class SysTask {
    private Long sysTaskId;

    private Long sysTaskEmpid;

    private String sysTaskStatus;

    private String sysAttachingTask;

    private String sysAttachingProject;

    private String sysTaskIdentifier;

    private String sysTaskType;

    private String sysTaskFormid;

    private String sysTaskCreateUserid;

    private Date sysTaskCreateTime;

    private Long sysTaskCompleteUserid;

    private Date sysTaskCompleteTime;

    private Long sysTaskEvaluator;

    private Date sysTaskEvaluationTime;

    private String sysTaskEvaluationInfo;

    private String sysTaskUrgency;

    private String sysTaskImportance;

    private String sysTaskContent;

    private Date sysTaskCalenderStart;

    private Date sysTaskCalenderEnd;

    private String procTaskId;

    private String procInsId;

    private String procBusinessId;

    private Long procFormId;

    private String formLable;

    private Integer formRecorid;

    private Integer sysState;

    private String sysTitle;

    public Long getSysTaskId() {
        return sysTaskId;
    }

    public void setSysTaskId(Long sysTaskId) {
        this.sysTaskId = sysTaskId;
    }

    public Long getSysTaskEmpid() {
        return sysTaskEmpid;
    }

    public void setSysTaskEmpid(Long sysTaskEmpid) {
        this.sysTaskEmpid = sysTaskEmpid;
    }

    public String getSysTaskStatus() {
        return sysTaskStatus;
    }

    public void setSysTaskStatus(String sysTaskStatus) {
        this.sysTaskStatus = sysTaskStatus == null ? null : sysTaskStatus.trim();
    }

    public String getSysAttachingTask() {
        return sysAttachingTask;
    }

    public void setSysAttachingTask(String sysAttachingTask) {
        this.sysAttachingTask = sysAttachingTask == null ? null : sysAttachingTask.trim();
    }

    public String getSysAttachingProject() {
        return sysAttachingProject;
    }

    public void setSysAttachingProject(String sysAttachingProject) {
        this.sysAttachingProject = sysAttachingProject == null ? null : sysAttachingProject.trim();
    }

    public String getSysTaskIdentifier() {
        return sysTaskIdentifier;
    }

    public void setSysTaskIdentifier(String sysTaskIdentifier) {
        this.sysTaskIdentifier = sysTaskIdentifier == null ? null : sysTaskIdentifier.trim();
    }

    public String getSysTaskType() {
        return sysTaskType;
    }

    public void setSysTaskType(String sysTaskType) {
        this.sysTaskType = sysTaskType == null ? null : sysTaskType.trim();
    }

    public String getSysTaskFormid() {
        return sysTaskFormid;
    }

    public void setSysTaskFormid(String sysTaskFormid) {
        this.sysTaskFormid = sysTaskFormid == null ? null : sysTaskFormid.trim();
    }

    public String getSysTaskCreateUserid() {
        return sysTaskCreateUserid;
    }

    public void setSysTaskCreateUserid(String sysTaskCreateUserid) {
        this.sysTaskCreateUserid = sysTaskCreateUserid == null ? null : sysTaskCreateUserid.trim();
    }

    public Date getSysTaskCreateTime() {
        return sysTaskCreateTime;
    }

    public void setSysTaskCreateTime(Date sysTaskCreateTime) {
        this.sysTaskCreateTime = sysTaskCreateTime;
    }

    public Long getSysTaskCompleteUserid() {
        return sysTaskCompleteUserid;
    }

    public void setSysTaskCompleteUserid(Long sysTaskCompleteUserid) {
        this.sysTaskCompleteUserid = sysTaskCompleteUserid;
    }

    public Date getSysTaskCompleteTime() {
        return sysTaskCompleteTime;
    }

    public void setSysTaskCompleteTime(Date sysTaskCompleteTime) {
        this.sysTaskCompleteTime = sysTaskCompleteTime;
    }

    public Long getSysTaskEvaluator() {
        return sysTaskEvaluator;
    }

    public void setSysTaskEvaluator(Long sysTaskEvaluator) {
        this.sysTaskEvaluator = sysTaskEvaluator;
    }

    public Date getSysTaskEvaluationTime() {
        return sysTaskEvaluationTime;
    }

    public void setSysTaskEvaluationTime(Date sysTaskEvaluationTime) {
        this.sysTaskEvaluationTime = sysTaskEvaluationTime;
    }

    public String getSysTaskEvaluationInfo() {
        return sysTaskEvaluationInfo;
    }

    public void setSysTaskEvaluationInfo(String sysTaskEvaluationInfo) {
        this.sysTaskEvaluationInfo = sysTaskEvaluationInfo == null ? null : sysTaskEvaluationInfo.trim();
    }

    public String getSysTaskUrgency() {
        return sysTaskUrgency;
    }

    public void setSysTaskUrgency(String sysTaskUrgency) {
        this.sysTaskUrgency = sysTaskUrgency == null ? null : sysTaskUrgency.trim();
    }

    public String getSysTaskImportance() {
        return sysTaskImportance;
    }

    public void setSysTaskImportance(String sysTaskImportance) {
        this.sysTaskImportance = sysTaskImportance == null ? null : sysTaskImportance.trim();
    }

    public String getSysTaskContent() {
        return sysTaskContent;
    }

    public void setSysTaskContent(String sysTaskContent) {
        this.sysTaskContent = sysTaskContent == null ? null : sysTaskContent.trim();
    }

    public Date getSysTaskCalenderStart() {
        return sysTaskCalenderStart;
    }

    public void setSysTaskCalenderStart(Date sysTaskCalenderStart) {
        this.sysTaskCalenderStart = sysTaskCalenderStart;
    }

    public Date getSysTaskCalenderEnd() {
        return sysTaskCalenderEnd;
    }

    public void setSysTaskCalenderEnd(Date sysTaskCalenderEnd) {
        this.sysTaskCalenderEnd = sysTaskCalenderEnd;
    }

    public String getProcTaskId() {
        return procTaskId;
    }

    public void setProcTaskId(String procTaskId) {
        this.procTaskId = procTaskId == null ? null : procTaskId.trim();
    }

    public String getProcInsId() {
        return procInsId;
    }

    public void setProcInsId(String procInsId) {
        this.procInsId = procInsId == null ? null : procInsId.trim();
    }

    public String getProcBusinessId() {
        return procBusinessId;
    }

    public void setProcBusinessId(String procBusinessId) {
        this.procBusinessId = procBusinessId == null ? null : procBusinessId.trim();
    }

    public Long getProcFormId() {
        return procFormId;
    }

    public void setProcFormId(Long procFormId) {
        this.procFormId = procFormId;
    }

    public String getFormLable() {
        return formLable;
    }

    public void setFormLable(String formLable) {
        this.formLable = formLable == null ? null : formLable.trim();
    }

    public Integer getFormRecorid() {
        return formRecorid;
    }

    public void setFormRecorid(Integer formRecorid) {
        this.formRecorid = formRecorid;
    }

    public Integer getSysState() {
        return sysState;
    }

    public void setSysState(Integer sysState) {
        this.sysState = sysState;
    }

    public String getSysTitle() {
        return sysTitle;
    }

    public void setSysTitle(String sysTitle) {
        this.sysTitle = sysTitle == null ? null : sysTitle.trim();
    }
}