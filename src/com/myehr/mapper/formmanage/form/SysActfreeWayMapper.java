package com.myehr.mapper.formmanage.form;

import com.myehr.pojo.formmanage.form.SysActfreeWay;
import com.myehr.pojo.formmanage.form.SysActfreeWayExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysActfreeWayMapper {
    int countByExample(SysActfreeWayExample example);

    int deleteByExample(SysActfreeWayExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SysActfreeWay record);

    int insertSelective(SysActfreeWay record);

    List<SysActfreeWay> selectByExample(SysActfreeWayExample example);

    SysActfreeWay selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SysActfreeWay record, @Param("example") SysActfreeWayExample example);

    int updateByExample(@Param("record") SysActfreeWay record, @Param("example") SysActfreeWayExample example);

    int updateByPrimaryKeySelective(SysActfreeWay record);

    int updateByPrimaryKey(SysActfreeWay record);
}