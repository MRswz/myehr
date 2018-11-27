package com.myehr.mapper.sysuser;

import com.myehr.pojo.sysuser.SysOnlineUser;
import com.myehr.pojo.sysuser.SysOnlineUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysOnlineUserMapper {
    int countByExample(SysOnlineUserExample example);

    int deleteByExample(SysOnlineUserExample example);

    int deleteByPrimaryKey(Long onlineUserId);

    int insert(SysOnlineUser record);

    int insertSelective(SysOnlineUser record);

    List<SysOnlineUser> selectByExample(SysOnlineUserExample example);

    SysOnlineUser selectByPrimaryKey(Long onlineUserId);

    int updateByExampleSelective(@Param("record") SysOnlineUser record, @Param("example") SysOnlineUserExample example);

    int updateByExample(@Param("record") SysOnlineUser record, @Param("example") SysOnlineUserExample example);

    int updateByPrimaryKeySelective(SysOnlineUser record);

    int updateByPrimaryKey(SysOnlineUser record);
}