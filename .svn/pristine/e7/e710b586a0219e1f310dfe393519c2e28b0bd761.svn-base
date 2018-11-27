package com.myehr.service.impl.sysUserRole;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myehr.common.util.ChangeSqlColumn;
import com.myehr.common.util.ResultMap;
import com.myehr.mapper.sysRole.SysRoleMapper;
import com.myehr.mapper.sysUserRole.SysUserRoleMapper;
import com.myehr.mapper.sysUserRoleExpand.SysUserRoleExpandMapper;
import com.myehr.pojo.entity.SysEntityExample.Criteria;
import com.myehr.pojo.formmanage.form.SysFormColumn;
import com.myehr.pojo.formmanage.form.SysFormColumnExample;
import com.myehr.pojo.sysRole.SysRole;
import com.myehr.pojo.sysRole.SysRoleExample;
import com.myehr.pojo.sysUserRole.SysUserRole;
import com.myehr.pojo.sysUserRole.SysUserRoleExample;
import com.myehr.pojo.sysUserRole.SysUserRoleSelect;
import com.myehr.pojo.sysmenu.SysMenu;
import com.myehr.pojo.sysuser.SysUser;
import com.myehr.service.sysUserRole.sysUserRoleService;
@Service("SysUserRoleServiceImpl")
public class SysUserRoleServiceImpl implements sysUserRoleService {
	@Autowired
	private SysRoleMapper rMapper;
	@Autowired
	private SysUserRoleMapper uMapper;
	@Autowired
	private SysUserRoleExpandMapper eMapper;

	@Override
	public SysRole selectRoleId(String roleCode)
			throws Exception {
		
		SysRoleExample example = new SysRoleExample();
		com.myehr.pojo.sysRole.SysRoleExample.Criteria criteria = example.createCriteria();
		criteria.andRoleCodeEqualTo(roleCode);
		List<SysRole> list = rMapper.selectByExample(example);
		if(list.size()>0){
			return list.get(0);
		}
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	//查询同角色id的用户     取用户id   
	
	@Override
	public ResultMap selectUserId(SysUserRole sys) throws Exception {
		 Map<String, Object> map=new HashMap<String, Object>();
		map.put("roleId", sys.getRoleId());
		List<SysUserRole> list= eMapper.selectUserId(map);
		 ResultMap pageresponse = new ResultMap(); 
		 Integer total = 10;  //数据总条数  
	        List<Object> list_obj=new ArrayList<Object>();
			for (SysUserRole u : list) {
				list_obj.add(u);
			}
	        pageresponse.setRows(list_obj);  
	        pageresponse.setTotal(total);  
	        return pageresponse;  
	}
	
	//根据删除标识   和   条件查询
		@Override
		public ResultMap selectSysUser(SysUserRoleSelect sys) throws Exception {
		    String name=sys.getUserName();
		    String code=sys.getUserCode();
		    Integer roleId=sys.getRoleId();
		    
		    String sql1="";
		    if (name!=null && name.length() != 0) {
				sql1+=" and A.USER_CODE like '%"+code+"%'";
			}
		    if(code!=null && code.length() != 0){
		    	sql1+=" and A.USER_NAME like '%"+name+"%'";
		    }			
		    if( roleId!=null ){
		    	sql1+=" and A.ROLE_ID=  '" + roleId +"'";
		    }
			
			String sql= "SELECT A.*FROM ( SELECT DISTINCT U.USER_ID, U.USER_CODE, U.USER_NAME,  U.USER_STATUS, R.ROLE_ID,  R.ROLE_CODE, " +
					" R.ROLE_NAME, UR.USER_ROLE_ID, UR.OPERATOR_NAME,  UR.OPERATOR_TIME, E.EMP_CODE, E.EMP_CHINA_NAME, O.ORG_ABBREVIATION," +
					" O.ORG_CODE,  E.EMP_ORDER, (SELECT ORG_ABBREVIATION FROM ORG_ORGANIZATION  WHERE ORG_ID = E.EMP_COMP_ID) COMP_NAME" +
					" FROM SYS_USER_ROLE UR left join SYS_USER U on UR.USER_ID = U.USER_ID left join EMP_EMPLOYEE E ON U.EMP_ID = E.EMP_ID " +
					" left join SYS_ROLE R  on UR.ROLE_ID = R.ROLE_ID left join ORG_ORGANIZATION O on E.EMP_DEPT_ID = O.ORG_ID where  " +
					" U.Delete_Mark = 'N' order by O.ORG_CODE, E.EMP_ORDER ) A  WHERE 1=1 "+sql1;	 
			 System.out.println(sql);
	        ResultMap pageresponse = new ResultMap();  
	        Map<String, Object> maps=new HashMap<String, Object>();
	        maps.put("sql", sql);
	        List<SysUserRole> list = eMapper.selectSysUser(maps); //当前页显示的数据  
	        
	        Integer total = 20;  //数据总条数  
	        List<Object> list_obj=new ArrayList<Object>();
			for (SysUserRole u : list) {
				list_obj.add(u);
			}
			
	        pageresponse.setRows(list_obj);  
	        pageresponse.setTotal(total);  
	        return pageresponse;  
		}




		@Override
		public String insertSysUserRole(SysUserRole sys) throws Exception {
			String reCode;
			try {
				uMapper.insert(sys);
			} catch (Exception e) {
				// TODO: handle exception
				reCode="1";
			}
			reCode = "0";
			return reCode;
		}
		
		//通过example查村
		@Override
		public int deleteUserRole(SysUserRole sys) throws Exception {
			
			SysUserRoleExample example = new SysUserRoleExample();
			com.myehr.pojo.sysUserRole.SysUserRoleExample.Criteria criteria = example.createCriteria();
			criteria.andUserRoleIdEqualTo(sys.getUserRoleId());
			int columns = uMapper.deleteByExample(example);
			return columns;
		}
	
	
	
	


}
