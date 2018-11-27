package com.myehr.mapper.task;

import com.myehr.pojo.task.SysTimer;
import com.myehr.pojo.task.SysTimerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysTimerMapper {
    int countByExample(SysTimerExample example);

    int deleteByExample(SysTimerExample example);

    int deleteByPrimaryKey(Long sysTimerId);

    int insert(SysTimer record);

    int insertSelective(SysTimer record);

    List<SysTimer> selectByExample(SysTimerExample example);

    SysTimer selectByPrimaryKey(Long sysTimerId);

    int updateByExampleSelective(@Param("record") SysTimer record, @Param("example") SysTimerExample example);

    int updateByExample(@Param("record") SysTimer record, @Param("example") SysTimerExample example);

    int updateByPrimaryKeySelective(SysTimer record);

    int updateByPrimaryKey(SysTimer record);
}