package com.myehr.pojo.lang;

public class SysLang {
    private String langCode;

    private String en;

    private String zh;

    private String euc;

    private String big5;

    private String langType;

    public String getLangCode() {
        return langCode;
    }

    public void setLangCode(String langCode) {
        this.langCode = langCode == null ? null : langCode.trim();
    }

    public String getEn() {
        return en;
    }

    public void setEn(String en) {
        this.en = en == null ? null : en.trim();
    }

    public String getZh() {
        return zh;
    }

    public void setZh(String zh) {
        this.zh = zh == null ? null : zh.trim();
    }

    public String getEuc() {
        return euc;
    }

    public void setEuc(String euc) {
        this.euc = euc == null ? null : euc.trim();
    }

    public String getBig5() {
        return big5;
    }

    public void setBig5(String big5) {
        this.big5 = big5 == null ? null : big5.trim();
    }

    public String getLangType() {
        return langType;
    }

    public void setLangType(String langType) {
        this.langType = langType == null ? null : langType.trim();
    }
}