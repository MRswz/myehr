package com.myehr.mapper.formmanage.formexpand;

import java.util.List;
import java.util.Map;

import com.myehr.pojo.formmanage.form.EntityAndFieldCode;
import com.myehr.pojo.formmanage.form.SysFormconfig;
import com.myehr.pojo.formmanage.form.SysFormconfigWithBLOBs;

import com.myehr.pojo.formmanage.form.SysFormColumn;

public interface SysFormColumnMapperExpand {


	List<SysFormconfig> operation4(Map<String,Object> map);

	int operation3(Map<String,Object> map);
	
	void operation(Map<String,Object> map);
	
	String operation2(Map<String,Object> map);
	
	List<EntityAndFieldCode> opration5(Map<String,Object> map);
	
	SysFormconfigWithBLOBs getFormconfigWithBLOBsById(Map<String, String> map); 
	
	SysFormColumn queryColumnsByFormId(String formId); 
	
	void batchUpdateFormcolumns(Map map);
}
