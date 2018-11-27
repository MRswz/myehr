package com.myehr.mapper.formmanage.widget;

import com.myehr.pojo.formmanage.widget.SysFormDatepicker;
import com.myehr.pojo.formmanage.widget.SysFormDatepickerExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysFormDatepickerMapper {
    int countByExample(SysFormDatepickerExample example);

    int deleteByExample(SysFormDatepickerExample example);

    int deleteByPrimaryKey(BigDecimal datepickerId);

    int insert(SysFormDatepicker record);

    int insertSelective(SysFormDatepicker record);

    List<SysFormDatepicker> selectByExample(SysFormDatepickerExample example);

    SysFormDatepicker selectByPrimaryKey(BigDecimal datepickerId);

    int updateByExampleSelective(@Param("record") SysFormDatepicker record, @Param("example") SysFormDatepickerExample example);

    int updateByExample(@Param("record") SysFormDatepicker record, @Param("example") SysFormDatepickerExample example);

    int updateByPrimaryKeySelective(SysFormDatepicker record);

    int updateByPrimaryKey(SysFormDatepicker record);
}