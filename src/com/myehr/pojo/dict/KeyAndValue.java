package com.myehr.pojo.dict;

public class KeyAndValue {
	

	private String value;
	private String text;
	
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }
   

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text == null ? null : text.trim();
    }
}
