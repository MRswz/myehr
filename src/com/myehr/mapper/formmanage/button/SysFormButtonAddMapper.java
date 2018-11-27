package com.myehr.mapper.formmanage.button;

import com.myehr.pojo.formmanage.button.SysFormButtonAdd;
import com.myehr.pojo.formmanage.button.SysFormButtonAddExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysFormButtonAddMapper {
    int countByExample(SysFormButtonAddExample example);

    int deleteByExample(SysFormButtonAddExample example);

    int deleteByPrimaryKey(BigDecimal buttonAddId);

    int insert(SysFormButtonAdd record);

    int insertSelective(SysFormButtonAdd record);

    List<SysFormButtonAdd> selectByExample(SysFormButtonAddExample example);

    SysFormButtonAdd selectByPrimaryKey(BigDecimal buttonAddId);

    int updateByExampleSelective(@Param("record") SysFormButtonAdd record, @Param("example") SysFormButtonAddExample example);

    int updateByExample(@Param("record") SysFormButtonAdd record, @Param("example") SysFormButtonAddExample example);

    int updateByPrimaryKeySelective(SysFormButtonAdd record);

    int updateByPrimaryKey(SysFormButtonAdd record);
}