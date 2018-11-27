package com.myehr.mapper.formmanage.button;

import com.myehr.pojo.formmanage.button.SysFormButtonImportColumn;
import com.myehr.pojo.formmanage.button.SysFormButtonImportColumnExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysFormButtonImportColumnMapper {
    int countByExample(SysFormButtonImportColumnExample example);

    int deleteByExample(SysFormButtonImportColumnExample example);

    int deleteByPrimaryKey(BigDecimal importColumnId);

    int insert(SysFormButtonImportColumn record);

    int insertSelective(SysFormButtonImportColumn record);

    List<SysFormButtonImportColumn> selectByExample(SysFormButtonImportColumnExample example);

    SysFormButtonImportColumn selectByPrimaryKey(BigDecimal importColumnId);

    int updateByExampleSelective(@Param("record") SysFormButtonImportColumn record, @Param("example") SysFormButtonImportColumnExample example);

    int updateByExample(@Param("record") SysFormButtonImportColumn record, @Param("example") SysFormButtonImportColumnExample example);

    int updateByPrimaryKeySelective(SysFormButtonImportColumn record);

    int updateByPrimaryKey(SysFormButtonImportColumn record);
}