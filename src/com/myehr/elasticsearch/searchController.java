package com.myehr.elasticsearch;

/**
 * 
 */

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.fastjson.JSON;


/**
 * @author Administrator
 * @date 2018-03-14 17:01:00
 *
 */

public class searchController {
	private static Logger logger = LoggerFactory.getLogger(searchController.class);
	public static final int defaultPageSize=10;
	public static final int defaultFrom =0;
	private static String json;
	/**
	 * 初始化索引表
	 * @param args
	 * @author Administrator
	 * @throws IOException 
	 * @throws ClientProtocolException 
	 */
	public static void initIndex() throws ClientProtocolException, IOException {
		// TODO 自动生成的方法存根
		String resourceJson= " { \"settings\": { \"analysis\": { \"analyzer\": { \"ik\": { \"tokenizer\": \"ik_smart\" } } } }, \"mappings\": { \"infomation\": { \"dynamic\": true, \"properties\": { \"content\": { \"type\": \"text\", \"analyzer\": \"ik_smart\" }, \"title\": { \"type\": \"text\", \"analyzer\": \"ik_smart\" }, \"businessType\": { \"type\": \"keyword\", \"index\": \"not_analyzed\" }, \"bussinessId\": { \"type\": \"keyword\", \"index\": \"not_analyzed\" }, \"tenantID\": { \"type\": \"keyword\", \"index\": \"not_analyzed\" }, \"tenantName\": { \"type\": \"keyword\", \"index\": \"not_analyzed\" }, \"infoType\": { \"type\": \"keyword\", \"index\": \"not_analyzed\" }, \"infoTypeName\": { \"type\": \"keyword\", \"index\": \"not_analyzed\" }, \"createOrgId\": { \"type\": \"keyword\", \"index\": \"not_analyzed\" }, \"createOrgName\": { \"type\": \"keyword\", \"index\": \"not_analyzed\" }, \"createEmpId\": { \"type\": \"keyword\", \"index\": \"not_analyzed\" }, \"createEmpName\": { \"type\": \"keyword\", \"index\": \"not_analyzed\" }, \"createTime\": { \"type\": \"keyword\", \"index\": \"not_analyzed\" }, \"url\": { \"type\": \"keyword\", \"index\": \"not_analyzed\" }, \"imageUrl\": { \"type\": \"keyword\", \"index\": \"not_analyzed\" } ,\"other\": { \"type\": \"keyword\", \"index\": \"not_analyzed\" }, \"unview\": { \"type\": \"nested\", \"properties\": { \"userid\": { \"type\": \"keyword\", \"index\": \"not_analyzed\" }, \"createOrgId\": { \"type\": \"keyword\", \"index\": \"not_analyzed\" } } } } } } }";
		resourceJson = " { \"settings\": { \"analysis\": { \"analyzer\": { \"ik\": { \"tokenizer\": \"ik_smart\" } } } }, \"mappings\": { \"infomation\": { \"dynamic\": true, \"properties\": { \"content\": { \"type\": \"text\", \"analyzer\": \"ik\" }, \"title\": { \"type\": \"text\", \"analyzer\": \"ik_smart\" }, \"businessType\": { \"type\": \"keyword\", \"index\": \"not_analyzed\" }, \"bussinessId\": { \"type\": \"keyword\", \"index\": \"not_analyzed\" }, \"tenantID\": { \"type\": \"keyword\", \"index\": \"not_analyzed\" }, \"tenantName\": { \"type\": \"keyword\", \"index\": \"not_analyzed\" }, \"infoType\": { \"type\": \"keyword\", \"index\": \"not_analyzed\" }, \"infoTypeName\": { \"type\": \"keyword\", \"index\": \"not_analyzed\" }, \"createOrgId\": { \"type\": \"keyword\", \"index\": \"not_analyzed\" }, \"createOrgName\": { \"type\": \"keyword\", \"index\": \"not_analyzed\" }, \"createEmpId\": { \"type\": \"keyword\", \"index\": \"not_analyzed\" }, \"createEmpName\": { \"type\": \"keyword\", \"index\": \"not_analyzed\" }, \"createTime\": { \"type\": \"keyword\", \"index\": \"not_analyzed\" }, \"url\": { \"type\": \"keyword\", \"index\": \"not_analyzed\" }, \"imageUrl\": { \"type\": \"keyword\", \"index\": \"not_analyzed\" } ,\"other\": { \"type\": \"keyword\", \"index\": \"not_analyzed\" } ,\"orgids\":  { \"type\": \"text\", \"analyzer\": \"ik\"} ,\"userids\": { \"type\": \"text\", \"analyzer\": \"ik\"}} } } }";
		logger.info(resourceJson);
		CloseableHttpClient httpclient = HttpClients.createDefault();  
		HttpPut httpput = new HttpPut("http://localhost:9200/oaallzh");
		//HttpPost httppost = new HttpPost("http://localhost:9200/hnnxoa");  
		httpput.setEntity(new StringEntity(resourceJson,"UTF-8"));  
         CloseableHttpResponse response = httpclient.execute(httpput);  
         try {  
             HttpEntity entity = response.getEntity(); 
             String result=EntityUtils.toString(entity, "UTF-8");
             if (entity != null) {  
                 logger.info("--------------------------------------");  
                 logger.info("Response content: " +result);  
                 logger.info("--------------------------------------");  
             }  
         } finally {  
             response.close();  
         }  
	}
	
