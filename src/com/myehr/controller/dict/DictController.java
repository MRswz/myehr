package com.myehr.controller.dict;

import java.math.BigDecimal;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.myehr.common.mybatis.MybatisUtil;
import com.myehr.common.util.ChangeCode;
import com.myehr.common.util.GetRequestJsonUtils;
import com.myehr.common.util.ResultMap;
import com.myehr.common.util.datasource.CustomerContextHolder;
import com.myehr.controller.form.parambean.CardformInitDataParams;
import com.myehr.mapper.formmanage.form.SysExecSqlMapper;
import com.myehr.mapper.formmanage.form.SysUserDictMapper;
import com.myehr.mapper.formmanage.widget.SysFormComboboxMapper;
import com.myehr.mapper.sysdict.SysDictEntryMapper;
import com.myehr.mapper.sysdict.SysDictTypeMapper;
import com.myehr.pojo.dict.DictData;
import com.myehr.pojo.dict.SysDictEntry;
import com.myehr.pojo.dict.SysDictEntryExample;
import com.myehr.pojo.dict.SysDictType;
import com.myehr.pojo.dict.SysDictTypeExample;
import com.myehr.pojo.formmanage.cache.SysFormColumnCache;
import com.myehr.pojo.formmanage.cache.SysFormComboboxCache;
import com.myehr.pojo.formmanage.cache.SysFormconfigCache;
import com.myehr.pojo.formmanage.form.SysExecSql;
import com.myehr.pojo.formmanage.form.SysExecSqlExample;
import com.myehr.pojo.formmanage.form.SysFormColumn;
import com.myehr.pojo.formmanage.form.SysFormconfigWithBLOBs;
import com.myehr.pojo.formmanage.form.SysUserDict;
import com.myehr.pojo.formmanage.form.SysUserDictExample;
import com.myehr.pojo.formmanage.widget.SysFormCombobox;
import com.myehr.pojo.formmanage.widget.SysFormComboboxExample;
import com.myehr.pojo.TreeModel;
import com.myehr.service.primaryKey.PrimaryKeyService;
import com.myehr.service.sysdict.SysDictService;
import com.myehr.service.sysdict.SysDictTypeService;
import com.myehr.service.formmanage.form.IFormService;
import com.myehr.service.formmanage.form.ISysformconfigService;
import com.myehr.test.dao.TMapperExt;

@Controller
@RequestMapping("/dict")
public class DictController {
	private static Logger logger = LoggerFactory.getLogger(DictController.class);
	@Autowired
	private SysDictService serviceImpl;
	
//	@Autowired
	@Resource(name = "SysDictTypeService")  
	private SysDictTypeService dictTypeServiceImpl;
	
//	@Autowired
	@Resource(name = "PrimaryKeyService")  
	private PrimaryKeyService keyserviceImpl;
	
	@Autowired
	private SysDictTypeMapper sysDictTypeMapper;
	
	@Autowired
	private SysDictEntryMapper sysDictEntryMapper;
	
	
	@Autowired
	private SysUserDictMapper sysUserDictMapper;
	
	@Autowired
	private SysFormComboboxMapper sComboboxMapper;
	
	@Autowired
	private SysExecSqlMapper sExecSqlMapper;
	
	@Autowired
	private ISysformconfigService sysformconfigService;
	
//	@Autowired
	@Resource(name = "IFormService")
	private IFormService formService;

//	@Autowired
	@Resource(name = "TMapperExt")
	private TMapperExt tMapperExt;
	/*@Autowired
	private TreeTestMapper treeTestMapper;*/
	
	@RequestMapping("/findSysDictEntryList")
	public @ResponseBody ResultMap findSysDictEntryById(HttpServletRequest request) throws Exception{
		SysDictEntryExample sExample=(SysDictEntryExample) JSONObject.toBean(GetRequestJsonUtils.getJsonObject(request), SysDictEntryExample.class);
		ResultMap resultMap=new ResultMap();
		resultMap=serviceImpl.findSysDictEntryAll(sExample);
		return resultMap;
	}
	
