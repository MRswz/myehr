package com.myehr.mapper.formmanage.question;

import com.myehr.pojo.formmanage.question.SysQuestion;
import com.myehr.pojo.formmanage.question.SysQuestionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysQuestionMapper {
    int countByExample(SysQuestionExample example);

    int deleteByExample(SysQuestionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SysQuestion record);

    int insertSelective(SysQuestion record);

    List<SysQuestion> selectByExample(SysQuestionExample example);

    SysQuestion selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SysQuestion record, @Param("example") SysQuestionExample example);

    int updateByExample(@Param("record") SysQuestion record, @Param("example") SysQuestionExample example);

    int updateByPrimaryKeySelective(SysQuestion record);

    int updateByPrimaryKey(SysQuestion record);
}