package com.myehr.mapper.act.checked;

import com.myehr.pojo.act.checked.SysCheckedAndNodeRelation;
import com.myehr.pojo.act.checked.SysCheckedAndNodeRelationExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysCheckedAndNodeRelationMapper {
    int countByExample(SysCheckedAndNodeRelationExample example);

    int deleteByExample(SysCheckedAndNodeRelationExample example);

    int deleteByPrimaryKey(BigDecimal id);

    int insert(SysCheckedAndNodeRelation record);

    int insertSelective(SysCheckedAndNodeRelation record);

    List<SysCheckedAndNodeRelation> selectByExample(SysCheckedAndNodeRelationExample example);

    SysCheckedAndNodeRelation selectByPrimaryKey(BigDecimal id);

    int updateByExampleSelective(@Param("record") SysCheckedAndNodeRelation record, @Param("example") SysCheckedAndNodeRelationExample example);

    int updateByExample(@Param("record") SysCheckedAndNodeRelation record, @Param("example") SysCheckedAndNodeRelationExample example);

    int updateByPrimaryKeySelective(SysCheckedAndNodeRelation record);

    int updateByPrimaryKey(SysCheckedAndNodeRelation record);
}