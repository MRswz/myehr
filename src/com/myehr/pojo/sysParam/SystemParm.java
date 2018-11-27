package com.myehr.pojo.sysParam;

import java.math.BigDecimal;

public class SystemParm {
    private BigDecimal parmId;

    private String parmName;

    private String parmPrice;

    private String parmExplain;

    private String parmType;

    public BigDecimal getParmId() {
        return parmId;
    }

    public void setParmId(BigDecimal parmId) {
        this.parmId = parmId;
    }

    public String getParmName() {
        return parmName;
    }

    public void setParmName(String parmName) {
        this.parmName = parmName == null ? null : parmName.trim();
    }

    public String getParmPrice() {
        return parmPrice;
    }

    public void setParmPrice(String parmPrice) {
        this.parmPrice = parmPrice == null ? null : parmPrice.trim();
    }

    public String getParmExplain() {
        return parmExplain;
    }

    public void setParmExplain(String parmExplain) {
        this.parmExplain = parmExplain == null ? null : parmExplain.trim();
    }

    public String getParmType() {
        return parmType;
    }

    public void setParmType(String parmType) {
        this.parmType = parmType == null ? null : parmType.trim();
    }
}