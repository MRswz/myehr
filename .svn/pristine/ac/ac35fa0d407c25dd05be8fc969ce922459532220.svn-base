package com.myehr.mapper.formmanage.widget;

import com.myehr.pojo.formmanage.widget.SysFormTextbox;
import com.myehr.pojo.formmanage.widget.SysFormTextboxExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysFormTextboxMapper {
    int countByExample(SysFormTextboxExample example);

    int deleteByExample(SysFormTextboxExample example);

    int deleteByPrimaryKey(BigDecimal textboxId);

    int insert(SysFormTextbox record);

    int insertSelective(SysFormTextbox record);

    List<SysFormTextbox> selectByExample(SysFormTextboxExample example);

    SysFormTextbox selectByPrimaryKey(BigDecimal textboxId);

    int updateByExampleSelective(@Param("record") SysFormTextbox record, @Param("example") SysFormTextboxExample example);

    int updateByExample(@Param("record") SysFormTextbox record, @Param("example") SysFormTextboxExample example);

    int updateByPrimaryKeySelective(SysFormTextbox record);

    int updateByPrimaryKey(SysFormTextbox record);
}