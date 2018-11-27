package com.myehr.mapper.formmanage.form;

import com.myehr.pojo.formmanage.form.SysFormWhere;
import com.myehr.pojo.formmanage.form.SysFormWhereExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysFormWhereMapper {
    int countByExample(SysFormWhereExample example);

    int deleteByExample(SysFormWhereExample example);

    int deleteByPrimaryKey(BigDecimal formWhereId);

    int insert(SysFormWhere record);

    int insertSelective(SysFormWhere record);

    List<SysFormWhere> selectByExample(SysFormWhereExample example);

    SysFormWhere selectByPrimaryKey(BigDecimal formWhereId);

    int updateByExampleSelective(@Param("record") SysFormWhere record, @Param("example") SysFormWhereExample example);

    int updateByExample(@Param("record") SysFormWhere record, @Param("example") SysFormWhereExample example);

    int updateByPrimaryKeySelective(SysFormWhere record);

    int updateByPrimaryKey(SysFormWhere record);
}