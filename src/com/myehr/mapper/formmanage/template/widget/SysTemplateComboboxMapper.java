package com.myehr.mapper.formmanage.template.widget;

import com.myehr.pojo.formmanage.template.widget.SysTemplateCombobox;
import com.myehr.pojo.formmanage.template.widget.SysTemplateComboboxExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysTemplateComboboxMapper {
    int countByExample(SysTemplateComboboxExample example);

    int deleteByExample(SysTemplateComboboxExample example);

    int deleteByPrimaryKey(BigDecimal comboboxId);

    int insert(SysTemplateCombobox record);

    int insertSelective(SysTemplateCombobox record);

    List<SysTemplateCombobox> selectByExample(SysTemplateComboboxExample example);

    SysTemplateCombobox selectByPrimaryKey(BigDecimal comboboxId);

    int updateByExampleSelective(@Param("record") SysTemplateCombobox record, @Param("example") SysTemplateComboboxExample example);

    int updateByExample(@Param("record") SysTemplateCombobox record, @Param("example") SysTemplateComboboxExample example);

    int updateByPrimaryKeySelective(SysTemplateCombobox record);

    int updateByPrimaryKey(SysTemplateCombobox record);
}