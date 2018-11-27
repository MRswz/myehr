package com.myehr.mapper.formmanage.form;

import com.myehr.pojo.formmanage.form.SysFormButton;
import com.myehr.pojo.formmanage.form.SysFormButtonExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysFormButtonMapper {
    int countByExample(SysFormButtonExample example);

    int deleteByExample(SysFormButtonExample example);

    int deleteByPrimaryKey(BigDecimal formButtonId);

    int insert(SysFormButton record);

    int insertSelective(SysFormButton record);

    List<SysFormButton> selectByExample(SysFormButtonExample example);

    SysFormButton selectByPrimaryKey(BigDecimal formButtonId);

    int updateByExampleSelective(@Param("record") SysFormButton record, @Param("example") SysFormButtonExample example);

    int updateByExample(@Param("record") SysFormButton record, @Param("example") SysFormButtonExample example);

    int updateByPrimaryKeySelective(SysFormButton record);

    int updateByPrimaryKey(SysFormButton record);
}