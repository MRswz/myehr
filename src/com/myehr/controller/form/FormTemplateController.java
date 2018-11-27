package com.myehr.controller.form;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import net.sf.json.JSONArray;
import net.sf.json.JsonConfig;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import Test.ChuangLanSmsDemo.src.com.chuanglan.sms.request.SmsSendRequest;
import Test.ChuangLanSmsDemo.src.com.chuanglan.sms.response.SmsSendResponse;
import Test.ChuangLanSmsDemo.src.com.chuanglan.sms.util.ChuangLanSmsUtil;

import com.alibaba.fastjson.JSON;
import com.myehr.common.mybatis.MybatisUtil;
import com.myehr.common.util.ChangeCode;
import com.myehr.common.util.GetRequestJsonUtils;
import com.myehr.common.util.MyEhrJDBCUtil;
import com.myehr.common.util.ResultMap;
import com.myehr.controller.form.parambean.ResultGroups;
import com.myehr.controller.form.parambean.ResultTemplateColumn;
import com.myehr.controller.form.parambean.TemplateResultGroups;
import com.myehr.mapper.formmanage.form.SysFormColumnMapper;
import com.myehr.mapper.formmanage.form.SysFormconfigMapper;
import com.myehr.mapper.formmanage.gui.SysCardTemplateMapper;
import com.myehr.mapper.formmanage.template.SysTemplateColumnMapper;
import com.myehr.mapper.formmanage.template.SysTemplateGroupMapper;
import com.myehr.mapper.formmanage.template.SysTemplateMapper;
import com.myehr.mapper.formmanage.template.SysTemplateModelColumnMapper;
import com.myehr.mapper.formmanage.template.SysTemplateModelMapper;
import com.myehr.mapper.formmanage.template.SysTemplateSqlMapper;
import com.myehr.mapper.formmanage.template.gridbycard.SysGridbycardTemplateColumnMapper;
import com.myehr.mapper.formmanage.template.timeaxis.SysTimeaxisTemplateColumnMapper;
import com.myehr.mapper.formmanage.template.widget.SysTemplateCheckboxMapper;
import com.myehr.mapper.formmanage.template.widget.SysTemplateCheckboxlistMapper;
import com.myehr.mapper.formmanage.template.widget.SysTemplateComboboxMapper;
import com.myehr.mapper.formmanage.template.widget.SysTemplateDatepickerMapper;
import com.myehr.mapper.formmanage.template.widget.SysTemplateLookupMapper;
import com.myehr.mapper.formmanage.template.widget.SysTemplateRichtextMapper;
import com.myehr.mapper.formmanage.template.widget.SysTemplateTextareaMapper;
import com.myehr.mapper.formmanage.template.widget.SysTemplateTextboxMapper;
import com.myehr.mapper.formmanage.templateexpand.SysTemplateExpandMapper;
import com.myehr.pojo.entity.SysEntity;
import com.myehr.pojo.formmanage.form.SysFormColumn;
import com.myehr.pojo.formmanage.form.SysFormColumnExample;
import com.myehr.pojo.formmanage.form.SysFormGroup;
import com.myehr.pojo.formmanage.form.SysFormGroupExample;
import com.myehr.pojo.formmanage.form.SysFormconfigWithBLOBs;
import com.myehr.pojo.formmanage.template.SysTemplate;
import com.myehr.pojo.formmanage.template.SysTemplateColumn;
import com.myehr.pojo.formmanage.template.SysTemplateColumnExample;
import com.myehr.pojo.formmanage.template.SysTemplateExample;
import com.myehr.pojo.formmanage.template.SysTemplateGroup;
import com.myehr.pojo.formmanage.template.SysTemplateGroupExample;
import com.myehr.pojo.formmanage.template.SysTemplateModel;
import com.myehr.pojo.formmanage.template.SysTemplateModelColumn;
import com.myehr.pojo.formmanage.template.SysTemplateModelColumnExample;
import com.myehr.pojo.formmanage.template.SysTemplateModelExample;
import com.myehr.pojo.formmanage.template.SysTemplateSql;
import com.myehr.pojo.formmanage.template.SysTemplateSqlExample;
import com.myehr.pojo.formmanage.template.gridbycard.SysGridbycardTemplateColumn;
import com.myehr.pojo.formmanage.template.gridbycard.SysGridbycardTemplateColumnExample;
import com.myehr.pojo.formmanage.template.timeaxis.SysTimeaxisTemplateColumn;
import com.myehr.pojo.formmanage.template.timeaxis.SysTimeaxisTemplateColumnExample;
import com.myehr.pojo.formmanage.template.widget.SysTemplateCheckbox;
import com.myehr.pojo.formmanage.template.widget.SysTemplateCheckboxExample;
import com.myehr.pojo.formmanage.template.widget.SysTemplateCheckboxlist;
import com.myehr.pojo.formmanage.template.widget.SysTemplateCheckboxlistExample;
import com.myehr.pojo.formmanage.template.widget.SysTemplateCombobox;
import com.myehr.pojo.formmanage.template.widget.SysTemplateComboboxExample;
import com.myehr.pojo.formmanage.template.widget.SysTemplateDatepicker;
import com.myehr.pojo.formmanage.template.widget.SysTemplateDatepickerExample;
import com.myehr.pojo.formmanage.template.widget.SysTemplateLookup;
import com.myehr.pojo.formmanage.template.widget.SysTemplateLookupExample;
import com.myehr.pojo.formmanage.template.widget.SysTemplateRichtext;
import com.myehr.pojo.formmanage.template.widget.SysTemplateRichtextExample;
import com.myehr.pojo.formmanage.template.widget.SysTemplateTextarea;
import com.myehr.pojo.formmanage.template.widget.SysTemplateTextareaExample;
import com.myehr.pojo.formmanage.template.widget.SysTemplateTextbox;
import com.myehr.pojo.formmanage.template.widget.SysTemplateTextboxExample;
import com.myehr.pojo.formmanage.widget.SysFormCheckbox;
import com.myehr.pojo.formmanage.widget.SysFormCheckboxlist;
import com.myehr.pojo.formmanage.widget.SysFormCombobox;
import com.myehr.pojo.formmanage.widget.SysFormDatepicker;
import com.myehr.pojo.formmanage.widget.SysFormFileupload;
import com.myehr.pojo.formmanage.widget.SysFormLookup;
import com.myehr.pojo.formmanage.widget.SysFormLookupExample;
import com.myehr.pojo.formmanage.widget.SysFormTextarea;
import com.myehr.pojo.formmanage.widget.SysFormTextbox;
import com.myehr.service.formmanage.template.ITemplateService;
import com.myehr.service.primaryKey.PrimaryKeyService;

