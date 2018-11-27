package com.myehr.mapper.sysRole;


import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.myehr.pojo.sysRole.SysUserOrg;
import com.myehr.pojo.sysRole.SysUserOrgExample;

public interface SysUserOrgMapper {
    int countByExample(SysUserOrgExample example);

    int deleteByExample(SysUserOrgExample example);

    int deleteByPrimaryKey(Integer userOrgId);

    int insert(SysUserOrg record);

    int insertSelective(SysUserOrg record);

    List<SysUserOrg> selectByExample(SysUserOrgExample example);

    SysUserOrg selectByPrimaryKey(Integer userOrgId);

    int updateByExampleSelective(@Param("record") SysUserOrg record, @Param("example") SysUserOrgExample example);

    int updateByExample(@Param("record") SysUserOrg record, @Param("example") SysUserOrgExample example);

    int updateByPrimaryKeySelective(SysUserOrg record);

    int updateByPrimaryKey(SysUserOrg record);
}