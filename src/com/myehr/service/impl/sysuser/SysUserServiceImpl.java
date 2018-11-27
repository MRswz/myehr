package com.myehr.service.impl.sysuser;

import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.myehr.common.util.ResultMap;
import com.myehr.mapper.sysUserExpand.SysUserMapperExpand;
import com.myehr.mapper.sysuser.SysFieldLogMapper;
import com.myehr.mapper.sysuser.SysUserMapper;
import com.myehr.pojo.sysuser.SysFieldLog;
import com.myehr.pojo.sysuser.SysUser;
import com.myehr.pojo.sysuser.SysUserSelect;
import com.myehr.service.impl.field.FieldServiceImpl;
import com.myehr.service.sysuser.SysUserService;



@Service("SysUserServiceImpl")
public class SysUserServiceImpl implements SysUserService {
	private static Logger logger = LoggerFactory.getLogger(SysUserServiceImpl.class);
	@Autowired
	private SysUserMapper sysUserMapper;
	
	@Autowired
	private SysUserMapperExpand expandMapper;
	
//	@Autowired
	@Resource(name = "FieldService")
	FieldServiceImpl fServiceImpl;

	@Override
	public SysUser findSysUserById(int id) throws Exception {
		// TODO Auto-generated method stub
		return sysUserMapper.selectByPrimaryKey(Integer.valueOf(id));
	}
	
	
	
	//  查询   全部
	@Override
	public ResultMap findSysUserAll(HttpServletRequest request) throws Exception {
		//Pagers pagers=fServiceImpl.translateRequest(request, "");
		 String sql="SELECT U.*,E.EMP_CODE,E.EMP_CHINA_NAME,E.EMP_PHOTO," +
		 		"OO.ORG_ID,OO.ORG_COMP_ID,OO.ORG_CODE,OO.ORG_ABBREVIATION ORG_NAME," +
		 		"OO2.ORG_ABBREVIATION ORG_COMP_NAME,OO2.ORG_CODE ORG_COMP_CODE  FROM SYS_USER U  " +
		 		" LEFT JOIN EMP_EMPLOYEE E ON U.EMP_ID = E.EMP_ID " +
		 		" LEFT JOIN ORG_ORGANIZATION OO ON OO.ORG_ID = E.EMP_DEPT_ID  " +
		 		" LEFT JOIN ORG_ORGANIZATION OO2 ON OO2.ORG_ID = OO.ORG_COMP_ID";
		
        ResultMap pageresponse = new ResultMap();  
        Map<String, Object> maps=new HashMap<String, Object>();
        maps.put("sql", sql);
        List<SysUserSelect> list = expandMapper.getAllSysUser(maps); //当前页显示的数据  
        
        Integer total = 10;  //数据总条数  
        List<Object> list_obj=new ArrayList<Object>();
		for (SysUser u : list) {
			list_obj.add(u);
		}
        pageresponse.setRows(list_obj);  
        pageresponse.setTotal(total);  
        return pageresponse;  
	}
	
	//根据删除标识   和   条件查询
	@Override
	public ResultMap findSysUser(SysUserSelect sys) throws Exception {
		// TODO Auto-generated method stub
	    String deleteMark=sys.getDeleteMark();
	    String search=sys.getUserName();
	    Integer roleId=sys.getRoleId();
	    
	    String sql1="";
	    
	    if (search==null || search.equals("")) {
			sql1="";
		}else{
			sql1+=" AND ( A.USER_CODE like '%"+search+"%'"
					+" OR A.USER_NAME like '%"+search+"%')";
		}
		if(roleId!=null){
			sql1+="	AND A.USER_ID NOT IN ( SELECT USER_ID FROM SYS_USER_ROLE WHERE ROLE_ID = '"+roleId+"')";
		}
		 String sql="SELECT A.* FROM (SELECT U.*,E.EMP_CODE,E.EMP_CHINA_NAME,E.EMP_PHOTO," +
		 		"OO.ORG_ID,OO.ORG_COMP_ID,OO.ORG_CODE,OO.ORG_ABBREVIATION ORG_NAME," +
		 		"OO2.ORG_ABBREVIATION ORG_COMP_NAME,OO2.ORG_CODE ORG_COMP_CODE  FROM SYS_USER U  " +
		 		" LEFT JOIN EMP_EMPLOYEE E ON U.EMP_ID = E.EMP_ID " +
		 		" LEFT JOIN ORG_ORGANIZATION OO ON OO.ORG_ID = E.EMP_DEPT_ID  " +
		 		" LEFT JOIN ORG_ORGANIZATION OO2 ON OO2.ORG_ID = OO.ORG_COMP_ID ) A  where A. DELETE_MARK='"+deleteMark+"'"+sql1;
		
        ResultMap pageresponse = new ResultMap();  
        Map<String, Object> maps=new HashMap<String, Object>();
        maps.put("sql", sql);
        List<SysUserSelect> list = expandMapper.getAllSysUser(maps); //当前页显示的数据  
        
        Integer total = list.size();  //数据总条数  
        List<Object> list_obj=new ArrayList<Object>();
		for (SysUserSelect u : list) {
			list_obj.add(u);
		}
        pageresponse.setRows(list_obj);  
        pageresponse.setTotal(total);  
        return pageresponse;  
	}
	
	
	
