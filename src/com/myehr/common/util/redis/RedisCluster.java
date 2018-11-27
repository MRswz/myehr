package com.myehr.common.util.redis;

/** 
 * redis连接属性 
 * @author xiakai 
 * 
 */  
public class RedisCluster {  
    private String selectdb;  
    private String hostIp;  
    private String  port;  
      
      
    public String getSelectdb() {  
        return selectdb;  
    }  
    public void setSelectdb(String selectdb) {  
        this.selectdb = selectdb;  
    }  
    public String getHostIp() {  
        return hostIp;  
    }  
    public void setHostIp(String hostIp) {  
        this.hostIp = hostIp;  
    }  
    public String getPort() {  
        return port;  
    }  
    public void setPort(String port) {  
        this.port = port;  
    }
}  
