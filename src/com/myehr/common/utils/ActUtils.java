package com.myehr.common.utils;

import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.activiti.engine.impl.persistence.entity.GroupEntity;
import org.activiti.engine.impl.persistence.entity.UserEntity;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.myehr.common.mybatis.MybatisUtil;
import com.myehr.pojo.act.Act;
import com.myehr.pojo.sysParam.SysSystemParam;
/*import com.thinkgem.jeesite.common.annotation.FieldName;
import com.thinkgem.jeesite.common.config.Global;
import com.thinkgem.jeesite.common.utils.Encodes;
import com.thinkgem.jeesite.common.utils.ObjectUtils;
import com.thinkgem.jeesite.common.utils.StringUtils;
import com.thinkgem.jeesite.modules.act.entity.Act;
import com.thinkgem.jeesite.modules.sys.entity.Role;
import com.thinkgem.jeesite.modules.sys.entity.User;*/
import com.myehr.service.formmanage.form.ISysformconfigService;
import com.myehr.service.impl.formmanage.form.SysformconfigService;

/**
 * 流程工具
 * @author zf
 * @version 2016-11-03
 */
public class ActUtils {
	private static Logger logger = LoggerFactory.getLogger(ActUtils.class);
//	private static Logger logger = LoggerFactory.getLogger(ActUtils.class);
	
	/**
	 * 定义流程定义KEY，必须以“PD_”开头
	 * 组成结构：string[]{"流程标识","业务主表表名"}
	 */
	public static final String[] PD_LEAVE = new String[]{"leave", "oa_leave"};
	public static final String[] PD_TEST_AUDIT = new String[]{"process", "oa_test_audit"};
	
//	/**
//	 * 流程定义Map（自动初始化）
//	 */
//	private static Map<String, String> procDefMap = new HashMap<String, String>() {
//		private static final long serialVersionUID = 1L;
//		{
//			for (Field field : ActUtils.class.getFields()){
//				if(StringUtils.startsWith(field.getName(), "PD_")){
//					try{
//						String[] ss = (String[])field.get(null);
//						put(ss[0], ss[1]);
//					}catch (Exception e) {
//						logger.debug("load pd error: {}", field.getName());
//					}
//				}
//			}
//		}
//	};
//	
	/**
	 * 获取流程执行（办理）URL
	 * @param procId
	 * @return
	 */
	/*public static String getProcExeUrl(String procId) {
		String url = procDefMap.get(StringUtils.split(procId, ":")[0]);
		if (StringUtils.isBlank(url)){
			return "404";
		}
		return url;
	}*/
	
	@SuppressWarnings({ "unused" })
	public static Map<String, Object> getMobileEntity(Object entity,String spiltType){
		if(spiltType==null){
			spiltType="@";
		}
		Map<String, Object> map = Maps.newHashMap();

		List<String> field = Lists.newArrayList();
		List<String> value = Lists.newArrayList();
		List<String> chinesName =Lists.newArrayList();
		
		try{
			for (Method m : entity.getClass().getMethods()){
				if (m.getAnnotation(JsonIgnore.class) == null && m.getAnnotation(JsonBackReference.class) == null && m.getName().startsWith("get")){
					/*if (m.isAnnotationPresent(FieldName.class)) {
						Annotation p = m.getAnnotation(FieldName.class);
						FieldName fieldName=(FieldName) p;
						chinesName.add(fieldName.value());
					}else{
						chinesName.add("");
					}*/
					if (m.getName().equals("getAct")){
						Object act = m.invoke(entity, new Object[]{});
						Method actMet = act.getClass().getMethod("getTaskId");
						map.put("taskId", ObjectUtils.toString(m.invoke(act, new Object[]{}), ""));
					}else{
						field.add(StringUtils.uncapitalize(m.getName().substring(3)));
						value.add(ObjectUtils.toString(m.invoke(entity, new Object[]{}), ""));
					}
				}
			}
		}catch (Exception e) {
			e.printStackTrace();logger.error(e.getMessage(),e);
		}
		
		map.put("beanTitles", StringUtils.join(field, spiltType));
		map.put("beanInfos", StringUtils.join(value, spiltType));
		map.put("chineseNames", StringUtils.join(chinesName, spiltType));
		
		return map;
	}
	
