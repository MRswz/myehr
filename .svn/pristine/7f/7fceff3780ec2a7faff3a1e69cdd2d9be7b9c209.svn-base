package com.myehr.mapper.fileinput;

import com.myehr.pojo.fileinput.SysFileCheckedPoint;
import com.myehr.pojo.fileinput.SysFileCheckedPointExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysFileCheckedPointMapper {
    int countByExample(SysFileCheckedPointExample example);

    int deleteByExample(SysFileCheckedPointExample example);

    int deleteByPrimaryKey(BigDecimal id);

    int insert(SysFileCheckedPoint record);

    int insertSelective(SysFileCheckedPoint record);

    List<SysFileCheckedPoint> selectByExample(SysFileCheckedPointExample example);

    SysFileCheckedPoint selectByPrimaryKey(BigDecimal id);

    int updateByExampleSelective(@Param("record") SysFileCheckedPoint record, @Param("example") SysFileCheckedPointExample example);

    int updateByExample(@Param("record") SysFileCheckedPoint record, @Param("example") SysFileCheckedPointExample example);

    int updateByPrimaryKeySelective(SysFileCheckedPoint record);

    int updateByPrimaryKey(SysFileCheckedPoint record);
}