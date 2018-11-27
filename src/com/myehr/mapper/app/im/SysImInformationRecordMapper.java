package com.myehr.mapper.app.im;

import com.myehr.pojo.app.im.SysImInformationRecord;
import com.myehr.pojo.app.im.SysImInformationRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysImInformationRecordMapper {
    int countByExample(SysImInformationRecordExample example);

    int deleteByExample(SysImInformationRecordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SysImInformationRecord record);

    int insertSelective(SysImInformationRecord record);

    List<SysImInformationRecord> selectByExample(SysImInformationRecordExample example);

    SysImInformationRecord selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SysImInformationRecord record, @Param("example") SysImInformationRecordExample example);

    int updateByExample(@Param("record") SysImInformationRecord record, @Param("example") SysImInformationRecordExample example);

    int updateByPrimaryKeySelective(SysImInformationRecord record);

    int updateByPrimaryKey(SysImInformationRecord record);
}