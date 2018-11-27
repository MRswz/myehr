package com.myehr.pojo.formmanage.cache;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.myehr.common.util.SpringContextUtils;
import com.myehr.pojo.formmanage.form.SysFormGeneralParam;
import com.myehr.pojo.formmanage.form.SysFormconfigTree;
import com.myehr.pojo.sysParam.SysRequestParam;
import com.myehr.service.formmanage.form.IListFormService;
import com.myehr.service.formmanage.form.generalparam.ISysFormGeneralParamService;

public class SysFormconfigTreeCache implements Serializable {
	
//	private static final Logger log = DcfUtil.getLogger(SysFormTree.class);

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private SysFormconfigTree tree;
	
	private SysFormTreeSolutionCache solution;
	
	public void setSolution(SysFormTreeSolutionCache solution) {
		this.solution = solution;
	}


	private Map<String, List<SysFormGeneralParamCache>> generalParams = new HashMap<String,List<SysFormGeneralParamCache>>();
	
	public Map<String,List<SysFormGeneralParamCache>> getGeneralParams() {
		return generalParams;
	}

	public void setGeneralParams(Map<String,List<SysFormGeneralParamCache>> generalParams) {
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
	public String getFormTreeUrl(SysRequestParam request) {
		String paramStr = "formId="+this.tree.getFormTreeFormId();
		String url = "";
		if("2".equals(this.tree.getFormTreeType())){
			String endtype = FormParamConstants.TREE_BIZ_URL;
			List<SysFormGeneralParamCache>  l = generalParams.get(endtype);
			paramStr = SysCardFormColumnUtil.getGeneralParamStr(l,request);
			paramStr +="formId="+this.tree.getFormTreeFormId();
			url = tree.getFormTreeUrl();
		}else {
			 //if(!"true".equals(this.tree.getFormIsLazy())){
				 paramStr +="&params="+SysTreeFormBeansUtil.getUrlParamStr(this.solution, request) ;
			 //}
			 url =SysTreeFormBeansUtil.DATA_LOADER_URL;
		}
		if(!"".equals(paramStr)) {
			if(url!=null&&url.indexOf("?")>0){
				url = url +"&" +paramStr;
			}else {
				url = url+"?"+paramStr;
			}
		}
		return url;
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

	public SysFormTreeSolutionCache getSolution() {
		return solution;
	}
	
	public String getFormShowFilter() {
		return tree.getFormShowFilter();
	}
	
	
	

	/**
	 * 提供空的构造函数
	 * 
	 */
	public SysFormconfigTreeCache() {
	};

	/**
	 * 构造函数 数据库加载
	 * 
	 * @param formTreeFormId
	 * @throws Exception 
	 */
	public SysFormconfigTreeCache(String formTreeFormId, String formCode) throws Exception {
		// 创建tree对象
		IListFormService service = (IListFormService)SpringContextUtils.getBeanById("ListFormService");	
		SysFormconfigTree obj = service.queryListTreeById(formTreeFormId);
		if (obj == null) {
			System.out.println("无法获取表单编码为:" + formCode + "对应的tree信息");
			return;
		}
		this.setSysFormconfigTree(obj);
		//加载树参数
		setTreeGeneralParam(formTreeFormId);
		//加载树方案对象
		SysFormTreeSolutionCache so = new SysFormTreeSolutionCache(this.getFormTreeSolutionId().toString());
		this.solution = so;
		//处理树节点配置
		if("1".equals(this.tree.getFormTreeType())){
			this.tree.setFormTreeIdField(this.solution.getTreeRealType("nodeId"));
			this.tree.setFormTreeTextField(this.solution.getTreeRealType("nodeName"));
			this.tree.setFormTreeParentField(this.solution.getTreeRealType("nodeParent"));
			this.tree.setFormTreeValue(this.solution.getTreeRealType("nodeType"));
		}
		
	}
	
	public void setTreeGeneralParam(String formId){
		ISysFormGeneralParamService paramService = (ISysFormGeneralParamService)SpringContextUtils.getBeanById("ISysFormGeneralParamService");	
		String paramType = FormParamConstants.FORMCONFIG+"|"+FormParamConstants.JS_VAR;
		List<SysFormGeneralParam> params = paramService.queryGeneralParamByTypeAndTypeValue(paramType,Long.parseLong(formId));
		for(int i=0; i<params.size(); i++){
			SysFormGeneralParamCache p = new SysFormGeneralParamCache(params.get(i));
			String type = p.getParamTypeEnd();
			if(this.generalParams.containsKey(type)){
				List<SysFormGeneralParamCache> l = this.generalParams.get(type);
				l.add(p);
				this.generalParams.put(type, l);
			}else {
				List<SysFormGeneralParamCache> l = new ArrayList<SysFormGeneralParamCache>();
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
	public void setSysFormconfigTree(SysFormconfigTree obj) {
		this.tree = obj;
	}
	
	/**
	 * 
	 * @param str
	 * @return
	 */
	public String getJsParamStr(SysRequestParam request){
		return  SysTreeFormBeansUtil.getUrlParamStrJs(request, this);
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
