package com.myehr.mapper.formmanage.form;

import com.myehr.pojo.formmanage.form.SysCardtocardConfig;
import com.myehr.pojo.formmanage.form.SysCardtocardConfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysCardtocardConfigMapper {
    int countByExample(SysCardtocardConfigExample example);

    int deleteByExample(SysCardtocardConfigExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SysCardtocardConfig record);

    int insertSelective(SysCardtocardConfig record);

    List<SysCardtocardConfig> selectByExample(SysCardtocardConfigExample example);

    SysCardtocardConfig selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SysCardtocardConfig record, @Param("example") SysCardtocardConfigExample example);

    int updateByExample(@Param("record") SysCardtocardConfig record, @Param("example") SysCardtocardConfigExample example);

    int updateByPrimaryKeySelective(SysCardtocardConfig record);

    int updateByPrimaryKey(SysCardtocardConfig record);
}