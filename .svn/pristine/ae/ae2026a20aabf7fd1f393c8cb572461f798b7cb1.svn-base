package com.myehr.mapper.act.checked;

import com.myehr.pojo.act.checked.SysActChecked;
import com.myehr.pojo.act.checked.SysActCheckedExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysActCheckedMapper {
    int countByExample(SysActCheckedExample example);

    int deleteByExample(SysActCheckedExample example);

    int deleteByPrimaryKey(BigDecimal id);

    int insert(SysActChecked record);

    int insertSelective(SysActChecked record);

    List<SysActChecked> selectByExample(SysActCheckedExample example);

    SysActChecked selectByPrimaryKey(BigDecimal id);

    int updateByExampleSelective(@Param("record") SysActChecked record, @Param("example") SysActCheckedExample example);

    int updateByExample(@Param("record") SysActChecked record, @Param("example") SysActCheckedExample example);

    int updateByPrimaryKeySelective(SysActChecked record);

    int updateByPrimaryKey(SysActChecked record);
}