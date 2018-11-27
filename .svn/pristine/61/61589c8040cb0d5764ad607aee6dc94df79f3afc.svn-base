package com.myehr.pojo.formmanage.formCopy;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.myehr.common.util.SpringContextUtils;
import com.myehr.pojo.formmanage.button.SysFormButtonAdd;
import com.myehr.pojo.formmanage.button.SysFormButtonParam;
import com.myehr.pojo.sysParam.SysRequestParam;
import com.myehr.service.formmanage.form.IButtonParamService;
import com.myehr.service.formmanage.form.ISysformconfigService;

public class SysFormButtonAddOrEditCacheCopy implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private SysFormButtonAdd  pojo;
	
	private List<SysFormButtonParam> params = new ArrayList<SysFormButtonParam>(); //参数集合

	public String getButtonAddButtonId() {
		return pojo.getButtonAddButtonId()+"";
	}

	public String getButtonAddExcType() {
		return pojo.getButtonAddExcType();
	}

	public String getButtonAddFormId() {
		return pojo.getButtonFormId()+"";
	}

	public String getButtonAddFun() {
		return pojo.getButtonAddFun();
	}

	public String getButtonAddHeight() {
		return pojo.getButtonAddHeight();
	}

	public long getButtonAddId() {
		return pojo.getButtonAddId().longValue();
	}

	public String getButtonAddInitFun() {
		return pojo.getButtonAddInitFun();
	}

	public String getButtonAddSql() {
		return pojo.getButtonAddSql();
	}

	public String getButtonAddTitle() {
		return pojo.getButtonAddTitle();
	}

	public String getButtonAddType() {
		return pojo.getButtonAddType();
	}

	public String getButtonAddUrl() {
		return pojo.getButtonAddUrl();
	}

	public String getButtonAddWidth() {
		return pojo.getButtonAddWidth();
	}

	public String getOperatorName() {
		return pojo.getOperatorName();
	}

	public Date getOperatorTime() {
		return pojo.getOperatorTime();
	}
	
	public List<SysFormButtonParam> getParams() {
		return params;
	}

	public void setParams(List<SysFormButtonParam> params) {
		this.params = params;
	}
	
	public String getButtonAddSuccessDeal() {
		return pojo.getButtonAddSuccessDeal();
	}
	
	/*
	 * 构造函数 通过DataObject加载对象
	 */
	public SysFormButtonAddOrEditCacheCopy(String buttonId){
		ISysformconfigService service = (ISysformconfigService)SpringContextUtils.getBeanById("ISysformconfigService");
		SysFormButtonAdd obj  =service.getButtonAdd(buttonId);
		if(obj!=null){
			this.pojo=obj;
			if(this.getButtonAddWidth()==null||"".equals(this.getButtonAddWidth())){
				this.pojo.setButtonAddWidth("300px");
			}
			if(this.getButtonAddHeight()==null||"".equals(this.getButtonAddHeight())){
				this.pojo.setButtonAddHeight("400px");
			}
			//查询对应的参数表信息
			IButtonParamService service1 = (IButtonParamService)SpringContextUtils.getBeanById("IButtonParamService");
			List<SysFormButtonParam> objs  =service1.querySysFormButtonParamByButtonId(obj.getButtonAddId()+"");
			
			if(objs!=null){
				for(SysFormButtonParam temp:objs){
					params.add(temp);
				}
			}
		}else {
			this.pojo = new SysFormButtonAdd();
			this.pojo.setButtonAddExcType("default");
			this.pojo.setButtonAddId(new BigDecimal(765));
			this.pojo.setButtonAddButtonId(new BigDecimal(buttonId));
			this.pojo.setButtonAddType("addRow");
			this.pojo.setButtonAddSuccessDeal("2");
		}
	}
	
	/**
	 * @param obj
	 */
	public void setThisByDataObject(SysFormButtonAdd obj){
		this.pojo= obj;
	}

	/**
	 * 获取拼接参数字符串
	 * @param request
	 * @return
	 */
	public String getParamStr(SysRequestParam request,boolean isEdit){
		String temp = isEdit?"isInit=true&":"";
		String temp1 = isEdit?"isInit=true&":"";
		String temp2 = isEdit?"isInit=true&":"";
		String result1 = "";
		if(this.params!=null&&this.params.size()>0){
			for(SysFormButtonParam param :params){
				String paramName = param.getButtonParamName().toUpperCase();
				String type = param.getButtonParamFrom(); // 参数来源
				String value = param.getButtonParamValue().toUpperCase();
				String result = "";
				if(type.equals("session")) { //session区
					//result = SysCardFormColumnUtil.getSessionValue(request,value,null);
					result = "${sessionScope."+paramName+"}";
				}else if(type.equals("global")) {// 全局参数
					result =  null;
				}else if(type.equals("parameter")) {// 参数 request参数区
					result = request.getRequest().getParameter(value);
				}else if(type.equals("constant")){ //常亮
					result =  value;
				}else if(type.equals("sql")){
					result = "sql功能为实现";
				}else if("grid".equals(type)) { //参数数据区
					if(isEdit) {
						result= "'+select."+value+"+'&";
					}
				}else if("request".equals(type)){
					//String requestParam="var "+paramName+"=getQueryString("+paramName+")";
					result1+="'${param."+paramName+"}'!='' ||";
					
					result = "${param."+paramName+"}";
				}else if(type.equals("containerParam")){
					result = "${sessionScope."+paramName+"_paramSession}";
				}
				if(result!=null){
					temp+= paramName+"='+"+value+"+'&";
					temp1+= paramName+"="+result+"&";
					temp2+= paramName+"="+result+"&";
				}
				
			}
			if(temp.length()>1){
				temp = temp.substring(0,temp.length()-1);
				if (result1.length()>2) {
					result1 = result1.substring(0,result1.length()-2);
				}else{
					result1 = "1==1";
				}
				
				temp=temp+"*"+temp1+"*"+result1+"*"+temp2;
			}
		}
		return temp;
	}
	
	/**
	 * 获取拼接参数字符串
	 * @param request
	 * @return
	 */
	public String getParamStrForBatch(SysRequestParam request,boolean isEdit){
		String temp = isEdit?"isInit=true&":"";
		String gridColumn = "";
		if(this.params!=null&&this.params.size()>0){
			for(SysFormButtonParam param :params){
				String paramName = param.getButtonParamName();
				String type = param.getButtonParamFrom(); // 参数来源
				String value = param.getButtonParamValue();
				String result = "";
				if(type.equals("session")) { //session区
					//result = SysCardFormColumnUtil.getSessionValue(request,value,null);
					result = "${sessionScope."+paramName+"}";
				}else if(type.equals("global")) {// 全局参数
					result =  null;
				}else if(type.equals("parameter")) {// 参数 request参数区
					result = request.getRequest().getParameter(value);
				}else if(type.equals("constant")){ //常亮
					result =  value;
				}else if(type.equals("sql")){
					result = "sql功能为实现";
				}else if("grid".equals(type)) { //参数数据区
					if(isEdit) {
						//result= "'+select."+paramName+"+'&";
						gridColumn+=paramName+",";
					}
				}else if("request".equals(type)){
					result = "${param."+paramName+"}";
				}else if(type.equals("containerParam")){
					result = "${sessionScope."+paramName+"_paramSession}";
				}
				if(result!=null && !result.equals("")){
					temp+= paramName+"="+result+"";
				}
				
			}
			if(temp.length()>1){
				temp=temp+"*"+gridColumn;
			}
		}
		return temp;
	}



	
}
