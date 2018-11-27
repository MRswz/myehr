package com.myehr.mapper.act.checked;

import com.myehr.pojo.act.checked.SysActCheckedPoint;
import com.myehr.pojo.act.checked.SysActCheckedPointExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysActCheckedPointMapper {
    int countByExample(SysActCheckedPointExample example);

    int deleteByExample(SysActCheckedPointExample example);

    int deleteByPrimaryKey(BigDecimal id);

    int insert(SysActCheckedPoint record);

    int insertSelective(SysActCheckedPoint record);

    List<SysActCheckedPoint> selectByExample(SysActCheckedPointExample example);

    SysActCheckedPoint selectByPrimaryKey(BigDecimal id);

    int updateByExampleSelective(@Param("record") SysActCheckedPoint record, @Param("example") SysActCheckedPointExample example);

    int updateByExample(@Param("record") SysActCheckedPoint record, @Param("example") SysActCheckedPointExample example);

    int updateByPrimaryKeySelective(SysActCheckedPoint record);

    int updateByPrimaryKey(SysActCheckedPoint record);
}