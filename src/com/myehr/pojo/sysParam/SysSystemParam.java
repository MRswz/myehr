package com.myehr.pojo.sysParam;

import java.io.Serializable;

public class SysSystemParam  implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    private Long sysParamId;

    private String sysParamType;

    private String sysParamCode;

    private String sysParamEntry;

    private String sysParamValue1;

    private String sysParamValue2;

    private String sysParamRemark;

    public Long getSysParamId() {
        return sysParamId;
    }

    public void setSysParamId(Long sysParamId) {
        this.sysParamId = sysParamId;
    }

    public String getSysParamType() {
        return sysParamType;
    }

    public void setSysParamType(String sysParamType) {
        this.sysParamType = sysParamType == null ? null : sysParamType.trim();
    }

    public String getSysParamCode() {
        return sysParamCode;
    }

    public void setSysParamCode(String sysParamCode) {
        this.sysParamCode = sysParamCode == null ? null : sysParamCode.trim();
    }

    public String getSysParamEntry() {
        return sysParamEntry;
    }

    public void setSysParamEntry(String sysParamEntry) {
        this.sysParamEntry = sysParamEntry == null ? null : sysParamEntry.trim();
    }

    public String getSysParamValue1() {
        return sysParamValue1;
    }

    public void setSysParamValue1(String sysParamValue1) {
        this.sysParamValue1 = sysParamValue1 == null ? null : sysParamValue1.trim();
    }

    public String getSysParamValue2() {
        return sysParamValue2;
    }

    public void setSysParamValue2(String sysParamValue2) {
        this.sysParamValue2 = sysParamValue2 == null ? null : sysParamValue2.trim();
    }

    public String getSysParamRemark() {
        return sysParamRemark;
    }

    public void setSysParamRemark(String sysParamRemark) {
        this.sysParamRemark = sysParamRemark == null ? null : sysParamRemark.trim();
    }
}