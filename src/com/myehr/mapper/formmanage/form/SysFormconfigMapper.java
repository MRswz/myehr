package com.myehr.mapper.formmanage.form;

import com.myehr.pojo.formmanage.form.SysFormconfig;
import com.myehr.pojo.formmanage.form.SysFormconfigExample;
import com.myehr.pojo.formmanage.form.SysFormconfigWithBLOBs;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysFormconfigMapper {
    int countByExample(SysFormconfigExample example);

    int deleteByExample(SysFormconfigExample example);

    int deleteByPrimaryKey(BigDecimal formDefId);

    int insert(SysFormconfigWithBLOBs record);

    int insertSelective(SysFormconfigWithBLOBs record);

    List<SysFormconfigWithBLOBs> selectByExampleWithBLOBs(SysFormconfigExample example);

    List<SysFormconfig> selectByExample(SysFormconfigExample example);

    SysFormconfigWithBLOBs selectByPrimaryKey(BigDecimal formDefId);

    int updateByExampleSelective(@Param("record") SysFormconfigWithBLOBs record, @Param("example") SysFormconfigExample example);

    int updateByExampleWithBLOBs(@Param("record") SysFormconfigWithBLOBs record, @Param("example") SysFormconfigExample example);

    int updateByExample(@Param("record") SysFormconfig record, @Param("example") SysFormconfigExample example);

    int updateByPrimaryKeySelective(SysFormconfigWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(SysFormconfigWithBLOBs record);

    int updateByPrimaryKey(SysFormconfig record);
}