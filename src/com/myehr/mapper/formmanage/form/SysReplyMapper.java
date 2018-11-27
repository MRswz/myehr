package com.myehr.mapper.formmanage.form;

import com.myehr.pojo.formmanage.form.SysReply;
import com.myehr.pojo.formmanage.form.SysReplyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysReplyMapper {
    int countByExample(SysReplyExample example);

    int deleteByExample(SysReplyExample example);

    int insert(SysReply record);

    int insertSelective(SysReply record);

    List<SysReply> selectByExample(SysReplyExample example);

    int updateByExampleSelective(@Param("record") SysReply record, @Param("example") SysReplyExample example);

    int updateByExample(@Param("record") SysReply record, @Param("example") SysReplyExample example);
}