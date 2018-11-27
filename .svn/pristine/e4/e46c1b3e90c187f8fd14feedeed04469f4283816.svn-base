package com.myehr.common.util;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

	public class MapUtil {
		private static Logger logger = LoggerFactory.getLogger(MapUtil.class);

		public static Map ConvertObjToMap(Object obj){
		Map<String,Object> reMap = new HashMap<String,Object>();
		if (obj == null) 
			return null;
		Field[] fields = obj.getClass().getDeclaredFields();
		try {
			for(int i=0;i<fields.length;i++){
				try {
					Field f = obj.getClass().getDeclaredField(fields[i].getName());
					f.setAccessible(true);
					Object o = f.get(obj);
					reMap.put(fields[i].getName(), o);
				} catch (NoSuchFieldException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();logger.error(e.getMessage(),e);
				} catch (IllegalArgumentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();logger.error(e.getMessage(),e);
				} catch (IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();logger.error(e.getMessage(),e);
				}
			}
		} catch (SecurityException e) {
		// TODO Auto-generated catch block
				e.printStackTrace();logger.error(e.getMessage(),e);
			} 
			return reMap;
		}
 
		public static void main(String[] args) {
		}
}