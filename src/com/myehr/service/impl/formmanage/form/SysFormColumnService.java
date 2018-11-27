package com.myehr.service.impl.formmanage.form;

import java.util.List;
import java.util.Map;

import com.myehr.pojo.formmanage.form.SysFormButton;
import com.myehr.service.formmanage.form.IFormCacheBeanUtil;

public class SysFormColumnService implements IFormCacheBeanUtil {
	//private static final Logger log = DcfUtil.getLogger(SysFormColumnService.class);
	public Map getFormBean(String formId) {
		// TODO 自动生成方法存根
		
//		//创建form对象
//		
//		//读取form主表数据
//		CriteriaType criteria = CriteriaType.FACTORY.create(); 
//		criteria.set_entity("com.dcf.form.formdataset.SysFormconfig");
//		criteria.set("_expr[1]/formDefId" , formId);
//		IDASCriteria ida = getDASTemplate().criteriaTypeToDASCriteria(criteria);
//		List<Map> objs = getDASTemplate().queryEntitiesByCriteriaEntity(Map.class,ida);
//		if(objs==null||objs.length==0){
//			log.error("系统找不到表单id为 :"+formId+"  记录");
//			return null;
//		}
//		return objs[1];
		return null;
	}
	
	/**
	 * 获取指定用户和表单下的所有有权限字段
	 * @param formId
	 * @param userId
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public List<Map> queryFieldByUserIdAndFormId(String formId,String userId) {
		// TODO 自动生成方法存根
		//读取form主表数据
//		Map  param = new HashMap();
//		param.put("formId", formId);
//		param.put("userId", userId);
//		List<Map> objs = getDASTemplate().queryByNamedSql(Map.class, "com.dcf.form.runtime.cardform.queryFieldByUserIdAndFormId", param);
//		return  objs;
		return null;
	}
	

	/**
	 * 获取指定用户和表单下的所有按钮权限
	 * @param formId
	 * @param userId
	 * @return
	 */
	public List<SysFormButton> queryButtonsByUserIdAndFormId(String formId, String userId) {
		// TODO 自动生成方法存根
//		SysFormButtonExample example = new SysFormButtonExample();
//		SysFormButtonExample.Criteria criteria = example.createCriteria();
//		criteria.andFormButtonFormIdEqualTo(formId);
//		criteria.and
//		List<SysFormDatepicker> list = mapper.selectByExample(example);
//		if(list.size()==0){
//			System.out.println("字段ID为："+columnId+",未查出对应的textboxd对象");
//			return null;
//		}else {
//			SysFormDatepicker l = list.get(0);
//			return l;
//		}
		String sql = "select t1.button_role_id 'buttonRoleId', t1.button_id 'buttonId'"+
			  		 "from sys_button_role t1"+
			  		 "where role_id in (select ROLE_ID from sys_user_role where user_id = "+userId+")"+
			 		 "and t1.form_id = "+formId;
//		List<Map> Maps = mapper.queryByFormDefSql(sql);
		return null;
	}
}
