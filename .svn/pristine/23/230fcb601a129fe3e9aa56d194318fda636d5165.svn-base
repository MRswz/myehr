package com.myehr.service.impl.scheme;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import com.myehr.common.util.StringUtils;
import com.myehr.mapper.formmanage.form.SysRuleMapper;
import com.myehr.pojo.formmanage.cache.SqlUtil;
import com.myehr.pojo.formmanage.cache.SysFormButtonCalculateCache;
import com.myehr.pojo.formmanage.cache.SysFormconfigCache;
import com.myehr.pojo.formmanage.cache.SysRuleCache;
import com.myehr.pojo.formmanage.cache.SysSolutionCache;
import com.myehr.pojo.formmanage.cache.SysSqlParamsCache;
import com.myehr.pojo.formmanage.form.SysRuleExample;
import com.myehr.pojo.formmanage.form.SysRuleWithBLOBs;
import com.myehr.service.formmanage.form.IFormService;
import com.myehr.service.scheme.ISchemeService;

public class SchemeServiceImpl  implements ISchemeService {
	private static Logger logger = LoggerFactory.getLogger(SchemeServiceImpl.class);
	private IFormService formService;

	@Autowired
	private SysRuleMapper sysRuleMapper;
//	/private static final Logger log = DcfUtil.getLogger(SolutionUtil.class);
	/**
	 * 开始执行公式
	 * @param ruleIds
	 * @param formId
	 * @param buttonId
	 * @param params
	 * @return
	 * @throws Throwable 
	 */
	public String excRules(String ruleIds,String formId,String buttonId,Map<String,String> params,Map<String,String>  oparams) throws Throwable{
		//获取可执行公式
		String[] ruleidsarr = ruleIds.split(",");
		SysFormconfigCache form = formService.getForm(formId+"");
		SysFormButtonCalculateCache calculate = (SysFormButtonCalculateCache)form.getButtonByButtonId(buttonId+"").getButtonExt();
		List<SysSolutionCache> solutions =  calculate.getSolutions();
		String errorRuleName = "";
		for(int i=0; i<solutions.size(); i++){
			List<SysRuleCache> tl  =  solutions.get(i).getRules();
			for(int k=0; k<tl.size(); k++){
				long tempruleid = tl.get(k).getRuleId();
				for(int j=0; j<ruleidsarr.length; j++){
					if(ruleidsarr[j].equals(tempruleid+"")){ //被勾选中的公式
						String sql = this.replaceSqlParam(tl.get(k), params,oparams);
						String[] sqls = sql.split(";");
						//事务开始
						//ITransactionManager txManager = TransactionManagerFactory.getTransactionManager();// 事务
						try {
							
							//事务开始 txManager.begin(ITransactionDefinition.PROPAGATION_REQUIRES_NEW, ITransactionDefinition.ISOLATION_DEFAULT);
						
							for(String tempsql:sqls){
								logger.info("公式执行sql:"+tempsql);
								//开始执行
								//getDASTemplate().queryByNamedSql(DataObject.class,"com.dcf.form.runtime.cardform.excuteRule", tempsql);
							}
						}catch (Exception e) {
							// TODO: handle exception
							e.printStackTrace();logger.error(e.getMessage(),e);
							errorRuleName+= "公式为:\""+tl.get(k).getRuleName()+"\" 执行失败!<br/>";
							//事务回滚 txManager.rollback();
						}finally{
							//事务提交 txManager.commit();
						}
					}
				}
			}
		}
		if("".equals(errorRuleName)){
			errorRuleName = "success";
		}
		return errorRuleName;
	}
	
