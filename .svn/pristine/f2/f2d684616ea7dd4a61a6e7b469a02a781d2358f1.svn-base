package com.myehr.service.impl.formmanage.form;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myehr.common.mybatis.Pagers;
import com.myehr.common.util.ResultMap;
import com.myehr.mapper.formmanage.formexpand.SysFormconfigMapperExpand;
import com.myehr.pojo.formmanage.form.SysFormconfig;
import com.myehr.service.field.FieldService;
import com.myehr.service.formmanage.form.iFormConfigureService;
import com.myehr.service.impl.field.FieldServiceImpl;
@Service("iFormConfigureServiceImpl")
public class iFormConfigureServiceImpl implements iFormConfigureService {
//	@Autowired
	@Resource(name = "FieldService") 
	FieldService fieldImpl;
	@Autowired SysFormconfigMapperExpand sExpand;
	@Override
	public ResultMap getAllForm(HttpServletRequest request) throws Exception {
		// TODO Auto-generated method stub(formDefFolderId,pagers)
		Pagers pagers= fieldImpl.translateRequest(request, "formDefFolderId");
		//mysql
		/*String sql="SELECT * FROM sys_formconfig WHERE (upper(form_def_code) LIKE '%"+pagers.getConditionString().toUpperCase()+"%'"+
				"OR upper(form_def_name) LIKE '%"+pagers.getConditionString().toUpperCase()+"%'"+
				"OR upper(form_def_layout_type) LIKE '%"+pagers.getConditionString().toUpperCase()+"%'"+
				"OR upper(FORM_DEF_IS_PROCESS) LIKE '%"+pagers.getConditionString().toUpperCase()+"%'"+
				"OR upper(form_submit_status) LIKE '%"+pagers.getConditionString().toUpperCase()+"%'"+
				"OR upper(form_submit_url) LIKE '%"+pagers.getConditionString().toUpperCase()+"%'"+
				"OR upper(form_submit_time) LIKE '%"+pagers.getConditionString().toUpperCase()+"%'"+
				"OR upper(form_def_desc) LIKE '%"+pagers.getConditionString().toUpperCase()+"%'"+
				") AND form_def_folder_id = "+String.valueOf(pagers.getExpand())+" order by  "+pagers.getSort()+" "+ pagers.getOrder() + " limit " + (pagers.getPageSize()-1)*pagers.getLimit()+","+pagers.getLimit();
		*/
		//oracle
		String sql = "SELECT a1.* FROM(SELECT a.*, ROWNUM rn FROM (select * from sys_formconfig ORDER BY FORM_DEF_ID) a WHERE (upper(form_def_code) LIKE '%"+pagers.getConditionString().toUpperCase()+"%'"+
				"OR upper(form_def_name) LIKE '%"+pagers.getConditionString().toUpperCase()+"%'"+
				"OR upper(form_def_layout_type) LIKE '%"+pagers.getConditionString().toUpperCase()+"%'"+
				"OR upper(FORM_DEF_IS_PROCESS) LIKE '%"+pagers.getConditionString().toUpperCase()+"%'"+
				"OR upper(form_submit_status) LIKE '%"+pagers.getConditionString().toUpperCase()+"%'"+
				"OR upper(form_submit_url) LIKE '%"+pagers.getConditionString().toUpperCase()+"%'"+
				"OR upper(form_submit_time) LIKE '%"+pagers.getConditionString().toUpperCase()+"%'"+
				"OR upper(form_def_desc) LIKE '%"+pagers.getConditionString().toUpperCase()+"%')"+
				" AND form_def_folder_id = "+String.valueOf(pagers.getExpand())+" and ROWNUM <= "+pagers.getPageSize()*pagers.getLimit()+" ORDER BY "+pagers.getSort().toUpperCase()+" "+pagers.getOrder()+")a1 WHERE rn >= "+((pagers.getPageSize()-1)*pagers.getLimit()+1);
		ResultMap pageresponse = new ResultMap();  
        Map<String, Object> maps=new HashMap<String, Object>();
        maps.put("sql", sql);
        List<SysFormconfig> sList=sExpand.operation4(maps);
        /*sql=	"select count(1) from ("+
        		"SELECT * FROM sys_formconfig WHERE (form_def_code LIKE '%"+pagers.getConditionString()+"%'"+
				"OR upper(form_def_name) LIKE '%"+pagers.getConditionString().toUpperCase()+"%'"+
				"OR upper(form_def_layout_type) LIKE '%"+pagers.getConditionString().toUpperCase()+"%'"+
				"OR upper(FORM_DEF_IS_PROCESS) LIKE '%"+pagers.getConditionString().toUpperCase()+"%'"+
				"OR upper(form_submit_status) LIKE '%"+pagers.getConditionString().toUpperCase()+"%'"+
				"OR upper(form_submit_url) LIKE '%"+pagers.getConditionString().toUpperCase()+"%'"+
				"OR upper(form_submit_time) LIKE '%"+pagers.getConditionString().toUpperCase()+"%'"+
				"OR upper(form_def_desc) LIKE '%"+pagers.getConditionString().toUpperCase()+"%'"+
				") AND form_def_folder_id = "+String.valueOf(pagers.getExpand())+
        		") a";*/
        sql=	"select count(1) from (select * from sys_formconfig ORDER BY FORM_DEF_ID) a WHERE (upper(form_def_code) LIKE '%"+pagers.getConditionString().toUpperCase()+"%'"+
				"OR upper(form_def_name) LIKE '%"+pagers.getConditionString().toUpperCase()+"%'"+
				"OR upper(form_def_layout_type) LIKE '%"+pagers.getConditionString().toUpperCase()+"%'"+
				"OR upper(FORM_DEF_IS_PROCESS) LIKE '%"+pagers.getConditionString().toUpperCase()+"%'"+
				"OR upper(form_submit_status) LIKE '%"+pagers.getConditionString().toUpperCase()+"%'"+
				"OR upper(form_submit_url) LIKE '%"+pagers.getConditionString().toUpperCase()+"%'"+
				"OR upper(form_submit_time) LIKE '%"+pagers.getConditionString().toUpperCase()+"%'"+
				"OR upper(form_def_desc) LIKE '%"+pagers.getConditionString().toUpperCase()+"%')"+
				" AND form_def_folder_id = "+String.valueOf(pagers.getExpand())+") a";
        maps.put("sql", sql);
        int total = sExpand.operation3(maps);
        List<Object> list_obj=new ArrayList<Object>();
        for (SysFormconfig u : sList) {
			list_obj.add(u);
		}
        pageresponse.setRows(list_obj);  
        pageresponse.setTotal(total);  
        return pageresponse;
	}

