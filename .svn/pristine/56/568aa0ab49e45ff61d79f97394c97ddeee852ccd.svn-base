package com.myehr.mapper.formmanage.template;

import com.myehr.pojo.formmanage.template.SysTemplate;
import com.myehr.pojo.formmanage.template.SysTemplateExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysTemplateMapper {
    int countByExample(SysTemplateExample example);

    int deleteByExample(SysTemplateExample example);

    int deleteByPrimaryKey(BigDecimal templateId);

    int insert(SysTemplate record);

    int insertSelective(SysTemplate record);

    List<SysTemplate> selectByExample(SysTemplateExample example);

    SysTemplate selectByPrimaryKey(BigDecimal templateId);

    int updateByExampleSelective(@Param("record") SysTemplate record, @Param("example") SysTemplateExample example);

    int updateByExample(@Param("record") SysTemplate record, @Param("example") SysTemplateExample example);

    int updateByPrimaryKeySelective(SysTemplate record);

    int updateByPrimaryKey(SysTemplate record);
}