	/**
	 * 
	 * @param rule
	 * @param oparams 
	 * @param sql
	 * @return
	 * @throws Throwable 
	 */
	public String replaceSqlParam(SysRuleCache rule,Map<String,String> params, Map<String, String> oparams) throws Throwable{
		String sql = rule.getRuleExcSql();
		List<SysSqlParamsCache> ps = rule.getSysSqlParams();
		//List<SysGeneralParam> gps = rule.getGeneralParam();
		
		for(int i=0; i<ps.size(); i++){
			String paramcode = ps.get(i).getSqlParamsCode();
			String paramname = ps.get(i).getSqlParamsName();
			String paramvalue = params.get(paramcode);
			if(paramvalue==null){
				//log.error("方案为："+rule.getSolution().getSolutionName()+"下，公式为："+rule.getRuleName()+" 参数为："+ps.get(i).getSqlParamsName()+" 参数值为空，公式执行失败");
			}
			sql = sql.replaceAll("\\[p:"+paramname+"\\]", paramvalue);
		} 
		
		List<String[]> arr = rule.getParams();
		
		for(int i=0; i<arr.size(); i++){
			String str1 = arr.get(i)[0];
			String str2 = arr.get(i)[1];
			if("c".equals(str1)){
				String key = "c_" + str2.substring(str2.indexOf("_")+1);
				String value = oparams.get(key);
				sql = sql.replaceAll("\\["+str1+":"+str2+"\\]", value);
			}
			if("s".equals(str1)){
				String key = "s_" + str2;
				String value = oparams.get(key);
				sql = sql.replaceAll("\\["+str1+":"+str2+"\\]", value);
			}
			if("r".equals(str1)){
				String key = "r_" + str2;
				String value = oparams.get(key);
				sql = sql.replaceAll("\\["+str1+":"+str2+"\\]", value);
			}
		}
		
		return sql;
	}
	

	
	/**
	 * 通过方案id 多个以分隔符隔开 获取方案公式树
	 * @param solutionIds
	 * @return
	 * @throws Exception 
	 */
	public Object[] querySolutionRuleTreeBySolutionIds(String solutionIds) throws Exception{
		if(solutionIds==null){
			return null;
		}
		/*String[] ss = solutionIds.split(",");
		List<DataObject> lsolutions = new ArrayList<DataObject>();
		List<DataObject> lrules = new ArrayList<DataObject>();
		for(int i=0;i<ss.length; i++){
			DataObject solution = DataObjectUtil.createDataObject("com.dcf.system.scheme.service.impl.scheme.SysSolution");
			solution.set("isExc", "1");
			lsolutions.add(solution);
			solution.set("solutionId", ss[i]);
			int ret = getDASTemplate().expandEntity(solution);
			
			if(ret == -1){
				throw new Exception("通过方案id为"+ss[i]+"无法获取方案数据!");
			}
			
			CriteriaType criteria = CriteriaType.FACTORY.create();
			criteria.set_entity("com.dcf.system.scheme.service.impl.scheme.SysRule");
			criteria.set("_expr[1]/_property", "ruleSolutionId");
			criteria.set("_expr[1]/_value", Long.parseLong(ss[i]));
			criteria.set("_orderby[1]/_property", "ruleSort");
			IDASCriteria ida = getDASTemplate().criteriaTypeToDASCriteria(criteria);
			DataObject[] rules = getDASTemplate().queryEntitiesByCriteriaEntity(DataObject.class, ida);
			if(rules==null||rules.length==0){
				throw new Exception("通过方案id为"+ss[i]+"无法获取公式数据!");
			}
			for(int k=0;k<rules.length; k++){
				lrules.add(rules[k]);
			}
		}
		Object[] objs = new Object[2];
		objs[0] = lsolutions;
		objs[1] = lrules;
		return objs;*/
		return null;
	}
	
	public static Map setTree(String nodeId,String nodeName,String parentNodeId,String nodeType,String icon){
		/*DataObject d1 = DataObjectUtil.createDataObject("commonj.sdo.DataObject");
		d1.set("nodeName", nodeName);
		d1.set("nodeParentId", parentNodeId);
		d1.set("nodeId", nodeId);
		d1.set("nodeType", nodeType);
		d1.set("icon", icon);*/
		return null;
	}

