package com.myehr.pojo.calendar;

import java.math.BigDecimal;

public class Kbasecode {
    private BigDecimal kbcId;

    private String itemName;

    private String typeCode;

    private String itemCode;

    private BigDecimal itemAlias;

    private Integer pinyinCode;

    private Integer basekind;

    private String kbasecode01;

    private String parentCode;

    public BigDecimal getKbcId() {
        return kbcId;
    }

    public void setKbcId(BigDecimal kbcId) {
        this.kbcId = kbcId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName == null ? null : itemName.trim();
    }

    public String getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode == null ? null : typeCode.trim();
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode == null ? null : itemCode.trim();
    }

    public BigDecimal getItemAlias() {
        return itemAlias;
    }

    public void setItemAlias(BigDecimal itemAlias) {
        this.itemAlias = itemAlias;
    }

    public Integer getPinyinCode() {
        return pinyinCode;
    }

    public void setPinyinCode(Integer pinyinCode) {
        this.pinyinCode = pinyinCode;
    }

    public Integer getBasekind() {
        return basekind;
    }

    public void setBasekind(Integer basekind) {
        this.basekind = basekind;
    }

    public String getKbasecode01() {
        return kbasecode01;
    }

    public void setKbasecode01(String kbasecode01) {
        this.kbasecode01 = kbasecode01 == null ? null : kbasecode01.trim();
    }

    public String getParentCode() {
        return parentCode;
    }

    public void setParentCode(String parentCode) {
        this.parentCode = parentCode == null ? null : parentCode.trim();
    }
}