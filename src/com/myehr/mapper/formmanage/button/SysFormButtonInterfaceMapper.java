package com.myehr.mapper.formmanage.button;

import com.myehr.pojo.formmanage.button.SysFormButtonInterface;
import com.myehr.pojo.formmanage.button.SysFormButtonInterfaceExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysFormButtonInterfaceMapper {
    int countByExample(SysFormButtonInterfaceExample example);

    int deleteByExample(SysFormButtonInterfaceExample example);

    int deleteByPrimaryKey(BigDecimal buttonInterfaceId);

    int insert(SysFormButtonInterface record);

    int insertSelective(SysFormButtonInterface record);

    List<SysFormButtonInterface> selectByExample(SysFormButtonInterfaceExample example);

    SysFormButtonInterface selectByPrimaryKey(BigDecimal buttonInterfaceId);

    int updateByExampleSelective(@Param("record") SysFormButtonInterface record, @Param("example") SysFormButtonInterfaceExample example);

    int updateByExample(@Param("record") SysFormButtonInterface record, @Param("example") SysFormButtonInterfaceExample example);

    int updateByPrimaryKeySelective(SysFormButtonInterface record);

    int updateByPrimaryKey(SysFormButtonInterface record);
}