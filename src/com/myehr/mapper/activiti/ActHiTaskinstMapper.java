package com.myehr.mapper.activiti;

import com.myehr.pojo.activiti.ActHiTaskinst;
import com.myehr.pojo.activiti.ActHiTaskinstExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ActHiTaskinstMapper {
    int countByExample(ActHiTaskinstExample example);

    int deleteByExample(ActHiTaskinstExample example);

    int deleteByPrimaryKey(Object id);

    int insert(ActHiTaskinst record);

    int insertSelective(ActHiTaskinst record);

    List<ActHiTaskinst> selectByExample(ActHiTaskinstExample example);

    ActHiTaskinst selectByPrimaryKey(Object id);

    int updateByExampleSelective(@Param("record") ActHiTaskinst record, @Param("example") ActHiTaskinstExample example);

    int updateByExample(@Param("record") ActHiTaskinst record, @Param("example") ActHiTaskinstExample example);

    int updateByPrimaryKeySelective(ActHiTaskinst record);

    int updateByPrimaryKey(ActHiTaskinst record);
}