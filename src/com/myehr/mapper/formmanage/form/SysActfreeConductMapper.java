package com.myehr.mapper.formmanage.form;

import com.myehr.pojo.formmanage.form.SysActfreeConduct;
import com.myehr.pojo.formmanage.form.SysActfreeConductExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysActfreeConductMapper {
    int countByExample(SysActfreeConductExample example);

    int deleteByExample(SysActfreeConductExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SysActfreeConduct record);

    int insertSelective(SysActfreeConduct record);

    List<SysActfreeConduct> selectByExample(SysActfreeConductExample example);

    SysActfreeConduct selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SysActfreeConduct record, @Param("example") SysActfreeConductExample example);

    int updateByExample(@Param("record") SysActfreeConduct record, @Param("example") SysActfreeConductExample example);

    int updateByPrimaryKeySelective(SysActfreeConduct record);

    int updateByPrimaryKey(SysActfreeConduct record);
}