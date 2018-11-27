package com.myehr.mapper.sysmenu;

import com.myehr.pojo.sysmenu.SysFolder;
import com.myehr.pojo.sysmenu.SysFolderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysFolderMapper {
    int countByExample(SysFolderExample example);

    int deleteByExample(SysFolderExample example);

    int deleteByPrimaryKey(String folerId);

    int insert(SysFolder record);

    int insertSelective(SysFolder record);

    List<SysFolder> selectByExample(SysFolderExample example);

    SysFolder selectByPrimaryKey(String folerId);

    int updateByExampleSelective(@Param("record") SysFolder record, @Param("example") SysFolderExample example);

    int updateByExample(@Param("record") SysFolder record, @Param("example") SysFolderExample example);

    int updateByPrimaryKeySelective(SysFolder record);

    int updateByPrimaryKey(SysFolder record);
}