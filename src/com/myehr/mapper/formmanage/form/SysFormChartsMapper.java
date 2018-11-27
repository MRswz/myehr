package com.myehr.mapper.formmanage.form;

import com.myehr.pojo.formmanage.form.SysFormCharts;
import com.myehr.pojo.formmanage.form.SysFormChartsExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysFormChartsMapper {
    int countByExample(SysFormChartsExample example);

    int deleteByExample(SysFormChartsExample example);

    int deleteByPrimaryKey(BigDecimal formChartsId);

    int insert(SysFormCharts record);

    int insertSelective(SysFormCharts record);

    List<SysFormCharts> selectByExample(SysFormChartsExample example);

    SysFormCharts selectByPrimaryKey(BigDecimal formChartsId);

    int updateByExampleSelective(@Param("record") SysFormCharts record, @Param("example") SysFormChartsExample example);

    int updateByExample(@Param("record") SysFormCharts record, @Param("example") SysFormChartsExample example);

    int updateByPrimaryKeySelective(SysFormCharts record);

    int updateByPrimaryKey(SysFormCharts record);
}