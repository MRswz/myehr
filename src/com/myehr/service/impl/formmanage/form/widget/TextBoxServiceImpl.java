package com.myehr.service.impl.formmanage.form.widget;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.myehr.pojo.formmanage.widget.SysFormTextboxExample;
import com.myehr.pojo.formmanage.widget.SysFormTextbox;
import com.myehr.mapper.formmanage.widget.SysFormTextboxMapper;

import com.myehr.service.formmanage.form.widget.ITextBoxService;

public class TextBoxServiceImpl implements ITextBoxService {

	@Autowired
	SysFormTextboxMapper mapper ;
	@Override
	public SysFormTextbox queryTextBoxInfoByColumnId(String columnId) {
		// TODO 自动生成方法存根
		SysFormTextboxExample example = new SysFormTextboxExample();
		SysFormTextboxExample.Criteria criteria = example.createCriteria();
		criteria.andTextboxFormColumnIdEqualTo(new BigDecimal(columnId));
		example.or(criteria);
		List<SysFormTextbox> list =   mapper.selectByExample(example);
		if(list.size()==0){
			System.out.println("字段ID为："+columnId+",未查出对应的textboxd对象");
			return null;
		}else {
			SysFormTextbox l = list.get(0);
			return l;
		}

	}

	@Override
	public String saveTextBoxInfo(Map obj) throws Exception {
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
