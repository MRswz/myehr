package com.myehr.controller.form;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import net.sf.json.JSONArray;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.myehr.common.util.ResultMap;
import com.myehr.mapper.entity.SysEntityMapper;
import com.myehr.mapper.fieldexpand.FieldMapperExpand;
import com.myehr.pojo.TreeModel;
import com.myehr.pojo.entity.SysEntity;
import com.myehr.pojo.entity.SysEntityExample;
import com.myehr.pojo.field.SysField;
import com.myehr.service.formmanage.form.iFormConfigureService;
import com.myehr.service.impl.formmanage.form.iFormConfigureServiceImpl;

@Controller
@RequestMapping("/FormList")
public class formconfigController {
	private static Logger logger = LoggerFactory.getLogger(formconfigController.class);
//	@Autowired
	@Resource(name = "iFormConfigureService")
	iFormConfigureService fImpl;
	@Autowired SysEntityMapper sMapper;
	@Autowired FieldMapperExpand fExpand;
	//查询所有数据
		@RequestMapping("/findFormList")
		 public @ResponseBody ResultMap findFormList(HttpServletRequest request) throws Exception {
		        try {  
		            return fImpl.getAllForm(request);  
		        } catch (Exception e) {  
		            e.printStackTrace();logger.error(e.getMessage(),e);  
		        }  
		        return null; 
		}
		
		@RequestMapping("/entityTree")
		public @ResponseBody Object selectTree(HttpServletRequest request) throws Exception{
			List<TreeModel> tList =new ArrayList<TreeModel>();
			TreeModel test1 = new TreeModel();
			test1.setId("Entity_Tree");
			test1.setIsParent(true);
			test1.setName("实体树");
			test1.setOpen(false);
			test1.setPid("");
			tList.add(test1);
			//全加载
			SysEntityExample sExample =new SysEntityExample(); 
			List<SysEntity> list= sMapper.selectByExample(sExample);
			for (SysEntity sysEntity : list) {
				TreeModel test2 = new TreeModel();
				test2.setId(sysEntity.getEntityCode());
				test2.setIsParent(true);
				test2.setName(sysEntity.getEntityChinaname());
				test2.setOpen(false);
				test2.setPid("Entity_Tree");
				tList.add(test2);
				Map<String, Object> map= new HashMap<String, Object>();
				String sql="select * from sys_field where FIELD_ENTITY_ID = "+ sysEntity.getEntityId();
				map.put("sql", sql);
				List<SysField> sList = fExpand.getFieldsByEntitycode(map);
				for (SysField sysField : sList) {
					TreeModel test3 = new TreeModel();
					test3.setId(sysField.getFieldCode());
					test3.setIsParent(false);
					test3.setName(sysEntity.getEntityChinaname()+"."+sysField.getFieldChinaName());
					test3.setOpen(true);
					test3.setPid(sysEntity.getEntityCode());
					tList.add(test3);
				}
			}
			JSONArray jsonArray=JSONArray.fromObject(tList);
	    	String str=jsonArray.toString();
	    	String newStr = str.replaceAll("pid","pId");
	    	JSONArray json = JSONArray.fromObject(newStr);
			return json;
		}
		
		//转换sql为可执行sql
		@RequestMapping("/convertSql")
		 public @ResponseBody Object convertSql(String sql) throws Exception {
		        try {  
		            return fImpl.convertSql(sql);  
		        } catch (Exception e) {  
		            e.printStackTrace();logger.error(e.getMessage(),e);  
		        }  
		        return null; 
		}
		
		@RequestMapping(value = "/testtest", method = RequestMethod.POST)
		 public String testtest(HttpServletRequest request, ModelMap model) throws Exception {			
			return "redirect:/SysUser.jsp";
		}
				
}
