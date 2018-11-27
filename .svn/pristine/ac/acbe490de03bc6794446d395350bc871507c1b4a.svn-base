package com.myehr.pojo.formmanage.formCopy;

import java.io.Serializable;
import java.util.Date;

import com.myehr.common.util.SpringContextUtils;
import com.myehr.pojo.formmanage.widget.SysFormRichtext;
import com.myehr.service.formmanage.form.ISysformconfigService;

public class SysFormRichtextCacheCopy implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private SysFormRichtext pojo;
	
	private String richTextName ; //此变量同时作为ue编辑器变量名称及id

	public void setRichTextName(String richTextName) {
		this.richTextName = richTextName;
	}

	public String getRichTextName() {
		return richTextName;
	}

	public String getOperatorName() {
		return pojo.getOperatorName();
	}

	public Date getOperatorTime() {
		return pojo.getOperatorTime();
	}

	public String getRichTextDataFromType() {
		return pojo.getRichtextDataFromType();
	}

	public String getRichTextDataFromValue() {
		return pojo.getRichtextDataFromValue();
	}

	public String getRichTextFormColumnId() {
		return pojo.getRichtextFormColumnId().toString();
	}

	public long getRichTextId() {
		if (pojo!=null&&pojo.getRichtextId()!=null) {
			return pojo.getRichtextId().longValue();
		}else {
			return 0;
		}
		
	}

	public String getRichTextInitFun() {
		return pojo.getRichtextInitFun();
	}

	public String getRichTextType() {
		return pojo.getRichtextType();
	}
	
	public SysFormRichtextCacheCopy(String columnId,String jsId){
		ISysformconfigService service = (ISysformconfigService)SpringContextUtils.getBeanById("ISysformconfigService");
		SysFormRichtext obj = service.getRichtext(columnId);
		if(obj!=null){
			this.setThisByDataObject(obj);
			this.setRichTextName(jsId);
		}
	}
	

	/**
	 * DataObject 填充对象
	 * @param obj
	 */
	private void setThisByDataObject(SysFormRichtext obj){
		this.pojo = obj;
	}
	
}
