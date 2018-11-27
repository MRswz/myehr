package com.myehr.common.util.datasource;

/**
 * <b>function:</b> 多数据源
 * @author hoojo
 * @createdate 2013-9-27 上午11:36:57
 * @file customercontextholder.java
 * @package com.hoo.framework.spring.support
 * @project shmb
 * @blog http://blog.csdn.net/ibm_hoojo
 * @email hoojo_@126.com
 * @version 1.0
 */
public abstract class CustomerContextHolder {
 
    public final static String session_factory_sqlserver = "dafaultsource";
    public final static String session_factory_oracle = "oracle";
    public final static String session_factory_importSqlserver = "importdata";
    
    private static final ThreadLocal<String> contextholder = new ThreadLocal<String>();  
    
    public static void setContextType(String contextType) {  
        contextholder.set(contextType);  
    }  
      
    public static String getContextType() {  
        return contextholder.get();  
    }  
      
    public static void clearcontexttype() {  
        contextholder.remove();  
    }  
}
