package com.myehr.pojo.formmanage.cache;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 实体sql处理类
 * @author Administrator
 *
 */
public class SqlUtil implements Serializable {
	//private static final Logger log = DcfUtil.getLogger(SqlUtil.class);

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 解析关联计算按钮参数信息
	 * @param sql
	 * @param rule
	 * @return
	 * @throws Exception 
	 */
	public static List<SysFormGeneralParamCache>  getGenralParamsBySql(String sql,SysRuleCache rule){
		
		List<SysFormGeneralParamCache>  list = new ArrayList<SysFormGeneralParamCache>();
		/*String  reg = "\\[m:[^\\[\\]:]*\\]"; //[m:xx].*的处理
		Pattern p = Pattern.compile(reg);
        Matcher m = p.matcher(sql);
        //log.info(sql);
        while(m .find()){
     	   String ret = m.group();
     	   String sqlParamsName = ret.substring(3,ret.length()-1);
     	   String paramIdStr = sqlParamsName.substring(sqlParamsName.lastIndexOf("_")+1, sqlParamsName.length());
     	   long paramId = 0;
     	   try {
     		  paramId = Long.parseLong(paramIdStr);
     	   }catch (Exception e) {
			// TODO: handle exception
     		   String errorstr = "规则id为："+rule.getRuleId()+",sql为："+sql+" ,解析其中参数:"+sqlParamsName+"出错，无法转换为数字类型。";
     		   //log.error(errorstr);
     	   }
     	  ISysFormGeneralParamService service = (ISysFormGeneralParamService)ApplicationContextFactory.getContext().getBean("ISysFormGeneralParamService");
     	  Map obj = service.loadGeneralParamInfoById(paramId);
     	  SysFormGeneralParamCache general = new SysFormGeneralParamCache(obj);
     	  long pk = general.getParamId();
     	  boolean flag = false;
     	  for(int i=0; i<list.size(); i++){
     		  long tempid = list.get(i).getParamId();
     		  if(tempid==pk){
     			 flag = true;
     			 break;
     		  }
     	  }
     	  if(flag==false){
     		  list.add(general);
     	  }
     	 flag = false;
        }*/
		return list;
	}
	
	/**
	 * 解析参数信息
	 * @param sql
	 * @param rule
	 * @return
	 */
	public static List<SysSqlParamsCache>  getSysSqlParamsBySql(String sql,SysRuleCache rule){
		
		List<SysSqlParamsCache>  list = new ArrayList<SysSqlParamsCache>();
		String  reg = "\\[p:[^\\[\\]:]*\\]"; //[p:xx].*的处理
		Pattern p = Pattern.compile(reg);
        Matcher m = p.matcher(sql);
        while(m .find()){
     	   String ret = m.group();
     	   String sqlParamsName = ret.substring(3,ret.length()-1);
     	   //System.out.println(sqlParamsName);
     	   SysSqlParamsCache sparam = new SysSqlParamsCache(0,sqlParamsName);
     	   int flag = 0;
     	   for(int i=0; i<list.size(); i++){
     		   long paramsId = list.get(i).getSqlParamsId();
     		   long pk = sparam.getSqlParamsId();
     		   if(paramsId==pk){
     			  flag = 1;
     			   break;
     		   }
     	   }
     	   if(flag==0){
     		   list.add(sparam);
     	   }
        }
		return list;
	}
	