@Controller
@RequestMapping("/formtemplate")
@EnableAsync
public class FormTemplateController {
	private static Logger logger = LoggerFactory.getLogger(FormTemplateController.class);
	@Autowired
	SysTemplateColumnMapper sTemplateColumnMapper;
//	@Autowired
	@Resource(name = "PrimaryKeyService")
	private PrimaryKeyService pkService;
	@Autowired
	private SysTemplateSqlMapper sTemplateSqlMapper;
	@Autowired
	private SysTemplateExpandMapper sExpandMapper;
	@Autowired
	private SysTemplateMapper sTemplateMapper;
//	@Autowired
	@Resource(name = "ITemplateService")
	private ITemplateService iTemplateService;
	@Autowired
	private SysFormColumnMapper sColumnMapper;
	@Autowired
	private SysCardTemplateMapper sysCardTemplateMapper;
	@Autowired
	private SysFormconfigMapper sysFormconfigMapper;
	@Autowired SysGridbycardTemplateColumnMapper sysGridbycardTemplateColumnMapper;
	@Autowired SysTemplateTextboxMapper sTemplateTextboxMapper;
	@Autowired SysTemplateTextareaMapper sTemplateTextareaMapper;
	@Autowired SysTemplateComboboxMapper sTemplateComboboxMapper;
	@Autowired SysTemplateDatepickerMapper sTemplateDatepickerMapper;
	@Autowired SysTemplateCheckboxMapper sTemplateCheckboxMapper;
	@Autowired SysTemplateCheckboxlistMapper sTemplateCheckboxlistMapper;
	@Autowired SysTemplateRichtextMapper sTemplateRichtextMapper;
	@Autowired SysTemplateLookupMapper sTemplateLookupMapper;
	@Autowired SysTemplateGroupMapper sGroupMapper;
	@Autowired SysTimeaxisTemplateColumnMapper sysTimeaxisTemplateColumnMapper;
	@Autowired SysTemplateModelMapper sTemplateModelMapper;
	@Autowired SysTemplateModelColumnMapper sTemplateModelColumnMapper;
	
	//保存数据
	@RequestMapping("/saveField")
	@Async
	public @ResponseBody Object saveField(HttpServletRequest request,@RequestBody List<SysTemplateColumn> sList) throws Exception{
		int num = 1;
		for (SysTemplateColumn sysTemplateColumn : sList) {
			sysTemplateColumn.setTemplateFieldTablename(ChangeCode.getRealCode(sysTemplateColumn.getTemplateFieldTablename()));
			SysTemplateColumnExample tColumnExample = new SysTemplateColumnExample();
			tColumnExample.or().andTemplateColumnColumnIdEqualTo(sysTemplateColumn.getTemplateColumnColumnId()).andTemplateTemplateIdEqualTo(sysTemplateColumn.getTemplateTemplateId());
			if (sTemplateColumnMapper.selectByExample(tColumnExample)!=null&&sTemplateColumnMapper.selectByExample(tColumnExample).size()>0) {
				
			} else {
//				sysTemplateColumn.setTemplateColumnId(Integer.valueOf(formIdString));
				sysTemplateColumn.setTemplateColumnLabelWidth("100px");
				sysTemplateColumn.setTemplateColumnGuiType("1");
				sysTemplateColumn.setTemplateColumnWidth("200px");
				sysTemplateColumn.setTemplateColumnSort(Integer.valueOf(num));			
				sTemplateColumnMapper.insert(sysTemplateColumn);
				num++;
			}
//			formIdString++;
		}
		return null;
    }
	
	//保存数据
	@RequestMapping("/updateEntity")
	public @ResponseBody Object updateEntity(HttpServletRequest request) throws Exception{
		JSONArray jArray=GetRequestJsonUtils.getJsonArray(request);
		@SuppressWarnings("unchecked")
		List<SysTemplateSql> sList = JSONArray.toList(jArray,new SysTemplateSql(), new JsonConfig()); 
		for (SysTemplateSql sysTemplateSql : sList) {
			sTemplateSqlMapper.updateByPrimaryKey(sysTemplateSql);
		}
		return null;
    }
	
	//批量保存字段数据
	@RequestMapping("/updateField")
	public @ResponseBody Object updateField(HttpServletRequest request,@RequestBody List<SysTemplateColumn> sList) throws Exception{
		try {
			for (SysTemplateColumn sysTemplateColumn1 : sList) {
				SysTemplateColumn sysTemplateColumn = sTemplateColumnMapper.selectByPrimaryKey(sysTemplateColumn1.getTemplateColumnId());
				sysTemplateColumn.setTemplateColumnLabel(sysTemplateColumn1.getTemplateColumnLabel());
				sysTemplateColumn.setIsShowAppCard(sysTemplateColumn1.getIsShowAppCard());
				sysTemplateColumn.setIsShowAppList(sysTemplateColumn1.getIsShowAppList());
				sysTemplateColumn.setIsShowPcCard(sysTemplateColumn1.getIsShowPcCard());
				sysTemplateColumn.setIsShowPcList(sysTemplateColumn1.getIsShowPcList());
				sysTemplateColumn.setTemplateColumnOtherName(sysTemplateColumn1.getTemplateColumnOtherName());
				sTemplateColumnMapper.updateByPrimaryKey(sysTemplateColumn);
			}
			return "true";
		} catch (Exception e) {
			// TODO: handle exception
			return "false";
		}
    }
	
	//保存字段数据
	@RequestMapping("/updateOneField")
	public @ResponseBody Object updateOneField(HttpServletRequest request,@RequestBody SysTemplateColumn sTemplateColumn) throws Exception{
		SysTemplateColumn sTemplateColumn1 = sTemplateColumnMapper.selectByPrimaryKey(sTemplateColumn.getTemplateColumnId());
		sTemplateColumn1.setTemplateColumnLabel(sTemplateColumn.getTemplateColumnLabel());
		sTemplateColumn1.setTemplateColumnLabelWidth(sTemplateColumn.getTemplateColumnLabelWidth());
		sTemplateColumn1.setTemplateColumnGuiType(sTemplateColumn.getTemplateColumnGuiType());
		sTemplateColumn1.setTemplateColumnWidth(sTemplateColumn.getTemplateColumnWidth());
		sTemplateColumn1.setTemplateColumnAlign(sTemplateColumn.getTemplateColumnAlign());
		sTemplateColumn1.setTemplateColumnHeight(sTemplateColumn.getTemplateColumnHeight());
		sTemplateColumn1.setTemplateColumnSort(sTemplateColumn.getTemplateColumnSort());
		sTemplateColumn1.setTemplateColumnShowType(sTemplateColumn.getTemplateColumnShowType());
		sTemplateColumn1.setTemplateColumnRequired(sTemplateColumn.getTemplateColumnRequired());
		sTemplateColumn1.setTemplateColumnColSpan(sTemplateColumn.getTemplateColumnColSpan());
		sTemplateColumn1.setTemplateColumnTotal(sTemplateColumn.getTemplateColumnTotal());
		sTemplateColumn1.setTemplateColumnMaxLength(sTemplateColumn.getTemplateColumnMaxLength());
		sTemplateColumn1.setTemplateColumnMinLength(sTemplateColumn.getTemplateColumnMinLength());
		sTemplateColumn1.setTemplateColumnColor(sTemplateColumn.getTemplateColumnColor());
		sTemplateColumn1.setTemplateColumnColorCondition(sTemplateColumn.getTemplateColumnColorCondition());
		sTemplateColumn1.setTemplateColumnGroupId(sTemplateColumn.getTemplateColumnGroupId());
		return sTemplateColumnMapper.updateByPrimaryKey(sTemplateColumn1);
    }
	
	
	//保存数据
	@RequestMapping("/newField")
	public @ResponseBody Object newField(HttpServletRequest request,@RequestBody SysTemplateColumn sTemplateColumn) throws Exception{
//		int formIdString = pkService.getMaxId("SYS_TEMPLATE_COLUMN", "template_column_id");
//		sTemplateColumn.setTemplateColumnId(Integer.valueOf(formIdString));
		return sTemplateColumnMapper.insert(sTemplateColumn);		
    }
	
