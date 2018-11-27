package com.myehr.pojo.task;

import java.util.Date;

public class SysTimer {
    private Long sysTimerId;

    private String sysTimerType;

    private String sysTimerFrequency;

    private Integer sysTimerRepeatValue;

    private Integer sysTimerStatus;

    private String sysTimerName;

    private String sysTimerExecType;

    private String sysTimerIsRepeat;

    private String sysTimerRepeatType;

    private Integer sysTimerExecSqlId;

    private Date sysTimerStartTime;

    private Date sysTimerEndTime;

    private String sysTimerDelayedValue;

    private String sysTimerDelayedType;

    public Long getSysTimerId() {
        return sysTimerId;
    }

    public void setSysTimerId(Long sysTimerId) {
        this.sysTimerId = sysTimerId;
    }

    public String getSysTimerType() {
        return sysTimerType;
    }

    public void setSysTimerType(String sysTimerType) {
        this.sysTimerType = sysTimerType == null ? null : sysTimerType.trim();
    }

    public String getSysTimerFrequency() {
        return sysTimerFrequency;
    }

    public void setSysTimerFrequency(String sysTimerFrequency) {
        this.sysTimerFrequency = sysTimerFrequency == null ? null : sysTimerFrequency.trim();
    }

    public Integer getSysTimerRepeatValue() {
        return sysTimerRepeatValue;
    }

    public void setSysTimerRepeatValue(Integer sysTimerRepeatValue) {
        this.sysTimerRepeatValue = sysTimerRepeatValue;
    }

    public Integer getSysTimerStatus() {
        return sysTimerStatus;
    }

    public void setSysTimerStatus(Integer sysTimerStatus) {
        this.sysTimerStatus = sysTimerStatus;
    }

    public String getSysTimerName() {
        return sysTimerName;
    }

    public void setSysTimerName(String sysTimerName) {
        this.sysTimerName = sysTimerName == null ? null : sysTimerName.trim();
    }

    public String getSysTimerExecType() {
        return sysTimerExecType;
    }

    public void setSysTimerExecType(String sysTimerExecType) {
        this.sysTimerExecType = sysTimerExecType == null ? null : sysTimerExecType.trim();
    }

    public String getSysTimerIsRepeat() {
        return sysTimerIsRepeat;
    }

    public void setSysTimerIsRepeat(String sysTimerIsRepeat) {
        this.sysTimerIsRepeat = sysTimerIsRepeat == null ? null : sysTimerIsRepeat.trim();
    }

    public String getSysTimerRepeatType() {
        return sysTimerRepeatType;
    }

    public void setSysTimerRepeatType(String sysTimerRepeatType) {
        this.sysTimerRepeatType = sysTimerRepeatType == null ? null : sysTimerRepeatType.trim();
    }

    public Integer getSysTimerExecSqlId() {
        return sysTimerExecSqlId;
    }

    public void setSysTimerExecSqlId(Integer sysTimerExecSqlId) {
        this.sysTimerExecSqlId = sysTimerExecSqlId;
    }

    public Date getSysTimerStartTime() {
        return sysTimerStartTime;
    }

    public void setSysTimerStartTime(Date sysTimerStartTime) {
        this.sysTimerStartTime = sysTimerStartTime;
    }

    public Date getSysTimerEndTime() {
        return sysTimerEndTime;
    }

    public void setSysTimerEndTime(Date sysTimerEndTime) {
        this.sysTimerEndTime = sysTimerEndTime;
    }

    public String getSysTimerDelayedValue() {
        return sysTimerDelayedValue;
    }

    public void setSysTimerDelayedValue(String sysTimerDelayedValue) {
        this.sysTimerDelayedValue = sysTimerDelayedValue == null ? null : sysTimerDelayedValue.trim();
    }

    public String getSysTimerDelayedType() {
        return sysTimerDelayedType;
    }

    public void setSysTimerDelayedType(String sysTimerDelayedType) {
        this.sysTimerDelayedType = sysTimerDelayedType == null ? null : sysTimerDelayedType.trim();
    }
}