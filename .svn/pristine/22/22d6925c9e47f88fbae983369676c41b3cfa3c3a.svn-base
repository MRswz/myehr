package com.myehr.mapper.formmanage.form;

import com.myehr.pojo.formmanage.form.SysNews;
import com.myehr.pojo.formmanage.form.SysNewsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysNewsMapper {
    int countByExample(SysNewsExample example);

    int deleteByExample(SysNewsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SysNews record);

    int insertSelective(SysNews record);

    List<SysNews> selectByExample(SysNewsExample example);

    SysNews selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SysNews record, @Param("example") SysNewsExample example);

    int updateByExample(@Param("record") SysNews record, @Param("example") SysNewsExample example);

    int updateByPrimaryKeySelective(SysNews record);

    int updateByPrimaryKey(SysNews record);
}