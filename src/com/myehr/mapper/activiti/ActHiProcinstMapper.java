package com.myehr.mapper.activiti;

import com.myehr.pojo.activiti.ActHiProcinst;
import com.myehr.pojo.activiti.ActHiProcinstExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ActHiProcinstMapper {
    int countByExample(ActHiProcinstExample example);

    int deleteByExample(ActHiProcinstExample example);

    int deleteByPrimaryKey(Object id);

    int insert(ActHiProcinst record);

    int insertSelective(ActHiProcinst record);

    List<ActHiProcinst> selectByExample(ActHiProcinstExample example);

    ActHiProcinst selectByPrimaryKey(Object id);

    int updateByExampleSelective(@Param("record") ActHiProcinst record, @Param("example") ActHiProcinstExample example);

    int updateByExample(@Param("record") ActHiProcinst record, @Param("example") ActHiProcinstExample example);

    int updateByPrimaryKeySelective(ActHiProcinst record);

    int updateByPrimaryKey(ActHiProcinst record);
}