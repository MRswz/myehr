package com.myehr.mapper.formmanage.form;

import com.myehr.pojo.formmanage.form.SysTreeFolderTree;
import com.myehr.pojo.formmanage.form.SysTreeFolderTreeExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysTreeFolderTreeMapper {
    int countByExample(SysTreeFolderTreeExample example);

    int deleteByExample(SysTreeFolderTreeExample example);

    int deleteByPrimaryKey(BigDecimal folderTreeId);

    int insert(SysTreeFolderTree record);

    int insertSelective(SysTreeFolderTree record);

    List<SysTreeFolderTree> selectByExample(SysTreeFolderTreeExample example);

    SysTreeFolderTree selectByPrimaryKey(BigDecimal folderTreeId);

    int updateByExampleSelective(@Param("record") SysTreeFolderTree record, @Param("example") SysTreeFolderTreeExample example);

    int updateByExample(@Param("record") SysTreeFolderTree record, @Param("example") SysTreeFolderTreeExample example);

    int updateByPrimaryKeySelective(SysTreeFolderTree record);

    int updateByPrimaryKey(SysTreeFolderTree record);
}