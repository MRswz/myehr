package com.myehr.mapper.calendar;

import com.myehr.pojo.calendar.Kbasecode;
import com.myehr.pojo.calendar.KbasecodeExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface KbasecodeMapper {
    int countByExample(KbasecodeExample example);

    int deleteByExample(KbasecodeExample example);

    int deleteByPrimaryKey(BigDecimal kbcId);

    int insert(Kbasecode record);

    int insertSelective(Kbasecode record);

    List<Kbasecode> selectByExample(KbasecodeExample example);

    Kbasecode selectByPrimaryKey(BigDecimal kbcId);

    int updateByExampleSelective(@Param("record") Kbasecode record, @Param("example") KbasecodeExample example);

    int updateByExample(@Param("record") Kbasecode record, @Param("example") KbasecodeExample example);

    int updateByPrimaryKeySelective(Kbasecode record);

    int updateByPrimaryKey(Kbasecode record);
}