package com.myehr.service.formmanage.runtime;


import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.myehr.common.exception.DcfException;

/**
 * 树方案
 * @author Administrator
 *
 */
public interface IRuntimeTreeFormService {
	/**
	 * 查询结果
	 * @param formId
	 * @param params
	 * @return
	 */
	public List<Map> querySqlResult(String formId,String paramsJson,HttpServletRequest request) throws DcfException, Exception;
}
