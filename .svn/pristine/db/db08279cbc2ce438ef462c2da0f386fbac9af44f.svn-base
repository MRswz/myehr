package com.myehr.service.impl.formmanage.form;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.myehr.mapper.formmanage.widget.SysFormDatepickerMapper;
import com.myehr.pojo.formmanage.form.SysFormGroupExample.Criteria;
import com.myehr.pojo.formmanage.widget.SysFormDatepicker;
import com.myehr.pojo.formmanage.widget.SysFormDatepickerExample;
import com.myehr.pojo.formmanage.widget.SysFormTextbox;
import com.myehr.pojo.formmanage.widget.SysFormTextboxExample;
import com.myehr.service.formmanage.form.IDatePickerService;

public class DatePickerServiceImpl implements IDatePickerService {
@Autowired
SysFormDatepickerMapper mapper;
//	private static Logger log=TraceLoggerFactory.getLogger(DatePickerServiceImpl.class);
	@Override
	public Map<String, Object> saveDatePickerInfo(SysFormDatepicker datePicker,
			String userid, Date operatorTime) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SysFormDatepicker queryDatePickerDetailByColumnId(String columnId) {
		// TODO Auto-generated method stub
//		if(StringUtil.isBlank(columnId)){
//			log.error("查询需要的参数columnId为空！");
//			return null;
//		}
		SysFormDatepickerExample example = new SysFormDatepickerExample();
		SysFormDatepickerExample.Criteria criteria = example.createCriteria();
		criteria.andDatepickerFormColumnIdEqualTo(new BigDecimal(columnId));
		List<SysFormDatepicker> list = mapper.selectByExample(example);
		if(list.size()==0){
			System.out.println("字段ID为："+columnId+",未查出对应的textboxd对象");
			return null;
		}else {
			SysFormDatepicker l = list.get(0);
			return l;
		}
	}
}
