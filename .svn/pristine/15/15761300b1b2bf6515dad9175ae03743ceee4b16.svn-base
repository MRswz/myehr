package com.myehr.pojo.formmanage.cache;

import java.io.Serializable;
import java.util.Date;

import com.myehr.pojo.formmanage.form.SysFormGeneralParam;

public class SysFormGeneralParamCache implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	//通用参数对象
	private SysFormGeneralParam pojo;
	
	private String paramTypeStart; 
	
	public SysFormGeneralParam getPojo() {
		return pojo;
	}

	public void setPojo(SysFormGeneralParam pojo) {
		this.pojo = pojo;
	}

	private String paramTypeEnd;
	
	private String paramFromTypeValue; //参数来源类型值
	
	public String getOperatorName() {
		return pojo.getOperatorName();
	}

	public Date getOperatorTime() {
		return pojo.getOperatorTime();
	}

	public String getParamFromType() {
		return pojo.getParamFromType();
	}



	public String getParamFromTypeValue() {
		return paramFromTypeValue;
	}

	public void setParamFromTypeValue(String paramFromTypeValue) {
		this.paramFromTypeValue = paramFromTypeValue;
	}

	public long getParamId() {
		return pojo.getParamId().longValue();
	}

	public String getParamName() {
		return pojo.getParamName();
	}

	public String getParamType() {
		return pojo.getParamType();
	}

	public long getParamTypeValue() {
		return pojo.getParamTypeValue().longValue();
	}

	public String getParamTypeEnd() {
		return paramTypeEnd;
	}

	public void setParamTypeEnd(String paramTypeEnd) {
		this.paramTypeEnd = paramTypeEnd;
	}

	public String getParamTypeStart() {
		return paramTypeStart;
	}

	public void setParamTypeStart(String paramTypeStart) {
		this.paramTypeStart = paramTypeStart;
	}
	
	public SysFormGeneralParamCache(){}
	
	/**
	 * * 构造函数 通过DataObject加载对象
	 * @param obj
	 */
	public SysFormGeneralParamCache(SysFormGeneralParam obj) {
		this.pojo = obj;
		if(this.pojo.getParamType()!=null){
			String[] arr = this.pojo.getParamType().split("\\|");
			if(arr.length>=2){
				this.paramTypeStart = arr[0];
				this.paramTypeEnd = arr[1];
			}
		}
	}
	
	/**
	 * 获取赢藏表单html
	 * @return
	 */
	public String getHidenInputHtml(String solutionCode,String rulecode,String value){
		String str = "";
		String inputname = "params."+solutionCode+"."+this.pojo.getParamFromType()+"_"+this.pojo.getParamName();
		String inputind = rulecode+"."+this.pojo.getParamFromType()+"_"+this.pojo.getParamName();
		//str = SysCardFormBeansUtil.getNbsp(1)+"<input id=\""+inputind+"\" name=\""+inputname+"\" class=\"nui-hidden\"" + " value=\""+value+"\"/>"+SysCardFormBeansUtil.NEW_LINE_ONLY;
		return str;
	}
}
