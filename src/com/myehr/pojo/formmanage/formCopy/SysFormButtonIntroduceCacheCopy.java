package com.myehr.pojo.formmanage.formCopy;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.myehr.common.exception.DcfException;
import com.myehr.common.util.SpringContextUtils;
import com.myehr.pojo.formmanage.button.SysFormButtonIntrDetail;
import com.myehr.pojo.formmanage.button.SysFormButtonIntroduce;
import com.myehr.pojo.formmanage.cache.FormParamConstants;
import com.myehr.pojo.formmanage.form.SysFormGeneralParam;
import com.myehr.service.formmanage.form.IButtonService;
import com.myehr.service.formmanage.form.generalparam.ISysFormGeneralParamService;

public class SysFormButtonIntroduceCacheCopy implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

		//主键
		SysFormButtonIntroduce sIntroduce = new SysFormButtonIntroduce();
		
		//关联的字段映射明细
		private List<SysFormButtonIntrDetailCacheCopy> details = new ArrayList<SysFormButtonIntrDetailCacheCopy>();
		
		
		public SysFormButtonIntroduce getsIntroduce() {
			return sIntroduce;
		}

		public void setsIntroduce(SysFormButtonIntroduce sIntroduce) {
			this.sIntroduce = sIntroduce;
		}

		/**
		 * 该控件对应的通用参数
		 */
		private  Map<String,List<SysFormGeneralParamCacheCopy>> generalParams = new HashMap<String,List<SysFormGeneralParamCacheCopy>>();

		public Map<String,List<SysFormGeneralParamCacheCopy>> getGeneralParams() {
			return generalParams;
		}

		public void setGeneralParams(Map<String,List<SysFormGeneralParamCacheCopy>> generalParams) {
			this.generalParams = generalParams;
		}

		public long getIntroduceButtonId() {
			return sIntroduce.getIntroduceButtonId().longValue();
		}

		public long getIntroduceExcsqlId() {
			return sIntroduce.getIntroduceExcsqlId().longValue();
		}

		public long getIntroduceFormId() {
			return sIntroduce.getIntroduceFormId().longValue();
		}

		public String getIntroduceHeight() {
			return sIntroduce.getIntroduceHeight();
		}

		public long getIntroduceId() {
			return sIntroduce.getIntroduceId().longValue();
		}

		public String getIntroduceInitFun() {
			return sIntroduce.getIntroduceInitFun();
		}

		public String getIntroduceSelfFun() {
			return sIntroduce.getIntroduceSelfFun();
		}

		public String getIntroduceTitle() {
			return sIntroduce.getIntroduceTitle();
		}

		public String getIntroduceType() {
			return sIntroduce.getIntroduceType();
		}

		public String getIntroduceUrl() {
			return sIntroduce.getIntroduceUrl();
		}

		public String getIntroduceWidth() {
			return sIntroduce.getIntroduceWidth();
		}
		
		/**
		 * 空构造函数
		 *
		 */
		public SysFormButtonIntroduceCacheCopy(){}
		

		/**
		 * 构造函数 通过DataObject加载
		 * @throws Exception 
		 * @throws DcfException 
		 *
		 */
		public SysFormButtonIntroduceCacheCopy(long buttonId,SysFormCopyCache form) throws DcfException, Exception{
			IButtonService service = (IButtonService)SpringContextUtils.getBeanById("IButtonService");
			SysFormButtonIntroduce obj = service.queryIntroduceByButtonId(buttonId);
			if(obj==null){
				return ;
			}
			setThisByDataObject(obj);
			List<SysFormButtonIntrDetail> objs = service.queryIntroduceDetailByIntroduceId(this.getIntroduceId());
			for(int i=0; i<objs.size(); i++){
				SysFormButtonIntrDetailCacheCopy detail = new SysFormButtonIntrDetailCacheCopy(objs.get(i),form);
				details.add(detail);
			}
			
//			加载通用参数对象数据
			//ISysFormGeneralParamService
			ISysFormGeneralParamService paramService = (ISysFormGeneralParamService)SpringContextUtils.getBeanById("ISysFormGeneralParamService");
//			ISysFormGeneralParamService paramService = (ISysFormGeneralParamService)ApplicationContextFactory.getContext().getBean("ISysFormGeneralParamService");
			String paramType = FormParamConstants.BUTTON_INTRODUCE;
			List<SysFormGeneralParam> params = paramService.queryGeneralParamByTypeAndTypeValue(paramType,this.getIntroduceId());
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
		 * DataObject 填充对象
		 * @param obj
		 */
		private void setThisByDataObject(SysFormButtonIntroduce obj){
			this.setsIntroduce(obj);
		}

		public String getOperatorName() {
			return getOperatorName();
		}

		public Date getOperatorTime() {
			return getOperatorTime();
		}

		public List<SysFormButtonIntrDetailCacheCopy> getDetails() {
			return details;
		}

		public void setDetails(List<SysFormButtonIntrDetailCacheCopy> details) {
			this.details = details;
		}
}