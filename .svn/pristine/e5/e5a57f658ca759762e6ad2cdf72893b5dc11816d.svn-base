package com.myehr.mapper.app.im;

import com.myehr.pojo.app.im.SysImMessage;
import com.myehr.pojo.app.im.SysImMessageExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysImMessageMapper {
    int countByExample(SysImMessageExample example);

    int deleteByExample(SysImMessageExample example);

    int deleteByPrimaryKey(BigDecimal id);

    int insert(SysImMessage record);

    int insertSelective(SysImMessage record);

    List<SysImMessage> selectByExampleWithBLOBs(SysImMessageExample example);

    List<SysImMessage> selectByExample(SysImMessageExample example);

    SysImMessage selectByPrimaryKey(BigDecimal id);

    int updateByExampleSelective(@Param("record") SysImMessage record, @Param("example") SysImMessageExample example);

    int updateByExampleWithBLOBs(@Param("record") SysImMessage record, @Param("example") SysImMessageExample example);

    int updateByExample(@Param("record") SysImMessage record, @Param("example") SysImMessageExample example);

    int updateByPrimaryKeySelective(SysImMessage record);

    int updateByPrimaryKeyWithBLOBs(SysImMessage record);

    int updateByPrimaryKey(SysImMessage record);
}