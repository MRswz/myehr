package com.myehr.mapper.entity;

import com.myehr.pojo.entity.SysEntity;
import com.myehr.pojo.entity.SysEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysEntityMapper {
    int countByExample(SysEntityExample example);

    int deleteByExample(SysEntityExample example);

    int deleteByPrimaryKey(Integer entityId);

    int insert(SysEntity record);

    int insertSelective(SysEntity record);

    List<SysEntity> selectByExample(SysEntityExample example);

    SysEntity selectByPrimaryKey(Integer entityId);

    int updateByExampleSelective(@Param("record") SysEntity record, @Param("example") SysEntityExample example);

    int updateByExample(@Param("record") SysEntity record, @Param("example") SysEntityExample example);

    int updateByPrimaryKeySelective(SysEntity record);

    int updateByPrimaryKey(SysEntity record);
}