	public static void main(String[] args) throws Exception {
	    initIndex();//初始化
		createIndex(); //创建索引数据
		queryIndexs(null);
		queryIndexsByDSL(null,100,0);
	}
	
	/**
	 * 创建索引
	 * @param index
	 * @param type
	 * @param id
	 * @param resourceJson
	 * @return
	 * @throws Exception 
	 */
	public static String createIndex() throws Exception {
		//要实现角色和人员权限的查询就要利用index和type 把index 当做角色把type当做人员  用field的查询是无法实现的默认指定了field就会要求全匹配而不是检索了
		 String indexUrl="http://localhost:9200/oaallsearch/infomation/10056";
		 String jsonArray="http://localhost:8080/myehr/evaluation/findNewsListJson.do";
		 String result  = "";
	  // String resourceJson="{ \"content\": \"做角色把\", \"title\": \"全文检索info22\", \"businessType\": \"2\", \"bussinessId\": \"111\", \"tenantID\": \"1\", \"tenantName\": \"hnnx\", \"infoType\": \"i\", \"infoTypeName\": \"info\", \"createOrgId\": \"1\", \"createOrgName\": \"河南农信\", \"createEmpId\": \"1102\", \"createEmpName\": \"尹恒\", \"createTime\": \"2017-08-22\", \"url\": \"\", \"other\": \"\", \"unview\": [ { \"userid\": \"1103\", \"createOrgId\":null }, { \"userid\": \"1102\", \"createOrgId\": null} ,{ \"userid\": \"1104\", \"createOrgId\": null}] }";
	  // String resourceJson="{ \"content\": \"全文检索字段内容，需要检索info22\", \"title\": \"全文检索info22\", \"businessType\": \"2\", \"bussinessId\": \"111\", \"tenantID\": \"1\", \"tenantName\": \"hnnx\", \"infoType\": \"i\", \"infoTypeName\": \"info\", \"createOrgId\": \"1\", \"createOrgName\": \"河南农信\", \"createEmpId\": \"1102\", \"createEmpName\": \"尹恒\", \"createTime\": \"2017-08-22\", \"url\": \"\", \"other\": \"\", \"unview\": [ { \"userid\": null, \"createOrgId\": \"2\" }, { \"userid\":null, \"createOrgId\": \"1\" } ] }";
	     //String resourceJson="{ \"id\": \"3\", \"code\": \"0023\", \"img\": \"\", \"title\": \"测试3\", \"content\": \"111111\",\"releaser\": \"系统管理员\", \"counts\": \"\", \"releasedate\": \"2018-03-14\",\"enddate\":\"\"}";
		/*数据库动态的传入数据*/
//		 List<Map> rs2 = MybatisUtil.queryList("runtime.selectSql", "select * from SYS_USER");
//		 JSONArray jsonArray = JSONArray.fromObject(rs2);
		 String resourceJson=jsonArray.toString();
	    // String resourceJson="{\"id\": \"3\", \"code\": \"0023\", \"empName\": \"张三\"}";
		 logger.info("url:"+indexUrl);
		 logger.info("传入数据:"+resourceJson);
		 CloseableHttpClient httpclient = HttpClients.createDefault();  
	        // 创建httppost    
	        HttpPost httppost = new HttpPost(indexUrl);  
	        try {  
	          
	            httppost.setEntity(new StringEntity(resourceJson,"UTF-8"));  
	            CloseableHttpResponse response = httpclient.execute(httppost);  
	            try {  
	                HttpEntity entity = response.getEntity(); 
	                result=EntityUtils.toString(entity, "UTF-8");
	                if (entity != null) {  
	                    logger.info("--------------------------------------");  
	                    logger.info("Response content: " +result);  
	                    logger.info("--------------------------------------");  
	                }  
	            } finally {  
	                response.close();  
	            }  
	        } catch (ClientProtocolException e) {  
	            e.printStackTrace();logger.error(e.getMessage(),e);  
	        } catch (UnsupportedEncodingException e1) {  
	            e1.printStackTrace();  
	        } catch (IOException e) {  
	            e.printStackTrace();logger.error(e.getMessage(),e);  
	        } finally {  
	            // 关闭连接,释放资源    
	            try {  
	                httpclient.close();  
	            } catch (IOException e) {  
	                e.printStackTrace();logger.error(e.getMessage(),e);  
	            }  
	        }  
		return result;
	}
	
