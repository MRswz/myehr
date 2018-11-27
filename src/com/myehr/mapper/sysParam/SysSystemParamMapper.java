package com.myehr.mapper.sysParam;

import com.myehr.pojo.sysParam.SysSystemParam;
import com.myehr.pojo.sysParam.SysSystemParamExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysSystemParamMapper {
    int countByExample(SysSystemParamExample example);

    int deleteByExample(SysSystemParamExample example);

    int deleteByPrimaryKey(Long sysParamId);

    int insert(SysSystemParam record);

    int insertSelective(SysSystemParam record);

    List<SysSystemParam> selectByExample(SysSystemParamExample example);

    SysSystemParam selectByPrimaryKey(Long sysParamId);

    int updateByExampleSelective(@Param("record") SysSystemParam record, @Param("example") SysSystemParamExample example);

    int updateByExample(@Param("record") SysSystemParam record, @Param("example") SysSystemParamExample example);

    int updateByPrimaryKeySelective(SysSystemParam record);

    int updateByPrimaryKey(SysSystemParam record);
}