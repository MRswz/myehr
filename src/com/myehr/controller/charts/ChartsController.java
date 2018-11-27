package com.myehr.controller.charts;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gwt.i18n.client.Messages.Select;
import com.myehr.controller.form.parambean.ResultTemplateColumn;
import com.myehr.mapper.formmanage.form.SysExecSqlMapper;
import com.myehr.mapper.formmanage.form.SysFormColumnMapper;
import com.myehr.mapper.formmanage.template.SysTemplateModelColumnMapper;
import com.myehr.mapper.formmanage.template.gridbycard.SysGridbycardTemplateColumnMapper;
import com.myehr.mapper.formmanage.widget.SysFormComboboxMapper;
import com.myehr.pojo.dict.DictData;
import com.myehr.pojo.formmanage.form.SysFormColumn;
import com.myehr.pojo.formmanage.form.SysFormColumnExample;
import com.myehr.pojo.formmanage.template.SysTemplateModelColumn;
import com.myehr.pojo.formmanage.template.SysTemplateModelColumnExample;
import com.myehr.pojo.formmanage.template.gridbycard.SysGridbycardTemplateColumn;
import com.myehr.pojo.formmanage.template.gridbycard.SysGridbycardTemplateColumnExample;
import com.myehr.pojo.formmanage.widget.SysFormCombobox;
import com.myehr.pojo.formmanage.widget.SysFormComboboxExample;
import com.myehr.service.formmanage.form.ISysformconfigService;
import com.myehr.test.dao.TMapperExt;


@Controller
@RequestMapping("/charts")
public class ChartsController {
//	@Autowired
	@Resource(name = "TMapperExt")  
	private TMapperExt tMapperExt;
	
	@Autowired
	private SysFormColumnMapper sysFormColumnMapper;
	
	@Autowired
	private SysFormComboboxMapper sysFormComboboxMapper;
	
	@Autowired
	private SysExecSqlMapper sExecSqlMapper;
	@Autowired
	private ISysformconfigService sysformconfigService;
	@Autowired
	private SysGridbycardTemplateColumnMapper sysgridbycardtemplatecolumnmapper;
	@Autowired
	private SysTemplateModelColumnMapper systemplatemodelcolumnmapper;
	
	//查询数据
	@RequestMapping("/searchChartsType")
	public @ResponseBody List<Map> searchData(HttpServletRequest request) throws Exception{
		String xAxisColumn =request.getParameter("xAxisColumn");
		String formDefSql =request.getParameter("formDefSql");
		String xColumnId =request.getParameter("xColumnId");
		String orderColumn = request.getParameter("orderColumn");
		String sql = "";
		if (orderColumn==null||orderColumn.equals("")||orderColumn.equals("null")) {
			sql = "Select "+xAxisColumn+" from ("+formDefSql+") o group by "+xAxisColumn+" order by "+xAxisColumn;
		}else {
			sql = "Select "+xAxisColumn+","+orderColumn+" from ("+formDefSql+") o group by "+xAxisColumn+","+orderColumn+" order by "+orderColumn;
		}
		
		SysFormComboboxExample comboboxExample = new SysFormComboboxExample();
		com.myehr.pojo.formmanage.widget.SysFormComboboxExample.Criteria comboboxCriteria = comboboxExample.createCriteria();
		comboboxCriteria.andComboboxFormColumnIdEqualTo(new BigDecimal(xColumnId));
		List<SysFormCombobox> comboboxList = sysFormComboboxMapper.selectByExample(comboboxExample);
		
		List<Map> t = (List<Map>) tMapperExt.queryByFormDefSql(sql);
		if (comboboxList.size()>0) {
			SysFormCombobox combobox = sysFormComboboxMapper.selectByExample(comboboxExample).get(0);
			String dictTypeCode = combobox.getComboboxGuiInitValue();
			if (combobox.getComboboxGuiInitType().equals("sql")) {
				List<DictData> ids = sysformconfigService.getCardDictDataByDictTypeCode(dictTypeCode, "sql");
				for (int i = 0; i < t.size(); i++) {
					for (int j = 0; j < ids.size(); j++) {
						String dictId = ids.get(j).getCode()+"";
						String xColumnvalue = t.get(i).get(xAxisColumn)+"";
						if (dictId.equals(xColumnvalue)) {
							t.get(i).put("dictName", ids.get(j).getName());
							break;
						}
					}
				}
			}else{
				List<DictData> entrys = sysformconfigService.getCardDictDataByDictTypeCode(dictTypeCode, "dict");
				for (int i = 0; i < t.size(); i++) {
					for (int j = 0; j < entrys.size(); j++) {
						String dictId = entrys.get(j).getCode()+"";
						String xColumnvalue = t.get(i).get(xAxisColumn)+"";
						if (dictId.equals(xColumnvalue)) {
							t.get(i).put("dictName", entrys.get(j).getName());
						}
					}
				}
			}
		}else {
			for (int i = 0; i < t.size(); i++) {
				t.get(i).put("dictName", t.get(i).get(xAxisColumn));
			}
		}
		return t;
	}

