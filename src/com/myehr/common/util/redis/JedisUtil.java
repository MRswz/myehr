package com.myehr.common.util.redis;

import java.lang.reflect.Type;  
import java.util.List;  
import java.util.Set;  
import java.util.zip.CRC32;  

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
  
import redis.clients.jedis.Jedis;  
import redis.clients.jedis.exceptions.JedisConnectionException;  
  
import com.google.gson.Gson;   
  
public class JedisUtil {  
	private static Logger logger = LoggerFactory.getLogger(JedisUtil.class);

	public static final String ONLINE_USER = "1";// 商户登陆用户  
    // 数据库  
    public static final String STORE_LOGINUSER = "4";// 商户登陆用户  
    public static final String STORE_INFO = "5";// 商户状态 商户购买服务有效期  
    public static final String CHECK_CODE = "6";// 验证码  
    public static final String MENU = "7";// 全部菜单  
    public static final String SERVICE = "8";// 服务收费信息  
    public static final String STORE_LOGINKEY = "9";// 初始化登录公钥 私钥对  
    // 固定key  
    public static final String ALL_MENU_KEY = "ALL_MENU_KEY";  
    public static final String BUY_SERVICE_KEY = "BUY_SERVICE_KEY";// 服务收费购买key  
    public static final String ALL_SERVICE_KEY = "ALL_SERVICE_KEY";//所有服务  
    public static final String MENU_AUTHORITY = "MENU_AUTHORITY";// 菜单权限  
    public static final String STORE_MENU_KEY = "STORE_MENU_KEY";// 需要商户分配的业务菜单  
    public static final String STORE_SERVICE_KEY = "STORE_SERVICE_KEY";// 商户收费key  
    public static final String SYSTE_MENU_KEY = "SYSTE_MENU_KEY";// 系统管理菜单key  
  
    // jedis服务组业务类型  
    public static final String CONT_CLUSTERNAME_PUBLICDATA = "publicData";  
    public static final String CONT_CLUSTERNAME_SESSIONROUTE = "sessionRoute";  
    public static final String CONT_CLUSTERNAME_USERROUTE = "userRoute";  
      
    // 操作方式 0 插入 1获取 2 删除  
    public static final long INSERT_OPERATION = 0;  
    public static final long GET_OPERATION = 1;  
    public static final long DELETE_OPERATION = 2;  
  
    // 验证码过期秒数  
    public static final int CHECKCODE_EXPIRESECONDS = 5*60;  
    // session过期秒数  
    public static final int EXPIRESECONDS = 30 * 60;  
  
    private static void closeJedis(Jedis jedis) {  
        try {  
            jedis.quit();  
        } catch (JedisConnectionException e) {  
            e.printStackTrace();logger.error(e.getMessage(),e);  
        }  
        jedis.disconnect();  
    }  
      
    /** 
     * 根据Key获取字符串 
     * 
     * @param key 
     * @param jedisGroup 
     */  
    public static String getString(String key, String selectdb) {  
        Jedis jedis = getPublicDataJedis(key, GET_OPERATION, selectdb);  
        return jedis.get(key);  
    }  
      
    /** 
     * 获取所有数据set 
     * @param selectdb 
     * @return 
     */  
    public static Set getAllSet(String selectdb) {  
        Jedis jedis = getDataJedis(GET_OPERATION, selectdb);  
        return jedis.keys("*");  
    }  
      
    /** 
     * 默认取配置文件的第一个数据库 
     * @param operation 
     * @param selectdb 
     * @return 
     */  
    private static Jedis getDataJedis(long operation, String selectdb) {  
        if (RedisConfig.redisGroupMap == null) {  
            RedisConfig.redisGroupMap = RedisConfig.getRedisGroupMap();  
        }  
        List<RedisCluster> clustersList = RedisConfig.redisGroupMap.get(CONT_CLUSTERNAME_PUBLICDATA);  
  
        int clusterNo = 0;//默认存到第一个  
  
        RedisCluster cluster = clustersList.get(clusterNo);  
        Jedis jedis = new Jedis(cluster.getHostIp(), Integer.valueOf(cluster.getPort()));  
        jedis.select(Integer.valueOf(selectdb));  
        return jedis;  
    }  
  
  
    /** 
     * 删除数据 
     * 
     * @param key 
     * @param jedisGroup 
     */  
    public static void deleteObject(String key, String jedisGroup) {  
        Jedis jedis = getJedis(key, jedisGroup, DELETE_OPERATION);  
        jedis.del(key);  
        closeJedis(jedis);  
    }  
  
    /** 
     * 删除公共数据 
     * 
     * @param key 
     * @param objClass 
     * @param selectdb 
     */  
    public static void deletePublicDataObject(String key, String selectdb) {  
        Jedis jedis = getPublicDataJedis(key, DELETE_OPERATION, selectdb);  
        jedis.del(key);  
        closeJedis(jedis);  
    }  
  
    /** 
     * 获取jedis的库实例 
     * 
     * @param key 
     * @param jedisGroup 
     * @param operation 
     * @return 
     */  
    private static Jedis getJedis(String key, String jedisGroup, long operation) {  
        if (RedisConfig.redisGroupMap == null) {  
            RedisConfig.redisGroupMap = RedisConfig.getRedisGroupMap();  
        }  
        List<RedisCluster> clustersList = RedisConfig.redisGroupMap.get(jedisGroup);  
        int arrayLength = clustersList.size();  
        // 根据key值算出该信息应该存入到那个  
        int clusterNo = getRedisNo(key, arrayLength);  
  
        RedisCluster cluster = clustersList.get(clusterNo);  
        Jedis jedis = new Jedis(cluster.getHostIp(), Integer.valueOf(cluster.getPort()));  
        jedis.select(Integer.valueOf(cluster.getSelectdb()));  
        return jedis;  
    }  
  
