package com.myehr.mapper.formmanage.form;

import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.myehr.pojo.formmanage.form.SysFormGeneralParam;
import com.myehr.pojo.formmanage.form.SysFormGeneralParamExample;

public interface SysFormGeneralParamMapper {
    int countByExample(SysFormGeneralParamExample example);

    int deleteByExample(SysFormGeneralParamExample example);

    int deleteByPrimaryKey(BigDecimal paramId);

    int insert(SysFormGeneralParam record);

    int insertSelective(SysFormGeneralParam record);

    List<SysFormGeneralParam> selectByExample(SysFormGeneralParamExample example);

    SysFormGeneralParam selectByPrimaryKey(BigDecimal paramId);

    int updateByExampleSelective(@Param("record") SysFormGeneralParam record, @Param("example") SysFormGeneralParamExample example);

    int updateByExample(@Param("record") SysFormGeneralParam record, @Param("example") SysFormGeneralParamExample example);

    int updateByPrimaryKeySelective(SysFormGeneralParam record);

    int updateByPrimaryKey(SysFormGeneralParam record);
}