package com.myehr.mapper.formmanage.question;

import com.myehr.pojo.formmanage.question.SysQuestionOption;
import com.myehr.pojo.formmanage.question.SysQuestionOptionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysQuestionOptionMapper {
    int countByExample(SysQuestionOptionExample example);

    int deleteByExample(SysQuestionOptionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SysQuestionOption record);

    int insertSelective(SysQuestionOption record);

    List<SysQuestionOption> selectByExample(SysQuestionOptionExample example);

    SysQuestionOption selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SysQuestionOption record, @Param("example") SysQuestionOptionExample example);

    int updateByExample(@Param("record") SysQuestionOption record, @Param("example") SysQuestionOptionExample example);

    int updateByPrimaryKeySelective(SysQuestionOption record);

    int updateByPrimaryKey(SysQuestionOption record);
}