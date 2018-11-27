package com.myehr.pojo.sysuser;

public class SysUserSelect extends SysUser {
	private String empCode;
	private String empChinaName;
	private Integer orgId;
	private Integer roleId;
	
	private Integer orgCompId;
	private String orgCode;
	private String	orgName;
	private String	orgCompName;
	private String	orgCompCode;
	
	public Integer getRoleId() {
		return roleId;
	}
	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}
	public String getEmpCode() {
		return empCode;
	}
	public void setEmpCode(String empCode) {
		this.empCode = empCode;
	}
	public String getEmpChinaName() {
		return empChinaName;
	}
	public void setEmpChinaName(String empChinaName) {
		this.empChinaName = empChinaName;
	}
	public Integer getOrgId() {
		return orgId;
	}
	public void setOrgId(Integer orgId) {
		this.orgId = orgId;
	}
	public Integer getOrgCompId() {
		return orgCompId;
	}
	public void setOrgCompId(Integer orgCompId) {
		this.orgCompId = orgCompId;
	}
	public String getOrgCode() {
		return orgCode;
	}
	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}
	public String getOrgName() {
		return orgName;
	}
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
	public String getOrgCompName() {
		return orgCompName;
	}
	public void setOrgCompName(String orgCompName) {
		this.orgCompName = orgCompName;
	}
	public String getOrgCompCode() {
		return orgCompCode;
	}
	public void setOrgCompCode(String orgCompCode) {
		this.orgCompCode = orgCompCode;
	}
	

}