	@Override
	public String updateSysForm(SysFormconfig sForm) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteSysForm(SysFormconfig sForm) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String insertSysForm(SysFormconfig sForm) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String insertForm(SysFormconfig sForm) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultMap findStandardsFormList(HttpServletRequest request)
			throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultMap findFormByEntityCode(HttpServletRequest request)
			throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String convertSql(String sql) throws Exception {
		// TODO Auto-generated method stub
//		if(sql==null){
//			return null;
//		}
//		
//		String result = new String(sql);
//		
//		//获取所有实体字段名并替换为表字段名
//		String reg = "\\[[^c:^p:^s:^r:].*?\\]";
//		Pattern p = Pattern.compile(reg);
//        Matcher m = p.matcher(sql);
//        
//        while(m .find()){
//        	   String ret = m.group();
//        	   if(ret.indexOf(".*")>-1){  //[xx.*]的处理
//        		   String tableChinesName = ret.substring(ret.indexOf("[")+1,ret.indexOf(".*]"));
//        		   String ss = this.getEntityTablenameByChinanameStr(tableChinesName);
//        		   result = result.replace(""+ret+"",ss+".*");
//        		   continue;
//        	   }
//        	   String reg1="\\[.+\\..*?\\]";
//        	   Pattern p1 = Pattern.compile(reg1);
//        	   Matcher m1 = p1.matcher(ret);
//               if(m1.find()){  //[xx.zz]的处理
//               		String temp = m1.group();
//               		String tableChinesName = temp.substring(ret.indexOf("[")+1,ret.indexOf("."));
//               		String columnChinaname = ret.substring(ret.indexOf(".")+1,ret.indexOf("]"));
//               		DataObject[] obj =  this.queryColumnByColumnChinaname(columnChinaname, tableChinesName);
//               		if(obj.length==0){
//               			throw new Exception("通过实体中文名:\""+tableChinesName+"\"和字段中文名\""+columnChinaname+"\"无法获取对应的数据库字段名!");
//               		}
//               		String fieldTablename = obj[0].getString("FIELD_TABLENAME");
//               		String entityTableName = obj[0].getString("ENTITY_TABLENAME");
//               		result = result.replace(""+temp+"",entityTableName+"."+fieldTablename);
//               		continue;
//               }
//               String reg2="\\[.+.*?\\]";
//               Pattern p2 = Pattern.compile(reg2);
//        	   Matcher m2 = p2.matcher(ret);
//               if(m2.find()){ //[xx]的处理
//               		String temp = m2.group();
//               		String tableChinesName = temp.substring(ret.indexOf("[")+1,ret.indexOf("]"));
//               		DataObject obj =  this.getEntityTablenameByChinaname(tableChinesName);
//               		if(obj==null||obj.getString("ENTITY_TABLENAME")==null){
//            			throw new Exception("通过实体中文名:\""+tableChinesName+"\"无法获取对应数据库表名!");
//               		}
//               		String entityName = obj.getString("ENTITY_TABLENAME");
//               		result = result.replace(""+temp+"",entityName);
//               }
//        }
//        
//        //获取非实体列字段
//        //获取第一个select 到 from 之间的字符串
//		return result;
		return null;
	}

//	public DataObject[] queryColumnByColumnChinaname(String columnChinaname,String entityChinaname) {
//		// TODO 自动生成方法存根
//		 //queryColumnByChineseName
//		 String sql="SELECT T1.*, T2.ENTITY_TABLENAME FROM SYS_FIELD T1 JOIN SYS_ENTITY T2 ON T1.FIELD_ENTITY_ID = T2.ENTITY_ID"+
//					"WHERE T1.FIELD_CHINA_NAME = '"+columnChinaname+"' AND T2.ENTITY_CHINANAME = '"+entityChinaname+"' AND T1.DELETE_MARK = 'N'";
//		 EntityAndFieldCode entityAndFieldCode = getDASTemplate().queryByNamedSql(DataObject.class, "com.dcf.form.entitySql.queryColumnByChineseName", params);
//		return objs2;
//	}
}
