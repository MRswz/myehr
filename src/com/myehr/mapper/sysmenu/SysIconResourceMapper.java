package com.myehr.mapper.sysmenu;

import com.myehr.pojo.sysmenu.SysIconResource;
import com.myehr.pojo.sysmenu.SysIconResourceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysIconResourceMapper {
    int countByExample(SysIconResourceExample example);

    int deleteByExample(SysIconResourceExample example);

    int deleteByPrimaryKey(String iconCode);

    int insert(SysIconResource record);

    int insertSelective(SysIconResource record);

    List<SysIconResource> selectByExample(SysIconResourceExample example);

    SysIconResource selectByPrimaryKey(String iconCode);

    int updateByExampleSelective(@Param("record") SysIconResource record, @Param("example") SysIconResourceExample example);

    int updateByExample(@Param("record") SysIconResource record, @Param("example") SysIconResourceExample example);

    int updateByPrimaryKeySelective(SysIconResource record);

    int updateByPrimaryKey(SysIconResource record);
}