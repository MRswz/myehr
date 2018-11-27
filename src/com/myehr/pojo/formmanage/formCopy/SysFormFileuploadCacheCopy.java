package com.myehr.pojo.formmanage.formCopy;

import java.io.Serializable;
import java.util.Date;

import com.myehr.common.util.SpringContextUtils;
import com.myehr.pojo.formmanage.cache.SysCardFormBeansUtil;
import com.myehr.pojo.formmanage.widget.SysFormFileupload;
import com.myehr.service.formmanage.form.ISysformconfigService;

public class SysFormFileuploadCacheCopy implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private SysFormFileupload pojo;
	
	private long fileuploadId;
	
	private String fileuploadFormColumnId;
	
	private String fileuploadInitFun;
	
	private String fileuploadDataFromType;
	
	private String fileuploadDataFromValue;
	
	private String fileuploadAutoUpload;
	
	private String fileuploadUploadFiletype;
	
	private Date operatorTime;
	
	private String  operatorName;
	
	private String fileuploadName ;
	
	private String uploadType;
	
	//上传文件最大数
	private long fileuploadFileCount ;
	

	public String getUploadType() {
		return uploadType;
	}


	public String getFileuploadName() {
		return fileuploadName;
	}


	public String getFileuploadAutoUpload() {
		return fileuploadAutoUpload;
	}

	public void setFileuploadAutoUpload(String fileuploadAutoUpload) {
		this.fileuploadAutoUpload = fileuploadAutoUpload;
	}

	public String getFileuploadDataFromType() {
		return fileuploadDataFromType;
	}

	public void setFileuploadDataFromType(String fileuploadDataFromType) {
		this.fileuploadDataFromType = fileuploadDataFromType;
	}

	public String getFileuploadDataFromValue() {
		return fileuploadDataFromValue;
	}

	public void setFileuploadDataFromValue(String fileuploadDataFromValue) {
		this.fileuploadDataFromValue = fileuploadDataFromValue;
	}

	public String getFileuploadFormColumnId() {
		return fileuploadFormColumnId;
	}

	public void setFileuploadFormColumnId(String fileuploadFormColumnId) {
		this.fileuploadFormColumnId = fileuploadFormColumnId;
	}

	public long getFileuploadId() {
		return fileuploadId;
	}

	public void setFileuploadId(long fileuploadId) {
		this.fileuploadId = fileuploadId;
	}

	public String getFileuploadInitFun() {
		return fileuploadInitFun;
	}

	public void setFileuploadInitFun(String fileuploadInitFun) {
		this.fileuploadInitFun = fileuploadInitFun;
	}

	public String getFileuploadUploadFiletype() {
		return fileuploadUploadFiletype;
	}

	public void setFileuploadUploadFiletype(String fileuploadUploadFiletype) {
		this.fileuploadUploadFiletype = fileuploadUploadFiletype;
	}

	public String getOperatorName() {
		return operatorName;
	}

	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
	}

	public Date getOperatorTime() {
		return operatorTime;
	}

	public void setOperatorTime(Date operatorTime) {
		this.operatorTime = operatorTime;
	}
	
	public void setFileuploadName(String jsId) {
		this.fileuploadName =  SysCardFormBeansUtil.SWF_FILEUPLOAD_VAR_NAME+jsId;
	}
	
	public long getFileuploadFileCount() {
		return fileuploadFileCount;
	}


	public SysFormFileupload getPojo() {
		return pojo;
	}


	public void setPojo(SysFormFileupload pojo) {
		this.pojo = pojo;
	}


	public void setUploadType(String uploadType) {
		this.uploadType = uploadType;
	}


	public void setFileuploadFileCount(long fileuploadFileCount) {
		this.fileuploadFileCount = fileuploadFileCount;
	}
	
	public void setUploadType() {
		if(this.fileuploadUploadFiletype!=null&&!"".equals(fileuploadUploadFiletype)) {
			if(fileuploadUploadFiletype.indexOf("*")>=0){
				this.uploadType = null;
			}else {
				this.uploadType = "'" + this.fileuploadUploadFiletype.replaceAll(",", "','") + "'";
			}
		}
	}

	

	public SysFormFileuploadCacheCopy(String columnId,String jsId) {
		// TODO 自动生成构造函数存根
		ISysformconfigService service = (ISysformconfigService)SpringContextUtils.getBeanById("ISysformconfigService");
		SysFormFileupload obj = service.getFileupload(columnId);
		if(obj!=null){
			this.setThisByDataObject(obj);
		}
		this.setFileuploadName(jsId);
		this.setUploadType();
	}
	
	/**
	 * DataObject 填充对象
	 * @param obj
	 */
	private void setThisByDataObject(SysFormFileupload obj){
		this.pojo = obj;
	}
}