	/**
	 * 实体sql转换为可执行sql
	 * @param entitySql
	 * @return
	 * @throws Exception 
	 */
	public static String converSql(String entitySql) throws Exception{	
		if(entitySql==null){
			return null;
		}
		//IsysEntitySqlUtil service = (IsysEntitySqlUtil)ApplicationContextFactory.getContext().getBean("EntitySqlBean");
		String result = new String(entitySql);
		
		//获取所有实体字段名并替换为表字段名
		String reg = "\\[[^\\[\\]\\.]*\\]\\.{1}\\[[^\\[\\]\\.]*\\]"; //[xx].[yy]的处理
		Pattern p = Pattern.compile(reg);
        Matcher m = p.matcher(result);
        
       /* while(m .find()){
        	   String ret = m.group();
        	   String[] arr = ret.split("\\.");
        	   String tableChinesName = arr[0].substring(1,arr[0].indexOf("]"));
        	   String columnChinaname = arr[1].substring(1,arr[1].indexOf("]"));
        	   
        	   List<Map> obj =  service.queryColumnByColumnChinaname(columnChinaname, tableChinesName);
          		if(obj.size()==0){
          			throw new Exception("通过实体中文名:\""+tableChinesName+"\"和字段中文名\""+columnChinaname+"\"无法获取对应的数据库字段名!");
          		}
          		String fieldTablename = (String) obj.get(0).get("FIELD_TABLENAME");
          		String entityTableName = (String) obj.get(0).get("ENTITY_TABLENAME");
          		result = result.replace(""+ret+"",entityTableName+"."+fieldTablename);
    		  // result = result.replace(""+ret+"",ss+".*");
        }
        
        reg = "\\[[^c:^p:^k:^m:^\\[\\]\\.]*\\]"; //[xx].*的处理
        p = Pattern.compile(reg);
        m = p.matcher(result);
        while(m .find()){
     	   String ret = m.group();
     	   String[] arr = ret.split("\\.");
     	   String tableChinesName = arr[0].substring(1,arr[0].indexOf("]"));
     	   String tname = service.getEntityTablenameByChinanameStr(tableChinesName);
       		result = result.replace(""+ret+"",tname+"");
 		  // result = result.replace(""+ret+"",ss+".*");
        }*/
        
       
		return result;
	}
	
	/**
	 * 处理SysRule sql参数
	 *
	 */
	public static void dealRuleSolutionParam(List<String[]> params ,String entitySql){
		
		String  reg = "\\[[srnck]{1}:[^\\]]+\\]"; //参数的处理
		Pattern p = Pattern.compile(reg);
        Matcher m = p.matcher(entitySql);
        List<String[]> params2 = new ArrayList<String[]>();
        while(m .find()){
      	   String ret = m.group();
      	   ret = ret.substring(1,ret.length()-1);
      	   String[] arr = ret.split(":");
      	   if(!"n".equals(arr[0])){
      		   boolean repeated = false;
      		   for(int i=0;i<params.size(); i++){
      			   String[] temparr = params.get(i);
      			   if(temparr[0].equals(arr[0]) && temparr[1].equals(arr[1])) {
      				   repeated = true;
      				   break;
      			   }
      		   }
      		   if(repeated == false){
      			   	params.add(arr);
      		   }
      	   }else {
      		   params2.add(arr);
      	   }
        }
        //排序  类型为n的排最后
        params.addAll(params2);
	}
	
	
	/**
	 * 处理参数数sql参数
	 *
	 */
	public static void dealTreeSolutionParam(List<String[]> params ,String entitySql){
		if(entitySql==null){
			return ;
		}
		
		String  reg = "\\[[asrnck]{1}:[^\\]]+\\]"; //参数的处理
		Pattern p = Pattern.compile(reg);
        Matcher m = p.matcher(entitySql);
        List<String[]> params2 = new ArrayList<String[]>();
        while(m .find()){
      	   String ret = m.group();
      	   ret = ret.substring(1,ret.length()-1);
      	   String[] arr = ret.split(":");
      	   if(!"n".equals(arr[0])){
      		   boolean repeated = false;
      		   for(int i=0;i<params.size(); i++){
      			   String[] temparr = params.get(i);
      			   if(temparr[0].equals(arr[0]) && temparr[1].equals(arr[1])) {
      				   repeated = true;
      				   break;
      			   }
      		   }
      		   if(repeated == false){
      			   	params.add(arr);
      		   }
      	   }else {
      		   params2.add(arr);
      	   }
        }
        //排序  类型为n的排最后
        params.addAll(params2);
	}
	
	public static void main(String[] args) {
		String sql = "select [考勤组织单元管理表].* from [考勤组织单元管理表] where [考勤组织单元管理表].[公司id] = [s:userId] and [考勤组织单元管理表].[班组] = [r:srs]";
		dealTreeSolutionParam(null,sql);
	}
	
}