	/**
	 * 获取流程表单URL
	 * @param formKey
	 * @param act 表单传递参数
	 * @return
	 */
	public static String getFormUrl(String formKey, Act act){
		
		StringBuilder formUrl = new StringBuilder();
		
		String formServerUrl = "";//Global.getConfig("activiti.form.server.url");
		
		if (StringUtils.isBlank(formServerUrl)){
			formUrl.append("");//(Global.getAdminPath());
		}else{
			formUrl.append(formServerUrl);
		}
        if(formKey.indexOf("http")!=-1){
        	formUrl=new StringBuilder();
		}
		formUrl.append(formKey).append(formUrl.indexOf("?") == -1 ? "?" : "&");
		formUrl.append("act.taskId=").append(act.getTaskId() != null ? act.getTaskId() : "");
		//formUrl.append("&act.taskName=").append(act.getTaskName() != null ? Encodes.urlEncode(act.getTaskName()) : "");
		formUrl.append("&act.taskDefKey=").append(act.getTaskDefKey() != null ? act.getTaskDefKey() : "");
		formUrl.append("&act.procInsId=").append(act.getProcInsId() != null ? act.getProcInsId() : "");
		formUrl.append("&act.procDefId=").append(act.getProcDefId() != null ? act.getProcDefId() : "");
		formUrl.append("&act.status=").append(act.getStatus() != null ? act.getStatus() : "");
		formUrl.append("&id=").append(act.getBusinessId() != null ? act.getBusinessId() : "");
		formUrl.append("&act.procDefKey=").append(act.getProcDefKey() != null ? act.getProcDefKey() : "");
		return formUrl.toString();
	}
	
	
	/**
	 * 测试 获取流程表单URL
	 * @param formKey
	 * @param act 表单传递参数
	 * @return
	 */
	public static String getcsFormUrl(String formKey, Act act){
		
		StringBuilder formUrl = new StringBuilder();
		
		String formServerUrl = "";//Global.getConfig("activiti.form.server.url");
		
		if (StringUtils.isBlank(formServerUrl)){
			formUrl.append("");//(Global.getAdminPath());
		}else{
			formUrl.append(formServerUrl);
		}
		formUrl.append("/oa/testAudit/form").append(formUrl.indexOf("?") == -1 ? "?" : "&");
		formUrl.append("act.taskId=").append(act.getTaskId() != null ? act.getTaskId() : "");
		//formUrl.append("&act.taskName=").append(act.getTaskName() != null ? Encodes.urlEncode(act.getTaskName()) : "");
		formUrl.append("&act.taskDefKey=").append(act.getTaskDefKey() != null ? act.getTaskDefKey() : "");
		formUrl.append("&act.procInsId=").append(act.getProcInsId() != null ? act.getProcInsId() : "");
		formUrl.append("&act.procDefId=").append(act.getProcDefId() != null ? act.getProcDefId() : "");
		formUrl.append("&act.status=").append(act.getStatus() != null ? act.getStatus() : "");
		formUrl.append("&id=").append(act.getBusinessId() != null ? act.getBusinessId() : "");
		formUrl.append("&act.procDefKey=").append(act.getProcDefKey() != null ? act.getProcDefKey() : "");
		formUrl.append("&act.title=").append(formKey != null ? formKey : "");
		
		return formUrl.toString();
	}
	
	/**
	 * 转换流程节点类型为中文说明
	 * @param type 英文名称
	 * @return 翻译后的中文名称
	 */
	public static String parseToZhType(String type) {
		Map<String, String> types = new HashMap<String, String>();
		types.put("userTask", "用户任务");
		types.put("serviceTask", "系统任务");
		types.put("startEvent", "开始节点");
		types.put("endEvent", "结束节点");
		types.put("exclusiveGateway", "条件判断节点(系统自动根据条件处理)");
		types.put("inclusiveGateway", "并行处理任务");
		types.put("callActivity", "子流程");
		return types.get(type) == null ? type : types.get(type);
	}
	
	
	/**
	 * 部署流程是取根据key取流程模板对应的属性
	 * @param jsonNode 模板json
	 * @param key 属性名
	 * @return 属性名对应的json
	 */
	public static JsonNode getJsonNodeByKey(JsonNode jsonNode,String key) {
		Iterator<Entry<String, JsonNode>> jsonNodes = jsonNode.fields();  
	    while (jsonNodes.hasNext()) {  
	        Entry<String, JsonNode> node = jsonNodes.next();
	        logger.info(node.getKey().toString());
	        logger.info(node.getValue().toString());
	        if (node.getKey().equals(key)) {
	        	return node.getValue();
			}
	    }  
		return null;
	}
	
