package com.myehr.mapper.sysCvr;

import com.myehr.pojo.sysCvr.SysCvr;
import com.myehr.pojo.sysCvr.SysCvrExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysCvrMapper {
    int countByExample(SysCvrExample example);

    int deleteByExample(SysCvrExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SysCvr record);

    int insertSelective(SysCvr record);

    List<SysCvr> selectByExampleWithBLOBs(SysCvrExample example);

    List<SysCvr> selectByExample(SysCvrExample example);

    SysCvr selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SysCvr record, @Param("example") SysCvrExample example);

    int updateByExampleWithBLOBs(@Param("record") SysCvr record, @Param("example") SysCvrExample example);

    int updateByExample(@Param("record") SysCvr record, @Param("example") SysCvrExample example);

    int updateByPrimaryKeySelective(SysCvr record);

    int updateByPrimaryKeyWithBLOBs(SysCvr record);

    int updateByPrimaryKey(SysCvr record);
}