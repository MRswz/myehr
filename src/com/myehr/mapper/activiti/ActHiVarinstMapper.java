package com.myehr.mapper.activiti;

import com.myehr.pojo.activiti.ActHiVarinst;
import com.myehr.pojo.activiti.ActHiVarinstExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ActHiVarinstMapper {
    int countByExample(ActHiVarinstExample example);

    int deleteByExample(ActHiVarinstExample example);

    int deleteByPrimaryKey(Object id);

    int insert(ActHiVarinst record);

    int insertSelective(ActHiVarinst record);

    List<ActHiVarinst> selectByExample(ActHiVarinstExample example);

    ActHiVarinst selectByPrimaryKey(Object id);

    int updateByExampleSelective(@Param("record") ActHiVarinst record, @Param("example") ActHiVarinstExample example);

    int updateByExample(@Param("record") ActHiVarinst record, @Param("example") ActHiVarinstExample example);

    int updateByPrimaryKeySelective(ActHiVarinst record);

    int updateByPrimaryKey(ActHiVarinst record);
}