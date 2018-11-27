package com.myehr.mapper.activiti;

import com.myehr.pojo.activiti.ActReDeployment;
import com.myehr.pojo.activiti.ActReDeploymentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ActReDeploymentMapper {
    int countByExample(ActReDeploymentExample example);

    int deleteByExample(ActReDeploymentExample example);

    int deleteByPrimaryKey(Object id);

    int insert(ActReDeployment record);

    int insertSelective(ActReDeployment record);

    List<ActReDeployment> selectByExample(ActReDeploymentExample example);

    ActReDeployment selectByPrimaryKey(Object id);

    int updateByExampleSelective(@Param("record") ActReDeployment record, @Param("example") ActReDeploymentExample example);

    int updateByExample(@Param("record") ActReDeployment record, @Param("example") ActReDeploymentExample example);

    int updateByPrimaryKeySelective(ActReDeployment record);

    int updateByPrimaryKey(ActReDeployment record);
}