	/**
	 * 恢复方案
	 * @param solutions
	 * @return
	 * @throws Exception 
	 */
	public String restorSolution(Map[] solutions) {
		/*for(int i=0 ;i<solutions.length; i++){
			DataObject temp = solutions[i];
			String deleteMark  = temp.getString("deleteMark");
			if("Y".equals(deleteMark)){ //需要恢复
				temp.set("deleteMark", "N");
				getDASTemplate().updateEntity(temp);
			}
		}*/
		return "1";
	}
	/**
	 *删除方案
	 * @param sysRules
	 * @return
	 */
	public String deleteSolution(Map[] solutions) {
		/*for(int i=0 ;i<solutions.length; i++){
			DataObject temp = solutions[i];
			String deleteMark  = temp.getString("deleteMark");
			if("Y".equals(deleteMark)){ //需要物理删除
				getDASTemplate().deleteEntity(temp);
				//物理删除对应的公式
				DataObject rule = DataObjectUtil.createDataObject("com.dcf.system.scheme.service.impl.scheme.SysRule");
				rule.set("ruleSolutionId", temp.get("solutionId"));
				getDASTemplate().deleteByTemplate(rule);
				
			}else { //需要逻辑删除
				temp.set("deleteMark", "Y");
				getDASTemplate().updateEntity(temp);
			}
		}*/
		return "1";
	}
	
	/**
	 * 
	 * @param param
	 * @return
	 * @throws Exception 
	 */
	public String queryDictTypeNameEntryName(int entryId) throws Exception {
		/*CriteriaType criteria = CriteriaType.FACTORY.create();
		criteria.set_entity("com.dcf.system.scheme.service.impl.scheme.QSysDictEntry");
		criteria.set("_expr[1]/dictEntryId", entryId);
		IDASCriteria dasCriteria = getDASTemplate().criteriaTypeToDASCriteria(criteria);
		DataObject[] obj =  getDASTemplate().queryEntitiesByCriteriaEntity(DataObject.class, dasCriteria);
		if(obj!=null&&obj.length>0){
			return obj[0].getString("dictTypeName")+"/"+obj[0].getString("dictEntryName");
		}*/
		return null;
	}
	/**
	 * 删除参数
	 * @param param
	 * @return
	 * @throws Exception 
	 */
	public String deleteParam(Map param) throws Exception {
		
		//getDASTemplate().deleteEntity(param);
		return "1";
	}

	/**
	 * 保存参数
	 * @param param
	 * @return
	 * @throws Exception 
	 */
	public String saveParam(Map param) throws Exception {
		/*String pkid = param.getString("pkId");
		if(pkid==null){
			 pkid = DcfUtil.getPrimaryKey("SYS_SOLUTION_PARAM.PK_ID")+"";
			 param.set("pkId", pkid);
		}
		getDASTemplate().saveEntity(param);*/
		return "1";
	}

	/**
	 * 恢复公式
	 * @param sysRule
	 * @return
	 * @throws Exception 
	 */
	public String restorRule(Map[] sysRules) {
		/*for(int i=0 ;i<sysRules.length; i++){
			DataObject temp = sysRules[i];
			String deleteMark  = temp.getString("deleteMark");
			if("Y".equals(deleteMark)){ //需要恢复
				temp.set("deleteMark", "N");
				getDASTemplate().updateEntity(temp);
			}
			
		}*/
		
		return "1";
	}
	
	/**
	 * 删除公式
	 * @param sysRule
	 * @return
	 * @throws Exception 
	 */
	public String deleteRule(Map[] sysRules) {
		/*for(int i=0 ;i<sysRules.length; i++){
			DataObject temp = sysRules[i];
			String deleteMark  = temp.getString("deleteMark");
			if("Y".equals(deleteMark)){ //需要物理删除
				getDASTemplate().deleteEntity(temp);
			}else { //需要逻辑删除
				temp.set("deleteMark", "Y");
				getDASTemplate().updateEntity(temp);
			}
			
		}*/
		
		return "1";
	}
	
