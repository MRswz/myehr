package com.myehr.pojo.formmanage.cache;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.myehr.common.util.SpringContextUtils;
import com.myehr.pojo.formmanage.form.SysFormGeneralParam;
import com.myehr.pojo.formmanage.widget.SysFormTextbox;
import com.myehr.service.formmanage.form.generalparam.ISysFormGeneralParamService;
import com.myehr.service.formmanage.form.widget.ITextBoxService;

public class SysFormTextareaCache implements Serializable {
		
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

		SysFormTextbox pojo;
	
		//初始化数据关联公式
		private String textboxScheme;
		
		//是否设置字段链接
		private String textBoxIsLink;
		
		//字段链接是否是表单
		private String textBoxLinkIsForm;
		
		//字段链接对应的表单ID
		private long textBoxLinkForm;
		
		//字段链接自定义url
		private String textBoxLinkUrl;
		
		//空 提示文字
		private String textboxEmptytext;
		
		//TEXTBOX_LINK_WIN_OPEN_TYPE	VARCHAR2(20)	Y			字段链接窗口打开方式 1 nui.open 2 新页面。
		private String textboxLinkWinOpenType ;
		
		//TEXTBOX_LINK_WIN_TITLE	VARCHAR2(128)	Y			字段链接窗口方式1的标题
		private String textboxLinkWinTitle;
		
		//TEXTBOX_LINK_WIN_WIDTH	VARCHAR2(20)	Y			字段链接窗口方式1的窗口宽度
		private String textboxLinkWinWidth;
		
		//TEXTBOX_LINK_WIN_HEIGHT	VARCHAR2(20)	Y			字段链接窗口方式1的窗口高度
		private String textboxLinkWinHeight;
		
		//TEXTBOX_LINK_SUCCESS_DEAL	VARCHAR2(20)	Y			字段链接窗口方式1成功处理完后处理方式
		private String textboxLinkSuccessDeal;
		
		public String getTextboxLinkSuccessDeal() {
			return textboxLinkSuccessDeal;
		}

		public void setTextboxLinkSuccessDeal(String textboxLinkSuccessDeal) {
			this.textboxLinkSuccessDeal = textboxLinkSuccessDeal;
		}
		/**
		 * 该控件对应的通用参数
		 */
		private  Map<String,List<SysFormGeneralParamCache>> generalParams = new HashMap<String,List<SysFormGeneralParamCache>>();

		public Map<String,List<SysFormGeneralParamCache>> getGeneralParams() {
			return generalParams;
		}

		public void setGeneralParams(Map<String,List<SysFormGeneralParamCache>> generalParams) {
			this.generalParams = generalParams;
		}

		public String getTextboxEmptytext() {
			return textboxEmptytext;
		}

		public void setTextboxEmptytext(String textboxEmptytext) {
			this.textboxEmptytext = textboxEmptytext;
		}

		public String getOperatorName() {
			return this.pojo.getOperatorName();
		}

		public Date getOperatorTime() {
			return this.pojo.getOperatorTime();
		}

		public String getTextboxCheckFun() {
			return this.pojo.getTextboxCheckFun();
		}

		public String getTextboxCheckSelf() {
			return this.pojo.getTextboxCheckSelf();
		}

		public String getTextboxCheckType() {
			return this.pojo.getTextboxCheckType();
		}

		public String getTextboxClickFun() {
			return this.pojo.getTextboxClickFun();
		}

		public String getTextboxDataFromType() {
			return this.pojo.getTextboxDataFromType();
		}

		public String getTextboxDataFromValue() {
			return this.pojo.getTextboxDataFromValue();
		}

		public String getTextboxFormColumnId() {
			return this.pojo.getTextboxFormColumnId().toString();
		}

		public String getTextboxid() {
			return this.pojo.getTextboxId().toString();
		}

		public String getTextboxInitFun() {
			return this.pojo.getTextboxInitFun();
		}

		public String getTextboxScheme() {
			return textboxScheme;
		}
		

