package com.myehr.controller.dict;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import net.sf.json.JSONObject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.myehr.common.mybatis.Pager;
import com.myehr.common.util.GetRequestJsonUtils;
import com.myehr.common.util.ResultMap;
import com.myehr.controller.dict.param.ResultMapNew;
import com.myehr.controller.form.parambean.CardformInitDataParams;
import com.myehr.controller.form.parambean.SaveButtonParams;
import com.myehr.mapper.formmanage.button.SysFormButtonExportColumnMapper;
import com.myehr.mapper.formmanage.button.SysFormButtonImportColumnMapper;
import com.myehr.mapper.formmanage.form.SysUserDictMapper;
import com.myehr.mapper.sysdict.SysDictEntryMapper;
import com.myehr.mapper.sysdict.SysDictTypeMapper;
import com.myehr.pojo.dict.SysDictEntry;
import com.myehr.pojo.dict.SysDictEntryExample;
import com.myehr.pojo.dict.SysDictType;
import com.myehr.pojo.dict.SysDictTypeExample;
import com.myehr.pojo.formmanage.button.SysFormButtonExportColumn;
import com.myehr.pojo.formmanage.button.SysFormButtonExportColumnExample;
import com.myehr.pojo.formmanage.button.SysFormButtonImportColumn;
import com.myehr.pojo.formmanage.button.SysFormButtonImportColumnExample;
import com.myehr.pojo.formmanage.form.SysUserDict;
import com.myehr.pojo.formmanage.form.SysUserDictExample;
import com.myehr.service.impl.formmanage.form.SysformconfigService;
import com.myehr.service.primaryKey.PrimaryKeyService;
import com.myehr.service.sysdict.SysDictTypeService;
import com.myehr.test.dao.TMapperExt;

@Controller
@RequestMapping("/dictType")
public class DictTypeController {
	private static Logger logger = LoggerFactory.getLogger(DictTypeController.class);
//	@Autowired
	@Resource(name = "SysDictTypeService")  
	private SysDictTypeService serviceImpl;
	
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
	private SysFormButtonImportColumnMapper sysFormButtonImportColumn;
	
	@Autowired
	private SysFormButtonExportColumnMapper sysFormButtonExportColumnMapper;
	@Autowired
	private SysformconfigService sysformconfigService;
	
	
//	@Autowired
	@Resource(name = "TMapperExt")
	private TMapperExt tMapperExt;
	
	@RequestMapping("/findSysDictTypeList")
	public @ResponseBody ResultMap findSysDictEntryById(HttpServletRequest request) throws Exception{
		SysDictTypeExample sExample=(SysDictTypeExample) JSONObject.toBean(GetRequestJsonUtils.getJsonObject(request), SysDictTypeExample.class);
		ResultMap resultMap=new ResultMap();
		resultMap=serviceImpl.findSysDictTypeAll(sExample);
		return resultMap;
	}
	
