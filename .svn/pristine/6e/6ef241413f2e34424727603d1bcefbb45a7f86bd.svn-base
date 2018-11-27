package com.myehr.pojo.formmanage.formCopy;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.myehr.common.util.SpringContextUtils;
import com.myehr.pojo.formmanage.button.SysFormButtonImport;
import com.myehr.pojo.formmanage.button.SysFormButtonImportColumn;
import com.myehr.pojo.formmanage.widget.SysFileupload;
import com.myehr.service.formmanage.form.IButtonService;
import com.myehr.service.formmanage.form.IFileUploadService;

/**
 * 导入
 * @author Administrator
 *
 */
public class SysFormButtonImportCacheCopy implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private SysFormButtonImport pojo;

	private String buttonImportTemplateName;
	/**
	 *  关联所属字典翻译配置信息
	 */
	private List<SysFormButtonImportColumnCacheCopy> importColumnconfigs = new ArrayList<SysFormButtonImportColumnCacheCopy>();
	
	public String getButtonImportTemplateName() {
		return buttonImportTemplateName;
	}
	public void setButtonImportTemplateName(String buttonImportTemplateName) {
		this.buttonImportTemplateName = buttonImportTemplateName;
	}
	public String getButtonImportTemplate() {
		return pojo.getButtonImportTemplate();
	}
	
	public String getButtonImportExcType() {
		return pojo.getButtonImportExcType();
	}
	
	public String getButtonImportFun() {
		return pojo.getButtonImportFun();
	}

	public String getButtonImportId() {
		return pojo.getButtonImportId()+"";
	}
	
	public String getButtonImportInitFun() {
		return pojo.getButtonImportInitFun();
	}
	
	public String getButtonImportSql() {
		return pojo.getButtonImportSql();
	}
	
	public String getButtonImportUrl() {
		return pojo.getButtonImportUrl();
	}
	
	public String getFormButtonId() {
		return pojo.getFormButtonId()+"";
	}
	
	public List<SysFormButtonImportColumnCacheCopy> getImportColumnconfigs() {
		return importColumnconfigs;
	}
	public void setImportColumnconfigs(List<SysFormButtonImportColumnCacheCopy> importColumnconfigs) {
		this.importColumnconfigs = importColumnconfigs;
	}
	
	public SysFormButtonImportCacheCopy() {
		
	}
	
	public SysFormButtonImportCacheCopy(SysFormButtonImport obj,SysFormCopyCache currentform) {
		
		this.pojo = obj;
		
		if (this.getButtonImportTemplate()!=null&&!this.getButtonImportTemplate().equals("")) {
			//IFileUploadService service = (IFileUploadService)ApplicationContextFactory.getContext().getBean("FileUploadServiceBean");
			IFileUploadService service = (IFileUploadService)SpringContextUtils.getBeanById("IFileUploadService");
			
			SysFileupload fileData = service.selectByPrimaryKey(this.getButtonImportTemplate());
			if (fileData != null) {
				this.buttonImportTemplateName = fileData.getClientfilename();
			} else {
				this.buttonImportTemplateName = "";
			}
		} else {
			this.pojo.setButtonImportTemplate("");
		}
		//获取对应所有引入配置列
		IButtonService service = (IButtonService)SpringContextUtils.getBeanById("IButtonService");
		//IButtonService service = (IButtonService)ApplicationContextFactory.getContext().getBean("IButtonService");
		List<SysFormButtonImportColumn> objs = service.getImportButtonColumnconfig(this.getFormButtonId());
		if(objs!=null){
			for(int i=0; i<objs.size(); i++){
				this.importColumnconfigs.add(new SysFormButtonImportColumnCacheCopy(objs.get(i),currentform));
			}
		}
		
	}
	
	/**
	 * 通过字段配置id获取字段配置对象
	 * @param columnconfigid
	 * @return
	 */
	public SysFormButtonImportColumnCacheCopy getColumnconfigById(long columnconfigid){
		for(int i=0; i<this.importColumnconfigs.size();i++){
			if((this.importColumnconfigs.get(i).getImportcolumnId())==columnconfigid){
				return this.importColumnconfigs.get(i);
			}
		}
		return null;
	}
	
	/**
	 * 通过字段配置名称获取字段配置对象
	 * @param columnconfigid
	 * @return
	 */
	
	public SysFormButtonImportColumnCacheCopy getColumnconfigByName(String columnName){
		for(int i=0; i<this.importColumnconfigs.size();i++){
			String importColumnRelColumnName = this.importColumnconfigs.get(i).getImportColumnRelColumnName();
			if (importColumnRelColumnName!=null && importColumnRelColumnName!="") {
				String[] aa = importColumnRelColumnName.split("_");
				String importColumnName = "";
				for (int j = 1; j < aa.length-1; j++) {
					importColumnName+=aa[j]+"_";
				}
				importColumnName = importColumnName.substring(0, importColumnName.length()-1);
				System.out.println(importColumnName);
				if(columnName.toUpperCase().equals(importColumnName)==true){
					return this.importColumnconfigs.get(i);
				}
			}
			
		}
		return null;
	}
	
	
}
