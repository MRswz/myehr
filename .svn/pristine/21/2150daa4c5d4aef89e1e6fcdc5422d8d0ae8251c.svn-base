package com.myehr.mapper.formmanage.form;

import com.myehr.pojo.formmanage.form.SysFormconfigGrid;
import com.myehr.pojo.formmanage.form.SysFormconfigGridExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysFormconfigGridMapper {
    int countByExample(SysFormconfigGridExample example);

    int deleteByExample(SysFormconfigGridExample example);

    int deleteByPrimaryKey(BigDecimal formGridId);

    int insert(SysFormconfigGrid record);

    int insertSelective(SysFormconfigGrid record);

    List<SysFormconfigGrid> selectByExample(SysFormconfigGridExample example);

    SysFormconfigGrid selectByPrimaryKey(BigDecimal formGridId);

    int updateByExampleSelective(@Param("record") SysFormconfigGrid record, @Param("example") SysFormconfigGridExample example);

    int updateByExample(@Param("record") SysFormconfigGrid record, @Param("example") SysFormconfigGridExample example);

    int updateByPrimaryKeySelective(SysFormconfigGrid record);

    int updateByPrimaryKey(SysFormconfigGrid record);
}