package com.myehr.mapper.lang;

import com.myehr.pojo.lang.SysLang;
import com.myehr.pojo.lang.SysLangExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysLangMapper {
    int countByExample(SysLangExample example);

    int deleteByExample(SysLangExample example);

    int deleteByPrimaryKey(String langCode);

    int insert(SysLang record);

    int insertSelective(SysLang record);

    List<SysLang> selectByExample(SysLangExample example);

    SysLang selectByPrimaryKey(String langCode);

    int updateByExampleSelective(@Param("record") SysLang record, @Param("example") SysLangExample example);

    int updateByExample(@Param("record") SysLang record, @Param("example") SysLangExample example);

    int updateByPrimaryKeySelective(SysLang record);

    int updateByPrimaryKey(SysLang record);
}