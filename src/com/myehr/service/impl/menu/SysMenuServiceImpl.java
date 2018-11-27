package com.myehr.service.impl.menu;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;

import com.myehr.common.exception.DcfException;
import com.myehr.common.util.LangUtil;
import com.myehr.common.util.ResultMap;
import com.myehr.mapper.formmanage.form.SysFormconfigMapper;
import com.myehr.mapper.sysmenu.SysMenuMapper;
import com.myehr.mapper.sysmenu.SysMenuMapperExpand;
import com.myehr.mapper.sysuser.SysUserMapper;
import com.myehr.pojo.dict.DictData;
import com.myehr.pojo.formmanage.cache.SysFormconfigCache;
import com.myehr.pojo.formmanage.form.SysFormconfig;
import com.myehr.pojo.sysmenu.SysMenu;
import com.myehr.pojo.sysmenu.SysMenuExample;
import com.myehr.pojo.sysmenu.SysMenuExpand;
import com.myehr.pojo.sysuser.SysUser;
import com.myehr.service.formmanage.form.ISysformconfigService;
import com.myehr.service.menu.SysMenuService;
import com.sun.org.apache.bcel.internal.generic.NEW;

public class SysMenuServiceImpl implements SysMenuService {
	String pathX = "/myehrpath/form/";
	@Autowired
	private SysMenuMapper sysMenuMapper;
	@Autowired
	private SysMenuMapperExpand sysMenuMapper2;
	
	@Autowired
	private SysUserMapper sysUserMapper;

	@Autowired
	private ISysformconfigService sysformconfigService;
	private static Map<String,String> menusStringMap  =new ConcurrentHashMap<String, String>();

	@Autowired
	private SysFormconfigMapper sysFormconfigMapper;
	@Override
	public SysMenu findSysMenuById(int id) throws Exception {
		return sysMenuMapper.selectByPrimaryKey(id);
	}

	@Override
	public ResultMap findSysMenuAll(SysMenuExample mExample) throws Exception {
		// TODO Auto-generated method stub
				List<SysMenu> mList = sysMenuMapper.selectByExample(mExample);
				long total=10;
				ResultMap rMap=new ResultMap();
				List<Object> list_obj=new ArrayList<Object>();
				for (SysMenu u : mList) {
					list_obj.add(u);
				}
				rMap.setRows(list_obj);
				rMap.setTotal(total);
				return rMap;
	}

	
	@Override
	public String updateSysMenu(SysMenu menu) throws Exception {
		String reCode;
		try {
			sysMenuMapper.updateByPrimaryKey(menu);
		} catch (Exception e) {
			// TODO: handle exception
			reCode="1";
		}
		reCode = "0";
		return reCode;
	}

	@Override
	public String deleteSysMenu(SysMenu menu) throws Exception {
		String reCode;
		try {
			sysMenuMapper.deleteByPrimaryKey(menu.getMenuId());
		} catch (Exception e) {
			// TODO: handle exception
			reCode="1";
		}
		reCode = "0";
		return reCode;
	}

	@Override
	public String insertSysMenu(SysMenu menu) throws Exception {
		String reCode;
		try {
			sysMenuMapper.insert(menu);
		} catch (Exception e) {
			// TODO: handle exception
			reCode="1";
		}
		reCode = "0";
		return reCode;
	}

	@Override
	public ResultMap searchMenuList(String condition) throws Exception {
		// TODO Auto-generated method stub
				String conditions ="%"+condition+"%";
				List<SysMenu> list=sysMenuMapper2.selectByCondition(conditions);
				long total=10;
				ResultMap rMap=new ResultMap();
				List<Object> list_obj=new ArrayList<Object>();
				for (SysMenu u : list) {
					list_obj.add(u);
				}
				rMap.setRows(list_obj);
				rMap.setTotal(total);
				return rMap;
	}
	
	@Override
	public ResultMap selectByPId(String condition) throws Exception {
		// TODO Auto-generated method stub
		List<SysMenu> list=sysMenuMapper2.selectByPId(condition);
		long total=10;
		ResultMap rMap=new ResultMap();
		List<Object> list_obj=new ArrayList<Object>();
		for (SysMenu u : list) {
			list_obj.add(u);
		}
		rMap.setRows(list_obj);
		rMap.setTotal(total);
		return rMap;
	}
	
	//查询  根据menuCode查询menuId
	@Override
	public ResultMap searchByCode(String condition) throws Exception {
		// TODO Auto-generated method stub
		List<SysMenu> list=sysMenuMapper2.selectByCondition(condition);
		long total=10;
		ResultMap rMap=new ResultMap();
		List<Object> list_obj=new ArrayList<Object>();
		for (SysMenu u : list) {
			list_obj.add(u);
		}
		rMap.setRows(list_obj);
		rMap.setTotal(total);
		return rMap;
	}

	/*@Override
	public List<SysMenu>[] queryMainframeMenu(String userId) {
		// TODO Auto-generated method stub
		return null;
	}*/
	
