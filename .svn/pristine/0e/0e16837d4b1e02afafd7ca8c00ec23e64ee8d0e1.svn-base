package com.myehr.controller.sysRole;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

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

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPoolConfig;

import com.myehr.common.mybatis.MybatisUtil;
import com.myehr.common.mybatis.Pager;
import com.myehr.common.mybatis.Pagers;
import com.myehr.common.util.ChangeCode;
import com.myehr.common.util.GetRequestJsonUtils;
import com.myehr.common.util.JedisFactory;
import com.myehr.common.util.ResultMap;
import com.myehr.common.util.ResultMapNew;
import com.myehr.common.util.SerializeUtil;
import com.myehr.controller.form.parambean.CardformInitDataParams;
import com.myehr.mapper.formmanage.form.SysActRoleMapper;
import com.myehr.mapper.formmanage.form.SysButtonRoleMapper;
import com.myehr.mapper.formmanage.form.SysFieldRoleMapper;
import com.myehr.mapper.formmanage.form.SysFileButtonRoleMapper;
import com.myehr.mapper.formmanage.form.SysFormColumnExpandMapper;
import com.myehr.mapper.formmanage.form.SysFormFolderTreeMapper;
import com.myehr.mapper.formmanage.form.SysFormconfigMapper;
import com.myehr.mapper.formmanage.form.SysUserDictMapper;
import com.myehr.mapper.formmanage.question.SysExamtemplateMapper;
import com.myehr.mapper.formmanage.question.SysQuestionMapper;
import com.myehr.mapper.sysMenuRole.SysMenuRoleMapper;
import com.myehr.mapper.sysRole.SysOrgRoleMapper;
import com.myehr.mapper.sysRole.SysRoleMapper;
import com.myehr.mapper.sysRole.SysUserOrgMapper;
import com.myehr.mapper.sysRoleExpand.SysRoleExpandMapper;
import com.myehr.mapper.sysUserRole.SysUserRoleMapper;
import com.myehr.mapper.sysdict.SysDictEntryMapper;
import com.myehr.mapper.sysdict.SysDictTypeMapper;
import com.myehr.pojo.dict.DictData;
import com.myehr.pojo.dict.SysDictEntry;
import com.myehr.pojo.dict.SysDictEntryExample;
import com.myehr.pojo.dict.SysDictType;
import com.myehr.pojo.dict.SysDictTypeExample;
import com.myehr.pojo.formmanage.cache.SysFormTreeSolutionCache;
import com.myehr.pojo.formmanage.cache.SysFormconfigCache;
import com.myehr.pojo.formmanage.cache.SysFormconfigTreeCache;
import com.myehr.pojo.formmanage.form.SysActRole;
import com.myehr.pojo.formmanage.form.SysActRoleExample;
import com.myehr.pojo.formmanage.form.SysButtonRole;
import com.myehr.pojo.formmanage.form.SysButtonRoleExample;
import com.myehr.pojo.formmanage.form.SysFieldRole;
import com.myehr.pojo.formmanage.form.SysFieldRoleExample;
import com.myehr.pojo.formmanage.form.SysFileButtonRole;
import com.myehr.pojo.formmanage.form.SysFileButtonRoleExample;
import com.myehr.pojo.formmanage.form.SysFormColumn;
import com.myehr.pojo.formmanage.form.SysFormFolderTree;
import com.myehr.pojo.formmanage.form.SysFormFolderTreeExample;
import com.myehr.pojo.formmanage.form.SysFormconfig;
import com.myehr.pojo.formmanage.form.SysFormconfigExample;
import com.myehr.pojo.formmanage.form.SysUserDict;
import com.myehr.pojo.formmanage.form.SysUserDictExample;
import com.myehr.pojo.formmanage.question.SysExamtemplate;
import com.myehr.pojo.formmanage.question.SysExamtemplateExample;
import com.myehr.pojo.formmanage.question.SysQuestion;
import com.myehr.pojo.formmanage.question.SysQuestionExample;
import com.myehr.pojo.sysMenuRole.SysMenuRole;
import com.myehr.pojo.sysMenuRole.SysMenuRoleExample;
import com.myehr.pojo.sysRole.SysOrgRole;
import com.myehr.pojo.sysRole.SysOrgRoleExample;
import com.myehr.pojo.sysRole.SysRole;
import com.myehr.pojo.sysRole.SysRoleExample;
import com.myehr.pojo.sysRole.SysUserOrg;
import com.myehr.pojo.sysRole.SysUserOrgExample;
import com.myehr.pojo.sysUserRole.SysUserRole;
import com.myehr.pojo.sysUserRole.SysUserRoleExample;
import com.myehr.pojo.sysmenutree.SysMenuTree;
import com.myehr.pojo.sysmenutree.TreeByCode;
import com.myehr.service.field.FieldService;
import com.myehr.service.formmanage.form.IButtonService;
import com.myehr.service.formmanage.form.IFormService;
import com.myehr.service.impl.field.FieldServiceImpl;
import com.myehr.service.impl.formmanage.form.SysformconfigService;
import com.myehr.service.impl.primaryKey.PrimaryKeyServiceImpl;
import com.myehr.service.impl.sysRoleImpl.SysRoleServiceImpl;
import com.myehr.service.menu.SysMenuService;
import com.myehr.service.primaryKey.PrimaryKeyService;
import com.myehr.service.sysRole.SysRoleService;
import com.myehr.test.dao.TMapperExt;

@Controller
@RequestMapping("/SysRoleList")
public class SysRoleListController {
	private static Logger logger = LoggerFactory.getLogger(SysRoleListController.class);
//	@Autowired
	@Resource(name = "SysRoleService")
	private SysRoleService serviceImpl;
	
	@Autowired
	private SysRoleExpandMapper eMapper;
	
//	@Autowired
	@Resource(name = "PrimaryKeyService")
	private PrimaryKeyService keyserviceImpl;
	
//	@Autowired
	@Resource(name = "FieldService")
	FieldService fServiceImpl;
	
//	@Autowired
	@Resource(name = "IFormService")
	private IFormService formService;
	
	@Autowired
	private SysRoleMapper sysRoleMapper;
	
	@Autowired
	private SysMenuRoleMapper sysMenuRoleMapper;
	
	@Autowired
	private SysUserDictMapper sysUserDictMapper;
	
	@Autowired
	private SysOrgRoleMapper sysOrgRoleMapper;
	
	@Autowired
	private SysUserRoleMapper sysUserRoleMapper;
	
	@Autowired
	private SysUserOrgMapper sysUserOrgMapper;
	
	@Autowired
	private SysFormColumnExpandMapper sysFormColumnExpandMapper;
	
	@Autowired
	private SysButtonRoleMapper sysButtonRoleMapper;
	
	@Autowired
	private SysFieldRoleMapper sysFieldRoleMapper;

//	@Autowired
	@Resource(name = "TMapperExt")
	TMapperExt tMapperExt;
	
	@Autowired
	private SysFormFolderTreeMapper treeMapper;
	
	@Autowired
	private SysFormconfigMapper formMapper;
	
	@Autowired
	private SysMenuService sysMenuService;
//	@Autowired
	@Resource(name = "IButtonService")
	private IButtonService buttonService;
	
	@Autowired
	private SysFileButtonRoleMapper sysFileButtonRoleMapper;
	
	@Autowired
	private SysDictEntryMapper dictEntryMapper;
	
	@Autowired
	private SysDictTypeMapper dictTypeMapper;
	
	@Autowired
	private SysExamtemplateMapper examtemplateMapper;
	
	@Autowired
	private SysQuestionMapper questionMapper;
	
	@Autowired
	private SysformconfigService sysformconfigService;
	@Autowired
	private SysActRoleMapper   sysActRoleMapper;
	
	@RequestMapping("/updateSysRole")
	public @ResponseBody Object updateSysRole(HttpServletRequest request) throws Exception{
		SysRole role = (SysRole) JSONObject.toBean(GetRequestJsonUtils.getJsonObject(request), SysRole.class);  
        String reCode = serviceImpl.updateSysRole(role);
        return reCode;
    }
	
	@RequestMapping("/deleteSysRole")
	public @ResponseBody Object deleteSysRole(HttpServletRequest request) throws Exception{
		SysRole role = (SysRole) JSONObject.toBean(GetRequestJsonUtils.getJsonObject(request), SysRole.class);  
        String reCode = serviceImpl.deleteSysRole(role);
        return reCode;
    }
	
