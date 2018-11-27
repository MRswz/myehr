package com.myehr.mapper.formmanage.button;

import com.myehr.pojo.formmanage.button.SysFormButtonRemove;
import com.myehr.pojo.formmanage.button.SysFormButtonRemoveExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysFormButtonRemoveMapper {
    int countByExample(SysFormButtonRemoveExample example);

    int deleteByExample(SysFormButtonRemoveExample example);

    int deleteByPrimaryKey(BigDecimal buttonRemoveId);

    int insert(SysFormButtonRemove record);

    int insertSelective(SysFormButtonRemove record);

    List<SysFormButtonRemove> selectByExample(SysFormButtonRemoveExample example);

    SysFormButtonRemove selectByPrimaryKey(BigDecimal buttonRemoveId);

    int updateByExampleSelective(@Param("record") SysFormButtonRemove record, @Param("example") SysFormButtonRemoveExample example);

    int updateByExample(@Param("record") SysFormButtonRemove record, @Param("example") SysFormButtonRemoveExample example);

    int updateByPrimaryKeySelective(SysFormButtonRemove record);

    int updateByPrimaryKey(SysFormButtonRemove record);
}