package com.myehr.mapper.formmanage.form;

import com.myehr.pojo.formmanage.form.SysFormYkReport;
import com.myehr.pojo.formmanage.form.SysFormYkReportExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysFormYkReportMapper {
    int countByExample(SysFormYkReportExample example);

    int deleteByExample(SysFormYkReportExample example);

    int deleteByPrimaryKey(Long reportId);

    int insert(SysFormYkReport record);

    int insertSelective(SysFormYkReport record);

    List<SysFormYkReport> selectByExampleWithBLOBs(SysFormYkReportExample example);

    List<SysFormYkReport> selectByExample(SysFormYkReportExample example);

    SysFormYkReport selectByPrimaryKey(Long reportId);

    int updateByExampleSelective(@Param("record") SysFormYkReport record, @Param("example") SysFormYkReportExample example);

    int updateByExampleWithBLOBs(@Param("record") SysFormYkReport record, @Param("example") SysFormYkReportExample example);

    int updateByExample(@Param("record") SysFormYkReport record, @Param("example") SysFormYkReportExample example);

    int updateByPrimaryKeySelective(SysFormYkReport record);

    int updateByPrimaryKeyWithBLOBs(SysFormYkReport record);

    int updateByPrimaryKey(SysFormYkReport record);
}