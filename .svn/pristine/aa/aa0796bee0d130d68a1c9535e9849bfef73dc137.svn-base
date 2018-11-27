package com.myehr.service.impl.formmanage.form.widget;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.myehr.pojo.formmanage.widget.SysFormDatepicker;
import com.myehr.pojo.formmanage.widget.SysFormDatepickerExample;
import com.myehr.mapper.formmanage.widget.SysFormDatepickerMapper;

import com.myehr.service.formmanage.form.widget.IDatePickerService;

public class DatePickerServiceImpl implements IDatePickerService {

	@Autowired
	SysFormDatepickerMapper mapper ;
	@Override
	public SysFormDatepicker queryDatePickerDetailByColumnId(String columnId) {
		// TODO 自动生成方法存根
		SysFormDatepickerExample example = new SysFormDatepickerExample();
		SysFormDatepickerExample.Criteria criteria = example.createCriteria();
		criteria.andDatepickerFormColumnIdEqualTo(new BigDecimal(columnId));
		example.or(criteria);
		List<SysFormDatepicker> list =   mapper.selectByExample(example);
		if(list.size()==0){
			System.out.println("字段ID为："+columnId+",未查出对应的datepicker对象");
			return null;
		}else {
			SysFormDatepicker l = list.get(0);
			return l;
		}
		/* 老代码逻辑
		CriteriaType criteria = CriteriaType.FACTORY.create();
		criteria.set_entity("com.dcf.form.guiFormDataset.SysFormTextbox");
		criteria.set("_expr[1]/textboxFormColumnId", columnId);
		IDASCriteria ida = getDASTemplate().criteriaTypeToDASCriteria(criteria);
		DataObject[] objs = getDASTemplate().queryEntitiesByCriteriaEntity(DataObject.class, ida);
		if(objs!=null&&objs.length!=0){
			return objs[0];
		}
		return null;
		*/

	}

	@SuppressWarnings("rawtypes")
	@Override
	public String saveDatePickerInfo(Map obj) throws Exception {
		// TODO 自动生成方法存根
		if(obj==null) {
			return null;
		}
		/*DcfUtil.setCommonInfo(obj, "");
		//检查是否有主键
		String pk = obj.getString("textboxId");
		if (pk == null || "".equals(pk)) {
			//插入操作
			long nextSequence = getDASTemplate().getNextSequence("SYS_FORM_TEXTBOX.TEXTBOX_ID"); 
			obj.set("textboxId", nextSequence);
			getDASTemplate().insertEntity(obj);
		} else {
			//更新操作
			getDASTemplate().updateEntity(obj);
		}*/
		return "1";

	}

}
