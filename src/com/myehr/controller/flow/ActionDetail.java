package com.myehr.controller.flow;

public class ActionDetail {
	
	String isToCreator;//驳回发起人
	
	String nextOrder;//驳回具体节点

	public String getIsToCreator() {
		return isToCreator;
	}

	public void setIsToCreator(String isToCreator) {
		this.isToCreator = isToCreator;
	}

	public String getNextOrder() {
		return nextOrder;
	}

	public void setNextOrder(String nextOrder) {
		this.nextOrder = nextOrder;
	}
	
	
	
}
