package com.myehr.pojo.formmanage.formCopy;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.myehr.common.util.SpringContextUtils;
import com.myehr.pojo.formmanage.form.SysSqlParams;
import com.myehr.pojo.sysParam.SysRequestParam;
import com.myehr.service.sqlparams.ISysSqlParamsService;

/*
 * sql参数类
 */
public class SysSqlParamsCacheCopy implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private SysSqlParams pojo;
	
	public SysSqlParams getPojo() {
		return pojo;
	}

	public void setPojo(SysSqlParams pojo) {
		this.pojo = pojo;
	}

	//	控件类型
	private Object gui ;
	
	public Object getGui() {
		return gui;
	}

	public void setGui(Object gui) {
		this.gui = gui;
	}


	public String getOperatorName() {
		return pojo.getOperatorName();
	}

	public Date getOperatorTime() {
		return pojo.getOperatorTime();
	}

	public String getSqlParamsCode() {
		return pojo.getSqlParamsCode();
	}

	public String getSqlParamsDataType() {
		return pojo.getSqlParamsDataType();
	}

	public String getSqlParamsDesc() { 
		return pojo.getSqlParamsDesc();
	}

	public String getSqlParamsGuiType() {
		return pojo.getSqlParamsGuiType();
	}

	public long getSqlParamsId() {
		return pojo.getSqlParamsId().longValue();
	}

	public String getSqlParamsName() {
		return pojo.getSqlParamsName();
	}
	
	public String getSqlParamsType() {
		return pojo.getSqlParamsType();
	}

	public String getSqlParamsValue() {
		return pojo.getSqlParamsValue();
	}
	
	
	public String getSqlParamsIsRequired() {
		return pojo.getSqlParamsIsRequired();
	}

	
	/**
	 * 获取点击事件函数名
	 * @return
	 */
	public String getOnClickFunName(String jsName){
		String rjsName = jsName.replace(".", "_");
		return rjsName+"_click()";
	}
	
	public String getOnValueChangeFunName(String jsName){
		String rjsName = jsName.replace(".", "_");
		return rjsName+"_valueChange()";
	}
	
	public String getOnValidationFunName(String jsName){
		String rjsName = jsName.replace(".", "_");
		return rjsName+"_validation()";
	}
	
	
	/**
	 * 空构造函数
	 *
	 */
	public SysSqlParamsCacheCopy(){};
	
	/**
	 * 通过参数id或者参数名称加载加载当前数据对象
	 *
	 */
	public SysSqlParamsCacheCopy(long sqlParamsId,String sqlParamsName){
		
		
		ISysSqlParamsService service = (ISysSqlParamsService)SpringContextUtils.getBeanById("ISysSqlParamsService");
		Map<String,String > param = new HashMap<String,String>();
		List<SysSqlParams>  objs = null;
		if(sqlParamsId!=0){
			param.put("sqlParamsId", sqlParamsId+"");
			objs = service.querySqlParams(null, param);
		}else if(sqlParamsName!=null) {
			param.put("sqlParamsName", sqlParamsName);
			objs = service.querySqlParams(null, param);
		}
		if(objs==null||objs.size()==0){
//			throw new RuntimeException("无法加载sqlParamsId："+sqlParamsId+" sqlParamsName:"+sqlParamsName+"对应的sql参数信息!");
		}else {
			setThisByDataObject(objs.get(0));
			//加载控件
			setgui();
		}
	};
	
	
	
	/**
	 * DataObject 填充对象
	 * @param obj
	 */
	private void setThisByDataObject(SysSqlParams obj){
		this.pojo =  obj;
	}
	
	/**
	 * 加载控件
	 * @param columnId
	 */
	private void setgui(){
		if(this.getSqlParamsGuiType()==null){
			this.gui = null;
			return ;
		}
		//查询textbox件类型
		if("1".equals(this.getSqlParamsGuiType())||"8".equals(this.getSqlParamsGuiType())){ //textbox控件
			this.gui = new SysTextBoxCacheCopy(this.getSqlParamsId()+"");
			
		}else if("2".equals(this.getSqlParamsGuiType())){ //单选下拉控件
			this.gui = new SysFormComboboxCacheCopy(this.getSqlParamsId()+"");
			
		/*}else if("3".equals(this.getSqlParamsGuiType())){ //单选框组
			this.gui = new SysRadiobuttonlist(this.sqlParamsId+"");
		}else if("4".equals(this.getSqlParamsGuiType())){ //复选框组
			this.gui = new SysRadiobuttonlist(this.sqlParamsId+"");*/
		}else if("5".equals(this.getSqlParamsGuiType())){
			this.gui = new SysCheckboxCacheCopy(this.getSqlParamsId()+"");
		}else if("6".equals(this.getSqlParamsGuiType())){
			this.gui = new SysDatepickerCacheCopy(this.getSqlParamsId()+"");
		/*}else if("7".equals(this.sqlParamsGuiType)){
			this.gui = new SysLookup(this.sqlParamsId+"");*/
		}
	}
	
	
}
