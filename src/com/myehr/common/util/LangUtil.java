package com.myehr.common.util;

import java.io.Serializable;

import com.myehr.pojo.lang.SysLang;
import com.myehr.service.lang.ILangService;

public class LangUtil implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public static  String   getLangByCode(String langType,String langCode)  {
		ILangService service = (ILangService)SpringContextUtils.getBeanById("ILangService");
		SysLang lang  =service.getLangByCode(langCode);
		if(lang==null){
			return langCode;	
		}
		if("zh".equals(langType)){
			return lang.getZh();
		}
		if("en".equals(langType)){
			return lang.getEn();
		}
		if("euc".equals(langType)){
			return lang.getEuc();
		}
		if("big5".equals(langType)){
			return lang.getBig5();
		}
		return langCode;
	}
}
