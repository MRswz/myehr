package com.myehr.pojo.calendar;

public class Kcalendar extends KcalendarKey {
    private String itemCaption;

    public String getItemCaption() {
        return itemCaption;
    }

    public void setItemCaption(String itemCaption) {
        this.itemCaption = itemCaption == null ? null : itemCaption.trim();
    }
}