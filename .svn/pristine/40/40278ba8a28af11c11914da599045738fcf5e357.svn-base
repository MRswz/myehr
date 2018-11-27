package com.myehr.service.impl.formmanage.form;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.myehr.mapper.app.grid.SysAppClassMapper;
import com.myehr.mapper.formmanage.form.SysFormColumnExpandMapper;
import com.myehr.mapper.formmanage.form.SysFormColumnMapper;
import com.myehr.pojo.app.grid.SysAppClass;
import com.myehr.pojo.app.grid.SysAppClassExample;
import com.myehr.pojo.formmanage.form.SysFormColumn;
import com.myehr.service.formmanage.form.ISysformconfigService;
import com.myehr.service.formmanage.form.IsysFormColumnService;


public class SysFormColumnServiceImpl implements IsysFormColumnService {
	
	@Autowired
	SysFormColumnMapper sysFormCoumnMapper ;
	
	@Autowired
	SysFormColumnExpandMapper sysFormColumnExpandMapper ;
	
	@Autowired 
	SysAppClassMapper appClassMapper;
	
	@Autowired 
	ISysformconfigService sysformconfigService;
	
	@Override
	public String saveFormColumns(List<Map> datas, String formId)
			throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SysFormColumn> queryCardFormColumns(String formId,boolean filterAuthority, boolean isShowSaveColumn,String userId) {
		// TODO Auto-generated method stub
		if (userId!=null) {
			if(userId.equals("1")){
				return sysFormColumnExpandMapper.queryColumnsByFormId(formId);
			}
			return sysFormColumnExpandMapper.queryColumnsByFormIdAndUserId(formId,userId);
		}
		return sysFormColumnExpandMapper.queryColumnsByFormId(formId);
	}
	
	@Override
	public List<SysFormColumn> queryimportColumns(String formId,String userId) {
		if (userId!=null) {
			if(userId.equals("1")){
				return sysFormColumnExpandMapper.queryColumnsByFormId(formId);
			}
			return sysFormColumnExpandMapper.queryImportColumnsByFormIdAndUserId(formId,userId);
		}
		return sysFormColumnExpandMapper.queryColumnsByFormId(formId);
	}
	
	@Override
	public List<SysFormColumn> queryColumnsByFormIdAndUserId(String formId,String userId) {
		// TODO Auto-generated method stub
		return sysFormColumnExpandMapper.queryColumnsByFormIdAndUserId(formId,userId);
	}

	@Override
	public boolean isPkColumn(String columnId, String formDefSaveTableormDef) {
		// TODO Auto-generated method stub
		// TODO 自动生成方法存根
		Map<String,String> params = new HashMap<String,String>();
		params.put("columnId", columnId);
		params.put("saveTable", formDefSaveTableormDef);
//		更新新的控件类型
		List<Map> objs = sysFormColumnExpandMapper.isPkColumn(params);
		if(objs.size()==0){
			return false;
		}
		return true;
	}

	@Override
	public List<Map> queryEntitysByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String checkColumnUi(String columnId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteOldGuiTypeAndSaveNew(String columnId,
			String oldGuiType, String newGuiType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	//com.myehr.pojo.formmanage.form.SysFormColumn
	public SysFormColumn queryColumnInfoByColumnId(String columnId) {
		// TODO Auto-generated method stub
		if(columnId==null){
			return null;
		}
		return  sysFormCoumnMapper.selectByPrimaryKey(new BigDecimal(columnId));
	}
	
	@Override
	public SysAppClass queryAppClassByColumnId(String columnId) throws Exception{
		// TODO Auto-generated method stub
		if(columnId==null||columnId.equals("null")||columnId.equals("")){
			return null;
		}
		System.out.println("****"+columnId+"*****");
		SysAppClassExample example = new SysAppClassExample();
		example.or().andFormColumnIdEqualTo(new BigDecimal(columnId));
		if(appClassMapper.selectByExample(example).size()>0){
			return appClassMapper.selectByExample(example).get(0);
		}
		return null;
	}

	@Override
	public Map isBusPkColumn(String columnId, String formDefSaveTable) {
		// TODO 自动生成方法存根
//		 TODO 自动生成方法存根
		Map<String,String> params = new HashMap<String,String>();
		params.put("columnId", columnId);
		params.put("saveTable", formDefSaveTable);
		List<Map> objs = sysFormColumnExpandMapper.isBusPkColumn(params);
		if(objs.size()==0){
			return null;
		}
		return objs.get(0);
	}
	
	@Override
	public Map queryEntityColumnByColumnId(String fieldId, String formDefSaveTable) {
		// TODO Auto-generated method stub
		if (fieldId.equals("null")) {
			return null;
		}else {
			return sysformconfigService.getEntityColumnByColumnId(fieldId);
		}
	}

}
