package com.myehr.mapper.formmanage.form;

import com.myehr.pojo.formmanage.form.SysHeightgradeconfig;
import com.myehr.pojo.formmanage.form.SysHeightgradeconfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysHeightgradeconfigMapper {
    int countByExample(SysHeightgradeconfigExample example);

    int deleteByExample(SysHeightgradeconfigExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SysHeightgradeconfig record);

    int insertSelective(SysHeightgradeconfig record);

    List<SysHeightgradeconfig> selectByExample(SysHeightgradeconfigExample example);

    SysHeightgradeconfig selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SysHeightgradeconfig record, @Param("example") SysHeightgradeconfigExample example);

    int updateByExample(@Param("record") SysHeightgradeconfig record, @Param("example") SysHeightgradeconfigExample example);

    int updateByPrimaryKeySelective(SysHeightgradeconfig record);

    int updateByPrimaryKey(SysHeightgradeconfig record);
}