package com.myehr.mapper.sysmenu;

import com.myehr.pojo.sysmenu.SysSystemSchemeMenu;
import com.myehr.pojo.sysmenu.SysSystemSchemeMenuExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysSystemSchemeMenuMapper {
    int countByExample(SysSystemSchemeMenuExample example);

    int deleteByExample(SysSystemSchemeMenuExample example);

    int deleteByPrimaryKey(BigDecimal schemeMenuId);

    int insert(SysSystemSchemeMenu record);

    int insertSelective(SysSystemSchemeMenu record);

    List<SysSystemSchemeMenu> selectByExample(SysSystemSchemeMenuExample example);

    SysSystemSchemeMenu selectByPrimaryKey(BigDecimal schemeMenuId);

    int updateByExampleSelective(@Param("record") SysSystemSchemeMenu record, @Param("example") SysSystemSchemeMenuExample example);

    int updateByExample(@Param("record") SysSystemSchemeMenu record, @Param("example") SysSystemSchemeMenuExample example);

    int updateByPrimaryKeySelective(SysSystemSchemeMenu record);

    int updateByPrimaryKey(SysSystemSchemeMenu record);
}