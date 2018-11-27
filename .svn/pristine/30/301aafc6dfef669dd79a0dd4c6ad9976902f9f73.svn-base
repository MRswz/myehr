package com.myehr.mapper.entity;

import com.myehr.pojo.entity.SysEntityFieldMapping;
import com.myehr.pojo.entity.SysEntityFieldMappingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysEntityFieldMappingMapper {
    int countByExample(SysEntityFieldMappingExample example);

    int deleteByExample(SysEntityFieldMappingExample example);

    int deleteByPrimaryKey(Long entityFieldMappingId);

    int insert(SysEntityFieldMapping record);

    int insertSelective(SysEntityFieldMapping record);

    List<SysEntityFieldMapping> selectByExample(SysEntityFieldMappingExample example);

    SysEntityFieldMapping selectByPrimaryKey(Long entityFieldMappingId);

    int updateByExampleSelective(@Param("record") SysEntityFieldMapping record, @Param("example") SysEntityFieldMappingExample example);

    int updateByExample(@Param("record") SysEntityFieldMapping record, @Param("example") SysEntityFieldMappingExample example);

    int updateByPrimaryKeySelective(SysEntityFieldMapping record);

    int updateByPrimaryKey(SysEntityFieldMapping record);
}