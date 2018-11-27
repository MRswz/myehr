package com.myehr.controller.sysmenu;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.myehr.common.mybatis.MybatisUtil;
import com.myehr.common.mybatis.Pager;
import com.myehr.common.util.ExcelUtils;
import com.myehr.common.util.GetRequestJsonUtils;
import com.myehr.common.util.ResultMap;
import com.myehr.controller.dict.param.ResultMapNew;
import com.myehr.controller.form.parambean.CardformInitDataParams;
import com.myehr.controller.form.parambean.SaveButtonParams;
import com.myehr.mapper.formmanage.form.SysParamsComboboxsMapper;
import com.myehr.mapper.sysRole.SysRoleMapper;
import com.myehr.mapper.sysmenu.SysIconMapper;
import com.myehr.mapper.sysmenu.SysIconResourceExpandMapper;
import com.myehr.mapper.sysmenu.SysIconResourceMapper;
import com.myehr.mapper.sysmenu.SysMenuMapper;
import com.myehr.mapper.sysmenu.SysMenuParamMapper;
import com.myehr.mapper.sysmenu.SysSystemSchemeMapper;
import com.myehr.mapper.sysmenu.SysSystemSchemeMapperExpand;
import com.myehr.mapper.sysmenu.SysSystemSchemeMenuMapper;
import com.myehr.mapper.sysuser.SysUserMapper;
import com.myehr.pojo.dict.DictData;
import com.myehr.pojo.formmanage.form.SysParamsComboboxs;
import com.myehr.pojo.formmanage.form.SysParamsComboboxsExample;
import com.myehr.pojo.sysRole.SysRole;
import com.myehr.pojo.sysRole.SysRoleExample;
import com.myehr.pojo.sysmenu.SysIcon;
import com.myehr.pojo.sysmenu.SysIconExample;
import com.myehr.pojo.sysmenu.SysIconResource;
import com.myehr.pojo.sysmenu.SysIconResourceExample;
import com.myehr.pojo.sysmenu.SysIconResourceExpand;
import com.myehr.pojo.sysmenu.SysMenu;
import com.myehr.pojo.sysmenu.SysMenuExample;
import com.myehr.pojo.sysmenu.SysMenuParam;
import com.myehr.pojo.sysmenu.SysSystemScheme;
import com.myehr.pojo.sysmenu.SysSystemSchemeExample;
import com.myehr.pojo.sysmenu.SysSystemSchemeMenu;
import com.myehr.pojo.sysmenu.SysSystemSchemeMenuExample;
import com.myehr.pojo.sysmenu.SysSystemSchemeWithBLOBs;
import com.myehr.pojo.sysmenutree.SysMenuTree;
import com.myehr.pojo.sysmenutree.TreeByCode;
import com.myehr.pojo.sysuser.SysUser;
import com.myehr.pojo.sysuser.SysUserExample;
import com.myehr.service.formmanage.form.ISysformconfigService;
import com.myehr.service.impl.menu.SysMenuServiceImpl;
import com.myehr.service.impl.primaryKey.PrimaryKeyServiceImpl;
import com.myehr.service.primaryKey.PrimaryKeyService;
import com.myehr.test.dao.TMapperExt;

@Controller
@RequestMapping("/SysMenuList")
public class SysMenuListController {
	@Autowired
	private SysMenuServiceImpl serviceImpl;
	
//	@Autowired
	@Resource(name = "PrimaryKeyService")
	private PrimaryKeyService keyserviceImpl;
	
	@Autowired
	private SysSystemSchemeMapper sysSystemSchemeMapper;
	
	@Autowired
	private SysSystemSchemeMenuMapper sysSystemSchemeMenuMapper;
	
	@Autowired
	private SysUserMapper sysUserMapper;
	
	@Autowired
	private SysRoleMapper sysRoleMapper;
	
	@Autowired
	private SysMenuMapper sysMenuMapper;
	
	@Autowired
	private SysMenuParamMapper sysMenuParamMapper;
	
	@Autowired
	private SysIconResourceMapper sysIconResourceMapper;
	
	@Autowired
	private SysIconMapper sysIconMapper;
	
	@Autowired
	private SysSystemSchemeMapperExpand sysSystemSchemeMapperExpand;
	
	@Autowired
	private SysIconResourceExpandMapper sysIconResourceExpandMapper;
	@Autowired
	private ISysformconfigService sysformconfigService;
	@Autowired
	private SysParamsComboboxsMapper paramsMapper;

//	@Autowired
	@Resource(name = "TMapperExt")
	private TMapperExt tMapperExt;
	
	//查询
	@RequestMapping("/findSysMenuList")
	public @ResponseBody ResultMap findSysMenuList(HttpServletRequest request) throws Exception{
		SysMenuExample sExample=(SysMenuExample) JSONObject.toBean(GetRequestJsonUtils.getJsonObject(request), SysMenuExample.class);
		ResultMap resultMap=new ResultMap();
		resultMap=serviceImpl.findSysMenuAll(sExample);
		return resultMap;
	}
	
	
	@RequestMapping("/findSysMenuById")
	public @ResponseBody SysMenu findSysMenuById(HttpServletRequest request) throws Exception{
		String menuId = request.getParameter("menuId");
		Integer menuId1 = Integer.valueOf(menuId);
		SysMenuExample example = new SysMenuExample();
		com.myehr.pojo.sysmenu.SysMenuExample.Criteria criteria = example.createCriteria();
		criteria.andMenuIdEqualTo(menuId1);
		List<SysMenu> menus = sysMenuMapper.selectByExample(example);
		if (menus.size()>0) {
			return menus.get(0);
		}
		return null;
	}
	
	@RequestMapping("/findSysSchemeMenuById")
	public @ResponseBody SysSystemSchemeMenu findSysSchemeMenuById(HttpServletRequest request) throws Exception{
		String schemeMenuId = request.getParameter("schemeMenuId");
		SysSystemSchemeMenuExample example = new SysSystemSchemeMenuExample();
		com.myehr.pojo.sysmenu.SysSystemSchemeMenuExample.Criteria criteria = example.createCriteria();
		criteria.andSchemeMenuIdEqualTo(new BigDecimal(schemeMenuId));
		List<SysSystemSchemeMenu> menus = sysSystemSchemeMenuMapper.selectByExample(example);
		if (menus.size()>0) {
			return menus.get(0);
		}
		return null;
	}
	
	
	@RequestMapping("/findSysSystemSchemeById")
	public @ResponseBody SysSystemScheme findSysSystemSchemeById(HttpServletRequest request) throws Exception{
		String schemeId = request.getParameter("schemeId");
		SysSystemSchemeExample example = new SysSystemSchemeExample();
		com.myehr.pojo.sysmenu.SysSystemSchemeExample.Criteria criteria = example.createCriteria();
		criteria.andSchemeIdEqualTo(new BigDecimal(schemeId));
		List<SysSystemScheme> schemes = sysSystemSchemeMapper.selectByExample(example);
		if (schemes.size()>0) {
			return schemes.get(0);
		}
		return null;
	}
	
	@RequestMapping("/findSysSystemSchemeByUserId")
	public @ResponseBody List<SysSystemScheme> findSysSystemSchemeByUserId(HttpServletRequest request) throws Exception{
		String userId = request.getParameter("userId");
		if (userId.equals("1")) {
			SysSystemSchemeExample example = new SysSystemSchemeExample();
			List<SysSystemScheme> schemes = sysSystemSchemeMapper.selectByExample(example);
			return schemes;
		}else {
			List<SysSystemScheme> schemes = sysSystemSchemeMapperExpand.findSysSystemSchemeByUserId(userId+",");
			return schemes;
		}
	}
	
	@RequestMapping("/findSysIconById")
	public @ResponseBody SysIcon findSysIconById(HttpServletRequest request) throws Exception{
		String iconId = request.getParameter("iconId");
		SysIconExample example = new SysIconExample();
		com.myehr.pojo.sysmenu.SysIconExample.Criteria criteria = example.createCriteria();
		criteria.andIconIdEqualTo(new BigDecimal(iconId));
		List<SysIcon> icons = sysIconMapper.selectByExample(example);
		if (icons.size()>0) {
			return icons.get(0);
		}
		return null;
	}
	
