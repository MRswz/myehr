package com.myehr.pojo.formmanage.formCopy;


import java.io.Serializable;


import com.myehr.common.exception.DcfException;
import com.myehr.common.util.SpringContextUtils;
import com.myehr.pojo.formmanage.button.SysFormButtonIntrDetail;
import com.myehr.pojo.formmanage.form.SysFormColumn;
import com.myehr.service.formmanage.form.ISysformconfigService;

public class SysFormButtonIntrDetailCacheCopy implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
		private SysFormButtonIntrDetail pojoDetail;
	
		public SysFormButtonIntrDetail getPojoDetail() {
			return pojoDetail;
		}

		public void setPojoDetail(SysFormButtonIntrDetail pojoDetail) {
			this.pojoDetail = pojoDetail;
		}

		public String getTargetColumnType() {
			return pojoDetail.getTargetColumnType();
		}

		public long getFormColumnId() {
			return pojoDetail.getFormColumnId().longValue();
		}

		public long getIntrDetailId() {
			return pojoDetail.getIntrDetailId().longValue();
		}

		public String getTargetColumnId() {
			return pojoDetail.getTargetColumnId();
		}
		
		/**
		 * 空构造函数
		 *
		 */
		public SysFormButtonIntrDetailCacheCopy(){};
		
		/**
		 * 构造函数
		 * @param obj
		 * @param form
		 * @throws Exception 
		 * @throws DcfException 
		 */
		public SysFormButtonIntrDetailCacheCopy(SysFormButtonIntrDetail obj,SysFormCopyCache form) throws DcfException, Exception{
			this.setThisByDataObject(obj);
			ISysformconfigService service = (ISysformconfigService)SpringContextUtils.getBeanById("ISysformconfigService");
			
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