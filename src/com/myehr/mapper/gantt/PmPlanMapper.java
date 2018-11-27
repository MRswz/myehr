package com.myehr.mapper.gantt;

import com.myehr.pojo.gantt.PmPlan;
import com.myehr.pojo.gantt.PmPlanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmPlanMapper {
    int countByExample(PmPlanExample example);

    int deleteByExample(PmPlanExample example);

    int deleteByPrimaryKey(Integer projectscheduleId);

    int insert(PmPlan record);

    int insertSelective(PmPlan record);

    List<PmPlan> selectByExample(PmPlanExample example);

    PmPlan selectByPrimaryKey(Integer projectscheduleId);

    int updateByExampleSelective(@Param("record") PmPlan record, @Param("example") PmPlanExample example);

    int updateByExample(@Param("record") PmPlan record, @Param("example") PmPlanExample example);

    int updateByPrimaryKeySelective(PmPlan record);

    int updateByPrimaryKey(PmPlan record);
}