package com.myehr.mapper.formmanage.form;

import com.myehr.pojo.formmanage.form.SysInterfaceScheme;
import com.myehr.pojo.formmanage.form.SysInterfaceSchemeExample;
import com.myehr.pojo.formmanage.form.SysInterfaceSchemeWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysInterfaceSchemeMapper {
    int countByExample(SysInterfaceSchemeExample example);

    int deleteByExample(SysInterfaceSchemeExample example);

    int deleteByPrimaryKey(Long interfaceSchemeId);

    int insert(SysInterfaceSchemeWithBLOBs record);

    int insertSelective(SysInterfaceSchemeWithBLOBs record);

    List<SysInterfaceSchemeWithBLOBs> selectByExampleWithBLOBs(SysInterfaceSchemeExample example);

    List<SysInterfaceScheme> selectByExample(SysInterfaceSchemeExample example);

    SysInterfaceSchemeWithBLOBs selectByPrimaryKey(Long interfaceSchemeId);

    int updateByExampleSelective(@Param("record") SysInterfaceSchemeWithBLOBs record, @Param("example") SysInterfaceSchemeExample example);

    int updateByExampleWithBLOBs(@Param("record") SysInterfaceSchemeWithBLOBs record, @Param("example") SysInterfaceSchemeExample example);

    int updateByExample(@Param("record") SysInterfaceScheme record, @Param("example") SysInterfaceSchemeExample example);

    int updateByPrimaryKeySelective(SysInterfaceSchemeWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(SysInterfaceSchemeWithBLOBs record);

    int updateByPrimaryKey(SysInterfaceScheme record);
}