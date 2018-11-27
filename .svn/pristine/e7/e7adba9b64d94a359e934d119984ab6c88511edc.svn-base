package com.myehr.mapper.formmanage.widget;

import com.myehr.pojo.formmanage.widget.SysFileupload;
import com.myehr.pojo.formmanage.widget.SysFileuploadExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysFileuploadMapper {
    int countByExample(SysFileuploadExample example);

    int deleteByExample(SysFileuploadExample example);

    int deleteByPrimaryKey(BigDecimal fileid);

    int insert(SysFileupload record);

    int insertSelective(SysFileupload record);

    List<SysFileupload> selectByExampleWithBLOBs(SysFileuploadExample example);

    List<SysFileupload> selectByExample(SysFileuploadExample example);

    SysFileupload selectByPrimaryKey(BigDecimal fileid);

    int updateByExampleSelective(@Param("record") SysFileupload record, @Param("example") SysFileuploadExample example);

    int updateByExampleWithBLOBs(@Param("record") SysFileupload record, @Param("example") SysFileuploadExample example);

    int updateByExample(@Param("record") SysFileupload record, @Param("example") SysFileuploadExample example);

    int updateByPrimaryKeySelective(SysFileupload record);

    int updateByPrimaryKeyWithBLOBs(SysFileupload record);

    int updateByPrimaryKey(SysFileupload record);
}