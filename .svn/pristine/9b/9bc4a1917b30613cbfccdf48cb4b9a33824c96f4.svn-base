package com.myehr.controller.param;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.myehr.common.mybatis.MybatisUtil;
import com.myehr.common.mybatis.Pager;
import com.myehr.controller.dict.param.ResultMapNew;
import com.myehr.controller.form.parambean.CardformInitDataParams;
import com.myehr.controller.form.parambean.SaveButtonParams;
import com.myehr.mapper.formmanage.form.SysParamsComboboxsMapper;
import com.myehr.mapper.formmanage.form.SysSqlParamsFolderTreeMapper;
import com.myehr.mapper.formmanage.form.SysSqlParamsMapper;
import com.myehr.mapper.formmanage.widget.SysFormComboboxMapper;
import com.myehr.mapper.formmanage.widget.SysFormDatepickerMapper;
import com.myehr.mapper.formmanage.widget.SysFormTextboxMapper;
import com.myehr.pojo.formmanage.form.SysParamsComboboxs;
import com.myehr.pojo.formmanage.form.SysParamsComboboxsExample;
import com.myehr.pojo.formmanage.form.SysSqlParams;
import com.myehr.pojo.formmanage.form.SysSqlParamsExample;
import com.myehr.pojo.formmanage.form.SysSqlParamsFolderTree;
import com.myehr.pojo.formmanage.form.SysSqlParamsFolderTreeExample;
import com.myehr.pojo.formmanage.widget.SysFormCombobox;
import com.myehr.pojo.formmanage.widget.SysFormComboboxExample;
import com.myehr.pojo.formmanage.widget.SysFormDatepicker;
import com.myehr.pojo.formmanage.widget.SysFormDatepickerExample;
import com.myehr.pojo.formmanage.widget.SysFormTextbox;
import com.myehr.pojo.formmanage.widget.SysFormTextboxExample;
import com.myehr.service.primaryKey.PrimaryKeyService;
import com.myehr.test.dao.TMapperExt;

@Controller
@RequestMapping("/param")
public class ParamController {

	@Autowired
	private SysSqlParamsFolderTreeMapper sysSqlParamsFolderTreeMapper;
	
	@Autowired
	private SysSqlParamsMapper sysSqlParamsMapper;
	
	@Autowired
	private SysFormTextboxMapper textboxMapper;
	
	@Autowired
	private SysFormDatepickerMapper datepickerMapper;
	
	@Autowired
	private SysFormComboboxMapper comboboxMapper;
	
//	@Autowired
	@Resource(name = "TMapperExt")
	private TMapperExt tMapperExt;
//	@Autowired
	@Resource(name = "PrimaryKeyService")
	private PrimaryKeyService keyserviceImpl;
	@Autowired
	private SysParamsComboboxsMapper paramsMapper;
	
