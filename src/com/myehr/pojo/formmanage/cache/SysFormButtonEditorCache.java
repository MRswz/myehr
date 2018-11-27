package com.myehr.pojo.formmanage.cache;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.myehr.common.util.SpringContextUtils;
import com.myehr.pojo.formmanage.button.SysFormButtonEditorWithBLOBs;
import com.myehr.pojo.formmanage.form.SysSqlParams;
import com.myehr.pojo.sysParam.SysRequestParam;
import com.myehr.service.formmanage.form.IButtonService;
import com.myehr.service.sysParam.ISysParamService;

public class SysFormButtonEditorCache implements Serializable {
	private static Logger logger = LoggerFactory.getLogger(SysFormButtonEditorCache.class);
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private SysFormButtonEditorWithBLOBs pojo;
	
	private boolean hasColumn = false;
	
	
	
	private String[] sqlList;
	private List<String[]> params = new ArrayList<String[]>();
	
	public SysFormButtonEditorWithBLOBs getPojo(){
		return pojo;
	}
	
	public Long getButtonEditorModelId() {
		return pojo.getButtonEditorModelId();
	}
	
	public String getButtonEditorModelValue() {
		return pojo.getButtonEditorModelValue();
	}
	public String getButtonEditorModelHtml() {
		return pojo.getButtonEditorModelHtml();
	}
	public long getButtonEditorModelFormid() {
		return pojo.getButtonEditorModelFormid();
	}
	
	public long getButtonEditorModelButtonid() {
		return pojo.getButtonEditorModelButtonid();
	}
	
	public String getEditorModelType() {
		return pojo.getEditorModelType();
	}
	
	public String getEditorMessageType() {
		return pojo.getEditorMessageType();
	}
	
	public long getEditorModelId() {
		return pojo.getEditorModelId();
	}
	
	public String getEditorModelName() {
		return pojo.getEditorModelName();
	}
	
	public List<String[]> getParams() {
		return params;
	}
	public void setParams(List<String[]> params) {
		this.params = params;
	}
	public String[] getSqlList() {
		return sqlList;
	}
	public void setSqlList(String[] sqlList) {
		this.sqlList = sqlList;
	}
	
	
	public boolean isHasColumn() {
		return hasColumn;
	}
	public void setHasColumn(boolean hasColumn) {
		this.hasColumn = hasColumn;
	}
	public SysFormButtonEditorCache(String buttonExecSqlType, String buttonId) {
		IButtonService service = (IButtonService)SpringContextUtils.getBeanById("IButtonService");
		/*IButtonService service = (IButtonService)ApplicationContextFactory.getContext().getBean("IButtonService");*/
		SysFormButtonEditorWithBLOBs obj  = service.queryButtonEditorById(buttonExecSqlType, buttonId);
		if(obj!=null){
			this.setThisByDataObject(obj);
		}
	}
	
	/**
	 * 通过id初始化
	 * @param exeSqlId
	 */
	public SysFormButtonEditorCache(long exeSqlId) {
		IButtonService service = (IButtonService)SpringContextUtils.getBeanById("IButtonService");
		SysFormButtonEditorWithBLOBs obj  = service.queryButtonEditorById(exeSqlId);
		if(obj!=null){
			this.setThisByDataObject(obj);
		}
	}
	
	public SysFormButtonEditorCache(SysFormButtonEditorWithBLOBs obj) {
		if(obj!=null){
			this.setThisByDataObject(obj);
		}
	}
	
	public void setThisByDataObject(SysFormButtonEditorWithBLOBs obj){
		this.pojo = obj;
		
		//sqlList = this.getExecSql().split(";");
		//SqlUtil.dealTreeSolutionParam(params, this.getExecSql());
		
		for(String[] param : params){
			if("c".equals(param[0])){
				this.hasColumn = true;
				break;
			}
		}
	}
	
	public String getColumnParamsNames(){
		
		return null;
	}
	
	/**
	 * 获卡片式sql执行获取js参数
	 * @param jsId
	 * @return
	 */
	public String getCardParamsJsStr(String jsId,SysRequestParam request){
		List<String[]> params1 = this.getParams();
		String jsParams = new String("var paramsMap = {");
		
		for(String[] param : params1){
			if("c".equals(param[0])){
				String str = param[1].substring(param[1].indexOf("_")+1);
				//SysFormColumn sfc = form.serchColumnByColumnId(Long.parseLong(str));
				String str3 = SysCardFormBeansUtil.getNbsp(2) + "'c_" + str + "' : " + "nui.get('" + jsId +"').getValue(),\n" ;
				jsParams += str3;
			} else if("s".equals(param[0])){
				String str = param[1];
				String str1 = SysCardFormColumnUtil.getDefaultValue(request,"session",str);
				if(str1!=null){
					String str2 = SysCardFormBeansUtil.getNbsp(2) + "'s_" + param[1] + "' : '" + str1 + "',\n";
					jsParams += str2;
				}
			} else if("r".equals(param[0])){
				String str = param[1];
				String str1 = SysCardFormColumnUtil.getDefaultValue(request,"request",str);
				if(str1!=null){
					String str2 = SysCardFormBeansUtil.getNbsp(2) + "'r_" + param[1] + "' : '" + str1 + "',\n";
					jsParams += str2;
				}
			}
		}
		if(jsParams.endsWith(",\n")){
			jsParams = jsParams.substring(0,jsParams.length()-2);
		}
		jsParams += "};\n";
		
		return jsParams;
	}
	

