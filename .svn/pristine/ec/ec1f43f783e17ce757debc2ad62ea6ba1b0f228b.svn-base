package com.myehr.mapper.formmanage.question;

import com.myehr.pojo.formmanage.question.SysExamAnswer;
import com.myehr.pojo.formmanage.question.SysExamAnswerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysExamAnswerMapper {
    int countByExample(SysExamAnswerExample example);

    int deleteByExample(SysExamAnswerExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SysExamAnswer record);

    int insertSelective(SysExamAnswer record);

    List<SysExamAnswer> selectByExample(SysExamAnswerExample example);

    SysExamAnswer selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SysExamAnswer record, @Param("example") SysExamAnswerExample example);

    int updateByExample(@Param("record") SysExamAnswer record, @Param("example") SysExamAnswerExample example);

    int updateByPrimaryKeySelective(SysExamAnswer record);

    int updateByPrimaryKey(SysExamAnswer record);
}