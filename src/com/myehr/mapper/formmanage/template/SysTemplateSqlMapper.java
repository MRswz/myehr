package com.myehr.mapper.formmanage.template;

import com.myehr.pojo.formmanage.template.SysTemplateSql;
import com.myehr.pojo.formmanage.template.SysTemplateSqlExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysTemplateSqlMapper {
    int countByExample(SysTemplateSqlExample example);

    int deleteByExample(SysTemplateSqlExample example);

    int deleteByPrimaryKey(BigDecimal templateSqlId);

    int insert(SysTemplateSql record);

    int insertSelective(SysTemplateSql record);

    List<SysTemplateSql> selectByExample(SysTemplateSqlExample example);

    SysTemplateSql selectByPrimaryKey(BigDecimal templateSqlId);

    int updateByExampleSelective(@Param("record") SysTemplateSql record, @Param("example") SysTemplateSqlExample example);

    int updateByExample(@Param("record") SysTemplateSql record, @Param("example") SysTemplateSqlExample example);

    int updateByPrimaryKeySelective(SysTemplateSql record);

    int updateByPrimaryKey(SysTemplateSql record);
}