	/**
	 * 批量保存公式信息
	 * @param sysRule
	 * @return
	 * @throws Exception 
	 */
	public void saveRules(SysRuleCache[] sysRules) throws Exception{
		/*for(int i=0; i<sysRules.length; i++){
			saveRule(sysRules[i]);
		}*/
	}
	
	/**
	 * 保存公式信息
	 * @param sysRule
	 * @return
	 * @throws Exception 
	 */
	public String saveRule(SysRuleCache sysRule) throws Exception{
		/*//isExistRepeatRuleCode
		String ruleId = sysRule.getString("ruleId");
		boolean isExist = false;
		if(ruleId!=null){
			isExist = false;
		}else {
			isExist = isExistRepeatRuleCode(sysRule.getString("ruleCode"), sysRule.getString("ruleSolutionId"));
		}
		if (isExist == false) {
			if(sysRule.getString("ruleId")==null||"".equals(sysRule.getString("ruleId"))){
				long nextSequence = getDASTemplate().getNextSequence("SYS_RULE.RULE_ID");
				sysRule.set("ruleId", nextSequence);
			}
			String entitySql = sysRule.getString("ruleJavaSql");
			String excSql = SqlUtil.converSql(entitySql);
			if(excSql==null){
				throw new RuntimeException("转换sql为空！");
			}
			sysRule.set("ruleExeSql", excSql);
			DcfUtil.setCommonInfo(sysRule, "N");
			getDASTemplate().saveEntity(sysRule);
			
			HashMap map = new HashMap();
			map.put("ruleSolutionId", sysRule.getString("ruleSolutionId"));
			DataObject[] datas = getDASTemplate().queryByNamedSql(DataObject.class, "com.dcf.system.scheme.service.impl.scheme.querySysRuleFormIdList", map);
			FormCacheManager fcm = new FormCacheManager();
			for (int i = 0; i < datas.length; i++) {
				DataObject object = datas[i];
				fcm.removeCache(object.getString("formId"));//移除表单缓存
				fcm.getForm(object.getString("formId"));
			}
			
			return "1";
		} else {
			return "2";
		}*/
		
		return null;
	} 
	
	/**
	 * 获取转换后的sql
	 * @param entitySql
	 * @return
	 * @throws Exception
	 */
	public String getRealSql(String entitySql) throws Exception{
		return SqlUtil.converSql(entitySql);
	}
	
	/**
	 * 添加方案
	 */
	public String addSolution(SysSolutionCache sysSolution) throws Exception {
		/*boolean isExist = false;
		long nextSequence = sysSolution.getLong("solutionId");
		if(nextSequence==0){
			isExist = isExistRepeatSolutionCode(sysSolution.getString("solutionCode"), "");
		}
		if (isExist == false) {
			nextSequence = nextSequence==0?getDASTemplate().getNextSequence("SYS_SOLUTION.SOLUTION_ID"):nextSequence;
			sysSolution.set("solutionId", nextSequence);
			DcfUtil.setCommonInfo(sysSolution, "N");
			getDASTemplate().saveEntity(sysSolution);
			return "-1";
		} else {
			return "2";
		}*/
		
		return "";
	}
	
	
	/**
	 * 保存目录信息
	 */
	public String saveSysFormFolder(Map sysSolutionFolderTree) throws Exception {
		/*String folderTreeId = sysSolutionFolderTree.getString("folderTreeId");
		String folderTreeParentId =sysSolutionFolderTree.getString("folderTreeParentId"); 
		String folderTreeSeq="";
		String parentSeq="";
		if (folderTreeId==null||folderTreeId=="") {
			long pk = getDASTemplate().getNextSequence("SYS_SOLUTION_FOLDER_TREE.FOLDER_TREE_ID");
			sysSolutionFolderTree.set("folderTreeId", pk);
			DcfUtil.setCommonInfo(sysSolutionFolderTree);
			if(folderTreeParentId==null||folderTreeParentId==""){
				 folderTreeSeq = pk+".";
			}else{
				parentSeq = queryParentSeqById(folderTreeParentId);
				folderTreeSeq= parentSeq+pk+".";
			}
			sysSolutionFolderTree.set("folderTreeSeq", folderTreeSeq);
		}
			getDASTemplate().saveEntity(sysSolutionFolderTree);*/
			
			return "1";
	}
	
