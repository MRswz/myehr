package com.myehr.mapper.formmanage.form;

import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.myehr.pojo.formmanage.form.SysFormGroup;
import com.myehr.pojo.formmanage.form.SysFormGroupExample;

public interface SysFormGroupMapper {
    int countByExample(SysFormGroupExample example);

    int deleteByExample(SysFormGroupExample example);

    int deleteByPrimaryKey(BigDecimal formGroupId);

    int insert(SysFormGroup record);

    int insertSelective(SysFormGroup record);

    List<SysFormGroup> selectByExample(SysFormGroupExample example);

    SysFormGroup selectByPrimaryKey(BigDecimal formGroupId);

    int updateByExampleSelective(@Param("record") SysFormGroup record, @Param("example") SysFormGroupExample example);

    int updateByExample(@Param("record") SysFormGroup record, @Param("example") SysFormGroupExample example);

    int updateByPrimaryKeySelective(SysFormGroup record);

    int updateByPrimaryKey(SysFormGroup record);
}