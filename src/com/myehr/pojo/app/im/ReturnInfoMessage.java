package com.myehr.pojo.app.im;

import java.math.BigDecimal;

public class ReturnInfoMessage {

	BigDecimal messageId;
	
	String saveStatus;
	
	String operationType;

	public BigDecimal getMessageId() {
		return messageId;
	}

	public void setMessageId(BigDecimal messageId) {
		this.messageId = messageId;
	}

	public String getSaveStatus() {
		return saveStatus;
	}

	public void setSaveStatus(String saveStatus) {
		this.saveStatus = saveStatus;
	}

	public String getOperationType() {
		return operationType;
	}

	public void setOperationType(String operationType) {
		this.operationType = operationType;
	}
	
	
}
