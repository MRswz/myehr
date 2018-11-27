package com.myehr.mapper.formmanage.widget;

import com.myehr.pojo.formmanage.widget.SysFormTextarea;
import com.myehr.pojo.formmanage.widget.SysFormTextareaExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysFormTextareaMapper {
    int countByExample(SysFormTextareaExample example);

    int deleteByExample(SysFormTextareaExample example);

    int deleteByPrimaryKey(BigDecimal textareaId);

    int insert(SysFormTextarea record);

    int insertSelective(SysFormTextarea record);

    List<SysFormTextarea> selectByExample(SysFormTextareaExample example);

    SysFormTextarea selectByPrimaryKey(BigDecimal textareaId);

    int updateByExampleSelective(@Param("record") SysFormTextarea record, @Param("example") SysFormTextareaExample example);

    int updateByExample(@Param("record") SysFormTextarea record, @Param("example") SysFormTextareaExample example);

    int updateByPrimaryKeySelective(SysFormTextarea record);

    int updateByPrimaryKey(SysFormTextarea record);
}