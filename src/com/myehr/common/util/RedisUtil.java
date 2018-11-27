package com.myehr.common.util;

import java.util.HashMap;  
import java.util.HashSet;  
import java.util.Iterator;  
import java.util.List;  
import java.util.Set;  
  
import redis.clients.jedis.Jedis;  
  
public class RedisUtil   
{  
      
    public void addHashMap(String key, HashMap map)  
    {  
        Jedis  redis = new Jedis ("127.0.0.1",6379);//连接redis  
        redis.hmset(key, map);  
        System.out.println("hashmap set success!");  
    }  
    public HashSet queryHashMapByKey(String key)  
    {  
        Jedis  redis = new Jedis ("127.0.0.1",6379);//连接redis  
        //return (HashSet) redis.hkeys(key);  
        return (HashSet) redis.hvals(key);  
    }  
      
    public String queryString(String key)  
    {  
        Jedis  redis = new Jedis ("127.0.0.1",6379);//连接redis  
        return redis.get(key);  
    };  
    public void addString(String key,String value)  
    {  
        Jedis  redis = new Jedis ("127.0.0.1",6379);//连接redis  
    //  redis.auth("redis");//验证密码     
        //系统中所有key：  
        Set keys = redis.keys("*"); 
        Iterator t1=keys.iterator() ;  
        while(t1.hasNext()){    
            Object obj1=t1.next();    
            System.out.println(obj1);    
        }
        
        //DEL 移除给定的一个或多个key。如果key不存在，则忽略该命令。  
        //redis.del("key");   
        //expire 设置Key的过期时间(以秒为单位)   
        //redis.expire("key", 5);  
        //TTL 返回给定key的剩余生存时间(time to live)(以秒为单位)     
        //redis.ttl("key");  
             
        //PERSIST key 移除给定key的生存时间。  
        //redis.persist("key");  
             
        //EXISTS 检查给定key是否存在。     
        boolean flag = redis.exists(key);  
        System.out.println(flag);  
        redis.set(key, value);  
        System.out.println("set " + key + " : " + value +",success");  
    }  
      
     public static void main(String[] args)   {       
    	RedisUtil t1 = new RedisUtil();  
        //String  
        t1.addString("id","120120");  
          
        String value = t1.queryString("id");  
        System.out.println("get id >>>" + value);  
          
        //HashMap  
        HashMap map = new HashMap();  
        map.put("MapId1", "MapValue1");  
        map.put("MapId2", "MapValue2");  
        map.put("MapId3", "MapValue3");  
        t1.addHashMap("hashmap", map);  
          
        HashSet list = t1.queryHashMapByKey("hashmap");  
        System.out.println(String. format ( "keys: %s" , list));  
     }       
}  