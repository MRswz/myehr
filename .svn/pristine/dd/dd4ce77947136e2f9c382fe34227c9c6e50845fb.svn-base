package com.myehr.mapper.sysmenu;

import com.myehr.pojo.sysmenu.SysSystemScheme;
import com.myehr.pojo.sysmenu.SysSystemSchemeExample;
import com.myehr.pojo.sysmenu.SysSystemSchemeWithBLOBs;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysSystemSchemeMapper {
    int countByExample(SysSystemSchemeExample example);

    int deleteByExample(SysSystemSchemeExample example);

    int deleteByPrimaryKey(BigDecimal schemeId);

    int insert(SysSystemSchemeWithBLOBs record);

    int insertSelective(SysSystemSchemeWithBLOBs record);

    List<SysSystemSchemeWithBLOBs> selectByExampleWithBLOBs(SysSystemSchemeExample example);

    List<SysSystemScheme> selectByExample(SysSystemSchemeExample example);

    SysSystemSchemeWithBLOBs selectByPrimaryKey(BigDecimal schemeId);

    int updateByExampleSelective(@Param("record") SysSystemSchemeWithBLOBs record, @Param("example") SysSystemSchemeExample example);

    int updateByExampleWithBLOBs(@Param("record") SysSystemSchemeWithBLOBs record, @Param("example") SysSystemSchemeExample example);

    int updateByExample(@Param("record") SysSystemScheme record, @Param("example") SysSystemSchemeExample example);

    int updateByPrimaryKeySelective(SysSystemSchemeWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(SysSystemSchemeWithBLOBs record);

    int updateByPrimaryKey(SysSystemScheme record);
}