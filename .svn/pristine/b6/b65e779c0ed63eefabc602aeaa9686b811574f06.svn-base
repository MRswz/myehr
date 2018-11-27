package com.myehr.mapper.activiti;

import com.myehr.pojo.activiti.ActRuExecution;
import com.myehr.pojo.activiti.ActRuExecutionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ActRuExecutionMapper {
    int countByExample(ActRuExecutionExample example);

    int deleteByExample(ActRuExecutionExample example);

    int deleteByPrimaryKey(Object id);

    int insert(ActRuExecution record);

    int insertSelective(ActRuExecution record);

    List<ActRuExecution> selectByExample(ActRuExecutionExample example);

    ActRuExecution selectByPrimaryKey(Object id);

    int updateByExampleSelective(@Param("record") ActRuExecution record, @Param("example") ActRuExecutionExample example);

    int updateByExample(@Param("record") ActRuExecution record, @Param("example") ActRuExecutionExample example);

    int updateByPrimaryKeySelective(ActRuExecution record);

    int updateByPrimaryKey(ActRuExecution record);
}