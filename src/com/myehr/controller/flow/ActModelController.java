package com.myehr.controller.flow;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.myehr.common.exception.DcfException;
import com.myehr.common.mybatis.MybatisUtil;
import com.myehr.common.mybatis.Pager;
import com.myehr.common.util.MapUtil;
import com.myehr.controller.form.parambean.CardformInitDataParams;
import com.myehr.mapper.activiti.ActReModelMapper;
import com.myehr.mapper.formmanage.form.SysFormColumnMapper;
import com.myehr.pojo.activiti.ActReModel;
import com.myehr.pojo.activiti.ActReModelExample;
import com.myehr.pojo.formmanage.form.SysFormColumn;
import com.myehr.pojo.formmanage.form.SysFormColumnExample;
import com.myehr.service.flow.ActModelService;
import com.myehr.service.flow.ActTaskService;
import com.myehr.service.formmanage.form.ISysformconfigService;
import com.myehr.test.dao.TMapperExt;

/**
 * 流程模型相关Controller
 * @author zf
 * @version 2017-1-03
 */
@Controller
@RequestMapping(value = "act/model")
public class ActModelController {
	private static Logger logger = LoggerFactory.getLogger(ActModelController.class);

	@Autowired
	private ActModelService actModelService;
	
	@Autowired
	private ActTaskService actTaskService;
	
	@Autowired
	private  ActReModelMapper actReModelMapper;

	@Autowired
	private ISysformconfigService sysformconfigService;
	//@Autowired
	@Resource(name = "TMapperExt")
	private  TMapperExt tMapperExt;
	
	@Autowired
	private  SysFormColumnMapper sysFormColumnMapper;
	
	protected static String adminPath = "";

	/**
	 * 流程模型列表
	 */
	@RequiresPermissions("act:model:edit")
	@RequestMapping(value = { "list", "" })
	public String modelList(String category, HttpServletRequest request, HttpServletResponse response, Model model) {
		/*Page<org.activiti.engine.repository.Model> page = actModelService.modelList(
				new Page<org.activiti.engine.repository.Model>(request, response), category);*/
		//model.addAttribute("page", page);
		model.addAttribute("category", category);
		return "modules/act/actModelList";
	}

	/**
	 * 创建模型
	 */
	@RequiresPermissions("act:model:edit")
	@RequestMapping(value = "create", method = RequestMethod.GET)
	public String create(Model model) {
		return "modules/act/actModelCreate";
	}
	
	/**
	 * 创建模型
	 */
	@RequiresPermissions("act:model:edit")
	@RequestMapping(value = "create", method = RequestMethod.POST)
	public void create(String name, String key, String description, String category,
			HttpServletRequest request, HttpServletResponse response) {
		try {
			org.activiti.engine.repository.Model modelData = actModelService.create(name, key, description, category);
			response.sendRedirect(request.getContextPath() + "/act/process-editor/modeler.jsp?modelId=" + modelData.getId());
		} catch (Exception e) {
			e.printStackTrace();logger.error(e.getMessage(),e);
			//logger.error("创建模型失败：", e);
		}
	}