	//保存数据
	@RequestMapping("/saveCardTemplate")
	public @ResponseBody Object saveCardTemplate(HttpServletRequest request) throws Exception{
		JSONArray jArray=GetRequestJsonUtils.getJsonArray(request);
		@SuppressWarnings("unchecked")
		List<SysGridbycardTemplateColumn> sList = JSONArray.toList(jArray,new SysGridbycardTemplateColumn(), new JsonConfig()); 
		String formDefId = sList.get(0).getTemplateColumnFormDefId()+"";
		SysFormconfigWithBLOBs form = sysFormconfigMapper.selectByPrimaryKey(new BigDecimal(formDefId));
		String userId = (String)(request.getSession().getAttribute("userid")+"");
		for (SysGridbycardTemplateColumn sysGridbycardTemplateColumn : sList) {
			sysGridbycardTemplateColumn.setOperatorName(userId);
			sysGridbycardTemplateColumn.setOperatorTime(new Date());
			if(sysGridbycardTemplateColumn.getTemplateColumnId()==null){
				sysGridbycardTemplateColumnMapper.insert(sysGridbycardTemplateColumn);
			}else if((sysGridbycardTemplateColumn.getTemplateColumnValue()==null||sysGridbycardTemplateColumn.getTemplateColumnValue().equals(""))&&sysGridbycardTemplateColumn.getTemplateColumnTemplateId()!=5&&sysGridbycardTemplateColumn.getTemplateColumnTemplateId()!=3){
				sysGridbycardTemplateColumnMapper.deleteByPrimaryKey(sysGridbycardTemplateColumn.getTemplateColumnId());
			}else{
				sysGridbycardTemplateColumnMapper.updateByPrimaryKey(sysGridbycardTemplateColumn);
			}
		}
		form.setExpand1(sList.get(0).getTemplateColumnTemplateId()+"");
		return sysFormconfigMapper.updateByPrimaryKey(form);
    }
	
	//保存时间轴模板
	@RequestMapping("/saveTimeaxisTemplate")
	public @ResponseBody Object saveTimeaxisTemplate(HttpServletRequest request) throws Exception{
		JSONArray jArray=GetRequestJsonUtils.getJsonArray(request);
		@SuppressWarnings("unchecked")
		List<SysTimeaxisTemplateColumn> sList = JSONArray.toList(jArray,new SysTimeaxisTemplateColumn(), new JsonConfig()); 
		
		String formDefId = "";
		for (SysTimeaxisTemplateColumn sysTimeaxisTemplateColumn : sList) {
			if(sysTimeaxisTemplateColumn.getTemplateColumnFormDefId()!=null&&!sysTimeaxisTemplateColumn.getTemplateColumnFormDefId().equals("null")){
				formDefId = sysTimeaxisTemplateColumn.getTemplateColumnFormDefId()+"";
				break;
			}
		}
		SysFormconfigWithBLOBs form = sysFormconfigMapper.selectByPrimaryKey(new BigDecimal(formDefId));
		String userId = (String)(request.getSession().getAttribute("userid")+"");
		String orderSql = "";
		for (SysTimeaxisTemplateColumn sysTimeaxisTemplateColumn : sList) {
			sysTimeaxisTemplateColumn.setOperatorName(userId);
			sysTimeaxisTemplateColumn.setOperatorTime(new Date());
			if (sysTimeaxisTemplateColumn.getTemplateColumnCode().equals("left")) {
				String orderColumn = sysTimeaxisTemplateColumn.getTemplateColumnValue().split("\\|")[0];
				orderSql = "order by "+orderColumn+" "+sysTimeaxisTemplateColumn.getTemplateColumnLinkMark();
			}
			
			if(sysTimeaxisTemplateColumn.getTemplateColumnId()!=null){
				sysTimeaxisTemplateColumnMapper.updateByPrimaryKey(sysTimeaxisTemplateColumn);
			}else{
				sysTimeaxisTemplateColumnMapper.insert(sysTimeaxisTemplateColumn);
			}
		}
		form.setExpand1(sList.get(0).getTemplateColumnTemplateId()+"");
		form.setOrderSql(orderSql);
		int recode = sysFormconfigMapper.updateByPrimaryKeyWithBLOBs(form);
		return recode;
    }
	
	@RequestMapping("/getTimeaxisTemplate")
	public @ResponseBody List<SysTimeaxisTemplateColumn> getTimeaxisTemplate(HttpServletRequest request) throws Exception{
		String formDefId = request.getParameter("formDefId");
		String templateId = request.getParameter("templateId");
		SysFormconfigWithBLOBs form = sysFormconfigMapper.selectByPrimaryKey(new BigDecimal(formDefId));
		if (form.getExpand1()!=null&&!form.getExpand1().equals("")) {
			//SysCardTemplate dTemplate = sysCardTemplateMapper.selectByPrimaryKey(Integer.valueOf(form.getExpand1()));
			SysTimeaxisTemplateColumnExample example = new SysTimeaxisTemplateColumnExample();
			example.or().andTemplateColumnFormDefIdEqualTo(Integer.valueOf(formDefId)).andTemplateColumnTemplateIdEqualTo(Integer.valueOf(templateId));
			List<SysTimeaxisTemplateColumn> columns = sysTimeaxisTemplateColumnMapper.selectByExample(example);
			return columns;
		}else {
			return null;
		}
	}
	
