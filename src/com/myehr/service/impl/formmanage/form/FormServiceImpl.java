package com.myehr.service.impl.formmanage.form;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.math.BigDecimal;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadBase;
import org.apache.commons.fileupload.ProgressListener;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPoolConfig;

import com.myehr.common.mybatis.Pagers;
import com.myehr.common.util.ChangeCode;
import com.myehr.common.util.CreateFileUtil;
import com.myehr.common.util.JedisFactory;
import com.myehr.common.util.ResultMap;
import com.myehr.mapper.formmanage.drag.SysFormDragconfigColumnMapper;
import com.myehr.mapper.formmanage.drag.SysFormDragconfigExpandMapper;
import com.myehr.mapper.formmanage.drag.SysFormDragconfigMapper;
import com.myehr.mapper.formmanage.form.FormChartsBarColumnMapper;
import com.myehr.mapper.formmanage.form.SysExamtemplateExpandMapper;
import com.myehr.mapper.formmanage.form.SysFormButtonMapper;
import com.myehr.mapper.formmanage.form.SysFormChartsMapper;
import com.myehr.mapper.formmanage.form.SysFormColumnExpandMapper;
import com.myehr.mapper.formmanage.form.SysFormColumnMapper;

import com.myehr.mapper.formmanage.form.SysFileButtonRoleMapper;
import com.myehr.mapper.formmanage.form.SysFileuploadConfigMapper;
import com.myehr.mapper.formmanage.form.SysFormFolderTreeMapper;
import com.myehr.mapper.formmanage.form.SysFormGeneralParamMapper;
import com.myehr.mapper.formmanage.form.SysFormGroupMapper;
import com.myehr.mapper.formmanage.form.SysFormReportMapper;
import com.myehr.mapper.formmanage.form.SysFormWhereMapper;
import com.myehr.mapper.formmanage.form.SysFormYkReportMapper;
import com.myehr.mapper.formmanage.form.SysFormconfigGridMapper;
import com.myehr.mapper.formmanage.form.SysFormconfigMapper;
import com.myehr.mapper.formmanage.form.SysFormconfigMstTabDetailMapper;
import com.myehr.mapper.formmanage.form.SysFormconfigMstTabMapper;
import com.myehr.mapper.formmanage.form.SysFormconfigTreeMapper;
import com.myehr.mapper.formmanage.form.SysTreeNodeTypeMapper;
import com.myehr.mapper.formmanage.form.SysTreeSolutionColumnMapper;
import com.myehr.mapper.formmanage.template.gridbycard.SysGridbycardTemplateColumnMapper;
import com.myehr.mapper.formmanage.widget.SysFileuploadMapper;
import com.myehr.mapper.formmanage.formexpand.SysFormconfigMapperExpand;
import com.myehr.mapper.formmanage.gui.SysCardTemplateMapper;
import com.myehr.mapper.sysUserRole.SysUserRoleMapper;
import com.myehr.mapper.sysdict.SysDictEntryMapper;
import com.myehr.mapper.sysdict.SysDictTypeExpandMapper;
import com.myehr.mapper.sysdict.SysDictTypeMapper;
import com.myehr.pojo.activiti.expand.ActNodePropertiesExpand;
import com.myehr.pojo.dict.SysDictEntry;
import com.myehr.pojo.dict.SysDictEntryExample;
import com.myehr.pojo.dict.SysDictEntryExpand;
import com.myehr.pojo.dict.SysDictType;
import com.myehr.pojo.dict.SysDictTypeExample;
import com.myehr.pojo.formmanage.cache.CardAndCardFormBeansUtil;
import com.myehr.pojo.formmanage.cache.ChartFormBeansUtil;
import com.myehr.pojo.formmanage.cache.MobileFormBeansUtil;
import com.myehr.pojo.formmanage.cache.SysCardFormBeansUtil;
import com.myehr.pojo.formmanage.cache.SysDatepickerCache;
import com.myehr.pojo.formmanage.cache.SysExamtemplateQuestionCache;
import com.myehr.pojo.formmanage.cache.SysFormColumnCache;
import com.myehr.pojo.formmanage.cache.SysFormComboboxCache;
import com.myehr.pojo.formmanage.cache.SysFormGeneralParamCache;
import com.myehr.pojo.formmanage.cache.SysFormTreeSolutionColumnCache;
import com.myehr.pojo.formmanage.cache.SysFormWhereCache;
import com.myehr.pojo.formmanage.cache.SysFormconfigCache;
import com.myehr.pojo.formmanage.cache.SysFormconfigMstTabCache;
import com.myehr.pojo.formmanage.cache.SysFormconfigMstTabDetailCache;
import com.myehr.pojo.formmanage.cache.SysFormconfigTreeCache;
import com.myehr.pojo.formmanage.cache.SysGridFilterCache;
import com.myehr.pojo.formmanage.cache.SysGridFilterColumnCache;
import com.myehr.pojo.formmanage.cache.SysGridFormBeansUtil;
import com.myehr.pojo.formmanage.cache.SysGridFormBeansUtilApp;
import com.myehr.pojo.formmanage.cache.SysRuleCache;
import com.myehr.pojo.formmanage.cache.SysSqlParamsCache;
import com.myehr.pojo.formmanage.drag.SysFormDragconfig;
import com.myehr.pojo.formmanage.drag.SysFormDragconfigColumn;
import com.myehr.pojo.formmanage.drag.SysFormDragconfigColumnExample;
import com.myehr.pojo.formmanage.drag.SysFormDragconfigWithBLOBs;
import com.myehr.pojo.formmanage.form.FormChartsBarColumn;
import com.myehr.pojo.formmanage.form.FormChartsBarColumnExample;
import com.myehr.pojo.formmanage.form.SysFileButtonRole;
import com.myehr.pojo.formmanage.form.SysFileButtonRoleExample;
import com.myehr.pojo.formmanage.form.SysFileuploadConfig;
import com.myehr.pojo.formmanage.form.SysFormButton;
import com.myehr.pojo.formmanage.form.SysFormButtonExample;
import com.myehr.pojo.formmanage.form.SysFormCharts;
import com.myehr.pojo.formmanage.form.SysFormChartsExample;
import com.myehr.pojo.formmanage.form.SysFormColumn;
import com.myehr.pojo.formmanage.form.SysFormColumnExample;
import com.myehr.pojo.formmanage.form.SysFormFolderTree;
import com.myehr.pojo.formmanage.form.SysFormFolderTreeExample;
import com.myehr.pojo.formmanage.form.SysFormGeneralParam;
import com.myehr.pojo.formmanage.form.SysFormGeneralParamExample;
import com.myehr.pojo.formmanage.form.SysFormGroup;
import com.myehr.pojo.formmanage.form.SysFormGroupExample;
import com.myehr.pojo.formmanage.form.SysFormWhere;
import com.myehr.pojo.formmanage.form.SysFormWhereExample;
import com.myehr.pojo.formmanage.form.SysFormYkReport;
import com.myehr.pojo.formmanage.form.SysFormYkReportExample;
import com.myehr.pojo.formmanage.form.SysFormYkReportQueryparams;
import com.myehr.pojo.formmanage.form.SysFormconfig;
import com.myehr.pojo.formmanage.form.SysFormconfigGrid;
import com.myehr.pojo.formmanage.form.SysFormconfigGridExample;
import com.myehr.pojo.formmanage.form.SysFormconfigMstTab;
import com.myehr.pojo.formmanage.form.SysFormconfigMstTabDetail;
import com.myehr.pojo.formmanage.form.SysFormconfigMstTabDetailExample;
import com.myehr.pojo.formmanage.form.SysFormconfigMstTabExample;
import com.myehr.pojo.formmanage.form.SysFormconfigTree;
import com.myehr.pojo.formmanage.form.SysFormconfigTreeExample;
import com.myehr.pojo.formmanage.form.SysFormconfigWithBLOBs;
import com.myehr.pojo.formmanage.form.SysSqlParams;
import com.myehr.pojo.formmanage.form.SysTreeNodeType;
import com.myehr.pojo.formmanage.form.SysTreeNodeTypeExample;
import com.myehr.pojo.formmanage.form.SysTreeSolutionColumn;
import com.myehr.pojo.formmanage.form.SysTreeSolutionColumnExample;
import com.myehr.pojo.formmanage.form.SysUserDictExample;
import com.myehr.pojo.formmanage.question.SysExamtemplate;
import com.myehr.pojo.formmanage.question.SysQuestion;
import com.myehr.pojo.formmanage.template.gridbycard.SysGridbycardTemplateColumn;
import com.myehr.pojo.formmanage.template.gridbycard.SysGridbycardTemplateColumnExample;
import com.myehr.pojo.formmanage.template.timeaxis.SysTimeaxisTemplateColumn;
import com.myehr.pojo.formmanage.widget.SysFileupload;
import com.myehr.pojo.sysParam.SysRequestParam;
import com.myehr.pojo.sysParam.SysSystemParam;
import com.myehr.pojo.sysUserRole.SysUserRole;
import com.myehr.pojo.sysUserRole.SysUserRoleExample;
import com.myehr.service.field.FieldService;
import com.myehr.service.formmanage.form.IFormService;
import com.myehr.service.formmanage.form.ISysformconfigService;
import com.myehr.service.impl.field.FieldServiceImpl;
import com.myehr.service.primaryKey.PrimaryKeyService;
import com.myehr.service.sysParam.ISysParamService;
import com.myehr.service.sysdict.SysDictService;
import com.myehr.service.sysdict.SysDictTypeService;
import com.myehr.test.dao.TMapperExt;

@Service("FormServiceImpl")
public class FormServiceImpl implements IFormService{
	private static Logger logger = LoggerFactory.getLogger(FormServiceImpl.class);
	String pathX = "E:/vueWork/github/mobile/src/myehrpath/form/";
	@Autowired
	SysFormGroupMapper  sysFormGroupMapper;
	
	
//	@Autowired
	@Resource(name = "PrimaryKeyService")  
	private PrimaryKeyService keyserviceImpl;
	
//	@Autowired
	@Resource(name = "FieldService")  
	FieldService fServiceImpl;
	
	@Autowired
	SysFormColumnMapper  sysFormColumnMapper;
	
	@Autowired
	SysFormColumnExpandMapper  sysFormColumnExpandMapper;
	
	@Autowired
	SysFormButtonMapper  sysFormButtonMapper;
	
	@Autowired
	SysFormWhereMapper  sysFormWhereMapper;
	
	@Autowired
	SysFormconfigTreeMapper  sysFormconfigTreeMapper;
	
	@Autowired
	SysFormconfigGridMapper  sysFormconfigGridMapper;
	
	@Autowired
	SysFormconfigMapper  sysFormconfigMapper;
	
	@Autowired
	SysFormconfigMapperExpand sysFormconfigMapperExpand;
	
	@Autowired
	SysFormFolderTreeMapper  sysFormFolderTreeMapper;
	
	@Autowired
	SysFormconfigMstTabMapper sysMapper;
	
	@Autowired
	SysFormconfigMstTabDetailMapper sysDetailMapper;
	
	@Autowired
	SysFormGeneralParamMapper sysFormGeneralParamMapper;
	
	@Autowired
	SysTreeSolutionColumnMapper sTreeSolutionColumnMapper;
	
	@Autowired
	SysFileuploadMapper sysFileuploadMapper;
	
	@Autowired
	ISysParamService ISysParamService;
	
	@Autowired
	SysFormYkReportMapper sysFormYKReportMapper;
	
	@Autowired
	SysFormReportMapper sysFormReportMapper;
	
//	@Autowired
	@Resource(name = "SysDictTypeService")  
	private SysDictTypeService dictTypeServiceImpl;
	
	@Autowired
	private SysDictService serviceImpl;
	
	@Autowired
	private SysDictTypeExpandMapper sTypeExpandMapper;
	
	@Autowired
	SysCardTemplateMapper sTemplateMapper;
	@Autowired
	private SysTreeNodeTypeMapper sNodeTypeMapper;
	@Autowired
	private SysGridbycardTemplateColumnMapper sTemplateColumnMapper;
	
	@Autowired
	SysDictTypeMapper sysDictTypeMapper;
	
	@Autowired
	SysDictEntryMapper sysDictEntryMapper;
	
	@Autowired
	private ISysformconfigService sysformconfigService;
	
	@Autowired
	SysExamtemplateExpandMapper sysExamtemplateExpandMapper;
	
	@Autowired
	SysFormDragconfigExpandMapper sysFormDragconfigExpandMapper;
	
	@Autowired
	SysFileButtonRoleMapper sFileButtonRoleMapper;
	
	@Autowired
	SysUserRoleMapper userRoleMapper;
	@Autowired
	SysFileuploadConfigMapper fileuploadConfigMapper;
	
	
	@Override
	public List<SysFormColumn> findFormColumnsByFormId(int formId) {
		// TODO Auto-generated method stub
		SysFormColumnExample example = new SysFormColumnExample();
		com.myehr.pojo.formmanage.form.SysFormColumnExample.Criteria criteria = example.createCriteria();
		BigDecimal groupFormDefId = new BigDecimal(formId);
		criteria.andFormColumnFormDefIdEqualTo(groupFormDefId);
		criteria.andFormColumnGroupIdIsNotNull();
		List<SysFormColumn> columns = sysFormColumnMapper.selectByExample(example);
		return columns;
	}

	@Override
	public List<SysFormGroup> findFormGroupsByFormId(int formId) {
		// TODO Auto-generated method stub
		SysFormGroupExample example = new SysFormGroupExample();
		example.setOrderByClause("FORM_GROUP_SORT");
		example.setOrderByClause("FORM_GROUP_ID");
		com.myehr.pojo.formmanage.form.SysFormGroupExample.Criteria criteria = example.createCriteria();
		BigDecimal groupFormDefId = new BigDecimal(formId);;
		criteria.andGroupFormDefIdEqualTo(groupFormDefId);
		List<SysFormGroup> groups = sysFormGroupMapper.selectByExample(example);
		return groups;
	}

	@Override
	public List<SysFormColumn> findFreeFormColumnsByFormId(int formId) {
		// TODO Auto-generated method stub
		SysFormColumnExample example = new SysFormColumnExample();
		com.myehr.pojo.formmanage.form.SysFormColumnExample.Criteria criteria = example.createCriteria();
		BigDecimal groupFormDefId = new BigDecimal(formId);
		criteria.andFormColumnFormDefIdEqualTo(groupFormDefId);
		criteria.andFormColumnGroupIdIsNull();
		List<SysFormColumn> columns = sysFormColumnMapper.selectByExample(example);
		return columns;
	}

	@Override
	public List<SysFormButton> findSysFormButtonsByFormId(int formId) {
		// TODO Auto-generated method stub
		SysFormButtonExample example = new SysFormButtonExample();
		com.myehr.pojo.formmanage.form.SysFormButtonExample.Criteria criteria = example.createCriteria();
		BigDecimal buttonFormDefId = new BigDecimal(formId);
		criteria.andFormButtonFormDefIdEqualTo(buttonFormDefId);
		List<SysFormButton> buttons = sysFormButtonMapper.selectByExample(example);
		return buttons;
	}

	@Override
	public List<SysFormWhere> findSysFormWheresByFormId(int formId) {
		// TODO Auto-generated method stub
		SysFormWhereExample example = new SysFormWhereExample();
		com.myehr.pojo.formmanage.form.SysFormWhereExample.Criteria criteria = example.createCriteria();
		BigDecimal whereFormDefId = new BigDecimal(formId);
		criteria.andFormWhereFormDefIdEqualTo(whereFormDefId);
		List<SysFormWhere> wheres = sysFormWhereMapper.selectByExample(example);
		return wheres;
	}
	
	@Override
	public SysFormColumn findPkColumnByFormId(int formId) {
		// TODO Auto-generated method stub
		BigDecimal groupFormDefId = new BigDecimal(formId);
		SysFormColumn pkColumn = sysFormColumnExpandMapper.selectPkColumn(groupFormDefId);
		return pkColumn;
	}

	@Override
	public SysFormconfigTree findSysFormconfigTreeByFormId(int formId) {
		// TODO Auto-generated method stub
		SysFormconfigTreeExample example = new SysFormconfigTreeExample();
		com.myehr.pojo.formmanage.form.SysFormconfigTreeExample.Criteria criteria = example.createCriteria();
		BigDecimal treeFormDefId = new BigDecimal(formId);
		criteria.andFormTreeFormIdEqualTo(treeFormDefId);
		List<SysFormconfigTree> trees = sysFormconfigTreeMapper.selectByExample(example);
		SysFormconfigTree tree = null;
		if (trees.size()>0) {
			tree = trees.get(0);
		}
		return tree;
	}

	@Override
	public SysFormconfigGrid findSysFormconfigGridByFormId(int formId) {
		// TODO Auto-generated method stub
		SysFormconfigGridExample example = new SysFormconfigGridExample();
		com.myehr.pojo.formmanage.form.SysFormconfigGridExample.Criteria criteria = example.createCriteria();
		BigDecimal treeFormDefId = new BigDecimal(formId);
		criteria.andFormGridFromIdEqualTo(treeFormDefId);
		List<SysFormconfigGrid> grids = sysFormconfigGridMapper.selectByExample(example);
		SysFormconfigGrid grid = null;
		if (grids.size()>0) {
			grid = grids.get(0);
		}
		return grid;
	}

	@Override
	public SysFormconfigWithBLOBs findSysFormconfigWithBLOBsByFormId(int formId) {
		// TODO Auto-generated method stub
		Integer formDefId = formId;
		SysFormconfigWithBLOBs sysFormconfigWithBLOBs = sysFormconfigMapper.selectByPrimaryKey(new BigDecimal(formDefId));
		return sysFormconfigWithBLOBs;
	}
	
	
	/*@Override
	public ResultMap getDataByformDefSql(HttpServletRequest request,String formDefSql)throws Exception {
        ResultMap pageresponse = new ResultMap();  
        Map<String, Object> maps=new HashMap<String, Object>();
        maps.put("formDefSql", formDefSql);
        maps.put("countSql", "select count(*) from (" +formDefSql+" )");
        List<HomeNotice> list = homeNoticeMapper.selectDataByFormDefSql(maps); //当前页显示的数据  
        Integer total = homeNoticeMapper.getTotalData(maps);  //数据总条数  
        List<Object> list_obj=new ArrayList<Object>();
		for (HomeNotice u : list) {
			list_obj.add(u);
		}
        pageresponse.setRows(list_obj);  
        pageresponse.setTotal(total);  
        return pageresponse;  
	}*/
	
	/**
	 * 获取form表单缓存对象
	 */
	public SysFormconfigCache getSysFormconnfigCache(int formId) {
		
		return null;
	};
	
	/**
	 * @throws Exception 
	 */
	@Override
	public SysFormconfigCache getForm(String formId) throws Exception {
		// TODO Auto-generated method stub
		return sysformconfigService.getForm(formId);
	}
	
	public List<SysDictType> getDictTypes() throws Exception {
		SysDictTypeExample example = new SysDictTypeExample();
		List<SysDictType> dictTypes = sysDictTypeMapper.selectByExample(example);
		return dictTypes;
	}
	
	/**
	 * 当缓存中没有该对象的时候，当然要从数据库里面访问了，从数据库查出来之后，缓存管理器会将此对象放到缓存中，下一次访问的时候，只要该对象没有消亡，则会从缓存里去取，不会再去查数据库
		value为我们自定义缓存的name，key的属性是缓存的key
	 * @throws Exception 
	 */
	@Cacheable(value="dictCache",key="#dictTypeCode") 
	@Override
	public List<SysDictEntry> getDictEntrys(String dictTypeCode) throws Exception {
		// TODO Auto-generated method stub
		SysDictTypeExample example = new SysDictTypeExample();
		example.or().andDictTypeCodeEqualTo(dictTypeCode);
		List<SysDictType> sysDictTypes = sysDictTypeMapper.selectByExample(example);
		if (sysDictTypes.size()>0) {
			SysDictType dictType = sysDictTypeMapper.selectByExample(example).get(0);
			
			SysDictEntryExample entryExample = new SysDictEntryExample();
			entryExample.or().andDictTypeIdEqualTo(dictType.getDictTypeId());
			entryExample.setOrderByClause("DICT_ENTRY_SORT");
			List<SysDictEntry> entrys = sysDictEntryMapper.selectByExample(entryExample);
			return entrys;
		}
		return null;
	}

	

	@Cacheable(value="dictCache",key="#dictTypeCode") //更新myCache 缓存   更新方式为先清楚后再加载
	@Override  
	public void removeDictEntrys(String dictTypeCode) {  
		logger.info("缓存清除成功");
		//logger.info("缓存更新成功"+"002"+new Date().getTime());
		//this.getForm(formId);
	}  
	
	
	@CacheEvict(value="formCache",key="#formId")//更新myCache 缓存   更新方式为先清楚后再加载
	@Override  
	public void removeForm(String formId) {  
		logger.info("缓存清除成功");
		//logger.info("缓存更新成功"+"002"+new Date().getTime());
		//this.getForm(formId);
	}  
	
	
	/**
	 * 生成表单jsp文件
	 */
	@Override
	public String buildForm(SysFormconfigCache form,SysRequestParam request,String isApp) {
		// TODO Auto-generated method stub
		try {
			StringBuffer[] sbs = form.showPage(request,isApp,null,null,0);
//			String path11 = findSysFormFolderTreeById(form.getPojoform().getFormDefFolderId().intValue(),"");
			String path11 = form.getFormTreePath();
			form.getPojoform().setFormSubmitUrl(path11+form.getPojoform().getFormDefCode()+".jsp");
			Map map = new HashMap();
			map.put("submitUrl", path11+form.getPojoform().getFormDefCode()+".jsp");
			map.put("formDefId", form.getFormDefId());
			sysFormconfigMapperExpand.updateSubmitUrl(map);
			String exportMstTabDetail = "function exportData(fieldArray,formId){\n";
			exportMstTabDetail +="    exportData_"+form.getFormDefId()+"(fieldArray);\n";
			exportMstTabDetail +="}\n";
			logger.info(path11);
			//获取文件路径和文件名
			String path="C:/MyeHR/MyeHR_MSSQL/jsp/"+path11;
			String path1 =  request.getPath()+"\\"+path11;
//			String path1="E:/workspace/Myeclipse/myehr_17_2_19_Oracle/WebRoot/jsp/formbuild"+path11;
			CreateFileUtil.createDir(path);
			CreateFileUtil.createDir(path1);
			try {  
				File f = new File(path+form.getPojoform().getFormDefCode()+".jsp");
				File f1 = new File(path1+form.getPojoform().getFormDefCode()+".jsp"); 
				/*File f3 = new File(path1+"/"+form.getPojoform().getFormDefCode()+".js"); 
				
				if (f3.exists()) {  
					System.out.print("文件存在");  
				} else {  
					System.out.print("文件不存在");  
					f3.createNewFile();// 不存在则创建  
				}
				OutputStreamWriter write3 = new OutputStreamWriter(new FileOutputStream(f3),"utf-8");
				BufferedWriter output3=new BufferedWriter(write3);
				output3.write(CardAndCardFormBeansUtil.getDictInfoByForm(form,sysformconfigService).toString());
				output3.close();*/
				if (f.exists()) {  
					System.out.print("文件存在");  
				} else {  
					System.out.print("文件不存在");  
					f.createNewFile();// 不存在则创建  
				}
				OutputStreamWriter write = new OutputStreamWriter(new FileOutputStream(f),"utf-8");
				if (sbs[24].toString().equals("")) {
					sbs[28].append("$(\".fixed-table-toolbar\").css(\"margin-top\",\"0px\");\n");
					sbs[28].append("$(\".fixed-table-body\").css(\"height\",\"76%\");\n");
				}
				BufferedWriter output=new BufferedWriter(write);
				if (isApp!=null&&isApp.equals("APP")) {
					output.write(SysGridFormBeansUtilApp.getAppHead());
					output.write(SysGridFormBeansUtilApp.appFst());
					output.write(SysGridFormBeansUtilApp.appMenuFst());
					output.write(sbs[24].toString());
					output.write(SysGridFormBeansUtilApp.appMenuLst());
					output.write(SysGridFormBeansUtilApp.appContentFst());
					output.write(sbs[33].toString());
					output.write(SysGridFormBeansUtilApp.appPickTitle());
					output.write(SysGridFormBeansUtilApp.getAppGridHead());					
					output.write(sbs[6].toString());
					output.write(sbs[0].toString());
					output.write(SysGridFormBeansUtilApp.getAppFollow());
					output.write(SysGridFormBeansUtilApp.getAppContentLst());
					output.write("</div>\n</div>\n");
					output.write(SysGridFormBeansUtilApp.getJsTemplate());
					output.write(SysGridFormBeansUtilApp.getJsTemplates());
					output.write(SysGridFormBeansUtilApp.getJsExTemplates());
					output.write(SysGridFormBeansUtilApp.getAppJsFst());
					output.write(SysGridFormBeansUtilApp.getAppJsHead());
					output.write(sbs[30].toString());
					output.write(sbs[55].toString());
					output.write(SysGridFormBeansUtilApp.getAppJsContent(form.getPojoform().getFormDefCode(),form.getGrid().getFormPageSize(),form.getPojoform().getFormDefId()+""));
					output.write(sbs[8].toString());
					output.write(sbs[7].toString());
					output.write(SysGridFormBeansUtilApp.appPickJs());
					output.write(SysGridFormBeansUtilApp.getAppJsFollow());
				} else {
				output.write(sbs[16].toString());
				output.write(sbs[24].toString());//原搜索
				output.write(sbs[6].toString());
				output.write(sbs[33].toString());//现搜索
				output.write(sbs[17].toString()); 
				
				output.write(sbs[3].toString());  
				//output.write(sbs[4].toString());  
				if(form.getPojoform().getIsComment()!=null&&form.getPojoform().getIsComment().toUpperCase().equals("Y")){
					output.write(CardAndCardFormBeansUtil.talkandreply());  
				}
				output.write("</div>\n");
				//output.write("<script type=\"text/javascript\" src=\"/myehr/jsp/formbuild/"+path+form.getPojoform().getFormDefCode()+".js\"></script>\n");
				output.write(sbs[18].toString());//js开始<script>
				output.write(sbs[55].toString());//heightGadedata_;containerParam_;
				output.write(sbs[56].toString());//function(
				output.write(sbs[1].toString()); 
				output.write(sbs[51].toString());
				output.write(sbs[29].toString());
				output.write(sbs[23].toString());
				output.write(sbs[28].toString());
				output.write(sbs[52].toString());
				output.write("changeColor('"+form.getFormDefCode()+"_List')\n");
				output.write(sbs[34].toString());
				output.write(sbs[48].toString());
				output.write(sbs[53].toString());
				output.write(sbs[30].toString());
				output.write(sbs[20].toString());
				output.write(sbs[36].toString());
				output.write(sbs[37].toString());
				output.write(sbs[0].toString());
				output.write(sbs[21].toString());
		
				output.write(sbs[31].toString());
				
				//批量修改js
				output.write(SysGridFormBeansUtil.getBuildJsp6ForBatchEdit(form));
				output.write(sbs[57].toString());
				output.write("})\n}\n");
				
				output.write(sbs[2].toString());
				output.write(sbs[5].toString());
				/** 刷新页面 */
				output.write(sbs[22].toString());
				/**查询条件与分页数据 *//*
				output.write(sbs[23].toString());*/
				output.write(sbs[7].toString()); 
				output.write(sbs[9].toString());
				output.write(sbs[10].toString());
				output.write(sbs[11].toString());
				output.write(sbs[12].toString()); 
				output.write(sbs[13].toString());
				output.write(sbs[14].toString());
				output.write(sbs[8].toString());
				/*output.write(sbs[25].toString());
				output.write(sbs[27].toString());
				output.write(sbs[26].toString());*/
				output.write(exportMstTabDetail);
				output.write(sbs[47].toString());
				output.write(sbs[19].toString());
				}
				output.close();  
				if (f1.exists()) {  
					System.out.print("文件存在");  
				} else {  
					System.out.print("文件不存在");  
					f1.createNewFile();// 不存在则创建  
				}
				OutputStreamWriter write1 = new OutputStreamWriter(new FileOutputStream(f1),"utf-8");
				BufferedWriter output1=new BufferedWriter(write1); 
				if (isApp!=null&&isApp.equals("APP")) {
					output1.write(SysGridFormBeansUtilApp.getAppHead());
					output1.write(SysGridFormBeansUtilApp.appFst());
					output1.write(SysGridFormBeansUtilApp.appMenuFst());
					output1.write(sbs[24].toString());
					output1.write(SysGridFormBeansUtilApp.appMenuLst());
					output1.write(SysGridFormBeansUtilApp.appContentFst());
					output1.write(sbs[33].toString());
					output1.write(SysGridFormBeansUtilApp.appPickTitle());
					output1.write(SysGridFormBeansUtilApp.getAppGridHead());
					output1.write(sbs[6].toString());
					output1.write(sbs[0].toString());
					output1.write(SysGridFormBeansUtilApp.getAppFollow());
					output1.write(SysGridFormBeansUtilApp.getAppContentLst());
					output1.write("</div>\n</div>\n");
					output1.write(SysGridFormBeansUtilApp.getJsTemplate());
					output1.write(SysGridFormBeansUtilApp.getJsTemplates());
					output1.write(SysGridFormBeansUtilApp.getJsExTemplates());
					output1.write(SysGridFormBeansUtilApp.getAppJsFst());
					output1.write(SysGridFormBeansUtilApp.getAppJsHead());
					output1.write(sbs[30].toString());
					output1.write(sbs[55].toString());
					output1.write(SysGridFormBeansUtilApp.getAppJsContent(form.getPojoform().getFormDefCode(),form.getGrid().getFormPageSize(),form.getPojoform().getFormDefId()+""));
					output1.write(sbs[8].toString());
					output1.write(sbs[7].toString());
					output1.write(SysGridFormBeansUtilApp.appPickJs());
					output1.write(SysGridFormBeansUtilApp.getAppJsFollow());
				} else {
					output1.write(sbs[16].toString());
					output1.write(sbs[24].toString());//原搜索
					output1.write(sbs[6].toString());
					output1.write(sbs[33].toString());//现搜索
					output1.write(sbs[17].toString());
					output1.write(sbs[3].toString());  
					//output1.write(sbs[4].toString());  
					if(form.getPojoform().getIsComment()!=null&&form.getPojoform().getIsComment().toUpperCase().equals("Y")){
						output1.write(CardAndCardFormBeansUtil.talkandreply());  
					}
					output1.write("</div>\n");
					//output1.write("<script type=\"text/javascript\" src=\"/myehr/jsp/formbuild/"+path11+form.getPojoform().getFormDefCode()+".js\"></script>\n");
					output1.write(sbs[18].toString());//
					output1.write(sbs[55].toString());
					output1.write(sbs[56].toString());
					output1.write(sbs[1].toString());  
					output1.write(sbs[51].toString());
					output1.write(sbs[29].toString());
					output1.write(sbs[23].toString());
					output1.write(sbs[28].toString());
					output1.write(sbs[52].toString());
					output1.write(sbs[34].toString());
					output1.write(sbs[48].toString());
					output1.write(sbs[53].toString());
					output1.write(sbs[30].toString());
					output1.write(sbs[20].toString());
					output1.write(sbs[36].toString());
					output1.write(sbs[37].toString());
					output1.write(sbs[0].toString());
					output1.write(sbs[21].toString());
					
					output1.write(sbs[31].toString());
					
					output1.write(SysGridFormBeansUtil.getBuildJsp6ForBatchEdit(form));
					output1.write(sbs[57].toString());
					output1.write("]\n})\n}\n");
					output1.write(SysGridFormBeansUtil.getBuildJspForBatchEditJs(form));
					
					output1.write(sbs[2].toString());
					output1.write(sbs[5].toString());  
					/** 刷新页面 */
					output1.write(sbs[22].toString());
					/**查询条件与分页数据 */
//					output1.write(sbs[23].toString());
					output1.write(sbs[7].toString()); 
					output1.write(sbs[9].toString());
					output1.write(sbs[10].toString());
					output1.write(sbs[11].toString());
					output1.write(sbs[12].toString()); 
					output1.write(sbs[13].toString());
					output1.write(sbs[14].toString());
					output1.write(sbs[8].toString());
					/*output1.write(sbs[25].toString());
					output1.write(sbs[27].toString());
					output1.write(sbs[26].toString());*/
					output1.write(exportMstTabDetail);
					output1.write(sbs[47].toString());
					output1.write("window.onload=function(){\n"+
								  "	   changeColor('"+form.getFormDefCode()+"_List');\n"+
								  "}\n");
					output1.write(sbs[19].toString());
				}
				output1.close();  
				
			} catch (Exception e) {  
				e.printStackTrace();logger.error(e.getMessage(),e);
			}  
			//更新jsp文件访问地址  
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();logger.error(e.getMessage(),e);
		} 
		return null;
	}
	
	

	/**
	 * 生成表单jsp文件
	 */
	@Override
	public String buildChartsForm(SysFormconfigCache form,SysFormconfigCache selectform,SysRequestParam request,String isApp,SysFormCharts charts,List<FormChartsBarColumn> barColumns,List<FormChartsBarColumn> barColumns1,List<FormChartsBarColumn> barColumns2,Map columnDatasmap) {
		// TODO Auto-generated method stub
		try {
			StringBuffer[] sbs = selectform.showPage(request,isApp,null,null,0);
//			String path11 = findSysFormFolderTreeById(form.getPojoform().getFormDefFolderId().intValue(),"");
			String path11 = form.getFormTreePath();
			form.getPojoform().setFormSubmitUrl(path11+form.getPojoform().getFormDefCode()+".jsp");
//			sysFormconfigMapper.updateByPrimaryKeyWithBLOBs(form.getPojoform());
			Map map = new HashMap();
			map.put("submitUrl", path11+form.getPojoform().getFormDefCode()+".jsp");
			map.put("formDefId", form.getFormDefId());
			sysFormconfigMapperExpand.updateSubmitUrl(map);
	
			logger.info(path11);
			//获取文件路径和文件名
			String path="C:/MyeHR/MyeHR_MSSQL/jsp/"+path11;
			String path1 =  request.getPath()+"\\"+path11;
//			String path1="E:/workspace/Myeclipse/myehr_17_2_19_Oracle/WebRoot/jsp/formbuild"+path11;
			CreateFileUtil.createDir(path);
			CreateFileUtil.createDir(path1);
			//生成文件
			//SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
			try {  
				File f = new File(path+form.getPojoform().getFormDefCode()+".jsp");
				File f1 = new File(path1+form.getPojoform().getFormDefCode()+".jsp"); 
				if (f.exists()) {  
					System.out.print("文件存在");  
				} else {  
					System.out.print("文件不存在");  
					f.createNewFile();// 不存在则创建  
				}
				OutputStreamWriter write = new OutputStreamWriter(new FileOutputStream(f),"utf-8");
				if (sbs[24].toString().equals("")) {
					sbs[28].append("$(\".fixed-table-toolbar\").css(\"margin-top\",\"0px\");\n");
					sbs[28].append("$(\".fixed-table-body\").css(\"height\",\"76%\");\n");
				}
				/*sbs[28].append("$(\".container-fluid\").css(\"max-height\",\"100%\");\n");
				sbs[28].append("$(\".fixed-table-container\").css(\"height\",$('.container-fluid').height() -93 +\"px\");\n");
				sbs[28].append("$(\".fixed-table-body\").css(\"height\",\"84%\");\n");*/
				BufferedWriter output=new BufferedWriter(write);
				if (isApp!=null&&isApp.equals("APP")) {
					output.write(SysGridFormBeansUtilApp.getAppHead());
					
					output.write(SysGridFormBeansUtilApp.appMenuFst());
					output.write(sbs[24].toString());
					output.write(SysGridFormBeansUtilApp.appMenuLst());
					output.write(SysGridFormBeansUtilApp.appContentFst());
					output.write(sbs[33].toString());
					output.write(SysGridFormBeansUtilApp.appPickTitle());
					output.write(SysGridFormBeansUtilApp.getAppGridHead());					
					output.write(sbs[6].toString());
					output.write(sbs[0].toString());
					output.write(SysGridFormBeansUtilApp.getAppFollow());
					output.write(SysGridFormBeansUtilApp.getAppContentLst());
					output.write("</div>\n</div>\n");
					output.write(SysGridFormBeansUtilApp.getJsTemplate());
					output.write(SysGridFormBeansUtilApp.getJsTemplates());
					output.write(SysGridFormBeansUtilApp.getJsExTemplates());
					output.write(SysGridFormBeansUtilApp.getAppJsFst());
					output.write(SysGridFormBeansUtilApp.getAppJsHead());
					output.write(sbs[30].toString());
					output.write(SysGridFormBeansUtilApp.getAppJsContent(selectform.getPojoform().getFormDefCode(),form.getGrid().getFormPageSize(),form.getPojoform().getFormDefId()+""));
					output.write(sbs[8].toString());
					output.write(SysGridFormBeansUtilApp.appPickJs());
					output.write(SysGridFormBeansUtilApp.getAppJsFollow());
				} else {
					output.write(sbs[16].toString());
					output.write(sbs[24].toString());//原搜索
					output.write(sbs[6].toString());
					output.write(sbs[33].toString());//现搜索
					output.write(sbs[17].toString()); 
					
					output.write("<div id=\""+form.getFormDefCode()+"_chart\" style=\"width:100%;height:400px;\"></div>");
					
					output.write(sbs[3].toString());  
					output.write(sbs[4].toString());  
					
					output.write(sbs[18].toString());
					
					output.write(sbs[55].toString());//heightGadedata_;containerParam_;
					output.write(sbs[56].toString());//function(
					
					output.write(sbs[1].toString()); 
					output.write(sbs[51].toString());
					output.write(sbs[28].toString());
					output.write("    queryAllData_"+form.getPojoform().getFormDefId()+"();\n");
					output.write("    $(\".bootstrap-table\").css(\"display\",\"none\");\n");
					output.write(sbs[29].toString());
					output.write(sbs[52].toString());
					output.write(sbs[34].toString());
					output.write(sbs[48].toString());
					output.write(sbs[53].toString());
					output.write(sbs[30].toString());
					output.write(sbs[20].toString());
					output.write(sbs[36].toString());
					output.write(sbs[37].toString());
					output.write(sbs[0].toString());
					output.write(sbs[21].toString());
			
					output.write(sbs[31].toString());
					
					output.write(sbs[2].toString());
					output.write(sbs[5].toString());
					/** 刷新页面 */
					output.write(sbs[22].toString());
					
					output.write(SysGridFormBeansUtil.formGridChartsFunction4(form,selectform,charts,barColumns,barColumns1,barColumns2,columnDatasmap));
					
					/**查询条件与分页数据 */
					output.write(sbs[23].toString());
					output.write(sbs[7].toString()); 
					output.write(sbs[9].toString());
					output.write(sbs[10].toString());
					output.write(sbs[11].toString());
					output.write(sbs[12].toString()); 
					output.write(sbs[13].toString());
					output.write(sbs[14].toString());
					output.write(sbs[8].toString());
					output.write(sbs[25].toString());
					output.write(sbs[27].toString());
					output.write(sbs[26].toString());
					output.write(sbs[47].toString());
					output.write(sbs[19].toString());
				}
				output.close();  
				if (f1.exists()) {  
					System.out.print("文件存在");  
				} else {  
					System.out.print("文件不存在");  
					f1.createNewFile();// 不存在则创建  
				}
				OutputStreamWriter write1 = new OutputStreamWriter(new FileOutputStream(f1),"utf-8");
				BufferedWriter output1=new BufferedWriter(write1); 
				if (isApp!=null&&isApp.equals("APP")) {
					output1.write(SysGridFormBeansUtilApp.getAppHead());
					output1.write(SysGridFormBeansUtilApp.appMenuFst());
					output1.write(sbs[24].toString());
					output1.write(SysGridFormBeansUtilApp.appMenuLst());
					output1.write(SysGridFormBeansUtilApp.appContentFst());
					output1.write(sbs[33].toString());
					output1.write(SysGridFormBeansUtilApp.appPickTitle());
					output1.write(SysGridFormBeansUtilApp.getAppGridHead());
					output1.write(sbs[6].toString());
					output1.write(sbs[0].toString());
					output1.write(SysGridFormBeansUtilApp.getAppFollow());
					output1.write(SysGridFormBeansUtilApp.getAppContentLst());
					output1.write("</div>\n</div>\n");
					output1.write(SysGridFormBeansUtilApp.getJsTemplate());
					output1.write(SysGridFormBeansUtilApp.getJsTemplates());
					output1.write(SysGridFormBeansUtilApp.getJsExTemplates());
					output1.write(SysGridFormBeansUtilApp.getAppJsFst());
					output1.write(SysGridFormBeansUtilApp.getAppJsHead());
					output1.write(sbs[30].toString());
					output1.write(SysGridFormBeansUtilApp.getAppJsContent(form.getPojoform().getFormDefCode(),form.getGrid().getFormPageSize(),form.getPojoform().getFormDefId()+""));
					output1.write(sbs[8].toString());
					output1.write(SysGridFormBeansUtilApp.appPickJs());
					output1.write(SysGridFormBeansUtilApp.getAppJsFollow());
				} else {
					output1.write(sbs[16].toString());
					output1.write(sbs[24].toString());//原搜索
					output1.write(sbs[6].toString());
					output1.write(sbs[33].toString());//现搜索
					output1.write(sbs[17].toString());
					output1.write("<div id=\""+form.getFormDefCode()+"_chart\" style=\"width:100%;height:400px;\"></div>");
					
					output1.write(sbs[3].toString());  
					output1.write(sbs[4].toString());  
					output1.write(sbs[18].toString());
					
					output1.write(sbs[55].toString());//heightGadedata_;containerParam_;
					output1.write(sbs[56].toString());//function(
					
					output1.write(sbs[1].toString());  
					output1.write(sbs[51].toString());
					output1.write(sbs[28].toString());
					
					
					output1.write("    queryAllData_"+form.getPojoform().getFormDefId()+"();\n");
					output1.write("    $(\".bootstrap-table\").css(\"display\",\"none\");\n");
					output1.write(sbs[29].toString());
					output1.write(sbs[52].toString());
					output1.write(sbs[34].toString());
					output1.write(sbs[48].toString());
					output1.write(sbs[53].toString());
					output1.write(sbs[30].toString());
					output1.write(sbs[20].toString());
					output1.write(sbs[36].toString());
					output1.write(sbs[37].toString());
					output1.write(sbs[0].toString());
					output1.write(sbs[21].toString());
					
					output1.write(sbs[31].toString());
					
					output1.write(sbs[2].toString());
					output1.write(sbs[5].toString());  
					/** 刷新页面 */
					output1.write(sbs[22].toString());
					
					output1.write(SysGridFormBeansUtil.formGridChartsFunction4(form,selectform,charts,barColumns,barColumns1,barColumns2,columnDatasmap));
					
					/**查询条件与分页数据 */
					output1.write(sbs[23].toString());
					output1.write(sbs[7].toString()); 
					output1.write(sbs[9].toString());
					output1.write(sbs[10].toString());
					output1.write(sbs[11].toString());
					output1.write(sbs[12].toString()); 
					output1.write(sbs[13].toString());
					output1.write(sbs[14].toString());
					output1.write(sbs[8].toString());
					output1.write(sbs[25].toString());
					output1.write(sbs[27].toString());
					output1.write(sbs[26].toString());
					output1.write(sbs[47].toString());
					output1.write(sbs[19].toString());
				}
				output1.close();  
				
			} catch (Exception e) {  
				e.printStackTrace();logger.error(e.getMessage(),e);
			}  
			//更新jsp文件访问地址  
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();logger.error(e.getMessage(),e);
		} 
		return null;
	}
	
	@Override
	public String findSysFormFolderTreeById(int folderTreeId,String path) {
		// TODO Auto-generated method stub
		SysFormFolderTreeExample example = new SysFormFolderTreeExample();
		com.myehr.pojo.formmanage.form.SysFormFolderTreeExample.Criteria criteria = example.createCriteria();
		BigDecimal treeFormDefId = new BigDecimal(folderTreeId);
		criteria.andFolderTreeIdEqualTo(treeFormDefId);
		List<SysFormFolderTree> sysFormFolderTrees = sysFormFolderTreeMapper.selectByExample(example);
		SysFormFolderTree tree = null;
		if (sysFormFolderTrees.size()>0) {
			tree = sysFormFolderTrees.get(0);
			path = tree.getFolderTreeCode()+"/"+path;
			if (tree.getFolderTreeParentId()!=null) {
				path = findSysFormFolderTreeById(tree.getFolderTreeParentId().intValue(),path);
			}else {
				return path;
			}
		}
		return path;
	}
	
	
	@Override
	public String buildCardForm(SysFormconfigCache form,SysRequestParam request,String isApp,ActNodePropertiesExpand actNodePropertiesExpand,String userId) {
		// TODO Auto-generated method stub
		try {
			StringBuffer[] sbs = form.showPage(request,isApp,actNodePropertiesExpand,null,0);
//			String path11 = findSysFormFolderTreeById(form.getPojoform().getFormDefFolderId().intValue(),"");
			String path11 = form.getFormTreePath();

			form.getPojoform().setFormSubmitUrl(path11+form.getPojoform().getFormDefCode()+".jsp");
//			sysFormconfigMapper.updateByPrimaryKeyWithBLOBs(form.getPojoform());
			Map map = new HashMap();
			map.put("submitUrl", path11+form.getPojoform().getFormDefCode()+".jsp");
			map.put("formDefId", form.getFormDefId());
			sysFormconfigMapperExpand.updateSubmitUrl(map);
			logger.info(path11);
			//获取文件路径和文件名
//			String path="E:/myeclipse/workspace1/myehr/WebRoot/jsp/formbuld";
			String path="C:/MyeHR/MyeHR_MSSQL/jsp/"+path11;
//			String path1="E:/myeclipse/workspace1/.metadata/.me_tcat/webapps/myehr/jsp/formbuld";
			String path1 =  request.getPath()+"\\"+path11;
//			String path1= "E:/SqlServer/myeclipse/apache-tomcat-6.0.45/webapps/myehr/jsp/formbuild/"+path11;
			//E:/workspace/Myeclipse/myehr_0_SQLSERVER/WebRoot/jsp/formbuild/
			//生成文件
			//SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
			CreateFileUtil.createDir(path);
			CreateFileUtil.createDir(path1);
			

			SysFileuploadConfig config = form.getFileuploadConfig();
			try {  
				File f = new File(path+"/"+form.getPojoform().getFormDefCode()+".jsp");
				File f1 = new File(path1+"/"+form.getPojoform().getFormDefCode()+".jsp"); 
				if (f.exists()) {  
					System.out.print("文件存在");  
				} else {  
					System.out.print("文件不存在");  
					f.createNewFile();// 不存在则创建
				}
				OutputStreamWriter write = new OutputStreamWriter(new FileOutputStream(f),"utf-8");
				BufferedWriter output=new BufferedWriter(write);
				output.write(sbs[10].toString());
				output.write(sbs[3].toString());  
				output.write(sbs[0].toString());   
				output.write(sbs[1].toString()); 
				output.write(sbs[11].toString());
				
				if (form.getPojoform().getFormDefIsProcess().equals("Y")) {
					output.write(SysCardFormBeansUtil.getBuildCardForm6(form.getFormDefId()+"", ""));
				}
				
				if(form.getPojoform().getIsComment()!=null&&form.getPojoform().getIsComment().toUpperCase().equals("Y")){
					output.write(CardAndCardFormBeansUtil.talkandreply());  
				}
				
				if(form.isHaveRich()){
					output.write("<script type=\"text/javascript\" src=\"/myehr/common/js/utf8-jsp/ueditor.config.js\"></script>\n");
					output.write("<script type=\"text/javascript\" src=\"/myehr/common/js/utf8-jsp/ueditor.all.min.js\"></script>\n");
					output.write("<script type=\"text/javascript\" src=\"/myehr/common/js/utf8-jsp/lang/zh-cn/zh-cn.js\"></script>\n");
				}
				output.write(sbs[12].toString()); 
				output.write(sbs[16].toString());//heightGadedata_;containerParam_;参数
				
				output.write(sbs[17].toString());//$(function () {  开始
				output.write(sbs[14].toString()); //$(function () {  结束
				output.write("function _initParamCard(){\n");
				output.write("}\n");
				output.write(sbs[18].toString());//卡片表单id声明
				output.write(sbs[19].toString());//window.onload=function(){cardSelectInitFunction();
				
				if(form.getPojoform().getIsFilemanage()!=null&&(form.getPojoform().getIsFilemanage().equals("checkedAndForm")||form.getPojoform().getIsFilemanage().equals("OnlyChecked"))){
					SysFileButtonRoleExample example = new SysFileButtonRoleExample();
					example.or().andFormIdEqualTo(form.getPojoform().getFormDefId());
					List<SysFileButtonRole> roles = sFileButtonRoleMapper.selectByExample(example);
					String yulanButton = "false";
					String deleteButton = "false";
					String uploadButton = "false";
					String shangchuanButton = "false";
					for (SysFileButtonRole sysFileButtonRole : roles) {
						if (sysFileButtonRole.getButtonCode().equals("文件上传")&&!sysFileButtonRole.getButtonRoleRemark().equals("3")) {
							shangchuanButton = "true";
						}
						if (sysFileButtonRole.getButtonCode().equals("文件预览")&&!sysFileButtonRole.getButtonRoleRemark().equals("3")) {
							yulanButton = "true";						
						}
						if (sysFileButtonRole.getButtonCode().equals("文件删除")&&!sysFileButtonRole.getButtonRoleRemark().equals("3")) {
							deleteButton = "true";
						}
						if (sysFileButtonRole.getButtonCode().equals("文件下载")&&!sysFileButtonRole.getButtonRoleRemark().equals("3")) {
							uploadButton = "true";
						}
					}
//					if(isApp!=null&&isApp.equals("APP")){
						output.write("initFileManage1("+shangchuanButton+","+yulanButton+","+deleteButton+","+uploadButton+",'','form_"+form.getFormDefId()+"');\n");
//					}else {
//						output.write("initFileManage("+shangchuanButton+","+yulanButton+","+deleteButton+","+uploadButton+",'');\n");
//					}
				}
				if(form.getPojoform().getIsFilemanage()!=null&&(form.getPojoform().getIsFilemanage().equals("checkedAndForm")||form.getPojoform().getIsFilemanage().equals("OnlyForm"))){
					output.write("var objType_"+form.getFormDefId()+" = '"+config.getFileObjType()+"';\n");
					output.write("var objValue_"+form.getFormDefId()+" = $('[id=\""+config.getFileObjValue()+"\"]').val();\n");
					output.write("initFileManage2His('','','','','',form_"+form.getPojoform().getFormDefId()+",,,,objType_"+form.getFormDefId()+",objValue_"+form.getFormDefId()+");\n");
					output.write("initFileManage2New('','','','','',form_"+form.getPojoform().getFormDefId()+",,,,objType_"+form.getFormDefId()+",objValue_"+form.getFormDefId()+");\n");
				}
				output.write("changeFileCss();\n");
				
				output.write(sbs[2].toString());
				//output.write(sbs[4].toString());  
				output.write(sbs[5].toString()); 
				output.write(sbs[6].toString());  
				output.write(sbs[7].toString());  
				output.write(sbs[8].toString());  
				output.write(sbs[9].toString());
//				output.write(SysCardFormBeansUtil.RichText());
//				output.write(sbs[5].toString()); 
				
				if (form.getPojoform().getFormDefIsProcess().equals("Y")) {
					output.write(SysCardFormBeansUtil.getBuildCardForm7(form.getFormDefId()+"", ""));
				}
				
				output.write(sbs[13].toString());  
				
				output.close();  
				if (f1.exists()) {  
					System.out.print("文件存在");  
				} else {  
					System.out.print("文件不存在");  
					f1.createNewFile();// 不存在则创建
				}
				OutputStreamWriter write1 = new OutputStreamWriter(new FileOutputStream(f1),"utf-8");
				BufferedWriter output1=new BufferedWriter(write1);
				output1.write(sbs[10].toString());
				output1.write(sbs[3].toString());  
				output1.write(sbs[0].toString());   
				output1.write(sbs[1].toString()); 
				
				output1.write(sbs[11].toString());
				
				if (form.getPojoform().getFormDefIsProcess().equals("Y")) {
					output1.write(SysCardFormBeansUtil.getBuildCardForm6(form.getFormDefId()+"", ""));
				}
				
				if(form.getPojoform().getIsComment()!=null&&form.getPojoform().getIsComment().toUpperCase().equals("Y")){
					output1.write(CardAndCardFormBeansUtil.talkandreply());  
				}
				if(form.isHaveRich()){
					output1.write("<script type=\"text/javascript\" src=\"/myehr/common/js/utf8-jsp/ueditor.config.js\"></script>\n");
					output1.write("<script type=\"text/javascript\" src=\"/myehr/common/js/utf8-jsp/ueditor.all.min.js\"></script>\n");
					output1.write("<script type=\"text/javascript\" src=\"/myehr/common/js/utf8-jsp/lang/zh-cn/zh-cn.js\"></script>\n");
				}
				output1.write(sbs[12].toString()); 
				output1.write(sbs[16].toString());//heightGadedata_;containerParam_;参数
				output1.write(sbs[17].toString());//$(function () {  开始
				output1.write(sbs[14].toString()); 
				output1.write("function _initParamCard(){\n");
				output1.write("}\n");
				output1.write(sbs[18].toString());
				output1.write(sbs[19].toString());
				
				if(form.getPojoform().getIsFilemanage()!=null&&(form.getPojoform().getIsFilemanage().equals("checkedAndForm")||form.getPojoform().getIsFilemanage().equals("OnlyChecked"))){
					SysUserRoleExample userRoleExample = new SysUserRoleExample();
					userRoleExample.or().andUserIdEqualTo(Integer.valueOf(userId));
					List<SysUserRole> userRoles = userRoleMapper.selectByExample(userRoleExample);
					if (userRoles.size()>0) {
						List<BigDecimal> roleIds = new ArrayList<BigDecimal>();
						for (SysUserRole role : userRoles) {
							roleIds.add(new BigDecimal(role.getRoleId()));
						}
						SysFileButtonRoleExample example = new SysFileButtonRoleExample();
						example.or().andFormIdEqualTo(form.getPojoform().getFormDefId()).andRoleIdIn(roleIds);
						List<SysFileButtonRole> roles = sFileButtonRoleMapper.selectByExample(example);
						String yulanButton = "false";
						String deleteButton = "false";
						String uploadButton = "false";
						String shangchuanButton = "false";
						for (SysFileButtonRole sysFileButtonRole : roles) {
							if (sysFileButtonRole.getButtonCode().equals("文件上传")&&!sysFileButtonRole.getButtonRoleRemark().equals("3")) {
								shangchuanButton = "true";
							}
							if (sysFileButtonRole.getButtonCode().equals("文件预览")&&!sysFileButtonRole.getButtonRoleRemark().equals("3")) {
								yulanButton = "true";						
							}
							if (sysFileButtonRole.getButtonCode().equals("文件删除")&&!sysFileButtonRole.getButtonRoleRemark().equals("3")) {
								deleteButton = "true";
							}
							if (sysFileButtonRole.getButtonCode().equals("文件下载")&&!sysFileButtonRole.getButtonRoleRemark().equals("3")) {
								uploadButton = "true";
							}
						}
//						if(isApp!=null&&isApp.equals("APP")){
							output1.write("initFileManage1("+shangchuanButton+","+yulanButton+","+deleteButton+","+uploadButton+",'','form_"+form.getPojoform().getFormDefId()+"');\n");
//						}else {
//							output1.write("initFileManage("+shangchuanButton+","+yulanButton+","+deleteButton+","+uploadButton+",'');\n");
//						}
					}
				}
				output1.write(form.getPojoform().getFormDefInitQzJs()+"\n");
				output1.write(sbs[2].toString().substring(0, sbs[2].toString().lastIndexOf("}"))); 
				if(form.getPojoform().getIsFilemanage()!=null&&(form.getPojoform().getIsFilemanage().equals("checkedAndForm")||form.getPojoform().getIsFilemanage().equals("OnlyForm"))){
					output1.write("var objType_"+form.getFormDefId()+" = '"+config.getFileObjType()+"';\n");
					output1.write("var objValue_"+form.getFormDefId()+" = $('[name=\""+config.getFileObjValue()+"\"]').val();\n");
					output1.write("initFileManage2His('true','true','true','true','','form_"+form.getPojoform().getFormDefId()+"',null,null,null,objType_"+form.getFormDefId()+",objValue_"+form.getFormDefId()+");\n");
					//			   initFileManage2His('','','','','','fubiao"+sDetailMsts.size()+"',numLimit,sizeLimit,typeLimit,'ACT_BUSSINESSID',BUSSINESSID_ACT);
					output1.write("initFileManage2New('true','true','true','true','','form_"+form.getPojoform().getFormDefId()+"',null,null,null,objType_"+form.getFormDefId()+",objValue_"+form.getFormDefId()+");\n");
				}
				output1.write("changeFileCss();\n}\n");
				//output1.write(sbs[4].toString());  
				output1.write(sbs[5].toString()); 
				output1.write(sbs[6].toString());  
				output1.write(sbs[7].toString());  
				output1.write(sbs[8].toString());  
				output1.write(sbs[9].toString());  
//				output1.write(SysCardFormBeansUtil.RichText());
//				output1.write(sbs[5].toString()); 
					
				if (form.getPojoform().getFormDefIsProcess().equals("Y")) {
					output1.write(SysCardFormBeansUtil.getBuildCardForm7(form.getFormDefId()+"", ""));
				}
	
				output1.write(sbs[13].toString());  
				output1.close();
			} catch (Exception e) {  
				e.printStackTrace();logger.error(e.getMessage(),e);
			}  
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();logger.error(e.getMessage(),e);
		} 
		return null;
	}

	@Override
	public String buildTreeForm(SysFormconfigCache form,SysRequestParam request) {
		try {
			StringBuffer[] sbs = form.showPage(request,"",null,null,0);
			StringBuffer[] jsp = createTreeJsp(form,sbs,request);
//			String path11 = findSysFormFolderTreeById(form.getPojoform().getFormDefFolderId().intValue(),"");
			String path11 = form.getFormTreePath();

			form.getPojoform().setFormSubmitUrl(path11+form.getPojoform().getFormDefCode()+".jsp");
//			sysFormconfigMapper.updateByPrimaryKeyWithBLOBs(form.getPojoform());
			Map map = new HashMap();
			map.put("submitUrl", path11+form.getPojoform().getFormDefCode()+".jsp");
			map.put("formDefId", form.getFormDefId());
			sysFormconfigMapperExpand.updateSubmitUrl(map);
	
			logger.info(path11);
			//获取文件路径和文件名
//			String path="E:/myeclipse/workspace1/myehr/WebRoot/jsp/formbuld";
			String path="C:/MyeHR/MyeHR_MSSQL/jsp/"+path11;
//			String path1="E:/myeclipse/workspace1/.metadata/.me_tcat/webapps/myehr/jsp/formbuld";
			String path1 =  request.getPath()+"\\"+path11;
//			String path1= "E:/SqlServer/myeclipse/apache-tomcat-6.0.45/webapps/myehr/jsp/formbuild/"+path11;
			
			//生成文件
			//SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
			
			CreateFileUtil.createDir(path);
			CreateFileUtil.createDir(path1);
			
			try {  
				File f = new File(path+"/"+form.getPojoform().getFormDefCode()+".jsp");
				File f1 = new File(path1+"/"+form.getPojoform().getFormDefCode()+".jsp"); 
				if (f.exists()) {  
					System.out.print("文件存在");  
				} else {  
					System.out.print("文件不存在");  
					f.createNewFile();// 不存在则创建
				}
				OutputStreamWriter write = new OutputStreamWriter(new FileOutputStream(f),"utf-8");
				BufferedWriter output=new BufferedWriter(write); 
				output.write(jsp[0].toString());
				output.write(jsp[3].toString());
				output.write(jsp[1].toString());  
				output.write(jsp[2].toString()); 
				output.write(jsp[4].toString());  
				output.write(jsp[5].toString()); 
				output.write(jsp[6].toString());
				output.write(jsp[7].toString());  
				output.write(jsp[8].toString()); 
				output.write(jsp[9].toString());
				output.write(jsp[10].toString());  
				output.write(jsp[11].toString()); 
				output.write(jsp[12].toString());  
				output.write(jsp[13].toString());
				output.close();  
				if (f1.exists()) {  
					System.out.print("文件存在");  
				} else {  
					System.out.print("文件不存在");  
					f1.createNewFile();// 不存在则创建
				}
				OutputStreamWriter write1 = new OutputStreamWriter(new FileOutputStream(f1),"utf-8");
				BufferedWriter output1=new BufferedWriter(write1); 
				output1.write(jsp[0].toString());
				output1.write(jsp[3].toString());
				output1.write(jsp[1].toString());  
				output1.write(jsp[2].toString()); 
				output1.write(jsp[4].toString());  
				output1.write(jsp[5].toString()); 
				output1.write(jsp[6].toString());
				output1.write(jsp[7].toString());  
				output1.write(jsp[8].toString()); 
				output1.write(jsp[9].toString());
				output1.write(jsp[10].toString());  
				output1.write(jsp[11].toString()); 
				output1.write(jsp[12].toString());  
				output1.write(jsp[13].toString());
				output1.close(); 
			} catch (Exception e) {  
				e.printStackTrace();logger.error(e.getMessage(),e);
			}  
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();logger.error(e.getMessage(),e);
		} 
		return null;
	}

	private StringBuffer[] createTreeJsp(SysFormconfigCache form, StringBuffer[] sbs,SysRequestParam request) {
		StringBuffer[] rets = new StringBuffer[20];
		StringBuffer[] jsp = new StringBuffer[20];
		for(int i=0;i<16;i++){
			rets[i] = new StringBuffer();
			jsp[i] = new StringBuffer();
		}
//		SysFormDatepickerExample example = new SysFormDatepickerExample();
//		SysFormDatepickerExample.Criteria criteria = example.createCriteria();
//		criteria.andDatepickerFormColumnIdEqualTo(new BigDecimal(columnId));
//		List<SysFormDatepicker> list = mapper.selectByExample(example);

		
		SysFormconfigTreeCache treeCache = form.getTree();
		SysFormconfigTree tree = treeCache.getTree();
		Map<String,List<SysFormGeneralParamCache>> param = form.getTree().getGeneralParams();
		List<SysFormGeneralParamCache> generalParams = param.get("JS_VAR");
		String containerParam="";
		if(generalParams!=null){
			for (int i = 0; i < generalParams.size(); i++) {
				if (generalParams.get(i).getParamFromType().equals("containerParam")) {
					containerParam+="&"+generalParams.get(i).getParamName()+"=${sessionScope."+generalParams.get(i).getPojo().getParamFromValue()+"_paramSession}";
				}
			}
		}

//		SysTreeSolutionColumnExample example = new SysTreeSolutionColumnExample();
//		SysTreeSolutionColumnExample.Criteria criteria = example.createCriteria();
		String empContainer = "";
		String empIds="";
		if (tree.getFormShowEmpContainer()!=null) {
			if (tree.getFormShowEmpContainer().equals("true")) {
				//empContainer=SysCardFormBeansUtil.getNbsp(0)+"<div style=\"float:left;display:inline-block;margin:10px;position:relative;\"><input class=\"btn btn-primary\" style=\"width:70px;padding-left:2px;padding-right:25px;\" value=\"查询\" onclick=\"tree_"+form.getFormDefCode()+"_fun()\"><i class=\"glyphicon glyphicon-search\" style=\"position: absolute;right: 12px;top: 7px;cursor: pointer;\"></i></input></div>"+
				empContainer=SysCardFormBeansUtil.getNbsp(0)+"<div class=\"jsFiddle inline-buttons\"\">"+
			    SysCardFormBeansUtil.getNbsp(0)+"<textarea rows=\"5\" style=\"width:100%\" class=\"form-control\" id=\"empContainer\" >"+
			    SysCardFormBeansUtil.getNbsp(0)+"</textarea>"+
			    SysCardFormBeansUtil.getNbsp(0)+"</div>";
				
				empIds = SysCardFormBeansUtil.getNbsp(1)+	"var empIds=document.getElementById(\"empContainer\").value.split(\"\\n\");\n"+
				SysCardFormBeansUtil.getNbsp(1)+	"url+='&empIds='+empIds;\n";
			}
		}
		
		SysTreeNodeType treeNodeType = form.getTreeNodeType();
		
		
//		criteria.andTreeColumnTypeEqualTo("nodeName");
//		logger.info(form.getTree().getSolution().getTreeSolutionId());
//		criteria.andTreeSolutionIdEqualTo(form.getTree().getSolution().getTreeSolutionId());
//		List<SysTreeSolutionColumn> sysTreeSolutionColumns = sTreeSolutionColumnMapper.selectByExample(example);
		List<SysFormTreeSolutionColumnCache> sysTreeSolutionColumns = form.getTree().getSolution().getColumns();
				
		rets[0].append(SysCardFormBeansUtil.getNbsp(0)+"<%@page pageEncoding=\"UTF-8\" import=\"com.myehr.common.util.LangUtil\" contentType=\"text/html; charset=UTF-8\" %>\n"+
					   SysCardFormBeansUtil.getNbsp(0)+"<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n"+
					   SysCardFormBeansUtil.getNbsp(0)+"<%@include file=\"/common/commonForTree.jsp\"%>\n"+
					   SysCardFormBeansUtil.getNbsp(0)+"<html>\n"+
					   SysCardFormBeansUtil.getNbsp(0)+"<head>\n"+
					   SysCardFormBeansUtil.getNbsp(0)+"<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\"/>\n"+
					   SysCardFormBeansUtil.getNbsp(0)+"<title></title>\n"+
					   SysCardFormBeansUtil.getNbsp(0)+"<style type=\"text/css\">\n"+
					   SysCardFormBeansUtil.getNbsp(0)+".wrapper{width:98%;margin:0 auto;padding-top:5px}\n"+
					   SysCardFormBeansUtil.getNbsp(0)+".row{margin:0;}\n"+
					   SysCardFormBeansUtil.getNbsp(0)+".wizard > .content > .body{padding: 0.5% 2.5%;}\n"+
					   SysCardFormBeansUtil.getNbsp(0)+".row.cell>div lable{font-weight:600}\n"+
					   SysCardFormBeansUtil.getNbsp(0)+".fixed-table-container thead th .th-inner, .fixed-table-container tbody td .th-inner{font-weight:600}\n"+
					   SysCardFormBeansUtil.getNbsp(0)+"fieldset{height:100%}\n"+
//					   SysCardFormBeansUtil.getNbsp(0)+".ztree li a{width:89%}\n"+
					   SysCardFormBeansUtil.getNbsp(0)+"#step2_part2 .fixed-table-body {height:100%}\n"+
					   SysCardFormBeansUtil.getNbsp(0)+".wizard > .content > .body ul > li{list-style:none}\n"+
					   SysCardFormBeansUtil.getNbsp(0)+"#step2_part2 .clearfix{display:none}\n"+
					   SysCardFormBeansUtil.getNbsp(0)+".row.cell>div{min-height:30px;margin:10px 0 0 0;}\n"+
					   SysCardFormBeansUtil.getNbsp(0)+"#form-p-5,#form-p-4,#form-p-3,#form-p-2,#form-p-1{width:100%;height:97%}\n"+
					   SysCardFormBeansUtil.getNbsp(0)+"       .sidebar{height: 100%;\n"+
					   SysCardFormBeansUtil.getNbsp(0)+"           position: relative;\n"+
					   SysCardFormBeansUtil.getNbsp(0)+"           border-radius: 5px;\n"+
					   SysCardFormBeansUtil.getNbsp(0)+"           margin-bottom: 10px;\n"+
					   SysCardFormBeansUtil.getNbsp(0)+"           padding: 10px;}\n"+
					    SysCardFormBeansUtil.getNbsp(0)+"      .searchInput{position: relative;}\n"+
					   SysCardFormBeansUtil.getNbsp(0)+"       .searchInfo{position: absolute;top: 0;right: 0;margin-right: 30px;}\n"+
					   SysCardFormBeansUtil.getNbsp(0)+"       .searchInfoWrapper>div{display: inline-block;}\n"+
					   SysCardFormBeansUtil.getNbsp(0)+"       .searchInfoWrapper>div a{cursor: pointer;}\n"+
					   SysCardFormBeansUtil.getNbsp(0)+"       .searchInfoWrapper label {margin: 4px 5px 0;vertical-align: top;}\n"+
					   SysCardFormBeansUtil.getNbsp(0)+"       .panel-heading {padding: 5px 15px;}\n"+
					   SysCardFormBeansUtil.getNbsp(0)+"</style>\n"+
					   SysCardFormBeansUtil.getNbsp(0)+"</head>\n"+
					   SysCardFormBeansUtil.getNbsp(0)+"<body>\n"+
					   SysCardFormBeansUtil.getNbsp(0)+"<div id=\"layout1\" class=\"nui-layout\" style=\"width:100%;height:100%;position:relative\">\n");
		if (form.getTree().getFormAutoCheckParent().equals("true")) {
			rets[0].append(SysCardFormBeansUtil.getNbsp(1)+"<div role=\"tabpanel\" class=\"tab-pane panel panel-primary fade in active\" id=\"Section1\" style=\"width:100%;float:left;height:90%;margin:0;border:none;position:relative\">\n");
		} else {
			rets[0].append(SysCardFormBeansUtil.getNbsp(1)+"<div role=\"tabpanel\" class=\"tab-pane panel panel-primary fade in active\" id=\"Section1\" style=\"width:17%;float:left;height:90%;margin:0;border:none;position:relative\">\n");
		}			   
		
		
		/*ets[1].append(SysCardFormBeansUtil.getNbsp(1)+"<div title=\"<%=LangUtil.getLangByCode((String)session.getAttribute(\"langType\"),\""+form.getFormDefName()+"\")%>\" region=\"center\" style=\"float:left;width:"+form.getTree().getFormTreeWidth()+";height:100%\" bodyStyle=\"overflow:hidden;\" showHeader=\""+form.getTree().getFormShowTitle()+"\"\n"+ 
					   SysCardFormBeansUtil.getNbsp(1)+"showFilter=\""+form.getTree().getFormShowFilter()+"\"\n"+
					   SysCardFormBeansUtil.getNbsp(1)+"class=\"sub-sidebar\" allowResize=\"false\">\n" );
		
		rets[2].append(SysCardFormBeansUtil.getNbsp(0)+"<div title=\"<%=LangUtil.getLangByCode((String)session.getAttribute(\"langType\"),\""+form.getFormDefName()+"\")%>\" region=\"west\" style=\"float:left;width:"+form.getTree().getFormTreeWidth()+";height:100%\" bodyStyle=\"overflow:hidden;\" showHeader=\""+form.getTree().getFormShowTitle()+"\"\n"+ 
					   SysCardFormBeansUtil.getNbsp(1)+"showFilter=\""+form.getTree().getFormShowFilter()+"\"\n"+
					   SysCardFormBeansUtil.getNbsp(1)+"class=\"sub-sidebar\" allowResize=\"false\">\n" );*/
		/*rets[1].append(	SysCardFormBeansUtil.getNbsp(2)+"<div class=\"panel-heading\"><%=LangUtil.getLangByCode((String)session.getAttribute(\"langType\"),\""+form.getFormDefName()+"\")%></div>\n"+ 
						SysCardFormBeansUtil.getNbsp(2)+"<div class=\"sidebar panel-body\">\n"+
						SysCardFormBeansUtil.getNbsp(3)+"<div class=\"searchInput\">\n"+
						SysCardFormBeansUtil.getNbsp(4)+"<input type=\"text\"  id=\"key\" class=\"empty form-control\" placeholder=\"Search...\" onkeyup=\"callNumber()\">\n"+
						SysCardFormBeansUtil.getNbsp(4)+"<i class=\"glyphicon glyphicon-search\" style=\"position: absolute;right: 6px;top: 6px;cursor: pointer;\"></i>\n"+
						SysCardFormBeansUtil.getNbsp(4)+"<div class=\"searchInfo\">\n"+
						SysCardFormBeansUtil.getNbsp(5)+"<label type=\"text\" class=\"searchInfoWrapper\"  id=\"resultKey\">\n"+
						SysCardFormBeansUtil.getNbsp(5)+"<div>\n"+
						SysCardFormBeansUtil.getNbsp(6)+"<i id=\"clickUp\" class=\"glyphicon glyphicon-arrow-up\" onclick=\"clickUp()\" style=\"top:4px\"></i>\n"+
						SysCardFormBeansUtil.getNbsp(6)+"<i id=\"clickDown\" class=\"glyphicon glyphicon-arrow-down\" onclick=\"clickDown()\" style=\"top:4px\"></i>\n"+
						SysCardFormBeansUtil.getNbsp(5)+"</div>\n"+
						SysCardFormBeansUtil.getNbsp(5)+"<label id=\"number\"></label>\n"+
						SysCardFormBeansUtil.getNbsp(5)+"</label>\n"+
						SysCardFormBeansUtil.getNbsp(4)+"</div>\n"+
						SysCardFormBeansUtil.getNbsp(3)+"</div>\n");
	
		rets[2].append(	SysCardFormBeansUtil.getNbsp(3)+"<div class=\"panel-heading\"><%=LangUtil.getLangByCode((String)session.getAttribute(\"langType\"),\""+form.getFormDefName()+"\")%></div>\n"+ 
						SysCardFormBeansUtil.getNbsp(4)+"<div class=\"sidebar panel-body\">\n"+
						SysCardFormBeansUtil.getNbsp(5)+"<div class=\"searchInput\">\n"+
						SysCardFormBeansUtil.getNbsp(6)+"<input type=\"text\"  id=\"key\" class=\"empty form-control\" placeholder=\"Search...\" onkeyup=\"callNumber()\">\n"+
						SysCardFormBeansUtil.getNbsp(6)+"<i class=\"glyphicon glyphicon-search\" style=\"position: absolute;right: 6px;top: 6px;cursor: pointer;\"></i>\n"+
						SysCardFormBeansUtil.getNbsp(6)+"<div class=\"searchInfo\">\n"+
						SysCardFormBeansUtil.getNbsp(7)+"<label type=\"text\" class=\"searchInfoWrapper\"  id=\"resultKey\">\n"+
						SysCardFormBeansUtil.getNbsp(7)+"<div>\n"+
						SysCardFormBeansUtil.getNbsp(8)+"<i id=\"clickUp\" class=\"glyphicon glyphicon-arrow-up\" onclick=\"clickUp()\" style=\"top:4px\"></i>\n"+
						SysCardFormBeansUtil.getNbsp(8)+"<i id=\"clickDown\" class=\"glyphicon glyphicon-arrow-down\" onclick=\"clickDown()\" style=\"top:4px\"></i>\n"+
						SysCardFormBeansUtil.getNbsp(7)+"</div>\n"+
						SysCardFormBeansUtil.getNbsp(7)+"<label id=\"number\"></label>\n"+
						SysCardFormBeansUtil.getNbsp(7)+"</label>\n"+
						SysCardFormBeansUtil.getNbsp(6)+"</div>\n"+
						SysCardFormBeansUtil.getNbsp(5)+"</div>\n");*/
		
		rets[3].append(	SysCardFormBeansUtil.getNbsp(3)+"<div class=\"panel-heading\"><%=LangUtil.getLangByCode((String)session.getAttribute(\"langType\"),\""+form.getFormDefName()+"\")%></div>\n"+ 
						SysCardFormBeansUtil.getNbsp(4)+"<div class=\"sidebar panel-body\">\n"+
						SysCardFormBeansUtil.getNbsp(5)+"<div class=\"searchInput\">\n"+
						SysCardFormBeansUtil.getNbsp(6)+"<input type=\"text\"  id=\"key\" class=\"empty form-control\" placeholder=\"Search...\" onkeyup=\"callNumber()\">\n"+
						SysCardFormBeansUtil.getNbsp(6)+"<i class=\"glyphicon glyphicon-search\" style=\"position: absolute;right: 12px;top: 10px;cursor: pointer;\"></i>\n"+
						SysCardFormBeansUtil.getNbsp(6)+"<div class=\"searchInfo\">\n"+
						SysCardFormBeansUtil.getNbsp(7)+"<label type=\"text\" class=\"searchInfoWrapper\"  id=\"resultKey\">\n"+
						SysCardFormBeansUtil.getNbsp(7)+"<div>\n"+
						SysCardFormBeansUtil.getNbsp(8)+"<i id=\"clickUp\" class=\"glyphicon glyphicon-menu-up\" onclick=\"clickUp()\"><</i>\n"+
						SysCardFormBeansUtil.getNbsp(8)+"<i id=\"clickDown\" class=\"glyphicon glyphicon-menu-down\" onclick=\"clickDown()\">></i>\n"+
						SysCardFormBeansUtil.getNbsp(7)+"</div>\n"+
						SysCardFormBeansUtil.getNbsp(7)+"<label id=\"number\"></label>\n"+
						SysCardFormBeansUtil.getNbsp(7)+"</label>\n"+
						SysCardFormBeansUtil.getNbsp(6)+"</div>\n"+
						SysCardFormBeansUtil.getNbsp(5)+"</div>\n"); 
		rets[4].append(sbs[6]);   
		/*rets[4].append(SysCardFormBeansUtil.getNbsp(1)+"<div class=\"nui-toolbar\" style=\"border-bottom:0;padding:0px;\">\n"+
					   SysCardFormBeansUtil.getNbsp(2)+"<table style=\"width:100%;\">\n"+
					   SysCardFormBeansUtil.getNbsp(3)+"<tr>\n"+
					   SysCardFormBeansUtil.getNbsp(4)+"<td style=\"width:100%;\">\n");
		rets[4].append(sbs[6]);
		rets[4].append(SysCardFormBeansUtil.getNbsp(4)+"</td>\n"+
					   SysCardFormBeansUtil.getNbsp(3)+"</tr>\n"+
					   SysCardFormBeansUtil.getNbsp(2)+"</table>\n"+
					   SysCardFormBeansUtil.getNbsp(1)+"</div>\n");*/
		rets[5].append(/*SysCardFormBeansUtil.getNbsp(1)+"<div class=\"form-control\" id=\"jsp\" style=\"height:100%;padding:5px;overflow:auto;width:98%;margin:0 auto;\">\n"+*/
				       empContainer+
				       SysCardFormBeansUtil.getNbsp(5)+"\n<ul id=\"tree_"+form.getFormDefCode()+"\" style=\"overflow-y: auto;overflow-x: auto;height: 86%;margin-top: 10px;\" class=\"ztree\" \n"+
					   SysCardFormBeansUtil.getNbsp(3)+"showTreeIcon=\""+form.getTree().getFormShowTreeIcon()+"\" checkRecursive=\""+form.getTree().getFormCheckRecursive()+"\" checkParent=\""+form.getTree().getFormAutoCheckParent()+"\"\n"+
					   SysCardFormBeansUtil.getNbsp(3)+"expandOnLoad=\""+form.getTree().getFormExpandOnLoad()+"\" showTreeLines=\""+form.getTree().getFormShowTreeLines()+"\" allowSelect=\""+form.getTree().getFormAllowSelect()+"\"\n"+
					   SysCardFormBeansUtil.getNbsp(3)+"showCheckbox=\""+form.getTree().getFormShowCheckbox()+"\" showFolderCheckbox=\""+form.getTree().getFormShowFolderCheckbox()+"\" expandOnDbclick=\""+form.getTree().getFormExpandOnDbclick()+"\"\n"+
					   SysCardFormBeansUtil.getNbsp(3)+"expandOnClick=\""+form.getTree().getFormExpandOnClick()+"\"\n"+    
					   SysCardFormBeansUtil.getNbsp(3)+"textField=\""+form.getTree().getFormTreeTextField()+"\" idField=\""+ChangeCode.getUniqueCode(sysTreeSolutionColumns.get(0).getPojo().getTreeEntityTablename(), form.getTree().getFormTreeIdField())+"\" resultAsTree=\"false\" dataField=\"datas\"\n"+
					   SysCardFormBeansUtil.getNbsp(3)+"onnodeclick=\"onNodeClick_"+form.getFormDefCode()+"\" onload=\"load_"+form.getFormDefCode()+"\" contextMenu=\"#treeMenu\"");
		//rets[5].append(">\n");

		rets[6].append(SysCardFormBeansUtil.getNbsp(0)+">\n"+
					   SysCardFormBeansUtil.getNbsp(2)+"</ul>\n"+
					   SysCardFormBeansUtil.getNbsp(1)+"</div>\n" +
					   SysCardFormBeansUtil.getNbsp(1)+"<div class=\"hiddenIcon\"><span class=\"fa fa-angle-double-left\" onclick=\"hiddenTree(this)\" style=\"font-size:25px\"></span></div>\n" +
					   SysCardFormBeansUtil.getNbsp(1)+"</div>\n");
		rets[7].append(SysCardFormBeansUtil.getNbsp(1)+"<div class=\"showIcon\"><div class=\"showIconx\"><span class=\"fa fa-angle-double-right\" onclick=\"showTree(this)\" style=\"font-size:25px\"></span></div></div>\n" +
					   SysCardFormBeansUtil.getNbsp(1)+"<div id=\"iframe\" title=\"center\" region=\"center\" style=\"border:0;width:82%;height:100%;float:left;\">\n"+
					   SysCardFormBeansUtil.getNbsp(2)+"<iframe id=\"main\" frameborder=\"0\" name=\"main\"  width=\"100%\" height=\"100%\" border=\"0\" scroll=\"yes\" style=\"margin-top: 0px;\" ></iframe>\n"+
					   SysCardFormBeansUtil.getNbsp(1)+"</div>\n");
		rets[8].append(SysCardFormBeansUtil.getNbsp(0)+"</div>\n"+

					   SysCardFormBeansUtil.getNbsp(0)+"</body>\n"+
					   SysCardFormBeansUtil.getNbsp(0)+"<script type=\"text/javascript\">\n"+
					   
					   SysCardFormBeansUtil.getNbsp(0)+"var activeTab = 0;\n"+
					   SysCardFormBeansUtil.getNbsp(0)+"function changeTabA(e){\n"+
					   SysCardFormBeansUtil.getNbsp(1)+"activeTab = e;\n"+
					   SysCardFormBeansUtil.getNbsp(0)+"}\n"+
					   
					   SysCardFormBeansUtil.getNbsp(0)+"var width=\""+form.getTree().getFormTreeWidth()+"\".split(\"p\");\n"+
					   SysCardFormBeansUtil.getNbsp(0)+"var setting = {\n"+
					   SysCardFormBeansUtil.getNbsp(3)+"//勾选 checkbox 对于父子节点的关联关系\n");
					   
		if(form.getTree().getFormShowCheckbox().equals("true")&&form.getTree().getFormShowFolderCheckbox().equals("true")){
			rets[8].append(SysCardFormBeansUtil.getNbsp(3)+"check: {enable: true,chkboxType: {\"Y\":\"ps\", \"N\":\"ps\"}  },\n");
		}else {
			rets[8].append(SysCardFormBeansUtil.getNbsp(3)+"check: {enable: false,chkboxType: {\"Y\":\"ps\", \"N\":\"ps\"}  },\n");
		}
					   
					   
//		String ss = "N";
//	    if (treeNodeType!=null&&treeNodeType.getTreeNodeTypeCode()!=null) {
//	    	ss = treeNodeType.getTreeNodeTypeCode();
//	    }	
		String entityName = sysTreeSolutionColumns.get(0).getPojo().getTreeEntityTablename();
		String treeId = form.getTree().getFormTreeIdField();
		String treePid = form.getTree().getFormTreeParentField();
		String cName = form.getTree().getFormTreeTextField();
		rets[8].append(SysCardFormBeansUtil.getNbsp(3)+"data: {\n"+
					   SysCardFormBeansUtil.getNbsp(4)+"key: {title: \""+ChangeCode.getUniqueCode(entityName,cName)+"\"},\n"+
					   SysCardFormBeansUtil.getNbsp(4)+"//使用简易数据模式，即id  pid,一定要注意大小写\n"+
					   SysCardFormBeansUtil.getNbsp(4)+"simpleData: {\n"+
					   SysCardFormBeansUtil.getNbsp(5)+"enable: true,\n"+
					   SysCardFormBeansUtil.getNbsp(5)+"idKey: \""+ChangeCode.getUniqueCode(entityName,treeId)+"\",\n"+
					   SysCardFormBeansUtil.getNbsp(5)+"pIdKey: \""+ChangeCode.getUniqueCode(entityName,treePid)+"\",\n"+
					   SysCardFormBeansUtil.getNbsp(5)+"rootPId: 2 //根节点pid \n"+
					   SysCardFormBeansUtil.getNbsp(4)+"}\n"+
					   SysCardFormBeansUtil.getNbsp(3)+"},\n"+
					   SysCardFormBeansUtil.getNbsp(3)+"callback: {onCheck: onCheck,onClick:onClick,onAsyncSuccess:onAsyncSuccess,onAsyncError: zTreeOnAsyncError},\n"+
					   SysCardFormBeansUtil.getNbsp(3)+"//这个async是插件封装的ajax\n"+
					   SysCardFormBeansUtil.getNbsp(3)+"async: {\n"+
					   SysCardFormBeansUtil.getNbsp(4)+"enable:true, // 需要异步加载\n"+
					   SysCardFormBeansUtil.getNbsp(4)+"type:\"get\",\n"+
					   SysCardFormBeansUtil.getNbsp(4)+"url:\""+form.getTree().getFormTreeUrl(request)+"\",//ajax的请求地址\n"+
					   SysCardFormBeansUtil.getNbsp(4)+"autoParam:[\""+ChangeCode.getUniqueCode(entityName,treeId)+"\",\"level=lv\"], //传递的参数 id lv（层级，最开始是0）\n"+
					   SysCardFormBeansUtil.getNbsp(4)+"dataFilter: filter\n"+
					   SysCardFormBeansUtil.getNbsp(3)+"},\n"+
					   SysCardFormBeansUtil.getNbsp(3)+"//双击节点时，是否自动展开父节点的标识\n"+
					   SysCardFormBeansUtil.getNbsp(3)+"view: { dblClickExpand: false,showLine: false,addDiyDom: addDiyDom}, \n"+
					   SysCardFormBeansUtil.getNbsp(2)+"};\n");
					   
	    rets[8].append(SysCardFormBeansUtil.getNbsp(2)+sbs[9].toString());
	    
	    logger.info(treeCache+"");
	    rets[8].append(
	    			   SysCardFormBeansUtil.getNbsp(2)+"\n//数据过滤  childNodes其实是ajax返回的数据\n"+
					   SysCardFormBeansUtil.getNbsp(2)+"function filter(treeId, parentNode, childNodes) {\n"+
					   SysCardFormBeansUtil.getNbsp(4)+"if (!childNodes) return null;\n"+
					   SysCardFormBeansUtil.getNbsp(5)+"for (var i=0, l=childNodes.length; i<l; i++) {\n"+
					   SysCardFormBeansUtil.getNbsp(6)+"if (childNodes[i]."+ChangeCode.getUniqueCode(entityName,treeCache.getFormTreeTextField())+"!=null) {\n"+
					   SysCardFormBeansUtil.getNbsp(7)+"childNodes[i].name = childNodes[i]."+ChangeCode.getUniqueCode(entityName,treeCache.getFormTreeTextField())+".replace(/\\.n/g, \'.\');\n"+
					   SysCardFormBeansUtil.getNbsp(6)+"}\n"+
					   SysCardFormBeansUtil.getNbsp(5)+"}\n"+
					   SysCardFormBeansUtil.getNbsp(5)+"return childNodes;\n"+
					   SysCardFormBeansUtil.getNbsp(4)+"}\n"+
					   
						SysCardFormBeansUtil.getNbsp(2)+"function addDiyDom(treeId, treeNode) {\n"+
						SysCardFormBeansUtil.getNbsp(4)+"var spaceWidth = 5;\n"+
						SysCardFormBeansUtil.getNbsp(4)+"var switchObj = $(\"#\" + treeNode.tId + \"_switch\"),\n"+
						SysCardFormBeansUtil.getNbsp(4)+"icoObj = $('#' + treeNode.tId + '_ico');\n"+
						SysCardFormBeansUtil.getNbsp(4)+"switchObj.remove();\n"+
						SysCardFormBeansUtil.getNbsp(4)+"icoObj.before(switchObj);\n"+
						SysCardFormBeansUtil.getNbsp(4)+"if (treeNode.level > 1) {\n"+
						SysCardFormBeansUtil.getNbsp(6)+"var spaceStr = \"<span style='display: inline-block;width:\" + (spaceWidth * treeNode.level)+ \"px'></span>\";\n"+
						SysCardFormBeansUtil.getNbsp(6)+"switchObj.before(spaceStr);\n"+
						SysCardFormBeansUtil.getNbsp(2)+"}\n}\n"+
					   
					   SysCardFormBeansUtil.getNbsp(2)+"function beforeClick(treeId, treeNode) {\n"+
					   SysCardFormBeansUtil.getNbsp(4)+"if (!treeNode.isParent) {\n"+
					   SysCardFormBeansUtil.getNbsp(5)+"alert(\"请选择父节点\");\n"+
					   SysCardFormBeansUtil.getNbsp(6)+"return false;\n"+
					   SysCardFormBeansUtil.getNbsp(5)+"} else {\n"+
					   SysCardFormBeansUtil.getNbsp(6)+"return true;\n"+
					   SysCardFormBeansUtil.getNbsp(5)+"}\n"+
					   SysCardFormBeansUtil.getNbsp(2)+"}\n"+
					   SysCardFormBeansUtil.getNbsp(2)+"//节点预加载2级数据，用于捕获异步加载正常结束的事件回调函数\n"+
					   SysCardFormBeansUtil.getNbsp(2)+"var maxLevel = 1;\n"+
					   SysCardFormBeansUtil.getNbsp(2)+"function onAsyncSuccess(event, treeId, treeNode){\n"+
					   SysCardFormBeansUtil.getNbsp(4)+"if(treeNode && treeNode.level >= maxLevel - 1 ){\n"+
					   SysCardFormBeansUtil.getNbsp(5)+"return;\n"+
					   SysCardFormBeansUtil.getNbsp(4)+"}\n"+
					   SysCardFormBeansUtil.getNbsp(4)+"var zTree = $.fn.zTree.getZTreeObj(\"tree_"+form.getFormDefCode()+"\");\n"+
					   SysCardFormBeansUtil.getNbsp(4)+"var type = 'refresh';//清空后重新加载\n"+
					   SysCardFormBeansUtil.getNbsp(4)+"var silent = true;//不展开父节点，其他值或缺省状态都自动展开\n"+
					   SysCardFormBeansUtil.getNbsp(4)+"//加载根节点时，treeNode是不存在的null，所以一定要做处理\n"+
					   SysCardFormBeansUtil.getNbsp(4)+"var nodes = treeNode ? treeNode.children : zTree.getSelectedNodes();\n"+
					   SysCardFormBeansUtil.getNbsp(4)+"for (var i=0, l=nodes.length; i<l; i++) {\n"+
					   SysCardFormBeansUtil.getNbsp(5)+"if(nodes[i].isParent){\n"+
					   SysCardFormBeansUtil.getNbsp(5)+"//强行异步加载父节点的子节点,点击之后运行这个函数，只传父节点过去,注意设置属性isParent\n"+
					   SysCardFormBeansUtil.getNbsp(6)+"zTree.reAsyncChildNodes(nodes[i], type, silent);\n"+
					   SysCardFormBeansUtil.getNbsp(6)+"if (!silent) zTree.selectNode(nodes[i]);\n"+
					   SysCardFormBeansUtil.getNbsp(5)+"}\n"+
					   SysCardFormBeansUtil.getNbsp(4)+"}\n"+
					   SysCardFormBeansUtil.getNbsp(4)+"var selectedNode = zTree.getSelectedNodes();\n"+
					   SysCardFormBeansUtil.getNbsp(4)+"var nodes = zTree.getNodes();\n"+
					   SysCardFormBeansUtil.getNbsp(4)+"zTree.expandNode(nodes[0], true);\n"+

					   SysCardFormBeansUtil.getNbsp(4)+"var iFrameWidth = $(window).width()-width[0];\n"+
					   
					   
 						 SysCardFormBeansUtil.getNbsp(4)+"if(paramtabs_map!=undefined&&paramtabs_map!=null){\n"+
						 SysCardFormBeansUtil.getNbsp(6)+"if(nodes.length<0&&nodes[0].children!=null&&nodes[0].children!=undefined){\n"+
						 SysCardFormBeansUtil.getNbsp(6)+"document.getElementById(\"main\").src = setUrlParam(paramtabs_map[\""+sbs[15]+"\"][0].url, nodes[0].children[0]);\n"+
						 SysCardFormBeansUtil.getNbsp(2)+"}else{\n"+
						 SysCardFormBeansUtil.getNbsp(2)+"document.getElementById(\"main\").src = setUrlParam(paramtabs_map[\""+sbs[15]+"\"][0].url, nodes[0]);\n"+
						 SysCardFormBeansUtil.getNbsp(2)+"}\n"+
						 SysCardFormBeansUtil.getNbsp(4)+"}\n"+
						
						 //					   SysCardFormBeansUtil.getNbsp(4)+"}\n"+
						 SysCardFormBeansUtil.getNbsp(2)+"}\n"+
						 SysCardFormBeansUtil.getNbsp(2)+"$(window).resize(function() {\n"+
						 SysCardFormBeansUtil.getNbsp(4)+"var iFrameWidth = $(window).width()-width[0];\n"+
						// SysCardFormBeansUtil.getNbsp(4)+"$(\"#main\").width(iFrameWidth+\"px\");\n"+
						 SysCardFormBeansUtil.getNbsp(2)+"});\n"+
					   
					   SysCardFormBeansUtil.getNbsp(2)+"//点击事件\n"+
					   SysCardFormBeansUtil.getNbsp(2)+"function onClick(event, treeId, treeNode){  \n"+
					   SysCardFormBeansUtil.getNbsp(4)+"var switchBtn = treeNode.tId+'_switch';\n"+/*
					   SysCardFormBeansUtil.getNbsp(4)+"var iFrameWidth = $(window).width()-width[0]-30;\n"+
					   SysCardFormBeansUtil.getNbsp(4)+"var iFrameHeight = $(window).height();\n"+
					   SysCardFormBeansUtil.getNbsp(4)+"$(\"#iframe\").width(iFrameWidth+\"px\");\n"+
					   SysCardFormBeansUtil.getNbsp(4)+"$(\"#iframe\").height(iFrameHeight+\"px\");\n"+*/
					   SysCardFormBeansUtil.getNbsp(4)+"if(1>2){\n"+
					   SysCardFormBeansUtil.getNbsp(5)+"$(\"#\"+switchBtn).click();\n"+
					   SysCardFormBeansUtil.getNbsp(4)+"}else{\n"+
					   SysCardFormBeansUtil.getNbsp(5)+"if(typeof(paramtabs_map)=='undefined'){\n"+
					   SysCardFormBeansUtil.getNbsp(6)+"return;\n"+
					   SysCardFormBeansUtil.getNbsp(5)+"}\n"+
					   SysCardFormBeansUtil.getNbsp(5)+"var nodeType = treeNode."+ChangeCode.getUniqueCode(entityName,form.getTree().getFormTreeValue())+";\n"+
					   SysCardFormBeansUtil.getNbsp(5)+"var main = document.getElementById(\"main\");\n"+
					   SysCardFormBeansUtil.getNbsp(5)+"var paramtabs = paramtabs_map[nodeType];\n"+
					   SysCardFormBeansUtil.getNbsp(5)+"if(!paramtabs) return;\n"+
					   SysCardFormBeansUtil.getNbsp(5)+"main.src = setUrlParam(paramtabs[0].url,treeNode);\n"+
					   SysCardFormBeansUtil.getNbsp(4)+"}\n"+
					   SysCardFormBeansUtil.getNbsp(2)+"}; \n"+
					   SysCardFormBeansUtil.getNbsp(2)+"//用于捕获异步加载出现异常错误的事件回调函数\n"+
					   SysCardFormBeansUtil.getNbsp(2)+"function zTreeOnAsyncError(event, treeId, treeNode, XMLHttpRequest, textStatus, errorThrown) {\n"+
					   SysCardFormBeansUtil.getNbsp(3)+"alert(XMLHttpRequest);\n"+
					   SysCardFormBeansUtil.getNbsp(2)+"};\n"+
					   SysCardFormBeansUtil.getNbsp(2)+"//自定义设置节点属性,在本DEMO中并无实质意义\n"+
					   SysCardFormBeansUtil.getNbsp(2)+"function setTitle(node) {\n"+
					   SysCardFormBeansUtil.getNbsp(4)+"var zTree = $.fn.zTree.getZTreeObj(\"tree_"+form.getFormDefCode()+"\");\n"+
					   SysCardFormBeansUtil.getNbsp(4)+"var nodes = node ? [node]:zTree.transformToArray(zTree.getNodes());\n"+
					   SysCardFormBeansUtil.getNbsp(4)+"for (var i=0, l=nodes.length; i<l; i++) {\n"+
					   SysCardFormBeansUtil.getNbsp(5)+"var n = nodes[i];\n"+
					   SysCardFormBeansUtil.getNbsp(5)+"n.title = \"[\" + n.id + \"] isFirstNode = \" + n.isFirstNode + \", isLastNode = \" + n.isLastNode;\n"+
					   SysCardFormBeansUtil.getNbsp(5)+"console.log(n.title);\n"+
					   SysCardFormBeansUtil.getNbsp(5)+"zTree.updateNode(n);\n"+
					   SysCardFormBeansUtil.getNbsp(4)+"}\n"+
					   SysCardFormBeansUtil.getNbsp(2)+"}\n"+
					   SysCardFormBeansUtil.getNbsp(2)+"//选中后触发函数\n"+
					   SysCardFormBeansUtil.getNbsp(2)+"function onCheck(e, treeId, treeNode) {count();}\n"+
					   SysCardFormBeansUtil.getNbsp(2)+"//拿到点击的总个数\n"+
					   SysCardFormBeansUtil.getNbsp(2)+"function count() {\n"+
					   SysCardFormBeansUtil.getNbsp(3)+"function isForceHidden(node) {\n"+
					   SysCardFormBeansUtil.getNbsp(4)+"if (!node.parentTId) return false;\n"+
					   SysCardFormBeansUtil.getNbsp(4)+"var p = node.getParentNode();\n"+
					   SysCardFormBeansUtil.getNbsp(5)+"return !!p.isHidden ? true : isForceHidden(p);\n"+
					   SysCardFormBeansUtil.getNbsp(3)+"}\n"+
					   SysCardFormBeansUtil.getNbsp(3)+"var zTree = $.fn.zTree.getZTreeObj(\"tree_"+form.getFormDefCode()+"\"),\n"+
					   SysCardFormBeansUtil.getNbsp(3)+"checkCount = zTree.getCheckedNodes(true).length,\n"+
					   SysCardFormBeansUtil.getNbsp(3)+"nocheckCount = zTree.getCheckedNodes(false).length,\n"+
					   SysCardFormBeansUtil.getNbsp(3)+"hiddenNodes = zTree.getNodesByParam(\"isHidden\", true),\n"+
					   SysCardFormBeansUtil.getNbsp(3)+"hiddenCount = hiddenNodes.length;\n"+
					   SysCardFormBeansUtil.getNbsp(3)+"for (var i=0, j=hiddenNodes.length; i<j; i++) {\n"+
					   SysCardFormBeansUtil.getNbsp(4)+"var n = hiddenNodes[i];\n"+
					   SysCardFormBeansUtil.getNbsp(4)+"if (isForceHidden(n)) {\n"+
					   SysCardFormBeansUtil.getNbsp(5)+"hiddenCount -= 1;\n"+
					   SysCardFormBeansUtil.getNbsp(4)+"} else if (n.isParent) {\n"+
					   SysCardFormBeansUtil.getNbsp(5)+"hiddenCount += zTree.transformToArray(n.children).length;\n"+
					   SysCardFormBeansUtil.getNbsp(4)+"}\n"+
					   SysCardFormBeansUtil.getNbsp(3)+"}\n"+
					   SysCardFormBeansUtil.getNbsp(3)+"$(\"#checkCount\").text(checkCount);\n"+
					   SysCardFormBeansUtil.getNbsp(3)+"$(\"#nocheckCount\").text(nocheckCount);\n"+
					   SysCardFormBeansUtil.getNbsp(2)+"}\n"+
					   SysCardFormBeansUtil.getNbsp(2)+"function showNodes() {\n"+
					   SysCardFormBeansUtil.getNbsp(4)+"var zTree = $.fn.zTree.getZTreeObj(\"tree_"+form.getFormDefCode()+"\"),\n"+
					   SysCardFormBeansUtil.getNbsp(4)+"nodes = zTree.getNodesByParam(\"isHidden\", true);\n"+
					   SysCardFormBeansUtil.getNbsp(4)+"zTree.showNodes(nodes);\n"+
					   SysCardFormBeansUtil.getNbsp(4)+"setTitle();\n"+
					   SysCardFormBeansUtil.getNbsp(4)+"count();\n"+
					   SysCardFormBeansUtil.getNbsp(2)+"}\n"+
					   
					   SysCardFormBeansUtil.getNbsp(2)+"function tree_"+form.getFormDefCode()+"_fun(){\n"+
					   SysCardFormBeansUtil.getNbsp(4)+"var zTree = $.fn.zTree.getZTreeObj(\"tree_"+form.getFormDefCode()+"\");\n"+
					   SysCardFormBeansUtil.getNbsp(4)+"var nodes = zTree.getNodes();\n"+
					   SysCardFormBeansUtil.getNbsp(4)+"zTree.expandNode(nodes[0], true);\n"+
					   SysCardFormBeansUtil.getNbsp(4)+"var iFrameWidth = $(window).width()-width[0];\n"+
//					   SysCardFormBeansUtil.getNbsp(4)+"var iFrameHeight = $(window).height();\n"+
					   SysCardFormBeansUtil.getNbsp(4)+"$(\"#main\").width(iFrameWidth+\"px\");\n"+
//					   SysCardFormBeansUtil.getNbsp(4)+"$(\"#main\").height(iFrameHeight+\"px\");\n"+
//					   SysCardFormBeansUtil.getNbsp(4)+"if(paramtabs_map!=\"undefined\"){\n"+
					   SysCardFormBeansUtil.getNbsp(6)+"document.getElementById(\"main\").src = setUrlParam(paramtabs_map[\"N\"][0].url, nodes[0]);\n"+
					   SysCardFormBeansUtil.getNbsp(2)+"}\n"+
						 
					   
					   SysCardFormBeansUtil.getNbsp(2)+"function hideNodes() {\n"+
					   SysCardFormBeansUtil.getNbsp(4)+"var zTree = $.fn.zTree.getZTreeObj(\"tree_"+form.getFormDefCode()+"\"),\n"+
					   SysCardFormBeansUtil.getNbsp(4)+"nodes = zTree.getSelectedNodes();\n"+
					   SysCardFormBeansUtil.getNbsp(4)+"if (nodes.length == 0) {\n"+
					   SysCardFormBeansUtil.getNbsp(5)+"alert(\"Please select one node at least.\");\n"+
					   SysCardFormBeansUtil.getNbsp(5)+"return;\n"+
					   SysCardFormBeansUtil.getNbsp(4)+"}\n"+
					   SysCardFormBeansUtil.getNbsp(4)+"zTree.hideNodes(nodes);\n"+
					   SysCardFormBeansUtil.getNbsp(4)+"setTitle();\n"+
					   SysCardFormBeansUtil.getNbsp(4)+"count();\n"+
					   SysCardFormBeansUtil.getNbsp(2)+"}\n"+
					   SysCardFormBeansUtil.getNbsp(2)+"$(document).ready(function(){\n"+

					   SysCardFormBeansUtil.getNbsp(2)+"var height = $(window).height()-50;\n"+
					   SysCardFormBeansUtil.getNbsp(2)+"$(\"#jsp\").css(\"height\",\"100%\");\n"+
//					   SysCardFormBeansUtil.getNbsp(2)+"$(\"#main\").css(\"height\",height);\n"+
					   
					   SysCardFormBeansUtil.getNbsp(2)+"//zTree 初始化方法\n"+
					   SysCardFormBeansUtil.getNbsp(3)+"$.fn.zTree.init($(\"#tree_"+form.getFormDefCode()+"\"), setting);\n"+
					   SysCardFormBeansUtil.getNbsp(3)+"$(\"#hideNodesBtn\").bind(\"click\", {type:\"rename\"}, hideNodes);\n"+
					   SysCardFormBeansUtil.getNbsp(3)+"$(\"#showNodesBtn\").bind(\"click\", {type:\"icon\"}, showNodes);\n"+
					   SysCardFormBeansUtil.getNbsp(3)+"setTitle();\n"+
					   SysCardFormBeansUtil.getNbsp(3)+"count();\n"+
					   
					   SysCardFormBeansUtil.getNbsp(3)+"document.getElementById(\"key\").value = \"\"; //清空搜索框中的内容  \n"+
					   SysCardFormBeansUtil.getNbsp(3)+"//绑定事件  \n"+
					   SysCardFormBeansUtil.getNbsp(3)+"key = $(\"#key\");  \n"+
					   SysCardFormBeansUtil.getNbsp(3)+"key.bind(\"focus\", focusKey)  \n"+
					   SysCardFormBeansUtil.getNbsp(3)+".bind(\"blur\", blurKey)\n"+
					   SysCardFormBeansUtil.getNbsp(3)+".bind(\"propertychange\", searchNode) //property(属性)change(改变)的时候，触发事件  \n"+
					   SysCardFormBeansUtil.getNbsp(3)+".bind(\"input\", searchNode); \n"+
					   
					   SysCardFormBeansUtil.getNbsp(0)+"});\n"+
					   SysCardFormBeansUtil.getNbsp(0)+"var _gparamsobj= {};\n"+
					   SysCardFormBeansUtil.getNbsp(0)+"//全局参数\n");
	    
		rets[8].append(sbs[13].toString());
		
		rets[8].append(SysCardFormBeansUtil.getNbsp(0)+"var currentNode = null;	\n"+
					   
					   SysCardFormBeansUtil.getNbsp(0)+"var paramtabs_map;\n"+
					   SysCardFormBeansUtil.getNbsp(0)+"var _treegridselectedrows=null;\n");
		
		
		rets[10].append(/*SysCardFormBeansUtil.getNbsp(0)+"\nfunction onBeforeTreeLoad(e) {\n"+
						SysCardFormBeansUtil.getNbsp(2)+"e.url = \""+form.getTree().getFormTreeUrl(request)+"\";\n"+
						SysCardFormBeansUtil.getNbsp(2)+""+form.getTree().getJsParamStr(request)+"\n"+
						SysCardFormBeansUtil.getNbsp(2)+"//e.params.nodeType = e.node.nodeType;\n"+
						SysCardFormBeansUtil.getNbsp(2)+"//e.params.nodeExt = e.node.nodeExt;\n"+
						SysCardFormBeansUtil.getNbsp(0)+"}\n"+
						SysCardFormBeansUtil.getNbsp(0)+"var initflag = 0;\n"+
						SysCardFormBeansUtil.getNbsp(0)+"function load_"+form.getFormDefCode()+"(e){\n"+
						SysCardFormBeansUtil.getNbsp(2)+"if(initflag!=0){\n"+
						SysCardFormBeansUtil.getNbsp(3)+"return ;\n"+
						SysCardFormBeansUtil.getNbsp(2)+"}\n" +
						SysCardFormBeansUtil.getNbsp(2)+""+form.getTree().getFormTreeLoadFun()+"\n" +
						SysCardFormBeansUtil.getNbsp(0)+"}\n" +*/
						/*SysCardFormBeansUtil.getNbsp(0)+"function onNodeClick_"+form.getFormDefCode()+"(e){\n" +
						SysCardFormBeansUtil.getNbsp(2)+""+form.getTree().getFormTreeNodeClickFun()+"\n" +
						SysCardFormBeansUtil.getNbsp(0)+"}\n" +
						SysCardFormBeansUtil.getNbsp(2)+""+form.getTree().getFormTreeCustomFun()+"\n" +*/
						SysCardFormBeansUtil.getNbsp(0)+"function showNodePage(){\n"+
						SysCardFormBeansUtil.getNbsp(2)+"initflag = 1;\n"+
						SysCardFormBeansUtil.getNbsp(2)+"onNodeClick(currentNode);\n"+
						SysCardFormBeansUtil.getNbsp(0)+"}\n" +
						SysCardFormBeansUtil.getNbsp(0)+"function onNodeClick(node) {\n");
		rets[11].append(SysCardFormBeansUtil.getNbsp(2)+"return ;\n");
		rets[12].append(SysCardFormBeansUtil.getNbsp(2)+"if(typeof(paramtabs_map)=='undefined'){\n"+
						SysCardFormBeansUtil.getNbsp(3)+"return;\n"+
						SysCardFormBeansUtil.getNbsp(2)+"}\n"+
						SysCardFormBeansUtil.getNbsp(2)+"var nodeType = node."+form.getTree().getNodeType()+";\n"+
						SysCardFormBeansUtil.getNbsp(2)+"var main = document.getElementById(\"main\");\n"+
						SysCardFormBeansUtil.getNbsp(2)+"var paramtabs = paramtabs_map[nodeType];\n"+
						SysCardFormBeansUtil.getNbsp(2)+"if(!paramtabs) return;\n"+
						SysCardFormBeansUtil.getNbsp(2)+"main.src = setUrlParam(paramtabs[0].url, node);\n"+
						SysCardFormBeansUtil.getNbsp(0)+"}\n"+
						SysCardFormBeansUtil.getNbsp(0)+"function setUrlParam(url,params){\n"+
						SysCardFormBeansUtil.getNbsp(2)+	"var result = window.location.search;\n"+
						SysCardFormBeansUtil.getNbsp(2)+	"var treeUrl = result.substring(12);\n"+
						SysCardFormBeansUtil.getNbsp(1)+	"if(url.indexOf(\"?\")>=0){\n"+
						SysCardFormBeansUtil.getNbsp(2)+		"url =  url + \"&aa=dd&activeTab=\"+activeTab+\"&intrToId=${param.intrToId}&intrButtonId=${param.intrButtonId}\"+treeUrl;\n"+
//						SysCardFormBeansUtil.getNbsp(2)+		"url =  url + \"&aa=dd&intrToId=${param.intrToId}&intrButtonId=${param.intrButtonId}&\";\n"+
						SysCardFormBeansUtil.getNbsp(1)+	"}else{\n"+
						SysCardFormBeansUtil.getNbsp(2)+		"url =  url + \"?aa=dd&activeTab=\"+activeTab;\n"+
						SysCardFormBeansUtil.getNbsp(1)+	"}\n"+

						SysCardFormBeansUtil.getNbsp(1)+	"if(!url){\n"+
						SysCardFormBeansUtil.getNbsp(2)+		"return url;\n"+
						SysCardFormBeansUtil.getNbsp(1)+	"}\n"+
						SysCardFormBeansUtil.getNbsp(1)+	"var paramsStr = [];\n"+
						SysCardFormBeansUtil.getNbsp(1)+	"//nui.alert(_gparamsobj);\n"+
						SysCardFormBeansUtil.getNbsp(1)+	"if(_gparamsobj){\n"+
						SysCardFormBeansUtil.getNbsp(2)+		"for(var prop in _gparamsobj){\n"+
						SysCardFormBeansUtil.getNbsp(3)+			"//nui.alert(prop);\n"+
						SysCardFormBeansUtil.getNbsp(3)+			"paramsStr.push(prop + \"=\" + _gparamsobj[prop]);\n"+
						SysCardFormBeansUtil.getNbsp(2)+		"}\n"+
						SysCardFormBeansUtil.getNbsp(1)+	"}\n"+
						SysCardFormBeansUtil.getNbsp(1)+	"for(var prop in params){\n"+
						SysCardFormBeansUtil.getNbsp(2)+		"paramsStr.push(prop.toUpperCase() + \"=\" + params[prop]);\n"+
						SysCardFormBeansUtil.getNbsp(1)+	"}\n"+
						SysCardFormBeansUtil.getNbsp(1)+	"if(url.indexOf(\"?\")>=0){\n"+
						SysCardFormBeansUtil.getNbsp(2)+		"url =  url + \"&\" + paramsStr.join(\"&\");\n"+
						SysCardFormBeansUtil.getNbsp(1)+	"}else{\n"+
						SysCardFormBeansUtil.getNbsp(2)+		"url =  url + \"?\" + paramsStr.join(\"&\");\n"+
						SysCardFormBeansUtil.getNbsp(1)+	"}\n"+
						SysCardFormBeansUtil.getNbsp(1)+	"url+=\"&isInit=true&textField=\"+$(\"#tree_"+form.getFormDefCode()+"\").attr(\"textField\")+\"&idField=\"+$(\"#tree_"+form.getFormDefCode()+"\").attr(\"idField\");\n"+
						SysCardFormBeansUtil.getNbsp(1)+	"url+=\""+containerParam+"\";\n"+
						empIds+
						SysCardFormBeansUtil.getNbsp(1)+	"return encodeURI(url);\n"+
						SysCardFormBeansUtil.getNbsp(0)+"}\n"+
						SysCardFormBeansUtil.getNbsp(0)+  "function search() {\n"+
						SysCardFormBeansUtil.getNbsp(1)+   "var key = nui.get(\"key\").getValue();\n"+
						SysCardFormBeansUtil.getNbsp(1)+    "if (key == \"\") {\n"+
						SysCardFormBeansUtil.getNbsp(2)+       "tree.clearFilter();\n"+
						SysCardFormBeansUtil.getNbsp(1)+    "} else {\n"+
						SysCardFormBeansUtil.getNbsp(2)+        "key = key.toLowerCase();\n"+                
						SysCardFormBeansUtil.getNbsp(2)+       "tree.filter(function (node) {\n");
		rets[13].append(SysCardFormBeansUtil.getNbsp(0)+"var "+form.getTree().getFormTreeTextField()+" = node."+form.getTree().getFormTreeTextField()+" ? node."+form.getTree().getFormTreeTextField()+".toLowerCase() : \"\";\n");

		
		rets[14].append(SysCardFormBeansUtil.getNbsp(1)+ "if ("+form.getTree().getFormTreeTextField()+".indexOf(key) != -1) {\n"+
						SysCardFormBeansUtil.getNbsp(3)+                "return true;\n"+
						SysCardFormBeansUtil.getNbsp(2)+           "}\n"+
						SysCardFormBeansUtil.getNbsp(1)+     "});\n"+
						SysCardFormBeansUtil.getNbsp(0)+   "}\n"+
						SysCardFormBeansUtil.getNbsp(0)+ "}\n"+
						SysCardFormBeansUtil.getNbsp(0)+			//表单目录树右键菜单\n"+
						SysCardFormBeansUtil.getNbsp(1)+	"function onBeforeOpen(e) {\n"+
						SysCardFormBeansUtil.getNbsp(2)+	    "var menu = e.sender;\n"+
						SysCardFormBeansUtil.getNbsp(2)+	    "var node = tree.getSelectedNode();\n"+
						SysCardFormBeansUtil.getNbsp(2)+	    "if (!node) {\n"+
						SysCardFormBeansUtil.getNbsp(3)+	        "e.cancel = true;\n"+
						SysCardFormBeansUtil.getNbsp(3)+	        "return;\n"+
						SysCardFormBeansUtil.getNbsp(2)+	    "}\n"+
						SysCardFormBeansUtil.getNbsp(1)+	"} \n"+
						SysCardFormBeansUtil.getNbsp(1)+		"//刷新\n"+
						SysCardFormBeansUtil.getNbsp(1)+	"function reload(){\n"+
						SysCardFormBeansUtil.getNbsp(2)+        " window.location.reload();\n"+
						SysCardFormBeansUtil.getNbsp(1)+	"}\n"+
						SysCardFormBeansUtil.getNbsp(1)+	  "// 展开\n"+
						SysCardFormBeansUtil.getNbsp(1)+	     "function expandNode() {\n"+
						SysCardFormBeansUtil.getNbsp(2)+            "var node = tree.getSelectedNode();\n"+
						SysCardFormBeansUtil.getNbsp(2)+           "if (node) {\n"+
						SysCardFormBeansUtil.getNbsp(3)+                "tree.expandNode(node);\n"+
						SysCardFormBeansUtil.getNbsp(2)+            "}\n"+
						SysCardFormBeansUtil.getNbsp(1)+        "}\n"+
						SysCardFormBeansUtil.getNbsp(1)+		"//折叠\n"+
						SysCardFormBeansUtil.getNbsp(1)+		  "function collapseNode() {\n"+
						SysCardFormBeansUtil.getNbsp(2)+            "var node = tree.getSelectedNode();\n"+
						SysCardFormBeansUtil.getNbsp(2)+            "if (node) {\n"+
						SysCardFormBeansUtil.getNbsp(3)+                "tree.collapseNode(node);\n"+
						SysCardFormBeansUtil.getNbsp(2)+            "}\n"+
						SysCardFormBeansUtil.getNbsp(1)+        "}\n"+
						SysCardFormBeansUtil.getNbsp(1)+"//选中按钮js区域\n");
		rets[14].append(sbs[2].toString());
		rets[14].append(SysCardFormBeansUtil.getNbsp(1)+"function refreshNode() {\n"+
						SysCardFormBeansUtil.getNbsp(2)+    "if(!\"true\".equals(\""+form.getTree().getFormIsLazy()+"\")){\n"+
						SysCardFormBeansUtil.getNbsp(3)+		"var tree = nui.get(\"tree_"+form.getFormDefCode()+"\");\n"+
						SysCardFormBeansUtil.getNbsp(3)+    	"tree.load(\""+form.getTree().getFormTreeUrl(request)+"\");\n"+
						SysCardFormBeansUtil.getNbsp(2)+	"}\n"+
						SysCardFormBeansUtil.getNbsp(1)+"}\n"+
						
						
						/*SysCardFormBeansUtil.getNbsp(1)+"function CloseWindow(action) {    \n"+        
						SysCardFormBeansUtil.getNbsp(2)+    "if (window.CloseOwnerWindow) {\n"+
						SysCardFormBeansUtil.getNbsp(3)+    	"return window.CloseOwnerWindow(action);\n"+
						SysCardFormBeansUtil.getNbsp(2)+    "} else {\n"+
						SysCardFormBeansUtil.getNbsp(3)+    "	window.close();\n"+
						SysCardFormBeansUtil.getNbsp(2)+    "}\n"+
						SysCardFormBeansUtil.getNbsp(1)+"}	\n"+*/
						
						SysCardFormBeansUtil.getNbsp(1)+"function closex_"+form.getFormDefId()+"() {    \n"+        
						SysCardFormBeansUtil.getNbsp(2)+    "var index = parent.layer.getFrameIndex(window.name);\n"+
						SysCardFormBeansUtil.getNbsp(3)+    	"parent.layer.close(index);//执行关闭\n"+
						SysCardFormBeansUtil.getNbsp(2)+    "}\n"+
						
						SysCardFormBeansUtil.getNbsp(1)+"/**\n"+
						SysCardFormBeansUtil.getNbsp(1)+"function _closeParentWin(action){\n"+
						SysCardFormBeansUtil.getNbsp(2)+	"if(window.parent._closeParentWin){\n"+
						SysCardFormBeansUtil.getNbsp(3)+		"window.parent.CloseWindow(action);\n"+
						SysCardFormBeansUtil.getNbsp(2)+	"}else {\n"+
						SysCardFormBeansUtil.getNbsp(3)+		"CloseWindow(action);\n"+
						SysCardFormBeansUtil.getNbsp(2)+	"}\n"+
						SysCardFormBeansUtil.getNbsp(1)+"}\n"+
						SysCardFormBeansUtil.getNbsp(1)+"**/\n");
		
		rets[15].append(
						SysCardFormBeansUtil.getNbsp(0)+"var lastValue = \"\", nodeList = [], fontCss = {};  \n"+
						SysCardFormBeansUtil.getNbsp(0)+"//键盘释放：当输入框的键盘按键被松开时，把查询到的数据结果显示在标签中  \n"+
						SysCardFormBeansUtil.getNbsp(0)+"function callNumber(){  \n"+
						SysCardFormBeansUtil.getNbsp(0)+"    var zTree = $.fn.zTree.getZTreeObj(\"tree_"+form.getFormDefCode()+"\");  \n"+
						  
						SysCardFormBeansUtil.getNbsp(0)+"    //如果结果有值，则显示比例；如果结果为0，则显示\"[0/0]\"；如果结果为空，则清空标签框;  \n"+
						SysCardFormBeansUtil.getNbsp(0)+"    if(nodeList.length){  \n"+
						SysCardFormBeansUtil.getNbsp(0)+"        //让结果集里边的第一个获取焦点（主要为了设置背景色），再把焦点返回给搜索框  \n"+
						SysCardFormBeansUtil.getNbsp(0)+"        zTree.selectNode(nodeList[0],false );  \n"+
						SysCardFormBeansUtil.getNbsp(0)+"        document.getElementById(\"key\").focus();  \n"+
						  
						SysCardFormBeansUtil.getNbsp(0)+"        clickCount=0; //防止重新输入的搜索信息的时候，没有清空上一次记录  \n"+
						  
						SysCardFormBeansUtil.getNbsp(0)+"       //显示当前所在的是第一条  \n"+
						SysCardFormBeansUtil.getNbsp(0)+"        document.getElementById(\"number\").innerHTML=\"[\"+1+\"/\"+nodeList.length+\"]\";  \n"+
						  
						SysCardFormBeansUtil.getNbsp(0)+"    }else if(nodeList.length == 0){  \n"+
						SysCardFormBeansUtil.getNbsp(0)+"        document.getElementById(\"number\").innerHTML=\"[0/0]\";  \n"+
						SysCardFormBeansUtil.getNbsp(0)+"        zTree.cancelSelectedNode(); //取消焦点  \n"+
						SysCardFormBeansUtil.getNbsp(0)+"    }  \n"+
						  
						SysCardFormBeansUtil.getNbsp(0)+"   //如果输入框中没有搜索内容，则清空标签框  \n"+
						SysCardFormBeansUtil.getNbsp(0)+"    if(document.getElementById(\"key\").value ==\"\"){  \n"+
						SysCardFormBeansUtil.getNbsp(0)+"        document.getElementById(\"number\").innerHTML=\"\";  \n"+
						SysCardFormBeansUtil.getNbsp(0)+"        zTree.cancelSelectedNode();  \n"+
						SysCardFormBeansUtil.getNbsp(0)+"    }  \n"+
						SysCardFormBeansUtil.getNbsp(0)+"}  \n"+
						SysCardFormBeansUtil.getNbsp(0)+"function focusKey(e) {  \n"+
						SysCardFormBeansUtil.getNbsp(0)+"    if (key.hasClass(\"empty\")) {  \n"+
						SysCardFormBeansUtil.getNbsp(0)+"        key.removeClass(\"empty\");  \n"+
						SysCardFormBeansUtil.getNbsp(0)+"    }  \n"+
						SysCardFormBeansUtil.getNbsp(0)+"}  \n"+
						SysCardFormBeansUtil.getNbsp(0)+"function blurKey(e) {  \n"+
						SysCardFormBeansUtil.getNbsp(0)+"    if (key.get(0).value === \"\") {  \n"+
						SysCardFormBeansUtil.getNbsp(0)+"        key.addClass(\"empty\");  \n"+
						SysCardFormBeansUtil.getNbsp(0)+"    }  \n"+
						SysCardFormBeansUtil.getNbsp(0)+"}  \n"+
						SysCardFormBeansUtil.getNbsp(0)+"//搜索节点  \n"+
						SysCardFormBeansUtil.getNbsp(0)+"function searchNode(e) {  \n"+
						SysCardFormBeansUtil.getNbsp(0)+"    var zTree = $.fn.zTree.getZTreeObj(\"tree_"+form.getFormDefCode()+"\");  \n"+
						SysCardFormBeansUtil.getNbsp(0)+"    var value = $.trim(key.get(0).value);  \n"+
						SysCardFormBeansUtil.getNbsp(0)+"    var keyType = \"name\";  \n"+
						  
						SysCardFormBeansUtil.getNbsp(0)+"    if (key.hasClass(\"empty\")) {  \n"+
						SysCardFormBeansUtil.getNbsp(0)+"        value = \"\";  \n"+
						SysCardFormBeansUtil.getNbsp(0)+"    }  \n"+
						SysCardFormBeansUtil.getNbsp(0)+"    if (lastValue === value) return;  \n"+
						SysCardFormBeansUtil.getNbsp(0)+"    lastValue = value;  \n"+
						SysCardFormBeansUtil.getNbsp(0)+"    if (value === \"\"){  \n"+
						SysCardFormBeansUtil.getNbsp(0)+"        updateNodes(false);  \n"+
						SysCardFormBeansUtil.getNbsp(0)+"        return;  \n"+
						SysCardFormBeansUtil.getNbsp(0)+"    };  \n"+
						SysCardFormBeansUtil.getNbsp(0)+"    nodeList = zTree.getNodesByParamFuzzy(keyType, value); //调用ztree的模糊查询功能，得到符合条件的节点  \n"+
						SysCardFormBeansUtil.getNbsp(0)+"    updateNodes(true); //更新节点  \n"+
						SysCardFormBeansUtil.getNbsp(0)+"}  	\n"+
		
						SysCardFormBeansUtil.getNbsp(0)+"//高亮显示被搜索到的节点  \n"+
						SysCardFormBeansUtil.getNbsp(0)+"function updateNodes(highlight) {  \n"+
						SysCardFormBeansUtil.getNbsp(0)+"    var zTree = $.fn.zTree.getZTreeObj(\"tree_"+form.getFormDefCode()+"\");  \n"+
						SysCardFormBeansUtil.getNbsp(0)+"    for( var i=0, l=nodeList.length; i<l; i++) {  \n"+
						SysCardFormBeansUtil.getNbsp(0)+"        nodeList[i].highlight = highlight; //高亮显示搜索到的节点(highlight是自己设置的一个属性)  \n"+
						SysCardFormBeansUtil.getNbsp(0)+"        zTree.expandNode(nodeList[i].getParentNode(), true, false, false); //将搜索到的节点的父节点展开  \n"+
						SysCardFormBeansUtil.getNbsp(0)+"        zTree.updateNode(nodeList[i]); //更新节点数据，主要用于该节点显示属性的更新  \n"+
						SysCardFormBeansUtil.getNbsp(0)+"    }  \n"+
						SysCardFormBeansUtil.getNbsp(0)+"} \n"+
		
						SysCardFormBeansUtil.getNbsp(0)+"//设置颜色  \n"+
						SysCardFormBeansUtil.getNbsp(0)+"function getFontCss(treeId, treeNode) {  \n"+
						SysCardFormBeansUtil.getNbsp(0)+"    return (!!treeNode.highlight) ? {color:\"#A60000\", \"font-weight\":\"bold\"} : {color:\"#333\", \"font-weight\":\"normal\"};  \n"+
						SysCardFormBeansUtil.getNbsp(0)+"} \n"+
		
						SysCardFormBeansUtil.getNbsp(0)+"//点击向上按钮时，将焦点移向上一条数据  \n"+
						SysCardFormBeansUtil.getNbsp(0)+"function clickUp(){  \n"+
						SysCardFormBeansUtil.getNbsp(0)+"    var zTree = $.fn.zTree.getZTreeObj(\"tree_"+form.getFormDefCode()+"\");  \n"+
						SysCardFormBeansUtil.getNbsp(0)+"    //如果焦点已经移动到了最后一条数据上，就返回第一条重新开始，否则继续移动到下一条  \n"+
						SysCardFormBeansUtil.getNbsp(0)+"    if(nodeList.length==0){  \n"+
						SysCardFormBeansUtil.getNbsp(0)+"        alert(\"没有搜索结果！\");  \n"+
						SysCardFormBeansUtil.getNbsp(0)+"        return ;  \n"+
						SysCardFormBeansUtil.getNbsp(0)+"    }else if(clickCount==0) {  \n"+
						SysCardFormBeansUtil.getNbsp(0)+"        alert(\"您已位于第一条记录上！\");  \n"+
						SysCardFormBeansUtil.getNbsp(0)+"        return;  \n"+
						SysCardFormBeansUtil.getNbsp(0)+"        //让结果集里边的下一个节点获取焦点（主要为了设置背景色），再把焦点返回给搜索框  \n"+
						SysCardFormBeansUtil.getNbsp(0)+"        //zTree.selectNode(nodeList[clickCount], false)  \n"+
						SysCardFormBeansUtil.getNbsp(0)+"    }else{  \n"+
						SysCardFormBeansUtil.getNbsp(0)+"        //让结果集里边的第一个获取焦点（主要为了设置背景色），再把焦点返回给搜索框  \n"+
						SysCardFormBeansUtil.getNbsp(0)+"        clickCount --;  \n"+
						SysCardFormBeansUtil.getNbsp(0)+"        zTree.selectNode(nodeList[clickCount], false);  \n"+
						SysCardFormBeansUtil.getNbsp(0)+"    }  \n"+
						SysCardFormBeansUtil.getNbsp(0)+"    document.getElementById(\"key\").focus();  \n"+
						SysCardFormBeansUtil.getNbsp(0)+"    //显示当前所在的是条数  \n"+
						SysCardFormBeansUtil.getNbsp(0)+"    var num = clickCount + 1;  \n"+
						SysCardFormBeansUtil.getNbsp(0)+"    document.getElementById(\"number\").innerHTML = \"[\" + num + \"/\" + nodeList.length + \"]\";  \n"+
						SysCardFormBeansUtil.getNbsp(0)+"}  \n"+
						SysCardFormBeansUtil.getNbsp(0)+"//点击向上按钮时，将焦点移向下一条数据  \n"+
						SysCardFormBeansUtil.getNbsp(0)+"function clickDown(){  \n"+
						SysCardFormBeansUtil.getNbsp(0)+"    var zTree = $.fn.zTree.getZTreeObj(\"tree_"+form.getFormDefCode()+"\");  \n"+
						SysCardFormBeansUtil.getNbsp(0)+"    //如果焦点已经移动到了最后一条数据上，则提示用户（或者返回第一条重新开始），否则继续移动到下一条  \n"+
						SysCardFormBeansUtil.getNbsp(0)+"    if(nodeList.length==0){  \n"+
						SysCardFormBeansUtil.getNbsp(0)+"        alert(\"没有搜索结果！\");  \n"+
						SysCardFormBeansUtil.getNbsp(0)+"        return ;  \n"+
						SysCardFormBeansUtil.getNbsp(0)+"    }else if(nodeList.length-1==clickCount)  \n"+
						SysCardFormBeansUtil.getNbsp(0)+"    {  \n"+
						SysCardFormBeansUtil.getNbsp(0)+"        alert(\"您已位于最后一条记录上！\")  \n"+
						SysCardFormBeansUtil.getNbsp(0)+"        return;  \n"+
						SysCardFormBeansUtil.getNbsp(0)+"    }else{  \n"+
						SysCardFormBeansUtil.getNbsp(0)+"        //让结果集里边的第一个获取焦点（主要为了设置背景色），再把焦点返回给搜索框  \n"+
						SysCardFormBeansUtil.getNbsp(0)+"        clickCount ++;  \n"+
						SysCardFormBeansUtil.getNbsp(0)+"        zTree.selectNode(nodeList[clickCount], false)  \n"+
						SysCardFormBeansUtil.getNbsp(0)+"    }  \n"+
						SysCardFormBeansUtil.getNbsp(0)+"    document.getElementById(\"key\").focus();  \n"+
						SysCardFormBeansUtil.getNbsp(0)+"    //显示当前所在的条数  \n"+
						SysCardFormBeansUtil.getNbsp(0)+"    var num = clickCount + 1;  \n"+
						SysCardFormBeansUtil.getNbsp(0)+"    document.getElementById(\"number\").innerHTML = \"[\" + num + \"/\" + nodeList.length + \"]\";\n"+  
						SysCardFormBeansUtil.getNbsp(0)+"}  \n"+
						SysCardFormBeansUtil.getNbsp(1)+"</script>\n"+
						SysCardFormBeansUtil.getNbsp(0)+"</html>\n");
		
		jsp[0].append(rets[0]);
		if (form.getTree().getFormAutoCheckParent().equals("true")) {
			jsp[1].append(rets[1]);
		}else {
			jsp[1].append(rets[2]);
		}
		//if (form.getTree().getFormShowFilter().equals("true")) {
			jsp[2].append(rets[3]);
		//}
	    if(sbs[6]!=null&&!"".equals(sbs[6].toString())){
			jsp[3].append(rets[4]);
		}
		if (form.getTree().getFormIsLazy().equals("true")) {
			rets[5].append("onbeforeload=\"onBeforeTreeLoad\"");
			jsp[10].append(rets[11]);
		}
		if (form.getTree().getFormTreeValue()!=null) {
			rets[5].append("value=\""+form.getTree().getFormTreeValue()+"\"");
		}
		if (form.getTree().getFormTreeParentField()!=null) {
			rets[5].append("parentField=\""+form.getTree().getFormTreeParentField()+"\" ");
		}
		jsp[4].append(rets[5]);
		jsp[5].append(rets[6]);
		if (form.getTree().getFormAutoCheckParent().equals("false")) {
			jsp[6].append(rets[7]);
		}
		jsp[7].append(rets[8]);
		if (!"true".equals(form.getTree().getFormIsLazy())) {
			jsp[8].append(rets[9]);
		}
		jsp[9].append(rets[10]);
		jsp[11].append(rets[12]);
		jsp[12].append(rets[13]);
		jsp[13].append(rets[14]);
		jsp[13].append(rets[15]);
		return jsp;		 
	}
	
	public String replaceSqlParam(SysRuleCache rule,Map<String,String> params, Map<String, String> oparams) throws Throwable{
		String sql = rule.getRuleExcSql();
		List<SysSqlParamsCache> ps = rule.getSysSqlParams();
		//List<SysGeneralParam> gps = rule.getGeneralParam();
		
		for(int i=0; i<ps.size(); i++){
			String paramcode = ps.get(i).getSqlParamsCode();
			String paramname = ps.get(i).getSqlParamsName();
			String paramvalue = params.get(paramcode);
			if(paramvalue==null){
				logger.info("方案为："+rule.getSolution().getSolutionName()+"下，公式为："+rule.getRuleName()+" 参数为："+ps.get(i).getSqlParamsName()+" 参数值为空，公式执行失败");
			}
			sql = sql.replaceAll("\\[p:"+paramname+"\\]", paramvalue);
		} 
		
		List<String[]> arr = rule.getParams();
		
		for(int i=0; i<arr.size(); i++){
			String str1 = arr.get(i)[0];
			String str2 = arr.get(i)[1];
			if("c".equals(str1)){
				String key = "c_" + str2.substring(str2.indexOf("_")+1);
				String value = oparams.get(key);
				sql = sql.replaceAll("\\["+str1+":"+str2+"\\]", value);
			}
			if("s".equals(str1)){
				String key = "s_" + str2;
				String value = oparams.get(key);
				sql = sql.replaceAll("\\["+str1+":"+str2+"\\]", value);
			}
			if("r".equals(str1)){
				String key = "r_" + str2;
				String value = oparams.get(key);
				sql = sql.replaceAll("\\["+str1+":"+str2+"\\]", value);
			}
		}
		
		return sql;
	}
	@Override
	public String buildCardAndGridForm(SysFormconfigCache form,
			SysRequestParam request,String isApp,ActNodePropertiesExpand actNodePropertiesExpand) {
		// TODO Auto-generated method stub
		
		try {
//			StringBuffer[] sbs = form.showPage(request);
			String userId = request.getSession().getAttribute("userid")+"";
			//获取主表信息
			String mstFormId = String.valueOf(form.getFormDefId());
			SysFormconfigMstTabCache sMst = form.getMstTab();
			//通过主表Id获取html
			StringBuffer[] sbs = sysformconfigService.getForm(sMst.getPojo().getMstTabMainFormId().toString()).showPage(request,"",actNodePropertiesExpand,null,0);
			
			//获取附表信息
			String mstId = String.valueOf(sMst.getMstTabId());
			SysFormconfigMstTabDetailExample example2 = new SysFormconfigMstTabDetailExample();
			example2.or().andMstTabIdEqualTo(new BigDecimal(mstId));
			List<SysFormconfigMstTabDetail> sDetailMsts= sysDetailMapper.selectByExample(example2);
			
			//获取参数表信息
			SysFormGeneralParamExample example3 = new SysFormGeneralParamExample();
			example3.or().andParamTypeValueEqualTo(new BigDecimal(mstFormId));
			List<SysFormGeneralParam> sysFormGeneralParams= sysFormGeneralParamMapper.selectByExample(example3);
			List<SysFormconfigCache> formList = new ArrayList<SysFormconfigCache>();
			formList.add(form);
			StringBuffer[] expands = expandHtml(sMst);
			StringBuffer[] detailMst = detailMstHtml(sDetailMsts,request,formList);
			StringBuffer[] paramas = paramaHtml(sysFormGeneralParams,request);
			
//			String path11 = findSysFormFolderTreeById(form.getPojoform().getFormDefFolderId().intValue(),"");
			String path11 = form.getFormTreePath();

			form.getPojoform().setFormSubmitUrl(path11+form.getPojoform().getFormDefCode()+".jsp");
//			sysFormconfigMapper.updateByPrimaryKeyWithBLOBs(form.getPojoform());
			Map map = new HashMap();
			map.put("submitUrl", path11+form.getPojoform().getFormDefCode()+".jsp");
			map.put("formDefId", form.getFormDefId());
			sysFormconfigMapperExpand.updateSubmitUrl(map);
	
			logger.info(path11);
			//获取文件路径和文件名
			String path="C:/MyeHR/MyeHR_MSSQL/jsp/"+path11;
			String path1 =  request.getPath()+"\\"+path11;
//			String path1= "E:/SqlServer/myeclipse/apache-tomcat-6.0.45/webapps/myehr/jsp/formbuild/"+path11;
			//生成文件
			//SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
			
			CreateFileUtil.createDir(path);
			CreateFileUtil.createDir(path1);
			
			try {  
				File f = new File(path+"/"+form.getPojoform().getFormDefCode()+".jsp");
				File f1 = new File(path1+"/"+form.getPojoform().getFormDefCode()+".jsp"); 
				if (f.exists()) {  
					System.out.print("文件存在");  
				} else {  
					System.out.print("文件不存在");  
					f.createNewFile();// 不存在则创建
				}
				OutputStreamWriter write = new OutputStreamWriter(new FileOutputStream(f),"utf-8");
				BufferedWriter output=new BufferedWriter(write);
				//html
				output.write(expands[0].toString());
				output.write(expands[5].toString());  
				output.write(sbs[3].toString());   
				output.write(sbs[0].toString()); 
				output.write(sbs[1].toString());
				output.write("</div>\n</div>\n");
				output.write(expands[1].toString()); 
				output.write(expands[6].toString());    
				output.write(detailMst[0].toString());  
				output.write(expands[2].toString()); 
				output.write(detailMst[1].toString());  
				output.write(sbs[11].toString());  
				output.write(sbs[12].toString());  
				
				output.write(sbs[16].toString());
				output.write(detailMst[12].toString()); 
				output.write(sbs[17].toString());
				
				output.write(detailMst[2].toString());  
				output.write(expands[3].toString());
				
				output.write(sbs[14].toString());
				
				output.write(detailMst[3].toString()); 
				output.write(paramas[1].toString());
				output.write(detailMst[4].toString());   
				output.write(detailMst[5].toString()); 
				output.write(detailMst[7].toString());
				output.write(detailMst[8].toString());
				//output.write(sbs[2].toString());   
				//output.write(sbs[5].toString()); 
				output.write(sbs[6].toString()); 
				output.write(sbs[7].toString());
				output.write(sbs[8].toString());   
				output.write(sbs[9].toString()); 
				output.write(sbs[13].toString());
				output.close();  
				if (f1.exists()) {  
					System.out.print("文件存在");  
				} else {  
					System.out.print("文件不存在");  
					f1.createNewFile();// 不存在则创建
				}
				OutputStreamWriter write1 = new OutputStreamWriter(new FileOutputStream(f1),"utf-8");
				BufferedWriter output1=new BufferedWriter(write1);
				output1.write(expands[0].toString());
				output1.write(expands[5].toString());  
				output1.write(sbs[3].toString());   
				output1.write(sbs[0].toString()); 
				output1.write(sbs[1].toString());
				output1.write("</div>\n</div>\n");
				output1.write(expands[1].toString()); 
				output1.write(expands[6].toString());    
				output1.write(detailMst[0].toString());  
				output1.write(expands[2].toString()); 
				output1.write(detailMst[1].toString());  
				output1.write(sbs[11].toString());  
				output1.write(sbs[12].toString());  
				
				output1.write(sbs[16].toString());
				output1.write(detailMst[12].toString()); 
				output1.write(sbs[17].toString());
				
				output1.write(detailMst[2].toString());  
				output1.write(expands[3].toString());
				
				output1.write(sbs[14].toString());
				
				output1.write(detailMst[3].toString()); 
				output1.write(paramas[1].toString());
				output1.write(detailMst[4].toString());   
				output1.write(detailMst[5].toString()); 
				output1.write(detailMst[7].toString());
				output1.write(detailMst[8].toString());
				//output1.write(sbs[2].toString());   
				//output1.write(sbs[5].toString()); 
				output1.write(sbs[6].toString()); 
				output1.write(sbs[7].toString());
				output1.write(sbs[8].toString());   
				output1.write(sbs[9].toString()); 
				output1.write(sbs[13].toString()); 
				
				output1.close();  
			} catch (Exception e) {  
				e.printStackTrace();logger.error(e.getMessage(),e);
			}  
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();logger.error(e.getMessage(),e);
		} 
		return null;
	}

	@Override
	public String buildGridAndGridForm(SysFormconfigCache form,
			SysRequestParam request,String isApp) {
		try {
			StringBuffer[] sbs = form.showPage(request,"",null,null,0);
			String userId = request.getSession().getAttribute("userid")+"";
			//获取主表信息
			String mstFormId = String.valueOf(form.getFormDefId());
			SysFormconfigMstTabCache sMst = form.getMstTab();
			List<SysFormconfigCache> formList = new ArrayList<SysFormconfigCache>();
			SysFormconfigCache mainForm = sysformconfigService.getForm(sMst.getPojo().getMstTabMainFormId().toString());
			formList.add(mainForm);
			//通过主表Id获取html
			StringBuffer[] mst = mainForm.showPage(request,"",null,null,0);
			
			//获取附表信息
			String mstId = String.valueOf(sMst.getMstTabId());
			SysFormconfigMstTabDetailExample example2 = new SysFormconfigMstTabDetailExample();
			example2.or().andMstTabIdEqualTo(new BigDecimal(mstId));
			example2.setOrderByClause("TAB_DETAIL_SORT");
			List<SysFormconfigMstTabDetail> sDetailMsts= sysDetailMapper.selectByExample(example2);
			
			String exportMstTabDetail = "function exportData(fieldArray,formId){\n";
			for (int i = 0; i < sDetailMsts.size(); i++) {
				exportMstTabDetail +="    if(formId=="+sDetailMsts.get(i).getTabDetailFormId()+"){\n";
				exportMstTabDetail +="        exportData_"+sDetailMsts.get(i).getTabDetailFormId()+"(fieldArray);\n";
				exportMstTabDetail +="    }\n";
			}
			exportMstTabDetail +="}\n";
			
			//获取参数表信息
			SysFormGeneralParamExample example3 = new SysFormGeneralParamExample();
			example3.or().andParamTypeValueEqualTo(new BigDecimal(mstFormId));
			List<SysFormGeneralParam> sysFormGeneralParams= sysFormGeneralParamMapper.selectByExample(example3);
			
			StringBuffer[] expands = expandHtml(sMst);
			StringBuffer[] detailMst = detailMstHtml(sDetailMsts,request,formList);
			StringBuffer[] paramas = paramaHtml(sysFormGeneralParams,request);
			
//			String path11 = findSysFormFolderTreeById(form.getPojoform().getFormDefFolderId().intValue(),"");
			String path11 = form.getFormTreePath();

			form.getPojoform().setFormSubmitUrl(path11+form.getPojoform().getFormDefCode()+".jsp");
//			sysFormconfigMapper.updateByPrimaryKeyWithBLOBs(form.getPojoform());
			Map map = new HashMap();
			map.put("submitUrl", path11+form.getPojoform().getFormDefCode()+".jsp");
			map.put("formDefId", form.getFormDefId());
			sysFormconfigMapperExpand.updateSubmitUrl(map);
	
			logger.info(path11);
			//获取文件路径和文件名
			String path="C:/MyeHR/MyeHR_MSSQL/jsp/"+path11;
			String path1 =  request.getPath()+"\\"+path11;
//			String path1= "E:/SqlServer/myeclipse/apache-tomcat-6.0.45/webapps/myehr/jsp/formbuild/"+path11;
			//生成文件
			//SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
			
			CreateFileUtil.createDir(path);
			CreateFileUtil.createDir(path1);
			
			try {  
				File f = new File(path+"/"+form.getPojoform().getFormDefCode()+".jsp");
				File f1 = new File(path1+"/"+form.getPojoform().getFormDefCode()+".jsp"); 
				File f3 = new File(path1+"/"+form.getPojoform().getFormDefCode()+".js"); 
				if (f3.exists()) {  
					System.out.print("文件存在");  
				} else {  
					System.out.print("文件不存在");  
					f3.createNewFile();// 不存在则创建  
				}
				OutputStreamWriter write3 = new OutputStreamWriter(new FileOutputStream(f3),"utf-8");
				BufferedWriter output3=new BufferedWriter(write3);
				output3.write(detailMst[11].toString());
				output3.close();
				
				if (f.exists()) {  
					System.out.print("文件存在");  
				} else {  
					System.out.print("文件不存在");  
					f.createNewFile();// 不存在则创建
				}
				OutputStreamWriter write = new OutputStreamWriter(new FileOutputStream(f),"utf-8");
				BufferedWriter output=new BufferedWriter(write);
				mst[28].append("$(\".fixed-table-body\").css(\"height\",\"64%\");\n");
				//html
				output.write(expands[0].toString());
				output.write(expands[5].toString());
				output.write(mst[24].toString());  
				output.write(mst[6].toString());   
				output.write(mst[33].toString());
				output.write("</div>\n"); 
				output.write(mst[17].toString()); 
				output.write("</div>\n");
				output.write(expands[1].toString());
				output.write(expands[6].toString());
				output.write(detailMst[0].toString());
				output.write(expands[2].toString()); 
				output.write(detailMst[1].toString());
				output.write(mst[11].toString());
				output.write(expands[4].toString());
				
				output.write("<script type=\"text/javascript\" src=\"/myehr/jsp/formbuild/"+path11+form.getPojoform().getFormDefCode()+".js\"></script>\n");
				
				//js
				output.write(mst[3].toString());  
				//output.write(mst[4].toString());
				output.write(mst[18].toString());
				
				output.write(detailMst[12].toString());
				
				output.write(mst[56].toString());//function(
				//output.write(detailMst[2].toString());
				output.write(detailMst[16].toString());
				output.write(mst[29].toString());
				output.write(mst[28].toString());
				//output1.write(expands[3].toString());
				output.write(detailMst[15].toString());
				
				/*output.write("$(\"#form_"+sMst.getMstTabMainFormId().toString()+ ".input-group\").css(\"padding-bottom\",\"0px\");\n");
				output.write("$(\".fixed-table-toolbar\").css(\"margin-top\",\"0px\");\n");
				output.write("$(\".fixed-table-toolbar\").css(\"height\",\"10px\");\n");*/
				output.write("changeQueryGrid0();\n");
				output.write(detailMst[14].toString());
				//output.write("\ninitDict();\ninitDate();\n");
				
				output.write(detailMst[11].toString());
				output.write(mst[34].toString());
				output.write(mst[2].toString());
				
				output.write(detailMst[3].toString());
				output.write(paramas[1].toString());
				output.write(mst[30].toString());
//				output.write(detailMst[10].toString());
				
				
				output.write(detailMst[4].toString());
				output.write(mst[20].toString());
				output.write(mst[36].toString());
				output.write(mst[37].toString());
				output.write(mst[0].toString());
				output.write(mst[21].toString());
				output.write(paramas[0].toString());
				output.write(detailMst[9].toString());
				output.write(mst[32].toString());
				output.write(mst[31].toString());
				output.write(detailMst[5].toString());
				output.write(mst[22].toString());
				
				output.write(detailMst[7].toString());
				output.write(mst[7].toString());
				
				output.write(detailMst[8].toString());
				output.write(mst[8].toString());
				output.write(mst[47].toString());
				output.write(mst[25].toString());
				output.write(mst[27].toString());
				output.write(mst[26].toString());
				output.write(exportMstTabDetail);
				
				output.write(mst[19].toString());
				
				output.close();  
				if (f1.exists()) {  
					System.out.print("文件存在");  
				} else {  
					System.out.print("文件不存在");  
					f1.createNewFile();// 不存在则创建
				}
				OutputStreamWriter write1 = new OutputStreamWriter(new FileOutputStream(f1),"utf-8");
				BufferedWriter output1=new BufferedWriter(write1);
				//html
				output1.write(expands[0].toString());
				output1.write(expands[5].toString());
				output1.write(mst[24].toString());  
				output1.write(mst[6].toString());
				output1.write(mst[33].toString()); 
				output1.write("</div>\n"); 
				output1.write(mst[17].toString()); 
				output1.write("</div>\n");
				output1.write(expands[1].toString());
				output1.write(expands[6].toString());
				output1.write(detailMst[0].toString());
				output1.write(expands[2].toString()); 
				output1.write(detailMst[1].toString());
				output1.write(mst[11].toString());
				output1.write(expands[4].toString());
				
				output1.write("<script type=\"text/javascript\" src=\"/myehr/jsp/formbuild/"+path11+form.getPojoform().getFormDefCode()+".js\"></script>\n");
				
				//js
				output1.write(mst[3].toString());
				//output1.write(mst[4].toString());
				output1.write(mst[18].toString());
				output1.write(mst[55].toString());
				output1.write(detailMst[12].toString());
				
				output1.write(mst[56].toString());//function(
//				output1.write(detailMst[2].toString());
				output1.write(detailMst[16].toString());
				output1.write(mst[29].toString());
				output1.write(mst[28].toString());
				//output1.write(expands[3].toString());
				output1.write(detailMst[15].toString());
				/*output.write("$(\"#form_"+sMst.getMstTabMainFormId().toString()+ ".input-group\").css(\"padding-bottom\",\"0px\");\n");
				output.write("$(\".fixed-table-toolbar\").css(\"margin-top\",\"0px\");\n");
				output.write("$(\".fixed-table-toolbar\").css(\"height\",\"10px\");\n");*/
				output1.write(expands[7].toString());
				output1.write(detailMst[14].toString());
				//output1.write("\ninitDict();\ninitDate();\n");
				//output1.write("showMoreBtn($(\".BTNGROUP_"+sMst.getMstTabMainFormId().toString()+"\"));\n");
				output1.write(detailMst[13].toString());
				output1.write(detailMst[11].toString());
				output1.write(mst[34].toString());
				output1.write(mst[2].toString());
				
				output1.write(detailMst[3].toString());
				output1.write(paramas[1].toString());
				output1.write(mst[30].toString());
//				output1.write(detailMst[10].toString());
				
				output1.write(detailMst[4].toString());
				output1.write(mst[20].toString());
				output1.write(mst[36].toString());
				output1.write(mst[37].toString());
				output1.write(mst[0].toString());
				output1.write(mst[21].toString());
				output1.write(paramas[0].toString());
				output1.write(detailMst[9].toString());
				output1.write(mst[32].toString());
				output1.write(mst[31].toString());
				output1.write(detailMst[5].toString());
				output1.write(mst[22].toString());
				
				output1.write(detailMst[7].toString());
				output1.write(mst[7].toString());
				
				output1.write(detailMst[8].toString());
				output1.write(mst[8].toString());
				output1.write(mst[47].toString());
				output1.write(mst[25].toString());
				output1.write(mst[27].toString());
				output1.write(mst[26].toString());
				output1.write(exportMstTabDetail);
				
				output1.write(mst[19].toString());
				
				output1.close();  
				
			} catch (Exception e) {  
				e.printStackTrace();logger.error(e.getMessage(),e);
			}  
			
			
		} catch (Exception e) {
			e.printStackTrace();logger.error(e.getMessage(),e);
		} 
		return null;
	}
	
	@Override
	public String buildCardAndCardForm(SysFormconfigCache form,SysRequestParam request,String isApp,ActNodePropertiesExpand actNodePropertiesExpand) {
		// TODO Auto-generated method stub
		try {
//			StringBuffer[] sbs = form.showPage(request);
			String userId = request.getSession().getAttribute("userid")+"";
			//获取主表信息
			String mstFormId = String.valueOf(form.getFormDefId());
			SysFormconfigMstTabCache sMst= form.getMstTab();
			//通过主表Id获取html
			SysFormconfigCache mainform = sysformconfigService.getForm(sMst.getPojo().getMstTabMainFormId().toString());
			StringBuffer[] sbs = mainform.showPage(request,"",actNodePropertiesExpand,"main",0);
			//获取附表信息
			String mstId = String.valueOf(sMst.getMstTabId());
			SysFormconfigMstTabDetailExample example2 = new SysFormconfigMstTabDetailExample();
			example2.or().andMstTabIdEqualTo(new BigDecimal(mstId));
			List<SysFormconfigMstTabDetail> sDetailMsts= sysDetailMapper.selectByExample(example2);
			
			//获取参数表信息
			SysFormGeneralParamExample example3 = new SysFormGeneralParamExample();
			example3.or().andParamTypeValueEqualTo(new BigDecimal(mstFormId));
			List<SysFormGeneralParam> sysFormGeneralParams= sysFormGeneralParamMapper.selectByExample(example3);
			
			StringBuffer[] expands = expandHtml(sMst);
			StringBuffer[] detailMst = detailCardMstHtml(sDetailMsts,request);
			StringBuffer[] paramas = paramaHtmlCardToCard(mainform,sysFormGeneralParams);
			
//			String path11 = findSysFormFolderTreeById(form.getPojoform().getFormDefFolderId().intValue(),"");
			String path11 = form.getFormTreePath();

			form.getPojoform().setFormSubmitUrl(path11+form.getPojoform().getFormDefCode()+".jsp");
//			sysFormconfigMapper.updateByPrimaryKeyWithBLOBs(form.getPojoform());
			Map map = new HashMap();
			map.put("submitUrl", path11+form.getPojoform().getFormDefCode()+".jsp");
			map.put("formDefId", form.getFormDefId());
			sysFormconfigMapperExpand.updateSubmitUrl(map);
	
			logger.info(path11);
			//获取文件路径和文件名
			String path="C:/MyeHR/MyeHR_MSSQL/jsp/"+path11;
			String path1 =  request.getPath()+"\\"+path11;
			
			CreateFileUtil.createDir(path);
			CreateFileUtil.createDir(path1);
			
			try {  
				File f = new File(path+"/"+form.getPojoform().getFormDefCode()+".jsp");
				File f1 = new File(path1+"/"+form.getPojoform().getFormDefCode()+".jsp"); 
				if (f.exists()) {  
					System.out.print("文件存在");  
				} else {  
					System.out.print("文件不存在");  
					f.createNewFile();// 不存在则创建
				}
				OutputStreamWriter write = new OutputStreamWriter(new FileOutputStream(f),"utf-8");
				BufferedWriter output=new BufferedWriter(write);
				//html
				output.write(sbs[10].toString());
				output.write(sbs[3].toString());  
				output.write(sbs[0].toString());   
				output.write(sbs[1].toString()); 
				output.write(sbs[11].toString());
				output.write(detailMst[0].toString());
				if (form.getPojoform().getFormDefIsProcess().equals("Y")) {
					output.write(SysCardFormBeansUtil.getBuildCardForm6(form.getFormDefId()+"", ""));
				}
				output.write(sbs[12].toString()); 
				output.write(sbs[16].toString());//heightGadedata_;containerParam_;参数
				
				output.write(sbs[17].toString());//$(function () {  开始
				output.write(sbs[14].toString()); //$(function () {  结束
				
				output.write(paramas[1].toString());//声明主表传出参数
				output.write("function _initParamCard(){\n");
				output.write(paramas[0].toString());//主表传出参数赋值
				output.write("}\n");
				
				output.write("function _initFollowCard(){\n");
				output.write(detailMst[2].toString());//初始化副本数据
				output.write("}\n");
				
				output.write(detailMst[3].toString());//声明副表表单Id
				output.write(sbs[18].toString());//卡片表单id声明
				output.write(sbs[19].toString());//window.onload=function(){cardSelectInitFunction();
				output.write(sbs[2].toString());//window.onload结束    
				//output.write(sbs[4].toString());  
				output.write(sbs[5].toString());
				output.write(detailMst[1].toString());
				output.write(sbs[6].toString());  
				output.write(sbs[7].toString());  
				output.write(sbs[8].toString());  
				output.write(sbs[9].toString());
//				output.write(SysCardFormBeansUtil.RichText());
//				output.write(sbs[5].toString()); 
				
				if (form.getPojoform().getFormDefIsProcess().equals("Y")) {
					output.write(SysCardFormBeansUtil.getBuildCardForm7(form.getFormDefId()+"", ""));
				}
				
				output.write(sbs[13].toString());  
				
				output.close();  
				
				if (f1.exists()) {  
					System.out.print("文件存在");  
				} else {  
					System.out.print("文件不存在");  
					f1.createNewFile();// 不存在则创建
				}
				OutputStreamWriter write1 = new OutputStreamWriter(new FileOutputStream(f1),"utf-8");
				BufferedWriter output1=new BufferedWriter(write1);
				
				output1.write(sbs[10].toString());
				output1.write(sbs[3].toString());  
				output1.write(sbs[0].toString());   
				output1.write(sbs[1].toString()); 
				output1.write(sbs[11].toString());
				output1.write(detailMst[0].toString());  
				
				if (form.getPojoform().getFormDefIsProcess().equals("Y")) {
					output1.write(SysCardFormBeansUtil.getBuildCardForm6(form.getFormDefId()+"", ""));
				}
				output1.write(sbs[12].toString()); 
				output1.write(sbs[16].toString());//heightGadedata_;containerParam_;参数
				output1.write(sbs[17].toString());//$(function () {  开始
				output1.write(sbs[14].toString());
				
				output1.write(paramas[1].toString());//声明主表传出参数
				output1.write("function _initParamCard(){\n");
				output1.write(paramas[0].toString());//主表传出参数赋值
				output1.write("}\n");
				
				output1.write("function _initFollowCard(){\n");
				output1.write(detailMst[2].toString());//初始化副本数据
				output1.write("}\n");
				
				output1.write(detailMst[3].toString());//声明副表表单Id
				output1.write(sbs[18].toString());
				output1.write(sbs[19].toString());
				output1.write(sbs[2].toString());    
				//output1.write(sbs[4].toString());  
				output1.write(sbs[5].toString());
				output1.write(detailMst[1].toString());
				output1.write(sbs[6].toString());  
				output1.write(sbs[7].toString());  
				output1.write(sbs[8].toString());  
				output1.write(sbs[9].toString());  
//				output1.write(SysCardFormBeansUtil.RichText());
//				output1.write(sbs[5].toString()); 
					
				if (form.getPojoform().getFormDefIsProcess().equals("Y")) {
					output1.write(SysCardFormBeansUtil.getBuildCardForm7(form.getFormDefId()+"", ""));
				}
	
				output1.write(sbs[13].toString());  
				output1.close();
				
			} catch (Exception e) {  
				e.printStackTrace();logger.error(e.getMessage(),e);
			}  
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();logger.error(e.getMessage(),e);
		} 
		return null;
	}
	
	@Override
	public String buildFreeActForm(SysFormconfigCache form,SysRequestParam request,String isApp,ActNodePropertiesExpand actNodePropertiesExpand,String nodeId,String taskId,String isApp2) {
		try {
			//获取主表信息
			String mstFormId = String.valueOf(form.getFormDefId());
			SysFormconfigMstTabCache sMst= form.getMstTab();
			//通过主表Id获取html
			String mainFormId = sMst.getPojo().getMstTabMainFormId().toString();
			SysFormconfigCache mainform = sysformconfigService.getForm(mainFormId);
			List<SysFormconfigCache> formList = new ArrayList<SysFormconfigCache>();
			formList.add(mainform);
			StringBuffer[] sbs = mainform.showPage(request,"ACTFREE",actNodePropertiesExpand,"main",0);
			StringBuffer[] mainMst = mainform.showPage(request,"CARDANDCARD_MAIN",null,"main",0);
			SysGridbycardTemplateColumnExample example = new SysGridbycardTemplateColumnExample();
			example.or().andTemplateColumnFormDefIdEqualTo(Integer.valueOf(mainform.getFormDefId()+"")).andTemplateColumnTemplateIdEqualTo(Integer.valueOf(mainform.getPojoform().getExpand1()));
			example.setOrderByClause("TEMPLATE_COLUMN_ID");
			List<SysGridbycardTemplateColumn> sList = sTemplateColumnMapper.selectByExample(example);
			//获取附表信息
			String mstId = String.valueOf(sMst.getMstTabId());
			SysFormconfigMstTabDetailExample example2 = new SysFormconfigMstTabDetailExample();
			example2.or().andMstTabIdEqualTo(new BigDecimal(mstId));
			example2.setOrderByClause("TAB_DETAIL_SORT");
			List<SysFormconfigMstTabDetail> sDetailMsts= sysDetailMapper.selectByExample(example2);
			
			//获取参数表信息
			SysFormGeneralParamExample example3 = new SysFormGeneralParamExample();
			example3.or().andParamTypeValueEqualTo(new BigDecimal(mstFormId));
			List<SysFormGeneralParam> sysFormGeneralParams= sysFormGeneralParamMapper.selectByExample(example3);
			
			StringBuffer[] detailMst = detailCardAndCardHtml_ACT(sDetailMsts,request,form,taskId,nodeId,formList);
			StringBuffer[] paramas = paramaHtmlCardToCard(mainform,sysFormGeneralParams);
			String path11 = form.getFormTreePath();
			form.getPojoform().setFormSubmitUrl(path11+form.getPojoform().getFormDefCode()+".jsp");
			Map map = new HashMap();
			map.put("submitUrl", path11+form.getPojoform().getFormDefCode()+".jsp");
			map.put("formDefId", form.getFormDefId());
			sysFormconfigMapperExpand.updateSubmitUrl(map);
			logger.info(path11);
			//获取文件路径和文件名
			String path="C:/MyeHR/MyeHR_MSSQL/jsp/"+path11;
			String path1 =  request.getPath()+"\\"+path11;
			
			CreateFileUtil.createDir(path);
			CreateFileUtil.createDir(path1);
			
			try {  
				File f = new File(path+"/"+form.getPojoform().getFormDefCode()+".jsp");
				File f1 = new File(path1+"/"+form.getPojoform().getFormDefCode()+".jsp"); 
				File f3 = new File(path1+"/"+form.getPojoform().getFormDefCode()+".js"); 
				if (f3.exists()) {  
					System.out.print("文件存在");  
				} else {  
					System.out.print("文件不存在");  
					f3.createNewFile();// 不存在则创建
				}
				OutputStreamWriter write3 = new OutputStreamWriter(new FileOutputStream(f3),"utf-8");
				BufferedWriter output3=new BufferedWriter(write3);
				
				//流程标题解析方法
				output3.write(CardAndCardFormBeansUtil.getFunctionForTitle(form.getFormDefSaveTable(),mainform.getFormDefCode()).toString());
				
//				output3.write(detailMst[23].toString());
				output3.write(detailMst[6].toString());
				
				output3.write("var indexApprove;\n");
				
				output3.write(sbs[7].toString());//mainMst
				//output3.write(sbs[8].toString());
				output3.write(mainMst[3].toString());
				output3.write(detailMst[0].toString());
				output3.write(detailMst[2].toString());
				output3.write(detailMst[3].toString());
				
				output3.write(detailMst[4].toString());
				output3.write(detailMst[5].toString());
				output3.write(detailMst[7].toString());
				output3.write(detailMst[8].toString());
				output3.write(detailMst[9].toString());
				output3.write(detailMst[10].toString());
				output3.write(detailMst[11].toString());
				output3.write(detailMst[15].toString());
				output3.write(detailMst[16].toString());
				output3.close();  
				
				if (f.exists()) {  
					System.out.print("文件存在");  
				} else {  
					System.out.print("文件不存在");  
					f.createNewFile();// 不存在则创建
				}
				OutputStreamWriter write = new OutputStreamWriter(new FileOutputStream(f),"utf-8");
				BufferedWriter output=new BufferedWriter(write);
				output.write(CardAndCardFormBeansUtil.formCardAndCardHead1(form.getPojoform().getFormDefCode(),path11,isApp2).toString());
				if (form.getCardtocardConfig()!=null&&form.getCardtocardConfig().getIsDivLink().equals("Y")) {
					output.write("<div style=\"position:absolute;left:8%;z-index:999px\" id=\"maodianS\">\n"+
						 	     "<div style=\"position:absolute\">\n"+
						 	     "<a href=\"#"+mainform.getFormDefCode()+"\" class=\"maodianA\"><input type=\"text\" readonly class=\"maodian form-control\" value=\"置顶\"/></a>\n");
					output.write(detailMst[22].toString());
					if (form.getCardtocardConfig().getIsPrint().equals("Y")) {
						output.write("<input type=\"button\" class=\"btn btn-info\" value=\"打印\" onclick=\"initPrint()\"/>\n");
					}
					output.write("</div>\n");
					output.write("</div>\n");
					output.write("<div class=\"container-fluid\" id=\"CardAndCardForm\" style=\"height: 94%;overflow-y: auto;overflow-x:  hidden;padding: 0px;width:"+form.getCardtocardConfig().getMainWidth()+";\">\n");
				}else {
					if (form.getCardtocardConfig()!=null&&form.getCardtocardConfig().getIsPrint().equals("Y")) {
						output.write("<div style=\"position:absolute;left:8%;z-index:999px\" id=\"maodianS\">\n"+
							 	     "<div style=\"position:absolute\">\n"+
							 	     "<a href=\"#"+mainform.getFormDefCode()+"\" class=\"maodianA\"><input type=\"text\" readonly class=\"maodian form-control\" value=\"置顶\"/></a>\n");
						output.write(detailMst[22].toString());
						output.write("<input type=\"button\" class=\"btn btn-info\" value=\"打印\" onclick=\"initPrint()\"/>\n");
						output.write("</div>\n");
						output.write("</div>\n");
					}
					output.write("<div class=\"container-fluid\" id=\"CardAndCardForm\" style=\"height:98%;width:70%;overflow-y: auto;overflow-x:hidden;padding: 0px;float:left;\">\n");
				}
				
				output.write("<div class=\"row mainFormElement\" style=\"margin-left:0;padding: 0 15px 0 0;position:relative;\" id=\""+mainform.getFormDefCode()+"\">\n");
				output.write("<input type=\"button\" id=\"zhankai_main\"  class=\"btn btn-info CCButtonelement\" value=\"展开\" style=\"position:absolute;right:30px;bottom:10px;z-index:999\" onclick=\"showDate_Main(main_Datas,0,this)\"/>\n");
				output.write("</div>\n");
				output.write(detailMst[1].toString());
				output.write("</div>\n");
				output.write("<div class=\"container-fluid\" id=\"editPerson\" style=\"height:98%;width:29%;overflow-y: hidden;overflow-x:hidden;padding:0px;margin-top:1%;float:right;padding-bottom:50px;position:relative;\">\n");
				output.write("<h3 class=\"CCFubiaoTitle CCD_TITLE\">编辑流程路线</h3>\n");
				output.write("<div class=\"row \" style=\"margin-left:0;padding: 0 15px 0 0;position:relative;\" id=\"lineElement\">\n");
				output.write("</div>\n");
				output.write("<input type=\"button\" class=\"btn btn-info \" onclick=\"saveActLine()\" value=\"保存\" style=\"position:absolute;bottom:10px;left:50%;-webkit-transform: translate(-50%, -50%);\">\n");
				output.write("</div>\n");
				
				output.write(CardAndCardFormBeansUtil.formCardAndCardJsHead());
				output.write(detailMst[14].toString());
				output.write(sbs[30].toString());
				output.write(mainMst[70].toString());
				output.write("var param_empIds = '${param.empIds}';\n");
				output.write("var isApp = '${param.formType}';\n");
				output.write("var formId_main = '"+mainform.getPojoform().getFormDefId()+"';\n");
				output.write("var flowAction = '${param.flowAction}';\n");
				
				output.write("var actFree_taskId= '${param.taskId}';\n");
				output.write("var actFree_orderBy = \"${param.orderBy}\"\n");
				output.write("if(flowAction=='start'){\n");
				output.write("	actFree_orderBy = '0';\n");
				output.write("}else{\n");
				output.write("	actFree_orderBy = '${param.actFree_orderBy}';\n");
				output.write("}\n");
				
				output.write("$(document).ready(function () {\n");
				output.write("loadDataStart();\n");
				output.write("$(\"#zhankai_main\").click();\n");
				output.write(detailMst[17].toString());
				output.write(detailMst[12].toString());
				output.write(detailMst[18].toString());
				output.write(detailMst[19].toString());
				output.write(detailMst[20].toString());
				output.write("showFreeActLines();\n");
				output.write("changeFileCss();\n");
				output.write(form.getPojoform().getFormDefInitQzJs()+"\n");
//				output.write("$(\"#zhankaiComment\").click();\n");
				output.write("})\n");
				output.write(detailMst[21].toString());
				output.write(sbs[40].toString());
				output.write(sbs[55].toString());
				output.write(detailMst[13].toString());
				output.write(sbs[8].toString());
				output.write(SysGridFormBeansUtil.formGridByCardFunction1());
				output.write(SysGridFormBeansUtil.getEmpPhotoSYS());
				output.write(SysGridFormBeansUtil.formGridByCardFunction5());
				output.write(SysGridFormBeansUtil.formGridByCardFunction2_x(mainform.getFormDefId()+"",mainform.getFormDefCode(),paramas[1].toString()));
				output.write(SysGridFormBeansUtil.formGridByCardFunction3(sList,mainform));
				output.write(CardAndCardFormBeansUtil.endFunction());
				output.write(CardAndCardFormBeansUtil.showDate_MainJsForCC1());
				output.write(CardAndCardFormBeansUtil.showDate_MainJsForCC2_ACT(mainMst[60], mainMst[0], mainform.getPojoform().getFormDefId()+"",mainMst[2],mainMst[4]));
				output.write(mainMst[67].toString());
				output.write(CardAndCardFormBeansUtil.endFunction());
				output.write("</script>\n</body>\n</html>");
				output.close();  
				if (f1.exists()) {  
					System.out.print("文件存在");  
				} else {  
					System.out.print("文件不存在");  
					f1.createNewFile();// 不存在则创建
				}
				OutputStreamWriter write1 = new OutputStreamWriter(new FileOutputStream(f1),"utf-8");
				BufferedWriter output1=new BufferedWriter(write1);
				output1.write(CardAndCardFormBeansUtil.formCardAndCardHead1(form.getPojoform().getFormDefCode(),path11,isApp2).toString());
				if (form.getCardtocardConfig()!=null&&form.getCardtocardConfig().getIsDivLink().equals("Y")) {
					output1.write("<div style=\"position:absolute;left:8%;z-index:999px\" id=\"maodianS\">\n"+
						 	      "<div style=\"position:absolute\">\n"+
						 	      "<a href=\"#"+mainform.getFormDefCode()+"\" class=\"maodianA\"><input type=\"text\" readonly class=\"maodian form-control\" value=\"置顶\"/></a>\n");
					output1.write(detailMst[22].toString());
					if (form.getCardtocardConfig().getIsPrint().equals("Y")) {
						output1.write("<input type=\"button\" class=\"btn btn-info\" value=\"打印\" onclick=\"initPrint()\"/>\n");
					}
					output1.write("</div>\n");
					output1.write("</div>\n");
					output1.write("<div class=\"container-fluid\" id=\"CardAndCardForm\" style=\"height: 94%;overflow-y: auto;overflow-x:  hidden;padding: 0px;width:"+form.getCardtocardConfig().getMainWidth()+";\">\n");
				}else {
					if (form.getCardtocardConfig()!=null&&form.getCardtocardConfig().getIsPrint().equals("Y")) {
						output1.write("<div style=\"position:absolute;left:8%;z-index:999px\" id=\"maodianS\">\n"+
							 	      "<div style=\"position:absolute\">\n"+
							 	      "<a href=\"#"+mainform.getFormDefCode()+"\" class=\"maodianA\"><input type=\"text\" readonly class=\"maodian form-control\" value=\"置顶\"/></a>\n");
						output1.write(detailMst[22].toString());
						output1.write("<input type=\"button\" class=\"btn btn-info\" value=\"打印\" onclick=\"initPrint()\"/>\n");
						output1.write("</div>\n");
						output1.write("</div>\n");
					}
					output1.write("<div class=\"container-fluid\" id=\"CardAndCardForm\" style=\"height:98%;width:70%;overflow-y: auto;overflow-x:hidden;padding: 0px;float:left;\">\n");
				}
				
				output1.write("<div class=\"row mainFormElement\" style=\"margin-left:0;padding: 0 15px 0 0;position:relative;\" id=\""+mainform.getFormDefCode()+"\">\n");
				output1.write("<input type=\"button\" id=\"zhankai_main\"  class=\"btn btn-info CCButtonelement\" value=\"展开\" style=\"position:absolute;right:30px;bottom:10px;z-index:999\" onclick=\"showDate_Main(main_Datas,0,this)\"/>\n");
				output1.write("</div>\n");
				output1.write(detailMst[1].toString());

				output1.write("</div>\n");
				output1.write("<div class=\"container-fluid\" id=\"editPerson\" style=\"height:98%;width:29%;overflow-y: hidden;overflow-x:hidden;padding:0px;margin-top:1%;float:right;padding-bottom:50px;position:relative;\">\n");
				output1.write("<h3 class=\"CCFubiaoTitle CCD_TITLE\">编辑流程路线<span id=\"baocun\" class=\"fa fa-floppy-o CCD_TITLE_BUTTON\" onclick=\"saveFreeLines()\" title=\"保存\" style=\"margin-left:10px\"></span></h3>\n");
				output1.write("<div class=\"row \" style=\"margin-left:0;padding: 0 15px 0 0;position:relative;height:100%;overflow:auto\" id=\"lineElement\">\n");
				output1.write("</div>\n");
				output1.write("</div>\n");
				output1.write(CardAndCardFormBeansUtil.formCardAndCardJsHead());
				output1.write(detailMst[14].toString());
				output1.write(sbs[30].toString());
				output1.write(mainMst[70].toString());
				output1.write("var param_empIds = '${param.empIds}';\n");
				output1.write("var isApp = '${param.formType}';\n");
				
				output1.write("var param_flowAction = '${param.flowAction}';\n");
				output1.write("var param_key = '${param.key}';\n");
				output1.write("var param_taskId = '${param.taskId}';\n");
				output1.write("var param_procInsId = '${param.procInsId}';\n");
				
				
				output1.write("var formId_main = '"+mainform.getPojoform().getFormDefId()+"';\n");

				output1.write("var flowAction = '${param.flowAction}';\n");
				output1.write("var BUSSINESSID_ACT = '${param.businessId}';\n");
				
				output1.write("var actFree_taskId= '${param.taskId}';\n");
				output1.write("var actFree_orderBy = \"\";\n");
				output1.write("var titleModel = \""+form.getPojoform().getFormDefSavetable()+"\";\n");
				output1.write("if(flowAction=='start'){\n");
				output1.write("	actFree_orderBy = '0';\n");
				output1.write("}else{\n");
				output1.write("	actFree_orderBy = '${param.orderBy}';\n");
				output1.write("}\n");
				
				output1.write("$(document).ready(function () {\n");
				output1.write("loadDataStart();\n");
				output1.write("$(\"#zhankai_main\").click();\n");
				output1.write(detailMst[17].toString());
				output1.write(detailMst[12].toString());
				output1.write(detailMst[18].toString());
				output1.write(detailMst[19].toString());
				output1.write(detailMst[20].toString());
//				output1.write("$(\"#zhankaiComment\").click();\n");
				output1.write("showFreeActLines();\n");
				output1.write("changeFileCss();\n");
				if (isApp2!=null&&isApp2.equals("APP")) {
					output1.write("changeCssForApp1();\n");
				}
				output1.write(form.getPojoform().getFormDefInitQzJs()+"\n");
				if (isApp2!=null&&isApp2.equals("APP")) {
					output1.write("window.parent.postMessage('1','*');\n");
				}
				output1.write("})\n");
				output1.write(detailMst[21].toString());
				output1.write(sbs[40].toString());
				output1.write(sbs[55].toString());
				output1.write(detailMst[13].toString());
				output1.write(sbs[8].toString());
				output1.write(SysGridFormBeansUtil.formGridByCardFunction1());
				output1.write(SysGridFormBeansUtil.getEmpPhotoSYS());
				output1.write(SysGridFormBeansUtil.formGridByCardFunction5());
				output1.write(SysGridFormBeansUtil.formGridByCardFunction2_x(mainform.getFormDefId()+"",mainform.getFormDefCode(),paramas[1].toString()));
				output1.write(SysGridFormBeansUtil.formGridByCardFunction3(sList,mainform));
				output1.write(paramas[1].toString());
				output1.write(CardAndCardFormBeansUtil.endFunction());
				output1.write(CardAndCardFormBeansUtil.showDate_MainJsForCC1());
				output1.write(CardAndCardFormBeansUtil.showDate_MainJsForCC2_ACT(mainMst[60], mainMst[0], mainform.getPojoform().getFormDefId()+"",mainMst[2],mainMst[4]));
				output1.write(mainMst[67].toString());
				output1.write(CardAndCardFormBeansUtil.endFunction());
				output1.write("</script>\n</body>\n</html>");
				output1.close();
			} catch (Exception e) {  
				e.printStackTrace();logger.error(e.getMessage(),e);
			}  
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();logger.error(e.getMessage(),e);
		} 
		return null;
	}
	
	@Override
	public String buildFreeActForm2(SysFormconfigCache form,SysRequestParam request,String isApp,ActNodePropertiesExpand actNodePropertiesExpand,String nodeId,String taskId,String isApp2) {
		try {
			//获取主表信息
			String mstFormId = String.valueOf(form.getFormDefId());
			SysFormconfigMstTabCache sMst= form.getMstTab();
			//通过主表Id获取html
			String mainFormId = sMst.getPojo().getMstTabMainFormId().toString();
			SysFormconfigCache mainform = sysformconfigService.getForm(mainFormId);
			List<SysFormconfigCache> formList = new ArrayList<SysFormconfigCache>();
			formList.add(mainform);
			StringBuffer[] sbs = mainform.showPage(request,"ACTFREE",actNodePropertiesExpand,"main",0);
			StringBuffer[] mainMst = mainform.showPage(request,"CARDANDCARD_MAIN",null,"main",0);
			SysGridbycardTemplateColumnExample example = new SysGridbycardTemplateColumnExample();
			example.or().andTemplateColumnFormDefIdEqualTo(Integer.valueOf(mainform.getFormDefId()+"")).andTemplateColumnTemplateIdEqualTo(Integer.valueOf(mainform.getPojoform().getExpand1()));
			example.setOrderByClause("TEMPLATE_COLUMN_ID");
			List<SysGridbycardTemplateColumn> sList = sTemplateColumnMapper.selectByExample(example);
			//获取附表信息
			String mstId = String.valueOf(sMst.getMstTabId());
			SysFormconfigMstTabDetailExample example2 = new SysFormconfigMstTabDetailExample();
			example2.or().andMstTabIdEqualTo(new BigDecimal(mstId));
			example2.setOrderByClause("TAB_DETAIL_SORT");
			List<SysFormconfigMstTabDetail> sDetailMsts= sysDetailMapper.selectByExample(example2);
			
			//获取参数表信息
			SysFormGeneralParamExample example3 = new SysFormGeneralParamExample();
			example3.or().andParamTypeValueEqualTo(new BigDecimal(mstFormId));
			List<SysFormGeneralParam> sysFormGeneralParams= sysFormGeneralParamMapper.selectByExample(example3);
			
			StringBuffer[] detailMst = detailCardAndCardHtml_ACT(sDetailMsts,request,form,taskId,nodeId,formList);
			StringBuffer[] paramas = paramaHtmlCardToCard(mainform,sysFormGeneralParams);
			String path11 = form.getFormTreePath();
			form.getPojoform().setFormSubmitUrl(path11+form.getPojoform().getFormDefCode()+".jsp");
			Map map = new HashMap();
			map.put("submitUrl", path11+form.getPojoform().getFormDefCode()+".jsp");
			map.put("formDefId", form.getFormDefId());
			sysFormconfigMapperExpand.updateSubmitUrl(map);
			logger.info(path11);
			//获取文件路径和文件名
			String path="C:/MyeHR/MyeHR_MSSQL/jsp/"+path11;
			String path1 =  request.getPath()+"\\"+path11;
			
			CreateFileUtil.createDir(path);
			CreateFileUtil.createDir(path1);
			
			try {  
				File f = new File(path+"/"+form.getPojoform().getFormDefCode()+".jsp");
				File f1 = new File(path1+"/"+form.getPojoform().getFormDefCode()+".jsp"); 
				File f3 = new File(path1+"/"+form.getPojoform().getFormDefCode()+".js"); 
				if (f3.exists()) {  
					System.out.print("文件存在");  
				} else {  
					System.out.print("文件不存在");  
					f3.createNewFile();// 不存在则创建
				}
				OutputStreamWriter write3 = new OutputStreamWriter(new FileOutputStream(f3),"utf-8");
				BufferedWriter output3=new BufferedWriter(write3);
				output3.write(detailMst[23].toString());
				output3.write(detailMst[6].toString());
				
				output3.write("var indexApprove;\n");
				
				output3.write(sbs[7].toString());//mainMst
				//output3.write(sbs[8].toString());
				output3.write(mainMst[3].toString());
				output3.write(detailMst[0].toString());
				output3.write(detailMst[2].toString());
				output3.write(detailMst[3].toString());
				
				output3.write(detailMst[4].toString());
				output3.write(detailMst[5].toString());
				output3.write(detailMst[7].toString());
				output3.write(detailMst[8].toString());
				output3.write(detailMst[9].toString());
				output3.write(detailMst[10].toString());
				output3.write(detailMst[11].toString());
				output3.write(detailMst[15].toString());
				output3.write(detailMst[16].toString());
				output3.close();  
				if (f.exists()) {  
					System.out.print("文件存在");  
				} else {  
					System.out.print("文件不存在");  
					f.createNewFile();// 不存在则创建
				}
				OutputStreamWriter write = new OutputStreamWriter(new FileOutputStream(f),"utf-8");
				BufferedWriter output=new BufferedWriter(write);
				output.write(CardAndCardFormBeansUtil.formCardAndCardHead1(form.getPojoform().getFormDefCode(),path11,isApp2).toString());
				if (form.getCardtocardConfig()!=null&&form.getCardtocardConfig().getIsDivLink().equals("Y")) {
					output.write("<div style=\"position:absolute;left:8%;z-index:999px\" id=\"maodianS\">\n"+
						 	     "<div style=\"position:absolute\">\n"+
						 	     "<a href=\"#"+mainform.getFormDefCode()+"\" class=\"maodianA\"><input type=\"text\" readonly class=\"maodian form-control\" value=\"置顶\"/></a>\n");
					output.write(detailMst[22].toString());
					if (form.getCardtocardConfig().getIsPrint().equals("Y")) {
						output.write("<input type=\"button\" class=\"btn btn-info\" value=\"打印\" onclick=\"initPrint()\"/>\n");
					}
					output.write("</div>\n");
					output.write("</div>\n");
					output.write("<div class=\"container-fluid\" id=\"CardAndCardForm\" style=\"height: 94%;overflow-y: auto;overflow-x:  hidden;padding: 0px;width:"+form.getCardtocardConfig().getMainWidth()+";\">\n");
				}else {
					if (form.getCardtocardConfig()!=null&&form.getCardtocardConfig().getIsPrint().equals("Y")) {
						output.write("<div style=\"position:absolute;left:8%;z-index:999px\" id=\"maodianS\">\n"+
							 	     "<div style=\"position:absolute\">\n"+
							 	     "<a href=\"#"+mainform.getFormDefCode()+"\" class=\"maodianA\"><input type=\"text\" readonly class=\"maodian form-control\" value=\"置顶\"/></a>\n");
						output.write(detailMst[22].toString());
						output.write("<input type=\"button\" class=\"btn btn-info\" value=\"打印\" onclick=\"initPrint()\"/>\n");
						output.write("</div>\n");
						output.write("</div>\n");
					}
					output.write("<div class=\"container-fluid\" id=\"CardAndCardForm\" style=\"height:98%;width:70%;overflow-y: auto;overflow-x:hidden;padding: 0px;float:left;\">\n");
				}
				
				output.write("<div class=\"row mainFormElement\" style=\"margin-left:0;padding: 0 15px 0 0;position:relative;\" id=\""+mainform.getFormDefCode()+"\">\n");
				output.write("<input type=\"button\" id=\"zhankai_main\"  class=\"btn btn-info CCButtonelement\" value=\"展开\" style=\"position:absolute;right:30px;bottom:10px;z-index:999\" onclick=\"showDate_Main(main_Datas,0,this)\"/>\n");
				output.write("</div>\n");
				output.write(detailMst[1].toString());
				output.write("</div>\n");
				output.write("<div class=\"container-fluid\" id=\"editPerson\" style=\"height:98%;width:29%;overflow-y: hidden;overflow-x:hidden;padding:0px;margin-top:1%;float:right;padding-bottom:50px;position:relative;\">\n");
				output.write("<h3 class=\"CCFubiaoTitle CCD_TITLE\">编辑流程路线</h3>\n");
				output.write("<div class=\"row \" style=\"margin-left:0;padding: 0 15px 0 0;position:relative;\" id=\"lineElement\">\n");
				output.write("</div>\n");
				output.write("<input type=\"button\" class=\"btn btn-info \" onclick=\"saveActLine()\" value=\"保存\" style=\"position:absolute;bottom:10px;left:50%;-webkit-transform: translate(-50%, -50%);\">\n");
				output.write("</div>\n");
				
				output.write(CardAndCardFormBeansUtil.formCardAndCardJsHead());
				output.write(detailMst[14].toString());
				output.write(sbs[30].toString());
				output.write(mainMst[70].toString());
				output.write("var param_empIds = '${param.empIds}';\n");
				output.write("var isApp = '${param.formType}';\n");
				output.write("var formId_main = '"+mainform.getPojoform().getFormDefId()+"';\n");
				output.write("var flowAction = '${param.flowAction}';\n");
				
				output.write("var actFree_taskId= '${param.taskId}';\n");
				output.write("var actFree_orderBy = \"${param.orderBy}\"\n");
				output.write("if(flowAction=='start'){\n");
				output.write("	actFree_orderBy = '0';\n");
				output.write("}else{\n");
				output.write("	actFree_orderBy = '${param.actFree_orderBy}';\n");
				output.write("}\n");
				
				output.write("$(document).ready(function () {\n");
				output.write("loadDataStart();\n");
				output.write("$(\"#zhankai_main\").click();\n");
				output.write(detailMst[17].toString());
				output.write(detailMst[12].toString());
				output.write(detailMst[18].toString());
				output.write(detailMst[19].toString());
				output.write(detailMst[20].toString());
				output.write("showFreeActLines();\n");
				output.write("changeFileCss();\n");
				output.write(form.getPojoform().getFormDefInitQzJs()+"\n");
//				output.write("$(\"#zhankaiComment\").click();\n");
				output.write("})\n");
				output.write(detailMst[21].toString());
				output.write(sbs[40].toString());
				output.write(sbs[55].toString());
				output.write(detailMst[13].toString());
				output.write(sbs[8].toString());
				output.write(SysGridFormBeansUtil.formGridByCardFunction1());
				output.write(SysGridFormBeansUtil.getEmpPhotoSYS());
				output.write(SysGridFormBeansUtil.formGridByCardFunction5());
				output.write(SysGridFormBeansUtil.formGridByCardFunction2_x(mainform.getFormDefId()+"",mainform.getFormDefCode(),paramas[1].toString()));
				output.write(SysGridFormBeansUtil.formGridByCardFunction3(sList,mainform));
				output.write(CardAndCardFormBeansUtil.endFunction());
				output.write(CardAndCardFormBeansUtil.showDate_MainJsForCC1());
				output.write(CardAndCardFormBeansUtil.showDate_MainJsForCC2_ACT(mainMst[60], mainMst[0], mainform.getPojoform().getFormDefId()+"",mainMst[2],mainMst[4]));
				output.write(mainMst[67].toString());
				output.write(CardAndCardFormBeansUtil.endFunction());
				output.write("</script>\n</body>\n</html>");
				output.close();  
				if (f1.exists()) {  
					System.out.print("文件存在");  
				} else {  
					System.out.print("文件不存在");  
					f1.createNewFile();// 不存在则创建
				}
				OutputStreamWriter write1 = new OutputStreamWriter(new FileOutputStream(f1),"utf-8");
				BufferedWriter output1=new BufferedWriter(write1);
				output1.write(CardAndCardFormBeansUtil.formCardAndCardHead1(form.getPojoform().getFormDefCode(),path11,isApp2).toString());
				if (form.getCardtocardConfig()!=null&&form.getCardtocardConfig().getIsDivLink().equals("Y")) {
					output1.write("<div style=\"position:absolute;left:8%;z-index:999px\" id=\"maodianS\">\n"+
						 	      "<div style=\"position:absolute\">\n"+
						 	      "<a href=\"#"+mainform.getFormDefCode()+"\" class=\"maodianA\"><input type=\"text\" readonly class=\"maodian form-control\" value=\"置顶\"/></a>\n");
					output1.write(detailMst[22].toString());
					if (form.getCardtocardConfig().getIsPrint().equals("Y")) {
						output1.write("<input type=\"button\" class=\"btn btn-info\" value=\"打印\" onclick=\"initPrint()\"/>\n");
					}
					output1.write("</div>\n");
					output1.write("</div>\n");
					output1.write("<div class=\"container-fluid\" id=\"CardAndCardForm\" style=\"height: 94%;overflow-y: auto;overflow-x:  hidden;padding: 0px;width:"+form.getCardtocardConfig().getMainWidth()+";\">\n");
				}else {
					if (form.getCardtocardConfig()!=null&&form.getCardtocardConfig().getIsPrint().equals("Y")) {
						output1.write("<div style=\"position:absolute;left:8%;z-index:999px\" id=\"maodianS\">\n"+
							 	      "<div style=\"position:absolute\">\n"+
							 	      "<a href=\"#"+mainform.getFormDefCode()+"\" class=\"maodianA\"><input type=\"text\" readonly class=\"maodian form-control\" value=\"置顶\"/></a>\n");
						output1.write(detailMst[22].toString());
						output1.write("<input type=\"button\" class=\"btn btn-info\" value=\"打印\" onclick=\"initPrint()\"/>\n");
						output1.write("</div>\n");
						output1.write("</div>\n");
					}
					output1.write("<div class=\"container-fluid\" id=\"CardAndCardForm\" style=\"height:98%;width:70%;overflow-y: auto;overflow-x:hidden;padding: 0px;float:left;\">\n");
				}
				
				output1.write("<div class=\"row mainFormElement\" style=\"margin-left:0;padding: 0 15px 0 0;position:relative;\" id=\""+mainform.getFormDefCode()+"\">\n");
				output1.write("<input type=\"button\" id=\"zhankai_main\"  class=\"btn btn-info CCButtonelement\" value=\"展开\" style=\"position:absolute;right:30px;bottom:10px;z-index:999\" onclick=\"showDate_Main(main_Datas,0,this)\"/>\n");
				output1.write("</div>\n");
				output1.write(detailMst[23].toString());

				output1.write("</div>\n");
				output1.write("<div class=\"container-fluid\" id=\"editPerson\" style=\"height:98%;width:29%;overflow-y: hidden;overflow-x:hidden;padding:0px;margin-top:1%;float:right;padding-bottom:50px;position:relative;\">\n");
				output1.write("<h3 class=\"CCFubiaoTitle CCD_TITLE\">流程审批历史</h3>\n");
				output1.write("<div class=\"row \" style=\"margin-left:0;padding: 0 15px 0 0;position:relative;height:100%;overflow:auto\" id=\"hisComment\">\n");
				output1.write("</div>\n");
				output1.write("</div>\n");
				output1.write(CardAndCardFormBeansUtil.formCardAndCardJsHead());
				output1.write(detailMst[14].toString());
				output1.write(sbs[30].toString());
				output1.write(mainMst[70].toString());
				output1.write("var param_empIds = '${param.empIds}';\n");
				output1.write("var isApp = '${param.formType}';\n");
				
				output1.write("var param_flowAction = '${param.flowAction}';\n");
				output1.write("var param_key = '${param.key}';\n");
				output1.write("var param_taskId = '${param.taskId}';\n");
				output1.write("var param_procInsId = '${param.procInsId}';\n");
				
				
				output1.write("var formId_main = '"+mainform.getPojoform().getFormDefId()+"';\n");

				output1.write("var flowAction = '${param.flowAction}';\n");
				output1.write("var BUSSINESSID_ACT = '${param.businessId}';\n");
				
				output1.write("var actFree_taskId= '${param.taskId}';\n");
				output1.write("var actFree_orderBy = \"\";\n");
				output1.write("if(flowAction=='start'){\n");
				output1.write("	actFree_orderBy = '0';\n");
				output1.write("}else{\n");
				output1.write("	actFree_orderBy = '${param.orderBy}';\n");
				output1.write("}\n");
				
				output1.write("$(document).ready(function () {\n");
				output1.write("loadDataStart();\n");
				output1.write("$(\"#zhankai_main\").click();\n");
				output1.write(detailMst[17].toString());
				output1.write(detailMst[12].toString());
				output1.write(detailMst[18].toString());
				output1.write(detailMst[19].toString());
				output1.write(detailMst[20].toString());
				output1.write("showComment();\n");
				output1.write("if(flowAction!='start'){\n");
				output1.write("	  changeReadonly(\"MainElement\");\n");//修改文本框
				output1.write("}\n");
//				output1.write("showFreeActLines();\n");
				output1.write("changeFileCss();\n");
				if (isApp2!=null&&isApp2.equals("APP")) {
					output1.write("changeCssForApp1();\n");
				}
				output1.write(form.getPojoform().getFormDefInitQzJs()+"\n");
				if (isApp2!=null&&isApp2.equals("APP")) {
					output1.write("window.parent.postMessage('1','*');\n");
				}
				output1.write("})\n");
				output1.write(detailMst[21].toString());
				output1.write(sbs[40].toString());
				output1.write(sbs[55].toString());
				output1.write(detailMst[13].toString());
				output1.write(sbs[8].toString());
				output1.write(SysGridFormBeansUtil.formGridByCardFunction1());
				output1.write(SysGridFormBeansUtil.getEmpPhotoSYS());
				output1.write(SysGridFormBeansUtil.formGridByCardFunction5());
				output1.write(SysGridFormBeansUtil.formGridByCardFunction2_x(mainform.getFormDefId()+"",mainform.getFormDefCode(),paramas[1].toString()));
				output1.write(SysGridFormBeansUtil.formGridByCardFunction3(sList,mainform));
				output1.write(paramas[1].toString());
				output1.write(CardAndCardFormBeansUtil.endFunction());
				output1.write(CardAndCardFormBeansUtil.showDate_MainJsForCC1());
				output1.write(CardAndCardFormBeansUtil.showDate_MainJsForCC2_ACT(mainMst[60], mainMst[0], mainform.getPojoform().getFormDefId()+"",mainMst[2],mainMst[4]));
				output1.write(mainMst[67].toString());
				output1.write(CardAndCardFormBeansUtil.endFunction());
				output1.write("</script>\n</body>\n</html>");
				output1.close();
			} catch (Exception e) {  
				e.printStackTrace();logger.error(e.getMessage(),e);
			}  
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();logger.error(e.getMessage(),e);
		} 
		return null;
	}
	
	@Override
	public String buildCardAndCardForm2_ACT(SysFormconfigCache form,SysRequestParam request,String isApp,ActNodePropertiesExpand actNodePropertiesExpand,String nodeId,String taskId,String isApp2) {
		// TODO Auto-generated method stub
		try {
//			StringBuffer[] sbs = form.showPage(request);
			String userId = request.getSession().getAttribute("userid")+"";
			//获取主表信息
			String mstFormId = String.valueOf(form.getFormDefId());
			SysFormconfigMstTabCache sMst= form.getMstTab();
			//通过主表Id获取html
			String mainFormId = sMst.getPojo().getMstTabMainFormId().toString();
			SysFormconfigCache mainform = sysformconfigService.getForm(mainFormId);
			List<SysFormconfigCache> formList = new ArrayList<SysFormconfigCache>();
			formList.add(mainform);
			StringBuffer[] sbs = mainform.showPage(request,"",actNodePropertiesExpand,"main",0);
			StringBuffer[] mainMst = mainform.showPage(request,"CARDANDCARD_MAIN",null,"main",0);
			SysGridbycardTemplateColumnExample example = new SysGridbycardTemplateColumnExample();
			example.or().andTemplateColumnFormDefIdEqualTo(Integer.valueOf(mainform.getFormDefId()+"")).andTemplateColumnTemplateIdEqualTo(Integer.valueOf(mainform.getPojoform().getExpand1()));
			example.setOrderByClause("TEMPLATE_COLUMN_ID");
			List<SysGridbycardTemplateColumn> sList = sTemplateColumnMapper.selectByExample(example);
			//获取附表信息
			String mstId = String.valueOf(sMst.getMstTabId());
			SysFormconfigMstTabDetailExample example2 = new SysFormconfigMstTabDetailExample();
			example2.or().andMstTabIdEqualTo(new BigDecimal(mstId));
			example2.setOrderByClause("TAB_DETAIL_SORT");
			List<SysFormconfigMstTabDetail> sDetailMsts= sysDetailMapper.selectByExample(example2);
			
			//获取参数表信息
			SysFormGeneralParamExample example3 = new SysFormGeneralParamExample();
			example3.or().andParamTypeValueEqualTo(new BigDecimal(mstFormId));
			List<SysFormGeneralParam> sysFormGeneralParams= sysFormGeneralParamMapper.selectByExample(example3);
			
			StringBuffer[] expands = expandHtml(sMst);
			StringBuffer[] detailMst = detailCardAndCardHtml_ACT(sDetailMsts,request,form,taskId,nodeId,formList);
			StringBuffer[] paramas = paramaHtmlCardToCard(mainform,sysFormGeneralParams);
//			String path11 = findSysFormFolderTreeById(form.getPojoform().getFormDefFolderId().intValue(),"");
			String path11 = form.getFormTreePath();
			form.getPojoform().setFormSubmitUrl(path11+form.getPojoform().getFormDefCode()+".jsp");
//			sysFormconfigMapper.updateByPrimaryKeyWithBLOBs(form.getPojoform());
			Map map = new HashMap();
			map.put("submitUrl", path11+form.getPojoform().getFormDefCode()+".jsp");
			map.put("formDefId", form.getFormDefId());
			sysFormconfigMapperExpand.updateSubmitUrl(map);
			logger.info(path11);
			//获取文件路径和文件名
			String path="C:/MyeHR/MyeHR_MSSQL/jsp/"+path11;
			String path1 =  request.getPath()+"\\"+path11;
			
			CreateFileUtil.createDir(path);
			CreateFileUtil.createDir(path1);
			
			try {  
				File f = new File(path+"/"+form.getPojoform().getFormDefCode()+".jsp");
				File f1 = new File(path1+"/"+form.getPojoform().getFormDefCode()+".jsp"); 
				File f3 = new File(path1+"/"+form.getPojoform().getFormDefCode()+".js"); 
				if (f3.exists()) {  
					System.out.print("文件存在");  
				} else {  
					System.out.print("文件不存在");  
					f3.createNewFile();// 不存在则创建
				}
				OutputStreamWriter write3 = new OutputStreamWriter(new FileOutputStream(f3),"utf-8");
				BufferedWriter output3=new BufferedWriter(write3);
			// output3.write(detailMst[25].toString());
				output3.write(detailMst[6].toString());
				
				output3.write("var indexApprove;\n");
				
				output3.write(sbs[7].toString());//mainMst
				//output3.write(sbs[8].toString());
				output3.write(mainMst[3].toString());
				output3.write(detailMst[0].toString());
				output3.write(detailMst[2].toString());
				output3.write(detailMst[3].toString());
				
				output3.write(detailMst[4].toString());
				output3.write(detailMst[5].toString());
				output3.write(detailMst[7].toString());
				output3.write(detailMst[8].toString());
				output3.write(detailMst[9].toString());
				output3.write(detailMst[10].toString());
				output3.write(detailMst[11].toString());
				output3.write(detailMst[15].toString());
				output3.write(detailMst[16].toString());
				output3.close();  
				
				if (f.exists()) {  
					System.out.print("文件存在");  
				} else {  
					System.out.print("文件不存在");  
					f.createNewFile();// 不存在则创建
				}
				OutputStreamWriter write = new OutputStreamWriter(new FileOutputStream(f),"utf-8");
				BufferedWriter output=new BufferedWriter(write);
				output.write(CardAndCardFormBeansUtil.formCardAndCardHead1(form.getPojoform().getFormDefCode(),path11,isApp2).toString());
				if (form.getCardtocardConfig()!=null&&form.getCardtocardConfig().getIsDivLink().equals("Y")) {
					output.write("<div style=\"position:absolute;left:8%;z-index:999px\" id=\"maodianS\">\n"+
						 	     "<div style=\"position:absolute\">\n"+
						 	     "<a href=\"#"+mainform.getFormDefCode()+"\" class=\"maodianA\"><input type=\"text\" readonly class=\"maodian form-control\" value=\"置顶\"/></a>\n");
					output.write(detailMst[22].toString());
					if (form.getCardtocardConfig().getIsPrint().equals("Y")) {
						output.write("<input type=\"button\" class=\"btn btn-info\" value=\"打印\" onclick=\"initPrint()\"/>\n");
					}
					output.write("</div>\n");
					output.write("</div>\n");
					output.write("<div class=\"container-fluid\" id=\"CardAndCardForm\" style=\"height: 94%;overflow-y: auto;overflow-x:  hidden;padding: 0px;width:"+form.getCardtocardConfig().getMainWidth()+";\">\n");
				}else {
					if (form.getCardtocardConfig()!=null&&form.getCardtocardConfig().getIsPrint().equals("Y")) {
						output.write("<div style=\"position:absolute;left:8%;z-index:999px\" id=\"maodianS\">\n"+
							 	     "<div style=\"position:absolute\">\n"+
							 	     "<a href=\"#"+mainform.getFormDefCode()+"\" class=\"maodianA\"><input type=\"text\" readonly class=\"maodian form-control\" value=\"置顶\"/></a>\n");
						output.write(detailMst[22].toString());
						output.write("<input type=\"button\" class=\"btn btn-info\" value=\"打印\" onclick=\"initPrint()\"/>\n");
						output.write("</div>\n");
						output.write("</div>\n");
					}
					output.write("<div class=\"container-fluid\" id=\"CardAndCardForm\" style=\"height: 94%;overflow-y: auto;overflow-x:  hidden;padding: 0px;\">\n");
				}
				
				output.write("<div class=\"row mainFormElement\" style=\"margin-left:0;padding: 0 15px 0 0;position:relative;\" id=\""+mainform.getFormDefCode()+"\">\n");
				output.write("<input type=\"button\" id=\"zhankai\"  class=\"btn btn-info CCButtonelement\" value=\"展开\" style=\"position:absolute;right:30px;bottom:10px;z-index:999\" onclick=\"showDate_Main(main_Datas,0,0)\"/>\n");
				output.write("</div>\n");
				
				output.write(detailMst[1].toString());
				output.write("</div>\n");
				output.write(CardAndCardFormBeansUtil.formCardAndCardJsHead());
				output.write(detailMst[14].toString());
				output.write(sbs[30].toString());
				output.write(mainMst[70].toString());
				output.write("var param_empIds = '${param.empIds}';\n");
				output.write("var isApp = '${param.formType}';\n");
				output.write("var formId_main = '"+mainform.getPojoform().getFormDefId()+"';\n");
				output.write("var flowAction = '${param.flowAction}';\n");
				output.write("var BUSSINESSID_ACT = '${param.businessId}';\n");
				output.write("$(document).ready(function () {\n");
				output.write("loadDataStart();\n");
				output.write("$(\"#zhankai_main\").click();\n");
				output.write(detailMst[17].toString());
				output.write(detailMst[12].toString());
				output.write(detailMst[18].toString());
				output.write(detailMst[19].toString());
				output.write(detailMst[20].toString());
				output.write("changeFileCss();\n");
			  //output.write(form.getPojoform().getFormDefInitQzJs()+"\n");
				output.write("$(\"#zhankaiComment\").click();\n");
				output.write("})\n");
				output.write(detailMst[21].toString());
				output.write(sbs[40].toString());
				output.write(sbs[55].toString());
				output.write(detailMst[13].toString());
				output.write(sbs[8].toString());
				output.write(SysGridFormBeansUtil.formGridByCardFunction1());
				output.write(SysGridFormBeansUtil.getEmpPhotoSYS());
				output.write(SysGridFormBeansUtil.formGridByCardFunction5());
				output.write(SysGridFormBeansUtil.formGridByCardFunction2_x(mainform.getFormDefId()+"",mainform.getFormDefCode(),paramas[1].toString()));
				output.write(SysGridFormBeansUtil.formGridByCardFunction3(sList,mainform));
				output.write(CardAndCardFormBeansUtil.endFunction());
				output.write(CardAndCardFormBeansUtil.showDate_MainJsForCC1());
				output.write(CardAndCardFormBeansUtil.showDate_MainJsForCC2_ACT(mainMst[60], mainMst[0], mainform.getPojoform().getFormDefId()+"",mainMst[2],mainMst[4]));
				output.write(mainMst[67].toString());
				output.write(CardAndCardFormBeansUtil.endFunction());
				output.write("</script>\n</body>\n</html>");
				output.close();  
				if (f1.exists()) {  
					System.out.print("文件存在");  
				} else {  
					System.out.print("文件不存在");  
					f1.createNewFile();// 不存在则创建
				}
				OutputStreamWriter write1 = new OutputStreamWriter(new FileOutputStream(f1),"utf-8");
				BufferedWriter output1=new BufferedWriter(write1);
				output1.write(CardAndCardFormBeansUtil.formCardAndCardHead1(form.getPojoform().getFormDefCode(),path11,isApp2).toString());
				if (form.getCardtocardConfig()!=null&&form.getCardtocardConfig().getIsDivLink().equals("Y")) {
					output1.write("<div style=\"position:absolute;left:8%;z-index:999px\" id=\"maodianS\">\n"+
						 	      "<div style=\"position:absolute\">\n"+
						 	      "<a href=\"#"+mainform.getFormDefCode()+"\" class=\"maodianA\"><input type=\"text\" readonly class=\"maodian form-control\" value=\"置顶\"/></a>\n");
					output1.write(detailMst[22].toString());
					if (form.getCardtocardConfig().getIsPrint().equals("Y")) {
						output1.write("<input type=\"button\" class=\"btn btn-info\" value=\"打印\" onclick=\"initPrint()\"/>\n");
					}
					output1.write("</div>\n");
					output1.write("</div>\n");
					output1.write("<div class=\"container-fluid\" id=\"CardAndCardForm\" style=\"height: 94%;overflow-y: auto;overflow-x:  hidden;padding: 0px;width:"+form.getCardtocardConfig().getMainWidth()+";\">\n");
				}else {
					if (form.getCardtocardConfig()!=null&&form.getCardtocardConfig().getIsPrint().equals("Y")) {
						output1.write("<div style=\"position:absolute;left:8%;z-index:999px\" id=\"maodianS\">\n"+
							 	      "<div style=\"position:absolute\">\n"+
							 	      "<a href=\"#"+mainform.getFormDefCode()+"\" class=\"maodianA\"><input type=\"text\" readonly class=\"maodian form-control\" value=\"置顶\"/></a>\n");
						output1.write(detailMst[22].toString());
						output1.write("<input type=\"button\" class=\"btn btn-info\" value=\"打印\" onclick=\"initPrint()\"/>\n");
						output1.write("</div>\n");
						output1.write("</div>\n");
					}
					output1.write("<div class=\"container-fluid\" id=\"CardAndCardForm\" style=\"height: 94%;overflow-y: auto;overflow-x:  hidden;padding: 0px;\">\n");
				}
				output1.write("<div class=\"row mainFormElement\" style=\"margin-left:0;padding: 0 15px 0 0;position:relative;\" id=\""+mainform.getFormDefCode()+"\">\n");
				output1.write("<input type=\"button\" id=\"zhankai_main\"  class=\"btn btn-info CCButtonelement\" value=\"展开\" style=\"position:absolute;right:30px;bottom:10px;z-index:999\" onclick=\"showDate_Main(main_Datas,0,this)\"/>\n");
				output1.write("</div>\n");
				
				output1.write(detailMst[1].toString());
				output1.write("</div>\n");
				output1.write(CardAndCardFormBeansUtil.formCardAndCardJsHead());
				output1.write(detailMst[14].toString());
				output1.write(sbs[30].toString());
				output1.write(mainMst[70].toString());
				output1.write("var param_empIds = '${param.empIds}';\n");
				output1.write("var isApp = '${param.formType}';\n");
				
				output1.write("var param_flowAction = '${param.flowAction}';\n");
				output1.write("var param_key = '${param.key}';\n");
				output1.write("var param_taskId = '${param.taskId}';\n");
				output1.write("var param_procInsId = '${param.procInsId}';\n");
				
				
				output1.write("var formId_main = '"+mainform.getPojoform().getFormDefId()+"';\n");

				output1.write("var flowAction = '${param.flowAction}';\n");
				output1.write("var BUSSINESSID_ACT = '${param.businessId}';\n");
				output1.write("$(document).ready(function () {\n");
				output1.write("loadDataStart();\n");
				output1.write("$(\"#zhankai_main\").click();\n");
				output1.write(detailMst[17].toString());
				output1.write(detailMst[12].toString());
				output1.write(detailMst[18].toString());
				output1.write(detailMst[19].toString());
				output1.write(detailMst[20].toString());
				output1.write("$(\"#zhankaiComment\").click();\n");
//				output1.write(form.getPojoform().getFormDefInitQzJs()+"\n");
				output1.write("changeFileCss();\n");
				if (isApp2!=null&&isApp2.equals("APP")) {
					output1.write("changeCssForApp1();\n");
				}
				output1.write(form.getPojoform().getFormDefInitQzJs()+"\n");
				if (isApp2!=null&&isApp2.equals("APP")) {
					output1.write("window.parent.postMessage('1','*');\n");
				}
				output1.write("})\n");
				output1.write(detailMst[21].toString());
				output1.write(sbs[40].toString());
				output1.write(sbs[55].toString());
				output1.write(detailMst[13].toString());
				output1.write(sbs[8].toString());
				output1.write(SysGridFormBeansUtil.formGridByCardFunction1());
				output1.write(SysGridFormBeansUtil.getEmpPhotoSYS());
				output1.write(SysGridFormBeansUtil.formGridByCardFunction5());
				output1.write(SysGridFormBeansUtil.formGridByCardFunction2_x(mainform.getFormDefId()+"",mainform.getFormDefCode(),paramas[1].toString()));
				output1.write(SysGridFormBeansUtil.formGridByCardFunction3(sList,mainform));
				output1.write(paramas[1].toString());
				output1.write(CardAndCardFormBeansUtil.endFunction());
				output1.write(CardAndCardFormBeansUtil.showDate_MainJsForCC1());
				output1.write(CardAndCardFormBeansUtil.showDate_MainJsForCC2_ACT(mainMst[60], mainMst[0], mainform.getPojoform().getFormDefId()+"",mainMst[2],mainMst[4]));
				output1.write(mainMst[67].toString());
				output1.write(CardAndCardFormBeansUtil.endFunction());
				output1.write("</script>\n</body>\n</html>");
				output1.close();
			} catch (Exception e) {  
				e.printStackTrace();logger.error(e.getMessage(),e);
			}  
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();logger.error(e.getMessage(),e);
		} 
		return null;
	}
	
	@Override
	public String buildCardAndGridForm_ACT(SysFormconfigCache form,SysRequestParam request,String isApp,ActNodePropertiesExpand actNodePropertiesExpand,String nodeId,String taskId,String isApp2) {
		// TODO Auto-generated method stub
		try {
//			StringBuffer[] sbs = form.showPage(request);
			String userId = request.getSession().getAttribute("userid")+"";
			//获取主表信息
			String mstFormId = String.valueOf(form.getFormDefId());
			SysFormconfigMstTabCache sMst= form.getMstTab();
			//通过主表Id获取html
			SysFormconfigCache mainform = sysformconfigService.getForm(sMst.getPojo().getMstTabMainFormId().toString());
			List<SysFormconfigCache> formList = new ArrayList<SysFormconfigCache>();
			formList.add(mainform);
			StringBuffer[] sbs = mainform.showPage(request,"",actNodePropertiesExpand,"main",0);
			StringBuffer[] mainMst = mainform.showPage(request,"CARDANDCARD_MAIN",null,"main",0);
			SysGridbycardTemplateColumnExample example = new SysGridbycardTemplateColumnExample();
			example.or().andTemplateColumnFormDefIdEqualTo(Integer.valueOf(mainform.getFormDefId()+"")).andTemplateColumnTemplateIdEqualTo(Integer.valueOf(mainform.getPojoform().getExpand1()));
			example.setOrderByClause("TEMPLATE_COLUMN_ID");
			List<SysGridbycardTemplateColumn> sList = sTemplateColumnMapper.selectByExample(example);
			//获取附表信息
			String mstId = String.valueOf(sMst.getMstTabId());
			SysFormconfigMstTabDetailExample example2 = new SysFormconfigMstTabDetailExample();
			example2.or().andMstTabIdEqualTo(new BigDecimal(mstId));
			example2.setOrderByClause("TAB_DETAIL_SORT");
			List<SysFormconfigMstTabDetail> sDetailMsts= sysDetailMapper.selectByExample(example2);
			
			//获取参数表信息
			SysFormGeneralParamExample example3 = new SysFormGeneralParamExample();
			example3.or().andParamTypeValueEqualTo(new BigDecimal(mstFormId));
			List<SysFormGeneralParam> sysFormGeneralParams= sysFormGeneralParamMapper.selectByExample(example3);
			
			StringBuffer[] expands = expandHtml(sMst);
			StringBuffer[] detailMst = detailCardAndGridHtml_ACT(sDetailMsts,request,form,taskId,nodeId,formList);
			StringBuffer[] paramas = paramaHtmlCardToCard(mainform,sysFormGeneralParams);
//			String path11 = findSysFormFolderTreeById(form.getPojoform().getFormDefFolderId().intValue(),"");
			String path11 = form.getFormTreePath();
			form.getPojoform().setFormSubmitUrl(path11+form.getPojoform().getFormDefCode()+".jsp");
//			sysFormconfigMapper.updateByPrimaryKeyWithBLOBs(form.getPojoform());
			Map map = new HashMap();
			map.put("submitUrl", path11+form.getPojoform().getFormDefCode()+".jsp");
			map.put("formDefId", form.getFormDefId());
			sysFormconfigMapperExpand.updateSubmitUrl(map);
			logger.info(path11);
			//获取文件路径和文件名
			String path="C:/MyeHR/MyeHR_MSSQL/jsp/"+path11;
			String path1 =  request.getPath()+"\\"+path11;
			
			CreateFileUtil.createDir(path);
			CreateFileUtil.createDir(path1);
			
			try {  
				File f = new File(path+"/"+form.getPojoform().getFormDefCode()+".jsp");
				File f1 = new File(path1+"/"+form.getPojoform().getFormDefCode()+".jsp"); 
				File f3 = new File(path1+"/"+form.getPojoform().getFormDefCode()+".js"); 
				if (f3.exists()) {  
					System.out.print("文件存在");  
				} else {  
					System.out.print("文件不存在");  
					f3.createNewFile();// 不存在则创建
				}
				OutputStreamWriter write3 = new OutputStreamWriter(new FileOutputStream(f3),"utf-8");
				BufferedWriter output3=new BufferedWriter(write3);
				output3.write(detailMst[23].toString());
				output3.write(detailMst[6].toString());
				
				output3.write("var indexApprove;\n");
				
				output3.write(sbs[7].toString());//mainMst
				//output3.write(sbs[8].toString());
				output3.write(mainMst[3].toString());
				output3.write(detailMst[0].toString());
				output3.write(detailMst[2].toString());
				output3.write(detailMst[3].toString());
				
				output3.write(detailMst[4].toString());
				output3.write(detailMst[5].toString());
				output3.write(detailMst[7].toString());
				output3.write(detailMst[8].toString());
				output3.write(detailMst[9].toString());
				output3.write(detailMst[21].toString());
				output3.write(detailMst[10].toString());
				output3.write(detailMst[11].toString());
				output3.write(detailMst[15].toString());
				output3.write(detailMst[16].toString());
				output3.close();  
				
				if (f.exists()) {  
					System.out.print("文件存在");  
				} else {  
					System.out.print("文件不存在");  
					f.createNewFile();// 不存在则创建
				}
				OutputStreamWriter write = new OutputStreamWriter(new FileOutputStream(f),"utf-8");
				BufferedWriter output=new BufferedWriter(write);
				output.write(CardAndCardFormBeansUtil.formCardAndCardHead1(form.getPojoform().getFormDefCode(),path11,isApp2).toString());
				if (form.getCardtocardConfig()!=null&&form.getCardtocardConfig().getIsDivLink().equals("Y")) {
					output.write("<div style=\"position:absolute;left:8%;z-index:999px\" id=\"maodianS\">\n"+
						 	     "<div style=\"position:absolute\">\n"+
						 	     "<a href=\"#"+mainform.getFormDefCode()+"\" class=\"maodianA\"><input type=\"text\" readonly class=\"maodian form-control\" value=\"置顶\"/></a>\n");
					output.write(detailMst[22].toString());
					if (form.getCardtocardConfig().getIsPrint().equals("Y")) {
						output.write("<input type=\"button\" class=\"btn btn-info\" value=\"打印\" onclick=\"initPrint()\"/>\n");
					}
					output.write("</div>\n");
					output.write("</div>\n");
					output.write("<div class=\"container-fluid\" id=\"CardAndCardForm\" style=\"height: 94%;overflow-y: auto;overflow-x:  hidden;padding: 0px;width:"+form.getCardtocardConfig().getMainWidth()+";\">\n");
				}else {
					if (form.getCardtocardConfig()!=null&&form.getCardtocardConfig().getIsPrint().equals("Y")) {
						output.write("<div style=\"position:absolute;left:8%;z-index:999px\" id=\"maodianS\">\n"+
							 	     "<div style=\"position:absolute\">\n"+
							 	     "<a href=\"#"+mainform.getFormDefCode()+"\" class=\"maodianA\"><input type=\"text\" readonly class=\"maodian form-control\" value=\"置顶\"/></a>\n");
						output.write(detailMst[22].toString());
						output.write("<input type=\"button\" class=\"btn btn-info\" value=\"打印\" onclick=\"initPrint()\"/>\n");
						output.write("</div>\n");
						output.write("</div>\n");
					}
					output.write("<div class=\"container-fluid\" id=\"CardAndCardForm\" style=\"height: 94%;overflow-y: auto;overflow-x:  hidden;padding: 0px;\">\n");
				}
				
				output.write("<div class=\"row mainFormElement\" style=\"margin-left:0;padding: 0 15px 0 0;position:relative;\" id=\""+mainform.getFormDefCode()+"\">\n");
				output.write("<input type=\"button\" id=\"zhankai\"  class=\"btn btn-info CCButtonelement\" value=\"展开\" style=\"position:absolute;right:30px;bottom:10px;z-index:999\" onclick=\"showDate_Main(main_Datas,0,0)\"/>\n");
				output.write("</div>\n");
				
				output.write(detailMst[1].toString());
				output.write("</div>\n");
				output.write(CardAndCardFormBeansUtil.formCardAndCardJsHead());
				output.write(detailMst[14].toString());
				output.write(sbs[30].toString());
				output.write(mainMst[70].toString());
				output.write("var param_empIds = '${param.empIds}';\n");
				output.write("var isApp = '${param.formType}';\n");
				output.write("var formId_main = '"+mainform.getPojoform().getFormDefId()+"';\n");
				output.write("var flowAction = '${param.flowAction}';\n");
				output.write("var BUSSINESSID_ACT = '${param.businessId}';\n");
				output.write("$(document).ready(function () {\n");
				output.write("loadDataStart();\n");
				output.write("$(\"#zhankai_main\").click();\n");
				output.write(detailMst[17].toString());
				output.write(detailMst[12].toString());
				output.write(detailMst[18].toString());
				output.write(detailMst[19].toString());
				output.write(detailMst[20].toString());
				output.write("changeFileCss();\n");
				output.write(form.getPojoform().getFormDefInitQzJs()+"\n");
				output.write("$(\"#zhankaiComment\").click();\n");
				output.write("})\n");
			  //output.write(detailMst[21].toString());
				output.write(sbs[40].toString());
				output.write(sbs[55].toString());
				output.write(detailMst[13].toString());
				output.write(sbs[8].toString());
				output.write(SysGridFormBeansUtil.formGridByCardFunction1());
				output.write(SysGridFormBeansUtil.getEmpPhotoSYS());
				output.write(SysGridFormBeansUtil.formGridByCardFunction5());
				output.write(SysGridFormBeansUtil.formGridByCardFunction2_x(mainform.getFormDefId()+"",mainform.getFormDefCode(),paramas[1].toString()));
				output.write(SysGridFormBeansUtil.formGridByCardFunction3(sList,mainform));
				output.write(CardAndCardFormBeansUtil.endFunction());
				output.write(CardAndCardFormBeansUtil.showDate_MainJsForCC1());
				output.write(CardAndCardFormBeansUtil.showDate_MainJsForCC2_ACT(mainMst[60], mainMst[0], mainform.getPojoform().getFormDefId()+"",mainMst[2],mainMst[4]));
				output.write(mainMst[67].toString());
				output.write(CardAndCardFormBeansUtil.endFunction());
				output.write("</script>\n</body>\n</html>");
				output.close();  
				if (f1.exists()) {  
					System.out.print("文件存在");  
				} else {  
					System.out.print("文件不存在");  
					f1.createNewFile();// 不存在则创建
				}
				OutputStreamWriter write1 = new OutputStreamWriter(new FileOutputStream(f1),"utf-8");
				BufferedWriter output1=new BufferedWriter(write1);
				output1.write(CardAndCardFormBeansUtil.formCardAndCardHead1(form.getPojoform().getFormDefCode(),path11,isApp2).toString());
				if (form.getCardtocardConfig()!=null&&form.getCardtocardConfig().getIsDivLink().equals("Y")) {
					output1.write("<div style=\"position:absolute;left:8%;z-index:999px\" id=\"maodianS\">\n"+
						 	      "<div style=\"position:absolute\">\n"+
						 	      "<a href=\"#"+mainform.getFormDefCode()+"\" class=\"maodianA\"><input type=\"text\" readonly class=\"maodian form-control\" value=\"置顶\"/></a>\n");
					output1.write(detailMst[22].toString());
					if (form.getCardtocardConfig().getIsPrint().equals("Y")) {
						output1.write("<input type=\"button\" class=\"btn btn-info\" value=\"打印\" onclick=\"initPrint()\"/>\n");
					}
					output1.write("</div>\n");
					output1.write("</div>\n");
					output1.write("<div class=\"container-fluid\" id=\"CardAndCardForm\" style=\"height: 94%;overflow-y: auto;overflow-x:  hidden;padding: 0px;width:"+form.getCardtocardConfig().getMainWidth()+";\">\n");
				}else {
					if (form.getCardtocardConfig()!=null&&form.getCardtocardConfig().getIsPrint().equals("Y")) {
						output1.write("<div style=\"position:absolute;left:8%;z-index:999px\" id=\"maodianS\">\n"+
							 	      "<div style=\"position:absolute\">\n"+
							 	      "<a href=\"#"+mainform.getFormDefCode()+"\" class=\"maodianA\"><input type=\"text\" readonly class=\"maodian form-control\" value=\"置顶\"/></a>\n");
						output1.write(detailMst[22].toString());
						output1.write("<input type=\"button\" class=\"btn btn-info\" value=\"打印\" onclick=\"initPrint()\"/>\n");
						output1.write("</div>\n");
						output1.write("</div>\n");
					}
					output1.write("<div class=\"container-fluid\" id=\"CardAndCardForm\" style=\"height: 94%;overflow-y: auto;overflow-x:  hidden;padding: 0px;\">\n");
				}
				output1.write("<div class=\"row mainFormElement\" style=\"margin-left:0;padding: 0 15px 0 0;position:relative;\" id=\""+mainform.getFormDefCode()+"\">\n");
				output1.write("<input type=\"button\" id=\"zhankai_main\"  class=\"btn btn-info CCButtonelement\" value=\"展开\" style=\"position:absolute;right:30px;bottom:10px;z-index:999\" onclick=\"showDate_Main(main_Datas,0,this)\"/>\n");
				output1.write("</div>\n");
				
				output1.write(detailMst[1].toString());
				output1.write("</div>\n");
				output1.write(CardAndCardFormBeansUtil.formCardAndCardJsHead());
				output1.write(detailMst[14].toString());
				output1.write(sbs[30].toString());
				output1.write(mainMst[70].toString());
				output1.write("var param_empIds = '${param.empIds}';\n");
				output1.write("var isApp = '${param.formType}';\n");
				
				output1.write("var param_flowAction = '${param.flowAction}';\n");
				output1.write("var param_key = '${param.key}';\n");
				output1.write("var param_taskId = '${param.taskId}';\n");
				output1.write("var param_procInsId = '${param.procInsId}';\n");
				
				
				output1.write("var formId_main = '"+mainform.getPojoform().getFormDefId()+"';\n");

				output1.write("var flowAction = '${param.flowAction}';\n");
				output1.write("var BUSSINESSID_ACT = '${param.businessId}';\n");
				output1.write("$(document).ready(function () {\n");
				output1.write("loadDataStart();\n");
				output1.write("$(\"#zhankai_main\").click();\n");
				output1.write(detailMst[17].toString());
				output1.write(detailMst[12].toString());
				output1.write(detailMst[18].toString());
				output1.write(detailMst[19].toString());
				output1.write(detailMst[20].toString());
				output1.write("changeFileCss();\n");
				output1.write(form.getPojoform().getFormDefInitQzJs()+"\n");
				output1.write("$(\"#zhankaiComment\").click();\n");
				output1.write("})\n");
			//	output1.write(detailMst[21].toString());
				output1.write(sbs[40].toString());
				output1.write(sbs[55].toString());
				output1.write(detailMst[13].toString());
				output1.write(sbs[8].toString());
				output1.write(SysGridFormBeansUtil.formGridByCardFunction1());
				output1.write(SysGridFormBeansUtil.getEmpPhotoSYS());
				output1.write(SysGridFormBeansUtil.formGridByCardFunction5());
				output1.write(SysGridFormBeansUtil.formGridByCardFunction2_x(mainform.getFormDefId()+"",mainform.getFormDefCode(),paramas[1].toString()));
				output1.write(SysGridFormBeansUtil.formGridByCardFunction3(sList,mainform));
				output1.write(paramas[1].toString());
				output1.write(CardAndCardFormBeansUtil.endFunction());
				output1.write(CardAndCardFormBeansUtil.showDate_MainJsForCC1());
				output1.write(CardAndCardFormBeansUtil.showDate_MainJsForCC2_ACT(mainMst[60], mainMst[0], mainform.getPojoform().getFormDefId()+"",mainMst[2],mainMst[4]));
				output1.write(mainMst[67].toString());
				output1.write(CardAndCardFormBeansUtil.endFunction());
				output1.write("</script>\n</body>\n</html>");
				output1.close();
			} catch (Exception e) {  
				e.printStackTrace();logger.error(e.getMessage(),e);
			}  
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();logger.error(e.getMessage(),e);
		} 
		return null;
	}
	
	@Override
	public String buildCardAndNewGridForm2_ACT(SysFormconfigCache form,SysRequestParam request,String isApp,ActNodePropertiesExpand actNodePropertiesExpand,String nodeId,String taskId,String isApp2) {
		// TODO Auto-generated method stub
				try {
//					StringBuffer[] sbs = form.showPage(request);
					String userId = request.getSession().getAttribute("userid")+"";
					//获取主表信息
					String mstFormId = String.valueOf(form.getFormDefId());
					SysFormconfigMstTabCache sMst= form.getMstTab();
					//通过主表Id获取html
					String mainFormId = sMst.getPojo().getMstTabMainFormId().toString();
					SysFormconfigCache mainform = sysformconfigService.getForm(mainFormId);
					List<SysFormconfigCache> formList = new ArrayList<SysFormconfigCache>();
					formList.add(mainform);
					StringBuffer[] sbs = mainform.showPage(request,isApp2,actNodePropertiesExpand,"main",0);
					StringBuffer[] mainMst = mainform.showPage(request,"CARDANDCARD_MAIN",null,"main",0);
					SysGridbycardTemplateColumnExample example = new SysGridbycardTemplateColumnExample();
					example.or().andTemplateColumnFormDefIdEqualTo(Integer.valueOf(mainform.getFormDefId()+"")).andTemplateColumnTemplateIdEqualTo(Integer.valueOf(mainform.getPojoform().getExpand1()));
					example.setOrderByClause("TEMPLATE_COLUMN_ID");
					List<SysGridbycardTemplateColumn> sList = sTemplateColumnMapper.selectByExample(example);
					//获取附表信息
					String mstId = String.valueOf(sMst.getMstTabId());
					SysFormconfigMstTabDetailExample example2 = new SysFormconfigMstTabDetailExample();
					example2.or().andMstTabIdEqualTo(new BigDecimal(mstId));
					example2.setOrderByClause("TAB_DETAIL_SORT");
					List<SysFormconfigMstTabDetail> sDetailMsts= sysDetailMapper.selectByExample(example2);
					
					//获取参数表信息
					SysFormGeneralParamExample example3 = new SysFormGeneralParamExample();
					example3.or().andParamTypeValueEqualTo(new BigDecimal(mstFormId));
					List<SysFormGeneralParam> sysFormGeneralParams= sysFormGeneralParamMapper.selectByExample(example3);
					
					StringBuffer[] expands = expandHtml(sMst);
					StringBuffer[] detailMst = detailCardAndGridHtml_ACT(sDetailMsts,request,form,taskId,nodeId,formList);
					StringBuffer[] paramas = paramaHtmlCardToCard(mainform,sysFormGeneralParams);
//					String path11 = findSysFormFolderTreeById(form.getPojoform().getFormDefFolderId().intValue(),"");
					String path11 = form.getFormTreePath();
					form.getPojoform().setFormSubmitUrl(path11+form.getPojoform().getFormDefCode()+".jsp");
//					sysFormconfigMapper.updateByPrimaryKeyWithBLOBs(form.getPojoform());
					Map map = new HashMap();
					map.put("submitUrl", path11+form.getPojoform().getFormDefCode()+".jsp");
					map.put("formDefId", form.getFormDefId());
					sysFormconfigMapperExpand.updateSubmitUrl(map);
					logger.info(path11);
					//获取文件路径和文件名
					String path="C:/MyeHR/MyeHR_MSSQL/jsp/"+path11;
					String path1 =  request.getPath()+"\\"+path11;
					
					CreateFileUtil.createDir(path);
					CreateFileUtil.createDir(path1);
					
					try {  
						File f = new File(path+"/"+form.getPojoform().getFormDefCode()+".jsp");
						File f1 = new File(path1+"/"+form.getPojoform().getFormDefCode()+".jsp"); 
						File f3 = new File(path1+"/"+form.getPojoform().getFormDefCode()+".js"); 
						if (f3.exists()) {  
							System.out.print("文件存在");  
						} else {  
							System.out.print("文件不存在");  
							f3.createNewFile();// 不存在则创建
						}
						OutputStreamWriter write3 = new OutputStreamWriter(new FileOutputStream(f3),"utf-8");
						BufferedWriter output3=new BufferedWriter(write3);
						output3.write(detailMst[23].toString());
						output3.write(detailMst[6].toString());
						
						output3.write("var indexApprove;\n");
						
						output3.write(sbs[7].toString());//mainMst
						//output3.write(sbs[8].toString());
						output3.write(mainMst[3].toString());
						output3.write(detailMst[0].toString());
						output3.write(detailMst[2].toString());
						output3.write(detailMst[3].toString());
						
						output3.write(detailMst[4].toString());
						output3.write(detailMst[5].toString());
						output3.write(detailMst[7].toString());
						output3.write(detailMst[8].toString());
						output3.write(detailMst[9].toString());
						output3.write(detailMst[10].toString());
						output3.write(detailMst[11].toString());
						output3.write(detailMst[15].toString());
						output3.write(detailMst[16].toString());
						output3.close();  
						
						if (f.exists()) {  
							System.out.print("文件存在");  
						} else {  
							System.out.print("文件不存在");  
							f.createNewFile();// 不存在则创建
						}
						OutputStreamWriter write = new OutputStreamWriter(new FileOutputStream(f),"utf-8");
						BufferedWriter output=new BufferedWriter(write);
						output.write(CardAndCardFormBeansUtil.formCardAndCardHead1(form.getPojoform().getFormDefCode(),path11,isApp2).toString());
						if (form.getCardtocardConfig()!=null&&form.getCardtocardConfig().getIsDivLink().equals("Y")) {
							output.write("<div style=\"position:absolute;left:8%;z-index:999px\" id=\"maodianS\">\n"+
								 	     "<div style=\"position:absolute\">\n"+
								 	     "<a href=\"#"+mainform.getFormDefCode()+"\" class=\"maodianA\"><input type=\"text\" readonly class=\"maodian form-control\" value=\"置顶\"/></a>\n");
							output.write(detailMst[22].toString());
							if (form.getCardtocardConfig().getIsPrint().equals("Y")) {
								output.write("<input type=\"button\" class=\"btn btn-info\" value=\"打印\" onclick=\"initPrint()\"/>\n");
							}
							output.write("</div>\n");
							output.write("</div>\n");
							output.write("<div class=\"container-fluid\" id=\"CardAndCardForm\" style=\"height: 94%;overflow-y: auto;overflow-x:  hidden;padding: 0px;width:"+form.getCardtocardConfig().getMainWidth()+";\">\n");
						}else {
							if (form.getCardtocardConfig()!=null&&form.getCardtocardConfig().getIsPrint().equals("Y")) {
								output.write("<div style=\"position:absolute;left:8%;z-index:999px\" id=\"maodianS\">\n"+
									 	     "<div style=\"position:absolute\">\n"+
									 	     "<a href=\"#"+mainform.getFormDefCode()+"\" class=\"maodianA\"><input type=\"text\" readonly class=\"maodian form-control\" value=\"置顶\"/></a>\n");
								output.write(detailMst[22].toString());
								output.write("<input type=\"button\" class=\"btn btn-info\" value=\"打印\" onclick=\"initPrint()\"/>\n");
								output.write("</div>\n");
								output.write("</div>\n");
							}
							output.write("<div class=\"container-fluid\" id=\"CardAndCardForm\" style=\"height: 94%;overflow-y: auto;overflow-x:  hidden;padding: 0px;\">\n");
						}
						
						output.write("<div class=\"row mainFormElement\" style=\"margin-left:0;padding: 0 15px 0 0;position:relative;\" id=\""+mainform.getFormDefCode()+"\">\n");
						output.write("<input type=\"button\" id=\"zhankai\"  class=\"btn btn-info CCButtonelement\" value=\"展开\" style=\"position:absolute;right:30px;bottom:10px;z-index:999\" onclick=\"showDate_Main(main_Datas,0,0)\"/>\n");
						output.write("</div>\n");
						
						output.write(detailMst[1].toString());
						output.write("</div>\n");
						output.write(CardAndCardFormBeansUtil.formCardAndCardJsHead());
						output.write(detailMst[14].toString());
						output.write(sbs[30].toString());
						output.write(mainMst[70].toString());
						output.write("var param_empIds = '${param.empIds}';\n");
						output.write("var isApp = '${param.formType}';\n");
						output.write("var formId_main = '"+mainform.getPojoform().getFormDefId()+"';\n");
						output.write("var flowAction = '${param.flowAction}';\n");
						output.write("var BUSSINESSID_ACT = '${param.businessId}';\n");
						output.write("$(document).ready(function () {\n");
						output.write("loadDataStart();\n");
						output.write("$(\"#zhankai_main\").click();\n");
						output.write(detailMst[17].toString());
						output.write(detailMst[12].toString());
						output.write(detailMst[18].toString());
						output.write(detailMst[19].toString());
						output.write(detailMst[20].toString());
						output.write("changeFileCss();\n");
						output.write(form.getPojoform().getFormDefInitQzJs()+"\n");
						output.write("$(\"#zhankaiComment\").click();\n");
						output.write("})\n");
						output.write(detailMst[21].toString());
						output.write(sbs[40].toString());
						output.write(sbs[55].toString());
						output.write(detailMst[13].toString());
						output.write(sbs[8].toString());
						output.write(SysGridFormBeansUtil.formGridByCardFunction1());
						output.write(SysGridFormBeansUtil.getEmpPhotoSYS());
						output.write(SysGridFormBeansUtil.formGridByCardFunction5());
						output.write(SysGridFormBeansUtil.formGridByCardFunction2_x(mainform.getFormDefId()+"",mainform.getFormDefCode(),paramas[1].toString()));
						output.write(SysGridFormBeansUtil.formGridByCardFunction3(sList,mainform));
						output.write(CardAndCardFormBeansUtil.endFunction());
						output.write(CardAndCardFormBeansUtil.showDate_MainJsForCC1());
						output.write(CardAndCardFormBeansUtil.showDate_MainJsForCC2_ACT(mainMst[60], mainMst[0], mainform.getPojoform().getFormDefId()+"",mainMst[2],mainMst[4]));
						output.write(mainMst[67].toString());
						output.write(CardAndCardFormBeansUtil.endFunction());
						output.write("</script>\n</body>\n</html>");
						output.close();  
						if (f1.exists()) {  
							System.out.print("文件存在");  
						} else {  
							System.out.print("文件不存在");  
							f1.createNewFile();// 不存在则创建
						}
						OutputStreamWriter write1 = new OutputStreamWriter(new FileOutputStream(f1),"utf-8");
						BufferedWriter output1=new BufferedWriter(write1);
						output1.write(CardAndCardFormBeansUtil.formCardAndCardHead1(form.getPojoform().getFormDefCode(),path11,isApp2).toString());
						if (form.getCardtocardConfig()!=null&&form.getCardtocardConfig().getIsDivLink().equals("Y")) {
							output1.write("<div style=\"position:absolute;left:8%;z-index:999px\" id=\"maodianS\">\n"+
								 	      "<div style=\"position:absolute\">\n"+
								 	      "<a href=\"#"+mainform.getFormDefCode()+"\" class=\"maodianA\"><input type=\"text\" readonly class=\"maodian form-control\" value=\"置顶\"/></a>\n");
							output1.write(detailMst[22].toString());
							if (form.getCardtocardConfig().getIsPrint().equals("Y")) {
								output1.write("<input type=\"button\" class=\"btn btn-info\" value=\"打印\" onclick=\"initPrint()\"/>\n");
							}
							output1.write("</div>\n");
							output1.write("</div>\n");
							output1.write("<div class=\"container-fluid\" id=\"CardAndCardForm\" style=\"height: 94%;overflow-y: auto;overflow-x:  hidden;padding: 0px;width:"+form.getCardtocardConfig().getMainWidth()+";\">\n");
						}else {
							if (form.getCardtocardConfig()!=null&&form.getCardtocardConfig().getIsPrint().equals("Y")) {
								output1.write("<div style=\"position:absolute;left:8%;z-index:999px\" id=\"maodianS\">\n"+
									 	      "<div style=\"position:absolute\">\n"+
									 	      "<a href=\"#"+mainform.getFormDefCode()+"\" class=\"maodianA\"><input type=\"text\" readonly class=\"maodian form-control\" value=\"置顶\"/></a>\n");
								output1.write(detailMst[22].toString());
								output1.write("<input type=\"button\" class=\"btn btn-info\" value=\"打印\" onclick=\"initPrint()\"/>\n");
								output1.write("</div>\n");
								output1.write("</div>\n");
							}
							output1.write("<div class=\"container-fluid\" id=\"CardAndCardForm\" style=\"height: 94%;overflow-y: auto;overflow-x:  hidden;padding: 0px;\">\n");
						}
						output1.write("<div class=\"row mainFormElement\" style=\"margin-left:0;padding: 0 15px 0 0;position:relative;\" id=\""+mainform.getFormDefCode()+"\">\n");
						output1.write("<input type=\"button\" id=\"zhankai_main\"  class=\"btn btn-info CCButtonelement\" value=\"展开\" style=\"position:absolute;right:30px;bottom:10px;z-index:999\" onclick=\"showDate_Main(main_Datas,0,this)\"/>\n");
						output1.write("</div>\n");
						
						output1.write(detailMst[1].toString());
						output1.write("</div>\n");
						output1.write(CardAndCardFormBeansUtil.formCardAndCardJsHead());
						output1.write(detailMst[14].toString());
						output1.write(sbs[30].toString());
						output1.write(mainMst[70].toString());
						output1.write("var param_empIds = '${param.empIds}';\n");
						output1.write("var isApp = '${param.formType}';\n");
						
						output1.write("var param_flowAction = '${param.flowAction}';\n");
						output1.write("var param_key = '${param.key}';\n");
						output1.write("var param_taskId = '${param.taskId}';\n");
						output1.write("var param_procInsId = '${param.procInsId}';\n");
						
						
						output1.write("var formId_main = '"+mainform.getPojoform().getFormDefId()+"';\n");

						output1.write("var flowAction = '${param.flowAction}';\n");
						output1.write("var BUSSINESSID_ACT = '${param.businessId}';\n");
						output1.write("$(document).ready(function () {\n");
						output1.write("loadDataStart();\n");
						output1.write("$(\"#zhankai_main\").click();\n");
						output1.write(detailMst[17].toString());
						output1.write(detailMst[12].toString());
						output1.write(detailMst[18].toString());
						output1.write(detailMst[19].toString());
						output1.write(detailMst[20].toString());
						output1.write("$(\"#zhankaiComment\").click();\n");
						output1.write("changeFileCss();\n");
						if (isApp2!=null&&isApp2.equals("APP")) {
							output1.write("changeCssForApp1();\n");
						}
						output1.write(form.getPojoform().getFormDefInitQzJs()+"\n");
						output1.write("})\n");
						output1.write(detailMst[21].toString());
						output1.write(sbs[40].toString());
						output1.write(sbs[55].toString());
						output1.write(detailMst[13].toString());
						output1.write(sbs[8].toString());
						output1.write(SysGridFormBeansUtil.formGridByCardFunction1());
						output1.write(SysGridFormBeansUtil.getEmpPhotoSYS());
						output1.write(SysGridFormBeansUtil.formGridByCardFunction5());
						output1.write(SysGridFormBeansUtil.formGridByCardFunction2_x(mainform.getFormDefId()+"",mainform.getFormDefCode(),paramas[1].toString()));
						output1.write(SysGridFormBeansUtil.formGridByCardFunction3(sList,mainform));
						output1.write(paramas[1].toString());
						output1.write(CardAndCardFormBeansUtil.endFunction());
						output1.write(CardAndCardFormBeansUtil.showDate_MainJsForCC1());
						output1.write(CardAndCardFormBeansUtil.showDate_MainJsForCC2_ACT(mainMst[60], mainMst[0], mainform.getPojoform().getFormDefId()+"",mainMst[2],mainMst[4]));
						output1.write(mainMst[67].toString());
						output1.write(CardAndCardFormBeansUtil.endFunction());
						output1.write("</script>\n</body>\n</html>");
						output1.close();
					} catch (Exception e) {  
						e.printStackTrace();logger.error(e.getMessage(),e);
					}  
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();logger.error(e.getMessage(),e);
				} 
				return null;
	}
	
	@Override
	public String buildCardAndCardForm2(SysFormconfigCache form,SysRequestParam request,String isApp,ActNodePropertiesExpand actNodePropertiesExpand,String isApp2) {
		// TODO Auto-generated method stub
		try {
//			StringBuffer[] sbs = form.showPage(request);
			String userId = request.getSession().getAttribute("userid")+"";
			//获取主表信息
			String mstFormId = String.valueOf(form.getFormDefId());
			SysFormconfigMstTabCache sMst= form.getMstTab();
			//通过主表Id获取html
			SysFormconfigCache mainform = sysformconfigService.getForm(sMst.getPojo().getMstTabMainFormId().toString());
			List<SysFormconfigCache> formList = new ArrayList<SysFormconfigCache>();
			formList.add(mainform);
			StringBuffer[] sbs = mainform.showPage(request,"",actNodePropertiesExpand,"main",0);
			StringBuffer[] mainMst = mainform.showPage(request,"CARDANDCARD_MAIN",null,"main",0);
			SysGridbycardTemplateColumnExample example = new SysGridbycardTemplateColumnExample();
			example.or().andTemplateColumnFormDefIdEqualTo(Integer.valueOf(mainform.getFormDefId()+"")).andTemplateColumnTemplateIdEqualTo(Integer.valueOf(mainform.getPojoform().getExpand1()));
			example.setOrderByClause("TEMPLATE_COLUMN_ID");
			List<SysGridbycardTemplateColumn> sList = sTemplateColumnMapper.selectByExample(example);
			//获取附表信息
			String mstId = String.valueOf(sMst.getMstTabId());
			List<SysFormconfigMstTabDetailCache> sDetailMsts= sMst.getDetails();
			
			//获取参数表信息
			SysFormGeneralParamExample example3 = new SysFormGeneralParamExample();
			example3.or().andParamTypeValueEqualTo(new BigDecimal(mstFormId));
			List<SysFormGeneralParam> sysFormGeneralParams= sysFormGeneralParamMapper.selectByExample(example3);
			
			StringBuffer[] expands = expandHtml(sMst);
			StringBuffer[] detailMst = detailCardAndCardHtml(sDetailMsts,request,form,formList);
			StringBuffer[] paramas = paramaHtmlCardToCard(mainform,sysFormGeneralParams);
//			String path11 = findSysFormFolderTreeById(form.getPojoform().getFormDefFolderId().intValue(),"");
			String path11 = form.getFormTreePath();
			form.getPojoform().setFormSubmitUrl(path11+form.getPojoform().getFormDefCode()+".jsp");
//			sysFormconfigMapper.updateByPrimaryKeyWithBLOBs(form.getPojoform());
			Map map = new HashMap();
			map.put("submitUrl", path11+form.getPojoform().getFormDefCode()+".jsp");
			map.put("formDefId", form.getFormDefId());
			sysFormconfigMapperExpand.updateSubmitUrl(map);
			logger.info(path11);
			//获取文件路径和文件名
			String path="C:/MyeHR/MyeHR_MSSQL/jsp/"+path11;
			String path1 =  request.getPath()+"\\"+path11;
			
			CreateFileUtil.createDir(path);
			CreateFileUtil.createDir(path1);
			try {  
				File f = new File(path+"/"+form.getPojoform().getFormDefCode()+".jsp");
				File f1 = new File(path1+"/"+form.getPojoform().getFormDefCode()+".jsp"); 
				File f3 = new File(path1+"/"+form.getPojoform().getFormDefCode()+".js"); 
				
				if (f3.exists()) {  
					System.out.print("文件存在");  
				} else {  
					System.out.print("文件不存在");  
					f3.createNewFile();// 不存在则创建
				}
				OutputStreamWriter write3 = new OutputStreamWriter(new FileOutputStream(f3),"utf-8");
				BufferedWriter output3=new BufferedWriter(write3);
				output3.write(detailMst[22].toString());
				output3.write(detailMst[6].toString());
				output3.write(sbs[8].toString());
				output3.write(mainMst[3].toString());
				output3.write(detailMst[0].toString());
				output3.write(detailMst[2].toString());
				output3.write(detailMst[3].toString());
				
				output3.write(CardAndCardFormBeansUtil.showDate_MainJsForCC1());
				output3.write(CardAndCardFormBeansUtil.showDate_MainJsForCC2(mainMst[60], mainMst[0], mainform.getPojoform().getFormDefId()+""));
				output3.write(mainMst[67].toString());
				output3.write(CardAndCardFormBeansUtil.endFunction());
				
				output3.write(detailMst[4].toString());
				output3.write(detailMst[5].toString());
				output3.write(detailMst[7].toString());
				output3.write(detailMst[8].toString());
				output3.write(detailMst[9].toString());
				output3.write(detailMst[10].toString());
				output3.write(detailMst[11].toString());
				output3.write(detailMst[15].toString());
				output3.write(detailMst[16].toString());
				output3.close();  
				
				if (f.exists()) {  
					System.out.print("文件存在");  
				} else {  
					System.out.print("文件不存在");  
					f.createNewFile();// 不存在则创建
				}
				OutputStreamWriter write = new OutputStreamWriter(new FileOutputStream(f),"utf-8");
				BufferedWriter output=new BufferedWriter(write);
				output.write(CardAndCardFormBeansUtil.formCardAndCardHead1(form.getPojoform().getFormDefCode(),path11,isApp2).toString());
				if (form.getCardtocardConfig()!=null&&form.getCardtocardConfig().getIsDivLink().equals("Y")) {
					output.write("<div style=\"position:absolute;left:8%;z-index:999px\" id=\"maodianS\">\n"+
							 	 "<div style=\"position:absolute\">\n"+
							 	 "<a href=\"#"+mainform.getFormDefCode()+"\" class=\"maodianA\"><input type=\"text\" readonly class=\"maodian form-control\" value=\"置顶\"/></a>\n");
					output.write(detailMst[21].toString());
					if (form.getCardtocardConfig().getIsPrint().equals("Y")) {
						output.write("<input type=\"button\" class=\"btn btn-info\" value=\"打印\" onclick=\"initPrint()\"/>\n");
					}
					output.write("</div>\n");
					output.write("</div>\n");

					output.write("<div class=\"container-fluid\" id=\"CardAndCardForm\" style=\"height: 94%;overflow-y: auto;overflow-x:  hidden;padding: 0px;width:"+form.getCardtocardConfig().getMainWidth()+";\">\n");
				}else {
					if (form.getCardtocardConfig()!=null&&form.getCardtocardConfig().getIsPrint().equals("Y")) {
						output.write("<div style=\"position:absolute;left:8%;z-index:999px\" id=\"maodianS\">\n"+
							 	     "<div style=\"position:absolute\">\n"+
							 	     "<a href=\"#"+mainform.getFormDefCode()+"\" class=\"maodianA\"><input type=\"text\" readonly class=\"maodian form-control\" value=\"置顶\"/></a>\n");
						output.write(detailMst[21].toString());
						output.write("<input type=\"button\" class=\"btn btn-info\" value=\"打印\" onclick=\"initPrint()\"/>\n");
						output.write("</div>\n");
						output.write("</div>\n");
					}

					output.write("<div class=\"container-fluid\" id=\"CardAndCardForm\" style=\"height: 94%;overflow-y: auto;overflow-x:  hidden;padding: 0px;\">\n");
				}
				output.write("<div class=\"row mainFormElement\" style=\"margin-left:0;padding: 0 15px 0 0;position:relative;\" id=\""+mainform.getFormDefCode()+"\">\n");
//				output.write("<input type=\"button\" id=\"zhankai\"  class=\"btn btn-info CCButtonelement\" value=\"展开\" style=\"position:absolute;right:30px;bottom:10px;z-index:999\" onclick=\"showDate_Main(main_Datas,0,0)\"/>\n");
				output.write("</div>\n");
				
				output.write(detailMst[1].toString());
				output.write("</div>\n");
				output.write(CardAndCardFormBeansUtil.formCardAndCardJsHead());
				output.write(detailMst[14].toString());
				output.write(sbs[30].toString());
				output.write(mainMst[70].toString());
				output.write("var param_empIds = '${param.empIds}';\n");
				output.write("var isApp = '${param.formType}';\n");
				output.write("var formId_main = '"+mainform.getPojoform().getFormDefId()+"';\n");
				output.write("var flowAction = '${param.flowAction}';\n");
				output.write("$(document).ready(function () {\n");
				output.write("loadDataStart();\n");
				output.write("getEmpPhotoSYS();\n");
				//output.write("$(\"#zhankai_main\").click();\n");
				output.write(detailMst[17].toString());
				output.write(detailMst[12].toString());
				output.write(detailMst[18].toString());
				output.write(detailMst[19].toString());
				output.write(detailMst[20].toString());
				output.write("changeFileCss();\n");
				output.write("})\n");
				output.write(sbs[40].toString());
				output.write(sbs[55].toString());
				output.write(detailMst[13].toString());
				output.write(sbs[8].toString());
				output.write(SysGridFormBeansUtil.formGridByCardFunction1());
				output.write(SysGridFormBeansUtil.getEmpPhotoSYS());
				output.write(SysGridFormBeansUtil.formGridByCardFunction5());
				output.write(SysGridFormBeansUtil.formGridByCardFunction2(mainform.getFormDefId()+"",mainform.getFormDefCode(),paramas[1].toString()));
				output.write(SysGridFormBeansUtil.formGridByCardFunction3_NACT(sList,mainform));
				output.write(CardAndCardFormBeansUtil.endFunction());
				output.write("</script>\n</body>\n</html>");
				output.close();  
				if (f1.exists()) {  
					System.out.print("文件存在");  
				} else {  
					System.out.print("文件不存在");  
					f1.createNewFile();// 不存在则创建
				}
				OutputStreamWriter write1 = new OutputStreamWriter(new FileOutputStream(f1),"utf-8");
				BufferedWriter output1=new BufferedWriter(write1);
				output1.write(CardAndCardFormBeansUtil.formCardAndCardHead1(form.getPojoform().getFormDefCode(),path11,isApp2).toString());
				if (form.getCardtocardConfig()!=null&&form.getCardtocardConfig().getIsDivLink().equals("Y")) {
					output1.write("<div style=\"position:absolute;left:8%;z-index:999px\" id=\"maodianS\">\n"+
					 	         "<div style=\"position:absolute\">\n"+
					 	         "<a href=\"#"+mainform.getFormDefCode()+"\" class=\"maodianA\"><input type=\"text\" readonly class=\"maodian form-control\" value=\"置顶\"/></a>\n");
					output1.write(detailMst[21].toString());
					if (form.getCardtocardConfig().getIsPrint().equals("Y")) {
						output1.write("<input type=\"button\" class=\"btn btn-info\" value=\"打印\" onclick=\"initPrint()\"/>\n");
					}
					output1.write("</div>\n");
					output1.write("</div>\n");
					output1.write("<div class=\"container-fluid\" id=\"CardAndCardForm\" style=\"height: 94%;overflow-y: auto;overflow-x:  hidden;padding: 0px;width:"+form.getCardtocardConfig().getMainWidth()+";\">\n");
				}else {
					if (form.getCardtocardConfig()!=null&&form.getCardtocardConfig().getIsPrint().equals("Y")) {
						output.write("<div style=\"position:absolute;left:8%;z-index:999px\" id=\"maodianS\">\n"+
						 	     	 "<div style=\"position:absolute\">\n"+
						 	     	 "<a href=\"#"+mainform.getFormDefCode()+"\" class=\"maodianA\"><input type=\"text\" readonly class=\"maodian form-control\" value=\"置顶\"/></a>\n");
						output1.write(detailMst[21].toString());
						output1.write("<input type=\"button\" class=\"btn btn-info\" value=\"打印\" onclick=\"initPrint()\"/>\n");
						output1.write("</div>\n");
						output1.write("</div>\n");
					}
					output1.write("<div class=\"container-fluid\" id=\"CardAndCardForm\" style=\"height: 94%;overflow-y: auto;overflow-x:  hidden;padding: 0px;\">\n");
				}

				output1.write("<div class=\"row mainFormElement\" style=\"margin-left:0;padding: 0 15px 0 0;position:relative;\" id=\""+mainform.getFormDefCode()+"\">\n");
//				output1.write("<input type=\"button\" id=\"zhankai_main\"  class=\"btn btn-info CCButtonelement\" value=\"展开\" style=\"position:absolute;right:30px;bottom:10px;z-index:999\" onclick=\"showDate_Main(main_Datas,0,this)\"/>\n");
				output1.write("</div>\n");
				
				output1.write(detailMst[1].toString());
				output1.write("</div>\n");
				output1.write(CardAndCardFormBeansUtil.formCardAndCardJsHead());
				output1.write(detailMst[14].toString());
				output1.write(sbs[30].toString());
				output1.write(mainMst[70].toString());
				output1.write("var param_empIds = '${param.empIds}';\n");
				output1.write("var isApp = '${param.formType}';\n");
				
				output1.write("var param_flowAction = '${param.flowAction}';\n");
				output1.write("var param_key = '${param.key}';\n");
				output1.write("var param_taskId = '${param.taskId}';\n");
				output1.write("var param_procInsId = '${param.procInsId}';\n");
				
				
				output1.write("var formId_main = '"+mainform.getPojoform().getFormDefId()+"';\n");

				output1.write("var flowAction = '${param.flowAction}';\n");
				output1.write("$(document).ready(function () {\n");
				output1.write("loadDataStart();\n");
				output1.write("getEmpPhotoSYS();\n");
				//output1.write("$(\"#zhankai_main\").click();\n");
				output1.write(detailMst[17].toString());
				output1.write(detailMst[12].toString());
				output1.write(detailMst[18].toString());
				output1.write(detailMst[19].toString());
				output1.write(detailMst[20].toString());
				output1.write("changeFileCss();\n");
				output1.write("})\n");
				output1.write(sbs[40].toString());
				output1.write(sbs[55].toString());
				output1.write(detailMst[13].toString());
				output1.write(sbs[8].toString());
				output1.write(SysGridFormBeansUtil.formGridByCardFunction1());
				output1.write(SysGridFormBeansUtil.getEmpPhotoSYS());
				output1.write(SysGridFormBeansUtil.formGridByCardFunction5());
				output1.write(SysGridFormBeansUtil.formGridByCardFunction2(mainform.getFormDefId()+"",mainform.getFormDefCode(),paramas[1].toString()));
				output1.write(SysGridFormBeansUtil.formGridByCardFunction3_NACT(sList,mainform));
				output1.write(paramas[1].toString());
				output1.write(CardAndCardFormBeansUtil.endFunction());
				output1.write("</script>\n</body>\n</html>");
				output1.close();
			} catch (Exception e) {  
				e.printStackTrace();logger.error(e.getMessage(),e);
			}  
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();logger.error(e.getMessage(),e);
		} 
		return null;
	}
	
	@Override
	public String buildFullTabForm(SysFormconfigCache form,
			SysRequestParam request,String isApp) {
		try {
			StringBuffer[] sbs = form.showPage(request,"",null,null,0);
			String userId = request.getSession().getAttribute("userid")+"";
			//获取主表信息
			String mstFormId = String.valueOf(form.getFormDefId());
			SysFormconfigMstTabCache sMst= form.getMstTab();
			//通过主表Id获取html
			StringBuffer[] mst = sysformconfigService.getForm(sMst.getPojo().getMstTabMainFormId().toString()).showPage(request,"",null,null,0);
			//获取附表信息
			String mstId = String.valueOf(sMst.getMstTabId());
			SysFormconfigMstTabDetailExample example2 = new SysFormconfigMstTabDetailExample();
			example2.or().andMstTabIdEqualTo(new BigDecimal(mstId));
			List<SysFormconfigMstTabDetail> sDetailMsts= sysDetailMapper.selectByExample(example2);
			
			String exportMstTabDetail = "function exportData(fieldArray,formId){\n";
			for (int i = 0; i < sDetailMsts.size(); i++) {
				exportMstTabDetail +="    if(formId=="+sDetailMsts.get(i).getTabDetailFormId()+"){\n";
				exportMstTabDetail +="        exportData_"+sDetailMsts.get(i).getTabDetailFormId()+"(fieldArray);\n";
				exportMstTabDetail +="    }\n";
			}
			exportMstTabDetail +="}\n";
			
			//获取参数表信息
			SysFormGeneralParamExample example3 = new SysFormGeneralParamExample();
			example3.or().andParamTypeValueEqualTo(new BigDecimal(mstFormId));
			List<SysFormGeneralParam> sysFormGeneralParams= sysFormGeneralParamMapper.selectByExample(example3);
			
			StringBuffer[] expands = expandHtml(sMst);
			StringBuffer[] detailMst = detailMstHtml(sDetailMsts,sMst,request);
			StringBuffer[] paramas = paramaHtml(sysFormGeneralParams,request);
			
//			String path11 = findSysFormFolderTreeById(form.getPojoform().getFormDefFolderId().intValue(),"");
			String path11 = form.getFormTreePath();

			form.getPojoform().setFormSubmitUrl(path11+form.getPojoform().getFormDefCode()+".jsp");
//			sysFormconfigMapper.updateByPrimaryKeyWithBLOBs(form.getPojoform());
			Map map = new HashMap();
			map.put("submitUrl", path11+form.getPojoform().getFormDefCode()+".jsp");
			map.put("formDefId", form.getFormDefId());
			sysFormconfigMapperExpand.updateSubmitUrl(map);
	
			logger.info(path11);
			//获取文件路径和文件名
			String path="C:/MyeHR/MyeHR_MSSQL/jsp/"+path11;
			String path1 =  request.getPath()+"\\"+path11;
//			String path1= "E:/SqlServer/myeclipse/apache-tomcat-6.0.45/webapps/myehr/jsp/formbuild/"+path11;
			//生成文件
			//SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
			
			CreateFileUtil.createDir(path);
			CreateFileUtil.createDir(path1);
			
			try {  
				File f = new File(path+"/"+form.getPojoform().getFormDefCode()+".jsp");
				File f1 = new File(path1+"/"+form.getPojoform().getFormDefCode()+".jsp"); 
				if (f.exists()) {  
					System.out.print("文件存在");  
				} else {  
					System.out.print("文件不存在");  
					f.createNewFile();// 不存在则创建
				}
				OutputStreamWriter write = new OutputStreamWriter(new FileOutputStream(f),"utf-8");
				BufferedWriter output=new BufferedWriter(write);
				//html
				output.write(expands[0].toString());
				output.write(expands[6].toString());
				output.write(detailMst[0].toString());
				output.write(expands[2].toString()); 
				output.write(detailMst[1].toString());
				output.write(mst[11].toString());
				output.write(expands[4].toString());
				//js
				output.write(mst[3].toString());  
				output.write(mst[4].toString());
				output.write(mst[18].toString());
				output.write(detailMst[2].toString());
				output.write(mst[28].toString());
				output.write(expands[3].toString());
				output.write(mst[29].toString());
				
				output.write(detailMst[3].toString());
				output.write(paramas[1].toString());
				output.write(mst[30].toString());
//				output.write(detailMst[10].toString());
				
				
				output.write(detailMst[4].toString());
				output.write(mst[20].toString());
				output.write(mst[36].toString());
				output.write(mst[37].toString());
				output.write(mst[0].toString());
				output.write(mst[21].toString());
				output.write(paramas[0].toString());
				output.write(detailMst[9].toString());
				output.write(mst[32].toString());
				output.write(mst[31].toString());
				output.write(detailMst[5].toString());
				output.write(mst[22].toString());
				
				output.write(detailMst[7].toString());
				output.write(mst[7].toString());
				
				output.write(detailMst[8].toString());
				output.write(mst[8].toString());
				
				output.write(mst[25].toString());
				output.write(mst[27].toString());
				output.write(mst[26].toString());
				output.write(exportMstTabDetail);
				
				output.write(mst[19].toString());
				
				output.close();  
				if (f1.exists()) {  
					System.out.print("文件存在");  
				} else {  
					System.out.print("文件不存在");  
					f1.createNewFile();// 不存在则创建
				}
				OutputStreamWriter write1 = new OutputStreamWriter(new FileOutputStream(f1),"utf-8");
				BufferedWriter output1=new BufferedWriter(write1);
				//html
				output1.write(expands[0].toString());
				output1.write(expands[6].toString());
				output1.write(detailMst[0].toString());
				output1.write(expands[2].toString()); 
				output1.write(detailMst[1].toString());
				output1.write(mst[11].toString());
				output1.write(expands[4].toString());
				//js
				output1.write(mst[3].toString());  
				output1.write(mst[4].toString());
				output1.write(mst[18].toString());
				output1.write(detailMst[2].toString());
				output1.write(mst[28].toString());
				output1.write(expands[3].toString());
				output1.write(mst[29].toString());
				
				output1.write(detailMst[3].toString());
				output1.write(paramas[1].toString());
				output1.write(mst[30].toString());
//				output1.write(detailMst[10].toString());
				
				
				output1.write(detailMst[4].toString());
				output1.write(mst[20].toString());
				output1.write(mst[36].toString());
				output1.write(mst[37].toString());
				output1.write(mst[0].toString());
				output1.write(mst[21].toString());
				output1.write(paramas[0].toString());
				output1.write(detailMst[9].toString());
				output1.write(mst[32].toString());
				output1.write(mst[31].toString());
				output1.write(detailMst[5].toString());
				output1.write(mst[22].toString());
				
				output1.write(detailMst[7].toString());
				output1.write(mst[7].toString());
				
				output1.write(detailMst[8].toString());
				output1.write(mst[8].toString());
				
				output1.write(mst[25].toString());
				output1.write(mst[27].toString());
				output1.write(mst[26].toString());
				output1.write(exportMstTabDetail);
				
				output1.write(mst[19].toString());
				
				output1.close();  
				
			} catch (Exception e) {  
				e.printStackTrace();logger.error(e.getMessage(),e);
			}  
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();logger.error(e.getMessage(),e);
		} 
		return null;
	}

	private StringBuffer[] paramaHtml(
			List<SysFormGeneralParam> sysFormGeneralParams,
			SysRequestParam request) {
		StringBuffer[] params = new StringBuffer[20];
		for(int i=0;i<15;i++){
			params[i] = new StringBuffer();
		}
		for (SysFormGeneralParam sysFormGeneralParam : sysFormGeneralParams) {
			params[0].append(SysCardFormBeansUtil.getNbsp(4)+sysFormGeneralParam.getParamName().toUpperCase()+"= row."+sysFormGeneralParam.getParamFromValue().toUpperCase()+";\n");
			params[1].append("var " +sysFormGeneralParam.getParamName().toUpperCase()+";\n");
		}
		return params;
	}
	
	private StringBuffer[] paramaHtmlCardToCard(SysFormconfigCache form, List<SysFormGeneralParam> sysFormGeneralParams) {
		StringBuffer[] params = new StringBuffer[20];
		for(int i=0;i<2;i++){
			params[i] = new StringBuffer();
		}
		List<SysFormColumnCache> columns= form.getColumns();
		params[1].append("		if(arr.length>0){\n");
		for (SysFormGeneralParam sysFormGeneralParam : sysFormGeneralParams) {
			/*String paramName = sysFormGeneralParam.getParamName();
			for (int i = 0; i < columns.size(); i++) {
				String columnCode = columns.get(i).getFormFiledTablename();
				String columnTable = columns.get(i).getFormEntityTablename();
				if (paramName.equals(columnCode)) {
					params[0].append(SysCardFormBeansUtil.getNbsp(4)+sysFormGeneralParam.getParamName()+"= document.getElementById(\""+columnTable+"."+columnTable.replace("_", "")+"_"+columnCode+"_"+form.getFormDefId()+"\").value;\n");
					params[1].append("var " +sysFormGeneralParam.getParamName()+";\n");
				}
			}*/
			params[1].append("			"+sysFormGeneralParam.getParamName().toUpperCase()+"_parameter = arr[0]."+sysFormGeneralParam.getParamFromValue().toUpperCase()+";\n");
		}
		params[1].append("		}\n");
		return params;
	}

	private StringBuffer[] detailMstHtml(List<SysFormconfigMstTabDetail> sDetailMsts,SysRequestParam request,List<SysFormconfigCache> formList) throws Exception {
		// TODO Auto-generated method stub
		StringBuffer[] detailMst = new StringBuffer[20];
		String userId = request.getSession().getAttribute("userid")+"";
		for(int i=0;i<19;i++){
			detailMst[i] = new StringBuffer();
		}
		int i = 0;
		int y = 0;
		
		for (SysFormconfigMstTabDetail sDetail1 : sDetailMsts) {
			detailMst[15].append(SysCardFormBeansUtil.getNbsp(1)+"var x"+y+"=0;\n");
			y++;
		}
		y=0;
		detailMst[15].append(	SysCardFormBeansUtil.getNbsp(1)+"$('#myTab a').click(function (e) {\n"+
								SysCardFormBeansUtil.getNbsp(3)+"e.preventDefault();\n"+
								SysCardFormBeansUtil.getNbsp(3)+"var x = $(this)[0].innerHTML;\n");
		
		for (SysFormconfigMstTabDetail sDetail : sDetailMsts) {

			String detailMstFormId = String.valueOf(sDetail.getTabDetailFormId());
			SysFormconfigCache sCache = sysformconfigService.getForm(detailMstFormId);
			formList.add(sCache);
			String initQuery = "";
			if (y!=0) {
				initQuery = "querys_"+sDetail.getTabDetailFormId()+"();\n";
			}
			
			detailMst[15].append(	SysCardFormBeansUtil.getNbsp(1)+"if(x==\""+sDetail.getTabDetailFormTitle()+"\"){\n"+
									SysCardFormBeansUtil.getNbsp(3)+"if(x"+y+"==0){\n"+
									SysCardFormBeansUtil.getNbsp(3)+initQuery+
									SysCardFormBeansUtil.getNbsp(3)+"changeQueryGrid2('"+sCache.getFormDefCode()+"_List');\n"+
									SysCardFormBeansUtil.getNbsp(3)+"$(this).tab('show');\n"+
									SysCardFormBeansUtil.getNbsp(3)+"var tab = this.hash;\nvar tab2 = $(tab).find('table').bootstrapTable('refresh');\n"+
									SysCardFormBeansUtil.getNbsp(3)+"}else{\n"+
									SysCardFormBeansUtil.getNbsp(3)+"$(this).tab('show');\n"+
									SysCardFormBeansUtil.getNbsp(3)+"var tab = this.hash;\nvar tab2 = $(tab).find('table').bootstrapTable('refresh');\n"+
									SysCardFormBeansUtil.getNbsp(3)+"}\n"+
									SysCardFormBeansUtil.getNbsp(3)+"x"+y+"++;\n"+
									SysCardFormBeansUtil.getNbsp(3)+"}\n");
					y++;
			
			i++;
			String str1 = " ";
			String str2 = " ";
			if (i==1) {
				str1 = " class=\"active\"";
				str2 = " active";
			}
			detailMst[0].append(SysCardFormBeansUtil.getNbsp(2)+"<li"+str1+"><a href=\"#Tab_"+i+"\">"+sDetail.getTabDetailFormTitle()+"</a></li>\n");
			
			detailMst[1].append(SysCardFormBeansUtil.getNbsp(2)+"<div class=\"tab-pane"+str2+"\" id=\"Tab_"+i+"\">\n" +
								SysCardFormBeansUtil.getNbsp(3)+"<div class=\"container-fluid\">\n"+
								SysCardFormBeansUtil.getNbsp(4)+"<div style=\"\">\n");
			
			//通过主表Id获取html
			StringBuffer[] mst = sCache.showPage(request,"",null,null,0);
			detailMst[1].append(mst[24]);
			detailMst[1].append(mst[6]);
			detailMst[1].append(mst[33]);
			detailMst[1].append(mst[17]);
			detailMst[1].append(SysCardFormBeansUtil.getNbsp(2)+"</div>\n</div>\n</div>\n");
			//从表js
			detailMst[2].append(mst[1]);//querys
			detailMst[2].append(mst[28]);//querys

			detailMst[12].append(mst[55]);//querys
			detailMst[13].append(mst[23]);//querys
			if (i==1) {
				detailMst[16].append(mst[1]+";");//querys
				detailMst[16].append(mst[28]);
			}
			detailMst[3].append(mst[30]);//_formId
			detailMst[4].append(mst[20]);//function querys
			detailMst[4].append(mst[36]);
			detailMst[4].append(mst[37]);
			detailMst[4].append(mst[0]);
			detailMst[4].append(mst[21]);
			detailMst[4].append(mst[31]);
			detailMst[5].append(mst[22]);//function refresh
//			detailMst[6].append(mst[23]);//查询条件与分页数据
			detailMst[7].append(mst[7]);//按钮方法
			detailMst[8].append(mst[8]);//
			detailMst[8].append(mst[2]);//
			detailMst[8].append(mst[47]);//
			
			detailMst[9].append(SysCardFormBeansUtil.getNbsp(4)+"$('#"+sCache.getFormDefCode()+"_List').bootstrapTable('refresh');\n");
			
			detailMst[10].append(mst[40]);
			//批量修改js
			detailMst[11].append(SysGridFormBeansUtil.getBuildJsp6ForBatchEdit(sCache));
			detailMst[11].append(mst[57].toString());
			detailMst[11].append("]\n})\n}\n");
			detailMst[11].append(SysGridFormBeansUtil.getBuildJspForBatchEditJs(sCache));
			
			detailMst[17].append(mst[63]);
			detailMst[18].append(detailMstFormId+",");

			if (mst[49]!=null&&mst[49].toString().equals("true")) {
				detailMst[14].append("$(\"#Tab_"+i+" .fixed-table-toolbar\").css(\"margin-top\",\"49px\");\n");//列表头调节
			}
		}
		detailMst[15].append(SysCardFormBeansUtil.getNbsp(1)+"});\n");
		//detailMst[11].append(CardAndCardFormBeansUtil.getDictInfoByForms(formList, sysformconfigService));
		return detailMst;
	}
	
	private StringBuffer[] detailCardMstHtml(List<SysFormconfigMstTabDetail> sDetailMsts,SysRequestParam request) throws Exception {
		// TODO Auto-generated method stub
		StringBuffer[] detailMst = new StringBuffer[20];
		String userId = request.getSession().getAttribute("userid")+"";
		for(int i=0;i<15;i++){
			detailMst[i] = new StringBuffer();
		}
		int i = 0;
		for (SysFormconfigMstTabDetail sDetail : sDetailMsts) {
			SysFormconfigWithBLOBs sCache = sysFormconfigMapper.selectByPrimaryKey(sDetail.getTabDetailFormId());
			i++;
			String detailMstFormId = String.valueOf(sDetail.getTabDetailFormId());
			String followFormHtml ="<div style=\"border-bottom:solid 5px #dddddd;width:300px;margin-left:15px;text-align:left;font-size:18px\">"+sCache.getFormDefName()+"</div>\n"
					+"<form id=\"form_"+detailMstFormId+"\" name=\"form_"+detailMstFormId+"\" >\n"
					+"<div class=\"container-fluid\" style=\"overflow-y:auto;height:100%;\">\n"
					+SysCardFormBeansUtil.getNbsp(1)+"<div class='my_card' style=\"margin-top:5px;padding-bottom:50px;\">\n";
			detailMst[0].append(followFormHtml);
			//通过主表Id获取html
			StringBuffer[] mst = sysformconfigService.getForm(detailMstFormId).showPage(request,"",null,"follow",0);
			detailMst[0].append(mst[3]);
			detailMst[0].append(mst[0]);
			detailMst[0].append(mst[1]);
			detailMst[0].append(mst[11]);
			detailMst[1].append(mst[5]);
			detailMst[2].append("_initData_"+sDetail.getTabDetailFormId()+"();\n");
			detailMst[3].append("var _formId_"+sDetail.getTabDetailFormId()+"= '"+sDetail.getTabDetailFormId()+"';\n");
			
		}
		return detailMst;
	}
	
	private StringBuffer[] detailCardAndCardHtml(List<SysFormconfigMstTabDetailCache> sDetailMsts,SysRequestParam request, SysFormconfigCache form,List<SysFormconfigCache> formList) throws Exception {
		// TODO Auto-generated method stub
		StringBuffer[] detailMst = new StringBuffer[23];
		String userId = request.getSession().getAttribute("userid")+"";
		for(int i=0;i<23;i++){
			detailMst[i] = new StringBuffer();
		}
		int i = 1;//tab数
		/*
		 * detailMst[0]:addFunction增加方法
		 * detailMst[2]:showDate_3863展开方法
		 * detailMst[3]:showDate_3864未展开方法
		 * detailMst[4]:showAccount合计方法
		 * detailMst[5]:updateElement修改控件方法
		 * detailMst[6]:ParamByFubiao基础参数定义
		 * detailMst[7]:SimpleJsByFubiao基础方法定义
		 * detailMst[8]:loadDataStart2()
		 * detailMst[9]:loadDataStart3()
		 * detailMst[10]:loadDataStart4()
		 * detailMst[11]:附表过滤js
		 * detailMst[12]:changeShowType
		 * detailMst[1]:按钮html
		 * detailMst[15]:initAddValue()
		 * detailMst[16]:valueChange
		 * detailMst[17]:initConfigs
		 * detailMst[19]:checkedfileManage
		 * detailMst[20]:FormfileManage
		 * detailMst[21]:cardtocardConfig
		 * detailMst[22]:字典信息
		 */
		if(form.getPojoform().getIsFilemanage()!=null&&(form.getPojoform().getIsFilemanage().equals("checkedAndForm")||form.getPojoform().getIsFilemanage().equals("OnlyChecked"))){
			SysFileButtonRoleExample example = new SysFileButtonRoleExample();
			example.or().andFormIdEqualTo(form.getPojoform().getFormDefId());
			List<SysFileButtonRole> roles = sFileButtonRoleMapper.selectByExample(example);
			String yulanButton = "false";
			String deleteButton = "false";
			String uploadButton = "false";
			String shangchuanButton = "false";
			for (SysFileButtonRole sysFileButtonRole : roles) {
				if (sysFileButtonRole.getButtonCode().equals("文件上传")&&!sysFileButtonRole.getButtonRoleRemark().equals("3")) {
					shangchuanButton = "true";
				}
				if (sysFileButtonRole.getButtonCode().equals("文件预览")&&!sysFileButtonRole.getButtonRoleRemark().equals("3")) {
					yulanButton = "true";						
				}
				if (sysFileButtonRole.getButtonCode().equals("文件删除")&&!sysFileButtonRole.getButtonRoleRemark().equals("3")) {
					deleteButton = "true";
				}
				if (sysFileButtonRole.getButtonCode().equals("文件下载")&&!sysFileButtonRole.getButtonRoleRemark().equals("3")) {
					uploadButton = "true";
				}
			}
			detailMst[19].append("initFileManage1("+shangchuanButton+","+yulanButton+","+deleteButton+","+uploadButton+",'','fubiao"+sDetailMsts.size()+"');\n");
		}
		String sizeLimit = "50000";
		String typeLimit = "null";
		String numLimit = "1";
		if (form.getPojoform().getFileuploadConfig()!=null) {
			SysFileuploadConfig fileuploadConfig = fileuploadConfigMapper.selectByPrimaryKey(new BigDecimal(form.getPojoform().getFileuploadConfig()));
			if (fileuploadConfig.getNumLimit()!=null&&!fileuploadConfig.getNumLimit().equals("")) {
				numLimit = fileuploadConfig.getNumLimit()+"";
			}
			if (fileuploadConfig.getSizeLimit()!=null&&!fileuploadConfig.getSizeLimit().equals("")){
				sizeLimit = fileuploadConfig.getSizeLimit()+"";
			}
			if (fileuploadConfig.getTypeLimit()!=null&&!fileuploadConfig.getTypeLimit().equals("")){
				String[] types = fileuploadConfig.getTypeLimit().split(",");
				typeLimit = "[";
				for (int j = 0; j < types.length; j++) {
					if (types[j].equals("*")) {
						typeLimit = "null";
						break;
					}else {
						typeLimit += "'"+types[j]+"',";
					} 
				}
				if (!typeLimit.equals("null")) {
					typeLimit = typeLimit.substring(0, typeLimit.length()-1)+"]";
				}
			}
		}
		if(form.getPojoform().getIsFilemanage()!=null&&(form.getPojoform().getIsFilemanage().equals("checkedAndForm")||form.getPojoform().getIsFilemanage().equals("OnlyForm"))){
			detailMst[20].append("var sizeLimit = '"+sizeLimit+"';\n");
			detailMst[20].append("var typeLimit = "+typeLimit+";\n");
			detailMst[20].append("var numLimit = \""+numLimit+"\";\n");
			detailMst[20].append("initFileManage2('','','','','','fubiao"+sDetailMsts.size()+"',numLimit,sizeLimit,typeLimit,'ACT_BUSSINESSID',BUSSINESSID_ACT);\n");
		}
		detailMst[0].append(CardAndCardFormBeansUtil.addFunctionJsForCC1());
		detailMst[2].append(CardAndCardFormBeansUtil.showDate_3863JsForCC1());
		detailMst[3].append(CardAndCardFormBeansUtil.showDate_3864JsForCC1());
		detailMst[4].append(CardAndCardFormBeansUtil.showAccountJsForCC1());
		detailMst[5].append(CardAndCardFormBeansUtil.updateElementJsForCC1());
		detailMst[7].append(CardAndCardFormBeansUtil.SimpleJsByFubiao(sDetailMsts.size()+""));
		detailMst[8].append(CardAndCardFormBeansUtil.loadDataStart2JsForCC1());
		detailMst[9].append(CardAndCardFormBeansUtil.loadDataStart3JsForCC1());
		detailMst[10].append(CardAndCardFormBeansUtil.loadDataStart4JsForCC1());
		detailMst[15].append(CardAndCardFormBeansUtil.initAddValueJsForCC1());
		detailMst[5].append("console.time('updateElementJs');\n");
		String peizhi =sDetailMsts.get(0).getPojo().getTabDetailConfig();
		for (SysFormconfigMstTabDetailCache sDetail : sDetailMsts) {
			SysFormconfigCache sCache = sDetail.getForm();
			String detailMstFormId = String.valueOf(sDetail.getTabDetailFormId());
			SysFormconfigCache formCache = sysformconfigService.getForm(detailMstFormId);
			formList.add(formCache);
			StringBuffer[] mst = formCache.showPage(request,"CARDANDCARD",null,"follow",i);
			detailMst[0].append(CardAndCardFormBeansUtil.addFunctionJsForCC2(i+"",mst[0],detailMstFormId));//
			detailMst[1].append(CardAndCardFormBeansUtil.fubiaoHtml(i+"",sDetail.getTabDetailFormTitle()));
			detailMst[2].append(CardAndCardFormBeansUtil.showDate_3863JsForCC2(i+"",mst[69],mst[62],mst[61]));
			detailMst[3].append(CardAndCardFormBeansUtil.showDate_3864JsForCC2(i+"",mst[69],mst[62],mst[61],detailMstFormId,peizhi));
			detailMst[4].append(CardAndCardFormBeansUtil.showAccountJsForCC2(i+"",mst[63],mst[64]));
			detailMst[5].append(CardAndCardFormBeansUtil.updateElementJsForCC2(i+"",mst[65],mst[66],mst[67]));
			detailMst[6].append(CardAndCardFormBeansUtil.ParamByFubiao(i+""));
			detailMst[8].append(CardAndCardFormBeansUtil.loadDataStart2JsForCC2(i+"",sCache.getFormDefCode()));
			detailMst[9].append(CardAndCardFormBeansUtil.loadDataStart3JsForCC2(i+"",sCache.getFormDefCode()));
			detailMst[10].append(CardAndCardFormBeansUtil.loadDataStart4JsForCC2(i+"",sCache.getFormDefCode()));
			detailMst[11].append(mst[8]);
			detailMst[12].append("changeShowType('fubiao"+i+"');\n");
			detailMst[13].append(mst[55]);
			detailMst[13].append("var _formId_"+sCache.getFormDefId()+"='"+sCache.getFormDefId()+"';\n");
			detailMst[14].append(mst[68]);
			detailMst[14].append(mst[40]);
			detailMst[15].append(CardAndCardFormBeansUtil.initAddValueJsForCC2(i+"",mst[1]));
			detailMst[16].append(mst[3]);
			String[] configs =  sDetail.getPojo().getTabDetailConfig().split(",");
			if(configs[2].equals("Y")){//默认有效
				detailMst[17].append("$(\"#fubiao"+i+" #showType\").val('youxiao');\n");
			}else if(configs[3].equals("Y")){//默认最新
				detailMst[17].append("$(\"#fubiao"+i+" #showType\").val('zuixin');\n");
			}else {//默认所有
				detailMst[17].append("$(\"#fubiao"+i+" #showType\").val('all');\n");
			}
			if (configs[1].equals("N")) {//是否合计
				detailMst[18].append("$(\"#fubiao"+i+" #showContent\").remove();\n");
				detailMst[18].append("$(\"#fubiao"+i+" #TEST_FEE_INFO_FORM\").remove();\n");
			}
			if (configs[0].equals("Y")) {//是否展开
				detailMst[18].append("changeFunction('fubiao"+i+"');\n");
			}
			detailMst[21].append("<a href=\"#fubiao"+i+"\"  class=\"maodianA\"><input type=\"text\" class=\"maodian form-control\" readonly value=\""+sDetail.getTabDetailFormTitle()+"\"/></a>\n");
			i++;
		}
		detailMst[0].append("changeCssForApp4();\n");
		detailMst[5].append("changeCssForApp3();\n");
		detailMst[5].append("console.timeEnd('updateElementJs');\n");
		detailMst[0].append(CardAndCardFormBeansUtil.endFunction());
		detailMst[2].append(CardAndCardFormBeansUtil.endFunction());
		detailMst[3].append(CardAndCardFormBeansUtil.endFunction());
		detailMst[4].append(CardAndCardFormBeansUtil.endFunction());
		detailMst[5].append(CardAndCardFormBeansUtil.endFunction());
		detailMst[8].append(CardAndCardFormBeansUtil.endFunction());
		detailMst[9].append(CardAndCardFormBeansUtil.endFunction());
		detailMst[10].append(CardAndCardFormBeansUtil.endFunction());
		detailMst[15].append(CardAndCardFormBeansUtil.endFunction());
		//detailMst[22].append(CardAndCardFormBeansUtil.getDictInfoByForms(formList, sysformconfigService));
		//detailMst[22].append(CardAndCardFormBeansUtil.getDictNameByForms(formList, sysformconfigService));
		return detailMst;
	}
	
	private StringBuffer[] detailCardAndCardHtml_ACT(List<SysFormconfigMstTabDetail> sDetailMsts,SysRequestParam request, SysFormconfigCache form,String taskId,String nodeId,List<SysFormconfigCache> formList) throws Exception {
		// TODO Auto-generated method stub
		StringBuffer[] detailMst = new StringBuffer[26];
		String userId = request.getSession().getAttribute("userid")+"";
		for(int i=0;i<26;i++){
			detailMst[i] = new StringBuffer();
		}
		int i = 1;//tab数
		/*
		 * detailMst[0]:addFunction增加方法
		 * detailMst[2]:showDate_3863展开方法
		 * detailMst[3]:showDate_3864未展开方法
		 * detailMst[4]:showAccount合计方法
		 * detailMst[5]:updateElement修改控件方法
		 * detailMst[6]:ParamByFubiao基础参数定义
		 * detailMst[7]:SimpleJsByFubiao基础方法定义
		 * detailMst[8]:loadDataStart2()
		 * detailMst[9]:loadDataStart3()
		 * detailMst[10]:loadDataStart4()
		 * detailMst[11]:附表过滤js
		 * detailMst[12]:changeShowType
		 * detailMst[1]:按钮html
		 * detailMst[15]:initAddValue()
		 * detailMst[16]:valueChange
		 * detailMst[17]:initConfigs
		 * detailMst[19]:checkedfileManage
		 * detailMst[20]:FormfileManage
		 * detailMst[21]:checkedfileManage
		 * detailMst[25]:字典信息
		 */
		SysFileButtonRoleExample example = new SysFileButtonRoleExample();
		example.or().andFormIdEqualTo(form.getPojoform().getFormDefId());
		List<SysFileButtonRole> roles = sFileButtonRoleMapper.selectByExample(example);
		String yulanButton = "false";
		String deleteButton = "false";
		String uploadButton = "false";
		String shangchuanButton = "false";
		for (SysFileButtonRole sysFileButtonRole : roles) {
			if (sysFileButtonRole.getButtonCode().equals("文件上传")&&!sysFileButtonRole.getButtonRoleRemark().equals("3")) {
				shangchuanButton = "true";
			}
			if (sysFileButtonRole.getButtonCode().equals("文件预览")&&!sysFileButtonRole.getButtonRoleRemark().equals("3")) {
				yulanButton = "true";						
			}
			if (sysFileButtonRole.getButtonCode().equals("文件删除")&&!sysFileButtonRole.getButtonRoleRemark().equals("3")) {
				deleteButton = "true";
			}
			if (sysFileButtonRole.getButtonCode().equals("文件下载")&&!sysFileButtonRole.getButtonRoleRemark().equals("3")) {
				uploadButton = "true";
			}
		}
		//detailMst[19].append("initFileManage3("+shangchuanButton+","+yulanButton+","+deleteButton+","+uploadButton+",'','fubiao"+sDetailMsts.size()+"','"+taskId+"','"+nodeId+"');\n");
		//detailMst[19].append("setinitFileManage3();\n");
		//detailMst[21].append("function setinitFileManage3(){\n" +
		//					 "initFileManage3(true,true,true,true,'','fubiao"+sDetailMsts.size()+"','"+taskId+"','"+nodeId+"',param_procInsId);\n" +
		//					 "}\n");
		String sizeLimit = "50000";
		String typeLimit = "null";
		String numLimit = "1";
		if (form.getPojoform().getFileuploadConfig()!=null) {
			SysFileuploadConfig fileuploadConfig = fileuploadConfigMapper.selectByPrimaryKey(new BigDecimal(form.getPojoform().getFileuploadConfig()));
			if (fileuploadConfig.getNumLimit()!=null&&!fileuploadConfig.getNumLimit().equals("")) {
				numLimit = fileuploadConfig.getNumLimit()+"";
			}
			if (fileuploadConfig.getSizeLimit()!=null&&!fileuploadConfig.getSizeLimit().equals("")){
				sizeLimit = fileuploadConfig.getSizeLimit()+"";
			}
			if (fileuploadConfig.getTypeLimit()!=null&&!fileuploadConfig.getTypeLimit().equals("")){
				String[] types = fileuploadConfig.getTypeLimit().split(",");
				typeLimit = "[";
				for (int j = 0; j < types.length; j++) {
					if (types[j].equals("*")) {
						typeLimit = "null";
						break;
					}else {
						typeLimit += "'"+types[j]+"',";
					} 
				}
				if (!typeLimit.equals("null")) {
					typeLimit = typeLimit.substring(0, typeLimit.length()-1)+"]";
				}
			}
		}
		if(form.getPojoform().getIsFilemanage()!=null&&(form.getPojoform().getIsFilemanage().equals("checkedAndForm")||form.getPojoform().getIsFilemanage().equals("OnlyForm"))){
			detailMst[20].append("var sizeLimit = '"+sizeLimit+"';\n");
			detailMst[20].append("var typeLimit = "+typeLimit+";\n");
			detailMst[20].append("var numLimit = \""+numLimit+"\";\n");
			detailMst[20].append("var userId = '${sessionScope.userid}';\n");
			detailMst[20].append("initFileManage2His('','','','','','fubiao"+sDetailMsts.size()+"',numLimit,sizeLimit,typeLimit,'ACT_BUSSINESSID_${param.key}_'+BUSSINESSID_ACT,userId);\n");
			detailMst[20].append("initFileManage2New('','','','','','fubiao"+sDetailMsts.size()+"',numLimit,sizeLimit,typeLimit,'ACT_BUSSINESSID_${param.key}_'+BUSSINESSID_ACT,userId);\n");
			
		}
		detailMst[0].append(CardAndCardFormBeansUtil.addFunctionJsForCC1());
		detailMst[2].append(CardAndCardFormBeansUtil.showDate_3863JsForCC1());
		detailMst[3].append(CardAndCardFormBeansUtil.showDate_3864JsForCC1());
		detailMst[4].append(CardAndCardFormBeansUtil.showAccountJsForCC1());
		detailMst[5].append(CardAndCardFormBeansUtil.updateElementJsForCC1());
		detailMst[7].append(CardAndCardFormBeansUtil.SimpleJsByFubiao(sDetailMsts.size()+""));
		detailMst[8].append(CardAndCardFormBeansUtil.loadDataStart2JsForCC1());
		detailMst[9].append(CardAndCardFormBeansUtil.loadDataStart3JsForCC1());
		detailMst[10].append(CardAndCardFormBeansUtil.loadDataStart4JsForCC1());
		detailMst[15].append(CardAndCardFormBeansUtil.initAddValueJsForCC1());
		detailMst[5].append("console.time('updateElementJs');\n");
		for (SysFormconfigMstTabDetail sDetail : sDetailMsts) {
			SysFormconfigWithBLOBs sCache = sysFormconfigMapper.selectByPrimaryKey(sDetail.getTabDetailFormId());
			String detailMstFormId = String.valueOf(sDetail.getTabDetailFormId());
			SysFormconfigCache formCache = sysformconfigService.getForm(detailMstFormId);
			formList.add(formCache);
			StringBuffer[] mst = formCache.showPage(request,"CARDANDCARD",null,"follow",i);
			
			String[] configs =  sDetail.getTabDetailConfig().split(",");
		//	[Y, N, Y, Y, Y, N, Y, N]
			if(configs.length>5){
			if(configs[5].equals("Y")){//默认有效
				detailMst[17].append("$(\"#fubiao"+i+" #showType\").val('youxiao');\n");
			}else if(configs[6].equals("Y")){//默认最新
				detailMst[17].append("$(\"#fubiao"+i+" #showType\").val('zuixin');\n");
			}else if(configs[7].equals("Y")){//默认所有
				detailMst[17].append("$(\"#fubiao"+i+" #showType\").val('all');\n");
			}
			if (configs[1].equals("N")) {//是否合计
				detailMst[18].append("$(\"#fubiao"+i+" #showContent\").remove();\n");
				detailMst[18].append("$(\"#fubiao"+i+" #TEST_FEE_INFO_FORM\").remove();\n");
			}
			if (configs[0].equals("Y")) {//是否展开
				detailMst[18].append("changeFunction('fubiao"+i+"');\n");
			}
			if (configs.length>5&&configs[2].equals("N")) {//是否新增
				detailMst[18].append("$(\"#fubiao"+i+" #xinzeng\").remove();\n");
			}else{
				detailMst[0].append(CardAndCardFormBeansUtil.addFunctionJsForCC2(i+"",mst[0],detailMstFormId));//
			}
			}else{
				if(configs[2].equals("Y")){//默认有效
					detailMst[17].append("$(\"#fubiao"+i+" #showType\").val('youxiao');\n");
				}else if(configs[3].equals("Y")){//默认最新
					detailMst[17].append("$(\"#fubiao"+i+" #showType\").val('zuixin');\n");
				}else if(configs[4].equals("Y")){//默认所有
					detailMst[17].append("$(\"#fubiao"+i+" #showType\").val('all');\n");
				}
				if (configs[1].equals("N")) {//是否合计
					detailMst[18].append("$(\"#fubiao"+i+" #showContent\").remove();\n");
					detailMst[18].append("$(\"#fubiao"+i+" #TEST_FEE_INFO_FORM\").remove();\n");
				}
				if (configs[0].equals("Y")) {//是否展开
					detailMst[18].append("changeFunction('fubiao"+i+"');\n");
				}
				if (configs.length>5&&configs[5].equals("N")) {//是否新增
					detailMst[18].append("$(\"#fubiao"+i+" #xinzeng\").remove();\n");
				}else{
					detailMst[0].append(CardAndCardFormBeansUtil.addFunctionJsForCC2(i+"",mst[0],detailMstFormId));//
				}

			}
			String peizhi=sDetailMsts.get(0).getTabDetailConfig();
			detailMst[23].append(CardAndCardFormBeansUtil.fubiaoHtml(i+"",sDetail.getTabDetailFormTitle()));
			detailMst[1].append(CardAndCardFormBeansUtil.fubiaoHtml(i+"",sDetail.getTabDetailFormTitle()));
			detailMst[2].append(CardAndCardFormBeansUtil.showDate_3863JsForCC2(i+"",mst[69],mst[62],mst[61]));
			detailMst[3].append(CardAndCardFormBeansUtil.showDate_3864JsForCC2(i+"",mst[69],mst[62],mst[61],detailMstFormId,peizhi));
			detailMst[4].append(CardAndCardFormBeansUtil.showAccountJsForCC2(i+"",mst[63],mst[64]));
			detailMst[5].append(CardAndCardFormBeansUtil.updateElementJsForCC2(i+"",mst[65],mst[66],mst[67]));
			detailMst[6].append(CardAndCardFormBeansUtil.ParamByFubiao(i+""));
			detailMst[8].append(CardAndCardFormBeansUtil.loadDataStart2JsForCC2(i+"",sCache.getFormDefCode()));
			detailMst[9].append(CardAndCardFormBeansUtil.loadDataStart3JsForCC2(i+"",sCache.getFormDefCode()));
			detailMst[10].append(CardAndCardFormBeansUtil.loadDataStart4JsForCC2(i+"",sCache.getFormDefCode()));
			detailMst[11].append(mst[8]);
			detailMst[12].append("changeShowType('fubiao"+i+"');\n");
			detailMst[13].append(mst[55]);
			detailMst[13].append("var _formId_"+sCache.getFormDefId()+"='"+sCache.getFormDefId()+"';\n");
			detailMst[14].append(mst[68]);
			detailMst[14].append(mst[40]);
			detailMst[15].append(CardAndCardFormBeansUtil.initAddValueJsForCC2(i+"",mst[1]));
			detailMst[16].append(mst[3]);
			
			detailMst[22].append("<a href=\"#fubiao"+i+"  class=\"maodianA\"><input type=\"text\" class=\"maodian form-control\" readonly value=\""+sDetail.getTabDetailFormTitle()+"\"/></a>\n");
			i++;
		}
		detailMst[0].append("changeCssForApp4();\n");
		detailMst[5].append("changeCssForApp3();\n");
		detailMst[5].append("console.timeEnd('updateElementJs');\n");
		detailMst[0].append(CardAndCardFormBeansUtil.endFunction());
		detailMst[2].append(CardAndCardFormBeansUtil.endFunction());
		detailMst[3].append(CardAndCardFormBeansUtil.endFunction());
		detailMst[4].append(CardAndCardFormBeansUtil.endFunction());
		detailMst[5].append(CardAndCardFormBeansUtil.endFunction());
		detailMst[8].append(CardAndCardFormBeansUtil.endFunction());
		detailMst[9].append(CardAndCardFormBeansUtil.endFunction());
		detailMst[10].append(CardAndCardFormBeansUtil.endFunction());
		detailMst[15].append(CardAndCardFormBeansUtil.endFunction());
//		detailMst[24].append(detailMst[1]);
		detailMst[1].append(CardAndCardFormBeansUtil.CommentTextarea());
		detailMst[1].append(CardAndCardFormBeansUtil.CommentHtml());
		//detailMst[25].append(CardAndCardFormBeansUtil.getDictInfoByForms(formList, sysformconfigService));
		//detailMst[25].append(CardAndCardFormBeansUtil.getDictNameByForms(formList, sysformconfigService));
		return detailMst;
	}
	
	private StringBuffer[] detailCardAndGridHtml_ACT(List<SysFormconfigMstTabDetail> sDetailMsts,SysRequestParam request, SysFormconfigCache form,String taskId,String nodeId,List<SysFormconfigCache> formList) throws Exception {
		// TODO Auto-generated method stub
		StringBuffer[] detailMst = new StringBuffer[25];
		String userId = request.getSession().getAttribute("userid")+"";
		for(int i=0;i<25;i++){
			detailMst[i] = new StringBuffer();
		}
		int i = 1;//tab数
		SysFileButtonRoleExample example = new SysFileButtonRoleExample();
		example.or().andFormIdEqualTo(form.getPojoform().getFormDefId());
		List<SysFileButtonRole> roles = sFileButtonRoleMapper.selectByExample(example);
		String yulanButton = "false";
		String deleteButton = "false";
		String uploadButton = "false";
		String shangchuanButton = "false";
		for (SysFileButtonRole sysFileButtonRole : roles) {
			if (sysFileButtonRole.getButtonCode().equals("文件上传")&&!sysFileButtonRole.getButtonRoleRemark().equals("3")) {
				shangchuanButton = "true";
			}
			if (sysFileButtonRole.getButtonCode().equals("文件预览")&&!sysFileButtonRole.getButtonRoleRemark().equals("3")) {
				yulanButton = "true";						
			}
			if (sysFileButtonRole.getButtonCode().equals("文件删除")&&!sysFileButtonRole.getButtonRoleRemark().equals("3")) {
				deleteButton = "true";
			}
			if (sysFileButtonRole.getButtonCode().equals("文件下载")&&!sysFileButtonRole.getButtonRoleRemark().equals("3")) {
				uploadButton = "true";
			}
		}
		String sizeLimit = "50000";
		String typeLimit = "null";
		String numLimit = "1";
		if (form.getPojoform().getFileuploadConfig()!=null) {
			SysFileuploadConfig fileuploadConfig = fileuploadConfigMapper.selectByPrimaryKey(new BigDecimal(form.getPojoform().getFileuploadConfig()));
			if (fileuploadConfig.getNumLimit()!=null&&!fileuploadConfig.getNumLimit().equals("")) {
				numLimit = fileuploadConfig.getNumLimit()+"";
			}
			if (fileuploadConfig.getSizeLimit()!=null&&!fileuploadConfig.getSizeLimit().equals("")){
				sizeLimit = fileuploadConfig.getSizeLimit()+"";
			}
			if (fileuploadConfig.getTypeLimit()!=null&&!fileuploadConfig.getTypeLimit().equals("")){
				String[] types = fileuploadConfig.getTypeLimit().split(",");
				typeLimit = "[";
				for (int j = 0; j < types.length; j++) {
					if (types[j].equals("*")) {
						typeLimit = "null";
						break;
					}else {
						typeLimit += "'"+types[j]+"',";
					} 
				}
				if (!typeLimit.equals("null")) {
					typeLimit = typeLimit.substring(0, typeLimit.length()-1)+"]";
				}
			}
		}
		if(form.getPojoform().getIsFilemanage()!=null&&(form.getPojoform().getIsFilemanage().equals("checkedAndForm")||form.getPojoform().getIsFilemanage().equals("OnlyForm"))){
			detailMst[20].append("var sizeLimit = '"+sizeLimit+"';\n");
			detailMst[20].append("var typeLimit = "+typeLimit+";\n");
			detailMst[20].append("var numLimit = \""+numLimit+"\";\n");
			detailMst[20].append("var userId = '${sessionScope.userid}';\n");
			detailMst[20].append("initFileManage2His('','','','','','fubiao"+sDetailMsts.size()+"',numLimit,sizeLimit,typeLimit,'ACT_BUSSINESSID_${param.key}_'+BUSSINESSID_ACT,userId);\n");
			detailMst[20].append("initFileManage2New('','','','','','fubiao"+sDetailMsts.size()+"',numLimit,sizeLimit,typeLimit,'ACT_BUSSINESSID_${param.key}_'+BUSSINESSID_ACT,userId);\n");
		}
		detailMst[2].append(CardAndCardFormBeansUtil.showDate_3863JsForCC1());
		detailMst[3].append(CardAndCardFormBeansUtil.showDate_3864JsForCC1());
		detailMst[4].append(CardAndCardFormBeansUtil.showAccountJsForCC1());
		detailMst[8].append(CardAndCardFormBeansUtil.loadDataStart2JsForCG1());
		detailMst[21].append(CardAndCardFormBeansUtil.loadDataStart3JsForCC1());
		detailMst[9].append(CardAndCardFormBeansUtil.loadDataStart3JsForCG1());
		detailMst[10].append(CardAndCardFormBeansUtil.loadDataStart4JsForCG1());
		for (SysFormconfigMstTabDetail sDetail : sDetailMsts) {
			SysFormconfigWithBLOBs sCache = sysFormconfigMapper.selectByPrimaryKey(sDetail.getTabDetailFormId());
			String detailMstFormId = String.valueOf(sDetail.getTabDetailFormId());
			SysFormconfigCache formCache = sysformconfigService.getForm(detailMstFormId);
			formList.add(formCache);
			StringBuffer[] mst = formCache.showPage(request,"CARDANDGRID",null,"follow",i);
			
			String[] configs =  sDetail.getTabDetailConfig().split(",");
			if(configs[2].equals("Y")){//默认有效
				detailMst[17].append("$(\"#fubiao"+i+" #showType\").val('youxiao');\n");
			}else if(configs[3].equals("Y")){//默认最新
				detailMst[17].append("$(\"#fubiao"+i+" #showType\").val('zuixin');\n");
			}else if(configs[4].equals("Y")){//默认所有
				detailMst[17].append("$(\"#fubiao"+i+" #showType\").val('all');\n");
			}
			if (configs[0].equals("Y")) {//是否展开
				detailMst[18].append("changeFunctionForGrid('fubiao"+i+"');\n");
			}
			detailMst[1].append(CardAndCardFormBeansUtil.fubiaoHtmlForGrid(i+"",sDetail.getTabDetailFormTitle()));
			detailMst[4].append(CardAndCardFormBeansUtil.showAccountJsForCG2(i+"",mst[63],mst[64]));
			detailMst[6].append(CardAndCardFormBeansUtil.ParamByFubiaoForGrid(i+""));
			detailMst[8].append(CardAndCardFormBeansUtil.loadDataStart2JsForCG2(i+"",sCache.getFormDefCode()));
			detailMst[21].append(CardAndCardFormBeansUtil.loadDataStart3JsForCC2(i+"",sCache.getFormDefCode()));

			detailMst[9].append(CardAndCardFormBeansUtil.loadDataStart3JsForCG2(i+"",sCache.getFormDefCode(),mst[57],formCache.getGrid().getPojo().getFormPageSize()+"",formCache.getGrid().getPojo().getFormPageSizeList()));
//			detailMst[10].append(CardAndCardFormBeansUtil.loadDataStart4JsForCG2(i+"",sCache.getFormDefCode()));
			detailMst[11].append(mst[8]);
			detailMst[12].append("changeShowTypeForGrid('fubiao"+i+"');\n");
			detailMst[13].append(mst[55]);
			detailMst[13].append("var _formId_"+sCache.getFormDefId()+"='"+sCache.getFormDefId()+"';\n");
			detailMst[14].append(mst[68]);
			detailMst[14].append(mst[40]);
			detailMst[16].append(mst[3]);
			detailMst[22].append("<a href=\"#fubiao"+i+"  class=\"maodianA\"><input type=\"text\" class=\"maodian form-control\" readonly value=\""+sDetail.getTabDetailFormTitle()+"\"/></a>\n");
			i++;
		}
		detailMst[2].append(CardAndCardFormBeansUtil.endFunction());
		detailMst[3].append(CardAndCardFormBeansUtil.endFunction());
		detailMst[4].append(CardAndCardFormBeansUtil.endFunction());
		detailMst[8].append(CardAndCardFormBeansUtil.endFunction());
		detailMst[21].append(CardAndCardFormBeansUtil.endFunction());
		detailMst[9].append(CardAndCardFormBeansUtil.endFunction());
		detailMst[10].append(CardAndCardFormBeansUtil.endFunction());

		detailMst[24].append(detailMst[1]);
		
		detailMst[1].append(CardAndCardFormBeansUtil.CommentTextarea());
		detailMst[1].append(CardAndCardFormBeansUtil.CommentHtml());
		return detailMst;
	}
	
	private StringBuffer[] detailMstHtml(List<SysFormconfigMstTabDetail> sDetailMsts,SysFormconfigMstTabCache sMst,SysRequestParam request) throws Exception {
		// TODO Auto-generated method stub
		StringBuffer[] detailMst = new StringBuffer[20];
		String userId = request.getSession().getAttribute("userid")+"";
		for(int i=0;i<15;i++){
			detailMst[i] = new StringBuffer();
		}
		StringBuffer[] mstHead = sysformconfigService.getForm(sMst.getPojo().getMstTabMainFormId().toString()).showPage(request,"",null,null,0);
			detailMst[0].append(SysCardFormBeansUtil.getNbsp(2)+"<li class=\"active\"><a href=\"#Tab_0\">主表</a></li>\n");				
			detailMst[1].append(SysCardFormBeansUtil.getNbsp(2)+"<div class=\"tab-pane active\" id=\"Tab_0\">\n" +
								SysCardFormBeansUtil.getNbsp(3)+"<div class=\"container-fluid\">\n"+
								SysCardFormBeansUtil.getNbsp(4)+"<div style=\"margin-top:0px;\">\n");
			
			detailMst[1].append(mstHead[24]);
			detailMst[1].append(mstHead[6]);
			detailMst[1].append(mstHead[33]);
			detailMst[1].append(mstHead[17]);
			detailMst[1].append(SysCardFormBeansUtil.getNbsp(2)+"</div>\n");
			//从表js
			detailMst[2].append(mstHead[28]);//querys
			detailMst[3].append(mstHead[30]);//_formId
			
			
		int i = 0;
		
		for (SysFormconfigMstTabDetail sDetail : sDetailMsts) {
			i++;
			String str1 = " ";
			String str2 = " ";
			
			detailMst[0].append(SysCardFormBeansUtil.getNbsp(2)+"<li"+str1+"><a href=\"#Tab_"+i+"\">"+sDetail.getTabDetailFormTitle()+"</a></li>\n");
			
			detailMst[1].append(SysCardFormBeansUtil.getNbsp(2)+"<div class=\"tab-pane"+str2+"\" id=\"Tab_"+i+"\">\n" +
								SysCardFormBeansUtil.getNbsp(3)+"<div class=\"container-fluid\">\n"+
								SysCardFormBeansUtil.getNbsp(4)+"<div style=\"margin-top:40px;\">\n");
			
			String detailMstFormId = String.valueOf(sDetail.getTabDetailFormId());
			//通过主表Id获取html
			StringBuffer[] mst = sysformconfigService.getForm(detailMstFormId).showPage(request,"",null,null,0);
			detailMst[1].append(mst[24]);
			detailMst[1].append(mst[6]);
			detailMst[1].append(mst[33]);
			detailMst[1].append(mst[17]);
			detailMst[1].append(SysCardFormBeansUtil.getNbsp(2)+"</div>\n</div>\n");
			//从表js
			detailMst[2].append(mst[28]);//querys
			detailMst[3].append(mst[30]);//_formIda
			detailMst[4].append(mst[20]);//function querys
			detailMst[4].append(mst[36]);
			detailMst[4].append(mst[37]);
			detailMst[4].append(mst[0]);
			detailMst[4].append(mst[21]);
			detailMst[4].append(mst[31]);
			detailMst[5].append(mst[22]);//function refresh
//			detailMst[6].append(mst[23]);//查询条件与分页数据
			detailMst[7].append(mst[7]);//按钮方法
			detailMst[8].append(mst[8]);//
			detailMst[8].append(mst[2]);//
			SysFormconfigWithBLOBs sCache = sysFormconfigMapper.selectByPrimaryKey(sDetail.getTabDetailFormId());
			detailMst[9].append(SysCardFormBeansUtil.getNbsp(4)+"$('#"+sCache.getFormDefCode()+"_List').bootstrapTable('refresh');\n");
			
			detailMst[10].append(mst[40]);
		}
		return detailMst;
	}
	
	private StringBuffer[] expandHtml(SysFormconfigMstTabCache mstCache) {
		// TODO Auto-generated method stub
		StringBuffer[] expand = new StringBuffer[20];
		SysFormconfigMstTab mst = mstCache.getPojo(); 
		for(int i=0;i<15;i++){
			expand[i] = new StringBuffer();
		}
		
		if (mst.getVerticaltype().equals("true")) {
			String widthMain = "";
			String widthFlo = "";
			if(mst.getMstTabMainFormHeight()!=null&&!mst.getMstTabMainFormHeight().equals("x")){
				widthMain = "width:"+mst.getMstTabMainFormHeight();
			}
			if(mst.getMstTabDetailHeight()!=null&&!mst.getMstTabDetailHeight().equals("x")){
				widthFlo = "width:"+mst.getMstTabDetailHeight();
			}
			expand[0].append(  	SysCardFormBeansUtil.getNbsp(0)+"<%@ page language=\"java\" import=\"com.myehr.common.util.LangUtil\" import=\"java.util.*\" pageEncoding=\"UTF-8\"%>\n"+
					SysCardFormBeansUtil.getNbsp(0)+"<%@ include file=\"/common/commontest.jsp\" %>\n"+
					SysCardFormBeansUtil.getNbsp(0)+"<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\n"+
					SysCardFormBeansUtil.getNbsp(0)+"<html>\n"+
					SysCardFormBeansUtil.getNbsp(0)+"<body>\n"+
					SysCardFormBeansUtil.getNbsp(0)+"<form id=\"form_"+mst.getMstTabFormId()+"\" name=\"form_"+mst.getMstTabFormId()+"\"  style=\"width:100%;\">\n");
			
			expand[5].append(	SysCardFormBeansUtil.getNbsp(0)+"<div class=\"container-fluid\" style=\""+widthMain+";overflow:auto;float:left;padding-top:5px\">\n"+
								SysCardFormBeansUtil.getNbsp(1)+	"<div id=\"form_"+mst.getMstTabMainFormId()+"\" style=\"margin-top:0px;\">\n");

			
			expand[1].append(	SysCardFormBeansUtil.getNbsp(0)+"<div class=\"container-fluid\" style=\""+widthFlo+";overflow:auto;float:left;padding-top:5px\">\n");
			expand[6].append(	SysCardFormBeansUtil.getNbsp(1)+"<ul class=\"nav nav-tabs\" id=\"myTab\">\n");
			expand[7].append(	"var obj = $(\"#form_"+mst.getMstTabMainFormId()+"\").next().find(\"[class='fixed-table-body']\");\n");
			expand[7].append(	"$(\"#form_"+mst.getMstTabMainFormId()+"\").next().find(\"[class='fixed-table-body']\").css(\"height\",\"74%\");\n");
		}else {
			String widthMain = "";
			String widthFlo = "";
			if(mst.getMstTabMainFormHeight()!=null&&!mst.getMstTabMainFormHeight().equals("x")){
				widthMain = "height:"+mst.getMstTabMainFormHeight();
			}
			if(mst.getMstTabDetailHeight()!=null&&!mst.getMstTabDetailHeight().equals("x")){
				widthFlo = "height:"+mst.getMstTabDetailHeight();
			}
			expand[0].append(  	SysCardFormBeansUtil.getNbsp(0)+"<%@ page language=\"java\" import=\"com.myehr.common.util.LangUtil\" import=\"java.util.*\" pageEncoding=\"UTF-8\"%>\n"+
								SysCardFormBeansUtil.getNbsp(0)+"<%@ include file=\"/common/commontest.jsp\" %>\n"+
								SysCardFormBeansUtil.getNbsp(0)+"<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\n"+
								SysCardFormBeansUtil.getNbsp(0)+"<html>\n"+
								SysCardFormBeansUtil.getNbsp(0)+"<body>\n"+
								SysCardFormBeansUtil.getNbsp(0)+"<form id=\"form_"+mst.getMstTabFormId()+"\" name=\"form_"+mst.getMstTabFormId()+"\"  style=\"height:100%;\">\n");
			
			expand[5].append(	SysCardFormBeansUtil.getNbsp(0)+"<div class=\"container-fluid\" style=\""+widthMain+";overflow:auto;padding-top:5px\">\n"+
								SysCardFormBeansUtil.getNbsp(1)+	"<div id=\"form_"+mst.getMstTabMainFormId()+"\" style=\"margin-top:0px;\">\n");
			
			expand[1].append(	SysCardFormBeansUtil.getNbsp(0)+"<div class=\"container-fluid\" style=\""+widthFlo+";overflow:auto;padding-top:5px\">\n");
			expand[6].append(	SysCardFormBeansUtil.getNbsp(1)+"<ul class=\"nav nav-tabs\" id=\"myTab\">\n");
			expand[7].append(	"changeQueryGrid1();\n");
		}
		
		
		
		expand[2].append(	SysCardFormBeansUtil.getNbsp(1)+"</ul>\n"+
							SysCardFormBeansUtil.getNbsp(1)+"<div class=\"tab-content\">\n");
		
		expand[3].append(	SysCardFormBeansUtil.getNbsp(1)+"$('#myTab a').click(function (e) {\n"+
							SysCardFormBeansUtil.getNbsp(2)+"		e.preventDefault();\n"+
							SysCardFormBeansUtil.getNbsp(2)+"		$(this).tab('show');\n"+
							SysCardFormBeansUtil.getNbsp(2)+"		$(this).find(\"table\").bootstrapTable('refresh');\n"+
							SysCardFormBeansUtil.getNbsp(1)+"});");
		
		expand[4].append("</div>\n</div>\n</form>\n");
		
		return expand;
	}
	
	public SysFileupload uploadData (HttpServletRequest request) throws Exception{
		String savePath =  request.getRealPath("/WEB-INF/upload");
		//上传时生成的临时文件保存目录
		String tempPath = request.getRealPath("/WEB-INF/temp");
		File tmpFile = new File(tempPath);
		String fileid = "";
		String message = "";
		if (!tmpFile.exists()) {
			//创建临时目录
			tmpFile.mkdir();
		}
		                 
		//消息提示
		
		try{
			//使用Apache文件上传组件处理文件上传步骤：
			//1、创建一个DiskFileItemFactory工厂
			DiskFileItemFactory factory = new DiskFileItemFactory();
			//设置工厂的缓冲区的大小，当上传的文件大小超过缓冲区的大小时，就会生成一个临时文件存放到指定的临时目录当中。
			factory.setSizeThreshold(1024*100);//设置缓冲区的大小为100KB，如果不指定，那么缓冲区的大小默认是10KB
			//设置上传时生成的临时文件的保存目录
			factory.setRepository(tmpFile);
			//2、创建一个文件上传解析器
			ServletFileUpload upload = new ServletFileUpload(factory);
			//监听文件上传进度
			upload.setProgressListener(new ProgressListener(){
				public void update(long pBytesRead, long pContentLength, int arg2) 
				{
					logger.info("文件大小为：" + pContentLength + ",当前已处理：" + pBytesRead);
		        }
			});
			//解决上传文件名的中文乱码
			upload.setHeaderEncoding("UTF-8"); 
			//3、判断提交上来的数据是否是上传表单的数据
			if(!ServletFileUpload.isMultipartContent(request)){
				//按照传统方式获取数据
				return null;
			}
		                      
			//设置上传单个文件的大小的最大值，目前是设置为1024*1024字节，也就是1MB
			upload.setFileSizeMax(1024*1024);
			//设置上传文件总量的最大值，最大值=同时上传的多个文件的大小的最大值的和，目前设置为10MB
			upload.setSizeMax(1024*1024*10);
			//4、使用ServletFileUpload解析器解析上传数据，解析结果返回的是一个List<FileItem>集合，每一个FileItem对应一个Form表单的输入项
			List<FileItem> list = upload.parseRequest(request);
			for(FileItem item : list){
				//如果fileitem中封装的是普通输入项的数据
				if(item.isFormField()){
					String name = item.getFieldName();
					//解决普通输入项的数据的中文乱码问题
					String value = item.getString("UTF-8");
					//value = new String(value.getBytes("iso8859-1"),"UTF-8");
					logger.info(name + "=" + value);
				}else{//如果fileitem中封装的是上传文件
					//得到上传的文件名称，
					String filename = item.getName();
					logger.info(filename);
					if(filename==null || filename.trim().equals("")){
						continue;
					}
					//注意：不同的浏览器提交的文件名是不一样的，有些浏览器提交上来的文件名是带有路径的，如：  c:\a\b\1.txt，而有些只是单纯的文件名，如：1.txt
					//处理获取到的上传文件的文件名的路径部分，只保留文件名部分
					filename = filename.substring(filename.lastIndexOf("\\")+1);
					//得到上传文件的扩展名
					String fileExtName = filename.substring(filename.lastIndexOf(".")+1);
					//如果需要限制上传的文件类型，那么可以通过文件的扩展名来判断上传的文件类型是否合法
					logger.info("上传的文件的扩展名是："+fileExtName);
					//获取item中的上传文件的输入流
					InputStream in = item.getInputStream();
					//得到文件保存的名称
					String saveFilename = makeFileName(filename);
					//得到文件的保存目录
					String realSavePath = makePath(saveFilename, savePath);
					//创建一个文件输出流
					FileOutputStream out = new FileOutputStream(realSavePath + "\\" + saveFilename);
					//创建一个缓冲区
					byte buffer[] = new byte[1024];
					//判断输入流中的数据是否已经读完的标识
					int len = 0;
					//循环将输入流读入到缓冲区当中，(len=in.read(buffer))>0就表示in里面还有数据
					while((len=in.read(buffer))>0){
						//使用FileOutputStream输出流将缓冲区的数据写入到指定的目录(savePath + "\\" + filename)当中
						out.write(buffer, 0, len);
					}
					//关闭输入流
					in.close();
					//关闭输出流
					out.close();
					//删除处理文件上传时生成的临时文件
					//item.delete();
					
					HttpSession session  = request.getSession();
					String userId = session.getAttribute("userid").toString();
					
					SysFileupload fileupload = new SysFileupload();
					fileid = keyserviceImpl.getMaxId("SYS_FILEUPLOAD", "FILEID")+"";
					fileupload.setFileid(new BigDecimal(fileid));
					fileupload.setFilename(filename);
					fileupload.setFilepath(realSavePath+"\\"+filename);
					fileupload.setUploaduser(userId);
					fileupload.setUploadtime(new Date());
					long savetype=1;
					fileupload.setSavetype(savetype);
					fileupload.setContenttype("application/octet-stream");
					fileupload.setClientfilename(filename);
					fileupload.setClientpath(filename);
					fileupload.setName("uploadfile");
					sysFileuploadMapper.insert(fileupload);
					return fileupload;
				}
			}
		}catch (FileUploadBase.FileSizeLimitExceededException e) {
			e.printStackTrace();logger.error(e.getMessage(),e);
			message="单个文件超出最大值！！！";
		}catch (FileUploadBase.SizeLimitExceededException e) {
			e.printStackTrace();logger.error(e.getMessage(),e);
			message="上传文件的总的大小超出限制的最大值！！！";
			return null;
		}catch (Exception e) {
			message= "文件上传失败！";
			e.printStackTrace();logger.error(e.getMessage(),e);
		}

		return null;
	}
	
	/**
	 * @Method: makeFileName
	 * @Description: 生成上传文件的文件名，文件名以：uuid+"_"+文件的原始名称
	 * @Anthor:wlf	 
	 * @param filename 文件的原始名称
	 * @return uuid+"_"+文件的原始名称
	 */ 
	private String makeFileName(String filename){  //2.jpg
		//为防止文件覆盖的现象发生，要为上传文件产生一个唯一的文件名
		return filename;
    }
	
	
	/**
	 * 为防止一个目录下面出现太多文件，要使用hash算法打散存储
	 * @Method: makePath
	 * @Description: 
	 * @Anthor:wlf
	 * @param filename 文件名，要根据文件名生成存储目录
	 * @param savePath 文件存储路径
	 * @return 新的存储目录
	 * */ 
	private String makePath(String filename,String savePath){
		//得到文件名的hashCode的值，得到的就是filename这个字符串对象在内存中的地址
		Date date = new Date();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String str = format.format(date);
		String[] Strs=str.split("-");
		//构造新的保存目录
		String dir = savePath + "\\" + Strs[0] + "\\" + Strs[1]+ "\\" + Strs[2].substring(0,2);  //upload\2\3  upload\3\5
		//File既可以代表文件也可以代表目录
		File file = new File(dir);
		//如果目录不存在
		if(!file.exists()){
			//创建目录
			file.mkdirs();
		}
		return dir;
	}
	
	@Override
	public String buildReportForm(SysFormconfigCache form,SysRequestParam request) {
		try {
//			String path11 = findSysFormFolderTreeById(form.getPojoform().getFormDefFolderId().intValue(),"");
			String path11 = form.getFormTreePath();

			form.getPojoform().setFormSubmitUrl(path11+form.getPojoform().getFormDefCode()+".jsp");
//			sysFormconfigMapper.updateByPrimaryKeyWithBLOBs(form.getPojoform());
			Map map = new HashMap();
			map.put("submitUrl", path11+form.getPojoform().getFormDefCode()+".jsp");
			map.put("formDefId", form.getFormDefId());
			sysFormconfigMapperExpand.updateSubmitUrl(map);
	
			logger.info(path11);
			//获取文件路径和文件名
			String path1 =  request.getPath()+"\\"+path11;
			CreateFileUtil.createDir(path1);
			
			try {  
				//File f = new File(path+"/"+form.getPojoform().getFormDefCode()+".jsp");
				File f1 = new File(path1+"/"+form.getPojoform().getFormDefCode()+".jsp"); 
				
				String url = this.getReportUrl(form, request);
				String jspReport="<%@ page language=\"java\" import=\"java.util.*\" import=\"com.myehr.common.util.LangUtil\" pageEncoding=\"UTF-8\"%>\n"
						+"<%@ include file=\"/common/common.jsp\" %>\n"
						+"<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\n"
						+"<html>\n"
						+"<body>\n"
						+"<div id=\"iframepage\">\n"
						+"<iframe align=\"middle\" id=\"iframepage\"  width=\"100%\" height=\"700\" frameborder=\"0\" scrolling=\"no\" marginheight=\"0\" marginwidth=\"0\"></iframe>\n"
						+"</div>\n"
						+"<script>\n"
						+"$(function() {\n"
						+"	var url = '"+url+"';\n"
						+"	$(\"#iframepage\").attr(\"src\",url);\n"
						+"})\n"
						+"</script>\n"
						+"</body>\n"
						+"</html>\n";
				/*output.write(jspReport);
				
				output.close();  */
				if (f1.exists()) {  
					System.out.print("文件存在");  
				} else {  
					System.out.print("文件不存在");  
					f1.createNewFile();// 不存在则创建
				}
				OutputStreamWriter write1 = new OutputStreamWriter(new FileOutputStream(f1),"utf-8");
				BufferedWriter output1=new BufferedWriter(write1);
				//html
				output1.write(jspReport);
				
				output1.close();  
				
			} catch (Exception e) {  
				e.printStackTrace();logger.error(e.getMessage(),e);
			}  
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();logger.error(e.getMessage(),e);
		} 
		return null;
	}
	
	@Override
	public String getReportUrl(SysFormconfigCache form,
			SysRequestParam request) throws SQLException {
		
		SysSystemParam param = ISysParamService.getParamValueByParamName("Report_URL");
		
		SysFormYkReport report= form.getYKreport();
		String reportRelId = report.getReportRelId();
		String reportActual = report.getReportType();
		List<SysSqlParams> params = form.getYkParams();
		String expandParams = "&variants=";
		for (SysSqlParams sqlParam : params) {
			if (sqlParam.getSqlParamsType().equals("session")) {
				expandParams += sqlParam.getSqlParamsName()+"=${sessionScope."+sqlParam.getSqlParamsCode()+"};";
			}
		}
		String url = param.getSysParamValue1()+"fileName="+reportRelId+"&targetVolume="+reportActual+"&authId="+param.getSysParamValue2()+expandParams;
		
		return url;
	}
	
	@Override
	public String buildHandsontableForm(SysFormconfigCache form,SysRequestParam request,String isApp) {
		try {
			StringBuffer[] sbs = form.showPage(request,isApp,null,null,0);
			
//			String path11 = findSysFormFolderTreeById(form.getPojoform().getFormDefFolderId().intValue(),"");
			String path11 = form.getFormTreePath();

			form.getPojoform().setFormSubmitUrl(path11+form.getPojoform().getFormDefCode()+".jsp");
//			sysFormconfigMapper.updateByPrimaryKeyWithBLOBs(form.getPojoform());
			Map map = new HashMap();
			map.put("submitUrl", path11+form.getPojoform().getFormDefCode()+".jsp");
			map.put("formDefId", form.getFormDefId());
			sysFormconfigMapperExpand.updateSubmitUrl(map);
			
			
			String filterString = "";
			String filterParam = "";
			SysGridFilterCache filter =form.getFilter();
			List<SysGridFilterColumnCache> filterColumns = filter.getFilterColumns();
			for (int i = 0; i < filterColumns.size(); i++) {
				SysGridFilterColumnCache filterColumn = filterColumns.get(i);
				if (filterColumn.getColumn().getFormColumnGuiType().equals("1")) {
					filterString+="    	   var searchData=document.getElementById(\"FILTER_"+form.getFormDefId()+"\").value;\n";
				}else {
					filterString+="        var "+filterColumn.getColumn().getFormFiledTablename()+"=document.getElementById(\"FILTER_"+filterColumn.getColumn().getFormEntityTablename()+"."+filterColumn.getColumn().getFormFiledTablename()+"_"+form.getFormDefId()+"\").value;\n";
					filterParam+=filterColumn.getColumn().getFormFiledTablename()+":"+filterColumn.getColumn().getFormFiledTablename();
				}
			}

			List<SysFormWhereCache> wheres = form.getWheres();
			String wheresString = "";
			String requestParam = "";
			for (int i = 0; i < wheres.size(); i++) {
				wheresString+="var "+wheres.get(i).getFormWhereValue()+"='${param."+wheres.get(i).getFormWhereValue()+"}';\n";
				requestParam = ""+wheres.get(i).getFormWhereValue()+":"+wheres.get(i).getFormWhereValue();
			}
			
			logger.info(path11);
			//获取文件路径和文件名
			//String path="E:/workspace/Myeclipse/myehr_17_2_19/WebRoot/jsp/formbuild/"+path11;
			String path1 =  request.getPath()+"\\"+path11;
//			String path1= "E:/SqlServer/myeclipse/apache-tomcat-6.0.45/webapps/myehr/jsp/formbuild/"+path11;
			//生成文件
			//SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
			
			/*CreateFileUtil.createDir(path);*/
			CreateFileUtil.createDir(path1);
			
			try {  
				//File f = new File(path+"/"+form.getPojoform().getFormDefCode()+".jsp");
				File f1 = new File(path1+"/"+form.getPojoform().getFormDefCode()+".jsp"); 
				/*if (f.exists()) {  
					System.out.print("文件存在");  
				} else {  
					System.out.print("文件不存在");  
					f.createNewFile();// 不存在则创建
				}
				OutputStreamWriter write = new OutputStreamWriter(new FileOutputStream(f),"utf-8");
				BufferedWriter output=new BufferedWriter(write);*/
				
				String formDefSql = form.getPojoform().getFormDefSql();
				
				List<SysFormColumnCache> columns = form.getColumns();
				String columns1="[";
				String colHeaders = "[";
				String columnData = "";
				String colWidths = "[";
				String head="";
				
				columns1 +="{\n"
						+"    				            data: 'check',\n"
						+"    				            type: 'checkbox',\n"
						+"    				            checkedTemplate: 'yes',\n"
						+"   				                uncheckedTemplate: 'no'\n"
						+"				            },\n";
				colHeaders+="'选择',";
				colWidths+="50px,";
				for (int i = 0; i < columns.size(); i++) {
					SysFormColumnCache column = columns.get(i);
					String formColumnGuiType = column.getFormColumnGuiType();
					colHeaders +="'"+column.getFormColumnLable()+"',";
					head +="head.push('"+column.getFormFiledTablename()+"');\n";
					String readOnly="";
					if ("show".equals(column.getFormColumnShowType())) {
						readOnly="readOnly:false";
					}else {
						readOnly="readOnly:true";
					}
					
					if ("6".equals(formColumnGuiType)) {
						SysDatepickerCache datepicker = (SysDatepickerCache)column.getFormColumGui();
						String fieldName  = column.getFormFiledTablename();
						columnData+="		            	  var "+fieldName+"= data[i]."+column.getFormEntityTablename()+"_"+column.getFormFiledTablename()+";\n"
								+"                        if("+fieldName+"!=null && "+fieldName+"!=\"\"){"
								+"		            	      "+fieldName+" = new Date("+fieldName+").Format(\""+datepicker.getDatepickerFormat().replace("HH", "hh")+"\");\n"
								+"                        }"
								+"		            	  column.push("+fieldName+");\n";
						columns1 +="				            {\n"
								+"	  				            type: 'date',\n"
								+"    				            dateFormat: 'YYYY-MM-DD',\n"
								+"    				            correctFormat: true,\n"
								+"    				            defaultDate: '1900-01-01',\n"
								+"    				            "+readOnly+"\n"
								+"				            },\n"; 
					}else if ("2".equals(formColumnGuiType)||"10".equals(formColumnGuiType)) {
						SysFormComboboxCache combobox = (SysFormComboboxCache)column.getFormColumGui();
						String dictClass = combobox.getComboboxGuiInitValue();
						String userId = "1";
						SysUserDictExample example = new SysUserDictExample();
						com.myehr.pojo.formmanage.form.SysUserDictExample.Criteria criteria = example.createCriteria();
						criteria.andUserIdEqualTo(new BigDecimal(userId));
						//List<SysUserDict> sysUserDict = sysUserDictMapper.selectByExample(example);
						
						SysDictType dictType=dictTypeServiceImpl.findSysDictTypeByCode(dictClass);
						List<SysDictEntryExpand> list= serviceImpl.searchDictEntryListByTypeId(dictType.getDictTypeId());
						String selectOptions="";
						for (int j = 0; j < list.size(); j++) {
							SysDictEntryExpand ss = list.get(j);
							selectOptions+="'"+ss.getDictEntryName()+"',";
						}
						selectOptions = selectOptions.substring(0, selectOptions.length()-1);
						
						columnData+="column.push(data[i]."+column.getFormEntityTablename()+"_"+column.getFormFiledTablename()+");\n";
						columns1 +="				            {\n"
								+"	  				            type:'dropdown',\n"
								+"    				            source: ["+selectOptions+"]\n"
								+"				            },\n"; 
					}else {
						columnData+="column.push(data[i]."+column.getFormEntityTablename()+"_"+column.getFormFiledTablename()+");\n";
						columns1 +="				            {\n"
								+"  				                "+readOnly+"\n"
								+"				            },\n";
					}
					colWidths+=column.getFormColumnWidth()+",";
				}
				columns1 = columns1.substring(0, columns1.length()-1);
				colHeaders = colHeaders.substring(0, colHeaders.length()-1);
				colWidths = colWidths.substring(0, colWidths.length()-1);
				colWidths =colWidths.replace("px", "");
				
				columns1 +="]";
				colHeaders +="]";
				colWidths +="]";
				
				formDefSql = formDefSql.replace("[s:userId]", "1");
				
				String jspReport="<%@ page language=\"java\" import=\"java.util.*\" import=\"com.myehr.common.util.LangUtil\" pageEncoding=\"UTF-8\"%>\n"
				+"<%@ include file=\"/common/common.jsp\" %>\n"
				+"<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\n"
				+"<html>\n"
				+"<head>"
				+"<title>Handsontable</title>"
				+"   <script data-jsfiddle=\"common\" src=\"/myehr/jsp/handsontable/dist/handsontable.full.js\"></script>"
				+"   <link data-jsfiddle=\"common\" rel=\"stylesheet\" media=\"screen\" href=\"/myehr/jsp/handsontable/dist/handsontable.full.css\">"
				+"   <link data-jsfiddle=\"common\" rel=\"stylesheet\" media=\"screen\" href=\"/myehr/jsp/handsontable/css/samples.css\">"
				+"   <script src=\"/myehr/jsp/handsontable/dist/jquery.min.js\"></script>"
				+"   <script src=\"/myehr/jsp/handsontable/js/highlight/highlight.pack.js\"></script>"
				+"   <link rel=\"stylesheet\" media=\"screen\" href=\"/myehr/jsp/handsontable/js/highlight/styles/github.css\">"
				+"   <link rel=\"stylesheet\" href=\"/myehr/jsp/handsontable/css/font-awesome/css/font-awesome.min.css\">"
				+"   <link rel=\"canonical\" href=\"http://handsontable.com/\">"
				+"   <link rel=\"stylesheet\" href=\"/myehr/jsp/handsontable/dist/pagination.css\">"
				+"   <script src=\"/myehr/jsp/handsontable/js/ga.js\"></script>"
				+"   <script src=\"/myehr/jsp/handsontable/js/data.js\"></script>"
				+"   <script src=\"/myehr/jsp/handsontable/dist/pagination.js\"></script>"
				+"   <style>\n"
				+"   	* {\n"
				+"   		margin: 0;\n"
				+"   		padding: 0;\n"
				+"   	}\n"
				+"   	.data-list {\n"
				+"   		list-style: none;\n"
				+"   	}\n"
				+"   	.list-item {\n"
				+"   		padding: 10px;\n"
				+"   	}\n"
				+"   </style>\n"
				+"</head>"
				+"<body class=\"home\" style=\"width:100%;height:100%\">\n"
				+"    <div id=\"right_part_step1\" style=\"width: 98%;height: 30%;margin-top:20Px;\">\n"
				+"        <div style=\"height:100%;border:1px solid #ccc; position:relative;border-radius:5px;margin-bottom:10px;margin-left:10px;padding:10px\">\n"
				+"            <h3 style=\"background:#FFF;color:blue; display:block;font-size:12;position:absolute; left:10px; top:-27px;text-align:center\">SQL脚本</h3>\n"
				+"            <div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12\" style =\"height:100%;\">\n"
				+"                <div class=\"BTNGROUP_55\" style=\"margin:0 auto; display:inline-block;min-height: 20px;\">\n"
				+"                    <div style=\"margin-right:10px;display:inline-block\">\n"
				+"                        <input type=\"button\" class=\"btn btn-info\" value=\"查询\" onclick=\"search()\"/>\n"
				+"                    </div>\n"
				+"                    <div style=\"margin-right:10px;display:inline-block\">\n"
				+"                        <input type=\"button\" class=\"btn btn-info\" value=\"保存\" onclick=\"getAll()\"/>\n"
				+"                    </div>\n"
				+"                    <div style=\"margin-right:10px;display:inline-block\">\n"
				+"                        <input type=\"button\" class=\"btn btn-info\" value=\"删除\" onclick=\"deleteSelect()\"/>\n"
				+"                    </div>\n"
				+"                </div>\n"
				+"                <div class=\"jsFiddle inline-buttons\">\n"
				+"                    <label>主键规则：\n"
				+"                        <input type=\"radio\" name=\"optionsRadios\" id=\"optionsRadios1\" value=\"ADDID\" checked>自增\n"
				+"                    </label>\n"
				+"                    <label>\n"
				+"                        <input type=\"radio\" name=\"optionsRadios\" id=\"optionsRadios2\" value=\"MAXID\" checked>最大Id\n"
				+"                    </label>\n"
				+"                    <label>\n"
				+"                        <input type=\"radio\" name=\"optionsRadios\" id=\"optionsRadios3\" value=\"UUID\" checked>UUID\n"
				+"                    </label>\n"
				+"                </div>\n"
				
				+"                <div class=\"ui search selection dropdown entitybox field-control\" style=\"display:inline-block;width:100%;height: 50%;\">\n"
				+"                    <textarea name=\"excutesql\" id=\"excutesql\" class=\"form-control\" style=\"width:100%; height: 100%;resize:none; padding:15px 10px 15px 30px;margin-top:9px;\">"+formDefSql+"</textarea>\n"
				+"                </div>\n"
				+"            </div>\n"
				+"        </div>\n"
				+"        </div>\n"
				+sbs[24]
				+sbs[33]
				+"    </div>\n"
				+"<div id=\"right_part_step2\" style=\"width: 98%;height:64%;margin-top:20Px;\">"
				+"    <div class=\"rowLayout\" style=\"height:300px;margin-left:10px\">\n"
				+"        <div class=\"descLayout\" style=\"width:100%;height:300px\">\n"
				+"        <div class=\"pad\" style=\"width:100%;height:300px\" data-jsfiddle=\"example\">\n"
				+"            <div id=\"example\" style=\"width:100%;height:300px;overflow:auto;\"></div>\n"
				+"            <div id=\"pagination\" class=\"pagination\"></div>\n"
				+"    </div>\n"
		      	+"</div>\n"
		      	+"<div class=\"codeLayout\">\n"
		      	+"<script data-jsfiddle=\"example\">\n"
		      	+"    window.onload=function(){\n"
				+"        init(1,10);\n"
				+"    }\n"

				+sbs[25]
				+wheresString
				+filterString
				+"    var requestParam ={};\n"
				+"    requestParam={"+requestParam+"};\n"		
				+"    var formId = "+form.getFormDefId()+"\n"
				+"    var data1 = [];\n"
				+"	  var hot;\n"
				+"	  var codesAndIdCardNumbers = '${param.empIds}';\n"
				+"	  var data;\n"
				+"	  var colWidths=[];\n"
				+"	  var columnsreadOnly=[];\n"
				+"	  var head=[];\n"
				+"	  var container = document.getElementById('example');\n"
				+"	  var primaryKey = '"+form.getPkColumn().getFormEntityTablename()+"."+form.getPkColumn().getFormFiledTablename()+"';\n"
				+"	  var str = [];\n"
				+"	  var total;\n"
				+"    function init(pageNo, pageSize){\n"
				+"        data1=[];\n"
				+"        var excutesql=document.getElementById(\"excutesql\").value;\n"
				+"   	  var _param={};\n"
				+"    	  _param.formId=formId;\n"
				//+"        _param.searchData=searchData;\n"
				+"    	  _param.excutesql=excutesql;\n"
				+"    	  _param.codesAndIdCardNumbers=codesAndIdCardNumbers;\n"
				+"    	  _param.rowNumberStart=pageNo;\n"
				+"    	  _param.rowNumberEnd=pageSize;\n"
				+"    	  _param.requestParam=requestParam;\n"
				+"		  $.ajax({\n"
				+"            url: '/myehr/handsontable/searchData.action',\n"
				+"		      type:'post',\n"
				+"			  data: JSON.stringify(_param),\n"
				+"			  cache: false,\n"
				+"			  contentType: 'application/json;charset=utf-8',\n"
				+"            success: function(datas) { // 获取当前月的数据\n"
				+"                var data=datas.listMap;\n"
				+"                total=datas.total;\n"
				+"                initUI(pageNo, pageSize,total,'init');\n"
				+"            	  str = primaryKey.split(\"\\.\");\n"
				+"            	  var checkbox={\n"
				+"				      data: 'check',\n"
				+"					  type: 'checkbox',\n"
				+"					  checkedTemplate: 'yes',\n"
				+"					  uncheckedTemplate: 'no'\n"
				+"                };\n"
				+"				  head.push(\"选择\");\n"
				+head
				+"				  columnsreadOnly.push(checkbox);\n"
				+"	              for ( var p in data[0]){\n"
				+"	            	  if(p==str[1]){\n"
				+"	            		  columnsreadOnly.push({readOnly:true});\n"
				+"	            	  }else{\n"
				+"	            		  columnsreadOnly.push({readOnly:false});\n"
				+"	            	  }\n"
				+"	              }\n"
				+"		          for (var i=0;i<data.length;i++){\n"
				+"		              var column=[];\n"
				+"		              column.push(\"no\");\n"
				+columnData
				+"		              data1.push(column);\n"
				+"		          }\n"
				+"		          if(hot!=undefined){\n"
				+"     				  hot.destroy();\n"
				+"		          }\n"
				
				+"				      hot = new Handsontable(container, {\n"
				+"				          data: data1,\n"
				+"				          minSpareRows: 3,\n"
				+"				          fixedColumnsLeft:3,\n"
				+"				          colHeaders: "+colHeaders+",\n"
				//+"				          colWidths: "+colWidths+",\n"
				+"				          contextMenu: true,\n"
				+"				          autoColumnSize: true,\n"
				+"				          columns:"+columns1+"\n"
				+"				      });\n"
				+"		          }\n"
				+"		      }); \n"
				+"        }\n"
				
				
				+"        function grid_"+form.getFormDefCode()+"_fun11(pageNo,pageSize){\n"
				+filterString
				+"    		  data1 = [];\n"
				+"   		  colWidths=[];\n"
				+"			  columnsreadOnly=[];\n"
				+"    		  var excutesql=document.getElementById(\"excutesql\").value;\n"
				+"   		  var _param={};\n"
				+"            var filter ={};\n"
				+"            filter ={"+filterParam+"};\n"
				+"    		  _param.formId=formId;\n"
				//+"    		  _param.searchData=searchData;\n"
				+"    		  _param.excutesql=excutesql;\n"
				+"    		  _param.codesAndIdCardNumbers=codesAndIdCardNumbers;\n"
				+"    	      _param.rowNumberStart=pageNo;\n"
				+"    	      _param.rowNumberEnd=pageSize;\n"
				+"    	      _param.requestParam=requestParam;\n"
				+"    	      _param.filter=filter;\n"
				+"    		  $.ajax({\n"
				+"		          url: '/myehr/handsontable/searchData.action',\n"
				+"		          type:'post',\n"
				+"			      data: JSON.stringify(_param),\n"
				+"			      cache: false,\n"
				+"			      async:false, \n"
				+"				  contentType: 'application/json;charset=utf-8',\n"
				+"		          success: function(datas) { // 获取当前月的数据\n"
				+"		              var data=datas.listMap;\n"
				+"		              str = primaryKey.split(\"\\.\");\n"
				+"		              head=[];\n"
				+"		              var checkbox={\n"
				+"						  data: 'check',\n"
				+"						  type: 'checkbox',\n"
				+"						  checkedTemplate: 'yes',\n"
				+"						  uncheckedTemplate: 'no'\n"
				+"					  };\n"
				+"					  head.push(\"选择\");\n"
				+"		              columnsreadOnly.push(checkbox);\n"
				+"		              for ( var p in data[0]){\n"
				+"		            	  head.push(p);\n"
				+"		            	  colWidths.push(100);\n"
				+"		            	  if(p==str[1]){\n"
				+"		            		  columnsreadOnly.push({readOnly:true});\n"
				+"		            	  }else{\n"
				+"		            		  columnsreadOnly.push({readOnly:false});\n"
				+"		            	  }\n"
				+"		              }\n"
				+"			          for (var i=0;i<data.length;i++){\n"
				+"			              var column=[];\n"
				+"			              column.push(\"no\");\n"
				+columnData
				+"			              data1.push(column);\n"
				+"			          }\n"           
				+"			          hot.destroy();\n"
				+"					  hot = new Handsontable(container, {\n"
				+"					      data: data1,\n"
				+"					      minSpareRows: 3,\n"
				+"					      fixedColumnsLeft:3,\n"
				+"					      colHeaders: "+colHeaders+",\n"
				//+"					      colWidths: "+colWidths+",\n"
				+"					      contextMenu: true,\n"
				+"				          autoColumnSize: true,\n"
				+"					      columns:"+columns1+"\n"
				+"					  });\n"
				+"			      }\n"
				+"			  })\n"
				+"	      }\n"		
				
				
				+"        function getAll(){\n"
				+"	          var data=hot.getData();\n"
				+"	    	  var keyrule='';\n"
				+"	    	  var radios = document.getElementsByName(\"optionsRadios\");\n"  
				+"				  for (var i=0; i<radios.length; i++) { \n" 
				+"				      if (radios[i].checked) {  \n"
				+"				          keyrule=radios[i].value; \n"
				+"				      }\n"
				+"				  }  \n"
				+"	    	      var header=head;\n"
				+"	    		  var dataobjs=new Array();\n"
				+"	    		  for(var j=0;j<data.length-1;j++){\n"
				+"	    			  var dataobj=data[j];\n"
				+"	    			  var obj;\n"
				+"    			  var obj=\"{\";\n"
				+"    			  for(var i=0;i<header.length;i++){\n"
				+"	    			  if(dataobj[i]==null){\n"
				+"	    				  obj+=header[i]+\":'',\";\n"
				+"	    			  }else{\n"
				+"	    				  obj+=header[i]+\":'\"+dataobj[i]+\"',\";\n"
				+"	    			  }\n"
				+"	    		  }\n"
				+"	    		  obj=obj.substring(0, obj.length-1);\n"
				+"	    		  obj+=\"}\";\n"
				+"	    		  var obj2=eval(\"(\"+obj+\")\"); \n"
				//+"	    		  var obj2 = obj.parseJSON();\n"
				+"	    		  dataobjs.push(obj2);\n"
				+"    		  }\n"
				+"   		  var _param={};\n"
				+"    		  _param.kbasecodes=dataobjs;\n"
				+"    		  _param.primaryKey = primaryKey;\n"
				+"    		  _param.keyrule = keyrule;\n"
				+"    		  _param.formId = formId;\n"
				+"    		  $.ajax({\n"
				+"		          url: '/myehr/handsontable/updateFormData.action',\n"
				+"		          type:'post',\n"
				+"			      data: JSON.stringify(_param),\n"
				+"			      cache: false,\n"
				+"				  contentType: 'application/json;charset=utf-8',\n"
				+"		          success: function (text) {\n"               
				+"		              alert(\"保存成功！\");\n"
				+"		              var index = parent.layer.getFrameIndex(window.name); //获取当前窗体索引\n"
				+"					  parent.layer.close(index);//执行关闭\n"
				+"		          },\n"
				+"		      });\n"
				+"        }\n"
				
				
				+"	      function deleteSelect(){\n"
				+"    	      var data=hot.getData();\n"
				+"	    	  var header=head;\n"
				+"   		  var dataobjs=new Array();\n"
				+"   		  for(var j=0;j<data.length-1;j++){\n"
				+"  		      var dataobj=data[j];\n"
				+"   			  var obj;\n"
				+"   			  var obj=\"{\";\n"
				+"   			  for(var i=0;i<header.length;i++){\n"
				+"	    			  if(dataobj[i]==null){\n"
				+"	    				  obj+=header[i]+\":'',\";\n"
				+"	    			  }else{\n"
				+"	    			      obj+=header[i]+\":'\"+dataobj[i]+\"',\";\n"
				+"	    			  }\n"
				+"	    		  }\n"
				+"	    		  obj=obj.substring(0, obj.length-1);\n"
				+"	    		  obj+=\"}\";\n"
				+"	    		  var obj2=eval(\"(\"+obj+\")\"); \n"
				+"	    		  dataobjs.push(obj2);\n"
				+"    		  }\n"
				+"    		  var _param={};\n"
				+"    		  _param.kbasecodes=dataobjs;\n"
				+"    		  _param.primaryKey = primaryKey;\n"
				+"    		  _param.formId = formId;\n"
				+"   		  $.ajax({\n"
				+"		          url: '/myehr/handsontable/deleteData.action',\n"
				+"		          type:'post',\n"
				+"				  data: JSON.stringify(_param),\n"
				+"				  cache: false,\n"
				+"				  contentType: 'application/json;charset=utf-8',\n"
				+"		          success: function (text) {\n"		               
				+"		              alert(\"保存成功！\");\n"
				+"		              var index = parent.layer.getFrameIndex(window.name); //获取当前窗体索引\n"
				+"					  parent.layer.close(index);//执行关闭\n"
				+"		          },\n"
				+"		      });\n"
				+"        }\n"
				+"        </script>\n"
				+"        <script type=\"text/javascript\">\n"
				+"        function initUI(pageNo, pageSize,total,type) {\n"
				+"        	if(type=='init'){\n"
				+"          }else{\n"
				+"              grid_"+form.getFormDefCode()+"_fun11(pageNo, pageSize);\n"
				+"          }\n"
				+"        	var len;\n"
				+"        	if(total>=10){\n"
				+"        	    len=10;\n"
				+"          }\n"
					
				+"        	var html = '';\n"
				+"        	for(var i = (pageNo-1)*pageSize; i < pageNo*pageSize; i++) {\n"
				+"        		var item = data[i];\n"
				+"        		html += '<li class=\"list-item\">'+item+'</li>';\n"
				+"        	}\n"
				+"        	var obj = document.getElementsByClassName('data-list');\n"
				+"        	obj.innerHTML = html;\n"
				+"        	pagination({\n"
				+"        		cur: pageNo,\n"
				+"        		total: total,\n"
				+"        		len: len,\n"
				+"        		targetId: 'pagination',\n"
				+"        		callback: function() {\n"
				+"        			var me = this;\n"
				+"        			var oPages = document.getElementsByClassName('page-index');\n"
				+"        			for(var i = 0; i < oPages.length; i++) {\n"
				+"        				oPages[i].onclick=function() {\n"
				+"        					initUI(this.getAttribute('data-index'), 10,total,'search');\n"
				+"        				}\n"
				+"        			}\n"
				+"        			var goPage = document.getElementById('go-search');\n"
				+"        			goPage.onclick = function() {\n"
				+"        				var index = document.getElementById('yeshu').value;\n"
				+"        				if(!index || (+index > me.total) || (+index < 1)) {\n"
				+"        					return;\n"
				+"        				}\n"
				+"        				initUI(index, 10,total,'search');\n"
				+"        			}\n"
				+"        		}\n"
				+"        	});\n"
				+"        }\n"
				+"        </script>\n"
				+"    </div>\n"
				+"</div>\n"
				+"</div>\n"
				+"</div>\n"
				+"</body>\n"
				+"</html>\n";
		/*output.write(jspReport);
		
		output.close();  */
		if (f1.exists()) {  
			System.out.print("文件存在");  
		} else {  
			System.out.print("文件不存在");  
			f1.createNewFile();// 不存在则创建
		}
		OutputStreamWriter write1 = new OutputStreamWriter(new FileOutputStream(f1),"utf-8");
		BufferedWriter output1=new BufferedWriter(write1);
		//html
		output1.write(jspReport);
		
		output1.close();  
		
	} catch (Exception e) {  
		e.printStackTrace();logger.error(e.getMessage(),e);
	}  
	
	
} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();logger.error(e.getMessage(),e);
} 
return null;
}

	@Override
	public ResultMap getAllFormMsSql(SysRequestParam request)
			throws Exception {
		// TODO Auto-generated method stub
				String sql;
				Pagers pagers= fServiceImpl.translateRequest(request.getRequest(),"formDefFolderId");
				//oracle
				if (pagers.getExpand().equals("0")) {
					sql = " SELECT TOP "+pagers.getLimit()+" * "+
							  "	FROM SYS_FORMCONFIG "+
							  "	WHERE (FORM_DEF_ID NOT IN "+
							  "	(SELECT TOP ("+pagers.getLimit()+"*("+pagers.getPageSize()+"-1)) FORM_DEF_ID "+
							  "	FROM SYS_FORMCONFIG WHERE (FORM_DEF_CODE like '%"+pagers.getConditionString()+"%' or FORM_DEF_NAME like '%"+pagers.getConditionString()+"%'  or FORM_DEF_LAYOUT_TYPE like '%"+pagers.getConditionString()+"%') "+pagers.getSort()+")) and (FORM_DEF_CODE like '%"+pagers.getConditionString()+"%' or FORM_DEF_NAME like '%"+pagers.getConditionString()+"%' or FORM_DEF_LAYOUT_TYPE like '%"+pagers.getConditionString()+"%' ) "+pagers.getSort();
				} else {
					sql = " SELECT TOP "+pagers.getLimit()+" * "+
							  "	FROM SYS_FORMCONFIG "+
							  "	WHERE (FORM_DEF_ID NOT IN "+
							  "	(SELECT TOP ("+pagers.getLimit()+"*("+pagers.getPageSize()+"-1)) FORM_DEF_ID "+
							  "	FROM SYS_FORMCONFIG WHERE (FORM_DEF_CODE like '%"+pagers.getConditionString()+"%' or FORM_DEF_NAME like '%"+pagers.getConditionString()+"%') AND form_def_folder_id = "+String.valueOf(pagers.getExpand())+" "+pagers.getSort()+")) and (FORM_DEF_CODE like '%"+pagers.getConditionString()+"%' or FORM_DEF_NAME like '%"+pagers.getConditionString()+"%' )AND form_def_folder_id = "+String.valueOf(pagers.getExpand())+" "+pagers.getSort();		
				}
				ResultMap pageresponse = new ResultMap();  
		        Map<String, Object> maps=new HashMap<String, Object>();
		        maps.put("sql", sql);
		        List<SysFormconfig> list = sysFormconfigMapperExpand.operation4(maps); //当前页显示的数据  
		        if (pagers.getExpand().equals("0")) {
		        	sql="SELECT COUNT(*) from (select * FROM sys_formconfig WHERE ((FORM_DEF_CODE) LIKE '%"+pagers.getConditionString().toUpperCase()+"%'"+
							"OR upper(FORM_DEF_NAME) LIKE '%"+pagers.getConditionString().toUpperCase()+"%')"+
							") a";
				} else {
			        sql="SELECT COUNT(*) from (select * FROM sys_formconfig WHERE ((FORM_DEF_CODE) LIKE '%"+pagers.getConditionString().toUpperCase()+"%'"+
							"OR upper(FORM_DEF_NAME) LIKE '%"+pagers.getConditionString().toUpperCase()+"%' or FORM_DEF_LAYOUT_TYPE like '%"+pagers.getConditionString()+"%')"+
							"AND form_def_folder_id = "+String.valueOf(pagers.getExpand())+") a";
				}
		        maps.put("sql", sql);
		        Integer total = sysFormconfigMapperExpand.operation3(maps);  //数据总条数  
		        List<Object> list_obj=new ArrayList<Object>();
				for (SysFormconfig u : list) {
					list_obj.add(u);
				}
		        pageresponse.setRows(list_obj);  
		        pageresponse.setTotal(total);  
		        return pageresponse;
	}

	@Override
	public String buildTabsForm(SysFormconfigCache form,SysRequestParam request, String isApp) {
		try {
			//获取主表信息
			String userId = request.getSession().getAttribute("userid")+"";
			SysFormconfigMstTabCache sMst= form.getMstTab();//多tab表
			List<SysFormconfigMstTabDetailCache> sDetailMsts= sMst.getDetails();
			String exportMstTabDetail = "function exportData(fieldArray,formId){\n";
			for (int i = 0; i < sDetailMsts.size(); i++) {
				exportMstTabDetail +="    if(formId=="+sDetailMsts.get(i).getTabDetailFormId()+"){\n";
				exportMstTabDetail +="        exportData_"+sDetailMsts.get(i).getTabDetailFormId()+"(fieldArray);\n";
				exportMstTabDetail +="    }\n";
			}
			exportMstTabDetail +="}\n";
			//第一tab页
			StringBuffer[] mst = sysformconfigService.getForm(sDetailMsts.get(0).getTabDetailFormId().toString()).showPage(request, isApp,null,null,0);
			StringBuffer[] expands = expandHtmlTabs(sMst);
			StringBuffer[] detailMst = detailMstHtmlTabs(sDetailMsts,request,isApp,null);
//			String path11 = findSysFormFolderTreeById(form.getPojoform().getFormDefFolderId().intValue(),"");
			String path11 = form.getFormTreePath();
			form.getPojoform().setFormSubmitUrl(path11+form.getPojoform().getFormDefCode()+".jsp");
			Map map = new HashMap();
			map.put("submitUrl", path11+form.getPojoform().getFormDefCode()+".jsp");
			map.put("formDefId", form.getFormDefId());
			sysFormconfigMapperExpand.updateSubmitUrl(map);
			logger.info(path11);
			//获取文件路径和文件名
			String path="C:/MyeHR/MyeHR_ORACLE/JSP/"+path11;
			String path1 =  request.getPath()+"\\"+path11;
			CreateFileUtil.createDir(path);
			CreateFileUtil.createDir(path1);
			
			try {  
				File f = new File(path+"/"+form.getPojoform().getFormDefCode()+".jsp");
				File f1 = new File(path1+"/"+form.getPojoform().getFormDefCode()+".jsp"); 
				
				File f3 = new File(path1+"/"+form.getPojoform().getFormDefCode()+".js"); 
				
				
				if (f3.exists()) {  
					System.out.print("文件存在");  
				} else {  
					System.out.print("文件不存在");  
					f3.createNewFile();// 不存在则创建  
				}
				OutputStreamWriter write3 = new OutputStreamWriter(new FileOutputStream(f3),"utf-8");
				BufferedWriter output3=new BufferedWriter(write3);
				output3.write(detailMst[11].toString());
				output3.close();
				if (f.exists()) {  
					System.out.print("文件存在");  
				} else {  
					System.out.print("文件不存在");  
					f.createNewFile();// 不存在则创建
				}
				OutputStreamWriter write = new OutputStreamWriter(new FileOutputStream(f),"utf-8");
				BufferedWriter output=new BufferedWriter(write);
				//html
				output.write(expands[0].toString());
				output.write(expands[6].toString());
				output.write(detailMst[0].toString());
				output.write(expands[2].toString()); 
				output.write(detailMst[1].toString());
				output.write(mst[11].toString());
				output.write(expands[4].toString());
				output.write("<script type=\"text/javascript\" src=\"/myehr/jsp/formbuild/"+path11+form.getPojoform().getFormDefCode()+".js\"></script>\n");
				
				//js
				output.write(mst[3].toString());  
				//output.write(mst[4].toString());
				output.write(mst[18].toString());
				output.write(detailMst[12].toString());//高级查询
				
				output.write(mst[56].toString());//function(
				//output.write(detailMst[2].toString());
				output.write(detailMst[15].toString());
				//output.write(expands[3].toString());
				output.write(detailMst[14].toString());
				output.write(mst[29].toString());
				output.write(detailMst[13].toString());
				
				output.write("changeQueryGrid0();\n");
				output.write("showTabActive('${param.activeTab}');\n");
				
				
				output.write(mst[34].toString());
				output.write(detailMst[3].toString());
				//output.write(paramas[1].toString());
				output.write(detailMst[10].toString());
				
				
				
				output.write(detailMst[4].toString());
				//output.write(paramas[0].toString());
				
//				output.write(mst[20].toString());
//				output.write(mst[36].toString());
//				output.write(mst[37].toString());
				
				output.write(detailMst[5].toString());
				
				output.write(detailMst[7].toString());
				
				output.write(detailMst[8].toString());
				
				output.write(mst[25].toString());
				output.write(mst[27].toString());
				output.write(mst[26].toString());
				output.write(exportMstTabDetail);
				
				output.write(mst[19].toString());
				
				output.close();  
				
				if (f1.exists()) {  
					System.out.print("文件存在");  
				} else {  
					System.out.print("文件不存在");  
					f1.createNewFile();// 不存在则创建
				}
				OutputStreamWriter write1 = new OutputStreamWriter(new FileOutputStream(f1),"utf-8");
				BufferedWriter output1=new BufferedWriter(write1);
				//html
				output1.write(expands[0].toString());
				output1.write(expands[6].toString());
				output1.write(detailMst[0].toString());
				output1.write(expands[2].toString()); 
				output1.write(detailMst[1].toString());
				output1.write(mst[11].toString());
				output1.write(expands[4].toString());
				output1.write("<script type=\"text/javascript\" src=\"/myehr/jsp/formbuild/"+path11+form.getPojoform().getFormDefCode()+".js\"></script>\n");
				
				//js
				output1.write(mst[3].toString());  
				//output1.write(mst[4].toString());
				output1.write(mst[18].toString());
				
				output1.write(detailMst[12].toString());
				
				output1.write(mst[56].toString());//function(getDictDatasByFormId
				//output1.write(detailMst[2].toString());
				output1.write(detailMst[15].toString());
//				output1.write(expands[3].toString());
				output1.write(detailMst[14].toString());
				output1.write(mst[29].toString());
				output1.write(detailMst[13].toString());
				
				output1.write("changeQueryGrid0();\n");

				output1.write("showTabActive('${param.activeTab}');\n");
				output1.write(mst[34].toString());
				output1.write(detailMst[3].toString());
				//output1.write(paramas[1].toString());
				output1.write(detailMst[10].toString());
				
				
				output1.write(detailMst[4].toString());
				//output1.write(paramas[0].toString());
				output1.write(detailMst[5].toString());
				
				output1.write(detailMst[7].toString());
				
				output1.write(detailMst[8].toString());
				
				output1.write(mst[25].toString());
				output1.write(mst[27].toString());
				output1.write(mst[26].toString());
				output1.write(exportMstTabDetail);
				
				output1.write(mst[19].toString()); 
				
				output1.close();  
				
			} catch (Exception e) {  
				e.printStackTrace();logger.error(e.getMessage(),e);
			}  
			
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();logger.error(e.getMessage(),e);
			}
			return null;
	}
	
	private StringBuffer[] expandHtmlTabs(SysFormconfigMstTabCache mst) {
		// TODO Auto-generated method stub
		StringBuffer[] expand = new StringBuffer[20];
		for(int i=0;i<15;i++){
			expand[i] = new StringBuffer();
		}
		/*
		   expand[0].append(SysCardFormBeansUtil.getNbsp(0)+"<%@ page language=\"java\" import=\"com.myehr.common.util.LangUtil\" import=\"java.util.*\" pageEncoding=\"UTF-8\"%>\n"+
							SysCardFormBeansUtil.getNbsp(0)+"<%@ include file=\"/common/commontest.jsp\" %>\n"+
							SysCardFormBeansUtil.getNbsp(0)+"<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\n"+
							SysCardFormBeansUtil.getNbsp(0)+"<html>\n"+
							SysCardFormBeansUtil.getNbsp(0)+"<body>\n"+
							SysCardFormBeansUtil.getNbsp(0)+"<form id=\"form_"+mst.getMstTabFormId()+"\" name=\"form_"+mst.getMstTabFormId()+"\"  style=\"height:100%;margin:0px\">\n");
		*/
		
		expand[0].append(	SysCardFormBeansUtil.getNbsp(0)+"<%@ page language=\"java\" pageEncoding=\"UTF-8\"%>\n"+
							SysCardFormBeansUtil.getNbsp(0)+"<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\n"+
							SysCardFormBeansUtil.getNbsp(0)+"<html>\n"+
							SysCardFormBeansUtil.getNbsp(0)+"<link rel=\"stylesheet\" href=\"/myehr/common/css/commomcss.css\" type=\"text/css\"></link>\n"+
							SysCardFormBeansUtil.getNbsp(0)+"<link rel=\"stylesheet\" href=\"/myehr/common/css/font-awesome-4.7.0/css/font-awesome.min.css\" type=\"text/css\"></link>\n"+
							SysCardFormBeansUtil.getNbsp(0)+"<link rel=\"stylesheet\" href=\"/myehr/common/js/assets/bootstrap/css/bootstrap.css\" type=\"text/css\"></link>\n"+
							SysCardFormBeansUtil.getNbsp(0)+"<link rel=\"icon\" type=\"image/x-icon\" href=\"/myehr/jsp/orgpicture/dabengOrgChart/myorg/img/logo.ico\">\n"+
							SysCardFormBeansUtil.getNbsp(0)+"<script type=\"text/javascript\" src=\"/myehr/common/js/commonjs.js\"></script>\n"+
							SysCardFormBeansUtil.getNbsp(0)+"<script type=\"text/javascript\" src=\"/myehr/common/js/date-format.js\"></script>\n"+
							SysCardFormBeansUtil.getNbsp(0)+"<body>\n"+
							
							SysCardFormBeansUtil.getNbsp(0)+"<form id=\"form_"+mst.getMstTabFormId()+"\" name=\"form_"+mst.getMstTabFormId()+"\"  style=\"height:100%;margin:0px\">\n");
		
		expand[1].append(	SysCardFormBeansUtil.getNbsp(0)+"<div class=\"container-fluid\" style=\"overflow:auto;float:left;\">\n");
		expand[6].append(	SysCardFormBeansUtil.getNbsp(1)+"<ul class=\"nav nav-tabs\" id=\"myTab\">\n");		
		
		expand[2].append(	SysCardFormBeansUtil.getNbsp(1)+"</ul>\n"+
							SysCardFormBeansUtil.getNbsp(1)+"<div class=\"tab-content\">\n");
		
		expand[3].append(	SysCardFormBeansUtil.getNbsp(1)+"$('#myTab a').click(function (e) {\n"+
							SysCardFormBeansUtil.getNbsp(2)+"		e.preventDefault();\n"+
							SysCardFormBeansUtil.getNbsp(2)+"		$(this).tab('show');\n"+
							SysCardFormBeansUtil.getNbsp(2)+"		var tab = this.hash;var tab2 = $(tab).find('table').bootstrapTable('refresh');\n"+
							SysCardFormBeansUtil.getNbsp(1)+"});\n");
		
		expand[4].append("</div>\n</form>\n");
		
		return expand;
	}
	
	private StringBuffer[] detailMstHtmlTabs(List<SysFormconfigMstTabDetailCache> sDetailMsts,SysRequestParam request,String isApp,ActNodePropertiesExpand actNodePropertiesExpand) throws Exception {
		// TODO Auto-generated method stub
		StringBuffer[] detailMst = new StringBuffer[20];
		String userId = request.getSession().getAttribute("userid")+"";
		for(int i=0;i<18;i++){
			detailMst[i] = new StringBuffer();
		}
		int i = 0;
		int y = 0;
		for (SysFormconfigMstTabDetailCache sDetail1 : sDetailMsts) {
			detailMst[14].append(SysCardFormBeansUtil.getNbsp(1)+"var x"+y+"=0;\n");
			y++;
		}
		y=0;
		detailMst[14].append(	SysCardFormBeansUtil.getNbsp(1)+"$('#myTab a').click(function (e) {\n"+
								SysCardFormBeansUtil.getNbsp(3)+"e.preventDefault();\n" +
								SysCardFormBeansUtil.getNbsp(3)+"var x = $(this)[0].innerHTML;\n");
		List<SysFormconfigCache> formList = new ArrayList<SysFormconfigCache>();
		for (SysFormconfigMstTabDetailCache sDetail : sDetailMsts) {
			String detailMstFormId = sDetail.getTabDetailFormId()+"";
			SysFormconfigCache sCache = sysformconfigService.getForm(detailMstFormId);
			formList.add(sCache);
			detailMst[14].append(	SysCardFormBeansUtil.getNbsp(1)+"if(x==\""+sDetail.getTabDetailFormTitle()+"\"){\n"+
									SysCardFormBeansUtil.getNbsp(3)+"if(x"+y+"==0){\n");
			if(i>0){
				detailMst[14].append(	SysCardFormBeansUtil.getNbsp(3)+"querys_"+sDetail.getTabDetailFormId()+"();\n");
			}
			detailMst[14].append(	SysCardFormBeansUtil.getNbsp(2)+"if('${param.activeTab}'!=''){\n"+
									SysCardFormBeansUtil.getNbsp(3)+"changeShowTab('"+y+"');\n"+
									SysCardFormBeansUtil.getNbsp(2)+"};\n"+
									SysCardFormBeansUtil.getNbsp(3)+"$(this).tab('show');\n"+
									SysCardFormBeansUtil.getNbsp(3)+"var tab = this.hash;\nvar tab2 = $(tab).find('table').bootstrapTable('refresh');\n"+
									SysCardFormBeansUtil.getNbsp(3)+"changeQueryGrid('"+sCache.getFormDefCode()+"_List');\n"+
									SysCardFormBeansUtil.getNbsp(3)+"}else{\n"+
									SysCardFormBeansUtil.getNbsp(3)+"$(this).tab('show');\n"+
									SysCardFormBeansUtil.getNbsp(3)+"var tab = this.hash;\nvar tab2 = $(tab).find('table').bootstrapTable('refresh');\n"+
									SysCardFormBeansUtil.getNbsp(3)+"}\n"+
									SysCardFormBeansUtil.getNbsp(3)+"x"+y+"++;\n"+
									SysCardFormBeansUtil.getNbsp(3)+"}\n");
			y++;
			i++;
			String str1 = " ";
			String str2 = " ";
			if (i==1) {
				str1 = " ";//class=\"active\"
				str2 = " active";
			}
			detailMst[0].append(SysCardFormBeansUtil.getNbsp(2)+"<li"+str1+"><a href=\"#Tab_"+i+"\">"+sDetail.getTabDetailFormTitle()+"</a></li>\n");
			
			detailMst[1].append(SysCardFormBeansUtil.getNbsp(2)+"<div class=\"tab-pane"+str2+"\" id=\"Tab_"+i+"\">\n" +
								SysCardFormBeansUtil.getNbsp(3)+"<div class=\"container-fluid\">\n"+
								SysCardFormBeansUtil.getNbsp(4)+"<div style=\"margin-top:5px;\">\n");
			
			//通过主表Id获取html

			StringBuffer[] mst = sCache.showPage(request,isApp,actNodePropertiesExpand,null,0);
			detailMst[1].append(SysCardFormBeansUtil.getNbsp(3)+"<div class=\"container-tabs\">\n");
 		    detailMst[1].append(mst[24]);
			detailMst[1].append(mst[6]);
			detailMst[1].append(SysCardFormBeansUtil.getNbsp(2)+"</div>\n");
			detailMst[1].append(mst[33]);
			detailMst[1].append(mst[17]);
			detailMst[1].append(SysCardFormBeansUtil.getNbsp(2)+"</div>\n</div>\n</div>\n");
			//从表js
			detailMst[12].append(mst[55]);//querys
			detailMst[13].append(mst[23]);//querys
			detailMst[2].append(mst[28]);//querys
			if (i==1) {
				detailMst[15].append(mst[28]);
			}
			detailMst[3].append(mst[30]);//_formId
			detailMst[4].append(mst[20]);//function querys
			detailMst[4].append(mst[36]);
			detailMst[4].append(mst[37]);
			detailMst[4].append(mst[0]);
			detailMst[4].append(mst[21]);
			detailMst[4].append(mst[31]);
			detailMst[5].append(mst[22]);//function refresh
			detailMst[4].append(mst[47]);//高级查询JS
//			detailMst[6].append(mst[23]);//查询条件与分页数据
			detailMst[7].append(mst[7]);//按钮方法
			detailMst[8].append(mst[8]);//
			detailMst[8].append(mst[2]);//
			detailMst[9].append(SysCardFormBeansUtil.getNbsp(4)+"$('#"+sCache.getFormDefCode()+"_List').bootstrapTable('refresh');\n");
			detailMst[10].append(mst[40]+"\n");
			detailMst[16].append(mst[63]);
			detailMst[17].append(detailMstFormId+",");
			
			detailMst[11].append(SysGridFormBeansUtil.getBuildJsp6ForBatchEdit(sCache));
			detailMst[11].append(mst[57].toString());
			detailMst[11].append("]\n})\n}\n");
			detailMst[11].append(SysGridFormBeansUtil.getBuildJspForBatchEditJs(sCache));
			
		}
		detailMst[14].append(	SysCardFormBeansUtil.getNbsp(1)+"});\n");
		//detailMst[11].append(CardAndCardFormBeansUtil.getDictInfoByForms(formList, sysformconfigService));
		return detailMst;
	}
			
	@Override
	public ResultMap getAllDictMsSql(SysRequestParam request)
			throws Exception {
		// TODO Auto-generated method stub
				String sql;
				Pagers pagers= fServiceImpl.translateRequest(request.getRequest(),"DICT_TYPE_ClASS");
				String str = "";
				if (pagers.getExpand()!=null&&pagers.getExpand().equals("SQL")) {
					str = "and DICT_TYPE_ClASS = 'SQL'";
				}
				sql="SELECT TOP "+pagers.getLimit()+" * "+
					"FROM sys_dict_type "+
					"WHERE (dict_type_id NOT IN "+
					"          (SELECT TOP ("+pagers.getLimit()+"*("+pagers.getPageSize()+"-1)) dict_type_id "+
					"			FROM sys_dict_type where (upper(DICT_TYPE_CODE) LIKE '%"+pagers.getConditionString().toUpperCase()+"%'OR upper(DICT_TYPE_NAME) LIKE '%"+pagers.getConditionString().toUpperCase()+"%') AND upper(DELETE_MARK) = 'N' "+str+
					"         	ORDER BY dict_type_id)) and (upper(DICT_TYPE_CODE) LIKE '%"+pagers.getConditionString().toUpperCase()+"%'OR upper(DICT_TYPE_NAME) LIKE '%"+pagers.getConditionString().toUpperCase()+"%') AND upper(DELETE_MARK) = 'N' "+str+
					"ORDER BY dict_type_id";		
				ResultMap pageresponse = new ResultMap();  
		        Map<String, Object> maps=new HashMap<String, Object>();
		        maps.put("sql", sql);
		        List<SysDictType> list = sTypeExpandMapper.getAllEmployee(maps); //当前页显示的数据  getAllEmployee
	        	sql="SELECT COUNT(*) from (select * FROM SYS_DICT_TYPE WHERE ((DICT_TYPE_CODE) LIKE '%"+pagers.getConditionString().toUpperCase()+"%'"+
						"OR upper(DICT_TYPE_NAME) LIKE '%"+pagers.getConditionString().toUpperCase()+"%') and upper(delete_mark) = 'N' "+str+
						") a";
		        maps.put("sql2", sql);
		        Integer total = sTypeExpandMapper.getTotalEmployee(maps);  //数据总条数  
		        List<Object> list_obj=new ArrayList<Object>();
				for (SysDictType u : list) {
					list_obj.add(u);
				}
		        pageresponse.setRows(list_obj);  
		        pageresponse.setTotal(total);  
		        return pageresponse;
	}

	@Override
	public String buildFormByTemplate(SysFormconfigCache form,SysRequestParam request, String isApp) {
		// TODO Auto-generated method stub
		try {
			StringBuffer[] sbs = form.showPage(request,isApp,null,null,0);
//			String path11 = findSysFormFolderTreeById(form.getPojoform().getFormDefFolderId().intValue(),"");
			String path11 = form.getFormTreePath();
			form.getPojoform().setFormSubmitUrl(path11+form.getPojoform().getFormDefCode()+".jsp");
			//SysCardTemplate sTemplate = sTemplateMapper.selectByPrimaryKey(Integer.valueOf(form.getPojoform().getExpand1()));
			SysGridbycardTemplateColumnExample example = new SysGridbycardTemplateColumnExample();
			example.or().andTemplateColumnFormDefIdEqualTo(Integer.valueOf(form.getFormDefId()+"")).andTemplateColumnTemplateIdEqualTo(Integer.valueOf(form.getPojoform().getExpand1()));
			List<SysGridbycardTemplateColumn> sList = sTemplateColumnMapper.selectByExample(example);
			Map map = new HashMap();
			map.put("submitUrl", path11+form.getPojoform().getFormDefCode()+".jsp");
			map.put("formDefId", form.getFormDefId());
			sysFormconfigMapperExpand.updateSubmitUrl(map);
			logger.info(path11);
			String path = "C:/MyeHR/MyeHR_ORACLE/JSP/";
			String path1 =  request.getPath()+"\\"+path11;
			CreateFileUtil.createDir(path);
			CreateFileUtil.createDir(path1);
			try {  
				File f = new File(path+form.getPojoform().getFormDefCode()+".jsp");
				File f1 = new File(path1+form.getPojoform().getFormDefCode()+".jsp"); 
				if (f.exists()) {  
					System.out.print("文件存在");  
				} else {  
					System.out.print("文件不存在");  
					f.createNewFile();// 不存在则创建  
				}
				OutputStreamWriter write = new OutputStreamWriter(new FileOutputStream(f),"utf-8");
				BufferedWriter output=new BufferedWriter(write);
				output.write(SysGridFormBeansUtil.formGridByCardHead());
				output.write(sbs[24].toString());
				output.write("<div class=\"row\" style=\"margin-left:0\" id=\""+form.getFormDefCode()+"\">\n");
				output.write("</div>\n");
				output.write(SysGridFormBeansUtil.formGridByCardJsHead());
				output.write(sbs[30].toString());
				output.write(sbs[40].toString());
				output.write(sbs[55].toString());
				output.write(sbs[56].toString());
				output.write("loadDataStart();\n");
				output.write("getEmpPhotoSYS();\n");
				output.write(sbs[34].toString());
				output.write(sbs[8].toString());
				//output.write(SysGridFormBeansUtil.formGridByCardFunction4(form.getFormDefCode(),form.getFormDefId()+""));
				output.write(SysGridFormBeansUtil.formGridByCardFunction1());
				output.write(SysGridFormBeansUtil.getEmpPhotoSYS());
				output.write(SysGridFormBeansUtil.formGridByCardFunction5());
				output.write(SysGridFormBeansUtil.formGridByCardFunction2(form.getFormDefId()+"",form.getFormDefCode(),""));
				output.write(SysGridFormBeansUtil.formGridByCardFunction3(sList,form));
				output.write(CardAndCardFormBeansUtil.endFunction());
				//output.write("})\n;");
				output.write("</script>\n</body>\n</html>");
				output.close();  
				if (f1.exists()) {  
					System.out.print("文件存在");  
				} else {  
					System.out.print("文件不存在");  
					f1.createNewFile();// 不存在则创建  
				}
				OutputStreamWriter write1 = new OutputStreamWriter(new FileOutputStream(f1),"utf-8");
				BufferedWriter output1=new BufferedWriter(write1); 
				output1.write(SysGridFormBeansUtil.formGridByCardHead());
				output1.write(sbs[24].toString());
				output1.write("<div class=\"row\" style=\"margin-left:0\"  id=\""+form.getFormDefCode()+"\">\n");
				output1.write("</div>\n");
				output1.write(SysGridFormBeansUtil.formGridByCardJsHead());
				output1.write(sbs[30].toString());
				output1.write(sbs[40].toString());
				output1.write(sbs[55].toString());
				output1.write(sbs[56].toString());
				output1.write("loadDataStart();\n");
				output1.write("getEmpPhotoSYS();\n");
				output1.write(sbs[34].toString());
				output1.write(sbs[8].toString());
				//output1.write(SysGridFormBeansUtil.formGridByCardFunction4(form.getFormDefCode(),form.getFormDefId()+""));
				output1.write(SysGridFormBeansUtil.formGridByCardFunction1());
				output1.write(SysGridFormBeansUtil.getEmpPhotoSYS());
				output1.write(SysGridFormBeansUtil.formGridByCardFunction5());
				output1.write(SysGridFormBeansUtil.formGridByCardFunction2(form.getFormDefId()+"",form.getFormDefCode(),""));
				output1.write(SysGridFormBeansUtil.formGridByCardFunction3(sList,form));
				output1.write(CardAndCardFormBeansUtil.endFunction());
				//output1.write("})\n;");
				output1.write("</script>\n</body>\n</html>");
				output1.close();  
			} catch (Exception e) {  
				e.printStackTrace();logger.error(e.getMessage(),e);
			}  
			//更新jsp文件访问地址  
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();logger.error(e.getMessage(),e);
		} 
				
		return null;
	}
	
	@Override
	public String buildTimeaxisForm(SysFormconfigCache form,SysRequestParam request, String isApp,List<SysTimeaxisTemplateColumn> templateColumns) {
		// TODO Auto-generated method stub
		try {
			StringBuffer[] sbs = form.showPage(request,isApp,null,null,0);
//			String path11 = findSysFormFolderTreeById(form.getPojoform().getFormDefFolderId().intValue(),"");
			String path11 = form.getFormTreePath();

			form.getPojoform().setFormSubmitUrl(path11+form.getPojoform().getFormDefCode()+".jsp");
//			sysFormconfigMapper.updateByPrimaryKeyWithBLOBs(form.getPojoform());
			Map map = new HashMap();
			map.put("submitUrl", path11+form.getPojoform().getFormDefCode()+".jsp");
			map.put("formDefId", form.getFormDefId());
			sysFormconfigMapperExpand.updateSubmitUrl(map);
	
			logger.info(path11);
			//获取文件路径和文件名
			String path="C:/MyeHR/MyeHR_MSSQL/jsp/"+path11;
			String path1 =  request.getPath()+"\\"+path11;
//			String path1="E:/workspace/Myeclipse/myehr_17_2_19_Oracle/WebRoot/jsp/formbuild"+path11;
			CreateFileUtil.createDir(path);
			CreateFileUtil.createDir(path1);
			//生成文件
			//SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
			try {  
				File f = new File(path+form.getPojoform().getFormDefCode()+".jsp");
				File f1 = new File(path1+form.getPojoform().getFormDefCode()+".jsp"); 
				if (f.exists()) {  
					System.out.print("文件存在");  
				} else {  
					System.out.print("文件不存在");  
					f.createNewFile();// 不存在则创建  
				}
				OutputStreamWriter write = new OutputStreamWriter(new FileOutputStream(f),"utf-8");
				if (sbs[24].toString().equals("")) {
					sbs[28].append("$(\".fixed-table-toolbar\").css(\"margin-top\",\"0px\");\n");
					sbs[28].append("$(\".fixed-table-body\").css(\"height\",\"76%\");\n");
				}
				/*sbs[28].append("$(\".container-fluid\").css(\"max-height\",\"100%\");\n");
				sbs[28].append("$(\".fixed-table-container\").css(\"height\",$('.container-fluid').height() -93 +\"px\");\n");
				sbs[28].append("$(\".fixed-table-body\").css(\"height\",\"84%\");\n");*/
				BufferedWriter output=new BufferedWriter(write);
				if (isApp!=null&&isApp.equals("APP")) {
					output.write(SysGridFormBeansUtilApp.getAppHead());
					
					output.write(SysGridFormBeansUtilApp.appMenuFst());
					output.write(sbs[24].toString());
					output.write(SysGridFormBeansUtilApp.appMenuLst());
					output.write(SysGridFormBeansUtilApp.appContentFst());
					output.write(sbs[33].toString());
					output.write(SysGridFormBeansUtilApp.appPickTitle());
					output.write(SysGridFormBeansUtilApp.getAppGridHead());					
					output.write(sbs[6].toString());
					output.write(sbs[0].toString());
					output.write(SysGridFormBeansUtilApp.getAppFollow());
					output.write(SysGridFormBeansUtilApp.getAppContentLst());
					output.write("</div>\n</div>\n");
					output.write(SysGridFormBeansUtilApp.getJsTemplate());
					output.write(SysGridFormBeansUtilApp.getJsTemplates());
					output.write(SysGridFormBeansUtilApp.getJsExTemplates());
					output.write(SysGridFormBeansUtilApp.getAppJsFst());
					output.write(SysGridFormBeansUtilApp.getAppJsHead());
					output.write(sbs[30].toString());
					output.write(SysGridFormBeansUtilApp.getAppJsContent(form.getPojoform().getFormDefCode(),form.getGrid().getFormPageSize(),form.getPojoform().getFormDefId()+""));
					output.write(sbs[8].toString());
					output.write(SysGridFormBeansUtilApp.appPickJs());
					output.write(SysGridFormBeansUtilApp.getAppJsFollow());
				} else {
					output.write(sbs[16].toString());
					output.write(sbs[24].toString());//原搜索
					output.write(sbs[6].toString());
					output.write(sbs[33].toString());//现搜索
					output.write(sbs[17].toString()); 
					
					output.write(SysGridFormBeansUtil.formTimeaxisHtml1(form,templateColumns));
					
					output.write(sbs[3].toString());  
					output.write(sbs[4].toString());  
					
					output.write(sbs[18].toString());
					output.write(sbs[1].toString()); 
					output.write(sbs[51].toString());
					output.write("var containerParam_"+form.getPojoform().getFormDefId()+";\n");
					output.write("var heightGadedata_"+form.getPojoform().getFormDefId()+";\n");
					output.write("$(function() {\n");
					output.write(sbs[28].toString());
					output.write("    queryAllData_"+form.getPojoform().getFormDefId()+"();\n");
					output.write(sbs[29].toString());
					output.write(sbs[52].toString());
					output.write(sbs[34].toString());
					output.write(sbs[48].toString());
					output.write(sbs[53].toString());
					output.write(sbs[30].toString());
					output.write(sbs[20].toString());
					output.write(sbs[36].toString());
					output.write(sbs[37].toString());
					output.write(sbs[0].toString());
					output.write(sbs[21].toString());
			
					output.write(sbs[31].toString());
					
					output.write(sbs[2].toString());
					output.write(sbs[5].toString());
					/** 刷新页面 */
					output.write(sbs[22].toString());
					
					output.write(SysGridFormBeansUtil.formTimeaxisFunction1(form,templateColumns));
					
					/**查询条件与分页数据 */
					output.write(sbs[23].toString());
					output.write(sbs[7].toString()); 
					output.write(sbs[9].toString());
					output.write(sbs[10].toString());
					output.write(sbs[11].toString());
					output.write(sbs[12].toString()); 
					output.write(sbs[13].toString());
					output.write(sbs[14].toString());
					output.write(sbs[8].toString());
					output.write(sbs[25].toString());
					output.write(sbs[27].toString());
					output.write(sbs[26].toString());
					output.write(sbs[47].toString());
					output.write(sbs[19].toString());
				}
				output.close();  
				if (f1.exists()) {  
					System.out.print("文件存在");  
				} else {  
					System.out.print("文件不存在");  
					f1.createNewFile();// 不存在则创建  
				}
				OutputStreamWriter write1 = new OutputStreamWriter(new FileOutputStream(f1),"utf-8");
				BufferedWriter output1=new BufferedWriter(write1); 
				if (isApp!=null&&isApp.equals("APP")) {
					output1.write(SysGridFormBeansUtilApp.getAppHead());
					output1.write(SysGridFormBeansUtilApp.appMenuFst());
					output1.write(sbs[24].toString());
					output1.write(SysGridFormBeansUtilApp.appMenuLst());
					output1.write(SysGridFormBeansUtilApp.appContentFst());
					output1.write(sbs[33].toString());
					output1.write(SysGridFormBeansUtilApp.appPickTitle());
					output1.write(SysGridFormBeansUtilApp.getAppGridHead());
					output1.write(sbs[6].toString());
					output1.write(sbs[0].toString());
					output1.write(SysGridFormBeansUtilApp.getAppFollow());
					output1.write(SysGridFormBeansUtilApp.getAppContentLst());
					output1.write("</div>\n</div>\n");
					output1.write(SysGridFormBeansUtilApp.getJsTemplate());
					output1.write(SysGridFormBeansUtilApp.getJsTemplates());
					output1.write(SysGridFormBeansUtilApp.getJsExTemplates());
					output1.write(SysGridFormBeansUtilApp.getAppJsFst());
					output1.write(SysGridFormBeansUtilApp.getAppJsHead());
					output1.write(sbs[30].toString());
					output1.write(SysGridFormBeansUtilApp.getAppJsContent(form.getPojoform().getFormDefCode(),form.getGrid().getFormPageSize(),form.getPojoform().getFormDefId()+""));
					output1.write(sbs[8].toString());
					output1.write(SysGridFormBeansUtilApp.appPickJs());
					output1.write(SysGridFormBeansUtilApp.getAppJsFollow());
				} else {
					output1.write(sbs[16].toString());
					output1.write(sbs[24].toString());//原搜索
					output1.write(sbs[6].toString());
					output1.write(sbs[33].toString());//现搜索
					output1.write(sbs[17].toString());
					
					output1.write(SysGridFormBeansUtil.formTimeaxisHtml1(form,templateColumns));
					
					output1.write(sbs[3].toString());  
					output1.write(sbs[4].toString());  
					output1.write(sbs[18].toString());
					output1.write(sbs[1].toString());  
					output1.write(sbs[51].toString());
					output1.write("var containerParam_"+form.getPojoform().getFormDefId()+";\n");
					output1.write("var heightGadedata_"+form.getPojoform().getFormDefId()+";\n");
					output1.write("$(function() {\n");
					output1.write(sbs[28].toString());
					output1.write("    queryAllData_"+form.getPojoform().getFormDefId()+"();\n");
					output1.write(sbs[29].toString());
					output1.write(sbs[52].toString());
					output1.write(sbs[34].toString());
					output1.write(sbs[48].toString());
					output1.write(sbs[53].toString());
					output1.write(sbs[30].toString());
					output1.write(sbs[20].toString());
					output1.write(sbs[36].toString());
					output1.write(sbs[37].toString());
					output1.write(sbs[0].toString());
					output1.write(sbs[21].toString());
					
					output1.write(sbs[31].toString());
					
					output1.write(sbs[2].toString());
					output1.write(sbs[5].toString());  
					/** 刷新页面 */
					output1.write(sbs[22].toString());
					
					output1.write(SysGridFormBeansUtil.formTimeaxisFunction1(form,templateColumns));
					
					/**查询条件与分页数据 */
					output1.write(sbs[23].toString());
					output1.write(sbs[7].toString()); 
					output1.write(sbs[9].toString());
					output1.write(sbs[10].toString());
					output1.write(sbs[11].toString());
					output1.write(sbs[12].toString()); 
					output1.write(sbs[13].toString());
					output1.write(sbs[14].toString());
					output1.write(sbs[8].toString());
					output1.write(sbs[25].toString());
					output1.write(sbs[27].toString());
					output1.write(sbs[26].toString());
					output1.write(sbs[47].toString());
					output1.write(sbs[19].toString());
				}
				output1.close();  
				
			} catch (Exception e) {  
				e.printStackTrace();logger.error(e.getMessage(),e);
			}  
			//更新jsp文件访问地址  
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();logger.error(e.getMessage(),e);
		} 
		return null;
	}
	
	@Override
	public String buildTreeOrgChart(SysFormconfigCache form,SysRequestParam request,String isApp,SysFormconfigTree formTree) {
		String treeSolutionId=formTree.getFormTreeSolutionId()+"";
		String enterMark ="\n";
		
		SysTreeSolutionColumnExample example1 = new SysTreeSolutionColumnExample();
		com.myehr.pojo.formmanage.form.SysTreeSolutionColumnExample.Criteria criteria1 = example1.createCriteria();
		criteria1.andTreeSolutionIdEqualTo(new BigDecimal(treeSolutionId));
		List<SysTreeSolutionColumn> SolutionColumns = sTreeSolutionColumnMapper.selectByExample(example1);
		
		
		String nodeId = "";
		String nodeParent = "";
		String nodeName = "";
		String nodeContent = "";
		for (int i = 0; i < SolutionColumns.size(); i++) {
			String tableName = SolutionColumns.get(i).getTreeEntityTablename();
			tableName=tableName.replaceAll("_", "");
			tableName = tableName.toUpperCase();
			if (SolutionColumns.get(i).getTreeColumnType()!=null) {
				if(SolutionColumns.get(i).getTreeColumnType().equals("nodeId")){
					nodeId = tableName+"_"+SolutionColumns.get(i).getTreeFieldTablename();
				}
				if(SolutionColumns.get(i).getTreeColumnType().equals("nodeParent")){
					nodeParent = tableName+"_"+SolutionColumns.get(i).getTreeFieldTablename();
				}
				if(SolutionColumns.get(i).getTreeColumnType().equals("nodeId")){
					nodeId = tableName+"_"+SolutionColumns.get(i).getTreeFieldTablename();
				}
				if(SolutionColumns.get(i).getTreeColumnType().equals("nodeName")){
					nodeName = tableName+"_"+SolutionColumns.get(i).getTreeFieldTablename();
				}
				if(SolutionColumns.get(i).getTreeColumnType().equals("nodeContent")){
					nodeContent = tableName+"_"+SolutionColumns.get(i).getTreeFieldTablename();
				}
			}
			
		}
		
		String initParam = " ";
		String initFun = " ";
		String othrerParam = " ";
		String othrerHtml = " ";
		String othrerjs = " ";
		String otherUrl = " ";
		String urlParam = " ";
		Map<String,List<SysFormGeneralParamCache>> param = form.getTree().getGeneralParams();
		List<SysFormGeneralParamCache> generalParams = param.get("JS_VAR");
		
		int flag = 0;
		String varParam = " ";
		String varParamValue = " ";
		String  paramMap = " ";
		if (generalParams!=null) {
			for(int i=0;i<generalParams.size();i++){
				if (generalParams.get(i).getPojo().getParamFromType().equals("initParam")) {
					varParam+="var "+generalParams.get(i).getPojo().getParamName()+";"+enterMark;
					varParamValue+=generalParams.get(i).getPojo().getParamName()+"=data["+flag+"];"+enterMark;
					urlParam += "+\"param_"+flag+"="+generalParams.get(i).getPojo().getParamName()+"&\"";
					flag++;
					paramMap+=generalParams.get(i).getPojo().getParamName()+":"+generalParams.get(i).getPojo().getParamName()+",";
				}else if(generalParams.get(i).getPojo().getParamFromType().equals("parameter")){
					othrerParam+="String "+generalParams.get(i).getPojo().getParamName()+" = request.getParameter(\""+generalParams.get(i).getPojo().getParamName()+"\");"+enterMark;
					othrerHtml+="<input type=\"hidden\" name=\""+generalParams.get(i).getPojo().getParamName()+"\" id=\""+generalParams.get(i).getPojo().getParamName()+"\" value=\"<%="+generalParams.get(i).getPojo().getParamName()+"%>\"/>"+enterMark;
					othrerjs+="    var "+generalParams.get(i).getPojo().getParamName()+" = document.getElementById(\""+generalParams.get(i).getPojo().getParamName()+"\").value;"+enterMark;
					otherUrl +="+\"&"+generalParams.get(i).getPojo().getParamName()+"="+"\"+"+generalParams.get(i).getPojo().getParamName();
					paramMap+=generalParams.get(i).getPojo().getParamName()+":'${param."+generalParams.get(i).getPojo().getParamName()+"}',";
				}else {
					othrerParam+="String "+generalParams.get(i).getPojo().getParamName()+" = request.getParameter(\""+generalParams.get(i).getPojo().getParamName()+"\");"+enterMark;
					othrerHtml+="<input type=\"hidden\" name=\""+generalParams.get(i).getPojo().getParamName()+"\" id=\""+generalParams.get(i).getPojo().getParamName()+"\" value=\"<%="+generalParams.get(i).getPojo().getParamName()+"%>\"/>"+enterMark;
					othrerjs+="    var "+generalParams.get(i).getPojo().getParamName()+" = document.getElementById(\""+generalParams.get(i).getPojo().getParamName()+"\").value;"+enterMark;
					otherUrl +="+\"&"+generalParams.get(i).getPojo().getParamName()+"="+"\"+"+generalParams.get(i).getPojo().getParamName();
				}
			}
		}
		
		
		String initExecSqlFun = " ";
		String intOrgPickure = "buildOrgPicture();\n";
		if (form.getPojoform().getFormDefInitQzSql()!=null) {
			initExecSqlFun+="function initExecSqlFun(){"+enterMark
				+"var paramsMap = {"+paramMap.substring(0, paramMap.length()-1)+"};"+enterMark
				+"var _param = {};"+enterMark
				+"_param.formId="+form.getFormDefId()+";"+enterMark
				+"_param.paramsMap = paramsMap"+enterMark
				+"$.ajax({"+enterMark
				+"	url:'/myehr/form/initExecSql.action',"+enterMark
				+"	type:'post',"+enterMark
				+"	data: JSON.stringify(_param),"+enterMark
				+"	cache: false,"+enterMark
				+"	contentType: 'application/json;charset=utf-8',"+enterMark
				+"	success: function (text) {"+enterMark
				+"	    buildOrgPicture();"+enterMark
				+"	}"+enterMark
				+"});"+enterMark
				+"}"+enterMark;
		}else {
			intOrgPickure="buildOrgPicture();";
		}
		
		
		String orgId = "orgId";
		if(generalParams!=null){
			if (generalParams.size()>0) {
				orgId = generalParams.get(0).getPojo().getParamFromValue();
			}
		}
		
		
		if (flag>0) {
			initParam+=varParam+"initLayerParam();";
			initFun+="function initLayerParam(){"+enterMark
			+"var url = \"/myehr/jsp/form/filter/frontParam.jsp?\""+urlParam+";"+enterMark
			+"layer.open({"+enterMark
			+"	type: 2,"+enterMark
			+"	title:'弹出参数',"+enterMark
			+"	shadeClose: true,"+enterMark
			+"	shade: 0.8,"+enterMark
			//+"	maxmin:true,"+enterMark
			+"	zIndex:9999,"+enterMark
			+"	area: ['500px', '300px'],"+enterMark
			+"	content: url,"+enterMark
			+"	success:function(layero,index){"+enterMark
			+"	$('.layui-layer-max').click();"+enterMark
			+"	},"+enterMark
			+"	end:function(){"+enterMark
			+"      initExecSqlFun();"+enterMark
			+"	}"+enterMark
			+"});"+enterMark
			+"};"+enterMark
			+"function initFilterParam(data){"+enterMark
			+varParamValue+enterMark
			+"}"+enterMark;
		}
		
		
		String jsp="";
		
		jsp+="<%@page pageEncoding=\"UTF-8\" contentType=\"text/html; charset=UTF-8\" %>"+enterMark
			+"<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">"+enterMark
			+"<%@include file=\"/common/common.jsp\"%>"+enterMark
			+"<%"+enterMark
			+othrerParam
			+"%>"+enterMark
			+"<html lang=\"en\">"+enterMark
			+"<head>"+enterMark
			+"<meta charset=\"utf-8\">"+enterMark
			+"<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">"+enterMark
			+"<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">"+enterMark
			+"<title>组织机构图</title>"+enterMark
			+"</head>"+enterMark
			+"<body style=\"height:670px;\">"+enterMark
			+othrerHtml
			+"<input type=\"hidden\" value=\"查询\" onclick=\"buildOrgPicture()\"/>"+enterMark
			+"<div style=\"margin:10px 0 0 10px;\"><select onchange=\"changeChartType(this)\">"+enterMark
			+"<option value =\"eCharts\">eCharts图表</option>"+enterMark
			+"<option value =\"orgChart\">orgChart图表</option>"+enterMark
			+"</select></div>"+enterMark
			+"<div style=\"height:95%;width:98%;float:left\" id=\"chart-container\"></div>"+enterMark
			+"<div style=\"height:95%;width:98%;float:left\" id=\"chart-eChart\"></div>"+enterMark
			+"<input type=\"hidden\" name=\"basePath\" id=\"basePath\" value=\"<%= request.getContextPath() %>\"/>"+enterMark
			+"</body>"+enterMark
			+"</html>"+enterMark
			+"<script type=\"text/javascript\">"+enterMark
			+"$(function() {"+enterMark
	    	+"    document.getElementById(\"chart-container\").style.display='none';"+enterMark
			+initParam+enterMark
			+intOrgPickure+enterMark
			+"});"+enterMark
			+initFun
			+initExecSqlFun
			+"function buildOrgPicture(){"+enterMark
			+othrerjs
			+"    var basePath = document.getElementById(\"basePath\").value;"+enterMark
			+"    $.ajax({"+enterMark
			+"        url: basePath+\"/org/searchTreeData.action?formId="+formTree.getFormTreeFormId()+"&treeSolutionId=\"+"+formTree.getFormTreeSolutionId()+otherUrl+","+enterMark
			+"        type: 'POST',"+enterMark
			+"        cache: false,"+enterMark
			+"        contentType: 'application/json;charset=utf-8',"+enterMark
			+"        success: function(mydata) {"+enterMark
			+"        	  initOrgPicture(mydata);"+enterMark
			+"        	  var total = mydata.total*2;"+enterMark
			+"            document.getElementById(\"chart-eChart\").style.height=total+'%';"+enterMark
			+"            document.getElementById(\"chart-eChart\").style.width='100%';"+enterMark
			+"        	  initCharts(mydata);"+enterMark
	    	+"        },"+enterMark
	    	+"        error: function(jqXHR, textStatus, errorThrown) {"+enterMark
	    	+"            alert(jqXHR.responseText);"+enterMark
	    	+"        }"+enterMark
	    	+"    });"+enterMark
	    	+"}"+enterMark
	    	
	    	+"function initOrgPicture(mydata){"+enterMark
	    	+"    var datascource =mydata;"+enterMark
//	    	+"	  document.getElementById(\"chart-eChart\").style.height='100%';"+enterMark
//	    	+"	  document.getElementById(\"chart-eChart\").style.height='100%';"+enterMark
			+"    $('#chart-container').orgchart({"+enterMark
			+"        'data' : datascource,"+enterMark
			+"        'depth': 2,"+enterMark
			+"        'nodeTitle': '"+nodeName+"',"+enterMark
			+"        'nodeContent': '"+nodeContent+"',"+enterMark
			+"        'exportButton': true,"+enterMark
			+"        'exportFilename': 'MyOrgChart',"+enterMark
			+"        'createNode': function($node, data) {"+enterMark
			+"            var secondMenuIcon = $('<i>', {"+enterMark
			+"                'class': 'fa fa-info-circle second-menu-icon',"+enterMark
			+"                click: function() {"+enterMark
			+"                    $(this).siblings('.second-menu').toggle();"+enterMark
			+"                }"+enterMark
			+"            });"+enterMark
			+"            var secondMenu = '';"+enterMark
			+"            if(data.类型==\"人员\"){"+enterMark
			+"                secondMenu = '<div class=\"second-menu\"><img class=\"avatar\" src=\"./img/avatar/'+0+'.jpg\"></div>'; "+enterMark
			+"            }"+enterMark
	    	+"            $node.append(secondMenuIcon).append(secondMenu);"+enterMark
	    	+"        }"+enterMark
	    	+"    });"+enterMark
	    	+"}"+enterMark
	    	
	    	+"function initCharts(mydata){"+enterMark
	    	+"    var datascource =mydata;"+enterMark
	    	+"    var myChart = echarts.init(document.getElementById('chart-eChart'));"+enterMark
	    	+"    var series = {"+enterMark
	        +"        type: 'tree',"+enterMark
	        +"        name: '"+form.getFormDefName()+"',"+enterMark
	        +"        data: [datascource],"+enterMark
	        +"        top: '5%',"+enterMark
	        +"        left: '17%',"+enterMark
	        +"        bottom: '2%',"+enterMark
	        +"        right: '60%',"+enterMark
	        +"        symbolSize: 7,"+enterMark
	        +"        dataZoom: {"+enterMark
	        +"            show: true,"+enterMark
	        +"            realtime: true,"+enterMark
	        +"            y: 36,"+enterMark
	        +"            height: 20,"+enterMark
	        +"            start: 20,"+enterMark
	        +"            end: 80,"+enterMark
	        +"        },"+enterMark
	        +"        label: {"+enterMark
	        +"            normal: {"+enterMark
	        +"                position: 'left',"+enterMark
	        +"                verticalAlign: 'middle',"+enterMark
	        +"                align: 'right'"+enterMark
	        +"            }"+enterMark
	        +"        },"+enterMark
	        +"        leaves: {"+enterMark
	        +"            label: {"+enterMark
	        +"                normal: {"+enterMark
	        +"                    position: 'right',"+enterMark
	        +"                    verticalAlign: 'middle',"+enterMark
	        +"                    align: 'left'"+enterMark
	        +"                }"+enterMark
	        +"            }"+enterMark
	        +"        },"+enterMark
	        +"        expandAndCollapse: true,"+enterMark
	        +"        animationDuration: 550,"+enterMark
	        +"        animationDurationUpdate: 750"+enterMark
	        +"     },"+enterMark
	    	
	        +"    options = {"+enterMark
	        +"     	tooltip: {"+enterMark
	        +"	        trigger: 'item',"+enterMark
	        +"	        triggerOn: 'mousemove'"+enterMark
	        +"	    },"+enterMark
	        +"	    toolbox: {"+enterMark
			+"	    	show: true,"+enterMark
			+"	    	feature: {"+enterMark
			+"	    		restore: {},"+enterMark
			+"	    		saveAsImage: {}"+enterMark
			+"	    	}"+enterMark
			+"	    },"+enterMark
	        +"	    legend: {"+enterMark
	        +"	        top: '2%',"+enterMark
	        +"	        left: '3%',"+enterMark
	        +"	        orient: 'vertical',"+enterMark
	        +"	        data: [{"+enterMark
	        +"	            name: '"+form.getFormDefName()+"',"+enterMark
	        +"	            icon: 'rectangle'"+enterMark
	        +"	        } ,"+enterMark
	        +"	        {"+enterMark
	        +"	            name: 'tree2',"+enterMark
	        +"	            icon: 'rectangle'"+enterMark
	        +"	        }],"+enterMark
	        +"	        borderColor: '#c23531'"+enterMark
	        +"	    },"+enterMark
	        +"	    series:[series]"+enterMark
	        +"	}"+enterMark
	        +"	myChart.setOption(options);"+enterMark
	    	+"}"+enterMark
	    	
	    	+"function changeChartType(obj){"+enterMark
	    	+"    if(obj.value=='orgChart'){"+enterMark
	    	+"        document.getElementById(\"chart-container\").style.display='';"+enterMark
	    	+"        document.getElementById(\"chart-eChart\").style.display='none';"+enterMark
	    	+"	      document.getElementById(\"chart-container\").style.width='98%';"+enterMark
	    	+"	      document.getElementById(\"chart-container\").style.height='95%';"+enterMark
	    	+"    }else{"+enterMark
	    	+"	      document.getElementById(\"chart-container\").style.display='none';"+enterMark
	    	+"	      document.getElementById(\"chart-eChart\").style.display='';"+enterMark
	    	+"	      document.getElementById(\"chart-eChart\").style.width='98%';"+enterMark
	    	+"	      document.getElementById(\"chart-eChart\").style.height='95%';"+enterMark
	    	+"    }"+enterMark
	    	+"}"+enterMark
	    	
	    	+"</script> "+enterMark
			+"";
		
		
//		String path11 = findSysFormFolderTreeById(form.getPojoform().getFormDefFolderId().intValue(),"");
		String path11 = form.getFormTreePath();

		form.getPojoform().setFormSubmitUrl(path11+form.getPojoform().getFormDefCode()+".jsp");
//		sysFormconfigMapper.updateByPrimaryKeyWithBLOBs(form.getPojoform());
		Map map = new HashMap();
		map.put("submitUrl", path11+form.getPojoform().getFormDefCode()+".jsp");
		map.put("formDefId", form.getFormDefId());
		sysFormconfigMapperExpand.updateSubmitUrl(map);

		logger.info(path11);
		//获取文件路径和文件名
//		String path="E:/myeclipse/workspace1/myehr/WebRoot/jsp/formbuld";
		String path="C:/MyeHR/jsp/"+path11;
//		String path1="E:/myeclipse/workspace1/.metadata/.me_tcat/webapps/myehr/jsp/formbuld";
		String path1 =  request.getPath()+"\\"+path11;
//		String path1= "E:/SqlServer/myeclipse/apache-tomcat-6.0.45/webapps/myehr/jsp/formbuild/"+path11;
		
		//生成文件
		//SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		
		CreateFileUtil.createDir(path);
		CreateFileUtil.createDir(path1);
		try {  
			File f = new File(path+"/"+form.getPojoform().getFormDefCode()+".jsp");
			File f1 = new File(path1+"/"+form.getPojoform().getFormDefCode()+".jsp"); 
			if (f.exists()) {  
				System.out.print("文件存在");  
			} else {  
				System.out.print("文件不存在");  
				f.createNewFile();// 不存在则创建
			}
			OutputStreamWriter write = new OutputStreamWriter(new FileOutputStream(f),"utf-8");
			BufferedWriter output=new BufferedWriter(write); 
			output.write(jsp);
			output.close();  
			if (f1.exists()) {  
				System.out.print("文件存在");  
			} else {  
				System.out.print("文件不存在");  
				f1.createNewFile();// 不存在则创建
			}
			OutputStreamWriter write1 = new OutputStreamWriter(new FileOutputStream(f1),"utf-8");
			BufferedWriter output1=new BufferedWriter(write1); 
			output1.write(jsp);
			output1.close(); 
		} catch (Exception e) {  
			e.printStackTrace();logger.error(e.getMessage(),e);
		}  
		
		return null;
	}

	@Autowired
	SysFormDragconfigMapper sDragconfigMapper;
	@Autowired
	SysFormDragconfigColumnMapper sDragconfigColumnMapper;
	@Autowired
	SysFormChartsMapper sysFormChartsMapper;
	@Autowired
	FormChartsBarColumnMapper formChartsBarColumnMapper;
//	@Autowired
	@Resource(name = "TMapperExt")  
	private TMapperExt tMapperExt;
	@Override
	public String buildDragForm(SysFormconfig formM,
			SysRequestParam request) {
		// TODO Auto-generated method stub
		String userId = request.getSession().getAttribute("userid")+"";
		String dragconfigId = formM.getExpand1();
		try {
			//获取布局HTML信息
			String dragHtml = 	"<%@ page language=\"java\" import=\"java.util.*\" import=\"com.myehr.common.util.LangUtil\" pageEncoding=\"UTF-8\"%>\n"
							   +"<%@ include file=\"/common/dragCommon.jsp\" %>\n"
							   +"<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\n"
							   +"<html>\n"
							   +"<body style=\"padding:0\">\n"
							   +sDragconfigMapper.selectByPrimaryKey(new BigDecimal(dragconfigId)).getDragconfigHtml(); 
			SysFormDragconfigColumnExample example = new SysFormDragconfigColumnExample();
			example.or().andDragconfigIdEqualTo(new BigDecimal(dragconfigId));
			List<SysFormDragconfigColumn> columns = sDragconfigColumnMapper.selectByExample(example);
			int num2 = 0;
			String dragJs = "<script>\n";
			String dragJs_part1 = "";
			String dragJs_part2 = "";
			String dragJs_part3 = "";
			String dragJs_part4 = "";
			String dragJs_part5 = "";
			String dragJs_part6 = "";
			for (SysFormDragconfigColumn sysFormDragconfigColumn : columns) {
				String formHtml = "";
				SysFormconfigCache form = sysformconfigService.getForm(sysFormDragconfigColumn.getFormId()+"");
				StringBuffer[] sbs = form.showPage(request,"PC",null,null,0);
				if (form.getFormDefLayoutType().equals("1")) {//普通卡片
					
				}else if (form.getFormDefLayoutType().equals("2")) {//栅格式列表
					formHtml += "<div class=\"container-fluid\" style=\"overflow-y:hidden;padding-top:5px;\">\n";
					formHtml += sbs[24].toString();
					formHtml += sbs[6].toString();
					formHtml += sbs[33].toString();
					formHtml += sbs[17].toString();
					formHtml += "</div>\n";
					//55($(function() {之前)----------------------part1
					//var heightGadedata_672 =[];
					//var containerParam_672 ={};
					//containerParam_672 ={};
					//function changeHeightGadedata_672(data){
					//heightGadedata_672 = data;
					//}
					dragJs_part1 += sbs[55].toString();
					//1-52($(function() {内容)--------------------part2
					//dragJs += sbs[56].toString();
					dragJs_part2 += sbs[1].toString();
					dragJs_part2 += sbs[51].toString();
					dragJs_part2 += sbs[28].toString();
					//dragJs_part2 += sbs[29].toString();
					dragJs_part2 += sbs[23].toString();
					dragJs_part2 += sbs[52].toString();
					//dragJs += sbs[34].toString();
					//48-30-------------------------------------part3
					dragJs_part3 += sbs[48].toString();
					dragJs_part3 += sbs[53].toString();
					dragJs_part3 += sbs[30].toString();
					//20-31(加载表格js)----------------------------part4
					dragJs_part4 += sbs[20].toString();
					dragJs_part4 += sbs[36].toString();
					dragJs_part4 += sbs[37].toString();
					dragJs_part4 += sbs[0].toString();
					dragJs_part4 += sbs[21].toString();
					dragJs_part4 += sbs[31].toString();
					//2-22(刷新表单js,高级查询设置)--------------------part5
					dragJs_part5 += sbs[2].toString();
					dragJs_part5 += sbs[5].toString();
					dragJs_part5 += sbs[22].toString();
					dragJs_part5 += sbs[47].toString();
					//
					dragJs_part6 += sbs[7].toString();
					dragJs_part6 += sbs[9].toString();
					dragJs_part6 += sbs[10].toString();
					dragJs_part6 += sbs[11].toString();
					dragJs_part6 += sbs[12].toString();
					dragJs_part6 += sbs[13].toString();
					dragJs_part6 += sbs[14].toString();
					dragJs_part6 += sbs[8].toString();
				}else if (form.getFormDefLayoutType().equals("3")) {//普通树
					
				}else if (form.getFormDefLayoutType().equals("14")) {//新闻表单
					formHtml += "<div class=\"about4\">\n";
					formHtml += "	<div class=\"about4_ch\" style=\"color:#333;\">新闻时间轴</div>\n";
					formHtml += "	<div class=\"about4_main\">\n";
					formHtml += "		<div class=\"line\"></div>\n";
					formHtml += "		<ul id=\"newsxxx\" style=\"list-style:none;margin:0;padding:0;font-family:Arial,'微软雅黑';\">\n";
					formHtml += "		</ul>\n";
					formHtml += "	</div>\n";
					formHtml += "</div>\n";
					dragJs_part2 += "getNewsData();\n";
				}else if (form.getFormDefLayoutType().equals("15")) {//九宫格表单
					formHtml += "<div class=\"mui-content\">    	\n";
					formHtml += "	<div class=\"mui-scroll-wrapper\">\n";
					formHtml += "		<div class=\"mui-scroll\">\n";
					formHtml += "			<div class=\"menu-2-group\" v-for=\"item in menuItem\">\n";
					formHtml += "				<h3>{{item.menuName}}</h3>\n";
					formHtml += "				<ul class=\"mui-table-view mui-grid-view mui-grid-9\">\n";
					formHtml += "					<li v-for=\"cell in item.childrens\" class=\"mui-table-view-cell mui-media mui-col-xs-3 mui-col-sm-3\">\n";
					formHtml += "						<a :href=\"cell.menuUrl\">\n";
					formHtml += "							<!-- <span class=\"glyphicon\" :class =\"cell.imgFileId\"></span> -->\n";
					formHtml += "							<svg v-if=\"cell.imgFileId !== 'null'\" class=\"hexie-icon\" aria-hidden=\"true\">\n";
					formHtml += "								<use xlink:href={{cell.imgFileId}}></use>\n";
					formHtml += "							</svg>\n";
					formHtml += "							<svg v-else class=\"hexie-icon\" aria-hidden=\"true\">\n";
					formHtml += "								<use xlink:href=\"#icon-drxx80\"></use>\n";
					formHtml += "							</svg>\n";
					formHtml += "							<div class=\"mui-media-body\">{{cell.menuName}}</div>\n";
					formHtml += "						</a>\n";
					formHtml += "					</li>\n";
					formHtml += "				</ul>   \n";
					formHtml += "			</div>    \n";
					formHtml += "		</div>\n";
					formHtml += "	</div> \n";
					formHtml += "	<nav class=\"mui-bar mui-bar-tab\">\n";
					formHtml += "		<span v-for=\"item in menu\" track-by=\"$index\" v-on:tap=\"menuTab($index)\" @click=\"menuTab($index)\" class=\"mui-tab-item\" :class=\"{mui-active: $index===currentIndex}\">\n";
					formHtml += "			<span class=\"mui-icon glyphicon\" :class =\"item.imgFileId\"></span>\n";
					formHtml += "			<span class=\"mui-tab-label\">{{item.menuName}}</span>\n";
					formHtml += "		</span>\n";
					formHtml += "	</nav>\n";
					formHtml += "</div>\n";
					dragJs_part2 += "getNewsData();\n";
				}else if (form.getFormDefLayoutType().equals("4")) {//普通报表
					
				}else if (form.getFormDefLayoutType().equals("5")) {//主从表
					
				}else if (form.getFormDefLayoutType().equals("6")) {//方案树
					
				}else if (form.getFormDefLayoutType().equals("7")) {//多tab
					
				}else if (form.getFormDefLayoutType().equals("8")) {//易客报表
					
				}else if (form.getFormDefLayoutType().equals("9")) {//图表
					SysFormChartsExample exampleCharts = new SysFormChartsExample();
					com.myehr.pojo.formmanage.form.SysFormChartsExample.Criteria criteria = exampleCharts.createCriteria();
					criteria.andFormChartsFormIdEqualTo(new BigDecimal(form.getFormDefId()));
					SysFormCharts charts = sysFormChartsMapper.selectByExample(exampleCharts).get(0);
					String selectformId = charts.getFormChartsSelectFormId()+"";
					logger.info(charts.getFormChartsType());
					if (charts.getFormChartsType().equals("bar") || charts.getFormChartsType().equals("line")) {
						FormChartsBarColumnExample barExample2 = new FormChartsBarColumnExample();
						com.myehr.pojo.formmanage.form.FormChartsBarColumnExample.Criteria barCriteria2 = barExample2.createCriteria();
						barCriteria2.andChartsBarColumnTypeEqualTo("4");
						barCriteria2.andChartsFormIdEqualTo(new BigDecimal(form.getFormDefId()));
						List<FormChartsBarColumn> barColumns2 = formChartsBarColumnMapper.selectByExample(barExample2);
						FormChartsBarColumnExample barExample = new FormChartsBarColumnExample();
						com.myehr.pojo.formmanage.form.FormChartsBarColumnExample.Criteria barCriteria = barExample.createCriteria();
						barCriteria.andChartsBarColumnTypeEqualTo("2");
						barCriteria.andChartsFormIdEqualTo(new BigDecimal(form.getFormDefId()));
						List<FormChartsBarColumn> barColumns = formChartsBarColumnMapper.selectByExample(barExample);
						FormChartsBarColumnExample barExample1 = new FormChartsBarColumnExample();
						com.myehr.pojo.formmanage.form.FormChartsBarColumnExample.Criteria barCriteria1 = barExample1.createCriteria();
						barCriteria1.andChartsBarColumnTypeEqualTo("1");
						barCriteria1.andChartsFormIdEqualTo(new BigDecimal(form.getFormDefId()));
						List<FormChartsBarColumn> barColumns1 = formChartsBarColumnMapper.selectByExample(barExample1);
						SysFormconfigCache selectForm = sysformconfigService.getForm(selectformId);
						Map map = new HashMap();
						String columnsT = barColumns1.get(0).getSelectFormColumnTable().replace("_", "")+"_"+barColumns1.get(0).getSelectFormColumnName();
						for (int i = 0; i < barColumns.size(); i++) {
							String sql = selectForm.getFormDefSql();
							
							String groupColumn = barColumns.get(i).getSelectFormColumnTable().replace("_", "")+"_"+barColumns.get(i).getSelectFormColumnName();
							String sql1 = "select "+groupColumn+",count(*) as sum from ("+sql+")o group by "+groupColumn;
							
							String sql2 = "select "+columnsT+",count(*) as sum from ("+sql+")o group by "+columnsT;
							
							String columns1 =columnsT+","+barColumns.get(i).getSelectFormColumnTable().replace("_", "")+"_"+barColumns.get(i).getSelectFormColumnName();
							sql = "select "+columns1+",count(*) as sum from ("+sql+")o group by "+columns1;
							
							List<Map> groupDataList = tMapperExt.queryByFormDefSql(sql);
							List<Map> groupDataColumn = tMapperExt.queryByFormDefSql(sql1);
							List<Map> xDataColumn = tMapperExt.queryByFormDefSql(sql2);
							map.put("columnDatas"+i, groupDataList);
							map.put("groupColumn"+i, groupDataColumn);
							map.put("xColumn"+i, xDataColumn);
						}
						for (int i = 0; i < barColumns2.size(); i++) {
							String sql = selectForm.getFormDefSql();
							
							String groupColumn = barColumns2.get(i).getSelectFormColumnTable().replace("_", "")+"_"+barColumns2.get(i).getSelectFormColumnName();
							String sql1 = "select "+groupColumn+",count(*) as sum from ("+sql+")o group by "+groupColumn;
							
							String sql2 = "select "+columnsT+",count(*) as sum from ("+sql+")o group by "+columnsT;
							
							String columns1 =columnsT+","+barColumns2.get(i).getSelectFormColumnTable().replace("_", "")+"_"+barColumns2.get(i).getSelectFormColumnName();
							sql = "select "+columns1+",count(*) as sum from ("+sql+")o group by "+columns1;
							
							List<Map> groupDataList = tMapperExt.queryByFormDefSql(sql);
							List<Map> groupDataColumn = tMapperExt.queryByFormDefSql(sql1);
							List<Map> xDataColumn = tMapperExt.queryByFormDefSql(sql2);
							map.put("columnDatas"+i, groupDataList);
							map.put("groupColumn"+i, groupDataColumn);
							map.put("xColumn"+i, xDataColumn);
						}
						StringBuffer[] selectSbs = selectForm.showPage(request,"PC",null,null,0);
						/*formHtml += "<div class=\"container-fluid\" style=\"overflow-y:hidden;padding-top:5px;\">\n";
						formHtml += selectSbs[24].toString();
						formHtml += selectSbs[6].toString();
						formHtml += selectSbs[33].toString();*/
						formHtml += selectSbs[17].toString();
						formHtml += "<div id=\""+form.getFormDefCode()+"_chart\" style=\"width:100%;height:400px;margin-bottom:10px\"></div>\n";
						//55($(function() {之前)----------------------part1
						//var heightGadedata_672 =[];
						//var containerParam_672 ={};
						//containerParam_672 ={};
						//function changeHeightGadedata_672(data){
						//heightGadedata_672 = data;
						//}
						dragJs_part1 += selectSbs[55].toString();
						//1-52($(function() {内容)--------------------part2
						//dragJs += selectSbs[56].toString();
						dragJs_part2 += selectSbs[1].toString();
						dragJs_part2 += selectSbs[51].toString();
						dragJs_part2 += selectSbs[28].toString();
						//dragJs_part2 += selectSbs[29].toString();
						dragJs_part2 += selectSbs[23].toString();
						dragJs_part2 += selectSbs[52].toString();
						dragJs_part2 += "    queryAllData_"+form.getFormDefId()+"();\n";
						//dragJs_part2 += "    $(\"#"+form.getFormDefCode()+"_List .bootstrap-table\").css(\"display\",\"none\");\n";
						//dragJs += selectSbs[34].toString();
						//48-30-------------------------------------part3
						dragJs_part2 += " $(\".bootstrap-table\").css(\"display\",\"none\");\n";
						//dragJs_part3 += selectSbs[29].toString();
						//dragJs_part3 += selectSbs[52].toString();
						//dragJs_part3 += selectSbs[34].toString();
						//20-31(加载表格js)----------------------------part4
						dragJs_part4 += selectSbs[20].toString();
						dragJs_part4 += selectSbs[36].toString();
						dragJs_part4 += selectSbs[37].toString();
						dragJs_part4 += selectSbs[0].toString();
						dragJs_part4 += selectSbs[21].toString();
						dragJs_part4 += selectSbs[31].toString();
						dragJs_part4 += selectSbs[30].toString();
						//2-22(刷新表单js,高级查询设置)--------------------part5
						dragJs_part5 += selectSbs[2].toString();
						dragJs_part5 += selectSbs[5].toString();
						dragJs_part5 += selectSbs[22].toString();
						dragJs_part5 += selectSbs[47].toString();
						dragJs_part5 += SysGridFormBeansUtil.formGridChartsFunction4(form,selectForm,charts,barColumns,barColumns1,barColumns2,map);
						//
						dragJs_part6 += selectSbs[7].toString();
						dragJs_part6 += selectSbs[9].toString();
						dragJs_part6 += selectSbs[10].toString();
						dragJs_part6 += selectSbs[11].toString();
						dragJs_part6 += selectSbs[12].toString();
						dragJs_part6 += selectSbs[13].toString();
						dragJs_part6 += selectSbs[14].toString();
						dragJs_part6 += selectSbs[8].toString();
					}else if(charts.getFormChartsType().equals("pie")){
						FormChartsBarColumnExample barExample2 = new FormChartsBarColumnExample();
						com.myehr.pojo.formmanage.form.FormChartsBarColumnExample.Criteria barCriteria2 = barExample2.createCriteria();
						barCriteria2.andChartsBarColumnTypeEqualTo("2");
						barCriteria2.andChartsFormIdEqualTo(new BigDecimal(form.getFormDefId()));
						List<FormChartsBarColumn> barColumns2 = formChartsBarColumnMapper.selectByExample(barExample2);
						FormChartsBarColumnExample barExample = new FormChartsBarColumnExample();
						com.myehr.pojo.formmanage.form.FormChartsBarColumnExample.Criteria barCriteria = barExample.createCriteria();
						barCriteria.andChartsBarColumnTypeEqualTo("3");
						barCriteria.andChartsFormIdEqualTo(new BigDecimal(form.getFormDefId()));
						List<FormChartsBarColumn> barColumns = formChartsBarColumnMapper.selectByExample(barExample);
						FormChartsBarColumnExample barExample1 = new FormChartsBarColumnExample();
						com.myehr.pojo.formmanage.form.FormChartsBarColumnExample.Criteria barCriteria1 = barExample1.createCriteria();
						barCriteria1.andChartsBarColumnTypeEqualTo("1");
						barCriteria1.andChartsFormIdEqualTo(new BigDecimal(form.getFormDefId()));
						List<FormChartsBarColumn> barColumns1 = formChartsBarColumnMapper.selectByExample(barExample1);
						SysFormconfigCache selectForm = sysformconfigService.getForm(selectformId);
						Map map = new HashMap();
						String columnsT = barColumns1.get(0).getSelectFormColumnTable().replace("_", "")+"_"+barColumns1.get(0).getSelectFormColumnName();
						for (int i = 0; i < barColumns.size(); i++) {
							String sql = selectForm.getFormDefSql();
							String groupColumn = barColumns.get(i).getSelectFormColumnTable().replace("_", "")+"_"+barColumns.get(i).getSelectFormColumnName();
							String sql1 = "select "+groupColumn+",count(*) as sum from ("+sql+")o group by "+groupColumn;
							String sql2 = "select "+columnsT+",count(*) as sum from ("+sql+")o group by "+columnsT;
							String columns1 =columnsT+","+barColumns.get(i).getSelectFormColumnTable().replace("_", "")+"_"+barColumns.get(i).getSelectFormColumnName();
							sql = "select "+columns1+",count(*) as sum from ("+sql+")o group by "+columns1;
							List<Map> groupDataList = tMapperExt.queryByFormDefSql(sql);
							List<Map> groupDataColumn = tMapperExt.queryByFormDefSql(sql1);
							List<Map> xDataColumn = tMapperExt.queryByFormDefSql(sql2);
							map.put("columnDatas"+i, groupDataList);
							map.put("groupColumn"+i, groupDataColumn);
							map.put("xColumn"+i, xDataColumn);
						}
						StringBuffer[] selectSbs = selectForm.showPage(request,"SELECT_FORM",null,null,0);
						//formHtml += "<div class=\"container-fluid\" style=\"overflow-y:hidden;padding-top:5px;\">\n";
						formHtml += selectSbs[24].toString();
						formHtml += selectSbs[6].toString();
						formHtml += selectSbs[33].toString();
//						formHtml += selectSbs[17].toString();
						formHtml += "<div id=\""+form.getFormDefCode()+"_chart\" style=\"width:100%;height:400px;margin-bottom:10px\"></div>";
						//formHtml += "</div>";
						//55($(function() {之前)----------------------part1
						//var heightGadedata_672 =[];
						//var containerParam_672 ={};
						//containerParam_672 ={};
						//function changeHeightGadedata_672(data){
						//heightGadedata_672 = data;
						//}
						dragJs_part1 += selectSbs[55].toString();
						//1-52($(function() {内容)--------------------part2
						dragJs_part2 += selectSbs[1].toString();
						dragJs_part2 += selectSbs[51].toString();
//						dragJs_part2 += selectSbs[28].toString();
						dragJs_part2 += selectSbs[23].toString();
						dragJs_part2 += selectSbs[52].toString();
						dragJs_part2 += "    queryAllData_"+form.getFormDefId()+"();\n";
						//dragJs_part2 += "    $(\"#"+form.getFormDefCode()+"_List .bootstrap-table\").css(\"display\",\"none\");\n";
						//dragJs += selectSbs[34].toString();
						//48-30-------------------------------------part3
						dragJs_part3 += selectSbs[48].toString();
						dragJs_part3 += selectSbs[53].toString();
						dragJs_part3 += selectSbs[30].toString();
						//20-31(加载表格js)----------------------------part4
						dragJs_part4 += selectSbs[20].toString();
						dragJs_part4 += selectSbs[21].toString();
						dragJs_part4 += selectSbs[31].toString();
						//2-22(刷新表单js,高级查询设置)--------------------part5
						dragJs_part5 += selectSbs[2].toString();
						dragJs_part5 += selectSbs[5].toString();
						dragJs_part5 += selectSbs[22].toString();
						dragJs_part5 += selectSbs[47].toString();
						dragJs_part5 += SysGridFormBeansUtil.formGridChartsFunction4(form,selectForm,charts,barColumns,barColumns1,barColumns2,map);
						//
						dragJs_part6 += selectSbs[7].toString();
						dragJs_part6 += selectSbs[9].toString();
						dragJs_part6 += selectSbs[10].toString();
						dragJs_part6 += selectSbs[11].toString();
						dragJs_part6 += selectSbs[12].toString();
						dragJs_part6 += selectSbs[13].toString();
						dragJs_part6 += selectSbs[14].toString();
						dragJs_part6 += selectSbs[8].toString();
					}
					
				}else if (form.getFormDefLayoutType().equals("10")) {//卡片式表单
					SysGridbycardTemplateColumnExample example10 = new SysGridbycardTemplateColumnExample();
					logger.info(form.getFormDefId()+"");logger.info(form.getPojoform().getExpand1()+"");
					example10.or().andTemplateColumnFormDefIdEqualTo(Integer.valueOf(form.getFormDefId()+"")).andTemplateColumnTemplateIdEqualTo(Integer.valueOf(form.getPojoform().getExpand1()));
					List<SysGridbycardTemplateColumn> sList = sTemplateColumnMapper.selectByExample(example10);
					//formHtml += "<div class=\"wrapper wrapper-content animated fadeInRight\" style=\"overflow-y:auto\">\n";
					formHtml += sbs[17].toString();
					formHtml += "<div class=\"row\" style=\"margin-left:0\" id=\""+form.getFormDefCode()+"\">\n";
					formHtml += "</div>\n";
					dragJs_part1 += sbs[30].toString();
					dragJs_part1 += sbs[40].toString();
					dragJs_part1 += sbs[55].toString();
					dragJs_part2 += SysGridFormBeansUtil.formGridByCardFunction2_1(form.getFormDefId()+"");
					dragJs_part6 += sbs[8].toString();

					dragJs_part6 += SysGridFormBeansUtil.formGridByCardFunction2_2(form.getFormDefId()+"",form.getFormDefCode());
					dragJs_part6 += SysGridFormBeansUtil.formGridByCardFunction3(sList,form);
					dragJs_part6 += CardAndCardFormBeansUtil.endFunction();
				}else if (form.getFormDefLayoutType().equals("11")) {//时间轴
					
				}
				dragHtml = dragHtml.replaceAll("dragID"+sysFormDragconfigColumn.getFormId(), formHtml);
			}
			dragJs +=  dragJs_part1
					  +"$(function() {\n"
					  +dragJs_part2
					  +"getEmpPhotoSYS();\n"
					  +"cardSelectInitFunction(\"${param.formType}\");\n"
					  +"cardDateWidInitFunction();\n"
					  +"});\n"
					  +dragJs_part3
					  +dragJs_part4
					  +dragJs_part5
					  +dragJs_part6
					  +SysGridFormBeansUtil.getEmpPhotoSYS()
					  +"</script>\n"
					  +"</body>\n"
				      +"</html>\n";	
			dragHtml = dragHtml + dragJs;
			String path11 = findSysFormFolderTreeById(formM.getFormDefFolderId().intValue(),"");
//			String path11 = form.getFormTreePath();

			formM.setFormSubmitUrl(path11+formM.getFormDefCode()+".jsp");
			Map map = new HashMap();
			map.put("submitUrl", path11+formM.getFormDefCode()+".jsp");
			map.put("formDefId", formM.getFormDefId());
			sysFormconfigMapperExpand.updateSubmitUrl(map);
			logger.info(path11);
			//获取文件路径和文件名
			String path="C:/MyeHR/MyeHR_ORACLE/JSP/"+path11;
			String path1 =  request.getPath()+"\\"+path11;
			
			CreateFileUtil.createDir(path);
			CreateFileUtil.createDir(path1);
			
			try {  
				File f = new File(path+"/"+formM.getFormDefCode()+".jsp");
				File f1 = new File(path1+"/"+formM.getFormDefCode()+".jsp"); 
				if (f.exists()) {  
					System.out.print("文件存在");  
				} else {  
					System.out.print("文件不存在");  
					f.createNewFile();// 不存在则创建
				}
				OutputStreamWriter write = new OutputStreamWriter(new FileOutputStream(f),"utf-8");
				BufferedWriter output=new BufferedWriter(write);
				//html
				
				output.write(dragHtml);
				output.close();  
				
				if (f1.exists()) {  
					System.out.print("文件存在");  
				} else {  
					System.out.print("文件不存在");  
					f1.createNewFile();// 不存在则创建
				}
				OutputStreamWriter write1 = new OutputStreamWriter(new FileOutputStream(f1),"utf-8");
				BufferedWriter output1=new BufferedWriter(write1);
				//html
				output1.write(dragHtml);
				output1.close();  
				
			} catch (Exception e) {  
				e.printStackTrace();logger.error(e.getMessage(),e);
			}  
			
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();logger.error(e.getMessage(),e);
			}
			return null;
	}
	
	public static void main(String[] args) {
		FormServiceImpl ss = new FormServiceImpl();
		ss.findFormColumnsByFormId(91);
	}

	@Override
	public ResultMap getExamtemplate(SysRequestParam request) {
		// TODO Auto-generated method stub
				String sql;
				Pagers pagers= fServiceImpl.translateRequest(request.getRequest(),"");
				sql="SELECT TOP "+pagers.getLimit()+" * "+
					"FROM sys_examtemplate "+
					"WHERE (id NOT IN "+
					"          (SELECT TOP ("+pagers.getLimit()+"*("+pagers.getPageSize()+"-1)) id "+
					"			FROM SYS_EXAMTEMPLATE where (upper(CODE) LIKE '%"+pagers.getConditionString().toUpperCase()+"%'OR upper(CNAME) LIKE '%"+pagers.getConditionString().toUpperCase()+"%') "+
					"         	ORDER BY id)) and (upper(CODE) LIKE '%"+pagers.getConditionString().toUpperCase()+"%'OR upper(CNAME) LIKE '%"+pagers.getConditionString().toUpperCase()+"%') "+
					"ORDER BY id";		
				ResultMap pageresponse = new ResultMap();  
		        Map<String, Object> maps=new HashMap<String, Object>();
		        maps.put("sql", sql);
		        List<SysExamtemplate> list = sysExamtemplateExpandMapper.getAllEmployee(maps); //当前页显示的数据  getAllEmployee
		    	sql="SELECT COUNT(*) from (select * FROM SYS_EXAMTEMPLATE WHERE ((CODE) LIKE '%"+pagers.getConditionString().toUpperCase()+"%'"+
						"OR upper(CNAME) LIKE '%"+pagers.getConditionString().toUpperCase()+"%')"+
						") a";
		        maps.put("sql2", sql);
		        Integer total = sysExamtemplateExpandMapper.getTotalEmployee(maps);  //数据总条数  
		        List<Object> list_obj=new ArrayList<Object>();
				for (SysExamtemplate u : list) {
					list_obj.add(u);
				}
		        pageresponse.setRows(list_obj);  
		        pageresponse.setTotal(total);  
		        return pageresponse;
	}

	@Override
	public void buildQuestionForm(SysFormconfigCache form,SysRequestParam request) {
		try {
			StringBuffer[] jsp = createQuestionJsp(form,request);
//			String path11 = findSysFormFolderTreeById(form.getPojoform().getFormDefFolderId().intValue(),"");
			String path11 = form.getFormTreePath();

			form.getPojoform().setFormSubmitUrl(path11+form.getPojoform().getFormDefCode()+".jsp");
//			sysFormconfigMapper.updateByPrimaryKeyWithBLOBs(form.getPojoform());
			Map map = new HashMap();
			map.put("submitUrl", path11+form.getPojoform().getFormDefCode()+".jsp");
			map.put("formDefId", form.getFormDefId());
			sysFormconfigMapperExpand.updateSubmitUrl(map);
	
			logger.info(path11);
			//获取文件路径和文件名
//			String path="E:/myeclipse/workspace1/myehr/WebRoot/jsp/formbuld";
			String path="C:/MyeHR/MyeHR_MSSQL/jsp/"+path11;
//			String path1="E:/myeclipse/workspace1/.metadata/.me_tcat/webapps/myehr/jsp/formbuld";
			String path1 =  request.getPath()+"\\"+path11;
//			String path1= "E:/SqlServer/myeclipse/apache-tomcat-6.0.45/webapps/myehr/jsp/formbuild/"+path11;
			
			//生成文件
			//SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
			
			CreateFileUtil.createDir(path);
			CreateFileUtil.createDir(path1);
			
			try {  
				File f = new File(path+"/"+form.getPojoform().getFormDefCode()+".jsp");
				File f1 = new File(path1+"/"+form.getPojoform().getFormDefCode()+".jsp"); 
				if (f.exists()) {  
					System.out.print("文件存在");  
				} else {  
					System.out.print("文件不存在");  
					f.createNewFile();// 不存在则创建
				}
				OutputStreamWriter write = new OutputStreamWriter(new FileOutputStream(f),"utf-8");
				BufferedWriter output=new BufferedWriter(write); 
				output.write(jsp[0].toString());
				output.write(jsp[1].toString());
				output.write(jsp[2].toString());
				output.close();  
				if (f1.exists()) {  
					System.out.print("文件存在");  
				} else {  
					System.out.print("文件不存在");  
					f1.createNewFile();// 不存在则创建
				}
				OutputStreamWriter write1 = new OutputStreamWriter(new FileOutputStream(f1),"utf-8");
				BufferedWriter output1=new BufferedWriter(write1); 
				output1.write(jsp[0].toString());
				output1.write(jsp[1].toString());
				output1.write(jsp[2].toString());
				output1.close(); 
			} catch (Exception e) {  
				e.printStackTrace();logger.error(e.getMessage(),e);
			}  
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();logger.error(e.getMessage(),e);
		} 
	}
	
	private StringBuffer[] createQuestionJsp(SysFormconfigCache form,
			SysRequestParam request) {
		StringBuffer[] Question_jsp = new StringBuffer[20];
		String userId = request.getSession().getAttribute("userid")+"";
		for(int i=0;i<15;i++){
			Question_jsp[i] = new StringBuffer();
		}
		List<SysExamtemplateQuestionCache> questionCaches = form.getQuestions();
		Question_jsp[0].append(SysCardFormBeansUtil.getNbsp(0)+"<%@ page language=\"java\" import=\"java.util.*\" import=\"com.myehr.common.util.LangUtil\" pageEncoding=\"UTF-8\"%>\n"+
							   SysCardFormBeansUtil.getNbsp(0)+"<%@ include file=\"/common/questionForm.jsp\" %>\n"+
							   SysCardFormBeansUtil.getNbsp(0)+"<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\n"+
							   SysCardFormBeansUtil.getNbsp(0)+"<html>\n"+
							   SysCardFormBeansUtil.getNbsp(1)+"<head>\n"+
							   SysCardFormBeansUtil.getNbsp(2)+"<meta charset=\"utf-8\">\n"+
							   SysCardFormBeansUtil.getNbsp(2)+"<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n"+
							   SysCardFormBeansUtil.getNbsp(2)+"<title>"+form.getPojoform().getFormDefName()+"</title>\n"+
							   SysCardFormBeansUtil.getNbsp(2)+"<style type=\"text/css\">\n"+
							   SysCardFormBeansUtil.getNbsp(3)+"html,body{min-height: 100%;}\n"+
							   SysCardFormBeansUtil.getNbsp(2)+"</style>\n"+
							   SysCardFormBeansUtil.getNbsp(2)+"</head>\n"+
							   SysCardFormBeansUtil.getNbsp(1)+"<body class=\"gray-bg\">\n"+
							   SysCardFormBeansUtil.getNbsp(1)+"<div class=\"container-fluid\" style=\"height:100%;overflow:auto;margin:0\">\n"+
							   SysCardFormBeansUtil.getNbsp(2)+"<div class=\"control-group\" style=\"float: right;\">\n"+
							   SysCardFormBeansUtil.getNbsp(3)+"<div class=\"switch\" data-on=\"primary\" data-off=\"info\">\n"+
							   SysCardFormBeansUtil.getNbsp(4)+"<input id = \"QuestionShow\" type=\"checkbox\" checked2/>\n"+
							   SysCardFormBeansUtil.getNbsp(3)+"</div>\n"+
							   SysCardFormBeansUtil.getNbsp(2)+"</div>\n"+
							   SysCardFormBeansUtil.getNbsp(2)+"<p style=\"font-size: 35px;font-weight: 900;text-align: center;margin:10px\">"+form.getPojoform().getFormDefName()+"</p>\n"+
							   SysCardFormBeansUtil.getNbsp(2)+"<p style=\"font-size: 12px;font-weight: 700;padding:0 20px;margin:0\">"+form.getExamtemplate().getBegindesc()+"</p>\n"+
							   SysCardFormBeansUtil.getNbsp(2)+"<div class=\"wrapper wrapper-content animated fadeInRight\">\n"+
							   SysCardFormBeansUtil.getNbsp(3)+"<div class=\"row\" style=\"margin-left:0\"  id=\""+form.getPojoform().getFormDefCode()+"\">\n");
		try {
			//List<SysDictEntry> types = serviceImpl.findSysDictEntryByDictTypeCode("QUESTIONTYPE");
			
			int i1=0,i2=0,i3=0,i4=0;
			List<SysExamtemplateQuestionCache> arr1 = new ArrayList<SysExamtemplateQuestionCache>();//单选
			List<SysExamtemplateQuestionCache> arr2 = new ArrayList<SysExamtemplateQuestionCache>();//多选
			List<SysExamtemplateQuestionCache> arr3 = new ArrayList<SysExamtemplateQuestionCache>();//问答
			List<SysExamtemplateQuestionCache> arr4 = new ArrayList<SysExamtemplateQuestionCache>();//星条
			for (SysExamtemplateQuestionCache sysExamtemplateQuestionCache : questionCaches) {
				if(sysExamtemplateQuestionCache.getQuestion().getXtype()==1111){//单选
					arr1.add(sysExamtemplateQuestionCache);
				}else if(sysExamtemplateQuestionCache.getQuestion().getXtype()==2222){//多选
					arr2.add(sysExamtemplateQuestionCache);
				}else if(sysExamtemplateQuestionCache.getQuestion().getXtype()==3333){//论述
					arr3.add(sysExamtemplateQuestionCache);
				}else if(sysExamtemplateQuestionCache.getQuestion().getXtype()==4444){//星条
					arr4.add(sysExamtemplateQuestionCache);
				}
			}
			int j1=0,j2=0,j3=0,j4=0;
			for (SysExamtemplateQuestionCache sysQuestion : arr1) {
				Question_jsp[1].append(SysCardFormBeansUtil.getNbsp(4)+"<div class=\"col-md-12 col-sm-12 col-lg-12 singleShow\">\n"+
									   SysCardFormBeansUtil.getNbsp(5)+"<div class=\"contact-box\">\n"+
									   SysCardFormBeansUtil.getNbsp(6)+"<div class=\"col-sm-11\">\n"+
									   SysCardFormBeansUtil.getNbsp(7)+"<h3 style=\"margin-top:0;color:#000000;font-size:14px\" title=\""+sysQuestion.getPojo().getXorder()+"-"+sysQuestion.getQuestion().getCname()+"\"><strong>"+sysQuestion.getPojo().getXorder()+"-"+sysQuestion.getQuestion().getCname()+"[单选题]</strong></h3>\n"+
									   SysCardFormBeansUtil.getNbsp(7)+"<ul class=\"single\" id=\"Single"+j1+"\" dataField = \""+sysQuestion.getPojo().getQuestionid()+"\"></ul>\n"+
									   SysCardFormBeansUtil.getNbsp(6)+"</div>\n"+
									   SysCardFormBeansUtil.getNbsp(6)+"<div class=\"clearfix\"></div>\n"+
									   SysCardFormBeansUtil.getNbsp(5)+"</div>\n"+
									   SysCardFormBeansUtil.getNbsp(4)+"</div>\n");
				j1++;
			}
			for (SysExamtemplateQuestionCache sysQuestion : arr2) {
				Question_jsp[1].append(SysCardFormBeansUtil.getNbsp(4)+"<div class=\"col-md-12 col-sm-12 col-lg-12 singleShow\">\n"+
									   SysCardFormBeansUtil.getNbsp(5)+"<div class=\"contact-box\">\n"+
									   SysCardFormBeansUtil.getNbsp(6)+"<div class=\"col-sm-11\">\n"+
									   SysCardFormBeansUtil.getNbsp(7)+"<h3 style=\"margin-top:0;color:#000000;font-size:14px\" title=\""+sysQuestion.getPojo().getXorder()+"-"+sysQuestion.getQuestion().getCname()+"\"><strong>"+sysQuestion.getPojo().getXorder()+"-"+sysQuestion.getQuestion().getCname()+"[多选题]</strong></h3>\n"+
									   SysCardFormBeansUtil.getNbsp(7)+"<ul class=\"Multiple\" id=\"Multiple"+j2+"\" dataField = \""+sysQuestion.getPojo().getQuestionid()+"\"></ul>\n"+
									   SysCardFormBeansUtil.getNbsp(6)+"</div>\n"+
									   SysCardFormBeansUtil.getNbsp(6)+"<div class=\"clearfix\"></div>\n"+
									   SysCardFormBeansUtil.getNbsp(5)+"</div>\n"+
									   SysCardFormBeansUtil.getNbsp(4)+"</div>\n");
				j2++;
			}
			for (SysExamtemplateQuestionCache sysQuestion : arr3) {
				Question_jsp[1].append(SysCardFormBeansUtil.getNbsp(4)+"<div class=\"col-md-12 col-sm-12 col-lg-12 singleShow\">\n"+
									   SysCardFormBeansUtil.getNbsp(5)+"<div class=\"contact-box\">\n"+
									   SysCardFormBeansUtil.getNbsp(6)+"<div class=\"col-sm-11\">\n"+
									   SysCardFormBeansUtil.getNbsp(7)+"<h3 style=\"margin-top:0;color:#000000;font-size:14px\" title=\""+sysQuestion.getPojo().getXorder()+"-"+sysQuestion.getQuestion().getCname()+"\"><strong>"+sysQuestion.getPojo().getXorder()+"-"+sysQuestion.getQuestion().getCname()+"[解答题]</strong></h3>\n"+
									   SysCardFormBeansUtil.getNbsp(7)+"<ul class=\"Discuss\" id=\"Discuss"+j3+"\" dataField = \""+sysQuestion.getPojo().getQuestionid()+"\"></ul>\n"+
									   SysCardFormBeansUtil.getNbsp(6)+"</div>\n"+
									   SysCardFormBeansUtil.getNbsp(6)+"<div class=\"clearfix\"></div>\n"+
									   SysCardFormBeansUtil.getNbsp(5)+"</div>\n"+
									   SysCardFormBeansUtil.getNbsp(4)+"</div>\n");
				j3++;
			}
			for (SysExamtemplateQuestionCache sysQuestion : arr4) {
				Question_jsp[1].append(SysCardFormBeansUtil.getNbsp(4)+"<div class=\"col-md-12 col-sm-12 col-lg-12 singleShow\">\n"+
									   SysCardFormBeansUtil.getNbsp(5)+"<div class=\"contact-box\">\n"+
									   SysCardFormBeansUtil.getNbsp(6)+"<div class=\"col-sm-11\">\n"+
									   SysCardFormBeansUtil.getNbsp(7)+"<h3 style=\"margin-top:0;color:#000000;font-size:14px\" title=\""+sysQuestion.getPojo().getXorder()+"-"+sysQuestion.getQuestion().getCname()+"\"><strong>"+sysQuestion.getPojo().getXorder()+"-"+sysQuestion.getQuestion().getCname()+"</strong></h3>\n"+
									   SysCardFormBeansUtil.getNbsp(7)+"<ul class=\"Star\" id=\"Star"+j4+"\" dataField = \""+sysQuestion.getPojo().getQuestionid()+"\"></ul>\n"+
									   SysCardFormBeansUtil.getNbsp(6)+"</div>\n"+
									   SysCardFormBeansUtil.getNbsp(6)+"<div class=\"clearfix\"></div>\n"+
									   SysCardFormBeansUtil.getNbsp(5)+"</div>\n"+
									   SysCardFormBeansUtil.getNbsp(4)+"</div>\n");
				j4++;
			}
			String sizeNum = questionCaches.size()-1+"";
			Question_jsp[2].append(SysCardFormBeansUtil.getNbsp(3)+"<div class=\"BTNGROUP BTNGROUP_3335\" style=\"margin:5px auto; display:inline-block;height: 30px;z-index: 6;position: relative\">\n"+
								   SysCardFormBeansUtil.getNbsp(4)+"<div style=\"margin-right:10px;display:inline-block\">\n"+
								   SysCardFormBeansUtil.getNbsp(5)+"<input type=\"button\" id=\"lastQuestion\"  class=\"btn btn-success\" style=\"display:none\" value=\"上一题\" onclick=\"showLastQuestion()\"/>\n"+
								   SysCardFormBeansUtil.getNbsp(4)+"</div>\n"+
								   SysCardFormBeansUtil.getNbsp(4)+"<div style=\"margin-right:10px;display:inline-block\">\n"+
								   SysCardFormBeansUtil.getNbsp(5)+"<input type=\"button\" id=\"nextQuestion\"  class=\"btn btn-success\" style=\"display:none\" value=\"下一题\" onclick=\"showNextQuestion()\"/>\n"+
								   SysCardFormBeansUtil.getNbsp(4)+"</div>\n"+
								   SysCardFormBeansUtil.getNbsp(4)+"<div style=\"margin-right:10px;display:inline-block\">\n"+
								   SysCardFormBeansUtil.getNbsp(4)+"<input type=\"button\" id=\"upup\"  class=\"btn btn-success\" value=\"提交\" onclick=\"saveData()\"/>\n"+
								   SysCardFormBeansUtil.getNbsp(4)+"</div>\n"+
								   SysCardFormBeansUtil.getNbsp(3)+"</div>\n"+
								   SysCardFormBeansUtil.getNbsp(3)+"</div>\n"+
								   SysCardFormBeansUtil.getNbsp(2)+"</div>\n"+
								   SysCardFormBeansUtil.getNbsp(2)+"<p style=\"font-size: 12px;font-weight: 700;padding:0 20px;margin:0\">"+form.getExamtemplate().getEnddesc()+"</p>\n"+
								   SysCardFormBeansUtil.getNbsp(1)+"</div>\n"+
								   SysCardFormBeansUtil.getNbsp(2)+"<script>\n"+
								   SysCardFormBeansUtil.getNbsp(2)+"var number = 0; \n"+
								   SysCardFormBeansUtil.getNbsp(2)+"var formId = ${param.formId}; \n"+
								   SysCardFormBeansUtil.getNbsp(2)+"$(document).ready(function () {\n"+
								   SysCardFormBeansUtil.getNbsp(4)+"initSingleAnwser();\n"+
								   SysCardFormBeansUtil.getNbsp(4)+"initMultipleAnwser();\n"+
								   SysCardFormBeansUtil.getNbsp(4)+"initStarAnwser();\n"+
								   SysCardFormBeansUtil.getNbsp(4)+"initDiscussAnwser();\n"+
								   SysCardFormBeansUtil.getNbsp(4)+"$(\"[id='QuestionShow']\").bootstrapSwitch({\n"+
								   SysCardFormBeansUtil.getNbsp(6)+"size : \"small\",\n"+
								   SysCardFormBeansUtil.getNbsp(6)+"onText:'单题式',\n"+
							       SysCardFormBeansUtil.getNbsp(6)+"offText:'全题式',  \n"+
							       SysCardFormBeansUtil.getNbsp(6)+"onSwitchChange : function(event, state) {\n"+
							       SysCardFormBeansUtil.getNbsp(8)+"if(state){\n"+
							       SysCardFormBeansUtil.getNbsp(9)+"switchType=\"single\";\n"+
							       SysCardFormBeansUtil.getNbsp(8)+"}else{\n"+
							       SysCardFormBeansUtil.getNbsp(9)+"switchType = \"all\";\n"+
							       SysCardFormBeansUtil.getNbsp(8)+"}\n"+
							       SysCardFormBeansUtil.getNbsp(8)+"loadDataStart();\n"+
							       SysCardFormBeansUtil.getNbsp(6)+"}\n"+
							       SysCardFormBeansUtil.getNbsp(4)+"});\n"+
							       SysCardFormBeansUtil.getNbsp(4)+"if('${param.isView}'=='isView'&&'${param.userId}'!=''){//查看试卷\n"+
								   SysCardFormBeansUtil.getNbsp(4)+"var userId = '${param.userId}';\n"+
								   SysCardFormBeansUtil.getNbsp(4)+"initData(userId);\n"+
								   SysCardFormBeansUtil.getNbsp(4)+"}\n"+
								   SysCardFormBeansUtil.getNbsp(2)+"});\n"+
								   SysCardFormBeansUtil.getNbsp(2)+"var parame={\n"+
								   SysCardFormBeansUtil.getNbsp(3)+"id:'',\n"+
								   SysCardFormBeansUtil.getNbsp(3)+"value:\"N\",\n"+
								   SysCardFormBeansUtil.getNbsp(3)+"width: \"100px\",\n"+
								   SysCardFormBeansUtil.getNbsp(3)+"height:\"45px\",\n"+
								   SysCardFormBeansUtil.getNbsp(3)+"url:'/myehr/question/searchOptionById.action?userId=${sessionScope.userid}',\n"+
								   SysCardFormBeansUtil.getNbsp(3)+"jsonParam:{},\n"+
								   SysCardFormBeansUtil.getNbsp(3)+"chang:function (e){\n"+
								   SysCardFormBeansUtil.getNbsp(3)+"}\n"+
								   SysCardFormBeansUtil.getNbsp(2)+"};\n"+
								   SysCardFormBeansUtil.getNbsp(2)+"function showLastQuestion(){\n"+
								   SysCardFormBeansUtil.getNbsp(2)+"number--;\n"+
								   SysCardFormBeansUtil.getNbsp(2)+"$(\".singleShow\").css(\"display\",\"none\");\n"+
								   SysCardFormBeansUtil.getNbsp(2)+"$(\".singleShow\").eq(number).css(\"display\",\"block\");\n"+
								   SysCardFormBeansUtil.getNbsp(2)+"if(number==0){\n"+
								   SysCardFormBeansUtil.getNbsp(2)+"$(\"#lastQuestion\").css(\"display\",\"none\");\n"+
								   SysCardFormBeansUtil.getNbsp(2)+"}\n"+
								   SysCardFormBeansUtil.getNbsp(2)+"if(number<"+sizeNum+"){\n"+
								   SysCardFormBeansUtil.getNbsp(2)+"$(\"#nextQuestion\").css(\"display\",\"inline-block\");\n"+
								   SysCardFormBeansUtil.getNbsp(2)+"}\n"+
								   SysCardFormBeansUtil.getNbsp(2)+"}\n"+
								   SysCardFormBeansUtil.getNbsp(2)+"function showNextQuestion(){\n"+
								   SysCardFormBeansUtil.getNbsp(2)+"number++;\n"+
								   SysCardFormBeansUtil.getNbsp(2)+"$(\".singleShow\").css(\"display\",\"none\");\n"+
								   SysCardFormBeansUtil.getNbsp(2)+"$(\".singleShow\").eq(number).css(\"display\",\"block\");\n"+
								   SysCardFormBeansUtil.getNbsp(2)+"if(number>0){\n"+
								   SysCardFormBeansUtil.getNbsp(2)+"$(\"#lastQuestion\").css(\"display\",\"inline-block\");\n"+
								   SysCardFormBeansUtil.getNbsp(2)+"}\n"+
								   SysCardFormBeansUtil.getNbsp(2)+"if(number=="+sizeNum+"){\n"+
								   SysCardFormBeansUtil.getNbsp(2)+"$(\"#nextQuestion\").css(\"display\",\"none\");\n"+
								   SysCardFormBeansUtil.getNbsp(2)+"}\n"+
								   SysCardFormBeansUtil.getNbsp(2)+"}\n"+
								   SysCardFormBeansUtil.getNbsp(2)+"</script>\n"+
								   SysCardFormBeansUtil.getNbsp(1)+"</body>\n</html>\n");
			return Question_jsp;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();logger.error(e.getMessage(),e);
			return null;
		}
		
	}
	
	/**
	 * 通过字段名称加载sql字典缓存
	 */
	@Override
	public String setColumnSqlDict(String columnName){
		JedisFactory factory = new  JedisFactory( new  JedisPoolConfig());  
    	Jedis jedis = factory.getJedis(); 
    	String columnSqlDictDatas = jedis.get("columnSqlDictDatas"+columnName);
    	if (columnSqlDictDatas!=null) {
    		return columnSqlDictDatas;
		}else {
			String sql = "select user_id as dictId,user_name as dictValue from sys_user";
			//sql = MyEhrJDBCUtil.repleaceContainerParam(containerParam, sql);
			List<Map> ids = tMapperExt.queryByFormDefSql(sql);
			
			if (ids.size()>0) {
				StringBuffer sb = new StringBuffer("[");
				for (int i = 0; i < ids.size(); i++) {
					sb.append("{'value':'"+ids.get(i).get("DICTVALUE")+"','text':'"+ids.get(i).get("DICTENTRY")+"'},");
				}
				String str = sb.toString();
				String str1 = str.substring(0, str.length()-1);
				str1+="]";
				jedis.set("columnSqlDictDatas"+columnName,str1);
				return str1;
			}else {
				return null;
			}
		}
	}

	
	@Override
	public ResultMap getDragconfig(SysRequestParam request) {
		String sql;
		Pagers pagers= fServiceImpl.translateRequest(request.getRequest(),"dragconfPid");
		sql="SELECT TOP "+pagers.getLimit()+" * "+
				"FROM SYS_FORM_DRAGCONFIG "+
				"WHERE (DRAGCONFIG_id NOT IN "+
				"          (SELECT TOP ("+pagers.getLimit()+"*("+pagers.getPageSize()+"-1)) DRAGCONFIG_id "+
				"			FROM SYS_FORM_DRAGCONFIG where (upper(DRAGCONFIG_CODE) LIKE '%"+pagers.getConditionString().toUpperCase()+"%'OR upper(DRAGCONFIG_CNAME) LIKE '%"+pagers.getConditionString().toUpperCase()+"%') "+
				"         	ORDER BY DRAGCONFIG_id)) and DELETE_MARK = '"+pagers.getDeleteMark()+"' and  DRAGCONFIG_PID = "+pagers.getExpand()+"  and (upper(DRAGCONFIG_CODE) LIKE '%"+pagers.getConditionString().toUpperCase()+"%'OR upper(DRAGCONFIG_CNAME) LIKE '%"+pagers.getConditionString().toUpperCase()+"%') "+
				"ORDER BY DRAGCONFIG_id";		
		ResultMap pageresponse = new ResultMap();  
        Map<String, Object> maps=new HashMap<String, Object>();
        maps.put("sql", sql);
        List<SysFormDragconfigWithBLOBs> list = sysFormDragconfigExpandMapper.getAllEmployee(maps); //当前页显示的数据  getAllEmployee
    	sql="SELECT COUNT(*) from (select * FROM SYS_FORM_DRAGCONFIG WHERE DELETE_MARK = '"+pagers.getDeleteMark()+"' and  (upper(DRAGCONFIG_CODE) LIKE '%"+pagers.getConditionString().toUpperCase()+"%'"+
				"OR upper(DRAGCONFIG_CNAME) LIKE '%"+pagers.getConditionString().toUpperCase()+"%') and DRAGCONFIG_PID = "+pagers.getExpand()+" "+
				") a";
        maps.put("sql2", sql);
        Integer total = sysFormDragconfigExpandMapper.getTotalEmployee(maps);  //数据总条数  
        List<Object> list_obj=new ArrayList<Object>();
		for (SysFormDragconfigWithBLOBs u : list) {
			list_obj.add(u);
		}
        pageresponse.setRows(list_obj);  
        pageresponse.setTotal(total);  
        return pageresponse;

	}

	@Override
	public void buildNewChartForm(SysFormconfigCache form, SysRequestParam request) {
		try {
			
			Map mapx = sysformconfigService.getChartConfigByformId(form.getFormDefId()+"");
			StringBuffer jsp = ChartFormBeansUtil.getChartFormJsp(form,mapx);
			String path11 = form.getFormTreePath();

			form.getPojoform().setFormSubmitUrl(path11+form.getPojoform().getFormDefCode()+".jsp");
			Map map = new HashMap();
			map.put("submitUrl", path11+form.getPojoform().getFormDefCode()+".jsp");
			map.put("formDefId", form.getFormDefId());
			sysFormconfigMapperExpand.updateSubmitUrl(map);
	
			logger.info(path11);
			//获取文件路径和文件名
//			String path="E:/myeclipse/workspace1/myehr/WebRoot/jsp/formbuld";
			String path="C:/MyeHR/MyeHR_MSSQL/jsp/"+path11;
//			String path1="E:/myeclipse/workspace1/.metadata/.me_tcat/webapps/myehr/jsp/formbuld";
			String path1 =  request.getPath()+"\\"+path11;
//			String path1= "E:/SqlServer/myeclipse/apache-tomcat-6.0.45/webapps/myehr/jsp/formbuild/"+path11;
			
			//生成文件
			//SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
			
			CreateFileUtil.createDir(path);
			CreateFileUtil.createDir(path1);
			
			try {  
				File f = new File(path+"/"+form.getPojoform().getFormDefCode()+".jsp");
				File f1 = new File(path1+"/"+form.getPojoform().getFormDefCode()+".jsp"); 
				if (f.exists()) {  
					System.out.print("文件存在");  
				} else {  
					System.out.print("文件不存在");  
					f.createNewFile();// 不存在则创建
				}
				OutputStreamWriter write = new OutputStreamWriter(new FileOutputStream(f),"utf-8");
				BufferedWriter output=new BufferedWriter(write); 
				output.write(jsp.toString());
				output.close();  
				if (f1.exists()) {  
					System.out.print("文件存在");  
				} else {  
					System.out.print("文件不存在");  
					f1.createNewFile();// 不存在则创建
				}
				OutputStreamWriter write1 = new OutputStreamWriter(new FileOutputStream(f1),"utf-8");
				BufferedWriter output1=new BufferedWriter(write1); 
				output1.write(jsp.toString());
				output1.close(); 
			} catch (Exception e) {  
				e.printStackTrace();logger.error(e.getMessage(),e);
			}  
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();logger.error(e.getMessage(),e);
		} 
	}

	@Override
	public boolean isCreateForm(SysFormconfigCache formCache) {
		return true;
	}


	@Override
	public void createCardVue(SysFormconfigCache formCache,
			HttpServletRequest request) {
		try {
			StringBuffer buttonJs = new StringBuffer();
			StringBuffer[] LoadDataVue = MobileFormBeansUtil.getCardDataVue(formCache);
			StringBuffer[] vue = MobileFormBeansUtil.getMobileCardVue(formCache.getPojoform(),LoadDataVue);
			String path11 = formCache.getFormTreePath();
			Map map = new HashMap();
			logger.info(path11);
			//获取文件路径和文件名
			String path=pathX+path11;
			CreateFileUtil.createDir(path);
			try {  
				File f = new File(path+"/"+formCache.getPojoform().getFormDefCode()+".vue");
				if (f.exists()) {  
					System.out.print("文件存在");  
				} else {  
					System.out.print("文件不存在");  
					//f.createNewFile();// 不存在则创建
				}
				OutputStreamWriter write = new OutputStreamWriter(new FileOutputStream(f),"utf-8");
				BufferedWriter output=new BufferedWriter(write); 
				output.write(vue[0].toString());
				output.write(vue[1].toString());
				output.write(vue[2].toString());
				output.write(vue[3].toString());
				output.write(vue[4].toString());
				output.write(vue[5].toString());
				output.write(vue[6].toString());
				output.write(vue[7].toString());
				output.write(vue[8].toString());
				output.close();  
			} catch (Exception e) {  
				e.printStackTrace();logger.error(e.getMessage(),e);
			}  
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();logger.error(e.getMessage(),e);
		}
		
	}
	
	@Override
	public void createGridVue(SysFormconfigCache formCache,HttpServletRequest request) {
		try {
			StringBuffer buttonJs = new StringBuffer();
			StringBuffer[] LoadDataVue = MobileFormBeansUtil.getGridDataVue(formCache);
			StringBuffer[] vue = MobileFormBeansUtil.getMobileFormVue(formCache.getPojoform(),LoadDataVue);
			String path11 = formCache.getFormTreePath();
			Map map = new HashMap();
			logger.info(path11);
			//获取文件路径和文件名
			String path=pathX+path11;
			CreateFileUtil.createDir(path);
			try {  
				File f = new File(path+"/"+formCache.getPojoform().getFormDefCode()+".vue");
				if (f.exists()) {  
					System.out.print("文件存在");  
				} else {  
					System.out.print("文件不存在");  
					//f.createNewFile();// 不存在则创建
				}
				OutputStreamWriter write = new OutputStreamWriter(new FileOutputStream(f),"utf-8");
				BufferedWriter output=new BufferedWriter(write); 
				output.write(vue[0].toString());
				output.write(vue[1].toString());
				output.write(vue[2].toString());
				output.write(vue[3].toString());
				output.write(vue[4].toString());
				output.write(vue[5].toString());
				output.write(vue[6].toString());
				output.write(vue[7].toString());
				output.write(vue[8].toString());
				output.write(vue[9].toString());
				output.write(vue[10].toString());
				output.write(vue[11].toString());
				output.write(vue[12].toString());
				output.close();  
			} catch (Exception e) {  
				e.printStackTrace();logger.error(e.getMessage(),e);
			}  
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();logger.error(e.getMessage(),e);
		} 
	}

	/*
	 * 移动端卡卡普通流程表单生成
	 */
	@Override
	public void createCCYFormVue(SysFormconfigCache formCache,HttpServletRequest request) {
		try {
			String path11 = formCache.getFormTreePath();
			Map map = new HashMap();
			logger.info(path11);
			//获取文件路径和文件名
			String path=pathX+path11;
			CreateFileUtil.createDir(path);
			SysFormconfigMstTabCache mstCache = formCache.getMstTab();
			SysFormconfigCache mainForm = mstCache.getMainFrom();
			List<SysFormconfigMstTabDetailCache> details = mstCache.getDetails();
			StringBuffer buttonJs = new StringBuffer();
			StringBuffer[] LoadDataVue = MobileFormBeansUtil.getCCYDataVue(formCache,path11);
			StringBuffer[] vue = MobileFormBeansUtil.getMobileFormCCYVue_0(formCache.getPojoform(),LoadDataVue);
			StringBuffer[] LoadDataVue1 = MobileFormBeansUtil.getCardDataVue(mainForm);
			StringBuffer[] vue1 = MobileFormBeansUtil.getMobileFormCCYVue_1(formCache,LoadDataVue1);
			try { 
				//外框
				File f = new File(path+"/"+formCache.getPojoform().getFormDefCode()+".vue");
				if (f.exists()) {  
					System.out.print("文件存在");  
				} else {  
					System.out.print("文件不存在");  
					//f.createNewFile();// 不存在则创建
				}
				OutputStreamWriter write = new OutputStreamWriter(new FileOutputStream(f),"utf-8");
				BufferedWriter output=new BufferedWriter(write); 
				output.write(vue[0].toString());
				output.close();  
				//主表
				File f1 = new File(path+"/"+mainForm.getPojoform().getFormDefCode()+".vue");
				if (f1.exists()) {  
					System.out.print("文件存在");  
				} else {  
					System.out.print("文件不存在");  
					//f.createNewFile();// 不存在则创建
				}
				OutputStreamWriter write1 = new OutputStreamWriter(new FileOutputStream(f1),"utf-8");
				BufferedWriter output1=new BufferedWriter(write1); 
				output1.write(vue1[0].toString());
				output1.close();  
				//附表
				for (int i = 0; i < details.size(); i++) {
					SysFormconfigCache dForm = details.get(i).getForm();
					StringBuffer[] LoadDataVue2 = MobileFormBeansUtil.getGridDataVue(dForm);
					StringBuffer[] vue2 = MobileFormBeansUtil.getMobileFormCCYVue_2(dForm,LoadDataVue2);//附表表单
					StringBuffer[] LoadDataVue3 = MobileFormBeansUtil.getCardDataVue(mainForm);
					StringBuffer[] vue3 = MobileFormBeansUtil.getMobileFormCCYCARDVue_2(dForm,LoadDataVue2);//附表增改表单表单
					File f2 = new File(path+"/"+dForm.getPojoform().getFormDefCode()+".vue");
					if (f2.exists()) {  
						System.out.print("文件存在");  
					} else {  
						System.out.print("文件不存在");  
						//f.createNewFile();// 不存在则创建
					}
					OutputStreamWriter write2 = new OutputStreamWriter(new FileOutputStream(f2),"utf-8");
					BufferedWriter output2=new BufferedWriter(write2); 
					output2.write(vue2[0].toString());
					output2.close(); 
					File f3 = new File(path+"/"+dForm.getPojoform().getFormDefCode().toLowerCase()+"_Edit.vue");
					if (f3.exists()) {  
						System.out.print("文件存在");  
					} else {  
						System.out.print("文件不存在");  
						//f.createNewFile();// 不存在则创建
					}
					OutputStreamWriter write3 = new OutputStreamWriter(new FileOutputStream(f3),"utf-8");
					BufferedWriter output3=new BufferedWriter(write3); 
					output3.write(vue2[0].toString());
					output3.close(); 
				}
				
				
			} catch (Exception e) {  
				e.printStackTrace();logger.error(e.getMessage(),e);
			}  
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();logger.error(e.getMessage(),e);
		} 
		
	}

	@Override
	public void createCCSFormVue(SysFormconfigCache formCache,HttpServletRequest request) {
		
	}
	
	@Override
	public void buildFreeActForm_Grid(SysFormconfigCache form,SysRequestParam request,String isApp,ActNodePropertiesExpand actNodePropertiesExpand,String nodeId,String taskId,String isApp2) {
		try {
			String mstFormId = String.valueOf(form.getFormDefId());
			SysFormconfigMstTabCache sMst= form.getMstTab();
			//通过主表Id获取html
			String mainFormId = sMst.getPojo().getMstTabMainFormId().toString();
			SysFormconfigCache mainform = sysformconfigService.getForm(mainFormId);
			List<SysFormconfigCache> formList = new ArrayList<SysFormconfigCache>();
			formList.add(mainform);
			StringBuffer[] sbs = mainform.showPage(request,"ACTFREE",actNodePropertiesExpand,"main",0);
			StringBuffer[] mainMst = mainform.showPage(request,"CARDANDCARD_MAIN",null,"main",0);
			SysGridbycardTemplateColumnExample example = new SysGridbycardTemplateColumnExample();
			example.or().andTemplateColumnFormDefIdEqualTo(Integer.valueOf(mainform.getFormDefId()+"")).andTemplateColumnTemplateIdEqualTo(Integer.valueOf(mainform.getPojoform().getExpand1()));
			example.setOrderByClause("TEMPLATE_COLUMN_ID");
			List<SysGridbycardTemplateColumn> sList = sTemplateColumnMapper.selectByExample(example);
			//获取附表信息
			String mstId = String.valueOf(sMst.getMstTabId());
			SysFormconfigMstTabDetailExample example2 = new SysFormconfigMstTabDetailExample();
			example2.or().andMstTabIdEqualTo(new BigDecimal(mstId));
			example2.setOrderByClause("TAB_DETAIL_SORT");
			List<SysFormconfigMstTabDetail> sDetailMsts= sysDetailMapper.selectByExample(example2);
			
			//获取参数表信息
			SysFormGeneralParamExample example3 = new SysFormGeneralParamExample();
			example3.or().andParamTypeValueEqualTo(new BigDecimal(mstFormId));
			List<SysFormGeneralParam> sysFormGeneralParams= sysFormGeneralParamMapper.selectByExample(example3);
			
			StringBuffer[] detailMst = detailCardAndGridHtml_ACT(sDetailMsts,request,form,taskId,nodeId,formList);
			StringBuffer[] paramas = paramaHtmlCardToCard(mainform,sysFormGeneralParams);
			String path11 = form.getFormTreePath();
			form.getPojoform().setFormSubmitUrl(path11+form.getPojoform().getFormDefCode()+".jsp");
			Map map = new HashMap();
			map.put("submitUrl", path11+form.getPojoform().getFormDefCode()+".jsp");
			map.put("formDefId", form.getFormDefId());
			sysFormconfigMapperExpand.updateSubmitUrl(map);
			logger.info(path11);
			//获取文件路径和文件名
			String path="C:/MyeHR/MyeHR_MSSQL/jsp/"+path11;
			String path1 =  request.getPath()+"\\"+path11;
			
			CreateFileUtil.createDir(path);
			CreateFileUtil.createDir(path1);
			
			try {  
				File f = new File(path+"/"+form.getPojoform().getFormDefCode()+".jsp");
				File f1 = new File(path1+"/"+form.getPojoform().getFormDefCode()+".jsp"); 
				File f3 = new File(path1+"/"+form.getPojoform().getFormDefCode()+".js"); 
				if (f3.exists()) {  
					System.out.print("文件存在");  
				} else {  
					System.out.print("文件不存在");  
					f3.createNewFile();// 不存在则创建
				}
				OutputStreamWriter write3 = new OutputStreamWriter(new FileOutputStream(f3),"utf-8");
				BufferedWriter output3=new BufferedWriter(write3);
				//output3.write(detailMst[23].toString());
				output3.write(CardAndCardFormBeansUtil.getFunctionForTitle(form.getFormDefSaveTable(),mainform.getFormDefCode()).toString());
				
				output3.write(detailMst[6].toString());
				
				output3.write("var indexApprove;\n");
				
				output3.write(sbs[7].toString());//mainMst
				output3.write(mainMst[3].toString());
				output3.write(detailMst[0].toString());
				output3.write(detailMst[2].toString());
				output3.write(detailMst[3].toString());
				
				output3.write(detailMst[4].toString());
				output3.write(detailMst[5].toString());
				output3.write(detailMst[7].toString());
				output3.write(detailMst[8].toString());
				output3.write(detailMst[9].toString());
				output3.write(detailMst[10].toString());
				output3.write(detailMst[11].toString());
				output3.write(detailMst[15].toString());
				output3.write(detailMst[16].toString());
				output3.close();  
				
				
				if (f1.exists()) {  
					System.out.print("文件存在");  
				} else {  
					System.out.print("文件不存在");  
					f1.createNewFile();// 不存在则创建
				}
				OutputStreamWriter write1 = new OutputStreamWriter(new FileOutputStream(f1),"utf-8");
				BufferedWriter output1=new BufferedWriter(write1);
				output1.write(CardAndCardFormBeansUtil.formCardAndCardHead1(form.getPojoform().getFormDefCode(),path11,isApp2).toString());
				if (form.getCardtocardConfig()!=null&&form.getCardtocardConfig().getIsDivLink().equals("Y")) {
					output1.write("<div style=\"position:absolute;left:8%;z-index:999px\" id=\"maodianS\">\n"+
						 	      "<div style=\"position:absolute\">\n"+
						 	      "<a href=\"#"+mainform.getFormDefCode()+"\" class=\"maodianA\"><input type=\"text\" readonly class=\"maodian form-control\" value=\"置顶\"/></a>\n");
					output1.write(detailMst[22].toString());
					if (form.getCardtocardConfig().getIsPrint().equals("Y")) {
						output1.write("<input type=\"button\" class=\"btn btn-info\" value=\"打印\" onclick=\"initPrint()\"/>\n");
					}
					output1.write("</div>\n");
					output1.write("</div>\n");
					output1.write("<div class=\"container-fluid\" id=\"CardAndCardForm\" style=\"height: 94%;overflow-y: auto;overflow-x:  hidden;padding: 0px;width:"+form.getCardtocardConfig().getMainWidth()+";\">\n");
				}else {
					if (form.getCardtocardConfig()!=null&&form.getCardtocardConfig().getIsPrint().equals("Y")) {
						output1.write("<div style=\"position:absolute;left:8%;z-index:999px\" id=\"maodianS\">\n"+
							 	      "<div style=\"position:absolute\">\n"+
							 	      "<a href=\"#"+mainform.getFormDefCode()+"\" class=\"maodianA\"><input type=\"text\" readonly class=\"maodian form-control\" value=\"置顶\"/></a>\n");
						output1.write(detailMst[22].toString());
						output1.write("<input type=\"button\" class=\"btn btn-info\" value=\"打印\" onclick=\"initPrint()\"/>\n");
						output1.write("</div>\n");
						output1.write("</div>\n");
					}
					output1.write("<div class=\"container-fluid\" id=\"CardAndCardForm\" style=\"height:98%;width:70%;overflow-y: auto;overflow-x:hidden;padding: 0px;float:left;\">\n");
				}
				
				output1.write("<div class=\"row mainFormElement\" style=\"margin-left:0;padding: 0 15px 0 0;position:relative;\" id=\""+mainform.getFormDefCode()+"\">\n");
				output1.write("<input type=\"button\" id=\"zhankai_main\"  class=\"btn btn-info CCButtonelement\" value=\"展开\" style=\"position:absolute;right:30px;bottom:10px;z-index:999\" onclick=\"showDate_Main(main_Datas,0,this)\"/>\n");
				output1.write("</div>\n");
				output1.write(detailMst[24].toString());

				output1.write("</div>\n");
				output1.write("<div class=\"container-fluid\" id=\"editPerson\" style=\"height:98%;width:29%;overflow-y: hidden;overflow-x:hidden;padding:0px;margin-top:1%;float:right;padding-bottom:50px;position:relative;\">\n");
				output1.write("<h3 class=\"CCFubiaoTitle CCD_TITLE\">编辑流程路线<span id=\"baocun\" class=\"fa fa-floppy-o CCD_TITLE_BUTTON\" onclick=\"saveFreeLines()\" title=\"保存\" style=\"margin-left:10px\"></span></h3>\n");
				output1.write("<div class=\"row \" style=\"margin-left:0;padding: 0 15px 0 0;position:relative;height:100%;overflow:auto\" id=\"lineElement\">\n");
				output1.write("</div>\n");
				output1.write("</div>\n");
				output1.write(CardAndCardFormBeansUtil.formCardAndCardJsHead());
				output1.write(detailMst[14].toString());
				output1.write(sbs[30].toString());
				output1.write(mainMst[70].toString());
				output1.write("var param_empIds = '${param.empIds}';\n");
				output1.write("var isApp = '${param.formType}';\n");
				
				output1.write("var param_flowAction = '${param.flowAction}';\n");
				output1.write("var param_key = '${param.key}';\n");
				output1.write("var param_taskId = '${param.taskId}';\n");
				output1.write("var param_procInsId = '${param.procInsId}';\n");
				
				
				output1.write("var formId_main = '"+mainform.getPojoform().getFormDefId()+"';\n");

				output1.write("var flowAction = '${param.flowAction}';\n");
				output1.write("var BUSSINESSID_ACT = '${param.businessId}';\n");
				
				output1.write("var actFree_taskId= '${param.taskId}';\n");
				output1.write("var actFree_orderBy = \"\";\n");
				output1.write("var titleModel = \""+form.getPojoform().getFormDefSavetable()+"\";\n");
				output1.write("if(flowAction=='start'){\n");
				output1.write("	actFree_orderBy = '0';\n");
				output1.write("}else{\n");
				output1.write("	actFree_orderBy = '${param.orderBy}';\n");
				output1.write("}\n");
				
				output1.write("$(document).ready(function () {\n");
				output1.write("loadDataStart();\n");
				output1.write("$(\"#zhankai_main\").click();\n");
				output1.write(detailMst[17].toString());
				output1.write(detailMst[12].toString());
				output1.write(detailMst[18].toString());
				output1.write(detailMst[19].toString());
				output1.write(detailMst[20].toString());
				output1.write("changeFileCss();\n");
				output1.write("showFreeActLines();\n");
				output1.write("changeFileCss();\n");
				if (isApp2!=null&&isApp2.equals("APP")) {
					output1.write("changeCssForApp1();\n");
				}
				output1.write(form.getPojoform().getFormDefInitQzJs()+"\n");
				if (isApp2!=null&&isApp2.equals("APP")) {
					output1.write("window.parent.postMessage('1','*');\n");
				}
				output1.write("})\n");
				output1.write(detailMst[21].toString());
				output1.write(sbs[40].toString());
				output1.write(sbs[55].toString());
				output1.write(detailMst[13].toString());
				output1.write(sbs[8].toString());
				output1.write(SysGridFormBeansUtil.formGridByCardFunction1());
				output1.write(SysGridFormBeansUtil.getEmpPhotoSYS());
				output1.write(SysGridFormBeansUtil.formGridByCardFunction5());
				output1.write(SysGridFormBeansUtil.formGridByCardFunction2_x(mainform.getFormDefId()+"",mainform.getFormDefCode(),paramas[1].toString()));
				output1.write(SysGridFormBeansUtil.formGridByCardFunction3(sList,mainform));
				output1.write(paramas[1].toString());
				output1.write(CardAndCardFormBeansUtil.endFunction());
				output1.write(CardAndCardFormBeansUtil.showDate_MainJsForCC1());
				output1.write(CardAndCardFormBeansUtil.showDate_MainJsForCC2_ACT(mainMst[60], mainMst[0], mainform.getPojoform().getFormDefId()+"",mainMst[2],mainMst[4]));
				output1.write(mainMst[67].toString());
				output1.write(CardAndCardFormBeansUtil.endFunction());
				output1.write("</script>\n</body>\n</html>");
				output1.close();
			} catch (Exception e) {  
				e.printStackTrace();logger.error(e.getMessage(),e);
			}  
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();logger.error(e.getMessage(),e);
		} 
	}

	@Override
	public void buildFreeActForm2_Grid(SysFormconfigCache form,
			SysRequestParam request, String isApp,
			ActNodePropertiesExpand actNodePropertiesExpand, String nodeId,
			String taskId, String isApp2) {
		try {
			String mstFormId = String.valueOf(form.getFormDefId());
			SysFormconfigMstTabCache sMst= form.getMstTab();
			//通过主表Id获取html
			String mainFormId = sMst.getPojo().getMstTabMainFormId().toString();
			SysFormconfigCache mainform = sysformconfigService.getForm(mainFormId);
			List<SysFormconfigCache> formList = new ArrayList<SysFormconfigCache>();
			formList.add(mainform);
			StringBuffer[] sbs = mainform.showPage(request,"ACTFREE",actNodePropertiesExpand,"main",0);
			StringBuffer[] mainMst = mainform.showPage(request,"CARDANDCARD_MAIN",null,"main",0);
			SysGridbycardTemplateColumnExample example = new SysGridbycardTemplateColumnExample();
			example.or().andTemplateColumnFormDefIdEqualTo(Integer.valueOf(mainform.getFormDefId()+"")).andTemplateColumnTemplateIdEqualTo(Integer.valueOf(mainform.getPojoform().getExpand1()));
			example.setOrderByClause("TEMPLATE_COLUMN_ID");
			List<SysGridbycardTemplateColumn> sList = sTemplateColumnMapper.selectByExample(example);
			//获取附表信息
			String mstId = String.valueOf(sMst.getMstTabId());
			SysFormconfigMstTabDetailExample example2 = new SysFormconfigMstTabDetailExample();
			example2.or().andMstTabIdEqualTo(new BigDecimal(mstId));
			example2.setOrderByClause("TAB_DETAIL_SORT");
			List<SysFormconfigMstTabDetail> sDetailMsts= sysDetailMapper.selectByExample(example2);
			
			//获取参数表信息
			SysFormGeneralParamExample example3 = new SysFormGeneralParamExample();
			example3.or().andParamTypeValueEqualTo(new BigDecimal(mstFormId));
			List<SysFormGeneralParam> sysFormGeneralParams= sysFormGeneralParamMapper.selectByExample(example3);
			
			StringBuffer[] detailMst = detailCardAndGridHtml_ACT(sDetailMsts,request,form,taskId,nodeId,formList);
			StringBuffer[] paramas = paramaHtmlCardToCard(mainform,sysFormGeneralParams);
			String path11 = form.getFormTreePath();
			form.getPojoform().setFormSubmitUrl(path11+form.getPojoform().getFormDefCode()+".jsp");
			Map map = new HashMap();
			map.put("submitUrl", path11+form.getPojoform().getFormDefCode()+".jsp");
			map.put("formDefId", form.getFormDefId());
			sysFormconfigMapperExpand.updateSubmitUrl(map);
			logger.info(path11);
			//获取文件路径和文件名
			String path="C:/MyeHR/MyeHR_MSSQL/jsp/"+path11;
			String path1 =  request.getPath()+"\\"+path11;
			
			CreateFileUtil.createDir(path);
			CreateFileUtil.createDir(path1);
			
			try {  
				File f = new File(path+"/"+form.getPojoform().getFormDefCode()+".jsp");
				File f1 = new File(path1+"/"+form.getPojoform().getFormDefCode()+".jsp"); 
				File f3 = new File(path1+"/"+form.getPojoform().getFormDefCode()+".js"); 
				if (f3.exists()) {  
					System.out.print("文件存在");  
				} else {  
					System.out.print("文件不存在");  
					f3.createNewFile();// 不存在则创建
				}
				OutputStreamWriter write3 = new OutputStreamWriter(new FileOutputStream(f3),"utf-8");
				BufferedWriter output3=new BufferedWriter(write3);
				output3.write(detailMst[23].toString());
				output3.write(detailMst[6].toString());
				
				output3.write("var indexApprove;\n");
				
				output3.write(sbs[7].toString());//mainMst
				output3.write(mainMst[3].toString());
				output3.write(detailMst[0].toString());
				output3.write(detailMst[2].toString());
				output3.write(detailMst[3].toString());
				
				output3.write(detailMst[4].toString());
				output3.write(detailMst[5].toString());
				output3.write(detailMst[7].toString());
				output3.write(detailMst[8].toString());
				output3.write(detailMst[9].toString());
				output3.write(detailMst[10].toString());
				output3.write(detailMst[11].toString());
				output3.write(detailMst[15].toString());
				output3.write(detailMst[16].toString());
				output3.close();  
				
				
				if (f1.exists()) {  
					System.out.print("文件存在");  
				} else {  
					System.out.print("文件不存在");  
					f1.createNewFile();// 不存在则创建
				}
				OutputStreamWriter write1 = new OutputStreamWriter(new FileOutputStream(f1),"utf-8");
				BufferedWriter output1=new BufferedWriter(write1);
				output1.write(CardAndCardFormBeansUtil.formCardAndCardHead1(form.getPojoform().getFormDefCode(),path11,isApp2).toString());
				if (form.getCardtocardConfig()!=null&&form.getCardtocardConfig().getIsDivLink().equals("Y")) {
					output1.write("<div style=\"position:absolute;left:8%;z-index:999px\" id=\"maodianS\">\n"+
						 	      "<div style=\"position:absolute\">\n"+
						 	      "<a href=\"#"+mainform.getFormDefCode()+"\" class=\"maodianA\"><input type=\"text\" readonly class=\"maodian form-control\" value=\"置顶\"/></a>\n");
					output1.write(detailMst[22].toString());
					if (form.getCardtocardConfig().getIsPrint().equals("Y")) {
						output1.write("<input type=\"button\" class=\"btn btn-info\" value=\"打印\" onclick=\"initPrint()\"/>\n");
					}
					output1.write("</div>\n");
					output1.write("</div>\n");
					output1.write("<div class=\"container-fluid\" id=\"CardAndCardForm\" style=\"height: 94%;overflow-y: auto;overflow-x:  hidden;padding: 0px;width:"+form.getCardtocardConfig().getMainWidth()+";\">\n");
				}else {
					if (form.getCardtocardConfig()!=null&&form.getCardtocardConfig().getIsPrint().equals("Y")) {
						output1.write("<div style=\"position:absolute;left:8%;z-index:999px\" id=\"maodianS\">\n"+
							 	      "<div style=\"position:absolute\">\n"+
							 	      "<a href=\"#"+mainform.getFormDefCode()+"\" class=\"maodianA\"><input type=\"text\" readonly class=\"maodian form-control\" value=\"置顶\"/></a>\n");
						output1.write(detailMst[22].toString());
						output1.write("<input type=\"button\" class=\"btn btn-info\" value=\"打印\" onclick=\"initPrint()\"/>\n");
						output1.write("</div>\n");
						output1.write("</div>\n");
					}
					output1.write("<div class=\"container-fluid\" id=\"CardAndCardForm\" style=\"height:98%;width:70%;overflow-y: auto;overflow-x:hidden;padding: 0px;float:left;\">\n");
				}
				
				output1.write("<div class=\"row mainFormElement\" style=\"margin-left:0;padding: 0 15px 0 0;position:relative;\" id=\""+mainform.getFormDefCode()+"\">\n");
				output1.write("<input type=\"button\" id=\"zhankai_main\"  class=\"btn btn-info CCButtonelement\" value=\"展开\" style=\"position:absolute;right:30px;bottom:10px;z-index:999\" onclick=\"showDate_Main(main_Datas,0,this)\"/>\n");
				output1.write("</div>\n");
				output1.write(detailMst[24].toString());

				output1.write("</div>\n");
				output1.write("<div class=\"container-fluid\" id=\"editPerson\" style=\"height:98%;width:29%;overflow-y: hidden;overflow-x:hidden;padding:0px;margin-top:1%;float:right;padding-bottom:50px;position:relative;\">\n");
				output1.write("<h3 class=\"CCFubiaoTitle CCD_TITLE\">流程审批历史</h3>\n");
				output1.write("<div class=\"row \" style=\"margin-left:0;padding: 0 15px 0 0;position:relative;height:100%;overflow:auto\" id=\"hisComment\">\n");
				output1.write("</div>\n");
				output1.write("</div>\n");
				output1.write(CardAndCardFormBeansUtil.formCardAndCardJsHead());
				output1.write(detailMst[14].toString());
				output1.write(sbs[30].toString());
				output1.write(mainMst[70].toString());
				output1.write("var param_empIds = '${param.empIds}';\n");
				output1.write("var isApp = '${param.formType}';\n");
				
				output1.write("var param_flowAction = '${param.flowAction}';\n");
				output1.write("var param_key = '${param.key}';\n");
				output1.write("var param_taskId = '${param.taskId}';\n");
				output1.write("var param_procInsId = '${param.procInsId}';\n");
				
				
				output1.write("var formId_main = '"+mainform.getPojoform().getFormDefId()+"';\n");

				output1.write("var flowAction = '${param.flowAction}';\n");
				output1.write("var BUSSINESSID_ACT = '${param.businessId}';\n");
				
				output1.write("var actFree_taskId= '${param.taskId}';\n");
				output1.write("var actFree_orderBy = \"\";\n");
				output1.write("if(flowAction=='start'){\n");
				output1.write("	actFree_orderBy = '0';\n");
				output1.write("}else{\n");
				output1.write("	actFree_orderBy = '${param.orderBy}';\n");
				output1.write("}\n");
				
				output1.write("$(document).ready(function () {\n");
				output1.write("loadDataStart();\n");
				output1.write("$(\"#zhankai_main\").click();\n");
				output1.write(detailMst[17].toString());
				output1.write(detailMst[12].toString());
				output1.write(detailMst[18].toString());
				output1.write(detailMst[19].toString());
				output1.write(detailMst[20].toString());
				output1.write("showComment();\n");
				output1.write("if(flowAction!='start'){\n");
				output1.write("	  changeReadonly(\"MainElement\");\n");//修改文本框
				output1.write("}\n");
//				output1.write("showFreeActLines();\n");
				output1.write("changeFileCss();\n");
				if (isApp2!=null&&isApp2.equals("APP")) {
					output1.write("changeCssForApp1();\n");
				}
				output1.write(form.getPojoform().getFormDefInitQzJs()+"\n");
				if (isApp2!=null&&isApp2.equals("APP")) {
					output1.write("window.parent.postMessage('1','*');\n");
				}
				output1.write("})\n");
				output1.write(detailMst[21].toString());
				output1.write(sbs[40].toString());
				output1.write(sbs[55].toString());
				output1.write(detailMst[13].toString());
				output1.write(sbs[8].toString());
				output1.write(SysGridFormBeansUtil.formGridByCardFunction1());
				output1.write(SysGridFormBeansUtil.getEmpPhotoSYS());
				output1.write(SysGridFormBeansUtil.formGridByCardFunction5());
				output1.write(SysGridFormBeansUtil.formGridByCardFunction2_x(mainform.getFormDefId()+"",mainform.getFormDefCode(),paramas[1].toString()));
				output1.write(SysGridFormBeansUtil.formGridByCardFunction3(sList,mainform));
				output1.write(paramas[1].toString());
				output1.write(CardAndCardFormBeansUtil.endFunction());
				output1.write(CardAndCardFormBeansUtil.showDate_MainJsForCC1());
				output1.write(CardAndCardFormBeansUtil.showDate_MainJsForCC2_ACT(mainMst[60], mainMst[0], mainform.getPojoform().getFormDefId()+"",mainMst[2],mainMst[4]));
				output1.write(mainMst[67].toString());
				output1.write(CardAndCardFormBeansUtil.endFunction());
				output1.write("</script>\n</body>\n</html>");
				output1.close();
			} catch (Exception e) {  
				e.printStackTrace();logger.error(e.getMessage(),e);
			}  
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();logger.error(e.getMessage(),e);
		} 
	}


}