	/**
	 * 字典项更新
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/saveSysDictEntry")
	public @ResponseBody Object saveSysDictEntry(HttpServletRequest request) throws Exception{
		JSONObject jsonObject = GetRequestJsonUtils.getJsonObject(request);
		JSONObject jsonObject2 = jsonObject.discard("dictTypeCode");
		JSONObject jsonObject3 = jsonObject2.discard("dictTypeName");
		JSONObject jsonObject4 = jsonObject3.discard("dictTypeRemark");
		JSONObject jsonObject5 = jsonObject4.discard("dictTypeClass");
        SysDictEntry dict = (SysDictEntry) JSONObject.toBean(jsonObject5, SysDictEntry.class);  
        dict.setOperatorTime(new Date());
        String reCode = serviceImpl.updateSysDictEntry(dict);
        return reCode;
    }

	/**
	 * 查找字典树
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/selectTree")
	public @ResponseBody Object selectTree(HttpServletRequest request) throws Exception{
		List<SysDictType> dictType = sysDictTypeMapper.selectByExample(null);
		List<SysDictEntry> dictEntry = sysDictEntryMapper.selectByExample(null);
		List<TreeModel> tree1 = new ArrayList<TreeModel>();
		for (int i = 0; i < 1; i++) {
			TreeModel treeTest1 = new TreeModel();
			treeTest1.setId("dictTree");
			treeTest1.setPid("");
			treeTest1.setName("业务字典树");
			
			tree1.add(treeTest1);
		}
		
		TreeModel treeTest1 = new TreeModel();
		treeTest1.setId("业务类");
		treeTest1.setPid("dictTree");
		treeTest1.setName("业务类");
		tree1.add(treeTest1);
		for (int i = 0; i < dictType.size(); i++) {
			TreeModel treeTest2 = new TreeModel();
			treeTest2.setId(dictType.get(i).getDictTypeId()+"");
			if (dictType.get(i).getDictTypeClass().equals("1")) {
				treeTest2.setPid("业务类");
			}
			if (dictType.get(i).getDictTypeClass().equals("2")) {
				treeTest2.setPid("技术类");
			}
			treeTest2.setName(dictType.get(i).getDictTypeName());
			
			tree1.add(treeTest2);
		}
			
		TreeModel treeTest3 = new TreeModel();
		treeTest3.setId("技术类");
		treeTest3.setPid("dictTree");
		treeTest3.setName("技术类");
		tree1.add(treeTest3);
		
		
		for (int i = 0; i < dictEntry.size(); i++) {
			TreeModel treeTest4 = new TreeModel();
			treeTest4.setId(dictEntry.get(i).getDictEntrySeq());
			treeTest4.setPid(dictEntry.get(i).getDictTypeId()+"");
			treeTest4.setName(dictEntry.get(i).getDictEntryName());
			
			tree1.add(treeTest4);
		}
    	JSONArray jsonArray=JSONArray.fromObject(tree1);
    	String str=jsonArray.toString();
    	String newStr = str.replaceAll("pid","pId");
    	JSONArray json = JSONArray.fromObject(newStr);
    	return json;
    }

	/**
	 * 字典项删除，先逻辑删除再物理删除
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/removeSysDictEntry")
	public @ResponseBody Object removeSysDictEntry(HttpServletRequest request) throws Exception{
		JSONObject jsonObject = GetRequestJsonUtils.getJsonObject(request);
		JSONObject jsonObject2 = jsonObject.discard("dictTypeCode");
		JSONObject jsonObject3 = jsonObject2.discard("dictTypeName");
		JSONObject jsonObject4 = jsonObject3.discard("dictTypeRemark");
		JSONObject jsonObject5 = jsonObject4.discard("dictTypeClass");
        SysDictEntry dict = (SysDictEntry) JSONObject.toBean(jsonObject5, SysDictEntry.class);
		String deleteMark= dict.getDeleteMark();
		String reCode;
		if (deleteMark.equals("N")) {
			dict.setDeleteMark("Y");
			reCode = serviceImpl.updateSysDictEntry(dict);
		}else {
			reCode = serviceImpl.deleteSysDictEntry(dict);
		}
        return reCode;
    }
	/**
	 * 字典项恢复
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/recoverSysDictEntry")
	public @ResponseBody String recoverSysDictEntry(HttpServletRequest request) throws Exception{
		JSONObject jsonObject = GetRequestJsonUtils.getJsonObject(request);
		JSONObject jsonObject2 = jsonObject.discard("dictTypeCode");
		JSONObject jsonObject3 = jsonObject2.discard("dictTypeName");
		JSONObject jsonObject4 = jsonObject3.discard("dictTypeRemark");
		JSONObject jsonObject5 = jsonObject4.discard("dictTypeClass");
        SysDictEntry dict = (SysDictEntry) JSONObject.toBean(jsonObject5, SysDictEntry.class);
		String deleteMark= dict.getDeleteMark();
		String reCode="";
		if (deleteMark.equals("Y")) {
			dict.setDeleteMark("N");
			dict.setDeleteMarkBack("Y");
			reCode = serviceImpl.updateSysDictEntry(dict);
		}
		
        return reCode;
    }
	
	/**
	 * 新增字典项
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/insertSysDictEntry")
	public @ResponseBody String insertSysDictEntry(HttpServletRequest request) throws Exception{
		String reCode = "1";
		SysDictEntry dict = (SysDictEntry) JSONObject.toBean(GetRequestJsonUtils.getJsonObject(request), SysDictEntry.class);
		dict.setDictEntryId(keyserviceImpl.getPrimaryKey("sys_dict_entry", "DICT_ENTRY_ID"));
		dict.setDeleteMark("N");
		dict.setDeleteMarkBack("N");
		dict.setOperatorTime(new Date());
		if (dict.getDictEntrySeq()!=null) {
			dict.setDictEntrySeq(dict.getDictEntrySeq()+"."+dict.getDictEntryCode());
		}else {
			dict.setDictEntrySeq("."+dict.getDictEntryCode());
		}
        reCode = serviceImpl.insertSysDictEntry(dict);
        return reCode;
    }
	
	/**
	 * 通过ID查找数据字典项
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/searchSysDictEntryById")
	public @ResponseBody SysDictEntry searchSysDictEntryById(HttpServletRequest request) throws Exception{
		SysDictEntry dict = (SysDictEntry) JSONObject.toBean(GetRequestJsonUtils.getJsonObject(request), SysDictEntry.class);
		SysDictEntry dictType=serviceImpl.findSysDictEntryById(dict.getDictEntryId());
		return dictType;
	}
	
	/**
	 * 查询逻辑删除的字典项
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/searchByDeleteMark")
	public @ResponseBody ResultMap searchByDeleteMark(HttpServletRequest request) throws Exception{
		SysDictEntry dict = (SysDictEntry) JSONObject.toBean(GetRequestJsonUtils.getJsonObject(request), SysDictEntry.class);
		ResultMap resultMap=serviceImpl.searchByDeleteMark(dict.getDeleteMark());
		return resultMap;
	}
	
	/**
	 * 通过字典类编码查找数据字典项
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/searchSysDictEntryTypeCode")
	public @ResponseBody List<Map<String,String>> searchSysDictEntryByTypeCode(HttpServletRequest request) throws Exception{
		String dictTypeCode= request.getParameter("dictTypeCode");
		String userId = request.getParameter("userId");
		String nullItemText = request.getParameter("nullItemText");
		SysUserDictExample example = new SysUserDictExample();
		com.myehr.pojo.formmanage.form.SysUserDictExample.Criteria criteria = example.createCriteria();
		criteria.andUserIdEqualTo(new BigDecimal(userId));
		List<SysUserDict> sysUserDict = sysUserDictMapper.selectByExample(example);
		if (dictTypeCode.equals("SYS_FORM_LAYOUT")) {
			logger.info(dictTypeCode);
		}
		SysDictType dictType=dictTypeServiceImpl.findSysDictTypeByCode(dictTypeCode);
		if(dictType.getDictTypeClass()=="SQL"||dictType.getDictTypeClass().equals("SQL")){
			String sql1="";
			Map lists = sysformconfigService.getDictNameMap(dictTypeCode);
			List<Map<String,String>> rsc = new ArrayList<Map<String,String>>();
		    Set<Entry<Integer, String>> entrys = lists.entrySet();
            for(Entry<Integer, String> entry:entrys){
				Map<String,String> m1 = new HashMap<String,String>();
				System.out.println("key值："+entry.getKey()+" value值："+entry.getValue());
				m1.put("text", entry.getKey()+"");
				m1.put("id", entry.getValue());
				rsc.add(m1);
			}
			   return rsc;
		}		//List<SysDictEntryExpand> list= serviceImpl.searchDictEntryListByTypeId(dictType.getDictTypeId());
		List<SysDictEntry> list = sysformconfigService.getDictEntrys(dictTypeCode);
		SysDictEntryExample entryExample = new SysDictEntryExample();
		logger.info(dictType.getDictTypeName());
		com.myehr.pojo.dict.SysDictEntryExample.Criteria entryCriteria = entryExample.createCriteria();
		entryCriteria.andDictTypeIdEqualTo(dictType.getDictTypeId());
		entryCriteria.andDictParentCodeIsNull();
		entryExample.setOrderByClause("DICT_ENTRY_SORT");
		List<SysDictEntry> entryList = sysDictEntryMapper.selectByExample(entryExample);
		List<SysDictEntry> realList = new ArrayList<SysDictEntry>();
		for (int i = 0; i < entryList.size(); i++) {
			realList = getRealList(realList,list,entryList.get(i));
		}
		List<Map<String,String>> rs = new ArrayList<Map<String,String>>();
		if(nullItemText!=null && nullItemText!="" ){
			nullItemText = URLDecoder.decode(nullItemText,"utf-8");
			Map<String,String> m0 = new HashMap<String,String>();
			m0.put("text", nullItemText);
			m0.put("id", "");
			rs.add(m0);
		}
		for (int i = 0; i < realList.size(); i++) {
			int flag=0;
			Map<String,String> m1 = new HashMap<String,String>();
			for (int j = 0; j < sysUserDict.size(); j++) {
				if (realList.get(i).getDictEntryId()-sysUserDict.get(j).getDictEntryId().intValue()==0) {
					flag=1;
				}
			}
			if (flag == 0) {
				m1.put("text", realList.get(i).getDictEntryName());
				m1.put("id", realList.get(i).getDictEntryCode());
				rs.add(m1);
			}	
		}
		return rs;
	}
	
	/**
	 * 通过字典类编码查找数据字典项
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/searchSysDictEntryTypeCodexx")
	public @ResponseBody List<Map<String,String>> searchSysDictEntryByTypeCodexx(HttpServletRequest request) throws Exception{
		String dictTypeCode= request.getParameter("dictTypeCode");
		String userId = request.getParameter("userId");
		String nullItemText = request.getParameter("nullItemText");
		String pId = request.getParameter("pId");
		SysUserDictExample example = new SysUserDictExample();
		com.myehr.pojo.formmanage.form.SysUserDictExample.Criteria criteria = example.createCriteria();
		criteria.andUserIdEqualTo(new BigDecimal(userId));
		List<SysUserDict> sysUserDict = sysUserDictMapper.selectByExample(example);
		if (dictTypeCode.equals("SYS_FORM_LAYOUT")) {
			logger.info(dictTypeCode);
		}
		List<Map<String,String>> rs = new ArrayList<Map<String,String>>();
		SysDictType dictType=dictTypeServiceImpl.findSysDictTypeByCode(dictTypeCode);
		List<SysDictEntry> list = sysformconfigService.getDictEntrys(dictTypeCode);
		SysDictEntryExample entryExample = new SysDictEntryExample();
		com.myehr.pojo.dict.SysDictEntryExample.Criteria entryCriteria = entryExample.createCriteria();
		entryCriteria.andDictTypeIdEqualTo(dictType.getDictTypeId());
		if(pId!=null&&!pId.equals("")){
			entryCriteria.andDictParentCodeEqualTo(pId);
			entryExample.setOrderByClause("DICT_ENTRY_SORT");
			List<SysDictEntry> entryList = sysDictEntryMapper.selectByExample(entryExample);
			if(nullItemText!=null && nullItemText!="" ){
				nullItemText = URLDecoder.decode(nullItemText,"utf-8");
				Map<String,String> m0 = new HashMap<String,String>();
				m0.put("text", nullItemText);
				m0.put("id", "");
				rs.add(m0);
			}
			for (int i = 0; i < entryList.size(); i++) {
				int flag=0;
				Map<String,String> m1 = new HashMap<String,String>();
				for (int j = 0; j < sysUserDict.size(); j++) {
					if (entryList.get(i).getDictEntryId()-sysUserDict.get(j).getDictEntryId().intValue()==0) {
						flag=1;
					}
				}
				if (flag == 0) {
					m1.put("text", entryList.get(i).getDictEntryName());
					m1.put("id", entryList.get(i).getDictEntryCode());
					rs.add(m1);
				}	
			}
		}else{
			entryCriteria.andDictParentCodeIsNull();
			entryExample.setOrderByClause("DICT_ENTRY_SORT");
			List<SysDictEntry> entryList = sysDictEntryMapper.selectByExample(entryExample);
			if(nullItemText!=null && nullItemText!="" ){
				nullItemText = URLDecoder.decode(nullItemText,"utf-8");
				Map<String,String> m0 = new HashMap<String,String>();
				m0.put("text", nullItemText);
				m0.put("id", "");
				rs.add(m0);
			}
			for (int i = 0; i < entryList.size(); i++) {
				int flag=0;
				Map<String,String> m1 = new HashMap<String,String>();
				for (int j = 0; j < sysUserDict.size(); j++) {
					if (entryList.get(i).getDictEntryId()-sysUserDict.get(j).getDictEntryId().intValue()==0) {
						flag=1;
					}
				}
				if (flag == 0) {
					m1.put("text", entryList.get(i).getDictEntryName());
					m1.put("id", entryList.get(i).getDictEntryCode());
					rs.add(m1);
				}	
			}
		}
		return rs;
	}
	
	public List<SysDictEntry> getRealList(List<SysDictEntry> realList,List<SysDictEntry> list,SysDictEntry sysDictEntry){ 
		if (sysDictEntry.getDictParentCode()==null) {
			realList.add(sysDictEntry);
		}
		for (int i = 0; i < list.size(); i++) {
			SysDictEntry entryExpand = list.get(i);
			if (entryExpand.getDictParentCode()!=null && entryExpand.getDictParentCode().equals(sysDictEntry.getDictEntryId()+"")) {
				int level = list.get(i).getDictEntrySeq().split("\\.").length-2;
				entryExpand.setDictEntryName(getNbsp(level)+entryExpand.getDictEntryName());
				realList.add(entryExpand);
				getRealList(realList,list,entryExpand);
			}
		}
		
		return realList;
	}
	
	
	//判断字符串是否为数字
	public boolean isNumeric(String str){ 
	   Pattern pattern = Pattern.compile("[0-9]*"); 
	   Matcher isNum = pattern.matcher(str);
	   if( !isNum.matches() ){
	       return false; 
	   } 
	   return true; 
	}
	
	//判断字符串是否为数字
	public String getNbsp(int num){
		String str = "";
		for (int i = 0; i < num; i++) {
			str+="--";
		}
		return str;
	}
	
	/**
	 * 通过字典类编码查找数据字典项
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/searchSysDictEntryTypeCode1")
	public @ResponseBody Object searchSysDictEntryByTypeCode1(HttpServletRequest request) throws Exception{
		String deleteMark = request.getParameter("deleteMark");
		//Map containerParam = params.getContainerParam();
		//解析deleteMark
		String[] dataField = deleteMark.split("_");
		if (dataField.length>2 && isNumeric(dataField[2])) { 
			String dataFieldColumn =request.getParameter("dataField");
			String realFieldColumn = ChangeCode.getRealCode(dataFieldColumn);
			String sql1 = "select DT_ID from DATAFIELD where FIELD_CODE = '"+realFieldColumn+"'";
			List<Map> rs = MybatisUtil.queryList("runtime.selectSql", sql1);
			if (rs.size()>0) {
				String dtId = rs.get(0).get("DT_ID")+"";
				SysExecSqlExample example = new SysExecSqlExample();
				example.or().andExecSqlRelaidEqualTo(Long.parseLong(dtId)).andExecSqlTypeEqualTo("datafield_exec_sql");
				List<SysExecSql> sysExecSqls = sExecSqlMapper.selectByExample(example);
				if (sysExecSqls.size()>0) {
					String sql = sysExecSqls.get(0).getExecSql();
					String str1 = sysformconfigService.setColumnSqlDict(realFieldColumn,sql);
					if (str1!=null) {
						JSONArray list2 = JSONArray.fromObject(str1);
						return list2;
					}else {
						return null;
					}
				}else {
					return null;
				}
			}else {
				SysFormComboboxExample example = new SysFormComboboxExample();
				example.or().andComboboxFormColumnIdEqualTo(new BigDecimal(dataField[2]));
				SysFormCombobox sCombobox = sComboboxMapper.selectByExample(example).get(0);
				
				SysExecSqlExample sqlExample = new SysExecSqlExample();
				sqlExample.or().andExecSqlRelaidEqualTo(sCombobox.getComboboxId().longValue());
				String sql = sExecSqlMapper.selectByExample(sqlExample).get(0).getExecSql();
				
				String getFormSql = "select sys_formconfig.FORM_DEF_SOURCE from sys_formconfig left join  SYS_FORM_COLUMN on sys_formconfig.FORM_DEF_ID = SYS_FORM_COLUMN.FORM_COLUMN_FORM_DEF_ID where SYS_FORM_COLUMN.FORM_COLUMN_ID = "+sCombobox.getComboboxFormColumnId();
				Map form = (Map) MybatisUtil.queryList("runtime.selectSql", getFormSql).get(0);
				
				if (form.get("FORM_DEF_SOURCE")!=null&&form.get("FORM_DEF_SOURCE").equals("oracle1")) {
					CustomerContextHolder.setContextType(CustomerContextHolder.session_factory_oracle);
				}
				
				List<Map> ids = MybatisUtil.queryList("runtime.selectSql", sql);
				CustomerContextHolder.setContextType(CustomerContextHolder.session_factory_sqlserver);
				if (ids.size()>0) {
					StringBuffer sb = new StringBuffer("[");
					for (int i = 0; i < ids.size(); i++) {
						sb.append("{'value':'"+ids.get(i).get("DICTVALUE")+"','text':'"+ids.get(i).get("DICTENTRY")+"'},");
					}
					String str = sb.toString();
					String str1 = str.substring(0, str.length()-1);
					str1+="]";
					logger.info(str1);
					JSONArray list2 = JSONArray.fromObject(str1);
					return list2;
				}else { 
					return null;
				}
			}
		} else {
			List<SysDictEntry> list = sysformconfigService.getDictEntrys(deleteMark);
			if (list!=null && list.size()>0) {
				StringBuffer sb = new StringBuffer("[");
				for (SysDictEntry sysDictEntryExpand : list) {
					sb.append("{'value':'"+sysDictEntryExpand.getDictEntryCode()+"','text':'"+sysDictEntryExpand.getDictEntryName()+"'},");
				}
				String str = sb.toString();
				String str1 = str.substring(0, str.length()-1);
				str1+="]";
				logger.info(str1);
				JSONArray list2 = JSONArray.fromObject(str1);
				return list2;
			}else {
				return null;
			}
		}	
	}

	@RequestMapping("/searchSysDictEntryList")
	public @ResponseBody ResultMap searchSysDictEntryList(HttpServletRequest request) throws Exception{
		SysDictEntry dict = (SysDictEntry) JSONObject.toBean(GetRequestJsonUtils.getJsonObject(request), SysDictEntry.class);
		ResultMap resultMap=serviceImpl.searchDictEntryList(dict.getDictEntryCode());
		return resultMap;
	}
	
	@RequestMapping("/findDictEntryList2")
	public @ResponseBody ResultMap findSysUserList2(HttpServletRequest request) throws Exception {
		try {  
			return serviceImpl.getAllEmployee(request);  
		} catch (Exception e) {  
			e.printStackTrace();logger.error(e.getMessage(),e);  
		}  
		return null; 
	}
	
	@RequestMapping("/findDictEntryByDictType")
	public @ResponseBody ResultMap findDictEntryByDictType(HttpServletRequest request) throws Exception {
		try {  
			return serviceImpl.getAllEmployee(request);  
		} catch (Exception e) {  
			e.printStackTrace();logger.error(e.getMessage(),e);  
		}  
		return null; 
	}
	
	/**
	 * 只读字典翻译
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/selectSqlDictEntryByValue")
	public @ResponseBody Object selectSqlDictEntryByValue(HttpServletRequest request) throws Exception {
		String value = request.getParameter("value");
		String dataField = request.getParameter("dataField");
		String dictName = request.getParameter("DictName");
		List<DictData> objs = new ArrayList<DictData>();
		if (dataField.equals("dict")) {
			objs = sysformconfigService.getCardDictDataByDictTypeCode(dictName, dataField);
		}else if(dataField.equals("sql")){
			objs = sysformconfigService.getCardDictDataByDictTypeCode(dictName, dataField);
		}
		Map map = new HashMap();
		for (DictData dictData : objs) {
			map.put(dictData.getCode(), dictData.getName());
		}
		return map;
	}
	
	/**
	 * 通过sql查找数据字典项
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/findSelectInitDataBysql")
	public @ResponseBody Object findSelectInitDataBysql(HttpServletRequest request) throws Exception{
		String sql = request.getParameter("dataBySql");
		List<Map> ids = tMapperExt.queryByFormDefSql(sql);
		if (ids.size()>0) {
			StringBuffer sb = new StringBuffer("[");
			for (int i = 0; i < ids.size(); i++) {
				if (i==0) {
					sb.append("{'id':'','text':'请选择(空值)'},");
				}
				sb.append("{'id':'"+ids.get(i).get("DICTVALUE")+"','text':'"+ids.get(i).get("DICTENTRY")+"'},");
			}
			String str = sb.toString();
			
			String str1 = str.substring(0, str.length()-1);
			str1+="]";
			logger.info(str1);
			JSONArray list2 = JSONArray.fromObject(str1);			
			return list2;
		} else {
			return null;
		}
	}
	
	/**
	 * 通过sql查找数据字典项
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/getDataBySql")
	public @ResponseBody Object getDataBySql(HttpServletRequest request) throws Exception{
		String sql = request.getParameter("dataBySql");
		List<Map> ids = tMapperExt.queryByFormDefSql(sql);
		return ids;
	}

	//getselectdatasAll
	/**
	 * 查询卡片表单基本数据
	 * @param request
	 * @param params
	 * @throws Throwable 
	 */
	@RequestMapping("/getselectdatasAll")
	public @ResponseBody Object getselectdatasAll(HttpServletRequest request, @RequestBody List<SysFormColumn> columns) throws Throwable {
		List<List<DictData>> datas = new ArrayList<List<DictData>>();
		for (SysFormColumn column : columns) {
			if (column.getFormColumnGuiType()!=null&&column.getFormColumnGuiType().equals("dict")) {
				List<DictData> data = new ArrayList<DictData>();
				if(column.getFormColumnShowType()!=null&&column.getFormColumnShowType().equals("true")){
					DictData dictData = new DictData();
					dictData.setCode("");
					dictData.setName("请选择...");
					data.add(dictData);
				}
				List<DictData> datas2 = sysformconfigService.getCardDictDataByDictTypeCode(column.getFormColumnUsName(),"dict");
				if (datas2!=null) {
					data.addAll(datas2);
				}
				datas.add(data);
			}else if (column.getFormColumnGuiType()!=null&&column.getFormColumnGuiType().equals("sql")) {
				List<DictData> data = new ArrayList<DictData>();
				if(column.getFormColumnShowType()!=null&&column.getFormColumnShowType().equals("true")){
					DictData dictData = new DictData();
					dictData.setCode("");
					dictData.setName("请选择...");
					data.add(dictData);
				}
				List<DictData> datas2 = sysformconfigService.getCardDictDataByDictTypeCode(column.getFormColumnUsName(),"sql");
				if (datas2!=null) {
					data.addAll(datas2);
				}
				datas.add(data);
			}
		}
		return datas;
	}
	
