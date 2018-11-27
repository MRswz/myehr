package com.myehr.service.impl.formmanage.runtime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myehr.common.exception.DcfException;
import com.myehr.common.mybatis.MybatisUtil;
import com.myehr.common.util.ChangeCode;
import com.myehr.mapper.sysuser.SysFieldLogMapper;
import com.myehr.pojo.field.SysField;
import com.myehr.pojo.formmanage.cache.SysFormColumnCache;
import com.myehr.pojo.formmanage.cache.SysFormconfigCache;
import com.myehr.pojo.formmanage.cache.UserObject;
import com.myehr.pojo.sysuser.SysFieldLog;
import com.myehr.service.formmanage.form.IFormService;
import com.myehr.service.formmanage.runtime.IRuntimeGridFormService;

@Service
public class RuntimeGridFormServiceImpl  implements IRuntimeGridFormService {
	private static Logger logger = LoggerFactory.getLogger(RuntimeGridFormServiceImpl.class);
	public static final String  excuteSql = "com.dcf.form.runtime.gridfrom.excuteSql";
	
//	@Autowired
	@Resource(name = "IFormService") 
	private IFormService formService;
	
	@Autowired
	private SysFieldLogMapper sysFieldLogMapper;
	
//	@Autowired
//	private SqlSessionFactory sqlSessionFactory;
	/**
	 * 删除grid列表数据
	 * @throws Throwable 
	 * @throws Exception
	 */
	public String removeDatas(Map[] datas, String formId,Map<String,Object[]> tabparam,UserObject user,HttpServletRequest request,String sourceType) throws Throwable {
		HttpSession session = request.getSession();
		String userId = session.getAttribute("userid")+"";
		SysFormconfigCache form = formService.getForm(formId);
		List<SysFormColumnCache> cs = form.getColumns();
		try {
			if (form != null) {
				//前置触发
				/*if(tabparam!=null&&buttonId!=null&&!"null".equals(buttonId)&&!"0".equals(buttonId)) {
					this.execQzsql(tabparam, formId, buttonId, null,session,sourceType);
				}*/
				if (datas != null && datas.length > 0) {
					for (Map obj : datas) {
						String sql = null;
						try {
							sql = RuntimeUtil.removeData(form, obj);
						} catch (DcfException e) {
							String errorMessage = e.getMessage();
							if ("主键主键字段值为空".equals(errorMessage)) {
								// 这不算异常
							} else {
								throw e;
							}
						}
						if (sql != null) {
							
							for(int k=0; k<cs.size(); k++){
								if(cs.get(k).isFieldIsLog()){
									String filedTablename = cs.get(k).getFormFiledTablename();
									String pkcolumntablename = form.getPkColumn().getFormFiledTablename();//								删除之前值
									
									String formatFieldname = RuntimeUtil.getSelectFieldFormat(filedTablename, cs.get(k).getEntityColumn());
									
									String uniqueCode = ChangeCode.getUniqueCode(form.getFormDefSaveTable(), pkcolumntablename);
									
									String pkValue = obj.get(uniqueCode)+"";
									String queryBeforeSql = "select "+ChangeCode.getRealCode(formatFieldname)+" from  "+form.getFormDefSaveTable()+" t WHERE t."+pkcolumntablename+" = "+pkValue;
									logger.info(queryBeforeSql);
									List<Map> before  = MybatisUtil.queryList("runtime.selectSql", queryBeforeSql);
									String beforValue = null;
									if(before.size()>0){
										beforValue = before.get(0).get(filedTablename)+"";
									}
									SysFieldLog flog = new SysFieldLog();  //记录删除日志
									flog.setLogTableName(form.getFormDefSaveTable());
									flog.setLogFieldName(filedTablename);
									//LOG_FIELD_AFTER
									flog.setLogFieldBefore(beforValue);
									flog.setLogType("3");
									DateFormat date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
							        String date1=date.format(new Date());
							        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss" );
							        Date logTime = sdf.parse(date1);
									flog.setLogTime(logTime);
									flog.setLogOperator(session.getAttribute("userid")+"");
									flog.setLogIp(session.getAttribute("ipAddress")+"");
									sysFieldLogMapper.insert(flog);
								}
							}
							MybatisUtil.delete("runtime.deleteSql", sql);
						//	getDASTemplate().executeNamedSql(excuteSql, sql);
						}
						if(tabparam!=null){
							String[] tabformIds = (String[])tabparam.get("tabFormIds");
							if(tabformIds!=null){
								for(String tempFormId :tabformIds){
									SysFormconfigCache tempform = formService.getForm(tempFormId);
									try {
										//SysFormconfigCache form,Map<String,String>[] paramdata,UserObject user,HttpServletRequest request
										RuntimeUtil.getRemoveTabData(tempform, (Map[])tabparam.get("paramdata"), user,request,sourceType);
									} catch (Exception e) {
										// TODO 自动生成 catch 块
										e.printStackTrace();logger.error(e.getMessage(),e);
										throw new DcfException(e.getMessage());
									}
								}
							}
						}
					}
				}
				return "1";
			}
		}catch (Exception e) {
			// TODO: handle exception
			throw new DcfException(e.getMessage());
		}
		return "formId:" + formId + " 找不到实例";
	}
	
	
	public String copyDatas(List<SysField> sysFields,Map[] datas,String formSaveTable,String pkColumn,UserObject user,HttpServletRequest request) throws Throwable {
		HttpSession session = request.getSession();
		
		for (int i = 0; i < datas.length; i++) {
			String sql = "";
			String fieldString = "";
			String valueString = "";
			Map obj = datas[i];
			for (int j = 0; j < sysFields.size(); j++) {
				SysField sysField = sysFields.get(j);
				String fieldCode = sysField.getFieldCode();
				
				if (fieldCode.equals(pkColumn)) {
					continue;
				}
				String value = obj.get(ChangeCode.getUniqueCode(formSaveTable, fieldCode))+"";
				fieldString+=fieldCode+",";
				if (sysField.getFieldType().toUpperCase().equals("NVARCHAR")||sysField.getFieldType().toUpperCase().equals("VARCHAR")||sysField.getFieldType().toUpperCase().equals("VARCHAR2")||sysField.getFieldType().toUpperCase().equals("CHAR")) {
					if (value==null || value.equals("")) {
						valueString+=""+value+",";
					}else {
						valueString+="'"+value+"',";
					}
					
				}else if ((sysField.getFieldType().toUpperCase()).equals("DECIMAL")||(sysField.getFieldType().toUpperCase()).equals("INT")) {
					valueString+=""+value+",";
				}else if((sysField.getFieldType().toUpperCase()).equals("DATETIME") || (sysField.getFieldType().toUpperCase()).equals("SMALLDATETIME")){
					if (value==null || value.equals("") || value.equals("null")) {
						valueString+=""+value+",";
					}else if (value.contains("-")||value.contains(":")||value.contains("/")) {
						valueString+=""+value+",";
					}else{
						//DateFormat date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
						SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
						long lt = new Long(value);
				        Date date1 = new Date(lt);
				        String date2=simpleDateFormat.format(date1);
				        valueString+="'"+date2+"',";
					}
					
				}else {
					valueString+=""+value+",";
				}
				
			}
			fieldString = fieldString.substring(0,fieldString.length()-1);
			valueString = valueString.substring(0,valueString.length()-1);
			sql = "insert into "+ formSaveTable+"("+fieldString+") values ("+valueString+")";
			try {
				MybatisUtil.insert("runtime.insertSql", sql);
				//retcode[0]="0";
				//retcode[1]="执行成功";
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();logger.error(e.getMessage(),e);
				throw new DcfException(e);
			}
		}
		return "1";
	}
}
