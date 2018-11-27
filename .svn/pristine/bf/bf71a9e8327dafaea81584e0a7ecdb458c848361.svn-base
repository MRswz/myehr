package com.myehr.mapper.formmanage.form;

import com.myehr.pojo.formmanage.form.SysEvaluation;
import com.myehr.pojo.formmanage.form.SysEvaluationExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysEvaluationMapper {
    int countByExample(SysEvaluationExample example);

    int deleteByExample(SysEvaluationExample example);

    int deleteByPrimaryKey(BigDecimal evaluationId);

    int insert(SysEvaluation record);

    int insertSelective(SysEvaluation record);

    List<SysEvaluation> selectByExample(SysEvaluationExample example);

    SysEvaluation selectByPrimaryKey(BigDecimal evaluationId);

    int updateByExampleSelective(@Param("record") SysEvaluation record, @Param("example") SysEvaluationExample example);

    int updateByExample(@Param("record") SysEvaluation record, @Param("example") SysEvaluationExample example);

    int updateByPrimaryKeySelective(SysEvaluation record);

    int updateByPrimaryKey(SysEvaluation record);
}