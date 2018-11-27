package com.myehr.mapper.activiti;

import com.myehr.pojo.activiti.ActGeBytearray;
import com.myehr.pojo.activiti.ActGeBytearrayExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ActGeBytearrayMapper {
    int countByExample(ActGeBytearrayExample example);

    int deleteByExample(ActGeBytearrayExample example);

    int deleteByPrimaryKey(Object id);

    int insert(ActGeBytearray record);

    int insertSelective(ActGeBytearray record);

    List<ActGeBytearray> selectByExampleWithBLOBs(ActGeBytearrayExample example);

    List<ActGeBytearray> selectByExample(ActGeBytearrayExample example);

    ActGeBytearray selectByPrimaryKey(Object id);

    int updateByExampleSelective(@Param("record") ActGeBytearray record, @Param("example") ActGeBytearrayExample example);

    int updateByExampleWithBLOBs(@Param("record") ActGeBytearray record, @Param("example") ActGeBytearrayExample example);

    int updateByExample(@Param("record") ActGeBytearray record, @Param("example") ActGeBytearrayExample example);

    int updateByPrimaryKeySelective(ActGeBytearray record);

    int updateByPrimaryKeyWithBLOBs(ActGeBytearray record);

    int updateByPrimaryKey(ActGeBytearray record);
}