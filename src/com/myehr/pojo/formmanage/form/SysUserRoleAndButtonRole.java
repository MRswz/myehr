package com.myehr.pojo.formmanage.form;

import java.math.BigDecimal;

public class SysUserRoleAndButtonRole extends SysButtonRole{
    private BigDecimal userRoleId;

    private BigDecimal userId;

    private String userRoleReferRemakr;

    public BigDecimal getUserRoleId() {
        return userRoleId;
    }

    public void setUserRoleId(BigDecimal userRoleId) {
        this.userRoleId = userRoleId;
    }

    public BigDecimal getUserId() {
        return userId;
    }

    public void setUserId(BigDecimal userId) {
        this.userId = userId;
    }

    public String getUserRoleReferRemakr() {
        return userRoleReferRemakr;
    }

    public void setUserRoleReferRemakr(String userRoleReferRemakr) {
        this.userRoleReferRemakr = userRoleReferRemakr == null ? null : userRoleReferRemakr.trim();
    }

}