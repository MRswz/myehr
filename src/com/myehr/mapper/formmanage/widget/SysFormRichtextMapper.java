package com.myehr.mapper.formmanage.widget;

import com.myehr.pojo.formmanage.widget.SysFormRichtext;
import com.myehr.pojo.formmanage.widget.SysFormRichtextExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysFormRichtextMapper {
    int countByExample(SysFormRichtextExample example);

    int deleteByExample(SysFormRichtextExample example);

    int deleteByPrimaryKey(BigDecimal richtextId);

    int insert(SysFormRichtext record);

    int insertSelective(SysFormRichtext record);

    List<SysFormRichtext> selectByExample(SysFormRichtextExample example);

    SysFormRichtext selectByPrimaryKey(BigDecimal richtextId);

    int updateByExampleSelective(@Param("record") SysFormRichtext record, @Param("example") SysFormRichtextExample example);

    int updateByExample(@Param("record") SysFormRichtext record, @Param("example") SysFormRichtextExample example);

    int updateByPrimaryKeySelective(SysFormRichtext record);

    int updateByPrimaryKey(SysFormRichtext record);
}