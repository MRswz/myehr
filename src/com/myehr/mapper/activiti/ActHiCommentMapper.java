package com.myehr.mapper.activiti;

import com.myehr.pojo.activiti.ActHiComment;
import com.myehr.pojo.activiti.ActHiCommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ActHiCommentMapper {
    int countByExample(ActHiCommentExample example);

    int deleteByExample(ActHiCommentExample example);

    int deleteByPrimaryKey(Object id);

    int insert(ActHiComment record);

    int insertSelective(ActHiComment record);

    List<ActHiComment> selectByExampleWithBLOBs(ActHiCommentExample example);

    List<ActHiComment> selectByExample(ActHiCommentExample example);

    ActHiComment selectByPrimaryKey(Object id);

    int updateByExampleSelective(@Param("record") ActHiComment record, @Param("example") ActHiCommentExample example);

    int updateByExampleWithBLOBs(@Param("record") ActHiComment record, @Param("example") ActHiCommentExample example);

    int updateByExample(@Param("record") ActHiComment record, @Param("example") ActHiCommentExample example);

    int updateByPrimaryKeySelective(ActHiComment record);

    int updateByPrimaryKeyWithBLOBs(ActHiComment record);

    int updateByPrimaryKey(ActHiComment record);
}