	//新增
	@RequestMapping("/insertSysRole")
	public @ResponseBody Object insertSysRole(HttpServletRequest request) throws Exception{
		SysRole role = (SysRole) JSONObject.toBean(GetRequestJsonUtils.getJsonObject(request), SysRole.class); 
		role.setDeleteMark("N");
		role.setRoleId(new BigDecimal(keyserviceImpl.getPrimaryKey("sys_role", "ROLE_ID")));
        String reCode = serviceImpl.insertSysRole(role);
        return reCode;
    }
	
	//恢复
	@RequestMapping("/recoverSysRole")
	public @ResponseBody Object recoverSysRole(HttpServletRequest request) throws Exception{
		SysRole role = (SysRole) JSONObject.toBean(GetRequestJsonUtils.getJsonObject(request), SysRole.class); 
		String reCode = serviceImpl.recoverSysRole(role);
		return reCode;
	}

	//树查询
	@RequestMapping("/searchSysRoleTree")
	public @ResponseBody Object searchSysRoleTree(HttpServletRequest request) throws Exception{
		/*String id = request.getParameter("id")  ;
		String entityName = request.getParameter("entityName").split("\"")[1]  ;
		String sql;
		if(id==null || id.equals("")){
			 sql="select * from "+entityName+" where DELETE_MARK= 'N' and role_parent_code is null ";
		}else{
			 sql="select * from "+entityName+" where DELETE_MARK= 'N' and role_parent_code = '"+id+"'";
		}
		*/
		String userId = (BigDecimal)request.getSession().getAttribute("userid")+"";
		String formId =request.getParameter("formId");
		if(formId==null){
			return "formId无效";
		}
		SysFormconfigCache form = formService.getForm(formId);
		SysFormconfigTreeCache tree = form.getTree();
//		Map<String,Object> p = null;
//		p = jsonToMap(paramsJson);
		if("1".equals(tree.getFormTreeType())){
			SysFormTreeSolutionCache s = tree.getSolution();
			String sql = s.getTreeSolutionExcSql();
			List<String[]> ps = tree.getSolution().getParams();
			for(int i=0; i<ps.size(); i++){
				String[] temp = ps.get(i);
				String key = temp[0]+"_"+temp[1];
//				String value = (String)p.get(key);
//				if(value ==null){
//					return null;
//				}
				
				String rstr = "["+temp[0]+":"+temp[1]+"]";
//				while(sql.indexOf(rstr)>=0){
//					sql = sql.replace(rstr, value);
//				}
				
			}
			logger.info("sql:"+sql);
			List<Map> datas = tMapperExt.queryByFormDefSql(sql);
			logger.info(tree.getFormIsLazy());
//			if("true".equals(tree.getFormIsLazy())){
//				for(int i=0; i<datas.size(); i++){
//					datas.get(i).set("expanded", "false");
//					datas.get(i).set("isLeaf", false);
//				}
			}
//			  
//			
//        Map<String, Object> maps=new HashMap<String, Object>();
//        maps.put("sql", sql);
//        List<SysRole> list = eMapper.getAllSysRole(maps); //查询全部数据
        List<SysMenuTree> tree1 = new ArrayList<SysMenuTree>();
        
//		for (int i = 0; i < list.size(); i++) {
//			SysMenuTree sTree = new SysMenuTree();
//			sTree.setMenuCode(list.get(i).getRoleCode());          
//			sTree.setMenuName(list.get(i).getRoleName());          
//			sTree.setIsparent(true);
//			tree1.add(sTree);
//		}
    	JSONArray jsonArray=JSONArray.fromObject(tree1);
    	String str=jsonArray.toString();
    	String newStr = str.replaceAll("menuCode","id");
    	String newStr1 = newStr.replaceAll("menuName","name");
    	String newStr2 = newStr1.replaceAll("isparent","isParent");
    	JSONArray json = JSONArray.fromObject(newStr2);
    	return json;
		
	}
	
	public static Map<String,Object> jsonToMap(String json){
		JSONObject mapjson = JSONObject.fromObject(json);
		Iterator<String> it = mapjson.keys();
		Map<String,Object> params = new HashMap<String,Object>();
		while(it.hasNext()){
			String key = it.next();
			String value = mapjson.getString(key);
			params.put(key, value);
		}
		return params;
	}
	
	//树查询
	@RequestMapping("/nuiTree")
	public @ResponseBody Object nuiTree(HttpServletRequest request) throws Exception{
		String sql;
	    sql="select * from sys_role where DELETE_MARK= 'N'";
        Map<String, Object> maps=new HashMap<String, Object>();
        maps.put("sql", sql);
        List<SysRole> list = eMapper.getAllSysRole(maps); //查询全部数据
        List<TreeByCode> tree1 = new ArrayList<TreeByCode>();
		for (int i = 0; i < list.size(); i++) {
			TreeByCode sTree = new TreeByCode();
			sTree.setId(list.get(i).getRoleCode());          
			sTree.setText(list.get(i).getRoleName()); 
			sTree.setPid(list.get(i).getRoleParentCode()); 
			tree1.add(sTree);
		}
    	JSONArray jsonArray=JSONArray.fromObject(tree1);
    	String str=jsonArray.toString();
    	JSONArray json = JSONArray.fromObject(str);
    	return json;
	}
	
	//查询  条件查询
	@RequestMapping("/findSysRoleById")
	public @ResponseBody SysRole findSysRoleById(HttpServletRequest request) throws Exception{
		SysRole role = (SysRole) JSONObject.toBean(GetRequestJsonUtils.getJsonObject(request), SysRole.class);  
		int id=role.getRoleId().intValue();
		SysRole SysRole=serviceImpl.findSysRoleById(id);
		return SysRole;
	}
	//查询  条件查询
	@RequestMapping("/getByRoleCode")
	public @ResponseBody SysRole getByRoleCode(HttpServletRequest request) throws Exception{
		SysRole role = (SysRole) JSONObject.toBean(GetRequestJsonUtils.getJsonObject(request), SysRole.class);  
		String id=role.getRoleCode();
		 Map<String, String> map=new HashMap<String, String>();
	      map.put("id", id);
		List<SysRole> list=eMapper.getByRoleCode(map);
		SysRole sys=list.get(0);
		return sys;
	}

	
	
	//查询  全部    分页    拼接字符串
	@RequestMapping("/searchSysRoleList")
	
	public @ResponseBody ResultMap searchSysRoleList(HttpServletRequest request) throws Exception{
		
		try {  
			return serviceImpl.searchSysRoleList(request);  
		} catch (Exception e) {  
			e.printStackTrace();logger.error(e.getMessage(),e);  
		}  
		return null; 
	}
	
