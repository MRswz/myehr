package com.myehr.mapper.formmanage.form;

import com.myehr.pojo.formmanage.form.FormChartsBarColumn;
import com.myehr.pojo.formmanage.form.FormChartsBarColumnExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FormChartsBarColumnMapper {
    int countByExample(FormChartsBarColumnExample example);

    int deleteByExample(FormChartsBarColumnExample example);

    int deleteByPrimaryKey(BigDecimal chartsBarColumnId);

    int insert(FormChartsBarColumn record);

    int insertSelective(FormChartsBarColumn record);

    List<FormChartsBarColumn> selectByExample(FormChartsBarColumnExample example);

    FormChartsBarColumn selectByPrimaryKey(BigDecimal chartsBarColumnId);

    int updateByExampleSelective(@Param("record") FormChartsBarColumn record, @Param("example") FormChartsBarColumnExample example);

    int updateByExample(@Param("record") FormChartsBarColumn record, @Param("example") FormChartsBarColumnExample example);

    int updateByPrimaryKeySelective(FormChartsBarColumn record);

    int updateByPrimaryKey(FormChartsBarColumn record);
}