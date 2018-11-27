package com.myehr.mapper.formmanage.button;

import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.myehr.pojo.formmanage.button.SysFormButtonParam;
import com.myehr.pojo.formmanage.button.SysFormButtonParamExample;

public interface SysFormButtonParamMapper {
    int countByExample(SysFormButtonParamExample example);

    int deleteByExample(SysFormButtonParamExample example);

    int deleteByPrimaryKey(BigDecimal buttonParamId);

    int insert(SysFormButtonParam record);

    int insertSelective(SysFormButtonParam record);

    List<SysFormButtonParam> selectByExample(SysFormButtonParamExample example);

    SysFormButtonParam selectByPrimaryKey(BigDecimal buttonParamId);

    int updateByExampleSelective(@Param("record") SysFormButtonParam record, @Param("example") SysFormButtonParamExample example);

    int updateByExample(@Param("record") SysFormButtonParam record, @Param("example") SysFormButtonParamExample example);

    int updateByPrimaryKeySelective(SysFormButtonParam record);

    int updateByPrimaryKey(SysFormButtonParam record);
}