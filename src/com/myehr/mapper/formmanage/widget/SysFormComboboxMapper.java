package com.myehr.mapper.formmanage.widget;

import com.myehr.pojo.formmanage.widget.SysFormCombobox;
import com.myehr.pojo.formmanage.widget.SysFormComboboxExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysFormComboboxMapper {
    int countByExample(SysFormComboboxExample example);

    int deleteByExample(SysFormComboboxExample example);

    int deleteByPrimaryKey(BigDecimal comboboxId);

    int insert(SysFormCombobox record);

    int insertSelective(SysFormCombobox record);

    List<SysFormCombobox> selectByExample(SysFormComboboxExample example);

    SysFormCombobox selectByPrimaryKey(BigDecimal comboboxId);

    int updateByExampleSelective(@Param("record") SysFormCombobox record, @Param("example") SysFormComboboxExample example);

    int updateByExample(@Param("record") SysFormCombobox record, @Param("example") SysFormComboboxExample example);

    int updateByPrimaryKeySelective(SysFormCombobox record);

    int updateByPrimaryKey(SysFormCombobox record);
}