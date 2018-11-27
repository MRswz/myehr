package com.myehr.mapper.activiti;

import com.myehr.pojo.activiti.ActHiAttachment;
import com.myehr.pojo.activiti.ActHiAttachmentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ActHiAttachmentMapper {
    int countByExample(ActHiAttachmentExample example);

    int deleteByExample(ActHiAttachmentExample example);

    int deleteByPrimaryKey(Object id);

    int insert(ActHiAttachment record);

    int insertSelective(ActHiAttachment record);

    List<ActHiAttachment> selectByExample(ActHiAttachmentExample example);

    ActHiAttachment selectByPrimaryKey(Object id);

    int updateByExampleSelective(@Param("record") ActHiAttachment record, @Param("example") ActHiAttachmentExample example);

    int updateByExample(@Param("record") ActHiAttachment record, @Param("example") ActHiAttachmentExample example);

    int updateByPrimaryKeySelective(ActHiAttachment record);

    int updateByPrimaryKey(ActHiAttachment record);
}