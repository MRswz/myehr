package com.myehr.pojo.formmanage.button;

import java.util.Date;

public class SysMailsend {
    private Integer id;

    private Integer counttimes;

    private Date sendtime;

    private String feedback;

    private String mailto;

    private String maillcc;

    private String mailbc;

    private String mailtitle;

    private String attachments;

    private Integer result;

    private String mailcontent;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCounttimes() {
        return counttimes;
    }

    public void setCounttimes(Integer counttimes) {
        this.counttimes = counttimes;
    }

    public Date getSendtime() {
        return sendtime;
    }

    public void setSendtime(Date sendtime) {
        this.sendtime = sendtime;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback == null ? null : feedback.trim();
    }

    public String getMailto() {
        return mailto;
    }

    public void setMailto(String mailto) {
        this.mailto = mailto == null ? null : mailto.trim();
    }

    public String getMaillcc() {
        return maillcc;
    }

    public void setMaillcc(String maillcc) {
        this.maillcc = maillcc == null ? null : maillcc.trim();
    }

    public String getMailbc() {
        return mailbc;
    }

    public void setMailbc(String mailbc) {
        this.mailbc = mailbc == null ? null : mailbc.trim();
    }

    public String getMailtitle() {
        return mailtitle;
    }

    public void setMailtitle(String mailtitle) {
        this.mailtitle = mailtitle == null ? null : mailtitle.trim();
    }

    public String getAttachments() {
        return attachments;
    }

    public void setAttachments(String attachments) {
        this.attachments = attachments == null ? null : attachments.trim();
    }

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }

    public String getMailcontent() {
        return mailcontent;
    }

    public void setMailcontent(String mailcontent) {
        this.mailcontent = mailcontent == null ? null : mailcontent.trim();
    }
}