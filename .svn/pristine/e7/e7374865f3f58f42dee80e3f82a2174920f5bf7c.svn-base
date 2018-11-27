package com.myehr.service.lang.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.myehr.mapper.lang.SysLangMapper;
import com.myehr.pojo.lang.SysLang;
import com.myehr.pojo.lang.SysLangExample;
import com.myehr.service.lang.ILangService;


/**
 * 语言国际化处理
 * @author Administrator
 *
 */
@Service("ILangService")
public class LangServiceImpl implements ILangService {
//	Logger log = DcfUtil.getLogger(LangServiceImpl.class);
	@Autowired
	private SysLangMapper langMapper;
	
	/**
	 * 当缓存中没有该对象的时候，当然要从数据库里面访问了，从数据库查出来之后，缓存管理器会将此对象放到缓存中，下一次访问的时候，只要该对象没有消亡，则会从缓存里去取，不会再去查数据库
		value为我们自定义缓存的name，key的属性是缓存的key
	 */
	@Override
	@Cacheable(value="langCache",key="#langCode") 
	public SysLang getLangByCode(String langCode) {
		// TODO Auto-generated method stub
		if(langMapper==null){
			return null;
		}
		SysLangExample example = new SysLangExample();
		SysLangExample.Criteria criteria = example.createCriteria();
		criteria.andLangCodeEqualTo(langCode);
		System.out.println("数据库读取......");
		List<SysLang> list = langMapper.selectByExample(example);
		if(list!=null&&list.size()==1){
			return list.get(0);
		}
		return null;
	}
	

	@CacheEvict(value="langCache",key="#langCode")//更新myCache 缓存   更新方式为先清楚后再加载
	@Override  
	public void removeLangCache(String langCode) {  
//		log.info("语言编码为："+langCode+",缓存移出成功");
	}  

	@Override
	public String removeLang(SysLang langCode) {
		if(langCode==null){
			return "1";
		}
		langMapper.deleteByPrimaryKey(langCode.getLangCode());
		removeLangCache(langCode.getLangCode());
		return "0";
	}

	@Override
	public String saveLang(SysLang lang) {
		// TODO Auto-generated method stub
		int rs = langMapper.updateByPrimaryKey(lang);
		if(rs<=0){
			langMapper.insert(lang);
		}
		return "0";
	}

}
