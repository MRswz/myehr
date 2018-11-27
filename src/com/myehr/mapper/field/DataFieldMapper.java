package com.myehr.mapper.field;

import com.myehr.pojo.field.DataField;
import com.myehr.pojo.field.DataFieldExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DataFieldMapper {
    int countByExample(DataFieldExample example);

    int deleteByExample(DataFieldExample example);

    int deleteByPrimaryKey(Integer dtId);

    int insert(DataField record);

    int insertSelective(DataField record);

    List<DataField> selectByExample(DataFieldExample example);

    DataField selectByPrimaryKey(Integer dtId);

    int updateByExampleSelective(@Param("record") DataField record, @Param("example") DataFieldExample example);

    int updateByExample(@Param("record") DataField record, @Param("example") DataFieldExample example);

    int updateByPrimaryKeySelective(DataField record);

    int updateByPrimaryKey(DataField record);
}