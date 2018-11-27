package com.myehr.mapper.app.im;

import com.myehr.pojo.app.im.OrgVWy;
import com.myehr.pojo.app.im.OrgVWyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrgVWyMapper {
    int countByExample(OrgVWyExample example);

    int deleteByExample(OrgVWyExample example);

    int insert(OrgVWy record);

    int insertSelective(OrgVWy record);

    List<OrgVWy> selectByExample(OrgVWyExample example);

    int updateByExampleSelective(@Param("record") OrgVWy record, @Param("example") OrgVWyExample example);

    int updateByExample(@Param("record") OrgVWy record, @Param("example") OrgVWyExample example);
}