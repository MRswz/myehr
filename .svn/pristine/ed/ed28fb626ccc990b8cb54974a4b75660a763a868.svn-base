package com.myehr.service.lang;

import com.myehr.pojo.lang.SysLang;

/**
 * 语言国际化处理
 * @author Administrator
 *
 */
public interface ILangService {
	
	/**
	 * 保存国际化语言对象
	 * @param lang
	 * @return
	 */
	public String saveLang(SysLang lang);
	
	/**
	 * 删除国际化语言对象
	 * @param lang
	 * @return
	 */
	public String removeLang(SysLang lang);
	
	/**
	 * 根据语言类型，语言编码获取
	 * @param langCode
	 * @return
	 */
	public SysLang getLangByCode(String langCode);
	
	/**
	 * 清除缓存
	 * @param langCode
	 */
	public void removeLangCache(String langCode);
	
}
