package com.myehr.mapper.calendar;

import com.myehr.pojo.calendar.K15;
import com.myehr.pojo.calendar.K15Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface K15Mapper {
    int countByExample(K15Example example);

    int deleteByExample(K15Example example);

    int deleteByPrimaryKey(Long k15Id);

    int insert(K15 record);

    int insertSelective(K15 record);

    List<K15> selectByExample(K15Example example);

    K15 selectByPrimaryKey(Long k15Id);

    int updateByExampleSelective(@Param("record") K15 record, @Param("example") K15Example example);

    int updateByExample(@Param("record") K15 record, @Param("example") K15Example example);

    int updateByPrimaryKeySelective(K15 record);

    int updateByPrimaryKey(K15 record);
}