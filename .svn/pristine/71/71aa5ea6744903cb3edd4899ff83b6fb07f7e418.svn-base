package com.myehr.mapper.calendar;

import com.myehr.pojo.calendar.AttendShifttype;
import com.myehr.pojo.calendar.AttendShifttypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AttendShifttypeMapper {
    int countByExample(AttendShifttypeExample example);

    int deleteByExample(AttendShifttypeExample example);

    int deleteByPrimaryKey(Integer asId);

    int insert(AttendShifttype record);

    int insertSelective(AttendShifttype record);

    List<AttendShifttype> selectByExample(AttendShifttypeExample example);

    AttendShifttype selectByPrimaryKey(Integer asId);

    int updateByExampleSelective(@Param("record") AttendShifttype record, @Param("example") AttendShifttypeExample example);

    int updateByExample(@Param("record") AttendShifttype record, @Param("example") AttendShifttypeExample example);

    int updateByPrimaryKeySelective(AttendShifttype record);

    int updateByPrimaryKey(AttendShifttype record);
}