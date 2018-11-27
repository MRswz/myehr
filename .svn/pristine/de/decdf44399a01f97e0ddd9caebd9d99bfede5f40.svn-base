package com.myehr.pojo.formmanage.cache;


import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;

import com.myehr.common.exception.DcfException;
import com.myehr.common.util.SpringContextUtils;
import com.myehr.pojo.formmanage.button.SysFormButtonIntrDetail;
import com.myehr.pojo.formmanage.form.SysFormColumn;
import com.myehr.service.formmanage.form.IFormService;
import com.myehr.service.formmanage.form.ISysformconfigService;
import com.myehr.service.impl.formmanage.form.FormServiceImpl;

public class SysFormButtonIntrDetailCache implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Autowired
	private IFormService formService;
	
		private SysFormButtonIntrDetail pojoDetail;
	
		public SysFormButtonIntrDetail getPojoDetail() {
			return pojoDetail;
		}

		public void setPojoDetail(SysFormButtonIntrDetail pojoDetail) {
			this.pojoDetail = pojoDetail;
		}

		//		当前表单的字段
		private SysFormColumnCache formColumn;
		
//		引入框表中的字段
		private SysFormColumnCache targetColumn;
		
		public String getTargetColumnType() {
			return pojoDetail.getTargetColumnType();
		}

		public SysFormColumnCache getFormColumn() {
			return formColumn;
		}

		public long getFormColumnId() {
			return pojoDetail.getFormColumnId().longValue();
		}

		public long getIntrDetailId() {
			return pojoDetail.getIntrDetailId().longValue();
		}

		public SysFormColumnCache getTargetColumn() {
			return targetColumn;
		}

		public String getTargetColumnId() {
			return pojoDetail.getTargetColumnId();
		}
		
		/**
		 * 空构造函数
		 *
		 */
		public SysFormButtonIntrDetailCache(){};
		
		/**
		 * 构造函数
		 * @param obj
		 * @param form
		 * @throws Exception 
		 * @throws DcfException 
		 */
		public SysFormButtonIntrDetailCache(SysFormButtonIntrDetail obj,SysFormconfigCache form) throws DcfException, Exception{
			this.setThisByDataObject(obj);
			ISysformconfigService service = (ISysformconfigService)SpringContextUtils.getBeanById("ISysformconfigService");
			//FormServiceImpl formServiceImpl = new FormServiceImpl();
			this.formColumn = form.serchColumnByColumnId(this.getFormColumnId());
			
			if(this.getTargetColumnId()== "" + this.getFormColumnId()){
				return;
			}
			if("c".equals(this.getTargetColumnType())){
				SysFormColumn targetobj = service.querySysFormColumnById(Long.parseLong(this.getTargetColumnId()));
				if (targetobj!=null) {
					/*
					SysFormconfig targetform = FormCacheManager.getForm(targetobj.getString("formColumnFormDefId"));
					this.targetColumn = targetform.serchColumnByColumnId(Long.parseLong(this.targetColumnId));*/
//					String formId = targetobj.getFormColumnFormDefId().toString();
//					SysFormconfigCache targetform = new SysFormconfigCache(formId,"1");
//					this.targetColumn = targetform.serchColumnByColumnId(Long.parseLong(this.getTargetColumnId()));
				}
			}
		}
		
		/**
		 * DataObject 填充对象
		 * @param obj
		 */
		private void setThisByDataObject(SysFormButtonIntrDetail obj){
			this.pojoDetail = obj;
		}
}