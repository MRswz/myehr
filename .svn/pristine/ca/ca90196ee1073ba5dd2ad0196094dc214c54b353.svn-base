package com.myehr.pojo.formmanage.cache;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.myehr.common.util.SpringContextUtils;
import com.myehr.pojo.formmanage.form.SysFormGeneralParam;
import com.myehr.pojo.formmanage.form.SysFormconfig;
import com.myehr.pojo.formmanage.form.SysFormconfigMstTab;
import com.myehr.pojo.formmanage.form.SysFormconfigMstTabDetail;
import com.myehr.pojo.sysParam.SysRequestParam;
import com.myehr.service.formmanage.form.IMstTabFormService;
import com.myehr.service.formmanage.form.ISysformconfigService;
import com.myehr.service.formmanage.form.generalparam.ISysFormGeneralParamService;

public class SysFormconfigMstTabCache implements Serializable {
//	private static final com.eos.system.logging.Logger log = DcfUtil.getLogger(SysFormconfigMstTab.class);
    
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private SysFormconfigMstTab pojo;
	
	//关联表单对象
	private SysFormconfig form;
	
	//主表表单对象
	private SysFormconfigCache mainFrom;
	
	//对应从表数据
	private List<SysFormconfigMstTabDetailCache> details = new ArrayList<SysFormconfigMstTabDetailCache>();
			 

	/**
	 * 主表的输出参数
	 */
	private Map<String, List<SysFormGeneralParamCache>> generalParams = new HashMap<String,List<SysFormGeneralParamCache>>();

	public Map<String, List<SysFormGeneralParamCache>> getGeneralParams() {
		return generalParams;
	}

	public SysFormconfigMstTab getPojo() {
		return pojo;
	}

	public void setPojo(SysFormconfigMstTab pojo) {
		this.pojo = pojo;
	}

	public void setGeneralParams(Map<String, List<SysFormGeneralParamCache>> generalParams) {
		this.generalParams = generalParams;
	}

	public SysFormconfigCache getMainFrom() {
		return mainFrom;
	}

	public void setMainFrom(SysFormconfigCache mainFrom) {
		this.mainFrom = mainFrom;
	}

	public long getMstTabMainFormId() {
		System.out.println(this.pojo.getMstTabFormId());
		if (this.pojo.getMstTabMainFormId()==null) {
			return 0;
		}
		return this.pojo.getMstTabMainFormId().longValue();
	}
	
	public List<SysFormconfigMstTabDetailCache> getDetails() {
		return details;
	}

	public void setDetails(List<SysFormconfigMstTabDetailCache> details) {
		this.details = details;
	}

	public SysFormconfig getForm() {
		return form;
	}

	public void setForm(SysFormconfig form) {
		this.form = form;
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
	public SysFormconfigMstTabCache(){};
	
	/**
	 * 构造函数
	 * @param formId
	 * @param form
	 * @throws Exception 
	 */
	public  SysFormconfigMstTabCache(long formId,SysFormconfigCache form) throws Exception {
		IMstTabFormService service = (IMstTabFormService)SpringContextUtils.getBeanById("IMstTabFormService");
		ISysformconfigService service1 = (ISysformconfigService)SpringContextUtils.getBeanById("ISysformconfigService");
		SysFormconfigMstTab obj = service.queryMainTabByFormId(formId+"");
		this.setThisByDataObject(obj);
		if(form.getFormDefLayoutType().equals("5")){
			this.mainFrom = service1.getForm(this.getMstTabMainFormId()+"");
		}
		if(this.mainFrom ==null){
//			log.error("初始化主从的字表对象时，无法获取表单id为："+formId+" 的表单对象");
			System.out.println("初始化主从的字表对象时，无法获取表单id为："+formId+" 的表单对象");
		}
		long mstTabDetailId = this.getMstTabId();
		List<SysFormconfigMstTabDetail> objs = service.queryFormTabDetailListNoPage(mstTabDetailId+"");
		for(int i=0 ; i<objs.size(); i++){
			SysFormconfigMstTabDetailCache detail = new SysFormconfigMstTabDetailCache(objs.get(i),this.pojo);
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
	}
	
	/**
	 * 获取输出参数字符串
	 * @return
	 */
	public String getExportParamStr(SysRequestParam request){
		 List<SysFormGeneralParamCache> params=this.generalParams.get(FormParamConstants.FORM_MST_TAB); 
		 String paramStr = SysCardFormColumnUtil.getGeneralParamStr(params, request);
		
		return paramStr;
	}

	public String getVerticaltype() {
		return this.pojo.getVerticaltype();
	}
}