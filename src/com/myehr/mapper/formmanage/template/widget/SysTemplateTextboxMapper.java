package com.myehr.mapper.formmanage.template.widget;

import com.myehr.pojo.formmanage.template.widget.SysTemplateTextbox;
import com.myehr.pojo.formmanage.template.widget.SysTemplateTextboxExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysTemplateTextboxMapper {
    int countByExample(SysTemplateTextboxExample example);

    int deleteByExample(SysTemplateTextboxExample example);

    int deleteByPrimaryKey(BigDecimal textboxId);

    int insert(SysTemplateTextbox record);

    int insertSelective(SysTemplateTextbox record);

    List<SysTemplateTextbox> selectByExample(SysTemplateTextboxExample example);

    SysTemplateTextbox selectByPrimaryKey(BigDecimal textboxId);

    int updateByExampleSelective(@Param("record") SysTemplateTextbox record, @Param("example") SysTemplateTextboxExample example);

    int updateByExample(@Param("record") SysTemplateTextbox record, @Param("example") SysTemplateTextboxExample example);

    int updateByPrimaryKeySelective(SysTemplateTextbox record);

    int updateByPrimaryKey(SysTemplateTextbox record);
}