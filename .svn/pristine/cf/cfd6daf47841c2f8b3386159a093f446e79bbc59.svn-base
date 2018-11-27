package com.myehr.mapper.activiti;

import com.myehr.pojo.activiti.ActReModel;
import com.myehr.pojo.activiti.ActReModelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ActReModelMapper {
    int countByExample(ActReModelExample example);

    int deleteByExample(ActReModelExample example);

    int deleteByPrimaryKey(Object id);

    int insert(ActReModel record);

    int insertSelective(ActReModel record);

    List<ActReModel> selectByExample(ActReModelExample example);

    ActReModel selectByPrimaryKey(Object id);

    int updateByExampleSelective(@Param("record") ActReModel record, @Param("example") ActReModelExample example);

    int updateByExample(@Param("record") ActReModel record, @Param("example") ActReModelExample example);

    int updateByPrimaryKeySelective(ActReModel record);

    int updateByPrimaryKey(ActReModel record);
}