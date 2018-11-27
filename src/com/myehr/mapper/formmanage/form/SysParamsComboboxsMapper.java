package com.myehr.mapper.formmanage.form;

import com.myehr.pojo.formmanage.form.SysParamsComboboxs;
import com.myehr.pojo.formmanage.form.SysParamsComboboxsExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysParamsComboboxsMapper {
    int countByExample(SysParamsComboboxsExample example);

    int deleteByExample(SysParamsComboboxsExample example);

    int deleteByPrimaryKey(BigDecimal comboboxId);

    int insert(SysParamsComboboxs record);

    int insertSelective(SysParamsComboboxs record);

    List<SysParamsComboboxs> selectByExample(SysParamsComboboxsExample example);

    SysParamsComboboxs selectByPrimaryKey(BigDecimal comboboxId);

    int updateByExampleSelective(@Param("record") SysParamsComboboxs record, @Param("example") SysParamsComboboxsExample example);

    int updateByExample(@Param("record") SysParamsComboboxs record, @Param("example") SysParamsComboboxsExample example);

    int updateByPrimaryKeySelective(SysParamsComboboxs record);

    int updateByPrimaryKey(SysParamsComboboxs record);
}