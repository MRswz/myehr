package com.myehr.pojo.formmanage.cache;

import java.io.Serializable;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.myehr.pojo.sysParam.SysRequestParam;

public class SysTreeFormBeansUtil implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static final String DATA_LOADER_URL="${pageContext.request.contextPath }/form/queryTreeSolution.action";

	/** 
	 * 选择按钮生成GetData js代码（树表单）
	 * @return
	 */
//	public static String getSelectGetDataButtonJs(String formCode,String idField,String textField){
//		String temp = "//选中按钮使用的GetData方法 （自定生成）"+SysCardFormBeansUtil.NEW_LINE_ONLY;
//		temp += SysCardFormBeansUtil.getNbsp(0) + "function GetData(){"	+ SysCardFormBeansUtil.NEW_LINE_ONLY;
//		temp += SysCardFormBeansUtil.getNbsp(1) + "var selectTree = nui.get('tree_"+formCode+"')" + SysCardFormBeansUtil.NEW_LINE;
//		temp += SysCardFormBeansUtil.getNbsp(1) + "var selectNodes = selectTree.getCheckedNodes()" + SysCardFormBeansUtil.NEW_LINE;
		
		//单选时selectTree.selectNodes
//		temp += SysCardFormBeansUtil.getNbsp(1) + "if(selectNodes!=null&&selectNodes.length>0){" + SysCardFormBeansUtil.NEW_LINE_ONLY;
		
//		temp += SysCardFormBeansUtil.getNbsp(2) + "return selectNodes;" + SysCardFormBeansUtil.NEW_LINE_ONLY;
	
		
		
	//	temp += SysCardFormBeansUtil.getNbsp(2) + "var strId = '';" + SysCardFormBeansUtil.NEW_LINE_ONLY;
	//	temp += SysCardFormBeansUtil.getNbsp(2) + "var strText = '';" + SysCardFormBeansUtil.NEW_LINE_ONLY;
	//	temp += SysCardFormBeansUtil.getNbsp(2) + "for(var i=0; i<selectNodes.length;i++){" + SysCardFormBeansUtil.NEW_LINE_ONLY;
	//	temp += SysCardFormBeansUtil.getNbsp(3) + "strId=strId+selectNodes[i]."+idField +"+','"+ SysCardFormBeansUtil.NEW_LINE;
	//	temp += SysCardFormBeansUtil.getNbsp(3) + "strText=strText+selectNodes[i]."+textField +"+','"+ SysCardFormBeansUtil.NEW_LINE;
	//	temp += SysCardFormBeansUtil.getNbsp(2) + "}" + SysCardFormBeansUtil.NEW_LINE_ONLY;
	//	temp += SysCardFormBeansUtil.getNbsp(2) + "if(strId!=''){strId=strId.substr(0,strId.length-1);}" + SysCardFormBeansUtil.NEW_LINE_ONLY;
	//	temp += SysCardFormBeansUtil.getNbsp(2) + "if(strText!=''){strText=strText.substr(0,strText.length-1);}" + SysCardFormBeansUtil.NEW_LINE_ONLY;
	//	temp += SysCardFormBeansUtil.getNbsp(2) + "return {"+idField+":strId,"+textField+":strText}" + SysCardFormBeansUtil.NEW_LINE;
//		temp += SysCardFormBeansUtil.getNbsp(1) + "}" + SysCardFormBeansUtil.NEW_LINE_ONLY;
//		temp += SysCardFormBeansUtil.getNbsp(0) + "}" + SysCardFormBeansUtil.NEW_LINE_ONLY;
//		temp += SysCardFormBeansUtil.NEW_LINE_ONLY;
//		return temp;
//	}

	/**
	 * 获取setData函数
	 * @param formCode
	 * @param idField
	 * @param textField
	 * @return
	 */
//	public static String getSelectSetDataButtonJs(String formCode,String idField,String textField){
//		String temp = "//选中按钮使用的按钮点击方法 （自定生成）"+SysCardFormBeansUtil.NEW_LINE_ONLY;
//		temp += SysCardFormBeansUtil.getNbsp(0) + "function SetData(data){"	+ SysCardFormBeansUtil.NEW_LINE_ONLY;
		
