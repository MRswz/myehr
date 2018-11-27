package com.myehr.mapper.formmanage.form;

import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.myehr.pojo.formmanage.form.SysFormconfigMstTab;
import com.myehr.pojo.formmanage.form.SysFormconfigMstTabExample;

public interface SysFormconfigMstTabMapper {
    int countByExample(SysFormconfigMstTabExample example);

    int deleteByExample(SysFormconfigMstTabExample example);

    int deleteByPrimaryKey(BigDecimal mstTabId);

    int insert(SysFormconfigMstTab record);

    int insertSelective(SysFormconfigMstTab record);

    List<SysFormconfigMstTab> selectByExample(SysFormconfigMstTabExample example);

    SysFormconfigMstTab selectByPrimaryKey(BigDecimal mstTabId);

    int updateByExampleSelective(@Param("record") SysFormconfigMstTab record, @Param("example") SysFormconfigMstTabExample example);

    int updateByExample(@Param("record") SysFormconfigMstTab record, @Param("example") SysFormconfigMstTabExample example);

    int updateByPrimaryKeySelective(SysFormconfigMstTab record);

    int updateByPrimaryKey(SysFormconfigMstTab record);
}