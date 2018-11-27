
package com.myehr.controller.redis;

import java.math.BigDecimal;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.myehr.common.mybatis.MybatisUtil;
import com.myehr.common.util.ChangeCode;
import com.myehr.common.util.DealStrSub;
import com.myehr.common.util.GetRequestJsonUtils;
import com.myehr.common.util.ResultMap;
import com.myehr.common.util.datasource.CustomerContextHolder;
import com.myehr.controller.form.parambean.CardformInitDataParams;
import com.myehr.controller.form.parambean.ResultCacheConfig;
import com.myehr.controller.form.parambean.ResultColumns;
import com.myehr.mapper.cache.SysCacheConfigMapper;
import com.myehr.mapper.formmanage.form.SysExecSqlMapper;
import com.myehr.mapper.formmanage.form.SysFormButtonMapper;
import com.myehr.mapper.formmanage.form.SysFormColumnMapper;
import com.myehr.mapper.formmanage.form.SysUserDictMapper;
import com.myehr.mapper.formmanage.widget.SysFormComboboxMapper;
import com.myehr.mapper.sysdict.SysDictEntryMapper;
import com.myehr.mapper.sysdict.SysDictTypeMapper;
import com.myehr.pojo.cache.SysCacheConfig;
import com.myehr.pojo.cache.SysCacheConfigExample;
import com.myehr.pojo.dict.DictData;
import com.myehr.pojo.dict.SysDictEntry;
import com.myehr.pojo.dict.SysDictEntryExample;
import com.myehr.pojo.dict.SysDictType;
import com.myehr.pojo.dict.SysDictTypeExample;
import com.myehr.pojo.formmanage.cache.SysFormButtonEditorCache;
import com.myehr.pojo.formmanage.cache.SysFormColumnCache;
import com.myehr.pojo.formmanage.cache.SysFormconfigCache;
import com.myehr.pojo.formmanage.form.SysExecSql;
import com.myehr.pojo.formmanage.form.SysExecSqlExample;
import com.myehr.pojo.formmanage.form.SysFormButton;
import com.myehr.pojo.formmanage.form.SysFormButtonExample;
import com.myehr.pojo.formmanage.form.SysFormColumn;
import com.myehr.pojo.formmanage.form.SysFormColumnExample;
import com.myehr.pojo.formmanage.form.SysFormconfig;
import com.myehr.pojo.formmanage.form.SysFormconfigWithBLOBs;
import com.myehr.pojo.formmanage.form.SysUserDict;
import com.myehr.pojo.formmanage.form.SysUserDictExample;
import com.myehr.pojo.formmanage.widget.SysFileupload;
import com.myehr.pojo.formmanage.widget.SysFormCombobox;
import com.myehr.pojo.formmanage.widget.SysFormComboboxExample;
import com.myehr.pojo.TreeModel;
import com.myehr.service.primaryKey.PrimaryKeyService;
import com.myehr.service.sysdict.SysDictService;
import com.myehr.service.sysdict.SysDictTypeService;
import com.myehr.service.formmanage.form.IFormService;
import com.myehr.service.formmanage.form.ISysformconfigService;
import com.myehr.service.impl.formmanage.form.SysformconfigService;
import com.myehr.test.dao.TMapperExt;

