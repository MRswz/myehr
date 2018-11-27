package com.myehr.mapper.formmanage.form;

import com.myehr.pojo.formmanage.form.SysSqlParams;
import com.myehr.pojo.formmanage.form.SysSqlParamsExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysSqlParamsMapper {
    int countByExample(SysSqlParamsExample example);

    int deleteByExample(SysSqlParamsExample example);

    int deleteByPrimaryKey(BigDecimal sqlParamsId);

    int insert(SysSqlParams record);

    int insertSelective(SysSqlParams record);

    List<SysSqlParams> selectByExample(SysSqlParamsExample example);

    SysSqlParams selectByPrimaryKey(BigDecimal sqlParamsId);

    int updateByExampleSelective(@Param("record") SysSqlParams record, @Param("example") SysSqlParamsExample example);

    int updateByExample(@Param("record") SysSqlParams record, @Param("example") SysSqlParamsExample example);

    int updateByPrimaryKeySelective(SysSqlParams record);

    int updateByPrimaryKey(SysSqlParams record);
}