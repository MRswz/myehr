package com.myehr.mapper.activiti;

import com.myehr.pojo.activiti.ActReProcdef;
import com.myehr.pojo.activiti.ActReProcdefExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ActReProcdefMapper {
    int countByExample(ActReProcdefExample example);

    int deleteByExample(ActReProcdefExample example);

    int deleteByPrimaryKey(Object id);

    int insert(ActReProcdef record);

    int insertSelective(ActReProcdef record);

    List<ActReProcdef> selectByExample(ActReProcdefExample example);

    ActReProcdef selectByPrimaryKey(Object id);

    int updateByExampleSelective(@Param("record") ActReProcdef record, @Param("example") ActReProcdefExample example);

    int updateByExample(@Param("record") ActReProcdef record, @Param("example") ActReProcdefExample example);

    int updateByPrimaryKeySelective(ActReProcdef record);

    int updateByPrimaryKey(ActReProcdef record);
}