	/**
	 * 构建参数树
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/buildParamTree")
	public @ResponseBody List<Map> buildParamTree(HttpServletRequest request) throws Exception{
		List<Map> results = new ArrayList<Map>();
		
		SysSqlParamsFolderTreeExample example = new SysSqlParamsFolderTreeExample();
		com.myehr.pojo.formmanage.form.SysSqlParamsFolderTreeExample.Criteria criteria = example.createCriteria();
		List<SysSqlParamsFolderTree> paramspTree = sysSqlParamsFolderTreeMapper.selectByExample(example);
		
		
		Map mapRoot=new HashMap();
		mapRoot.put("expanded", false);
		mapRoot.put("isLeaf", false);
		mapRoot.put("isParent", false); 
		mapRoot.put("open", false); 
		mapRoot.put("nodeId", "root");
		mapRoot.put("nodeName", "参数目录树");
		mapRoot.put("nodeCode", "root");
		mapRoot.put("nodeDesc", "参数目录树");
		mapRoot.put("nodeType", "N");
		mapRoot.put("parentCode", "Default");
		mapRoot.put("ORG_DEL", "N");
		results.add(mapRoot);
		
		for (int i = 0; i < paramspTree.size(); i++) {
			String parentCode="";
			if (paramspTree.get(i).getFolderTreeParentId()==null) {
				parentCode = "root";
			}else{
				parentCode = paramspTree.get(i).getFolderTreeParentId()+"";
			}
			Map map=new HashMap();
			map.put("expanded", false);
			map.put("isLeaf", false);
			map.put("isParent", false); 
			map.put("open", false);
			map.put("nodeId", paramspTree.get(i).getFolderTreeId());
			map.put("nodeName", paramspTree.get(i).getFolderTreeName());
			map.put("nodeCode", paramspTree.get(i).getFolderTreeCode());
			map.put("nodeDesc", paramspTree.get(i).getFolderTreeDesc());
			map.put("nodeType", "N");
			map.put("parentCode", parentCode);
			results.add(map); 
		}
		
		return results;
	}
	
	/**
	 * 构建参数树
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/buildParamTreeAll")
	public @ResponseBody List<Map> buildParamTreeAll(HttpServletRequest request) throws Exception{
		List<Map> results = new ArrayList<Map>();
		
		SysSqlParamsFolderTreeExample example = new SysSqlParamsFolderTreeExample();
		com.myehr.pojo.formmanage.form.SysSqlParamsFolderTreeExample.Criteria criteria = example.createCriteria();
		List<SysSqlParamsFolderTree> paramspTree = sysSqlParamsFolderTreeMapper.selectByExample(example);
		
		SysSqlParamsExample example1 = new SysSqlParamsExample();
		com.myehr.pojo.formmanage.form.SysSqlParamsExample.Criteria criteria1 = example1.createCriteria();
		List<SysSqlParams> params = sysSqlParamsMapper.selectByExample(example1);
		
		
		Map mapRoot=new HashMap();
		mapRoot.put("expanded", false);
		mapRoot.put("isLeaf", false);
		mapRoot.put("isParent", false); 
		mapRoot.put("open", false); 
		mapRoot.put("nodeId", "root");
		mapRoot.put("nodeName", "参数目录树");
		mapRoot.put("name", "参数目录树");
		mapRoot.put("nodeCode", "root");
		mapRoot.put("nodeDesc", "参数目录树");
		mapRoot.put("nodeType", "N");
		mapRoot.put("parentCode", "Default");
		mapRoot.put("ORG_DEL", "N");
		results.add(mapRoot);
		
		for (int i = 0; i < paramspTree.size(); i++) {
			String parentCode="";
			if (paramspTree.get(i).getFolderTreeParentId()==null) {
				parentCode = "root";
			}else{
				parentCode = paramspTree.get(i).getFolderTreeParentId()+"";
			}
			Map map=new HashMap();
			map.put("expanded", false);
			map.put("isLeaf", false);
			map.put("isParent", false); 
			map.put("open", false);
			map.put("nodeId", paramspTree.get(i).getFolderTreeId());
			map.put("nodeName", paramspTree.get(i).getFolderTreeName());
			map.put("name", paramspTree.get(i).getFolderTreeName());
			map.put("nodeCode", paramspTree.get(i).getFolderTreeCode());
			map.put("nodeDesc", paramspTree.get(i).getFolderTreeDesc());
			map.put("nodeType", "N");
			map.put("parentCode", parentCode);
			results.add(map); 
		}
		
		for (int i = 0; i < params.size(); i++) {
			Map map=new HashMap();
			map.put("expanded", false);
			map.put("isLeaf", false);
			map.put("isParent", false); 
			map.put("open", false);
			map.put("nodeId", params.get(i).getSqlParamsId());
			map.put("nodeName", params.get(i).getSqlParamsName());
			map.put("name",  params.get(i).getSqlParamsName());
			map.put("nodeCode",  params.get(i).getSqlParamsCode());
			map.put("nodeDesc", params.get(i).getSqlParamsDesc());
			map.put("nodeType", "N");
			map.put("parentCode", params.get(i).getSqlParamsFolderId());
			results.add(map); 
		}
		
		return results;
	}
	
	@RequestMapping("/addSqlParamsFolder")
	public @ResponseBody String addSqlParamsFolder(HttpServletRequest request,@RequestBody SysSqlParamsFolderTree folderTree) throws Exception{
		String reCode = "0";
		SysSqlParamsFolderTreeExample example = new SysSqlParamsFolderTreeExample();
		String userId = (String)(request.getSession().getAttribute("userid")+"");
		example.or().andFolderTreeCodeEqualTo(folderTree.getFolderTreeCode());
		if (folderTree.getFolderTreeId()!=null) {
			List<SysSqlParamsFolderTree> fList = sysSqlParamsFolderTreeMapper.selectByExample(example);
			if (fList.size()>0&&folderTree.getFolderTreeId().toString().equals(fList.get(0).getFolderTreeId().toString())) {
				fList.get(0).setFolderTreeCode(folderTree.getFolderTreeCode());
				fList.get(0).setFolderTreeName(folderTree.getFolderTreeName());
				fList.get(0).setFolderTreeDesc(folderTree.getFolderTreeDesc());
				fList.get(0).setOperatorName(userId);
				fList.get(0).setOperatorTime(new Date());
				sysSqlParamsFolderTreeMapper.updateByPrimaryKey(fList.get(0));
				return reCode;
			} else if (fList.size()==0) {
				SysSqlParamsFolderTree folderTree2 = sysSqlParamsFolderTreeMapper.selectByPrimaryKey(folderTree.getFolderTreeId());
				folderTree2.setFolderTreeCode(folderTree.getFolderTreeCode());
				folderTree2.setFolderTreeName(folderTree.getFolderTreeName());
				folderTree2.setFolderTreeDesc(folderTree.getFolderTreeDesc());
				folderTree2.setOperatorName(userId);
				folderTree2.setOperatorTime(new Date());
				sysSqlParamsFolderTreeMapper.updateByPrimaryKey(folderTree2);
				return reCode;
			} else {
				return "1";//树节点编码重复
			}
		} else {
			if(sysSqlParamsFolderTreeMapper.selectByExample(example).size()>0){
				return "1";//树节点编码重复
			}else {
				folderTree.setOperatorName(userId);
				folderTree.setOperatorTime(new Date());
				sysSqlParamsFolderTreeMapper.insert(folderTree);
				SysSqlParamsFolderTree folderTree2 = sysSqlParamsFolderTreeMapper.selectByExample(example).get(0);
				folderTree2.setFolderTreeSeq(folderTree2.getFolderTreeId()+".");
				sysSqlParamsFolderTreeMapper.updateByPrimaryKey(folderTree2);
				return reCode;
			}
		}
	}
	
	
	//删除树节点
	@RequestMapping("/deleteSqlParamsFolder")
	public @ResponseBody String deleteSqlParamsFolder(HttpServletRequest request) throws Exception{
		String reCode = "0";
		String folderTreeId = request.getParameter("folderTreeId");
		sysSqlParamsFolderTreeMapper.deleteByPrimaryKey(new BigDecimal(folderTreeId));
		return reCode;
	}
	
	@RequestMapping("/queryParamList")
	public @ResponseBody ResultMapNew queryParamList(HttpServletRequest request, @RequestBody CardformInitDataParams params) throws Exception{
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
		
		String nodeId = (String) requestParam.get("nodeId");
		String wheres="";
		if (nodeId!=null && nodeId!="") {
			wheres += " and sys_sql_params.SQL_PARAMS_FOLDER_ID = "+nodeId;
		}
		String searchValue = (String) filter.get("searchValue");
		if (searchValue!=null && searchValue!="") {
			wheres += " and ( sys_sql_params.SQL_PARAMS_NAME like "+" '%"+searchValue+"%' "+
					  "or sys_sql_params.SQL_PARAMS_CODE like "+" '%"+searchValue+"%' )";
		}
		
		String sql = "select sys_sql_params.SQL_PARAMS_ID as sqlParamsId, "+
					 " sys_sql_params.SQL_PARAMS_CODE as sqlParamsCode, "+
					 " sys_sql_params.SQL_PARAMS_NAME as sqlParamsName, "+
					 " sys_sql_params.SQL_PARAMS_TYPE as sqlParamsType, "+
					 " sys_sql_params.SQL_PARAMS_FOLDER_ID as sqlParamsFolderId, "+
					 " sys_sql_params.SQL_PARAMS_DATA_TYPE as sqlParamsDataType, "+
					 " sys_sql_params.SQL_PARAMS_DESC as sqlParamsDesc, "+
					 " sys_sql_params.SQL_PARAM_SCHEMA_ID as sqlParamSchemaId, "+
					 " sys_sql_params.OPERATOR_NAME as operatorName, "+
					 " sys_sql_params.OPERATOR_TIME as operatorTime, "+
					 " sys_sql_params.SQL_PARAMS_GUI_TYPE as sqlParamsGuiType, "+
					 " sys_sql_params.SQL_PARAMS_VALUE as sqlParamsValue, "+
					 " sys_sql_params.SQL_PARAMS_IS_REQUIRED as sqlParamsIsRequired "+
                     " from sys_sql_params "+
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
	
	@RequestMapping("/querySqlParamsById")
	public @ResponseBody SysSqlParams querySqlParamsById(HttpServletRequest request) throws Exception{
		String sqlParamsId = request.getParameter("sqlParamsId");
		
		SysSqlParamsExample example = new SysSqlParamsExample();
		com.myehr.pojo.formmanage.form.SysSqlParamsExample.Criteria criteria = example.createCriteria();
		criteria.andSqlParamsIdEqualTo(new BigDecimal(sqlParamsId));
		List<SysSqlParams> sysSqlParams = sysSqlParamsMapper.selectByExample(example);
		if (sysSqlParams.size()>0) {
			return sysSqlParams.get(0);
		}
		return null;
	}
	
	@RequestMapping("/saveSqlParam")
	public @ResponseBody String saveSqlParam(HttpServletRequest request, @RequestBody SaveButtonParams params) throws Exception{
		String menuJson = "";
		
		Map param = params.getParam();
		Map paramsMap = params.getParamsMap();
		int reCode = 0;
		
		String sqlParamsId = (String) param.get("sqlParamsId");
		String sqlParamsFolderId = (String) param.get("sqlParamsFolderId");
		SysSqlParams sqlParam = new SysSqlParams();
		if (sqlParamsId==null || sqlParamsId=="") {
			sqlParam.setSqlParamsFolderId(new BigDecimal(sqlParamsFolderId));
			sqlParam.setSqlParamsCode((String) param.get("sqlParamsCode"));
			sqlParam.setSqlParamsName((String) param.get("sqlParamsName"));
			sqlParam.setSqlParamsType((String) param.get("sqlParamsType"));
			sqlParam.setSqlParamsDataType((String) param.get("sqlParamsDataType"));
			sqlParam.setSqlParamsGuiType((String) param.get("sqlParamsGuiType"));
			sqlParam.setSqlParamsIsRequired((String) param.get("sqlParamsIsRequired"));
			sqlParam.setSqlParamsDesc((String) param.get("sqlParamsDesc"));
			sqlParam.setOperatorName((String) paramsMap.get("userId"));
			sqlParam.setOperatorTime(new Date());
			reCode = sysSqlParamsMapper.insert(sqlParam);
		}else {
			sqlParam.setSqlParamsId(new BigDecimal(sqlParamsId));
			sqlParam.setSqlParamsFolderId(new BigDecimal(sqlParamsFolderId));
			sqlParam.setSqlParamsCode((String) param.get("sqlParamsCode"));
			sqlParam.setSqlParamsName((String) param.get("sqlParamsName"));
			sqlParam.setSqlParamsType((String) param.get("sqlParamsType"));
			sqlParam.setSqlParamsDataType((String) param.get("sqlParamsDataType"));
			sqlParam.setSqlParamsGuiType((String) param.get("sqlParamsGuiType"));
			sqlParam.setSqlParamsIsRequired((String) param.get("sqlParamsIsRequired"));
			sqlParam.setSqlParamsDesc((String) param.get("sqlParamsDesc"));
			sqlParam.setOperatorName((String) paramsMap.get("userId"));
			sqlParam.setOperatorTime(new Date());
			reCode = sysSqlParamsMapper.updateByPrimaryKey(sqlParam);
		}
		
		return menuJson;
	}
	
	@RequestMapping("/deleteSqlParam")
	public @ResponseBody String deleteSqlParam(HttpServletRequest request) throws Exception{
		String reCode = "";
		
		String sqlParamsId = request.getParameter("sqlParamsId");
		String[] sqlParamsIds = sqlParamsId.split(",");
		for (int i = 0; i < sqlParamsIds.length; i++) {
			reCode = sysSqlParamsMapper.deleteByPrimaryKey(new BigDecimal(sqlParamsIds[i]))+"";
		}	
		return reCode;
	}
	
	@RequestMapping("/queryTextInfoParamsById")
	public @ResponseBody SysFormTextbox queryTextInfoParamsById(HttpServletRequest request) throws Exception{
		String sqlParamsId = request.getParameter("sqlParamsId");
		
		
		SysFormTextboxExample example = new SysFormTextboxExample();
		com.myehr.pojo.formmanage.widget.SysFormTextboxExample.Criteria criteria = example.createCriteria();
		criteria.andTextboxFormColumnIdEqualTo(new BigDecimal(sqlParamsId));
		List<SysFormTextbox> sysFormTextbox = textboxMapper.selectByExample(example);
		if (sysFormTextbox.size()>0) {
			return sysFormTextbox.get(0);
		}
		return null;
	}
	
	@RequestMapping("/saveTextInfoParams")
	public @ResponseBody String saveTextInfoParams(HttpServletRequest request, @RequestBody SaveButtonParams params) throws Exception{
		String menuJson = "";
		
		Map param = params.getParam();
		Map paramsMap = params.getParamsMap();
		int reCode = 0;
		
		String textboxId = (String) param.get("textboxId");
		SysFormTextbox textbox = new SysFormTextbox();
		if (textboxId==null || textboxId=="") {
			textbox.setTextboxFormColumnId(new BigDecimal((String) param.get("textboxFormColumnId")));
			textbox.setTextboxCheckType((String) param.get("textboxCheckType"));
			textbox.setTextboxCheckSelf((String) param.get("textboxCheckSelf"));
			textbox.setTextboxDataFromType((String) param.get("textboxDataFromType"));
			textbox.setTextboxDataFromValue((String) param.get("textboxDataFromValue"));
			textbox.setTextboxValuechangeFun((String) param.get("textboxValuechangeFun"));
			textbox.setTextboxClickFun((String) param.get("textboxClickFun"));
			textbox.setOperatorName((String) paramsMap.get("userId"));
			textbox.setOperatorTime(new Date());
			reCode = textboxMapper.insert(textbox);
		}else {
			textbox.setTextboxId(new BigDecimal((String) param.get("textboxId")));
			textbox.setTextboxFormColumnId(new BigDecimal((String) param.get("textboxFormColumnId")));
			textbox.setTextboxCheckType((String) param.get("textboxCheckType"));
			textbox.setTextboxCheckSelf((String) param.get("textboxCheckSelf"));
			textbox.setTextboxDataFromType((String) param.get("textboxDataFromType"));
			textbox.setTextboxDataFromValue((String) param.get("textboxDataFromValue"));
			textbox.setTextboxValuechangeFun((String) param.get("textboxValuechangeFun"));
			textbox.setTextboxClickFun((String) param.get("textboxClickFun"));
			textbox.setOperatorName((String) paramsMap.get("userId"));
			textbox.setOperatorTime(new Date());
			reCode = textboxMapper.updateByPrimaryKey(textbox);
		}
		
		return menuJson;
	}
	
	@RequestMapping("/queryDatepickerInfoParamsById")
	public @ResponseBody SysFormDatepicker queryDatepickerInfoParamsById(HttpServletRequest request) throws Exception{
		String sqlParamsId = request.getParameter("sqlParamsId");
		
		
		SysFormDatepickerExample example = new SysFormDatepickerExample();
		com.myehr.pojo.formmanage.widget.SysFormDatepickerExample.Criteria criteria = example.createCriteria();
		criteria.andDatepickerFormColumnIdEqualTo(new BigDecimal(sqlParamsId));
		List<SysFormDatepicker> datepicker = datepickerMapper.selectByExample(example);
		if (datepicker.size()>0) {
			return datepicker.get(0);
		}
		return null;
	}
	
	@RequestMapping("/saveDatepickerInfoParams")
	public @ResponseBody String saveDatepickerInfoParams(HttpServletRequest request, @RequestBody SaveButtonParams params) throws Exception{
		String menuJson = "";
		
		Map param = params.getParam();
		Map paramsMap = params.getParamsMap();
		int reCode = 0;
		
		String datepickerId = (String) param.get("datepickerId");
		SysFormDatepicker datepicker = new SysFormDatepicker();
		if (datepickerId==null || datepickerId=="") {
			datepicker.setDatepickerFormColumnId(new BigDecimal((String) param.get("datepickerFormColumnId")));
			datepicker.setDatepickerDataFromType((String) param.get("datepickerDataFromType"));
			datepicker.setDatepickerDataFromValue((String) param.get("datepickerDataFromValue"));
			datepicker.setDatepickerFormat((String) param.get("datepickerFormat"));
			datepicker.setDatepickerTimeformat((String) param.get("datepickerTimeformat"));
			datepicker.setDatepickerAllowinput((String) param.get("datepickerAllowinput"));
			datepicker.setDatepickerShowtime((String) param.get("datepickerShowtime"));
			datepicker.setDatepickerShowokbutton((String) param.get("datepickerShowokbutton"));
			datepicker.setDatepickerShowclearbutton((String) param.get("datepickerShowclearbutton"));
			datepicker.setDatepickerShowtodaybutton((String) param.get("datepickerShowtodaybutton"));
			datepicker.setDatepickerValuechangeFun((String) param.get("datepickerValuechangeFun"));
			datepicker.setDatepickerClickFun((String) param.get("datepickerClickFun"));
			datepicker.setDatepickerDrawdateFun((String) param.get("datepickerDrawdateFun"));
			datepicker.setOperatorName((String) paramsMap.get("userId"));
			datepicker.setOperatorTime(new Date());
			reCode = datepickerMapper.insert(datepicker);
		}else {
			datepicker.setDatepickerId(new BigDecimal(datepickerId));
			datepicker.setDatepickerFormColumnId(new BigDecimal((String) param.get("datepickerFormColumnId")));
			datepicker.setDatepickerDataFromType((String) param.get("datepickerDataFromType"));
			datepicker.setDatepickerDataFromValue((String) param.get("datepickerDataFromValue"));
			datepicker.setDatepickerFormat((String) param.get("datepickerFormat"));
			datepicker.setDatepickerTimeformat((String) param.get("datepickerTimeformat"));
			datepicker.setDatepickerAllowinput((String) param.get("datepickerAllowinput"));
			datepicker.setDatepickerShowtime((String) param.get("datepickerShowtime"));
			datepicker.setDatepickerShowokbutton((String) param.get("datepickerShowokbutton"));
			datepicker.setDatepickerShowclearbutton((String) param.get("datepickerShowclearbutton"));
			datepicker.setDatepickerShowtodaybutton((String) param.get("datepickerShowtodaybutton"));
			datepicker.setDatepickerValuechangeFun((String) param.get("datepickerValuechangeFun"));
			datepicker.setDatepickerClickFun((String) param.get("datepickerClickFun"));
			datepicker.setDatepickerDrawdateFun((String) param.get("datepickerDrawdateFun"));
			datepicker.setOperatorName((String) paramsMap.get("userId"));
			datepicker.setOperatorTime(new Date());
			reCode = datepickerMapper.updateByPrimaryKey(datepicker);
		}
		
		return menuJson;
	}
	
	
	@RequestMapping("/queryComboboxInfoParamsById")
	public @ResponseBody SysParamsComboboxs queryComboboxInfoParamsById(HttpServletRequest request) throws Exception{
		String sqlParamsId = request.getParameter("sqlParamsId");
    	SysParamsComboboxsExample example=new SysParamsComboboxsExample();
    	
	//	SysFormComboboxExample example = new SysFormComboboxExample();
    	example.or().andSqlParamsIdEqualTo(new BigDecimal(sqlParamsId));
    	List<SysParamsComboboxs> combobox=paramsMapper.selectByExample(example);
	//	com.myehr.pojo.formmanage.widget.SysFormComboboxExample.Criteria criteria = example.createCriteria();
	//	criteria.andComboboxFormColumnIdEqualTo(new BigDecimal(sqlParamsId));
		//List<SysFormCombobox> combobox = comboboxMapper.selectByExample(example);
	/*	for(int i=0;i<combobox.size();i++){
			 String value=combobox.get(i).getComboboxGuiInitValue();
			 if(value!=""){
				 String sql="select DICT_TYPE_NAME from SYS_DICT_TYPE where DICT_TYPE_CODE='"+value+"'";
				    Map map=MybatisUtil.queryOne("runtime.selectSql", sql);
				    String a=map.get("DICT_TYPE_NAME")+"";
				    combobox.get(0).setComboboxIsSearch(a);
				}
		}*/
		