	//模糊查询
	@RequestMapping("/search")
	public @ResponseBody ResultMap search(HttpServletRequest request) throws Exception{
		
		Pagers pagers=fServiceImpl.translateRequest(request, "");
		
		Map<String, String> map=new HashMap<String, String>();
		map.put("condition", "%"+pagers.getConditionString()+"%");
		map.put("deleteMark", pagers.getDeleteMark());
		
		List<SysRole> list=eMapper.searchByCondition(map);
		long total=10;
		ResultMap rMap=new ResultMap();
		List<Object> list_obj=new ArrayList<Object>();
		for (SysRole u : list) {
			list_obj.add(u);
		}
		rMap.setRows(list_obj);
		rMap.setTotal(total);
		return rMap;
	}
	
	
	/**
	 * 构建系统方案树
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/buildSysRoleTree")
	public @ResponseBody List<Map> buildSysRoleTree(HttpServletRequest request) throws Exception{
		SysRoleExample example = new SysRoleExample();
		example.or().andDeleteMarkEqualTo("N");
		//com.myehr.pojo.sysmenu.SysSystemSchemeExample.Criteria criteria = example.createCriteria();
		//criteria.andDictTypeCodeEqualTo("restCalendarTree");
		List<SysRole> roles = sysRoleMapper.selectByExample(example);
		
		List<Map> datas = new ArrayList<Map>();
		Map mapRoot=new HashMap();
		mapRoot.put("expanded", false);
		mapRoot.put("isLeaf", false);
		mapRoot.put("isParent", false); 
		mapRoot.put("open", false);
		mapRoot.put("roleId", "RoleRoot");
		mapRoot.put("roleName", "角色树");
		mapRoot.put("roleCode", "RoleRoot");
		mapRoot.put("roleType", "Root");
		mapRoot.put("roleSeq", "Root");
		mapRoot.put("parentCode", "");
		mapRoot.put("ORG_DEL", "N");
		datas.add(mapRoot);
		
		for (int i = 0; i < roles.size(); i++) {
			Map map=new HashMap();
			map.put("expanded", false);
			map.put("isLeaf", false);
			map.put("isParent", false); 
			map.put("open", false);
			map.put("roleId", roles.get(i).getRoleId());
			map.put("roleName", roles.get(i).getRoleName());
			map.put("roleCode", roles.get(i).getRoleCode());
			map.put("roleType", roles.get(i).getRoleType());
			map.put("roleSeq", roles.get(i).getRoleSeq());
			map.put("parentCode", "RoleRoot");
			map.put("ORG_DEL", "N");
			datas.add(map);
		}
		
		return  datas;
	}
	
	
	/**
	 * 构建表单字段授权树
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/buildRoleFormColumnTree")
	public @ResponseBody List<Map> buildRoleFormColumnTree(HttpServletRequest request) throws Exception{
		String roleId = request.getParameter("roleId");
		
		SysFormFolderTreeExample example = new SysFormFolderTreeExample();
		List<SysFormFolderTree> formFolderTrees =  treeMapper.selectByExample(example);
		
		SysFormconfigExample example1 = new SysFormconfigExample();
		List<SysFormconfig> forms =  formMapper.selectByExample(example1);
		
		String sql = "SELECT FC.FORM_COLUMN_ID, "+
	       " FC.FORM_FIELD_TABLENAME, "+
	       " FC.FORM_COLUMN_LABLE, "+
	       " FC.FORM_COLUMN_FORM_DEF_ID, "+
	       " FR.FIELD_ROLE_ID "+
	       " FROM SYS_FORM_COLUMN FC "+
	       " LEFT JOIN (SELECT * FROM SYS_FIELD_ROLE WHERE ROLE_ID = "+roleId+") FR "+
	       " ON FC.FORM_COLUMN_ID = FR.FORM_COLUMN_ID "+
	       " JOIN(SELECT * FROM SYS_FORMCONFIG WHERE FORM_AUTHORITY_IS_CONTROL = 'N' or FORM_AUTHORITY_IS_CONTROL is null) SFC "+
	       " ON FC.FORM_COLUMN_FORM_DEF_ID = SFC.FORM_DEF_ID "+
	       " WHERE 1=1 "+
	  /* <isNotNull prepend="AND" property="parentCode">
	     	 FC.FORM_COLUMN_ID IN (SELECT FR.FORM_COLUMN_ID
	                       FROM SYS_ROLE R, SYS_FIELD_ROLE FR
	                      WHERE R.ROLE_ID = FR.ROLE_ID
	                        AND R.ROLE_CODE = #parentCode#)
	     </isNotNull>*/
	   
	     	" ORDER BY FORM_COLUMN_FORM_DEF_ID, FORM_COLUMN_SORT ";
		
		String sql1 = "SELECT FB.FORM_BUTTON_ID, "+
				" FB.FORM_BUTTON_NAME, "+
				" FB.FORM_BUTTON_FORM_DEF_ID, "+
				" (CASE WHEN FB.FORM_BUTTON_ICON IS NULL THEN FB.FORM_BUTTON_TYPE ELSE "+
				" FB.FORM_BUTTON_ICON END) FORM_BUTTON_ICON, "+
				" BR.BUTTON_ROLE_ID "+
				" FROM SYS_FORM_BUTTON FB "+
				" LEFT JOIN (SELECT * FROM SYS_BUTTON_ROLE WHERE ROLE_ID = "+roleId+") BR ON FB.FORM_BUTTON_ID = "+
				" BR.BUTTON_ID "+
				" WHERE 1=1 "+
	   
	  /* <isNotNull prepend="AND" property="parentCode">
	     	 FB.FORM_BUTTON_ID IN (SELECT BR.BUTTON_ID
	                       FROM SYS_ROLE R, SYS_BUTTON_ROLE BR
	                      WHERE R.ROLE_ID = BR.ROLE_ID
	                        AND R.ROLE_CODE = #parentCode#)
	     </isNotNull>*/
	   
				" ORDER BY FB.FORM_BUTTON_FORM_DEF_ID, FB.FORM_BUTTON_SORT ";
		

		List<Map> sysMenus = tMapperExt.queryByFormDefSql(sql);
		List<Map> sysRoleButtons = tMapperExt.queryByFormDefSql(sql1);
		
		List<Map> datas = new ArrayList<Map>();
		Map mapRoot=new HashMap();
		mapRoot.put("expanded", false);
		mapRoot.put("isLeaf", false);
		mapRoot.put("isParent", false); 
		mapRoot.put("open", false); 
		mapRoot.put("nodeName", "角色字段按钮权限树");
		mapRoot.put("id", "Root");
		mapRoot.put("nodeId", "Root");
		mapRoot.put("menuType", "Root");
		mapRoot.put("nodeSeq", "Root");
		mapRoot.put("pid", "RootParent");
		mapRoot.put("ORG_DEL", "N");
		datas.add(mapRoot);
		for (int i = 0; i < formFolderTrees.size(); i++) {
			Map map=new HashMap();
			String folderTreeParentId = "";
			if(formFolderTrees.get(i).getFolderTreeParentId()==null || formFolderTrees.get(i).getFolderTreeParentId().longValue()==0){
				folderTreeParentId = "Root";
			}else {
				folderTreeParentId = "folder"+formFolderTrees.get(i).getFolderTreeParentId();
			}
			map.put("nodeId", formFolderTrees.get(i).getFolderTreeId());
			map.put("id", "folder"+formFolderTrees.get(i).getFolderTreeId());
			map.put("nodeParentId", formFolderTrees.get(i).getFolderTreeParentId());
			map.put("pid", folderTreeParentId);
			map.put("nodeCode", formFolderTrees.get(i).getFolderTreeCode());
			map.put("nodeName", formFolderTrees.get(i).getFolderTreeName());
			map.put("nodeSeq", formFolderTrees.get(i).getFolderTreeSeq());
			map.put("nodeType", "folder");
			datas.add(map);
		}
		
		for (int i = 0; i < forms.size(); i++) {
			Map map=new HashMap();
			map.put("nodeId", forms.get(i).getFormDefId());
			map.put("id", "form"+forms.get(i).getFormDefId());
			map.put("nodeParentId", forms.get(i).getFormDefFolderId());
			map.put("pid", "folder"+forms.get(i).getFormDefFolderId());
			map.put("nodeCode", forms.get(i).getFormDefCode());
			map.put("nodeName", forms.get(i).getFormDefName());
			map.put("nodeSeq", "");
			map.put("nodeType", "form");
			map.put("ORG_DEL", "N");
			datas.add(map);
		}
		for (int i = 0; i < sysMenus.size(); i++) {
			Map map=new HashMap();
			
			String quanxian = (BigDecimal)sysMenus.get(i).get("FIELD_ROLE_ID")+"";
			if (quanxian.equals("null")||quanxian.equals("")) {
				map.put("checked", false);
			}else {
				map.put("checked", true);
			}
			
			map.put("expanded", false);
			map.put("isLeaf", false);
			map.put("isParent", false); 
			map.put("open", false); 
			map.put("nodeId", (BigDecimal)sysMenus.get(i).get("FORM_COLUMN_ID"));
			map.put("id", "field"+(BigDecimal)sysMenus.get(i).get("FORM_COLUMN_ID"));
			map.put("nodeParentId", (BigDecimal)sysMenus.get(i).get("FORM_COLUMN_FORM_DEF_ID"));
			map.put("pid", "form"+(BigDecimal)sysMenus.get(i).get("FORM_COLUMN_FORM_DEF_ID"));
			map.put("nodeName", (String)sysMenus.get(i).get("FORM_COLUMN_LABLE"));
			map.put("nodeType", "field");
			map.put("ORG_DEL", "N");
			//datas.add(map);
		}
		
		for (int i = 0; i < sysRoleButtons.size(); i++) {
			Map map=new HashMap();
			
			String quanxian = (BigDecimal)sysRoleButtons.get(i).get("BUTTON_ROLE_ID")+"";
			if (quanxian.equals("null")||quanxian.equals("")) {
				map.put("checked", false);
			}else {
				map.put("checked", true);
			}
			
			map.put("expanded", false);
			map.put("isLeaf", false);
			map.put("isParent", false); 
			map.put("open", false); 
			map.put("nodeId", (BigDecimal)sysRoleButtons.get(i).get("FORM_BUTTON_ID"));
			map.put("id", "button"+(BigDecimal)sysRoleButtons.get(i).get("FORM_BUTTON_ID"));
			map.put("nodeParentId", (BigDecimal)sysRoleButtons.get(i).get("FORM_BUTTON_FORM_DEF_ID"));
			map.put("pid", "form"+(BigDecimal)sysRoleButtons.get(i).get("FORM_BUTTON_FORM_DEF_ID"));
			map.put("nodeName", (String)sysRoleButtons.get(i).get("FORM_BUTTON_NAME"));
			map.put("nodeType", "button");
			map.put("ORG_DEL", "N");
			//datas.add(map);
		}
		
