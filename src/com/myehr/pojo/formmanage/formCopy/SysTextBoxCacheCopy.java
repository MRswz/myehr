package com.myehr.pojo.formmanage.formCopy;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.myehr.common.util.SpringContextUtils;
import com.myehr.pojo.formmanage.cache.FormParamConstants;
import com.myehr.pojo.formmanage.form.SysFormGeneralParam;
import com.myehr.pojo.formmanage.widget.SysFormTextbox;
import com.myehr.service.formmanage.form.ISysformconfigService;
import com.myehr.service.formmanage.form.generalparam.ISysFormGeneralParamService;

public class SysTextBoxCacheCopy implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private SysFormTextbox pojo;
	
	public String getTextboxLinkSuccessDeal() {
		return pojo.getTextboxLinkSuccessDeal();
	}
	
	/**
	 * 该控件对应的通用参数
	 */
	private  Map<String,List<SysFormGeneralParamCacheCopy>> generalParams = new HashMap<String,List<SysFormGeneralParamCacheCopy>>();

	public SysFormTextbox getPojo() {
		return pojo;
	}

	public void setPojo(SysFormTextbox pojo) {
		this.pojo = pojo;
	}

	public Map<String,List<SysFormGeneralParamCacheCopy>> getGeneralParams() {
		return generalParams;
	}

	public void setGeneralParams(Map<String,List<SysFormGeneralParamCacheCopy>> generalParams) {
		this.generalParams = generalParams;
	}

	public String getTextboxEmptytext() {
		return pojo.getTextboxEmptytext();
	}

	public String getOperatorName() {
		return pojo.getOperatorName();
	}

	public Date getOperatorTime() {
		return pojo.getOperatorTime();
	}

	public String getTextboxCheckFun() {
		return pojo.getTextboxCheckFun();
	}

	public String getTextboxCheckSelf() {
		return pojo.getTextboxCheckSelf();
	}

	public String getTextboxCheckType() {
		return pojo.getTextboxCheckType();
	}

	public String getTextboxClickFun() {
		return pojo.getTextboxClickFun();
	}

	public String getTextboxDataFromType() {
		return pojo.getTextboxDataFromType();
	}

	public String getTextboxDataFromValue() {
		return pojo.getTextboxDataFromValue();
	}

	public String getTextboxFormColumnId() {
		return pojo.getTextboxFormColumnId()+"";
	}

	public String getTextboxid() {
		return pojo.getTextboxId()+"";
	}

	public String getTextboxInitFun() {
		return pojo.getTextboxInitFun();
	}

	public String getTextboxScheme() {
		return pojo.getTextboxScheme();
	}
	

	public String getTextBoxIsLink() {
		return pojo.getTextboxIsLink();
	}

	public long getTextBoxLinkForm() {
		return pojo.getTextboxLinkForm().longValue();
	}

	public String getTextBoxLinkIsForm() {
		return pojo.getTextboxLinkIsForm();
	}

	public String getTextBoxLinkUrl() {
		return pojo.getTextboxLinkUrl();
	}

	public String getTextboxValuechangeFun() {
		return pojo.getTextboxValuechangeFun();
	}

	public String getTextboxLinkWinHeight() {
		return pojo.getTextboxLinkWinHeight();
	}

	public String getTextboxLinkWinOpenType() {
		return pojo.getTextboxLinkWinOpenType();
	}

	public String getTextboxLinkWinTitle() {
		return pojo.getTextboxLinkWinTitle();
	}
	
	public String getTextboxLinkWinWidth() {
		return pojo.getTextboxLinkWinWidth();
	}
	
	
	public String getRealVtype(){
		String realType = null;
		if(this.pojo.getTextboxCheckType()==null){
			return null;
		}
		if("10".equals(this.pojo.getTextboxCheckType())){
			realType = this.pojo.getTextboxCheckSelf();
			return realType;
		}
		return this.pojo.getTextboxCheckType();
	}
	
	/**
	 * 提供空的构造函数
	 *
	 */
	public SysTextBoxCacheCopy(){}
	
	/**
	 * 构造函数 通过字段id构造对象
	 * @param columnId
	 */
	public SysTextBoxCacheCopy(String columnId){
		ISysformconfigService service = (ISysformconfigService)SpringContextUtils.getBeanById("ISysformconfigService");
		SysFormTextbox obj = service.getTextbox(columnId+"");
		
		if(obj!=null){
			this.pojo = obj;
			//加载通用参数对象数据
			//ISysFormGeneralParamService
			ISysFormGeneralParamService paramService = (ISysFormGeneralParamService)SpringContextUtils.getBeanById("ISysFormGeneralParamService");
			String paramType = FormParamConstants.COLUMN_TEXTBOX;
			List<SysFormGeneralParam> params = paramService.queryGeneralParamByTypeAndTypeValue(paramType,Long.parseLong(this.pojo.getTextboxId()+""));
			for(int i=0; i<params.size(); i++){
				SysFormGeneralParamCacheCopy p = new SysFormGeneralParamCacheCopy(params.get(i));
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
		}else{
			this.pojo = new SysFormTextbox();
		}
	}
	
}
