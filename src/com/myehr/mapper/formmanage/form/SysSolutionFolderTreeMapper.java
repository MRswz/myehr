package com.myehr.mapper.formmanage.form;

import com.myehr.pojo.formmanage.form.SysSolutionFolderTree;
import com.myehr.pojo.formmanage.form.SysSolutionFolderTreeExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysSolutionFolderTreeMapper {
    int countByExample(SysSolutionFolderTreeExample example);

    int deleteByExample(SysSolutionFolderTreeExample example);

    int deleteByPrimaryKey(BigDecimal folderTreeId);

    int insert(SysSolutionFolderTree record);

    int insertSelective(SysSolutionFolderTree record);

    List<SysSolutionFolderTree> selectByExample(SysSolutionFolderTreeExample example);

    SysSolutionFolderTree selectByPrimaryKey(BigDecimal folderTreeId);

    int updateByExampleSelective(@Param("record") SysSolutionFolderTree record, @Param("example") SysSolutionFolderTreeExample example);

    int updateByExample(@Param("record") SysSolutionFolderTree record, @Param("example") SysSolutionFolderTreeExample example);

    int updateByPrimaryKeySelective(SysSolutionFolderTree record);

    int updateByPrimaryKey(SysSolutionFolderTree record);
}