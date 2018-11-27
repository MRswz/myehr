package com.myehr.common.ecache.impl;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.myehr.common.ecache.EhCacheTestService;
import com.myehr.pojo.formmanage.cache.SysFormconfigCache;
import com.myehr.service.impl.formmanage.form.FormServiceImpl;

@Service("EhCacheTestServiceImpl")
public class EhCacheTestServiceImpl implements EhCacheTestService {
	private static Logger logger = LoggerFactory.getLogger(EhCacheTestServiceImpl.class);

	/**
	 * 当缓存中没有该对象的时候，当然要从数据库里面访问了，从数据库查出来之后，缓存管理器会将此对象放到缓存中，下一次访问的时候，只要该对象没有消亡，则会从缓存里去取，不会再去查数据库
		value为我们自定义缓存的name，key的属性是缓存的key
	 */
	@Cacheable(value="formCache",key="#formId") 
	@Override 
	public SysFormconfigCache getForm(long formId) {
		// TODO Auto-generated method stub
		FormServiceImpl serviceImpl = new FormServiceImpl();
		
		try {
			SysFormconfigCache 	formCache = serviceImpl.getForm(formId+"");
			formCache.getPojoform().setFormDefCode("001"+new Date().getTime());
			logger.info("执行数据查询");
			return formCache;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();logger.error(e.getMessage(),e);
		}
		return null ;
		//form.setFormDefCode("001"+new Date().getTime());
		//formCache.setPojoform(form);
		/*SysFormconfigCache form = new SysFormconfigCache();
		form.getPojoform().setFormDefCode("001"+new Date().getTime());
		logger.info("执行数据查询");
		return form;*/
	}

	

	@CacheEvict(value="formCache",key="#formId")//更新myCache 缓存   更新方式为先清楚后再加载
	@Override  
	public void setForm(long formId) {
		logger.info("缓存清楚成功");
		//logger.info("缓存更新成功"+"002"+new Date().getTime());
		//this.getForm(formId);
	}  
}
