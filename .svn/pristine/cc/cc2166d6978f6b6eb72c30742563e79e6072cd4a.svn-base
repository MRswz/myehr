package com.myehr.mapper.lang;

import com.myehr.pojo.lang.SysAlarm;
import com.myehr.pojo.lang.SysAlarmExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysAlarmMapper {
    int countByExample(SysAlarmExample example);

    int deleteByExample(SysAlarmExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SysAlarm record);

    int insertSelective(SysAlarm record);

    List<SysAlarm> selectByExample(SysAlarmExample example);

    SysAlarm selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SysAlarm record, @Param("example") SysAlarmExample example);

    int updateByExample(@Param("record") SysAlarm record, @Param("example") SysAlarmExample example);

    int updateByPrimaryKeySelective(SysAlarm record);

    int updateByPrimaryKey(SysAlarm record);
}