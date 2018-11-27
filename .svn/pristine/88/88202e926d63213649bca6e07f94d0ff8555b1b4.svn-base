package com.myehr.mapper.sysRole;

import com.myehr.pojo.sysRole.SysOrgRole;
import com.myehr.pojo.sysRole.SysOrgRoleExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysOrgRoleMapper {
    int countByExample(SysOrgRoleExample example);

    int deleteByExample(SysOrgRoleExample example);

    int deleteByPrimaryKey(BigDecimal orgRoleId);

    int insert(SysOrgRole record);

    int insertSelective(SysOrgRole record);

    List<SysOrgRole> selectByExample(SysOrgRoleExample example);

    SysOrgRole selectByPrimaryKey(BigDecimal orgRoleId);

    int updateByExampleSelective(@Param("record") SysOrgRole record, @Param("example") SysOrgRoleExample example);

    int updateByExample(@Param("record") SysOrgRole record, @Param("example") SysOrgRoleExample example);

    int updateByPrimaryKeySelective(SysOrgRole record);

    int updateByPrimaryKey(SysOrgRole record);
}