	/**
	 * 查询菜单列表
	 * @param request
	 * @param params
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/querySysMenuList")
	public @ResponseBody ResultMapNew querySysMenuList(HttpServletRequest request, @RequestBody CardformInitDataParams params) throws Exception{
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
		String menuCode = (String) requestParam.get("menuCode");		
		
		String wheres="";
		if (menuCode!=null && menuCode.equals("MenuRoot")) {
			wheres += " and (sys_menu.MENU_PARENT_CODE = '"+menuCode+"' or sys_menu.MENU_PARENT_CODE is null) ";
		}else {
			wheres += " and sys_menu.MENU_PARENT_CODE = '"+menuCode+"' ";
		}
		if (deleteMark!=null && deleteMark!="") {
			wheres += " and sys_menu.DELETE_MARK = '"+deleteMark+"'";
		}
		String searchValue = (String) filter.get("searchValue");
		if (searchValue!=null && searchValue!="") {
			wheres += " and ( sys_menu.MENU_CODE like "+" '%"+searchValue+"%' "+
					  "or sys_menu.MENU_NAME like "+" '%"+searchValue+"%' )";
		}
		
		String sql = "select sys_menu.MENU_ID as menuId, "+
					 " sys_menu.MENU_CODE as menuCode, "+
					 " sys_menu.MENU_NAME as menuName, "+
					 " sys_menu.MENU_TYPE as menuType, "+
					 " sys_menu.MENU_DIC_CODE as menuDicCode, "+
					 " sys_menu.MENU_PARENT_CODE as menuParentCode, "+
					 " sys_menu.MENU_SORT as menuSort, "+
					 " sys_menu.MENU_SEQ as menuSeq, "+
					 " sys_menu.OPERATOR_NAME as operatorName, "+
					 " sys_menu.OPERATOR_TIME as operatorTime, "+
					 " sys_menu.DELETE_MARK as deleteMark, "+
					 " sys_menu.DELETE_MARK_BACK as deleteMarkBack, "+
					 " sys_user.user_name as userName "+
                     " from sys_menu left join sys_user on sys_menu.operator_name = sys_user.user_id "+
					 " where 1=1 "+wheres
					 +" order by sys_menu.MENU_SORT";
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
	 * 通过Id查询菜单
	 * @param request
	 * @param params
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/querySysMenuById")
	public @ResponseBody Map querySysMenuById(HttpServletRequest request) throws Exception{
		String menuId = request.getParameter("menuId");
		
		String sql = "select sys_menu.MENU_ID as menuId, "+
				 " sys_menu.MENU_CODE as menuCode, "+
				 " sys_menu.MENU_NAME as menuName, "+
				 " sys_menu.MENU_TYPE as menuType, "+
				 " sys_menu.MENU_DIC_CODE as menuDicCode, "+
				 " sys_menu.MENU_PARENT_CODE as menuParentCode, "+
				 " sys_menu.MENU_SORT as menuSort, "+
				 " sys_menu.MENU_SEQ as menuSeq, "+
				 " sys_menu.OPERATOR_NAME as operatorName, "+
				 " sys_menu.OPERATOR_TIME as operatorTime, "+
				 " sys_menu.DELETE_MARK as deleteMark, "+
				 " sys_menu.DELETE_MARK_BACK as deleteMarkBack, "+
				 " sys_menu.MENU_FORM_ID as menuFormId, "+
				 " sys_menu.MENU_DESC as menuDesc, "+
				 " sys_menu.MENU_URL as menuUrl, "+
				 " sys_menu.MENU_IS_DYNAMIC_FORM as menuIsDynamicForm, "+
				 " sys_formconfig.form_def_name as formDefName "+
                " from sys_menu left join sys_formconfig on cast(sys_menu.MENU_FORM_ID as int) = sys_formconfig.form_def_id "+
				 " where sys_menu.MENU_ID = "+menuId
				 +" order by sys_menu.MENU_SORT";
		List<Map> sysMenus = tMapperExt.queryByFormDefSql(sql);
		
		if (sysMenus.size()>0) {
			return sysMenus.get(0);
		}
		return null;
	}
	
	/**
	 * 通过Id查询菜单
	 * @param request
	 * @param params
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryMenuParamByMenuId")
	public @ResponseBody ResultMapNew queryMenuParamByMenuId(HttpServletRequest request) throws Exception{
		String menuId = request.getParameter("menuId");
		
		String sql = "select SYS_MENU_PARAM.MENU_PARAM_ID as menuParamId, "+
				 " SYS_MENU_PARAM.MENU_ID as menuId, "+
				 " SYS_MENU_PARAM.MENU_PARAM_NAME as menuParamName, "+
				 " SYS_MENU_PARAM.MENU_PARAM_DESC as menuParamDesc, "+
				 " SYS_MENU_PARAM.MENU_PARAM_FROM as menuParamFrom, "+
				 " SYS_MENU_PARAM.MENU_PARAM_VALUE as menuParamValue, "+
				 " SYS_MENU_PARAM.MENU_PARAM_CLASS as menuParamClass, "+
				 " SYS_MENU_PARAM.MENU_PARAM_TYPE as menuParamType, "+
				 " SYS_MENU_PARAM.OPERATOR_NAME as operatorName, "+
				 " SYS_MENU_PARAM.OPERATOR_TIME as operatorTime "+
                 " from SYS_MENU_PARAM "+
				 " where SYS_MENU_PARAM.MENU_ID = "+menuId;
		List<Map> sysMenuParams = tMapperExt.queryByFormDefSql(sql);
		
		ResultMapNew resultMap=new ResultMapNew();
		

		resultMap.setTotal(sysMenuParams.size());
		resultMap.setRows(sysMenuParams);
		return resultMap;
	}
	
	/**
	 * 保存菜单信息
	 * @param request
	 * @param params
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/saveSysMenuNew")
	public @ResponseBody String saveSysMenuNew(HttpServletRequest request, @RequestBody SaveButtonParams params) throws Exception{
		String menuJson = "";
		
		Map param = params.getParam();
		Map paramsMap = params.getParamsMap();
		int reCode = 0;
		
		String menuId = (String) param.get("menuId");
		SysMenu sysMenu = new SysMenu();
		String menuFormId = (String) param.get("menuFormId");
		
		if (menuId==null || menuId=="") {
			if(menuFormId==""||menuFormId.equals("")){
				sysMenu.setMenuFormId("");
			}else {
				sysMenu.setMenuFormId(menuFormId);
			}
			sysMenu.setMenuParentCode((String) param.get("menuParentCode"));
			sysMenu.setMenuSeq((String) param.get("menuSeq")+"."+(String) param.get("menuCode"));
			sysMenu.setMenuCode((String) param.get("menuCode"));
			sysMenu.setMenuName((String) param.get("menuName"));
			sysMenu.setMenuType((String) param.get("menuType"));
			sysMenu.setMenuSort(Float.valueOf((String) param.get("menuSort")));
			sysMenu.setMenuDicCode((String) param.get("menuDicCode"));
			sysMenu.setMenuIsDynamicForm((String) param.get("menuIsDynamicForm"));
			sysMenu.setMenuUrl((String) param.get("menuUrl"));
			sysMenu.setMenuDesc((String) param.get("menuDesc"));
			sysMenu.setDeleteMark("N");
			sysMenu.setDeleteMarkBack("N");
			sysMenu.setOperatorName((String) paramsMap.get("userId"));
			sysMenu.setOperatorTime(new Date());
			reCode = sysMenuMapper.insert(sysMenu);
		}else {
			SysMenuExample example = new SysMenuExample();
			com.myehr.pojo.sysmenu.SysMenuExample.Criteria criteria = example.createCriteria();
			criteria.andMenuIdEqualTo(Integer.valueOf(menuId));
			List<SysMenu> sysMenus = sysMenuMapper.selectByExample(example);
			if (sysMenus.size()>0) {
				sysMenu = sysMenus.get(0);
			}
			if(menuFormId==""||menuFormId.equals("")){
				sysMenu.setMenuFormId(null);
			}else {
				sysMenu.setMenuFormId(menuFormId);
			}
			sysMenu.setMenuId(Integer.valueOf(menuId));
			sysMenu.setMenuParentCode((String) param.get("menuParentCode"));
			sysMenu.setMenuSeq((String) param.get("menuSeq"));
			sysMenu.setMenuCode((String) param.get("menuCode"));
			sysMenu.setMenuName((String) param.get("menuName"));
			sysMenu.setMenuType((String) param.get("menuType"));
			sysMenu.setMenuSort(Float.valueOf((String) param.get("menuSort")));
			sysMenu.setMenuDicCode((String) param.get("menuDicCode"));
			sysMenu.setMenuIsDynamicForm((String) param.get("menuIsDynamicForm"));
			if(sysMenu.getMenuIsDynamicForm()==null||!sysMenu.getMenuIsDynamicForm().equals("Y")){
				sysMenu.setMenuUrl((String) param.get("menuUrl"));
			}else {
				sysMenu.setMenuUrl(null);
			}
			
			sysMenu.setMenuDesc((String) param.get("menuDesc"));
			sysMenu.setOperatorName((String) paramsMap.get("userId"));
			sysMenu.setOperatorTime(new Date());
			reCode = sysMenuMapper.updateByPrimaryKey(sysMenu);
		}
		
		return menuJson;
	}
	
	/**
	 * 查询菜单图标列表
	 * @param request
	 * @param params
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/querySysMenuIconList")
	public @ResponseBody SysMenuIconResultMap querySysMenuIconList(HttpServletRequest request, @RequestBody CardformInitDataParams params) throws Exception{
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
		
		String menuCode = (String) requestParam.get("menuCode");
		String searchValue = (String) filter.get("searchValue");
		
		
		SysMenuIconResultMap resultMap=new SysMenuIconResultMap();
		/*SysIconResourceExample example = new SysIconResourceExample();
		com.myehr.pojo.sysmenu.SysIconResourceExample.Criteria criteria = example.createCriteria();
		if (menuCode.equals("MenuRoot")) {
			criteria.andIconCodeIsNull();
		}else {
			criteria.andIconCodeEqualTo(menuCode);
		}
		
		if (searchValue !="" && searchValue!=null) {
			criteria.andIconCodeLike("%"+searchValue+"%");
			example.or().andIconNameLike("%"+searchValue+"%");
		}*/
		
		List<SysIconResourceExpand> menus = sysIconResourceExpandMapper.findMenuIconByMenuCode(menuCode);
		
		List<SysIconResourceExpand> menuList = new ArrayList<SysIconResourceExpand>();
		int end = 0;
		if (page.getStart()+page.getLimt()>menus.size()) {
			end = menus.size();
		}else {
			end = page.getStart()+page.getLimt();
		}
		
		for (int i = page.getStart(); i < end; i++) {
			menuList.add(menus.get(i));
		}

