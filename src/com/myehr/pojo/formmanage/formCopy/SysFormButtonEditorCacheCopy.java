package com.myehr.pojo.formmanage.formCopy;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.myehr.common.util.SpringContextUtils;
import com.myehr.pojo.formmanage.button.SysFormButtonEditorWithBLOBs;
import com.myehr.service.formmanage.form.IButtonService;

public class SysFormButtonEditorCacheCopy implements Serializable {
	private static final long serialVersionUID = 1L;

	private SysFormButtonEditorWithBLOBs pojo;
	
	private boolean hasColumn = false;
	
	
	
	private String[] sqlList;
	private List<String[]> params = new ArrayList<String[]>();
	
	public SysFormButtonEditorWithBLOBs getPojo(){
		return pojo;
	}
	
	public Long getButtonEditorModelId() {
		return pojo.getButtonEditorModelId();
	}
	
	public String getButtonEditorModelValue() {
		return pojo.getButtonEditorModelValue();
	}
	public String getButtonEditorModelHtml() {
		return pojo.getButtonEditorModelHtml();
	}
	public long getButtonEditorModelFormid() {
		return pojo.getButtonEditorModelFormid();
	}
	
	public long getButtonEditorModelButtonid() {
		return pojo.getButtonEditorModelButtonid();
	}
	
	public String getEditorModelType() {
		return pojo.getEditorModelType();
	}
	
	public String getEditorMessageType() {
		return pojo.getEditorMessageType();
	}
	
	public long getEditorModelId() {
		return pojo.getEditorModelId();
	}
	
	public String getEditorModelName() {
		return pojo.getEditorModelName();
	}
	
	public List<String[]> getParams() {
		return params;
	}
	public void setParams(List<String[]> params) {
		this.params = params;
	}
	public String[] getSqlList() {
		return sqlList;
	}
	public void setSqlList(String[] sqlList) {
		this.sqlList = sqlList;
	}
	
	
	public boolean isHasColumn() {
		return hasColumn;
	}
	public void setHasColumn(boolean hasColumn) {
		this.hasColumn = hasColumn;
	}
	public SysFormButtonEditorCacheCopy(String buttonExecSqlType, String buttonId) {
		IButtonService service = (IButtonService)SpringContextUtils.getBeanById("IButtonService");
		/*IButtonService service = (IButtonService)ApplicationContextFactory.getContext().getBean("IButtonService");*/
		SysFormButtonEditorWithBLOBs obj  = service.queryButtonEditorById(buttonExecSqlType, buttonId);
		if(obj!=null){
			this.setThisByDataObject(obj);
		}
	}
	
	/**
	 * 通过id初始化
	 * @param exeSqlId
	 */
	public SysFormButtonEditorCacheCopy(long exeSqlId) {
		IButtonService service = (IButtonService)SpringContextUtils.getBeanById("IButtonService");
		SysFormButtonEditorWithBLOBs obj  = service.queryButtonEditorById(exeSqlId);
		if(obj!=null){
			this.setThisByDataObject(obj);
		}
	}
	
	public SysFormButtonEditorCacheCopy(SysFormButtonEditorWithBLOBs obj) {
		if(obj!=null){
			this.setThisByDataObject(obj);
		}
	}
	
	public void setThisByDataObject(SysFormButtonEditorWithBLOBs obj){
		this.pojo = obj;
		
		//sqlList = this.getExecSql().split(";");
		//SqlUtil.dealTreeSolutionParam(params, this.getExecSql());
		
		for(String[] param : params){
			if("c".equals(param[0])){
				this.hasColumn = true;
				break;
			}
		}
	}
	
	public String getColumnParamsNames(){
		
		return null;
	}
	
}
