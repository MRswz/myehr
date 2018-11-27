package com.myehr.mapper.calendar;

import com.myehr.pojo.calendar.AttendCalendar;
import com.myehr.pojo.calendar.AttendCalendarExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AttendCalendarMapper {
    int countByExample(AttendCalendarExample example);

    int deleteByExample(AttendCalendarExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AttendCalendar record);

    int insertSelective(AttendCalendar record);

    List<AttendCalendar> selectByExample(AttendCalendarExample example);

    AttendCalendar selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AttendCalendar record, @Param("example") AttendCalendarExample example);

    int updateByExample(@Param("record") AttendCalendar record, @Param("example") AttendCalendarExample example);

    int updateByPrimaryKeySelective(AttendCalendar record);

    int updateByPrimaryKey(AttendCalendar record);
}