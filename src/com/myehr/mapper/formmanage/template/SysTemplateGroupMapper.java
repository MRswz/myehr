package com.myehr.mapper.formmanage.template;

import com.myehr.pojo.formmanage.template.SysTemplateGroup;
import com.myehr.pojo.formmanage.template.SysTemplateGroupExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysTemplateGroupMapper {
    int countByExample(SysTemplateGroupExample example);

    int deleteByExample(SysTemplateGroupExample example);

    int deleteByPrimaryKey(BigDecimal formGroupId);

    int insert(SysTemplateGroup record);

    int insertSelective(SysTemplateGroup record);

    List<SysTemplateGroup> selectByExample(SysTemplateGroupExample example);

    SysTemplateGroup selectByPrimaryKey(BigDecimal formGroupId);

    int updateByExampleSelective(@Param("record") SysTemplateGroup record, @Param("example") SysTemplateGroupExample example);

    int updateByExample(@Param("record") SysTemplateGroup record, @Param("example") SysTemplateGroupExample example);

    int updateByPrimaryKeySelective(SysTemplateGroup record);

    int updateByPrimaryKey(SysTemplateGroup record);
}