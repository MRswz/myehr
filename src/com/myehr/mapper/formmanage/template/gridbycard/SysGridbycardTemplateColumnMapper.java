package com.myehr.mapper.formmanage.template.gridbycard;

import com.myehr.pojo.formmanage.template.gridbycard.SysGridbycardTemplateColumn;
import com.myehr.pojo.formmanage.template.gridbycard.SysGridbycardTemplateColumnExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysGridbycardTemplateColumnMapper {
    int countByExample(SysGridbycardTemplateColumnExample example);

    int deleteByExample(SysGridbycardTemplateColumnExample example);

    int deleteByPrimaryKey(Integer templateColumnId);

    int insert(SysGridbycardTemplateColumn record);

    int insertSelective(SysGridbycardTemplateColumn record);

    List<SysGridbycardTemplateColumn> selectByExample(SysGridbycardTemplateColumnExample example);

    SysGridbycardTemplateColumn selectByPrimaryKey(Integer templateColumnId);

    int updateByExampleSelective(@Param("record") SysGridbycardTemplateColumn record, @Param("example") SysGridbycardTemplateColumnExample example);

    int updateByExample(@Param("record") SysGridbycardTemplateColumn record, @Param("example") SysGridbycardTemplateColumnExample example);

    int updateByPrimaryKeySelective(SysGridbycardTemplateColumn record);

    int updateByPrimaryKey(SysGridbycardTemplateColumn record);
}