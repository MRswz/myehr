package com.myehr.mapper.formmanage.form;

import com.myehr.pojo.formmanage.form.SysTreeSolution;
import com.myehr.pojo.formmanage.form.SysTreeSolutionExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysTreeSolutionMapper {
    int countByExample(SysTreeSolutionExample example);

    int deleteByExample(SysTreeSolutionExample example);

    int deleteByPrimaryKey(BigDecimal treeSolutionId);

    int insert(SysTreeSolution record);

    int insertSelective(SysTreeSolution record);

    List<SysTreeSolution> selectByExample(SysTreeSolutionExample example);

    SysTreeSolution selectByPrimaryKey(BigDecimal treeSolutionId);

    int updateByExampleSelective(@Param("record") SysTreeSolution record, @Param("example") SysTreeSolutionExample example);

    int updateByExample(@Param("record") SysTreeSolution record, @Param("example") SysTreeSolutionExample example);

    int updateByPrimaryKeySelective(SysTreeSolution record);

    int updateByPrimaryKey(SysTreeSolution record);
}