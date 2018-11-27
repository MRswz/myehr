package com.myehr.mapper.formmanage.question;

import com.myehr.pojo.formmanage.question.SysExamtemplate;
import com.myehr.pojo.formmanage.question.SysExamtemplateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysExamtemplateMapper {
    int countByExample(SysExamtemplateExample example);

    int deleteByExample(SysExamtemplateExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SysExamtemplate record);

    int insertSelective(SysExamtemplate record);

    List<SysExamtemplate> selectByExample(SysExamtemplateExample example);

    SysExamtemplate selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SysExamtemplate record, @Param("example") SysExamtemplateExample example);

    int updateByExample(@Param("record") SysExamtemplate record, @Param("example") SysExamtemplateExample example);

    int updateByPrimaryKeySelective(SysExamtemplate record);

    int updateByPrimaryKey(SysExamtemplate record);
}