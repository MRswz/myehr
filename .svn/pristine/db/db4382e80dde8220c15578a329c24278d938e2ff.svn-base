package com.myehr.mapper.calendar;

import com.myehr.pojo.calendar.Kcalendar;
import com.myehr.pojo.calendar.KcalendarExample;
import com.myehr.pojo.calendar.KcalendarKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface KcalendarMapper {
    int countByExample(KcalendarExample example);

    int deleteByExample(KcalendarExample example);

    int deleteByPrimaryKey(KcalendarKey key);

    int insert(Kcalendar record);

    int insertSelective(Kcalendar record);

    List<Kcalendar> selectByExample(KcalendarExample example);

    Kcalendar selectByPrimaryKey(KcalendarKey key);

    int updateByExampleSelective(@Param("record") Kcalendar record, @Param("example") KcalendarExample example);

    int updateByExample(@Param("record") Kcalendar record, @Param("example") KcalendarExample example);

    int updateByPrimaryKeySelective(Kcalendar record);

    int updateByPrimaryKey(Kcalendar record);
}