	public String queryParentSeqById(String folderTreeId) {
		/*String parentSeq ="";
		IDASCriteria dasCriteria = getDASTemplate().createCriteria(
		"com.dcf.system.scheme.service.impl.scheme.SysSolutionFolderTree");
		
		dasCriteria.add(ExpressionHelper.eq("folderTreeId", folderTreeId));
		DataObject[] sysFormFolder = getDASTemplate()
		.queryEntitiesByCriteriaEntity(DataObject.class, dasCriteria);
		if(sysFormFolder != null && sysFormFolder.length > 0){
			 parentSeq = sysFormFolder[0].getString("folderTreeSeq");
		}
		return parentSeq;*/
		
		return null;
	}
	
	/**
	 * 查询参数树
	 * @return
	 */
	public Map[] queryParamTree(String sysSolutionId,String paramType){
		/*//先查目录数据
		CriteriaType criteria = CriteriaType.FACTORY.create();
		criteria.set_entity("com.dcf.system.sqlparams.sqlparamsdataset.SysSqlParamsFolderTree");
		IDASCriteria dasCriteria = getDASTemplate().criteriaTypeToDASCriteria(criteria);
		DataObject[] folders = getDASTemplate().queryEntitiesByCriteriaEntity(DataObject.class, dasCriteria);
		
		//查实际参数数据
		CriteriaType criteria2 = CriteriaType.FACTORY.create();
		criteria2.set_entity("com.dcf.system.sqlparams.sqlparamsdataset.SysSqlParams");
		IDASCriteria dasCriteria2 = getDASTemplate().criteriaTypeToDASCriteria(criteria2);
		DataObject[] params = getDASTemplate().queryEntitiesByCriteriaEntity(DataObject.class, dasCriteria2);
		DataObject[] retdatas = new DataObject[folders.length+params.length];
		for(int i=0; i<retdatas.length; i++){
			DataObject temp = DataObjectUtil.createDataObject("commonj.sdo.DataObject");
			if(i<folders.length){ //处理目录数据
				DataObject folder = folders[i];
				temp.set("nodeId", folder.getString("folderTreeId")+"");
				temp.set("nodeName", folder.getString("folderTreeName"));
				temp.set("nodeParentId", folder.getString("folderTreeParentId"));
				temp.set("nodeType", "folder");
				temp.set("iconCls", "icon-node");
				//iconCls
			}else { //处理参数数据
				DataObject param  = params[i-folders.length];
				temp.set("nodeId", param.getString("sqlParamsId")+"_params");
				temp.set("nodeName", param.getString("sqlParamsName"));
				temp.set("nodeParentId", param.getString("sqlParamsFolderId"));
				temp.set("nodeType", "param");
				temp.set("iconCls", "icon-node");
			}
			retdatas[i] = temp;
		}
		return retdatas;*/
		
		return null;
	}
	/**
	 * 
	 * @param criteria
	 * @param pageCond
	 * @param sortField
	 * @param sortOrder
	 * @return
	 */
	public Map[] queryParamList(String solutionId, String type) {
		/*CriteriaType criteria = CriteriaType.FACTORY.create();
		criteria.set_entity("com.dcf.system.scheme.service.impl.scheme.SysSolutionParam");
		criteria.set("_expr[1]/sysSolutionId", solutionId);
		if(type!=null){
			criteria.set("_expr[2]/sysParamType", type);
		}
		IDASCriteria dasCriteria = getDASTemplate().criteriaTypeToDASCriteria(
				criteria);
		return getDASTemplate().queryEntitiesByCriteriaEntity(
				DataObject.class, dasCriteria);*/
		return null;
	}
	