	@RequestMapping("/SavechChartsdata")
	public @ResponseBody String SavechChartsdata(HttpServletRequest request,@RequestBody List<SysGridbycardTemplateColumn> slist) throws Exception{
		SysGridbycardTemplateColumn data = new SysGridbycardTemplateColumn();
		Integer formDefId = Integer.parseInt(request.getParameter("formDefId"));
		Integer templateId = Integer.parseInt(request.getParameter("templateId"));;
		String result = "";
		SysGridbycardTemplateColumnExample Example = new SysGridbycardTemplateColumnExample();
		Example.or().andTemplateColumnFormDefIdEqualTo(formDefId).andTemplateColumnTemplateIdEqualTo(templateId);
		int num = sysgridbycardtemplatecolumnmapper.selectByExample(Example).size();
		for (SysGridbycardTemplateColumn sysGridbycardTemplateColumn : slist){
			
			if(num<1){
				sysgridbycardtemplatecolumnmapper.insert(sysGridbycardTemplateColumn);
				sysformconfigService.setChartConfigByformId(formDefId+"");
				result = "000";
			}else{
				sysgridbycardtemplatecolumnmapper.updateByPrimaryKey(sysGridbycardTemplateColumn);
//				sysgridbycardtemplatecolumnmapper.updateByExampleSelective(sysGridbycardTemplateColumn, Example);
				sysformconfigService.setChartConfigByformId(formDefId+"");
				result = "111";
			}
			
		}

		System.out.println("oo");
		
		return result;
		
	}
	@RequestMapping("/searchChartsData")
	@ResponseBody
	public List<SysGridbycardTemplateColumn> searchChartsData(HttpServletRequest request) throws Exception{
		
		String formid = request.getParameter("formDefId");
		String templateId = request.getParameter("templateId");
		SysGridbycardTemplateColumnExample example = new SysGridbycardTemplateColumnExample();
		example.or().andTemplateColumnFormDefIdEqualTo(Integer.valueOf(formid)).andTemplateColumnTemplateIdEqualTo(Integer.valueOf(templateId));
		List<SysGridbycardTemplateColumn> list = sysgridbycardtemplatecolumnmapper.selectByExample(example);
		
		System.out.println("数据回显");
        return list; 
	
	}
	@RequestMapping("/searchDatatest")
	
	public @ResponseBody ResultTemplateColumn searchsDatatest(HttpServletRequest request) throws Exception{
		
		String TEMPLATE_PARENT_PARAM_CODE = request.getParameter("templateParentParamCode");
		
		SysTemplateModelColumnExample example = new SysTemplateModelColumnExample();
		
		example.or().andTemplateParentParamCodeEqualTo(TEMPLATE_PARENT_PARAM_CODE);
		List<SysTemplateModelColumn> list = systemplatemodelcolumnmapper.selectByExample(example);
		
		ResultTemplateColumn result = new ResultTemplateColumn();
		List<Object> list_obj=new ArrayList<Object>();
		for (SysTemplateModelColumn sysTemplateModelColumn : list) {
			list_obj.add(sysTemplateModelColumn);
		}
		result.setRows(list_obj);
		result.setTotal(list.size());
		if(list.size()==0){
//			result = null;
//			result =String.join(",", list)+TEMPLATE_PARENT_PARAM_CODE;
		}
		
		System.out.println("数据回显");
		System.out.println("TEMPLATE_PARENT_PARAM_CODE="+TEMPLATE_PARENT_PARAM_CODE);
		System.out.println("list="+list.size());
		System.out.println("result="+result);
        return result; 
		
		
		
		
		
	}
	
}