	@RequestMapping("/getDataInfo")
	public @ResponseBody List<SysGridbycardTemplateColumn> getDataInfo(HttpServletRequest request) throws Exception{
		String formDefId = request.getParameter("formDefId");
		String templateId = request.getParameter("templateId");
		SysFormconfigWithBLOBs form = sysFormconfigMapper.selectByPrimaryKey(new BigDecimal(formDefId));
		if (form.getExpand1()!=null&&!form.getExpand1().equals("")) {
			//SysCardTemplate dTemplate = sysCardTemplateMapper.selectByPrimaryKey(Integer.valueOf(form.getExpand1()));
			SysGridbycardTemplateColumnExample example = new SysGridbycardTemplateColumnExample();
			example.or().andTemplateColumnFormDefIdEqualTo(Integer.valueOf(formDefId)).andTemplateColumnTemplateIdEqualTo(Integer.valueOf(templateId));
			List<SysGridbycardTemplateColumn> columns = sysGridbycardTemplateColumnMapper.selectByExample(example);
			return columns;
		}else {
			return null;
		}
	}
	
	
	//保存数据
	@RequestMapping("/saveEntity")
	public @ResponseBody Object saveEntity(HttpServletRequest request,@RequestBody SysTemplateSql sTemplateSql) throws Exception{

		int formIdString = pkService.getMaxId("sys_template_sql", "template_sql_id");
		SysTemplateSqlExample example = new SysTemplateSqlExample();
		example.or().andTemplateEntityIdEqualTo(sTemplateSql.getTemplateEntityId()).andTemplateIdEqualTo(sTemplateSql.getTemplateId());
		
		if (sTemplateSqlMapper.selectByExample(example).size()>0) {
			
		} else {
			sTemplateSql.setTemplateSqlId(new BigDecimal(formIdString));
			return sTemplateSqlMapper.insert(sTemplateSql);
		}
		return null;
    }
		
	@RequestMapping("/findFieldList")
	public @ResponseBody ResultMap findFieldList(HttpServletRequest request) throws Exception{
		String templateId =request.getParameter("templateId");
		SysTemplateColumnExample sColumnExample = new SysTemplateColumnExample();
		sColumnExample.or().andTemplateTemplateIdEqualTo(Integer.valueOf(templateId));
		List<SysTemplateColumn> sysTemplateColumns = sTemplateColumnMapper.selectByExample(sColumnExample);
		ResultMap map = new ResultMap();
		List<Object> list_obj=new ArrayList<Object>();
		for (SysTemplateColumn u : sysTemplateColumns) {
			SysTemplateSqlExample example = new SysTemplateSqlExample();
			example.or().andTemplateEntityNameEqualTo(u.getTemplateEntityTablename());
			u.setTemplateColumnTableOther(sTemplateSqlMapper.selectByExample(example).get(0).getTemplateEntityOtherName());
			list_obj.add(u);
		}
		map.setRows(list_obj);
		long size = list_obj.size();
		map.setTotal(size);
		return map;
	}
	
	@RequestMapping("/findEntityList")
	public @ResponseBody ResultMap findEntityList(HttpServletRequest request) throws Exception{
		String templateId =request.getParameter("templateId");
		SysTemplateSqlExample example = new SysTemplateSqlExample();
		example.or().andTemplateIdEqualTo(new BigDecimal(templateId));
		example.setOrderByClause("template_sort");
		List<SysTemplateSql> sTemplateSqls = sTemplateSqlMapper.selectByExample(example);
		ResultMap map = new ResultMap();
		List<Object> list_obj=new ArrayList<Object>();
		for (SysTemplateSql u : sTemplateSqls) {
			list_obj.add(u);
		}
		SysTemplateSql newSql = new SysTemplateSql();
		list_obj.add(newSql);
		map.setRows(list_obj);
		long size = list_obj.size();
		map.setTotal(size);
		return map;
	}
	
	@RequestMapping("/deleteColumn")
	public @ResponseBody Object deleteColumn(HttpServletRequest request) throws Exception{
		JSONArray jArray=GetRequestJsonUtils.getJsonArray(request);
		@SuppressWarnings("unchecked")
		List<SysTemplateColumn> sList = JSONArray.toList(jArray,new SysTemplateColumn(), new JsonConfig()); 
		for (SysTemplateColumn sysTemplateColumn : sList) {
			sTemplateColumnMapper.deleteByPrimaryKey(sysTemplateColumn.getTemplateColumnId());
		}
		return null;
    }
	
	@RequestMapping("/deleteEntity")
	public @ResponseBody Object deleteEntity(HttpServletRequest request,@RequestBody SysTemplateSql sTemplateSql) throws Exception{
		SysTemplateSqlExample example = new SysTemplateSqlExample();
		example.or().andTemplateEntityIdEqualTo(sTemplateSql.getTemplateEntityId());
		sTemplateSqlMapper.deleteByExample(example);
		SysTemplateColumnExample example2 =new SysTemplateColumnExample();
		example2.or().andTemplateColumnEntityIdEqualTo(Integer.valueOf(sTemplateSql.getTemplateEntityId()+""));
		
		return sTemplateColumnMapper.deleteByExample(example2);
    }
	
	/*//保存数据
	@RequestMapping("/saveTextBox")
	public @ResponseBody Object saveTextBox(HttpServletRequest request,@RequestBody SysTemplateTextbox sTextbox) throws Exception{

		int textboxId = pkService.getMaxId("sys_template_textbox", "textbox_id");
		sTextbox.setTextboxId(new BigDecimal(textboxId));
		return sTextboxMapper.insert(sTextbox);
    }*/
	
  //保存数据
  	@RequestMapping("/createTemplate")
  	public @ResponseBody Object createTemplate(HttpServletRequest request) throws Exception{
  		String templateCode =request.getParameter("templateCode");
  		String templateName =request.getParameter("templateName");
  		SysTemplateExample example = new SysTemplateExample();
		example.or().andTemplateCodeEqualTo(templateCode);
		if(sTemplateMapper.selectByExample(example).size()>0){
			return "2";//模板编码重复
		}
  		String templateFolderId =request.getParameter("templateFolderId");
  		SysTemplate sTemplate = new SysTemplate();
  		sTemplate.setTemplateCode(templateCode);
  		sTemplate.setTemplateName(templateName);
  		sTemplate.setOperatorName((String)request.getSession().getAttribute("userId"));
  		sTemplate.setOperatorTime(new Date());
  		sTemplate.setTemplateFolderId(new BigDecimal(templateFolderId));
  		sTemplateMapper.insert(sTemplate);
  		
  		return sTemplateMapper.selectByExample(example).get(0).getTemplateId();
      }
    
    @RequestMapping("/createFormByTemplate")
	public @ResponseBody Object createFormByTemplate(HttpServletRequest request) throws Exception{
    	String userId = (String)request.getSession().getAttribute("userid").toString();
		String templateId =request.getParameter("templateId");
		String pcEditCard =request.getParameter("pcEditCard");
		String pcAddCard =request.getParameter("pcAddCard");
		String pcGrid =request.getParameter("pcGrid");
		String appAddCard =request.getParameter("appAddCard");
		String appEditCard =request.getParameter("appEditCard");
		String appGrid =request.getParameter("appGrid");
		SysTemplate sTemplate = sTemplateMapper.selectByPrimaryKey(new BigDecimal(templateId));
		sTemplate.setPcAddCardShow(pcAddCard);
		sTemplate.setPcEditCardShow(pcEditCard);
		sTemplate.setPcGridShow(pcGrid);
		sTemplate.setAppAddCardShow(appAddCard);
		sTemplate.setAppEditCardShow(appEditCard);
		sTemplate.setOperatorName(userId);
		sTemplate.setOperatorTime(new Date());
		sTemplate.setAppGridShow(appGrid);
		sTemplateMapper.updateByPrimaryKey(sTemplate);
		String[] recode = MyEhrJDBCUtil.execPrepare(MybatisUtil.getConnection(), "CALL sys_sp_formtemplate("+templateId+",?)");  		
   		return recode[0];
	}
    
