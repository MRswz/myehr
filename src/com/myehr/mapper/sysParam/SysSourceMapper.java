package com.myehr.mapper.sysParam;

import com.myehr.pojo.sysParam.SysSource;
import com.myehr.pojo.sysParam.SysSourceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysSourceMapper {
    int countByExample(SysSourceExample example);

    int deleteByExample(SysSourceExample example);

    int deleteByPrimaryKey(Long sysSourceId);

    int insert(SysSource record);

    int insertSelective(SysSource record);

    List<SysSource> selectByExample(SysSourceExample example);

    SysSource selectByPrimaryKey(Long sysSourceId);

    int updateByExampleSelective(@Param("record") SysSource record, @Param("example") SysSourceExample example);

    int updateByExample(@Param("record") SysSource record, @Param("example") SysSourceExample example);

    int updateByPrimaryKeySelective(SysSource record);

    int updateByPrimaryKey(SysSource record);
}