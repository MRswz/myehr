package com.myehr.mapper.sysParam;

import com.myehr.pojo.sysParam.SystemParm;
import com.myehr.pojo.sysParam.SystemParmExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SystemParmMapper {
    int countByExample(SystemParmExample example);

    int deleteByExample(SystemParmExample example);

    int deleteByPrimaryKey(Long systemParmId);

    int insert(SystemParm record);

    int insertSelective(SystemParm record);

    List<SystemParm> selectByExample(SystemParmExample example);

    SystemParm selectByPrimaryKey(Long systemParmId);

    int updateByExampleSelective(@Param("record") SystemParm record, @Param("example") SystemParmExample example);

    int updateByExample(@Param("record") SystemParm record, @Param("example") SystemParmExample example);

    int updateByPrimaryKeySelective(SystemParm record);

    int updateByPrimaryKey(SystemParm record);
}