@Controller
@RequestMapping("/cache")
public class CacheController {
	@Autowired
	SysformconfigService sysformconfigService;
	@Autowired
	SysFormButtonMapper sysFormButtonMapper;
	@Autowired
	SysFormColumnMapper sysFormColumnMapper;
	@Autowired
	SysCacheConfigMapper cacheConfigMapper;
	@RequestMapping("/refreshCache")
	public void refreshCache(HttpServletRequest request,@RequestBody List<SysFormconfig> forms) throws Exception{
		for (SysFormconfig sysFormconfig : forms) {
			String formId = sysFormconfig.getFormDefId()+"";
			sysformconfigService.setFormColumns(formId);//重新加载表单关联字段列表缓存
			sysformconfigService.setFormInfo(formId);//刷新表单信息缓存
			//sysformconfigService.setFormFilterColumns(formId);//刷新表单查询字段缓存
			sysformconfigService.setFormFilter(formId);//刷新表单查询配置缓存
			sysformconfigService.setFormWheres(formId);//刷新表单过滤字段缓存
			sysformconfigService.setFileuploadConfigById(formId);
			sysformconfigService.setCardandcardConfig(formId);
			SysFormColumnExample example = new SysFormColumnExample();
			example.or().andFormColumnFormDefIdEqualTo(new BigDecimal(formId));
			List<SysFormColumn> formColumns = sysFormColumnMapper.selectByExample(example);
			for (int i = 0; i < formColumns.size(); i++) {
				SysFormColumn column = formColumns.get(i);
				System.out.println(column.getFormColumnLable());
				String columnId = column.getFormColumnId()+"";
				String fieldId = column.getFormColumnColumnId()+"";
				sysformconfigService.setColumn(columnId);//刷新每一个字段信息缓存
				//sysformconfigService.setEntityColumnByColumnId(fieldId);//刷新每一个字段关联实体信息缓存
				System.out.println(columnId);
				if (column.getFormColumnGuiType().equals("1")) {
					sysformconfigService.setTextbox(columnId);//刷新文本控件信息
				}else if (column.getFormColumnGuiType().equals("2")) {
					sysformconfigService.setCombobox(columnId);//刷新下拉控件信息
				}else if (column.getFormColumnGuiType().equals("3")||column.getFormColumnGuiType().equals("4")) {
					sysformconfigService.setRadiobuttonlist(columnId);//刷新单选多选控件信息
				}else if (column.getFormColumnGuiType().equals("6")) {
					sysformconfigService.setDatepicker(columnId);//刷新日期控件信息
				}else if (column.getFormColumnGuiType().equals("7")) {
					sysformconfigService.setLookup(columnId);//刷新LookUp弹出控件信息
				}else if (column.getFormColumnGuiType().equals("10")) {
					sysformconfigService.setRichtext(columnId);//刷新富文本控件信息
				}else if (column.getFormColumnGuiType().equals("9")) {
					sysformconfigService.setFileupload(columnId);//刷新附件控件信息
				}
			}
			sysformconfigService.setFormbuttons(formId);//刷新表单关联按钮缓存
			SysFormButtonExample example1 = new SysFormButtonExample();
			example1.or().andFormButtonFormDefIdEqualTo(new BigDecimal(formId));
			List<SysFormButton> formButtons = sysFormButtonMapper.selectByExample(example1);
			for (int i = 0; i < formButtons.size(); i++) {
				SysFormButton button = formButtons.get(i);
				String formButtonId = button.getFormButtonId()+"";
				sysformconfigService.setButton(formButtonId);//刷新每一个字段信息缓存
				if("save_form".equals(button.getFormButtonType())||"save".equals(button.getFormButtonType())||"select".equals(button.getFormButtonType())||"other".equals(button.getFormButtonType())){
					sysformconfigService.setButtonSave(formButtonId);//刷新保存按钮信息
				}else if ("add".equals(button.getFormButtonType())||"edit".equals(button.getFormButtonType()) ||"batchEdit".equals(button.getFormButtonType())||"copyAndUpdate".equals(button.getFormButtonType())) {
					sysformconfigService.setButtonAdd(formButtonId);//刷新新增按钮信息
				}else if ("remove".equals(button.getFormButtonType())) {
					sysformconfigService.setButtonRemove(formButtonId);//刷新删除按钮信息
				}else if ("import".equals(button.getFormButtonType())) {
					sysformconfigService.setButtonImport(formButtonId);//刷新导入按钮信息
				}else if ("calculate".equals(button.getFormButtonType())) {
					sysformconfigService.setButtonCalculate(formButtonId);//刷新计算按钮信息
				}else if ("introduce".equals(button.getFormButtonType())) {
					sysformconfigService.setButtonIntroduce(formButtonId);//刷新引入按钮信息
				}else if ("executeSQL".equals(button.getFormButtonType())) {
					sysformconfigService.setSysExecSql(formButtonId);//刷新调用SQL信息
				}
			}
			sysformconfigService.setForm(formId);
		}
	}


	//selectButtonFreshCache
	/**
	 * 选择查询字段
	 * @param request
	 * @param params
	 * @throws Throwable 
	 */
	@RequestMapping("/selectButtonFreshCache")
	public @ResponseBody ResultCacheConfig  selectButtonFreshCache(HttpServletRequest request) throws Throwable {
		String buttonId = request.getParameter("buttonId");
		SysCacheConfigExample example = new SysCacheConfigExample();
		example.or().andObjTypeEqualTo("BUTTON").andObjIdEqualTo(new BigDecimal(buttonId)).andCacheTypeEqualTo("DICT");
		List<SysCacheConfig> configs = cacheConfigMapper.selectByExample(example);
		ResultCacheConfig resultMap = new ResultCacheConfig();
		
		resultMap.setRows(configs);
		resultMap.setTotal(configs.size());
		
		return resultMap;
	}

//saveCacheConfigs
	
	@RequestMapping("/saveCacheConfigs")
	public @ResponseBody String[]  saveCacheConfigs(HttpServletRequest request,@RequestBody List<SysDictType> dictTypes) throws Throwable {
		String buttonId = request.getParameter("buttonId");
		HttpSession session = request.getSession();
		String userId = session.getAttribute("userid")+"";
		for (SysDictType dictType : dictTypes) {
			SysCacheConfig config = new SysCacheConfig();
			config.setObjType("BUTTON");
			config.setObjId(new BigDecimal(buttonId));
			config.setCacheType("DICT");
			config.setCacheId(dictType.getDictTypeCode());
			config.setOperatorName(userId);
			config.setOperatorTime(new Date());
			cacheConfigMapper.insert(config);
		}
		String[] reCode = {"success"};
		return reCode;
	}
	@RequestMapping("/deleteCacheConfigs")
	public @ResponseBody String[]  deleteCacheConfigs(HttpServletRequest request,@RequestBody List<SysCacheConfig> configs) throws Throwable {
		for (SysCacheConfig sysCacheConfig : configs) {
			cacheConfigMapper.deleteByPrimaryKey(sysCacheConfig.getId());
		}
		String[] reCode = {"success"};
		return reCode;
	}
	
	@RequestMapping("/getEditorModelHtmlByButtonId")
	public @ResponseBody String[]  getEditorModelHtmlByButtonId(HttpServletRequest request) throws Throwable {
		String buttonId = request.getParameter("buttonId");
		String formId = request.getParameter("formId");
		String buttonExecSqlType = request.getParameter("buttonExecSqlType");
		SysFormButtonEditorCache editorModel = new SysFormButtonEditorCache(buttonExecSqlType,buttonId);
		SysFormconfigCache form = sysformconfigService.getForm(formId);
		List<SysFormColumnCache> columns = form.getColumns();
		String editorModelValue = editorModel.getButtonEditorModelValue();
		String editorModelHtml = editorModel.getButtonEditorModelHtml();
		String[] reCode = {editorModelHtml,editorModelValue};
		return reCode;
	}
	
}








