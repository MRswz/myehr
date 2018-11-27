package com.myehr.common.util;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import oracle.sql.TIMESTAMP;

public class MapToObject {
	private static Logger logger = LoggerFactory.getLogger(MapToObject.class);

    /**
     * 将一个 Map 对象转化为一个 JavaBean
     * @param type 要转化的类型
     * @param map 包含属性值的 map
     * @return 转化出来的 JavaBean 对象
     * @throws IntrospectionException
     *             如果分析类属性失败
     * @throws IllegalAccessException
     *             如果实例化 JavaBean 失败
     * @throws InstantiationException
     *             如果实例化 JavaBean 失败
     * @throws InvocationTargetException
     *             如果调用属性的 setter 方法失败
     */
    public static Object convertMap(Class<?> type, Map<?, ?> map)
            throws IntrospectionException, IllegalAccessException,
            InstantiationException, InvocationTargetException {
        BeanInfo beanInfo = Introspector.getBeanInfo(type); // 获取类属性
        Object obj = type.newInstance(); // 创建 JavaBean 对象

        // 给 JavaBean 对象的属性赋值
        PropertyDescriptor[] propertyDescriptors =  beanInfo.getPropertyDescriptors();
        for (int i = 0; i< propertyDescriptors.length; i++) {
            PropertyDescriptor descriptor = propertyDescriptors[i];
            String propertyName = descriptor.getName();
            ChangeSqlColumn csc = new ChangeSqlColumn();
            String propertyNameSql = csc.getSqlColumn(propertyName).toString().toUpperCase();

            if (map.containsKey(propertyNameSql)) {
                // 下面一句可以 try 起来，这样当一个属性赋值失败的时候就不会影响其他属性赋值。
                Object value = map.get(propertyNameSql);
                Object[] args = new Object[1];
                if(value instanceof TIMESTAMP){
                    String dateString = getDate(value);
                    logger.info(dateString);
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
                    Date date = null;
					try {
						date = sdf.parse(dateString);
					} catch (ParseException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();logger.error(e.getMessage(),e);
					} 
                    args[0] = date;
                    descriptor.getWriteMethod().invoke(obj, args);
                }else {
                	args[0] = value;
                    descriptor.getWriteMethod().invoke(obj, args);
				}
            }
        }
        return obj;
    }
    
    private static String getDate(Object value) {
    	Timestamp timestamp = null;
    	try {
    		timestamp = (Timestamp) value;
    	} catch (Exception e) {
    		timestamp = getOracleTimestamp(value);
    	}
    	if(timestamp!=null)
    		return (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(timestamp); 
    	else return null; 
	} 
    
    /** 
     * @reference oracle.sql.Datum.timestampValue();
     * @return 
     */ 
	private static Timestamp getOracleTimestamp(Object value) { 
		try { 
			Class clz = value.getClass(); 
			Method m = clz.getMethod("timestampValue", null); 
	                       //m = clz.getMethod("timeValue", null); 时间类型 
	                       //m = clz.getMethod("dateValue", null); 日期类型 
			return (Timestamp) m.invoke(value, null); 
	
		} catch (Exception e) { 
			return null; 
		} 
	}
}