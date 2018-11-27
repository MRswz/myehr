package com.myehr.service.impl.formmanage.form;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myehr.mapper.entity.SysEntityMapper;
import com.myehr.mapper.field.SysFieldMapper;
import com.myehr.mapper.formmanage.button.SysFormButtonSaveMapper;
import com.myehr.mapper.formmanage.form.SysExecSqlMapper;
import com.myehr.mapper.formmanage.form.SysFormButtonMapper;
import com.myehr.mapper.formmanage.form.SysFormColumnMapper;
import com.myehr.mapper.formmanage.form.SysFormGeneralParamMapper;
import com.myehr.mapper.formmanage.form.SysFormGroupMapper;
import com.myehr.mapper.formmanage.form.SysFormWhereMapper;
import com.myehr.mapper.formmanage.form.SysFormconfigGridMapper;
import com.myehr.mapper.formmanage.form.SysFormconfigMapper;
import com.myehr.mapper.formmanage.form.SysFormconfigMstTabDetailMapper;
import com.myehr.mapper.formmanage.form.SysFormconfigMstTabMapper;
import com.myehr.mapper.formmanage.form.SysFormconfigTreeMapper;
import com.myehr.mapper.formmanage.form.SysGridFilterColumnMapper;
import com.myehr.mapper.formmanage.form.SysGridFilterMapper;
import com.myehr.mapper.formmanage.form.SysTreeNodeTypeMapper;
import com.myehr.mapper.formmanage.form.SysTreeSolutionColumnMapper;
import com.myehr.mapper.formmanage.form.SysTreeSolutionMapper;
import com.myehr.mapper.formmanage.widget.SysFormCheckboxMapper;
import com.myehr.mapper.formmanage.widget.SysFormCheckboxlistMapper;
import com.myehr.mapper.formmanage.widget.SysFormComboboxMapper;
import com.myehr.mapper.formmanage.widget.SysFormDatepickerMapper;
import com.myehr.mapper.formmanage.widget.SysFormFileuploadMapper;
import com.myehr.mapper.formmanage.widget.SysFormLookupMapper;
import com.myehr.mapper.formmanage.widget.SysFormRadiobuttonlistMapper;
import com.myehr.mapper.formmanage.widget.SysFormRichtextMapper;
import com.myehr.mapper.formmanage.widget.SysFormTextareaMapper;
import com.myehr.mapper.formmanage.widget.SysFormTextboxMapper;
import com.myehr.pojo.entity.SysEntity;
import com.myehr.pojo.entity.SysEntityExample;
import com.myehr.pojo.field.SysField;
import com.myehr.pojo.field.SysFieldExample;
import com.myehr.pojo.formmanage.button.SysFormButtonSave;
import com.myehr.pojo.formmanage.button.SysFormButtonSaveExample;
import com.myehr.pojo.formmanage.cache.SysDatepickerCache;
import com.myehr.pojo.formmanage.cache.SysFormButtonCache;
import com.myehr.pojo.formmanage.cache.SysFormButtonSaveCache;
import com.myehr.pojo.formmanage.cache.SysFormColumnCache;
import com.myehr.pojo.formmanage.cache.SysFormComboboxCache;
import com.myehr.pojo.formmanage.cache.SysFormGroupCache;
import com.myehr.pojo.formmanage.cache.SysFormTreeSolutionCache;
import com.myehr.pojo.formmanage.cache.SysFormTreeSolutionColumnCache;
import com.myehr.pojo.formmanage.cache.SysFormWhereCache;
import com.myehr.pojo.formmanage.cache.SysFormconfigCache;
import com.myehr.pojo.formmanage.cache.SysFormconfigTreeCache;
import com.myehr.pojo.formmanage.cache.SysTextBoxCache;
import com.myehr.pojo.formmanage.form.SysExecSql;
import com.myehr.pojo.formmanage.form.SysExecSqlExample;
import com.myehr.pojo.formmanage.form.SysFormButton;
import com.myehr.pojo.formmanage.form.SysFormButtonExample;
import com.myehr.pojo.formmanage.form.SysFormColumn;
import com.myehr.pojo.formmanage.form.SysFormColumnExample;
import com.myehr.pojo.formmanage.form.SysFormGeneralParam;
import com.myehr.pojo.formmanage.form.SysFormGeneralParamExample;
import com.myehr.pojo.formmanage.form.SysFormGroup;
import com.myehr.pojo.formmanage.form.SysFormGroupExample;
import com.myehr.pojo.formmanage.form.SysFormWhere;
import com.myehr.pojo.formmanage.form.SysFormWhereExample;
import com.myehr.pojo.formmanage.form.SysFormconfigExample;
import com.myehr.pojo.formmanage.form.SysFormconfigGrid;
import com.myehr.pojo.formmanage.form.SysFormconfigGridExample;
import com.myehr.pojo.formmanage.form.SysFormconfigMstTab;
import com.myehr.pojo.formmanage.form.SysFormconfigMstTabDetail;
import com.myehr.pojo.formmanage.form.SysFormconfigMstTabDetailExample;
import com.myehr.pojo.formmanage.form.SysFormconfigMstTabExample;
import com.myehr.pojo.formmanage.form.SysFormconfigTree;
import com.myehr.pojo.formmanage.form.SysFormconfigTreeExample;
import com.myehr.pojo.formmanage.form.SysFormconfigWithBLOBs;
import com.myehr.pojo.formmanage.form.SysGridFilter;
import com.myehr.pojo.formmanage.form.SysGridFilterColumn;
import com.myehr.pojo.formmanage.form.SysGridFilterColumnExample;
import com.myehr.pojo.formmanage.form.SysGridFilterExample;
import com.myehr.pojo.formmanage.form.SysTreeNodeType;
import com.myehr.pojo.formmanage.form.SysTreeNodeTypeExample;
import com.myehr.pojo.formmanage.form.SysTreeSolution;
import com.myehr.pojo.formmanage.form.SysTreeSolutionColumn;
import com.myehr.pojo.formmanage.form.SysTreeSolutionExample;
import com.myehr.pojo.formmanage.widget.SysFileupload;
import com.myehr.pojo.formmanage.widget.SysFormCheckbox;
import com.myehr.pojo.formmanage.widget.SysFormCheckboxExample;
import com.myehr.pojo.formmanage.widget.SysFormCheckboxlist;
import com.myehr.pojo.formmanage.widget.SysFormCheckboxlistExample;
import com.myehr.pojo.formmanage.widget.SysFormCombobox;
import com.myehr.pojo.formmanage.widget.SysFormComboboxExample;
import com.myehr.pojo.formmanage.widget.SysFormDatepicker;
import com.myehr.pojo.formmanage.widget.SysFormDatepickerExample;
import com.myehr.pojo.formmanage.widget.SysFormFileupload;
import com.myehr.pojo.formmanage.widget.SysFormFileuploadExample;
import com.myehr.pojo.formmanage.widget.SysFormLookup;
import com.myehr.pojo.formmanage.widget.SysFormLookupExample;
import com.myehr.pojo.formmanage.widget.SysFormRadiobuttonlist;
import com.myehr.pojo.formmanage.widget.SysFormRadiobuttonlistExample;
import com.myehr.pojo.formmanage.widget.SysFormRichtext;
import com.myehr.pojo.formmanage.widget.SysFormRichtextExample;
import com.myehr.pojo.formmanage.widget.SysFormTextarea;
import com.myehr.pojo.formmanage.widget.SysFormTextareaExample;
import com.myehr.pojo.formmanage.widget.SysFormTextbox;
import com.myehr.pojo.formmanage.widget.SysFormTextboxExample;
import com.myehr.service.formmanage.form.IFormCopy;
@Service("formCopyserviceImpl")
public class formCopyserviceImpl implements IFormCopy {
	@Autowired SysFormconfigMapper sFormconfigMapper;
	@Autowired SysFormColumnMapper sColumnMapper;
	@Autowired SysFormTextboxMapper sTextboxMapper;
	@Autowired SysFormComboboxMapper sComboboxMapper;
	@Autowired SysFormCheckboxlistMapper sCheckboxlistMapper;
	@Autowired SysFormRadiobuttonlistMapper sRadiobuttonlistMapper;
	@Autowired SysFormCheckboxMapper sCheckboxMapper;
	@Autowired SysFormDatepickerMapper sDatepickerMapper;
	@Autowired SysFormLookupMapper sLookupMapper;
	@Autowired SysFormTextareaMapper sTextareaMapper;
	@Autowired SysFormFileuploadMapper sFileuploadMapper;
	@Autowired SysFormRichtextMapper sRichtextMapper;
	@Autowired SysFormWhereMapper sWhereMapper;
	@Autowired SysFormButtonMapper sButtonMapper;
	@Autowired SysExecSqlMapper sExecSqlMapper;
	@Autowired SysFormGroupMapper sGroupMapper;
	@Autowired SysFormconfigGridMapper sFormconfigGridMapper;
	@Autowired SysGridFilterMapper sGridFilterMapper;
	@Autowired SysGridFilterColumnMapper sGridFilterColumnMapper;
	@Autowired SysFormconfigTreeMapper sTreeMapper;
	@Autowired SysTreeSolutionMapper solutionMapper;
	@Autowired SysTreeSolutionColumnMapper solutionColumnMapper;
	@Autowired SysTreeNodeTypeMapper sNodeTypeMapper;
	@Autowired SysFormconfigMstTabMapper sMstTabMapper;
	@Autowired SysFormconfigMstTabDetailMapper sMstTabDetailMapper;
	@Autowired SysFormGeneralParamMapper sGeneralParamMapper;
	@Autowired SysEntityMapper entityMapper;
	@Autowired SysFieldMapper fieldMapper;
	@Autowired SysFormButtonSaveMapper saveMapper;
	@Override
	public String cardFormCopy(String formId,String name) {
		// TODO Auto-generated method stub
		//复制目标表单信息
		SysFormconfigWithBLOBs form = sFormconfigMapper.selectByPrimaryKey(new BigDecimal(formId));
		form.setFormDefCode(form.getFormDefCode()+"_COPY");
		SysFormconfigExample example1 = new SysFormconfigExample();
		example1.or().andFormDefCodeEqualTo(form.getFormDefCode());
		if(sFormconfigMapper.selectByExample(example1).size()>0){
			return "1";
		}else{
			form.setOperatorName(name);
			form.setOperatorTime(new Date());
			sFormconfigMapper.insert(form);
			String formDefIdNew = sFormconfigMapper.selectByExample(example1).get(0).getFormDefId()+"";
			
			//复制分组信息
			SysFormGroupExample exampleGroup = new SysFormGroupExample();
			exampleGroup.or().andGroupFormDefIdEqualTo(new BigDecimal(formId));
			List<SysFormGroup> groups = sGroupMapper.selectByExample(exampleGroup);
			for (SysFormGroup sysFormGroup : groups) {
				sysFormGroup.setGroupFormDefId(new BigDecimal(formDefIdNew));
				sysFormGroup.setOperatorName(name);
				sysFormGroup.setOperatorTime(new Date());
				sGroupMapper.insert(sysFormGroup);
			}
			
			//复制字段信息
			SysFormColumnExample example2 = new SysFormColumnExample();
			example2.or().andFormColumnFormDefIdEqualTo(new BigDecimal(formId));
			List<SysFormColumn> columns = sColumnMapper.selectByExample(example2);
			for (SysFormColumn sysFormColumn : columns) {
				sysFormColumn.setFormColumnFormDefId(new BigDecimal(formDefIdNew));
				sysFormColumn.setOperatorName(name);
				sysFormColumn.setOperatorTime(new Date());
				sColumnMapper.insert(sysFormColumn);
				SysFormColumnExample example3 = new SysFormColumnExample();
				example3.or().andFormEntityTablenameEqualTo(sysFormColumn.getFormEntityTablename()).andFormFieldTablenameEqualTo(sysFormColumn.getFormFieldTablename()).andFormColumnFormDefIdEqualTo(new BigDecimal(formDefIdNew));
				SysFormColumn column = sColumnMapper.selectByExample(example3).get(0);//新增复制字段数据
				if(column.getFormColumnGuiType().equals("1")){//文本框
					SysFormTextboxExample exampleTextbox = new SysFormTextboxExample();
					exampleTextbox.or().andTextboxFormColumnIdEqualTo(sysFormColumn.getFormColumnId());
					if (sTextboxMapper.selectByExample(exampleTextbox).size()>0) {
						SysFormTextbox textbox = sTextboxMapper.selectByExample(exampleTextbox).get(0);
						textbox.setTextboxFormColumnId(column.getFormColumnId());
						textbox.setOperatorName(name);
						textbox.setOperatorTime(new Date());
						sTextboxMapper.insert(textbox);
					} 
				}else if (column.getFormColumnGuiType().equals("2")) {//下拉列表选择
					SysFormComboboxExample exampleCombobox = new SysFormComboboxExample();
					exampleCombobox.or().andComboboxFormColumnIdEqualTo(sysFormColumn.getFormColumnId());
					if (sComboboxMapper.selectByExample(exampleCombobox).size()>0) {
						SysFormCombobox combobox = sComboboxMapper.selectByExample(exampleCombobox).get(0);
						combobox.setComboboxFormColumnId(column.getFormColumnId());
						combobox.setComboboxGuiInitExcsqlId(null);//清除调用SQLID
						combobox.setOperatorName(name);
						combobox.setOperatorTime(new Date());
						sComboboxMapper.insert(combobox);
					}
					
				}else if (column.getFormColumnGuiType().equals("3")) {//单选框组
					SysFormRadiobuttonlistExample exampleRadio = new SysFormRadiobuttonlistExample();
					exampleRadio.or().andRadiolistFormColumnIdEqualTo(sysFormColumn.getFormColumnId());
					if(sRadiobuttonlistMapper.selectByExample(exampleRadio).size()>0){
						SysFormRadiobuttonlist radiobuttonlist = sRadiobuttonlistMapper.selectByExample(exampleRadio).get(0);
						radiobuttonlist.setRadiolistFormColumnId(column.getFormColumnId());
						radiobuttonlist.setOperatorName(name);
						radiobuttonlist.setOperatorTime(new Date());
						sRadiobuttonlistMapper.insert(radiobuttonlist);
					}
				}else if (column.getFormColumnGuiType().equals("4")) {//复选框组
					SysFormCheckboxlistExample exampleChecklist = new SysFormCheckboxlistExample();
					exampleChecklist.or().andCheckboxlistFormColumnIdEqualTo(sysFormColumn.getFormColumnId());
					if(sCheckboxlistMapper.selectByExample(exampleChecklist).size()>0){
						SysFormCheckboxlist checkboxlist = sCheckboxlistMapper.selectByExample(exampleChecklist).get(0);
						checkboxlist.setCheckboxlistFormColumnId(column.getFormColumnId());
						checkboxlist.setOperatorName(name);
						checkboxlist.setOperatorTime(new Date());
						sCheckboxlistMapper.insert(checkboxlist);
					}
				}else if (column.getFormColumnGuiType().equals("5")) {//复选框
					SysFormCheckboxExample exampleCheckbox = new SysFormCheckboxExample();
					exampleCheckbox.or().andCheckboxFormColumnIdEqualTo(sysFormColumn.getFormColumnId());
					if(sCheckboxMapper.selectByExample(exampleCheckbox).size()>0){
						SysFormCheckbox checkbox = sCheckboxMapper.selectByExample(exampleCheckbox).get(0);
						checkbox.setCheckboxFormColumnId(column.getFormColumnId());
						checkbox.setOperatorName(name);
						checkbox.setOperatorTime(new Date());
						sCheckboxMapper.insert(checkbox);
					}
				}else if (column.getFormColumnGuiType().equals("6")) {//日期选择框
					SysFormDatepickerExample exampleDate = new SysFormDatepickerExample();
					exampleDate.or().andDatepickerFormColumnIdEqualTo(sysFormColumn.getFormColumnId());
					if(sDatepickerMapper.selectByExample(exampleDate).size()>0){
						SysFormDatepicker datepicker = sDatepickerMapper.selectByExample(exampleDate).get(0);
						datepicker.setDatepickerFormColumnId(column.getFormColumnId());
						datepicker.setOperatorName(name);
						datepicker.setOperatorTime(new Date());
						sDatepickerMapper.insert(datepicker);
					}
				}else if (column.getFormColumnGuiType().equals("7")) {//lookup弹出窗
					SysFormLookupExample exampleLookup = new SysFormLookupExample();
					exampleLookup.or().andLookupFormColumnIdEqualTo(sysFormColumn.getFormColumnId());
					if(sLookupMapper.selectByExample(exampleLookup).size()>0){
						SysFormLookup lookup = sLookupMapper.selectByExample(exampleLookup).get(0);
						lookup.setLookupFormColumnId(column.getFormColumnId());
						lookup.setOperatorName(name);
						lookup.setOperatorTime(new Date());
						sLookupMapper.insert(lookup);
					}
				}else if (column.getFormColumnGuiType().equals("8")) {//多行文本域
					SysFormTextareaExample exampleTextarea = new SysFormTextareaExample();
					exampleTextarea.or().andTextareaFormColumnIdEqualTo(sysFormColumn.getFormColumnId());
					if(sTextareaMapper.selectByExample(exampleTextarea).size()>0){
						SysFormTextarea textarea = sTextareaMapper.selectByExample(exampleTextarea).get(0);
						textarea.setTextareaFormColumnId(column.getFormColumnId());
						textarea.setOperatorName(name);
						textarea.setOperatorTime(new Date());
						sTextareaMapper.insert(textarea);
					}
				}else if (column.getFormColumnGuiType().equals("9")) {//附件
					SysFormFileuploadExample exampleFileload = new SysFormFileuploadExample();
					exampleFileload.or().andFileuploadFormColumnIdEqualTo(sysFormColumn.getFormColumnId());
					if(sFileuploadMapper.selectByExample(exampleFileload).size()>0){
						SysFormFileupload fileupload = sFileuploadMapper.selectByExample(exampleFileload).get(0);
						fileupload.setFileuploadFormColumnId(column.getFormColumnId());
						fileupload.setOperatorName(name);
						fileupload.setOperatorTime(new Date());
						sFileuploadMapper.insert(fileupload);
					}
				}else if (column.getFormColumnGuiType().equals("10")) {//富文本
					SysFormRichtextExample exampleRich = new SysFormRichtextExample();
					exampleRich.or().andRichtextFormColumnIdEqualTo(sysFormColumn.getFormColumnId());
					if(sRichtextMapper.selectByExample(exampleRich).size()>0){
						SysFormRichtext richtext = sRichtextMapper.selectByExample(exampleRich).get(0);
						richtext.setRichtextFormColumnId(column.getFormColumnId());
						richtext.setOperatorName(name);
						richtext.setOperatorTime(new Date());
						sRichtextMapper.insert(richtext);
					}
				}
				//复制过滤信息(过滤信息绑定字段)
				SysFormWhereExample exampleWhere = new SysFormWhereExample();
				exampleWhere.or().andFormWhereColumnIdEqualTo(sysFormColumn.getFormColumnId()+"").andFormWhereFormDefIdEqualTo(new BigDecimal(formId));
				List<SysFormWhere> wheres = sWhereMapper.selectByExample(exampleWhere);
				for (SysFormWhere sysFormWhere : wheres) {
					sysFormWhere.setFormWhereColumnId(column.getFormColumnId()+"");
					sysFormWhere.setFormWhereFormDefId(new BigDecimal(formDefIdNew));
					sysFormWhere.setOperatorName(name);
					sysFormWhere.setOperatorTime(new Date());
					sWhereMapper.insert(sysFormWhere);
				}
			}
			//复制按钮信息(关联表单)
			SysFormButtonExample exampleButton = new SysFormButtonExample();
			exampleButton.or().andFormButtonFormDefIdEqualTo(new BigDecimal(formId));
			List<SysFormButton> buttons = sButtonMapper.selectByExample(exampleButton);
			for (SysFormButton sysFormButton : buttons) {
				sysFormButton.setFormButtonFormDefId(new BigDecimal(formDefIdNew));
				sysFormButton.setOperatorName(name);
				sysFormButton.setOperatorTime(new Date());
				sButtonMapper.insert(sysFormButton);
			}
			return "true";
		}
	}
	@Override
	public String gridFormCopy(String formId, String name) {
		// TODO Auto-generated method stub
		//复制目标表单信息
		SysFormconfigWithBLOBs form = sFormconfigMapper.selectByPrimaryKey(new BigDecimal(formId));
		form.setFormDefCode(form.getFormDefCode()+"_COPY");
		SysFormconfigExample example1 = new SysFormconfigExample();
		example1.or().andFormDefCodeEqualTo(form.getFormDefCode());
		if(sFormconfigMapper.selectByExample(example1).size()>0){
			return "1";
		}else{
			form.setOperatorName(name);
			form.setOperatorTime(new Date());
			sFormconfigMapper.insert(form);
			String formDefIdNew = sFormconfigMapper.selectByExample(example1).get(0).getFormDefId()+"";
			
			//复制列表扩展表信息
			SysFormconfigGridExample exampleGrid = new SysFormconfigGridExample();
			exampleGrid.or().andFormGridFromIdEqualTo(new BigDecimal(formId));
			if (sFormconfigGridMapper.selectByExample(exampleGrid).size()>0) {
				SysFormconfigGrid sGrid = sFormconfigGridMapper.selectByExample(exampleGrid).get(0);
				sGrid.setFormGridFromId(new BigDecimal(formDefIdNew));
				sGrid.setOperatorName(name);
				sGrid.setOperatorTime(new Date());
				sFormconfigGridMapper.insert(sGrid);
			}
			
			//复制分组信息
			SysFormGroupExample exampleGroup = new SysFormGroupExample();
			exampleGroup.or().andGroupFormDefIdEqualTo(new BigDecimal(formId));
			List<SysFormGroup> groups = sGroupMapper.selectByExample(exampleGroup);
			for (SysFormGroup sysFormGroup : groups) {
				sysFormGroup.setGroupFormDefId(new BigDecimal(formDefIdNew));
				sysFormGroup.setOperatorName(name);
				sysFormGroup.setOperatorTime(new Date());
				sGroupMapper.insert(sysFormGroup);
			}
			
			//复制查询配置信息
			SysGridFilterExample examplegGridFilter = new SysGridFilterExample();
			examplegGridFilter.or().andGridFilterFormDefIdEqualTo(new BigDecimal(formId));
			if (sGridFilterMapper.selectByExample(examplegGridFilter).size()>0) {
				SysGridFilter gridFilter = sGridFilterMapper.selectByExample(examplegGridFilter).get(0);
				gridFilter.setGridFilterFormDefId(new BigDecimal(formDefIdNew));
				gridFilter.setOperatorName(name);
				gridFilter.setOperatorTime(new Date());
				sGridFilterMapper.insert(gridFilter);
			}
			SysGridFilterExample examplegGridFilter1 = new SysGridFilterExample();
			examplegGridFilter1.or().andGridFilterFormDefIdEqualTo(new BigDecimal(formDefIdNew));
			String gridFilterId = sGridFilterMapper.selectByExample(examplegGridFilter1).get(0).getGridFilterId()+"";
			
			//复制字段信息
			SysFormColumnExample example2 = new SysFormColumnExample();
			example2.or().andFormColumnFormDefIdEqualTo(new BigDecimal(formId));
			List<SysFormColumn> columns = sColumnMapper.selectByExample(example2);
			for (SysFormColumn sysFormColumn : columns) {
				sysFormColumn.setFormColumnFormDefId(new BigDecimal(formDefIdNew));
				sysFormColumn.setOperatorName(name);
				sysFormColumn.setOperatorTime(new Date());
				sColumnMapper.insert(sysFormColumn);
				SysFormColumnExample example3 = new SysFormColumnExample();
				example3.or().andFormFieldTablenameEqualTo(sysFormColumn.getFormFieldTablename()).andFormColumnFormDefIdEqualTo(new BigDecimal(formDefIdNew));
				SysFormColumn column = sColumnMapper.selectByExample(example3).get(0);//新增复制字段数据
				if(column.getFormColumnGuiType().equals("1")){//文本框
					SysFormTextboxExample exampleTextbox = new SysFormTextboxExample();
					exampleTextbox.or().andTextboxFormColumnIdEqualTo(sysFormColumn.getFormColumnId());
					if (sTextboxMapper.selectByExample(exampleTextbox).size()>0) {
						SysFormTextbox textbox = sTextboxMapper.selectByExample(exampleTextbox).get(0);
						textbox.setTextboxFormColumnId(column.getFormColumnId());
						textbox.setOperatorName(name);
						textbox.setOperatorTime(new Date());
						sTextboxMapper.insert(textbox);
					} 
				}else if (column.getFormColumnGuiType().equals("2")) {//下拉列表选择
					SysFormComboboxExample exampleCombobox = new SysFormComboboxExample();
					exampleCombobox.or().andComboboxFormColumnIdEqualTo(sysFormColumn.getFormColumnId());
					if (sComboboxMapper.selectByExample(exampleCombobox).size()>0) {
						SysFormCombobox combobox = sComboboxMapper.selectByExample(exampleCombobox).get(0);
						combobox.setComboboxFormColumnId(column.getFormColumnId());
						combobox.setComboboxGuiInitExcsqlId(null);//清除调用SQLID
						combobox.setOperatorName(name);
						combobox.setOperatorTime(new Date());
						sComboboxMapper.insert(combobox);
					}
					
				}else if (column.getFormColumnGuiType().equals("3")) {//单选框组
					SysFormRadiobuttonlistExample exampleRadio = new SysFormRadiobuttonlistExample();
					exampleRadio.or().andRadiolistFormColumnIdEqualTo(sysFormColumn.getFormColumnId());
					if(sRadiobuttonlistMapper.selectByExample(exampleRadio).size()>0){
						SysFormRadiobuttonlist radiobuttonlist = sRadiobuttonlistMapper.selectByExample(exampleRadio).get(0);
						radiobuttonlist.setRadiolistFormColumnId(column.getFormColumnId());
						radiobuttonlist.setOperatorName(name);
						radiobuttonlist.setOperatorTime(new Date());
						sRadiobuttonlistMapper.insert(radiobuttonlist);
					}
				}else if (column.getFormColumnGuiType().equals("4")) {//复选框组
					SysFormCheckboxlistExample exampleChecklist = new SysFormCheckboxlistExample();
					exampleChecklist.or().andCheckboxlistFormColumnIdEqualTo(sysFormColumn.getFormColumnId());
					if(sCheckboxlistMapper.selectByExample(exampleChecklist).size()>0){
						SysFormCheckboxlist checkboxlist = sCheckboxlistMapper.selectByExample(exampleChecklist).get(0);
						checkboxlist.setCheckboxlistFormColumnId(column.getFormColumnId());
						checkboxlist.setOperatorName(name);
						checkboxlist.setOperatorTime(new Date());
						sCheckboxlistMapper.insert(checkboxlist);
					}
				}else if (column.getFormColumnGuiType().equals("5")) {//复选框
					SysFormCheckboxExample exampleCheckbox = new SysFormCheckboxExample();
					exampleCheckbox.or().andCheckboxFormColumnIdEqualTo(sysFormColumn.getFormColumnId());
					if(sCheckboxMapper.selectByExample(exampleCheckbox).size()>0){
						SysFormCheckbox checkbox = sCheckboxMapper.selectByExample(exampleCheckbox).get(0);
						checkbox.setCheckboxFormColumnId(column.getFormColumnId());
						checkbox.setOperatorName(name);
						checkbox.setOperatorTime(new Date());
						sCheckboxMapper.insert(checkbox);
					}
				}else if (column.getFormColumnGuiType().equals("6")) {//日期选择框
					SysFormDatepickerExample exampleDate = new SysFormDatepickerExample();
					exampleDate.or().andDatepickerFormColumnIdEqualTo(sysFormColumn.getFormColumnId());
					if(sDatepickerMapper.selectByExample(exampleDate).size()>0){
						SysFormDatepicker datepicker = sDatepickerMapper.selectByExample(exampleDate).get(0);
						datepicker.setDatepickerFormColumnId(column.getFormColumnId());
						datepicker.setOperatorName(name);
						datepicker.setOperatorTime(new Date());
						sDatepickerMapper.insert(datepicker);
					}
				}else if (column.getFormColumnGuiType().equals("7")) {//lookup弹出窗
					SysFormLookupExample exampleLookup = new SysFormLookupExample();
					exampleLookup.or().andLookupFormColumnIdEqualTo(sysFormColumn.getFormColumnId());
					if(sLookupMapper.selectByExample(exampleLookup).size()>0){
						SysFormLookup lookup = sLookupMapper.selectByExample(exampleLookup).get(0);
						lookup.setLookupFormColumnId(column.getFormColumnId());
						lookup.setOperatorName(name);
						lookup.setOperatorTime(new Date());
						sLookupMapper.insert(lookup);
					}
				}else if (column.getFormColumnGuiType().equals("8")) {//多行文本域
					SysFormTextareaExample exampleTextarea = new SysFormTextareaExample();
					exampleTextarea.or().andTextareaFormColumnIdEqualTo(sysFormColumn.getFormColumnId());
					if(sTextareaMapper.selectByExample(exampleTextarea).size()>0){
						SysFormTextarea textarea = sTextareaMapper.selectByExample(exampleTextarea).get(0);
						textarea.setTextareaFormColumnId(column.getFormColumnId());
						textarea.setOperatorName(name);
						textarea.setOperatorTime(new Date());
						sTextareaMapper.insert(textarea);
					}
				}else if (column.getFormColumnGuiType().equals("9")) {//附件
					SysFormFileuploadExample exampleFileload = new SysFormFileuploadExample();
					exampleFileload.or().andFileuploadFormColumnIdEqualTo(sysFormColumn.getFormColumnId());
					if(sFileuploadMapper.selectByExample(exampleFileload).size()>0){
						SysFormFileupload fileupload = sFileuploadMapper.selectByExample(exampleFileload).get(0);
						fileupload.setFileuploadFormColumnId(column.getFormColumnId());
						fileupload.setOperatorName(name);
						fileupload.setOperatorTime(new Date());
						sFileuploadMapper.insert(fileupload);
					}
				}else if (column.getFormColumnGuiType().equals("10")) {//富文本
					SysFormRichtextExample exampleRich = new SysFormRichtextExample();
					exampleRich.or().andRichtextFormColumnIdEqualTo(sysFormColumn.getFormColumnId());
					if(sRichtextMapper.selectByExample(exampleRich).size()>0){
						SysFormRichtext richtext = sRichtextMapper.selectByExample(exampleRich).get(0);
						richtext.setRichtextFormColumnId(column.getFormColumnId());
						richtext.setOperatorName(name);
						richtext.setOperatorTime(new Date());
						sRichtextMapper.insert(richtext);
					}
				}
				//复制过滤信息(过滤信息绑定字段)
				SysFormWhereExample exampleWhere = new SysFormWhereExample();
				exampleWhere.or().andFormWhereColumnIdEqualTo(sysFormColumn.getFormColumnId()+"").andFormWhereFormDefIdEqualTo(new BigDecimal(formId));
				List<SysFormWhere> wheres = sWhereMapper.selectByExample(exampleWhere);
				for (SysFormWhere sysFormWhere : wheres) {
					sysFormWhere.setFormWhereColumnId(column.getFormColumnId()+"");
					sysFormWhere.setFormWhereFormDefId(new BigDecimal(formDefIdNew));
					sysFormWhere.setOperatorName(name);
					sysFormWhere.setOperatorTime(new Date());
					sWhereMapper.insert(sysFormWhere);
				}
				
				//复制查询配置信息
				SysGridFilterColumnExample exampleGrColumn = new SysGridFilterColumnExample();
				exampleGrColumn.or().andGridColumnIdEqualTo(sysFormColumn.getFormColumnId());
				if (sGridFilterColumnMapper.selectByExample(exampleGrColumn).size()>0) {
					List<SysGridFilterColumn> sGridFilterColumns = sGridFilterColumnMapper.selectByExample(exampleGrColumn);
					for (SysGridFilterColumn sysGridFilterColumn : sGridFilterColumns) {
						sysGridFilterColumn.setGridColumnId(column.getFormColumnId());
						sysGridFilterColumn.setGridColumnFilterId(new BigDecimal(gridFilterId));
						sysGridFilterColumn.setOperatorName(name);
						sysGridFilterColumn.setOperatorTime(new Date());
						sGridFilterColumnMapper.insert(sysGridFilterColumn);
					}
				}
			}
			//复制按钮信息(关联表单)
			SysFormButtonExample exampleButton = new SysFormButtonExample();
			exampleButton.or().andFormButtonFormDefIdEqualTo(new BigDecimal(formId));
			List<SysFormButton> buttons = sButtonMapper.selectByExample(exampleButton);
			for (SysFormButton sysFormButton : buttons) {
				sysFormButton.setFormButtonFormDefId(new BigDecimal(formDefIdNew));
				sysFormButton.setOperatorName(name);
				sysFormButton.setOperatorTime(new Date());
				sButtonMapper.insert(sysFormButton);
			}
			return "true";
		}
	}
	@Override
	public String treeFormCopy(String formId, String name) {
		// TODO Auto-generated method stub
		//复制目标表单信息
		SysFormconfigWithBLOBs form = sFormconfigMapper.selectByPrimaryKey(new BigDecimal(formId));
		form.setFormDefCode(form.getFormDefCode()+"_COPY");
		SysFormconfigExample example1 = new SysFormconfigExample();
		example1.or().andFormDefCodeEqualTo(form.getFormDefCode());
		if(sFormconfigMapper.selectByExample(example1).size()>0){
			return "1";
		}else{
			form.setOperatorName(name);
			form.setOperatorTime(new Date());
			sFormconfigMapper.insert(form);
			String formDefIdNew = sFormconfigMapper.selectByExample(example1).get(0).getFormDefId()+"";
			
			//复制树信息
			SysFormconfigTreeExample exampleTree = new SysFormconfigTreeExample();
			exampleTree.or().andFormTreeFormIdEqualTo(new BigDecimal(formId));
			if (sTreeMapper.selectByExample(exampleTree).size()>0) {
				SysFormconfigTree tree = sTreeMapper.selectByExample(exampleTree).get(0);
				tree.setFormTreeFormId(new BigDecimal(formDefIdNew));
				tree.setOperatorName(name);
				tree.setOperatorTime(new Date());
				sTreeMapper.insert(tree);
			}
			
			//复制树节点信息
			SysTreeNodeTypeExample exampleNode = new SysTreeNodeTypeExample();
			exampleNode.or().andFormTreeFormIdEqualTo(new BigDecimal(formId));
			List<SysTreeNodeType> nodes = sNodeTypeMapper.selectByExample(exampleNode);
			for (SysTreeNodeType sysTreeNodeType : nodes) {
				sysTreeNodeType.setFormTreeFormId(new BigDecimal(formDefIdNew));
				sysTreeNodeType.setOperatorName(name);
				sysTreeNodeType.setOperatorTime(new Date());
			}
			
		}
		
		return "true";
	}
	@Override
	public String mstFormCopy(String formId, String name) {
		// TODO Auto-generated method stub
		//复制目标表单信息
		SysFormconfigWithBLOBs form = sFormconfigMapper.selectByPrimaryKey(new BigDecimal(formId));
		form.setFormDefCode(form.getFormDefCode()+"_COPY");
		SysFormconfigExample example1 = new SysFormconfigExample();
		example1.or().andFormDefCodeEqualTo(form.getFormDefCode());
		if(sFormconfigMapper.selectByExample(example1).size()>0){
			return "1";
		}else{
			form.setOperatorName(name);
			form.setOperatorTime(new Date());
			sFormconfigMapper.insert(form);
			String formDefIdNew = sFormconfigMapper.selectByExample(example1).get(0).getFormDefId()+"";
			
			//复制主从配置信息
			SysFormconfigMstTabExample exampleMstTab = new SysFormconfigMstTabExample();
			exampleMstTab.or().andMstTabFormIdEqualTo(new BigDecimal(formId));
			if (sMstTabMapper.selectByExample(exampleMstTab).size()>0) {
				SysFormconfigMstTab sMstTab = sMstTabMapper.selectByExample(exampleMstTab).get(0);
				sMstTab.setMstTabFormId(new BigDecimal(formDefIdNew));
				sMstTab.setOperatorName(name);
				sMstTab.setOperatorTime(new Date());
				sMstTabMapper.insert(sMstTab);
				SysFormconfigMstTabExample exampleMstTab1 = new SysFormconfigMstTabExample();
				exampleMstTab1.or().andMstTabFormIdEqualTo(new BigDecimal(formDefIdNew));
				String mstTabId = sMstTabMapper.selectByExample(exampleMstTab1).get(0).getMstTabId()+"";
				//复制主从扩展信息
				SysFormconfigMstTabDetailExample exampleMstTabDetail = new SysFormconfigMstTabDetailExample();
				exampleMstTabDetail.or().andMstTabIdEqualTo(sMstTab.getMstTabId());
				List<SysFormconfigMstTabDetail> mstTabDetails = sMstTabDetailMapper.selectByExample(exampleMstTabDetail);
				for (SysFormconfigMstTabDetail sysFormconfigMstTabDetail : mstTabDetails) {
					sysFormconfigMstTabDetail.setMstTabId(new BigDecimal(mstTabId));
					sysFormconfigMstTabDetail.setOperatorName(name);
					sysFormconfigMstTabDetail.setOperatorTime(new Date());
					sMstTabDetailMapper.insert(sysFormconfigMstTabDetail);
				}
			}
			//复制主表输出参数信息
			SysFormGeneralParamExample exampleGeneralParam = new SysFormGeneralParamExample();
			exampleGeneralParam.or().andParamTypeEqualTo("FORM_TAB|FORM_MST_TAB").andParamTypeValueEqualTo(new BigDecimal(formId));
			List<SysFormGeneralParam> generalParams = sGeneralParamMapper.selectByExample(exampleGeneralParam);
			for (SysFormGeneralParam sysFormGeneralParam : generalParams) {
				sysFormGeneralParam.setParamTypeValue(new BigDecimal(formDefIdNew));
				sysFormGeneralParam.setOperatorName(name);
				sysFormGeneralParam.setOperatorTime(new Date());
				sGeneralParamMapper.insert(sysFormGeneralParam);
			}
			
		}
		return "true";	
	}
	@Override
	public String tabsFormCopy(String formId, String name) {
		// TODO Auto-generated method stub
		//复制目标表单信息
		SysFormconfigWithBLOBs form = sFormconfigMapper.selectByPrimaryKey(new BigDecimal(formId));
		form.setFormDefCode(form.getFormDefCode()+"_COPY");
		SysFormconfigExample example1 = new SysFormconfigExample();
		example1.or().andFormDefCodeEqualTo(form.getFormDefCode());
		if(sFormconfigMapper.selectByExample(example1).size()>0){
			return "1";
		}else{
			form.setOperatorName(name);
			form.setOperatorTime(new Date());
			sFormconfigMapper.insert(form);
			String formDefIdNew = sFormconfigMapper.selectByExample(example1).get(0).getFormDefId()+"";
			
			//复制主从配置信息
			SysFormconfigMstTabExample exampleMstTab = new SysFormconfigMstTabExample();
			exampleMstTab.or().andMstTabFormIdEqualTo(new BigDecimal(formId));
			if (sMstTabMapper.selectByExample(exampleMstTab).size()>0) {
				SysFormconfigMstTab sMstTab = sMstTabMapper.selectByExample(exampleMstTab).get(0);
				sMstTab.setMstTabFormId(new BigDecimal(formDefIdNew));
				sMstTab.setOperatorName(name);
				sMstTab.setOperatorTime(new Date());
				sMstTabMapper.insert(sMstTab);
				SysFormconfigMstTabExample exampleMstTab1 = new SysFormconfigMstTabExample();
				exampleMstTab1.or().andMstTabFormIdEqualTo(new BigDecimal(formDefIdNew));
				String mstTabId = sMstTabMapper.selectByExample(exampleMstTab1).get(0).getMstTabId()+"";
				//复制主从扩展信息
				SysFormconfigMstTabDetailExample exampleMstTabDetail = new SysFormconfigMstTabDetailExample();
				exampleMstTabDetail.or().andMstTabIdEqualTo(sMstTab.getMstTabId());
				List<SysFormconfigMstTabDetail> mstTabDetails = sMstTabDetailMapper.selectByExample(exampleMstTabDetail);
				for (SysFormconfigMstTabDetail sysFormconfigMstTabDetail : mstTabDetails) {
					sysFormconfigMstTabDetail.setMstTabId(new BigDecimal(mstTabId));
					sysFormconfigMstTabDetail.setOperatorName(name);
					sysFormconfigMstTabDetail.setOperatorTime(new Date());
					sMstTabDetailMapper.insert(sysFormconfigMstTabDetail);
				}
			}
		}
		return "true";						
	}
	@Override
	public String referUrl(SysFormconfigWithBLOBs form, String name) {
		// TODO Auto-generated method stub
		try {
			SysFormconfigWithBLOBs form1 = sFormconfigMapper.selectByPrimaryKey(form.getFormDefId());
			form1.setOperatorName(name);
			form1.setOperatorTime(new Date());
			form1.setFormSubmitStatus("Y");
			sFormconfigMapper.updateByPrimaryKeySelective(form1);
			return "true";
		} catch (Exception e) {
			// TODO: handle exception
			return "false";
		}
		
	}
	
