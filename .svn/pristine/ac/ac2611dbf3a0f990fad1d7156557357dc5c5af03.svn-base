package com.myehr.service.impl.formmanage.form;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.myehr.mapper.formmanage.form.SysFormWhereMapper;
import com.myehr.pojo.formmanage.form.SysFormWhere;
import com.myehr.pojo.formmanage.form.SysFormWhereExample;
import com.myehr.service.formmanage.form.IWhereService;


public class WhereServiceImpl  implements IWhereService {
	@Autowired
	SysFormWhereMapper sWhereMapper;
	
	//通过表单id查询出该配置下的过滤条件(卡片式)
	public List<SysFormWhere> queryFormWhere(String formId, String otherType) {
		// TODO 自动生成方法存根
		SysFormWhereExample example = new SysFormWhereExample();
		SysFormWhereExample.Criteria criteria = example.createCriteria();
		criteria.andFormWhereFormDefIdEqualTo(new BigDecimal(formId));
		example.setOrderByClause("FORM_WHERE_SORT");
		List<SysFormWhere> objs = sWhereMapper.selectByExample(example);
		return objs;
	}
	
	public String saveFormWhere(List<Map> objs) throws Exception {
		// TODO 自动生成方法存根
//		if(objs ==null){
//			return "-1";
//		}
//		for(int i=0; i<objs.size(); i++){
//			String _state = (String) objs.get(i).get("_state");
//			if("added".equals(_state)){
//				long nextSequence = getDASTemplate().getNextSequence("SYS_FORM_WHERE.FORM_WHERE_ID");
//				objs.get(i).put("formWhereId", nextSequence);
//				DcfUtil.setCommonInfo(objs.get(i), null);
//				getDASTemplate().insertEntity(objs.get(i));
//			}
//			if("modified".equals(_state)){
//				DcfUtil.setCommonInfo(objs.get(i), null);
//				getDASTemplate().updateEntity(objs.get(i));
//			}
//			if("removed".equals(_state)){
//				DcfUtil.setCommonInfo(objs.get(i), null);
//				getDASTemplate().deleteEntity(objs.get(i));
//			}
//		}
		return "1";
	}
}
