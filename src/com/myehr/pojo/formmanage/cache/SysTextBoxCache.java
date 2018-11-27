package com.myehr.pojo.formmanage.cache;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.aspectj.weaver.ast.Var;

import com.myehr.common.util.SpringContextUtils;
import com.myehr.pojo.formmanage.form.SysFormGeneralParam;
import com.myehr.pojo.formmanage.widget.SysFormTextbox;
import com.myehr.service.formmanage.form.ISysformconfigService;
import com.myehr.service.formmanage.form.generalparam.ISysFormGeneralParamService;

public class SysTextBoxCache implements Serializable {
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
	private  Map<String,List<SysFormGeneralParamCache>> generalParams = new HashMap<String,List<SysFormGeneralParamCache>>();
	//	private  List<SysFormGeneralParamCache> generalParams = new ArrayList<SysFormGeneralParamCache>();

	public SysFormTextbox getPojo() {
		return pojo;
	}

	public void setPojo(SysFormTextbox pojo) {
		this.pojo = pojo;
	}

	public Map<String,List<SysFormGeneralParamCache>> getGeneralParams() {
		return generalParams;
	}

	public void setGeneralParams(Map<String,List<SysFormGeneralParamCache>> generalParams) {
		this.generalParams = generalParams;
	}

	public String getTextboxEmptytext() {
		if (pojo==null) {
			return null;
		}
		return pojo.getTextboxEmptytext();
	}

	public String getOperatorName() {
		if (pojo==null) {
			return null;
		}
		return pojo.getOperatorName();
	}

	public Date getOperatorTime() {
		if (pojo==null) {
			return null;
		}
		return pojo.getOperatorTime();
	}

	public String getTextboxCheckFun() {
		if (pojo==null) {
			return null;
		}
		return pojo.getTextboxCheckFun();
	}

	public String getTextboxCheckSelf() {
		if (pojo==null) {
			return null;
		}
		return pojo.getTextboxCheckSelf();
	}

	public String getTextboxCheckType() {
		if (pojo==null) {
			return null;
		}
		return pojo.getTextboxCheckType();
	}

	public String getTextboxClickFun() {
		if (pojo==null) {
			return null;
		}
		return pojo.getTextboxClickFun();
	}

	public String getTextboxDataFromType() {
		if (pojo==null) {
			return null;
		}
		return pojo.getTextboxDataFromType();
	}

	public String getTextboxDataFromValue() {
		if (pojo==null) {
			return null;
		}
		return pojo.getTextboxDataFromValue();
	}

	public String getTextboxFormColumnId() {
		if (pojo==null) {
			return null;
		}
		return pojo.getTextboxFormColumnId()+"";
	}

	public String getTextboxid() {
		if (pojo==null) {
			return null;
		}
		return pojo.getTextboxId()+"";
	}

	public String getTextboxInitFun() {
		if (pojo==null) {
			return null;
		}
		return pojo.getTextboxInitFun();
	}

	public String getTextboxScheme() {
		if (pojo==null) {
			return null;
		}
		return pojo.getTextboxScheme();
	}
	

	public String getTextBoxIsLink() {
		if (pojo==null) {
			return null;
		}
		return pojo.getTextboxIsLink();
	}

	public long getTextBoxLinkForm() {
		if (pojo==null||pojo.getTextboxLinkForm()==null) {
			return 0;
		}
		return pojo.getTextboxLinkForm().longValue();
	}

	public String getTextBoxLinkIsForm() {
		if (pojo==null) {
			return null;
		}
		return pojo.getTextboxLinkIsForm();
	}

	public String getTextBoxLinkUrl() {
		if (pojo==null) {
			return null;
		}
		return pojo.getTextboxLinkUrl();
	}

	public String getTextboxValuechangeFun() {
		if (pojo==null) {
			return null;
		}
		return pojo.getTextboxValuechangeFun();
	}

	public String getTextboxLinkWinHeight() {
		if (pojo==null) {
			return null;
		}
		return pojo.getTextboxLinkWinHeight();
	}

	public String getTextboxLinkWinOpenType() {
		if (pojo==null) {
			return null;
		}
		return pojo.getTextboxLinkWinOpenType();
	}

	public String getTextboxLinkWinTitle() {
		if (pojo==null) {
			return null;
		}
		return pojo.getTextboxLinkWinTitle();
	}
	
	public String getTextboxLinkWinWidth() {
		if (pojo==null) {
			return null;
		}
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
	public SysTextBoxCache(){}
	
	/**
	 * 构造函数 通过字段id构造对象
	 * @param columnId
	 */
	public SysTextBoxCache(String columnId){
		ISysformconfigService service = (ISysformconfigService)SpringContextUtils.getBeanById("ISysformconfigService");
		SysFormTextbox obj = service.getTextbox(columnId+"");
		
		if(obj!=null){
			this.pojo = obj;
			//加载通用参数对象数据
			String columnName = obj.getTextboxFormColumnId()+"";
			ISysFormGeneralParamService paramService = (ISysFormGeneralParamService)SpringContextUtils.getBeanById("ISysFormGeneralParamService");
			String paramType = FormParamConstants.COLUMN_TEXTBOX;
			List<SysFormGeneralParam> params = paramService.queryGeneralParamByTypeAndTypeValue(paramType,Long.parseLong(this.pojo.getTextboxId()+""));
			for(int i=0; i<params.size(); i++){
				SysFormGeneralParamCache p = new SysFormGeneralParamCache(params.get(i));
				String type = p.getParamTypeEnd();
				if(this.generalParams.containsKey(type)){
					List<SysFormGeneralParamCache> l = this.generalParams.get(type);
					l.add(p);
					this.generalParams.put(type, l);
				}else {
					List<SysFormGeneralParamCache> l = new ArrayList<SysFormGeneralParamCache>();
					l.add(p);
					this.generalParams.put(type, l);
				}
			}
		}else{
			this.pojo = new SysFormTextbox();
		}
	}
	
}