	/**
	 * 根据用户获取用户的所有可操作的菜单
	 * @param isSuperAdmin 是否超级管理员
	 * @param userId 用户ID 
	 * 2017-07-29 
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public String  queryMainframeMenu(String userId,HttpServletRequest request) {
		
//		一级
		List<SysMenu> m1 = new ArrayList<SysMenu>();
		//二级
		List<SysMenu> m2 = new ArrayList<SysMenu>();
		//三级
		List<SysMenu> m3 = new ArrayList<SysMenu>();
//		四级
		List<SysMenu> m4 = new ArrayList<SysMenu>();
		List<SysMenu>[] results = new ArrayList[4];
		long start = new Date().getTime();
		List<SysMenu> powerMenu =  sysMenuMapper2.queryMenusByUserid(userId);
		if (powerMenu != null && powerMenu.size() > 0) {
			SysMenuExample sysMenuExample = new SysMenuExample();
			com.myehr.pojo.sysmenu.SysMenuExample.Criteria criteria = sysMenuExample.createCriteria();  
			criteria.andDeleteMarkEqualTo("N");
			criteria.andMenuTypeNotEqualTo("L");
			sysMenuExample.setOrderByClause("menu_Sort");
			List<SysMenu> nLMenus = sysMenuMapper.selectByExample(sysMenuExample);
			if (nLMenus != null && nLMenus.size() > 0) {
				List<SysMenu> nLMenuList = new ArrayList<SysMenu>();
				for (int i = 0; i < nLMenus.size(); i++) {
					nLMenuList.add(nLMenus.get(i));
					nLMenus.get(i).setMenuName(nLMenus.get(i).getMenuName());
				}
				
				while (nLMenuList.size() > 0) {
					String menuSeq = nLMenuList.get(0).getMenuSeq();
					if (menuSeq != null && !"".equals(menuSeq)) {
						for (int j = 0; j < powerMenu.size(); j++) {
							String powerMenuSeq = powerMenu.get(j).getMenuSeq();
							if (powerMenuSeq != null && !"".equals(powerMenuSeq)) {
								if (powerMenuSeq.indexOf((menuSeq+".")) > -1) {
									int level = menuSeq.split("\\.").length-1;
									if(level==1){ //一级
										m1.add(nLMenuList.get(0));
									}else if(level==2){
										/*if(nLMenuList.get(0).getMenuName().equals("统一开发")){
											System.out.println();
										}*/
										m2.add(nLMenuList.get(0));
									}/*else if(level==3){
										if(nLMenuList.get(0).getMenuName().equals("动态表单")){
											System.out.println();
										}
										m3.add(nLMenuList.get(0));
									}else if(level==4){
										m4.add(nLMenuList.get(0));
									}*/
									break;
								}
							}
						}
					} 
					nLMenuList.remove(0);
				}
				for (int j = 0; j < powerMenu.size(); j++) {
					String powerMenuSeq = powerMenu.get(j).getMenuSeq();
					int level = powerMenuSeq.split("\\.").length-1;
					if(level==1){ //一级
						m1.add( powerMenu.get(j));
					}else if(level==2){
						m2.add( powerMenu.get(j));
					}else if(level==3){
						m3.add( powerMenu.get(j));
					}else if(level==4){
						m4.add( powerMenu.get(j));
					}
				}
			}
		}
		
		results[0] = m1;
		results[1] = m2;
		results[2] = m3;
		results[3] = m4;
		StringBuffer sBuffer = new StringBuffer("{\"data\":[\n");
		String jsonString = "{\"data\":[\n";
		System.out.println("***************"+(new Date().getTime()-start));
		
		for (SysMenu sysMenu : m1) {
			jsonString = jsonString+"{\n";
			//判断是否有子项
			List<SysMenu> menus1 = new ArrayList<SysMenu>();
			for (SysMenu sysMenu2 : m2) {
				if(sysMenu2.getMenuSeq().indexOf((sysMenu.getMenuSeq()+".")) > -1){
					menus1.add(sysMenu2);//当前一级根下子项
				}
			}//.personnel
			if (menus1.size()>0) {
				sBuffer.append(" \"menuCode\":\""+sysMenu.getMenuCode()+"\",\n");
				sBuffer.append(" \"menuName\":\""+sysMenu.getMenuName()+"\",\n");
				sBuffer.append(" \"menuId\":\""+sysMenu.getMenuId()+"\",\n");
				sBuffer.append(" \"menuUrl\":\""+sysMenu.getMenuType()+"\",\n");
				sBuffer.append(" \"menuType\":\""+sysMenu.getMenuUrl()+"\",\n");
				sBuffer.append(" \"menuDictCode\":\""+sysMenu.getMenuDicCode()+"\",\n");
				sBuffer.append(" \"menuIsDynamicForm\":\""+sysMenu.getMenuIsDynamicForm()+"\",\n");
				sBuffer.append(" \"menuFormId\":\""+sysMenu.getMenuFormId()+"\",\n");
				sBuffer.append(" \"childrens\":");
				
				jsonString = jsonString+" \"menuCode\":\""+sysMenu.getMenuCode()+"\",\n"+
						 				" \"menuName\":\""+sysMenu.getMenuName()+"\",\n"+
						 				" \"menuId\":\""+sysMenu.getMenuId()+"\",\n"+
						 				" \"menuUrl\":\""+sysMenu.getMenuUrl()+"\",\n"+
						 				" \"menuType\":\""+sysMenu.getMenuType()+"\",\n"+
						 				" \"menuDictCode\":\""+sysMenu.getMenuDicCode()+"\",\n"+
						 				" \"menuIsDynamicForm\":\""+sysMenu.getMenuIsDynamicForm()+"\",\n"+
						 				" \"menuFormId\":\""+sysMenu.getMenuFormId()+"\",\n"+
										" \"childrens\":";
				sBuffer.append("[\n");
				jsonString = jsonString+"[\n";
				for (SysMenu sysMenu2 : menus1) {
					jsonString = jsonString+"{\n";
					List<SysMenu> menus2 = new ArrayList<SysMenu>();
					for (SysMenu sysMenu3 : m3) {
						if(sysMenu3.getMenuSeq().indexOf(sysMenu2.getMenuSeq()+".") > -1){
							menus2.add(sysMenu3);//当前一级根下子项
						}
					}
					if (menus2.size()>0) {
						jsonString = jsonString+" \"menuCode\":\""+sysMenu2.getMenuCode()+"\",\n"+
								 				" \"menuName\":\""+sysMenu2.getMenuName()+"\",\n"+
								 				" \"menuId\":\""+sysMenu2.getMenuId()+"\",\n"+
								 				" \"menuTitle\":\""+sysMenu2.getMenuDesc()+"\",\n"+
								 				" \"menuUrl\":\""+sysMenu2.getMenuUrl()+"\",\n"+
								 				" \"menuType\":\""+sysMenu2.getMenuType()+"\",\n"+
								 				" \"menuDictCode\":\""+sysMenu2.getMenuDicCode()+"\",\n"+
								 				" \"menuIsDynamicForm\":\""+sysMenu2.getMenuIsDynamicForm()+"\",\n"+
								 				" \"menuFormId\":\""+sysMenu2.getMenuFormId()+"\",\n"+
												" \"childrens\":";
						
						jsonString = jsonString+"[\n";
						for (SysMenu sysMenu5 : menus2) {
							jsonString = jsonString+"{\n";
							List<SysMenu> menus3 = new ArrayList<SysMenu>();
							for (SysMenu sysMenu4 : m4) {
								if(sysMenu4.getMenuSeq().indexOf(sysMenu5.getMenuSeq()+".") > -1){
									menus3.add(sysMenu4);//当前一级根下子项
								}
							}
							if (menus3.size()>0) {
								jsonString = jsonString+" \"menuCode\":\""+sysMenu5.getMenuCode()+"\",\n"+
										 				" \"menuName\":\""+sysMenu5.getMenuName()+"\",\n"+
										 				" \"menuId\":\""+sysMenu5.getMenuId()+"\",\n"+
										 				" \"menuTitle\":\""+sysMenu5.getMenuDesc()+"\",\n"+
										 				" \"menuUrl\":\""+sysMenu5.getMenuUrl()+"\",\n"+
										 				" \"menuType\":\""+sysMenu5.getMenuType()+"\",\n"+
										 				" \"menuDictCode\":\""+sysMenu5.getMenuDicCode()+"\",\n"+
										 				" \"menuIsDynamicForm\":\""+sysMenu5.getMenuIsDynamicForm()+"\",\n"+
										 				" \"menuFormId\":\""+sysMenu5.getMenuFormId()+"\",\n"+
														" \"childrens\":";
								
							}else {
								jsonString = jsonString+" \"menuCode\":\""+sysMenu5.getMenuCode()+"\",\n"+
										 				" \"menuName\":\""+sysMenu5.getMenuName()+"\",\n"+
										 				" \"menuId\":\""+sysMenu5.getMenuId()+"\",\n"+
										 				" \"menuTitle\":\""+sysMenu5.getMenuDesc()+"\",\n"+
										 				" \"menuUrl\":\""+sysMenu5.getMenuUrl()+"\",\n"+
										 				" \"menuType\":\""+sysMenu5.getMenuType()+"\",\n"+
										 				" \"menuDictCode\":\""+sysMenu5.getMenuDicCode()+"\",\n"+
										 				" \"menuIsDynamicForm\":\""+sysMenu5.getMenuIsDynamicForm()+"\",\n"+
										 				" \"menuFormId\":\""+sysMenu5.getMenuFormId()+"\"\n";
							}
							jsonString = jsonString+"},\n";
						}
						jsonString = jsonString.substring(0,jsonString.length()-2);
						jsonString = jsonString+"]\n";
						
					}else {
						jsonString = jsonString+" \"menuCode\":\""+sysMenu2.getMenuCode()+"\",\n"+
								 				" \"menuName\":\""+sysMenu2.getMenuName()+"\",\n"+
								 				" \"menuId\":\""+sysMenu2.getMenuId()+"\",\n"+
								 				" \"menuTitle\":\""+sysMenu2.getMenuDesc()+"\",\n"+
								 				" \"menuUrl\":\""+sysMenu2.getMenuUrl()+"\",\n"+
								 				" \"menuType\":\""+sysMenu2.getMenuType()+"\",\n"+
								 				" \"menuDictCode\":\""+sysMenu2.getMenuDicCode()+"\",\n"+
								 				" \"menuIsDynamicForm\":\""+sysMenu2.getMenuIsDynamicForm()+"\",\n"+
								 				" \"menuFormId\":\""+sysMenu2.getMenuFormId()+"\"\n";
					}
					jsonString = jsonString+"},\n";
				}
				jsonString = jsonString.substring(0,jsonString.length()-2);
				jsonString = jsonString+"]\n";
				
			}else {
				jsonString = jsonString+" \"menuCode\":\""+sysMenu.getMenuCode()+"\",\n"+
						 				" \"menuName\":\""+sysMenu.getMenuName()+"\",\n"+
						 				" \"menuId\":\""+sysMenu.getMenuId()+"\",\n"+
						 				" \"menuUrl\":\""+sysMenu.getMenuUrl()+"\",\n"+
						 				" \"menuType\":\""+sysMenu.getMenuType()+"\",\n"+
						 				" \"menuDictCode\":\""+sysMenu.getMenuDicCode()+"\",\n"+
						 				" \"menuIsDynamicForm\":\""+sysMenu.getMenuIsDynamicForm()+"\",\n"+
						 				" \"menuFormId\":\""+sysMenu.getMenuFormId()+"\"\n";
			}
			jsonString = jsonString+"},\n";
		}
		jsonString = jsonString.substring(0,jsonString.length()-2);
		jsonString = jsonString+"]}\n";
		System.out.println("*********"+(new Date().getTime()-start));
		return jsonString;
	}
	
	/**
	 * 根据一级菜单编码获取二三级菜单
	 * @param isSuperAdmin 是否超级管理员
	 * @param userId 用户ID 
	 * 2017-07-29 
	 * @return
	 * @throws Exception 
	 * @throws DcfException 
	 */
	@SuppressWarnings("unchecked")
	public String  queryMainframeMenuByPcode(String userId,String schemeId,String menuCode,boolean isApp) throws DcfException, Exception {
		//一级
		SysMenuExample example = new SysMenuExample();
		example.or().andMenuCodeEqualTo(menuCode);
		SysMenu m1 = new SysMenu();
		if(sysMenuMapper.selectByExample(example).size()>0){
			m1 = sysMenuMapper.selectByExample(example).get(0);
		}else {
			return "没有此菜单";
		}
		//二级
		List<SysMenu> m2 = new ArrayList<SysMenu>();
		//三级
		List<SysMenuExpand> m3 = new ArrayList<SysMenuExpand>();
		List<SysMenu>[] results = new ArrayList[4];
		long start = new Date().getTime();
		
		Map map = new HashMap();
		map.put("schemeId", schemeId);
		map.put("userId", userId);
		map.put("parentCode", menuCode);
		
		//一级菜单下所有叶子菜单
		List<SysMenuExpand> powerMenu =  sysMenuMapper2.queryMenusByUseridAndPcode(map);
		if (powerMenu != null && powerMenu.size() > 0) {
			SysMenuExample sysMenuExample = new SysMenuExample();
			sysMenuExample.or().andDeleteMarkBackEqualTo("N").andMenuTypeNotEqualTo("L").andMenuParentCodeEqualTo(menuCode);
			sysMenuExample.setOrderByClause("menu_Sort");
			List<SysMenu> nLMenus = sysMenuMapper.selectByExample(sysMenuExample);//一级菜单下所有二级菜单
			if (nLMenus != null && nLMenus.size() > 0) {
				List<SysMenu> nLMenuList = new ArrayList<SysMenu>();
				for (int i = 0; i < nLMenus.size(); i++) {
					nLMenuList.add(nLMenus.get(i));
					nLMenus.get(i).setMenuName(nLMenus.get(i).getMenuName());
				}
				while (nLMenuList.size() > 0) {
					String menuSeq = nLMenuList.get(0).getMenuSeq();//二级菜单序列
					for (int j = 0; j < powerMenu.size(); j++) {
						String powerMenuSeq = powerMenu.get(j).getMenuSeq();//三级菜单序列
						if (powerMenuSeq.indexOf((menuSeq+".")) > -1) {
							m3.add(powerMenu.get(j));
						}
					}
					nLMenuList.remove(0);
				}
			}
			m2 = nLMenus;
		}
		StringBuffer sBuffer = new StringBuffer("{\"data\":[\n");
		String jsonString = "{\"data\":[\n";
		System.out.println("***************"+(new Date().getTime()-start));
		
			jsonString = jsonString+"{\n";
			//判断是否有子项
			List<SysMenu> menus1 = m2;
			if (menus1.size()>0) {
				jsonString = jsonString+" \"menuCode\":\""+m1.getMenuCode()+"\",\n"+
						 				" \"menuName\":\""+m1.getMenuName()+"\",\n"+
						 				" \"menuId\":\""+m1.getMenuId()+"\",\n"+
						 				" \"menuUrl\":\""+m1.getMenuUrl()+"\",\n"+
						 				" \"menuType\":\""+m1.getMenuType()+"\",\n"+
						 				" \"menuDictCode\":\""+m1.getMenuDicCode()+"\",\n"+
						 				" \"menuIsDynamicForm\":\""+m1.getMenuIsDynamicForm()+"\",\n"+
						 				" \"menuFormId\":\""+m1.getMenuFormId()+"\",\n"+
										" \"childrens\":";
				jsonString = jsonString+"[\n";
				for (SysMenu sysMenu2 : menus1) {
					jsonString = jsonString+"{\n";
					List<SysMenuExpand> menus2 = new ArrayList<SysMenuExpand>();
					for (SysMenuExpand sysMenu3 : m3) {
						if(sysMenu3.getMenuSeq().indexOf(sysMenu2.getMenuSeq()+".") > -1){
							menus2.add(sysMenu3);//当前一级根下子项
						}
					}
					if (menus2.size()>0) {
						jsonString = jsonString+" \"menuCode\":\""+sysMenu2.getMenuCode()+"\",\n"+
								 				" \"menuName\":\""+sysMenu2.getMenuName()+"\",\n"+
								 				" \"menuId\":\""+sysMenu2.getMenuId()+"\",\n"+
								 				" \"menuTitle\":\""+sysMenu2.getMenuDesc()+"\",\n"+
								 				" \"menuUrl\":\""+sysMenu2.getMenuUrl()+"\",\n"+
								 				" \"menuType\":\""+sysMenu2.getMenuType()+"\",\n"+
								 				" \"menuDictCode\":\""+sysMenu2.getMenuDicCode()+"\",\n"+
								 				" \"menuIsDynamicForm\":\""+sysMenu2.getMenuIsDynamicForm()+"\",\n"+
								 				" \"menuFormId\":\""+sysMenu2.getMenuFormId()+"\",\n"+
												" \"childrens\":";
						
						jsonString = jsonString+"[\n";
						for (SysMenuExpand sysMenu5 : menus2) {
							String url = sysMenu5.getMenuUrl();
							if (sysMenu5.getMenuIsDynamicForm()!=null&&sysMenu5.getMenuIsDynamicForm().equals("Y")) {
								SysFormconfig form = sysFormconfigMapper.selectByPrimaryKey(new BigDecimal(sysMenu5.getMenuFormId()));
								if (form!=null) {
									String path11 = sysformconfigService.findSysFormFolderTreeById(Integer.valueOf(form.getFormDefFolderId()+""), "");
									url = pathX+path11+form.getFormDefCode()+".vue";
								}
							}
							
							jsonString = jsonString+"{\n";
							jsonString = jsonString+" \"menuCode\":\""+sysMenu5.getMenuCode()+"\",\n"+
									 				" \"menuName\":\""+sysMenu5.getMenuName()+"\",\n"+
									 				" \"menuId\":\""+sysMenu5.getMenuId()+"\",\n"+
									 				" \"menuTitle\":\""+sysMenu5.getMenuDesc()+"\",\n"+
									 				" \"menuUrl\":\""+url+"\",\n"+
									 				" \"menuIcon\":\""+sysMenu5.getImgFileId()+"\",\n"+
									 				" \"menuType\":\""+sysMenu5.getMenuType()+"\",\n"+
									 				" \"menuDictCode\":\""+sysMenu5.getMenuDicCode()+"\",\n"+
									 				" \"menuIsDynamicForm\":\""+sysMenu5.getMenuIsDynamicForm()+"\",\n"+
									 				" \"menuFormId\":\""+sysMenu5.getMenuFormId()+"\"\n";
							jsonString = jsonString+"},\n";
						}
						jsonString = jsonString.substring(0,jsonString.length()-2);
						jsonString = jsonString+"]\n";
						
					}else {
						jsonString = jsonString+" \"menuCode\":\""+sysMenu2.getMenuCode()+"\",\n"+
								 				" \"menuName\":\""+sysMenu2.getMenuName()+"\",\n"+
								 				" \"menuId\":\""+sysMenu2.getMenuId()+"\",\n"+
								 				" \"menuTitle\":\""+sysMenu2.getMenuDesc()+"\",\n"+
								 				" \"menuUrl\":\""+sysMenu2.getMenuUrl()+"\",\n"+
								 				" \"menuType\":\""+sysMenu2.getMenuType()+"\",\n"+
								 				" \"menuDictCode\":\""+sysMenu2.getMenuDicCode()+"\",\n"+
								 				" \"menuIsDynamicForm\":\""+sysMenu2.getMenuIsDynamicForm()+"\",\n"+
								 				" \"menuFormId\":\""+sysMenu2.getMenuFormId()+"\"\n";
					}
					jsonString = jsonString+"},\n";
				}
				jsonString = jsonString.substring(0,jsonString.length()-2);
				jsonString = jsonString+"]\n";
				
			}else {
				jsonString = jsonString+" \"menuCode\":\""+m1.getMenuCode()+"\",\n"+
						 				" \"menuName\":\""+m1.getMenuName()+"\",\n"+
						 				" \"menuId\":\""+m1.getMenuId()+"\",\n"+
						 				" \"menuUrl\":\""+m1.getMenuUrl()+"\",\n"+
						 				" \"menuType\":\""+m1.getMenuType()+"\",\n"+
						 				" \"menuDictCode\":\""+m1.getMenuDicCode()+"\",\n"+
						 				" \"menuIsDynamicForm\":\""+m1.getMenuIsDynamicForm()+"\",\n"+
						 				" \"menuFormId\":\""+m1.getMenuFormId()+"\"\n";
			}
			jsonString = jsonString+"},\n";
		jsonString = jsonString.substring(0,jsonString.length()-2);
		jsonString = jsonString+"]}\n";
		System.out.println("*********"+(new Date().getTime()-start));
		return jsonString;
	}
	
	/**
	 * 根据用户获取用户的所有可操作的菜单
	 * @param isSuperAdmin 是否超级管理员
	 * @param userId 用户ID 
	 * 2017-07-29 
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public String  queryMainframeMenuWithRoleId(String roleId,HttpServletRequest request) {
		if(menusStringMap.get(roleId)==null){
			//		一级
			List<SysMenu> m1 = new ArrayList<SysMenu>();
			//二级
			List<SysMenu> m2 = new ArrayList<SysMenu>();
			//三级
			List<SysMenu> m3 = new ArrayList<SysMenu>();
			//		四级
			List<SysMenu> m4 = new ArrayList<SysMenu>();
			List<SysMenu>[] results = new ArrayList[4];
			List<SysMenu> powerMenu =  sysMenuMapper2.queryMenusByRoleId(roleId);
			if (powerMenu != null && powerMenu.size() > 0) {
				SysMenuExample sysMenuExample = new SysMenuExample();
				com.myehr.pojo.sysmenu.SysMenuExample.Criteria criteria = sysMenuExample.createCriteria();  
				criteria.andDeleteMarkEqualTo("N");
				criteria.andMenuTypeNotEqualTo("L");
				sysMenuExample.setOrderByClause("menu_Sort");
				List<SysMenu> nLMenus = sysMenuMapper.selectByExample(sysMenuExample);
				if (nLMenus != null && nLMenus.size() > 0) {
					List<SysMenu> nLMenuList = new ArrayList<SysMenu>();
					for (int i = 0; i < nLMenus.size(); i++) {
						nLMenuList.add(nLMenus.get(i));
						if (nLMenuList.get(i).getMenuSeq().equals(".orgPlan")) {
							//System.out.println(nLMenuList.get(i).getMenuSeq());
						}
						if (request==null) {
							nLMenus.get(i).setMenuName(nLMenus.get(i).getMenuName());
						}else {
							nLMenus.get(i).setMenuName(LangUtil.getLangByCode((String)request.getSession().getAttribute("langType"),nLMenus.get(i).getMenuName()));
						}
						
					}
					while (nLMenuList.size() > 0) {
						String menuSeq = nLMenuList.get(0).getMenuSeq();
						if (menuSeq != null && !"".equals(menuSeq)) {
							for (int j = 0; j < powerMenu.size(); j++) {
								String powerMenuSeq = powerMenu.get(j).getMenuSeq();
								if (powerMenuSeq != null && !"".equals(powerMenuSeq)) {
									
									if (powerMenuSeq.indexOf(menuSeq) > -1) {
										int level = menuSeq.split("\\.").length-1;
										//System.out.println(level+menuSeq);
										if(level==1){ //一级
											m1.add(nLMenuList.get(0));
											
										}else if(level==2){
											m2.add(nLMenuList.get(0));
										}else if(level==3){
											m3.add(nLMenuList.get(0));
										}else if(level==4){
											m4.add(nLMenuList.get(0));
										}
										break;
									}
								}
							}
						} 
						nLMenuList.remove(0);
					}
					for (int j = 0; j < powerMenu.size(); j++) {
						String powerMenuSeq = powerMenu.get(j).getMenuSeq();
						int level = powerMenuSeq.split("\\.").length-1;
						if(level==1){ //一级
							m1.add( powerMenu.get(j));
						}else if(level==2){
							m2.add( powerMenu.get(j));
						}else if(level==3){
							m3.add( powerMenu.get(j));
						}else if(level==4){
							m4.add( powerMenu.get(j));
						}
					}
				}
			}
			
			results[0] = m1;
			results[1] = m2;
			results[2] = m3;
			results[3] = m4;
			String jsonString = "{\"data\":[\n";
			
			
			for (SysMenu sysMenu : m1) {
				jsonString = jsonString+"{\n";
				//判断是否有子项
				List<SysMenu> menus1 = new ArrayList<SysMenu>();
				for (SysMenu sysMenu2 : m2) {
					if(sysMenu2.getMenuSeq().indexOf(sysMenu.getMenuSeq()) > -1){
						menus1.add(sysMenu2);//当前一级根下子项
					}
				}
				if (menus1.size()>0) {
					jsonString = jsonString+" \"menuCode\":\""+sysMenu.getMenuCode()+"\",\n"+
							 				" \"menuName\":\""+sysMenu.getMenuName()+"\",\n"+
							 				" \"menuId\":\""+sysMenu.getMenuId()+"\",\n"+
							 				" \"menuUrl\":\""+sysMenu.getMenuUrl()+"\",\n"+
							 				" \"menuType\":\""+sysMenu.getMenuType()+"\",\n"+
							 				" \"menuDictCode\":\""+sysMenu.getMenuDicCode()+"\",\n"+
							 				" \"menuIsDynamicForm\":\""+sysMenu.getMenuIsDynamicForm()+"\",\n"+
							 				" \"menuFormId\":\""+sysMenu.getMenuFormId()+"\",\n"+
											" \"childrens\":";
					
					jsonString = jsonString+"[\n";
					for (SysMenu sysMenu2 : menus1) {
						jsonString = jsonString+"{\n";
						List<SysMenu> menus2 = new ArrayList<SysMenu>();
						for (SysMenu sysMenu3 : m3) {
							if(sysMenu3.getMenuSeq().indexOf(sysMenu2.getMenuSeq()) > -1){
								menus2.add(sysMenu3);//当前一级根下子项
							}
						}
						if (menus2.size()>0) {
							jsonString = jsonString+" \"menuCode\":\""+sysMenu2.getMenuCode()+"\",\n"+
									 				" \"menuName\":\""+sysMenu2.getMenuName()+"\",\n"+
									 				" \"menuId\":\""+sysMenu2.getMenuId()+"\",\n"+
									 				" \"menuUrl\":\""+sysMenu2.getMenuUrl()+"\",\n"+
									 				" \"menuType\":\""+sysMenu2.getMenuType()+"\",\n"+
									 				" \"menuDictCode\":\""+sysMenu2.getMenuDicCode()+"\",\n"+
									 				" \"menuIsDynamicForm\":\""+sysMenu2.getMenuIsDynamicForm()+"\",\n"+
									 				" \"menuFormId\":\""+sysMenu2.getMenuFormId()+"\",\n"+
													" \"childrens\":";
							
							jsonString = jsonString+"[\n";
							for (SysMenu sysMenu5 : menus2) {
								jsonString = jsonString+"{\n";
								List<SysMenu> menus3 = new ArrayList<SysMenu>();
								for (SysMenu sysMenu4 : m4) {
									if(sysMenu4.getMenuSeq().indexOf(sysMenu5.getMenuSeq()) > -1){
										menus3.add(sysMenu4);//当前一级根下子项
									}
								}
								if (menus3.size()>0) {
									jsonString = jsonString+" \"menuCode\":\""+sysMenu5.getMenuCode()+"\",\n"+
											 				" \"menuName\":\""+sysMenu5.getMenuName()+"\",\n"+
											 				" \"menuId\":\""+sysMenu5.getMenuId()+"\",\n"+
											 				" \"menuUrl\":\""+sysMenu5.getMenuUrl()+"\",\n"+
											 				" \"menuType\":\""+sysMenu5.getMenuType()+"\",\n"+
											 				" \"menuDictCode\":\""+sysMenu5.getMenuDicCode()+"\",\n"+
											 				" \"menuIsDynamicForm\":\""+sysMenu5.getMenuIsDynamicForm()+"\",\n"+
											 				" \"menuFormId\":\""+sysMenu5.getMenuFormId()+"\",\n"+
															" \"childrens\":";
									
								}else {
									jsonString = jsonString+" \"menuCode\":\""+sysMenu5.getMenuCode()+"\",\n"+
											 				" \"menuName\":\""+sysMenu5.getMenuName()+"\",\n"+
											 				" \"menuId\":\""+sysMenu5.getMenuId()+"\",\n"+
											 				" \"menuUrl\":\""+sysMenu5.getMenuUrl()+"\",\n"+
											 				" \"menuType\":\""+sysMenu5.getMenuType()+"\",\n"+
											 				" \"menuDictCode\":\""+sysMenu5.getMenuDicCode()+"\",\n"+
											 				" \"menuIsDynamicForm\":\""+sysMenu5.getMenuIsDynamicForm()+"\",\n"+
											 				" \"menuFormId\":\""+sysMenu5.getMenuFormId()+"\"\n";
								}
								jsonString = jsonString+"},\n";
							}
							jsonString = jsonString.substring(0,jsonString.length()-2);
							jsonString = jsonString+"]\n";
							
						}else {
							jsonString = jsonString+" \"menuCode\":\""+sysMenu2.getMenuCode()+"\",\n"+
									 				" \"menuName\":\""+sysMenu2.getMenuName()+"\",\n"+
									 				" \"menuId\":\""+sysMenu2.getMenuId()+"\",\n"+
									 				" \"menuUrl\":\""+sysMenu2.getMenuUrl()+"\",\n"+
									 				" \"menuType\":\""+sysMenu2.getMenuType()+"\",\n"+
									 				" \"menuDictCode\":\""+sysMenu2.getMenuDicCode()+"\",\n"+
									 				" \"menuIsDynamicForm\":\""+sysMenu2.getMenuIsDynamicForm()+"\",\n"+
									 				" \"menuFormId\":\""+sysMenu2.getMenuFormId()+"\"\n";
						}
						jsonString = jsonString+"},\n";
					}
					jsonString = jsonString.substring(0,jsonString.length()-2);
					jsonString = jsonString+"]\n";
					
				}else {
					jsonString = jsonString+" \"menuCode\":\""+sysMenu.getMenuCode()+"\",\n"+
							 				" \"menuName\":\""+sysMenu.getMenuName()+"\",\n"+
							 				" \"menuId\":\""+sysMenu.getMenuId()+"\",\n"+
							 				" \"menuUrl\":\""+sysMenu.getMenuUrl()+"\",\n"+
							 				" \"menuType\":\""+sysMenu.getMenuType()+"\",\n"+
							 				" \"menuDictCode\":\""+sysMenu.getMenuDicCode()+"\",\n"+
							 				" \"menuIsDynamicForm\":\""+sysMenu.getMenuIsDynamicForm()+"\",\n"+
							 				" \"menuFormId\":\""+sysMenu.getMenuFormId()+"\"\n";
				}
				jsonString = jsonString+"},\n";
			}
			jsonString = jsonString.substring(0,jsonString.length()-2);
			jsonString = jsonString+"]}\n";
			menusStringMap.put(roleId,jsonString);
		}else {
			return menusStringMap.get(roleId);
		}
		return menusStringMap.get(roleId);
	}
	
	
	/**
	 * 根据用户获取用户的所有可操作的菜单
	 * @param isSuperAdmin 是否超级管理员
	 * @param userId 用户ID 
	 * 2017-07-29 
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public void  reinitMainframeMenuWithRoleId(String roleId,HttpServletRequest request) {
		long start = new Date().getTime();
		//		一级
		List<SysMenu> m1 = new ArrayList<SysMenu>();
		//二级
		List<SysMenu> m2 = new ArrayList<SysMenu>();
		//三级
		List<SysMenu> m3 = new ArrayList<SysMenu>();
		//		四级
		List<SysMenu> m4 = new ArrayList<SysMenu>();
		List<SysMenu>[] results = new ArrayList[4];
		List<SysMenu> powerMenu =  sysMenuMapper2.queryMenusByRoleId(roleId);
		if (powerMenu != null && powerMenu.size() > 0) {
			SysMenuExample sysMenuExample = new SysMenuExample();
			com.myehr.pojo.sysmenu.SysMenuExample.Criteria criteria = sysMenuExample.createCriteria();  
			criteria.andDeleteMarkEqualTo("N");
			criteria.andMenuTypeNotEqualTo("L");
			sysMenuExample.setOrderByClause("menu_Sort");
			List<SysMenu> nLMenus = sysMenuMapper.selectByExample(sysMenuExample);
			if (nLMenus != null && nLMenus.size() > 0) {
				List<SysMenu> nLMenuList = new ArrayList<SysMenu>();
				for (int i = 0; i < nLMenus.size(); i++) {
					nLMenuList.add(nLMenus.get(i));
					if (nLMenuList.get(i).getMenuSeq().equals(".orgPlan")) {
						//System.out.println(nLMenuList.get(i).getMenuSeq());
					}
					if (request==null) {
						nLMenus.get(i).setMenuName(nLMenus.get(i).getMenuName());
					}else {
						nLMenus.get(i).setMenuName(LangUtil.getLangByCode((String)request.getSession().getAttribute("langType"),nLMenus.get(i).getMenuName()));
					}
					
				}
				while (nLMenuList.size() > 0) {
					String menuSeq = nLMenuList.get(0).getMenuSeq();
					if (menuSeq != null && !"".equals(menuSeq)) {
						for (int j = 0; j < powerMenu.size(); j++) {
							String powerMenuSeq = powerMenu.get(j).getMenuSeq();
							if (powerMenuSeq != null && !"".equals(powerMenuSeq)) {
								
								if (powerMenuSeq.indexOf(menuSeq) > -1) {
									int level = menuSeq.split("\\.").length-1;
									//System.out.println(level+menuSeq);
									if(level==1){ //一级
										m1.add(nLMenuList.get(0));
										
									}else if(level==2){
										m2.add(nLMenuList.get(0));
									}else if(level==3){
										m3.add(nLMenuList.get(0));
									}else if(level==4){
										m4.add(nLMenuList.get(0));
									}
									break;
								}
							}
						}
					} 
					nLMenuList.remove(0);
				}
				for (int j = 0; j < powerMenu.size(); j++) {
					String powerMenuSeq = powerMenu.get(j).getMenuSeq();
					int level = powerMenuSeq.split("\\.").length-1;
					if(level==1){ //一级
						m1.add( powerMenu.get(j));
					}else if(level==2){
						m2.add( powerMenu.get(j));
					}else if(level==3){
						m3.add( powerMenu.get(j));
					}else if(level==4){
						m4.add( powerMenu.get(j));
					}
				}
			}
		}
		
		results[0] = m1;
		results[1] = m2;
		results[2] = m3;
		results[3] = m4;
		String jsonString = "{\"data\":[\n";
		
		
		for (SysMenu sysMenu : m1) {
			jsonString = jsonString+"{\n";
			//判断是否有子项
			List<SysMenu> menus1 = new ArrayList<SysMenu>();
			for (SysMenu sysMenu2 : m2) {
				if(sysMenu2.getMenuSeq().indexOf(sysMenu.getMenuSeq()) > -1){
					menus1.add(sysMenu2);//当前一级根下子项
				}
			}
			if (menus1.size()>0) {
				jsonString = jsonString+" \"menuCode\":\""+sysMenu.getMenuCode()+"\",\n"+
						 				" \"menuName\":\""+sysMenu.getMenuName()+"\",\n"+
						 				" \"menuId\":\""+sysMenu.getMenuId()+"\",\n"+
						 				" \"menuUrl\":\""+sysMenu.getMenuUrl()+"\",\n"+
						 				" \"menuType\":\""+sysMenu.getMenuType()+"\",\n"+
						 				" \"menuDictCode\":\""+sysMenu.getMenuDicCode()+"\",\n"+
						 				" \"menuIsDynamicForm\":\""+sysMenu.getMenuIsDynamicForm()+"\",\n"+
						 				" \"menuFormId\":\""+sysMenu.getMenuFormId()+"\",\n"+
										" \"childrens\":";
				
				jsonString = jsonString+"[\n";
				for (SysMenu sysMenu2 : menus1) {
					jsonString = jsonString+"{\n";
					List<SysMenu> menus2 = new ArrayList<SysMenu>();
					for (SysMenu sysMenu3 : m3) {
						if(sysMenu3.getMenuSeq().indexOf(sysMenu2.getMenuSeq()) > -1){
							menus2.add(sysMenu3);//当前一级根下子项
						}
					}
					if (menus2.size()>0) {
						jsonString = jsonString+" \"menuCode\":\""+sysMenu2.getMenuCode()+"\",\n"+
								 				" \"menuName\":\""+sysMenu2.getMenuName()+"\",\n"+
								 				" \"menuId\":\""+sysMenu2.getMenuId()+"\",\n"+
								 				" \"menuUrl\":\""+sysMenu2.getMenuUrl()+"\",\n"+
								 				" \"menuType\":\""+sysMenu2.getMenuType()+"\",\n"+
								 				" \"menuDictCode\":\""+sysMenu2.getMenuDicCode()+"\",\n"+
								 				" \"menuIsDynamicForm\":\""+sysMenu2.getMenuIsDynamicForm()+"\",\n"+
								 				" \"menuFormId\":\""+sysMenu2.getMenuFormId()+"\",\n"+
												" \"childrens\":";
						
						jsonString = jsonString+"[\n";
						for (SysMenu sysMenu5 : menus2) {
							jsonString = jsonString+"{\n";
							List<SysMenu> menus3 = new ArrayList<SysMenu>();
							for (SysMenu sysMenu4 : m4) {
								if(sysMenu4.getMenuSeq().indexOf(sysMenu5.getMenuSeq()) > -1){
									menus3.add(sysMenu4);//当前一级根下子项
								}
							}
							if (menus3.size()>0) {
								jsonString = jsonString+" \"menuCode\":\""+sysMenu5.getMenuCode()+"\",\n"+
										 				" \"menuName\":\""+sysMenu5.getMenuName()+"\",\n"+
										 				" \"menuId\":\""+sysMenu5.getMenuId()+"\",\n"+
										 				" \"menuUrl\":\""+sysMenu5.getMenuUrl()+"\",\n"+
										 				" \"menuType\":\""+sysMenu5.getMenuType()+"\",\n"+
										 				" \"menuDictCode\":\""+sysMenu5.getMenuDicCode()+"\",\n"+
										 				" \"menuIsDynamicForm\":\""+sysMenu5.getMenuIsDynamicForm()+"\",\n"+
										 				" \"menuFormId\":\""+sysMenu5.getMenuFormId()+"\",\n"+
														" \"childrens\":";
								
							}else {
								jsonString = jsonString+" \"menuCode\":\""+sysMenu5.getMenuCode()+"\",\n"+
										 				" \"menuName\":\""+sysMenu5.getMenuName()+"\",\n"+
										 				" \"menuId\":\""+sysMenu5.getMenuId()+"\",\n"+
										 				" \"menuUrl\":\""+sysMenu5.getMenuUrl()+"\",\n"+
										 				" \"menuType\":\""+sysMenu5.getMenuType()+"\",\n"+
										 				" \"menuDictCode\":\""+sysMenu5.getMenuDicCode()+"\",\n"+
										 				" \"menuIsDynamicForm\":\""+sysMenu5.getMenuIsDynamicForm()+"\",\n"+
										 				" \"menuFormId\":\""+sysMenu5.getMenuFormId()+"\"\n";
							}
							jsonString = jsonString+"},\n";
						}
						jsonString = jsonString.substring(0,jsonString.length()-2);
						jsonString = jsonString+"]\n";
						
					}else {
						jsonString = jsonString+" \"menuCode\":\""+sysMenu2.getMenuCode()+"\",\n"+
								 				" \"menuName\":\""+sysMenu2.getMenuName()+"\",\n"+
								 				" \"menuId\":\""+sysMenu2.getMenuId()+"\",\n"+
								 				" \"menuUrl\":\""+sysMenu2.getMenuUrl()+"\",\n"+
								 				" \"menuType\":\""+sysMenu2.getMenuType()+"\",\n"+
								 				" \"menuDictCode\":\""+sysMenu2.getMenuDicCode()+"\",\n"+
								 				" \"menuIsDynamicForm\":\""+sysMenu2.getMenuIsDynamicForm()+"\",\n"+
								 				" \"menuFormId\":\""+sysMenu2.getMenuFormId()+"\"\n";
					}
					jsonString = jsonString+"},\n";
				}
				jsonString = jsonString.substring(0,jsonString.length()-2);
				jsonString = jsonString+"]\n";
				
			}else {
				jsonString = jsonString+" \"menuCode\":\""+sysMenu.getMenuCode()+"\",\n"+
						 				" \"menuName\":\""+sysMenu.getMenuName()+"\",\n"+
						 				" \"menuId\":\""+sysMenu.getMenuId()+"\",\n"+
						 				" \"menuUrl\":\""+sysMenu.getMenuUrl()+"\",\n"+
						 				" \"menuType\":\""+sysMenu.getMenuType()+"\",\n"+
						 				" \"menuDictCode\":\""+sysMenu.getMenuDicCode()+"\",\n"+
						 				" \"menuIsDynamicForm\":\""+sysMenu.getMenuIsDynamicForm()+"\",\n"+
						 				" \"menuFormId\":\""+sysMenu.getMenuFormId()+"\"\n";
			}
			jsonString = jsonString+"},\n";
		}
		jsonString = jsonString.substring(0,jsonString.length()-2);
		jsonString = jsonString+"]}\n";
		long end = new Date().getTime();
		System.out.println("*********************************************"+(end-start)/100);
		menusStringMap.put(roleId,jsonString);
	}
	
	/**
	 * 根据用户获取用户的选择方案的菜单
	 * @param isSuperAdmin 是否超级管理员
	 * @param userId 用户ID 
	 * 2017-07-29 
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public String  queryMainframeMenuWithScheme(String schemeId,String userId,HttpServletRequest request, String isApp) {
		long start = new Date().getTime();
		SysUser user = sysUserMapper.selectByPrimaryKey(Integer.valueOf(userId));
		user.setSchemeId(schemeId);
		sysUserMapper.updateByPrimaryKey(user);
		//一级
		List<SysMenuExpand> m1 = new ArrayList<SysMenuExpand>();
		//二级
		List<SysMenuExpand> m2 = new ArrayList<SysMenuExpand>();
		//三级
		List<SysMenuExpand> m3 = new ArrayList<SysMenuExpand>();
		//四级
		List<SysMenuExpand> m4 = new ArrayList<SysMenuExpand>();
		List<SysMenuExpand>[] results = new ArrayList[4];
		Map map = new HashMap();
		map.put("schemeId", schemeId);
		map.put("userId", userId);
		List<SysMenuExpand> powerMenu =  sysMenuMapper2.queryMenusByUseridAndSchemeId(map);
		if (powerMenu != null && powerMenu.size() > 0) {
			List<SysMenuExpand> nLMenus = sysMenuMapper2.selectByExample();//所有菜单
			if (nLMenus != null && nLMenus.size() > 0) {
				List<SysMenuExpand> nLMenuList = new ArrayList<SysMenuExpand>();
				for (int i = 0; i < nLMenus.size(); i++) {
					nLMenuList.add(nLMenus.get(i));
					if(nLMenuList.get(i).getMenuSeq()!=null){
						nLMenus.get(i).setMenuName(nLMenuList.get(i).getMenuName());
					}
				}
				while (nLMenuList.size() > 0) {
					String menuSeq = nLMenuList.get(0).getMenuSeq();
					if (menuSeq != null && !"".equals(menuSeq)) {
						for (int j = 0; j < powerMenu.size(); j++) {
							String powerMenuSeq = powerMenu.get(j).getMenuSeq();
							if (powerMenuSeq != null && !"".equals(powerMenuSeq)) {
								
								if (powerMenuSeq.indexOf(menuSeq) > -1) {
									int level = menuSeq.split("\\.").length-1;
									//System.out.println(level+menuSeq);
									if(level==1){ //一级
										m1.add(nLMenuList.get(0));
										
									}else if(level==2){
										m2.add(nLMenuList.get(0));
									}else if(level==3){
										m3.add(nLMenuList.get(0));
									}else if(level==4){
										m4.add(nLMenuList.get(0));
									}
									break;
								}
							}
						}
					} 
					nLMenuList.remove(0);
				}
				for (int j = 0; j < powerMenu.size(); j++) {
					String powerMenuSeq = powerMenu.get(j).getMenuSeq();
					int level = powerMenuSeq.split("\\.").length-1;
					if(level==1){ //一级
						m1.add( powerMenu.get(j));
					}else if(level==2){
						m2.add( powerMenu.get(j));
					}else if(level==3){
						m3.add( powerMenu.get(j));
					}else if(level==4){
						m4.add( powerMenu.get(j));
					}
				}
			}
		}
		/*if(m1.size()==1){
			m1 = m2;
			m2 = m3;
			m3 = m4;
			m4 = null;
		}*/
		results[0] = m1;
		results[1] = m2;
		results[2] = m3;
		results[3] = m4;
		String jsonString = "{\"data\":[\n";
		
		
		for (SysMenuExpand sysMenu : m1) {
			jsonString = jsonString+"{\n";
			//判断是否有子项
			List<SysMenuExpand> menus1 = new ArrayList<SysMenuExpand>();
			for (SysMenuExpand sysMenu2 : m2) {
				if(sysMenu2.getMenuSeq().indexOf(sysMenu.getMenuSeq()) > -1){
					menus1.add(sysMenu2);//当前一级根下子项
				}
			}
			if (menus1.size()>0) {
				if (isApp!=null&&isApp.equals("APP")&&sysMenu.getMenuFormId()!=null&&!sysMenu.getMenuFormId().equals("")&&(sysMenu.getMenuUrl()==null||sysMenu.getMenuUrl().equals(""))) {
					sysMenu.setMenuUrl("/myehr/form/toForm.action?formId="+sysMenu.getMenuFormId()+"&formType=APP");
				}
				jsonString = jsonString+" \"menuCode\":\""+sysMenu.getMenuCode()+"\",\n"+
						 				" \"menuName\":\""+sysMenu.getMenuName()+"\",\n"+
						 				" \"menuUrl\":\""+sysMenu.getMenuUrl()+"\",\n"+
						 				" \"menuType\":\""+sysMenu.getMenuType()+"\",\n"+
						 				" \"menuDictCode\":\""+sysMenu.getMenuDicCode()+"\",\n"+
						 				" \"menuIsDynamicForm\":\""+sysMenu.getMenuIsDynamicForm()+"\",\n"+
						 				" \"menuFormId\":\""+sysMenu.getMenuFormId()+"\",\n"+
						 				" \"iconUrl\":\""+sysMenu.getIconUrl()+"\",\n"+
						 				" \"iconType\":\""+sysMenu.getIconType()+"\",\n"+
						 				" \"imgFileId\":\""+sysMenu.getImgFileId()+"\",\n"+
						 				" \"checkedImgFileId\":\""+sysMenu.getCheckedImgFileId()+"\",\n"+
										" \"childrens\":";
				
				jsonString = jsonString+"[\n";
				for (SysMenuExpand sysMenu2 : menus1) {
					jsonString = jsonString+"{\n";
					List<SysMenuExpand> menus2 = new ArrayList<SysMenuExpand>();
					for (SysMenuExpand sysMenu3 : m3) {
						if(sysMenu3.getMenuSeq().indexOf(sysMenu2.getMenuSeq()) > -1){
							menus2.add(sysMenu3);//当前一级根下子项
						}
					}
					if (menus2.size()>0) {
						if (isApp!=null&&isApp.equals("APP")&&sysMenu2.getMenuFormId()!=null&&!sysMenu2.getMenuFormId().equals("")&&(sysMenu2.getMenuUrl()==null||sysMenu2.getMenuUrl().equals(""))) {
							sysMenu2.setMenuUrl("/myehr/form/toForm.action?formId="+sysMenu2.getMenuFormId()+"&formType=APP");
						} 
						jsonString = jsonString+" \"menuCode\":\""+sysMenu2.getMenuCode()+"\",\n"+
								 				" \"menuName\":\""+sysMenu2.getMenuName()+"\",\n"+
								 				" \"menuUrl\":\""+sysMenu2.getMenuUrl()+"\",\n"+
								 				" \"menuType\":\""+sysMenu2.getMenuType()+"\",\n"+
								 				" \"menuDictCode\":\""+sysMenu2.getMenuDicCode()+"\",\n"+
								 				" \"menuIsDynamicForm\":\""+sysMenu2.getMenuIsDynamicForm()+"\",\n"+
								 				" \"menuFormId\":\""+sysMenu2.getMenuFormId()+"\",\n"+
								 				" \"iconUrl\":\""+sysMenu2.getIconUrl()+"\",\n"+
								 				" \"iconType\":\""+sysMenu2.getIconType()+"\",\n"+
								 				" \"imgFileId\":\""+sysMenu2.getImgFileId()+"\",\n"+
								 				" \"checkedImgFileId\":\""+sysMenu2.getCheckedImgFileId()+"\",\n"+
								 				" \"childrens\":";
						
						jsonString = jsonString+"[\n";
						for (SysMenuExpand sysMenu5 : menus2) {
							jsonString = jsonString+"{\n";
							List<SysMenuExpand> menus3 = new ArrayList<SysMenuExpand>();
							for (SysMenuExpand sysMenu4 : m4) {
								if(sysMenu4.getMenuSeq().indexOf(sysMenu5.getMenuSeq()) > -1){
									menus3.add(sysMenu4);//当前一级根下子项
								}
							}
							if (menus3.size()>0) {
								if (isApp!=null&&isApp.equals("APP")&&sysMenu5.getMenuFormId()!=null&&!sysMenu5.getMenuFormId().equals("")&&(sysMenu5.getMenuUrl()==null||sysMenu5.getMenuUrl().equals(""))) {
									sysMenu5.setMenuUrl("/myehr/form/toForm.action?formId="+sysMenu5.getMenuFormId()+"&formType=APP");
								} 
								jsonString = jsonString+" \"menuCode\":\""+sysMenu5.getMenuCode()+"\",\n"+
										 				" \"menuName\":\""+sysMenu5.getMenuName()+"\",\n"+
										 				" \"menuUrl\":\""+sysMenu5.getMenuUrl()+"\",\n"+
										 				" \"menuType\":\""+sysMenu5.getMenuType()+"\",\n"+
										 				" \"menuDictCode\":\""+sysMenu5.getMenuDicCode()+"\",\n"+
										 				" \"menuIsDynamicForm\":\""+sysMenu5.getMenuIsDynamicForm()+"\",\n"+
										 				" \"menuFormId\":\""+sysMenu5.getMenuFormId()+"\",\n"+
										 				" \"iconUrl\":\""+sysMenu5.getIconUrl()+"\",\n"+
										 				" \"iconType\":\""+sysMenu5.getIconType()+"\",\n"+
										 				" \"imgFileId\":\""+sysMenu5.getImgFileId()+"\",\n"+
										 				" \"checkedImgFileId\":\""+sysMenu5.getCheckedImgFileId()+"\",\n"+
										 				" \"childrens\":";
								
							}else {
								if (isApp!=null&&isApp.equals("APP")&&sysMenu5.getMenuFormId()!=null&&!sysMenu5.getMenuFormId().equals("")&&(sysMenu5.getMenuUrl()==null||sysMenu5.getMenuUrl().equals(""))) {
									sysMenu5.setMenuUrl("/myehr/form/toForm.action?formId="+sysMenu5.getMenuFormId()+"&formType=APP");
								} 
								jsonString = jsonString+" \"menuCode\":\""+sysMenu5.getMenuCode()+"\",\n"+
										 				" \"menuName\":\""+sysMenu5.getMenuName()+"\",\n"+
										 				" \"menuUrl\":\""+sysMenu5.getMenuUrl()+"\",\n"+
										 				" \"menuType\":\""+sysMenu5.getMenuType()+"\",\n"+
										 				" \"menuDictCode\":\""+sysMenu5.getMenuDicCode()+"\",\n"+
										 				" \"menuIsDynamicForm\":\""+sysMenu5.getMenuIsDynamicForm()+"\",\n"+
										 				" \"iconUrl\":\""+sysMenu5.getIconUrl()+"\",\n"+
										 				" \"iconType\":\""+sysMenu5.getIconType()+"\",\n"+
										 				" \"imgFileId\":\""+sysMenu5.getImgFileId()+"\",\n"+
										 				" \"checkedImgFileId\":\""+sysMenu5.getCheckedImgFileId()+"\",\n"+
										 				" \"menuFormId\":\""+sysMenu5.getMenuFormId()+"\"\n";
							}
							jsonString = jsonString+"},\n";
						}
						jsonString = jsonString.substring(0,jsonString.length()-2);
						jsonString = jsonString+"]\n";
						
					}else {
						if (isApp!=null&&isApp.equals("APP")&&sysMenu2.getMenuFormId()!=null&&!sysMenu2.getMenuFormId().equals("")&&(sysMenu2.getMenuUrl()==null||sysMenu2.getMenuUrl().equals(""))) {
							sysMenu2.setMenuUrl("/myehr/form/toForm.action?formId="+sysMenu2.getMenuFormId()+"&formType=APP");
						} 
						jsonString = jsonString+" \"menuCode\":\""+sysMenu2.getMenuCode()+"\",\n"+
								 				" \"menuName\":\""+sysMenu2.getMenuName()+"\",\n"+
								 				" \"menuUrl\":\""+sysMenu2.getMenuUrl()+"\",\n"+
								 				" \"menuType\":\""+sysMenu2.getMenuType()+"\",\n"+
								 				" \"menuDictCode\":\""+sysMenu2.getMenuDicCode()+"\",\n"+
								 				" \"menuIsDynamicForm\":\""+sysMenu2.getMenuIsDynamicForm()+"\",\n"+
								 				" \"iconUrl\":\""+sysMenu2.getIconUrl()+"\",\n"+
								 				" \"iconType\":\""+sysMenu2.getIconType()+"\",\n"+
								 				" \"imgFileId\":\""+sysMenu2.getImgFileId()+"\",\n"+
								 				" \"checkedImgFileId\":\""+sysMenu2.getCheckedImgFileId()+"\",\n"+
								 				" \"menuFormId\":\""+sysMenu2.getMenuFormId()+"\"\n";
					}
					jsonString = jsonString+"},\n";
				}
				jsonString = jsonString.substring(0,jsonString.length()-2);
				jsonString = jsonString+"]\n";
				
			}else {
				if (isApp!=null&&isApp.equals("APP")&&sysMenu.getMenuFormId()!=null&&!sysMenu.getMenuFormId().equals("")&&(sysMenu.getMenuUrl()==null||sysMenu.getMenuUrl().equals(""))) {
					sysMenu.setMenuUrl("/myehr/form/toForm.action?formId="+sysMenu.getMenuFormId()+"&formType=APP");
				} 
				jsonString = jsonString+" \"menuCode\":\""+sysMenu.getMenuCode()+"\",\n"+
						 				" \"menuName\":\""+sysMenu.getMenuName()+"\",\n"+
						 				" \"menuUrl\":\""+sysMenu.getMenuUrl()+"\",\n"+
						 				" \"menuType\":\""+sysMenu.getMenuType()+"\",\n"+
						 				" \"menuDictCode\":\""+sysMenu.getMenuDicCode()+"\",\n"+
						 				" \"menuIsDynamicForm\":\""+sysMenu.getMenuIsDynamicForm()+"\",\n"+
						 				" \"iconUrl\":\""+sysMenu.getIconUrl()+"\",\n"+
						 				" \"iconType\":\""+sysMenu.getIconType()+"\",\n"+
						 				" \"imgFileId\":\""+sysMenu.getImgFileId()+"\",\n"+
						 				" \"checkedImgFileId\":\""+sysMenu.getCheckedImgFileId()+"\",\n"+
						 				" \"menuFormId\":\""+sysMenu.getMenuFormId()+"\"\n";
			}
			jsonString = jsonString+"},\n";
		}
		jsonString = jsonString.substring(0,jsonString.length()-2);
		jsonString = jsonString+"]}\n";
		System.out.println((new Date().getTime()-start)/1000);
		return jsonString;
	}
	
	
	@SuppressWarnings("unchecked")
	public Map getMenuWithSchemeAllx(String userId) throws Exception {
		List<DictData> datas = sysformconfigService.getCardDictDataByDictTypeCode("sysCustomMenus", "dict");
		Map map = new HashMap();
		for (DictData dictData : datas) {
			String menus = sysformconfigService.getMainframeMenuWithSchemex(dictData.getCode(),userId);
//			map.put(dictData.getName(),queryMainframeMenuWithSchemex(dictData.getCode(),userId,null,"N"));
			map.put(dictData.getName(),menus);
		}
		return map;
	}
	
	@SuppressWarnings("unchecked")
	public void setMenuWithSchemeAllx(String userId) throws Exception {
		List<DictData> datas = sysformconfigService.getCardDictDataByDictTypeCode("sysCustomMenus", "dict");
		Map map = new HashMap();
		for (DictData dictData : datas) {
			int menus = sysformconfigService.setMainframeMenuWithSchemex(dictData.getCode(),userId);
			map.put(dictData.getName(),menus);
		}
	}
	
	/**
	 * 根据用户获取用户的选择方案的菜单
	 * @param isSuperAdmin 是否超级管理员
	 * @param userId 用户ID 
	 * 2017-07-29 
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public String  queryMainframeMenuWithSchemex(String schemeId,String userId,HttpServletRequest request, String isApp) {
		long start = new Date().getTime();
		SysUser user = sysUserMapper.selectByPrimaryKey(Integer.valueOf(userId));
		user.setSchemeId(schemeId);
		sysUserMapper.updateByPrimaryKey(user);
		//一级
		List<SysMenuExpand> m1 = new ArrayList<SysMenuExpand>();
		List<SysMenuExpand>[] results = new ArrayList[4];
		Map map = new HashMap();
		map.put("schemeId", schemeId);
		map.put("userId", userId);
		map.put("menuType","M");
		List<SysMenuExpand> powerMenu1 =  sysMenuMapper2.queryMenusByUseridAndSchemeIdx(map);
		map.put("menuType","F");
		List<SysMenuExpand> powerMenu2 =  sysMenuMapper2.queryMenusByUseridAndSchemeIdx(map);
		map.put("menuType","L");
		List<SysMenuExpand> powerMenu3 =  sysMenuMapper2.queryMenusByUseridAndSchemeIdx(map);
		String jsonString = "{\"data\":[\n";
		if (powerMenu1!=null&&powerMenu1.size()>0&&powerMenu2!=null&&powerMenu2.size()>0&&powerMenu3!=null&&powerMenu3.size()>0) {//三级全
			
			for (int k=0; k<powerMenu1.size() ;k++) {
				SysMenuExpand sysMenuExpand1 = powerMenu1.get(k);
				String menuseq1 = sysMenuExpand1.getMenuSeq();
				jsonString = jsonString+"{ \"menuCode\":\""+sysMenuExpand1.getMenuCode()+"\",\n"+
						 				" \"menuName\":\""+sysMenuExpand1.getMenuName()+"\",\n"+
						 				" \"menuUrl\":\""+sysMenuExpand1.getMenuUrl()+"\",\n"+
						 				" \"menuType\":\""+sysMenuExpand1.getMenuType()+"\",\n"+
						 				" \"menuDictCode\":\""+sysMenuExpand1.getMenuDicCode()+"\",\n"+
						 				" \"menuIsDynamicForm\":\""+sysMenuExpand1.getMenuIsDynamicForm()+"\",\n"+
						 				" \"menuFormId\":\""+sysMenuExpand1.getMenuFormId()+"\",\n"+
						 				" \"iconUrl\":\""+sysMenuExpand1.getIconUrl()+"\",\n"+
						 				" \"iconType\":\""+sysMenuExpand1.getIconType()+"\",\n"+
						 				" \"imgFileId\":\""+sysMenuExpand1.getImgFileId()+"\",\n"+
						 				" \"checkedImgFileId\":\""+sysMenuExpand1.getCheckedImgFileId()+"\",\n"+
										" \"childrens\":[";
					for (int i=powerMenu2.size()-1; i>=0 ;i--) {
						SysMenuExpand sysMenuExpand2 = powerMenu2.get(i);
						String menuseq2 = sysMenuExpand2.getMenuSeq();
						if (menuseq2.indexOf(menuseq1+".")>-1) {
							jsonString = jsonString+"{ \"menuCode\":\""+sysMenuExpand2.getMenuCode()+"\",\n"+
									 				" \"menuName\":\""+sysMenuExpand2.getMenuName()+"\",\n"+
									 				" \"menuUrl\":\""+sysMenuExpand2.getMenuUrl()+"\",\n"+
									 				" \"menuType\":\""+sysMenuExpand2.getMenuType()+"\",\n"+
									 				" \"menuDictCode\":\""+sysMenuExpand2.getMenuDicCode()+"\",\n"+
									 				" \"menuIsDynamicForm\":\""+sysMenuExpand2.getMenuIsDynamicForm()+"\",\n"+
									 				" \"menuFormId\":\""+sysMenuExpand2.getMenuFormId()+"\",\n"+
									 				" \"iconUrl\":\""+sysMenuExpand2.getIconUrl()+"\",\n"+
									 				" \"iconType\":\""+sysMenuExpand2.getIconType()+"\",\n"+
									 				" \"imgFileId\":\""+sysMenuExpand2.getImgFileId()+"\",\n"+
									 				" \"checkedImgFileId\":\""+sysMenuExpand2.getCheckedImgFileId()+"\",\n"+
													" \"childrens\":[";
							
							for (int j = powerMenu3.size()-1; j >=0 ; j--) {
								SysMenuExpand sysMenuExpand3 = powerMenu3.get(j);
								System.out.println(menuseq2+".");
								System.out.println(sysMenuExpand3.getMenuSeq());
								if (sysMenuExpand3.getMenuSeq().indexOf(menuseq2+".")>-1) {
									jsonString = jsonString+"{ \"menuCode\":\""+sysMenuExpand3.getMenuCode()+"\",\n"+
											 				" \"menuName\":\""+sysMenuExpand3.getMenuName()+"\",\n"+
											 				" \"menuUrl\":\""+sysMenuExpand3.getMenuUrl()+"\",\n"+
											 				" \"menuType\":\""+sysMenuExpand3.getMenuType()+"\",\n"+
											 				" \"menuDictCode\":\""+sysMenuExpand3.getMenuDicCode()+"\",\n"+
											 				" \"menuIsDynamicForm\":\""+sysMenuExpand3.getMenuIsDynamicForm()+"\",\n"+
											 				" \"menuFormId\":\""+sysMenuExpand3.getMenuFormId()+"\",\n"+
											 				" \"iconUrl\":\""+sysMenuExpand3.getIconUrl()+"\",\n"+
											 				" \"iconType\":\""+sysMenuExpand3.getIconType()+"\",\n"+
											 				" \"imgFileId\":\""+sysMenuExpand3.getImgFileId()+"\",\n"+
											 				" \"checkedImgFileId\":\""+sysMenuExpand3.getCheckedImgFileId()+"\"},\n";
									powerMenu3.remove(sysMenuExpand3);
								}
								if (j==0) {
									jsonString = jsonString.substring(0,jsonString.length()-2);
								}
							}
							jsonString = jsonString+"]},\n";
							powerMenu2.remove(sysMenuExpand2);
						}

						if (i==0) {
							jsonString = jsonString.substring(0,jsonString.length()-2);
						}
					}
					jsonString = jsonString+"]},\n";
					if (k==(powerMenu1.size()-1)) {
						
						jsonString = jsonString.substring(0,jsonString.length()-2);
					}
				}
				
		} else if (powerMenu2!=null&&powerMenu2.size()>0&&powerMenu3!=null&&powerMenu3.size()>0) {//只有二三级
			for (int i=0; i<powerMenu2.size() ;i++) {
				SysMenuExpand sysMenuExpand2 = powerMenu2.get(i);
				String menuseq2 = sysMenuExpand2.getMenuSeq();
				jsonString = jsonString+"{ \"menuCode\":\""+sysMenuExpand2.getMenuCode()+"\",\n"+
						 				" \"menuName\":\""+sysMenuExpand2.getMenuName()+"\",\n"+
						 				" \"menuUrl\":\""+sysMenuExpand2.getMenuUrl()+"\",\n"+
						 				" \"menuType\":\""+sysMenuExpand2.getMenuType()+"\",\n"+
						 				" \"menuDictCode\":\""+sysMenuExpand2.getMenuDicCode()+"\",\n"+
						 				" \"menuIsDynamicForm\":\""+sysMenuExpand2.getMenuIsDynamicForm()+"\",\n"+
						 				" \"menuFormId\":\""+sysMenuExpand2.getMenuFormId()+"\",\n"+
						 				" \"iconUrl\":\""+sysMenuExpand2.getIconUrl()+"\",\n"+
						 				" \"iconType\":\""+sysMenuExpand2.getIconType()+"\",\n"+
						 				" \"imgFileId\":\""+sysMenuExpand2.getImgFileId()+"\",\n"+
						 				" \"checkedImgFileId\":\""+sysMenuExpand2.getCheckedImgFileId()+"\",\n"+
										" \"childrens\":[";
				
				for (int j = powerMenu3.size()-1; j >=0 ; j--) {
					SysMenuExpand sysMenuExpand3 = powerMenu3.get(j);
					System.out.println(menuseq2+".");
					System.out.println(sysMenuExpand3.getMenuSeq());
					if (sysMenuExpand3.getMenuSeq().indexOf(menuseq2+".")>-1) {
						jsonString = jsonString+"{ \"menuCode\":\""+sysMenuExpand3.getMenuCode()+"\",\n"+
								 				" \"menuName\":\""+sysMenuExpand3.getMenuName()+"\",\n"+
								 				" \"menuUrl\":\""+sysMenuExpand3.getMenuUrl()+"\",\n"+
								 				" \"menuType\":\""+sysMenuExpand3.getMenuType()+"\",\n"+
								 				" \"menuDictCode\":\""+sysMenuExpand3.getMenuDicCode()+"\",\n"+
								 				" \"menuIsDynamicForm\":\""+sysMenuExpand3.getMenuIsDynamicForm()+"\",\n"+
								 				" \"menuFormId\":\""+sysMenuExpand3.getMenuFormId()+"\",\n"+
								 				" \"iconUrl\":\""+sysMenuExpand3.getIconUrl()+"\",\n"+
								 				" \"iconType\":\""+sysMenuExpand3.getIconType()+"\",\n"+
								 				" \"imgFileId\":\""+sysMenuExpand3.getImgFileId()+"\",\n"+
								 				" \"checkedImgFileId\":\""+sysMenuExpand3.getCheckedImgFileId()+"\"},\n";
						
						powerMenu3.remove(sysMenuExpand3);
					}
					if (j==0) {
						System.out.println(jsonString);
						jsonString = jsonString.substring(0,jsonString.length()-2);
					}
				}
				jsonString = jsonString+"]},\n";
				if (i==(powerMenu2.size()-1)) {
					jsonString = jsonString.substring(0,jsonString.length()-2);
				}
			}
		} else if (powerMenu3!=null&&powerMenu3.size()>0) {//只有三级
			for (int k=0; k<powerMenu3.size() ;k++) {
				SysMenuExpand sysMenuExpand3 = powerMenu3.get(k);
				String menuseq3 = sysMenuExpand3.getMenuSeq();
				jsonString = jsonString+"{ \"menuCode\":\""+sysMenuExpand3.getMenuCode()+"\",\n"+
						 				" \"menuName\":\""+sysMenuExpand3.getMenuName()+"\",\n"+
						 				" \"menuUrl\":\""+sysMenuExpand3.getMenuUrl()+"\",\n"+
						 				" \"menuType\":\""+sysMenuExpand3.getMenuType()+"\",\n"+
						 				" \"menuDictCode\":\""+sysMenuExpand3.getMenuDicCode()+"\",\n"+
						 				" \"menuIsDynamicForm\":\""+sysMenuExpand3.getMenuIsDynamicForm()+"\",\n"+
						 				" \"menuFormId\":\""+sysMenuExpand3.getMenuFormId()+"\",\n"+
						 				" \"iconUrl\":\""+sysMenuExpand3.getIconUrl()+"\",\n"+
						 				" \"iconType\":\""+sysMenuExpand3.getIconType()+"\",\n"+
						 				" \"imgFileId\":\""+sysMenuExpand3.getImgFileId()+"\",\n"+
						 				" \"checkedImgFileId\":\""+sysMenuExpand3.getCheckedImgFileId()+"\"\n";
				jsonString = jsonString+"},\n";
				if (k==(powerMenu3.size()-1)) {
					jsonString = jsonString.substring(0,jsonString.length()-2);
				}
			}
		}
		jsonString = jsonString+"]}\n";
		return jsonString;
	}
}
