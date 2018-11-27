package com.myehr.pojo.formmanage.form;

import java.math.BigDecimal;
import java.util.Date;

public class SysReply {
    private BigDecimal replyId;

    private String replyName;

    private BigDecimal evaluationId;

    private String replyContent;

    private Date replyTime;

    public BigDecimal getReplyId() {
        return replyId;
    }

    public void setReplyId(BigDecimal replyId) {
        this.replyId = replyId;
    }

    public String getReplyName() {
        return replyName;
    }

    public void setReplyName(String replyName) {
        this.replyName = replyName == null ? null : replyName.trim();
    }

    public BigDecimal getEvaluationId() {
        return evaluationId;
    }

    public void setEvaluationId(BigDecimal evaluationId) {
        this.evaluationId = evaluationId;
    }

    public String getReplyContent() {
        return replyContent;
    }

    public void setReplyContent(String replyContent) {
        this.replyContent = replyContent == null ? null : replyContent.trim();
    }

    public Date getReplyTime() {
        return replyTime;
    }

    public void setReplyTime(Date replyTime) {
        this.replyTime = replyTime;
    }
}