	/**
	 * 结构化查询
	 * @param indexes
	 * @param types
	 * @param queryDSL
	 * @return
	 */
	public static String queryIndexsByDSL(String keyword,Integer pageSize,Integer from) {
		String indexUrl="http://localhost:9200/";
		String indexSearch="_all";
		String typeSearch="";
		String[] indexes = {"oaallsearch"};
		String[] types =  {"infomation"};
		if(indexes!=null&&indexes.length>0){
			indexSearch="";
			for(String index:indexes){
				indexSearch+=index+",";
			}
			indexSearch=indexSearch.substring(0,indexSearch.length()-1);
		}
		if(types!=null&&types.length>0){
			for(String type:types){
				typeSearch+=type+",";
			}
			typeSearch=typeSearch.substring(0,typeSearch.length()-1);
		}
		
		indexUrl+=indexSearch;
		if(!"".equals(typeSearch)){
			indexUrl+="/"+typeSearch;
		}
		indexUrl+="/"+"_search";
		//请求ES
		logger.info("ESrequestURL:"+indexUrl);
		//构造查询脚本
		//,{ \"match\": { \"orgids\": \"2,\" } }
		Map<String,Object> queryDSL=packageQueryDSL(keyword,pageSize,from);
		String parameters=JSON.toJSONString(queryDSL);
		//		parameters="{ \"from\":0, \"query\": { \"bool\": { \"must\": { \"match\": { \"title\": \"测试\" } }, \"filter\": { \"nested\": { \"path\": \"unview\", \"score_mode\": \"avg\", \"query\": { \"bool\": { \"should\": [ { \"bool\": { \"must\": [ { \"match\": { \"unview.userid\": \"2098\" } } ] } }, { \"bool\": { \"must\": [ { \"match\": { \"unview.createOrgId\": \"2\" } } ] } } ] } } } } } },\"size\":20 }";

	    //parameters="{ \"from\":0, \"query\": { \"bool\": { \"must\":[ { \"match\":{ \"match\": { \"title\": \"2098,\" } }]} } },\"size\":20 }";
		//parameters = " {\"from\":0,\"query\": {\"bool\":{\"must\":[{\"match\":{\"content	\":\"权限\"}},{\"bool\":{\"should\":[{\"bool\":{\"must\":[{\"match\":{\"userids\":\"2098,\"}}]}},{\"bool\":{\"must\":[{\"match\":{\"orgids\":\"2,\"}}]}}]}}]}},\"size\":20 }";
	    //parameters = "{\"from\":0,\"highlight\":{\"fields\":{\"*\":{}}}, \"query\": { \"bool\": { \"must\": [{\"match\":{\"content\":\"权限\"}},{\"bool\":{\"should\":[{\"bool\":{\"must\":[{\"match\":{\"userids\":\"2098\"}}]}},{\"bool\":{\"must\":[{\"match\":{\"orgids\":\"2\"}}]}}]}}], \"filter\": {\"nested\": {\"path\": \"unview\", \"score_mode\": \"avg\", \"query\": { \"bool\": { \"should\": [] } } } }} },\"size\":5}";
		//parameters= "{ \"from\": 0, \"query\": { \"bool\": { \"must\": [ { \"match\": { \"businessType\": \"1\" } }, { \"match\": { \"tenantId\": \"2\" } } ], \"filter\": { \"nested\": { \"path\": \"unview\", \"score_mode\": \"avg\", \"query\": { \"bool\": { \"should\": [ { \"bool\": { \"must\": [ { \"match\": { \"unview.createOrgId\": \"2\" } } ] } } ] } } } } } }, \"size\": 10 }";
		//parameters= "{ \"from\": 0, \"query\": { \"bool\": { \"must\": [ { \"match\": { \"businessType\": \"1\" } }, { \"match\": { \"tenantId\": \"2\" } } ], \"filter\": { \"nested\": { \"path\": \"unview\", \"score_mode\": \"avg\", \"query\": { \"bool\": { \"should\": [ { \"bool\": { \"must\": [ { \"match\": { \"unview.createOrgId\": \"2\" } } ] } } ] } } } } } },size:10}";
		//parameters = "{\"from\":0,\"highlight\":{\"fields\":{\"*\":{}}}, \"query\": { \"bool\": { \"must\": [{\"match\":{\"content\":\"权限\"}}], \"filter\": {\"nested\": {\"path\": \"unview\", \"score_mode\": \"avg\", \"query\": { \"bool\": { \"should\": [{ \"bool\":{ \"must\":[ { \"match\": {\"unview.userid\":\"2098\"}} ] } }] } } } }} },\"size\":5}";
		//parameters = "{\"from\":0,\"highlight\":{\"fields\":{\"*\":{}}}, \"query\": { \"bool\": { \"must\": [{\"match\":{\"content\":\"权限\"}}], \"filter\": {\"nested\": {\"path\": \"unview\", \"score_mode\": \"avg\", \"query\": { \"bool\": { \"should\": [{ \"bool\":{ \"must\":[ { \"match\": {\"unview.userid\":\"2098\"}} ] } },{ \"bool\": { \"must\": [ { \"match\": {\"unview.createOrgId\":\"2\"} } ] } } ] } } } }} },\"size\":5}";
		//parameters = "{\"from\":0,\"highlight\":{\"fields\":{\"*\":{}}}, \"query\": { \"bool\": { \"must\": [{\"match\":{\"content\":\"权限\"}}], \"filter\": {\"nested\": {\"path\": \"unview\", \"score_mode\": \"avg\", \"query\": { \"bool\": { \"should\": [{ \"bool\":{ \"must\":[ { \"match\": {\"unview.userid\":\"2098\"}},{ \"match\": {\"unview.createOrgId\":\"2\"} } ] } } ] } } } }} },\"size\":5}";

		//parameters = " {\"from\":0,\"query\":{\"bool\":{\"must\":[{\"match\":{\"content\":\"权限\"}},{\"bool\":{\"should\":[{\"bool\":{\"must\":[{\"wildcard\":{\"userids\":\"2030\"}}]}},{\"bool\":{\"must\":[{\"match\":{\"orgids\":\"2,\"}}]}}]}}]}},\"size\":20 }";
		//parameters = "{\"from\":0, \"query\": { \"bool\": { \"must\": [{\"match\":{\"code\":\"002\"}},{\"bool\":{\"should\":[{\"bool\":{\"must\":[{\"match\":{\"title\":\"测试3\"}}]}}]}}]} },\"size\":5}";
		logger.info("Query DSL:"+parameters);
		 	String result="";
		 	CloseableHttpClient httpclient = HttpClients.createDefault();  
	        // 创建httppost    
	        HttpPost httppost = new HttpPost(indexUrl);
	        httppost.addHeader("Content-type","application/json; charset=utf-8");  
	        httppost.setHeader("Accept", "application/json");  
	        httppost.setEntity(new StringEntity(parameters, Charset.forName("UTF-8")));  
	        try {  
	          
	            //httppost.setEntity(new StringEntity(resourceJson,"UTF-8"));  
	            CloseableHttpResponse response = httpclient.execute(httppost);  
	            try {  
	                HttpEntity entity = response.getEntity(); 
	                result=EntityUtils.toString(entity, "UTF-8");
	                if (entity != null) {  
	                    logger.info("--------------------------------------");  
	                    logger.info("Response content: " +result);  
	                    logger.info("--------------------------------------");  
	                }  
	            } finally {  
	                response.close();  
	            }  
	        } catch (ClientProtocolException e) {  
	            e.printStackTrace();logger.error(e.getMessage(),e);  
	        } catch (UnsupportedEncodingException e1) {  
	            e1.printStackTrace();  
	        } catch (IOException e) {  
	            e.printStackTrace();logger.error(e.getMessage(),e);  
	        } finally {  
	            // 关闭连接,释放资源    
	            try {  
	                httpclient.close();  
	            } catch (IOException e) {  
	                e.printStackTrace();logger.error(e.getMessage(),e);  
	            }  
	        }  
		return result;
	}
	
	
	public static Map<String,Object> packageQueryDSL(String keyword,Integer pageSize,Integer from){
		Map<String,Object> queryDSL=new HashMap<String,Object>();//
		Map<String,Object> query=new HashMap<String,Object>();//
		Map<String,Object> bool=new HashMap<String,Object>();//
		List<Map<String,Object>> must=new ArrayList<Map<String,Object>>();//
		List<Map<String,Object>> filter=new ArrayList<Map<String,Object>>();//
		
		if(pageSize==null){
			pageSize=defaultPageSize;
		}
		
		if(from==null){
			from=defaultFrom;
		}
		queryDSL.put("size", pageSize);
		queryDSL.put("from", from);
		//初始化基本查询
		queryDSL.put("query", query);
		query.put("bool", bool);
		bool.put("filter", filter);
		if(!(keyword==null||"".equals(keyword.trim()))){
			bool.put("must", must);
			Map<String,Object> match=new HashMap<String,Object>();
			Map<String,String> fileContent=new HashMap<String,String>();
			fileContent.put("fileContent", keyword);
			match.put("match", fileContent);
			must.add(match);
		}
		String[] btypes = {"2"};
		if(btypes!=null&&btypes.length>0){
			Map<String,Object> terms=new HashMap<String,Object>();//
			Map<String,String[]> t=new HashMap<String,String[]>();//
			t.put("businessType", btypes);
			terms.put("terms", t);
			filter.add(terms);
		}
		return queryDSL;
	}
	/**
	 * 查询索引
	 * @param indexes
	 * @param types
	 * @param keyword
	 * @return
	 */
       