	   String value=combobox.get(0).getComboboxGuiInitValue();
	   String sql="select DICT_TYPE_NAME from SYS_DICT_TYPE where DICT_TYPE_CODE='"+value+"'";
	    Map map=MybatisUtil.queryOne("runtime.selectSql", sql);
	    String a=map.get("DICT_TYPE_NAME")+"";
	    combobox.get(0).setComboboxIsSearch(a);
	    System.out.println(value);
	    
		if (combobox.size()>0) {
			return combobox.get(0);
		}
		return null;
	}
	
	@RequestMapping("/saveComboboxInfoParams")
	public @ResponseBody String saveComboboxInfoParams(HttpServletRequest request, @RequestBody SaveButtonParams params) throws Exception{
        String menuJson = "";
		
		Map param = params.getParam();
		Map paramsMap = params.getParamsMap();
		int reCode = 0;
		
		String comboboxId = (String) param.get("comboboxId");
		SysParamsComboboxs combobox=new SysParamsComboboxs();
	//	SysFormCombobox combobox = new SysFormCombobox();
		if (comboboxId==null || comboboxId=="") {
			int primarykey = keyserviceImpl.getMaxId("SYS_FORM_COMBOBOX", "COMBOBOX_ID");
			combobox.setComboboxId(new BigDecimal(primarykey));
			combobox.setSqlParamsId(new BigDecimal((String) param.get("comboboxFormColumnId")));
		//	setcomboboxsqlParamsId(new BigDecimal((String) param.get("comboboxFormColumnId")));
			//combobox.setComboboxFormColumnId(new BigDecimal((String) param.get("comboboxFormColumnId")));
			combobox.setComboboxGuiInitType((String) param.get("comboboxGuiInitType"));
			combobox.setComboboxGuiInitValue((String) param.get("comboboxDict"));
			combobox.setComboboxDataFromType((String) param.get("comboboxDataFromType"));
			combobox.setComboboxDataFromValue((String) param.get("comboboxDataFromValue"));
			combobox.setComboboxTextfield((String) param.get("comboboxTextfield"));
			combobox.setComboboxValuefield((String) param.get("comboboxValuefield"));
			combobox.setComboboxDatafield((String) param.get("comboboxDatafield"));
			combobox.setComboboxEmptytext((String) param.get("comboboxEmptytext"));
			combobox.setComboboxNullitemtext((String) param.get("comboboxNullitemtext"));
			combobox.setComboboxAllowinput((String) param.get("comboboxAllowinput"));
			combobox.setComboboxShownullitem((String) param.get("comboboxShownullitem"));
			combobox.setComboboxMultiselect((String) param.get("comboboxMultiselect"));
			combobox.setComboboxValuechangeFun((String) param.get("comboboxValuechangeFun"));
			combobox.setComboboxClickFun((String) param.get("comboboxClickFun"));
			combobox.setOperatorName((String) paramsMap.get("userId"));
			combobox.setOperatorTime(new Date());
			reCode = paramsMapper.insert(combobox);
		}else {
			combobox.setComboboxId(new BigDecimal(comboboxId));
			combobox.setSqlParamsId(new BigDecimal((String) param.get("comboboxFormColumnId")));
			//combobox.setComboboxFormColumnId(new BigDecimal((String) param.get("comboboxFormColumnId")));
			combobox.setComboboxGuiInitType((String) param.get("comboboxGuiInitType"));
			combobox.setComboboxGuiInitValue((String) param.get("comboboxDict"));
			combobox.setComboboxDataFromType((String) param.get("comboboxDataFromType"));
			combobox.setComboboxDataFromValue((String) param.get("comboboxDataFromValue"));
			combobox.setComboboxTextfield((String) param.get("comboboxTextfield"));
			combobox.setComboboxValuefield((String) param.get("comboboxValuefield"));
			combobox.setComboboxDatafield((String) param.get("comboboxDatafield"));
			combobox.setComboboxEmptytext((String) param.get("comboboxEmptytext"));
			combobox.setComboboxNullitemtext((String) param.get("comboboxNullitemtext"));
			combobox.setComboboxAllowinput((String) param.get("comboboxAllowinput"));
			combobox.setComboboxShownullitem((String) param.get("comboboxShownullitem"));
			combobox.setComboboxMultiselect((String) param.get("comboboxMultiselect"));
			combobox.setComboboxValuechangeFun((String) param.get("comboboxValuechangeFun"));
			combobox.setComboboxClickFun((String) param.get("comboboxClickFun"));
			combobox.setOperatorName((String) paramsMap.get("userId"));
			combobox.setOperatorTime(new Date());
			reCode = paramsMapper.updateByPrimaryKey(combobox);
		}
		
		return menuJson;
	}
}
