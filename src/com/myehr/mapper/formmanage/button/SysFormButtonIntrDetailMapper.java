package com.myehr.mapper.formmanage.button;

import com.myehr.pojo.formmanage.button.SysFormButtonIntrDetail;
import com.myehr.pojo.formmanage.button.SysFormButtonIntrDetailExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysFormButtonIntrDetailMapper {
    int countByExample(SysFormButtonIntrDetailExample example);

    int deleteByExample(SysFormButtonIntrDetailExample example);

    int deleteByPrimaryKey(BigDecimal intrDetailId);

    int insert(SysFormButtonIntrDetail record);

    int insertSelective(SysFormButtonIntrDetail record);

    List<SysFormButtonIntrDetail> selectByExample(SysFormButtonIntrDetailExample example);

    SysFormButtonIntrDetail selectByPrimaryKey(BigDecimal intrDetailId);

    int updateByExampleSelective(@Param("record") SysFormButtonIntrDetail record, @Param("example") SysFormButtonIntrDetailExample example);

    int updateByExample(@Param("record") SysFormButtonIntrDetail record, @Param("example") SysFormButtonIntrDetailExample example);

    int updateByPrimaryKeySelective(SysFormButtonIntrDetail record);

    int updateByPrimaryKey(SysFormButtonIntrDetail record);
}