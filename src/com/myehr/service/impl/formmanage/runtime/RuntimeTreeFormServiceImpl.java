package com.myehr.service.impl.formmanage.runtime;

import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myehr.common.exception.DcfException;
import com.myehr.common.mybatis.MybatisUtil;
import com.myehr.common.util.ChangeCode;
import com.myehr.controller.form.FormController;
import com.myehr.pojo.formmanage.cache.SysFormTreeSolutionCache;
import com.myehr.pojo.formmanage.cache.SysFormconfigCache;
import com.myehr.pojo.formmanage.cache.SysFormconfigTreeCache;
import com.myehr.service.formmanage.form.IFormService;
import com.myehr.service.formmanage.form.ISysformconfigService;
import com.myehr.service.formmanage.runtime.IRuntimeTreeFormService;
import com.myehr.service.impl.formmanage.form.SysformconfigService;


/**
 * 树方案
 * @author Administrator
 *
 */
@Service
public class RuntimeTreeFormServiceImpl  implements IRuntimeTreeFormService {
//	@Autowired
	@Resource(name = "IFormService")
	private IFormService formService;

	@Autowired ISysformconfigService sysformconfigService;

	private static Logger logger = LoggerFactory.getLogger(FormController.class);
	/**
	 * 查询结果
	 * @param formId
	 * @param params
	 * @return
	 * @throws Exception 
	 * @throws DcfException 
	 */
	public List<Map> querySqlResult(String formId,String paramsJson,HttpServletRequest request) throws DcfException, Exception{
		long start = new Date().getTime();
		
		//获取树对象
		SysFormconfigCache form = formService.getForm(formId);
		SysFormconfigTreeCache tree = form.getTree();
		Map<String,Object> p = null;
		p = RuntimeUtil.jsonToMap(paramsJson);
		if("1".equals(tree.getFormTreeType())){
			SysFormTreeSolutionCache s = sysformconfigService.getTreeSolutionById(tree.getFormTreeSolutionId());
			String sql = s.getTreeSolutionExcSql();
			List<String[]> ps = tree.getSolution().getParams();
			for(int i=0; i<ps.size(); i++){
				String[] temp = ps.get(i);
				String key = temp[0]+"_"+temp[1];
				String value = (String)p.get(key);
				if(value ==null){
					return null;
				}
				
				String rstr = "["+temp[0]+":"+temp[1]+"]";
				while(sql.indexOf(rstr)>=0){
					sql = sql.replace(rstr, value);
				}
			}
			logger.info("**********************************树1******"+(new Date().getTime()-start)+"mS******************************************");
			if("true".equals(tree.getFormIsLazy())){
				String id = request.getParameter(ChangeCode.getUniqueCode(s.getColumns().get(0).getPojo().getTreeEntityTablename(),tree.getTree().getFormTreeIdField()));
				if (id==null) {
					id = "null";
					sql = sql.replaceAll("\\[id\\]",id);
					
				}else {
					sql = sql.replaceAll("\\[id\\]","'"+id+"'");
				}
				logger.info(sql);
				List<Map> dataObject = MybatisUtil.queryList("runtime.selectSql", sql);
				for(int i=0; i<dataObject.size(); i++){
					if(dataObject.get(i).get("icon")!=null){
						String icon = (String)dataObject.get(i).get("icon");
						dataObject.get(i).put("iconSkin","fa fa-"+icon.split("_")[1] ); 
					}
					dataObject.get(i).put("isParent", true); 
					dataObject.get(i).put("open", false); 
					//图标
				}
				logger.info("**********************************树2懒******"+(new Date().getTime()-start)+"mS******************************************");
				return dataObject;
			}else{
				logger.info(sql);
				List<Map> dataObject = MybatisUtil.queryList("runtime.selectSql", sql);
				for(int i=0; i<dataObject.size(); i++){
					if(dataObject.get(i).get("icon")!=null&&!dataObject.get(i).get("icon").equals("null")&&!dataObject.get(i).get("icon").equals("")){
						String icon = (String)dataObject.get(i).get("icon");
						dataObject.get(i).put("iconSkin","fa fa-"+icon.split("_")[1] ); 
					}
					dataObject.get(i).put("isParent", false); 
					dataObject.get(i).put("open", false); 
					//图标
				}
				logger.info("**********************************树2非懒数据查询******"+(new Date().getTime()-start)+"mS******************************************");
				return dataObject;
			}
		}
		return null;
	}
	
	
}
