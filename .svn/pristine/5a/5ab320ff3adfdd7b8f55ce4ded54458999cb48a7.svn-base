package com.myehr.mapper.formmanage.drag;

import com.myehr.pojo.formmanage.drag.SysFormDragconfig;
import com.myehr.pojo.formmanage.drag.SysFormDragconfigExample;
import com.myehr.pojo.formmanage.drag.SysFormDragconfigWithBLOBs;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysFormDragconfigMapper {
    int countByExample(SysFormDragconfigExample example);

    int deleteByExample(SysFormDragconfigExample example);

    int deleteByPrimaryKey(BigDecimal dragconfigId);

    int insert(SysFormDragconfigWithBLOBs record);

    int insertSelective(SysFormDragconfigWithBLOBs record);

    List<SysFormDragconfigWithBLOBs> selectByExampleWithBLOBs(SysFormDragconfigExample example);

    List<SysFormDragconfig> selectByExample(SysFormDragconfigExample example);

    SysFormDragconfigWithBLOBs selectByPrimaryKey(BigDecimal dragconfigId);

    int updateByExampleSelective(@Param("record") SysFormDragconfigWithBLOBs record, @Param("example") SysFormDragconfigExample example);

    int updateByExampleWithBLOBs(@Param("record") SysFormDragconfigWithBLOBs record, @Param("example") SysFormDragconfigExample example);

    int updateByExample(@Param("record") SysFormDragconfig record, @Param("example") SysFormDragconfigExample example);

    int updateByPrimaryKeySelective(SysFormDragconfigWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(SysFormDragconfigWithBLOBs record);

    int updateByPrimaryKey(SysFormDragconfig record);
}