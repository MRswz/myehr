package com.myehr.mapper.app.grid;

import com.myehr.pojo.app.grid.SysAppClass;
import com.myehr.pojo.app.grid.SysAppClassExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysAppClassMapper {
    int countByExample(SysAppClassExample example);

    int deleteByExample(SysAppClassExample example);

    int deleteByPrimaryKey(BigDecimal id);

    int insert(SysAppClass record);

    int insertSelective(SysAppClass record);

    List<SysAppClass> selectByExample(SysAppClassExample example);

    SysAppClass selectByPrimaryKey(BigDecimal id);

    int updateByExampleSelective(@Param("record") SysAppClass record, @Param("example") SysAppClassExample example);

    int updateByExample(@Param("record") SysAppClass record, @Param("example") SysAppClassExample example);

    int updateByPrimaryKeySelective(SysAppClass record);

    int updateByPrimaryKey(SysAppClass record);
}