    @SuppressWarnings("unchecked")
	@RequestMapping("/getSql")
	public @ResponseBody Object getSql(HttpServletRequest request) throws Exception{
		int templateId =Integer.parseInt(request.getParameter("templateId"));
		@SuppressWarnings("rawtypes")
		Map maps = new HashMap();
		maps.put("templatId", templateId);
		String sql = sExpandMapper.getTemplateSql(maps);
		SysTemplate sTemplate = sTemplateMapper.selectByPrimaryKey(new BigDecimal(templateId));
		sTemplate.setTemplateSql(sql);
		sTemplateMapper.updateByPrimaryKey(sTemplate);
		SysTemplate sTemplate2 = sTemplateMapper.selectByPrimaryKey(new BigDecimal(templateId));
		return sTemplate2;
	}
    
    @RequestMapping("/getSelect")
   	public @ResponseBody List<Map<String,String>> getSelect(HttpServletRequest request) throws Exception{
   		String formDefId =request.getParameter("formDefId");
   		List<Map<String,String>> rs = new ArrayList<Map<String,String>>();
   		Map<String,String> m0 = new HashMap<String,String>();
   		m0.put("text", "请选择");
		m0.put("id", "");
		SysFormColumnExample example = new SysFormColumnExample();
		example.or().andFormColumnFormDefIdEqualTo(new BigDecimal(formDefId));
		example.setOrderByClause("FORM_COLUMN_SORT");
		List<SysFormColumn> columns = sColumnMapper.selectByExample(example);
		rs.add(m0);
		for (SysFormColumn sysFormColumn : columns) {
			Map<String,String> m1 = new HashMap<String,String>();
			if(sysFormColumn.getFormEntityTablename()==null||sysFormColumn.getFormEntityTablename().equals("")){
				m1.put("text",sysFormColumn.getFormFieldTablename()+"|"+sysFormColumn.getFormColumnLable()+"|"+sysFormColumn.getFormColumnId());
				m1.put("id",sysFormColumn.getFormFieldTablename()+"|"+sysFormColumn.getFormColumnLable()+"|"+sysFormColumn.getFormColumnId());
			}else {
				m1.put("text", ChangeCode.getUniqueCode(sysFormColumn.getFormEntityTablename(),sysFormColumn.getFormFieldTablename())+"|"+sysFormColumn.getFormColumnLable()+"|"+sysFormColumn.getFormColumnId());
				m1.put("id", ChangeCode.getUniqueCode(sysFormColumn.getFormEntityTablename(),sysFormColumn.getFormFieldTablename())+"|"+sysFormColumn.getFormColumnLable()+"|"+sysFormColumn.getFormColumnId());
			}
			rs.add(m1);
		}
   		return rs;
   	}
    
    @RequestMapping("/checkPKcolumn")
   	public @ResponseBody String checkPKcolumn(HttpServletRequest request) throws Exception{
   		String templateId =request.getParameter("templateId");
   		String[] recode = MyEhrJDBCUtil.execPrepare(MybatisUtil.getConnection(), "CALL SYS_SP_GETSYSSQL("+templateId+",?)");  		
   		return recode[0];
   	}
    
  //查询所有模板信息
  	@RequestMapping("/findTemplateList")
  	 public @ResponseBody ResultMap findTemplateList(HttpServletRequest request) throws Exception {
  	        try {  
  	            return iTemplateService.getAllTemplateMsSql(request);  
  	        } catch (Exception e) {  
  	            e.printStackTrace();logger.error(e.getMessage(),e);  
  	        }  
  	        return null; 
  	}
    
  	@RequestMapping("/getMark")
 	 public @ResponseBody Object getMark(HttpServletRequest request) throws Exception {
 			String phoneNum =request.getParameter("phoneNum");
 			// 用户平台API账号(非登录账号,示例:N1234567)
 			String account = "N4073071";
 			// 用户平台API密码(非登录密码)
 			String pswd = "pzGtjNCsfS2bd9";
 			//请求地址请登录253云通讯自助通平台查看或者询问您的商务负责人获取
 			String smsSingleRequestServerUrl = "http://smssh1.253.com/msg/send/json";
 			
 			int max=999999;
 	        int min=100000;
 	        Random random = new Random();
 	        int s = random.nextInt(max)%(max-min+1) + min;
 			
 			// 短信内容
 		    String msg = s+"";
 			//手机号码
 			String phone = phoneNum;
 			//状态报告
 			String report= "true";
 			
 			SmsSendRequest smsSingleRequest = new SmsSendRequest(account, pswd, msg, phone,report);
 			
 			String requestJson = JSON.toJSONString(smsSingleRequest);
 			
 			logger.info("before request string is: " + requestJson);
 			
 			String response = ChuangLanSmsUtil.sendSmsByPost(smsSingleRequestServerUrl, requestJson);
 			
 			logger.info("response after request result is :" + response);
 			
 			SmsSendResponse smsSingleResponse = JSON.parseObject(response, SmsSendResponse.class);
 			
 			logger.info("response  toString is :" + smsSingleResponse);
 	        return "["+response+"]"; 
 	}
  	
