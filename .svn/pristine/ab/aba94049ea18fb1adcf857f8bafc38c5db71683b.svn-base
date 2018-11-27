package com.myehr.mapper.sysmenu;

import com.myehr.pojo.sysmenu.SysIcon;
import com.myehr.pojo.sysmenu.SysIconExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysIconMapper {
    int countByExample(SysIconExample example);

    int deleteByExample(SysIconExample example);

    int deleteByPrimaryKey(BigDecimal iconId);

    int insert(SysIcon record);

    int insertSelective(SysIcon record);

    List<SysIcon> selectByExample(SysIconExample example);

    SysIcon selectByPrimaryKey(BigDecimal iconId);

    int updateByExampleSelective(@Param("record") SysIcon record, @Param("example") SysIconExample example);

    int updateByExample(@Param("record") SysIcon record, @Param("example") SysIconExample example);

    int updateByPrimaryKeySelective(SysIcon record);

    int updateByPrimaryKey(SysIcon record);
}