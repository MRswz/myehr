package com.myehr.mapper.formmanage.form;

import com.myehr.pojo.formmanage.form.SysExecSql;
import com.myehr.pojo.formmanage.form.SysExecSqlExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysExecSqlMapper {
    int countByExample(SysExecSqlExample example);

    int deleteByExample(SysExecSqlExample example);

    int deleteByPrimaryKey(BigDecimal execSqlId);

    int insert(SysExecSql record);

    int insertSelective(SysExecSql record);

    List<SysExecSql> selectByExample(SysExecSqlExample example);

    SysExecSql selectByPrimaryKey(BigDecimal execSqlId);

    int updateByExampleSelective(@Param("record") SysExecSql record, @Param("example") SysExecSqlExample example);

    int updateByExample(@Param("record") SysExecSql record, @Param("example") SysExecSqlExample example);

    int updateByPrimaryKeySelective(SysExecSql record);

    int updateByPrimaryKey(SysExecSql record);
}