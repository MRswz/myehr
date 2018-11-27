package com.myehr.service.impl.sysdict;

import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myehr.common.util.ChangeSqlColumn;
import com.myehr.common.util.ResultMap;
import com.myehr.mapper.sysdict.SysDictTypeMapper;
import com.myehr.mapper.sysdict.SysDictTypeExpandMapper;
import com.myehr.pojo.dict.SysDictType;
import com.myehr.pojo.dict.SysDictTypeExample;
import com.myehr.service.sysdict.SysDictTypeService;

@Service("SysDictTypeServiceImpl")
public class SysDictTypeServiceImpl implements SysDictTypeService{
	private static Logger logger = LoggerFactory.getLogger(SysDictTypeServiceImpl.class);
	@Autowired
	private SysDictTypeMapper sysDictTypeMapper;
	@Autowired
	private SysDictTypeExpandMapper sMapperAdd;
	@Override
	public SysDictType findSysDictTypeById(int id) throws Exception {
		// TODO Auto-generated method stub
		logger.info(sysDictTypeMapper.selectByPrimaryKey(id)+"");
		return sysDictTypeMapper.selectByPrimaryKey(id);
	}
	@Override
	public ResultMap findSysDictTypeAll(SysDictTypeExample sExample) throws Exception {
		// TODO Auto-generated method stub
		List<SysDictType> sList = sysDictTypeMapper.selectByExample(sExample);
		long total=10;
		ResultMap rMap=new ResultMap();
		List<Object> list_obj=new ArrayList<Object>();
		for (SysDictType u : sList) {
			list_obj.add(u);
		}
		rMap.setRows(list_obj);
		rMap.setTotal(total);
		return rMap;
	}
	
	@Override
	public void saveSysDictType() throws Exception {
		// TODO Auto-generated method stub
		logger.info("11111111111111111111111");
		logger.info("11111111111111111111111");
		return;
	}
	
	@Override
	public String updateSysDictType(SysDictType dict) throws Exception {
		// TODO Auto-generated method stub
		String reCode;
		try {
			sysDictTypeMapper.updateByPrimaryKey(dict);
		} catch (Exception e) {
			// TODO: handle exception
			reCode="1";
		}
		reCode = "0";
		return reCode;
	}
	@Override
	public String deleteSysDictType(SysDictType dict) throws Exception {
		// TODO Auto-generated method stub
		String reCode;
		try {
			sysDictTypeMapper.deleteByPrimaryKey(dict.getDictTypeId());
		} catch (Exception e) {
			// TODO: handle exception
			reCode="1";
		}
		reCode = "0";
		return reCode;
	}
	@Override
	public String insertSysDictType(SysDictType DictEntry) throws Exception {
		// TODO Auto-generated method stub
		String reCode;
		try {
			sysDictTypeMapper.insert(DictEntry);
		} catch (Exception e) {
			// TODO: handle exception
			reCode="1";
		}
		reCode = "0";
		return reCode;
	}
	@Override
	public ResultMap searchDictTypeList(String condition) throws Exception {
		// TODO Auto-generated method stub
		String conditions ="%"+condition+"%";
		List<SysDictType> list=sMapperAdd.searchByCondition(conditions);
		long total=10;
		ResultMap rMap=new ResultMap();
		List<Object> list_obj=new ArrayList<Object>();
		for (SysDictType u : list) {
			list_obj.add(u);
		}
		rMap.setRows(list_obj);
		rMap.setTotal(total);
		return rMap;
	}
	
	@Override
	public ResultMap searchByDeleteMark(String deleteMark) throws Exception {
		// TODO Auto-generated method stub
		
		List<SysDictType> list=sMapperAdd.searchByDeleteMark(deleteMark);
		long total=10;
		ResultMap rMap=new ResultMap();
		List<Object> list_obj=new ArrayList<Object>();
		for (SysDictType u : list) {
			list_obj.add(u);
		}
		rMap.setRows(list_obj);
		rMap.setTotal(total);
		return rMap;
	}
	
