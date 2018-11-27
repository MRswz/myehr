package com.myehr.common.util;

import  redis.clients.jedis.Jedis;  
import  redis.clients.jedis.JedisPool;  
import  redis.clients.jedis.JedisPoolConfig;  
import  redis.clients.jedis.Protocol;  
  
public   class  JedisFactory {  
      
    private  JedisPoolConfig jedisPoolConfig;  
      
    private  JedisPool jedisPool;  
  
    public  JedisFactory(JedisPoolConfig jedisPoolConfig) {  
        super ();  
        this .jedisPoolConfig = jedisPoolConfig;  
    }  
      
    public  Jedis getJedisInstance(String host) {  
        return  getJedisPool(host, Protocol.DEFAULT_PORT).getResource();  
    }  
      
    public  Jedis getJedisInstance(String host,  int  port) {  
        return  getJedisPool(host, port).getResource();  
    }  
      
    public  JedisPool getJedisPool(String host) {  
        return  getJedisPool(host, Protocol.DEFAULT_PORT);  
    }  
  
    public  JedisPool getJedisPool(String host,  int  port) {  
        if  (jedisPool ==  null ) {  
            jedisPool = new  JedisPool(jedisPoolConfig, host, port);  
        }  
        return  jedisPool;  
    }  
      
    /**  
     * 配合使用getJedisInstance方法后将jedis对象释放回连接池中  
     *   
     * @param jedis 使用完毕的Jedis对象  
     * @return true 释放成功；否则返回false  
     */   
    public   boolean  release(Jedis jedis) {  
        if  (jedisPool !=  null  && jedis !=  null ) {  
            jedisPool.returnResource(jedis);  
            return   true ;  
        }  
        return   false ;  
    }  
    
    
    public   void  testLpush() {  
    	JedisFactory factory = new  JedisFactory( new  JedisPoolConfig());  
    	Jedis jedis = factory.getJedisInstance("localhost" );  
          
        try  {  
            String word = "word" ;  
            jedis.lpush(word, "first" );  
            jedis.lpush(word, "second" );  
            jedis.lpush(word, "three" );  
            System.out.println("word : "  + jedis.lrange(word,  0 , - 1 ));  
        } finally  {  
            factory.release(jedis);  
        }  
    }
    
    public static String getKeyProperties(String keyName){
		String path =  System.getProperty("user.dir").replace("\\", "/").replace("bin", "");
		path = path+"webapps/myehr/WEB-INF/classes/redis.properties";
 //   	String path = "E:/workspace/Myeclipse/.metadata/.me_tcat/webapps/myehr/WEB-INF/classes/redis.properties";
		//             E:/workspace/Myeclipse/myehr_0_SQLSERVERwebapps/myehr/WEB-INF/classes/redis.properties
		String keyValue = GetDBPropertiesValue.readValue(path,keyName);
		return keyValue;
	}
    
    public Jedis getJedis() {
    	JedisFactory factory = new  JedisFactory( new  JedisPoolConfig());
    	String redisIp = getKeyProperties("redis.ip");
    	String selectdb = getKeyProperties("redis.dbindex");
    	Jedis jedis = factory.getJedisInstance(redisIp); 
    	jedis.select(Integer.valueOf(selectdb)); 
    	return jedis;
	}
  
}  