package com.myehr.mapper.formmanage.form;

import com.myehr.pojo.formmanage.form.SysRule;
import com.myehr.pojo.formmanage.form.SysRuleExample;
import com.myehr.pojo.formmanage.form.SysRuleWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysRuleMapper {
    int countByExample(SysRuleExample example);

    int deleteByExample(SysRuleExample example);

    int deleteByPrimaryKey(Long ruleId);

    int insert(SysRuleWithBLOBs record);

    int insertSelective(SysRuleWithBLOBs record);

    List<SysRuleWithBLOBs> selectByExampleWithBLOBs(SysRuleExample example);

    List<SysRule> selectByExample(SysRuleExample example);

    SysRuleWithBLOBs selectByPrimaryKey(Long ruleId);

    int updateByExampleSelective(@Param("record") SysRuleWithBLOBs record, @Param("example") SysRuleExample example);

    int updateByExampleWithBLOBs(@Param("record") SysRuleWithBLOBs record, @Param("example") SysRuleExample example);

    int updateByExample(@Param("record") SysRule record, @Param("example") SysRuleExample example);

    int updateByPrimaryKeySelective(SysRuleWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(SysRuleWithBLOBs record);

    int updateByPrimaryKey(SysRule record);
}