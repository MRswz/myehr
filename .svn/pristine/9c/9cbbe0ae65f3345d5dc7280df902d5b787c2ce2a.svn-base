package com.myehr.mapper.activiti;

import com.myehr.pojo.activiti.ActRuJob;
import com.myehr.pojo.activiti.ActRuJobExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ActRuJobMapper {
    int countByExample(ActRuJobExample example);

    int deleteByExample(ActRuJobExample example);

    int deleteByPrimaryKey(Object id);

    int insert(ActRuJob record);

    int insertSelective(ActRuJob record);

    List<ActRuJob> selectByExample(ActRuJobExample example);

    ActRuJob selectByPrimaryKey(Object id);

    int updateByExampleSelective(@Param("record") ActRuJob record, @Param("example") ActRuJobExample example);

    int updateByExample(@Param("record") ActRuJob record, @Param("example") ActRuJobExample example);

    int updateByPrimaryKeySelective(ActRuJob record);

    int updateByPrimaryKey(ActRuJob record);
}