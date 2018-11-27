package com.myehr.mapper.formmanage.widget;

import com.myehr.pojo.formmanage.widget.SysFormLookup;
import com.myehr.pojo.formmanage.widget.SysFormLookupExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysFormLookupMapper {
    int countByExample(SysFormLookupExample example);

    int deleteByExample(SysFormLookupExample example);

    int deleteByPrimaryKey(BigDecimal lookupId);

    int insert(SysFormLookup record);

    int insertSelective(SysFormLookup record);

    List<SysFormLookup> selectByExample(SysFormLookupExample example);

    SysFormLookup selectByPrimaryKey(BigDecimal lookupId);

    int updateByExampleSelective(@Param("record") SysFormLookup record, @Param("example") SysFormLookupExample example);

    int updateByExample(@Param("record") SysFormLookup record, @Param("example") SysFormLookupExample example);

    int updateByPrimaryKeySelective(SysFormLookup record);

    int updateByPrimaryKey(SysFormLookup record);
}