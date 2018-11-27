package com.myehr.mapper.task;

import com.myehr.pojo.task.SysMeetingTask;
import com.myehr.pojo.task.SysMeetingTaskExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysMeetingTaskMapper {
    int countByExample(SysMeetingTaskExample example);

    int deleteByExample(SysMeetingTaskExample example);

    int deleteByPrimaryKey(Long sysMeetingTaskId);

    int insert(SysMeetingTask record);

    int insertSelective(SysMeetingTask record);

    List<SysMeetingTask> selectByExampleWithBLOBs(SysMeetingTaskExample example);

    List<SysMeetingTask> selectByExample(SysMeetingTaskExample example);

    SysMeetingTask selectByPrimaryKey(Long sysMeetingTaskId);

    int updateByExampleSelective(@Param("record") SysMeetingTask record, @Param("example") SysMeetingTaskExample example);

    int updateByExampleWithBLOBs(@Param("record") SysMeetingTask record, @Param("example") SysMeetingTaskExample example);

    int updateByExample(@Param("record") SysMeetingTask record, @Param("example") SysMeetingTaskExample example);

    int updateByPrimaryKeySelective(SysMeetingTask record);

    int updateByPrimaryKeyWithBLOBs(SysMeetingTask record);

    int updateByPrimaryKey(SysMeetingTask record);
}