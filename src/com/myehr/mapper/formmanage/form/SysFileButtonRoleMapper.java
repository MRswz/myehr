package com.myehr.mapper.formmanage.form;

import com.myehr.pojo.formmanage.form.SysFileButtonRole;
import com.myehr.pojo.formmanage.form.SysFileButtonRoleExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysFileButtonRoleMapper {
    int countByExample(SysFileButtonRoleExample example);

    int deleteByExample(SysFileButtonRoleExample example);

    int deleteByPrimaryKey(BigDecimal buttonRoleId);

    int insert(SysFileButtonRole record);

    int insertSelective(SysFileButtonRole record);

    List<SysFileButtonRole> selectByExample(SysFileButtonRoleExample example);

    SysFileButtonRole selectByPrimaryKey(BigDecimal buttonRoleId);

    int updateByExampleSelective(@Param("record") SysFileButtonRole record, @Param("example") SysFileButtonRoleExample example);

    int updateByExample(@Param("record") SysFileButtonRole record, @Param("example") SysFileButtonRoleExample example);

    int updateByPrimaryKeySelective(SysFileButtonRole record);

    int updateByPrimaryKey(SysFileButtonRole record);
}