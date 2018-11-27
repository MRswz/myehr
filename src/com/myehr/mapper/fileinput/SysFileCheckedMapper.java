package com.myehr.mapper.fileinput;

import com.myehr.pojo.fileinput.SysFileChecked;
import com.myehr.pojo.fileinput.SysFileCheckedExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysFileCheckedMapper {
    int countByExample(SysFileCheckedExample example);

    int deleteByExample(SysFileCheckedExample example);

    int deleteByPrimaryKey(BigDecimal id);

    int insert(SysFileChecked record);

    int insertSelective(SysFileChecked record);

    List<SysFileChecked> selectByExample(SysFileCheckedExample example);

    SysFileChecked selectByPrimaryKey(BigDecimal id);

    int updateByExampleSelective(@Param("record") SysFileChecked record, @Param("example") SysFileCheckedExample example);

    int updateByExample(@Param("record") SysFileChecked record, @Param("example") SysFileCheckedExample example);

    int updateByPrimaryKeySelective(SysFileChecked record);

    int updateByPrimaryKey(SysFileChecked record);
}