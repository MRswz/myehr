package com.myehr.mapper.formmanage.question;

import com.myehr.pojo.formmanage.question.TraAnswer;
import com.myehr.pojo.formmanage.question.TraAnswerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TraAnswerMapper {
    int countByExample(TraAnswerExample example);

    int deleteByExample(TraAnswerExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TraAnswer record);

    int insertSelective(TraAnswer record);

    List<TraAnswer> selectByExample(TraAnswerExample example);

    TraAnswer selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TraAnswer record, @Param("example") TraAnswerExample example);

    int updateByExample(@Param("record") TraAnswer record, @Param("example") TraAnswerExample example);

    int updateByPrimaryKeySelective(TraAnswer record);

    int updateByPrimaryKey(TraAnswer record);
}