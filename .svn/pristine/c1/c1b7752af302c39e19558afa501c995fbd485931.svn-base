package com.myehr.pojo.formmanage.cache;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.myehr.common.util.SpringContextUtils;
import com.myehr.pojo.formmanage.widget.SysFormDatepicker;
import com.myehr.service.formmanage.form.ISysformconfigService;

public class SysDatepickerCache implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private SysFormDatepicker pojo;

	public String getDatepickerAllowinput() {
		return pojo.getDatepickerAllowinput();
	}

	public String getDatepickerClickFun() {
		return pojo.getDatepickerClickFun();
	}

	public String getDatepickerDataFromType() {
		return pojo.getDatepickerDataFromType();
	}

	public String getDatepickerDataFromValue() {
		return pojo.getDatepickerDataFromValue();
	}

	public String getDatepickerFormat() {
		return pojo.getDatepickerFormat();
	}

	public String getDatepickerFormColumnId() {
		return pojo.getDatepickerFormColumnId()+"";
	}

	public long getDatepickerId() {
		return pojo.getDatepickerId().longValue();
	}

	public String getDatepickerInitFun() {
		return pojo.getDatepickerInitFun();
	}

	public String getDatepickerShowokbutton() {
		return pojo.getDatepickerShowokbutton();
	}

	public String getDatepickerShowclearbutton() {
		return pojo.getDatepickerShowclearbutton();
	}

	public String getDatepickerShowtime() {
		return pojo.getDatepickerShowtime();
	}

	public String getDatepickerShowtodaybutton() {
		return pojo.getDatepickerShowtodaybutton();
	}

	public String getDatepickerTimeformat() {
		return pojo.getDatepickerTimeformat();
	}

	public String getDatepickerValuechangeFun() {
		return pojo.getDatepickerValuechangeFun();
	}

	public String getOperatorName() {
		return pojo.getOperatorName();
	}

	public Date getOperatorTime() {
		return pojo.getOperatorTime();
	}

	public String getDatepickerDrawdateFun() {
		return pojo.getDatepickerDrawdateFun();
	}
	
	public String getDatepickerCheckFun() {
		return pojo.getDatepickerCheckFun();
	}
	
	public SysFormDatepicker getPojo() {
		return pojo;
	}

	public void setPojo(SysFormDatepicker pojo) {
		this.pojo = pojo;
	}

	/**
	 * 提供空的构造函数
	 *
	 */
	public SysDatepickerCache(){}
	
	public  SysDatepickerCache(String columnId) {
		ISysformconfigService service = (ISysformconfigService)SpringContextUtils.getBeanById("ISysformconfigService");
		SysFormDatepicker obj = service.getDatepicker(columnId+"");
		this.setThisByDataObject(obj);
	}
	

	
	
	/**
	 * DataObject 填充对象
	 * @param obj
	 */
	private void setThisByDataObject(SysFormDatepicker obj){
		if(obj!=null){
			this.pojo = (SysFormDatepicker) obj;
		}else{
			this.pojo= new SysFormDatepicker();
			this.pojo.setDatepickerId(new BigDecimal(0));
			this.pojo.setDatepickerFormColumnId(new BigDecimal(0));
			this.pojo.setDatepickerFormat("yyyy-MM-dd");
			this.pojo.setDatepickerShowtime("0");
			this.pojo.setDatepickerShowokbutton("0");
			this.pojo.setDatepickerShowclearbutton("1");
			this.pojo.setDatepickerAllowinput("0");
			this.pojo.setDatepickerShowtodaybutton("1");
			this.pojo.setOperatorName("1");
		}
		
	}
}