  	@RequestMapping("/getTextInfoByColumnId")
	public @ResponseBody SysTemplateTextbox getTextInfoByColumnId(HttpServletRequest request) throws Exception{
		String columnId =request.getParameter("columnId");
		SysTemplateTextboxExample example = new SysTemplateTextboxExample();
		example.or().andTextboxTemplateColumnIdEqualTo(new BigDecimal(columnId));
		List<SysTemplateTextbox> sLookups = sTemplateTextboxMapper.selectByExample(example);
		if(sLookups.size()==1){
			return sLookups.get(0);
		}else {
			return null;
		}
	}
  	@RequestMapping("/getComboboxInfoByColumnId")
	public @ResponseBody SysTemplateCombobox getComboboxInfoByColumnId(HttpServletRequest request) throws Exception{
		String columnId =request.getParameter("columnId");
		SysTemplateComboboxExample example = new SysTemplateComboboxExample();
		example.or().andComboboxTemplateColumnIdEqualTo(new BigDecimal(columnId));
		List<SysTemplateCombobox> sLookups = sTemplateComboboxMapper.selectByExample(example);
		if(sLookups.size()==1){
			return sLookups.get(0);
		}else {
			return null;
		}
	}
  	@RequestMapping("/getDateInfoByColumnId")
	public @ResponseBody SysTemplateDatepicker getDateInfoByColumnId(HttpServletRequest request) throws Exception{
		String columnId =request.getParameter("columnId");
		SysTemplateDatepickerExample example = new SysTemplateDatepickerExample();
		example.or().andDatepickerTemplateColumnIdEqualTo(new BigDecimal(columnId));
		List<SysTemplateDatepicker> sLookups = sTemplateDatepickerMapper.selectByExample(example);
		if(sLookups.size()==1){
			return sLookups.get(0);
		}else {
			return null;
		}
	}
  	@RequestMapping("/getTextareaInfoByColumnId")
	public @ResponseBody SysTemplateTextarea getTextareaInfoByColumnId(HttpServletRequest request) throws Exception{
		String columnId =request.getParameter("columnId");
		SysTemplateTextareaExample example = new SysTemplateTextareaExample();
		example.or().andTextareaTemplateColumnIdEqualTo(new BigDecimal(columnId));
		List<SysTemplateTextarea> sLookups = sTemplateTextareaMapper.selectByExample(example);
		if(sLookups.size()==1){
			return sLookups.get(0);
		}else {
			return null;
		}
	}
  	@RequestMapping("/getRadiolistInfoByColumnId")
	public @ResponseBody SysTemplateRichtext getRadiolistInfoByColumnId(HttpServletRequest request) throws Exception{
		String columnId =request.getParameter("columnId");
		SysTemplateRichtextExample example = new SysTemplateRichtextExample();
		example.or().andRichtextTemplateColumnIdEqualTo(new BigDecimal(columnId));
		List<SysTemplateRichtext> sLookups = sTemplateRichtextMapper.selectByExample(example);
		if(sLookups.size()==1){
			return sLookups.get(0);
		}else {
			return null;
		}
	}
  	@RequestMapping("/getCheckboxInfoByColumnId")
	public @ResponseBody SysTemplateCheckbox getCheckboxInfoByColumnId(HttpServletRequest request) throws Exception{
		String columnId =request.getParameter("columnId");
		SysTemplateCheckboxExample example = new SysTemplateCheckboxExample();
		example.or().andCheckboxTemplateColumnIdEqualTo(new BigDecimal(columnId));
		List<SysTemplateCheckbox> sLookups = sTemplateCheckboxMapper.selectByExample(example);
		if(sLookups.size()==1){
			return sLookups.get(0);
		}else {
			return null;
		}
	}
  	@RequestMapping("/getCheckboxlistInfoByColumnId")
	public @ResponseBody SysTemplateCheckboxlist getCheckboxlistInfoByColumnId(HttpServletRequest request) throws Exception{
		String columnId =request.getParameter("columnId");
		SysTemplateCheckboxlistExample example = new SysTemplateCheckboxlistExample();
		example.or().andCheckboxlistTemplateColumnIdEqualTo(new BigDecimal(columnId));
		List<SysTemplateCheckboxlist> sLookups = sTemplateCheckboxlistMapper.selectByExample(example);
		if(sLookups.size()==1){
			return sLookups.get(0);
		}else {
			return null;
		}
	}
  	@RequestMapping("/getLookupInfoByColumnId")
	public @ResponseBody SysTemplateLookup getLookupInfoByColumnId(HttpServletRequest request) throws Exception{
		String columnId =request.getParameter("columnId");
		SysTemplateLookupExample example = new SysTemplateLookupExample();
		example.or().andLookupTemplateColumnIdEqualTo(new BigDecimal(columnId));
		List<SysTemplateLookup> sLookups = sTemplateLookupMapper.selectByExample(example);
		if(sLookups.size()==1){
			return sLookups.get(0);
		}else {
			return null;
		}
	}
    //保存数据
	@RequestMapping("/saveTextBox")
	public @ResponseBody String saveTextBox(HttpServletRequest request,@RequestBody SysTemplateTextbox sTextbox) throws Exception{
		String reCode = "false";
		String userId = (String)(request.getSession().getAttribute("userid")+"");
		sTextbox.setOperatorName(userId);
		sTextbox.setOperatorTime(new Date());
		try {
			if(sTextbox.getTextboxId()!=null&&!sTextbox.getTextboxId().equals("")){
				sTemplateTextboxMapper.updateByPrimaryKey(sTextbox);
				reCode = "true";
			}else {
				sTemplateTextboxMapper.insert(sTextbox);
				reCode = "true";
			}
			return reCode;
		} catch (Exception e) {
			return reCode;
		}
    }
	//保存数据
	@RequestMapping("/saveDatePicker")
	public @ResponseBody Object saveDatePicker(HttpServletRequest request,@RequestBody SysTemplateDatepicker sDatepicker) throws Exception{
		String reCode = "false";
		String userId = (String)(request.getSession().getAttribute("userid")+"");
		sDatepicker.setOperatorName(userId);
		sDatepicker.setOperatorTime(new Date());
		try {
			if(sDatepicker.getDatepickerId()!=null&&!sDatepicker.getDatepickerId().equals("")){
				sTemplateDatepickerMapper.updateByPrimaryKey(sDatepicker);
				reCode = "true";
			}else {
				sTemplateDatepickerMapper.insert(sDatepicker);
				reCode = "true";
			}
			return reCode;
		} catch (Exception e) {
			// TODO: handle exception
			return reCode;
		}
    }
	//保存数据
	@RequestMapping("/saveCombobox")
	public @ResponseBody String saveCombobox(HttpServletRequest request,@RequestBody SysTemplateCombobox sCombobox) throws Exception{
		String reCode = "false";
		String userId = (String)(request.getSession().getAttribute("userid")+"");
		sCombobox.setOperatorName(userId);
		sCombobox.setOperatorTime(new Date());
		try {
			if(sCombobox.getComboboxId()!=null&&!sCombobox.getComboboxId().equals("")){
				sTemplateComboboxMapper.updateByPrimaryKey(sCombobox);
				reCode = "true";
			}else {
				sTemplateComboboxMapper.insert(sCombobox);
				reCode = "true";
			}
			
			return reCode;
		} catch (Exception e) {
			// TODO: handle exception
			return reCode;
		}
    }
	//保存数据
	@RequestMapping("/saveTextarea")
	public @ResponseBody String saveTextarea(HttpServletRequest request,@RequestBody SysTemplateTextarea sTextarea) throws Exception{
		String reCode = "false";
		String userId = (String)(request.getSession().getAttribute("userid")+"");
		sTextarea.setOperatorName(userId);
		sTextarea.setOperatorTime(new Date());
		try {
			if(sTextarea.getTextareaId()!=null&&!sTextarea.getTextareaId().equals("")){
				sTemplateTextareaMapper.updateByPrimaryKey(sTextarea);
				reCode = "true";
			}else {
				sTemplateTextareaMapper.insert(sTextarea);
				reCode = "true";
			}
			return reCode;
		} catch (Exception e) {
			// TODO: handle exception
			return reCode;
		}
    }
	//保存数据
	@RequestMapping("/saveCheckbox")
	public @ResponseBody String saveCheckbox(HttpServletRequest request,@RequestBody SysTemplateCheckbox sCheckbox) throws Exception{
		String reCode = "false";
		String userId = (String)(request.getSession().getAttribute("userid")+"");
		sCheckbox.setOperatorName(userId);
		sCheckbox.setOperatorTime(new Date());
		try {
			if(sCheckbox.getCheckboxId()!=null&&!sCheckbox.getCheckboxId().equals("")){
				sTemplateCheckboxMapper.updateByPrimaryKey(sCheckbox);
				reCode = "true";
			}else {
				sTemplateCheckboxMapper.insert(sCheckbox);
				reCode = "true";
			}
			
			return reCode;
		} catch (Exception e) {
			// TODO: handle exception
			return reCode;
		}
    }
	//保存数据
	@RequestMapping("/saveCheckboxlist")
	public @ResponseBody String saveCheckboxlist(HttpServletRequest request,@RequestBody SysTemplateCheckboxlist sCheckboxlist) throws Exception{
		String reCode = "false";
		String userId = request.getSession().getAttribute("userid")+"";
		sCheckboxlist.setOperatorName(userId);
		sCheckboxlist.setOperatorTime(new Date());
		try {
			if(sCheckboxlist.getCheckboxlistId()!=null&&!sCheckboxlist.getCheckboxlistId().equals("")){
				sTemplateCheckboxlistMapper.updateByPrimaryKey(sCheckboxlist);
				reCode = "true";
			}else {
				sTemplateCheckboxlistMapper.insert(sCheckboxlist);
				reCode = "true";
			}
			return reCode;
		} catch (Exception e) {
			// TODO: handle exception
			return reCode;
		}
    }
	//保存数据
	@RequestMapping("/saveLookup")
	public @ResponseBody String saveLookup(HttpServletRequest request,@RequestBody SysTemplateLookup sLookup) throws Exception{
		String reCode = "false";
		String userId = (String)(request.getSession().getAttribute("userid")+"");
		sLookup.setOperatorName(userId);
		sLookup.setOperatorTime(new Date());
		try {
			if(sLookup.getLookupId()!=null&&!sLookup.getLookupId().equals("")){
				sTemplateLookupMapper.updateByPrimaryKey(sLookup);
				reCode = "true";
			}else {
				sTemplateLookupMapper.insert(sLookup);
				reCode = "true";
			}
			return reCode;
		} catch (Exception e) {
			// TODO: handle exception
			return reCode;
		}
    }
	/*//保存数据
	@RequestMapping("/saveFileupload")
	public @ResponseBody String saveFileupload(HttpServletRequest request,@RequestBody SysFormFileupload sFileupload) throws Exception{
		String reCode = "false";
		String userId = (String)(request.getSession().getAttribute("userid")+"");
		sFileupload.setOperatorName(userId);
		sFileupload.setOperatorTime(new Date());
		try {
			if(sFileupload.getFileuploadId()!=null&&!sFileupload.getFileuploadId().equals("")){
				sFileuploadMapper.updateByPrimaryKey(sFileupload);
				reCode = "true";
			}else {
				sFileuploadMapper.insert(sFileupload);
				reCode = "true";
			}
			
			return reCode;
		} catch (Exception e) {
			// TODO: handle exception
			return reCode;
		}
    }*/
	
