package com.myehr.pojo.formmanage.cache;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.myehr.common.util.SpringContextUtils;
import com.myehr.pojo.formmanage.button.SysFormButtonExport;
import com.myehr.pojo.formmanage.button.SysFormButtonExportColumn;
import com.myehr.pojo.formmanage.button.SysFormButtonImport;
import com.myehr.pojo.formmanage.button.SysFormButtonImportColumn;
import com.myehr.service.formmanage.form.IButtonService;

public class SysFormButtonExportCache implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private SysFormButtonExport pojo;
	
	/**
	 * 导出的字段组合
	 */
	private  List<String> exportFieldsList;
	
	
	/**
	 *  关联导出字段信息
	 */
	private List<SysFormButtonExportColumnCache> exportColumnconfigs = new ArrayList<SysFormButtonExportColumnCache>();
	
	public List<SysFormButtonExportColumnCache> getExportColumnconfigs() {
		return exportColumnconfigs;
	}
	public void setExportColumnconfigs(
			List<SysFormButtonExportColumnCache> exportColumnconfigs) {
		this.exportColumnconfigs = exportColumnconfigs;
	}
	public String getButtonExportFieldnames() {
		return pojo.getButtonExportFieldnames();
	}

	public String getButtonExportFilename() {
		return pojo.getButtonExportFilename();
	}

	public String getButtonExportExcType() {
		return pojo.getButtonExportExcType();
	}

	public String getButtonExportFun() {
		return pojo.getButtonExportFun();
	}

	public String getButtonExportId() {
		return pojo.getButtonExportId()+"";
	}

	public String getButtonExportInitFun() {
		return pojo.getButtonExportInitFun();
	}

	public String getButtonExportSql() {
		return pojo.getButtonExportSql();
	}
	
	public String getButtonExportUrl() {
		return pojo.getButtonExportUrl();
	}

	public String getFormButtonId() {
		return pojo.getFormButtonId()+"";
	}
	
	/**
	 * 空构造函数
	 *
	 */
	public SysFormButtonExportCache() {
		
	}
	
	public SysFormButtonExportCache(SysFormButtonExport obj,SysFormconfigCache form) {
		this.pojo = obj;
		
		//加载导入字段
		//获取对应所有引入配置列
		IButtonService service = (IButtonService)SpringContextUtils.getBeanById("IButtonService");
		List<SysFormButtonExportColumn> objs = service.getExportButtonColumnconfig(this.getFormButtonId());
		for(int i=0; i<objs.size(); i++){
			this.exportColumnconfigs.add(new SysFormButtonExportColumnCache(objs.get(i),form));
		}
	}
	public List<String> getExportFieldsList() {
		return exportFieldsList;
	}
	public void setExportFieldsList(List<String> exportFieldsList) {
		this.exportFieldsList = exportFieldsList;
	}

}
