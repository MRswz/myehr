package com.myehr.mapper.formmanage.button;

import com.myehr.pojo.formmanage.button.SysFormButtonImport;
import com.myehr.pojo.formmanage.button.SysFormButtonImportExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysFormButtonImportMapper {
    int countByExample(SysFormButtonImportExample example);

    int deleteByExample(SysFormButtonImportExample example);

    int deleteByPrimaryKey(BigDecimal buttonImportId);

    int insert(SysFormButtonImport record);

    int insertSelective(SysFormButtonImport record);

    List<SysFormButtonImport> selectByExample(SysFormButtonImportExample example);

    SysFormButtonImport selectByPrimaryKey(BigDecimal buttonImportId);

    int updateByExampleSelective(@Param("record") SysFormButtonImport record, @Param("example") SysFormButtonImportExample example);

    int updateByExample(@Param("record") SysFormButtonImport record, @Param("example") SysFormButtonImportExample example);

    int updateByPrimaryKeySelective(SysFormButtonImport record);

    int updateByPrimaryKey(SysFormButtonImport record);
}