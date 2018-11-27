package com.myehr.mapper.formmanage.form;

import com.myehr.pojo.formmanage.form.SysTreeSolutionColumn;
import com.myehr.pojo.formmanage.form.SysTreeSolutionColumnExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysTreeSolutionColumnMapper {
    int countByExample(SysTreeSolutionColumnExample example);

    int deleteByExample(SysTreeSolutionColumnExample example);

    int deleteByPrimaryKey(BigDecimal treeSluId);

    int insert(SysTreeSolutionColumn record);

    int insertSelective(SysTreeSolutionColumn record);

    List<SysTreeSolutionColumn> selectByExample(SysTreeSolutionColumnExample example);

    SysTreeSolutionColumn selectByPrimaryKey(BigDecimal treeSluId);

    int updateByExampleSelective(@Param("record") SysTreeSolutionColumn record, @Param("example") SysTreeSolutionColumnExample example);

    int updateByExample(@Param("record") SysTreeSolutionColumn record, @Param("example") SysTreeSolutionColumnExample example);

    int updateByPrimaryKeySelective(SysTreeSolutionColumn record);

    int updateByPrimaryKey(SysTreeSolutionColumn record);
}