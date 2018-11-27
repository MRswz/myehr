package com.myehr.common.util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SerializeUtil {
	private static Logger logger = LoggerFactory.getLogger(SerializeUtil.class);
	public static byte[] serialize(Object object) {
		if (object == null) {
            return null;
        }
		ObjectOutputStream oos = null;
		ByteArrayOutputStream baos = null;
		try {
			//序列化
			baos = new ByteArrayOutputStream();
			oos = new ObjectOutputStream(baos);
			oos.writeObject(object);
			byte[] bytes = baos.toByteArray();
			return bytes;
		} catch (Exception e) {
		}
		return null;
	}
	public static Object unserialize(byte[] bytes) {
		if (bytes == null) {  
            return null;  
        }  
		ByteArrayInputStream bais = null;
		try {
			//反序列化
			bais = new ByteArrayInputStream(bytes);
			ObjectInputStream ois = new ObjectInputStream(bais);
			return ois.readObject();
		} catch (Exception e) {
		}
		return null;
	}
	
	 /** 
     * 序列化 list 集合 
     *  
     * @param list 
     * @return 
     */  
    public static byte[] serializeList(List<?> list) {  
  
        if (list.isEmpty()) {  
            return null;  
        }  
        ObjectOutputStream oos = null;  
        ByteArrayOutputStream baos = null;  
        byte[] bytes = null;  
        try {  
            baos = new ByteArrayOutputStream();  
            oos = new ObjectOutputStream(baos);  
            for (Object obj : list) {  
                oos.writeObject(obj);  
            }  
            bytes = baos.toByteArray();  
        } catch (Exception e) {  
            e.printStackTrace();logger.error(e.getMessage(),e);  
        } finally {  
        	try {
				oos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();logger.error(e.getMessage(),e);
			}  
        	try {
				baos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();logger.error(e.getMessage(),e);
			}  
        }  
        return bytes;  
    }  
  
    /** 
     * 反序列化 list 集合 
     *  
     * @param lb 
     * @return 
     */  
    public static List<?> unserializeList(byte[] bytes) {  
        if (bytes == null) {  
            return null;  
        }  
        List<Object> list = new ArrayList<Object>();  
        ByteArrayInputStream bais = null;  
        ObjectInputStream ois = null;  
        try {  
            // 反序列化  
            bais = new ByteArrayInputStream(bytes);  
            ois = new ObjectInputStream(bais);  
            while (bais.available() > 0) {  
                Object obj = (Object) ois.readObject();  
                if (obj == null) {  
                    break;  
                }  
                list.add(obj);  
            }  
        } catch (Exception e) {  
            e.printStackTrace();logger.error(e.getMessage(),e);  
        } finally {  
        	try {
				bais.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();logger.error(e.getMessage(),e);
			}  
        	try {
				ois.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();logger.error(e.getMessage(),e);
			}  
        }  
        return list;  
    }  
}
