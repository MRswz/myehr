package com.myehr.mapper.activiti;

import com.myehr.pojo.activiti.ActRuTask;
import com.myehr.pojo.activiti.ActRuTaskExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ActRuTaskMapper {
    int countByExample(ActRuTaskExample example);

    int deleteByExample(ActRuTaskExample example);

    int deleteByPrimaryKey(Object id);

    int insert(ActRuTask record);

    int insertSelective(ActRuTask record);

    List<ActRuTask> selectByExample(ActRuTaskExample example);

    ActRuTask selectByPrimaryKey(Object id);

    int updateByExampleSelective(@Param("record") ActRuTask record, @Param("example") ActRuTaskExample example);

    int updateByExample(@Param("record") ActRuTask record, @Param("example") ActRuTaskExample example);

    int updateByPrimaryKeySelective(ActRuTask record);

    int updateByPrimaryKey(ActRuTask record);
}