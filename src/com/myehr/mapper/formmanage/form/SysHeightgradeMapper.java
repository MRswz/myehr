package com.myehr.mapper.formmanage.form;

import com.myehr.pojo.formmanage.form.SysHeightgrade;
import com.myehr.pojo.formmanage.form.SysHeightgradeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysHeightgradeMapper {
    int countByExample(SysHeightgradeExample example);

    int deleteByExample(SysHeightgradeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SysHeightgrade record);

    int insertSelective(SysHeightgrade record);

    List<SysHeightgrade> selectByExample(SysHeightgradeExample example);

    SysHeightgrade selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SysHeightgrade record, @Param("example") SysHeightgradeExample example);

    int updateByExample(@Param("record") SysHeightgrade record, @Param("example") SysHeightgradeExample example);

    int updateByPrimaryKeySelective(SysHeightgrade record);

    int updateByPrimaryKey(SysHeightgrade record);
}