	/**
	 * 查询分组信息
	 * @param request
	 * @param params
	 * @throws Throwable 
	 */
	@RequestMapping("/getGroupList")
	public @ResponseBody TemplateResultGroups  getGroupList(HttpServletRequest request) throws Throwable {
		String templateId = request.getParameter("templateId");
		TemplateResultGroups resultMap = new TemplateResultGroups();
		SysTemplateGroupExample example = new SysTemplateGroupExample();
		example.or().andGroupTemplateIdEqualTo(new BigDecimal(templateId));
		example.setOrderByClause("FORM_GROUP_SORT");
		List<SysTemplateGroup> wheres = sGroupMapper.selectByExample(example);
		resultMap.setRows(wheres);
		resultMap.setTotal(wheres.size());
		return resultMap;
	}
	
	/**
	 * 删除表单分组配置
	 * @param request
	 * @param params
	 * @throws Throwable 
	 */
	@RequestMapping("/deleteFormGroup")
	public @ResponseBody String[]  deleteFormGroup(HttpServletRequest request,@RequestBody SysTemplateGroup group) throws Throwable {
		String[] recode = new String[2];
		recode[0]="0";
		recode[1]="操作成功";
		sGroupMapper.deleteByPrimaryKey(group.getFormGroupId());
		SysTemplateColumnExample example = new SysTemplateColumnExample();
		example.or().andTemplateTemplateIdEqualTo(group.getGroupTemplateId().intValue()).andTemplateColumnGroupIdEqualTo(group.getFormGroupId()+"");
		List<SysTemplateColumn> sColumns = sTemplateColumnMapper.selectByExample(example);
		for (SysTemplateColumn sysFormColumn : sColumns) {
			sysFormColumn.setTemplateColumnGroupId("");
			sTemplateColumnMapper.updateByPrimaryKey(sysFormColumn);
		}
		return recode;
	}	
	
	/**
	 * 删除模板字段
	 * @param request
	 * @param params
	 * @throws Throwable 
	 */
	@RequestMapping("/deleteTemplateColumnById")
	public void  deleteTemplateColumnById(HttpServletRequest request) throws Throwable {
		String templateColumnId = request.getParameter("templateColumnId");
		sysGridbycardTemplateColumnMapper.deleteByPrimaryKey(Integer.valueOf(templateColumnId));
	}	
	
	/**
	 * 保存表单分组配置
	 * @param request
	 * @param params
	 * @throws Throwable 
	 */
	@RequestMapping("/saveFormGroup")
	public @ResponseBody String[]  saveFormGroup(HttpServletRequest request,@RequestBody List<SysTemplateGroup> groups) throws Throwable {
		String[] recode = new String[2];
		recode[0]="0";
		recode[1]="操作成功";
		for (int i = 0; i < groups.size(); i++) {
			SysTemplateGroup group = groups.get(i);
			if (group.getFormGroupId()!=null && !(group.getFormGroupId()+"").equals("")) {
				sGroupMapper.updateByPrimaryKey(group);
			}else{
				sGroupMapper.insert(group);
			}
		}
		return recode;
	}
	