//		temp += SysCardFormBeansUtil.getNbsp(1) + "var selectTree = nui.get('tree_"+formCode+"')" + SysCardFormBeansUtil.NEW_LINE;
//		temp += SysCardFormBeansUtil.getNbsp(1) + "var idarr = data."+idField+".split(',')" + SysCardFormBeansUtil.NEW_LINE;
//		temp += SysCardFormBeansUtil.getNbsp(1) + "var textarr = data."+textField+".split(',')" + SysCardFormBeansUtil.NEW_LINE;
//		temp += SysCardFormBeansUtil.getNbsp(1) + "for(var i=0; i<idarr.length; i++){" + SysCardFormBeansUtil.NEW_LINE_ONLY;
		//temp += SysCardFormBeansUtil.getNbsp(1) + "alert(nui.encode(selectTree.getNode(idarr[i])));" + SysCardFormBeansUtil.NEW_LINE_ONLY;
//		temp += SysCardFormBeansUtil.getNbsp(2) + "selectTree.checkNode (selectTree.getNode(idarr[i]))" + SysCardFormBeansUtil.NEW_LINE_ONLY;
//		temp += SysCardFormBeansUtil.getNbsp(1) + "}" + SysCardFormBeansUtil.NEW_LINE_ONLY;
//		temp += SysCardFormBeansUtil.getNbsp(0) + "}" + SysCardFormBeansUtil.NEW_LINE_ONLY;
//		temp += SysCardFormBeansUtil.NEW_LINE_ONLY;
//		return temp;
//	}
	
	
	
	
	
	/**
	 * 按钮点击函数js
	 * @param formCode
	 * @param idField
	 * @param textField
	 * @return
	 */
	public static String getSelectClickButtonJs(String formCode,String btnCode,String idField,String textField,String isMuliSlect,String formId){
		String temp = "//选中按钮使用的click方法 （自定生成）"+SysCardFormBeansUtil.NEW_LINE_ONLY;
		temp += SysCardFormBeansUtil.getNbsp(0) + "function "+btnCode+formCode+"_click_"+formId+"(e){"	+ SysCardFormBeansUtil.NEW_LINE_ONLY;
		temp += SysCardFormBeansUtil.getNbsp(1) + "var selectTree = $.fn.zTree.getZTreeObj('tree_"+formCode+"');" + SysCardFormBeansUtil.NEW_LINE;
		temp += SysCardFormBeansUtil.getNbsp(1) + "var snode = selectTree.getSelectedNodes();\n";
		temp += SysCardFormBeansUtil.getNbsp(1) + "var parentId = '${param.fatherId}';\n";
		temp += SysCardFormBeansUtil.getNbsp(1) + "if(snode!=null&&snode.length>0){\n";
		temp += SysCardFormBeansUtil.getNbsp(2) + "parent.document.getElementById(parentId).value=snode[0].${param.idField};\n";
		temp += SysCardFormBeansUtil.getNbsp(2) + "parent.document.getElementById(parentId+'_name').value=snode[0].${param.textField};\n";
		temp += SysCardFormBeansUtil.getNbsp(2) + "if(parent.document.getElementById(parentId+'_name').getAttribute('onchange')!=undefined){\n";
		temp += SysCardFormBeansUtil.getNbsp(3) + "parent.document.getElementById(parentId+'_name').onchange();\n";
		temp += SysCardFormBeansUtil.getNbsp(2) + "}\n";
		temp += SysCardFormBeansUtil.getNbsp(2) + "var index = parent.layer.getFrameIndex(window.name); //获取当前窗体索引\n";
		temp += SysCardFormBeansUtil.getNbsp(2) + "parent.layer.close(index); //执行关闭\n";
		temp += SysCardFormBeansUtil.getNbsp(1) + "}else {\n";
		temp += SysCardFormBeansUtil.getNbsp(1) + "alert('请选择数据');\n";
//		temp += SysCardFormBeansUtil.getNbsp(1) + "alert('<%=LangUtil.getLangByCode((String)session.getAttribute(\"langType\"),\"请选择数据\")%>');\n";
		temp += SysCardFormBeansUtil.getNbsp(1) + "}\n";
		temp += SysCardFormBeansUtil.getNbsp(0) + "}\n";

		return temp;
	}
	
	/**
	 * 
	 * @param buttonSaveFun
	 * @param btnCode
	 * @param formCode
	 * @return
	 */
	public static String getWriteJs(String buttonSaveFun,String btnCode,String formCode,String formId) {
		// TODO 自动生成方法存根
		String temp = "//选中按钮使用的click方法 （自定生成）"+SysCardFormBeansUtil.NEW_LINE_ONLY;
		temp += SysCardFormBeansUtil.getNbsp(0) + "function "+btnCode+formCode+"_click_"+formId+"(){"	+ SysCardFormBeansUtil.NEW_LINE_ONLY;
		temp += SysCardFormBeansUtil.getNbsp(0) +buttonSaveFun+ SysCardFormBeansUtil.NEW_LINE_ONLY;
		temp += SysCardFormBeansUtil.getNbsp(0) + "}" + SysCardFormBeansUtil.NEW_LINE_ONLY;
		temp += SysCardFormBeansUtil.NEW_LINE_ONLY;
		return temp;
	}
	
	/**
	 * 非懒加载时需要参数跟到url后面
	 * @return
	 */
	public static String getUrlParamStr(SysFormTreeSolutionCache solution,SysRequestParam request){
		String temp ="{";
		List<String[]> params = solution.getParams();
		
		if(params.size()>0){
			for(String[] temps:params){
				String dataFromType = null;
				String dataFromValue = null;
				String _value = null;
				if("s".equals(temps[0])){
					dataFromType = "session";
					dataFromValue = temps[1];
				}
				if("r".equals(temps[0])){
					dataFromType = "request";
					dataFromValue = temps[1];
				}
				_value = SysCardFormColumnUtil.getDefaultValue(request,dataFromType,dataFromValue);
				temp+=temps[0]+"_"+temps[1]+":'"+_value+"',";
				
			}
			if(temp.length()>1){
				temp = temp.substring(0,temp.length()-1);
			}
		}
		temp+="}";
		return temp;
	}
	
	/**
	 * 获取url的参数
	 * @param solution
	 * @return
	 */
	public static String getUrlParamStr(SysFormTreeSolutionCache solution,SysRequestParam request,String formId){
		List<String[]> params = solution.getParams();
		String njs = SysCardFormBeansUtil.getNbsp(1)+"var params = {}"+ SysCardFormBeansUtil.NEW_LINE;
		if(params.size()>0){
			for(String[] temps:params){
				if("s".equals(temps[0])){
					String _value = SysCardFormColumnUtil.getDefaultValue(request, "session", temps[1]);
					if(_value!=null&&!"".equals(_value)){
						njs+=SysCardFormBeansUtil.getNbsp(1) + "var s_"+temps[1]+"='"+_value+"'"+ SysCardFormBeansUtil.NEW_LINE;
						njs+=SysCardFormBeansUtil.getNbsp(1) + "params.s_"+temps[1]+"=s_"+temps[1]+SysCardFormBeansUtil.NEW_LINE;
					}
				}
				if("r".equals(temps[0])){
					String _value = SysCardFormColumnUtil.getDefaultValue(request, "request", temps[1]);
					if(_value!=null&&!"".equals(_value)){
						njs+=SysCardFormBeansUtil.getNbsp(1) + "var r_"+temps[1]+"='"+_value+"'"+ SysCardFormBeansUtil.NEW_LINE;
						njs+=SysCardFormBeansUtil.getNbsp(1) + "params.r_"+temps[1]+"=r_"+temps[1]+SysCardFormBeansUtil.NEW_LINE;
					}
				}
				if("n".equals(temps[0])){
					String _value = SysCardFormColumnUtil.getDefaultValue(request, "treeNode", temps[1]);
					if(_value!=null){
						njs+=SysCardFormBeansUtil.getNbsp(1) + "var n_"+temps[1]+"="+_value+ SysCardFormBeansUtil.NEW_LINE;
						njs+=SysCardFormBeansUtil.getNbsp(1) + "if(n_"+temps[1]+"){"+ SysCardFormBeansUtil.NEW_LINE;
						njs+=SysCardFormBeansUtil.getNbsp(2) + "params.n_"+temps[1]+"=n_"+temps[1]+SysCardFormBeansUtil.NEW_LINE;
						njs+=SysCardFormBeansUtil.getNbsp(1) + "}"+ SysCardFormBeansUtil.NEW_LINE;
					}
				}
			}
		}
		//params
		 njs += SysCardFormBeansUtil.getNbsp(1)+"e.params.params = nui.encode(params)"+ SysCardFormBeansUtil.NEW_LINE;
		return njs;
	}
	
	public static String getUrlParamStrJs(SysRequestParam request,SysFormconfigTreeCache tree){
			int formId=tree.getTree().getFormTreeFormId().intValue();
			String formTreeFormId=formId+"";
			return  SysTreeFormBeansUtil.getUrlParamStr(tree.getSolution(), request,formTreeFormId);
	}
}
