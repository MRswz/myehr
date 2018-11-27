package com.myehr.pojo.formmanage.formCopy;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.myehr.common.exception.DcfException;
import com.myehr.common.util.SpringContextUtils;
import com.myehr.pojo.cache.SysCacheConfig;
import com.myehr.pojo.formmanage.button.SysFormButtonCalculate;
import com.myehr.pojo.formmanage.button.SysFormButtonEditorWithBLOBs;
import com.myehr.pojo.formmanage.button.SysFormButtonExport;
import com.myehr.pojo.formmanage.button.SysFormButtonImport;
import com.myehr.pojo.formmanage.button.SysFormButtonSave;
import com.myehr.pojo.formmanage.cache.FormParamConstants;
import com.myehr.pojo.formmanage.form.SysExecSql;
import com.myehr.pojo.formmanage.form.SysFormButton;
import com.myehr.pojo.formmanage.form.SysFormGeneralParam;
import com.myehr.service.formmanage.form.ISysformconfigService;
import com.myehr.service.formmanage.form.generalparam.ISysFormGeneralParamService;

public class SysFormButtonCacheCopy implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private SysFormButton pojo;
	
	private Object buttonExt;
	
	private List<SysCacheConfig> cacheConfig;
	
//	按钮后置sql
	private SysFormGeneralExecSqlCacheCopy hzsql ;

	public SysFormGeneralExecSqlCacheCopy getHzSql() {
		return hzsql;
	}

	public void setHzql(SysFormGeneralExecSqlCacheCopy hzsql) {
		this.hzsql = hzsql;
	}

