package com.myehr.service.impl.sysdict;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myehr.common.util.ChangeSqlColumn;
import com.myehr.common.util.ResultMap;
import com.myehr.mapper.sysdict.SysDictEntryMapper;
import com.myehr.mapper.sysdict.SysDictExpandMapper;
import com.myehr.mapper.sysdict.SysDictTypeMapper;
import com.myehr.pojo.dict.SysDictEntry;
import com.myehr.pojo.dict.SysDictEntryExample;
import com.myehr.pojo.dict.SysDictEntryExpand;
import com.myehr.pojo.dict.SysDictType;
import com.myehr.pojo.dict.SysDictTypeExample;
import com.myehr.service.sysdict.SysDictService;

public class SysDictServiceImpl implements SysDictService{
	@Autowired
	private SysDictEntryMapper sysDictEntryMapper;
	
	@Autowired
	private SysDictTypeMapper sysDictTypeMapper;
	
	@Autowired
	private SysDictExpandMapper sMapperAdd;
	@Override
	public SysDictEntry findSysDictEntryById(int id) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(sysDictEntryMapper.selectByPrimaryKey(id));
		return sysDictEntryMapper.selectByPrimaryKey(id);
	}
	
	public List<SysDictEntry> findSysDictEntryByDictTypeCode(String dictTypeCode) throws Exception {
		// TODO Auto-generated method stub
		SysDictTypeExample example = new SysDictTypeExample();
		com.myehr.pojo.dict.SysDictTypeExample.Criteria citeria = example.createCriteria();
		citeria.andDictTypeCodeEqualTo(dictTypeCode);
		List<SysDictType> dictTypes= sysDictTypeMapper.selectByExample(example);
		
		SysDictEntryExample entryExample = new SysDictEntryExample();
		com.myehr.pojo.dict.SysDictEntryExample.Criteria entryCiteria = entryExample.createCriteria();
		entryCiteria.andDictTypeIdEqualTo(dictTypes.get(0).getDictTypeId());
		List<SysDictEntry> dictEntrys= sysDictEntryMapper.selectByExample(entryExample);
		
		return dictEntrys;
	}
	
	@Override
	public ResultMap findSysDictEntryAll(SysDictEntryExample sExample) throws Exception {
		// TODO Auto-generated method stub
		List<SysDictEntry> sList = sysDictEntryMapper.selectByExample(sExample);
		long total=10;
		ResultMap rMap=new ResultMap();
		List<Object> list_obj=new ArrayList<Object>();
		for (SysDictEntry u : sList) {
			list_obj.add(u);
		}
		rMap.setRows(list_obj);
		rMap.setTotal(total);
		return rMap;
	}
	
	@Override
	public void saveSysDictEntry() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("11111111111111111111111");
		System.out.println("11111111111111111111111");
		return;
	}
	
	@Override
	public String updateSysDictEntry(SysDictEntry dict) throws Exception {
		// TODO Auto-generated method stub
		String reCode;
		try {
			sysDictEntryMapper.updateByPrimaryKey(dict);
		} catch (Exception e) {
			// TODO: handle exception
			reCode="1";
		}
		reCode = "0";
		return reCode;
	}
	@Override
	public String deleteSysDictEntry(SysDictEntry dict) throws Exception {
		// TODO Auto-generated method stub
		String reCode;
		try {
			sysDictEntryMapper.deleteByPrimaryKey(dict.getDictEntryId());
		} catch (Exception e) {
			// TODO: handle exception
			reCode="1";
		}
		reCode = "0";
		return reCode;
	}
	@Override
	public String insertSysDictEntry(SysDictEntry DictEntry) throws Exception {
		// TODO Auto-generated method stub
		String reCode;
		try {
			sysDictEntryMapper.insert(DictEntry);
		} catch (Exception e) {
			// TODO: handle exception
			reCode="1";
		}
		reCode = "0";
		return reCode;
	}
	
	
	@Override
	public ResultMap searchDictEntryList(String condition) throws Exception {
		// TODO Auto-generated method stub
		String conditions ="%"+condition+"%";
		List<SysDictEntryExpand> list=sMapperAdd.searchByCondition(conditions);
		long total=10;
		ResultMap rMap=new ResultMap();
		List<Object> list_obj=new ArrayList<Object>();
		for (SysDictEntry u : list) {
			list_obj.add(u);
		}
		rMap.setRows(list_obj);
		rMap.setTotal(total);
		return rMap;
	}
	
	@Override
	public List<SysDictEntryExpand> searchDictEntryListByTypeId(int dictTypeId) throws Exception {
		// TODO Auto-generated method stub
		
		List<SysDictEntryExpand> list=sMapperAdd.searchByTypeId(dictTypeId);
		
		return list;
	}
	
	@Override
	public ResultMap searchByDeleteMark(String deleteMark) throws Exception {
		// TODO Auto-generated method stub
		
		List<SysDictEntryExpand> list=sMapperAdd.searchByDeleteMark(deleteMark);
		long total=10;
		ResultMap rMap=new ResultMap();
		List<Object> list_obj=new ArrayList<Object>();
		for (SysDictEntryExpand u : list) {
			list_obj.add(u);
		}
		rMap.setRows(list_obj);
		rMap.setTotal(total);
		return rMap;
	}

	@SuppressWarnings("rawtypes")
	@Override
	public ResultMap getAllEmployee(HttpServletRequest request)throws Exception {
		ChangeSqlColumn csColumn=new ChangeSqlColumn();
		Map<String, String[]> map=request.getParameterMap();  
	    Set<Entry<String, String[]>> keSet=map.entrySet(); 
	    int limit=0;
	    int pageSize=0;
	    String order = null;
	    String sort="null";
	    String deleteMark="";
	    String dictTypeId ="";
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
	            if (ok.equals("dictTypeId")) {
	            	dictTypeId=value[k];
	            	System.out.println(dictTypeId);
				}
	        }  
	    }
	    StringBuffer sb = new StringBuffer();
	    StringBuffer sb1 = new StringBuffer();
	    sb.append("SELECT a1.* FROM(select sys_dict_entry.*,sys_dict_type.dict_type_code,sys_dict_type.dict_type_name ,ROWNUM rn from sys_dict_entry join sys_dict_type on sys_dict_entry.DICT_TYPE_ID = sys_dict_type.DICT_TYPE_ID ");
	    sb1.append("select COUNT(*) from sys_dict_entry join sys_dict_type on sys_dict_entry.DICT_TYPE_ID = sys_dict_type.DICT_TYPE_ID ");
	    if(dictTypeId!=null && dictTypeId!=""){
	    	sb.append("where ROWNUM<="+(pageSize)*limit+ "and sys_dict_entry.DICT_TYPE_ID=" +dictTypeId);
	    	sb1.append("where sys_dict_entry.DICT_TYPE_ID=" +dictTypeId);
	    }
	    if(deleteMark!=null && deleteMark!=""){
	    	sb.append(" and sys_dict_entry.DELETE_MARK='" +deleteMark+"'");
	    	sb1.append(" and sys_dict_entry.DELETE_MARK='" +deleteMark+"'");
	    }
	    String sql1=sb1.toString();
	    if(sort!=null && sort!="null"){
	    	sb.append(" order by "+ csColumn.getSqlColumn(sort) +" "+ order);
	    }else {
	    	sb.append(" order by DICT_ENTRY_SORT asc");
		}
	    sb.append(" ) a1 WHERE rn > " + (pageSize-1)*limit);
	    sql=sb.toString();
        ResultMap pageresponse = new ResultMap();  
        Map<String, Object> maps=new HashMap<String, Object>();
        maps.put("sql", sql);
        maps.put("sql1", sql1);
        List<SysDictEntryExpand> list = sMapperAdd.getAllEmployee(maps); //当前页显示的数据
        Integer total = sMapperAdd.getTotalEmployee(maps);  //数据总条数
        List<Object> list_obj=new ArrayList<Object>();
		for (SysDictEntryExpand u : list) {
			list_obj.add(u);
		}
        pageresponse.setRows(list_obj);
        pageresponse.setTotal(total);
        return pageresponse;
	}
	@Override
	public SysDictEntry findSysDictEntryByCode(String dictTypeCode) throws Exception {
		// TODO Auto-generated method stub
		SysDictEntry dictEntry = sMapperAdd.getSysDictEntryByCode(dictTypeCode);
		return dictEntry;
	}

}
