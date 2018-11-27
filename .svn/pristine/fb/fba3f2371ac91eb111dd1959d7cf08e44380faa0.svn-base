package com.myehr.mapper.field;

import com.myehr.pojo.field.SysFieldRule;
import com.myehr.pojo.field.SysFieldRuleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysFieldRuleMapper {
    int countByExample(SysFieldRuleExample example);

    int deleteByExample(SysFieldRuleExample example);

    int deleteByPrimaryKey(Long fieldRuleId);

    int insert(SysFieldRule record);

    int insertSelective(SysFieldRule record);

    List<SysFieldRule> selectByExample(SysFieldRuleExample example);

    SysFieldRule selectByPrimaryKey(Long fieldRuleId);

    int updateByExampleSelective(@Param("record") SysFieldRule record, @Param("example") SysFieldRuleExample example);

    int updateByExample(@Param("record") SysFieldRule record, @Param("example") SysFieldRuleExample example);

    int updateByPrimaryKeySelective(SysFieldRule record);

    int updateByPrimaryKey(SysFieldRule record);
}