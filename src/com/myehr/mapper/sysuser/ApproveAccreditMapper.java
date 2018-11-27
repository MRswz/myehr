package com.myehr.mapper.sysuser;

import com.myehr.pojo.sysuser.ApproveAccredit;
import com.myehr.pojo.sysuser.ApproveAccreditExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ApproveAccreditMapper {
    int countByExample(ApproveAccreditExample example);

    int deleteByExample(ApproveAccreditExample example);

    int insert(ApproveAccredit record);

    int insertSelective(ApproveAccredit record);

    List<ApproveAccredit> selectByExample(ApproveAccreditExample example);

    int updateByExampleSelective(@Param("record") ApproveAccredit record, @Param("example") ApproveAccreditExample example);

    int updateByExample(@Param("record") ApproveAccredit record, @Param("example") ApproveAccreditExample example);
}