		return  datas;
	}
	
	/**
	 * 流程管理构建表单字段授权树
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/buildRoleFormColumnTreeForCC")
	public @ResponseBody List<Map> buildRoleFormColumnTreeForCC(HttpServletRequest request) throws Exception{
		String roleId = request.getParameter("roleId");
		
		SysFormFolderTreeExample example = new SysFormFolderTreeExample();
		List<SysFormFolderTree> formFolderTrees =  treeMapper.selectByExample(example);
		
		SysFormconfigExample example1 = new SysFormconfigExample();
		example1.or().andFormDefLayoutTypeEqualTo("5").andExpandFieldEqualTo("CARDTOCARD");
		List<SysFormconfig> forms =  formMapper.selectByExample(example1);

		List<Map> datas = new ArrayList<Map>();
		Map mapRoot=new HashMap();
		mapRoot.put("expanded", false);
		mapRoot.put("isLeaf", false);
		mapRoot.put("isParent", false); 
		mapRoot.put("open", false); 
		mapRoot.put("nodeName", "角色字段按钮权限树");
		mapRoot.put("id", "Root");
		mapRoot.put("nodeId", "Root");
		mapRoot.put("menuType", "Root");
		mapRoot.put("nodeSeq", "Root");
		mapRoot.put("pid", "RootParent");
		mapRoot.put("ORG_DEL", "N");
		datas.add(mapRoot);
		for (int i = 0; i < formFolderTrees.size(); i++) {
			Map map=new HashMap();
			String folderTreeParentId = "";
			if(formFolderTrees.get(i).getFolderTreeParentId()==null || formFolderTrees.get(i).getFolderTreeParentId().longValue()==0){
				folderTreeParentId = "Root";
			}else {
				folderTreeParentId = "folder"+formFolderTrees.get(i).getFolderTreeParentId();
			}
			map.put("nodeId", formFolderTrees.get(i).getFolderTreeId());
			map.put("id", "folder"+formFolderTrees.get(i).getFolderTreeId());
			map.put("nodeParentId", formFolderTrees.get(i).getFolderTreeParentId());
			map.put("pid", folderTreeParentId);
			map.put("nodeCode", formFolderTrees.get(i).getFolderTreeCode());
			map.put("nodeName", formFolderTrees.get(i).getFolderTreeName());
			map.put("nodeSeq", formFolderTrees.get(i).getFolderTreeSeq());
			map.put("nodeType", "folder");
			datas.add(map);
		}
		
		for (int i = 0; i < forms.size(); i++) {
			Map map=new HashMap();
			map.put("nodeId", forms.get(i).getFormDefId());
			map.put("id", "form"+forms.get(i).getFormDefId());
			map.put("nodeParentId", forms.get(i).getFormDefFolderId());
			map.put("pid", "folder"+forms.get(i).getFormDefFolderId());
			map.put("nodeCode", forms.get(i).getFormDefCode());
			map.put("nodeName", forms.get(i).getFormDefName());
			map.put("nodeSeq", "");
			map.put("nodeType", "form");
			map.put("ORG_DEL", "N");
			datas.add(map);
		}
		
		
		return  datas;
	}
	
	/**
	 * 构建问卷模板授权树
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/questionTemplateTree")
	public @ResponseBody List<Map> questionTemplateTree(HttpServletRequest request) throws Exception{
		String formId = request.getParameter("formId");
		List<Map> datas = new ArrayList<Map>();
		Map mapRoot=new HashMap();
		mapRoot.put("expanded", false);
		mapRoot.put("isLeaf", false);
		mapRoot.put("isParent", false); 
		mapRoot.put("open", false); 
		mapRoot.put("nodeName", "问卷模板树");
		mapRoot.put("id", "Root");
		mapRoot.put("nodeId", "Root");
		mapRoot.put("menuType", "Root");
		mapRoot.put("nodeSeq", "Root");
		mapRoot.put("pid", "RootParent");
		mapRoot.put("ORG_DEL", "N");
		datas.add(mapRoot);
		if (formId!=null) {
			SysFormconfig form = formMapper.selectByPrimaryKey(new BigDecimal(formId));
			if (form!=null&&form.getFormDefLayoutType().equals("5")&&form.getExpandField().equals("CARDTOCARD")) {
				//问卷模板类型
				SysDictTypeExample exampleType = new SysDictTypeExample();
				exampleType.or().andDictTypeCodeEqualTo("Question_Type");
				SysDictType type = dictTypeMapper.selectByExample(exampleType).get(0);
				SysDictEntryExample example = new SysDictEntryExample();
				example.or().andDictTypeIdEqualTo(type.getDictTypeId());
				List<SysDictEntry> entries = dictEntryMapper.selectByExample(example);
				for (int i = 0; i < entries.size(); i++) {
					Map map=new HashMap();
					map.put("nodeId",entries.get(i).getDictEntryCode());
					map.put("id", "type"+entries.get(i).getDictEntryCode());
					map.put("nodeParentId","Root");
					map.put("pid", "Root");
					map.put("nodeCode", entries.get(i).getDictEntryCode());
					map.put("nodeName", entries.get(i).getDictEntryName());
					map.put("nodeSeq", "type");
					map.put("nodeType", "TemplateType");
					datas.add(map);
					SysExamtemplateExample examtemplateExample = new SysExamtemplateExample();
					if(form.getExpand1()!=null){
						examtemplateExample.or().andMarkTypeEqualTo(entries.get(i).getDictEntryCode()).andIdEqualTo(Integer.valueOf(form.getExpand1()));
						List<SysExamtemplate> templates = examtemplateMapper.selectByExample(examtemplateExample);
						for (int j = 0; j < templates.size(); j++) {
							Map map2=new HashMap();
							map2.put("nodeId", templates.get(j).getId());
							map2.put("id", "template"+templates.get(j).getId());
							map2.put("nodeParentId",entries.get(i).getDictEntryCode());
							map2.put("pid", "type"+entries.get(i).getDictEntryCode());
							map2.put("nodeCode", templates.get(j).getEname());
							map2.put("nodeName", templates.get(j).getCname());
							map2.put("nodeSeq", "Template");
							map2.put("nodeType", "Template");
							datas.add(map2);
							String sql = "select sys_question.* from sys_examtemplate_question left join sys_question on sys_examtemplate_question.questionid=sys_question.id  join sys_examtemplate on sys_examtemplate_question.templateid = sys_examtemplate.id where sys_examtemplate.id = "+templates.get(j).getId();
							List<Map> sysQuestions = tMapperExt.queryByFormDefSql(sql);
							for (int k = 0; k < sysQuestions.size(); k++) {
								Map map3=new HashMap();
								map3.put("nodeId", sysQuestions.get(k).get("ID"));
								map3.put("id", "question"+sysQuestions.get(k).get("ID"));
								map3.put("nodeParentId",templates.get(j).getId());
								map3.put("pid","template"+templates.get(j).getId());
								map3.put("nodeCode",sysQuestions.get(k).get("CODE"));
								map3.put("nodeName",sysQuestions.get(k).get("CNAME"));
								map3.put("nodeSeq", "Question");
								map3.put("nodeType", "Question");
								datas.add(map3);
							}
						}
					}
					
				}
			}
			
		}
		return  datas;
	}
	/**
	 * 查询角色表单授权字段和按钮
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryFieldAndButtonByFormIdAndRoleId")
	public @ResponseBody ResultMapNew queryFieldAndButtonByFormIdAndRoleId(HttpServletRequest request,@RequestBody CardformInitDataParams params) throws Exception{
		Map requestParam = params.getRequestParam();
		String roleId = requestParam.get("roleId")+"";
		String formId =  requestParam.get("formId")+"";
		SysFormconfig formconfig = formMapper.selectByPrimaryKey(new BigDecimal(formId));
		ResultMapNew resultMap = new ResultMapNew();
		
		String sql = "SELECT FC.FORM_COLUMN_ID, "+
	       " FC.FORM_FIELD_TABLENAME, "+
	       " FC.FORM_COLUMN_LABLE, "+
	       " FC.FORM_COLUMN_FORM_DEF_ID, "+
	       " FR.FIELD_ROLE_ID, "+
	       " FR.FORM_COLUMN_TYPE "+
	       " FROM SYS_FORM_COLUMN FC "+
	       " LEFT JOIN (SELECT * FROM SYS_FIELD_ROLE WHERE ROLE_ID = "+roleId+") FR "+
	       " ON FC.FORM_COLUMN_ID = FR.FORM_COLUMN_ID "+
	       " JOIN(SELECT * FROM SYS_FORMCONFIG WHERE FORM_AUTHORITY_IS_CONTROL = 'N' or FORM_AUTHORITY_IS_CONTROL is null) SFC "+
	       " ON FC.FORM_COLUMN_FORM_DEF_ID = SFC.FORM_DEF_ID "+
	       " WHERE 1=1 AND FC.FORM_COLUMN_FORM_DEF_ID = "+formId+
	   
	     	" ORDER BY FORM_COLUMN_FORM_DEF_ID, FORM_COLUMN_SORT ";
		
		String sql1 = "SELECT FB.FORM_BUTTON_ID, "+
				" FB.FORM_BUTTON_NAME, "+
				" FB.FORM_BUTTON_FORM_DEF_ID, "+
				" (CASE WHEN FB.FORM_BUTTON_ICON IS NULL THEN FB.FORM_BUTTON_TYPE ELSE "+
				" FB.FORM_BUTTON_ICON END) FORM_BUTTON_ICON, "+
				" BR.BUTTON_ROLE_ID, "+
				" BR.FORM_BUTTON_TYPE "+
				" FROM SYS_FORM_BUTTON FB "+
				" LEFT JOIN (SELECT * FROM SYS_BUTTON_ROLE WHERE ROLE_ID = "+roleId+") BR ON FB.FORM_BUTTON_ID = "+
				" BR.BUTTON_ID "+
				" WHERE 1=1 AND FB.FORM_BUTTON_FORM_DEF_ID = "+formId+
	   
				" ORDER BY FB.FORM_BUTTON_FORM_DEF_ID, FB.FORM_BUTTON_SORT ";
		String sql2 = "SELECT F.* FROM SYS_FILE_BUTTON_ROLE F LEFT JOIN SYS_FORMCONFIG SF ON F.FORM_ID = SF.FORM_DEF_ID WHERE SF.IS_FILEMANAGE = 'Y' AND F.ROLE_ID = "+roleId+" AND F.FORM_ID = " +formId;

		List<Map> sysRoleFields = tMapperExt.queryByFormDefSql(sql);
		List<Map> sysRoleButtons = tMapperExt.queryByFormDefSql(sql1);
		List<Map> sysRoleFileButtons = tMapperExt.queryByFormDefSql(sql2);
		
		List<Map> datas = new ArrayList<Map>();
		
		for (int i = 0; i < sysRoleFields.size(); i++) {
			Map map=new HashMap();
			
			String quanxian = (BigDecimal)sysRoleFields.get(i).get("FIELD_ROLE_ID")+"";
			if (quanxian.equals("null")||quanxian.equals("")) {
				map.put("checked", false);
			}else {
				map.put("checked", true);
			} 
			map.put("nodeId", (BigDecimal)sysRoleFields.get(i).get("FORM_COLUMN_ID"));
			map.put("id", "field"+(BigDecimal)sysRoleFields.get(i).get("FORM_COLUMN_ID"));
			map.put("formId", (BigDecimal)sysRoleFields.get(i).get("FORM_COLUMN_FORM_DEF_ID"));
			map.put("pid", "form"+(BigDecimal)sysRoleFields.get(i).get("FORM_COLUMN_FORM_DEF_ID"));
			map.put("nodeName", (String)sysRoleFields.get(i).get("FORM_COLUMN_LABLE"));
			map.put("nodeType", "field");
			map.put("powerType", (BigDecimal)sysRoleFields.get(i).get("FORM_COLUMN_TYPE"));
			datas.add(map);
		}
		
		for (int i = 0; i < sysRoleButtons.size(); i++) {
			Map map=new HashMap();
			
			String quanxian = (BigDecimal)sysRoleButtons.get(i).get("BUTTON_ROLE_ID")+"";
			if (quanxian.equals("null")||quanxian.equals("")) {
				map.put("checked", false);
			}else {
				map.put("checked", true);
			} 
			
			map.put("nodeId", (BigDecimal)sysRoleButtons.get(i).get("FORM_BUTTON_ID"));
			map.put("id", "button"+(BigDecimal)sysRoleButtons.get(i).get("FORM_BUTTON_ID"));
			map.put("formId", (BigDecimal)sysRoleButtons.get(i).get("FORM_BUTTON_FORM_DEF_ID"));
			map.put("pid", "form"+(BigDecimal)sysRoleButtons.get(i).get("FORM_BUTTON_FORM_DEF_ID"));
			map.put("nodeName", (String)sysRoleButtons.get(i).get("FORM_BUTTON_NAME"));
			map.put("nodeType", "button");
			map.put("powerType", (BigDecimal)sysRoleButtons.get(i).get("FORM_BUTTON_TYPE"));
			map.put("ORG_DEL", "N");
			datas.add(map);
		}
		if(formconfig.getIsFilemanage()!=null&&(formconfig.getIsFilemanage().equals("checkedAndForm")||formconfig.getIsFilemanage().equals("OnlyChecked"))){//OnlyChecked
			if (sysRoleFileButtons.size()>0) {
				for (int i = 0; i < 4; i++) {
					Map map=new HashMap();
					map.put("nodeId", (BigDecimal)sysRoleFileButtons.get(i).get("BUTTON_ROLE_ID"));
					map.put("id", "button"+(BigDecimal)sysRoleFileButtons.get(i).get("BUTTON_ROLE_ID"));
					map.put("checked", true);
					map.put("formId", formId);
					map.put("pid", "form"+formId);
					map.put("powerType", sysRoleFileButtons.get(i).get("BUTTON_ROLE_REMARK"));
					if (i==0) {
						map.put("nodeName","文件预览");
					} else if (i==1) {
						map.put("nodeName","文件上传");
					} else if (i==2) {
						map.put("nodeName","文件删除");
					} else if (i==3) {
						map.put("nodeName","文件下载");
					}
					map.put("nodeType", "fileButton");
					datas.add(map);
				}
			} else {
				for (int i = 0; i < 4; i++) {
					Map map=new HashMap();
					map.put("checked", false);
					map.put("formId", formId);
					map.put("pid", "form"+formId);
					if (i==0) {
						map.put("nodeName","文件预览");
					} else if (i==1) {
						map.put("nodeName","文件上传");
					} else if (i==2) {
						map.put("nodeName","文件删除");
					} else if (i==3) {
						map.put("nodeName","文件下载");
					}
					map.put("nodeType", "fileButton");
					datas.add(map);
				}
			}
		}
		resultMap.setRows(datas);
		resultMap.setTotal(datas.size());
		
		return  resultMap;
	}
		
	/**
	 * 角色菜单授权
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/saveMenuWithRole")
	public @ResponseBody String saveMenuWithRole(HttpServletRequest request,@RequestBody MenuDatas params) throws Exception{
		long roleId = params.getRoleId();
		String userId = (BigDecimal)request.getSession().getAttribute("userid")+"";
		SysMenuRoleExample example1 = new SysMenuRoleExample();
		com.myehr.pojo.sysMenuRole.SysMenuRoleExample.Criteria criteria = example1.createCriteria();
		criteria.andRoleIdEqualTo(new BigDecimal(roleId));
		sysMenuRoleMapper.deleteByExample(example1);
		
		List<Map> checkMenus= params.getCheckMenus();
		for (int i = 0; i < checkMenus.size(); i++) {
			Map menu = checkMenus.get(i);
			String menuCode = (String) menu.get("menuCode");
			if (menuCode.equals("MenuRoot")) {
				continue;
			}
			SysMenuRole example = new SysMenuRole();
			example.setMenuId(new BigDecimal((Integer) menu.get("menuId")));
			example.setRoleId(new BigDecimal(roleId));
			example.setOperatorName(userId);
			example.setOperatorTime(new Date());
			sysMenuRoleMapper.insert(example);
			
		}
		sysMenuService.reinitMainframeMenuWithRoleId(roleId+"", request);
		return "success";
	}
	
	
	/**
	 * 角色字段按钮授权
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/saveFieldAndButtonWithRole")
	public @ResponseBody String saveFieldAndButtonWithRole(HttpServletRequest request,@RequestBody ColumnAndButtonDatas params) throws Exception{
		long roleId = params.getRoleId();
		long objType = params.getObjType();
		List<Map> checkMenus= params.getCheckMenus();
		String formId = checkMenus.get(0).get("formId")+"";
		
		String userId = (BigDecimal)request.getSession().getAttribute("userid")+"";
		
		for (int i = 0; i < checkMenus.size(); i++) {
			Map map = checkMenus.get(i);
			String nodeType = (String) map.get("nodeType");
			if (nodeType.equals("button")) {
				String buttonId = map.get("nodeId")+"";
				SysButtonRoleExample buttonRoleExample = new SysButtonRoleExample();
				buttonRoleExample.or().andButtonIdEqualTo(new BigDecimal(buttonId)).andFormIdEqualTo(new BigDecimal(formId)).andRoleIdEqualTo(new BigDecimal(roleId));
				List<SysButtonRole> sysButtonRoles = sysButtonRoleMapper.selectByExample(buttonRoleExample);
				if (sysButtonRoles.size()>0) {
					SysButtonRole sysButtonRole = sysButtonRoles.get(0);
					sysButtonRole.setFormButtonType(new BigDecimal(objType));
					sysButtonRoleMapper.updateByPrimaryKey(sysButtonRole);
				}else {
					SysButtonRole example = new SysButtonRole();
					example.setButtonId(new BigDecimal(buttonId));
					example.setFormId(new BigDecimal(formId));
					example.setRoleId(new BigDecimal(roleId));
					example.setOperatorName(userId);
					example.setOperatorTime(new Date());
					example.setFormButtonType(new BigDecimal(objType));
					sysButtonRoleMapper.insert(example);
				}
			}else if (nodeType.equals("field")) {
				String columnId = map.get("nodeId")+"";
				SysFieldRoleExample fieldRoleExample = new SysFieldRoleExample();
				fieldRoleExample.or().andFormColumnIdEqualTo(new BigDecimal(columnId)).andFormIdEqualTo(new BigDecimal(formId)).andRoleIdEqualTo(new BigDecimal(roleId));
				List<SysFieldRole> sysFieldRoles = sysFieldRoleMapper.selectByExample(fieldRoleExample);
				if (sysFieldRoles.size()>0) {
					SysFieldRole sysFieldRole = sysFieldRoles.get(0);
					sysFieldRole.setFormColumnType(new BigDecimal(objType));
					sysFieldRoleMapper.updateByPrimaryKey(sysFieldRole);
					sysformconfigService.setButtonOrColumnByUserId(formId,userId);
				}else {
					SysFieldRole example = new SysFieldRole();
					example.setFormColumnId(new BigDecimal((Integer) map.get("nodeId")));
					example.setFormId(new BigDecimal(formId));
					example.setRoleId(new BigDecimal(roleId));
					example.setOperatorName(userId);
					example.setOperatorTime(new Date());
					example.setFormColumnType(new BigDecimal(objType));
					sysFieldRoleMapper.insert(example);
					sysformconfigService.setButtonOrColumnByUserId(formId,userId);
				}
			}else if (nodeType.equals("fileButton")) {
				String id = (String)(map.get("nodeId")+"");
				if (id!=null&&!id.equals("null")) {
					SysFileButtonRole fileButtonRole = sysFileButtonRoleMapper.selectByPrimaryKey(new BigDecimal(id));
					fileButtonRole.setButtonRoleRemark(objType+"");
					sysFileButtonRoleMapper.updateByPrimaryKey(fileButtonRole);
				}else {
					SysFileButtonRole fileButtonRole = new SysFileButtonRole();
					fileButtonRole.setButtonCode((String) map.get("nodeName"));
					fileButtonRole.setButtonRoleRemark(objType+"");
					fileButtonRole.setFormId(new BigDecimal(formId));
					fileButtonRole.setOperatorName(userId);
					fileButtonRole.setOperatorTime(new Date());
					fileButtonRole.setRoleId(new BigDecimal(roleId));
					sysFileButtonRoleMapper.insert(fileButtonRole);
				}
			}
		}
		return "success";
	}
	
	
	/**
	 * 角色机构授权
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/saveOrgWithRole")
	public @ResponseBody String saveOrgWithRole(HttpServletRequest request,@RequestBody MenuDatas params) throws Exception{
		long roleId = params.getRoleId();
		String userId = request.getSession().getAttribute("userid")+"";
		SysOrgRoleExample example1 = new SysOrgRoleExample();
		com.myehr.pojo.sysRole.SysOrgRoleExample.Criteria criteria = example1.createCriteria();
		criteria.andRoleIdEqualTo(new BigDecimal(roleId));
		sysOrgRoleMapper.deleteByExample(example1);
		
		List<Map> checkMenus= params.getCheckMenus();
		for (int i = 0; i < checkMenus.size(); i++) {
			Map menu = checkMenus.get(i);
			SysOrgRole example = new SysOrgRole();
			example.setOrgId(new BigDecimal((Integer) menu.get("ORGID")));
			example.setRoleId(new BigDecimal(roleId));
			example.setTreeType("orgtree");
			example.setIsRoot("Y");
			example.setOperatorName(userId);
			example.setOperatorTime(new Date());
			sysOrgRoleMapper.insert(example);
			
		}
		return "success";
	}
	
	/**
	 * 用户机构授权
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/saveOrgWithUser")
	public @ResponseBody String saveOrgWithUser(HttpServletRequest request,@RequestBody MenuDatas params) throws Exception{
		String userId = params.getRoleId()+"";
		SysUserOrgExample example1 = new SysUserOrgExample();
		com.myehr.pojo.sysRole.SysUserOrgExample.Criteria criteria = example1.createCriteria();
		criteria.andUserIdEqualTo(Integer.parseInt(userId));
		sysUserOrgMapper.deleteByExample(example1);
		List<Map> checkMenus= params.getCheckMenus();
		for (int i = 0; i < checkMenus.size(); i++) {
			Map menu = checkMenus.get(i);
			SysUserOrg example = new SysUserOrg();
			example.setOrgId((Integer) menu.get("deptId"));
			example.setUserId(Integer.parseInt(userId));
			example.setIncludeSubordinate("Y");
			sysUserOrgMapper.insert(example);
		}
		return "success";
	}
	
	/**
	 * 用户机构授权
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/copyOrgWithUser")
	public @ResponseBody String copyOrgWithUser(HttpServletRequest request) throws Exception{
		String oldUserId = request.getParameter("oldUserId");
		String[] newUserId = request.getParameter("newUserId").split(",");
		try {
			for (int i = 0; i < newUserId.length; i++) {
				String sql1 = "select org_id from sys_user_org  where user_id='"+oldUserId+"' and org_id not in (select org_id from sys_user_org where user_id='"+newUserId[i]+"')";
				List<Map> maps1 = MybatisUtil.queryList("runtime.selectSql", sql1);
				for (Map map : maps1) {
					SysUserOrg org = new SysUserOrg();
					org.setIncludeSubordinate("Y");
					org.setOrgId(Integer.valueOf(map.get("org_id")+""));
					org.setUserId(Integer.valueOf(newUserId[i]));
					sysUserOrgMapper.insert(org);
				}
			}
			return "success";
		} catch (Exception e) {
			// TODO: handle exception
			return "fail";
		}
	}
	
	/**
	 * 用户机构授权 
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/saveOrgWithUsers")
	public @ResponseBody String saveOrgWithUsers(HttpServletRequest request,@RequestBody MenuDatas params) throws Exception{
		String userId = params.getRoleId()+"";
		SysUserOrgExample example1 = new SysUserOrgExample();
		example1.or().andUserIdEqualTo(Integer.parseInt(userId));
		sysUserOrgMapper.deleteByExample(example1);
		List<Map> checkMenus= params.getCheckMenus();
		for (int i = 0; i < checkMenus.size(); i++) {
			Map menu = checkMenus.get(i);
			SysUserOrg example = new SysUserOrg();
			String deptId = menu.get("deptId")+"";
			if(!ChangeCode.isInteger(menu.get("deptId")+"")){
				deptId = "'"+menu.get("deptId")+"'";
			}
			String sql="INSERT into sys_user_org(org_id,user_id,Include_Subordinate)  values "+
					"("+deptId+","+userId+",'"+"Y"+"')";
			MybatisUtil.insert("runtime.insertSql", sql);
         
		}
		return "success"; 
	}
	
	
	/**
	 * 用户机构授权
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/saveOrgViewWithUser")
	public @ResponseBody String saveOrgViewWithUser(HttpServletRequest request,@RequestBody MenuDatas params) throws Exception{
		String userId = params.getRoleId()+"";
		SysUserOrgExample example1 = new SysUserOrgExample();
		com.myehr.pojo.sysRole.SysUserOrgExample.Criteria criteria = example1.createCriteria();
		criteria.andUserIdEqualTo(Integer.parseInt(userId));
		sysUserOrgMapper.deleteByExample(example1);
		
		List<Map> checkMenus= params.getCheckMenus();
		String orgIds = "";
		for (int i = 0; i < checkMenus.size(); i++) {
			Map menu = checkMenus.get(i);
			orgIds += menu.get("orgid")+",";
			SysUserOrg example = new SysUserOrg();
			example.setOrgId((Integer) menu.get("orgid"));
			example.setUserId(Integer.parseInt(userId));
			example.setIncludeSubordinate("Y");
			sysUserOrgMapper.insert(example);
		}
		orgIds = orgIds.substring(0, orgIds.length()-1);
		JedisFactory factory = new  JedisFactory(new JedisPoolConfig());  
    	Jedis jedis = factory.getJedis(); 
    	jedis.set("orgIds_userId_"+userId,orgIds);
		return "success";
	}
	
	/**
	 * 查询角色人员列表
	 * @param request
	 * @param params
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryRoleUserList")
	public @ResponseBody ResultMapNew queryRoleUserList(HttpServletRequest request, @RequestBody CardformInitDataParams params) throws Exception{
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
		
		String deleteMark = (String) filter.get("deleteMark");
		String roleId = (String) requestParam.get("roleId");		
		
		String wheres="";
		
		String searchValue = (String) filter.get("searchValue");
		if (searchValue!=null && searchValue!="") {
			wheres += " and ( sys_user.user_code like "+" '%"+searchValue+"%' "+
					  "or sys_user.user_name like "+" '%"+searchValue+"%' )";
		}
		
		String sql = "select sys_user.user_id as userId, "+
					 " sys_user.user_code as userCode, "+
					 " sys_user.user_name as userName, "+
					 " sys_role.role_id as roleId, "+
					 " sys_role.role_code as roleCode, "+
					 " sys_role.role_name as roleName, "+
					 " SYS_USER_ROLE.OPERATOR_NAME as operatorName, "+
					 " SYS_USER_ROLE.OPERATOR_TIME as operatorTime "+
                     " from sys_user left join SYS_USER_ROLE on sys_user.user_id = SYS_USER_ROLE.user_id "+
                     " left join sys_role on SYS_USER_ROLE.role_id = sys_role.role_id "+
					 " where SYS_USER_ROLE.role_id = "+ roleId +wheres;
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
	
	
	/**
	 * 查询角色人员列表
	 * @param request
	 * @param params
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryRoleList")
	public @ResponseBody ResultMapNew queryRoleList(HttpServletRequest request, @RequestBody CardformInitDataParams params) throws Exception{
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
		
		String deleteMark = (String) filter.get("deleteMark");
		String roleId = (String) requestParam.get("roleId");		
		
		String wheres="";
		
		String searchValue = (String) filter.get("searchValue");
		if (searchValue!=null && searchValue!="") {
			wheres += " and ( sys_user.role_code like "+" '%"+searchValue+"%' "+
					  "or sys_user.role_name like "+" '%"+searchValue+"%' )";
		}
		
		String sql = "select sys_role.role_id as roleId, "+
					 " sys_role.role_id as roleId, "+
					 " sys_role.role_code as roleCode, "+
					 " sys_role.role_name as roleName "+
                     " from sys_role where 1 =1 " +wheres;
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
	
	/**
	 * 查询待选用户
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/querySelectUserList")
	public @ResponseBody ResultMapNew querySelectUserList(HttpServletRequest request,@RequestBody CardformInitDataParams params) throws Exception{
		Map requestParam = params.getRequestParam();
		String roleId = requestParam.get("roleId")+"";
		Map filter = params.getFilter();
		String searchValue = filter.get("searchValue")+"";
		String offset = params.getOffset();
		String limit = params.getLimit();
		Pager page = params.getPage();
		page = new Pager();
		if(offset==null&&limit==null){
			
		}else {
			int start=Integer.parseInt(offset);
			page.setStart(start); //不能设置为0
			page.setLimt(Integer.parseInt(limit));
		}
		
		ResultMapNew resultMap = new ResultMapNew();
		String searchColumn = "";
		if (searchValue!=null || !searchValue.equals("")) {
			searchColumn = " and (USER_CODE like '%"+searchValue+"%' or USER_NAME like '%"+searchValue+"%')";
		}
		
		String sql =  " select SYS_USER.USER_ID as userId, "+
				 " SYS_USER.USER_CODE as userCode, "+
				 " SYS_USER.USER_NAME as userName "+
				 " from SYS_USER"+
				 " where USER_ID not in (select USER_ID from sys_user_role where ROLE_ID =" + roleId+")"+searchColumn+
				 " order by SYS_USER.USER_ID";

		List<Map> sysRoleUsers = tMapperExt.queryByFormDefSql(sql);
		
		List<Map> datas = new ArrayList<Map>();
		
		int end = 0;
		if (page.getStart()+page.getLimt()>sysRoleUsers.size()) {
			end = sysRoleUsers.size();
		}else {
			end = page.getStart()+page.getLimt();
		}
		
		for (int i = page.getStart(); i < end; i++) {
			datas.add(sysRoleUsers.get(i));
		}
		
		resultMap.setRows(datas);
		resultMap.setTotal(sysRoleUsers.size());
		
		return  resultMap;
	}
	
	
	/**
	 * 角色用户授权
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/saveRoleUser")
	public @ResponseBody String saveRoleUser(HttpServletRequest request,@RequestBody MenuDatas params) throws Exception{
		long roleId = params.getRoleId();
		String userId = (BigDecimal)request.getSession().getAttribute("userid")+"";
		List<Map> checkUsers= params.getCheckMenus();
		
		for (int i = 0; i < checkUsers.size(); i++) {
			Map map = checkUsers.get(i);
			
			SysUserRole example = new SysUserRole();
			example.setUserId((Integer) map.get("userId"));
			example.setRoleId((int)roleId);
			example.setOperatorName(userId);
			example.setOperatorTime(new Date());
			sysUserRoleMapper.insert(example);
		}
		return "success";
	}
	
	@RequestMapping("/deleteRoleUser")
	public @ResponseBody String deleteRoleUser(HttpServletRequest request) throws Exception{
		String reCode = "";
		
		String userId = request.getParameter("userId");
		String roleId = request.getParameter("roleId");
		String[] menuIds = userId.split(",");
		List<Integer> values = new ArrayList<Integer>();
		for (int i = 0; i < menuIds.length; i++) {
			values.add(Integer.valueOf(menuIds[i]));
		}
		
		SysUserRoleExample example = new SysUserRoleExample();
		com.myehr.pojo.sysUserRole.SysUserRoleExample.Criteria criteria = example.createCriteria();
		criteria.andRoleIdEqualTo(Integer.valueOf(roleId));
		criteria.andUserIdIn(values);
		sysUserRoleMapper.deleteByExample(example);
				
		return reCode;
	}
	
	@RequestMapping("/initUserColumnAndButton")
	public @ResponseBody String initUserColumnAndButton(HttpServletRequest request) throws Exception{
		String reCode = "";
		
		String userId = request.getSession().getAttribute("userid")+"";
		String sql = "Select distinct FORM_ID from SYS_FIELD_ROLE where ROLE_ID in (Select ROLE_ID from SYS_USER_ROLE where USER_ID = "+userId+")";
		List<Map> formIds = null;
		try {
			formIds = MybatisUtil.queryList("runtime.selectSql", sql);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();logger.error(e.getMessage(),e);
		}
		for (int i = 0; i < formIds.size(); i++) {
			String formId = formIds.get(i).get("FORM_ID")+"";
			
			List<SysFormColumn> columns = sysFormColumnExpandMapper.queryColumnsByFormIdAndUserIdAll(formId,userId);
			List<Map> buttons = buttonService.queryFormButtonWithUserId(formId,userId);
			
			JedisFactory factory = new  JedisFactory( new  JedisPoolConfig());  
	    	Jedis jedis = factory.getJedis(); 
	    	jedis.set(("columnPower_"+formId).getBytes(), SerializeUtil.serializeList(columns));
	    	
	    	for (int j = 0; j < buttons.size(); j++) {
	    		jedis.set(("button_"+userId+"_"+formId).getBytes(), SerializeUtil.serializeList(columns));
			}
		}
		
		return reCode;
	}
	/**
	 * 复制角色权限
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/copyRolePower")
	public @ResponseBody String copyRolePower(HttpServletRequest request) throws Exception{
		String reCode = "";
		
		
		String type = request.getParameter("type");
		if (type.equals("1")) {
			String selectRoleIds = request.getParameter("selectRoleIds");
			String roleId = request.getParameter("roleId");
			String[] roleIds = selectRoleIds.split(",");
			SysMenuRoleExample example= new SysMenuRoleExample();
			example.or().andRoleIdEqualTo(new BigDecimal(roleId));
			List<SysMenuRole> roleMenus = sysMenuRoleMapper.selectByExample(example);
			
			for (int i = 0; i < roleIds.length; i++) {
				String selectRoleId = roleIds[i];
				for (int j = 0; j < roleMenus.size(); j++) {
					SysMenuRole roleMenu = roleMenus.get(j);
					roleMenu.setRoleId(new BigDecimal(selectRoleId));
					sysMenuRoleMapper.insert(roleMenu);
				}
			}
		}else if(type.equals("2")){
			String selectRoleIds = request.getParameter("selectRoleIds");
			String roleId = request.getParameter("roleId");
			String[] roleIds = selectRoleIds.split(",");
			SysFieldRoleExample example= new SysFieldRoleExample();
			example.or().andRoleIdEqualTo(new BigDecimal(roleId));
			List<SysFieldRole> roleFields = sysFieldRoleMapper.selectByExample(example);
			
			SysButtonRoleExample example1= new SysButtonRoleExample();
			example1.or().andRoleIdEqualTo(new BigDecimal(roleId));
			List<SysButtonRole> roleButtons = sysButtonRoleMapper.selectByExample(example1);
			
			for (int i = 0; i < roleIds.length; i++) {
				String selectRoleId = roleIds[i];
				for (int j = 0; j < roleFields.size(); j++) {
					SysFieldRole roleField = roleFields.get(j);
					roleField.setRoleId(new BigDecimal(selectRoleId));
					sysFieldRoleMapper.insert(roleField);
				}
				for (int j = 0; j < roleButtons.size(); j++) {
					SysButtonRole roleButton = roleButtons.get(j);
					roleButton.setRoleId(new BigDecimal(selectRoleId));
					sysButtonRoleMapper.insert(roleButton);
				}
			}
		}else if (type.equals("3")) {
			String selectUserIds = request.getParameter("selectUserIds");
			String userId = request.getParameter("userId");
			String[] userIds = selectUserIds.split(",");
			SysUserDictExample example= new SysUserDictExample();
			example.or().andUserIdEqualTo(new BigDecimal(userId));
			List<SysUserDict> userDicts = sysUserDictMapper.selectByExample(example);
			for (int i = 0; i < userIds.length; i++) {
				String selectUserId = userIds[i];
				for (int j = 0; j < userDicts.size(); j++) {
					SysUserDict userDict = userDicts.get(j);
					userDict.setUserId(new BigDecimal(selectUserId));
					sysUserDictMapper.insert(userDict);
				}
			}
		}
		
				
		return reCode;
	}
	
	/**
	 * 构建流程分类树
	 */
	@RequestMapping("/buildFlowTree")
	public @ResponseBody List<Map> buildFlowTree(HttpServletRequest request) throws Exception{
		
		List<Map> datas = new ArrayList<Map>();
		Map mapRoot=new HashMap();
		mapRoot.put("expanded", false);
		mapRoot.put("isLeaf", false);
		mapRoot.put("isParent", false); 
		mapRoot.put("open", false); 
		mapRoot.put("flowName", "流程管理");
		mapRoot.put("flowCode", "FlowRoot");
		mapRoot.put("flowType", "Root");
		mapRoot.put("flowParentCode", "");
		mapRoot.put("ORG_DEL", "N");
		datas.add(mapRoot);
		
		List<DictData> datas2 = sysformconfigService.getCardDictDataByDictTypeCode("act_flow_type", "dict");
		
		for (int i = 0; i < datas2.size(); i++) {
			String sql = "select distinct * from (select act_re_model.ID_ as id, " +
					" act_re_model.REV_ as rev, " +
					" act_re_model.NAME_ as name, " +
					" act_re_model.KEY_ as key_, " +
					" act_re_model.CATEGORY_ category, " +
					" act_re_model.CREATE_TIME_ as createTime, " +
					" act_re_model.LAST_UPDATE_TIME_ as lastUpdateTime, " +
					" act_re_model.VERSION_ as version, " +
					" act_re_model.META_INFO_ as metaInfo, " +
					" act_re_model.DEPLOYMENT_ID_ as deoloymentId, " +
					" act_re_model.EDITOR_SOURCE_VALUE_ID_ as editorSourceValueId, " +
					" act_re_model.EDITOR_SOURCE_EXTRA_VALUE_ID_ as editorSourceExtraValueId, " +
					" act_re_model.TENANT_ID_ as tenantId, " +
					" act_node_properties_expand.ACT_NODE_FORM_ID as actNodeFormId, " +
					" SYS_ACT_ROLE.ACTCODE AS QUANXIAN "+
					" from act_re_model left join act_node_properties_expand on act_re_model.id_ = act_node_properties_expand.ACT_MODEL_ID" +
					" LEFT JOIN SYS_ACT_ROLE ON act_re_model.id_ = SYS_ACT_ROLE.ACTID "+
					" where act_node_properties_expand.ACT_NODE_KEY = 'start' and act_re_model.CATEGORY_ ="+datas2.get(i).getCode() +
					" union select act_re_model.ID_ as id, " +
					" act_re_model.REV_ as rev, " +
					" act_re_model.NAME_ as name, " +
					" act_re_model.KEY_ as key_, " +
					" act_re_model.CATEGORY_ category, " +
					" act_re_model.CREATE_TIME_ as createTime, " +
					" act_re_model.LAST_UPDATE_TIME_ as lastUpdateTime, " +
					" act_re_model.VERSION_ as version, " +
					" act_re_model.META_INFO_ as metaInfo, " +
					" act_re_model.DEPLOYMENT_ID_ as deoloymentId, " +
					" act_re_model.EDITOR_SOURCE_VALUE_ID_ as editorSourceValueId, " +
					" act_re_model.EDITOR_SOURCE_EXTRA_VALUE_ID_ as editorSourceExtraValueId, " +
					" act_re_model.TENANT_ID_ as tenantId, " +
					" act_node_properties_expand.ACT_NODE_FORM_ID as actNodeFormId, " +
					" SYS_ACT_ROLE.ACTCODE AS QUANXIAN "+
					" from act_re_model left join act_node_properties_expand on act_re_model.id_ = act_node_properties_expand.ACT_MODEL_ID" +
					" LEFT JOIN SYS_ACT_ROLE ON act_re_model.id_ = SYS_ACT_ROLE.ACTID "+
					" where act_re_model.ID_ not in( select ACT_MODEL_ID from act_node_properties_expand ) and act_re_model.CATEGORY_ ="+datas2.get(i).getCode()+") t";
					
			          List<Map> lists = tMapperExt.queryByFormDefSql(sql);
			          boolean checked = false; 
			          boolean flag = true;
			          if (lists!=null) {
				          for(int j=0;j<lists.size();j++){
				        	String quanxian = lists.get(j).get("QUANXIAN")+"";  
				        	if (quanxian.equals("Y")) {
				        		checked = true;
							}else {
								flag = false;
							}  
				        	Map map1=new HashMap();
			        	    map1.put("expanded", false);
				  			map1.put("isLeaf", false);
				  			map1.put("isParent", false); 
				  			map1.put("open", false); 
				  			map1.put("checked", checked);
				  			map1.put("flowName", lists.get(j).get("name"));
				  			//map1.put("flowName",);
				  			map1.put("flowCode",lists.get(j).get("id"));
				  			map1.put("flowType",lists.get(j).get("id"));
				  			map1.put("flowDicCode", "");
				  			map1.put("flowParentCode", datas2.get(i).getCode());
				  			map1.put("ORG_DEL", "N");
				  			datas.add(map1);
				          }
					  }else {
						  flag = false;
					  }
			          Map map=new HashMap();
						map.put("expanded", false);
						map.put("isLeaf", false);
						map.put("isParent", false); 
						map.put("open", false); 
						map.put("checked", flag);
						map.put("flowName", datas2.get(i).getName());
						map.put("flowCode", datas2.get(i).getCode());
						map.put("flowType", datas2.get(i).getCode());
						map.put("flowDicCode", "");
						map.put("flowParentCode", "FlowRoot");
						map.put("ORG_DEL", "N");
						datas.add(map);
			
		}
		
		return  datas;
	}
	
	/**
	 * 流程授权
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/saveActWithUser")
	public @ResponseBody String saveActWithUser(HttpServletRequest request,@RequestBody MenuDatas params) throws Exception{
		String roleId = params.getRoleId()+"";
		SysActRoleExample example1=new SysActRoleExample();
		example1.or().andRoleidEqualTo(roleId);
		sysActRoleMapper.deleteByExample(example1);
		List<Map> checkMenus= params.getCheckMenus();
		for (int i = 0; i < checkMenus.size(); i++) {
			Map menu = checkMenus.get(i);
			SysActRole example = new SysActRole();
            example.setRoleid(roleId);
			example.setActcode("Y");
			example.setActid(menu.get("flowCode")+"");
			example.setActname(menu.get("name")+"");
			sysActRoleMapper.insert(example);
		}
		return "success";
	}
	
}
