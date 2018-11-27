package com.myehr.mapper.formmanage.form;

import com.myehr.pojo.formmanage.form.SysActfreeTask;
import com.myehr.pojo.formmanage.form.SysActfreeTaskExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysActfreeTaskMapper {
    int countByExample(SysActfreeTaskExample example);

    int deleteByExample(SysActfreeTaskExample example);

    int deleteByPrimaryKey(String taskid);

    int insert(SysActfreeTask record);

    int insertSelective(SysActfreeTask record);

    List<SysActfreeTask> selectByExample(SysActfreeTaskExample example);

    SysActfreeTask selectByPrimaryKey(String taskid);

    int updateByExampleSelective(@Param("record") SysActfreeTask record, @Param("example") SysActfreeTaskExample example);

    int updateByExample(@Param("record") SysActfreeTask record, @Param("example") SysActfreeTaskExample example);

    int updateByPrimaryKeySelective(SysActfreeTask record);

    int updateByPrimaryKey(SysActfreeTask record);
}