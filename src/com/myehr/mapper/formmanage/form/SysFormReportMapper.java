package com.myehr.mapper.formmanage.form;

import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.myehr.pojo.formmanage.form.SysFormReport;
import com.myehr.pojo.formmanage.form.SysFormReportExample;

public interface SysFormReportMapper {
    int countByExample(SysFormReportExample example);

    int deleteByExample(SysFormReportExample example);

    int deleteByPrimaryKey(BigDecimal reportId);

    int insert(SysFormReport record);

    int insertSelective(SysFormReport record);

    List<SysFormReport> selectByExample(SysFormReportExample example);

    SysFormReport selectByPrimaryKey(BigDecimal reportId);

    int updateByExampleSelective(@Param("record") SysFormReport record, @Param("example") SysFormReportExample example);

    int updateByExample(@Param("record") SysFormReport record, @Param("example") SysFormReportExample example);

    int updateByPrimaryKeySelective(SysFormReport record);

    int updateByPrimaryKey(SysFormReport record);
}