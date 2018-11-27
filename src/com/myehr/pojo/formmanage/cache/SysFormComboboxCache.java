package com.myehr.pojo.formmanage.cache;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.myehr.common.util.SpringContextUtils;
import com.myehr.pojo.formmanage.form.SysFormGeneralParam;
import com.myehr.pojo.formmanage.widget.SysFormCombobox;
import com.myehr.service.formmanage.form.ISysformconfigService;
import com.myehr.service.formmanage.form.generalparam.ISysFormGeneralParamService;

public class SysFormComboboxCache implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SysFormCombobox getPojo() {
		return pojo;
	}

	public void setPojo(SysFormCombobox pojo) {
		this.pojo = pojo;
	}

	private SysFormCombobox pojo;
	
	//保留字段对象
	private  SysFormColumnCache column ;
	
	
	/*private Date operatorTime;
	
	private String  operatorName;*/
	
	/**
	 * 该控件对应的通用参数
	 */
	private  Map<String,List<SysFormGeneralParamCache>> generalParams = new HashMap<String,List<SysFormGeneralParamCache>>();

	public Map<String,List<SysFormGeneralParamCache>> getGeneralParams() {
		return generalParams;
	}

	public void setGeneralParams(Map<String,List<SysFormGeneralParamCache>> generalParams) {
		this.generalParams = generalParams;
	}

	public String getComboboxAllowinput() {
		return pojo.getComboboxAllowinput();
	}

	public String getComboboxcheckFun() {
		return pojo.getComboboxcheckFun();
	}

	public String getComboboxCheckSelf() {
		return pojo.getComboboxCheckSelf();
	}

	public String getComboboxCheckType() {
		return pojo.getComboboxCheckType();
	}

	public String getComboboxClickFun() {
		return pojo.getComboboxClickFun();
	}

	public String getComboboxDatafield() {
		return pojo.getComboboxDatafield();
	}

	public String getComboboxDataFromType() {
		return pojo.getComboboxDataFromType();
	}

	public String getComboboxDataFromValue() {
		return pojo.getComboboxDataFromValue();
	}

	public String getComboboxEmptytext() {
		return pojo.getComboboxEmptytext();
	}

	public String getComboboxFormColumnId() {
		return pojo.getComboboxFormColumnId()+"";
	}

	public String getComboboxGuiInitType() {
		return pojo.getComboboxGuiInitType();
	}

	public String getComboboxGuiInitValue() {
		return pojo.getComboboxGuiInitValue();
	}

	public long getComboboxId() {
		return pojo.getComboboxId().longValue();
	}

	public String getComboboxInitFun() {
		return pojo.getComboboxInitFun();
	}

	public String getComboboxNullitemtext() {
		return pojo.getComboboxNullitemtext();
	}

	public String getComboboxShownullitem() {
		return pojo.getComboboxShownullitem();
	}

	public String getComboboxTextfield() {
		return pojo.getComboboxTextfield();
	}

	public String getComboboxValuechangeFun() {
		return pojo.getComboboxValuechangeFun();
	}

	public String getComboboxValuefield() {
		return pojo.getComboboxValuefield();
	}

	public String getOperatorName() {
		return pojo.getOperatorName();
	}

	public Date getOperatorTime() {
		return pojo.getOperatorTime();
	}
	
	public String getComboboxMultiselect() {
		return pojo.getComboboxMultiselect();
	}
	
	public SysFormComboboxCache(){}
	
	public SysFormComboboxCache(String columnId,SysFormColumnCache column) {
		// TODO 自动生成构造函数存根
		//IComboBoxService service = (IComboBoxService)ApplicationContextFactory.getContext().getBean("IComboBoxService");
		ISysformconfigService service = (ISysformconfigService)SpringContextUtils.getBeanById("ISysformconfigService");
		SysFormCombobox obj = service.getCombobox(columnId+"");
		if(obj!=null){
			this.pojo=obj;
			//加载通用参数对象数据
			//ISysFormGeneralParamService
			/*ISysFormGeneralParamService paramService = (ISysFormGeneralParamService)ApplicationContextFactory.getContext().getBean("ISysFormGeneralParamService");
			String paramType = FormParamConstants.COLUMN_COMBOBOX;
			Map[] params = paramService.queryGeneralParamByTypeAndTypeValue(paramType,this.pojo.getComboboxId());
			for(int i=0; i<params.length; i++){
				SysFormGeneralParamCache p = new SysFormGeneralParamCache(params[i]);
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
			}*/
			
			ISysFormGeneralParamService paramService = (ISysFormGeneralParamService)SpringContextUtils.getBeanById("ISysFormGeneralParamService");
			String paramType = FormParamConstants.COLUMN_COMBOBOX;
			List<SysFormGeneralParam> params = paramService.queryGeneralParamByTypeAndTypeValue(paramType,Long.parseLong(this.pojo.getComboboxId()+""));
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
	}
	
	
	/**
	 * DataObject 填充对象
	 * @param obj
	 */
	private void setThisByDataObject(Map obj){
		this.pojo = (SysFormCombobox) obj;
	}
	

	public long getComboboxGuiInitExcsqlId() {
		return 0;
		//return pojo.getComboboxGuiInitExcsqlId().longValue();
	}

	public SysFormColumnCache getColumn() {
		return column;
	}

	public void setColumn(SysFormColumnCache column) {
		this.column = column;
	}


	
}
