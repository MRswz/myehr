package com.myehr.service.impl.formmanage.form.generalparam;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.myehr.mapper.formmanage.form.SysFormGeneralParamMapper;
import com.myehr.pojo.formmanage.form.SysFormGeneralParam;
import com.myehr.pojo.formmanage.form.SysFormGeneralParamExample;
import com.myehr.service.formmanage.form.generalparam.ISysFormGeneralParamService;


public class SysFormGeneralParamServiceImpl  implements ISysFormGeneralParamService{
	@Autowired
	SysFormGeneralParamMapper mapper ;
	
	/**
	 * 根据通用参数分类模糊和关联值查询对应配置的参数数据
	 * @return
	 */
	public List<SysFormGeneralParam> queryGeneralParamByTypeAndTypeValue(String paramTypeLike,long value){
		SysFormGeneralParamExample example = new SysFormGeneralParamExample();
		paramTypeLike = paramTypeLike==null?null:paramTypeLike;
		example.or().andParamTypeLike("%"+paramTypeLike+"|%").andParamTypeValueEqualTo(new BigDecimal(value));
		List<SysFormGeneralParam> params = mapper.selectByExample(example);
		return params;
	}

	public String saveFormGeneralParams(Map[] formGeneralParams) throws Exception{
		/*for (DataObject param : formGeneralParams) {
			String state = (String) param.get("_state");
			if ("added".equals(state)) {
				long pk = getDASTemplate().getNextSequence(
						"SysFormGeneralParam.PARAM_ID");
				param.set("paramId", pk);
				getDASTemplate().insertEntity(param);
			} else if ("removed".equals(state) || "deleted".equals(state)) {
				getDASTemplate().deleteEntity(param);
			} else if ("modified".equals(state)) {
				getDASTemplate().updateEntity(param);
			}
		}
		return "1";*/
		return null;
	}
	
	/**
	 * 根据通用参数分类模糊皮套和关联值查询对应配置的参数数据
	 * @return
	 */
	public Map[] loadGeneralParamInfo(String paramType,long value){
		/*String entityName = "com.dcf.form.formdataset.SysFormGeneralParam";
		CriteriaType criteria =  CriteriaType.FACTORY.create();
		criteria.set_entity(entityName);
		if(value!=0){
			criteria.set("_expr[1]/paramTypeValue" , value);
		}
		if(paramType!=null){
			criteria.set("_expr[2]/paramType" , paramType);
		}
		IDASCriteria ida = getDASTemplate().criteriaTypeToDASCriteria(criteria);
		DataObject[] objs = getDASTemplate().queryEntitiesByCriteriaEntity(DataObject.class,ida);
		return objs;*/
		return null;
	}
	
	/**
	 * 通过id加载参数对象
	 * @return
	 */
	public Map loadGeneralParamInfoById(long paramId){
		/*String entityName = "com.dcf.form.formdataset.SysFormGeneralParam";
		DataObject temp = DataObjectUtil.createDataObject(entityName);
		temp.set("paramId", paramId);
		getDASTemplate().expandEntity(temp);
		return temp;*/
		return null;
	}
	
	/**
	 * 通过方案ID获取该方案对应的计算按钮配置参数
	 * @return
	 */
	public Map[] loadFormGeneralParamSolutionTree(long solutionId){
		/*String entityName = "com.dcf.form.formbuttondataset.QFormGenralParamSolutionTree";
		CriteriaType criteria =  CriteriaType.FACTORY.create();
		criteria.set_entity(entityName);
		criteria.set("_expr[1]/solutionId" , solutionId);
		IDASCriteria ida = getDASTemplate().criteriaTypeToDASCriteria(criteria);
		DataObject[] objs = getDASTemplate().queryEntitiesByCriteriaEntity(DataObject.class,ida);
		for(int i=0; i<objs.length; i++){
			objs[i].set("nodeName", objs[i].getString("dictEntryName")+"("+ objs[i].getString("paramName")+")");
			objs[i].set("nodeId", objs[i].getString("paramId"));
			objs[i].set("nodeType", "generalParam");
			objs[i].set("iconCls", "icon-folder");
		}
		return objs;*/
		return null;
	}
	
	
}
