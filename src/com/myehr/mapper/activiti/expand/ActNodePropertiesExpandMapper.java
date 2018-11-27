package com.myehr.mapper.activiti.expand;

import com.myehr.pojo.activiti.expand.ActNodePropertiesExpand;
import com.myehr.pojo.activiti.expand.ActNodePropertiesExpandExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ActNodePropertiesExpandMapper {
    int countByExample(ActNodePropertiesExpandExample example);

    int deleteByExample(ActNodePropertiesExpandExample example);

    int insert(ActNodePropertiesExpand record);

    int insertSelective(ActNodePropertiesExpand record);

    List<ActNodePropertiesExpand> selectByExample(ActNodePropertiesExpandExample example);

    int updateByExampleSelective(@Param("record") ActNodePropertiesExpand record, @Param("example") ActNodePropertiesExpandExample example);

    int updateByExample(@Param("record") ActNodePropertiesExpand record, @Param("example") ActNodePropertiesExpandExample example);
}