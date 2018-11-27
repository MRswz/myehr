package com.myehr.mapper.formmanage.button;

import com.myehr.pojo.formmanage.button.SysFormButtonIntroduce;
import com.myehr.pojo.formmanage.button.SysFormButtonIntroduceExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysFormButtonIntroduceMapper {
    int countByExample(SysFormButtonIntroduceExample example);

    int deleteByExample(SysFormButtonIntroduceExample example);

    int deleteByPrimaryKey(BigDecimal introduceId);

    int insert(SysFormButtonIntroduce record);

    int insertSelective(SysFormButtonIntroduce record);

    List<SysFormButtonIntroduce> selectByExample(SysFormButtonIntroduceExample example);

    SysFormButtonIntroduce selectByPrimaryKey(BigDecimal introduceId);

    int updateByExampleSelective(@Param("record") SysFormButtonIntroduce record, @Param("example") SysFormButtonIntroduceExample example);

    int updateByExample(@Param("record") SysFormButtonIntroduce record, @Param("example") SysFormButtonIntroduceExample example);

    int updateByPrimaryKeySelective(SysFormButtonIntroduce record);

    int updateByPrimaryKey(SysFormButtonIntroduce record);
}