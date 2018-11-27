package com.myehr.pojo.formmanage.form;

import java.io.Serializable;

public class SysFormShowInfo implements Serializable{
	private static final long serialVersionUID = 1L;
    private Long id;

    private String formType;
    
    private String formFunction;

    private String formPic;

    private String formTag;

    private String formTypeName;

    private String formTypeCode;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFormType() {
        return formType;
    }

    public void setFormType(String formType) {
        this.formType = formType == null ? null : formType.trim();
    }

    public String getFormFunction() {
        return formFunction;
    }

    public void setFormFunction(String formFunction) {
        this.formFunction = formFunction == null ? null : formFunction.trim();
    }

    public String getFormPic() {
        return formPic;
    }

    public void setFormPic(String formPic) {
        this.formPic = formPic == null ? null : formPic.trim();
    }

    public String getFormTag() {
        return formTag;
    }

    public void setFormTag(String formTag) {
        this.formTag = formTag == null ? null : formTag.trim();
    }

    public String getFormTypeName() {
        return formTypeName;
    }

    public void setFormTypeName(String formTypeName) {
        this.formTypeName = formTypeName == null ? null : formTypeName.trim();
    }

    public String getFormTypeCode() {
        return formTypeCode;
    }

    public void setFormTypeCode(String formTypeCode) {
        this.formTypeCode = formTypeCode == null ? null : formTypeCode.trim();
    }
}