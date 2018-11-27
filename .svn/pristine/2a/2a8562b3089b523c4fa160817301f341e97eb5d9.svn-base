package com.myehr.mapper.formmanage.form;

import com.myehr.pojo.formmanage.form.SysEditorModelFolderTree;
import com.myehr.pojo.formmanage.form.SysEditorModelFolderTreeExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysEditorModelFolderTreeMapper {
    int countByExample(SysEditorModelFolderTreeExample example);

    int deleteByExample(SysEditorModelFolderTreeExample example);

    int deleteByPrimaryKey(BigDecimal folderTreeId);

    int insert(SysEditorModelFolderTree record);

    int insertSelective(SysEditorModelFolderTree record);

    List<SysEditorModelFolderTree> selectByExample(SysEditorModelFolderTreeExample example);

    SysEditorModelFolderTree selectByPrimaryKey(BigDecimal folderTreeId);

    int updateByExampleSelective(@Param("record") SysEditorModelFolderTree record, @Param("example") SysEditorModelFolderTreeExample example);

    int updateByExample(@Param("record") SysEditorModelFolderTree record, @Param("example") SysEditorModelFolderTreeExample example);

    int updateByPrimaryKeySelective(SysEditorModelFolderTree record);

    int updateByPrimaryKey(SysEditorModelFolderTree record);
}