package com.myehr.mapper.sysCvr;

import com.myehr.pojo.sysCvr.SysCvr;
import com.myehr.pojo.sysCvr.SysCvrExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface SysCvrExpandMapper {

    int insert(SysCvr record);
    int update(Map<String, Object> maps);
    int updateMessage(Map<String, Object> maps);
    int updateReadDate(Map<String, Object> maps);
}