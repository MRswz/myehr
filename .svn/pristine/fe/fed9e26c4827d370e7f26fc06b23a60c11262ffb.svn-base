package com.myehr.mapper.formmanage.widget;

import com.myehr.pojo.formmanage.widget.SysFormCheckbox;
import com.myehr.pojo.formmanage.widget.SysFormCheckboxExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysFormCheckboxMapper {
    int countByExample(SysFormCheckboxExample example);

    int deleteByExample(SysFormCheckboxExample example);

    int deleteByPrimaryKey(BigDecimal checkboxId);

    int insert(SysFormCheckbox record);

    int insertSelective(SysFormCheckbox record);

    List<SysFormCheckbox> selectByExample(SysFormCheckboxExample example);

    SysFormCheckbox selectByPrimaryKey(BigDecimal checkboxId);

    int updateByExampleSelective(@Param("record") SysFormCheckbox record, @Param("example") SysFormCheckboxExample example);

    int updateByExample(@Param("record") SysFormCheckbox record, @Param("example") SysFormCheckboxExample example);

    int updateByPrimaryKeySelective(SysFormCheckbox record);

    int updateByPrimaryKey(SysFormCheckbox record);
}