	/**
	 * 
	 * @return
	 * @throws Exception 
	 */
	public Map querySolutionBySolutionId(long solutioinId) throws Exception {
		/*DataObject obj = DataObjectUtil.createDataObject("com.dcf.system.scheme.service.impl.scheme.SysSolution");
		if(solutioinId==0){
			throw new Exception("通过solutionId:"+solutioinId+" 无法加载com.dcf.system.scheme.service.impl.scheme.SysSolution对象");
		}
		obj.set("solutioinId", solutioinId);
		int rt = getDASTemplate().expandEntity(obj);
		if(rt==-1){
			throw new Exception("通过solutionId:"+solutioinId+" 无法加载com.dcf.system.scheme.service.impl.scheme.SysSolution对象");
		}
		return obj;*/
		return null;
	}
	
	
	/**
	 * 
	 * @param criteria
	 * @param pageCond
	 * @param sortField
	 * @param sortOrder
	 * @return
	 */
	/*public DataObject[] querySchemeList(CriteriaType criteria, PageCond pageCond,
			String sortField, String sortOrder) {
		criteria.set_entity("com.dcf.system.scheme.service.impl.scheme.SysSolution");
		if (sortField != null && sortOrder != null) {
			criteria.set("_orderby[1]/_property", sortField);
			criteria.set("_orderby[1]/_sort", sortOrder);
		} else {
			criteria.set("_orderby[1]/_property", "solutionCode");
			criteria.set("_orderby[1]/_sort", "asc");
		}
		
		
		IDASCriteria dasCriteria = getDASTemplate().criteriaTypeToDASCriteria(
				criteria);
		return getDASTemplate().queryEntitiesByCriteriaEntityWithPage(
				DataObject.class, dasCriteria, pageCond);
	}*/

	/**
	 * 判断方案编码是否存在
	 */
	private boolean isExistRepeatSolutionCode(String solutionCode, String solutionId) {
		/*IDASCriteria dasCriteria = getDASTemplate().createCriteria("com.dcf.system.scheme.service.impl.scheme.SysSolution");
		
		dasCriteria.add(ExpressionHelper.eq("solutionCode", solutionCode));
		if (StringUtil.isNotNullAndBlank(solutionId)) {
			dasCriteria.add(ExpressionHelper.ne("solutionId", solutionId));
		}
		
		DataObject[] dataObject = getDASTemplate().queryEntitiesByCriteriaEntity(DataObject.class, dasCriteria);
		if (dataObject != null && dataObject.length > 0) {
			return true;
		} */
		return false;
	}
	
	/**
	 * 判断在某个方案下公式编码是否重复
	 */
	private boolean isExistRepeatRuleCode(String ruleCode, String solutionId) {
		/*IDASCriteria dasCriteria = getDASTemplate().createCriteria("com.dcf.system.scheme.service.impl.scheme.SysRule");
		
		dasCriteria.add(ExpressionHelper.eq("ruleCode", ruleCode));
		dasCriteria.add(ExpressionHelper.eq("ruleSolutionId", solutionId));
		
		DataObject[] dataObject = getDASTemplate().queryEntitiesByCriteriaEntity(DataObject.class, dasCriteria);
		if (dataObject != null && dataObject.length > 0) {
			return true;
		} */
		return false;
	}
	
	/**
	 * 获取所有的方案信息（排除已删除的）
	 */
	public Map[] querySolutionByParent(String folderId) {
		/*IDASCriteria dasCriteria = getDASTemplate().createCriteria("com.dcf.system.scheme.service.impl.scheme.SysSolution");
		
		if(folderId!=null){
			dasCriteria.add(ExpressionHelper.eq("folderId", Long.parseLong(folderId)));
		}
		dasCriteria.add(ExpressionHelper.eq("deleteMark", "N"));
		
		dasCriteria.asc("solutionCode");
		return getDASTemplate().queryEntitiesByCriteriaEntity(DataObject.class, dasCriteria);*/
		return null;
	}
	
