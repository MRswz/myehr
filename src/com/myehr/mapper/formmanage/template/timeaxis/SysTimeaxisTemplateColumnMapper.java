package com.myehr.mapper.formmanage.template.timeaxis;

import com.myehr.pojo.formmanage.template.timeaxis.SysTimeaxisTemplateColumn;
import com.myehr.pojo.formmanage.template.timeaxis.SysTimeaxisTemplateColumnExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysTimeaxisTemplateColumnMapper {
    int countByExample(SysTimeaxisTemplateColumnExample example);

    int deleteByExample(SysTimeaxisTemplateColumnExample example);

    int deleteByPrimaryKey(Integer templateColumnId);

    int insert(SysTimeaxisTemplateColumn record);

    int insertSelective(SysTimeaxisTemplateColumn record);

    List<SysTimeaxisTemplateColumn> selectByExample(SysTimeaxisTemplateColumnExample example);

    SysTimeaxisTemplateColumn selectByPrimaryKey(Integer templateColumnId);

    int updateByExampleSelective(@Param("record") SysTimeaxisTemplateColumn record, @Param("example") SysTimeaxisTemplateColumnExample example);

    int updateByExample(@Param("record") SysTimeaxisTemplateColumn record, @Param("example") SysTimeaxisTemplateColumnExample example);

    int updateByPrimaryKeySelective(SysTimeaxisTemplateColumn record);

    int updateByPrimaryKey(SysTimeaxisTemplateColumn record);
}