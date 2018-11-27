package com.myehr.mapper.formmanage.widget;

import com.myehr.pojo.formmanage.widget.SysFormFileupload;
import com.myehr.pojo.formmanage.widget.SysFormFileuploadExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysFormFileuploadMapper {
    int countByExample(SysFormFileuploadExample example);

    int deleteByExample(SysFormFileuploadExample example);

    int deleteByPrimaryKey(BigDecimal fileuploadId);

    int insert(SysFormFileupload record);

    int insertSelective(SysFormFileupload record);

    List<SysFormFileupload> selectByExample(SysFormFileuploadExample example);

    SysFormFileupload selectByPrimaryKey(BigDecimal fileuploadId);

    int updateByExampleSelective(@Param("record") SysFormFileupload record, @Param("example") SysFormFileuploadExample example);

    int updateByExample(@Param("record") SysFormFileupload record, @Param("example") SysFormFileuploadExample example);

    int updateByPrimaryKeySelective(SysFormFileupload record);

    int updateByPrimaryKey(SysFormFileupload record);
}