package com.myehr.mapper.sysdict;

import com.myehr.pojo.dict.SysDictEntry;
import com.myehr.pojo.dict.SysDictEntryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysDictEntryMapper {
    int countByExample(SysDictEntryExample example);

    int deleteByExample(SysDictEntryExample example);

    int deleteByPrimaryKey(Integer dictEntryId);

    int insert(SysDictEntry record);

    int insertSelective(SysDictEntry record);

    List<SysDictEntry> selectByExample(SysDictEntryExample example);

    SysDictEntry selectByPrimaryKey(Integer dictEntryId);

    int updateByExampleSelective(@Param("record") SysDictEntry record, @Param("example") SysDictEntryExample example);

    int updateByExample(@Param("record") SysDictEntry record, @Param("example") SysDictEntryExample example);

    int updateByPrimaryKeySelective(SysDictEntry record);

    int updateByPrimaryKey(SysDictEntry record);
}