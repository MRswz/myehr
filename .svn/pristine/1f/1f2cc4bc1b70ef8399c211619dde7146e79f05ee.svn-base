package com.myehr.service.formmanage.form;

import java.util.List;
import java.util.Map;

import com.myehr.pojo.formmanage.form.SysFormconfigMstTab;
import com.myehr.pojo.formmanage.form.SysFormconfigMstTabDetail;



/**
 * 主从表单处理类，tab页类型
 * @author Administrator
 */
public interface IMstTabFormService {
	/**
	 * 保存主从表卡片式列表数据
	 * @param mstTab
	 * @return
	 * @throws Exception 
	 */
	public void saveFormMstTab(Map mstTab) throws Exception;
	
	
	/**
	 * 保存从表信息
	 * @param detail
	 * @throws Exception 
	 */
	public String saveFormTabDetal(Map detail,String formDefId) throws Exception;
	
	/**
	 * 查询从表数据列表
	 * @param formDefId
	 * @return
	 */
//	public List<Map> queryFormTabList(String formDefId,String tabDetailId,PageCond  page);
	
	/**
	 * 查询从表数据列表(不分页)
	 * @param formDefId
	 * @return
	 */
	public List<SysFormconfigMstTabDetail> queryFormTabDetailListNoPage(String mstTabId);
	
	
	/**
	 * 删除字表明细
	 * @param details
	 */
	public  void removeFormTabList(List<Map> details);
	
	/**
	 * 通过主从表ID获取主表ID
	 * @param details
	 */
	public  String queryMainFormByMstTabFormId(String mstTabFormId);
	
	/**
	 * 通过主从表ID获取主表对象信息
	 * @param details
	 */
	public  SysFormconfigMstTab queryMainTabByFormId(String formId);
}
