package com.myehr.service.impl.formmanage.form;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.myehr.mapper.formmanage.widget.SysFormComboboxMapper;
import com.myehr.pojo.formmanage.widget.SysFormCombobox;
import com.myehr.pojo.formmanage.widget.SysFormComboboxExample;
import com.myehr.pojo.formmanage.widget.SysFormComboboxExample.Criteria;
import com.myehr.service.formmanage.form.IComboBoxService;

public class ComboBoxServiceImpl implements IComboBoxService{
	//private static Logger log=TraceLoggerFactory.getLogger(ComboBocServiceImpl.class);
	@Autowired
	private SysFormComboboxMapper comboboxMapper;
	
	/**
	 * 保存下拉列表配置信息
	 * @param comboBox 
	 * @param userid 
	 * @param operatorTime 
	 * @return
	 */
	public Map<String, Object> saveComboBoxInfo(Map comboBox,String userid,Date operatorTime) throws Exception {
		Map<String, Object> retMap=new HashMap<String, Object>();
		if(comboBox==null){
			System.out.println("保存实体为空！");
			//log.error("保存实体为空！");
			retMap.put("retCode", 0);
			return retMap;
		}
		String comboboxId=(String) comboBox.get("comboboxId");
		if(comboboxId.isEmpty()){
			comboboxId=String.valueOf("SYS_FORM_COMBOBOX.COMBOBOX_ID");
			comboBox.put("comboboxId",comboboxId);
		}
		comboBox.put("operatorName",userid);
		comboBox.put("operatorTime",operatorTime);
		SysFormCombobox comboBox1 =(SysFormCombobox) comboBox;
		comboboxMapper.insert(comboBox1);
		//设置返回信息ss
		retMap.put("retCode", 1);
		retMap.put("comboboxId", comboboxId);
		return retMap;
	}

	/**
	 * 根据主键查询下拉列表信息
	 * @param comboboxId
	 * @return
	 */
	public SysFormCombobox queryComboBoxByColumnId(String columnId) {
		if(columnId.isEmpty()){
			//log.error("查询需要的参数columnId为空！");
			System.out.println("查询需要的参数columnId为空！");
			return null;
		}
		SysFormComboboxExample example = new SysFormComboboxExample();
		Criteria criteria = example.createCriteria();
		BigDecimal columnId1 = new BigDecimal(columnId);
		criteria.andComboboxFormColumnIdEqualTo(columnId1);

		List<SysFormCombobox> objs = comboboxMapper.selectByExample(example);//getDASTemplate().queryEntitiesByCriteriaEntity(DataObject.class, ida);
		if(objs!=null&&objs.size()!=0){
			return  objs.get(0);
		}
		return null;
	}
	
}
