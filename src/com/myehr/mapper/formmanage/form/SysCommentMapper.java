package com.myehr.mapper.formmanage.form;

import com.myehr.pojo.formmanage.form.SysComment;
import com.myehr.pojo.formmanage.form.SysCommentExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysCommentMapper {
    int countByExample(SysCommentExample example);

    int deleteByExample(SysCommentExample example);

    int deleteByPrimaryKey(BigDecimal id);

    int insert(SysComment record);

    int insertSelective(SysComment record);

    List<SysComment> selectByExample(SysCommentExample example);

    SysComment selectByPrimaryKey(BigDecimal id);

    int updateByExampleSelective(@Param("record") SysComment record, @Param("example") SysCommentExample example);

    int updateByExample(@Param("record") SysComment record, @Param("example") SysCommentExample example);

    int updateByPrimaryKeySelective(SysComment record);

    int updateByPrimaryKey(SysComment record);
}