	//保存数据
	@RequestMapping("/updateForms")
	public @ResponseBody Object updateForms(HttpServletRequest request,@RequestBody List<SysTemplateColumn> columns) throws Exception{
		for (SysTemplateColumn column : columns) {
			SysTemplateColumn column1 = sTemplateColumnMapper.selectByPrimaryKey(column.getTemplateColumnId());
			if (column.getTemplateColumnAlign()!=null&&!column.getTemplateColumnAlign().equals("")) {
				column1.setTemplateColumnAlign(column.getTemplateColumnAlign());
			}
			if (column.getTemplateColumnWidth()!=null&&!column.getTemplateColumnWidth().equals("")) {
				column1.setTemplateColumnWidth(column.getTemplateColumnWidth());	
			}
			if (column.getTemplateColumnRequired()!=null&&!column.getTemplateColumnRequired().equals("")) {
				column1.setTemplateColumnRequired(column.getTemplateColumnRequired());
			}
			if (column.getTemplateColumnGroupId()!=null&&!column.getTemplateColumnGroupId().equals("")) {
				column1.setTemplateColumnGroupId(column.getTemplateColumnGroupId());
			}
			if (column.getTemplateColumnShowType()!=null&&!column.getTemplateColumnShowType().equals("")) {
				column1.setTemplateColumnShowType(column.getTemplateColumnShowType());
			}
			sTemplateColumnMapper.updateByPrimaryKey(column1);
		}
		return null;
    }
	
	/**
	 * 复制原始模板,创建新模板
	 * @param request
	 * @param params
	 * @throws Throwable 
	 */
	@RequestMapping("/createNewTemplate")
	public @ResponseBody Object createNewTemplate(HttpServletRequest request) throws Throwable {
		String templateType = request.getParameter("templateType");
		String templateCode = request.getParameter("templateCode");
		String parentCode = request.getParameter("parentCode");
		String userId = request.getSession().getAttribute("userid")+"";
		//parentCode
		SysTemplateModelExample example = new SysTemplateModelExample();
		example.or().andTemplateCodeEqualTo(parentCode).andTemplateTypeEqualTo(templateType);
		SysTemplateModelColumnExample example2 = new SysTemplateModelColumnExample();
		example2.or().andTemplateCodeEqualTo(parentCode);
		List<SysTemplateModelColumn> columns = sTemplateModelColumnMapper.selectByExample(example2);
		if(sTemplateModelMapper.selectByExample(example)!=null&&sTemplateModelMapper.selectByExample(example).size()>0){
			SysTemplateModel model = sTemplateModelMapper.selectByExample(example).get(0);
			model.setCreateName(userId);
			model.setTemplateCode(templateCode);
			model.setCreateTime(new Date());
			sTemplateModelMapper.insert(model);
			if (columns!=null&&columns.size()>0) {
				for (SysTemplateModelColumn sysTemplateModelColumn : columns) {
					sysTemplateModelColumn.setTemplateCode(templateCode);
					sTemplateModelColumnMapper.insert(sysTemplateModelColumn);
				}
			}
		}
		return null;
	}
	/**
	 * 根据模板大类获取模板基础信息
	 * @param request
	 * @param params
	 * @throws Throwable 
	 */
	@RequestMapping("/getTemplateDatas")
	public @ResponseBody Object getTemplateDatas(HttpServletRequest request) throws Throwable {
		String templateType = request.getParameter("templateType");
		SysTemplateModelExample example = new SysTemplateModelExample();
		example.or().andTemplateTypeEqualTo(templateType);
		return sTemplateModelMapper.selectByExample(example);
	}
	
	/**
	 * 根据模板ID和PCODE获取模板字段信息
	 * 
	 * 
	 */
	@RequestMapping("/getTemplateColumnList")
	public @ResponseBody Object getTemplateColumnList(HttpServletRequest request) throws Throwable {
		String templateCode = request.getParameter("templateCode");
		String templateParentParamCode = request.getParameter("templateParentParamCode");
		SysTemplateModelColumnExample example = new SysTemplateModelColumnExample();
		example.or().andTemplateCodeEqualTo(templateCode).andTemplateParentParamCodeEqualTo(templateParentParamCode);
		List<SysTemplateModelColumn> columns = sTemplateModelColumnMapper.selectByExample(example);
		ResultTemplateColumn result = new ResultTemplateColumn();
		List<Object> list_obj=new ArrayList<Object>();
		for (SysTemplateModelColumn sysTemplateModelColumn : columns) {
			list_obj.add(sysTemplateModelColumn);
		}
		result.setRows(list_obj);
		result.setTotal(columns.size());
		return result;
	}
	
	/**
	 * 根据模板编码获取模板html
	 * 
	 */
	@RequestMapping(value="/getTemplateInfo", produces = "text/html;charset=UTF-8")
	public @ResponseBody Object getTemplateInfo(HttpServletRequest request) throws Throwable {
		String templateCode = request.getParameter("templateCode");
		String CodeName = request.getParameter("CodeName");
		String sql = "select "+CodeName+" from sys_template_model where template_Code = '"+templateCode+"'";
		Map map = MybatisUtil.queryOne("runtime.selectSql", sql);
		return map.get(CodeName);
	}
	
	/**
	 * 将模板参数结构化
	 */
	@RequestMapping("/getTemplateColumnListToMap")
	public @ResponseBody Object getTemplateColumnListToMap(HttpServletRequest request) throws Throwable {
		String templateCode = request.getParameter("templateCode");
		
		Map map = getTemplateMap(templateCode);
		
		return map;
	}
	
	private Map getTemplateMap(String templateCode) {
		Map map = new HashMap();
		SysTemplateModelColumnExample example = new SysTemplateModelColumnExample();
		example.or().andTemplateCodeEqualTo(templateCode);
		List<SysTemplateModelColumn> columns = sTemplateModelColumnMapper.selectByExample(example);
		if (columns!=null&&columns.size()>0) {
			for (SysTemplateModelColumn sysTemplateModelColumn : columns) {
				if (sysTemplateModelColumn.getTemplateParamType()!=null&&sysTemplateModelColumn.getTemplateParamType().toLowerCase().equals("constant")) {
					if(sysTemplateModelColumn.getTemplateInitParamValue()==null||sysTemplateModelColumn.getTemplateInitParamValue().equals("")){
						map.put(sysTemplateModelColumn.getTemplateParamXu()+".值", "");
						map.put(sysTemplateModelColumn.getTemplateParamXu()+".标签",sysTemplateModelColumn.getTemplateParamWidgetType());
					}else {
						map.put(sysTemplateModelColumn.getTemplateParamXu()+".值", sysTemplateModelColumn.getTemplateInitParamValue());
						map.put(sysTemplateModelColumn.getTemplateParamXu()+".标签",sysTemplateModelColumn.getTemplateParamWidgetType());
					}
				}else if (sysTemplateModelColumn.getTemplateParamType()!=null&&sysTemplateModelColumn.getTemplateParamType().toUpperCase().equals("CSS")) {
					if(sysTemplateModelColumn.getTemplateInitParamValue()==null||sysTemplateModelColumn.getTemplateInitParamValue().equals("")){
						map.put(sysTemplateModelColumn.getTemplateParamXu(), "");
					}else {
						map.put(sysTemplateModelColumn.getTemplateParamXu(), sysTemplateModelColumn.getTemplateParamCode()+":"+sysTemplateModelColumn.getTemplateInitParamValue()+";");
					}
				}
			}
		}
		return map;
	}
}