	@Override
	public String removeRefer(SysFormconfigWithBLOBs form, String name) {
		// TODO Auto-generated method stub
		try {
			SysFormconfigWithBLOBs form1 = sFormconfigMapper.selectByPrimaryKey(form.getFormDefId());
			form1.setOperatorName(name);
			form1.setOperatorTime(new Date());
			form1.setFormSubmitStatus("N");
			form1.setFormSubmitUrl(null);
			sFormconfigMapper.updateByPrimaryKeySelective(form1);
			return "true";
		} catch (Exception e) {
			// TODO: handle exception
			return "false";
		}
		
	}
	@Override
	public void importantTreeDatas(SysFormconfigCache formCache,Map map) {
		SysFormconfigTreeCache treeCache = formCache.getTree();//
		SysFormTreeSolutionCache treeSolutionCache = treeCache.getSolution();//
		List<SysFormTreeSolutionColumnCache> treeSolutionColumnCache = treeSolutionCache.getColumns();
		Map entityMap = new HashMap();
		Map fieldMap = new HashMap();
		/*
		//树表单插入
		SysFormconfigWithBLOBs treeForm = formCache.getPojoform();
		SysFormconfigExample example = new SysFormconfigExample();
		example.or().andFormDefCodeEqualTo(treeForm.getFormDefCode());
		if(sFormconfigMapper.selectByExample(example).size()>0){
			treeForm.setFormDefId(sFormconfigMapper.selectByExample(example).get(0).getFormDefId());
			sFormconfigMapper.updateByPrimaryKeyWithBLOBs(treeForm);
		}else {
			sFormconfigMapper.insert(treeForm);
		}
		
		//树方案信息插入
		SysTreeSolution treeSolution = treeSolutionCache.getTreeSolution();
		
		SysTreeSolutionExample example2 = new SysTreeSolutionExample();
		example2.or().andTreeSolutionCodeEqualTo(treeSolution.getTreeSolutionCode());
		
		if(solutionMapper.selectByExample(example2).size()>0){
			treeSolution.setTreeSolutionId(solutionMapper.selectByExample(example2).get(0).getTreeSolutionId());
			solutionMapper.updateByPrimaryKey(treeSolution);
		}else {
			solutionMapper.insert(treeSolution);
		}
		
		//树方案字段信息
		for (SysFormTreeSolutionColumnCache columnCache : treeSolutionColumnCache) {
			//字段关联实体信息
			SysEntity entity = columnCache.getEntity();
			//一次导入中实体和实体字段只更新一次
			if(entityMap.get(entity.getEntityCode())!=null){
				entity = (SysEntity) entityMap.get(entity.getEntityCode());
			}else{
				SysEntityExample example3 = new SysEntityExample();
				example3.or().andEntityCodeEqualTo(entity.getEntityCode());
				if(entityMapper.selectByExample(example3).size()>0){
					entity.setEntityId(entityMapper.selectByExample(example3).get(0).getEntityId());
					entityMapper.updateByPrimaryKey(entity);
					entityMap.put(entity.getEntityCode(), entity);
				}else{
					entityMapper.insert(entity);
					entityMap.put(entity.getEntityCode(), entity);
				}
			}
			SysField field = columnCache.getField();
			if(fieldMap.get(field.getFieldCode())!=null){
				field = (SysField) fieldMap.get(field.getFieldCode());
			}else{
				SysFieldExample example3 = new SysFieldExample();
				example3.or().andFieldCodeEqualTo(field.getFieldCode());
				field.setFieldEntityId(new BigDecimal(entity.getEntityId()));
				if(fieldMapper.selectByExample(example3).size()>0){
					field.setFieldId(fieldMapper.selectByExample(example3).get(0).getFieldId());
					fieldMapper.updateByPrimaryKey(field);
					fieldMap.put(field.getFieldCode(), field);
				}else{
					fieldMapper.insert(field);
					fieldMap.put(field.getFieldCode(), field);
				}
			}
			SysTreeSolutionColumn solutionColumn = columnCache.getPojo();
			solutionColumn.setTreeEntityId(field.getFieldEntityId());
			solutionColumn.setTreeColumnId(field.getFieldId());
			solutionColumn.setTreeSolutionId(treeSolution.getTreeSolutionId());
			solutionColumnMapper.insert(solutionColumn);
		}
		
		//树插入
		SysFormconfigTree tree = treeCache.getTree();
		tree.setFormTreeFormId(treeForm.getFormDefId());
		tree.setFormTreeSolutionId(treeSolution.getTreeSolutionId());
		sTreeMapper.insert(tree);
		
		//树节点关联表单
		
		SysTreeNodeType node = formCache.getTreeNodeType();
		*/
	}
	@Override
	public void importantCardDatas(SysFormconfigCache formCache, Map map) {
		Map entityMap = new HashMap();
		Map fieldMap = new HashMap();
		//卡片表单信息
		SysFormconfigWithBLOBs form = formCache.getPojoform();
		String key = "formId_"+form.getFormDefId();
		SysFormconfigExample example1 = new SysFormconfigExample();
		example1.or().andFormDefCodeEqualTo(form.getFormDefCode());
		List<SysFormconfigWithBLOBs> forms = sFormconfigMapper.selectByExampleWithBLOBs(example1);
		if (forms.size()>0) {
			SysFormconfigWithBLOBs oldForm = forms.get(0);
			form.setFormDefId(oldForm.getFormDefId());
			map.put(key, form.getFormDefId()+"");//导入前后formId
			sFormconfigMapper.updateByPrimaryKeyWithBLOBs(form);//编码重复的更新
			
			//分组及字段
			SysFormGroupExample example2 = new SysFormGroupExample();
			example2.or().andGroupFormDefIdEqualTo(new BigDecimal(formCache.getFormDefId()));
			sGroupMapper.deleteByExample(example2);//删除表单关联分组信息
			
			SysFormColumnExample example3 = new SysFormColumnExample();
			example3.or().andFormColumnFormDefIdEqualTo(new BigDecimal(formCache.getFormDefId()));
			List<SysFormColumn> deColumns = sColumnMapper.selectByExample(example3);
			//删除表单关联控件信息
			for (SysFormColumn column : deColumns) {
				BigDecimal columnId = column.getFormColumnId();
				if("1".equals(column.getFormColumnGuiType())||"8".equals(column.getFormColumnGuiType())){ //textbox控件
					SysFormTextboxExample example = new SysFormTextboxExample();
					example.or().andTextboxFormColumnIdEqualTo(columnId);
					sTextboxMapper.deleteByExample(example);
				}else if("2".equals(column.getFormColumnGuiType())){ //单选下拉控件
					SysFormComboboxExample example = new SysFormComboboxExample();
					example.or().andComboboxFormColumnIdEqualTo(columnId);
					sComboboxMapper.deleteByExample(example);
				}else if("3".equals(column.getFormColumnGuiType())){ //单选框组
					SysFormRadiobuttonlistExample example = new SysFormRadiobuttonlistExample();
					example.or().andRadiolistFormColumnIdEqualTo(columnId);
					sRadiobuttonlistMapper.deleteByExample(example);
				}else if("4".equals(column.getFormColumnGuiType())){ //复选框组
					SysFormCheckboxlistExample example = new SysFormCheckboxlistExample();
					example.or().andCheckboxlistFormColumnIdEqualTo(columnId);
					sCheckboxlistMapper.deleteByExample(example);
				}else if("6".equals(column.getFormColumnGuiType())){//日期
					SysFormDatepickerExample example = new SysFormDatepickerExample();
					example.or().andDatepickerFormColumnIdEqualTo(columnId);
					sDatepickerMapper.deleteByExample(example);
				}else if("7".equals(column.getFormColumnGuiType())){
					
				}else if("10".equals(column.getFormColumnGuiType())){ //富文本
					
				}else if("9".equals(column.getFormColumnGuiType())){
					
				}
			}
			sColumnMapper.deleteByExample(example3);//删除表单关联字段信息
			//删除过滤
			SysFormWhereExample whereExample = new SysFormWhereExample();
			whereExample.or().andFormWhereFormDefIdEqualTo(new BigDecimal(formCache.getFormDefId()));
			sWhereMapper.deleteByExample(whereExample);
			//删除按钮
			SysFormButtonExample buttonExample = new SysFormButtonExample();
			buttonExample.or().andFormButtonFormDefIdEqualTo(new BigDecimal(formCache.getFormDefId()));
			List<SysFormButton> buttons = sButtonMapper.selectByExample(buttonExample);
			for (SysFormButton sysFormButton : buttons) {
				if("save_form".equals(sysFormButton.getFormButtonType())||"free_submit".equals(sysFormButton.getFormButtonType())||"save".equals(sysFormButton.getFormButtonType())||"select".equals(sysFormButton.getFormButtonType())||"other".equals(sysFormButton.getFormButtonType())){
					SysFormButtonSaveExample saveExample = new SysFormButtonSaveExample();
					saveExample.or().andButtonSaveButtonIdEqualTo(sysFormButton.getFormButtonId());
					saveMapper.deleteByExample(saveExample);
					SysExecSqlExample execSqlExample = new SysExecSqlExample();
					//前置触发
					execSqlExample.or().andExecSqlTypeEqualTo("EXECSQL_BUTTON_HZ_TYPE").andExecSqlRelaidEqualTo(Long.valueOf(sysFormButton.getFormButtonId()+""));
					//后置触发
					execSqlExample.or().andExecSqlTypeEqualTo("EXECSQL_BUTTON_QZ_TYPE").andExecSqlRelaidEqualTo(Long.valueOf(sysFormButton.getFormButtonId()+""));
					sExecSqlMapper.deleteByExample(execSqlExample);
				} else if ("executeSQL".equals(sysFormButton.getFormButtonType())) {
					SysExecSqlExample execSqlExample = new SysExecSqlExample();
					//前置触发
					execSqlExample.or().andExecSqlTypeEqualTo("EXECSQL_BUTTON_HZ_TYPE").andExecSqlRelaidEqualTo(Long.valueOf(sysFormButton.getFormButtonId()+""));
					//后置触发
					execSqlExample.or().andExecSqlTypeEqualTo("EXECSQL_BUTTON_QZ_TYPE").andExecSqlRelaidEqualTo(Long.valueOf(sysFormButton.getFormButtonId()+""));
					sExecSqlMapper.deleteByExample(execSqlExample);
				} 
			}
			sButtonMapper.deleteByExample(buttonExample);
		} else {
			sFormconfigMapper.insert(form);//编码不重复新增
			map.put(key,form.getFormDefId());//导入前后formId
		}
		
		List<SysFormGroupCache> groups = formCache.getGroups();
		for (SysFormGroupCache sysFormGroupCache : groups) {
			SysFormGroup group = sysFormGroupCache.getPojo();
			String groupKey = "groupId_"+group.getFormGroupId();
			group.setGroupFormDefId(new BigDecimal(map.get("formId_"+group.getGroupFormDefId())+""));
			sGroupMapper.insert(group);//插入分组信息
			map.put(groupKey,group.getFormGroupId());
			List<SysFormColumnCache> groupColumnCaches = sysFormGroupCache.getColumns();
			//
			for (SysFormColumnCache sysFormColumnCache : groupColumnCaches) {
				SysEntity entity = sysFormColumnCache.getEntity();//字体关联实体
				if (entityMap.get(entity.getEntityCode())==null) {//判断是否更新过此实体
					SysEntityExample entityExample = new SysEntityExample();
					entityExample.or().andEntityCodeEqualTo(entity.getEntityCode());
					String entityKey = "entityId_"+entity.getEntityId();
					if (entityMapper.selectByExample(entityExample).size()>0) {
						SysEntity entity2 = entityMapper.selectByExample(entityExample).get(0);
						entity.setEntityId(entity2.getEntityId());
						entityMapper.updateByPrimaryKey(entity);
						map.put(entityKey,entity2.getEntityId());
					}else {
						entityMapper.insert(entity);
						map.put(entityKey,entity.getEntityId());
					}
					entityMap.put(entity.getEntityCode(),"true");
				}
				SysField field = sysFormColumnCache.getField();
				if (fieldMap.get(field.getFieldEntityId()+"_"+field.getFieldCode())==null){
					SysFieldExample fieldExample = new SysFieldExample();
					fieldExample.or().andFieldCodeEqualTo(field.getFieldCode());
					String fieldKey = "fieldId_"+field.getFieldId();
					if (fieldMapper.selectByExample(fieldExample).size()>0) {
						SysField field2 = fieldMapper.selectByExample(fieldExample).get(0);
						field.setFieldId(field2.getFieldId());
						field.setFieldEntityId(new BigDecimal(map.get("entityId_"+field.getFieldEntityId())+""));
						fieldMapper.updateByPrimaryKey(field);
						map.put(fieldKey,field.getFieldId());
					} else {
						field.setFieldEntityId(new BigDecimal(map.get("entityId_"+field.getFieldEntityId())+""));
						fieldMapper.insert(field);
						map.put(fieldKey,field.getFieldId());
					}
					fieldMap.put(field.getFieldEntityId()+"_"+field.getFieldCode(), "true");
				}
				//字段信息
				SysFormColumn column = new SysFormColumn();
				column = sysFormColumnCache.getPojo();
				String columnKey = "columnId_"+column.getFormColumnId();
				column.setFormColumnFormDefId(new BigDecimal(map.get("formId_"+column.getFormColumnFormDefId())+""));
				column.setFormColumnEntityId(new BigDecimal(map.get("entityId_"+column.getFormColumnEntityId())+""));
				column.setFormColumnColumnId(new BigDecimal(map.get("fieldId_"+column.getFormColumnColumnId())+""));
				column.setFormColumnGroupId(map.get("groupId_"+column.getFormColumnGroupId())+"");
				sColumnMapper.insert(column); 
				map.put(columnKey,column.getFormColumnId());
				//字段控件信息
				BigDecimal columnId = column.getFormColumnId();
				if("1".equals(column.getFormColumnGuiType())||"8".equals(column.getFormColumnGuiType())){ //textbox控件
					SysFormTextbox textbox = ((SysTextBoxCache)sysFormColumnCache.getFormColumGui()).getPojo();
					String textBoxKey = "textboxId_"+textbox.getTextboxId();
					if (!((textbox.getTextboxFormColumnId()+"").equals("0"))) {
						textbox.setTextboxFormColumnId(new BigDecimal(map.get("columnId_"+textbox.getTextboxFormColumnId())+""));
						sTextboxMapper.insert(textbox);
						map.put(textBoxKey, textbox.getTextboxId());
					}
					
				}else if("2".equals(column.getFormColumnGuiType())){ //单选下拉控件
					SysFormCombobox combobox = ((SysFormComboboxCache)sysFormColumnCache.getFormColumGui()).getPojo();
					String comboboxKey = "comboboxId_"+combobox.getComboboxId();
					combobox.setComboboxFormColumnId(new BigDecimal(map.get("columnId_"+combobox.getComboboxFormColumnId())+""));
					sComboboxMapper.insert(combobox);
					map.put(comboboxKey, combobox.getComboboxId());
				}else if("3".equals(column.getFormColumnGuiType())){ //单选框组
				}else if("4".equals(column.getFormColumnGuiType())){ //复选框组
				}else if("6".equals(column.getFormColumnGuiType())){//日期
					SysFormDatepicker datepicker = ((SysDatepickerCache)sysFormColumnCache.getFormColumGui()).getPojo();
					String datepickerKey = "datepickerId_"+datepicker.getDatepickerId();
					datepicker.setDatepickerFormColumnId(new BigDecimal(map.get("columnId_"+datepicker.getDatepickerFormColumnId())+""));
					sDatepickerMapper.insert(datepicker);
					map.put(datepickerKey, datepicker.getDatepickerId());
				}else if("7".equals(column.getFormColumnGuiType())){
					
				}else if("10".equals(column.getFormColumnGuiType())){ //富文本
					
				}else if("9".equals(column.getFormColumnGuiType())){
					
				}
			}
		}
		
		//未分组字段导入
		List<SysFormColumnCache> freeColumnCaches = formCache.getFree();
		for (SysFormColumnCache sysFormColumnCache : freeColumnCaches) {
			SysEntity entity = sysFormColumnCache.getEntity();//字体关联实体
			if (entityMap.get(entity.getEntityCode())==null) {//判断是否更新过此实体
				SysEntityExample entityExample = new SysEntityExample();
				entityExample.or().andEntityCodeEqualTo(entity.getEntityCode());
				String entityKey = "entityId_"+entity.getEntityId();
				if (entityMapper.selectByExample(entityExample).size()>0) {
					SysEntity entity2 = entityMapper.selectByExample(entityExample).get(0);
					entity.setEntityId(entity2.getEntityId());
					entityMapper.updateByPrimaryKey(entity);
					map.put(entityKey,entity2.getEntityId());
				}else {
					entityMapper.insert(entity);
					map.put(entityKey,entity.getEntityId());
				}
				entityMap.put(entity.getEntityCode(),"true");
			}
			SysField field = sysFormColumnCache.getField();
			if (fieldMap.get(field.getFieldEntityId()+"_"+field.getFieldCode())==null){
				SysFieldExample fieldExample = new SysFieldExample();
				fieldExample.or().andFieldCodeEqualTo(field.getFieldCode());
				String fieldKey = "fieldId_"+field.getFieldId();
				if (fieldMapper.selectByExample(fieldExample).size()>0) {
					SysField field2 = fieldMapper.selectByExample(fieldExample).get(0);
					field.setFieldId(field2.getFieldId());
					field.setFieldEntityId(new BigDecimal(map.get("entityId_"+field.getFieldEntityId())+""));
					fieldMapper.updateByPrimaryKey(field);
					map.put(fieldKey,field.getFieldId());
				} else {
					field.setFieldEntityId(new BigDecimal(map.get("entityId_"+field.getFieldEntityId())+""));
					fieldMapper.insert(field);
					map.put(fieldKey,field.getFieldId());
				}
				fieldMap.put(field.getFieldEntityId()+"_"+field.getFieldCode(), "true");
			}
			//字段信息
			SysFormColumn column = sysFormColumnCache.getPojo();
			String columnKey = "columnId_"+column.getFormColumnId();
			column.setFormColumnFormDefId(new BigDecimal(map.get("formId_"+column.getFormColumnFormDefId())+""));
			column.setFormColumnEntityId(new BigDecimal(map.get("entityId_"+column.getFormColumnEntityId())+""));
			column.setFormColumnColumnId(new BigDecimal(map.get("fieldId_"+column.getFormColumnColumnId())+""));
			column.setFormColumnGroupId(null);
			sColumnMapper.insert(column); 
			map.put(columnKey,column.getFormColumnId());
			//字段控件信息
			BigDecimal columnId = column.getFormColumnId();
			if("1".equals(column.getFormColumnGuiType())||"8".equals(column.getFormColumnGuiType())){ //textbox控件
				SysFormTextbox textbox = ((SysTextBoxCache)sysFormColumnCache.getFormColumGui()).getPojo();
				String textBoxKey = "textboxId_"+textbox.getTextboxId();
				if (!((textbox.getTextboxFormColumnId()+"").equals("0"))) {
					textbox.setTextboxFormColumnId(new BigDecimal(map.get("columnId_"+textbox.getTextboxFormColumnId())+""));
					sTextboxMapper.insert(textbox);
					map.put(textBoxKey, textbox.getTextboxId());
				}
			}else if("2".equals(column.getFormColumnGuiType())){ //单选下拉控件
				SysFormCombobox combobox = ((SysFormComboboxCache)sysFormColumnCache.getFormColumGui()).getPojo();
				String comboboxKey = "comboboxId_"+combobox.getComboboxId();
				combobox.setComboboxFormColumnId(new BigDecimal(map.get("columnId_"+combobox.getComboboxFormColumnId())+""));
				sComboboxMapper.insert(combobox);
				map.put(comboboxKey, combobox.getComboboxId());
			}else if("3".equals(column.getFormColumnGuiType())){ //单选框组
			}else if("4".equals(column.getFormColumnGuiType())){ //复选框组
			}else if("6".equals(column.getFormColumnGuiType())){//日期
				SysFormDatepicker datepicker = ((SysDatepickerCache)sysFormColumnCache.getFormColumGui()).getPojo();
				String datepickerKey = "datepickerId_"+datepicker.getDatepickerId();
				datepicker.setDatepickerFormColumnId(new BigDecimal(map.get("columnId_"+datepicker.getDatepickerFormColumnId())+""));
				sDatepickerMapper.insert(datepicker);
				map.put(datepickerKey, datepicker.getDatepickerId());
			}else if("7".equals(column.getFormColumnGuiType())){
				
			}else if("10".equals(column.getFormColumnGuiType())){ //富文本
				
			}else if("9".equals(column.getFormColumnGuiType())){
				
			}
		}
		
		List<SysFormWhereCache> whereCaches = formCache.getWheres();
		for (SysFormWhereCache sysFormWhereCache : whereCaches) {
			SysFormWhere where = sysFormWhereCache.getPojo();
			String whereKey = "whereId_"+where.getFormWhereId();
			where.setFormWhereFormDefId(new BigDecimal(map.get("formId_"+where.getFormWhereFormDefId())+""));
			where.setFormWhereColumnId(map.get("columnId_"+where.getFormWhereColumnId())+"");
			sWhereMapper.insert(where);
			map.put(whereKey, where.getFormWhereId());
		}

		//表单按钮	
		List<SysFormButtonCache> buttonCaches = formCache.getButtons();
		for (SysFormButtonCache sysFormButtonCache : buttonCaches) {
			SysFormButton sysFormButton = sysFormButtonCache.getPojo();
			String buttonKey = "buttonId_"+sysFormButton.getFormButtonId();
			sysFormButton.setFormButtonFormDefId(new BigDecimal(map.get("formId_"+sysFormButton.getFormButtonFormDefId())+""));
			sButtonMapper.insert(sysFormButton);
			map.put(buttonKey,sysFormButton.getFormButtonId());
			//按钮的前后置参数
			SysExecSql qzSql = sysFormButtonCache.getQzSql().getPojo();
			if (qzSql!=null) {
				qzSql.setExecSqlRelaid(Long.valueOf(map.get("buttonId_"+qzSql.getExecSqlRelaid())+""));
				sExecSqlMapper.insert(qzSql);
			}
			SysExecSql hzSql = sysFormButtonCache.getHzSql().getPojo();
			if (hzSql!=null) {
				hzSql.setExecSqlRelaid(Long.valueOf(map.get("buttonId_"+hzSql.getExecSqlRelaid())+""));
				sExecSqlMapper.insert(hzSql);
			}
			//各按钮子项
			if("save_form".equals(sysFormButton.getFormButtonType())||"free_submit".equals(sysFormButton.getFormButtonType())||"save".equals(sysFormButton.getFormButtonType())||"select".equals(sysFormButton.getFormButtonType())||"other".equals(sysFormButton.getFormButtonType())){
				if (sysFormButtonCache.getButtonExt()!=null) {
					SysFormButtonSave saveButton = ((SysFormButtonSaveCache)sysFormButtonCache.getButtonExt()).getPojo();
					String saveButtonKey = "saveButtonId_"+saveButton.getButtonSaveId();
					saveButton.setButtonSaveButtonId(new BigDecimal(map.get("buttonId_"+saveButton.getButtonSaveButtonId())+""));
					saveMapper.insert(saveButton);
					map.put(saveButtonKey,saveButton.getButtonSaveId());
				}
			}
		}
//		sysformco
	}

	

}
















