package com.myehr.mapper.formmanage.form;

import com.myehr.pojo.formmanage.form.SysFieldRole;
import com.myehr.pojo.formmanage.form.SysFieldRoleExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysFieldRoleMapper {
    int countByExample(SysFieldRoleExample example);

    int deleteByExample(SysFieldRoleExample example);

    int deleteByPrimaryKey(BigDecimal fieldRoleId);

    int insert(SysFieldRole record);

    int insertSelective(SysFieldRole record);

    List<SysFieldRole> selectByExample(SysFieldRoleExample example);

    SysFieldRole selectByPrimaryKey(BigDecimal fieldRoleId);

    int updateByExampleSelective(@Param("record") SysFieldRole record, @Param("example") SysFieldRoleExample example);

    int updateByExample(@Param("record") SysFieldRole record, @Param("example") SysFieldRoleExample example);

    int updateByPrimaryKeySelective(SysFieldRole record);

    int updateByPrimaryKey(SysFieldRole record);
}