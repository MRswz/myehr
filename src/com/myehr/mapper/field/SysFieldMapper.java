package com.myehr.mapper.field;

import com.myehr.pojo.field.SysField;
import com.myehr.pojo.field.SysFieldExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysFieldMapper {
    int countByExample(SysFieldExample example);

    int deleteByExample(SysFieldExample example);

    int deleteByPrimaryKey(BigDecimal fieldId);

    int insert(SysField record);

    int insertSelective(SysField record);

    List<SysField> selectByExample(SysFieldExample example);

    SysField selectByPrimaryKey(BigDecimal fieldId);

    int updateByExampleSelective(@Param("record") SysField record, @Param("example") SysFieldExample example);

    int updateByExample(@Param("record") SysField record, @Param("example") SysFieldExample example);

    int updateByPrimaryKeySelective(SysField record);

    int updateByPrimaryKey(SysField record);
}