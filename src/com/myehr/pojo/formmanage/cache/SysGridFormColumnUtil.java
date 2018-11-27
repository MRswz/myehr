package com.myehr.pojo.formmanage.cache;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;

import com.myehr.pojo.sysParam.SysRequestParam;
public class SysGridFormColumnUtil implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	/**
	 * 获取textbox控件代码
	 * @param textbox
	 * @param entityName
	 * @param fieldName
	 * @param htmls
	 * @param request
	 * @param column
	 * @param isAsLabel 
	 * @return
	 */
	public static Object[] getTextBoxHtml(SysTextBoxCache textbox,String entityName,String fieldName,String[] htmls,SysRequestParam request ,SysFormColumnCache column, boolean isAsLabel){
		String renderer = getTextBoxLinkRenderFun(textbox,column.getForm().getFormDefCode(), fieldName,htmls,request);
		return getGridFormGuiHtml(htmls, request, entityName, fieldName, textbox.getTextboxDataFromType(), textbox.getTextboxDataFromValue(), textbox.getTextboxCheckFun(), textbox.getTextboxCheckType(),  textbox.getTextboxInitFun(), 
				null, null,null, column,isAsLabel,textbox.getTextboxValuechangeFun(),renderer,null);
	}
	
	/**
	 * 根据颜色生成单元格代码
	 * @param textbox
	 * @param entityName
	 * @param fieldName
	 * @param htmls
	 * @param request
	 * @param column
	 * @param isAsLabel 
	 * @param color 
	 * @return
	 */
	public static Object[] getTextBoxHtmlColor(SysTextBoxCache textbox,String entityName,String fieldName,String[] htmls,SysRequestParam request ,SysFormColumnCache column, boolean isAsLabel,String color,String colorNum){
		String renderer = getTextBoxLinkRenderFunColor(textbox,column.getForm().getFormDefCode(), fieldName,htmls,color,colorNum);
		return getGridFormGuiHtml(htmls, request, entityName, fieldName, textbox.getTextboxDataFromType(), textbox.getTextboxDataFromValue(), textbox.getTextboxCheckFun(), textbox.getTextboxCheckType(),  textbox.getTextboxInitFun(), 
				null, null,null, column,isAsLabel,textbox.getTextboxValuechangeFun(),renderer,null);
	}
	
	/**
	 * 获取textbox的renderer函数内容
	 * @param textbox
	 * @param formcode
	 * @param fieldName
	 * @return
	 */
	public static String getTextBoxLinkRenderFun(SysTextBoxCache textbox,String formcode,String fieldName,String[] htmls,SysRequestParam request){
		String renderStr = null;
		if("Y".equals(textbox.getTextBoxIsLink())){
			htmls[9] = htmls[9]==null?SysGridFormBeansUtil.getTextBoxLinkRenderFun(textbox,request,formcode,fieldName):htmls[9]
			         +SysGridFormBeansUtil.getTextBoxLinkRenderFun(textbox,request,formcode,fieldName);
			renderStr = SysGridFormBeansUtil.getLinkRenderFunStr(formcode, fieldName);
		}else {
			renderStr = textbox.getTextboxClickFun();
		}
		return renderStr;
	}
	
	/**
	 * 获取textbox的renderer函数内容
	 * @param textbox
	 * @param formcode
	 * @param fieldName
	 * @return
	 */
	public static String getTextBoxLinkRenderFunColor(SysTextBoxCache textbox,String formcode,String fieldName,String[] htmls,String color,String colorNum){
		String renderStr = null;
		String font = null;
		if("black".equals(color)){
			font = "font-weight:bold;";
		}
		String str = "var str=\"<span style='color:"+color+";"+font+"'>\"+e.value+\"</a>\";return str;";
		String str1 = "var str=\"<span>\"+e.value+\"</a>\";return str;";
		String value = "var value = e.value; if(value == null || value == undefined){ e.value=\"\";}";
		if(color!=null && color !=""){
			
			if(colorNum!=null && colorNum !=""){
				String symbol = colorNum.substring(0, 1);
				System.out.println(symbol);
				if(">".equals(symbol) || "<".equals(symbol) || "=".equals(symbol)){
					if("=".equals(symbol)){
						symbol = "==";
					}
					String num = colorNum.substring(1);
					System.out.println(num);
					
					renderStr = value+"if(value"+symbol+num+"){"+str+"}else{"+str1+"}";
				}else{
					String[] array= new String[2];
					array=colorNum.split("-");
					System.out.println(array[0]);
					System.out.println(array[1]);
					renderStr = value+"if("+array[0]+"<value && "+array[1]+">value){"+str+"}else{"+str1+"}";
				}
			}else{
				renderStr=value+str;
			}
		}
		return renderStr;
	}
	
	/**
	 * combobx js生成
	 * @param combobox
	 * @param entityName
	 * @param fieldName
	 * @param htmls
	 * @param request
	 * @param column
	 * @param isAsLabel
	 * @return
	 */
	public static Object[] getComboboxHtml(SysFormComboboxCache combobox, String entityName, String fieldName, String[] htmls, SysRequestParam request, SysFormColumnCache column, boolean isAsLabel) {
		// TODO 自动生成方法存根
//		是否要生成加载combobox控件数据脚本
		String cellbeginStr = combobox.getComboboxValuechangeFun();
		String rendererStr =  combobox.getComboboxClickFun();
		if("sql".equals(combobox.getComboboxGuiInitType())&&cellbeginStr==null){
			if(cellbeginStr==null){
				cellbeginStr= SysGridFormColumnUtil.getGridFormComboboxGuiInitJs(column.getFormFiledTablename(), column.getJsId("js",column.getPojo().getFormColumnFormDefId().toString()),combobox,request,column.getForm());
			}
			//htmls[14] += SysCardFormBeansUtil.getNbsp(1)+"combobox_init_"+column.getFormFiledTablename()+"();\n";
//			生成renderer方法
			if(rendererStr==null||"".equals(rendererStr)){
				
				rendererStr = SysGridFormBeansUtil.getComboboxSqlRenderer(column,request, combobox,column.getForm());
			
			}
		}
		
		
		return getGridFormGuiHtml(htmls, request, entityName, fieldName, combobox.getComboboxDataFromType(), combobox.getComboboxDataFromValue(), combobox.getComboboxcheckFun(),
				"11", combobox.getComboboxInitFun(), combobox.getComboboxGuiInitType(), combobox.getComboboxGuiInitValue(), combobox.getComboboxId()+"", column, isAsLabel,
				cellbeginStr,rendererStr,combobox.getGeneralParams());
	}
	
	private static String getGridFormComboboxGuiInitJs(String formFiledTablename, String jsId, SysFormComboboxCache combobox, SysRequestParam request, SysFormconfigCache form) {
		
		String[] results = SysFormGeneralExecSqlCache.getSqlJsStr(combobox,request, formFiledTablename,combobox.getComboboxFormColumnId(),form,jsId,false);
		if(results==null){
			return "";
		}
		String paramJson = results[1];
		String qjs = results[0];
		// TODO 自动生成方法存根
		//String temp = SysCardFormBeansUtil.getNbsp(3)+"var result ; [];";
		String temp = SysCardFormBeansUtil.getNbsp(3)+qjs;
		temp+=SysCardFormBeansUtil.getNbsp(3)+paramJson+SysCardFormBeansUtil.NEW_LINE;
		temp+=SysCardFormBeansUtil.getNbsp(3)+"var url = \""+SysCardFormBeansUtil.QUERY_SQL_URL+"\""+SysCardFormBeansUtil.NEW_LINE	;
		temp+= SysCardFormBeansUtil.getNbsp(3)+"nui.ajax({"+SysCardFormBeansUtil.NEW_LINE_ONLY;;
		temp+= SysCardFormBeansUtil.getNbsp(4)+"url: url,"+SysCardFormBeansUtil.NEW_LINE_ONLY;;
		temp+= SysCardFormBeansUtil.getNbsp(4)+"type: 'POST',"+SysCardFormBeansUtil.NEW_LINE_ONLY;;
		temp+= SysCardFormBeansUtil.getNbsp(4)+"data: nui.encode({params:params}),"+SysCardFormBeansUtil.NEW_LINE_ONLY;;
		temp+= SysCardFormBeansUtil.getNbsp(4)+"cache: false,"+SysCardFormBeansUtil.NEW_LINE_ONLY;;
		temp+= SysCardFormBeansUtil.getNbsp(4)+"contentType: 'text/json',"+SysCardFormBeansUtil.NEW_LINE_ONLY;;
		temp+= SysCardFormBeansUtil.getNbsp(4)+"cache: false,"+SysCardFormBeansUtil.NEW_LINE_ONLY;;
		temp+= SysCardFormBeansUtil.getNbsp(4)+" success: function(text) {"+SysCardFormBeansUtil.NEW_LINE_ONLY;;
		temp+= SysCardFormBeansUtil.getNbsp(5)+"var o = nui.decode(text);"+SysCardFormBeansUtil.NEW_LINE_ONLY;;
		temp+= SysCardFormBeansUtil.getNbsp(5)+"if(o.data!=null) {"+SysCardFormBeansUtil.NEW_LINE_ONLY;;
		temp+= SysCardFormBeansUtil.getNbsp(6)+"e.editor.setData(o.data);"+SysCardFormBeansUtil.NEW_LINE_ONLY;;
		temp+= SysCardFormBeansUtil.getNbsp(5)+"}"+SysCardFormBeansUtil.NEW_LINE_ONLY;;
		temp+= SysCardFormBeansUtil.getNbsp(4)+"}"+SysCardFormBeansUtil.NEW_LINE_ONLY;;
		temp+= SysCardFormBeansUtil.getNbsp(3)+" });"+SysCardFormBeansUtil.NEW_LINE_ONLY;;
		temp+= SysCardFormBeansUtil.getNbsp(6)+"e.editor.setData([{ORGID:111,ORGNAME:'DDD'}]);"+SysCardFormBeansUtil.NEW_LINE_ONLY;;
		return temp;
	}

	/**
	 * 
	 * @param datepicker
	 * @param entityName
	 * @param fieldName
	 * @param htmls
	 * @param request
	 * @param column
	 * @param isAsLabel
	 * @param formCode 
	 * @return
	 */
	public static Object[] getDatepickerHtml(SysDatepickerCache datepicker, String entityName, String fieldName, String[] htmls, SysRequestParam request, SysFormColumnCache column, boolean isAsLabel, String formCode) {
		// TODO 自动生成方法存根
		Object[] ret = SysGridFormColumnUtil.getGridFormGuiHtml(htmls, request, entityName, fieldName, datepicker.getDatepickerDataFromType(),datepicker.getDatepickerDataFromValue(),  datepicker.getDatepickerCheckFun(),
				"11", datepicker.getDatepickerInitFun(), 
				null, null,datepicker.getDatepickerId()+"", column, isAsLabel,datepicker.getDatepickerValuechangeFun(),datepicker.getDatepickerClickFun(),null);
		
		if(datepicker.getDatepickerDrawdateFun()!=null&&!"".equals(datepicker.getDatepickerDrawdateFun())){ //生成日期控件的drawdate事件方法
			String temp = SysCardFormBeansUtil.getNbsp(1)+SysCardFormBeansUtil.JAVASCRIPT_FUNCTION+column.getOnDrawdateFunName()+"(e)"+SysCardFormBeansUtil.JAVASCRIPT_FUN_START+SysCardFormBeansUtil.NEW_LINE_ONLY;
			temp += SysCardFormBeansUtil.getNbsp(2)+datepicker.getDatepickerDrawdateFun()+SysCardFormBeansUtil.NEW_LINE_ONLY;
			temp += SysCardFormBeansUtil.getNbsp(1)+SysCardFormBeansUtil.JAVASCRIPT_FUN_END+SysCardFormBeansUtil.NEW_LINE_ONLY;
			htmls[9] =temp;
		}
		return ret;
	}
	
	/**
	 * checkbox js
	 * @param checkbox
	 * @param entityName
	 * @param fieldName 
	 * @param htmls
	 * @param request
	 * @param column
	 * @param isAsLabel
	 * @return
	 */
	public static Object[] getCheckboxHtml(SysCheckboxCache checkbox, String entityName, String fieldName, String[] htmls, SysRequestParam request, SysFormColumnCache column, boolean isAsLabel) {
		// TODO 自动生成方法存根
		Object[] ret = SysGridFormColumnUtil.getGridFormGuiHtml(htmls, request, entityName, fieldName, checkbox.getCheckboxDataFromType(),checkbox.getCheckboxDataFromValue(),  
				checkbox.getCheckboxCheckFun(),"11", checkbox.getCheckboxInitFun(), null, null,checkbox.getCheckboxId()+"", column,  isAsLabel,checkbox.getCheckboxValuechangeFun(),checkbox.getCheckboxClickFun(),null);
		return ret;
	}
	

	/**
	 * 
	 * @param lookup
	 * @param entityName
	 * @param fieldName
	 * @param htmls
	 * @param request
	 * @param column
	 * @param isAsLabel
	 * @return
	 */
	/*public static Object[] getLookupHtml(SysLookup lookup, String entityName, String fieldName, String[] htmls, HttpServletRequest request, SysFormColumnCache column, boolean isAsLabel) {
		htmls[9] = htmls[9]==null?"":htmls[9];
//		 TODO 自动生成方法存根
		//判断是否需要生成lookup的renderer  
		String renderer = lookup.getLookupClickFun();
		if(renderer==null||"".equals(renderer)){
			if("biz".equals(lookup.getLookupDatabackType())){
				String bizUrl = lookup.getLookupDatabackValue();
				Map<String, List<SysFormGeneralParamCache>> params = lookup.getGeneralParams();
				String endtype = FormParamConstants.OPENPAGE_DATA_RETURN;
				List<SysFormGeneralParamCache>  l = params.get(endtype);
				String paramStr = SysCardFormColumnUtil.getGeneralParamStr(l,request);
				if(paramStr!=null&&!"".equals(paramStr)){
					if(bizUrl!=null&&bizUrl.indexOf("?")>0){
						bizUrl = bizUrl +"&" +paramStr;
					}else {
						bizUrl = bizUrl+"?"+paramStr;
					}
				}
				
				renderer = SysGridFormBeansUtil.getDefaultLookupRenderer(SysGridFormBeansUtil.LOOK_BIZ_BACK_TYPE_FUNNAME_START+column.getForm().getFormDefCode()+column.getFormFiledTablename());
				htmls[9] += SysGridFormBeansUtil.getDefaultLookupBiz(lookup.getLookupShowProperty(),lookup.getLookupValueProperty(), bizUrl, SysGridFormBeansUtil.LOOK_BIZ_BACK_TYPE_FUNNAME_START+column.getForm().getFormDefCode()+column.getFormFiledTablename());
			} else if("sql".equals(lookup.getLookupDatabackType())){
				renderer = SysGridFormBeansUtil.getDefaultLookupRendererSql(SysGridFormBeansUtil.LOOK_SQL_BACK_TYPE_FUNNAME_START+column.getForm().getFormDefCode()+column.getFormFiledTablename());
				
				String url = "com.dcf.form.runtime.exexSqlForNameComp.execSqlForColumnName.biz.ext";
				
				htmls[9] += SysGridFormBeansUtil.getDefaultLookupSql(url,SysGridFormBeansUtil.LOOK_SQL_BACK_TYPE_FUNNAME_START+column.getForm().getFormDefCode()+column.getFormFiledTablename(), column, request, lookup.getBackSql());
			
			}
		}
		Object[] ret = SysGridFormColumnUtil.getGridFormGuiHtml(htmls, request, entityName, fieldName, lookup.getLookupDataFromType(),lookup.getLookupDatabackValue(),  
				lookup.getLookupCheckFun(),"11", lookup.getLookupInitFun(), null, null,lookup.getLookupId()+"", column,isAsLabel,lookup.getLookupValuechangeFun(),renderer,null);
		String winType = lookup.getLookupFormWinType();
		//获取该字段的jsId
		String  columnJsId = column.getJsId("id");
		//根据窗口类型生成onbuttonclick 事件方法
		String onbuttonclickStr = "";
		//生成打开页面方法
		onbuttonclickStr+=SysCardFormBeansUtil.getNbsp(1)+SysCardFormBeansUtil.JAVASCRIPT_FUNCTION+column.getOnButtonClickFunName()+"(e)"+SysCardFormBeansUtil.JAVASCRIPT_FUN_START;
		if("1".equals(winType)||"2".equals(winType)){ //配置窗口
			String[] otherColumnField = new String[2];
			if("other".equals(lookup.getLookupDatabackType())){
				otherColumnField = column.getForm().serchColumnByColumnId(Long.parseLong(lookup.getLookupDatabackValue())).getFiledName();
			}
			onbuttonclickStr +=  SysGridFormBeansUtil.getLookupOpenJs(request,lookup.getLookupWinTitle(), lookup.getLookupWinWidth(), lookup.getLookupWinHeight(), lookup.getLookupFormWinType(), 
					lookup.getLookupFormUrl(), lookup.getLookupFormId(), columnJsId, fieldName, lookup.getLookupDatabackType(), lookup.getLookupDatabackValue(),
					otherColumnField[1],column.getForm().getFormDefCode(), lookup.getLookupShowProperty(), lookup.getLookupValueProperty(),lookup.getGeneralParams()
					,SysGridFormBeansUtil.LOOK_BIZ_BACK_TYPE_FUNNAME_START+column.getForm().getFormDefCode()+column.getFormFiledTablename(),lookup.getlookupCustomDataback(),lookup.getlookupCustomDatabackFun());
			//lookup.getLookupShowProperty(),lookup.getLookupValueProperty()
		}else  { //自定义onbuttonclick事件函数
			onbuttonclickStr += lookup.getLookupButtonclickFun()+SysCardFormBeansUtil.NEW_LINE_ONLY;
		}
		onbuttonclickStr+=SysCardFormBeansUtil.getNbsp(1)+SysCardFormBeansUtil.JAVASCRIPT_FUN_END;
		//生成数据初始化后需要回填id和text方法
		
		*//**String paramType = FormParamConstants.OPENPAGE_DATA_RETURN;
		Map<String,List<SysFormGeneralParamCache>>  gs = lookup.getGeneralParams();
		List<SysFormGeneralParamCache> l = gs.get(paramType); **//*
		
		String  initlookupInitFun = "";
		initlookupInitFun+=SysCardFormBeansUtil.JAVASCRIPT_FUNCTION+SysCardFormBeansUtil.LOOKUP_BACK_FUN_NAME+SysCardFormBeansUtil.JAVASCRIPT_FUN_START;
		//initlookupInitFun+= SysCardFormBeansUtil.getLookupSetTextAndValueJs(request, column.getFormColumnFormDefId()+"", columnJsId, fieldName, lookup.getLookupDatabackType(), lookup.getLookupDatabackValue());
		initlookupInitFun+=SysCardFormBeansUtil.JAVASCRIPT_FUN_END;
		//initlookupInitFun
		
		
		htmls[9] += onbuttonclickStr+"\n"+initlookupInitFun;
		return ret;
	}
*/
 
	

	public static Object[] getGridFormGuiHtml(String[] htmls,SysRequestParam request,String entityName ,String fieldName ,String dataFromType,String dataFromValue,
			String checkFun,String vtype,String initFun,String guiInitType,String guiInitValue,String busId,SysFormColumnCache column, boolean isAsLabel,String cellbegin,String renderer,Map<String,List<SysFormGeneralParamCache>> params){
		Object[] ret = new Object[9];
		String jsId = column.getJsId("id",column.getPojo().getFormColumnFormDefId().toString());
		boolean isCellEdite =false;
		boolean isRender = false;
		boolean isValidation = false;
		boolean isSelfValidation = false;
		
		String dictTypeId = null;
		String url =  null;
		String data = null;
		if(vtype!=null&&!"".equals(vtype)){
			if("fun".equals(vtype)) { //获取自定义校验方案
				htmls[2] = SysGridFormBeansUtil.getCheckFun(fieldName,checkFun);
				isSelfValidation = true;
			}else {
				isValidation = true;
			}
		}
		
		if(cellbegin!=null&&!"".equals(cellbegin)){ //获取cellbegin事件函数
			 htmls[4] = SysGridFormBeansUtil.getCellbeginFun(fieldName,cellbegin);
			 isCellEdite = true;
		}
		
		//生成renderer 函数
		if(renderer!=null&&!renderer.equals("")) {
			 htmls[5] = SysGridFormBeansUtil.getRendererFun(column.getJsId("fun",column.getPojo().getFormColumnFormDefId().toString()),column.getForm().getFormDefCode(),renderer)+SysCardFormBeansUtil.NEW_LINE_ONLY;
			 isRender = true;
		}
		 
//		处理js函数
		if("initFun".equals(dataFromType)){
			htmls[1] = initFun;
		}else if("session".equals(dataFromType)){
			String sessionParamValue = dataFromValue;
			String _value  = "";
			_value =SysCardFormColumnUtil.getSessionValue(request,sessionParamValue,null);//获取session对应值
			String tempjs = SysCardFormBeansUtil.setValueJs(jsId, _value);
			htmls[1]=SysCardFormBeansUtil.getNbsp(2)+tempjs+SysCardFormBeansUtil.NEW_LINE;
		}else if("global".equals(dataFromType)){
			String _value = "";//获取session对应值
			String tempjs = SysCardFormBeansUtil.setValueJs(jsId, _value);
			htmls[1]=SysCardFormBeansUtil.getNbsp(2)+tempjs+SysCardFormBeansUtil.NEW_LINE;
		}else if("parameter".equals(dataFromType)){
			String _value =request.getRequest().getParameter(dataFromValue);
			String tempjs = SysCardFormBeansUtil.setValueJs(jsId, _value);
			htmls[1]=SysCardFormBeansUtil.getNbsp(2)+tempjs+SysCardFormBeansUtil.NEW_LINE;
		}else if("constant".equals(dataFromType)){
			String _value =dataFromValue;
			String tempjs = SysCardFormBeansUtil.setValueJs(jsId, _value);
			htmls[1]=SysCardFormBeansUtil.getNbsp(2)+tempjs+SysCardFormBeansUtil.NEW_LINE;
		}else if("sql".equals(dataFromType)){
			String _value =""; //sql获取对应的数据
			String tempjs = SysCardFormBeansUtil.setValueJs(jsId, _value);
			htmls[1]=SysCardFormBeansUtil.getNbsp(2)+tempjs+SysCardFormBeansUtil.NEW_LINE;
		}else if("currentdate".equals(dataFromType)){ //当前时间
			String _value =""; //sql获取对应的数据
		    java.text.DateFormat format1 = new java.text.SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		    _value = format1.format(new Date());
			String tempjs = SysCardFormBeansUtil.setValueJs(jsId, _value);
			htmls[1]=SysCardFormBeansUtil.getNbsp(2)+tempjs+SysCardFormBeansUtil.NEW_LINE;
		}
		
		
		//初始化控件数据来源
		if("dict".equals(guiInitType)) { //字段类型
			//获取字段类型
			dictTypeId = guiInitValue;
			
		}else if("biz".equals(guiInitType)){
			url = guiInitValue;
			if(params!=null) {
				String endtype = FormParamConstants.GUI_DATA_INIT_BIZ;
				List<SysFormGeneralParamCache>  l = params.get(endtype);
				String paramStr = SysCardFormColumnUtil.getGeneralParamStr(l,request);
				if(paramStr!=null&&!"".equals(paramStr)){
					if(url!=null&&url.indexOf("?")>0){
						url = url +"&" +paramStr;
					}else {
						url = url+"?"+paramStr;
					}
				}
			}
		}else if("json".equals(guiInitType)) {
			data =guiInitValue;
		}else if("sql".equals(guiInitType)) {
			//url = SysCardFormBeansUtil.QUERY_SQL_URL+"?sqlType=query&busType=ridiolist&busId="+busId;
		}
		 /**
		//click方案
		if(clickFun!=null&&!"".equals(clickFun)){
			String temp = SysCardFormBeansUtil.getNbsp(1)+SysCardFormBeansUtil.JAVASCRIPT_FUNCTION+column.getOnClickFunName()+SysCardFormBeansUtil.JAVASCRIPT_FUN_START+SysCardFormBeansUtil.NEW_LINE_ONLY;
			temp += SysCardFormBeansUtil.getNbsp(2)+clickFun+SysCardFormBeansUtil.NEW_LINE_ONLY;
			temp += SysCardFormBeansUtil.getNbsp(1)+SysCardFormBeansUtil.JAVASCRIPT_FUN_END+SysCardFormBeansUtil.NEW_LINE_ONLY;
			
			htmls[2] =temp;
		}
		//valuechange方案
		if(valuechangeFun!=null&&!"".equals(valuechangeFun)){
			String temp = SysCardFormBeansUtil.getNbsp(1)+SysCardFormBeansUtil.JAVASCRIPT_FUNCTION+column.getOnValueChangeFunName()+SysCardFormBeansUtil.JAVASCRIPT_FUN_START+SysCardFormBeansUtil.NEW_LINE_ONLY;
			temp += SysCardFormBeansUtil.getNbsp(2)+valuechangeFun+SysCardFormBeansUtil.NEW_LINE_ONLY;
			temp += SysCardFormBeansUtil.getNbsp(1)+SysCardFormBeansUtil.JAVASCRIPT_FUN_END+SysCardFormBeansUtil.NEW_LINE_ONLY;
			htmls[3] =temp;
		}
//	
 * **/
 
		ret[0] = vtype;
		ret[2] =isCellEdite;
		ret[3] = isRender;
		ret[4] = isValidation;  
		ret[5] = dictTypeId;
		ret[6] =url;
		ret[7] = data;
		ret[8] = isSelfValidation;
		return ret;
	}
}
