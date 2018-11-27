package com.myehr.mapper.calendar;

import com.myehr.pojo.calendar.AttendEmpshiftgroupSchedue;
import com.myehr.pojo.calendar.AttendEmpshiftgroupSchedueExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AttendEmpshiftgroupSchedueMapper {
    int countByExample(AttendEmpshiftgroupSchedueExample example);

    int deleteByExample(AttendEmpshiftgroupSchedueExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AttendEmpshiftgroupSchedue record);

    int insertSelective(AttendEmpshiftgroupSchedue record);

    List<AttendEmpshiftgroupSchedue> selectByExample(AttendEmpshiftgroupSchedueExample example);

    AttendEmpshiftgroupSchedue selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AttendEmpshiftgroupSchedue record, @Param("example") AttendEmpshiftgroupSchedueExample example);

    int updateByExample(@Param("record") AttendEmpshiftgroupSchedue record, @Param("example") AttendEmpshiftgroupSchedueExample example);

    int updateByPrimaryKeySelective(AttendEmpshiftgroupSchedue record);

    int updateByPrimaryKey(AttendEmpshiftgroupSchedue record);
}