package com.myehr.mapper.sysuser;

import com.myehr.pojo.sysuser.SysFieldLog;
import com.myehr.pojo.sysuser.SysFieldLogExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysFieldLogMapper {
    int countByExample(SysFieldLogExample example);

    int deleteByExample(SysFieldLogExample example);

    int deleteByPrimaryKey(BigDecimal logId);

    int insert(SysFieldLog record);

    int insertSelective(SysFieldLog record);

    List<SysFieldLog> selectByExample(SysFieldLogExample example);

    SysFieldLog selectByPrimaryKey(BigDecimal logId);

    int updateByExampleSelective(@Param("record") SysFieldLog record, @Param("example") SysFieldLogExample example);

    int updateByExample(@Param("record") SysFieldLog record, @Param("example") SysFieldLogExample example);

    int updateByPrimaryKeySelective(SysFieldLog record);

    int updateByPrimaryKey(SysFieldLog record);
}