		public String getTextBoxIsLink() {
			return textBoxIsLink;
		}

		public void setTextBoxIsLink(String textBoxIsLink) {
			this.textBoxIsLink = textBoxIsLink;
		}

		public long getTextBoxLinkForm() {
			return textBoxLinkForm;
		}

		public void setTextBoxLinkForm(long textBoxLinkForm) {
			this.textBoxLinkForm = textBoxLinkForm;
		}

		public String getTextBoxLinkIsForm() {
			return textBoxLinkIsForm;
		}

		public void setTextBoxLinkIsForm(String textBoxLinkIsForm) {
			this.textBoxLinkIsForm = textBoxLinkIsForm;
		}

		public String getTextBoxLinkUrl() {
			return textBoxLinkUrl;
		}

		public void setTextBoxLinkUrl(String textBoxLinkUrl) {
			this.textBoxLinkUrl = textBoxLinkUrl;
		}

		public void setTextboxScheme(String textboxScheme) {
			this.textboxScheme = textboxScheme;
		}

		public String getTextboxValuechangeFun() {
			return this.pojo.getTextboxValuechangeFun();
		}
		

		public String getTextboxLinkWinHeight() {
			return textboxLinkWinHeight;
		}

		public void setTextboxLinkWinHeight(String textboxLinkWinHeight) {
			this.textboxLinkWinHeight = textboxLinkWinHeight;
		}

		public String getTextboxLinkWinOpenType() {
			return textboxLinkWinOpenType;
		}

		public void setTextboxLinkWinOpenType(String textboxLinkWinOpenType) {
			this.textboxLinkWinOpenType = textboxLinkWinOpenType;
		}

		public String getTextboxLinkWinTitle() {
			return textboxLinkWinTitle;
		}

		public void setTextboxLinkWinTitle(String textboxLinkWinTitle) {
			this.textboxLinkWinTitle = textboxLinkWinTitle;
		}

		public String getTextboxLinkWinWidth() {
			return textboxLinkWinWidth;
		}

		public void setTextboxLinkWinWidth(String textboxLinkWinWidth) {
			this.textboxLinkWinWidth = textboxLinkWinWidth;
		}
		
		
		public String getRealVtype(){
			String realType = null;
			if(this.pojo.getTextboxCheckType()==null){
				return null;
			}
			if("10".equals(this.pojo.getTextboxCheckType())){
				realType = this.pojo.getTextboxCheckSelf();
				return realType;
			}
			return this.pojo.getTextboxCheckType();
		}
		
		/**
		 * 提供空的构造函数
		 *
		 */
		public SysFormTextareaCache(){}
		
		/**
		 * 构造函数 通过字段id构造对象
		 * @param columnId
		 */
		public SysFormTextareaCache(String columnId){
//			ITextBoxService service = (ITextBoxService)ApplicationContextFactory.getContext().getBean("ITextBoxService");
			ITextBoxService service = (ITextBoxService)SpringContextUtils.getBeanById("ITextBoxService");
			SysFormTextbox obj = service.queryTextBoxInfoByColumnId(columnId+"");
			if(obj!=null){
				setThisByDataObject(obj);
				//加载通用参数对象数据
				//ISysFormGeneralParamService
				ISysFormGeneralParamService paramService = (ISysFormGeneralParamService)SpringContextUtils.getBeanById("ISysFormGeneralParamService");
				String paramType = FormParamConstants.COLUMN_TEXTBOX;
				List<SysFormGeneralParam> params = paramService.queryGeneralParamByTypeAndTypeValue(paramType,Long.parseLong(this.pojo.getTextboxId().toString()));
				for(int i=0; i<params.size(); i++){
					SysFormGeneralParamCache p = new SysFormGeneralParamCache(params.get(0));
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
		}
		
		/**
		 * DataObject 填充对象
		 * @param obj
		 */
		private void setThisByDataObject(SysFormTextbox obj){
			this.pojo = obj ;
		}
	
}
