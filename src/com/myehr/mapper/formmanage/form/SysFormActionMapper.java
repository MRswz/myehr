package com.myehr.mapper.formmanage.form;

import com.myehr.pojo.formmanage.form.SysFormAction;
import com.myehr.pojo.formmanage.form.SysFormActionExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysFormActionMapper {
    int countByExample(SysFormActionExample example);

    int deleteByExample(SysFormActionExample example);

    int deleteByPrimaryKey(BigDecimal id);

    int insert(SysFormAction record);

    int insertSelective(SysFormAction record);

    List<SysFormAction> selectByExample(SysFormActionExample example);

    SysFormAction selectByPrimaryKey(BigDecimal id);

    int updateByExampleSelective(@Param("record") SysFormAction record, @Param("example") SysFormActionExample example);

    int updateByExample(@Param("record") SysFormAction record, @Param("example") SysFormActionExample example);

    int updateByPrimaryKeySelective(SysFormAction record);

    int updateByPrimaryKey(SysFormAction record);
}