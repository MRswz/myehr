package com.myehr.pojo.formmanage.formCopy;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.myehr.common.util.SpringContextUtils;
import com.myehr.pojo.formmanage.cache.FormParamConstants;
import com.myehr.pojo.formmanage.form.SysFormGeneralParam;
import com.myehr.pojo.formmanage.form.SysFormconfigTree;
import com.myehr.pojo.sysParam.SysRequestParam;
import com.myehr.service.formmanage.form.IListFormService;
import com.myehr.service.formmanage.form.generalparam.ISysFormGeneralParamService;

public class SysFormconfigTreeCacheCopy implements Serializable {
	
//	private static final Logger log = DcfUtil.getLogger(SysFormTree.class);

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private SysFormconfigTree tree;
	
	private SysFormTreeSolutionCacheCopy solution;
	
	public void setSolution(SysFormTreeSolutionCacheCopy solution) {
		this.solution = solution;
	}


	private Map<String, List<SysFormGeneralParamCacheCopy>> generalParams = new HashMap<String,List<SysFormGeneralParamCacheCopy>>();
	
	public Map<String,List<SysFormGeneralParamCacheCopy>> getGeneralParams() {
		return generalParams;
	}

	public void setGeneralParams(Map<String,List<SysFormGeneralParamCacheCopy>> generalParams) {
		this.generalParams = generalParams;
	}
	
	public SysFormconfigTree getTree() {
		return tree;
	}
	

	public String getFormAllowSelect() {
		return tree.getFormAllowSelect();
	}

	public String getFormAutoCheckParent() {
		return tree.getFormAutoCheckParent();
	}

	public String getFormCheckRecursive() {
		return tree.getFormCheckRecursive();
	}

	public String getFormExpandOnClick() {
		return tree.getFormExpandOnClick();
	}

	public String getFormExpandOnDbclick() {
		return tree.getFormExpandOnDbclick();
	}


	public String getFormExpandOnLoad() {
		return tree.getFormExpandOnLoad();
	}

	public String getFormIsLazy() {
		return tree.getFormIsLazy();
	}

	public String getFormResultAsTree() {
		return tree.getFormResultAsTree();
	}

	public String getFormShowCheckbox() {
		return tree.getFormShowCheckbox();
	}

	public String getFormShowFolderCheckbox() {
		return tree.getFormShowFolderCheckbox();
	}

	public String getFormShowTreeIcon() {
		return tree.getFormShowTreeIcon();
	}

	public String getFormShowTreeLines() {
		return tree.getFormShowTreeLines();
	}

	public String getFormTreeDataField() {
		return tree.getFormTreeDataField();
	}

	public BigDecimal getFormTreeFormId() {
		return tree.getFormTreeFormId();
	}

	public BigDecimal getFormTreeId() {
		return tree.getFormTreeId();
	}

	public String getFormTreeIdField() {
		return tree.getFormTreeIdField();
	}

	public String getFormTreeParentField() {
		return tree.getFormTreeParentField();
	}

	public String getFormTreeTextField() {
		return tree.getFormTreeTextField();
	}

	
	public String getFormTreeWidth() {
		if("tree".equals(this.getFormShowTreeOnly())){
			return "100%";
		}else{
			return this.tree.getFormTreeWidth();
		}
	}

	public String getFormTreeValue() {
		return tree.getFormTreeValue();
	}

	public String getFormTreeInitFun() {
		return tree.getFormTreeInitFun();
	}

	public String getFormTreeLoadFun() {
		return tree.getFormTreeLoadFun();
	}

	public String getFormTreeNodeClickFun() {
		return tree.getFormTreeNodeClickFun();
	}

	public String getFormTreeCustomFun() {
		return tree.getFormTreeCustomFun();
	}

	public String getFormShowTitle() {
		return tree.getFormShowTitle();
	}

	public String getFormShowTreeOnly() {
		return tree.getFormShowTreeOnly();
	}

