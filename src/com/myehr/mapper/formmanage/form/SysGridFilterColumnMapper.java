package com.myehr.mapper.formmanage.form;

import com.myehr.pojo.formmanage.form.SysGridFilterColumn;
import com.myehr.pojo.formmanage.form.SysGridFilterColumnExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysGridFilterColumnMapper {
    int countByExample(SysGridFilterColumnExample example);

    int deleteByExample(SysGridFilterColumnExample example);

    int deleteByPrimaryKey(BigDecimal queryColumnId);

    int insert(SysGridFilterColumn record);

    int insertSelective(SysGridFilterColumn record);

    List<SysGridFilterColumn> selectByExample(SysGridFilterColumnExample example);

    SysGridFilterColumn selectByPrimaryKey(BigDecimal queryColumnId);

    int updateByExampleSelective(@Param("record") SysGridFilterColumn record, @Param("example") SysGridFilterColumnExample example);

    int updateByExample(@Param("record") SysGridFilterColumn record, @Param("example") SysGridFilterColumnExample example);

    int updateByPrimaryKeySelective(SysGridFilterColumn record);

    int updateByPrimaryKey(SysGridFilterColumn record);
}