package com.myehr.mapper.formmanage.form;

import com.myehr.pojo.formmanage.form.SysFormYkReportQueryparams;
import com.myehr.pojo.formmanage.form.SysFormYkReportQueryparamsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysFormYkReportQueryparamsMapper {
    int countByExample(SysFormYkReportQueryparamsExample example);

    int deleteByExample(SysFormYkReportQueryparamsExample example);

    int deleteByPrimaryKey(Long queryParamId);

    int insert(SysFormYkReportQueryparams record);

    int insertSelective(SysFormYkReportQueryparams record);

    List<SysFormYkReportQueryparams> selectByExample(SysFormYkReportQueryparamsExample example);

    SysFormYkReportQueryparams selectByPrimaryKey(Long queryParamId);

    int updateByExampleSelective(@Param("record") SysFormYkReportQueryparams record, @Param("example") SysFormYkReportQueryparamsExample example);

    int updateByExample(@Param("record") SysFormYkReportQueryparams record, @Param("example") SysFormYkReportQueryparamsExample example);

    int updateByPrimaryKeySelective(SysFormYkReportQueryparams record);

    int updateByPrimaryKey(SysFormYkReportQueryparams record);
}