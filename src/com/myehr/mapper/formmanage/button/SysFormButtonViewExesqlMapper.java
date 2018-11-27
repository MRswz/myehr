package com.myehr.mapper.formmanage.button;

import com.myehr.pojo.formmanage.button.SysFormButtonViewExesql;
import com.myehr.pojo.formmanage.button.SysFormButtonViewExesqlExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysFormButtonViewExesqlMapper {
    int countByExample(SysFormButtonViewExesqlExample example);

    int deleteByExample(SysFormButtonViewExesqlExample example);

    int insert(SysFormButtonViewExesql record);

    int insertSelective(SysFormButtonViewExesql record);

    List<SysFormButtonViewExesql> selectByExample(SysFormButtonViewExesqlExample example);

    int updateByExampleSelective(@Param("record") SysFormButtonViewExesql record, @Param("example") SysFormButtonViewExesqlExample example);

    int updateByExample(@Param("record") SysFormButtonViewExesql record, @Param("example") SysFormButtonViewExesqlExample example);
}