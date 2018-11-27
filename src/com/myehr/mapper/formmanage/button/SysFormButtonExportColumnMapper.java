package com.myehr.mapper.formmanage.button;

import com.myehr.pojo.formmanage.button.SysFormButtonExportColumn;
import com.myehr.pojo.formmanage.button.SysFormButtonExportColumnExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysFormButtonExportColumnMapper {
    int countByExample(SysFormButtonExportColumnExample example);

    int deleteByExample(SysFormButtonExportColumnExample example);

    int deleteByPrimaryKey(BigDecimal exportColumnId);

    int insert(SysFormButtonExportColumn record);

    int insertSelective(SysFormButtonExportColumn record);

    List<SysFormButtonExportColumn> selectByExample(SysFormButtonExportColumnExample example);

    SysFormButtonExportColumn selectByPrimaryKey(BigDecimal exportColumnId);

    int updateByExampleSelective(@Param("record") SysFormButtonExportColumn record, @Param("example") SysFormButtonExportColumnExample example);

    int updateByExample(@Param("record") SysFormButtonExportColumn record, @Param("example") SysFormButtonExportColumnExample example);

    int updateByPrimaryKeySelective(SysFormButtonExportColumn record);

    int updateByPrimaryKey(SysFormButtonExportColumn record);
}