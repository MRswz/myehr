package com.myehr.pojo.sysuser;

import java.util.Date;

public class ApproveAccredit {
    private Long approveAccreditId;

    private Long approveUserId;

    private Long authorizerUserId;

    private String authorizationState;

    private Date authorizationTime;

    private Date failureTime;

    public Long getApproveAccreditId() {
        return approveAccreditId;
    }

    public void setApproveAccreditId(Long approveAccreditId) {
        this.approveAccreditId = approveAccreditId;
    }

    public Long getApproveUserId() {
        return approveUserId;
    }

    public void setApproveUserId(Long approveUserId) {
        this.approveUserId = approveUserId;
    }

    public Long getAuthorizerUserId() {
        return authorizerUserId;
    }

    public void setAuthorizerUserId(Long authorizerUserId) {
        this.authorizerUserId = authorizerUserId;
    }

    public String getAuthorizationState() {
        return authorizationState;
    }

    public void setAuthorizationState(String authorizationState) {
        this.authorizationState = authorizationState == null ? null : authorizationState.trim();
    }

    public Date getAuthorizationTime() {
        return authorizationTime;
    }

    public void setAuthorizationTime(Date authorizationTime) {
        this.authorizationTime = authorizationTime;
    }

    public Date getFailureTime() {
        return failureTime;
    }

    public void setFailureTime(Date failureTime) {
        this.failureTime = failureTime;
    }
}