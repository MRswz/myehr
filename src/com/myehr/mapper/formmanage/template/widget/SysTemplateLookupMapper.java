package com.myehr.mapper.formmanage.template.widget;

import com.myehr.pojo.formmanage.template.widget.SysTemplateLookup;
import com.myehr.pojo.formmanage.template.widget.SysTemplateLookupExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysTemplateLookupMapper {
    int countByExample(SysTemplateLookupExample example);

    int deleteByExample(SysTemplateLookupExample example);

    int deleteByPrimaryKey(BigDecimal lookupId);

    int insert(SysTemplateLookup record);

    int insertSelective(SysTemplateLookup record);

    List<SysTemplateLookup> selectByExample(SysTemplateLookupExample example);

    SysTemplateLookup selectByPrimaryKey(BigDecimal lookupId);

    int updateByExampleSelective(@Param("record") SysTemplateLookup record, @Param("example") SysTemplateLookupExample example);

    int updateByExample(@Param("record") SysTemplateLookup record, @Param("example") SysTemplateLookupExample example);

    int updateByPrimaryKeySelective(SysTemplateLookup record);

    int updateByPrimaryKey(SysTemplateLookup record);
}