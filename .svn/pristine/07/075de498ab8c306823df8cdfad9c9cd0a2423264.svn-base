package com.myehr.mapper.app.im;

import com.myehr.pojo.app.im.SysImInformation;
import com.myehr.pojo.app.im.SysImInformationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysImInformationMapper {
    int countByExample(SysImInformationExample example);

    int deleteByExample(SysImInformationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SysImInformation record);

    int insertSelective(SysImInformation record);

    List<SysImInformation> selectByExample(SysImInformationExample example);

    SysImInformation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SysImInformation record, @Param("example") SysImInformationExample example);

    int updateByExample(@Param("record") SysImInformation record, @Param("example") SysImInformationExample example);

    int updateByPrimaryKeySelective(SysImInformation record);

    int updateByPrimaryKey(SysImInformation record);
}