    /** 
     * redis key值获取对象 
     * 
     * @param key 
     * @param objClass 
     * @param jedisGroup 
     * @return 
     */  
    public static Object getObject(String key, Class objClass, String jedisGroup) {  
        Jedis jedis = getJedis(key, jedisGroup, GET_OPERATION);  
  
        String sObj = jedis.get(key);  
        closeJedis(jedis);  
        Gson gson = new Gson();  
        return gson.fromJson(sObj, objClass);  
  
    }  
  
    /** 
     * 获取公共数据jedis的库实例 
     * 
     * @param key 
     * @param jedisGroup 
     * @param operation 
     * @return 
     */  
    private static Jedis getPublicDataJedis(String key, long operation, String selectdb) {  
        if (RedisConfig.redisGroupMap == null) {  
            RedisConfig.redisGroupMap = RedisConfig.getRedisGroupMap();  
        }  
        List<RedisCluster> clustersList = RedisConfig.redisGroupMap.get(CONT_CLUSTERNAME_PUBLICDATA);  
        int arrayLength = clustersList.size();  
        // 根据key值算出该信息应该存入到那个  
        int clusterNo = getRedisNo(key, arrayLength);  
  
        RedisCluster cluster = clustersList.get(clusterNo);  
        Jedis jedis = new Jedis(cluster.getHostIp(), Integer.valueOf(cluster.getPort()));  
        jedis.select(Integer.valueOf(selectdb));  
        return jedis;  
    }  
  
    /** 
     * publicdata redis key值获取对象 
     * 
     * @param key 
     * @param objClass 
     * @param jedisGroup 
     * @return 
     */  
    public static Object getPublicDataObject(String key, Class objClass, String selectdb) {  
        Jedis jedis = getPublicDataJedis(key, GET_OPERATION, selectdb);  
  
        String sObj = jedis.get(key);  
        closeJedis(jedis);  
        Gson gson = new Gson();  
        return gson.fromJson(sObj, objClass);  
  
    }  
  
    /** 
     * publicdata redis key值获取对象 List<Entity> 
     * 
     * @param key 
     * @param objClass 
     * @param jedisGroup 
     * @return 
     */  
    public static Object getPublicDataObjectByType(String key, Type type, String selectdb) {  
        Jedis jedis = getPublicDataJedis(key, GET_OPERATION, selectdb);  
  
        String sObj = jedis.get(key);  
        closeJedis(jedis);  
        Gson gson = new Gson();  
        return gson.fromJson(sObj, type);  
    }  
  
    /** 
     * 获取redis服务器库编号 
     * 
     * @param hashKey 
     * @return 
     */  
    public static int getRedisNo(String key, int arraySize) {  
        long hashKey = hash(key);  
        int redisNo = (int) (hashKey % arraySize);  
        return redisNo;  
    }  
  
    /** 
     * 根据key值算出hash值 
     * 
     * @param k 
     * @return 
     */  
    public static long hash(String k) {  
        CRC32 crc32 = new CRC32();  
        crc32.update(k.getBytes());  
        return crc32.getValue();  
    }  
  
    /** 
     * redis 根据key值将对象插入到不同的库中 
     * 
     * @param key 
     * @param insertObj 
     * @param jedisGroup 
     */  
    public static void insertObject(String key, Object insertObj, String jedisGroup) {  
  
        Jedis jedis = getJedis(key, jedisGroup, INSERT_OPERATION);  
        Gson gson = new Gson();  
        jedis.set(key, gson.toJson(insertObj));  
        closeJedis(jedis);  
    }  
  
    /** 
     * redis 根据key值将对象插入到不同的库中 
     * 
     * @param key 
     * @param insertObj 
     * @param jedisGroup 
     * @param expire 
     */  
    public static void insertObject(String key, Object insertObj, String jedisGroup, int expireSeconds) {  
  
        Jedis jedis = getJedis(key, jedisGroup, INSERT_OPERATION);  
        Gson gson = new Gson();  
        jedis.setex(key, expireSeconds, gson.toJson(insertObj));  
        closeJedis(jedis);  
    }  
  
    /** 
     * publicdata redis 根据key值将对象插入到不同的库中 
     * 
     * @param key 
     * @param insertObj 
     * @param jedisGroup 
     */  
    public static void insertPublicDataObject(String key, Object insertObj, String selectdb) {  
  
        Jedis jedis = getPublicDataJedis(key, INSERT_OPERATION, selectdb);  
        Gson gson = new Gson();  
        jedis.set(key, gson.toJson(insertObj));  
        closeJedis(jedis);  
    }  
  
    /** 
     * publicdata redis 根据key值将对象插入到不同的库中, 
     * 
     * @param key 
     * @param insertObj 
     * @param jedisGroup 
     * @param expireSeconds 
     */  
    public static void insertPublicDataObject(String key, Object insertObj, String selectdb, int expireSeconds) {  
        Jedis jedis = getPublicDataJedis(key, INSERT_OPERATION, selectdb);  
        Gson gson = new Gson();  
        jedis.setex(key, expireSeconds, gson.toJson(insertObj));  
        closeJedis(jedis);  
    }  
  
    /** 
     * 更新redis中key的超时时间 
     * 
     * @param key 
     * @param jedisGroup 
     * @param expireSeconds 
     */  
    public static void resetExpireSeconds(String key, String jedisGroup, int expireSeconds) {  
        Jedis jedis = getJedis(key, jedisGroup, GET_OPERATION);  
        jedis.expire(key, expireSeconds);  
        closeJedis(jedis);  
    }  
  
}  
