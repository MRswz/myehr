package com.myehr.mapper.formmanage.form;

import com.myehr.pojo.formmanage.form.SysSqlParamsFolderTree;
import com.myehr.pojo.formmanage.form.SysSqlParamsFolderTreeExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysSqlParamsFolderTreeMapper {
    int countByExample(SysSqlParamsFolderTreeExample example);

    int deleteByExample(SysSqlParamsFolderTreeExample example);

    int deleteByPrimaryKey(BigDecimal folderTreeId);

    int insert(SysSqlParamsFolderTree record);

    int insertSelective(SysSqlParamsFolderTree record);

    List<SysSqlParamsFolderTree> selectByExample(SysSqlParamsFolderTreeExample example);

    SysSqlParamsFolderTree selectByPrimaryKey(BigDecimal folderTreeId);

    int updateByExampleSelective(@Param("record") SysSqlParamsFolderTree record, @Param("example") SysSqlParamsFolderTreeExample example);

    int updateByExample(@Param("record") SysSqlParamsFolderTree record, @Param("example") SysSqlParamsFolderTreeExample example);

    int updateByPrimaryKeySelective(SysSqlParamsFolderTree record);

    int updateByPrimaryKey(SysSqlParamsFolderTree record);
}