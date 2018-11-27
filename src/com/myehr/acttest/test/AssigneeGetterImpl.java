package com.myehr.acttest.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.activiti.ext.AssigneeGetter;
import com.activiti.ext.model.AssigneeGetParam;
import com.activiti.ext.model.AssigneeGetResult;
import com.myehr.common.mybatis.MybatisUtil;
import com.myehr.common.mybatis.Pager;

/**
 * 办理人信息获取测试实现
 * @className com.activiti.ext.test.AssigneeGetterImpl
 * @author jason(471396639@qq.com)
 * @date 2017年8月9日 上午10:12:27
 * @history
 */
public class AssigneeGetterImpl implements AssigneeGetter{
	private static Logger logger = LoggerFactory.getLogger(AssigneeGetterImpl.class);
	public AssigneeGetResult get(AssigneeGetParam param) {
		String sql = param.getSql();
		String assignee = "";
		if (sql.toUpperCase().contains("SELECT")) {
			Pager page = new Pager();
			page.setStart(1);
			//page.setLimt(10);
			Map<String, String> maps=new HashMap<String, String>();
	        maps.put("formDefSql", sql);
	        List<Map> p = null;
	        try {
				p = MybatisUtil.queryListWithPage("runtime.queryByFormDefSql", maps,page);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();logger.error(e.getMessage(),e);
			}

	        for (int i = 0; i < p.size(); i++) {
				Map map = p.get(i);
				for (Object key : map.keySet()) {
					assignee+=map.get(key)+"";
				}		
			}
		}else {
			assignee = sql;
		}
		
		return new  AssigneeGetResult(assignee);
	}
}
