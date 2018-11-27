package com.myehr.pojo.app.im;

import java.util.Date;

public class SysImInformationRecord {
    private Integer id;

    private Integer messagetype;

    private String sendto;

    private String sendfrom;

    private Integer sendstatus;

    private String messagetitle;

    private String messagecontent;

    private Date isreadtime;

    private Integer counttimes;

    private String falsereason;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMessagetype() {
        return messagetype;
    }

    public void setMessagetype(Integer messagetype) {
        this.messagetype = messagetype;
    }

    public String getSendto() {
        return sendto;
    }

    public void setSendto(String sendto) {
        this.sendto = sendto == null ? null : sendto.trim();
    }

    public String getSendfrom() {
        return sendfrom;
    }

    public void setSendfrom(String sendfrom) {
        this.sendfrom = sendfrom == null ? null : sendfrom.trim();
    }

    public Integer getSendstatus() {
        return sendstatus;
    }

    public void setSendstatus(Integer sendstatus) {
        this.sendstatus = sendstatus;
    }

    public String getMessagetitle() {
        return messagetitle;
    }

    public void setMessagetitle(String messagetitle) {
        this.messagetitle = messagetitle == null ? null : messagetitle.trim();
    }

    public String getMessagecontent() {
        return messagecontent;
    }

    public void setMessagecontent(String messagecontent) {
        this.messagecontent = messagecontent == null ? null : messagecontent.trim();
    }

    public Date getIsreadtime() {
        return isreadtime;
    }

    public void setIsreadtime(Date isreadtime) {
        this.isreadtime = isreadtime;
    }

    public Integer getCounttimes() {
        return counttimes;
    }

    public void setCounttimes(Integer counttimes) {
        this.counttimes = counttimes;
    }

    public String getFalsereason() {
        return falsereason;
    }

    public void setFalsereason(String falsereason) {
        this.falsereason = falsereason == null ? null : falsereason.trim();
    }
}