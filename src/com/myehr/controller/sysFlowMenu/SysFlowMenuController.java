package com.myehr.controller.sysFlowMenu;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.myehr.common.util.GetRequestJsonUtils;
import com.myehr.mapper.sysFlowMenu.SysFlowMenuMapper;
import com.myehr.mapper.sysRoleFlowMenu.SysRoleFlowMenuMapper;
import com.myehr.pojo.sysFlowMenu.SysFlowMenu;
import com.myehr.pojo.sysFlowMenu.SysFlowMenuExample;
import com.myehr.pojo.sysRoleFlowMenu.SysRoleFlowMenu;
import com.myehr.pojo.sysRoleFlowMenu.SysRoleFlowMenuExample;
import com.myehr.pojo.sysmenutree.SysMenuTree;
import com.myehr.pojo.sysmenutree.TreeByCode;
import com.myehr.pojo.sysmenutree.TreeById;
import com.myehr.service.impl.primaryKey.PrimaryKeyServiceImpl;
import com.myehr.service.impl.sysFlowMenu.SysFlowMenuServiceImpl;
import com.myehr.service.primaryKey.PrimaryKeyService;

@Controller
@RequestMapping("/SysRoleFlowMenuList")
public class SysFlowMenuController {
	@Autowired
	private SysFlowMenuServiceImpl sysImpl;
	@Autowired
	private SysFlowMenuMapper sysMapper;
	@Autowired
	private SysRoleFlowMenuMapper rMapper;
//	@Autowired
	@Resource(name = "PrimaryKeyService")
	private PrimaryKeyService keyserviceImpl;
	
	//ztree树
	@RequestMapping("/SysFlowMenuList")
	public @ResponseBody Object findSysMenuList(HttpServletRequest request) throws Exception{
			SysFlowMenuExample example=new SysFlowMenuExample();
		List<SysFlowMenu> list = sysMapper.selectByExample(example);
		List<SysMenuTree> tree1 = new ArrayList<SysMenuTree>();
		for (int i = 0; i < list.size(); i++) {
			SysMenuTree sTree = new SysMenuTree();
			sTree.setMenuId(list.get(i).getFlowMenuId());          
			sTree.setMenuParentCode(null);    
			sTree.setMenuName(list.get(i).getFlowMenuName());          
			sTree.setOpen(null);
			sTree.setIsparent(null);
			tree1.add(sTree);
		}
		
    	JSONArray jsonArray=JSONArray.fromObject(tree1);
    	String str=jsonArray.toString();
    	String newStr = str.replaceAll("menuId","id");
    	String newStr1 = newStr.replaceAll("menuParentCode","pId");
    	String newStr2 = newStr1.replaceAll("menuName","name");
    	String newStr3 = newStr2.replaceAll("isparent","isParent");
    	JSONArray json = JSONArray.fromObject(newStr3);
    	return json;
	}
	
	//nui树
	@RequestMapping("/nuiTree")
	public @ResponseBody Object nuiTree(HttpServletRequest request) throws Exception{
		SysFlowMenuExample example=new SysFlowMenuExample();
		List<SysFlowMenu> list = sysMapper.selectByExample(example);
		List<TreeById> tree1 = new ArrayList<TreeById>();
		for (int i = 0; i < list.size(); i++) {
			TreeById sTree = new TreeById();
			sTree.setId(list.get(i).getFlowMenuId());          
			sTree.setPid(null);    
			sTree.setText(list.get(i).getFlowMenuName());          
			tree1.add(sTree);
		}
		JSONArray jsonArray=JSONArray.fromObject(tree1);
		String str=jsonArray.toString();
		JSONArray json = JSONArray.fromObject(str);
		return json;
	}
	
	
	@RequestMapping("/authorize")
	public @ResponseBody Object authorize(HttpServletRequest request) throws Exception{
		String ds = request.getParameter("data");
		/*SysUserRoleExample example = new SysUserRoleExample();
		com.myehr.pojo.sysUserRole.SysUserRoleExample.Criteria criteria = example.createCriteria();
		criteria.andUserRoleIdEqualTo(sys.getUserRoleId());
		int columns = uMapper.deleteByExample(example);*/
		
       JSONArray jArray=JSONArray.fromObject(ds);  
       List<SysRoleFlowMenu> list=JSONArray.toList(jArray,SysRoleFlowMenu.class);  
       int obj;
       for(int i=0;i<list.size();i++){
    	   SysRoleFlowMenu sys=new SysRoleFlowMenu();
    	   sys.setFlowMenuId(list.get(i).getFlowMenuId());
    	   sys.setRoleId(list.get(i).getRoleId());
    	   sys.setRoleFmId(keyserviceImpl.getPrimaryKey("sys_role_flow_menu", "ROLE_FM_ID"));
    	  /* SysRoleFlowMenuExample example= new SysRoleFlowMenuExample();
    	   com.myehr.pojo.sysRoleFlowMenu.SysRoleFlowMenuExample.Criteria criteria = example.createCriteria();
    	   	查询的时候用
    	   */
    	    obj= rMapper.insert(sys);
       }
		return null;
		
	}
	
	@RequestMapping("/returnChoice")
	public @ResponseBody Object returnChoice(HttpServletRequest request) throws Exception{
		SysRoleFlowMenu sysSelect=(SysRoleFlowMenu) JSONObject.toBean(GetRequestJsonUtils.getJsonObject(request), SysRoleFlowMenu.class);
		SysRoleFlowMenuExample example= new SysRoleFlowMenuExample();
 	   com.myehr.pojo.sysRoleFlowMenu.SysRoleFlowMenuExample.Criteria criteria = example.createCriteria();
 	   criteria.andRoleIdEqualTo(sysSelect.getRoleId());
		return rMapper.selectByExample(example);
	}
	
	
	@RequestMapping("/deleteRole")
	public @ResponseBody Object deleteRole(HttpServletRequest request) throws Exception{
		SysRoleFlowMenu sysSelect=(SysRoleFlowMenu) JSONObject.toBean(GetRequestJsonUtils.getJsonObject(request), SysRoleFlowMenu.class);
		SysRoleFlowMenuExample example= new SysRoleFlowMenuExample();
		com.myehr.pojo.sysRoleFlowMenu.SysRoleFlowMenuExample.Criteria criteria = example.createCriteria();
		criteria.andRoleIdEqualTo(sysSelect.getRoleId());
		return rMapper.deleteByExample(example);
	}
	
	
	
	
	
}
