package com.myehr.service.impl.sqlparams;

import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.myehr.common.mybatis.Pager;
import com.myehr.mapper.formmanage.form.SysSqlParamsMapper;
import com.myehr.pojo.formmanage.form.SysSqlParams;
import com.myehr.pojo.formmanage.form.SysSqlParamsExample;
import com.myehr.service.sqlparams.ISysSqlParamsService;


public class SysSqlParamsServiceImpl  implements  ISysSqlParamsService {
	@Autowired
	private SysSqlParamsMapper sqlParamsMapper;
	
	@Override
	public Map[] buidSqlParamFolderTree(String nodeId, String nodeType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map[] buidSqlParamsTree(String nodeId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map[] buildTreeNodes(String nodeId, String nodeType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String checkSqlParamsByFolderId(String folderTreeId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteSqlParamsFolderById(String folderTreeId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String queryChildById(String folderTreeId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SysSqlParams> querySqlParams(Pager page, Map<String, String> param) {
		// TODO Auto-generated method stub
		SysSqlParamsExample example = new SysSqlParamsExample();
		SysSqlParamsExample.Criteria criteria = example.createCriteria();
		
		//IDASCriteria dasCriteria = getDASTemplate().createCriteria("com.dcf.system.sqlparams.sqlparamsdataset.SysSqlParams");
		
		Iterator<Map.Entry<String, String>> entries = param.entrySet().iterator();
		while (entries.hasNext()) {
		    Map.Entry<String, String> entry = entries.next();
		    String key = entry.getKey();
			String value = entry.getValue();
			if(value!=null&&!"".equals(value)){
				if("sqlParamsCode".equals(key)){
					criteria.andSqlParamsCodeLike(value);
				}else if("sqlParamSchemaId".equals(key)){
					criteria.andSqlParamSchemaIdEqualTo(new BigDecimal(value));
				}else if("sqlParamsDataType".equals(key)){
					criteria.andSqlParamsDataTypeEqualTo(value);
				}else if("sqlParamsDesc".equals(key)){
					criteria.andSqlParamsDescEqualTo(value);
				}else if("sqlParamsFolderId".equals(key)){
					criteria.andSqlParamsFolderIdEqualTo(new BigDecimal(value));
				}else if("sqlParamsGuiType".equals(key)){
					criteria.andSqlParamsGuiTypeEqualTo(value);
				}else if("sqlParamsId".equals(key)){
					criteria.andSqlParamsIdEqualTo(new BigDecimal(value));
				}else if("sqlParamsIsRequired".equals(key)){
					criteria.andSqlParamsIsRequiredEqualTo(value);
				}else if("sqlParamsName".equals(key)){
					criteria.andSqlParamsNameEqualTo(value);
				}else if("sqlParamsType".equals(key)){
					criteria.andSqlParamsTypeEqualTo(value);
				}else if("sqlParamsValue".equals(key)){
					criteria.andSqlParamsValueEqualTo(value);
				}
			}
		}
		if(page!=null){
			
			//DataObject[] tempss = getDASTemplate().queryEntitiesByCriteriaEntityWithPage(DataObject.class,dasCriteria,page);
			return null;
		}else {
			List<SysSqlParams> tempss =sqlParamsMapper.selectByExample(example);
			return tempss;
		}
	}

	@Override
	public Map querySqlParamsFolderById(String folderTreeId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String saveSqlParams(Map param) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String saveSqlParamsFolder(Map sqlParamsFolderTree) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
