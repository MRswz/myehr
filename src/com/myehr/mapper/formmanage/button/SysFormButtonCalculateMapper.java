package com.myehr.mapper.formmanage.button;

import com.myehr.pojo.formmanage.button.SysFormButtonCalculate;
import com.myehr.pojo.formmanage.button.SysFormButtonCalculateExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysFormButtonCalculateMapper {
    int countByExample(SysFormButtonCalculateExample example);

    int deleteByExample(SysFormButtonCalculateExample example);

    int deleteByPrimaryKey(BigDecimal calculateId);

    int insert(SysFormButtonCalculate record);

    int insertSelective(SysFormButtonCalculate record);

    List<SysFormButtonCalculate> selectByExample(SysFormButtonCalculateExample example);

    SysFormButtonCalculate selectByPrimaryKey(BigDecimal calculateId);

    int updateByExampleSelective(@Param("record") SysFormButtonCalculate record, @Param("example") SysFormButtonCalculateExample example);

    int updateByExample(@Param("record") SysFormButtonCalculate record, @Param("example") SysFormButtonCalculateExample example);

    int updateByPrimaryKeySelective(SysFormButtonCalculate record);

    int updateByPrimaryKey(SysFormButtonCalculate record);
}