	/**
	 * 根据Model部署流程
	 */
	@RequiresPermissions("act:model:edit")
	@RequestMapping(value = "deploy")
	@ResponseBody
	public String deploy(String id, RedirectAttributes redirectAttributes) {
		String message = actModelService.deploy(id);
		
		String deleteSql = "delete from MODEL_NODE_SEQ where MODEL_PRO_DEF = '"+id+"'";
		try {
			MybatisUtil.delete("runtime.deleteSql", deleteSql);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		String sql = "select ACT_RE_PROCDEF.ID_ as processDefinitionId from ACT_RE_PROCDEF left join ACT_RE_MODEL on ACT_RE_PROCDEF.KEY_ = ACT_RE_MODEL.KEY_ where ACT_RE_MODEL.ID_ = '"+id+"' order by ACT_RE_PROCDEF.VERSION_ desc";
		List<Map> datas = null;
		try {
			datas = MybatisUtil.queryList("runtime.selectSql", sql);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();logger.error(e.getMessage(),e);
		}
		List<Map> maps = actTaskService.getNextNode(id,datas.get(0).get("processDefinitionId")+"");
		for (int i = 0; i < maps.size(); i++) {
			String sql1 = "insert into MODEL_NODE_SEQ (MODEL_NODE,MODEL_PRE_NODE,MODEL_PRO_DEF,MODEL_NAME,MODEL_PRE_NAME) values ('"+maps.get(i).get("nowNode")+"','"+maps.get(i).get("preNode")+"','"+maps.get(i).get("DefinitionId")+"','"+maps.get(i).get("nowName")+"','"+maps.get(i).get("preName")+"')";
			try {
				MybatisUtil.insert("runtime.insertSql", sql1);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();logger.error(e.getMessage(),e);
				throw new DcfException(e);
			}
		}
		redirectAttributes.addFlashAttribute("message", message);
		try {
//			sysformconfigService.setActModelByKey("");
			sysformconfigService.setNodeByModelId(id);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "success";
	}
	
	/**
	 * 导出model的xml文件
	 */
	@RequiresPermissions("act:model:edit")
	@RequestMapping(value = "export")
	public void export(String id, HttpServletResponse response) {
		actModelService.export(id, response);
	}

	/**
	 * 更新Model分类
	 */
	@RequiresPermissions("act:model:edit")
	@RequestMapping(value = "updateCategory")
	public String updateCategory(String id, String category, RedirectAttributes redirectAttributes) {
		actModelService.updateCategory(id, category);
		redirectAttributes.addFlashAttribute("message", "设置成功，模块ID=" + id);
		return "redirect:" + adminPath + "/act/model";
	}
	
	/**
	 * 删除Model
	 * @param id
	 * @param redirectAttributes
	 * @return
	 */
	@RequiresPermissions("act:model:edit")
	@RequestMapping(value = "delete")
	@ResponseBody
	public String delete(String id, RedirectAttributes redirectAttributes) {
		actModelService.delete(id);
		redirectAttributes.addFlashAttribute("message", "删除成功，模型ID=" + id);
		return "success";
	}
	
	/**
	 * 查询modelList
	 * @return
	 */
	@RequestMapping("/searchActModelList")
	public @ResponseBody ResultListMap search(HttpServletRequest request, @RequestBody CardformInitDataParams params) throws Exception{
		String offset = params.getOffset();
		String limit = params.getLimit();
		Pager page = params.getPage();
		page = new Pager();
		HttpSession session = request.getSession();
		String userId = session.getAttribute("userid")+"";
		if(offset==null&&limit==null){
			
		}else {
			int start=Integer.parseInt(offset);
			page.setStart(start); //不能设置为0
			page.setLimt(Integer.parseInt(limit));
		}
		
		Map requestParam = params.getRequestParam();
		String flowType = (String)requestParam.get("flowType");
		String flowTypeSql = "";
		if (flowType.equals("0")) {
			
		} else {
			flowTypeSql = "and act_re_model.CATEGORY_ ="+flowType ;
		}
		String sql = "";
		if (userId.equals("1")) {//userId.equals("1")e
			sql = "select distinct * from (select act_re_model.ID_ as id, " +
					" act_re_model.REV_ as rev, " +
					" act_re_model.NAME_ as name, " +
					" act_re_model.KEY_ as key_, " +
					" act_re_model.CATEGORY_ category, " +
					" act_re_model.CREATE_TIME_ as createTime, " +
					" act_re_model.LAST_UPDATE_TIME_ as lastUpdateTime, " +
					" act_re_model.VERSION_ as version, " +
					" act_re_model.META_INFO_ as metaInfo, " +
					" act_re_model.DEPLOYMENT_ID_ as deoloymentId, " +
					" act_re_model.EDITOR_SOURCE_VALUE_ID_ as editorSourceValueId, " +
					" act_re_model.EDITOR_SOURCE_EXTRA_VALUE_ID_ as editorSourceExtraValueId, " +
					" act_re_model.TENANT_ID_ as tenantId, " +
					" act_node_properties_expand.ACT_NODE_FORM_ID as actNodeFormId " +
					" from act_re_model left join act_node_properties_expand on act_re_model.id_ = act_node_properties_expand.ACT_MODEL_ID" +
					" where act_node_properties_expand.ACT_NODE_KEY = 'start' "+flowTypeSql+ 
					" union select act_re_model.ID_ as id, " +
					" act_re_model.REV_ as rev, " +
					" act_re_model.NAME_ as name, " +
					" act_re_model.KEY_ as key_, " +
					" act_re_model.CATEGORY_ category, " +
					" act_re_model.CREATE_TIME_ as createTime, " +
					" act_re_model.LAST_UPDATE_TIME_ as lastUpdateTime, " +
					" act_re_model.VERSION_ as version, " +
					" act_re_model.META_INFO_ as metaInfo, " +
					" act_re_model.DEPLOYMENT_ID_ as deoloymentId, " +
					" act_re_model.EDITOR_SOURCE_VALUE_ID_ as editorSourceValueId, " +
					" act_re_model.EDITOR_SOURCE_EXTRA_VALUE_ID_ as editorSourceExtraValueId, " +
					" act_re_model.TENANT_ID_ as tenantId, " +
					" act_node_properties_expand.ACT_NODE_FORM_ID as actNodeFormId " +
					" from act_re_model left join act_node_properties_expand on act_re_model.id_ = act_node_properties_expand.ACT_MODEL_ID" +
					" where act_re_model.ID_ not in( select ACT_MODEL_ID from act_node_properties_expand ) "+flowTypeSql+
					") t";
		} else {
			sql = "select distinct * from (select act_re_model.ID_ as id, " +
					" act_re_model.REV_ as rev, " +
					" act_re_model.NAME_ as name, " +
					" act_re_model.KEY_ as key_, " +
					" act_re_model.CATEGORY_ category, " +
					" act_re_model.CREATE_TIME_ as createTime, " +
					" act_re_model.LAST_UPDATE_TIME_ as lastUpdateTime, " +
					" act_re_model.VERSION_ as version, " +
					" act_re_model.META_INFO_ as metaInfo, " +
					" act_re_model.DEPLOYMENT_ID_ as deoloymentId, " +
					" act_re_model.EDITOR_SOURCE_VALUE_ID_ as editorSourceValueId, " +
					" act_re_model.EDITOR_SOURCE_EXTRA_VALUE_ID_ as editorSourceExtraValueId, " +
					" act_re_model.TENANT_ID_ as tenantId, " +
					" act_node_properties_expand.ACT_NODE_FORM_ID as actNodeFormId " +
					" from act_re_model left join act_node_properties_expand on act_re_model.id_ = act_node_properties_expand.ACT_MODEL_ID" +
					" where act_node_properties_expand.ACT_NODE_KEY = 'start' "+flowTypeSql+ 
					" and act_re_model.id_ in (SELECT ACTID FROM SYS_ACT_ROLE WHERE SYS_ACT_ROLE.ROLEID in (SELECT role_id from SYS_USER_ROLE where USER_ID = "+userId+"))"+
					" union select act_re_model.ID_ as id, " +
					" act_re_model.REV_ as rev, " +
					" act_re_model.NAME_ as name, " +
					" act_re_model.KEY_ as key_, " +
					" act_re_model.CATEGORY_ category, " +
					" act_re_model.CREATE_TIME_ as createTime, " +
					" act_re_model.LAST_UPDATE_TIME_ as lastUpdateTime, " +
					" act_re_model.VERSION_ as version, " +
					" act_re_model.META_INFO_ as metaInfo, " +
					" act_re_model.DEPLOYMENT_ID_ as deoloymentId, " +
					" act_re_model.EDITOR_SOURCE_VALUE_ID_ as editorSourceValueId, " +
					" act_re_model.EDITOR_SOURCE_EXTRA_VALUE_ID_ as editorSourceExtraValueId, " +
					" act_re_model.TENANT_ID_ as tenantId, " +
					" act_node_properties_expand.ACT_NODE_FORM_ID as actNodeFormId " +
					" from act_re_model left join act_node_properties_expand on act_re_model.id_ = act_node_properties_expand.ACT_MODEL_ID" +
					" where act_re_model.ID_ not in( select ACT_MODEL_ID from act_node_properties_expand ) "+flowTypeSql+
					" and act_re_model.id_ in (SELECT ACTID FROM SYS_ACT_ROLE WHERE SYS_ACT_ROLE.ROLEID in (SELECT role_id from SYS_USER_ROLE where USER_ID = "+userId+"))"+
					") t";
		}
		
		List<Map> lists = tMapperExt.queryByFormDefSql(sql);
		//List<ActReModel> list = actReModelMapper.selectByExample(example);
		ResultListMap result = new ResultListMap();
		
		List<Map> mapList = new ArrayList<Map>();
		int end = 0;
		if (page.getStart()+page.getLimt()>lists.size()) {
			end = lists.size();
		}else {
			end = page.getStart()+page.getLimt();
		}
		
		for (int i = page.getStart(); i < end; i++) {
			mapList.add(lists.get(i));
		}
		
		result.setRows(mapList);
		result.setTotal(lists.size());
		return  result;
	}
	
	
	/**
	 * 查询表单参数
	 * @return
	 */
	@RequestMapping("/searchFormParamList")
	public @ResponseBody ResultListMap searchFormParamList(HttpServletRequest request, @RequestBody CardformInitDataParams params) throws Exception{
		String offset = params.getOffset();
		String limit = params.getLimit();
		String formId = params.getFormId();
		
		//Map paramsMap = params.getParamsMap();
		Pager page = params.getPage();
		page = new Pager();
		if(offset==null&&limit==null){
			
		}else {
			int start=Integer.parseInt(offset);
			page.setStart(start); //不能设置为0
			page.setLimt(Integer.parseInt(limit));
		}
		
		SysFormColumnExample example = new SysFormColumnExample();
		com.myehr.pojo.formmanage.form.SysFormColumnExample.Criteria criteria = example.createCriteria();
		criteria.andFormColumnFormDefIdEqualTo(new BigDecimal(formId));
		List<SysFormColumn> list = sysFormColumnMapper.selectByExample(example);
		ResultListMap result = new ResultListMap();
		
		List<Map> mapList = new ArrayList<Map>();
		int end = 0;
		if (page.getStart()+page.getLimt()>list.size()) {
			end = list.size();
		}else {
			end = page.getStart()+page.getLimt();
		}
		
		for (int i = page.getStart(); i < end; i++) {
			mapList.add(MapUtil.ConvertObjToMap(list.get(i)));
		}
		
		result.setRows(mapList);
		result.setTotal(list.size());
		return  result;
	}
	
	/**
	 * 查询表单参数
	 * @return
	 */
	@RequestMapping("/searchSessionParamList")
	public @ResponseBody ResultListMap searchSessionParamList(HttpServletRequest request, @RequestBody CardformInitDataParams params) throws Exception{
		ResultListMap result = new ResultListMap();
		
		List<Map> mapList = new ArrayList<Map>();
		
		Map map = new HashMap();
		map.put("formFieldTablename", "userid");
		map.put("formColumnLable", "用户id");
		Map map1 = new HashMap();
		map1.put("formFieldTablename", "userCode");
		map1.put("formColumnLable", "用户编码");
		Map map2 = new HashMap();
		map2.put("formFieldTablename", "userName");
		map2.put("formColumnLable", "用户姓名");
		Map map3 = new HashMap();
		map3.put("formFieldTablename", "userPassword");
		map3.put("formColumnLable", "用户密码");
		Map map4 = new HashMap();
		map4.put("formFieldTablename", "langType");
		map4.put("formColumnLable", "语言类型");
		mapList.add(map);
		mapList.add(map1);
		mapList.add(map2);
		mapList.add(map3);
		mapList.add(map4);
		
		
		
		result.setRows(mapList);
		result.setTotal(5);
		return  result;
	}
}
