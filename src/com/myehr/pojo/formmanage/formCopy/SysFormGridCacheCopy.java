package com.myehr.pojo.formmanage.formCopy;

import java.io.Serializable;

import com.myehr.common.util.SpringContextUtils;
import com.myehr.pojo.formmanage.form.SysFormconfigGrid;
import com.myehr.service.formmanage.form.IListFormService;

public class SysFormGridCacheCopy implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private SysFormconfigGrid pojo;
	
	public void setGrid(SysFormGridCacheCopy grid) {
		this.grid = grid;
	}

	public SysFormconfigGrid getPojo() {
		return pojo;
	}

	public void setPojo(SysFormconfigGrid pojo) {
		this.pojo = pojo;
	}

	// 节点文本字段
	private String formGridTextField;
	
	// 值字段
	private String formGridIdField;
	
	// 显示合计
	private String formShowSummaryRow = "false";
	
	
//	保留关联表单引用对象
	private SysFormGridCacheCopy grid ; 

	public SysFormGridCacheCopy getGrid() {
		return grid;
	}
	
	public String getFormGridIdField() {
		return formGridIdField;
	}

	public void setFormGridIdField(String formGridIdField) {
		this.formGridIdField = formGridIdField;
	}

	public String getFormGridTextField() {
		return formGridTextField;
	}

	public void setFormGridTextField(String formGridTextField) {
		this.formGridTextField = formGridTextField;
	}
	
	public String getFormAllowCellEdit() {
		return pojo.getFormAllowCellEdit();
	}

	public String getFormAllowCellSelect() {
		return pojo.getFormAllowCellSelect();
	}

	public String getFormEditNextOnEnter() {
		return pojo.getFormEditNextOnEnter();
	}

	public String getFormEditNextRowCell() {
		return pojo.getFormEditNextRowCell();
	}

	public String getFormIsIndex() {
		return pojo.getFormIsIndex();
	}

	public String getFormMultiSelect() {
		return pojo.getFormMultiSelect();
	}

	public int getFormPageSize() {
		return pojo.getFormPageSize().intValue();
	}

	public String getFormPageSizeList() {
		return pojo.getFormPageSizeList();
	}

	public String getFormShowColumns() {
		return pojo.getFormShowColumns();
	}

	public String getFormShowPager() {
		return pojo.getFormShowPager();
	}

	public String getFormAllowResize() {
		return pojo.getFormAllowResize();
	}

	public String getFormGridFromId() {
		return pojo.getFormGridFromId()+"";
	}

	public String getFormGridId() {
		return pojo.getFormGridId()+"";
	}
	
	public String getFormShowSummaryRow() {
		return formShowSummaryRow;
	}

	public void setFormShowSummaryRow(String formShowSummaryRow) {
		this.formShowSummaryRow = formShowSummaryRow;
	}

	public String getFormShowTitle() {
		return pojo.getFormShowTitle();
	}

	public String getFormIndexWidth() {
		return pojo.getFormIndexWidth();
	}

	public String getFormMultiWidth() {
		return pojo.getFormMultiWidth();
	}

	public long getFormFrozen() {
		return pojo.getFormFrozen().longValue();
	}

	public String getFormGridHeight() {
		return pojo.getFormGridHeight();
	}
	
	/**
	 * 提供空的构造函数
	 *
	 */
	public SysFormGridCacheCopy(){};
	
	/**
	 * 构造函数 数据库加载
	 * @param formGridFormId
	 */
	public SysFormGridCacheCopy(String formGridFormId,String formCode){
		IListFormService service =  (IListFormService)SpringContextUtils.getBeanById("ListFormService");
		SysFormconfigGrid obj = service.queryListGirdByFormId(formGridFormId);
		setThisByDataObject(obj);
	}
	
	/**
	 *DataObject填充对象
	 * @param obj
	 */
	public void setThisByDataObject(SysFormconfigGrid obj){
		this.pojo = obj;
	}

	

}
