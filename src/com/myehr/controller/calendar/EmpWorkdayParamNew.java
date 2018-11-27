package com.myehr.controller.calendar;

import java.util.List;

import com.myehr.pojo.calendar.Kcalendar;

public class EmpWorkdayParamNew {
	String empIds;
	
	String empCodes;
	
	List<Kcalendar> workdays;
	
	Integer zoneid;

	public String getEmpIds() {
		return empIds;
	}

	public void setEmpIds(String empIds) {
		this.empIds = empIds;
	}

	public String getEmpCodes() {
		return empCodes;
	}

	public void setEmpCodes(String empCodes) {
		this.empCodes = empCodes;
	}

	public List<Kcalendar> getWorkdays() {
		return workdays;
	}

	public void setWorkdays(List<Kcalendar> workdays) {
		this.workdays = workdays;
	}

	public Integer getZoneid() {
		return zoneid;
	}

	public void setZoneid(Integer zoneid) {
		this.zoneid = zoneid;
	}

}
