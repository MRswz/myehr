package com.myehr.mapper.formmanage.form;

import com.myehr.pojo.formmanage.form.SysButtonRole;
import com.myehr.pojo.formmanage.form.SysButtonRoleExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysButtonRoleMapper {
    int countByExample(SysButtonRoleExample example);

    int deleteByExample(SysButtonRoleExample example);

    int deleteByPrimaryKey(BigDecimal buttonRoleId);

    int insert(SysButtonRole record);

    int insertSelective(SysButtonRole record);

    List<SysButtonRole> selectByExample(SysButtonRoleExample example);

    SysButtonRole selectByPrimaryKey(BigDecimal buttonRoleId);

    int updateByExampleSelective(@Param("record") SysButtonRole record, @Param("example") SysButtonRoleExample example);

    int updateByExample(@Param("record") SysButtonRole record, @Param("example") SysButtonRoleExample example);

    int updateByPrimaryKeySelective(SysButtonRole record);

    int updateByPrimaryKey(SysButtonRole record);
}