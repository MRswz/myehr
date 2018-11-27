package com.myehr.mapper.calendar;

import com.myehr.pojo.calendar.AttendZone;
import com.myehr.pojo.calendar.AttendZoneExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AttendZoneMapper {
    int countByExample(AttendZoneExample example);

    int deleteByExample(AttendZoneExample example);

    int deleteByPrimaryKey(Integer azId);

    int insert(AttendZone record);

    int insertSelective(AttendZone record);

    List<AttendZone> selectByExample(AttendZoneExample example);

    AttendZone selectByPrimaryKey(Integer azId);

    int updateByExampleSelective(@Param("record") AttendZone record, @Param("example") AttendZoneExample example);

    int updateByExample(@Param("record") AttendZone record, @Param("example") AttendZoneExample example);

    int updateByPrimaryKeySelective(AttendZone record);

    int updateByPrimaryKey(AttendZone record);
}