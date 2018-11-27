package com.myehr.mapper.formmanage.form;

import com.myehr.pojo.formmanage.form.SysSolution;
import com.myehr.pojo.formmanage.form.SysSolutionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysSolutionMapper {
    int countByExample(SysSolutionExample example);

    int deleteByExample(SysSolutionExample example);

    int deleteByPrimaryKey(Long solutionId);

    int insert(SysSolution record);

    int insertSelective(SysSolution record);

    List<SysSolution> selectByExample(SysSolutionExample example);

    SysSolution selectByPrimaryKey(Long solutionId);

    int updateByExampleSelective(@Param("record") SysSolution record, @Param("example") SysSolutionExample example);

    int updateByExample(@Param("record") SysSolution record, @Param("example") SysSolutionExample example);

    int updateByPrimaryKeySelective(SysSolution record);

    int updateByPrimaryKey(SysSolution record);
}