	@SuppressWarnings("rawtypes")
	@Override
	public ResultMap getAllDictTypeList(HttpServletRequest request)throws Exception {
		ChangeSqlColumn csColumn=new ChangeSqlColumn();
		Map<String, String[]> map=request.getParameterMap();  
	    Set<Entry<String, String[]>> keSet=map.entrySet(); 
	    int limit=0;
	    int pageSize=0;
	    String order = null;
	    String sort="null";
	    String deleteMark="";
	    String search="";
	    String dictTypeClass="";
	    String sql="";
	    for(Iterator<Entry<String, String[]>> itr=keSet.iterator();itr.hasNext();){  
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
	            if(ok.equals("limit")){
	            	limit=Integer.valueOf(value[k]);
	            }
	            if (ok.equals("pageSize")) {
	                pageSize=Integer.valueOf(value[k]);
				}
	            if (ok.equals("order")) {
	                order=value[k];
				}
	            if (ok.equals("sort")) {
	                sort=value[k];
				}
	            if (ok.equals("deleteMark")) {
	            	deleteMark=value[k];
				}
	            if (ok.equals("search")) {
	            	try {
						search =new String(value[k].getBytes("ISO-8859-1"),"utf-8");
						search =search.toUpperCase();
					} catch (UnsupportedEncodingException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();logger.error(e.getMessage(),e);
					} 
	                
				}
	            if (ok.equals("dictTypeClass")) {
					dictTypeClass=value[k];
	            }
	        }  
	    }
	    String sql1="";
	    if (dictTypeClass!=null && dictTypeClass!="") {
			sql1=" and DICT_TYPE_CLASS ="+dictTypeClass;
		}
	    if (search!=null && search!="") {
			sql1+=" and (upper(DICT_TYPE_CODE) like '%"+search.toUpperCase()+"%'"
					+" or upper(DICT_TYPE_CODE) like '%"+search+"%'"
					+" or upper(DICT_TYPE_NAME) like '%"+search+"%'"
					+" or upper(DICT_TYPE_REMARK) like '%"+search+"%'"
					+" or upper(OPERATOR_NAME) like '%"+search+"%')";
		}
	    //String sql2="select COUNT(*) from sys_dict_type where DELETE_MARK='"+deleteMark+"'"+sql1;
	    //sql="SELECT a1.* FROM(select sys_dict_type.*,ROWNUM rn from sys_dict_type where ROWNUM<="+(pageSize)*limit+" and DELETE_MARK='"+deleteMark+"'"+sql1+" order by "+ csColumn.getSqlColumn(sort) +" "+ order + " ) a1 WHERE rn > " + (pageSize-1)*limit;
	    String sql2="select COUNT(*) from sys_dict_type";
	    sql="select * from sys_dict_type";
	    ResultMap pageresponse = new ResultMap();  
        Map<String, Object> maps=new HashMap<String, Object>();
        maps.put("sql", sql);
        maps.put("sql2", sql2);
        List<SysDictType> list = sMapperAdd.getAllEmployee(maps); //当前页显示的数据  
        Integer total = sMapperAdd.getTotalEmployee(maps);  //数据总条数  
        List<Object> list_obj=new ArrayList<Object>();
		for (SysDictType u : list) {
			if (u.getOperatorTime() != null) {
				SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				String dateString = formatter.format(u.getOperatorTime());
				Date date = formatter.parse(dateString);
				logger.info(date+"");
				u.setOperatorTime(date);
			}
			
			list_obj.add(u);
		}
        pageresponse.setRows(list_obj);  
        pageresponse.setTotal(total);  
        return pageresponse;  
	}
	
	@Override
	public SysDictType findSysDictTypeByCode(String dictTypeCode) throws Exception {
		// TODO Auto-generated method stub
		SysDictType dictEntry = sMapperAdd.getSysDictEntryByCode(dictTypeCode);
		return dictEntry;
	}

}
