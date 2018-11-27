package com.myehr.test.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.myehr.common.mybatis.MybatisUtil;
import com.myehr.common.mybatis.Pager;

@Service("TMapperExtImpl")
public class TMapperExtImpl implements  TMapperExt{
	private static Logger logger = LoggerFactory.getLogger(TMapperExtImpl.class);

	@Override
	public  List<Map> queryByFormDefSql(String formDefSql) {
		
		// TODO Auto-generated method stub
		try {
			Pager page = new Pager();
			page.setStart(1);
			//page.setLimt(10);
			Map<String, String> maps=new HashMap<String, String>();
	        maps.put("formDefSql", formDefSql);
	        List<Map> p = MybatisUtil.queryListWithPage("runtime.queryByFormDefSql", maps,page);
	        return p;	
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			logger.error(e.getMessage(),e);
		}
		return null;
	}

}
