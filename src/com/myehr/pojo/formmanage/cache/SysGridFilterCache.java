package com.myehr.pojo.formmanage.cache;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.myehr.common.util.SpringContextUtils;
import com.myehr.pojo.formmanage.form.SysCardFormBeansUtil;
import com.myehr.pojo.formmanage.form.SysGridFilter;
import com.myehr.pojo.formmanage.form.SysGridFilterColumn;
import com.myehr.pojo.sysParam.SysRequestParam;
import com.myehr.service.formmanage.form.ISysformconfigService;



public class SysGridFilterCache implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;



	private SysGridFilter pojo;
	
	public SysGridFilter getPojo() {
		return pojo;
	}

	public void setPojo(SysGridFilter pojo) {
		this.pojo = pojo;
	}


	private List<SysGridFilterColumnCache> filterColumns = new ArrayList<SysGridFilterColumnCache>();
	//移动端查询字段
	private List<SysGridFilterColumnCache> mobileFilterColumns = new ArrayList<SysGridFilterColumnCache>();
	
	private SysFormconfigCache form;

	public SysFormconfigCache getForm() {
		return form;
	}

	public void setForm(SysFormconfigCache form) {
		this.form = form;
	}

	public long getGridFilterFormDefId() {
		if (pojo==null) {
			return 0 ;
		}
		return pojo.getGridFilterFormDefId().longValue();
	}

	public List<SysGridFilterColumnCache> getMobileFilterColumns() {
		return mobileFilterColumns;
	}

	public void setMobileFilterColumns(
			List<SysGridFilterColumnCache> mobileFilterColumns) {
		this.mobileFilterColumns = mobileFilterColumns;
	}

	public String getGridFilterHeightGrade() {
		return pojo.getGridFilterHeightGrade();
	}


	public long getGridFilterId() {
		return pojo.getGridFilterId().longValue();
	}


	public int getGridFilterRowCount() {
		return  pojo.getGridFilterRowCount().intValue();
	}


	public String getOperatorName() {
		return pojo.getOperatorName();
	}

	public Date getOperatorTime() {
		return pojo.getOperatorTime();
	}

	

	public List<SysGridFilterColumnCache> getFilterColumns() {
		return filterColumns;
	}
	
	public String getGridFilterLableWidth() {
		return pojo.getGridFilterLableWidth();
	}


	public void setFilterColumns(String formId,SysFormconfigCache form) {
		ISysformconfigService service = (ISysformconfigService)SpringContextUtils.getBeanById("ISysformconfigService");
		List<SysGridFilterColumn> objs = service.getFormFilterColumnsFromData(formId);
		if(objs!=null&&objs.size()>0){
			for(SysGridFilterColumn temp:objs){
				SysGridFilterColumnCache gc = new SysGridFilterColumnCache(temp,form,this);
				this.filterColumns.add(gc);
				if (temp.getIsshowmobile()!=null&&temp.getIsshowmobile().equals("true")) {
					this.mobileFilterColumns.add(gc);
				}
			}
		}
	}

	/*
	 * 构造函数 通过DataObject加载对象
	 */
	public SysGridFilterCache(String formId,SysFormconfigCache form){
		ISysformconfigService service = (ISysformconfigService)SpringContextUtils.getBeanById("ISysformconfigService");
		SysGridFilter obj = service.getFormFilter(formId);
		this.form = form;
		if(obj!=null){
			this.setThisByDataObject(obj);
//			加载对应查询字段列表信息
			this.setFilterColumns(formId,form);
		}
		
	}
	
	/**
	 * @param obj
	 */
	public void setThisByDataObject(SysGridFilter obj){
		this.pojo=obj;
	}
	
	public void write(StringBuffer[] sbs,HttpServletRequest request){
		
	}
	
	public void getJs(){
		
	}
	
	 
	/**
	 * 把未分组的字段对象转成html代码 和分组逻辑区别不大
	 * @param sb
	 * @throws Exception 
	 */
	@SuppressWarnings("unused")
	public void writeFilter (SysRequestParam request,StringBuffer[] sbs,String formId,String isApp,String isFilter) throws Exception{
		/*DataObject[] fields = null;
		if (!"true".equals(isView)) {
			//IFormCacheBeanUtil service = (IFormCacheBeanUtil) ApplicationContextFactory.getContext().getBean("IFormCacheBeanUtil");
			IFormCacheBeanUtil service = (IFormCacheBeanUtil)SpringContextUtils.getBeanById("IFormCacheBeanUtil");
			// 获取当前表单和当前用户下所有有权限字段集合。
			fields = service.queryFieldByUserIdAndFormId(formId + "", DcfUtil.getUserId());
		}*/
		List<SysGridFilterColumnCache> f = this.filterColumns;
		if(f!=null&&f.size()>0){
			int ccount = f.size();
			//满足条件
			if (isApp!=null&&isApp.equals("APP")) {
							
			} else {
				sbs[24].append("<div class=\"input-group\" style=\"z-index: 5;float:right\">\n");//width:100%;
				sbs[24].append("    <div id=\"grid_"+this.form.getFormDefCode()+"_filter\">\n");
				sbs[24].append("        <table class=\"cbs-table\" style=\"width:100%\">\n ");
				sbs[24].append("            <tr>\n");
			}
			int formRowCount = this.getGridFilterRowCount();
			//System.out.println("求余数:"+(ccount/groupRowCount)%2);
//			计算总共需要多少行
			int i=0;
			int k=0;
			int ri = 0;
			int rowCount = 0;
			boolean flag =false;

			int htmlsNum = 0;
			String id="";
			String name="";
			String placeholder="";
			SysFormColumnCache b = this.getFilterColumns().get(0).getColumn();
			String[] fs = b.getFiledName();
			String entityName = fs[0];
			String fieldName = fs[1];
			boolean isNeed = false;
			String urlParam = "/myehr/jsp/form/filter/frontParam.jsp?";
			String htmlt =""; 
			while(i<ccount){
				
				if(i==0){
					id="FILTER_"+this.getPojo().getGridFilterFormDefId();
					name="FILTER_"+this.getPojo().getGridFilterFormDefId();
				}

				//生成td
				SysGridFilterColumnCache c = f.get(i);
				String columnId_ =  c.getPojo().getGridColumnId()+"";
				String formAuthorityIsControl = form.getFormAuthorityIsControl();
				//boolean hsFieldRigt = SysCardFormBeansUtil.hasFiled(fields, columnId_, request.getParameter("isView"),formAuthorityIsControl);
				/*if(hsFieldRigt==false){ //无权限跳过
					i++;
					continue;
				}*/
				
				int contField = c.getGridColumnColSpan();
				contField =  contField<2?1:contField;
				int rcount = contField*2-1;
				//先确认当前循环的行能不能放的了当前字段的跨字段数
				//获取当前行后面还能够放几字段
				int leaveCount = formRowCount - rowCount;
					String temptd = null;
				String[] htmls = null;
				
				if(1>2) { //说明后面字段不够放，重新起下一行
					temptd = SysCardFormBeansUtil.getEmptyTd((leaveCount-contField)*3);
				}else {
					rcount = rcount==0?1:rcount;
					htmls = c.getHtmlsFrom(request,formId,isApp,isFilter);
				}
//				if(rowCount==0){ //生成tr开始
//					sbs[24].append("            <tr>\n");
//				}
				if (htmls[0]!=null) {
					htmlsNum++;
				} 
				
				if(temptd!=null){
					sbs[24].append(temptd);
					k++;
					rowCount = formRowCount-contField; //直接设置行尾 以便下一循环会重起一行
					i--;
				}else {
					if(htmls!=null&&((htmls[0]!=null&&!htmls[0].equals(""))||(htmls[20]!=null&&!htmls[20].equals("")))){
						if (isApp!=null&&isApp.equals("APP")) {
							sbs[24].append(htmls[20]);
							k++;
						} else {
							sbs[24].append(htmls[0]);
							k++;
						}
						
					}else {
						if (c.getGridFilter().getFilterColumns().get(i).getPojo().getGridColumnColSpan()!=null&&c.getGridFilter().getFilterColumns().get(i).getPojo().getGridColumnColSpan().equals("1")) {
							
						}else {
							placeholder=placeholder+this.getFilterColumns().get(i).getPojo().getGridColumnLable()+",";
						}
						
						if (k==ccount-1&&placeholder.length()>1) {
							if(isApp!=null&&isApp.equals("APP")){
								sbs[33].append( SysCardFormBeansUtil.getNbsp(3)+"<div id=\"searchInput\" style=\"z-index: 50;margin:0;padding: 5px 10px;background: #fff;position:relative;\">\n" +
												SysCardFormBeansUtil.getNbsp(4)+"<div class=\"mui-input-row mui-search\" style=\"z-index: 100;background: #fff;\">\n" +
												SysCardFormBeansUtil.getNbsp(5)+"<input type=\"search\" id=\""+id+"\" name=\""+name+"\" class=\"mui-input-clear\" placeholder=\""+placeholder.substring(0,placeholder.length()-1)+"\" style=\"margin: 0;\">\n" +
												SysCardFormBeansUtil.getNbsp(4)+"</div>\n" +
												SysCardFormBeansUtil.getNbsp(3)+"</div>\n");
							}else{
								sbs[24].append( SysCardFormBeansUtil.getNbsp(3)+"<td style=\"float:right;padding-top:5px\">\n" +
												SysCardFormBeansUtil.getNbsp(4)+"<input id=\""+id+"\" name=\""+name+"\" placeholder=\""+placeholder.substring(0,placeholder.length()-1)+"\" style=\"padding: 6px 30px 6px 10px;min-height:24px;font-size:12px\" title=\""+placeholder.substring(0,placeholder.length()-1)+"\" type=\"text\" class=\"form-control\" oninput=\"grid_"+this.form.getFormDefCode()+"_fun11_"+formId+"()\" />\n" +
												SysCardFormBeansUtil.getNbsp(4)+"<i class=\"icon-search\" style=\"position: absolute;right: 12px;top: 2px;cursor: pointer;\"></i>\n" +
												SysCardFormBeansUtil.getNbsp(3)+"</td>\n");
							}
						}
						k++;
					}
				}
//				if(rowCount==0){ //生成tr结束
//					if(flag==false&&htmls[0]!=null){
//						sbs[24].append(SysCardFormBeansUtil.getSearchButtons(this.pojo.getGridFilterHeightGrade(),this.form.getFormDefCode()));
//						flag=true;
//					}
//					sbs[24].append("            </tr>\n");
//				}
				rowCount+=contField;
				i++;
				ri ++;
				if(formRowCount==rowCount){
					rowCount = 0;
				}
				
				sbs[9].append(htmls==null||htmls[9]==null?"":htmls[9]);
				if(htmls!=null&&htmls[1]!=null&&!"".equals(htmls[1]))
					sbs[1].append(htmls[1]);
				if(htmls!=null&&htmls[2]!=null&&!"".equals(htmls[2]))
					sbs[2].append(htmls[2]);
				if(htmls!=null&&htmls[3]!=null&&!"".equals(htmls[3]))
					sbs[3].append(htmls[3]);
				if(htmls!=null&&htmls[4]!=null&&!"".equals(htmls[4]))
					sbs[4].append(htmls[4]);
				if(htmls!=null&&htmls[8]!=null&&!"".equals(htmls[8]))
					sbs[8].append(htmls[8]);
				String str = htmls[8];
				if(htmls!=null&&htmls[11]!=null&&!"".equals(htmls[11])) //js开头代码
					sbs[11].append(htmls[11]);
				if(htmls!=null&&htmls[14]!=null&&!"".equals(htmls[14])) //js开头代码
					sbs[14].append(htmls[14]);
				if(htmls!=null&&htmls[15]!=null&&!"".equals(htmls[15])) //js开头代码
					sbs[15].append(htmls[15]);
			
				if(htmls!=null&&htmls[0]!=null){
					isNeed = true;
				}
			}
			
			String flag1 = "N";
			String temp = SysCardFormBeansUtil.getNbsp(0)+"function initFilterParam_"+formId+"(data){\n";	
			for(int x1 = 0,x2=0 ;x1<this.form.getParams().size();x1++){
				if (this.form.getParams().get(x1)[0].equals("p")) {
					flag1 = "Y";
					urlParam += "param_"+x2+"="+this.form.getParams().get(x1)[1]+"&";
					String paramName = "var " + this.form.getParams().get(x1)[1] + "='';\n";
					temp += SysCardFormBeansUtil.getNbsp(1)+this.form.getParams().get(x1)[1]+" = data["+x2+"];\n";
					sbs[53].append(paramName);
					x2++;
				}
			}
			temp +=SysCardFormBeansUtil.getNbsp(0)+"}\n";
			sbs[53].append(temp);
			/*前置参数js*/
					
			
			if (flag1.equals("Y")) {
				sbs[51].append("var url = '"+ urlParam+"';");
				sbs[51].append(SysGridFormBeansUtil.frontParam1());
				sbs[52].append(SysGridFormBeansUtil.frontParam2());
			}
			
			if(flag==false&&isNeed == true){
				sbs[24].append(SysCardFormBeansUtil.getSearchButtons(this.pojo.getGridFilterHeightGrade(),this.form.getFormDefCode(),this.form.getFormDefId()+""));

				/*sbs[29].append("$(\".fixed-table-toolbar\").css(\"margin-top\",\"38px\");\n");
				sbs[29].append("$(\".container-fluid\").css(\"max-height\",\"100%\");\n");
				sbs[29].append("$(\".container-fluid\").css(\"padding-left\",\"0\");\n");
				sbs[29].append("$(\".fixed-table-container\").css(\"height\",$('.container-fluid').height() -99 +\"px\");\n");
				sbs[29].append("$(\".fixed-table-body\").css(\"height\",\"93%\");\n");
				sbs[29].append("$(\".input-group\").css(\"z-index\",\"7\");\n");*/
				sbs[29].append("gridPatterns1();\n");
				sbs[49].append(isNeed);
			}else if(this.pojo.getGridFilterHeightGrade().equals("true")){
				sbs[24].append("<td style=\"margin-left:10px;float:left;padding-top:5px\" align=\"left\" >\n");
				sbs[24].append(SysCardFormBeansUtil.getSearchButtons(this.form.getFormDefCode(),this.form.getFormDefId()+""));
				sbs[24].append("</div>\n");
				sbs[24].append(SysCardFormBeansUtil.CARD_FORM_TABLE_TD_END);
			}else{
				sbs[29].append("gridPatterns2();\n");
				/*sbs[29].append("$(\".fixed-table-toolbar\").css(\"margin-top\",\"0px\");\n");
				sbs[29].append("$(\".container-fluid\").css(\"max-height\",\"100%\");\n");
				sbs[29].append("$(\".container-fluid\").css(\"padding-left\",\"0\");\n");
				sbs[29].append("$(\".fixed-table-container\").css(\"height\",$('body').height() -79 +\"px\");\n");
				sbs[29].append("$(\".fixed-table-body\").css(\"height\",\"93%\");\n");
				sbs[29].append("$(\".input-group\").css(\"padding-bottom\",\"0px\");\n");*/
			}
			if (isApp!=null&&isApp.equals("APP")) {
							
			} else {
				sbs[24].append("            </tr>\n");
				sbs[24].append("        </table>\n");
				sbs[24].append("    </div>\n");
				sbs[24].append("</div>\n");
			}
		}else if (this.pojo!=null&&this.pojo.getGridFilterHeightGrade()!=null&&(this.pojo.getGridFilterHeightGrade().equals("true"))) {
			sbs[24].append("<div class=\"input-group\" style=\"z-index: 5;float:right\">\n");//width:100%;
			sbs[24].append("    <div id=\"grid_"+this.form.getFormDefCode()+"_filter\">\n");
			sbs[24].append("        <table class=\"cbs-table\" style=\"width:100%\">\n ");
			sbs[24].append("            <tr>\n");
			sbs[24].append("<td style=\"margin-left:10px;float:left;padding-top:5px\" align=\"left\" >\n");
			sbs[24].append(SysCardFormBeansUtil.getSearchButtons(this.form.getFormDefCode(),this.form.getFormDefId()+""));
			sbs[24].append("</div>\n");
			sbs[24].append(SysCardFormBeansUtil.CARD_FORM_TABLE_TD_END);
			sbs[24].append("            </tr>\n");
			sbs[24].append("        </table>\n");
			sbs[24].append("    </div>\n");
			sbs[24].append("</div>\n");
		}
		System.out.println(sbs[10].toString());
		System.out.println(11111);
	}
}
