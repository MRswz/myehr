package com.myehr.mapper.sysuser;

import com.myehr.pojo.sysuser.SysUserLoginLog;
import com.myehr.pojo.sysuser.SysUserLoginLogExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysUserLoginLogMapper {
    int countByExample(SysUserLoginLogExample example);

    int deleteByExample(SysUserLoginLogExample example);

    int deleteByPrimaryKey(BigDecimal loginUserLogId);

    int insert(SysUserLoginLog record);

    int insertSelective(SysUserLoginLog record);

    List<SysUserLoginLog> selectByExample(SysUserLoginLogExample example);

    SysUserLoginLog selectByPrimaryKey(BigDecimal loginUserLogId);

    int updateByExampleSelective(@Param("record") SysUserLoginLog record, @Param("example") SysUserLoginLogExample example);

    int updateByExample(@Param("record") SysUserLoginLog record, @Param("example") SysUserLoginLogExample example);

    int updateByPrimaryKeySelective(SysUserLoginLog record);

    int updateByPrimaryKey(SysUserLoginLog record);
}