	/**
	 * 部署流程是取根据key取流程模板对应的属性
	 * @param jsonNode 模板json
	 * @param key 属性名
	 * @return 属性名对应的json
	 */
	public static String getJsonNodeValueByKey(JsonNode jsonNode,String key) {
		Iterator<Entry<String, JsonNode>> jsonNodes = jsonNode.fields();  
	    while (jsonNodes.hasNext()) {  
	        Entry<String, JsonNode> node = jsonNodes.next();
	        logger.info(node.getKey().toString());
	        logger.info(node.getValue().toString());
	        if (node.getKey().equals(key)) {
	        	if (node.getValue()!=null) {
	        		return node.getValue().toString();
				}else {
					return "";
				}
	        	
			}
	    }  
		return "";
	}
	
	

	/**
	 * 部署流程是取根据key取流程模板对应的属性列表
	 * @param jsonNode 模板json
	 * @param key 属性名
	 * @return 属性名对应的json列表
	 */
	public static List<JsonNode> getJsonNodeListByKey(JsonNode jsonNode,String key) {
		return jsonNode.findParents(key);
	}

	public static String TimeAgo(Date overtime) {
			long nowTime=System.currentTimeMillis();  //获取当前时间的毫秒数
			String msg = null;
		    long reset=overtime.getTime();   //获取指定时间的毫秒数
		 	long dateDiff=nowTime-reset;
		 	
		 	if(dateDiff<0){
		 		msg="输入的时间不对";
		 	}else{
				long dateTemp1=dateDiff/1000; //秒
				long dateTemp2=dateTemp1/60; //分钟
				long dateTemp3=dateTemp2/60; //小时
				long dateTemp4=dateTemp3/24; //天数
				long dateTemp5=dateTemp4/30; //月数
				long dateTemp6=dateTemp5/12; //年数
				
				if(dateTemp6>0){
					msg = dateTemp6+"年前";
					
				}else if(dateTemp5>0){
					msg = dateTemp5+"个月前";
					
				}else if(dateTemp4>0){
					msg = dateTemp4+"天前";
					
				}else if(dateTemp3>0){
					msg = dateTemp3+"小时前";
					
				}else if(dateTemp2>0){
					msg = dateTemp2+"分钟前";
					
				}else if(dateTemp1>0){
					msg = "刚刚";
				}	
			}
			return msg;
	}

	public static String[] getUserPhotoById(String empId, ISysformconfigService sysformconfigService) throws Exception {
		String[] recode = new String[2];
		String photo = sysformconfigService.getEmpPhotoByUserId(empId);
		if (photo!=null&&!photo.equals("")) {
			recode[0]=sysformconfigService.getEmpPhotoByUserId(empId);
		}else{
			SysSystemParam photoPath = (SysSystemParam) sysformconfigService.getSysParam().get("photoPath");
			SysSystemParam empParam = (SysSystemParam) sysformconfigService.getSysParam().get("EMP_ENTITY");
			String sqlx = "select "+empParam.getSysParamRemark()+" from "+empParam.getSysParamValue1()+" where "+empParam.getSysParamValue2()+" = '"+empId+"'";
			Map map = MybatisUtil.queryOne("runtime.selectSql", sqlx);
			if(map!=null){
				String empName = (String) map.get(empParam.getSysParamEntry().split("_")[0]);
				String empCode = (String) map.get(empParam.getSysParamEntry().split("_")[1]);
				recode[0]=photoPath.getSysParamValue1()+"/人员照片/"+empName+"_"+empCode+".jpg";
			}
		}
		//
		return recode;
	}

	/*public static UserEntity toActivitiUser(User user){
		if (user == null){
			return null;
		}
		UserEntity userEntity = new UserEntity();
		userEntity.setId(user.getLoginName());
		userEntity.setFirstName(user.getName());
		userEntity.setLastName(StringUtils.EMPTY);
		userEntity.setPassword(user.getPassword());
		userEntity.setEmail(user.getEmail());
		userEntity.setRevision(1);
		return userEntity;
	}*/
	
	/*public static GroupEntity toActivitiGroup(Role role){
		if (role == null){
			return null;
		}
		GroupEntity groupEntity = new GroupEntity();
		groupEntity.setId(role.getEnname());
		groupEntity.setName(role.getName());
		groupEntity.setType(role.getRoleType());
		groupEntity.setRevision(1);
		return groupEntity;
	}*/
	
}
