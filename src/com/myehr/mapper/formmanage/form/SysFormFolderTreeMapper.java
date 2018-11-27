package com.myehr.mapper.formmanage.form;

import com.myehr.pojo.formmanage.form.SysFormFolderTree;
import com.myehr.pojo.formmanage.form.SysFormFolderTreeExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysFormFolderTreeMapper {
    int countByExample(SysFormFolderTreeExample example);

    int deleteByExample(SysFormFolderTreeExample example);

    int deleteByPrimaryKey(BigDecimal folderTreeId);

    int insert(SysFormFolderTree record);

    int insertSelective(SysFormFolderTree record);

    List<SysFormFolderTree> selectByExample(SysFormFolderTreeExample example);

    SysFormFolderTree selectByPrimaryKey(BigDecimal folderTreeId);

    int updateByExampleSelective(@Param("record") SysFormFolderTree record, @Param("example") SysFormFolderTreeExample example);

    int updateByExample(@Param("record") SysFormFolderTree record, @Param("example") SysFormFolderTreeExample example);

    int updateByPrimaryKeySelective(SysFormFolderTree record);

    int updateByPrimaryKey(SysFormFolderTree record);
}