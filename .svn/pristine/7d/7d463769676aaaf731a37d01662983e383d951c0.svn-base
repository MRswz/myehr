package com.myehr.mapper.calendar;

import com.myehr.pojo.calendar.Kcalclass;
import com.myehr.pojo.calendar.KcalclassExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface KcalclassMapper {
    int countByExample(KcalclassExample example);

    int deleteByExample(KcalclassExample example);

    int deleteByPrimaryKey(String kguid);

    int insert(Kcalclass record);

    int insertSelective(Kcalclass record);

    List<Kcalclass> selectByExample(KcalclassExample example);

    Kcalclass selectByPrimaryKey(String kguid);

    int updateByExampleSelective(@Param("record") Kcalclass record, @Param("example") KcalclassExample example);

    int updateByExample(@Param("record") Kcalclass record, @Param("example") KcalclassExample example);

    int updateByPrimaryKeySelective(Kcalclass record);

    int updateByPrimaryKey(Kcalclass record);
}