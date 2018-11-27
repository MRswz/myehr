package com.myehr.pojo.formmanage.form;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class SysFormconfigGrid implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private BigDecimal formGridId;

    private BigDecimal formGridFromId;

    private String formShowPager;

    private BigDecimal formPageSize;

    private String formPageSizeList;

    private String formIsIndex;

    private String formShowColumns;

    private String formEditNextOnEnter;

    private String formEditNextRowCell;

    private String formAllowResize;

    private String formAllowCellEdit;

    private String formAllowCellSelect;

    private String formMultiSelect;

    private String formRowClickButtonId;

    private String formRowDbclickButtonId;

    private Date operatorTime;

    private String operatorName;

    private String formShowTitle;

    private String formIndexWidth;

    private String formMultiWidth;

    private BigDecimal formFrozen;

    private String formGridHeight;

    private String formTableIsHandsontable;

    private String formHeaderIsShow;

    private String formBorderShowType;

    private String formIsCheckbox;

    public BigDecimal getFormGridId() {
        return formGridId;
    }

    public void setFormGridId(BigDecimal formGridId) {
        this.formGridId = formGridId;
    }

    public BigDecimal getFormGridFromId() {
        return formGridFromId;
    }

    public void setFormGridFromId(BigDecimal formGridFromId) {
        this.formGridFromId = formGridFromId;
    }

    public String getFormShowPager() {
        return formShowPager;
    }

    public void setFormShowPager(String formShowPager) {
        this.formShowPager = formShowPager == null ? null : formShowPager.trim();
    }

    public BigDecimal getFormPageSize() {
        return formPageSize;
    }

    public void setFormPageSize(BigDecimal formPageSize) {
        this.formPageSize = formPageSize;
    }

    public String getFormPageSizeList() {
        return formPageSizeList;
    }

    public void setFormPageSizeList(String formPageSizeList) {
        this.formPageSizeList = formPageSizeList == null ? null : formPageSizeList.trim();
    }

    public String getFormIsIndex() {
        return formIsIndex;
    }

    public void setFormIsIndex(String formIsIndex) {
        this.formIsIndex = formIsIndex == null ? null : formIsIndex.trim();
    }

    public String getFormShowColumns() {
        return formShowColumns;
    }

    public void setFormShowColumns(String formShowColumns) {
        this.formShowColumns = formShowColumns == null ? null : formShowColumns.trim();
    }

    public String getFormEditNextOnEnter() {
        return formEditNextOnEnter;
    }

    public void setFormEditNextOnEnter(String formEditNextOnEnter) {
        this.formEditNextOnEnter = formEditNextOnEnter == null ? null : formEditNextOnEnter.trim();
    }

    public String getFormEditNextRowCell() {
        return formEditNextRowCell;
    }

    public void setFormEditNextRowCell(String formEditNextRowCell) {
        this.formEditNextRowCell = formEditNextRowCell == null ? null : formEditNextRowCell.trim();
    }

    public String getFormAllowResize() {
        return formAllowResize;
    }

    public void setFormAllowResize(String formAllowResize) {
        this.formAllowResize = formAllowResize == null ? null : formAllowResize.trim();
    }

    public String getFormAllowCellEdit() {
        return formAllowCellEdit;
    }

    public void setFormAllowCellEdit(String formAllowCellEdit) {
        this.formAllowCellEdit = formAllowCellEdit == null ? null : formAllowCellEdit.trim();
    }

    public String getFormAllowCellSelect() {
        return formAllowCellSelect;
    }

    public void setFormAllowCellSelect(String formAllowCellSelect) {
        this.formAllowCellSelect = formAllowCellSelect == null ? null : formAllowCellSelect.trim();
    }

    public String getFormMultiSelect() {
        return formMultiSelect;
    }

    public void setFormMultiSelect(String formMultiSelect) {
        this.formMultiSelect = formMultiSelect == null ? null : formMultiSelect.trim();
    }

    public String getFormRowClickButtonId() {
        return formRowClickButtonId;
    }

    public void setFormRowClickButtonId(String formRowClickButtonId) {
        this.formRowClickButtonId = formRowClickButtonId == null ? null : formRowClickButtonId.trim();
    }

    public String getFormRowDbclickButtonId() {
        return formRowDbclickButtonId;
    }

    public void setFormRowDbclickButtonId(String formRowDbclickButtonId) {
        this.formRowDbclickButtonId = formRowDbclickButtonId == null ? null : formRowDbclickButtonId.trim();
    }

    public Date getOperatorTime() {
        return operatorTime;
    }

    public void setOperatorTime(Date operatorTime) {
        this.operatorTime = operatorTime;
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName == null ? null : operatorName.trim();
    }

    public String getFormShowTitle() {
        return formShowTitle;
    }

    public void setFormShowTitle(String formShowTitle) {
        this.formShowTitle = formShowTitle == null ? null : formShowTitle.trim();
    }

    public String getFormIndexWidth() {
        return formIndexWidth;
    }

    public void setFormIndexWidth(String formIndexWidth) {
        this.formIndexWidth = formIndexWidth == null ? null : formIndexWidth.trim();
    }

    public String getFormMultiWidth() {
        return formMultiWidth;
    }

    public void setFormMultiWidth(String formMultiWidth) {
        this.formMultiWidth = formMultiWidth == null ? null : formMultiWidth.trim();
    }

    public BigDecimal getFormFrozen() {
        return formFrozen;
    }

    public void setFormFrozen(BigDecimal formFrozen) {
        this.formFrozen = formFrozen;
    }

    public String getFormGridHeight() {
        return formGridHeight;
    }

    public void setFormGridHeight(String formGridHeight) {
        this.formGridHeight = formGridHeight == null ? null : formGridHeight.trim();
    }

    public String getFormTableIsHandsontable() {
        return formTableIsHandsontable;
    }

    public void setFormTableIsHandsontable(String formTableIsHandsontable) {
        this.formTableIsHandsontable = formTableIsHandsontable == null ? null : formTableIsHandsontable.trim();
    }

    public String getFormHeaderIsShow() {
        return formHeaderIsShow;
    }

    public void setFormHeaderIsShow(String formHeaderIsShow) {
        this.formHeaderIsShow = formHeaderIsShow == null ? null : formHeaderIsShow.trim();
    }

    public String getFormBorderShowType() {
        return formBorderShowType;
    }

    public void setFormBorderShowType(String formBorderShowType) {
        this.formBorderShowType = formBorderShowType == null ? null : formBorderShowType.trim();
    }

    public String getFormIsCheckbox() {
        return formIsCheckbox;
    }

    public void setFormIsCheckbox(String formIsCheckbox) {
        this.formIsCheckbox = formIsCheckbox == null ? null : formIsCheckbox.trim();
    }
}