	/**
	 * 获取所有的子目录信息
	 */
	public Map[] querySolutionFolderByParent(String parentFolderId) {
		/*IDASCriteria dasCriteria = getDASTemplate().createCriteria("com.dcf.system.scheme.service.impl.scheme.SysSolutionFolderTree");
		
		if(parentFolderId!=null&&!"root".equals(parentFolderId)){
			dasCriteria.add(ExpressionHelper.eq("folderTreeParentId", Long.parseLong(parentFolderId)));
		}else {
			dasCriteria.add(ExpressionHelper.isNull("folderTreeParentId"));
		}
		
		return getDASTemplate().queryEntitiesByCriteriaEntity(DataObject.class, dasCriteria);*/
		return null;
	}
	
	/**
	 * 获取全部的计算公式信息（排除已删除的）
	 */
	public List<SysRuleWithBLOBs> queryRuleBySolutionId(String ruleSolutionId,String deleteMark ,String ruleCode,String ruleName,String ruleId) {
		SysRuleExample example = new SysRuleExample();
		SysRuleExample.Criteria criteria = example.createCriteria();
		
		if (StringUtils.isNotNullAndBlank(ruleSolutionId)) {
			criteria.andRuleSolutionIdEqualTo(new BigDecimal(ruleSolutionId));
		}
		if (StringUtils.isNotNullAndBlank(deleteMark)) {
			criteria.andDeleteMarkEqualTo(deleteMark);
		}
		if (StringUtils.isNotNullAndBlank(ruleCode)) {
			criteria.andRuleCodeEqualTo(ruleCode);
		}
		if (StringUtils.isNotNullAndBlank(ruleName)) {
			criteria.andRuleNameLike(ruleName);
		}
		if (StringUtils.isNotNullAndBlank(ruleId)) {
			criteria.andRuleIdEqualTo(Long.parseLong(ruleId));
		}
		example.setOrderByClause("RULE_SORT");
		List<SysRuleWithBLOBs> rules = sysRuleMapper.selectByExampleWithBLOBs(example);
		return rules;
	}
	
	/**
	 * 
	 * @param ruleSolutionId
	 * @return
	 */
	public String querySolutionFormId(String ruleSolutionId){
		
		return null;
	}

