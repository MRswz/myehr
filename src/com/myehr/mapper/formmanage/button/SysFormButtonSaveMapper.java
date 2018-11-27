package com.myehr.mapper.formmanage.button;

import com.myehr.pojo.formmanage.button.SysFormButtonSave;
import com.myehr.pojo.formmanage.button.SysFormButtonSaveExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysFormButtonSaveMapper {
    int countByExample(SysFormButtonSaveExample example);

    int deleteByExample(SysFormButtonSaveExample example);

    int deleteByPrimaryKey(BigDecimal buttonSaveId);

    int insert(SysFormButtonSave record);

    int insertSelective(SysFormButtonSave record);

    List<SysFormButtonSave> selectByExample(SysFormButtonSaveExample example);

    SysFormButtonSave selectByPrimaryKey(BigDecimal buttonSaveId);

    int updateByExampleSelective(@Param("record") SysFormButtonSave record, @Param("example") SysFormButtonSaveExample example);

    int updateByExample(@Param("record") SysFormButtonSave record, @Param("example") SysFormButtonSaveExample example);

    int updateByPrimaryKeySelective(SysFormButtonSave record);

    int updateByPrimaryKey(SysFormButtonSave record);
}