package com.myehr.mapper.task;

import com.myehr.pojo.task.SysTask;
import com.myehr.pojo.task.SysTaskExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysTaskMapper {
    int countByExample(SysTaskExample example);

    int deleteByExample(SysTaskExample example);

    int deleteByPrimaryKey(Long sysTaskId);

    int insert(SysTask record);

    int insertSelective(SysTask record);

    List<SysTask> selectByExample(SysTaskExample example);

    SysTask selectByPrimaryKey(Long sysTaskId);

    int updateByExampleSelective(@Param("record") SysTask record, @Param("example") SysTaskExample example);

    int updateByExample(@Param("record") SysTask record, @Param("example") SysTaskExample example);

    int updateByPrimaryKeySelective(SysTask record);

    int updateByPrimaryKey(SysTask record);
}