	/**
	 * 
	 * @param params1
	 * @param form
	 * @param request
	 * @param isFilter
	 * @return
	 */
	public static String getCardParamsJsStr(List<String[]> params1 ,SysFormconfigCache form,SysRequestParam request,boolean isFilter){
		String jsParams = new String("var paramsMap = {");
		
		for(String[] param : params1){
			if("c".equals(param[0])){
				String str = param[1].substring(param[1].indexOf("_")+1);
				
				SysFormColumnCache sfc = form.serchColumnByColumnId(Long.parseLong(str));
				String jsId = sfc.getJsId("id",form.getPojoform().getFormDefId().toString());
				jsId = isFilter?"FILTER_"+jsId:jsId;
				String str3 = SysCardFormBeansUtil.getNbsp(2) + "'c_" + str + "' : " + "document.getElementById('" + jsId +"').value,\n" ;
				jsParams += str3;
			} else if("s".equals(param[0])){
				String str = param[1];
				String str1 = SysCardFormColumnUtil.getDefaultValue(request,"session",str);
				if(str1!=null){
					String str2 = SysCardFormBeansUtil.getNbsp(2) + "'s_" + param[1] + "' : '" + str1 + "',\n";
					jsParams += str2;
				}
			} else if("r".equals(param[0])){
				String str = param[1];
				String str1 = SysCardFormColumnUtil.getDefaultValue(request,"request",str);
				if(str1!=null){
					String str2 = SysCardFormBeansUtil.getNbsp(2) + "'r_" + param[1] + "' : '" + str1 + "',\n";
					jsParams += str2;
				}
			}
		}
		if(jsParams.endsWith(",\n")){
			jsParams = jsParams.substring(0,jsParams.length()-2);
		}
		jsParams += "};\n";
		
		return jsParams;
	}
	
	/**
	 * 列表片式js参数（rendered回填）主要用于 列表look sql方式回填
	 * @param jsId
	 * @return
	 */
	public String getDataGridRendererParamsJsStr(SysFormconfigCache form,SysRequestParam request){
		List<String[]> params1 = this.getParams();
		String jsParams = new String("var paramsMap = {");
		
		for(String[] param : params1){
			if("c".equals(param[0])){
				String str = param[1].substring(param[1].indexOf("_")+1);
				SysFormColumnCache sfc = form.serchColumnByColumnId(Long.parseLong(str));
				String str3 = SysCardFormBeansUtil.getNbsp(2) + "'c_" + str + "' : " + "e.row."+sfc.getJsId("name",form.getPojoform().getFormDefId().toString())+",\n" ;
				jsParams += str3;
			} else if("s".equals(param[0])){
				String str = param[1];
				String str1 = SysCardFormColumnUtil.getDefaultValue(request,"session",str);
				if(str1!=null){
					String str2 = SysCardFormBeansUtil.getNbsp(2) + "'s_" + param[1] + "' : '" + str1 + "',\n";
					jsParams += str2;
				}
			} else if("r".equals(param[0])){
				String str = param[1];
				String str1 = SysCardFormColumnUtil.getDefaultValue(request,"request",str);
				if(str1!=null){
					String str2 = SysCardFormBeansUtil.getNbsp(2) + "'r_" + param[1] + "' : '" + str1 + "',\n";
					jsParams += str2;
				}
			}
		}
		if(jsParams.endsWith(",\n")){
			jsParams = jsParams.substring(0,jsParams.length()-2);
		}
		jsParams += "};\n";
		
		return jsParams;
	}
	