		resultMap.setTotal(menus.size());
		resultMap.setRows(menuList);
		return resultMap;
	}
	
	
	/**
	 * 查询菜单图标列表
	 * @param request
	 * @param params
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryAllSysMenuIconList")
	public @ResponseBody SysIconResultMap queryAllSysMenuIconList(HttpServletRequest request, @RequestBody CardformInitDataParams params) throws Exception{
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
		
		String searchValue = (String) filter.get("searchValue");
		String iconId = (String) requestParam.get("iconId");
		
		
		SysIconResultMap resultMap=new SysIconResultMap();
		SysIconExample example = new SysIconExample();
		com.myehr.pojo.sysmenu.SysIconExample.Criteria criteria = example.createCriteria();
		if (iconId.equals("iconManage")) {
			
		}else if (iconId.equals("cssIcon")) {
			criteria.andIconTypeEqualTo("1");
		}else if (iconId.equals("imgIcon")) {
			criteria.andIconTypeEqualTo("2");
		}else { 
			criteria.andIconIdEqualTo(new BigDecimal(iconId));
		}
		
		if (searchValue!=null || searchValue!="") {
			criteria.andIconNameLike("%"+searchValue+"%");
		}
		
		List<SysIcon> icons = sysIconMapper.selectByExample(example);
		
		List<SysIcon> iconList = new ArrayList<SysIcon>();
		int end = 0;
		if (page.getStart()+page.getLimt()>icons.size()) {
			end = icons.size();
		}else {
			end = page.getStart()+page.getLimt();
		}
		
		for (int i = page.getStart(); i < end; i++) {
			iconList.add(icons.get(i));
		}

		resultMap.setTotal(icons.size());
		resultMap.setRows(iconList);
		return resultMap;
	}
	
	@RequestMapping("/deleteIcon")
	public @ResponseBody String deleteIcon(HttpServletRequest request) throws Exception{
		String reCode = "";
		
		String iconId = request.getParameter("iconId");
		String[] iconIds = iconId.split(",");
		for (int i = 0; i < iconIds.length; i++) {
			reCode = sysIconMapper.deleteByPrimaryKey(new BigDecimal(iconIds[i]))+"";
		}	
		return reCode;
	}
	
	
	/**
	 * 查询方案菜单列表
	 * @param request
	 * @param params
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/querySchemeMenuList")
	public @ResponseBody SysSchemeMenuResultMap querySchemeMenuList(HttpServletRequest request, @RequestBody CardformInitDataParams params) throws Exception{
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
		
		String schemeId = (String) requestParam.get("schemeId");
		String searchValue = (String) filter.get("searchValue");
		
		
		SysSchemeMenuResultMap resultMap=new SysSchemeMenuResultMap();
		SysSystemSchemeMenuExample example = new SysSystemSchemeMenuExample();
		com.myehr.pojo.sysmenu.SysSystemSchemeMenuExample.Criteria criteria = example.createCriteria();
		if (schemeId ==null || schemeId =="") {
			
		}else {
			criteria.andSysSystemSchemeIdEqualTo(new BigDecimal(schemeId));
		}
		
		if (searchValue !="" && searchValue!=null) {
			criteria.andMenuCodeLike("%"+searchValue+"%");
			example.or().andMenuNameLike("%"+searchValue+"%");
		}
		
		List<SysSystemSchemeMenu> menus = sysSystemSchemeMenuMapper.selectByExample(example);
		
		List<SysSystemSchemeMenu> menuList = new ArrayList<SysSystemSchemeMenu>();
		int end = 0;
		if (page.getStart()+page.getLimt()>menus.size()) {
			end = menus.size();
		}else {
			end = page.getStart()+page.getLimt();
		}
		
		for (int i = page.getStart(); i < end; i++) {
			menuList.add(menus.get(i));
		}

		resultMap.setTotal(menus.size());
		resultMap.setRows(menuList);
		return resultMap;
	}
	
	/**
	 * 查询方案用户列表
	 * @param request
	 * @param params
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/querySchemeUserList")
	public @ResponseBody SysSchemeUserResultMap querySchemeUserList(HttpServletRequest request, @RequestBody CardformInitDataParams params) throws Exception{
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
		
		String schemeId = (String) requestParam.get("schemeId");
		SysSystemSchemeExample example1 = new SysSystemSchemeExample();
		com.myehr.pojo.sysmenu.SysSystemSchemeExample.Criteria criteria1 = example1.createCriteria();
		if (schemeId=="" || schemeId==null) {
			
		}else {
			criteria1.andSchemeIdEqualTo(new BigDecimal(schemeId));
		}
		
		List<SysSystemSchemeWithBLOBs> schemes = sysSystemSchemeMapper.selectByExampleWithBLOBs(example1);
		
		String userIds = schemes.get(0).getSchemeUserIds();
		String searchValue = (String) filter.get("searchValue");
		
		
		List<Integer> values = new ArrayList<Integer>();
		values.add(1);
		if (userIds!=null && userIds!="") {
			String[] aa=userIds.split(",");
			for (int i = 0; i < aa.length; i++) {
				if (aa[i]!="" && aa[i]!=null) {
					values.add(Integer.valueOf(aa[i]));
				}
			}
		}
		
		SysSchemeUserResultMap resultMap=new SysSchemeUserResultMap();
		SysUserExample example = new SysUserExample();
		com.myehr.pojo.sysuser.SysUserExample.Criteria criteria = example.createCriteria();
		criteria.andUserIdIn(values);
		
		if (searchValue !="" && searchValue!=null) {
			criteria.andUserCodeLike("%"+searchValue+"%");
			example.or().andUserNameLike("%"+searchValue+"%");
		}
		
		List<SysUser> users = sysUserMapper.selectByExample(example);
		
		List<SysUser> userList = new ArrayList<SysUser>();
		int end = 0;
		if (page.getStart()+page.getLimt()>users.size()) {
			end = users.size();
		}else {
			end = page.getStart()+page.getLimt();
		}
		
		for (int i = page.getStart(); i < end; i++) {
			userList.add(users.get(i));
		}

		resultMap.setTotal(users.size());
		resultMap.setRows(userList);
		return resultMap;
	}
	
	/**
	 * 查询方案角色列表
	 * @param request
	 * @param params
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/querySchemeRoleList")
	public @ResponseBody SysSchemeRoleResultMap querySchemeRoleList(HttpServletRequest request, @RequestBody CardformInitDataParams params) throws Exception{
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
		
		String schemeId = (String) requestParam.get("schemeId");
		SysSystemSchemeExample example1 = new SysSystemSchemeExample();
		com.myehr.pojo.sysmenu.SysSystemSchemeExample.Criteria criteria1 = example1.createCriteria();
		if (schemeId=="" || schemeId==null) {
			
		}else {
			criteria1.andSchemeIdEqualTo(new BigDecimal(schemeId));
		}
		
		List<SysSystemSchemeWithBLOBs> schemes = sysSystemSchemeMapper.selectByExampleWithBLOBs(example1);
		
		String roleIds = schemes.get(0).getSchemeRoleIds();
		String searchValue = (String) filter.get("searchValue");
		
		
		List<BigDecimal> values = new ArrayList<BigDecimal>();
		values.add(new BigDecimal(229));
		if (roleIds!=null && roleIds!="") {
			String[] aa=roleIds.split(",");
			for (int i = 0; i < aa.length; i++) {
				if (aa[i]!="" && aa[i]!=null) {
					values.add(new BigDecimal(aa[i]));
				}
			}
		}
		
		SysSchemeRoleResultMap resultMap=new SysSchemeRoleResultMap();
		SysRoleExample example = new SysRoleExample();
		com.myehr.pojo.sysRole.SysRoleExample.Criteria criteria = example.createCriteria();
		criteria.andRoleIdIn(values);
		
		if (searchValue !="" && searchValue!=null) {
			criteria.andRoleCodeLike("%"+searchValue+"%");
			example.or().andRoleNameLike("%"+searchValue+"%");
		}
		
		List<SysRole> users = sysRoleMapper.selectByExample(example);
		
		List<SysRole> userList = new ArrayList<SysRole>();
		int end = 0;
		if (page.getStart()+page.getLimt()>users.size()) {
			end = users.size();
		}else {
			end = page.getStart()+page.getLimt();
		}
		
		for (int i = page.getStart(); i < end; i++) {
			userList.add(users.get(i));
		}

		resultMap.setTotal(users.size());
		resultMap.setRows(userList);
		return resultMap;
	}
	
	
	/**
	 * 查询方案用户列表
	 * @param request
	 * @param params
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryUserList")
	public @ResponseBody SysSchemeUserResultMap queryUserList(HttpServletRequest request, @RequestBody CardformInitDataParams params) throws Exception{
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
		String searchValue = (String) filter.get("searchValue");
		
		SysSchemeUserResultMap resultMap=new SysSchemeUserResultMap();
		SysUserExample example = new SysUserExample();
		com.myehr.pojo.sysuser.SysUserExample.Criteria criteria = example.createCriteria();
		
		if (searchValue !="" && searchValue!=null) {
			criteria.andUserCodeLike("%"+searchValue+"%");
			example.or().andUserNameLike("%"+searchValue+"%");
		}
		
		List<SysUser> users = sysUserMapper.selectByExample(example);
		
		List<SysUser> userList = new ArrayList<SysUser>();
		int end = 0;
		if (page.getStart()+page.getLimt()>users.size()) {
			end = users.size();
		}else {
			end = page.getStart()+page.getLimt();
		}
		
		for (int i = page.getStart(); i < end; i++) {
			userList.add(users.get(i));
		}

		resultMap.setTotal(users.size());
		resultMap.setRows(userList);
		return resultMap;
	}
	
	
	/**
	 * 查询待选方案角色列表
	 * @param request
	 * @param params
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryRoleList")
	public @ResponseBody SysSchemeRoleResultMap queryRoleList(HttpServletRequest request, @RequestBody CardformInitDataParams params) throws Exception{
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
		String searchValue = (String) filter.get("searchValue");
		
		SysSchemeRoleResultMap resultMap=new SysSchemeRoleResultMap();
		SysRoleExample example = new SysRoleExample();
		com.myehr.pojo.sysRole.SysRoleExample.Criteria criteria = example.createCriteria();
		
		if (searchValue !="" && searchValue!=null) {
			criteria.andRoleCodeLike("%"+searchValue+"%");
			example.or().andRoleNameLike("%"+searchValue+"%");
		}
		
		List<SysRole> roles = sysRoleMapper.selectByExample(example);
		
		List<SysRole> roleList = new ArrayList<SysRole>();
		int end = 0;
		if (page.getStart()+page.getLimt()>roles.size()) {
			end = roles.size();
		}else {
			end = page.getStart()+page.getLimt();
		}
		
		for (int i = page.getStart(); i < end; i++) {
			roleList.add(roles.get(i));
		}

		resultMap.setTotal(roles.size());
		resultMap.setRows(roleList);
		return resultMap;
	}
	
	/**
	 * 查询方案列表
	 * @param request
	 * @param params
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/querySysSchemeList")
	public @ResponseBody SysSchemeResultMap querySysSchemeList(HttpServletRequest request, @RequestBody CardformInitDataParams params) throws Exception{
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
		
		String schemeCode = (String) requestParam.get("schemeCode");
		String searchValue = (String) filter.get("searchValue");
		
		
		SysSchemeResultMap resultMap=new SysSchemeResultMap();
		SysSystemSchemeExample example = new SysSystemSchemeExample();
		com.myehr.pojo.sysmenu.SysSystemSchemeExample.Criteria criteria = example.createCriteria();
		if (schemeCode.equals("MenuRoot")) {
			
		}else {
			criteria.andSchemeCodeEqualTo(schemeCode);
		}
		
		if (searchValue !="" && searchValue!=null) {
			criteria.andSchemeCodeLike("%"+searchValue+"%");
			example.or().andSchemeNameLike("%"+searchValue+"%");
		}
		
		List<SysSystemScheme> menus = sysSystemSchemeMapper.selectByExample(example);
		
		List<SysSystemScheme> menuList = new ArrayList<SysSystemScheme>();
		int end = 0;
		if (page.getStart()+page.getLimt()>menus.size()) {
			end = menus.size();
		}else {
			end = page.getStart()+page.getLimt();
		}
		
		for (int i = page.getStart(); i < end; i++) {
			menuList.add(menus.get(i));
		}

		resultMap.setTotal(menus.size());
		resultMap.setRows(menuList);
		return resultMap;
	}
	
	/**
	 * 查询所有方案列表
	 * @param request
	 * @param params
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryAllSysSchemeList")
	public @ResponseBody SysSchemeResultMap queryAllSysSchemeList(HttpServletRequest request, @RequestBody CardformInitDataParams params) throws Exception{
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
		
		String schemeCode = (String) requestParam.get("schemeCode");
		String searchValue = (String) filter.get("searchValue");
		
		
		SysSchemeResultMap resultMap=new SysSchemeResultMap();
		SysSystemSchemeExample example = new SysSystemSchemeExample();
		com.myehr.pojo.sysmenu.SysSystemSchemeExample.Criteria criteria = example.createCriteria();
		
		if (searchValue !="" && searchValue!=null) {
			criteria.andSchemeCodeLike("%"+searchValue+"%");
			example.or().andSchemeNameLike("%"+searchValue+"%");
		}
		
		List<SysSystemScheme> menus = sysSystemSchemeMapper.selectByExample(example);
		
		List<SysSystemScheme> menuList = new ArrayList<SysSystemScheme>();
		int end = 0;
		if (page.getStart()+page.getLimt()>menus.size()) {
			end = menus.size();
		}else {
			end = page.getStart()+page.getLimt();
		}
		
		for (int i = page.getStart(); i < end; i++) {
			menuList.add(menus.get(i));
		}

		resultMap.setTotal(menus.size());
		resultMap.setRows(menuList);
		return resultMap;
	}
	
	@RequestMapping("/saveSysMenu")
	public @ResponseBody int saveSysMenu(HttpServletRequest request, @RequestBody SaveButtonParams params) throws Exception{
		Map param = params.getParam();
		Map paramsMap = params.getParamsMap();
		
		SysMenu sysmenu = new SysMenu();
		sysmenu.setMenuId(Integer.valueOf((String) param.get("menuId")));
		sysmenu.setMenuCode((String) param.get("menuCode"));
		sysmenu.setMenuName((String) param.get("menuName"));
		sysmenu.setMenuType((String) param.get("menuType"));
		sysmenu.setMenuParentCode((String) param.get("menuParentCode"));
		sysmenu.setMenuSort(Float.valueOf((String) param.get("menuSort")));
		sysmenu.setOperatorName((String) paramsMap.get("userId"));
		sysmenu.setOperatorTime(new Date());

		int reCode = sysMenuMapper.updateByPrimaryKey(sysmenu);
		
		return reCode;
	}
	
	@RequestMapping("/saveSysSchemeMenu")
	public @ResponseBody int saveSysSchemeMenu(HttpServletRequest request, @RequestBody SaveButtonParams params) throws Exception{
		Map param = params.getParam();
		Map paramsMap = params.getParamsMap();
		String schemeMenuId = (String) param.get("schemeMenuId");
		SysSystemSchemeMenuExample example = new SysSystemSchemeMenuExample();
		com.myehr.pojo.sysmenu.SysSystemSchemeMenuExample.Criteria criteria = example.createCriteria();
		criteria.andSchemeMenuIdEqualTo(new BigDecimal(schemeMenuId));
		List<SysSystemSchemeMenu> menus = sysSystemSchemeMenuMapper.selectByExample(example);
		SysSystemSchemeMenu schemeMenu = menus.get(0);
		
		schemeMenu.setMenuName((String) param.get("menuName"));
		

		int reCode = sysSystemSchemeMenuMapper.updateByPrimaryKey(schemeMenu);
		
		return reCode;
	}
	
	@RequestMapping("/saveSysIcon")
	public @ResponseBody int saveSysIcon(HttpServletRequest request, @RequestBody SaveButtonParams params) throws Exception{
		Map param = params.getParam();
		Map paramsMap = params.getParamsMap();
		int reCode = 0;
		
		String iconId = (String) param.get("iconId");
		SysIcon sysicon = new SysIcon();
		if (iconId==null || iconId=="") {
			sysicon.setIconType((String) param.get("iconType"));
			sysicon.setIconName((String) param.get("iconName"));
			sysicon.setImgFile((String) param.get("imgFile"));
			sysicon.setCheckedImgFile((String) param.get("checkedImgFile"));
			String iconColor=(String) param.get("iconColor");
			String checkedIconColor=(String) param.get("checkedIconColor");
			if (iconColor==null || iconColor=="") {
				iconColor="black";
			}
			if (checkedIconColor==null || checkedIconColor=="") {
				checkedIconColor="blue";
			}
			sysicon.setIconColor(iconColor);
			sysicon.setCheckedIconColor(checkedIconColor);
			sysicon.setImgOpacity((String) param.get("imgOpacity"));
			reCode = sysIconMapper.insert(sysicon);
		}else {
			sysicon.setIconId(new BigDecimal((String) param.get("iconId")));
			sysicon.setIconType((String) param.get("iconType"));
			sysicon.setIconName((String) param.get("iconName"));
			sysicon.setImgFile((String) param.get("imgFile"));
			sysicon.setCheckedImgFile((String) param.get("checkedImgFile"));
			sysicon.setIconColor((String) param.get("iconColor"));
			sysicon.setCheckedIconColor((String) param.get("checkedIconColor"));
			reCode = sysIconMapper.updateByPrimaryKey(sysicon);
		}
		return reCode;
	}
	
	@RequestMapping("/saveSysSystemScheme")
	public @ResponseBody int saveSysSystemScheme(HttpServletRequest request, @RequestBody SaveButtonParams params) throws Exception{
		Map param = params.getParam();
		Map paramsMap = params.getParamsMap();
		int reCode = 0;
		
		String schemeId = (String) param.get("schemeId");
		SysSystemSchemeWithBLOBs sysSystemScheme = new SysSystemSchemeWithBLOBs();
		if (schemeId==null || schemeId=="") {
			sysSystemScheme.setSchemeName((String) param.get("schemeName"));
			sysSystemScheme.setSchemeCode((String) param.get("schemeCode"));
			sysSystemScheme.setSchemeDefType((String) param.get("schemeDefType"));
			sysSystemScheme.setSystemTitle((String) param.get("systemTitle"));
			sysSystemScheme.setSystemLog((String) param.get("systemLog"));
			sysSystemScheme.setDeviceType((String) param.get("deviceType"));
			sysSystemScheme.setSchemeLevel(new BigDecimal(1));
			sysSystemScheme.setStatus((String) param.get("status"));
			sysSystemScheme.setDeskType((String) param.get("deskType"));
			sysSystemScheme.setSchemeSource((String) param.get("schemeSource"));

			reCode = sysSystemSchemeMapper.insert(sysSystemScheme);
		}else {
			SysSystemSchemeWithBLOBs sysSystemSchemeWithBLOBs = new SysSystemSchemeWithBLOBs();
			sysSystemSchemeWithBLOBs.setSchemeId(new BigDecimal(schemeId));
			sysSystemSchemeWithBLOBs.setSchemeName((String) param.get("schemeName"));
			sysSystemSchemeWithBLOBs.setSchemeCode((String) param.get("schemeCode"));
			sysSystemSchemeWithBLOBs.setSchemeDefType((String) param.get("schemeDefType"));
			sysSystemSchemeWithBLOBs.setSystemTitle((String) param.get("systemTitle"));
			sysSystemSchemeWithBLOBs.setSystemLog((String) param.get("systemLog"));
			sysSystemSchemeWithBLOBs.setDeviceType((String) param.get("deviceType"));
			sysSystemSchemeWithBLOBs.setSchemeLevel(new BigDecimal(1));
			sysSystemSchemeWithBLOBs.setStatus((String) param.get("status"));
			sysSystemSchemeWithBLOBs.setDeskType((String) param.get("deskType"));
			sysSystemSchemeWithBLOBs.setSchemeSource((String) param.get("schemeSource"));

			reCode = sysSystemSchemeMapper.updateByPrimaryKey(sysSystemSchemeWithBLOBs);
		}
		return reCode;
	}
	
	/**
	 * 构建系统菜单树
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/buildSysMenuTree")
	public @ResponseBody List<Map> buildSysMenuTree(HttpServletRequest request) throws Exception{
		SysMenuExample example = new SysMenuExample();
		com.myehr.pojo.sysmenu.SysMenuExample.Criteria criteria = example.createCriteria();
		//criteria.andDictTypeCodeEqualTo("restCalendarTree");
		example.setOrderByClause("MENU_SORT");
		List<SysMenu> menus = sysMenuMapper.selectByExample(example);
		
		List<Map> datas = new ArrayList<Map>();
		Map mapRoot=new HashMap();
		mapRoot.put("expanded", false);
		mapRoot.put("isLeaf", false);
		mapRoot.put("isParent", false); 
		mapRoot.put("open", false); 
		mapRoot.put("menuName", "菜单管理");
		mapRoot.put("menuSeq", "");
		mapRoot.put("menuCode", "MenuRoot");
		mapRoot.put("menuType", "Root");
		mapRoot.put("menuDicCode", "Root");
		mapRoot.put("menuParentCode", "");
		mapRoot.put("ORG_DEL", "N");
		mapRoot.put("PARENT_CODE", "ROOT"); 
		datas.add(mapRoot);
		for (int i = 0; i < menus.size(); i++) {
			String menuParentCode = menus.get(i).getMenuParentCode();
			if (menuParentCode == null) {
				menuParentCode = "MenuRoot";
			}else if(menuParentCode.equals("")){
				menuParentCode = "MenuRoot";
			}
			Map map=new HashMap();
			map.put("expanded", false);
			map.put("isLeaf", false);
			map.put("isParent", false); 
			map.put("open", false); 
			map.put("menuId", menus.get(i).getMenuId());
			map.put("menuName", menus.get(i).getMenuName());
			map.put("menuCode", menus.get(i).getMenuCode());
			map.put("menuSeq", menus.get(i).getMenuSeq());
			map.put("menuType", menus.get(i).getMenuType());
			map.put("menuDicCode", menus.get(i).getMenuDicCode());
			map.put("menuParentCode", menuParentCode);
			map.put("ORG_DEL", "N");
			map.put("PARENT_CODE", "ROOT"); 
			datas.add(map);
		}
		
		return  datas;
	}
	
	/**
	 * 构建角色机构树
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/buildRoleOrgTree")
	public @ResponseBody List<Map> buildRoleOrgTree(HttpServletRequest request) throws Exception{
		String sql = "SELECT  *  FROM  dbo.ORG_V_ORGANIZATION";
		List<Map> orgList = tMapperExt.queryByFormDefSql(sql);
		
		String sql1 = "select * from SYS_ORG_ROLE";
		List<Map> roleOrgs = tMapperExt.queryByFormDefSql(sql1);
		
		List<Map> datas = new ArrayList<Map>();
		/*Map mapRoot=new HashMap();
		mapRoot.put("expanded", false);
		mapRoot.put("isLeaf", false);
		mapRoot.put("isParent", false); 
		mapRoot.put("open", false); 
		mapRoot.put("menuName", "角色机构树");
		mapRoot.put("menuSeq", "");
		mapRoot.put("menuCode", "MenuRoot");
		mapRoot.put("menuType", "Root");
		mapRoot.put("menuDicCode", "Root");
		mapRoot.put("menuParentCode", "");
		mapRoot.put("ORG_DEL", "N");
		mapRoot.put("PARENT_CODE", "ROOT"); 
		datas.add(mapRoot);*/
		for (int i = 0; i < orgList.size(); i++) {
			Boolean checked = false;
			for (int j = 0; j < roleOrgs.size(); j++) {
				String orgid1 = orgList.get(i).get("ORGID")+"";
				String orgid2 = roleOrgs.get(j).get("ORG_ID")+"";
				if (orgid1.endsWith(orgid2)) {
					checked = true;
				}
			}
			
			Map map=new HashMap();
			map.put("expanded", false);
			map.put("isLeaf", false);
			map.put("isParent", false); 
			map.put("open", false); 
			map.put("checked", checked);
			map.put("ID", orgList.get(i).get("ID"));
			map.put("CNAME", orgList.get(i).get("cname"));
			map.put("ENAME", orgList.get(i).get("ENAME"));
			map.put("PARENTID", orgList.get(i).get("PARENTID"));
			map.put("XTYPE", orgList.get(i).get("XTYPE"));
			map.put("ORGID", orgList.get(i).get("ORGID"));
			map.put("ZUID", orgList.get(i).get("ZUID"));
			map.put("ORGCODE", orgList.get(i).get("ORGCODE")); 
			map.put("DEPCODE", orgList.get(i).get("DEPCODE")); 
			map.put("ISDISABLED", orgList.get(i).get("isdisabled")); 
			datas.add(map);
		}
		
		return  datas;
	}
	
	/**
	 * 构建菜单树授权树
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/buildRoleMenuTree")
	public @ResponseBody List<Map> buildRoleMenuTree(HttpServletRequest request) throws Exception{
		String roleId = request.getParameter("roleId");
		String sql = "select SYS_MENU.MENU_ID as menuId, "+
				 " SYS_MENU.MENU_CODE as menuCode, "+
				 " SYS_MENU.MENU_NAME as menuName, "+
				 " SYS_MENU.MENU_SEQ as menuSeq, "+
				 " SYS_MENU.MENU_PARENT_CODE as menuParentCode, "+
				 " SYS_MENU.MENU_SORT as menuSort, "+
				 " SYS_MENU.MENU_DIC_CODE as menuDicCode, "+
				 " SYS_MENU.MENU_TYPE as menuType, "+
				 " 1 quanxian "+
                 " from SYS_MENU left join SYS_MENU_ROLE on SYS_MENU.MENU_ID = SYS_MENU_ROLE.MENU_ID where SYS_MENU_ROLE.ROLE_ID = "+roleId+
                 " union "+
				 " select SYS_MENU.MENU_ID as menuId, "+
				 " SYS_MENU.MENU_CODE as menuCode, "+
				 " SYS_MENU.MENU_NAME as menuName, "+
				 " SYS_MENU.MENU_SEQ as menuSeq, "+
				 " SYS_MENU.MENU_PARENT_CODE as menuParentCode, "+
				 " SYS_MENU.MENU_SORT as menuSort, "+
				 " SYS_MENU.MENU_DIC_CODE as menuDicCode, "+
				 " SYS_MENU.MENU_TYPE as menuType, "+
				 " 0 quanxian "+
				 " from SYS_MENU"+
				 " where MENU_ID not in (select MENU_ID from sys_menu_role where ROLE_ID =" + roleId+")"+
				 " order by SYS_MENU.MENU_SORT";
		List<Map> sysMenus = tMapperExt.queryByFormDefSql(sql);
		
		List<Map> datas = new ArrayList<Map>();
		Map mapRoot=new HashMap();
		mapRoot.put("expanded", false);
		mapRoot.put("isLeaf", false);
		mapRoot.put("isParent", false); 
		mapRoot.put("open", false); 
		mapRoot.put("menuName", "菜单管理");
		mapRoot.put("menuSeq", "");
		mapRoot.put("menuCode", "MenuRoot");
		mapRoot.put("menuType", "Root");
		mapRoot.put("menuDicCode", "Root");
		mapRoot.put("menuParentCode", "");
		mapRoot.put("ORG_DEL", "N");
		mapRoot.put("PARENT_CODE", "ROOT"); 
		datas.add(mapRoot);
		for (int i = 0; i < sysMenus.size(); i++) {
			Map map=new HashMap();
			String menuParentCode = (String)sysMenus.get(i).get("menuParentCode");
			if (menuParentCode == null) {
				menuParentCode = "MenuRoot";
			}else if(menuParentCode.equals("")){
				menuParentCode = "MenuRoot";
			}
			int quanxian = (Integer)sysMenus.get(i).get("quanxian");
			if (quanxian == 0) {
				map.put("checked", false);
			}else {
				map.put("checked", true);
			}
			
			map.put("expanded", false);
			map.put("isLeaf", false);
			map.put("isParent", false); 
			map.put("open", false); 
			map.put("menuId", (BigDecimal)sysMenus.get(i).get("menuId"));
			map.put("menuName", (String)sysMenus.get(i).get("menuName"));
			map.put("menuCode", (String)sysMenus.get(i).get("menuCode"));
			map.put("menuSeq", (String)sysMenus.get(i).get("menuSeq"));
			map.put("menuType", (String)sysMenus.get(i).get("menuType"));
			map.put("menuDicCode", (String)sysMenus.get(i).get("menuDicCode"));
			map.put("menuParentCode", menuParentCode);
			map.put("ORG_DEL", "N");
			map.put("PARENT_CODE", "ROOT"); 
			datas.add(map);
		}
		
		return  datas;
	}
	
	
	/**
	 * 构建图标树
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/buildSysIconTree")
	public @ResponseBody List<Map> buildSysIconTree(HttpServletRequest request) throws Exception{
		SysIconExample example = new SysIconExample();
		com.myehr.pojo.sysmenu.SysIconExample.Criteria criteria = example.createCriteria();
		//criteria.andDictTypeCodeEqualTo("restCalendarTree");
		List<SysIcon> icons = sysIconMapper.selectByExample(example);
		String menuCode =request.getParameter("menuCode");
		
		List<Map> datas = new ArrayList<Map>();
		Map mapRoot=new HashMap();
		mapRoot.put("expanded", false);
		mapRoot.put("isLeaf", false);
		mapRoot.put("isParent", false); 
		mapRoot.put("open", false); 
		mapRoot.put("iconName", "图标管理");
		mapRoot.put("iconId", "iconManage");
		mapRoot.put("iconType", "MenuRoot");
		mapRoot.put("iconParent", "");
		mapRoot.put("ORG_DEL", "N");
		Map iconType1=new HashMap();
		iconType1.put("expanded", false);
		iconType1.put("isLeaf", false);
		iconType1.put("isParent", false); 
		iconType1.put("open", false); 
		iconType1.put("iconName", "样式图标");
		iconType1.put("iconId", "cssIcon");
		iconType1.put("iconType", "样式图标");
		iconType1.put("iconParent", "MenuRoot");
		iconType1.put("ORG_DEL", "N");
		Map iconType2=new HashMap();
		iconType2.put("expanded", false);
		iconType2.put("isLeaf", false);
		iconType2.put("isParent", false); 
		iconType2.put("open", false); 
		iconType2.put("iconName", "图片图标");
		iconType2.put("iconId", "imgIcon");
		iconType2.put("iconType", "图片图标");
		iconType2.put("iconParent", "MenuRoot");
		iconType2.put("ORG_DEL", "N");
		datas.add(mapRoot);
		datas.add(iconType1);
		datas.add(iconType2);
		/*for (int i = 0; i < icons.size(); i++) {
			String iconType = icons.get(i).getIconType();
			String iconParent="";
			if (iconType!=null) {
				if (iconType.equals("1")) {
					iconParent="样式图标";
				}
				if (iconType.equals("2")) {
					iconParent="图片图标";
				}
			}
			
			Map map=new HashMap();
			map.put("expanded", false);
			map.put("isLeaf", false);
			map.put("isParent", false); 
			map.put("open", false); 
			map.put("iconId", icons.get(i).getIconId());
			map.put("iconName", icons.get(i).getIconName());
			map.put("iconType", iconType);
			map.put("iconParent", iconParent);
			map.put("ORG_DEL", "N");
			datas.add(map);
		}*/
		
		return  datas;
	}
	
	/**
	 * 构建系统方案树
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/buildSysSchemeTree")
	public @ResponseBody List<Map> buildSysSchemeTree(HttpServletRequest request) throws Exception{
		SysSystemSchemeExample example = new SysSystemSchemeExample();
		//com.myehr.pojo.sysmenu.SysSystemSchemeExample.Criteria criteria = example.createCriteria();
		//criteria.andDictTypeCodeEqualTo("restCalendarTree");
		List<SysSystemScheme> menus = sysSystemSchemeMapper.selectByExample(example);
		
		List<Map> datas = new ArrayList<Map>();
		Map mapRoot=new HashMap();
		mapRoot.put("expanded", false);
		mapRoot.put("isLeaf", false);
		mapRoot.put("isParent", false); 
		mapRoot.put("open", false); 
		mapRoot.put("schemeName", "方案管理");
		mapRoot.put("schemeCode", "MenuRoot");
		mapRoot.put("schemeDefType", "Root");
		mapRoot.put("systemTitle", "Root");
		mapRoot.put("parentCode", "");
		mapRoot.put("ORG_DEL", "N");
		mapRoot.put("PARENT_CODE", "ROOT"); 
		datas.add(mapRoot);
		for (int i = 0; i < menus.size(); i++) {
			Map map=new HashMap();
			map.put("expanded", false);
			map.put("isLeaf", false);
			map.put("isParent", false); 
			map.put("open", false);
			map.put("schemeId", menus.get(i).getSchemeId());
			map.put("schemeName", menus.get(i).getSchemeName());
			map.put("schemeCode", menus.get(i).getSchemeCode());
			map.put("schemeDefType", menus.get(i).getSchemeDefType());
			map.put("systemTitle", menus.get(i).getSystemTitle());
			map.put("parentCode", "MenuRoot");
			map.put("ORG_DEL", "N");
			datas.add(map);
		}
		List<DictData> dictDatas = sysformconfigService.getCardDictDataByDictTypeCode("sysCustomMenus", "dict");
		for (DictData dictData : dictDatas) {
			Map map=new HashMap();
			map.put("expanded", false);
			map.put("isLeaf", false);
			map.put("isParent", false); 
			map.put("open", false);
			map.put("schemeId", dictData.getCode());
			map.put("schemeCode", dictData.getCode());
			map.put("schemeName", dictData.getName());
			map.put("schemeDefType", dictData.getCode());
			map.put("systemTitle", dictData.getName());
			map.put("parentCode", "custom");
			map.put("ORG_DEL", "N");
			datas.add(map);
		}
		//自定义桌面菜单方案
		Map map=new HashMap();
		map.put("expanded", false);
		map.put("isLeaf", false);
		map.put("isParent", true); 
		map.put("open", true);
		map.put("schemeId", "custom");
		map.put("schemeName", "自定义菜单方案");
		map.put("schemeCode", "custom");
		map.put("schemeDefType", "custom");
		map.put("systemTitle", "自定义菜单方案");
		map.put("parentCode", "MenuRoot");
		map.put("ORG_DEL", "X");
		datas.add(map);
		return  datas;
	}
	/**
	 * 构建机构授权树
	 * 
	 */
	@RequestMapping("/buildOrgRoleTree")
	public @ResponseBody List<Map> buildOrgRoleTree(HttpServletRequest request) throws Exception{
		String roleId = request.getParameter("roleId");
		String sql = "select ORG_ORGANIZATION.ORG_ID as orgId, "+
				 " ORG_ORGANIZATION.ORG_CODE as orgCode, "+
				 " ORG_ORGANIZATION.ORG_NAME as orgName, "+
				 " ORG_ORGANIZATION.ORG_SEQ as orgSeq, "+
				 " ORG_ORGANIZATION.ORG_PARENT_ID as orgParentId, "+
				 " ORG_ORGANIZATION.ORG_ABBREVIATION as orgAbbreviation, "+
				 " ORG_ORGANIZATION.ORG_LEVEL as orgLevel, "+
				 " ORG_ORGANIZATION.ORG_TYPE as orgType, "+
				 " 1 quanxian "+
                 " from ORG_ORGANIZATION left join SYS_ORG_ROLE on ORG_ORGANIZATION.ORG_ID = SYS_ORG_ROLE.ORG_ID where SYS_ORG_ROLE.ROLE_ID = "+roleId+
                 " union "+
                 "select ORG_ORGANIZATION.ORG_ID as orgId, "+
				 " ORG_ORGANIZATION.ORG_CODE as orgCode, "+
				 " ORG_ORGANIZATION.ORG_NAME as orgName, "+
				 " ORG_ORGANIZATION.ORG_SEQ as orgSeq, "+
				 " ORG_ORGANIZATION.ORG_PARENT_ID as orgParentId, "+
				 " ORG_ORGANIZATION.ORG_ABBREVIATION as orgAbbreviation, "+
				 " ORG_ORGANIZATION.ORG_LEVEL as orgLevel, "+
				 " ORG_ORGANIZATION.ORG_TYPE as orgType, "+
				 " 0 quanxian "+
				 " from ORG_ORGANIZATION"+
				 " where ORG_ID not in (select ORG_ID from sys_org_role where ROLE_ID =" + roleId+")"+
				 " order by ORG_ORGANIZATION.ORG_LEVEL";
		List<Map> orgOrganization = tMapperExt.queryByFormDefSql(sql);
		
		List<Map> datas = new ArrayList<Map>();
		Map mapRoot=new HashMap();
		mapRoot.put("expanded", false);
		mapRoot.put("isLeaf", false);
		mapRoot.put("isParent", false); 
		mapRoot.put("open", false); 
		mapRoot.put("orgName", "Root");
		mapRoot.put("orgSeq", "");
		mapRoot.put("orgCode", "Root");
		mapRoot.put("orgType", "Root");
		mapRoot.put("orgParentId", "Root");
		mapRoot.put("orgAbbreviation", "机构管理");
		mapRoot.put("ORG_DEL", "N");
		mapRoot.put("PARENT_CODE", "ROOT"); 
		//datas.add(mapRoot);
		for (int i = 0; i < orgOrganization.size(); i++) {
			Map map=new HashMap();
			String orgAbbreviation = (String)orgOrganization.get(i).get("orgAbbreviation");
			if (orgAbbreviation == "" || orgAbbreviation == null) {
				orgAbbreviation = "OrgRoot";
			}
			int quanxian = (Integer)orgOrganization.get(i).get("quanxian");
			if (quanxian == 0) {
				map.put("checked", false);
			}else {
				map.put("checked", true);
			}
			
			map.put("expanded", false);
			map.put("isLeaf", false);
			map.put("isParent", false); 
			map.put("open", false); 
			map.put("orgId", (BigDecimal)orgOrganization.get(i).get("orgId"));
			map.put("orgName", (String)orgOrganization.get(i).get("orgName"));
			map.put("orgCode", (String)orgOrganization.get(i).get("orgCode"));
			map.put("orgSeq", (String)orgOrganization.get(i).get("orgSeq"));
			map.put("orgType", (String)orgOrganization.get(i).get("orgType"));
			map.put("orgParentId", (BigDecimal)orgOrganization.get(i).get("orgParentId"));
			map.put("orgAbbreviation", orgAbbreviation);
			map.put("ORG_DEL", "N");
			map.put("PARENT_CODE", "ROOT"); 
			datas.add(map);
		}
		
		return  datas;
		
		
	}
	
	
	/**
	 * 构建用户机构授权树
	 * 
	 */
	@RequestMapping("/buildOrgUserTree")
	public @ResponseBody List<Map> buildOrgUserTree(HttpServletRequest request) throws Exception{
		String userId = request.getParameter("userId");
		String sql = "select DEPTCODE.DEPT_ID as deptId, "+
				 " DEPTCODE.DEPT_CODE as deptCode, "+
				 " DEPTCODE.CONTENT as content, "+
				 " DEPTCODE.DEPTCODE01 as deptCode01, "+
				 " DEPTCODE.PARENT_ID as parentId, "+
				 " DEPTCODE.PARENT as parent, "+
				 " DEPTCODE.GRADE as grade, "+
				 " DEPTCODE.DEPTNUM as deptnum, "+
				 " 1 quanxian "+
                 " from DEPTCODE left join SYS_USER_ORG on DEPTCODE.DEPT_ID = SYS_USER_ORG.ORG_ID where SYS_USER_ORG.USER_ID = "+userId+
                 " union "+
                 "select DEPTCODE.DEPT_ID as deptId, "+
				 " DEPTCODE.DEPT_CODE as deptCode, "+
				 " DEPTCODE.CONTENT as content, "+
				 " DEPTCODE.DEPTCODE01 as deptcode01, "+
				 " DEPTCODE.PARENT_ID as parentId, "+
				 " DEPTCODE.PARENT as PARENT, "+
				 " DEPTCODE.GRADE as grade, "+
				 " DEPTCODE.DEPTNUM as deptnum, "+
				 " 0 quanxian "+
				 " from DEPTCODE"+
				 " where DEPT_ID not in (select ORG_ID from SYS_USER_ORG where USER_ID = "+ userId+")"+
				 " order by DEPTCODE";
		List<Map> deptcode = tMapperExt.queryByFormDefSql(sql);
		
		List<Map> datas = new ArrayList<Map>();
		Map mapRoot=new HashMap();
		mapRoot.put("expanded", false);
		mapRoot.put("isLeaf", false);
		mapRoot.put("isParent", false); 
		mapRoot.put("open", false); 
		mapRoot.put("deptId", "Root");
		mapRoot.put("deptCode", "Root");
		mapRoot.put("deptType", "Root");
		mapRoot.put("parentId", "Root");
		mapRoot.put("content", "机构管理");
		mapRoot.put("ORG_DEL", "N");
		mapRoot.put("parent", "ROOT"); 
		//datas.add(mapRoot);
		for (int i = 0; i < deptcode.size(); i++) {
			Map map=new HashMap();
			String content = (String)deptcode.get(i).get("content");
			if (content == "" || content == null) {
				content = "OrgRoot";
			}
			int quanxian = (Integer)deptcode.get(i).get("quanxian");
			if (quanxian == 0) {
				map.put("checked", false);
			}else {
				map.put("checked", true);
			}
			
			map.put("expanded", false);
			map.put("isLeaf", false);
			map.put("isParent", false); 
			map.put("open", false); 
			map.put("deptId", deptcode.get(i).get("deptId"));
			map.put("deptCode", (String)deptcode.get(i).get("deptCode"));
			map.put("parent", (String)deptcode.get(i).get("parent"));
			map.put("deptType", (String)deptcode.get(i).get("deptType"));
			map.put("parentId", deptcode.get(i).get("parentId"));
			map.put("content", content);
			map.put("ORG_DEL", "N");
			map.put("PARENT_CODE", "ROOT"); 
			datas.add(map);
		}
		
		return  datas;
	}
	
	/**
	 * 构建用户机构授权树for182
	 */
	@RequestMapping("/OrgUserTrees")
	public @ResponseBody List<Map> buildOrgUserTrees(HttpServletRequest request) throws Exception{
		String userId = request.getParameter("userId");
		String sql = "select ORG_V_ORGANIZATION.ID as deptId, "+
		         " ORG_V_ORGANIZATION.ORGCODE as deptCode, "+
		         " ORG_V_ORGANIZATION.CNAME as content, "+
		         " ORG_V_ORGANIZATION.XTYPE as deptCode01, "+
		         " ORG_V_ORGANIZATION.parentid as parentId, "+
		         " NULL as parent, "+
		         " NULL as grade, "+
		         " ORG_V_ORGANIZATION.isdisabled as deptnum, "+
		         " 1 quanxian "+
		                 " from ORG_V_ORGANIZATION left join SYS_USER_ORG on ORG_V_ORGANIZATION.ID = SYS_USER_ORG.ORG_ID where SYS_USER_ORG.USER_ID = "+userId+
		                 " union "+
		                 "select ORG_V_ORGANIZATION.ID as deptId, "+
		         " ORG_V_ORGANIZATION.ORGCODE as deptCode, "+
		         " ORG_V_ORGANIZATION.CNAME as content, "+
		         " ORG_V_ORGANIZATION.XTYPE as deptcode01, "+
		         " ORG_V_ORGANIZATION.parentid as parentId, "+
		         " NULL as PARENT, "+
		         " NULL as grade, "+
		         " ORG_V_ORGANIZATION.isdisabled as deptnum, "+
		         " 0 quanxian "+
		         " from ORG_V_ORGANIZATION"+
		         " where ID not in (select ORG_ID from SYS_USER_ORG where USER_ID = "+ userId+")"+
		         " order by ORG_V_ORGANIZATION.ORGCODE";
		List<Map> deptcode = tMapperExt.queryByFormDefSql(sql);
		
		List<Map> datas = new ArrayList<Map>();
		Map mapRoot=new HashMap();
		mapRoot.put("expanded", false);
		mapRoot.put("isLeaf", false);
		mapRoot.put("open", false); 
		mapRoot.put("deptId", "Root");
		mapRoot.put("deptCode", "Root");
		mapRoot.put("deptType", "Root");
		mapRoot.put("parentId", "Root");
		mapRoot.put("content", "机构管理");
		mapRoot.put("ORG_DEL", "N");
		mapRoot.put("parent", "ROOT"); 
		//datas.add(mapRoot);
		for (int i = 0; i < deptcode.size(); i++) {
			Map map=new HashMap();
			String content = (String)deptcode.get(i).get("content");
			if (content == "" || content == null) {
				content = "OrgRoot";
			}
			int quanxian = (Integer)deptcode.get(i).get("quanxian");
			if (quanxian == 0) {
				map.put("checked", false);
			}else {
				map.put("checked", true);
			}
			
			map.put("expanded", false);
			map.put("isLeaf", false);
			map.put("isParent", false); 
			map.put("open", false); 
			map.put("deptId", deptcode.get(i).get("deptId"));
			map.put("deptCode", (String)deptcode.get(i).get("deptCode"));
			map.put("parent", (String)deptcode.get(i).get("parent"));
			map.put("deptType", (String)deptcode.get(i).get("deptType"));
			map.put("parentId", deptcode.get(i).get("parentId"));
			map.put("content", content);
			map.put("ORG_DEL", "N");
			map.put("PARENT_CODE", "ROOT"); 
			datas.add(map);
		}
		
		return  datas;
		
		
	}
	
	
	/**
	 * 构建用户机构授权树
	 * 
	 */
	@RequestMapping("/buildOrgUserTreeView")
	public @ResponseBody List<Map> buildOrgUserTreeView(HttpServletRequest request) throws Exception{
		String userId = request.getParameter("userId");
		String sql = "select ORG_V_ORGANIZATION.ID as id, "+
				 " ORG_V_ORGANIZATION.cname as cname, "+
				 " ORG_V_ORGANIZATION.ENAME as ename, "+
				 " ORG_V_ORGANIZATION.PARENTID as parentId, "+
				 " ORG_V_ORGANIZATION.XTYPE as xtype, "+
				 " ORG_V_ORGANIZATION.ORGID as orgid, "+
				 " ORG_V_ORGANIZATION.ZUID as zuid, "+
				 " ORG_V_ORGANIZATION.ORGCODE as orgcode, "+
				 " ORG_V_ORGANIZATION.DEPCODE as deptcode, "+
				 " ORG_V_ORGANIZATION.isdisabled as isdisabled, "+
				 " 1 quanxian "+
                 " from ORG_V_ORGANIZATION left join SYS_USER_ORG on ORG_V_ORGANIZATION.ORGID = SYS_USER_ORG.ORG_ID where SYS_USER_ORG.USER_ID = "+userId+
                 " union "+
                 "select ORG_V_ORGANIZATION.ID as id, "+
                 " ORG_V_ORGANIZATION.cname as cname, "+
				 " ORG_V_ORGANIZATION.ENAME as ename, "+
				 " ORG_V_ORGANIZATION.PARENTID as parentId, "+
				 " ORG_V_ORGANIZATION.XTYPE as xtype, "+
				 " ORG_V_ORGANIZATION.ORGID as orgid, "+
				 " ORG_V_ORGANIZATION.ZUID as zuid, "+
				 " ORG_V_ORGANIZATION.ORGCODE as orgcode, "+
				 " ORG_V_ORGANIZATION.DEPCODE as deptcode, "+
				 " ORG_V_ORGANIZATION.isdisabled as isdisabled, "+
				 " 0 quanxian "+
				 " from ORG_V_ORGANIZATION"+
				 " where ORGID not in (select ORG_ID from SYS_USER_ORG where USER_ID = "+ userId+")"+
				 " order by ORGCODE";
		List<Map> deptcode = tMapperExt.queryByFormDefSql(sql);
		List<Map> datas = new ArrayList<Map>();
		for (int i = 0; i < deptcode.size(); i++) {
			Map map=new HashMap();
			String content = (String)deptcode.get(i).get("content");
			if (content == "" || content == null) {
				content = "OrgRoot";
			}
			int quanxian = (Integer)deptcode.get(i).get("quanxian");
			if (quanxian == 0) {
				map.put("checked", false);
			}else {
				map.put("checked", true);
			}
			map.put("expanded", false);
			map.put("isLeaf", false);
			map.put("isParent", false); 
			map.put("open", false); 
			map.put("id", (String)deptcode.get(i).get("id"));
			map.put("cname", (String)deptcode.get(i).get("cname"));
			map.put("ename", (String)deptcode.get(i).get("ename"));
			map.put("parentId", (String)deptcode.get(i).get("parentId"));
			map.put("xtype", (String)deptcode.get(i).get("xtype"));
			map.put("orgid", (Integer)deptcode.get(i).get("orgid"));
			map.put("zuid", (Integer)deptcode.get(i).get("zuid"));
			map.put("orgcode", (String)deptcode.get(i).get("orgcode"));
			map.put("deptcode", (String)deptcode.get(i).get("deptcode"));
			map.put("isdisabled", (Integer)deptcode.get(i).get("isdisabled"));
			map.put("ORG_DEL", "N");
			map.put("PARENT_CODE", "ROOT"); 
			datas.add(map);
		}
		return  datas;
	}
	
	
	/**
	 * 保存方案菜单
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/saveMenuWithScheme")
	public @ResponseBody String saveMenuWithScheme(HttpServletRequest request,@RequestBody MenuDatas params) throws Exception{
		long schemeId = params.getSchemeId();
		SysSystemSchemeMenuExample example1 = new SysSystemSchemeMenuExample();
		com.myehr.pojo.sysmenu.SysSystemSchemeMenuExample.Criteria criteria = example1.createCriteria();
		criteria.andSysSystemSchemeIdEqualTo(new BigDecimal(schemeId));
		sysSystemSchemeMenuMapper.deleteByExample(example1);
		
		List<Map> checkMenus= params.getCheckMenus();
		for (int i = 0; i < checkMenus.size(); i++) {
			Map menu = checkMenus.get(i);
			String menuCode = (String) menu.get("menuCode");
			if (menuCode.equals("MenuRoot")) {
				continue;
			}
			SysSystemSchemeMenu example = new SysSystemSchemeMenu();
			example.setMenuCode((String) menu.get("menuCode"));
			example.setMenuName((String) menu.get("menuName"));
			example.setMenuUrl((String) menu.get("menuUrl"));
			example.setMenuType((String) menu.get("menuType"));
			example.setMenuDictCode((String) menu.get("menuDictCode"));
			example.setMenuIsDynamicForm((String) menu.get("menuIsDynamicForm"));
			example.setMenuFormId((String) menu.get("menuFormId"));
			example.setSysSystemSchemeId(new BigDecimal(schemeId));
			sysSystemSchemeMenuMapper.insert(example);
			
		}
		return "success";
	}
	
	/**
	 * 保存方案菜单
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/saveMenuWithRole")
	public @ResponseBody String saveMenuWithRole(HttpServletRequest request,@RequestBody MenuDatas params) throws Exception{
		long schemeId = params.getSchemeId();
		SysSystemSchemeMenuExample example1 = new SysSystemSchemeMenuExample();
		com.myehr.pojo.sysmenu.SysSystemSchemeMenuExample.Criteria criteria = example1.createCriteria();
		criteria.andSysSystemSchemeIdEqualTo(new BigDecimal(schemeId));
		sysSystemSchemeMenuMapper.deleteByExample(example1);
		
		List<Map> checkMenus= params.getCheckMenus();
		for (int i = 0; i < checkMenus.size(); i++) {
			Map menu = checkMenus.get(i);
			String menuCode = (String) menu.get("menuCode");
			if (menuCode.equals("MenuRoot")) {
				continue;
			}
			SysSystemSchemeMenu example = new SysSystemSchemeMenu();
			example.setMenuCode((String) menu.get("menuCode"));
			example.setMenuName((String) menu.get("menuName"));
			example.setMenuUrl((String) menu.get("menuUrl"));
			example.setMenuType((String) menu.get("menuType"));
			example.setMenuDictCode((String) menu.get("menuDictCode"));
			example.setMenuIsDynamicForm((String) menu.get("menuIsDynamicForm"));
			example.setMenuFormId((String) menu.get("menuFormId"));
			example.setSysSystemSchemeId(new BigDecimal(schemeId));
			sysSystemSchemeMenuMapper.insert(example);
			
		}
		return "success";
	}
	
	/**
	 * 保存方案用户
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/saveUsersWithScheme")
	public @ResponseBody String saveUsersWithScheme(HttpServletRequest request,@RequestBody UserDatas params) throws Exception{
		long schemeId = params.getSchemeId();
		SysSystemSchemeExample example1 = new SysSystemSchemeExample();
		com.myehr.pojo.sysmenu.SysSystemSchemeExample.Criteria criteria = example1.createCriteria();
		criteria.andSchemeIdEqualTo(new BigDecimal(schemeId));
		SysSystemSchemeWithBLOBs sysSystemScheme = sysSystemSchemeMapper.selectByPrimaryKey(new BigDecimal(schemeId));
		
		List<Map> users= params.getSelectUsers();
		String userIds = "";
		for (int i = 0; i < users.size(); i++) {
			Map user = users.get(i);
			Integer userId = (Integer) user.get("userId");
			userIds+=userId+",";
		}
		sysSystemScheme.setSchemeUserIds(userIds);
		sysSystemSchemeMapper.updateByPrimaryKeySelective(sysSystemScheme);
		return "success";
	}
	
	
	/**
	 * 保存方案角色
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/saveRolesWithScheme")
	public @ResponseBody String saveRolesWithScheme(HttpServletRequest request,@RequestBody UserDatas params) throws Exception{
		long schemeId = params.getSchemeId();
		SysSystemSchemeExample example1 = new SysSystemSchemeExample();
		com.myehr.pojo.sysmenu.SysSystemSchemeExample.Criteria criteria = example1.createCriteria();
		criteria.andSchemeIdEqualTo(new BigDecimal(schemeId));
		SysSystemSchemeWithBLOBs sysSystemScheme = sysSystemSchemeMapper.selectByPrimaryKey(new BigDecimal(schemeId));
		
		List<Map> users= params.getSelectUsers();
		String roleIds = "";
		for (int i = 0; i < users.size(); i++) {
			Map user = users.get(i);
			Integer roleId = (Integer) user.get("roleId");
			roleIds+=roleId+",";
		}
		sysSystemScheme.setSchemeRoleIds(roleIds);
		sysSystemSchemeMapper.updateByPrimaryKeySelective(sysSystemScheme);
		return "success";
	}
	
	/**
	 * 保存菜单图标
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/saveIconWithMenu")
	public @ResponseBody String saveIconWithMenu(HttpServletRequest request,@RequestBody SaveData params) throws Exception{
		String menuCode = params.getMenuCode();
		Map icon= params.getSelect();
		
		SysMenuExample example = new SysMenuExample();
		com.myehr.pojo.sysmenu.SysMenuExample.Criteria criteria = example.createCriteria();
		criteria.andMenuCodeEqualTo(menuCode);
		SysMenu sysMenu= sysMenuMapper.selectByExample(example).get(0);
		
		SysIconResourceExample example1 = new SysIconResourceExample();
		com.myehr.pojo.sysmenu.SysIconResourceExample.Criteria criteria1 = example1.createCriteria();
		criteria1.andIconCodeEqualTo(menuCode);
		sysIconResourceMapper.deleteByExample(example1);
		
		SysIconResource sysIconResource = new SysIconResource();
		sysIconResource.setIconCode(menuCode);
		sysIconResource.setIconName(sysMenu.getMenuName());
		sysIconResource.setFolderId(new BigDecimal((Integer) icon.get("iconId")));
		sysIconResource.setIconType((String) icon.get("iconType"));
		sysIconResource.setCheckedImgFileId((String) icon.get("checkedImgFile"));
		sysIconResource.setImgFileId((String) icon.get("imgFile"));
		sysIconResourceMapper.insert(sysIconResource);
		
		
		return "success";
	}
	
	@RequestMapping("/removeSysMenu")
	public @ResponseBody Object removeSysMenu(HttpServletRequest request) throws Exception{
		SysMenu menu = (SysMenu) JSONObject.toBean(GetRequestJsonUtils.getJsonObject(request), SysMenu.class);  
        String reCode = serviceImpl.deleteSysMenu(menu);
        return reCode;
    }
	
	@RequestMapping("/insertSysMenu")
	public @ResponseBody Object insertSysMenu(HttpServletRequest request) throws Exception{
		SysMenu menu = (SysMenu) JSONObject.toBean(GetRequestJsonUtils.getJsonObject(request), SysMenu.class);
		menu.setMenuId(keyserviceImpl.getPrimaryKey("sys_menu", "MENU_ID"));
        String reCode = serviceImpl.insertSysMenu(menu);
        return reCode;
    }

	//查询  把条件存在menucode里面
	@RequestMapping("/searchSysMenuList")
	public @ResponseBody ResultMap searchSysMenuList(HttpServletRequest request) throws Exception{
		SysMenu menu = (SysMenu) JSONObject.toBean(GetRequestJsonUtils.getJsonObject(request), SysMenu.class);
		ResultMap resultMap=serviceImpl.searchMenuList(menu.getMenuName());
		return resultMap;
	}
	
	@RequestMapping("/selectSysMenuTree")
	public @ResponseBody Object selectTree(HttpServletRequest request) throws Exception{
		SysMenuExample example = new SysMenuExample();
		
		example.setOrderByClause("MENU_SORT");
		List<SysMenu> tree =  sysMenuMapper.selectByExample(example);
		
		List<SysMenuTree> tree1 = new ArrayList<SysMenuTree>();
		for (int i = 0; i < tree.size(); i++) {
			SysMenuTree sTree = new SysMenuTree();
			sTree.setMenuCode(tree.get(i).getMenuCode());          
			sTree.setMenuParentCode(tree.get(i).getMenuParentCode());    
			sTree.setMenuName(tree.get(i).getMenuName());          
			sTree.setOpen(null);
			sTree.setIsparent(null);
			tree1.add(sTree);
		}
    	JSONArray jsonArray=JSONArray.fromObject(tree1);
    	String str=jsonArray.toString();
    	String newStr = str.replaceAll("menuCode","id");
    	String newStr1 = newStr.replaceAll("menuParentCode","pId");
    	String newStr2 = newStr1.replaceAll("menuName","name");
    	String newStr3 = newStr2.replaceAll("isparent","isParent");
    	JSONArray json = JSONArray.fromObject(newStr3);
    	return json;
    }
	
	@RequestMapping("/nuiTree")
	public @ResponseBody Object nuiTree(HttpServletRequest request) throws Exception{
		SysMenuExample example = new SysMenuExample();
		
		example.setOrderByClause("MENU_SORT");
		List<SysMenu> tree =  sysMenuMapper.selectByExample(example);
		
		List<TreeByCode> tree1 = new ArrayList<TreeByCode>();
		for (int i = 0; i < tree.size(); i++) {
			
			TreeByCode sTree = new TreeByCode();
			sTree.setId(tree.get(i).getMenuCode());   
			sTree.setText(tree.get(i).getMenuName());  
			sTree.setPid(tree.get(i).getMenuParentCode());    
			tree1.add(sTree);
		}
		JSONArray jsonArray=JSONArray.fromObject(tree1);
		String str=jsonArray.toString();
		JSONArray json = JSONArray.fromObject(str);
		return json;
	}
	
	//查询  条件查询
		@RequestMapping("/searchSysMenuByPId")
		public @ResponseBody ResultMap searchSysMenuByPId(HttpServletRequest request) throws Exception{
			SysMenu menu = (SysMenu) JSONObject.toBean(GetRequestJsonUtils.getJsonObject(request), SysMenu.class);
			String str=menu.getMenuParentCode();
			ResultMap resultMap=serviceImpl.selectByPId(str);
			return resultMap;
		}
	
		//查询  根据menuCode查询menuId
		@RequestMapping("/searchByCode")
		public @ResponseBody ResultMap searchByCode(HttpServletRequest request) throws Exception{
			SysMenu menu = (SysMenu) JSONObject.toBean(GetRequestJsonUtils.getJsonObject(request), SysMenu.class);
			String str=menu.getMenuCode();
			ResultMap resultMap=serviceImpl.searchByCode(str);
			return resultMap;
		}
		
		// 插入
		@RequestMapping("/insertT2")
		public @ResponseBody List<Map<String,String>>   insert2(HttpServletRequest request) throws Exception {
			/*// 测试forward后request是否可以共享
			System.out.println(t2.getName2());
			T t = new T();
			t.setAge(12);
			t.setId(8);
			t.setName("2");
			// 调用service查找 数据库，查询商品列表
			 t2Service.insertT2(t2,t);
			return "1";*/
			//tMapperExt.selectById(1);
			List<Map<String,String>> rs = new ArrayList<Map<String,String>>();
			Map<String,String> m1 = new HashMap<String,String>();
			m1.put("text", "张三");
			m1.put("id", "1");
			rs.add(m1);
			Map<String,String> m2 = new HashMap<String,String>();
			m2.put("text", "李思");
			m2.put("id", "2");
			rs.add(m2);
			return rs;
		//	return "[ { \"Text\": \"\", \"Value\": \"\" }, { \"Text\": \"学术会议\", \"Value\": \"学术会议\" }, { \"Text\": \"朋友介绍\", \"Value\": \"朋友介绍\" }, { \"Text\": \"广告媒体\", \"Value\": \"广告媒体\" } ]";

		}
		
		
		//查询  根据menuId查询菜单参数
		@RequestMapping("/queryParamByMenuId")
		public @ResponseBody List<Map> queryParamByMenuId(HttpServletRequest request) throws Exception{
			String menuId = request.getParameter("menuId");
			String sql = "select * from sys_menu_param where sys_menu_param.menu_id = "+menuId;
			//String sql = "select * from sys_menu_param join sys_sql_params on sys_menu_param.menu_param_value = sys_sql_params.sql_params_code where sys_sql_params.sql_params_folder_id = 183 and sys_menu_param.menu_id = "+menuId;
			List<Map> list = new ArrayList<Map>();
			List<Map> t = (List<Map>) tMapperExt.queryByFormDefSql(sql);
			for (int i = 0; i < t.size(); i++) {
				Map map = t.get(i);
				String paramType = (String)map.get("MENU_PARAM_CLASS");
				if(paramType.equals("customParam")){
					String paramName = (String)map.get("MENU_PARAM_VALUE");
					String sql2 = "select * from sys_menu_param join sys_sql_params on sys_menu_param.menu_param_value = sys_sql_params.sql_params_code where sys_sql_params.sql_params_folder_id = 7 and sys_menu_param.menu_param_name = '"+paramName+"' and sys_menu_param.menu_id = "+menuId;
					List<Map> t2 = (List<Map>) tMapperExt.queryByFormDefSql(sql2);
					if (t2.size()==0) {
						continue;
					}
					String paramGuiType = (String)t2.get(0).get("SQL_PARAMS_GUI_TYPE");
					if (paramGuiType.equals("2")) {
						String paramsId = (BigDecimal)t2.get(0).get("SQL_PARAMS_ID")+"";
						String sql1 = "select * from sys_menu_param join sys_sql_params on sys_menu_param.menu_param_value = sys_sql_params.sql_params_code join sys_form_combobox on sys_form_combobox.combobox_form_column_id = sys_sql_params.SQL_PARAMS_ID where sys_sql_params.sql_params_folder_id = 7 and sys_menu_param.menu_id ="+menuId+" and combobox_form_column_id = "+paramsId;
						List<Map> t1=MybatisUtil.queryList("runtime.selectSql", sql1);
						

						//String paramsId = (BigDecimal)t2.get(0).get("SQL_PARAMS_ID")+"";
						SysParamsComboboxsExample example=new SysParamsComboboxsExample();
						example.or().andSqlParamsIdEqualTo(new BigDecimal(paramsId));
					    List<SysParamsComboboxs> t6=  paramsMapper.selectByExample(example);
					    String names= t6.get(0).getComboboxGuiInitValue();
					    String type= t6.get(0).getComboboxGuiInitType();
				     List<DictData> a =  sysformconfigService.getCardDictDataByDictTypeCode(names, type);
				     List<Map> b = new ArrayList<Map>();
				     if (a.size()>0) {
				    	Map map0 = new HashMap();
					    map0.put("MENU_PARAM_TYPE", t1.get(0).get("MENU_PARAM_TYPE"));
					    map0.put("MENU_PARAM_CLASS", t1.get(0).get("MENU_PARAM_CLASS"));
						map0.put("MENU_PARAM_NAME", t1.get(0).get("MENU_PARAM_NAME"));
						map0.put("MENU_PARAM_VALUE", t1.get(0).get("MENU_PARAM_VALUE"));
						map0.put("SQL_PARAMS_NAME", t1.get(0).get("SQL_PARAMS_NAME"));
						map0.put("SQL_PARAMS_GUI_TYPE", t1.get(0).get("SQL_PARAMS_GUI_TYPE"));
						map0.put("MENU_PARAM_FROM",names);
						List<Map> maps = new ArrayList<Map>();
				        for (DictData dictData : a) {
				        	Map map1= new HashMap();
							map1.put("COMBOBOX_GUI_INIT_VALUE", dictData.getName());
							map1.put("SQL_PARAM_SCHEMA_ID",dictData.getCode());
							maps.add(map1);
						}
						map0.put("dictDatas", maps);
						b.add(map0);
				    }
			                return b;
					}else if (paramGuiType.equals("6")) {
						String paramsId = (BigDecimal)t2.get(0).get("SQL_PARAMS_ID")+"";
						String sql1 = "select * from sys_menu_param join sys_sql_params on sys_menu_param.menu_param_value = sys_sql_params.sql_params_code join sys_form_datepicker on sys_form_datepicker.datepicker_form_column_id = sys_sql_params.SQL_PARAMS_ID where sys_sql_params.sql_params_folder_id = 2 and sys_menu_param.menu_id ="+menuId+" and datepicker_form_column_id = "+paramsId;
						List<Map> t1 = (List<Map>) tMapperExt.queryByFormDefSql(sql1);
						if (t1.size()>0) {
							list.add(t1.get(0));
						}
					}else {
						list.add(t2.get(0));
					}
				}else{
					if (paramType.equals("constant")) {
						list.add(map);
					}
				}
			}
			/*SysMenuParamExample example = new SysMenuParamExample();
			com.myehr.pojo.formmanage.form.SysMenuParamExample.Criteria criteria = example.createCriteria();
			criteria.andMenuIdEqualTo(new BigDecimal(menuId));
			List<SysMenuParam> menuParams = sysMenuParamMapper.selectByExample(example);*/
			return list;
		}
		
		
		//查询  把参数存进session
		@RequestMapping("/saveSession")
		public @ResponseBody String saveSession(HttpServletRequest request,@RequestBody ToSessionParam sessionParam) throws Exception{
			Map[] param = sessionParam.getSessionParam();
			HttpSession session = request.getSession();
			for (int i = 0; i < param.length; i++) {
				session.setAttribute((String)param[i].get("fieldName")+"_PARAMSESSION", (String)param[i].get("fieldValue"));
			}
			
			return "";
		}
		
		
		/**
		 * 删除菜单参数
		 * @param request
		 * @param params
		 * @throws Throwable 
		 */
		@RequestMapping("/deleteMenuParamById")
		public @ResponseBody String[]  deleteWhereColumn(HttpServletRequest request,@RequestBody SysMenuParam menuParam) throws Throwable {
			String[] recode = new String[2];
			recode[0]="0";
			recode[1]="操作成功";
			
			sysMenuParamMapper.deleteByPrimaryKey(menuParam.getMenuParamId());
			
			return recode;
		}
		
		/**
		 * 保存菜单参数
		 * @param request
		 * @param params
		 * @throws Throwable 
		 */
		@RequestMapping("/saveMenuParam")
		public @ResponseBody String[]  saveMenuParam(HttpServletRequest request,@RequestBody SaveMenuParamParams param) throws Throwable {
			String[] recode = new String[2];
			recode[0]="0";
			recode[1]="操作成功";
			
			List<Map> menuParams = param.getColumns();
			String menuId = request.getParameter("menuId");
			
			for (int i = 0; i < menuParams.size(); i++) {
				SysMenuParam menuParam = new SysMenuParam();
				Map obj = menuParams.get(i);
				menuParam.setMenuId(new BigDecimal(menuId));
				menuParam.setMenuParamName((String)obj.get("menuParamName"));
				menuParam.setMenuParamFrom((String)obj.get("menuParamFrom"));
				menuParam.setMenuParamValue((String)obj.get("menuParamValue"));
				menuParam.setMenuParamClass((String)obj.get("menuParamClass"));
				menuParam.setMenuParamType((String)obj.get("menuParamType"));
				
				String menuParamId = (String)obj.get("menuParamId");
				
				if (menuParamId==null || menuParamId.equals("")) {
					sysMenuParamMapper.insert(menuParam);
				}else{
					menuParam.setMenuParamId(new BigDecimal(menuParamId));
					sysMenuParamMapper.updateByPrimaryKey(menuParam);
				}
			}
			
			return recode;
		}
		
		@RequestMapping("/deleteSysMenu")
		public @ResponseBody String deleteSysMenu(HttpServletRequest request) throws Exception{
			String reCode = "";
			
			String menuId = request.getParameter("menuId");
			String remark = request.getParameter("remark");
			String[] menuIds = menuId.split(",");
			for (int i = 0; i < menuIds.length; i++) {
				SysMenuExample example = new SysMenuExample();
				com.myehr.pojo.sysmenu.SysMenuExample.Criteria criteria = example.createCriteria();
				criteria.andMenuIdEqualTo(Integer.valueOf(menuIds[i]));
				SysMenu menu = sysMenuMapper.selectByExample(example).get(0);
				if (remark.equals("delete")) {
					if (menu.getDeleteMark()==null || menu.getDeleteMark().equals("N")) {
						menu.setDeleteMark("Y");
						reCode = sysMenuMapper.updateByPrimaryKey(menu)+"";
					}else {
						/*SysDictEntryExample example1 = new SysDictEntryExample();
						com.myehr.pojo.dict.SysDictEntryExample.Criteria criteria1 = example1.createCriteria();
						criteria1.andDictTypeIdEqualTo(Integer.valueOf(dictTypeIds[i]));
						sysDictEntryMapper.deleteByExample(example1);*/
						
						reCode = sysMenuMapper.deleteByPrimaryKey(menu.getMenuId())+"";
					}
				}else{
					menu.setDeleteMark("N");
					menu.setDeleteMarkBack("Y");
					reCode = sysMenuMapper.updateByPrimaryKey(menu)+"";
				}	
			}	
			return reCode;
		}
		
	/**
	 * 导出菜单
	 * @param request
	 * @param params
	 * @throws Throwable 
	 */
	@RequestMapping("/exportSysMenu")
	public @ResponseBody String[]  exportSysMenu(HttpServletRequest request,HttpServletResponse response) throws Throwable {
		String[] recode = new String[2];
		recode[0]="0";
		recode[1]="操作成功";
		String  menuCode = request.getParameter("menuCodes");
		String[] menuCodes = menuCode.split(",");
		String menuSeq = "";
		for (int i = 0; i < menuCodes.length; i++) {
			menuSeq += "sys_menu.menu_seq like '."+menuCodes[i]+"%' or ";
		}
		
		menuSeq = menuSeq.substring(0, menuSeq.length()-3);
		
		String queryDataSql = "Select * from sys_menu where "+menuSeq;
		String sql = "Select name from syscolumns Where ID=OBJECT_ID('SYS_MENU')";
		List<Map> datas= MybatisUtil.queryList("runtime.selectSql", queryDataSql);
		List<Map> objs= MybatisUtil.queryList("runtime.selectSql", sql);
		LinkedHashMap<String,String> fieldMap = new LinkedHashMap<String,String>();
		for (int i = 0; i < objs.size(); i++) {
			fieldMap.put(objs.get(i).get("name")+"", objs.get(i).get("name")+"");
		}
		ExcelUtils.listToExcel(datas, fieldMap,"", "菜单表", response);
		
		String queryFormDatasSql = "select * from sys_formconfig where sys_formconfig.form_def_id in (select a.menu_form_id from ("+queryDataSql+") a where a.menu_form_id is not null and a.menu_form_id<>'')";
		String menuSql = "Select name from syscolumns Where ID=OBJECT_ID('SYS_FORMCONFIG')";
		List<Map> formDatas= MybatisUtil.queryList("runtime.selectSql", queryFormDatasSql);
		List<Map> formObjs= MybatisUtil.queryList("runtime.selectSql", menuSql);
		LinkedHashMap<String,String> formFieldMap = new LinkedHashMap<String,String>();
		for (int i = 0; i < objs.size(); i++) {
			formFieldMap.put(formObjs.get(i).get("name")+"", formObjs.get(i).get("name")+"");
		}
		ExcelUtils.listToExcel(formDatas, formFieldMap,"", "表单表", response);
		return recode;
	}	
	
	
}