	/**
	 * 更新数据字典类
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/saveSysDictType")
	public @ResponseBody String saveSysDictEntry(HttpServletRequest request) throws Exception{
        SysDictType dict = (SysDictType) JSONObject.toBean(GetRequestJsonUtils.getJsonObject(request), SysDictType.class);  
        dict.setOperatorTime(new Date());
        String reCode = serviceImpl.updateSysDictType(dict);
        return reCode;
    }
	
	/**
	 * 删除数据字典类，先逻辑删除，后物理删除
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/removeSysDictType")
	public @ResponseBody Object removeSysDictType(HttpServletRequest request) throws Exception{
		SysDictType dict = (SysDictType) JSONObject.toBean(GetRequestJsonUtils.getJsonObject(request), SysDictType.class); 
		String deleteMark= dict.getDeleteMark();
		String reCode;
		if (deleteMark.equals("N")) {
			dict.setDeleteMark("Y");
			reCode = serviceImpl.updateSysDictType(dict);
		}else {
			reCode = serviceImpl.deleteSysDictType(dict);
		}
        
        return reCode;
    }
	
	/**
	 * 恢复逻辑删除的字典类
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/recoverSysDictType")
	public @ResponseBody String recoverSysDictType(HttpServletRequest request) throws Exception{
		SysDictType dict = (SysDictType) JSONObject.toBean(GetRequestJsonUtils.getJsonObject(request), SysDictType.class); 
		String deleteMark= dict.getDeleteMark();
		String reCode="";
		if (deleteMark.equals("Y")) {
			dict.setDeleteMark("N");
			dict.setDeleteMarkBack("Y");
			reCode = serviceImpl.updateSysDictType(dict);
		}
        
        return reCode;
    }
	
	/**
	 * 新增数据字典类
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/insertSysDictType")
	public @ResponseBody Object insertSysDictEntry(HttpServletRequest request) throws Exception{
		
		SysDictType dict = (SysDictType) JSONObject.toBean(GetRequestJsonUtils.getJsonObject(request), SysDictType.class);
		dict.setDictTypeId(keyserviceImpl.getPrimaryKey("sys_dict_type", "DICT_TYPE_ID"));
		dict.setDeleteMark("N");
		dict.setOperatorTime(new Date());
		String reCode = serviceImpl.insertSysDictType(dict);
        return reCode;
    }


	@RequestMapping("/searchSysDictTypeList")
	public @ResponseBody ResultMap searchSysDictEntryList(HttpServletRequest request) throws Exception{
		SysDictType dict = (SysDictType) JSONObject.toBean(GetRequestJsonUtils.getJsonObject(request), SysDictType.class);
		ResultMap resultMap=serviceImpl.searchDictTypeList(dict.getDeleteMark());
		return resultMap;
	}
	
	/**
	 * 查询逻辑删除的字典类
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/searchByDeleteMark")
	public @ResponseBody ResultMap searchByDeleteMark(HttpServletRequest request) throws Exception{
		SysDictType dict = (SysDictType) JSONObject.toBean(GetRequestJsonUtils.getJsonObject(request), SysDictType.class);
		ResultMap resultMap=serviceImpl.searchByDeleteMark(dict.getDeleteMark());
		return resultMap;
	}
	
	/**
	 * 通过ID查找数据字典类
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/searchSysDictDypeById")
	public @ResponseBody SysDictType searchSysDictDypeById(HttpServletRequest request) throws Exception{
		SysDictType dict = (SysDictType) JSONObject.toBean(GetRequestJsonUtils.getJsonObject(request), SysDictType.class);
		SysDictType dictType=serviceImpl.findSysDictTypeById(dict.getDictTypeId());
		return dictType;
	}
	
	/**
	 * 查看数据字典类列表
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/findDictTypeList2")
	public @ResponseBody ResultMap findSysUserList2(HttpServletRequest request) throws Exception {
		try {  
			return serviceImpl.getAllDictTypeList(request);  
		} catch (Exception e) {  
			e.printStackTrace();logger.error(e.getMessage(),e);  
		}  
		return null; 
	}
	
	/**
	 * 构建字典树
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/buildDictTree")
	public @ResponseBody List<Map> buildDictTree(HttpServletRequest request) throws Exception{
		List<Map> results = new ArrayList<Map>();
		
		SysDictTypeExample example = new SysDictTypeExample();
		com.myehr.pojo.dict.SysDictTypeExample.Criteria criteria = example.createCriteria();
		List<SysDictType> dictTypes = sysDictTypeMapper.selectByExample(example);
		
		SysDictEntryExample example1 = new SysDictEntryExample();
		com.myehr.pojo.dict.SysDictEntryExample.Criteria criteria1 = example1.createCriteria();
		criteria1.andDictTypeIdIsNotNull();
		List<SysDictEntry> dictEntrys = sysDictEntryMapper.selectByExample(example1);
		
		SysDictTypeExample example3 = new SysDictTypeExample();
		com.myehr.pojo.dict.SysDictTypeExample.Criteria criteria3 = example3.createCriteria();
		criteria3.andDictTypeCodeEqualTo("SYS_DICT_CLASS");
		SysDictType dictType = sysDictTypeMapper.selectByExample(example3).get(0);
		
		SysDictEntryExample example2 = new SysDictEntryExample();
		com.myehr.pojo.dict.SysDictEntryExample.Criteria criteria2 = example2.createCriteria();
		criteria2.andDictTypeIdEqualTo(dictType.getDictTypeId());
		example2.setOrderByClause("DICT_ENTRY_SORT");
		List<SysDictEntry> dictEntrys1 = sysDictEntryMapper.selectByExample(example2);
		
		Map mapRoot=new HashMap();
		mapRoot.put("expanded", false);
		mapRoot.put("isLeaf", false);
		mapRoot.put("isParent", false); 
		mapRoot.put("open", false); 
		mapRoot.put("nodeId", "root");
		mapRoot.put("nodeName", "字典树");
		mapRoot.put("nodeCode", "root");
		mapRoot.put("nodeType", "Default");
		mapRoot.put("parentCode", "Default");
		mapRoot.put("ORG_DEL", "N");
		results.add(mapRoot);
		
		for (int i = 0; i < dictEntrys1.size(); i++) {
			if(dictEntrys1.get(i).getDictEntryCode()!=null&&!dictEntrys1.get(i).getDictEntryCode().equals("SQL")){
				if (dictEntrys1.get(i).getDictEntryName()==null) {
					logger.info(".........");
				}
				Map map=new HashMap();
				map.put("expanded", false);
				map.put("isLeaf", false);
				map.put("isParent", false); 
				map.put("open", false);
				map.put("nodeId", "dictTypeClass"+dictEntrys1.get(i).getDictEntryCode());
				map.put("dictClass", dictEntrys1.get(i).getDictEntryCode());
				map.put("nodeName", dictEntrys1.get(i).getDictEntryName());
				map.put("nodeCode", dictEntrys1.get(i).getDictEntryCode());
				map.put("nodeType", "N");
				map.put("parentCode", "root");
				results.add(map); 
			}
		}
		
		for (int i = 0; i < dictTypes.size(); i++) {
			if(dictTypes.get(i).getDictTypeClass()!=null&&!dictTypes.get(i).getDictTypeClass().equals("SQL")){
				String nodeName = dictTypes.get(i).getDictTypeName();
				if (dictTypes.get(i).getDictTypeName()==null) {
					nodeName="";
				}
				Map map=new HashMap();
				map.put("expanded", false);
				map.put("isLeaf", false);
				map.put("isParent", false); 
				map.put("open", false);
				map.put("nodeId", "dictType"+dictTypes.get(i).getDictTypeId());
				map.put("dictTypeId",dictTypes.get(i).getDictTypeId());
				map.put("nodeName", nodeName);
				map.put("nodeCode", dictTypes.get(i).getDictTypeCode());
				map.put("nodeType", "F");
				map.put("parentCode", "dictTypeClass"+dictTypes.get(i).getDictTypeClass());
				results.add(map);
			}
		}
		
		Map mapSql=new HashMap();
		mapSql.put("expanded", false);
		mapSql.put("isLeaf", false);
		mapSql.put("isParent", false); 
		mapSql.put("open", false);
		mapSql.put("nodeId", "dictTypeClassSQL");
		mapSql.put("nodeName", "下拉SQL");
		mapSql.put("nodeCode", "dictSql");
		mapSql.put("nodeType", "SQL");
		mapSql.put("parentCode", "root");
		mapSql.put("dictClass", "SQL");
		results.add(mapSql);
		
		/*for (int i = 0; i < dictEntrys.size(); i++) {
			String parentCode = "";
			if (dictEntrys.get(i).getDictParentCode()!=null &&  !dictEntrys.get(i).getDictParentCode().equals("")) {
				parentCode = "dictTypeEntry"+dictEntrys.get(i).getDictParentCode();
			}else{
				parentCode = "dictType"+dictEntrys.get(i).getDictTypeId();
			}
			Map map=new HashMap();
			map.put("expanded", false);
			map.put("isLeaf", false);
			map.put("isParent", false); 
			map.put("open", false);
			map.put("nodeId", "dictTypeEntry"+dictEntrys.get(i).getDictEntryId());
			map.put("nodeName", dictEntrys.get(i).getDictEntryName());
			map.put("nodeCode", dictEntrys.get(i).getDictEntryCode());
			map.put("nodeType", "F1");
			map.put("parentCode", parentCode);
			results.add(map);
		}*/
		return results;
	}
	
	@RequestMapping("/queryDictTypeList")
	public @ResponseBody ResultMapNew queryDictTypeList(HttpServletRequest request, @RequestBody CardformInitDataParams params) throws Exception{
		String choose=request.getParameter("id");
		//Map requestParam = params.getRequestParam();
		Map filter = params.getFilter();
		String offset = params.getOffset();
		String limit = params.getLimit();
		//Map paramsMap = params.getParamsMap();
		Pager page = params.getPage();
		page = new Pager();
		if(offset==null&&limit==null){
			
		}else {
			int start=Integer.parseInt(offset);
			page.setStart(start); //不能设置为0
			page.setLimt(Integer.parseInt(limit));
		}
		
		String dictClass = (String) filter.get("dictClass");
		String deleteMark = (String) filter.get("deleteMark");
		String wheres="";
		if (dictClass!=null && dictClass!="") {
			wheres += " and SYS_DICT_TYPE.DICT_TYPE_CLASS = '"+dictClass+"'";
		}
		String searchValue = (String) filter.get("searchValue");
		if (searchValue!=null && searchValue!="") {
			wheres += " and ( SYS_DICT_TYPE.DICT_TYPE_CODE like "+" '%"+searchValue+"%' "+
					  "or SYS_DICT_TYPE.DICT_TYPE_NAME like "+" '%"+searchValue+"%' )";
		}
		if (deleteMark!=null && deleteMark!="") {
			wheres += " and SYS_DICT_TYPE.DELETE_MARK = "+" '"+deleteMark+"' ";
		}
		if(choose!=null && choose!=""){
		if(choose.equals("sql")){
			wheres += " and ( SYS_DICT_TYPE.DICT_TYPE_CLASS like "+" '%"+choose+"%' )";
		}
		if(choose.equals("dict")){
			wheres += " and ( SYS_DICT_TYPE.DICT_TYPE_CLASS != "+" 'sql') ";
		}
		}	
		String sql = "select SYS_DICT_TYPE.DICT_TYPE_ID as dictEntryId, "+
					 " SYS_DICT_TYPE.DICT_TYPE_CODE as dictTypeCode, "+
					 " SYS_DICT_TYPE.DICT_TYPE_NAME as dictTypeName, "+
					 " SYS_DICT_TYPE.DICT_TYPE_ID as dictTypeId, "+
					 " SYS_DICT_TYPE.DICT_TYPE_REMARK as dictTypeRemark, "+
					 " SYS_DICT_TYPE.DICT_TYPE_CLASS as dictTypeClass, "+
					 " SYS_DICT_TYPE.OPERATOR_NAME as operatorName, "+
					 " SYS_DICT_TYPE.OPERATOR_TIME as operatorTime, "+
					 " SYS_DICT_TYPE.APPROVE_NAME as approveName, "+
					 " SYS_DICT_TYPE.APPROVE_TIME as approveTime, "+
					 " SYS_DICT_TYPE.DELETE_MARK as deleteMark, "+
					 " SYS_DICT_TYPE.DELETE_MARK_BACK as deleteMarkBack, "+
					 " SYS_USER.USER_NAME as userName "+
                     " from SYS_DICT_TYPE left join SYS_USER on SYS_USER.USER_ID = SYS_DICT_TYPE.OPERATOR_NAME "+
					 " where 1=1 "+wheres;
		List<Map> schemes = tMapperExt.queryByFormDefSql(sql);
		
		ResultMapNew resultMap=new ResultMapNew();
		
		List<Map> schemeList = new ArrayList<Map>();
		int end = 0;
		if (page.getStart()+page.getLimt()>schemes.size()) {
			end = schemes.size();
		}else {
			end = page.getStart()+page.getLimt();
		}
		
		for (int i = page.getStart(); i < end; i++) {
			schemeList.add(schemes.get(i));
		}

		resultMap.setTotal(schemes.size());
		resultMap.setRows(schemeList);
		return resultMap;
	}
	
	@RequestMapping("/queryDictEntryList")
	public @ResponseBody ResultMapNew queryDictEntryList(HttpServletRequest request, @RequestBody CardformInitDataParams params) throws Exception{
		Map requestParam = params.getRequestParam();
		Map filter = params.getFilter();
		String offset = params.getOffset();
		String limit = params.getLimit();
		//Map paramsMap = params.getParamsMap();
		Pager page = params.getPage();
		page = new Pager();
		if(offset==null&&limit==null){
			
		}else {
			int start=Integer.parseInt(offset);
			page.setStart(start); //不能设置为0
			page.setLimt(Integer.parseInt(limit));
		}
		
		String dictTypeId = (String) filter.get("dictTypeId");
		String nodeId = (String) filter.get("nodeId");
		//String nodeCode = (String) filter.get("nodeCode");
		String wheres="";
		if (dictTypeId!=null && dictTypeId!="") {
			wheres += " and SYS_DICT_ENTRY.DICT_TYPE_ID = "+dictTypeId+" and SYS_DICT_ENTRY.DICT_PARENT_CODE is null";
		}else {
			wheres += " and SYS_DICT_ENTRY.DICT_PARENT_CODE = "+nodeId;
		}
		String searchValue = (String) filter.get("searchValue");
		String deleteMark = (String) filter.get("deleteMark");
		if (searchValue!=null && searchValue!="") {
			wheres += " and ( SYS_DICT_ENTRY.DICT_ENTRY_CODE like "+" '%"+searchValue+"%' "+
					  "or SYS_DICT_ENTRY.DICT_ENTRY_NAME like "+" '%"+searchValue+"%' )";
		}
		
		if (deleteMark!=null && deleteMark!="" ) {
			if (deleteMark.equals("N")) {
				wheres += " and SYS_DICT_ENTRY.DELETE_MARK <> 'Y' ";
			}else {
				wheres += " and SYS_DICT_ENTRY.DELETE_MARK = 'Y' ";
			}
		}
		
		String sql = "select SYS_DICT_ENTRY.DICT_ENTRY_ID as dictEntryId, "+
					 " SYS_DICT_ENTRY.DICT_ENTRY_CODE as dictEntryCode, "+
					 " SYS_DICT_ENTRY.DICT_ENTRY_NAME as dictEntryName, "+
					 " SYS_DICT_ENTRY.DICT_TYPE_ID as dictTypeId, "+
					 " SYS_DICT_ENTRY.DICT_ENTRY_REMARK as dictEntryRemark, "+
					 " SYS_DICT_ENTRY.DICT_PARENT_CODE as dictParentCode, "+
					 " SYS_DICT_ENTRY.DICT_ENTRY_SORT as dictEntrySort, "+
					 " SYS_DICT_ENTRY.DICT_ENTRY_SEQ as dictEntrySeq, "+
					 " SYS_DICT_ENTRY.OPERATOR_NAME as operatorName, "+
					 " SYS_DICT_ENTRY.OPERATOR_TIME as operatorTime, "+
					 " SYS_DICT_ENTRY.APPROVE_NAME as approveName, "+
					 " SYS_DICT_ENTRY.APPROVE_TIME as approveTime, "+
					 " SYS_DICT_ENTRY.DELETE_MARK as deleteMark, "+
					 " SYS_DICT_ENTRY.DELETE_MARK_BACK as deleteMarkBack, "+
					 " SYS_DICT_ENTRY.DICT_ENTRY_CUSTOM1 as dictEntryCustom1, "+
					 " SYS_DICT_ENTRY.DICT_ENTRY_CUSTOM2 as dictEntryCustom2, "+
					 " SYS_DICT_ENTRY.DICT_ENTRY_CUSTOM3 as dictEntryCustom3, "+
					 " SYS_DICT_ENTRY.DICT_ENTRY_CUSTOM4 as dictEntryCustom5, "+
					 " SYS_DICT_ENTRY.DICT_ENTRY_CUSTOM5 as dictEntryCustom5, "+
					 " SYS_DICT_TYPE.DICT_TYPE_CODE as dictTypeCode, "+
					 " SYS_DICT_TYPE.DICT_TYPE_NAME as dictTypeName, "+
					 " SYS_USER.USER_NAME as userName "+
                     " from SYS_DICT_ENTRY left join SYS_USER on SYS_USER.USER_ID = SYS_DICT_ENTRY.OPERATOR_NAME "+
					 " join SYS_DICT_TYPE on SYS_DICT_ENTRY.DICT_TYPE_ID = SYS_DICT_TYPE.DICT_TYPE_ID"+
					 " where 1=1 "+wheres +" order by SYS_DICT_ENTRY.DICT_ENTRY_SORT";
		List<Map> schemes = tMapperExt.queryByFormDefSql(sql);
		
		
		ResultMapNew resultMap=new ResultMapNew();
		
		
		List<Map> schemeList = new ArrayList<Map>();
		int end = 0;
		if (page.getStart()+page.getLimt()>schemes.size()) {
			end = schemes.size();
		}else {
			end = page.getStart()+page.getLimt();
		}
		
		for (int i = page.getStart(); i < end; i++) {
			schemeList.add(schemes.get(i));
		}

		resultMap.setTotal(schemes.size());
		resultMap.setRows(schemeList);
		return resultMap;
	}
	
	
	@RequestMapping("/queryUserDictEntryList")
	public @ResponseBody ResultMapNew queryUserDictEntryList(HttpServletRequest request, @RequestBody CardformInitDataParams params) throws Exception{
		Map requestParam = params.getRequestParam();
		Map filter = params.getFilter();
		String offset = params.getOffset();
		String limit = params.getLimit();
		Map paramsMap = params.getParamsMap();
		Pager page = params.getPage();
		page = new Pager();
		if(offset==null&&limit==null){
			
		}else {
			int start=Integer.parseInt(offset);
			page.setStart(start); //不能设置为0
			page.setLimt(Integer.parseInt(limit));
		}
		String userId = (String) paramsMap.get("userId");
		String dictTypeId = (String) filter.get("dictTypeId");
		String nodeId = (String) filter.get("nodeId");
		//String nodeCode = (String) filter.get("nodeCode");
		String wheres="";
		if (dictTypeId!=null && dictTypeId!="") {
			wheres += " and SYS_DICT_ENTRY.DICT_TYPE_ID = "+dictTypeId+" and SYS_DICT_ENTRY.DICT_PARENT_CODE is null";
		}else {
			wheres += " and SYS_DICT_ENTRY.DICT_PARENT_CODE = "+nodeId;
		}
		String searchValue = (String) filter.get("searchValue");
		String deleteMark = (String) filter.get("deleteMark");
		if (searchValue!=null && searchValue!="") {
			wheres += " and ( SYS_DICT_ENTRY.DICT_ENTRY_CODE like "+" '%"+searchValue+"%' "+
					  "or SYS_DICT_ENTRY.DICT_ENTRY_NAME like "+" '%"+searchValue+"%' )";
		}
		
		if (deleteMark!=null && deleteMark!="" ) {
			if (deleteMark.equals("N")) {
				wheres += " and SYS_DICT_ENTRY.DELETE_MARK <> 'Y' ";
			}else {
				wheres += " and SYS_DICT_ENTRY.DELETE_MARK = 'Y' ";
			}
		}
		
		String sql = "select SYS_DICT_ENTRY.DICT_ENTRY_ID as dictEntryId, "+
					 " SYS_DICT_ENTRY.DICT_ENTRY_CODE as dictEntryCode, "+
					 " SYS_DICT_ENTRY.DICT_ENTRY_NAME as dictEntryName, "+
					 " SYS_DICT_ENTRY.DICT_TYPE_ID as dictTypeId, "+
					 " SYS_DICT_ENTRY.DICT_ENTRY_SORT as dictTypeSort, "+
					 " 1 quanxian "+
                     " from SYS_DICT_ENTRY left join SYS_USER_DICT on SYS_DICT_ENTRY.DICT_ENTRY_ID = SYS_USER_DICT.DICT_ENTRY_ID "+
					 " where SYS_USER_DICT.USER_ID = "+userId+wheres +
					 " union select SYS_DICT_ENTRY.DICT_ENTRY_ID as dictEntryId, " +
					 " SYS_DICT_ENTRY.DICT_ENTRY_CODE as dictEntryCode, "+
					 " SYS_DICT_ENTRY.DICT_ENTRY_NAME as dictEntryName, "+
					 " SYS_DICT_ENTRY.DICT_TYPE_ID as dictTypeId, "+
					 " SYS_DICT_ENTRY.DICT_ENTRY_SORT as dictTypeSort, "+
					 " 0 quanxian "+
					 " from SYS_DICT_ENTRY where SYS_DICT_ENTRY.DICT_ENTRY_ID not in (select DICT_ENTRY_ID from SYS_USER_DICT where SYS_USER_DICT.USER_ID = "+userId+" and SYS_USER_DICT.DICT_TYPE_ID = "+dictTypeId+" ) and SYS_DICT_ENTRY.DICT_TYPE_ID = "+dictTypeId+" order by dictTypeSort" ;
		List<Map> schemes = tMapperExt.queryByFormDefSql(sql);
		
		
		ResultMapNew resultMap=new ResultMapNew();
		
		
		List<Map> schemeList = new ArrayList<Map>();
		int end = 0;
		if (page.getStart()+page.getLimt()>schemes.size()) {
			end = schemes.size();
		}else {
			end = page.getStart()+page.getLimt();
		}
		
		for (int i = page.getStart(); i < end; i++) {
			schemeList.add(schemes.get(i));
		}

		resultMap.setTotal(schemes.size());
		resultMap.setRows(schemeList);
		return resultMap;
	}
	
	@RequestMapping("/saveDictType")
	public @ResponseBody String saveDictType(HttpServletRequest request, @RequestBody SaveButtonParams params) throws Exception{
		Map param = params.getParam();
		Map paramsMap = params.getParamsMap();
		int reCode = 0;
		
		String dictTypeId = (String) param.get("dictTypeId");
		String dictTypeCode = (String) param.get("dictTypeCode");
		SysDictTypeExample example = new SysDictTypeExample();
		example.or().andDictTypeCodeEqualTo(dictTypeCode);
		List<SysDictType> list = sysDictTypeMapper.selectByExample(example);

		SysDictType dictType = new SysDictType();
		if (dictTypeId==null || dictTypeId=="") {
			if (list.size()>0) {
				return "2";
			}else{
				dictType.setDictTypeCode((String) param.get("dictTypeCode"));
				dictType.setDictTypeName((String) param.get("dictTypeName"));
				dictType.setDeleteMark("N");
				dictType.setDictTypeRemark((String) param.get("dictTypeRemark"));
				dictType.setDictTypeClass((String) param.get("dictTypeClass"));
				dictType.setOperatorName((String) paramsMap.get("userId"));
				dictType.setOperatorTime(new Date());
				reCode = sysDictTypeMapper.insert(dictType);
				sysformconfigService.setCardDictDataByDictTypeCode(dictType.getDictTypeCode(),"dict");
			}
		}else {
			dictType.setDictTypeId(Integer.valueOf(dictTypeId));
			dictType.setDictTypeCode((String) param.get("dictTypeCode"));
			dictType.setDictTypeName((String) param.get("dictTypeName"));
			dictType.setDictTypeRemark((String) param.get("dictTypeRemark"));
			dictType.setDeleteMark("N");
			dictType.setDictTypeClass((String) param.get("dictTypeClass"));
			dictType.setOperatorName((String) paramsMap.get("userId"));
			dictType.setOperatorTime(new Date());
			reCode = sysDictTypeMapper.updateByPrimaryKey(dictType);
			sysformconfigService.setCardDictDataByDictTypeCode(dictType.getDictTypeCode(),"dict");
		}
		return reCode+"";
	}
	
	@RequestMapping("/saveDictTypeSql")
	public @ResponseBody int saveDictTypeSql(HttpServletRequest request, @RequestBody SysDictType dictType) throws Exception{
		String userid = request.getSession().getAttribute("userid")+"";
		if (dictType.getDictTypeId()!=null) {
			SysDictType dictType2 = sysDictTypeMapper.selectByPrimaryKey(dictType.getDictTypeId());
			dictType2.setDictTypeCode(dictType.getDictTypeCode());
			dictType2.setDictTypeName(dictType.getDictTypeName());
			dictType2.setDictTypeRemark(dictType.getDictTypeRemark());
			dictType2.setDictTypeClass(dictType.getDictTypeClass());
			dictType2.setOperatorTime(new Date());
			dictType2.setOperatorName(userid);
			return sysDictTypeMapper.updateByPrimaryKey(dictType2);
		} else {
			dictType.setOperatorName(userid);
			dictType.setOperatorTime(new Date());
			dictType.setDeleteMark("N");
			return sysDictTypeMapper.insert(dictType);
		}
	}
	
	@RequestMapping("/queryDictTypeById")
	public @ResponseBody SysDictType queryDictTypeById(HttpServletRequest request) throws Exception{
		String dictTypeId = request.getParameter("dictTypeId");
		SysDictTypeExample example = new SysDictTypeExample();
		com.myehr.pojo.dict.SysDictTypeExample.Criteria criteria = example.createCriteria();
		criteria.andDictTypeIdEqualTo(Integer.valueOf(dictTypeId));
		List<SysDictType> sysDictTypes = sysDictTypeMapper.selectByExample(example);
		if (sysDictTypes.size()>0) {
			return sysDictTypes.get(0);
		}
		return null;
	}
	
	@RequestMapping("/saveDictEntry")
	public @ResponseBody String saveDictEntry(HttpServletRequest request, @RequestBody SaveButtonParams params) throws Exception{
		String menuJson = "";
		Map param = params.getParam();
		Map paramsMap = params.getParamsMap();
		int reCode = 0;
		String dictTypeId = (String) paramsMap.get("dictTypeId");
		String dictEntryId = (String) param.get("dictEntryId");
		String nodeType = (String) paramsMap.get("nodeType");
		String nodeId = (String) paramsMap.get("nodeId");
		String dictEntryCode = (String) paramsMap.get("dictEntryCode");
		SysDictEntry dictEntry = new SysDictEntry();
		SysDictType dictType = sysDictTypeMapper.selectByPrimaryKey(Integer.valueOf(dictTypeId));
		if (dictEntryId==null || dictEntryId=="") {
			dictEntry.setDictEntryCode((String) param.get("dictEntryCode"));
			dictEntry.setDictEntryName((String) param.get("dictEntryName"));
			if(dictTypeId!=null && dictTypeId!=""){
				dictEntry.setDictTypeId(Integer.valueOf(dictTypeId));
				dictEntry.setDictEntrySeq("."+(String) param.get("dictEntryCode"));
			}
			if (nodeType!=null && nodeType.equals("F1")) {
				SysDictEntry parentEntry = new SysDictEntry();
				SysDictEntryExample example = new SysDictEntryExample();
				com.myehr.pojo.dict.SysDictEntryExample.Criteria criteria = example.createCriteria();
				criteria.andDictEntryIdEqualTo(Integer.valueOf(nodeId));
				List<SysDictEntry> sysDictEntrys = sysDictEntryMapper.selectByExample(example);
				if (sysDictEntrys.size()>0) {
					parentEntry = sysDictEntrys.get(0);
				}
				dictEntry.setDictTypeId(parentEntry.getDictTypeId());
				dictEntry.setDictEntrySeq(parentEntry.getDictEntrySeq()+"."+(String) param.get("dictEntryCode"));
				dictEntry.setDictParentCode(nodeId);
			}
			dictEntry.setDictEntryRemark((String) param.get("dictEntryRemark"));
			dictEntry.setDictEntrySort(Float.valueOf((String) param.get("dictEntrySort")));
			dictEntry.setDeleteMark("N");
			dictEntry.setDeleteMarkBack("N");
			dictEntry.setOperatorName((String) paramsMap.get("userId"));
			dictEntry.setOperatorTime(new Date());
			reCode = sysDictEntryMapper.insert(dictEntry);
			sysformconfigService.setCardDictDataByDictTypeCode(dictType.getDictTypeCode(),"dict");
			sysformconfigService.setDictEntrysByTypeCode(dictType.getDictTypeCode());
		}else {
			SysDictEntryExample example = new SysDictEntryExample();
			com.myehr.pojo.dict.SysDictEntryExample.Criteria criteria = example.createCriteria();
			criteria.andDictEntryIdEqualTo(Integer.valueOf(dictEntryId));
			List<SysDictEntry> sysDictEntrys = sysDictEntryMapper.selectByExample(example);
			if (sysDictEntrys.size()>0) {
				dictEntry = sysDictEntrys.get(0);
			}
			dictEntry.setDictEntryId(Integer.valueOf(dictEntryId));
			dictEntry.setDictEntryCode((String) param.get("dictEntryCode"));
			dictEntry.setDictEntryName((String) param.get("dictEntryName"));
			dictEntry.setDictEntryRemark((String) param.get("dictEntryRemark"));
			dictEntry.setDictEntrySort(Float.valueOf((String) param.get("dictEntrySort")));
			reCode = sysDictEntryMapper.updateByPrimaryKey(dictEntry);
			sysformconfigService.setCardDictDataByDictTypeCode(dictType.getDictTypeCode(),"dict");
			sysformconfigService.setDictEntrysByTypeCode(dictType.getDictTypeCode());
		}
		return menuJson;
	}
	
	@RequestMapping("/queryDictEntryById")
	public @ResponseBody SysDictEntry queryDictEntryById(HttpServletRequest request) throws Exception{
		String dictEntryId = request.getParameter("dictEntryId");
		
		SysDictEntryExample example = new SysDictEntryExample();
		com.myehr.pojo.dict.SysDictEntryExample.Criteria criteria = example.createCriteria();
		criteria.andDictEntryIdEqualTo(Integer.valueOf(dictEntryId));
		List<SysDictEntry> sysDictEntrys = sysDictEntryMapper.selectByExample(example);
		if (sysDictEntrys.size()>0) {
			return sysDictEntrys.get(0);
		}
		return null;
	}
	
	@RequestMapping("/deleteDictEntry")
	public @ResponseBody String deleteDictEntry(HttpServletRequest request) throws Exception{
		String reCode = "";
		String dictEntryId = request.getParameter("dictEntryId");
		String dictTypeCode = request.getParameter("dictTypeCode");
		String remark = request.getParameter("remark");
		String[] dictEntryIds = dictEntryId.split(",");
		for (int i = 0; i < dictEntryIds.length; i++) {
			SysDictEntryExample example = new SysDictEntryExample();
			com.myehr.pojo.dict.SysDictEntryExample.Criteria criteria = example.createCriteria();
			criteria.andDictEntryIdEqualTo(Integer.valueOf(dictEntryIds[i]));
			SysDictEntry sysDictEntry = sysDictEntryMapper.selectByExample(example).get(0);
			if (remark.equals("delete")) {
				if (sysDictEntry.getDeleteMark()==null || sysDictEntry.getDeleteMark().equals("N")) {
					sysDictEntry.setDeleteMark("Y");
					reCode = sysDictEntryMapper.updateByPrimaryKey(sysDictEntry)+"";
				}else {
					reCode = sysDictEntryMapper.deleteByPrimaryKey(sysDictEntry.getDictEntryId())+"";
					//删除字典项刷新缓存
					sysformconfigService.setCardDictDataByDictTypeCode(dictTypeCode,"dict");
					sysformconfigService.setDictEntrysByTypeCode(dictTypeCode);
				}
			}else{
				sysDictEntry.setDeleteMark("N");
				sysDictEntry.setDeleteMarkBack("Y");
				reCode = sysDictEntryMapper.updateByPrimaryKey(sysDictEntry)+"";
			}	
		}	
		return reCode;
	}
	
	@RequestMapping("/deleteDictType")
	public @ResponseBody String deleteDictType(HttpServletRequest request) throws Exception{
		String reCode = "";
		
		String dictTypeId = request.getParameter("dictTypeId");
		String remark = request.getParameter("remark");
		String[] dictTypeIds = dictTypeId.split(",");
		for (int i = 0; i < dictTypeIds.length; i++) {
			SysDictTypeExample example = new SysDictTypeExample();
			com.myehr.pojo.dict.SysDictTypeExample.Criteria criteria = example.createCriteria();
			criteria.andDictTypeIdEqualTo(Integer.valueOf(dictTypeIds[i]));
			SysDictType sysDictType = sysDictTypeMapper.selectByExample(example).get(0);
			if (remark.equals("delete")) {
				if (sysDictType.getDeleteMark()==null || sysDictType.getDeleteMark().equals("N")) {
					sysDictType.setDeleteMark("Y");
					reCode = sysDictTypeMapper.updateByPrimaryKey(sysDictType)+"";
				}else {
					SysDictEntryExample example1 = new SysDictEntryExample();
					com.myehr.pojo.dict.SysDictEntryExample.Criteria criteria1 = example1.createCriteria();
					criteria1.andDictTypeIdEqualTo(Integer.valueOf(dictTypeIds[i]));
					sysDictEntryMapper.deleteByExample(example1);
					reCode = sysDictTypeMapper.deleteByPrimaryKey(sysDictType.getDictTypeId())+"";
					sysformconfigService.setCardDictDataByDictTypeCode(sysDictType.getDictTypeCode(),"dict");
					sysformconfigService.setDictEntrysByTypeCode(sysDictType.getDictTypeCode());
				}
			}else{
				sysDictType.setDeleteMark("N");
				sysDictType.setDeleteMarkBack("Y");
				reCode = sysDictTypeMapper.updateByPrimaryKey(sysDictType)+"";
			}	
		}	
		return reCode;
	}
	
	@RequestMapping("/setDictTypeCache")
	public @ResponseBody String setDictTypeCache(HttpServletRequest request,@RequestBody List<SysDictType> types) throws Exception{
		String reCode = "";
		try {
			for (SysDictType sysDictType : types) {
				sysformconfigService.setCardDictDataByDictTypeId(sysDictType.getDictTypeId());
			}
			reCode = "true";
		} catch (Exception e) {
			reCode = "false";
		}
		return reCode;
	}
	
	@RequestMapping("/setDictTypeSqlCache")
	public @ResponseBody String setDictTypeSqlCache(HttpServletRequest request,@RequestBody List<SysDictType> types) throws Exception{
		String reCode = "";
		try {
			for (SysDictType sysDictType : types) {
				sysformconfigService.setCardDictDataByDictTypeCode(sysDictType.getDictTypeCode(),"sql");
			}
			reCode = "true";
		} catch (Exception e) {
			reCode = "false";
		}
		return reCode;
	}
	
	/**
	 * 保存导入按钮关联sql
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/saveImportColumnDict")
	public @ResponseBody SysFormButtonImportColumn saveImportColumnDict(HttpServletRequest request) throws Exception{
		String dictTypeCode = request.getParameter("dictTypeCode");
		String importColumnId = request.getParameter("importColumnId");
		
		SysFormButtonImportColumnExample example = new SysFormButtonImportColumnExample();
		com.myehr.pojo.formmanage.button.SysFormButtonImportColumnExample.Criteria criteria = example.createCriteria();
		criteria.andImportColumnIdEqualTo(new BigDecimal(importColumnId));
		List<SysFormButtonImportColumn> importColumns = sysFormButtonImportColumn.selectByExample(example);
		if (importColumns.size()>0) {
			SysFormButtonImportColumn importColumn =importColumns.get(0);
			importColumn.setImportColumnDictType(dictTypeCode);
			sysFormButtonImportColumn.updateByPrimaryKey(importColumn);
			return importColumn;
		}
		return null;
	}
	
	/**
	 * 保存导入按钮关联sql
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/saveExportColumnDict")
	public @ResponseBody SysFormButtonExportColumn saveExportColumnDict(HttpServletRequest request) throws Exception{
		String dictTypeCode = request.getParameter("dictTypeCode");
		String exportColumnId = request.getParameter("exportColumnId");
		
		SysFormButtonExportColumnExample example = new SysFormButtonExportColumnExample();
		com.myehr.pojo.formmanage.button.SysFormButtonExportColumnExample.Criteria criteria = example.createCriteria();
		criteria.andExportColumnIdEqualTo(new BigDecimal(exportColumnId));
		List<SysFormButtonExportColumn> exportColumns = sysFormButtonExportColumnMapper.selectByExample(example);
		if (exportColumns.size()>0) {
			SysFormButtonExportColumn exportColumn =exportColumns.get(0);
			exportColumn.setExportColumnDictType(dictTypeCode);
			sysFormButtonExportColumnMapper.updateByPrimaryKey(exportColumn);
			return exportColumn;
		}
		return null;
	}
	
	
	@RequestMapping("/saveUserDictEntry")
	public @ResponseBody String saveUserDictEntry(HttpServletRequest request) throws Exception{
		String reCode = "";
		String operatorName = request.getSession().getAttribute("userid")+"";
		
		String dictEntryId = request.getParameter("dictEntryId");
		String dictTypeId = request.getParameter("dictTypeId");
		String userId = request.getParameter("userId");
		String[] dictEntryIds = dictEntryId.split(",");
		SysUserDictExample example = new SysUserDictExample();
		com.myehr.pojo.formmanage.form.SysUserDictExample.Criteria criteria = example.createCriteria();
		criteria.andDictTypeIdEqualTo(new BigDecimal(dictTypeId));
		criteria.andUserIdEqualTo(new BigDecimal(userId));
		sysUserDictMapper.deleteByExample(example);
		for (int i = 0; i < dictEntryIds.length; i++) {
			SysUserDict userDIct = new SysUserDict();
			userDIct.setDictTypeId(new BigDecimal(dictTypeId));
			userDIct.setDictEntryId(new BigDecimal(dictEntryIds[i]));
			userDIct.setUserId(new BigDecimal(userId));
			userDIct.setOperatorName(operatorName);
			userDIct.setOperatorTime(new Date());
			sysUserDictMapper.insert(userDIct);
		}	
		return reCode;
	}
}
