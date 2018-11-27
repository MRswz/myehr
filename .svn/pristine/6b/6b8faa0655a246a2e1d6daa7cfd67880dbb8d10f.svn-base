package com.myehr.mapper.formmanage.template;

import com.myehr.pojo.formmanage.template.SysTemplateModel;
import com.myehr.pojo.formmanage.template.SysTemplateModelExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysTemplateModelMapper {
    int countByExample(SysTemplateModelExample example);

    int deleteByExample(SysTemplateModelExample example);

    int deleteByPrimaryKey(BigDecimal id);

    int insert(SysTemplateModel record);

    int insertSelective(SysTemplateModel record);

    List<SysTemplateModel> selectByExample(SysTemplateModelExample example);

    SysTemplateModel selectByPrimaryKey(BigDecimal id);

    int updateByExampleSelective(@Param("record") SysTemplateModel record, @Param("example") SysTemplateModelExample example);

    int updateByExample(@Param("record") SysTemplateModel record, @Param("example") SysTemplateModelExample example);

    int updateByPrimaryKeySelective(SysTemplateModel record);

    int updateByPrimaryKey(SysTemplateModel record);
}