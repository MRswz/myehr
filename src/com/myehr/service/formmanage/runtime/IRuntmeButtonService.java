package com.myehr.service.formmanage.runtime;

import java.sql.SQLException;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.transaction.annotation.Transactional;

import com.myehr.common.exception.DcfException;
import com.myehr.common.mybatis.DcfReponse;
import com.myehr.pojo.formmanage.cache.SysFormconfigCache;

//import com.dcf.form.button.ImportField;
//import com.dcf.util.bean.DcfReponse;
//import com.dcf.util.exception.DcfException;
@Transactional
public interface IRuntmeButtonService {
	
	/**
	 * 卡片式保存按钮保存逻辑
	 * @param obj
	 * @return
	 * @throws Exception 
	 */
	@Transactional
	public String[] cardFormSaveButtonSave(Map obj,SysFormconfigCache form,Map<String,Object> paramsMap,String buttonId,HttpServletRequest request,String buttonType,String sourceType) throws RuntimeException, Exception;
	
	@Transactional
	public String[] cardFormSaveButtonSave(Map obj,String formId,Map<String,Object> paramsMap,String buttonId,HttpServletRequest request,String buttonType,String sourceType) throws RuntimeException, Exception;
	
	
	/**
	 * @param 列表式保存按钮保存逻辑
	 * @return
	 */
	public String[] gridFormSaveButtonSave(Map<String,String>[] datas, String formId,Map<String,Object> paramsMap, String buttonId,HttpServletRequest request,String sourceType) throws Exception ;
	

	/**
	 * 按钮调用sql逻辑处理
	 * @param paramMap
	 * @param res
	 * @param formId
	 * @param buttonId
	 * @param buttonType
	 * @return
	 * @throws DcfException 
	 * @throws Exception 
	 */
	public String[] execHzsql(Map<String,Object> paramMap,
			String[] res,String formId,String buttonId,String buttonType,HttpSession session,String sourceType) throws DcfException, Exception;
	
	/**
	 * 按钮执行sql调用的sql
	 * @throws Exception 
	 * @throws SQLException
	 */
	public String[] execButtonExecSql(String formId, long execSqlRelaid, Map<String, Object> p,HttpSession session,String sourceType) throws DcfException, Exception ;
	
	/**
	 * 执行存储过程
	 * @throws SQLException 
	 */
	public String[] execPrepare(Map<String, Object> p,String pname ) throws DcfException, SQLException ;
	
	/**
	 * 执行sql调用的sql
	 * @throws SQLException
	 */
	public String[] execExecSqlForColumnName(long formId,long columnId, long execSqlRelaid, Map<String, String> p) throws SQLException;
	/**
	 * 引入公共逻辑
	 * @return
	 * @throws Exception 
	 */
	public String[] introduceData(long formId,long buttonId,Map<String,String>[] arr, Map<String, String> params) throws Exception;
	
	/**
	 * 获取导入文件头信息
	 * @param filePath 导入文件路径
	 */
	public DcfReponse getImportFileHead(String filePath);
	
	//public ImportField[] getFormField(String fromId);
	
	/**
	 * 开始导入
	 * @param formId
	 * @param filePath
	 * @param clientFileName
	 * @param repeOper
	 * @param execptOper
	 * @param fieldSet
	 * @param buttonId
	 * @return
	 */
	public DcfReponse importExcelData(String formId, String filePath, String clientFileName, String repeOper, String execptOper, Map<String, String>[] fieldSet,long buttonId,HttpServletRequest request,String sourceType);



	public String[] importExcelDatax(String formId, String filePath, String clientFileName, String repeOper, String execptOper, Map<String, String>[] fieldSet,long buttonId,HttpServletRequest request,String sourceType,HttpServletResponse response);

	String[] execQzsql(Map<String, Object> paramMap, String formId,
			String buttonId, String buttonType, HttpSession session,
			String sourceType) throws Exception;
}