	/**
	 * 列表片式js参数（列表上面按钮）主要用于 执行sql  调用公式
	 * @param jsId
	 * @return
	 */
	public String getDataGridButtonParamsJsStr(String jsName,SysRequestParam request){
		List<String[]> params1 = this.getParams();
		String jsParams = new String("var paramsMap = {");
		
		for(String[] param : params1){
			if("c".equals(param[0])){
				String str = param[1].substring(param[1].indexOf("_")+1);
				//SysFormColumn sfc = form.serchColumnByColumnId(Long.parseLong(str));
				String str3 = SysCardFormBeansUtil.getNbsp(2) + "'c_" + str + "' : " + "e.row."+jsName+",\n" ;
				jsParams += str3;
			} else if("s".equals(param[0])){
				String str = param[1];
				String str1 = SysCardFormColumnUtil.getDefaultValue(request,"session",str);
				if(str1!=null){
					String str2 = SysCardFormBeansUtil.getNbsp(2) + "'s_" + param[1] + "' : '" + str1 + "',\n";
					jsParams += str2;
				}
			} else if("r".equals(param[0])){
				String str = param[1];
				String str1 = SysCardFormColumnUtil.getDefaultValue(request,"request",str);
				if(str1!=null){
					String str2 = SysCardFormBeansUtil.getNbsp(2) + "'r_" + param[1] + "' : '" + str1 + "',\n";
					jsParams += str2;
				}
			}
		}
		if(jsParams.endsWith(",\n")){
			jsParams = jsParams.substring(0,jsParams.length()-2);
		}
		jsParams += "};\n";
		
		return jsParams;
	}
	
