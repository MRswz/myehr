package com.myehr.mapper.sysmenu;

import com.myehr.pojo.sysmenu.SysMenuParam;
import com.myehr.pojo.sysmenu.SysMenuParamExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysMenuParamMapper {
    int countByExample(SysMenuParamExample example);

    int deleteByExample(SysMenuParamExample example);

    int deleteByPrimaryKey(BigDecimal menuParamId);

    int insert(SysMenuParam record);

    int insertSelective(SysMenuParam record);

    List<SysMenuParam> selectByExample(SysMenuParamExample example);

    SysMenuParam selectByPrimaryKey(BigDecimal menuParamId);

    int updateByExampleSelective(@Param("record") SysMenuParam record, @Param("example") SysMenuParamExample example);

    int updateByExample(@Param("record") SysMenuParam record, @Param("example") SysMenuParamExample example);

    int updateByPrimaryKeySelective(SysMenuParam record);

    int updateByPrimaryKey(SysMenuParam record);
}