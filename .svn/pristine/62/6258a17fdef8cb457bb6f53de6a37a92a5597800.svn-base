package com.myehr.pojo.formmanage.formCopy;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.myehr.common.util.SpringContextUtils;
import com.myehr.pojo.formmanage.cache.FormParamConstants;
import com.myehr.pojo.formmanage.form.SysFormGeneralParam;
import com.myehr.pojo.formmanage.form.SysFormconfig;
import com.myehr.pojo.formmanage.form.SysFormconfigMstTab;
import com.myehr.pojo.formmanage.form.SysFormconfigMstTabDetail;
import com.myehr.pojo.sysParam.SysRequestParam;
import com.myehr.service.formmanage.form.IMstTabFormService;
import com.myehr.service.formmanage.form.ISysformconfigService;
import com.myehr.service.formmanage.form.generalparam.ISysFormGeneralParamService;

public class SysFormconfigMstTabCacheCopy implements Serializable {
//	private static final com.eos.system.logging.Logger log = DcfUtil.getLogger(SysFormconfigMstTab.class);
    
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private SysFormconfigMstTab pojo;
	
	//对应从表数据
	private List<SysFormconfigMstTabDetailCacheCopy> details = new ArrayList<SysFormconfigMstTabDetailCacheCopy>();
			 

	/**
	 * 主表的输出参数
	 */
	private Map<String, List<SysFormGeneralParamCacheCopy>> generalParams = new HashMap<String,List<SysFormGeneralParamCacheCopy>>();

	public Map<String, List<SysFormGeneralParamCacheCopy>> getGeneralParams() {
		return generalParams;
	}

	public SysFormconfigMstTab getPojo() {
		return pojo;
	}

	public void setPojo(SysFormconfigMstTab pojo) {
		this.pojo = pojo;
	}

	public void setGeneralParams(Map<String, List<SysFormGeneralParamCacheCopy>> generalParams) {
		this.generalParams = generalParams;
	}

	public long getMstTabMainFormId() {
		System.out.println(this.pojo.getMstTabFormId());
		if (this.pojo.getMstTabMainFormId()==null) {
			return 0;
		}
		return this.pojo.getMstTabMainFormId().longValue();
	}
	
	public List<SysFormconfigMstTabDetailCacheCopy> getDetails() {
		return details;
	}

	public void setDetails(List<SysFormconfigMstTabDetailCacheCopy> details) {
		this.details = details;
	}

	public String getMstTabDetailHeight(int flag) {
		if(this.pojo.getMstTabDetailHeight()==null){
			return "";
		}
		if(flag ==1){
			return this.pojo.getMstTabDetailHeight();
		}
		return "height:"+this.pojo.getMstTabDetailHeight()+";";
	}

	public long getMstTabFormId() {
		return this.pojo.getMstTabFormId().longValue();
	}

	public long getMstTabId() {
		return this.pojo.getMstTabId().longValue();
	}

	public String getMstTabMainFormHeight(int flag) {
		if(this.pojo.getMstTabMainFormHeight()==null){
			return "";
		}
		if(flag ==1){
			return this.pojo.getMstTabMainFormHeight();
		}
		return "height:"+this.pojo.getMstTabMainFormHeight()+";";
	}

	public String getOperatorName() {
		return this.pojo.getOperatorName();
	}

	public Date getOperatorTime() {
		return this.pojo.getOperatorTime();
	}
	
	public String getFormShowAll() {
		return this.pojo.getFormShowAll();
	}

	
	/**
	 * 空构造函数
	 *
	 */
	public SysFormconfigMstTabCacheCopy(){};
	
	/**
	 * 构造函数
	 * @param formId
	 * @param form
	 * @throws Exception 
	 */
	public  SysFormconfigMstTabCacheCopy(long formId,SysFormCopyCache form) throws Exception {
		IMstTabFormService service = (IMstTabFormService)SpringContextUtils.getBeanById("IMstTabFormService");
		ISysformconfigService service1 = (ISysformconfigService)SpringContextUtils.getBeanById("ISysformconfigService");
		SysFormconfigMstTab obj = service.queryMainTabByFormId(formId+"");
		this.setThisByDataObject(obj);
		long mstTabDetailId = this.getMstTabId();
		List<SysFormconfigMstTabDetail> objs = service.queryFormTabDetailListNoPage(mstTabDetailId+"");
		for(int i=0 ; i<objs.size(); i++){
			SysFormconfigMstTabDetailCacheCopy detail = new SysFormconfigMstTabDetailCacheCopy(objs.get(i),this.pojo);
			this.details.add(detail);
		}
		this.setMstGeneralParam();
		
	}
	
	
	/**
	 * DataObject 填充对象
	 * @param obj
	 */
	private void setThisByDataObject(SysFormconfigMstTab obj){
		this.pojo = obj;
	}
	
	/**
	 * 加载j主表表单的输出参数
	 * @param formId
	 */
	public void setMstGeneralParam(){
		ISysFormGeneralParamService paramService = (ISysFormGeneralParamService)SpringContextUtils.getBeanById("ISysFormGeneralParamService");
		String paramType = FormParamConstants.FORM_TAB;
		List<SysFormGeneralParam> params = paramService.queryGeneralParamByTypeAndTypeValue(paramType,this.pojo.getMstTabFormId().longValue());
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
	}
	

	public String getVerticaltype() {
		return this.pojo.getVerticaltype();
	}
}