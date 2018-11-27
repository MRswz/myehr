package com.myehr.mapper.formmanage.form;

import com.myehr.pojo.formmanage.form.SysFormconfigTree;
import com.myehr.pojo.formmanage.form.SysFormconfigTreeExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysFormconfigTreeMapper {
    int countByExample(SysFormconfigTreeExample example);

    int deleteByExample(SysFormconfigTreeExample example);

    int deleteByPrimaryKey(BigDecimal formTreeId);

    int insert(SysFormconfigTree record);

    int insertSelective(SysFormconfigTree record);

    List<SysFormconfigTree> selectByExample(SysFormconfigTreeExample example);

    SysFormconfigTree selectByPrimaryKey(BigDecimal formTreeId);

    int updateByExampleSelective(@Param("record") SysFormconfigTree record, @Param("example") SysFormconfigTreeExample example);

    int updateByExample(@Param("record") SysFormconfigTree record, @Param("example") SysFormconfigTreeExample example);

    int updateByPrimaryKeySelective(SysFormconfigTree record);

    int updateByPrimaryKey(SysFormconfigTree record);
}