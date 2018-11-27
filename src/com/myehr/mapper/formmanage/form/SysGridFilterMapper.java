package com.myehr.mapper.formmanage.form;

import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.myehr.pojo.formmanage.form.SysGridFilter;
import com.myehr.pojo.formmanage.form.SysGridFilterExample;

public interface SysGridFilterMapper {
    int countByExample(SysGridFilterExample example);

    int deleteByExample(SysGridFilterExample example);

    int deleteByPrimaryKey(BigDecimal gridFilterId);

    int insert(SysGridFilter record);

    int insertSelective(SysGridFilter record);

    List<SysGridFilter> selectByExample(SysGridFilterExample example);

    SysGridFilter selectByPrimaryKey(BigDecimal gridFilterId);

    int updateByExampleSelective(@Param("record") SysGridFilter record, @Param("example") SysGridFilterExample example);

    int updateByExample(@Param("record") SysGridFilter record, @Param("example") SysGridFilterExample example);

    int updateByPrimaryKeySelective(SysGridFilter record);

    int updateByPrimaryKey(SysGridFilter record);
}