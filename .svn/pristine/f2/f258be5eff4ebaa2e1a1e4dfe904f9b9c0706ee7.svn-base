package com.myehr.mapper.formmanage.form;

import com.myehr.pojo.formmanage.form.SysActRole;
import com.myehr.pojo.formmanage.form.SysActRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysActRoleMapper {
    int countByExample(SysActRoleExample example);

    int deleteByExample(SysActRoleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SysActRole record);

    int insertSelective(SysActRole record);

    List<SysActRole> selectByExample(SysActRoleExample example);

    SysActRole selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SysActRole record, @Param("example") SysActRoleExample example);

    int updateByExample(@Param("record") SysActRole record, @Param("example") SysActRoleExample example);

    int updateByPrimaryKeySelective(SysActRole record);

    int updateByPrimaryKey(SysActRole record);
}