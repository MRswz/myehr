package com.myehr.mapper.process;

import com.myehr.pojo.process.FreeProcess;
import com.myehr.pojo.process.FreeProcessExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FreeProcessMapper {
    int countByExample(FreeProcessExample example);

    int deleteByExample(FreeProcessExample example);

    int deleteByPrimaryKey(Long freeProcessId);

    int insert(FreeProcess record);

    int insertSelective(FreeProcess record);

    List<FreeProcess> selectByExample(FreeProcessExample example);

    FreeProcess selectByPrimaryKey(Long freeProcessId);

    int updateByExampleSelective(@Param("record") FreeProcess record, @Param("example") FreeProcessExample example);

    int updateByExample(@Param("record") FreeProcess record, @Param("example") FreeProcessExample example);

    int updateByPrimaryKeySelective(FreeProcess record);

    int updateByPrimaryKey(FreeProcess record);
}