//	按钮前置sql
	private SysFormGeneralExecSqlCacheCopy qzsql ;

	public SysFormGeneralExecSqlCacheCopy getQzSql() {
		return qzsql;
	}

	public void setQzql(SysFormGeneralExecSqlCacheCopy qzsql) {
		this.qzsql = qzsql;
	}	
	
	public SysFormButton getPojo() {
		return pojo;
	}

	public void setPojo(SysFormButton pojo) {
		this.pojo = pojo;
	}

	
	

	public List<SysCacheConfig> getCacheConfig() {
		return cacheConfig;
	}

	public void setCacheConfig(List<SysCacheConfig> cacheConfig) {
		this.cacheConfig = cacheConfig;
	}

	/**
	 * 该控件对应的通用参数
	 */
	private  Map<String,List<SysFormGeneralParamCacheCopy>> generalParams = new HashMap<String,List<SysFormGeneralParamCacheCopy>>();

	public Map<String,List<SysFormGeneralParamCacheCopy>> getGeneralParams() {
		return generalParams;
	}

	public void setGeneralParams(Map<String,List<SysFormGeneralParamCacheCopy>> generalParams) {
		this.generalParams = generalParams;
	}
	

	public Object getButtonExt() {
		return buttonExt;
	}

	public String getFormButtonCss() {
		return pojo.getFormButtonCss();
	}
	
	public String getFormButtonFormDefId() {
		return pojo.getFormButtonFormDefId()+"";
	}

	public String getFormButtonFormId() {
		return pojo.getFormButtonFormId();
	}

	public String getFormButtonHeight() {
		return pojo.getFormButtonHeight();
	}

	public String getFormButtonIcon() {
		return pojo.getFormButtonIcon();
	}

	public String getFormButtonId() {
		return pojo.getFormButtonId()+"";
	}

	public String getFormButtonName() {
		return pojo.getFormButtonName();
	}

	public String getFormButtonType() {
		return pojo.getFormButtonType();
	}

	public String getFormButtonWidth() {
		return pojo.getFormButtonWidth();
	}

	public String getFormButtonCode() {
		return pojo.getFormButtonCode();
	}

	public float getFormButtonSort() {
		return pojo.getFormButtonSort().floatValue();
	}

	public String getOperatorName() {
		return pojo.getOperatorName();
	}

	public Date getOperatorTime() {
		return pojo.getOperatorTime();
	}
	public String getFormButtonWarningInfo() {
		return pojo.getFormButtonWarningInfo();
	}
	
	public String getFormButtonCheckFun() {
		return pojo.getFormButtonCheckFun();
	}
	
	
	/**
	 * 构造函数 通过数据库加载
	 *
	 */
	public SysFormButtonCacheCopy(String buttonId){
		System.out.println(buttonId);
	}
	
	/**
	 * 构造函数 通过DataObject加载
	 *
	 */
	public SysFormButtonCacheCopy(SysFormButton obj,SysFormCopyCache currentform) throws NumberFormatException, DcfException, Exception{
		setThisByDataObject(obj);
		this.setButtonExt(currentform);
		//加载通用参数对象数据
		ISysFormGeneralParamService paramService = (ISysFormGeneralParamService)SpringContextUtils.getBeanById("ISysFormGeneralParamService");
		String paramType = FormParamConstants.FORM_BUTTON;
		if (this.getPojo().getFormButtonType().equals("calculate")) {
			paramType = FormParamConstants.BUTTON_CALCULATE;
		}
		List<SysFormGeneralParam> params = paramService.queryGeneralParamByTypeAndTypeValue(paramType,Long.parseLong(this.getFormButtonId()));
		for(int i=0; i<params.size(); i++){
			SysFormGeneralParamCacheCopy p =  new SysFormGeneralParamCacheCopy(params.get(i));
			String type = p.getParamTypeEnd();
			if(this.generalParams.containsKey(type)){
				List<SysFormGeneralParamCacheCopy> l = this.generalParams.get(type);
				l.add(p);
				this.generalParams.put(type, l);
			}else {
				List<SysFormGeneralParamCacheCopy> l = new ArrayList<SysFormGeneralParamCacheCopy>();
				l.add(p);
				this.generalParams.put(type, l);
			}
		}
		//加载按钮后置sql
		String type = FormParamConstants.EXECSQL_BUTTON_HZ_TYPE;
		this.hzsql = new SysFormGeneralExecSqlCacheCopy(type,this.getFormButtonId()+"");
		//加载按钮前置sql
		String type2 = FormParamConstants.EXECSQL_BUTTON_QZ_TYPE;
		this.qzsql = new SysFormGeneralExecSqlCacheCopy(type2,this.getFormButtonId()+"");
		this.cacheConfig = setCacheConfig(this.getFormButtonId());
	}
	
	private List<SysCacheConfig> setCacheConfig(String formButtonId) {
		ISysformconfigService service =  (ISysformconfigService)SpringContextUtils.getBeanById("ISysformconfigService");
		return service.getFreshCache("BUTTON",formButtonId,"DICT");
	}

	/**
	 * DataObject 填充对象
	 * @param obj
	 */
	private void setThisByDataObject(SysFormButton obj){
		System.out.println(obj.getFormButtonCheckFun());
		this.pojo = obj;
		//数据类型问题this.pojo.setOperatorTime((Date)obj.get("operatorName"));
		
		
		if((!this.getFormButtonIcon().isEmpty() && this.getFormButtonIcon()!="") && !this.getFormButtonIcon().startsWith("icon-")) {
			this.pojo.setFormButtonIcon("glyphicon-" + this.getFormButtonIcon());
		}
		String qzjs = (String) obj.getFormButtonCheckFun();
		qzjs = qzjs==null?"":qzjs;
		this.pojo.setFormButtonCheckFun(qzjs);
	}
	
	/**
	 * 初始化按钮扩展属性
	 */
	public void setButtonExt(SysFormCopyCache currentform) throws NumberFormatException, DcfException, Exception {
		ISysformconfigService service = (ISysformconfigService)SpringContextUtils.getBeanById("ISysformconfigService");
		if("save_form".equals(this.getFormButtonType())||"free_submit".equals(this.getFormButtonType())||"save".equals(this.getFormButtonType())||"select".equals(this.getFormButtonType())||"other".equals(this.getFormButtonType())){
			SysFormButtonSave obj =service.getButtonSave(this.getFormButtonId());
			if(obj!=null){
				this.buttonExt = new SysFormButtonSaveCacheCopy(obj);
			}
		} else if("add".equals(this.getFormButtonType())||"edit".equals(this.getFormButtonType()) ||"batchEdit".equals(this.getFormButtonType())||"copyAndUpdate".equals(this.getFormButtonType())) {
			this.buttonExt = new SysFormButtonAddOrEditCacheCopy(this.getFormButtonId());
		} else if("edit1".equals(this.getFormButtonType())) {
			this.buttonExt = new SysFormButtonAddOrEditCacheCopy(this.getFormButtonId());
		} else if("remove".equals(this.getFormButtonType())) {
			this.buttonExt = new SysFormButtonRemoveCacheCopy(this.getFormButtonId());
		} else if ("export".equals(this.getFormButtonType())) {
			SysFormButtonExport obj = service.getButtonExport(this.getFormButtonId()+"");
			if (obj != null) {
				this.buttonExt = new SysFormButtonExportCacheCopy(obj,currentform);
			}
		} else if ("import".equals(this.getFormButtonType())) {
			//IButtonService service = (IButtonService)ApplicationContextFactory.getContext().getBean("IButtonService");
			SysFormButtonImport obj = service.getButtonImport(this.getFormButtonId()+"");
			if (obj != null) {
				this.buttonExt = new SysFormButtonImportCacheCopy(obj, currentform);
			}
		} else if("calculate".equals(this.getFormButtonType())){
			//IButtonService
			SysFormButtonCalculate obj = service.getButtonCalculate(this.getFormButtonId());
			if (obj != null) {
				this.buttonExt = new SysFormButtonCalculateCacheCopy(obj,this);
			}
		}else if("executeSQL".equals(this.getFormButtonType())) {
			//IButtonService service = (IButtonService)ApplicationContextFactory.getContext().getBean("IButtonService");
			SysExecSql obj = service.getSysExecSql(this.getFormButtonId());
			if (obj != null) {
				this.buttonExt = new SysFormGeneralExecSqlCacheCopy(obj);
			}
		}else if("introduce".equals(this.getFormButtonType())) {
			this.buttonExt = new SysFormButtonIntroduceCacheCopy(Long.parseLong(this.getFormButtonId()),currentform);
		}else if("editorModel".equals(this.getFormButtonType())||"email".equals(this.getFormButtonType())||"message".equals(this.getFormButtonType())) {
			SysFormButtonEditorWithBLOBs obj = service.getButtonEditor(FormParamConstants.EXECSQL_BUTTON, this.getFormButtonId());
			if (obj != null) {
				this.buttonExt = new SysFormButtonEditorCacheCopy(obj);
			}
		}
	}
	
}
