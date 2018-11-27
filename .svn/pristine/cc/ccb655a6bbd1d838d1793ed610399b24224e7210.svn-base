package com.myehr.controller.task;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.cxf.binding.corba.wsdl.Array;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.myehr.common.mybatis.Pager;
import com.myehr.common.util.FormConfigResultMap;
import com.myehr.common.util.ResultMap;
import com.myehr.controller.form.parambean.CardformInitDataParams;
import com.myehr.mapper.act.checked.SysCheckedAndNodeRelationMapper;
import com.myehr.mapper.activiti.expand.ActNodePropertiesExpandMapper;
import com.myehr.pojo.act.checked.SysCheckedAndNodeRelation;
import com.myehr.pojo.act.checked.SysCheckedAndNodeRelationExample;
import com.myehr.pojo.act.checked.SysCheckedAndPointRelationExample;
import com.myehr.pojo.activiti.expand.ActNodePropertiesExpand;
import com.myehr.pojo.activiti.expand.ActNodePropertiesExpandExample;
import com.myehr.pojo.entity.SysEntity;
import com.myehr.pojo.formmanage.cache.UserObject;

@Controller
@RequestMapping("/checkedController")
public class checkedController {
	@Autowired private ActNodePropertiesExpandMapper actNodePropertiesExpandMapper;
	@Autowired private SysCheckedAndNodeRelationMapper sysCheckedAndNodeRelationMapper;
	/**
	 * 查询检查点数据通过流程Id
	 * @param request
	 * @param params
	 * @throws Throwable 
	 */
	@SuppressWarnings("unchecked")
	@RequestMapping("/getcheckedInfo")
	public @ResponseBody ResultMap  getcheckedInfo(HttpServletRequest request) throws Throwable {
		String modelId = request.getParameter("modelId");
		ActNodePropertiesExpandExample example = new ActNodePropertiesExpandExample();
		example.or().andActModelIdEqualTo(modelId);
		List<ActNodePropertiesExpand> nodeList = actNodePropertiesExpandMapper.selectByExample(example);
		List<String> nodeIds = new ArrayList<String>();
		for (ActNodePropertiesExpand nodeExpand : nodeList) {
			nodeIds.add(nodeExpand.getActNodePropertyExpandId());
		}
		SysCheckedAndNodeRelationExample example2 = new SysCheckedAndNodeRelationExample();
		example2.or().andActNodeIdIn(nodeIds);
		example2.setOrderByClause("CREATER_TIME");
		try {
			List<SysCheckedAndNodeRelation> cList =  sysCheckedAndNodeRelationMapper.selectByExample(example2);
			ResultMap map = new ResultMap();
			List<Object> list_obj=new ArrayList<Object>();
			for (SysCheckedAndNodeRelation u : cList) {
				list_obj.add(u);
			}
			map.setRows(list_obj);
			map.setTotal(cList.size());
			return map;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
}
