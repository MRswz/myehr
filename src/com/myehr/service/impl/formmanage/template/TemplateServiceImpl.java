package com.myehr.service.impl.formmanage.template;

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
import com.myehr.mapper.formmanage.templateexpand.SysTemplateExpandMapper;
import com.myehr.pojo.formmanage.template.SysTemplate;
import com.myehr.service.formmanage.template.ITemplateService;
import com.myehr.service.impl.field.FieldServiceImpl;
@Service("TemplateServiceImpl")
public class TemplateServiceImpl implements ITemplateService {
//	@Autowired
	@Resource(name = "FieldService")
	private FieldServiceImpl fServiceImpl;
	@Autowired
	private SysTemplateExpandMapper sTemplateExpandMapper;
	
	@Override
	public ResultMap getAllTemplateOracle(HttpServletRequest request)
			throws Exception {
		// TODO Auto-generated method stub
				String sql;
				Pagers pagers= fServiceImpl.translateRequest(request,"formDefFolderId");
				//oracle
				if (pagers.getExpand().equals("0")) {
					sql="SELECT a1.* FROM(SELECT a.*, ROWNUM rn FROM (select * from sys_template ORDER BY template_id) a WHERE (upper(TEMPLATE_CODE) LIKE '%"+pagers.getConditionString().toUpperCase()+"%'"+
							"OR upper(TEMPLATE_NAME) LIKE '%"+pagers.getConditionString().toUpperCase()+"%')"+
							" and ROWNUM <= "+pagers.getPageSize()*pagers.getLimit()+" ORDER BY "+pagers.getSort().toUpperCase()+" "+pagers.getOrder()+")a1 WHERE rn >= "+((pagers.getPageSize()-1)*pagers.getLimit()+1);
				} else {
					sql="	SELECT a1.* FROM(SELECT a.*, ROWNUM rn FROM (select * from sys_template ORDER BY template_id) a WHERE (upper(TEMPLATE_CODE) LIKE '%"+pagers.getConditionString().toUpperCase()+"%'"+
							"OR upper(TEMPLATE_NAME) LIKE '%"+pagers.getConditionString().toUpperCase()+"%')"+
							"AND template_folder_id = "+String.valueOf(pagers.getExpand())+" and ROWNUM <= "+pagers.getPageSize()*pagers.getLimit()+" ORDER BY "+pagers.getSort().toUpperCase()+" "+pagers.getOrder()+")a1 WHERE rn >= "+((pagers.getPageSize()-1)*pagers.getLimit()+1);			
				}
				ResultMap pageresponse = new ResultMap();  
		        Map<String, Object> maps=new HashMap<String, Object>();
		        maps.put("sql", sql);
		        List<SysTemplate> list = sTemplateExpandMapper.operation1(maps); //当前页显示的数据  
		        if (pagers.getExpand().equals("0")) {
		        	sql="SELECT COUNT(*) from (select * FROM sys_template WHERE ((TEMPLATE_CODE) LIKE '%"+pagers.getConditionString().toUpperCase()+"%'"+
							"OR upper(TEMPLATE_NAME) LIKE '%"+pagers.getConditionString().toUpperCase()+"%')"+
							") a";
				} else {
			        sql="SELECT COUNT(*) from (select * FROM sys_template WHERE ((TEMPLATE_CODE) LIKE '%"+pagers.getConditionString().toUpperCase()+"%'"+
							"OR upper(TEMPLATE_NAME) LIKE '%"+pagers.getConditionString().toUpperCase()+"%')"+
							"AND template_folder_id = "+String.valueOf(pagers.getExpand())+") a";
				}
		        maps.put("sql", sql);
		        Integer total = sTemplateExpandMapper.operation2(maps);  //数据总条数  
		        List<Object> list_obj=new ArrayList<Object>();
				for (SysTemplate u : list) {
					list_obj.add(u);
				}
		        pageresponse.setRows(list_obj);  
		        pageresponse.setTotal(total);  
		        return pageresponse;
	}

	@Override
	public ResultMap getAllTemplateMsSql(HttpServletRequest request)
			throws Exception {
		// TODO Auto-generated method stub
				String sql;
				Pagers pagers= fServiceImpl.translateRequest(request,"formDefFolderId");
				//oracle
				if (pagers.getExpand().equals("0")) {
					sql="select * from sys_template WHERE (upper(TEMPLATE_CODE) LIKE '%"+pagers.getConditionString().toUpperCase()+"%'"+
							"OR upper(TEMPLATE_NAME) LIKE '%"+pagers.getConditionString().toUpperCase()+"%')"+pagers.getSort().toUpperCase()+" "+pagers.getOrder();
				} else {
					sql="select * from sys_template WHERE (upper(TEMPLATE_CODE) LIKE '%"+pagers.getConditionString().toUpperCase()+"%'"+
							"OR upper(TEMPLATE_NAME) LIKE '%"+pagers.getConditionString().toUpperCase()+"%')"+
							"AND template_folder_id = "+String.valueOf(pagers.getExpand())+pagers.getSort()+" "+pagers.getOrder();			
				}
				ResultMap pageresponse = new ResultMap();  
		        Map<String, Object> maps=new HashMap<String, Object>();
		        maps.put("sql", sql);
		        List<SysTemplate> list = sTemplateExpandMapper.operation1(maps); //当前页显示的数据  
		        if (pagers.getExpand().equals("0")) {
		        	sql="SELECT COUNT(*) from (select * from sys_template WHERE (upper(TEMPLATE_CODE) LIKE '%"+pagers.getConditionString().toUpperCase()+"%'"+
							"OR upper(TEMPLATE_NAME) LIKE '%"+pagers.getConditionString().toUpperCase()+"%')"+
							") a";
				} else {
			        sql="SELECT COUNT(*) from (select * from sys_template WHERE (upper(TEMPLATE_CODE) LIKE '%"+pagers.getConditionString().toUpperCase()+"%'"+
							"OR upper(TEMPLATE_NAME) LIKE '%"+pagers.getConditionString().toUpperCase()+"%')"+
							"AND template_folder_id = "+String.valueOf(pagers.getExpand())+") a";
				}
		        maps.put("sql", sql);
		        Integer total = sTemplateExpandMapper.operation2(maps);  //数据总条数  
		        List<Object> list_obj=new ArrayList<Object>();
				for (SysTemplate u : list) {
					list_obj.add(u);
				}
		        pageresponse.setRows(list_obj);  
		        pageresponse.setTotal(total);  
		        return pageresponse;
	}
	
}
