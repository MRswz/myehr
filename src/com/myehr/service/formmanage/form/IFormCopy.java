package com.myehr.service.formmanage.form;

import java.util.Map;

import com.myehr.pojo.formmanage.cache.SysFormconfigCache;
import com.myehr.pojo.formmanage.form.SysFormconfigWithBLOBs;

public interface IFormCopy {

	String cardFormCopy(String formId,String name) ;
	String gridFormCopy(String formId,String name) ;
	String treeFormCopy(String formId,String name) ;
	String mstFormCopy(String formId,String name) ;
	String tabsFormCopy(String formId,String name) ;
	String referUrl(SysFormconfigWithBLOBs form,String name) ;
	String removeRefer(SysFormconfigWithBLOBs form,String name) ;
	void importantTreeDatas(SysFormconfigCache formCache,Map map);
	void importantCardDatas(SysFormconfigCache formCache, Map map);
	
}
