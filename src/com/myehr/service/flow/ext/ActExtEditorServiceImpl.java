package com.myehr.service.flow.ext;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.activiti.ext.model.Form;
import com.activiti.ext.model.Param;
import com.activiti.ext.service.ActExtEditorService;
import com.myehr.mapper.formmanage.form.SysFormFolderTreeMapper;
import com.myehr.mapper.formmanage.form.SysFormconfigMapper;
import com.myehr.mapper.formmanage.form.SysFormconfigMstTabMapper;
import com.myehr.pojo.formmanage.form.SysFormColumn;
import com.myehr.pojo.formmanage.form.SysFormFolderTree;
import com.myehr.pojo.formmanage.form.SysFormFolderTreeExample;
import com.myehr.pojo.formmanage.form.SysFormconfigExample;
import com.myehr.pojo.formmanage.form.SysFormconfigMstTab;
import com.myehr.pojo.formmanage.form.SysFormconfigMstTabExample;
import com.myehr.pojo.formmanage.form.SysFormconfigWithBLOBs;
import com.myehr.service.formmanage.form.IsysFormColumnService;

@RestController
@RequestMapping("/params")
public class ActExtEditorServiceImpl implements ActExtEditorService{
	@Autowired
	private SysFormFolderTreeMapper treeMapper;
	
	@Autowired
	private SysFormconfigMapper sysFormconfigMapper;
	
	@Autowired
	private SysFormconfigMstTabMapper sysFormconfigMstTabMapper;
	
	@Autowired
	private IsysFormColumnService columnService;

	@RequestMapping(value="/session", method = RequestMethod.POST, produces = "application/json")
	public List<Param> sessionParams() {
		List<Param> list=new ArrayList<Param>();
		list.add(new Param("1",null,"当前用户Id","userId"));
		return list;
	}

	@RequestMapping(value="/form", method = RequestMethod.POST, produces = "application/json")
	public List<Param> formParams(String formkey) {
		SysFormconfigExample example = new SysFormconfigExample();
		example.or().andFormDefIdEqualTo(new BigDecimal(formkey));
		SysFormconfigWithBLOBs form= sysFormconfigMapper.selectByExampleWithBLOBs(example).get(0);
		if (form.getFormDefLayoutType().equals("5")) {
			SysFormconfigMstTabExample example1 = new SysFormconfigMstTabExample();
			example1.or().andMstTabFormIdEqualTo(form.getFormDefId());
			SysFormconfigMstTab mstform= sysFormconfigMstTabMapper.selectByExample(example1).get(0);
			formkey = mstform.getMstTabMainFormId()+"";
		}
		
		
		List<SysFormColumn> objs = columnService.queryCardFormColumns(formkey, false,false,"1");
		List<Param> list=new ArrayList<Param>();
		for (int i = 0; i < objs.size(); i++) {
			String tableName = objs.get(i).getFormEntityTablename();
			tableName = tableName.replace("_", "").toUpperCase();
			list.add(new Param(objs.get(i).getFormColumnId()+"",null,objs.get(i).getFormColumnLable(),tableName+"_"+objs.get(i).getFormFieldTablename()));
		}
		if(formkey.equals("1")){
			/*SysFormFolderTreeExample example = new SysFormFolderTreeExample();
			List<SysFormFolderTree> trees =  treeMapper.selectByExample(example);
			
			SysFormconfigExample example1 = new SysFormconfigExample();
			List<SysFormconfigWithBLOBs> forms= sysFormconfigMapper.selectByExampleWithBLOBs(example1);
			
			list.add(new Param("0",null,null,"表单目录树"));
			for (int i = 0; i < trees.size(); i++) {
				if (trees.get(i).getFolderTreeParentId()==null) {
					list.add(new Param(trees.get(i).getFolderTreeId()+"",null,"0",trees.get(i).getFolderTreeName()));
				}else {
					list.add(new Param(trees.get(i).getFolderTreeId()+"",null,trees.get(i).getFolderTreeParentId()+"",trees.get(i).getFolderTreeName()));
				}
			}
			for (int i = 0; i < forms.size(); i++) {
				list.add(new Param(forms.get(i).getFormDefId()+"",null,forms.get(i).getFormDefFolderId()+"",forms.get(i).getFormDefName()));
			}*/
		}
		return list;
	}

	@RequestMapping(value="/forms/data", method = RequestMethod.POST, produces = "application/json")
	public List<Form> forms() {
		SysFormFolderTreeExample example = new SysFormFolderTreeExample();
		List<SysFormFolderTree> trees =  treeMapper.selectByExample(example);
		
		SysFormconfigExample example1 = new SysFormconfigExample();
		//example1.or().andFormDefIdEqualTo(new BigDecimal(4232));
		List<SysFormconfigWithBLOBs> forms= sysFormconfigMapper.selectByExampleWithBLOBs(example1);
		
		List<Form> list=new ArrayList<Form>();
		list.add(new Form("folder0",null,"表单目录树"));
		for (int i = 0; i < trees.size(); i++) {
			if (trees.get(i).getFolderTreeParentId()==null || trees.get(i).getFolderTreeParentId().intValue()==0) {
				list.add(new Form(trees.get(i).getFolderTreeId()+"folder","folder0",trees.get(i).getFolderTreeName()));
			}else {
				list.add(new Form(trees.get(i).getFolderTreeId()+"folder",trees.get(i).getFolderTreeParentId()+"folder",trees.get(i).getFolderTreeName()));
			}
		}
		for (int i = 0; i < forms.size(); i++) {
			list.add(new Form(forms.get(i).getFormDefId()+"",forms.get(i).getFormDefFolderId()+"folder",forms.get(i).getFormDefName()));
		}
		return list;
	}

}
