package com.myehr.mapper.formmanage.form;

import com.myehr.pojo.formmanage.form.SysFormColumn;
import com.myehr.pojo.formmanage.form.SysFormColumnExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysFormColumnMapper {
    int countByExample(SysFormColumnExample example);

    int deleteByExample(SysFormColumnExample example);

    int deleteByPrimaryKey(BigDecimal formColumnId);

    int insert(SysFormColumn record);

    int insertSelective(SysFormColumn record);

    List<SysFormColumn> selectByExample(SysFormColumnExample example);

    SysFormColumn selectByPrimaryKey(BigDecimal formColumnId);

    int updateByExampleSelective(@Param("record") SysFormColumn record, @Param("example") SysFormColumnExample example);

    int updateByExample(@Param("record") SysFormColumn record, @Param("example") SysFormColumnExample example);

    int updateByPrimaryKeySelective(SysFormColumn record);

    int updateByPrimaryKey(SysFormColumn record);
}