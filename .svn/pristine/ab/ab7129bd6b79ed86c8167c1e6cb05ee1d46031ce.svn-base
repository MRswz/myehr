package com.myehr.mapper.formmanage.template;

import com.myehr.pojo.formmanage.template.SysTemplateModelColumn;
import com.myehr.pojo.formmanage.template.SysTemplateModelColumnExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysTemplateModelColumnMapper {
    int countByExample(SysTemplateModelColumnExample example);

    int deleteByExample(SysTemplateModelColumnExample example);

    int deleteByPrimaryKey(BigDecimal id);

    int insert(SysTemplateModelColumn record);

    int insertSelective(SysTemplateModelColumn record);

    List<SysTemplateModelColumn> selectByExample(SysTemplateModelColumnExample example);

    SysTemplateModelColumn selectByPrimaryKey(BigDecimal id);

    int updateByExampleSelective(@Param("record") SysTemplateModelColumn record, @Param("example") SysTemplateModelColumnExample example);

    int updateByExample(@Param("record") SysTemplateModelColumn record, @Param("example") SysTemplateModelColumnExample example);

    int updateByPrimaryKeySelective(SysTemplateModelColumn record);

    int updateByPrimaryKey(SysTemplateModelColumn record);
}