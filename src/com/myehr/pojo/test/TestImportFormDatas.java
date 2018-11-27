package com.myehr.pojo.test;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.gwt.i18n.client.Messages.Select;
import com.myehr.common.mybatis.MybatisUtil;
import com.myehr.common.util.SpringContextUtils;
import com.myehr.common.util.datasource.CustomerContextHolder;
import com.myehr.pojo.formmanage.cache.SysFormconfigCache;
import com.myehr.service.formmanage.form.ISysformconfigService;
import com.myehr.service.formmanage.form.IsysFormColumnService;
import com.myehr.service.impl.formmanage.form.SysformconfigService;

public class TestImportFormDatas {
	private static Logger logger = LoggerFactory.getLogger(SysFormconfigCache.class);
	public static void main(String [] args) throws Exception {
		importFormDatas("2101");
	}
	
	public static void importFormDatas(String oldFormId) throws Exception {
		ISysformconfigService service =  new SysformconfigService();
		service.importFormDatas(oldFormId);
	}
}