	/**
	 * 列表片式js参数（用于rennderer）主要用于 执行sql  调用公式 
	 * @param jsId
	 * @return
	 */
	public static String getDataGridParamsJsStr(List<String[]> params1,SysFormconfigCache form,SysRequestParam request){
		String jsParams = new String("var paramsMap = {");
		
		for(String[] param : params1){
			if("c".equals(param[0])){
				String str = param[1].substring(param[1].indexOf("_")+1);
				SysFormColumnCache sfc = form.serchColumnByColumnId(Long.parseLong(str));
				String jsName = sfc.getJsId("name",form.getPojoform().getFormDefId().toString());
				String str3 = SysCardFormBeansUtil.getNbsp(2) + "'c_" + str + "' : " + "e.row."+jsName+",\n" ;
				jsParams += str3;
			} else if("s".equals(param[0])){
				String str = param[1];
				String str1 = SysCardFormColumnUtil.getDefaultValue(request,"session",str);
				if(str1!=null){
					String str2 = SysCardFormBeansUtil.getNbsp(2) + "'s_" + param[1] + "' : '" + str1 + "',\n";
					jsParams += str2;
				}
			} else if("r".equals(param[0])){
				String str = param[1];
				String str1 = SysCardFormColumnUtil.getDefaultValue(request,"request",str);
				if(str1!=null){
					String str2 = SysCardFormBeansUtil.getNbsp(2) + "'r_" + param[1] + "' : '" + str1 + "',\n";
					jsParams += str2;
				}
			} else if("p".equals(param[0])){
				String str = param[1];
				ISysParamService service = (ISysParamService)SpringContextUtils.getBeanById("ISysParamService");
				try {
					SysSqlParams spParams = service.getSysSqlParamsByCode(str);
					String str1 = SysCardFormColumnUtil.getDefaultValue(request,"request",str);
					if(str1!=null){
						String str2 = SysCardFormBeansUtil.getNbsp(2) + "'p_" + param[1] + "' : " + param[1] + ",\n";
						jsParams += str2;
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();logger.error(e.getMessage(),e);
				}
				
			}
		}
		if(jsParams.endsWith(",\n")){
			jsParams = jsParams.substring(0,jsParams.length()-2);
		}
		jsParams += "};\n";
		
		return jsParams;
	}
	
	/**
	 * 列表片式js参数（用于button）主要用于 执行sql  调用公式 
	 * @param jsId
	 * @return
	 */
	public static String[] getDataGridButtonParamsJsStr(List<String[]> params1,SysFormconfigCache form,SysRequestParam request){
		String[] res = new String[2];
		String getListField = ("2".equals(form.getFormDefLayoutType()))||"10".equals(form.getFormDefLayoutType()) ? ("var columnDataRows" + " = grid_" +form.getFormDefCode()+ ".getSelecteds();//if(columnDataRows.length==0){return;}\n") : "";
		String jsParams = new String("var paramsMap = {");
		
		for(String[] param : params1){
			if("c".equals(param[0])){
				String str = param[1].substring(param[1].indexOf("_")+1);
				SysFormColumnCache sfc = form.serchColumnByColumnId(Long.parseLong(str));
				String str1 = sfc.getJsId("id",form.getPojoform().getFormDefId().toString());
				String str2 = str1.substring(str1.indexOf(".")+1);
				
				String str3 = null;
				if("1".equals(form.getFormDefLayoutType())){//卡片
					str3 = SysCardFormBeansUtil.getNbsp(2) + "'c_" + str + "' : " + "nui.get('" + str1 +"').getValue(),\n" ;
				} else if("2".equals(form.getFormDefLayoutType())||"10".equals(form.getFormDefLayoutType())) {//列表
					
					String tempGetListField = "";
					tempGetListField = 
					"var " + str2.toLowerCase() + "Datas;\n"
					+ "var temp"+str2.toLowerCase()+"Datas = [];\n"
					+	"for(var i=0; i<columnDataRows" + ".length; i++){\n"
					//+ 	"	temp"+str2.toLowerCase()+"Datas.push(\"'\"+" + str2.toLowerCase() + "Rows" + "[i]."+ str2 +"+\"'\");\n"
					+ 	"	temp"+str2.toLowerCase()+"Datas.push(\"'\"+" + "columnDataRows" + "[i]."+ str2 +"+\"'\");\n"
					+	"}\n"
					+	str2.toLowerCase() + "Datas = temp"+str2.toLowerCase()+"Datas.join(',');\n"  ;
					
					getListField += tempGetListField;
					str3 = SysCardFormBeansUtil.getNbsp(2) + "'c_" + str + "' : " + str2.toLowerCase() + "Datas,\n" ;
				}
				jsParams += str3;
			} else if("s".equals(param[0])){
				String str = param[1];
				String str1 = SysCardFormColumnUtil.getDefaultValue(request,"session",str);
				if(str1!=null){
					String str2 = SysCardFormBeansUtil.getNbsp(2) + "'s_" + param[1] + "' : '" + str1 + "',\n";
					jsParams += str2;
				}
			} else if("r".equals(param[0])){
				String str = param[1];
				String str1 = SysCardFormColumnUtil.getDefaultValue(request,"request",str);
				if(str1!=null){
					String str2 = SysCardFormBeansUtil.getNbsp(2) + "'r_" + param[1] + "' : '" + str1 + "',\n";
					jsParams += str2;
				}
			}
		}
		if(jsParams.endsWith(",\n")){
			jsParams = jsParams.substring(0,jsParams.length()-2);
		}
		jsParams += "};\n";
		res[0] = jsParams;
		res[1] = getListField;
		return res;
	}
	
	
	/**
	 * 获取js中变量代码段 url后面带的参数 combobox使用 
	 * isFilter  是否过滤字段调用
	 * @return
	 */
	public static String[] getSqlJsStr(SysFormComboboxCache combobx, SysRequestParam request,String columnname,String cid,SysFormconfigCache form,String jsid,boolean isFilter){
		/*if(combobx.getInitSql()==null){
			return null;
		}
		String[] result = new String[2];
		String temp1 = "";
		List<String[]> dparams = combobx.getInitSql().getParams();
			StringBuffer Str = new StringBuffer("{");
			
			for(String[] param : dparams){
				if("c".equals(param[0])&&form!=null){
					String str = param[1].substring(param[1].indexOf("_")+1);
					String columnId = str.substring(str.indexOf(".")+1).toLowerCase();
					String cjsid = form.serchColumnByColumnId(Long.parseLong(columnId)).getJsId("id",form.getPojoform().getFormDefId().toString());
					String ccolumnname = form.serchColumnByColumnId(Long.parseLong(columnId)).getJsId("name",form.getPojoform().getFormDefId().toString());
					cjsid = isFilter?"FILTER_"+cjsid:cjsid;
					temp1 += SysCardFormBeansUtil.getComboboxGuiInitJs(columnname,ccolumnname,cjsid,jsid,form.getFormDefLayoutType());
					String varstr = "c_" + columnId + ":" + "\"+c_param_"+ ccolumnname +"+\"," ;
					Str.append(varstr);
				} else if("s".equals(param[0])){
					String str = param[1];
					String str1 = SysCardFormColumnUtil.getDefaultValue(request,"session",str);
					String str2 = "s_" + param[1] + ":'" + str1 + "',";
					Str.append(str2);
				} else if("r".equals(param[0])){
					String str = param[1];
					String str1 = SysCardFormColumnUtil.getDefaultValue(request,"request",str);
					String str2 = "c_" + param[1] + ":'" + str1 + "',";
					Str.append(str2);
				}
			}
			String formidjstr = isFilter||"2".equals(form.getFormDefLayoutType())||"10".equals(form.getFormDefLayoutType())?"_formId_"+form.getFormDefCode():"_formId";
			Str.append("formId:\"+"+formidjstr+"+\",columnId:"+cid+"}");
			result[0] = temp1;
			if("1".equals(form.getFormDefLayoutType())||isFilter){
				result[1] = "params="+Str.toString();
			}else if("2".equals(form.getFormDefLayoutType())||"10".equals(form.getFormDefLayoutType())){
				result[1] = "var params=\""+Str.toString()+"\"";
			}
			
		
		return result;*/
		return null;
	}
	
}