	public Map[] buildTreeNodes(String nodeType, String nodeId, String nodeCode, String nodeExt) {
		/*List<DataObject> results = new ArrayList<DataObject>();
		if ("Default".equals(nodeType)||"FO".equals(nodeType)) {
			
			DataObject[] folders = querySolutionFolderByParent(nodeId);
			
			//DataObject[] solution = querySolutionByParent(nodeId);
			if (folders != null && folders.length > 0) {
				for (int i = 0; i < folders.length; i++) {
					DataObject dataObject = DataObjectUtil.createDataObject("commonj.sdo.DataObject");
					dataObject.setString("nodeId", folders[i].getString("folderTreeId"));
					dataObject.setString("nodeCode", folders[i].getString("folderTreeName"));
					dataObject.setString("nodeName", folders[i].getString("folderTreeName"));
					dataObject.setString("nodeType", "FO");
					dataObject.setString("iconCls", "icon-solution");
					dataObject.setString("nodeExt", folders[i].getString("folderTreeId"));
					dataObject.setBoolean("isLeaf", false);
					dataObject.setBoolean("expanded", false);
					results.add(dataObject);
				}
			}
		}
		if ("FO".equals(nodeType)) {
			DataObject[] solution = querySolutionByParent(nodeId);
			if (solution != null && solution.length > 0) {
				for (int i = 0; i < solution.length; i++) {
					DataObject dataObject = DataObjectUtil.createDataObject("commonj.sdo.DataObject");
					dataObject.setString("nodeId", solution[i].getString("solutionId"));
					dataObject.setString("nodeCode", solution[i].getString("solutionCode"));
					dataObject.setString("nodeName", solution[i].getString("solutionName"));
					dataObject.setString("nodeType", "T");
					dataObject.setString("iconCls", "icon-solution");
					dataObject.setString("nodeExt", solution[i].getString("solutionId"));
					dataObject.setBoolean("isLeaf", false);
					dataObject.setBoolean("expanded", false);
					results.add(dataObject);
				}
			}
		}
		 if ("T".equals(nodeType)) {	
			DataObject[] rule = queryRuleBySolutionId(nodeExt,"N",null,null,null);
			if (rule != null && rule.length > 0) {
				for (int i = 0; i < rule.length; i++) {
					DataObject dataObject = DataObjectUtil.createDataObject("commonj.sdo.DataObject");
					dataObject.setString("nodeId", rule[i].getString("ruleId"));
					dataObject.setString("nodeCode", rule[i].getString("ruleCode"));
					dataObject.setString("nodeName", rule[i].getString("ruleName"));
					dataObject.setString("nodeType", "F");
					dataObject.setString("iconCls", "icon-calculate");
					dataObject.setString("nodeExt", rule[i].getString("ruleId"));
					dataObject.setBoolean("isLeaf", false);
					dataObject.setBoolean("expanded", false);
					results.add(dataObject);
				}
			}
		}
		return results.toArray(new DataObject[results.size()]);*/
		return null;
	}
	
	/**
	 * 获取目录信息
	 * @return
	 */
	public Map querySolutionFolderById(String folderTreeId) {
/*
		IDASCriteria dasCriteria = getDASTemplate().createCriteria(
		"com.dcf.system.scheme.service.impl.scheme.SysSolutionFolderTree");
		
		dasCriteria.add(ExpressionHelper.eq("folderTreeId", folderTreeId));
		DataObject[] sysFormFolder = getDASTemplate()
		.queryEntitiesByCriteriaEntity(DataObject.class, dasCriteria);
		if(sysFormFolder!=null&&sysFormFolder.length>0){
			return sysFormFolder[0];
		}*/
		return null;
	}
	
	/**
	 * 校验目录下是否有子目录
	 * @param folderTreeId
	 * @return
	 */
	public String queryChildById(String folderTreeId) {
		/*
		IDASCriteria dasCriteria = getDASTemplate().createCriteria(
		"com.dcf.system.scheme.service.impl.scheme.SysSolutionFolderTree");
		
		dasCriteria.add(ExpressionHelper.eq("folderTreeParentId", folderTreeId));
		DataObject[] sysFormFolder = getDASTemplate()
		.queryEntitiesByCriteriaEntity(DataObject.class, dasCriteria);
		if(sysFormFolder != null && sysFormFolder.length > 0){
			 return "-1";
		}*/
		return "1";
	}
	
	/**
	 * 校验目录下是否存在其他业务数据
	 * @param folderTreeId
	 * @return
	 */
	public String querySolutionByFolderId(String folderTreeId) {
		
		/*IDASCriteria dasCriteria = getDASTemplate().createCriteria(
		"com.dcf.system.scheme.service.impl.scheme.SysSolution");
		
		dasCriteria.add(ExpressionHelper.eq("folderId", Long.parseLong(folderTreeId)));
		DataObject[] sysFormConfig = getDASTemplate()
		.queryEntitiesByCriteriaEntity(DataObject.class, dasCriteria);
		if(sysFormConfig != null && sysFormConfig.length > 0){
			 return "-1";
		}*/
		return "1";
	}
	
	/**
	 * 删除目录
	 * @param folderTreeId
	 */
	public void deleteSolutionFolderById(String folderTreeId) {		
	//	DataObject sysFormFolder= querySolutionFolderById(folderTreeId);		
		//getDASTemplate().deleteEntity(sysFormFolder);
	}
}