	/*模糊，条件查询*/
	@Override
	public ResultMap searchUserList(HttpServletRequest request) throws Exception {
		// TODO   请求封装一个pager对象，设置参数
		Map<String, String[]> map=request.getParameterMap();  
	    Set<java.util.Map.Entry<String, String[]>> keSet=map.entrySet(); 
	    String deleteMark="";
	    String userCode="";
	    String userName="";
	    for(Iterator<java.util.Map.Entry<String, String[]>> itr=keSet.iterator();itr.hasNext();){  
	        Map.Entry me=(Map.Entry)itr.next();  
	        Object ok=me.getKey();  
	        Object ov=me.getValue();  
	        String[] value=new String[1];  
	        if(ov instanceof String[]){  
	            value=(String[])ov;  
	        }else{  
	            value[0]=ov.toString();  
	        }  
	  
	        for(int k=0;k<value.length;k++){  
	            if (ok.equals("deleteMark")) {
	            	deleteMark=value[k];
				}
	            if (ok.equals("userCode")) {
	            	userCode=value[k];
	            }
	            if (ok.equals("userName")) {
	            	try {
						String chars =new String(value[k].getBytes("ISO-8859-1"),"utf-8");
						userName=chars;
					} catch (UnsupportedEncodingException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();logger.error(e.getMessage(),e);
					} 
	            }
	        }  
	    }
	    String sql1="";
	    
	    if (userName!=null && userName!="") {
			sql1+="  and A.USER_NAME like '%"+userName+"%'  ";
		}
	    if (userCode!=null && userCode!="") {
	    	sql1+=" and A.USER_CODE like '%"+userCode+"%'  ";
	    }
		 String sql="SELECT A.* FROM (SELECT U.*,E.EMP_CODE,E.EMP_CHINA_NAME,E.EMP_PHOTO," +
		 		"OO.ORG_ID,OO.ORG_COMP_ID,OO.ORG_CODE,OO.ORG_ABBREVIATION ORG_NAME," +
		 		"OO2.ORG_ABBREVIATION ORG_COMP_NAME,OO2.ORG_CODE ORG_COMP_CODE  FROM SYS_USER U  " +
		 		" LEFT JOIN EMP_EMPLOYEE E ON U.EMP_ID = E.EMP_ID " +
		 		" LEFT JOIN ORG_ORGANIZATION OO ON OO.ORG_ID = E.EMP_DEPT_ID  " +
		 		" LEFT JOIN ORG_ORGANIZATION OO2 ON OO2.ORG_ID = OO.ORG_COMP_ID ) A  where A. DELETE_MARK='"+deleteMark+"'"+sql1;
        ResultMap pageresponse = new ResultMap();  
        Map<String, Object> maps=new HashMap<String, Object>();
        maps.put("sql", sql);
        List<SysUserSelect> list = expandMapper.getAllSysUser(maps); //当前页显示的数据  
        Integer total = 10;  //数据总条数  
        List<Object> list_obj=new ArrayList<Object>();
		for (SysUserSelect u : list) {
			list_obj.add(u);
		}
        pageresponse.setRows(list_obj);  
        pageresponse.setTotal(total);  
        return pageresponse;  
	}
	
	
	@Override
	public String updateSysUser(SysUser user) throws Exception {
		// TODO Auto-generated method stub
		String reCode;
		try {
			sysUserMapper.updateByPrimaryKey(user);
		} catch (Exception e) {
			// TODO: handle exception
			reCode="1";
		}
		reCode = "0";
		return reCode;
	}

	@Override
	public String deleteSysUser(SysUser user) throws Exception {
		// TODO Auto-generated method stub  判断删除标识  执行逻辑删除和物理删除
		String reCode;
		String deleteMark=user.getDeleteMark();   
		if(deleteMark.equals("N")||deleteMark.equals("n")){
			try {
				user.setDeleteMark("Y");
				sysUserMapper.updateByPrimaryKey(user);
			} catch (Exception e) {
				reCode="1";
			}
			reCode = "0";
			return reCode;
		}else{
			try {
				sysUserMapper.deleteByPrimaryKey(user.getUserId());
			} catch (Exception e) {
				reCode="1";
			}
			reCode = "0";
			return reCode;
		}
		
	}

	@Override
	public String insertSysUser(SysUser user) throws Exception {
		// TODO Auto-generated method stub
		String reCode;
		try {
			sysUserMapper.insert(user);
		} catch (Exception e) {
			// TODO: handle exception
			reCode="1";
		}
		reCode = "0";
		return reCode;
	}

}
