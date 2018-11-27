package com.myehr.mapper.formmanage.form;

import com.myehr.pojo.formmanage.form.SysFileuploadConfig;
import com.myehr.pojo.formmanage.form.SysFileuploadConfigExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysFileuploadConfigMapper {
    int countByExample(SysFileuploadConfigExample example);

    int deleteByExample(SysFileuploadConfigExample example);

    int deleteByPrimaryKey(BigDecimal id);

    int insert(SysFileuploadConfig record);

    int insertSelective(SysFileuploadConfig record);

    List<SysFileuploadConfig> selectByExample(SysFileuploadConfigExample example);

    SysFileuploadConfig selectByPrimaryKey(BigDecimal id);

    int updateByExampleSelective(@Param("record") SysFileuploadConfig record, @Param("example") SysFileuploadConfigExample example);

    int updateByExample(@Param("record") SysFileuploadConfig record, @Param("example") SysFileuploadConfigExample example);

    int updateByPrimaryKeySelective(SysFileuploadConfig record);

    int updateByPrimaryKey(SysFileuploadConfig record);
}