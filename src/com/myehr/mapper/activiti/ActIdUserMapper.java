package com.myehr.mapper.activiti;

import com.myehr.pojo.activiti.ActIdUser;
import com.myehr.pojo.activiti.ActIdUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ActIdUserMapper {
    int countByExample(ActIdUserExample example);

    int deleteByExample(ActIdUserExample example);

    int deleteByPrimaryKey(Object id);

    int insert(ActIdUser record);

    int insertSelective(ActIdUser record);

    List<ActIdUser> selectByExample(ActIdUserExample example);

    ActIdUser selectByPrimaryKey(Object id);

    int updateByExampleSelective(@Param("record") ActIdUser record, @Param("example") ActIdUserExample example);

    int updateByExample(@Param("record") ActIdUser record, @Param("example") ActIdUserExample example);

    int updateByPrimaryKeySelective(ActIdUser record);

    int updateByPrimaryKey(ActIdUser record);
}