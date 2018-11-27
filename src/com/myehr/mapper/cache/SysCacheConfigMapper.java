package com.myehr.mapper.cache;

import com.myehr.pojo.cache.SysCacheConfig;
import com.myehr.pojo.cache.SysCacheConfigExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysCacheConfigMapper {
    int countByExample(SysCacheConfigExample example);

    int deleteByExample(SysCacheConfigExample example);

    int deleteByPrimaryKey(BigDecimal id);

    int insert(SysCacheConfig record);

    int insertSelective(SysCacheConfig record);

    List<SysCacheConfig> selectByExample(SysCacheConfigExample example);

    SysCacheConfig selectByPrimaryKey(BigDecimal id);

    int updateByExampleSelective(@Param("record") SysCacheConfig record, @Param("example") SysCacheConfigExample example);

    int updateByExample(@Param("record") SysCacheConfig record, @Param("example") SysCacheConfigExample example);

    int updateByPrimaryKeySelective(SysCacheConfig record);

    int updateByPrimaryKey(SysCacheConfig record);
}