	/**
	 * 查询卡片表单所有字典数据
	 * @param request
	 * @param params
	 * @throws Throwable 
	 */
	@RequestMapping("/getDictDatasAll")
	public @ResponseBody Map getDictDatasAll(HttpServletRequest request) throws Throwable {
		String formId = request.getParameter("formId");
		SysFormconfigCache formCache = sysformconfigService.getForm(formId);
		List<SysFormColumnCache> columns = formCache.getDictColumns();
		Map map = new HashMap();
		for (SysFormColumnCache column : columns) {
			SysFormComboboxCache comboboxCache = (SysFormComboboxCache) column.getFormColumGui();
			String dictType = comboboxCache.getPojo().getComboboxGuiInitType();
			String dictCode = comboboxCache.getPojo().getComboboxGuiInitValue();
			if (dictType!=null&&dictType.equals("dict")) {
				List<DictData> data = new ArrayList<DictData>();
				if(comboboxCache.getComboboxShownullitem()!=null&&comboboxCache.getComboboxShownullitem().equals("true")){
					DictData dictData = new DictData();
					dictData.setCode("");
					dictData.setName("请选择...");
					data.add(dictData);
				}
				List<DictData> datas2 = sysformconfigService.getCardDictDataByDictTypeCode(dictCode,"dict");
				if (datas2!=null) {
					data.addAll(datas2);
				}
				map.put("dict|"+dictCode, data);
			}else if (dictType!=null&&dictType.equals("sql")) {
				List<DictData> data = new ArrayList<DictData>();
				if(comboboxCache.getComboboxShownullitem()!=null&&comboboxCache.getComboboxShownullitem().equals("true")){
					DictData dictData = new DictData();
					dictData.setCode("");
					dictData.setName("请选择...");
					data.add(dictData);
				}
				List<DictData> datas2 = sysformconfigService.getCardDictDataByDictTypeCode(dictCode,"sql");
				if (datas2!=null) {
					data.addAll(datas2);
				}
				map.put("sql|"+dictCode, data);
			}
		}
		return map;
	}
	
}