	public BigDecimal getFormTreeSolutionId() {
		return tree.getFormTreeSolutionId();
	}

	public String getFormTreeType() {
		return tree.getFormTreeType();
	}

	public SysFormTreeSolutionCacheCopy getSolution() {
		return solution;
	}
	
	public String getFormShowFilter() {
		return tree.getFormShowFilter();
	}
	
	
	

	/**
	 * 提供空的构造函数
	 * 
	 */
	public SysFormconfigTreeCacheCopy() {
	};

	/**
	 * 构造函数 数据库加载
	 * 
	 * @param formTreeFormId
	 * @throws Exception 
	 */
	public SysFormconfigTreeCacheCopy(String formTreeFormId, String formCode) throws Exception {
		// 创建tree对象
//		IListFormService service = (IListFormService) ApplicationContextFactory
//				.getContext().getBean("ListFormServiceBean2");
		IListFormService service = (IListFormService)SpringContextUtils.getBeanById("ListFormService");	
		SysFormconfigTree obj = service.queryListTreeById(formTreeFormId);
		if (obj == null) {
//			log.error("无法获取表单编码为:" + formCode + "对应的tree信息");
			System.out.println("无法获取表单编码为:" + formCode + "对应的tree信息");
			return;
		}
		this.setThisByDataObject(obj);
		
		//加载树参数
		setTreeGeneralParam(formTreeFormId);
		
		//加载树方案对象
		SysFormTreeSolutionCacheCopy so = new SysFormTreeSolutionCacheCopy(this.getFormTreeSolutionId().toString());
		this.solution = so;

		//处理树节点配置
		if("1".equals(this.tree.getFormTreeType())){
//			this.formTreeIdField = this.solution.getTreeRealType("nodeId");
//			this.formTreeTextField = this.solution.getTreeRealType("nodeName");
//			this.formTreeParentField = this.solution.getTreeRealType("nodeParent");
			this.tree.setFormTreeIdField(this.solution.getTreeRealType("nodeId"));
			this.tree.setFormTreeTextField(this.solution.getTreeRealType("nodeName"));
			this.tree.setFormTreeParentField(this.solution.getTreeRealType("nodeParent"));
			this.tree.setFormTreeValue(this.solution.getTreeRealType("nodeType"));
		}
		
	}
	
	public void setTreeGeneralParam(String formId){
//		ISysFormGeneralParamService
//		ISysFormGeneralParamService paramService = (ISysFormGeneralParamService)ApplicationContextFactory.getContext().getBean("ISysFormGeneralParamService");
		ISysFormGeneralParamService paramService = (ISysFormGeneralParamService)SpringContextUtils.getBeanById("ISysFormGeneralParamService");	
		String paramType = FormParamConstants.FORMCONFIG+"|"+FormParamConstants.JS_VAR;
		List<SysFormGeneralParam> params = paramService.queryGeneralParamByTypeAndTypeValue(paramType,Long.parseLong(formId));
		for(int i=0; i<params.size(); i++){
			SysFormGeneralParamCacheCopy p = new SysFormGeneralParamCacheCopy(params.get(i));
			String type = p.getParamTypeEnd();
			if(this.generalParams.containsKey(type)){
				List<SysFormGeneralParamCacheCopy> l = this.generalParams.get(type);
				l.add(p);
				this.generalParams.put(type, l);
			}else {
				List<SysFormGeneralParamCacheCopy> l = new ArrayList<SysFormGeneralParamCacheCopy>();
				l.add(p);
				this.generalParams.put(type, l);
			}
		}
	}
	

	/**
	 * DataObject填充对象
	 * 
	 * @param obj
	 */
	public void setThisByDataObject(SysFormconfigTree obj) {
		this.tree = obj;
	}
	


	//  获取showNodePage函数体内容
	public String getNodeType(){
		if("1".equals(this.tree.getFormTreeType())){
			return this.solution.getTreeRealType("nodeType");
		}else {
			return "nodeType";
		}
	}


}
