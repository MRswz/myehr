package com.myehr.pojo.formmanage.cache;

import java.io.Serializable;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import com.myehr.pojo.formmanage.form.SysGridFilterColumn;
import com.myehr.pojo.sysParam.SysRequestParam;


public class SysGridFilterColumnCache implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SysGridFilterColumn getPojo() {
		return pojo;
	}

	public void setPojo(SysGridFilterColumn pojo) {
		this.pojo = pojo;
	}

	private SysGridFilterColumn pojo ;
	
	private long queryColumnId;
	
	private long gridColumnFilterId;
	
	private String gridColumnLable	;
	
	private long gridColumnId;
	
	private String gridColumnFilterRule;
	
	private int gridColumnSort;
	
	private int gridColumnColSpan;
	
	private String gridColumnIsIntervais; 
	
	private SysGridFilterCache gridFilter ;
	
	private String gridColumnWidth;
	
	/**
	 * 保留关联字段的引用
	 */
	private SysFormColumnCache column ;
	
	
	private Date operatorTime;
	
	private String operatorName;

	public int getGridColumnColSpan() {
		return gridColumnColSpan;
	}

	public void setGridColumnColSpan(int gridColumnColSpan) {
		this.gridColumnColSpan = gridColumnColSpan;
	}

	public long getGridColumnFilterId() {
		return gridColumnFilterId;
	}

	public void setGridColumnFilterId(long gridColumnFilterId) {
		this.gridColumnFilterId = gridColumnFilterId;
	}

	public String getGridColumnFilterRule() {
		return gridColumnFilterRule;
	}

	public void setGridColumnFilterRule(String gridColumnFilterRule) {
		this.gridColumnFilterRule = gridColumnFilterRule;
	}

	public long getGridColumnId() {
		return gridColumnId;
	}

	public void setGridColumnId(long gridColumnId) {
		this.gridColumnId = gridColumnId;
	}

	public String getGridColumnIsIntervais() {
		return gridColumnIsIntervais;
	}

	public void setGridColumnIsIntervais(String gridColumnIsIntervais) {
		this.gridColumnIsIntervais = gridColumnIsIntervais;
	}

	public String getGridColumnLable() {
		return gridColumnLable;
	}

	public void setGridColumnLable(String gridColumnLable) {
		this.gridColumnLable = gridColumnLable;
	}

	public int getGridColumnSort() {
		return gridColumnSort;
	}

	public void setGridColumnSort(int gridColumnSort) {
		this.gridColumnSort = gridColumnSort;
	}

	public String getOperatorName() {
		return operatorName;
	}

	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
	}

	public Date getOperatorTime() {
		return operatorTime;
	}

	public void setOperatorTime(Date operatorTime) {
		this.operatorTime = operatorTime;
	}

	public long getQueryColumnId() {
		return queryColumnId;
	}

	public void setQueryColumnId(long queryColumnId) {
		this.queryColumnId = queryColumnId;
	}

	public SysFormColumnCache getColumn() {
		return column;
	}

	public void setColumn(SysFormColumnCache column) {
		this.column = column;
	}
	

	public SysGridFilterCache getGridFilter() {
		return gridFilter;
	}

	public void setGridFilter(SysGridFilterCache gridFilter) {
		this.gridFilter = gridFilter;
	}
	
	public String getGridColumnWidth() {
		return gridColumnWidth;
	}

	public void setGridColumnWidth(String gridColumnWidth) {
		this.gridColumnWidth = gridColumnWidth;
	}


	
	public  SysGridFilterColumnCache(SysGridFilterColumn obj,SysFormconfigCache form,SysGridFilterCache gridFilter) {
		// TODO 自动生成构造函数存根
		this.setThisByDataObject(obj);
		this.column = form.serchColumnByColumnId(this.pojo.getGridColumnId().longValue());
		this.gridFilter = gridFilter;
	}
	
	

	/**
	 * @param obj
	 */
	public void setThisByDataObject(SysGridFilterColumn obj){
		this.pojo=obj;
	}

	
	
	
	/**
	 * 生成js和html代码
	 * @param request
	 * @return
	 * @throws Exception 
	 */
	public String[] getHtmlsFrom(SysRequestParam request,String formId,String isApp,String isFilter) throws Exception {
		// TODO 自动生成方法存根
		//String[] htmls = this.column.getHtmlsFrom(request);
		String[] htmls = new String[SysCardFormBeansUtil.HTML_SILZE];
		SysFormColumnCache c = this.getColumn();
		String[] fs = c.getFiledName();
		String entityName = fs[0];
		String fieldName = fs[1];
		String str = "";
		//控件类型
		String guiType = c.getFormColumnGuiType(); //获取控件类型
		
		String vtype =null;
		if("1".equals(guiType)||"8".equals(guiType)) { //textbox控件处理
			if("Y".equals(this.pojo.getGridColumnIsIntervais())&&isApp!=null&&isApp.equals("APP")&&isFilter!=null&&isFilter.equals("Filter")){ //区间查询	
					String classType =SysCardFormBeansUtil.CARD_FORM_TEXT_BOX;
					str += SysCardFormBeansUtil.getTextBoxHtmlIntervais(classType,"FILTER_"+c.getJsId("id",formId),fieldName, vtype , null, false, false, false,false,false,entityName,this.getGridColumnWidth(),null,this.getColumn().getFormColumnFormDefId(),isApp,this.pojo.getGridColumnLable());
					htmls[20] = str;	
			}
		}else if("2".equals(guiType)){	
			if(isApp!=null&&isApp.equals("APP")&&isFilter!=null&&isFilter.equals("Filter")){
				String title = this.pojo.getGridColumnLable();
				SysFormComboboxCache combobox =  (SysFormComboboxCache)c.getFormColumGui();
				boolean isExit = false;
				if(combobox!=null&&combobox.getComboboxId()!=0){ //满足说明用户保存该控件的扩展属性
					isExit = true;
				}
				boolean ShowNullItem = true;
				if(combobox.getPojo().getComboboxShownullitem()!=null){
					ShowNullItem = combobox.getPojo().getComboboxShownullitem().equals("0")?true:false ;//是否显示空项；
				}
				
				boolean multiselect =isExit==false?false:( "true".equals(combobox.getComboboxMultiselect())||"Y".equals(combobox.getComboboxMultiselect())); 
				String textField = isExit==false?null:(combobox.getComboboxTextfield());
				String valueField = isExit==false?null:(combobox.getComboboxValuefield());
				String emptyText = isExit==false?null:( combobox.getComboboxEmptytext());
				boolean allowInput = isExit==false?false:( "true".equals(combobox.getComboboxAllowinput())||"Y".equals(combobox.getComboboxAllowinput()));
				String dataField =isExit==false?null:( combobox.getComboboxDatafield());
				String nullItemText =isExit==false?null:( combobox.getComboboxNullitemtext());
				
				if (ShowNullItem) {
					nullItemText=null;
				}
				
				String dictTypeId = null;
				String url = null;
				String data = null;
				if(isExit){ //满足说明用户保存该控件的扩展属性
					Object[] ret = SysCardFormColumnUtil.getComboboxHtml(combobox, entityName, fieldName, htmls, request, c,false,null,true,combobox.getPojo().getComboboxDictNameColumn(),isApp);
					vtype =(String)ret[0];
					dictTypeId = (String)ret[5];
					url = (String)ret[6];
					data = (String)ret[7];
				}
				String classType = dictTypeId==null?SysCardFormBeansUtil.CARD_FORM_COMBO_BOX:SysCardFormBeansUtil.CARD_FORM_COMBO_BOX;if (dictTypeId!=null && dictTypeId!="") {
					dataField = "dictList";
				}
				str += SysCardFormBeansUtil.getComboboxHtml(classType,"FILTER_"+c.getJsId("id",formId),fieldName,title,vtype , emptyText, false, false, false,false,false,entityName,this.getGridColumnWidth()
						,ShowNullItem,textField,valueField,allowInput,dictTypeId,nullItemText,url,data,dataField,multiselect,this.getColumn().getFormColumnFormDefId(),isApp,this.getGridColumnId()+"",null,null,isFilter, combobox.getPojo().getComboboxIsSearch());
				htmls[20] = str;		
			}else {
				str+=SysCardFormBeansUtil.getTdHtml(null, null, this.gridFilter.getGridFilterLableWidth()+"", null,0);
//				str+=SysCardFormBeansUtil.CARD_FORM_lable_START;
				str+=SysCardFormBeansUtil.getBuildCardForm9(this.gridFilter.getGridFilterLableWidth()+"");
				str+=this.pojo.getGridColumnLable()+": ";
				String title = this.pojo.getGridColumnLable();
				str+=SysCardFormBeansUtil.CARD_FORM_lable_END;
				str+=SysCardFormBeansUtil.CARD_FORM_TABLE_TD_END;
				str+=SysCardFormBeansUtil.getTdHtml(c.getFormColumnAlign(), null, this.gridFilter.getGridFilterLableWidth()+"", null,this.getGridColumnColSpan());
				SysFormComboboxCache combobox =  (SysFormComboboxCache)c.getFormColumGui();
				boolean isExit = false;
				if(combobox!=null&&combobox.getComboboxId()!=0){ //满足说明用户保存该控件的扩展属性
					isExit = true;
				}
				System.out.println(combobox.getPojo().getComboboxShownullitem());
				boolean ShowNullItem = true;
				if(combobox.getPojo().getComboboxShownullitem()!=null){
					ShowNullItem = combobox.getPojo().getComboboxShownullitem().equals("Y")?true:false ;//是否显示空项；
				}
				
				boolean multiselect =isExit==false?false:( "true".equals(combobox.getComboboxMultiselect())||"Y".equals(combobox.getComboboxMultiselect())); 
				String textField = isExit==false?null:(combobox.getComboboxTextfield());
				String valueField = isExit==false?null:(combobox.getComboboxValuefield());
				String emptyText = isExit==false?null:( combobox.getComboboxEmptytext());
				boolean allowInput = isExit==false?false:( "true".equals(combobox.getComboboxAllowinput())||"Y".equals(combobox.getComboboxAllowinput()));
				String dataField =isExit==false?null:( combobox.getComboboxDatafield());
				String nullItemText =isExit==false?null:( combobox.getComboboxNullitemtext());
				if (!ShowNullItem) {
					nullItemText=null;
				}
				String dictTypeId = null;
				String url = null;
				String data = null;
				if(isExit){ //满足说明用户保存该控件的扩展属性
					Object[] ret = SysCardFormColumnUtil.getComboboxHtml(combobox, entityName, fieldName, htmls, request, c,false,null,true,combobox.getPojo().getComboboxDictNameColumn(),isApp);
					vtype =(String)ret[0];
					dictTypeId = (String)ret[5];
					url = (String)ret[6];
					data = (String)ret[7];
				}
				//String classType = dictTypeId==null?SysCardFormBeansUtil.CARD_FORM_COMBO_BOX:SysCardFormBeansUtil.CARD_FORM_DICT_COMBO_BOX;
				// 修复dict下拉的查询条件选择问题
				String classType = dictTypeId==null?SysCardFormBeansUtil.CARD_FORM_COMBO_BOX:SysCardFormBeansUtil.CARD_FORM_COMBO_BOX;
				
				if("Y".equals(this.pojo.getGridColumnIsIntervais())){ //区间查询
					str += SysCardFormBeansUtil.getTextBoxHtmlIntervais(classType,"FILTER_"+c.getJsId("id",formId),fieldName,title,vtype , emptyText, false, false, false,false,false,entityName,this.getGridColumnWidth()
							,ShowNullItem,textField,valueField,allowInput,dictTypeId,nullItemText,url,data,dataField,multiselect,this.getColumn().getFormColumnFormDefId(),isApp,this.getGridColumnId()+"",null,null,isFilter, combobox.getPojo().getComboboxIsSearch());
				}else {
					if (dictTypeId!=null && dictTypeId!="") {
						dataField = "dictList";
					}
					str += SysCardFormBeansUtil.getComboboxHtml(classType,"FILTER_"+c.getJsId("id",formId),fieldName,title,vtype , emptyText, false, false, false,false,false,entityName,this.getGridColumnWidth()
							,ShowNullItem,textField,valueField,allowInput,dictTypeId,nullItemText,url,data,dataField,multiselect,this.getColumn().getFormColumnFormDefId(),isApp,this.getPojo().getGridColumnId()+"",null,null,isFilter, combobox.getPojo().getComboboxIsSearch());
				}
				str +=SysCardFormBeansUtil.CARD_FORM_TABLE_TD_END;
				htmls[0] = str;
			}
		}else if("6".equals(guiType)){
			if(isApp!=null&&isApp.equals("APP")&&isFilter!=null&&isFilter.equals("Filter")){
				SysDatepickerCache datepicker = (SysDatepickerCache)c.getFormColumGui();
				boolean isExit = false; 
				if(datepicker!=null&&datepicker.getDatepickerId()!=0){ //满足说明用户保存该控件的扩展属性
					isExit = true;
				}
				String format = isExit==false?null:datepicker.getDatepickerFormat();
				String timeformat = isExit==false?null:datepicker.getDatepickerTimeformat();
				boolean showtime = isExit==false?false:"1".equals(datepicker.getDatepickerShowtime());
				boolean showokbutton =isExit==false?false: "1".equals(datepicker.getDatepickerShowokbutton());
				boolean showclearbutton =isExit==false?false: "1".equals(datepicker.getDatepickerShowclearbutton());
				boolean allowinput = isExit==false?false:"1".equals(datepicker.getDatepickerAllowinput());
				boolean showtodaybutton =isExit==false?false: "1".equals(datepicker.getDatepickerShowtodaybutton());
				if(isExit){ //满足说明用户保存该控件的扩展属性
					Object[] ret = SysCardFormColumnUtil.getDatepickerHtml(datepicker, entityName, fieldName, htmls, request, c,false,true,isApp);
					vtype =(String)ret[0];
				}
				String classType = null;
				if (datepicker.getDatepickerFormat().equals("yyyy-MM-dd")) {
					classType = "date";
				}else if (datepicker.getDatepickerFormat().equals("yyyy-MM-dd HH:mm:ss")) {
					classType = "datetime";
				}else if (datepicker.getDatepickerFormat().equals("hh:mm")) {
					classType = "time";
				}else if (datepicker.getDatepickerFormat().equals("yyyyMM")) {
					classType = "month";
				}
				if("Y".equals(this.pojo.getGridColumnIsIntervais())){ //区间查询
					str += SysCardFormBeansUtil.getDatepickerHtmlIntervais(classType,"FILTER_"+c.getJsId("id",formId),fieldName,vtype , null, false, false, false,false,false,entityName,this.getPojo().getGridColumnWidth()
							,format,timeformat,showtime,showokbutton,showclearbutton,allowinput,showtodaybutton,false,this.getColumn().getFormColumnFormDefId(),isApp);
				}else {
					str += SysCardFormBeansUtil.getDatepickerHtml(classType,"FILTER_"+c.getJsId("id",formId),fieldName,vtype , null, false, false, false,false,false,entityName,this.getPojo().getGridColumnWidth()
							,format,timeformat,showtime,showokbutton,showclearbutton,allowinput,showtodaybutton,false,this.getColumn().getFormColumnFormDefId(),isApp,"");
				}
				htmls[20] = str;
			}else {
				str+=SysCardFormBeansUtil.getTdHtml(null, null, this.gridFilter.getGridFilterLableWidth()+"", null,0);
				str+=SysCardFormBeansUtil.getBuildCardForm9(this.gridFilter.getGridFilterLableWidth()+"");
         	//	str+=SysCardFormBeansUtil.CARD_FORM_lable_START;
				str+=this.pojo.getGridColumnLable()+": ";
//				String title = this.pojo.getGridColumnLable();
				str+=SysCardFormBeansUtil.CARD_FORM_lable_END;
				str+=SysCardFormBeansUtil.CARD_FORM_TABLE_TD_END;
				SysDatepickerCache datepicker = (SysDatepickerCache)c.getFormColumGui();
				boolean isExit = false; 
				if(datepicker!=null&&datepicker.getDatepickerId()!=0){ //满足说明用户保存该控件的扩展属性
					isExit = true;
				}
				String format = isExit==false?null:datepicker.getDatepickerFormat();
				String timeformat = isExit==false?null:datepicker.getDatepickerTimeformat();
				boolean showtime = isExit==false?false:"1".equals(datepicker.getDatepickerShowtime());
				boolean showokbutton =isExit==false?false: "1".equals(datepicker.getDatepickerShowokbutton());
				boolean showclearbutton =isExit==false?false: "1".equals(datepicker.getDatepickerShowclearbutton());
				boolean allowinput = isExit==false?false:"1".equals(datepicker.getDatepickerAllowinput());
				boolean showtodaybutton =isExit==false?false: "1".equals(datepicker.getDatepickerShowtodaybutton());
				if(isExit){ //满足说明用户保存该控件的扩展属性
					Object[] ret = SysCardFormColumnUtil.getDatepickerHtml(datepicker, entityName, fieldName, htmls, request, c,false,true,isApp);
					vtype =(String)ret[0];
				}
				
				String classType = null;
				if (datepicker.getDatepickerFormat().equals("yyyy-MM-dd")) {
					classType = SysCardFormBeansUtil.CARD_FORM_DATEPICKER1;
				}else if (datepicker.getDatepickerFormat().equals("yyyy-MM-dd HH:mm:ss")) {
					classType = SysCardFormBeansUtil.CARD_FORM_DATEPICKER2;
				}else if (datepicker.getDatepickerFormat().equals("hh:mm")) {
					classType = SysCardFormBeansUtil.CARD_FORM_DATEPICKER3;
				}else if (datepicker.getDatepickerFormat().equals("yyyyMM")) {
					classType = SysCardFormBeansUtil.CARD_FORM_DATEPICKER4;
				}
				if("Y".equals(this.pojo.getGridColumnIsIntervais())){ //区间查询
					String width = Integer.valueOf(c.getFormColumnWidth().substring(0, c.getFormColumnWidth().length()-2))*2+40+""; 
					str+=SysCardFormBeansUtil.getTdHtml(c.getFormColumnAlign(), null, width, null,this.getGridColumnColSpan());
					str += SysCardFormBeansUtil.getDatepickerHtmlIntervais(classType,"FILTER_"+c.getJsId("id",formId),fieldName,vtype , null, false, false, false,false,false,entityName,this.getPojo().getGridColumnWidth()
							,format,timeformat,showtime,showokbutton,showclearbutton,allowinput,showtodaybutton,false,this.getColumn().getFormColumnFormDefId(),isApp);
				}else {
					str+=SysCardFormBeansUtil.getTdHtml(c.getFormColumnAlign(), null, c.getFormColumnWidth(), null,this.getGridColumnColSpan());
					str += SysCardFormBeansUtil.getDatepickerHtml(classType,"FILTER_"+c.getJsId("id",formId),fieldName,vtype , null, false, false, false,false,false,entityName,this.getPojo().getGridColumnWidth()
							,format,timeformat,showtime,showokbutton,showclearbutton,allowinput,showtodaybutton,false,this.getColumn().getFormColumnFormDefId(),isApp,"");
				}
				str +=SysCardFormBeansUtil.CARD_FORM_TABLE_TD_END;
				htmls[0] = str;
			}
			
		}
		
		return htmls;
	}


	
}
