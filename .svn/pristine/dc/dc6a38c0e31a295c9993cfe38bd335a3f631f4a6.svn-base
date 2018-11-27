package com.myehr.service.impl.formmanage.form.widget;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.myehr.mapper.formmanage.widget.SysFormRichtextMapper;
import com.myehr.pojo.formmanage.widget.SysFormRichtext;
import com.myehr.pojo.formmanage.widget.SysFormRichtextExample;


public class RichtextServiceImpl implements com.myehr.service.formmanage.form.widget.IRichtextService {
//	private static Logger log=TraceLoggerFactory.getLogger(RichtextServiceImpl.class);

	@Autowired
	SysFormRichtextMapper sRichtextMapper;
	
	public SysFormRichtext queryRichtextDetailByColumnId(String columnId){
		/*if(StringUtil.isBlank(columnId)){
			log.error("查询需要的参数columnId为空！");
			return null;
		}
		CriteriaType criteria = CriteriaType.FACTORY.create();
		criteria.set_entity("com.dcf.form.guiFormDataset.SysFormRichtext");
		criteria.set("_expr[1]/richtextFormColumnId", columnId);
		IDASCriteria ida = getDASTemplate().criteriaTypeToDASCriteria(criteria);
		DataObject[] objs = getDASTemplate().queryEntitiesByCriteriaEntity(DataObject.class, ida);
		if(objs!=null&&objs.length!=0){
			return objs[0];
		}*/
		if(columnId==null||columnId.equals("")){
			return null;
		}else {
			SysFormRichtextExample example = new SysFormRichtextExample();
			example.or().andRichtextFormColumnIdEqualTo(new BigDecimal(columnId));
			if(sRichtextMapper.selectByExample(example).size()>0){
				return sRichtextMapper.selectByExample(example).get(0);
			}else {
				return null;
			}
		}
	}

	public Map<String, Object> saveRichtextInfo(SysFormRichtext richtext,
			String userid, Date operatorTime) throws Exception {
		/*Map<String, Object> retMap=new HashMap<String, Object>();
		if(richtext==null){
			log.error("保存实体为空！");
			retMap.put("retCode", 0);
			return retMap;
		}
		String richtextId=richtext.getString("richtextId");
		if(StringUtil.isBlank(richtextId)){
			richtextId=String.valueOf(getDASTemplate().getNextSequence("SYS_FORM_RICHTEXT.RICHTEXT_ID"));
			richtext.set("richtextId",richtextId);
		}
		richtext.set("operatorName",userid);
		richtext.set("operatorTime",operatorTime);
		getDASTemplate().saveEntity(richtext);
		//设置返回信息ss
		retMap.put("retCode", 1);
		return retMap;*/
		return null;
	}

}
