package com.myehr.mapper.primaryKey;

import com.myehr.pojo.primaryKey.PrimaryKeyTable;
import com.myehr.pojo.primaryKey.PrimaryKeyTableExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PrimaryKeyTableMapper {
    int countByExample(PrimaryKeyTableExample example);

    int deleteByExample(PrimaryKeyTableExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PrimaryKeyTable record);

    int insertSelective(PrimaryKeyTable record);

    List<PrimaryKeyTable> selectByExample(PrimaryKeyTableExample example);

    PrimaryKeyTable selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PrimaryKeyTable record, @Param("example") PrimaryKeyTableExample example);

    int updateByExample(@Param("record") PrimaryKeyTable record, @Param("example") PrimaryKeyTableExample example);

    int updateByPrimaryKeySelective(PrimaryKeyTable record);

    int updateByPrimaryKey(PrimaryKeyTable record);
}