package com.myehr.pojo.sysCvr;

import java.util.Date;

public class SysCvr {
    private Integer id;

    private String peopleName;

    private String peopleSex;

    private String peopleNation;

    private Date peopleBirthday;

    private String peopleAddress;

    private String peopleIdCode;

    private String department;

    private String startDate;

    private String endDate;

    private String cvrSamid;

    private String peopleMessage;

    private Date readDate;

    private byte[] peoplePicture;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPeopleName() {
        return peopleName;
    }

    public void setPeopleName(String peopleName) {
        this.peopleName = peopleName == null ? null : peopleName.trim();
    }

    public String getPeopleSex() {
        return peopleSex;
    }

    public void setPeopleSex(String peopleSex) {
        this.peopleSex = peopleSex == null ? null : peopleSex.trim();
    }

    public String getPeopleNation() {
        return peopleNation;
    }

    public void setPeopleNation(String peopleNation) {
        this.peopleNation = peopleNation == null ? null : peopleNation.trim();
    }

    public Date getPeopleBirthday() {
        return peopleBirthday;
    }

    public void setPeopleBirthday(Date peopleBirthday) {
        this.peopleBirthday = peopleBirthday;
    }

    public String getPeopleAddress() {
        return peopleAddress;
    }

    public void setPeopleAddress(String peopleAddress) {
        this.peopleAddress = peopleAddress == null ? null : peopleAddress.trim();
    }

    public String getPeopleIdCode() {
        return peopleIdCode;
    }

    public void setPeopleIdCode(String peopleIdCode) {
        this.peopleIdCode = peopleIdCode == null ? null : peopleIdCode.trim();
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate == null ? null : startDate.trim();
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate == null ? null : endDate.trim();
    }

    public String getCvrSamid() {
        return cvrSamid;
    }

    public void setCvrSamid(String cvrSamid) {
        this.cvrSamid = cvrSamid == null ? null : cvrSamid.trim();
    }

    public String getPeopleMessage() {
        return peopleMessage;
    }

    public void setPeopleMessage(String peopleMessage) {
        this.peopleMessage = peopleMessage == null ? null : peopleMessage.trim();
    }

    public Date getReadDate() {
        return readDate;
    }

    public void setReadDate(Date readDate) {
        this.readDate = readDate;
    }

    public byte[] getPeoplePicture() {
        return peoplePicture;
    }

    public void setPeoplePicture(byte[] peoplePicture) {
        this.peoplePicture = peoplePicture;
    }
}