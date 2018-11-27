package com.myehr.mapper.sysFlowMenu;

import com.myehr.pojo.sysFlowMenu.SysFlowMenu;
import com.myehr.pojo.sysFlowMenu.SysFlowMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysFlowMenuMapper {
    int countByExample(SysFlowMenuExample example);

    int deleteByExample(SysFlowMenuExample example);

    int deleteByPrimaryKey(Integer flowMenuId);

    int insert(SysFlowMenu record);

    int insertSelective(SysFlowMenu record);

    List<SysFlowMenu> selectByExample(SysFlowMenuExample example);

    SysFlowMenu selectByPrimaryKey(Integer flowMenuId);

    int updateByExampleSelective(@Param("record") SysFlowMenu record, @Param("example") SysFlowMenuExample example);

    int updateByExample(@Param("record") SysFlowMenu record, @Param("example") SysFlowMenuExample example);

    int updateByPrimaryKeySelective(SysFlowMenu record);

    int updateByPrimaryKey(SysFlowMenu record);
}