package com.myehr.common.util;

import javax.servlet.ServletContextEvent;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.myehr.service.formmanage.form.widget.IComboBoxService;

public class ContextLoaderListenerOverWrite extends ContextLoaderListener {  
	private static Logger logger = LoggerFactory.getLogger(ContextLoaderListenerOverWrite.class);

	@Autowired
	IComboBoxService IComboBoxService ;
    //private IOSCache osCache;  
    @Override  
    /** 
     * @description 重写ContextLoaderListener的contextInitialized方法 
     */  
    
    public void contextInitialized(ServletContextEvent event) {  
        super.contextInitialized(event);  
        ApplicationContext applicationContext = WebApplicationContextUtils.getWebApplicationContext(event.getServletContext());  
        
        try {
			if (AuthorizationUtil.checkStartKey()) {
				//获取bean  
			    IComboBoxService = (IComboBoxService) applicationContext.getBean("IComboBoxService");  
			    /* 
			                 具体地业务代码 
			     */
			    try {
			    	SpringContextUtils springContextUtils = new SpringContextUtils();
			    	springContextUtils.setApplicationContext(applicationContext);
			    	IComboBoxService.initOnlineUsers();
			    	IComboBoxService.initTimerTasks();
//			    	IComboBoxService.initUserOrgs();
			    	IComboBoxService.initSystemParam();
//			    	IComboBoxService.setSystemParam();
//			    	IComboBoxService.setForm();
			    	
			    	//IComboBoxService.setDi ctEntrys();
			    	//IComboBoxService.setSysFields();
			    	IComboBoxService.setSysMenusWithRoleId();
//			    	IComboBoxService.setCardDictDataByColumnId();
			    	//IComboBoxService.setMenusWithUserId();
			    	/*IComboBoxService.setFormCaches();
			    	IComboBoxService.setFormInfos();
			    	IComboBoxService.setFormColumns();
			    	IComboBoxService.setSysGridFilters();
			    	IComboBoxService.setSysFormTextBoxs();
			    	IComboBoxService.setSysFormComboboxs();
			    	IComboBoxService.setSysFormRadiobuttonlists();
			    	IComboBoxService.setSysDatepickers();
			    	IComboBoxService.setSysLookups();
			    	IComboBoxService.setSysRichtexts();
			    	IComboBoxService.setSysFileuploads();
			    	IComboBoxService.setSysFormButtonSaves();
			    	IComboBoxService.setSysFormButtonAdds();
			    	IComboBoxService.setSysFormButtonRemoves();
			    	IComboBoxService.setSysFormButtonImports();
			    	IComboBoxService.setSysFormButtonCalculates();
			    	IComboBoxService.setSysExecSqls();
			    	IComboBoxService.setSysFormButtonIntroduces();*/
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();logger.error(e.getMessage(),e);
				}
			}else {
				logger.info("对不起，此机器没有授权，无法启动，请联系相关人员进行授权");
				int a =1/0;
			}
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();logger.error(e.getMessage(),e);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();logger.error(e.getMessage(),e);
		}
    } 

} 