	public static String queryIndexs(String keyword) {
		//要实现角色和人员权限的查询就要利用index和type 把index 当做角色把type当做人员  用field的查询是无法实现的默认指定了field就会要求全匹配而不是检索了
		// GET /twitter/_search?q=user:kimchy
		// GET /twitter/tweet,user/_search?q=user:kimchy
		// GET /kimchy,elasticsearch/tweet/_search?q=tag:wow
		// GET /_all/tweet/_search?q=tag:wow
		// GET /_search?q=tag:wow 
		String indexUrl="http://localhost:9200/";
		String indexSearch="_all";
		String typeSearch="";
		String keywordSearch="*";
		String[] indexes = {"oaallsearch"};
		String[] types =  {"infomation"};
		if(indexes!=null&&indexes.length>0){
			indexSearch="";
			for(String index:indexes){
				indexSearch+=index+",";
			}
			indexSearch=indexSearch.substring(0,indexSearch.length()-1);
		}
		if(types!=null&&types.length>0){
			for(String type:types){
				typeSearch+=type+",";
			}
			typeSearch=typeSearch.substring(0,typeSearch.length()-1);
		}
		if(keyword!=null&&!"".equals(keyword)){
			keywordSearch=keyword;
		}
		indexUrl+=indexSearch;
		if(!"".equals(typeSearch)){
			indexUrl+="/"+typeSearch;
		}
		try {
			keywordSearch=URLEncoder.encode(keywordSearch,"UTF-8");
		} catch (UnsupportedEncodingException e2) {
			// TODO 自动生成的 catch 块
			e2.printStackTrace();
		}
		indexUrl+="/"+"_search?q="+keywordSearch;
		//请求ES
		logger.info("ESrequestURL:"+indexUrl);
		 String result="";
		 CloseableHttpClient httpclient = HttpClients.createDefault();  
	        // 创建httppost    
	        HttpPost httppost = new HttpPost(indexUrl);  
	        try {    
	            //httppost.setEntity(new StringEntity(resourceJson,"UTF-8"));  
	            CloseableHttpResponse response = httpclient.execute(httppost);  
	            try {  
	                HttpEntity entity = response.getEntity(); 
	                result=EntityUtils.toString(entity, "UTF-8");
	                if (entity != null) {  
	                    logger.info("--------------------------------------");  
	                    logger.info("Response content1: " +result);  
	                    logger.info("--------------------------------------");  
	                }  
	            } finally {  
	                response.close();  
	            }  
	        } catch (ClientProtocolException e) {  
	            e.printStackTrace();logger.error(e.getMessage(),e);  
	        } catch (UnsupportedEncodingException e1) {  
	            e1.printStackTrace();  
	        } catch (IOException e) {  
	            e.printStackTrace();logger.error(e.getMessage(),e);  
	        } finally {  
	            // 关闭连接,释放资源    
	            try {  
	                httpclient.close();  
	            } catch (IOException e) {  
	                e.printStackTrace();logger.error(e.getMessage(),e);  
	            }  
	        }  
		return result;
	}

}

