package com.myehr.mapper.formmanage.template;

import com.myehr.pojo.formmanage.template.SysTemplateColumn;
import com.myehr.pojo.formmanage.template.SysTemplateColumnExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysTemplateColumnMapper {
    int countByExample(SysTemplateColumnExample example);

    int deleteByExample(SysTemplateColumnExample example);

    int deleteByPrimaryKey(Integer templateColumnId);

    int insert(SysTemplateColumn record);

    int insertSelective(SysTemplateColumn record);

    List<SysTemplateColumn> selectByExample(SysTemplateColumnExample example);

    SysTemplateColumn selectByPrimaryKey(Integer templateColumnId);

    int updateByExampleSelective(@Param("record") SysTemplateColumn record, @Param("example") SysTemplateColumnExample example);

    int updateByExample(@Param("record") SysTemplateColumn record, @Param("example") SysTemplateColumnExample example);

    int updateByPrimaryKeySelective(SysTemplateColumn record);

    int updateByPrimaryKey(SysTemplateColumn record);
}