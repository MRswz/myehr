package com.myehr.mapper.formmanage.question;

import com.myehr.pojo.formmanage.question.SysExamtemplateQuestion;
import com.myehr.pojo.formmanage.question.SysExamtemplateQuestionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysExamtemplateQuestionMapper {
    int countByExample(SysExamtemplateQuestionExample example);

    int deleteByExample(SysExamtemplateQuestionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SysExamtemplateQuestion record);

    int insertSelective(SysExamtemplateQuestion record);

    List<SysExamtemplateQuestion> selectByExample(SysExamtemplateQuestionExample example);

    SysExamtemplateQuestion selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SysExamtemplateQuestion record, @Param("example") SysExamtemplateQuestionExample example);

    int updateByExample(@Param("record") SysExamtemplateQuestion record, @Param("example") SysExamtemplateQuestionExample example);

    int updateByPrimaryKeySelective(SysExamtemplateQuestion record);

    int updateByPrimaryKey(SysExamtemplateQuestion record);
}