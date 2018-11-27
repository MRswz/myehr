package com.myehr.mapper.activiti;

import com.myehr.pojo.activiti.ActHiDetail;
import com.myehr.pojo.activiti.ActHiDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ActHiDetailMapper {
    int countByExample(ActHiDetailExample example);

    int deleteByExample(ActHiDetailExample example);

    int deleteByPrimaryKey(Object id);

    int insert(ActHiDetail record);

    int insertSelective(ActHiDetail record);

    List<ActHiDetail> selectByExample(ActHiDetailExample example);

    ActHiDetail selectByPrimaryKey(Object id);

    int updateByExampleSelective(@Param("record") ActHiDetail record, @Param("example") ActHiDetailExample example);

    int updateByExample(@Param("record") ActHiDetail record, @Param("example") ActHiDetailExample example);

    int updateByPrimaryKeySelective(ActHiDetail record);

    int updateByPrimaryKey(ActHiDetail record);
}