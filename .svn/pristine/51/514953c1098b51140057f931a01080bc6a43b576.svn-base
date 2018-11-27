package com.myehr.service.impl.sysRoleImpl;

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
import com.myehr.mapper.sysRole.SysRoleMapper;
import com.myehr.mapper.sysRoleExpand.SysRoleExpandMapper;
import com.myehr.pojo.sysRole.SysRole;
import com.myehr.service.impl.field.FieldServiceImpl;
import com.myehr.service.sysRole.SysRoleService;

@Service("SysRoleServiceImpl")
public class SysRoleServiceImpl implements SysRoleService {
	private static Logger logger = LoggerFactory.getLogger(SysRoleServiceImpl.class);

	@Autowired
	private SysRoleMapper sysMapper;
	@Autowired
	private SysRoleExpandMapper expandMapper;
//	@Autowired
	@Resource(name = "FieldService")
	FieldServiceImpl fServiceImpl;


	@Override
	public SysRole findSysRoleById(int id) throws Exception {
		// TODO Auto-generated method stub
		return sysMapper.selectByPrimaryKey(new BigDecimal(id));
	}
	
	
	
	@Override
	public ResultMap searchSysRoleList(HttpServletRequest request)throws Exception {
		
		Map<String, String[]> map=request.getParameterMap();  
	    Set<java.util.Map.Entry<String, String[]>> keSet=map.entrySet(); 
	    String deleteMark="";
	    String roleStatus="";
	    String roleName="";
	    String roleCode="";
	    String parentCode="";
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
	            if (ok.equals("roleStatus")) {
	            	roleStatus=value[k];
	            }
	            if (ok.equals("roleName")) {
	            	
	            	try {
						String chars =new String(value[k].getBytes("ISO-8859-1"),"utf-8");
						roleName=chars;
					} catch (UnsupportedEncodingException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();logger.error(e.getMessage(),e);
					} 
	            	
	            }
	            if (ok.equals("roleCode")) {
	            	roleCode=value[k];
	            }
	            if (ok.equals("parentCode")) {
	            	parentCode=value[k];
	            }
	            
	        }  
	    }
	    
	    String sql="";
	    if (roleName!=null && roleName!="") {
			sql+="  ROLE_NAME like '%"+roleName+"%'  and ";
		}
	    if (roleCode!=null && roleCode!="") {
	    	sql+="  ROLE_CODE like '%"+roleCode+"%' and ";
	    }
	    
		String sql2="SELECT * FROM SYS_ROLE where ";
		if(deleteMark!=null && deleteMark!=""){
			sql2+="  DELETE_MARK= '"+deleteMark+"' and " ;
		}
		if(roleStatus!=null && roleStatus!=""){
			sql2+=" ROLE_STATUS =   '"+ roleStatus+"' and ";
		}
		if(parentCode!=null && parentCode!="" && parentCode!="null"){
			sql2+=" ROLE_PARENT_CODE =   '"+ parentCode+"' and ";
		}
		 String sql1=sql2+ sql +" 1=1";
		
        ResultMap pageresponse = new ResultMap();  
        Map<String, Object> maps=new HashMap<String, Object>();
        maps.put("sql", sql1);
        List<SysRole> list = expandMapper.getAllSysRole(maps); //当前页显示的数据  
        
        Integer total = list.size();  //数据总条数  
        List<Object> list_obj=new ArrayList<Object>();
		for (SysRole u : list) {
			list_obj.add(u);
		}
        pageresponse.setRows(list_obj);  
        pageresponse.setTotal(total);  
        return pageresponse; 
	}

	
	
	@Override
	public String updateSysRole(SysRole sysRole) throws Exception {
		// TODO Auto-generated method stub
		String reCode;
		try {
			sysMapper.updateByPrimaryKey(sysRole);
		} catch (Exception e) {
			// TODO: handle exception
			reCode="1";
		}
		reCode = "0";
		return reCode;
	}

	@Override
	public String deleteSysRole(SysRole sysRole) throws Exception {
		// TODO Auto-generated method stub
		String reCode;
		String deleteMark=sysRole.getDeleteMark();
		if(deleteMark==null|| deleteMark.equals("")){
			deleteMark="N";
		}
		if(deleteMark.equals("N")||deleteMark.equals("n")){
			try {
				sysRole.setDeleteMark("Y");
				sysMapper.updateByPrimaryKey(sysRole);
			} catch (Exception e) {
				reCode="1";
			}
			reCode = "0";
			return reCode;
		}else{
			try {
				sysMapper.deleteByPrimaryKey(sysRole.getRoleId());
			} catch (Exception e) {
				reCode="1";
			}
			reCode = "0";
			return reCode;
		}
	}

	@Override
	public String insertSysRole(SysRole sysRole) throws Exception {
		// TODO Auto-generated method stub
		String reCode;
		try {
			sysMapper.insert(sysRole);
		} catch (Exception e) {
			// TODO: handle exception
			reCode="1";
		}
		reCode = "0";
		return reCode;
	}
	@Override
	public String recoverSysRole(SysRole sysRole) throws Exception {
		// TODO Auto-generated method stub
		String reCode;
		try {
			sysRole.setDeleteMark("N");
			sysMapper.updateByPrimaryKey(sysRole);
		} catch (Exception e) {
			// TODO: handle exception
			reCode="1";
		}
		reCode = "0";
		return reCode;
	}

}
