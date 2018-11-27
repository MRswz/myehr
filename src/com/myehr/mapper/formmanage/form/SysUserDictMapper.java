package com.myehr.mapper.formmanage.form;

import com.myehr.pojo.formmanage.form.SysUserDict;
import com.myehr.pojo.formmanage.form.SysUserDictExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysUserDictMapper {
    int countByExample(SysUserDictExample example);

    int deleteByExample(SysUserDictExample example);

    int deleteByPrimaryKey(BigDecimal userDictId);

    int insert(SysUserDict record);

    int insertSelective(SysUserDict record);

    List<SysUserDict> selectByExample(SysUserDictExample example);

    SysUserDict selectByPrimaryKey(BigDecimal userDictId);

    int updateByExampleSelective(@Param("record") SysUserDict record, @Param("example") SysUserDictExample example);

    int updateByExample(@Param("record") SysUserDict record, @Param("example") SysUserDictExample example);

    int updateByPrimaryKeySelective(SysUserDict record);

    int updateByPrimaryKey(SysUserDict record);
}