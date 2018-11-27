package com.myehr.common.mybatis;

import java.io.Serializable;

public class DcfReponse implements Serializable {
	private static final long serialVersionUID = 8036764832512790193L;
	
	private boolean success = false;// 是否成功
	private String msg = null;// 消息
	private Object result = null;// 结果
	private Throwable t = null;
	
	public boolean isSuccess() {
		return this.success;
	}

	public String getMsg() {
		return this.msg;
	}

	public void setMsg(String value) {
		this.msg = value;
	}

	public Object getResult() {
		return this.result;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}
	
	public void setResult(Object result) {
		this.result = result;
	}
	
	public Throwable getException() {
		return this.t;
	}
	
	public void setException(Throwable t) {
		this.t = t;
	}
	
	public void setSuccessMsg(String msg) {
		this.success = true;
		this.msg = msg;
	}

	public void setFailureMsg(String msg, Throwable t) {
		this.success = false;
		this.msg = msg;
		this.t = t;
	}

	public void setSuccessResponse(Object result) {
		this.result = result;
		this.success = true;
	}

	public void setFailureResponse(Object result, String msg, Throwable t) {
		this.result = result;
		this.msg = msg;
		this.success = false;
		this.t = t;
	}
}
