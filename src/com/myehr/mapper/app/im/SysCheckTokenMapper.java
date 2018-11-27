package com.myehr.mapper.app.im;

import com.myehr.pojo.app.im.SysCheckToken;
import com.myehr.pojo.app.im.SysCheckTokenExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysCheckTokenMapper {
    int countByExample(SysCheckTokenExample example);

    int deleteByExample(SysCheckTokenExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SysCheckToken record);

    int insertSelective(SysCheckToken record);

    List<SysCheckToken> selectByExample(SysCheckTokenExample example);

    SysCheckToken selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SysCheckToken record, @Param("example") SysCheckTokenExample example);

    int updateByExample(@Param("record") SysCheckToken record, @Param("example") SysCheckTokenExample example);

    int updateByPrimaryKeySelective(SysCheckToken record);

    int updateByPrimaryKey(SysCheckToken record);
}